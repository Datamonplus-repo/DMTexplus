package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tinccresultados_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4032CCOpeCod = (int)(GXutil.lval( httpContext.GetPar( "CCOpeCod"))) ;
         n4032CCOpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         AV38Ok_ope = (byte)(GXutil.lval( httpContext.GetPar( "Ok_ope"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ok_ope", GXutil.str( AV38Ok_ope, 1, 0));
         AV37OpeSecc = httpContext.GetPar( "OpeSecc") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37OpeSecc", AV37OpeSecc);
         A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         AV34Ok_s = httpContext.GetPar( "Ok_s") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Ok_s", AV34Ok_s);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_1NM619( A396EmprCod, A4032CCOpeCod, AV38Ok_ope, AV37OpeSecc, A603MaqCodBis, AV34Ok_s) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4035CCVal = httpContext.GetPar( "CCVal") ;
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         AV33Ok = (byte)(GXutil.lval( httpContext.GetPar( "Ok"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", GXutil.str( AV33Ok, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_1NM620( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4035CCVal, A4034CCTLin, AV33Ok) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV55Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV39Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Inc_obs", AV39Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A4035CCVal = httpContext.GetPar( "CCVal") ;
         AV35OldCcVal = httpContext.GetPar( "OldCcVal") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldCcVal", AV35OldCcVal);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_38_1NM620( A396EmprCod, AV55Pgmname, AV8UsurCod, AV12Station, AV39Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A4035CCVal, AV35OldCcVal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"CCFOK") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaccfok1NM619( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel28"+"_"+"CCTVALD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx28asacctvald1NM620( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_40( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_41") == 0 )
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
         gxload_41( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_46( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_42( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_45( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_44") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_44( A396EmprCod, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_48") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_48( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV40BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40BarCod), "ZZZZZZZ9")));
            AV41BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarCodReo", GXutil.str( AV41BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41BarCodReo), "9")));
            AV42BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodPar", AV42BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42BarCodPar, ""))));
            AV43ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43ProCod, ""))));
            AV44BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarOrdLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarOrdLin), "ZZZ9")));
            AV45CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CCTCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45CCTCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INCCResultados", ""), (short)(0)) ;
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

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_181 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_181"))) ;
      nGXsfl_181_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_181_idx"))) ;
      sGXsfl_181_idx = httpContext.GetPar( "sGXsfl_181_idx") ;
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

   public tinccresultados_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tinccresultados_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinccresultados_impl.class ));
   }

   public tinccresultados_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e111NM2 ();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarOrdLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarOrdLin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarOrdLin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTCod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCOpeCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCOpeCod_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOpeCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFch_Internalname, localUtil.format(A4033CCFch, "99/99/99"), localUtil.format( A4033CCFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcDisp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCcDisp_Internalname, httpContext.getMessage( "Disparador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcDisp_Internalname, GXutil.rtrim( A4405CcDisp), GXutil.rtrim( localUtil.format( A4405CcDisp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcDisp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCcDisp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCcObs_Internalname, httpContext.getMessage( "Obs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCcObs_Internalname, A3281CcObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtCcObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTDsc_Internalname, httpContext.getMessage( "Descripción del Test", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarGraAca_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarGraAca_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarGraAca2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarGraAca2_Internalname, httpContext.getMessage( "Gramaje Acabado 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarEncAnh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarEncAnh_Internalname, httpContext.getMessage( "Encogimiento: Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncAnh_Enabled!=0) ? localUtil.format( A1224BarEncAnh, "999.99") : localUtil.format( A1224BarEncAnh, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncAnh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarEncAnh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarEncCom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarEncCom_Internalname, httpContext.getMessage( "Encogimiento: Comprimido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncCom_Enabled!=0) ? localUtil.format( A1223BarEncCom, "999.99") : localUtil.format( A1223BarEncCom, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarEncCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarRdoA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarRdoA_Internalname, httpContext.getMessage( "Rendimiento en Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarRdoA_Enabled!=0) ? localUtil.format( A1911BarRdoA, "ZZ9.99") : localUtil.format( A1911BarRdoA, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarRdoA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAncAca1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAncAca1_Internalname, httpContext.getMessage( "Ancho Acabado 1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca1_Internalname, GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAncAca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAncAca2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAncAca2_Internalname, httpContext.getMessage( "Ancho Acabado 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAncAca2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCodBis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCodBis_Internalname, httpContext.getMessage( "MaqCodBis", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis), GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodBis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCodBis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSerDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSerDsc_Internalname, httpContext.getMessage( "Descripción Serie", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNum_Internalname, httpContext.getMessage( "Numero del Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCol_Internalname, httpContext.getMessage( "Codigo TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarEncCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarEncCli_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipArt_Internalname, httpContext.getMessage( "Codigo Tipo Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipArt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarItem5_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarItem5_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarItem5_Internalname, GXutil.rtrim( A9789BarItem5), GXutil.rtrim( localUtil.format( A9789BarItem5, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarItem5_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarItem5_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAcaAnh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAcaAnh_Internalname, httpContext.getMessage( "Caderno encargos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcaAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAcaAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcaAnh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAcaAnh_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TINCCResultados.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV55Pgmname), GXutil.rtrim( localUtil.format( AV55Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TINCCResultados.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol181( ) ;
      nGXsfl_181_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount620 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_620 = (short)(1) ;
            scanStart1NM620( ) ;
            while ( RcdFound620 != 0 )
            {
               init_level_properties620( ) ;
               getByPrimaryKey1NM620( ) ;
               addRow1NM620( ) ;
               scanNext1NM620( ) ;
            }
            scanEnd1NM620( ) ;
            nBlankRcdCount620 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NM620( ) ;
         standaloneModal1NM620( ) ;
         sMode620 = Gx_mode ;
         while ( nGXsfl_181_idx < nRC_GXsfl_181 )
         {
            bGXsfl_181_Refreshing = true ;
            readRow1NM620( ) ;
            edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCTValD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALD_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCOkLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKLIN_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCOkDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKDSC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCMetodo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCMETODO_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCMetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCMetodo_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCEspecif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCESPECIF_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCEspecif_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            if ( ( nRcdExists_620 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NM620( ) ;
            }
            sendRow1NM620( ) ;
            bGXsfl_181_Refreshing = false ;
         }
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount620 = (short)(5) ;
         nRcdExists_620 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NM620( ) ;
            while ( RcdFound620 != 0 )
            {
               sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_181620( ) ;
               init_level_properties620( ) ;
               standaloneNotModal1NM620( ) ;
               getByPrimaryKey1NM620( ) ;
               standaloneModal1NM620( ) ;
               addRow1NM620( ) ;
               scanNext1NM620( ) ;
            }
            scanEnd1NM620( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode620 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_181620( ) ;
         initAll1NM620( ) ;
         init_level_properties620( ) ;
         nRcdExists_620 = (short)(0) ;
         nIsMod_620 = (short)(0) ;
         nRcdDeleted_620 = (short)(0) ;
         nBlankRcdCount620 = (short)(nBlankRcdUsr620+nBlankRcdCount620) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount620 > 0 )
         {
            standaloneNotModal1NM620( ) ;
            standaloneModal1NM620( ) ;
            addRow1NM620( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCCTLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount620 = (short)(nBlankRcdCount620-1) ;
         }
         Gx_mode = sMode620 ;
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
      e121NM2 ();
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
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4032CCOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4033CCFch = localUtil.ctod( httpContext.cgiGet( "Z4033CCFch"), 0) ;
            Z4405CcDisp = httpContext.cgiGet( "Z4405CcDisp") ;
            Z3281CcObs = httpContext.cgiGet( "Z3281CcObs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_181 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_181"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14418CCfOk = (byte)(localUtil.ctol( httpContext.cgiGet( "CCFOK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV40BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV43ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV44BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "vBARORDLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Ok_s = httpContext.cgiGet( "vOK_S") ;
            AV37OpeSecc = httpContext.cgiGet( "vOPESECC") ;
            AV38Ok_ope = (byte)(localUtil.ctol( httpContext.cgiGet( "vOK_OPE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35OldCcVal = httpContext.cgiGet( "vOLDCCVAL") ;
            AV39Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV33Ok = (byte)(localUtil.ctol( httpContext.cgiGet( "vOK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            A14489CCEspecif2 = httpContext.cgiGet( "CCESPECIF2") ;
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
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARORDLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarOrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A194BarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            else
            {
               A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4031CCTCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            else
            {
               A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4032CCOpeCod = 0 ;
               n4032CCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
            }
            else
            {
               A4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4032CCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCCFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4033CCFch = GXutil.nullDate() ;
               n4033CCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
            }
            else
            {
               A4033CCFch = localUtil.ctod( httpContext.cgiGet( edtCCFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4033CCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
            }
            A4405CcDisp = httpContext.cgiGet( edtCcDisp_Internalname) ;
            n4405CcDisp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
            A3281CcObs = httpContext.cgiGet( edtCcObs_Internalname) ;
            n3281CcObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
            A1909BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
            A3137BarGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
            A1224BarEncAnh = localUtil.ctond( httpContext.cgiGet( edtBarEncAnh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
            A1223BarEncCom = localUtil.ctond( httpContext.cgiGet( edtBarEncCom_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
            A1911BarRdoA = localUtil.ctond( httpContext.cgiGet( edtBarRdoA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
            A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
            A126BarAncAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n217BarTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A9789BarItem5 = httpContext.cgiGet( edtBarItem5_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
            A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
            AV55Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TINCCResultados");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV55Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV55Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\tinccresultados:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
                  sMode619 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode619 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound619 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1NM0( ) ;
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
                        e121NM2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131NM2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111NM2 ();
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
         e131NM2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1NM619( ) ;
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
         disableAttributes1NM619( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_1NM0( )
   {
      beforeValidate1NM619( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NM619( ) ;
         }
         else
         {
            checkExtendedTable1NM619( ) ;
            closeExtendedTableCursors1NM619( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode619 = Gx_mode ;
         confirm_1NM620( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode619 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1NM620( )
   {
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRow1NM620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            getKey1NM620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               if ( RcdFound620 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NM620( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NM620( ) ;
                     closeExtendedTableCursors1NM620( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTLIN_" + sGXsfl_181_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound620 != 0 )
               {
                  if ( nRcdDeleted_620 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NM620( ) ;
                     load1NM620( ) ;
                     beforeValidate1NM620( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NM620( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NM620( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NM620( ) ;
                           closeExtendedTableCursors1NM620( ) ;
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
                  if ( nRcdDeleted_620 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCTValD_Internalname, A5627CCTValD) ;
         httpContext.changePostValue( edtCCOkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCOkDsc_Internalname, A12751CCOkDsc) ;
         httpContext.changePostValue( edtCCMetodo_Internalname, GXutil.rtrim( A13251CCMetodo)) ;
         httpContext.changePostValue( edtCCEspecif_Internalname, GXutil.rtrim( A13252CCEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_181_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_181_idx, Z12751CCOkDsc) ;
         httpContext.changePostValue( "ZT_"+"Z13251CCMetodo_"+sGXsfl_181_idx, GXutil.rtrim( Z13251CCMetodo)) ;
         httpContext.changePostValue( "ZT_"+"Z13252CCEspecif_"+sGXsfl_181_idx, GXutil.rtrim( Z13252CCEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z14489CCEspecif2_"+sGXsfl_181_idx, Z14489CCEspecif2) ;
         httpContext.changePostValue( "T4035CCVal_"+sGXsfl_181_idx, GXutil.rtrim( O4035CCVal)) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALD_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKLIN_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKDSC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCMETODO_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCESPECIF_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NM0( )
   {
   }

   public void e121NM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tinccresultados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV55Pgmname, (byte)(99), GXv_char2) ;
      tinccresultados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tinccresultados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tinccresultados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tinccresultados_impl.this.AV32EmprCod = GXv_char2[0] ;
      tinccresultados_impl.this.AV11EmprNom = GXv_char3[0] ;
      tinccresultados_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tinccresultados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tinccresultados_impl.this.AV32EmprCod = GXv_char4[0] ;
      tinccresultados_impl.this.AV11EmprNom = GXv_char3[0] ;
      tinccresultados_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV46WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV46WWPContext = GXv_SdtWWPContext5[0] ;
      AV47TrnContext.fromxml(AV48WebSession.getValue("TrnContext"), null, null);
   }

   public void e131NM2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV47TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.controlcalidadhtd.tinccresultadosww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111NM2 ();
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
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111NM2( )
   {
      /* Exit Routine */
      returnInSub = false ;
   }

   public void zm1NM619( int GX_JID )
   {
      if ( ( GX_JID == 39 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4032CCOpeCod = T01NM6_A4032CCOpeCod[0] ;
            Z4033CCFch = T01NM6_A4033CCFch[0] ;
            Z4405CcDisp = T01NM6_A4405CcDisp[0] ;
            Z3281CcObs = T01NM6_A3281CcObs[0] ;
         }
         else
         {
            Z4032CCOpeCod = A4032CCOpeCod ;
            Z4033CCFch = A4033CCFch ;
            Z4405CcDisp = A4405CcDisp ;
            Z3281CcObs = A3281CcObs ;
         }
      }
      if ( GX_JID == -39 )
      {
         Z4032CCOpeCod = A4032CCOpeCod ;
         Z4033CCFch = A4033CCFch ;
         Z4405CcDisp = A4405CcDisp ;
         Z3281CcObs = A3281CcObs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z407EmprNom = A407EmprNom ;
         Z1909BarGraAca = A1909BarGraAca ;
         Z3137BarGraAca2 = A3137BarGraAca2 ;
         Z1224BarEncAnh = A1224BarEncAnh ;
         Z1223BarEncCom = A1223BarEncCom ;
         Z1911BarRdoA = A1911BarRdoA ;
         Z125BarAncAca1 = A125BarAncAca1 ;
         Z126BarAncAca2 = A126BarAncAca2 ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z9789BarItem5 = A9789BarItem5 ;
         Z4466BarAcaAnh = A4466BarAcaAnh ;
         Z252CliCod = A252CliCod ;
         Z217BarTipArt = A217BarTipArt ;
         Z279CliNom = A279CliNom ;
         Z759ProDsc = A759ProDsc ;
         Z457FasCod = A457FasCod ;
         Z603MaqCodBis = A603MaqCodBis ;
         Z460FasDsc = A460FasDsc ;
         Z4036CCTDsc = A4036CCTDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), true);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), true);
      AV55Pgmname = "ControlCalidadHTD.TINCCResultados" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), true);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
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
      if ( ! (0==AV40BarCod) )
      {
         A129BarCod = AV40BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV40BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV40BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV41BarCodReo) )
      {
         A132BarCodReo = AV41BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV41BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV41BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV42BarCodPar)==0) )
      {
         A130BarCodPar = AV42BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV42BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV42BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV43ProCod)==0) )
      {
         A758ProCod = AV43ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV43ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV43ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV44BarOrdLin) )
      {
         A194BarOrdLin = AV44BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
      if ( ! (0==AV44BarOrdLin) )
      {
         edtBarOrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      }
      else
      {
         edtBarOrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV44BarOrdLin) )
      {
         edtBarOrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV45CCTCod) )
      {
         A4031CCTCod = AV45CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      if ( ! (0==AV45CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV45CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
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
         /* Using cursor T01NM7 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         A407EmprNom = T01NM7_A407EmprNom[0] ;
         n407EmprNom = T01NM7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
         /* Using cursor T01NM8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A1909BarGraAca = T01NM8_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A3137BarGraAca2 = T01NM8_A3137BarGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
         A1224BarEncAnh = T01NM8_A1224BarEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
         A1223BarEncCom = T01NM8_A1223BarEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
         A1911BarRdoA = T01NM8_A1911BarRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
         A125BarAncAca1 = T01NM8_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A126BarAncAca2 = T01NM8_A126BarAncAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
         A212BarSer = T01NM8_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01NM8_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = T01NM8_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01NM8_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01NM8_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A4812BarEncCli = T01NM8_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A9789BarItem5 = T01NM8_A9789BarItem5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
         A4466BarAcaAnh = T01NM8_A4466BarAcaAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         A252CliCod = T01NM8_A252CliCod[0] ;
         n252CliCod = T01NM8_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A217BarTipArt = T01NM8_A217BarTipArt[0] ;
         n217BarTipArt = T01NM8_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         pr_default.close(6);
         /* Using cursor T01NM13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01NM13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(11);
         /* Using cursor T01NM9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01NM9_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(7);
         /* Using cursor T01NM10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         A457FasCod = T01NM10_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T01NM10_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         pr_default.close(8);
         /* Using cursor T01NM12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01NM12_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(10);
         /* Using cursor T01NM11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01NM11_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         pr_default.close(9);
         GXt_int6 = A14418CCfOk ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A758ProCod ;
         GXv_int9[0] = A194BarOrdLin ;
         GXv_int10[0] = A4031CCTCod ;
         GXv_int11[0] = GXt_int6 ;
         new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_char2, GXv_int9, GXv_int10, GXv_int11) ;
         tinccresultados_impl.this.A396EmprCod = GXv_char4[0] ;
         tinccresultados_impl.this.A129BarCod = GXv_int7[0] ;
         tinccresultados_impl.this.A132BarCodReo = GXv_int8[0] ;
         tinccresultados_impl.this.A130BarCodPar = GXv_char3[0] ;
         tinccresultados_impl.this.A758ProCod = GXv_char2[0] ;
         tinccresultados_impl.this.A194BarOrdLin = GXv_int9[0] ;
         tinccresultados_impl.this.A4031CCTCod = GXv_int10[0] ;
         tinccresultados_impl.this.GXt_int6 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A14418CCfOk = GXt_int6 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14418CCfOk", GXutil.str( A14418CCfOk, 1, 0));
      }
   }

   public void load1NM619( )
   {
      /* Using cursor T01NM14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A407EmprNom = T01NM14_A407EmprNom[0] ;
         n407EmprNom = T01NM14_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4032CCOpeCod = T01NM14_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T01NM14_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T01NM14_A4033CCFch[0] ;
         n4033CCFch = T01NM14_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T01NM14_A4405CcDisp[0] ;
         n4405CcDisp = T01NM14_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T01NM14_A3281CcObs[0] ;
         n3281CcObs = T01NM14_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A460FasDsc = T01NM14_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A759ProDsc = T01NM14_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4036CCTDsc = T01NM14_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A1909BarGraAca = T01NM14_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A3137BarGraAca2 = T01NM14_A3137BarGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
         A1224BarEncAnh = T01NM14_A1224BarEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
         A1223BarEncCom = T01NM14_A1223BarEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
         A1911BarRdoA = T01NM14_A1911BarRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
         A125BarAncAca1 = T01NM14_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A126BarAncAca2 = T01NM14_A126BarAncAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
         A212BarSer = T01NM14_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01NM14_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = T01NM14_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01NM14_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01NM14_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A4812BarEncCli = T01NM14_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A279CliNom = T01NM14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A9789BarItem5 = T01NM14_A9789BarItem5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
         A4466BarAcaAnh = T01NM14_A4466BarAcaAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         A457FasCod = T01NM14_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T01NM14_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         A252CliCod = T01NM14_A252CliCod[0] ;
         n252CliCod = T01NM14_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A217BarTipArt = T01NM14_A217BarTipArt[0] ;
         n217BarTipArt = T01NM14_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         zm1NM619( -39) ;
      }
      pr_default.close(12);
      onLoadActions1NM619( ) ;
   }

   public void onLoadActions1NM619( )
   {
      GXt_int6 = A14418CCfOk ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int11[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A758ProCod ;
      GXv_int9[0] = A194BarOrdLin ;
      GXv_int7[0] = A4031CCTCod ;
      GXv_int8[0] = GXt_int6 ;
      new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2, GXv_int9, GXv_int7, GXv_int8) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char4[0] ;
      tinccresultados_impl.this.A129BarCod = GXv_int10[0] ;
      tinccresultados_impl.this.A132BarCodReo = GXv_int11[0] ;
      tinccresultados_impl.this.A130BarCodPar = GXv_char3[0] ;
      tinccresultados_impl.this.A758ProCod = GXv_char2[0] ;
      tinccresultados_impl.this.A194BarOrdLin = GXv_int9[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int7[0] ;
      tinccresultados_impl.this.GXt_int6 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A14418CCfOk = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14418CCfOk", GXutil.str( A14418CCfOk, 1, 0));
   }

   public void checkExtendedTable1NM619( )
   {
      nIsDirty_619 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01NM7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01NM7_A407EmprNom[0] ;
      n407EmprNom = T01NM7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01NM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1909BarGraAca = T01NM8_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A3137BarGraAca2 = T01NM8_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A1224BarEncAnh = T01NM8_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A1223BarEncCom = T01NM8_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1911BarRdoA = T01NM8_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A125BarAncAca1 = T01NM8_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A126BarAncAca2 = T01NM8_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A212BarSer = T01NM8_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T01NM8_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T01NM8_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01NM8_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01NM8_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A4812BarEncCli = T01NM8_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A9789BarItem5 = T01NM8_A9789BarItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
      A4466BarAcaAnh = T01NM8_A4466BarAcaAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A252CliCod = T01NM8_A252CliCod[0] ;
      n252CliCod = T01NM8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A217BarTipArt = T01NM8_A217BarTipArt[0] ;
      n217BarTipArt = T01NM8_n217BarTipArt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      pr_default.close(6);
      /* Using cursor T01NM13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T01NM13_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(11);
      /* Using cursor T01NM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01NM9_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(7);
      /* Using cursor T01NM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A457FasCod = T01NM10_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A603MaqCodBis = T01NM10_A603MaqCodBis[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      pr_default.close(8);
      /* Using cursor T01NM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01NM12_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(10);
      /* Using cursor T01NM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01NM11_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(9);
      nIsDirty_619 = (short)(1) ;
      GXt_int6 = A14418CCfOk ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int11[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A758ProCod ;
      GXv_int9[0] = A194BarOrdLin ;
      GXv_int7[0] = A4031CCTCod ;
      GXv_int8[0] = GXt_int6 ;
      new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2, GXv_int9, GXv_int7, GXv_int8) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char4[0] ;
      tinccresultados_impl.this.A129BarCod = GXv_int10[0] ;
      tinccresultados_impl.this.A132BarCodReo = GXv_int11[0] ;
      tinccresultados_impl.this.A130BarCodPar = GXv_char3[0] ;
      tinccresultados_impl.this.A758ProCod = GXv_char2[0] ;
      tinccresultados_impl.this.A194BarOrdLin = GXv_int9[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int7[0] ;
      tinccresultados_impl.this.GXt_int6 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A14418CCfOk = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14418CCfOk", GXutil.str( A14418CCfOk, 1, 0));
   }

   public void closeExtendedTableCursors1NM619( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(11);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(10);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_40( String A396EmprCod )
   {
      /* Using cursor T01NM15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01NM15_A407EmprNom[0] ;
      n407EmprNom = T01NM15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_41( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01NM16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1909BarGraAca = T01NM16_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A3137BarGraAca2 = T01NM16_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A1224BarEncAnh = T01NM16_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A1223BarEncCom = T01NM16_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1911BarRdoA = T01NM16_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A125BarAncAca1 = T01NM16_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A126BarAncAca2 = T01NM16_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A212BarSer = T01NM16_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T01NM16_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T01NM16_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01NM16_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01NM16_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A4812BarEncCli = T01NM16_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A9789BarItem5 = T01NM16_A9789BarItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
      A4466BarAcaAnh = T01NM16_A4466BarAcaAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A252CliCod = T01NM16_A252CliCod[0] ;
      n252CliCod = T01NM16_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A217BarTipArt = T01NM16_A217BarTipArt[0] ;
      n217BarTipArt = T01NM16_n217BarTipArt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4812BarEncCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9789BarItem5))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_46( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01NM17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T01NM17_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_42( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01NM18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01NM18_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_43( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A758ProCod ,
                          short A194BarOrdLin )
   {
      /* Using cursor T01NM19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A457FasCod = T01NM19_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A603MaqCodBis = T01NM19_A603MaqCodBis[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A603MaqCodBis))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_45( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01NM20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01NM20_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_44( String A396EmprCod ,
                          int A4031CCTCod )
   {
      /* Using cursor T01NM21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01NM21_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1NM619( )
   {
      /* Using cursor T01NM22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
      else
      {
         RcdFound619 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1NM619( 39) ;
         RcdFound619 = (short)(1) ;
         A4032CCOpeCod = T01NM6_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T01NM6_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T01NM6_A4033CCFch[0] ;
         n4033CCFch = T01NM6_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T01NM6_A4405CcDisp[0] ;
         n4405CcDisp = T01NM6_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T01NM6_A3281CcObs[0] ;
         n3281CcObs = T01NM6_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A396EmprCod = T01NM6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01NM6_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01NM6_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01NM6_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01NM6_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01NM6_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T01NM6_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NM619( ) ;
         if ( AnyError == 1 )
         {
            RcdFound619 = (short)(0) ;
            initializeNonKey1NM619( ) ;
         }
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound619 = (short)(0) ;
         initializeNonKey1NM619( ) ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1NM619( ) ;
      if ( RcdFound619 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound619 = (short)(0) ;
      /* Using cursor T01NM23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A129BarCod[0] < A129BarCod ) || ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A132BarCodReo[0] < A132BarCodReo ) || ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM23_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01NM23_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A194BarOrdLin[0] < A194BarOrdLin ) || ( T01NM23_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01NM23_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A129BarCod[0] > A129BarCod ) || ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A132BarCodReo[0] > A132BarCodReo ) || ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM23_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01NM23_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A194BarOrdLin[0] > A194BarOrdLin ) || ( T01NM23_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01NM23_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM23_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM23_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            A396EmprCod = T01NM23_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01NM23_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01NM23_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01NM23_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01NM23_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01NM23_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = T01NM23_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound619 = (short)(0) ;
      /* Using cursor T01NM24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A129BarCod[0] > A129BarCod ) || ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A132BarCodReo[0] > A132BarCodReo ) || ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM24_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01NM24_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A194BarOrdLin[0] > A194BarOrdLin ) || ( T01NM24_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01NM24_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A129BarCod[0] < A129BarCod ) || ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A132BarCodReo[0] < A132BarCodReo ) || ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01NM24_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01NM24_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A194BarOrdLin[0] < A194BarOrdLin ) || ( T01NM24_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01NM24_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01NM24_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NM24_A132BarCodReo[0] == A132BarCodReo ) && ( T01NM24_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01NM24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NM24_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            A396EmprCod = T01NM24_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01NM24_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01NM24_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01NM24_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01NM24_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01NM24_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = T01NM24_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NM619( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1NM619( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound619 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = Z194BarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1NM619( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1NM619( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1NM619( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = Z194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1NM619( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z4032CCOpeCod != T01NM5_A4032CCOpeCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01NM5_A4033CCFch[0])) ) || ( GXutil.strcmp(Z4405CcDisp, T01NM5_A4405CcDisp[0]) != 0 ) || ( GXutil.strcmp(Z3281CcObs, T01NM5_A3281CcObs[0]) != 0 ) )
         {
            if ( Z4032CCOpeCod != T01NM5_A4032CCOpeCod[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCOpeCod");
               GXutil.writeLogRaw("Old: ",Z4032CCOpeCod);
               GXutil.writeLogRaw("Current: ",T01NM5_A4032CCOpeCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01NM5_A4033CCFch[0])) ) )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCFch");
               GXutil.writeLogRaw("Old: ",Z4033CCFch);
               GXutil.writeLogRaw("Current: ",T01NM5_A4033CCFch[0]);
            }
            if ( GXutil.strcmp(Z4405CcDisp, T01NM5_A4405CcDisp[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CcDisp");
               GXutil.writeLogRaw("Old: ",Z4405CcDisp);
               GXutil.writeLogRaw("Current: ",T01NM5_A4405CcDisp[0]);
            }
            if ( GXutil.strcmp(Z3281CcObs, T01NM5_A3281CcObs[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CcObs");
               GXutil.writeLogRaw("Old: ",Z3281CcObs);
               GXutil.writeLogRaw("Current: ",T01NM5_A3281CcObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NM619( )
   {
      beforeValidate1NM619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NM619( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NM619( 0) ;
         checkOptimisticConcurrency1NM619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NM619( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NM619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NM25 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(23) == 1) )
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
                        processLevel1NM619( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1NM0( ) ;
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
            load1NM619( ) ;
         }
         endLevel1NM619( ) ;
      }
      closeExtendedTableCursors1NM619( ) ;
   }

   public void update1NM619( )
   {
      beforeValidate1NM619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NM619( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NM619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NM619( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NM619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NM26 */
                  pr_default.execute(24, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(24) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NM619( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NM619( ) ;
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
         endLevel1NM619( ) ;
      }
      closeExtendedTableCursors1NM619( ) ;
   }

   public void deferredUpdate1NM619( )
   {
   }

   public void delete( )
   {
      beforeValidate1NM619( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NM619( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NM619( ) ;
         afterConfirm1NM619( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NM619( ) ;
            if ( AnyError == 0 )
            {
               scanStart1NM620( ) ;
               while ( RcdFound620 != 0 )
               {
                  getByPrimaryKey1NM620( ) ;
                  delete1NM620( ) ;
                  scanNext1NM620( ) ;
               }
               scanEnd1NM620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NM27 */
                  pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
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
      sMode619 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NM619( ) ;
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NM619( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NM28 */
         pr_default.execute(26, new Object[] {A396EmprCod});
         A407EmprNom = T01NM28_A407EmprNom[0] ;
         n407EmprNom = T01NM28_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(26);
         /* Using cursor T01NM29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A1909BarGraAca = T01NM29_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A3137BarGraAca2 = T01NM29_A3137BarGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
         A1224BarEncAnh = T01NM29_A1224BarEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
         A1223BarEncCom = T01NM29_A1223BarEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
         A1911BarRdoA = T01NM29_A1911BarRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
         A125BarAncAca1 = T01NM29_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A126BarAncAca2 = T01NM29_A126BarAncAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
         A212BarSer = T01NM29_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01NM29_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = T01NM29_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01NM29_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01NM29_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A4812BarEncCli = T01NM29_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A9789BarItem5 = T01NM29_A9789BarItem5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
         A4466BarAcaAnh = T01NM29_A4466BarAcaAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         A252CliCod = T01NM29_A252CliCod[0] ;
         n252CliCod = T01NM29_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A217BarTipArt = T01NM29_A217BarTipArt[0] ;
         n217BarTipArt = T01NM29_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         pr_default.close(27);
         /* Using cursor T01NM30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01NM30_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(28);
         /* Using cursor T01NM31 */
         pr_default.execute(29, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01NM31_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(29);
         /* Using cursor T01NM32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         A457FasCod = T01NM32_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T01NM32_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         pr_default.close(30);
         /* Using cursor T01NM33 */
         pr_default.execute(31, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01NM33_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(31);
         /* Using cursor T01NM34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01NM34_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         pr_default.close(32);
         GXt_int6 = A14418CCfOk ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A758ProCod ;
         GXv_int9[0] = A194BarOrdLin ;
         GXv_int7[0] = A4031CCTCod ;
         GXv_int8[0] = GXt_int6 ;
         new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2, GXv_int9, GXv_int7, GXv_int8) ;
         tinccresultados_impl.this.A396EmprCod = GXv_char4[0] ;
         tinccresultados_impl.this.A129BarCod = GXv_int10[0] ;
         tinccresultados_impl.this.A132BarCodReo = GXv_int11[0] ;
         tinccresultados_impl.this.A130BarCodPar = GXv_char3[0] ;
         tinccresultados_impl.this.A758ProCod = GXv_char2[0] ;
         tinccresultados_impl.this.A194BarOrdLin = GXv_int9[0] ;
         tinccresultados_impl.this.A4031CCTCod = GXv_int7[0] ;
         tinccresultados_impl.this.GXt_int6 = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A14418CCfOk = GXt_int6 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14418CCfOk", GXutil.str( A14418CCfOk, 1, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01NM35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Nveces Test", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void processNestedLevel1NM620( )
   {
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRow1NM620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            standaloneNotModal1NM620( ) ;
            getKey1NM620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NM620( ) ;
            }
            else
            {
               if ( RcdFound620 != 0 )
               {
                  if ( ( nRcdDeleted_620 != 0 ) && ( nRcdExists_620 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NM620( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NM620( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_620 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCTValD_Internalname, A5627CCTValD) ;
         httpContext.changePostValue( edtCCOkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCOkDsc_Internalname, A12751CCOkDsc) ;
         httpContext.changePostValue( edtCCMetodo_Internalname, GXutil.rtrim( A13251CCMetodo)) ;
         httpContext.changePostValue( edtCCEspecif_Internalname, GXutil.rtrim( A13252CCEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_181_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_181_idx, Z12751CCOkDsc) ;
         httpContext.changePostValue( "ZT_"+"Z13251CCMetodo_"+sGXsfl_181_idx, GXutil.rtrim( Z13251CCMetodo)) ;
         httpContext.changePostValue( "ZT_"+"Z13252CCEspecif_"+sGXsfl_181_idx, GXutil.rtrim( Z13252CCEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z14489CCEspecif2_"+sGXsfl_181_idx, Z14489CCEspecif2) ;
         httpContext.changePostValue( "T4035CCVal_"+sGXsfl_181_idx, GXutil.rtrim( O4035CCVal)) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALD_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKLIN_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKDSC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCMETODO_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCESPECIF_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NM620( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_620 = (short)(0) ;
      nIsMod_620 = (short)(0) ;
      nRcdDeleted_620 = (short)(0) ;
   }

   public void processLevel1NM619( )
   {
      /* Save parent mode. */
      sMode619 = Gx_mode ;
      processNestedLevel1NM620( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NM619( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NM619( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tinccresultados");
         if ( AnyError == 0 )
         {
            confirmValues1NM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tinccresultados");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NM619( )
   {
      /* Scan By routine */
      /* Using cursor T01NM36 */
      pr_default.execute(34);
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A396EmprCod = T01NM36_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01NM36_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01NM36_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01NM36_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01NM36_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01NM36_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T01NM36_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NM619( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A396EmprCod = T01NM36_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01NM36_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01NM36_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01NM36_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01NM36_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01NM36_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T01NM36_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void scanEnd1NM619( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1NM619( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A4032CCOpeCod ;
         GXv_char3[0] = " " ;
         GXv_int11[0] = AV38Ok_ope ;
         GXv_char2[0] = AV37OpeSecc ;
         GXv_char12[0] = A603MaqCodBis ;
         GXv_char13[0] = AV34Ok_s ;
         new app.pbusopes(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_int11, GXv_char2, GXv_char12, GXv_char13) ;
         tinccresultados_impl.this.A396EmprCod = GXv_char4[0] ;
         tinccresultados_impl.this.A4032CCOpeCod = GXv_int10[0] ;
         tinccresultados_impl.this.AV38Ok_ope = GXv_int11[0] ;
         tinccresultados_impl.this.AV37OpeSecc = GXv_char2[0] ;
         tinccresultados_impl.this.A603MaqCodBis = GXv_char12[0] ;
         tinccresultados_impl.this.AV34Ok_s = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ok_ope", GXutil.str( AV38Ok_ope, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV37OpeSecc", AV37OpeSecc);
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         httpContext.ajax_rsp_assign_attri("", false, "AV34Ok_s", AV34Ok_s);
      }
      if ( true /* Level */ && true /* After */ && ( AV38Ok_ope == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Operario¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1NM619( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NM619( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NM619( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NM619( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NM619( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NM619( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOpeCod_Enabled), 5, 0), true);
      edtCCFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFch_Enabled), 5, 0), true);
      edtCcDisp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcDisp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcDisp_Enabled), 5, 0), true);
      edtCcObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcObs_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), true);
      edtBarGraAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca2_Enabled), 5, 0), true);
      edtBarEncAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncAnh_Enabled), 5, 0), true);
      edtBarEncCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCom_Enabled), 5, 0), true);
      edtBarRdoA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRdoA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRdoA_Enabled), 5, 0), true);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), true);
      edtBarAncAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca2_Enabled), 5, 0), true);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), true);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarItem5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarItem5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarItem5_Enabled), 5, 0), true);
      edtBarAcaAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1NM620( int GX_JID )
   {
      if ( ( GX_JID == 47 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4035CCVal = T01NM3_A4035CCVal[0] ;
            Z12750CCOkLin = T01NM3_A12750CCOkLin[0] ;
            Z12751CCOkDsc = T01NM3_A12751CCOkDsc[0] ;
            Z13251CCMetodo = T01NM3_A13251CCMetodo[0] ;
            Z13252CCEspecif = T01NM3_A13252CCEspecif[0] ;
            Z14489CCEspecif2 = T01NM3_A14489CCEspecif2[0] ;
         }
         else
         {
            Z4035CCVal = A4035CCVal ;
            Z12750CCOkLin = A12750CCOkLin ;
            Z12751CCOkDsc = A12751CCOkDsc ;
            Z13251CCMetodo = A13251CCMetodo ;
            Z13252CCEspecif = A13252CCEspecif ;
            Z14489CCEspecif2 = A14489CCEspecif2 ;
         }
      }
      if ( GX_JID == -47 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4035CCVal = A4035CCVal ;
         Z12750CCOkLin = A12750CCOkLin ;
         Z12751CCOkDsc = A12751CCOkDsc ;
         Z13251CCMetodo = A13251CCMetodo ;
         Z13252CCEspecif = A13252CCEspecif ;
         Z14489CCEspecif2 = A14489CCEspecif2 ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z758ProCod = A758ProCod ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
      }
   }

   public void standaloneNotModal1NM620( )
   {
      edtCCTValD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCOkDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCOkLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void standaloneModal1NM620( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         edtCCTLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
   }

   public void load1NM620( )
   {
      /* Using cursor T01NM37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4043CCTLinDsc = T01NM37_A4043CCTLinDsc[0] ;
         A4035CCVal = T01NM37_A4035CCVal[0] ;
         A12750CCOkLin = T01NM37_A12750CCOkLin[0] ;
         A12751CCOkDsc = T01NM37_A12751CCOkDsc[0] ;
         A13251CCMetodo = T01NM37_A13251CCMetodo[0] ;
         A13252CCEspecif = T01NM37_A13252CCEspecif[0] ;
         A14489CCEspecif2 = T01NM37_A14489CCEspecif2[0] ;
         zm1NM620( -47) ;
      }
      pr_default.close(35);
      onLoadActions1NM620( ) ;
   }

   public void onLoadActions1NM620( )
   {
      GXt_char1 = A5627CCTValD ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int9[0] = A4034CCTLin ;
      GXv_char12[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int9, GXv_char12) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccresultados_impl.this.A4034CCTLin = GXv_int9[0] ;
      tinccresultados_impl.this.GXt_char1 = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char1 ;
      AV35OldCcVal = O4035CCVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldCcVal", AV35OldCcVal);
   }

   public void checkExtendedTable1NM620( )
   {
      nIsDirty_620 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NM620( ) ;
      /* Using cursor T01NM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T01NM4_A4043CCTLinDsc[0] ;
      pr_default.close(2);
      nIsDirty_620 = (short)(1) ;
      GXt_char1 = A5627CCTValD ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int9[0] = A4034CCTLin ;
      GXv_char12[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int9, GXv_char12) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccresultados_impl.this.A4034CCTLin = GXv_int9[0] ;
      tinccresultados_impl.this.GXt_char1 = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char1 ;
      AV35OldCcVal = O4035CCVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldCcVal", AV35OldCcVal);
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_char4[0] = A758ProCod ;
         GXv_int9[0] = A194BarOrdLin ;
         GXv_int7[0] = A4031CCTCod ;
         GXv_char3[0] = A4035CCVal ;
         GXv_int14[0] = A4034CCTLin ;
         GXv_int8[0] = AV33Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int11, GXv_char12, GXv_char4, GXv_int9, GXv_int7, GXv_char3, GXv_int14, GXv_int8) ;
         tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
         tinccresultados_impl.this.A129BarCod = GXv_int10[0] ;
         tinccresultados_impl.this.A132BarCodReo = GXv_int11[0] ;
         tinccresultados_impl.this.A130BarCodPar = GXv_char12[0] ;
         tinccresultados_impl.this.A758ProCod = GXv_char4[0] ;
         tinccresultados_impl.this.A194BarOrdLin = GXv_int9[0] ;
         tinccresultados_impl.this.A4031CCTCod = GXv_int7[0] ;
         tinccresultados_impl.this.A4035CCVal = GXv_char3[0] ;
         tinccresultados_impl.this.A4034CCTLin = GXv_int14[0] ;
         tinccresultados_impl.this.AV33Ok = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", GXutil.str( AV33Ok, 1, 0));
      }
      if ( ( AV33Ok == 0 ) && true /* Level */ && true /* After */ )
      {
         GXCCtl = "CCVAL_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato Valor Incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCVal_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1NM620( )
   {
      pr_default.close(2);
   }

   public void enableDisable1NM620( )
   {
   }

   public void gxload_48( String A396EmprCod ,
                          int A4031CCTCod ,
                          short A4034CCTLin )
   {
      /* Using cursor T01NM38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T01NM38_A4043CCTLinDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4043CCTLinDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(36) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(36);
   }

   public void getKey1NM620( )
   {
      /* Using cursor T01NM39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound620 = (short)(1) ;
      }
      else
      {
         RcdFound620 = (short)(0) ;
      }
      pr_default.close(37);
   }

   public void getByPrimaryKey1NM620( )
   {
      /* Using cursor T01NM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1NM620( 47) ;
         RcdFound620 = (short)(1) ;
         initializeNonKey1NM620( ) ;
         A4035CCVal = T01NM3_A4035CCVal[0] ;
         A12750CCOkLin = T01NM3_A12750CCOkLin[0] ;
         A12751CCOkDsc = T01NM3_A12751CCOkDsc[0] ;
         A13251CCMetodo = T01NM3_A13251CCMetodo[0] ;
         A13252CCEspecif = T01NM3_A13252CCEspecif[0] ;
         A14489CCEspecif2 = T01NM3_A14489CCEspecif2[0] ;
         A4034CCTLin = T01NM3_A4034CCTLin[0] ;
         O4035CCVal = A4035CCVal ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NM620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound620 = (short)(0) ;
         initializeNonKey1NM620( ) ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NM620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NM620( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NM620( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4035CCVal, T01NM2_A4035CCVal[0]) != 0 ) || ( Z12750CCOkLin != T01NM2_A12750CCOkLin[0] ) || ( GXutil.strcmp(Z12751CCOkDsc, T01NM2_A12751CCOkDsc[0]) != 0 ) || ( GXutil.strcmp(Z13251CCMetodo, T01NM2_A13251CCMetodo[0]) != 0 ) || ( GXutil.strcmp(Z13252CCEspecif, T01NM2_A13252CCEspecif[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14489CCEspecif2, T01NM2_A14489CCEspecif2[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4035CCVal, T01NM2_A4035CCVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCVal");
               GXutil.writeLogRaw("Old: ",Z4035CCVal);
               GXutil.writeLogRaw("Current: ",T01NM2_A4035CCVal[0]);
            }
            if ( Z12750CCOkLin != T01NM2_A12750CCOkLin[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCOkLin");
               GXutil.writeLogRaw("Old: ",Z12750CCOkLin);
               GXutil.writeLogRaw("Current: ",T01NM2_A12750CCOkLin[0]);
            }
            if ( GXutil.strcmp(Z12751CCOkDsc, T01NM2_A12751CCOkDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCOkDsc");
               GXutil.writeLogRaw("Old: ",Z12751CCOkDsc);
               GXutil.writeLogRaw("Current: ",T01NM2_A12751CCOkDsc[0]);
            }
            if ( GXutil.strcmp(Z13251CCMetodo, T01NM2_A13251CCMetodo[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCMetodo");
               GXutil.writeLogRaw("Old: ",Z13251CCMetodo);
               GXutil.writeLogRaw("Current: ",T01NM2_A13251CCMetodo[0]);
            }
            if ( GXutil.strcmp(Z13252CCEspecif, T01NM2_A13252CCEspecif[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCEspecif");
               GXutil.writeLogRaw("Old: ",Z13252CCEspecif);
               GXutil.writeLogRaw("Current: ",T01NM2_A13252CCEspecif[0]);
            }
            if ( GXutil.strcmp(Z14489CCEspecif2, T01NM2_A14489CCEspecif2[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tinccresultados:[seudo value changed for attri]"+"CCEspecif2");
               GXutil.writeLogRaw("Old: ",Z14489CCEspecif2);
               GXutil.writeLogRaw("Current: ",T01NM2_A14489CCEspecif2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NM620( )
   {
      beforeValidate1NM620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NM620( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NM620( 0) ;
         checkOptimisticConcurrency1NM620( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NM620( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NM620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NM40 */
                  pr_default.execute(38, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                  if ( (pr_default.getStatus(38) == 1) )
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
            load1NM620( ) ;
         }
         endLevel1NM620( ) ;
      }
      closeExtendedTableCursors1NM620( ) ;
   }

   public void update1NM620( )
   {
      beforeValidate1NM620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NM620( ) ;
      }
      if ( ( nIsMod_620 != 0 ) || ( nIsDirty_620 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NM620( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NM620( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NM620( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NM41 */
                     pr_default.execute(39, new Object[] {A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                     if ( (pr_default.getStatus(39) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NM620( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ && ( GXutil.strcmp(A4035CCVal, AV35OldCcVal) != 0 ) )
                        {
                           AV39Inc_obs = httpContext.getMessage( httpContext.getMessage( "Ingreso Datos. Orden= ", ""), "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( httpContext.getMessage( " Fase= ", ""), "") + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + httpContext.getMessage( httpContext.getMessage( " Linea= ", ""), "") + GXutil.str( A4034CCTLin, 4, 0) + httpContext.getMessage( httpContext.getMessage( " Descripcion= ", ""), "") + GXutil.trim( A4043CCTLinDsc) + httpContext.getMessage( httpContext.getMessage( " Valor Inicial= ", ""), "") + GXutil.trim( AV35OldCcVal) + httpContext.getMessage( httpContext.getMessage( " -> Valor Final= ", ""), "") + GXutil.trim( A4035CCVal) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV39Inc_obs", AV39Inc_obs);
                        }
                        if ( true /* After */ && ( GXutil.strcmp(A4035CCVal, AV35OldCcVal) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV55Pgmname, AV8UsurCod, AV12Station, AV39Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NM620( ) ;
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
            endLevel1NM620( ) ;
         }
      }
      closeExtendedTableCursors1NM620( ) ;
   }

   public void deferredUpdate1NM620( )
   {
   }

   public void delete1NM620( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NM620( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NM620( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NM620( ) ;
         afterConfirm1NM620( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NM620( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NM42 */
               pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
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
      sMode620 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NM620( ) ;
      Gx_mode = sMode620 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NM620( )
   {
      standaloneModal1NM620( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NM43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         A4043CCTLinDsc = T01NM43_A4043CCTLinDsc[0] ;
         pr_default.close(41);
         GXt_char1 = A5627CCTValD ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int10[0] = A4031CCTCod ;
         GXv_int14[0] = A4034CCTLin ;
         GXv_char12[0] = GXt_char1 ;
         new app.pccdef2(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int14, GXv_char12) ;
         tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
         tinccresultados_impl.this.A4031CCTCod = GXv_int10[0] ;
         tinccresultados_impl.this.A4034CCTLin = GXv_int14[0] ;
         tinccresultados_impl.this.GXt_char1 = GXv_char12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A5627CCTValD = GXt_char1 ;
         AV35OldCcVal = O4035CCVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldCcVal", AV35OldCcVal);
      }
   }

   public void endLevel1NM620( )
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

   public void scanStart1NM620( )
   {
      /* Scan By routine */
      /* Using cursor T01NM44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T01NM44_A4034CCTLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NM620( )
   {
      /* Scan next routine */
      pr_default.readNext(42);
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T01NM44_A4034CCTLin[0] ;
      }
   }

   public void scanEnd1NM620( )
   {
      pr_default.close(42);
   }

   public void afterConfirm1NM620( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NM620( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NM620( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NM620( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NM620( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NM620( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NM620( )
   {
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTValD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCOkLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCOkDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCMetodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCMetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCMetodo_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCEspecif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCEspecif_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void send_integrity_lvl_hashes1NM620( )
   {
   }

   public void send_integrity_lvl_hashes1NM619( )
   {
   }

   public void subsflControlProps_181620( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_181_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_181_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_181_idx ;
      edtCCTValD_Internalname = "CCTVALD_"+sGXsfl_181_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_181_idx ;
      edtCCOkDsc_Internalname = "CCOKDSC_"+sGXsfl_181_idx ;
      edtCCMetodo_Internalname = "CCMETODO_"+sGXsfl_181_idx ;
      edtCCEspecif_Internalname = "CCESPECIF_"+sGXsfl_181_idx ;
   }

   public void subsflControlProps_fel_181620( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_181_fel_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_181_fel_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_181_fel_idx ;
      edtCCTValD_Internalname = "CCTVALD_"+sGXsfl_181_fel_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_181_fel_idx ;
      edtCCOkDsc_Internalname = "CCOKDSC_"+sGXsfl_181_fel_idx ;
      edtCCMetodo_Internalname = "CCMETODO_"+sGXsfl_181_fel_idx ;
      edtCCEspecif_Internalname = "CCESPECIF_"+sGXsfl_181_fel_idx ;
   }

   public void addRow1NM620( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181620( ) ;
      sendRow1NM620( ) ;
   }

   public void sendRow1NM620( )
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
         if ( ((int)((nGXsfl_181_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTLinDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVal_Internalname,GXutil.rtrim( A4035CCVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValD_Internalname,A5627CCTValD,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTValD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCOkLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCCOkLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12750CCOkLin), "9") : localUtil.format( DecimalUtil.doubleToDec(A12750CCOkLin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCOkLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCOkLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCOkDsc_Internalname,A12751CCOkDsc,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCOkDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCOkDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCMetodo_Internalname,GXutil.rtrim( A13251CCMetodo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,188);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCMetodo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCMetodo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCEspecif_Internalname,GXutil.rtrim( A13252CCEspecif),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,189);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCEspecif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCEspecif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1NM620( ) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4035CCVal_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4035CCVal));
      GXCCtl = "Z12750CCOkLin_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12751CCOkDsc_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z12751CCOkDsc);
      GXCCtl = "Z13251CCMetodo_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13251CCMetodo));
      GXCCtl = "Z13252CCEspecif_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13252CCEspecif));
      GXCCtl = "Z14489CCEspecif2_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14489CCEspecif2);
      GXCCtl = "O4035CCVal_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O4035CCVal));
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_620_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_620_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_181_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV47TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV47TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV40BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV41BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42BarCodPar));
      GXCCtl = "vPROCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV43ProCod));
      GXCCtl = "vBARORDLIN_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV44BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCCTCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV45CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVAL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALD_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOKLIN_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOKDSC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCMETODO_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCESPECIF_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1NM620( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181620( ) ;
      edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTValD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALD_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCOkLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKLIN_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCOkDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKDSC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCMetodo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCMETODO_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCEspecif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCESPECIF_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         wbErr = true ;
         A4034CCTLin = (short)(0) ;
      }
      else
      {
         A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
      A4035CCVal = httpContext.cgiGet( edtCCVal_Internalname) ;
      A5627CCTValD = httpContext.cgiGet( edtCCTValD_Internalname) ;
      A12750CCOkLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A12751CCOkDsc = httpContext.cgiGet( edtCCOkDsc_Internalname) ;
      A13251CCMetodo = httpContext.cgiGet( edtCCMetodo_Internalname) ;
      A13252CCEspecif = httpContext.cgiGet( edtCCEspecif_Internalname) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_181_idx ;
      Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4035CCVal_" + sGXsfl_181_idx ;
      Z4035CCVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12750CCOkLin_" + sGXsfl_181_idx ;
      Z12750CCOkLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12751CCOkDsc_" + sGXsfl_181_idx ;
      Z12751CCOkDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13251CCMetodo_" + sGXsfl_181_idx ;
      Z13251CCMetodo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13252CCEspecif_" + sGXsfl_181_idx ;
      Z13252CCEspecif = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14489CCEspecif2_" + sGXsfl_181_idx ;
      Z14489CCEspecif2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14489CCEspecif2_" + sGXsfl_181_idx ;
      A14489CCEspecif2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O4035CCVal_" + sGXsfl_181_idx ;
      O4035CCVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_181_idx ;
      nRcdDeleted_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_620_" + sGXsfl_181_idx ;
      nRcdExists_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_620_" + sGXsfl_181_idx ;
      nIsMod_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCOkDsc_Enabled = edtCCOkDsc_Enabled ;
      defedtCCOkLin_Enabled = edtCCOkLin_Enabled ;
      defedtCCTValD_Enabled = edtCCTValD_Enabled ;
      defedtCCTLin_Enabled = edtCCTLin_Enabled ;
   }

   public void confirmValues1NM0( )
   {
      nGXsfl_181_idx = 0 ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181620( ) ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_181620( ) ;
         httpContext.changePostValue( "Z4034CCTLin_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z4034CCTLin_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z4035CCVal_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z4035CCVal_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z12750CCOkLin_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z12750CCOkLin_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z12751CCOkDsc_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z13251CCMetodo_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z13251CCMetodo_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13251CCMetodo_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z13252CCEspecif_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z13252CCEspecif_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13252CCEspecif_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z14489CCEspecif2_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z14489CCEspecif2_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14489CCEspecif2_"+sGXsfl_181_idx) ;
      }
      httpContext.changePostValue( "O4035CCVal", httpContext.cgiGet( "T4035CCVal")) ;
      httpContext.deletePostValue( "T4035CCVal") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tinccresultados", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV43ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45CCTCod,6,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TINCCResultados");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV55Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\tinccresultados:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.dtoc( Z4033CCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4405CcDisp", GXutil.rtrim( Z4405CcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3281CcObs", Z3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_181", GXutil.ltrim( localUtil.ntoc( nGXsfl_181_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV47TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV47TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV47TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFOK", GXutil.ltrim( localUtil.ntoc( A14418CCfOk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV40BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV41BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV42BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV43ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV44BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV45CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK_S", GXutil.rtrim( AV34Ok_s));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPESECC", GXutil.rtrim( AV37OpeSecc));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK_OPE", GXutil.ltrim( localUtil.ntoc( AV38Ok_ope, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCCVAL", GXutil.rtrim( AV35OldCcVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV39Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.ltrim( localUtil.ntoc( AV33Ok, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "CCESPECIF2", A14489CCEspecif2);
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
      return formatLink("app.controlcalidadhtd.tinccresultados", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV43ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45CCTCod,6,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TINCCResultados" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INCCResultados", "") ;
   }

   public void initializeNonKey1NM619( )
   {
      AV34Ok_s = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Ok_s", AV34Ok_s);
      AV37OpeSecc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OpeSecc", AV37OpeSecc);
      AV38Ok_ope = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Ok_ope", GXutil.str( AV38Ok_ope, 1, 0));
      A14418CCfOk = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14418CCfOk", GXutil.str( A14418CCfOk, 1, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A4032CCOpeCod = 0 ;
      n4032CCOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
      A4033CCFch = GXutil.nullDate() ;
      n4033CCFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      A4405CcDisp = "" ;
      n4405CcDisp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
      A3281CcObs = "" ;
      n3281CcObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A1909BarGraAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A3137BarGraAca2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A1224BarEncAnh = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A1223BarEncCom = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1911BarRdoA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A125BarAncAca1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A126BarAncAca2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A603MaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A4812BarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A217BarTipArt = (short)(0) ;
      n217BarTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A9789BarItem5 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
      A4466BarAcaAnh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      Z4032CCOpeCod = 0 ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
   }

   public void initAll1NM619( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      initializeNonKey1NM619( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NM620( )
   {
      AV33Ok = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", GXutil.str( AV33Ok, 1, 0));
      AV35OldCcVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldCcVal", AV35OldCcVal);
      A5627CCTValD = "" ;
      A4043CCTLinDsc = "" ;
      A4035CCVal = "" ;
      A12750CCOkLin = (byte)(0) ;
      A12751CCOkDsc = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      A14489CCEspecif2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14489CCEspecif2", A14489CCEspecif2);
      AV39Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Inc_obs", AV39Inc_obs);
      O4035CCVal = A4035CCVal ;
      Z4035CCVal = "" ;
      Z12750CCOkLin = (byte)(0) ;
      Z12751CCOkDsc = "" ;
      Z13251CCMetodo = "" ;
      Z13252CCEspecif = "" ;
      Z14489CCEspecif2 = "" ;
   }

   public void initAll1NM620( )
   {
      A4034CCTLin = (short)(0) ;
      initializeNonKey1NM620( ) ;
   }

   public void standaloneModalInsert1NM620( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211671794", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tinccresultados.js", "?20268211671794", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties620( )
   {
      edtCCOkDsc_Enabled = defedtCCOkDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCOkLin_Enabled = defedtCCOkLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTValD_Enabled = defedtCCTValD_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTLin_Enabled = defedtCCTLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void startgridcontrol181( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4035CCVal));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", A5627CCTValD);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", A12751CCOkDsc);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13251CCMetodo));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13252CCEspecif));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtProCod_Internalname = "PROCOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCOpeCod_Internalname = "CCOPECOD" ;
      edtCCFch_Internalname = "CCFCH" ;
      edtCcDisp_Internalname = "CCDISP" ;
      edtCcObs_Internalname = "CCOBS" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      edtBarGraAca_Internalname = "BARGRAACA" ;
      edtBarGraAca2_Internalname = "BARGRAACA2" ;
      edtBarEncAnh_Internalname = "BARENCANH" ;
      edtBarEncCom_Internalname = "BARENCCOM" ;
      edtBarRdoA_Internalname = "BARRDOA" ;
      edtBarAncAca1_Internalname = "BARANCACA1" ;
      edtBarAncAca2_Internalname = "BARANCACA2" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      edtBarTipArt_Internalname = "BARTIPART" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarItem5_Internalname = "BARITEM5" ;
      edtBarAcaAnh_Internalname = "BARACAANH" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCVal_Internalname = "CCVAL" ;
      edtCCTValD_Internalname = "CCTVALD" ;
      edtCCOkLin_Internalname = "CCOKLIN" ;
      edtCCOkDsc_Internalname = "CCOKDSC" ;
      edtCCMetodo_Internalname = "CCMETODO" ;
      edtCCEspecif_Internalname = "CCESPECIF" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "INCCResultados", "") );
      edtCCEspecif_Jsonclick = "" ;
      edtCCMetodo_Jsonclick = "" ;
      edtCCOkDsc_Jsonclick = "" ;
      edtCCOkLin_Jsonclick = "" ;
      edtCCTValD_Jsonclick = "" ;
      edtCCVal_Jsonclick = "" ;
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtCCEspecif_Enabled = 1 ;
      edtCCMetodo_Enabled = 1 ;
      edtCCOkDsc_Enabled = 0 ;
      edtCCOkLin_Enabled = 0 ;
      edtCCTValD_Enabled = 0 ;
      edtCCVal_Enabled = 1 ;
      edtCCTLinDsc_Enabled = 0 ;
      edtCCTLin_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtBarAcaAnh_Enabled = 0 ;
      edtBarItem5_Jsonclick = "" ;
      edtBarItem5_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarTipArt_Enabled = 0 ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCodBis_Enabled = 0 ;
      edtBarAncAca2_Jsonclick = "" ;
      edtBarAncAca2_Enabled = 0 ;
      edtBarAncAca1_Jsonclick = "" ;
      edtBarAncAca1_Enabled = 0 ;
      edtBarRdoA_Jsonclick = "" ;
      edtBarRdoA_Enabled = 0 ;
      edtBarEncCom_Jsonclick = "" ;
      edtBarEncCom_Enabled = 0 ;
      edtBarEncAnh_Jsonclick = "" ;
      edtBarEncAnh_Enabled = 0 ;
      edtBarGraAca2_Jsonclick = "" ;
      edtBarGraAca2_Enabled = 0 ;
      edtBarGraAca_Jsonclick = "" ;
      edtBarGraAca_Enabled = 0 ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 0 ;
      edtCcObs_Enabled = 1 ;
      edtCcDisp_Jsonclick = "" ;
      edtCcDisp_Enabled = 1 ;
      edtCCFch_Jsonclick = "" ;
      edtCCFch_Enabled = 1 ;
      edtCCOpeCod_Jsonclick = "" ;
      edtCCOpeCod_Enabled = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Enabled = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
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

   public void gx1asaccfok1NM619( String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar ,
                                  String A758ProCod ,
                                  short A194BarOrdLin ,
                                  int A4031CCTCod )
   {
      GXt_int6 = A14418CCfOk ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int11[0] = A132BarCodReo ;
      GXv_char12[0] = A130BarCodPar ;
      GXv_char4[0] = A758ProCod ;
      GXv_int14[0] = A194BarOrdLin ;
      GXv_int7[0] = A4031CCTCod ;
      GXv_int8[0] = GXt_int6 ;
      new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int11, GXv_char12, GXv_char4, GXv_int14, GXv_int7, GXv_int8) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
      tinccresultados_impl.this.A129BarCod = GXv_int10[0] ;
      tinccresultados_impl.this.A132BarCodReo = GXv_int11[0] ;
      tinccresultados_impl.this.A130BarCodPar = GXv_char12[0] ;
      tinccresultados_impl.this.A758ProCod = GXv_char4[0] ;
      tinccresultados_impl.this.A194BarOrdLin = GXv_int14[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int7[0] ;
      tinccresultados_impl.this.GXt_int6 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A14418CCfOk = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14418CCfOk", GXutil.str( A14418CCfOk, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14418CCfOk, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx28asacctvald1NM620( String A396EmprCod ,
                                     int A4031CCTCod ,
                                     short A4034CCTLin )
   {
      GXt_char1 = A5627CCTValD ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int14[0] = A4034CCTLin ;
      GXv_char12[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int14, GXv_char12) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccresultados_impl.this.A4034CCTLin = GXv_int14[0] ;
      tinccresultados_impl.this.GXt_char1 = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A5627CCTValD)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_25_1NM619( String A396EmprCod ,
                             int A4032CCOpeCod ,
                             byte AV38Ok_ope ,
                             String AV37OpeSecc ,
                             String A603MaqCodBis ,
                             String AV34Ok_s )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int10[0] = A4032CCOpeCod ;
         GXv_char12[0] = " " ;
         GXv_int11[0] = AV38Ok_ope ;
         GXv_char4[0] = AV37OpeSecc ;
         GXv_char3[0] = A603MaqCodBis ;
         GXv_char2[0] = AV34Ok_s ;
         new app.pbusopes(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_char12, GXv_int11, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char13[0] ;
         A4032CCOpeCod = GXv_int10[0] ;
         AV38Ok_ope = GXv_int11[0] ;
         AV37OpeSecc = GXv_char4[0] ;
         A603MaqCodBis = GXv_char3[0] ;
         AV34Ok_s = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ok_ope", GXutil.str( AV38Ok_ope, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV37OpeSecc", AV37OpeSecc);
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         httpContext.ajax_rsp_assign_attri("", false, "AV34Ok_s", AV34Ok_s);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38Ok_ope, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV37OpeSecc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A603MaqCodBis))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34Ok_s))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_34_1NM620( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A758ProCod ,
                             short A194BarOrdLin ,
                             int A4031CCTCod ,
                             String A4035CCVal ,
                             short A4034CCTLin ,
                             byte AV33Ok )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_char4[0] = A758ProCod ;
         GXv_int14[0] = A194BarOrdLin ;
         GXv_int7[0] = A4031CCTCod ;
         GXv_char3[0] = A4035CCVal ;
         GXv_int9[0] = A4034CCTLin ;
         GXv_int8[0] = AV33Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int11, GXv_char12, GXv_char4, GXv_int14, GXv_int7, GXv_char3, GXv_int9, GXv_int8) ;
         A396EmprCod = GXv_char13[0] ;
         A129BarCod = GXv_int10[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char12[0] ;
         A758ProCod = GXv_char4[0] ;
         A194BarOrdLin = GXv_int14[0] ;
         A4031CCTCod = GXv_int7[0] ;
         A4035CCVal = GXv_char3[0] ;
         A4034CCTLin = GXv_int9[0] ;
         AV33Ok = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", GXutil.str( AV33Ok, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4035CCVal))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Ok, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_38_1NM620( String A396EmprCod ,
                             String AV55Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV39Inc_obs ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A4035CCVal ,
                             String AV35OldCcVal )
   {
      if ( true /* After */ && ( GXutil.strcmp(A4035CCVal, AV35OldCcVal) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV55Pgmname, AV8UsurCod, AV12Station, AV39Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      subsflControlProps_181620( ) ;
      while ( nGXsfl_181_idx <= nRC_GXsfl_181 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NM620( ) ;
         standaloneModal1NM620( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NM620( ) ;
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_181620( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
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
      n407EmprNom = false ;
      /* Using cursor T01NM28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01NM28_A407EmprNom[0] ;
      n407EmprNom = T01NM28_n407EmprNom[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      n217BarTipArt = false ;
      /* Using cursor T01NM29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1909BarGraAca = T01NM29_A1909BarGraAca[0] ;
      A3137BarGraAca2 = T01NM29_A3137BarGraAca2[0] ;
      A1224BarEncAnh = T01NM29_A1224BarEncAnh[0] ;
      A1223BarEncCom = T01NM29_A1223BarEncCom[0] ;
      A1911BarRdoA = T01NM29_A1911BarRdoA[0] ;
      A125BarAncAca1 = T01NM29_A125BarAncAca1[0] ;
      A126BarAncAca2 = T01NM29_A126BarAncAca2[0] ;
      A212BarSer = T01NM29_A212BarSer[0] ;
      A1652BarSerDsc = T01NM29_A1652BarSerDsc[0] ;
      A135BarColNom = T01NM29_A135BarColNom[0] ;
      A136BarColNum = T01NM29_A136BarColNum[0] ;
      A218BarTipCol = T01NM29_A218BarTipCol[0] ;
      A4812BarEncCli = T01NM29_A4812BarEncCli[0] ;
      A9789BarItem5 = T01NM29_A9789BarItem5[0] ;
      A4466BarAcaAnh = T01NM29_A4466BarAcaAnh[0] ;
      A252CliCod = T01NM29_A252CliCod[0] ;
      n252CliCod = T01NM29_n252CliCod[0] ;
      A217BarTipArt = T01NM29_A217BarTipArt[0] ;
      n217BarTipArt = T01NM29_n217BarTipArt[0] ;
      pr_default.close(27);
      /* Using cursor T01NM30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A279CliNom = T01NM30_A279CliNom[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", GXutil.rtrim( A4812BarEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", GXutil.rtrim( A9789BarItem5));
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Procod( )
   {
      /* Using cursor T01NM31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A759ProDsc = T01NM31_A759ProDsc[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Barordlin( )
   {
      /* Using cursor T01NM32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A457FasCod = T01NM32_A457FasCod[0] ;
      A603MaqCodBis = T01NM32_A603MaqCodBis[0] ;
      pr_default.close(30);
      /* Using cursor T01NM33 */
      pr_default.execute(31, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01NM33_A460FasDsc[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", GXutil.rtrim( A603MaqCodBis));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Cctcod( )
   {
      /* Using cursor T01NM34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A4036CCTDsc = T01NM34_A4036CCTDsc[0] ;
      pr_default.close(32);
      GXt_int6 = A14418CCfOk ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int11[0] = A132BarCodReo ;
      GXv_char12[0] = A130BarCodPar ;
      GXv_char4[0] = A758ProCod ;
      GXv_int14[0] = A194BarOrdLin ;
      GXv_int7[0] = A4031CCTCod ;
      GXv_int8[0] = GXt_int6 ;
      new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int11, GXv_char12, GXv_char4, GXv_int14, GXv_int7, GXv_int8) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
      tinccresultados_impl.this.A129BarCod = GXv_int10[0] ;
      tinccresultados_impl.this.A132BarCodReo = GXv_int11[0] ;
      tinccresultados_impl.this.A130BarCodPar = GXv_char12[0] ;
      tinccresultados_impl.this.A758ProCod = GXv_char4[0] ;
      tinccresultados_impl.this.A194BarOrdLin = GXv_int14[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int7[0] ;
      tinccresultados_impl.this.GXt_int6 = GXv_int8[0] ;
      A14418CCfOk = GXt_int6 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14418CCfOk", GXutil.ltrim( localUtil.ntoc( A14418CCfOk, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Cctlin( )
   {
      /* Using cursor T01NM43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
      }
      A4043CCTLinDsc = T01NM43_A4043CCTLinDsc[0] ;
      pr_default.close(41);
      GXt_char1 = A5627CCTValD ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int14[0] = A4034CCTLin ;
      GXv_char12[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int14, GXv_char12) ;
      tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
      tinccresultados_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccresultados_impl.this.A4034CCTLin = GXv_int14[0] ;
      tinccresultados_impl.this.GXt_char1 = GXv_char12[0] ;
      A5627CCTValD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5627CCTValD", A5627CCTValD);
   }

   public void valid_Ccval( )
   {
      AV35OldCcVal = O4035CCVal ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_char4[0] = A758ProCod ;
         GXv_int14[0] = A194BarOrdLin ;
         GXv_int7[0] = A4031CCTCod ;
         GXv_char3[0] = A4035CCVal ;
         GXv_int9[0] = A4034CCTLin ;
         GXv_int8[0] = AV33Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char13, GXv_int10, GXv_int11, GXv_char12, GXv_char4, GXv_int14, GXv_int7, GXv_char3, GXv_int9, GXv_int8) ;
         tinccresultados_impl.this.A396EmprCod = GXv_char13[0] ;
         A396EmprCod = this.A396EmprCod ;
         tinccresultados_impl.this.A129BarCod = GXv_int10[0] ;
         A129BarCod = this.A129BarCod ;
         tinccresultados_impl.this.A132BarCodReo = GXv_int11[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tinccresultados_impl.this.A130BarCodPar = GXv_char12[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tinccresultados_impl.this.A758ProCod = GXv_char4[0] ;
         A758ProCod = this.A758ProCod ;
         tinccresultados_impl.this.A194BarOrdLin = GXv_int14[0] ;
         A194BarOrdLin = this.A194BarOrdLin ;
         tinccresultados_impl.this.A4031CCTCod = GXv_int7[0] ;
         A4031CCTCod = this.A4031CCTCod ;
         tinccresultados_impl.this.A4035CCVal = GXv_char3[0] ;
         A4035CCVal = this.A4035CCVal ;
         tinccresultados_impl.this.A4034CCTLin = GXv_int9[0] ;
         A4034CCTLin = this.A4034CCTLin ;
         tinccresultados_impl.this.AV33Ok = GXv_int8[0] ;
         AV33Ok = this.AV33Ok ;
      }
      if ( ( AV33Ok == 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato Valor Incorrecto", ""), 1, "CCVAL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCVal_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldCcVal", GXutil.rtrim( AV35OldCcVal));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", GXutil.rtrim( A758ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4035CCVal", GXutil.rtrim( A4035CCVal));
      httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", GXutil.ltrim( localUtil.ntoc( AV33Ok, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV44BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV45CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV47TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV44BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV45CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV55Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131NM2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV47TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("EXIT","{handler:'e111NM2',iparms:[]");
      setEventMetadata("EXIT",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A3137BarGraAca2',fld:'BARGRAACA2',pic:'ZZZ9'},{av:'A1224BarEncAnh',fld:'BARENCANH',pic:'999.99'},{av:'A1223BarEncCom',fld:'BARENCCOM',pic:'999.99'},{av:'A1911BarRdoA',fld:'BARRDOA',pic:'ZZ9.99'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A126BarAncAca2',fld:'BARANCACA2',pic:'ZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A9789BarItem5',fld:'BARITEM5',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A3137BarGraAca2',fld:'BARGRAACA2',pic:'ZZZ9'},{av:'A1224BarEncAnh',fld:'BARENCANH',pic:'999.99'},{av:'A1223BarEncCom',fld:'BARENCCOM',pic:'999.99'},{av:'A1911BarRdoA',fld:'BARRDOA',pic:'ZZ9.99'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A126BarAncAca2',fld:'BARANCACA2',pic:'ZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A9789BarItem5',fld:'BARITEM5',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A14418CCfOk',fld:'CCFOK',pic:'9'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A14418CCfOk',fld:'CCFOK',pic:'9'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_FASDSC","{handler:'valid_Fasdsc',iparms:[]");
      setEventMetadata("VALID_FASDSC",",oparms:[]}");
      setEventMetadata("VALID_MAQCODBIS","{handler:'valid_Maqcodbis',iparms:[]");
      setEventMetadata("VALID_MAQCODBIS",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A5627CCTValD',fld:'CCTVALD',pic:''}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A5627CCTValD',fld:'CCTVALD',pic:''}]}");
      setEventMetadata("VALID_CCTLINDSC","{handler:'valid_Cctlindsc',iparms:[]");
      setEventMetadata("VALID_CCTLINDSC",",oparms:[]}");
      setEventMetadata("VALID_CCVAL","{handler:'valid_Ccval',iparms:[{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'O4035CCVal'},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'AV35OldCcVal',fld:'vOLDCCVAL',pic:''},{av:'AV33Ok',fld:'vOK',pic:'9'}]");
      setEventMetadata("VALID_CCVAL",",oparms:[{av:'AV35OldCcVal',fld:'vOLDCCVAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV33Ok',fld:'vOK',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Ccespecif',iparms:[]");
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
      pr_default.close(41);
      pr_default.close(30);
      pr_default.close(27);
      pr_default.close(26);
      pr_default.close(29);
      pr_default.close(32);
      pr_default.close(31);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV42BarCodPar = "" ;
      wcpOAV43ProCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
      Z4035CCVal = "" ;
      Z12751CCOkDsc = "" ;
      Z13251CCMetodo = "" ;
      Z13252CCEspecif = "" ;
      Z14489CCEspecif2 = "" ;
      O4035CCVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV37OpeSecc = "" ;
      A603MaqCodBis = "" ;
      AV34Ok_s = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A4035CCVal = "" ;
      AV55Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV39Inc_obs = "" ;
      AV35OldCcVal = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV42BarCodPar = "" ;
      AV43ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A407EmprNom = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A4405CcDisp = "" ;
      A3281CcObs = "" ;
      A460FasDsc = "" ;
      A759ProDsc = "" ;
      A4036CCTDsc = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1911BarRdoA = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      A9789BarItem5 = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode620 = "" ;
      sStyleString = "" ;
      A14489CCEspecif2 = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode619 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4043CCTLinDsc = "" ;
      A5627CCTValD = "" ;
      A12751CCOkDsc = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      T4035CCVal = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV11EmprNom = "" ;
      AV46WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV48WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z1224BarEncAnh = DecimalUtil.ZERO ;
      Z1223BarEncCom = DecimalUtil.ZERO ;
      Z1911BarRdoA = DecimalUtil.ZERO ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z4812BarEncCli = "" ;
      Z9789BarItem5 = "" ;
      Z279CliNom = "" ;
      Z759ProDsc = "" ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
      Z460FasDsc = "" ;
      Z4036CCTDsc = "" ;
      T01NM7_A407EmprNom = new String[] {""} ;
      T01NM7_n407EmprNom = new boolean[] {false} ;
      T01NM8_A1909BarGraAca = new short[1] ;
      T01NM8_A3137BarGraAca2 = new short[1] ;
      T01NM8_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM8_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM8_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM8_A125BarAncAca1 = new short[1] ;
      T01NM8_A126BarAncAca2 = new short[1] ;
      T01NM8_A212BarSer = new String[] {""} ;
      T01NM8_A1652BarSerDsc = new String[] {""} ;
      T01NM8_A135BarColNom = new String[] {""} ;
      T01NM8_A136BarColNum = new int[1] ;
      T01NM8_A218BarTipCol = new byte[1] ;
      T01NM8_A4812BarEncCli = new String[] {""} ;
      T01NM8_A9789BarItem5 = new String[] {""} ;
      T01NM8_A4466BarAcaAnh = new short[1] ;
      T01NM8_A252CliCod = new int[1] ;
      T01NM8_n252CliCod = new boolean[] {false} ;
      T01NM8_A217BarTipArt = new short[1] ;
      T01NM8_n217BarTipArt = new boolean[] {false} ;
      T01NM13_A279CliNom = new String[] {""} ;
      T01NM9_A759ProDsc = new String[] {""} ;
      T01NM10_A457FasCod = new String[] {""} ;
      T01NM10_A603MaqCodBis = new String[] {""} ;
      T01NM12_A460FasDsc = new String[] {""} ;
      T01NM11_A4036CCTDsc = new String[] {""} ;
      T01NM14_A407EmprNom = new String[] {""} ;
      T01NM14_n407EmprNom = new boolean[] {false} ;
      T01NM14_A4032CCOpeCod = new int[1] ;
      T01NM14_n4032CCOpeCod = new boolean[] {false} ;
      T01NM14_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01NM14_n4033CCFch = new boolean[] {false} ;
      T01NM14_A4405CcDisp = new String[] {""} ;
      T01NM14_n4405CcDisp = new boolean[] {false} ;
      T01NM14_A3281CcObs = new String[] {""} ;
      T01NM14_n3281CcObs = new boolean[] {false} ;
      T01NM14_A460FasDsc = new String[] {""} ;
      T01NM14_A759ProDsc = new String[] {""} ;
      T01NM14_A4036CCTDsc = new String[] {""} ;
      T01NM14_A1909BarGraAca = new short[1] ;
      T01NM14_A3137BarGraAca2 = new short[1] ;
      T01NM14_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM14_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM14_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM14_A125BarAncAca1 = new short[1] ;
      T01NM14_A126BarAncAca2 = new short[1] ;
      T01NM14_A212BarSer = new String[] {""} ;
      T01NM14_A1652BarSerDsc = new String[] {""} ;
      T01NM14_A135BarColNom = new String[] {""} ;
      T01NM14_A136BarColNum = new int[1] ;
      T01NM14_A218BarTipCol = new byte[1] ;
      T01NM14_A4812BarEncCli = new String[] {""} ;
      T01NM14_A279CliNom = new String[] {""} ;
      T01NM14_A9789BarItem5 = new String[] {""} ;
      T01NM14_A4466BarAcaAnh = new short[1] ;
      T01NM14_A396EmprCod = new String[] {""} ;
      T01NM14_A129BarCod = new int[1] ;
      T01NM14_A132BarCodReo = new byte[1] ;
      T01NM14_A130BarCodPar = new String[] {""} ;
      T01NM14_A758ProCod = new String[] {""} ;
      T01NM14_A194BarOrdLin = new short[1] ;
      T01NM14_A4031CCTCod = new int[1] ;
      T01NM14_A457FasCod = new String[] {""} ;
      T01NM14_A603MaqCodBis = new String[] {""} ;
      T01NM14_A252CliCod = new int[1] ;
      T01NM14_n252CliCod = new boolean[] {false} ;
      T01NM14_A217BarTipArt = new short[1] ;
      T01NM14_n217BarTipArt = new boolean[] {false} ;
      T01NM15_A407EmprNom = new String[] {""} ;
      T01NM15_n407EmprNom = new boolean[] {false} ;
      T01NM16_A1909BarGraAca = new short[1] ;
      T01NM16_A3137BarGraAca2 = new short[1] ;
      T01NM16_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM16_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM16_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM16_A125BarAncAca1 = new short[1] ;
      T01NM16_A126BarAncAca2 = new short[1] ;
      T01NM16_A212BarSer = new String[] {""} ;
      T01NM16_A1652BarSerDsc = new String[] {""} ;
      T01NM16_A135BarColNom = new String[] {""} ;
      T01NM16_A136BarColNum = new int[1] ;
      T01NM16_A218BarTipCol = new byte[1] ;
      T01NM16_A4812BarEncCli = new String[] {""} ;
      T01NM16_A9789BarItem5 = new String[] {""} ;
      T01NM16_A4466BarAcaAnh = new short[1] ;
      T01NM16_A252CliCod = new int[1] ;
      T01NM16_n252CliCod = new boolean[] {false} ;
      T01NM16_A217BarTipArt = new short[1] ;
      T01NM16_n217BarTipArt = new boolean[] {false} ;
      T01NM17_A279CliNom = new String[] {""} ;
      T01NM18_A759ProDsc = new String[] {""} ;
      T01NM19_A457FasCod = new String[] {""} ;
      T01NM19_A603MaqCodBis = new String[] {""} ;
      T01NM20_A460FasDsc = new String[] {""} ;
      T01NM21_A4036CCTDsc = new String[] {""} ;
      T01NM22_A396EmprCod = new String[] {""} ;
      T01NM22_A129BarCod = new int[1] ;
      T01NM22_A132BarCodReo = new byte[1] ;
      T01NM22_A130BarCodPar = new String[] {""} ;
      T01NM22_A758ProCod = new String[] {""} ;
      T01NM22_A194BarOrdLin = new short[1] ;
      T01NM22_A4031CCTCod = new int[1] ;
      T01NM6_A4032CCOpeCod = new int[1] ;
      T01NM6_n4032CCOpeCod = new boolean[] {false} ;
      T01NM6_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01NM6_n4033CCFch = new boolean[] {false} ;
      T01NM6_A4405CcDisp = new String[] {""} ;
      T01NM6_n4405CcDisp = new boolean[] {false} ;
      T01NM6_A3281CcObs = new String[] {""} ;
      T01NM6_n3281CcObs = new boolean[] {false} ;
      T01NM6_A396EmprCod = new String[] {""} ;
      T01NM6_A129BarCod = new int[1] ;
      T01NM6_A132BarCodReo = new byte[1] ;
      T01NM6_A130BarCodPar = new String[] {""} ;
      T01NM6_A758ProCod = new String[] {""} ;
      T01NM6_A194BarOrdLin = new short[1] ;
      T01NM6_A4031CCTCod = new int[1] ;
      T01NM23_A396EmprCod = new String[] {""} ;
      T01NM23_A129BarCod = new int[1] ;
      T01NM23_A132BarCodReo = new byte[1] ;
      T01NM23_A130BarCodPar = new String[] {""} ;
      T01NM23_A758ProCod = new String[] {""} ;
      T01NM23_A194BarOrdLin = new short[1] ;
      T01NM23_A4031CCTCod = new int[1] ;
      T01NM24_A396EmprCod = new String[] {""} ;
      T01NM24_A129BarCod = new int[1] ;
      T01NM24_A132BarCodReo = new byte[1] ;
      T01NM24_A130BarCodPar = new String[] {""} ;
      T01NM24_A758ProCod = new String[] {""} ;
      T01NM24_A194BarOrdLin = new short[1] ;
      T01NM24_A4031CCTCod = new int[1] ;
      T01NM5_A4032CCOpeCod = new int[1] ;
      T01NM5_n4032CCOpeCod = new boolean[] {false} ;
      T01NM5_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01NM5_n4033CCFch = new boolean[] {false} ;
      T01NM5_A4405CcDisp = new String[] {""} ;
      T01NM5_n4405CcDisp = new boolean[] {false} ;
      T01NM5_A3281CcObs = new String[] {""} ;
      T01NM5_n3281CcObs = new boolean[] {false} ;
      T01NM5_A396EmprCod = new String[] {""} ;
      T01NM5_A129BarCod = new int[1] ;
      T01NM5_A132BarCodReo = new byte[1] ;
      T01NM5_A130BarCodPar = new String[] {""} ;
      T01NM5_A758ProCod = new String[] {""} ;
      T01NM5_A194BarOrdLin = new short[1] ;
      T01NM5_A4031CCTCod = new int[1] ;
      T01NM28_A407EmprNom = new String[] {""} ;
      T01NM28_n407EmprNom = new boolean[] {false} ;
      T01NM29_A1909BarGraAca = new short[1] ;
      T01NM29_A3137BarGraAca2 = new short[1] ;
      T01NM29_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM29_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM29_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NM29_A125BarAncAca1 = new short[1] ;
      T01NM29_A126BarAncAca2 = new short[1] ;
      T01NM29_A212BarSer = new String[] {""} ;
      T01NM29_A1652BarSerDsc = new String[] {""} ;
      T01NM29_A135BarColNom = new String[] {""} ;
      T01NM29_A136BarColNum = new int[1] ;
      T01NM29_A218BarTipCol = new byte[1] ;
      T01NM29_A4812BarEncCli = new String[] {""} ;
      T01NM29_A9789BarItem5 = new String[] {""} ;
      T01NM29_A4466BarAcaAnh = new short[1] ;
      T01NM29_A252CliCod = new int[1] ;
      T01NM29_n252CliCod = new boolean[] {false} ;
      T01NM29_A217BarTipArt = new short[1] ;
      T01NM29_n217BarTipArt = new boolean[] {false} ;
      T01NM30_A279CliNom = new String[] {""} ;
      T01NM31_A759ProDsc = new String[] {""} ;
      T01NM32_A457FasCod = new String[] {""} ;
      T01NM32_A603MaqCodBis = new String[] {""} ;
      T01NM33_A460FasDsc = new String[] {""} ;
      T01NM34_A4036CCTDsc = new String[] {""} ;
      T01NM35_A396EmprCod = new String[] {""} ;
      T01NM35_A129BarCod = new int[1] ;
      T01NM35_A132BarCodReo = new byte[1] ;
      T01NM35_A130BarCodPar = new String[] {""} ;
      T01NM35_A758ProCod = new String[] {""} ;
      T01NM35_A194BarOrdLin = new short[1] ;
      T01NM35_A4031CCTCod = new int[1] ;
      T01NM35_A11294CcLn = new short[1] ;
      T01NM36_A396EmprCod = new String[] {""} ;
      T01NM36_A129BarCod = new int[1] ;
      T01NM36_A132BarCodReo = new byte[1] ;
      T01NM36_A130BarCodPar = new String[] {""} ;
      T01NM36_A758ProCod = new String[] {""} ;
      T01NM36_A194BarOrdLin = new short[1] ;
      T01NM36_A4031CCTCod = new int[1] ;
      Z4043CCTLinDsc = "" ;
      T01NM37_A129BarCod = new int[1] ;
      T01NM37_A132BarCodReo = new byte[1] ;
      T01NM37_A130BarCodPar = new String[] {""} ;
      T01NM37_A194BarOrdLin = new short[1] ;
      T01NM37_A4043CCTLinDsc = new String[] {""} ;
      T01NM37_A4035CCVal = new String[] {""} ;
      T01NM37_A12750CCOkLin = new byte[1] ;
      T01NM37_A12751CCOkDsc = new String[] {""} ;
      T01NM37_A13251CCMetodo = new String[] {""} ;
      T01NM37_A13252CCEspecif = new String[] {""} ;
      T01NM37_A14489CCEspecif2 = new String[] {""} ;
      T01NM37_A396EmprCod = new String[] {""} ;
      T01NM37_A4031CCTCod = new int[1] ;
      T01NM37_A4034CCTLin = new short[1] ;
      T01NM37_A758ProCod = new String[] {""} ;
      T01NM4_A4043CCTLinDsc = new String[] {""} ;
      T01NM38_A4043CCTLinDsc = new String[] {""} ;
      T01NM39_A396EmprCod = new String[] {""} ;
      T01NM39_A129BarCod = new int[1] ;
      T01NM39_A132BarCodReo = new byte[1] ;
      T01NM39_A130BarCodPar = new String[] {""} ;
      T01NM39_A758ProCod = new String[] {""} ;
      T01NM39_A194BarOrdLin = new short[1] ;
      T01NM39_A4031CCTCod = new int[1] ;
      T01NM39_A4034CCTLin = new short[1] ;
      T01NM3_A129BarCod = new int[1] ;
      T01NM3_A132BarCodReo = new byte[1] ;
      T01NM3_A130BarCodPar = new String[] {""} ;
      T01NM3_A194BarOrdLin = new short[1] ;
      T01NM3_A4035CCVal = new String[] {""} ;
      T01NM3_A12750CCOkLin = new byte[1] ;
      T01NM3_A12751CCOkDsc = new String[] {""} ;
      T01NM3_A13251CCMetodo = new String[] {""} ;
      T01NM3_A13252CCEspecif = new String[] {""} ;
      T01NM3_A14489CCEspecif2 = new String[] {""} ;
      T01NM3_A396EmprCod = new String[] {""} ;
      T01NM3_A4031CCTCod = new int[1] ;
      T01NM3_A4034CCTLin = new short[1] ;
      T01NM3_A758ProCod = new String[] {""} ;
      T01NM2_A129BarCod = new int[1] ;
      T01NM2_A132BarCodReo = new byte[1] ;
      T01NM2_A130BarCodPar = new String[] {""} ;
      T01NM2_A194BarOrdLin = new short[1] ;
      T01NM2_A4035CCVal = new String[] {""} ;
      T01NM2_A12750CCOkLin = new byte[1] ;
      T01NM2_A12751CCOkDsc = new String[] {""} ;
      T01NM2_A13251CCMetodo = new String[] {""} ;
      T01NM2_A13252CCEspecif = new String[] {""} ;
      T01NM2_A14489CCEspecif2 = new String[] {""} ;
      T01NM2_A396EmprCod = new String[] {""} ;
      T01NM2_A4031CCTCod = new int[1] ;
      T01NM2_A4034CCTLin = new short[1] ;
      T01NM2_A758ProCod = new String[] {""} ;
      T01NM43_A4043CCTLinDsc = new String[] {""} ;
      T01NM44_A396EmprCod = new String[] {""} ;
      T01NM44_A129BarCod = new int[1] ;
      T01NM44_A132BarCodReo = new byte[1] ;
      T01NM44_A130BarCodPar = new String[] {""} ;
      T01NM44_A758ProCod = new String[] {""} ;
      T01NM44_A194BarOrdLin = new short[1] ;
      T01NM44_A4031CCTCod = new int[1] ;
      T01NM44_A4034CCTLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char2 = new String[1] ;
      GXt_char1 = "" ;
      Z5627CCTValD = "" ;
      GXv_char13 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int14 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int8 = new byte[1] ;
      ZV35OldCcVal = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tinccresultados__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tinccresultados__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tinccresultados__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tinccresultados__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tinccresultados__default(),
         new Object[] {
             new Object[] {
            T01NM2_A129BarCod, T01NM2_A132BarCodReo, T01NM2_A130BarCodPar, T01NM2_A194BarOrdLin, T01NM2_A4035CCVal, T01NM2_A12750CCOkLin, T01NM2_A12751CCOkDsc, T01NM2_A13251CCMetodo, T01NM2_A13252CCEspecif, T01NM2_A14489CCEspecif2,
            T01NM2_A396EmprCod, T01NM2_A4031CCTCod, T01NM2_A4034CCTLin, T01NM2_A758ProCod
            }
            , new Object[] {
            T01NM3_A129BarCod, T01NM3_A132BarCodReo, T01NM3_A130BarCodPar, T01NM3_A194BarOrdLin, T01NM3_A4035CCVal, T01NM3_A12750CCOkLin, T01NM3_A12751CCOkDsc, T01NM3_A13251CCMetodo, T01NM3_A13252CCEspecif, T01NM3_A14489CCEspecif2,
            T01NM3_A396EmprCod, T01NM3_A4031CCTCod, T01NM3_A4034CCTLin, T01NM3_A758ProCod
            }
            , new Object[] {
            T01NM4_A4043CCTLinDsc
            }
            , new Object[] {
            T01NM5_A4032CCOpeCod, T01NM5_n4032CCOpeCod, T01NM5_A4033CCFch, T01NM5_n4033CCFch, T01NM5_A4405CcDisp, T01NM5_n4405CcDisp, T01NM5_A3281CcObs, T01NM5_n3281CcObs, T01NM5_A396EmprCod, T01NM5_A129BarCod,
            T01NM5_A132BarCodReo, T01NM5_A130BarCodPar, T01NM5_A758ProCod, T01NM5_A194BarOrdLin, T01NM5_A4031CCTCod
            }
            , new Object[] {
            T01NM6_A4032CCOpeCod, T01NM6_n4032CCOpeCod, T01NM6_A4033CCFch, T01NM6_n4033CCFch, T01NM6_A4405CcDisp, T01NM6_n4405CcDisp, T01NM6_A3281CcObs, T01NM6_n3281CcObs, T01NM6_A396EmprCod, T01NM6_A129BarCod,
            T01NM6_A132BarCodReo, T01NM6_A130BarCodPar, T01NM6_A758ProCod, T01NM6_A194BarOrdLin, T01NM6_A4031CCTCod
            }
            , new Object[] {
            T01NM7_A407EmprNom, T01NM7_n407EmprNom
            }
            , new Object[] {
            T01NM8_A1909BarGraAca, T01NM8_A3137BarGraAca2, T01NM8_A1224BarEncAnh, T01NM8_A1223BarEncCom, T01NM8_A1911BarRdoA, T01NM8_A125BarAncAca1, T01NM8_A126BarAncAca2, T01NM8_A212BarSer, T01NM8_A1652BarSerDsc, T01NM8_A135BarColNom,
            T01NM8_A136BarColNum, T01NM8_A218BarTipCol, T01NM8_A4812BarEncCli, T01NM8_A9789BarItem5, T01NM8_A4466BarAcaAnh, T01NM8_A252CliCod, T01NM8_n252CliCod, T01NM8_A217BarTipArt, T01NM8_n217BarTipArt
            }
            , new Object[] {
            T01NM9_A759ProDsc
            }
            , new Object[] {
            T01NM10_A457FasCod, T01NM10_A603MaqCodBis
            }
            , new Object[] {
            T01NM11_A4036CCTDsc
            }
            , new Object[] {
            T01NM12_A460FasDsc
            }
            , new Object[] {
            T01NM13_A279CliNom
            }
            , new Object[] {
            T01NM14_A407EmprNom, T01NM14_n407EmprNom, T01NM14_A4032CCOpeCod, T01NM14_n4032CCOpeCod, T01NM14_A4033CCFch, T01NM14_n4033CCFch, T01NM14_A4405CcDisp, T01NM14_n4405CcDisp, T01NM14_A3281CcObs, T01NM14_n3281CcObs,
            T01NM14_A460FasDsc, T01NM14_A759ProDsc, T01NM14_A4036CCTDsc, T01NM14_A1909BarGraAca, T01NM14_A3137BarGraAca2, T01NM14_A1224BarEncAnh, T01NM14_A1223BarEncCom, T01NM14_A1911BarRdoA, T01NM14_A125BarAncAca1, T01NM14_A126BarAncAca2,
            T01NM14_A212BarSer, T01NM14_A1652BarSerDsc, T01NM14_A135BarColNom, T01NM14_A136BarColNum, T01NM14_A218BarTipCol, T01NM14_A4812BarEncCli, T01NM14_A279CliNom, T01NM14_A9789BarItem5, T01NM14_A4466BarAcaAnh, T01NM14_A396EmprCod,
            T01NM14_A129BarCod, T01NM14_A132BarCodReo, T01NM14_A130BarCodPar, T01NM14_A758ProCod, T01NM14_A194BarOrdLin, T01NM14_A4031CCTCod, T01NM14_A457FasCod, T01NM14_A603MaqCodBis, T01NM14_A252CliCod, T01NM14_n252CliCod,
            T01NM14_A217BarTipArt, T01NM14_n217BarTipArt
            }
            , new Object[] {
            T01NM15_A407EmprNom, T01NM15_n407EmprNom
            }
            , new Object[] {
            T01NM16_A1909BarGraAca, T01NM16_A3137BarGraAca2, T01NM16_A1224BarEncAnh, T01NM16_A1223BarEncCom, T01NM16_A1911BarRdoA, T01NM16_A125BarAncAca1, T01NM16_A126BarAncAca2, T01NM16_A212BarSer, T01NM16_A1652BarSerDsc, T01NM16_A135BarColNom,
            T01NM16_A136BarColNum, T01NM16_A218BarTipCol, T01NM16_A4812BarEncCli, T01NM16_A9789BarItem5, T01NM16_A4466BarAcaAnh, T01NM16_A252CliCod, T01NM16_n252CliCod, T01NM16_A217BarTipArt, T01NM16_n217BarTipArt
            }
            , new Object[] {
            T01NM17_A279CliNom
            }
            , new Object[] {
            T01NM18_A759ProDsc
            }
            , new Object[] {
            T01NM19_A457FasCod, T01NM19_A603MaqCodBis
            }
            , new Object[] {
            T01NM20_A460FasDsc
            }
            , new Object[] {
            T01NM21_A4036CCTDsc
            }
            , new Object[] {
            T01NM22_A396EmprCod, T01NM22_A129BarCod, T01NM22_A132BarCodReo, T01NM22_A130BarCodPar, T01NM22_A758ProCod, T01NM22_A194BarOrdLin, T01NM22_A4031CCTCod
            }
            , new Object[] {
            T01NM23_A396EmprCod, T01NM23_A129BarCod, T01NM23_A132BarCodReo, T01NM23_A130BarCodPar, T01NM23_A758ProCod, T01NM23_A194BarOrdLin, T01NM23_A4031CCTCod
            }
            , new Object[] {
            T01NM24_A396EmprCod, T01NM24_A129BarCod, T01NM24_A132BarCodReo, T01NM24_A130BarCodPar, T01NM24_A758ProCod, T01NM24_A194BarOrdLin, T01NM24_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NM28_A407EmprNom, T01NM28_n407EmprNom
            }
            , new Object[] {
            T01NM29_A1909BarGraAca, T01NM29_A3137BarGraAca2, T01NM29_A1224BarEncAnh, T01NM29_A1223BarEncCom, T01NM29_A1911BarRdoA, T01NM29_A125BarAncAca1, T01NM29_A126BarAncAca2, T01NM29_A212BarSer, T01NM29_A1652BarSerDsc, T01NM29_A135BarColNom,
            T01NM29_A136BarColNum, T01NM29_A218BarTipCol, T01NM29_A4812BarEncCli, T01NM29_A9789BarItem5, T01NM29_A4466BarAcaAnh, T01NM29_A252CliCod, T01NM29_n252CliCod, T01NM29_A217BarTipArt, T01NM29_n217BarTipArt
            }
            , new Object[] {
            T01NM30_A279CliNom
            }
            , new Object[] {
            T01NM31_A759ProDsc
            }
            , new Object[] {
            T01NM32_A457FasCod, T01NM32_A603MaqCodBis
            }
            , new Object[] {
            T01NM33_A460FasDsc
            }
            , new Object[] {
            T01NM34_A4036CCTDsc
            }
            , new Object[] {
            T01NM35_A396EmprCod, T01NM35_A129BarCod, T01NM35_A132BarCodReo, T01NM35_A130BarCodPar, T01NM35_A758ProCod, T01NM35_A194BarOrdLin, T01NM35_A4031CCTCod, T01NM35_A11294CcLn
            }
            , new Object[] {
            T01NM36_A396EmprCod, T01NM36_A129BarCod, T01NM36_A132BarCodReo, T01NM36_A130BarCodPar, T01NM36_A758ProCod, T01NM36_A194BarOrdLin, T01NM36_A4031CCTCod
            }
            , new Object[] {
            T01NM37_A129BarCod, T01NM37_A132BarCodReo, T01NM37_A130BarCodPar, T01NM37_A194BarOrdLin, T01NM37_A4043CCTLinDsc, T01NM37_A4035CCVal, T01NM37_A12750CCOkLin, T01NM37_A12751CCOkDsc, T01NM37_A13251CCMetodo, T01NM37_A13252CCEspecif,
            T01NM37_A14489CCEspecif2, T01NM37_A396EmprCod, T01NM37_A4031CCTCod, T01NM37_A4034CCTLin, T01NM37_A758ProCod
            }
            , new Object[] {
            T01NM38_A4043CCTLinDsc
            }
            , new Object[] {
            T01NM39_A396EmprCod, T01NM39_A129BarCod, T01NM39_A132BarCodReo, T01NM39_A130BarCodPar, T01NM39_A758ProCod, T01NM39_A194BarOrdLin, T01NM39_A4031CCTCod, T01NM39_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NM43_A4043CCTLinDsc
            }
            , new Object[] {
            T01NM44_A396EmprCod, T01NM44_A129BarCod, T01NM44_A132BarCodReo, T01NM44_A130BarCodPar, T01NM44_A758ProCod, T01NM44_A194BarOrdLin, T01NM44_A4031CCTCod, T01NM44_A4034CCTLin
            }
         }
      );
      AV55Pgmname = "ControlCalidadHTD.TINCCResultados" ;
   }

   private byte wcpOAV41BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z12750CCOkLin ;
   private byte GxWebError ;
   private byte AV38Ok_ope ;
   private byte A132BarCodReo ;
   private byte AV33Ok ;
   private byte AV41BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A14418CCfOk ;
   private byte A12750CCOkLin ;
   private byte Z218BarTipCol ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXt_int6 ;
   private byte Z14418CCfOk ;
   private byte GXv_int11[] ;
   private byte GXv_int8[] ;
   private byte ZV33Ok ;
   private short wcpOAV44BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z4034CCTLin ;
   private short nRcdDeleted_620 ;
   private short nRcdExists_620 ;
   private short nIsMod_620 ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short AV44BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short nBlankRcdCount620 ;
   private short RcdFound620 ;
   private short nBlankRcdUsr620 ;
   private short RcdFound619 ;
   private short Z1909BarGraAca ;
   private short Z3137BarGraAca2 ;
   private short Z125BarAncAca1 ;
   private short Z126BarAncAca2 ;
   private short Z4466BarAcaAnh ;
   private short Z217BarTipArt ;
   private short nIsDirty_619 ;
   private short nIsDirty_620 ;
   private short GXv_int14[] ;
   private short GXv_int9[] ;
   private int wcpOAV40BarCod ;
   private int wcpOAV45CCTCod ;
   private int Z129BarCod ;
   private int Z4031CCTCod ;
   private int Z4032CCOpeCod ;
   private int nRC_GXsfl_181 ;
   private int nGXsfl_181_idx=1 ;
   private int A4032CCOpeCod ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int AV40BarCod ;
   private int AV45CCTCod ;
   private int trnEnded ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtCCTCod_Enabled ;
   private int edtCCOpeCod_Enabled ;
   private int edtCCFch_Enabled ;
   private int edtCcDisp_Enabled ;
   private int edtCcObs_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtBarGraAca_Enabled ;
   private int edtBarGraAca2_Enabled ;
   private int edtBarEncAnh_Enabled ;
   private int edtBarEncCom_Enabled ;
   private int edtBarRdoA_Enabled ;
   private int edtBarAncAca1_Enabled ;
   private int edtBarAncAca2_Enabled ;
   private int edtMaqCodBis_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtBarTipArt_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarItem5_Enabled ;
   private int edtBarAcaAnh_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCVal_Enabled ;
   private int edtCCTValD_Enabled ;
   private int edtCCOkLin_Enabled ;
   private int edtCCOkDsc_Enabled ;
   private int edtCCMetodo_Enabled ;
   private int edtCCEspecif_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtCCOkDsc_Enabled ;
   private int defedtCCOkLin_Enabled ;
   private int defedtCCTValD_Enabled ;
   private int defedtCCTLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int10[] ;
   private int GXv_int7[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal Z1224BarEncAnh ;
   private java.math.BigDecimal Z1223BarEncCom ;
   private java.math.BigDecimal Z1911BarRdoA ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV42BarCodPar ;
   private String wcpOAV43ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z4405CcDisp ;
   private String Z4035CCVal ;
   private String Z13251CCMetodo ;
   private String Z13252CCEspecif ;
   private String O4035CCVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV37OpeSecc ;
   private String A603MaqCodBis ;
   private String AV34Ok_s ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A4035CCVal ;
   private String AV55Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String AV35OldCcVal ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV42BarCodPar ;
   private String AV43ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_181_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String edtCCOpeCod_Internalname ;
   private String edtCCOpeCod_Jsonclick ;
   private String edtCCFch_Internalname ;
   private String edtCCFch_Jsonclick ;
   private String edtCcDisp_Internalname ;
   private String A4405CcDisp ;
   private String edtCcDisp_Jsonclick ;
   private String edtCcObs_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String edtBarGraAca_Internalname ;
   private String edtBarGraAca_Jsonclick ;
   private String edtBarGraAca2_Internalname ;
   private String edtBarGraAca2_Jsonclick ;
   private String edtBarEncAnh_Internalname ;
   private String edtBarEncAnh_Jsonclick ;
   private String edtBarEncCom_Internalname ;
   private String edtBarEncCom_Jsonclick ;
   private String edtBarRdoA_Internalname ;
   private String edtBarRdoA_Jsonclick ;
   private String edtBarAncAca1_Internalname ;
   private String edtBarAncAca1_Jsonclick ;
   private String edtBarAncAca2_Internalname ;
   private String edtBarAncAca2_Jsonclick ;
   private String edtMaqCodBis_Internalname ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarEncCli_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Jsonclick ;
   private String edtBarTipArt_Internalname ;
   private String edtBarTipArt_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtBarItem5_Internalname ;
   private String A9789BarItem5 ;
   private String edtBarItem5_Jsonclick ;
   private String edtBarAcaAnh_Internalname ;
   private String edtBarAcaAnh_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String sMode620 ;
   private String edtCCTLin_Internalname ;
   private String edtCCTLinDsc_Internalname ;
   private String edtCCVal_Internalname ;
   private String edtCCTValD_Internalname ;
   private String edtCCOkLin_Internalname ;
   private String edtCCOkDsc_Internalname ;
   private String edtCCMetodo_Internalname ;
   private String edtCCEspecif_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode619 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A4043CCTLinDsc ;
   private String A13251CCMetodo ;
   private String A13252CCEspecif ;
   private String T4035CCVal ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV11EmprNom ;
   private String Z407EmprNom ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z4812BarEncCli ;
   private String Z9789BarItem5 ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z457FasCod ;
   private String Z603MaqCodBis ;
   private String Z460FasDsc ;
   private String Z4036CCTDsc ;
   private String Z4043CCTLinDsc ;
   private String sGXsfl_181_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCVal_Jsonclick ;
   private String edtCCTValD_Jsonclick ;
   private String edtCCOkLin_Jsonclick ;
   private String edtCCOkDsc_Jsonclick ;
   private String edtCCMetodo_Jsonclick ;
   private String edtCCEspecif_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV35OldCcVal ;
   private java.util.Date Z4033CCFch ;
   private java.util.Date A4033CCFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4032CCOpeCod ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_181_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n407EmprNom ;
   private boolean n4033CCFch ;
   private boolean n4405CcDisp ;
   private boolean n3281CcObs ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z3281CcObs ;
   private String Z12751CCOkDsc ;
   private String Z14489CCEspecif2 ;
   private String AV39Inc_obs ;
   private String A3281CcObs ;
   private String A14489CCEspecif2 ;
   private String A5627CCTValD ;
   private String A12751CCOkDsc ;
   private String Z5627CCTValD ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV48WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01NM7_A407EmprNom ;
   private boolean[] T01NM7_n407EmprNom ;
   private short[] T01NM8_A1909BarGraAca ;
   private short[] T01NM8_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T01NM8_A1224BarEncAnh ;
   private java.math.BigDecimal[] T01NM8_A1223BarEncCom ;
   private java.math.BigDecimal[] T01NM8_A1911BarRdoA ;
   private short[] T01NM8_A125BarAncAca1 ;
   private short[] T01NM8_A126BarAncAca2 ;
   private String[] T01NM8_A212BarSer ;
   private String[] T01NM8_A1652BarSerDsc ;
   private String[] T01NM8_A135BarColNom ;
   private int[] T01NM8_A136BarColNum ;
   private byte[] T01NM8_A218BarTipCol ;
   private String[] T01NM8_A4812BarEncCli ;
   private String[] T01NM8_A9789BarItem5 ;
   private short[] T01NM8_A4466BarAcaAnh ;
   private int[] T01NM8_A252CliCod ;
   private boolean[] T01NM8_n252CliCod ;
   private short[] T01NM8_A217BarTipArt ;
   private boolean[] T01NM8_n217BarTipArt ;
   private String[] T01NM13_A279CliNom ;
   private String[] T01NM9_A759ProDsc ;
   private String[] T01NM10_A457FasCod ;
   private String[] T01NM10_A603MaqCodBis ;
   private String[] T01NM12_A460FasDsc ;
   private String[] T01NM11_A4036CCTDsc ;
   private String[] T01NM14_A407EmprNom ;
   private boolean[] T01NM14_n407EmprNom ;
   private int[] T01NM14_A4032CCOpeCod ;
   private boolean[] T01NM14_n4032CCOpeCod ;
   private java.util.Date[] T01NM14_A4033CCFch ;
   private boolean[] T01NM14_n4033CCFch ;
   private String[] T01NM14_A4405CcDisp ;
   private boolean[] T01NM14_n4405CcDisp ;
   private String[] T01NM14_A3281CcObs ;
   private boolean[] T01NM14_n3281CcObs ;
   private String[] T01NM14_A460FasDsc ;
   private String[] T01NM14_A759ProDsc ;
   private String[] T01NM14_A4036CCTDsc ;
   private short[] T01NM14_A1909BarGraAca ;
   private short[] T01NM14_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T01NM14_A1224BarEncAnh ;
   private java.math.BigDecimal[] T01NM14_A1223BarEncCom ;
   private java.math.BigDecimal[] T01NM14_A1911BarRdoA ;
   private short[] T01NM14_A125BarAncAca1 ;
   private short[] T01NM14_A126BarAncAca2 ;
   private String[] T01NM14_A212BarSer ;
   private String[] T01NM14_A1652BarSerDsc ;
   private String[] T01NM14_A135BarColNom ;
   private int[] T01NM14_A136BarColNum ;
   private byte[] T01NM14_A218BarTipCol ;
   private String[] T01NM14_A4812BarEncCli ;
   private String[] T01NM14_A279CliNom ;
   private String[] T01NM14_A9789BarItem5 ;
   private short[] T01NM14_A4466BarAcaAnh ;
   private String[] T01NM14_A396EmprCod ;
   private int[] T01NM14_A129BarCod ;
   private byte[] T01NM14_A132BarCodReo ;
   private String[] T01NM14_A130BarCodPar ;
   private String[] T01NM14_A758ProCod ;
   private short[] T01NM14_A194BarOrdLin ;
   private int[] T01NM14_A4031CCTCod ;
   private String[] T01NM14_A457FasCod ;
   private String[] T01NM14_A603MaqCodBis ;
   private int[] T01NM14_A252CliCod ;
   private boolean[] T01NM14_n252CliCod ;
   private short[] T01NM14_A217BarTipArt ;
   private boolean[] T01NM14_n217BarTipArt ;
   private String[] T01NM15_A407EmprNom ;
   private boolean[] T01NM15_n407EmprNom ;
   private short[] T01NM16_A1909BarGraAca ;
   private short[] T01NM16_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T01NM16_A1224BarEncAnh ;
   private java.math.BigDecimal[] T01NM16_A1223BarEncCom ;
   private java.math.BigDecimal[] T01NM16_A1911BarRdoA ;
   private short[] T01NM16_A125BarAncAca1 ;
   private short[] T01NM16_A126BarAncAca2 ;
   private String[] T01NM16_A212BarSer ;
   private String[] T01NM16_A1652BarSerDsc ;
   private String[] T01NM16_A135BarColNom ;
   private int[] T01NM16_A136BarColNum ;
   private byte[] T01NM16_A218BarTipCol ;
   private String[] T01NM16_A4812BarEncCli ;
   private String[] T01NM16_A9789BarItem5 ;
   private short[] T01NM16_A4466BarAcaAnh ;
   private int[] T01NM16_A252CliCod ;
   private boolean[] T01NM16_n252CliCod ;
   private short[] T01NM16_A217BarTipArt ;
   private boolean[] T01NM16_n217BarTipArt ;
   private String[] T01NM17_A279CliNom ;
   private String[] T01NM18_A759ProDsc ;
   private String[] T01NM19_A457FasCod ;
   private String[] T01NM19_A603MaqCodBis ;
   private String[] T01NM20_A460FasDsc ;
   private String[] T01NM21_A4036CCTDsc ;
   private String[] T01NM22_A396EmprCod ;
   private int[] T01NM22_A129BarCod ;
   private byte[] T01NM22_A132BarCodReo ;
   private String[] T01NM22_A130BarCodPar ;
   private String[] T01NM22_A758ProCod ;
   private short[] T01NM22_A194BarOrdLin ;
   private int[] T01NM22_A4031CCTCod ;
   private int[] T01NM6_A4032CCOpeCod ;
   private boolean[] T01NM6_n4032CCOpeCod ;
   private java.util.Date[] T01NM6_A4033CCFch ;
   private boolean[] T01NM6_n4033CCFch ;
   private String[] T01NM6_A4405CcDisp ;
   private boolean[] T01NM6_n4405CcDisp ;
   private String[] T01NM6_A3281CcObs ;
   private boolean[] T01NM6_n3281CcObs ;
   private String[] T01NM6_A396EmprCod ;
   private int[] T01NM6_A129BarCod ;
   private byte[] T01NM6_A132BarCodReo ;
   private String[] T01NM6_A130BarCodPar ;
   private String[] T01NM6_A758ProCod ;
   private short[] T01NM6_A194BarOrdLin ;
   private int[] T01NM6_A4031CCTCod ;
   private String[] T01NM23_A396EmprCod ;
   private int[] T01NM23_A129BarCod ;
   private byte[] T01NM23_A132BarCodReo ;
   private String[] T01NM23_A130BarCodPar ;
   private String[] T01NM23_A758ProCod ;
   private short[] T01NM23_A194BarOrdLin ;
   private int[] T01NM23_A4031CCTCod ;
   private String[] T01NM24_A396EmprCod ;
   private int[] T01NM24_A129BarCod ;
   private byte[] T01NM24_A132BarCodReo ;
   private String[] T01NM24_A130BarCodPar ;
   private String[] T01NM24_A758ProCod ;
   private short[] T01NM24_A194BarOrdLin ;
   private int[] T01NM24_A4031CCTCod ;
   private int[] T01NM5_A4032CCOpeCod ;
   private boolean[] T01NM5_n4032CCOpeCod ;
   private java.util.Date[] T01NM5_A4033CCFch ;
   private boolean[] T01NM5_n4033CCFch ;
   private String[] T01NM5_A4405CcDisp ;
   private boolean[] T01NM5_n4405CcDisp ;
   private String[] T01NM5_A3281CcObs ;
   private boolean[] T01NM5_n3281CcObs ;
   private String[] T01NM5_A396EmprCod ;
   private int[] T01NM5_A129BarCod ;
   private byte[] T01NM5_A132BarCodReo ;
   private String[] T01NM5_A130BarCodPar ;
   private String[] T01NM5_A758ProCod ;
   private short[] T01NM5_A194BarOrdLin ;
   private int[] T01NM5_A4031CCTCod ;
   private String[] T01NM28_A407EmprNom ;
   private boolean[] T01NM28_n407EmprNom ;
   private short[] T01NM29_A1909BarGraAca ;
   private short[] T01NM29_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T01NM29_A1224BarEncAnh ;
   private java.math.BigDecimal[] T01NM29_A1223BarEncCom ;
   private java.math.BigDecimal[] T01NM29_A1911BarRdoA ;
   private short[] T01NM29_A125BarAncAca1 ;
   private short[] T01NM29_A126BarAncAca2 ;
   private String[] T01NM29_A212BarSer ;
   private String[] T01NM29_A1652BarSerDsc ;
   private String[] T01NM29_A135BarColNom ;
   private int[] T01NM29_A136BarColNum ;
   private byte[] T01NM29_A218BarTipCol ;
   private String[] T01NM29_A4812BarEncCli ;
   private String[] T01NM29_A9789BarItem5 ;
   private short[] T01NM29_A4466BarAcaAnh ;
   private int[] T01NM29_A252CliCod ;
   private boolean[] T01NM29_n252CliCod ;
   private short[] T01NM29_A217BarTipArt ;
   private boolean[] T01NM29_n217BarTipArt ;
   private String[] T01NM30_A279CliNom ;
   private String[] T01NM31_A759ProDsc ;
   private String[] T01NM32_A457FasCod ;
   private String[] T01NM32_A603MaqCodBis ;
   private String[] T01NM33_A460FasDsc ;
   private String[] T01NM34_A4036CCTDsc ;
   private String[] T01NM35_A396EmprCod ;
   private int[] T01NM35_A129BarCod ;
   private byte[] T01NM35_A132BarCodReo ;
   private String[] T01NM35_A130BarCodPar ;
   private String[] T01NM35_A758ProCod ;
   private short[] T01NM35_A194BarOrdLin ;
   private int[] T01NM35_A4031CCTCod ;
   private short[] T01NM35_A11294CcLn ;
   private String[] T01NM36_A396EmprCod ;
   private int[] T01NM36_A129BarCod ;
   private byte[] T01NM36_A132BarCodReo ;
   private String[] T01NM36_A130BarCodPar ;
   private String[] T01NM36_A758ProCod ;
   private short[] T01NM36_A194BarOrdLin ;
   private int[] T01NM36_A4031CCTCod ;
   private int[] T01NM37_A129BarCod ;
   private byte[] T01NM37_A132BarCodReo ;
   private String[] T01NM37_A130BarCodPar ;
   private short[] T01NM37_A194BarOrdLin ;
   private String[] T01NM37_A4043CCTLinDsc ;
   private String[] T01NM37_A4035CCVal ;
   private byte[] T01NM37_A12750CCOkLin ;
   private String[] T01NM37_A12751CCOkDsc ;
   private String[] T01NM37_A13251CCMetodo ;
   private String[] T01NM37_A13252CCEspecif ;
   private String[] T01NM37_A14489CCEspecif2 ;
   private String[] T01NM37_A396EmprCod ;
   private int[] T01NM37_A4031CCTCod ;
   private short[] T01NM37_A4034CCTLin ;
   private String[] T01NM37_A758ProCod ;
   private String[] T01NM4_A4043CCTLinDsc ;
   private String[] T01NM38_A4043CCTLinDsc ;
   private String[] T01NM39_A396EmprCod ;
   private int[] T01NM39_A129BarCod ;
   private byte[] T01NM39_A132BarCodReo ;
   private String[] T01NM39_A130BarCodPar ;
   private String[] T01NM39_A758ProCod ;
   private short[] T01NM39_A194BarOrdLin ;
   private int[] T01NM39_A4031CCTCod ;
   private short[] T01NM39_A4034CCTLin ;
   private int[] T01NM3_A129BarCod ;
   private byte[] T01NM3_A132BarCodReo ;
   private String[] T01NM3_A130BarCodPar ;
   private short[] T01NM3_A194BarOrdLin ;
   private String[] T01NM3_A4035CCVal ;
   private byte[] T01NM3_A12750CCOkLin ;
   private String[] T01NM3_A12751CCOkDsc ;
   private String[] T01NM3_A13251CCMetodo ;
   private String[] T01NM3_A13252CCEspecif ;
   private String[] T01NM3_A14489CCEspecif2 ;
   private String[] T01NM3_A396EmprCod ;
   private int[] T01NM3_A4031CCTCod ;
   private short[] T01NM3_A4034CCTLin ;
   private String[] T01NM3_A758ProCod ;
   private int[] T01NM2_A129BarCod ;
   private byte[] T01NM2_A132BarCodReo ;
   private String[] T01NM2_A130BarCodPar ;
   private short[] T01NM2_A194BarOrdLin ;
   private String[] T01NM2_A4035CCVal ;
   private byte[] T01NM2_A12750CCOkLin ;
   private String[] T01NM2_A12751CCOkDsc ;
   private String[] T01NM2_A13251CCMetodo ;
   private String[] T01NM2_A13252CCEspecif ;
   private String[] T01NM2_A14489CCEspecif2 ;
   private String[] T01NM2_A396EmprCod ;
   private int[] T01NM2_A4031CCTCod ;
   private short[] T01NM2_A4034CCTLin ;
   private String[] T01NM2_A758ProCod ;
   private String[] T01NM43_A4043CCTLinDsc ;
   private String[] T01NM44_A396EmprCod ;
   private int[] T01NM44_A129BarCod ;
   private byte[] T01NM44_A132BarCodReo ;
   private String[] T01NM44_A130BarCodPar ;
   private String[] T01NM44_A758ProCod ;
   private short[] T01NM44_A194BarOrdLin ;
   private int[] T01NM44_A4031CCTCod ;
   private short[] T01NM44_A4034CCTLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV46WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV47TrnContext ;
}

final  class tinccresultados__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccresultados__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccresultados__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccresultados__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccresultados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NM2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, CCEspecif2, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, CCEspecif2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, CCEspecif2, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM4", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM5", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?  FOR UPDATE OF CCOpeCod, CCFch, CcDisp, CcObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM6", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM8", "SELECT BarGraAca, BarGraAca2, BarEncAnh, BarEncCom, BarRdoA, BarAncAca1, BarAncAca2, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarEncCli, BarItem5, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM9", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM10", "SELECT FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM11", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM12", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM14", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.CCOpeCod, TM1.CCFch, TM1.CcDisp, TM1.CcObs, T7.FasDsc, T5.ProDsc, T8.CCTDsc, T3.BarGraAca, T3.BarGraAca2, T3.BarEncAnh, T3.BarEncCom, T3.BarRdoA, T3.BarAncAca1, T3.BarAncAca2, T3.BarSer, T3.BarSerDsc, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T3.BarEncCli, T4.CliNom, T3.BarItem5, T3.BarAcaAnh, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod, T6.FasCod, T6.MaqCodBis, T3.CliCod, T3.BarTipArt FROM (((((((TXPCC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) INNER JOIN TXPBARFAS T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar AND T6.ProCod = TM1.ProCod AND T6.BarOrdLin = TM1.BarOrdLin) LEFT JOIN TXPFASPRO T7 ON T7.EmprCod = TM1.EmprCod AND T7.FasCod = T6.FasCod) INNER JOIN TXPCCDef T8 ON T8.EmprCod = TM1.EmprCod AND T8.CCTCod = TM1.CCTCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM16", "SELECT BarGraAca, BarGraAca2, BarEncAnh, BarEncCom, BarRdoA, BarAncAca1, BarAncAca2, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarEncCli, BarItem5, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM17", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM18", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM19", "SELECT FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM20", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM21", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM22", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin > ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and CCTCod > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NM24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin < ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and CCTCod < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NM25", "INSERT INTO TXPCC(CCOpeCod, CCFch, CcDisp, CcObs, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCFchUti, CcUltn, CCOk, CCOkFch, CCOkUsu, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T01NM26", "UPDATE TXPCC SET CCOpeCod=?, CCFch=?, CcDisp=?, CcObs=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T01NM27", "DELETE FROM TXPCC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new ForEachCursor("T01NM28", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM29", "SELECT BarGraAca, BarGraAca2, BarEncAnh, BarEncCom, BarRdoA, BarAncAca1, BarAncAca2, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarEncCli, BarItem5, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM30", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM31", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM32", "SELECT FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM33", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM34", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NM36", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM37", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T2.CCTLinDsc, T1.CCVal, T1.CCOkLin, T1.CCOkDsc, T1.CCMetodo, T1.CCEspecif, T1.CCEspecif2, T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.ProCod FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM38", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM39", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NM40", "INSERT INTO TXPCC1(BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, CCEspecif2, EmprCod, CCTCod, CCTLin, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T01NM41", "UPDATE TXPCC1 SET CCVal=?, CCOkLin=?, CCOkDsc=?, CCMetodo=?, CCEspecif=?, CCEspecif2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T01NM42", "DELETE FROM TXPCC1  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new ForEachCursor("T01NM43", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NM44", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 3);
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((String[]) buf[12])[0] = rslt.getString(9, 8);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 3);
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((String[]) buf[12])[0] = rslt.getString(9, 8);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 28);
               ((String[]) buf[11])[0] = rslt.getString(7, 40);
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((String[]) buf[20])[0] = rslt.getString(16, 16);
               ((String[]) buf[21])[0] = rslt.getString(17, 26);
               ((String[]) buf[22])[0] = rslt.getString(18, 13);
               ((int[]) buf[23])[0] = rslt.getInt(19);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               ((String[]) buf[25])[0] = rslt.getString(21, 20);
               ((String[]) buf[26])[0] = rslt.getString(22, 30);
               ((String[]) buf[27])[0] = rslt.getString(23, 20);
               ((short[]) buf[28])[0] = rslt.getShort(24);
               ((String[]) buf[29])[0] = rslt.getString(25, 3);
               ((int[]) buf[30])[0] = rslt.getInt(26);
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((String[]) buf[32])[0] = rslt.getString(28, 1);
               ((String[]) buf[33])[0] = rslt.getString(29, 8);
               ((short[]) buf[34])[0] = rslt.getShort(30);
               ((int[]) buf[35])[0] = rslt.getInt(31);
               ((String[]) buf[36])[0] = rslt.getString(32, 8);
               ((String[]) buf[37])[0] = rslt.getString(33, 6);
               ((int[]) buf[38])[0] = rslt.getInt(34);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 35 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 21 :
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
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setInt(28, ((Number) parms[27]).intValue());
               return;
            case 22 :
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
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setInt(28, ((Number) parms[27]).intValue());
               return;
            case 23 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 400);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               stmt.setString(9, (String)parms[12], 8);
               stmt.setShort(10, ((Number) parms[13]).shortValue());
               stmt.setInt(11, ((Number) parms[14]).intValue());
               return;
            case 24 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 400);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               stmt.setString(9, (String)parms[12], 8);
               stmt.setShort(10, ((Number) parms[13]).shortValue());
               stmt.setInt(11, ((Number) parms[14]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 38 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 40);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 200, false);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 30);
               stmt.setVarchar(10, (String)parms[9], 300, false);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 8);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setVarchar(3, (String)parms[2], 200, false);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setVarchar(6, (String)parms[5], 300, false);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

