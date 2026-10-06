package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmpreve_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9429PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9479PMTCod = (int)(GXutil.lval( httpContext.GetPar( "PMTCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_13V1533( Gx_mode, A396EmprCod, A9429PMCod, A9479PMTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PMOPERES") == 0 )
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
         gxsgapmoperes13V0( A396EmprCod, A13748OpeCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PMOPERES") == 0 )
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
         gxsgapmoperes13V0( A396EmprCod, A13748OpeCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PMOPERES") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9481PMOpeRes = httpContext.GetPar( "h9481PMOpeRes") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcapmoperes13V1523( A396EmprCod, h9481PMOpeRes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"PMCOD") == 0 )
      {
         AV13PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13PMCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13PMCod), "ZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asapmcod13V1236( AV13PMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"PMCOD") == 0 )
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
         gx7asapmcod13V1236( Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel28"+"_"+"vMAQEQUDSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9476PMMaqCod = httpContext.GetPar( "PMMaqCod") ;
         n9476PMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
         A11450PMMEquCod = httpContext.GetPar( "PMMEquCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx28asamaqequdsc13V1532( A396EmprCod, A9476PMMaqCod, A11450PMMEquCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_39") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_39( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9476PMMaqCod = httpContext.GetPar( "PMMaqCod") ;
         n9476PMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_40( A396EmprCod, A9476PMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_41") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14271PMTipoID = (short)(GXutil.lval( httpContext.GetPar( "PMTipoID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_41( A396EmprCod, A14271PMTipoID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9476PMMaqCod = httpContext.GetPar( "PMMaqCod") ;
         n9476PMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
         A11450PMMEquCod = httpContext.GetPar( "PMMEquCod") ;
         A11451PMMSEqCod = httpContext.GetPar( "PMMSEqCod") ;
         A11452PMMPieCod = httpContext.GetPar( "PMMPieCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod, A9476PMMaqCod, A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9489PMRepCod = (int)(GXutil.lval( httpContext.GetPar( "PMRepCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_45( A396EmprCod, A9489PMRepCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9479PMTCod = (int)(GXutil.lval( httpContext.GetPar( "PMTCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_47( A396EmprCod, A9479PMTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9481PMOpeRes = (int)(GXutil.lval( httpContext.GetPar( "PMOpeRes"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_49( A396EmprCod, A9481PMOpeRes) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_responsables") == 0 )
      {
         gxnrgridlevel_responsables_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_tareas") == 0 )
      {
         gxnrgridlevel_tareas_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_repuestos") == 0 )
      {
         gxnrgridlevel_repuestos_newrow_invoke( ) ;
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
            AV20EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
            AV13PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13PMCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13PMCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Preventivo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPMDsc_Internalname ;
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
      nRC_GXsfl_177 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_177"))) ;
      nGXsfl_177_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_177_idx"))) ;
      sGXsfl_177_idx = httpContext.GetPar( "sGXsfl_177_idx") ;
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

   public void gxnrgridlevel_responsables_newrow_invoke( )
   {
      nRC_GXsfl_193 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_193"))) ;
      nGXsfl_193_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_193_idx"))) ;
      sGXsfl_193_idx = httpContext.GetPar( "sGXsfl_193_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_responsables_newrow( ) ;
      /* End function gxnrGridlevel_responsables_newrow_invoke */
   }

   public void gxnrgridlevel_tareas_newrow_invoke( )
   {
      nRC_GXsfl_206 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_206"))) ;
      nGXsfl_206_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_206_idx"))) ;
      sGXsfl_206_idx = httpContext.GetPar( "sGXsfl_206_idx") ;
      edtPMTCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Horizontalalignment", edtPMTCod_Horizontalalignment, !bGXsfl_206_Refreshing);
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

   public void gxnrgridlevel_repuestos_newrow_invoke( )
   {
      nRC_GXsfl_213 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_213"))) ;
      nGXsfl_213_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_213_idx"))) ;
      sGXsfl_213_idx = httpContext.GetPar( "sGXsfl_213_idx") ;
      edtPMRepCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Horizontalalignment", edtPMRepCod_Horizontalalignment, !bGXsfl_213_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_repuestos_newrow( ) ;
      /* End function gxnrGridlevel_repuestos_newrow_invoke */
   }

   public tmpreve_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmpreve_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmpreve_impl.class ));
   }

   public tmpreve_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbPMEst = new HTMLChoice();
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
      if ( cmbPMEst.getItemCount() > 0 )
      {
         A9478PMEst = cmbPMEst.getValidValue(A9478PMEst) ;
         n9478PMEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPMEst.setValue( GXutil.rtrim( A9478PMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPMEst.getInternalname(), "Values", cmbPMEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMCod_Internalname, "#", " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDsc_Internalname, httpContext.getMessage( "Mantenimiento Preventivo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDsc_Internalname, GXutil.rtrim( A9473PMDsc), GXutil.rtrim( localUtil.format( A9473PMDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedpmtipoid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmtipoid_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblockpmtipoid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_pmtipoid.setProperty("Caption", Combo_pmtipoid_Caption);
      ucCombo_pmtipoid.setProperty("Cls", Combo_pmtipoid_Cls);
      ucCombo_pmtipoid.setProperty("EmptyItem", Combo_pmtipoid_Emptyitem);
      ucCombo_pmtipoid.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_pmtipoid.setProperty("DropDownOptionsData", AV32PMTipoID_Data);
      ucCombo_pmtipoid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pmtipoid_Internalname, "COMBO_PMTIPOIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMTipoID_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMTipoID_Internalname, GXutil.ltrim( localUtil.ntoc( A14271PMTipoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14271PMTipoID), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMTipoID_Jsonclick, 0, "Attribute", "", "", "", "", edtPMTipoID_Visible, edtPMTipoID_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedpmmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmmaqcod_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblockpmmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_pmmaqcod.setProperty("Caption", Combo_pmmaqcod_Caption);
      ucCombo_pmmaqcod.setProperty("Cls", Combo_pmmaqcod_Cls);
      ucCombo_pmmaqcod.setProperty("EmptyItemText", Combo_pmmaqcod_Emptyitemtext);
      ucCombo_pmmaqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_pmmaqcod.setProperty("DropDownOptionsData", AV22PMMaqCod_Data);
      ucCombo_pmmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pmmaqcod_Internalname, "COMBO_PMMAQCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMMaqCod_Internalname, httpContext.getMessage( "Maquina en Preventivo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMMaqCod_Internalname, GXutil.rtrim( A9476PMMaqCod), GXutil.rtrim( localUtil.format( A9476PMMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtPMMaqCod_Visible, edtPMMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPMEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbPMEst.getInternalname(), httpContext.getMessage( "Estado", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPMEst, cmbPMEst.getInternalname(), GXutil.rtrim( A9478PMEst), 1, cmbPMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPMEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      cmbPMEst.setValue( GXutil.rtrim( A9478PMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPMEst.getInternalname(), "Values", cmbPMEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMFchCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMFchCre_Internalname, httpContext.getMessage( "Fecha Creación", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPMFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMFchCre_Internalname, localUtil.format(A9474PMFchCre, "99/99/99"), localUtil.format( A9474PMFchCre, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMFchCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPMFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMUsuCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMUsuCre_Internalname, httpContext.getMessage( "Usuario Creación", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMUsuCre_Internalname, GXutil.rtrim( A9475PMUsuCre), GXutil.rtrim( localUtil.format( A9475PMUsuCre, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUsuCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
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
      /* User Defined Control */
      ucDvpanel_tablefrecuencia.setProperty("Width", Dvpanel_tablefrecuencia_Width);
      ucDvpanel_tablefrecuencia.setProperty("AutoWidth", Dvpanel_tablefrecuencia_Autowidth);
      ucDvpanel_tablefrecuencia.setProperty("AutoHeight", Dvpanel_tablefrecuencia_Autoheight);
      ucDvpanel_tablefrecuencia.setProperty("Cls", Dvpanel_tablefrecuencia_Cls);
      ucDvpanel_tablefrecuencia.setProperty("Title", Dvpanel_tablefrecuencia_Title);
      ucDvpanel_tablefrecuencia.setProperty("Collapsible", Dvpanel_tablefrecuencia_Collapsible);
      ucDvpanel_tablefrecuencia.setProperty("Collapsed", Dvpanel_tablefrecuencia_Collapsed);
      ucDvpanel_tablefrecuencia.setProperty("ShowCollapseIcon", Dvpanel_tablefrecuencia_Showcollapseicon);
      ucDvpanel_tablefrecuencia.setProperty("IconPosition", Dvpanel_tablefrecuencia_Iconposition);
      ucDvpanel_tablefrecuencia.setProperty("AutoScroll", Dvpanel_tablefrecuencia_Autoscroll);
      ucDvpanel_tablefrecuencia.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablefrecuencia_Internalname, "DVPANEL_TABLEFRECUENCIAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEFRECUENCIAContainer"+"TableFrecuencia"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablefrecuencia_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Frecuencia", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFrecuencia_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmdias_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmdias_Internalname, httpContext.getMessage( "Días", ""), "", "", lblTextblockpmdias_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDias_Internalname, httpContext.getMessage( "Días", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDias_Internalname, GXutil.ltrim( localUtil.ntoc( A9487PMDias, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9487PMDias), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9487PMDias), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDias_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDias_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmuso_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmuso_Internalname, httpContext.getMessage( "Uso del Equipo", ""), "", "", lblTextblockpmuso_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMUso_Internalname, httpContext.getMessage( "Uso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMUso_Internalname, GXutil.ltrim( localUtil.ntoc( A11454PMUso, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMUso_Enabled!=0) ? localUtil.format( A11454PMUso, "ZZZZ9.99") : localUtil.format( A11454PMUso, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUso_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmusomts_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmusomts_Internalname, httpContext.getMessage( "Uso en Metros", ""), "", "", lblTextblockpmusomts_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMUsoMts_Internalname, httpContext.getMessage( "Uso en funcion Metros Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMUsoMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13013PMUsoMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMUsoMts_Enabled!=0) ? localUtil.format( A13013PMUsoMts, "ZZZZZZ9.99") : localUtil.format( A13013PMUsoMts, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUsoMts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUsoMts_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup7_Internalname, httpContext.getMessage( "Planificación", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPlanificacion_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmtie_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmtie_Internalname, httpContext.getMessage( "Minutos Previstos", ""), "", "", lblTextblockpmtie_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMTie_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMTie_Internalname, GXutil.ltrim( localUtil.ntoc( A11455PMTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMTie_Enabled!=0) ? localUtil.format( A11455PMTie, "ZZ9.99") : localUtil.format( A11455PMTie, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMTie_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmpla_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmpla_Internalname, httpContext.getMessage( "Planificar", ""), "", "", lblTextblockpmpla_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMPla_Internalname, httpContext.getMessage( "Planificar", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMPla_Internalname, GXutil.rtrim( A11456PMPla), GXutil.rtrim( localUtil.format( A11456PMPla, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMPla_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMPla_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup8_Internalname, httpContext.getMessage( "Validez", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divValidez_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmini_Internalname, httpContext.getMessage( "Inicio", ""), "", "", lblTextblockpmini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMIni_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPMIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMIni_Internalname, localUtil.format(A9484PMIni, "99/99/99"), localUtil.format( A9484PMIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMIni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMIni_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPMIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmfin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmfin_Internalname, httpContext.getMessage( "Fin", ""), "", "", lblTextblockpmfin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMFin_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPMFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMFin_Internalname, localUtil.format(A9485PMFin, "99/99/99"), localUtil.format( A9485PMFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMFin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMFin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPMFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup9_Internalname, httpContext.getMessage( "Ultima Instancia", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUltimainstancia_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmult_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmult_Internalname, httpContext.getMessage( "Ultima", ""), "", "", lblTextblockpmult_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMUlt_Internalname, httpContext.getMessage( "Ultima", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPMUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMUlt_Internalname, localUtil.format(A9486PMUlt, "99/99/99"), localUtil.format( A9486PMUlt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPMUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmord_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmord_Internalname, httpContext.getMessage( "Orden Actual", ""), "", "", lblTextblockpmord_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMOrd_Internalname, httpContext.getMessage( "Orden Actual", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9488PMOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9488PMOrd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9488PMOrd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMOrd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMOrd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
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
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tabletexto.setProperty("Width", Dvpanel_tabletexto_Width);
      ucDvpanel_tabletexto.setProperty("AutoWidth", Dvpanel_tabletexto_Autowidth);
      ucDvpanel_tabletexto.setProperty("AutoHeight", Dvpanel_tabletexto_Autoheight);
      ucDvpanel_tabletexto.setProperty("Cls", Dvpanel_tabletexto_Cls);
      ucDvpanel_tabletexto.setProperty("Title", Dvpanel_tabletexto_Title);
      ucDvpanel_tabletexto.setProperty("Collapsible", Dvpanel_tabletexto_Collapsible);
      ucDvpanel_tabletexto.setProperty("Collapsed", Dvpanel_tabletexto_Collapsed);
      ucDvpanel_tabletexto.setProperty("ShowCollapseIcon", Dvpanel_tabletexto_Showcollapseicon);
      ucDvpanel_tabletexto.setProperty("IconPosition", Dvpanel_tabletexto_Iconposition);
      ucDvpanel_tabletexto.setProperty("AutoScroll", Dvpanel_tabletexto_Autoscroll);
      ucDvpanel_tabletexto.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tabletexto_Internalname, "DVPANEL_TABLETEXTOContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLETEXTOContainer"+"TableTexto"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTabletexto_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMTxt_Internalname, httpContext.getMessage( "Texto del Preventivo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPMTxt_Internalname, A9483PMTxt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,163);\"", (short)(0), 1, edtPMTxt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MantenimientoMaquina\\TMPreve.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable4_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable4_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
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
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_responsables_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_responsables( ) ;
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_repuestos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_repuestos( ) ;
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreve.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV35Pgmname), GXutil.rtrim( localUtil.format( AV35Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_pmtipoid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombopmtipoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV33ComboPMTipoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombopmtipoid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33ComboPMTipoID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33ComboPMTipoID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombopmtipoid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombopmtipoid_Visible, edtavCombopmtipoid_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_pmmaqcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombopmmaqcod_Internalname, GXutil.rtrim( AV25ComboPMMaqCod), GXutil.rtrim( localUtil.format( AV25ComboPMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombopmmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombopmmaqcod_Visible, edtavCombopmmaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_pmmequcod.setProperty("Caption", Combo_pmmequcod_Caption);
      ucCombo_pmmequcod.setProperty("Cls", Combo_pmmequcod_Cls);
      ucCombo_pmmequcod.setProperty("IsGridItem", Combo_pmmequcod_Isgriditem);
      ucCombo_pmmequcod.setProperty("EmptyItem", Combo_pmmequcod_Emptyitem);
      ucCombo_pmmequcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_pmmequcod.setProperty("DropDownOptionsData", AV29PMMEquCod_Data);
      ucCombo_pmmequcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pmmequcod_Internalname, "COMBO_PMMEQUCODContainer");
      /* User Defined Control */
      ucCombo_pmmseqcod.setProperty("Caption", Combo_pmmseqcod_Caption);
      ucCombo_pmmseqcod.setProperty("Cls", Combo_pmmseqcod_Cls);
      ucCombo_pmmseqcod.setProperty("IsGridItem", Combo_pmmseqcod_Isgriditem);
      ucCombo_pmmseqcod.setProperty("EmptyItem", Combo_pmmseqcod_Emptyitem);
      ucCombo_pmmseqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_pmmseqcod.setProperty("DropDownOptionsData", AV30PMMSEqCod_Data);
      ucCombo_pmmseqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pmmseqcod_Internalname, "COMBO_PMMSEQCODContainer");
      /* User Defined Control */
      ucCombo_pmmpiecod.setProperty("Caption", Combo_pmmpiecod_Caption);
      ucCombo_pmmpiecod.setProperty("Cls", Combo_pmmpiecod_Cls);
      ucCombo_pmmpiecod.setProperty("IsGridItem", Combo_pmmpiecod_Isgriditem);
      ucCombo_pmmpiecod.setProperty("EmptyItem", Combo_pmmpiecod_Emptyitem);
      ucCombo_pmmpiecod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_pmmpiecod.setProperty("DropDownOptionsData", AV31PMMPieCod_Data);
      ucCombo_pmmpiecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pmmpiecod_Internalname, "COMBO_PMMPIECODContainer");
      /* User Defined Control */
      ucCombo_pmtcod.setProperty("Caption", Combo_pmtcod_Caption);
      ucCombo_pmtcod.setProperty("Cls", Combo_pmtcod_Cls);
      ucCombo_pmtcod.setProperty("IsGridItem", Combo_pmtcod_Isgriditem);
      ucCombo_pmtcod.setProperty("EmptyItem", Combo_pmtcod_Emptyitem);
      ucCombo_pmtcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_pmtcod.setProperty("DropDownOptionsData", AV28PMTCod_Data);
      ucCombo_pmtcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pmtcod_Internalname, "COMBO_PMTCODContainer");
      /* User Defined Control */
      ucCombo_pmrepcod.setProperty("Caption", Combo_pmrepcod_Caption);
      ucCombo_pmrepcod.setProperty("Cls", Combo_pmrepcod_Cls);
      ucCombo_pmrepcod.setProperty("IsGridItem", Combo_pmrepcod_Isgriditem);
      ucCombo_pmrepcod.setProperty("EmptyItem", Combo_pmrepcod_Emptyitem);
      ucCombo_pmrepcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_pmrepcod.setProperty("DropDownOptionsData", AV27PMRepCod_Data);
      ucCombo_pmrepcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pmrepcod_Internalname, "COMBO_PMREPCODContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMMaqDsc_Internalname, GXutil.rtrim( A9477PMMaqDsc), GXutil.rtrim( localUtil.format( A9477PMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtPMMaqDsc_Visible, edtPMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreve.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_equipos( )
   {
      /*  Grid Control  */
      startgridcontrol177( ) ;
      nGXsfl_177_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1532 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1532 = (short)(1) ;
            scanStart13V1532( ) ;
            while ( RcdFound1532 != 0 )
            {
               init_level_properties1532( ) ;
               getByPrimaryKey13V1532( ) ;
               addRow13V1532( ) ;
               scanNext13V1532( ) ;
            }
            scanEnd13V1532( ) ;
            nBlankRcdCount1532 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13V1532( ) ;
         standaloneModal13V1532( ) ;
         sMode1532 = Gx_mode ;
         while ( nGXsfl_177_idx < nRC_GXsfl_177 )
         {
            bGXsfl_177_Refreshing = true ;
            readRow13V1532( ) ;
            edtPMMEquCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMEQUCOD_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
            edtPMMEquDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMEQUDSC_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMMEquDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
            edtPMMSEqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMSEQCOD_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
            edtPMMSEqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMSEQDSC_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
            edtPMMPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMPIECOD_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
            edtPMMPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMPIEDSC_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMMPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
            if ( ( nRcdExists_1532 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13V1532( ) ;
            }
            sendRow13V1532( ) ;
            bGXsfl_177_Refreshing = false ;
         }
         Gx_mode = sMode1532 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1532 = (short)(5) ;
         nRcdExists_1532 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13V1532( ) ;
            while ( RcdFound1532 != 0 )
            {
               sGXsfl_177_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_177_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1771532( ) ;
               init_level_properties1532( ) ;
               standaloneNotModal13V1532( ) ;
               getByPrimaryKey13V1532( ) ;
               standaloneModal13V1532( ) ;
               addRow13V1532( ) ;
               scanNext13V1532( ) ;
            }
            scanEnd13V1532( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1532 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_177_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_177_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1771532( ) ;
         initAll13V1532( ) ;
         init_level_properties1532( ) ;
         nRcdExists_1532 = (short)(0) ;
         nIsMod_1532 = (short)(0) ;
         nRcdDeleted_1532 = (short)(0) ;
         nBlankRcdCount1532 = (short)(nBlankRcdUsr1532+nBlankRcdCount1532) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1532 > 0 )
         {
            standaloneNotModal13V1532( ) ;
            standaloneModal13V1532( ) ;
            addRow13V1532( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPMMEquCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1532 = (short)(nBlankRcdCount1532-1) ;
         }
         Gx_mode = sMode1532 ;
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

   public void gxdraw_gridlevel_responsables( )
   {
      /*  Grid Control  */
      startgridcontrol193( ) ;
      nGXsfl_193_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1523 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1523 = (short)(1) ;
            scanStart13V1523( ) ;
            while ( RcdFound1523 != 0 )
            {
               init_level_properties1523( ) ;
               getByPrimaryKey13V1523( ) ;
               addRow13V1523( ) ;
               scanNext13V1523( ) ;
            }
            scanEnd13V1523( ) ;
            nBlankRcdCount1523 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13V1523( ) ;
         standaloneModal13V1523( ) ;
         sMode1523 = Gx_mode ;
         while ( nGXsfl_193_idx < nRC_GXsfl_193 )
         {
            bGXsfl_193_Refreshing = true ;
            readRow13V1523( ) ;
            edtPMOpeRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMOPERES_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMOpeRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeRes_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtPMOpeResN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMOPERESN_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMOpeResN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeResN_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtPMOpeTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMOPETIE_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMOpeTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeTie_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            if ( ( nRcdExists_1523 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13V1523( ) ;
            }
            sendRow13V1523( ) ;
            bGXsfl_193_Refreshing = false ;
         }
         Gx_mode = sMode1523 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1523 = (short)(5) ;
         nRcdExists_1523 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13V1523( ) ;
            while ( RcdFound1523 != 0 )
            {
               sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1931523( ) ;
               init_level_properties1523( ) ;
               standaloneNotModal13V1523( ) ;
               getByPrimaryKey13V1523( ) ;
               standaloneModal13V1523( ) ;
               addRow13V1523( ) ;
               scanNext13V1523( ) ;
            }
            scanEnd13V1523( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1523 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1931523( ) ;
         initAll13V1523( ) ;
         init_level_properties1523( ) ;
         nRcdExists_1523 = (short)(0) ;
         nIsMod_1523 = (short)(0) ;
         nRcdDeleted_1523 = (short)(0) ;
         nBlankRcdCount1523 = (short)(nBlankRcdUsr1523+nBlankRcdCount1523) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1523 > 0 )
         {
            standaloneNotModal13V1523( ) ;
            standaloneModal13V1523( ) ;
            addRow13V1523( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPMOpeRes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1523 = (short)(nBlankRcdCount1523-1) ;
         }
         Gx_mode = sMode1523 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_responsablesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_responsables", Gridlevel_responsablesContainer, subGridlevel_responsables_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_responsablesContainerData", Gridlevel_responsablesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_responsablesContainerData"+"V", Gridlevel_responsablesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_responsablesContainerData"+"V"+"\" value='"+Gridlevel_responsablesContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridlevel_tareas( )
   {
      /*  Grid Control  */
      startgridcontrol206( ) ;
      nGXsfl_206_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1533 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1533 = (short)(1) ;
            scanStart13V1533( ) ;
            while ( RcdFound1533 != 0 )
            {
               init_level_properties1533( ) ;
               getByPrimaryKey13V1533( ) ;
               addRow13V1533( ) ;
               scanNext13V1533( ) ;
            }
            scanEnd13V1533( ) ;
            nBlankRcdCount1533 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13V1533( ) ;
         standaloneModal13V1533( ) ;
         sMode1533 = Gx_mode ;
         while ( nGXsfl_206_idx < nRC_GXsfl_206 )
         {
            bGXsfl_206_Refreshing = true ;
            readRow13V1533( ) ;
            edtPMTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTCOD_"+sGXsfl_206_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_206_Refreshing);
            edtPMTCod_Horizontalalignment = httpContext.cgiGet( "PMTCOD_"+sGXsfl_206_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Horizontalalignment", edtPMTCod_Horizontalalignment, !bGXsfl_206_Refreshing);
            edtPMTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTDSC_"+sGXsfl_206_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTDsc_Enabled), 5, 0), !bGXsfl_206_Refreshing);
            if ( ( nRcdExists_1533 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13V1533( ) ;
            }
            sendRow13V1533( ) ;
            bGXsfl_206_Refreshing = false ;
         }
         Gx_mode = sMode1533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1533 = (short)(5) ;
         nRcdExists_1533 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13V1533( ) ;
            while ( RcdFound1533 != 0 )
            {
               sGXsfl_206_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_206_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2061533( ) ;
               init_level_properties1533( ) ;
               standaloneNotModal13V1533( ) ;
               getByPrimaryKey13V1533( ) ;
               standaloneModal13V1533( ) ;
               addRow13V1533( ) ;
               scanNext13V1533( ) ;
            }
            scanEnd13V1533( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1533 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_206_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_206_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_2061533( ) ;
         initAll13V1533( ) ;
         init_level_properties1533( ) ;
         nRcdExists_1533 = (short)(0) ;
         nIsMod_1533 = (short)(0) ;
         nRcdDeleted_1533 = (short)(0) ;
         nBlankRcdCount1533 = (short)(nBlankRcdUsr1533+nBlankRcdCount1533) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1533 > 0 )
         {
            standaloneNotModal13V1533( ) ;
            standaloneModal13V1533( ) ;
            addRow13V1533( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPMTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1533 = (short)(nBlankRcdCount1533-1) ;
         }
         Gx_mode = sMode1533 ;
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

   public void gxdraw_gridlevel_repuestos( )
   {
      /*  Grid Control  */
      startgridcontrol213( ) ;
      nGXsfl_213_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1237 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1237 = (short)(1) ;
            scanStart13V1237( ) ;
            while ( RcdFound1237 != 0 )
            {
               init_level_properties1237( ) ;
               getByPrimaryKey13V1237( ) ;
               addRow13V1237( ) ;
               scanNext13V1237( ) ;
            }
            scanEnd13V1237( ) ;
            nBlankRcdCount1237 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13V1237( ) ;
         standaloneModal13V1237( ) ;
         sMode1237 = Gx_mode ;
         while ( nGXsfl_213_idx < nRC_GXsfl_213 )
         {
            bGXsfl_213_Refreshing = true ;
            readRow13V1237( ) ;
            edtPMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMREPCOD_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepCod_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            edtPMRepCod_Horizontalalignment = httpContext.cgiGet( "PMREPCOD_"+sGXsfl_213_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Horizontalalignment", edtPMRepCod_Horizontalalignment, !bGXsfl_213_Refreshing);
            edtPMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMREPNOM_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepNom_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            edtPMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMRRCNT_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRRCnt_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            if ( ( nRcdExists_1237 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13V1237( ) ;
            }
            sendRow13V1237( ) ;
            bGXsfl_213_Refreshing = false ;
         }
         Gx_mode = sMode1237 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1237 = (short)(5) ;
         nRcdExists_1237 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13V1237( ) ;
            while ( RcdFound1237 != 0 )
            {
               sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2131237( ) ;
               init_level_properties1237( ) ;
               standaloneNotModal13V1237( ) ;
               getByPrimaryKey13V1237( ) ;
               standaloneModal13V1237( ) ;
               addRow13V1237( ) ;
               scanNext13V1237( ) ;
            }
            scanEnd13V1237( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1237 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_2131237( ) ;
         initAll13V1237( ) ;
         init_level_properties1237( ) ;
         nRcdExists_1237 = (short)(0) ;
         nIsMod_1237 = (short)(0) ;
         nRcdDeleted_1237 = (short)(0) ;
         nBlankRcdCount1237 = (short)(nBlankRcdUsr1237+nBlankRcdCount1237) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1237 > 0 )
         {
            standaloneNotModal13V1237( ) ;
            standaloneModal13V1237( ) ;
            addRow13V1237( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPMRepCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1237 = (short)(nBlankRcdCount1237-1) ;
         }
         Gx_mode = sMode1237 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_repuestosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_repuestos", Gridlevel_repuestosContainer, subGridlevel_repuestos_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_repuestosContainerData", Gridlevel_repuestosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_repuestosContainerData"+"V", Gridlevel_repuestosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_repuestosContainerData"+"V"+"\" value='"+Gridlevel_repuestosContainer.GridValuesHidden()+"'/>") ;
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
      e1113V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPMTIPOID_DATA"), AV32PMTipoID_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPMMAQCOD_DATA"), AV22PMMaqCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPMMEQUCOD_DATA"), AV29PMMEquCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPMMSEQCOD_DATA"), AV30PMMSEqCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPMMPIECOD_DATA"), AV31PMMPieCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPMTCOD_DATA"), AV28PMTCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPMREPCOD_DATA"), AV27PMRepCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9473PMDsc = httpContext.cgiGet( "Z9473PMDsc") ;
            Z9474PMFchCre = localUtil.ctod( httpContext.cgiGet( "Z9474PMFchCre"), 0) ;
            Z9475PMUsuCre = httpContext.cgiGet( "Z9475PMUsuCre") ;
            Z9478PMEst = httpContext.cgiGet( "Z9478PMEst") ;
            Z9483PMTxt = httpContext.cgiGet( "Z9483PMTxt") ;
            Z9484PMIni = localUtil.ctod( httpContext.cgiGet( "Z9484PMIni"), 0) ;
            Z9485PMFin = localUtil.ctod( httpContext.cgiGet( "Z9485PMFin"), 0) ;
            Z9486PMUlt = localUtil.ctod( httpContext.cgiGet( "Z9486PMUlt"), 0) ;
            Z11454PMUso = localUtil.ctond( httpContext.cgiGet( "Z11454PMUso")) ;
            Z9487PMDias = (short)(localUtil.ctol( httpContext.cgiGet( "Z9487PMDias"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9488PMOrd = (int)(localUtil.ctol( httpContext.cgiGet( "Z9488PMOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11455PMTie = localUtil.ctond( httpContext.cgiGet( "Z11455PMTie")) ;
            Z11456PMPla = httpContext.cgiGet( "Z11456PMPla") ;
            Z13013PMUsoMts = localUtil.ctond( httpContext.cgiGet( "Z13013PMUsoMts")) ;
            Z14275PMDiasPavi = (short)(localUtil.ctol( httpContext.cgiGet( "Z14275PMDiasPavi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14274PMTieMto = localUtil.ctond( httpContext.cgiGet( "Z14274PMTieMto")) ;
            Z9476PMMaqCod = httpContext.cgiGet( "Z9476PMMaqCod") ;
            Z14271PMTipoID = (short)(localUtil.ctol( httpContext.cgiGet( "Z14271PMTipoID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14275PMDiasPavi = (short)(localUtil.ctol( httpContext.cgiGet( "Z14275PMDiasPavi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14275PMDiasPavi = false ;
            A14274PMTieMto = localUtil.ctond( httpContext.cgiGet( "Z14274PMTieMto")) ;
            n14274PMTieMto = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_177 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_177"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_213 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_213"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_206 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_206"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_193 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_193"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9476PMMaqCod = httpContext.cgiGet( "N9476PMMaqCod") ;
            N14271PMTipoID = (short)(localUtil.ctol( httpContext.cgiGet( "N14271PMTipoID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vPMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Insert_PMMaqCod = httpContext.cgiGet( "vINSERT_PMMAQCOD") ;
            AV26Insert_PMTipoID = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PMTIPOID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A14275PMDiasPavi = (short)(localUtil.ctol( httpContext.cgiGet( "PMDIASPAVI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14274PMTieMto = localUtil.ctond( httpContext.cgiGet( "PMTIEMTO")) ;
            A14272PMTipoDsc = httpContext.cgiGet( "PMTIPODSC") ;
            AV14MaqEquDsc = httpContext.cgiGet( "vMAQEQUDSC") ;
            A9481PMOpeRes = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCPMOPERES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmtipoid_Objectcall = httpContext.cgiGet( "COMBO_PMTIPOID_Objectcall") ;
            Combo_pmtipoid_Class = httpContext.cgiGet( "COMBO_PMTIPOID_Class") ;
            Combo_pmtipoid_Icontype = httpContext.cgiGet( "COMBO_PMTIPOID_Icontype") ;
            Combo_pmtipoid_Icon = httpContext.cgiGet( "COMBO_PMTIPOID_Icon") ;
            Combo_pmtipoid_Caption = httpContext.cgiGet( "COMBO_PMTIPOID_Caption") ;
            Combo_pmtipoid_Tooltip = httpContext.cgiGet( "COMBO_PMTIPOID_Tooltip") ;
            Combo_pmtipoid_Cls = httpContext.cgiGet( "COMBO_PMTIPOID_Cls") ;
            Combo_pmtipoid_Selectedvalue_set = httpContext.cgiGet( "COMBO_PMTIPOID_Selectedvalue_set") ;
            Combo_pmtipoid_Selectedvalue_get = httpContext.cgiGet( "COMBO_PMTIPOID_Selectedvalue_get") ;
            Combo_pmtipoid_Selectedtext_set = httpContext.cgiGet( "COMBO_PMTIPOID_Selectedtext_set") ;
            Combo_pmtipoid_Selectedtext_get = httpContext.cgiGet( "COMBO_PMTIPOID_Selectedtext_get") ;
            Combo_pmtipoid_Gamoauthtoken = httpContext.cgiGet( "COMBO_PMTIPOID_Gamoauthtoken") ;
            Combo_pmtipoid_Ddointernalname = httpContext.cgiGet( "COMBO_PMTIPOID_Ddointernalname") ;
            Combo_pmtipoid_Titlecontrolalign = httpContext.cgiGet( "COMBO_PMTIPOID_Titlecontrolalign") ;
            Combo_pmtipoid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PMTIPOID_Dropdownoptionstype") ;
            Combo_pmtipoid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Enabled")) ;
            Combo_pmtipoid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Visible")) ;
            Combo_pmtipoid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PMTIPOID_Titlecontrolidtoreplace") ;
            Combo_pmtipoid_Datalisttype = httpContext.cgiGet( "COMBO_PMTIPOID_Datalisttype") ;
            Combo_pmtipoid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Allowmultipleselection")) ;
            Combo_pmtipoid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PMTIPOID_Datalistfixedvalues") ;
            Combo_pmtipoid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Isgriditem")) ;
            Combo_pmtipoid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Hasdescription")) ;
            Combo_pmtipoid_Datalistproc = httpContext.cgiGet( "COMBO_PMTIPOID_Datalistproc") ;
            Combo_pmtipoid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PMTIPOID_Datalistprocparametersprefix") ;
            Combo_pmtipoid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PMTIPOID_Remoteservicesparameters") ;
            Combo_pmtipoid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PMTIPOID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmtipoid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Includeonlyselectedoption")) ;
            Combo_pmtipoid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Includeselectalloption")) ;
            Combo_pmtipoid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Emptyitem")) ;
            Combo_pmtipoid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTIPOID_Includeaddnewoption")) ;
            Combo_pmtipoid_Htmltemplate = httpContext.cgiGet( "COMBO_PMTIPOID_Htmltemplate") ;
            Combo_pmtipoid_Multiplevaluestype = httpContext.cgiGet( "COMBO_PMTIPOID_Multiplevaluestype") ;
            Combo_pmtipoid_Loadingdata = httpContext.cgiGet( "COMBO_PMTIPOID_Loadingdata") ;
            Combo_pmtipoid_Noresultsfound = httpContext.cgiGet( "COMBO_PMTIPOID_Noresultsfound") ;
            Combo_pmtipoid_Emptyitemtext = httpContext.cgiGet( "COMBO_PMTIPOID_Emptyitemtext") ;
            Combo_pmtipoid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PMTIPOID_Onlyselectedvalues") ;
            Combo_pmtipoid_Selectalltext = httpContext.cgiGet( "COMBO_PMTIPOID_Selectalltext") ;
            Combo_pmtipoid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PMTIPOID_Multiplevaluesseparator") ;
            Combo_pmtipoid_Addnewoptiontext = httpContext.cgiGet( "COMBO_PMTIPOID_Addnewoptiontext") ;
            Combo_pmmaqcod_Objectcall = httpContext.cgiGet( "COMBO_PMMAQCOD_Objectcall") ;
            Combo_pmmaqcod_Class = httpContext.cgiGet( "COMBO_PMMAQCOD_Class") ;
            Combo_pmmaqcod_Icontype = httpContext.cgiGet( "COMBO_PMMAQCOD_Icontype") ;
            Combo_pmmaqcod_Icon = httpContext.cgiGet( "COMBO_PMMAQCOD_Icon") ;
            Combo_pmmaqcod_Caption = httpContext.cgiGet( "COMBO_PMMAQCOD_Caption") ;
            Combo_pmmaqcod_Tooltip = httpContext.cgiGet( "COMBO_PMMAQCOD_Tooltip") ;
            Combo_pmmaqcod_Cls = httpContext.cgiGet( "COMBO_PMMAQCOD_Cls") ;
            Combo_pmmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PMMAQCOD_Selectedvalue_set") ;
            Combo_pmmaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PMMAQCOD_Selectedvalue_get") ;
            Combo_pmmaqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PMMAQCOD_Selectedtext_set") ;
            Combo_pmmaqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PMMAQCOD_Selectedtext_get") ;
            Combo_pmmaqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PMMAQCOD_Gamoauthtoken") ;
            Combo_pmmaqcod_Ddointernalname = httpContext.cgiGet( "COMBO_PMMAQCOD_Ddointernalname") ;
            Combo_pmmaqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PMMAQCOD_Titlecontrolalign") ;
            Combo_pmmaqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PMMAQCOD_Dropdownoptionstype") ;
            Combo_pmmaqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Enabled")) ;
            Combo_pmmaqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Visible")) ;
            Combo_pmmaqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PMMAQCOD_Titlecontrolidtoreplace") ;
            Combo_pmmaqcod_Datalisttype = httpContext.cgiGet( "COMBO_PMMAQCOD_Datalisttype") ;
            Combo_pmmaqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Allowmultipleselection")) ;
            Combo_pmmaqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PMMAQCOD_Datalistfixedvalues") ;
            Combo_pmmaqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Isgriditem")) ;
            Combo_pmmaqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Hasdescription")) ;
            Combo_pmmaqcod_Datalistproc = httpContext.cgiGet( "COMBO_PMMAQCOD_Datalistproc") ;
            Combo_pmmaqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PMMAQCOD_Datalistprocparametersprefix") ;
            Combo_pmmaqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PMMAQCOD_Remoteservicesparameters") ;
            Combo_pmmaqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PMMAQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmmaqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Includeonlyselectedoption")) ;
            Combo_pmmaqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Includeselectalloption")) ;
            Combo_pmmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Emptyitem")) ;
            Combo_pmmaqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMAQCOD_Includeaddnewoption")) ;
            Combo_pmmaqcod_Htmltemplate = httpContext.cgiGet( "COMBO_PMMAQCOD_Htmltemplate") ;
            Combo_pmmaqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PMMAQCOD_Multiplevaluestype") ;
            Combo_pmmaqcod_Loadingdata = httpContext.cgiGet( "COMBO_PMMAQCOD_Loadingdata") ;
            Combo_pmmaqcod_Noresultsfound = httpContext.cgiGet( "COMBO_PMMAQCOD_Noresultsfound") ;
            Combo_pmmaqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PMMAQCOD_Emptyitemtext") ;
            Combo_pmmaqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PMMAQCOD_Onlyselectedvalues") ;
            Combo_pmmaqcod_Selectalltext = httpContext.cgiGet( "COMBO_PMMAQCOD_Selectalltext") ;
            Combo_pmmaqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PMMAQCOD_Multiplevaluesseparator") ;
            Combo_pmmaqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PMMAQCOD_Addnewoptiontext") ;
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
            Dvpanel_tablefrecuencia_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Objectcall") ;
            Dvpanel_tablefrecuencia_Class = httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Class") ;
            Dvpanel_tablefrecuencia_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Enabled")) ;
            Dvpanel_tablefrecuencia_Width = httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Width") ;
            Dvpanel_tablefrecuencia_Height = httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Height") ;
            Dvpanel_tablefrecuencia_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Autowidth")) ;
            Dvpanel_tablefrecuencia_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Autoheight")) ;
            Dvpanel_tablefrecuencia_Cls = httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Cls") ;
            Dvpanel_tablefrecuencia_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Showheader")) ;
            Dvpanel_tablefrecuencia_Title = httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Title") ;
            Dvpanel_tablefrecuencia_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Collapsible")) ;
            Dvpanel_tablefrecuencia_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Collapsed")) ;
            Dvpanel_tablefrecuencia_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Showcollapseicon")) ;
            Dvpanel_tablefrecuencia_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Iconposition") ;
            Dvpanel_tablefrecuencia_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Autoscroll")) ;
            Dvpanel_tablefrecuencia_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEFRECUENCIA_Visible")) ;
            Dvpanel_tabletexto_Objectcall = httpContext.cgiGet( "DVPANEL_TABLETEXTO_Objectcall") ;
            Dvpanel_tabletexto_Class = httpContext.cgiGet( "DVPANEL_TABLETEXTO_Class") ;
            Dvpanel_tabletexto_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Enabled")) ;
            Dvpanel_tabletexto_Width = httpContext.cgiGet( "DVPANEL_TABLETEXTO_Width") ;
            Dvpanel_tabletexto_Height = httpContext.cgiGet( "DVPANEL_TABLETEXTO_Height") ;
            Dvpanel_tabletexto_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Autowidth")) ;
            Dvpanel_tabletexto_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Autoheight")) ;
            Dvpanel_tabletexto_Cls = httpContext.cgiGet( "DVPANEL_TABLETEXTO_Cls") ;
            Dvpanel_tabletexto_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Showheader")) ;
            Dvpanel_tabletexto_Title = httpContext.cgiGet( "DVPANEL_TABLETEXTO_Title") ;
            Dvpanel_tabletexto_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Collapsible")) ;
            Dvpanel_tabletexto_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Collapsed")) ;
            Dvpanel_tabletexto_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Showcollapseicon")) ;
            Dvpanel_tabletexto_Iconposition = httpContext.cgiGet( "DVPANEL_TABLETEXTO_Iconposition") ;
            Dvpanel_tabletexto_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Autoscroll")) ;
            Dvpanel_tabletexto_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLETEXTO_Visible")) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmmequcod_Objectcall = httpContext.cgiGet( "COMBO_PMMEQUCOD_Objectcall") ;
            Combo_pmmequcod_Class = httpContext.cgiGet( "COMBO_PMMEQUCOD_Class") ;
            Combo_pmmequcod_Icontype = httpContext.cgiGet( "COMBO_PMMEQUCOD_Icontype") ;
            Combo_pmmequcod_Icon = httpContext.cgiGet( "COMBO_PMMEQUCOD_Icon") ;
            Combo_pmmequcod_Caption = httpContext.cgiGet( "COMBO_PMMEQUCOD_Caption") ;
            Combo_pmmequcod_Tooltip = httpContext.cgiGet( "COMBO_PMMEQUCOD_Tooltip") ;
            Combo_pmmequcod_Cls = httpContext.cgiGet( "COMBO_PMMEQUCOD_Cls") ;
            Combo_pmmequcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PMMEQUCOD_Selectedvalue_set") ;
            Combo_pmmequcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PMMEQUCOD_Selectedvalue_get") ;
            Combo_pmmequcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PMMEQUCOD_Selectedtext_set") ;
            Combo_pmmequcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PMMEQUCOD_Selectedtext_get") ;
            Combo_pmmequcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PMMEQUCOD_Gamoauthtoken") ;
            Combo_pmmequcod_Ddointernalname = httpContext.cgiGet( "COMBO_PMMEQUCOD_Ddointernalname") ;
            Combo_pmmequcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PMMEQUCOD_Titlecontrolalign") ;
            Combo_pmmequcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PMMEQUCOD_Dropdownoptionstype") ;
            Combo_pmmequcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Enabled")) ;
            Combo_pmmequcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Visible")) ;
            Combo_pmmequcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PMMEQUCOD_Titlecontrolidtoreplace") ;
            Combo_pmmequcod_Datalisttype = httpContext.cgiGet( "COMBO_PMMEQUCOD_Datalisttype") ;
            Combo_pmmequcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Allowmultipleselection")) ;
            Combo_pmmequcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PMMEQUCOD_Datalistfixedvalues") ;
            Combo_pmmequcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Isgriditem")) ;
            Combo_pmmequcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Hasdescription")) ;
            Combo_pmmequcod_Datalistproc = httpContext.cgiGet( "COMBO_PMMEQUCOD_Datalistproc") ;
            Combo_pmmequcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PMMEQUCOD_Datalistprocparametersprefix") ;
            Combo_pmmequcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PMMEQUCOD_Remoteservicesparameters") ;
            Combo_pmmequcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PMMEQUCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmmequcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Includeonlyselectedoption")) ;
            Combo_pmmequcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Includeselectalloption")) ;
            Combo_pmmequcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Emptyitem")) ;
            Combo_pmmequcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMEQUCOD_Includeaddnewoption")) ;
            Combo_pmmequcod_Htmltemplate = httpContext.cgiGet( "COMBO_PMMEQUCOD_Htmltemplate") ;
            Combo_pmmequcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PMMEQUCOD_Multiplevaluestype") ;
            Combo_pmmequcod_Loadingdata = httpContext.cgiGet( "COMBO_PMMEQUCOD_Loadingdata") ;
            Combo_pmmequcod_Noresultsfound = httpContext.cgiGet( "COMBO_PMMEQUCOD_Noresultsfound") ;
            Combo_pmmequcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PMMEQUCOD_Emptyitemtext") ;
            Combo_pmmequcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PMMEQUCOD_Onlyselectedvalues") ;
            Combo_pmmequcod_Selectalltext = httpContext.cgiGet( "COMBO_PMMEQUCOD_Selectalltext") ;
            Combo_pmmequcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PMMEQUCOD_Multiplevaluesseparator") ;
            Combo_pmmequcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PMMEQUCOD_Addnewoptiontext") ;
            Combo_pmmseqcod_Objectcall = httpContext.cgiGet( "COMBO_PMMSEQCOD_Objectcall") ;
            Combo_pmmseqcod_Class = httpContext.cgiGet( "COMBO_PMMSEQCOD_Class") ;
            Combo_pmmseqcod_Icontype = httpContext.cgiGet( "COMBO_PMMSEQCOD_Icontype") ;
            Combo_pmmseqcod_Icon = httpContext.cgiGet( "COMBO_PMMSEQCOD_Icon") ;
            Combo_pmmseqcod_Caption = httpContext.cgiGet( "COMBO_PMMSEQCOD_Caption") ;
            Combo_pmmseqcod_Tooltip = httpContext.cgiGet( "COMBO_PMMSEQCOD_Tooltip") ;
            Combo_pmmseqcod_Cls = httpContext.cgiGet( "COMBO_PMMSEQCOD_Cls") ;
            Combo_pmmseqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PMMSEQCOD_Selectedvalue_set") ;
            Combo_pmmseqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PMMSEQCOD_Selectedvalue_get") ;
            Combo_pmmseqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PMMSEQCOD_Selectedtext_set") ;
            Combo_pmmseqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PMMSEQCOD_Selectedtext_get") ;
            Combo_pmmseqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PMMSEQCOD_Gamoauthtoken") ;
            Combo_pmmseqcod_Ddointernalname = httpContext.cgiGet( "COMBO_PMMSEQCOD_Ddointernalname") ;
            Combo_pmmseqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PMMSEQCOD_Titlecontrolalign") ;
            Combo_pmmseqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PMMSEQCOD_Dropdownoptionstype") ;
            Combo_pmmseqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Enabled")) ;
            Combo_pmmseqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Visible")) ;
            Combo_pmmseqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PMMSEQCOD_Titlecontrolidtoreplace") ;
            Combo_pmmseqcod_Datalisttype = httpContext.cgiGet( "COMBO_PMMSEQCOD_Datalisttype") ;
            Combo_pmmseqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Allowmultipleselection")) ;
            Combo_pmmseqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PMMSEQCOD_Datalistfixedvalues") ;
            Combo_pmmseqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Isgriditem")) ;
            Combo_pmmseqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Hasdescription")) ;
            Combo_pmmseqcod_Datalistproc = httpContext.cgiGet( "COMBO_PMMSEQCOD_Datalistproc") ;
            Combo_pmmseqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PMMSEQCOD_Datalistprocparametersprefix") ;
            Combo_pmmseqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PMMSEQCOD_Remoteservicesparameters") ;
            Combo_pmmseqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PMMSEQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmmseqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Includeonlyselectedoption")) ;
            Combo_pmmseqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Includeselectalloption")) ;
            Combo_pmmseqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Emptyitem")) ;
            Combo_pmmseqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMSEQCOD_Includeaddnewoption")) ;
            Combo_pmmseqcod_Htmltemplate = httpContext.cgiGet( "COMBO_PMMSEQCOD_Htmltemplate") ;
            Combo_pmmseqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PMMSEQCOD_Multiplevaluestype") ;
            Combo_pmmseqcod_Loadingdata = httpContext.cgiGet( "COMBO_PMMSEQCOD_Loadingdata") ;
            Combo_pmmseqcod_Noresultsfound = httpContext.cgiGet( "COMBO_PMMSEQCOD_Noresultsfound") ;
            Combo_pmmseqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PMMSEQCOD_Emptyitemtext") ;
            Combo_pmmseqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PMMSEQCOD_Onlyselectedvalues") ;
            Combo_pmmseqcod_Selectalltext = httpContext.cgiGet( "COMBO_PMMSEQCOD_Selectalltext") ;
            Combo_pmmseqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PMMSEQCOD_Multiplevaluesseparator") ;
            Combo_pmmseqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PMMSEQCOD_Addnewoptiontext") ;
            Combo_pmmpiecod_Objectcall = httpContext.cgiGet( "COMBO_PMMPIECOD_Objectcall") ;
            Combo_pmmpiecod_Class = httpContext.cgiGet( "COMBO_PMMPIECOD_Class") ;
            Combo_pmmpiecod_Icontype = httpContext.cgiGet( "COMBO_PMMPIECOD_Icontype") ;
            Combo_pmmpiecod_Icon = httpContext.cgiGet( "COMBO_PMMPIECOD_Icon") ;
            Combo_pmmpiecod_Caption = httpContext.cgiGet( "COMBO_PMMPIECOD_Caption") ;
            Combo_pmmpiecod_Tooltip = httpContext.cgiGet( "COMBO_PMMPIECOD_Tooltip") ;
            Combo_pmmpiecod_Cls = httpContext.cgiGet( "COMBO_PMMPIECOD_Cls") ;
            Combo_pmmpiecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PMMPIECOD_Selectedvalue_set") ;
            Combo_pmmpiecod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PMMPIECOD_Selectedvalue_get") ;
            Combo_pmmpiecod_Selectedtext_set = httpContext.cgiGet( "COMBO_PMMPIECOD_Selectedtext_set") ;
            Combo_pmmpiecod_Selectedtext_get = httpContext.cgiGet( "COMBO_PMMPIECOD_Selectedtext_get") ;
            Combo_pmmpiecod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PMMPIECOD_Gamoauthtoken") ;
            Combo_pmmpiecod_Ddointernalname = httpContext.cgiGet( "COMBO_PMMPIECOD_Ddointernalname") ;
            Combo_pmmpiecod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PMMPIECOD_Titlecontrolalign") ;
            Combo_pmmpiecod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PMMPIECOD_Dropdownoptionstype") ;
            Combo_pmmpiecod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Enabled")) ;
            Combo_pmmpiecod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Visible")) ;
            Combo_pmmpiecod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PMMPIECOD_Titlecontrolidtoreplace") ;
            Combo_pmmpiecod_Datalisttype = httpContext.cgiGet( "COMBO_PMMPIECOD_Datalisttype") ;
            Combo_pmmpiecod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Allowmultipleselection")) ;
            Combo_pmmpiecod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PMMPIECOD_Datalistfixedvalues") ;
            Combo_pmmpiecod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Isgriditem")) ;
            Combo_pmmpiecod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Hasdescription")) ;
            Combo_pmmpiecod_Datalistproc = httpContext.cgiGet( "COMBO_PMMPIECOD_Datalistproc") ;
            Combo_pmmpiecod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PMMPIECOD_Datalistprocparametersprefix") ;
            Combo_pmmpiecod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PMMPIECOD_Remoteservicesparameters") ;
            Combo_pmmpiecod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PMMPIECOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmmpiecod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Includeonlyselectedoption")) ;
            Combo_pmmpiecod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Includeselectalloption")) ;
            Combo_pmmpiecod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Emptyitem")) ;
            Combo_pmmpiecod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMMPIECOD_Includeaddnewoption")) ;
            Combo_pmmpiecod_Htmltemplate = httpContext.cgiGet( "COMBO_PMMPIECOD_Htmltemplate") ;
            Combo_pmmpiecod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PMMPIECOD_Multiplevaluestype") ;
            Combo_pmmpiecod_Loadingdata = httpContext.cgiGet( "COMBO_PMMPIECOD_Loadingdata") ;
            Combo_pmmpiecod_Noresultsfound = httpContext.cgiGet( "COMBO_PMMPIECOD_Noresultsfound") ;
            Combo_pmmpiecod_Emptyitemtext = httpContext.cgiGet( "COMBO_PMMPIECOD_Emptyitemtext") ;
            Combo_pmmpiecod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PMMPIECOD_Onlyselectedvalues") ;
            Combo_pmmpiecod_Selectalltext = httpContext.cgiGet( "COMBO_PMMPIECOD_Selectalltext") ;
            Combo_pmmpiecod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PMMPIECOD_Multiplevaluesseparator") ;
            Combo_pmmpiecod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PMMPIECOD_Addnewoptiontext") ;
            Combo_pmtcod_Objectcall = httpContext.cgiGet( "COMBO_PMTCOD_Objectcall") ;
            Combo_pmtcod_Class = httpContext.cgiGet( "COMBO_PMTCOD_Class") ;
            Combo_pmtcod_Icontype = httpContext.cgiGet( "COMBO_PMTCOD_Icontype") ;
            Combo_pmtcod_Icon = httpContext.cgiGet( "COMBO_PMTCOD_Icon") ;
            Combo_pmtcod_Caption = httpContext.cgiGet( "COMBO_PMTCOD_Caption") ;
            Combo_pmtcod_Tooltip = httpContext.cgiGet( "COMBO_PMTCOD_Tooltip") ;
            Combo_pmtcod_Cls = httpContext.cgiGet( "COMBO_PMTCOD_Cls") ;
            Combo_pmtcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PMTCOD_Selectedvalue_set") ;
            Combo_pmtcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PMTCOD_Selectedvalue_get") ;
            Combo_pmtcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PMTCOD_Selectedtext_set") ;
            Combo_pmtcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PMTCOD_Selectedtext_get") ;
            Combo_pmtcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PMTCOD_Gamoauthtoken") ;
            Combo_pmtcod_Ddointernalname = httpContext.cgiGet( "COMBO_PMTCOD_Ddointernalname") ;
            Combo_pmtcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PMTCOD_Titlecontrolalign") ;
            Combo_pmtcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PMTCOD_Dropdownoptionstype") ;
            Combo_pmtcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Enabled")) ;
            Combo_pmtcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Visible")) ;
            Combo_pmtcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PMTCOD_Titlecontrolidtoreplace") ;
            Combo_pmtcod_Datalisttype = httpContext.cgiGet( "COMBO_PMTCOD_Datalisttype") ;
            Combo_pmtcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Allowmultipleselection")) ;
            Combo_pmtcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PMTCOD_Datalistfixedvalues") ;
            Combo_pmtcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Isgriditem")) ;
            Combo_pmtcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Hasdescription")) ;
            Combo_pmtcod_Datalistproc = httpContext.cgiGet( "COMBO_PMTCOD_Datalistproc") ;
            Combo_pmtcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PMTCOD_Datalistprocparametersprefix") ;
            Combo_pmtcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PMTCOD_Remoteservicesparameters") ;
            Combo_pmtcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PMTCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmtcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Includeonlyselectedoption")) ;
            Combo_pmtcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Includeselectalloption")) ;
            Combo_pmtcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Emptyitem")) ;
            Combo_pmtcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMTCOD_Includeaddnewoption")) ;
            Combo_pmtcod_Htmltemplate = httpContext.cgiGet( "COMBO_PMTCOD_Htmltemplate") ;
            Combo_pmtcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PMTCOD_Multiplevaluestype") ;
            Combo_pmtcod_Loadingdata = httpContext.cgiGet( "COMBO_PMTCOD_Loadingdata") ;
            Combo_pmtcod_Noresultsfound = httpContext.cgiGet( "COMBO_PMTCOD_Noresultsfound") ;
            Combo_pmtcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PMTCOD_Emptyitemtext") ;
            Combo_pmtcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PMTCOD_Onlyselectedvalues") ;
            Combo_pmtcod_Selectalltext = httpContext.cgiGet( "COMBO_PMTCOD_Selectalltext") ;
            Combo_pmtcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PMTCOD_Multiplevaluesseparator") ;
            Combo_pmtcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PMTCOD_Addnewoptiontext") ;
            Combo_pmrepcod_Objectcall = httpContext.cgiGet( "COMBO_PMREPCOD_Objectcall") ;
            Combo_pmrepcod_Class = httpContext.cgiGet( "COMBO_PMREPCOD_Class") ;
            Combo_pmrepcod_Icontype = httpContext.cgiGet( "COMBO_PMREPCOD_Icontype") ;
            Combo_pmrepcod_Icon = httpContext.cgiGet( "COMBO_PMREPCOD_Icon") ;
            Combo_pmrepcod_Caption = httpContext.cgiGet( "COMBO_PMREPCOD_Caption") ;
            Combo_pmrepcod_Tooltip = httpContext.cgiGet( "COMBO_PMREPCOD_Tooltip") ;
            Combo_pmrepcod_Cls = httpContext.cgiGet( "COMBO_PMREPCOD_Cls") ;
            Combo_pmrepcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PMREPCOD_Selectedvalue_set") ;
            Combo_pmrepcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PMREPCOD_Selectedvalue_get") ;
            Combo_pmrepcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PMREPCOD_Selectedtext_set") ;
            Combo_pmrepcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PMREPCOD_Selectedtext_get") ;
            Combo_pmrepcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PMREPCOD_Gamoauthtoken") ;
            Combo_pmrepcod_Ddointernalname = httpContext.cgiGet( "COMBO_PMREPCOD_Ddointernalname") ;
            Combo_pmrepcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PMREPCOD_Titlecontrolalign") ;
            Combo_pmrepcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PMREPCOD_Dropdownoptionstype") ;
            Combo_pmrepcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Enabled")) ;
            Combo_pmrepcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Visible")) ;
            Combo_pmrepcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PMREPCOD_Titlecontrolidtoreplace") ;
            Combo_pmrepcod_Datalisttype = httpContext.cgiGet( "COMBO_PMREPCOD_Datalisttype") ;
            Combo_pmrepcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Allowmultipleselection")) ;
            Combo_pmrepcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PMREPCOD_Datalistfixedvalues") ;
            Combo_pmrepcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Isgriditem")) ;
            Combo_pmrepcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Hasdescription")) ;
            Combo_pmrepcod_Datalistproc = httpContext.cgiGet( "COMBO_PMREPCOD_Datalistproc") ;
            Combo_pmrepcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PMREPCOD_Datalistprocparametersprefix") ;
            Combo_pmrepcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PMREPCOD_Remoteservicesparameters") ;
            Combo_pmrepcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PMREPCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_pmrepcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Includeonlyselectedoption")) ;
            Combo_pmrepcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Includeselectalloption")) ;
            Combo_pmrepcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Emptyitem")) ;
            Combo_pmrepcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PMREPCOD_Includeaddnewoption")) ;
            Combo_pmrepcod_Htmltemplate = httpContext.cgiGet( "COMBO_PMREPCOD_Htmltemplate") ;
            Combo_pmrepcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PMREPCOD_Multiplevaluestype") ;
            Combo_pmrepcod_Loadingdata = httpContext.cgiGet( "COMBO_PMREPCOD_Loadingdata") ;
            Combo_pmrepcod_Noresultsfound = httpContext.cgiGet( "COMBO_PMREPCOD_Noresultsfound") ;
            Combo_pmrepcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PMREPCOD_Emptyitemtext") ;
            Combo_pmrepcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PMREPCOD_Onlyselectedvalues") ;
            Combo_pmrepcod_Selectalltext = httpContext.cgiGet( "COMBO_PMREPCOD_Selectalltext") ;
            Combo_pmrepcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PMREPCOD_Multiplevaluesseparator") ;
            Combo_pmrepcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PMREPCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9429PMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
            n9473PMDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9473PMDsc", A9473PMDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMTipoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMTipoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMTIPOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMTipoID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14271PMTipoID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
            }
            else
            {
               A14271PMTipoID = (short)(localUtil.ctol( httpContext.cgiGet( edtPMTipoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
            }
            A9476PMMaqCod = httpContext.cgiGet( edtPMMaqCod_Internalname) ;
            n9476PMMaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
            cmbPMEst.setName( cmbPMEst.getInternalname() );
            cmbPMEst.setValue( httpContext.cgiGet( cmbPMEst.getInternalname()) );
            A9478PMEst = httpContext.cgiGet( cmbPMEst.getInternalname()) ;
            n9478PMEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
            A9474PMFchCre = localUtil.ctod( httpContext.cgiGet( edtPMFchCre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n9474PMFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
            A9475PMUsuCre = GXutil.upper( httpContext.cgiGet( edtPMUsuCre_Internalname)) ;
            n9475PMUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9475PMUsuCre", A9475PMUsuCre);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDIAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMDias_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9487PMDias = (short)(0) ;
               n9487PMDias = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9487PMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9487PMDias), 3, 0));
            }
            else
            {
               A9487PMDias = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9487PMDias = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9487PMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9487PMDias), 3, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMUso_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMUso_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMUSO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMUso_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11454PMUso = DecimalUtil.ZERO ;
               n11454PMUso = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11454PMUso", GXutil.ltrimstr( A11454PMUso, 8, 2));
            }
            else
            {
               A11454PMUso = localUtil.ctond( httpContext.cgiGet( edtPMUso_Internalname)) ;
               n11454PMUso = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11454PMUso", GXutil.ltrimstr( A11454PMUso, 8, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMUsoMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMUsoMts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMUSOMTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMUsoMts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13013PMUsoMts = DecimalUtil.ZERO ;
               n13013PMUsoMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13013PMUsoMts", GXutil.ltrimstr( A13013PMUsoMts, 10, 2));
            }
            else
            {
               A13013PMUsoMts = localUtil.ctond( httpContext.cgiGet( edtPMUsoMts_Internalname)) ;
               n13013PMUsoMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13013PMUsoMts", GXutil.ltrimstr( A13013PMUsoMts, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMTie_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMTie_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMTIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMTie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11455PMTie = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A11455PMTie", GXutil.ltrimstr( A11455PMTie, 6, 2));
            }
            else
            {
               A11455PMTie = localUtil.ctond( httpContext.cgiGet( edtPMTie_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11455PMTie", GXutil.ltrimstr( A11455PMTie, 6, 2));
            }
            A11456PMPla = httpContext.cgiGet( edtPMPla_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11456PMPla", A11456PMPla);
            if ( localUtil.vcdate( httpContext.cgiGet( edtPMIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PMINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9484PMIni = GXutil.nullDate() ;
               n9484PMIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
            }
            else
            {
               A9484PMIni = localUtil.ctod( httpContext.cgiGet( edtPMIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9484PMIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPMFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PMFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9485PMFin = GXutil.nullDate() ;
               n9485PMFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9485PMFin", localUtil.format(A9485PMFin, "99/99/99"));
            }
            else
            {
               A9485PMFin = localUtil.ctod( httpContext.cgiGet( edtPMFin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9485PMFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9485PMFin", localUtil.format(A9485PMFin, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPMUlt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PMULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9486PMUlt = GXutil.nullDate() ;
               n9486PMUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
            }
            else
            {
               A9486PMUlt = localUtil.ctod( httpContext.cgiGet( edtPMUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9486PMUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMORD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9488PMOrd = 0 ;
               n9488PMOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9488PMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9488PMOrd), 8, 0));
            }
            else
            {
               A9488PMOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtPMOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9488PMOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9488PMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9488PMOrd), 8, 0));
            }
            A9483PMTxt = httpContext.cgiGet( edtPMTxt_Internalname) ;
            n9483PMTxt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9483PMTxt", A9483PMTxt);
            AV35Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
            AV33ComboPMTipoID = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombopmtipoid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ComboPMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboPMTipoID), 4, 0));
            AV25ComboPMMaqCod = httpContext.cgiGet( edtavCombopmmaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ComboPMMaqCod", AV25ComboPMMaqCod);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9477PMMaqDsc = httpContext.cgiGet( edtPMMaqDsc_Internalname) ;
            n9477PMMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", A9477PMMaqDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMPreve");
            A9474PMFchCre = localUtil.ctod( httpContext.cgiGet( edtPMFchCre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n9474PMFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
            forbiddenHiddens.add("PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV35Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV35Pgmname, "")));
            A9475PMUsuCre = httpContext.cgiGet( edtPMUsuCre_Internalname) ;
            n9475PMUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9475PMUsuCre", A9475PMUsuCre);
            forbiddenHiddens.add("PMUsuCre", GXutil.rtrim( localUtil.format( A9475PMUsuCre, "@!")));
            forbiddenHiddens.add("PMDiasPavi", localUtil.format( DecimalUtil.doubleToDec(A14275PMDiasPavi), "ZZZ9"));
            forbiddenHiddens.add("PMTieMto", localUtil.format( A14274PMTieMto, "ZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmpreve:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9429PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV13PMCod) )
               {
                  A9429PMCod = AV13PMCod ;
                  n9429PMCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A9429PMCod = AV13PMCod ;
                     n9429PMCod = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
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
                  sMode1236 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV13PMCod) )
                  {
                     A9429PMCod = AV13PMCod ;
                     n9429PMCod = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A9429PMCod = AV13PMCod ;
                        n9429PMCod = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
                     }
                  }
                  Gx_mode = sMode1236 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1236 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13V0( ) ;
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
                        e1113V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213V2 ();
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
         e1213V2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13V1236( ) ;
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
         disableAttributes13V1236( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopmtipoid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopmtipoid_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopmmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopmmaqcod_Enabled), 5, 0), true);
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

   public void confirm_13V0( )
   {
      beforeValidate13V1236( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13V1236( ) ;
         }
         else
         {
            checkExtendedTable13V1236( ) ;
            closeExtendedTableCursors13V1236( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1236 = Gx_mode ;
         confirm_13V1532( ) ;
         if ( AnyError == 0 )
         {
            confirm_13V1237( ) ;
            if ( AnyError == 0 )
            {
               confirm_13V1533( ) ;
               if ( AnyError == 0 )
               {
                  confirm_13V1523( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Restore parent mode. */
                     Gx_mode = sMode1236 ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     IsConfirmed = (short)(1) ;
                     httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                  }
               }
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13V1523( )
   {
      nGXsfl_193_idx = 0 ;
      while ( nGXsfl_193_idx < nRC_GXsfl_193 )
      {
         readRow13V1523( ) ;
         if ( ( nRcdExists_1523 != 0 ) || ( nIsMod_1523 != 0 ) )
         {
            getKey13V1523( ) ;
            if ( ( nRcdExists_1523 == 0 ) && ( nRcdDeleted_1523 == 0 ) )
            {
               if ( RcdFound1523 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13V1523( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13V1523( ) ;
                     closeExtendedTableCursors13V1523( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMOPERES_" + sGXsfl_193_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMOpeRes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1523 != 0 )
               {
                  if ( nRcdDeleted_1523 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13V1523( ) ;
                     load13V1523( ) ;
                     beforeValidate13V1523( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13V1523( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1523 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13V1523( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13V1523( ) ;
                           closeExtendedTableCursors13V1523( ) ;
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
                  if ( nRcdDeleted_1523 == 0 )
                  {
                     GXCCtl = "PMOPERES_" + sGXsfl_193_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMOpeRes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMOpeRes_Internalname, h9481PMOpeRes) ;
         httpContext.changePostValue( edtPMOpeResN_Internalname, GXutil.rtrim( A9482PMOpeResN)) ;
         httpContext.changePostValue( edtPMOpeTie_Internalname, GXutil.ltrim( localUtil.ntoc( A11457PMOpeTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9481PMOpeRes_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z9481PMOpeRes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11457PMOpeTie_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z11457PMOpeTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1523_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1523_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1523_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1523 != 0 )
         {
            httpContext.changePostValue( "PMOPERES_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMOPERESN_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeResN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMOPETIE_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13V1533( )
   {
      nGXsfl_206_idx = 0 ;
      while ( nGXsfl_206_idx < nRC_GXsfl_206 )
      {
         readRow13V1533( ) ;
         if ( ( nRcdExists_1533 != 0 ) || ( nIsMod_1533 != 0 ) )
         {
            getKey13V1533( ) ;
            if ( ( nRcdExists_1533 == 0 ) && ( nRcdDeleted_1533 == 0 ) )
            {
               if ( RcdFound1533 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13V1533( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13V1533( ) ;
                     closeExtendedTableCursors13V1533( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMTCOD_" + sGXsfl_206_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1533 != 0 )
               {
                  if ( nRcdDeleted_1533 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13V1533( ) ;
                     load13V1533( ) ;
                     beforeValidate13V1533( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13V1533( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13V1533( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13V1533( ) ;
                           closeExtendedTableCursors13V1533( ) ;
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
                  if ( nRcdDeleted_1533 == 0 )
                  {
                     GXCCtl = "PMTCOD_" + sGXsfl_206_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMTDsc_Internalname, GXutil.rtrim( A9480PMTDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9479PMTCod_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( Z9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1533_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1533_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1533_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1533 != 0 )
         {
            httpContext.changePostValue( "PMTCOD_"+sGXsfl_206_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMTCOD_"+sGXsfl_206_idx+"Horizontalalignment", GXutil.rtrim( edtPMTCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PMTDSC_"+sGXsfl_206_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13V1237( )
   {
      nGXsfl_213_idx = 0 ;
      while ( nGXsfl_213_idx < nRC_GXsfl_213 )
      {
         readRow13V1237( ) ;
         if ( ( nRcdExists_1237 != 0 ) || ( nIsMod_1237 != 0 ) )
         {
            getKey13V1237( ) ;
            if ( ( nRcdExists_1237 == 0 ) && ( nRcdDeleted_1237 == 0 ) )
            {
               if ( RcdFound1237 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13V1237( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13V1237( ) ;
                     closeExtendedTableCursors13V1237( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMREPCOD_" + sGXsfl_213_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMRepCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1237 != 0 )
               {
                  if ( nRcdDeleted_1237 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13V1237( ) ;
                     load13V1237( ) ;
                     beforeValidate13V1237( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13V1237( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1237 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13V1237( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13V1237( ) ;
                           closeExtendedTableCursors13V1237( ) ;
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
                  if ( nRcdDeleted_1237 == 0 )
                  {
                     GXCCtl = "PMREPCOD_" + sGXsfl_213_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9489PMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMRepNom_Internalname, GXutil.rtrim( A9490PMRepNom)) ;
         httpContext.changePostValue( edtPMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9491PMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9489PMRepCod_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z9489PMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9491PMRRCnt_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z9491PMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1237_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1237_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1237_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1237 != 0 )
         {
            httpContext.changePostValue( "PMREPCOD_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMREPCOD_"+sGXsfl_213_idx+"Horizontalalignment", GXutil.rtrim( edtPMRepCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PMREPNOM_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMRRCNT_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13V1532( )
   {
      nGXsfl_177_idx = 0 ;
      while ( nGXsfl_177_idx < nRC_GXsfl_177 )
      {
         readRow13V1532( ) ;
         if ( ( nRcdExists_1532 != 0 ) || ( nIsMod_1532 != 0 ) )
         {
            getKey13V1532( ) ;
            if ( ( nRcdExists_1532 == 0 ) && ( nRcdDeleted_1532 == 0 ) )
            {
               if ( RcdFound1532 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13V1532( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13V1532( ) ;
                     closeExtendedTableCursors13V1532( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMMEQUCOD_" + sGXsfl_177_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMMEquCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1532 != 0 )
               {
                  if ( nRcdDeleted_1532 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13V1532( ) ;
                     load13V1532( ) ;
                     beforeValidate13V1532( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13V1532( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1532 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13V1532( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13V1532( ) ;
                           closeExtendedTableCursors13V1532( ) ;
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
                  if ( nRcdDeleted_1532 == 0 )
                  {
                     GXCCtl = "PMMEQUCOD_" + sGXsfl_177_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMMEquCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMMEquCod_Internalname, GXutil.rtrim( A11450PMMEquCod)) ;
         httpContext.changePostValue( edtPMMEquDsc_Internalname, GXutil.rtrim( A12597PMMEquDsc)) ;
         httpContext.changePostValue( edtPMMSEqCod_Internalname, GXutil.rtrim( A11451PMMSEqCod)) ;
         httpContext.changePostValue( edtPMMSEqDsc_Internalname, GXutil.rtrim( A12598PMMSEqDsc)) ;
         httpContext.changePostValue( edtPMMPieCod_Internalname, GXutil.rtrim( A11452PMMPieCod)) ;
         httpContext.changePostValue( edtPMMPieDsc_Internalname, GXutil.rtrim( A11453PMMPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11450PMMEquCod_"+sGXsfl_177_idx, GXutil.rtrim( Z11450PMMEquCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11451PMMSEqCod_"+sGXsfl_177_idx, GXutil.rtrim( Z11451PMMSEqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11452PMMPieCod_"+sGXsfl_177_idx, GXutil.rtrim( Z11452PMMPieCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1532_"+sGXsfl_177_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1532_"+sGXsfl_177_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1532_"+sGXsfl_177_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1532 != 0 )
         {
            httpContext.changePostValue( "PMMEQUCOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMEQUDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMSEQCOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMSEQDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMPIECOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMPIEDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13V0( )
   {
   }

   public void e1113V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmpreve_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tmpreve_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmpreve_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmpreve_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmpreve_impl.this.AV20EmprCod = GXv_char2[0] ;
      tmpreve_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmpreve_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV15WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV15WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_pmrepcod_Titlecontrolidtoreplace = edtPMRepCod_Internalname ;
      ucCombo_pmrepcod.sendProperty(context, "", false, Combo_pmrepcod_Internalname, "TitleControlIdToReplace", Combo_pmrepcod_Titlecontrolidtoreplace);
      edtPMRepCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Horizontalalignment", edtPMRepCod_Horizontalalignment, !bGXsfl_213_Refreshing);
      Combo_pmtcod_Titlecontrolidtoreplace = edtPMTCod_Internalname ;
      ucCombo_pmtcod.sendProperty(context, "", false, Combo_pmtcod_Internalname, "TitleControlIdToReplace", Combo_pmtcod_Titlecontrolidtoreplace);
      edtPMTCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Horizontalalignment", edtPMTCod_Horizontalalignment, !bGXsfl_206_Refreshing);
      Combo_pmmpiecod_Titlecontrolidtoreplace = edtPMMPieCod_Internalname ;
      ucCombo_pmmpiecod.sendProperty(context, "", false, Combo_pmmpiecod_Internalname, "TitleControlIdToReplace", Combo_pmmpiecod_Titlecontrolidtoreplace);
      Combo_pmmseqcod_Titlecontrolidtoreplace = edtPMMSEqCod_Internalname ;
      ucCombo_pmmseqcod.sendProperty(context, "", false, Combo_pmmseqcod_Internalname, "TitleControlIdToReplace", Combo_pmmseqcod_Titlecontrolidtoreplace);
      Combo_pmmequcod_Titlecontrolidtoreplace = edtPMMEquCod_Internalname ;
      ucCombo_pmmequcod.sendProperty(context, "", false, Combo_pmmequcod_Internalname, "TitleControlIdToReplace", Combo_pmmequcod_Titlecontrolidtoreplace);
      edtPMMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqCod_Visible), 5, 0), true);
      AV25ComboPMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboPMMaqCod", AV25ComboPMMaqCod);
      edtavCombopmmaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopmmaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopmmaqcod_Visible), 5, 0), true);
      edtPMTipoID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTipoID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTipoID_Visible), 5, 0), true);
      AV33ComboPMTipoID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ComboPMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboPMTipoID), 4, 0));
      edtavCombopmtipoid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopmtipoid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopmtipoid_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPMTIPOID' */
      S112 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'LOADCOMBOPMMAQCOD' */
      S122 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'LOADCOMBOPMMEQUCOD' */
      S132 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'LOADCOMBOPMMSEQCOD' */
      S142 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'LOADCOMBOPMMPIECOD' */
      S152 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'LOADCOMBOPMTCOD' */
      S162 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'LOADCOMBOPMREPCOD' */
      S172 ();
      if ( returnInSub )
      {
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
      S182 ();
      if ( returnInSub )
      {
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
      AV16TrnContext.fromxml(AV17WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV16TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV35Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV36GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         while ( AV36GXV1 <= AV16TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV16TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV36GXV1));
            if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PMMaqCod") == 0 )
            {
               AV18Insert_PMMaqCod = AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_PMMaqCod", AV18Insert_PMMaqCod);
               if ( ! (GXutil.strcmp("", AV18Insert_PMMaqCod)==0) )
               {
                  AV25ComboPMMaqCod = AV18Insert_PMMaqCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25ComboPMMaqCod", AV25ComboPMMaqCod);
                  Combo_pmmaqcod_Selectedvalue_set = AV25ComboPMMaqCod ;
                  ucCombo_pmmaqcod.sendProperty(context, "", false, Combo_pmmaqcod_Internalname, "SelectedValue_set", Combo_pmmaqcod_Selectedvalue_set);
                  Combo_pmmaqcod_Enabled = false ;
                  ucCombo_pmmaqcod.sendProperty(context, "", false, Combo_pmmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_pmmaqcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PMTipoID") == 0 )
            {
               AV26Insert_PMTipoID = (short)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Insert_PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Insert_PMTipoID), 4, 0));
               if ( ! (0==AV26Insert_PMTipoID) )
               {
                  AV33ComboPMTipoID = AV26Insert_PMTipoID ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33ComboPMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboPMTipoID), 4, 0));
                  Combo_pmtipoid_Selectedvalue_set = GXutil.trim( GXutil.str( AV33ComboPMTipoID, 4, 0)) ;
                  ucCombo_pmtipoid.sendProperty(context, "", false, Combo_pmtipoid_Internalname, "SelectedValue_set", Combo_pmtipoid_Selectedvalue_set);
                  Combo_pmtipoid_Enabled = false ;
                  ucCombo_pmtipoid.sendProperty(context, "", false, Combo_pmtipoid_Internalname, "Enabled", GXutil.booltostr( Combo_pmtipoid_Enabled));
               }
            }
            AV36GXV1 = (int)(AV36GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtPMMaqDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqDsc_Visible), 5, 0), true);
   }

   public void e1213V2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV16TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmpreveww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
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

   public void S182( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_unnamedtable4_cell_Class = "col-xs-12 col-sm-6 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
   }

   public void S172( )
   {
      /* 'LOADCOMBOPMREPCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV27PMRepCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmpreveloaddvcombo(remoteHandle, context).execute( "PMRepCod", Gx_mode, AV20EmprCod, AV13PMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmpreve_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV27PMRepCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S162( )
   {
      /* 'LOADCOMBOPMTCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV28PMTCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmpreveloaddvcombo(remoteHandle, context).execute( "PMTCod", Gx_mode, AV20EmprCod, AV13PMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmpreve_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV28PMTCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S152( )
   {
      /* 'LOADCOMBOPMMPIECOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV31PMMPieCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmpreveloaddvcombo(remoteHandle, context).execute( "PMMPieCod", Gx_mode, AV20EmprCod, AV13PMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmpreve_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV31PMMPieCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S142( )
   {
      /* 'LOADCOMBOPMMSEQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV30PMMSEqCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmpreveloaddvcombo(remoteHandle, context).execute( "PMMSEqCod", Gx_mode, AV20EmprCod, AV13PMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmpreve_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV30PMMSEqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S132( )
   {
      /* 'LOADCOMBOPMMEQUCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV29PMMEquCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmpreveloaddvcombo(remoteHandle, context).execute( "PMMEquCod", Gx_mode, AV20EmprCod, AV13PMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmpreve_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV29PMMEquCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S122( )
   {
      /* 'LOADCOMBOPMMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV22PMMaqCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmpreveloaddvcombo(remoteHandle, context).execute( "PMMaqCod", Gx_mode, AV20EmprCod, AV13PMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmpreve_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV22PMMaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_pmmaqcod_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_pmmaqcod.sendProperty(context, "", false, Combo_pmmaqcod_Internalname, "SelectedValue_set", Combo_pmmaqcod_Selectedvalue_set);
      AV25ComboPMMaqCod = AV24ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboPMMaqCod", AV25ComboPMMaqCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_pmmaqcod_Enabled = false ;
         ucCombo_pmmaqcod.sendProperty(context, "", false, Combo_pmmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_pmmaqcod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOPMTIPOID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV32PMTipoID_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmpreveloaddvcombo(remoteHandle, context).execute( "PMTipoID", Gx_mode, AV20EmprCod, AV13PMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmpreve_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV32PMTipoID_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_pmtipoid_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_pmtipoid.sendProperty(context, "", false, Combo_pmtipoid_Internalname, "SelectedValue_set", Combo_pmtipoid_Selectedvalue_set);
      AV33ComboPMTipoID = (short)(GXutil.lval( AV24ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ComboPMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboPMTipoID), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_pmtipoid_Enabled = false ;
         ucCombo_pmtipoid.sendProperty(context, "", false, Combo_pmtipoid_Internalname, "Enabled", GXutil.booltostr( Combo_pmtipoid_Enabled));
      }
   }

   public void zm13V1236( int GX_JID )
   {
      if ( ( GX_JID == 38 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9473PMDsc = T013V15_A9473PMDsc[0] ;
            Z9474PMFchCre = T013V15_A9474PMFchCre[0] ;
            Z9475PMUsuCre = T013V15_A9475PMUsuCre[0] ;
            Z9478PMEst = T013V15_A9478PMEst[0] ;
            Z9483PMTxt = T013V15_A9483PMTxt[0] ;
            Z9484PMIni = T013V15_A9484PMIni[0] ;
            Z9485PMFin = T013V15_A9485PMFin[0] ;
            Z9486PMUlt = T013V15_A9486PMUlt[0] ;
            Z11454PMUso = T013V15_A11454PMUso[0] ;
            Z9487PMDias = T013V15_A9487PMDias[0] ;
            Z9488PMOrd = T013V15_A9488PMOrd[0] ;
            Z11455PMTie = T013V15_A11455PMTie[0] ;
            Z11456PMPla = T013V15_A11456PMPla[0] ;
            Z13013PMUsoMts = T013V15_A13013PMUsoMts[0] ;
            Z14275PMDiasPavi = T013V15_A14275PMDiasPavi[0] ;
            Z14274PMTieMto = T013V15_A14274PMTieMto[0] ;
            Z9476PMMaqCod = T013V15_A9476PMMaqCod[0] ;
            Z14271PMTipoID = T013V15_A14271PMTipoID[0] ;
         }
         else
         {
            Z9473PMDsc = A9473PMDsc ;
            Z9474PMFchCre = A9474PMFchCre ;
            Z9475PMUsuCre = A9475PMUsuCre ;
            Z9478PMEst = A9478PMEst ;
            Z9483PMTxt = A9483PMTxt ;
            Z9484PMIni = A9484PMIni ;
            Z9485PMFin = A9485PMFin ;
            Z9486PMUlt = A9486PMUlt ;
            Z11454PMUso = A11454PMUso ;
            Z9487PMDias = A9487PMDias ;
            Z9488PMOrd = A9488PMOrd ;
            Z11455PMTie = A11455PMTie ;
            Z11456PMPla = A11456PMPla ;
            Z13013PMUsoMts = A13013PMUsoMts ;
            Z14275PMDiasPavi = A14275PMDiasPavi ;
            Z14274PMTieMto = A14274PMTieMto ;
            Z9476PMMaqCod = A9476PMMaqCod ;
            Z14271PMTipoID = A14271PMTipoID ;
         }
      }
      if ( GX_JID == -38 )
      {
         Z9429PMCod = A9429PMCod ;
         Z9473PMDsc = A9473PMDsc ;
         Z9474PMFchCre = A9474PMFchCre ;
         Z9475PMUsuCre = A9475PMUsuCre ;
         Z9478PMEst = A9478PMEst ;
         Z9483PMTxt = A9483PMTxt ;
         Z9484PMIni = A9484PMIni ;
         Z9485PMFin = A9485PMFin ;
         Z9486PMUlt = A9486PMUlt ;
         Z11454PMUso = A11454PMUso ;
         Z9487PMDias = A9487PMDias ;
         Z9488PMOrd = A9488PMOrd ;
         Z11455PMTie = A11455PMTie ;
         Z11456PMPla = A11456PMPla ;
         Z13013PMUsoMts = A13013PMUsoMts ;
         Z14275PMDiasPavi = A14275PMDiasPavi ;
         Z14274PMTieMto = A14274PMTieMto ;
         Z396EmprCod = A396EmprCod ;
         Z9476PMMaqCod = A9476PMMaqCod ;
         Z14271PMTipoID = A14271PMTipoID ;
         Z407EmprNom = A407EmprNom ;
         Z9477PMMaqDsc = A9477PMMaqDsc ;
         Z14272PMTipoDsc = A14272PMTipoDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( ! ( ( 1 == 0 ) ) )
      {
         divDvpanel_unnamedtable4_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
      }
      else
      {
         if ( 1 == 0 )
         {
            divDvpanel_unnamedtable4_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
         }
      }
      divTableleaflevel_equipos_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableleaflevel_equipos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableleaflevel_equipos_Visible), 5, 0), true);
      edtPMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMFchCre_Enabled), 5, 0), true);
      edtPMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUsuCre_Enabled), 5, 0), true);
      AV35Pgmname = "MantenimientoMaquina.TMPreve" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      edtPMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMFchCre_Enabled), 5, 0), true);
      edtPMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUsuCre_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         A396EmprCod = AV20EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13PMCod) )
      {
         edtPMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtPMCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
         }
         else
         {
            edtPMCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV13PMCod) )
      {
         edtPMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV18Insert_PMMaqCod)==0) )
      {
         edtPMMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPMMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV26Insert_PMTipoID) )
      {
         edtPMTipoID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMTipoID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTipoID_Enabled), 5, 0), true);
      }
      else
      {
         edtPMTipoID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMTipoID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTipoID_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV26Insert_PMTipoID) )
      {
         A14271PMTipoID = AV26Insert_PMTipoID ;
         httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
      }
      else
      {
         A14271PMTipoID = AV33ComboPMTipoID ;
         httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV18Insert_PMMaqCod)==0) )
      {
         A9476PMMaqCod = AV18Insert_PMMaqCod ;
         n9476PMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
      }
      else
      {
         A9476PMMaqCod = AV25ComboPMMaqCod ;
         n9476PMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
      }
      if ( ! (0==AV13PMCod) )
      {
         A9429PMCod = AV13PMCod ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9429PMCod = AV13PMCod ;
            n9429PMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9474PMFchCre)) && ( Gx_BScreen == 0 ) )
      {
         A9474PMFchCre = GXutil.serverDate( context, remoteHandle, pr_default) ;
         n9474PMFchCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A9475PMUsuCre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9475PMUsuCre = AV8UsurCod ;
         n9475PMUsuCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9475PMUsuCre", A9475PMUsuCre);
      }
      if ( isIns( )  && (GXutil.strcmp("", A9478PMEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A9478PMEst = httpContext.getMessage( httpContext.getMessage( "A", ""), "") ;
         n9478PMEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9484PMIni)) && ( Gx_BScreen == 0 ) )
      {
         A9484PMIni = GXutil.serverDate( context, remoteHandle, pr_default) ;
         n9484PMIni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T013V16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T013V16_A407EmprNom[0] ;
         n407EmprNom = T013V16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
         /* Using cursor T013V18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A14271PMTipoID)});
         A14272PMTipoDsc = T013V18_A14272PMTipoDsc[0] ;
         pr_default.close(16);
         /* Using cursor T013V17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod});
         A9477PMMaqDsc = T013V17_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = T013V17_n9477PMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", A9477PMMaqDsc);
         pr_default.close(15);
      }
   }

   public void load13V1236( )
   {
      /* Using cursor T013V19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1236 = (short)(1) ;
         A407EmprNom = T013V19_A407EmprNom[0] ;
         n407EmprNom = T013V19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9473PMDsc = T013V19_A9473PMDsc[0] ;
         n9473PMDsc = T013V19_n9473PMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9473PMDsc", A9473PMDsc);
         A9474PMFchCre = T013V19_A9474PMFchCre[0] ;
         n9474PMFchCre = T013V19_n9474PMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
         A9475PMUsuCre = T013V19_A9475PMUsuCre[0] ;
         n9475PMUsuCre = T013V19_n9475PMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9475PMUsuCre", A9475PMUsuCre);
         A9477PMMaqDsc = T013V19_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = T013V19_n9477PMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", A9477PMMaqDsc);
         A9478PMEst = T013V19_A9478PMEst[0] ;
         n9478PMEst = T013V19_n9478PMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
         A9483PMTxt = T013V19_A9483PMTxt[0] ;
         n9483PMTxt = T013V19_n9483PMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9483PMTxt", A9483PMTxt);
         A9484PMIni = T013V19_A9484PMIni[0] ;
         n9484PMIni = T013V19_n9484PMIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
         A9485PMFin = T013V19_A9485PMFin[0] ;
         n9485PMFin = T013V19_n9485PMFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9485PMFin", localUtil.format(A9485PMFin, "99/99/99"));
         A9486PMUlt = T013V19_A9486PMUlt[0] ;
         n9486PMUlt = T013V19_n9486PMUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
         A11454PMUso = T013V19_A11454PMUso[0] ;
         n11454PMUso = T013V19_n11454PMUso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11454PMUso", GXutil.ltrimstr( A11454PMUso, 8, 2));
         A9487PMDias = T013V19_A9487PMDias[0] ;
         n9487PMDias = T013V19_n9487PMDias[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9487PMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9487PMDias), 3, 0));
         A9488PMOrd = T013V19_A9488PMOrd[0] ;
         n9488PMOrd = T013V19_n9488PMOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9488PMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9488PMOrd), 8, 0));
         A11455PMTie = T013V19_A11455PMTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11455PMTie", GXutil.ltrimstr( A11455PMTie, 6, 2));
         A11456PMPla = T013V19_A11456PMPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11456PMPla", A11456PMPla);
         A13013PMUsoMts = T013V19_A13013PMUsoMts[0] ;
         n13013PMUsoMts = T013V19_n13013PMUsoMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13013PMUsoMts", GXutil.ltrimstr( A13013PMUsoMts, 10, 2));
         A14275PMDiasPavi = T013V19_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = T013V19_n14275PMDiasPavi[0] ;
         A14272PMTipoDsc = T013V19_A14272PMTipoDsc[0] ;
         A14274PMTieMto = T013V19_A14274PMTieMto[0] ;
         n14274PMTieMto = T013V19_n14274PMTieMto[0] ;
         A9476PMMaqCod = T013V19_A9476PMMaqCod[0] ;
         n9476PMMaqCod = T013V19_n9476PMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
         A14271PMTipoID = T013V19_A14271PMTipoID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
         zm13V1236( -38) ;
      }
      pr_default.close(17);
      onLoadActions13V1236( ) ;
   }

   public void onLoadActions13V1236( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9486PMUlt)) && ( Gx_BScreen == 0 ) )
      {
         A9486PMUlt = A9484PMIni ;
         n9486PMUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
      }
   }

   public void checkExtendedTable13V1236( )
   {
      nIsDirty_1236 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T013V16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013V16_A407EmprNom[0] ;
      n407EmprNom = T013V16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T013V17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9477PMMaqDsc = T013V17_A9477PMMaqDsc[0] ;
      n9477PMMaqDsc = T013V17_n9477PMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", A9477PMMaqDsc);
      pr_default.close(15);
      /* Using cursor T013V18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A14271PMTipoID)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPOS DE PREVENTIVO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMTIPOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14272PMTipoDsc = T013V18_A14272PMTipoDsc[0] ;
      pr_default.close(16);
      if ( (GXutil.strcmp("", A9473PMDsc)==0) && true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Explicacion del tipo de mantenimiento", ""), 1, "PMDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A9478PMEst, "A") == 0 ) || ( GXutil.strcmp(A9478PMEst, "I") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Preventivo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPMEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A9487PMDias) && true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nro dias para programar el proximo mantenimiento", ""), 1, "PMDIAS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDias_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9486PMUlt)) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1236 = (short)(1) ;
         A9486PMUlt = A9484PMIni ;
         n9486PMUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
      }
   }

   public void closeExtendedTableCursors13V1236( )
   {
      pr_default.close(14);
      pr_default.close(15);
      pr_default.close(16);
   }

   public void enableDisable( )
   {
   }

   public void gxload_39( String A396EmprCod )
   {
      /* Using cursor T013V20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013V20_A407EmprNom[0] ;
      n407EmprNom = T013V20_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_40( String A396EmprCod ,
                          String A9476PMMaqCod )
   {
      /* Using cursor T013V21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9477PMMaqDsc = T013V21_A9477PMMaqDsc[0] ;
      n9477PMMaqDsc = T013V21_n9477PMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", A9477PMMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9477PMMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_41( String A396EmprCod ,
                          short A14271PMTipoID )
   {
      /* Using cursor T013V22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A14271PMTipoID)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPOS DE PREVENTIVO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMTIPOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14272PMTipoDsc = T013V22_A14272PMTipoDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14272PMTipoDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey13V1236( )
   {
      /* Using cursor T013V23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1236 = (short)(1) ;
      }
      else
      {
         RcdFound1236 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013V15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         zm13V1236( 38) ;
         RcdFound1236 = (short)(1) ;
         A9429PMCod = T013V15_A9429PMCod[0] ;
         n9429PMCod = T013V15_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9473PMDsc = T013V15_A9473PMDsc[0] ;
         n9473PMDsc = T013V15_n9473PMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9473PMDsc", A9473PMDsc);
         A9474PMFchCre = T013V15_A9474PMFchCre[0] ;
         n9474PMFchCre = T013V15_n9474PMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
         A9475PMUsuCre = T013V15_A9475PMUsuCre[0] ;
         n9475PMUsuCre = T013V15_n9475PMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9475PMUsuCre", A9475PMUsuCre);
         A9478PMEst = T013V15_A9478PMEst[0] ;
         n9478PMEst = T013V15_n9478PMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
         A9483PMTxt = T013V15_A9483PMTxt[0] ;
         n9483PMTxt = T013V15_n9483PMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9483PMTxt", A9483PMTxt);
         A9484PMIni = T013V15_A9484PMIni[0] ;
         n9484PMIni = T013V15_n9484PMIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
         A9485PMFin = T013V15_A9485PMFin[0] ;
         n9485PMFin = T013V15_n9485PMFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9485PMFin", localUtil.format(A9485PMFin, "99/99/99"));
         A9486PMUlt = T013V15_A9486PMUlt[0] ;
         n9486PMUlt = T013V15_n9486PMUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
         A11454PMUso = T013V15_A11454PMUso[0] ;
         n11454PMUso = T013V15_n11454PMUso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11454PMUso", GXutil.ltrimstr( A11454PMUso, 8, 2));
         A9487PMDias = T013V15_A9487PMDias[0] ;
         n9487PMDias = T013V15_n9487PMDias[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9487PMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9487PMDias), 3, 0));
         A9488PMOrd = T013V15_A9488PMOrd[0] ;
         n9488PMOrd = T013V15_n9488PMOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9488PMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9488PMOrd), 8, 0));
         A11455PMTie = T013V15_A11455PMTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11455PMTie", GXutil.ltrimstr( A11455PMTie, 6, 2));
         A11456PMPla = T013V15_A11456PMPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11456PMPla", A11456PMPla);
         A13013PMUsoMts = T013V15_A13013PMUsoMts[0] ;
         n13013PMUsoMts = T013V15_n13013PMUsoMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13013PMUsoMts", GXutil.ltrimstr( A13013PMUsoMts, 10, 2));
         A14275PMDiasPavi = T013V15_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = T013V15_n14275PMDiasPavi[0] ;
         A14274PMTieMto = T013V15_A14274PMTieMto[0] ;
         n14274PMTieMto = T013V15_n14274PMTieMto[0] ;
         A396EmprCod = T013V15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9476PMMaqCod = T013V15_A9476PMMaqCod[0] ;
         n9476PMMaqCod = T013V15_n9476PMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
         A14271PMTipoID = T013V15_A14271PMTipoID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         sMode1236 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13V1236( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1236 = (short)(0) ;
            initializeNonKey13V1236( ) ;
         }
         Gx_mode = sMode1236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1236 = (short)(0) ;
         initializeNonKey13V1236( ) ;
         sMode1236 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(13);
   }

   public void getEqualNoModal( )
   {
      getKey13V1236( ) ;
      if ( RcdFound1236 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1236 = (short)(0) ;
      /* Using cursor T013V24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T013V24_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013V24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013V24_A9429PMCod[0] < A9429PMCod ) ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T013V24_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013V24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013V24_A9429PMCod[0] > A9429PMCod ) ) )
         {
            A396EmprCod = T013V24_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9429PMCod = T013V24_A9429PMCod[0] ;
            n9429PMCod = T013V24_n9429PMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            RcdFound1236 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void move_previous( )
   {
      RcdFound1236 = (short)(0) ;
      /* Using cursor T013V25 */
      pr_default.execute(23, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T013V25_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013V25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013V25_A9429PMCod[0] > A9429PMCod ) ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T013V25_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013V25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013V25_A9429PMCod[0] < A9429PMCod ) ) )
         {
            A396EmprCod = T013V25_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9429PMCod = T013V25_A9429PMCod[0] ;
            n9429PMCod = T013V25_n9429PMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            RcdFound1236 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13V1236( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPMDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13V1236( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1236 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9429PMCod = Z9429PMCod ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPMDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update13V1236( ) ;
               GX_FocusControl = edtPMDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtPMDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13V1236( ) ;
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
                  GX_FocusControl = edtPMDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13V1236( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9429PMCod = Z9429PMCod ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPMDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13V1236( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013V14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(12) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPREVE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(12) == 101) || ( GXutil.strcmp(Z9473PMDsc, T013V14_A9473PMDsc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9474PMFchCre), GXutil.resetTime(T013V14_A9474PMFchCre[0])) ) || ( GXutil.strcmp(Z9475PMUsuCre, T013V14_A9475PMUsuCre[0]) != 0 ) || ( GXutil.strcmp(Z9478PMEst, T013V14_A9478PMEst[0]) != 0 ) || ( GXutil.strcmp(Z9483PMTxt, T013V14_A9483PMTxt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z9484PMIni), GXutil.resetTime(T013V14_A9484PMIni[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z9485PMFin), GXutil.resetTime(T013V14_A9485PMFin[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z9486PMUlt), GXutil.resetTime(T013V14_A9486PMUlt[0])) ) || ( DecimalUtil.compareTo(Z11454PMUso, T013V14_A11454PMUso[0]) != 0 ) || ( Z9487PMDias != T013V14_A9487PMDias[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9488PMOrd != T013V14_A9488PMOrd[0] ) || ( DecimalUtil.compareTo(Z11455PMTie, T013V14_A11455PMTie[0]) != 0 ) || ( GXutil.strcmp(Z11456PMPla, T013V14_A11456PMPla[0]) != 0 ) || ( DecimalUtil.compareTo(Z13013PMUsoMts, T013V14_A13013PMUsoMts[0]) != 0 ) || ( Z14275PMDiasPavi != T013V14_A14275PMDiasPavi[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14274PMTieMto, T013V14_A14274PMTieMto[0]) != 0 ) || ( GXutil.strcmp(Z9476PMMaqCod, T013V14_A9476PMMaqCod[0]) != 0 ) || ( Z14271PMTipoID != T013V14_A14271PMTipoID[0] ) )
         {
            if ( GXutil.strcmp(Z9473PMDsc, T013V14_A9473PMDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMDsc");
               GXutil.writeLogRaw("Old: ",Z9473PMDsc);
               GXutil.writeLogRaw("Current: ",T013V14_A9473PMDsc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9474PMFchCre), GXutil.resetTime(T013V14_A9474PMFchCre[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMFchCre");
               GXutil.writeLogRaw("Old: ",Z9474PMFchCre);
               GXutil.writeLogRaw("Current: ",T013V14_A9474PMFchCre[0]);
            }
            if ( GXutil.strcmp(Z9475PMUsuCre, T013V14_A9475PMUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMUsuCre");
               GXutil.writeLogRaw("Old: ",Z9475PMUsuCre);
               GXutil.writeLogRaw("Current: ",T013V14_A9475PMUsuCre[0]);
            }
            if ( GXutil.strcmp(Z9478PMEst, T013V14_A9478PMEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMEst");
               GXutil.writeLogRaw("Old: ",Z9478PMEst);
               GXutil.writeLogRaw("Current: ",T013V14_A9478PMEst[0]);
            }
            if ( GXutil.strcmp(Z9483PMTxt, T013V14_A9483PMTxt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMTxt");
               GXutil.writeLogRaw("Old: ",Z9483PMTxt);
               GXutil.writeLogRaw("Current: ",T013V14_A9483PMTxt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9484PMIni), GXutil.resetTime(T013V14_A9484PMIni[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMIni");
               GXutil.writeLogRaw("Old: ",Z9484PMIni);
               GXutil.writeLogRaw("Current: ",T013V14_A9484PMIni[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9485PMFin), GXutil.resetTime(T013V14_A9485PMFin[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMFin");
               GXutil.writeLogRaw("Old: ",Z9485PMFin);
               GXutil.writeLogRaw("Current: ",T013V14_A9485PMFin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9486PMUlt), GXutil.resetTime(T013V14_A9486PMUlt[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMUlt");
               GXutil.writeLogRaw("Old: ",Z9486PMUlt);
               GXutil.writeLogRaw("Current: ",T013V14_A9486PMUlt[0]);
            }
            if ( DecimalUtil.compareTo(Z11454PMUso, T013V14_A11454PMUso[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMUso");
               GXutil.writeLogRaw("Old: ",Z11454PMUso);
               GXutil.writeLogRaw("Current: ",T013V14_A11454PMUso[0]);
            }
            if ( Z9487PMDias != T013V14_A9487PMDias[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMDias");
               GXutil.writeLogRaw("Old: ",Z9487PMDias);
               GXutil.writeLogRaw("Current: ",T013V14_A9487PMDias[0]);
            }
            if ( Z9488PMOrd != T013V14_A9488PMOrd[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMOrd");
               GXutil.writeLogRaw("Old: ",Z9488PMOrd);
               GXutil.writeLogRaw("Current: ",T013V14_A9488PMOrd[0]);
            }
            if ( DecimalUtil.compareTo(Z11455PMTie, T013V14_A11455PMTie[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMTie");
               GXutil.writeLogRaw("Old: ",Z11455PMTie);
               GXutil.writeLogRaw("Current: ",T013V14_A11455PMTie[0]);
            }
            if ( GXutil.strcmp(Z11456PMPla, T013V14_A11456PMPla[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMPla");
               GXutil.writeLogRaw("Old: ",Z11456PMPla);
               GXutil.writeLogRaw("Current: ",T013V14_A11456PMPla[0]);
            }
            if ( DecimalUtil.compareTo(Z13013PMUsoMts, T013V14_A13013PMUsoMts[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMUsoMts");
               GXutil.writeLogRaw("Old: ",Z13013PMUsoMts);
               GXutil.writeLogRaw("Current: ",T013V14_A13013PMUsoMts[0]);
            }
            if ( Z14275PMDiasPavi != T013V14_A14275PMDiasPavi[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMDiasPavi");
               GXutil.writeLogRaw("Old: ",Z14275PMDiasPavi);
               GXutil.writeLogRaw("Current: ",T013V14_A14275PMDiasPavi[0]);
            }
            if ( DecimalUtil.compareTo(Z14274PMTieMto, T013V14_A14274PMTieMto[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMTieMto");
               GXutil.writeLogRaw("Old: ",Z14274PMTieMto);
               GXutil.writeLogRaw("Current: ",T013V14_A14274PMTieMto[0]);
            }
            if ( GXutil.strcmp(Z9476PMMaqCod, T013V14_A9476PMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9476PMMaqCod);
               GXutil.writeLogRaw("Current: ",T013V14_A9476PMMaqCod[0]);
            }
            if ( Z14271PMTipoID != T013V14_A14271PMTipoID[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMTipoID");
               GXutil.writeLogRaw("Old: ",Z14271PMTipoID);
               GXutil.writeLogRaw("Current: ",T013V14_A14271PMTipoID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPREVE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13V1236( )
   {
      beforeValidate13V1236( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1236( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13V1236( 0) ;
         checkOptimisticConcurrency13V1236( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13V1236( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13V1236( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013V26 */
                  pr_default.execute(24, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Boolean.valueOf(n9473PMDsc), A9473PMDsc, Boolean.valueOf(n9474PMFchCre), A9474PMFchCre, Boolean.valueOf(n9475PMUsuCre), A9475PMUsuCre, Boolean.valueOf(n9478PMEst), A9478PMEst, Boolean.valueOf(n9483PMTxt), A9483PMTxt, Boolean.valueOf(n9484PMIni), A9484PMIni, Boolean.valueOf(n9485PMFin), A9485PMFin, Boolean.valueOf(n9486PMUlt), A9486PMUlt, Boolean.valueOf(n11454PMUso), A11454PMUso, Boolean.valueOf(n9487PMDias), Short.valueOf(A9487PMDias), Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), A11455PMTie, A11456PMPla, Boolean.valueOf(n13013PMUsoMts), A13013PMUsoMts, Boolean.valueOf(n14275PMDiasPavi), Short.valueOf(A14275PMDiasPavi), Boolean.valueOf(n14274PMTieMto), A14274PMTieMto, A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, Short.valueOf(A14271PMTipoID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
                  if ( (pr_default.getStatus(24) == 1) )
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
                        processLevel13V1236( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption13V0( ) ;
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
            load13V1236( ) ;
         }
         endLevel13V1236( ) ;
      }
      closeExtendedTableCursors13V1236( ) ;
   }

   public void update13V1236( )
   {
      beforeValidate13V1236( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1236( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13V1236( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13V1236( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13V1236( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013V27 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n9473PMDsc), A9473PMDsc, Boolean.valueOf(n9474PMFchCre), A9474PMFchCre, Boolean.valueOf(n9475PMUsuCre), A9475PMUsuCre, Boolean.valueOf(n9478PMEst), A9478PMEst, Boolean.valueOf(n9483PMTxt), A9483PMTxt, Boolean.valueOf(n9484PMIni), A9484PMIni, Boolean.valueOf(n9485PMFin), A9485PMFin, Boolean.valueOf(n9486PMUlt), A9486PMUlt, Boolean.valueOf(n11454PMUso), A11454PMUso, Boolean.valueOf(n9487PMDias), Short.valueOf(A9487PMDias), Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), A11455PMTie, A11456PMPla, Boolean.valueOf(n13013PMUsoMts), A13013PMUsoMts, Boolean.valueOf(n14275PMDiasPavi), Short.valueOf(A14275PMDiasPavi), Boolean.valueOf(n14274PMTieMto), A14274PMTieMto, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, Short.valueOf(A14271PMTipoID), A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
                  if ( (pr_default.getStatus(25) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPREVE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13V1236( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13V1236( ) ;
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
         endLevel13V1236( ) ;
      }
      closeExtendedTableCursors13V1236( ) ;
   }

   public void deferredUpdate13V1236( )
   {
   }

   public void delete( )
   {
      beforeValidate13V1236( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13V1236( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13V1236( ) ;
         afterConfirm13V1236( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13V1236( ) ;
            if ( AnyError == 0 )
            {
               scanStart13V1532( ) ;
               while ( RcdFound1532 != 0 )
               {
                  getByPrimaryKey13V1532( ) ;
                  delete13V1532( ) ;
                  scanNext13V1532( ) ;
               }
               scanEnd13V1532( ) ;
               scanStart13V1523( ) ;
               while ( RcdFound1523 != 0 )
               {
                  getByPrimaryKey13V1523( ) ;
                  delete13V1523( ) ;
                  scanNext13V1523( ) ;
               }
               scanEnd13V1523( ) ;
               scanStart13V1237( ) ;
               while ( RcdFound1237 != 0 )
               {
                  getByPrimaryKey13V1237( ) ;
                  delete13V1237( ) ;
                  scanNext13V1237( ) ;
               }
               scanEnd13V1237( ) ;
               scanStart13V1533( ) ;
               while ( RcdFound1533 != 0 )
               {
                  getByPrimaryKey13V1533( ) ;
                  delete13V1533( ) ;
                  scanNext13V1533( ) ;
               }
               scanEnd13V1533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013V28 */
                  pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
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
      sMode1236 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13V1236( ) ;
      Gx_mode = sMode1236 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13V1236( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (GXutil.strcmp("", A9473PMDsc)==0) && true /* After */ && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Explicacion del tipo de mantenimiento", ""), 1, "PMDSC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDsc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( (0==A9487PMDias) && true /* After */ && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nro dias para programar el proximo mantenimiento", ""), 1, "PMDIAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDias_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T013V29 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         A407EmprNom = T013V29_A407EmprNom[0] ;
         n407EmprNom = T013V29_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(27);
         /* Using cursor T013V30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod});
         A9477PMMaqDsc = T013V30_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = T013V30_n9477PMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", A9477PMMaqDsc);
         pr_default.close(28);
         /* Using cursor T013V31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A14271PMTipoID)});
         A14272PMTipoDsc = T013V31_A14272PMTipoDsc[0] ;
         pr_default.close(29);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013V32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T013V33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void processNestedLevel13V1532( )
   {
      nGXsfl_177_idx = 0 ;
      while ( nGXsfl_177_idx < nRC_GXsfl_177 )
      {
         readRow13V1532( ) ;
         if ( ( nRcdExists_1532 != 0 ) || ( nIsMod_1532 != 0 ) )
         {
            standaloneNotModal13V1532( ) ;
            getKey13V1532( ) ;
            if ( ( nRcdExists_1532 == 0 ) && ( nRcdDeleted_1532 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13V1532( ) ;
            }
            else
            {
               if ( RcdFound1532 != 0 )
               {
                  if ( ( nRcdDeleted_1532 != 0 ) && ( nRcdExists_1532 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13V1532( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1532 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13V1532( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1532 == 0 )
                  {
                     GXCCtl = "PMMEQUCOD_" + sGXsfl_177_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMMEquCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMMEquCod_Internalname, GXutil.rtrim( A11450PMMEquCod)) ;
         httpContext.changePostValue( edtPMMEquDsc_Internalname, GXutil.rtrim( A12597PMMEquDsc)) ;
         httpContext.changePostValue( edtPMMSEqCod_Internalname, GXutil.rtrim( A11451PMMSEqCod)) ;
         httpContext.changePostValue( edtPMMSEqDsc_Internalname, GXutil.rtrim( A12598PMMSEqDsc)) ;
         httpContext.changePostValue( edtPMMPieCod_Internalname, GXutil.rtrim( A11452PMMPieCod)) ;
         httpContext.changePostValue( edtPMMPieDsc_Internalname, GXutil.rtrim( A11453PMMPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11450PMMEquCod_"+sGXsfl_177_idx, GXutil.rtrim( Z11450PMMEquCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11451PMMSEqCod_"+sGXsfl_177_idx, GXutil.rtrim( Z11451PMMSEqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11452PMMPieCod_"+sGXsfl_177_idx, GXutil.rtrim( Z11452PMMPieCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1532_"+sGXsfl_177_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1532_"+sGXsfl_177_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1532_"+sGXsfl_177_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1532 != 0 )
         {
            httpContext.changePostValue( "PMMEQUCOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMEQUDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMSEQCOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMSEQDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMPIECOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMMPIEDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13V1532( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1532 = (short)(0) ;
      nIsMod_1532 = (short)(0) ;
      nRcdDeleted_1532 = (short)(0) ;
   }

   public void processNestedLevel13V1237( )
   {
      nGXsfl_213_idx = 0 ;
      while ( nGXsfl_213_idx < nRC_GXsfl_213 )
      {
         readRow13V1237( ) ;
         if ( ( nRcdExists_1237 != 0 ) || ( nIsMod_1237 != 0 ) )
         {
            standaloneNotModal13V1237( ) ;
            getKey13V1237( ) ;
            if ( ( nRcdExists_1237 == 0 ) && ( nRcdDeleted_1237 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13V1237( ) ;
            }
            else
            {
               if ( RcdFound1237 != 0 )
               {
                  if ( ( nRcdDeleted_1237 != 0 ) && ( nRcdExists_1237 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13V1237( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1237 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13V1237( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1237 == 0 )
                  {
                     GXCCtl = "PMREPCOD_" + sGXsfl_213_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9489PMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMRepNom_Internalname, GXutil.rtrim( A9490PMRepNom)) ;
         httpContext.changePostValue( edtPMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9491PMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9489PMRepCod_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z9489PMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9491PMRRCnt_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z9491PMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1237_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1237_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1237_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1237 != 0 )
         {
            httpContext.changePostValue( "PMREPCOD_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMREPCOD_"+sGXsfl_213_idx+"Horizontalalignment", GXutil.rtrim( edtPMRepCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PMREPNOM_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMRRCNT_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13V1237( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1237 = (short)(0) ;
      nIsMod_1237 = (short)(0) ;
      nRcdDeleted_1237 = (short)(0) ;
   }

   public void processNestedLevel13V1533( )
   {
      nGXsfl_206_idx = 0 ;
      while ( nGXsfl_206_idx < nRC_GXsfl_206 )
      {
         readRow13V1533( ) ;
         if ( ( nRcdExists_1533 != 0 ) || ( nIsMod_1533 != 0 ) )
         {
            standaloneNotModal13V1533( ) ;
            getKey13V1533( ) ;
            if ( ( nRcdExists_1533 == 0 ) && ( nRcdDeleted_1533 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13V1533( ) ;
            }
            else
            {
               if ( RcdFound1533 != 0 )
               {
                  if ( ( nRcdDeleted_1533 != 0 ) && ( nRcdExists_1533 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13V1533( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13V1533( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1533 == 0 )
                  {
                     GXCCtl = "PMTCOD_" + sGXsfl_206_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMTDsc_Internalname, GXutil.rtrim( A9480PMTDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9479PMTCod_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( Z9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1533_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1533_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1533_"+sGXsfl_206_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1533 != 0 )
         {
            httpContext.changePostValue( "PMTCOD_"+sGXsfl_206_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMTCOD_"+sGXsfl_206_idx+"Horizontalalignment", GXutil.rtrim( edtPMTCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PMTDSC_"+sGXsfl_206_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13V1533( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1533 = (short)(0) ;
      nIsMod_1533 = (short)(0) ;
      nRcdDeleted_1533 = (short)(0) ;
   }

   public void processNestedLevel13V1523( )
   {
      nGXsfl_193_idx = 0 ;
      while ( nGXsfl_193_idx < nRC_GXsfl_193 )
      {
         readRow13V1523( ) ;
         if ( ( nRcdExists_1523 != 0 ) || ( nIsMod_1523 != 0 ) )
         {
            standaloneNotModal13V1523( ) ;
            getKey13V1523( ) ;
            if ( ( nRcdExists_1523 == 0 ) && ( nRcdDeleted_1523 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13V1523( ) ;
            }
            else
            {
               if ( RcdFound1523 != 0 )
               {
                  if ( ( nRcdDeleted_1523 != 0 ) && ( nRcdExists_1523 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13V1523( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1523 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13V1523( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1523 == 0 )
                  {
                     GXCCtl = "PMOPERES_" + sGXsfl_193_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMOpeRes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMOpeRes_Internalname, h9481PMOpeRes) ;
         httpContext.changePostValue( edtPMOpeResN_Internalname, GXutil.rtrim( A9482PMOpeResN)) ;
         httpContext.changePostValue( edtPMOpeTie_Internalname, GXutil.ltrim( localUtil.ntoc( A11457PMOpeTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9481PMOpeRes_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z9481PMOpeRes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11457PMOpeTie_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z11457PMOpeTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1523_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1523_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1523_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1523 != 0 )
         {
            httpContext.changePostValue( "PMOPERES_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMOPERESN_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeResN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMOPETIE_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13V1523( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1523 = (short)(0) ;
      nIsMod_1523 = (short)(0) ;
      nRcdDeleted_1523 = (short)(0) ;
   }

   public void processLevel13V1236( )
   {
      /* Save parent mode. */
      sMode1236 = Gx_mode ;
      processNestedLevel13V1532( ) ;
      processNestedLevel13V1237( ) ;
      processNestedLevel13V1533( ) ;
      processNestedLevel13V1523( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1236 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13V1236( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13V1236( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmpreve");
         if ( AnyError == 0 )
         {
            confirmValues13V0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmpreve");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13V1236( )
   {
      /* Scan By routine */
      /* Using cursor T013V34 */
      pr_default.execute(32);
      RcdFound1236 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1236 = (short)(1) ;
         A396EmprCod = T013V34_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9429PMCod = T013V34_A9429PMCod[0] ;
         n9429PMCod = T013V34_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13V1236( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1236 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1236 = (short)(1) ;
         A396EmprCod = T013V34_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9429PMCod = T013V34_A9429PMCod[0] ;
         n9429PMCod = T013V34_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
   }

   public void scanEnd13V1236( )
   {
      pr_default.close(32);
   }

   public void afterConfirm13V1236( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int10 = A9429PMCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTPRE", ""), ""), GXv_int11) ;
         tmpreve_impl.this.GXt_int10 = GXv_int11[0] ;
         A9429PMCod = GXt_int10 ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
   }

   public void beforeInsert13V1236( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13V1236( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13V1236( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13V1236( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13V1236( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13V1236( )
   {
      edtPMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      edtPMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDsc_Enabled), 5, 0), true);
      edtPMTipoID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTipoID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTipoID_Enabled), 5, 0), true);
      edtPMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqCod_Enabled), 5, 0), true);
      cmbPMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPMEst.getEnabled(), 5, 0), true);
      edtPMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMFchCre_Enabled), 5, 0), true);
      edtPMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUsuCre_Enabled), 5, 0), true);
      edtPMDias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDias_Enabled), 5, 0), true);
      edtPMUso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUso_Enabled), 5, 0), true);
      edtPMUsoMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUsoMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUsoMts_Enabled), 5, 0), true);
      edtPMTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTie_Enabled), 5, 0), true);
      edtPMPla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMPla_Enabled), 5, 0), true);
      edtPMIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMIni_Enabled), 5, 0), true);
      edtPMFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMFin_Enabled), 5, 0), true);
      edtPMUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUlt_Enabled), 5, 0), true);
      edtPMOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOrd_Enabled), 5, 0), true);
      edtPMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTxt_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombopmtipoid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopmtipoid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopmtipoid_Enabled), 5, 0), true);
      edtavCombopmmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopmmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopmmaqcod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqDsc_Enabled), 5, 0), true);
   }

   public void zm13V1532( int GX_JID )
   {
      if ( ( GX_JID == 42 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -42 )
      {
         Z9429PMCod = A9429PMCod ;
         Z396EmprCod = A396EmprCod ;
         Z11450PMMEquCod = A11450PMMEquCod ;
         Z11451PMMSEqCod = A11451PMMSEqCod ;
         Z11452PMMPieCod = A11452PMMPieCod ;
         Z12597PMMEquDsc = A12597PMMEquDsc ;
         Z12598PMMSEqDsc = A12598PMMSEqDsc ;
         Z11453PMMPieDsc = A11453PMMPieDsc ;
      }
   }

   public void standaloneNotModal13V1532( )
   {
      edtPMMEquDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMEquDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMSEqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
   }

   public void standaloneModal13V1532( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMMEquCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      }
      else
      {
         edtPMMEquCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMMSEqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      }
      else
      {
         edtPMMSEqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMMPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      }
      else
      {
         edtPMMPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      }
   }

   public void load13V1532( )
   {
      /* Using cursor T013V35 */
      pr_default.execute(33, new Object[] {Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1532 = (short)(1) ;
         A12597PMMEquDsc = T013V35_A12597PMMEquDsc[0] ;
         A12598PMMSEqDsc = T013V35_A12598PMMSEqDsc[0] ;
         A11453PMMPieDsc = T013V35_A11453PMMPieDsc[0] ;
         n11453PMMPieDsc = T013V35_n11453PMMPieDsc[0] ;
         zm13V1532( -42) ;
      }
      pr_default.close(33);
      onLoadActions13V1532( ) ;
   }

   public void onLoadActions13V1532( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXt_char1 = AV14MaqEquDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pmaqequdsc(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A11450PMMEquCod, GXv_char4) ;
         tmpreve_impl.this.GXt_char1 = GXv_char4[0] ;
         AV14MaqEquDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqEquDsc", AV14MaqEquDsc);
      }
   }

   public void checkExtendedTable13V1532( )
   {
      nIsDirty_1532 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13V1532( ) ;
      if ( true /* Level */ && true /* After */ )
      {
         GXt_char1 = AV14MaqEquDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pmaqequdsc(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A11450PMMEquCod, GXv_char4) ;
         tmpreve_impl.this.GXt_char1 = GXv_char4[0] ;
         AV14MaqEquDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqEquDsc", AV14MaqEquDsc);
      }
      /* Using cursor T013V13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         GXCCtl = "PMMPIECOD_" + sGXsfl_177_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMMEquCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12597PMMEquDsc = T013V13_A12597PMMEquDsc[0] ;
      A12598PMMSEqDsc = T013V13_A12598PMMSEqDsc[0] ;
      A11453PMMPieDsc = T013V13_A11453PMMPieDsc[0] ;
      n11453PMMPieDsc = T013V13_n11453PMMPieDsc[0] ;
      pr_default.close(11);
   }

   public void closeExtendedTableCursors13V1532( )
   {
      pr_default.close(11);
   }

   public void enableDisable13V1532( )
   {
   }

   public void gxload_43( String A396EmprCod ,
                          String A9476PMMaqCod ,
                          String A11450PMMEquCod ,
                          String A11451PMMSEqCod ,
                          String A11452PMMPieCod )
   {
      /* Using cursor T013V36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         GXCCtl = "PMMPIECOD_" + sGXsfl_177_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMMEquCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12597PMMEquDsc = T013V36_A12597PMMEquDsc[0] ;
      A12598PMMSEqDsc = T013V36_A12598PMMSEqDsc[0] ;
      A11453PMMPieDsc = T013V36_A11453PMMPieDsc[0] ;
      n11453PMMPieDsc = T013V36_n11453PMMPieDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12597PMMEquDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12598PMMSEqDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11453PMMPieDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(34) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(34);
   }

   public void getKey13V1532( )
   {
      /* Using cursor T013V37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound1532 = (short)(1) ;
      }
      else
      {
         RcdFound1532 = (short)(0) ;
      }
      pr_default.close(35);
   }

   public void getByPrimaryKey13V1532( )
   {
      /* Using cursor T013V12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         zm13V1532( 42) ;
         RcdFound1532 = (short)(1) ;
         initializeNonKey13V1532( ) ;
         A11450PMMEquCod = T013V12_A11450PMMEquCod[0] ;
         A11451PMMSEqCod = T013V12_A11451PMMSEqCod[0] ;
         A11452PMMPieCod = T013V12_A11452PMMPieCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         Z11450PMMEquCod = A11450PMMEquCod ;
         Z11451PMMSEqCod = A11451PMMSEqCod ;
         Z11452PMMPieCod = A11452PMMPieCod ;
         sMode1532 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13V1532( ) ;
         Gx_mode = sMode1532 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1532 = (short)(0) ;
         initializeNonKey13V1532( ) ;
         sMode1532 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13V1532( ) ;
         Gx_mode = sMode1532 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13V1532( ) ;
      }
      pr_default.close(10);
   }

   public void checkOptimisticConcurrency13V1532( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013V11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPrev2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPrev2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13V1532( )
   {
      beforeValidate13V1532( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1532( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13V1532( 0) ;
         checkOptimisticConcurrency13V1532( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13V1532( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13V1532( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013V38 */
                  pr_default.execute(36, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A396EmprCod, A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev2");
                  if ( (pr_default.getStatus(36) == 1) )
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
            load13V1532( ) ;
         }
         endLevel13V1532( ) ;
      }
      closeExtendedTableCursors13V1532( ) ;
   }

   public void update13V1532( )
   {
      beforeValidate13V1532( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1532( ) ;
      }
      if ( ( nIsMod_1532 != 0 ) || ( nIsDirty_1532 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13V1532( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13V1532( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13V1532( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMPrev2 */
                     deferredUpdate13V1532( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13V1532( ) ;
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
            endLevel13V1532( ) ;
         }
      }
      closeExtendedTableCursors13V1532( ) ;
   }

   public void deferredUpdate13V1532( )
   {
   }

   public void delete13V1532( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13V1532( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13V1532( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13V1532( ) ;
         afterConfirm13V1532( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13V1532( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013V39 */
               pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev2");
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
      sMode1532 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13V1532( ) ;
      Gx_mode = sMode1532 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13V1532( )
   {
      standaloneModal13V1532( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ )
         {
            GXt_char1 = AV14MaqEquDsc ;
            GXv_char4[0] = GXt_char1 ;
            new app.pmaqequdsc(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A11450PMMEquCod, GXv_char4) ;
            tmpreve_impl.this.GXt_char1 = GXv_char4[0] ;
            AV14MaqEquDsc = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14MaqEquDsc", AV14MaqEquDsc);
         }
         /* Using cursor T013V40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
         A12597PMMEquDsc = T013V40_A12597PMMEquDsc[0] ;
         A12598PMMSEqDsc = T013V40_A12598PMMSEqDsc[0] ;
         A11453PMMPieDsc = T013V40_A11453PMMPieDsc[0] ;
         n11453PMMPieDsc = T013V40_n11453PMMPieDsc[0] ;
         pr_default.close(38);
      }
   }

   public void endLevel13V1532( )
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

   public void scanStart13V1532( )
   {
      /* Scan By routine */
      /* Using cursor T013V41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      RcdFound1532 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1532 = (short)(1) ;
         A11450PMMEquCod = T013V41_A11450PMMEquCod[0] ;
         A11451PMMSEqCod = T013V41_A11451PMMSEqCod[0] ;
         A11452PMMPieCod = T013V41_A11452PMMPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13V1532( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound1532 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1532 = (short)(1) ;
         A11450PMMEquCod = T013V41_A11450PMMEquCod[0] ;
         A11451PMMSEqCod = T013V41_A11451PMMSEqCod[0] ;
         A11452PMMPieCod = T013V41_A11452PMMPieCod[0] ;
      }
   }

   public void scanEnd13V1532( )
   {
      pr_default.close(39);
   }

   public void afterConfirm13V1532( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13V1532( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13V1532( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13V1532( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13V1532( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13V1532( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13V1532( )
   {
      edtPMMEquCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMEquDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMEquDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMSEqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMSEqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
   }

   public void send_integrity_lvl_hashes13V1532( )
   {
   }

   public void zm13V1237( int GX_JID )
   {
      if ( ( GX_JID == 44 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9491PMRRCnt = T013V9_A9491PMRRCnt[0] ;
         }
         else
         {
            Z9491PMRRCnt = A9491PMRRCnt ;
         }
      }
      if ( GX_JID == -44 )
      {
         Z9429PMCod = A9429PMCod ;
         Z9491PMRRCnt = A9491PMRRCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9489PMRepCod = A9489PMRepCod ;
         Z9490PMRepNom = A9490PMRepNom ;
      }
   }

   public void standaloneNotModal13V1237( )
   {
      edtPMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepNom_Enabled), 5, 0), !bGXsfl_213_Refreshing);
   }

   public void standaloneModal13V1237( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMRepCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepCod_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      }
      else
      {
         edtPMRepCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepCod_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      }
   }

   public void load13V1237( )
   {
      /* Using cursor T013V42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound1237 = (short)(1) ;
         A9490PMRepNom = T013V42_A9490PMRepNom[0] ;
         n9490PMRepNom = T013V42_n9490PMRepNom[0] ;
         A9491PMRRCnt = T013V42_A9491PMRRCnt[0] ;
         zm13V1237( -44) ;
      }
      pr_default.close(40);
      onLoadActions13V1237( ) ;
   }

   public void onLoadActions13V1237( )
   {
   }

   public void checkExtendedTable13V1237( )
   {
      nIsDirty_1237 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13V1237( ) ;
      /* Using cursor T013V10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9489PMRepCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         GXCCtl = "PMREPCOD_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9490PMRepNom = T013V10_A9490PMRepNom[0] ;
      n9490PMRepNom = T013V10_n9490PMRepNom[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors13V1237( )
   {
      pr_default.close(8);
   }

   public void enableDisable13V1237( )
   {
   }

   public void gxload_45( String A396EmprCod ,
                          int A9489PMRepCod )
   {
      /* Using cursor T013V43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A9489PMRepCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         GXCCtl = "PMREPCOD_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9490PMRepNom = T013V43_A9490PMRepNom[0] ;
      n9490PMRepNom = T013V43_n9490PMRepNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9490PMRepNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(41) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(41);
   }

   public void getKey13V1237( )
   {
      /* Using cursor T013V44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound1237 = (short)(1) ;
      }
      else
      {
         RcdFound1237 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKey13V1237( )
   {
      /* Using cursor T013V9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm13V1237( 44) ;
         RcdFound1237 = (short)(1) ;
         initializeNonKey13V1237( ) ;
         A9491PMRRCnt = T013V9_A9491PMRRCnt[0] ;
         A9489PMRepCod = T013V9_A9489PMRepCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         Z9489PMRepCod = A9489PMRepCod ;
         sMode1237 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13V1237( ) ;
         Gx_mode = sMode1237 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1237 = (short)(0) ;
         initializeNonKey13V1237( ) ;
         sMode1237 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13V1237( ) ;
         Gx_mode = sMode1237 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13V1237( ) ;
      }
      pr_default.close(7);
   }

   public void checkOptimisticConcurrency13V1237( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013V8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPreRe"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( DecimalUtil.compareTo(Z9491PMRRCnt, T013V8_A9491PMRRCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9491PMRRCnt, T013V8_A9491PMRRCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMRRCnt");
               GXutil.writeLogRaw("Old: ",Z9491PMRRCnt);
               GXutil.writeLogRaw("Current: ",T013V8_A9491PMRRCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPreRe"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13V1237( )
   {
      beforeValidate13V1237( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1237( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13V1237( 0) ;
         checkOptimisticConcurrency13V1237( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13V1237( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13V1237( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013V45 */
                  pr_default.execute(43, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A9491PMRRCnt, A396EmprCod, Integer.valueOf(A9489PMRepCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPreRe");
                  if ( (pr_default.getStatus(43) == 1) )
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
            load13V1237( ) ;
         }
         endLevel13V1237( ) ;
      }
      closeExtendedTableCursors13V1237( ) ;
   }

   public void update13V1237( )
   {
      beforeValidate13V1237( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1237( ) ;
      }
      if ( ( nIsMod_1237 != 0 ) || ( nIsDirty_1237 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13V1237( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13V1237( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13V1237( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013V46 */
                     pr_default.execute(44, new Object[] {A9491PMRRCnt, A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPreRe");
                     if ( (pr_default.getStatus(44) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPreRe"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13V1237( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13V1237( ) ;
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
            endLevel13V1237( ) ;
         }
      }
      closeExtendedTableCursors13V1237( ) ;
   }

   public void deferredUpdate13V1237( )
   {
   }

   public void delete13V1237( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13V1237( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13V1237( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13V1237( ) ;
         afterConfirm13V1237( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13V1237( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013V47 */
               pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPreRe");
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
      sMode1237 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13V1237( ) ;
      Gx_mode = sMode1237 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13V1237( )
   {
      standaloneModal13V1237( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013V48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A9489PMRepCod)});
         A9490PMRepNom = T013V48_A9490PMRepNom[0] ;
         n9490PMRepNom = T013V48_n9490PMRepNom[0] ;
         pr_default.close(46);
      }
   }

   public void endLevel13V1237( )
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

   public void scanStart13V1237( )
   {
      /* Scan By routine */
      /* Using cursor T013V49 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      RcdFound1237 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound1237 = (short)(1) ;
         A9489PMRepCod = T013V49_A9489PMRepCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13V1237( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound1237 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound1237 = (short)(1) ;
         A9489PMRepCod = T013V49_A9489PMRepCod[0] ;
      }
   }

   public void scanEnd13V1237( )
   {
      pr_default.close(47);
   }

   public void afterConfirm13V1237( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13V1237( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13V1237( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13V1237( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13V1237( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13V1237( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13V1237( )
   {
      edtPMRepCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepCod_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      edtPMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepNom_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      edtPMRRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRRCnt_Enabled), 5, 0), !bGXsfl_213_Refreshing);
   }

   public void send_integrity_lvl_hashes13V1237( )
   {
   }

   public void zm13V1533( int GX_JID )
   {
      if ( ( GX_JID == 46 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -46 )
      {
         Z9429PMCod = A9429PMCod ;
         Z396EmprCod = A396EmprCod ;
         Z9479PMTCod = A9479PMTCod ;
         Z9480PMTDsc = A9480PMTDsc ;
      }
   }

   public void standaloneNotModal13V1533( )
   {
      edtPMTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTDsc_Enabled), 5, 0), !bGXsfl_206_Refreshing);
   }

   public void standaloneModal13V1533( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_206_Refreshing);
      }
      else
      {
         edtPMTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_206_Refreshing);
      }
   }

   public void load13V1533( )
   {
      /* Using cursor T013V50 */
      pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1533 = (short)(1) ;
         A9480PMTDsc = T013V50_A9480PMTDsc[0] ;
         n9480PMTDsc = T013V50_n9480PMTDsc[0] ;
         zm13V1533( -46) ;
      }
      pr_default.close(48);
      onLoadActions13V1533( ) ;
   }

   public void onLoadActions13V1533( )
   {
   }

   public void checkExtendedTable13V1533( )
   {
      nIsDirty_1533 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13V1533( ) ;
      /* Using cursor T013V7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "PMTCOD_" + sGXsfl_206_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPTar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9480PMTDsc = T013V7_A9480PMTDsc[0] ;
      n9480PMTDsc = T013V7_n9480PMTDsc[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors13V1533( )
   {
      pr_default.close(5);
   }

   public void enableDisable13V1533( )
   {
   }

   public void gxload_47( String A396EmprCod ,
                          int A9479PMTCod )
   {
      /* Using cursor T013V51 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(49) == 101) )
      {
         GXCCtl = "PMTCOD_" + sGXsfl_206_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPTar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9480PMTDsc = T013V51_A9480PMTDsc[0] ;
      n9480PMTDsc = T013V51_n9480PMTDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9480PMTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(49) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(49);
   }

   public void getKey13V1533( )
   {
      /* Using cursor T013V52 */
      pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound1533 = (short)(1) ;
      }
      else
      {
         RcdFound1533 = (short)(0) ;
      }
      pr_default.close(50);
   }

   public void getByPrimaryKey13V1533( )
   {
      /* Using cursor T013V6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm13V1533( 46) ;
         RcdFound1533 = (short)(1) ;
         initializeNonKey13V1533( ) ;
         A9479PMTCod = T013V6_A9479PMTCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         Z9479PMTCod = A9479PMTCod ;
         sMode1533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13V1533( ) ;
         Gx_mode = sMode1533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1533 = (short)(0) ;
         initializeNonKey13V1533( ) ;
         sMode1533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13V1533( ) ;
         Gx_mode = sMode1533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13V1533( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency13V1533( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013V5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPrev3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPrev3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13V1533( )
   {
      beforeValidate13V1533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1533( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13V1533( 0) ;
         checkOptimisticConcurrency13V1533( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13V1533( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13V1533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013V53 */
                  pr_default.execute(51, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A396EmprCod, Integer.valueOf(A9479PMTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev3");
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
            load13V1533( ) ;
         }
         endLevel13V1533( ) ;
      }
      closeExtendedTableCursors13V1533( ) ;
   }

   public void update13V1533( )
   {
      beforeValidate13V1533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1533( ) ;
      }
      if ( ( nIsMod_1533 != 0 ) || ( nIsDirty_1533 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13V1533( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13V1533( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13V1533( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMPrev3 */
                     deferredUpdate13V1533( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13V1533( ) ;
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
            endLevel13V1533( ) ;
         }
      }
      closeExtendedTableCursors13V1533( ) ;
   }

   public void deferredUpdate13V1533( )
   {
   }

   public void delete13V1533( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13V1533( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13V1533( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13V1533( ) ;
         afterConfirm13V1533( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13V1533( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013V54 */
               pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev3");
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
      sMode1533 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13V1533( ) ;
      Gx_mode = sMode1533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13V1533( )
   {
      standaloneModal13V1533( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013V55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
         A9480PMTDsc = T013V55_A9480PMTDsc[0] ;
         n9480PMTDsc = T013V55_n9480PMTDsc[0] ;
         pr_default.close(53);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013V56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
      }
   }

   public void endLevel13V1533( )
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

   public void scanStart13V1533( )
   {
      /* Scan By routine */
      /* Using cursor T013V57 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      RcdFound1533 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound1533 = (short)(1) ;
         A9479PMTCod = T013V57_A9479PMTCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13V1533( )
   {
      /* Scan next routine */
      pr_default.readNext(55);
      RcdFound1533 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound1533 = (short)(1) ;
         A9479PMTCod = T013V57_A9479PMTCod[0] ;
      }
   }

   public void scanEnd13V1533( )
   {
      pr_default.close(55);
   }

   public void afterConfirm13V1533( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A9429PMCod ;
         GXv_int12[0] = A9479PMTCod ;
         new app.mantenimientomaquina.pmprerep(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int12) ;
         tmpreve_impl.this.A396EmprCod = GXv_char4[0] ;
         tmpreve_impl.this.A9429PMCod = GXv_int11[0] ;
         tmpreve_impl.this.A9479PMTCod = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
   }

   public void beforeInsert13V1533( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13V1533( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13V1533( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13V1533( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13V1533( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13V1533( )
   {
      edtPMTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_206_Refreshing);
      edtPMTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTDsc_Enabled), 5, 0), !bGXsfl_206_Refreshing);
   }

   public void send_integrity_lvl_hashes13V1533( )
   {
   }

   public void zm13V1523( int GX_JID )
   {
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11457PMOpeTie = T013V3_A11457PMOpeTie[0] ;
         }
         else
         {
            Z11457PMOpeTie = A11457PMOpeTie ;
         }
      }
      if ( GX_JID == -48 )
      {
         Z9429PMCod = A9429PMCod ;
         Z11457PMOpeTie = A11457PMOpeTie ;
         Z396EmprCod = A396EmprCod ;
         Z9481PMOpeRes = A9481PMOpeRes ;
         Z9482PMOpeResN = A9482PMOpeResN ;
      }
   }

   public void standaloneNotModal13V1523( )
   {
      edtPMOpeResN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeResN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeResN_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtPMOpeTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeTie_Enabled), 5, 0), !bGXsfl_193_Refreshing);
   }

   public void standaloneModal13V1523( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMOpeRes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMOpeRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeRes_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      }
      else
      {
         edtPMOpeRes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMOpeRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeRes_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      }
   }

   public void load13V1523( )
   {
      /* Using cursor T013V58 */
      pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9481PMOpeRes)});
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound1523 = (short)(1) ;
         A9482PMOpeResN = T013V58_A9482PMOpeResN[0] ;
         n9482PMOpeResN = T013V58_n9482PMOpeResN[0] ;
         A11457PMOpeTie = T013V58_A11457PMOpeTie[0] ;
         zm13V1523( -48) ;
      }
      pr_default.close(56);
      onLoadActions13V1523( ) ;
   }

   public void onLoadActions13V1523( )
   {
      /* Using cursor T013V59 */
      pr_default.execute(57, new Object[] {A396EmprCod, Integer.valueOf(A9481PMOpeRes)});
      h9481PMOpeRes = "" ;
      while ( (pr_default.getStatus(57) != 101) )
      {
         h9481PMOpeRes = T013V59_A13748OpeCNom[0] ;
         if (true) break;
      }
      pr_default.close(57);
      httpContext.ajax_rsp_assign_attri("", false, "h9481PMOpeRes", h9481PMOpeRes);
   }

   public void checkExtendedTable13V1523( )
   {
      nIsDirty_1523 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13V1523( ) ;
      /* Using cursor T013V4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9481PMOpeRes)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PMOPERES_" + sGXsfl_193_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPOpeRes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMOpeRes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9482PMOpeResN = T013V4_A9482PMOpeResN[0] ;
      n9482PMOpeResN = T013V4_n9482PMOpeResN[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors13V1523( )
   {
      pr_default.close(2);
   }

   public void enableDisable13V1523( )
   {
   }

   public void gxload_49( String A396EmprCod ,
                          int A9481PMOpeRes )
   {
      /* Using cursor T013V60 */
      pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A9481PMOpeRes)});
      if ( (pr_default.getStatus(58) == 101) )
      {
         GXCCtl = "PMOPERES_" + sGXsfl_193_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPOpeRes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMOpeRes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9482PMOpeResN = T013V60_A9482PMOpeResN[0] ;
      n9482PMOpeResN = T013V60_n9482PMOpeResN[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9482PMOpeResN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(58) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(58);
   }

   public void getKey13V1523( )
   {
      /* Using cursor T013V61 */
      pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9481PMOpeRes)});
      if ( (pr_default.getStatus(59) != 101) )
      {
         RcdFound1523 = (short)(1) ;
      }
      else
      {
         RcdFound1523 = (short)(0) ;
      }
      pr_default.close(59);
   }

   public void getByPrimaryKey13V1523( )
   {
      /* Using cursor T013V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9481PMOpeRes)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13V1523( 48) ;
         RcdFound1523 = (short)(1) ;
         initializeNonKey13V1523( ) ;
         A11457PMOpeTie = T013V3_A11457PMOpeTie[0] ;
         A9481PMOpeRes = T013V3_A9481PMOpeRes[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         Z9481PMOpeRes = A9481PMOpeRes ;
         sMode1523 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13V1523( ) ;
         Gx_mode = sMode1523 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1523 = (short)(0) ;
         initializeNonKey13V1523( ) ;
         sMode1523 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13V1523( ) ;
         Gx_mode = sMode1523 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13V1523( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13V1523( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T013V2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9481PMOpeRes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPrev1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11457PMOpeTie, T013V2_A11457PMOpeTie[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11457PMOpeTie, T013V2_A11457PMOpeTie[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmpreve:[seudo value changed for attri]"+"PMOpeTie");
               GXutil.writeLogRaw("Old: ",Z11457PMOpeTie);
               GXutil.writeLogRaw("Current: ",T013V2_A11457PMOpeTie[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPrev1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13V1523( )
   {
      beforeValidate13V1523( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1523( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13V1523( 0) ;
         checkOptimisticConcurrency13V1523( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13V1523( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13V1523( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013V62 */
                  pr_default.execute(60, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A11457PMOpeTie, A396EmprCod, Integer.valueOf(A9481PMOpeRes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev1");
                  if ( (pr_default.getStatus(60) == 1) )
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
            load13V1523( ) ;
         }
         endLevel13V1523( ) ;
      }
      closeExtendedTableCursors13V1523( ) ;
   }

   public void update13V1523( )
   {
      beforeValidate13V1523( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13V1523( ) ;
      }
      if ( ( nIsMod_1523 != 0 ) || ( nIsDirty_1523 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13V1523( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13V1523( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13V1523( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013V63 */
                     pr_default.execute(61, new Object[] {A11457PMOpeTie, A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9481PMOpeRes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev1");
                     if ( (pr_default.getStatus(61) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPrev1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13V1523( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13V1523( ) ;
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
            endLevel13V1523( ) ;
         }
      }
      closeExtendedTableCursors13V1523( ) ;
   }

   public void deferredUpdate13V1523( )
   {
   }

   public void delete13V1523( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13V1523( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13V1523( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13V1523( ) ;
         afterConfirm13V1523( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13V1523( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013V64 */
               pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9481PMOpeRes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev1");
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
      sMode1523 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13V1523( ) ;
      Gx_mode = sMode1523 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13V1523( )
   {
      standaloneModal13V1523( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013V65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Integer.valueOf(A9481PMOpeRes)});
         A9482PMOpeResN = T013V65_A9482PMOpeResN[0] ;
         n9482PMOpeResN = T013V65_n9482PMOpeResN[0] ;
         pr_default.close(63);
      }
   }

   public void endLevel13V1523( )
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

   public void scanStart13V1523( )
   {
      /* Scan By routine */
      /* Using cursor T013V66 */
      pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      RcdFound1523 = (short)(0) ;
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound1523 = (short)(1) ;
         A9481PMOpeRes = T013V66_A9481PMOpeRes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13V1523( )
   {
      /* Scan next routine */
      pr_default.readNext(64);
      RcdFound1523 = (short)(0) ;
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound1523 = (short)(1) ;
         A9481PMOpeRes = T013V66_A9481PMOpeRes[0] ;
      }
   }

   public void scanEnd13V1523( )
   {
      pr_default.close(64);
   }

   public void afterConfirm13V1523( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13V1523( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13V1523( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13V1523( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13V1523( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13V1523( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13V1523( )
   {
      edtPMOpeRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeRes_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtPMOpeResN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeResN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeResN_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtPMOpeTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeTie_Enabled), 5, 0), !bGXsfl_193_Refreshing);
   }

   public void send_integrity_lvl_hashes13V1523( )
   {
   }

   public void send_integrity_lvl_hashes13V1236( )
   {
   }

   public void subsflControlProps_1771532( )
   {
      edtPMMEquCod_Internalname = "PMMEQUCOD_"+sGXsfl_177_idx ;
      edtPMMEquDsc_Internalname = "PMMEQUDSC_"+sGXsfl_177_idx ;
      edtPMMSEqCod_Internalname = "PMMSEQCOD_"+sGXsfl_177_idx ;
      edtPMMSEqDsc_Internalname = "PMMSEQDSC_"+sGXsfl_177_idx ;
      edtPMMPieCod_Internalname = "PMMPIECOD_"+sGXsfl_177_idx ;
      edtPMMPieDsc_Internalname = "PMMPIEDSC_"+sGXsfl_177_idx ;
   }

   public void subsflControlProps_fel_1771532( )
   {
      edtPMMEquCod_Internalname = "PMMEQUCOD_"+sGXsfl_177_fel_idx ;
      edtPMMEquDsc_Internalname = "PMMEQUDSC_"+sGXsfl_177_fel_idx ;
      edtPMMSEqCod_Internalname = "PMMSEQCOD_"+sGXsfl_177_fel_idx ;
      edtPMMSEqDsc_Internalname = "PMMSEQDSC_"+sGXsfl_177_fel_idx ;
      edtPMMPieCod_Internalname = "PMMPIECOD_"+sGXsfl_177_fel_idx ;
      edtPMMPieDsc_Internalname = "PMMPIEDSC_"+sGXsfl_177_fel_idx ;
   }

   public void addRow13V1532( )
   {
      nGXsfl_177_idx = (int)(nGXsfl_177_idx+1) ;
      sGXsfl_177_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_177_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1771532( ) ;
      sendRow13V1532( ) ;
   }

   public void sendRow13V1532( )
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
         if ( ((int)((nGXsfl_177_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1532_" + sGXsfl_177_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_177_idx + "',177)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMEquCod_Internalname,GXutil.rtrim( A11450PMMEquCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,178);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMEquCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMMEquCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(177),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMEquDsc_Internalname,GXutil.rtrim( A12597PMMEquDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMEquDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPMMEquDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(177),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1532_" + sGXsfl_177_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_177_idx + "',177)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMSEqCod_Internalname,GXutil.rtrim( A11451PMMSEqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,180);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMSEqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMMSEqCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(177),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMSEqDsc_Internalname,GXutil.rtrim( A12598PMMSEqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMSEqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPMMSEqDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(177),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1532_" + sGXsfl_177_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_177_idx + "',177)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMPieCod_Internalname,GXutil.rtrim( A11452PMMPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMMPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(177),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_equiposRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMPieDsc_Internalname,GXutil.rtrim( A11453PMMPieDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMPieDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPMMPieDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(177),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_equiposRow);
      send_integrity_lvl_hashes13V1532( ) ;
      GXCCtl = "Z11450PMMEquCod_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11450PMMEquCod));
      GXCCtl = "Z11451PMMSEqCod_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11451PMMSEqCod));
      GXCCtl = "Z11452PMMPieCod_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11452PMMPieCod));
      GXCCtl = "nRcdDeleted_1532_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1532_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1532_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1532, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_177_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV16TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vPMCOD_" + sGXsfl_177_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMMEQUCOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMMEQUDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMMSEQCOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMMSEQDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMMPIECOD_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMMPIEDSC_"+sGXsfl_177_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_equiposContainer.AddRow(Gridlevel_equiposRow);
   }

   public void readRow13V1532( )
   {
      nGXsfl_177_idx = (int)(nGXsfl_177_idx+1) ;
      sGXsfl_177_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_177_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1771532( ) ;
      edtPMMEquCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMEQUCOD_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMMEquDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMEQUDSC_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMMSEqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMSEQCOD_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMMSEqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMSEQDSC_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMMPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMPIECOD_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMMPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMMPIEDSC_"+sGXsfl_177_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A11450PMMEquCod = httpContext.cgiGet( edtPMMEquCod_Internalname) ;
      A12597PMMEquDsc = httpContext.cgiGet( edtPMMEquDsc_Internalname) ;
      A11451PMMSEqCod = httpContext.cgiGet( edtPMMSEqCod_Internalname) ;
      A12598PMMSEqDsc = httpContext.cgiGet( edtPMMSEqDsc_Internalname) ;
      A11452PMMPieCod = httpContext.cgiGet( edtPMMPieCod_Internalname) ;
      A11453PMMPieDsc = httpContext.cgiGet( edtPMMPieDsc_Internalname) ;
      n11453PMMPieDsc = false ;
      GXCCtl = "Z11450PMMEquCod_" + sGXsfl_177_idx ;
      Z11450PMMEquCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11451PMMSEqCod_" + sGXsfl_177_idx ;
      Z11451PMMSEqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11452PMMPieCod_" + sGXsfl_177_idx ;
      Z11452PMMPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1532_" + sGXsfl_177_idx ;
      nRcdDeleted_1532 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1532_" + sGXsfl_177_idx ;
      nRcdExists_1532 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1532_" + sGXsfl_177_idx ;
      nIsMod_1532 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_2131237( )
   {
      edtPMRepCod_Internalname = "PMREPCOD_"+sGXsfl_213_idx ;
      edtPMRepNom_Internalname = "PMREPNOM_"+sGXsfl_213_idx ;
      edtPMRRCnt_Internalname = "PMRRCNT_"+sGXsfl_213_idx ;
   }

   public void subsflControlProps_fel_2131237( )
   {
      edtPMRepCod_Internalname = "PMREPCOD_"+sGXsfl_213_fel_idx ;
      edtPMRepNom_Internalname = "PMREPNOM_"+sGXsfl_213_fel_idx ;
      edtPMRRCnt_Internalname = "PMRRCNT_"+sGXsfl_213_fel_idx ;
   }

   public void addRow13V1237( )
   {
      nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
      sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2131237( ) ;
      sendRow13V1237( ) ;
   }

   public void sendRow13V1237( )
   {
      Gridlevel_repuestosRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_repuestos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_repuestos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_repuestos_Class, "") != 0 )
         {
            subGridlevel_repuestos_Linesclass = subGridlevel_repuestos_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_repuestos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_repuestos_Backstyle = (byte)(0) ;
         subGridlevel_repuestos_Backcolor = subGridlevel_repuestos_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_repuestos_Class, "") != 0 )
         {
            subGridlevel_repuestos_Linesclass = subGridlevel_repuestos_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_repuestos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_repuestos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_repuestos_Class, "") != 0 )
         {
            subGridlevel_repuestos_Linesclass = subGridlevel_repuestos_Class+"Odd" ;
         }
         subGridlevel_repuestos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_repuestos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_repuestos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_213_idx) % (2))) == 0 )
         {
            subGridlevel_repuestos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_repuestos_Class, "") != 0 )
            {
               subGridlevel_repuestos_Linesclass = subGridlevel_repuestos_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_repuestos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_repuestos_Class, "") != 0 )
            {
               subGridlevel_repuestos_Linesclass = subGridlevel_repuestos_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1237_" + sGXsfl_213_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_213_idx + "',213)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repuestosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMRepCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9489PMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9489PMRepCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMRepCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMRepCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtPMRepCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repuestosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMRepNom_Internalname,GXutil.rtrim( A9490PMRepNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMRepNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPMRepNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1237_" + sGXsfl_213_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 216,'',false,'" + sGXsfl_213_idx + "',213)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repuestosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMRRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9491PMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMRRCnt_Enabled!=0) ? localUtil.format( A9491PMRRCnt, "ZZZZZZZ9.999") : localUtil.format( A9491PMRRCnt, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,216);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMRRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMRRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_repuestosRow);
      send_integrity_lvl_hashes13V1237( ) ;
      GXCCtl = "Z9489PMRepCod_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9489PMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9491PMRRCnt_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9491PMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1237_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1237_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1237_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1237, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_213_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV16TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vPMCOD_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMREPCOD_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMREPCOD_"+sGXsfl_213_idx+"Horizontalalignment", GXutil.rtrim( edtPMRepCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "PMREPNOM_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMRRCNT_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_repuestosContainer.AddRow(Gridlevel_repuestosRow);
   }

   public void readRow13V1237( )
   {
      nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
      sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2131237( ) ;
      edtPMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMREPCOD_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMRepCod_Horizontalalignment = httpContext.cgiGet( "PMREPCOD_"+sGXsfl_213_idx+"Horizontalalignment") ;
      edtPMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMREPNOM_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMRRCNT_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "PMREPCOD_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMRepCod_Internalname ;
         wbErr = true ;
         A9489PMRepCod = 0 ;
      }
      else
      {
         A9489PMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9490PMRepNom = httpContext.cgiGet( edtPMRepNom_Internalname) ;
      n9490PMRepNom = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMRRCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMRRCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "PMRRCNT_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMRRCnt_Internalname ;
         wbErr = true ;
         A9491PMRRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9491PMRRCnt = localUtil.ctond( httpContext.cgiGet( edtPMRRCnt_Internalname)) ;
      }
      GXCCtl = "Z9489PMRepCod_" + sGXsfl_213_idx ;
      Z9489PMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9491PMRRCnt_" + sGXsfl_213_idx ;
      Z9491PMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1237_" + sGXsfl_213_idx ;
      nRcdDeleted_1237 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1237_" + sGXsfl_213_idx ;
      nRcdExists_1237 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1237_" + sGXsfl_213_idx ;
      nIsMod_1237 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_2061533( )
   {
      edtPMTCod_Internalname = "PMTCOD_"+sGXsfl_206_idx ;
      edtPMTDsc_Internalname = "PMTDSC_"+sGXsfl_206_idx ;
   }

   public void subsflControlProps_fel_2061533( )
   {
      edtPMTCod_Internalname = "PMTCOD_"+sGXsfl_206_fel_idx ;
      edtPMTDsc_Internalname = "PMTDSC_"+sGXsfl_206_fel_idx ;
   }

   public void addRow13V1533( )
   {
      nGXsfl_206_idx = (int)(nGXsfl_206_idx+1) ;
      sGXsfl_206_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_206_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2061533( ) ;
      sendRow13V1533( ) ;
   }

   public void sendRow13V1533( )
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
         if ( ((int)((nGXsfl_206_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1533_" + sGXsfl_206_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_206_idx + "',206)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tareasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMTCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9479PMTCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,207);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMTCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMTCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(206),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtPMTCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_tareasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMTDsc_Internalname,GXutil.rtrim( A9480PMTDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMTDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPMTDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(206),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_tareasRow);
      send_integrity_lvl_hashes13V1533( ) ;
      GXCCtl = "Z9479PMTCod_" + sGXsfl_206_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1533_" + sGXsfl_206_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1533_" + sGXsfl_206_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1533_" + sGXsfl_206_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_206_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_206_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV16TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_206_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vPMCOD_" + sGXsfl_206_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMTCOD_"+sGXsfl_206_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMTCOD_"+sGXsfl_206_idx+"Horizontalalignment", GXutil.rtrim( edtPMTCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "PMTDSC_"+sGXsfl_206_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_tareasContainer.AddRow(Gridlevel_tareasRow);
   }

   public void readRow13V1533( )
   {
      nGXsfl_206_idx = (int)(nGXsfl_206_idx+1) ;
      sGXsfl_206_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_206_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2061533( ) ;
      edtPMTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTCOD_"+sGXsfl_206_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMTCod_Horizontalalignment = httpContext.cgiGet( "PMTCOD_"+sGXsfl_206_idx+"Horizontalalignment") ;
      edtPMTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTDSC_"+sGXsfl_206_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "PMTCOD_" + sGXsfl_206_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
         wbErr = true ;
         A9479PMTCod = 0 ;
      }
      else
      {
         A9479PMTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9480PMTDsc = httpContext.cgiGet( edtPMTDsc_Internalname) ;
      n9480PMTDsc = false ;
      GXCCtl = "Z9479PMTCod_" + sGXsfl_206_idx ;
      Z9479PMTCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1533_" + sGXsfl_206_idx ;
      nRcdDeleted_1533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1533_" + sGXsfl_206_idx ;
      nRcdExists_1533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1533_" + sGXsfl_206_idx ;
      nIsMod_1533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1931523( )
   {
      edtPMOpeRes_Internalname = "PMOPERES_"+sGXsfl_193_idx ;
      edtPMOpeResN_Internalname = "PMOPERESN_"+sGXsfl_193_idx ;
      edtPMOpeTie_Internalname = "PMOPETIE_"+sGXsfl_193_idx ;
   }

   public void subsflControlProps_fel_1931523( )
   {
      edtPMOpeRes_Internalname = "PMOPERES_"+sGXsfl_193_fel_idx ;
      edtPMOpeResN_Internalname = "PMOPERESN_"+sGXsfl_193_fel_idx ;
      edtPMOpeTie_Internalname = "PMOPETIE_"+sGXsfl_193_fel_idx ;
   }

   public void addRow13V1523( )
   {
      nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1931523( ) ;
      sendRow13V1523( ) ;
   }

   public void sendRow13V1523( )
   {
      Gridlevel_responsablesRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_responsables_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_responsables_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_responsables_Class, "") != 0 )
         {
            subGridlevel_responsables_Linesclass = subGridlevel_responsables_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_responsables_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_responsables_Backstyle = (byte)(0) ;
         subGridlevel_responsables_Backcolor = subGridlevel_responsables_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_responsables_Class, "") != 0 )
         {
            subGridlevel_responsables_Linesclass = subGridlevel_responsables_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_responsables_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_responsables_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_responsables_Class, "") != 0 )
         {
            subGridlevel_responsables_Linesclass = subGridlevel_responsables_Class+"Odd" ;
         }
         subGridlevel_responsables_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_responsables_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_responsables_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_193_idx) % (2))) == 0 )
         {
            subGridlevel_responsables_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_responsables_Class, "") != 0 )
            {
               subGridlevel_responsables_Linesclass = subGridlevel_responsables_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_responsables_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_responsables_Class, "") != 0 )
            {
               subGridlevel_responsables_Linesclass = subGridlevel_responsables_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1523_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 194,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_responsablesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMOpeRes_Internalname,h9481PMOpeRes,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,194);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMOpeRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMOpeRes_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_responsablesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMOpeResN_Internalname,GXutil.rtrim( A9482PMOpeResN),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMOpeResN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPMOpeResN_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_responsablesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMOpeTie_Internalname,GXutil.ltrim( localUtil.ntoc( A11457PMOpeTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMOpeTie_Enabled!=0) ? localUtil.format( A11457PMOpeTie, "ZZ9.99") : localUtil.format( A11457PMOpeTie, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMOpeTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPMOpeTie_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_responsablesRow);
      send_integrity_lvl_hashes13V1523( ) ;
      GXCCtl = "GXHCPMOPERES_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9481PMOpeRes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9481PMOpeRes_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9481PMOpeRes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11457PMOpeTie_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11457PMOpeTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1523_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1523_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1523_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1523, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_193_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV16TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vPMCOD_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMOPERES_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMOPERESN_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeResN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMOPETIE_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_responsablesContainer.AddRow(Gridlevel_responsablesRow);
   }

   public void readRow13V1523( )
   {
      nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1931523( ) ;
      edtPMOpeRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMOPERES_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMOpeResN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMOPERESN_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMOpeTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMOPETIE_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9481PMOpeRes = httpContext.cgiGet( edtPMOpeRes_Internalname) ;
      A9482PMOpeResN = httpContext.cgiGet( edtPMOpeResN_Internalname) ;
      n9482PMOpeResN = false ;
      A11457PMOpeTie = localUtil.ctond( httpContext.cgiGet( edtPMOpeTie_Internalname)) ;
      GXCCtl = "GXHCPMOPERES_" + sGXsfl_193_idx ;
      A9481PMOpeRes = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9481PMOpeRes_" + sGXsfl_193_idx ;
      Z9481PMOpeRes = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11457PMOpeTie_" + sGXsfl_193_idx ;
      Z11457PMOpeTie = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1523_" + sGXsfl_193_idx ;
      nRcdDeleted_1523 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1523_" + sGXsfl_193_idx ;
      nRcdExists_1523 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1523_" + sGXsfl_193_idx ;
      nIsMod_1523 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPMRepNom_Enabled = edtPMRepNom_Enabled ;
      defedtPMRepCod_Enabled = edtPMRepCod_Enabled ;
      defedtPMTDsc_Enabled = edtPMTDsc_Enabled ;
      defedtPMTCod_Enabled = edtPMTCod_Enabled ;
      defedtPMOpeTie_Enabled = edtPMOpeTie_Enabled ;
      defedtPMOpeResN_Enabled = edtPMOpeResN_Enabled ;
      defedtPMOpeRes_Enabled = edtPMOpeRes_Enabled ;
      defedtPMMPieDsc_Enabled = edtPMMPieDsc_Enabled ;
      defedtPMMPieCod_Enabled = edtPMMPieCod_Enabled ;
      defedtPMMSEqDsc_Enabled = edtPMMSEqDsc_Enabled ;
      defedtPMMSEqCod_Enabled = edtPMMSEqCod_Enabled ;
      defedtPMMEquDsc_Enabled = edtPMMEquDsc_Enabled ;
      defedtPMMEquCod_Enabled = edtPMMEquCod_Enabled ;
   }

   public void confirmValues13V0( )
   {
      nGXsfl_177_idx = 0 ;
      sGXsfl_177_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_177_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1771532( ) ;
      while ( nGXsfl_177_idx < nRC_GXsfl_177 )
      {
         nGXsfl_177_idx = (int)(nGXsfl_177_idx+1) ;
         sGXsfl_177_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_177_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1771532( ) ;
         httpContext.changePostValue( "Z11450PMMEquCod_"+sGXsfl_177_idx, httpContext.cgiGet( "ZT_"+"Z11450PMMEquCod_"+sGXsfl_177_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11450PMMEquCod_"+sGXsfl_177_idx) ;
         httpContext.changePostValue( "Z11451PMMSEqCod_"+sGXsfl_177_idx, httpContext.cgiGet( "ZT_"+"Z11451PMMSEqCod_"+sGXsfl_177_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11451PMMSEqCod_"+sGXsfl_177_idx) ;
         httpContext.changePostValue( "Z11452PMMPieCod_"+sGXsfl_177_idx, httpContext.cgiGet( "ZT_"+"Z11452PMMPieCod_"+sGXsfl_177_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11452PMMPieCod_"+sGXsfl_177_idx) ;
      }
      nGXsfl_193_idx = 0 ;
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1931523( ) ;
      while ( nGXsfl_193_idx < nRC_GXsfl_193 )
      {
         nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
         sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1931523( ) ;
         httpContext.changePostValue( "Z9481PMOpeRes_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z9481PMOpeRes_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9481PMOpeRes_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z11457PMOpeTie_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z11457PMOpeTie_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11457PMOpeTie_"+sGXsfl_193_idx) ;
      }
      nGXsfl_206_idx = 0 ;
      sGXsfl_206_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_206_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2061533( ) ;
      while ( nGXsfl_206_idx < nRC_GXsfl_206 )
      {
         nGXsfl_206_idx = (int)(nGXsfl_206_idx+1) ;
         sGXsfl_206_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_206_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2061533( ) ;
         httpContext.changePostValue( "Z9479PMTCod_"+sGXsfl_206_idx, httpContext.cgiGet( "ZT_"+"Z9479PMTCod_"+sGXsfl_206_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9479PMTCod_"+sGXsfl_206_idx) ;
      }
      nGXsfl_213_idx = 0 ;
      sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2131237( ) ;
      while ( nGXsfl_213_idx < nRC_GXsfl_213 )
      {
         nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
         sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2131237( ) ;
         httpContext.changePostValue( "Z9489PMRepCod_"+sGXsfl_213_idx, httpContext.cgiGet( "ZT_"+"Z9489PMRepCod_"+sGXsfl_213_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9489PMRepCod_"+sGXsfl_213_idx) ;
         httpContext.changePostValue( "Z9491PMRRCnt_"+sGXsfl_213_idx, httpContext.cgiGet( "ZT_"+"Z9491PMRRCnt_"+sGXsfl_213_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9491PMRRCnt_"+sGXsfl_213_idx) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmpreve", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13PMCod,8,0))}, new String[] {"Gx_mode","EmprCod","PMCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMPreve");
      forbiddenHiddens.add("PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV35Pgmname, "")));
      forbiddenHiddens.add("PMUsuCre", GXutil.rtrim( localUtil.format( A9475PMUsuCre, "@!")));
      forbiddenHiddens.add("PMDiasPavi", localUtil.format( DecimalUtil.doubleToDec(A14275PMDiasPavi), "ZZZ9"));
      forbiddenHiddens.add("PMTieMto", localUtil.format( A14274PMTieMto, "ZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmpreve:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9429PMCod", GXutil.ltrim( localUtil.ntoc( Z9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9473PMDsc", GXutil.rtrim( Z9473PMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9474PMFchCre", localUtil.dtoc( Z9474PMFchCre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9475PMUsuCre", GXutil.rtrim( Z9475PMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9478PMEst", GXutil.rtrim( Z9478PMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9483PMTxt", Z9483PMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9484PMIni", localUtil.dtoc( Z9484PMIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9485PMFin", localUtil.dtoc( Z9485PMFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9486PMUlt", localUtil.dtoc( Z9486PMUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11454PMUso", GXutil.ltrim( localUtil.ntoc( Z11454PMUso, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9487PMDias", GXutil.ltrim( localUtil.ntoc( Z9487PMDias, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9488PMOrd", GXutil.ltrim( localUtil.ntoc( Z9488PMOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11455PMTie", GXutil.ltrim( localUtil.ntoc( Z11455PMTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11456PMPla", GXutil.rtrim( Z11456PMPla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13013PMUsoMts", GXutil.ltrim( localUtil.ntoc( Z13013PMUsoMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14275PMDiasPavi", GXutil.ltrim( localUtil.ntoc( Z14275PMDiasPavi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14274PMTieMto", GXutil.ltrim( localUtil.ntoc( Z14274PMTieMto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9476PMMaqCod", GXutil.rtrim( Z9476PMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14271PMTipoID", GXutil.ltrim( localUtil.ntoc( Z14271PMTipoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_177", GXutil.ltrim( localUtil.ntoc( nGXsfl_177_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_213", GXutil.ltrim( localUtil.ntoc( nGXsfl_213_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_206", GXutil.ltrim( localUtil.ntoc( nGXsfl_206_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_193", GXutil.ltrim( localUtil.ntoc( nGXsfl_193_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9476PMMaqCod", GXutil.rtrim( A9476PMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N14271PMTipoID", GXutil.ltrim( localUtil.ntoc( A14271PMTipoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPMTIPOID_DATA", AV32PMTipoID_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPMTIPOID_DATA", AV32PMTipoID_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPMMAQCOD_DATA", AV22PMMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPMMAQCOD_DATA", AV22PMMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPMMEQUCOD_DATA", AV29PMMEquCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPMMEQUCOD_DATA", AV29PMMEquCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPMMSEQCOD_DATA", AV30PMMSEqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPMMSEQCOD_DATA", AV30PMMSEqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPMMPIECOD_DATA", AV31PMMPieCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPMMPIECOD_DATA", AV31PMMPieCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPMTCOD_DATA", AV28PMTCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPMTCOD_DATA", AV28PMTCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPMREPCOD_DATA", AV27PMRepCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPMREPCOD_DATA", AV27PMRepCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV16TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV16TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMCOD", GXutil.ltrim( localUtil.ntoc( AV13PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13PMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PMMAQCOD", GXutil.rtrim( AV18Insert_PMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PMTIPOID", GXutil.ltrim( localUtil.ntoc( AV26Insert_PMTipoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDIASPAVI", GXutil.ltrim( localUtil.ntoc( A14275PMDiasPavi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMTIEMTO", GXutil.ltrim( localUtil.ntoc( A14274PMTieMto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMTIPODSC", GXutil.rtrim( A14272PMTipoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQEQUDSC", GXutil.rtrim( AV14MaqEquDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPMOPERES", GXutil.ltrim( localUtil.ntoc( A9481PMOpeRes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTIPOID_Objectcall", GXutil.rtrim( Combo_pmtipoid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTIPOID_Cls", GXutil.rtrim( Combo_pmtipoid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTIPOID_Selectedvalue_set", GXutil.rtrim( Combo_pmtipoid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTIPOID_Enabled", GXutil.booltostr( Combo_pmtipoid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTIPOID_Emptyitem", GXutil.booltostr( Combo_pmtipoid_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMAQCOD_Objectcall", GXutil.rtrim( Combo_pmmaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMAQCOD_Cls", GXutil.rtrim( Combo_pmmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_pmmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMAQCOD_Enabled", GXutil.booltostr( Combo_pmmaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMAQCOD_Emptyitemtext", GXutil.rtrim( Combo_pmmaqcod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Objectcall", GXutil.rtrim( Dvpanel_tablefrecuencia_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Enabled", GXutil.booltostr( Dvpanel_tablefrecuencia_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Width", GXutil.rtrim( Dvpanel_tablefrecuencia_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Autowidth", GXutil.booltostr( Dvpanel_tablefrecuencia_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Autoheight", GXutil.booltostr( Dvpanel_tablefrecuencia_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Cls", GXutil.rtrim( Dvpanel_tablefrecuencia_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Title", GXutil.rtrim( Dvpanel_tablefrecuencia_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Collapsible", GXutil.booltostr( Dvpanel_tablefrecuencia_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Collapsed", GXutil.booltostr( Dvpanel_tablefrecuencia_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Showcollapseicon", GXutil.booltostr( Dvpanel_tablefrecuencia_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Iconposition", GXutil.rtrim( Dvpanel_tablefrecuencia_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEFRECUENCIA_Autoscroll", GXutil.booltostr( Dvpanel_tablefrecuencia_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Objectcall", GXutil.rtrim( Dvpanel_tabletexto_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Enabled", GXutil.booltostr( Dvpanel_tabletexto_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Width", GXutil.rtrim( Dvpanel_tabletexto_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Autowidth", GXutil.booltostr( Dvpanel_tabletexto_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Autoheight", GXutil.booltostr( Dvpanel_tabletexto_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Cls", GXutil.rtrim( Dvpanel_tabletexto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Title", GXutil.rtrim( Dvpanel_tabletexto_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Collapsible", GXutil.booltostr( Dvpanel_tabletexto_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Collapsed", GXutil.booltostr( Dvpanel_tabletexto_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Showcollapseicon", GXutil.booltostr( Dvpanel_tabletexto_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Iconposition", GXutil.rtrim( Dvpanel_tabletexto_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLETEXTO_Autoscroll", GXutil.booltostr( Dvpanel_tabletexto_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMEQUCOD_Objectcall", GXutil.rtrim( Combo_pmmequcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMEQUCOD_Cls", GXutil.rtrim( Combo_pmmequcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMEQUCOD_Enabled", GXutil.booltostr( Combo_pmmequcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMEQUCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_pmmequcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMEQUCOD_Isgriditem", GXutil.booltostr( Combo_pmmequcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMEQUCOD_Emptyitem", GXutil.booltostr( Combo_pmmequcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMSEQCOD_Objectcall", GXutil.rtrim( Combo_pmmseqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMSEQCOD_Cls", GXutil.rtrim( Combo_pmmseqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMSEQCOD_Enabled", GXutil.booltostr( Combo_pmmseqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMSEQCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_pmmseqcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMSEQCOD_Isgriditem", GXutil.booltostr( Combo_pmmseqcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMSEQCOD_Emptyitem", GXutil.booltostr( Combo_pmmseqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMPIECOD_Objectcall", GXutil.rtrim( Combo_pmmpiecod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMPIECOD_Cls", GXutil.rtrim( Combo_pmmpiecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMPIECOD_Enabled", GXutil.booltostr( Combo_pmmpiecod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMPIECOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_pmmpiecod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMPIECOD_Isgriditem", GXutil.booltostr( Combo_pmmpiecod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMMPIECOD_Emptyitem", GXutil.booltostr( Combo_pmmpiecod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTCOD_Objectcall", GXutil.rtrim( Combo_pmtcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTCOD_Cls", GXutil.rtrim( Combo_pmtcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTCOD_Enabled", GXutil.booltostr( Combo_pmtcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_pmtcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTCOD_Isgriditem", GXutil.booltostr( Combo_pmtcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMTCOD_Emptyitem", GXutil.booltostr( Combo_pmtcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMREPCOD_Objectcall", GXutil.rtrim( Combo_pmrepcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMREPCOD_Cls", GXutil.rtrim( Combo_pmrepcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMREPCOD_Enabled", GXutil.booltostr( Combo_pmrepcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMREPCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_pmrepcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMREPCOD_Isgriditem", GXutil.booltostr( Combo_pmrepcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PMREPCOD_Emptyitem", GXutil.booltostr( Combo_pmrepcod_Emptyitem));
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
      return formatLink("app.mantenimientomaquina.tmpreve", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13PMCod,8,0))}, new String[] {"Gx_mode","EmprCod","PMCod"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMPreve" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Preventivo", "") ;
   }

   public void initializeNonKey13V1236( )
   {
      A9476PMMaqCod = "" ;
      n9476PMMaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9476PMMaqCod", A9476PMMaqCod);
      A14271PMTipoID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14271PMTipoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14271PMTipoID), 4, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9473PMDsc = "" ;
      n9473PMDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9473PMDsc", A9473PMDsc);
      A9477PMMaqDsc = "" ;
      n9477PMMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", A9477PMMaqDsc);
      A9483PMTxt = "" ;
      n9483PMTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9483PMTxt", A9483PMTxt);
      A9485PMFin = GXutil.nullDate() ;
      n9485PMFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9485PMFin", localUtil.format(A9485PMFin, "99/99/99"));
      A11454PMUso = DecimalUtil.ZERO ;
      n11454PMUso = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11454PMUso", GXutil.ltrimstr( A11454PMUso, 8, 2));
      A9487PMDias = (short)(0) ;
      n9487PMDias = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9487PMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9487PMDias), 3, 0));
      A9488PMOrd = 0 ;
      n9488PMOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9488PMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9488PMOrd), 8, 0));
      A11455PMTie = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11455PMTie", GXutil.ltrimstr( A11455PMTie, 6, 2));
      A11456PMPla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11456PMPla", A11456PMPla);
      A13013PMUsoMts = DecimalUtil.ZERO ;
      n13013PMUsoMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13013PMUsoMts", GXutil.ltrimstr( A13013PMUsoMts, 10, 2));
      A14275PMDiasPavi = (short)(0) ;
      n14275PMDiasPavi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14275PMDiasPavi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14275PMDiasPavi), 4, 0));
      A14272PMTipoDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14272PMTipoDsc", A14272PMTipoDsc);
      A14274PMTieMto = DecimalUtil.ZERO ;
      n14274PMTieMto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14274PMTieMto", GXutil.ltrimstr( A14274PMTieMto, 6, 2));
      A9474PMFchCre = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9474PMFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
      A9475PMUsuCre = AV8UsurCod ;
      n9475PMUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9475PMUsuCre", A9475PMUsuCre);
      A9478PMEst = httpContext.getMessage( "A", "") ;
      n9478PMEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
      A9484PMIni = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9484PMIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
      A9486PMUlt = GXutil.nullDate() ;
      n9486PMUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
      Z9473PMDsc = "" ;
      Z9474PMFchCre = GXutil.nullDate() ;
      Z9475PMUsuCre = "" ;
      Z9478PMEst = "" ;
      Z9483PMTxt = "" ;
      Z9484PMIni = GXutil.nullDate() ;
      Z9485PMFin = GXutil.nullDate() ;
      Z9486PMUlt = GXutil.nullDate() ;
      Z11454PMUso = DecimalUtil.ZERO ;
      Z9487PMDias = (short)(0) ;
      Z9488PMOrd = 0 ;
      Z11455PMTie = DecimalUtil.ZERO ;
      Z11456PMPla = "" ;
      Z13013PMUsoMts = DecimalUtil.ZERO ;
      Z14275PMDiasPavi = (short)(0) ;
      Z14274PMTieMto = DecimalUtil.ZERO ;
      Z9476PMMaqCod = "" ;
      Z14271PMTipoID = (short)(0) ;
   }

   public void initAll13V1236( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9429PMCod = 0 ;
      n9429PMCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      initializeNonKey13V1236( ) ;
   }

   public void standaloneModalInsert( )
   {
      A9474PMFchCre = i9474PMFchCre ;
      n9474PMFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
      A9475PMUsuCre = i9475PMUsuCre ;
      n9475PMUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9475PMUsuCre", A9475PMUsuCre);
      A9478PMEst = i9478PMEst ;
      n9478PMEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
      A9484PMIni = i9484PMIni ;
      n9484PMIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
   }

   public void initializeNonKey13V1532( )
   {
      AV14MaqEquDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqEquDsc", AV14MaqEquDsc);
      A12597PMMEquDsc = "" ;
      A12598PMMSEqDsc = "" ;
      A11453PMMPieDsc = "" ;
      n11453PMMPieDsc = false ;
   }

   public void initAll13V1532( )
   {
      A11450PMMEquCod = "" ;
      A11451PMMSEqCod = "" ;
      A11452PMMPieCod = "" ;
      initializeNonKey13V1532( ) ;
   }

   public void standaloneModalInsert13V1532( )
   {
   }

   public void initializeNonKey13V1237( )
   {
      A9490PMRepNom = "" ;
      n9490PMRepNom = false ;
      A9491PMRRCnt = DecimalUtil.ZERO ;
      Z9491PMRRCnt = DecimalUtil.ZERO ;
   }

   public void initAll13V1237( )
   {
      A9489PMRepCod = 0 ;
      initializeNonKey13V1237( ) ;
   }

   public void standaloneModalInsert13V1237( )
   {
   }

   public void initializeNonKey13V1533( )
   {
      A9480PMTDsc = "" ;
      n9480PMTDsc = false ;
   }

   public void initAll13V1533( )
   {
      A9479PMTCod = 0 ;
      initializeNonKey13V1533( ) ;
   }

   public void standaloneModalInsert13V1533( )
   {
   }

   public void initializeNonKey13V1523( )
   {
      A9482PMOpeResN = "" ;
      n9482PMOpeResN = false ;
      A11457PMOpeTie = DecimalUtil.ZERO ;
      Z11457PMOpeTie = DecimalUtil.ZERO ;
   }

   public void initAll13V1523( )
   {
      h9481PMOpeRes = "" ;
      initializeNonKey13V1523( ) ;
   }

   public void standaloneModalInsert13V1523( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662274", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmpreve.js", "?20268211662275", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1532( )
   {
      edtPMMPieDsc_Enabled = defedtPMMPieDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMPieCod_Enabled = defedtPMMPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMPieCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMSEqDsc_Enabled = defedtPMMSEqDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMSEqCod_Enabled = defedtPMMSEqCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMSEqCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMEquDsc_Enabled = defedtPMMEquDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMEquDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquDsc_Enabled), 5, 0), !bGXsfl_177_Refreshing);
      edtPMMEquCod_Enabled = defedtPMMEquCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMEquCod_Enabled), 5, 0), !bGXsfl_177_Refreshing);
   }

   public void init_level_properties1237( )
   {
      edtPMRepNom_Enabled = defedtPMRepNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepNom_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      edtPMRepCod_Enabled = defedtPMRepCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMRepCod_Enabled), 5, 0), !bGXsfl_213_Refreshing);
   }

   public void init_level_properties1533( )
   {
      edtPMTDsc_Enabled = defedtPMTDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTDsc_Enabled), 5, 0), !bGXsfl_206_Refreshing);
      edtPMTCod_Enabled = defedtPMTCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_206_Refreshing);
   }

   public void init_level_properties1523( )
   {
      edtPMOpeTie_Enabled = defedtPMOpeTie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeTie_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtPMOpeResN_Enabled = defedtPMOpeResN_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeResN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeResN_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtPMOpeRes_Enabled = defedtPMOpeRes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOpeRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOpeRes_Enabled), 5, 0), !bGXsfl_193_Refreshing);
   }

   public void startgridcontrol177( )
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
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11450PMMEquCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A12597PMMEquDsc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMEquDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11451PMMSEqCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A12598PMMSEqDsc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMSEqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11452PMMPieCod));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_equiposColumn.AddObjectProperty("Value", GXutil.rtrim( A11453PMMPieDsc));
      Gridlevel_equiposColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMMPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddColumnProperties(Gridlevel_equiposColumn);
      Gridlevel_equiposContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_equiposContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_equipos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol193( )
   {
      Gridlevel_responsablesContainer.AddObjectProperty("GridName", "Gridlevel_responsables");
      Gridlevel_responsablesContainer.AddObjectProperty("Header", subGridlevel_responsables_Header);
      Gridlevel_responsablesContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_responsablesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_responsablesContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_responsablesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_responsablesColumn.AddObjectProperty("Value", h9481PMOpeRes);
      Gridlevel_responsablesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddColumnProperties(Gridlevel_responsablesColumn);
      Gridlevel_responsablesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_responsablesColumn.AddObjectProperty("Value", GXutil.rtrim( A9482PMOpeResN));
      Gridlevel_responsablesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeResN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddColumnProperties(Gridlevel_responsablesColumn);
      Gridlevel_responsablesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_responsablesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11457PMOpeTie, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_responsablesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMOpeTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddColumnProperties(Gridlevel_responsablesColumn);
      Gridlevel_responsablesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_responsablesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_responsables_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol206( )
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
      Gridlevel_tareasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_tareasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tareasColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtPMTCod_Horizontalalignment));
      Gridlevel_tareasContainer.AddColumnProperties(Gridlevel_tareasColumn);
      Gridlevel_tareasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tareasColumn.AddObjectProperty("Value", GXutil.rtrim( A9480PMTDsc));
      Gridlevel_tareasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddColumnProperties(Gridlevel_tareasColumn);
      Gridlevel_tareasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tareasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_tareas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol213( )
   {
      Gridlevel_repuestosContainer.AddObjectProperty("GridName", "Gridlevel_repuestos");
      Gridlevel_repuestosContainer.AddObjectProperty("Header", subGridlevel_repuestos_Header);
      Gridlevel_repuestosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_repuestosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_repuestosContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_repuestosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9489PMRepCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_repuestosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestosColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtPMRepCod_Horizontalalignment));
      Gridlevel_repuestosContainer.AddColumnProperties(Gridlevel_repuestosColumn);
      Gridlevel_repuestosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestosColumn.AddObjectProperty("Value", GXutil.rtrim( A9490PMRepNom));
      Gridlevel_repuestosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddColumnProperties(Gridlevel_repuestosColumn);
      Gridlevel_repuestosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repuestosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9491PMRRCnt, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_repuestosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddColumnProperties(Gridlevel_repuestosColumn);
      Gridlevel_repuestosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repuestosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_repuestos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtPMCod_Internalname = "PMCOD" ;
      edtPMDsc_Internalname = "PMDSC" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      lblTextblockpmtipoid_Internalname = "TEXTBLOCKPMTIPOID" ;
      Combo_pmtipoid_Internalname = "COMBO_PMTIPOID" ;
      edtPMTipoID_Internalname = "PMTIPOID" ;
      divTablesplittedpmtipoid_Internalname = "TABLESPLITTEDPMTIPOID" ;
      lblTextblockpmmaqcod_Internalname = "TEXTBLOCKPMMAQCOD" ;
      Combo_pmmaqcod_Internalname = "COMBO_PMMAQCOD" ;
      edtPMMaqCod_Internalname = "PMMAQCOD" ;
      divTablesplittedpmmaqcod_Internalname = "TABLESPLITTEDPMMAQCOD" ;
      cmbPMEst.setInternalname( "PMEST" );
      edtPMFchCre_Internalname = "PMFCHCRE" ;
      edtPMUsuCre_Internalname = "PMUSUCRE" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      lblTextblockpmdias_Internalname = "TEXTBLOCKPMDIAS" ;
      edtPMDias_Internalname = "PMDIAS" ;
      divUnnamedtablepmdias_Internalname = "UNNAMEDTABLEPMDIAS" ;
      lblTextblockpmuso_Internalname = "TEXTBLOCKPMUSO" ;
      edtPMUso_Internalname = "PMUSO" ;
      divUnnamedtablepmuso_Internalname = "UNNAMEDTABLEPMUSO" ;
      lblTextblockpmusomts_Internalname = "TEXTBLOCKPMUSOMTS" ;
      edtPMUsoMts_Internalname = "PMUSOMTS" ;
      divUnnamedtablepmusomts_Internalname = "UNNAMEDTABLEPMUSOMTS" ;
      divFrecuencia_Internalname = "FRECUENCIA" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      lblTextblockpmtie_Internalname = "TEXTBLOCKPMTIE" ;
      edtPMTie_Internalname = "PMTIE" ;
      divUnnamedtablepmtie_Internalname = "UNNAMEDTABLEPMTIE" ;
      lblTextblockpmpla_Internalname = "TEXTBLOCKPMPLA" ;
      edtPMPla_Internalname = "PMPLA" ;
      divUnnamedtablepmpla_Internalname = "UNNAMEDTABLEPMPLA" ;
      divPlanificacion_Internalname = "PLANIFICACION" ;
      grpUnnamedgroup7_Internalname = "UNNAMEDGROUP7" ;
      lblTextblockpmini_Internalname = "TEXTBLOCKPMINI" ;
      edtPMIni_Internalname = "PMINI" ;
      divUnnamedtablepmini_Internalname = "UNNAMEDTABLEPMINI" ;
      lblTextblockpmfin_Internalname = "TEXTBLOCKPMFIN" ;
      edtPMFin_Internalname = "PMFIN" ;
      divUnnamedtablepmfin_Internalname = "UNNAMEDTABLEPMFIN" ;
      divValidez_Internalname = "VALIDEZ" ;
      grpUnnamedgroup8_Internalname = "UNNAMEDGROUP8" ;
      lblTextblockpmult_Internalname = "TEXTBLOCKPMULT" ;
      edtPMUlt_Internalname = "PMULT" ;
      divUnnamedtablepmult_Internalname = "UNNAMEDTABLEPMULT" ;
      lblTextblockpmord_Internalname = "TEXTBLOCKPMORD" ;
      edtPMOrd_Internalname = "PMORD" ;
      divUnnamedtablepmord_Internalname = "UNNAMEDTABLEPMORD" ;
      divUltimainstancia_Internalname = "ULTIMAINSTANCIA" ;
      grpUnnamedgroup9_Internalname = "UNNAMEDGROUP9" ;
      divTablefrecuencia_Internalname = "TABLEFRECUENCIA" ;
      Dvpanel_tablefrecuencia_Internalname = "DVPANEL_TABLEFRECUENCIA" ;
      edtPMTxt_Internalname = "PMTXT" ;
      divTabletexto_Internalname = "TABLETEXTO" ;
      Dvpanel_tabletexto_Internalname = "DVPANEL_TABLETEXTO" ;
      edtPMMEquCod_Internalname = "PMMEQUCOD" ;
      edtPMMEquDsc_Internalname = "PMMEQUDSC" ;
      edtPMMSEqCod_Internalname = "PMMSEQCOD" ;
      edtPMMSEqDsc_Internalname = "PMMSEQDSC" ;
      edtPMMPieCod_Internalname = "PMMPIECOD" ;
      edtPMMPieDsc_Internalname = "PMMPIEDSC" ;
      divTableleaflevel_equipos_Internalname = "TABLELEAFLEVEL_EQUIPOS" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divDvpanel_unnamedtable4_cell_Internalname = "DVPANEL_UNNAMEDTABLE4_CELL" ;
      edtPMOpeRes_Internalname = "PMOPERES" ;
      edtPMOpeResN_Internalname = "PMOPERESN" ;
      edtPMOpeTie_Internalname = "PMOPETIE" ;
      divTableleaflevel_responsables_Internalname = "TABLELEAFLEVEL_RESPONSABLES" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPMTCod_Internalname = "PMTCOD" ;
      edtPMTDsc_Internalname = "PMTDSC" ;
      divTableleaflevel_tareas_Internalname = "TABLELEAFLEVEL_TAREAS" ;
      edtPMRepCod_Internalname = "PMREPCOD" ;
      edtPMRepNom_Internalname = "PMREPNOM" ;
      edtPMRRCnt_Internalname = "PMRRCNT" ;
      divTableleaflevel_repuestos_Internalname = "TABLELEAFLEVEL_REPUESTOS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      grpUnnamedgroup2_Internalname = "UNNAMEDGROUP2" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombopmtipoid_Internalname = "vCOMBOPMTIPOID" ;
      divSectionattribute_pmtipoid_Internalname = "SECTIONATTRIBUTE_PMTIPOID" ;
      edtavCombopmmaqcod_Internalname = "vCOMBOPMMAQCOD" ;
      divSectionattribute_pmmaqcod_Internalname = "SECTIONATTRIBUTE_PMMAQCOD" ;
      Combo_pmmequcod_Internalname = "COMBO_PMMEQUCOD" ;
      Combo_pmmseqcod_Internalname = "COMBO_PMMSEQCOD" ;
      Combo_pmmpiecod_Internalname = "COMBO_PMMPIECOD" ;
      Combo_pmtcod_Internalname = "COMBO_PMTCOD" ;
      Combo_pmrepcod_Internalname = "COMBO_PMREPCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPMMaqDsc_Internalname = "PMMAQDSC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_equipos_Internalname = "GRIDLEVEL_EQUIPOS" ;
      subGridlevel_responsables_Internalname = "GRIDLEVEL_RESPONSABLES" ;
      subGridlevel_tareas_Internalname = "GRIDLEVEL_TAREAS" ;
      subGridlevel_repuestos_Internalname = "GRIDLEVEL_REPUESTOS" ;
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
      subGridlevel_repuestos_Allowcollapsing = (byte)(0) ;
      subGridlevel_repuestos_Allowselection = (byte)(0) ;
      subGridlevel_repuestos_Header = "" ;
      subGridlevel_tareas_Allowcollapsing = (byte)(0) ;
      subGridlevel_tareas_Allowselection = (byte)(0) ;
      subGridlevel_tareas_Header = "" ;
      subGridlevel_responsables_Allowcollapsing = (byte)(0) ;
      subGridlevel_responsables_Allowselection = (byte)(0) ;
      subGridlevel_responsables_Header = "" ;
      subGridlevel_equipos_Allowcollapsing = (byte)(0) ;
      subGridlevel_equipos_Allowselection = (byte)(0) ;
      subGridlevel_equipos_Header = "" ;
      Combo_pmrepcod_Enabled = GXutil.toBoolean( -1) ;
      Combo_pmtcod_Enabled = GXutil.toBoolean( -1) ;
      Combo_pmmpiecod_Enabled = GXutil.toBoolean( -1) ;
      Combo_pmmseqcod_Enabled = GXutil.toBoolean( -1) ;
      Combo_pmmequcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Preventivo", "") );
      edtPMOpeTie_Jsonclick = "" ;
      edtPMOpeResN_Jsonclick = "" ;
      edtPMOpeRes_Jsonclick = "" ;
      subGridlevel_responsables_Class = "GridNoBorder WorkWith" ;
      subGridlevel_responsables_Backcolorstyle = (byte)(0) ;
      edtPMTDsc_Jsonclick = "" ;
      edtPMTCod_Jsonclick = "" ;
      subGridlevel_tareas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_tareas_Backcolorstyle = (byte)(0) ;
      edtPMRRCnt_Jsonclick = "" ;
      edtPMRepNom_Jsonclick = "" ;
      edtPMRepCod_Jsonclick = "" ;
      subGridlevel_repuestos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_repuestos_Backcolorstyle = (byte)(0) ;
      edtPMMPieDsc_Jsonclick = "" ;
      edtPMMPieCod_Jsonclick = "" ;
      edtPMMSEqDsc_Jsonclick = "" ;
      edtPMMSEqCod_Jsonclick = "" ;
      edtPMMEquDsc_Jsonclick = "" ;
      edtPMMEquCod_Jsonclick = "" ;
      subGridlevel_equipos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_equipos_Backcolorstyle = (byte)(0) ;
      Combo_pmmequcod_Titlecontrolidtoreplace = "" ;
      Combo_pmmseqcod_Titlecontrolidtoreplace = "" ;
      Combo_pmmpiecod_Titlecontrolidtoreplace = "" ;
      Combo_pmtcod_Titlecontrolidtoreplace = "" ;
      Combo_pmrepcod_Titlecontrolidtoreplace = "" ;
      edtPMRRCnt_Enabled = 1 ;
      edtPMRepNom_Enabled = 0 ;
      edtPMRepCod_Enabled = 1 ;
      edtPMTDsc_Enabled = 0 ;
      edtPMTCod_Enabled = 1 ;
      edtPMOpeTie_Enabled = 0 ;
      edtPMOpeResN_Enabled = 0 ;
      edtPMOpeRes_Enabled = 1 ;
      edtPMMPieDsc_Enabled = 0 ;
      edtPMMPieCod_Enabled = 1 ;
      edtPMMSEqDsc_Enabled = 0 ;
      edtPMMSEqCod_Enabled = 1 ;
      edtPMMEquDsc_Enabled = 0 ;
      edtPMMEquCod_Enabled = 1 ;
      edtPMMaqDsc_Jsonclick = "" ;
      edtPMMaqDsc_Enabled = 0 ;
      edtPMMaqDsc_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      Combo_pmrepcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_pmrepcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_pmrepcod_Cls = "ExtendedCombo" ;
      Combo_pmrepcod_Caption = "" ;
      Combo_pmtcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_pmtcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_pmtcod_Cls = "ExtendedCombo" ;
      Combo_pmtcod_Caption = "" ;
      Combo_pmmpiecod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_pmmpiecod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_pmmpiecod_Cls = "ExtendedCombo" ;
      Combo_pmmpiecod_Caption = "" ;
      Combo_pmmseqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_pmmseqcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_pmmseqcod_Cls = "ExtendedCombo" ;
      Combo_pmmseqcod_Caption = "" ;
      Combo_pmmequcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_pmmequcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_pmmequcod_Cls = "ExtendedCombo" ;
      Combo_pmmequcod_Caption = "" ;
      edtavCombopmmaqcod_Jsonclick = "" ;
      edtavCombopmmaqcod_Enabled = 0 ;
      edtavCombopmmaqcod_Visible = 1 ;
      edtavCombopmtipoid_Jsonclick = "" ;
      edtavCombopmtipoid_Enabled = 0 ;
      edtavCombopmtipoid_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Responsables", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      divTableleaflevel_equipos_Visible = 1 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Equipos", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      divDvpanel_unnamedtable4_cell_Class = "col-xs-12 col-sm-6" ;
      edtPMTxt_Enabled = 1 ;
      Dvpanel_tabletexto_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tabletexto_Iconposition = "Right" ;
      Dvpanel_tabletexto_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tabletexto_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tabletexto_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tabletexto_Title = httpContext.getMessage( "Texto", "") ;
      Dvpanel_tabletexto_Cls = "CellMarginTop" ;
      Dvpanel_tabletexto_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tabletexto_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tabletexto_Width = "100%" ;
      edtPMOrd_Jsonclick = "" ;
      edtPMOrd_Enabled = 1 ;
      edtPMUlt_Jsonclick = "" ;
      edtPMUlt_Enabled = 1 ;
      edtPMFin_Jsonclick = "" ;
      edtPMFin_Enabled = 1 ;
      edtPMIni_Jsonclick = "" ;
      edtPMIni_Enabled = 1 ;
      edtPMPla_Jsonclick = "" ;
      edtPMPla_Enabled = 1 ;
      edtPMTie_Jsonclick = "" ;
      edtPMTie_Enabled = 1 ;
      edtPMUsoMts_Jsonclick = "" ;
      edtPMUsoMts_Enabled = 1 ;
      edtPMUso_Jsonclick = "" ;
      edtPMUso_Enabled = 1 ;
      edtPMDias_Jsonclick = "" ;
      edtPMDias_Enabled = 1 ;
      Dvpanel_tablefrecuencia_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablefrecuencia_Iconposition = "Right" ;
      Dvpanel_tablefrecuencia_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablefrecuencia_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablefrecuencia_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablefrecuencia_Title = httpContext.getMessage( "Freccuencia", "") ;
      Dvpanel_tablefrecuencia_Cls = "CellMarginTop" ;
      Dvpanel_tablefrecuencia_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablefrecuencia_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablefrecuencia_Width = "100%" ;
      edtPMUsuCre_Jsonclick = "" ;
      edtPMUsuCre_Enabled = 0 ;
      edtPMFchCre_Jsonclick = "" ;
      edtPMFchCre_Enabled = 0 ;
      cmbPMEst.setJsonclick( "" );
      cmbPMEst.setEnabled( 1 );
      edtPMMaqCod_Jsonclick = "" ;
      edtPMMaqCod_Enabled = 1 ;
      edtPMMaqCod_Visible = 1 ;
      Combo_pmmaqcod_Emptyitemtext = "Ninguna" ;
      Combo_pmmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_pmmaqcod_Caption = "" ;
      Combo_pmmaqcod_Enabled = GXutil.toBoolean( -1) ;
      edtPMTipoID_Jsonclick = "" ;
      edtPMTipoID_Enabled = 1 ;
      edtPMTipoID_Visible = 1 ;
      Combo_pmtipoid_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_pmtipoid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_pmtipoid_Caption = "" ;
      Combo_pmtipoid_Enabled = GXutil.toBoolean( -1) ;
      edtPMDsc_Jsonclick = "" ;
      edtPMDsc_Enabled = 1 ;
      edtPMCod_Jsonclick = "" ;
      edtPMCod_Enabled = 0 ;
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
      edtPMRepCod_Horizontalalignment = "right" ;
      edtPMTCod_Horizontalalignment = "right" ;
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

   public void gxsgapmoperes13V0( String A396EmprCod ,
                                  String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgapmoperes_data13V0( A396EmprCod, A13748OpeCNom) ;
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

   protected void gxsgapmoperes_data13V0( String A396EmprCod ,
                                          String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor T013V67 */
      pr_default.execute(65, new Object[] {A396EmprCod, l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(65) != 101) )
      {
         gxdynajaxctrlcodr.add(T013V67_A13748OpeCNom[0]);
         gxdynajaxctrldescr.add(T013V67_A13748OpeCNom[0]);
         pr_default.readNext(65);
      }
      pr_default.close(65);
   }

   public void gxhcapmoperes13V1523( String A396EmprCod ,
                                     String A13748OpeCNom )
   {
      /* Using cursor T013V68 */
      pr_default.execute(66, new Object[] {A13748OpeCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(66) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13748OpeCNom = T013V68_A13748OpeCNom[0] ;
         A396EmprCod = T013V68_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = T013V68_A652OpeCod[0] ;
         pr_default.readNext(66);
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
      pr_default.close(66);
   }

   public void gx6asapmcod13V1236( int AV13PMCod )
   {
      if ( ! (0==AV13PMCod) )
      {
         A9429PMCod = AV13PMCod ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9429PMCod = AV13PMCod ;
            n9429PMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asapmcod13V1236( String Gx_mode ,
                                   String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int10 = A9429PMCod ;
         GXv_int12[0] = GXt_int10 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTPRE", ""), ""), GXv_int12) ;
         tmpreve_impl.this.GXt_int10 = GXv_int12[0] ;
         A9429PMCod = GXt_int10 ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx28asamaqequdsc13V1532( String A396EmprCod ,
                                        String A9476PMMaqCod ,
                                        String A11450PMMEquCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXt_char1 = AV14MaqEquDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pmaqequdsc(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A11450PMMEquCod, GXv_char4) ;
         tmpreve_impl.this.GXt_char1 = GXv_char4[0] ;
         AV14MaqEquDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqEquDsc", AV14MaqEquDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV14MaqEquDsc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_34_13V1533( String Gx_mode ,
                              String A396EmprCod ,
                              int A9429PMCod ,
                              int A9479PMTCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A9429PMCod ;
         GXv_int11[0] = A9479PMTCod ;
         new app.mantenimientomaquina.pmprerep(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int11) ;
         A396EmprCod = GXv_char4[0] ;
         A9429PMCod = GXv_int12[0] ;
         A9479PMTCod = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_1771532( ) ;
      while ( nGXsfl_177_idx <= nRC_GXsfl_177 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13V1532( ) ;
         standaloneModal13V1532( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13V1532( ) ;
         nGXsfl_177_idx = (int)(nGXsfl_177_idx+1) ;
         sGXsfl_177_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_177_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1771532( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_equiposContainer)) ;
      /* End function gxnrGridlevel_equipos_newrow */
   }

   public void gxnrgridlevel_repuestos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_2131237( ) ;
      while ( nGXsfl_213_idx <= nRC_GXsfl_213 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13V1237( ) ;
         standaloneModal13V1237( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13V1237( ) ;
         nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
         sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2131237( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_repuestosContainer)) ;
      /* End function gxnrGridlevel_repuestos_newrow */
   }

   public void gxnrgridlevel_tareas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_2061533( ) ;
      while ( nGXsfl_206_idx <= nRC_GXsfl_206 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13V1533( ) ;
         standaloneModal13V1533( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13V1533( ) ;
         nGXsfl_206_idx = (int)(nGXsfl_206_idx+1) ;
         sGXsfl_206_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_206_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2061533( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_tareasContainer)) ;
      /* End function gxnrGridlevel_tareas_newrow */
   }

   public void gxnrgridlevel_responsables_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1931523( ) ;
      while ( nGXsfl_193_idx <= nRC_GXsfl_193 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13V1523( ) ;
         standaloneModal13V1523( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13V1523( ) ;
         nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
         sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1931523( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_responsablesContainer)) ;
      /* End function gxnrGridlevel_responsables_newrow */
   }

   public void init_web_controls( )
   {
      cmbPMEst.setName( "PMEST" );
      cmbPMEst.setWebtags( "" );
      cmbPMEst.addItem("A", httpContext.getMessage( "Activa", ""), (short)(0));
      cmbPMEst.addItem("I", httpContext.getMessage( "Inactiva", ""), (short)(0));
      if ( cmbPMEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9478PMEst)==0) )
         {
            A9478PMEst = httpContext.getMessage( "A", "") ;
            n9478PMEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9478PMEst", A9478PMEst);
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
      /* Using cursor T013V29 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013V29_A407EmprNom[0] ;
      n407EmprNom = T013V29_n407EmprNom[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Pmtipoid( )
   {
      /* Using cursor T013V31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A14271PMTipoID)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPOS DE PREVENTIVO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMTIPOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A14272PMTipoDsc = T013V31_A14272PMTipoDsc[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14272PMTipoDsc", GXutil.rtrim( A14272PMTipoDsc));
   }

   public void valid_Pmmaqcod( )
   {
      n9476PMMaqCod = false ;
      n9477PMMaqDsc = false ;
      /* Using cursor T013V30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9477PMMaqDsc = T013V30_A9477PMMaqDsc[0] ;
      n9477PMMaqDsc = T013V30_n9477PMMaqDsc[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9477PMMaqDsc", GXutil.rtrim( A9477PMMaqDsc));
   }

   public void valid_Pmini( )
   {
      n9484PMIni = false ;
      n9486PMUlt = false ;
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9486PMUlt)) && ( Gx_BScreen == 0 ) )
      {
         A9486PMUlt = A9484PMIni ;
         n9486PMUlt = false ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
   }

   public void valid_Pmmequcod( )
   {
      n9476PMMaqCod = false ;
      if ( true /* Level */ && true /* After */ )
      {
         GXt_char1 = AV14MaqEquDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pmaqequdsc(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A11450PMMEquCod, GXv_char4) ;
         tmpreve_impl.this.GXt_char1 = GXv_char4[0] ;
         AV14MaqEquDsc = GXt_char1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqEquDsc", GXutil.rtrim( AV14MaqEquDsc));
   }

   public void valid_Pmmpiecod( )
   {
      n9476PMMaqCod = false ;
      n11453PMMPieDsc = false ;
      /* Using cursor T013V40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n9476PMMaqCod), A9476PMMaqCod, A11450PMMEquCod, A11451PMMSEqCod, A11452PMMPieCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMMPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMMEquCod_Internalname ;
      }
      A12597PMMEquDsc = T013V40_A12597PMMEquDsc[0] ;
      A12598PMMSEqDsc = T013V40_A12598PMMSEqDsc[0] ;
      A11453PMMPieDsc = T013V40_A11453PMMPieDsc[0] ;
      n11453PMMPieDsc = T013V40_n11453PMMPieDsc[0] ;
      pr_default.close(38);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12597PMMEquDsc", GXutil.rtrim( A12597PMMEquDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12598PMMSEqDsc", GXutil.rtrim( A12598PMMSEqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11453PMMPieDsc", GXutil.rtrim( A11453PMMPieDsc));
   }

   public void valid_Pmrepcod( )
   {
      n9490PMRepNom = false ;
      /* Using cursor T013V48 */
      pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A9489PMRepCod)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMREPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMRepCod_Internalname ;
      }
      A9490PMRepNom = T013V48_A9490PMRepNom[0] ;
      n9490PMRepNom = T013V48_n9490PMRepNom[0] ;
      pr_default.close(46);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9490PMRepNom", GXutil.rtrim( A9490PMRepNom));
   }

   public void valid_Pmtcod( )
   {
      n9480PMTDsc = false ;
      /* Using cursor T013V55 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPTar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
      }
      A9480PMTDsc = T013V55_A9480PMTDsc[0] ;
      n9480PMTDsc = T013V55_n9480PMTDsc[0] ;
      pr_default.close(53);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9480PMTDsc", GXutil.rtrim( A9480PMTDsc));
   }

   public void valid_Pmoperes( )
   {
      n9482PMOpeResN = false ;
      if ( (GXutil.strcmp("", h9481PMOpeRes)==0) )
      {
         A9481PMOpeRes = 0 ;
      }
      else
      {
         A13748OpeCNom = h9481PMOpeRes ;
         /* Using cursor T013V69 */
         pr_default.execute(67, new Object[] {A13748OpeCNom, A396EmprCod});
         A9481PMOpeRes = T013V69_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(67) == 101) ) )
         {
            pr_default.readNext(67);
            if ( ! ( (pr_default.getStatus(67) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "PMOPERES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMOpeRes_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(67);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9481PMOpeRes", h9481PMOpeRes);
      /* Using cursor T013V70 */
      pr_default.execute(68, new Object[] {A396EmprCod, Integer.valueOf(A9481PMOpeRes)});
      if ( (pr_default.getStatus(68) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPOpeRes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMOPERES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMOpeRes_Internalname ;
      }
      A9482PMOpeResN = T013V70_A9482PMOpeResN[0] ;
      n9482PMOpeResN = T013V70_n9482PMOpeResN[0] ;
      pr_default.close(68);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9481PMOpeRes", GXutil.ltrim( localUtil.ntoc( A9481PMOpeRes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9482PMOpeResN", GXutil.rtrim( A9482PMOpeResN));
      httpContext.ajax_rsp_assign_attri("", false, "h9481PMOpeRes", h9481PMOpeRes);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13PMCod',fld:'vPMCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV16TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13PMCod',fld:'vPMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A9474PMFchCre',fld:'PMFCHCRE',pic:''},{av:'AV35Pgmname',fld:'vPGMNAME',pic:''},{av:'A9475PMUsuCre',fld:'PMUSUCRE',pic:'@!'},{av:'A14275PMDiasPavi',fld:'PMDIASPAVI',pic:'ZZZ9'},{av:'A14274PMTieMto',fld:'PMTIEMTO',pic:'ZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213V2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV16TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[]");
      setEventMetadata("VALID_PMCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDSC","{handler:'valid_Pmdsc',iparms:[]");
      setEventMetadata("VALID_PMDSC",",oparms:[]}");
      setEventMetadata("VALID_PMTIPOID","{handler:'valid_Pmtipoid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14271PMTipoID',fld:'PMTIPOID',pic:'ZZZ9'},{av:'A14272PMTipoDsc',fld:'PMTIPODSC',pic:''}]");
      setEventMetadata("VALID_PMTIPOID",",oparms:[{av:'A14272PMTipoDsc',fld:'PMTIPODSC',pic:''}]}");
      setEventMetadata("VALID_PMMAQCOD","{handler:'valid_Pmmaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9476PMMaqCod',fld:'PMMAQCOD',pic:''},{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''}]");
      setEventMetadata("VALID_PMMAQCOD",",oparms:[{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''}]}");
      setEventMetadata("VALID_PMEST","{handler:'valid_Pmest',iparms:[]");
      setEventMetadata("VALID_PMEST",",oparms:[]}");
      setEventMetadata("VALID_PMDIAS","{handler:'valid_Pmdias',iparms:[]");
      setEventMetadata("VALID_PMDIAS",",oparms:[]}");
      setEventMetadata("VALID_PMINI","{handler:'valid_Pmini',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A9484PMIni',fld:'PMINI',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9486PMUlt',fld:'PMULT',pic:''}]");
      setEventMetadata("VALID_PMINI",",oparms:[{av:'A9486PMUlt',fld:'PMULT',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPMTIPOID","{handler:'validv_Combopmtipoid',iparms:[]");
      setEventMetadata("VALIDV_COMBOPMTIPOID",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPMMAQCOD","{handler:'validv_Combopmmaqcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOPMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_PMMEQUCOD","{handler:'valid_Pmmequcod',iparms:[{av:'A9476PMMaqCod',fld:'PMMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11450PMMEquCod',fld:'PMMEQUCOD',pic:''},{av:'AV14MaqEquDsc',fld:'vMAQEQUDSC',pic:''}]");
      setEventMetadata("VALID_PMMEQUCOD",",oparms:[{av:'AV14MaqEquDsc',fld:'vMAQEQUDSC',pic:''}]}");
      setEventMetadata("VALID_PMMSEQCOD","{handler:'valid_Pmmseqcod',iparms:[]");
      setEventMetadata("VALID_PMMSEQCOD",",oparms:[]}");
      setEventMetadata("VALID_PMMPIECOD","{handler:'valid_Pmmpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9476PMMaqCod',fld:'PMMAQCOD',pic:''},{av:'A11450PMMEquCod',fld:'PMMEQUCOD',pic:''},{av:'A11451PMMSEqCod',fld:'PMMSEQCOD',pic:''},{av:'A11452PMMPieCod',fld:'PMMPIECOD',pic:''},{av:'A12597PMMEquDsc',fld:'PMMEQUDSC',pic:''},{av:'A12598PMMSEqDsc',fld:'PMMSEQDSC',pic:''},{av:'A11453PMMPieDsc',fld:'PMMPIEDSC',pic:''}]");
      setEventMetadata("VALID_PMMPIECOD",",oparms:[{av:'A12597PMMEquDsc',fld:'PMMEQUDSC',pic:''},{av:'A12598PMMSEqDsc',fld:'PMMSEQDSC',pic:''},{av:'A11453PMMPieDsc',fld:'PMMPIEDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pmmpiedsc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_PMOPERES","{handler:'valid_Pmoperes',iparms:[{av:'h9481PMOpeRes'},{av:'A9481PMOpeRes',fld:'PMOPERES',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9482PMOpeResN',fld:'PMOPERESN',pic:''}]");
      setEventMetadata("VALID_PMOPERES",",oparms:[{av:'A9481PMOpeRes',fld:'PMOPERES',pic:'ZZZZZ9'},{av:'A9482PMOpeResN',fld:'PMOPERESN',pic:''},{av:'h9481PMOpeRes'}]}");
      setEventMetadata("NULL","{handler:'valid_Pmopetie',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_PMTCOD","{handler:'valid_Pmtcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9479PMTCod',fld:'PMTCOD',pic:'ZZZZZZZ9'},{av:'A9480PMTDsc',fld:'PMTDSC',pic:''}]");
      setEventMetadata("VALID_PMTCOD",",oparms:[{av:'A9480PMTDsc',fld:'PMTDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pmtdsc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_PMREPCOD","{handler:'valid_Pmrepcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9489PMRepCod',fld:'PMREPCOD',pic:'ZZZZZZZ9'},{av:'A9490PMRepNom',fld:'PMREPNOM',pic:''}]");
      setEventMetadata("VALID_PMREPCOD",",oparms:[{av:'A9490PMRepNom',fld:'PMREPNOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pmrrcnt',iparms:[]");
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
      pr_default.close(68);
      pr_default.close(63);
      pr_default.close(53);
      pr_default.close(46);
      pr_default.close(38);
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV20EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9473PMDsc = "" ;
      Z9474PMFchCre = GXutil.nullDate() ;
      Z9475PMUsuCre = "" ;
      Z9478PMEst = "" ;
      Z9483PMTxt = "" ;
      Z9484PMIni = GXutil.nullDate() ;
      Z9485PMFin = GXutil.nullDate() ;
      Z9486PMUlt = GXutil.nullDate() ;
      Z11454PMUso = DecimalUtil.ZERO ;
      Z11455PMTie = DecimalUtil.ZERO ;
      Z11456PMPla = "" ;
      Z13013PMUsoMts = DecimalUtil.ZERO ;
      Z14274PMTieMto = DecimalUtil.ZERO ;
      Z9476PMMaqCod = "" ;
      N9476PMMaqCod = "" ;
      Combo_pmmaqcod_Selectedvalue_get = "" ;
      Combo_pmtipoid_Selectedvalue_get = "" ;
      Z11450PMMEquCod = "" ;
      Z11451PMMSEqCod = "" ;
      Z11452PMMPieCod = "" ;
      Z9491PMRRCnt = DecimalUtil.ZERO ;
      Z11457PMOpeTie = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A13748OpeCNom = "" ;
      h9481PMOpeRes = "" ;
      A9476PMMaqCod = "" ;
      A11450PMMEquCod = "" ;
      A11451PMMSEqCod = "" ;
      A11452PMMPieCod = "" ;
      AV20EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A9478PMEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A9473PMDsc = "" ;
      lblTextblockpmtipoid_Jsonclick = "" ;
      ucCombo_pmtipoid = new com.genexus.webpanels.GXUserControl();
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV32PMTipoID_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockpmmaqcod_Jsonclick = "" ;
      ucCombo_pmmaqcod = new com.genexus.webpanels.GXUserControl();
      AV22PMMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A9474PMFchCre = GXutil.nullDate() ;
      A9475PMUsuCre = "" ;
      ucDvpanel_tablefrecuencia = new com.genexus.webpanels.GXUserControl();
      lblTextblockpmdias_Jsonclick = "" ;
      lblTextblockpmuso_Jsonclick = "" ;
      A11454PMUso = DecimalUtil.ZERO ;
      lblTextblockpmusomts_Jsonclick = "" ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      lblTextblockpmtie_Jsonclick = "" ;
      A11455PMTie = DecimalUtil.ZERO ;
      lblTextblockpmpla_Jsonclick = "" ;
      A11456PMPla = "" ;
      lblTextblockpmini_Jsonclick = "" ;
      A9484PMIni = GXutil.nullDate() ;
      lblTextblockpmfin_Jsonclick = "" ;
      A9485PMFin = GXutil.nullDate() ;
      lblTextblockpmult_Jsonclick = "" ;
      A9486PMUlt = GXutil.nullDate() ;
      lblTextblockpmord_Jsonclick = "" ;
      ucDvpanel_tabletexto = new com.genexus.webpanels.GXUserControl();
      A9483PMTxt = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV35Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV25ComboPMMaqCod = "" ;
      ucCombo_pmmequcod = new com.genexus.webpanels.GXUserControl();
      AV29PMMEquCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_pmmseqcod = new com.genexus.webpanels.GXUserControl();
      AV30PMMSEqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_pmmpiecod = new com.genexus.webpanels.GXUserControl();
      AV31PMMPieCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_pmtcod = new com.genexus.webpanels.GXUserControl();
      AV28PMTCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_pmrepcod = new com.genexus.webpanels.GXUserControl();
      AV27PMRepCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      A9477PMMaqDsc = "" ;
      Gridlevel_equiposContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1532 = "" ;
      sStyleString = "" ;
      Gridlevel_responsablesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1523 = "" ;
      Gridlevel_tareasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1533 = "" ;
      Gridlevel_repuestosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1237 = "" ;
      A14274PMTieMto = DecimalUtil.ZERO ;
      AV18Insert_PMMaqCod = "" ;
      AV8UsurCod = "" ;
      A14272PMTipoDsc = "" ;
      AV14MaqEquDsc = "" ;
      Combo_pmtipoid_Objectcall = "" ;
      Combo_pmtipoid_Class = "" ;
      Combo_pmtipoid_Icontype = "" ;
      Combo_pmtipoid_Icon = "" ;
      Combo_pmtipoid_Tooltip = "" ;
      Combo_pmtipoid_Selectedvalue_set = "" ;
      Combo_pmtipoid_Selectedtext_set = "" ;
      Combo_pmtipoid_Selectedtext_get = "" ;
      Combo_pmtipoid_Gamoauthtoken = "" ;
      Combo_pmtipoid_Ddointernalname = "" ;
      Combo_pmtipoid_Titlecontrolalign = "" ;
      Combo_pmtipoid_Dropdownoptionstype = "" ;
      Combo_pmtipoid_Titlecontrolidtoreplace = "" ;
      Combo_pmtipoid_Datalisttype = "" ;
      Combo_pmtipoid_Datalistfixedvalues = "" ;
      Combo_pmtipoid_Datalistproc = "" ;
      Combo_pmtipoid_Datalistprocparametersprefix = "" ;
      Combo_pmtipoid_Remoteservicesparameters = "" ;
      Combo_pmtipoid_Htmltemplate = "" ;
      Combo_pmtipoid_Multiplevaluestype = "" ;
      Combo_pmtipoid_Loadingdata = "" ;
      Combo_pmtipoid_Noresultsfound = "" ;
      Combo_pmtipoid_Emptyitemtext = "" ;
      Combo_pmtipoid_Onlyselectedvalues = "" ;
      Combo_pmtipoid_Selectalltext = "" ;
      Combo_pmtipoid_Multiplevaluesseparator = "" ;
      Combo_pmtipoid_Addnewoptiontext = "" ;
      Combo_pmmaqcod_Objectcall = "" ;
      Combo_pmmaqcod_Class = "" ;
      Combo_pmmaqcod_Icontype = "" ;
      Combo_pmmaqcod_Icon = "" ;
      Combo_pmmaqcod_Tooltip = "" ;
      Combo_pmmaqcod_Selectedvalue_set = "" ;
      Combo_pmmaqcod_Selectedtext_set = "" ;
      Combo_pmmaqcod_Selectedtext_get = "" ;
      Combo_pmmaqcod_Gamoauthtoken = "" ;
      Combo_pmmaqcod_Ddointernalname = "" ;
      Combo_pmmaqcod_Titlecontrolalign = "" ;
      Combo_pmmaqcod_Dropdownoptionstype = "" ;
      Combo_pmmaqcod_Titlecontrolidtoreplace = "" ;
      Combo_pmmaqcod_Datalisttype = "" ;
      Combo_pmmaqcod_Datalistfixedvalues = "" ;
      Combo_pmmaqcod_Datalistproc = "" ;
      Combo_pmmaqcod_Datalistprocparametersprefix = "" ;
      Combo_pmmaqcod_Remoteservicesparameters = "" ;
      Combo_pmmaqcod_Htmltemplate = "" ;
      Combo_pmmaqcod_Multiplevaluestype = "" ;
      Combo_pmmaqcod_Loadingdata = "" ;
      Combo_pmmaqcod_Noresultsfound = "" ;
      Combo_pmmaqcod_Onlyselectedvalues = "" ;
      Combo_pmmaqcod_Selectalltext = "" ;
      Combo_pmmaqcod_Multiplevaluesseparator = "" ;
      Combo_pmmaqcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_tablefrecuencia_Objectcall = "" ;
      Dvpanel_tablefrecuencia_Class = "" ;
      Dvpanel_tablefrecuencia_Height = "" ;
      Dvpanel_tabletexto_Objectcall = "" ;
      Dvpanel_tabletexto_Class = "" ;
      Dvpanel_tabletexto_Height = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_unnamedtable5_Objectcall = "" ;
      Dvpanel_unnamedtable5_Class = "" ;
      Dvpanel_unnamedtable5_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_pmmequcod_Objectcall = "" ;
      Combo_pmmequcod_Class = "" ;
      Combo_pmmequcod_Icontype = "" ;
      Combo_pmmequcod_Icon = "" ;
      Combo_pmmequcod_Tooltip = "" ;
      Combo_pmmequcod_Selectedvalue_set = "" ;
      Combo_pmmequcod_Selectedvalue_get = "" ;
      Combo_pmmequcod_Selectedtext_set = "" ;
      Combo_pmmequcod_Selectedtext_get = "" ;
      Combo_pmmequcod_Gamoauthtoken = "" ;
      Combo_pmmequcod_Ddointernalname = "" ;
      Combo_pmmequcod_Titlecontrolalign = "" ;
      Combo_pmmequcod_Dropdownoptionstype = "" ;
      Combo_pmmequcod_Datalisttype = "" ;
      Combo_pmmequcod_Datalistfixedvalues = "" ;
      Combo_pmmequcod_Datalistproc = "" ;
      Combo_pmmequcod_Datalistprocparametersprefix = "" ;
      Combo_pmmequcod_Remoteservicesparameters = "" ;
      Combo_pmmequcod_Htmltemplate = "" ;
      Combo_pmmequcod_Multiplevaluestype = "" ;
      Combo_pmmequcod_Loadingdata = "" ;
      Combo_pmmequcod_Noresultsfound = "" ;
      Combo_pmmequcod_Emptyitemtext = "" ;
      Combo_pmmequcod_Onlyselectedvalues = "" ;
      Combo_pmmequcod_Selectalltext = "" ;
      Combo_pmmequcod_Multiplevaluesseparator = "" ;
      Combo_pmmequcod_Addnewoptiontext = "" ;
      Combo_pmmseqcod_Objectcall = "" ;
      Combo_pmmseqcod_Class = "" ;
      Combo_pmmseqcod_Icontype = "" ;
      Combo_pmmseqcod_Icon = "" ;
      Combo_pmmseqcod_Tooltip = "" ;
      Combo_pmmseqcod_Selectedvalue_set = "" ;
      Combo_pmmseqcod_Selectedvalue_get = "" ;
      Combo_pmmseqcod_Selectedtext_set = "" ;
      Combo_pmmseqcod_Selectedtext_get = "" ;
      Combo_pmmseqcod_Gamoauthtoken = "" ;
      Combo_pmmseqcod_Ddointernalname = "" ;
      Combo_pmmseqcod_Titlecontrolalign = "" ;
      Combo_pmmseqcod_Dropdownoptionstype = "" ;
      Combo_pmmseqcod_Datalisttype = "" ;
      Combo_pmmseqcod_Datalistfixedvalues = "" ;
      Combo_pmmseqcod_Datalistproc = "" ;
      Combo_pmmseqcod_Datalistprocparametersprefix = "" ;
      Combo_pmmseqcod_Remoteservicesparameters = "" ;
      Combo_pmmseqcod_Htmltemplate = "" ;
      Combo_pmmseqcod_Multiplevaluestype = "" ;
      Combo_pmmseqcod_Loadingdata = "" ;
      Combo_pmmseqcod_Noresultsfound = "" ;
      Combo_pmmseqcod_Emptyitemtext = "" ;
      Combo_pmmseqcod_Onlyselectedvalues = "" ;
      Combo_pmmseqcod_Selectalltext = "" ;
      Combo_pmmseqcod_Multiplevaluesseparator = "" ;
      Combo_pmmseqcod_Addnewoptiontext = "" ;
      Combo_pmmpiecod_Objectcall = "" ;
      Combo_pmmpiecod_Class = "" ;
      Combo_pmmpiecod_Icontype = "" ;
      Combo_pmmpiecod_Icon = "" ;
      Combo_pmmpiecod_Tooltip = "" ;
      Combo_pmmpiecod_Selectedvalue_set = "" ;
      Combo_pmmpiecod_Selectedvalue_get = "" ;
      Combo_pmmpiecod_Selectedtext_set = "" ;
      Combo_pmmpiecod_Selectedtext_get = "" ;
      Combo_pmmpiecod_Gamoauthtoken = "" ;
      Combo_pmmpiecod_Ddointernalname = "" ;
      Combo_pmmpiecod_Titlecontrolalign = "" ;
      Combo_pmmpiecod_Dropdownoptionstype = "" ;
      Combo_pmmpiecod_Datalisttype = "" ;
      Combo_pmmpiecod_Datalistfixedvalues = "" ;
      Combo_pmmpiecod_Datalistproc = "" ;
      Combo_pmmpiecod_Datalistprocparametersprefix = "" ;
      Combo_pmmpiecod_Remoteservicesparameters = "" ;
      Combo_pmmpiecod_Htmltemplate = "" ;
      Combo_pmmpiecod_Multiplevaluestype = "" ;
      Combo_pmmpiecod_Loadingdata = "" ;
      Combo_pmmpiecod_Noresultsfound = "" ;
      Combo_pmmpiecod_Emptyitemtext = "" ;
      Combo_pmmpiecod_Onlyselectedvalues = "" ;
      Combo_pmmpiecod_Selectalltext = "" ;
      Combo_pmmpiecod_Multiplevaluesseparator = "" ;
      Combo_pmmpiecod_Addnewoptiontext = "" ;
      Combo_pmtcod_Objectcall = "" ;
      Combo_pmtcod_Class = "" ;
      Combo_pmtcod_Icontype = "" ;
      Combo_pmtcod_Icon = "" ;
      Combo_pmtcod_Tooltip = "" ;
      Combo_pmtcod_Selectedvalue_set = "" ;
      Combo_pmtcod_Selectedvalue_get = "" ;
      Combo_pmtcod_Selectedtext_set = "" ;
      Combo_pmtcod_Selectedtext_get = "" ;
      Combo_pmtcod_Gamoauthtoken = "" ;
      Combo_pmtcod_Ddointernalname = "" ;
      Combo_pmtcod_Titlecontrolalign = "" ;
      Combo_pmtcod_Dropdownoptionstype = "" ;
      Combo_pmtcod_Datalisttype = "" ;
      Combo_pmtcod_Datalistfixedvalues = "" ;
      Combo_pmtcod_Datalistproc = "" ;
      Combo_pmtcod_Datalistprocparametersprefix = "" ;
      Combo_pmtcod_Remoteservicesparameters = "" ;
      Combo_pmtcod_Htmltemplate = "" ;
      Combo_pmtcod_Multiplevaluestype = "" ;
      Combo_pmtcod_Loadingdata = "" ;
      Combo_pmtcod_Noresultsfound = "" ;
      Combo_pmtcod_Emptyitemtext = "" ;
      Combo_pmtcod_Onlyselectedvalues = "" ;
      Combo_pmtcod_Selectalltext = "" ;
      Combo_pmtcod_Multiplevaluesseparator = "" ;
      Combo_pmtcod_Addnewoptiontext = "" ;
      Combo_pmrepcod_Objectcall = "" ;
      Combo_pmrepcod_Class = "" ;
      Combo_pmrepcod_Icontype = "" ;
      Combo_pmrepcod_Icon = "" ;
      Combo_pmrepcod_Tooltip = "" ;
      Combo_pmrepcod_Selectedvalue_set = "" ;
      Combo_pmrepcod_Selectedvalue_get = "" ;
      Combo_pmrepcod_Selectedtext_set = "" ;
      Combo_pmrepcod_Selectedtext_get = "" ;
      Combo_pmrepcod_Gamoauthtoken = "" ;
      Combo_pmrepcod_Ddointernalname = "" ;
      Combo_pmrepcod_Titlecontrolalign = "" ;
      Combo_pmrepcod_Dropdownoptionstype = "" ;
      Combo_pmrepcod_Datalisttype = "" ;
      Combo_pmrepcod_Datalistfixedvalues = "" ;
      Combo_pmrepcod_Datalistproc = "" ;
      Combo_pmrepcod_Datalistprocparametersprefix = "" ;
      Combo_pmrepcod_Remoteservicesparameters = "" ;
      Combo_pmrepcod_Htmltemplate = "" ;
      Combo_pmrepcod_Multiplevaluestype = "" ;
      Combo_pmrepcod_Loadingdata = "" ;
      Combo_pmrepcod_Noresultsfound = "" ;
      Combo_pmrepcod_Emptyitemtext = "" ;
      Combo_pmrepcod_Onlyselectedvalues = "" ;
      Combo_pmrepcod_Selectalltext = "" ;
      Combo_pmrepcod_Multiplevaluesseparator = "" ;
      Combo_pmrepcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1236 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A9482PMOpeResN = "" ;
      A11457PMOpeTie = DecimalUtil.ZERO ;
      A9480PMTDsc = "" ;
      A9490PMRepNom = "" ;
      A9491PMRRCnt = DecimalUtil.ZERO ;
      A12597PMMEquDsc = "" ;
      A12598PMMSEqDsc = "" ;
      A11453PMMPieDsc = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV15WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV16TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV17WebSession = httpContext.getWebSession();
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV24ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z9477PMMaqDsc = "" ;
      Z14272PMTipoDsc = "" ;
      T013V16_A407EmprNom = new String[] {""} ;
      T013V16_n407EmprNom = new boolean[] {false} ;
      T013V18_A14272PMTipoDsc = new String[] {""} ;
      T013V17_A9477PMMaqDsc = new String[] {""} ;
      T013V17_n9477PMMaqDsc = new boolean[] {false} ;
      T013V19_A9429PMCod = new int[1] ;
      T013V19_n9429PMCod = new boolean[] {false} ;
      T013V19_A407EmprNom = new String[] {""} ;
      T013V19_n407EmprNom = new boolean[] {false} ;
      T013V19_A9473PMDsc = new String[] {""} ;
      T013V19_n9473PMDsc = new boolean[] {false} ;
      T013V19_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013V19_n9474PMFchCre = new boolean[] {false} ;
      T013V19_A9475PMUsuCre = new String[] {""} ;
      T013V19_n9475PMUsuCre = new boolean[] {false} ;
      T013V19_A9477PMMaqDsc = new String[] {""} ;
      T013V19_n9477PMMaqDsc = new boolean[] {false} ;
      T013V19_A9478PMEst = new String[] {""} ;
      T013V19_n9478PMEst = new boolean[] {false} ;
      T013V19_A9483PMTxt = new String[] {""} ;
      T013V19_n9483PMTxt = new boolean[] {false} ;
      T013V19_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      T013V19_n9484PMIni = new boolean[] {false} ;
      T013V19_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      T013V19_n9485PMFin = new boolean[] {false} ;
      T013V19_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T013V19_n9486PMUlt = new boolean[] {false} ;
      T013V19_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V19_n11454PMUso = new boolean[] {false} ;
      T013V19_A9487PMDias = new short[1] ;
      T013V19_n9487PMDias = new boolean[] {false} ;
      T013V19_A9488PMOrd = new int[1] ;
      T013V19_n9488PMOrd = new boolean[] {false} ;
      T013V19_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V19_A11456PMPla = new String[] {""} ;
      T013V19_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V19_n13013PMUsoMts = new boolean[] {false} ;
      T013V19_A14275PMDiasPavi = new short[1] ;
      T013V19_n14275PMDiasPavi = new boolean[] {false} ;
      T013V19_A14272PMTipoDsc = new String[] {""} ;
      T013V19_A14274PMTieMto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V19_n14274PMTieMto = new boolean[] {false} ;
      T013V19_A396EmprCod = new String[] {""} ;
      T013V19_A9476PMMaqCod = new String[] {""} ;
      T013V19_n9476PMMaqCod = new boolean[] {false} ;
      T013V19_A14271PMTipoID = new short[1] ;
      T013V20_A407EmprNom = new String[] {""} ;
      T013V20_n407EmprNom = new boolean[] {false} ;
      T013V21_A9477PMMaqDsc = new String[] {""} ;
      T013V21_n9477PMMaqDsc = new boolean[] {false} ;
      T013V22_A14272PMTipoDsc = new String[] {""} ;
      T013V23_A396EmprCod = new String[] {""} ;
      T013V23_A9429PMCod = new int[1] ;
      T013V23_n9429PMCod = new boolean[] {false} ;
      T013V15_A9429PMCod = new int[1] ;
      T013V15_n9429PMCod = new boolean[] {false} ;
      T013V15_A9473PMDsc = new String[] {""} ;
      T013V15_n9473PMDsc = new boolean[] {false} ;
      T013V15_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013V15_n9474PMFchCre = new boolean[] {false} ;
      T013V15_A9475PMUsuCre = new String[] {""} ;
      T013V15_n9475PMUsuCre = new boolean[] {false} ;
      T013V15_A9478PMEst = new String[] {""} ;
      T013V15_n9478PMEst = new boolean[] {false} ;
      T013V15_A9483PMTxt = new String[] {""} ;
      T013V15_n9483PMTxt = new boolean[] {false} ;
      T013V15_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      T013V15_n9484PMIni = new boolean[] {false} ;
      T013V15_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      T013V15_n9485PMFin = new boolean[] {false} ;
      T013V15_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T013V15_n9486PMUlt = new boolean[] {false} ;
      T013V15_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V15_n11454PMUso = new boolean[] {false} ;
      T013V15_A9487PMDias = new short[1] ;
      T013V15_n9487PMDias = new boolean[] {false} ;
      T013V15_A9488PMOrd = new int[1] ;
      T013V15_n9488PMOrd = new boolean[] {false} ;
      T013V15_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V15_A11456PMPla = new String[] {""} ;
      T013V15_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V15_n13013PMUsoMts = new boolean[] {false} ;
      T013V15_A14275PMDiasPavi = new short[1] ;
      T013V15_n14275PMDiasPavi = new boolean[] {false} ;
      T013V15_A14274PMTieMto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V15_n14274PMTieMto = new boolean[] {false} ;
      T013V15_A396EmprCod = new String[] {""} ;
      T013V15_A9476PMMaqCod = new String[] {""} ;
      T013V15_n9476PMMaqCod = new boolean[] {false} ;
      T013V15_A14271PMTipoID = new short[1] ;
      T013V24_A396EmprCod = new String[] {""} ;
      T013V24_A9429PMCod = new int[1] ;
      T013V24_n9429PMCod = new boolean[] {false} ;
      T013V25_A396EmprCod = new String[] {""} ;
      T013V25_A9429PMCod = new int[1] ;
      T013V25_n9429PMCod = new boolean[] {false} ;
      T013V14_A9429PMCod = new int[1] ;
      T013V14_n9429PMCod = new boolean[] {false} ;
      T013V14_A9473PMDsc = new String[] {""} ;
      T013V14_n9473PMDsc = new boolean[] {false} ;
      T013V14_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013V14_n9474PMFchCre = new boolean[] {false} ;
      T013V14_A9475PMUsuCre = new String[] {""} ;
      T013V14_n9475PMUsuCre = new boolean[] {false} ;
      T013V14_A9478PMEst = new String[] {""} ;
      T013V14_n9478PMEst = new boolean[] {false} ;
      T013V14_A9483PMTxt = new String[] {""} ;
      T013V14_n9483PMTxt = new boolean[] {false} ;
      T013V14_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      T013V14_n9484PMIni = new boolean[] {false} ;
      T013V14_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      T013V14_n9485PMFin = new boolean[] {false} ;
      T013V14_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T013V14_n9486PMUlt = new boolean[] {false} ;
      T013V14_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V14_n11454PMUso = new boolean[] {false} ;
      T013V14_A9487PMDias = new short[1] ;
      T013V14_n9487PMDias = new boolean[] {false} ;
      T013V14_A9488PMOrd = new int[1] ;
      T013V14_n9488PMOrd = new boolean[] {false} ;
      T013V14_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V14_A11456PMPla = new String[] {""} ;
      T013V14_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V14_n13013PMUsoMts = new boolean[] {false} ;
      T013V14_A14275PMDiasPavi = new short[1] ;
      T013V14_n14275PMDiasPavi = new boolean[] {false} ;
      T013V14_A14274PMTieMto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V14_n14274PMTieMto = new boolean[] {false} ;
      T013V14_A396EmprCod = new String[] {""} ;
      T013V14_A9476PMMaqCod = new String[] {""} ;
      T013V14_n9476PMMaqCod = new boolean[] {false} ;
      T013V14_A14271PMTipoID = new short[1] ;
      T013V29_A407EmprNom = new String[] {""} ;
      T013V29_n407EmprNom = new boolean[] {false} ;
      T013V30_A9477PMMaqDsc = new String[] {""} ;
      T013V30_n9477PMMaqDsc = new boolean[] {false} ;
      T013V31_A14272PMTipoDsc = new String[] {""} ;
      T013V32_A396EmprCod = new String[] {""} ;
      T013V32_A9429PMCod = new int[1] ;
      T013V32_n9429PMCod = new boolean[] {false} ;
      T013V32_A9479PMTCod = new int[1] ;
      T013V32_A12644TMPMMEquCo = new String[] {""} ;
      T013V32_A12645TMPMMSEqCo = new String[] {""} ;
      T013V32_A12646TMPMMPieCo = new String[] {""} ;
      T013V33_A396EmprCod = new String[] {""} ;
      T013V33_A9425OMCod = new int[1] ;
      T013V34_A396EmprCod = new String[] {""} ;
      T013V34_A9429PMCod = new int[1] ;
      T013V34_n9429PMCod = new boolean[] {false} ;
      Z12597PMMEquDsc = "" ;
      Z12598PMMSEqDsc = "" ;
      Z11453PMMPieDsc = "" ;
      T013V35_A9476PMMaqCod = new String[] {""} ;
      T013V35_n9476PMMaqCod = new boolean[] {false} ;
      T013V35_A9429PMCod = new int[1] ;
      T013V35_n9429PMCod = new boolean[] {false} ;
      T013V35_A12597PMMEquDsc = new String[] {""} ;
      T013V35_A12598PMMSEqDsc = new String[] {""} ;
      T013V35_A11453PMMPieDsc = new String[] {""} ;
      T013V35_n11453PMMPieDsc = new boolean[] {false} ;
      T013V35_A396EmprCod = new String[] {""} ;
      T013V35_A11450PMMEquCod = new String[] {""} ;
      T013V35_A11451PMMSEqCod = new String[] {""} ;
      T013V35_A11452PMMPieCod = new String[] {""} ;
      T013V13_A12597PMMEquDsc = new String[] {""} ;
      T013V13_A12598PMMSEqDsc = new String[] {""} ;
      T013V13_A11453PMMPieDsc = new String[] {""} ;
      T013V13_n11453PMMPieDsc = new boolean[] {false} ;
      T013V36_A12597PMMEquDsc = new String[] {""} ;
      T013V36_A12598PMMSEqDsc = new String[] {""} ;
      T013V36_A11453PMMPieDsc = new String[] {""} ;
      T013V36_n11453PMMPieDsc = new boolean[] {false} ;
      T013V37_A396EmprCod = new String[] {""} ;
      T013V37_A9429PMCod = new int[1] ;
      T013V37_n9429PMCod = new boolean[] {false} ;
      T013V37_A11450PMMEquCod = new String[] {""} ;
      T013V37_A11451PMMSEqCod = new String[] {""} ;
      T013V37_A11452PMMPieCod = new String[] {""} ;
      T013V12_A9429PMCod = new int[1] ;
      T013V12_n9429PMCod = new boolean[] {false} ;
      T013V12_A396EmprCod = new String[] {""} ;
      T013V12_A11450PMMEquCod = new String[] {""} ;
      T013V12_A11451PMMSEqCod = new String[] {""} ;
      T013V12_A11452PMMPieCod = new String[] {""} ;
      T013V11_A9429PMCod = new int[1] ;
      T013V11_n9429PMCod = new boolean[] {false} ;
      T013V11_A396EmprCod = new String[] {""} ;
      T013V11_A11450PMMEquCod = new String[] {""} ;
      T013V11_A11451PMMSEqCod = new String[] {""} ;
      T013V11_A11452PMMPieCod = new String[] {""} ;
      T013V40_A12597PMMEquDsc = new String[] {""} ;
      T013V40_A12598PMMSEqDsc = new String[] {""} ;
      T013V40_A11453PMMPieDsc = new String[] {""} ;
      T013V40_n11453PMMPieDsc = new boolean[] {false} ;
      T013V41_A396EmprCod = new String[] {""} ;
      T013V41_A9429PMCod = new int[1] ;
      T013V41_n9429PMCod = new boolean[] {false} ;
      T013V41_A11450PMMEquCod = new String[] {""} ;
      T013V41_A11451PMMSEqCod = new String[] {""} ;
      T013V41_A11452PMMPieCod = new String[] {""} ;
      Z9490PMRepNom = "" ;
      T013V42_A9429PMCod = new int[1] ;
      T013V42_n9429PMCod = new boolean[] {false} ;
      T013V42_A9490PMRepNom = new String[] {""} ;
      T013V42_n9490PMRepNom = new boolean[] {false} ;
      T013V42_A9491PMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V42_A396EmprCod = new String[] {""} ;
      T013V42_A9489PMRepCod = new int[1] ;
      T013V10_A9490PMRepNom = new String[] {""} ;
      T013V10_n9490PMRepNom = new boolean[] {false} ;
      T013V43_A9490PMRepNom = new String[] {""} ;
      T013V43_n9490PMRepNom = new boolean[] {false} ;
      T013V44_A396EmprCod = new String[] {""} ;
      T013V44_A9429PMCod = new int[1] ;
      T013V44_n9429PMCod = new boolean[] {false} ;
      T013V44_A9489PMRepCod = new int[1] ;
      T013V9_A9429PMCod = new int[1] ;
      T013V9_n9429PMCod = new boolean[] {false} ;
      T013V9_A9491PMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V9_A396EmprCod = new String[] {""} ;
      T013V9_A9489PMRepCod = new int[1] ;
      T013V8_A9429PMCod = new int[1] ;
      T013V8_n9429PMCod = new boolean[] {false} ;
      T013V8_A9491PMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V8_A396EmprCod = new String[] {""} ;
      T013V8_A9489PMRepCod = new int[1] ;
      T013V48_A9490PMRepNom = new String[] {""} ;
      T013V48_n9490PMRepNom = new boolean[] {false} ;
      T013V49_A396EmprCod = new String[] {""} ;
      T013V49_A9429PMCod = new int[1] ;
      T013V49_n9429PMCod = new boolean[] {false} ;
      T013V49_A9489PMRepCod = new int[1] ;
      Z9480PMTDsc = "" ;
      T013V50_A9429PMCod = new int[1] ;
      T013V50_n9429PMCod = new boolean[] {false} ;
      T013V50_A9480PMTDsc = new String[] {""} ;
      T013V50_n9480PMTDsc = new boolean[] {false} ;
      T013V50_A396EmprCod = new String[] {""} ;
      T013V50_A9479PMTCod = new int[1] ;
      T013V7_A9480PMTDsc = new String[] {""} ;
      T013V7_n9480PMTDsc = new boolean[] {false} ;
      T013V51_A9480PMTDsc = new String[] {""} ;
      T013V51_n9480PMTDsc = new boolean[] {false} ;
      T013V52_A396EmprCod = new String[] {""} ;
      T013V52_A9429PMCod = new int[1] ;
      T013V52_n9429PMCod = new boolean[] {false} ;
      T013V52_A9479PMTCod = new int[1] ;
      T013V6_A9429PMCod = new int[1] ;
      T013V6_n9429PMCod = new boolean[] {false} ;
      T013V6_A396EmprCod = new String[] {""} ;
      T013V6_A9479PMTCod = new int[1] ;
      T013V5_A9429PMCod = new int[1] ;
      T013V5_n9429PMCod = new boolean[] {false} ;
      T013V5_A396EmprCod = new String[] {""} ;
      T013V5_A9479PMTCod = new int[1] ;
      T013V55_A9480PMTDsc = new String[] {""} ;
      T013V55_n9480PMTDsc = new boolean[] {false} ;
      T013V56_A396EmprCod = new String[] {""} ;
      T013V56_A9429PMCod = new int[1] ;
      T013V56_n9429PMCod = new boolean[] {false} ;
      T013V56_A9479PMTCod = new int[1] ;
      T013V56_A12644TMPMMEquCo = new String[] {""} ;
      T013V56_A12645TMPMMSEqCo = new String[] {""} ;
      T013V56_A12646TMPMMPieCo = new String[] {""} ;
      T013V57_A396EmprCod = new String[] {""} ;
      T013V57_A9429PMCod = new int[1] ;
      T013V57_n9429PMCod = new boolean[] {false} ;
      T013V57_A9479PMTCod = new int[1] ;
      Z9482PMOpeResN = "" ;
      T013V58_A9429PMCod = new int[1] ;
      T013V58_n9429PMCod = new boolean[] {false} ;
      T013V58_A9482PMOpeResN = new String[] {""} ;
      T013V58_n9482PMOpeResN = new boolean[] {false} ;
      T013V58_A11457PMOpeTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V58_A396EmprCod = new String[] {""} ;
      T013V58_A9481PMOpeRes = new int[1] ;
      T013V59_A13748OpeCNom = new String[] {""} ;
      T013V59_A396EmprCod = new String[] {""} ;
      T013V59_A652OpeCod = new int[1] ;
      T013V4_A9482PMOpeResN = new String[] {""} ;
      T013V4_n9482PMOpeResN = new boolean[] {false} ;
      T013V60_A9482PMOpeResN = new String[] {""} ;
      T013V60_n9482PMOpeResN = new boolean[] {false} ;
      T013V61_A396EmprCod = new String[] {""} ;
      T013V61_A9429PMCod = new int[1] ;
      T013V61_n9429PMCod = new boolean[] {false} ;
      T013V61_A9481PMOpeRes = new int[1] ;
      T013V3_A9429PMCod = new int[1] ;
      T013V3_n9429PMCod = new boolean[] {false} ;
      T013V3_A11457PMOpeTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V3_A396EmprCod = new String[] {""} ;
      T013V3_A9481PMOpeRes = new int[1] ;
      T013V2_A9429PMCod = new int[1] ;
      T013V2_n9429PMCod = new boolean[] {false} ;
      T013V2_A11457PMOpeTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013V2_A396EmprCod = new String[] {""} ;
      T013V2_A9481PMOpeRes = new int[1] ;
      T013V65_A9482PMOpeResN = new String[] {""} ;
      T013V65_n9482PMOpeResN = new boolean[] {false} ;
      T013V66_A396EmprCod = new String[] {""} ;
      T013V66_A9429PMCod = new int[1] ;
      T013V66_n9429PMCod = new boolean[] {false} ;
      T013V66_A9481PMOpeRes = new int[1] ;
      Gridlevel_equiposRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_equipos_Linesclass = "" ;
      ROClassString = "" ;
      Gridlevel_repuestosRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_repuestos_Linesclass = "" ;
      Gridlevel_tareasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_tareas_Linesclass = "" ;
      Gridlevel_responsablesRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_responsables_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9474PMFchCre = GXutil.nullDate() ;
      i9475PMUsuCre = "" ;
      i9478PMEst = "" ;
      i9484PMIni = GXutil.nullDate() ;
      Gridlevel_equiposColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_responsablesColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_tareasColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_repuestosColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13748OpeCNom = "" ;
      T013V67_A13748OpeCNom = new String[] {""} ;
      T013V68_A13748OpeCNom = new String[] {""} ;
      T013V68_A396EmprCod = new String[] {""} ;
      T013V68_A652OpeCod = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      ZV14MaqEquDsc = "" ;
      T013V69_A13748OpeCNom = new String[] {""} ;
      T013V69_A396EmprCod = new String[] {""} ;
      T013V69_A652OpeCod = new int[1] ;
      T013V70_A9482PMOpeResN = new String[] {""} ;
      T013V70_n9482PMOpeResN = new boolean[] {false} ;
      Zh9481PMOpeRes = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmpreve__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmpreve__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmpreve__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmpreve__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmpreve__default(),
         new Object[] {
             new Object[] {
            T013V2_A9429PMCod, T013V2_A11457PMOpeTie, T013V2_A396EmprCod, T013V2_A9481PMOpeRes
            }
            , new Object[] {
            T013V3_A9429PMCod, T013V3_A11457PMOpeTie, T013V3_A396EmprCod, T013V3_A9481PMOpeRes
            }
            , new Object[] {
            T013V4_A9482PMOpeResN, T013V4_n9482PMOpeResN
            }
            , new Object[] {
            T013V5_A9429PMCod, T013V5_A396EmprCod, T013V5_A9479PMTCod
            }
            , new Object[] {
            T013V6_A9429PMCod, T013V6_A396EmprCod, T013V6_A9479PMTCod
            }
            , new Object[] {
            T013V7_A9480PMTDsc, T013V7_n9480PMTDsc
            }
            , new Object[] {
            T013V8_A9429PMCod, T013V8_A9491PMRRCnt, T013V8_A396EmprCod, T013V8_A9489PMRepCod
            }
            , new Object[] {
            T013V9_A9429PMCod, T013V9_A9491PMRRCnt, T013V9_A396EmprCod, T013V9_A9489PMRepCod
            }
            , new Object[] {
            T013V10_A9490PMRepNom, T013V10_n9490PMRepNom
            }
            , new Object[] {
            T013V11_A9429PMCod, T013V11_A396EmprCod, T013V11_A11450PMMEquCod, T013V11_A11451PMMSEqCod, T013V11_A11452PMMPieCod
            }
            , new Object[] {
            T013V12_A9429PMCod, T013V12_A396EmprCod, T013V12_A11450PMMEquCod, T013V12_A11451PMMSEqCod, T013V12_A11452PMMPieCod
            }
            , new Object[] {
            T013V13_A12597PMMEquDsc, T013V13_A12598PMMSEqDsc, T013V13_A11453PMMPieDsc, T013V13_n11453PMMPieDsc
            }
            , new Object[] {
            T013V14_A9429PMCod, T013V14_A9473PMDsc, T013V14_n9473PMDsc, T013V14_A9474PMFchCre, T013V14_n9474PMFchCre, T013V14_A9475PMUsuCre, T013V14_n9475PMUsuCre, T013V14_A9478PMEst, T013V14_n9478PMEst, T013V14_A9483PMTxt,
            T013V14_n9483PMTxt, T013V14_A9484PMIni, T013V14_n9484PMIni, T013V14_A9485PMFin, T013V14_n9485PMFin, T013V14_A9486PMUlt, T013V14_n9486PMUlt, T013V14_A11454PMUso, T013V14_n11454PMUso, T013V14_A9487PMDias,
            T013V14_n9487PMDias, T013V14_A9488PMOrd, T013V14_n9488PMOrd, T013V14_A11455PMTie, T013V14_A11456PMPla, T013V14_A13013PMUsoMts, T013V14_n13013PMUsoMts, T013V14_A14275PMDiasPavi, T013V14_n14275PMDiasPavi, T013V14_A14274PMTieMto,
            T013V14_n14274PMTieMto, T013V14_A396EmprCod, T013V14_A9476PMMaqCod, T013V14_n9476PMMaqCod, T013V14_A14271PMTipoID
            }
            , new Object[] {
            T013V15_A9429PMCod, T013V15_A9473PMDsc, T013V15_n9473PMDsc, T013V15_A9474PMFchCre, T013V15_n9474PMFchCre, T013V15_A9475PMUsuCre, T013V15_n9475PMUsuCre, T013V15_A9478PMEst, T013V15_n9478PMEst, T013V15_A9483PMTxt,
            T013V15_n9483PMTxt, T013V15_A9484PMIni, T013V15_n9484PMIni, T013V15_A9485PMFin, T013V15_n9485PMFin, T013V15_A9486PMUlt, T013V15_n9486PMUlt, T013V15_A11454PMUso, T013V15_n11454PMUso, T013V15_A9487PMDias,
            T013V15_n9487PMDias, T013V15_A9488PMOrd, T013V15_n9488PMOrd, T013V15_A11455PMTie, T013V15_A11456PMPla, T013V15_A13013PMUsoMts, T013V15_n13013PMUsoMts, T013V15_A14275PMDiasPavi, T013V15_n14275PMDiasPavi, T013V15_A14274PMTieMto,
            T013V15_n14274PMTieMto, T013V15_A396EmprCod, T013V15_A9476PMMaqCod, T013V15_n9476PMMaqCod, T013V15_A14271PMTipoID
            }
            , new Object[] {
            T013V16_A407EmprNom, T013V16_n407EmprNom
            }
            , new Object[] {
            T013V17_A9477PMMaqDsc, T013V17_n9477PMMaqDsc
            }
            , new Object[] {
            T013V18_A14272PMTipoDsc
            }
            , new Object[] {
            T013V19_A9429PMCod, T013V19_A407EmprNom, T013V19_n407EmprNom, T013V19_A9473PMDsc, T013V19_n9473PMDsc, T013V19_A9474PMFchCre, T013V19_n9474PMFchCre, T013V19_A9475PMUsuCre, T013V19_n9475PMUsuCre, T013V19_A9477PMMaqDsc,
            T013V19_n9477PMMaqDsc, T013V19_A9478PMEst, T013V19_n9478PMEst, T013V19_A9483PMTxt, T013V19_n9483PMTxt, T013V19_A9484PMIni, T013V19_n9484PMIni, T013V19_A9485PMFin, T013V19_n9485PMFin, T013V19_A9486PMUlt,
            T013V19_n9486PMUlt, T013V19_A11454PMUso, T013V19_n11454PMUso, T013V19_A9487PMDias, T013V19_n9487PMDias, T013V19_A9488PMOrd, T013V19_n9488PMOrd, T013V19_A11455PMTie, T013V19_A11456PMPla, T013V19_A13013PMUsoMts,
            T013V19_n13013PMUsoMts, T013V19_A14275PMDiasPavi, T013V19_n14275PMDiasPavi, T013V19_A14272PMTipoDsc, T013V19_A14274PMTieMto, T013V19_n14274PMTieMto, T013V19_A396EmprCod, T013V19_A9476PMMaqCod, T013V19_n9476PMMaqCod, T013V19_A14271PMTipoID
            }
            , new Object[] {
            T013V20_A407EmprNom, T013V20_n407EmprNom
            }
            , new Object[] {
            T013V21_A9477PMMaqDsc, T013V21_n9477PMMaqDsc
            }
            , new Object[] {
            T013V22_A14272PMTipoDsc
            }
            , new Object[] {
            T013V23_A396EmprCod, T013V23_A9429PMCod
            }
            , new Object[] {
            T013V24_A396EmprCod, T013V24_A9429PMCod
            }
            , new Object[] {
            T013V25_A396EmprCod, T013V25_A9429PMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013V29_A407EmprNom, T013V29_n407EmprNom
            }
            , new Object[] {
            T013V30_A9477PMMaqDsc, T013V30_n9477PMMaqDsc
            }
            , new Object[] {
            T013V31_A14272PMTipoDsc
            }
            , new Object[] {
            T013V32_A396EmprCod, T013V32_A9429PMCod, T013V32_A9479PMTCod, T013V32_A12644TMPMMEquCo, T013V32_A12645TMPMMSEqCo, T013V32_A12646TMPMMPieCo
            }
            , new Object[] {
            T013V33_A396EmprCod, T013V33_A9425OMCod
            }
            , new Object[] {
            T013V34_A396EmprCod, T013V34_A9429PMCod
            }
            , new Object[] {
            T013V35_A9476PMMaqCod, T013V35_A9429PMCod, T013V35_A12597PMMEquDsc, T013V35_A12598PMMSEqDsc, T013V35_A11453PMMPieDsc, T013V35_n11453PMMPieDsc, T013V35_A396EmprCod, T013V35_A11450PMMEquCod, T013V35_A11451PMMSEqCod, T013V35_A11452PMMPieCod
            }
            , new Object[] {
            T013V36_A12597PMMEquDsc, T013V36_A12598PMMSEqDsc, T013V36_A11453PMMPieDsc, T013V36_n11453PMMPieDsc
            }
            , new Object[] {
            T013V37_A396EmprCod, T013V37_A9429PMCod, T013V37_A11450PMMEquCod, T013V37_A11451PMMSEqCod, T013V37_A11452PMMPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013V40_A12597PMMEquDsc, T013V40_A12598PMMSEqDsc, T013V40_A11453PMMPieDsc, T013V40_n11453PMMPieDsc
            }
            , new Object[] {
            T013V41_A396EmprCod, T013V41_A9429PMCod, T013V41_A11450PMMEquCod, T013V41_A11451PMMSEqCod, T013V41_A11452PMMPieCod
            }
            , new Object[] {
            T013V42_A9429PMCod, T013V42_A9490PMRepNom, T013V42_n9490PMRepNom, T013V42_A9491PMRRCnt, T013V42_A396EmprCod, T013V42_A9489PMRepCod
            }
            , new Object[] {
            T013V43_A9490PMRepNom, T013V43_n9490PMRepNom
            }
            , new Object[] {
            T013V44_A396EmprCod, T013V44_A9429PMCod, T013V44_A9489PMRepCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013V48_A9490PMRepNom, T013V48_n9490PMRepNom
            }
            , new Object[] {
            T013V49_A396EmprCod, T013V49_A9429PMCod, T013V49_A9489PMRepCod
            }
            , new Object[] {
            T013V50_A9429PMCod, T013V50_A9480PMTDsc, T013V50_n9480PMTDsc, T013V50_A396EmprCod, T013V50_A9479PMTCod
            }
            , new Object[] {
            T013V51_A9480PMTDsc, T013V51_n9480PMTDsc
            }
            , new Object[] {
            T013V52_A396EmprCod, T013V52_A9429PMCod, T013V52_A9479PMTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013V55_A9480PMTDsc, T013V55_n9480PMTDsc
            }
            , new Object[] {
            T013V56_A396EmprCod, T013V56_A9429PMCod, T013V56_A9479PMTCod, T013V56_A12644TMPMMEquCo, T013V56_A12645TMPMMSEqCo, T013V56_A12646TMPMMPieCo
            }
            , new Object[] {
            T013V57_A396EmprCod, T013V57_A9429PMCod, T013V57_A9479PMTCod
            }
            , new Object[] {
            T013V58_A9429PMCod, T013V58_A9482PMOpeResN, T013V58_n9482PMOpeResN, T013V58_A11457PMOpeTie, T013V58_A396EmprCod, T013V58_A9481PMOpeRes
            }
            , new Object[] {
            T013V59_A13748OpeCNom, T013V59_A396EmprCod, T013V59_A652OpeCod
            }
            , new Object[] {
            T013V60_A9482PMOpeResN, T013V60_n9482PMOpeResN
            }
            , new Object[] {
            T013V61_A396EmprCod, T013V61_A9429PMCod, T013V61_A9481PMOpeRes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013V65_A9482PMOpeResN, T013V65_n9482PMOpeResN
            }
            , new Object[] {
            T013V66_A396EmprCod, T013V66_A9429PMCod, T013V66_A9481PMOpeRes
            }
            , new Object[] {
            T013V67_A13748OpeCNom
            }
            , new Object[] {
            T013V68_A13748OpeCNom, T013V68_A396EmprCod, T013V68_A652OpeCod
            }
            , new Object[] {
            T013V69_A13748OpeCNom, T013V69_A396EmprCod, T013V69_A652OpeCod
            }
            , new Object[] {
            T013V70_A9482PMOpeResN, T013V70_n9482PMOpeResN
            }
         }
      );
      AV35Pgmname = "MantenimientoMaquina.TMPreve" ;
      Z9486PMUlt = GXutil.nullDate() ;
      n9486PMUlt = false ;
      A9486PMUlt = GXutil.nullDate() ;
      n9486PMUlt = false ;
      Z9484PMIni = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9484PMIni = false ;
      A9484PMIni = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9484PMIni = false ;
      i9484PMIni = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9484PMIni = false ;
      Z9478PMEst = httpContext.getMessage( "A", "") ;
      n9478PMEst = false ;
      A9478PMEst = httpContext.getMessage( "A", "") ;
      n9478PMEst = false ;
      i9478PMEst = httpContext.getMessage( "A", "") ;
      n9478PMEst = false ;
      Z9475PMUsuCre = "" ;
      n9475PMUsuCre = false ;
      A9475PMUsuCre = "" ;
      n9475PMUsuCre = false ;
      i9475PMUsuCre = "" ;
      n9475PMUsuCre = false ;
      Z9474PMFchCre = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9474PMFchCre = false ;
      A9474PMFchCre = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9474PMFchCre = false ;
      i9474PMFchCre = GXutil.serverDate( context, remoteHandle, pr_default) ;
      n9474PMFchCre = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_equipos_Backcolorstyle ;
   private byte subGridlevel_equipos_Backstyle ;
   private byte subGridlevel_repuestos_Backcolorstyle ;
   private byte subGridlevel_repuestos_Backstyle ;
   private byte subGridlevel_tareas_Backcolorstyle ;
   private byte subGridlevel_tareas_Backstyle ;
   private byte subGridlevel_responsables_Backcolorstyle ;
   private byte subGridlevel_responsables_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_equipos_Allowselection ;
   private byte subGridlevel_equipos_Allowhovering ;
   private byte subGridlevel_equipos_Allowcollapsing ;
   private byte subGridlevel_equipos_Collapsed ;
   private byte subGridlevel_responsables_Allowselection ;
   private byte subGridlevel_responsables_Allowhovering ;
   private byte subGridlevel_responsables_Allowcollapsing ;
   private byte subGridlevel_responsables_Collapsed ;
   private byte subGridlevel_tareas_Allowselection ;
   private byte subGridlevel_tareas_Allowhovering ;
   private byte subGridlevel_tareas_Allowcollapsing ;
   private byte subGridlevel_tareas_Collapsed ;
   private byte subGridlevel_repuestos_Allowselection ;
   private byte subGridlevel_repuestos_Allowhovering ;
   private byte subGridlevel_repuestos_Allowcollapsing ;
   private byte subGridlevel_repuestos_Collapsed ;
   private short Z9487PMDias ;
   private short Z14275PMDiasPavi ;
   private short Z14271PMTipoID ;
   private short N14271PMTipoID ;
   private short nRcdDeleted_1532 ;
   private short nRcdExists_1532 ;
   private short nIsMod_1532 ;
   private short nRcdDeleted_1237 ;
   private short nRcdExists_1237 ;
   private short nIsMod_1237 ;
   private short nRcdDeleted_1533 ;
   private short nRcdExists_1533 ;
   private short nIsMod_1533 ;
   private short nRcdDeleted_1523 ;
   private short nRcdExists_1523 ;
   private short nIsMod_1523 ;
   private short A14271PMTipoID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A9487PMDias ;
   private short AV33ComboPMTipoID ;
   private short nBlankRcdCount1532 ;
   private short RcdFound1532 ;
   private short nBlankRcdUsr1532 ;
   private short nBlankRcdCount1523 ;
   private short RcdFound1523 ;
   private short nBlankRcdUsr1523 ;
   private short nBlankRcdCount1533 ;
   private short RcdFound1533 ;
   private short nBlankRcdUsr1533 ;
   private short nBlankRcdCount1237 ;
   private short RcdFound1237 ;
   private short nBlankRcdUsr1237 ;
   private short A14275PMDiasPavi ;
   private short AV26Insert_PMTipoID ;
   private short RcdFound1236 ;
   private short nIsDirty_1236 ;
   private short nIsDirty_1532 ;
   private short nIsDirty_1237 ;
   private short nIsDirty_1533 ;
   private short nIsDirty_1523 ;
   private short gxhchits ;
   private int wcpOAV13PMCod ;
   private int Z9429PMCod ;
   private int Z9488PMOrd ;
   private int nRC_GXsfl_177 ;
   private int nGXsfl_177_idx=1 ;
   private int nRC_GXsfl_213 ;
   private int nGXsfl_213_idx=1 ;
   private int nRC_GXsfl_206 ;
   private int nGXsfl_206_idx=1 ;
   private int nRC_GXsfl_193 ;
   private int nGXsfl_193_idx=1 ;
   private int Z9489PMRepCod ;
   private int Z9479PMTCod ;
   private int Z9481PMOpeRes ;
   private int A9429PMCod ;
   private int A9479PMTCod ;
   private int AV13PMCod ;
   private int A9489PMRepCod ;
   private int A9481PMOpeRes ;
   private int trnEnded ;
   private int edtPMCod_Enabled ;
   private int edtPMDsc_Enabled ;
   private int edtPMTipoID_Visible ;
   private int edtPMTipoID_Enabled ;
   private int edtPMMaqCod_Visible ;
   private int edtPMMaqCod_Enabled ;
   private int edtPMFchCre_Enabled ;
   private int edtPMUsuCre_Enabled ;
   private int edtPMDias_Enabled ;
   private int edtPMUso_Enabled ;
   private int edtPMUsoMts_Enabled ;
   private int edtPMTie_Enabled ;
   private int edtPMPla_Enabled ;
   private int edtPMIni_Enabled ;
   private int edtPMFin_Enabled ;
   private int edtPMUlt_Enabled ;
   private int A9488PMOrd ;
   private int edtPMOrd_Enabled ;
   private int edtPMTxt_Enabled ;
   private int divTableleaflevel_equipos_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombopmtipoid_Enabled ;
   private int edtavCombopmtipoid_Visible ;
   private int edtavCombopmmaqcod_Visible ;
   private int edtavCombopmmaqcod_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtPMMaqDsc_Visible ;
   private int edtPMMaqDsc_Enabled ;
   private int edtPMMEquCod_Enabled ;
   private int edtPMMEquDsc_Enabled ;
   private int edtPMMSEqCod_Enabled ;
   private int edtPMMSEqDsc_Enabled ;
   private int edtPMMPieCod_Enabled ;
   private int edtPMMPieDsc_Enabled ;
   private int fRowAdded ;
   private int edtPMOpeRes_Enabled ;
   private int edtPMOpeResN_Enabled ;
   private int edtPMOpeTie_Enabled ;
   private int edtPMTCod_Enabled ;
   private int edtPMTDsc_Enabled ;
   private int edtPMRepCod_Enabled ;
   private int edtPMRepNom_Enabled ;
   private int edtPMRRCnt_Enabled ;
   private int Combo_pmtipoid_Datalistupdateminimumcharacters ;
   private int Combo_pmmaqcod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_pmmequcod_Datalistupdateminimumcharacters ;
   private int Combo_pmmseqcod_Datalistupdateminimumcharacters ;
   private int Combo_pmmpiecod_Datalistupdateminimumcharacters ;
   private int Combo_pmtcod_Datalistupdateminimumcharacters ;
   private int Combo_pmrepcod_Datalistupdateminimumcharacters ;
   private int AV36GXV1 ;
   private int GX_JID ;
   private int subGridlevel_equipos_Backcolor ;
   private int subGridlevel_equipos_Allbackcolor ;
   private int subGridlevel_repuestos_Backcolor ;
   private int subGridlevel_repuestos_Allbackcolor ;
   private int subGridlevel_tareas_Backcolor ;
   private int subGridlevel_tareas_Allbackcolor ;
   private int subGridlevel_responsables_Backcolor ;
   private int subGridlevel_responsables_Allbackcolor ;
   private int defedtPMRepNom_Enabled ;
   private int defedtPMRepCod_Enabled ;
   private int defedtPMTDsc_Enabled ;
   private int defedtPMTCod_Enabled ;
   private int defedtPMOpeTie_Enabled ;
   private int defedtPMOpeResN_Enabled ;
   private int defedtPMOpeRes_Enabled ;
   private int defedtPMMPieDsc_Enabled ;
   private int defedtPMMPieCod_Enabled ;
   private int defedtPMMSEqDsc_Enabled ;
   private int defedtPMMSEqCod_Enabled ;
   private int defedtPMMEquDsc_Enabled ;
   private int defedtPMMEquCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_equipos_Selectedindex ;
   private int subGridlevel_equipos_Selectioncolor ;
   private int subGridlevel_equipos_Hoveringcolor ;
   private int subGridlevel_responsables_Selectedindex ;
   private int subGridlevel_responsables_Selectioncolor ;
   private int subGridlevel_responsables_Hoveringcolor ;
   private int subGridlevel_tareas_Selectedindex ;
   private int subGridlevel_tareas_Selectioncolor ;
   private int subGridlevel_tareas_Hoveringcolor ;
   private int subGridlevel_repuestos_Selectedindex ;
   private int subGridlevel_repuestos_Selectioncolor ;
   private int subGridlevel_repuestos_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int A652OpeCod ;
   private int GXt_int10 ;
   private int GXv_int12[] ;
   private int GXv_int11[] ;
   private long GRIDLEVEL_EQUIPOS_nFirstRecordOnPage ;
   private long GRIDLEVEL_REPUESTOS_nFirstRecordOnPage ;
   private long GRIDLEVEL_TAREAS_nFirstRecordOnPage ;
   private long GRIDLEVEL_RESPONSABLES_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11454PMUso ;
   private java.math.BigDecimal Z11455PMTie ;
   private java.math.BigDecimal Z13013PMUsoMts ;
   private java.math.BigDecimal Z14274PMTieMto ;
   private java.math.BigDecimal Z9491PMRRCnt ;
   private java.math.BigDecimal Z11457PMOpeTie ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal A11455PMTie ;
   private java.math.BigDecimal A14274PMTieMto ;
   private java.math.BigDecimal A11457PMOpeTie ;
   private java.math.BigDecimal A9491PMRRCnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV20EmprCod ;
   private String Z396EmprCod ;
   private String Z9473PMDsc ;
   private String Z9475PMUsuCre ;
   private String Z9478PMEst ;
   private String Z11456PMPla ;
   private String Z9476PMMaqCod ;
   private String N9476PMMaqCod ;
   private String Combo_pmmaqcod_Selectedvalue_get ;
   private String Combo_pmtipoid_Selectedvalue_get ;
   private String Z11450PMMEquCod ;
   private String Z11451PMMSEqCod ;
   private String Z11452PMMPieCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A9476PMMaqCod ;
   private String A11450PMMEquCod ;
   private String A11451PMMSEqCod ;
   private String A11452PMMPieCod ;
   private String AV20EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPMDsc_Internalname ;
   private String sGXsfl_177_idx="0001" ;
   private String sGXsfl_193_idx="0001" ;
   private String sGXsfl_206_idx="0001" ;
   private String edtPMTCod_Horizontalalignment ;
   private String edtPMTCod_Internalname ;
   private String sGXsfl_213_idx="0001" ;
   private String edtPMRepCod_Horizontalalignment ;
   private String edtPMRepCod_Internalname ;
   private String A9478PMEst ;
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
   private String divUnnamedtable10_Internalname ;
   private String edtPMCod_Internalname ;
   private String TempTags ;
   private String edtPMCod_Jsonclick ;
   private String A9473PMDsc ;
   private String edtPMDsc_Jsonclick ;
   private String divTablesplittedpmtipoid_Internalname ;
   private String lblTextblockpmtipoid_Internalname ;
   private String lblTextblockpmtipoid_Jsonclick ;
   private String Combo_pmtipoid_Caption ;
   private String Combo_pmtipoid_Cls ;
   private String Combo_pmtipoid_Internalname ;
   private String edtPMTipoID_Internalname ;
   private String edtPMTipoID_Jsonclick ;
   private String divTablesplittedpmmaqcod_Internalname ;
   private String lblTextblockpmmaqcod_Internalname ;
   private String lblTextblockpmmaqcod_Jsonclick ;
   private String Combo_pmmaqcod_Caption ;
   private String Combo_pmmaqcod_Cls ;
   private String Combo_pmmaqcod_Emptyitemtext ;
   private String Combo_pmmaqcod_Internalname ;
   private String edtPMMaqCod_Internalname ;
   private String edtPMMaqCod_Jsonclick ;
   private String edtPMFchCre_Internalname ;
   private String edtPMFchCre_Jsonclick ;
   private String edtPMUsuCre_Internalname ;
   private String A9475PMUsuCre ;
   private String edtPMUsuCre_Jsonclick ;
   private String Dvpanel_tablefrecuencia_Width ;
   private String Dvpanel_tablefrecuencia_Cls ;
   private String Dvpanel_tablefrecuencia_Title ;
   private String Dvpanel_tablefrecuencia_Iconposition ;
   private String Dvpanel_tablefrecuencia_Internalname ;
   private String divTablefrecuencia_Internalname ;
   private String grpUnnamedgroup6_Internalname ;
   private String divFrecuencia_Internalname ;
   private String divUnnamedtablepmdias_Internalname ;
   private String lblTextblockpmdias_Internalname ;
   private String lblTextblockpmdias_Jsonclick ;
   private String edtPMDias_Internalname ;
   private String edtPMDias_Jsonclick ;
   private String divUnnamedtablepmuso_Internalname ;
   private String lblTextblockpmuso_Internalname ;
   private String lblTextblockpmuso_Jsonclick ;
   private String edtPMUso_Internalname ;
   private String edtPMUso_Jsonclick ;
   private String divUnnamedtablepmusomts_Internalname ;
   private String lblTextblockpmusomts_Internalname ;
   private String lblTextblockpmusomts_Jsonclick ;
   private String edtPMUsoMts_Internalname ;
   private String edtPMUsoMts_Jsonclick ;
   private String grpUnnamedgroup7_Internalname ;
   private String divPlanificacion_Internalname ;
   private String divUnnamedtablepmtie_Internalname ;
   private String lblTextblockpmtie_Internalname ;
   private String lblTextblockpmtie_Jsonclick ;
   private String edtPMTie_Internalname ;
   private String edtPMTie_Jsonclick ;
   private String divUnnamedtablepmpla_Internalname ;
   private String lblTextblockpmpla_Internalname ;
   private String lblTextblockpmpla_Jsonclick ;
   private String edtPMPla_Internalname ;
   private String A11456PMPla ;
   private String edtPMPla_Jsonclick ;
   private String grpUnnamedgroup8_Internalname ;
   private String divValidez_Internalname ;
   private String divUnnamedtablepmini_Internalname ;
   private String lblTextblockpmini_Internalname ;
   private String lblTextblockpmini_Jsonclick ;
   private String edtPMIni_Internalname ;
   private String edtPMIni_Jsonclick ;
   private String divUnnamedtablepmfin_Internalname ;
   private String lblTextblockpmfin_Internalname ;
   private String lblTextblockpmfin_Jsonclick ;
   private String edtPMFin_Internalname ;
   private String edtPMFin_Jsonclick ;
   private String grpUnnamedgroup9_Internalname ;
   private String divUltimainstancia_Internalname ;
   private String divUnnamedtablepmult_Internalname ;
   private String lblTextblockpmult_Internalname ;
   private String lblTextblockpmult_Jsonclick ;
   private String edtPMUlt_Internalname ;
   private String edtPMUlt_Jsonclick ;
   private String divUnnamedtablepmord_Internalname ;
   private String lblTextblockpmord_Internalname ;
   private String lblTextblockpmord_Jsonclick ;
   private String edtPMOrd_Internalname ;
   private String edtPMOrd_Jsonclick ;
   private String Dvpanel_tabletexto_Width ;
   private String Dvpanel_tabletexto_Cls ;
   private String Dvpanel_tabletexto_Title ;
   private String Dvpanel_tabletexto_Iconposition ;
   private String Dvpanel_tabletexto_Internalname ;
   private String divTabletexto_Internalname ;
   private String edtPMTxt_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divDvpanel_unnamedtable4_cell_Internalname ;
   private String divDvpanel_unnamedtable4_cell_Class ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTableleaflevel_equipos_Internalname ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divTableleaflevel_responsables_Internalname ;
   private String grpUnnamedgroup2_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTableleaflevel_tareas_Internalname ;
   private String divTableleaflevel_repuestos_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV35Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_pmtipoid_Internalname ;
   private String edtavCombopmtipoid_Internalname ;
   private String edtavCombopmtipoid_Jsonclick ;
   private String divSectionattribute_pmmaqcod_Internalname ;
   private String edtavCombopmmaqcod_Internalname ;
   private String AV25ComboPMMaqCod ;
   private String edtavCombopmmaqcod_Jsonclick ;
   private String Combo_pmmequcod_Caption ;
   private String Combo_pmmequcod_Cls ;
   private String Combo_pmmequcod_Internalname ;
   private String Combo_pmmseqcod_Caption ;
   private String Combo_pmmseqcod_Cls ;
   private String Combo_pmmseqcod_Internalname ;
   private String Combo_pmmpiecod_Caption ;
   private String Combo_pmmpiecod_Cls ;
   private String Combo_pmmpiecod_Internalname ;
   private String Combo_pmtcod_Caption ;
   private String Combo_pmtcod_Cls ;
   private String Combo_pmtcod_Internalname ;
   private String Combo_pmrepcod_Caption ;
   private String Combo_pmrepcod_Cls ;
   private String Combo_pmrepcod_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPMMaqDsc_Internalname ;
   private String A9477PMMaqDsc ;
   private String edtPMMaqDsc_Jsonclick ;
   private String sMode1532 ;
   private String edtPMMEquCod_Internalname ;
   private String edtPMMEquDsc_Internalname ;
   private String edtPMMSEqCod_Internalname ;
   private String edtPMMSEqDsc_Internalname ;
   private String edtPMMPieCod_Internalname ;
   private String edtPMMPieDsc_Internalname ;
   private String sStyleString ;
   private String subGridlevel_equipos_Internalname ;
   private String sMode1523 ;
   private String edtPMOpeRes_Internalname ;
   private String edtPMOpeResN_Internalname ;
   private String edtPMOpeTie_Internalname ;
   private String subGridlevel_responsables_Internalname ;
   private String sMode1533 ;
   private String edtPMTDsc_Internalname ;
   private String subGridlevel_tareas_Internalname ;
   private String sMode1237 ;
   private String edtPMRepNom_Internalname ;
   private String edtPMRRCnt_Internalname ;
   private String subGridlevel_repuestos_Internalname ;
   private String AV18Insert_PMMaqCod ;
   private String AV8UsurCod ;
   private String A14272PMTipoDsc ;
   private String AV14MaqEquDsc ;
   private String Combo_pmtipoid_Objectcall ;
   private String Combo_pmtipoid_Class ;
   private String Combo_pmtipoid_Icontype ;
   private String Combo_pmtipoid_Icon ;
   private String Combo_pmtipoid_Tooltip ;
   private String Combo_pmtipoid_Selectedvalue_set ;
   private String Combo_pmtipoid_Selectedtext_set ;
   private String Combo_pmtipoid_Selectedtext_get ;
   private String Combo_pmtipoid_Gamoauthtoken ;
   private String Combo_pmtipoid_Ddointernalname ;
   private String Combo_pmtipoid_Titlecontrolalign ;
   private String Combo_pmtipoid_Dropdownoptionstype ;
   private String Combo_pmtipoid_Titlecontrolidtoreplace ;
   private String Combo_pmtipoid_Datalisttype ;
   private String Combo_pmtipoid_Datalistfixedvalues ;
   private String Combo_pmtipoid_Datalistproc ;
   private String Combo_pmtipoid_Datalistprocparametersprefix ;
   private String Combo_pmtipoid_Remoteservicesparameters ;
   private String Combo_pmtipoid_Htmltemplate ;
   private String Combo_pmtipoid_Multiplevaluestype ;
   private String Combo_pmtipoid_Loadingdata ;
   private String Combo_pmtipoid_Noresultsfound ;
   private String Combo_pmtipoid_Emptyitemtext ;
   private String Combo_pmtipoid_Onlyselectedvalues ;
   private String Combo_pmtipoid_Selectalltext ;
   private String Combo_pmtipoid_Multiplevaluesseparator ;
   private String Combo_pmtipoid_Addnewoptiontext ;
   private String Combo_pmmaqcod_Objectcall ;
   private String Combo_pmmaqcod_Class ;
   private String Combo_pmmaqcod_Icontype ;
   private String Combo_pmmaqcod_Icon ;
   private String Combo_pmmaqcod_Tooltip ;
   private String Combo_pmmaqcod_Selectedvalue_set ;
   private String Combo_pmmaqcod_Selectedtext_set ;
   private String Combo_pmmaqcod_Selectedtext_get ;
   private String Combo_pmmaqcod_Gamoauthtoken ;
   private String Combo_pmmaqcod_Ddointernalname ;
   private String Combo_pmmaqcod_Titlecontrolalign ;
   private String Combo_pmmaqcod_Dropdownoptionstype ;
   private String Combo_pmmaqcod_Titlecontrolidtoreplace ;
   private String Combo_pmmaqcod_Datalisttype ;
   private String Combo_pmmaqcod_Datalistfixedvalues ;
   private String Combo_pmmaqcod_Datalistproc ;
   private String Combo_pmmaqcod_Datalistprocparametersprefix ;
   private String Combo_pmmaqcod_Remoteservicesparameters ;
   private String Combo_pmmaqcod_Htmltemplate ;
   private String Combo_pmmaqcod_Multiplevaluestype ;
   private String Combo_pmmaqcod_Loadingdata ;
   private String Combo_pmmaqcod_Noresultsfound ;
   private String Combo_pmmaqcod_Onlyselectedvalues ;
   private String Combo_pmmaqcod_Selectalltext ;
   private String Combo_pmmaqcod_Multiplevaluesseparator ;
   private String Combo_pmmaqcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_tablefrecuencia_Objectcall ;
   private String Dvpanel_tablefrecuencia_Class ;
   private String Dvpanel_tablefrecuencia_Height ;
   private String Dvpanel_tabletexto_Objectcall ;
   private String Dvpanel_tabletexto_Class ;
   private String Dvpanel_tabletexto_Height ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_unnamedtable5_Objectcall ;
   private String Dvpanel_unnamedtable5_Class ;
   private String Dvpanel_unnamedtable5_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_pmmequcod_Objectcall ;
   private String Combo_pmmequcod_Class ;
   private String Combo_pmmequcod_Icontype ;
   private String Combo_pmmequcod_Icon ;
   private String Combo_pmmequcod_Tooltip ;
   private String Combo_pmmequcod_Selectedvalue_set ;
   private String Combo_pmmequcod_Selectedvalue_get ;
   private String Combo_pmmequcod_Selectedtext_set ;
   private String Combo_pmmequcod_Selectedtext_get ;
   private String Combo_pmmequcod_Gamoauthtoken ;
   private String Combo_pmmequcod_Ddointernalname ;
   private String Combo_pmmequcod_Titlecontrolalign ;
   private String Combo_pmmequcod_Dropdownoptionstype ;
   private String Combo_pmmequcod_Titlecontrolidtoreplace ;
   private String Combo_pmmequcod_Datalisttype ;
   private String Combo_pmmequcod_Datalistfixedvalues ;
   private String Combo_pmmequcod_Datalistproc ;
   private String Combo_pmmequcod_Datalistprocparametersprefix ;
   private String Combo_pmmequcod_Remoteservicesparameters ;
   private String Combo_pmmequcod_Htmltemplate ;
   private String Combo_pmmequcod_Multiplevaluestype ;
   private String Combo_pmmequcod_Loadingdata ;
   private String Combo_pmmequcod_Noresultsfound ;
   private String Combo_pmmequcod_Emptyitemtext ;
   private String Combo_pmmequcod_Onlyselectedvalues ;
   private String Combo_pmmequcod_Selectalltext ;
   private String Combo_pmmequcod_Multiplevaluesseparator ;
   private String Combo_pmmequcod_Addnewoptiontext ;
   private String Combo_pmmseqcod_Objectcall ;
   private String Combo_pmmseqcod_Class ;
   private String Combo_pmmseqcod_Icontype ;
   private String Combo_pmmseqcod_Icon ;
   private String Combo_pmmseqcod_Tooltip ;
   private String Combo_pmmseqcod_Selectedvalue_set ;
   private String Combo_pmmseqcod_Selectedvalue_get ;
   private String Combo_pmmseqcod_Selectedtext_set ;
   private String Combo_pmmseqcod_Selectedtext_get ;
   private String Combo_pmmseqcod_Gamoauthtoken ;
   private String Combo_pmmseqcod_Ddointernalname ;
   private String Combo_pmmseqcod_Titlecontrolalign ;
   private String Combo_pmmseqcod_Dropdownoptionstype ;
   private String Combo_pmmseqcod_Titlecontrolidtoreplace ;
   private String Combo_pmmseqcod_Datalisttype ;
   private String Combo_pmmseqcod_Datalistfixedvalues ;
   private String Combo_pmmseqcod_Datalistproc ;
   private String Combo_pmmseqcod_Datalistprocparametersprefix ;
   private String Combo_pmmseqcod_Remoteservicesparameters ;
   private String Combo_pmmseqcod_Htmltemplate ;
   private String Combo_pmmseqcod_Multiplevaluestype ;
   private String Combo_pmmseqcod_Loadingdata ;
   private String Combo_pmmseqcod_Noresultsfound ;
   private String Combo_pmmseqcod_Emptyitemtext ;
   private String Combo_pmmseqcod_Onlyselectedvalues ;
   private String Combo_pmmseqcod_Selectalltext ;
   private String Combo_pmmseqcod_Multiplevaluesseparator ;
   private String Combo_pmmseqcod_Addnewoptiontext ;
   private String Combo_pmmpiecod_Objectcall ;
   private String Combo_pmmpiecod_Class ;
   private String Combo_pmmpiecod_Icontype ;
   private String Combo_pmmpiecod_Icon ;
   private String Combo_pmmpiecod_Tooltip ;
   private String Combo_pmmpiecod_Selectedvalue_set ;
   private String Combo_pmmpiecod_Selectedvalue_get ;
   private String Combo_pmmpiecod_Selectedtext_set ;
   private String Combo_pmmpiecod_Selectedtext_get ;
   private String Combo_pmmpiecod_Gamoauthtoken ;
   private String Combo_pmmpiecod_Ddointernalname ;
   private String Combo_pmmpiecod_Titlecontrolalign ;
   private String Combo_pmmpiecod_Dropdownoptionstype ;
   private String Combo_pmmpiecod_Titlecontrolidtoreplace ;
   private String Combo_pmmpiecod_Datalisttype ;
   private String Combo_pmmpiecod_Datalistfixedvalues ;
   private String Combo_pmmpiecod_Datalistproc ;
   private String Combo_pmmpiecod_Datalistprocparametersprefix ;
   private String Combo_pmmpiecod_Remoteservicesparameters ;
   private String Combo_pmmpiecod_Htmltemplate ;
   private String Combo_pmmpiecod_Multiplevaluestype ;
   private String Combo_pmmpiecod_Loadingdata ;
   private String Combo_pmmpiecod_Noresultsfound ;
   private String Combo_pmmpiecod_Emptyitemtext ;
   private String Combo_pmmpiecod_Onlyselectedvalues ;
   private String Combo_pmmpiecod_Selectalltext ;
   private String Combo_pmmpiecod_Multiplevaluesseparator ;
   private String Combo_pmmpiecod_Addnewoptiontext ;
   private String Combo_pmtcod_Objectcall ;
   private String Combo_pmtcod_Class ;
   private String Combo_pmtcod_Icontype ;
   private String Combo_pmtcod_Icon ;
   private String Combo_pmtcod_Tooltip ;
   private String Combo_pmtcod_Selectedvalue_set ;
   private String Combo_pmtcod_Selectedvalue_get ;
   private String Combo_pmtcod_Selectedtext_set ;
   private String Combo_pmtcod_Selectedtext_get ;
   private String Combo_pmtcod_Gamoauthtoken ;
   private String Combo_pmtcod_Ddointernalname ;
   private String Combo_pmtcod_Titlecontrolalign ;
   private String Combo_pmtcod_Dropdownoptionstype ;
   private String Combo_pmtcod_Titlecontrolidtoreplace ;
   private String Combo_pmtcod_Datalisttype ;
   private String Combo_pmtcod_Datalistfixedvalues ;
   private String Combo_pmtcod_Datalistproc ;
   private String Combo_pmtcod_Datalistprocparametersprefix ;
   private String Combo_pmtcod_Remoteservicesparameters ;
   private String Combo_pmtcod_Htmltemplate ;
   private String Combo_pmtcod_Multiplevaluestype ;
   private String Combo_pmtcod_Loadingdata ;
   private String Combo_pmtcod_Noresultsfound ;
   private String Combo_pmtcod_Emptyitemtext ;
   private String Combo_pmtcod_Onlyselectedvalues ;
   private String Combo_pmtcod_Selectalltext ;
   private String Combo_pmtcod_Multiplevaluesseparator ;
   private String Combo_pmtcod_Addnewoptiontext ;
   private String Combo_pmrepcod_Objectcall ;
   private String Combo_pmrepcod_Class ;
   private String Combo_pmrepcod_Icontype ;
   private String Combo_pmrepcod_Icon ;
   private String Combo_pmrepcod_Tooltip ;
   private String Combo_pmrepcod_Selectedvalue_set ;
   private String Combo_pmrepcod_Selectedvalue_get ;
   private String Combo_pmrepcod_Selectedtext_set ;
   private String Combo_pmrepcod_Selectedtext_get ;
   private String Combo_pmrepcod_Gamoauthtoken ;
   private String Combo_pmrepcod_Ddointernalname ;
   private String Combo_pmrepcod_Titlecontrolalign ;
   private String Combo_pmrepcod_Dropdownoptionstype ;
   private String Combo_pmrepcod_Titlecontrolidtoreplace ;
   private String Combo_pmrepcod_Datalisttype ;
   private String Combo_pmrepcod_Datalistfixedvalues ;
   private String Combo_pmrepcod_Datalistproc ;
   private String Combo_pmrepcod_Datalistprocparametersprefix ;
   private String Combo_pmrepcod_Remoteservicesparameters ;
   private String Combo_pmrepcod_Htmltemplate ;
   private String Combo_pmrepcod_Multiplevaluestype ;
   private String Combo_pmrepcod_Loadingdata ;
   private String Combo_pmrepcod_Noresultsfound ;
   private String Combo_pmrepcod_Emptyitemtext ;
   private String Combo_pmrepcod_Onlyselectedvalues ;
   private String Combo_pmrepcod_Selectalltext ;
   private String Combo_pmrepcod_Multiplevaluesseparator ;
   private String Combo_pmrepcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode1236 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9482PMOpeResN ;
   private String A9480PMTDsc ;
   private String A9490PMRepNom ;
   private String A12597PMMEquDsc ;
   private String A12598PMMSEqDsc ;
   private String A11453PMMPieDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z9477PMMaqDsc ;
   private String Z14272PMTipoDsc ;
   private String Z12597PMMEquDsc ;
   private String Z12598PMMSEqDsc ;
   private String Z11453PMMPieDsc ;
   private String Z9490PMRepNom ;
   private String Z9480PMTDsc ;
   private String Z9482PMOpeResN ;
   private String sGXsfl_177_fel_idx="0001" ;
   private String subGridlevel_equipos_Class ;
   private String subGridlevel_equipos_Linesclass ;
   private String ROClassString ;
   private String edtPMMEquCod_Jsonclick ;
   private String edtPMMEquDsc_Jsonclick ;
   private String edtPMMSEqCod_Jsonclick ;
   private String edtPMMSEqDsc_Jsonclick ;
   private String edtPMMPieCod_Jsonclick ;
   private String edtPMMPieDsc_Jsonclick ;
   private String sGXsfl_213_fel_idx="0001" ;
   private String subGridlevel_repuestos_Class ;
   private String subGridlevel_repuestos_Linesclass ;
   private String edtPMRepCod_Jsonclick ;
   private String edtPMRepNom_Jsonclick ;
   private String edtPMRRCnt_Jsonclick ;
   private String sGXsfl_206_fel_idx="0001" ;
   private String subGridlevel_tareas_Class ;
   private String subGridlevel_tareas_Linesclass ;
   private String edtPMTCod_Jsonclick ;
   private String edtPMTDsc_Jsonclick ;
   private String sGXsfl_193_fel_idx="0001" ;
   private String subGridlevel_responsables_Class ;
   private String subGridlevel_responsables_Linesclass ;
   private String edtPMOpeRes_Jsonclick ;
   private String edtPMOpeResN_Jsonclick ;
   private String edtPMOpeTie_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9475PMUsuCre ;
   private String i9478PMEst ;
   private String subGridlevel_equipos_Header ;
   private String subGridlevel_responsables_Header ;
   private String subGridlevel_tareas_Header ;
   private String subGridlevel_repuestos_Header ;
   private String gxwrpcisep ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZV14MaqEquDsc ;
   private java.util.Date Z9474PMFchCre ;
   private java.util.Date Z9484PMIni ;
   private java.util.Date Z9485PMFin ;
   private java.util.Date Z9486PMUlt ;
   private java.util.Date A9474PMFchCre ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9485PMFin ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date i9474PMFchCre ;
   private java.util.Date i9484PMIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9429PMCod ;
   private boolean n9476PMMaqCod ;
   private boolean wbErr ;
   private boolean bGXsfl_206_Refreshing=false ;
   private boolean bGXsfl_213_Refreshing=false ;
   private boolean n9478PMEst ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_pmtipoid_Emptyitem ;
   private boolean Dvpanel_tablefrecuencia_Autowidth ;
   private boolean Dvpanel_tablefrecuencia_Autoheight ;
   private boolean Dvpanel_tablefrecuencia_Collapsible ;
   private boolean Dvpanel_tablefrecuencia_Collapsed ;
   private boolean Dvpanel_tablefrecuencia_Showcollapseicon ;
   private boolean Dvpanel_tablefrecuencia_Autoscroll ;
   private boolean Dvpanel_tabletexto_Autowidth ;
   private boolean Dvpanel_tabletexto_Autoheight ;
   private boolean Dvpanel_tabletexto_Collapsible ;
   private boolean Dvpanel_tabletexto_Collapsed ;
   private boolean Dvpanel_tabletexto_Showcollapseicon ;
   private boolean Dvpanel_tabletexto_Autoscroll ;
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
   private boolean Combo_pmmequcod_Isgriditem ;
   private boolean Combo_pmmequcod_Emptyitem ;
   private boolean Combo_pmmseqcod_Isgriditem ;
   private boolean Combo_pmmseqcod_Emptyitem ;
   private boolean Combo_pmmpiecod_Isgriditem ;
   private boolean Combo_pmmpiecod_Emptyitem ;
   private boolean Combo_pmtcod_Isgriditem ;
   private boolean Combo_pmtcod_Emptyitem ;
   private boolean Combo_pmrepcod_Isgriditem ;
   private boolean Combo_pmrepcod_Emptyitem ;
   private boolean bGXsfl_177_Refreshing=false ;
   private boolean bGXsfl_193_Refreshing=false ;
   private boolean n14275PMDiasPavi ;
   private boolean n14274PMTieMto ;
   private boolean Combo_pmtipoid_Enabled ;
   private boolean Combo_pmtipoid_Visible ;
   private boolean Combo_pmtipoid_Allowmultipleselection ;
   private boolean Combo_pmtipoid_Isgriditem ;
   private boolean Combo_pmtipoid_Hasdescription ;
   private boolean Combo_pmtipoid_Includeonlyselectedoption ;
   private boolean Combo_pmtipoid_Includeselectalloption ;
   private boolean Combo_pmtipoid_Includeaddnewoption ;
   private boolean Combo_pmmaqcod_Enabled ;
   private boolean Combo_pmmaqcod_Visible ;
   private boolean Combo_pmmaqcod_Allowmultipleselection ;
   private boolean Combo_pmmaqcod_Isgriditem ;
   private boolean Combo_pmmaqcod_Hasdescription ;
   private boolean Combo_pmmaqcod_Includeonlyselectedoption ;
   private boolean Combo_pmmaqcod_Includeselectalloption ;
   private boolean Combo_pmmaqcod_Emptyitem ;
   private boolean Combo_pmmaqcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_tablefrecuencia_Enabled ;
   private boolean Dvpanel_tablefrecuencia_Showheader ;
   private boolean Dvpanel_tablefrecuencia_Visible ;
   private boolean Dvpanel_tabletexto_Enabled ;
   private boolean Dvpanel_tabletexto_Showheader ;
   private boolean Dvpanel_tabletexto_Visible ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_unnamedtable5_Enabled ;
   private boolean Dvpanel_unnamedtable5_Showheader ;
   private boolean Dvpanel_unnamedtable5_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_pmmequcod_Enabled ;
   private boolean Combo_pmmequcod_Visible ;
   private boolean Combo_pmmequcod_Allowmultipleselection ;
   private boolean Combo_pmmequcod_Hasdescription ;
   private boolean Combo_pmmequcod_Includeonlyselectedoption ;
   private boolean Combo_pmmequcod_Includeselectalloption ;
   private boolean Combo_pmmequcod_Includeaddnewoption ;
   private boolean Combo_pmmseqcod_Enabled ;
   private boolean Combo_pmmseqcod_Visible ;
   private boolean Combo_pmmseqcod_Allowmultipleselection ;
   private boolean Combo_pmmseqcod_Hasdescription ;
   private boolean Combo_pmmseqcod_Includeonlyselectedoption ;
   private boolean Combo_pmmseqcod_Includeselectalloption ;
   private boolean Combo_pmmseqcod_Includeaddnewoption ;
   private boolean Combo_pmmpiecod_Enabled ;
   private boolean Combo_pmmpiecod_Visible ;
   private boolean Combo_pmmpiecod_Allowmultipleselection ;
   private boolean Combo_pmmpiecod_Hasdescription ;
   private boolean Combo_pmmpiecod_Includeonlyselectedoption ;
   private boolean Combo_pmmpiecod_Includeselectalloption ;
   private boolean Combo_pmmpiecod_Includeaddnewoption ;
   private boolean Combo_pmtcod_Enabled ;
   private boolean Combo_pmtcod_Visible ;
   private boolean Combo_pmtcod_Allowmultipleselection ;
   private boolean Combo_pmtcod_Hasdescription ;
   private boolean Combo_pmtcod_Includeonlyselectedoption ;
   private boolean Combo_pmtcod_Includeselectalloption ;
   private boolean Combo_pmtcod_Includeaddnewoption ;
   private boolean Combo_pmrepcod_Enabled ;
   private boolean Combo_pmrepcod_Visible ;
   private boolean Combo_pmrepcod_Allowmultipleselection ;
   private boolean Combo_pmrepcod_Hasdescription ;
   private boolean Combo_pmrepcod_Includeonlyselectedoption ;
   private boolean Combo_pmrepcod_Includeselectalloption ;
   private boolean Combo_pmrepcod_Includeaddnewoption ;
   private boolean n9473PMDsc ;
   private boolean n9474PMFchCre ;
   private boolean n9475PMUsuCre ;
   private boolean n9487PMDias ;
   private boolean n11454PMUso ;
   private boolean n13013PMUsoMts ;
   private boolean n9484PMIni ;
   private boolean n9485PMFin ;
   private boolean n9486PMUlt ;
   private boolean n9488PMOrd ;
   private boolean n9483PMTxt ;
   private boolean n407EmprNom ;
   private boolean n9477PMMaqDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n11453PMMPieDsc ;
   private boolean n9490PMRepNom ;
   private boolean n9480PMTDsc ;
   private boolean n9482PMOpeResN ;
   private String Z9483PMTxt ;
   private String A13748OpeCNom ;
   private String h9481PMOpeRes ;
   private String A9483PMTxt ;
   private String AV24ComboSelectedValue ;
   private String l13748OpeCNom ;
   private String Zh9481PMOpeRes ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_equiposContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_responsablesContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_tareasContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_repuestosContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_equiposRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_repuestosRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_tareasRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_responsablesRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_equiposColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_responsablesColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_tareasColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_repuestosColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV17WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_pmtipoid ;
   private com.genexus.webpanels.GXUserControl ucCombo_pmmaqcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablefrecuencia ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tabletexto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_pmmequcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_pmmseqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_pmmpiecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_pmtcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_pmrepcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPMEst ;
   private IDataStoreProvider pr_default ;
   private String[] T013V16_A407EmprNom ;
   private boolean[] T013V16_n407EmprNom ;
   private String[] T013V18_A14272PMTipoDsc ;
   private String[] T013V17_A9477PMMaqDsc ;
   private boolean[] T013V17_n9477PMMaqDsc ;
   private int[] T013V19_A9429PMCod ;
   private boolean[] T013V19_n9429PMCod ;
   private String[] T013V19_A407EmprNom ;
   private boolean[] T013V19_n407EmprNom ;
   private String[] T013V19_A9473PMDsc ;
   private boolean[] T013V19_n9473PMDsc ;
   private java.util.Date[] T013V19_A9474PMFchCre ;
   private boolean[] T013V19_n9474PMFchCre ;
   private String[] T013V19_A9475PMUsuCre ;
   private boolean[] T013V19_n9475PMUsuCre ;
   private String[] T013V19_A9477PMMaqDsc ;
   private boolean[] T013V19_n9477PMMaqDsc ;
   private String[] T013V19_A9478PMEst ;
   private boolean[] T013V19_n9478PMEst ;
   private String[] T013V19_A9483PMTxt ;
   private boolean[] T013V19_n9483PMTxt ;
   private java.util.Date[] T013V19_A9484PMIni ;
   private boolean[] T013V19_n9484PMIni ;
   private java.util.Date[] T013V19_A9485PMFin ;
   private boolean[] T013V19_n9485PMFin ;
   private java.util.Date[] T013V19_A9486PMUlt ;
   private boolean[] T013V19_n9486PMUlt ;
   private java.math.BigDecimal[] T013V19_A11454PMUso ;
   private boolean[] T013V19_n11454PMUso ;
   private short[] T013V19_A9487PMDias ;
   private boolean[] T013V19_n9487PMDias ;
   private int[] T013V19_A9488PMOrd ;
   private boolean[] T013V19_n9488PMOrd ;
   private java.math.BigDecimal[] T013V19_A11455PMTie ;
   private String[] T013V19_A11456PMPla ;
   private java.math.BigDecimal[] T013V19_A13013PMUsoMts ;
   private boolean[] T013V19_n13013PMUsoMts ;
   private short[] T013V19_A14275PMDiasPavi ;
   private boolean[] T013V19_n14275PMDiasPavi ;
   private String[] T013V19_A14272PMTipoDsc ;
   private java.math.BigDecimal[] T013V19_A14274PMTieMto ;
   private boolean[] T013V19_n14274PMTieMto ;
   private String[] T013V19_A396EmprCod ;
   private String[] T013V19_A9476PMMaqCod ;
   private boolean[] T013V19_n9476PMMaqCod ;
   private short[] T013V19_A14271PMTipoID ;
   private String[] T013V20_A407EmprNom ;
   private boolean[] T013V20_n407EmprNom ;
   private String[] T013V21_A9477PMMaqDsc ;
   private boolean[] T013V21_n9477PMMaqDsc ;
   private String[] T013V22_A14272PMTipoDsc ;
   private String[] T013V23_A396EmprCod ;
   private int[] T013V23_A9429PMCod ;
   private boolean[] T013V23_n9429PMCod ;
   private int[] T013V15_A9429PMCod ;
   private boolean[] T013V15_n9429PMCod ;
   private String[] T013V15_A9473PMDsc ;
   private boolean[] T013V15_n9473PMDsc ;
   private java.util.Date[] T013V15_A9474PMFchCre ;
   private boolean[] T013V15_n9474PMFchCre ;
   private String[] T013V15_A9475PMUsuCre ;
   private boolean[] T013V15_n9475PMUsuCre ;
   private String[] T013V15_A9478PMEst ;
   private boolean[] T013V15_n9478PMEst ;
   private String[] T013V15_A9483PMTxt ;
   private boolean[] T013V15_n9483PMTxt ;
   private java.util.Date[] T013V15_A9484PMIni ;
   private boolean[] T013V15_n9484PMIni ;
   private java.util.Date[] T013V15_A9485PMFin ;
   private boolean[] T013V15_n9485PMFin ;
   private java.util.Date[] T013V15_A9486PMUlt ;
   private boolean[] T013V15_n9486PMUlt ;
   private java.math.BigDecimal[] T013V15_A11454PMUso ;
   private boolean[] T013V15_n11454PMUso ;
   private short[] T013V15_A9487PMDias ;
   private boolean[] T013V15_n9487PMDias ;
   private int[] T013V15_A9488PMOrd ;
   private boolean[] T013V15_n9488PMOrd ;
   private java.math.BigDecimal[] T013V15_A11455PMTie ;
   private String[] T013V15_A11456PMPla ;
   private java.math.BigDecimal[] T013V15_A13013PMUsoMts ;
   private boolean[] T013V15_n13013PMUsoMts ;
   private short[] T013V15_A14275PMDiasPavi ;
   private boolean[] T013V15_n14275PMDiasPavi ;
   private java.math.BigDecimal[] T013V15_A14274PMTieMto ;
   private boolean[] T013V15_n14274PMTieMto ;
   private String[] T013V15_A396EmprCod ;
   private String[] T013V15_A9476PMMaqCod ;
   private boolean[] T013V15_n9476PMMaqCod ;
   private short[] T013V15_A14271PMTipoID ;
   private String[] T013V24_A396EmprCod ;
   private int[] T013V24_A9429PMCod ;
   private boolean[] T013V24_n9429PMCod ;
   private String[] T013V25_A396EmprCod ;
   private int[] T013V25_A9429PMCod ;
   private boolean[] T013V25_n9429PMCod ;
   private int[] T013V14_A9429PMCod ;
   private boolean[] T013V14_n9429PMCod ;
   private String[] T013V14_A9473PMDsc ;
   private boolean[] T013V14_n9473PMDsc ;
   private java.util.Date[] T013V14_A9474PMFchCre ;
   private boolean[] T013V14_n9474PMFchCre ;
   private String[] T013V14_A9475PMUsuCre ;
   private boolean[] T013V14_n9475PMUsuCre ;
   private String[] T013V14_A9478PMEst ;
   private boolean[] T013V14_n9478PMEst ;
   private String[] T013V14_A9483PMTxt ;
   private boolean[] T013V14_n9483PMTxt ;
   private java.util.Date[] T013V14_A9484PMIni ;
   private boolean[] T013V14_n9484PMIni ;
   private java.util.Date[] T013V14_A9485PMFin ;
   private boolean[] T013V14_n9485PMFin ;
   private java.util.Date[] T013V14_A9486PMUlt ;
   private boolean[] T013V14_n9486PMUlt ;
   private java.math.BigDecimal[] T013V14_A11454PMUso ;
   private boolean[] T013V14_n11454PMUso ;
   private short[] T013V14_A9487PMDias ;
   private boolean[] T013V14_n9487PMDias ;
   private int[] T013V14_A9488PMOrd ;
   private boolean[] T013V14_n9488PMOrd ;
   private java.math.BigDecimal[] T013V14_A11455PMTie ;
   private String[] T013V14_A11456PMPla ;
   private java.math.BigDecimal[] T013V14_A13013PMUsoMts ;
   private boolean[] T013V14_n13013PMUsoMts ;
   private short[] T013V14_A14275PMDiasPavi ;
   private boolean[] T013V14_n14275PMDiasPavi ;
   private java.math.BigDecimal[] T013V14_A14274PMTieMto ;
   private boolean[] T013V14_n14274PMTieMto ;
   private String[] T013V14_A396EmprCod ;
   private String[] T013V14_A9476PMMaqCod ;
   private boolean[] T013V14_n9476PMMaqCod ;
   private short[] T013V14_A14271PMTipoID ;
   private String[] T013V29_A407EmprNom ;
   private boolean[] T013V29_n407EmprNom ;
   private String[] T013V30_A9477PMMaqDsc ;
   private boolean[] T013V30_n9477PMMaqDsc ;
   private String[] T013V31_A14272PMTipoDsc ;
   private String[] T013V32_A396EmprCod ;
   private int[] T013V32_A9429PMCod ;
   private boolean[] T013V32_n9429PMCod ;
   private int[] T013V32_A9479PMTCod ;
   private String[] T013V32_A12644TMPMMEquCo ;
   private String[] T013V32_A12645TMPMMSEqCo ;
   private String[] T013V32_A12646TMPMMPieCo ;
   private String[] T013V33_A396EmprCod ;
   private int[] T013V33_A9425OMCod ;
   private String[] T013V34_A396EmprCod ;
   private int[] T013V34_A9429PMCod ;
   private boolean[] T013V34_n9429PMCod ;
   private String[] T013V35_A9476PMMaqCod ;
   private boolean[] T013V35_n9476PMMaqCod ;
   private int[] T013V35_A9429PMCod ;
   private boolean[] T013V35_n9429PMCod ;
   private String[] T013V35_A12597PMMEquDsc ;
   private String[] T013V35_A12598PMMSEqDsc ;
   private String[] T013V35_A11453PMMPieDsc ;
   private boolean[] T013V35_n11453PMMPieDsc ;
   private String[] T013V35_A396EmprCod ;
   private String[] T013V35_A11450PMMEquCod ;
   private String[] T013V35_A11451PMMSEqCod ;
   private String[] T013V35_A11452PMMPieCod ;
   private String[] T013V13_A12597PMMEquDsc ;
   private String[] T013V13_A12598PMMSEqDsc ;
   private String[] T013V13_A11453PMMPieDsc ;
   private boolean[] T013V13_n11453PMMPieDsc ;
   private String[] T013V36_A12597PMMEquDsc ;
   private String[] T013V36_A12598PMMSEqDsc ;
   private String[] T013V36_A11453PMMPieDsc ;
   private boolean[] T013V36_n11453PMMPieDsc ;
   private String[] T013V37_A396EmprCod ;
   private int[] T013V37_A9429PMCod ;
   private boolean[] T013V37_n9429PMCod ;
   private String[] T013V37_A11450PMMEquCod ;
   private String[] T013V37_A11451PMMSEqCod ;
   private String[] T013V37_A11452PMMPieCod ;
   private int[] T013V12_A9429PMCod ;
   private boolean[] T013V12_n9429PMCod ;
   private String[] T013V12_A396EmprCod ;
   private String[] T013V12_A11450PMMEquCod ;
   private String[] T013V12_A11451PMMSEqCod ;
   private String[] T013V12_A11452PMMPieCod ;
   private int[] T013V11_A9429PMCod ;
   private boolean[] T013V11_n9429PMCod ;
   private String[] T013V11_A396EmprCod ;
   private String[] T013V11_A11450PMMEquCod ;
   private String[] T013V11_A11451PMMSEqCod ;
   private String[] T013V11_A11452PMMPieCod ;
   private String[] T013V40_A12597PMMEquDsc ;
   private String[] T013V40_A12598PMMSEqDsc ;
   private String[] T013V40_A11453PMMPieDsc ;
   private boolean[] T013V40_n11453PMMPieDsc ;
   private String[] T013V41_A396EmprCod ;
   private int[] T013V41_A9429PMCod ;
   private boolean[] T013V41_n9429PMCod ;
   private String[] T013V41_A11450PMMEquCod ;
   private String[] T013V41_A11451PMMSEqCod ;
   private String[] T013V41_A11452PMMPieCod ;
   private int[] T013V42_A9429PMCod ;
   private boolean[] T013V42_n9429PMCod ;
   private String[] T013V42_A9490PMRepNom ;
   private boolean[] T013V42_n9490PMRepNom ;
   private java.math.BigDecimal[] T013V42_A9491PMRRCnt ;
   private String[] T013V42_A396EmprCod ;
   private int[] T013V42_A9489PMRepCod ;
   private String[] T013V10_A9490PMRepNom ;
   private boolean[] T013V10_n9490PMRepNom ;
   private String[] T013V43_A9490PMRepNom ;
   private boolean[] T013V43_n9490PMRepNom ;
   private String[] T013V44_A396EmprCod ;
   private int[] T013V44_A9429PMCod ;
   private boolean[] T013V44_n9429PMCod ;
   private int[] T013V44_A9489PMRepCod ;
   private int[] T013V9_A9429PMCod ;
   private boolean[] T013V9_n9429PMCod ;
   private java.math.BigDecimal[] T013V9_A9491PMRRCnt ;
   private String[] T013V9_A396EmprCod ;
   private int[] T013V9_A9489PMRepCod ;
   private int[] T013V8_A9429PMCod ;
   private boolean[] T013V8_n9429PMCod ;
   private java.math.BigDecimal[] T013V8_A9491PMRRCnt ;
   private String[] T013V8_A396EmprCod ;
   private int[] T013V8_A9489PMRepCod ;
   private String[] T013V48_A9490PMRepNom ;
   private boolean[] T013V48_n9490PMRepNom ;
   private String[] T013V49_A396EmprCod ;
   private int[] T013V49_A9429PMCod ;
   private boolean[] T013V49_n9429PMCod ;
   private int[] T013V49_A9489PMRepCod ;
   private int[] T013V50_A9429PMCod ;
   private boolean[] T013V50_n9429PMCod ;
   private String[] T013V50_A9480PMTDsc ;
   private boolean[] T013V50_n9480PMTDsc ;
   private String[] T013V50_A396EmprCod ;
   private int[] T013V50_A9479PMTCod ;
   private String[] T013V7_A9480PMTDsc ;
   private boolean[] T013V7_n9480PMTDsc ;
   private String[] T013V51_A9480PMTDsc ;
   private boolean[] T013V51_n9480PMTDsc ;
   private String[] T013V52_A396EmprCod ;
   private int[] T013V52_A9429PMCod ;
   private boolean[] T013V52_n9429PMCod ;
   private int[] T013V52_A9479PMTCod ;
   private int[] T013V6_A9429PMCod ;
   private boolean[] T013V6_n9429PMCod ;
   private String[] T013V6_A396EmprCod ;
   private int[] T013V6_A9479PMTCod ;
   private int[] T013V5_A9429PMCod ;
   private boolean[] T013V5_n9429PMCod ;
   private String[] T013V5_A396EmprCod ;
   private int[] T013V5_A9479PMTCod ;
   private String[] T013V55_A9480PMTDsc ;
   private boolean[] T013V55_n9480PMTDsc ;
   private String[] T013V56_A396EmprCod ;
   private int[] T013V56_A9429PMCod ;
   private boolean[] T013V56_n9429PMCod ;
   private int[] T013V56_A9479PMTCod ;
   private String[] T013V56_A12644TMPMMEquCo ;
   private String[] T013V56_A12645TMPMMSEqCo ;
   private String[] T013V56_A12646TMPMMPieCo ;
   private String[] T013V57_A396EmprCod ;
   private int[] T013V57_A9429PMCod ;
   private boolean[] T013V57_n9429PMCod ;
   private int[] T013V57_A9479PMTCod ;
   private int[] T013V58_A9429PMCod ;
   private boolean[] T013V58_n9429PMCod ;
   private String[] T013V58_A9482PMOpeResN ;
   private boolean[] T013V58_n9482PMOpeResN ;
   private java.math.BigDecimal[] T013V58_A11457PMOpeTie ;
   private String[] T013V58_A396EmprCod ;
   private int[] T013V58_A9481PMOpeRes ;
   private String[] T013V59_A13748OpeCNom ;
   private String[] T013V59_A396EmprCod ;
   private int[] T013V59_A652OpeCod ;
   private String[] T013V4_A9482PMOpeResN ;
   private boolean[] T013V4_n9482PMOpeResN ;
   private String[] T013V60_A9482PMOpeResN ;
   private boolean[] T013V60_n9482PMOpeResN ;
   private String[] T013V61_A396EmprCod ;
   private int[] T013V61_A9429PMCod ;
   private boolean[] T013V61_n9429PMCod ;
   private int[] T013V61_A9481PMOpeRes ;
   private int[] T013V3_A9429PMCod ;
   private boolean[] T013V3_n9429PMCod ;
   private java.math.BigDecimal[] T013V3_A11457PMOpeTie ;
   private String[] T013V3_A396EmprCod ;
   private int[] T013V3_A9481PMOpeRes ;
   private int[] T013V2_A9429PMCod ;
   private boolean[] T013V2_n9429PMCod ;
   private java.math.BigDecimal[] T013V2_A11457PMOpeTie ;
   private String[] T013V2_A396EmprCod ;
   private int[] T013V2_A9481PMOpeRes ;
   private String[] T013V65_A9482PMOpeResN ;
   private boolean[] T013V65_n9482PMOpeResN ;
   private String[] T013V66_A396EmprCod ;
   private int[] T013V66_A9429PMCod ;
   private boolean[] T013V66_n9429PMCod ;
   private int[] T013V66_A9481PMOpeRes ;
   private String[] T013V67_A13748OpeCNom ;
   private String[] T013V68_A13748OpeCNom ;
   private String[] T013V68_A396EmprCod ;
   private int[] T013V68_A652OpeCod ;
   private String[] T013V69_A13748OpeCNom ;
   private String[] T013V69_A396EmprCod ;
   private int[] T013V69_A652OpeCod ;
   private String[] T013V70_A9482PMOpeResN ;
   private boolean[] T013V70_n9482PMOpeResN ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV32PMTipoID_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV22PMMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV29PMMEquCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV30PMMSEqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV31PMMPieCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV28PMTCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27PMRepCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV15WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV16TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tmpreve__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmpreve__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmpreve__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmpreve__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmpreve__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013V2", "SELECT PMCod, PMOpeTie, EmprCod, PMOpeRes FROM TXPMPrev1 WHERE EmprCod = ? AND PMCod = ? AND PMOpeRes = ?  FOR UPDATE OF PMOpeTie NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V3", "SELECT PMCod, PMOpeTie, EmprCod, PMOpeRes FROM TXPMPrev1 WHERE EmprCod = ? AND PMCod = ? AND PMOpeRes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V4", "SELECT OpeNom AS PMOpeResN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V5", "SELECT PMCod, EmprCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ?  FOR UPDATE OF PMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V6", "SELECT PMCod, EmprCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V7", "SELECT TMDsc AS PMTDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V8", "SELECT PMCod, PMRRCnt, EmprCod, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? AND PMCod = ? AND PMRepCod = ?  FOR UPDATE OF PMRRCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V9", "SELECT PMCod, PMRRCnt, EmprCod, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? AND PMCod = ? AND PMRepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V10", "SELECT MRNom AS PMRepNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V11", "SELECT PMCod, EmprCod, PMMEquCod, PMMSEqCod, PMMPieCod FROM TXPMPrev2 WHERE EmprCod = ? AND PMCod = ? AND PMMEquCod = ? AND PMMSEqCod = ? AND PMMPieCod = ?  FOR UPDATE OF PMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V12", "SELECT PMCod, EmprCod, PMMEquCod, PMMSEqCod, PMMPieCod FROM TXPMPrev2 WHERE EmprCod = ? AND PMCod = ? AND PMMEquCod = ? AND PMMSEqCod = ? AND PMMPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V13", "SELECT MaqEquDsc AS PMMEquDsc, MaqSEqDsc AS PMMSEqDsc, MaqPieDsc AS PMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V14", "SELECT PMCod, PMDsc, PMFchCre, PMUsuCre, PMEst, PMTxt, PMIni, PMFin, PMUlt, PMUso, PMDias, PMOrd, PMTie, PMPla, PMUsoMts, PMDiasPavi, PMTieMto, EmprCod, PMMaqCod, PMTipoID FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ?  FOR UPDATE OF PMDsc, PMFchCre, PMUsuCre, PMEst, PMTxt, PMIni, PMFin, PMUlt, PMUso, PMDias, PMOrd, PMTie, PMPla, PMUsoMts, PMDiasPavi, PMTieMto, PMMaqCod, PMTipoID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V15", "SELECT PMCod, PMDsc, PMFchCre, PMUsuCre, PMEst, PMTxt, PMIni, PMFin, PMUlt, PMUso, PMDias, PMOrd, PMTie, PMPla, PMUsoMts, PMDiasPavi, PMTieMto, EmprCod, PMMaqCod, PMTipoID FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V17", "SELECT MaqDsc AS PMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V18", "SELECT PMTipoDsc FROM TXPTIPPRV WHERE EmprCod = ? AND PMTipoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V19", "SELECT /*+ FIRST_ROWS(100) */ TM1.PMCod, T2.EmprNom, TM1.PMDsc, TM1.PMFchCre, TM1.PMUsuCre, T3.MaqDsc AS PMMaqDsc, TM1.PMEst, TM1.PMTxt, TM1.PMIni, TM1.PMFin, TM1.PMUlt, TM1.PMUso, TM1.PMDias, TM1.PMOrd, TM1.PMTie, TM1.PMPla, TM1.PMUsoMts, TM1.PMDiasPavi, T4.PMTipoDsc, TM1.PMTieMto, TM1.EmprCod, TM1.PMMaqCod AS PMMaqCod, TM1.PMTipoID FROM (((TXPMPREVE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.PMMaqCod) INNER JOIN TXPTIPPRV T4 ON T4.EmprCod = TM1.EmprCod AND T4.PMTipoID = TM1.PMTipoID) WHERE TM1.EmprCod = ? and TM1.PMCod = ? ORDER BY TM1.EmprCod, TM1.PMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V21", "SELECT MaqDsc AS PMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V22", "SELECT PMTipoDsc FROM TXPTIPPRV WHERE EmprCod = ? AND PMTipoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V23", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PMCod FROM TXPMPREVE WHERE ( EmprCod > ? or EmprCod = ? and PMCod > ?) ORDER BY EmprCod, PMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013V25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PMCod FROM TXPMPREVE WHERE ( EmprCod < ? or EmprCod = ? and PMCod < ?) ORDER BY EmprCod DESC, PMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013V26", "INSERT INTO TXPMPREVE(PMCod, PMDsc, PMFchCre, PMUsuCre, PMEst, PMTxt, PMIni, PMFin, PMUlt, PMUso, PMDias, PMOrd, PMTie, PMPla, PMUsoMts, PMDiasPavi, PMTieMto, EmprCod, PMMaqCod, PMTipoID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMPREVE")
         ,new UpdateCursor("T013V27", "UPDATE TXPMPREVE SET PMDsc=?, PMFchCre=?, PMUsuCre=?, PMEst=?, PMTxt=?, PMIni=?, PMFin=?, PMUlt=?, PMUso=?, PMDias=?, PMOrd=?, PMTie=?, PMPla=?, PMUsoMts=?, PMDiasPavi=?, PMTieMto=?, PMMaqCod=?, PMTipoID=?  WHERE EmprCod = ? AND PMCod = ?", GX_NOMASK, "TXPMPREVE")
         ,new UpdateCursor("T013V28", "DELETE FROM TXPMPREVE  WHERE EmprCod = ? AND PMCod = ?", GX_NOMASK, "TXPMPREVE")
         ,new ForEachCursor("T013V29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V30", "SELECT MaqDsc AS PMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V31", "SELECT PMTipoDsc FROM TXPTIPPRV WHERE EmprCod = ? AND PMTipoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V32", "SELECT * FROM (SELECT EmprCod, PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo FROM TXPMPrevI WHERE EmprCod = ? AND PMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013V33", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND PMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013V34", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PMCod FROM TXPMPREVE ORDER BY EmprCod, PMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V35", "SELECT T2.MaqCod AS PMMaqCod, T1.PMCod, T2.MaqEquDsc AS PMMEquDsc, T2.MaqSEqDsc AS PMMSEqDsc, T2.MaqPieDsc AS PMMPieDsc, T1.EmprCod, T1.PMMEquCod AS PMMEquCod, T1.PMMSEqCod AS PMMSEqCod, T1.PMMPieCod AS PMMPieCod FROM (TXPMPrev2 T1 LEFT JOIN TXPMaqPie T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = ? AND T2.MaqEquCod = T1.PMMEquCod AND T2.MaqSEqCod = T1.PMMSEqCod AND T2.MaqPieCod = T1.PMMPieCod) WHERE T1.EmprCod = ? and T1.PMCod = ? and T1.PMMEquCod = ? and T1.PMMSEqCod = ? and T1.PMMPieCod = ? ORDER BY T1.EmprCod, T1.PMCod, T1.PMMEquCod, T1.PMMSEqCod, T1.PMMPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V36", "SELECT MaqEquDsc AS PMMEquDsc, MaqSEqDsc AS PMMSEqDsc, MaqPieDsc AS PMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V37", "SELECT EmprCod, PMCod, PMMEquCod, PMMSEqCod, PMMPieCod FROM TXPMPrev2 WHERE EmprCod = ? AND PMCod = ? AND PMMEquCod = ? AND PMMSEqCod = ? AND PMMPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013V38", "INSERT INTO TXPMPrev2(PMCod, EmprCod, PMMEquCod, PMMSEqCod, PMMPieCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMPrev2")
         ,new UpdateCursor("T013V39", "DELETE FROM TXPMPrev2  WHERE EmprCod = ? AND PMCod = ? AND PMMEquCod = ? AND PMMSEqCod = ? AND PMMPieCod = ?", GX_NOMASK, "TXPMPrev2")
         ,new ForEachCursor("T013V40", "SELECT MaqEquDsc AS PMMEquDsc, MaqSEqDsc AS PMMSEqDsc, MaqPieDsc AS PMMPieDsc FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V41", "SELECT EmprCod, PMCod, PMMEquCod, PMMSEqCod, PMMPieCod FROM TXPMPrev2 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMMEquCod, PMMSEqCod, PMMPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V42", "SELECT T1.PMCod, T2.MRNom AS PMRepNom, T1.PMRRCnt, T1.EmprCod, T1.PMRepCod AS PMRepCod FROM (TXPMPreRe T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.PMRepCod) WHERE T1.EmprCod = ? and T1.PMCod = ? and T1.PMRepCod = ? ORDER BY T1.EmprCod, T1.PMCod, T1.PMRepCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V43", "SELECT MRNom AS PMRepNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V44", "SELECT EmprCod, PMCod, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? AND PMCod = ? AND PMRepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013V45", "INSERT INTO TXPMPreRe(PMCod, PMRRCnt, EmprCod, PMRepCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMPreRe")
         ,new UpdateCursor("T013V46", "UPDATE TXPMPreRe SET PMRRCnt=?  WHERE EmprCod = ? AND PMCod = ? AND PMRepCod = ?", GX_NOMASK, "TXPMPreRe")
         ,new UpdateCursor("T013V47", "DELETE FROM TXPMPreRe  WHERE EmprCod = ? AND PMCod = ? AND PMRepCod = ?", GX_NOMASK, "TXPMPreRe")
         ,new ForEachCursor("T013V48", "SELECT MRNom AS PMRepNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V49", "SELECT EmprCod, PMCod, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMRepCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V50", "SELECT T1.PMCod, T2.TMDsc AS PMTDsc, T1.EmprCod, T1.PMTCod AS PMTCod FROM (TXPMPrev3 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.PMTCod) WHERE T1.EmprCod = ? and T1.PMCod = ? and T1.PMTCod = ? ORDER BY T1.EmprCod, T1.PMCod, T1.PMTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V51", "SELECT TMDsc AS PMTDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V52", "SELECT EmprCod, PMCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013V53", "INSERT INTO TXPMPrev3(PMCod, EmprCod, PMTCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMPrev3")
         ,new UpdateCursor("T013V54", "DELETE FROM TXPMPrev3  WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ?", GX_NOMASK, "TXPMPrev3")
         ,new ForEachCursor("T013V55", "SELECT TMDsc AS PMTDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V56", "SELECT * FROM (SELECT EmprCod, PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo FROM TXPMPrevI WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013V57", "SELECT EmprCod, PMCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V58", "SELECT T1.PMCod, T2.OpeNom AS PMOpeResN, T1.PMOpeTie, T1.EmprCod, T1.PMOpeRes AS PMOpeRes FROM (TXPMPrev1 T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.PMOpeRes) WHERE T1.EmprCod = ? and T1.PMCod = ? and T1.PMOpeRes = ? ORDER BY T1.EmprCod, T1.PMCod, T1.PMOpeRes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V59", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V60", "SELECT OpeNom AS PMOpeResN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V61", "SELECT EmprCod, PMCod, PMOpeRes FROM TXPMPrev1 WHERE EmprCod = ? AND PMCod = ? AND PMOpeRes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013V62", "INSERT INTO TXPMPrev1(PMCod, PMOpeTie, EmprCod, PMOpeRes) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMPrev1")
         ,new UpdateCursor("T013V63", "UPDATE TXPMPrev1 SET PMOpeTie=?  WHERE EmprCod = ? AND PMCod = ? AND PMOpeRes = ?", GX_NOMASK, "TXPMPrev1")
         ,new UpdateCursor("T013V64", "DELETE FROM TXPMPrev1  WHERE EmprCod = ? AND PMCod = ? AND PMOpeRes = ?", GX_NOMASK, "TXPMPrev1")
         ,new ForEachCursor("T013V65", "SELECT OpeNom AS PMOpeResN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V66", "SELECT EmprCod, PMCod, PMOpeRes FROM TXPMPrev1 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMOpeRes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V67", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V68", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V69", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013V70", "SELECT OpeNom AS PMOpeResN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 3);
               ((String[]) buf[32])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 3);
               ((String[]) buf[32])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[28])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 30);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 3);
               ((String[]) buf[37])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(23);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
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
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 40 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 48 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 56 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
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
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               return;
            case 12 :
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
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 2000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               stmt.setString(14, (String)parms[25], 1);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[31], 2);
               }
               stmt.setString(18, (String)parms[32], 3);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[34], 6);
               }
               stmt.setShort(20, ((Number) parms[35]).shortValue());
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
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 2000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               stmt.setString(13, (String)parms[23], 1);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 6);
               }
               stmt.setShort(18, ((Number) parms[32]).shortValue());
               stmt.setString(19, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[35]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
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
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setString(4, (String)parms[5], 10);
               stmt.setString(5, (String)parms[6], 10);
               stmt.setString(6, (String)parms[7], 10);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
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
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
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
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 44 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 61 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 64 :
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
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 66 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 67 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

