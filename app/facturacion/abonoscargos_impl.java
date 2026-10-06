package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class abonoscargos_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action59") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV29ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ContCod", AV29ContCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_59_1TW43( A396EmprCod, AV29ContCod, A430FacCod, Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action60") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A450FacPri = httpContext.GetPar( "FacPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         A1150FacNumVto = (byte)(GXutil.lval( httpContext.GetPar( "FacNumVto"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = httpContext.GetPar( "FacPer") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = httpContext.GetPar( "FacDiaPag") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A437FacFpg = httpContext.GetPar( "FacFpg") ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A434FacDtoPP = CommonUtil.decimalVal( httpContext.GetPar( "FacDtoPP"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         A433FacDtoGen = CommonUtil.decimalVal( httpContext.GetPar( "FacDtoGen"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A443FacIVAPor = (byte)(GXutil.lval( httpContext.GetPar( "FacIVAPor"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = CommonUtil.decimalVal( httpContext.GetPar( "FacRECPor"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         A14224FacCostFac = CommonUtil.decimalVal( httpContext.GetPar( "FacCostFac"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_60_1TW43( A396EmprCod, A430FacCod, A450FacPri, A1150FacNumVto, A1151FacPer, A1152FacDiaPag, A437FacFpg, A434FacDtoPP, A433FacDtoGen, A443FacIVAPor, A453FacRECPor, A14224FacCostFac) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV27FacCodX = (int)(GXutil.lval( httpContext.GetPar( "FacCodX"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27FacCodX), 8, 0));
         AV28Facfch = localUtil.parseDateParm( httpContext.GetPar( "Facfch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Facfch", localUtil.format(AV28Facfch, "99/99/99"));
         A450FacPri = httpContext.GetPar( "FacPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         AV17FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FirmaD), 4, 0));
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_1TW43( A396EmprCod, AV27FacCodX, AV28Facfch, A450FacPri, AV17FirmaD, A430FacCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action72") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV32Ser1 = httpContext.GetPar( "Ser1") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ser1", AV32Ser1);
         AV33Ser2 = httpContext.GetPar( "Ser2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ser2", AV33Ser2);
         AV34Ser3 = httpContext.GetPar( "Ser3") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Ser3", AV34Ser3);
         AV35Ser0 = httpContext.GetPar( "Ser0") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Ser0", AV35Ser0);
         AV36Ser20 = httpContext.GetPar( "Ser20") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Ser20", AV36Ser20);
         AV37Ser30 = httpContext.GetPar( "Ser30") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Ser30", AV37Ser30);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_72_1TW43( Gx_mode, A396EmprCod, AV32Ser1, AV33Ser2, AV34Ser3, AV35Ser0, AV36Ser20, AV37Ser30) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action80") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A444FacKgs = CommonUtil.decimalVal( httpContext.GetPar( "FacKgs"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_80_1TW44( A396EmprCod, A430FacCod, A444FacKgs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel29"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa53531TW43( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_85") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3119FacRepCod = httpContext.GetPar( "FacRepCod") ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_85( A396EmprCod, A3119FacRepCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_86") == 0 )
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
         gxload_86( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_89") == 0 )
      {
         A3115FacDivCod = (byte)(GXutil.lval( httpContext.GetPar( "FacDivCod"))) ;
         n3115FacDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_89( A3115FacDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_87") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3119FacRepCod = httpContext.GetPar( "FacRepCod") ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_87( A396EmprCod, A3119FacRepCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_88") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11629MeivaId = httpContext.GetPar( "MeivaId") ;
         n11629MeivaId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_88( A396EmprCod, A11629MeivaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_91") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A858ZonGeoCod = (short)(GXutil.lval( httpContext.GetPar( "ZonGeoCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_91( A396EmprCod, A858ZonGeoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_92") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A450FacPri = httpContext.GetPar( "FacPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_92( A396EmprCod, A252CliCod, A450FacPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_93") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_93( A396EmprCod, A430FacCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_abonoscargoslineas") == 0 )
      {
         gxnrgridlevel_abonoscargoslineas_newrow_invoke( ) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8FacCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8FacCod), "ZZZZZZZ9")));
            AV19FacTipFac = (byte)(GXutil.lval( httpContext.GetPar( "FacTipFac"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19FacTipFac", GXutil.str( AV19FacTipFac, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTIPFAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19FacTipFac), "9")));
            AV38FacPri = httpContext.GetPar( "FacPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38FacPri", AV38FacPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38FacPri, "9"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Abonos / Cargos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_abonoscargoslineas_newrow_invoke( )
   {
      nRC_GXsfl_169 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_169"))) ;
      nGXsfl_169_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_169_idx"))) ;
      sGXsfl_169_idx = httpContext.GetPar( "sGXsfl_169_idx") ;
      A435FacEst = (byte)(GXutil.lval( httpContext.GetPar( "FacEst"))) ;
      AV17FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A445FacLiC = (int)(GXutil.lval( httpContext.GetPar( "FacLiC"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_abonoscargoslineas_newrow( ) ;
      /* End function gxnrGridlevel_abonoscargoslineas_newrow_invoke */
   }

   public abonoscargos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public abonoscargos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( abonoscargos_impl.class ));
   }

   public abonoscargos_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbFacEst = new HTMLChoice();
      cmbFacTipFac = new HTMLChoice();
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
      if ( cmbFacEst.getItemCount() > 0 )
      {
         A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), true);
      }
      if ( cmbFacTipFac.getItemCount() > 0 )
      {
         A1153FacTipFac = (byte)(GXutil.lval( cmbFacTipFac.getValidValue(GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFacTipFac.setValue( GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacTipFac.getInternalname(), "Values", cmbFacTipFac.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTexto_fd_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTexto_fd_Internalname, AV21Texto_fd, GXutil.rtrim( localUtil.format( AV21Texto_fd, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTexto_fd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTexto_fd_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacCod_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFacFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacFch_Internalname, localUtil.format(A436FacFch, "99/99/99"), localUtil.format( A436FacFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFacFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFacFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\AbonosCargos.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacHor_Internalname, httpContext.getMessage( "Dia-Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFacHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacHor_Internalname, localUtil.ttoc( A9606FacHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9606FacHor, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacHor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFacHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFacHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\AbonosCargos.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFacEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFacEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFacEst, cmbFacEst.getInternalname(), GXutil.trim( GXutil.str( A435FacEst, 1, 0)), 1, cmbFacEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbFacEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, (byte)(0), "HLP_Facturacion\\AbonosCargos.htm");
      cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacSerNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacSerNum_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacSerNum_Internalname, GXutil.rtrim( A2739FacSerNum), GXutil.rtrim( localUtil.format( A2739FacSerNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacSerNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacSerNum_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFacTipFac.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFacTipFac.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFacTipFac, cmbFacTipFac.getInternalname(), GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0)), 1, cmbFacTipFac.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbFacTipFac.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Facturacion\\AbonosCargos.htm");
      cmbFacTipFac.setValue( GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacTipFac.getInternalname(), "Values", cmbFacTipFac.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
      ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
      ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
      ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
      ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
      ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
      ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
      ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
      ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
      ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
      ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV30CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedmeivaid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmeivaid_Internalname, httpContext.getMessage( "Isenção de IVA", ""), "", "", lblTextblockmeivaid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_meivaid.setProperty("Caption", Combo_meivaid_Caption);
      ucCombo_meivaid.setProperty("Cls", Combo_meivaid_Cls);
      ucCombo_meivaid.setProperty("EmptyItemText", Combo_meivaid_Emptyitemtext);
      ucCombo_meivaid.setProperty("DropDownOptionsData", AV25MeivaId_Data);
      ucCombo_meivaid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_meivaid_Internalname, "COMBO_MEIVAIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMeivaId_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMeivaId_Internalname, GXutil.rtrim( A11629MeivaId), GXutil.rtrim( localUtil.format( A11629MeivaId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMeivaId_Jsonclick, 0, "Attribute", "", "", "", "", edtMeivaId_Visible, edtMeivaId_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacNumVto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacNumVto_Internalname, httpContext.getMessage( "Nº Vtos.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacNumVto_Internalname, GXutil.ltrim( localUtil.ntoc( A1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacNumVto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1150FacNumVto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1150FacNumVto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacNumVto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacNumVto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacPer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacPer_Internalname, httpContext.getMessage( "Periodicidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacPer_Internalname, GXutil.rtrim( A1151FacPer), GXutil.rtrim( localUtil.format( A1151FacPer, "99999")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacPer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacPer_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDiaPag_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacDiaPag_Internalname, httpContext.getMessage( "Dias Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDiaPag_Internalname, GXutil.rtrim( A1152FacDiaPag), GXutil.rtrim( localUtil.format( A1152FacDiaPag, "999999")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDiaPag_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDiaPag_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfacfpg_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfacfpg_Internalname, httpContext.getMessage( "Forma Pago", ""), "", "", lblTextblockfacfpg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_facfpg.setProperty("Caption", Combo_facfpg_Caption);
      ucCombo_facfpg.setProperty("Cls", Combo_facfpg_Cls);
      ucCombo_facfpg.setProperty("EmptyItemText", Combo_facfpg_Emptyitemtext);
      ucCombo_facfpg.setProperty("DropDownOptionsData", AV22FacFpg_Data);
      ucCombo_facfpg.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_facfpg_Internalname, "COMBO_FACFPGContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacFpg_Internalname, httpContext.getMessage( "Forma Pago Factura", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacFpg_Internalname, GXutil.rtrim( A437FacFpg), GXutil.rtrim( localUtil.format( A437FacFpg, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacFpg_Jsonclick, 0, "Attribute", "", "", "", "", edtFacFpg_Visible, edtFacFpg_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
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
      ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
      ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
      ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
      ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
      ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
      ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
      ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
      ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
      ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
      ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
      ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpTot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacImpTot_Internalname, httpContext.getMessage( "Total Bruto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpTot_Internalname, GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpTot_Enabled!=0) ? localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99") : localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpTot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpTot_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDtoGen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacDtoGen_Internalname, httpContext.getMessage( "Dto. Gral.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDtoGen_Internalname, GXutil.ltrim( localUtil.ntoc( A433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacDtoGen_Enabled!=0) ? localUtil.format( A433FacDtoGen, "Z9.99") : localUtil.format( A433FacDtoGen, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDtoGen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDtoGen_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacDto_Internalname, httpContext.getMessage( "Dto. P.P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDto_Internalname, GXutil.ltrim( localUtil.ntoc( A6632FacDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacDto_Enabled!=0) ? localUtil.format( A6632FacDto, "ZZ9.99") : localUtil.format( A6632FacDto, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpGen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacImpGen_Internalname, httpContext.getMessage( "Importe Dto. Gral.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpGen_Internalname, GXutil.ltrim( localUtil.ntoc( A439FacImpGen, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpGen_Enabled!=0) ? localUtil.format( A439FacImpGen, "ZZZZZZZ9.99") : localUtil.format( A439FacImpGen, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpGen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpGen_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpPP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacImpPP_Internalname, httpContext.getMessage( "Importe Dto. P.P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpPP_Internalname, GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpPP_Enabled!=0) ? localUtil.format( A440FacImpPP, "ZZZZZZZ9.99") : localUtil.format( A440FacImpPP, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpPP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpPP_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacBasImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacBasImp_Internalname, httpContext.getMessage( "Base Imponible", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacBasImp_Internalname, GXutil.ltrim( localUtil.ntoc( A429FacBasImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacBasImp_Enabled!=0) ? localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99") : localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacBasImp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacBasImp_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacIVAPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacIVAPor_Internalname, httpContext.getMessage( "IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacIVAPor_Internalname, GXutil.ltrim( localUtil.ntoc( A443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacIVAPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A443FacIVAPor), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A443FacIVAPor), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacIVAPor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacIVAPor_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacIVAImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacIVAImp_Internalname, httpContext.getMessage( "Importe IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacIVAImp_Internalname, GXutil.ltrim( localUtil.ntoc( A442FacIVAImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacIVAImp_Enabled!=0) ? localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99") : localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacIVAImp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacIVAImp_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
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
      ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
      ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
      ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
      ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
      ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
      ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
      ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
      ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
      ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
      ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
      ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacFirma_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacFirma_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtFacFirma_Internalname, GXutil.rtrim( A9605FacFirma), "", "", (short)(0), 1, edtFacFirma_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacObs_Internalname, httpContext.getMessage( "Obs Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtFacObs_Internalname, A7210FacObs, "", "", (short)(0), 1, edtFacObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_abonoscargoslineas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_abonoscargoslineas( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\AbonosCargos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV47Pgmname), GXutil.rtrim( localUtil.format( AV47Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_clicod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV31ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV31ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_meivaid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombomeivaid_Internalname, GXutil.rtrim( AV26ComboMeivaId), GXutil.rtrim( localUtil.format( AV26ComboMeivaId, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombomeivaid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombomeivaid_Visible, edtavCombomeivaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_facfpg_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofacfpg_Internalname, GXutil.rtrim( AV24ComboFacFpg), GXutil.rtrim( localUtil.format( AV24ComboFacFpg, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofacfpg_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofacfpg_Visible, edtavCombofacfpg_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacPri_Internalname, GXutil.rtrim( A450FacPri), GXutil.rtrim( localUtil.format( A450FacPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacPri_Jsonclick, 0, "Attribute", "", "", "", "", edtFacPri_Visible, edtFacPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_abonoscargoslineas( )
   {
      /*  Grid Control  */
      startgridcontrol169( ) ;
      nGXsfl_169_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount44 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_44 = (short)(1) ;
            scanStart1TW44( ) ;
            while ( RcdFound44 != 0 )
            {
               init_level_properties44( ) ;
               getByPrimaryKey1TW44( ) ;
               addRow1TW44( ) ;
               scanNext1TW44( ) ;
            }
            scanEnd1TW44( ) ;
            nBlankRcdCount44 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B445FacLiC = A445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         B1150FacNumVto = A1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         B1151FacPer = A1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         B1152FacDiaPag = A1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         B437FacFpg = A437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         B434FacDtoPP = A434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         B433FacDtoGen = A433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         B443FacIVAPor = A443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         B453FacRECPor = A453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         B14224FacCostFac = A14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         standaloneNotModal1TW44( ) ;
         standaloneModal1TW44( ) ;
         sMode44 = Gx_mode ;
         while ( nGXsfl_169_idx < nRC_GXsfl_169 )
         {
            bGXsfl_169_Refreshing = true ;
            readRow1TW44( ) ;
            edtFacLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACLIN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACDSC_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACMTS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacMts_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacPreMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREMTS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPreMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreMts_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACKGS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacKgs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacPreKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREKGS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPreKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreKgs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacUnds_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACUNDS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacUnds_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacUnds_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREUND_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreUnd_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacImpMan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMPMAN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacImpMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpMan_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtFacImpMan_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMPMAN_"+sGXsfl_169_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacImpMan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpMan_Visible), 5, 0), !bGXsfl_169_Refreshing);
            edtFacImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMP_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImp_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            if ( ( nRcdExists_44 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TW44( ) ;
            }
            sendRow1TW44( ) ;
            bGXsfl_169_Refreshing = false ;
         }
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A445FacLiC = B445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         A1150FacNumVto = B1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = B1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = B1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A437FacFpg = B437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A434FacDtoPP = B434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         A433FacDtoGen = B433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A443FacIVAPor = B443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = B453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         A14224FacCostFac = B14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount44 = (short)(5) ;
         nRcdExists_44 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TW44( ) ;
            while ( RcdFound44 != 0 )
            {
               sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_16944( ) ;
               init_level_properties44( ) ;
               standaloneNotModal1TW44( ) ;
               getByPrimaryKey1TW44( ) ;
               standaloneModal1TW44( ) ;
               addRow1TW44( ) ;
               scanNext1TW44( ) ;
            }
            scanEnd1TW44( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode44 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_16944( ) ;
         initAll1TW44( ) ;
         init_level_properties44( ) ;
         B445FacLiC = A445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         B1150FacNumVto = A1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         B1151FacPer = A1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         B1152FacDiaPag = A1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         B437FacFpg = A437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         B434FacDtoPP = A434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         B433FacDtoGen = A433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         B443FacIVAPor = A443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         B453FacRECPor = A453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         B14224FacCostFac = A14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         nRcdExists_44 = (short)(0) ;
         nIsMod_44 = (short)(0) ;
         nRcdDeleted_44 = (short)(0) ;
         nBlankRcdCount44 = (short)(nBlankRcdUsr44+nBlankRcdCount44) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount44 > 0 )
         {
            standaloneNotModal1TW44( ) ;
            standaloneModal1TW44( ) ;
            addRow1TW44( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtFacLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount44 = (short)(nBlankRcdCount44-1) ;
         }
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A445FacLiC = B445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         A1150FacNumVto = B1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = B1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = B1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A437FacFpg = B437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A434FacDtoPP = B434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         A433FacDtoGen = B433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A443FacIVAPor = B443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = B453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         A14224FacCostFac = B14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_abonoscargoslineasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_abonoscargoslineas", Gridlevel_abonoscargoslineasContainer, subGridlevel_abonoscargoslineas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_abonoscargoslineasContainerData", Gridlevel_abonoscargoslineasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_abonoscargoslineasContainerData"+"V", Gridlevel_abonoscargoslineasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_abonoscargoslineasContainerData"+"V"+"\" value='"+Gridlevel_abonoscargoslineasContainer.GridValuesHidden()+"'/>") ;
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
      e111TW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV30CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMEIVAID_DATA"), AV25MeivaId_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFACFPG_DATA"), AV22FacFpg_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z430FacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z437FacFpg = httpContext.cgiGet( "Z437FacFpg") ;
            Z443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( "Z443FacIVAPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z436FacFch = localUtil.ctod( httpContext.cgiGet( "Z436FacFch"), 0) ;
            Z450FacPri = httpContext.cgiGet( "Z450FacPri") ;
            Z433FacDtoGen = localUtil.ctond( httpContext.cgiGet( "Z433FacDtoGen")) ;
            Z434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "Z434FacDtoPP")) ;
            Z1725FacRegIva = httpContext.cgiGet( "Z1725FacRegIva") ;
            Z453FacRECPor = localUtil.ctond( httpContext.cgiGet( "Z453FacRECPor")) ;
            Z6632FacDto = localUtil.ctond( httpContext.cgiGet( "Z6632FacDto")) ;
            Z435FacEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z435FacEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z445FacLiC = (int)(localUtil.ctol( httpContext.cgiGet( "Z445FacLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z965FacCob = httpContext.cgiGet( "Z965FacCob") ;
            Z1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1150FacNumVto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1151FacPer = httpContext.cgiGet( "Z1151FacPer") ;
            Z1152FacDiaPag = httpContext.cgiGet( "Z1152FacDiaPag") ;
            Z1153FacTipFac = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1153FacTipFac"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z960FacIVACod = httpContext.cgiGet( "Z960FacIVACod") ;
            Z2739FacSerNum = httpContext.cgiGet( "Z2739FacSerNum") ;
            Z3096FacDivTCod = httpContext.cgiGet( "Z3096FacDivTCod") ;
            Z9605FacFirma = httpContext.cgiGet( "Z9605FacFirma") ;
            Z9606FacHor = localUtil.ctot( httpContext.cgiGet( "Z9606FacHor"), 0) ;
            Z9643FacLiq1 = localUtil.ctond( httpContext.cgiGet( "Z9643FacLiq1")) ;
            Z9644FacLiq2 = localUtil.ctond( httpContext.cgiGet( "Z9644FacLiq2")) ;
            Z9645FacIva1 = localUtil.ctond( httpContext.cgiGet( "Z9645FacIva1")) ;
            Z9646FacTot1 = localUtil.ctond( httpContext.cgiGet( "Z9646FacTot1")) ;
            Z14219FacEnergia = localUtil.ctond( httpContext.cgiGet( "Z14219FacEnergia")) ;
            Z14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "Z14224FacCostFac")) ;
            Z14222FacCostMts = localUtil.ctond( httpContext.cgiGet( "Z14222FacCostMts")) ;
            Z14223FacCostKgs = localUtil.ctond( httpContext.cgiGet( "Z14223FacCostKgs")) ;
            Z3119FacRepCod = httpContext.cgiGet( "Z3119FacRepCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11629MeivaId = httpContext.cgiGet( "Z11629MeivaId") ;
            Z3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3115FacDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7212FacRect = localUtil.ctond( httpContext.cgiGet( "Z7212FacRect")) ;
            Z8346FacRecI = localUtil.ctond( httpContext.cgiGet( "Z8346FacRecI")) ;
            Z11513FacRecIca = localUtil.ctond( httpContext.cgiGet( "Z11513FacRecIca")) ;
            A434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "Z434FacDtoPP")) ;
            A1725FacRegIva = httpContext.cgiGet( "Z1725FacRegIva") ;
            n1725FacRegIva = false ;
            A453FacRECPor = localUtil.ctond( httpContext.cgiGet( "Z453FacRECPor")) ;
            A445FacLiC = (int)(localUtil.ctol( httpContext.cgiGet( "Z445FacLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A965FacCob = httpContext.cgiGet( "Z965FacCob") ;
            A960FacIVACod = httpContext.cgiGet( "Z960FacIVACod") ;
            A3096FacDivTCod = httpContext.cgiGet( "Z3096FacDivTCod") ;
            n3096FacDivTCod = false ;
            A9643FacLiq1 = localUtil.ctond( httpContext.cgiGet( "Z9643FacLiq1")) ;
            A9644FacLiq2 = localUtil.ctond( httpContext.cgiGet( "Z9644FacLiq2")) ;
            A9645FacIva1 = localUtil.ctond( httpContext.cgiGet( "Z9645FacIva1")) ;
            A9646FacTot1 = localUtil.ctond( httpContext.cgiGet( "Z9646FacTot1")) ;
            A14219FacEnergia = localUtil.ctond( httpContext.cgiGet( "Z14219FacEnergia")) ;
            A14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "Z14224FacCostFac")) ;
            A14222FacCostMts = localUtil.ctond( httpContext.cgiGet( "Z14222FacCostMts")) ;
            A14223FacCostKgs = localUtil.ctond( httpContext.cgiGet( "Z14223FacCostKgs")) ;
            A3119FacRepCod = httpContext.cgiGet( "Z3119FacRepCod") ;
            n3119FacRepCod = false ;
            A3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3115FacDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3115FacDivCod = false ;
            A7212FacRect = localUtil.ctond( httpContext.cgiGet( "Z7212FacRect")) ;
            A8346FacRecI = localUtil.ctond( httpContext.cgiGet( "Z8346FacRecI")) ;
            n8346FacRecI = false ;
            A11513FacRecIca = localUtil.ctond( httpContext.cgiGet( "Z11513FacRecIca")) ;
            O445FacLiC = (int)(localUtil.ctol( httpContext.cgiGet( "O445FacLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( "O1150FacNumVto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1151FacPer = httpContext.cgiGet( "O1151FacPer") ;
            O1152FacDiaPag = httpContext.cgiGet( "O1152FacDiaPag") ;
            O437FacFpg = httpContext.cgiGet( "O437FacFpg") ;
            O434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "O434FacDtoPP")) ;
            O433FacDtoGen = localUtil.ctond( httpContext.cgiGet( "O433FacDtoGen")) ;
            O443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( "O443FacIVAPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O453FacRECPor = localUtil.ctond( httpContext.cgiGet( "O453FacRECPor")) ;
            O14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "O14224FacCostFac")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_169 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_169"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3115FacDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3119FacRepCod = httpContext.cgiGet( "N3119FacRepCod") ;
            N11629MeivaId = httpContext.cgiGet( "N11629MeivaId") ;
            AV37Ser30 = httpContext.cgiGet( "SER30") ;
            AV36Ser20 = httpContext.cgiGet( "SER20") ;
            AV35Ser0 = httpContext.cgiGet( "SER0") ;
            AV34Ser3 = httpContext.cgiGet( "SER3") ;
            AV33Ser2 = httpContext.cgiGet( "SER2") ;
            AV32Ser1 = httpContext.cgiGet( "SER1") ;
            A3919FacImpGen1 = localUtil.ctond( httpContext.cgiGet( "FACIMPGEN1")) ;
            A7209Colombia = (byte)(localUtil.ctol( httpContext.cgiGet( "COLOMBIA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7209Colombia = false ;
            A3920FacImpPP1 = localUtil.ctond( httpContext.cgiGet( "FACIMPPP1")) ;
            A3921FacIvaImp1 = localUtil.ctond( httpContext.cgiGet( "FACIVAIMP1")) ;
            A3922FacRecImp1 = localUtil.ctond( httpContext.cgiGet( "FACRECIMP1")) ;
            A452FacRecImp = localUtil.ctond( httpContext.cgiGet( "FACRECIMP")) ;
            A14220FacCostEne = localUtil.ctond( httpContext.cgiGet( "FACCOSTENE")) ;
            A7213FacImpRet = localUtil.ctond( httpContext.cgiGet( "FACIMPRET")) ;
            A8347FacImpReI = localUtil.ctond( httpContext.cgiGet( "FACIMPREI")) ;
            A11515FacImpIca = localUtil.ctond( httpContext.cgiGet( "FACIMPICA")) ;
            A455FacTot = localUtil.ctond( httpContext.cgiGet( "FACTOT")) ;
            A3918FacImpTot1 = localUtil.ctond( httpContext.cgiGet( "FACIMPTOT1")) ;
            A14219FacEnergia = localUtil.ctond( httpContext.cgiGet( "FACENERGIA")) ;
            A14218FacImpEng1 = localUtil.ctond( httpContext.cgiGet( "FACIMPENG1")) ;
            A14222FacCostMts = localUtil.ctond( httpContext.cgiGet( "FACCOSTMTS")) ;
            A14223FacCostKgs = localUtil.ctond( httpContext.cgiGet( "FACCOSTKGS")) ;
            A14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "FACCOSTFAC")) ;
            A14221FacCostEng = localUtil.ctond( httpContext.cgiGet( "FACCOSTENG")) ;
            A14225FacImpEner = localUtil.ctond( httpContext.cgiGet( "FACIMPENER")) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "vFACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FACDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3140CliDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "CLIDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3140CliDivCod = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "FACDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Insert_FacRepCod = httpContext.cgiGet( "vINSERT_FACREPCOD") ;
            A3119FacRepCod = httpContext.cgiGet( "FACREPCOD") ;
            AV15Insert_MeivaId = httpContext.cgiGet( "vINSERT_MEIVAID") ;
            AV19FacTipFac = (byte)(localUtil.ctol( httpContext.cgiGet( "vFACTIPFAC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29ContCod = httpContext.cgiGet( "vCONTCOD") ;
            A953IvaCod = httpContext.cgiGet( "IVACOD") ;
            n953IvaCod = false ;
            A960FacIVACod = httpContext.cgiGet( "FACIVACOD") ;
            A3091CliDivTra = httpContext.cgiGet( "CLIDIVTRA") ;
            n3091CliDivTra = false ;
            A3096FacDivTCod = httpContext.cgiGet( "FACDIVTCOD") ;
            A589IvaRec = localUtil.ctond( httpContext.cgiGet( "IVAREC")) ;
            n589IvaRec = false ;
            A453FacRECPor = localUtil.ctond( httpContext.cgiGet( "FACRECPOR")) ;
            AV33Ser2 = httpContext.cgiGet( "vSER2") ;
            AV36Ser20 = httpContext.cgiGet( "vSER20") ;
            AV32Ser1 = httpContext.cgiGet( "vSER1") ;
            A434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "FACDTOPP")) ;
            A7214FacImpRet1 = localUtil.ctond( httpContext.cgiGet( "FACIMPRET1")) ;
            A7212FacRect = localUtil.ctond( httpContext.cgiGet( "FACRECT")) ;
            A8348FacImpReI1 = localUtil.ctond( httpContext.cgiGet( "FACIMPREI1")) ;
            A8346FacRecI = localUtil.ctond( httpContext.cgiGet( "FACRECI")) ;
            A11514FacImpIca1 = localUtil.ctond( httpContext.cgiGet( "FACIMPICA1")) ;
            A11513FacRecIca = localUtil.ctond( httpContext.cgiGet( "FACRECICA")) ;
            AV28Facfch = localUtil.ctod( httpContext.cgiGet( "vFACFCH"), 0) ;
            AV27FacCodX = (int)(localUtil.ctol( httpContext.cgiGet( "vFACCODX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A965FacCob = httpContext.cgiGet( "FACCOB") ;
            AV37Ser30 = httpContext.cgiGet( "vSER30") ;
            AV35Ser0 = httpContext.cgiGet( "vSER0") ;
            AV34Ser3 = httpContext.cgiGet( "vSER3") ;
            A1725FacRegIva = httpContext.cgiGet( "FACREGIVA") ;
            A445FacLiC = (int)(localUtil.ctol( httpContext.cgiGet( "FACLIC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9643FacLiq1 = localUtil.ctond( httpContext.cgiGet( "FACLIQ1")) ;
            A9644FacLiq2 = localUtil.ctond( httpContext.cgiGet( "FACLIQ2")) ;
            A9645FacIva1 = localUtil.ctond( httpContext.cgiGet( "FACIVA1")) ;
            A9646FacTot1 = localUtil.ctond( httpContext.cgiGet( "FACTOT1")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3120FacRepNom = httpContext.cgiGet( "FACREPNOM") ;
            n3120FacRepNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A858ZonGeoCod = (short)(localUtil.ctol( httpContext.cgiGet( "ZONGEOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11630MeivaDsc = httpContext.cgiGet( "MEIVADSC") ;
            n11630MeivaDsc = false ;
            A3116FacDivAbr = httpContext.cgiGet( "FACDIVABR") ;
            n3116FacDivAbr = false ;
            A588IvaPor = (byte)(localUtil.ctol( httpContext.cgiGet( "IVAPOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n588IvaPor = false ;
            A1360ZonGeoNom = httpContext.cgiGet( "ZONGEONOM") ;
            n1360ZonGeoNom = false ;
            A1718CliRecDGrl = localUtil.ctond( httpContext.cgiGet( "CLIRECDGRL")) ;
            n1718CliRecDGrl = false ;
            A1719CliRecDPag = httpContext.cgiGet( "CLIRECDPAG") ;
            n1719CliRecDPag = false ;
            A1720CliRecDPpg = localUtil.ctond( httpContext.cgiGet( "CLIRECDPPG")) ;
            n1720CliRecDPpg = false ;
            A1721CliRecFpg = httpContext.cgiGet( "CLIRECFPG") ;
            n1721CliRecFpg = false ;
            A1722CliRecIVA = httpContext.cgiGet( "CLIRECIVA") ;
            n1722CliRecIVA = false ;
            A1723CliRecNVto = (byte)(localUtil.ctol( httpContext.cgiGet( "CLIRECNVTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1723CliRecNVto = false ;
            A1724CliRecPrd = httpContext.cgiGet( "CLIRECPRD") ;
            n1724CliRecPrd = false ;
            A3923FacImp1 = localUtil.ctond( httpContext.cgiGet( "FACIMP1")) ;
            A454FacSer = httpContext.cgiGet( "FACSER") ;
            A428FacAlbTip = (byte)(localUtil.ctol( httpContext.cgiGet( "FACALBTIP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5355FacImpMin = localUtil.ctond( httpContext.cgiGet( "FACIMPMIN")) ;
            A2239FacIml = localUtil.ctond( httpContext.cgiGet( "FACIML")) ;
            A3898FacPreKgsA = localUtil.ctond( httpContext.cgiGet( "FACPREKGSA")) ;
            A3897FacKgsA = localUtil.ctond( httpContext.cgiGet( "FACKGSA")) ;
            A3097FacTipPro = httpContext.cgiGet( "FACTIPPRO") ;
            Combo_clicod_Objectcall = httpContext.cgiGet( "COMBO_CLICOD_Objectcall") ;
            Combo_clicod_Class = httpContext.cgiGet( "COMBO_CLICOD_Class") ;
            Combo_clicod_Icontype = httpContext.cgiGet( "COMBO_CLICOD_Icontype") ;
            Combo_clicod_Icon = httpContext.cgiGet( "COMBO_CLICOD_Icon") ;
            Combo_clicod_Caption = httpContext.cgiGet( "COMBO_CLICOD_Caption") ;
            Combo_clicod_Tooltip = httpContext.cgiGet( "COMBO_CLICOD_Tooltip") ;
            Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
            Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
            Combo_clicod_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_get") ;
            Combo_clicod_Selectedtext_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_set") ;
            Combo_clicod_Selectedtext_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_get") ;
            Combo_clicod_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLICOD_Gamoauthtoken") ;
            Combo_clicod_Ddointernalname = httpContext.cgiGet( "COMBO_CLICOD_Ddointernalname") ;
            Combo_clicod_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolalign") ;
            Combo_clicod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLICOD_Dropdownoptionstype") ;
            Combo_clicod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Enabled")) ;
            Combo_clicod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Visible")) ;
            Combo_clicod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolidtoreplace") ;
            Combo_clicod_Datalisttype = httpContext.cgiGet( "COMBO_CLICOD_Datalisttype") ;
            Combo_clicod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Allowmultipleselection")) ;
            Combo_clicod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLICOD_Datalistfixedvalues") ;
            Combo_clicod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Isgriditem")) ;
            Combo_clicod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Hasdescription")) ;
            Combo_clicod_Datalistproc = httpContext.cgiGet( "COMBO_CLICOD_Datalistproc") ;
            Combo_clicod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLICOD_Datalistprocparametersprefix") ;
            Combo_clicod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLICOD_Remoteservicesparameters") ;
            Combo_clicod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLICOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clicod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeonlyselectedoption")) ;
            Combo_clicod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeselectalloption")) ;
            Combo_clicod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Emptyitem")) ;
            Combo_clicod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeaddnewoption")) ;
            Combo_clicod_Htmltemplate = httpContext.cgiGet( "COMBO_CLICOD_Htmltemplate") ;
            Combo_clicod_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluestype") ;
            Combo_clicod_Loadingdata = httpContext.cgiGet( "COMBO_CLICOD_Loadingdata") ;
            Combo_clicod_Noresultsfound = httpContext.cgiGet( "COMBO_CLICOD_Noresultsfound") ;
            Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
            Combo_clicod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLICOD_Onlyselectedvalues") ;
            Combo_clicod_Selectalltext = httpContext.cgiGet( "COMBO_CLICOD_Selectalltext") ;
            Combo_clicod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluesseparator") ;
            Combo_clicod_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLICOD_Addnewoptiontext") ;
            Combo_clicod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLICOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_meivaid_Objectcall = httpContext.cgiGet( "COMBO_MEIVAID_Objectcall") ;
            Combo_meivaid_Class = httpContext.cgiGet( "COMBO_MEIVAID_Class") ;
            Combo_meivaid_Icontype = httpContext.cgiGet( "COMBO_MEIVAID_Icontype") ;
            Combo_meivaid_Icon = httpContext.cgiGet( "COMBO_MEIVAID_Icon") ;
            Combo_meivaid_Caption = httpContext.cgiGet( "COMBO_MEIVAID_Caption") ;
            Combo_meivaid_Tooltip = httpContext.cgiGet( "COMBO_MEIVAID_Tooltip") ;
            Combo_meivaid_Cls = httpContext.cgiGet( "COMBO_MEIVAID_Cls") ;
            Combo_meivaid_Selectedvalue_set = httpContext.cgiGet( "COMBO_MEIVAID_Selectedvalue_set") ;
            Combo_meivaid_Selectedvalue_get = httpContext.cgiGet( "COMBO_MEIVAID_Selectedvalue_get") ;
            Combo_meivaid_Selectedtext_set = httpContext.cgiGet( "COMBO_MEIVAID_Selectedtext_set") ;
            Combo_meivaid_Selectedtext_get = httpContext.cgiGet( "COMBO_MEIVAID_Selectedtext_get") ;
            Combo_meivaid_Gamoauthtoken = httpContext.cgiGet( "COMBO_MEIVAID_Gamoauthtoken") ;
            Combo_meivaid_Ddointernalname = httpContext.cgiGet( "COMBO_MEIVAID_Ddointernalname") ;
            Combo_meivaid_Titlecontrolalign = httpContext.cgiGet( "COMBO_MEIVAID_Titlecontrolalign") ;
            Combo_meivaid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MEIVAID_Dropdownoptionstype") ;
            Combo_meivaid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Enabled")) ;
            Combo_meivaid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Visible")) ;
            Combo_meivaid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MEIVAID_Titlecontrolidtoreplace") ;
            Combo_meivaid_Datalisttype = httpContext.cgiGet( "COMBO_MEIVAID_Datalisttype") ;
            Combo_meivaid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Allowmultipleselection")) ;
            Combo_meivaid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MEIVAID_Datalistfixedvalues") ;
            Combo_meivaid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Isgriditem")) ;
            Combo_meivaid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Hasdescription")) ;
            Combo_meivaid_Datalistproc = httpContext.cgiGet( "COMBO_MEIVAID_Datalistproc") ;
            Combo_meivaid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MEIVAID_Datalistprocparametersprefix") ;
            Combo_meivaid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MEIVAID_Remoteservicesparameters") ;
            Combo_meivaid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MEIVAID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_meivaid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Includeonlyselectedoption")) ;
            Combo_meivaid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Includeselectalloption")) ;
            Combo_meivaid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Emptyitem")) ;
            Combo_meivaid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Includeaddnewoption")) ;
            Combo_meivaid_Htmltemplate = httpContext.cgiGet( "COMBO_MEIVAID_Htmltemplate") ;
            Combo_meivaid_Multiplevaluestype = httpContext.cgiGet( "COMBO_MEIVAID_Multiplevaluestype") ;
            Combo_meivaid_Loadingdata = httpContext.cgiGet( "COMBO_MEIVAID_Loadingdata") ;
            Combo_meivaid_Noresultsfound = httpContext.cgiGet( "COMBO_MEIVAID_Noresultsfound") ;
            Combo_meivaid_Emptyitemtext = httpContext.cgiGet( "COMBO_MEIVAID_Emptyitemtext") ;
            Combo_meivaid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MEIVAID_Onlyselectedvalues") ;
            Combo_meivaid_Selectalltext = httpContext.cgiGet( "COMBO_MEIVAID_Selectalltext") ;
            Combo_meivaid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MEIVAID_Multiplevaluesseparator") ;
            Combo_meivaid_Addnewoptiontext = httpContext.cgiGet( "COMBO_MEIVAID_Addnewoptiontext") ;
            Combo_meivaid_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MEIVAID_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable3_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Objectcall") ;
            Dvpanel_unnamedtable3_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Class") ;
            Dvpanel_unnamedtable3_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Enabled")) ;
            Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
            Dvpanel_unnamedtable3_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Height") ;
            Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
            Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
            Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
            Dvpanel_unnamedtable3_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showheader")) ;
            Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
            Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
            Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
            Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
            Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
            Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
            Dvpanel_unnamedtable3_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Visible")) ;
            Dvpanel_unnamedtable3_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_facfpg_Objectcall = httpContext.cgiGet( "COMBO_FACFPG_Objectcall") ;
            Combo_facfpg_Class = httpContext.cgiGet( "COMBO_FACFPG_Class") ;
            Combo_facfpg_Icontype = httpContext.cgiGet( "COMBO_FACFPG_Icontype") ;
            Combo_facfpg_Icon = httpContext.cgiGet( "COMBO_FACFPG_Icon") ;
            Combo_facfpg_Caption = httpContext.cgiGet( "COMBO_FACFPG_Caption") ;
            Combo_facfpg_Tooltip = httpContext.cgiGet( "COMBO_FACFPG_Tooltip") ;
            Combo_facfpg_Cls = httpContext.cgiGet( "COMBO_FACFPG_Cls") ;
            Combo_facfpg_Selectedvalue_set = httpContext.cgiGet( "COMBO_FACFPG_Selectedvalue_set") ;
            Combo_facfpg_Selectedvalue_get = httpContext.cgiGet( "COMBO_FACFPG_Selectedvalue_get") ;
            Combo_facfpg_Selectedtext_set = httpContext.cgiGet( "COMBO_FACFPG_Selectedtext_set") ;
            Combo_facfpg_Selectedtext_get = httpContext.cgiGet( "COMBO_FACFPG_Selectedtext_get") ;
            Combo_facfpg_Gamoauthtoken = httpContext.cgiGet( "COMBO_FACFPG_Gamoauthtoken") ;
            Combo_facfpg_Ddointernalname = httpContext.cgiGet( "COMBO_FACFPG_Ddointernalname") ;
            Combo_facfpg_Titlecontrolalign = httpContext.cgiGet( "COMBO_FACFPG_Titlecontrolalign") ;
            Combo_facfpg_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FACFPG_Dropdownoptionstype") ;
            Combo_facfpg_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Enabled")) ;
            Combo_facfpg_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Visible")) ;
            Combo_facfpg_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FACFPG_Titlecontrolidtoreplace") ;
            Combo_facfpg_Datalisttype = httpContext.cgiGet( "COMBO_FACFPG_Datalisttype") ;
            Combo_facfpg_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Allowmultipleselection")) ;
            Combo_facfpg_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FACFPG_Datalistfixedvalues") ;
            Combo_facfpg_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Isgriditem")) ;
            Combo_facfpg_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Hasdescription")) ;
            Combo_facfpg_Datalistproc = httpContext.cgiGet( "COMBO_FACFPG_Datalistproc") ;
            Combo_facfpg_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FACFPG_Datalistprocparametersprefix") ;
            Combo_facfpg_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FACFPG_Remoteservicesparameters") ;
            Combo_facfpg_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACFPG_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_facfpg_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Includeonlyselectedoption")) ;
            Combo_facfpg_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Includeselectalloption")) ;
            Combo_facfpg_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Emptyitem")) ;
            Combo_facfpg_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Includeaddnewoption")) ;
            Combo_facfpg_Htmltemplate = httpContext.cgiGet( "COMBO_FACFPG_Htmltemplate") ;
            Combo_facfpg_Multiplevaluestype = httpContext.cgiGet( "COMBO_FACFPG_Multiplevaluestype") ;
            Combo_facfpg_Loadingdata = httpContext.cgiGet( "COMBO_FACFPG_Loadingdata") ;
            Combo_facfpg_Noresultsfound = httpContext.cgiGet( "COMBO_FACFPG_Noresultsfound") ;
            Combo_facfpg_Emptyitemtext = httpContext.cgiGet( "COMBO_FACFPG_Emptyitemtext") ;
            Combo_facfpg_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FACFPG_Onlyselectedvalues") ;
            Combo_facfpg_Selectalltext = httpContext.cgiGet( "COMBO_FACFPG_Selectalltext") ;
            Combo_facfpg_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FACFPG_Multiplevaluesseparator") ;
            Combo_facfpg_Addnewoptiontext = httpContext.cgiGet( "COMBO_FACFPG_Addnewoptiontext") ;
            Combo_facfpg_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACFPG_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable5_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Objectcall") ;
            Dvpanel_unnamedtable5_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Class") ;
            Dvpanel_unnamedtable5_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Enabled")) ;
            Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
            Dvpanel_unnamedtable5_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Height") ;
            Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
            Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
            Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
            Dvpanel_unnamedtable5_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showheader")) ;
            Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
            Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
            Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
            Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
            Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
            Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
            Dvpanel_unnamedtable5_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Visible")) ;
            Dvpanel_unnamedtable5_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable6_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Objectcall") ;
            Dvpanel_unnamedtable6_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Class") ;
            Dvpanel_unnamedtable6_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Enabled")) ;
            Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
            Dvpanel_unnamedtable6_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Height") ;
            Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
            Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
            Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
            Dvpanel_unnamedtable6_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showheader")) ;
            Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
            Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
            Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
            Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
            Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
            Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
            Dvpanel_unnamedtable6_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Visible")) ;
            Dvpanel_unnamedtable6_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            AV21Texto_fd = httpContext.cgiGet( edtavTexto_fd_Internalname) ;
            A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtFacFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FACFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A436FacFch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
            }
            else
            {
               A436FacFch = localUtil.ctod( httpContext.cgiGet( edtFacFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtFacHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FACHOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacHor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A9606FacHor = localUtil.ctot( httpContext.cgiGet( edtFacHor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            cmbFacEst.setName( cmbFacEst.getInternalname() );
            cmbFacEst.setValue( httpContext.cgiGet( cmbFacEst.getInternalname()) );
            A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
            A2739FacSerNum = httpContext.cgiGet( edtFacSerNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
            cmbFacTipFac.setName( cmbFacTipFac.getInternalname() );
            cmbFacTipFac.setValue( httpContext.cgiGet( cmbFacTipFac.getInternalname()) );
            A1153FacTipFac = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacTipFac.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A11629MeivaId = httpContext.cgiGet( edtMeivaId_Internalname) ;
            n11629MeivaId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacNumVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacNumVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACNUMVTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacNumVto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1150FacNumVto = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
            }
            else
            {
               A1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacNumVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
            }
            A1151FacPer = httpContext.cgiGet( edtFacPer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
            A1152FacDiaPag = httpContext.cgiGet( edtFacDiaPag_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
            A437FacFpg = GXutil.upper( httpContext.cgiGet( edtFacFpg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
            A441FacImpTot = localUtil.ctond( httpContext.cgiGet( edtFacImpTot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacDtoGen_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacDtoGen_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACDTOGEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacDtoGen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A433FacDtoGen = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
            }
            else
            {
               A433FacDtoGen = localUtil.ctond( httpContext.cgiGet( edtFacDtoGen_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacDto_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6632FacDto = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
            }
            else
            {
               A6632FacDto = localUtil.ctond( httpContext.cgiGet( edtFacDto_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
            }
            A439FacImpGen = localUtil.ctond( httpContext.cgiGet( edtFacImpGen_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            A440FacImpPP = localUtil.ctond( httpContext.cgiGet( edtFacImpPP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            A429FacBasImp = localUtil.ctond( httpContext.cgiGet( edtFacBasImp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacIVAPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacIVAPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACIVAPOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacIVAPor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A443FacIVAPor = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
            }
            else
            {
               A443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacIVAPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
            }
            A442FacIVAImp = localUtil.ctond( httpContext.cgiGet( edtFacIVAImp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            A9605FacFirma = httpContext.cgiGet( edtFacFirma_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
            A7210FacObs = httpContext.cgiGet( edtFacObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
            AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
            AV31ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31ComboCliCod), 6, 0));
            AV26ComboMeivaId = httpContext.cgiGet( edtavCombomeivaid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ComboMeivaId", AV26ComboMeivaId);
            AV24ComboFacFpg = GXutil.upper( httpContext.cgiGet( edtavCombofacfpg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ComboFacFpg", AV24ComboFacFpg);
            A450FacPri = httpContext.cgiGet( edtFacPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"AbonosCargos");
            A9605FacFirma = httpContext.cgiGet( edtFacFirma_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
            forbiddenHiddens.add("FacFirma", GXutil.rtrim( localUtil.format( A9605FacFirma, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("Ser30", GXutil.rtrim( localUtil.format( AV37Ser30, "")));
            forbiddenHiddens.add("Ser20", GXutil.rtrim( localUtil.format( AV36Ser20, "")));
            forbiddenHiddens.add("Ser0", GXutil.rtrim( localUtil.format( AV35Ser0, "")));
            forbiddenHiddens.add("Ser3", GXutil.rtrim( localUtil.format( AV34Ser3, "")));
            forbiddenHiddens.add("Ser2", GXutil.rtrim( localUtil.format( AV33Ser2, "")));
            forbiddenHiddens.add("Ser1", GXutil.rtrim( localUtil.format( AV32Ser1, "")));
            AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
            forbiddenHiddens.add("FacRECPor", localUtil.format( A453FacRECPor, "ZZ9.99"));
            A7210FacObs = httpContext.cgiGet( edtFacObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
            forbiddenHiddens.add("FacObs", A7210FacObs);
            forbiddenHiddens.add("FacCob", GXutil.rtrim( localUtil.format( A965FacCob, "")));
            A1153FacTipFac = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacTipFac.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
            forbiddenHiddens.add("FacTipFac", localUtil.format( DecimalUtil.doubleToDec(A1153FacTipFac), "9"));
            forbiddenHiddens.add("FacIVACod", GXutil.rtrim( localUtil.format( A960FacIVACod, "@!")));
            forbiddenHiddens.add("FacLiq1", localUtil.format( A9643FacLiq1, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacLiq2", localUtil.format( A9644FacLiq2, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacIva1", localUtil.format( A9645FacIva1, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacTot1", localUtil.format( A9646FacTot1, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacEnergia", localUtil.format( A14219FacEnergia, "ZZ9.99"));
            forbiddenHiddens.add("FacCostFac", localUtil.format( A14224FacCostFac, "ZZ9.99"));
            forbiddenHiddens.add("FacCostMts", localUtil.format( A14222FacCostMts, "ZZZZZZ9.99"));
            forbiddenHiddens.add("FacCostKgs", localUtil.format( A14223FacCostKgs, "ZZZZZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A430FacCod != Z430FacCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\abonoscargos:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
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
                  sMode43 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode43 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound43 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TW0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FACCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "COMBO_CLICOD.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121TW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111TW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131TW2 ();
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
         e131TW2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TW43( ) ;
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
         disableAttributes1TW43( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto_fd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_fd_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomeivaid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomeivaid_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacfpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacfpg_Enabled), 5, 0), true);
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

   public void confirm_1TW0( )
   {
      beforeValidate1TW43( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TW43( ) ;
         }
         else
         {
            checkExtendedTable1TW43( ) ;
            closeExtendedTableCursors1TW43( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode43 = Gx_mode ;
         confirm_1TW44( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode43 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TW44( )
   {
      s445FacLiC = O445FacLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      nGXsfl_169_idx = 0 ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         readRow1TW44( ) ;
         if ( ( nRcdExists_44 != 0 ) || ( nIsMod_44 != 0 ) )
         {
            getKey1TW44( ) ;
            if ( ( nRcdExists_44 == 0 ) && ( nRcdDeleted_44 == 0 ) )
            {
               if ( RcdFound44 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TW44( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TW44( ) ;
                     closeExtendedTableCursors1TW44( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O445FacLiC = A445FacLiC ;
                     httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "FACLIN_" + sGXsfl_169_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFacLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound44 != 0 )
               {
                  if ( nRcdDeleted_44 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TW44( ) ;
                     load1TW44( ) ;
                     beforeValidate1TW44( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TW44( ) ;
                        O445FacLiC = A445FacLiC ;
                        httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_44 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TW44( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TW44( ) ;
                           closeExtendedTableCursors1TW44( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O445FacLiC = A445FacLiC ;
                           httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_44 == 0 )
                  {
                     GXCCtl = "FACLIN_" + sGXsfl_169_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFacLin_Internalname, GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacDsc_Internalname, GXutil.rtrim( A432FacDsc)) ;
         httpContext.changePostValue( edtFacMts_Internalname, GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreMts_Internalname, GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacUnds_Internalname, GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacImpMan_Internalname, GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacImp_Internalname, GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z446FacLin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z454FacSer_"+sGXsfl_169_idx, GXutil.rtrim( Z454FacSer)) ;
         httpContext.changePostValue( "ZT_"+"Z428FacAlbTip_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z432FacDsc_"+sGXsfl_169_idx, GXutil.rtrim( Z432FacDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z447FacMts_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z449FacPreMts_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z444FacKgs_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z448FacPreKgs_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3097FacTipPro_"+sGXsfl_169_idx, GXutil.rtrim( Z3097FacTipPro)) ;
         httpContext.changePostValue( "ZT_"+"Z5353FacImpMan_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12197FacUnds_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5355FacImpMin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3897FacKgsA_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_44_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_44_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_44_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_44 != 0 )
         {
            httpContext.changePostValue( "FACLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACDSC_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACMTS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREMTS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACKGS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREKGS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACUNDS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREUND_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMPMAN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMPMAN_"+sGXsfl_169_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMP_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O445FacLiC = s445FacLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TW0( )
   {
   }

   public void e111TW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV17FirmaD) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int2) ;
      abonoscargos_impl.this.GXt_int1 = GXv_int2[0] ;
      AV17FirmaD = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FirmaD), 4, 0));
      GXt_char3 = AV18ContDsc ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "FIRDIG", "") ;
      GXv_char6[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
      abonoscargos_impl.this.AV7EmprCod = GXv_char4[0] ;
      abonoscargos_impl.this.GXt_char3 = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      AV18ContDsc = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ContDsc", AV18ContDsc);
      GXt_char3 = AV48Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      abonoscargos_impl.this.GXt_char3 = GXv_char6[0] ;
      AV48Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Station", AV48Station);
      GXv_char6[0] = AV7EmprCod ;
      GXv_char5[0] = AV49Emprnom ;
      GXv_char4[0] = AV50Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char6, GXv_char5, GXv_char4) ;
      abonoscargos_impl.this.AV7EmprCod = GXv_char6[0] ;
      abonoscargos_impl.this.AV49Emprnom = GXv_char5[0] ;
      abonoscargos_impl.this.AV50Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Emprnom", AV49Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV50Usurcod", AV50Usurcod);
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      edtFacFpg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Visible), 5, 0), true);
      AV24ComboFacFpg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboFacFpg", AV24ComboFacFpg);
      edtavCombofacfpg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacfpg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacfpg_Visible), 5, 0), true);
      edtMeivaId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Visible), 5, 0), true);
      AV26ComboMeivaId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboMeivaId", AV26ComboMeivaId);
      edtavCombomeivaid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomeivaid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomeivaid_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV31ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOMEIVAID' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOFACFPG' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV47Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV51GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GXV1), 8, 0));
         while ( AV51GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV16TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV51GXV1));
            if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV12Insert_CliCod = (int)(GXutil.lval( AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CliCod), 6, 0));
               if ( ! (0==AV12Insert_CliCod) )
               {
                  AV31ComboCliCod = AV12Insert_CliCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31ComboCliCod), 6, 0));
                  Combo_clicod_Selectedvalue_set = GXutil.trim( GXutil.str( AV31ComboCliCod, 6, 0)) ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
                  Combo_clicod_Enabled = false ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FacDivCod") == 0 )
            {
               AV13Insert_FacDivCod = (byte)(GXutil.lval( AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_FacDivCod), 2, 0));
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FacRepCod") == 0 )
            {
               AV14Insert_FacRepCod = AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_FacRepCod", AV14Insert_FacRepCod);
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MeivaId") == 0 )
            {
               AV15Insert_MeivaId = AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_MeivaId", AV15Insert_MeivaId);
               if ( ! (GXutil.strcmp("", AV15Insert_MeivaId)==0) )
               {
                  AV26ComboMeivaId = AV15Insert_MeivaId ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26ComboMeivaId", AV26ComboMeivaId);
                  Combo_meivaid_Selectedvalue_set = AV26ComboMeivaId ;
                  ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "SelectedValue_set", Combo_meivaid_Selectedvalue_set);
                  Combo_meivaid_Enabled = false ;
                  ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "Enabled", GXutil.booltostr( Combo_meivaid_Enabled));
               }
            }
            AV51GXV1 = (int)(AV51GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GXV1), 8, 0));
         }
      }
      edtFacPri_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Visible), 5, 0), true);
   }

   public void e131TW2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char6[0] = AV40Cadena ;
      GXv_char5[0] = AV41firma ;
      new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, A430FacCod, A9606FacHor, GXv_char6, GXv_char5) ;
      abonoscargos_impl.this.AV40Cadena = GXv_char6[0] ;
      abonoscargos_impl.this.AV41firma = GXv_char5[0] ;
      GXv_char6[0] = AV45Hash ;
      GXv_objcol_SdtMessages_Message8[0] = AV42Messages ;
      GXv_boolean9[0] = AV43ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV40Cadena, GXv_char6, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
      abonoscargos_impl.this.AV45Hash = GXv_char6[0] ;
      AV42Messages = GXv_objcol_SdtMessages_Message8[0] ;
      abonoscargos_impl.this.AV43ok = GXv_boolean9[0] ;
      if ( AV43ok )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
      }
      else
      {
         AV52GXV2 = 1 ;
         while ( AV52GXV2 <= AV42Messages.size() )
         {
            AV44Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV42Messages.elementAt(-1+AV52GXV2));
            httpContext.GX_msglist.addItem(AV44Message.getgxTv_SdtMessages_Message_Description());
            AV52GXV2 = (int)(AV52GXV2+1) ;
         }
      }
      GXv_char6[0] = A396EmprCod ;
      GXv_int10[0] = A430FacCod ;
      GXv_char5[0] = AV40Cadena ;
      GXv_char4[0] = AV45Hash ;
      new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5, GXv_char4) ;
      abonoscargos_impl.this.A396EmprCod = GXv_char6[0] ;
      abonoscargos_impl.this.A430FacCod = GXv_int10[0] ;
      abonoscargos_impl.this.AV40Cadena = GXv_char5[0] ;
      abonoscargos_impl.this.AV45Hash = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.facturacion.abonoscargosww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(13);
      pr_default.close(12);
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e121TW2( )
   {
      /* Combo_clicod_Onoptionclicked Routine */
      returnInSub = false ;
      AV31ComboCliCod = (int)(GXutil.lval( Combo_clicod_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31ComboCliCod), 6, 0));
      httpContext.GX_msglist.addItem(httpContext.getMessage( "&mode=", "")+Gx_mode+httpContext.getMessage( "Emprcod=", "")+A396EmprCod+httpContext.getMessage( "&ComboCliCod=", "")+GXutil.str( AV31ComboCliCod, 6, 0)+httpContext.getMessage( "&FacPri=", "")+AV38FacPri);
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         GXv_int2[0] = A1150FacNumVto ;
         GXv_char6[0] = A1151FacPer ;
         GXv_char5[0] = A1152FacDiaPag ;
         GXv_char4[0] = A437FacFpg ;
         GXv_decimal11[0] = A433FacDtoGen ;
         GXv_decimal12[0] = A434FacDtoPP ;
         GXv_char13[0] = A1725FacRegIva ;
         new app.facturacion.datosclifpg(remoteHandle, context).execute( A396EmprCod, AV31ComboCliCod, AV38FacPri, GXv_int2, GXv_char6, GXv_char5, GXv_char4, GXv_decimal11, GXv_decimal12, GXv_char13) ;
         abonoscargos_impl.this.A1150FacNumVto = GXv_int2[0] ;
         abonoscargos_impl.this.A1151FacPer = GXv_char6[0] ;
         abonoscargos_impl.this.A1152FacDiaPag = GXv_char5[0] ;
         abonoscargos_impl.this.A437FacFpg = GXv_char4[0] ;
         abonoscargos_impl.this.A433FacDtoGen = GXv_decimal11[0] ;
         abonoscargos_impl.this.A434FacDtoPP = GXv_decimal12[0] ;
         abonoscargos_impl.this.A1725FacRegIva = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1725FacRegIva", A1725FacRegIva);
         AV24ComboFacFpg = A437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ComboFacFpg", AV24ComboFacFpg);
         Combo_facfpg_Selectedvalue_set = GXutil.trim( AV24ComboFacFpg) ;
         ucCombo_facfpg.sendProperty(context, "", false, Combo_facfpg_Internalname, "SelectedValue_set", Combo_facfpg_Selectedvalue_set);
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'LOADCOMBOFACFPG' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV22FacFpg_Data ;
      GXv_char13[0] = AV23ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.facturacion.abonoscargosloaddvcombo(remoteHandle, context).execute( "FacFpg", Gx_mode, AV7EmprCod, AV8FacCod, GXv_char13, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      abonoscargos_impl.this.AV23ComboSelectedValue = GXv_char13[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV22FacFpg_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_facfpg_Selectedvalue_set = AV23ComboSelectedValue ;
      ucCombo_facfpg.sendProperty(context, "", false, Combo_facfpg_Internalname, "SelectedValue_set", Combo_facfpg_Selectedvalue_set);
      AV24ComboFacFpg = AV23ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboFacFpg", AV24ComboFacFpg);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_facfpg_Enabled = false ;
         ucCombo_facfpg.sendProperty(context, "", false, Combo_facfpg_Internalname, "Enabled", GXutil.booltostr( Combo_facfpg_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOMEIVAID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV25MeivaId_Data ;
      GXv_char13[0] = AV23ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.facturacion.abonoscargosloaddvcombo(remoteHandle, context).execute( "MeivaId", Gx_mode, AV7EmprCod, AV8FacCod, GXv_char13, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      abonoscargos_impl.this.AV23ComboSelectedValue = GXv_char13[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV25MeivaId_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_meivaid_Selectedvalue_set = AV23ComboSelectedValue ;
      ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "SelectedValue_set", Combo_meivaid_Selectedvalue_set);
      AV26ComboMeivaId = AV23ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboMeivaId", AV26ComboMeivaId);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_meivaid_Enabled = false ;
         ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "Enabled", GXutil.booltostr( Combo_meivaid_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV30CliCod_Data ;
      GXv_char13[0] = AV23ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.facturacion.abonoscargosloaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV7EmprCod, AV8FacCod, GXv_char13, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      abonoscargos_impl.this.AV23ComboSelectedValue = GXv_char13[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV30CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_clicod_Selectedvalue_set = AV23ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV31ComboCliCod = (int)(GXutil.lval( AV23ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void zm1TW43( int GX_JID )
   {
      if ( ( GX_JID == 83 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z437FacFpg = T01TW5_A437FacFpg[0] ;
            Z443FacIVAPor = T01TW5_A443FacIVAPor[0] ;
            Z436FacFch = T01TW5_A436FacFch[0] ;
            Z450FacPri = T01TW5_A450FacPri[0] ;
            Z433FacDtoGen = T01TW5_A433FacDtoGen[0] ;
            Z434FacDtoPP = T01TW5_A434FacDtoPP[0] ;
            Z1725FacRegIva = T01TW5_A1725FacRegIva[0] ;
            Z453FacRECPor = T01TW5_A453FacRECPor[0] ;
            Z6632FacDto = T01TW5_A6632FacDto[0] ;
            Z435FacEst = T01TW5_A435FacEst[0] ;
            Z445FacLiC = T01TW5_A445FacLiC[0] ;
            Z965FacCob = T01TW5_A965FacCob[0] ;
            Z1150FacNumVto = T01TW5_A1150FacNumVto[0] ;
            Z1151FacPer = T01TW5_A1151FacPer[0] ;
            Z1152FacDiaPag = T01TW5_A1152FacDiaPag[0] ;
            Z1153FacTipFac = T01TW5_A1153FacTipFac[0] ;
            Z960FacIVACod = T01TW5_A960FacIVACod[0] ;
            Z2739FacSerNum = T01TW5_A2739FacSerNum[0] ;
            Z3096FacDivTCod = T01TW5_A3096FacDivTCod[0] ;
            Z9605FacFirma = T01TW5_A9605FacFirma[0] ;
            Z9606FacHor = T01TW5_A9606FacHor[0] ;
            Z9643FacLiq1 = T01TW5_A9643FacLiq1[0] ;
            Z9644FacLiq2 = T01TW5_A9644FacLiq2[0] ;
            Z9645FacIva1 = T01TW5_A9645FacIva1[0] ;
            Z9646FacTot1 = T01TW5_A9646FacTot1[0] ;
            Z14219FacEnergia = T01TW5_A14219FacEnergia[0] ;
            Z14224FacCostFac = T01TW5_A14224FacCostFac[0] ;
            Z14222FacCostMts = T01TW5_A14222FacCostMts[0] ;
            Z14223FacCostKgs = T01TW5_A14223FacCostKgs[0] ;
            Z3119FacRepCod = T01TW5_A3119FacRepCod[0] ;
            Z252CliCod = T01TW5_A252CliCod[0] ;
            Z11629MeivaId = T01TW5_A11629MeivaId[0] ;
            Z3115FacDivCod = T01TW5_A3115FacDivCod[0] ;
            Z14222FacCostMts = T01TW5_A14222FacCostMts[0] ;
            Z14223FacCostKgs = T01TW5_A14223FacCostKgs[0] ;
            Z7212FacRect = T01TW5_A7212FacRect[0] ;
            Z8346FacRecI = T01TW5_A8346FacRecI[0] ;
            Z11513FacRecIca = T01TW5_A11513FacRecIca[0] ;
         }
         else
         {
            Z437FacFpg = A437FacFpg ;
            Z443FacIVAPor = A443FacIVAPor ;
            Z436FacFch = A436FacFch ;
            Z450FacPri = A450FacPri ;
            Z433FacDtoGen = A433FacDtoGen ;
            Z434FacDtoPP = A434FacDtoPP ;
            Z1725FacRegIva = A1725FacRegIva ;
            Z453FacRECPor = A453FacRECPor ;
            Z6632FacDto = A6632FacDto ;
            Z435FacEst = A435FacEst ;
            Z445FacLiC = A445FacLiC ;
            Z965FacCob = A965FacCob ;
            Z1150FacNumVto = A1150FacNumVto ;
            Z1151FacPer = A1151FacPer ;
            Z1152FacDiaPag = A1152FacDiaPag ;
            Z1153FacTipFac = A1153FacTipFac ;
            Z960FacIVACod = A960FacIVACod ;
            Z2739FacSerNum = A2739FacSerNum ;
            Z3096FacDivTCod = A3096FacDivTCod ;
            Z9605FacFirma = A9605FacFirma ;
            Z9606FacHor = A9606FacHor ;
            Z9643FacLiq1 = A9643FacLiq1 ;
            Z9644FacLiq2 = A9644FacLiq2 ;
            Z9645FacIva1 = A9645FacIva1 ;
            Z9646FacTot1 = A9646FacTot1 ;
            Z14219FacEnergia = A14219FacEnergia ;
            Z14224FacCostFac = A14224FacCostFac ;
            Z14222FacCostMts = A14222FacCostMts ;
            Z14223FacCostKgs = A14223FacCostKgs ;
            Z3119FacRepCod = A3119FacRepCod ;
            Z252CliCod = A252CliCod ;
            Z11629MeivaId = A11629MeivaId ;
            Z3115FacDivCod = A3115FacDivCod ;
            Z14222FacCostMts = A14222FacCostMts ;
            Z14223FacCostKgs = A14223FacCostKgs ;
            Z7212FacRect = A7212FacRect ;
            Z8346FacRecI = A8346FacRecI ;
            Z11513FacRecIca = A11513FacRecIca ;
         }
      }
      if ( GX_JID == -83 )
      {
         Z430FacCod = A430FacCod ;
         Z437FacFpg = A437FacFpg ;
         Z443FacIVAPor = A443FacIVAPor ;
         Z436FacFch = A436FacFch ;
         Z450FacPri = A450FacPri ;
         Z433FacDtoGen = A433FacDtoGen ;
         Z434FacDtoPP = A434FacDtoPP ;
         Z1725FacRegIva = A1725FacRegIva ;
         Z453FacRECPor = A453FacRECPor ;
         Z6632FacDto = A6632FacDto ;
         Z7210FacObs = A7210FacObs ;
         Z435FacEst = A435FacEst ;
         Z445FacLiC = A445FacLiC ;
         Z965FacCob = A965FacCob ;
         Z1150FacNumVto = A1150FacNumVto ;
         Z1151FacPer = A1151FacPer ;
         Z1152FacDiaPag = A1152FacDiaPag ;
         Z1153FacTipFac = A1153FacTipFac ;
         Z960FacIVACod = A960FacIVACod ;
         Z2739FacSerNum = A2739FacSerNum ;
         Z3096FacDivTCod = A3096FacDivTCod ;
         Z9605FacFirma = A9605FacFirma ;
         Z9606FacHor = A9606FacHor ;
         Z9643FacLiq1 = A9643FacLiq1 ;
         Z9644FacLiq2 = A9644FacLiq2 ;
         Z9645FacIva1 = A9645FacIva1 ;
         Z9646FacTot1 = A9646FacTot1 ;
         Z14219FacEnergia = A14219FacEnergia ;
         Z14224FacCostFac = A14224FacCostFac ;
         Z14222FacCostMts = A14222FacCostMts ;
         Z14223FacCostKgs = A14223FacCostKgs ;
         Z396EmprCod = A396EmprCod ;
         Z3119FacRepCod = A3119FacRepCod ;
         Z252CliCod = A252CliCod ;
         Z11629MeivaId = A11629MeivaId ;
         Z3115FacDivCod = A3115FacDivCod ;
         Z7212FacRect = A7212FacRect ;
         Z8346FacRecI = A8346FacRecI ;
         Z11513FacRecIca = A11513FacRecIca ;
         Z3116FacDivAbr = A3116FacDivAbr ;
         Z407EmprNom = A407EmprNom ;
         Z7209Colombia = A7209Colombia ;
         Z953IvaCod = A953IvaCod ;
         Z588IvaPor = A588IvaPor ;
         Z589IvaRec = A589IvaRec ;
         Z3120FacRepNom = A3120FacRepNom ;
         Z3918FacImpTot1 = A3918FacImpTot1 ;
         Z279CliNom = A279CliNom ;
         Z3091CliDivTra = A3091CliDivTra ;
         Z3140CliDivCod = A3140CliDivCod ;
         Z858ZonGeoCod = A858ZonGeoCod ;
         Z1360ZonGeoNom = A1360ZonGeoNom ;
         Z1718CliRecDGrl = A1718CliRecDGrl ;
         Z1719CliRecDPag = A1719CliRecDPag ;
         Z1720CliRecDPpg = A1720CliRecDPpg ;
         Z1721CliRecFpg = A1721CliRecFpg ;
         Z1722CliRecIVA = A1722CliRecIVA ;
         Z1723CliRecNVto = A1723CliRecNVto ;
         Z1724CliRecPrd = A1724CliRecPrd ;
         Z11630MeivaDsc = A11630MeivaDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtFacFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFirma_Enabled), 5, 0), true);
      edtFacObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Enabled), 5, 0), true);
      edtFacSerNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      cmbFacTipFac.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacTipFac.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacTipFac.getEnabled(), 5, 0), true);
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
      AV47Pgmname = "Facturacion.AbonosCargos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtFacFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFirma_Enabled), 5, 0), true);
      edtFacObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Enabled), 5, 0), true);
      edtFacSerNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      cmbFacTipFac.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacTipFac.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacTipFac.getEnabled(), 5, 0), true);
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TW6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TW6_A407EmprNom[0] ;
      n407EmprNom = T01TW6_n407EmprNom[0] ;
      A7209Colombia = T01TW6_A7209Colombia[0] ;
      n7209Colombia = T01TW6_n7209Colombia[0] ;
      A953IvaCod = T01TW6_A953IvaCod[0] ;
      n953IvaCod = T01TW6_n953IvaCod[0] ;
      pr_default.close(4);
      /* Using cursor T01TW12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPIVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IVACOD");
         AnyError = (short)(1) ;
      }
      A588IvaPor = T01TW12_A588IvaPor[0] ;
      n588IvaPor = T01TW12_n588IvaPor[0] ;
      A589IvaRec = T01TW12_A589IvaRec[0] ;
      n589IvaRec = T01TW12_n589IvaRec[0] ;
      pr_default.close(10);
      GXt_int1 = (byte)(0) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "FACIMM", ""), ""), GXv_int2) ;
      abonoscargos_impl.this.GXt_int1 = GXv_int2[0] ;
      edtFacImpMan_Visible = ((GXt_int1==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpMan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpMan_Visible), 5, 0), !bGXsfl_169_Refreshing);
      if ( ! (0==AV8FacCod) )
      {
         A430FacCod = AV8FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      if ( AV19FacTipFac == 1 )
      {
         AV29ContCod = "050200" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ContCod", AV29ContCod);
      }
      else
      {
         if ( AV19FacTipFac == 2 )
         {
            AV29ContCod = "050300" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29ContCod", AV29ContCod);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_MeivaId)==0) )
      {
         edtMeivaId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Enabled), 5, 0), true);
      }
      else
      {
         edtMeivaId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_FacRepCod)==0) )
      {
         A3119FacRepCod = AV14Insert_FacRepCod ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         A252CliCod = AV12Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV31ComboCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_MeivaId)==0) )
      {
         A11629MeivaId = AV15Insert_MeivaId ;
         n11629MeivaId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
      }
      else
      {
         if ( (GXutil.strcmp("", AV26ComboMeivaId)==0) )
         {
            A11629MeivaId = "" ;
            n11629MeivaId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
            n11629MeivaId = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV26ComboMeivaId)==0) )
            {
               A11629MeivaId = AV26ComboMeivaId ;
               n11629MeivaId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
            }
         }
      }
      A437FacFpg = AV24ComboFacFpg ;
      httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
      if ( isIns( )  )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_char6[0] = AV32Ser1 ;
         GXv_char5[0] = AV33Ser2 ;
         GXv_char4[0] = AV34Ser3 ;
         GXv_char16[0] = AV35Ser0 ;
         GXv_char17[0] = AV36Ser20 ;
         GXv_char18[0] = AV37Ser30 ;
         new app.pnumser(remoteHandle, context).execute( GXv_char13, GXv_char6, GXv_char5, GXv_char4, GXv_char16, GXv_char17, GXv_char18) ;
         abonoscargos_impl.this.A396EmprCod = GXv_char13[0] ;
         abonoscargos_impl.this.AV32Ser1 = GXv_char6[0] ;
         abonoscargos_impl.this.AV33Ser2 = GXv_char5[0] ;
         abonoscargos_impl.this.AV34Ser3 = GXv_char4[0] ;
         abonoscargos_impl.this.AV35Ser0 = GXv_char16[0] ;
         abonoscargos_impl.this.AV36Ser20 = GXv_char17[0] ;
         abonoscargos_impl.this.AV37Ser30 = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ser1", AV32Ser1);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ser2", AV33Ser2);
         httpContext.ajax_rsp_assign_attri("", false, "AV34Ser3", AV34Ser3);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Ser0", AV35Ser0);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Ser20", AV36Ser20);
         httpContext.ajax_rsp_assign_attri("", false, "AV37Ser30", AV37Ser30);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A436FacFch)) && ( Gx_BScreen == 0 ) )
      {
         A436FacFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
      }
      if ( isIns( )  && (0==A1153FacTipFac) && ( Gx_BScreen == 0 ) )
      {
         A1153FacTipFac = AV19FacTipFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A450FacPri)==0) && ( Gx_BScreen == 0 ) )
      {
         A450FacPri = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      }
      if ( isIns( )  && (0==A435FacEst) && ( Gx_BScreen == 0 ) )
      {
         A435FacEst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A960FacIVACod)==0) && ( Gx_BScreen == 0 ) )
      {
         A960FacIVACod = A953IvaCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A960FacIVACod", A960FacIVACod);
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A453FacRECPor)==0) && ( Gx_BScreen == 0 ) )
      {
         A453FacRECPor = A589IvaRec ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A9606FacHor) && ( Gx_BScreen == 0 ) )
      {
         A9606FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01TW16 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            A3918FacImpTot1 = T01TW16_A3918FacImpTot1[0] ;
         }
         else
         {
            A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         }
         pr_default.close(13);
         /* Using cursor T01TW7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
         A3120FacRepNom = T01TW7_A3120FacRepNom[0] ;
         n3120FacRepNom = T01TW7_n3120FacRepNom[0] ;
         pr_default.close(5);
         /* Using cursor T01TW8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TW8_A279CliNom[0] ;
         A3091CliDivTra = T01TW8_A3091CliDivTra[0] ;
         n3091CliDivTra = T01TW8_n3091CliDivTra[0] ;
         A3140CliDivCod = T01TW8_A3140CliDivCod[0] ;
         n3140CliDivCod = T01TW8_n3140CliDivCod[0] ;
         A858ZonGeoCod = T01TW8_A858ZonGeoCod[0] ;
         pr_default.close(6);
         /* Using cursor T01TW13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
         A1360ZonGeoNom = T01TW13_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01TW13_n1360ZonGeoNom[0] ;
         pr_default.close(11);
         /* Using cursor T01TW10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
         A11630MeivaDsc = T01TW10_A11630MeivaDsc[0] ;
         n11630MeivaDsc = T01TW10_n11630MeivaDsc[0] ;
         pr_default.close(8);
         /* Using cursor T01TW14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A450FacPri});
         if ( (pr_default.getStatus(12) != 101) )
         {
            A1718CliRecDGrl = T01TW14_A1718CliRecDGrl[0] ;
            n1718CliRecDGrl = T01TW14_n1718CliRecDGrl[0] ;
            A1719CliRecDPag = T01TW14_A1719CliRecDPag[0] ;
            n1719CliRecDPag = T01TW14_n1719CliRecDPag[0] ;
            A1720CliRecDPpg = T01TW14_A1720CliRecDPpg[0] ;
            n1720CliRecDPpg = T01TW14_n1720CliRecDPpg[0] ;
            A1721CliRecFpg = T01TW14_A1721CliRecFpg[0] ;
            n1721CliRecFpg = T01TW14_n1721CliRecFpg[0] ;
            A1722CliRecIVA = T01TW14_A1722CliRecIVA[0] ;
            n1722CliRecIVA = T01TW14_n1722CliRecIVA[0] ;
            A1723CliRecNVto = T01TW14_A1723CliRecNVto[0] ;
            n1723CliRecNVto = T01TW14_n1723CliRecNVto[0] ;
            A1724CliRecPrd = T01TW14_A1724CliRecPrd[0] ;
            n1724CliRecPrd = T01TW14_n1724CliRecPrd[0] ;
         }
         else
         {
            A1724CliRecPrd = "" ;
            n1724CliRecPrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1724CliRecPrd", A1724CliRecPrd);
            A1723CliRecNVto = (byte)(0) ;
            n1723CliRecNVto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1723CliRecNVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1723CliRecNVto), 2, 0));
            A1722CliRecIVA = "" ;
            n1722CliRecIVA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1722CliRecIVA", A1722CliRecIVA);
            A1721CliRecFpg = "" ;
            n1721CliRecFpg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1721CliRecFpg", A1721CliRecFpg);
            A1720CliRecDPpg = DecimalUtil.doubleToDec(0) ;
            n1720CliRecDPpg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1720CliRecDPpg", GXutil.ltrimstr( A1720CliRecDPpg, 6, 2));
            A1719CliRecDPag = "" ;
            n1719CliRecDPag = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1719CliRecDPag", A1719CliRecDPag);
            A1718CliRecDGrl = DecimalUtil.doubleToDec(0) ;
            n1718CliRecDGrl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1718CliRecDGrl", GXutil.ltrimstr( A1718CliRecDGrl, 6, 2));
         }
         pr_default.close(12);
      }
   }

   public void load1TW43( )
   {
      /* Using cursor T01TW18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A7210FacObs = T01TW18_A7210FacObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
         A437FacFpg = T01TW18_A437FacFpg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A443FacIVAPor = T01TW18_A443FacIVAPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A407EmprNom = T01TW18_A407EmprNom[0] ;
         n407EmprNom = T01TW18_n407EmprNom[0] ;
         A436FacFch = T01TW18_A436FacFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
         A450FacPri = T01TW18_A450FacPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         A279CliNom = T01TW18_A279CliNom[0] ;
         A433FacDtoGen = T01TW18_A433FacDtoGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A434FacDtoPP = T01TW18_A434FacDtoPP[0] ;
         A588IvaPor = T01TW18_A588IvaPor[0] ;
         n588IvaPor = T01TW18_n588IvaPor[0] ;
         A589IvaRec = T01TW18_A589IvaRec[0] ;
         n589IvaRec = T01TW18_n589IvaRec[0] ;
         A1725FacRegIva = T01TW18_A1725FacRegIva[0] ;
         n1725FacRegIva = T01TW18_n1725FacRegIva[0] ;
         A453FacRECPor = T01TW18_A453FacRECPor[0] ;
         A6632FacDto = T01TW18_A6632FacDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
         A435FacEst = T01TW18_A435FacEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
         A445FacLiC = T01TW18_A445FacLiC[0] ;
         A965FacCob = T01TW18_A965FacCob[0] ;
         A1150FacNumVto = T01TW18_A1150FacNumVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = T01TW18_A1151FacPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = T01TW18_A1152FacDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A1153FacTipFac = T01TW18_A1153FacTipFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
         A960FacIVACod = T01TW18_A960FacIVACod[0] ;
         A2739FacSerNum = T01TW18_A2739FacSerNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
         A3091CliDivTra = T01TW18_A3091CliDivTra[0] ;
         n3091CliDivTra = T01TW18_n3091CliDivTra[0] ;
         A3116FacDivAbr = T01TW18_A3116FacDivAbr[0] ;
         n3116FacDivAbr = T01TW18_n3116FacDivAbr[0] ;
         A3096FacDivTCod = T01TW18_A3096FacDivTCod[0] ;
         n3096FacDivTCod = T01TW18_n3096FacDivTCod[0] ;
         A3120FacRepNom = T01TW18_A3120FacRepNom[0] ;
         n3120FacRepNom = T01TW18_n3120FacRepNom[0] ;
         A9605FacFirma = T01TW18_A9605FacFirma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
         A9606FacHor = T01TW18_A9606FacHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9643FacLiq1 = T01TW18_A9643FacLiq1[0] ;
         A9644FacLiq2 = T01TW18_A9644FacLiq2[0] ;
         A9645FacIva1 = T01TW18_A9645FacIva1[0] ;
         A9646FacTot1 = T01TW18_A9646FacTot1[0] ;
         A1360ZonGeoNom = T01TW18_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01TW18_n1360ZonGeoNom[0] ;
         A11630MeivaDsc = T01TW18_A11630MeivaDsc[0] ;
         n11630MeivaDsc = T01TW18_n11630MeivaDsc[0] ;
         A14219FacEnergia = T01TW18_A14219FacEnergia[0] ;
         A14224FacCostFac = T01TW18_A14224FacCostFac[0] ;
         A7209Colombia = T01TW18_A7209Colombia[0] ;
         n7209Colombia = T01TW18_n7209Colombia[0] ;
         A14222FacCostMts = T01TW18_A14222FacCostMts[0] ;
         A14223FacCostKgs = T01TW18_A14223FacCostKgs[0] ;
         A3119FacRepCod = T01TW18_A3119FacRepCod[0] ;
         n3119FacRepCod = T01TW18_n3119FacRepCod[0] ;
         A252CliCod = T01TW18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11629MeivaId = T01TW18_A11629MeivaId[0] ;
         n11629MeivaId = T01TW18_n11629MeivaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         A3115FacDivCod = T01TW18_A3115FacDivCod[0] ;
         n3115FacDivCod = T01TW18_n3115FacDivCod[0] ;
         A953IvaCod = T01TW18_A953IvaCod[0] ;
         n953IvaCod = T01TW18_n953IvaCod[0] ;
         A3140CliDivCod = T01TW18_A3140CliDivCod[0] ;
         n3140CliDivCod = T01TW18_n3140CliDivCod[0] ;
         A858ZonGeoCod = T01TW18_A858ZonGeoCod[0] ;
         A1718CliRecDGrl = T01TW18_A1718CliRecDGrl[0] ;
         n1718CliRecDGrl = T01TW18_n1718CliRecDGrl[0] ;
         A1719CliRecDPag = T01TW18_A1719CliRecDPag[0] ;
         n1719CliRecDPag = T01TW18_n1719CliRecDPag[0] ;
         A1720CliRecDPpg = T01TW18_A1720CliRecDPpg[0] ;
         n1720CliRecDPpg = T01TW18_n1720CliRecDPpg[0] ;
         A1721CliRecFpg = T01TW18_A1721CliRecFpg[0] ;
         n1721CliRecFpg = T01TW18_n1721CliRecFpg[0] ;
         A1722CliRecIVA = T01TW18_A1722CliRecIVA[0] ;
         n1722CliRecIVA = T01TW18_n1722CliRecIVA[0] ;
         A1723CliRecNVto = T01TW18_A1723CliRecNVto[0] ;
         n1723CliRecNVto = T01TW18_n1723CliRecNVto[0] ;
         A1724CliRecPrd = T01TW18_A1724CliRecPrd[0] ;
         n1724CliRecPrd = T01TW18_n1724CliRecPrd[0] ;
         A3918FacImpTot1 = T01TW18_A3918FacImpTot1[0] ;
         A7212FacRect = T01TW18_A7212FacRect[0] ;
         A8346FacRecI = T01TW18_A8346FacRecI[0] ;
         n8346FacRecI = T01TW18_n8346FacRecI[0] ;
         A11513FacRecIca = T01TW18_A11513FacRecIca[0] ;
         zm1TW43( -83) ;
      }
      pr_default.close(14);
      onLoadActions1TW43( ) ;
   }

   public void onLoadActions1TW43( )
   {
      if ( isIns( )  && (0==A443FacIVAPor) && ( Gx_BScreen == 0 ) )
      {
         A443FacIVAPor = A588IvaPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A443FacIVAPor) && true /* After */ && ( A858ZonGeoCod != 999 ) )
         {
            A443FacIVAPor = A588IvaPor ;
            httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         }
         else
         {
            if ( isIns( )  && true /* After */ && ( A858ZonGeoCod == 999 ) )
            {
               A443FacIVAPor = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
            }
         }
      }
      A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
      A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
      if ( isIns( )  && (GXutil.strcmp("", A3096FacDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3096FacDivTCod = A3091CliDivTra ;
         n3096FacDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_FacDivCod) )
      {
         A3115FacDivCod = AV13Insert_FacDivCod ;
         n3115FacDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3115FacDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3115FacDivCod = A3140CliDivCod ;
            n3115FacDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
         }
      }
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
      }
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
      }
      A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
      }
      A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      if ( A7209Colombia == 0 )
      {
         A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
      }
      A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
      }
      A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      if ( A7209Colombia == 0 )
      {
         A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
      }
      A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      if ( ! (GXutil.strcmp("", AV33Ser2)==0) && isIns( )  && (0==A430FacCod) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         A2739FacSerNum = AV33Ser2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36Ser20)==0) && isIns( )  && (0==A430FacCod) && ( GXutil.strcmp(A450FacPri, "0") == 0 ) )
         {
            A2739FacSerNum = AV36Ser20 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
         }
         else
         {
            if ( (GXutil.strcmp("", AV33Ser2)==0) && (GXutil.strcmp("", AV36Ser20)==0) && isIns( )  )
            {
               A2739FacSerNum = AV32Ser1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
            }
         }
      }
   }

   public void checkExtendedTable1TW43( )
   {
      nIsDirty_43 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( A433FacDtoGen.doubleValue() < 0 ) && ( AV17FirmaD == 1 ) && ( A1153FacTipFac == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "FACDTOGEN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacDtoGen_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A434FacDtoPP.doubleValue() < 0 ) && ( AV17FirmaD == 1 ) && ( A1153FacTipFac == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A453FacRECPor.doubleValue() < 0 ) && ( AV17FirmaD == 1 ) && ( A1153FacTipFac == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( AV17FirmaD == 1 ) && ( A435FacEst > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Factura Impresa.NO se permite MODIFICACION.Activado FIRMA DIGITAL", ""), 1, "FACEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFacEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV17FirmaD == 1 ) && true /* After */ && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int2[0] = (byte)(0) ;
         GXv_int10[0] = AV27FacCodX ;
         GXv_date19[0] = AV28Facfch ;
         GXv_char17[0] = A450FacPri ;
         new app.pfacrecl(remoteHandle, context).execute( GXv_char18, GXv_int2, GXv_int10, GXv_date19, GXv_char17) ;
         abonoscargos_impl.this.A396EmprCod = GXv_char18[0] ;
         abonoscargos_impl.this.AV27FacCodX = GXv_int10[0] ;
         abonoscargos_impl.this.AV28Facfch = GXv_date19[0] ;
         abonoscargos_impl.this.A450FacPri = GXv_char17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV27FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27FacCodX), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28Facfch", localUtil.format(AV28Facfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      }
      if ( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV28Facfch )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28Facfch)) && ( AV17FirmaD == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fecha Factura inferior a Fecha Ultima", ""), 1, "FACFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A450FacPri, "0") == 0 ) || ( GXutil.strcmp(A450FacPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "FacPri", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FACPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (0==A443FacIVAPor) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_43 = (short)(1) ;
         A443FacIVAPor = A588IvaPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A443FacIVAPor) && true /* After */ && ( A858ZonGeoCod != 999 ) )
         {
            nIsDirty_43 = (short)(1) ;
            A443FacIVAPor = A588IvaPor ;
            httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         }
         else
         {
            if ( isIns( )  && true /* After */ && ( A858ZonGeoCod == 999 ) )
            {
               nIsDirty_43 = (short)(1) ;
               A443FacIVAPor = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
            }
         }
      }
      if ( ( A443FacIVAPor < 0 ) && ( AV17FirmaD == 1 ) && ( A1153FacTipFac == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "FACIVAPOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacIVAPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A965FacCob, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Traspasada a Contabilidad", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A1153FacTipFac == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura de Venta", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A1153FacTipFac > 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo Factura Incorrecto", ""), 1, "");
         AnyError = (short)(1) ;
      }
      nIsDirty_43 = (short)(1) ;
      A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
      /* Using cursor T01TW7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FacRepres", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACREPCOD");
            AnyError = (short)(1) ;
         }
      }
      A3120FacRepNom = T01TW7_A3120FacRepNom[0] ;
      n3120FacRepNom = T01TW7_n3120FacRepNom[0] ;
      pr_default.close(5);
      /* Using cursor T01TW8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TW8_A279CliNom[0] ;
      A3091CliDivTra = T01TW8_A3091CliDivTra[0] ;
      n3091CliDivTra = T01TW8_n3091CliDivTra[0] ;
      A3140CliDivCod = T01TW8_A3140CliDivCod[0] ;
      n3140CliDivCod = T01TW8_n3140CliDivCod[0] ;
      A858ZonGeoCod = T01TW8_A858ZonGeoCod[0] ;
      pr_default.close(6);
      if ( isIns( )  && (GXutil.strcmp("", A3096FacDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_43 = (short)(1) ;
         A3096FacDivTCod = A3091CliDivTra ;
         n3096FacDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_FacDivCod) )
      {
         nIsDirty_43 = (short)(1) ;
         A3115FacDivCod = AV13Insert_FacDivCod ;
         n3115FacDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3115FacDivCod) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_43 = (short)(1) ;
            A3115FacDivCod = A3140CliDivCod ;
            n3115FacDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
         }
      }
      /* Using cursor T01TW11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (0==A3115FacDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivFac", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACDIVCOD");
            AnyError = (short)(1) ;
         }
      }
      A3116FacDivAbr = T01TW11_A3116FacDivAbr[0] ;
      n3116FacDivAbr = T01TW11_n3116FacDivAbr[0] ;
      pr_default.close(9);
      /* Using cursor T01TW9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMREP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(7);
      /* Using cursor T01TW10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11629MeivaId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOTIVOS EXENCION IVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MEIVAID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMeivaId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11630MeivaDsc = T01TW10_A11630MeivaDsc[0] ;
      n11630MeivaDsc = T01TW10_n11630MeivaDsc[0] ;
      pr_default.close(8);
      /* Using cursor T01TW13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
      }
      A1360ZonGeoNom = T01TW13_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01TW13_n1360ZonGeoNom[0] ;
      pr_default.close(11);
      /* Using cursor T01TW14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A450FacPri});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A1718CliRecDGrl = T01TW14_A1718CliRecDGrl[0] ;
         n1718CliRecDGrl = T01TW14_n1718CliRecDGrl[0] ;
         A1719CliRecDPag = T01TW14_A1719CliRecDPag[0] ;
         n1719CliRecDPag = T01TW14_n1719CliRecDPag[0] ;
         A1720CliRecDPpg = T01TW14_A1720CliRecDPpg[0] ;
         n1720CliRecDPpg = T01TW14_n1720CliRecDPpg[0] ;
         A1721CliRecFpg = T01TW14_A1721CliRecFpg[0] ;
         n1721CliRecFpg = T01TW14_n1721CliRecFpg[0] ;
         A1722CliRecIVA = T01TW14_A1722CliRecIVA[0] ;
         n1722CliRecIVA = T01TW14_n1722CliRecIVA[0] ;
         A1723CliRecNVto = T01TW14_A1723CliRecNVto[0] ;
         n1723CliRecNVto = T01TW14_n1723CliRecNVto[0] ;
         A1724CliRecPrd = T01TW14_A1724CliRecPrd[0] ;
         n1724CliRecPrd = T01TW14_n1724CliRecPrd[0] ;
      }
      else
      {
         nIsDirty_43 = (short)(1) ;
         A1724CliRecPrd = "" ;
         n1724CliRecPrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1724CliRecPrd", A1724CliRecPrd);
         nIsDirty_43 = (short)(1) ;
         A1723CliRecNVto = (byte)(0) ;
         n1723CliRecNVto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1723CliRecNVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1723CliRecNVto), 2, 0));
         nIsDirty_43 = (short)(1) ;
         A1722CliRecIVA = "" ;
         n1722CliRecIVA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1722CliRecIVA", A1722CliRecIVA);
         nIsDirty_43 = (short)(1) ;
         A1721CliRecFpg = "" ;
         n1721CliRecFpg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1721CliRecFpg", A1721CliRecFpg);
         nIsDirty_43 = (short)(1) ;
         A1720CliRecDPpg = DecimalUtil.doubleToDec(0) ;
         n1720CliRecDPpg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1720CliRecDPpg", GXutil.ltrimstr( A1720CliRecDPpg, 6, 2));
         nIsDirty_43 = (short)(1) ;
         A1719CliRecDPag = "" ;
         n1719CliRecDPag = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1719CliRecDPag", A1719CliRecDPag);
         nIsDirty_43 = (short)(1) ;
         A1718CliRecDGrl = DecimalUtil.doubleToDec(0) ;
         n1718CliRecDGrl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1718CliRecDGrl", GXutil.ltrimstr( A1718CliRecDGrl, 6, 2));
      }
      pr_default.close(12);
      /* Using cursor T01TW16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A3918FacImpTot1 = T01TW16_A3918FacImpTot1[0] ;
      }
      else
      {
         nIsDirty_43 = (short)(1) ;
         A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      }
      pr_default.close(13);
      nIsDirty_43 = (short)(1) ;
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      nIsDirty_43 = (short)(1) ;
      A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      nIsDirty_43 = (short)(1) ;
      A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
      }
      A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
      }
      A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
      }
      A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      nIsDirty_43 = (short)(1) ;
      A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      if ( ! (GXutil.strcmp("", AV33Ser2)==0) && isIns( )  && (0==A430FacCod) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         nIsDirty_43 = (short)(1) ;
         A2739FacSerNum = AV33Ser2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36Ser20)==0) && isIns( )  && (0==A430FacCod) && ( GXutil.strcmp(A450FacPri, "0") == 0 ) )
         {
            nIsDirty_43 = (short)(1) ;
            A2739FacSerNum = AV36Ser20 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
         }
         else
         {
            if ( (GXutil.strcmp("", AV33Ser2)==0) && (GXutil.strcmp("", AV36Ser20)==0) && isIns( )  )
            {
               nIsDirty_43 = (short)(1) ;
               A2739FacSerNum = AV32Ser1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
            }
         }
      }
   }

   public void closeExtendedTableCursors1TW43( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(9);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(11);
      pr_default.close(12);
      pr_default.close(13);
   }

   public void enableDisable( )
   {
   }

   public void gxload_85( String A396EmprCod ,
                          String A3119FacRepCod )
   {
      /* Using cursor T01TW19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FacRepres", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACREPCOD");
            AnyError = (short)(1) ;
         }
      }
      A3120FacRepNom = T01TW19_A3120FacRepNom[0] ;
      n3120FacRepNom = T01TW19_n3120FacRepNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3120FacRepNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_86( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01TW20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TW20_A279CliNom[0] ;
      A3091CliDivTra = T01TW20_A3091CliDivTra[0] ;
      n3091CliDivTra = T01TW20_n3091CliDivTra[0] ;
      A3140CliDivCod = T01TW20_A3140CliDivCod[0] ;
      n3140CliDivCod = T01TW20_n3140CliDivCod[0] ;
      A858ZonGeoCod = T01TW20_A858ZonGeoCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3091CliDivTra))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_89( byte A3115FacDivCod )
   {
      /* Using cursor T01TW21 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (0==A3115FacDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivFac", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACDIVCOD");
            AnyError = (short)(1) ;
         }
      }
      A3116FacDivAbr = T01TW21_A3116FacDivAbr[0] ;
      n3116FacDivAbr = T01TW21_n3116FacDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3116FacDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_87( String A396EmprCod ,
                          String A3119FacRepCod ,
                          int A252CliCod )
   {
      /* Using cursor T01TW22 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMREP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_88( String A396EmprCod ,
                          String A11629MeivaId )
   {
      /* Using cursor T01TW23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11629MeivaId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOTIVOS EXENCION IVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MEIVAID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMeivaId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11630MeivaDsc = T01TW23_A11630MeivaDsc[0] ;
      n11630MeivaDsc = T01TW23_n11630MeivaDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A11630MeivaDsc)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_91( String A396EmprCod ,
                          short A858ZonGeoCod )
   {
      /* Using cursor T01TW24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
      }
      A1360ZonGeoNom = T01TW24_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01TW24_n1360ZonGeoNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1360ZonGeoNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_92( String A396EmprCod ,
                          int A252CliCod ,
                          String A450FacPri )
   {
      /* Using cursor T01TW25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A450FacPri});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A1718CliRecDGrl = T01TW25_A1718CliRecDGrl[0] ;
         n1718CliRecDGrl = T01TW25_n1718CliRecDGrl[0] ;
         A1719CliRecDPag = T01TW25_A1719CliRecDPag[0] ;
         n1719CliRecDPag = T01TW25_n1719CliRecDPag[0] ;
         A1720CliRecDPpg = T01TW25_A1720CliRecDPpg[0] ;
         n1720CliRecDPpg = T01TW25_n1720CliRecDPpg[0] ;
         A1721CliRecFpg = T01TW25_A1721CliRecFpg[0] ;
         n1721CliRecFpg = T01TW25_n1721CliRecFpg[0] ;
         A1722CliRecIVA = T01TW25_A1722CliRecIVA[0] ;
         n1722CliRecIVA = T01TW25_n1722CliRecIVA[0] ;
         A1723CliRecNVto = T01TW25_A1723CliRecNVto[0] ;
         n1723CliRecNVto = T01TW25_n1723CliRecNVto[0] ;
         A1724CliRecPrd = T01TW25_A1724CliRecPrd[0] ;
         n1724CliRecPrd = T01TW25_n1724CliRecPrd[0] ;
      }
      else
      {
         A1724CliRecPrd = "" ;
         n1724CliRecPrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1724CliRecPrd", A1724CliRecPrd);
         A1723CliRecNVto = (byte)(0) ;
         n1723CliRecNVto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1723CliRecNVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1723CliRecNVto), 2, 0));
         A1722CliRecIVA = "" ;
         n1722CliRecIVA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1722CliRecIVA", A1722CliRecIVA);
         A1721CliRecFpg = "" ;
         n1721CliRecFpg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1721CliRecFpg", A1721CliRecFpg);
         A1720CliRecDPpg = DecimalUtil.doubleToDec(0) ;
         n1720CliRecDPpg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1720CliRecDPpg", GXutil.ltrimstr( A1720CliRecDPpg, 6, 2));
         A1719CliRecDPag = "" ;
         n1719CliRecDPag = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1719CliRecDPag", A1719CliRecDPag);
         A1718CliRecDGrl = DecimalUtil.doubleToDec(0) ;
         n1718CliRecDGrl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1718CliRecDGrl", GXutil.ltrimstr( A1718CliRecDGrl, 6, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1718CliRecDGrl, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1719CliRecDPag))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1720CliRecDPpg, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1721CliRecFpg))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1722CliRecIVA))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1723CliRecNVto, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1724CliRecPrd))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_93( String A396EmprCod ,
                          int A430FacCod )
   {
      /* Using cursor T01TW27 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A3918FacImpTot1 = T01TW27_A3918FacImpTot1[0] ;
      }
      else
      {
         A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey1TW43( )
   {
      /* Using cursor T01TW28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound43 = (short)(1) ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1TW43( 83) ;
         RcdFound43 = (short)(1) ;
         A7210FacObs = T01TW5_A7210FacObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
         A430FacCod = T01TW5_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A437FacFpg = T01TW5_A437FacFpg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A443FacIVAPor = T01TW5_A443FacIVAPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A436FacFch = T01TW5_A436FacFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
         A450FacPri = T01TW5_A450FacPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         A433FacDtoGen = T01TW5_A433FacDtoGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A434FacDtoPP = T01TW5_A434FacDtoPP[0] ;
         A1725FacRegIva = T01TW5_A1725FacRegIva[0] ;
         n1725FacRegIva = T01TW5_n1725FacRegIva[0] ;
         A453FacRECPor = T01TW5_A453FacRECPor[0] ;
         A6632FacDto = T01TW5_A6632FacDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
         A435FacEst = T01TW5_A435FacEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
         A445FacLiC = T01TW5_A445FacLiC[0] ;
         A965FacCob = T01TW5_A965FacCob[0] ;
         A1150FacNumVto = T01TW5_A1150FacNumVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = T01TW5_A1151FacPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = T01TW5_A1152FacDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A1153FacTipFac = T01TW5_A1153FacTipFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
         A960FacIVACod = T01TW5_A960FacIVACod[0] ;
         A2739FacSerNum = T01TW5_A2739FacSerNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
         A3096FacDivTCod = T01TW5_A3096FacDivTCod[0] ;
         n3096FacDivTCod = T01TW5_n3096FacDivTCod[0] ;
         A9605FacFirma = T01TW5_A9605FacFirma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
         A9606FacHor = T01TW5_A9606FacHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9643FacLiq1 = T01TW5_A9643FacLiq1[0] ;
         A9644FacLiq2 = T01TW5_A9644FacLiq2[0] ;
         A9645FacIva1 = T01TW5_A9645FacIva1[0] ;
         A9646FacTot1 = T01TW5_A9646FacTot1[0] ;
         A14219FacEnergia = T01TW5_A14219FacEnergia[0] ;
         A14224FacCostFac = T01TW5_A14224FacCostFac[0] ;
         A14222FacCostMts = T01TW5_A14222FacCostMts[0] ;
         A14223FacCostKgs = T01TW5_A14223FacCostKgs[0] ;
         A396EmprCod = T01TW5_A396EmprCod[0] ;
         A3119FacRepCod = T01TW5_A3119FacRepCod[0] ;
         n3119FacRepCod = T01TW5_n3119FacRepCod[0] ;
         A252CliCod = T01TW5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11629MeivaId = T01TW5_A11629MeivaId[0] ;
         n11629MeivaId = T01TW5_n11629MeivaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         A3115FacDivCod = T01TW5_A3115FacDivCod[0] ;
         n3115FacDivCod = T01TW5_n3115FacDivCod[0] ;
         A7212FacRect = T01TW5_A7212FacRect[0] ;
         A8346FacRecI = T01TW5_A8346FacRecI[0] ;
         n8346FacRecI = T01TW5_n8346FacRecI[0] ;
         A11513FacRecIca = T01TW5_A11513FacRecIca[0] ;
         O445FacLiC = A445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         O1150FacNumVto = A1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         O1151FacPer = A1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         O1152FacDiaPag = A1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         O437FacFpg = A437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         O434FacDtoPP = A434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         O433FacDtoGen = A433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         O443FacIVAPor = A443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         O453FacRECPor = A453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         O14224FacCostFac = A14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         Z396EmprCod = A396EmprCod ;
         Z430FacCod = A430FacCod ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TW43( ) ;
         if ( AnyError == 1 )
         {
            RcdFound43 = (short)(0) ;
            initializeNonKey1TW43( ) ;
         }
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound43 = (short)(0) ;
         initializeNonKey1TW43( ) ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1TW43( ) ;
      if ( RcdFound43 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T01TW29 */
      pr_default.execute(24, new Object[] {Integer.valueOf(A430FacCod), Integer.valueOf(A430FacCod), A396EmprCod});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( T01TW29_A430FacCod[0] < A430FacCod ) || ( T01TW29_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T01TW29_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( T01TW29_A430FacCod[0] > A430FacCod ) || ( T01TW29_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T01TW29_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A430FacCod = T01TW29_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            A396EmprCod = T01TW29_A396EmprCod[0] ;
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void move_previous( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T01TW30 */
      pr_default.execute(25, new Object[] {Integer.valueOf(A430FacCod), Integer.valueOf(A430FacCod), A396EmprCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         while ( (pr_default.getStatus(25) != 101) && ( ( T01TW30_A430FacCod[0] > A430FacCod ) || ( T01TW30_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T01TW30_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(25);
         }
         if ( (pr_default.getStatus(25) != 101) && ( ( T01TW30_A430FacCod[0] < A430FacCod ) || ( T01TW30_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T01TW30_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A430FacCod = T01TW30_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            A396EmprCod = T01TW30_A396EmprCod[0] ;
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(25);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TW43( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A445FacLiC = O445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TW43( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound43 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A430FacCod = Z430FacCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FACCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A445FacLiC = O445FacLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A445FacLiC = O445FacLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
               update1TW43( ) ;
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               /* Insert record */
               A445FacLiC = O445FacLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TW43( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FACCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFacCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A445FacLiC = O445FacLiC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
                  GX_FocusControl = edtFacFch_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TW43( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = Z430FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A445FacLiC = O445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TW43( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TW4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFAVEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z437FacFpg, T01TW4_A437FacFpg[0]) != 0 ) || ( Z443FacIVAPor != T01TW4_A443FacIVAPor[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z436FacFch), GXutil.resetTime(T01TW4_A436FacFch[0])) ) || ( GXutil.strcmp(Z450FacPri, T01TW4_A450FacPri[0]) != 0 ) || ( DecimalUtil.compareTo(Z433FacDtoGen, T01TW4_A433FacDtoGen[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z434FacDtoPP, T01TW4_A434FacDtoPP[0]) != 0 ) || ( GXutil.strcmp(Z1725FacRegIva, T01TW4_A1725FacRegIva[0]) != 0 ) || ( DecimalUtil.compareTo(Z453FacRECPor, T01TW4_A453FacRECPor[0]) != 0 ) || ( DecimalUtil.compareTo(Z6632FacDto, T01TW4_A6632FacDto[0]) != 0 ) || ( Z435FacEst != T01TW4_A435FacEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z445FacLiC != T01TW4_A445FacLiC[0] ) || ( GXutil.strcmp(Z965FacCob, T01TW4_A965FacCob[0]) != 0 ) || ( Z1150FacNumVto != T01TW4_A1150FacNumVto[0] ) || ( GXutil.strcmp(Z1151FacPer, T01TW4_A1151FacPer[0]) != 0 ) || ( GXutil.strcmp(Z1152FacDiaPag, T01TW4_A1152FacDiaPag[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1153FacTipFac != T01TW4_A1153FacTipFac[0] ) || ( GXutil.strcmp(Z960FacIVACod, T01TW4_A960FacIVACod[0]) != 0 ) || ( GXutil.strcmp(Z2739FacSerNum, T01TW4_A2739FacSerNum[0]) != 0 ) || ( GXutil.strcmp(Z3096FacDivTCod, T01TW4_A3096FacDivTCod[0]) != 0 ) || ( GXutil.strcmp(Z9605FacFirma, T01TW4_A9605FacFirma[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z9606FacHor, T01TW4_A9606FacHor[0]) ) || ( DecimalUtil.compareTo(Z9643FacLiq1, T01TW4_A9643FacLiq1[0]) != 0 ) || ( DecimalUtil.compareTo(Z9644FacLiq2, T01TW4_A9644FacLiq2[0]) != 0 ) || ( DecimalUtil.compareTo(Z9645FacIva1, T01TW4_A9645FacIva1[0]) != 0 ) || ( DecimalUtil.compareTo(Z9646FacTot1, T01TW4_A9646FacTot1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14219FacEnergia, T01TW4_A14219FacEnergia[0]) != 0 ) || ( DecimalUtil.compareTo(Z14224FacCostFac, T01TW4_A14224FacCostFac[0]) != 0 ) || ( DecimalUtil.compareTo(Z14222FacCostMts, T01TW4_A14222FacCostMts[0]) != 0 ) || ( DecimalUtil.compareTo(Z14223FacCostKgs, T01TW4_A14223FacCostKgs[0]) != 0 ) || ( GXutil.strcmp(Z3119FacRepCod, T01TW4_A3119FacRepCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z252CliCod != T01TW4_A252CliCod[0] ) || ( GXutil.strcmp(Z11629MeivaId, T01TW4_A11629MeivaId[0]) != 0 ) || ( Z3115FacDivCod != T01TW4_A3115FacDivCod[0] ) || ( DecimalUtil.compareTo(Z14222FacCostMts, T01TW4_A14222FacCostMts[0]) != 0 ) || ( DecimalUtil.compareTo(Z14223FacCostKgs, T01TW4_A14223FacCostKgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7212FacRect, T01TW4_A7212FacRect[0]) != 0 ) || ( DecimalUtil.compareTo(Z8346FacRecI, T01TW4_A8346FacRecI[0]) != 0 ) || ( DecimalUtil.compareTo(Z11513FacRecIca, T01TW4_A11513FacRecIca[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z437FacFpg, T01TW4_A437FacFpg[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacFpg");
               GXutil.writeLogRaw("Old: ",Z437FacFpg);
               GXutil.writeLogRaw("Current: ",T01TW4_A437FacFpg[0]);
            }
            if ( Z443FacIVAPor != T01TW4_A443FacIVAPor[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacIVAPor");
               GXutil.writeLogRaw("Old: ",Z443FacIVAPor);
               GXutil.writeLogRaw("Current: ",T01TW4_A443FacIVAPor[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z436FacFch), GXutil.resetTime(T01TW4_A436FacFch[0])) ) )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacFch");
               GXutil.writeLogRaw("Old: ",Z436FacFch);
               GXutil.writeLogRaw("Current: ",T01TW4_A436FacFch[0]);
            }
            if ( GXutil.strcmp(Z450FacPri, T01TW4_A450FacPri[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacPri");
               GXutil.writeLogRaw("Old: ",Z450FacPri);
               GXutil.writeLogRaw("Current: ",T01TW4_A450FacPri[0]);
            }
            if ( DecimalUtil.compareTo(Z433FacDtoGen, T01TW4_A433FacDtoGen[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacDtoGen");
               GXutil.writeLogRaw("Old: ",Z433FacDtoGen);
               GXutil.writeLogRaw("Current: ",T01TW4_A433FacDtoGen[0]);
            }
            if ( DecimalUtil.compareTo(Z434FacDtoPP, T01TW4_A434FacDtoPP[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacDtoPP");
               GXutil.writeLogRaw("Old: ",Z434FacDtoPP);
               GXutil.writeLogRaw("Current: ",T01TW4_A434FacDtoPP[0]);
            }
            if ( GXutil.strcmp(Z1725FacRegIva, T01TW4_A1725FacRegIva[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacRegIva");
               GXutil.writeLogRaw("Old: ",Z1725FacRegIva);
               GXutil.writeLogRaw("Current: ",T01TW4_A1725FacRegIva[0]);
            }
            if ( DecimalUtil.compareTo(Z453FacRECPor, T01TW4_A453FacRECPor[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacRECPor");
               GXutil.writeLogRaw("Old: ",Z453FacRECPor);
               GXutil.writeLogRaw("Current: ",T01TW4_A453FacRECPor[0]);
            }
            if ( DecimalUtil.compareTo(Z6632FacDto, T01TW4_A6632FacDto[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacDto");
               GXutil.writeLogRaw("Old: ",Z6632FacDto);
               GXutil.writeLogRaw("Current: ",T01TW4_A6632FacDto[0]);
            }
            if ( Z435FacEst != T01TW4_A435FacEst[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacEst");
               GXutil.writeLogRaw("Old: ",Z435FacEst);
               GXutil.writeLogRaw("Current: ",T01TW4_A435FacEst[0]);
            }
            if ( Z445FacLiC != T01TW4_A445FacLiC[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacLiC");
               GXutil.writeLogRaw("Old: ",Z445FacLiC);
               GXutil.writeLogRaw("Current: ",T01TW4_A445FacLiC[0]);
            }
            if ( GXutil.strcmp(Z965FacCob, T01TW4_A965FacCob[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacCob");
               GXutil.writeLogRaw("Old: ",Z965FacCob);
               GXutil.writeLogRaw("Current: ",T01TW4_A965FacCob[0]);
            }
            if ( Z1150FacNumVto != T01TW4_A1150FacNumVto[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacNumVto");
               GXutil.writeLogRaw("Old: ",Z1150FacNumVto);
               GXutil.writeLogRaw("Current: ",T01TW4_A1150FacNumVto[0]);
            }
            if ( GXutil.strcmp(Z1151FacPer, T01TW4_A1151FacPer[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacPer");
               GXutil.writeLogRaw("Old: ",Z1151FacPer);
               GXutil.writeLogRaw("Current: ",T01TW4_A1151FacPer[0]);
            }
            if ( GXutil.strcmp(Z1152FacDiaPag, T01TW4_A1152FacDiaPag[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacDiaPag");
               GXutil.writeLogRaw("Old: ",Z1152FacDiaPag);
               GXutil.writeLogRaw("Current: ",T01TW4_A1152FacDiaPag[0]);
            }
            if ( Z1153FacTipFac != T01TW4_A1153FacTipFac[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacTipFac");
               GXutil.writeLogRaw("Old: ",Z1153FacTipFac);
               GXutil.writeLogRaw("Current: ",T01TW4_A1153FacTipFac[0]);
            }
            if ( GXutil.strcmp(Z960FacIVACod, T01TW4_A960FacIVACod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacIVACod");
               GXutil.writeLogRaw("Old: ",Z960FacIVACod);
               GXutil.writeLogRaw("Current: ",T01TW4_A960FacIVACod[0]);
            }
            if ( GXutil.strcmp(Z2739FacSerNum, T01TW4_A2739FacSerNum[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacSerNum");
               GXutil.writeLogRaw("Old: ",Z2739FacSerNum);
               GXutil.writeLogRaw("Current: ",T01TW4_A2739FacSerNum[0]);
            }
            if ( GXutil.strcmp(Z3096FacDivTCod, T01TW4_A3096FacDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacDivTCod");
               GXutil.writeLogRaw("Old: ",Z3096FacDivTCod);
               GXutil.writeLogRaw("Current: ",T01TW4_A3096FacDivTCod[0]);
            }
            if ( GXutil.strcmp(Z9605FacFirma, T01TW4_A9605FacFirma[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacFirma");
               GXutil.writeLogRaw("Old: ",Z9605FacFirma);
               GXutil.writeLogRaw("Current: ",T01TW4_A9605FacFirma[0]);
            }
            if ( !( GXutil.dateCompare(Z9606FacHor, T01TW4_A9606FacHor[0]) ) )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacHor");
               GXutil.writeLogRaw("Old: ",Z9606FacHor);
               GXutil.writeLogRaw("Current: ",T01TW4_A9606FacHor[0]);
            }
            if ( DecimalUtil.compareTo(Z9643FacLiq1, T01TW4_A9643FacLiq1[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacLiq1");
               GXutil.writeLogRaw("Old: ",Z9643FacLiq1);
               GXutil.writeLogRaw("Current: ",T01TW4_A9643FacLiq1[0]);
            }
            if ( DecimalUtil.compareTo(Z9644FacLiq2, T01TW4_A9644FacLiq2[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacLiq2");
               GXutil.writeLogRaw("Old: ",Z9644FacLiq2);
               GXutil.writeLogRaw("Current: ",T01TW4_A9644FacLiq2[0]);
            }
            if ( DecimalUtil.compareTo(Z9645FacIva1, T01TW4_A9645FacIva1[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacIva1");
               GXutil.writeLogRaw("Old: ",Z9645FacIva1);
               GXutil.writeLogRaw("Current: ",T01TW4_A9645FacIva1[0]);
            }
            if ( DecimalUtil.compareTo(Z9646FacTot1, T01TW4_A9646FacTot1[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacTot1");
               GXutil.writeLogRaw("Old: ",Z9646FacTot1);
               GXutil.writeLogRaw("Current: ",T01TW4_A9646FacTot1[0]);
            }
            if ( DecimalUtil.compareTo(Z14219FacEnergia, T01TW4_A14219FacEnergia[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacEnergia");
               GXutil.writeLogRaw("Old: ",Z14219FacEnergia);
               GXutil.writeLogRaw("Current: ",T01TW4_A14219FacEnergia[0]);
            }
            if ( DecimalUtil.compareTo(Z14224FacCostFac, T01TW4_A14224FacCostFac[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacCostFac");
               GXutil.writeLogRaw("Old: ",Z14224FacCostFac);
               GXutil.writeLogRaw("Current: ",T01TW4_A14224FacCostFac[0]);
            }
            if ( DecimalUtil.compareTo(Z14222FacCostMts, T01TW4_A14222FacCostMts[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacCostMts");
               GXutil.writeLogRaw("Old: ",Z14222FacCostMts);
               GXutil.writeLogRaw("Current: ",T01TW4_A14222FacCostMts[0]);
            }
            if ( DecimalUtil.compareTo(Z14223FacCostKgs, T01TW4_A14223FacCostKgs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacCostKgs");
               GXutil.writeLogRaw("Old: ",Z14223FacCostKgs);
               GXutil.writeLogRaw("Current: ",T01TW4_A14223FacCostKgs[0]);
            }
            if ( GXutil.strcmp(Z3119FacRepCod, T01TW4_A3119FacRepCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacRepCod");
               GXutil.writeLogRaw("Old: ",Z3119FacRepCod);
               GXutil.writeLogRaw("Current: ",T01TW4_A3119FacRepCod[0]);
            }
            if ( Z252CliCod != T01TW4_A252CliCod[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01TW4_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z11629MeivaId, T01TW4_A11629MeivaId[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"MeivaId");
               GXutil.writeLogRaw("Old: ",Z11629MeivaId);
               GXutil.writeLogRaw("Current: ",T01TW4_A11629MeivaId[0]);
            }
            if ( Z3115FacDivCod != T01TW4_A3115FacDivCod[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacDivCod");
               GXutil.writeLogRaw("Old: ",Z3115FacDivCod);
               GXutil.writeLogRaw("Current: ",T01TW4_A3115FacDivCod[0]);
            }
            if ( DecimalUtil.compareTo(Z14222FacCostMts, T01TW4_A14222FacCostMts[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacCostMts");
               GXutil.writeLogRaw("Old: ",Z14222FacCostMts);
               GXutil.writeLogRaw("Current: ",T01TW4_A14222FacCostMts[0]);
            }
            if ( DecimalUtil.compareTo(Z14223FacCostKgs, T01TW4_A14223FacCostKgs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacCostKgs");
               GXutil.writeLogRaw("Old: ",Z14223FacCostKgs);
               GXutil.writeLogRaw("Current: ",T01TW4_A14223FacCostKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z7212FacRect, T01TW4_A7212FacRect[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacRect");
               GXutil.writeLogRaw("Old: ",Z7212FacRect);
               GXutil.writeLogRaw("Current: ",T01TW4_A7212FacRect[0]);
            }
            if ( DecimalUtil.compareTo(Z8346FacRecI, T01TW4_A8346FacRecI[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacRecI");
               GXutil.writeLogRaw("Old: ",Z8346FacRecI);
               GXutil.writeLogRaw("Current: ",T01TW4_A8346FacRecI[0]);
            }
            if ( DecimalUtil.compareTo(Z11513FacRecIca, T01TW4_A11513FacRecIca[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacRecIca");
               GXutil.writeLogRaw("Old: ",Z11513FacRecIca);
               GXutil.writeLogRaw("Current: ",T01TW4_A11513FacRecIca[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFAVEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TW43( )
   {
      beforeValidate1TW43( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TW43( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TW43( 0) ;
         checkOptimisticConcurrency1TW43( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TW43( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TW43( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TW31 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A430FacCod), A437FacFpg, Byte.valueOf(A443FacIVAPor), A436FacFch, A450FacPri, A433FacDtoGen, A434FacDtoPP, Boolean.valueOf(n1725FacRegIva), A1725FacRegIva, A453FacRECPor, A6632FacDto, A7210FacObs, Byte.valueOf(A435FacEst), Integer.valueOf(A445FacLiC), A965FacCob, Byte.valueOf(A1150FacNumVto), A1151FacPer, A1152FacDiaPag, Byte.valueOf(A1153FacTipFac), A960FacIVACod, A2739FacSerNum, Boolean.valueOf(n3096FacDivTCod), A3096FacDivTCod, A9605FacFirma, A9606FacHor, A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A14219FacEnergia, A14224FacCostFac, A14222FacCostMts, A14223FacCostKgs, A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n11629MeivaId), A11629MeivaId, Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod), A7212FacRect, Boolean.valueOf(n8346FacRecI), A8346FacRecI, A11513FacRecIca});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
                  if ( (pr_default.getStatus(26) == 1) )
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
                        processLevel1TW43( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TW0( ) ;
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
            load1TW43( ) ;
         }
         endLevel1TW43( ) ;
      }
      closeExtendedTableCursors1TW43( ) ;
   }

   public void update1TW43( )
   {
      beforeValidate1TW43( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TW43( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TW43( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TW43( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TW43( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TW32 */
                  pr_default.execute(27, new Object[] {A437FacFpg, Byte.valueOf(A443FacIVAPor), A436FacFch, A450FacPri, A433FacDtoGen, A434FacDtoPP, Boolean.valueOf(n1725FacRegIva), A1725FacRegIva, A453FacRECPor, A6632FacDto, A7210FacObs, Byte.valueOf(A435FacEst), Integer.valueOf(A445FacLiC), A965FacCob, Byte.valueOf(A1150FacNumVto), A1151FacPer, A1152FacDiaPag, Byte.valueOf(A1153FacTipFac), A960FacIVACod, A2739FacSerNum, Boolean.valueOf(n3096FacDivTCod), A3096FacDivTCod, A9605FacFirma, A9606FacHor, A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A14219FacEnergia, A14224FacCostFac, A14222FacCostMts, A14223FacCostKgs, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n11629MeivaId), A11629MeivaId, Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod), A7212FacRect, Boolean.valueOf(n8346FacRecI), A8346FacRecI, A11513FacRecIca, A396EmprCod, Integer.valueOf(A430FacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
                  if ( (pr_default.getStatus(27) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFAVEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TW43( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ && true /* Level */ && ( ( A1150FacNumVto != O1150FacNumVto ) || ( GXutil.strcmp(A1151FacPer, O1151FacPer) != 0 ) || ( GXutil.strcmp(A1152FacDiaPag, O1152FacDiaPag) != 0 ) || ( GXutil.strcmp(A437FacFpg, O437FacFpg) != 0 ) || ( DecimalUtil.compareTo(A434FacDtoPP, O434FacDtoPP) != 0 ) || ( DecimalUtil.compareTo(A433FacDtoGen, O433FacDtoGen) != 0 ) || ( A443FacIVAPor != O443FacIVAPor ) || ( DecimalUtil.compareTo(A453FacRECPor, O453FacRECPor) != 0 ) ) || ( DecimalUtil.compareTo(A14224FacCostFac, O14224FacCostFac) != 0 ) )
                     {
                        new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TW43( ) ;
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
         endLevel1TW43( ) ;
      }
      closeExtendedTableCursors1TW43( ) ;
   }

   public void deferredUpdate1TW43( )
   {
   }

   public void delete( )
   {
      beforeValidate1TW43( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TW43( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TW43( ) ;
         afterConfirm1TW43( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TW43( ) ;
            if ( AnyError == 0 )
            {
               A445FacLiC = O445FacLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
               scanStart1TW44( ) ;
               while ( RcdFound44 != 0 )
               {
                  getByPrimaryKey1TW44( ) ;
                  delete1TW44( ) ;
                  scanNext1TW44( ) ;
                  O445FacLiC = A445FacLiC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
               }
               scanEnd1TW44( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TW33 */
                  pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
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
      sMode43 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TW43( ) ;
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TW43( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( A435FacEst > 1 ) && ( AV17FirmaD == 1 ) && true /* Level */ && isDlt( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion delete NO permitida", ""), 1, "FACEST");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbFacEst.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
         /* Using cursor T01TW34 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
         A3116FacDivAbr = T01TW34_A3116FacDivAbr[0] ;
         n3116FacDivAbr = T01TW34_n3116FacDivAbr[0] ;
         pr_default.close(29);
         /* Using cursor T01TW35 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
         A3120FacRepNom = T01TW35_A3120FacRepNom[0] ;
         n3120FacRepNom = T01TW35_n3120FacRepNom[0] ;
         pr_default.close(30);
         /* Using cursor T01TW36 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TW36_A279CliNom[0] ;
         A3091CliDivTra = T01TW36_A3091CliDivTra[0] ;
         n3091CliDivTra = T01TW36_n3091CliDivTra[0] ;
         A3140CliDivCod = T01TW36_A3140CliDivCod[0] ;
         n3140CliDivCod = T01TW36_n3140CliDivCod[0] ;
         A858ZonGeoCod = T01TW36_A858ZonGeoCod[0] ;
         pr_default.close(31);
         /* Using cursor T01TW37 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
         A11630MeivaDsc = T01TW37_A11630MeivaDsc[0] ;
         n11630MeivaDsc = T01TW37_n11630MeivaDsc[0] ;
         pr_default.close(32);
         /* Using cursor T01TW38 */
         pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
         A1360ZonGeoNom = T01TW38_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01TW38_n1360ZonGeoNom[0] ;
         pr_default.close(33);
         /* Using cursor T01TW39 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A450FacPri});
         if ( (pr_default.getStatus(34) != 101) )
         {
            A1718CliRecDGrl = T01TW39_A1718CliRecDGrl[0] ;
            n1718CliRecDGrl = T01TW39_n1718CliRecDGrl[0] ;
            A1719CliRecDPag = T01TW39_A1719CliRecDPag[0] ;
            n1719CliRecDPag = T01TW39_n1719CliRecDPag[0] ;
            A1720CliRecDPpg = T01TW39_A1720CliRecDPpg[0] ;
            n1720CliRecDPpg = T01TW39_n1720CliRecDPpg[0] ;
            A1721CliRecFpg = T01TW39_A1721CliRecFpg[0] ;
            n1721CliRecFpg = T01TW39_n1721CliRecFpg[0] ;
            A1722CliRecIVA = T01TW39_A1722CliRecIVA[0] ;
            n1722CliRecIVA = T01TW39_n1722CliRecIVA[0] ;
            A1723CliRecNVto = T01TW39_A1723CliRecNVto[0] ;
            n1723CliRecNVto = T01TW39_n1723CliRecNVto[0] ;
            A1724CliRecPrd = T01TW39_A1724CliRecPrd[0] ;
            n1724CliRecPrd = T01TW39_n1724CliRecPrd[0] ;
         }
         else
         {
            A1724CliRecPrd = "" ;
            n1724CliRecPrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1724CliRecPrd", A1724CliRecPrd);
            A1723CliRecNVto = (byte)(0) ;
            n1723CliRecNVto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1723CliRecNVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1723CliRecNVto), 2, 0));
            A1722CliRecIVA = "" ;
            n1722CliRecIVA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1722CliRecIVA", A1722CliRecIVA);
            A1721CliRecFpg = "" ;
            n1721CliRecFpg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1721CliRecFpg", A1721CliRecFpg);
            A1720CliRecDPpg = DecimalUtil.doubleToDec(0) ;
            n1720CliRecDPpg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1720CliRecDPpg", GXutil.ltrimstr( A1720CliRecDPpg, 6, 2));
            A1719CliRecDPag = "" ;
            n1719CliRecDPag = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1719CliRecDPag", A1719CliRecDPag);
            A1718CliRecDGrl = DecimalUtil.doubleToDec(0) ;
            n1718CliRecDGrl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1718CliRecDGrl", GXutil.ltrimstr( A1718CliRecDGrl, 6, 2));
         }
         pr_default.close(34);
         /* Using cursor T01TW41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            A3918FacImpTot1 = T01TW41_A3918FacImpTot1[0] ;
         }
         else
         {
            A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         }
         pr_default.close(35);
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
         }
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
         }
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
         }
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TW42 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACVTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
      }
   }

   public void processNestedLevel1TW44( )
   {
      s445FacLiC = O445FacLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      nGXsfl_169_idx = 0 ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         readRow1TW44( ) ;
         if ( ( nRcdExists_44 != 0 ) || ( nIsMod_44 != 0 ) )
         {
            standaloneNotModal1TW44( ) ;
            getKey1TW44( ) ;
            if ( ( nRcdExists_44 == 0 ) && ( nRcdDeleted_44 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TW44( ) ;
            }
            else
            {
               if ( RcdFound44 != 0 )
               {
                  if ( ( nRcdDeleted_44 != 0 ) && ( nRcdExists_44 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TW44( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_44 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TW44( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_44 == 0 )
                  {
                     GXCCtl = "FACLIN_" + sGXsfl_169_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O445FacLiC = A445FacLiC ;
            httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
         }
         httpContext.changePostValue( edtFacLin_Internalname, GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacDsc_Internalname, GXutil.rtrim( A432FacDsc)) ;
         httpContext.changePostValue( edtFacMts_Internalname, GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreMts_Internalname, GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacUnds_Internalname, GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacImpMan_Internalname, GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacImp_Internalname, GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z446FacLin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z454FacSer_"+sGXsfl_169_idx, GXutil.rtrim( Z454FacSer)) ;
         httpContext.changePostValue( "ZT_"+"Z428FacAlbTip_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z432FacDsc_"+sGXsfl_169_idx, GXutil.rtrim( Z432FacDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z447FacMts_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z449FacPreMts_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z444FacKgs_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z448FacPreKgs_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3097FacTipPro_"+sGXsfl_169_idx, GXutil.rtrim( Z3097FacTipPro)) ;
         httpContext.changePostValue( "ZT_"+"Z5353FacImpMan_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12197FacUnds_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5355FacImpMin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3897FacKgsA_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_44_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_44_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_44_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_44 != 0 )
         {
            httpContext.changePostValue( "FACLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACDSC_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACMTS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREMTS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACKGS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREKGS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACUNDS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREUND_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMPMAN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMPMAN_"+sGXsfl_169_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMP_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TW44( ) ;
      if ( AnyError != 0 )
      {
         O445FacLiC = s445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      }
      nRcdExists_44 = (short)(0) ;
      nIsMod_44 = (short)(0) ;
      nRcdDeleted_44 = (short)(0) ;
   }

   public void processLevel1TW43( )
   {
      /* Save parent mode. */
      sMode43 = Gx_mode ;
      processNestedLevel1TW44( ) ;
      if ( AnyError != 0 )
      {
         O445FacLiC = s445FacLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01TW43 */
      pr_default.execute(37, new Object[] {Integer.valueOf(A445FacLiC), A396EmprCod, Integer.valueOf(A430FacCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
   }

   public void endLevel1TW43( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1TW43( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.abonoscargos");
         if ( AnyError == 0 )
         {
            confirmValues1TW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.abonoscargos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TW43( )
   {
      /* Scan By routine */
      /* Using cursor T01TW44 */
      pr_default.execute(38);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T01TW44_A396EmprCod[0] ;
         A430FacCod = T01TW44_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TW43( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T01TW44_A396EmprCod[0] ;
         A430FacCod = T01TW44_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
   }

   public void scanEnd1TW43( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1TW43( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TW43( )
   {
      /* Before Insert Rules */
      if ( (0==A430FacCod) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char17[0] = AV29ContCod ;
         GXv_int10[0] = A430FacCod ;
         new app.pnumfac(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_int10) ;
         abonoscargos_impl.this.A396EmprCod = GXv_char18[0] ;
         abonoscargos_impl.this.AV29ContCod = GXv_char17[0] ;
         abonoscargos_impl.this.A430FacCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV29ContCod", AV29ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      if ( (GXutil.strcmp("", A11629MeivaId)==0) )
      {
         A11629MeivaId = "" ;
         n11629MeivaId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         n11629MeivaId = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
      }
      if ( (GXutil.strcmp("", A3119FacRepCod)==0) )
      {
         A3119FacRepCod = "" ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         n3119FacRepCod = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
      }
   }

   public void beforeUpdate1TW43( )
   {
      /* Before Update Rules */
      if ( (GXutil.strcmp("", A11629MeivaId)==0) )
      {
         A11629MeivaId = "" ;
         n11629MeivaId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         n11629MeivaId = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
      }
      if ( (GXutil.strcmp("", A3119FacRepCod)==0) )
      {
         A3119FacRepCod = "" ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         n3119FacRepCod = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
      }
   }

   public void beforeDelete1TW43( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TW43( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TW43( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TW43( )
   {
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      edtFacFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
      edtFacHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacHor_Enabled), 5, 0), true);
      cmbFacEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacEst.getEnabled(), 5, 0), true);
      edtFacSerNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      cmbFacTipFac.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacTipFac.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacTipFac.getEnabled(), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtMeivaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Enabled), 5, 0), true);
      edtFacNumVto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
      edtFacPer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
      edtFacDiaPag_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
      edtFacFpg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
      edtFacImpTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpTot_Enabled), 5, 0), true);
      edtFacDtoGen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
      edtFacDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDto_Enabled), 5, 0), true);
      edtFacImpGen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpGen_Enabled), 5, 0), true);
      edtFacImpPP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpPP_Enabled), 5, 0), true);
      edtFacBasImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBasImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBasImp_Enabled), 5, 0), true);
      edtFacIVAPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
      edtFacIVAImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacIVAImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAImp_Enabled), 5, 0), true);
      edtFacFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFirma_Enabled), 5, 0), true);
      edtFacObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavCombomeivaid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomeivaid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomeivaid_Enabled), 5, 0), true);
      edtavCombofacfpg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacfpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacfpg_Enabled), 5, 0), true);
      edtFacPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
   }

   public void zm1TW44( int GX_JID )
   {
      if ( ( GX_JID == 94 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z454FacSer = T01TW3_A454FacSer[0] ;
            Z428FacAlbTip = T01TW3_A428FacAlbTip[0] ;
            Z432FacDsc = T01TW3_A432FacDsc[0] ;
            Z447FacMts = T01TW3_A447FacMts[0] ;
            Z449FacPreMts = T01TW3_A449FacPreMts[0] ;
            Z444FacKgs = T01TW3_A444FacKgs[0] ;
            Z448FacPreKgs = T01TW3_A448FacPreKgs[0] ;
            Z3097FacTipPro = T01TW3_A3097FacTipPro[0] ;
            Z5353FacImpMan = T01TW3_A5353FacImpMan[0] ;
            Z12197FacUnds = T01TW3_A12197FacUnds[0] ;
            Z12198FacPreUnd = T01TW3_A12198FacPreUnd[0] ;
            Z5355FacImpMin = T01TW3_A5355FacImpMin[0] ;
            Z3898FacPreKgsA = T01TW3_A3898FacPreKgsA[0] ;
            Z3897FacKgsA = T01TW3_A3897FacKgsA[0] ;
         }
         else
         {
            Z454FacSer = A454FacSer ;
            Z428FacAlbTip = A428FacAlbTip ;
            Z432FacDsc = A432FacDsc ;
            Z447FacMts = A447FacMts ;
            Z449FacPreMts = A449FacPreMts ;
            Z444FacKgs = A444FacKgs ;
            Z448FacPreKgs = A448FacPreKgs ;
            Z3097FacTipPro = A3097FacTipPro ;
            Z5353FacImpMan = A5353FacImpMan ;
            Z12197FacUnds = A12197FacUnds ;
            Z12198FacPreUnd = A12198FacPreUnd ;
            Z5355FacImpMin = A5355FacImpMin ;
            Z3898FacPreKgsA = A3898FacPreKgsA ;
            Z3897FacKgsA = A3897FacKgsA ;
         }
      }
      if ( GX_JID == -94 )
      {
         Z430FacCod = A430FacCod ;
         Z446FacLin = A446FacLin ;
         Z454FacSer = A454FacSer ;
         Z428FacAlbTip = A428FacAlbTip ;
         Z432FacDsc = A432FacDsc ;
         Z447FacMts = A447FacMts ;
         Z449FacPreMts = A449FacPreMts ;
         Z444FacKgs = A444FacKgs ;
         Z448FacPreKgs = A448FacPreKgs ;
         Z3097FacTipPro = A3097FacTipPro ;
         Z5353FacImpMan = A5353FacImpMan ;
         Z12197FacUnds = A12197FacUnds ;
         Z12198FacPreUnd = A12198FacPreUnd ;
         Z396EmprCod = A396EmprCod ;
         Z5355FacImpMin = A5355FacImpMin ;
         Z3898FacPreKgsA = A3898FacPreKgsA ;
         Z3897FacKgsA = A3897FacKgsA ;
      }
   }

   public void standaloneNotModal1TW44( )
   {
   }

   public void standaloneModal1TW44( )
   {
      if ( isIns( )  )
      {
         A445FacLiC = (int)(O445FacLiC+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      }
      if ( ( A435FacEst > 1 ) && ( AV17FirmaD == 1 ) && true /* Level */ && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion delete NO permitida", ""), 1, "FACEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFacEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (GXutil.strcmp("", A454FacSer)==0) && ( Gx_BScreen == 0 ) )
      {
         A454FacSer = httpContext.getMessage( httpContext.getMessage( "RECTIFICACION", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A454FacSer", A454FacSer);
      }
      if ( isIns( )  && (0==A428FacAlbTip) && ( Gx_BScreen == 0 ) )
      {
         A428FacAlbTip = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A428FacAlbTip", GXutil.str( A428FacAlbTip, 1, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A446FacLin = A445FacLiC ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFacLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      }
      else
      {
         edtFacLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      }
   }

   public void load1TW44( )
   {
      /* Using cursor T01TW45 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A454FacSer = T01TW45_A454FacSer[0] ;
         A428FacAlbTip = T01TW45_A428FacAlbTip[0] ;
         A432FacDsc = T01TW45_A432FacDsc[0] ;
         A447FacMts = T01TW45_A447FacMts[0] ;
         A449FacPreMts = T01TW45_A449FacPreMts[0] ;
         A444FacKgs = T01TW45_A444FacKgs[0] ;
         A448FacPreKgs = T01TW45_A448FacPreKgs[0] ;
         A3097FacTipPro = T01TW45_A3097FacTipPro[0] ;
         A5353FacImpMan = T01TW45_A5353FacImpMan[0] ;
         A12197FacUnds = T01TW45_A12197FacUnds[0] ;
         A12198FacPreUnd = T01TW45_A12198FacPreUnd[0] ;
         A5355FacImpMin = T01TW45_A5355FacImpMin[0] ;
         A3898FacPreKgsA = T01TW45_A3898FacPreKgsA[0] ;
         A3897FacKgsA = T01TW45_A3897FacKgsA[0] ;
         zm1TW44( -94) ;
      }
      pr_default.close(39);
      onLoadActions1TW44( ) ;
   }

   public void onLoadActions1TW44( )
   {
      A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
      if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
      {
         A3923FacImp1 = A5355FacImpMin ;
         httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
         {
            A3923FacImp1 = A5353FacImpMan ;
            httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
         }
         else
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
            {
               A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
            else
            {
               A3923FacImp1 = A2239FacIml ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
         }
      }
      A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
   }

   public void checkExtendedTable1TW44( )
   {
      nIsDirty_44 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1TW44( ) ;
      if ( ( ( A447FacMts.doubleValue() < 0 ) || ( A444FacKgs.doubleValue() < 0 ) || ( A448FacPreKgs.doubleValue() < 0 ) || ( A449FacPreMts.doubleValue() < 0 ) ) && ( AV17FirmaD == 1 ) && ( A1153FacTipFac == 1 ) )
      {
         GXCCtl = "FACMTS_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite entrar valores NEGATIVOS", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacMts_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
      if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
      {
         nIsDirty_44 = (short)(1) ;
         A3923FacImp1 = A5355FacImpMin ;
         httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
         {
            nIsDirty_44 = (short)(1) ;
            A3923FacImp1 = A5353FacImpMan ;
            httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
         }
         else
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
            {
               nIsDirty_44 = (short)(1) ;
               A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
            else
            {
               nIsDirty_44 = (short)(1) ;
               A3923FacImp1 = A2239FacIml ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
         }
      }
      nIsDirty_44 = (short)(1) ;
      A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
   }

   public void closeExtendedTableCursors1TW44( )
   {
   }

   public void enableDisable1TW44( )
   {
   }

   public void getKey1TW44( )
   {
      /* Using cursor T01TW46 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound44 = (short)(1) ;
      }
      else
      {
         RcdFound44 = (short)(0) ;
      }
      pr_default.close(40);
   }

   public void getByPrimaryKey1TW44( )
   {
      /* Using cursor T01TW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TW44( 94) ;
         RcdFound44 = (short)(1) ;
         initializeNonKey1TW44( ) ;
         A446FacLin = T01TW3_A446FacLin[0] ;
         A454FacSer = T01TW3_A454FacSer[0] ;
         A428FacAlbTip = T01TW3_A428FacAlbTip[0] ;
         A432FacDsc = T01TW3_A432FacDsc[0] ;
         A447FacMts = T01TW3_A447FacMts[0] ;
         A449FacPreMts = T01TW3_A449FacPreMts[0] ;
         A444FacKgs = T01TW3_A444FacKgs[0] ;
         A448FacPreKgs = T01TW3_A448FacPreKgs[0] ;
         A3097FacTipPro = T01TW3_A3097FacTipPro[0] ;
         A5353FacImpMan = T01TW3_A5353FacImpMan[0] ;
         A12197FacUnds = T01TW3_A12197FacUnds[0] ;
         A12198FacPreUnd = T01TW3_A12198FacPreUnd[0] ;
         A5355FacImpMin = T01TW3_A5355FacImpMin[0] ;
         A3898FacPreKgsA = T01TW3_A3898FacPreKgsA[0] ;
         A3897FacKgsA = T01TW3_A3897FacKgsA[0] ;
         Z396EmprCod = A396EmprCod ;
         Z430FacCod = A430FacCod ;
         Z446FacLin = A446FacLin ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TW44( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound44 = (short)(0) ;
         initializeNonKey1TW44( ) ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TW44( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TW44( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TW44( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFAVEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z454FacSer, T01TW2_A454FacSer[0]) != 0 ) || ( Z428FacAlbTip != T01TW2_A428FacAlbTip[0] ) || ( GXutil.strcmp(Z432FacDsc, T01TW2_A432FacDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z447FacMts, T01TW2_A447FacMts[0]) != 0 ) || ( DecimalUtil.compareTo(Z449FacPreMts, T01TW2_A449FacPreMts[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z444FacKgs, T01TW2_A444FacKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z448FacPreKgs, T01TW2_A448FacPreKgs[0]) != 0 ) || ( GXutil.strcmp(Z3097FacTipPro, T01TW2_A3097FacTipPro[0]) != 0 ) || ( DecimalUtil.compareTo(Z5353FacImpMan, T01TW2_A5353FacImpMan[0]) != 0 ) || ( Z12197FacUnds != T01TW2_A12197FacUnds[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12198FacPreUnd, T01TW2_A12198FacPreUnd[0]) != 0 ) || ( DecimalUtil.compareTo(Z5355FacImpMin, T01TW2_A5355FacImpMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z3898FacPreKgsA, T01TW2_A3898FacPreKgsA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3897FacKgsA, T01TW2_A3897FacKgsA[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z454FacSer, T01TW2_A454FacSer[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacSer");
               GXutil.writeLogRaw("Old: ",Z454FacSer);
               GXutil.writeLogRaw("Current: ",T01TW2_A454FacSer[0]);
            }
            if ( Z428FacAlbTip != T01TW2_A428FacAlbTip[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacAlbTip");
               GXutil.writeLogRaw("Old: ",Z428FacAlbTip);
               GXutil.writeLogRaw("Current: ",T01TW2_A428FacAlbTip[0]);
            }
            if ( GXutil.strcmp(Z432FacDsc, T01TW2_A432FacDsc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacDsc");
               GXutil.writeLogRaw("Old: ",Z432FacDsc);
               GXutil.writeLogRaw("Current: ",T01TW2_A432FacDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z447FacMts, T01TW2_A447FacMts[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacMts");
               GXutil.writeLogRaw("Old: ",Z447FacMts);
               GXutil.writeLogRaw("Current: ",T01TW2_A447FacMts[0]);
            }
            if ( DecimalUtil.compareTo(Z449FacPreMts, T01TW2_A449FacPreMts[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacPreMts");
               GXutil.writeLogRaw("Old: ",Z449FacPreMts);
               GXutil.writeLogRaw("Current: ",T01TW2_A449FacPreMts[0]);
            }
            if ( DecimalUtil.compareTo(Z444FacKgs, T01TW2_A444FacKgs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacKgs");
               GXutil.writeLogRaw("Old: ",Z444FacKgs);
               GXutil.writeLogRaw("Current: ",T01TW2_A444FacKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z448FacPreKgs, T01TW2_A448FacPreKgs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacPreKgs");
               GXutil.writeLogRaw("Old: ",Z448FacPreKgs);
               GXutil.writeLogRaw("Current: ",T01TW2_A448FacPreKgs[0]);
            }
            if ( GXutil.strcmp(Z3097FacTipPro, T01TW2_A3097FacTipPro[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacTipPro");
               GXutil.writeLogRaw("Old: ",Z3097FacTipPro);
               GXutil.writeLogRaw("Current: ",T01TW2_A3097FacTipPro[0]);
            }
            if ( DecimalUtil.compareTo(Z5353FacImpMan, T01TW2_A5353FacImpMan[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacImpMan");
               GXutil.writeLogRaw("Old: ",Z5353FacImpMan);
               GXutil.writeLogRaw("Current: ",T01TW2_A5353FacImpMan[0]);
            }
            if ( Z12197FacUnds != T01TW2_A12197FacUnds[0] )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacUnds");
               GXutil.writeLogRaw("Old: ",Z12197FacUnds);
               GXutil.writeLogRaw("Current: ",T01TW2_A12197FacUnds[0]);
            }
            if ( DecimalUtil.compareTo(Z12198FacPreUnd, T01TW2_A12198FacPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacPreUnd");
               GXutil.writeLogRaw("Old: ",Z12198FacPreUnd);
               GXutil.writeLogRaw("Current: ",T01TW2_A12198FacPreUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z5355FacImpMin, T01TW2_A5355FacImpMin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacImpMin");
               GXutil.writeLogRaw("Old: ",Z5355FacImpMin);
               GXutil.writeLogRaw("Current: ",T01TW2_A5355FacImpMin[0]);
            }
            if ( DecimalUtil.compareTo(Z3898FacPreKgsA, T01TW2_A3898FacPreKgsA[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacPreKgsA");
               GXutil.writeLogRaw("Old: ",Z3898FacPreKgsA);
               GXutil.writeLogRaw("Current: ",T01TW2_A3898FacPreKgsA[0]);
            }
            if ( DecimalUtil.compareTo(Z3897FacKgsA, T01TW2_A3897FacKgsA[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.abonoscargos:[seudo value changed for attri]"+"FacKgsA");
               GXutil.writeLogRaw("Old: ",Z3897FacKgsA);
               GXutil.writeLogRaw("Current: ",T01TW2_A3897FacKgsA[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLFAVEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TW44( )
   {
      beforeValidate1TW44( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TW44( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TW44( 0) ;
         checkOptimisticConcurrency1TW44( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TW44( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TW44( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TW47 */
                  pr_default.execute(41, new Object[] {Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), A454FacSer, Byte.valueOf(A428FacAlbTip), A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A3097FacTipPro, A5353FacImpMan, Integer.valueOf(A12197FacUnds), A12198FacPreUnd, A396EmprCod, A5355FacImpMin, A3898FacPreKgsA, A3897FacKgsA});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(41) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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
            load1TW44( ) ;
         }
         endLevel1TW44( ) ;
      }
      closeExtendedTableCursors1TW44( ) ;
   }

   public void update1TW44( )
   {
      beforeValidate1TW44( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TW44( ) ;
      }
      if ( ( nIsMod_44 != 0 ) || ( nIsDirty_44 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TW44( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TW44( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TW44( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TW48 */
                     pr_default.execute(42, new Object[] {A454FacSer, Byte.valueOf(A428FacAlbTip), A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A3097FacTipPro, A5353FacImpMan, Integer.valueOf(A12197FacUnds), A12198FacPreUnd, A5355FacImpMin, A3898FacPreKgsA, A3897FacKgsA, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                     if ( (pr_default.getStatus(42) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFAVEN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TW44( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                        {
                           new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TW44( ) ;
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
            endLevel1TW44( ) ;
         }
      }
      closeExtendedTableCursors1TW44( ) ;
   }

   public void deferredUpdate1TW44( )
   {
   }

   public void delete1TW44( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TW44( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TW44( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TW44( ) ;
         afterConfirm1TW44( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TW44( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TW49 */
               pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                  {
                     new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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
      sMode44 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TW44( ) ;
      Gx_mode = sMode44 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TW44( )
   {
      standaloneModal1TW44( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
         if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
         {
            A3923FacImp1 = A5355FacImpMin ;
            httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
            {
               A3923FacImp1 = A5353FacImpMan ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
            else
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
               {
                  A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
               }
               else
               {
                  A3923FacImp1 = A2239FacIml ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
               }
            }
         }
         A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
      }
   }

   public void endLevel1TW44( )
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

   public void scanStart1TW44( )
   {
      /* Scan By routine */
      /* Using cursor T01TW50 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A446FacLin = T01TW50_A446FacLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TW44( )
   {
      /* Scan next routine */
      pr_default.readNext(44);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A446FacLin = T01TW50_A446FacLin[0] ;
      }
   }

   public void scanEnd1TW44( )
   {
      pr_default.close(44);
   }

   public void afterConfirm1TW44( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TW44( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TW44( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TW44( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TW44( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TW44( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TW44( )
   {
      edtFacLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacMts_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacPreMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreMts_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacKgs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacPreKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreKgs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacUnds_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacUnds_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacUnds_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreUnd_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacImpMan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpMan_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtFacImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImp_Enabled), 5, 0), !bGXsfl_169_Refreshing);
   }

   public void send_integrity_lvl_hashes1TW44( )
   {
   }

   public void send_integrity_lvl_hashes1TW43( )
   {
   }

   public void subsflControlProps_16944( )
   {
      edtFacLin_Internalname = "FACLIN_"+sGXsfl_169_idx ;
      edtFacDsc_Internalname = "FACDSC_"+sGXsfl_169_idx ;
      edtFacMts_Internalname = "FACMTS_"+sGXsfl_169_idx ;
      edtFacPreMts_Internalname = "FACPREMTS_"+sGXsfl_169_idx ;
      edtFacKgs_Internalname = "FACKGS_"+sGXsfl_169_idx ;
      edtFacPreKgs_Internalname = "FACPREKGS_"+sGXsfl_169_idx ;
      edtFacUnds_Internalname = "FACUNDS_"+sGXsfl_169_idx ;
      edtFacPreUnd_Internalname = "FACPREUND_"+sGXsfl_169_idx ;
      edtFacImpMan_Internalname = "FACIMPMAN_"+sGXsfl_169_idx ;
      edtFacImp_Internalname = "FACIMP_"+sGXsfl_169_idx ;
   }

   public void subsflControlProps_fel_16944( )
   {
      edtFacLin_Internalname = "FACLIN_"+sGXsfl_169_fel_idx ;
      edtFacDsc_Internalname = "FACDSC_"+sGXsfl_169_fel_idx ;
      edtFacMts_Internalname = "FACMTS_"+sGXsfl_169_fel_idx ;
      edtFacPreMts_Internalname = "FACPREMTS_"+sGXsfl_169_fel_idx ;
      edtFacKgs_Internalname = "FACKGS_"+sGXsfl_169_fel_idx ;
      edtFacPreKgs_Internalname = "FACPREKGS_"+sGXsfl_169_fel_idx ;
      edtFacUnds_Internalname = "FACUNDS_"+sGXsfl_169_fel_idx ;
      edtFacPreUnd_Internalname = "FACPREUND_"+sGXsfl_169_fel_idx ;
      edtFacImpMan_Internalname = "FACIMPMAN_"+sGXsfl_169_fel_idx ;
      edtFacImp_Internalname = "FACIMP_"+sGXsfl_169_fel_idx ;
   }

   public void addRow1TW44( )
   {
      nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_16944( ) ;
      sendRow1TW44( ) ;
   }

   public void sendRow1TW44( )
   {
      Gridlevel_abonoscargoslineasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_abonoscargoslineas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_abonoscargoslineas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_abonoscargoslineas_Class, "") != 0 )
         {
            subGridlevel_abonoscargoslineas_Linesclass = subGridlevel_abonoscargoslineas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_abonoscargoslineas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_abonoscargoslineas_Backstyle = (byte)(0) ;
         subGridlevel_abonoscargoslineas_Backcolor = subGridlevel_abonoscargoslineas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_abonoscargoslineas_Class, "") != 0 )
         {
            subGridlevel_abonoscargoslineas_Linesclass = subGridlevel_abonoscargoslineas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_abonoscargoslineas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_abonoscargoslineas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_abonoscargoslineas_Class, "") != 0 )
         {
            subGridlevel_abonoscargoslineas_Linesclass = subGridlevel_abonoscargoslineas_Class+"Odd" ;
         }
         subGridlevel_abonoscargoslineas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_abonoscargoslineas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_abonoscargoslineas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_169_idx) % (2))) == 0 )
         {
            subGridlevel_abonoscargoslineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_abonoscargoslineas_Class, "") != 0 )
            {
               subGridlevel_abonoscargoslineas_Linesclass = subGridlevel_abonoscargoslineas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_abonoscargoslineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_abonoscargoslineas_Class, "") != 0 )
            {
               subGridlevel_abonoscargoslineas_Linesclass = subGridlevel_abonoscargoslineas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacLin_Internalname,GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A446FacLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacDsc_Internalname,GXutil.rtrim( A432FacDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacMts_Internalname,GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacMts_Enabled!=0) ? localUtil.format( A447FacMts, "ZZZZZ9.99") : localUtil.format( A447FacMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,172);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 173,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPreMts_Internalname,GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacPreMts_Enabled!=0) ? localUtil.format( A449FacPreMts, "ZZZZZZ9.999") : localUtil.format( A449FacPreMts, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,173);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPreMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacPreMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacKgs_Enabled!=0) ? localUtil.format( A444FacKgs, "ZZZZZ9.99") : localUtil.format( A444FacKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,174);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPreKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacPreKgs_Enabled!=0) ? localUtil.format( A448FacPreKgs, "ZZZZZZ9.999") : localUtil.format( A448FacPreKgs, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,175);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPreKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacPreKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 176,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacUnds_Internalname,GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacUnds_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12197FacUnds), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12197FacUnds), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacUnds_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacUnds_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 177,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPreUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacPreUnd_Enabled!=0) ? localUtil.format( A12198FacPreUnd, "ZZZZZZ9.99999") : localUtil.format( A12198FacPreUnd, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,177);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPreUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacPreUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacImpMan_Internalname,GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacImpMan_Enabled!=0) ? localUtil.format( A5353FacImpMan, "ZZZZZZZ9.99") : localUtil.format( A5353FacImpMan, "ZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,178);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacImpMan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtFacImpMan_Visible),Integer.valueOf(edtFacImpMan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_abonoscargoslineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacImp_Internalname,GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacImp_Enabled!=0) ? localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99") : localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacImp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_abonoscargoslineasRow);
      send_integrity_lvl_hashes1TW44( ) ;
      GXCCtl = "Z446FacLin_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z454FacSer_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z454FacSer));
      GXCCtl = "Z428FacAlbTip_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z432FacDsc_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z432FacDsc));
      GXCCtl = "Z447FacMts_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z449FacPreMts_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z444FacKgs_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z448FacPreKgs_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3097FacTipPro_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3097FacTipPro));
      GXCCtl = "Z5353FacImpMan_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12197FacUnds_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12198FacPreUnd_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5355FacImpMin_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3898FacPreKgsA_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3897FacKgsA_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_44_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_44_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_44_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_169_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "vFACPRI_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV38FacPri));
      GXCCtl = "vEMPRCOD_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vFACCOD_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFACTIPFAC_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV19FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "FACSER_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A454FacSer));
      GXCCtl = "FACALBTIP_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDSC_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACMTS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREMTS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACKGS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREKGS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACUNDS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREUND_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPMAN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPMAN_"+sGXsfl_169_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMP_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_abonoscargoslineasContainer.AddRow(Gridlevel_abonoscargoslineasRow);
   }

   public void readRow1TW44( )
   {
      nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_16944( ) ;
      edtFacLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACLIN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACDSC_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACMTS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacPreMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREMTS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACKGS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacPreKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREKGS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacUnds_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACUNDS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREUND_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacImpMan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMPMAN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacImpMan_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMPMAN_"+sGXsfl_169_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMP_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "FACLIN_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacLin_Internalname ;
         wbErr = true ;
         A446FacLin = 0 ;
      }
      else
      {
         A446FacLin = (int)(localUtil.ctol( httpContext.cgiGet( edtFacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A432FacDsc = httpContext.cgiGet( edtFacDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACMTS_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacMts_Internalname ;
         wbErr = true ;
         A447FacMts = DecimalUtil.ZERO ;
      }
      else
      {
         A447FacMts = localUtil.ctond( httpContext.cgiGet( edtFacMts_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreMts_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreMts_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FACPREMTS_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPreMts_Internalname ;
         wbErr = true ;
         A449FacPreMts = DecimalUtil.ZERO ;
      }
      else
      {
         A449FacPreMts = localUtil.ctond( httpContext.cgiGet( edtFacPreMts_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACKGS_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacKgs_Internalname ;
         wbErr = true ;
         A444FacKgs = DecimalUtil.ZERO ;
      }
      else
      {
         A444FacKgs = localUtil.ctond( httpContext.cgiGet( edtFacKgs_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreKgs_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreKgs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FACPREKGS_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPreKgs_Internalname ;
         wbErr = true ;
         A448FacPreKgs = DecimalUtil.ZERO ;
      }
      else
      {
         A448FacPreKgs = localUtil.ctond( httpContext.cgiGet( edtFacPreKgs_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacUnds_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacUnds_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "FACUNDS_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacUnds_Internalname ;
         wbErr = true ;
         A12197FacUnds = 0 ;
      }
      else
      {
         A12197FacUnds = (int)(localUtil.ctol( httpContext.cgiGet( edtFacUnds_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacPreUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreUnd_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FACPREUND_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPreUnd_Internalname ;
         wbErr = true ;
         A12198FacPreUnd = DecimalUtil.ZERO ;
      }
      else
      {
         A12198FacPreUnd = localUtil.ctond( httpContext.cgiGet( edtFacPreUnd_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacImpMan_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacImpMan_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACIMPMAN_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacImpMan_Internalname ;
         wbErr = true ;
         A5353FacImpMan = DecimalUtil.ZERO ;
      }
      else
      {
         A5353FacImpMan = localUtil.ctond( httpContext.cgiGet( edtFacImpMan_Internalname)) ;
      }
      A438FacImp = localUtil.ctond( httpContext.cgiGet( edtFacImp_Internalname)) ;
      GXCCtl = "Z446FacLin_" + sGXsfl_169_idx ;
      Z446FacLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z454FacSer_" + sGXsfl_169_idx ;
      Z454FacSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z428FacAlbTip_" + sGXsfl_169_idx ;
      Z428FacAlbTip = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z432FacDsc_" + sGXsfl_169_idx ;
      Z432FacDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z447FacMts_" + sGXsfl_169_idx ;
      Z447FacMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z449FacPreMts_" + sGXsfl_169_idx ;
      Z449FacPreMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z444FacKgs_" + sGXsfl_169_idx ;
      Z444FacKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z448FacPreKgs_" + sGXsfl_169_idx ;
      Z448FacPreKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3097FacTipPro_" + sGXsfl_169_idx ;
      Z3097FacTipPro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5353FacImpMan_" + sGXsfl_169_idx ;
      Z5353FacImpMan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12197FacUnds_" + sGXsfl_169_idx ;
      Z12197FacUnds = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12198FacPreUnd_" + sGXsfl_169_idx ;
      Z12198FacPreUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5355FacImpMin_" + sGXsfl_169_idx ;
      Z5355FacImpMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3898FacPreKgsA_" + sGXsfl_169_idx ;
      Z3898FacPreKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3897FacKgsA_" + sGXsfl_169_idx ;
      Z3897FacKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z454FacSer_" + sGXsfl_169_idx ;
      A454FacSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z428FacAlbTip_" + sGXsfl_169_idx ;
      A428FacAlbTip = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3097FacTipPro_" + sGXsfl_169_idx ;
      A3097FacTipPro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5355FacImpMin_" + sGXsfl_169_idx ;
      A5355FacImpMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3898FacPreKgsA_" + sGXsfl_169_idx ;
      A3898FacPreKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3897FacKgsA_" + sGXsfl_169_idx ;
      A3897FacKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_44_" + sGXsfl_169_idx ;
      nRcdDeleted_44 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_44_" + sGXsfl_169_idx ;
      nRcdExists_44 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_44_" + sGXsfl_169_idx ;
      nIsMod_44 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "FACSER_" + sGXsfl_169_idx ;
      A454FacSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "FACALBTIP_" + sGXsfl_169_idx ;
      A428FacAlbTip = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFacLin_Enabled = edtFacLin_Enabled ;
   }

   public void confirmValues1TW0( )
   {
      nGXsfl_169_idx = 0 ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_16944( ) ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_16944( ) ;
         httpContext.changePostValue( "Z446FacLin_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z446FacLin_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z446FacLin_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z454FacSer_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z454FacSer_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z454FacSer_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z428FacAlbTip_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z428FacAlbTip_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z428FacAlbTip_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z432FacDsc_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z432FacDsc_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z432FacDsc_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z447FacMts_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z447FacMts_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z447FacMts_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z449FacPreMts_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z449FacPreMts_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z449FacPreMts_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z444FacKgs_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z444FacKgs_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z444FacKgs_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z448FacPreKgs_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z448FacPreKgs_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z448FacPreKgs_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z3097FacTipPro_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z3097FacTipPro_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3097FacTipPro_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z5353FacImpMan_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z5353FacImpMan_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5353FacImpMan_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z12197FacUnds_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z12197FacUnds_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12197FacUnds_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z12198FacPreUnd_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z5355FacImpMin_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z5355FacImpMin_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5355FacImpMin_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z3898FacPreKgsA_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z3897FacKgsA_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z3897FacKgsA_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3897FacKgsA_"+sGXsfl_169_idx) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(AV38FacPri))}, new String[] {"Gx_mode","EmprCod","FacCod","FacTipFac","FacPri"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"AbonosCargos");
      forbiddenHiddens.add("FacFirma", GXutil.rtrim( localUtil.format( A9605FacFirma, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Ser30", GXutil.rtrim( localUtil.format( AV37Ser30, "")));
      forbiddenHiddens.add("Ser20", GXutil.rtrim( localUtil.format( AV36Ser20, "")));
      forbiddenHiddens.add("Ser0", GXutil.rtrim( localUtil.format( AV35Ser0, "")));
      forbiddenHiddens.add("Ser3", GXutil.rtrim( localUtil.format( AV34Ser3, "")));
      forbiddenHiddens.add("Ser2", GXutil.rtrim( localUtil.format( AV33Ser2, "")));
      forbiddenHiddens.add("Ser1", GXutil.rtrim( localUtil.format( AV32Ser1, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
      forbiddenHiddens.add("FacRECPor", localUtil.format( A453FacRECPor, "ZZ9.99"));
      forbiddenHiddens.add("FacObs", A7210FacObs);
      forbiddenHiddens.add("FacCob", GXutil.rtrim( localUtil.format( A965FacCob, "")));
      forbiddenHiddens.add("FacTipFac", localUtil.format( DecimalUtil.doubleToDec(A1153FacTipFac), "9"));
      forbiddenHiddens.add("FacIVACod", GXutil.rtrim( localUtil.format( A960FacIVACod, "@!")));
      forbiddenHiddens.add("FacLiq1", localUtil.format( A9643FacLiq1, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacLiq2", localUtil.format( A9644FacLiq2, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacIva1", localUtil.format( A9645FacIva1, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacTot1", localUtil.format( A9646FacTot1, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacEnergia", localUtil.format( A14219FacEnergia, "ZZ9.99"));
      forbiddenHiddens.add("FacCostFac", localUtil.format( A14224FacCostFac, "ZZ9.99"));
      forbiddenHiddens.add("FacCostMts", localUtil.format( A14222FacCostMts, "ZZZZZZ9.99"));
      forbiddenHiddens.add("FacCostKgs", localUtil.format( A14223FacCostKgs, "ZZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\abonoscargos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z430FacCod", GXutil.ltrim( localUtil.ntoc( Z430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z437FacFpg", GXutil.rtrim( Z437FacFpg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z443FacIVAPor", GXutil.ltrim( localUtil.ntoc( Z443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z436FacFch", localUtil.dtoc( Z436FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z450FacPri", GXutil.rtrim( Z450FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z433FacDtoGen", GXutil.ltrim( localUtil.ntoc( Z433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z434FacDtoPP", GXutil.ltrim( localUtil.ntoc( Z434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1725FacRegIva", GXutil.rtrim( Z1725FacRegIva));
      app.GxWebStd.gx_hidden_field( httpContext, "Z453FacRECPor", GXutil.ltrim( localUtil.ntoc( Z453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6632FacDto", GXutil.ltrim( localUtil.ntoc( Z6632FacDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z435FacEst", GXutil.ltrim( localUtil.ntoc( Z435FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z445FacLiC", GXutil.ltrim( localUtil.ntoc( Z445FacLiC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z965FacCob", GXutil.rtrim( Z965FacCob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1150FacNumVto", GXutil.ltrim( localUtil.ntoc( Z1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1151FacPer", GXutil.rtrim( Z1151FacPer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1152FacDiaPag", GXutil.rtrim( Z1152FacDiaPag));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1153FacTipFac", GXutil.ltrim( localUtil.ntoc( Z1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z960FacIVACod", GXutil.rtrim( Z960FacIVACod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2739FacSerNum", GXutil.rtrim( Z2739FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3096FacDivTCod", GXutil.rtrim( Z3096FacDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9605FacFirma", GXutil.rtrim( Z9605FacFirma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9606FacHor", localUtil.ttoc( Z9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9643FacLiq1", GXutil.ltrim( localUtil.ntoc( Z9643FacLiq1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9644FacLiq2", GXutil.ltrim( localUtil.ntoc( Z9644FacLiq2, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9645FacIva1", GXutil.ltrim( localUtil.ntoc( Z9645FacIva1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9646FacTot1", GXutil.ltrim( localUtil.ntoc( Z9646FacTot1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14219FacEnergia", GXutil.ltrim( localUtil.ntoc( Z14219FacEnergia, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14224FacCostFac", GXutil.ltrim( localUtil.ntoc( Z14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14222FacCostMts", GXutil.ltrim( localUtil.ntoc( Z14222FacCostMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14223FacCostKgs", GXutil.ltrim( localUtil.ntoc( Z14223FacCostKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3119FacRepCod", GXutil.rtrim( Z3119FacRepCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11629MeivaId", GXutil.rtrim( Z11629MeivaId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3115FacDivCod", GXutil.ltrim( localUtil.ntoc( Z3115FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7212FacRect", GXutil.ltrim( localUtil.ntoc( Z7212FacRect, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8346FacRecI", GXutil.ltrim( localUtil.ntoc( Z8346FacRecI, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11513FacRecIca", GXutil.ltrim( localUtil.ntoc( Z11513FacRecIca, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O445FacLiC", GXutil.ltrim( localUtil.ntoc( O445FacLiC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1150FacNumVto", GXutil.ltrim( localUtil.ntoc( O1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1151FacPer", GXutil.rtrim( O1151FacPer));
      app.GxWebStd.gx_hidden_field( httpContext, "O1152FacDiaPag", GXutil.rtrim( O1152FacDiaPag));
      app.GxWebStd.gx_hidden_field( httpContext, "O437FacFpg", GXutil.rtrim( O437FacFpg));
      app.GxWebStd.gx_hidden_field( httpContext, "O434FacDtoPP", GXutil.ltrim( localUtil.ntoc( O434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O433FacDtoGen", GXutil.ltrim( localUtil.ntoc( O433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O443FacIVAPor", GXutil.ltrim( localUtil.ntoc( O443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O453FacRECPor", GXutil.ltrim( localUtil.ntoc( O453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O14224FacCostFac", GXutil.ltrim( localUtil.ntoc( O14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_169", GXutil.ltrim( localUtil.ntoc( nGXsfl_169_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3115FacDivCod", GXutil.ltrim( localUtil.ntoc( A3115FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3119FacRepCod", GXutil.rtrim( A3119FacRepCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N11629MeivaId", GXutil.rtrim( A11629MeivaId));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV30CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV30CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMEIVAID_DATA", AV25MeivaId_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMEIVAID_DATA", AV25MeivaId_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFACFPG_DATA", AV22FacFpg_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFACFPG_DATA", AV22FacFpg_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACPRI", GXutil.rtrim( AV38FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38FacPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "SER30", GXutil.rtrim( AV37Ser30));
      app.GxWebStd.gx_hidden_field( httpContext, "SER20", GXutil.rtrim( AV36Ser20));
      app.GxWebStd.gx_hidden_field( httpContext, "SER0", GXutil.rtrim( AV35Ser0));
      app.GxWebStd.gx_hidden_field( httpContext, "SER3", GXutil.rtrim( AV34Ser3));
      app.GxWebStd.gx_hidden_field( httpContext, "SER2", GXutil.rtrim( AV33Ser2));
      app.GxWebStd.gx_hidden_field( httpContext, "SER1", GXutil.rtrim( AV32Ser1));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPGEN1", GXutil.ltrim( localUtil.ntoc( A3919FacImpGen1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLOMBIA", GXutil.ltrim( localUtil.ntoc( A7209Colombia, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPPP1", GXutil.ltrim( localUtil.ntoc( A3920FacImpPP1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVAIMP1", GXutil.ltrim( localUtil.ntoc( A3921FacIvaImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP1", GXutil.ltrim( localUtil.ntoc( A3922FacRecImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP", GXutil.ltrim( localUtil.ntoc( A452FacRecImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENE", GXutil.ltrim( localUtil.ntoc( A14220FacCostEne, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET", GXutil.ltrim( localUtil.ntoc( A7213FacImpRet, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI", GXutil.ltrim( localUtil.ntoc( A8347FacImpReI, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA", GXutil.ltrim( localUtil.ntoc( A11515FacImpIca, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTOT", GXutil.ltrim( localUtil.ntoc( A455FacTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPTOT1", GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACENERGIA", GXutil.ltrim( localUtil.ntoc( A14219FacEnergia, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPENG1", GXutil.ltrim( localUtil.ntoc( A14218FacImpEng1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTMTS", GXutil.ltrim( localUtil.ntoc( A14222FacCostMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTKGS", GXutil.ltrim( localUtil.ntoc( A14223FacCostKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTFAC", GXutil.ltrim( localUtil.ntoc( A14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENG", GXutil.ltrim( localUtil.ntoc( A14221FacCostEng, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPENER", GXutil.ltrim( localUtil.ntoc( A14225FacImpEner, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACCOD", GXutil.ltrim( localUtil.ntoc( AV8FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8FacCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FACDIVCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDIVCOD", GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDIVCOD", GXutil.ltrim( localUtil.ntoc( A3115FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FACREPCOD", GXutil.rtrim( AV14Insert_FacRepCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACREPCOD", GXutil.rtrim( A3119FacRepCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MEIVAID", GXutil.rtrim( AV15Insert_MeivaId));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACTIPFAC", GXutil.ltrim( localUtil.ntoc( AV19FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTIPFAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19FacTipFac), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV29ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IVACOD", GXutil.rtrim( A953IvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVACOD", GXutil.rtrim( A960FacIVACod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDIVTRA", GXutil.rtrim( A3091CliDivTra));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDIVTCOD", GXutil.rtrim( A3096FacDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IVAREC", GXutil.ltrim( localUtil.ntoc( A589IvaRec, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECPOR", GXutil.ltrim( localUtil.ntoc( A453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSER2", GXutil.rtrim( AV33Ser2));
      app.GxWebStd.gx_hidden_field( httpContext, "vSER20", GXutil.rtrim( AV36Ser20));
      app.GxWebStd.gx_hidden_field( httpContext, "vSER1", GXutil.rtrim( AV32Ser1));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDTOPP", GXutil.ltrim( localUtil.ntoc( A434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET1", GXutil.ltrim( localUtil.ntoc( A7214FacImpRet1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECT", GXutil.ltrim( localUtil.ntoc( A7212FacRect, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI1", GXutil.ltrim( localUtil.ntoc( A8348FacImpReI1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECI", GXutil.ltrim( localUtil.ntoc( A8346FacRecI, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA1", GXutil.ltrim( localUtil.ntoc( A11514FacImpIca1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECICA", GXutil.ltrim( localUtil.ntoc( A11513FacRecIca, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACFCH", localUtil.dtoc( AV28Facfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACCODX", GXutil.ltrim( localUtil.ntoc( AV27FacCodX, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV17FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOB", GXutil.rtrim( A965FacCob));
      app.GxWebStd.gx_hidden_field( httpContext, "vSER30", GXutil.rtrim( AV37Ser30));
      app.GxWebStd.gx_hidden_field( httpContext, "vSER0", GXutil.rtrim( AV35Ser0));
      app.GxWebStd.gx_hidden_field( httpContext, "vSER3", GXutil.rtrim( AV34Ser3));
      app.GxWebStd.gx_hidden_field( httpContext, "FACREGIVA", GXutil.rtrim( A1725FacRegIva));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIC", GXutil.ltrim( localUtil.ntoc( A445FacLiC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIQ1", GXutil.ltrim( localUtil.ntoc( A9643FacLiq1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIQ2", GXutil.ltrim( localUtil.ntoc( A9644FacLiq2, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVA1", GXutil.ltrim( localUtil.ntoc( A9645FacIva1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTOT1", GXutil.ltrim( localUtil.ntoc( A9646FacTot1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FACREPNOM", GXutil.rtrim( A3120FacRepNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZONGEOCOD", GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEIVADSC", A11630MeivaDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "FACDIVABR", GXutil.rtrim( A3116FacDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "IVAPOR", GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZONGEONOM", GXutil.rtrim( A1360ZonGeoNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRECDGRL", GXutil.ltrim( localUtil.ntoc( A1718CliRecDGrl, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRECDPAG", GXutil.rtrim( A1719CliRecDPag));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRECDPPG", GXutil.ltrim( localUtil.ntoc( A1720CliRecDPpg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRECFPG", GXutil.rtrim( A1721CliRecFpg));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRECIVA", GXutil.rtrim( A1722CliRecIVA));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRECNVTO", GXutil.ltrim( localUtil.ntoc( A1723CliRecNVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRECPRD", GXutil.rtrim( A1724CliRecPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMP1", GXutil.ltrim( localUtil.ntoc( A3923FacImp1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACSER", GXutil.rtrim( A454FacSer));
      app.GxWebStd.gx_hidden_field( httpContext, "FACALBTIP", GXutil.ltrim( localUtil.ntoc( A428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPMIN", GXutil.ltrim( localUtil.ntoc( A5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIML", GXutil.ltrim( localUtil.ntoc( A2239FacIml, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREKGSA", GXutil.ltrim( localUtil.ntoc( A3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACKGSA", GXutil.ltrim( localUtil.ntoc( A3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPPRO", GXutil.rtrim( A3097FacTipPro));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Objectcall", GXutil.rtrim( Combo_meivaid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Cls", GXutil.rtrim( Combo_meivaid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Selectedvalue_set", GXutil.rtrim( Combo_meivaid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Enabled", GXutil.booltostr( Combo_meivaid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Emptyitemtext", GXutil.rtrim( Combo_meivaid_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Enabled", GXutil.booltostr( Dvpanel_unnamedtable3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Objectcall", GXutil.rtrim( Combo_facfpg_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Cls", GXutil.rtrim( Combo_facfpg_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Selectedvalue_set", GXutil.rtrim( Combo_facfpg_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Enabled", GXutil.booltostr( Combo_facfpg_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Emptyitemtext", GXutil.rtrim( Combo_facfpg_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable5_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Enabled", GXutil.booltostr( Dvpanel_unnamedtable5_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable6_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Enabled", GXutil.booltostr( Dvpanel_unnamedtable6_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
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
      return formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(AV38FacPri))}, new String[] {"Gx_mode","EmprCod","FacCod","FacTipFac","FacPri"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.AbonosCargos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Abonos / Cargos", "") ;
   }

   public void initializeNonKey1TW43( )
   {
      A3073RepCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3073RepCod", A3073RepCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A3119FacRepCod = "" ;
      n3119FacRepCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
      A11629MeivaId = "" ;
      n11629MeivaId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
      A437FacFpg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
      AV28Facfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Facfch", localUtil.format(AV28Facfch, "99/99/99"));
      AV27FacCodX = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27FacCodX), 8, 0));
      AV37Ser30 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Ser30", AV37Ser30);
      AV36Ser20 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Ser20", AV36Ser20);
      AV35Ser0 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Ser0", AV35Ser0);
      AV34Ser3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Ser3", AV34Ser3);
      AV33Ser2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ser2", AV33Ser2);
      AV32Ser1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ser1", AV32Ser1);
      A443FacIVAPor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
      A14220FacCostEne = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
      A441FacImpTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      A14225FacImpEner = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      A14221FacCostEng = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      A455FacTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      A429FacBasImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      A452FacRecImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      A442FacIVAImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      A440FacImpPP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      A439FacImpGen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      A1718CliRecDGrl = DecimalUtil.ZERO ;
      n1718CliRecDGrl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1718CliRecDGrl", GXutil.ltrimstr( A1718CliRecDGrl, 6, 2));
      A1719CliRecDPag = "" ;
      n1719CliRecDPag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1719CliRecDPag", A1719CliRecDPag);
      A1720CliRecDPpg = DecimalUtil.ZERO ;
      n1720CliRecDPpg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1720CliRecDPpg", GXutil.ltrimstr( A1720CliRecDPpg, 6, 2));
      A1721CliRecFpg = "" ;
      n1721CliRecFpg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1721CliRecFpg", A1721CliRecFpg);
      A1722CliRecIVA = "" ;
      n1722CliRecIVA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1722CliRecIVA", A1722CliRecIVA);
      A1723CliRecNVto = (byte)(0) ;
      n1723CliRecNVto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1723CliRecNVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1723CliRecNVto), 2, 0));
      A1724CliRecPrd = "" ;
      n1724CliRecPrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1724CliRecPrd", A1724CliRecPrd);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A433FacDtoGen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
      A434FacDtoPP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
      A1725FacRegIva = "" ;
      n1725FacRegIva = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1725FacRegIva", A1725FacRegIva);
      A6632FacDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
      A7210FacObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
      A445FacLiC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      A965FacCob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A965FacCob", A965FacCob);
      A1150FacNumVto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
      A1151FacPer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
      A1152FacDiaPag = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
      A2739FacSerNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
      A3091CliDivTra = "" ;
      n3091CliDivTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
      A3140CliDivCod = (byte)(0) ;
      n3140CliDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
      A3116FacDivAbr = "" ;
      n3116FacDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
      A3120FacRepNom = "" ;
      n3120FacRepNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3120FacRepNom", A3120FacRepNom);
      A9605FacFirma = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
      A9643FacLiq1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9643FacLiq1", GXutil.ltrimstr( A9643FacLiq1, 16, 5));
      A9644FacLiq2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9644FacLiq2", GXutil.ltrimstr( A9644FacLiq2, 16, 5));
      A9645FacIva1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9645FacIva1", GXutil.ltrimstr( A9645FacIva1, 16, 5));
      A9646FacTot1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9646FacTot1", GXutil.ltrimstr( A9646FacTot1, 16, 5));
      A858ZonGeoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
      A1360ZonGeoNom = "" ;
      n1360ZonGeoNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
      A11630MeivaDsc = "" ;
      n11630MeivaDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11630MeivaDsc", A11630MeivaDsc);
      A14219FacEnergia = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14219FacEnergia", GXutil.ltrimstr( A14219FacEnergia, 6, 2));
      A14224FacCostFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      A7213FacImpRet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      A8347FacImpReI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      A11515FacImpIca = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      A14222FacCostMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14222FacCostMts", GXutil.ltrimstr( A14222FacCostMts, 10, 2));
      A14223FacCostKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14223FacCostKgs", GXutil.ltrimstr( A14223FacCostKgs, 10, 2));
      A3115FacDivCod = (byte)(0) ;
      n3115FacDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
      A436FacFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
      A450FacPri = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      A453FacRECPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
      A435FacEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      A1153FacTipFac = AV19FacTipFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
      A960FacIVACod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A960FacIVACod", A960FacIVACod);
      A3096FacDivTCod = "" ;
      n3096FacDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
      A9606FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      O445FacLiC = A445FacLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      O1150FacNumVto = A1150FacNumVto ;
      httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
      O1151FacPer = A1151FacPer ;
      httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
      O1152FacDiaPag = A1152FacDiaPag ;
      httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
      O437FacFpg = A437FacFpg ;
      httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
      O434FacDtoPP = A434FacDtoPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
      O433FacDtoGen = A433FacDtoGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
      O443FacIVAPor = A443FacIVAPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
      O453FacRECPor = A453FacRECPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
      O14224FacCostFac = A14224FacCostFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      Z437FacFpg = "" ;
      Z443FacIVAPor = (byte)(0) ;
      Z436FacFch = GXutil.nullDate() ;
      Z450FacPri = "" ;
      Z433FacDtoGen = DecimalUtil.ZERO ;
      Z434FacDtoPP = DecimalUtil.ZERO ;
      Z1725FacRegIva = "" ;
      Z453FacRECPor = DecimalUtil.ZERO ;
      Z6632FacDto = DecimalUtil.ZERO ;
      Z435FacEst = (byte)(0) ;
      Z445FacLiC = 0 ;
      Z965FacCob = "" ;
      Z1150FacNumVto = (byte)(0) ;
      Z1151FacPer = "" ;
      Z1152FacDiaPag = "" ;
      Z1153FacTipFac = (byte)(0) ;
      Z960FacIVACod = "" ;
      Z2739FacSerNum = "" ;
      Z3096FacDivTCod = "" ;
      Z9605FacFirma = "" ;
      Z9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Z9643FacLiq1 = DecimalUtil.ZERO ;
      Z9644FacLiq2 = DecimalUtil.ZERO ;
      Z9645FacIva1 = DecimalUtil.ZERO ;
      Z9646FacTot1 = DecimalUtil.ZERO ;
      Z14219FacEnergia = DecimalUtil.ZERO ;
      Z14224FacCostFac = DecimalUtil.ZERO ;
      Z14222FacCostMts = DecimalUtil.ZERO ;
      Z14223FacCostKgs = DecimalUtil.ZERO ;
      Z3119FacRepCod = "" ;
      Z252CliCod = 0 ;
      Z11629MeivaId = "" ;
      Z3115FacDivCod = (byte)(0) ;
      Z14222FacCostMts = DecimalUtil.ZERO ;
      Z14223FacCostKgs = DecimalUtil.ZERO ;
      Z7212FacRect = DecimalUtil.ZERO ;
      Z8346FacRecI = DecimalUtil.ZERO ;
      Z11513FacRecIca = DecimalUtil.ZERO ;
   }

   public void initAll1TW43( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A430FacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      initializeNonKey1TW43( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV37Ser30 = iV37Ser30 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Ser30", AV37Ser30);
      AV36Ser20 = iV36Ser20 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Ser20", AV36Ser20);
      AV35Ser0 = iV35Ser0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Ser0", AV35Ser0);
      AV34Ser3 = iV34Ser3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Ser3", AV34Ser3);
      AV33Ser2 = iV33Ser2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ser2", AV33Ser2);
      AV32Ser1 = iV32Ser1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ser1", AV32Ser1);
      A436FacFch = i436FacFch ;
      httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
      A1153FacTipFac = i1153FacTipFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
      A450FacPri = i450FacPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      A435FacEst = i435FacEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      A960FacIVACod = i960FacIVACod ;
      httpContext.ajax_rsp_assign_attri("", false, "A960FacIVACod", A960FacIVACod);
      A453FacRECPor = i453FacRECPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
      A9606FacHor = i9606FacHor ;
      httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void initializeNonKey1TW44( )
   {
      A438FacImp = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A3097FacTipPro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3097FacTipPro", A3097FacTipPro);
      A5353FacImpMan = DecimalUtil.ZERO ;
      A12197FacUnds = 0 ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
      A454FacSer = httpContext.getMessage( "RECTIFICACION", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A454FacSer", A454FacSer);
      A428FacAlbTip = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A428FacAlbTip", GXutil.str( A428FacAlbTip, 1, 0));
      Z454FacSer = "" ;
      Z428FacAlbTip = (byte)(0) ;
      Z432FacDsc = "" ;
      Z447FacMts = DecimalUtil.ZERO ;
      Z449FacPreMts = DecimalUtil.ZERO ;
      Z444FacKgs = DecimalUtil.ZERO ;
      Z448FacPreKgs = DecimalUtil.ZERO ;
      Z3097FacTipPro = "" ;
      Z5353FacImpMan = DecimalUtil.ZERO ;
      Z12197FacUnds = 0 ;
      Z12198FacPreUnd = DecimalUtil.ZERO ;
      Z5355FacImpMin = DecimalUtil.ZERO ;
      Z3898FacPreKgsA = DecimalUtil.ZERO ;
      Z3897FacKgsA = DecimalUtil.ZERO ;
   }

   public void initAll1TW44( )
   {
      A446FacLin = 0 ;
      initializeNonKey1TW44( ) ;
   }

   public void standaloneModalInsert1TW44( )
   {
      A445FacLiC = i445FacLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      A454FacSer = i454FacSer ;
      httpContext.ajax_rsp_assign_attri("", false, "A454FacSer", A454FacSer);
      A428FacAlbTip = i428FacAlbTip ;
      httpContext.ajax_rsp_assign_attri("", false, "A428FacAlbTip", GXutil.str( A428FacAlbTip, 1, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415123467", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("facturacion/abonoscargos.js", "?202682415123468", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties44( )
   {
      edtFacLin_Enabled = defedtFacLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
   }

   public void startgridcontrol169( )
   {
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("GridName", "Gridlevel_abonoscargoslineas");
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Header", subGridlevel_abonoscargoslineas_Header);
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.rtrim( A432FacDsc));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacImpMan_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), ".", "")));
      Gridlevel_abonoscargoslineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddColumnProperties(Gridlevel_abonoscargoslineasColumn);
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_abonoscargoslineasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_abonoscargoslineas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtavTexto_fd_Internalname = "vTEXTO_FD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtFacCod_Internalname = "FACCOD" ;
      edtFacFch_Internalname = "FACFCH" ;
      edtFacHor_Internalname = "FACHOR" ;
      cmbFacEst.setInternalname( "FACEST" );
      edtFacSerNum_Internalname = "FACSERNUM" ;
      cmbFacTipFac.setInternalname( "FACTIPFAC" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockmeivaid_Internalname = "TEXTBLOCKMEIVAID" ;
      Combo_meivaid_Internalname = "COMBO_MEIVAID" ;
      edtMeivaId_Internalname = "MEIVAID" ;
      divTablesplittedmeivaid_Internalname = "TABLESPLITTEDMEIVAID" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtFacNumVto_Internalname = "FACNUMVTO" ;
      edtFacPer_Internalname = "FACPER" ;
      edtFacDiaPag_Internalname = "FACDIAPAG" ;
      lblTextblockfacfpg_Internalname = "TEXTBLOCKFACFPG" ;
      Combo_facfpg_Internalname = "COMBO_FACFPG" ;
      edtFacFpg_Internalname = "FACFPG" ;
      divTablesplittedfacfpg_Internalname = "TABLESPLITTEDFACFPG" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      edtFacImpTot_Internalname = "FACIMPTOT" ;
      edtFacDtoGen_Internalname = "FACDTOGEN" ;
      edtFacDto_Internalname = "FACDTO" ;
      edtFacImpGen_Internalname = "FACIMPGEN" ;
      edtFacImpPP_Internalname = "FACIMPPP" ;
      edtFacBasImp_Internalname = "FACBASIMP" ;
      edtFacIVAPor_Internalname = "FACIVAPOR" ;
      edtFacIVAImp_Internalname = "FACIVAIMP" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      edtFacFirma_Internalname = "FACFIRMA" ;
      edtFacObs_Internalname = "FACOBS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtFacLin_Internalname = "FACLIN" ;
      edtFacDsc_Internalname = "FACDSC" ;
      edtFacMts_Internalname = "FACMTS" ;
      edtFacPreMts_Internalname = "FACPREMTS" ;
      edtFacKgs_Internalname = "FACKGS" ;
      edtFacPreKgs_Internalname = "FACPREKGS" ;
      edtFacUnds_Internalname = "FACUNDS" ;
      edtFacPreUnd_Internalname = "FACPREUND" ;
      edtFacImpMan_Internalname = "FACIMPMAN" ;
      edtFacImp_Internalname = "FACIMP" ;
      divTableleaflevel_abonoscargoslineas_Internalname = "TABLELEAFLEVEL_ABONOSCARGOSLINEAS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavCombomeivaid_Internalname = "vCOMBOMEIVAID" ;
      divSectionattribute_meivaid_Internalname = "SECTIONATTRIBUTE_MEIVAID" ;
      edtavCombofacfpg_Internalname = "vCOMBOFACFPG" ;
      divSectionattribute_facfpg_Internalname = "SECTIONATTRIBUTE_FACFPG" ;
      edtFacPri_Internalname = "FACPRI" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_abonoscargoslineas_Internalname = "GRIDLEVEL_ABONOSCARGOSLINEAS" ;
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
      subGridlevel_abonoscargoslineas_Allowcollapsing = (byte)(0) ;
      subGridlevel_abonoscargoslineas_Allowselection = (byte)(0) ;
      subGridlevel_abonoscargoslineas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Abonos / Cargos", "") );
      edtFacImp_Jsonclick = "" ;
      edtFacImpMan_Jsonclick = "" ;
      edtFacPreUnd_Jsonclick = "" ;
      edtFacUnds_Jsonclick = "" ;
      edtFacPreKgs_Jsonclick = "" ;
      edtFacKgs_Jsonclick = "" ;
      edtFacPreMts_Jsonclick = "" ;
      edtFacMts_Jsonclick = "" ;
      edtFacDsc_Jsonclick = "" ;
      edtFacLin_Jsonclick = "" ;
      subGridlevel_abonoscargoslineas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_abonoscargoslineas_Backcolorstyle = (byte)(0) ;
      edtFacImp_Enabled = 0 ;
      edtFacImpMan_Visible = -1 ;
      edtFacImpMan_Enabled = 1 ;
      edtFacPreUnd_Enabled = 1 ;
      edtFacUnds_Enabled = 1 ;
      edtFacPreKgs_Enabled = 1 ;
      edtFacKgs_Enabled = 1 ;
      edtFacPreMts_Enabled = 1 ;
      edtFacMts_Enabled = 1 ;
      edtFacDsc_Enabled = 1 ;
      edtFacLin_Enabled = 1 ;
      edtFacPri_Jsonclick = "" ;
      edtFacPri_Enabled = 1 ;
      edtFacPri_Visible = 1 ;
      edtavCombofacfpg_Jsonclick = "" ;
      edtavCombofacfpg_Enabled = 0 ;
      edtavCombofacfpg_Visible = 1 ;
      edtavCombomeivaid_Jsonclick = "" ;
      edtavCombomeivaid_Enabled = 0 ;
      edtavCombomeivaid_Visible = 1 ;
      edtavComboclicod_Jsonclick = "" ;
      edtavComboclicod_Enabled = 0 ;
      edtavComboclicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFacObs_Enabled = 0 ;
      edtFacFirma_Enabled = 0 ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Hash", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      edtFacIVAImp_Jsonclick = "" ;
      edtFacIVAImp_Enabled = 0 ;
      edtFacIVAPor_Jsonclick = "" ;
      edtFacIVAPor_Enabled = 1 ;
      edtFacBasImp_Jsonclick = "" ;
      edtFacBasImp_Enabled = 0 ;
      edtFacImpPP_Jsonclick = "" ;
      edtFacImpPP_Enabled = 0 ;
      edtFacImpGen_Jsonclick = "" ;
      edtFacImpGen_Enabled = 0 ;
      edtFacDto_Jsonclick = "" ;
      edtFacDto_Enabled = 1 ;
      edtFacDtoGen_Jsonclick = "" ;
      edtFacDtoGen_Enabled = 1 ;
      edtFacImpTot_Jsonclick = "" ;
      edtFacImpTot_Enabled = 0 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Totales", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      edtFacFpg_Jsonclick = "" ;
      edtFacFpg_Enabled = 1 ;
      edtFacFpg_Visible = 1 ;
      Combo_facfpg_Emptyitemtext = "" ;
      Combo_facfpg_Cls = "ExtendedCombo AttributeFL" ;
      Combo_facfpg_Enabled = GXutil.toBoolean( -1) ;
      edtFacDiaPag_Jsonclick = "" ;
      edtFacDiaPag_Enabled = 1 ;
      edtFacPer_Jsonclick = "" ;
      edtFacPer_Enabled = 1 ;
      edtFacNumVto_Jsonclick = "" ;
      edtFacNumVto_Enabled = 1 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Formas de Pago", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      edtMeivaId_Jsonclick = "" ;
      edtMeivaId_Enabled = 1 ;
      edtMeivaId_Visible = 1 ;
      Combo_meivaid_Emptyitemtext = "" ;
      Combo_meivaid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_meivaid_Enabled = GXutil.toBoolean( -1) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Cliente", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      cmbFacTipFac.setJsonclick( "" );
      cmbFacTipFac.setEnabled( 0 );
      edtFacSerNum_Jsonclick = "" ;
      edtFacSerNum_Enabled = 0 ;
      cmbFacEst.setJsonclick( "" );
      cmbFacEst.setEnabled( 1 );
      edtFacHor_Jsonclick = "" ;
      edtFacHor_Enabled = 1 ;
      edtFacFch_Jsonclick = "" ;
      edtFacFch_Enabled = 1 ;
      edtFacCod_Jsonclick = "" ;
      edtFacCod_Enabled = 0 ;
      edtavTexto_fd_Jsonclick = "" ;
      edtavTexto_fd_Enabled = 0 ;
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

   public void gxasa53531TW43( String AV7EmprCod )
   {
      GXt_int1 = (byte)(0) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "FACIMM", ""), ""), GXv_int2) ;
      abonoscargos_impl.this.GXt_int1 = GXv_int2[0] ;
      edtFacImpMan_Visible = ((GXt_int1==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpMan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpMan_Visible), 5, 0), !bGXsfl_169_Refreshing);
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

   public void xc_59_1TW43( String A396EmprCod ,
                            String AV29ContCod ,
                            int A430FacCod ,
                            String Gx_mode )
   {
      if ( (0==A430FacCod) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char17[0] = AV29ContCod ;
         GXv_int10[0] = A430FacCod ;
         new app.pnumfac(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_int10) ;
         A396EmprCod = GXv_char18[0] ;
         AV29ContCod = GXv_char17[0] ;
         A430FacCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV29ContCod", AV29ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV29ContCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_60_1TW43( String A396EmprCod ,
                            int A430FacCod ,
                            String A450FacPri ,
                            byte A1150FacNumVto ,
                            String A1151FacPer ,
                            String A1152FacDiaPag ,
                            String A437FacFpg ,
                            java.math.BigDecimal A434FacDtoPP ,
                            java.math.BigDecimal A433FacDtoGen ,
                            byte A443FacIVAPor ,
                            java.math.BigDecimal A453FacRECPor ,
                            java.math.BigDecimal A14224FacCostFac )
   {
      if ( true /* After */ && true /* Level */ && ( ( A1150FacNumVto != O1150FacNumVto ) || ( GXutil.strcmp(A1151FacPer, O1151FacPer) != 0 ) || ( GXutil.strcmp(A1152FacDiaPag, O1152FacDiaPag) != 0 ) || ( GXutil.strcmp(A437FacFpg, O437FacFpg) != 0 ) || ( DecimalUtil.compareTo(A434FacDtoPP, O434FacDtoPP) != 0 ) || ( DecimalUtil.compareTo(A433FacDtoGen, O433FacDtoGen) != 0 ) || ( A443FacIVAPor != O443FacIVAPor ) || ( DecimalUtil.compareTo(A453FacRECPor, O453FacRECPor) != 0 ) ) || ( DecimalUtil.compareTo(A14224FacCostFac, O14224FacCostFac) != 0 ) )
      {
         new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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

   public void xc_61_1TW43( String A396EmprCod ,
                            int AV27FacCodX ,
                            java.util.Date AV28Facfch ,
                            String A450FacPri ,
                            short AV17FirmaD ,
                            int A430FacCod )
   {
      if ( ( AV17FirmaD == 1 ) && true /* After */ && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int2[0] = (byte)(0) ;
         GXv_int10[0] = AV27FacCodX ;
         GXv_date19[0] = AV28Facfch ;
         GXv_char17[0] = A450FacPri ;
         new app.pfacrecl(remoteHandle, context).execute( GXv_char18, GXv_int2, GXv_int10, GXv_date19, GXv_char17) ;
         A396EmprCod = GXv_char18[0] ;
         AV27FacCodX = GXv_int10[0] ;
         AV28Facfch = GXv_date19[0] ;
         A450FacPri = GXv_char17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV27FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27FacCodX), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28Facfch", localUtil.format(AV28Facfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV27FacCodX, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV28Facfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A450FacPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_72_1TW43( String Gx_mode ,
                            String A396EmprCod ,
                            String AV32Ser1 ,
                            String AV33Ser2 ,
                            String AV34Ser3 ,
                            String AV35Ser0 ,
                            String AV36Ser20 ,
                            String AV37Ser30 )
   {
      if ( isIns( )  )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char17[0] = AV32Ser1 ;
         GXv_char16[0] = AV33Ser2 ;
         GXv_char13[0] = AV34Ser3 ;
         GXv_char6[0] = AV35Ser0 ;
         GXv_char5[0] = AV36Ser20 ;
         GXv_char4[0] = AV37Ser30 ;
         new app.pnumser(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_char16, GXv_char13, GXv_char6, GXv_char5, GXv_char4) ;
         A396EmprCod = GXv_char18[0] ;
         AV32Ser1 = GXv_char17[0] ;
         AV33Ser2 = GXv_char16[0] ;
         AV34Ser3 = GXv_char13[0] ;
         AV35Ser0 = GXv_char6[0] ;
         AV36Ser20 = GXv_char5[0] ;
         AV37Ser30 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ser1", AV32Ser1);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ser2", AV33Ser2);
         httpContext.ajax_rsp_assign_attri("", false, "AV34Ser3", AV34Ser3);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Ser0", AV35Ser0);
         httpContext.ajax_rsp_assign_attri("", false, "AV36Ser20", AV36Ser20);
         httpContext.ajax_rsp_assign_attri("", false, "AV37Ser30", AV37Ser30);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV32Ser1))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33Ser2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34Ser3))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV35Ser0))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV36Ser20))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV37Ser30))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_80_1TW44( String A396EmprCod ,
                            int A430FacCod ,
                            java.math.BigDecimal A444FacKgs )
   {
      if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
      {
         new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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

   public void gxnrgridlevel_abonoscargoslineas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_16944( ) ;
      while ( nGXsfl_169_idx <= nRC_GXsfl_169 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TW44( ) ;
         standaloneModal1TW44( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TW44( ) ;
         nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_16944( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_abonoscargoslineasContainer)) ;
      /* End function gxnrGridlevel_abonoscargoslineas_newrow */
   }

   public void init_web_controls( )
   {
      cmbFacEst.setName( "FACEST" );
      cmbFacEst.setWebtags( "" );
      cmbFacEst.addItem("0", httpContext.getMessage( "Pdte. Imp.", ""), (short)(0));
      cmbFacEst.addItem("1", httpContext.getMessage( "Imp.", ""), (short)(0));
      cmbFacEst.addItem("2", httpContext.getMessage( "Act.", ""), (short)(0));
      if ( cmbFacEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A435FacEst) )
         {
            A435FacEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
         }
      }
      cmbFacTipFac.setName( "FACTIPFAC" );
      cmbFacTipFac.setWebtags( "" );
      cmbFacTipFac.addItem("1", httpContext.getMessage( "Abono", ""), (short)(0));
      cmbFacTipFac.addItem("2", httpContext.getMessage( "Cargo", ""), (short)(0));
      if ( cmbFacTipFac.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A1153FacTipFac) )
         {
            A1153FacTipFac = AV19FacTipFac ;
            httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
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

   public void valid_Faccod( )
   {
      n7209Colombia = false ;
      /* Using cursor T01TW41 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A3918FacImpTot1 = T01TW41_A3918FacImpTot1[0] ;
      }
      else
      {
         A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(35);
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      if ( A7209Colombia == 0 )
      {
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
         }
         else
         {
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( AV17FirmaD == 1 ) && true /* After */ && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int2[0] = (byte)(0) ;
         GXv_int10[0] = AV27FacCodX ;
         GXv_date19[0] = AV28Facfch ;
         GXv_char17[0] = A450FacPri ;
         new app.pfacrecl(remoteHandle, context).execute( GXv_char18, GXv_int2, GXv_int10, GXv_date19, GXv_char17) ;
         abonoscargos_impl.this.A396EmprCod = GXv_char18[0] ;
         A396EmprCod = this.A396EmprCod ;
         abonoscargos_impl.this.AV27FacCodX = GXv_int10[0] ;
         AV27FacCodX = this.AV27FacCodX ;
         abonoscargos_impl.this.AV28Facfch = GXv_date19[0] ;
         AV28Facfch = this.AV28Facfch ;
         abonoscargos_impl.this.A450FacPri = GXv_char17[0] ;
         A450FacPri = this.A450FacPri ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrim( localUtil.ntoc( A14218FacImpEng1, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrim( localUtil.ntoc( A14225FacImpEner, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrim( localUtil.ntoc( A3920FacImpPP1, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV27FacCodX", GXutil.ltrim( localUtil.ntoc( AV27FacCodX, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Facfch", localUtil.format(AV28Facfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", GXutil.rtrim( A450FacPri));
   }

   public void valid_Facest( )
   {
      A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValue())) ;
      if ( ( AV17FirmaD == 1 ) && ( A435FacEst > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Factura Impresa.NO se permite MODIFICACION.Activado FIRMA DIGITAL", ""), 1, "FACEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFacEst.getInternalname() ;
      }
      if ( ( A435FacEst > 1 ) && ( AV17FirmaD == 1 ) && true /* Level */ && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion delete NO permitida", ""), 1, "FACEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFacEst.getInternalname() ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Clicod( )
   {
      n3091CliDivTra = false ;
      n3140CliDivCod = false ;
      n3115FacDivCod = false ;
      n3096FacDivTCod = false ;
      n3116FacDivAbr = false ;
      n1360ZonGeoNom = false ;
      /* Using cursor T01TW36 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01TW36_A279CliNom[0] ;
      A3091CliDivTra = T01TW36_A3091CliDivTra[0] ;
      n3091CliDivTra = T01TW36_n3091CliDivTra[0] ;
      A3140CliDivCod = T01TW36_A3140CliDivCod[0] ;
      n3140CliDivCod = T01TW36_n3140CliDivCod[0] ;
      A858ZonGeoCod = T01TW36_A858ZonGeoCod[0] ;
      pr_default.close(31);
      if ( isIns( )  && (GXutil.strcmp("", A3096FacDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3096FacDivTCod = A3091CliDivTra ;
         n3096FacDivTCod = false ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_FacDivCod) )
      {
         A3115FacDivCod = AV13Insert_FacDivCod ;
         n3115FacDivCod = false ;
      }
      else
      {
         if ( isIns( )  && (0==A3115FacDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3115FacDivCod = A3140CliDivCod ;
            n3115FacDivCod = false ;
         }
      }
      /* Using cursor T01TW34 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (0==A3115FacDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivFac", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACDIVCOD");
            AnyError = (short)(1) ;
         }
      }
      A3116FacDivAbr = T01TW34_A3116FacDivAbr[0] ;
      n3116FacDivAbr = T01TW34_n3116FacDivAbr[0] ;
      pr_default.close(29);
      /* Using cursor T01TW38 */
      pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
      }
      A1360ZonGeoNom = T01TW38_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01TW38_n1360ZonGeoNom[0] ;
      pr_default.close(33);
      if ( isIns( )  && (0==A443FacIVAPor) && ( Gx_BScreen == 0 ) )
      {
         A443FacIVAPor = A588IvaPor ;
      }
      else
      {
         if ( isIns( )  && (0==A443FacIVAPor) && true /* After */ && ( A858ZonGeoCod != 999 ) )
         {
            A443FacIVAPor = A588IvaPor ;
         }
         else
         {
            if ( isIns( )  && true /* After */ && ( A858ZonGeoCod == 999 ) )
            {
               A443FacIVAPor = (byte)(0) ;
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", GXutil.rtrim( A3091CliDivTra));
      httpContext.ajax_rsp_assign_attri("", false, "A3140CliDivCod", GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", GXutil.rtrim( A3096FacDivTCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrim( localUtil.ntoc( A3115FacDivCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", GXutil.rtrim( A3116FacDivAbr));
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", GXutil.rtrim( A1360ZonGeoNom));
      httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrim( localUtil.ntoc( A443FacIVAPor, (byte)(2), (byte)(0), ".", "")));
   }

   public void valid_Meivaid( )
   {
      n11629MeivaId = false ;
      n11630MeivaDsc = false ;
      /* Using cursor T01TW37 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
      if ( (pr_default.getStatus(32) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11629MeivaId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOTIVOS EXENCION IVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MEIVAID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMeivaId_Internalname ;
         }
      }
      A11630MeivaDsc = T01TW37_A11630MeivaDsc[0] ;
      n11630MeivaDsc = T01TW37_n11630MeivaDsc[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11630MeivaDsc", A11630MeivaDsc);
   }

   public void valid_Facpri( )
   {
      n1718CliRecDGrl = false ;
      n1719CliRecDPag = false ;
      n1720CliRecDPpg = false ;
      n1721CliRecFpg = false ;
      n1722CliRecIVA = false ;
      n1723CliRecNVto = false ;
      n1724CliRecPrd = false ;
      /* Using cursor T01TW39 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A450FacPri});
      if ( (pr_default.getStatus(34) != 101) )
      {
         A1718CliRecDGrl = T01TW39_A1718CliRecDGrl[0] ;
         n1718CliRecDGrl = T01TW39_n1718CliRecDGrl[0] ;
         A1719CliRecDPag = T01TW39_A1719CliRecDPag[0] ;
         n1719CliRecDPag = T01TW39_n1719CliRecDPag[0] ;
         A1720CliRecDPpg = T01TW39_A1720CliRecDPpg[0] ;
         n1720CliRecDPpg = T01TW39_n1720CliRecDPpg[0] ;
         A1721CliRecFpg = T01TW39_A1721CliRecFpg[0] ;
         n1721CliRecFpg = T01TW39_n1721CliRecFpg[0] ;
         A1722CliRecIVA = T01TW39_A1722CliRecIVA[0] ;
         n1722CliRecIVA = T01TW39_n1722CliRecIVA[0] ;
         A1723CliRecNVto = T01TW39_A1723CliRecNVto[0] ;
         n1723CliRecNVto = T01TW39_n1723CliRecNVto[0] ;
         A1724CliRecPrd = T01TW39_A1724CliRecPrd[0] ;
         n1724CliRecPrd = T01TW39_n1724CliRecPrd[0] ;
      }
      else
      {
         A1724CliRecPrd = "" ;
         n1724CliRecPrd = false ;
         A1723CliRecNVto = (byte)(0) ;
         n1723CliRecNVto = false ;
         A1722CliRecIVA = "" ;
         n1722CliRecIVA = false ;
         A1721CliRecFpg = "" ;
         n1721CliRecFpg = false ;
         A1720CliRecDPpg = DecimalUtil.doubleToDec(0) ;
         n1720CliRecDPpg = false ;
         A1719CliRecDPag = "" ;
         n1719CliRecDPag = false ;
         A1718CliRecDGrl = DecimalUtil.doubleToDec(0) ;
         n1718CliRecDGrl = false ;
      }
      pr_default.close(34);
      if ( ! ( ( GXutil.strcmp(A450FacPri, "0") == 0 ) || ( GXutil.strcmp(A450FacPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "FacPri", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FACPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPri_Internalname ;
      }
      if ( ! (GXutil.strcmp("", AV33Ser2)==0) && isIns( )  && (0==A430FacCod) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         A2739FacSerNum = AV33Ser2 ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36Ser20)==0) && isIns( )  && (0==A430FacCod) && ( GXutil.strcmp(A450FacPri, "0") == 0 ) )
         {
            A2739FacSerNum = AV36Ser20 ;
         }
         else
         {
            if ( (GXutil.strcmp("", AV33Ser2)==0) && (GXutil.strcmp("", AV36Ser20)==0) && isIns( )  )
            {
               A2739FacSerNum = AV32Ser1 ;
            }
         }
      }
      O1150FacNumVto = A1150FacNumVto ;
      O1151FacPer = A1151FacPer ;
      O1152FacDiaPag = A1152FacDiaPag ;
      O437FacFpg = A437FacFpg ;
      O434FacDtoPP = A434FacDtoPP ;
      O433FacDtoGen = A433FacDtoGen ;
      O443FacIVAPor = A443FacIVAPor ;
      O453FacRECPor = A453FacRECPor ;
      O14224FacCostFac = A14224FacCostFac ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1718CliRecDGrl", GXutil.ltrim( localUtil.ntoc( A1718CliRecDGrl, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1719CliRecDPag", GXutil.rtrim( A1719CliRecDPag));
      httpContext.ajax_rsp_assign_attri("", false, "A1720CliRecDPpg", GXutil.ltrim( localUtil.ntoc( A1720CliRecDPpg, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1721CliRecFpg", GXutil.rtrim( A1721CliRecFpg));
      httpContext.ajax_rsp_assign_attri("", false, "A1722CliRecIVA", GXutil.rtrim( A1722CliRecIVA));
      httpContext.ajax_rsp_assign_attri("", false, "A1723CliRecNVto", GXutil.ltrim( localUtil.ntoc( A1723CliRecNVto, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1724CliRecPrd", GXutil.rtrim( A1724CliRecPrd));
      httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", GXutil.rtrim( A2739FacSerNum));
   }

   public void valid_Facpreund( )
   {
      A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2239FacIml", GXutil.ltrim( localUtil.ntoc( A2239FacIml, (byte)(16), (byte)(5), ".", "")));
   }

   public void valid_Facimpman( )
   {
      if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
      {
         A3923FacImp1 = A5355FacImpMin ;
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
         {
            A3923FacImp1 = A5353FacImpMan ;
         }
         else
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
            {
               A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A3923FacImp1 = A2239FacIml ;
            }
         }
      }
      A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrim( localUtil.ntoc( A3923FacImp1, (byte)(16), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A438FacImp", GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV19FacTipFac',fld:'vFACTIPFAC',pic:'9',hsh:true},{av:'AV38FacPri',fld:'vFACPRI',pic:'9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV38FacPri',fld:'vFACPRI',pic:'9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV19FacTipFac',fld:'vFACTIPFAC',pic:'9',hsh:true},{av:'A9605FacFirma',fld:'FACFIRMA',pic:''},{av:'AV37Ser30',fld:'vSER30',pic:''},{av:'AV36Ser20',fld:'vSER20',pic:''},{av:'AV35Ser0',fld:'vSER0',pic:''},{av:'AV34Ser3',fld:'vSER3',pic:''},{av:'AV33Ser2',fld:'vSER2',pic:''},{av:'AV32Ser1',fld:'vSER1',pic:''},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'A453FacRECPor',fld:'FACRECPOR',pic:'ZZ9.99'},{av:'A7210FacObs',fld:'FACOBS',pic:''},{av:'A965FacCob',fld:'FACCOB',pic:''},{av:'cmbFacTipFac'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A960FacIVACod',fld:'FACIVACOD',pic:'@!'},{av:'A9643FacLiq1',fld:'FACLIQ1',pic:'ZZZZZZZZZ9.99999'},{av:'A9644FacLiq2',fld:'FACLIQ2',pic:'ZZZZZZZZZ9.99999'},{av:'A9645FacIva1',fld:'FACIVA1',pic:'ZZZZZZZZZ9.99999'},{av:'A9646FacTot1',fld:'FACTOT1',pic:'ZZZZZZZZZ9.99999'},{av:'A14219FacEnergia',fld:'FACENERGIA',pic:'ZZ9.99'},{av:'A14224FacCostFac',fld:'FACCOSTFAC',pic:'ZZ9.99'},{av:'A14222FacCostMts',fld:'FACCOSTMTS',pic:'ZZZZZZ9.99'},{av:'A14223FacCostKgs',fld:'FACCOSTKGS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131TW2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED","{handler:'e121TW2',iparms:[{av:'Combo_clicod_Selectedvalue_get',ctrl:'COMBO_CLICOD',prop:'SelectedValue_get'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV38FacPri',fld:'vFACPRI',pic:'9',hsh:true}]");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED",",oparms:[{av:'AV31ComboCliCod',fld:'vCOMBOCLICOD',pic:'ZZZZZ9'},{av:'A1725FacRegIva',fld:'FACREGIVA',pic:'@!'},{av:'A434FacDtoPP',fld:'FACDTOPP',pic:'Z9.99'},{av:'A433FacDtoGen',fld:'FACDTOGEN',pic:'Z9.99'},{av:'A437FacFpg',fld:'FACFPG',pic:'@!'},{av:'A1152FacDiaPag',fld:'FACDIAPAG',pic:'999999'},{av:'A1151FacPer',fld:'FACPER',pic:'99999'},{av:'A1150FacNumVto',fld:'FACNUMVTO',pic:'Z9'},{av:'AV24ComboFacFpg',fld:'vCOMBOFACFPG',pic:'@!'},{av:'Combo_facfpg_Selectedvalue_set',ctrl:'COMBO_FACFPG',prop:'SelectedValue_set'}]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[{av:'AV17FirmaD',fld:'vFIRMAD',pic:'ZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A3918FacImpTot1',fld:'FACIMPTOT1',pic:'ZZZZZZZZZ9.99'},{av:'A14219FacEnergia',fld:'FACENERGIA',pic:'ZZ9.99'},{av:'A14218FacImpEng1',fld:'FACIMPENG1',pic:'ZZZZZZZ9.999'},{av:'A434FacDtoPP',fld:'FACDTOPP',pic:'Z9.99'},{av:'A3920FacImpPP1',fld:'FACIMPPP1',pic:'ZZZZZZZ9.999'},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'},{av:'A14225FacImpEner',fld:'FACIMPENER',pic:'ZZZZZZZ9.999'},{av:'A441FacImpTot',fld:'FACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV28Facfch',fld:'vFACFCH',pic:''},{av:'AV27FacCodX',fld:'vFACCODX',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_FACCOD",",oparms:[{av:'A3918FacImpTot1',fld:'FACIMPTOT1',pic:'ZZZZZZZZZ9.99'},{av:'A14218FacImpEng1',fld:'FACIMPENG1',pic:'ZZZZZZZ9.999'},{av:'A14225FacImpEner',fld:'FACIMPENER',pic:'ZZZZZZZ9.999'},{av:'A441FacImpTot',fld:'FACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'A3920FacImpPP1',fld:'FACIMPPP1',pic:'ZZZZZZZ9.999'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV27FacCodX',fld:'vFACCODX',pic:'ZZZZZZZ9'},{av:'AV28Facfch',fld:'vFACFCH',pic:''},{av:'A450FacPri',fld:'FACPRI',pic:'9'}]}");
      setEventMetadata("VALID_FACFCH","{handler:'valid_Facfch',iparms:[]");
      setEventMetadata("VALID_FACFCH",",oparms:[]}");
      setEventMetadata("VALID_FACEST","{handler:'valid_Facest',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17FirmaD',fld:'vFIRMAD',pic:'ZZZ9'},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'}]");
      setEventMetadata("VALID_FACEST",",oparms:[]}");
      setEventMetadata("VALID_FACTIPFAC","{handler:'valid_Factipfac',iparms:[]");
      setEventMetadata("VALID_FACTIPFAC",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV13Insert_FacDivCod',fld:'vINSERT_FACDIVCOD',pic:'Z9'},{av:'A3140CliDivCod',fld:'CLIDIVCOD',pic:'Z9'},{av:'A3115FacDivCod',fld:'FACDIVCOD',pic:'Z9'},{av:'A858ZonGeoCod',fld:'ZONGEOCOD',pic:'ZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A3096FacDivTCod',fld:'FACDIVTCOD',pic:''},{av:'A3116FacDivAbr',fld:'FACDIVABR',pic:''},{av:'A1360ZonGeoNom',fld:'ZONGEONOM',pic:''},{av:'A443FacIVAPor',fld:'FACIVAPOR',pic:'Z9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'A3140CliDivCod',fld:'CLIDIVCOD',pic:'Z9'},{av:'A858ZonGeoCod',fld:'ZONGEOCOD',pic:'ZZ9'},{av:'A3096FacDivTCod',fld:'FACDIVTCOD',pic:''},{av:'A3115FacDivCod',fld:'FACDIVCOD',pic:'Z9'},{av:'A3116FacDivAbr',fld:'FACDIVABR',pic:''},{av:'A1360ZonGeoNom',fld:'ZONGEONOM',pic:''},{av:'A443FacIVAPor',fld:'FACIVAPOR',pic:'Z9'}]}");
      setEventMetadata("VALID_MEIVAID","{handler:'valid_Meivaid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11629MeivaId',fld:'MEIVAID',pic:''},{av:'A11630MeivaDsc',fld:'MEIVADSC',pic:''}]");
      setEventMetadata("VALID_MEIVAID",",oparms:[{av:'A11630MeivaDsc',fld:'MEIVADSC',pic:''}]}");
      setEventMetadata("VALID_FACNUMVTO","{handler:'valid_Facnumvto',iparms:[]");
      setEventMetadata("VALID_FACNUMVTO",",oparms:[]}");
      setEventMetadata("VALID_FACPER","{handler:'valid_Facper',iparms:[]");
      setEventMetadata("VALID_FACPER",",oparms:[]}");
      setEventMetadata("VALID_FACDIAPAG","{handler:'valid_Facdiapag',iparms:[]");
      setEventMetadata("VALID_FACDIAPAG",",oparms:[]}");
      setEventMetadata("VALID_FACFPG","{handler:'valid_Facfpg',iparms:[]");
      setEventMetadata("VALID_FACFPG",",oparms:[]}");
      setEventMetadata("VALID_FACIMPTOT","{handler:'valid_Facimptot',iparms:[]");
      setEventMetadata("VALID_FACIMPTOT",",oparms:[]}");
      setEventMetadata("VALID_FACDTOGEN","{handler:'valid_Facdtogen',iparms:[]");
      setEventMetadata("VALID_FACDTOGEN",",oparms:[]}");
      setEventMetadata("VALID_FACIMPGEN","{handler:'valid_Facimpgen',iparms:[]");
      setEventMetadata("VALID_FACIMPGEN",",oparms:[]}");
      setEventMetadata("VALID_FACIMPPP","{handler:'valid_Facimppp',iparms:[]");
      setEventMetadata("VALID_FACIMPPP",",oparms:[]}");
      setEventMetadata("VALID_FACBASIMP","{handler:'valid_Facbasimp',iparms:[]");
      setEventMetadata("VALID_FACBASIMP",",oparms:[]}");
      setEventMetadata("VALID_FACIVAPOR","{handler:'valid_Facivapor',iparms:[]");
      setEventMetadata("VALID_FACIVAPOR",",oparms:[]}");
      setEventMetadata("VALID_FACIVAIMP","{handler:'valid_Facivaimp',iparms:[]");
      setEventMetadata("VALID_FACIVAIMP",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOMEIVAID","{handler:'validv_Combomeivaid',iparms:[]");
      setEventMetadata("VALIDV_COMBOMEIVAID",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOFACFPG","{handler:'validv_Combofacfpg',iparms:[]");
      setEventMetadata("VALIDV_COMBOFACFPG",",oparms:[]}");
      setEventMetadata("VALID_FACPRI","{handler:'valid_Facpri',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A14224FacCostFac',fld:'FACCOSTFAC',pic:'ZZ9.99'},{av:'A453FacRECPor',fld:'FACRECPOR',pic:'ZZ9.99'},{av:'A443FacIVAPor',fld:'FACIVAPOR',pic:'Z9'},{av:'A433FacDtoGen',fld:'FACDTOGEN',pic:'Z9.99'},{av:'A434FacDtoPP',fld:'FACDTOPP',pic:'Z9.99'},{av:'A437FacFpg',fld:'FACFPG',pic:'@!'},{av:'A1152FacDiaPag',fld:'FACDIAPAG',pic:'999999'},{av:'A1151FacPer',fld:'FACPER',pic:'99999'},{av:'A1150FacNumVto',fld:'FACNUMVTO',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'AV33Ser2',fld:'vSER2',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV36Ser20',fld:'vSER20',pic:''},{av:'AV32Ser1',fld:'vSER1',pic:''},{av:'A1718CliRecDGrl',fld:'CLIRECDGRL',pic:'ZZ9.99'},{av:'A1719CliRecDPag',fld:'CLIRECDPAG',pic:'999999'},{av:'A1720CliRecDPpg',fld:'CLIRECDPPG',pic:'ZZ9.99'},{av:'A1721CliRecFpg',fld:'CLIRECFPG',pic:'@!'},{av:'A1722CliRecIVA',fld:'CLIRECIVA',pic:'@!'},{av:'A1723CliRecNVto',fld:'CLIRECNVTO',pic:'Z9'},{av:'A1724CliRecPrd',fld:'CLIRECPRD',pic:'99999'},{av:'A2739FacSerNum',fld:'FACSERNUM',pic:''}]");
      setEventMetadata("VALID_FACPRI",",oparms:[{av:'A1718CliRecDGrl',fld:'CLIRECDGRL',pic:'ZZ9.99'},{av:'A1719CliRecDPag',fld:'CLIRECDPAG',pic:'999999'},{av:'A1720CliRecDPpg',fld:'CLIRECDPPG',pic:'ZZ9.99'},{av:'A1721CliRecFpg',fld:'CLIRECFPG',pic:'@!'},{av:'A1722CliRecIVA',fld:'CLIRECIVA',pic:'@!'},{av:'A1723CliRecNVto',fld:'CLIRECNVTO',pic:'Z9'},{av:'A1724CliRecPrd',fld:'CLIRECPRD',pic:'99999'},{av:'A2739FacSerNum',fld:'FACSERNUM',pic:''}]}");
      setEventMetadata("VALID_FACLIN","{handler:'valid_Faclin',iparms:[]");
      setEventMetadata("VALID_FACLIN",",oparms:[]}");
      setEventMetadata("VALID_FACMTS","{handler:'valid_Facmts',iparms:[]");
      setEventMetadata("VALID_FACMTS",",oparms:[]}");
      setEventMetadata("VALID_FACPREMTS","{handler:'valid_Facpremts',iparms:[]");
      setEventMetadata("VALID_FACPREMTS",",oparms:[]}");
      setEventMetadata("VALID_FACKGS","{handler:'valid_Fackgs',iparms:[]");
      setEventMetadata("VALID_FACKGS",",oparms:[]}");
      setEventMetadata("VALID_FACPREKGS","{handler:'valid_Facprekgs',iparms:[]");
      setEventMetadata("VALID_FACPREKGS",",oparms:[]}");
      setEventMetadata("VALID_FACUNDS","{handler:'valid_Facunds',iparms:[]");
      setEventMetadata("VALID_FACUNDS",",oparms:[]}");
      setEventMetadata("VALID_FACPREUND","{handler:'valid_Facpreund',iparms:[{av:'A448FacPreKgs',fld:'FACPREKGS',pic:'ZZZZZZ9.999'},{av:'A444FacKgs',fld:'FACKGS',pic:'ZZZZZ9.99'},{av:'A449FacPreMts',fld:'FACPREMTS',pic:'ZZZZZZ9.999'},{av:'A447FacMts',fld:'FACMTS',pic:'ZZZZZ9.99'},{av:'A3898FacPreKgsA',fld:'FACPREKGSA',pic:'ZZZZZZ9.999'},{av:'A3897FacKgsA',fld:'FACKGSA',pic:'ZZZZZ9.99'},{av:'A12197FacUnds',fld:'FACUNDS',pic:'ZZZZZ9'},{av:'A12198FacPreUnd',fld:'FACPREUND',pic:'ZZZZZZ9.99999'},{av:'A2239FacIml',fld:'FACIML',pic:'ZZZZZZZZZ9.99999'}]");
      setEventMetadata("VALID_FACPREUND",",oparms:[{av:'A2239FacIml',fld:'FACIML',pic:'ZZZZZZZZZ9.99999'}]}");
      setEventMetadata("VALID_FACIMPMAN","{handler:'valid_Facimpman',iparms:[{av:'A5355FacImpMin',fld:'FACIMPMIN',pic:'ZZZZZZZ9.99'},{av:'A2239FacIml',fld:'FACIML',pic:'ZZZZZZZZZ9.99999'},{av:'A448FacPreKgs',fld:'FACPREKGS',pic:'ZZZZZZ9.999'},{av:'A444FacKgs',fld:'FACKGS',pic:'ZZZZZ9.99'},{av:'A447FacMts',fld:'FACMTS',pic:'ZZZZZ9.99'},{av:'A5353FacImpMan',fld:'FACIMPMAN',pic:'ZZZZZZZ9.99'},{av:'A449FacPreMts',fld:'FACPREMTS',pic:'ZZZZZZ9.999'},{av:'A12198FacPreUnd',fld:'FACPREUND',pic:'ZZZZZZ9.99999'},{av:'A3923FacImp1',fld:'FACIMP1',pic:'ZZZZZZZZZ9.99999'},{av:'A438FacImp',fld:'FACIMP',pic:'ZZZZZZZZZZ9.99'}]");
      setEventMetadata("VALID_FACIMPMAN",",oparms:[{av:'A3923FacImp1',fld:'FACIMP1',pic:'ZZZZZZZZZ9.99999'},{av:'A438FacImp',fld:'FACIMP',pic:'ZZZZZZZZZZ9.99'}]}");
      setEventMetadata("NULL","{handler:'valid_Facimp',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(32);
      pr_default.close(31);
      pr_default.close(29);
      pr_default.close(33);
      pr_default.close(34);
      pr_default.close(35);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV38FacPri = "" ;
      Z396EmprCod = "" ;
      Z437FacFpg = "" ;
      Z436FacFch = GXutil.nullDate() ;
      Z450FacPri = "" ;
      Z433FacDtoGen = DecimalUtil.ZERO ;
      Z434FacDtoPP = DecimalUtil.ZERO ;
      Z1725FacRegIva = "" ;
      Z453FacRECPor = DecimalUtil.ZERO ;
      Z6632FacDto = DecimalUtil.ZERO ;
      Z965FacCob = "" ;
      Z1151FacPer = "" ;
      Z1152FacDiaPag = "" ;
      Z960FacIVACod = "" ;
      Z2739FacSerNum = "" ;
      Z3096FacDivTCod = "" ;
      Z9605FacFirma = "" ;
      Z9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Z9643FacLiq1 = DecimalUtil.ZERO ;
      Z9644FacLiq2 = DecimalUtil.ZERO ;
      Z9645FacIva1 = DecimalUtil.ZERO ;
      Z9646FacTot1 = DecimalUtil.ZERO ;
      Z14219FacEnergia = DecimalUtil.ZERO ;
      Z14224FacCostFac = DecimalUtil.ZERO ;
      Z14222FacCostMts = DecimalUtil.ZERO ;
      Z14223FacCostKgs = DecimalUtil.ZERO ;
      Z3119FacRepCod = "" ;
      Z11629MeivaId = "" ;
      Z7212FacRect = DecimalUtil.ZERO ;
      Z8346FacRecI = DecimalUtil.ZERO ;
      Z11513FacRecIca = DecimalUtil.ZERO ;
      O1151FacPer = "" ;
      O1152FacDiaPag = "" ;
      O437FacFpg = "" ;
      O434FacDtoPP = DecimalUtil.ZERO ;
      O433FacDtoGen = DecimalUtil.ZERO ;
      O453FacRECPor = DecimalUtil.ZERO ;
      O14224FacCostFac = DecimalUtil.ZERO ;
      N3119FacRepCod = "" ;
      N11629MeivaId = "" ;
      Combo_facfpg_Selectedvalue_get = "" ;
      Combo_meivaid_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      Z454FacSer = "" ;
      Z432FacDsc = "" ;
      Z447FacMts = DecimalUtil.ZERO ;
      Z449FacPreMts = DecimalUtil.ZERO ;
      Z444FacKgs = DecimalUtil.ZERO ;
      Z448FacPreKgs = DecimalUtil.ZERO ;
      Z3097FacTipPro = "" ;
      Z5353FacImpMan = DecimalUtil.ZERO ;
      Z12198FacPreUnd = DecimalUtil.ZERO ;
      Z5355FacImpMin = DecimalUtil.ZERO ;
      Z3898FacPreKgsA = DecimalUtil.ZERO ;
      Z3897FacKgsA = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV29ContCod = "" ;
      Gx_mode = "" ;
      A450FacPri = "" ;
      A1151FacPer = "" ;
      A1152FacDiaPag = "" ;
      A437FacFpg = "" ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      AV28Facfch = GXutil.nullDate() ;
      AV32Ser1 = "" ;
      AV33Ser2 = "" ;
      AV34Ser3 = "" ;
      AV35Ser0 = "" ;
      AV36Ser20 = "" ;
      AV37Ser30 = "" ;
      A444FacKgs = DecimalUtil.ZERO ;
      AV7EmprCod = "" ;
      A3119FacRepCod = "" ;
      A11629MeivaId = "" ;
      AV38FacPri = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      AV21Texto_fd = "" ;
      TempTags = "" ;
      A436FacFch = GXutil.nullDate() ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A2739FacSerNum = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      AV30CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockmeivaid_Jsonclick = "" ;
      ucCombo_meivaid = new com.genexus.webpanels.GXUserControl();
      Combo_meivaid_Caption = "" ;
      AV25MeivaId_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      lblTextblockfacfpg_Jsonclick = "" ;
      ucCombo_facfpg = new com.genexus.webpanels.GXUserControl();
      Combo_facfpg_Caption = "" ;
      AV22FacFpg_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      A441FacImpTot = DecimalUtil.ZERO ;
      A6632FacDto = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A9605FacFirma = "" ;
      A7210FacObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV47Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV26ComboMeivaId = "" ;
      AV24ComboFacFpg = "" ;
      Gridlevel_abonoscargoslineasContainer = new com.genexus.webpanels.GXWebGrid(context);
      B1151FacPer = "" ;
      B1152FacDiaPag = "" ;
      B437FacFpg = "" ;
      B434FacDtoPP = DecimalUtil.ZERO ;
      B433FacDtoGen = DecimalUtil.ZERO ;
      B453FacRECPor = DecimalUtil.ZERO ;
      B14224FacCostFac = DecimalUtil.ZERO ;
      sMode44 = "" ;
      sStyleString = "" ;
      A1725FacRegIva = "" ;
      A965FacCob = "" ;
      A960FacIVACod = "" ;
      A3096FacDivTCod = "" ;
      A9643FacLiq1 = DecimalUtil.ZERO ;
      A9644FacLiq2 = DecimalUtil.ZERO ;
      A9645FacIva1 = DecimalUtil.ZERO ;
      A9646FacTot1 = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14225FacImpEner = DecimalUtil.ZERO ;
      AV14Insert_FacRepCod = "" ;
      AV15Insert_MeivaId = "" ;
      A953IvaCod = "" ;
      A3091CliDivTra = "" ;
      A589IvaRec = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A3120FacRepNom = "" ;
      A279CliNom = "" ;
      A11630MeivaDsc = "" ;
      A3116FacDivAbr = "" ;
      A1360ZonGeoNom = "" ;
      A1718CliRecDGrl = DecimalUtil.ZERO ;
      A1719CliRecDPag = "" ;
      A1720CliRecDPpg = DecimalUtil.ZERO ;
      A1721CliRecFpg = "" ;
      A1722CliRecIVA = "" ;
      A1724CliRecPrd = "" ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A454FacSer = "" ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3097FacTipPro = "" ;
      Combo_clicod_Objectcall = "" ;
      Combo_clicod_Class = "" ;
      Combo_clicod_Icontype = "" ;
      Combo_clicod_Icon = "" ;
      Combo_clicod_Tooltip = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_Selectedtext_set = "" ;
      Combo_clicod_Selectedtext_get = "" ;
      Combo_clicod_Gamoauthtoken = "" ;
      Combo_clicod_Ddointernalname = "" ;
      Combo_clicod_Titlecontrolalign = "" ;
      Combo_clicod_Dropdownoptionstype = "" ;
      Combo_clicod_Titlecontrolidtoreplace = "" ;
      Combo_clicod_Datalisttype = "" ;
      Combo_clicod_Datalistfixedvalues = "" ;
      Combo_clicod_Datalistproc = "" ;
      Combo_clicod_Datalistprocparametersprefix = "" ;
      Combo_clicod_Remoteservicesparameters = "" ;
      Combo_clicod_Htmltemplate = "" ;
      Combo_clicod_Multiplevaluestype = "" ;
      Combo_clicod_Loadingdata = "" ;
      Combo_clicod_Noresultsfound = "" ;
      Combo_clicod_Emptyitemtext = "" ;
      Combo_clicod_Onlyselectedvalues = "" ;
      Combo_clicod_Selectalltext = "" ;
      Combo_clicod_Multiplevaluesseparator = "" ;
      Combo_clicod_Addnewoptiontext = "" ;
      Combo_meivaid_Objectcall = "" ;
      Combo_meivaid_Class = "" ;
      Combo_meivaid_Icontype = "" ;
      Combo_meivaid_Icon = "" ;
      Combo_meivaid_Tooltip = "" ;
      Combo_meivaid_Selectedvalue_set = "" ;
      Combo_meivaid_Selectedtext_set = "" ;
      Combo_meivaid_Selectedtext_get = "" ;
      Combo_meivaid_Gamoauthtoken = "" ;
      Combo_meivaid_Ddointernalname = "" ;
      Combo_meivaid_Titlecontrolalign = "" ;
      Combo_meivaid_Dropdownoptionstype = "" ;
      Combo_meivaid_Titlecontrolidtoreplace = "" ;
      Combo_meivaid_Datalisttype = "" ;
      Combo_meivaid_Datalistfixedvalues = "" ;
      Combo_meivaid_Datalistproc = "" ;
      Combo_meivaid_Datalistprocparametersprefix = "" ;
      Combo_meivaid_Remoteservicesparameters = "" ;
      Combo_meivaid_Htmltemplate = "" ;
      Combo_meivaid_Multiplevaluestype = "" ;
      Combo_meivaid_Loadingdata = "" ;
      Combo_meivaid_Noresultsfound = "" ;
      Combo_meivaid_Onlyselectedvalues = "" ;
      Combo_meivaid_Selectalltext = "" ;
      Combo_meivaid_Multiplevaluesseparator = "" ;
      Combo_meivaid_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Combo_facfpg_Objectcall = "" ;
      Combo_facfpg_Class = "" ;
      Combo_facfpg_Icontype = "" ;
      Combo_facfpg_Icon = "" ;
      Combo_facfpg_Tooltip = "" ;
      Combo_facfpg_Selectedvalue_set = "" ;
      Combo_facfpg_Selectedtext_set = "" ;
      Combo_facfpg_Selectedtext_get = "" ;
      Combo_facfpg_Gamoauthtoken = "" ;
      Combo_facfpg_Ddointernalname = "" ;
      Combo_facfpg_Titlecontrolalign = "" ;
      Combo_facfpg_Dropdownoptionstype = "" ;
      Combo_facfpg_Titlecontrolidtoreplace = "" ;
      Combo_facfpg_Datalisttype = "" ;
      Combo_facfpg_Datalistfixedvalues = "" ;
      Combo_facfpg_Datalistproc = "" ;
      Combo_facfpg_Datalistprocparametersprefix = "" ;
      Combo_facfpg_Remoteservicesparameters = "" ;
      Combo_facfpg_Htmltemplate = "" ;
      Combo_facfpg_Multiplevaluestype = "" ;
      Combo_facfpg_Loadingdata = "" ;
      Combo_facfpg_Noresultsfound = "" ;
      Combo_facfpg_Onlyselectedvalues = "" ;
      Combo_facfpg_Selectalltext = "" ;
      Combo_facfpg_Multiplevaluesseparator = "" ;
      Combo_facfpg_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_unnamedtable5_Objectcall = "" ;
      Dvpanel_unnamedtable5_Class = "" ;
      Dvpanel_unnamedtable5_Height = "" ;
      Dvpanel_unnamedtable6_Objectcall = "" ;
      Dvpanel_unnamedtable6_Class = "" ;
      Dvpanel_unnamedtable6_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode43 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A432FacDsc = "" ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      AV18ContDsc = "" ;
      AV48Station = "" ;
      GXt_char3 = "" ;
      AV49Emprnom = "" ;
      AV50Usurcod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV16TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV40Cadena = "" ;
      AV41firma = "" ;
      AV45Hash = "" ;
      AV42Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message8 = new GXBaseCollection[1] ;
      GXv_boolean9 = new boolean[1] ;
      AV44Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV23ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item15 = new GXBaseCollection[1] ;
      Z7210FacObs = "" ;
      Z3116FacDivAbr = "" ;
      Z407EmprNom = "" ;
      Z953IvaCod = "" ;
      Z589IvaRec = DecimalUtil.ZERO ;
      Z3120FacRepNom = "" ;
      Z3918FacImpTot1 = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z3091CliDivTra = "" ;
      Z1360ZonGeoNom = "" ;
      Z1718CliRecDGrl = DecimalUtil.ZERO ;
      Z1719CliRecDPag = "" ;
      Z1720CliRecDPpg = DecimalUtil.ZERO ;
      Z1721CliRecFpg = "" ;
      Z1722CliRecIVA = "" ;
      Z1724CliRecPrd = "" ;
      Z11630MeivaDsc = "" ;
      T01TW6_A407EmprNom = new String[] {""} ;
      T01TW6_n407EmprNom = new boolean[] {false} ;
      T01TW6_A7209Colombia = new byte[1] ;
      T01TW6_n7209Colombia = new boolean[] {false} ;
      T01TW6_A953IvaCod = new String[] {""} ;
      T01TW6_n953IvaCod = new boolean[] {false} ;
      T01TW12_A588IvaPor = new byte[1] ;
      T01TW12_n588IvaPor = new boolean[] {false} ;
      T01TW12_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW12_n589IvaRec = new boolean[] {false} ;
      T01TW16_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW7_A3120FacRepNom = new String[] {""} ;
      T01TW7_n3120FacRepNom = new boolean[] {false} ;
      T01TW8_A279CliNom = new String[] {""} ;
      T01TW8_A3091CliDivTra = new String[] {""} ;
      T01TW8_n3091CliDivTra = new boolean[] {false} ;
      T01TW8_A3140CliDivCod = new byte[1] ;
      T01TW8_n3140CliDivCod = new boolean[] {false} ;
      T01TW8_A858ZonGeoCod = new short[1] ;
      T01TW13_A1360ZonGeoNom = new String[] {""} ;
      T01TW13_n1360ZonGeoNom = new boolean[] {false} ;
      T01TW10_A11630MeivaDsc = new String[] {""} ;
      T01TW10_n11630MeivaDsc = new boolean[] {false} ;
      T01TW14_A1718CliRecDGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW14_n1718CliRecDGrl = new boolean[] {false} ;
      T01TW14_A1719CliRecDPag = new String[] {""} ;
      T01TW14_n1719CliRecDPag = new boolean[] {false} ;
      T01TW14_A1720CliRecDPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW14_n1720CliRecDPpg = new boolean[] {false} ;
      T01TW14_A1721CliRecFpg = new String[] {""} ;
      T01TW14_n1721CliRecFpg = new boolean[] {false} ;
      T01TW14_A1722CliRecIVA = new String[] {""} ;
      T01TW14_n1722CliRecIVA = new boolean[] {false} ;
      T01TW14_A1723CliRecNVto = new byte[1] ;
      T01TW14_n1723CliRecNVto = new boolean[] {false} ;
      T01TW14_A1724CliRecPrd = new String[] {""} ;
      T01TW14_n1724CliRecPrd = new boolean[] {false} ;
      T01TW18_A7210FacObs = new String[] {""} ;
      T01TW18_A297CliPri = new String[] {""} ;
      T01TW18_A430FacCod = new int[1] ;
      T01TW18_A437FacFpg = new String[] {""} ;
      T01TW18_A443FacIVAPor = new byte[1] ;
      T01TW18_A407EmprNom = new String[] {""} ;
      T01TW18_n407EmprNom = new boolean[] {false} ;
      T01TW18_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TW18_A450FacPri = new String[] {""} ;
      T01TW18_A279CliNom = new String[] {""} ;
      T01TW18_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A588IvaPor = new byte[1] ;
      T01TW18_n588IvaPor = new boolean[] {false} ;
      T01TW18_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_n589IvaRec = new boolean[] {false} ;
      T01TW18_A1725FacRegIva = new String[] {""} ;
      T01TW18_n1725FacRegIva = new boolean[] {false} ;
      T01TW18_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A6632FacDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A435FacEst = new byte[1] ;
      T01TW18_A445FacLiC = new int[1] ;
      T01TW18_A965FacCob = new String[] {""} ;
      T01TW18_A1150FacNumVto = new byte[1] ;
      T01TW18_A1151FacPer = new String[] {""} ;
      T01TW18_A1152FacDiaPag = new String[] {""} ;
      T01TW18_A1153FacTipFac = new byte[1] ;
      T01TW18_A960FacIVACod = new String[] {""} ;
      T01TW18_A2739FacSerNum = new String[] {""} ;
      T01TW18_A3091CliDivTra = new String[] {""} ;
      T01TW18_n3091CliDivTra = new boolean[] {false} ;
      T01TW18_A3116FacDivAbr = new String[] {""} ;
      T01TW18_n3116FacDivAbr = new boolean[] {false} ;
      T01TW18_A3096FacDivTCod = new String[] {""} ;
      T01TW18_n3096FacDivTCod = new boolean[] {false} ;
      T01TW18_A3120FacRepNom = new String[] {""} ;
      T01TW18_n3120FacRepNom = new boolean[] {false} ;
      T01TW18_A9605FacFirma = new String[] {""} ;
      T01TW18_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01TW18_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A1360ZonGeoNom = new String[] {""} ;
      T01TW18_n1360ZonGeoNom = new boolean[] {false} ;
      T01TW18_A11630MeivaDsc = new String[] {""} ;
      T01TW18_n11630MeivaDsc = new boolean[] {false} ;
      T01TW18_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A7209Colombia = new byte[1] ;
      T01TW18_n7209Colombia = new boolean[] {false} ;
      T01TW18_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A396EmprCod = new String[] {""} ;
      T01TW18_A3119FacRepCod = new String[] {""} ;
      T01TW18_n3119FacRepCod = new boolean[] {false} ;
      T01TW18_A252CliCod = new int[1] ;
      T01TW18_A11629MeivaId = new String[] {""} ;
      T01TW18_n11629MeivaId = new boolean[] {false} ;
      T01TW18_A3115FacDivCod = new byte[1] ;
      T01TW18_n3115FacDivCod = new boolean[] {false} ;
      T01TW18_A953IvaCod = new String[] {""} ;
      T01TW18_n953IvaCod = new boolean[] {false} ;
      T01TW18_A3140CliDivCod = new byte[1] ;
      T01TW18_n3140CliDivCod = new boolean[] {false} ;
      T01TW18_A858ZonGeoCod = new short[1] ;
      T01TW18_A1718CliRecDGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_n1718CliRecDGrl = new boolean[] {false} ;
      T01TW18_A1719CliRecDPag = new String[] {""} ;
      T01TW18_n1719CliRecDPag = new boolean[] {false} ;
      T01TW18_A1720CliRecDPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_n1720CliRecDPpg = new boolean[] {false} ;
      T01TW18_A1721CliRecFpg = new String[] {""} ;
      T01TW18_n1721CliRecFpg = new boolean[] {false} ;
      T01TW18_A1722CliRecIVA = new String[] {""} ;
      T01TW18_n1722CliRecIVA = new boolean[] {false} ;
      T01TW18_A1723CliRecNVto = new byte[1] ;
      T01TW18_n1723CliRecNVto = new boolean[] {false} ;
      T01TW18_A1724CliRecPrd = new String[] {""} ;
      T01TW18_n1724CliRecPrd = new boolean[] {false} ;
      T01TW18_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW18_n8346FacRecI = new boolean[] {false} ;
      T01TW18_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW11_A3116FacDivAbr = new String[] {""} ;
      T01TW11_n3116FacDivAbr = new boolean[] {false} ;
      T01TW9_A3073RepCod = new String[] {""} ;
      T01TW19_A3120FacRepNom = new String[] {""} ;
      T01TW19_n3120FacRepNom = new boolean[] {false} ;
      T01TW20_A279CliNom = new String[] {""} ;
      T01TW20_A3091CliDivTra = new String[] {""} ;
      T01TW20_n3091CliDivTra = new boolean[] {false} ;
      T01TW20_A3140CliDivCod = new byte[1] ;
      T01TW20_n3140CliDivCod = new boolean[] {false} ;
      T01TW20_A858ZonGeoCod = new short[1] ;
      T01TW21_A3116FacDivAbr = new String[] {""} ;
      T01TW21_n3116FacDivAbr = new boolean[] {false} ;
      T01TW22_A3073RepCod = new String[] {""} ;
      T01TW23_A11630MeivaDsc = new String[] {""} ;
      T01TW23_n11630MeivaDsc = new boolean[] {false} ;
      T01TW24_A1360ZonGeoNom = new String[] {""} ;
      T01TW24_n1360ZonGeoNom = new boolean[] {false} ;
      T01TW25_A1718CliRecDGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW25_n1718CliRecDGrl = new boolean[] {false} ;
      T01TW25_A1719CliRecDPag = new String[] {""} ;
      T01TW25_n1719CliRecDPag = new boolean[] {false} ;
      T01TW25_A1720CliRecDPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW25_n1720CliRecDPpg = new boolean[] {false} ;
      T01TW25_A1721CliRecFpg = new String[] {""} ;
      T01TW25_n1721CliRecFpg = new boolean[] {false} ;
      T01TW25_A1722CliRecIVA = new String[] {""} ;
      T01TW25_n1722CliRecIVA = new boolean[] {false} ;
      T01TW25_A1723CliRecNVto = new byte[1] ;
      T01TW25_n1723CliRecNVto = new boolean[] {false} ;
      T01TW25_A1724CliRecPrd = new String[] {""} ;
      T01TW25_n1724CliRecPrd = new boolean[] {false} ;
      T01TW27_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW28_A396EmprCod = new String[] {""} ;
      T01TW28_A430FacCod = new int[1] ;
      T01TW5_A7210FacObs = new String[] {""} ;
      T01TW5_A430FacCod = new int[1] ;
      T01TW5_A437FacFpg = new String[] {""} ;
      T01TW5_A443FacIVAPor = new byte[1] ;
      T01TW5_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TW5_A450FacPri = new String[] {""} ;
      T01TW5_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A1725FacRegIva = new String[] {""} ;
      T01TW5_n1725FacRegIva = new boolean[] {false} ;
      T01TW5_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A6632FacDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A435FacEst = new byte[1] ;
      T01TW5_A445FacLiC = new int[1] ;
      T01TW5_A965FacCob = new String[] {""} ;
      T01TW5_A1150FacNumVto = new byte[1] ;
      T01TW5_A1151FacPer = new String[] {""} ;
      T01TW5_A1152FacDiaPag = new String[] {""} ;
      T01TW5_A1153FacTipFac = new byte[1] ;
      T01TW5_A960FacIVACod = new String[] {""} ;
      T01TW5_A2739FacSerNum = new String[] {""} ;
      T01TW5_A3096FacDivTCod = new String[] {""} ;
      T01TW5_n3096FacDivTCod = new boolean[] {false} ;
      T01TW5_A9605FacFirma = new String[] {""} ;
      T01TW5_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01TW5_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A396EmprCod = new String[] {""} ;
      T01TW5_A3119FacRepCod = new String[] {""} ;
      T01TW5_n3119FacRepCod = new boolean[] {false} ;
      T01TW5_A252CliCod = new int[1] ;
      T01TW5_A11629MeivaId = new String[] {""} ;
      T01TW5_n11629MeivaId = new boolean[] {false} ;
      T01TW5_A3115FacDivCod = new byte[1] ;
      T01TW5_n3115FacDivCod = new boolean[] {false} ;
      T01TW5_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW5_n8346FacRecI = new boolean[] {false} ;
      T01TW5_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW29_A430FacCod = new int[1] ;
      T01TW29_A396EmprCod = new String[] {""} ;
      T01TW30_A430FacCod = new int[1] ;
      T01TW30_A396EmprCod = new String[] {""} ;
      T01TW4_A7210FacObs = new String[] {""} ;
      T01TW4_A430FacCod = new int[1] ;
      T01TW4_A437FacFpg = new String[] {""} ;
      T01TW4_A443FacIVAPor = new byte[1] ;
      T01TW4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TW4_A450FacPri = new String[] {""} ;
      T01TW4_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A1725FacRegIva = new String[] {""} ;
      T01TW4_n1725FacRegIva = new boolean[] {false} ;
      T01TW4_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A6632FacDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A435FacEst = new byte[1] ;
      T01TW4_A445FacLiC = new int[1] ;
      T01TW4_A965FacCob = new String[] {""} ;
      T01TW4_A1150FacNumVto = new byte[1] ;
      T01TW4_A1151FacPer = new String[] {""} ;
      T01TW4_A1152FacDiaPag = new String[] {""} ;
      T01TW4_A1153FacTipFac = new byte[1] ;
      T01TW4_A960FacIVACod = new String[] {""} ;
      T01TW4_A2739FacSerNum = new String[] {""} ;
      T01TW4_A3096FacDivTCod = new String[] {""} ;
      T01TW4_n3096FacDivTCod = new boolean[] {false} ;
      T01TW4_A9605FacFirma = new String[] {""} ;
      T01TW4_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01TW4_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A396EmprCod = new String[] {""} ;
      T01TW4_A3119FacRepCod = new String[] {""} ;
      T01TW4_n3119FacRepCod = new boolean[] {false} ;
      T01TW4_A252CliCod = new int[1] ;
      T01TW4_A11629MeivaId = new String[] {""} ;
      T01TW4_n11629MeivaId = new boolean[] {false} ;
      T01TW4_A3115FacDivCod = new byte[1] ;
      T01TW4_n3115FacDivCod = new boolean[] {false} ;
      T01TW4_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW4_n8346FacRecI = new boolean[] {false} ;
      T01TW4_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW34_A3116FacDivAbr = new String[] {""} ;
      T01TW34_n3116FacDivAbr = new boolean[] {false} ;
      T01TW35_A3120FacRepNom = new String[] {""} ;
      T01TW35_n3120FacRepNom = new boolean[] {false} ;
      T01TW36_A279CliNom = new String[] {""} ;
      T01TW36_A3091CliDivTra = new String[] {""} ;
      T01TW36_n3091CliDivTra = new boolean[] {false} ;
      T01TW36_A3140CliDivCod = new byte[1] ;
      T01TW36_n3140CliDivCod = new boolean[] {false} ;
      T01TW36_A858ZonGeoCod = new short[1] ;
      T01TW37_A11630MeivaDsc = new String[] {""} ;
      T01TW37_n11630MeivaDsc = new boolean[] {false} ;
      T01TW38_A1360ZonGeoNom = new String[] {""} ;
      T01TW38_n1360ZonGeoNom = new boolean[] {false} ;
      T01TW39_A1718CliRecDGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW39_n1718CliRecDGrl = new boolean[] {false} ;
      T01TW39_A1719CliRecDPag = new String[] {""} ;
      T01TW39_n1719CliRecDPag = new boolean[] {false} ;
      T01TW39_A1720CliRecDPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW39_n1720CliRecDPpg = new boolean[] {false} ;
      T01TW39_A1721CliRecFpg = new String[] {""} ;
      T01TW39_n1721CliRecFpg = new boolean[] {false} ;
      T01TW39_A1722CliRecIVA = new String[] {""} ;
      T01TW39_n1722CliRecIVA = new boolean[] {false} ;
      T01TW39_A1723CliRecNVto = new byte[1] ;
      T01TW39_n1723CliRecNVto = new boolean[] {false} ;
      T01TW39_A1724CliRecPrd = new String[] {""} ;
      T01TW39_n1724CliRecPrd = new boolean[] {false} ;
      T01TW41_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW42_A396EmprCod = new String[] {""} ;
      T01TW42_A430FacCod = new int[1] ;
      T01TW42_A956FacVtoLin = new byte[1] ;
      T01TW44_A396EmprCod = new String[] {""} ;
      T01TW44_A430FacCod = new int[1] ;
      T01TW45_A430FacCod = new int[1] ;
      T01TW45_A446FacLin = new int[1] ;
      T01TW45_A454FacSer = new String[] {""} ;
      T01TW45_A428FacAlbTip = new byte[1] ;
      T01TW45_A432FacDsc = new String[] {""} ;
      T01TW45_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A3097FacTipPro = new String[] {""} ;
      T01TW45_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A12197FacUnds = new int[1] ;
      T01TW45_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A396EmprCod = new String[] {""} ;
      T01TW45_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW45_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW46_A396EmprCod = new String[] {""} ;
      T01TW46_A430FacCod = new int[1] ;
      T01TW46_A446FacLin = new int[1] ;
      T01TW3_A430FacCod = new int[1] ;
      T01TW3_A446FacLin = new int[1] ;
      T01TW3_A454FacSer = new String[] {""} ;
      T01TW3_A428FacAlbTip = new byte[1] ;
      T01TW3_A432FacDsc = new String[] {""} ;
      T01TW3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A3097FacTipPro = new String[] {""} ;
      T01TW3_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A12197FacUnds = new int[1] ;
      T01TW3_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A396EmprCod = new String[] {""} ;
      T01TW3_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW3_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A430FacCod = new int[1] ;
      T01TW2_A446FacLin = new int[1] ;
      T01TW2_A454FacSer = new String[] {""} ;
      T01TW2_A428FacAlbTip = new byte[1] ;
      T01TW2_A432FacDsc = new String[] {""} ;
      T01TW2_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A3097FacTipPro = new String[] {""} ;
      T01TW2_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A12197FacUnds = new int[1] ;
      T01TW2_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A396EmprCod = new String[] {""} ;
      T01TW2_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW2_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TW50_A396EmprCod = new String[] {""} ;
      T01TW50_A430FacCod = new int[1] ;
      T01TW50_A446FacLin = new int[1] ;
      Gridlevel_abonoscargoslineasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_abonoscargoslineas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A3073RepCod = "" ;
      iV37Ser30 = "" ;
      iV36Ser20 = "" ;
      iV35Ser0 = "" ;
      iV34Ser3 = "" ;
      iV33Ser2 = "" ;
      iV32Ser1 = "" ;
      i436FacFch = GXutil.nullDate() ;
      i450FacPri = "" ;
      i960FacIVACod = "" ;
      i453FacRECPor = DecimalUtil.ZERO ;
      i9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      i454FacSer = "" ;
      Gridlevel_abonoscargoslineasColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_char16 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int10 = new int[1] ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_char17 = new String[1] ;
      Z14218FacImpEng1 = DecimalUtil.ZERO ;
      Z14225FacImpEner = DecimalUtil.ZERO ;
      Z441FacImpTot = DecimalUtil.ZERO ;
      Z3920FacImpPP1 = DecimalUtil.ZERO ;
      Z440FacImpPP = DecimalUtil.ZERO ;
      ZV28Facfch = GXutil.nullDate() ;
      Z2239FacIml = DecimalUtil.ZERO ;
      Z3923FacImp1 = DecimalUtil.ZERO ;
      Z438FacImp = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.abonoscargos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.abonoscargos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.abonoscargos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.abonoscargos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.abonoscargos__default(),
         new Object[] {
             new Object[] {
            T01TW2_A430FacCod, T01TW2_A446FacLin, T01TW2_A454FacSer, T01TW2_A428FacAlbTip, T01TW2_A432FacDsc, T01TW2_A447FacMts, T01TW2_A449FacPreMts, T01TW2_A444FacKgs, T01TW2_A448FacPreKgs, T01TW2_A3097FacTipPro,
            T01TW2_A5353FacImpMan, T01TW2_A12197FacUnds, T01TW2_A12198FacPreUnd, T01TW2_A396EmprCod, T01TW2_A5355FacImpMin, T01TW2_A3898FacPreKgsA, T01TW2_A3897FacKgsA
            }
            , new Object[] {
            T01TW3_A430FacCod, T01TW3_A446FacLin, T01TW3_A454FacSer, T01TW3_A428FacAlbTip, T01TW3_A432FacDsc, T01TW3_A447FacMts, T01TW3_A449FacPreMts, T01TW3_A444FacKgs, T01TW3_A448FacPreKgs, T01TW3_A3097FacTipPro,
            T01TW3_A5353FacImpMan, T01TW3_A12197FacUnds, T01TW3_A12198FacPreUnd, T01TW3_A396EmprCod, T01TW3_A5355FacImpMin, T01TW3_A3898FacPreKgsA, T01TW3_A3897FacKgsA
            }
            , new Object[] {
            T01TW4_A7210FacObs, T01TW4_A430FacCod, T01TW4_A437FacFpg, T01TW4_A443FacIVAPor, T01TW4_A436FacFch, T01TW4_A450FacPri, T01TW4_A433FacDtoGen, T01TW4_A434FacDtoPP, T01TW4_A1725FacRegIva, T01TW4_n1725FacRegIva,
            T01TW4_A453FacRECPor, T01TW4_A6632FacDto, T01TW4_A435FacEst, T01TW4_A445FacLiC, T01TW4_A965FacCob, T01TW4_A1150FacNumVto, T01TW4_A1151FacPer, T01TW4_A1152FacDiaPag, T01TW4_A1153FacTipFac, T01TW4_A960FacIVACod,
            T01TW4_A2739FacSerNum, T01TW4_A3096FacDivTCod, T01TW4_n3096FacDivTCod, T01TW4_A9605FacFirma, T01TW4_A9606FacHor, T01TW4_A9643FacLiq1, T01TW4_A9644FacLiq2, T01TW4_A9645FacIva1, T01TW4_A9646FacTot1, T01TW4_A14219FacEnergia,
            T01TW4_A14224FacCostFac, T01TW4_A14222FacCostMts, T01TW4_A14223FacCostKgs, T01TW4_A396EmprCod, T01TW4_A3119FacRepCod, T01TW4_n3119FacRepCod, T01TW4_A252CliCod, T01TW4_A11629MeivaId, T01TW4_n11629MeivaId, T01TW4_A3115FacDivCod,
            T01TW4_n3115FacDivCod, T01TW4_A7212FacRect, T01TW4_A8346FacRecI, T01TW4_n8346FacRecI, T01TW4_A11513FacRecIca
            }
            , new Object[] {
            T01TW5_A7210FacObs, T01TW5_A430FacCod, T01TW5_A437FacFpg, T01TW5_A443FacIVAPor, T01TW5_A436FacFch, T01TW5_A450FacPri, T01TW5_A433FacDtoGen, T01TW5_A434FacDtoPP, T01TW5_A1725FacRegIva, T01TW5_n1725FacRegIva,
            T01TW5_A453FacRECPor, T01TW5_A6632FacDto, T01TW5_A435FacEst, T01TW5_A445FacLiC, T01TW5_A965FacCob, T01TW5_A1150FacNumVto, T01TW5_A1151FacPer, T01TW5_A1152FacDiaPag, T01TW5_A1153FacTipFac, T01TW5_A960FacIVACod,
            T01TW5_A2739FacSerNum, T01TW5_A3096FacDivTCod, T01TW5_n3096FacDivTCod, T01TW5_A9605FacFirma, T01TW5_A9606FacHor, T01TW5_A9643FacLiq1, T01TW5_A9644FacLiq2, T01TW5_A9645FacIva1, T01TW5_A9646FacTot1, T01TW5_A14219FacEnergia,
            T01TW5_A14224FacCostFac, T01TW5_A14222FacCostMts, T01TW5_A14223FacCostKgs, T01TW5_A396EmprCod, T01TW5_A3119FacRepCod, T01TW5_n3119FacRepCod, T01TW5_A252CliCod, T01TW5_A11629MeivaId, T01TW5_n11629MeivaId, T01TW5_A3115FacDivCod,
            T01TW5_n3115FacDivCod, T01TW5_A7212FacRect, T01TW5_A8346FacRecI, T01TW5_n8346FacRecI, T01TW5_A11513FacRecIca
            }
            , new Object[] {
            T01TW6_A407EmprNom, T01TW6_n407EmprNom, T01TW6_A7209Colombia, T01TW6_n7209Colombia, T01TW6_A953IvaCod, T01TW6_n953IvaCod
            }
            , new Object[] {
            T01TW7_A3120FacRepNom, T01TW7_n3120FacRepNom
            }
            , new Object[] {
            T01TW8_A279CliNom, T01TW8_A3091CliDivTra, T01TW8_n3091CliDivTra, T01TW8_A3140CliDivCod, T01TW8_n3140CliDivCod, T01TW8_A858ZonGeoCod
            }
            , new Object[] {
            T01TW9_A3073RepCod
            }
            , new Object[] {
            T01TW10_A11630MeivaDsc, T01TW10_n11630MeivaDsc
            }
            , new Object[] {
            T01TW11_A3116FacDivAbr, T01TW11_n3116FacDivAbr
            }
            , new Object[] {
            T01TW12_A588IvaPor, T01TW12_n588IvaPor, T01TW12_A589IvaRec, T01TW12_n589IvaRec
            }
            , new Object[] {
            T01TW13_A1360ZonGeoNom, T01TW13_n1360ZonGeoNom
            }
            , new Object[] {
            T01TW14_A1718CliRecDGrl, T01TW14_n1718CliRecDGrl, T01TW14_A1719CliRecDPag, T01TW14_n1719CliRecDPag, T01TW14_A1720CliRecDPpg, T01TW14_n1720CliRecDPpg, T01TW14_A1721CliRecFpg, T01TW14_n1721CliRecFpg, T01TW14_A1722CliRecIVA, T01TW14_n1722CliRecIVA,
            T01TW14_A1723CliRecNVto, T01TW14_n1723CliRecNVto, T01TW14_A1724CliRecPrd, T01TW14_n1724CliRecPrd
            }
            , new Object[] {
            T01TW16_A3918FacImpTot1
            }
            , new Object[] {
            T01TW18_A7210FacObs, T01TW18_A297CliPri, T01TW18_A430FacCod, T01TW18_A437FacFpg, T01TW18_A443FacIVAPor, T01TW18_A407EmprNom, T01TW18_n407EmprNom, T01TW18_A436FacFch, T01TW18_A450FacPri, T01TW18_A279CliNom,
            T01TW18_A433FacDtoGen, T01TW18_A434FacDtoPP, T01TW18_A588IvaPor, T01TW18_n588IvaPor, T01TW18_A589IvaRec, T01TW18_n589IvaRec, T01TW18_A1725FacRegIva, T01TW18_n1725FacRegIva, T01TW18_A453FacRECPor, T01TW18_A6632FacDto,
            T01TW18_A435FacEst, T01TW18_A445FacLiC, T01TW18_A965FacCob, T01TW18_A1150FacNumVto, T01TW18_A1151FacPer, T01TW18_A1152FacDiaPag, T01TW18_A1153FacTipFac, T01TW18_A960FacIVACod, T01TW18_A2739FacSerNum, T01TW18_A3091CliDivTra,
            T01TW18_n3091CliDivTra, T01TW18_A3116FacDivAbr, T01TW18_n3116FacDivAbr, T01TW18_A3096FacDivTCod, T01TW18_n3096FacDivTCod, T01TW18_A3120FacRepNom, T01TW18_n3120FacRepNom, T01TW18_A9605FacFirma, T01TW18_A9606FacHor, T01TW18_A9643FacLiq1,
            T01TW18_A9644FacLiq2, T01TW18_A9645FacIva1, T01TW18_A9646FacTot1, T01TW18_A1360ZonGeoNom, T01TW18_n1360ZonGeoNom, T01TW18_A11630MeivaDsc, T01TW18_n11630MeivaDsc, T01TW18_A14219FacEnergia, T01TW18_A14224FacCostFac, T01TW18_A7209Colombia,
            T01TW18_n7209Colombia, T01TW18_A14222FacCostMts, T01TW18_A14223FacCostKgs, T01TW18_A396EmprCod, T01TW18_A3119FacRepCod, T01TW18_n3119FacRepCod, T01TW18_A252CliCod, T01TW18_A11629MeivaId, T01TW18_n11629MeivaId, T01TW18_A3115FacDivCod,
            T01TW18_n3115FacDivCod, T01TW18_A953IvaCod, T01TW18_n953IvaCod, T01TW18_A3140CliDivCod, T01TW18_n3140CliDivCod, T01TW18_A858ZonGeoCod, T01TW18_A1718CliRecDGrl, T01TW18_n1718CliRecDGrl, T01TW18_A1719CliRecDPag, T01TW18_n1719CliRecDPag,
            T01TW18_A1720CliRecDPpg, T01TW18_n1720CliRecDPpg, T01TW18_A1721CliRecFpg, T01TW18_n1721CliRecFpg, T01TW18_A1722CliRecIVA, T01TW18_n1722CliRecIVA, T01TW18_A1723CliRecNVto, T01TW18_n1723CliRecNVto, T01TW18_A1724CliRecPrd, T01TW18_n1724CliRecPrd,
            T01TW18_A3918FacImpTot1, T01TW18_A7212FacRect, T01TW18_A8346FacRecI, T01TW18_n8346FacRecI, T01TW18_A11513FacRecIca
            }
            , new Object[] {
            T01TW19_A3120FacRepNom, T01TW19_n3120FacRepNom
            }
            , new Object[] {
            T01TW20_A279CliNom, T01TW20_A3091CliDivTra, T01TW20_n3091CliDivTra, T01TW20_A3140CliDivCod, T01TW20_n3140CliDivCod, T01TW20_A858ZonGeoCod
            }
            , new Object[] {
            T01TW21_A3116FacDivAbr, T01TW21_n3116FacDivAbr
            }
            , new Object[] {
            T01TW22_A3073RepCod
            }
            , new Object[] {
            T01TW23_A11630MeivaDsc, T01TW23_n11630MeivaDsc
            }
            , new Object[] {
            T01TW24_A1360ZonGeoNom, T01TW24_n1360ZonGeoNom
            }
            , new Object[] {
            T01TW25_A1718CliRecDGrl, T01TW25_n1718CliRecDGrl, T01TW25_A1719CliRecDPag, T01TW25_n1719CliRecDPag, T01TW25_A1720CliRecDPpg, T01TW25_n1720CliRecDPpg, T01TW25_A1721CliRecFpg, T01TW25_n1721CliRecFpg, T01TW25_A1722CliRecIVA, T01TW25_n1722CliRecIVA,
            T01TW25_A1723CliRecNVto, T01TW25_n1723CliRecNVto, T01TW25_A1724CliRecPrd, T01TW25_n1724CliRecPrd
            }
            , new Object[] {
            T01TW27_A3918FacImpTot1
            }
            , new Object[] {
            T01TW28_A396EmprCod, T01TW28_A430FacCod
            }
            , new Object[] {
            T01TW29_A430FacCod, T01TW29_A396EmprCod
            }
            , new Object[] {
            T01TW30_A430FacCod, T01TW30_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TW34_A3116FacDivAbr, T01TW34_n3116FacDivAbr
            }
            , new Object[] {
            T01TW35_A3120FacRepNom, T01TW35_n3120FacRepNom
            }
            , new Object[] {
            T01TW36_A279CliNom, T01TW36_A3091CliDivTra, T01TW36_n3091CliDivTra, T01TW36_A3140CliDivCod, T01TW36_n3140CliDivCod, T01TW36_A858ZonGeoCod
            }
            , new Object[] {
            T01TW37_A11630MeivaDsc, T01TW37_n11630MeivaDsc
            }
            , new Object[] {
            T01TW38_A1360ZonGeoNom, T01TW38_n1360ZonGeoNom
            }
            , new Object[] {
            T01TW39_A1718CliRecDGrl, T01TW39_n1718CliRecDGrl, T01TW39_A1719CliRecDPag, T01TW39_n1719CliRecDPag, T01TW39_A1720CliRecDPpg, T01TW39_n1720CliRecDPpg, T01TW39_A1721CliRecFpg, T01TW39_n1721CliRecFpg, T01TW39_A1722CliRecIVA, T01TW39_n1722CliRecIVA,
            T01TW39_A1723CliRecNVto, T01TW39_n1723CliRecNVto, T01TW39_A1724CliRecPrd, T01TW39_n1724CliRecPrd
            }
            , new Object[] {
            T01TW41_A3918FacImpTot1
            }
            , new Object[] {
            T01TW42_A396EmprCod, T01TW42_A430FacCod, T01TW42_A956FacVtoLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01TW44_A396EmprCod, T01TW44_A430FacCod
            }
            , new Object[] {
            T01TW45_A430FacCod, T01TW45_A446FacLin, T01TW45_A454FacSer, T01TW45_A428FacAlbTip, T01TW45_A432FacDsc, T01TW45_A447FacMts, T01TW45_A449FacPreMts, T01TW45_A444FacKgs, T01TW45_A448FacPreKgs, T01TW45_A3097FacTipPro,
            T01TW45_A5353FacImpMan, T01TW45_A12197FacUnds, T01TW45_A12198FacPreUnd, T01TW45_A396EmprCod, T01TW45_A5355FacImpMin, T01TW45_A3898FacPreKgsA, T01TW45_A3897FacKgsA
            }
            , new Object[] {
            T01TW46_A396EmprCod, T01TW46_A430FacCod, T01TW46_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TW50_A396EmprCod, T01TW50_A430FacCod, T01TW50_A446FacLin
            }
         }
      );
      AV47Pgmname = "Facturacion.AbonosCargos" ;
      Z9606FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A9606FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i9606FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z453FacRECPor = DecimalUtil.ZERO ;
      O453FacRECPor = DecimalUtil.ZERO ;
      i453FacRECPor = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      Z428FacAlbTip = (byte)(0) ;
      A428FacAlbTip = (byte)(0) ;
      i428FacAlbTip = (byte)(0) ;
      Z443FacIVAPor = (byte)(0) ;
      O443FacIVAPor = (byte)(0) ;
      A443FacIVAPor = (byte)(0) ;
      Z454FacSer = httpContext.getMessage( "RECTIFICACION", "") ;
      A454FacSer = httpContext.getMessage( "RECTIFICACION", "") ;
      i454FacSer = httpContext.getMessage( "RECTIFICACION", "") ;
      Z3096FacDivTCod = "" ;
      n3096FacDivTCod = false ;
      A3096FacDivTCod = "" ;
      n3096FacDivTCod = false ;
      Z3115FacDivCod = (byte)(0) ;
      n3115FacDivCod = false ;
      N3115FacDivCod = (byte)(0) ;
      n3115FacDivCod = false ;
      A3115FacDivCod = (byte)(0) ;
      n3115FacDivCod = false ;
      Z960FacIVACod = "" ;
      A960FacIVACod = "" ;
      i960FacIVACod = "" ;
      Z435FacEst = (byte)(0) ;
      A435FacEst = (byte)(0) ;
      i435FacEst = (byte)(0) ;
      Z450FacPri = "1" ;
      i450FacPri = "1" ;
      A450FacPri = "1" ;
      Z1153FacTipFac = (byte)(0) ;
      A1153FacTipFac = (byte)(0) ;
      i1153FacTipFac = (byte)(0) ;
      Z436FacFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A436FacFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i436FacFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte wcpOAV19FacTipFac ;
   private byte Z443FacIVAPor ;
   private byte Z435FacEst ;
   private byte Z1150FacNumVto ;
   private byte Z1153FacTipFac ;
   private byte Z3115FacDivCod ;
   private byte O1150FacNumVto ;
   private byte O443FacIVAPor ;
   private byte N3115FacDivCod ;
   private byte Z428FacAlbTip ;
   private byte GxWebError ;
   private byte A1150FacNumVto ;
   private byte A443FacIVAPor ;
   private byte A3115FacDivCod ;
   private byte AV19FacTipFac ;
   private byte nKeyPressed ;
   private byte A435FacEst ;
   private byte Gx_BScreen ;
   private byte A1153FacTipFac ;
   private byte B1150FacNumVto ;
   private byte B443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV13Insert_FacDivCod ;
   private byte A3140CliDivCod ;
   private byte A588IvaPor ;
   private byte A1723CliRecNVto ;
   private byte A428FacAlbTip ;
   private byte Z7209Colombia ;
   private byte Z588IvaPor ;
   private byte Z3140CliDivCod ;
   private byte Z1723CliRecNVto ;
   private byte subGridlevel_abonoscargoslineas_Backcolorstyle ;
   private byte subGridlevel_abonoscargoslineas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i1153FacTipFac ;
   private byte i435FacEst ;
   private byte i428FacAlbTip ;
   private byte subGridlevel_abonoscargoslineas_Allowselection ;
   private byte subGridlevel_abonoscargoslineas_Allowhovering ;
   private byte subGridlevel_abonoscargoslineas_Allowcollapsing ;
   private byte subGridlevel_abonoscargoslineas_Collapsed ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short nRcdDeleted_44 ;
   private short nRcdExists_44 ;
   private short nIsMod_44 ;
   private short AV17FirmaD ;
   private short A858ZonGeoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount44 ;
   private short RcdFound44 ;
   private short nBlankRcdUsr44 ;
   private short RcdFound43 ;
   private short Z858ZonGeoCod ;
   private short nIsDirty_43 ;
   private short nIsDirty_44 ;
   private int wcpOAV8FacCod ;
   private int Z430FacCod ;
   private int Z445FacLiC ;
   private int Z252CliCod ;
   private int O445FacLiC ;
   private int nRC_GXsfl_169 ;
   private int nGXsfl_169_idx=1 ;
   private int N252CliCod ;
   private int Z446FacLin ;
   private int Z12197FacUnds ;
   private int A430FacCod ;
   private int AV27FacCodX ;
   private int A252CliCod ;
   private int AV8FacCod ;
   private int trnEnded ;
   private int A445FacLiC ;
   private int edtavTexto_fd_Enabled ;
   private int edtFacCod_Enabled ;
   private int edtFacFch_Enabled ;
   private int edtFacHor_Enabled ;
   private int edtFacSerNum_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtMeivaId_Visible ;
   private int edtMeivaId_Enabled ;
   private int edtFacNumVto_Enabled ;
   private int edtFacPer_Enabled ;
   private int edtFacDiaPag_Enabled ;
   private int edtFacFpg_Visible ;
   private int edtFacFpg_Enabled ;
   private int edtFacImpTot_Enabled ;
   private int edtFacDtoGen_Enabled ;
   private int edtFacDto_Enabled ;
   private int edtFacImpGen_Enabled ;
   private int edtFacImpPP_Enabled ;
   private int edtFacBasImp_Enabled ;
   private int edtFacIVAPor_Enabled ;
   private int edtFacIVAImp_Enabled ;
   private int edtFacFirma_Enabled ;
   private int edtFacObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV31ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavCombomeivaid_Visible ;
   private int edtavCombomeivaid_Enabled ;
   private int edtavCombofacfpg_Visible ;
   private int edtavCombofacfpg_Enabled ;
   private int edtFacPri_Visible ;
   private int edtFacPri_Enabled ;
   private int B445FacLiC ;
   private int edtFacLin_Enabled ;
   private int edtFacDsc_Enabled ;
   private int edtFacMts_Enabled ;
   private int edtFacPreMts_Enabled ;
   private int edtFacKgs_Enabled ;
   private int edtFacPreKgs_Enabled ;
   private int edtFacUnds_Enabled ;
   private int edtFacPreUnd_Enabled ;
   private int edtFacImpMan_Enabled ;
   private int edtFacImpMan_Visible ;
   private int edtFacImp_Enabled ;
   private int fRowAdded ;
   private int AV12Insert_CliCod ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_clicod_Gxcontroltype ;
   private int Combo_meivaid_Datalistupdateminimumcharacters ;
   private int Combo_meivaid_Gxcontroltype ;
   private int Dvpanel_unnamedtable3_Gxcontroltype ;
   private int Combo_facfpg_Datalistupdateminimumcharacters ;
   private int Combo_facfpg_Gxcontroltype ;
   private int Dvpanel_unnamedtable4_Gxcontroltype ;
   private int Dvpanel_unnamedtable5_Gxcontroltype ;
   private int Dvpanel_unnamedtable6_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int s445FacLiC ;
   private int A446FacLin ;
   private int A12197FacUnds ;
   private int AV51GXV1 ;
   private int AV52GXV2 ;
   private int GX_JID ;
   private int subGridlevel_abonoscargoslineas_Backcolor ;
   private int subGridlevel_abonoscargoslineas_Allbackcolor ;
   private int defedtFacLin_Enabled ;
   private int i445FacLiC ;
   private int idxLst ;
   private int subGridlevel_abonoscargoslineas_Selectedindex ;
   private int subGridlevel_abonoscargoslineas_Selectioncolor ;
   private int subGridlevel_abonoscargoslineas_Hoveringcolor ;
   private int GXv_int10[] ;
   private int ZV27FacCodX ;
   private long GRIDLEVEL_ABONOSCARGOSLINEAS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z433FacDtoGen ;
   private java.math.BigDecimal Z434FacDtoPP ;
   private java.math.BigDecimal Z453FacRECPor ;
   private java.math.BigDecimal Z6632FacDto ;
   private java.math.BigDecimal Z9643FacLiq1 ;
   private java.math.BigDecimal Z9644FacLiq2 ;
   private java.math.BigDecimal Z9645FacIva1 ;
   private java.math.BigDecimal Z9646FacTot1 ;
   private java.math.BigDecimal Z14219FacEnergia ;
   private java.math.BigDecimal Z14224FacCostFac ;
   private java.math.BigDecimal Z14222FacCostMts ;
   private java.math.BigDecimal Z14223FacCostKgs ;
   private java.math.BigDecimal Z7212FacRect ;
   private java.math.BigDecimal Z8346FacRecI ;
   private java.math.BigDecimal Z11513FacRecIca ;
   private java.math.BigDecimal O434FacDtoPP ;
   private java.math.BigDecimal O433FacDtoGen ;
   private java.math.BigDecimal O453FacRECPor ;
   private java.math.BigDecimal O14224FacCostFac ;
   private java.math.BigDecimal Z447FacMts ;
   private java.math.BigDecimal Z449FacPreMts ;
   private java.math.BigDecimal Z444FacKgs ;
   private java.math.BigDecimal Z448FacPreKgs ;
   private java.math.BigDecimal Z5353FacImpMan ;
   private java.math.BigDecimal Z12198FacPreUnd ;
   private java.math.BigDecimal Z5355FacImpMin ;
   private java.math.BigDecimal Z3898FacPreKgsA ;
   private java.math.BigDecimal Z3897FacKgsA ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A6632FacDto ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal B434FacDtoPP ;
   private java.math.BigDecimal B433FacDtoGen ;
   private java.math.BigDecimal B453FacRECPor ;
   private java.math.BigDecimal B14224FacCostFac ;
   private java.math.BigDecimal A9643FacLiq1 ;
   private java.math.BigDecimal A9644FacLiq2 ;
   private java.math.BigDecimal A9645FacIva1 ;
   private java.math.BigDecimal A9646FacTot1 ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14225FacImpEner ;
   private java.math.BigDecimal A589IvaRec ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A1718CliRecDGrl ;
   private java.math.BigDecimal A1720CliRecDPpg ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A438FacImp ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal Z589IvaRec ;
   private java.math.BigDecimal Z3918FacImpTot1 ;
   private java.math.BigDecimal Z1718CliRecDGrl ;
   private java.math.BigDecimal Z1720CliRecDPpg ;
   private java.math.BigDecimal i453FacRECPor ;
   private java.math.BigDecimal Z14218FacImpEng1 ;
   private java.math.BigDecimal Z14225FacImpEner ;
   private java.math.BigDecimal Z441FacImpTot ;
   private java.math.BigDecimal Z3920FacImpPP1 ;
   private java.math.BigDecimal Z440FacImpPP ;
   private java.math.BigDecimal Z2239FacIml ;
   private java.math.BigDecimal Z3923FacImp1 ;
   private java.math.BigDecimal Z438FacImp ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV38FacPri ;
   private String Z396EmprCod ;
   private String Z437FacFpg ;
   private String Z450FacPri ;
   private String Z1725FacRegIva ;
   private String Z965FacCob ;
   private String Z1151FacPer ;
   private String Z1152FacDiaPag ;
   private String Z960FacIVACod ;
   private String Z2739FacSerNum ;
   private String Z3096FacDivTCod ;
   private String Z9605FacFirma ;
   private String Z3119FacRepCod ;
   private String Z11629MeivaId ;
   private String O1151FacPer ;
   private String O1152FacDiaPag ;
   private String O437FacFpg ;
   private String N3119FacRepCod ;
   private String N11629MeivaId ;
   private String Combo_facfpg_Selectedvalue_get ;
   private String Combo_meivaid_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String Z454FacSer ;
   private String Z432FacDsc ;
   private String Z3097FacTipPro ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV29ContCod ;
   private String Gx_mode ;
   private String A450FacPri ;
   private String A1151FacPer ;
   private String A1152FacDiaPag ;
   private String A437FacFpg ;
   private String AV32Ser1 ;
   private String AV33Ser2 ;
   private String AV34Ser3 ;
   private String AV35Ser0 ;
   private String AV36Ser20 ;
   private String AV37Ser30 ;
   private String AV7EmprCod ;
   private String A3119FacRepCod ;
   private String A11629MeivaId ;
   private String AV38FacPri ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFacFch_Internalname ;
   private String sGXsfl_169_idx="0001" ;
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
   private String edtavTexto_fd_Internalname ;
   private String edtavTexto_fd_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtFacCod_Internalname ;
   private String edtFacCod_Jsonclick ;
   private String TempTags ;
   private String edtFacFch_Jsonclick ;
   private String edtFacHor_Internalname ;
   private String edtFacHor_Jsonclick ;
   private String edtFacSerNum_Internalname ;
   private String A2739FacSerNum ;
   private String edtFacSerNum_Jsonclick ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divTablesplittedmeivaid_Internalname ;
   private String lblTextblockmeivaid_Internalname ;
   private String lblTextblockmeivaid_Jsonclick ;
   private String Combo_meivaid_Caption ;
   private String Combo_meivaid_Cls ;
   private String Combo_meivaid_Emptyitemtext ;
   private String Combo_meivaid_Internalname ;
   private String edtMeivaId_Internalname ;
   private String edtMeivaId_Jsonclick ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtFacNumVto_Internalname ;
   private String edtFacNumVto_Jsonclick ;
   private String edtFacPer_Internalname ;
   private String edtFacPer_Jsonclick ;
   private String edtFacDiaPag_Internalname ;
   private String edtFacDiaPag_Jsonclick ;
   private String divTablesplittedfacfpg_Internalname ;
   private String lblTextblockfacfpg_Internalname ;
   private String lblTextblockfacfpg_Jsonclick ;
   private String Combo_facfpg_Caption ;
   private String Combo_facfpg_Cls ;
   private String Combo_facfpg_Emptyitemtext ;
   private String Combo_facfpg_Internalname ;
   private String edtFacFpg_Internalname ;
   private String edtFacFpg_Jsonclick ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtFacImpTot_Internalname ;
   private String edtFacImpTot_Jsonclick ;
   private String edtFacDtoGen_Internalname ;
   private String edtFacDtoGen_Jsonclick ;
   private String edtFacDto_Internalname ;
   private String edtFacDto_Jsonclick ;
   private String edtFacImpGen_Internalname ;
   private String edtFacImpGen_Jsonclick ;
   private String edtFacImpPP_Internalname ;
   private String edtFacImpPP_Jsonclick ;
   private String edtFacBasImp_Internalname ;
   private String edtFacBasImp_Jsonclick ;
   private String edtFacIVAPor_Internalname ;
   private String edtFacIVAPor_Jsonclick ;
   private String edtFacIVAImp_Internalname ;
   private String edtFacIVAImp_Jsonclick ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtFacFirma_Internalname ;
   private String A9605FacFirma ;
   private String edtFacObs_Internalname ;
   private String divTableleaflevel_abonoscargoslineas_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV47Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_meivaid_Internalname ;
   private String edtavCombomeivaid_Internalname ;
   private String AV26ComboMeivaId ;
   private String edtavCombomeivaid_Jsonclick ;
   private String divSectionattribute_facfpg_Internalname ;
   private String edtavCombofacfpg_Internalname ;
   private String AV24ComboFacFpg ;
   private String edtavCombofacfpg_Jsonclick ;
   private String edtFacPri_Internalname ;
   private String edtFacPri_Jsonclick ;
   private String B1151FacPer ;
   private String B1152FacDiaPag ;
   private String B437FacFpg ;
   private String sMode44 ;
   private String edtFacLin_Internalname ;
   private String edtFacDsc_Internalname ;
   private String edtFacMts_Internalname ;
   private String edtFacPreMts_Internalname ;
   private String edtFacKgs_Internalname ;
   private String edtFacPreKgs_Internalname ;
   private String edtFacUnds_Internalname ;
   private String edtFacPreUnd_Internalname ;
   private String edtFacImpMan_Internalname ;
   private String edtFacImp_Internalname ;
   private String sStyleString ;
   private String subGridlevel_abonoscargoslineas_Internalname ;
   private String A1725FacRegIva ;
   private String A965FacCob ;
   private String A960FacIVACod ;
   private String A3096FacDivTCod ;
   private String AV14Insert_FacRepCod ;
   private String AV15Insert_MeivaId ;
   private String A953IvaCod ;
   private String A3091CliDivTra ;
   private String A407EmprNom ;
   private String A3120FacRepNom ;
   private String A279CliNom ;
   private String A3116FacDivAbr ;
   private String A1360ZonGeoNom ;
   private String A1719CliRecDPag ;
   private String A1721CliRecFpg ;
   private String A1722CliRecIVA ;
   private String A1724CliRecPrd ;
   private String A454FacSer ;
   private String A3097FacTipPro ;
   private String Combo_clicod_Objectcall ;
   private String Combo_clicod_Class ;
   private String Combo_clicod_Icontype ;
   private String Combo_clicod_Icon ;
   private String Combo_clicod_Tooltip ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Selectedtext_set ;
   private String Combo_clicod_Selectedtext_get ;
   private String Combo_clicod_Gamoauthtoken ;
   private String Combo_clicod_Ddointernalname ;
   private String Combo_clicod_Titlecontrolalign ;
   private String Combo_clicod_Dropdownoptionstype ;
   private String Combo_clicod_Titlecontrolidtoreplace ;
   private String Combo_clicod_Datalisttype ;
   private String Combo_clicod_Datalistfixedvalues ;
   private String Combo_clicod_Datalistproc ;
   private String Combo_clicod_Datalistprocparametersprefix ;
   private String Combo_clicod_Remoteservicesparameters ;
   private String Combo_clicod_Htmltemplate ;
   private String Combo_clicod_Multiplevaluestype ;
   private String Combo_clicod_Loadingdata ;
   private String Combo_clicod_Noresultsfound ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_Onlyselectedvalues ;
   private String Combo_clicod_Selectalltext ;
   private String Combo_clicod_Multiplevaluesseparator ;
   private String Combo_clicod_Addnewoptiontext ;
   private String Combo_meivaid_Objectcall ;
   private String Combo_meivaid_Class ;
   private String Combo_meivaid_Icontype ;
   private String Combo_meivaid_Icon ;
   private String Combo_meivaid_Tooltip ;
   private String Combo_meivaid_Selectedvalue_set ;
   private String Combo_meivaid_Selectedtext_set ;
   private String Combo_meivaid_Selectedtext_get ;
   private String Combo_meivaid_Gamoauthtoken ;
   private String Combo_meivaid_Ddointernalname ;
   private String Combo_meivaid_Titlecontrolalign ;
   private String Combo_meivaid_Dropdownoptionstype ;
   private String Combo_meivaid_Titlecontrolidtoreplace ;
   private String Combo_meivaid_Datalisttype ;
   private String Combo_meivaid_Datalistfixedvalues ;
   private String Combo_meivaid_Datalistproc ;
   private String Combo_meivaid_Datalistprocparametersprefix ;
   private String Combo_meivaid_Remoteservicesparameters ;
   private String Combo_meivaid_Htmltemplate ;
   private String Combo_meivaid_Multiplevaluestype ;
   private String Combo_meivaid_Loadingdata ;
   private String Combo_meivaid_Noresultsfound ;
   private String Combo_meivaid_Onlyselectedvalues ;
   private String Combo_meivaid_Selectalltext ;
   private String Combo_meivaid_Multiplevaluesseparator ;
   private String Combo_meivaid_Addnewoptiontext ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Combo_facfpg_Objectcall ;
   private String Combo_facfpg_Class ;
   private String Combo_facfpg_Icontype ;
   private String Combo_facfpg_Icon ;
   private String Combo_facfpg_Tooltip ;
   private String Combo_facfpg_Selectedvalue_set ;
   private String Combo_facfpg_Selectedtext_set ;
   private String Combo_facfpg_Selectedtext_get ;
   private String Combo_facfpg_Gamoauthtoken ;
   private String Combo_facfpg_Ddointernalname ;
   private String Combo_facfpg_Titlecontrolalign ;
   private String Combo_facfpg_Dropdownoptionstype ;
   private String Combo_facfpg_Titlecontrolidtoreplace ;
   private String Combo_facfpg_Datalisttype ;
   private String Combo_facfpg_Datalistfixedvalues ;
   private String Combo_facfpg_Datalistproc ;
   private String Combo_facfpg_Datalistprocparametersprefix ;
   private String Combo_facfpg_Remoteservicesparameters ;
   private String Combo_facfpg_Htmltemplate ;
   private String Combo_facfpg_Multiplevaluestype ;
   private String Combo_facfpg_Loadingdata ;
   private String Combo_facfpg_Noresultsfound ;
   private String Combo_facfpg_Onlyselectedvalues ;
   private String Combo_facfpg_Selectalltext ;
   private String Combo_facfpg_Multiplevaluesseparator ;
   private String Combo_facfpg_Addnewoptiontext ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_unnamedtable5_Objectcall ;
   private String Dvpanel_unnamedtable5_Class ;
   private String Dvpanel_unnamedtable5_Height ;
   private String Dvpanel_unnamedtable6_Objectcall ;
   private String Dvpanel_unnamedtable6_Class ;
   private String Dvpanel_unnamedtable6_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode43 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A432FacDsc ;
   private String AV18ContDsc ;
   private String AV48Station ;
   private String GXt_char3 ;
   private String AV49Emprnom ;
   private String AV50Usurcod ;
   private String Z3116FacDivAbr ;
   private String Z407EmprNom ;
   private String Z953IvaCod ;
   private String Z3120FacRepNom ;
   private String Z279CliNom ;
   private String Z3091CliDivTra ;
   private String Z1360ZonGeoNom ;
   private String Z1719CliRecDPag ;
   private String Z1721CliRecFpg ;
   private String Z1722CliRecIVA ;
   private String Z1724CliRecPrd ;
   private String sGXsfl_169_fel_idx="0001" ;
   private String subGridlevel_abonoscargoslineas_Class ;
   private String subGridlevel_abonoscargoslineas_Linesclass ;
   private String ROClassString ;
   private String edtFacLin_Jsonclick ;
   private String edtFacDsc_Jsonclick ;
   private String edtFacMts_Jsonclick ;
   private String edtFacPreMts_Jsonclick ;
   private String edtFacKgs_Jsonclick ;
   private String edtFacPreKgs_Jsonclick ;
   private String edtFacUnds_Jsonclick ;
   private String edtFacPreUnd_Jsonclick ;
   private String edtFacImpMan_Jsonclick ;
   private String edtFacImp_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A3073RepCod ;
   private String iV37Ser30 ;
   private String iV36Ser20 ;
   private String iV35Ser0 ;
   private String iV34Ser3 ;
   private String iV33Ser2 ;
   private String iV32Ser1 ;
   private String i450FacPri ;
   private String i960FacIVACod ;
   private String i454FacSer ;
   private String subGridlevel_abonoscargoslineas_Header ;
   private String GXv_char16[] ;
   private String GXv_char13[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private java.util.Date Z9606FacHor ;
   private java.util.Date A9606FacHor ;
   private java.util.Date i9606FacHor ;
   private java.util.Date Z436FacFch ;
   private java.util.Date AV28Facfch ;
   private java.util.Date A436FacFch ;
   private java.util.Date i436FacFch ;
   private java.util.Date GXv_date19[] ;
   private java.util.Date ZV28Facfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3119FacRepCod ;
   private boolean n3115FacDivCod ;
   private boolean n11629MeivaId ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Combo_clicod_Emptyitem ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean bGXsfl_169_Refreshing=false ;
   private boolean n1725FacRegIva ;
   private boolean n3096FacDivTCod ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean n3140CliDivCod ;
   private boolean n953IvaCod ;
   private boolean n3091CliDivTra ;
   private boolean n589IvaRec ;
   private boolean n407EmprNom ;
   private boolean n3120FacRepNom ;
   private boolean n11630MeivaDsc ;
   private boolean n3116FacDivAbr ;
   private boolean n588IvaPor ;
   private boolean n1360ZonGeoNom ;
   private boolean n1718CliRecDGrl ;
   private boolean n1719CliRecDPag ;
   private boolean n1720CliRecDPpg ;
   private boolean n1721CliRecFpg ;
   private boolean n1722CliRecIVA ;
   private boolean n1723CliRecNVto ;
   private boolean n1724CliRecPrd ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Includeaddnewoption ;
   private boolean Combo_meivaid_Enabled ;
   private boolean Combo_meivaid_Visible ;
   private boolean Combo_meivaid_Allowmultipleselection ;
   private boolean Combo_meivaid_Isgriditem ;
   private boolean Combo_meivaid_Hasdescription ;
   private boolean Combo_meivaid_Includeonlyselectedoption ;
   private boolean Combo_meivaid_Includeselectalloption ;
   private boolean Combo_meivaid_Emptyitem ;
   private boolean Combo_meivaid_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Combo_facfpg_Enabled ;
   private boolean Combo_facfpg_Visible ;
   private boolean Combo_facfpg_Allowmultipleselection ;
   private boolean Combo_facfpg_Isgriditem ;
   private boolean Combo_facfpg_Hasdescription ;
   private boolean Combo_facfpg_Includeonlyselectedoption ;
   private boolean Combo_facfpg_Includeselectalloption ;
   private boolean Combo_facfpg_Emptyitem ;
   private boolean Combo_facfpg_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_unnamedtable5_Enabled ;
   private boolean Dvpanel_unnamedtable5_Showheader ;
   private boolean Dvpanel_unnamedtable5_Visible ;
   private boolean Dvpanel_unnamedtable6_Enabled ;
   private boolean Dvpanel_unnamedtable6_Showheader ;
   private boolean Dvpanel_unnamedtable6_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean AV43ok ;
   private boolean GXv_boolean9[] ;
   private boolean Gx_longc ;
   private String A7210FacObs ;
   private String Z7210FacObs ;
   private String AV21Texto_fd ;
   private String A11630MeivaDsc ;
   private String AV40Cadena ;
   private String AV41firma ;
   private String AV45Hash ;
   private String AV23ComboSelectedValue ;
   private String Z11630MeivaDsc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_abonoscargoslineasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_abonoscargoslineasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_abonoscargoslineasColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_meivaid ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucCombo_facfpg ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbFacEst ;
   private HTMLChoice cmbFacTipFac ;
   private IDataStoreProvider pr_default ;
   private String[] T01TW6_A407EmprNom ;
   private boolean[] T01TW6_n407EmprNom ;
   private byte[] T01TW6_A7209Colombia ;
   private boolean[] T01TW6_n7209Colombia ;
   private String[] T01TW6_A953IvaCod ;
   private boolean[] T01TW6_n953IvaCod ;
   private byte[] T01TW12_A588IvaPor ;
   private boolean[] T01TW12_n588IvaPor ;
   private java.math.BigDecimal[] T01TW12_A589IvaRec ;
   private boolean[] T01TW12_n589IvaRec ;
   private java.math.BigDecimal[] T01TW16_A3918FacImpTot1 ;
   private String[] T01TW7_A3120FacRepNom ;
   private boolean[] T01TW7_n3120FacRepNom ;
   private String[] T01TW8_A279CliNom ;
   private String[] T01TW8_A3091CliDivTra ;
   private boolean[] T01TW8_n3091CliDivTra ;
   private byte[] T01TW8_A3140CliDivCod ;
   private boolean[] T01TW8_n3140CliDivCod ;
   private short[] T01TW8_A858ZonGeoCod ;
   private String[] T01TW13_A1360ZonGeoNom ;
   private boolean[] T01TW13_n1360ZonGeoNom ;
   private String[] T01TW10_A11630MeivaDsc ;
   private boolean[] T01TW10_n11630MeivaDsc ;
   private java.math.BigDecimal[] T01TW14_A1718CliRecDGrl ;
   private boolean[] T01TW14_n1718CliRecDGrl ;
   private String[] T01TW14_A1719CliRecDPag ;
   private boolean[] T01TW14_n1719CliRecDPag ;
   private java.math.BigDecimal[] T01TW14_A1720CliRecDPpg ;
   private boolean[] T01TW14_n1720CliRecDPpg ;
   private String[] T01TW14_A1721CliRecFpg ;
   private boolean[] T01TW14_n1721CliRecFpg ;
   private String[] T01TW14_A1722CliRecIVA ;
   private boolean[] T01TW14_n1722CliRecIVA ;
   private byte[] T01TW14_A1723CliRecNVto ;
   private boolean[] T01TW14_n1723CliRecNVto ;
   private String[] T01TW14_A1724CliRecPrd ;
   private boolean[] T01TW14_n1724CliRecPrd ;
   private String[] T01TW18_A7210FacObs ;
   private String[] T01TW18_A297CliPri ;
   private int[] T01TW18_A430FacCod ;
   private String[] T01TW18_A437FacFpg ;
   private byte[] T01TW18_A443FacIVAPor ;
   private String[] T01TW18_A407EmprNom ;
   private boolean[] T01TW18_n407EmprNom ;
   private java.util.Date[] T01TW18_A436FacFch ;
   private String[] T01TW18_A450FacPri ;
   private String[] T01TW18_A279CliNom ;
   private java.math.BigDecimal[] T01TW18_A433FacDtoGen ;
   private java.math.BigDecimal[] T01TW18_A434FacDtoPP ;
   private byte[] T01TW18_A588IvaPor ;
   private boolean[] T01TW18_n588IvaPor ;
   private java.math.BigDecimal[] T01TW18_A589IvaRec ;
   private boolean[] T01TW18_n589IvaRec ;
   private String[] T01TW18_A1725FacRegIva ;
   private boolean[] T01TW18_n1725FacRegIva ;
   private java.math.BigDecimal[] T01TW18_A453FacRECPor ;
   private java.math.BigDecimal[] T01TW18_A6632FacDto ;
   private byte[] T01TW18_A435FacEst ;
   private int[] T01TW18_A445FacLiC ;
   private String[] T01TW18_A965FacCob ;
   private byte[] T01TW18_A1150FacNumVto ;
   private String[] T01TW18_A1151FacPer ;
   private String[] T01TW18_A1152FacDiaPag ;
   private byte[] T01TW18_A1153FacTipFac ;
   private String[] T01TW18_A960FacIVACod ;
   private String[] T01TW18_A2739FacSerNum ;
   private String[] T01TW18_A3091CliDivTra ;
   private boolean[] T01TW18_n3091CliDivTra ;
   private String[] T01TW18_A3116FacDivAbr ;
   private boolean[] T01TW18_n3116FacDivAbr ;
   private String[] T01TW18_A3096FacDivTCod ;
   private boolean[] T01TW18_n3096FacDivTCod ;
   private String[] T01TW18_A3120FacRepNom ;
   private boolean[] T01TW18_n3120FacRepNom ;
   private String[] T01TW18_A9605FacFirma ;
   private java.util.Date[] T01TW18_A9606FacHor ;
   private java.math.BigDecimal[] T01TW18_A9643FacLiq1 ;
   private java.math.BigDecimal[] T01TW18_A9644FacLiq2 ;
   private java.math.BigDecimal[] T01TW18_A9645FacIva1 ;
   private java.math.BigDecimal[] T01TW18_A9646FacTot1 ;
   private String[] T01TW18_A1360ZonGeoNom ;
   private boolean[] T01TW18_n1360ZonGeoNom ;
   private String[] T01TW18_A11630MeivaDsc ;
   private boolean[] T01TW18_n11630MeivaDsc ;
   private java.math.BigDecimal[] T01TW18_A14219FacEnergia ;
   private java.math.BigDecimal[] T01TW18_A14224FacCostFac ;
   private byte[] T01TW18_A7209Colombia ;
   private boolean[] T01TW18_n7209Colombia ;
   private java.math.BigDecimal[] T01TW18_A14222FacCostMts ;
   private java.math.BigDecimal[] T01TW18_A14223FacCostKgs ;
   private String[] T01TW18_A396EmprCod ;
   private String[] T01TW18_A3119FacRepCod ;
   private boolean[] T01TW18_n3119FacRepCod ;
   private int[] T01TW18_A252CliCod ;
   private String[] T01TW18_A11629MeivaId ;
   private boolean[] T01TW18_n11629MeivaId ;
   private byte[] T01TW18_A3115FacDivCod ;
   private boolean[] T01TW18_n3115FacDivCod ;
   private String[] T01TW18_A953IvaCod ;
   private boolean[] T01TW18_n953IvaCod ;
   private byte[] T01TW18_A3140CliDivCod ;
   private boolean[] T01TW18_n3140CliDivCod ;
   private short[] T01TW18_A858ZonGeoCod ;
   private java.math.BigDecimal[] T01TW18_A1718CliRecDGrl ;
   private boolean[] T01TW18_n1718CliRecDGrl ;
   private String[] T01TW18_A1719CliRecDPag ;
   private boolean[] T01TW18_n1719CliRecDPag ;
   private java.math.BigDecimal[] T01TW18_A1720CliRecDPpg ;
   private boolean[] T01TW18_n1720CliRecDPpg ;
   private String[] T01TW18_A1721CliRecFpg ;
   private boolean[] T01TW18_n1721CliRecFpg ;
   private String[] T01TW18_A1722CliRecIVA ;
   private boolean[] T01TW18_n1722CliRecIVA ;
   private byte[] T01TW18_A1723CliRecNVto ;
   private boolean[] T01TW18_n1723CliRecNVto ;
   private String[] T01TW18_A1724CliRecPrd ;
   private boolean[] T01TW18_n1724CliRecPrd ;
   private java.math.BigDecimal[] T01TW18_A3918FacImpTot1 ;
   private java.math.BigDecimal[] T01TW18_A7212FacRect ;
   private java.math.BigDecimal[] T01TW18_A8346FacRecI ;
   private boolean[] T01TW18_n8346FacRecI ;
   private java.math.BigDecimal[] T01TW18_A11513FacRecIca ;
   private String[] T01TW11_A3116FacDivAbr ;
   private boolean[] T01TW11_n3116FacDivAbr ;
   private String[] T01TW9_A3073RepCod ;
   private String[] T01TW19_A3120FacRepNom ;
   private boolean[] T01TW19_n3120FacRepNom ;
   private String[] T01TW20_A279CliNom ;
   private String[] T01TW20_A3091CliDivTra ;
   private boolean[] T01TW20_n3091CliDivTra ;
   private byte[] T01TW20_A3140CliDivCod ;
   private boolean[] T01TW20_n3140CliDivCod ;
   private short[] T01TW20_A858ZonGeoCod ;
   private String[] T01TW21_A3116FacDivAbr ;
   private boolean[] T01TW21_n3116FacDivAbr ;
   private String[] T01TW22_A3073RepCod ;
   private String[] T01TW23_A11630MeivaDsc ;
   private boolean[] T01TW23_n11630MeivaDsc ;
   private String[] T01TW24_A1360ZonGeoNom ;
   private boolean[] T01TW24_n1360ZonGeoNom ;
   private java.math.BigDecimal[] T01TW25_A1718CliRecDGrl ;
   private boolean[] T01TW25_n1718CliRecDGrl ;
   private String[] T01TW25_A1719CliRecDPag ;
   private boolean[] T01TW25_n1719CliRecDPag ;
   private java.math.BigDecimal[] T01TW25_A1720CliRecDPpg ;
   private boolean[] T01TW25_n1720CliRecDPpg ;
   private String[] T01TW25_A1721CliRecFpg ;
   private boolean[] T01TW25_n1721CliRecFpg ;
   private String[] T01TW25_A1722CliRecIVA ;
   private boolean[] T01TW25_n1722CliRecIVA ;
   private byte[] T01TW25_A1723CliRecNVto ;
   private boolean[] T01TW25_n1723CliRecNVto ;
   private String[] T01TW25_A1724CliRecPrd ;
   private boolean[] T01TW25_n1724CliRecPrd ;
   private java.math.BigDecimal[] T01TW27_A3918FacImpTot1 ;
   private String[] T01TW28_A396EmprCod ;
   private int[] T01TW28_A430FacCod ;
   private String[] T01TW5_A7210FacObs ;
   private int[] T01TW5_A430FacCod ;
   private String[] T01TW5_A437FacFpg ;
   private byte[] T01TW5_A443FacIVAPor ;
   private java.util.Date[] T01TW5_A436FacFch ;
   private String[] T01TW5_A450FacPri ;
   private java.math.BigDecimal[] T01TW5_A433FacDtoGen ;
   private java.math.BigDecimal[] T01TW5_A434FacDtoPP ;
   private String[] T01TW5_A1725FacRegIva ;
   private boolean[] T01TW5_n1725FacRegIva ;
   private java.math.BigDecimal[] T01TW5_A453FacRECPor ;
   private java.math.BigDecimal[] T01TW5_A6632FacDto ;
   private byte[] T01TW5_A435FacEst ;
   private int[] T01TW5_A445FacLiC ;
   private String[] T01TW5_A965FacCob ;
   private byte[] T01TW5_A1150FacNumVto ;
   private String[] T01TW5_A1151FacPer ;
   private String[] T01TW5_A1152FacDiaPag ;
   private byte[] T01TW5_A1153FacTipFac ;
   private String[] T01TW5_A960FacIVACod ;
   private String[] T01TW5_A2739FacSerNum ;
   private String[] T01TW5_A3096FacDivTCod ;
   private boolean[] T01TW5_n3096FacDivTCod ;
   private String[] T01TW5_A9605FacFirma ;
   private java.util.Date[] T01TW5_A9606FacHor ;
   private java.math.BigDecimal[] T01TW5_A9643FacLiq1 ;
   private java.math.BigDecimal[] T01TW5_A9644FacLiq2 ;
   private java.math.BigDecimal[] T01TW5_A9645FacIva1 ;
   private java.math.BigDecimal[] T01TW5_A9646FacTot1 ;
   private java.math.BigDecimal[] T01TW5_A14219FacEnergia ;
   private java.math.BigDecimal[] T01TW5_A14224FacCostFac ;
   private java.math.BigDecimal[] T01TW5_A14222FacCostMts ;
   private java.math.BigDecimal[] T01TW5_A14223FacCostKgs ;
   private String[] T01TW5_A396EmprCod ;
   private String[] T01TW5_A3119FacRepCod ;
   private boolean[] T01TW5_n3119FacRepCod ;
   private int[] T01TW5_A252CliCod ;
   private String[] T01TW5_A11629MeivaId ;
   private boolean[] T01TW5_n11629MeivaId ;
   private byte[] T01TW5_A3115FacDivCod ;
   private boolean[] T01TW5_n3115FacDivCod ;
   private java.math.BigDecimal[] T01TW5_A7212FacRect ;
   private java.math.BigDecimal[] T01TW5_A8346FacRecI ;
   private boolean[] T01TW5_n8346FacRecI ;
   private java.math.BigDecimal[] T01TW5_A11513FacRecIca ;
   private int[] T01TW29_A430FacCod ;
   private String[] T01TW29_A396EmprCod ;
   private int[] T01TW30_A430FacCod ;
   private String[] T01TW30_A396EmprCod ;
   private String[] T01TW4_A7210FacObs ;
   private int[] T01TW4_A430FacCod ;
   private String[] T01TW4_A437FacFpg ;
   private byte[] T01TW4_A443FacIVAPor ;
   private java.util.Date[] T01TW4_A436FacFch ;
   private String[] T01TW4_A450FacPri ;
   private java.math.BigDecimal[] T01TW4_A433FacDtoGen ;
   private java.math.BigDecimal[] T01TW4_A434FacDtoPP ;
   private String[] T01TW4_A1725FacRegIva ;
   private boolean[] T01TW4_n1725FacRegIva ;
   private java.math.BigDecimal[] T01TW4_A453FacRECPor ;
   private java.math.BigDecimal[] T01TW4_A6632FacDto ;
   private byte[] T01TW4_A435FacEst ;
   private int[] T01TW4_A445FacLiC ;
   private String[] T01TW4_A965FacCob ;
   private byte[] T01TW4_A1150FacNumVto ;
   private String[] T01TW4_A1151FacPer ;
   private String[] T01TW4_A1152FacDiaPag ;
   private byte[] T01TW4_A1153FacTipFac ;
   private String[] T01TW4_A960FacIVACod ;
   private String[] T01TW4_A2739FacSerNum ;
   private String[] T01TW4_A3096FacDivTCod ;
   private boolean[] T01TW4_n3096FacDivTCod ;
   private String[] T01TW4_A9605FacFirma ;
   private java.util.Date[] T01TW4_A9606FacHor ;
   private java.math.BigDecimal[] T01TW4_A9643FacLiq1 ;
   private java.math.BigDecimal[] T01TW4_A9644FacLiq2 ;
   private java.math.BigDecimal[] T01TW4_A9645FacIva1 ;
   private java.math.BigDecimal[] T01TW4_A9646FacTot1 ;
   private java.math.BigDecimal[] T01TW4_A14219FacEnergia ;
   private java.math.BigDecimal[] T01TW4_A14224FacCostFac ;
   private java.math.BigDecimal[] T01TW4_A14222FacCostMts ;
   private java.math.BigDecimal[] T01TW4_A14223FacCostKgs ;
   private String[] T01TW4_A396EmprCod ;
   private String[] T01TW4_A3119FacRepCod ;
   private boolean[] T01TW4_n3119FacRepCod ;
   private int[] T01TW4_A252CliCod ;
   private String[] T01TW4_A11629MeivaId ;
   private boolean[] T01TW4_n11629MeivaId ;
   private byte[] T01TW4_A3115FacDivCod ;
   private boolean[] T01TW4_n3115FacDivCod ;
   private java.math.BigDecimal[] T01TW4_A7212FacRect ;
   private java.math.BigDecimal[] T01TW4_A8346FacRecI ;
   private boolean[] T01TW4_n8346FacRecI ;
   private java.math.BigDecimal[] T01TW4_A11513FacRecIca ;
   private String[] T01TW34_A3116FacDivAbr ;
   private boolean[] T01TW34_n3116FacDivAbr ;
   private String[] T01TW35_A3120FacRepNom ;
   private boolean[] T01TW35_n3120FacRepNom ;
   private String[] T01TW36_A279CliNom ;
   private String[] T01TW36_A3091CliDivTra ;
   private boolean[] T01TW36_n3091CliDivTra ;
   private byte[] T01TW36_A3140CliDivCod ;
   private boolean[] T01TW36_n3140CliDivCod ;
   private short[] T01TW36_A858ZonGeoCod ;
   private String[] T01TW37_A11630MeivaDsc ;
   private boolean[] T01TW37_n11630MeivaDsc ;
   private String[] T01TW38_A1360ZonGeoNom ;
   private boolean[] T01TW38_n1360ZonGeoNom ;
   private java.math.BigDecimal[] T01TW39_A1718CliRecDGrl ;
   private boolean[] T01TW39_n1718CliRecDGrl ;
   private String[] T01TW39_A1719CliRecDPag ;
   private boolean[] T01TW39_n1719CliRecDPag ;
   private java.math.BigDecimal[] T01TW39_A1720CliRecDPpg ;
   private boolean[] T01TW39_n1720CliRecDPpg ;
   private String[] T01TW39_A1721CliRecFpg ;
   private boolean[] T01TW39_n1721CliRecFpg ;
   private String[] T01TW39_A1722CliRecIVA ;
   private boolean[] T01TW39_n1722CliRecIVA ;
   private byte[] T01TW39_A1723CliRecNVto ;
   private boolean[] T01TW39_n1723CliRecNVto ;
   private String[] T01TW39_A1724CliRecPrd ;
   private boolean[] T01TW39_n1724CliRecPrd ;
   private java.math.BigDecimal[] T01TW41_A3918FacImpTot1 ;
   private String[] T01TW42_A396EmprCod ;
   private int[] T01TW42_A430FacCod ;
   private byte[] T01TW42_A956FacVtoLin ;
   private String[] T01TW44_A396EmprCod ;
   private int[] T01TW44_A430FacCod ;
   private int[] T01TW45_A430FacCod ;
   private int[] T01TW45_A446FacLin ;
   private String[] T01TW45_A454FacSer ;
   private byte[] T01TW45_A428FacAlbTip ;
   private String[] T01TW45_A432FacDsc ;
   private java.math.BigDecimal[] T01TW45_A447FacMts ;
   private java.math.BigDecimal[] T01TW45_A449FacPreMts ;
   private java.math.BigDecimal[] T01TW45_A444FacKgs ;
   private java.math.BigDecimal[] T01TW45_A448FacPreKgs ;
   private String[] T01TW45_A3097FacTipPro ;
   private java.math.BigDecimal[] T01TW45_A5353FacImpMan ;
   private int[] T01TW45_A12197FacUnds ;
   private java.math.BigDecimal[] T01TW45_A12198FacPreUnd ;
   private String[] T01TW45_A396EmprCod ;
   private java.math.BigDecimal[] T01TW45_A5355FacImpMin ;
   private java.math.BigDecimal[] T01TW45_A3898FacPreKgsA ;
   private java.math.BigDecimal[] T01TW45_A3897FacKgsA ;
   private String[] T01TW46_A396EmprCod ;
   private int[] T01TW46_A430FacCod ;
   private int[] T01TW46_A446FacLin ;
   private int[] T01TW3_A430FacCod ;
   private int[] T01TW3_A446FacLin ;
   private String[] T01TW3_A454FacSer ;
   private byte[] T01TW3_A428FacAlbTip ;
   private String[] T01TW3_A432FacDsc ;
   private java.math.BigDecimal[] T01TW3_A447FacMts ;
   private java.math.BigDecimal[] T01TW3_A449FacPreMts ;
   private java.math.BigDecimal[] T01TW3_A444FacKgs ;
   private java.math.BigDecimal[] T01TW3_A448FacPreKgs ;
   private String[] T01TW3_A3097FacTipPro ;
   private java.math.BigDecimal[] T01TW3_A5353FacImpMan ;
   private int[] T01TW3_A12197FacUnds ;
   private java.math.BigDecimal[] T01TW3_A12198FacPreUnd ;
   private String[] T01TW3_A396EmprCod ;
   private java.math.BigDecimal[] T01TW3_A5355FacImpMin ;
   private java.math.BigDecimal[] T01TW3_A3898FacPreKgsA ;
   private java.math.BigDecimal[] T01TW3_A3897FacKgsA ;
   private int[] T01TW2_A430FacCod ;
   private int[] T01TW2_A446FacLin ;
   private String[] T01TW2_A454FacSer ;
   private byte[] T01TW2_A428FacAlbTip ;
   private String[] T01TW2_A432FacDsc ;
   private java.math.BigDecimal[] T01TW2_A447FacMts ;
   private java.math.BigDecimal[] T01TW2_A449FacPreMts ;
   private java.math.BigDecimal[] T01TW2_A444FacKgs ;
   private java.math.BigDecimal[] T01TW2_A448FacPreKgs ;
   private String[] T01TW2_A3097FacTipPro ;
   private java.math.BigDecimal[] T01TW2_A5353FacImpMan ;
   private int[] T01TW2_A12197FacUnds ;
   private java.math.BigDecimal[] T01TW2_A12198FacPreUnd ;
   private String[] T01TW2_A396EmprCod ;
   private java.math.BigDecimal[] T01TW2_A5355FacImpMin ;
   private java.math.BigDecimal[] T01TW2_A3898FacPreKgsA ;
   private java.math.BigDecimal[] T01TW2_A3897FacKgsA ;
   private String[] T01TW50_A396EmprCod ;
   private int[] T01TW50_A430FacCod ;
   private int[] T01TW50_A446FacLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV30CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV25MeivaId_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV22FacFpg_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item15[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV42Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message8[] ;
   private com.genexus.SdtMessages_Message AV44Message ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV16TrnContextAtt ;
}

final  class abonoscargos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class abonoscargos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class abonoscargos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class abonoscargos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class abonoscargos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TW2", "SELECT FacCod, FacLin, FacSer, FacAlbTip, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacTipPro, FacImpMan, FacUnds, FacPreUnd, EmprCod, FacImpMin, FacPreKgsA, FacKgsA FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?  FOR UPDATE OF FacSer, FacAlbTip, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacTipPro, FacImpMan, FacUnds, FacPreUnd, FacImpMin, FacPreKgsA, FacKgsA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW3", "SELECT FacCod, FacLin, FacSer, FacAlbTip, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacTipPro, FacImpMan, FacUnds, FacPreUnd, EmprCod, FacImpMin, FacPreKgsA, FacKgsA FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ? AND FacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW4", "SELECT FacObs, FacCod, FacFpg, FacIVAPor, FacFch, FacPri, FacDtoGen, FacDtoPP, FacRegIva, FacRECPor, FacDto, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacIVACod, FacSerNum, FacDivTCod, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, EmprCod, FacRepCod, CliCod, MeivaId, FacDivCod, FacRect, FacRecI, FacRecIca FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ?  FOR UPDATE OF FacFpg, FacIVAPor, FacFch, FacPri, FacDtoGen, FacDtoPP, FacRegIva, FacRECPor, FacDto, FacObs, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacIVACod, FacSerNum, FacDivTCod, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacRepCod, CliCod, MeivaId, FacDivCod, FacRect, FacRecI, FacRecIca NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW5", "SELECT FacObs, FacCod, FacFpg, FacIVAPor, FacFch, FacPri, FacDtoGen, FacDtoPP, FacRegIva, FacRECPor, FacDto, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacIVACod, FacSerNum, FacDivTCod, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, EmprCod, FacRepCod, CliCod, MeivaId, FacDivCod, FacRect, FacRecI, FacRecIca FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW6", "SELECT EmprNom, Colombia, IvaCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW7", "SELECT RepNom AS FacRepNom FROM TXPREPRES WHERE EmprCod = ? AND RepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW8", "SELECT CliNom, CliDivTra, CliDivCod, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW9", "SELECT RepCod FROM TXPCOMREP WHERE EmprCod = ? AND RepCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW10", "SELECT MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? AND MeivaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW11", "SELECT DivAbr AS FacDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW12", "SELECT IvaPor, IvaRec FROM TXPTIPIVA WHERE IvaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW13", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW14", "SELECT COALESCE( CliDtoGrl, 0) AS CliRecDGrl, COALESCE( CliDiaPag, '') AS CliRecDPag, COALESCE( CliDtoPpg, 0) AS CliRecDPpg, COALESCE( FpgCod, '') AS CliRecFpg, COALESCE( CliRegIVA, '') AS CliRecIVA, COALESCE( CliNroVto, 0) AS CliRecNVto, COALESCE( CliPrd, '') AS CliRecPrd FROM TXPCLIFPG WHERE EmprCod = ? AND CliCod = ? AND CliPri = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW16", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW18", "SELECT /*+ FIRST_ROWS(100) */ TM1.FacObs, T9.CliPri, TM1.FacCod, TM1.FacFpg, TM1.FacIVAPor, T3.EmprNom, TM1.FacFch, TM1.FacPri, T7.CliNom, TM1.FacDtoGen, TM1.FacDtoPP, T4.IvaPor, T4.IvaRec, TM1.FacRegIva, TM1.FacRECPor, TM1.FacDto, TM1.FacEst, TM1.FacLiC, TM1.FacCob, TM1.FacNumVto, TM1.FacPer, TM1.FacDiaPag, TM1.FacTipFac, TM1.FacIVACod, TM1.FacSerNum, T7.CliDivTra, T2.DivAbr AS FacDivAbr, TM1.FacDivTCod, T5.RepNom AS FacRepNom, TM1.FacFirma, TM1.FacHor, TM1.FacLiq1, TM1.FacLiq2, TM1.FacIva1, TM1.FacTot1, T8.ZonGeoNom, T10.MeivaDsc, TM1.FacEnergia, TM1.FacCostFac, T3.Colombia, TM1.FacCostMts, TM1.FacCostKgs, TM1.EmprCod, TM1.FacRepCod AS FacRepCod, TM1.CliCod, TM1.MeivaId, TM1.FacDivCod AS FacDivCod, T3.IvaCod, T7.CliDivCod, T7.ZonGeoCod, COALESCE( T9.CliDtoGrl, 0) AS CliRecDGrl, COALESCE( T9.CliDiaPag, '') AS CliRecDPag, COALESCE( T9.CliDtoPpg, 0) AS CliRecDPpg, COALESCE( T9.FpgCod, '') AS CliRecFpg, COALESCE( T9.CliRegIVA, '') AS CliRecIVA, COALESCE( T9.CliNroVto, 0) AS CliRecNVto, COALESCE( T9.CliPrd, '') AS CliRecPrd, COALESCE( T6.FacImpTot1, 0) AS FacImpTot1, TM1.FacRect, TM1.FacRecI, TM1.FacRecIca FROM (((((((((TXPCFAVEN TM1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = TM1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = TM1.EmprCod) LEFT JOIN TXPTIPIVA T4 ON T4.IvaCod = T3.IvaCod) LEFT JOIN TXPREPRES T5 ON T5.EmprCod = TM1.EmprCod AND T5.RepCod = TM1.FacRepCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.FacCod = TM1.FacCod) INNER JOIN TXPCLIENT T7 ON T7.EmprCod = TM1.EmprCod AND T7.CliCod = TM1.CliCod) LEFT JOIN TXPZONGEO T8 ON T8.EmprCod = TM1.EmprCod AND T8.ZonGeoCod = T7.ZonGeoCod) LEFT JOIN TXPCLIFPG T9 ON T9.EmprCod = TM1.EmprCod AND T9.CliCod = TM1.CliCod AND T9.CliPri = TM1.FacPri) LEFT JOIN TXPMEIVA T10 ON T10.EmprCod = TM1.EmprCod AND T10.MeivaId = TM1.MeivaId) WHERE TM1.EmprCod = ? and TM1.FacCod = ? ORDER BY TM1.EmprCod, TM1.FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW19", "SELECT RepNom AS FacRepNom FROM TXPREPRES WHERE EmprCod = ? AND RepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW20", "SELECT CliNom, CliDivTra, CliDivCod, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW21", "SELECT DivAbr AS FacDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW22", "SELECT RepCod FROM TXPCOMREP WHERE EmprCod = ? AND RepCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW23", "SELECT MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? AND MeivaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW24", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW25", "SELECT COALESCE( CliDtoGrl, 0) AS CliRecDGrl, COALESCE( CliDiaPag, '') AS CliRecDPag, COALESCE( CliDtoPpg, 0) AS CliRecDPpg, COALESCE( FpgCod, '') AS CliRecFpg, COALESCE( CliRegIVA, '') AS CliRecIVA, COALESCE( CliNroVto, 0) AS CliRecNVto, COALESCE( CliPrd, '') AS CliRecPrd FROM TXPCLIFPG WHERE EmprCod = ? AND CliCod = ? AND CliPri = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW27", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW28", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW29", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ FacCod, EmprCod FROM TXPCFAVEN WHERE ( FacCod > ? or FacCod = ? and EmprCod > ?) ORDER BY EmprCod, FacCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TW30", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ FacCod, EmprCod FROM TXPCFAVEN WHERE ( FacCod < ? or FacCod = ? and EmprCod < ?) ORDER BY EmprCod DESC, FacCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TW31", "INSERT INTO TXPCFAVEN(FacCod, FacFpg, FacIVAPor, FacFch, FacPri, FacDtoGen, FacDtoPP, FacRegIva, FacRECPor, FacDto, FacObs, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacIVACod, FacSerNum, FacDivTCod, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, EmprCod, FacRepCod, CliCod, MeivaId, FacDivCod, FacRect, FacRecI, FacRecIca, Factrm, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacObs2, FacMan, FacTpFra, FacAnulada, FacFecAnul, MotAnuID, FacSFD, FacIDATe, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacSerAT, FacTipAT, FacEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCFAVEN")
         ,new UpdateCursor("T01TW32", "UPDATE TXPCFAVEN SET FacFpg=?, FacIVAPor=?, FacFch=?, FacPri=?, FacDtoGen=?, FacDtoPP=?, FacRegIva=?, FacRECPor=?, FacDto=?, FacObs=?, FacEst=?, FacLiC=?, FacCob=?, FacNumVto=?, FacPer=?, FacDiaPag=?, FacTipFac=?, FacIVACod=?, FacSerNum=?, FacDivTCod=?, FacFirma=?, FacHor=?, FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?, FacEnergia=?, FacCostFac=?, FacCostMts=?, FacCostKgs=?, FacRepCod=?, CliCod=?, MeivaId=?, FacDivCod=?, FacRect=?, FacRecI=?, FacRecIca=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new UpdateCursor("T01TW33", "DELETE FROM TXPCFAVEN  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new ForEachCursor("T01TW34", "SELECT DivAbr AS FacDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW35", "SELECT RepNom AS FacRepNom FROM TXPREPRES WHERE EmprCod = ? AND RepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW36", "SELECT CliNom, CliDivTra, CliDivCod, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW37", "SELECT MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? AND MeivaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW38", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW39", "SELECT COALESCE( CliDtoGrl, 0) AS CliRecDGrl, COALESCE( CliDiaPag, '') AS CliRecDPag, COALESCE( CliDtoPpg, 0) AS CliRecDPpg, COALESCE( FpgCod, '') AS CliRecFpg, COALESCE( CliRegIVA, '') AS CliRecIVA, COALESCE( CliNroVto, 0) AS CliRecNVto, COALESCE( CliPrd, '') AS CliRecPrd FROM TXPCLIFPG WHERE EmprCod = ? AND CliCod = ? AND CliPri = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW41", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW42", "SELECT * FROM (SELECT EmprCod, FacCod, FacVtoLin FROM TXPFACVTO WHERE EmprCod = ? AND FacCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TW43", "UPDATE TXPCFAVEN SET FacLiC=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new ForEachCursor("T01TW44", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FacCod FROM TXPCFAVEN ORDER BY EmprCod, FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW45", "SELECT FacCod, FacLin, FacSer, FacAlbTip, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacTipPro, FacImpMan, FacUnds, FacPreUnd, EmprCod, FacImpMin, FacPreKgsA, FacKgsA FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? and FacLin = ? ORDER BY EmprCod, FacCod, FacLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TW46", "SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ? AND FacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TW47", "INSERT INTO TXPLFAVEN(FacCod, FacLin, FacSer, FacAlbTip, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacTipPro, FacImpMan, FacUnds, FacPreUnd, EmprCod, FacImpMin, FacPreKgsA, FacKgsA, FacAlbCod, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacDsc2, FacEncCli, FacBonLi, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPLFAVEN")
         ,new UpdateCursor("T01TW48", "UPDATE TXPLFAVEN SET FacSer=?, FacAlbTip=?, FacDsc=?, FacMts=?, FacPreMts=?, FacKgs=?, FacPreKgs=?, FacTipPro=?, FacImpMan=?, FacUnds=?, FacPreUnd=?, FacImpMin=?, FacPreKgsA=?, FacKgsA=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK, "TXPLFAVEN")
         ,new UpdateCursor("T01TW49", "DELETE FROM TXPLFAVEN  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK, "TXPLFAVEN")
         ,new ForEachCursor("T01TW50", "SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 5);
               ((String[]) buf[17])[0] = rslt.getString(17, 6);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 3);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(22, 200);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,5);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,5);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(31,2);
               ((String[]) buf[33])[0] = rslt.getString(32, 3);
               ((String[]) buf[34])[0] = rslt.getString(33, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(34);
               ((String[]) buf[37])[0] = rslt.getString(35, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(36);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(39,3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 5);
               ((String[]) buf[17])[0] = rslt.getString(17, 6);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 3);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(22, 200);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,5);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,5);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(31,2);
               ((String[]) buf[33])[0] = rslt.getString(32, 3);
               ((String[]) buf[34])[0] = rslt.getString(33, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(34);
               ((String[]) buf[37])[0] = rslt.getString(35, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(36);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(39,3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,3);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((String[]) buf[24])[0] = rslt.getString(21, 5);
               ((String[]) buf[25])[0] = rslt.getString(22, 6);
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 3);
               ((String[]) buf[28])[0] = rslt.getString(25, 3);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(27, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(29, 34);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(30, 200);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(31);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(34,5);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(35,5);
               ((String[]) buf[43])[0] = rslt.getString(36, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(37);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(38,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(39,2);
               ((byte[]) buf[49])[0] = rslt.getByte(40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[53])[0] = rslt.getString(43, 3);
               ((String[]) buf[54])[0] = rslt.getString(44, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((int[]) buf[56])[0] = rslt.getInt(45);
               ((String[]) buf[57])[0] = rslt.getString(46, 4);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(47);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(48, 3);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(49);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(50);
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(52, 6);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(54, 2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(56);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(57, 5);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(58,2);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(59,2);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(61,3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 22 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 35 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 25 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 1);
               }
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 3);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               stmt.setLongVarchar(11, (String)parms[11], false);
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setString(14, (String)parms[14], 1);
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setString(16, (String)parms[16], 5);
               stmt.setString(17, (String)parms[17], 6);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setString(19, (String)parms[19], 3);
               stmt.setString(20, (String)parms[20], 3);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[22], 1);
               }
               stmt.setString(22, (String)parms[23], 200);
               stmt.setDateTime(23, (java.util.Date)parms[24], false);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[25], 5);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[26], 5);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[27], 5);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[28], 5);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[32], 2);
               stmt.setString(32, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[35], 6);
               }
               stmt.setInt(34, ((Number) parms[36]).intValue());
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[38], 4);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(36, ((Number) parms[40]).byteValue());
               }
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[41], 2);
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[43], 2);
               }
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[44], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 1);
               }
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 3);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               stmt.setLongVarchar(10, (String)parms[10], false);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setString(13, (String)parms[13], 1);
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setString(15, (String)parms[15], 5);
               stmt.setString(16, (String)parms[16], 6);
               stmt.setByte(17, ((Number) parms[17]).byteValue());
               stmt.setString(18, (String)parms[18], 3);
               stmt.setString(19, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[21], 1);
               }
               stmt.setString(21, (String)parms[22], 200);
               stmt.setDateTime(22, (java.util.Date)parms[23], false);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[24], 5);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[25], 5);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[26], 5);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[27], 5);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[28], 2);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[31], 2);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[33], 6);
               }
               stmt.setInt(32, ((Number) parms[34]).intValue());
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[36], 4);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(34, ((Number) parms[38]).byteValue());
               }
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[39], 2);
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[41], 2);
               }
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[42], 3);
               stmt.setString(38, (String)parms[43], 3);
               stmt.setInt(39, ((Number) parms[44]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 40);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 5);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 40);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setString(15, (String)parms[14], 3);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

