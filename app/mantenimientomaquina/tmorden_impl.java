package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmorden_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_13U1232( A396EmprCod, A9425OMCod, A9426OMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action54") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A11446OMMEquCod = httpContext.GetPar( "OMMEquCod") ;
         A11447OMMSEqCod = httpContext.GetPar( "OMMSEqCod") ;
         A11448OMMPieCod = httpContext.GetPar( "OMMPieCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_54_13U1531( A396EmprCod, A9425OMCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action55") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9430TMCod = (int)(GXutil.lval( httpContext.GetPar( "TMCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_55_13U1530( A396EmprCod, A9425OMCod, A9430TMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"SMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9517SMDsc = httpContext.GetPar( "SMDsc") ;
         n9517SMDsc = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgasmcod13U0( A396EmprCod, A9517SMDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"SMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9517SMDsc = httpContext.GetPar( "SMDsc") ;
         n9517SMDsc = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgasmcod13U0( A396EmprCod, A9517SMDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"SMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9428SMCod = httpContext.GetPar( "h9428SMCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcasmcod13U1232( A396EmprCod, h9428SMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"OMCOD") == 0 )
      {
         AV14OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OMCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx8asaomcod13U1232( AV14OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"OMCOD") == 0 )
      {
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
         gx9asaomcod13U1232( Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel51"+"_"+"OMMPIEDC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A11446OMMEquCod = httpContext.GetPar( "OMMEquCod") ;
         A11447OMMSEqCod = httpContext.GetPar( "OMMSEqCod") ;
         A11448OMMPieCod = httpContext.GetPar( "OMMPieCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx51asaommpiedc13U1531( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel52"+"_"+"OMMSQDC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A11446OMMEquCod = httpContext.GetPar( "OMMEquCod") ;
         A11447OMMSEqCod = httpContext.GetPar( "OMMSEqCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx52asaommsqdc13U1531( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel53"+"_"+"OMMEQDC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A11446OMMEquCod = httpContext.GetPar( "OMMEquCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx53asaommeqdc13U1531( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_57( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_58") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_58( A396EmprCod, A9426OMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_59") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9429PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_59( A396EmprCod, A9429PMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_60") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = (int)(GXutil.lval( httpContext.GetPar( "SMCod"))) ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_60( A396EmprCod, A9428SMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_61") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14492OMTipoId = (short)(GXutil.lval( httpContext.GetPar( "OMTipoId"))) ;
         n14492OMTipoId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_61( A396EmprCod, A14492OMTipoId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_62") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_62( A396EmprCod, A9426OMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_63") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_63( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_64") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_64( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_66") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A11446OMMEquCod = httpContext.GetPar( "OMMEquCod") ;
         A11447OMMSEqCod = httpContext.GetPar( "OMMSEqCod") ;
         A11448OMMPieCod = httpContext.GetPar( "OMMPieCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_66( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_68") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = (int)(GXutil.lval( httpContext.GetPar( "TMCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_68( A396EmprCod, A9430TMCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_equipos") == 0 )
      {
         gxnrgridlevel_equipos_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_tareas") == 0 )
      {
         gxnrgridlevel_tareas_newrow_invoke( ) ;
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
            AV24EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24EmprCod, "@!"))));
            AV14OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OMCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
            AV20Accion = httpContext.GetPar( "Accion") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Accion", AV20Accion);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Accion, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ordenes de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOMMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_equipos_newrow_invoke( )
   {
      nRC_GXsfl_136 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_136"))) ;
      nGXsfl_136_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_136_idx"))) ;
      sGXsfl_136_idx = httpContext.GetPar( "sGXsfl_136_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_equipos_newrow( ) ;
      /* End function gxnrGridlevel_equipos_newrow_invoke */
   }

   public void gxnrgridlevel_tareas_newrow_invoke( )
   {
      nRC_GXsfl_150 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_150"))) ;
      nGXsfl_150_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_150_idx"))) ;
      sGXsfl_150_idx = httpContext.GetPar( "sGXsfl_150_idx") ;
      edtTMCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Horizontalalignment", edtTMCod_Horizontalalignment, !bGXsfl_150_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_tareas_newrow( ) ;
      /* End function gxnrGridlevel_tareas_newrow_invoke */
   }

   public tmorden_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmorden_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmorden_impl.class ));
   }

   public tmorden_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
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
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMCod_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedommaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockommaqcod_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblockommaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_ommaqcod.setProperty("Caption", Combo_ommaqcod_Caption);
      ucCombo_ommaqcod.setProperty("Cls", Combo_ommaqcod_Cls);
      ucCombo_ommaqcod.setProperty("EmptyItem", Combo_ommaqcod_Emptyitem);
      ucCombo_ommaqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV36DDO_TitleSettingsIcons);
      ucCombo_ommaqcod.setProperty("DropDownOptionsData", AV43OMMaqCod_Data);
      ucCombo_ommaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_ommaqcod_Internalname, "COMBO_OMMAQCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMaqCod_Internalname, httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqCod_Visible, edtOMMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMPri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMPri_Internalname, httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMPri_Internalname, GXutil.ltrim( localUtil.ntoc( A14495OMPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14495OMPri), "9") : localUtil.format( DecimalUtil.doubleToDec(A14495OMPri), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMPri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMPri_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAccion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavAccion_Internalname, httpContext.getMessage( "A", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavAccion_Internalname, GXutil.rtrim( AV20Accion), GXutil.rtrim( localUtil.format( AV20Accion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAccion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAccion_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMode_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavMode_Internalname, httpContext.getMessage( "Mode", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavMode_Internalname, GXutil.rtrim( Gx_mode), GXutil.rtrim( localUtil.format( Gx_mode, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMode_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMode_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMFchPre_Internalname, httpContext.getMessage( "Fecha Prevista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOMFchPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchPre_Internalname, localUtil.format(A9438OMFchPre, "99/99/99"), localUtil.format( A9438OMFchPre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchPre_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbOMEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbOMEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMOrden.htm");
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMFchCre_Internalname, httpContext.getMessage( "F. Creación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtOMFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCre_Internalname, localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9436OMFchCre, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, divUnnamedtable3_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSmcod_cell_Internalname, 1, 0, "px", 0, "px", divSmcod_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtSMCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMCod_Internalname, httpContext.getMessage( "Solicitud", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMCod_Internalname, GXutil.rtrim( h9428SMCod), GXutil.rtrim( localUtil.format( h9428SMCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtSMCod_Visible, edtSMCod_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPmcod_cell_Internalname, 1, 0, "px", 0, "px", divPmcod_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtPMCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMCod_Internalname, httpContext.getMessage( "Preventivo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtPMCod_Visible, edtPMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchCer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMFchCer_Internalname, httpContext.getMessage( "Creacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtOMFchCer_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCer_Internalname, localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9439OMFchCer, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchCer_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchCer_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCer_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMUsuCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMUsuCre_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMUsuCre_Internalname, GXutil.rtrim( A9437OMUsuCre), GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMUsuCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedomtipoid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockomtipoid_Internalname, httpContext.getMessage( "Categoria", ""), "", "", lblTextblockomtipoid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_omtipoid.setProperty("Caption", Combo_omtipoid_Caption);
      ucCombo_omtipoid.setProperty("Cls", Combo_omtipoid_Cls);
      ucCombo_omtipoid.setProperty("DropDownOptionsTitleSettingsIcons", AV36DDO_TitleSettingsIcons);
      ucCombo_omtipoid.setProperty("DropDownOptionsData", AV46OMTipoId_Data);
      ucCombo_omtipoid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_omtipoid_Internalname, "COMBO_OMTIPOIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMTipoId_Internalname, httpContext.getMessage( "Tipo Mantenimiento", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMTipoId_Internalname, GXutil.ltrim( localUtil.ntoc( A14492OMTipoId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14492OMTipoId), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMTipoId_Jsonclick, 0, "Attribute", "", "", "", "", edtOMTipoId_Visible, edtOMTipoId_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextmensaje_Internalname, lblTextmensaje_Caption, "", "", lblTextmensaje_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextWarning", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      ucDvpanel_tabletextonota.setProperty("Width", Dvpanel_tabletextonota_Width);
      ucDvpanel_tabletextonota.setProperty("AutoWidth", Dvpanel_tabletextonota_Autowidth);
      ucDvpanel_tabletextonota.setProperty("AutoHeight", Dvpanel_tabletextonota_Autoheight);
      ucDvpanel_tabletextonota.setProperty("Cls", Dvpanel_tabletextonota_Cls);
      ucDvpanel_tabletextonota.setProperty("Title", Dvpanel_tabletextonota_Title);
      ucDvpanel_tabletextonota.setProperty("Collapsible", Dvpanel_tabletextonota_Collapsible);
      ucDvpanel_tabletextonota.setProperty("Collapsed", Dvpanel_tabletextonota_Collapsed);
      ucDvpanel_tabletextonota.setProperty("ShowCollapseIcon", Dvpanel_tabletextonota_Showcollapseicon);
      ucDvpanel_tabletextonota.setProperty("IconPosition", Dvpanel_tabletextonota_Iconposition);
      ucDvpanel_tabletextonota.setProperty("AutoScroll", Dvpanel_tabletextonota_Autoscroll);
      ucDvpanel_tabletextonota.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tabletextonota_Internalname, "DVPANEL_TABLETEXTONOTAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLETEXTONOTAContainer"+"TableTextoNota"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabletextonota_Internalname, tblTabletextonota_Internalname, "", "TableData", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableomtxt_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockomtxt_Internalname, httpContext.getMessage( "Desc del Trabajo", ""), "", "", lblTextblockomtxt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMTxt_Internalname, httpContext.getMessage( "Desc del Trabajo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOMTxt_Internalname, A9433OMTxt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", (short)(0), 1, edtOMTxt_Enabled, 1, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td id=\""+cellOmnot_cell_Internalname+"\"  class='"+cellOmnot_cell_Class+"'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableomnot_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockomnot_Internalname, httpContext.getMessage( "Notas", ""), "", "", lblTextblockomnot_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMNot_Internalname, httpContext.getMessage( "Nota", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOMNot_Internalname, A9464OMNot, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", (short)(0), edtOMNot_Visible, edtOMNot_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divTableequipotarea_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_tableleaflevel_equipos_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tableleaflevel_equipos_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableleaflevel_equipos.setProperty("Width", Dvpanel_tableleaflevel_equipos_Width);
      ucDvpanel_tableleaflevel_equipos.setProperty("AutoWidth", Dvpanel_tableleaflevel_equipos_Autowidth);
      ucDvpanel_tableleaflevel_equipos.setProperty("AutoHeight", Dvpanel_tableleaflevel_equipos_Autoheight);
      ucDvpanel_tableleaflevel_equipos.setProperty("Cls", Dvpanel_tableleaflevel_equipos_Cls);
      ucDvpanel_tableleaflevel_equipos.setProperty("Title", Dvpanel_tableleaflevel_equipos_Title);
      ucDvpanel_tableleaflevel_equipos.setProperty("Collapsible", Dvpanel_tableleaflevel_equipos_Collapsible);
      ucDvpanel_tableleaflevel_equipos.setProperty("Collapsed", Dvpanel_tableleaflevel_equipos_Collapsed);
      ucDvpanel_tableleaflevel_equipos.setProperty("ShowCollapseIcon", Dvpanel_tableleaflevel_equipos_Showcollapseicon);
      ucDvpanel_tableleaflevel_equipos.setProperty("IconPosition", Dvpanel_tableleaflevel_equipos_Iconposition);
      ucDvpanel_tableleaflevel_equipos.setProperty("AutoScroll", Dvpanel_tableleaflevel_equipos_Autoscroll);
      ucDvpanel_tableleaflevel_equipos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableleaflevel_equipos_Internalname, "DVPANEL_TABLELEAFLEVEL_EQUIPOSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLELEAFLEVEL_EQUIPOSContainer"+"TableLeafLevel_Equipos"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_equipos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_equipos( ) ;
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
      ucDvpanel_tableleaflevel_tareas.setProperty("Width", Dvpanel_tableleaflevel_tareas_Width);
      ucDvpanel_tableleaflevel_tareas.setProperty("AutoWidth", Dvpanel_tableleaflevel_tareas_Autowidth);
      ucDvpanel_tableleaflevel_tareas.setProperty("AutoHeight", Dvpanel_tableleaflevel_tareas_Autoheight);
      ucDvpanel_tableleaflevel_tareas.setProperty("Cls", Dvpanel_tableleaflevel_tareas_Cls);
      ucDvpanel_tableleaflevel_tareas.setProperty("Title", Dvpanel_tableleaflevel_tareas_Title);
      ucDvpanel_tableleaflevel_tareas.setProperty("Collapsible", Dvpanel_tableleaflevel_tareas_Collapsible);
      ucDvpanel_tableleaflevel_tareas.setProperty("Collapsed", Dvpanel_tableleaflevel_tareas_Collapsed);
      ucDvpanel_tableleaflevel_tareas.setProperty("ShowCollapseIcon", Dvpanel_tableleaflevel_tareas_Showcollapseicon);
      ucDvpanel_tableleaflevel_tareas.setProperty("IconPosition", Dvpanel_tableleaflevel_tareas_Iconposition);
      ucDvpanel_tableleaflevel_tareas.setProperty("AutoScroll", Dvpanel_tableleaflevel_tareas_Autoscroll);
      ucDvpanel_tableleaflevel_tareas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableleaflevel_tareas_Internalname, "DVPANEL_TABLELEAFLEVEL_TAREASContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLELEAFLEVEL_TAREASContainer"+"TableLeafLevel_Tareas"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_tareas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_tareas( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtncontrol_Internalname, "", httpContext.getMessage( "Control", ""), bttBtncontrol_Jsonclick, 5, httpContext.getMessage( "Control", ""), "", StyleString, ClassString, bttBtncontrol_Visible, bttBtncontrol_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONTROL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrepuestos_Internalname, "", httpContext.getMessage( "Respuestos", ""), bttBtnrepuestos_Jsonclick, 5, httpContext.getMessage( "Respuestos", ""), "", StyleString, ClassString, bttBtnrepuestos_Visible, bttBtnrepuestos_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOREPUESTOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmanodeobra_Internalname, "", httpContext.getMessage( "Mano de Obra", ""), bttBtnmanodeobra_Jsonclick, 5, httpContext.getMessage( "Mano de Obra", ""), "", StyleString, ClassString, bttBtnmanodeobra_Visible, bttBtnmanodeobra_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOMANODEOBRA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrden.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV60Pgmname), GXutil.rtrim( localUtil.format( AV60Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_ommaqcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboommaqcod_Internalname, GXutil.rtrim( AV44ComboOMMaqCod), GXutil.rtrim( localUtil.format( AV44ComboOMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboommaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboommaqcod_Visible, edtavComboommaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_omtipoid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboomtipoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV47ComboOMTipoId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboomtipoid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV47ComboOMTipoId), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV47ComboOMTipoId), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboomtipoid_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboomtipoid_Visible, edtavComboomtipoid_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_tmcod.setProperty("Caption", Combo_tmcod_Caption);
      ucCombo_tmcod.setProperty("Cls", Combo_tmcod_Cls);
      ucCombo_tmcod.setProperty("IsGridItem", Combo_tmcod_Isgriditem);
      ucCombo_tmcod.setProperty("EmptyItem", Combo_tmcod_Emptyitem);
      ucCombo_tmcod.setProperty("DropDownOptionsTitleSettingsIcons", AV36DDO_TitleSettingsIcons);
      ucCombo_tmcod.setProperty("DropDownOptionsData", AV49TMCod_Data);
      ucCombo_tmcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tmcod_Internalname, "COMBO_TMCODContainer");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMDuracion_Internalname, A13680OMDuracion, GXutil.rtrim( localUtil.format( A13680OMDuracion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMDuracion_Jsonclick, 0, "Attribute", "", "", "", "", edtOMDuracion_Visible, edtOMDuracion_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCosRea_Internalname, GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCosRea_Enabled!=0) ? localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCosRea_Jsonclick, 0, "Attribute", "", "", "", "", edtOMCosRea_Visible, edtOMCosRea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRRCosT_Enabled!=0) ? localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999") : localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRRCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMRRCosT_Visible, edtOMRRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRCCosT_Enabled!=0) ? localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999") : localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRCCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMRCCosT_Visible, edtOMRCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMRCosT_Enabled!=0) ? localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999") : localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMRCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMRCosT_Visible, edtOMMRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMCCosT_Enabled!=0) ? localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999") : localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMCCosT_Visible, edtOMMCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,188);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCodFo_Internalname, GXutil.rtrim( A13679OMMaqCodFo), GXutil.rtrim( localUtil.format( A13679OMMaqCodFo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCodFo_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqCodFo_Visible, edtOMMaqCodFo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqDsc_Visible, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMDscMqPla_Internalname, GXutil.rtrim( A13678OMDscMqPla), GXutil.rtrim( localUtil.format( A13678OMDscMqPla, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMDscMqPla_Jsonclick, 0, "Attribute", "", "", "", "", edtOMDscMqPla_Visible, edtOMDscMqPla_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_equipos( )
   {
      /*  Grid Control  */
      startgridcontrol136( ) ;
      nGXsfl_136_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1531 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1531 = (short)(1) ;
            scanStart13U1531( ) ;
            while ( RcdFound1531 != 0 )
            {
               init_level_properties1531( ) ;
               getByPrimaryKey13U1531( ) ;
               addRow13U1531( ) ;
               scanNext13U1531( ) ;
            }
            scanEnd13U1531( ) ;
            nBlankRcdCount1531 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13U1531( ) ;
         standaloneModal13U1531( ) ;
         sMode1531 = Gx_mode ;
         while ( nGXsfl_136_idx < nRC_GXsfl_136 )
         {
            bGXsfl_136_Refreshing = true ;
            readRow13U1531( ) ;
            edtOMMEquCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQUCOD_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
            edtOMMEqDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQDC_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMEqDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEqDc_Enabled), 5, 0), !bGXsfl_136_Refreshing);
            edtOMMSEqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSEQCOD_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
            edtOMMSqDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSQDC_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMSqDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSqDc_Enabled), 5, 0), !bGXsfl_136_Refreshing);
            edtOMMPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIECOD_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
            edtOMMPieDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIEDC_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMPieDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieDc_Enabled), 5, 0), !bGXsfl_136_Refreshing);
            imgprompt_11446_Link = httpContext.cgiGet( "PROMPT_11446_"+sGXsfl_136_idx+"Link") ;
            imgprompt_11446_Link = httpContext.cgiGet( "PROMPT_11446_11447_"+sGXsfl_136_idx+"Link") ;
            imgprompt_11446_Link = httpContext.cgiGet( "PROMPT_11446_11447_11448_"+sGXsfl_136_idx+"Link") ;
            if ( ( nRcdExists_1531 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13U1531( ) ;
            }
            sendRow13U1531( ) ;
            bGXsfl_136_Refreshing = false ;
         }
         Gx_mode = sMode1531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1531 = (short)(5) ;
         nRcdExists_1531 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13U1531( ) ;
            while ( RcdFound1531 != 0 )
            {
               sGXsfl_136_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_136_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1361531( ) ;
               init_level_properties1531( ) ;
               standaloneNotModal13U1531( ) ;
               getByPrimaryKey13U1531( ) ;
               standaloneModal13U1531( ) ;
               addRow13U1531( ) ;
               scanNext13U1531( ) ;
            }
            scanEnd13U1531( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1531 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_136_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_136_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1361531( ) ;
         initAll13U1531( ) ;
         init_level_properties1531( ) ;
         nRcdExists_1531 = (short)(0) ;
         nIsMod_1531 = (short)(0) ;
         nRcdDeleted_1531 = (short)(0) ;
         nBlankRcdCount1531 = (short)(nBlankRcdUsr1531+nBlankRcdCount1531) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1531 > 0 )
         {
            standaloneNotModal13U1531( ) ;
            standaloneModal13U1531( ) ;
            addRow13U1531( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOMMEquCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1531 = (short)(nBlankRcdCount1531-1) ;
         }
         Gx_mode = sMode1531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_equiposContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_equipos", Gridlevel_equiposContainer, subGridlevel_equipos_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_equiposContainerData", Gridlevel_equiposContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_equiposContainerData"+"V", Gridlevel_equiposContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_equiposContainerData"+"V"+"\" value='"+Gridlevel_equiposContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridlevel_tareas( )
   {
      /*  Grid Control  */
      startgridcontrol150( ) ;
      nGXsfl_150_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1530 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1530 = (short)(1) ;
            scanStart13U1530( ) ;
            while ( RcdFound1530 != 0 )
            {
               init_level_properties1530( ) ;
               getByPrimaryKey13U1530( ) ;
               addRow13U1530( ) ;
               scanNext13U1530( ) ;
            }
            scanEnd13U1530( ) ;
            nBlankRcdCount1530 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13U1530( ) ;
         standaloneModal13U1530( ) ;
         sMode1530 = Gx_mode ;
         while ( nGXsfl_150_idx < nRC_GXsfl_150 )
         {
            bGXsfl_150_Refreshing = true ;
            readRow13U1530( ) ;
            edtTMCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMCOD_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtTMCod_Horizontalalignment = httpContext.cgiGet( "TMCOD_"+sGXsfl_150_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Horizontalalignment", edtTMCod_Horizontalalignment, !bGXsfl_150_Refreshing);
            if ( ( nRcdExists_1530 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13U1530( ) ;
            }
            sendRow13U1530( ) ;
            bGXsfl_150_Refreshing = false ;
         }
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1530 = (short)(5) ;
         nRcdExists_1530 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13U1530( ) ;
            while ( RcdFound1530 != 0 )
            {
               sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1501530( ) ;
               init_level_properties1530( ) ;
               standaloneNotModal13U1530( ) ;
               getByPrimaryKey13U1530( ) ;
               standaloneModal13U1530( ) ;
               addRow13U1530( ) ;
               scanNext13U1530( ) ;
            }
            scanEnd13U1530( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1530 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1501530( ) ;
         initAll13U1530( ) ;
         init_level_properties1530( ) ;
         nRcdExists_1530 = (short)(0) ;
         nIsMod_1530 = (short)(0) ;
         nRcdDeleted_1530 = (short)(0) ;
         nBlankRcdCount1530 = (short)(nBlankRcdUsr1530+nBlankRcdCount1530) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1530 > 0 )
         {
            standaloneNotModal13U1530( ) ;
            standaloneModal13U1530( ) ;
            addRow13U1530( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1530 = (short)(nBlankRcdCount1530-1) ;
         }
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_tareasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_tareas", Gridlevel_tareasContainer, subGridlevel_tareas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_tareasContainerData", Gridlevel_tareasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_tareasContainerData"+"V", Gridlevel_tareasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_tareasContainerData"+"V"+"\" value='"+Gridlevel_tareasContainer.GridValuesHidden()+"'/>") ;
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
      e1113U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV36DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMMAQCOD_DATA"), AV43OMMaqCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMTIPOID_DATA"), AV46OMTipoId_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTMCOD_DATA"), AV49TMCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9437OMUsuCre = httpContext.cgiGet( "Z9437OMUsuCre") ;
            Z9445OMEst = httpContext.cgiGet( "Z9445OMEst") ;
            Z9433OMTxt = httpContext.cgiGet( "Z9433OMTxt") ;
            Z9438OMFchPre = localUtil.ctod( httpContext.cgiGet( "Z9438OMFchPre"), 0) ;
            Z9436OMFchCre = localUtil.ctot( httpContext.cgiGet( "Z9436OMFchCre"), 0) ;
            Z9464OMNot = httpContext.cgiGet( "Z9464OMNot") ;
            Z9439OMFchCer = localUtil.ctot( httpContext.cgiGet( "Z9439OMFchCer"), 0) ;
            Z14495OMPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14495OMPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9426OMMaqCod = httpContext.cgiGet( "Z9426OMMaqCod") ;
            Z9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9428SMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14492OMTipoId = (short)(localUtil.ctol( httpContext.cgiGet( "Z14492OMTipoId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_136 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_136"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_150 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_150"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9426OMMaqCod = httpContext.cgiGet( "N9426OMMaqCod") ;
            N9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "N9428SMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "N9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N14492OMTipoId = (short)(localUtil.ctol( httpContext.cgiGet( "N14492OMTipoId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9433OMTxt = httpContext.cgiGet( "N9433OMTxt") ;
            AV24EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV14OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Insert_OMMaqCod = httpContext.cgiGet( "vINSERT_OMMAQCOD") ;
            AV28Insert_SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_SMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCSMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Insert_PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45Insert_OMTipoId = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_OMTIPOID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV48Verequipos = (short)(localUtil.ctol( httpContext.cgiGet( "vVEREQUIPOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14494OMTipoDc = httpContext.cgiGet( "OMTIPODC") ;
            A12599OMMEquDsc = httpContext.cgiGet( "OMMEQUDSC") ;
            A12600OMMSEqDsc = httpContext.cgiGet( "OMMSEQDSC") ;
            A11449OMMPieDsc = httpContext.cgiGet( "OMMPIEDSC") ;
            n11449OMMPieDsc = false ;
            A9431TMDsc = httpContext.cgiGet( "TMDSC") ;
            n9431TMDsc = false ;
            A9432TMTxt = httpContext.cgiGet( "TMTXT") ;
            n9432TMTxt = false ;
            Combo_ommaqcod_Objectcall = httpContext.cgiGet( "COMBO_OMMAQCOD_Objectcall") ;
            Combo_ommaqcod_Class = httpContext.cgiGet( "COMBO_OMMAQCOD_Class") ;
            Combo_ommaqcod_Icontype = httpContext.cgiGet( "COMBO_OMMAQCOD_Icontype") ;
            Combo_ommaqcod_Icon = httpContext.cgiGet( "COMBO_OMMAQCOD_Icon") ;
            Combo_ommaqcod_Caption = httpContext.cgiGet( "COMBO_OMMAQCOD_Caption") ;
            Combo_ommaqcod_Tooltip = httpContext.cgiGet( "COMBO_OMMAQCOD_Tooltip") ;
            Combo_ommaqcod_Cls = httpContext.cgiGet( "COMBO_OMMAQCOD_Cls") ;
            Combo_ommaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMMAQCOD_Selectedvalue_set") ;
            Combo_ommaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_OMMAQCOD_Selectedvalue_get") ;
            Combo_ommaqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_OMMAQCOD_Selectedtext_set") ;
            Combo_ommaqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_OMMAQCOD_Selectedtext_get") ;
            Combo_ommaqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_OMMAQCOD_Gamoauthtoken") ;
            Combo_ommaqcod_Ddointernalname = httpContext.cgiGet( "COMBO_OMMAQCOD_Ddointernalname") ;
            Combo_ommaqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_OMMAQCOD_Titlecontrolalign") ;
            Combo_ommaqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_OMMAQCOD_Dropdownoptionstype") ;
            Combo_ommaqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Enabled")) ;
            Combo_ommaqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Visible")) ;
            Combo_ommaqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_OMMAQCOD_Titlecontrolidtoreplace") ;
            Combo_ommaqcod_Datalisttype = httpContext.cgiGet( "COMBO_OMMAQCOD_Datalisttype") ;
            Combo_ommaqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Allowmultipleselection")) ;
            Combo_ommaqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_OMMAQCOD_Datalistfixedvalues") ;
            Combo_ommaqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Isgriditem")) ;
            Combo_ommaqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Hasdescription")) ;
            Combo_ommaqcod_Datalistproc = httpContext.cgiGet( "COMBO_OMMAQCOD_Datalistproc") ;
            Combo_ommaqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_OMMAQCOD_Datalistprocparametersprefix") ;
            Combo_ommaqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_OMMAQCOD_Remoteservicesparameters") ;
            Combo_ommaqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_OMMAQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_ommaqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Includeonlyselectedoption")) ;
            Combo_ommaqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Includeselectalloption")) ;
            Combo_ommaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Emptyitem")) ;
            Combo_ommaqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMMAQCOD_Includeaddnewoption")) ;
            Combo_ommaqcod_Htmltemplate = httpContext.cgiGet( "COMBO_OMMAQCOD_Htmltemplate") ;
            Combo_ommaqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_OMMAQCOD_Multiplevaluestype") ;
            Combo_ommaqcod_Loadingdata = httpContext.cgiGet( "COMBO_OMMAQCOD_Loadingdata") ;
            Combo_ommaqcod_Noresultsfound = httpContext.cgiGet( "COMBO_OMMAQCOD_Noresultsfound") ;
            Combo_ommaqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_OMMAQCOD_Emptyitemtext") ;
            Combo_ommaqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_OMMAQCOD_Onlyselectedvalues") ;
            Combo_ommaqcod_Selectalltext = httpContext.cgiGet( "COMBO_OMMAQCOD_Selectalltext") ;
            Combo_ommaqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_OMMAQCOD_Multiplevaluesseparator") ;
            Combo_ommaqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_OMMAQCOD_Addnewoptiontext") ;
            Combo_omtipoid_Objectcall = httpContext.cgiGet( "COMBO_OMTIPOID_Objectcall") ;
            Combo_omtipoid_Class = httpContext.cgiGet( "COMBO_OMTIPOID_Class") ;
            Combo_omtipoid_Icontype = httpContext.cgiGet( "COMBO_OMTIPOID_Icontype") ;
            Combo_omtipoid_Icon = httpContext.cgiGet( "COMBO_OMTIPOID_Icon") ;
            Combo_omtipoid_Caption = httpContext.cgiGet( "COMBO_OMTIPOID_Caption") ;
            Combo_omtipoid_Tooltip = httpContext.cgiGet( "COMBO_OMTIPOID_Tooltip") ;
            Combo_omtipoid_Cls = httpContext.cgiGet( "COMBO_OMTIPOID_Cls") ;
            Combo_omtipoid_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMTIPOID_Selectedvalue_set") ;
            Combo_omtipoid_Selectedvalue_get = httpContext.cgiGet( "COMBO_OMTIPOID_Selectedvalue_get") ;
            Combo_omtipoid_Selectedtext_set = httpContext.cgiGet( "COMBO_OMTIPOID_Selectedtext_set") ;
            Combo_omtipoid_Selectedtext_get = httpContext.cgiGet( "COMBO_OMTIPOID_Selectedtext_get") ;
            Combo_omtipoid_Gamoauthtoken = httpContext.cgiGet( "COMBO_OMTIPOID_Gamoauthtoken") ;
            Combo_omtipoid_Ddointernalname = httpContext.cgiGet( "COMBO_OMTIPOID_Ddointernalname") ;
            Combo_omtipoid_Titlecontrolalign = httpContext.cgiGet( "COMBO_OMTIPOID_Titlecontrolalign") ;
            Combo_omtipoid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_OMTIPOID_Dropdownoptionstype") ;
            Combo_omtipoid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Enabled")) ;
            Combo_omtipoid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Visible")) ;
            Combo_omtipoid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_OMTIPOID_Titlecontrolidtoreplace") ;
            Combo_omtipoid_Datalisttype = httpContext.cgiGet( "COMBO_OMTIPOID_Datalisttype") ;
            Combo_omtipoid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Allowmultipleselection")) ;
            Combo_omtipoid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_OMTIPOID_Datalistfixedvalues") ;
            Combo_omtipoid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Isgriditem")) ;
            Combo_omtipoid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Hasdescription")) ;
            Combo_omtipoid_Datalistproc = httpContext.cgiGet( "COMBO_OMTIPOID_Datalistproc") ;
            Combo_omtipoid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_OMTIPOID_Datalistprocparametersprefix") ;
            Combo_omtipoid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_OMTIPOID_Remoteservicesparameters") ;
            Combo_omtipoid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_OMTIPOID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_omtipoid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Includeonlyselectedoption")) ;
            Combo_omtipoid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Includeselectalloption")) ;
            Combo_omtipoid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Emptyitem")) ;
            Combo_omtipoid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMTIPOID_Includeaddnewoption")) ;
            Combo_omtipoid_Htmltemplate = httpContext.cgiGet( "COMBO_OMTIPOID_Htmltemplate") ;
            Combo_omtipoid_Multiplevaluestype = httpContext.cgiGet( "COMBO_OMTIPOID_Multiplevaluestype") ;
            Combo_omtipoid_Loadingdata = httpContext.cgiGet( "COMBO_OMTIPOID_Loadingdata") ;
            Combo_omtipoid_Noresultsfound = httpContext.cgiGet( "COMBO_OMTIPOID_Noresultsfound") ;
            Combo_omtipoid_Emptyitemtext = httpContext.cgiGet( "COMBO_OMTIPOID_Emptyitemtext") ;
            Combo_omtipoid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_OMTIPOID_Onlyselectedvalues") ;
            Combo_omtipoid_Selectalltext = httpContext.cgiGet( "COMBO_OMTIPOID_Selectalltext") ;
            Combo_omtipoid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_OMTIPOID_Multiplevaluesseparator") ;
            Combo_omtipoid_Addnewoptiontext = httpContext.cgiGet( "COMBO_OMTIPOID_Addnewoptiontext") ;
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
            Dvpanel_tabletextonota_Objectcall = httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Objectcall") ;
            Dvpanel_tabletextonota_Class = httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Class") ;
            Dvpanel_tabletextonota_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Enabled")) ;
            Dvpanel_tabletextonota_Width = httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Width") ;
            Dvpanel_tabletextonota_Height = httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Height") ;
            Dvpanel_tabletextonota_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Autowidth")) ;
            Dvpanel_tabletextonota_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Autoheight")) ;
            Dvpanel_tabletextonota_Cls = httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Cls") ;
            Dvpanel_tabletextonota_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Showheader")) ;
            Dvpanel_tabletextonota_Title = httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Title") ;
            Dvpanel_tabletextonota_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Collapsible")) ;
            Dvpanel_tabletextonota_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Collapsed")) ;
            Dvpanel_tabletextonota_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Showcollapseicon")) ;
            Dvpanel_tabletextonota_Iconposition = httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Iconposition") ;
            Dvpanel_tabletextonota_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Autoscroll")) ;
            Dvpanel_tabletextonota_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Visible")) ;
            Dvpanel_tableleaflevel_equipos_Objectcall = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Objectcall") ;
            Dvpanel_tableleaflevel_equipos_Class = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Class") ;
            Dvpanel_tableleaflevel_equipos_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Enabled")) ;
            Dvpanel_tableleaflevel_equipos_Width = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Width") ;
            Dvpanel_tableleaflevel_equipos_Height = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Height") ;
            Dvpanel_tableleaflevel_equipos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Autowidth")) ;
            Dvpanel_tableleaflevel_equipos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Autoheight")) ;
            Dvpanel_tableleaflevel_equipos_Cls = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Cls") ;
            Dvpanel_tableleaflevel_equipos_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Showheader")) ;
            Dvpanel_tableleaflevel_equipos_Title = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Title") ;
            Dvpanel_tableleaflevel_equipos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Collapsible")) ;
            Dvpanel_tableleaflevel_equipos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Collapsed")) ;
            Dvpanel_tableleaflevel_equipos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Showcollapseicon")) ;
            Dvpanel_tableleaflevel_equipos_Iconposition = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Iconposition") ;
            Dvpanel_tableleaflevel_equipos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Autoscroll")) ;
            Dvpanel_tableleaflevel_equipos_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Visible")) ;
            Dvpanel_tableleaflevel_tareas_Objectcall = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Objectcall") ;
            Dvpanel_tableleaflevel_tareas_Class = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Class") ;
            Dvpanel_tableleaflevel_tareas_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Enabled")) ;
            Dvpanel_tableleaflevel_tareas_Width = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Width") ;
            Dvpanel_tableleaflevel_tareas_Height = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Height") ;
            Dvpanel_tableleaflevel_tareas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Autowidth")) ;
            Dvpanel_tableleaflevel_tareas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Autoheight")) ;
            Dvpanel_tableleaflevel_tareas_Cls = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Cls") ;
            Dvpanel_tableleaflevel_tareas_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Showheader")) ;
            Dvpanel_tableleaflevel_tareas_Title = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Title") ;
            Dvpanel_tableleaflevel_tareas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Collapsible")) ;
            Dvpanel_tableleaflevel_tareas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Collapsed")) ;
            Dvpanel_tableleaflevel_tareas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Showcollapseicon")) ;
            Dvpanel_tableleaflevel_tareas_Iconposition = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Iconposition") ;
            Dvpanel_tableleaflevel_tareas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Autoscroll")) ;
            Dvpanel_tableleaflevel_tareas_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_TAREAS_Visible")) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tmcod_Objectcall = httpContext.cgiGet( "COMBO_TMCOD_Objectcall") ;
            Combo_tmcod_Class = httpContext.cgiGet( "COMBO_TMCOD_Class") ;
            Combo_tmcod_Icontype = httpContext.cgiGet( "COMBO_TMCOD_Icontype") ;
            Combo_tmcod_Icon = httpContext.cgiGet( "COMBO_TMCOD_Icon") ;
            Combo_tmcod_Caption = httpContext.cgiGet( "COMBO_TMCOD_Caption") ;
            Combo_tmcod_Tooltip = httpContext.cgiGet( "COMBO_TMCOD_Tooltip") ;
            Combo_tmcod_Cls = httpContext.cgiGet( "COMBO_TMCOD_Cls") ;
            Combo_tmcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TMCOD_Selectedvalue_set") ;
            Combo_tmcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TMCOD_Selectedvalue_get") ;
            Combo_tmcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TMCOD_Selectedtext_set") ;
            Combo_tmcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TMCOD_Selectedtext_get") ;
            Combo_tmcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TMCOD_Gamoauthtoken") ;
            Combo_tmcod_Ddointernalname = httpContext.cgiGet( "COMBO_TMCOD_Ddointernalname") ;
            Combo_tmcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TMCOD_Titlecontrolalign") ;
            Combo_tmcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TMCOD_Dropdownoptionstype") ;
            Combo_tmcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Enabled")) ;
            Combo_tmcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Visible")) ;
            Combo_tmcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TMCOD_Titlecontrolidtoreplace") ;
            Combo_tmcod_Datalisttype = httpContext.cgiGet( "COMBO_TMCOD_Datalisttype") ;
            Combo_tmcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Allowmultipleselection")) ;
            Combo_tmcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TMCOD_Datalistfixedvalues") ;
            Combo_tmcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Isgriditem")) ;
            Combo_tmcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Hasdescription")) ;
            Combo_tmcod_Datalistproc = httpContext.cgiGet( "COMBO_TMCOD_Datalistproc") ;
            Combo_tmcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TMCOD_Datalistprocparametersprefix") ;
            Combo_tmcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TMCOD_Remoteservicesparameters") ;
            Combo_tmcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TMCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tmcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Includeonlyselectedoption")) ;
            Combo_tmcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Includeselectalloption")) ;
            Combo_tmcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Emptyitem")) ;
            Combo_tmcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMCOD_Includeaddnewoption")) ;
            Combo_tmcod_Htmltemplate = httpContext.cgiGet( "COMBO_TMCOD_Htmltemplate") ;
            Combo_tmcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TMCOD_Multiplevaluestype") ;
            Combo_tmcod_Loadingdata = httpContext.cgiGet( "COMBO_TMCOD_Loadingdata") ;
            Combo_tmcod_Noresultsfound = httpContext.cgiGet( "COMBO_TMCOD_Noresultsfound") ;
            Combo_tmcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TMCOD_Emptyitemtext") ;
            Combo_tmcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TMCOD_Onlyselectedvalues") ;
            Combo_tmcod_Selectalltext = httpContext.cgiGet( "COMBO_TMCOD_Selectalltext") ;
            Combo_tmcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TMCOD_Multiplevaluesseparator") ;
            Combo_tmcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TMCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMPRI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMPri_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14495OMPri = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14495OMPri", GXutil.str( A14495OMPri, 1, 0));
            }
            else
            {
               A14495OMPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtOMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14495OMPri", GXutil.str( A14495OMPri, 1, 0));
            }
            AV20Accion = httpContext.cgiGet( edtavAccion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Accion", AV20Accion);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Accion, ""))));
            Gx_mode = GXutil.upper( httpContext.cgiGet( edtavMode_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            if ( localUtil.vcdate( httpContext.cgiGet( edtOMFchPre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "OMFCHPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMFchPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9438OMFchPre = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
            }
            else
            {
               A9438OMFchPre = localUtil.ctod( httpContext.cgiGet( edtOMFchPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
            }
            cmbOMEst.setName( cmbOMEst.getInternalname() );
            cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            h9428SMCod = httpContext.cgiGet( edtSMCod_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9429PMCod = 0 ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            }
            else
            {
               A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            }
            A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMTipoId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMTipoId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMTIPOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMTipoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14492OMTipoId = (short)(0) ;
               n14492OMTipoId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
            }
            else
            {
               A14492OMTipoId = (short)(localUtil.ctol( httpContext.cgiGet( edtOMTipoId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n14492OMTipoId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
            }
            A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
            A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
            AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
            AV44ComboOMMaqCod = httpContext.cgiGet( edtavComboommaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44ComboOMMaqCod", AV44ComboOMMaqCod);
            AV47ComboOMTipoId = (short)(localUtil.ctol( httpContext.cgiGet( edtavComboomtipoid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47ComboOMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47ComboOMTipoId), 4, 0));
            A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13680OMDuracion", A13680OMDuracion);
            A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
            n13679OMMaqCodFo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
            A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
            n9427OMMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
            A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrden");
            Gx_mode = httpContext.cgiGet( edtavMode_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A9437OMUsuCre = httpContext.cgiGet( edtOMUsuCre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
            forbiddenHiddens.add("OMUsuCre", GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")));
            AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
            A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("OMFchCre", localUtil.format( A9436OMFchCre, "99/99/99 99:99"));
            A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("OMFchCer", localUtil.format( A9439OMFchCer, "99/99/99 99:99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmorden:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
               A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV14OMCod) )
               {
                  A9425OMCod = AV14OMCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               }
               else
               {
                  if ( ! isIns( )  && true /* Level */ )
                  {
                     A9425OMCod = AV14OMCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
                  sMode1232 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV14OMCod) )
                  {
                     A9425OMCod = AV14OMCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  && true /* Level */ )
                     {
                        A9425OMCod = AV14OMCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
                     }
                  }
                  Gx_mode = sMode1232 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1232 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13U0( ) ;
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
                        e1113U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOCONTROL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoControl' */
                        e1313U2 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOREPUESTOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoRepuestos' */
                        e1413U2 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOMANODEOBRA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoManodeObra' */
                        e1513U2 ();
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
         e1213U2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13U1232( ) ;
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
         disableAttributes13U1232( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavAccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAccion_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavMode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMode_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboommaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboommaqcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboomtipoid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboomtipoid_Enabled), 5, 0), true);
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

   public void confirm_13U0( )
   {
      beforeValidate13U1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13U1232( ) ;
         }
         else
         {
            checkExtendedTable13U1232( ) ;
            closeExtendedTableCursors13U1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_13U1531( ) ;
         if ( AnyError == 0 )
         {
            confirm_13U1530( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode1232 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13U1530( )
   {
      nGXsfl_150_idx = 0 ;
      while ( nGXsfl_150_idx < nRC_GXsfl_150 )
      {
         readRow13U1530( ) ;
         if ( ( nRcdExists_1530 != 0 ) || ( nIsMod_1530 != 0 ) )
         {
            getKey13U1530( ) ;
            if ( ( nRcdExists_1530 == 0 ) && ( nRcdDeleted_1530 == 0 ) )
            {
               if ( RcdFound1530 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13U1530( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13U1530( ) ;
                     closeExtendedTableCursors13U1530( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TMCOD_" + sGXsfl_150_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1530 != 0 )
               {
                  if ( nRcdDeleted_1530 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13U1530( ) ;
                     load13U1530( ) ;
                     beforeValidate13U1530( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13U1530( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1530 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13U1530( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13U1530( ) ;
                           closeExtendedTableCursors13U1530( ) ;
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
                  if ( nRcdDeleted_1530 == 0 )
                  {
                     GXCCtl = "TMCOD_" + sGXsfl_150_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1530_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1530_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1530_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1530 != 0 )
         {
            httpContext.changePostValue( "TMCOD_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMCOD_"+sGXsfl_150_idx+"Horizontalalignment", GXutil.rtrim( edtTMCod_Horizontalalignment)) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13U1531( )
   {
      nGXsfl_136_idx = 0 ;
      while ( nGXsfl_136_idx < nRC_GXsfl_136 )
      {
         readRow13U1531( ) ;
         if ( ( nRcdExists_1531 != 0 ) || ( nIsMod_1531 != 0 ) )
         {
            getKey13U1531( ) ;
            if ( ( nRcdExists_1531 == 0 ) && ( nRcdDeleted_1531 == 0 ) )
            {
               if ( RcdFound1531 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13U1531( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13U1531( ) ;
                     closeExtendedTableCursors13U1531( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "OMMEQUCOD_" + sGXsfl_136_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMMEquCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1531 != 0 )
               {
                  if ( nRcdDeleted_1531 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13U1531( ) ;
                     load13U1531( ) ;
                     beforeValidate13U1531( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13U1531( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1531 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13U1531( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13U1531( ) ;
                           closeExtendedTableCursors13U1531( ) ;
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
                  if ( nRcdDeleted_1531 == 0 )
                  {
                     GXCCtl = "OMMEQUCOD_" + sGXsfl_136_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMMEquCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMMEquCod_Internalname, GXutil.rtrim( A11446OMMEquCod)) ;
         httpContext.changePostValue( edtOMMEqDc_Internalname, GXutil.rtrim( A14497OMMEqDc)) ;
         httpContext.changePostValue( edtOMMSEqCod_Internalname, GXutil.rtrim( A11447OMMSEqCod)) ;
         httpContext.changePostValue( edtOMMSqDc_Internalname, GXutil.rtrim( A14498OMMSqDc)) ;
         httpContext.changePostValue( edtOMMPieCod_Internalname, GXutil.rtrim( A11448OMMPieCod)) ;
         httpContext.changePostValue( edtOMMPieDc_Internalname, GXutil.rtrim( A14499OMMPieDc)) ;
         httpContext.changePostValue( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_136_idx, GXutil.rtrim( Z11446OMMEquCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_136_idx, GXutil.rtrim( Z11447OMMSEqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_136_idx, GXutil.rtrim( Z11448OMMPieCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1531_"+sGXsfl_136_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1531_"+sGXsfl_136_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1531_"+sGXsfl_136_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1531 != 0 )
         {
            httpContext.changePostValue( "OMMEQUCOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMEQDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEqDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSEQCOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSQDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSqDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIECOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIEDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13U0( )
   {
   }

   public void e1113U2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmorden_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmorden_impl.this.AV24EmprCod = GXv_char2[0] ;
      tmorden_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmorden_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV36DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV36DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_tmcod_Titlecontrolidtoreplace = edtTMCod_Internalname ;
      ucCombo_tmcod.sendProperty(context, "", false, Combo_tmcod_Internalname, "TitleControlIdToReplace", Combo_tmcod_Titlecontrolidtoreplace);
      edtTMCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Horizontalalignment", edtTMCod_Horizontalalignment, !bGXsfl_150_Refreshing);
      edtOMTipoId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTipoId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTipoId_Visible), 5, 0), true);
      AV47ComboOMTipoId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47ComboOMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47ComboOMTipoId), 4, 0));
      edtavComboomtipoid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboomtipoid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboomtipoid_Visible), 5, 0), true);
      edtOMMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Visible), 5, 0), true);
      AV44ComboOMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44ComboOMMaqCod", AV44ComboOMMaqCod);
      edtavComboommaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboommaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboommaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOOMMAQCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(15);
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOOMTIPOID' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(15);
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOTMCOD' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(15);
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(15);
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV31TrnContext.fromxml(AV33WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV31TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV60Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV61GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GXV1), 8, 0));
         while ( AV61GXV1 <= AV31TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV32TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV31TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV61GXV1));
            if ( GXutil.strcmp(AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "OMMaqCod") == 0 )
            {
               AV26Insert_OMMaqCod = AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Insert_OMMaqCod", AV26Insert_OMMaqCod);
               if ( ! (GXutil.strcmp("", AV26Insert_OMMaqCod)==0) )
               {
                  AV44ComboOMMaqCod = AV26Insert_OMMaqCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV44ComboOMMaqCod", AV44ComboOMMaqCod);
                  Combo_ommaqcod_Selectedvalue_set = AV44ComboOMMaqCod ;
                  ucCombo_ommaqcod.sendProperty(context, "", false, Combo_ommaqcod_Internalname, "SelectedValue_set", Combo_ommaqcod_Selectedvalue_set);
                  Combo_ommaqcod_Enabled = false ;
                  ucCombo_ommaqcod.sendProperty(context, "", false, Combo_ommaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_ommaqcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "SMCod") == 0 )
            {
               AV28Insert_SMCod = (int)(GXutil.lval( AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28Insert_SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Insert_SMCod), 8, 0));
            }
            else if ( GXutil.strcmp(AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PMCod") == 0 )
            {
               AV27Insert_PMCod = (int)(GXutil.lval( AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Insert_PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Insert_PMCod), 8, 0));
            }
            else if ( GXutil.strcmp(AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "OMTipoId") == 0 )
            {
               AV45Insert_OMTipoId = (short)(GXutil.lval( AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45Insert_OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Insert_OMTipoId), 4, 0));
               if ( ! (0==AV45Insert_OMTipoId) )
               {
                  AV47ComboOMTipoId = AV45Insert_OMTipoId ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV47ComboOMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47ComboOMTipoId), 4, 0));
                  Combo_omtipoid_Selectedvalue_set = GXutil.trim( GXutil.str( AV47ComboOMTipoId, 4, 0)) ;
                  ucCombo_omtipoid.sendProperty(context, "", false, Combo_omtipoid_Internalname, "SelectedValue_set", Combo_omtipoid_Selectedvalue_set);
                  Combo_omtipoid_Enabled = false ;
                  ucCombo_omtipoid.sendProperty(context, "", false, Combo_omtipoid_Internalname, "Enabled", GXutil.booltostr( Combo_omtipoid_Enabled));
               }
            }
            AV61GXV1 = (int)(AV61GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GXV1), 8, 0));
         }
      }
      edtOMDuracion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMDuracion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDuracion_Visible), 5, 0), true);
      edtOMCosRea_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCosRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCosRea_Visible), 5, 0), true);
      edtOMRRCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCosT_Visible), 5, 0), true);
      edtOMRCCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCosT_Visible), 5, 0), true);
      edtOMMRCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCosT_Visible), 5, 0), true);
      edtOMMCCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtOMMaqCodFo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCodFo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCodFo_Visible), 5, 0), true);
      edtOMMaqDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Visible), 5, 0), true);
      edtOMDscMqPla_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMDscMqPla_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDscMqPla_Visible), 5, 0), true);
      GXv_char4[0] = AV24EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int8[0] = AV17MTMovCod ;
      GXv_char2[0] = AV18MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_char2) ;
      tmorden_impl.this.AV24EmprCod = GXv_char4[0] ;
      tmorden_impl.this.AV17MTMovCod = GXv_int8[0] ;
      tmorden_impl.this.AV18MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
      GXt_int9 = (byte)(AV48Verequipos) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "SIEQUI", ""), GXv_int10) ;
      tmorden_impl.this.GXt_int9 = GXv_int10[0] ;
      AV48Verequipos = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Verequipos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Verequipos), 4, 0));
      lblTextmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextmensaje_Internalname, "Caption", lblTextmensaje_Caption, true);
      bttBtncontrol_Enabled = ((GXutil.strcmp(Gx_mode, "DLT")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtncontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtncontrol_Enabled), 5, 0), true);
      bttBtnrepuestos_Enabled = ((GXutil.strcmp(Gx_mode, "DLT")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnrepuestos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnrepuestos_Enabled), 5, 0), true);
      bttBtnmanodeobra_Enabled = ((GXutil.strcmp(Gx_mode, "DLT")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnmanodeobra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnmanodeobra_Enabled), 5, 0), true);
   }

   public void e1213U2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV31TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmordenww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(15);
      pr_default.close(14);
      pr_default.close(13);
      pr_default.close(12);
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e1313U2( )
   {
      /* 'DoControl' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         GXv_int8[0] = AV55OMOpecod ;
         GXv_int11[0] = AV56MORMO ;
         new app.mantenimientomaquina.operario_mormo(remoteHandle, context).execute( AV24EmprCod, A9425OMCod, GXv_int8, GXv_int11) ;
         tmorden_impl.this.AV55OMOpecod = GXv_int8[0] ;
         tmorden_impl.this.AV56MORMO = GXv_int11[0] ;
         if ( AV56MORMO == 1 )
         {
            httpContext.popup(formatLink("app.mantenimientomaquina.tmordco", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55OMOpecod,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "C", "")))}, new String[] {"Mode","EmprCod","OMCod","OMOpeCod","OMMTpo"}) , new Object[] {});
         }
         else
         {
            httpContext.popup(formatLink("app.mantenimientomaquina.tmordco", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55OMOpecod,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "C", "")))}, new String[] {"Mode","EmprCod","OMCod","OMOpeCod","OMMTpo"}) , new Object[] {});
         }
      }
   }

   public void e1413U2( )
   {
      /* 'DoRepuestos' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         GXt_char1 = AV57OMMaqDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, GXv_char4) ;
         tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
         AV57OMMaqDsc = GXt_char1 ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            httpContext.popup(formatLink("app.mantenimientomaquina.tmordrr", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(AV57OMMaqDsc))}, new String[] {"Mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"}) , new Object[] {});
         }
         else
         {
            httpContext.popup(formatLink("app.mantenimientomaquina.tmordrc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(AV57OMMaqDsc))}, new String[] {"Mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"}) , new Object[] {});
         }
      }
   }

   public void e1513U2( )
   {
      /* 'DoManodeObra' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         GXt_char1 = AV57OMMaqDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, GXv_char4) ;
         tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
         AV57OMMaqDsc = GXt_char1 ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            httpContext.popup(formatLink("app.mantenimientomaquina.tmordmr", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(AV57OMMaqDsc))}, new String[] {"Mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"}) , new Object[] {});
         }
         else
         {
            httpContext.popup(formatLink("app.mantenimientomaquina.tmordmc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(AV57OMMaqDsc))}, new String[] {"Mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"}) , new Object[] {});
         }
      }
   }

   public void S142( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtOMNot_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMNot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMNot_Visible), 5, 0), true);
      cellOmnot_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, cellOmnot_cell_Internalname, "Class", cellOmnot_cell_Class, true);
      edtSMCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Visible), 5, 0), true);
      divSmcod_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divSmcod_cell_Internalname, "Class", divSmcod_cell_Class, true);
      edtPMCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Visible), 5, 0), true);
      divPmcod_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divPmcod_cell_Internalname, "Class", divPmcod_cell_Class, true);
      if ( ( edtSMCod_Visible == ( 0 )) && ( edtPMCod_Visible == ( 0 )) )
      {
         divUnnamedtable3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      }
      divDvpanel_tableleaflevel_equipos_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tableleaflevel_equipos_cell_Internalname, "Class", divDvpanel_tableleaflevel_equipos_cell_Class, true);
   }

   public void S132( )
   {
      /* 'LOADCOMBOTMCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV49TMCod_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.mantenimientomaquina.tmordenloaddvcombo(remoteHandle, context).execute( "TMCod", Gx_mode, AV24EmprCod, AV14OMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      tmorden_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV49TMCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
   }

   public void S122( )
   {
      /* 'LOADCOMBOOMTIPOID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV46OMTipoId_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.mantenimientomaquina.tmordenloaddvcombo(remoteHandle, context).execute( "OMTipoId", Gx_mode, AV24EmprCod, AV14OMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      tmorden_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV46OMTipoId_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_omtipoid_Selectedvalue_set = AV37ComboSelectedValue ;
      ucCombo_omtipoid.sendProperty(context, "", false, Combo_omtipoid_Internalname, "SelectedValue_set", Combo_omtipoid_Selectedvalue_set);
      AV47ComboOMTipoId = (short)(GXutil.lval( AV37ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47ComboOMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47ComboOMTipoId), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_omtipoid_Enabled = false ;
         ucCombo_omtipoid.sendProperty(context, "", false, Combo_omtipoid_Internalname, "Enabled", GXutil.booltostr( Combo_omtipoid_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOOMMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV43OMMaqCod_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.mantenimientomaquina.tmordenloaddvcombo(remoteHandle, context).execute( "OMMaqCod", Gx_mode, AV24EmprCod, AV14OMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      tmorden_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV43OMMaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_ommaqcod_Selectedvalue_set = AV37ComboSelectedValue ;
      ucCombo_ommaqcod.sendProperty(context, "", false, Combo_ommaqcod_Internalname, "SelectedValue_set", Combo_ommaqcod_Selectedvalue_set);
      AV44ComboOMMaqCod = AV37ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44ComboOMMaqCod", AV44ComboOMMaqCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_ommaqcod_Enabled = false ;
         ucCombo_ommaqcod.sendProperty(context, "", false, Combo_ommaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_ommaqcod_Enabled));
      }
   }

   public void zm13U1232( int GX_JID )
   {
      if ( ( GX_JID == 56 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9437OMUsuCre = T013U9_A9437OMUsuCre[0] ;
            Z9445OMEst = T013U9_A9445OMEst[0] ;
            Z9433OMTxt = T013U9_A9433OMTxt[0] ;
            Z9438OMFchPre = T013U9_A9438OMFchPre[0] ;
            Z9436OMFchCre = T013U9_A9436OMFchCre[0] ;
            Z9464OMNot = T013U9_A9464OMNot[0] ;
            Z9439OMFchCer = T013U9_A9439OMFchCer[0] ;
            Z14495OMPri = T013U9_A14495OMPri[0] ;
            Z9426OMMaqCod = T013U9_A9426OMMaqCod[0] ;
            Z9429PMCod = T013U9_A9429PMCod[0] ;
            Z9428SMCod = T013U9_A9428SMCod[0] ;
            Z14492OMTipoId = T013U9_A14492OMTipoId[0] ;
         }
         else
         {
            Z9437OMUsuCre = A9437OMUsuCre ;
            Z9445OMEst = A9445OMEst ;
            Z9433OMTxt = A9433OMTxt ;
            Z9438OMFchPre = A9438OMFchPre ;
            Z9436OMFchCre = A9436OMFchCre ;
            Z9464OMNot = A9464OMNot ;
            Z9439OMFchCer = A9439OMFchCer ;
            Z14495OMPri = A14495OMPri ;
            Z9426OMMaqCod = A9426OMMaqCod ;
            Z9429PMCod = A9429PMCod ;
            Z9428SMCod = A9428SMCod ;
            Z14492OMTipoId = A14492OMTipoId ;
         }
      }
      if ( GX_JID == -56 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9437OMUsuCre = A9437OMUsuCre ;
         Z9445OMEst = A9445OMEst ;
         Z9433OMTxt = A9433OMTxt ;
         Z9438OMFchPre = A9438OMFchPre ;
         Z9436OMFchCre = A9436OMFchCre ;
         Z9464OMNot = A9464OMNot ;
         Z9439OMFchCer = A9439OMFchCer ;
         Z14495OMPri = A14495OMPri ;
         Z396EmprCod = A396EmprCod ;
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z9429PMCod = A9429PMCod ;
         Z9428SMCod = A9428SMCod ;
         Z14492OMTipoId = A14492OMTipoId ;
         Z407EmprNom = A407EmprNom ;
         Z9444OMRRCosT = A9444OMRRCosT ;
         Z9443OMRCCosT = A9443OMRCCosT ;
         Z9442OMMRCosT = A9442OMMRCosT ;
         Z9441OMMCCosT = A9441OMMCCosT ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z13679OMMaqCodFo = A13679OMMaqCodFo ;
         Z14494OMTipoDc = A14494OMTipoDc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtSMCod_Visible = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) ) )
      {
         divSmcod_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divSmcod_cell_Internalname, "Class", divSmcod_cell_Class, true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
         {
            divSmcod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divSmcod_cell_Internalname, "Class", divSmcod_cell_Class, true);
         }
      }
      edtPMCod_Visible = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) ) )
      {
         divPmcod_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divPmcod_cell_Internalname, "Class", divPmcod_cell_Class, true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
         {
            divPmcod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divPmcod_cell_Internalname, "Class", divPmcod_cell_Class, true);
         }
      }
      divUnnamedtable3_Visible = ((((GXutil.strcmp(Gx_mode, "DSP")==0))||((GXutil.strcmp(Gx_mode, "DSP")==0))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Enabled), 5, 0), true);
      edtOMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      AV60Pgmname = "MantenimientoMaquina.TMOrden" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Enabled), 5, 0), true);
      edtOMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV24EmprCod)==0) )
      {
         A396EmprCod = AV24EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV24EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV24EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV14OMCod) )
      {
         edtOMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtOMCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
         }
         else
         {
            edtOMCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV14OMCod) )
      {
         edtOMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      }
      edtOMNot_Visible = ((GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "C", ""), ""))==0)||(GXutil.strcmp(AV20Accion, "X")==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMNot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMNot_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 ) || ( GXutil.strcmp(AV20Accion, "X") == 0 ) ) )
      {
         cellOmnot_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, cellOmnot_cell_Internalname, "Class", cellOmnot_cell_Class, true);
      }
      else
      {
         if ( ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 ) || ( GXutil.strcmp(AV20Accion, "X") == 0 ) )
         {
            cellOmnot_cell_Class = httpContext.getMessage( "DataContentCell DscTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, cellOmnot_cell_Internalname, "Class", cellOmnot_cell_Class, true);
         }
      }
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
      {
         edtOMFchPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMFchPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchPre_Enabled), 5, 0), true);
      }
      else
      {
         edtOMFchPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMFchPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchPre_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( "C", "")) == 0 )
      {
         edtOMMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( "C", "")) == 0 )
      {
         edtOMFchPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMFchPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchPre_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV26Insert_OMMaqCod)==0) )
      {
         edtOMMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            edtOMMaqCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
         }
         else
         {
            edtOMMaqCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV28Insert_SMCod) )
      {
         edtSMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      }
      else
      {
         edtSMCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV27Insert_PMCod) )
      {
         edtPMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPMCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV45Insert_OMTipoId) )
      {
         edtOMTipoId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTipoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTipoId_Enabled), 5, 0), true);
      }
      else
      {
         edtOMTipoId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTipoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTipoId_Enabled), 5, 0), true);
      }
      if ( ! ( ( AV48Verequipos == 1 ) ) )
      {
         divDvpanel_tableleaflevel_equipos_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tableleaflevel_equipos_cell_Internalname, "Class", divDvpanel_tableleaflevel_equipos_cell_Class, true);
      }
      else
      {
         if ( AV48Verequipos == 1 )
         {
            divDvpanel_tableleaflevel_equipos_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tableleaflevel_equipos_cell_Internalname, "Class", divDvpanel_tableleaflevel_equipos_cell_Class, true);
         }
      }
   }

   public void standaloneModal( )
   {
      A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13680OMDuracion", A13680OMDuracion);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV27Insert_PMCod) )
      {
         A9429PMCod = AV27Insert_PMCod ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV28Insert_SMCod) )
      {
         A9428SMCod = AV28Insert_SMCod ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         /* Using cursor T013U20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         h9428SMCod = "" ;
         while ( (pr_default.getStatus(16) != 101) )
         {
            h9428SMCod = T013U20_A9517SMDsc[0] ;
            n9517SMDsc = T013U20_n9517SMDsc[0] ;
            if (true) break;
         }
         pr_default.close(16);
         httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV26Insert_OMMaqCod)==0) )
      {
         A9426OMMaqCod = AV26Insert_OMMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      }
      else
      {
         A9426OMMaqCod = AV44ComboOMMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV45Insert_OMTipoId) )
      {
         A14492OMTipoId = AV45Insert_OMTipoId ;
         n14492OMTipoId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
      }
      else
      {
         if ( (0==AV47ComboOMTipoId) )
         {
            A14492OMTipoId = (short)(0) ;
            n14492OMTipoId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
            n14492OMTipoId = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
         }
         else
         {
            if ( ! (0==AV47ComboOMTipoId) )
            {
               A14492OMTipoId = AV47ComboOMTipoId ;
               n14492OMTipoId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A9437OMUsuCre = AV8UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
      }
      if ( ! (0==AV14OMCod) )
      {
         A9425OMCod = AV14OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  && true /* Level */ )
         {
            A9425OMCod = AV14OMCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
      if ( isIns( )  && (GXutil.strcmp("", A9445OMEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A9445OMEst = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A9436OMFchCre) && ( Gx_BScreen == 0 ) )
      {
         A9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T013U10 */
         pr_default.execute(8, new Object[] {A396EmprCod});
         A407EmprNom = T013U10_A407EmprNom[0] ;
         n407EmprNom = T013U10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(8);
         if ( ( A9428SMCod > 0 ) || ( A9429PMCod > 0 ) )
         {
            edtOMTxt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
         }
         else
         {
            edtOMTxt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
         }
         /* Using cursor T013U11 */
         pr_default.execute(9, new Object[] {A396EmprCod, A9426OMMaqCod});
         A9427OMMaqDsc = T013U11_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013U11_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         pr_default.close(9);
         /* Using cursor T013U15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A9426OMMaqCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            A13679OMMaqCodFo = T013U15_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = T013U15_n13679OMMaqCodFo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         else
         {
            A13679OMMaqCodFo = "" ;
            n13679OMMaqCodFo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         pr_default.close(13);
         if ( (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
         {
            A13678OMDscMqPla = A9427OMMaqDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
         }
         else
         {
            A13678OMDscMqPla = A13679OMMaqCodFo ;
            httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
         }
         /* Using cursor T013U14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n14492OMTipoId), Short.valueOf(A14492OMTipoId)});
         A14494OMTipoDc = T013U14_A14494OMTipoDc[0] ;
         pr_default.close(12);
         /* Using cursor T013U17 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            A9444OMRRCosT = T013U17_A9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = T013U17_A9443OMRCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         pr_default.close(14);
         /* Using cursor T013U19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A9442OMMRCosT = T013U19_A9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = T013U19_A9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         pr_default.close(15);
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
            {
               A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
            else
            {
               A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
         }
         if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && ( GXutil.strcmp(AV20Accion, "X") == 0 ) )
         {
            lblTextmensaje_Caption = httpContext.getMessage( httpContext.getMessage( "Orden ya cerrada, Opcion MODIFICACION", ""), "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTextmensaje_Internalname, "Caption", lblTextmensaje_Caption, true);
         }
      }
   }

   public void load13U1232( )
   {
      /* Using cursor T013U23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9437OMUsuCre = T013U23_A9437OMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
         A9445OMEst = T013U23_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A407EmprNom = T013U23_A407EmprNom[0] ;
         n407EmprNom = T013U23_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9427OMMaqDsc = T013U23_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013U23_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         A9433OMTxt = T013U23_A9433OMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
         A9438OMFchPre = T013U23_A9438OMFchPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
         A9436OMFchCre = T013U23_A9436OMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9464OMNot = T013U23_A9464OMNot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
         A9439OMFchCer = T013U23_A9439OMFchCer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14495OMPri = T013U23_A14495OMPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14495OMPri", GXutil.str( A14495OMPri, 1, 0));
         A14494OMTipoDc = T013U23_A14494OMTipoDc[0] ;
         A9426OMMaqCod = T013U23_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9429PMCod = T013U23_A9429PMCod[0] ;
         n9429PMCod = T013U23_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9428SMCod = T013U23_A9428SMCod[0] ;
         n9428SMCod = T013U23_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A14492OMTipoId = T013U23_A14492OMTipoId[0] ;
         n14492OMTipoId = T013U23_n14492OMTipoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
         A13679OMMaqCodFo = T013U23_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U23_n13679OMMaqCodFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         A9444OMRRCosT = T013U23_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = T013U23_A9443OMRCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9442OMMRCosT = T013U23_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = T013U23_A9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         zm13U1232( -56) ;
      }
      pr_default.close(17);
      onLoadActions13U1232( ) ;
   }

   public void onLoadActions13U1232( )
   {
      if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( GXutil.strcmp(sMode1232, "UPD") == 0 ) && ( GXutil.strcmp(AV20Accion, "X") == 0 ) )
      {
         lblTextmensaje_Caption = httpContext.getMessage( httpContext.getMessage( "Orden ya cerrada, Opcion MODIFICACION", ""), "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextmensaje_Internalname, "Caption", lblTextmensaje_Caption, true);
      }
      if ( (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
      {
         A13678OMDscMqPla = A9427OMMaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
      }
      else
      {
         A13678OMDscMqPla = A13679OMMaqCodFo ;
         httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
      if ( ( A9428SMCod > 0 ) || ( A9429PMCod > 0 ) )
      {
         edtOMTxt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      }
      else
      {
         edtOMTxt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      }
      /* Using cursor T013U24 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      h9428SMCod = "" ;
      while ( (pr_default.getStatus(18) != 101) )
      {
         h9428SMCod = T013U24_A9517SMDsc[0] ;
         n9517SMDsc = T013U24_n9517SMDsc[0] ;
         if (true) break;
      }
      pr_default.close(18);
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
   }

   public void checkExtendedTable13U1232( )
   {
      nIsDirty_1232 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h9428SMCod)==0) )
      {
         nIsDirty_1232 = (short)(1) ;
         A9428SMCod = 0 ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
      else
      {
         A9517SMDsc = h9428SMCod ;
         n9517SMDsc = false ;
         /* Using cursor T013U25 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
         A396EmprCod = T013U25_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013U25_A9428SMCod[0] ;
         n9428SMCod = T013U25_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A9428SMCod = T013U25_A9428SMCod[0] ;
         n9428SMCod = T013U25_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         if ( ! ( (pr_default.getStatus(19) == 101) ) )
         {
            pr_default.readNext(19);
            if ( ! ( (pr_default.getStatus(19) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "SMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(19);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && ( GXutil.strcmp(AV20Accion, "X") == 0 ) )
      {
         lblTextmensaje_Caption = httpContext.getMessage( httpContext.getMessage( "Orden ya cerrada, Opcion MODIFICACION", ""), "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextmensaje_Internalname, "Caption", lblTextmensaje_Caption, true);
      }
      if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  && ( GXutil.strcmp(AV20Accion, "X") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, no se permite modificar", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  && ( GXutil.strcmp(AV20Accion, "X") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, Opcion MODIFICACION", ""), 0, "");
      }
      if ( (GXutil.strcmp("", h9428SMCod)==0) )
      {
         nIsDirty_1232 = (short)(1) ;
         A9428SMCod = 0 ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
      else
      {
         A9517SMDsc = h9428SMCod ;
         n9517SMDsc = false ;
         /* Using cursor T013U26 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
         A396EmprCod = T013U26_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013U26_A9428SMCod[0] ;
         n9428SMCod = T013U26_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A9428SMCod = T013U26_A9428SMCod[0] ;
         n9428SMCod = T013U26_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         if ( ! ( (pr_default.getStatus(20) == 101) ) )
         {
            pr_default.readNext(20);
            if ( ! ( (pr_default.getStatus(20) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "SMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(20);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      /* Using cursor T013U10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013U10_A407EmprNom[0] ;
      n407EmprNom = T013U10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T013U11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9427OMMaqDsc = T013U11_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013U11_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      pr_default.close(9);
      /* Using cursor T013U12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(10);
      /* Using cursor T013U13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (0==A9428SMCod) && (GXutil.strcmp("", A9517SMDsc)==0) || (0==A9428SMCod) && n9428SMCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(11);
      /* Using cursor T013U14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n14492OMTipoId), Short.valueOf(A14492OMTipoId)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A14492OMTipoId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Mantenimiento", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMTIPOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A14494OMTipoDc = T013U14_A14494OMTipoDc[0] ;
      pr_default.close(12);
      /* Using cursor T013U15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A13679OMMaqCodFo = T013U15_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U15_n13679OMMaqCodFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A13679OMMaqCodFo = "" ;
         n13679OMMaqCodFo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      pr_default.close(13);
      if ( (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
      {
         nIsDirty_1232 = (short)(1) ;
         A13678OMDscMqPla = A9427OMMaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A13678OMDscMqPla = A13679OMMaqCodFo ;
         httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
      }
      /* Using cursor T013U17 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A9444OMRRCosT = T013U17_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = T013U17_A9443OMRCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         nIsDirty_1232 = (short)(1) ;
         A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      pr_default.close(14);
      /* Using cursor T013U19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A9442OMMRCosT = T013U19_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = T013U19_A9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         nIsDirty_1232 = (short)(1) ;
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      pr_default.close(15);
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         nIsDirty_1232 = (short)(1) ;
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            nIsDirty_1232 = (short)(1) ;
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            nIsDirty_1232 = (short)(1) ;
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
      if ( ( A9428SMCod > 0 ) || ( A9429PMCod > 0 ) )
      {
         edtOMTxt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      }
      else
      {
         edtOMTxt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      }
   }

   public void closeExtendedTableCursors13U1232( )
   {
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
   }

   public void enableDisable( )
   {
   }

   public void gxload_57( String A396EmprCod )
   {
      /* Using cursor T013U27 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013U27_A407EmprNom[0] ;
      n407EmprNom = T013U27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_58( String A396EmprCod ,
                          String A9426OMMaqCod )
   {
      /* Using cursor T013U28 */
      pr_default.execute(22, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9427OMMaqDsc = T013U28_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013U28_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9427OMMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_59( String A396EmprCod ,
                          int A9429PMCod )
   {
      /* Using cursor T013U29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void gxload_60( String A396EmprCod ,
                          int A9428SMCod )
   {
      /* Using cursor T013U30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (0==A9428SMCod) && (GXutil.strcmp("", A9517SMDsc)==0) || (0==A9428SMCod) && n9428SMCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void gxload_61( String A396EmprCod ,
                          short A14492OMTipoId )
   {
      /* Using cursor T013U31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n14492OMTipoId), Short.valueOf(A14492OMTipoId)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A14492OMTipoId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Mantenimiento", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMTIPOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A14494OMTipoDc = T013U31_A14494OMTipoDc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14494OMTipoDc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void gxload_62( String A396EmprCod ,
                          String A9426OMMaqCod )
   {
      /* Using cursor T013U32 */
      pr_default.execute(26, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A13679OMMaqCodFo = T013U32_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U32_n13679OMMaqCodFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      else
      {
         A13679OMMaqCodFo = "" ;
         n13679OMMaqCodFo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13679OMMaqCodFo))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void gxload_63( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T013U34 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A9444OMRRCosT = T013U34_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = T013U34_A9443OMRCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void gxload_64( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T013U36 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A9442OMMRCosT = T013U36_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = T013U36_A9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void getKey13U1232( )
   {
      /* Using cursor T013U37 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      else
      {
         RcdFound1232 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013U9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm13U1232( 56) ;
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T013U9_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9437OMUsuCre = T013U9_A9437OMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
         A9445OMEst = T013U9_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9433OMTxt = T013U9_A9433OMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
         A9438OMFchPre = T013U9_A9438OMFchPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
         A9436OMFchCre = T013U9_A9436OMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9464OMNot = T013U9_A9464OMNot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
         A9439OMFchCer = T013U9_A9439OMFchCer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14495OMPri = T013U9_A14495OMPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14495OMPri", GXutil.str( A14495OMPri, 1, 0));
         A396EmprCod = T013U9_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = T013U9_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9429PMCod = T013U9_A9429PMCod[0] ;
         n9429PMCod = T013U9_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9428SMCod = T013U9_A9428SMCod[0] ;
         n9428SMCod = T013U9_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A14492OMTipoId = T013U9_A14492OMTipoId[0] ;
         n14492OMTipoId = T013U9_n14492OMTipoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13U1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey13U1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey13U1232( ) ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey13U1232( ) ;
      if ( RcdFound1232 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T013U38 */
      pr_default.execute(30, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         while ( (pr_default.getStatus(30) != 101) && ( ( GXutil.strcmp(T013U38_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013U38_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U38_A9425OMCod[0] < A9425OMCod ) ) )
         {
            pr_default.readNext(30);
         }
         if ( (pr_default.getStatus(30) != 101) && ( ( GXutil.strcmp(T013U38_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013U38_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U38_A9425OMCod[0] > A9425OMCod ) ) )
         {
            A396EmprCod = T013U38_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9425OMCod = T013U38_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(30);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T013U39 */
      pr_default.execute(31, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         while ( (pr_default.getStatus(31) != 101) && ( ( GXutil.strcmp(T013U39_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013U39_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U39_A9425OMCod[0] > A9425OMCod ) ) )
         {
            pr_default.readNext(31);
         }
         if ( (pr_default.getStatus(31) != 101) && ( ( GXutil.strcmp(T013U39_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013U39_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U39_A9425OMCod[0] < A9425OMCod ) ) )
         {
            A396EmprCod = T013U39_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9425OMCod = T013U39_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(31);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13U1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOMMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13U1232( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1232 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9425OMCod = Z9425OMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOMMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update13U1232( ) ;
               GX_FocusControl = edtOMMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtOMMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13U1232( ) ;
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
                  GX_FocusControl = edtOMMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13U1232( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = Z9425OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOMMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13U1232( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h9428SMCod)==0) )
         {
            A9428SMCod = 0 ;
            n9428SMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         }
         else
         {
            A9517SMDsc = h9428SMCod ;
            n9517SMDsc = false ;
            /* Using cursor T013U40 */
            pr_default.execute(32, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
            A396EmprCod = T013U40_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9428SMCod = T013U40_A9428SMCod[0] ;
            n9428SMCod = T013U40_n9428SMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            A9428SMCod = T013U40_A9428SMCod[0] ;
            n9428SMCod = T013U40_n9428SMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            if ( ! ( (pr_default.getStatus(32) == 101) ) )
            {
               pr_default.readNext(32);
               if ( ! ( (pr_default.getStatus(32) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "SMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(32);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T013U8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z9437OMUsuCre, T013U8_A9437OMUsuCre[0]) != 0 ) || ( GXutil.strcmp(Z9445OMEst, T013U8_A9445OMEst[0]) != 0 ) || ( GXutil.strcmp(Z9433OMTxt, T013U8_A9433OMTxt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9438OMFchPre), GXutil.resetTime(T013U8_A9438OMFchPre[0])) ) || !( GXutil.dateCompare(Z9436OMFchCre, T013U8_A9436OMFchCre[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9464OMNot, T013U8_A9464OMNot[0]) != 0 ) || !( GXutil.dateCompare(Z9439OMFchCer, T013U8_A9439OMFchCer[0]) ) || ( Z14495OMPri != T013U8_A14495OMPri[0] ) || ( GXutil.strcmp(Z9426OMMaqCod, T013U8_A9426OMMaqCod[0]) != 0 ) || ( Z9429PMCod != T013U8_A9429PMCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9428SMCod != T013U8_A9428SMCod[0] ) || ( Z14492OMTipoId != T013U8_A14492OMTipoId[0] ) )
         {
            if ( GXutil.strcmp(Z9437OMUsuCre, T013U8_A9437OMUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMUsuCre");
               GXutil.writeLogRaw("Old: ",Z9437OMUsuCre);
               GXutil.writeLogRaw("Current: ",T013U8_A9437OMUsuCre[0]);
            }
            if ( GXutil.strcmp(Z9445OMEst, T013U8_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T013U8_A9445OMEst[0]);
            }
            if ( GXutil.strcmp(Z9433OMTxt, T013U8_A9433OMTxt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMTxt");
               GXutil.writeLogRaw("Old: ",Z9433OMTxt);
               GXutil.writeLogRaw("Current: ",T013U8_A9433OMTxt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9438OMFchPre), GXutil.resetTime(T013U8_A9438OMFchPre[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMFchPre");
               GXutil.writeLogRaw("Old: ",Z9438OMFchPre);
               GXutil.writeLogRaw("Current: ",T013U8_A9438OMFchPre[0]);
            }
            if ( !( GXutil.dateCompare(Z9436OMFchCre, T013U8_A9436OMFchCre[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMFchCre");
               GXutil.writeLogRaw("Old: ",Z9436OMFchCre);
               GXutil.writeLogRaw("Current: ",T013U8_A9436OMFchCre[0]);
            }
            if ( GXutil.strcmp(Z9464OMNot, T013U8_A9464OMNot[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMNot");
               GXutil.writeLogRaw("Old: ",Z9464OMNot);
               GXutil.writeLogRaw("Current: ",T013U8_A9464OMNot[0]);
            }
            if ( !( GXutil.dateCompare(Z9439OMFchCer, T013U8_A9439OMFchCer[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMFchCer");
               GXutil.writeLogRaw("Old: ",Z9439OMFchCer);
               GXutil.writeLogRaw("Current: ",T013U8_A9439OMFchCer[0]);
            }
            if ( Z14495OMPri != T013U8_A14495OMPri[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMPri");
               GXutil.writeLogRaw("Old: ",Z14495OMPri);
               GXutil.writeLogRaw("Current: ",T013U8_A14495OMPri[0]);
            }
            if ( GXutil.strcmp(Z9426OMMaqCod, T013U8_A9426OMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9426OMMaqCod);
               GXutil.writeLogRaw("Current: ",T013U8_A9426OMMaqCod[0]);
            }
            if ( Z9429PMCod != T013U8_A9429PMCod[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"PMCod");
               GXutil.writeLogRaw("Old: ",Z9429PMCod);
               GXutil.writeLogRaw("Current: ",T013U8_A9429PMCod[0]);
            }
            if ( Z9428SMCod != T013U8_A9428SMCod[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"SMCod");
               GXutil.writeLogRaw("Old: ",Z9428SMCod);
               GXutil.writeLogRaw("Current: ",T013U8_A9428SMCod[0]);
            }
            if ( Z14492OMTipoId != T013U8_A14492OMTipoId[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmorden:[seudo value changed for attri]"+"OMTipoId");
               GXutil.writeLogRaw("Old: ",Z14492OMTipoId);
               GXutil.writeLogRaw("Current: ",T013U8_A14492OMTipoId[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13U1232( )
   {
      beforeValidate13U1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13U1232( 0) ;
         checkOptimisticConcurrency13U1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13U1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13U1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U41 */
                  pr_default.execute(33, new Object[] {Integer.valueOf(A9425OMCod), A9437OMUsuCre, A9445OMEst, A9433OMTxt, A9438OMFchPre, A9436OMFchCre, A9464OMNot, A9439OMFchCer, Byte.valueOf(A14495OMPri), A396EmprCod, A9426OMMaqCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod), Boolean.valueOf(n14492OMTipoId), Short.valueOf(A14492OMTipoId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(33) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && true /* After */ )
                     {
                        new app.pbmorrep(remoteHandle, context).execute( A396EmprCod, A9425OMCod, A9426OMMaqCod) ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13U1232( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption13U0( ) ;
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
            load13U1232( ) ;
         }
         endLevel13U1232( ) ;
      }
      closeExtendedTableCursors13U1232( ) ;
   }

   public void update13U1232( )
   {
      beforeValidate13U1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13U1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13U1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13U1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U42 */
                  pr_default.execute(34, new Object[] {A9437OMUsuCre, A9445OMEst, A9433OMTxt, A9438OMFchPre, A9436OMFchCre, A9464OMNot, A9439OMFchCer, Byte.valueOf(A14495OMPri), A9426OMMaqCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod), Boolean.valueOf(n14492OMTipoId), Short.valueOf(A14492OMTipoId), A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(34) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13U1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13U1232( ) ;
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
         endLevel13U1232( ) ;
      }
      closeExtendedTableCursors13U1232( ) ;
   }

   public void deferredUpdate13U1232( )
   {
   }

   public void delete( )
   {
      beforeValidate13U1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13U1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13U1232( ) ;
         afterConfirm13U1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13U1232( ) ;
            if ( AnyError == 0 )
            {
               scanStart13U1531( ) ;
               while ( RcdFound1531 != 0 )
               {
                  getByPrimaryKey13U1531( ) ;
                  delete13U1531( ) ;
                  scanNext13U1531( ) ;
               }
               scanEnd13U1531( ) ;
               scanStart13U1530( ) ;
               while ( RcdFound1530 != 0 )
               {
                  getByPrimaryKey13U1530( ) ;
                  delete13U1530( ) ;
                  scanNext13U1530( ) ;
               }
               scanEnd13U1530( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U43 */
                  pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
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
      sMode1232 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13U1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13U1232( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  && ( GXutil.strcmp(AV20Accion, "X") != 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, no se permite modificar", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  && ( GXutil.strcmp(AV20Accion, "X") == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, Opcion MODIFICACION", ""), 0, "");
         }
         /* Using cursor T013U44 */
         pr_default.execute(36, new Object[] {A396EmprCod});
         A407EmprNom = T013U44_A407EmprNom[0] ;
         n407EmprNom = T013U44_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(36);
         /* Using cursor T013U46 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            A9444OMRRCosT = T013U46_A9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = T013U46_A9443OMRCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         pr_default.close(37);
         /* Using cursor T013U48 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            A9442OMMRCosT = T013U48_A9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = T013U48_A9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         pr_default.close(38);
         /* Using cursor T013U49 */
         pr_default.execute(39, new Object[] {A396EmprCod, A9426OMMaqCod});
         A9427OMMaqDsc = T013U49_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013U49_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         pr_default.close(39);
         /* Using cursor T013U50 */
         pr_default.execute(40, new Object[] {A396EmprCod, A9426OMMaqCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            A13679OMMaqCodFo = T013U50_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = T013U50_n13679OMMaqCodFo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         else
         {
            A13679OMMaqCodFo = "" ;
            n13679OMMaqCodFo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         pr_default.close(40);
         if ( (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
         {
            A13678OMDscMqPla = A9427OMMaqDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
         }
         else
         {
            A13678OMDscMqPla = A13679OMMaqCodFo ;
            httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
         }
         if ( ( A9428SMCod > 0 ) || ( A9429PMCod > 0 ) )
         {
            edtOMTxt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
         }
         else
         {
            edtOMTxt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
         }
         /* Using cursor T013U51 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n14492OMTipoId), Short.valueOf(A14492OMTipoId)});
         A14494OMTipoDc = T013U51_A14494OMTipoDc[0] ;
         pr_default.close(41);
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
            {
               A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
            else
            {
               A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
         }
         if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && ( GXutil.strcmp(AV20Accion, "X") == 0 ) )
         {
            lblTextmensaje_Caption = httpContext.getMessage( httpContext.getMessage( "Orden ya cerrada, Opcion MODIFICACION", ""), "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTextmensaje_Internalname, "Caption", lblTextmensaje_Caption, true);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013U52 */
         pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Asignacion de las piezas a realizar la Tarea", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T013U53 */
         pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MO de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T013U54 */
         pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Rep. de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
      }
   }

   public void processNestedLevel13U1531( )
   {
      nGXsfl_136_idx = 0 ;
      while ( nGXsfl_136_idx < nRC_GXsfl_136 )
      {
         readRow13U1531( ) ;
         if ( ( nRcdExists_1531 != 0 ) || ( nIsMod_1531 != 0 ) )
         {
            standaloneNotModal13U1531( ) ;
            getKey13U1531( ) ;
            if ( ( nRcdExists_1531 == 0 ) && ( nRcdDeleted_1531 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13U1531( ) ;
            }
            else
            {
               if ( RcdFound1531 != 0 )
               {
                  if ( ( nRcdDeleted_1531 != 0 ) && ( nRcdExists_1531 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13U1531( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1531 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13U1531( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1531 == 0 )
                  {
                     GXCCtl = "OMMEQUCOD_" + sGXsfl_136_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMMEquCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMMEquCod_Internalname, GXutil.rtrim( A11446OMMEquCod)) ;
         httpContext.changePostValue( edtOMMEqDc_Internalname, GXutil.rtrim( A14497OMMEqDc)) ;
         httpContext.changePostValue( edtOMMSEqCod_Internalname, GXutil.rtrim( A11447OMMSEqCod)) ;
         httpContext.changePostValue( edtOMMSqDc_Internalname, GXutil.rtrim( A14498OMMSqDc)) ;
         httpContext.changePostValue( edtOMMPieCod_Internalname, GXutil.rtrim( A11448OMMPieCod)) ;
         httpContext.changePostValue( edtOMMPieDc_Internalname, GXutil.rtrim( A14499OMMPieDc)) ;
         httpContext.changePostValue( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_136_idx, GXutil.rtrim( Z11446OMMEquCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_136_idx, GXutil.rtrim( Z11447OMMSEqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_136_idx, GXutil.rtrim( Z11448OMMPieCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1531_"+sGXsfl_136_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1531_"+sGXsfl_136_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1531_"+sGXsfl_136_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1531 != 0 )
         {
            httpContext.changePostValue( "OMMEQUCOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMEQDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEqDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSEQCOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSQDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSqDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIECOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIEDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13U1531( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1531 = (short)(0) ;
      nIsMod_1531 = (short)(0) ;
      nRcdDeleted_1531 = (short)(0) ;
   }

   public void processNestedLevel13U1530( )
   {
      nGXsfl_150_idx = 0 ;
      while ( nGXsfl_150_idx < nRC_GXsfl_150 )
      {
         readRow13U1530( ) ;
         if ( ( nRcdExists_1530 != 0 ) || ( nIsMod_1530 != 0 ) )
         {
            standaloneNotModal13U1530( ) ;
            getKey13U1530( ) ;
            if ( ( nRcdExists_1530 == 0 ) && ( nRcdDeleted_1530 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13U1530( ) ;
            }
            else
            {
               if ( RcdFound1530 != 0 )
               {
                  if ( ( nRcdDeleted_1530 != 0 ) && ( nRcdExists_1530 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13U1530( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1530 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13U1530( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1530 == 0 )
                  {
                     GXCCtl = "TMCOD_" + sGXsfl_150_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1530_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1530_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1530_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1530 != 0 )
         {
            httpContext.changePostValue( "TMCOD_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMCOD_"+sGXsfl_150_idx+"Horizontalalignment", GXutil.rtrim( edtTMCod_Horizontalalignment)) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13U1530( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1530 = (short)(0) ;
      nIsMod_1530 = (short)(0) ;
      nRcdDeleted_1530 = (short)(0) ;
   }

   public void processLevel13U1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel13U1531( ) ;
      processNestedLevel13U1530( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13U1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13U1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmorden");
         if ( AnyError == 0 )
         {
            confirmValues13U0( ) ;
         }
         /* After transaction rules */
         if ( ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 ) && true /* After */ )
         {
            A9445OMEst = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmorden");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13U1232( )
   {
      /* Scan By routine */
      /* Using cursor T013U55 */
      pr_default.execute(45);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A396EmprCod = T013U55_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = T013U55_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1232( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A396EmprCod = T013U55_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = T013U55_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
   }

   public void scanEnd13U1232( )
   {
      pr_default.close(45);
   }

   public void afterConfirm13U1232( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXt_int14 = A9425OMCod ;
         GXv_int8[0] = GXt_int14 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTORD", ""), ""), GXv_int8) ;
         tmorden_impl.this.GXt_int14 = GXv_int8[0] ;
         A9425OMCod = GXt_int14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
   }

   public void beforeInsert13U1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13U1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13U1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13U1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13U1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13U1232( )
   {
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      edtOMPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMPri_Enabled), 5, 0), true);
      edtavAccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAccion_Enabled), 5, 0), true);
      edtavMode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMode_Enabled), 5, 0), true);
      edtOMFchPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchPre_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Enabled), 5, 0), true);
      edtSMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      edtPMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      edtOMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Enabled), 5, 0), true);
      edtOMTipoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTipoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTipoId_Enabled), 5, 0), true);
      edtOMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      edtOMNot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMNot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMNot_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboommaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboommaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboommaqcod_Enabled), 5, 0), true);
      edtavComboomtipoid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboomtipoid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboomtipoid_Enabled), 5, 0), true);
      edtOMDuracion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMDuracion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDuracion_Enabled), 5, 0), true);
      edtOMCosRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCosRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCosRea_Enabled), 5, 0), true);
      edtOMRRCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCosT_Enabled), 5, 0), true);
      edtOMRCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCosT_Enabled), 5, 0), true);
      edtOMMRCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCosT_Enabled), 5, 0), true);
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOMMaqCodFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCodFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCodFo_Enabled), 5, 0), true);
      edtOMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Enabled), 5, 0), true);
      edtOMDscMqPla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMDscMqPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDscMqPla_Enabled), 5, 0), true);
   }

   public void zm13U1531( int GX_JID )
   {
      if ( ( GX_JID == 65 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -65 )
      {
         Z9425OMCod = A9425OMCod ;
         Z396EmprCod = A396EmprCod ;
         Z11446OMMEquCod = A11446OMMEquCod ;
         Z11447OMMSEqCod = A11447OMMSEqCod ;
         Z11448OMMPieCod = A11448OMMPieCod ;
         Z12599OMMEquDsc = A12599OMMEquDsc ;
         Z12600OMMSEqDsc = A12600OMMSEqDsc ;
         Z11449OMMPieDsc = A11449OMMPieDsc ;
      }
   }

   public void standaloneNotModal13U1531( )
   {
   }

   public void standaloneModal13U1531( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMMEquCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      }
      else
      {
         edtOMMEquCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMMSEqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      }
      else
      {
         edtOMMSEqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMMPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      }
      else
      {
         edtOMMPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      }
   }

   public void load13U1531( )
   {
      /* Using cursor T013U56 */
      pr_default.execute(46, new Object[] {A9426OMMaqCod, A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound1531 = (short)(1) ;
         A12599OMMEquDsc = T013U56_A12599OMMEquDsc[0] ;
         A12600OMMSEqDsc = T013U56_A12600OMMSEqDsc[0] ;
         A11449OMMPieDsc = T013U56_A11449OMMPieDsc[0] ;
         n11449OMMPieDsc = T013U56_n11449OMMPieDsc[0] ;
         zm13U1531( -65) ;
      }
      pr_default.close(46);
      onLoadActions13U1531( ) ;
   }

   public void onLoadActions13U1531( )
   {
      GXt_char1 = A14497OMMEqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.peqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14497OMMEqDc = GXt_char1 ;
      GXt_char1 = A14498OMMSqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pseqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14498OMMSqDc = GXt_char1 ;
      GXt_char1 = A14499OMMPieDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppiedc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14499OMMPieDc = GXt_char1 ;
   }

   public void checkExtendedTable13U1531( )
   {
      nIsDirty_1531 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13U1531( ) ;
      nIsDirty_1531 = (short)(1) ;
      GXt_char1 = A14497OMMEqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.peqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14497OMMEqDc = GXt_char1 ;
      nIsDirty_1531 = (short)(1) ;
      GXt_char1 = A14498OMMSqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pseqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14498OMMSqDc = GXt_char1 ;
      /* Using cursor T013U7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "OMMPIECOD_" + sGXsfl_136_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Equipos En Ordenes de Mantenimeinto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMEquCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12599OMMEquDsc = T013U7_A12599OMMEquDsc[0] ;
      A12600OMMSEqDsc = T013U7_A12600OMMSEqDsc[0] ;
      A11449OMMPieDsc = T013U7_A11449OMMPieDsc[0] ;
      n11449OMMPieDsc = T013U7_n11449OMMPieDsc[0] ;
      pr_default.close(5);
      nIsDirty_1531 = (short)(1) ;
      GXt_char1 = A14499OMMPieDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppiedc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14499OMMPieDc = GXt_char1 ;
   }

   public void closeExtendedTableCursors13U1531( )
   {
      pr_default.close(5);
   }

   public void enableDisable13U1531( )
   {
   }

   public void gxload_66( String A396EmprCod ,
                          String A9426OMMaqCod ,
                          String A11446OMMEquCod ,
                          String A11447OMMSEqCod ,
                          String A11448OMMPieCod )
   {
      /* Using cursor T013U57 */
      pr_default.execute(47, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(47) == 101) )
      {
         GXCCtl = "OMMPIECOD_" + sGXsfl_136_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Equipos En Ordenes de Mantenimeinto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMEquCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12599OMMEquDsc = T013U57_A12599OMMEquDsc[0] ;
      A12600OMMSEqDsc = T013U57_A12600OMMSEqDsc[0] ;
      A11449OMMPieDsc = T013U57_A11449OMMPieDsc[0] ;
      n11449OMMPieDsc = T013U57_n11449OMMPieDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12599OMMEquDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12600OMMSEqDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11449OMMPieDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(47) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(47);
   }

   public void getKey13U1531( )
   {
      /* Using cursor T013U58 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1531 = (short)(1) ;
      }
      else
      {
         RcdFound1531 = (short)(0) ;
      }
      pr_default.close(48);
   }

   public void getByPrimaryKey13U1531( )
   {
      /* Using cursor T013U6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm13U1531( 65) ;
         RcdFound1531 = (short)(1) ;
         initializeNonKey13U1531( ) ;
         A11446OMMEquCod = T013U6_A11446OMMEquCod[0] ;
         A11447OMMSEqCod = T013U6_A11447OMMSEqCod[0] ;
         A11448OMMPieCod = T013U6_A11448OMMPieCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z11446OMMEquCod = A11446OMMEquCod ;
         Z11447OMMSEqCod = A11447OMMSEqCod ;
         Z11448OMMPieCod = A11448OMMPieCod ;
         sMode1531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13U1531( ) ;
         Gx_mode = sMode1531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1531 = (short)(0) ;
         initializeNonKey13U1531( ) ;
         sMode1531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13U1531( ) ;
         Gx_mode = sMode1531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13U1531( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency13U1531( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013U5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrde1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrde1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13U1531( )
   {
      beforeValidate13U1531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1531( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13U1531( 0) ;
         checkOptimisticConcurrency13U1531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13U1531( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13U1531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U59 */
                  pr_default.execute(49, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde1");
                  if ( (pr_default.getStatus(49) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && true /* After */ )
                     {
                        new app.pcmorrep(remoteHandle, context).execute( A396EmprCod, A9425OMCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod) ;
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
            load13U1531( ) ;
         }
         endLevel13U1531( ) ;
      }
      closeExtendedTableCursors13U1531( ) ;
   }

   public void update13U1531( )
   {
      beforeValidate13U1531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1531( ) ;
      }
      if ( ( nIsMod_1531 != 0 ) || ( nIsDirty_1531 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13U1531( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13U1531( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13U1531( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMOrde1 */
                     deferredUpdate13U1531( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13U1531( ) ;
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
            endLevel13U1531( ) ;
         }
      }
      closeExtendedTableCursors13U1531( ) ;
   }

   public void deferredUpdate13U1531( )
   {
   }

   public void delete13U1531( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13U1531( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13U1531( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13U1531( ) ;
         afterConfirm13U1531( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13U1531( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013U60 */
               pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde1");
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
      sMode1531 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13U1531( ) ;
      Gx_mode = sMode1531 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13U1531( )
   {
      standaloneModal13U1531( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A14497OMMEqDc ;
         GXv_char4[0] = GXt_char1 ;
         new app.peqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, GXv_char4) ;
         tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
         A14497OMMEqDc = GXt_char1 ;
         GXt_char1 = A14498OMMSqDc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pseqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, GXv_char4) ;
         tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
         A14498OMMSqDc = GXt_char1 ;
         /* Using cursor T013U61 */
         pr_default.execute(51, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
         A12599OMMEquDsc = T013U61_A12599OMMEquDsc[0] ;
         A12600OMMSEqDsc = T013U61_A12600OMMSEqDsc[0] ;
         A11449OMMPieDsc = T013U61_A11449OMMPieDsc[0] ;
         n11449OMMPieDsc = T013U61_n11449OMMPieDsc[0] ;
         pr_default.close(51);
         GXt_char1 = A14499OMMPieDc ;
         GXv_char4[0] = GXt_char1 ;
         new app.ppiedc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod, GXv_char4) ;
         tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
         A14499OMMPieDc = GXt_char1 ;
      }
   }

   public void endLevel13U1531( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13U1531( )
   {
      /* Scan By routine */
      /* Using cursor T013U62 */
      pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1531 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound1531 = (short)(1) ;
         A11446OMMEquCod = T013U62_A11446OMMEquCod[0] ;
         A11447OMMSEqCod = T013U62_A11447OMMSEqCod[0] ;
         A11448OMMPieCod = T013U62_A11448OMMPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1531( )
   {
      /* Scan next routine */
      pr_default.readNext(52);
      RcdFound1531 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound1531 = (short)(1) ;
         A11446OMMEquCod = T013U62_A11446OMMEquCod[0] ;
         A11447OMMSEqCod = T013U62_A11447OMMSEqCod[0] ;
         A11448OMMPieCod = T013U62_A11448OMMPieCod[0] ;
      }
   }

   public void scanEnd13U1531( )
   {
      pr_default.close(52);
   }

   public void afterConfirm13U1531( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13U1531( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13U1531( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13U1531( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13U1531( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13U1531( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13U1531( )
   {
      edtOMMEquCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      edtOMMEqDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMEqDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEqDc_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      edtOMMSEqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      edtOMMSqDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMSqDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSqDc_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      edtOMMPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      edtOMMPieDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMPieDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieDc_Enabled), 5, 0), !bGXsfl_136_Refreshing);
   }

   public void send_integrity_lvl_hashes13U1531( )
   {
   }

   public void zm13U1530( int GX_JID )
   {
      if ( ( GX_JID == 67 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -67 )
      {
         Z9425OMCod = A9425OMCod ;
         Z396EmprCod = A396EmprCod ;
         Z9430TMCod = A9430TMCod ;
         Z9431TMDsc = A9431TMDsc ;
         Z9432TMTxt = A9432TMTxt ;
      }
   }

   public void standaloneNotModal13U1530( )
   {
   }

   public void standaloneModal13U1530( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      }
      else
      {
         edtTMCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      }
   }

   public void load13U1530( )
   {
      /* Using cursor T013U63 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9431TMDsc = T013U63_A9431TMDsc[0] ;
         n9431TMDsc = T013U63_n9431TMDsc[0] ;
         A9432TMTxt = T013U63_A9432TMTxt[0] ;
         n9432TMTxt = T013U63_n9432TMTxt[0] ;
         zm13U1530( -67) ;
      }
      pr_default.close(53);
      onLoadActions13U1530( ) ;
   }

   public void onLoadActions13U1530( )
   {
   }

   public void checkExtendedTable13U1530( )
   {
      nIsDirty_1530 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13U1530( ) ;
      /* Using cursor T013U4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9431TMDsc = T013U4_A9431TMDsc[0] ;
      n9431TMDsc = T013U4_n9431TMDsc[0] ;
      A9432TMTxt = T013U4_A9432TMTxt[0] ;
      n9432TMTxt = T013U4_n9432TMTxt[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors13U1530( )
   {
      pr_default.close(2);
   }

   public void enableDisable13U1530( )
   {
   }

   public void gxload_68( String A396EmprCod ,
                          int A9430TMCod )
   {
      /* Using cursor T013U64 */
      pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9431TMDsc = T013U64_A9431TMDsc[0] ;
      n9431TMDsc = T013U64_n9431TMDsc[0] ;
      A9432TMTxt = T013U64_A9432TMTxt[0] ;
      n9432TMTxt = T013U64_n9432TMTxt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9431TMDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A9432TMTxt)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(54) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(54);
   }

   public void getKey13U1530( )
   {
      /* Using cursor T013U65 */
      pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound1530 = (short)(1) ;
      }
      else
      {
         RcdFound1530 = (short)(0) ;
      }
      pr_default.close(55);
   }

   public void getByPrimaryKey13U1530( )
   {
      /* Using cursor T013U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13U1530( 67) ;
         RcdFound1530 = (short)(1) ;
         initializeNonKey13U1530( ) ;
         A9430TMCod = T013U3_A9430TMCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9430TMCod = A9430TMCod ;
         sMode1530 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13U1530( ) ;
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1530 = (short)(0) ;
         initializeNonKey13U1530( ) ;
         sMode1530 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13U1530( ) ;
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13U1530( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13U1530( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013U2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrde2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrde2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13U1530( )
   {
      beforeValidate13U1530( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1530( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13U1530( 0) ;
         checkOptimisticConcurrency13U1530( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13U1530( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13U1530( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U66 */
                  pr_default.execute(56, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod, Integer.valueOf(A9430TMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde2");
                  if ( (pr_default.getStatus(56) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int8[0] = A9425OMCod ;
                        GXv_int15[0] = A9430TMCod ;
                        new app.pamorrep(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int15) ;
                        tmorden_impl.this.A396EmprCod = GXv_char4[0] ;
                        tmorden_impl.this.A9425OMCod = GXv_int8[0] ;
                        tmorden_impl.this.A9430TMCod = GXv_int15[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
            load13U1530( ) ;
         }
         endLevel13U1530( ) ;
      }
      closeExtendedTableCursors13U1530( ) ;
   }

   public void update13U1530( )
   {
      beforeValidate13U1530( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1530( ) ;
      }
      if ( ( nIsMod_1530 != 0 ) || ( nIsDirty_1530 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13U1530( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13U1530( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13U1530( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMOrde2 */
                     deferredUpdate13U1530( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13U1530( ) ;
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
            endLevel13U1530( ) ;
         }
      }
      closeExtendedTableCursors13U1530( ) ;
   }

   public void deferredUpdate13U1530( )
   {
   }

   public void delete13U1530( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13U1530( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13U1530( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13U1530( ) ;
         afterConfirm13U1530( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13U1530( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013U67 */
               pr_default.execute(57, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde2");
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
      sMode1530 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13U1530( ) ;
      Gx_mode = sMode1530 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13U1530( )
   {
      standaloneModal13U1530( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013U68 */
         pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
         A9431TMDsc = T013U68_A9431TMDsc[0] ;
         n9431TMDsc = T013U68_n9431TMDsc[0] ;
         A9432TMTxt = T013U68_A9432TMTxt[0] ;
         n9432TMTxt = T013U68_n9432TMTxt[0] ;
         pr_default.close(58);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013U69 */
         pr_default.execute(59, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Asignacion de las piezas a realizar la Tarea", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
      }
   }

   public void endLevel13U1530( )
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

   public void scanStart13U1530( )
   {
      /* Scan By routine */
      /* Using cursor T013U70 */
      pr_default.execute(60, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1530 = (short)(0) ;
      if ( (pr_default.getStatus(60) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9430TMCod = T013U70_A9430TMCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1530( )
   {
      /* Scan next routine */
      pr_default.readNext(60);
      RcdFound1530 = (short)(0) ;
      if ( (pr_default.getStatus(60) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9430TMCod = T013U70_A9430TMCod[0] ;
      }
   }

   public void scanEnd13U1530( )
   {
      pr_default.close(60);
   }

   public void afterConfirm13U1530( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13U1530( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13U1530( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13U1530( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13U1530( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13U1530( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13U1530( )
   {
      edtTMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
   }

   public void send_integrity_lvl_hashes13U1530( )
   {
   }

   public void send_integrity_lvl_hashes13U1232( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Accion, ""))));
   }

   public void subsflControlProps_1361531( )
   {
      edtOMMEquCod_Internalname = "OMMEQUCOD_"+sGXsfl_136_idx ;
      imgprompt_11446_Internalname = "PROMPT_11446_"+sGXsfl_136_idx ;
      edtOMMEqDc_Internalname = "OMMEQDC_"+sGXsfl_136_idx ;
      edtOMMSEqCod_Internalname = "OMMSEQCOD_"+sGXsfl_136_idx ;
      imgprompt_11446_11447_Internalname = "PROMPT_11446_11447_"+sGXsfl_136_idx ;
      edtOMMSqDc_Internalname = "OMMSQDC_"+sGXsfl_136_idx ;
      edtOMMPieCod_Internalname = "OMMPIECOD_"+sGXsfl_136_idx ;
      imgprompt_11446_11447_11448_Internalname = "PROMPT_11446_11447_11448_"+sGXsfl_136_idx ;
      edtOMMPieDc_Internalname = "OMMPIEDC_"+sGXsfl_136_idx ;
   }

   public void subsflControlProps_fel_1361531( )
   {
      edtOMMEquCod_Internalname = "OMMEQUCOD_"+sGXsfl_136_fel_idx ;
      imgprompt_11446_Internalname = "PROMPT_11446_"+sGXsfl_136_fel_idx ;
      edtOMMEqDc_Internalname = "OMMEQDC_"+sGXsfl_136_fel_idx ;
      edtOMMSEqCod_Internalname = "OMMSEQCOD_"+sGXsfl_136_fel_idx ;
      imgprompt_11446_11447_Internalname = "PROMPT_11446_11447_"+sGXsfl_136_fel_idx ;
      edtOMMSqDc_Internalname = "OMMSQDC_"+sGXsfl_136_fel_idx ;
      edtOMMPieCod_Internalname = "OMMPIECOD_"+sGXsfl_136_fel_idx ;
      imgprompt_11446_11447_11448_Internalname = "PROMPT_11446_11447_11448_"+sGXsfl_136_fel_idx ;
      edtOMMPieDc_Internalname = "OMMPIEDC_"+sGXsfl_136_fel_idx ;
   }

   public void addRow13U1531( )
   {
      nGXsfl_136_idx = (int)(nGXsfl_136_idx+1) ;
      sGXsfl_136_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_136_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1361531( ) ;
      sendRow13U1531( ) ;
   }

   public void sendRow13U1531( )
   {
      Gridlevel_equiposRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_equipos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_equipos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_equipos_Class, "") != 0 )
         {
            subGridlevel_equipos_Linesclass = subGridlevel_equipos_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_equipos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_equipos_Backstyle = (byte)(0) ;
         subGridlevel_equipos_Backcolor = subGridlevel_equipos_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_equipos_Class, "") != 0 )
         {
            subGridlevel_equipos_Linesclass = subGridlevel_equipos_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_equipos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_equipos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_equipos_Class, "") != 0 )
         {
            subGridlevel_equipos_Linesclass = subGridlevel_equipos_Class+"Odd" ;
         }
         subGridlevel_equipos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_equipos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_equipos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_136_idx) % (2))) == 0 )
         {
            subGridlevel_equipos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_equipos_Class, "") != 0 )
            {
               subGridlevel_equipos_Linesclass = subGridlevel_equipos_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_equipos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_equipos_Class, "") != 0 )
            {
               subGridlevel_equipos_Linesclass = subGridlevel_equipos_Class+"Odd" ;
            }
         }
      }
      imgprompt_11446_11447_11448_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.mantenimientomaquina.seleccionpiezas"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( AV24EmprCod), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"OMMAQCOD"+"'), id:'"+"OMMAQCOD"+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"OMMEQUCOD_"+sGXsfl_136_idx+"'), id:'"+"OMMEQUCOD_"+sGXsfl_136_idx+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"OMMSEQCOD_"+sGXsfl_136_idx+"'), id:'"+"OMMSEQCOD_"+sGXsfl_136_idx+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"OMMPIECOD_"+sGXsfl_136_idx+"'), id:'"+"OMMPIECOD_"+sGXsfl_136_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"OMMPIEDC_"+sGXsfl_136_idx+"'), id:'"+"OMMPIEDC_"+sGXsfl_136_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_1531_"+sGXsfl_136_idx+","+"'', false"+","+"false"+");") ;
      imgprompt_11446_11447_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.mantenimientomaquina.seleccionsubequipos"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( AV24EmprCod), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"OMMAQCOD"+"'), id:'"+"OMMAQCOD"+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"OMMEQUCOD_"+sGXsfl_136_idx+"'), id:'"+"OMMEQUCOD_"+sGXsfl_136_idx+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"OMMSEQCOD_"+sGXsfl_136_idx+"'), id:'"+"OMMSEQCOD_"+sGXsfl_136_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"OMMSQDC_"+sGXsfl_136_idx+"'), id:'"+"OMMSQDC_"+sGXsfl_136_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_1531_"+sGXsfl_136_idx+","+"'', false"+","+"false"+");") ;
      imgprompt_11446_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.mantenimientomaquina.seleccionequipos"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( AV24EmprCod), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"OMMAQCOD"+"'), id:'"+"OMMAQCOD"+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"OMMEQUCOD_"+sGXsfl_136_idx+"'), id:'"+"OMMEQUCOD_"+sGXsfl_136_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"OMMEQDC_"+sGXsfl_136_idx+"'), id:'"+"OMMEQDC_"+sGXsfl_136_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_1531_"+sGXsfl_136_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1531_" + sGXsfl_136_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_136_idx + "',136)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMEquCod_Internalname,GXutil.rtrim( A11446OMMEquCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMEquCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMEquCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(136),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_11446_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_11446_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_equiposRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_11446_Internalname,sImgUrl,imgprompt_11446_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_11446_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMEqDc_Internalname,GXutil.rtrim( A14497OMMEqDc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMEqDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMEqDc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(136),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1531_" + sGXsfl_136_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_136_idx + "',136)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMSEqCod_Internalname,GXutil.rtrim( A11447OMMSEqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMSEqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMSEqCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(136),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_11446_11447_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_11446_11447_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_equiposRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_11446_11447_Internalname,sImgUrl,imgprompt_11446_11447_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_11446_11447_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMSqDc_Internalname,GXutil.rtrim( A14498OMMSqDc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMSqDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMSqDc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(136),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1531_" + sGXsfl_136_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_136_idx + "',136)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMPieCod_Internalname,GXutil.rtrim( A11448OMMPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(136),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_11446_11447_11448_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_11446_11447_11448_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_equiposRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_11446_11447_11448_Internalname,sImgUrl,imgprompt_11446_11447_11448_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_11446_11447_11448_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMPieDc_Internalname,GXutil.rtrim( A14499OMMPieDc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMPieDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMPieDc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(136),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_equiposRow);
      send_integrity_lvl_hashes13U1531( ) ;
      GXCCtl = "Z11446OMMEquCod_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11446OMMEquCod));
      GXCCtl = "Z11447OMMSEqCod_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11447OMMSEqCod));
      GXCCtl = "Z11448OMMPieCod_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11448OMMPieCod));
      GXCCtl = "nRcdDeleted_1531_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1531_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1531_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_136_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_136_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMEQUCOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMEQDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEqDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMSEQCOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMSQDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSqDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMPIECOD_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMPIEDC_"+sGXsfl_136_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_11446_"+sGXsfl_136_idx+"Link", GXutil.rtrim( imgprompt_11446_Link));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_11446_11447_"+sGXsfl_136_idx+"Link", GXutil.rtrim( imgprompt_11446_11447_Link));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_11446_11447_11448_"+sGXsfl_136_idx+"Link", GXutil.rtrim( imgprompt_11446_11447_11448_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_equiposContainer.AddRow(Gridlevel_equiposRow);
   }

   public void readRow13U1531( )
   {
      nGXsfl_136_idx = (int)(nGXsfl_136_idx+1) ;
      sGXsfl_136_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_136_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1361531( ) ;
      edtOMMEquCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQUCOD_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMEqDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQDC_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMSEqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSEQCOD_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMSqDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSQDC_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIECOD_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMPieDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIEDC_"+sGXsfl_136_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_11446_Link = httpContext.cgiGet( "PROMPT_11446_"+sGXsfl_136_idx+"Link") ;
      imgprompt_11446_Link = httpContext.cgiGet( "PROMPT_11446_11447_"+sGXsfl_136_idx+"Link") ;
      imgprompt_11446_Link = httpContext.cgiGet( "PROMPT_11446_11447_11448_"+sGXsfl_136_idx+"Link") ;
      A11446OMMEquCod = httpContext.cgiGet( edtOMMEquCod_Internalname) ;
      A14497OMMEqDc = httpContext.cgiGet( edtOMMEqDc_Internalname) ;
      A11447OMMSEqCod = httpContext.cgiGet( edtOMMSEqCod_Internalname) ;
      A14498OMMSqDc = httpContext.cgiGet( edtOMMSqDc_Internalname) ;
      A11448OMMPieCod = httpContext.cgiGet( edtOMMPieCod_Internalname) ;
      A14499OMMPieDc = httpContext.cgiGet( edtOMMPieDc_Internalname) ;
      GXCCtl = "Z11446OMMEquCod_" + sGXsfl_136_idx ;
      Z11446OMMEquCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11447OMMSEqCod_" + sGXsfl_136_idx ;
      Z11447OMMSEqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11448OMMPieCod_" + sGXsfl_136_idx ;
      Z11448OMMPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1531_" + sGXsfl_136_idx ;
      nRcdDeleted_1531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1531_" + sGXsfl_136_idx ;
      nRcdExists_1531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1531_" + sGXsfl_136_idx ;
      nIsMod_1531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1501530( )
   {
      edtTMCod_Internalname = "TMCOD_"+sGXsfl_150_idx ;
   }

   public void subsflControlProps_fel_1501530( )
   {
      edtTMCod_Internalname = "TMCOD_"+sGXsfl_150_fel_idx ;
   }

   public void addRow13U1530( )
   {
      nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1501530( ) ;
      sendRow13U1530( ) ;
   }

   public void sendRow13U1530( )
   {
      Gridlevel_tareasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_tareas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_tareas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_tareas_Class, "") != 0 )
         {
            subGridlevel_tareas_Linesclass = subGridlevel_tareas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_tareas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_tareas_Backstyle = (byte)(0) ;
         subGridlevel_tareas_Backcolor = subGridlevel_tareas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_tareas_Class, "") != 0 )
         {
            subGridlevel_tareas_Linesclass = subGridlevel_tareas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_tareas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_tareas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_tareas_Class, "") != 0 )
         {
            subGridlevel_tareas_Linesclass = subGridlevel_tareas_Class+"Odd" ;
         }
         subGridlevel_tareas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_tareas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_tareas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_150_idx) % (2))) == 0 )
         {
            subGridlevel_tareas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_tareas_Class, "") != 0 )
            {
               subGridlevel_tareas_Linesclass = subGridlevel_tareas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_tareas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_tareas_Class, "") != 0 )
            {
               subGridlevel_tareas_Linesclass = subGridlevel_tareas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1530_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tareasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9430TMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTMCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtTMCod_Horizontalalignment,Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_tareasRow);
      send_integrity_lvl_hashes13U1530( ) ;
      GXCCtl = "Z9430TMCod_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1530_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1530_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1530_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_150_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMCOD_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMCOD_"+sGXsfl_150_idx+"Horizontalalignment", GXutil.rtrim( edtTMCod_Horizontalalignment));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_tareasContainer.AddRow(Gridlevel_tareasRow);
   }

   public void readRow13U1530( )
   {
      nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1501530( ) ;
      edtTMCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMCOD_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMCod_Horizontalalignment = httpContext.cgiGet( "TMCOD_"+sGXsfl_150_idx+"Horizontalalignment") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         wbErr = true ;
         A9430TMCod = 0 ;
      }
      else
      {
         A9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z9430TMCod_" + sGXsfl_150_idx ;
      Z9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1530_" + sGXsfl_150_idx ;
      nRcdDeleted_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1530_" + sGXsfl_150_idx ;
      nRcdExists_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1530_" + sGXsfl_150_idx ;
      nIsMod_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTMCod_Enabled = edtTMCod_Enabled ;
      defedtOMMPieCod_Enabled = edtOMMPieCod_Enabled ;
      defedtOMMSEqCod_Enabled = edtOMMSEqCod_Enabled ;
      defedtOMMEquCod_Enabled = edtOMMEquCod_Enabled ;
   }

   public void confirmValues13U0( )
   {
      nGXsfl_136_idx = 0 ;
      sGXsfl_136_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_136_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1361531( ) ;
      while ( nGXsfl_136_idx < nRC_GXsfl_136 )
      {
         nGXsfl_136_idx = (int)(nGXsfl_136_idx+1) ;
         sGXsfl_136_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_136_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1361531( ) ;
         httpContext.changePostValue( "Z11446OMMEquCod_"+sGXsfl_136_idx, httpContext.cgiGet( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_136_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_136_idx) ;
         httpContext.changePostValue( "Z11447OMMSEqCod_"+sGXsfl_136_idx, httpContext.cgiGet( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_136_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_136_idx) ;
         httpContext.changePostValue( "Z11448OMMPieCod_"+sGXsfl_136_idx, httpContext.cgiGet( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_136_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_136_idx) ;
      }
      nGXsfl_150_idx = 0 ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1501530( ) ;
      while ( nGXsfl_150_idx < nRC_GXsfl_150 )
      {
         nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1501530( ) ;
         httpContext.changePostValue( "Z9430TMCod_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z9430TMCod_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_150_idx) ;
      }
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV20Accion))}, new String[] {"Gx_mode","EmprCod","OMCod","Accion"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Accion, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrden");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("OMUsuCre", GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      forbiddenHiddens.add("OMFchCre", localUtil.format( A9436OMFchCre, "99/99/99 99:99"));
      forbiddenHiddens.add("OMFchCer", localUtil.format( A9439OMFchCer, "99/99/99 99:99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmorden:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9437OMUsuCre", GXutil.rtrim( Z9437OMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9433OMTxt", Z9433OMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9438OMFchPre", localUtil.dtoc( Z9438OMFchPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9436OMFchCre", localUtil.ttoc( Z9436OMFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9464OMNot", Z9464OMNot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9439OMFchCer", localUtil.ttoc( Z9439OMFchCer, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14495OMPri", GXutil.ltrim( localUtil.ntoc( Z14495OMPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9426OMMaqCod", GXutil.rtrim( Z9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9429PMCod", GXutil.ltrim( localUtil.ntoc( Z9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9428SMCod", GXutil.ltrim( localUtil.ntoc( Z9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14492OMTipoId", GXutil.ltrim( localUtil.ntoc( Z14492OMTipoId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_136", GXutil.ltrim( localUtil.ntoc( nGXsfl_136_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_150", GXutil.ltrim( localUtil.ntoc( nGXsfl_150_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9426OMMaqCod", GXutil.rtrim( A9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N9428SMCod", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9429PMCod", GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N14492OMTipoId", GXutil.ltrim( localUtil.ntoc( A14492OMTipoId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9433OMTxt", A9433OMTxt);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMMAQCOD_DATA", AV43OMMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMMAQCOD_DATA", AV43OMMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMTIPOID_DATA", AV46OMTipoId_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMTIPOID_DATA", AV46OMTipoId_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTMCOD_DATA", AV49TMCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTMCOD_DATA", AV49TMCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV31TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV31TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV24EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMCOD", GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_OMMAQCOD", GXutil.rtrim( AV26Insert_OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_SMCOD", GXutil.ltrim( localUtil.ntoc( AV28Insert_SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCSMCOD", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PMCOD", GXutil.ltrim( localUtil.ntoc( AV27Insert_PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_OMTIPOID", GXutil.ltrim( localUtil.ntoc( AV45Insert_OMTipoId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVEREQUIPOS", GXutil.ltrim( localUtil.ntoc( AV48Verequipos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMTIPODC", GXutil.rtrim( A14494OMTipoDc));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMEQUDSC", GXutil.rtrim( A12599OMMEquDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMSEQDSC", GXutil.rtrim( A12600OMMSEqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMPIEDSC", GXutil.rtrim( A11449OMMPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "TMDSC", GXutil.rtrim( A9431TMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "TMTXT", A9432TMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Objectcall", GXutil.rtrim( Combo_ommaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Cls", GXutil.rtrim( Combo_ommaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_ommaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Enabled", GXutil.booltostr( Combo_ommaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Emptyitem", GXutil.booltostr( Combo_ommaqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMTIPOID_Objectcall", GXutil.rtrim( Combo_omtipoid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMTIPOID_Cls", GXutil.rtrim( Combo_omtipoid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMTIPOID_Selectedvalue_set", GXutil.rtrim( Combo_omtipoid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMTIPOID_Enabled", GXutil.booltostr( Combo_omtipoid_Enabled));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Objectcall", GXutil.rtrim( Dvpanel_tabletextonota_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Enabled", GXutil.booltostr( Dvpanel_tabletextonota_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Width", GXutil.rtrim( Dvpanel_tabletextonota_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Autowidth", GXutil.booltostr( Dvpanel_tabletextonota_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Autoheight", GXutil.booltostr( Dvpanel_tabletextonota_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Cls", GXutil.rtrim( Dvpanel_tabletextonota_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Title", GXutil.rtrim( Dvpanel_tabletextonota_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Collapsible", GXutil.booltostr( Dvpanel_tabletextonota_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Collapsed", GXutil.booltostr( Dvpanel_tabletextonota_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Showcollapseicon", GXutil.booltostr( Dvpanel_tabletextonota_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Iconposition", GXutil.rtrim( Dvpanel_tabletextonota_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTONOTA_Autoscroll", GXutil.booltostr( Dvpanel_tabletextonota_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Objectcall", GXutil.rtrim( Dvpanel_tableleaflevel_equipos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Enabled", GXutil.booltostr( Dvpanel_tableleaflevel_equipos_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Width", GXutil.rtrim( Dvpanel_tableleaflevel_equipos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Autowidth", GXutil.booltostr( Dvpanel_tableleaflevel_equipos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Autoheight", GXutil.booltostr( Dvpanel_tableleaflevel_equipos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Cls", GXutil.rtrim( Dvpanel_tableleaflevel_equipos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Title", GXutil.rtrim( Dvpanel_tableleaflevel_equipos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Collapsible", GXutil.booltostr( Dvpanel_tableleaflevel_equipos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Collapsed", GXutil.booltostr( Dvpanel_tableleaflevel_equipos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Showcollapseicon", GXutil.booltostr( Dvpanel_tableleaflevel_equipos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Iconposition", GXutil.rtrim( Dvpanel_tableleaflevel_equipos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_EQUIPOS_Autoscroll", GXutil.booltostr( Dvpanel_tableleaflevel_equipos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Objectcall", GXutil.rtrim( Dvpanel_tableleaflevel_tareas_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Enabled", GXutil.booltostr( Dvpanel_tableleaflevel_tareas_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Width", GXutil.rtrim( Dvpanel_tableleaflevel_tareas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Autowidth", GXutil.booltostr( Dvpanel_tableleaflevel_tareas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Autoheight", GXutil.booltostr( Dvpanel_tableleaflevel_tareas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Cls", GXutil.rtrim( Dvpanel_tableleaflevel_tareas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Title", GXutil.rtrim( Dvpanel_tableleaflevel_tareas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Collapsible", GXutil.booltostr( Dvpanel_tableleaflevel_tareas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Collapsed", GXutil.booltostr( Dvpanel_tableleaflevel_tareas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Showcollapseicon", GXutil.booltostr( Dvpanel_tableleaflevel_tareas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Iconposition", GXutil.rtrim( Dvpanel_tableleaflevel_tareas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_TAREAS_Autoscroll", GXutil.booltostr( Dvpanel_tableleaflevel_tareas_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMCOD_Objectcall", GXutil.rtrim( Combo_tmcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMCOD_Cls", GXutil.rtrim( Combo_tmcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMCOD_Enabled", GXutil.booltostr( Combo_tmcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_tmcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMCOD_Isgriditem", GXutil.booltostr( Combo_tmcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMCOD_Emptyitem", GXutil.booltostr( Combo_tmcod_Emptyitem));
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
      return formatLink("app.mantenimientomaquina.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV20Accion))}, new String[] {"Gx_mode","EmprCod","OMCod","Accion"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMOrden" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ordenes de Mantenimiento", "") ;
   }

   public void initializeNonKey13U1232( )
   {
      A9426OMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      h9428SMCod = "" ;
      A9429PMCod = 0 ;
      n9429PMCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      A14492OMTipoId = (short)(0) ;
      n14492OMTipoId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14492OMTipoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14492OMTipoId), 4, 0));
      A9437OMUsuCre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
      A9440OMCosRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      A13678OMDscMqPla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", A13678OMDscMqPla);
      A13679OMMaqCodFo = "" ;
      n13679OMMaqCodFo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      A9433OMTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
      A9438OMFchPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
      A9464OMNot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14495OMPri = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14495OMPri", GXutil.str( A14495OMPri, 1, 0));
      A13680OMDuracion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13680OMDuracion", A13680OMDuracion);
      A9444OMRRCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      A9443OMRCCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      A9442OMMRCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      A9441OMMCCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      A14494OMTipoDc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14494OMTipoDc", A14494OMTipoDc);
      A9445OMEst = httpContext.getMessage( "P", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      A9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z9437OMUsuCre = "" ;
      Z9445OMEst = "" ;
      Z9433OMTxt = "" ;
      Z9438OMFchPre = GXutil.nullDate() ;
      Z9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9464OMNot = "" ;
      Z9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      Z14495OMPri = (byte)(0) ;
      Z9426OMMaqCod = "" ;
      Z9429PMCod = 0 ;
      Z9428SMCod = 0 ;
      Z14492OMTipoId = (short)(0) ;
   }

   public void initAll13U1232( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9425OMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      initializeNonKey13U1232( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13680OMDuracion = i13680OMDuracion ;
      httpContext.ajax_rsp_assign_attri("", false, "A13680OMDuracion", A13680OMDuracion);
      A9437OMUsuCre = i9437OMUsuCre ;
      httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
      A9445OMEst = i9445OMEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      A9436OMFchCre = i9436OMFchCre ;
      httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void initializeNonKey13U1531( )
   {
      A14497OMMEqDc = "" ;
      A14498OMMSqDc = "" ;
      A14499OMMPieDc = "" ;
      A12599OMMEquDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12599OMMEquDsc", A12599OMMEquDsc);
      A12600OMMSEqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12600OMMSEqDsc", A12600OMMSEqDsc);
      A11449OMMPieDsc = "" ;
      n11449OMMPieDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11449OMMPieDsc", A11449OMMPieDsc);
   }

   public void initAll13U1531( )
   {
      A11446OMMEquCod = "" ;
      A11447OMMSEqCod = "" ;
      A11448OMMPieCod = "" ;
      initializeNonKey13U1531( ) ;
   }

   public void standaloneModalInsert13U1531( )
   {
   }

   public void initializeNonKey13U1530( )
   {
      A9431TMDsc = "" ;
      n9431TMDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", A9431TMDsc);
      A9432TMTxt = "" ;
      n9432TMTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
   }

   public void initAll13U1530( )
   {
      A9430TMCod = 0 ;
      initializeNonKey13U1530( ) ;
   }

   public void standaloneModalInsert13U1530( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662810", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmorden.js", "?20268211662811", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1531( )
   {
      edtOMMPieCod_Enabled = defedtOMMPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      edtOMMSEqCod_Enabled = defedtOMMSEqCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
      edtOMMEquCod_Enabled = defedtOMMEquCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_136_Refreshing);
   }

   public void init_level_properties1530( )
   {
      edtTMCod_Enabled = defedtTMCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
   }

   public void startgridcontrol136( )
   {
      Gridlevel_equiposContainer.AddObjectProperty("GridName", "Gridlevel_equipos");
      Gridlevel_equiposContainer.AddObjectProperty("Header", subGridlevel_equipos_Header);
      Gridlevel_equiposContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_equiposContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_equiposContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11446OMMEquCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A14497OMMEqDc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEqDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11447OMMSEqCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A14498OMMSqDc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSqDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11448OMMPieCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A14499OMMPieDc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol150( )
   {
      Gridlevel_tareasContainer.AddObjectProperty("GridName", "Gridlevel_tareas");
      Gridlevel_tareasContainer.AddObjectProperty("Header", subGridlevel_tareas_Header);
      Gridlevel_tareasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_tareasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_tareasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_tareasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tareasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_tareasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tareasColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtTMCod_Horizontalalignment));
      Gridlevel_tareasContainer.AddColumnProperties(Gridlevel_tareasColumn);
      Gridlevel_tareasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtOMCod_Internalname = "OMCOD" ;
      lblTextblockommaqcod_Internalname = "TEXTBLOCKOMMAQCOD" ;
      Combo_ommaqcod_Internalname = "COMBO_OMMAQCOD" ;
      edtOMMaqCod_Internalname = "OMMAQCOD" ;
      divTablesplittedommaqcod_Internalname = "TABLESPLITTEDOMMAQCOD" ;
      edtOMPri_Internalname = "OMPRI" ;
      edtavAccion_Internalname = "vACCION" ;
      edtavMode_Internalname = "vMODE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtOMFchPre_Internalname = "OMFCHPRE" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtOMFchCre_Internalname = "OMFCHCRE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtSMCod_Internalname = "SMCOD" ;
      divSmcod_cell_Internalname = "SMCOD_CELL" ;
      edtPMCod_Internalname = "PMCOD" ;
      divPmcod_cell_Internalname = "PMCOD_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtOMFchCer_Internalname = "OMFCHCER" ;
      edtOMUsuCre_Internalname = "OMUSUCRE" ;
      lblTextblockomtipoid_Internalname = "TEXTBLOCKOMTIPOID" ;
      Combo_omtipoid_Internalname = "COMBO_OMTIPOID" ;
      edtOMTipoId_Internalname = "OMTIPOID" ;
      divTablesplittedomtipoid_Internalname = "TABLESPLITTEDOMTIPOID" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextmensaje_Internalname = "TEXTMENSAJE" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      lblTextblockomtxt_Internalname = "TEXTBLOCKOMTXT" ;
      edtOMTxt_Internalname = "OMTXT" ;
      divUnnamedtableomtxt_Internalname = "UNNAMEDTABLEOMTXT" ;
      lblTextblockomnot_Internalname = "TEXTBLOCKOMNOT" ;
      edtOMNot_Internalname = "OMNOT" ;
      divUnnamedtableomnot_Internalname = "UNNAMEDTABLEOMNOT" ;
      cellOmnot_cell_Internalname = "OMNOT_CELL" ;
      tblTabletextonota_Internalname = "TABLETEXTONOTA" ;
      Dvpanel_tabletextonota_Internalname = "DVPANEL_TABLETEXTONOTA" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtOMMEquCod_Internalname = "OMMEQUCOD" ;
      edtOMMEqDc_Internalname = "OMMEQDC" ;
      edtOMMSEqCod_Internalname = "OMMSEQCOD" ;
      edtOMMSqDc_Internalname = "OMMSQDC" ;
      edtOMMPieCod_Internalname = "OMMPIECOD" ;
      edtOMMPieDc_Internalname = "OMMPIEDC" ;
      divTableleaflevel_equipos_Internalname = "TABLELEAFLEVEL_EQUIPOS" ;
      Dvpanel_tableleaflevel_equipos_Internalname = "DVPANEL_TABLELEAFLEVEL_EQUIPOS" ;
      divDvpanel_tableleaflevel_equipos_cell_Internalname = "DVPANEL_TABLELEAFLEVEL_EQUIPOS_CELL" ;
      edtTMCod_Internalname = "TMCOD" ;
      divTableleaflevel_tareas_Internalname = "TABLELEAFLEVEL_TAREAS" ;
      Dvpanel_tableleaflevel_tareas_Internalname = "DVPANEL_TABLELEAFLEVEL_TAREAS" ;
      divTableequipotarea_Internalname = "TABLEEQUIPOTAREA" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      bttBtncontrol_Internalname = "BTNCONTROL" ;
      bttBtnrepuestos_Internalname = "BTNREPUESTOS" ;
      bttBtnmanodeobra_Internalname = "BTNMANODEOBRA" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboommaqcod_Internalname = "vCOMBOOMMAQCOD" ;
      divSectionattribute_ommaqcod_Internalname = "SECTIONATTRIBUTE_OMMAQCOD" ;
      edtavComboomtipoid_Internalname = "vCOMBOOMTIPOID" ;
      divSectionattribute_omtipoid_Internalname = "SECTIONATTRIBUTE_OMTIPOID" ;
      Combo_tmcod_Internalname = "COMBO_TMCOD" ;
      edtOMDuracion_Internalname = "OMDURACION" ;
      edtOMCosRea_Internalname = "OMCOSREA" ;
      edtOMRRCosT_Internalname = "OMRRCOST" ;
      edtOMRCCosT_Internalname = "OMRCCOST" ;
      edtOMMRCosT_Internalname = "OMMRCOST" ;
      edtOMMCCosT_Internalname = "OMMCCOST" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO" ;
      edtOMMaqDsc_Internalname = "OMMAQDSC" ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_11446_Internalname = "PROMPT_11446" ;
      imgprompt_11446_11447_Internalname = "PROMPT_11446_11447" ;
      imgprompt_11446_11447_11448_Internalname = "PROMPT_11446_11447_11448" ;
      subGridlevel_equipos_Internalname = "GRIDLEVEL_EQUIPOS" ;
      subGridlevel_tareas_Internalname = "GRIDLEVEL_TAREAS" ;
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
      subGridlevel_tareas_Allowcollapsing = (byte)(0) ;
      subGridlevel_tareas_Allowselection = (byte)(0) ;
      subGridlevel_tareas_Header = "" ;
      subGridlevel_equipos_Allowcollapsing = (byte)(0) ;
      subGridlevel_equipos_Allowselection = (byte)(0) ;
      subGridlevel_equipos_Header = "" ;
      Combo_tmcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Ordenes de Mantenimiento", "") );
      edtTMCod_Jsonclick = "" ;
      subGridlevel_tareas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_tareas_Backcolorstyle = (byte)(0) ;
      edtOMMPieDc_Jsonclick = "" ;
      imgprompt_11446_11447_11448_Visible = 1 ;
      imgprompt_11446_11447_11448_Link = "" ;
      edtOMMPieCod_Jsonclick = "" ;
      edtOMMSqDc_Jsonclick = "" ;
      imgprompt_11446_11447_Visible = 1 ;
      imgprompt_11446_11447_Link = "" ;
      edtOMMSEqCod_Jsonclick = "" ;
      edtOMMEqDc_Jsonclick = "" ;
      imgprompt_11446_Visible = 1 ;
      imgprompt_11446_Link = "" ;
      imgprompt_11446_Visible = 1 ;
      edtOMMEquCod_Jsonclick = "" ;
      subGridlevel_equipos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_equipos_Backcolorstyle = (byte)(0) ;
      Combo_tmcod_Titlecontrolidtoreplace = "" ;
      edtTMCod_Enabled = 1 ;
      edtOMMPieDc_Enabled = 0 ;
      edtOMMPieCod_Enabled = 1 ;
      edtOMMSqDc_Enabled = 0 ;
      edtOMMSEqCod_Enabled = 1 ;
      edtOMMEqDc_Enabled = 0 ;
      edtOMMEquCod_Enabled = 1 ;
      edtOMDscMqPla_Jsonclick = "" ;
      edtOMDscMqPla_Enabled = 0 ;
      edtOMDscMqPla_Visible = 1 ;
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqDsc_Enabled = 0 ;
      edtOMMaqDsc_Visible = 1 ;
      edtOMMaqCodFo_Jsonclick = "" ;
      edtOMMaqCodFo_Enabled = 0 ;
      edtOMMaqCodFo_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtOMMCCosT_Jsonclick = "" ;
      edtOMMCCosT_Enabled = 0 ;
      edtOMMCCosT_Visible = 1 ;
      edtOMMRCosT_Jsonclick = "" ;
      edtOMMRCosT_Enabled = 0 ;
      edtOMMRCosT_Visible = 1 ;
      edtOMRCCosT_Jsonclick = "" ;
      edtOMRCCosT_Enabled = 0 ;
      edtOMRCCosT_Visible = 1 ;
      edtOMRRCosT_Jsonclick = "" ;
      edtOMRRCosT_Enabled = 0 ;
      edtOMRRCosT_Visible = 1 ;
      edtOMCosRea_Jsonclick = "" ;
      edtOMCosRea_Enabled = 0 ;
      edtOMCosRea_Visible = 1 ;
      edtOMDuracion_Jsonclick = "" ;
      edtOMDuracion_Enabled = 0 ;
      edtOMDuracion_Visible = 1 ;
      Combo_tmcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tmcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_tmcod_Cls = "ExtendedCombo" ;
      Combo_tmcod_Caption = "" ;
      edtavComboomtipoid_Jsonclick = "" ;
      edtavComboomtipoid_Enabled = 0 ;
      edtavComboomtipoid_Visible = 1 ;
      edtavComboommaqcod_Jsonclick = "" ;
      edtavComboommaqcod_Enabled = 0 ;
      edtavComboommaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnmanodeobra_Enabled = 1 ;
      bttBtnmanodeobra_Visible = 1 ;
      bttBtnrepuestos_Enabled = 1 ;
      bttBtnrepuestos_Visible = 1 ;
      bttBtncontrol_Enabled = 1 ;
      bttBtncontrol_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_tableleaflevel_tareas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_tareas_Iconposition = "Right" ;
      Dvpanel_tableleaflevel_tareas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_tareas_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_tareas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_tareas_Title = httpContext.getMessage( "Tareas", "") ;
      Dvpanel_tableleaflevel_tareas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableleaflevel_tareas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_tareas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_tareas_Width = "100%" ;
      Dvpanel_tableleaflevel_equipos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_equipos_Iconposition = "Right" ;
      Dvpanel_tableleaflevel_equipos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_equipos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_equipos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_equipos_Title = httpContext.getMessage( "Equipos", "") ;
      Dvpanel_tableleaflevel_equipos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableleaflevel_equipos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_equipos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_equipos_Width = "100%" ;
      divDvpanel_tableleaflevel_equipos_cell_Class = "col-xs-12" ;
      edtOMNot_Enabled = 1 ;
      edtOMNot_Visible = 1 ;
      cellOmnot_cell_Class = "" ;
      edtOMTxt_Enabled = 1 ;
      Dvpanel_tabletextonota_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Iconposition = "Right" ;
      Dvpanel_tabletextonota_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tabletextonota_Title = httpContext.getMessage( "Observaciones", "") ;
      Dvpanel_tabletextonota_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tabletextonota_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tabletextonota_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Width = "100%" ;
      lblTextmensaje_Caption = "" ;
      edtOMTipoId_Jsonclick = "" ;
      edtOMTipoId_Enabled = 1 ;
      edtOMTipoId_Visible = 1 ;
      Combo_omtipoid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_omtipoid_Caption = "" ;
      Combo_omtipoid_Enabled = GXutil.toBoolean( -1) ;
      edtOMUsuCre_Jsonclick = "" ;
      edtOMUsuCre_Enabled = 0 ;
      edtOMFchCer_Jsonclick = "" ;
      edtOMFchCer_Enabled = 0 ;
      edtPMCod_Jsonclick = "" ;
      edtPMCod_Enabled = 1 ;
      edtPMCod_Visible = 1 ;
      divPmcod_cell_Class = "col-xs-12 col-sm-6" ;
      edtSMCod_Jsonclick = "" ;
      edtSMCod_Enabled = 1 ;
      edtSMCod_Visible = 1 ;
      divSmcod_cell_Class = "col-xs-12 col-sm-6" ;
      divUnnamedtable3_Visible = 1 ;
      edtOMFchCre_Jsonclick = "" ;
      edtOMFchCre_Enabled = 0 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 0 );
      edtOMFchPre_Jsonclick = "" ;
      edtOMFchPre_Enabled = 1 ;
      edtavMode_Jsonclick = "" ;
      edtavMode_Enabled = 0 ;
      edtavAccion_Jsonclick = "" ;
      edtavAccion_Enabled = 0 ;
      edtOMPri_Jsonclick = "" ;
      edtOMPri_Enabled = 1 ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMMaqCod_Enabled = 1 ;
      edtOMMaqCod_Visible = 1 ;
      Combo_ommaqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_ommaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_ommaqcod_Caption = "" ;
      Combo_ommaqcod_Enabled = GXutil.toBoolean( -1) ;
      edtOMCod_Jsonclick = "" ;
      edtOMCod_Enabled = 0 ;
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
      edtTMCod_Horizontalalignment = "right" ;
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

   public void gxsgasmcod13U0( String A396EmprCod ,
                               String A9517SMDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgasmcod_data13U0( A396EmprCod, A9517SMDsc) ;
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

   protected void gxsgasmcod_data13U0( String A396EmprCod ,
                                       String A9517SMDsc )
   {
      l9517SMDsc = GXutil.padr( GXutil.rtrim( A9517SMDsc), 30, "%") ;
      n9517SMDsc = false ;
      /* Using cursor T013U71 */
      pr_default.execute(61, new Object[] {A396EmprCod, l9517SMDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(61) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T013U71_A9517SMDsc[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T013U71_A9517SMDsc[0]));
         pr_default.readNext(61);
      }
      pr_default.close(61);
   }

   public void gxhcasmcod13U1232( String A396EmprCod ,
                                  String A9517SMDsc )
   {
      /* Using cursor T013U72 */
      pr_default.execute(62, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(62) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A9517SMDsc = T013U72_A9517SMDsc[0] ;
         n9517SMDsc = T013U72_n9517SMDsc[0] ;
         A396EmprCod = T013U72_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013U72_A9428SMCod[0] ;
         n9428SMCod = T013U72_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         pr_default.readNext(62);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(62);
   }

   public void gx8asaomcod13U1232( int AV14OMCod )
   {
      if ( ! (0==AV14OMCod) )
      {
         A9425OMCod = AV14OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  && true /* Level */ )
         {
            A9425OMCod = AV14OMCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx9asaomcod13U1232( String Gx_mode ,
                                   String A396EmprCod )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXt_int14 = A9425OMCod ;
         GXv_int15[0] = GXt_int14 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTORD", ""), ""), GXv_int15) ;
         tmorden_impl.this.GXt_int14 = GXv_int15[0] ;
         A9425OMCod = GXt_int14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx51asaommpiedc13U1531( String A396EmprCod ,
                                       String A9426OMMaqCod ,
                                       String A11446OMMEquCod ,
                                       String A11447OMMSEqCod ,
                                       String A11448OMMPieCod )
   {
      GXt_char1 = A14499OMMPieDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppiedc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14499OMMPieDc = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14499OMMPieDc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx52asaommsqdc13U1531( String A396EmprCod ,
                                      String A9426OMMaqCod ,
                                      String A11446OMMEquCod ,
                                      String A11447OMMSEqCod )
   {
      GXt_char1 = A14498OMMSqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pseqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14498OMMSqDc = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14498OMMSqDc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx53asaommeqdc13U1531( String A396EmprCod ,
                                      String A9426OMMaqCod ,
                                      String A11446OMMEquCod )
   {
      GXt_char1 = A14497OMMEqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.peqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14497OMMEqDc = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14497OMMEqDc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_13U1232( String A396EmprCod ,
                              int A9425OMCod ,
                              String A9426OMMaqCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         new app.pbmorrep(remoteHandle, context).execute( A396EmprCod, A9425OMCod, A9426OMMaqCod) ;
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

   public void xc_54_13U1531( String A396EmprCod ,
                              int A9425OMCod ,
                              String A9426OMMaqCod ,
                              String A11446OMMEquCod ,
                              String A11447OMMSEqCod ,
                              String A11448OMMPieCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         new app.pcmorrep(remoteHandle, context).execute( A396EmprCod, A9425OMCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod) ;
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

   public void xc_55_13U1530( String A396EmprCod ,
                              int A9425OMCod ,
                              int A9430TMCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int15[0] = A9425OMCod ;
         GXv_int8[0] = A9430TMCod ;
         new app.pamorrep(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int8) ;
         A396EmprCod = GXv_char4[0] ;
         A9425OMCod = GXv_int15[0] ;
         A9430TMCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_equipos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1361531( ) ;
      while ( nGXsfl_136_idx <= nRC_GXsfl_136 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13U1531( ) ;
         standaloneModal13U1531( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13U1531( ) ;
         nGXsfl_136_idx = (int)(nGXsfl_136_idx+1) ;
         sGXsfl_136_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_136_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1361531( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_equiposContainer)) ;
      /* End function gxnrGridlevel_equipos_newrow */
   }

   public void gxnrgridlevel_tareas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1501530( ) ;
      while ( nGXsfl_150_idx <= nRC_GXsfl_150 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13U1530( ) ;
         standaloneModal13U1530( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13U1530( ) ;
         nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1501530( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_tareasContainer)) ;
      /* End function gxnrGridlevel_tareas_newrow */
   }

   public void init_web_controls( )
   {
      cmbOMEst.setName( "OMEST" );
      cmbOMEst.setWebtags( "" );
      cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbOMEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9445OMEst)==0) )
         {
            A9445OMEst = httpContext.getMessage( "P", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T013U73 */
      pr_default.execute(63, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(63) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013U73_A407EmprNom[0] ;
      n407EmprNom = T013U73_n407EmprNom[0] ;
      pr_default.close(63);
      /* Using cursor T013U75 */
      pr_default.execute(64, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(64) != 101) )
      {
         A9444OMRRCosT = T013U75_A9444OMRRCosT[0] ;
         A9443OMRCCosT = T013U75_A9443OMRCCosT[0] ;
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(64);
      /* Using cursor T013U77 */
      pr_default.execute(65, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(65) != 101) )
      {
         A9442OMMRCosT = T013U77_A9442OMMRCosT[0] ;
         A9441OMMCCosT = T013U77_A9441OMMCCosT[0] ;
      }
      else
      {
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(65);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Ommaqcod( )
   {
      n9427OMMaqDsc = false ;
      n13679OMMaqCodFo = false ;
      /* Using cursor T013U78 */
      pr_default.execute(66, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(66) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9427OMMaqDsc = T013U78_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013U78_n9427OMMaqDsc[0] ;
      pr_default.close(66);
      /* Using cursor T013U79 */
      pr_default.execute(67, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(67) != 101) )
      {
         A13679OMMaqCodFo = T013U79_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U79_n13679OMMaqCodFo[0] ;
      }
      else
      {
         A13679OMMaqCodFo = "" ;
         n13679OMMaqCodFo = false ;
      }
      pr_default.close(67);
      if ( (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
      {
         A13678OMDscMqPla = A9427OMMaqDsc ;
      }
      else
      {
         A13678OMDscMqPla = A13679OMMaqCodFo ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", GXutil.rtrim( A9427OMMaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", GXutil.rtrim( A13679OMMaqCodFo));
      httpContext.ajax_rsp_assign_attri("", false, "A13678OMDscMqPla", GXutil.rtrim( A13678OMDscMqPla));
   }

   public void valid_Smcod( )
   {
      n9428SMCod = false ;
      if ( (GXutil.strcmp("", h9428SMCod)==0) )
      {
         A9428SMCod = 0 ;
         n9428SMCod = false ;
      }
      else
      {
         A9517SMDsc = h9428SMCod ;
         n9517SMDsc = false ;
         /* Using cursor T013U80 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
         A396EmprCod = T013U80_A396EmprCod[0] ;
         A9428SMCod = T013U80_A9428SMCod[0] ;
         n9428SMCod = T013U80_n9428SMCod[0] ;
         A9428SMCod = T013U80_A9428SMCod[0] ;
         n9428SMCod = T013U80_n9428SMCod[0] ;
         if ( ! ( (pr_default.getStatus(68) == 101) ) )
         {
            pr_default.readNext(68);
            if ( ! ( (pr_default.getStatus(68) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "SMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSMCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(68);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      /* Using cursor T013U81 */
      pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(69) == 101) )
      {
         if ( ! ( (0==A9428SMCod) && (GXutil.strcmp("", A9517SMDsc)==0) || (0==A9428SMCod) && n9428SMCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(69);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", GXutil.rtrim( h9428SMCod));
   }

   public void valid_Pmcod( )
   {
      n9429PMCod = false ;
      n9428SMCod = false ;
      /* Using cursor T013U82 */
      pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(70) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(70);
      if ( ( A9428SMCod > 0 ) || ( A9429PMCod > 0 ) )
      {
         edtOMTxt_Enabled = 0 ;
      }
      else
      {
         edtOMTxt_Enabled = 1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
   }

   public void valid_Omtipoid( )
   {
      n14492OMTipoId = false ;
      /* Using cursor T013U83 */
      pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n14492OMTipoId), Short.valueOf(A14492OMTipoId)});
      if ( (pr_default.getStatus(71) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A14492OMTipoId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Mantenimiento", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMTIPOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A14494OMTipoDc = T013U83_A14494OMTipoDc[0] ;
      pr_default.close(71);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14494OMTipoDc", GXutil.rtrim( A14494OMTipoDc));
   }

   public void valid_Ommequcod( )
   {
      GXt_char1 = A14497OMMEqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.peqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14497OMMEqDc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14497OMMEqDc", GXutil.rtrim( A14497OMMEqDc));
   }

   public void valid_Ommseqcod( )
   {
      GXt_char1 = A14498OMMSqDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pseqdc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14498OMMSqDc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14498OMMSqDc", GXutil.rtrim( A14498OMMSqDc));
   }

   public void valid_Ommpiecod( )
   {
      n11449OMMPieDsc = false ;
      /* Using cursor T013U61 */
      pr_default.execute(51, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(51) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Equipos En Ordenes de Mantenimeinto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMEquCod_Internalname ;
      }
      A12599OMMEquDsc = T013U61_A12599OMMEquDsc[0] ;
      A12600OMMSEqDsc = T013U61_A12600OMMSEqDsc[0] ;
      A11449OMMPieDsc = T013U61_A11449OMMPieDsc[0] ;
      n11449OMMPieDsc = T013U61_n11449OMMPieDsc[0] ;
      pr_default.close(51);
      GXt_char1 = A14499OMMPieDc ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppiedc(remoteHandle, context).execute( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod, GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      A14499OMMPieDc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12599OMMEquDsc", GXutil.rtrim( A12599OMMEquDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12600OMMSEqDsc", GXutil.rtrim( A12600OMMSEqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11449OMMPieDsc", GXutil.rtrim( A11449OMMPieDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14499OMMPieDc", GXutil.rtrim( A14499OMMPieDc));
   }

   public void valid_Tmcod( )
   {
      n9431TMDsc = false ;
      n9432TMTxt = false ;
      /* Using cursor T013U68 */
      pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(58) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
      }
      A9431TMDsc = T013U68_A9431TMDsc[0] ;
      n9431TMDsc = T013U68_n9431TMDsc[0] ;
      A9432TMTxt = T013U68_A9432TMTxt[0] ;
      n9432TMTxt = T013U68_n9432TMTxt[0] ;
      pr_default.close(58);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", GXutil.rtrim( A9431TMDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20Accion',fld:'vACCION',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20Accion',fld:'vACCION',pic:'',hsh:true},{av:'A9437OMUsuCre',fld:'OMUSUCRE',pic:'@!'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213U2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOCONTROL'","{handler:'e1313U2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOCONTROL'",",oparms:[]}");
      setEventMetadata("'DOREPUESTOS'","{handler:'e1413U2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOREPUESTOS'",",oparms:[]}");
      setEventMetadata("'DOMANODEOBRA'","{handler:'e1513U2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOMANODEOBRA'",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[]");
      setEventMetadata("VALID_OMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A13679OMMaqCodFo',fld:'OMMAQCODFO',pic:''},{av:'A13678OMDscMqPla',fld:'OMDSCMQPLA',pic:''}]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A13679OMMaqCodFo',fld:'OMMAQCODFO',pic:''},{av:'A13678OMDscMqPla',fld:'OMDSCMQPLA',pic:''}]}");
      setEventMetadata("VALIDV_ACCION","{handler:'validv_Accion',iparms:[]");
      setEventMetadata("VALIDV_ACCION",",oparms:[]}");
      setEventMetadata("VALIDV_GX_MODE","{handler:'validv_Gx_mode',iparms:[]");
      setEventMetadata("VALIDV_GX_MODE",",oparms:[]}");
      setEventMetadata("VALID_OMEST","{handler:'valid_Omest',iparms:[]");
      setEventMetadata("VALID_OMEST",",oparms:[]}");
      setEventMetadata("VALID_SMCOD","{handler:'valid_Smcod',iparms:[{av:'h9428SMCod'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALID_SMCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'h9428SMCod'}]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_PMCOD",",oparms:[{av:'edtOMTxt_Enabled',ctrl:'OMTXT',prop:'Enabled'}]}");
      setEventMetadata("VALID_OMTIPOID","{handler:'valid_Omtipoid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14492OMTipoId',fld:'OMTIPOID',pic:'ZZZ9'},{av:'A14494OMTipoDc',fld:'OMTIPODC',pic:''}]");
      setEventMetadata("VALID_OMTIPOID",",oparms:[{av:'A14494OMTipoDc',fld:'OMTIPODC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOOMMAQCOD","{handler:'validv_Comboommaqcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOOMMAQCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOOMTIPOID","{handler:'validv_Comboomtipoid',iparms:[]");
      setEventMetadata("VALIDV_COMBOOMTIPOID",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOST","{handler:'valid_Omrrcost',iparms:[]");
      setEventMetadata("VALID_OMRRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMRCCOST","{handler:'valid_Omrccost',iparms:[]");
      setEventMetadata("VALID_OMRCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOST","{handler:'valid_Ommrcost',iparms:[]");
      setEventMetadata("VALID_OMMRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMCCOST","{handler:'valid_Ommccost',iparms:[]");
      setEventMetadata("VALID_OMMCCOST",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'},{av:'A9443OMRCCosT',fld:'OMRCCOST',pic:'ZZZZZZZ9.999'},{av:'A9442OMMRCosT',fld:'OMMRCOST',pic:'ZZZZZZZ9.999'},{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'},{av:'A9443OMRCCosT',fld:'OMRCCOST',pic:'ZZZZZZZ9.999'},{av:'A9442OMMRCosT',fld:'OMMRCOST',pic:'ZZZZZZZ9.999'},{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_OMMAQCODFO","{handler:'valid_Ommaqcodfo',iparms:[]");
      setEventMetadata("VALID_OMMAQCODFO",",oparms:[]}");
      setEventMetadata("VALID_OMMAQDSC","{handler:'valid_Ommaqdsc',iparms:[]");
      setEventMetadata("VALID_OMMAQDSC",",oparms:[]}");
      setEventMetadata("VALID_OMMEQUCOD","{handler:'valid_Ommequcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A11446OMMEquCod',fld:'OMMEQUCOD',pic:''},{av:'A14497OMMEqDc',fld:'OMMEQDC',pic:''}]");
      setEventMetadata("VALID_OMMEQUCOD",",oparms:[{av:'A14497OMMEqDc',fld:'OMMEQDC',pic:''}]}");
      setEventMetadata("VALID_OMMSEQCOD","{handler:'valid_Ommseqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A11446OMMEquCod',fld:'OMMEQUCOD',pic:''},{av:'A11447OMMSEqCod',fld:'OMMSEQCOD',pic:''},{av:'A14498OMMSqDc',fld:'OMMSQDC',pic:''}]");
      setEventMetadata("VALID_OMMSEQCOD",",oparms:[{av:'A14498OMMSqDc',fld:'OMMSQDC',pic:''}]}");
      setEventMetadata("VALID_OMMPIECOD","{handler:'valid_Ommpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A11446OMMEquCod',fld:'OMMEQUCOD',pic:''},{av:'A11447OMMSEqCod',fld:'OMMSEQCOD',pic:''},{av:'A11448OMMPieCod',fld:'OMMPIECOD',pic:''},{av:'A12599OMMEquDsc',fld:'OMMEQUDSC',pic:''},{av:'A12600OMMSEqDsc',fld:'OMMSEQDSC',pic:''},{av:'A11449OMMPieDsc',fld:'OMMPIEDSC',pic:''},{av:'A14499OMMPieDc',fld:'OMMPIEDC',pic:''}]");
      setEventMetadata("VALID_OMMPIECOD",",oparms:[{av:'A12599OMMEquDsc',fld:'OMMEQUDSC',pic:''},{av:'A12600OMMSEqDsc',fld:'OMMSEQDSC',pic:''},{av:'A11449OMMPieDsc',fld:'OMMPIEDSC',pic:''},{av:'A14499OMMPieDc',fld:'OMMPIEDC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ommpiedc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_TMCOD","{handler:'valid_Tmcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'A9432TMTxt',fld:'TMTXT',pic:''}]");
      setEventMetadata("VALID_TMCOD",",oparms:[{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'A9432TMTxt',fld:'TMTXT',pic:''}]}");
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
      pr_default.close(58);
      pr_default.close(51);
      pr_default.close(63);
      pr_default.close(36);
      pr_default.close(66);
      pr_default.close(39);
      pr_default.close(70);
      pr_default.close(69);
      pr_default.close(71);
      pr_default.close(41);
      pr_default.close(67);
      pr_default.close(40);
      pr_default.close(64);
      pr_default.close(37);
      pr_default.close(65);
      pr_default.close(38);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV24EmprCod = "" ;
      wcpOAV20Accion = "" ;
      Z396EmprCod = "" ;
      Z9437OMUsuCre = "" ;
      Z9445OMEst = "" ;
      Z9433OMTxt = "" ;
      Z9438OMFchPre = GXutil.nullDate() ;
      Z9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9464OMNot = "" ;
      Z9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      Z9426OMMaqCod = "" ;
      N9426OMMaqCod = "" ;
      N9433OMTxt = "" ;
      Combo_omtipoid_Selectedvalue_get = "" ;
      Combo_ommaqcod_Selectedvalue_get = "" ;
      Z11446OMMEquCod = "" ;
      Z11447OMMSEqCod = "" ;
      Z11448OMMPieCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9426OMMaqCod = "" ;
      A11446OMMEquCod = "" ;
      A11447OMMSEqCod = "" ;
      A11448OMMPieCod = "" ;
      A9517SMDsc = "" ;
      h9428SMCod = "" ;
      Gx_mode = "" ;
      AV24EmprCod = "" ;
      AV20Accion = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A9445OMEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockommaqcod_Jsonclick = "" ;
      ucCombo_ommaqcod = new com.genexus.webpanels.GXUserControl();
      AV36DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV43OMMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A9438OMFchPre = GXutil.nullDate() ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9437OMUsuCre = "" ;
      lblTextblockomtipoid_Jsonclick = "" ;
      ucCombo_omtipoid = new com.genexus.webpanels.GXUserControl();
      AV46OMTipoId_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextmensaje_Jsonclick = "" ;
      ucDvpanel_tabletextonota = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      lblTextblockomtxt_Jsonclick = "" ;
      A9433OMTxt = "" ;
      lblTextblockomnot_Jsonclick = "" ;
      A9464OMNot = "" ;
      ucDvpanel_tableleaflevel_equipos = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableleaflevel_tareas = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      bttBtncontrol_Jsonclick = "" ;
      bttBtnrepuestos_Jsonclick = "" ;
      bttBtnmanodeobra_Jsonclick = "" ;
      AV60Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV44ComboOMMaqCod = "" ;
      ucCombo_tmcod = new com.genexus.webpanels.GXUserControl();
      AV49TMCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A13679OMMaqCodFo = "" ;
      A9427OMMaqDsc = "" ;
      A13678OMDscMqPla = "" ;
      Gridlevel_equiposContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1531 = "" ;
      Gridlevel_tareasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1530 = "" ;
      AV26Insert_OMMaqCod = "" ;
      AV8UsurCod = "" ;
      A14494OMTipoDc = "" ;
      A12599OMMEquDsc = "" ;
      A12600OMMSEqDsc = "" ;
      A11449OMMPieDsc = "" ;
      A9431TMDsc = "" ;
      A9432TMTxt = "" ;
      Combo_ommaqcod_Objectcall = "" ;
      Combo_ommaqcod_Class = "" ;
      Combo_ommaqcod_Icontype = "" ;
      Combo_ommaqcod_Icon = "" ;
      Combo_ommaqcod_Tooltip = "" ;
      Combo_ommaqcod_Selectedvalue_set = "" ;
      Combo_ommaqcod_Selectedtext_set = "" ;
      Combo_ommaqcod_Selectedtext_get = "" ;
      Combo_ommaqcod_Gamoauthtoken = "" ;
      Combo_ommaqcod_Ddointernalname = "" ;
      Combo_ommaqcod_Titlecontrolalign = "" ;
      Combo_ommaqcod_Dropdownoptionstype = "" ;
      Combo_ommaqcod_Titlecontrolidtoreplace = "" ;
      Combo_ommaqcod_Datalisttype = "" ;
      Combo_ommaqcod_Datalistfixedvalues = "" ;
      Combo_ommaqcod_Datalistproc = "" ;
      Combo_ommaqcod_Datalistprocparametersprefix = "" ;
      Combo_ommaqcod_Remoteservicesparameters = "" ;
      Combo_ommaqcod_Htmltemplate = "" ;
      Combo_ommaqcod_Multiplevaluestype = "" ;
      Combo_ommaqcod_Loadingdata = "" ;
      Combo_ommaqcod_Noresultsfound = "" ;
      Combo_ommaqcod_Emptyitemtext = "" ;
      Combo_ommaqcod_Onlyselectedvalues = "" ;
      Combo_ommaqcod_Selectalltext = "" ;
      Combo_ommaqcod_Multiplevaluesseparator = "" ;
      Combo_ommaqcod_Addnewoptiontext = "" ;
      Combo_omtipoid_Objectcall = "" ;
      Combo_omtipoid_Class = "" ;
      Combo_omtipoid_Icontype = "" ;
      Combo_omtipoid_Icon = "" ;
      Combo_omtipoid_Tooltip = "" ;
      Combo_omtipoid_Selectedvalue_set = "" ;
      Combo_omtipoid_Selectedtext_set = "" ;
      Combo_omtipoid_Selectedtext_get = "" ;
      Combo_omtipoid_Gamoauthtoken = "" ;
      Combo_omtipoid_Ddointernalname = "" ;
      Combo_omtipoid_Titlecontrolalign = "" ;
      Combo_omtipoid_Dropdownoptionstype = "" ;
      Combo_omtipoid_Titlecontrolidtoreplace = "" ;
      Combo_omtipoid_Datalisttype = "" ;
      Combo_omtipoid_Datalistfixedvalues = "" ;
      Combo_omtipoid_Datalistproc = "" ;
      Combo_omtipoid_Datalistprocparametersprefix = "" ;
      Combo_omtipoid_Remoteservicesparameters = "" ;
      Combo_omtipoid_Htmltemplate = "" ;
      Combo_omtipoid_Multiplevaluestype = "" ;
      Combo_omtipoid_Loadingdata = "" ;
      Combo_omtipoid_Noresultsfound = "" ;
      Combo_omtipoid_Emptyitemtext = "" ;
      Combo_omtipoid_Onlyselectedvalues = "" ;
      Combo_omtipoid_Selectalltext = "" ;
      Combo_omtipoid_Multiplevaluesseparator = "" ;
      Combo_omtipoid_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_tabletextonota_Objectcall = "" ;
      Dvpanel_tabletextonota_Class = "" ;
      Dvpanel_tabletextonota_Height = "" ;
      Dvpanel_tableleaflevel_equipos_Objectcall = "" ;
      Dvpanel_tableleaflevel_equipos_Class = "" ;
      Dvpanel_tableleaflevel_equipos_Height = "" ;
      Dvpanel_tableleaflevel_tareas_Objectcall = "" ;
      Dvpanel_tableleaflevel_tareas_Class = "" ;
      Dvpanel_tableleaflevel_tareas_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_tmcod_Objectcall = "" ;
      Combo_tmcod_Class = "" ;
      Combo_tmcod_Icontype = "" ;
      Combo_tmcod_Icon = "" ;
      Combo_tmcod_Tooltip = "" ;
      Combo_tmcod_Selectedvalue_set = "" ;
      Combo_tmcod_Selectedvalue_get = "" ;
      Combo_tmcod_Selectedtext_set = "" ;
      Combo_tmcod_Selectedtext_get = "" ;
      Combo_tmcod_Gamoauthtoken = "" ;
      Combo_tmcod_Ddointernalname = "" ;
      Combo_tmcod_Titlecontrolalign = "" ;
      Combo_tmcod_Dropdownoptionstype = "" ;
      Combo_tmcod_Datalisttype = "" ;
      Combo_tmcod_Datalistfixedvalues = "" ;
      Combo_tmcod_Datalistproc = "" ;
      Combo_tmcod_Datalistprocparametersprefix = "" ;
      Combo_tmcod_Remoteservicesparameters = "" ;
      Combo_tmcod_Htmltemplate = "" ;
      Combo_tmcod_Multiplevaluestype = "" ;
      Combo_tmcod_Loadingdata = "" ;
      Combo_tmcod_Noresultsfound = "" ;
      Combo_tmcod_Emptyitemtext = "" ;
      Combo_tmcod_Onlyselectedvalues = "" ;
      Combo_tmcod_Selectalltext = "" ;
      Combo_tmcod_Multiplevaluesseparator = "" ;
      Combo_tmcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1232 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A14497OMMEqDc = "" ;
      A14498OMMSqDc = "" ;
      A14499OMMPieDc = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV31TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV33WebSession = httpContext.getWebSession();
      AV32TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_char3 = new String[1] ;
      AV18MTMovNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int11 = new short[1] ;
      AV57OMMaqDsc = "" ;
      AV37ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item13 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z9444OMRRCosT = DecimalUtil.ZERO ;
      Z9443OMRCCosT = DecimalUtil.ZERO ;
      Z9442OMMRCosT = DecimalUtil.ZERO ;
      Z9441OMMCCosT = DecimalUtil.ZERO ;
      Z9427OMMaqDsc = "" ;
      Z13679OMMaqCodFo = "" ;
      Z14494OMTipoDc = "" ;
      T013U20_A9517SMDsc = new String[] {""} ;
      T013U20_n9517SMDsc = new boolean[] {false} ;
      T013U20_A396EmprCod = new String[] {""} ;
      T013U20_A9428SMCod = new int[1] ;
      T013U20_n9428SMCod = new boolean[] {false} ;
      T013U10_A407EmprNom = new String[] {""} ;
      T013U10_n407EmprNom = new boolean[] {false} ;
      T013U11_A9427OMMaqDsc = new String[] {""} ;
      T013U11_n9427OMMaqDsc = new boolean[] {false} ;
      T013U15_A13679OMMaqCodFo = new String[] {""} ;
      T013U15_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U14_A14494OMTipoDc = new String[] {""} ;
      T013U17_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U17_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U19_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U19_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U23_A602MaqCod = new String[] {""} ;
      T013U23_A9425OMCod = new int[1] ;
      T013U23_A9437OMUsuCre = new String[] {""} ;
      T013U23_A9445OMEst = new String[] {""} ;
      T013U23_A407EmprNom = new String[] {""} ;
      T013U23_n407EmprNom = new boolean[] {false} ;
      T013U23_A9427OMMaqDsc = new String[] {""} ;
      T013U23_n9427OMMaqDsc = new boolean[] {false} ;
      T013U23_A9433OMTxt = new String[] {""} ;
      T013U23_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U23_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U23_A9464OMNot = new String[] {""} ;
      T013U23_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013U23_A14495OMPri = new byte[1] ;
      T013U23_A14494OMTipoDc = new String[] {""} ;
      T013U23_A396EmprCod = new String[] {""} ;
      T013U23_A9426OMMaqCod = new String[] {""} ;
      T013U23_A9429PMCod = new int[1] ;
      T013U23_n9429PMCod = new boolean[] {false} ;
      T013U23_A9428SMCod = new int[1] ;
      T013U23_n9428SMCod = new boolean[] {false} ;
      T013U23_A14492OMTipoId = new short[1] ;
      T013U23_n14492OMTipoId = new boolean[] {false} ;
      T013U23_A13679OMMaqCodFo = new String[] {""} ;
      T013U23_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U23_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U23_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U23_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U23_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U24_A9517SMDsc = new String[] {""} ;
      T013U24_n9517SMDsc = new boolean[] {false} ;
      T013U24_A396EmprCod = new String[] {""} ;
      T013U24_A9428SMCod = new int[1] ;
      T013U24_n9428SMCod = new boolean[] {false} ;
      T013U25_A9517SMDsc = new String[] {""} ;
      T013U25_n9517SMDsc = new boolean[] {false} ;
      T013U25_A396EmprCod = new String[] {""} ;
      T013U25_A9428SMCod = new int[1] ;
      T013U25_n9428SMCod = new boolean[] {false} ;
      T013U26_A9517SMDsc = new String[] {""} ;
      T013U26_n9517SMDsc = new boolean[] {false} ;
      T013U26_A396EmprCod = new String[] {""} ;
      T013U26_A9428SMCod = new int[1] ;
      T013U26_n9428SMCod = new boolean[] {false} ;
      T013U12_A396EmprCod = new String[] {""} ;
      T013U13_A396EmprCod = new String[] {""} ;
      T013U27_A407EmprNom = new String[] {""} ;
      T013U27_n407EmprNom = new boolean[] {false} ;
      T013U28_A9427OMMaqDsc = new String[] {""} ;
      T013U28_n9427OMMaqDsc = new boolean[] {false} ;
      T013U29_A396EmprCod = new String[] {""} ;
      T013U30_A396EmprCod = new String[] {""} ;
      T013U31_A14494OMTipoDc = new String[] {""} ;
      T013U32_A13679OMMaqCodFo = new String[] {""} ;
      T013U32_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U34_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U34_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U36_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U36_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U37_A396EmprCod = new String[] {""} ;
      T013U37_A9425OMCod = new int[1] ;
      T013U9_A9425OMCod = new int[1] ;
      T013U9_A9437OMUsuCre = new String[] {""} ;
      T013U9_A9445OMEst = new String[] {""} ;
      T013U9_A9433OMTxt = new String[] {""} ;
      T013U9_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U9_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U9_A9464OMNot = new String[] {""} ;
      T013U9_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013U9_A14495OMPri = new byte[1] ;
      T013U9_A396EmprCod = new String[] {""} ;
      T013U9_A9426OMMaqCod = new String[] {""} ;
      T013U9_A9429PMCod = new int[1] ;
      T013U9_n9429PMCod = new boolean[] {false} ;
      T013U9_A9428SMCod = new int[1] ;
      T013U9_n9428SMCod = new boolean[] {false} ;
      T013U9_A14492OMTipoId = new short[1] ;
      T013U9_n14492OMTipoId = new boolean[] {false} ;
      T013U38_A396EmprCod = new String[] {""} ;
      T013U38_A9425OMCod = new int[1] ;
      T013U39_A396EmprCod = new String[] {""} ;
      T013U39_A9425OMCod = new int[1] ;
      T013U40_A9517SMDsc = new String[] {""} ;
      T013U40_n9517SMDsc = new boolean[] {false} ;
      T013U40_A396EmprCod = new String[] {""} ;
      T013U40_A9428SMCod = new int[1] ;
      T013U40_n9428SMCod = new boolean[] {false} ;
      T013U8_A9425OMCod = new int[1] ;
      T013U8_A9437OMUsuCre = new String[] {""} ;
      T013U8_A9445OMEst = new String[] {""} ;
      T013U8_A9433OMTxt = new String[] {""} ;
      T013U8_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U8_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U8_A9464OMNot = new String[] {""} ;
      T013U8_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013U8_A14495OMPri = new byte[1] ;
      T013U8_A396EmprCod = new String[] {""} ;
      T013U8_A9426OMMaqCod = new String[] {""} ;
      T013U8_A9429PMCod = new int[1] ;
      T013U8_n9429PMCod = new boolean[] {false} ;
      T013U8_A9428SMCod = new int[1] ;
      T013U8_n9428SMCod = new boolean[] {false} ;
      T013U8_A14492OMTipoId = new short[1] ;
      T013U8_n14492OMTipoId = new boolean[] {false} ;
      T013U44_A407EmprNom = new String[] {""} ;
      T013U44_n407EmprNom = new boolean[] {false} ;
      T013U46_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U46_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U48_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U48_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U49_A9427OMMaqDsc = new String[] {""} ;
      T013U49_n9427OMMaqDsc = new boolean[] {false} ;
      T013U50_A13679OMMaqCodFo = new String[] {""} ;
      T013U50_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U51_A14494OMTipoDc = new String[] {""} ;
      T013U52_A396EmprCod = new String[] {""} ;
      T013U52_A9425OMCod = new int[1] ;
      T013U52_A9430TMCod = new int[1] ;
      T013U52_A12636TMOMMEquCo = new String[] {""} ;
      T013U52_A12637TMOMMSEqCo = new String[] {""} ;
      T013U52_A12638TMOMMPieCo = new String[] {""} ;
      T013U53_A396EmprCod = new String[] {""} ;
      T013U53_A9425OMCod = new int[1] ;
      T013U53_A9455OMOpeCod = new int[1] ;
      T013U53_A9458OMMTpo = new String[] {""} ;
      T013U54_A396EmprCod = new String[] {""} ;
      T013U54_A9425OMCod = new int[1] ;
      T013U54_A9446OMRepCod = new int[1] ;
      T013U54_A9449OMRTpo = new String[] {""} ;
      T013U55_A396EmprCod = new String[] {""} ;
      T013U55_A9425OMCod = new int[1] ;
      Z12599OMMEquDsc = "" ;
      Z12600OMMSEqDsc = "" ;
      Z11449OMMPieDsc = "" ;
      T013U56_A9426OMMaqCod = new String[] {""} ;
      T013U56_A9425OMCod = new int[1] ;
      T013U56_A12599OMMEquDsc = new String[] {""} ;
      T013U56_A12600OMMSEqDsc = new String[] {""} ;
      T013U56_A11449OMMPieDsc = new String[] {""} ;
      T013U56_n11449OMMPieDsc = new boolean[] {false} ;
      T013U56_A396EmprCod = new String[] {""} ;
      T013U56_A11446OMMEquCod = new String[] {""} ;
      T013U56_A11447OMMSEqCod = new String[] {""} ;
      T013U56_A11448OMMPieCod = new String[] {""} ;
      T013U7_A12599OMMEquDsc = new String[] {""} ;
      T013U7_A12600OMMSEqDsc = new String[] {""} ;
      T013U7_A11449OMMPieDsc = new String[] {""} ;
      T013U7_n11449OMMPieDsc = new boolean[] {false} ;
      T013U57_A12599OMMEquDsc = new String[] {""} ;
      T013U57_A12600OMMSEqDsc = new String[] {""} ;
      T013U57_A11449OMMPieDsc = new String[] {""} ;
      T013U57_n11449OMMPieDsc = new boolean[] {false} ;
      T013U58_A396EmprCod = new String[] {""} ;
      T013U58_A9425OMCod = new int[1] ;
      T013U58_A11446OMMEquCod = new String[] {""} ;
      T013U58_A11447OMMSEqCod = new String[] {""} ;
      T013U58_A11448OMMPieCod = new String[] {""} ;
      T013U6_A9425OMCod = new int[1] ;
      T013U6_A396EmprCod = new String[] {""} ;
      T013U6_A11446OMMEquCod = new String[] {""} ;
      T013U6_A11447OMMSEqCod = new String[] {""} ;
      T013U6_A11448OMMPieCod = new String[] {""} ;
      T013U5_A9425OMCod = new int[1] ;
      T013U5_A396EmprCod = new String[] {""} ;
      T013U5_A11446OMMEquCod = new String[] {""} ;
      T013U5_A11447OMMSEqCod = new String[] {""} ;
      T013U5_A11448OMMPieCod = new String[] {""} ;
      T013U61_A12599OMMEquDsc = new String[] {""} ;
      T013U61_A12600OMMSEqDsc = new String[] {""} ;
      T013U61_A11449OMMPieDsc = new String[] {""} ;
      T013U61_n11449OMMPieDsc = new boolean[] {false} ;
      T013U62_A396EmprCod = new String[] {""} ;
      T013U62_A9425OMCod = new int[1] ;
      T013U62_A11446OMMEquCod = new String[] {""} ;
      T013U62_A11447OMMSEqCod = new String[] {""} ;
      T013U62_A11448OMMPieCod = new String[] {""} ;
      Z9431TMDsc = "" ;
      Z9432TMTxt = "" ;
      T013U63_A9425OMCod = new int[1] ;
      T013U63_A9431TMDsc = new String[] {""} ;
      T013U63_n9431TMDsc = new boolean[] {false} ;
      T013U63_A9432TMTxt = new String[] {""} ;
      T013U63_n9432TMTxt = new boolean[] {false} ;
      T013U63_A396EmprCod = new String[] {""} ;
      T013U63_A9430TMCod = new int[1] ;
      T013U4_A9431TMDsc = new String[] {""} ;
      T013U4_n9431TMDsc = new boolean[] {false} ;
      T013U4_A9432TMTxt = new String[] {""} ;
      T013U4_n9432TMTxt = new boolean[] {false} ;
      T013U64_A9431TMDsc = new String[] {""} ;
      T013U64_n9431TMDsc = new boolean[] {false} ;
      T013U64_A9432TMTxt = new String[] {""} ;
      T013U64_n9432TMTxt = new boolean[] {false} ;
      T013U65_A396EmprCod = new String[] {""} ;
      T013U65_A9425OMCod = new int[1] ;
      T013U65_A9430TMCod = new int[1] ;
      T013U3_A9425OMCod = new int[1] ;
      T013U3_A396EmprCod = new String[] {""} ;
      T013U3_A9430TMCod = new int[1] ;
      T013U2_A9425OMCod = new int[1] ;
      T013U2_A396EmprCod = new String[] {""} ;
      T013U2_A9430TMCod = new int[1] ;
      T013U68_A9431TMDsc = new String[] {""} ;
      T013U68_n9431TMDsc = new boolean[] {false} ;
      T013U68_A9432TMTxt = new String[] {""} ;
      T013U68_n9432TMTxt = new boolean[] {false} ;
      T013U69_A396EmprCod = new String[] {""} ;
      T013U69_A9425OMCod = new int[1] ;
      T013U69_A9430TMCod = new int[1] ;
      T013U69_A12636TMOMMEquCo = new String[] {""} ;
      T013U69_A12637TMOMMSEqCo = new String[] {""} ;
      T013U69_A12638TMOMMPieCo = new String[] {""} ;
      T013U70_A396EmprCod = new String[] {""} ;
      T013U70_A9425OMCod = new int[1] ;
      T013U70_A9430TMCod = new int[1] ;
      Gridlevel_equiposRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_equipos_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_11446_gximage = "" ;
      sImgUrl = "" ;
      imgprompt_11446_11447_gximage = "" ;
      imgprompt_11446_11447_11448_gximage = "" ;
      Gridlevel_tareasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_tareas_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13680OMDuracion = "" ;
      i9437OMUsuCre = "" ;
      i9445OMEst = "" ;
      i9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Gridlevel_equiposColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_tareasColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l9517SMDsc = "" ;
      T013U71_A9517SMDsc = new String[] {""} ;
      T013U71_n9517SMDsc = new boolean[] {false} ;
      T013U72_A9517SMDsc = new String[] {""} ;
      T013U72_n9517SMDsc = new boolean[] {false} ;
      T013U72_A396EmprCod = new String[] {""} ;
      T013U72_A9428SMCod = new int[1] ;
      T013U72_n9428SMCod = new boolean[] {false} ;
      GXv_int15 = new int[1] ;
      GXv_int8 = new int[1] ;
      T013U73_A407EmprNom = new String[] {""} ;
      T013U73_n407EmprNom = new boolean[] {false} ;
      T013U75_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U75_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U77_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U77_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U78_A9427OMMaqDsc = new String[] {""} ;
      T013U78_n9427OMMaqDsc = new boolean[] {false} ;
      T013U79_A13679OMMaqCodFo = new String[] {""} ;
      T013U79_n13679OMMaqCodFo = new boolean[] {false} ;
      Z13678OMDscMqPla = "" ;
      T013U80_A9517SMDsc = new String[] {""} ;
      T013U80_n9517SMDsc = new boolean[] {false} ;
      T013U80_A396EmprCod = new String[] {""} ;
      T013U80_A9428SMCod = new int[1] ;
      T013U80_n9428SMCod = new boolean[] {false} ;
      T013U81_A396EmprCod = new String[] {""} ;
      Zh9428SMCod = "" ;
      T013U82_A396EmprCod = new String[] {""} ;
      T013U83_A14494OMTipoDc = new String[] {""} ;
      Z14497OMMEqDc = "" ;
      Z14498OMMSqDc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z14499OMMPieDc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmorden__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmorden__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmorden__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmorden__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmorden__default(),
         new Object[] {
             new Object[] {
            T013U2_A9425OMCod, T013U2_A396EmprCod, T013U2_A9430TMCod
            }
            , new Object[] {
            T013U3_A9425OMCod, T013U3_A396EmprCod, T013U3_A9430TMCod
            }
            , new Object[] {
            T013U4_A9431TMDsc, T013U4_n9431TMDsc, T013U4_A9432TMTxt, T013U4_n9432TMTxt
            }
            , new Object[] {
            T013U5_A9425OMCod, T013U5_A396EmprCod, T013U5_A11446OMMEquCod, T013U5_A11447OMMSEqCod, T013U5_A11448OMMPieCod
            }
            , new Object[] {
            T013U6_A9425OMCod, T013U6_A396EmprCod, T013U6_A11446OMMEquCod, T013U6_A11447OMMSEqCod, T013U6_A11448OMMPieCod
            }
            , new Object[] {
            T013U7_A12599OMMEquDsc, T013U7_A12600OMMSEqDsc, T013U7_A11449OMMPieDsc, T013U7_n11449OMMPieDsc
            }
            , new Object[] {
            T013U8_A9425OMCod, T013U8_A9437OMUsuCre, T013U8_A9445OMEst, T013U8_A9433OMTxt, T013U8_A9438OMFchPre, T013U8_A9436OMFchCre, T013U8_A9464OMNot, T013U8_A9439OMFchCer, T013U8_A14495OMPri, T013U8_A396EmprCod,
            T013U8_A9426OMMaqCod, T013U8_A9429PMCod, T013U8_n9429PMCod, T013U8_A9428SMCod, T013U8_n9428SMCod, T013U8_A14492OMTipoId, T013U8_n14492OMTipoId
            }
            , new Object[] {
            T013U9_A9425OMCod, T013U9_A9437OMUsuCre, T013U9_A9445OMEst, T013U9_A9433OMTxt, T013U9_A9438OMFchPre, T013U9_A9436OMFchCre, T013U9_A9464OMNot, T013U9_A9439OMFchCer, T013U9_A14495OMPri, T013U9_A396EmprCod,
            T013U9_A9426OMMaqCod, T013U9_A9429PMCod, T013U9_n9429PMCod, T013U9_A9428SMCod, T013U9_n9428SMCod, T013U9_A14492OMTipoId, T013U9_n14492OMTipoId
            }
            , new Object[] {
            T013U10_A407EmprNom, T013U10_n407EmprNom
            }
            , new Object[] {
            T013U11_A9427OMMaqDsc, T013U11_n9427OMMaqDsc
            }
            , new Object[] {
            T013U12_A396EmprCod
            }
            , new Object[] {
            T013U13_A396EmprCod
            }
            , new Object[] {
            T013U14_A14494OMTipoDc
            }
            , new Object[] {
            T013U15_A13679OMMaqCodFo, T013U15_n13679OMMaqCodFo
            }
            , new Object[] {
            T013U17_A9444OMRRCosT, T013U17_A9443OMRCCosT
            }
            , new Object[] {
            T013U19_A9442OMMRCosT, T013U19_A9441OMMCCosT
            }
            , new Object[] {
            T013U20_A9517SMDsc, T013U20_n9517SMDsc, T013U20_A396EmprCod, T013U20_A9428SMCod
            }
            , new Object[] {
            T013U23_A602MaqCod, T013U23_A9425OMCod, T013U23_A9437OMUsuCre, T013U23_A9445OMEst, T013U23_A407EmprNom, T013U23_n407EmprNom, T013U23_A9427OMMaqDsc, T013U23_n9427OMMaqDsc, T013U23_A9433OMTxt, T013U23_A9438OMFchPre,
            T013U23_A9436OMFchCre, T013U23_A9464OMNot, T013U23_A9439OMFchCer, T013U23_A14495OMPri, T013U23_A14494OMTipoDc, T013U23_A396EmprCod, T013U23_A9426OMMaqCod, T013U23_A9429PMCod, T013U23_n9429PMCod, T013U23_A9428SMCod,
            T013U23_n9428SMCod, T013U23_A14492OMTipoId, T013U23_n14492OMTipoId, T013U23_A13679OMMaqCodFo, T013U23_n13679OMMaqCodFo, T013U23_A9444OMRRCosT, T013U23_A9443OMRCCosT, T013U23_A9442OMMRCosT, T013U23_A9441OMMCCosT
            }
            , new Object[] {
            T013U24_A9517SMDsc, T013U24_n9517SMDsc, T013U24_A396EmprCod, T013U24_A9428SMCod
            }
            , new Object[] {
            T013U25_A9517SMDsc, T013U25_n9517SMDsc, T013U25_A396EmprCod, T013U25_A9428SMCod
            }
            , new Object[] {
            T013U26_A9517SMDsc, T013U26_n9517SMDsc, T013U26_A396EmprCod, T013U26_A9428SMCod
            }
            , new Object[] {
            T013U27_A407EmprNom, T013U27_n407EmprNom
            }
            , new Object[] {
            T013U28_A9427OMMaqDsc, T013U28_n9427OMMaqDsc
            }
            , new Object[] {
            T013U29_A396EmprCod
            }
            , new Object[] {
            T013U30_A396EmprCod
            }
            , new Object[] {
            T013U31_A14494OMTipoDc
            }
            , new Object[] {
            T013U32_A13679OMMaqCodFo, T013U32_n13679OMMaqCodFo
            }
            , new Object[] {
            T013U34_A9444OMRRCosT, T013U34_A9443OMRCCosT
            }
            , new Object[] {
            T013U36_A9442OMMRCosT, T013U36_A9441OMMCCosT
            }
            , new Object[] {
            T013U37_A396EmprCod, T013U37_A9425OMCod
            }
            , new Object[] {
            T013U38_A396EmprCod, T013U38_A9425OMCod
            }
            , new Object[] {
            T013U39_A396EmprCod, T013U39_A9425OMCod
            }
            , new Object[] {
            T013U40_A9517SMDsc, T013U40_n9517SMDsc, T013U40_A396EmprCod, T013U40_A9428SMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U44_A407EmprNom, T013U44_n407EmprNom
            }
            , new Object[] {
            T013U46_A9444OMRRCosT, T013U46_A9443OMRCCosT
            }
            , new Object[] {
            T013U48_A9442OMMRCosT, T013U48_A9441OMMCCosT
            }
            , new Object[] {
            T013U49_A9427OMMaqDsc, T013U49_n9427OMMaqDsc
            }
            , new Object[] {
            T013U50_A13679OMMaqCodFo, T013U50_n13679OMMaqCodFo
            }
            , new Object[] {
            T013U51_A14494OMTipoDc
            }
            , new Object[] {
            T013U52_A396EmprCod, T013U52_A9425OMCod, T013U52_A9430TMCod, T013U52_A12636TMOMMEquCo, T013U52_A12637TMOMMSEqCo, T013U52_A12638TMOMMPieCo
            }
            , new Object[] {
            T013U53_A396EmprCod, T013U53_A9425OMCod, T013U53_A9455OMOpeCod, T013U53_A9458OMMTpo
            }
            , new Object[] {
            T013U54_A396EmprCod, T013U54_A9425OMCod, T013U54_A9446OMRepCod, T013U54_A9449OMRTpo
            }
            , new Object[] {
            T013U55_A396EmprCod, T013U55_A9425OMCod
            }
            , new Object[] {
            T013U56_A9426OMMaqCod, T013U56_A9425OMCod, T013U56_A12599OMMEquDsc, T013U56_A12600OMMSEqDsc, T013U56_A11449OMMPieDsc, T013U56_n11449OMMPieDsc, T013U56_A396EmprCod, T013U56_A11446OMMEquCod, T013U56_A11447OMMSEqCod, T013U56_A11448OMMPieCod
            }
            , new Object[] {
            T013U57_A12599OMMEquDsc, T013U57_A12600OMMSEqDsc, T013U57_A11449OMMPieDsc, T013U57_n11449OMMPieDsc
            }
            , new Object[] {
            T013U58_A396EmprCod, T013U58_A9425OMCod, T013U58_A11446OMMEquCod, T013U58_A11447OMMSEqCod, T013U58_A11448OMMPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U61_A12599OMMEquDsc, T013U61_A12600OMMSEqDsc, T013U61_A11449OMMPieDsc, T013U61_n11449OMMPieDsc
            }
            , new Object[] {
            T013U62_A396EmprCod, T013U62_A9425OMCod, T013U62_A11446OMMEquCod, T013U62_A11447OMMSEqCod, T013U62_A11448OMMPieCod
            }
            , new Object[] {
            T013U63_A9425OMCod, T013U63_A9431TMDsc, T013U63_n9431TMDsc, T013U63_A9432TMTxt, T013U63_n9432TMTxt, T013U63_A396EmprCod, T013U63_A9430TMCod
            }
            , new Object[] {
            T013U64_A9431TMDsc, T013U64_n9431TMDsc, T013U64_A9432TMTxt, T013U64_n9432TMTxt
            }
            , new Object[] {
            T013U65_A396EmprCod, T013U65_A9425OMCod, T013U65_A9430TMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U68_A9431TMDsc, T013U68_n9431TMDsc, T013U68_A9432TMTxt, T013U68_n9432TMTxt
            }
            , new Object[] {
            T013U69_A396EmprCod, T013U69_A9425OMCod, T013U69_A9430TMCod, T013U69_A12636TMOMMEquCo, T013U69_A12637TMOMMSEqCo, T013U69_A12638TMOMMPieCo
            }
            , new Object[] {
            T013U70_A396EmprCod, T013U70_A9425OMCod, T013U70_A9430TMCod
            }
            , new Object[] {
            T013U71_A9517SMDsc, T013U71_n9517SMDsc
            }
            , new Object[] {
            T013U72_A9517SMDsc, T013U72_n9517SMDsc, T013U72_A396EmprCod, T013U72_A9428SMCod
            }
            , new Object[] {
            T013U73_A407EmprNom, T013U73_n407EmprNom
            }
            , new Object[] {
            T013U75_A9444OMRRCosT, T013U75_A9443OMRCCosT
            }
            , new Object[] {
            T013U77_A9442OMMRCosT, T013U77_A9441OMMCCosT
            }
            , new Object[] {
            T013U78_A9427OMMaqDsc, T013U78_n9427OMMaqDsc
            }
            , new Object[] {
            T013U79_A13679OMMaqCodFo, T013U79_n13679OMMaqCodFo
            }
            , new Object[] {
            T013U80_A9517SMDsc, T013U80_n9517SMDsc, T013U80_A396EmprCod, T013U80_A9428SMCod
            }
            , new Object[] {
            T013U81_A396EmprCod
            }
            , new Object[] {
            T013U82_A396EmprCod
            }
            , new Object[] {
            T013U83_A14494OMTipoDc
            }
         }
      );
      AV60Pgmname = "MantenimientoMaquina.TMOrden" ;
      Z9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z9445OMEst = httpContext.getMessage( "P", "") ;
      A9445OMEst = httpContext.getMessage( "P", "") ;
      i9445OMEst = httpContext.getMessage( "P", "") ;
   }

   private byte Z14495OMPri ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14495OMPri ;
   private byte Gx_BScreen ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte subGridlevel_equipos_Backcolorstyle ;
   private byte subGridlevel_equipos_Backstyle ;
   private byte subGridlevel_tareas_Backcolorstyle ;
   private byte subGridlevel_tareas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_equipos_Allowselection ;
   private byte subGridlevel_equipos_Allowhovering ;
   private byte subGridlevel_equipos_Allowcollapsing ;
   private byte subGridlevel_equipos_Collapsed ;
   private byte subGridlevel_tareas_Allowselection ;
   private byte subGridlevel_tareas_Allowhovering ;
   private byte subGridlevel_tareas_Allowcollapsing ;
   private byte subGridlevel_tareas_Collapsed ;
   private short nIsMod_1531 ;
   private short Z14492OMTipoId ;
   private short N14492OMTipoId ;
   private short nRcdDeleted_1531 ;
   private short nRcdExists_1531 ;
   private short nRcdDeleted_1530 ;
   private short nRcdExists_1530 ;
   private short nIsMod_1530 ;
   private short A14492OMTipoId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV47ComboOMTipoId ;
   private short nBlankRcdCount1531 ;
   private short RcdFound1531 ;
   private short nBlankRcdUsr1531 ;
   private short nBlankRcdCount1530 ;
   private short RcdFound1530 ;
   private short nBlankRcdUsr1530 ;
   private short AV45Insert_OMTipoId ;
   private short AV48Verequipos ;
   private short RcdFound1232 ;
   private short AV56MORMO ;
   private short GXv_int11[] ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1531 ;
   private short nIsDirty_1530 ;
   private short gxhchits ;
   private int wcpOAV14OMCod ;
   private int Z9425OMCod ;
   private int Z9429PMCod ;
   private int Z9428SMCod ;
   private int nRC_GXsfl_136 ;
   private int nGXsfl_136_idx=1 ;
   private int nRC_GXsfl_150 ;
   private int nGXsfl_150_idx=1 ;
   private int N9428SMCod ;
   private int N9429PMCod ;
   private int Z9430TMCod ;
   private int A9425OMCod ;
   private int A9430TMCod ;
   private int AV14OMCod ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int trnEnded ;
   private int edtOMCod_Enabled ;
   private int edtOMMaqCod_Visible ;
   private int edtOMMaqCod_Enabled ;
   private int edtOMPri_Enabled ;
   private int edtavAccion_Enabled ;
   private int edtavMode_Enabled ;
   private int edtOMFchPre_Enabled ;
   private int edtOMFchCre_Enabled ;
   private int divUnnamedtable3_Visible ;
   private int edtSMCod_Visible ;
   private int edtSMCod_Enabled ;
   private int edtPMCod_Visible ;
   private int edtPMCod_Enabled ;
   private int edtOMFchCer_Enabled ;
   private int edtOMUsuCre_Enabled ;
   private int edtOMTipoId_Visible ;
   private int edtOMTipoId_Enabled ;
   private int edtOMTxt_Enabled ;
   private int edtOMNot_Visible ;
   private int edtOMNot_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int bttBtncontrol_Visible ;
   private int bttBtncontrol_Enabled ;
   private int bttBtnrepuestos_Visible ;
   private int bttBtnrepuestos_Enabled ;
   private int bttBtnmanodeobra_Visible ;
   private int bttBtnmanodeobra_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboommaqcod_Visible ;
   private int edtavComboommaqcod_Enabled ;
   private int edtavComboomtipoid_Enabled ;
   private int edtavComboomtipoid_Visible ;
   private int edtOMDuracion_Visible ;
   private int edtOMDuracion_Enabled ;
   private int edtOMCosRea_Enabled ;
   private int edtOMCosRea_Visible ;
   private int edtOMRRCosT_Enabled ;
   private int edtOMRRCosT_Visible ;
   private int edtOMRCCosT_Enabled ;
   private int edtOMRCCosT_Visible ;
   private int edtOMMRCosT_Enabled ;
   private int edtOMMRCosT_Visible ;
   private int edtOMMCCosT_Enabled ;
   private int edtOMMCCosT_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtOMMaqCodFo_Visible ;
   private int edtOMMaqCodFo_Enabled ;
   private int edtOMMaqDsc_Visible ;
   private int edtOMMaqDsc_Enabled ;
   private int edtOMDscMqPla_Visible ;
   private int edtOMDscMqPla_Enabled ;
   private int edtOMMEquCod_Enabled ;
   private int edtOMMEqDc_Enabled ;
   private int edtOMMSEqCod_Enabled ;
   private int edtOMMSqDc_Enabled ;
   private int edtOMMPieCod_Enabled ;
   private int edtOMMPieDc_Enabled ;
   private int fRowAdded ;
   private int edtTMCod_Enabled ;
   private int AV28Insert_SMCod ;
   private int AV27Insert_PMCod ;
   private int Combo_ommaqcod_Datalistupdateminimumcharacters ;
   private int Combo_omtipoid_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_tmcod_Datalistupdateminimumcharacters ;
   private int AV61GXV1 ;
   private int AV17MTMovCod ;
   private int AV55OMOpecod ;
   private int GX_JID ;
   private int subGridlevel_equipos_Backcolor ;
   private int subGridlevel_equipos_Allbackcolor ;
   private int imgprompt_11446_Visible ;
   private int imgprompt_11446_11447_Visible ;
   private int imgprompt_11446_11447_11448_Visible ;
   private int subGridlevel_tareas_Backcolor ;
   private int subGridlevel_tareas_Allbackcolor ;
   private int defedtTMCod_Enabled ;
   private int defedtOMMPieCod_Enabled ;
   private int defedtOMMSEqCod_Enabled ;
   private int defedtOMMEquCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_equipos_Selectedindex ;
   private int subGridlevel_equipos_Selectioncolor ;
   private int subGridlevel_equipos_Hoveringcolor ;
   private int subGridlevel_tareas_Selectedindex ;
   private int subGridlevel_tareas_Selectioncolor ;
   private int subGridlevel_tareas_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXt_int14 ;
   private int GXv_int15[] ;
   private int GXv_int8[] ;
   private long GRIDLEVEL_EQUIPOS_nFirstRecordOnPage ;
   private long GRIDLEVEL_TAREAS_nFirstRecordOnPage ;
   private java.math.BigDecimal A9440OMCosRea ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal Z9444OMRRCosT ;
   private java.math.BigDecimal Z9443OMRCCosT ;
   private java.math.BigDecimal Z9442OMMRCosT ;
   private java.math.BigDecimal Z9441OMMCCosT ;
   private String sPrefix ;
   private String sGXsfl_136_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV24EmprCod ;
   private String wcpOAV20Accion ;
   private String Z396EmprCod ;
   private String Z9437OMUsuCre ;
   private String Z9445OMEst ;
   private String Z9426OMMaqCod ;
   private String N9426OMMaqCod ;
   private String Combo_omtipoid_Selectedvalue_get ;
   private String Combo_ommaqcod_Selectedvalue_get ;
   private String Z11446OMMEquCod ;
   private String Z11447OMMSEqCod ;
   private String Z11448OMMPieCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9426OMMaqCod ;
   private String A11446OMMEquCod ;
   private String A11447OMMSEqCod ;
   private String A11448OMMPieCod ;
   private String A9517SMDsc ;
   private String h9428SMCod ;
   private String Gx_mode ;
   private String AV24EmprCod ;
   private String AV20Accion ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOMMaqCod_Internalname ;
   private String sGXsfl_150_idx="0001" ;
   private String edtTMCod_Horizontalalignment ;
   private String edtTMCod_Internalname ;
   private String A9445OMEst ;
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
   private String edtOMCod_Internalname ;
   private String TempTags ;
   private String edtOMCod_Jsonclick ;
   private String divTablesplittedommaqcod_Internalname ;
   private String lblTextblockommaqcod_Internalname ;
   private String lblTextblockommaqcod_Jsonclick ;
   private String Combo_ommaqcod_Caption ;
   private String Combo_ommaqcod_Cls ;
   private String Combo_ommaqcod_Internalname ;
   private String edtOMMaqCod_Jsonclick ;
   private String edtOMPri_Internalname ;
   private String edtOMPri_Jsonclick ;
   private String edtavAccion_Internalname ;
   private String edtavAccion_Jsonclick ;
   private String edtavMode_Internalname ;
   private String edtavMode_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtOMFchPre_Internalname ;
   private String edtOMFchPre_Jsonclick ;
   private String edtOMFchCre_Internalname ;
   private String edtOMFchCre_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divSmcod_cell_Internalname ;
   private String divSmcod_cell_Class ;
   private String edtSMCod_Internalname ;
   private String edtSMCod_Jsonclick ;
   private String divPmcod_cell_Internalname ;
   private String divPmcod_cell_Class ;
   private String edtPMCod_Internalname ;
   private String edtPMCod_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtOMFchCer_Internalname ;
   private String edtOMFchCer_Jsonclick ;
   private String edtOMUsuCre_Internalname ;
   private String A9437OMUsuCre ;
   private String edtOMUsuCre_Jsonclick ;
   private String divTablesplittedomtipoid_Internalname ;
   private String lblTextblockomtipoid_Internalname ;
   private String lblTextblockomtipoid_Jsonclick ;
   private String Combo_omtipoid_Caption ;
   private String Combo_omtipoid_Cls ;
   private String Combo_omtipoid_Internalname ;
   private String edtOMTipoId_Internalname ;
   private String edtOMTipoId_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String lblTextmensaje_Internalname ;
   private String lblTextmensaje_Caption ;
   private String lblTextmensaje_Jsonclick ;
   private String Dvpanel_tabletextonota_Width ;
   private String Dvpanel_tabletextonota_Cls ;
   private String Dvpanel_tabletextonota_Title ;
   private String Dvpanel_tabletextonota_Iconposition ;
   private String Dvpanel_tabletextonota_Internalname ;
   private String sStyleString ;
   private String tblTabletextonota_Internalname ;
   private String divUnnamedtableomtxt_Internalname ;
   private String lblTextblockomtxt_Internalname ;
   private String lblTextblockomtxt_Jsonclick ;
   private String edtOMTxt_Internalname ;
   private String cellOmnot_cell_Internalname ;
   private String cellOmnot_cell_Class ;
   private String divUnnamedtableomnot_Internalname ;
   private String lblTextblockomnot_Internalname ;
   private String lblTextblockomnot_Jsonclick ;
   private String edtOMNot_Internalname ;
   private String divTableequipotarea_Internalname ;
   private String divDvpanel_tableleaflevel_equipos_cell_Internalname ;
   private String divDvpanel_tableleaflevel_equipos_cell_Class ;
   private String Dvpanel_tableleaflevel_equipos_Width ;
   private String Dvpanel_tableleaflevel_equipos_Cls ;
   private String Dvpanel_tableleaflevel_equipos_Title ;
   private String Dvpanel_tableleaflevel_equipos_Iconposition ;
   private String Dvpanel_tableleaflevel_equipos_Internalname ;
   private String divTableleaflevel_equipos_Internalname ;
   private String Dvpanel_tableleaflevel_tareas_Width ;
   private String Dvpanel_tableleaflevel_tareas_Cls ;
   private String Dvpanel_tableleaflevel_tareas_Title ;
   private String Dvpanel_tableleaflevel_tareas_Iconposition ;
   private String Dvpanel_tableleaflevel_tareas_Internalname ;
   private String divTableleaflevel_tareas_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String bttBtncontrol_Internalname ;
   private String bttBtncontrol_Jsonclick ;
   private String bttBtnrepuestos_Internalname ;
   private String bttBtnrepuestos_Jsonclick ;
   private String bttBtnmanodeobra_Internalname ;
   private String bttBtnmanodeobra_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV60Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_ommaqcod_Internalname ;
   private String edtavComboommaqcod_Internalname ;
   private String AV44ComboOMMaqCod ;
   private String edtavComboommaqcod_Jsonclick ;
   private String divSectionattribute_omtipoid_Internalname ;
   private String edtavComboomtipoid_Internalname ;
   private String edtavComboomtipoid_Jsonclick ;
   private String Combo_tmcod_Caption ;
   private String Combo_tmcod_Cls ;
   private String Combo_tmcod_Internalname ;
   private String edtOMDuracion_Internalname ;
   private String edtOMDuracion_Jsonclick ;
   private String edtOMCosRea_Internalname ;
   private String edtOMCosRea_Jsonclick ;
   private String edtOMRRCosT_Internalname ;
   private String edtOMRRCosT_Jsonclick ;
   private String edtOMRCCosT_Internalname ;
   private String edtOMRCCosT_Jsonclick ;
   private String edtOMMRCosT_Internalname ;
   private String edtOMMRCosT_Jsonclick ;
   private String edtOMMCCosT_Internalname ;
   private String edtOMMCCosT_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtOMMaqCodFo_Internalname ;
   private String A13679OMMaqCodFo ;
   private String edtOMMaqCodFo_Jsonclick ;
   private String edtOMMaqDsc_Internalname ;
   private String A9427OMMaqDsc ;
   private String edtOMMaqDsc_Jsonclick ;
   private String edtOMDscMqPla_Internalname ;
   private String A13678OMDscMqPla ;
   private String edtOMDscMqPla_Jsonclick ;
   private String sMode1531 ;
   private String edtOMMEquCod_Internalname ;
   private String edtOMMEqDc_Internalname ;
   private String edtOMMSEqCod_Internalname ;
   private String edtOMMSqDc_Internalname ;
   private String edtOMMPieCod_Internalname ;
   private String edtOMMPieDc_Internalname ;
   private String imgprompt_11446_Link ;
   private String subGridlevel_equipos_Internalname ;
   private String sMode1530 ;
   private String subGridlevel_tareas_Internalname ;
   private String AV26Insert_OMMaqCod ;
   private String AV8UsurCod ;
   private String A14494OMTipoDc ;
   private String A12599OMMEquDsc ;
   private String A12600OMMSEqDsc ;
   private String A11449OMMPieDsc ;
   private String A9431TMDsc ;
   private String Combo_ommaqcod_Objectcall ;
   private String Combo_ommaqcod_Class ;
   private String Combo_ommaqcod_Icontype ;
   private String Combo_ommaqcod_Icon ;
   private String Combo_ommaqcod_Tooltip ;
   private String Combo_ommaqcod_Selectedvalue_set ;
   private String Combo_ommaqcod_Selectedtext_set ;
   private String Combo_ommaqcod_Selectedtext_get ;
   private String Combo_ommaqcod_Gamoauthtoken ;
   private String Combo_ommaqcod_Ddointernalname ;
   private String Combo_ommaqcod_Titlecontrolalign ;
   private String Combo_ommaqcod_Dropdownoptionstype ;
   private String Combo_ommaqcod_Titlecontrolidtoreplace ;
   private String Combo_ommaqcod_Datalisttype ;
   private String Combo_ommaqcod_Datalistfixedvalues ;
   private String Combo_ommaqcod_Datalistproc ;
   private String Combo_ommaqcod_Datalistprocparametersprefix ;
   private String Combo_ommaqcod_Remoteservicesparameters ;
   private String Combo_ommaqcod_Htmltemplate ;
   private String Combo_ommaqcod_Multiplevaluestype ;
   private String Combo_ommaqcod_Loadingdata ;
   private String Combo_ommaqcod_Noresultsfound ;
   private String Combo_ommaqcod_Emptyitemtext ;
   private String Combo_ommaqcod_Onlyselectedvalues ;
   private String Combo_ommaqcod_Selectalltext ;
   private String Combo_ommaqcod_Multiplevaluesseparator ;
   private String Combo_ommaqcod_Addnewoptiontext ;
   private String Combo_omtipoid_Objectcall ;
   private String Combo_omtipoid_Class ;
   private String Combo_omtipoid_Icontype ;
   private String Combo_omtipoid_Icon ;
   private String Combo_omtipoid_Tooltip ;
   private String Combo_omtipoid_Selectedvalue_set ;
   private String Combo_omtipoid_Selectedtext_set ;
   private String Combo_omtipoid_Selectedtext_get ;
   private String Combo_omtipoid_Gamoauthtoken ;
   private String Combo_omtipoid_Ddointernalname ;
   private String Combo_omtipoid_Titlecontrolalign ;
   private String Combo_omtipoid_Dropdownoptionstype ;
   private String Combo_omtipoid_Titlecontrolidtoreplace ;
   private String Combo_omtipoid_Datalisttype ;
   private String Combo_omtipoid_Datalistfixedvalues ;
   private String Combo_omtipoid_Datalistproc ;
   private String Combo_omtipoid_Datalistprocparametersprefix ;
   private String Combo_omtipoid_Remoteservicesparameters ;
   private String Combo_omtipoid_Htmltemplate ;
   private String Combo_omtipoid_Multiplevaluestype ;
   private String Combo_omtipoid_Loadingdata ;
   private String Combo_omtipoid_Noresultsfound ;
   private String Combo_omtipoid_Emptyitemtext ;
   private String Combo_omtipoid_Onlyselectedvalues ;
   private String Combo_omtipoid_Selectalltext ;
   private String Combo_omtipoid_Multiplevaluesseparator ;
   private String Combo_omtipoid_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_tabletextonota_Objectcall ;
   private String Dvpanel_tabletextonota_Class ;
   private String Dvpanel_tabletextonota_Height ;
   private String Dvpanel_tableleaflevel_equipos_Objectcall ;
   private String Dvpanel_tableleaflevel_equipos_Class ;
   private String Dvpanel_tableleaflevel_equipos_Height ;
   private String Dvpanel_tableleaflevel_tareas_Objectcall ;
   private String Dvpanel_tableleaflevel_tareas_Class ;
   private String Dvpanel_tableleaflevel_tareas_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_tmcod_Objectcall ;
   private String Combo_tmcod_Class ;
   private String Combo_tmcod_Icontype ;
   private String Combo_tmcod_Icon ;
   private String Combo_tmcod_Tooltip ;
   private String Combo_tmcod_Selectedvalue_set ;
   private String Combo_tmcod_Selectedvalue_get ;
   private String Combo_tmcod_Selectedtext_set ;
   private String Combo_tmcod_Selectedtext_get ;
   private String Combo_tmcod_Gamoauthtoken ;
   private String Combo_tmcod_Ddointernalname ;
   private String Combo_tmcod_Titlecontrolalign ;
   private String Combo_tmcod_Dropdownoptionstype ;
   private String Combo_tmcod_Titlecontrolidtoreplace ;
   private String Combo_tmcod_Datalisttype ;
   private String Combo_tmcod_Datalistfixedvalues ;
   private String Combo_tmcod_Datalistproc ;
   private String Combo_tmcod_Datalistprocparametersprefix ;
   private String Combo_tmcod_Remoteservicesparameters ;
   private String Combo_tmcod_Htmltemplate ;
   private String Combo_tmcod_Multiplevaluestype ;
   private String Combo_tmcod_Loadingdata ;
   private String Combo_tmcod_Noresultsfound ;
   private String Combo_tmcod_Emptyitemtext ;
   private String Combo_tmcod_Onlyselectedvalues ;
   private String Combo_tmcod_Selectalltext ;
   private String Combo_tmcod_Multiplevaluesseparator ;
   private String Combo_tmcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode1232 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A14497OMMEqDc ;
   private String A14498OMMSqDc ;
   private String A14499OMMPieDc ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV18MTMovNom ;
   private String GXv_char2[] ;
   private String AV57OMMaqDsc ;
   private String Z407EmprNom ;
   private String Z9427OMMaqDsc ;
   private String Z13679OMMaqCodFo ;
   private String Z14494OMTipoDc ;
   private String Z12599OMMEquDsc ;
   private String Z12600OMMSEqDsc ;
   private String Z11449OMMPieDsc ;
   private String Z9431TMDsc ;
   private String imgprompt_11446_Internalname ;
   private String imgprompt_11446_11447_Internalname ;
   private String imgprompt_11446_11447_11448_Internalname ;
   private String sGXsfl_136_fel_idx="0001" ;
   private String subGridlevel_equipos_Class ;
   private String subGridlevel_equipos_Linesclass ;
   private String imgprompt_11446_11447_11448_Link ;
   private String imgprompt_11446_11447_Link ;
   private String ROClassString ;
   private String edtOMMEquCod_Jsonclick ;
   private String imgprompt_11446_gximage ;
   private String sImgUrl ;
   private String edtOMMEqDc_Jsonclick ;
   private String edtOMMSEqCod_Jsonclick ;
   private String imgprompt_11446_11447_gximage ;
   private String edtOMMSqDc_Jsonclick ;
   private String edtOMMPieCod_Jsonclick ;
   private String imgprompt_11446_11447_11448_gximage ;
   private String edtOMMPieDc_Jsonclick ;
   private String sGXsfl_150_fel_idx="0001" ;
   private String subGridlevel_tareas_Class ;
   private String subGridlevel_tareas_Linesclass ;
   private String edtTMCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9437OMUsuCre ;
   private String i9445OMEst ;
   private String subGridlevel_equipos_Header ;
   private String subGridlevel_tareas_Header ;
   private String gxwrpcisep ;
   private String l9517SMDsc ;
   private String Z13678OMDscMqPla ;
   private String Zh9428SMCod ;
   private String Z14497OMMEqDc ;
   private String Z14498OMMSqDc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z14499OMMPieDc ;
   private java.util.Date Z9436OMFchCre ;
   private java.util.Date Z9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date i9436OMFchCre ;
   private java.util.Date Z9438OMFchPre ;
   private java.util.Date A9438OMFchPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9517SMDsc ;
   private boolean n9429PMCod ;
   private boolean n9428SMCod ;
   private boolean n14492OMTipoId ;
   private boolean wbErr ;
   private boolean bGXsfl_150_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_ommaqcod_Emptyitem ;
   private boolean Dvpanel_tabletextonota_Autowidth ;
   private boolean Dvpanel_tabletextonota_Autoheight ;
   private boolean Dvpanel_tabletextonota_Collapsible ;
   private boolean Dvpanel_tabletextonota_Collapsed ;
   private boolean Dvpanel_tabletextonota_Showcollapseicon ;
   private boolean Dvpanel_tabletextonota_Autoscroll ;
   private boolean Dvpanel_tableleaflevel_equipos_Autowidth ;
   private boolean Dvpanel_tableleaflevel_equipos_Autoheight ;
   private boolean Dvpanel_tableleaflevel_equipos_Collapsible ;
   private boolean Dvpanel_tableleaflevel_equipos_Collapsed ;
   private boolean Dvpanel_tableleaflevel_equipos_Showcollapseicon ;
   private boolean Dvpanel_tableleaflevel_equipos_Autoscroll ;
   private boolean Dvpanel_tableleaflevel_tareas_Autowidth ;
   private boolean Dvpanel_tableleaflevel_tareas_Autoheight ;
   private boolean Dvpanel_tableleaflevel_tareas_Collapsible ;
   private boolean Dvpanel_tableleaflevel_tareas_Collapsed ;
   private boolean Dvpanel_tableleaflevel_tareas_Showcollapseicon ;
   private boolean Dvpanel_tableleaflevel_tareas_Autoscroll ;
   private boolean Combo_tmcod_Isgriditem ;
   private boolean Combo_tmcod_Emptyitem ;
   private boolean bGXsfl_136_Refreshing=false ;
   private boolean n11449OMMPieDsc ;
   private boolean n9431TMDsc ;
   private boolean n9432TMTxt ;
   private boolean Combo_ommaqcod_Enabled ;
   private boolean Combo_ommaqcod_Visible ;
   private boolean Combo_ommaqcod_Allowmultipleselection ;
   private boolean Combo_ommaqcod_Isgriditem ;
   private boolean Combo_ommaqcod_Hasdescription ;
   private boolean Combo_ommaqcod_Includeonlyselectedoption ;
   private boolean Combo_ommaqcod_Includeselectalloption ;
   private boolean Combo_ommaqcod_Includeaddnewoption ;
   private boolean Combo_omtipoid_Enabled ;
   private boolean Combo_omtipoid_Visible ;
   private boolean Combo_omtipoid_Allowmultipleselection ;
   private boolean Combo_omtipoid_Isgriditem ;
   private boolean Combo_omtipoid_Hasdescription ;
   private boolean Combo_omtipoid_Includeonlyselectedoption ;
   private boolean Combo_omtipoid_Includeselectalloption ;
   private boolean Combo_omtipoid_Emptyitem ;
   private boolean Combo_omtipoid_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_tabletextonota_Enabled ;
   private boolean Dvpanel_tabletextonota_Showheader ;
   private boolean Dvpanel_tabletextonota_Visible ;
   private boolean Dvpanel_tableleaflevel_equipos_Enabled ;
   private boolean Dvpanel_tableleaflevel_equipos_Showheader ;
   private boolean Dvpanel_tableleaflevel_equipos_Visible ;
   private boolean Dvpanel_tableleaflevel_tareas_Enabled ;
   private boolean Dvpanel_tableleaflevel_tareas_Showheader ;
   private boolean Dvpanel_tableleaflevel_tareas_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_tmcod_Enabled ;
   private boolean Combo_tmcod_Visible ;
   private boolean Combo_tmcod_Allowmultipleselection ;
   private boolean Combo_tmcod_Hasdescription ;
   private boolean Combo_tmcod_Includeonlyselectedoption ;
   private boolean Combo_tmcod_Includeselectalloption ;
   private boolean Combo_tmcod_Includeaddnewoption ;
   private boolean n407EmprNom ;
   private boolean n13679OMMaqCodFo ;
   private boolean n9427OMMaqDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z9433OMTxt ;
   private String Z9464OMNot ;
   private String N9433OMTxt ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A13680OMDuracion ;
   private String A9432TMTxt ;
   private String AV37ComboSelectedValue ;
   private String Z9432TMTxt ;
   private String i13680OMDuracion ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_equiposContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_tareasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_equiposRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_tareasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_equiposColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_tareasColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV33WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_ommaqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_omtipoid ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tabletextonota ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableleaflevel_equipos ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableleaflevel_tareas ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_tmcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private IDataStoreProvider pr_default ;
   private String[] T013U20_A9517SMDsc ;
   private boolean[] T013U20_n9517SMDsc ;
   private String[] T013U20_A396EmprCod ;
   private int[] T013U20_A9428SMCod ;
   private boolean[] T013U20_n9428SMCod ;
   private String[] T013U10_A407EmprNom ;
   private boolean[] T013U10_n407EmprNom ;
   private String[] T013U11_A9427OMMaqDsc ;
   private boolean[] T013U11_n9427OMMaqDsc ;
   private String[] T013U15_A13679OMMaqCodFo ;
   private boolean[] T013U15_n13679OMMaqCodFo ;
   private String[] T013U14_A14494OMTipoDc ;
   private java.math.BigDecimal[] T013U17_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U17_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U19_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U19_A9441OMMCCosT ;
   private String[] T013U23_A602MaqCod ;
   private int[] T013U23_A9425OMCod ;
   private String[] T013U23_A9437OMUsuCre ;
   private String[] T013U23_A9445OMEst ;
   private String[] T013U23_A407EmprNom ;
   private boolean[] T013U23_n407EmprNom ;
   private String[] T013U23_A9427OMMaqDsc ;
   private boolean[] T013U23_n9427OMMaqDsc ;
   private String[] T013U23_A9433OMTxt ;
   private java.util.Date[] T013U23_A9438OMFchPre ;
   private java.util.Date[] T013U23_A9436OMFchCre ;
   private String[] T013U23_A9464OMNot ;
   private java.util.Date[] T013U23_A9439OMFchCer ;
   private byte[] T013U23_A14495OMPri ;
   private String[] T013U23_A14494OMTipoDc ;
   private String[] T013U23_A396EmprCod ;
   private String[] T013U23_A9426OMMaqCod ;
   private int[] T013U23_A9429PMCod ;
   private boolean[] T013U23_n9429PMCod ;
   private int[] T013U23_A9428SMCod ;
   private boolean[] T013U23_n9428SMCod ;
   private short[] T013U23_A14492OMTipoId ;
   private boolean[] T013U23_n14492OMTipoId ;
   private String[] T013U23_A13679OMMaqCodFo ;
   private boolean[] T013U23_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] T013U23_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U23_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U23_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U23_A9441OMMCCosT ;
   private String[] T013U24_A9517SMDsc ;
   private boolean[] T013U24_n9517SMDsc ;
   private String[] T013U24_A396EmprCod ;
   private int[] T013U24_A9428SMCod ;
   private boolean[] T013U24_n9428SMCod ;
   private String[] T013U25_A9517SMDsc ;
   private boolean[] T013U25_n9517SMDsc ;
   private String[] T013U25_A396EmprCod ;
   private int[] T013U25_A9428SMCod ;
   private boolean[] T013U25_n9428SMCod ;
   private String[] T013U26_A9517SMDsc ;
   private boolean[] T013U26_n9517SMDsc ;
   private String[] T013U26_A396EmprCod ;
   private int[] T013U26_A9428SMCod ;
   private boolean[] T013U26_n9428SMCod ;
   private String[] T013U12_A396EmprCod ;
   private String[] T013U13_A396EmprCod ;
   private String[] T013U27_A407EmprNom ;
   private boolean[] T013U27_n407EmprNom ;
   private String[] T013U28_A9427OMMaqDsc ;
   private boolean[] T013U28_n9427OMMaqDsc ;
   private String[] T013U29_A396EmprCod ;
   private String[] T013U30_A396EmprCod ;
   private String[] T013U31_A14494OMTipoDc ;
   private String[] T013U32_A13679OMMaqCodFo ;
   private boolean[] T013U32_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] T013U34_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U34_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U36_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U36_A9441OMMCCosT ;
   private String[] T013U37_A396EmprCod ;
   private int[] T013U37_A9425OMCod ;
   private int[] T013U9_A9425OMCod ;
   private String[] T013U9_A9437OMUsuCre ;
   private String[] T013U9_A9445OMEst ;
   private String[] T013U9_A9433OMTxt ;
   private java.util.Date[] T013U9_A9438OMFchPre ;
   private java.util.Date[] T013U9_A9436OMFchCre ;
   private String[] T013U9_A9464OMNot ;
   private java.util.Date[] T013U9_A9439OMFchCer ;
   private byte[] T013U9_A14495OMPri ;
   private String[] T013U9_A396EmprCod ;
   private String[] T013U9_A9426OMMaqCod ;
   private int[] T013U9_A9429PMCod ;
   private boolean[] T013U9_n9429PMCod ;
   private int[] T013U9_A9428SMCod ;
   private boolean[] T013U9_n9428SMCod ;
   private short[] T013U9_A14492OMTipoId ;
   private boolean[] T013U9_n14492OMTipoId ;
   private String[] T013U38_A396EmprCod ;
   private int[] T013U38_A9425OMCod ;
   private String[] T013U39_A396EmprCod ;
   private int[] T013U39_A9425OMCod ;
   private String[] T013U40_A9517SMDsc ;
   private boolean[] T013U40_n9517SMDsc ;
   private String[] T013U40_A396EmprCod ;
   private int[] T013U40_A9428SMCod ;
   private boolean[] T013U40_n9428SMCod ;
   private int[] T013U8_A9425OMCod ;
   private String[] T013U8_A9437OMUsuCre ;
   private String[] T013U8_A9445OMEst ;
   private String[] T013U8_A9433OMTxt ;
   private java.util.Date[] T013U8_A9438OMFchPre ;
   private java.util.Date[] T013U8_A9436OMFchCre ;
   private String[] T013U8_A9464OMNot ;
   private java.util.Date[] T013U8_A9439OMFchCer ;
   private byte[] T013U8_A14495OMPri ;
   private String[] T013U8_A396EmprCod ;
   private String[] T013U8_A9426OMMaqCod ;
   private int[] T013U8_A9429PMCod ;
   private boolean[] T013U8_n9429PMCod ;
   private int[] T013U8_A9428SMCod ;
   private boolean[] T013U8_n9428SMCod ;
   private short[] T013U8_A14492OMTipoId ;
   private boolean[] T013U8_n14492OMTipoId ;
   private String[] T013U44_A407EmprNom ;
   private boolean[] T013U44_n407EmprNom ;
   private java.math.BigDecimal[] T013U46_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U46_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U48_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U48_A9441OMMCCosT ;
   private String[] T013U49_A9427OMMaqDsc ;
   private boolean[] T013U49_n9427OMMaqDsc ;
   private String[] T013U50_A13679OMMaqCodFo ;
   private boolean[] T013U50_n13679OMMaqCodFo ;
   private String[] T013U51_A14494OMTipoDc ;
   private String[] T013U52_A396EmprCod ;
   private int[] T013U52_A9425OMCod ;
   private int[] T013U52_A9430TMCod ;
   private String[] T013U52_A12636TMOMMEquCo ;
   private String[] T013U52_A12637TMOMMSEqCo ;
   private String[] T013U52_A12638TMOMMPieCo ;
   private String[] T013U53_A396EmprCod ;
   private int[] T013U53_A9425OMCod ;
   private int[] T013U53_A9455OMOpeCod ;
   private String[] T013U53_A9458OMMTpo ;
   private String[] T013U54_A396EmprCod ;
   private int[] T013U54_A9425OMCod ;
   private int[] T013U54_A9446OMRepCod ;
   private String[] T013U54_A9449OMRTpo ;
   private String[] T013U55_A396EmprCod ;
   private int[] T013U55_A9425OMCod ;
   private String[] T013U56_A9426OMMaqCod ;
   private int[] T013U56_A9425OMCod ;
   private String[] T013U56_A12599OMMEquDsc ;
   private String[] T013U56_A12600OMMSEqDsc ;
   private String[] T013U56_A11449OMMPieDsc ;
   private boolean[] T013U56_n11449OMMPieDsc ;
   private String[] T013U56_A396EmprCod ;
   private String[] T013U56_A11446OMMEquCod ;
   private String[] T013U56_A11447OMMSEqCod ;
   private String[] T013U56_A11448OMMPieCod ;
   private String[] T013U7_A12599OMMEquDsc ;
   private String[] T013U7_A12600OMMSEqDsc ;
   private String[] T013U7_A11449OMMPieDsc ;
   private boolean[] T013U7_n11449OMMPieDsc ;
   private String[] T013U57_A12599OMMEquDsc ;
   private String[] T013U57_A12600OMMSEqDsc ;
   private String[] T013U57_A11449OMMPieDsc ;
   private boolean[] T013U57_n11449OMMPieDsc ;
   private String[] T013U58_A396EmprCod ;
   private int[] T013U58_A9425OMCod ;
   private String[] T013U58_A11446OMMEquCod ;
   private String[] T013U58_A11447OMMSEqCod ;
   private String[] T013U58_A11448OMMPieCod ;
   private int[] T013U6_A9425OMCod ;
   private String[] T013U6_A396EmprCod ;
   private String[] T013U6_A11446OMMEquCod ;
   private String[] T013U6_A11447OMMSEqCod ;
   private String[] T013U6_A11448OMMPieCod ;
   private int[] T013U5_A9425OMCod ;
   private String[] T013U5_A396EmprCod ;
   private String[] T013U5_A11446OMMEquCod ;
   private String[] T013U5_A11447OMMSEqCod ;
   private String[] T013U5_A11448OMMPieCod ;
   private String[] T013U61_A12599OMMEquDsc ;
   private String[] T013U61_A12600OMMSEqDsc ;
   private String[] T013U61_A11449OMMPieDsc ;
   private boolean[] T013U61_n11449OMMPieDsc ;
   private String[] T013U62_A396EmprCod ;
   private int[] T013U62_A9425OMCod ;
   private String[] T013U62_A11446OMMEquCod ;
   private String[] T013U62_A11447OMMSEqCod ;
   private String[] T013U62_A11448OMMPieCod ;
   private int[] T013U63_A9425OMCod ;
   private String[] T013U63_A9431TMDsc ;
   private boolean[] T013U63_n9431TMDsc ;
   private String[] T013U63_A9432TMTxt ;
   private boolean[] T013U63_n9432TMTxt ;
   private String[] T013U63_A396EmprCod ;
   private int[] T013U63_A9430TMCod ;
   private String[] T013U4_A9431TMDsc ;
   private boolean[] T013U4_n9431TMDsc ;
   private String[] T013U4_A9432TMTxt ;
   private boolean[] T013U4_n9432TMTxt ;
   private String[] T013U64_A9431TMDsc ;
   private boolean[] T013U64_n9431TMDsc ;
   private String[] T013U64_A9432TMTxt ;
   private boolean[] T013U64_n9432TMTxt ;
   private String[] T013U65_A396EmprCod ;
   private int[] T013U65_A9425OMCod ;
   private int[] T013U65_A9430TMCod ;
   private int[] T013U3_A9425OMCod ;
   private String[] T013U3_A396EmprCod ;
   private int[] T013U3_A9430TMCod ;
   private int[] T013U2_A9425OMCod ;
   private String[] T013U2_A396EmprCod ;
   private int[] T013U2_A9430TMCod ;
   private String[] T013U68_A9431TMDsc ;
   private boolean[] T013U68_n9431TMDsc ;
   private String[] T013U68_A9432TMTxt ;
   private boolean[] T013U68_n9432TMTxt ;
   private String[] T013U69_A396EmprCod ;
   private int[] T013U69_A9425OMCod ;
   private int[] T013U69_A9430TMCod ;
   private String[] T013U69_A12636TMOMMEquCo ;
   private String[] T013U69_A12637TMOMMSEqCo ;
   private String[] T013U69_A12638TMOMMPieCo ;
   private String[] T013U70_A396EmprCod ;
   private int[] T013U70_A9425OMCod ;
   private int[] T013U70_A9430TMCod ;
   private String[] T013U71_A9517SMDsc ;
   private boolean[] T013U71_n9517SMDsc ;
   private String[] T013U72_A9517SMDsc ;
   private boolean[] T013U72_n9517SMDsc ;
   private String[] T013U72_A396EmprCod ;
   private int[] T013U72_A9428SMCod ;
   private boolean[] T013U72_n9428SMCod ;
   private String[] T013U73_A407EmprNom ;
   private boolean[] T013U73_n407EmprNom ;
   private java.math.BigDecimal[] T013U75_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U75_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U77_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U77_A9441OMMCCosT ;
   private String[] T013U78_A9427OMMaqDsc ;
   private boolean[] T013U78_n9427OMMaqDsc ;
   private String[] T013U79_A13679OMMaqCodFo ;
   private boolean[] T013U79_n13679OMMaqCodFo ;
   private String[] T013U80_A9517SMDsc ;
   private boolean[] T013U80_n9517SMDsc ;
   private String[] T013U80_A396EmprCod ;
   private int[] T013U80_A9428SMCod ;
   private boolean[] T013U80_n9428SMCod ;
   private String[] T013U81_A396EmprCod ;
   private String[] T013U82_A396EmprCod ;
   private String[] T013U83_A14494OMTipoDc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV43OMMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46OMTipoId_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV49TMCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV31TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV32TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV36DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tmorden__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmorden__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmorden__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmorden__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmorden__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013U2", "SELECT OMCod, EmprCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?  FOR UPDATE OF OMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U3", "SELECT OMCod, EmprCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U4", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U5", "SELECT OMCod, EmprCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ?  FOR UPDATE OF OMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U6", "SELECT OMCod, EmprCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U7", "SELECT MaqEquDsc AS OMMEquDsc, MaqSEqDsc AS OMMSEqDsc, MaqPieDsc AS OMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U8", "SELECT OMCod, OMUsuCre, OMEst, OMTxt, OMFchPre, OMFchCre, OMNot, OMFchCer, OMPri, EmprCod, OMMaqCod, PMCod, SMCod, OMTipoId FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMUsuCre, OMEst, OMTxt, OMFchPre, OMFchCre, OMNot, OMFchCer, OMPri, OMMaqCod, PMCod, SMCod, OMTipoId NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U9", "SELECT OMCod, OMUsuCre, OMEst, OMTxt, OMFchPre, OMFchCre, OMNot, OMFchCer, OMPri, EmprCod, OMMaqCod, PMCod, SMCod, OMTipoId FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U11", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U12", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U13", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U14", "SELECT PMTipoDsc AS OMTipoDc FROM TXPTIPPRV WHERE EmprCod = ? AND PMTipoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U15", "SELECT COALESCE( MaqCodFor, '') AS OMMaqCodFo FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U17", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT, COALESCE( T1.OMRCCosT, 0) AS OMRCCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U19", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT, COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U20", "SELECT SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (EmprCod = ?) AND (SMCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U23", "SELECT /*+ FIRST_ROWS(100) */ T6.MaqCod, TM1.OMCod, TM1.OMUsuCre, TM1.OMEst, T2.EmprNom, T5.MaqDsc AS OMMaqDsc, TM1.OMTxt, TM1.OMFchPre, TM1.OMFchCre, TM1.OMNot, TM1.OMFchCer, TM1.OMPri, T7.PMTipoDsc AS OMTipoDc, TM1.EmprCod, TM1.OMMaqCod AS OMMaqCod, TM1.PMCod, TM1.SMCod, TM1.OMTipoId AS OMTipoId, COALESCE( T6.MaqCodFor, '') AS OMMaqCodFo, COALESCE( T3.OMRRCosT, 0) AS OMRRCosT, COALESCE( T3.OMRCCosT, 0) AS OMRCCosT, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT FROM ((((((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.OMCod = TM1.OMCod) LEFT JOIN (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) INNER JOIN TXPMAQUIN T5 ON T5.EmprCod = TM1.EmprCod AND T5.MaqCod = TM1.OMMaqCod) LEFT JOIN TXPMAQUIN T6 ON T6.EmprCod = TM1.EmprCod AND T6.MaqCod = TM1.OMMaqCod) LEFT JOIN TXPTIPPRV T7 ON T7.EmprCod = TM1.EmprCod AND T7.PMTipoID = TM1.OMTipoId) WHERE TM1.EmprCod = ? and TM1.OMCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U24", "SELECT SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (EmprCod = ?) AND (SMCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U25", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U26", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U28", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U29", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U30", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U31", "SELECT PMTipoDsc AS OMTipoDc FROM TXPTIPPRV WHERE EmprCod = ? AND PMTipoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U32", "SELECT COALESCE( MaqCodFor, '') AS OMMaqCodFo FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U34", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT, COALESCE( T1.OMRCCosT, 0) AS OMRCCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U36", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT, COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U37", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U38", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( EmprCod > ? or EmprCod = ? and OMCod > ?) ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U39", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( EmprCod < ? or EmprCod = ? and OMCod < ?) ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U40", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U41", "INSERT INTO TXPMORDEN(OMCod, OMUsuCre, OMEst, OMTxt, OMFchPre, OMFchCre, OMNot, OMFchCer, OMPri, EmprCod, OMMaqCod, PMCod, SMCod, OMTipoId, OMOpeRes) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T013U42", "UPDATE TXPMORDEN SET OMUsuCre=?, OMEst=?, OMTxt=?, OMFchPre=?, OMFchCre=?, OMNot=?, OMFchCer=?, OMPri=?, OMMaqCod=?, PMCod=?, SMCod=?, OMTipoId=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T013U43", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T013U44", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U46", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT, COALESCE( T1.OMRCCosT, 0) AS OMRCCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U48", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT, COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U49", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U50", "SELECT COALESCE( MaqCodFor, '') AS OMMaqCodFo FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U51", "SELECT PMTipoDsc AS OMTipoDc FROM TXPTIPPRV WHERE EmprCod = ? AND PMTipoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U52", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo FROM TXPMOrdeI WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U53", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U54", "SELECT * FROM (SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U55", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U56", "SELECT T2.MaqCod AS OMMaqCod, T1.OMCod, T2.MaqEquDsc AS OMMEquDsc, T2.MaqSEqDsc AS OMMSEqDsc, T2.MaqPieDsc AS OMMPieDsc, T1.EmprCod, T1.OMMEquCod AS OMMEquCod, T1.OMMSEqCod AS OMMSEqCod, T1.OMMPieCod AS OMMPieCod FROM (TXPMOrde1 T1 LEFT JOIN TXPMaqPie T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = ? AND T2.MaqEquCod = T1.OMMEquCod AND T2.MaqSEqCod = T1.OMMSEqCod AND T2.MaqPieCod = T1.OMMPieCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMMEquCod = ? and T1.OMMSEqCod = ? and T1.OMMPieCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMMEquCod, T1.OMMSEqCod, T1.OMMPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U57", "SELECT MaqEquDsc AS OMMEquDsc, MaqSEqDsc AS OMMSEqDsc, MaqPieDsc AS OMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U58", "SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U59", "INSERT INTO TXPMOrde1(OMCod, EmprCod, OMMEquCod, OMMSEqCod, OMMPieCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOrde1")
         ,new UpdateCursor("T013U60", "DELETE FROM TXPMOrde1  WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ?", GX_NOMASK, "TXPMOrde1")
         ,new ForEachCursor("T013U61", "SELECT MaqEquDsc AS OMMEquDsc, MaqSEqDsc AS OMMSEqDsc, MaqPieDsc AS OMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U62", "SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U63", "SELECT T1.OMCod, T2.TMDsc, T2.TMTxt, T1.EmprCod, T1.TMCod FROM (TXPMOrde2 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.TMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.TMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.TMCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U64", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U65", "SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U66", "INSERT INTO TXPMOrde2(OMCod, EmprCod, TMCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMOrde2")
         ,new UpdateCursor("T013U67", "DELETE FROM TXPMOrde2  WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?", GX_NOMASK, "TXPMOrde2")
         ,new ForEachCursor("T013U68", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U69", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo FROM TXPMOrdeI WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U70", "SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, TMCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U71", "SELECT * FROM (SELECT DISTINCT SMDsc FROM TXPMSOLIC WHERE (EmprCod = ?) AND (UPPER(SMDsc) like '%' || UPPER(?)) ORDER BY SMDsc) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U72", "SELECT SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U73", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U75", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT, COALESCE( T1.OMRCCosT, 0) AS OMRCCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U77", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT, COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U78", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U79", "SELECT COALESCE( MaqCodFor, '') AS OMMaqCodFo FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U80", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U81", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U82", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U83", "SELECT PMTipoDsc AS OMTipoDc FROM TXPTIPPRV WHERE EmprCod = ? AND PMTipoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[11])[0] = rslt.getVarchar(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((String[]) buf[15])[0] = rslt.getString(14, 3);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,3);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(22,3);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 28 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 38 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 53 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 64 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 65 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
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
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
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
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
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
            case 24 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setVarchar(4, (String)parms[3], 2000, false);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setVarchar(7, (String)parms[6], 2000, false);
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[16]).shortValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 2000, false);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 2000, false);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 6);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[14]).shortValue());
               }
               stmt.setString(13, (String)parms[15], 3);
               stmt.setInt(14, ((Number) parms[16]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 49 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 56 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
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
            case 70 :
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
            case 71 :
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

