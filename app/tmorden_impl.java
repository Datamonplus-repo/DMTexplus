package app ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_13U1233( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13749TMCDsc = httpContext.GetPar( "TMCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatmcod13U0( A396EmprCod, A13749TMCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"OMREPCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13718MRCNom = httpContext.GetPar( "MRCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaomrepcod13U0( A396EmprCod, A13718MRCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"OMOPECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaomopecod13U0( A396EmprCod, A13748OpeCNom) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13749TMCDsc = httpContext.GetPar( "TMCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatmcod13U0( A396EmprCod, A13749TMCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9430TMCod = httpContext.GetPar( "h9430TMCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatmcod13U1530( A396EmprCod, h9430TMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"OMREPCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13718MRCNom = httpContext.GetPar( "MRCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaomrepcod13U0( A396EmprCod, A13718MRCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"OMREPCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9446OMRepCod = httpContext.GetPar( "h9446OMRepCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaomrepcod13U1233( A396EmprCod, h9446OMRepCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"OMOPECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaomopecod13U0( A396EmprCod, A13748OpeCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"OMOPECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9455OMOpeCod = httpContext.GetPar( "h9455OMOpeCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaomopecod13U1234( A396EmprCod, h9455OMOpeCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_77") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_77( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_78") == 0 )
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
         gxload_78( A396EmprCod, A9426OMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_79") == 0 )
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
         gxload_79( A396EmprCod, A9429PMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_80") == 0 )
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
         gxload_80( A396EmprCod, A9428SMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_81") == 0 )
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
         gxload_81( A396EmprCod, A9426OMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_82") == 0 )
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
         gxload_82( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_83") == 0 )
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
         gxload_83( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_85") == 0 )
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
         gxload_85( A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_87") == 0 )
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
         gxload_87( A396EmprCod, A9430TMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_89") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9446OMRepCod = (int)(GXutil.lval( httpContext.GetPar( "OMRepCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_89( A396EmprCod, A9446OMRepCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_91") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_91( A396EmprCod, A9455OMOpeCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_tareas") == 0 )
      {
         gxnrgridlevel_tareas_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_operador") == 0 )
      {
         gxnrgridlevel_operador_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_repuesto") == 0 )
      {
         gxnrgridlevel_repuesto_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_equipos") == 0 )
      {
         gxnrgridlevel_equipos_newrow_invoke( ) ;
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

   public void gxnrgridlevel_tareas_newrow_invoke( )
   {
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
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

   public void gxnrgridlevel_operador_newrow_invoke( )
   {
      nRC_GXsfl_93 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_93"))) ;
      nGXsfl_93_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_93_idx"))) ;
      sGXsfl_93_idx = httpContext.GetPar( "sGXsfl_93_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV20Accion = httpContext.GetPar( "Accion") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_operador_newrow( ) ;
      /* End function gxnrGridlevel_operador_newrow_invoke */
   }

   public void gxnrgridlevel_repuesto_newrow_invoke( )
   {
      nRC_GXsfl_109 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_109"))) ;
      nGXsfl_109_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_109_idx"))) ;
      sGXsfl_109_idx = httpContext.GetPar( "sGXsfl_109_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV20Accion = httpContext.GetPar( "Accion") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_repuesto_newrow( ) ;
      /* End function gxnrGridlevel_repuesto_newrow_invoke */
   }

   public void gxnrgridlevel_equipos_newrow_invoke( )
   {
      nRC_GXsfl_121 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_121"))) ;
      nGXsfl_121_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_121_idx"))) ;
      sGXsfl_121_idx = httpContext.GetPar( "sGXsfl_121_idx") ;
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
      cmbOMMTpo = new HTMLChoice();
      cmbOMRTpo = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMCod_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedommaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockommaqcod_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblockommaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_ommaqcod.setProperty("Caption", Combo_ommaqcod_Caption);
      ucCombo_ommaqcod.setProperty("Cls", Combo_ommaqcod_Cls);
      ucCombo_ommaqcod.setProperty("EmptyItemText", Combo_ommaqcod_Emptyitemtext);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqCod_Visible, edtOMMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMFchPre_Internalname, httpContext.getMessage( "Fecha Prevista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOMFchPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchPre_Internalname, localUtil.format(A9438OMFchPre, "99/99/99"), localUtil.format( A9438OMFchPre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchPre_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrden.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbOMEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbOMEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMOrden.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCre_Internalname, localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9436OMFchCre, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrden.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMUsuCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMUsuCre_Internalname, httpContext.getMessage( "Usuario Creación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMUsuCre_Internalname, GXutil.rtrim( A9437OMUsuCre), GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMUsuCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchCer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMFchCer_Internalname, httpContext.getMessage( "Cerrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtOMFchCer_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCer_Internalname, localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9439OMFchCer, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchCer_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchCer_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCer_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrden.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSmcod_cell_Internalname, 1, 0, "px", 0, "px", divSmcod_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtSMCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMCod_Internalname, httpContext.getMessage( "Solicitud", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMCod_Internalname, GXutil.rtrim( h9428SMCod), GXutil.rtrim( localUtil.format( h9428SMCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtSMCod_Visible, edtSMCod_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TMOrden.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtPMCod_Visible, edtPMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
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
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtOMTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMTxt_Internalname, httpContext.getMessage( "Desc del Trabajo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOMTxt_Internalname, A9433OMTxt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", (short)(0), 1, edtOMTxt_Enabled, 1, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtOMNot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMNot_Internalname, httpContext.getMessage( "Nota", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOMNot_Internalname, A9464OMNot, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtOMNot_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TMOrden.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_operador_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_operador( ) ;
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
      app.GxWebStd.gx_div_start( httpContext, divTablerepuestooperador_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_repuesto_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_repuesto( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_equipos_Internalname, divTableleaflevel_equipos_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_equipos( ) ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrden.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_ommaqcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboommaqcod_Internalname, GXutil.rtrim( AV44ComboOMMaqCod), GXutil.rtrim( localUtil.format( AV44ComboOMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboommaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboommaqcod_Visible, edtavComboommaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCodFo_Internalname, GXutil.rtrim( A13679OMMaqCodFo), GXutil.rtrim( localUtil.format( A13679OMMaqCodFo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCodFo_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqCodFo_Visible, edtOMMaqCodFo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqDsc_Visible, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMDscMqPla_Internalname, GXutil.rtrim( A13678OMDscMqPla), GXutil.rtrim( localUtil.format( A13678OMDscMqPla, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMDscMqPla_Jsonclick, 0, "Attribute", "", "", "", "", edtOMDscMqPla_Visible, edtOMDscMqPla_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMDuracion_Internalname, A13680OMDuracion, GXutil.rtrim( localUtil.format( A13680OMDuracion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMDuracion_Jsonclick, 0, "Attribute", "", "", "", "", edtOMDuracion_Visible, edtOMDuracion_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCosRea_Internalname, GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCosRea_Enabled!=0) ? localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCosRea_Jsonclick, 0, "Attribute", "", "", "", "", edtOMCosRea_Visible, edtOMCosRea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRRCosT_Enabled!=0) ? localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999") : localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRRCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMRRCosT_Visible, edtOMRRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRCCosT_Enabled!=0) ? localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999") : localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRCCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMRCCosT_Visible, edtOMRCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMRCosT_Enabled!=0) ? localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999") : localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMRCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMRCosT_Visible, edtOMMRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMCCosT_Enabled!=0) ? localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999") : localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMCCosT_Visible, edtOMMCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrden.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_tareas( )
   {
      /*  Grid Control  */
      startgridcontrol85( ) ;
      nGXsfl_85_idx = 0 ;
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
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         standaloneNotModal13U1530( ) ;
         standaloneModal13U1530( ) ;
         sMode1530 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow13U1530( ) ;
            edtTMCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtTMDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMDSC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtTMTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMTXT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMTxt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_1530 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13U1530( ) ;
            }
            sendRow13U1530( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_851530( ) ;
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
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_851530( ) ;
         initAll13U1530( ) ;
         init_level_properties1530( ) ;
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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

   public void gxdraw_gridlevel_operador( )
   {
      /*  Grid Control  */
      startgridcontrol93( ) ;
      nGXsfl_93_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1234 = (short)(1) ;
            scanStart13U1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               init_level_properties1234( ) ;
               getByPrimaryKey13U1234( ) ;
               addRow13U1234( ) ;
               scanNext13U1234( ) ;
            }
            scanEnd13U1234( ) ;
            nBlankRcdCount1234 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         standaloneNotModal13U1234( ) ;
         standaloneModal13U1234( ) ;
         sMode1234 = Gx_mode ;
         while ( nGXsfl_93_idx < nRC_GXsfl_93 )
         {
            bGXsfl_93_Refreshing = true ;
            readRow13U1234( ) ;
            edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_93_Refreshing);
            edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtOMMRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCOS_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCos_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            if ( ( nRcdExists_1234 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13U1234( ) ;
            }
            sendRow13U1234( ) ;
            bGXsfl_93_Refreshing = false ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         nRcdExists_1234 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13U1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_931234( ) ;
               init_level_properties1234( ) ;
               standaloneNotModal13U1234( ) ;
               getByPrimaryKey13U1234( ) ;
               standaloneModal13U1234( ) ;
               addRow13U1234( ) ;
               scanNext13U1234( ) ;
            }
            scanEnd13U1234( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1234 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_931234( ) ;
         initAll13U1234( ) ;
         init_level_properties1234( ) ;
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         nRcdExists_1234 = (short)(0) ;
         nIsMod_1234 = (short)(0) ;
         nRcdDeleted_1234 = (short)(0) ;
         nBlankRcdCount1234 = (short)(nBlankRcdUsr1234+nBlankRcdCount1234) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1234 > 0 )
         {
            standaloneNotModal13U1234( ) ;
            standaloneModal13U1234( ) ;
            addRow13U1234( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOMOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1234 = (short)(nBlankRcdCount1234-1) ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_operadorContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_operador", Gridlevel_operadorContainer, subGridlevel_operador_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_operadorContainerData", Gridlevel_operadorContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_operadorContainerData"+"V", Gridlevel_operadorContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_operadorContainerData"+"V"+"\" value='"+Gridlevel_operadorContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridlevel_repuesto( )
   {
      /*  Grid Control  */
      startgridcontrol109( ) ;
      nGXsfl_109_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1233 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1233 = (short)(1) ;
            scanStart13U1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               init_level_properties1233( ) ;
               getByPrimaryKey13U1233( ) ;
               addRow13U1233( ) ;
               scanNext13U1233( ) ;
            }
            scanEnd13U1233( ) ;
            nBlankRcdCount1233 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         standaloneNotModal13U1233( ) ;
         standaloneModal13U1233( ) ;
         sMode1233 = Gx_mode ;
         while ( nGXsfl_109_idx < nRC_GXsfl_109 )
         {
            bGXsfl_109_Refreshing = true ;
            readRow13U1233( ) ;
            edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_109_Refreshing);
            edtOMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPNOM_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_109_Refreshing);
            cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_109_Refreshing);
            edtOMRepPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPPRE_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepPre_Enabled), 5, 0), !bGXsfl_109_Refreshing);
            edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_109_Refreshing);
            edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_109_Refreshing);
            edtOMRRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCOS_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCos_Enabled), 5, 0), !bGXsfl_109_Refreshing);
            if ( ( nRcdExists_1233 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13U1233( ) ;
            }
            sendRow13U1233( ) ;
            bGXsfl_109_Refreshing = false ;
         }
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1233 = (short)(5) ;
         nRcdExists_1233 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13U1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1091233( ) ;
               init_level_properties1233( ) ;
               standaloneNotModal13U1233( ) ;
               getByPrimaryKey13U1233( ) ;
               standaloneModal13U1233( ) ;
               addRow13U1233( ) ;
               scanNext13U1233( ) ;
            }
            scanEnd13U1233( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1233 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1091233( ) ;
         initAll13U1233( ) ;
         init_level_properties1233( ) ;
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         nRcdExists_1233 = (short)(0) ;
         nIsMod_1233 = (short)(0) ;
         nRcdDeleted_1233 = (short)(0) ;
         nBlankRcdCount1233 = (short)(nBlankRcdUsr1233+nBlankRcdCount1233) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1233 > 0 )
         {
            standaloneNotModal13U1233( ) ;
            standaloneModal13U1233( ) ;
            addRow13U1233( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOMRepCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1233 = (short)(nBlankRcdCount1233-1) ;
         }
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_repuestoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_repuesto", Gridlevel_repuestoContainer, subGridlevel_repuesto_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_repuestoContainerData", Gridlevel_repuestoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_repuestoContainerData"+"V", Gridlevel_repuestoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_repuestoContainerData"+"V"+"\" value='"+Gridlevel_repuestoContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridlevel_equipos( )
   {
      /*  Grid Control  */
      startgridcontrol121( ) ;
      nGXsfl_121_idx = 0 ;
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
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         standaloneNotModal13U1531( ) ;
         standaloneModal13U1531( ) ;
         sMode1531 = Gx_mode ;
         while ( nGXsfl_121_idx < nRC_GXsfl_121 )
         {
            bGXsfl_121_Refreshing = true ;
            readRow13U1531( ) ;
            edtOMMEquCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQUCOD_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
            edtOMMEquDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQUDSC_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMEquDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquDsc_Enabled), 5, 0), !bGXsfl_121_Refreshing);
            edtOMMSEqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSEQCOD_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
            edtOMMSEqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSEQDSC_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqDsc_Enabled), 5, 0), !bGXsfl_121_Refreshing);
            edtOMMPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIECOD_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
            edtOMMPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIEDSC_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieDsc_Enabled), 5, 0), !bGXsfl_121_Refreshing);
            if ( ( nRcdExists_1531 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13U1531( ) ;
            }
            sendRow13U1531( ) ;
            bGXsfl_121_Refreshing = false ;
         }
         Gx_mode = sMode1531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
               sGXsfl_121_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_121_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1211531( ) ;
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
         sGXsfl_121_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_121_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1211531( ) ;
         initAll13U1531( ) ;
         init_level_properties1531( ) ;
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         B9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = B9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = B9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9437OMUsuCre = httpContext.cgiGet( "Z9437OMUsuCre") ;
            Z9433OMTxt = httpContext.cgiGet( "Z9433OMTxt") ;
            Z9438OMFchPre = localUtil.ctod( httpContext.cgiGet( "Z9438OMFchPre"), 0) ;
            Z9436OMFchCre = localUtil.ctot( httpContext.cgiGet( "Z9436OMFchCre"), 0) ;
            Z9445OMEst = httpContext.cgiGet( "Z9445OMEst") ;
            Z9464OMNot = httpContext.cgiGet( "Z9464OMNot") ;
            Z9439OMFchCer = localUtil.ctot( httpContext.cgiGet( "Z9439OMFchCer"), 0) ;
            Z9426OMMaqCod = httpContext.cgiGet( "Z9426OMMaqCod") ;
            Z9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9428SMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( "O9441OMMCCosT")) ;
            O9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( "O9442OMMRCosT")) ;
            O9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( "O9443OMRCCosT")) ;
            O9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( "O9444OMRRCosT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_121 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_121"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_93 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_93"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9426OMMaqCod = httpContext.cgiGet( "N9426OMMaqCod") ;
            N9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "N9428SMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "N9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV14OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Insert_OMMaqCod = httpContext.cgiGet( "vINSERT_OMMAQCOD") ;
            AV20Accion = httpContext.cgiGet( "vACCION") ;
            AV28Insert_SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_SMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCSMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Insert_PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCTMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( "OMRCCNT")) ;
            A9453OMRCPre = localUtil.ctond( httpContext.cgiGet( "OMRCPRE")) ;
            A9454OMRCCos = localUtil.ctond( httpContext.cgiGet( "OMRCCOS")) ;
            AV16oOMRRCnt = localUtil.ctond( httpContext.cgiGet( "vOOMRRCNT")) ;
            AV19nOMRRCnt = localUtil.ctond( httpContext.cgiGet( "vNOMRRCNT")) ;
            AV29ServerNow = localUtil.ctot( httpContext.cgiGet( "vSERVERNOW"), 0) ;
            A9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCOMREPCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18MTMovNom = httpContext.cgiGet( "vMTMOVNOM") ;
            AV17MTMovCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMTMOVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( "OMMCCNT")) ;
            A9462OMMCPre = localUtil.ctond( httpContext.cgiGet( "OMMCPRE")) ;
            A9463OMMCCos = localUtil.ctond( httpContext.cgiGet( "OMMCCOS")) ;
            A9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCOMOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_ommaqcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_OMMAQCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_tabletextonota_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLETEXTONOTA_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
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
            A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
            A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
            A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
            A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
            AV44ComboOMMaqCod = httpContext.cgiGet( edtavComboommaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44ComboOMMaqCod", AV44ComboOMMaqCod);
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
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrden");
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A9437OMUsuCre = httpContext.cgiGet( edtOMUsuCre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
            forbiddenHiddens.add("OMUsuCre", GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")));
            A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("OMFchCre", localUtil.format( A9436OMFchCre, "99/99/99 99:99"));
            A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("OMFchCer", localUtil.format( A9439OMFchCer, "99/99/99 99:99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmorden:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
            /* Check if conditions changed and reset current page numbers */
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
      httpContext.ajax_rsp_assign_prop("", false, edtavComboommaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboommaqcod_Enabled), 5, 0), true);
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
               confirm_13U1233( ) ;
               if ( AnyError == 0 )
               {
                  confirm_13U1234( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Restore parent mode. */
                     Gx_mode = sMode1232 ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     IsConfirmed = (short)(1) ;
                     httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                  }
               }
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13U1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      s9442OMMRCosT = O9442OMMRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_93_idx = 0 ;
      while ( nGXsfl_93_idx < nRC_GXsfl_93 )
      {
         readRow13U1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            getKey13U1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               if ( RcdFound1234 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13U1234( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13U1234( ) ;
                     closeExtendedTableCursors13U1234( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9441OMMCCosT = A9441OMMCCosT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                     O9442OMMRCosT = A9442OMMRCosT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                     O9440OMCosRea = A9440OMCosRea ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMOPECOD_" + sGXsfl_93_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( nRcdDeleted_1234 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13U1234( ) ;
                     load13U1234( ) ;
                     beforeValidate13U1234( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13U1234( ) ;
                        O9441OMMCCosT = A9441OMMCCosT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                        O9442OMMRCosT = A9442OMMRCosT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                        O9440OMCosRea = A9440OMCosRea ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13U1234( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13U1234( ) ;
                           closeExtendedTableCursors13U1234( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9441OMMCCosT = A9441OMMCCosT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                           O9442OMMRCosT = A9442OMMRCosT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                           O9440OMCosRea = A9440OMCosRea ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_93_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMOpeCod_Internalname, h9455OMOpeCod) ;
         httpContext.changePostValue( edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom)) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_93_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9472OMMRCos_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( O9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCOS_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9441OMMCCosT = s9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      O9442OMMRCosT = s9442OMMRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      O9440OMCosRea = s9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13U1233( )
   {
      s9443OMRCCosT = O9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      s9444OMRRCosT = O9444OMRRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_109_idx = 0 ;
      while ( nGXsfl_109_idx < nRC_GXsfl_109 )
      {
         readRow13U1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            getKey13U1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               if ( RcdFound1233 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13U1233( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13U1233( ) ;
                     closeExtendedTableCursors13U1233( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9443OMRCCosT = A9443OMRCCosT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                     O9444OMRRCosT = A9444OMRRCosT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                     O9440OMCosRea = A9440OMCosRea ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMREPCOD_" + sGXsfl_109_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMRepCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1233 != 0 )
               {
                  if ( nRcdDeleted_1233 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13U1233( ) ;
                     load13U1233( ) ;
                     beforeValidate13U1233( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13U1233( ) ;
                        O9443OMRCCosT = A9443OMRCCosT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                        O9444OMRRCosT = A9444OMRRCosT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                        O9440OMCosRea = A9440OMCosRea ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13U1233( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13U1233( ) ;
                           closeExtendedTableCursors13U1233( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9443OMRCCosT = A9443OMRCCosT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                           O9444OMRRCosT = A9444OMRRCosT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                           O9440OMCosRea = A9440OMCosRea ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_109_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMRepCod_Internalname, h9446OMRepCod) ;
         httpContext.changePostValue( edtOMRepNom_Internalname, GXutil.rtrim( A9447OMRepNom)) ;
         httpContext.changePostValue( cmbOMRTpo.getInternalname(), GXutil.rtrim( A9449OMRTpo)) ;
         httpContext.changePostValue( edtOMRepPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_109_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9450OMRRCnt_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9454OMRCCos_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( O9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9471OMRRCos_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPNOM_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPPRE_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCOS_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9443OMRCCosT = s9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      O9444OMRRCosT = s9444OMRRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      O9440OMCosRea = s9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13U1530( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
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
                  GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
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
                     GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMCod_Internalname, h9430TMCod) ;
         httpContext.changePostValue( edtTMDsc_Internalname, GXutil.rtrim( A9431TMDsc)) ;
         httpContext.changePostValue( edtTMTxt_Internalname, A9432TMTxt) ;
         httpContext.changePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1530_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1530_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1530_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1530 != 0 )
         {
            httpContext.changePostValue( "TMCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMTXT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13U1531( )
   {
      nGXsfl_121_idx = 0 ;
      while ( nGXsfl_121_idx < nRC_GXsfl_121 )
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
                  GXCCtl = "OMMEQUCOD_" + sGXsfl_121_idx ;
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
                     GXCCtl = "OMMEQUCOD_" + sGXsfl_121_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMMEquCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMMEquCod_Internalname, GXutil.rtrim( A11446OMMEquCod)) ;
         httpContext.changePostValue( edtOMMEquDsc_Internalname, GXutil.rtrim( A12599OMMEquDsc)) ;
         httpContext.changePostValue( edtOMMSEqCod_Internalname, GXutil.rtrim( A11447OMMSEqCod)) ;
         httpContext.changePostValue( edtOMMSEqDsc_Internalname, GXutil.rtrim( A12600OMMSEqDsc)) ;
         httpContext.changePostValue( edtOMMPieCod_Internalname, GXutil.rtrim( A11448OMMPieCod)) ;
         httpContext.changePostValue( edtOMMPieDsc_Internalname, GXutil.rtrim( A11449OMMPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_121_idx, GXutil.rtrim( Z11446OMMEquCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_121_idx, GXutil.rtrim( Z11447OMMSEqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_121_idx, GXutil.rtrim( Z11448OMMPieCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1531_"+sGXsfl_121_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1531_"+sGXsfl_121_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1531_"+sGXsfl_121_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1531 != 0 )
         {
            httpContext.changePostValue( "OMMEQUCOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMEQUDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSEQCOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSEQDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIECOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIEDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
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
         pr_default.close(20);
         pr_default.close(19);
         pr_default.close(18);
         pr_default.close(17);
         pr_default.close(16);
         pr_default.close(15);
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(11);
         pr_default.close(10);
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
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(20);
         pr_default.close(19);
         pr_default.close(18);
         pr_default.close(17);
         pr_default.close(16);
         pr_default.close(15);
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(11);
         pr_default.close(10);
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
      if ( ( GXutil.strcmp(AV31TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV46Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV47GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GXV1), 8, 0));
         while ( AV47GXV1 <= AV31TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV32TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV31TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV47GXV1));
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
            AV47GXV1 = (int)(AV47GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GXV1), 8, 0));
         }
      }
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
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmorden_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV42ObtenerEmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmorden_impl.this.AV42ObtenerEmprCod = GXv_char4[0] ;
      tmorden_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmorden_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ObtenerEmprCod", AV42ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_char4[0] = AV24EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int8[0] = AV17MTMovCod ;
      GXv_char2[0] = AV18MTMovNom ;
      new app.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_char2) ;
      tmorden_impl.this.AV24EmprCod = GXv_char4[0] ;
      tmorden_impl.this.AV17MTMovCod = GXv_int8[0] ;
      tmorden_impl.this.AV18MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
   }

   public void e1213U2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV31TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmordenww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(20);
      pr_default.close(19);
      pr_default.close(18);
      pr_default.close(17);
      pr_default.close(16);
      pr_default.close(15);
      pr_default.close(14);
      pr_default.close(13);
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtSMCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Visible), 5, 0), true);
      divSmcod_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divSmcod_cell_Internalname, "Class", divSmcod_cell_Class, true);
      edtPMCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Visible), 5, 0), true);
      divPmcod_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divPmcod_cell_Internalname, "Class", divPmcod_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOOMMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = AV43OMMaqCod_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item10[0] = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
      new app.tmordenloaddvcombo(remoteHandle, context).execute( "OMMaqCod", Gx_mode, AV24EmprCod, AV14OMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item10) ;
      tmorden_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = GXv_objcol_SdtDVB_SDTComboData_Item10[0] ;
      AV43OMMaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
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
      if ( ( GX_JID == 76 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9437OMUsuCre = T013U15_A9437OMUsuCre[0] ;
            Z9433OMTxt = T013U15_A9433OMTxt[0] ;
            Z9438OMFchPre = T013U15_A9438OMFchPre[0] ;
            Z9436OMFchCre = T013U15_A9436OMFchCre[0] ;
            Z9445OMEst = T013U15_A9445OMEst[0] ;
            Z9464OMNot = T013U15_A9464OMNot[0] ;
            Z9439OMFchCer = T013U15_A9439OMFchCer[0] ;
            Z9426OMMaqCod = T013U15_A9426OMMaqCod[0] ;
            Z9429PMCod = T013U15_A9429PMCod[0] ;
            Z9428SMCod = T013U15_A9428SMCod[0] ;
         }
         else
         {
            Z9437OMUsuCre = A9437OMUsuCre ;
            Z9433OMTxt = A9433OMTxt ;
            Z9438OMFchPre = A9438OMFchPre ;
            Z9436OMFchCre = A9436OMFchCre ;
            Z9445OMEst = A9445OMEst ;
            Z9464OMNot = A9464OMNot ;
            Z9439OMFchCer = A9439OMFchCer ;
            Z9426OMMaqCod = A9426OMMaqCod ;
            Z9429PMCod = A9429PMCod ;
            Z9428SMCod = A9428SMCod ;
         }
      }
      if ( GX_JID == -76 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9437OMUsuCre = A9437OMUsuCre ;
         Z9433OMTxt = A9433OMTxt ;
         Z9438OMFchPre = A9438OMFchPre ;
         Z9436OMFchCre = A9436OMFchCre ;
         Z9445OMEst = A9445OMEst ;
         Z9464OMNot = A9464OMNot ;
         Z9439OMFchCer = A9439OMFchCer ;
         Z396EmprCod = A396EmprCod ;
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z9429PMCod = A9429PMCod ;
         Z9428SMCod = A9428SMCod ;
         Z407EmprNom = A407EmprNom ;
         Z9444OMRRCosT = A9444OMRRCosT ;
         Z9443OMRCCosT = A9443OMRCCosT ;
         Z9442OMMRCosT = A9442OMMRCosT ;
         Z9441OMMCCosT = A9441OMMCCosT ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z13679OMMaqCodFo = A13679OMMaqCodFo ;
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
            divSmcod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
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
            divPmcod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divPmcod_cell_Internalname, "Class", divPmcod_cell_Class, true);
         }
      }
      divTableleaflevel_equipos_Visible = (((0>1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableleaflevel_equipos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableleaflevel_equipos_Visible), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      edtOMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Enabled), 5, 0), true);
      AV46Pgmname = "TMOrden" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      edtOMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Enabled), 5, 0), true);
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
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
      {
         edtOMTxt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      }
      else
      {
         edtOMTxt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
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
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( "C", "")) == 0 )
      {
         edtOMTxt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
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
         /* Using cursor T013U25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         h9428SMCod = "" ;
         while ( (pr_default.getStatus(21) != 101) )
         {
            h9428SMCod = T013U25_A9517SMDsc[0] ;
            n9517SMDsc = T013U25_n9517SMDsc[0] ;
            if (true) break;
         }
         pr_default.close(21);
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
         /* Using cursor T013U16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T013U16_A407EmprNom[0] ;
         n407EmprNom = T013U16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
         /* Using cursor T013U17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A9426OMMaqCod});
         A9427OMMaqDsc = T013U17_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013U17_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         pr_default.close(15);
         /* Using cursor T013U20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A9426OMMaqCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            A13679OMMaqCodFo = T013U20_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = T013U20_n13679OMMaqCodFo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         else
         {
            A13679OMMaqCodFo = "" ;
            n13679OMMaqCodFo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         pr_default.close(18);
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
         /* Using cursor T013U22 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A9444OMRRCosT = T013U22_A9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = T013U22_A9443OMRCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         O9444OMRRCosT = A9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         O9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         pr_default.close(19);
         /* Using cursor T013U24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            A9442OMMRCosT = T013U24_A9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = T013U24_A9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         O9442OMMRCosT = A9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         O9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         pr_default.close(20);
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
      }
   }

   public void load13U1232( )
   {
      /* Using cursor T013U28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9437OMUsuCre = T013U28_A9437OMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
         A407EmprNom = T013U28_A407EmprNom[0] ;
         n407EmprNom = T013U28_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9427OMMaqDsc = T013U28_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013U28_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         A9433OMTxt = T013U28_A9433OMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
         A9438OMFchPre = T013U28_A9438OMFchPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
         A9436OMFchCre = T013U28_A9436OMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9445OMEst = T013U28_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9464OMNot = T013U28_A9464OMNot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
         A9439OMFchCer = T013U28_A9439OMFchCer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9426OMMaqCod = T013U28_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9429PMCod = T013U28_A9429PMCod[0] ;
         n9429PMCod = T013U28_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9428SMCod = T013U28_A9428SMCod[0] ;
         n9428SMCod = T013U28_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A13679OMMaqCodFo = T013U28_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U28_n13679OMMaqCodFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         A9444OMRRCosT = T013U28_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = T013U28_A9443OMRCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9442OMMRCosT = T013U28_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = T013U28_A9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         zm13U1232( -76) ;
      }
      pr_default.close(22);
      onLoadActions13U1232( ) ;
   }

   public void onLoadActions13U1232( )
   {
      O9441OMMCCosT = A9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      O9442OMMRCosT = A9442OMMRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      O9443OMRCCosT = A9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      O9444OMRRCosT = A9444OMRRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
      /* Using cursor T013U29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      h9428SMCod = "" ;
      while ( (pr_default.getStatus(23) != 101) )
      {
         h9428SMCod = T013U29_A9517SMDsc[0] ;
         n9517SMDsc = T013U29_n9517SMDsc[0] ;
         if (true) break;
      }
      pr_default.close(23);
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
         /* Using cursor T013U30 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
         A396EmprCod = T013U30_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013U30_A9428SMCod[0] ;
         n9428SMCod = T013U30_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A9428SMCod = T013U30_A9428SMCod[0] ;
         n9428SMCod = T013U30_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         if ( ! ( (pr_default.getStatus(24) == 101) ) )
         {
            pr_default.readNext(24);
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
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
         pr_default.close(24);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  && ( GXutil.strcmp(AV20Accion, httpContext.getMessage( "C", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, no se permite modificar", ""), 1, "");
         AnyError = (short)(1) ;
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
         /* Using cursor T013U31 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
         A396EmprCod = T013U31_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013U31_A9428SMCod[0] ;
         n9428SMCod = T013U31_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A9428SMCod = T013U31_A9428SMCod[0] ;
         n9428SMCod = T013U31_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         if ( ! ( (pr_default.getStatus(25) == 101) ) )
         {
            pr_default.readNext(25);
            if ( ! ( (pr_default.getStatus(25) == 101) ) )
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
         pr_default.close(25);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      /* Using cursor T013U16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013U16_A407EmprNom[0] ;
      n407EmprNom = T013U16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T013U17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9427OMMaqDsc = T013U17_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013U17_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      pr_default.close(15);
      /* Using cursor T013U18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(16);
      /* Using cursor T013U19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (0==A9428SMCod) && (GXutil.strcmp("", A9517SMDsc)==0) || (0==A9428SMCod) && n9428SMCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(17);
      /* Using cursor T013U20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A13679OMMaqCodFo = T013U20_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U20_n13679OMMaqCodFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A13679OMMaqCodFo = "" ;
         n13679OMMaqCodFo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      pr_default.close(18);
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
      /* Using cursor T013U22 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A9444OMRRCosT = T013U22_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = T013U22_A9443OMRCCosT[0] ;
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
      pr_default.close(19);
      /* Using cursor T013U24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A9442OMMRCosT = T013U24_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = T013U24_A9441OMMCCosT[0] ;
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
      pr_default.close(20);
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
   }

   public void closeExtendedTableCursors13U1232( )
   {
      pr_default.close(14);
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
   }

   public void enableDisable( )
   {
   }

   public void gxload_77( String A396EmprCod )
   {
      /* Using cursor T013U32 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013U32_A407EmprNom[0] ;
      n407EmprNom = T013U32_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void gxload_78( String A396EmprCod ,
                          String A9426OMMaqCod )
   {
      /* Using cursor T013U33 */
      pr_default.execute(27, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9427OMMaqDsc = T013U33_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013U33_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9427OMMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void gxload_79( String A396EmprCod ,
                          int A9429PMCod )
   {
      /* Using cursor T013U34 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(28) == 101) )
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
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void gxload_80( String A396EmprCod ,
                          int A9428SMCod )
   {
      /* Using cursor T013U35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(29) == 101) )
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
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void gxload_81( String A396EmprCod ,
                          String A9426OMMaqCod )
   {
      /* Using cursor T013U36 */
      pr_default.execute(30, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(30) != 101) )
      {
         A13679OMMaqCodFo = T013U36_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U36_n13679OMMaqCodFo[0] ;
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
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void gxload_82( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T013U38 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         A9444OMRRCosT = T013U38_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = T013U38_A9443OMRCCosT[0] ;
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
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void gxload_83( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T013U40 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         A9442OMMRCosT = T013U40_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = T013U40_A9441OMMCCosT[0] ;
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
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void getKey13U1232( )
   {
      /* Using cursor T013U41 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      else
      {
         RcdFound1232 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013U15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         zm13U1232( 76) ;
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T013U15_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9437OMUsuCre = T013U15_A9437OMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
         A9433OMTxt = T013U15_A9433OMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
         A9438OMFchPre = T013U15_A9438OMFchPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
         A9436OMFchCre = T013U15_A9436OMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9445OMEst = T013U15_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9464OMNot = T013U15_A9464OMNot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
         A9439OMFchCer = T013U15_A9439OMFchCer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A396EmprCod = T013U15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = T013U15_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9429PMCod = T013U15_A9429PMCod[0] ;
         n9429PMCod = T013U15_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9428SMCod = T013U15_A9428SMCod[0] ;
         n9428SMCod = T013U15_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
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
      pr_default.close(13);
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
      /* Using cursor T013U42 */
      pr_default.execute(34, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         while ( (pr_default.getStatus(34) != 101) && ( ( GXutil.strcmp(T013U42_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013U42_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U42_A9425OMCod[0] < A9425OMCod ) ) )
         {
            pr_default.readNext(34);
         }
         if ( (pr_default.getStatus(34) != 101) && ( ( GXutil.strcmp(T013U42_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013U42_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U42_A9425OMCod[0] > A9425OMCod ) ) )
         {
            A396EmprCod = T013U42_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9425OMCod = T013U42_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(34);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T013U43 */
      pr_default.execute(35, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         while ( (pr_default.getStatus(35) != 101) && ( ( GXutil.strcmp(T013U43_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013U43_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U43_A9425OMCod[0] > A9425OMCod ) ) )
         {
            pr_default.readNext(35);
         }
         if ( (pr_default.getStatus(35) != 101) && ( ( GXutil.strcmp(T013U43_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013U43_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013U43_A9425OMCod[0] < A9425OMCod ) ) )
         {
            A396EmprCod = T013U43_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9425OMCod = T013U43_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(35);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13U1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9443OMRCCosT = O9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = O9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         A9441OMMCCosT = O9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = O9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
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
               A9443OMRCCosT = O9443OMRCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               A9444OMRRCosT = O9444OMRRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               A9441OMMCCosT = O9441OMMCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               A9442OMMRCosT = O9442OMMRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOMMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A9443OMRCCosT = O9443OMRCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               A9444OMRRCosT = O9444OMRRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               A9441OMMCCosT = O9441OMMCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               A9442OMMRCosT = O9442OMMRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
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
               A9443OMRCCosT = O9443OMRCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               A9444OMRRCosT = O9444OMRRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               A9441OMMCCosT = O9441OMMCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               A9442OMMRCosT = O9442OMMRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
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
                  A9443OMRCCosT = O9443OMRCCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                  A9444OMRRCosT = O9444OMRRCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                  A9440OMCosRea = O9440OMCosRea ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                  A9441OMMCCosT = O9441OMMCCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                  A9442OMMRCosT = O9442OMMRCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                  A9440OMCosRea = O9440OMCosRea ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
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
         A9443OMRCCosT = O9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = O9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         A9441OMMCCosT = O9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = O9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
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
            /* Using cursor T013U44 */
            pr_default.execute(36, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
            A396EmprCod = T013U44_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9428SMCod = T013U44_A9428SMCod[0] ;
            n9428SMCod = T013U44_n9428SMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            A9428SMCod = T013U44_A9428SMCod[0] ;
            n9428SMCod = T013U44_n9428SMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            if ( ! ( (pr_default.getStatus(36) == 101) ) )
            {
               pr_default.readNext(36);
               if ( ! ( (pr_default.getStatus(36) == 101) ) )
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
            pr_default.close(36);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T013U14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(12) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(12) == 101) || ( GXutil.strcmp(Z9437OMUsuCre, T013U14_A9437OMUsuCre[0]) != 0 ) || ( GXutil.strcmp(Z9433OMTxt, T013U14_A9433OMTxt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9438OMFchPre), GXutil.resetTime(T013U14_A9438OMFchPre[0])) ) || !( GXutil.dateCompare(Z9436OMFchCre, T013U14_A9436OMFchCre[0]) ) || ( GXutil.strcmp(Z9445OMEst, T013U14_A9445OMEst[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9464OMNot, T013U14_A9464OMNot[0]) != 0 ) || !( GXutil.dateCompare(Z9439OMFchCer, T013U14_A9439OMFchCer[0]) ) || ( GXutil.strcmp(Z9426OMMaqCod, T013U14_A9426OMMaqCod[0]) != 0 ) || ( Z9429PMCod != T013U14_A9429PMCod[0] ) || ( Z9428SMCod != T013U14_A9428SMCod[0] ) )
         {
            if ( GXutil.strcmp(Z9437OMUsuCre, T013U14_A9437OMUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMUsuCre");
               GXutil.writeLogRaw("Old: ",Z9437OMUsuCre);
               GXutil.writeLogRaw("Current: ",T013U14_A9437OMUsuCre[0]);
            }
            if ( GXutil.strcmp(Z9433OMTxt, T013U14_A9433OMTxt[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMTxt");
               GXutil.writeLogRaw("Old: ",Z9433OMTxt);
               GXutil.writeLogRaw("Current: ",T013U14_A9433OMTxt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9438OMFchPre), GXutil.resetTime(T013U14_A9438OMFchPre[0])) ) )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMFchPre");
               GXutil.writeLogRaw("Old: ",Z9438OMFchPre);
               GXutil.writeLogRaw("Current: ",T013U14_A9438OMFchPre[0]);
            }
            if ( !( GXutil.dateCompare(Z9436OMFchCre, T013U14_A9436OMFchCre[0]) ) )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMFchCre");
               GXutil.writeLogRaw("Old: ",Z9436OMFchCre);
               GXutil.writeLogRaw("Current: ",T013U14_A9436OMFchCre[0]);
            }
            if ( GXutil.strcmp(Z9445OMEst, T013U14_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T013U14_A9445OMEst[0]);
            }
            if ( GXutil.strcmp(Z9464OMNot, T013U14_A9464OMNot[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMNot");
               GXutil.writeLogRaw("Old: ",Z9464OMNot);
               GXutil.writeLogRaw("Current: ",T013U14_A9464OMNot[0]);
            }
            if ( !( GXutil.dateCompare(Z9439OMFchCer, T013U14_A9439OMFchCer[0]) ) )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMFchCer");
               GXutil.writeLogRaw("Old: ",Z9439OMFchCer);
               GXutil.writeLogRaw("Current: ",T013U14_A9439OMFchCer[0]);
            }
            if ( GXutil.strcmp(Z9426OMMaqCod, T013U14_A9426OMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9426OMMaqCod);
               GXutil.writeLogRaw("Current: ",T013U14_A9426OMMaqCod[0]);
            }
            if ( Z9429PMCod != T013U14_A9429PMCod[0] )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"PMCod");
               GXutil.writeLogRaw("Old: ",Z9429PMCod);
               GXutil.writeLogRaw("Current: ",T013U14_A9429PMCod[0]);
            }
            if ( Z9428SMCod != T013U14_A9428SMCod[0] )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"SMCod");
               GXutil.writeLogRaw("Old: ",Z9428SMCod);
               GXutil.writeLogRaw("Current: ",T013U14_A9428SMCod[0]);
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
                  /* Using cursor T013U45 */
                  pr_default.execute(37, new Object[] {Integer.valueOf(A9425OMCod), A9437OMUsuCre, A9433OMTxt, A9438OMFchPre, A9436OMFchCre, A9445OMEst, A9464OMNot, A9439OMFchCer, A396EmprCod, A9426OMMaqCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(37) == 1) )
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
                  /* Using cursor T013U46 */
                  pr_default.execute(38, new Object[] {A9437OMUsuCre, A9433OMTxt, A9438OMFchPre, A9436OMFchCre, A9445OMEst, A9464OMNot, A9439OMFchCer, A9426OMMaqCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod), A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(38) == 103) )
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
               A9443OMRCCosT = O9443OMRCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               A9444OMRRCosT = O9444OMRRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               scanStart13U1233( ) ;
               while ( RcdFound1233 != 0 )
               {
                  getByPrimaryKey13U1233( ) ;
                  delete13U1233( ) ;
                  scanNext13U1233( ) ;
                  O9443OMRCCosT = A9443OMRCCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                  O9444OMRRCosT = A9444OMRRCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                  O9440OMCosRea = A9440OMCosRea ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               }
               scanEnd13U1233( ) ;
               scanStart13U1530( ) ;
               while ( RcdFound1530 != 0 )
               {
                  getByPrimaryKey13U1530( ) ;
                  delete13U1530( ) ;
                  scanNext13U1530( ) ;
               }
               scanEnd13U1530( ) ;
               A9441OMMCCosT = O9441OMMCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               A9442OMMRCosT = O9442OMMRCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               scanStart13U1234( ) ;
               while ( RcdFound1234 != 0 )
               {
                  getByPrimaryKey13U1234( ) ;
                  delete13U1234( ) ;
                  scanNext13U1234( ) ;
                  O9441OMMCCosT = A9441OMMCCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                  O9442OMMRCosT = A9442OMMRCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                  O9440OMCosRea = A9440OMCosRea ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               }
               scanEnd13U1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U47 */
                  pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
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
         if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  && ( GXutil.strcmp(AV20Accion, httpContext.getMessage( "C", "")) != 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, no se permite modificar", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T013U48 */
         pr_default.execute(40, new Object[] {A396EmprCod});
         A407EmprNom = T013U48_A407EmprNom[0] ;
         n407EmprNom = T013U48_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(40);
         /* Using cursor T013U50 */
         pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            A9444OMRRCosT = T013U50_A9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = T013U50_A9443OMRCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         pr_default.close(41);
         /* Using cursor T013U52 */
         pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            A9442OMMRCosT = T013U52_A9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = T013U52_A9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         pr_default.close(42);
         /* Using cursor T013U53 */
         pr_default.execute(43, new Object[] {A396EmprCod, A9426OMMaqCod});
         A9427OMMaqDsc = T013U53_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013U53_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         pr_default.close(43);
         /* Using cursor T013U54 */
         pr_default.execute(44, new Object[] {A396EmprCod, A9426OMMaqCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            A13679OMMaqCodFo = T013U54_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = T013U54_n13679OMMaqCodFo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         else
         {
            A13679OMMaqCodFo = "" ;
            n13679OMMaqCodFo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         }
         pr_default.close(44);
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
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013U55 */
         pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Asignacion de las piezas a realizar la Tarea", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T013U56 */
         pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
      }
   }

   public void processNestedLevel13U1531( )
   {
      nGXsfl_121_idx = 0 ;
      while ( nGXsfl_121_idx < nRC_GXsfl_121 )
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
                     GXCCtl = "OMMEQUCOD_" + sGXsfl_121_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMMEquCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMMEquCod_Internalname, GXutil.rtrim( A11446OMMEquCod)) ;
         httpContext.changePostValue( edtOMMEquDsc_Internalname, GXutil.rtrim( A12599OMMEquDsc)) ;
         httpContext.changePostValue( edtOMMSEqCod_Internalname, GXutil.rtrim( A11447OMMSEqCod)) ;
         httpContext.changePostValue( edtOMMSEqDsc_Internalname, GXutil.rtrim( A12600OMMSEqDsc)) ;
         httpContext.changePostValue( edtOMMPieCod_Internalname, GXutil.rtrim( A11448OMMPieCod)) ;
         httpContext.changePostValue( edtOMMPieDsc_Internalname, GXutil.rtrim( A11449OMMPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_121_idx, GXutil.rtrim( Z11446OMMEquCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_121_idx, GXutil.rtrim( Z11447OMMSEqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_121_idx, GXutil.rtrim( Z11448OMMPieCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1531_"+sGXsfl_121_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1531_"+sGXsfl_121_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1531_"+sGXsfl_121_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1531 != 0 )
         {
            httpContext.changePostValue( "OMMEQUCOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMEQUDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSEQCOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMSEQDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIECOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMPIEDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
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
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
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
                     GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMCod_Internalname, h9430TMCod) ;
         httpContext.changePostValue( edtTMDsc_Internalname, GXutil.rtrim( A9431TMDsc)) ;
         httpContext.changePostValue( edtTMTxt_Internalname, A9432TMTxt) ;
         httpContext.changePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1530_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1530_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1530_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1530 != 0 )
         {
            httpContext.changePostValue( "TMCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMTXT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
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

   public void processNestedLevel13U1233( )
   {
      s9443OMRCCosT = O9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      s9444OMRRCosT = O9444OMRRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_109_idx = 0 ;
      while ( nGXsfl_109_idx < nRC_GXsfl_109 )
      {
         readRow13U1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            standaloneNotModal13U1233( ) ;
            getKey13U1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13U1233( ) ;
            }
            else
            {
               if ( RcdFound1233 != 0 )
               {
                  if ( ( nRcdDeleted_1233 != 0 ) && ( nRcdExists_1233 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13U1233( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13U1233( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_109_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9443OMRCCosT = A9443OMRCCosT ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            O9444OMRRCosT = A9444OMRRCosT ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            O9440OMCosRea = A9440OMCosRea ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         httpContext.changePostValue( edtOMRepCod_Internalname, h9446OMRepCod) ;
         httpContext.changePostValue( edtOMRepNom_Internalname, GXutil.rtrim( A9447OMRepNom)) ;
         httpContext.changePostValue( cmbOMRTpo.getInternalname(), GXutil.rtrim( A9449OMRTpo)) ;
         httpContext.changePostValue( edtOMRepPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_109_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9450OMRRCnt_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9454OMRCCos_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( O9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9471OMRRCos_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_109_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPNOM_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPPRE_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCOS_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13U1233( ) ;
      if ( AnyError != 0 )
      {
         O9443OMRCCosT = s9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         O9444OMRRCosT = s9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      nRcdExists_1233 = (short)(0) ;
      nIsMod_1233 = (short)(0) ;
      nRcdDeleted_1233 = (short)(0) ;
   }

   public void processNestedLevel13U1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      s9442OMMRCosT = O9442OMMRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_93_idx = 0 ;
      while ( nGXsfl_93_idx < nRC_GXsfl_93 )
      {
         readRow13U1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            standaloneNotModal13U1234( ) ;
            getKey13U1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13U1234( ) ;
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( ( nRcdDeleted_1234 != 0 ) && ( nRcdExists_1234 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13U1234( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13U1234( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_93_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9441OMMCCosT = A9441OMMCCosT ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            O9442OMMRCosT = A9442OMMRCosT ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            O9440OMCosRea = A9440OMCosRea ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         httpContext.changePostValue( edtOMOpeCod_Internalname, h9455OMOpeCod) ;
         httpContext.changePostValue( edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom)) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_93_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9472OMMRCos_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( O9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCOS_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13U1234( ) ;
      if ( AnyError != 0 )
      {
         O9441OMMCCosT = s9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         O9442OMMRCosT = s9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      nRcdExists_1234 = (short)(0) ;
      nIsMod_1234 = (short)(0) ;
      nRcdDeleted_1234 = (short)(0) ;
   }

   public void processLevel13U1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel13U1531( ) ;
      processNestedLevel13U1530( ) ;
      processNestedLevel13U1233( ) ;
      processNestedLevel13U1234( ) ;
      if ( AnyError != 0 )
      {
         O9443OMRCCosT = s9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         O9444OMRRCosT = s9444OMRRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         O9441OMMCCosT = s9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         O9442OMMRCosT = s9442OMMRCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
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
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13U1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmorden");
         if ( AnyError == 0 )
         {
            confirmValues13U0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmorden");
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
      /* Using cursor T013U57 */
      pr_default.execute(47);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A396EmprCod = T013U57_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = T013U57_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1232( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A396EmprCod = T013U57_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = T013U57_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
   }

   public void scanEnd13U1232( )
   {
      pr_default.close(47);
   }

   public void afterConfirm13U1232( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXt_int11 = A9425OMCod ;
         GXv_int8[0] = GXt_int11 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTORD", ""), ""), GXv_int8) ;
         tmorden_impl.this.GXt_int11 = GXv_int8[0] ;
         A9425OMCod = GXt_int11 ;
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
      edtOMFchPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchPre_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Enabled), 5, 0), true);
      edtOMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      edtSMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      edtPMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      edtOMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      edtOMNot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMNot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMNot_Enabled), 5, 0), true);
      edtavComboommaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboommaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboommaqcod_Enabled), 5, 0), true);
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
   }

   public void zm13U1531( int GX_JID )
   {
      if ( ( GX_JID == 84 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -84 )
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
         httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      }
      else
      {
         edtOMMEquCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMMSEqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      }
      else
      {
         edtOMMSEqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMMPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      }
      else
      {
         edtOMMPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      }
   }

   public void load13U1531( )
   {
      /* Using cursor T013U58 */
      pr_default.execute(48, new Object[] {A9426OMMaqCod, A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1531 = (short)(1) ;
         A12599OMMEquDsc = T013U58_A12599OMMEquDsc[0] ;
         A12600OMMSEqDsc = T013U58_A12600OMMSEqDsc[0] ;
         A11449OMMPieDsc = T013U58_A11449OMMPieDsc[0] ;
         n11449OMMPieDsc = T013U58_n11449OMMPieDsc[0] ;
         zm13U1531( -84) ;
      }
      pr_default.close(48);
      onLoadActions13U1531( ) ;
   }

   public void onLoadActions13U1531( )
   {
   }

   public void checkExtendedTable13U1531( )
   {
      nIsDirty_1531 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13U1531( ) ;
      /* Using cursor T013U13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         GXCCtl = "OMMPIECOD_" + sGXsfl_121_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Equipos En Ordenes de Mantenimeinto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMEquCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12599OMMEquDsc = T013U13_A12599OMMEquDsc[0] ;
      A12600OMMSEqDsc = T013U13_A12600OMMSEqDsc[0] ;
      A11449OMMPieDsc = T013U13_A11449OMMPieDsc[0] ;
      n11449OMMPieDsc = T013U13_n11449OMMPieDsc[0] ;
      pr_default.close(11);
   }

   public void closeExtendedTableCursors13U1531( )
   {
      pr_default.close(11);
   }

   public void enableDisable13U1531( )
   {
   }

   public void gxload_85( String A396EmprCod ,
                          String A9426OMMaqCod ,
                          String A11446OMMEquCod ,
                          String A11447OMMSEqCod ,
                          String A11448OMMPieCod )
   {
      /* Using cursor T013U59 */
      pr_default.execute(49, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(49) == 101) )
      {
         GXCCtl = "OMMPIECOD_" + sGXsfl_121_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Equipos En Ordenes de Mantenimeinto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMEquCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12599OMMEquDsc = T013U59_A12599OMMEquDsc[0] ;
      A12600OMMSEqDsc = T013U59_A12600OMMSEqDsc[0] ;
      A11449OMMPieDsc = T013U59_A11449OMMPieDsc[0] ;
      n11449OMMPieDsc = T013U59_n11449OMMPieDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12599OMMEquDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12600OMMSEqDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11449OMMPieDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(49) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(49);
   }

   public void getKey13U1531( )
   {
      /* Using cursor T013U60 */
      pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound1531 = (short)(1) ;
      }
      else
      {
         RcdFound1531 = (short)(0) ;
      }
      pr_default.close(50);
   }

   public void getByPrimaryKey13U1531( )
   {
      /* Using cursor T013U12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         zm13U1531( 84) ;
         RcdFound1531 = (short)(1) ;
         initializeNonKey13U1531( ) ;
         A11446OMMEquCod = T013U12_A11446OMMEquCod[0] ;
         A11447OMMSEqCod = T013U12_A11447OMMSEqCod[0] ;
         A11448OMMPieCod = T013U12_A11448OMMPieCod[0] ;
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
      pr_default.close(10);
   }

   public void checkOptimisticConcurrency13U1531( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013U11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrde1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) )
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
                  /* Using cursor T013U61 */
                  pr_default.execute(51, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde1");
                  if ( (pr_default.getStatus(51) == 1) )
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
               /* Using cursor T013U62 */
               pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
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
         /* Using cursor T013U63 */
         pr_default.execute(53, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
         A12599OMMEquDsc = T013U63_A12599OMMEquDsc[0] ;
         A12600OMMSEqDsc = T013U63_A12600OMMSEqDsc[0] ;
         A11449OMMPieDsc = T013U63_A11449OMMPieDsc[0] ;
         n11449OMMPieDsc = T013U63_n11449OMMPieDsc[0] ;
         pr_default.close(53);
      }
   }

   public void endLevel13U1531( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
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
      /* Using cursor T013U64 */
      pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1531 = (short)(0) ;
      if ( (pr_default.getStatus(54) != 101) )
      {
         RcdFound1531 = (short)(1) ;
         A11446OMMEquCod = T013U64_A11446OMMEquCod[0] ;
         A11447OMMSEqCod = T013U64_A11447OMMSEqCod[0] ;
         A11448OMMPieCod = T013U64_A11448OMMPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1531( )
   {
      /* Scan next routine */
      pr_default.readNext(54);
      RcdFound1531 = (short)(0) ;
      if ( (pr_default.getStatus(54) != 101) )
      {
         RcdFound1531 = (short)(1) ;
         A11446OMMEquCod = T013U64_A11446OMMEquCod[0] ;
         A11447OMMSEqCod = T013U64_A11447OMMSEqCod[0] ;
         A11448OMMPieCod = T013U64_A11448OMMPieCod[0] ;
      }
   }

   public void scanEnd13U1531( )
   {
      pr_default.close(54);
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
      httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      edtOMMEquDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMEquDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquDsc_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      edtOMMSEqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      edtOMMSEqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqDsc_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      edtOMMPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      edtOMMPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieDsc_Enabled), 5, 0), !bGXsfl_121_Refreshing);
   }

   public void send_integrity_lvl_hashes13U1531( )
   {
   }

   public void zm13U1530( int GX_JID )
   {
      if ( ( GX_JID == 86 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -86 )
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
      edtTMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtTMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMTxt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void standaloneModal13U1530( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtTMCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void load13U1530( )
   {
      /* Using cursor T013U65 */
      pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9431TMDsc = T013U65_A9431TMDsc[0] ;
         n9431TMDsc = T013U65_n9431TMDsc[0] ;
         A9432TMTxt = T013U65_A9432TMTxt[0] ;
         n9432TMTxt = T013U65_n9432TMTxt[0] ;
         zm13U1530( -86) ;
      }
      pr_default.close(55);
      onLoadActions13U1530( ) ;
   }

   public void onLoadActions13U1530( )
   {
      /* Using cursor T013U66 */
      pr_default.execute(56, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      h9430TMCod = "" ;
      while ( (pr_default.getStatus(56) != 101) )
      {
         h9430TMCod = T013U66_A13749TMCDsc[0] ;
         if (true) break;
      }
      pr_default.close(56);
      httpContext.ajax_rsp_assign_attri("", false, "h9430TMCod", h9430TMCod);
   }

   public void checkExtendedTable13U1530( )
   {
      nIsDirty_1530 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13U1530( ) ;
      if ( (GXutil.strcmp("", h9430TMCod)==0) )
      {
         nIsDirty_1530 = (short)(1) ;
         A9430TMCod = 0 ;
      }
      else
      {
         A13749TMCDsc = h9430TMCod ;
         /* Using cursor T013U67 */
         pr_default.execute(57, new Object[] {A13749TMCDsc, A396EmprCod});
         A396EmprCod = T013U67_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = T013U67_A9430TMCod[0] ;
         A9430TMCod = T013U67_A9430TMCod[0] ;
         if ( ! ( (pr_default.getStatus(57) == 101) ) )
         {
            pr_default.readNext(57);
            if ( ! ( (pr_default.getStatus(57) == 101) ) )
            {
               GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(57);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9430TMCod", h9430TMCod);
      if ( (GXutil.strcmp("", h9430TMCod)==0) )
      {
         nIsDirty_1530 = (short)(1) ;
         A9430TMCod = 0 ;
      }
      else
      {
         A13749TMCDsc = h9430TMCod ;
         /* Using cursor T013U68 */
         pr_default.execute(58, new Object[] {A13749TMCDsc, A396EmprCod});
         A9430TMCod = T013U68_A9430TMCod[0] ;
         A9430TMCod = T013U68_A9430TMCod[0] ;
         if ( ! ( (pr_default.getStatus(58) == 101) ) )
         {
            pr_default.readNext(58);
            if ( ! ( (pr_default.getStatus(58) == 101) ) )
            {
               GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(58);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9430TMCod", h9430TMCod);
      /* Using cursor T013U10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9431TMDsc = T013U10_A9431TMDsc[0] ;
      n9431TMDsc = T013U10_n9431TMDsc[0] ;
      A9432TMTxt = T013U10_A9432TMTxt[0] ;
      n9432TMTxt = T013U10_n9432TMTxt[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors13U1530( )
   {
      pr_default.close(8);
   }

   public void enableDisable13U1530( )
   {
   }

   public void gxload_87( String A396EmprCod ,
                          int A9430TMCod )
   {
      /* Using cursor T013U69 */
      pr_default.execute(59, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(59) == 101) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9431TMDsc = T013U69_A9431TMDsc[0] ;
      n9431TMDsc = T013U69_n9431TMDsc[0] ;
      A9432TMTxt = T013U69_A9432TMTxt[0] ;
      n9432TMTxt = T013U69_n9432TMTxt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9431TMDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A9432TMTxt)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(59) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(59);
   }

   public void getKey13U1530( )
   {
      if ( (GXutil.strcmp("", h9430TMCod)==0) )
      {
         A9430TMCod = 0 ;
      }
      else
      {
         A13749TMCDsc = h9430TMCod ;
         /* Using cursor T013U70 */
         pr_default.execute(60, new Object[] {A13749TMCDsc, A396EmprCod});
         A396EmprCod = T013U70_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = T013U70_A9430TMCod[0] ;
         A9430TMCod = T013U70_A9430TMCod[0] ;
         if ( ! ( (pr_default.getStatus(60) == 101) ) )
         {
            pr_default.readNext(60);
            if ( ! ( (pr_default.getStatus(60) == 101) ) )
            {
               GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(60);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9430TMCod", h9430TMCod);
      /* Using cursor T013U71 */
      pr_default.execute(61, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound1530 = (short)(1) ;
      }
      else
      {
         RcdFound1530 = (short)(0) ;
      }
      pr_default.close(61);
   }

   public void getByPrimaryKey13U1530( )
   {
      /* Using cursor T013U9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm13U1530( 86) ;
         RcdFound1530 = (short)(1) ;
         initializeNonKey13U1530( ) ;
         A9430TMCod = T013U9_A9430TMCod[0] ;
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
      pr_default.close(7);
   }

   public void checkOptimisticConcurrency13U1530( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h9430TMCod)==0) )
         {
            A9430TMCod = 0 ;
         }
         else
         {
            A13749TMCDsc = h9430TMCod ;
            /* Using cursor T013U72 */
            pr_default.execute(62, new Object[] {A13749TMCDsc, A396EmprCod});
            A396EmprCod = T013U72_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9430TMCod = T013U72_A9430TMCod[0] ;
            A9430TMCod = T013U72_A9430TMCod[0] ;
            if ( ! ( (pr_default.getStatus(62) == 101) ) )
            {
               pr_default.readNext(62);
               if ( ! ( (pr_default.getStatus(62) == 101) ) )
               {
                  GXCCtl = "TMCOD_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Descripcion", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(62);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h9430TMCod", h9430TMCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T013U8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrde2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) )
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
                  /* Using cursor T013U73 */
                  pr_default.execute(63, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod, Integer.valueOf(A9430TMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde2");
                  if ( (pr_default.getStatus(63) == 1) )
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
               /* Using cursor T013U74 */
               pr_default.execute(64, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
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
         /* Using cursor T013U75 */
         pr_default.execute(65, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
         A9431TMDsc = T013U75_A9431TMDsc[0] ;
         n9431TMDsc = T013U75_n9431TMDsc[0] ;
         A9432TMTxt = T013U75_A9432TMTxt[0] ;
         n9432TMTxt = T013U75_n9432TMTxt[0] ;
         pr_default.close(65);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013U76 */
         pr_default.execute(66, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Asignacion de las piezas a realizar la Tarea", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
      }
   }

   public void endLevel13U1530( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
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
      /* Using cursor T013U77 */
      pr_default.execute(67, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1530 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9430TMCod = T013U77_A9430TMCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1530( )
   {
      /* Scan next routine */
      pr_default.readNext(67);
      RcdFound1530 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9430TMCod = T013U77_A9430TMCod[0] ;
      }
   }

   public void scanEnd13U1530( )
   {
      pr_default.close(67);
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
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtTMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtTMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMTxt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashes13U1530( )
   {
   }

   public void zm13U1233( int GX_JID )
   {
      if ( ( GX_JID == 88 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9451OMRRPre = T013U6_A9451OMRRPre[0] ;
            Z9450OMRRCnt = T013U6_A9450OMRRCnt[0] ;
            Z9452OMRCCnt = T013U6_A9452OMRCCnt[0] ;
            Z9453OMRCPre = T013U6_A9453OMRCPre[0] ;
         }
         else
         {
            Z9451OMRRPre = A9451OMRRPre ;
            Z9450OMRRCnt = A9450OMRRCnt ;
            Z9452OMRCCnt = A9452OMRCCnt ;
            Z9453OMRCPre = A9453OMRCPre ;
         }
      }
      if ( GX_JID == -88 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         Z9451OMRRPre = A9451OMRRPre ;
         Z9450OMRRCnt = A9450OMRRCnt ;
         Z9452OMRCCnt = A9452OMRCCnt ;
         Z9453OMRCPre = A9453OMRCPre ;
         Z396EmprCod = A396EmprCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9447OMRepNom = A9447OMRepNom ;
         Z9448OMRepPre = A9448OMRepPre ;
      }
   }

   public void standaloneNotModal13U1233( )
   {
      edtOMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 )
      {
         A9449OMRTpo = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
      }
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 )
      {
         cmbOMRTpo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_109_Refreshing);
      }
      else
      {
         cmbOMRTpo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_109_Refreshing);
      }
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 )
      {
         edtOMRRPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      }
      else
      {
         edtOMRRPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      }
   }

   public void standaloneModal13U1233( )
   {
      A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9454OMRCCos", GXutil.ltrimstr( A9454OMRCCos, 12, 3));
      O9454OMRCCos = A9454OMRCCos ;
      httpContext.ajax_rsp_assign_attri("", false, "A9454OMRCCos", GXutil.ltrimstr( A9454OMRCCos, 12, 3));
      if ( isIns( )  )
      {
         A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos).subtract(O9454OMRCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9443OMRCCosT = O9443OMRCCosT.subtract(O9454OMRCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMRepCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      }
      else
      {
         edtOMRepCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         cmbOMRTpo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_109_Refreshing);
      }
   }

   public void load13U1233( )
   {
      /* Using cursor T013U78 */
      pr_default.execute(68, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9451OMRRPre = T013U78_A9451OMRRPre[0] ;
         A9447OMRepNom = T013U78_A9447OMRepNom[0] ;
         n9447OMRepNom = T013U78_n9447OMRepNom[0] ;
         A9448OMRepPre = T013U78_A9448OMRepPre[0] ;
         n9448OMRepPre = T013U78_n9448OMRepPre[0] ;
         A9450OMRRCnt = T013U78_A9450OMRRCnt[0] ;
         A9452OMRCCnt = T013U78_A9452OMRCCnt[0] ;
         A9453OMRCPre = T013U78_A9453OMRCPre[0] ;
         zm13U1233( -88) ;
      }
      pr_default.close(68);
      onLoadActions13U1233( ) ;
   }

   public void onLoadActions13U1233( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
      O9471OMRRCos = A9471OMRRCos ;
      if ( isIns( )  )
      {
         A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
         }
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
      /* Using cursor T013U79 */
      pr_default.execute(69, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      h9446OMRepCod = "" ;
      while ( (pr_default.getStatus(69) != 101) )
      {
         h9446OMRepCod = T013U79_A13718MRCNom[0] ;
         if (true) break;
      }
      pr_default.close(69);
      httpContext.ajax_rsp_assign_attri("", false, "h9446OMRepCod", h9446OMRepCod);
   }

   public void checkExtendedTable13U1233( )
   {
      nIsDirty_1233 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13U1233( ) ;
      /* Using cursor T013U7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_109_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T013U7_A9447OMRepNom[0] ;
      n9447OMRepNom = T013U7_n9447OMRepNom[0] ;
      A9448OMRepPre = T013U7_A9448OMRepPre[0] ;
      n9448OMRepPre = T013U7_n9448OMRepPre[0] ;
      pr_default.close(5);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1233 = (short)(1) ;
         A9451OMRRPre = A9448OMRepPre ;
      }
      nIsDirty_1233 = (short)(1) ;
      A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1233 = (short)(1) ;
         A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1233 = (short)(1) ;
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1233 = (short)(1) ;
               A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         nIsDirty_1233 = (short)(1) ;
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            nIsDirty_1233 = (short)(1) ;
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            nIsDirty_1233 = (short)(1) ;
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
   }

   public void closeExtendedTableCursors13U1233( )
   {
      pr_default.close(5);
   }

   public void enableDisable13U1233( )
   {
   }

   public void gxload_89( String A396EmprCod ,
                          int A9446OMRepCod )
   {
      /* Using cursor T013U80 */
      pr_default.execute(70, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(70) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_109_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T013U80_A9447OMRepNom[0] ;
      n9447OMRepNom = T013U80_n9447OMRepNom[0] ;
      A9448OMRepPre = T013U80_A9448OMRepPre[0] ;
      n9448OMRepPre = T013U80_n9448OMRepPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9447OMRepNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(70) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(70);
   }

   public void getKey13U1233( )
   {
      /* Using cursor T013U81 */
      pr_default.execute(71, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(71) != 101) )
      {
         RcdFound1233 = (short)(1) ;
      }
      else
      {
         RcdFound1233 = (short)(0) ;
      }
      pr_default.close(71);
   }

   public void getByPrimaryKey13U1233( )
   {
      /* Using cursor T013U6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm13U1233( 88) ;
         RcdFound1233 = (short)(1) ;
         initializeNonKey13U1233( ) ;
         A9449OMRTpo = T013U6_A9449OMRTpo[0] ;
         A9451OMRRPre = T013U6_A9451OMRRPre[0] ;
         A9450OMRRCnt = T013U6_A9450OMRRCnt[0] ;
         A9452OMRCCnt = T013U6_A9452OMRCCnt[0] ;
         A9453OMRCPre = T013U6_A9453OMRCPre[0] ;
         A9446OMRepCod = T013U6_A9446OMRepCod[0] ;
         O9450OMRRCnt = A9450OMRRCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13U1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1233 = (short)(0) ;
         initializeNonKey13U1233( ) ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13U1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13U1233( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency13U1233( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T013U5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z9451OMRRPre, T013U5_A9451OMRRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9450OMRRCnt, T013U5_A9450OMRRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9452OMRCCnt, T013U5_A9452OMRCCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9453OMRCPre, T013U5_A9453OMRCPre[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9451OMRRPre, T013U5_A9451OMRRPre[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMRRPre");
               GXutil.writeLogRaw("Old: ",Z9451OMRRPre);
               GXutil.writeLogRaw("Current: ",T013U5_A9451OMRRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9450OMRRCnt, T013U5_A9450OMRRCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMRRCnt");
               GXutil.writeLogRaw("Old: ",Z9450OMRRCnt);
               GXutil.writeLogRaw("Current: ",T013U5_A9450OMRRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9452OMRCCnt, T013U5_A9452OMRCCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMRCCnt");
               GXutil.writeLogRaw("Old: ",Z9452OMRCCnt);
               GXutil.writeLogRaw("Current: ",T013U5_A9452OMRCCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9453OMRCPre, T013U5_A9453OMRCPre[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMRCPre");
               GXutil.writeLogRaw("Old: ",Z9453OMRCPre);
               GXutil.writeLogRaw("Current: ",T013U5_A9453OMRCPre[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrRep"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13U1233( )
   {
      beforeValidate13U1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1233( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13U1233( 0) ;
         checkOptimisticConcurrency13U1233( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13U1233( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13U1233( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U82 */
                  pr_default.execute(72, new Object[] {Integer.valueOf(A9425OMCod), A9449OMRTpo, A9451OMRRPre, A9450OMRRCnt, A9452OMRCCnt, A9453OMRCPre, A396EmprCod, Integer.valueOf(A9446OMRepCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                  if ( (pr_default.getStatus(72) == 1) )
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
            load13U1233( ) ;
         }
         endLevel13U1233( ) ;
      }
      closeExtendedTableCursors13U1233( ) ;
   }

   public void update13U1233( )
   {
      beforeValidate13U1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1233( ) ;
      }
      if ( ( nIsMod_1233 != 0 ) || ( nIsDirty_1233 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13U1233( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13U1233( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13U1233( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013U83 */
                     pr_default.execute(73, new Object[] {A9451OMRRPre, A9450OMRRCnt, A9452OMRCCnt, A9453OMRCPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                     if ( (pr_default.getStatus(73) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13U1233( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13U1233( ) ;
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
            endLevel13U1233( ) ;
         }
      }
      closeExtendedTableCursors13U1233( ) ;
   }

   public void deferredUpdate13U1233( )
   {
   }

   public void delete13U1233( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13U1233( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13U1233( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13U1233( ) ;
         afterConfirm13U1233( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13U1233( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013U84 */
               pr_default.execute(74, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
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
      sMode1233 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13U1233( ) ;
      Gx_mode = sMode1233 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13U1233( )
   {
      standaloneModal13U1233( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013U85 */
         pr_default.execute(75, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         A9447OMRepNom = T013U85_A9447OMRepNom[0] ;
         n9447OMRepNom = T013U85_n9447OMRepNom[0] ;
         A9448OMRepPre = T013U85_A9448OMRepPre[0] ;
         n9448OMRepPre = T013U85_n9448OMRepPre[0] ;
         pr_default.close(75);
         A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
         if ( isIns( )  )
         {
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               }
            }
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
      }
   }

   public void endLevel13U1233( )
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

   public void scanStart13U1233( )
   {
      /* Scan By routine */
      /* Using cursor T013U86 */
      pr_default.execute(76, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T013U86_A9446OMRepCod[0] ;
         A9449OMRTpo = T013U86_A9449OMRTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1233( )
   {
      /* Scan next routine */
      pr_default.readNext(76);
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T013U86_A9446OMRepCod[0] ;
         A9449OMRTpo = T013U86_A9449OMRTpo[0] ;
      }
   }

   public void scanEnd13U1233( )
   {
      pr_default.close(76);
   }

   public void afterConfirm13U1233( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         AV29ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ServerNow", localUtil.ttoc( AV29ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV16oOMRRCnt = O9450OMRRCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV19nOMRRCnt = A9450OMRRCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19nOMRRCnt", GXutil.ltrimstr( AV19nOMRRCnt, 12, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A9425OMCod ;
         GXv_int12[0] = A9446OMRepCod ;
         GXv_int13[0] = AV17MTMovCod ;
         GXv_char3[0] = AV18MTMovNom ;
         GXv_int14[0] = (byte)(1) ;
         GXv_decimal15[0] = AV16oOMRRCnt ;
         GXv_decimal16[0] = A9450OMRRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime17[0] = AV29ServerNow ;
         new app.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int12, GXv_int13, GXv_char3, GXv_int14, GXv_decimal15, GXv_decimal16, GXv_char2, GXv_dtime17) ;
         tmorden_impl.this.A396EmprCod = GXv_char4[0] ;
         tmorden_impl.this.A9425OMCod = GXv_int8[0] ;
         tmorden_impl.this.A9446OMRepCod = GXv_int12[0] ;
         tmorden_impl.this.AV17MTMovCod = GXv_int13[0] ;
         tmorden_impl.this.AV18MTMovNom = GXv_char3[0] ;
         tmorden_impl.this.AV16oOMRRCnt = GXv_decimal15[0] ;
         tmorden_impl.this.A9450OMRRCnt = GXv_decimal16[0] ;
         tmorden_impl.this.AV29ServerNow = GXv_dtime17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV29ServerNow", localUtil.ttoc( AV29ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void beforeInsert13U1233( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13U1233( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13U1233( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13U1233( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13U1233( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13U1233( )
   {
      edtOMRepCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtOMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      cmbOMRTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_109_Refreshing);
      edtOMRepPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepPre_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtOMRRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtOMRRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtOMRRCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCos_Enabled), 5, 0), !bGXsfl_109_Refreshing);
   }

   public void send_integrity_lvl_hashes13U1233( )
   {
   }

   public void zm13U1234( int GX_JID )
   {
      if ( ( GX_JID == 90 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9460OMMRPre = T013U3_A9460OMMRPre[0] ;
            Z9459OMMRCnt = T013U3_A9459OMMRCnt[0] ;
            Z9461OMMCCnt = T013U3_A9461OMMCCnt[0] ;
            Z9462OMMCPre = T013U3_A9462OMMCPre[0] ;
         }
         else
         {
            Z9460OMMRPre = A9460OMMRPre ;
            Z9459OMMRCnt = A9459OMMRCnt ;
            Z9461OMMCCnt = A9461OMMCCnt ;
            Z9462OMMCPre = A9462OMMCPre ;
         }
      }
      if ( GX_JID == -90 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         Z9460OMMRPre = A9460OMMRPre ;
         Z9459OMMRCnt = A9459OMMRCnt ;
         Z9461OMMCCnt = A9461OMMCCnt ;
         Z9462OMMCPre = A9462OMMCPre ;
         Z396EmprCod = A396EmprCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9456OMOpeNom = A9456OMOpeNom ;
         Z9457OMOpePre = A9457OMOpePre ;
      }
   }

   public void standaloneNotModal13U1234( )
   {
      edtOMOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 )
      {
         A9458OMMTpo = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
      }
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 )
      {
         cmbOMMTpo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_93_Refreshing);
      }
      else
      {
         cmbOMMTpo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_93_Refreshing);
      }
      if ( GXutil.strcmp(AV20Accion, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 )
      {
         edtOMMRPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      }
      else
      {
         edtOMMRPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      }
   }

   public void standaloneModal13U1234( )
   {
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9463OMMCCos", GXutil.ltrimstr( A9463OMMCCos, 12, 3));
      O9463OMMCCos = A9463OMMCCos ;
      httpContext.ajax_rsp_assign_attri("", false, "A9463OMMCCos", GXutil.ltrimstr( A9463OMMCCos, 12, 3));
      if ( isIns( )  )
      {
         A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      }
      else
      {
         edtOMOpeCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         cmbOMMTpo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_93_Refreshing);
      }
   }

   public void load13U1234( )
   {
      /* Using cursor T013U87 */
      pr_default.execute(77, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9460OMMRPre = T013U87_A9460OMMRPre[0] ;
         A9456OMOpeNom = T013U87_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T013U87_n9456OMOpeNom[0] ;
         A9457OMOpePre = T013U87_A9457OMOpePre[0] ;
         n9457OMOpePre = T013U87_n9457OMOpePre[0] ;
         A9459OMMRCnt = T013U87_A9459OMMRCnt[0] ;
         A9461OMMCCnt = T013U87_A9461OMMCCnt[0] ;
         A9462OMMCPre = T013U87_A9462OMMCPre[0] ;
         zm13U1234( -90) ;
      }
      pr_default.close(77);
      onLoadActions13U1234( ) ;
   }

   public void onLoadActions13U1234( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9460OMMRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9460OMMRPre = A9457OMOpePre ;
      }
      A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
      O9472OMMRCos = A9472OMMRCos ;
      if ( isIns( )  )
      {
         A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos).subtract(O9472OMMRCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9442OMMRCosT = O9442OMMRCosT.subtract(O9472OMMRCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            }
         }
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
      /* Using cursor T013U88 */
      pr_default.execute(78, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      h9455OMOpeCod = "" ;
      while ( (pr_default.getStatus(78) != 101) )
      {
         h9455OMOpeCod = T013U88_A13748OpeCNom[0] ;
         if (true) break;
      }
      pr_default.close(78);
      httpContext.ajax_rsp_assign_attri("", false, "h9455OMOpeCod", h9455OMOpeCod);
   }

   public void checkExtendedTable13U1234( )
   {
      nIsDirty_1234 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13U1234( ) ;
      /* Using cursor T013U4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T013U4_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013U4_n9456OMOpeNom[0] ;
      A9457OMOpePre = T013U4_A9457OMOpePre[0] ;
      n9457OMOpePre = T013U4_n9457OMOpePre[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9460OMMRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1234 = (short)(1) ;
         A9460OMMRPre = A9457OMOpePre ;
      }
      nIsDirty_1234 = (short)(1) ;
      A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1234 = (short)(1) ;
         A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1234 = (short)(1) ;
            A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos).subtract(O9472OMMRCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1234 = (short)(1) ;
               A9442OMMRCosT = O9442OMMRCosT.subtract(O9472OMMRCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         nIsDirty_1234 = (short)(1) ;
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            nIsDirty_1234 = (short)(1) ;
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            nIsDirty_1234 = (short)(1) ;
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
   }

   public void closeExtendedTableCursors13U1234( )
   {
      pr_default.close(2);
   }

   public void enableDisable13U1234( )
   {
   }

   public void gxload_91( String A396EmprCod ,
                          int A9455OMOpeCod )
   {
      /* Using cursor T013U89 */
      pr_default.execute(79, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(79) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T013U89_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013U89_n9456OMOpeNom[0] ;
      A9457OMOpePre = T013U89_A9457OMOpePre[0] ;
      n9457OMOpePre = T013U89_n9457OMOpePre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9456OMOpeNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(79) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(79);
   }

   public void getKey13U1234( )
   {
      /* Using cursor T013U90 */
      pr_default.execute(80, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound1234 = (short)(1) ;
      }
      else
      {
         RcdFound1234 = (short)(0) ;
      }
      pr_default.close(80);
   }

   public void getByPrimaryKey13U1234( )
   {
      /* Using cursor T013U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13U1234( 90) ;
         RcdFound1234 = (short)(1) ;
         initializeNonKey13U1234( ) ;
         A9458OMMTpo = T013U3_A9458OMMTpo[0] ;
         A9460OMMRPre = T013U3_A9460OMMRPre[0] ;
         A9459OMMRCnt = T013U3_A9459OMMRCnt[0] ;
         A9461OMMCCnt = T013U3_A9461OMMCCnt[0] ;
         A9462OMMCPre = T013U3_A9462OMMCPre[0] ;
         A9455OMOpeCod = T013U3_A9455OMOpeCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13U1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1234 = (short)(0) ;
         initializeNonKey13U1234( ) ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13U1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13U1234( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13U1234( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T013U2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9460OMMRPre, T013U2_A9460OMMRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9459OMMRCnt, T013U2_A9459OMMRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9461OMMCCnt, T013U2_A9461OMMCCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9462OMMCPre, T013U2_A9462OMMCPre[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9460OMMRPre, T013U2_A9460OMMRPre[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMMRPre");
               GXutil.writeLogRaw("Old: ",Z9460OMMRPre);
               GXutil.writeLogRaw("Current: ",T013U2_A9460OMMRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9459OMMRCnt, T013U2_A9459OMMRCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMMRCnt");
               GXutil.writeLogRaw("Old: ",Z9459OMMRCnt);
               GXutil.writeLogRaw("Current: ",T013U2_A9459OMMRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9461OMMCCnt, T013U2_A9461OMMCCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMMCCnt");
               GXutil.writeLogRaw("Old: ",Z9461OMMCCnt);
               GXutil.writeLogRaw("Current: ",T013U2_A9461OMMCCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9462OMMCPre, T013U2_A9462OMMCPre[0]) != 0 )
            {
               GXutil.writeLogln("tmorden:[seudo value changed for attri]"+"OMMCPre");
               GXutil.writeLogRaw("Old: ",Z9462OMMCPre);
               GXutil.writeLogRaw("Current: ",T013U2_A9462OMMCPre[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13U1234( )
   {
      beforeValidate13U1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1234( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13U1234( 0) ;
         checkOptimisticConcurrency13U1234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13U1234( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13U1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013U91 */
                  pr_default.execute(81, new Object[] {Integer.valueOf(A9425OMCod), A9458OMMTpo, A9460OMMRPre, A9459OMMRCnt, A9461OMMCCnt, A9462OMMCPre, A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                  if ( (pr_default.getStatus(81) == 1) )
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
            load13U1234( ) ;
         }
         endLevel13U1234( ) ;
      }
      closeExtendedTableCursors13U1234( ) ;
   }

   public void update13U1234( )
   {
      beforeValidate13U1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13U1234( ) ;
      }
      if ( ( nIsMod_1234 != 0 ) || ( nIsDirty_1234 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13U1234( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13U1234( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13U1234( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013U92 */
                     pr_default.execute(82, new Object[] {A9460OMMRPre, A9459OMMRCnt, A9461OMMCCnt, A9462OMMCPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                     if ( (pr_default.getStatus(82) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13U1234( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13U1234( ) ;
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
            endLevel13U1234( ) ;
         }
      }
      closeExtendedTableCursors13U1234( ) ;
   }

   public void deferredUpdate13U1234( )
   {
   }

   public void delete13U1234( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13U1234( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13U1234( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13U1234( ) ;
         afterConfirm13U1234( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13U1234( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013U93 */
               pr_default.execute(83, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
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
      sMode1234 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13U1234( ) ;
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13U1234( )
   {
      standaloneModal13U1234( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013U94 */
         pr_default.execute(84, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
         A9456OMOpeNom = T013U94_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T013U94_n9456OMOpeNom[0] ;
         A9457OMOpePre = T013U94_A9457OMOpePre[0] ;
         n9457OMOpePre = T013U94_n9457OMOpePre[0] ;
         pr_default.close(84);
         A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
         if ( isIns( )  )
         {
            A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos).subtract(O9472OMMRCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9442OMMRCosT = O9442OMMRCosT.subtract(O9472OMMRCos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               }
            }
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
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013U95 */
         pr_default.execute(85, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
      }
   }

   public void endLevel13U1234( )
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

   public void scanStart13U1234( )
   {
      /* Scan By routine */
      /* Using cursor T013U96 */
      pr_default.execute(86, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T013U96_A9455OMOpeCod[0] ;
         A9458OMMTpo = T013U96_A9458OMMTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13U1234( )
   {
      /* Scan next routine */
      pr_default.readNext(86);
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T013U96_A9455OMOpeCod[0] ;
         A9458OMMTpo = T013U96_A9458OMMTpo[0] ;
      }
   }

   public void scanEnd13U1234( )
   {
      pr_default.close(86);
   }

   public void afterConfirm13U1234( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9460OMMRPre = A9457OMOpePre ;
      }
   }

   public void beforeInsert13U1234( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13U1234( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13U1234( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13U1234( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13U1234( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13U1234( )
   {
      edtOMOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtOMOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_93_Refreshing);
      edtOMOpePre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtOMMRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtOMMRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtOMMRCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCos_Enabled), 5, 0), !bGXsfl_93_Refreshing);
   }

   public void send_integrity_lvl_hashes13U1234( )
   {
   }

   public void send_integrity_lvl_hashes13U1232( )
   {
   }

   public void subsflControlProps_1211531( )
   {
      edtOMMEquCod_Internalname = "OMMEQUCOD_"+sGXsfl_121_idx ;
      edtOMMEquDsc_Internalname = "OMMEQUDSC_"+sGXsfl_121_idx ;
      edtOMMSEqCod_Internalname = "OMMSEQCOD_"+sGXsfl_121_idx ;
      edtOMMSEqDsc_Internalname = "OMMSEQDSC_"+sGXsfl_121_idx ;
      edtOMMPieCod_Internalname = "OMMPIECOD_"+sGXsfl_121_idx ;
      edtOMMPieDsc_Internalname = "OMMPIEDSC_"+sGXsfl_121_idx ;
   }

   public void subsflControlProps_fel_1211531( )
   {
      edtOMMEquCod_Internalname = "OMMEQUCOD_"+sGXsfl_121_fel_idx ;
      edtOMMEquDsc_Internalname = "OMMEQUDSC_"+sGXsfl_121_fel_idx ;
      edtOMMSEqCod_Internalname = "OMMSEQCOD_"+sGXsfl_121_fel_idx ;
      edtOMMSEqDsc_Internalname = "OMMSEQDSC_"+sGXsfl_121_fel_idx ;
      edtOMMPieCod_Internalname = "OMMPIECOD_"+sGXsfl_121_fel_idx ;
      edtOMMPieDsc_Internalname = "OMMPIEDSC_"+sGXsfl_121_fel_idx ;
   }

   public void addRow13U1531( )
   {
      nGXsfl_121_idx = (int)(nGXsfl_121_idx+1) ;
      sGXsfl_121_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_121_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1211531( ) ;
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
         if ( ((int)((nGXsfl_121_idx) % (2))) == 0 )
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
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1531_" + sGXsfl_121_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_121_idx + "',121)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMEquCod_Internalname,GXutil.rtrim( A11446OMMEquCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMEquCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMEquCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(121),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMEquDsc_Internalname,GXutil.rtrim( A12599OMMEquDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMEquDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMEquDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(121),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1531_" + sGXsfl_121_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_121_idx + "',121)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMSEqCod_Internalname,GXutil.rtrim( A11447OMMSEqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMSEqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMSEqCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(121),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMSEqDsc_Internalname,GXutil.rtrim( A12600OMMSEqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMSEqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMSEqDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(121),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1531_" + sGXsfl_121_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_121_idx + "',121)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMPieCod_Internalname,GXutil.rtrim( A11448OMMPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(121),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMPieDsc_Internalname,GXutil.rtrim( A11449OMMPieDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMPieDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMPieDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(121),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_equiposRow);
      send_integrity_lvl_hashes13U1531( ) ;
      GXCCtl = "Z11446OMMEquCod_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11446OMMEquCod));
      GXCCtl = "Z11447OMMSEqCod_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11447OMMSEqCod));
      GXCCtl = "Z11448OMMPieCod_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11448OMMPieCod));
      GXCCtl = "nRcdDeleted_1531_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1531_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1531_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_121_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vACCION_" + sGXsfl_121_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20Accion));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMEQUCOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMEQUDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMSEQCOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMSEQDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMPIECOD_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMPIEDSC_"+sGXsfl_121_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_equiposContainer.AddRow(Gridlevel_equiposRow);
   }

   public void readRow13U1531( )
   {
      nGXsfl_121_idx = (int)(nGXsfl_121_idx+1) ;
      sGXsfl_121_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_121_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1211531( ) ;
      edtOMMEquCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQUCOD_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMEquDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMEQUDSC_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMSEqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSEQCOD_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMSEqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMSEQDSC_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIECOD_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMPIEDSC_"+sGXsfl_121_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A11446OMMEquCod = httpContext.cgiGet( edtOMMEquCod_Internalname) ;
      A12599OMMEquDsc = httpContext.cgiGet( edtOMMEquDsc_Internalname) ;
      A11447OMMSEqCod = httpContext.cgiGet( edtOMMSEqCod_Internalname) ;
      A12600OMMSEqDsc = httpContext.cgiGet( edtOMMSEqDsc_Internalname) ;
      A11448OMMPieCod = httpContext.cgiGet( edtOMMPieCod_Internalname) ;
      A11449OMMPieDsc = httpContext.cgiGet( edtOMMPieDsc_Internalname) ;
      n11449OMMPieDsc = false ;
      GXCCtl = "Z11446OMMEquCod_" + sGXsfl_121_idx ;
      Z11446OMMEquCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11447OMMSEqCod_" + sGXsfl_121_idx ;
      Z11447OMMSEqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11448OMMPieCod_" + sGXsfl_121_idx ;
      Z11448OMMPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1531_" + sGXsfl_121_idx ;
      nRcdDeleted_1531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1531_" + sGXsfl_121_idx ;
      nRcdExists_1531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1531_" + sGXsfl_121_idx ;
      nIsMod_1531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_851530( )
   {
      edtTMCod_Internalname = "TMCOD_"+sGXsfl_85_idx ;
      edtTMDsc_Internalname = "TMDSC_"+sGXsfl_85_idx ;
      edtTMTxt_Internalname = "TMTXT_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_851530( )
   {
      edtTMCod_Internalname = "TMCOD_"+sGXsfl_85_fel_idx ;
      edtTMDsc_Internalname = "TMDSC_"+sGXsfl_85_fel_idx ;
      edtTMTxt_Internalname = "TMTXT_"+sGXsfl_85_fel_idx ;
   }

   public void addRow13U1530( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851530( ) ;
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
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1530_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tareasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMCod_Internalname,h9430TMCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTMCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_tareasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMDsc_Internalname,GXutil.rtrim( A9431TMDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtTMDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_tareasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMTxt_Internalname,A9432TMTxt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtTMTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_tareasRow);
      send_integrity_lvl_hashes13U1530( ) ;
      GXCCtl = "GXHCTMCOD_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9430TMCod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1530_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1530_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1530_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_85_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vACCION_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20Accion));
      app.GxWebStd.gx_hidden_field( httpContext, "TMCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMDSC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMTXT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_tareasContainer.AddRow(Gridlevel_tareasRow);
   }

   public void readRow13U1530( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851530( ) ;
      edtTMCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMDSC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMTXT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9430TMCod = httpContext.cgiGet( edtTMCod_Internalname) ;
      A9431TMDsc = httpContext.cgiGet( edtTMDsc_Internalname) ;
      n9431TMDsc = false ;
      A9432TMTxt = httpContext.cgiGet( edtTMTxt_Internalname) ;
      n9432TMTxt = false ;
      GXCCtl = "GXHCTMCOD_" + sGXsfl_85_idx ;
      A9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9430TMCod_" + sGXsfl_85_idx ;
      Z9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1530_" + sGXsfl_85_idx ;
      nRcdDeleted_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1530_" + sGXsfl_85_idx ;
      nRcdExists_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1530_" + sGXsfl_85_idx ;
      nIsMod_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1091233( )
   {
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_109_idx ;
      edtOMRepNom_Internalname = "OMREPNOM_"+sGXsfl_109_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_109_idx );
      edtOMRepPre_Internalname = "OMREPPRE_"+sGXsfl_109_idx ;
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_109_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_109_idx ;
      edtOMRRCos_Internalname = "OMRRCOS_"+sGXsfl_109_idx ;
   }

   public void subsflControlProps_fel_1091233( )
   {
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_109_fel_idx ;
      edtOMRepNom_Internalname = "OMREPNOM_"+sGXsfl_109_fel_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_109_fel_idx );
      edtOMRepPre_Internalname = "OMREPPRE_"+sGXsfl_109_fel_idx ;
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_109_fel_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_109_fel_idx ;
      edtOMRRCos_Internalname = "OMRRCOS_"+sGXsfl_109_fel_idx ;
   }

   public void addRow13U1233( )
   {
      nGXsfl_109_idx = (int)(nGXsfl_109_idx+1) ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1091233( ) ;
      sendRow13U1233( ) ;
   }

   public void sendRow13U1233( )
   {
      Gridlevel_repuestoRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_repuesto_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_repuesto_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_repuesto_Class, "") != 0 )
         {
            subGridlevel_repuesto_Linesclass = subGridlevel_repuesto_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_repuesto_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_repuesto_Backstyle = (byte)(0) ;
         subGridlevel_repuesto_Backcolor = subGridlevel_repuesto_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_repuesto_Class, "") != 0 )
         {
            subGridlevel_repuesto_Linesclass = subGridlevel_repuesto_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_repuesto_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_repuesto_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_repuesto_Class, "") != 0 )
         {
            subGridlevel_repuesto_Linesclass = subGridlevel_repuesto_Class+"Odd" ;
         }
         subGridlevel_repuesto_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_repuesto_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_repuesto_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_109_idx) % (2))) == 0 )
         {
            subGridlevel_repuesto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_repuesto_Class, "") != 0 )
            {
               subGridlevel_repuesto_Linesclass = subGridlevel_repuesto_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_repuesto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_repuesto_Class, "") != 0 )
            {
               subGridlevel_repuesto_Linesclass = subGridlevel_repuesto_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_109_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_109_idx + "',109)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repuestoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepCod_Internalname,h9446OMRepCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRepCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repuestoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepNom_Internalname,GXutil.rtrim( A9447OMRepNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtOMRepNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_109_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_109_idx + "',109)\"" ;
      GXCCtl = "OMRTPO_" + sGXsfl_109_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         A9449OMRTpo = cmbOMRTpo.getValidValue(A9449OMRTpo) ;
      }
      /* ComboBox */
      Gridlevel_repuestoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMRTpo,cmbOMRTpo.getInternalname(),GXutil.rtrim( A9449OMRTpo),Integer.valueOf(1),cmbOMRTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMRTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMRTpo.setValue( GXutil.rtrim( A9449OMRTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Values", cmbOMRTpo.ToJavascriptSource(), !bGXsfl_109_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repuestoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRepPre_Enabled!=0) ? localUtil.format( A9448OMRepPre, "ZZZZZZ9.999") : localUtil.format( A9448OMRepPre, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRepPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_109_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_109_idx + "',109)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repuestoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRCnt_Enabled!=0) ? localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_109_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_109_idx + "',109)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repuestoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRRPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repuestoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRCos_Enabled!=0) ? localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999") : localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRRCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_repuestoRow);
      send_integrity_lvl_hashes13U1233( ) ;
      GXCCtl = "GXHCOMREPCOD_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9449OMRTpo));
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9450OMRRCnt_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9454OMRCCos_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9471OMRRCos_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "OMRCCOS_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1233_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1233_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_109_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vACCION_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20Accion));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPCOD_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPNOM_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRTPO_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPPRE_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRCNT_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRPRE_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRCOS_"+sGXsfl_109_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_repuestoContainer.AddRow(Gridlevel_repuestoRow);
   }

   public void readRow13U1233( )
   {
      nGXsfl_109_idx = (int)(nGXsfl_109_idx+1) ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1091233( ) ;
      edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPNOM_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMRepPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPPRE_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCOS_"+sGXsfl_109_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9446OMRepCod = httpContext.cgiGet( edtOMRepCod_Internalname) ;
      A9447OMRepNom = httpContext.cgiGet( edtOMRepNom_Internalname) ;
      n9447OMRepNom = false ;
      cmbOMRTpo.setName( cmbOMRTpo.getInternalname() );
      cmbOMRTpo.setValue( httpContext.cgiGet( cmbOMRTpo.getInternalname()) );
      A9449OMRTpo = httpContext.cgiGet( cmbOMRTpo.getInternalname()) ;
      A9448OMRepPre = localUtil.ctond( httpContext.cgiGet( edtOMRepPre_Internalname)) ;
      n9448OMRepPre = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRRCNT_" + sGXsfl_109_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRRCnt_Internalname ;
         wbErr = true ;
         A9450OMRRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRRPRE_" + sGXsfl_109_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRRPre_Internalname ;
         wbErr = true ;
         A9451OMRRPre = DecimalUtil.ZERO ;
      }
      else
      {
         A9451OMRRPre = localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)) ;
      }
      A9471OMRRCos = localUtil.ctond( httpContext.cgiGet( edtOMRRCos_Internalname)) ;
      GXCCtl = "GXHCOMREPCOD_" + sGXsfl_109_idx ;
      A9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_109_idx ;
      Z9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_109_idx ;
      Z9449OMRTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_109_idx ;
      Z9451OMRRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_109_idx ;
      Z9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_109_idx ;
      Z9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_109_idx ;
      Z9453OMRCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_109_idx ;
      A9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_109_idx ;
      A9453OMRCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9450OMRRCnt_" + sGXsfl_109_idx ;
      O9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9454OMRCCos_" + sGXsfl_109_idx ;
      O9454OMRCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9471OMRRCos_" + sGXsfl_109_idx ;
      O9471OMRRCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "OMRCCOS_" + sGXsfl_109_idx ;
      A9454OMRCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_109_idx ;
      nRcdDeleted_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1233_" + sGXsfl_109_idx ;
      nRcdExists_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1233_" + sGXsfl_109_idx ;
      nIsMod_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_931234( )
   {
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_93_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_93_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_93_idx );
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_93_idx ;
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_93_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_93_idx ;
      edtOMMRCos_Internalname = "OMMRCOS_"+sGXsfl_93_idx ;
   }

   public void subsflControlProps_fel_931234( )
   {
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_93_fel_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_93_fel_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_93_fel_idx );
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_93_fel_idx ;
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_93_fel_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_93_fel_idx ;
      edtOMMRCos_Internalname = "OMMRCOS_"+sGXsfl_93_fel_idx ;
   }

   public void addRow13U1234( )
   {
      nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_931234( ) ;
      sendRow13U1234( ) ;
   }

   public void sendRow13U1234( )
   {
      Gridlevel_operadorRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_operador_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_operador_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_operador_Class, "") != 0 )
         {
            subGridlevel_operador_Linesclass = subGridlevel_operador_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_operador_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_operador_Backstyle = (byte)(0) ;
         subGridlevel_operador_Backcolor = subGridlevel_operador_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_operador_Class, "") != 0 )
         {
            subGridlevel_operador_Linesclass = subGridlevel_operador_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_operador_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_operador_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_operador_Class, "") != 0 )
         {
            subGridlevel_operador_Linesclass = subGridlevel_operador_Class+"Odd" ;
         }
         subGridlevel_operador_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_operador_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_operador_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_93_idx) % (2))) == 0 )
         {
            subGridlevel_operador_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_operador_Class, "") != 0 )
            {
               subGridlevel_operador_Linesclass = subGridlevel_operador_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_operador_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_operador_Class, "") != 0 )
            {
               subGridlevel_operador_Linesclass = subGridlevel_operador_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_operadorRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeCod_Internalname,h9455OMOpeCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_operadorRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeNom_Internalname,GXutil.rtrim( A9456OMOpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtOMOpeNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      GXCCtl = "OMMTPO_" + sGXsfl_93_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         A9458OMMTpo = cmbOMMTpo.getValidValue(A9458OMMTpo) ;
      }
      /* ComboBox */
      Gridlevel_operadorRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMMTpo,cmbOMMTpo.getInternalname(),GXutil.rtrim( A9458OMMTpo),Integer.valueOf(1),cmbOMMTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMMTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Values", cmbOMMTpo.ToJavascriptSource(), !bGXsfl_93_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_operadorRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpePre_Internalname,GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMOpePre_Enabled!=0) ? localUtil.format( A9457OMOpePre, "ZZZZZ9.999") : localUtil.format( A9457OMOpePre, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpePre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMOpePre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_operadorRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRCnt_Enabled!=0) ? localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_operadorRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMRPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_operadorRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRCos_Enabled!=0) ? localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999") : localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMRCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_operadorRow);
      send_integrity_lvl_hashes13U1234( ) ;
      GXCCtl = "GXHCOMOPECOD_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9458OMMTpo));
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9463OMMCCos_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9472OMMRCos_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "OMMCCOS_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1234_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1234_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_93_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vACCION_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20Accion));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPECOD_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPENOM_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMTPO_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPEPRE_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCNT_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRPRE_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCOS_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_operadorContainer.AddRow(Gridlevel_operadorRow);
   }

   public void readRow13U1234( )
   {
      nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_931234( ) ;
      edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCOS_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9455OMOpeCod = httpContext.cgiGet( edtOMOpeCod_Internalname) ;
      A9456OMOpeNom = httpContext.cgiGet( edtOMOpeNom_Internalname) ;
      n9456OMOpeNom = false ;
      cmbOMMTpo.setName( cmbOMMTpo.getInternalname() );
      cmbOMMTpo.setValue( httpContext.cgiGet( cmbOMMTpo.getInternalname()) );
      A9458OMMTpo = httpContext.cgiGet( cmbOMMTpo.getInternalname()) ;
      A9457OMOpePre = localUtil.ctond( httpContext.cgiGet( edtOMOpePre_Internalname)) ;
      n9457OMOpePre = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMRCNT_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMRCnt_Internalname ;
         wbErr = true ;
         A9459OMMRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMRPRE_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMRPre_Internalname ;
         wbErr = true ;
         A9460OMMRPre = DecimalUtil.ZERO ;
      }
      else
      {
         A9460OMMRPre = localUtil.ctond( httpContext.cgiGet( edtOMMRPre_Internalname)) ;
      }
      A9472OMMRCos = localUtil.ctond( httpContext.cgiGet( edtOMMRCos_Internalname)) ;
      GXCCtl = "GXHCOMOPECOD_" + sGXsfl_93_idx ;
      A9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_93_idx ;
      Z9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_93_idx ;
      Z9458OMMTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_93_idx ;
      Z9460OMMRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_93_idx ;
      Z9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_93_idx ;
      Z9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_93_idx ;
      Z9462OMMCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_93_idx ;
      A9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_93_idx ;
      A9462OMMCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9463OMMCCos_" + sGXsfl_93_idx ;
      O9463OMMCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9472OMMRCos_" + sGXsfl_93_idx ;
      O9472OMMRCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "OMMCCOS_" + sGXsfl_93_idx ;
      A9463OMMCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_93_idx ;
      nRcdDeleted_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1234_" + sGXsfl_93_idx ;
      nRcdExists_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1234_" + sGXsfl_93_idx ;
      nIsMod_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOMMPieCod_Enabled = edtOMMPieCod_Enabled ;
      defedtOMMSEqCod_Enabled = edtOMMSEqCod_Enabled ;
      defedtOMMEquCod_Enabled = edtOMMEquCod_Enabled ;
      defedtOMRRPre_Enabled = edtOMRRPre_Enabled ;
      defcmbOMRTpo_Enabled = cmbOMRTpo.getEnabled() ;
      defcmbOMRTpo_Enabled = cmbOMRTpo.getEnabled() ;
      defedtOMRepNom_Enabled = edtOMRepNom_Enabled ;
      defedtOMRepCod_Enabled = edtOMRepCod_Enabled ;
      defedtOMMRPre_Enabled = edtOMMRPre_Enabled ;
      defcmbOMMTpo_Enabled = cmbOMMTpo.getEnabled() ;
      defcmbOMMTpo_Enabled = cmbOMMTpo.getEnabled() ;
      defedtOMOpeNom_Enabled = edtOMOpeNom_Enabled ;
      defedtOMOpeCod_Enabled = edtOMOpeCod_Enabled ;
      defedtTMTxt_Enabled = edtTMTxt_Enabled ;
      defedtTMDsc_Enabled = edtTMDsc_Enabled ;
      defedtTMCod_Enabled = edtTMCod_Enabled ;
   }

   public void confirmValues13U0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851530( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851530( ) ;
         httpContext.changePostValue( "Z9430TMCod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z9430TMCod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_85_idx) ;
      }
      nGXsfl_93_idx = 0 ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_931234( ) ;
      while ( nGXsfl_93_idx < nRC_GXsfl_93 )
      {
         nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_931234( ) ;
         httpContext.changePostValue( "Z9455OMOpeCod_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z9458OMMTpo_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z9458OMMTpo_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z9460OMMRPre_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z9460OMMRPre_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z9459OMMRCnt_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z9461OMMCCnt_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z9462OMMCPre_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z9462OMMCPre_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_93_idx) ;
      }
      nGXsfl_109_idx = 0 ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1091233( ) ;
      while ( nGXsfl_109_idx < nRC_GXsfl_109 )
      {
         nGXsfl_109_idx = (int)(nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1091233( ) ;
         httpContext.changePostValue( "Z9446OMRepCod_"+sGXsfl_109_idx, httpContext.cgiGet( "ZT_"+"Z9446OMRepCod_"+sGXsfl_109_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_109_idx) ;
         httpContext.changePostValue( "Z9449OMRTpo_"+sGXsfl_109_idx, httpContext.cgiGet( "ZT_"+"Z9449OMRTpo_"+sGXsfl_109_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_109_idx) ;
         httpContext.changePostValue( "Z9451OMRRPre_"+sGXsfl_109_idx, httpContext.cgiGet( "ZT_"+"Z9451OMRRPre_"+sGXsfl_109_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_109_idx) ;
         httpContext.changePostValue( "Z9450OMRRCnt_"+sGXsfl_109_idx, httpContext.cgiGet( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_109_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_109_idx) ;
         httpContext.changePostValue( "Z9452OMRCCnt_"+sGXsfl_109_idx, httpContext.cgiGet( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_109_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_109_idx) ;
         httpContext.changePostValue( "Z9453OMRCPre_"+sGXsfl_109_idx, httpContext.cgiGet( "ZT_"+"Z9453OMRCPre_"+sGXsfl_109_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_109_idx) ;
      }
      nGXsfl_121_idx = 0 ;
      sGXsfl_121_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_121_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1211531( ) ;
      while ( nGXsfl_121_idx < nRC_GXsfl_121 )
      {
         nGXsfl_121_idx = (int)(nGXsfl_121_idx+1) ;
         sGXsfl_121_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_121_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1211531( ) ;
         httpContext.changePostValue( "Z11446OMMEquCod_"+sGXsfl_121_idx, httpContext.cgiGet( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_121_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11446OMMEquCod_"+sGXsfl_121_idx) ;
         httpContext.changePostValue( "Z11447OMMSEqCod_"+sGXsfl_121_idx, httpContext.cgiGet( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_121_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11447OMMSEqCod_"+sGXsfl_121_idx) ;
         httpContext.changePostValue( "Z11448OMMPieCod_"+sGXsfl_121_idx, httpContext.cgiGet( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_121_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11448OMMPieCod_"+sGXsfl_121_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV20Accion))}, new String[] {"Gx_mode","EmprCod","OMCod","Accion"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrden");
      forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("OMUsuCre", GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")));
      forbiddenHiddens.add("OMFchCre", localUtil.format( A9436OMFchCre, "99/99/99 99:99"));
      forbiddenHiddens.add("OMFchCer", localUtil.format( A9439OMFchCer, "99/99/99 99:99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmorden:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9437OMUsuCre", GXutil.rtrim( Z9437OMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9433OMTxt", Z9433OMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9438OMFchPre", localUtil.dtoc( Z9438OMFchPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9436OMFchCre", localUtil.ttoc( Z9436OMFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9464OMNot", Z9464OMNot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9439OMFchCer", localUtil.ttoc( Z9439OMFchCer, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9426OMMaqCod", GXutil.rtrim( Z9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9429PMCod", GXutil.ltrim( localUtil.ntoc( Z9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9428SMCod", GXutil.ltrim( localUtil.ntoc( Z9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( O9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9442OMMRCosT", GXutil.ltrim( localUtil.ntoc( O9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9443OMRCCosT", GXutil.ltrim( localUtil.ntoc( O9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( O9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_121", GXutil.ltrim( localUtil.ntoc( nGXsfl_121_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_109", GXutil.ltrim( localUtil.ntoc( nGXsfl_109_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_93", GXutil.ltrim( localUtil.ntoc( nGXsfl_93_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9426OMMaqCod", GXutil.rtrim( A9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N9428SMCod", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9429PMCod", GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vACCION", GXutil.rtrim( AV20Accion));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Accion, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_SMCOD", GXutil.ltrim( localUtil.ntoc( AV28Insert_SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCSMCOD", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PMCOD", GXutil.ltrim( localUtil.ntoc( AV27Insert_PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV46Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTMCOD", GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCNT", GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCPRE", GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCOS", GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOOMRRCNT", GXutil.ltrim( localUtil.ntoc( AV16oOMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMRRCNT", GXutil.ltrim( localUtil.ntoc( AV19nOMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERVERNOW", localUtil.ttoc( AV29ServerNow, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCOMREPCOD", GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVNOM", GXutil.rtrim( AV18MTMovNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVCOD", GXutil.ltrim( localUtil.ntoc( AV17MTMovCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCNT", GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCPRE", GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCOS", GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCOMOPECOD", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Objectcall", GXutil.rtrim( Combo_ommaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Cls", GXutil.rtrim( Combo_ommaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_ommaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Enabled", GXutil.booltostr( Combo_ommaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCOD_Emptyitemtext", GXutil.rtrim( Combo_ommaqcod_Emptyitemtext));
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
      return formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV20Accion))}, new String[] {"Gx_mode","EmprCod","OMCod","Accion"})  ;
   }

   public String getPgmname( )
   {
      return "TMOrden" ;
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
      A9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9445OMEst = httpContext.getMessage( "P", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      O9441OMMCCosT = A9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      O9442OMMRCosT = A9442OMMRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      O9443OMRCCosT = A9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      O9444OMRRCosT = A9444OMRRCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      Z9437OMUsuCre = "" ;
      Z9433OMTxt = "" ;
      Z9438OMFchPre = GXutil.nullDate() ;
      Z9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9445OMEst = "" ;
      Z9464OMNot = "" ;
      Z9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      Z9426OMMaqCod = "" ;
      Z9429PMCod = 0 ;
      Z9428SMCod = 0 ;
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
      A12599OMMEquDsc = "" ;
      A12600OMMSEqDsc = "" ;
      A11449OMMPieDsc = "" ;
      n11449OMMPieDsc = false ;
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
      A9432TMTxt = "" ;
      n9432TMTxt = false ;
   }

   public void initAll13U1530( )
   {
      h9430TMCod = "" ;
      initializeNonKey13U1530( ) ;
   }

   public void standaloneModalInsert13U1530( )
   {
   }

   public void initializeNonKey13U1233( )
   {
      AV16oOMRRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
      AV19nOMRRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19nOMRRCnt", GXutil.ltrimstr( AV19nOMRRCnt, 12, 3));
      AV29ServerNow = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV29ServerNow", localUtil.ttoc( AV29ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9454OMRCCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9454OMRCCos", GXutil.ltrimstr( A9454OMRCCos, 12, 3));
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9447OMRepNom = "" ;
      n9447OMRepNom = false ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      n9448OMRepPre = false ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9452OMRCCnt", GXutil.ltrimstr( A9452OMRCCnt, 12, 3));
      A9453OMRCPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9453OMRCPre", GXutil.ltrimstr( A9453OMRCPre, 12, 3));
      A9451OMRRPre = DecimalUtil.ZERO ;
      O9450OMRRCnt = A9450OMRRCnt ;
      O9454OMRCCos = A9454OMRCCos ;
      httpContext.ajax_rsp_assign_attri("", false, "A9454OMRCCos", GXutil.ltrimstr( A9454OMRCCos, 12, 3));
      O9471OMRRCos = A9471OMRRCos ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
   }

   public void initAll13U1233( )
   {
      h9446OMRepCod = "" ;
      A9449OMRTpo = "" ;
      initializeNonKey13U1233( ) ;
   }

   public void standaloneModalInsert13U1233( )
   {
      A9443OMRCCosT = i9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
   }

   public void initializeNonKey13U1234( )
   {
      A9463OMMCCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9463OMMCCos", GXutil.ltrimstr( A9463OMMCCos, 12, 3));
      A9472OMMRCos = DecimalUtil.ZERO ;
      A9456OMOpeNom = "" ;
      n9456OMOpeNom = false ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      n9457OMOpePre = false ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9461OMMCCnt", GXutil.ltrimstr( A9461OMMCCnt, 12, 3));
      A9462OMMCPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9462OMMCPre", GXutil.ltrimstr( A9462OMMCPre, 12, 3));
      A9460OMMRPre = DecimalUtil.ZERO ;
      O9463OMMCCos = A9463OMMCCos ;
      httpContext.ajax_rsp_assign_attri("", false, "A9463OMMCCos", GXutil.ltrimstr( A9463OMMCCos, 12, 3));
      O9472OMMRCos = A9472OMMRCos ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
   }

   public void initAll13U1234( )
   {
      h9455OMOpeCod = "" ;
      A9458OMMTpo = "" ;
      initializeNonKey13U1234( ) ;
   }

   public void standaloneModalInsert13U1234( )
   {
      A9441OMMCCosT = i9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623135438", true, true);
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
      httpContext.AddJavascriptSource("tmorden.js", "?20263623135439", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1531( )
   {
      edtOMMPieCod_Enabled = defedtOMMPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMPieCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      edtOMMSEqCod_Enabled = defedtOMMSEqCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMSEqCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
      edtOMMEquCod_Enabled = defedtOMMEquCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMEquCod_Enabled), 5, 0), !bGXsfl_121_Refreshing);
   }

   public void init_level_properties1530( )
   {
      edtTMTxt_Enabled = defedtTMTxt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMTxt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtTMDsc_Enabled = defedtTMDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMDsc_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtTMCod_Enabled = defedtTMCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void init_level_properties1233( )
   {
      edtOMRRPre_Enabled = defedtOMRRPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      cmbOMRTpo.setEnabled( defcmbOMRTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_109_Refreshing);
      cmbOMRTpo.setEnabled( defcmbOMRTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_109_Refreshing);
      edtOMRepNom_Enabled = defedtOMRepNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtOMRepCod_Enabled = defedtOMRepCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_109_Refreshing);
   }

   public void init_level_properties1234( )
   {
      edtOMMRPre_Enabled = defedtOMMRPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      cmbOMMTpo.setEnabled( defcmbOMMTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_93_Refreshing);
      cmbOMMTpo.setEnabled( defcmbOMMTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_93_Refreshing);
      edtOMOpeNom_Enabled = defedtOMOpeNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtOMOpeCod_Enabled = defedtOMOpeCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_93_Refreshing);
   }

   public void startgridcontrol85( )
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
      Gridlevel_tareasColumn.AddObjectProperty("Value", h9430TMCod);
      Gridlevel_tareasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddColumnProperties(Gridlevel_tareasColumn);
      Gridlevel_tareasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tareasColumn.AddObjectProperty("Value", GXutil.rtrim( A9431TMDsc));
      Gridlevel_tareasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddColumnProperties(Gridlevel_tareasColumn);
      Gridlevel_tareasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tareasColumn.AddObjectProperty("Value", A9432TMTxt);
      Gridlevel_tareasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddColumnProperties(Gridlevel_tareasColumn);
      Gridlevel_tareasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol93( )
   {
      Gridlevel_operadorContainer.AddObjectProperty("GridName", "Gridlevel_operador");
      Gridlevel_operadorContainer.AddObjectProperty("Header", subGridlevel_operador_Header);
      Gridlevel_operadorContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_operadorContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_operadorContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_operadorColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_operadorColumn.AddObjectProperty("Value", h9455OMOpeCod);
      Gridlevel_operadorColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddColumnProperties(Gridlevel_operadorColumn);
      Gridlevel_operadorColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_operadorColumn.AddObjectProperty("Value", GXutil.rtrim( A9456OMOpeNom));
      Gridlevel_operadorColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddColumnProperties(Gridlevel_operadorColumn);
      Gridlevel_operadorColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_operadorColumn.AddObjectProperty("Value", GXutil.rtrim( A9458OMMTpo));
      Gridlevel_operadorColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddColumnProperties(Gridlevel_operadorColumn);
      Gridlevel_operadorColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_operadorColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      Gridlevel_operadorColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddColumnProperties(Gridlevel_operadorColumn);
      Gridlevel_operadorColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_operadorColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_operadorColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddColumnProperties(Gridlevel_operadorColumn);
      Gridlevel_operadorColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_operadorColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_operadorColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddColumnProperties(Gridlevel_operadorColumn);
      Gridlevel_operadorColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_operadorColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_operadorColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddColumnProperties(Gridlevel_operadorColumn);
      Gridlevel_operadorContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_operadorContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_operador_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol109( )
   {
      Gridlevel_repuestoContainer.AddObjectProperty("GridName", "Gridlevel_repuesto");
      Gridlevel_repuestoContainer.AddObjectProperty("Header", subGridlevel_repuesto_Header);
      Gridlevel_repuestoContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_repuestoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_repuestoContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_repuestoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestoColumn.AddObjectProperty("Value", h9446OMRepCod);
      Gridlevel_repuestoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddColumnProperties(Gridlevel_repuestoColumn);
      Gridlevel_repuestoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestoColumn.AddObjectProperty("Value", GXutil.rtrim( A9447OMRepNom));
      Gridlevel_repuestoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddColumnProperties(Gridlevel_repuestoColumn);
      Gridlevel_repuestoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestoColumn.AddObjectProperty("Value", GXutil.rtrim( A9449OMRTpo));
      Gridlevel_repuestoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddColumnProperties(Gridlevel_repuestoColumn);
      Gridlevel_repuestoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_repuestoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddColumnProperties(Gridlevel_repuestoColumn);
      Gridlevel_repuestoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_repuestoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddColumnProperties(Gridlevel_repuestoColumn);
      Gridlevel_repuestoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_repuestoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddColumnProperties(Gridlevel_repuestoColumn);
      Gridlevel_repuestoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_repuestoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddColumnProperties(Gridlevel_repuestoColumn);
      Gridlevel_repuestoContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuesto_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol121( )
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
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A12599OMMEquDsc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11447OMMSEqCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A12600OMMSEqDsc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11448OMMPieCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11449OMMPieDsc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtOMCod_Internalname = "OMCOD" ;
      lblTextblockommaqcod_Internalname = "TEXTBLOCKOMMAQCOD" ;
      Combo_ommaqcod_Internalname = "COMBO_OMMAQCOD" ;
      edtOMMaqCod_Internalname = "OMMAQCOD" ;
      divTablesplittedommaqcod_Internalname = "TABLESPLITTEDOMMAQCOD" ;
      edtOMFchPre_Internalname = "OMFCHPRE" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtOMFchCre_Internalname = "OMFCHCRE" ;
      edtOMUsuCre_Internalname = "OMUSUCRE" ;
      edtOMFchCer_Internalname = "OMFCHCER" ;
      edtSMCod_Internalname = "SMCOD" ;
      divSmcod_cell_Internalname = "SMCOD_CELL" ;
      edtPMCod_Internalname = "PMCOD" ;
      divPmcod_cell_Internalname = "PMCOD_CELL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtOMTxt_Internalname = "OMTXT" ;
      edtOMNot_Internalname = "OMNOT" ;
      tblTabletextonota_Internalname = "TABLETEXTONOTA" ;
      Dvpanel_tabletextonota_Internalname = "DVPANEL_TABLETEXTONOTA" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtTMCod_Internalname = "TMCOD" ;
      edtTMDsc_Internalname = "TMDSC" ;
      edtTMTxt_Internalname = "TMTXT" ;
      divTableleaflevel_tareas_Internalname = "TABLELEAFLEVEL_TAREAS" ;
      edtOMOpeCod_Internalname = "OMOPECOD" ;
      edtOMOpeNom_Internalname = "OMOPENOM" ;
      cmbOMMTpo.setInternalname( "OMMTPO" );
      edtOMOpePre_Internalname = "OMOPEPRE" ;
      edtOMMRCnt_Internalname = "OMMRCNT" ;
      edtOMMRPre_Internalname = "OMMRPRE" ;
      edtOMMRCos_Internalname = "OMMRCOS" ;
      divTableleaflevel_operador_Internalname = "TABLELEAFLEVEL_OPERADOR" ;
      divTableequipotarea_Internalname = "TABLEEQUIPOTAREA" ;
      edtOMRepCod_Internalname = "OMREPCOD" ;
      edtOMRepNom_Internalname = "OMREPNOM" ;
      cmbOMRTpo.setInternalname( "OMRTPO" );
      edtOMRepPre_Internalname = "OMREPPRE" ;
      edtOMRRCnt_Internalname = "OMRRCNT" ;
      edtOMRRPre_Internalname = "OMRRPRE" ;
      edtOMRRCos_Internalname = "OMRRCOS" ;
      divTableleaflevel_repuesto_Internalname = "TABLELEAFLEVEL_REPUESTO" ;
      edtOMMEquCod_Internalname = "OMMEQUCOD" ;
      edtOMMEquDsc_Internalname = "OMMEQUDSC" ;
      edtOMMSEqCod_Internalname = "OMMSEQCOD" ;
      edtOMMSEqDsc_Internalname = "OMMSEQDSC" ;
      edtOMMPieCod_Internalname = "OMMPIECOD" ;
      edtOMMPieDsc_Internalname = "OMMPIEDSC" ;
      divTableleaflevel_equipos_Internalname = "TABLELEAFLEVEL_EQUIPOS" ;
      divTablerepuestooperador_Internalname = "TABLEREPUESTOOPERADOR" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboommaqcod_Internalname = "vCOMBOOMMAQCOD" ;
      divSectionattribute_ommaqcod_Internalname = "SECTIONATTRIBUTE_OMMAQCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO" ;
      edtOMMaqDsc_Internalname = "OMMAQDSC" ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA" ;
      edtOMDuracion_Internalname = "OMDURACION" ;
      edtOMCosRea_Internalname = "OMCOSREA" ;
      edtOMRRCosT_Internalname = "OMRRCOST" ;
      edtOMRCCosT_Internalname = "OMRCCOST" ;
      edtOMMRCosT_Internalname = "OMMRCOST" ;
      edtOMMCCosT_Internalname = "OMMCCOST" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_tareas_Internalname = "GRIDLEVEL_TAREAS" ;
      subGridlevel_operador_Internalname = "GRIDLEVEL_OPERADOR" ;
      subGridlevel_repuesto_Internalname = "GRIDLEVEL_REPUESTO" ;
      subGridlevel_equipos_Internalname = "GRIDLEVEL_EQUIPOS" ;
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
      subGridlevel_equipos_Allowcollapsing = (byte)(0) ;
      subGridlevel_equipos_Allowselection = (byte)(0) ;
      subGridlevel_equipos_Header = "" ;
      subGridlevel_repuesto_Allowcollapsing = (byte)(0) ;
      subGridlevel_repuesto_Allowselection = (byte)(0) ;
      subGridlevel_repuesto_Header = "" ;
      subGridlevel_operador_Allowcollapsing = (byte)(0) ;
      subGridlevel_operador_Allowselection = (byte)(0) ;
      subGridlevel_operador_Header = "" ;
      subGridlevel_tareas_Allowcollapsing = (byte)(0) ;
      subGridlevel_tareas_Allowselection = (byte)(0) ;
      subGridlevel_tareas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Ordenes de Mantenimiento", "") );
      edtOMMRCos_Jsonclick = "" ;
      edtOMMRPre_Jsonclick = "" ;
      edtOMMRCnt_Jsonclick = "" ;
      edtOMOpePre_Jsonclick = "" ;
      cmbOMMTpo.setJsonclick( "" );
      edtOMOpeNom_Jsonclick = "" ;
      edtOMOpeCod_Jsonclick = "" ;
      subGridlevel_operador_Class = "GridNoBorder WorkWith" ;
      subGridlevel_operador_Backcolorstyle = (byte)(0) ;
      edtOMRRCos_Jsonclick = "" ;
      edtOMRRPre_Jsonclick = "" ;
      edtOMRRCnt_Jsonclick = "" ;
      edtOMRepPre_Jsonclick = "" ;
      cmbOMRTpo.setJsonclick( "" );
      edtOMRepNom_Jsonclick = "" ;
      edtOMRepCod_Jsonclick = "" ;
      subGridlevel_repuesto_Class = "GridNoBorder WorkWith" ;
      subGridlevel_repuesto_Backcolorstyle = (byte)(0) ;
      edtTMTxt_Jsonclick = "" ;
      edtTMDsc_Jsonclick = "" ;
      edtTMCod_Jsonclick = "" ;
      subGridlevel_tareas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_tareas_Backcolorstyle = (byte)(0) ;
      edtOMMPieDsc_Jsonclick = "" ;
      edtOMMPieCod_Jsonclick = "" ;
      edtOMMSEqDsc_Jsonclick = "" ;
      edtOMMSEqCod_Jsonclick = "" ;
      edtOMMEquDsc_Jsonclick = "" ;
      edtOMMEquCod_Jsonclick = "" ;
      subGridlevel_equipos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_equipos_Backcolorstyle = (byte)(0) ;
      edtOMMPieDsc_Enabled = 0 ;
      edtOMMPieCod_Enabled = 1 ;
      edtOMMSEqDsc_Enabled = 0 ;
      edtOMMSEqCod_Enabled = 1 ;
      edtOMMEquDsc_Enabled = 0 ;
      edtOMMEquCod_Enabled = 1 ;
      edtOMRRCos_Enabled = 0 ;
      edtOMRRPre_Enabled = 1 ;
      edtOMRRCnt_Enabled = 1 ;
      edtOMRepPre_Enabled = 0 ;
      cmbOMRTpo.setEnabled( 1 );
      edtOMRepNom_Enabled = 0 ;
      edtOMRepCod_Enabled = 1 ;
      edtOMMRCos_Enabled = 0 ;
      edtOMMRPre_Enabled = 1 ;
      edtOMMRCnt_Enabled = 1 ;
      edtOMOpePre_Enabled = 0 ;
      cmbOMMTpo.setEnabled( 1 );
      edtOMOpeNom_Enabled = 0 ;
      edtOMOpeCod_Enabled = 1 ;
      edtTMTxt_Enabled = 0 ;
      edtTMDsc_Enabled = 0 ;
      edtTMCod_Enabled = 1 ;
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
      edtavComboommaqcod_Jsonclick = "" ;
      edtavComboommaqcod_Enabled = 0 ;
      edtavComboommaqcod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      divTableleaflevel_equipos_Visible = 1 ;
      edtOMNot_Enabled = 1 ;
      edtOMTxt_Enabled = 1 ;
      Dvpanel_tabletextonota_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Iconposition = "Right" ;
      Dvpanel_tabletextonota_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tabletextonota_Title = httpContext.getMessage( "Texto", "") ;
      Dvpanel_tabletextonota_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tabletextonota_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tabletextonota_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tabletextonota_Width = "100%" ;
      edtPMCod_Jsonclick = "" ;
      edtPMCod_Enabled = 1 ;
      edtPMCod_Visible = 1 ;
      divPmcod_cell_Class = "col-xs-12 col-sm-4" ;
      edtSMCod_Jsonclick = "" ;
      edtSMCod_Enabled = 1 ;
      edtSMCod_Visible = 1 ;
      divSmcod_cell_Class = "col-xs-12 col-sm-4" ;
      edtOMFchCer_Jsonclick = "" ;
      edtOMFchCer_Enabled = 0 ;
      edtOMUsuCre_Jsonclick = "" ;
      edtOMUsuCre_Enabled = 0 ;
      edtOMFchCre_Jsonclick = "" ;
      edtOMFchCre_Enabled = 0 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 0 );
      edtOMFchPre_Jsonclick = "" ;
      edtOMFchPre_Enabled = 1 ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMMaqCod_Enabled = 1 ;
      edtOMMaqCod_Visible = 1 ;
      Combo_ommaqcod_Emptyitemtext = "Ninguna" ;
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
      /* Using cursor T013U97 */
      pr_default.execute(87, new Object[] {A396EmprCod, l9517SMDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(87) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T013U97_A9517SMDsc[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T013U97_A9517SMDsc[0]));
         pr_default.readNext(87);
      }
      pr_default.close(87);
   }

   public void gxsgatmcod13U0( String A396EmprCod ,
                               String A13749TMCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatmcod_data13U0( A396EmprCod, A13749TMCDsc) ;
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

   protected void gxsgatmcod_data13U0( String A396EmprCod ,
                                       String A13749TMCDsc )
   {
      l13749TMCDsc = GXutil.concat( GXutil.rtrim( A13749TMCDsc), "%", "") ;
      /* Using cursor T013U98 */
      pr_default.execute(88, new Object[] {A396EmprCod, l13749TMCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(88) != 101) )
      {
         gxdynajaxctrlcodr.add(T013U98_A13749TMCDsc[0]);
         gxdynajaxctrldescr.add(T013U98_A13749TMCDsc[0]);
         pr_default.readNext(88);
      }
      pr_default.close(88);
   }

   public void gxsgaomrepcod13U0( String A396EmprCod ,
                                  String A13718MRCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaomrepcod_data13U0( A396EmprCod, A13718MRCNom) ;
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

   protected void gxsgaomrepcod_data13U0( String A396EmprCod ,
                                          String A13718MRCNom )
   {
      l13718MRCNom = GXutil.concat( GXutil.rtrim( A13718MRCNom), "%", "") ;
      /* Using cursor T013U99 */
      pr_default.execute(89, new Object[] {A396EmprCod, l13718MRCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(89) != 101) )
      {
         gxdynajaxctrlcodr.add(T013U99_A13718MRCNom[0]);
         gxdynajaxctrldescr.add(T013U99_A13718MRCNom[0]);
         pr_default.readNext(89);
      }
      pr_default.close(89);
   }

   public void gxsgaomopecod13U0( String A396EmprCod ,
                                  String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaomopecod_data13U0( A396EmprCod, A13748OpeCNom) ;
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

   protected void gxsgaomopecod_data13U0( String A396EmprCod ,
                                          String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor T013U100 */
      pr_default.execute(90, new Object[] {A396EmprCod, l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(90) != 101) )
      {
         gxdynajaxctrlcodr.add(T013U100_A13748OpeCNom[0]);
         gxdynajaxctrldescr.add(T013U100_A13748OpeCNom[0]);
         pr_default.readNext(90);
      }
      pr_default.close(90);
   }

   public void gxhcasmcod13U1232( String A396EmprCod ,
                                  String A9517SMDsc )
   {
      /* Using cursor T013U101 */
      pr_default.execute(91, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(91) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A9517SMDsc = T013U101_A9517SMDsc[0] ;
         n9517SMDsc = T013U101_n9517SMDsc[0] ;
         A396EmprCod = T013U101_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013U101_A9428SMCod[0] ;
         n9428SMCod = T013U101_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         pr_default.readNext(91);
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
      pr_default.close(91);
   }

   public void gxhcatmcod13U1530( String A396EmprCod ,
                                  String A13749TMCDsc )
   {
      /* Using cursor T013U102 */
      pr_default.execute(92, new Object[] {A13749TMCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(92) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13749TMCDsc = T013U102_A13749TMCDsc[0] ;
         A396EmprCod = T013U102_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = T013U102_A9430TMCod[0] ;
         pr_default.readNext(92);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(92);
   }

   public void gxhcaomrepcod13U1233( String A396EmprCod ,
                                     String A13718MRCNom )
   {
      /* Using cursor T013U103 */
      pr_default.execute(93, new Object[] {A13718MRCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(93) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13718MRCNom = T013U103_A13718MRCNom[0] ;
         A396EmprCod = T013U103_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T013U103_A9492MRCod[0] ;
         pr_default.readNext(93);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(93);
   }

   public void gxhcaomopecod13U1234( String A396EmprCod ,
                                     String A13748OpeCNom )
   {
      /* Using cursor T013U104 */
      pr_default.execute(94, new Object[] {A13748OpeCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(94) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13748OpeCNom = T013U104_A13748OpeCNom[0] ;
         A396EmprCod = T013U104_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = T013U104_A652OpeCod[0] ;
         pr_default.readNext(94);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(94);
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
         GXt_int11 = A9425OMCod ;
         GXv_int13[0] = GXt_int11 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTORD", ""), ""), GXv_int13) ;
         tmorden_impl.this.GXt_int11 = GXv_int13[0] ;
         A9425OMCod = GXt_int11 ;
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

   public void xc_61_13U1233( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int13[0] = A9425OMCod ;
         GXv_int12[0] = A9446OMRepCod ;
         GXv_int8[0] = AV17MTMovCod ;
         GXv_char3[0] = AV18MTMovNom ;
         GXv_int14[0] = (byte)(1) ;
         GXv_decimal16[0] = AV16oOMRRCnt ;
         GXv_decimal15[0] = A9450OMRRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime17[0] = AV29ServerNow ;
         new app.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int12, GXv_int8, GXv_char3, GXv_int14, GXv_decimal16, GXv_decimal15, GXv_char2, GXv_dtime17) ;
         A396EmprCod = GXv_char4[0] ;
         A9425OMCod = GXv_int13[0] ;
         A9446OMRepCod = GXv_int12[0] ;
         AV17MTMovCod = GXv_int8[0] ;
         AV18MTMovNom = GXv_char3[0] ;
         AV16oOMRRCnt = GXv_decimal16[0] ;
         A9450OMRRCnt = GXv_decimal15[0] ;
         AV29ServerNow = GXv_dtime17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV29ServerNow", localUtil.ttoc( AV29ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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

   public void gxnrgridlevel_equipos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1211531( ) ;
      while ( nGXsfl_121_idx <= nRC_GXsfl_121 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13U1531( ) ;
         standaloneModal13U1531( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13U1531( ) ;
         nGXsfl_121_idx = (int)(nGXsfl_121_idx+1) ;
         sGXsfl_121_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_121_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1211531( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_equiposContainer)) ;
      /* End function gxnrGridlevel_equipos_newrow */
   }

   public void gxnrgridlevel_tareas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_851530( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13U1530( ) ;
         standaloneModal13U1530( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13U1530( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851530( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_tareasContainer)) ;
      /* End function gxnrGridlevel_tareas_newrow */
   }

   public void gxnrgridlevel_repuesto_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1091233( ) ;
      while ( nGXsfl_109_idx <= nRC_GXsfl_109 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13U1233( ) ;
         standaloneModal13U1233( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13U1233( ) ;
         nGXsfl_109_idx = (int)(nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1091233( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_repuestoContainer)) ;
      /* End function gxnrGridlevel_repuesto_newrow */
   }

   public void gxnrgridlevel_operador_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_931234( ) ;
      while ( nGXsfl_93_idx <= nRC_GXsfl_93 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13U1234( ) ;
         standaloneModal13U1234( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13U1234( ) ;
         nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_931234( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_operadorContainer)) ;
      /* End function gxnrGridlevel_operador_newrow */
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
      GXCCtl = "OMMTPO_" + sGXsfl_93_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         A9458OMMTpo = cmbOMMTpo.getValidValue(A9458OMMTpo) ;
      }
      GXCCtl = "OMRTPO_" + sGXsfl_109_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         A9449OMRTpo = cmbOMRTpo.getValidValue(A9449OMRTpo) ;
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
      /* Using cursor T013U48 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013U48_A407EmprNom[0] ;
      n407EmprNom = T013U48_n407EmprNom[0] ;
      pr_default.close(40);
      /* Using cursor T013U50 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         A9444OMRRCosT = T013U50_A9444OMRRCosT[0] ;
         A9443OMRCCosT = T013U50_A9443OMRCCosT[0] ;
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(41);
      /* Using cursor T013U52 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         A9442OMMRCosT = T013U52_A9442OMMRCosT[0] ;
         A9441OMMCCosT = T013U52_A9441OMMCCosT[0] ;
      }
      else
      {
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(42);
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
      /* Using cursor T013U53 */
      pr_default.execute(43, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9427OMMaqDsc = T013U53_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013U53_n9427OMMaqDsc[0] ;
      pr_default.close(43);
      /* Using cursor T013U54 */
      pr_default.execute(44, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(44) != 101) )
      {
         A13679OMMaqCodFo = T013U54_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = T013U54_n13679OMMaqCodFo[0] ;
      }
      else
      {
         A13679OMMaqCodFo = "" ;
         n13679OMMaqCodFo = false ;
      }
      pr_default.close(44);
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
         /* Using cursor T013U105 */
         pr_default.execute(95, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, A396EmprCod});
         A396EmprCod = T013U105_A396EmprCod[0] ;
         A9428SMCod = T013U105_A9428SMCod[0] ;
         n9428SMCod = T013U105_n9428SMCod[0] ;
         A9428SMCod = T013U105_A9428SMCod[0] ;
         n9428SMCod = T013U105_n9428SMCod[0] ;
         if ( ! ( (pr_default.getStatus(95) == 101) ) )
         {
            pr_default.readNext(95);
            if ( ! ( (pr_default.getStatus(95) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "SMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSMCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(95);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", h9428SMCod);
      /* Using cursor T013U106 */
      pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(96) == 101) )
      {
         if ( ! ( (0==A9428SMCod) && (GXutil.strcmp("", A9517SMDsc)==0) || (0==A9428SMCod) && n9428SMCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(96);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h9428SMCod", GXutil.rtrim( h9428SMCod));
   }

   public void valid_Pmcod( )
   {
      n9429PMCod = false ;
      /* Using cursor T013U107 */
      pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(97) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(97);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Ommpiecod( )
   {
      n11449OMMPieDsc = false ;
      /* Using cursor T013U63 */
      pr_default.execute(53, new Object[] {A396EmprCod, A9426OMMaqCod, A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Equipos En Ordenes de Mantenimeinto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMEquCod_Internalname ;
      }
      A12599OMMEquDsc = T013U63_A12599OMMEquDsc[0] ;
      A12600OMMSEqDsc = T013U63_A12600OMMSEqDsc[0] ;
      A11449OMMPieDsc = T013U63_A11449OMMPieDsc[0] ;
      n11449OMMPieDsc = T013U63_n11449OMMPieDsc[0] ;
      pr_default.close(53);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12599OMMEquDsc", GXutil.rtrim( A12599OMMEquDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12600OMMSEqDsc", GXutil.rtrim( A12600OMMSEqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11449OMMPieDsc", GXutil.rtrim( A11449OMMPieDsc));
   }

   public void valid_Tmcod( )
   {
      n9431TMDsc = false ;
      n9432TMTxt = false ;
      if ( (GXutil.strcmp("", h9430TMCod)==0) )
      {
         A9430TMCod = 0 ;
      }
      else
      {
         A13749TMCDsc = h9430TMCod ;
         /* Using cursor T013U108 */
         pr_default.execute(98, new Object[] {A13749TMCDsc, A396EmprCod});
         A9430TMCod = T013U108_A9430TMCod[0] ;
         A9430TMCod = T013U108_A9430TMCod[0] ;
         if ( ! ( (pr_default.getStatus(98) == 101) ) )
         {
            pr_default.readNext(98);
            if ( ! ( (pr_default.getStatus(98) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Descripcion", "")}), 1, "TMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTMCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(98);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9430TMCod", h9430TMCod);
      /* Using cursor T013U75 */
      pr_default.execute(65, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(65) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
      }
      A9431TMDsc = T013U75_A9431TMDsc[0] ;
      n9431TMDsc = T013U75_n9431TMDsc[0] ;
      A9432TMTxt = T013U75_A9432TMTxt[0] ;
      n9432TMTxt = T013U75_n9432TMTxt[0] ;
      pr_default.close(65);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", GXutil.rtrim( A9431TMDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
      httpContext.ajax_rsp_assign_attri("", false, "h9430TMCod", h9430TMCod);
   }

   public void valid_Omrepcod( )
   {
      n9448OMRepPre = false ;
      n9447OMRepNom = false ;
      if ( (GXutil.strcmp("", h9446OMRepCod)==0) )
      {
         A9446OMRepCod = 0 ;
      }
      else
      {
         A13718MRCNom = h9446OMRepCod ;
         /* Using cursor T013U109 */
         pr_default.execute(99, new Object[] {A13718MRCNom, A396EmprCod});
         A9446OMRepCod = T013U109_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(99) == 101) ) )
         {
            pr_default.readNext(99);
            if ( ! ( (pr_default.getStatus(99) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "OMREPCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMRepCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(99);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9446OMRepCod", h9446OMRepCod);
      /* Using cursor T013U85 */
      pr_default.execute(75, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(75) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMREPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
      }
      A9447OMRepNom = T013U85_A9447OMRepNom[0] ;
      n9447OMRepNom = T013U85_n9447OMRepNom[0] ;
      A9448OMRepPre = T013U85_A9448OMRepPre[0] ;
      n9448OMRepPre = T013U85_n9448OMRepPre[0] ;
      pr_default.close(75);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      dynload_actions( ) ;
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         A9449OMRTpo = cmbOMRTpo.getValidValue(A9449OMRTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMRTpo.setValue( GXutil.rtrim( A9449OMRTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9446OMRepCod", GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9447OMRepNom", GXutil.rtrim( A9447OMRepNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9448OMRepPre", GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9451OMRRPre", GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h9446OMRepCod", h9446OMRepCod);
   }

   public void valid_Omopecod( )
   {
      n9457OMOpePre = false ;
      n9456OMOpeNom = false ;
      if ( (GXutil.strcmp("", h9455OMOpeCod)==0) )
      {
         A9455OMOpeCod = 0 ;
      }
      else
      {
         A13748OpeCNom = h9455OMOpeCod ;
         /* Using cursor T013U110 */
         pr_default.execute(100, new Object[] {A13748OpeCNom, A396EmprCod});
         A9455OMOpeCod = T013U110_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(100) == 101) ) )
         {
            pr_default.readNext(100);
            if ( ! ( (pr_default.getStatus(100) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "OMOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMOpeCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(100);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9455OMOpeCod", h9455OMOpeCod);
      /* Using cursor T013U111 */
      pr_default.execute(101, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(101) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
      }
      A9456OMOpeNom = T013U111_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013U111_n9456OMOpeNom[0] ;
      A9457OMOpePre = T013U111_A9457OMOpePre[0] ;
      n9457OMOpePre = T013U111_n9457OMOpePre[0] ;
      pr_default.close(101);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9460OMMRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9460OMMRPre = A9457OMOpePre ;
      }
      dynload_actions( ) ;
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         A9458OMMTpo = cmbOMMTpo.getValidValue(A9458OMMTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", GXutil.rtrim( A9456OMOpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9457OMOpePre", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9460OMMRPre", GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h9455OMOpeCod", h9455OMOpeCod);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20Accion',fld:'vACCION',pic:'',hsh:true},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9437OMUsuCre',fld:'OMUSUCRE',pic:'@!'},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213U2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[]");
      setEventMetadata("VALID_OMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A13679OMMaqCodFo',fld:'OMMAQCODFO',pic:''},{av:'A13678OMDscMqPla',fld:'OMDSCMQPLA',pic:''}]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A13679OMMaqCodFo',fld:'OMMAQCODFO',pic:''},{av:'A13678OMDscMqPla',fld:'OMDSCMQPLA',pic:''}]}");
      setEventMetadata("VALID_OMEST","{handler:'valid_Omest',iparms:[]");
      setEventMetadata("VALID_OMEST",",oparms:[]}");
      setEventMetadata("VALID_SMCOD","{handler:'valid_Smcod',iparms:[{av:'h9428SMCod'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALID_SMCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'h9428SMCod'}]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_PMCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOOMMAQCOD","{handler:'validv_Comboommaqcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOOMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'},{av:'A9443OMRCCosT',fld:'OMRCCOST',pic:'ZZZZZZZ9.999'},{av:'A9442OMMRCosT',fld:'OMMRCOST',pic:'ZZZZZZZ9.999'},{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'},{av:'A9443OMRCCosT',fld:'OMRCCOST',pic:'ZZZZZZZ9.999'},{av:'A9442OMMRCosT',fld:'OMMRCOST',pic:'ZZZZZZZ9.999'},{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_OMMAQCODFO","{handler:'valid_Ommaqcodfo',iparms:[]");
      setEventMetadata("VALID_OMMAQCODFO",",oparms:[]}");
      setEventMetadata("VALID_OMMAQDSC","{handler:'valid_Ommaqdsc',iparms:[]");
      setEventMetadata("VALID_OMMAQDSC",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOST","{handler:'valid_Omrrcost',iparms:[]");
      setEventMetadata("VALID_OMRRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMRCCOST","{handler:'valid_Omrccost',iparms:[]");
      setEventMetadata("VALID_OMRCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOST","{handler:'valid_Ommrcost',iparms:[]");
      setEventMetadata("VALID_OMMRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMCCOST","{handler:'valid_Ommccost',iparms:[]");
      setEventMetadata("VALID_OMMCCOST",",oparms:[]}");
      setEventMetadata("VALID_TMCOD","{handler:'valid_Tmcod',iparms:[{av:'h9430TMCod'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'A9432TMTxt',fld:'TMTXT',pic:''}]");
      setEventMetadata("VALID_TMCOD",",oparms:[{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'A9432TMTxt',fld:'TMTXT',pic:''},{av:'h9430TMCod'}]}");
      setEventMetadata("NULL","{handler:'valid_Tmtxt',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_OMOPECOD","{handler:'valid_Omopecod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'h9455OMOpeCod'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9460OMMRPre',fld:'OMMRPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMOPECOD",",oparms:[{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'A9460OMMRPre',fld:'OMMRPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'h9455OMOpeCod'}]}");
      setEventMetadata("VALID_OMMTPO","{handler:'valid_Ommtpo',iparms:[]");
      setEventMetadata("VALID_OMMTPO",",oparms:[]}");
      setEventMetadata("VALID_OMOPEPRE","{handler:'valid_Omopepre',iparms:[]");
      setEventMetadata("VALID_OMOPEPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMRCNT","{handler:'valid_Ommrcnt',iparms:[]");
      setEventMetadata("VALID_OMMRCNT",",oparms:[]}");
      setEventMetadata("VALID_OMMRPRE","{handler:'valid_Ommrpre',iparms:[]");
      setEventMetadata("VALID_OMMRPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOS","{handler:'valid_Ommrcos',iparms:[]");
      setEventMetadata("VALID_OMMRCOS",",oparms:[]}");
      setEventMetadata("VALID_OMREPCOD","{handler:'valid_Omrepcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'h9446OMRepCod'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9451OMRRPre',fld:'OMRRPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMREPCOD",",oparms:[{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'A9451OMRRPre',fld:'OMRRPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'h9446OMRepCod'}]}");
      setEventMetadata("VALID_OMRTPO","{handler:'valid_Omrtpo',iparms:[]");
      setEventMetadata("VALID_OMRTPO",",oparms:[]}");
      setEventMetadata("VALID_OMREPPRE","{handler:'valid_Omreppre',iparms:[]");
      setEventMetadata("VALID_OMREPPRE",",oparms:[]}");
      setEventMetadata("VALID_OMRRCNT","{handler:'valid_Omrrcnt',iparms:[]");
      setEventMetadata("VALID_OMRRCNT",",oparms:[]}");
      setEventMetadata("VALID_OMRRPRE","{handler:'valid_Omrrpre',iparms:[]");
      setEventMetadata("VALID_OMRRPRE",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOS","{handler:'valid_Omrrcos',iparms:[]");
      setEventMetadata("VALID_OMRRCOS",",oparms:[]}");
      setEventMetadata("VALID_OMMEQUCOD","{handler:'valid_Ommequcod',iparms:[]");
      setEventMetadata("VALID_OMMEQUCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMSEQCOD","{handler:'valid_Ommseqcod',iparms:[]");
      setEventMetadata("VALID_OMMSEQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMPIECOD","{handler:'valid_Ommpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A11446OMMEquCod',fld:'OMMEQUCOD',pic:''},{av:'A11447OMMSEqCod',fld:'OMMSEQCOD',pic:''},{av:'A11448OMMPieCod',fld:'OMMPIECOD',pic:''},{av:'A12599OMMEquDsc',fld:'OMMEQUDSC',pic:''},{av:'A12600OMMSEqDsc',fld:'OMMSEQDSC',pic:''},{av:'A11449OMMPieDsc',fld:'OMMPIEDSC',pic:''}]");
      setEventMetadata("VALID_OMMPIECOD",",oparms:[{av:'A12599OMMEquDsc',fld:'OMMEQUDSC',pic:''},{av:'A12600OMMSEqDsc',fld:'OMMSEQDSC',pic:''},{av:'A11449OMMPieDsc',fld:'OMMPIEDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ommpiedsc',iparms:[]");
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
      pr_default.close(101);
      pr_default.close(84);
      pr_default.close(75);
      pr_default.close(65);
      pr_default.close(53);
      pr_default.close(40);
      pr_default.close(43);
      pr_default.close(97);
      pr_default.close(96);
      pr_default.close(44);
      pr_default.close(41);
      pr_default.close(42);
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
      Z9433OMTxt = "" ;
      Z9438OMFchPre = GXutil.nullDate() ;
      Z9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9445OMEst = "" ;
      Z9464OMNot = "" ;
      Z9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      Z9426OMMaqCod = "" ;
      O9441OMMCCosT = DecimalUtil.ZERO ;
      O9442OMMRCosT = DecimalUtil.ZERO ;
      O9443OMRCCosT = DecimalUtil.ZERO ;
      O9444OMRRCosT = DecimalUtil.ZERO ;
      N9426OMMaqCod = "" ;
      Combo_ommaqcod_Selectedvalue_get = "" ;
      Z11446OMMEquCod = "" ;
      Z11447OMMSEqCod = "" ;
      Z11448OMMPieCod = "" ;
      Z9449OMRTpo = "" ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
      O9450OMRRCnt = DecimalUtil.ZERO ;
      O9454OMRCCos = DecimalUtil.ZERO ;
      O9471OMRRCos = DecimalUtil.ZERO ;
      Z9458OMMTpo = "" ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      O9463OMMCCos = DecimalUtil.ZERO ;
      O9472OMMRCos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9517SMDsc = "" ;
      A13749TMCDsc = "" ;
      A13718MRCNom = "" ;
      A13748OpeCNom = "" ;
      h9428SMCod = "" ;
      h9430TMCod = "" ;
      h9446OMRepCod = "" ;
      h9455OMOpeCod = "" ;
      Gx_mode = "" ;
      A9426OMMaqCod = "" ;
      A11446OMMEquCod = "" ;
      A11447OMMSEqCod = "" ;
      A11448OMMPieCod = "" ;
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
      A9437OMUsuCre = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_tabletextonota = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      A9433OMTxt = "" ;
      A9464OMNot = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV44ComboOMMaqCod = "" ;
      A407EmprNom = "" ;
      A13679OMMaqCodFo = "" ;
      A9427OMMaqDsc = "" ;
      A13678OMDscMqPla = "" ;
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      Gridlevel_tareasContainer = new com.genexus.webpanels.GXWebGrid(context);
      B9441OMMCCosT = DecimalUtil.ZERO ;
      B9442OMMRCosT = DecimalUtil.ZERO ;
      B9443OMRCCosT = DecimalUtil.ZERO ;
      B9444OMRRCosT = DecimalUtil.ZERO ;
      sMode1530 = "" ;
      Gridlevel_operadorContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1234 = "" ;
      Gridlevel_repuestoContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1233 = "" ;
      Gridlevel_equiposContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1531 = "" ;
      AV26Insert_OMMaqCod = "" ;
      AV8UsurCod = "" ;
      AV46Pgmname = "" ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      AV16oOMRRCnt = DecimalUtil.ZERO ;
      AV19nOMRRCnt = DecimalUtil.ZERO ;
      AV29ServerNow = GXutil.resetTime( GXutil.nullDate() );
      AV18MTMovNom = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
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
      Combo_ommaqcod_Onlyselectedvalues = "" ;
      Combo_ommaqcod_Selectalltext = "" ;
      Combo_ommaqcod_Multiplevaluesseparator = "" ;
      Combo_ommaqcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_tabletextonota_Objectcall = "" ;
      Dvpanel_tabletextonota_Class = "" ;
      Dvpanel_tabletextonota_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1232 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s9441OMMCCosT = DecimalUtil.ZERO ;
      s9442OMMRCosT = DecimalUtil.ZERO ;
      s9440OMCosRea = DecimalUtil.ZERO ;
      O9440OMCosRea = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9456OMOpeNom = "" ;
      A9458OMMTpo = "" ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      T9463OMMCCos = DecimalUtil.ZERO ;
      T9472OMMRCos = DecimalUtil.ZERO ;
      s9443OMRCCosT = DecimalUtil.ZERO ;
      s9444OMRRCosT = DecimalUtil.ZERO ;
      A9447OMRepNom = "" ;
      A9449OMRTpo = "" ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      T9450OMRRCnt = DecimalUtil.ZERO ;
      T9454OMRCCos = DecimalUtil.ZERO ;
      T9471OMRRCos = DecimalUtil.ZERO ;
      A9431TMDsc = "" ;
      A9432TMTxt = "" ;
      A12599OMMEquDsc = "" ;
      A12600OMMSEqDsc = "" ;
      A11449OMMPieDsc = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV31TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV33WebSession = httpContext.getWebSession();
      AV32TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_char1 = "" ;
      AV42ObtenerEmprCod = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV37ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z9444OMRRCosT = DecimalUtil.ZERO ;
      Z9443OMRCCosT = DecimalUtil.ZERO ;
      Z9442OMMRCosT = DecimalUtil.ZERO ;
      Z9441OMMCCosT = DecimalUtil.ZERO ;
      Z9427OMMaqDsc = "" ;
      Z13679OMMaqCodFo = "" ;
      T013U25_A9517SMDsc = new String[] {""} ;
      T013U25_n9517SMDsc = new boolean[] {false} ;
      T013U25_A396EmprCod = new String[] {""} ;
      T013U25_A9428SMCod = new int[1] ;
      T013U25_n9428SMCod = new boolean[] {false} ;
      T013U16_A407EmprNom = new String[] {""} ;
      T013U16_n407EmprNom = new boolean[] {false} ;
      T013U17_A9427OMMaqDsc = new String[] {""} ;
      T013U17_n9427OMMaqDsc = new boolean[] {false} ;
      T013U20_A13679OMMaqCodFo = new String[] {""} ;
      T013U20_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U22_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U22_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U24_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U24_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U28_A602MaqCod = new String[] {""} ;
      T013U28_A9425OMCod = new int[1] ;
      T013U28_A9437OMUsuCre = new String[] {""} ;
      T013U28_A407EmprNom = new String[] {""} ;
      T013U28_n407EmprNom = new boolean[] {false} ;
      T013U28_A9427OMMaqDsc = new String[] {""} ;
      T013U28_n9427OMMaqDsc = new boolean[] {false} ;
      T013U28_A9433OMTxt = new String[] {""} ;
      T013U28_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U28_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U28_A9445OMEst = new String[] {""} ;
      T013U28_A9464OMNot = new String[] {""} ;
      T013U28_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013U28_A396EmprCod = new String[] {""} ;
      T013U28_A9426OMMaqCod = new String[] {""} ;
      T013U28_A9429PMCod = new int[1] ;
      T013U28_n9429PMCod = new boolean[] {false} ;
      T013U28_A9428SMCod = new int[1] ;
      T013U28_n9428SMCod = new boolean[] {false} ;
      T013U28_A13679OMMaqCodFo = new String[] {""} ;
      T013U28_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U28_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U28_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U28_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U28_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U29_A9517SMDsc = new String[] {""} ;
      T013U29_n9517SMDsc = new boolean[] {false} ;
      T013U29_A396EmprCod = new String[] {""} ;
      T013U29_A9428SMCod = new int[1] ;
      T013U29_n9428SMCod = new boolean[] {false} ;
      T013U30_A9517SMDsc = new String[] {""} ;
      T013U30_n9517SMDsc = new boolean[] {false} ;
      T013U30_A396EmprCod = new String[] {""} ;
      T013U30_A9428SMCod = new int[1] ;
      T013U30_n9428SMCod = new boolean[] {false} ;
      T013U31_A9517SMDsc = new String[] {""} ;
      T013U31_n9517SMDsc = new boolean[] {false} ;
      T013U31_A396EmprCod = new String[] {""} ;
      T013U31_A9428SMCod = new int[1] ;
      T013U31_n9428SMCod = new boolean[] {false} ;
      T013U18_A396EmprCod = new String[] {""} ;
      T013U19_A396EmprCod = new String[] {""} ;
      T013U32_A407EmprNom = new String[] {""} ;
      T013U32_n407EmprNom = new boolean[] {false} ;
      T013U33_A9427OMMaqDsc = new String[] {""} ;
      T013U33_n9427OMMaqDsc = new boolean[] {false} ;
      T013U34_A396EmprCod = new String[] {""} ;
      T013U35_A396EmprCod = new String[] {""} ;
      T013U36_A13679OMMaqCodFo = new String[] {""} ;
      T013U36_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U38_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U38_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U40_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U40_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U41_A396EmprCod = new String[] {""} ;
      T013U41_A9425OMCod = new int[1] ;
      T013U15_A9425OMCod = new int[1] ;
      T013U15_A9437OMUsuCre = new String[] {""} ;
      T013U15_A9433OMTxt = new String[] {""} ;
      T013U15_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U15_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U15_A9445OMEst = new String[] {""} ;
      T013U15_A9464OMNot = new String[] {""} ;
      T013U15_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013U15_A396EmprCod = new String[] {""} ;
      T013U15_A9426OMMaqCod = new String[] {""} ;
      T013U15_A9429PMCod = new int[1] ;
      T013U15_n9429PMCod = new boolean[] {false} ;
      T013U15_A9428SMCod = new int[1] ;
      T013U15_n9428SMCod = new boolean[] {false} ;
      T013U42_A396EmprCod = new String[] {""} ;
      T013U42_A9425OMCod = new int[1] ;
      T013U43_A396EmprCod = new String[] {""} ;
      T013U43_A9425OMCod = new int[1] ;
      T013U44_A9517SMDsc = new String[] {""} ;
      T013U44_n9517SMDsc = new boolean[] {false} ;
      T013U44_A396EmprCod = new String[] {""} ;
      T013U44_A9428SMCod = new int[1] ;
      T013U44_n9428SMCod = new boolean[] {false} ;
      T013U14_A9425OMCod = new int[1] ;
      T013U14_A9437OMUsuCre = new String[] {""} ;
      T013U14_A9433OMTxt = new String[] {""} ;
      T013U14_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U14_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013U14_A9445OMEst = new String[] {""} ;
      T013U14_A9464OMNot = new String[] {""} ;
      T013U14_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013U14_A396EmprCod = new String[] {""} ;
      T013U14_A9426OMMaqCod = new String[] {""} ;
      T013U14_A9429PMCod = new int[1] ;
      T013U14_n9429PMCod = new boolean[] {false} ;
      T013U14_A9428SMCod = new int[1] ;
      T013U14_n9428SMCod = new boolean[] {false} ;
      T013U48_A407EmprNom = new String[] {""} ;
      T013U48_n407EmprNom = new boolean[] {false} ;
      T013U50_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U50_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U52_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U52_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U53_A9427OMMaqDsc = new String[] {""} ;
      T013U53_n9427OMMaqDsc = new boolean[] {false} ;
      T013U54_A13679OMMaqCodFo = new String[] {""} ;
      T013U54_n13679OMMaqCodFo = new boolean[] {false} ;
      T013U55_A396EmprCod = new String[] {""} ;
      T013U55_A9425OMCod = new int[1] ;
      T013U55_A9430TMCod = new int[1] ;
      T013U55_A12636TMOMMEquCo = new String[] {""} ;
      T013U55_A12637TMOMMSEqCo = new String[] {""} ;
      T013U55_A12638TMOMMPieCo = new String[] {""} ;
      T013U56_A396EmprCod = new String[] {""} ;
      T013U56_A9425OMCod = new int[1] ;
      T013U56_A9455OMOpeCod = new int[1] ;
      T013U56_A9458OMMTpo = new String[] {""} ;
      T013U56_A9466OMMCLin = new short[1] ;
      T013U57_A396EmprCod = new String[] {""} ;
      T013U57_A9425OMCod = new int[1] ;
      Z12599OMMEquDsc = "" ;
      Z12600OMMSEqDsc = "" ;
      Z11449OMMPieDsc = "" ;
      T013U58_A9426OMMaqCod = new String[] {""} ;
      T013U58_A9425OMCod = new int[1] ;
      T013U58_A12599OMMEquDsc = new String[] {""} ;
      T013U58_A12600OMMSEqDsc = new String[] {""} ;
      T013U58_A11449OMMPieDsc = new String[] {""} ;
      T013U58_n11449OMMPieDsc = new boolean[] {false} ;
      T013U58_A396EmprCod = new String[] {""} ;
      T013U58_A11446OMMEquCod = new String[] {""} ;
      T013U58_A11447OMMSEqCod = new String[] {""} ;
      T013U58_A11448OMMPieCod = new String[] {""} ;
      T013U13_A12599OMMEquDsc = new String[] {""} ;
      T013U13_A12600OMMSEqDsc = new String[] {""} ;
      T013U13_A11449OMMPieDsc = new String[] {""} ;
      T013U13_n11449OMMPieDsc = new boolean[] {false} ;
      T013U59_A12599OMMEquDsc = new String[] {""} ;
      T013U59_A12600OMMSEqDsc = new String[] {""} ;
      T013U59_A11449OMMPieDsc = new String[] {""} ;
      T013U59_n11449OMMPieDsc = new boolean[] {false} ;
      T013U60_A396EmprCod = new String[] {""} ;
      T013U60_A9425OMCod = new int[1] ;
      T013U60_A11446OMMEquCod = new String[] {""} ;
      T013U60_A11447OMMSEqCod = new String[] {""} ;
      T013U60_A11448OMMPieCod = new String[] {""} ;
      T013U12_A9425OMCod = new int[1] ;
      T013U12_A396EmprCod = new String[] {""} ;
      T013U12_A11446OMMEquCod = new String[] {""} ;
      T013U12_A11447OMMSEqCod = new String[] {""} ;
      T013U12_A11448OMMPieCod = new String[] {""} ;
      T013U11_A9425OMCod = new int[1] ;
      T013U11_A396EmprCod = new String[] {""} ;
      T013U11_A11446OMMEquCod = new String[] {""} ;
      T013U11_A11447OMMSEqCod = new String[] {""} ;
      T013U11_A11448OMMPieCod = new String[] {""} ;
      T013U63_A12599OMMEquDsc = new String[] {""} ;
      T013U63_A12600OMMSEqDsc = new String[] {""} ;
      T013U63_A11449OMMPieDsc = new String[] {""} ;
      T013U63_n11449OMMPieDsc = new boolean[] {false} ;
      T013U64_A396EmprCod = new String[] {""} ;
      T013U64_A9425OMCod = new int[1] ;
      T013U64_A11446OMMEquCod = new String[] {""} ;
      T013U64_A11447OMMSEqCod = new String[] {""} ;
      T013U64_A11448OMMPieCod = new String[] {""} ;
      Z9431TMDsc = "" ;
      Z9432TMTxt = "" ;
      T013U65_A9425OMCod = new int[1] ;
      T013U65_A9431TMDsc = new String[] {""} ;
      T013U65_n9431TMDsc = new boolean[] {false} ;
      T013U65_A9432TMTxt = new String[] {""} ;
      T013U65_n9432TMTxt = new boolean[] {false} ;
      T013U65_A396EmprCod = new String[] {""} ;
      T013U65_A9430TMCod = new int[1] ;
      T013U66_A13749TMCDsc = new String[] {""} ;
      T013U66_A396EmprCod = new String[] {""} ;
      T013U66_A9430TMCod = new int[1] ;
      T013U67_A13749TMCDsc = new String[] {""} ;
      T013U67_A396EmprCod = new String[] {""} ;
      T013U67_A9430TMCod = new int[1] ;
      T013U68_A13749TMCDsc = new String[] {""} ;
      T013U68_A396EmprCod = new String[] {""} ;
      T013U68_A9430TMCod = new int[1] ;
      T013U10_A9431TMDsc = new String[] {""} ;
      T013U10_n9431TMDsc = new boolean[] {false} ;
      T013U10_A9432TMTxt = new String[] {""} ;
      T013U10_n9432TMTxt = new boolean[] {false} ;
      T013U69_A9431TMDsc = new String[] {""} ;
      T013U69_n9431TMDsc = new boolean[] {false} ;
      T013U69_A9432TMTxt = new String[] {""} ;
      T013U69_n9432TMTxt = new boolean[] {false} ;
      T013U70_A13749TMCDsc = new String[] {""} ;
      T013U70_A396EmprCod = new String[] {""} ;
      T013U70_A9430TMCod = new int[1] ;
      T013U71_A396EmprCod = new String[] {""} ;
      T013U71_A9425OMCod = new int[1] ;
      T013U71_A9430TMCod = new int[1] ;
      T013U9_A9425OMCod = new int[1] ;
      T013U9_A396EmprCod = new String[] {""} ;
      T013U9_A9430TMCod = new int[1] ;
      T013U72_A13749TMCDsc = new String[] {""} ;
      T013U72_A396EmprCod = new String[] {""} ;
      T013U72_A9430TMCod = new int[1] ;
      T013U8_A9425OMCod = new int[1] ;
      T013U8_A396EmprCod = new String[] {""} ;
      T013U8_A9430TMCod = new int[1] ;
      T013U75_A9431TMDsc = new String[] {""} ;
      T013U75_n9431TMDsc = new boolean[] {false} ;
      T013U75_A9432TMTxt = new String[] {""} ;
      T013U75_n9432TMTxt = new boolean[] {false} ;
      T013U76_A396EmprCod = new String[] {""} ;
      T013U76_A9425OMCod = new int[1] ;
      T013U76_A9430TMCod = new int[1] ;
      T013U76_A12636TMOMMEquCo = new String[] {""} ;
      T013U76_A12637TMOMMSEqCo = new String[] {""} ;
      T013U76_A12638TMOMMPieCo = new String[] {""} ;
      T013U77_A396EmprCod = new String[] {""} ;
      T013U77_A9425OMCod = new int[1] ;
      T013U77_A9430TMCod = new int[1] ;
      Z9447OMRepNom = "" ;
      Z9448OMRepPre = DecimalUtil.ZERO ;
      T013U78_A9425OMCod = new int[1] ;
      T013U78_A9449OMRTpo = new String[] {""} ;
      T013U78_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U78_A9447OMRepNom = new String[] {""} ;
      T013U78_n9447OMRepNom = new boolean[] {false} ;
      T013U78_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U78_n9448OMRepPre = new boolean[] {false} ;
      T013U78_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U78_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U78_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U78_A396EmprCod = new String[] {""} ;
      T013U78_A9446OMRepCod = new int[1] ;
      T013U79_A13718MRCNom = new String[] {""} ;
      T013U79_A396EmprCod = new String[] {""} ;
      T013U79_A9492MRCod = new int[1] ;
      T013U7_A9447OMRepNom = new String[] {""} ;
      T013U7_n9447OMRepNom = new boolean[] {false} ;
      T013U7_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U7_n9448OMRepPre = new boolean[] {false} ;
      T013U80_A9447OMRepNom = new String[] {""} ;
      T013U80_n9447OMRepNom = new boolean[] {false} ;
      T013U80_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U80_n9448OMRepPre = new boolean[] {false} ;
      T013U81_A396EmprCod = new String[] {""} ;
      T013U81_A9425OMCod = new int[1] ;
      T013U81_A9446OMRepCod = new int[1] ;
      T013U81_A9449OMRTpo = new String[] {""} ;
      T013U6_A9425OMCod = new int[1] ;
      T013U6_A9449OMRTpo = new String[] {""} ;
      T013U6_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U6_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U6_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U6_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U6_A396EmprCod = new String[] {""} ;
      T013U6_A9446OMRepCod = new int[1] ;
      T013U5_A9425OMCod = new int[1] ;
      T013U5_A9449OMRTpo = new String[] {""} ;
      T013U5_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U5_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U5_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U5_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U5_A396EmprCod = new String[] {""} ;
      T013U5_A9446OMRepCod = new int[1] ;
      T013U85_A9447OMRepNom = new String[] {""} ;
      T013U85_n9447OMRepNom = new boolean[] {false} ;
      T013U85_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U85_n9448OMRepPre = new boolean[] {false} ;
      T013U86_A396EmprCod = new String[] {""} ;
      T013U86_A9425OMCod = new int[1] ;
      T013U86_A9446OMRepCod = new int[1] ;
      T013U86_A9449OMRTpo = new String[] {""} ;
      Z9456OMOpeNom = "" ;
      Z9457OMOpePre = DecimalUtil.ZERO ;
      T013U87_A9425OMCod = new int[1] ;
      T013U87_A9458OMMTpo = new String[] {""} ;
      T013U87_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U87_A9456OMOpeNom = new String[] {""} ;
      T013U87_n9456OMOpeNom = new boolean[] {false} ;
      T013U87_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U87_n9457OMOpePre = new boolean[] {false} ;
      T013U87_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U87_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U87_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U87_A396EmprCod = new String[] {""} ;
      T013U87_A9455OMOpeCod = new int[1] ;
      T013U88_A13748OpeCNom = new String[] {""} ;
      T013U88_A396EmprCod = new String[] {""} ;
      T013U88_A652OpeCod = new int[1] ;
      T013U4_A9456OMOpeNom = new String[] {""} ;
      T013U4_n9456OMOpeNom = new boolean[] {false} ;
      T013U4_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U4_n9457OMOpePre = new boolean[] {false} ;
      T013U89_A9456OMOpeNom = new String[] {""} ;
      T013U89_n9456OMOpeNom = new boolean[] {false} ;
      T013U89_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U89_n9457OMOpePre = new boolean[] {false} ;
      T013U90_A396EmprCod = new String[] {""} ;
      T013U90_A9425OMCod = new int[1] ;
      T013U90_A9455OMOpeCod = new int[1] ;
      T013U90_A9458OMMTpo = new String[] {""} ;
      T013U3_A9425OMCod = new int[1] ;
      T013U3_A9458OMMTpo = new String[] {""} ;
      T013U3_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U3_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U3_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U3_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U3_A396EmprCod = new String[] {""} ;
      T013U3_A9455OMOpeCod = new int[1] ;
      T013U2_A9425OMCod = new int[1] ;
      T013U2_A9458OMMTpo = new String[] {""} ;
      T013U2_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U2_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U2_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U2_A396EmprCod = new String[] {""} ;
      T013U2_A9455OMOpeCod = new int[1] ;
      T013U94_A9456OMOpeNom = new String[] {""} ;
      T013U94_n9456OMOpeNom = new boolean[] {false} ;
      T013U94_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U94_n9457OMOpePre = new boolean[] {false} ;
      T013U95_A396EmprCod = new String[] {""} ;
      T013U95_A9425OMCod = new int[1] ;
      T013U95_A9455OMOpeCod = new int[1] ;
      T013U95_A9458OMMTpo = new String[] {""} ;
      T013U95_A9466OMMCLin = new short[1] ;
      T013U96_A396EmprCod = new String[] {""} ;
      T013U96_A9425OMCod = new int[1] ;
      T013U96_A9455OMOpeCod = new int[1] ;
      T013U96_A9458OMMTpo = new String[] {""} ;
      Gridlevel_equiposRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_equipos_Linesclass = "" ;
      ROClassString = "" ;
      Gridlevel_tareasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_tareas_Linesclass = "" ;
      Gridlevel_repuestoRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_repuesto_Linesclass = "" ;
      Gridlevel_operadorRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_operador_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13680OMDuracion = "" ;
      i9437OMUsuCre = "" ;
      i9445OMEst = "" ;
      i9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      i9443OMRCCosT = DecimalUtil.ZERO ;
      i9441OMMCCosT = DecimalUtil.ZERO ;
      Gridlevel_tareasColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_operadorColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_repuestoColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_equiposColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l9517SMDsc = "" ;
      T013U97_A9517SMDsc = new String[] {""} ;
      T013U97_n9517SMDsc = new boolean[] {false} ;
      l13749TMCDsc = "" ;
      T013U98_A13749TMCDsc = new String[] {""} ;
      l13718MRCNom = "" ;
      T013U99_A13718MRCNom = new String[] {""} ;
      l13748OpeCNom = "" ;
      T013U100_A13748OpeCNom = new String[] {""} ;
      T013U101_A9517SMDsc = new String[] {""} ;
      T013U101_n9517SMDsc = new boolean[] {false} ;
      T013U101_A396EmprCod = new String[] {""} ;
      T013U101_A9428SMCod = new int[1] ;
      T013U101_n9428SMCod = new boolean[] {false} ;
      T013U102_A13749TMCDsc = new String[] {""} ;
      T013U102_A396EmprCod = new String[] {""} ;
      T013U102_A9430TMCod = new int[1] ;
      T013U103_A13718MRCNom = new String[] {""} ;
      T013U103_A396EmprCod = new String[] {""} ;
      T013U103_A9492MRCod = new int[1] ;
      T013U104_A13748OpeCNom = new String[] {""} ;
      T013U104_A396EmprCod = new String[] {""} ;
      T013U104_A652OpeCod = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int14 = new byte[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime17 = new java.util.Date[1] ;
      Z13678OMDscMqPla = "" ;
      T013U105_A9517SMDsc = new String[] {""} ;
      T013U105_n9517SMDsc = new boolean[] {false} ;
      T013U105_A396EmprCod = new String[] {""} ;
      T013U105_A9428SMCod = new int[1] ;
      T013U105_n9428SMCod = new boolean[] {false} ;
      T013U106_A396EmprCod = new String[] {""} ;
      Zh9428SMCod = "" ;
      T013U107_A396EmprCod = new String[] {""} ;
      T013U108_A13749TMCDsc = new String[] {""} ;
      T013U108_A396EmprCod = new String[] {""} ;
      T013U108_A9430TMCod = new int[1] ;
      Zh9430TMCod = "" ;
      T013U109_A13718MRCNom = new String[] {""} ;
      T013U109_A396EmprCod = new String[] {""} ;
      T013U109_A9492MRCod = new int[1] ;
      Zh9446OMRepCod = "" ;
      T013U110_A13748OpeCNom = new String[] {""} ;
      T013U110_A396EmprCod = new String[] {""} ;
      T013U110_A652OpeCod = new int[1] ;
      T013U111_A9456OMOpeNom = new String[] {""} ;
      T013U111_n9456OMOpeNom = new boolean[] {false} ;
      T013U111_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013U111_n9457OMOpePre = new boolean[] {false} ;
      Zh9455OMOpeCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmorden__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmorden__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmorden__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmorden__default(),
         new Object[] {
             new Object[] {
            T013U2_A9425OMCod, T013U2_A9458OMMTpo, T013U2_A9460OMMRPre, T013U2_A9459OMMRCnt, T013U2_A9461OMMCCnt, T013U2_A9462OMMCPre, T013U2_A396EmprCod, T013U2_A9455OMOpeCod
            }
            , new Object[] {
            T013U3_A9425OMCod, T013U3_A9458OMMTpo, T013U3_A9460OMMRPre, T013U3_A9459OMMRCnt, T013U3_A9461OMMCCnt, T013U3_A9462OMMCPre, T013U3_A396EmprCod, T013U3_A9455OMOpeCod
            }
            , new Object[] {
            T013U4_A9456OMOpeNom, T013U4_n9456OMOpeNom, T013U4_A9457OMOpePre, T013U4_n9457OMOpePre
            }
            , new Object[] {
            T013U5_A9425OMCod, T013U5_A9449OMRTpo, T013U5_A9451OMRRPre, T013U5_A9450OMRRCnt, T013U5_A9452OMRCCnt, T013U5_A9453OMRCPre, T013U5_A396EmprCod, T013U5_A9446OMRepCod
            }
            , new Object[] {
            T013U6_A9425OMCod, T013U6_A9449OMRTpo, T013U6_A9451OMRRPre, T013U6_A9450OMRRCnt, T013U6_A9452OMRCCnt, T013U6_A9453OMRCPre, T013U6_A396EmprCod, T013U6_A9446OMRepCod
            }
            , new Object[] {
            T013U7_A9447OMRepNom, T013U7_n9447OMRepNom, T013U7_A9448OMRepPre, T013U7_n9448OMRepPre
            }
            , new Object[] {
            T013U8_A9425OMCod, T013U8_A396EmprCod, T013U8_A9430TMCod
            }
            , new Object[] {
            T013U9_A9425OMCod, T013U9_A396EmprCod, T013U9_A9430TMCod
            }
            , new Object[] {
            T013U10_A9431TMDsc, T013U10_n9431TMDsc, T013U10_A9432TMTxt, T013U10_n9432TMTxt
            }
            , new Object[] {
            T013U11_A9425OMCod, T013U11_A396EmprCod, T013U11_A11446OMMEquCod, T013U11_A11447OMMSEqCod, T013U11_A11448OMMPieCod
            }
            , new Object[] {
            T013U12_A9425OMCod, T013U12_A396EmprCod, T013U12_A11446OMMEquCod, T013U12_A11447OMMSEqCod, T013U12_A11448OMMPieCod
            }
            , new Object[] {
            T013U13_A12599OMMEquDsc, T013U13_A12600OMMSEqDsc, T013U13_A11449OMMPieDsc, T013U13_n11449OMMPieDsc
            }
            , new Object[] {
            T013U14_A9425OMCod, T013U14_A9437OMUsuCre, T013U14_A9433OMTxt, T013U14_A9438OMFchPre, T013U14_A9436OMFchCre, T013U14_A9445OMEst, T013U14_A9464OMNot, T013U14_A9439OMFchCer, T013U14_A396EmprCod, T013U14_A9426OMMaqCod,
            T013U14_A9429PMCod, T013U14_n9429PMCod, T013U14_A9428SMCod, T013U14_n9428SMCod
            }
            , new Object[] {
            T013U15_A9425OMCod, T013U15_A9437OMUsuCre, T013U15_A9433OMTxt, T013U15_A9438OMFchPre, T013U15_A9436OMFchCre, T013U15_A9445OMEst, T013U15_A9464OMNot, T013U15_A9439OMFchCer, T013U15_A396EmprCod, T013U15_A9426OMMaqCod,
            T013U15_A9429PMCod, T013U15_n9429PMCod, T013U15_A9428SMCod, T013U15_n9428SMCod
            }
            , new Object[] {
            T013U16_A407EmprNom, T013U16_n407EmprNom
            }
            , new Object[] {
            T013U17_A9427OMMaqDsc, T013U17_n9427OMMaqDsc
            }
            , new Object[] {
            T013U18_A396EmprCod
            }
            , new Object[] {
            T013U19_A396EmprCod
            }
            , new Object[] {
            T013U20_A13679OMMaqCodFo, T013U20_n13679OMMaqCodFo
            }
            , new Object[] {
            T013U22_A9444OMRRCosT, T013U22_A9443OMRCCosT
            }
            , new Object[] {
            T013U24_A9442OMMRCosT, T013U24_A9441OMMCCosT
            }
            , new Object[] {
            T013U25_A9517SMDsc, T013U25_n9517SMDsc, T013U25_A396EmprCod, T013U25_A9428SMCod
            }
            , new Object[] {
            T013U28_A602MaqCod, T013U28_A9425OMCod, T013U28_A9437OMUsuCre, T013U28_A407EmprNom, T013U28_n407EmprNom, T013U28_A9427OMMaqDsc, T013U28_n9427OMMaqDsc, T013U28_A9433OMTxt, T013U28_A9438OMFchPre, T013U28_A9436OMFchCre,
            T013U28_A9445OMEst, T013U28_A9464OMNot, T013U28_A9439OMFchCer, T013U28_A396EmprCod, T013U28_A9426OMMaqCod, T013U28_A9429PMCod, T013U28_n9429PMCod, T013U28_A9428SMCod, T013U28_n9428SMCod, T013U28_A13679OMMaqCodFo,
            T013U28_n13679OMMaqCodFo, T013U28_A9444OMRRCosT, T013U28_A9443OMRCCosT, T013U28_A9442OMMRCosT, T013U28_A9441OMMCCosT
            }
            , new Object[] {
            T013U29_A9517SMDsc, T013U29_n9517SMDsc, T013U29_A396EmprCod, T013U29_A9428SMCod
            }
            , new Object[] {
            T013U30_A9517SMDsc, T013U30_n9517SMDsc, T013U30_A396EmprCod, T013U30_A9428SMCod
            }
            , new Object[] {
            T013U31_A9517SMDsc, T013U31_n9517SMDsc, T013U31_A396EmprCod, T013U31_A9428SMCod
            }
            , new Object[] {
            T013U32_A407EmprNom, T013U32_n407EmprNom
            }
            , new Object[] {
            T013U33_A9427OMMaqDsc, T013U33_n9427OMMaqDsc
            }
            , new Object[] {
            T013U34_A396EmprCod
            }
            , new Object[] {
            T013U35_A396EmprCod
            }
            , new Object[] {
            T013U36_A13679OMMaqCodFo, T013U36_n13679OMMaqCodFo
            }
            , new Object[] {
            T013U38_A9444OMRRCosT, T013U38_A9443OMRCCosT
            }
            , new Object[] {
            T013U40_A9442OMMRCosT, T013U40_A9441OMMCCosT
            }
            , new Object[] {
            T013U41_A396EmprCod, T013U41_A9425OMCod
            }
            , new Object[] {
            T013U42_A396EmprCod, T013U42_A9425OMCod
            }
            , new Object[] {
            T013U43_A396EmprCod, T013U43_A9425OMCod
            }
            , new Object[] {
            T013U44_A9517SMDsc, T013U44_n9517SMDsc, T013U44_A396EmprCod, T013U44_A9428SMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U48_A407EmprNom, T013U48_n407EmprNom
            }
            , new Object[] {
            T013U50_A9444OMRRCosT, T013U50_A9443OMRCCosT
            }
            , new Object[] {
            T013U52_A9442OMMRCosT, T013U52_A9441OMMCCosT
            }
            , new Object[] {
            T013U53_A9427OMMaqDsc, T013U53_n9427OMMaqDsc
            }
            , new Object[] {
            T013U54_A13679OMMaqCodFo, T013U54_n13679OMMaqCodFo
            }
            , new Object[] {
            T013U55_A396EmprCod, T013U55_A9425OMCod, T013U55_A9430TMCod, T013U55_A12636TMOMMEquCo, T013U55_A12637TMOMMSEqCo, T013U55_A12638TMOMMPieCo
            }
            , new Object[] {
            T013U56_A396EmprCod, T013U56_A9425OMCod, T013U56_A9455OMOpeCod, T013U56_A9458OMMTpo, T013U56_A9466OMMCLin
            }
            , new Object[] {
            T013U57_A396EmprCod, T013U57_A9425OMCod
            }
            , new Object[] {
            T013U58_A9426OMMaqCod, T013U58_A9425OMCod, T013U58_A12599OMMEquDsc, T013U58_A12600OMMSEqDsc, T013U58_A11449OMMPieDsc, T013U58_n11449OMMPieDsc, T013U58_A396EmprCod, T013U58_A11446OMMEquCod, T013U58_A11447OMMSEqCod, T013U58_A11448OMMPieCod
            }
            , new Object[] {
            T013U59_A12599OMMEquDsc, T013U59_A12600OMMSEqDsc, T013U59_A11449OMMPieDsc, T013U59_n11449OMMPieDsc
            }
            , new Object[] {
            T013U60_A396EmprCod, T013U60_A9425OMCod, T013U60_A11446OMMEquCod, T013U60_A11447OMMSEqCod, T013U60_A11448OMMPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U63_A12599OMMEquDsc, T013U63_A12600OMMSEqDsc, T013U63_A11449OMMPieDsc, T013U63_n11449OMMPieDsc
            }
            , new Object[] {
            T013U64_A396EmprCod, T013U64_A9425OMCod, T013U64_A11446OMMEquCod, T013U64_A11447OMMSEqCod, T013U64_A11448OMMPieCod
            }
            , new Object[] {
            T013U65_A9425OMCod, T013U65_A9431TMDsc, T013U65_n9431TMDsc, T013U65_A9432TMTxt, T013U65_n9432TMTxt, T013U65_A396EmprCod, T013U65_A9430TMCod
            }
            , new Object[] {
            T013U66_A13749TMCDsc, T013U66_A396EmprCod, T013U66_A9430TMCod
            }
            , new Object[] {
            T013U67_A13749TMCDsc, T013U67_A396EmprCod, T013U67_A9430TMCod
            }
            , new Object[] {
            T013U68_A13749TMCDsc, T013U68_A396EmprCod, T013U68_A9430TMCod
            }
            , new Object[] {
            T013U69_A9431TMDsc, T013U69_n9431TMDsc, T013U69_A9432TMTxt, T013U69_n9432TMTxt
            }
            , new Object[] {
            T013U70_A13749TMCDsc, T013U70_A396EmprCod, T013U70_A9430TMCod
            }
            , new Object[] {
            T013U71_A396EmprCod, T013U71_A9425OMCod, T013U71_A9430TMCod
            }
            , new Object[] {
            T013U72_A13749TMCDsc, T013U72_A396EmprCod, T013U72_A9430TMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U75_A9431TMDsc, T013U75_n9431TMDsc, T013U75_A9432TMTxt, T013U75_n9432TMTxt
            }
            , new Object[] {
            T013U76_A396EmprCod, T013U76_A9425OMCod, T013U76_A9430TMCod, T013U76_A12636TMOMMEquCo, T013U76_A12637TMOMMSEqCo, T013U76_A12638TMOMMPieCo
            }
            , new Object[] {
            T013U77_A396EmprCod, T013U77_A9425OMCod, T013U77_A9430TMCod
            }
            , new Object[] {
            T013U78_A9425OMCod, T013U78_A9449OMRTpo, T013U78_A9451OMRRPre, T013U78_A9447OMRepNom, T013U78_n9447OMRepNom, T013U78_A9448OMRepPre, T013U78_n9448OMRepPre, T013U78_A9450OMRRCnt, T013U78_A9452OMRCCnt, T013U78_A9453OMRCPre,
            T013U78_A396EmprCod, T013U78_A9446OMRepCod
            }
            , new Object[] {
            T013U79_A13718MRCNom, T013U79_A396EmprCod, T013U79_A9492MRCod
            }
            , new Object[] {
            T013U80_A9447OMRepNom, T013U80_n9447OMRepNom, T013U80_A9448OMRepPre, T013U80_n9448OMRepPre
            }
            , new Object[] {
            T013U81_A396EmprCod, T013U81_A9425OMCod, T013U81_A9446OMRepCod, T013U81_A9449OMRTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U85_A9447OMRepNom, T013U85_n9447OMRepNom, T013U85_A9448OMRepPre, T013U85_n9448OMRepPre
            }
            , new Object[] {
            T013U86_A396EmprCod, T013U86_A9425OMCod, T013U86_A9446OMRepCod, T013U86_A9449OMRTpo
            }
            , new Object[] {
            T013U87_A9425OMCod, T013U87_A9458OMMTpo, T013U87_A9460OMMRPre, T013U87_A9456OMOpeNom, T013U87_n9456OMOpeNom, T013U87_A9457OMOpePre, T013U87_n9457OMOpePre, T013U87_A9459OMMRCnt, T013U87_A9461OMMCCnt, T013U87_A9462OMMCPre,
            T013U87_A396EmprCod, T013U87_A9455OMOpeCod
            }
            , new Object[] {
            T013U88_A13748OpeCNom, T013U88_A396EmprCod, T013U88_A652OpeCod
            }
            , new Object[] {
            T013U89_A9456OMOpeNom, T013U89_n9456OMOpeNom, T013U89_A9457OMOpePre, T013U89_n9457OMOpePre
            }
            , new Object[] {
            T013U90_A396EmprCod, T013U90_A9425OMCod, T013U90_A9455OMOpeCod, T013U90_A9458OMMTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013U94_A9456OMOpeNom, T013U94_n9456OMOpeNom, T013U94_A9457OMOpePre, T013U94_n9457OMOpePre
            }
            , new Object[] {
            T013U95_A396EmprCod, T013U95_A9425OMCod, T013U95_A9455OMOpeCod, T013U95_A9458OMMTpo, T013U95_A9466OMMCLin
            }
            , new Object[] {
            T013U96_A396EmprCod, T013U96_A9425OMCod, T013U96_A9455OMOpeCod, T013U96_A9458OMMTpo
            }
            , new Object[] {
            T013U97_A9517SMDsc, T013U97_n9517SMDsc
            }
            , new Object[] {
            T013U98_A13749TMCDsc
            }
            , new Object[] {
            T013U99_A13718MRCNom
            }
            , new Object[] {
            T013U100_A13748OpeCNom
            }
            , new Object[] {
            T013U101_A9517SMDsc, T013U101_n9517SMDsc, T013U101_A396EmprCod, T013U101_A9428SMCod
            }
            , new Object[] {
            T013U102_A13749TMCDsc, T013U102_A396EmprCod, T013U102_A9430TMCod
            }
            , new Object[] {
            T013U103_A13718MRCNom, T013U103_A396EmprCod, T013U103_A9492MRCod
            }
            , new Object[] {
            T013U104_A13748OpeCNom, T013U104_A396EmprCod, T013U104_A652OpeCod
            }
            , new Object[] {
            T013U105_A9517SMDsc, T013U105_n9517SMDsc, T013U105_A396EmprCod, T013U105_A9428SMCod
            }
            , new Object[] {
            T013U106_A396EmprCod
            }
            , new Object[] {
            T013U107_A396EmprCod
            }
            , new Object[] {
            T013U108_A13749TMCDsc, T013U108_A396EmprCod, T013U108_A9430TMCod
            }
            , new Object[] {
            T013U109_A13718MRCNom, T013U109_A396EmprCod, T013U109_A9492MRCod
            }
            , new Object[] {
            T013U110_A13748OpeCNom, T013U110_A396EmprCod, T013U110_A652OpeCod
            }
            , new Object[] {
            T013U111_A9456OMOpeNom, T013U111_n9456OMOpeNom, T013U111_A9457OMOpePre, T013U111_n9457OMOpePre
            }
         }
      );
      AV46Pgmname = "TMOrden" ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      Z9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z9445OMEst = httpContext.getMessage( "P", "") ;
      A9445OMEst = httpContext.getMessage( "P", "") ;
      i9445OMEst = httpContext.getMessage( "P", "") ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_equipos_Backcolorstyle ;
   private byte subGridlevel_equipos_Backstyle ;
   private byte subGridlevel_tareas_Backcolorstyle ;
   private byte subGridlevel_tareas_Backstyle ;
   private byte subGridlevel_repuesto_Backcolorstyle ;
   private byte subGridlevel_repuesto_Backstyle ;
   private byte subGridlevel_operador_Backcolorstyle ;
   private byte subGridlevel_operador_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_tareas_Allowselection ;
   private byte subGridlevel_tareas_Allowhovering ;
   private byte subGridlevel_tareas_Allowcollapsing ;
   private byte subGridlevel_tareas_Collapsed ;
   private byte subGridlevel_operador_Allowselection ;
   private byte subGridlevel_operador_Allowhovering ;
   private byte subGridlevel_operador_Allowcollapsing ;
   private byte subGridlevel_operador_Collapsed ;
   private byte subGridlevel_repuesto_Allowselection ;
   private byte subGridlevel_repuesto_Allowhovering ;
   private byte subGridlevel_repuesto_Allowcollapsing ;
   private byte subGridlevel_repuesto_Collapsed ;
   private byte subGridlevel_equipos_Allowselection ;
   private byte subGridlevel_equipos_Allowhovering ;
   private byte subGridlevel_equipos_Allowcollapsing ;
   private byte subGridlevel_equipos_Collapsed ;
   private byte GXv_int14[] ;
   private short nRcdDeleted_1531 ;
   private short nRcdExists_1531 ;
   private short nIsMod_1531 ;
   private short nRcdDeleted_1530 ;
   private short nRcdExists_1530 ;
   private short nIsMod_1530 ;
   private short nRcdDeleted_1233 ;
   private short nRcdExists_1233 ;
   private short nIsMod_1233 ;
   private short nRcdDeleted_1234 ;
   private short nRcdExists_1234 ;
   private short nIsMod_1234 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1530 ;
   private short RcdFound1530 ;
   private short nBlankRcdUsr1530 ;
   private short nBlankRcdCount1234 ;
   private short RcdFound1234 ;
   private short nBlankRcdUsr1234 ;
   private short nBlankRcdCount1233 ;
   private short RcdFound1233 ;
   private short nBlankRcdUsr1233 ;
   private short nBlankRcdCount1531 ;
   private short RcdFound1531 ;
   private short nBlankRcdUsr1531 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1531 ;
   private short nIsDirty_1530 ;
   private short nIsDirty_1233 ;
   private short nIsDirty_1234 ;
   private short gxhchits ;
   private int wcpOAV14OMCod ;
   private int Z9425OMCod ;
   private int Z9429PMCod ;
   private int Z9428SMCod ;
   private int nRC_GXsfl_121 ;
   private int nGXsfl_121_idx=1 ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int nRC_GXsfl_109 ;
   private int nGXsfl_109_idx=1 ;
   private int nRC_GXsfl_93 ;
   private int nGXsfl_93_idx=1 ;
   private int N9428SMCod ;
   private int N9429PMCod ;
   private int Z9430TMCod ;
   private int Z9446OMRepCod ;
   private int Z9455OMOpeCod ;
   private int AV14OMCod ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int A9425OMCod ;
   private int A9430TMCod ;
   private int A9446OMRepCod ;
   private int A9455OMOpeCod ;
   private int trnEnded ;
   private int edtOMCod_Enabled ;
   private int edtOMMaqCod_Visible ;
   private int edtOMMaqCod_Enabled ;
   private int edtOMFchPre_Enabled ;
   private int edtOMFchCre_Enabled ;
   private int edtOMUsuCre_Enabled ;
   private int edtOMFchCer_Enabled ;
   private int edtSMCod_Visible ;
   private int edtSMCod_Enabled ;
   private int edtPMCod_Visible ;
   private int edtPMCod_Enabled ;
   private int edtOMTxt_Enabled ;
   private int edtOMNot_Enabled ;
   private int divTableleaflevel_equipos_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavComboommaqcod_Visible ;
   private int edtavComboommaqcod_Enabled ;
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
   private int edtTMCod_Enabled ;
   private int edtTMDsc_Enabled ;
   private int edtTMTxt_Enabled ;
   private int fRowAdded ;
   private int edtOMOpeCod_Enabled ;
   private int edtOMOpeNom_Enabled ;
   private int edtOMOpePre_Enabled ;
   private int edtOMMRCnt_Enabled ;
   private int edtOMMRPre_Enabled ;
   private int edtOMMRCos_Enabled ;
   private int edtOMRepCod_Enabled ;
   private int edtOMRepNom_Enabled ;
   private int edtOMRepPre_Enabled ;
   private int edtOMRRCnt_Enabled ;
   private int edtOMRRPre_Enabled ;
   private int edtOMRRCos_Enabled ;
   private int edtOMMEquCod_Enabled ;
   private int edtOMMEquDsc_Enabled ;
   private int edtOMMSEqCod_Enabled ;
   private int edtOMMSEqDsc_Enabled ;
   private int edtOMMPieCod_Enabled ;
   private int edtOMMPieDsc_Enabled ;
   private int AV28Insert_SMCod ;
   private int AV27Insert_PMCod ;
   private int AV17MTMovCod ;
   private int Combo_ommaqcod_Datalistupdateminimumcharacters ;
   private int Combo_ommaqcod_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_tabletextonota_Gxcontroltype ;
   private int AV47GXV1 ;
   private int GX_JID ;
   private int subGridlevel_equipos_Backcolor ;
   private int subGridlevel_equipos_Allbackcolor ;
   private int subGridlevel_tareas_Backcolor ;
   private int subGridlevel_tareas_Allbackcolor ;
   private int subGridlevel_repuesto_Backcolor ;
   private int subGridlevel_repuesto_Allbackcolor ;
   private int subGridlevel_operador_Backcolor ;
   private int subGridlevel_operador_Allbackcolor ;
   private int defedtOMMPieCod_Enabled ;
   private int defedtOMMSEqCod_Enabled ;
   private int defedtOMMEquCod_Enabled ;
   private int defedtOMRRPre_Enabled ;
   private int defcmbOMRTpo_Enabled ;
   private int defedtOMRepNom_Enabled ;
   private int defedtOMRepCod_Enabled ;
   private int defedtOMMRPre_Enabled ;
   private int defcmbOMMTpo_Enabled ;
   private int defedtOMOpeNom_Enabled ;
   private int defedtOMOpeCod_Enabled ;
   private int defedtTMTxt_Enabled ;
   private int defedtTMDsc_Enabled ;
   private int defedtTMCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_tareas_Selectedindex ;
   private int subGridlevel_tareas_Selectioncolor ;
   private int subGridlevel_tareas_Hoveringcolor ;
   private int subGridlevel_operador_Selectedindex ;
   private int subGridlevel_operador_Selectioncolor ;
   private int subGridlevel_operador_Hoveringcolor ;
   private int subGridlevel_repuesto_Selectedindex ;
   private int subGridlevel_repuesto_Selectioncolor ;
   private int subGridlevel_repuesto_Hoveringcolor ;
   private int subGridlevel_equipos_Selectedindex ;
   private int subGridlevel_equipos_Selectioncolor ;
   private int subGridlevel_equipos_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int A9492MRCod ;
   private int A652OpeCod ;
   private int GXt_int11 ;
   private int GXv_int13[] ;
   private int GXv_int12[] ;
   private int GXv_int8[] ;
   private long GRIDLEVEL_EQUIPOS_nFirstRecordOnPage ;
   private long GRIDLEVEL_TAREAS_nFirstRecordOnPage ;
   private long GRIDLEVEL_REPUESTO_nFirstRecordOnPage ;
   private long GRIDLEVEL_OPERADOR_nFirstRecordOnPage ;
   private java.math.BigDecimal O9441OMMCCosT ;
   private java.math.BigDecimal O9442OMMRCosT ;
   private java.math.BigDecimal O9443OMRCCosT ;
   private java.math.BigDecimal O9444OMRRCosT ;
   private java.math.BigDecimal Z9451OMRRPre ;
   private java.math.BigDecimal Z9450OMRRCnt ;
   private java.math.BigDecimal Z9452OMRCCnt ;
   private java.math.BigDecimal Z9453OMRCPre ;
   private java.math.BigDecimal O9450OMRRCnt ;
   private java.math.BigDecimal O9454OMRCCos ;
   private java.math.BigDecimal O9471OMRRCos ;
   private java.math.BigDecimal Z9460OMMRPre ;
   private java.math.BigDecimal Z9459OMMRCnt ;
   private java.math.BigDecimal Z9461OMMCCnt ;
   private java.math.BigDecimal Z9462OMMCPre ;
   private java.math.BigDecimal O9463OMMCCos ;
   private java.math.BigDecimal O9472OMMRCos ;
   private java.math.BigDecimal A9440OMCosRea ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal B9441OMMCCosT ;
   private java.math.BigDecimal B9442OMMRCosT ;
   private java.math.BigDecimal B9443OMRCCosT ;
   private java.math.BigDecimal B9444OMRRCosT ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal AV16oOMRRCnt ;
   private java.math.BigDecimal AV19nOMRRCnt ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9463OMMCCos ;
   private java.math.BigDecimal s9441OMMCCosT ;
   private java.math.BigDecimal s9442OMMRCosT ;
   private java.math.BigDecimal s9440OMCosRea ;
   private java.math.BigDecimal O9440OMCosRea ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9472OMMRCos ;
   private java.math.BigDecimal T9463OMMCCos ;
   private java.math.BigDecimal T9472OMMRCos ;
   private java.math.BigDecimal s9443OMRCCosT ;
   private java.math.BigDecimal s9444OMRRCosT ;
   private java.math.BigDecimal A9448OMRepPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9471OMRRCos ;
   private java.math.BigDecimal T9450OMRRCnt ;
   private java.math.BigDecimal T9454OMRCCos ;
   private java.math.BigDecimal T9471OMRRCos ;
   private java.math.BigDecimal Z9444OMRRCosT ;
   private java.math.BigDecimal Z9443OMRCCosT ;
   private java.math.BigDecimal Z9442OMMRCosT ;
   private java.math.BigDecimal Z9441OMMCCosT ;
   private java.math.BigDecimal Z9448OMRepPre ;
   private java.math.BigDecimal Z9457OMOpePre ;
   private java.math.BigDecimal i9443OMRCCosT ;
   private java.math.BigDecimal i9441OMMCCosT ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV24EmprCod ;
   private String wcpOAV20Accion ;
   private String Z396EmprCod ;
   private String Z9437OMUsuCre ;
   private String Z9445OMEst ;
   private String Z9426OMMaqCod ;
   private String N9426OMMaqCod ;
   private String Combo_ommaqcod_Selectedvalue_get ;
   private String Z11446OMMEquCod ;
   private String Z11447OMMSEqCod ;
   private String Z11448OMMPieCod ;
   private String Z9449OMRTpo ;
   private String Z9458OMMTpo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9517SMDsc ;
   private String h9428SMCod ;
   private String Gx_mode ;
   private String A9426OMMaqCod ;
   private String A11446OMMEquCod ;
   private String A11447OMMSEqCod ;
   private String A11448OMMPieCod ;
   private String AV24EmprCod ;
   private String AV20Accion ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOMMaqCod_Internalname ;
   private String sGXsfl_85_idx="0001" ;
   private String sGXsfl_93_idx="0001" ;
   private String sGXsfl_109_idx="0001" ;
   private String sGXsfl_121_idx="0001" ;
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
   private String edtOMCod_Internalname ;
   private String TempTags ;
   private String edtOMCod_Jsonclick ;
   private String divTablesplittedommaqcod_Internalname ;
   private String lblTextblockommaqcod_Internalname ;
   private String lblTextblockommaqcod_Jsonclick ;
   private String Combo_ommaqcod_Caption ;
   private String Combo_ommaqcod_Cls ;
   private String Combo_ommaqcod_Emptyitemtext ;
   private String Combo_ommaqcod_Internalname ;
   private String edtOMMaqCod_Jsonclick ;
   private String edtOMFchPre_Internalname ;
   private String edtOMFchPre_Jsonclick ;
   private String edtOMFchCre_Internalname ;
   private String edtOMFchCre_Jsonclick ;
   private String edtOMUsuCre_Internalname ;
   private String A9437OMUsuCre ;
   private String edtOMUsuCre_Jsonclick ;
   private String edtOMFchCer_Internalname ;
   private String edtOMFchCer_Jsonclick ;
   private String divSmcod_cell_Internalname ;
   private String divSmcod_cell_Class ;
   private String edtSMCod_Internalname ;
   private String edtSMCod_Jsonclick ;
   private String divPmcod_cell_Internalname ;
   private String divPmcod_cell_Class ;
   private String edtPMCod_Internalname ;
   private String edtPMCod_Jsonclick ;
   private String Dvpanel_tabletextonota_Width ;
   private String Dvpanel_tabletextonota_Cls ;
   private String Dvpanel_tabletextonota_Title ;
   private String Dvpanel_tabletextonota_Iconposition ;
   private String Dvpanel_tabletextonota_Internalname ;
   private String sStyleString ;
   private String tblTabletextonota_Internalname ;
   private String edtOMTxt_Internalname ;
   private String edtOMNot_Internalname ;
   private String divTableequipotarea_Internalname ;
   private String divTableleaflevel_tareas_Internalname ;
   private String divTableleaflevel_operador_Internalname ;
   private String divTablerepuestooperador_Internalname ;
   private String divTableleaflevel_repuesto_Internalname ;
   private String divTableleaflevel_equipos_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_ommaqcod_Internalname ;
   private String edtavComboommaqcod_Internalname ;
   private String AV44ComboOMMaqCod ;
   private String edtavComboommaqcod_Jsonclick ;
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
   private String sMode1530 ;
   private String edtTMCod_Internalname ;
   private String edtTMDsc_Internalname ;
   private String edtTMTxt_Internalname ;
   private String subGridlevel_tareas_Internalname ;
   private String sMode1234 ;
   private String edtOMOpeCod_Internalname ;
   private String edtOMOpeNom_Internalname ;
   private String edtOMOpePre_Internalname ;
   private String edtOMMRCnt_Internalname ;
   private String edtOMMRPre_Internalname ;
   private String edtOMMRCos_Internalname ;
   private String subGridlevel_operador_Internalname ;
   private String sMode1233 ;
   private String edtOMRepCod_Internalname ;
   private String edtOMRepNom_Internalname ;
   private String edtOMRepPre_Internalname ;
   private String edtOMRRCnt_Internalname ;
   private String edtOMRRPre_Internalname ;
   private String edtOMRRCos_Internalname ;
   private String subGridlevel_repuesto_Internalname ;
   private String sMode1531 ;
   private String edtOMMEquCod_Internalname ;
   private String edtOMMEquDsc_Internalname ;
   private String edtOMMSEqCod_Internalname ;
   private String edtOMMSEqDsc_Internalname ;
   private String edtOMMPieCod_Internalname ;
   private String edtOMMPieDsc_Internalname ;
   private String subGridlevel_equipos_Internalname ;
   private String AV26Insert_OMMaqCod ;
   private String AV8UsurCod ;
   private String AV46Pgmname ;
   private String AV18MTMovNom ;
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
   private String Combo_ommaqcod_Onlyselectedvalues ;
   private String Combo_ommaqcod_Selectalltext ;
   private String Combo_ommaqcod_Multiplevaluesseparator ;
   private String Combo_ommaqcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_tabletextonota_Objectcall ;
   private String Dvpanel_tabletextonota_Class ;
   private String Dvpanel_tabletextonota_Height ;
   private String hsh ;
   private String sMode1232 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
   private String A9447OMRepNom ;
   private String A9449OMRTpo ;
   private String A9431TMDsc ;
   private String A12599OMMEquDsc ;
   private String A12600OMMSEqDsc ;
   private String A11449OMMPieDsc ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String GXt_char1 ;
   private String AV42ObtenerEmprCod ;
   private String Z407EmprNom ;
   private String Z9427OMMaqDsc ;
   private String Z13679OMMaqCodFo ;
   private String Z12599OMMEquDsc ;
   private String Z12600OMMSEqDsc ;
   private String Z11449OMMPieDsc ;
   private String Z9431TMDsc ;
   private String Z9447OMRepNom ;
   private String Z9456OMOpeNom ;
   private String sGXsfl_121_fel_idx="0001" ;
   private String subGridlevel_equipos_Class ;
   private String subGridlevel_equipos_Linesclass ;
   private String ROClassString ;
   private String edtOMMEquCod_Jsonclick ;
   private String edtOMMEquDsc_Jsonclick ;
   private String edtOMMSEqCod_Jsonclick ;
   private String edtOMMSEqDsc_Jsonclick ;
   private String edtOMMPieCod_Jsonclick ;
   private String edtOMMPieDsc_Jsonclick ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGridlevel_tareas_Class ;
   private String subGridlevel_tareas_Linesclass ;
   private String edtTMCod_Jsonclick ;
   private String edtTMDsc_Jsonclick ;
   private String edtTMTxt_Jsonclick ;
   private String sGXsfl_109_fel_idx="0001" ;
   private String subGridlevel_repuesto_Class ;
   private String subGridlevel_repuesto_Linesclass ;
   private String edtOMRepCod_Jsonclick ;
   private String edtOMRepNom_Jsonclick ;
   private String edtOMRepPre_Jsonclick ;
   private String edtOMRRCnt_Jsonclick ;
   private String edtOMRRPre_Jsonclick ;
   private String edtOMRRCos_Jsonclick ;
   private String sGXsfl_93_fel_idx="0001" ;
   private String subGridlevel_operador_Class ;
   private String subGridlevel_operador_Linesclass ;
   private String edtOMOpeCod_Jsonclick ;
   private String edtOMOpeNom_Jsonclick ;
   private String edtOMOpePre_Jsonclick ;
   private String edtOMMRCnt_Jsonclick ;
   private String edtOMMRPre_Jsonclick ;
   private String edtOMMRCos_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9437OMUsuCre ;
   private String i9445OMEst ;
   private String subGridlevel_tareas_Header ;
   private String subGridlevel_operador_Header ;
   private String subGridlevel_repuesto_Header ;
   private String subGridlevel_equipos_Header ;
   private String gxwrpcisep ;
   private String l9517SMDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13678OMDscMqPla ;
   private String Zh9428SMCod ;
   private java.util.Date Z9436OMFchCre ;
   private java.util.Date Z9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date AV29ServerNow ;
   private java.util.Date i9436OMFchCre ;
   private java.util.Date GXv_dtime17[] ;
   private java.util.Date Z9438OMFchPre ;
   private java.util.Date A9438OMFchPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9517SMDsc ;
   private boolean n9429PMCod ;
   private boolean n9428SMCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tabletextonota_Autowidth ;
   private boolean Dvpanel_tabletextonota_Autoheight ;
   private boolean Dvpanel_tabletextonota_Collapsible ;
   private boolean Dvpanel_tabletextonota_Collapsed ;
   private boolean Dvpanel_tabletextonota_Showcollapseicon ;
   private boolean Dvpanel_tabletextonota_Autoscroll ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean bGXsfl_93_Refreshing=false ;
   private boolean bGXsfl_109_Refreshing=false ;
   private boolean bGXsfl_121_Refreshing=false ;
   private boolean Combo_ommaqcod_Enabled ;
   private boolean Combo_ommaqcod_Visible ;
   private boolean Combo_ommaqcod_Allowmultipleselection ;
   private boolean Combo_ommaqcod_Isgriditem ;
   private boolean Combo_ommaqcod_Hasdescription ;
   private boolean Combo_ommaqcod_Includeonlyselectedoption ;
   private boolean Combo_ommaqcod_Includeselectalloption ;
   private boolean Combo_ommaqcod_Emptyitem ;
   private boolean Combo_ommaqcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_tabletextonota_Enabled ;
   private boolean Dvpanel_tabletextonota_Showheader ;
   private boolean Dvpanel_tabletextonota_Visible ;
   private boolean n407EmprNom ;
   private boolean n13679OMMaqCodFo ;
   private boolean n9427OMMaqDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n11449OMMPieDsc ;
   private boolean n9431TMDsc ;
   private boolean n9432TMTxt ;
   private boolean n9447OMRepNom ;
   private boolean n9448OMRepPre ;
   private boolean n9456OMOpeNom ;
   private boolean n9457OMOpePre ;
   private String Z9433OMTxt ;
   private String Z9464OMNot ;
   private String A13749TMCDsc ;
   private String A13718MRCNom ;
   private String A13748OpeCNom ;
   private String h9430TMCod ;
   private String h9446OMRepCod ;
   private String h9455OMOpeCod ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A13680OMDuracion ;
   private String A9432TMTxt ;
   private String AV37ComboSelectedValue ;
   private String Z9432TMTxt ;
   private String i13680OMDuracion ;
   private String l13749TMCDsc ;
   private String l13718MRCNom ;
   private String l13748OpeCNom ;
   private String Zh9430TMCod ;
   private String Zh9446OMRepCod ;
   private String Zh9455OMOpeCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_tareasContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_operadorContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_repuestoContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_equiposContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_equiposRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_tareasRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_repuestoRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_operadorRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_tareasColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_operadorColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_repuestoColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_equiposColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV33WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_ommaqcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tabletextonota ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private HTMLChoice cmbOMMTpo ;
   private HTMLChoice cmbOMRTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T013U25_A9517SMDsc ;
   private boolean[] T013U25_n9517SMDsc ;
   private String[] T013U25_A396EmprCod ;
   private int[] T013U25_A9428SMCod ;
   private boolean[] T013U25_n9428SMCod ;
   private String[] T013U16_A407EmprNom ;
   private boolean[] T013U16_n407EmprNom ;
   private String[] T013U17_A9427OMMaqDsc ;
   private boolean[] T013U17_n9427OMMaqDsc ;
   private String[] T013U20_A13679OMMaqCodFo ;
   private boolean[] T013U20_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] T013U22_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U22_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U24_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U24_A9441OMMCCosT ;
   private String[] T013U28_A602MaqCod ;
   private int[] T013U28_A9425OMCod ;
   private String[] T013U28_A9437OMUsuCre ;
   private String[] T013U28_A407EmprNom ;
   private boolean[] T013U28_n407EmprNom ;
   private String[] T013U28_A9427OMMaqDsc ;
   private boolean[] T013U28_n9427OMMaqDsc ;
   private String[] T013U28_A9433OMTxt ;
   private java.util.Date[] T013U28_A9438OMFchPre ;
   private java.util.Date[] T013U28_A9436OMFchCre ;
   private String[] T013U28_A9445OMEst ;
   private String[] T013U28_A9464OMNot ;
   private java.util.Date[] T013U28_A9439OMFchCer ;
   private String[] T013U28_A396EmprCod ;
   private String[] T013U28_A9426OMMaqCod ;
   private int[] T013U28_A9429PMCod ;
   private boolean[] T013U28_n9429PMCod ;
   private int[] T013U28_A9428SMCod ;
   private boolean[] T013U28_n9428SMCod ;
   private String[] T013U28_A13679OMMaqCodFo ;
   private boolean[] T013U28_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] T013U28_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U28_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U28_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U28_A9441OMMCCosT ;
   private String[] T013U29_A9517SMDsc ;
   private boolean[] T013U29_n9517SMDsc ;
   private String[] T013U29_A396EmprCod ;
   private int[] T013U29_A9428SMCod ;
   private boolean[] T013U29_n9428SMCod ;
   private String[] T013U30_A9517SMDsc ;
   private boolean[] T013U30_n9517SMDsc ;
   private String[] T013U30_A396EmprCod ;
   private int[] T013U30_A9428SMCod ;
   private boolean[] T013U30_n9428SMCod ;
   private String[] T013U31_A9517SMDsc ;
   private boolean[] T013U31_n9517SMDsc ;
   private String[] T013U31_A396EmprCod ;
   private int[] T013U31_A9428SMCod ;
   private boolean[] T013U31_n9428SMCod ;
   private String[] T013U18_A396EmprCod ;
   private String[] T013U19_A396EmprCod ;
   private String[] T013U32_A407EmprNom ;
   private boolean[] T013U32_n407EmprNom ;
   private String[] T013U33_A9427OMMaqDsc ;
   private boolean[] T013U33_n9427OMMaqDsc ;
   private String[] T013U34_A396EmprCod ;
   private String[] T013U35_A396EmprCod ;
   private String[] T013U36_A13679OMMaqCodFo ;
   private boolean[] T013U36_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] T013U38_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U38_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U40_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U40_A9441OMMCCosT ;
   private String[] T013U41_A396EmprCod ;
   private int[] T013U41_A9425OMCod ;
   private int[] T013U15_A9425OMCod ;
   private String[] T013U15_A9437OMUsuCre ;
   private String[] T013U15_A9433OMTxt ;
   private java.util.Date[] T013U15_A9438OMFchPre ;
   private java.util.Date[] T013U15_A9436OMFchCre ;
   private String[] T013U15_A9445OMEst ;
   private String[] T013U15_A9464OMNot ;
   private java.util.Date[] T013U15_A9439OMFchCer ;
   private String[] T013U15_A396EmprCod ;
   private String[] T013U15_A9426OMMaqCod ;
   private int[] T013U15_A9429PMCod ;
   private boolean[] T013U15_n9429PMCod ;
   private int[] T013U15_A9428SMCod ;
   private boolean[] T013U15_n9428SMCod ;
   private String[] T013U42_A396EmprCod ;
   private int[] T013U42_A9425OMCod ;
   private String[] T013U43_A396EmprCod ;
   private int[] T013U43_A9425OMCod ;
   private String[] T013U44_A9517SMDsc ;
   private boolean[] T013U44_n9517SMDsc ;
   private String[] T013U44_A396EmprCod ;
   private int[] T013U44_A9428SMCod ;
   private boolean[] T013U44_n9428SMCod ;
   private int[] T013U14_A9425OMCod ;
   private String[] T013U14_A9437OMUsuCre ;
   private String[] T013U14_A9433OMTxt ;
   private java.util.Date[] T013U14_A9438OMFchPre ;
   private java.util.Date[] T013U14_A9436OMFchCre ;
   private String[] T013U14_A9445OMEst ;
   private String[] T013U14_A9464OMNot ;
   private java.util.Date[] T013U14_A9439OMFchCer ;
   private String[] T013U14_A396EmprCod ;
   private String[] T013U14_A9426OMMaqCod ;
   private int[] T013U14_A9429PMCod ;
   private boolean[] T013U14_n9429PMCod ;
   private int[] T013U14_A9428SMCod ;
   private boolean[] T013U14_n9428SMCod ;
   private String[] T013U48_A407EmprNom ;
   private boolean[] T013U48_n407EmprNom ;
   private java.math.BigDecimal[] T013U50_A9444OMRRCosT ;
   private java.math.BigDecimal[] T013U50_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013U52_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013U52_A9441OMMCCosT ;
   private String[] T013U53_A9427OMMaqDsc ;
   private boolean[] T013U53_n9427OMMaqDsc ;
   private String[] T013U54_A13679OMMaqCodFo ;
   private boolean[] T013U54_n13679OMMaqCodFo ;
   private String[] T013U55_A396EmprCod ;
   private int[] T013U55_A9425OMCod ;
   private int[] T013U55_A9430TMCod ;
   private String[] T013U55_A12636TMOMMEquCo ;
   private String[] T013U55_A12637TMOMMSEqCo ;
   private String[] T013U55_A12638TMOMMPieCo ;
   private String[] T013U56_A396EmprCod ;
   private int[] T013U56_A9425OMCod ;
   private int[] T013U56_A9455OMOpeCod ;
   private String[] T013U56_A9458OMMTpo ;
   private short[] T013U56_A9466OMMCLin ;
   private String[] T013U57_A396EmprCod ;
   private int[] T013U57_A9425OMCod ;
   private String[] T013U58_A9426OMMaqCod ;
   private int[] T013U58_A9425OMCod ;
   private String[] T013U58_A12599OMMEquDsc ;
   private String[] T013U58_A12600OMMSEqDsc ;
   private String[] T013U58_A11449OMMPieDsc ;
   private boolean[] T013U58_n11449OMMPieDsc ;
   private String[] T013U58_A396EmprCod ;
   private String[] T013U58_A11446OMMEquCod ;
   private String[] T013U58_A11447OMMSEqCod ;
   private String[] T013U58_A11448OMMPieCod ;
   private String[] T013U13_A12599OMMEquDsc ;
   private String[] T013U13_A12600OMMSEqDsc ;
   private String[] T013U13_A11449OMMPieDsc ;
   private boolean[] T013U13_n11449OMMPieDsc ;
   private String[] T013U59_A12599OMMEquDsc ;
   private String[] T013U59_A12600OMMSEqDsc ;
   private String[] T013U59_A11449OMMPieDsc ;
   private boolean[] T013U59_n11449OMMPieDsc ;
   private String[] T013U60_A396EmprCod ;
   private int[] T013U60_A9425OMCod ;
   private String[] T013U60_A11446OMMEquCod ;
   private String[] T013U60_A11447OMMSEqCod ;
   private String[] T013U60_A11448OMMPieCod ;
   private int[] T013U12_A9425OMCod ;
   private String[] T013U12_A396EmprCod ;
   private String[] T013U12_A11446OMMEquCod ;
   private String[] T013U12_A11447OMMSEqCod ;
   private String[] T013U12_A11448OMMPieCod ;
   private int[] T013U11_A9425OMCod ;
   private String[] T013U11_A396EmprCod ;
   private String[] T013U11_A11446OMMEquCod ;
   private String[] T013U11_A11447OMMSEqCod ;
   private String[] T013U11_A11448OMMPieCod ;
   private String[] T013U63_A12599OMMEquDsc ;
   private String[] T013U63_A12600OMMSEqDsc ;
   private String[] T013U63_A11449OMMPieDsc ;
   private boolean[] T013U63_n11449OMMPieDsc ;
   private String[] T013U64_A396EmprCod ;
   private int[] T013U64_A9425OMCod ;
   private String[] T013U64_A11446OMMEquCod ;
   private String[] T013U64_A11447OMMSEqCod ;
   private String[] T013U64_A11448OMMPieCod ;
   private int[] T013U65_A9425OMCod ;
   private String[] T013U65_A9431TMDsc ;
   private boolean[] T013U65_n9431TMDsc ;
   private String[] T013U65_A9432TMTxt ;
   private boolean[] T013U65_n9432TMTxt ;
   private String[] T013U65_A396EmprCod ;
   private int[] T013U65_A9430TMCod ;
   private String[] T013U66_A13749TMCDsc ;
   private String[] T013U66_A396EmprCod ;
   private int[] T013U66_A9430TMCod ;
   private String[] T013U67_A13749TMCDsc ;
   private String[] T013U67_A396EmprCod ;
   private int[] T013U67_A9430TMCod ;
   private String[] T013U68_A13749TMCDsc ;
   private String[] T013U68_A396EmprCod ;
   private int[] T013U68_A9430TMCod ;
   private String[] T013U10_A9431TMDsc ;
   private boolean[] T013U10_n9431TMDsc ;
   private String[] T013U10_A9432TMTxt ;
   private boolean[] T013U10_n9432TMTxt ;
   private String[] T013U69_A9431TMDsc ;
   private boolean[] T013U69_n9431TMDsc ;
   private String[] T013U69_A9432TMTxt ;
   private boolean[] T013U69_n9432TMTxt ;
   private String[] T013U70_A13749TMCDsc ;
   private String[] T013U70_A396EmprCod ;
   private int[] T013U70_A9430TMCod ;
   private String[] T013U71_A396EmprCod ;
   private int[] T013U71_A9425OMCod ;
   private int[] T013U71_A9430TMCod ;
   private int[] T013U9_A9425OMCod ;
   private String[] T013U9_A396EmprCod ;
   private int[] T013U9_A9430TMCod ;
   private String[] T013U72_A13749TMCDsc ;
   private String[] T013U72_A396EmprCod ;
   private int[] T013U72_A9430TMCod ;
   private int[] T013U8_A9425OMCod ;
   private String[] T013U8_A396EmprCod ;
   private int[] T013U8_A9430TMCod ;
   private String[] T013U75_A9431TMDsc ;
   private boolean[] T013U75_n9431TMDsc ;
   private String[] T013U75_A9432TMTxt ;
   private boolean[] T013U75_n9432TMTxt ;
   private String[] T013U76_A396EmprCod ;
   private int[] T013U76_A9425OMCod ;
   private int[] T013U76_A9430TMCod ;
   private String[] T013U76_A12636TMOMMEquCo ;
   private String[] T013U76_A12637TMOMMSEqCo ;
   private String[] T013U76_A12638TMOMMPieCo ;
   private String[] T013U77_A396EmprCod ;
   private int[] T013U77_A9425OMCod ;
   private int[] T013U77_A9430TMCod ;
   private int[] T013U78_A9425OMCod ;
   private String[] T013U78_A9449OMRTpo ;
   private java.math.BigDecimal[] T013U78_A9451OMRRPre ;
   private String[] T013U78_A9447OMRepNom ;
   private boolean[] T013U78_n9447OMRepNom ;
   private java.math.BigDecimal[] T013U78_A9448OMRepPre ;
   private boolean[] T013U78_n9448OMRepPre ;
   private java.math.BigDecimal[] T013U78_A9450OMRRCnt ;
   private java.math.BigDecimal[] T013U78_A9452OMRCCnt ;
   private java.math.BigDecimal[] T013U78_A9453OMRCPre ;
   private String[] T013U78_A396EmprCod ;
   private int[] T013U78_A9446OMRepCod ;
   private String[] T013U79_A13718MRCNom ;
   private String[] T013U79_A396EmprCod ;
   private int[] T013U79_A9492MRCod ;
   private String[] T013U7_A9447OMRepNom ;
   private boolean[] T013U7_n9447OMRepNom ;
   private java.math.BigDecimal[] T013U7_A9448OMRepPre ;
   private boolean[] T013U7_n9448OMRepPre ;
   private String[] T013U80_A9447OMRepNom ;
   private boolean[] T013U80_n9447OMRepNom ;
   private java.math.BigDecimal[] T013U80_A9448OMRepPre ;
   private boolean[] T013U80_n9448OMRepPre ;
   private String[] T013U81_A396EmprCod ;
   private int[] T013U81_A9425OMCod ;
   private int[] T013U81_A9446OMRepCod ;
   private String[] T013U81_A9449OMRTpo ;
   private int[] T013U6_A9425OMCod ;
   private String[] T013U6_A9449OMRTpo ;
   private java.math.BigDecimal[] T013U6_A9451OMRRPre ;
   private java.math.BigDecimal[] T013U6_A9450OMRRCnt ;
   private java.math.BigDecimal[] T013U6_A9452OMRCCnt ;
   private java.math.BigDecimal[] T013U6_A9453OMRCPre ;
   private String[] T013U6_A396EmprCod ;
   private int[] T013U6_A9446OMRepCod ;
   private int[] T013U5_A9425OMCod ;
   private String[] T013U5_A9449OMRTpo ;
   private java.math.BigDecimal[] T013U5_A9451OMRRPre ;
   private java.math.BigDecimal[] T013U5_A9450OMRRCnt ;
   private java.math.BigDecimal[] T013U5_A9452OMRCCnt ;
   private java.math.BigDecimal[] T013U5_A9453OMRCPre ;
   private String[] T013U5_A396EmprCod ;
   private int[] T013U5_A9446OMRepCod ;
   private String[] T013U85_A9447OMRepNom ;
   private boolean[] T013U85_n9447OMRepNom ;
   private java.math.BigDecimal[] T013U85_A9448OMRepPre ;
   private boolean[] T013U85_n9448OMRepPre ;
   private String[] T013U86_A396EmprCod ;
   private int[] T013U86_A9425OMCod ;
   private int[] T013U86_A9446OMRepCod ;
   private String[] T013U86_A9449OMRTpo ;
   private int[] T013U87_A9425OMCod ;
   private String[] T013U87_A9458OMMTpo ;
   private java.math.BigDecimal[] T013U87_A9460OMMRPre ;
   private String[] T013U87_A9456OMOpeNom ;
   private boolean[] T013U87_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013U87_A9457OMOpePre ;
   private boolean[] T013U87_n9457OMOpePre ;
   private java.math.BigDecimal[] T013U87_A9459OMMRCnt ;
   private java.math.BigDecimal[] T013U87_A9461OMMCCnt ;
   private java.math.BigDecimal[] T013U87_A9462OMMCPre ;
   private String[] T013U87_A396EmprCod ;
   private int[] T013U87_A9455OMOpeCod ;
   private String[] T013U88_A13748OpeCNom ;
   private String[] T013U88_A396EmprCod ;
   private int[] T013U88_A652OpeCod ;
   private String[] T013U4_A9456OMOpeNom ;
   private boolean[] T013U4_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013U4_A9457OMOpePre ;
   private boolean[] T013U4_n9457OMOpePre ;
   private String[] T013U89_A9456OMOpeNom ;
   private boolean[] T013U89_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013U89_A9457OMOpePre ;
   private boolean[] T013U89_n9457OMOpePre ;
   private String[] T013U90_A396EmprCod ;
   private int[] T013U90_A9425OMCod ;
   private int[] T013U90_A9455OMOpeCod ;
   private String[] T013U90_A9458OMMTpo ;
   private int[] T013U3_A9425OMCod ;
   private String[] T013U3_A9458OMMTpo ;
   private java.math.BigDecimal[] T013U3_A9460OMMRPre ;
   private java.math.BigDecimal[] T013U3_A9459OMMRCnt ;
   private java.math.BigDecimal[] T013U3_A9461OMMCCnt ;
   private java.math.BigDecimal[] T013U3_A9462OMMCPre ;
   private String[] T013U3_A396EmprCod ;
   private int[] T013U3_A9455OMOpeCod ;
   private int[] T013U2_A9425OMCod ;
   private String[] T013U2_A9458OMMTpo ;
   private java.math.BigDecimal[] T013U2_A9460OMMRPre ;
   private java.math.BigDecimal[] T013U2_A9459OMMRCnt ;
   private java.math.BigDecimal[] T013U2_A9461OMMCCnt ;
   private java.math.BigDecimal[] T013U2_A9462OMMCPre ;
   private String[] T013U2_A396EmprCod ;
   private int[] T013U2_A9455OMOpeCod ;
   private String[] T013U94_A9456OMOpeNom ;
   private boolean[] T013U94_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013U94_A9457OMOpePre ;
   private boolean[] T013U94_n9457OMOpePre ;
   private String[] T013U95_A396EmprCod ;
   private int[] T013U95_A9425OMCod ;
   private int[] T013U95_A9455OMOpeCod ;
   private String[] T013U95_A9458OMMTpo ;
   private short[] T013U95_A9466OMMCLin ;
   private String[] T013U96_A396EmprCod ;
   private int[] T013U96_A9425OMCod ;
   private int[] T013U96_A9455OMOpeCod ;
   private String[] T013U96_A9458OMMTpo ;
   private String[] T013U97_A9517SMDsc ;
   private boolean[] T013U97_n9517SMDsc ;
   private String[] T013U98_A13749TMCDsc ;
   private String[] T013U99_A13718MRCNom ;
   private String[] T013U100_A13748OpeCNom ;
   private String[] T013U101_A9517SMDsc ;
   private boolean[] T013U101_n9517SMDsc ;
   private String[] T013U101_A396EmprCod ;
   private int[] T013U101_A9428SMCod ;
   private boolean[] T013U101_n9428SMCod ;
   private String[] T013U102_A13749TMCDsc ;
   private String[] T013U102_A396EmprCod ;
   private int[] T013U102_A9430TMCod ;
   private String[] T013U103_A13718MRCNom ;
   private String[] T013U103_A396EmprCod ;
   private int[] T013U103_A9492MRCod ;
   private String[] T013U104_A13748OpeCNom ;
   private String[] T013U104_A396EmprCod ;
   private int[] T013U104_A652OpeCod ;
   private String[] T013U105_A9517SMDsc ;
   private boolean[] T013U105_n9517SMDsc ;
   private String[] T013U105_A396EmprCod ;
   private int[] T013U105_A9428SMCod ;
   private boolean[] T013U105_n9428SMCod ;
   private String[] T013U106_A396EmprCod ;
   private String[] T013U107_A396EmprCod ;
   private String[] T013U108_A13749TMCDsc ;
   private String[] T013U108_A396EmprCod ;
   private int[] T013U108_A9430TMCod ;
   private String[] T013U109_A13718MRCNom ;
   private String[] T013U109_A396EmprCod ;
   private int[] T013U109_A9492MRCod ;
   private String[] T013U110_A13748OpeCNom ;
   private String[] T013U110_A396EmprCod ;
   private int[] T013U110_A652OpeCod ;
   private String[] T013U111_A9456OMOpeNom ;
   private boolean[] T013U111_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013U111_A9457OMOpePre ;
   private boolean[] T013U111_n9457OMOpePre ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV43OMMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV31TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV32TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV36DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
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
          new ForEachCursor("T013U2", "SELECT OMCod, OMMTpo, OMMRPre, OMMRCnt, OMMCCnt, OMMCPre, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?  FOR UPDATE OF OMMRPre, OMMRCnt, OMMCCnt, OMMCPre NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U3", "SELECT OMCod, OMMTpo, OMMRPre, OMMRCnt, OMMCCnt, OMMCPre, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U4", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U5", "SELECT OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?  FOR UPDATE OF OMRRPre, OMRRCnt, OMRCCnt, OMRCPre NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U6", "SELECT OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U7", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U8", "SELECT OMCod, EmprCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?  FOR UPDATE OF OMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U9", "SELECT OMCod, EmprCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U10", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U11", "SELECT OMCod, EmprCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ?  FOR UPDATE OF OMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U12", "SELECT OMCod, EmprCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U13", "SELECT MaqEquDsc AS OMMEquDsc, MaqSEqDsc AS OMMSEqDsc, MaqPieDsc AS OMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U14", "SELECT OMCod, OMUsuCre, OMTxt, OMFchPre, OMFchCre, OMEst, OMNot, OMFchCer, EmprCod, OMMaqCod, PMCod, SMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMUsuCre, OMTxt, OMFchPre, OMFchCre, OMEst, OMNot, OMFchCer, OMMaqCod, PMCod, SMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U15", "SELECT OMCod, OMUsuCre, OMTxt, OMFchPre, OMFchCre, OMEst, OMNot, OMFchCer, EmprCod, OMMaqCod, PMCod, SMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U17", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U18", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U19", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U20", "SELECT COALESCE( MaqCodFor, '') AS OMMaqCodFo FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U22", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT, COALESCE( T1.OMRCCosT, 0) AS OMRCCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U24", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT, COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U25", "SELECT SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (EmprCod = ?) AND (SMCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U28", "SELECT /*+ FIRST_ROWS(100) */ T6.MaqCod, TM1.OMCod, TM1.OMUsuCre, T2.EmprNom, T5.MaqDsc AS OMMaqDsc, TM1.OMTxt, TM1.OMFchPre, TM1.OMFchCre, TM1.OMEst, TM1.OMNot, TM1.OMFchCer, TM1.EmprCod, TM1.OMMaqCod AS OMMaqCod, TM1.PMCod, TM1.SMCod, COALESCE( T6.MaqCodFor, '') AS OMMaqCodFo, COALESCE( T3.OMRRCosT, 0) AS OMRRCosT, COALESCE( T3.OMRCCosT, 0) AS OMRCCosT, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT FROM (((((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.OMCod = TM1.OMCod) LEFT JOIN (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) INNER JOIN TXPMAQUIN T5 ON T5.EmprCod = TM1.EmprCod AND T5.MaqCod = TM1.OMMaqCod) LEFT JOIN TXPMAQUIN T6 ON T6.EmprCod = TM1.EmprCod AND T6.MaqCod = TM1.OMMaqCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U29", "SELECT SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (EmprCod = ?) AND (SMCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U30", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U31", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U32", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U33", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U34", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U35", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U36", "SELECT COALESCE( MaqCodFor, '') AS OMMaqCodFo FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U38", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT, COALESCE( T1.OMRCCosT, 0) AS OMRCCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U40", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT, COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U41", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U42", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( EmprCod > ? or EmprCod = ? and OMCod > ?) ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U43", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( EmprCod < ? or EmprCod = ? and OMCod < ?) ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U44", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U45", "INSERT INTO TXPMORDEN(OMCod, OMUsuCre, OMTxt, OMFchPre, OMFchCre, OMEst, OMNot, OMFchCer, EmprCod, OMMaqCod, PMCod, SMCod, OMOpeRes) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T013U46", "UPDATE TXPMORDEN SET OMUsuCre=?, OMTxt=?, OMFchPre=?, OMFchCre=?, OMEst=?, OMNot=?, OMFchCer=?, OMMaqCod=?, PMCod=?, SMCod=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T013U47", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T013U48", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U50", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT, COALESCE( T1.OMRCCosT, 0) AS OMRCCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U52", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT, COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U53", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U54", "SELECT COALESCE( MaqCodFor, '') AS OMMaqCodFo FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U55", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo FROM TXPMOrdeI WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U56", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U57", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U58", "SELECT T2.MaqCod AS OMMaqCod, T1.OMCod, T2.MaqEquDsc AS OMMEquDsc, T2.MaqSEqDsc AS OMMSEqDsc, T2.MaqPieDsc AS OMMPieDsc, T1.EmprCod, T1.OMMEquCod AS OMMEquCod, T1.OMMSEqCod AS OMMSEqCod, T1.OMMPieCod AS OMMPieCod FROM (TXPMOrde1 T1 LEFT JOIN TXPMaqPie T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = ? AND T2.MaqEquCod = T1.OMMEquCod AND T2.MaqSEqCod = T1.OMMSEqCod AND T2.MaqPieCod = T1.OMMPieCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMMEquCod = ? and T1.OMMSEqCod = ? and T1.OMMPieCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMMEquCod, T1.OMMSEqCod, T1.OMMPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U59", "SELECT MaqEquDsc AS OMMEquDsc, MaqSEqDsc AS OMMSEqDsc, MaqPieDsc AS OMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U60", "SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U61", "INSERT INTO TXPMOrde1(OMCod, EmprCod, OMMEquCod, OMMSEqCod, OMMPieCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOrde1")
         ,new UpdateCursor("T013U62", "DELETE FROM TXPMOrde1  WHERE EmprCod = ? AND OMCod = ? AND OMMEquCod = ? AND OMMSEqCod = ? AND OMMPieCod = ?", GX_NOMASK, "TXPMOrde1")
         ,new ForEachCursor("T013U63", "SELECT MaqEquDsc AS OMMEquDsc, MaqSEqDsc AS OMMSEqDsc, MaqPieDsc AS OMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U64", "SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U65", "SELECT T1.OMCod, T2.TMDsc, T2.TMTxt, T1.EmprCod, T1.TMCod FROM (TXPMOrde2 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.TMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.TMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.TMCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U66", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, EmprCod, TMCod FROM TXPMTAREA WHERE (EmprCod = ?) AND (TMCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U67", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, EmprCod, TMCod FROM TXPMTAREA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U68", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, EmprCod, TMCod FROM TXPMTAREA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U69", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U70", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, EmprCod, TMCod FROM TXPMTAREA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U71", "SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U72", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, EmprCod, TMCod FROM TXPMTAREA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U73", "INSERT INTO TXPMOrde2(OMCod, EmprCod, TMCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMOrde2")
         ,new UpdateCursor("T013U74", "DELETE FROM TXPMOrde2  WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?", GX_NOMASK, "TXPMOrde2")
         ,new ForEachCursor("T013U75", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U76", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo FROM TXPMOrdeI WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U77", "SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, TMCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U78", "SELECT T1.OMCod, T1.OMRTpo, T1.OMRRPre, T2.MRNom AS OMRepNom, T2.MRStkPre AS OMRepPre, T1.OMRRCnt, T1.OMRCCnt, T1.OMRCPre, T1.EmprCod, T1.OMRepCod AS OMRepCod FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMRepCod = ? and T1.OMRTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod, T1.OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U79", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (EmprCod = ?) AND (MRCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U80", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U81", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U82", "INSERT INTO TXPMOrRep(OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, EmprCod, OMRepCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T013U83", "UPDATE TXPMOrRep SET OMRRPre=?, OMRRCnt=?, OMRCCnt=?, OMRCPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T013U84", "DELETE FROM TXPMOrRep  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new ForEachCursor("T013U85", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U86", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, OMRepCod, OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U87", "SELECT T1.OMCod, T1.OMMTpo, T1.OMMRPre, T2.OpeNom AS OMOpeNom, T2.OpePreHor AS OMOpePre, T1.OMMRCnt, T1.OMMCCnt, T1.OMMCPre, T1.EmprCod, T1.OMOpeCod AS OMOpeCod FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMOpeCod = ? and T1.OMMTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod, T1.OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U88", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U89", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U90", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013U91", "INSERT INTO TXPMOrMO(OMCod, OMMTpo, OMMRPre, OMMRCnt, OMMCCnt, OMMCPre, EmprCod, OMOpeCod, OMMCUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T013U92", "UPDATE TXPMOrMO SET OMMRPre=?, OMMRCnt=?, OMMCCnt=?, OMMCPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T013U93", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new ForEachCursor("T013U94", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U95", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013U96", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U97", "SELECT * FROM (SELECT DISTINCT SMDsc FROM TXPMSOLIC WHERE (EmprCod = ?) AND (UPPER(SMDsc) like '%' || UPPER(?)) ORDER BY SMDsc) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U98", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc FROM TXPMTAREA WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, '')))) like '%' || UPPER(?)) ORDER BY TMCDsc) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U99", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom FROM TXPMREPUE WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, '')))) like '%' || UPPER(?)) ORDER BY MRCNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U100", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?)) ORDER BY OpeCNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U101", "SELECT SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U102", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, EmprCod, TMCod FROM TXPMTAREA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U103", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U104", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U105", "SELECT /*+ FIRST_ROWS */ SMDsc, EmprCod, SMCod FROM TXPMSOLIC WHERE (SMDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U106", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U107", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U108", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, EmprCod, TMCod FROM TXPMTAREA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U109", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U110", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013U111", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getVarchar(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               ((String[]) buf[14])[0] = rslt.getString(13, 6);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(18,3);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(20,3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 32 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
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
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 42 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
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
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 55 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 68 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 77 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 36 :
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
            case 37 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2000, false);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setVarchar(7, (String)parms[6], 2000, false);
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[13]).intValue());
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 2000, false);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setVarchar(6, (String)parms[5], 2000, false);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setString(8, (String)parms[7], 6);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[11]).intValue());
               }
               stmt.setString(11, (String)parms[12], 3);
               stmt.setInt(12, ((Number) parms[13]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 57 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 58 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 62 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 63 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 72 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 73 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 81 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 82 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 255);
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
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 91 :
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
            case 92 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 93 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 94 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 95 :
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
            case 96 :
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
            case 97 :
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
            case 98 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 99 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 100 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

