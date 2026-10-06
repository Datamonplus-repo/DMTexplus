package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqui1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel18"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa86571OS65( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"") == 0 )
      {
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
         gxasa80561OS65( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel22"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa36011OS65( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel24"+"_"+"") == 0 )
      {
         AV109EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa64331OS65( AV109EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel25"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel26"+"_"+"") == 0 )
      {
         AV109EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa64321OS65( AV109EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel27"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel28"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa54631OS65( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel29"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel30"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa10271OS65( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel31"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel32"+"_"+"") == 0 )
      {
         AV109EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa52921OS65( AV109EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel33"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel34"+"_"+"") == 0 )
      {
         AV109EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa55931OS65( AV109EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel35"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel36"+"_"+"") == 0 )
      {
         AV109EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa36001OS65( AV109EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel37"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel38"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa6051OS65( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel39"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel40"+"_"+"") == 0 )
      {
         AV109EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa131801OS65( AV109EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel41"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel42"+"_"+"") == 0 )
      {
         AV109EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa131791OS65( AV109EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel43"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel44"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel45"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel46"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_68") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1011TipMaqCod = httpContext.GetPar( "TipMaqCod") ;
         n1011TipMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_68( A396EmprCod, A1011TipMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_69") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11726MaqOgtId = httpContext.GetPar( "MaqOgtId") ;
         n11726MaqOgtId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_69( A396EmprCod, A11726MaqOgtId) ;
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
            AV109EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
            AV118MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCod", AV118MaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118MaqCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO MAQUINAS Basico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqCod_Internalname ;
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
      nRC_GXsfl_379 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_379"))) ;
      nGXsfl_379_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_379_idx"))) ;
      sGXsfl_379_idx = httpContext.GetPar( "sGXsfl_379_idx") ;
      A622MaqUltLin = (byte)(GXutil.lval( httpContext.GetPar( "MaqUltLin"))) ;
      n622MaqUltLin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public tmaqui1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqui1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqui1_impl.class ));
   }

   public tmaqui1_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMaqTip = new HTMLChoice();
      cmbMaqEst = new HTMLChoice();
      cmbMaqChp = new HTMLChoice();
      cmbMaqCodBan = new HTMLChoice();
      cmbMaqDosifP = new HTMLChoice();
      cmbMaqSalM = new HTMLChoice();
      cmbMaqPlnVis = new HTMLChoice();
      cmbMaqPln = new HTMLChoice();
      cmbMaqVaril = new HTMLChoice();
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
      if ( cmbMaqTip.getItemCount() > 0 )
      {
         A620MaqTip = cmbMaqTip.getValidValue(A620MaqTip) ;
         n620MaqTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A620MaqTip", A620MaqTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqTip.setValue( GXutil.rtrim( A620MaqTip) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqTip.getInternalname(), "Values", cmbMaqTip.ToJavascriptSource(), true);
      }
      if ( cmbMaqEst.getItemCount() > 0 )
      {
         A607MaqEst = cmbMaqEst.getValidValue(A607MaqEst) ;
         n607MaqEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A607MaqEst", A607MaqEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqEst.setValue( GXutil.rtrim( A607MaqEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqEst.getInternalname(), "Values", cmbMaqEst.ToJavascriptSource(), true);
      }
      if ( cmbMaqChp.getItemCount() > 0 )
      {
         A601MaqChp = cmbMaqChp.getValidValue(A601MaqChp) ;
         n601MaqChp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqChp.setValue( GXutil.rtrim( A601MaqChp) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqChp.getInternalname(), "Values", cmbMaqChp.ToJavascriptSource(), true);
      }
      if ( cmbMaqCodBan.getItemCount() > 0 )
      {
         A5292MaqCodBan = cmbMaqCodBan.getValidValue(A5292MaqCodBan) ;
         n5292MaqCodBan = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5292MaqCodBan", A5292MaqCodBan);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqCodBan.setValue( GXutil.rtrim( A5292MaqCodBan) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqCodBan.getInternalname(), "Values", cmbMaqCodBan.ToJavascriptSource(), true);
      }
      if ( cmbMaqDosifP.getItemCount() > 0 )
      {
         A5949MaqDosifP = cmbMaqDosifP.getValidValue(A5949MaqDosifP) ;
         n5949MaqDosifP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqDosifP.setValue( GXutil.rtrim( A5949MaqDosifP) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqDosifP.getInternalname(), "Values", cmbMaqDosifP.ToJavascriptSource(), true);
      }
      if ( cmbMaqSalM.getItemCount() > 0 )
      {
         A5419MaqSalM = cmbMaqSalM.getValidValue(A5419MaqSalM) ;
         n5419MaqSalM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqSalM.setValue( GXutil.rtrim( A5419MaqSalM) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqSalM.getInternalname(), "Values", cmbMaqSalM.ToJavascriptSource(), true);
      }
      if ( cmbMaqPlnVis.getItemCount() > 0 )
      {
         A6433MaqPlnVis = (byte)(GXutil.lval( cmbMaqPlnVis.getValidValue(GXutil.trim( GXutil.str( A6433MaqPlnVis, 1, 0))))) ;
         n6433MaqPlnVis = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6433MaqPlnVis", GXutil.str( A6433MaqPlnVis, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqPlnVis.setValue( GXutil.trim( GXutil.str( A6433MaqPlnVis, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqPlnVis.getInternalname(), "Values", cmbMaqPlnVis.ToJavascriptSource(), true);
      }
      if ( cmbMaqPln.getItemCount() > 0 )
      {
         A6432MaqPln = (byte)(GXutil.lval( cmbMaqPln.getValidValue(GXutil.trim( GXutil.str( A6432MaqPln, 1, 0))))) ;
         n6432MaqPln = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6432MaqPln", GXutil.str( A6432MaqPln, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqPln.setValue( GXutil.trim( GXutil.str( A6432MaqPln, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqPln.getInternalname(), "Values", cmbMaqPln.ToJavascriptSource(), true);
      }
      if ( cmbMaqVaril.getItemCount() > 0 )
      {
         A8056MaqVaril = cmbMaqVaril.getValidValue(A8056MaqVaril) ;
         n8056MaqVaril = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqVaril.setValue( GXutil.rtrim( A8056MaqVaril) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqVaril.getInternalname(), "Values", cmbMaqVaril.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDscLarg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqDscLarg_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDscLarg_Internalname, GXutil.rtrim( A14288MaqDscLarg), GXutil.rtrim( localUtil.format( A14288MaqDscLarg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDscLarg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqDscLarg_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucGxuitabspanel_tabs1.setProperty("PageCount", Gxuitabspanel_tabs1_Pagecount);
      ucGxuitabspanel_tabs1.setProperty("Class", Gxuitabspanel_tabs1_Class);
      ucGxuitabspanel_tabs1.setProperty("HistoryManagement", Gxuitabspanel_tabs1_Historymanagement);
      ucGxuitabspanel_tabs1.render(context, "tab", Gxuitabspanel_tabs1_Internalname, "GXUITABSPANEL_TABS1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title1"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Datos Generales", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQUI1.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "Tab01") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCap_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCap_Internalname, httpContext.getMessage( "Capacidad Dia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCap_Internalname, GXutil.ltrim( localUtil.ntoc( A600MaqCap, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCap_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A600MaqCap), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A600MaqCap), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCap_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCap_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqcosmin_cell_Internalname, 1, 0, "px", 0, "px", divMaqcosmin_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqCosMin_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCosMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCosMin_Internalname, httpContext.getMessage( "Cotes p/minuto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCosMin_Internalname, GXutil.ltrim( localUtil.ntoc( A605MaqCosMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCosMin_Enabled!=0) ? localUtil.format( A605MaqCosMin, "ZZZZ9.9999") : localUtil.format( A605MaqCosMin, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCosMin_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqCosMin_Visible, edtMaqCosMin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqcoskg_cell_Internalname, 1, 0, "px", 0, "px", divMaqcoskg_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqCosKg_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCosKg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCosKg_Internalname, httpContext.getMessage( "Coste Kilo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCosKg_Internalname, GXutil.ltrim( localUtil.ntoc( A13180MaqCosKg, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCosKg_Enabled!=0) ? localUtil.format( A13180MaqCosKg, "ZZZZ9.9999") : localUtil.format( A13180MaqCosKg, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCosKg_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqCosKg_Visible, edtMaqCosKg_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqcosfijo_cell_Internalname, 1, 0, "px", 0, "px", divMaqcosfijo_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqCosFijo_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCosFijo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCosFijo_Internalname, httpContext.getMessage( "Coste Fijo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCosFijo_Internalname, GXutil.ltrim( localUtil.ntoc( A13179MaqCosFijo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCosFijo_Enabled!=0) ? localUtil.format( A13179MaqCosFijo, "ZZZZ9.9999") : localUtil.format( A13179MaqCosFijo, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCosFijo_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqCosFijo_Visible, edtMaqCosFijo_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup12_Internalname, httpContext.getMessage( "Horas Productivas", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TMAQUI1.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable11_Internalname, tblUnnamedtable11_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqhorpro_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqhorpro_Internalname, httpContext.getMessage( "Horas", ""), "", "", lblTextblockmaqhorpro_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqHorPro_Internalname, httpContext.getMessage( "Horas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHorPro_Internalname, GXutil.ltrim( localUtil.ntoc( A612MaqHorPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqHorPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A612MaqHorPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A612MaqHorPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHorPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqHorPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqminpro_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqminpro_Internalname, httpContext.getMessage( "Minutos", ""), "", "", lblTextblockmaqminpro_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqMinPro_Internalname, httpContext.getMessage( "Minutos", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A615MaqMinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A615MaqMinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A615MaqMinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMinPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqMinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqTip.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqTip.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqTip, cmbMaqTip.getInternalname(), GXutil.rtrim( A620MaqTip), 1, cmbMaqTip.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMaqTip.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqTip.setValue( GXutil.rtrim( A620MaqTip) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqTip.getInternalname(), "Values", cmbMaqTip.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqEst, cmbMaqEst.getInternalname(), GXutil.rtrim( A607MaqEst), 1, cmbMaqEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMaqEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqEst.setValue( GXutil.rtrim( A607MaqEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqEst.getInternalname(), "Values", cmbMaqEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipmaqcod_Internalname, httpContext.getMessage( "Tipo de Máquina", ""), "", "", lblTextblocktipmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_tipmaqcod.setProperty("Caption", Combo_tipmaqcod_Caption);
      ucCombo_tipmaqcod.setProperty("Cls", Combo_tipmaqcod_Cls);
      ucCombo_tipmaqcod.setProperty("EmptyItemText", Combo_tipmaqcod_Emptyitemtext);
      ucCombo_tipmaqcod.setProperty("DropDownOptionsData", AV121TipMaqCod_Data);
      ucCombo_tipmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipmaqcod_Internalname, "COMBO_TIPMAQCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipMaqCod_Internalname, httpContext.getMessage( "Tipo de Máquina", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMaqCod_Internalname, GXutil.rtrim( A1011TipMaqCod), GXutil.rtrim( localUtil.format( A1011TipMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTipMaqCod_Visible, edtTipMaqCod_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTemMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTemMax_Internalname, httpContext.getMessage( "Temperatura Maxima", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTemMax_Internalname, GXutil.ltrim( localUtil.ntoc( A618MaqTemMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTemMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A618MaqTemMax), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A618MaqTemMax), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTemMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqTemMax_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title2"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Datos Máquina", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQUI1.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "Tab02") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableresultado2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_paneldatos.setProperty("Width", Dvpanel_paneldatos_Width);
      ucDvpanel_paneldatos.setProperty("AutoWidth", Dvpanel_paneldatos_Autowidth);
      ucDvpanel_paneldatos.setProperty("AutoHeight", Dvpanel_paneldatos_Autoheight);
      ucDvpanel_paneldatos.setProperty("Cls", Dvpanel_paneldatos_Cls);
      ucDvpanel_paneldatos.setProperty("Title", Dvpanel_paneldatos_Title);
      ucDvpanel_paneldatos.setProperty("Collapsible", Dvpanel_paneldatos_Collapsible);
      ucDvpanel_paneldatos.setProperty("Collapsed", Dvpanel_paneldatos_Collapsed);
      ucDvpanel_paneldatos.setProperty("ShowCollapseIcon", Dvpanel_paneldatos_Showcollapseicon);
      ucDvpanel_paneldatos.setProperty("IconPosition", Dvpanel_paneldatos_Iconposition);
      ucDvpanel_paneldatos.setProperty("AutoScroll", Dvpanel_paneldatos_Autoscroll);
      ucDvpanel_paneldatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_paneldatos_Internalname, "DVPANEL_PANELDATOSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELDATOSContainer"+"PanelDatos"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPaneldatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqChp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqChp.getInternalname(), httpContext.getMessage( "Acoplada?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqChp, cmbMaqChp.getInternalname(), GXutil.rtrim( A601MaqChp), 1, cmbMaqChp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMaqChp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqChp.setValue( GXutil.rtrim( A601MaqChp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqChp.getInternalname(), "Values", cmbMaqChp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqNroTub_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqNroTub_Internalname, httpContext.getMessage( "Nro de Tubos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqNroTub_Internalname, GXutil.ltrim( localUtil.ntoc( A3598MaqNroTub, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqNroTub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3598MaqNroTub), "9") : localUtil.format( DecimalUtil.doubleToDec(A3598MaqNroTub), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqNroTub_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqNroTub_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqogtid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqogtid_Internalname, httpContext.getMessage( "Maq. Orgatex", ""), "", "", lblTextblockmaqogtid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_maqogtid.setProperty("Caption", Combo_maqogtid_Caption);
      ucCombo_maqogtid.setProperty("Cls", Combo_maqogtid_Cls);
      ucCombo_maqogtid.setProperty("EmptyItem", Combo_maqogtid_Emptyitem);
      ucCombo_maqogtid.setProperty("DropDownOptionsData", AV124MaqOgtId_Data);
      ucCombo_maqogtid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqogtid_Internalname, "COMBO_MAQOGTIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqOgtId_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqOgtId_Internalname, GXutil.rtrim( A11726MaqOgtId), GXutil.rtrim( localUtil.format( A11726MaqOgtId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqOgtId_Jsonclick, 0, "Attribute", "", "", "", "", edtMaqOgtId_Visible, edtMaqOgtId_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqMOD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqMOD_Internalname, httpContext.getMessage( "MOD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMOD_Internalname, GXutil.ltrim( localUtil.ntoc( A11821MaqMOD, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMOD_Enabled!=0) ? localUtil.format( A11821MaqMOD, "ZZZZ9.9999") : localUtil.format( A11821MaqMOD, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMOD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqMOD_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqMOI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqMOI_Internalname, httpContext.getMessage( "MOI", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMOI_Internalname, GXutil.ltrim( localUtil.ntoc( A11822MaqMOI, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMOI_Enabled!=0) ? localUtil.format( A11822MaqMOI, "ZZZZ9.9999") : localUtil.format( A11822MaqMOI, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMOI_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqMOI_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqEnerg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqEnerg_Internalname, httpContext.getMessage( "Energia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqEnerg_Internalname, GXutil.ltrim( localUtil.ntoc( A11823MaqEnerg, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqEnerg_Enabled!=0) ? localUtil.format( A11823MaqEnerg, "ZZZZ9.9999") : localUtil.format( A11823MaqEnerg, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqEnerg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqEnerg_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqGas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqGas_Internalname, httpContext.getMessage( "Gas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqGas_Internalname, GXutil.ltrim( localUtil.ntoc( A11824MaqGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqGas_Enabled!=0) ? localUtil.format( A11824MaqGas, "ZZZZ9.9999") : localUtil.format( A11824MaqGas, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqGas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqGas_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqAgua_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqAgua_Internalname, httpContext.getMessage( "Agua", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqAgua_Internalname, GXutil.ltrim( localUtil.ntoc( A11825MaqAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqAgua_Enabled!=0) ? localUtil.format( A11825MaqAgua, "ZZZZ9.9999") : localUtil.format( A11825MaqAgua, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqAgua_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqAgua_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCosMm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCosMm_Internalname, httpContext.getMessage( "Total", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCosMm_Internalname, GXutil.ltrim( localUtil.ntoc( A12123MaqCosMm, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCosMm_Enabled!=0) ? localUtil.format( A12123MaqCosMm, "ZZZZ9.9999") : localUtil.format( A12123MaqCosMm, "ZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCosMm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCosMm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      ucDvpanel_panelcapacidades.setProperty("Width", Dvpanel_panelcapacidades_Width);
      ucDvpanel_panelcapacidades.setProperty("AutoWidth", Dvpanel_panelcapacidades_Autowidth);
      ucDvpanel_panelcapacidades.setProperty("AutoHeight", Dvpanel_panelcapacidades_Autoheight);
      ucDvpanel_panelcapacidades.setProperty("Cls", Dvpanel_panelcapacidades_Cls);
      ucDvpanel_panelcapacidades.setProperty("Title", Dvpanel_panelcapacidades_Title);
      ucDvpanel_panelcapacidades.setProperty("Collapsible", Dvpanel_panelcapacidades_Collapsible);
      ucDvpanel_panelcapacidades.setProperty("Collapsed", Dvpanel_panelcapacidades_Collapsed);
      ucDvpanel_panelcapacidades.setProperty("ShowCollapseIcon", Dvpanel_panelcapacidades_Showcollapseicon);
      ucDvpanel_panelcapacidades.setProperty("IconPosition", Dvpanel_panelcapacidades_Iconposition);
      ucDvpanel_panelcapacidades.setProperty("AutoScroll", Dvpanel_panelcapacidades_Autoscroll);
      ucDvpanel_panelcapacidades.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelcapacidades_Internalname, "DVPANEL_PANELCAPACIDADESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELCAPACIDADESContainer"+"PanelCapacidades"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPanelcapacidades_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Volumen", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TMAQUI1.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqVolMax_Internalname, httpContext.getMessage( "Maximo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMax_Internalname, GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolMax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqVolMed_Internalname, httpContext.getMessage( "Medio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMed_Internalname, GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,198);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolMed_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqVolMin_Internalname, httpContext.getMessage( "Minimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMin_Internalname, GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,202);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolMin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqRelBan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqRelBan_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqRelBan_Internalname, GXutil.ltrim( localUtil.ntoc( A3599MaqRelBan, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqRelBan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3599MaqRelBan), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3599MaqRelBan), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqRelBan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqRelBan_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Peso", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TMAQUI1.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqKgsMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqKgsMax_Internalname, httpContext.getMessage( "Maximo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMax_Internalname, GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMax_Enabled!=0) ? localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99") : localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqKgsMax_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqKgsMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqKgsMed_Internalname, httpContext.getMessage( "Medio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMed_Internalname, GXutil.ltrim( localUtil.ntoc( A4284MaqKgsMed, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMed_Enabled!=0) ? localUtil.format( A4284MaqKgsMed, "ZZZZZ9.99") : localUtil.format( A4284MaqKgsMed, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqKgsMed_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqKgsMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqKgsMin_Internalname, httpContext.getMessage( "Minimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMin_Internalname, GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMin_Enabled!=0) ? localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99") : localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,223);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqKgsMin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTinTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTinTip_Internalname, httpContext.getMessage( "Tipo Maq.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTinTip_Internalname, GXutil.rtrim( A619MaqTinTip), GXutil.rtrim( localUtil.format( A619MaqTinTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTinTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqTinTip_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqVolRes_Internalname, httpContext.getMessage( "Volumen Residual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 238,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolRes_Internalname, GXutil.ltrim( localUtil.ntoc( A2801MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolRes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2801MaqVolRes), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2801MaqVolRes), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,238);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolRes_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolTop_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqVolTop_Internalname, httpContext.getMessage( "Volumen Tope", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 242,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolTop_Internalname, GXutil.ltrim( localUtil.ntoc( A2802MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolTop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2802MaqVolTop), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2802MaqVolTop), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,242);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolTop_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolTop_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqvolbal_cell_Internalname, 1, 0, "px", 0, "px", divMaqvolbal_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqVolBal_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolBal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqVolBal_Internalname, httpContext.getMessage( "Vol Lavado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 247,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolBal_Internalname, GXutil.ltrim( localUtil.ntoc( A3600MaqVolBal, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolBal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3600MaqVolBal), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3600MaqVolBal), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,247);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolBal_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqVolBal_Visible, edtMaqVolBal_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      ucDvpanel_panelcentralizacion.setProperty("Width", Dvpanel_panelcentralizacion_Width);
      ucDvpanel_panelcentralizacion.setProperty("AutoWidth", Dvpanel_panelcentralizacion_Autowidth);
      ucDvpanel_panelcentralizacion.setProperty("AutoHeight", Dvpanel_panelcentralizacion_Autoheight);
      ucDvpanel_panelcentralizacion.setProperty("Cls", Dvpanel_panelcentralizacion_Cls);
      ucDvpanel_panelcentralizacion.setProperty("Title", Dvpanel_panelcentralizacion_Title);
      ucDvpanel_panelcentralizacion.setProperty("Collapsible", Dvpanel_panelcentralizacion_Collapsible);
      ucDvpanel_panelcentralizacion.setProperty("Collapsed", Dvpanel_panelcentralizacion_Collapsed);
      ucDvpanel_panelcentralizacion.setProperty("ShowCollapseIcon", Dvpanel_panelcentralizacion_Showcollapseicon);
      ucDvpanel_panelcentralizacion.setProperty("IconPosition", Dvpanel_panelcentralizacion_Iconposition);
      ucDvpanel_panelcentralizacion.setProperty("AutoScroll", Dvpanel_panelcentralizacion_Autoscroll);
      ucDvpanel_panelcentralizacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelcentralizacion_Internalname, "DVPANEL_PANELCENTRALIZACIONContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELCENTRALIZACIONContainer"+"PanelCentralizacion"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPanelcentralizacion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqMicro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqMicro_Internalname, httpContext.getMessage( "Nº Micro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 257,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMicro_Internalname, GXutil.ltrim( localUtil.ntoc( A2391MaqMicro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMicro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2391MaqMicro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2391MaqMicro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,257);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMicro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqMicro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqcodban_cell_Internalname, 1, 0, "px", 0, "px", divMaqcodban_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbMaqCodBan.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqCodBan.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqCodBan.getInternalname(), " ", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqCodBan, cmbMaqCodBan.getInternalname(), GXutil.rtrim( A5292MaqCodBan), 1, cmbMaqCodBan.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbMaqCodBan.getVisible(), cmbMaqCodBan.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqCodBan.setValue( GXutil.rtrim( A5292MaqCodBan) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqCodBan.getInternalname(), "Values", cmbMaqCodBan.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqtipcen_cell_Internalname, 1, 0, "px", 0, "px", divMaqtipcen_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqTipCen_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipCen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTipCen_Internalname, httpContext.getMessage( "Tipo Central.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipCen_Internalname, GXutil.rtrim( A5593MaqTipCen), GXutil.rtrim( localUtil.format( A5593MaqTipCen, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipCen_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqTipCen_Visible, edtMaqTipCen_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqDosifP.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqDosifP.getInternalname(), httpContext.getMessage( "Dosifica Productos Aut?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqDosifP, cmbMaqDosifP.getInternalname(), GXutil.rtrim( A5949MaqDosifP), 1, cmbMaqDosifP.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMaqDosifP.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,270);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqDosifP.setValue( GXutil.rtrim( A5949MaqDosifP) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqDosifP.getInternalname(), "Values", cmbMaqDosifP.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCodFor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCodFor_Internalname, httpContext.getMessage( "Maquina Auxiliar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 275,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodFor_Internalname, GXutil.rtrim( A604MaqCodFor), GXutil.rtrim( localUtil.format( A604MaqCodFor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,275);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodFor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCodFor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCuerdas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCuerdas_Internalname, httpContext.getMessage( "Cuerdas N", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCuerdas_Internalname, GXutil.ltrim( localUtil.ntoc( A14289MaqCuerdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCuerdas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14289MaqCuerdas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14289MaqCuerdas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCuerdas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCuerdas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_panelsalmuera_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_panelsalmuera_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_panelsalmuera.setProperty("Width", Dvpanel_panelsalmuera_Width);
      ucDvpanel_panelsalmuera.setProperty("AutoWidth", Dvpanel_panelsalmuera_Autowidth);
      ucDvpanel_panelsalmuera.setProperty("AutoHeight", Dvpanel_panelsalmuera_Autoheight);
      ucDvpanel_panelsalmuera.setProperty("Cls", Dvpanel_panelsalmuera_Cls);
      ucDvpanel_panelsalmuera.setProperty("Title", Dvpanel_panelsalmuera_Title);
      ucDvpanel_panelsalmuera.setProperty("Collapsible", Dvpanel_panelsalmuera_Collapsible);
      ucDvpanel_panelsalmuera.setProperty("Collapsed", Dvpanel_panelsalmuera_Collapsed);
      ucDvpanel_panelsalmuera.setProperty("ShowCollapseIcon", Dvpanel_panelsalmuera_Showcollapseicon);
      ucDvpanel_panelsalmuera.setProperty("IconPosition", Dvpanel_panelsalmuera_Iconposition);
      ucDvpanel_panelsalmuera.setProperty("AutoScroll", Dvpanel_panelsalmuera_Autoscroll);
      ucDvpanel_panelsalmuera.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelsalmuera_Internalname, "DVPANEL_PANELSALMUERAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELSALMUERAContainer"+"PanelSalMuera"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPanelsalmuera_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqSalM.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqSalM.getInternalname(), httpContext.getMessage( "Sal Muera?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqSalM, cmbMaqSalM.getInternalname(), GXutil.rtrim( A5419MaqSalM), 1, cmbMaqSalM.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMaqSalM.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,289);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqSalM.setValue( GXutil.rtrim( A5419MaqSalM) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqSalM.getInternalname(), "Values", cmbMaqSalM.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqSalMKi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqSalMKi_Internalname, httpContext.getMessage( "Cantidad Inicial Sal Muera (K)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqSalMKi_Internalname, GXutil.ltrim( localUtil.ntoc( A5420MaqSalMKi, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqSalMKi_Enabled!=0) ? localUtil.format( A5420MaqSalMKi, "ZZZZZZ9.999") : localUtil.format( A5420MaqSalMKi, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqSalMKi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqSalMKi_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqSalMKf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqSalMKf_Internalname, httpContext.getMessage( "Cantidad Final Sal M (K)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqSalMKf_Internalname, GXutil.ltrim( localUtil.ntoc( A5421MaqSalMKf, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqSalMKf_Enabled!=0) ? localUtil.format( A5421MaqSalMKf, "ZZZZZZ9.999") : localUtil.format( A5421MaqSalMKf, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,299);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqSalMKf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqSalMKf_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDteCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqDteCol_Internalname, httpContext.getMessage( "Descuento Envio de colorantes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDteCol_Internalname, GXutil.ltrim( localUtil.ntoc( A5950MaqDteCol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqDteCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5950MaqDteCol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5950MaqDteCol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDteCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqDteCol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      ucDvpanel_paneltiempos.setProperty("Width", Dvpanel_paneltiempos_Width);
      ucDvpanel_paneltiempos.setProperty("AutoWidth", Dvpanel_paneltiempos_Autowidth);
      ucDvpanel_paneltiempos.setProperty("AutoHeight", Dvpanel_paneltiempos_Autoheight);
      ucDvpanel_paneltiempos.setProperty("Cls", Dvpanel_paneltiempos_Cls);
      ucDvpanel_paneltiempos.setProperty("Title", Dvpanel_paneltiempos_Title);
      ucDvpanel_paneltiempos.setProperty("Collapsible", Dvpanel_paneltiempos_Collapsible);
      ucDvpanel_paneltiempos.setProperty("Collapsed", Dvpanel_paneltiempos_Collapsed);
      ucDvpanel_paneltiempos.setProperty("ShowCollapseIcon", Dvpanel_paneltiempos_Showcollapseicon);
      ucDvpanel_paneltiempos.setProperty("IconPosition", Dvpanel_paneltiempos_Iconposition);
      ucDvpanel_paneltiempos.setProperty("AutoScroll", Dvpanel_paneltiempos_Autoscroll);
      ucDvpanel_paneltiempos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_paneltiempos_Internalname, "DVPANEL_PANELTIEMPOSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELTIEMPOSContainer"+"PanelTiempos"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPaneltiempos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTmCarg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTmCarg_Internalname, httpContext.getMessage( "Carga", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTmCarg_Internalname, GXutil.ltrim( localUtil.ntoc( A13020MaqTmCarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTmCarg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13020MaqTmCarg), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13020MaqTmCarg), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTmCarg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqTmCarg_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTmDcarg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTmDcarg_Internalname, httpContext.getMessage( "Descarga", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 318,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTmDcarg_Internalname, GXutil.ltrim( localUtil.ntoc( A13021MaqTmDcarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTmDcarg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13021MaqTmDcarg), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13021MaqTmDcarg), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,318);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTmDcarg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqTmDcarg_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      ucDvpanel_panelfactabs_planificacion.setProperty("Width", Dvpanel_panelfactabs_planificacion_Width);
      ucDvpanel_panelfactabs_planificacion.setProperty("AutoWidth", Dvpanel_panelfactabs_planificacion_Autowidth);
      ucDvpanel_panelfactabs_planificacion.setProperty("AutoHeight", Dvpanel_panelfactabs_planificacion_Autoheight);
      ucDvpanel_panelfactabs_planificacion.setProperty("Cls", Dvpanel_panelfactabs_planificacion_Cls);
      ucDvpanel_panelfactabs_planificacion.setProperty("Title", Dvpanel_panelfactabs_planificacion_Title);
      ucDvpanel_panelfactabs_planificacion.setProperty("Collapsible", Dvpanel_panelfactabs_planificacion_Collapsible);
      ucDvpanel_panelfactabs_planificacion.setProperty("Collapsed", Dvpanel_panelfactabs_planificacion_Collapsed);
      ucDvpanel_panelfactabs_planificacion.setProperty("ShowCollapseIcon", Dvpanel_panelfactabs_planificacion_Showcollapseicon);
      ucDvpanel_panelfactabs_planificacion.setProperty("IconPosition", Dvpanel_panelfactabs_planificacion_Iconposition);
      ucDvpanel_panelfactabs_planificacion.setProperty("AutoScroll", Dvpanel_panelfactabs_planificacion_Autoscroll);
      ucDvpanel_panelfactabs_planificacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelfactabs_planificacion_Internalname, "DVPANEL_PANELFACTABS_PLANIFICACIONContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELFACTABS_PLANIFICACIONContainer"+"PanelFactAbs_Planificacion"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPanelfactabs_planificacion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqplnvis_cell_Internalname, 1, 0, "px", 0, "px", divMaqplnvis_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbMaqPlnVis.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqPlnVis.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqPlnVis.getInternalname(), httpContext.getMessage( "Visible en Planning", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 328,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqPlnVis, cmbMaqPlnVis.getInternalname(), GXutil.trim( GXutil.str( A6433MaqPlnVis, 1, 0)), 1, cmbMaqPlnVis.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbMaqPlnVis.getVisible(), cmbMaqPlnVis.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,328);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqPlnVis.setValue( GXutil.trim( GXutil.str( A6433MaqPlnVis, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPlnVis.getInternalname(), "Values", cmbMaqPlnVis.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqpln_cell_Internalname, 1, 0, "px", 0, "px", divMaqpln_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbMaqPln.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqPln.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqPln.getInternalname(), httpContext.getMessage( "Cargar en Planning?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 332,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqPln, cmbMaqPln.getInternalname(), GXutil.trim( GXutil.str( A6432MaqPln, 1, 0)), 1, cmbMaqPln.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbMaqPln.getVisible(), cmbMaqPln.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,332);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqPln.setValue( GXutil.trim( GXutil.str( A6432MaqPln, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPln.getInternalname(), "Values", cmbMaqPln.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqFacAbs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqFacAbs_Internalname, httpContext.getMessage( "Factor Absorcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 337,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqFacAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A6284MaqFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqFacAbs_Enabled!=0) ? localUtil.format( A6284MaqFacAbs, "ZZ9.99") : localUtil.format( A6284MaqFacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,337);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqFacAbs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqFacAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqFabsHm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqFabsHm_Internalname, httpContext.getMessage( "Fac Abs Humedo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqFabsHm_Internalname, GXutil.ltrim( localUtil.ntoc( A9982MaqFabsHm, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqFabsHm_Enabled!=0) ? localUtil.format( A9982MaqFabsHm, "ZZ9.99") : localUtil.format( A9982MaqFabsHm, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqFabsHm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqFabsHm_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqcantcor_cell_Internalname, 1, 0, "px", 0, "px", divMaqcantcor_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqCantCor_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCantCor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCantCor_Internalname, httpContext.getMessage( "Cantidad Maxima Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCantCor_Internalname, GXutil.ltrim( localUtil.ntoc( A5463MaqCantCor, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCantCor_Enabled!=0) ? localUtil.format( A5463MaqCantCor, "ZZZZZZ9.999") : localUtil.format( A5463MaqCantCor, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,346);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCantCor_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqCantCor_Visible, edtMaqCantCor_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqhhcon_cell_Internalname, 1, 0, "px", 0, "px", divMaqhhcon_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqHhCon_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqHhCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqHhCon_Internalname, httpContext.getMessage( "Horas Contador Tacometro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 350,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHhCon_Internalname, GXutil.ltrim( localUtil.ntoc( A1027MaqHhCon, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqHhCon_Enabled!=0) ? localUtil.format( A1027MaqHhCon, "ZZZZZZ9.99") : localUtil.format( A1027MaqHhCon, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,350);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHhCon_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqHhCon_Visible, edtMaqHhCon_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_paneltipomaquina_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_paneltipomaquina_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_paneltipomaquina.setProperty("Width", Dvpanel_paneltipomaquina_Width);
      ucDvpanel_paneltipomaquina.setProperty("AutoWidth", Dvpanel_paneltipomaquina_Autowidth);
      ucDvpanel_paneltipomaquina.setProperty("AutoHeight", Dvpanel_paneltipomaquina_Autoheight);
      ucDvpanel_paneltipomaquina.setProperty("Cls", Dvpanel_paneltipomaquina_Cls);
      ucDvpanel_paneltipomaquina.setProperty("Title", Dvpanel_paneltipomaquina_Title);
      ucDvpanel_paneltipomaquina.setProperty("Collapsible", Dvpanel_paneltipomaquina_Collapsible);
      ucDvpanel_paneltipomaquina.setProperty("Collapsed", Dvpanel_paneltipomaquina_Collapsed);
      ucDvpanel_paneltipomaquina.setProperty("ShowCollapseIcon", Dvpanel_paneltipomaquina_Showcollapseicon);
      ucDvpanel_paneltipomaquina.setProperty("IconPosition", Dvpanel_paneltipomaquina_Iconposition);
      ucDvpanel_paneltipomaquina.setProperty("AutoScroll", Dvpanel_paneltipomaquina_Autoscroll);
      ucDvpanel_paneltipomaquina.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_paneltipomaquina_Internalname, "DVPANEL_PANELTIPOMAQUINAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELTIPOMAQUINAContainer"+"PanelTipoMaquina"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPaneltipomaquina_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqloc_cell_Internalname, 1, 0, "px", 0, "px", divMaqloc_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqLoc_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqLoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 360,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqLoc_Internalname, GXutil.rtrim( A8657MaqLoc), GXutil.rtrim( localUtil.format( A8657MaqLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,360);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqLoc_Visible, edtMaqLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqvaril_cell_Internalname, 1, 0, "px", 0, "px", divMaqvaril_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbMaqVaril.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqVaril.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqVaril.getInternalname(), httpContext.getMessage( "Varilla (S,N)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 364,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqVaril, cmbMaqVaril.getInternalname(), GXutil.rtrim( A8056MaqVaril), 1, cmbMaqVaril.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbMaqVaril.getVisible(), cmbMaqVaril.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,364);\"", "", true, (byte)(0), "HLP_TMAQUI1.htm");
      cmbMaqVaril.setValue( GXutil.rtrim( A8056MaqVaril) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqVaril.getInternalname(), "Values", cmbMaqVaril.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divMaqtipmaq_cell_Internalname, 1, 0, "px", 0, "px", divMaqtipmaq_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMaqTipMaq_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTipMaq_Internalname, httpContext.getMessage( "Tipo Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 368,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipMaq_Internalname, GXutil.rtrim( A3601MaqTipMaq), GXutil.rtrim( localUtil.format( A3601MaqTipMaq, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,368);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipMaq_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMaqTipMaq_Visible, edtMaqTipMaq_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_panelobservaciones.setProperty("Width", Dvpanel_panelobservaciones_Width);
      ucDvpanel_panelobservaciones.setProperty("AutoWidth", Dvpanel_panelobservaciones_Autowidth);
      ucDvpanel_panelobservaciones.setProperty("AutoHeight", Dvpanel_panelobservaciones_Autoheight);
      ucDvpanel_panelobservaciones.setProperty("Cls", Dvpanel_panelobservaciones_Cls);
      ucDvpanel_panelobservaciones.setProperty("Title", Dvpanel_panelobservaciones_Title);
      ucDvpanel_panelobservaciones.setProperty("Collapsible", Dvpanel_panelobservaciones_Collapsible);
      ucDvpanel_panelobservaciones.setProperty("Collapsed", Dvpanel_panelobservaciones_Collapsed);
      ucDvpanel_panelobservaciones.setProperty("ShowCollapseIcon", Dvpanel_panelobservaciones_Showcollapseicon);
      ucDvpanel_panelobservaciones.setProperty("IconPosition", Dvpanel_panelobservaciones_Iconposition);
      ucDvpanel_panelobservaciones.setProperty("AutoScroll", Dvpanel_panelobservaciones_Autoscroll);
      ucDvpanel_panelobservaciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelobservaciones_Internalname, "DVPANEL_PANELOBSERVACIONESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELOBSERVACIONESContainer"+"PanelObservaciones"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPanelobservaciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 388,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 390,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV127Pgmname), GXutil.rtrim( localUtil.format( AV127Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_tipmaqcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotipmaqcod_Internalname, GXutil.rtrim( AV123ComboTipMaqCod), GXutil.rtrim( localUtil.format( AV123ComboTipMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombotipmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotipmaqcod_Visible, edtavCombotipmaqcod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_maqogtid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombomaqogtid_Internalname, GXutil.rtrim( AV125ComboMaqOgtId), GXutil.rtrim( localUtil.format( AV125ComboMaqOgtId, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombomaqogtid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombomaqogtid_Visible, edtavCombomaqogtid_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1.htm");
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
      startgridcontrol379( ) ;
      nGXsfl_379_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount68 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_68 = (short)(1) ;
            scanStart1OS68( ) ;
            while ( RcdFound68 != 0 )
            {
               init_level_properties68( ) ;
               getByPrimaryKey1OS68( ) ;
               addRow1OS68( ) ;
               scanNext1OS68( ) ;
            }
            scanEnd1OS68( ) ;
            nBlankRcdCount68 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B622MaqUltLin = A622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
         standaloneNotModal1OS68( ) ;
         standaloneModal1OS68( ) ;
         sMode68 = Gx_mode ;
         while ( nGXsfl_379_idx < nRC_GXsfl_379 )
         {
            bGXsfl_379_Refreshing = true ;
            readRow1OS68( ) ;
            edtDesTecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DESTECLIN_"+sGXsfl_379_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDesTecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDesTecLin_Enabled), 5, 0), !bGXsfl_379_Refreshing);
            edtMaqLinTex_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQLINTEX_"+sGXsfl_379_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqLinTex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqLinTex_Enabled), 5, 0), !bGXsfl_379_Refreshing);
            if ( ( nRcdExists_68 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OS68( ) ;
            }
            sendRow1OS68( ) ;
            bGXsfl_379_Refreshing = false ;
         }
         Gx_mode = sMode68 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A622MaqUltLin = B622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount68 = (short)(5) ;
         nRcdExists_68 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OS68( ) ;
            while ( RcdFound68 != 0 )
            {
               sGXsfl_379_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_379_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_37968( ) ;
               init_level_properties68( ) ;
               standaloneNotModal1OS68( ) ;
               getByPrimaryKey1OS68( ) ;
               standaloneModal1OS68( ) ;
               addRow1OS68( ) ;
               scanNext1OS68( ) ;
            }
            scanEnd1OS68( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode68 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_379_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_379_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_37968( ) ;
         initAll1OS68( ) ;
         init_level_properties68( ) ;
         B622MaqUltLin = A622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
         nRcdExists_68 = (short)(0) ;
         nIsMod_68 = (short)(0) ;
         nRcdDeleted_68 = (short)(0) ;
         nBlankRcdCount68 = (short)(nBlankRcdUsr68+nBlankRcdCount68) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount68 > 0 )
         {
            standaloneNotModal1OS68( ) ;
            standaloneModal1OS68( ) ;
            addRow1OS68( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDesTecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount68 = (short)(nBlankRcdCount68-1) ;
         }
         Gx_mode = sMode68 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A622MaqUltLin = B622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
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
      e111OS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPMAQCOD_DATA"), AV121TipMaqCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQOGTID_DATA"), AV124MaqOgtId_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z3601MaqTipMaq = httpContext.cgiGet( "Z3601MaqTipMaq") ;
            Z606MaqDsc = httpContext.cgiGet( "Z606MaqDsc") ;
            Z14288MaqDscLarg = httpContext.cgiGet( "Z14288MaqDscLarg") ;
            Z600MaqCap = (int)(localUtil.ctol( httpContext.cgiGet( "Z600MaqCap"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z605MaqCosMin = localUtil.ctond( httpContext.cgiGet( "Z605MaqCosMin")) ;
            Z612MaqHorPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z612MaqHorPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z615MaqMinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z615MaqMinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z620MaqTip = httpContext.cgiGet( "Z620MaqTip") ;
            Z607MaqEst = httpContext.cgiGet( "Z607MaqEst") ;
            Z621MaqUltFec = httpContext.cgiGet( "Z621MaqUltFec") ;
            Z617MaqResDia = localUtil.ctond( httpContext.cgiGet( "Z617MaqResDia")) ;
            Z611MaqHorAsi = localUtil.ctond( httpContext.cgiGet( "Z611MaqHorAsi")) ;
            Z616MaqOrdSeq = (short)(localUtil.ctol( httpContext.cgiGet( "Z616MaqOrdSeq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z622MaqUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z622MaqUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4282MaqFormul = httpContext.cgiGet( "Z4282MaqFormul") ;
            Z4283MaqKgsMin = localUtil.ctond( httpContext.cgiGet( "Z4283MaqKgsMin")) ;
            Z4284MaqKgsMed = localUtil.ctond( httpContext.cgiGet( "Z4284MaqKgsMed")) ;
            Z4285MaqKgsMax = localUtil.ctond( httpContext.cgiGet( "Z4285MaqKgsMax")) ;
            Z4319MaqPrdMin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4319MaqPrdMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4320MaqPrdMed = (short)(localUtil.ctol( httpContext.cgiGet( "Z4320MaqPrdMed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4321MaqPrdMax = (short)(localUtil.ctol( httpContext.cgiGet( "Z4321MaqPrdMax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z623MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( "Z623MaqVolMax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z625MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( "Z625MaqVolMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z624MaqVolMed = (int)(localUtil.ctol( httpContext.cgiGet( "Z624MaqVolMed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2801MaqVolRes = (int)(localUtil.ctol( httpContext.cgiGet( "Z2801MaqVolRes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2802MaqVolTop = (int)(localUtil.ctol( httpContext.cgiGet( "Z2802MaqVolTop"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z618MaqTemMax = (short)(localUtil.ctol( httpContext.cgiGet( "Z618MaqTemMax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z601MaqChp = httpContext.cgiGet( "Z601MaqChp") ;
            Z619MaqTinTip = httpContext.cgiGet( "Z619MaqTinTip") ;
            Z2391MaqMicro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2391MaqMicro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3598MaqNroTub = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3598MaqNroTub"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5292MaqCodBan = httpContext.cgiGet( "Z5292MaqCodBan") ;
            Z5419MaqSalM = httpContext.cgiGet( "Z5419MaqSalM") ;
            Z5420MaqSalMKi = localUtil.ctond( httpContext.cgiGet( "Z5420MaqSalMKi")) ;
            Z5421MaqSalMKf = localUtil.ctond( httpContext.cgiGet( "Z5421MaqSalMKf")) ;
            Z5463MaqCantCor = localUtil.ctond( httpContext.cgiGet( "Z5463MaqCantCor")) ;
            Z5593MaqTipCen = httpContext.cgiGet( "Z5593MaqTipCen") ;
            Z5949MaqDosifP = httpContext.cgiGet( "Z5949MaqDosifP") ;
            Z5950MaqDteCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z5950MaqDteCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z604MaqCodFor = httpContext.cgiGet( "Z604MaqCodFor") ;
            Z6284MaqFacAbs = localUtil.ctond( httpContext.cgiGet( "Z6284MaqFacAbs")) ;
            Z6399MaqKgsId = localUtil.ctond( httpContext.cgiGet( "Z6399MaqKgsId")) ;
            Z6432MaqPln = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6432MaqPln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6433MaqPlnVis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6433MaqPlnVis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6454MaqConFas = (int)(localUtil.ctol( httpContext.cgiGet( "Z6454MaqConFas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8056MaqVaril = httpContext.cgiGet( "Z8056MaqVaril") ;
            Z3599MaqRelBan = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3599MaqRelBan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8657MaqLoc = httpContext.cgiGet( "Z8657MaqLoc") ;
            Z9626MaqObs = httpContext.cgiGet( "Z9626MaqObs") ;
            Z9982MaqFabsHm = localUtil.ctond( httpContext.cgiGet( "Z9982MaqFabsHm")) ;
            Z1027MaqHhCon = localUtil.ctond( httpContext.cgiGet( "Z1027MaqHhCon")) ;
            Z1026MaqHhCtr = httpContext.cgiGet( "Z1026MaqHhCtr") ;
            Z3600MaqVolBal = (int)(localUtil.ctol( httpContext.cgiGet( "Z3600MaqVolBal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3684MaqCosGen = localUtil.ctond( httpContext.cgiGet( "Z3684MaqCosGen")) ;
            Z11821MaqMOD = localUtil.ctond( httpContext.cgiGet( "Z11821MaqMOD")) ;
            Z11822MaqMOI = localUtil.ctond( httpContext.cgiGet( "Z11822MaqMOI")) ;
            Z11823MaqEnerg = localUtil.ctond( httpContext.cgiGet( "Z11823MaqEnerg")) ;
            Z11824MaqGas = localUtil.ctond( httpContext.cgiGet( "Z11824MaqGas")) ;
            Z11825MaqAgua = localUtil.ctond( httpContext.cgiGet( "Z11825MaqAgua")) ;
            Z13020MaqTmCarg = (short)(localUtil.ctol( httpContext.cgiGet( "Z13020MaqTmCarg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13021MaqTmDcarg = (short)(localUtil.ctol( httpContext.cgiGet( "Z13021MaqTmDcarg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13022MaqMtsMn = localUtil.ctond( httpContext.cgiGet( "Z13022MaqMtsMn")) ;
            Z13023MaqMtsMx = localUtil.ctond( httpContext.cgiGet( "Z13023MaqMtsMx")) ;
            Z13179MaqCosFijo = localUtil.ctond( httpContext.cgiGet( "Z13179MaqCosFijo")) ;
            Z13180MaqCosKg = localUtil.ctond( httpContext.cgiGet( "Z13180MaqCosKg")) ;
            Z14289MaqCuerdas = (short)(localUtil.ctol( httpContext.cgiGet( "Z14289MaqCuerdas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1011TipMaqCod = httpContext.cgiGet( "Z1011TipMaqCod") ;
            Z11726MaqOgtId = httpContext.cgiGet( "Z11726MaqOgtId") ;
            A621MaqUltFec = httpContext.cgiGet( "Z621MaqUltFec") ;
            n621MaqUltFec = false ;
            A617MaqResDia = localUtil.ctond( httpContext.cgiGet( "Z617MaqResDia")) ;
            n617MaqResDia = false ;
            A611MaqHorAsi = localUtil.ctond( httpContext.cgiGet( "Z611MaqHorAsi")) ;
            n611MaqHorAsi = false ;
            A616MaqOrdSeq = (short)(localUtil.ctol( httpContext.cgiGet( "Z616MaqOrdSeq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n616MaqOrdSeq = false ;
            A622MaqUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z622MaqUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n622MaqUltLin = false ;
            A4282MaqFormul = httpContext.cgiGet( "Z4282MaqFormul") ;
            n4282MaqFormul = false ;
            A4319MaqPrdMin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4319MaqPrdMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4319MaqPrdMin = false ;
            A4320MaqPrdMed = (short)(localUtil.ctol( httpContext.cgiGet( "Z4320MaqPrdMed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4320MaqPrdMed = false ;
            A4321MaqPrdMax = (short)(localUtil.ctol( httpContext.cgiGet( "Z4321MaqPrdMax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4321MaqPrdMax = false ;
            A6399MaqKgsId = localUtil.ctond( httpContext.cgiGet( "Z6399MaqKgsId")) ;
            n6399MaqKgsId = false ;
            A6454MaqConFas = (int)(localUtil.ctol( httpContext.cgiGet( "Z6454MaqConFas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6454MaqConFas = false ;
            A9626MaqObs = httpContext.cgiGet( "Z9626MaqObs") ;
            n9626MaqObs = false ;
            A1026MaqHhCtr = httpContext.cgiGet( "Z1026MaqHhCtr") ;
            n1026MaqHhCtr = false ;
            A3684MaqCosGen = localUtil.ctond( httpContext.cgiGet( "Z3684MaqCosGen")) ;
            n3684MaqCosGen = false ;
            A13022MaqMtsMn = localUtil.ctond( httpContext.cgiGet( "Z13022MaqMtsMn")) ;
            n13022MaqMtsMn = false ;
            A13023MaqMtsMx = localUtil.ctond( httpContext.cgiGet( "Z13023MaqMtsMx")) ;
            n13023MaqMtsMx = false ;
            O622MaqUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "O622MaqUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_379 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_379"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1011TipMaqCod = httpContext.cgiGet( "N1011TipMaqCod") ;
            N11726MaqOgtId = httpContext.cgiGet( "N11726MaqOgtId") ;
            A13734MaqCDsc = httpContext.cgiGet( "MAQCDSC") ;
            AV109EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV118MaqCod = httpContext.cgiGet( "vMAQCOD") ;
            AV114Insert_TipMaqCod = httpContext.cgiGet( "vINSERT_TIPMAQCOD") ;
            AV116Insert_MaqOgtId = httpContext.cgiGet( "vINSERT_MAQOGTID") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6454MaqConFas = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCONFAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1026MaqHhCtr = httpContext.cgiGet( "MAQHHCTR") ;
            A4282MaqFormul = httpContext.cgiGet( "MAQFORMUL") ;
            A621MaqUltFec = httpContext.cgiGet( "MAQULTFEC") ;
            A617MaqResDia = localUtil.ctond( httpContext.cgiGet( "MAQRESDIA")) ;
            A611MaqHorAsi = localUtil.ctond( httpContext.cgiGet( "MAQHORASI")) ;
            A616MaqOrdSeq = (short)(localUtil.ctol( httpContext.cgiGet( "MAQORDSEQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A622MaqUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "MAQULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4319MaqPrdMin = (short)(localUtil.ctol( httpContext.cgiGet( "MAQPRDMIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4320MaqPrdMed = (short)(localUtil.ctol( httpContext.cgiGet( "MAQPRDMED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4321MaqPrdMax = (short)(localUtil.ctol( httpContext.cgiGet( "MAQPRDMAX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6399MaqKgsId = localUtil.ctond( httpContext.cgiGet( "MAQKGSID")) ;
            A9626MaqObs = httpContext.cgiGet( "MAQOBS") ;
            A3684MaqCosGen = localUtil.ctond( httpContext.cgiGet( "MAQCOSGEN")) ;
            A13022MaqMtsMn = localUtil.ctond( httpContext.cgiGet( "MAQMTSMN")) ;
            A13023MaqMtsMx = localUtil.ctond( httpContext.cgiGet( "MAQMTSMX")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A1012TipMaqDsc = httpContext.cgiGet( "TIPMAQDSC") ;
            n1012TipMaqDsc = false ;
            A11727MaqOgtDsc = httpContext.cgiGet( "MAQOGTDSC") ;
            Combo_tipmaqcod_Objectcall = httpContext.cgiGet( "COMBO_TIPMAQCOD_Objectcall") ;
            Combo_tipmaqcod_Class = httpContext.cgiGet( "COMBO_TIPMAQCOD_Class") ;
            Combo_tipmaqcod_Icontype = httpContext.cgiGet( "COMBO_TIPMAQCOD_Icontype") ;
            Combo_tipmaqcod_Icon = httpContext.cgiGet( "COMBO_TIPMAQCOD_Icon") ;
            Combo_tipmaqcod_Caption = httpContext.cgiGet( "COMBO_TIPMAQCOD_Caption") ;
            Combo_tipmaqcod_Tooltip = httpContext.cgiGet( "COMBO_TIPMAQCOD_Tooltip") ;
            Combo_tipmaqcod_Cls = httpContext.cgiGet( "COMBO_TIPMAQCOD_Cls") ;
            Combo_tipmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPMAQCOD_Selectedvalue_set") ;
            Combo_tipmaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TIPMAQCOD_Selectedvalue_get") ;
            Combo_tipmaqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPMAQCOD_Selectedtext_set") ;
            Combo_tipmaqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TIPMAQCOD_Selectedtext_get") ;
            Combo_tipmaqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TIPMAQCOD_Gamoauthtoken") ;
            Combo_tipmaqcod_Ddointernalname = httpContext.cgiGet( "COMBO_TIPMAQCOD_Ddointernalname") ;
            Combo_tipmaqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TIPMAQCOD_Titlecontrolalign") ;
            Combo_tipmaqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TIPMAQCOD_Dropdownoptionstype") ;
            Combo_tipmaqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Enabled")) ;
            Combo_tipmaqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Visible")) ;
            Combo_tipmaqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TIPMAQCOD_Titlecontrolidtoreplace") ;
            Combo_tipmaqcod_Datalisttype = httpContext.cgiGet( "COMBO_TIPMAQCOD_Datalisttype") ;
            Combo_tipmaqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Allowmultipleselection")) ;
            Combo_tipmaqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TIPMAQCOD_Datalistfixedvalues") ;
            Combo_tipmaqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Isgriditem")) ;
            Combo_tipmaqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Hasdescription")) ;
            Combo_tipmaqcod_Datalistproc = httpContext.cgiGet( "COMBO_TIPMAQCOD_Datalistproc") ;
            Combo_tipmaqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TIPMAQCOD_Datalistprocparametersprefix") ;
            Combo_tipmaqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TIPMAQCOD_Remoteservicesparameters") ;
            Combo_tipmaqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TIPMAQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tipmaqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Includeonlyselectedoption")) ;
            Combo_tipmaqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Includeselectalloption")) ;
            Combo_tipmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Emptyitem")) ;
            Combo_tipmaqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Includeaddnewoption")) ;
            Combo_tipmaqcod_Htmltemplate = httpContext.cgiGet( "COMBO_TIPMAQCOD_Htmltemplate") ;
            Combo_tipmaqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TIPMAQCOD_Multiplevaluestype") ;
            Combo_tipmaqcod_Loadingdata = httpContext.cgiGet( "COMBO_TIPMAQCOD_Loadingdata") ;
            Combo_tipmaqcod_Noresultsfound = httpContext.cgiGet( "COMBO_TIPMAQCOD_Noresultsfound") ;
            Combo_tipmaqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPMAQCOD_Emptyitemtext") ;
            Combo_tipmaqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TIPMAQCOD_Onlyselectedvalues") ;
            Combo_tipmaqcod_Selectalltext = httpContext.cgiGet( "COMBO_TIPMAQCOD_Selectalltext") ;
            Combo_tipmaqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TIPMAQCOD_Multiplevaluesseparator") ;
            Combo_tipmaqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TIPMAQCOD_Addnewoptiontext") ;
            Combo_maqogtid_Objectcall = httpContext.cgiGet( "COMBO_MAQOGTID_Objectcall") ;
            Combo_maqogtid_Class = httpContext.cgiGet( "COMBO_MAQOGTID_Class") ;
            Combo_maqogtid_Icontype = httpContext.cgiGet( "COMBO_MAQOGTID_Icontype") ;
            Combo_maqogtid_Icon = httpContext.cgiGet( "COMBO_MAQOGTID_Icon") ;
            Combo_maqogtid_Caption = httpContext.cgiGet( "COMBO_MAQOGTID_Caption") ;
            Combo_maqogtid_Tooltip = httpContext.cgiGet( "COMBO_MAQOGTID_Tooltip") ;
            Combo_maqogtid_Cls = httpContext.cgiGet( "COMBO_MAQOGTID_Cls") ;
            Combo_maqogtid_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQOGTID_Selectedvalue_set") ;
            Combo_maqogtid_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQOGTID_Selectedvalue_get") ;
            Combo_maqogtid_Selectedtext_set = httpContext.cgiGet( "COMBO_MAQOGTID_Selectedtext_set") ;
            Combo_maqogtid_Selectedtext_get = httpContext.cgiGet( "COMBO_MAQOGTID_Selectedtext_get") ;
            Combo_maqogtid_Gamoauthtoken = httpContext.cgiGet( "COMBO_MAQOGTID_Gamoauthtoken") ;
            Combo_maqogtid_Ddointernalname = httpContext.cgiGet( "COMBO_MAQOGTID_Ddointernalname") ;
            Combo_maqogtid_Titlecontrolalign = httpContext.cgiGet( "COMBO_MAQOGTID_Titlecontrolalign") ;
            Combo_maqogtid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MAQOGTID_Dropdownoptionstype") ;
            Combo_maqogtid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Enabled")) ;
            Combo_maqogtid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Visible")) ;
            Combo_maqogtid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MAQOGTID_Titlecontrolidtoreplace") ;
            Combo_maqogtid_Datalisttype = httpContext.cgiGet( "COMBO_MAQOGTID_Datalisttype") ;
            Combo_maqogtid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Allowmultipleselection")) ;
            Combo_maqogtid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MAQOGTID_Datalistfixedvalues") ;
            Combo_maqogtid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Isgriditem")) ;
            Combo_maqogtid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Hasdescription")) ;
            Combo_maqogtid_Datalistproc = httpContext.cgiGet( "COMBO_MAQOGTID_Datalistproc") ;
            Combo_maqogtid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MAQOGTID_Datalistprocparametersprefix") ;
            Combo_maqogtid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MAQOGTID_Remoteservicesparameters") ;
            Combo_maqogtid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MAQOGTID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_maqogtid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Includeonlyselectedoption")) ;
            Combo_maqogtid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Includeselectalloption")) ;
            Combo_maqogtid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Emptyitem")) ;
            Combo_maqogtid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQOGTID_Includeaddnewoption")) ;
            Combo_maqogtid_Htmltemplate = httpContext.cgiGet( "COMBO_MAQOGTID_Htmltemplate") ;
            Combo_maqogtid_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQOGTID_Multiplevaluestype") ;
            Combo_maqogtid_Loadingdata = httpContext.cgiGet( "COMBO_MAQOGTID_Loadingdata") ;
            Combo_maqogtid_Noresultsfound = httpContext.cgiGet( "COMBO_MAQOGTID_Noresultsfound") ;
            Combo_maqogtid_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQOGTID_Emptyitemtext") ;
            Combo_maqogtid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MAQOGTID_Onlyselectedvalues") ;
            Combo_maqogtid_Selectalltext = httpContext.cgiGet( "COMBO_MAQOGTID_Selectalltext") ;
            Combo_maqogtid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MAQOGTID_Multiplevaluesseparator") ;
            Combo_maqogtid_Addnewoptiontext = httpContext.cgiGet( "COMBO_MAQOGTID_Addnewoptiontext") ;
            Dvpanel_paneldatos_Objectcall = httpContext.cgiGet( "DVPANEL_PANELDATOS_Objectcall") ;
            Dvpanel_paneldatos_Class = httpContext.cgiGet( "DVPANEL_PANELDATOS_Class") ;
            Dvpanel_paneldatos_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Enabled")) ;
            Dvpanel_paneldatos_Width = httpContext.cgiGet( "DVPANEL_PANELDATOS_Width") ;
            Dvpanel_paneldatos_Height = httpContext.cgiGet( "DVPANEL_PANELDATOS_Height") ;
            Dvpanel_paneldatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Autowidth")) ;
            Dvpanel_paneldatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Autoheight")) ;
            Dvpanel_paneldatos_Cls = httpContext.cgiGet( "DVPANEL_PANELDATOS_Cls") ;
            Dvpanel_paneldatos_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Showheader")) ;
            Dvpanel_paneldatos_Title = httpContext.cgiGet( "DVPANEL_PANELDATOS_Title") ;
            Dvpanel_paneldatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Collapsible")) ;
            Dvpanel_paneldatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Collapsed")) ;
            Dvpanel_paneldatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Showcollapseicon")) ;
            Dvpanel_paneldatos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELDATOS_Iconposition") ;
            Dvpanel_paneldatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Autoscroll")) ;
            Dvpanel_paneldatos_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Visible")) ;
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
            Dvpanel_panelcapacidades_Objectcall = httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Objectcall") ;
            Dvpanel_panelcapacidades_Class = httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Class") ;
            Dvpanel_panelcapacidades_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Enabled")) ;
            Dvpanel_panelcapacidades_Width = httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Width") ;
            Dvpanel_panelcapacidades_Height = httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Height") ;
            Dvpanel_panelcapacidades_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Autowidth")) ;
            Dvpanel_panelcapacidades_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Autoheight")) ;
            Dvpanel_panelcapacidades_Cls = httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Cls") ;
            Dvpanel_panelcapacidades_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Showheader")) ;
            Dvpanel_panelcapacidades_Title = httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Title") ;
            Dvpanel_panelcapacidades_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Collapsible")) ;
            Dvpanel_panelcapacidades_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Collapsed")) ;
            Dvpanel_panelcapacidades_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Showcollapseicon")) ;
            Dvpanel_panelcapacidades_Iconposition = httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Iconposition") ;
            Dvpanel_panelcapacidades_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Autoscroll")) ;
            Dvpanel_panelcapacidades_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCAPACIDADES_Visible")) ;
            Dvpanel_panelcentralizacion_Objectcall = httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Objectcall") ;
            Dvpanel_panelcentralizacion_Class = httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Class") ;
            Dvpanel_panelcentralizacion_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Enabled")) ;
            Dvpanel_panelcentralizacion_Width = httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Width") ;
            Dvpanel_panelcentralizacion_Height = httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Height") ;
            Dvpanel_panelcentralizacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Autowidth")) ;
            Dvpanel_panelcentralizacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Autoheight")) ;
            Dvpanel_panelcentralizacion_Cls = httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Cls") ;
            Dvpanel_panelcentralizacion_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Showheader")) ;
            Dvpanel_panelcentralizacion_Title = httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Title") ;
            Dvpanel_panelcentralizacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Collapsible")) ;
            Dvpanel_panelcentralizacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Collapsed")) ;
            Dvpanel_panelcentralizacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Showcollapseicon")) ;
            Dvpanel_panelcentralizacion_Iconposition = httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Iconposition") ;
            Dvpanel_panelcentralizacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Autoscroll")) ;
            Dvpanel_panelcentralizacion_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCENTRALIZACION_Visible")) ;
            Dvpanel_panelsalmuera_Objectcall = httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Objectcall") ;
            Dvpanel_panelsalmuera_Class = httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Class") ;
            Dvpanel_panelsalmuera_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Enabled")) ;
            Dvpanel_panelsalmuera_Width = httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Width") ;
            Dvpanel_panelsalmuera_Height = httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Height") ;
            Dvpanel_panelsalmuera_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Autowidth")) ;
            Dvpanel_panelsalmuera_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Autoheight")) ;
            Dvpanel_panelsalmuera_Cls = httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Cls") ;
            Dvpanel_panelsalmuera_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Showheader")) ;
            Dvpanel_panelsalmuera_Title = httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Title") ;
            Dvpanel_panelsalmuera_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Collapsible")) ;
            Dvpanel_panelsalmuera_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Collapsed")) ;
            Dvpanel_panelsalmuera_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Showcollapseicon")) ;
            Dvpanel_panelsalmuera_Iconposition = httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Iconposition") ;
            Dvpanel_panelsalmuera_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Autoscroll")) ;
            Dvpanel_panelsalmuera_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSALMUERA_Visible")) ;
            Dvpanel_paneltiempos_Objectcall = httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Objectcall") ;
            Dvpanel_paneltiempos_Class = httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Class") ;
            Dvpanel_paneltiempos_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Enabled")) ;
            Dvpanel_paneltiempos_Width = httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Width") ;
            Dvpanel_paneltiempos_Height = httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Height") ;
            Dvpanel_paneltiempos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Autowidth")) ;
            Dvpanel_paneltiempos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Autoheight")) ;
            Dvpanel_paneltiempos_Cls = httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Cls") ;
            Dvpanel_paneltiempos_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Showheader")) ;
            Dvpanel_paneltiempos_Title = httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Title") ;
            Dvpanel_paneltiempos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Collapsible")) ;
            Dvpanel_paneltiempos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Collapsed")) ;
            Dvpanel_paneltiempos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Showcollapseicon")) ;
            Dvpanel_paneltiempos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Iconposition") ;
            Dvpanel_paneltiempos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Autoscroll")) ;
            Dvpanel_paneltiempos_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIEMPOS_Visible")) ;
            Dvpanel_panelfactabs_planificacion_Objectcall = httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Objectcall") ;
            Dvpanel_panelfactabs_planificacion_Class = httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Class") ;
            Dvpanel_panelfactabs_planificacion_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Enabled")) ;
            Dvpanel_panelfactabs_planificacion_Width = httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Width") ;
            Dvpanel_panelfactabs_planificacion_Height = httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Height") ;
            Dvpanel_panelfactabs_planificacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Autowidth")) ;
            Dvpanel_panelfactabs_planificacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Autoheight")) ;
            Dvpanel_panelfactabs_planificacion_Cls = httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Cls") ;
            Dvpanel_panelfactabs_planificacion_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Showheader")) ;
            Dvpanel_panelfactabs_planificacion_Title = httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Title") ;
            Dvpanel_panelfactabs_planificacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Collapsible")) ;
            Dvpanel_panelfactabs_planificacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Collapsed")) ;
            Dvpanel_panelfactabs_planificacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Showcollapseicon")) ;
            Dvpanel_panelfactabs_planificacion_Iconposition = httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Iconposition") ;
            Dvpanel_panelfactabs_planificacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Autoscroll")) ;
            Dvpanel_panelfactabs_planificacion_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFACTABS_PLANIFICACION_Visible")) ;
            Dvpanel_paneltipomaquina_Objectcall = httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Objectcall") ;
            Dvpanel_paneltipomaquina_Class = httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Class") ;
            Dvpanel_paneltipomaquina_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Enabled")) ;
            Dvpanel_paneltipomaquina_Width = httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Width") ;
            Dvpanel_paneltipomaquina_Height = httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Height") ;
            Dvpanel_paneltipomaquina_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Autowidth")) ;
            Dvpanel_paneltipomaquina_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Autoheight")) ;
            Dvpanel_paneltipomaquina_Cls = httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Cls") ;
            Dvpanel_paneltipomaquina_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Showheader")) ;
            Dvpanel_paneltipomaquina_Title = httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Title") ;
            Dvpanel_paneltipomaquina_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Collapsible")) ;
            Dvpanel_paneltipomaquina_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Collapsed")) ;
            Dvpanel_paneltipomaquina_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Showcollapseicon")) ;
            Dvpanel_paneltipomaquina_Iconposition = httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Iconposition") ;
            Dvpanel_paneltipomaquina_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Autoscroll")) ;
            Dvpanel_paneltipomaquina_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELTIPOMAQUINA_Visible")) ;
            Gxuitabspanel_tabs1_Objectcall = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Objectcall") ;
            Gxuitabspanel_tabs1_Enabled = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Enabled")) ;
            Gxuitabspanel_tabs1_Activepage = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Activepage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs1_Activepagecontrolname = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Activepagecontrolname") ;
            Gxuitabspanel_tabs1_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs1_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Class") ;
            Gxuitabspanel_tabs1_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Historymanagement")) ;
            Gxuitabspanel_tabs1_Visible = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Visible")) ;
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
            Dvpanel_panelobservaciones_Objectcall = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Objectcall") ;
            Dvpanel_panelobservaciones_Class = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Class") ;
            Dvpanel_panelobservaciones_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Enabled")) ;
            Dvpanel_panelobservaciones_Width = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Width") ;
            Dvpanel_panelobservaciones_Height = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Height") ;
            Dvpanel_panelobservaciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Autowidth")) ;
            Dvpanel_panelobservaciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Autoheight")) ;
            Dvpanel_panelobservaciones_Cls = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Cls") ;
            Dvpanel_panelobservaciones_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Showheader")) ;
            Dvpanel_panelobservaciones_Title = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Title") ;
            Dvpanel_panelobservaciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Collapsible")) ;
            Dvpanel_panelobservaciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Collapsed")) ;
            Dvpanel_panelobservaciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Showcollapseicon")) ;
            Dvpanel_panelobservaciones_Iconposition = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Iconposition") ;
            Dvpanel_panelobservaciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Autoscroll")) ;
            Dvpanel_panelobservaciones_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Visible")) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
            A14288MaqDscLarg = httpContext.cgiGet( edtMaqDscLarg_Internalname) ;
            n14288MaqDscLarg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14288MaqDscLarg", A14288MaqDscLarg);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQCAP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCap_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A600MaqCap = 0 ;
               n600MaqCap = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A600MaqCap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A600MaqCap), 6, 0));
            }
            else
            {
               A600MaqCap = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n600MaqCap = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A600MaqCap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A600MaqCap), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqCosMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqCosMin_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQCOSMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCosMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A605MaqCosMin = DecimalUtil.ZERO ;
               n605MaqCosMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A605MaqCosMin", GXutil.ltrimstr( A605MaqCosMin, 10, 4));
            }
            else
            {
               A605MaqCosMin = localUtil.ctond( httpContext.cgiGet( edtMaqCosMin_Internalname)) ;
               n605MaqCosMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A605MaqCosMin", GXutil.ltrimstr( A605MaqCosMin, 10, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqCosKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqCosKg_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQCOSKG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCosKg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13180MaqCosKg = DecimalUtil.ZERO ;
               n13180MaqCosKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13180MaqCosKg", GXutil.ltrimstr( A13180MaqCosKg, 10, 4));
            }
            else
            {
               A13180MaqCosKg = localUtil.ctond( httpContext.cgiGet( edtMaqCosKg_Internalname)) ;
               n13180MaqCosKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13180MaqCosKg", GXutil.ltrimstr( A13180MaqCosKg, 10, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqCosFijo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqCosFijo_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQCOSFIJO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCosFijo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13179MaqCosFijo = DecimalUtil.ZERO ;
               n13179MaqCosFijo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13179MaqCosFijo", GXutil.ltrimstr( A13179MaqCosFijo, 10, 4));
            }
            else
            {
               A13179MaqCosFijo = localUtil.ctond( httpContext.cgiGet( edtMaqCosFijo_Internalname)) ;
               n13179MaqCosFijo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13179MaqCosFijo", GXutil.ltrimstr( A13179MaqCosFijo, 10, 4));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHorPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHorPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQHORPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqHorPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A612MaqHorPro = (byte)(0) ;
               n612MaqHorPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A612MaqHorPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A612MaqHorPro), 2, 0));
            }
            else
            {
               A612MaqHorPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqHorPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n612MaqHorPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A612MaqHorPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A612MaqHorPro), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQMINPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqMinPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A615MaqMinPro = (byte)(0) ;
               n615MaqMinPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A615MaqMinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A615MaqMinPro), 2, 0));
            }
            else
            {
               A615MaqMinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n615MaqMinPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A615MaqMinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A615MaqMinPro), 2, 0));
            }
            cmbMaqTip.setName( cmbMaqTip.getInternalname() );
            cmbMaqTip.setValue( httpContext.cgiGet( cmbMaqTip.getInternalname()) );
            A620MaqTip = httpContext.cgiGet( cmbMaqTip.getInternalname()) ;
            n620MaqTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A620MaqTip", A620MaqTip);
            cmbMaqEst.setName( cmbMaqEst.getInternalname() );
            cmbMaqEst.setValue( httpContext.cgiGet( cmbMaqEst.getInternalname()) );
            A607MaqEst = httpContext.cgiGet( cmbMaqEst.getInternalname()) ;
            n607MaqEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A607MaqEst", A607MaqEst);
            A1011TipMaqCod = httpContext.cgiGet( edtTipMaqCod_Internalname) ;
            n1011TipMaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTemMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTemMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQTEMMAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqTemMax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A618MaqTemMax = (short)(0) ;
               n618MaqTemMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
            }
            else
            {
               A618MaqTemMax = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqTemMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n618MaqTemMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
            }
            cmbMaqChp.setName( cmbMaqChp.getInternalname() );
            cmbMaqChp.setValue( httpContext.cgiGet( cmbMaqChp.getInternalname()) );
            A601MaqChp = httpContext.cgiGet( cmbMaqChp.getInternalname()) ;
            n601MaqChp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqNroTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqNroTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQNROTUB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqNroTub_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3598MaqNroTub = (byte)(0) ;
               n3598MaqNroTub = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3598MaqNroTub", GXutil.str( A3598MaqNroTub, 1, 0));
            }
            else
            {
               A3598MaqNroTub = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqNroTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3598MaqNroTub = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3598MaqNroTub", GXutil.str( A3598MaqNroTub, 1, 0));
            }
            A11726MaqOgtId = httpContext.cgiGet( edtMaqOgtId_Internalname) ;
            n11726MaqOgtId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqMOD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqMOD_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQMOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqMOD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11821MaqMOD = DecimalUtil.ZERO ;
               n11821MaqMOD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11821MaqMOD", GXutil.ltrimstr( A11821MaqMOD, 10, 4));
            }
            else
            {
               A11821MaqMOD = localUtil.ctond( httpContext.cgiGet( edtMaqMOD_Internalname)) ;
               n11821MaqMOD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11821MaqMOD", GXutil.ltrimstr( A11821MaqMOD, 10, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqMOI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqMOI_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQMOI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqMOI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11822MaqMOI = DecimalUtil.ZERO ;
               n11822MaqMOI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11822MaqMOI", GXutil.ltrimstr( A11822MaqMOI, 10, 4));
            }
            else
            {
               A11822MaqMOI = localUtil.ctond( httpContext.cgiGet( edtMaqMOI_Internalname)) ;
               n11822MaqMOI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11822MaqMOI", GXutil.ltrimstr( A11822MaqMOI, 10, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqEnerg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqEnerg_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQENERG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqEnerg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11823MaqEnerg = DecimalUtil.ZERO ;
               n11823MaqEnerg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11823MaqEnerg", GXutil.ltrimstr( A11823MaqEnerg, 10, 4));
            }
            else
            {
               A11823MaqEnerg = localUtil.ctond( httpContext.cgiGet( edtMaqEnerg_Internalname)) ;
               n11823MaqEnerg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11823MaqEnerg", GXutil.ltrimstr( A11823MaqEnerg, 10, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqGas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqGas_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQGAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqGas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11824MaqGas = DecimalUtil.ZERO ;
               n11824MaqGas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11824MaqGas", GXutil.ltrimstr( A11824MaqGas, 10, 4));
            }
            else
            {
               A11824MaqGas = localUtil.ctond( httpContext.cgiGet( edtMaqGas_Internalname)) ;
               n11824MaqGas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11824MaqGas", GXutil.ltrimstr( A11824MaqGas, 10, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqAgua_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqAgua_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQAGUA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqAgua_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11825MaqAgua = DecimalUtil.ZERO ;
               n11825MaqAgua = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11825MaqAgua", GXutil.ltrimstr( A11825MaqAgua, 10, 4));
            }
            else
            {
               A11825MaqAgua = localUtil.ctond( httpContext.cgiGet( edtMaqAgua_Internalname)) ;
               n11825MaqAgua = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11825MaqAgua", GXutil.ltrimstr( A11825MaqAgua, 10, 4));
            }
            A12123MaqCosMm = localUtil.ctond( httpContext.cgiGet( edtMaqCosMm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12123MaqCosMm", GXutil.ltrimstr( A12123MaqCosMm, 10, 4));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQVOLMAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqVolMax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A623MaqVolMax = 0 ;
               n623MaqVolMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
            }
            else
            {
               A623MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n623MaqVolMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQVOLMED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqVolMed_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A624MaqVolMed = 0 ;
               n624MaqVolMed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
            }
            else
            {
               A624MaqVolMed = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n624MaqVolMed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQVOLMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqVolMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A625MaqVolMin = 0 ;
               n625MaqVolMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
            }
            else
            {
               A625MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n625MaqVolMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqRelBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqRelBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQRELBAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqRelBan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3599MaqRelBan = (byte)(0) ;
               n3599MaqRelBan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3599MaqRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3599MaqRelBan), 2, 0));
            }
            else
            {
               A3599MaqRelBan = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqRelBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3599MaqRelBan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3599MaqRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3599MaqRelBan), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQKGSMAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqKgsMax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4285MaqKgsMax = DecimalUtil.ZERO ;
               n4285MaqKgsMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
            }
            else
            {
               A4285MaqKgsMax = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)) ;
               n4285MaqKgsMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqKgsMed_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqKgsMed_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQKGSMED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqKgsMed_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4284MaqKgsMed = DecimalUtil.ZERO ;
               n4284MaqKgsMed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4284MaqKgsMed", GXutil.ltrimstr( A4284MaqKgsMed, 9, 2));
            }
            else
            {
               A4284MaqKgsMed = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMed_Internalname)) ;
               n4284MaqKgsMed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4284MaqKgsMed", GXutil.ltrimstr( A4284MaqKgsMed, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQKGSMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqKgsMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4283MaqKgsMin = DecimalUtil.ZERO ;
               n4283MaqKgsMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
            }
            else
            {
               A4283MaqKgsMin = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)) ;
               n4283MaqKgsMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
            }
            A619MaqTinTip = httpContext.cgiGet( edtMaqTinTip_Internalname) ;
            n619MaqTinTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A619MaqTinTip", A619MaqTinTip);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQVOLRES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqVolRes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2801MaqVolRes = 0 ;
               n2801MaqVolRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2801MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2801MaqVolRes), 5, 0));
            }
            else
            {
               A2801MaqVolRes = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n2801MaqVolRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2801MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2801MaqVolRes), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolTop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolTop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQVOLTOP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqVolTop_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2802MaqVolTop = 0 ;
               n2802MaqVolTop = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2802MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2802MaqVolTop), 5, 0));
            }
            else
            {
               A2802MaqVolTop = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolTop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n2802MaqVolTop = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2802MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2802MaqVolTop), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolBal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqVolBal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQVOLBAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqVolBal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3600MaqVolBal = 0 ;
               n3600MaqVolBal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3600MaqVolBal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3600MaqVolBal), 5, 0));
            }
            else
            {
               A3600MaqVolBal = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolBal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3600MaqVolBal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3600MaqVolBal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3600MaqVolBal), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMicro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMicro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQMICRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqMicro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2391MaqMicro = (byte)(0) ;
               n2391MaqMicro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2391MaqMicro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2391MaqMicro), 2, 0));
            }
            else
            {
               A2391MaqMicro = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMicro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n2391MaqMicro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2391MaqMicro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2391MaqMicro), 2, 0));
            }
            cmbMaqCodBan.setName( cmbMaqCodBan.getInternalname() );
            cmbMaqCodBan.setValue( httpContext.cgiGet( cmbMaqCodBan.getInternalname()) );
            A5292MaqCodBan = httpContext.cgiGet( cmbMaqCodBan.getInternalname()) ;
            n5292MaqCodBan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5292MaqCodBan", A5292MaqCodBan);
            A5593MaqTipCen = httpContext.cgiGet( edtMaqTipCen_Internalname) ;
            n5593MaqTipCen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5593MaqTipCen", A5593MaqTipCen);
            cmbMaqDosifP.setName( cmbMaqDosifP.getInternalname() );
            cmbMaqDosifP.setValue( httpContext.cgiGet( cmbMaqDosifP.getInternalname()) );
            A5949MaqDosifP = httpContext.cgiGet( cmbMaqDosifP.getInternalname()) ;
            n5949MaqDosifP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
            A604MaqCodFor = httpContext.cgiGet( edtMaqCodFor_Internalname) ;
            n604MaqCodFor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A604MaqCodFor", A604MaqCodFor);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqCuerdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqCuerdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQCUERDAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCuerdas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14289MaqCuerdas = (short)(0) ;
               n14289MaqCuerdas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14289MaqCuerdas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14289MaqCuerdas), 4, 0));
            }
            else
            {
               A14289MaqCuerdas = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqCuerdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n14289MaqCuerdas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14289MaqCuerdas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14289MaqCuerdas), 4, 0));
            }
            cmbMaqSalM.setName( cmbMaqSalM.getInternalname() );
            cmbMaqSalM.setValue( httpContext.cgiGet( cmbMaqSalM.getInternalname()) );
            A5419MaqSalM = httpContext.cgiGet( cmbMaqSalM.getInternalname()) ;
            n5419MaqSalM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqSalMKi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqSalMKi_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQSALMKI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqSalMKi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5420MaqSalMKi = DecimalUtil.ZERO ;
               n5420MaqSalMKi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5420MaqSalMKi", GXutil.ltrimstr( A5420MaqSalMKi, 11, 3));
            }
            else
            {
               A5420MaqSalMKi = localUtil.ctond( httpContext.cgiGet( edtMaqSalMKi_Internalname)) ;
               n5420MaqSalMKi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5420MaqSalMKi", GXutil.ltrimstr( A5420MaqSalMKi, 11, 3));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqSalMKf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqSalMKf_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQSALMKF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqSalMKf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5421MaqSalMKf = DecimalUtil.ZERO ;
               n5421MaqSalMKf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5421MaqSalMKf", GXutil.ltrimstr( A5421MaqSalMKf, 11, 3));
            }
            else
            {
               A5421MaqSalMKf = localUtil.ctond( httpContext.cgiGet( edtMaqSalMKf_Internalname)) ;
               n5421MaqSalMKf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5421MaqSalMKf", GXutil.ltrimstr( A5421MaqSalMKf, 11, 3));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqDteCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqDteCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQDTECOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqDteCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5950MaqDteCol = 0 ;
               n5950MaqDteCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5950MaqDteCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5950MaqDteCol), 5, 0));
            }
            else
            {
               A5950MaqDteCol = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqDteCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5950MaqDteCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5950MaqDteCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5950MaqDteCol), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTmCarg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTmCarg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQTMCARG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqTmCarg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13020MaqTmCarg = (short)(0) ;
               n13020MaqTmCarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13020MaqTmCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13020MaqTmCarg), 4, 0));
            }
            else
            {
               A13020MaqTmCarg = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqTmCarg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13020MaqTmCarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13020MaqTmCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13020MaqTmCarg), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTmDcarg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTmDcarg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQTMDCARG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqTmDcarg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13021MaqTmDcarg = (short)(0) ;
               n13021MaqTmDcarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13021MaqTmDcarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13021MaqTmDcarg), 4, 0));
            }
            else
            {
               A13021MaqTmDcarg = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqTmDcarg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13021MaqTmDcarg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13021MaqTmDcarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13021MaqTmDcarg), 4, 0));
            }
            cmbMaqPlnVis.setName( cmbMaqPlnVis.getInternalname() );
            cmbMaqPlnVis.setValue( httpContext.cgiGet( cmbMaqPlnVis.getInternalname()) );
            A6433MaqPlnVis = (byte)(GXutil.lval( httpContext.cgiGet( cmbMaqPlnVis.getInternalname()))) ;
            n6433MaqPlnVis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6433MaqPlnVis", GXutil.str( A6433MaqPlnVis, 1, 0));
            cmbMaqPln.setName( cmbMaqPln.getInternalname() );
            cmbMaqPln.setValue( httpContext.cgiGet( cmbMaqPln.getInternalname()) );
            A6432MaqPln = (byte)(GXutil.lval( httpContext.cgiGet( cmbMaqPln.getInternalname()))) ;
            n6432MaqPln = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6432MaqPln", GXutil.str( A6432MaqPln, 1, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqFacAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqFacAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQFACABS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqFacAbs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6284MaqFacAbs = DecimalUtil.ZERO ;
               n6284MaqFacAbs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6284MaqFacAbs", GXutil.ltrimstr( A6284MaqFacAbs, 6, 2));
            }
            else
            {
               A6284MaqFacAbs = localUtil.ctond( httpContext.cgiGet( edtMaqFacAbs_Internalname)) ;
               n6284MaqFacAbs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6284MaqFacAbs", GXutil.ltrimstr( A6284MaqFacAbs, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqFabsHm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqFabsHm_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQFABSHM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqFabsHm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9982MaqFabsHm = DecimalUtil.ZERO ;
               n9982MaqFabsHm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9982MaqFabsHm", GXutil.ltrimstr( A9982MaqFabsHm, 6, 2));
            }
            else
            {
               A9982MaqFabsHm = localUtil.ctond( httpContext.cgiGet( edtMaqFabsHm_Internalname)) ;
               n9982MaqFabsHm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9982MaqFabsHm", GXutil.ltrimstr( A9982MaqFabsHm, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqCantCor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqCantCor_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQCANTCOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCantCor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5463MaqCantCor = DecimalUtil.ZERO ;
               n5463MaqCantCor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5463MaqCantCor", GXutil.ltrimstr( A5463MaqCantCor, 11, 3));
            }
            else
            {
               A5463MaqCantCor = localUtil.ctond( httpContext.cgiGet( edtMaqCantCor_Internalname)) ;
               n5463MaqCantCor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5463MaqCantCor", GXutil.ltrimstr( A5463MaqCantCor, 11, 3));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqHhCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqHhCon_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQHHCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqHhCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1027MaqHhCon = DecimalUtil.ZERO ;
               n1027MaqHhCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1027MaqHhCon", GXutil.ltrimstr( A1027MaqHhCon, 10, 2));
            }
            else
            {
               A1027MaqHhCon = localUtil.ctond( httpContext.cgiGet( edtMaqHhCon_Internalname)) ;
               n1027MaqHhCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1027MaqHhCon", GXutil.ltrimstr( A1027MaqHhCon, 10, 2));
            }
            A8657MaqLoc = httpContext.cgiGet( edtMaqLoc_Internalname) ;
            n8657MaqLoc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8657MaqLoc", A8657MaqLoc);
            cmbMaqVaril.setName( cmbMaqVaril.getInternalname() );
            cmbMaqVaril.setValue( httpContext.cgiGet( cmbMaqVaril.getInternalname()) );
            A8056MaqVaril = httpContext.cgiGet( cmbMaqVaril.getInternalname()) ;
            n8056MaqVaril = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
            A3601MaqTipMaq = GXutil.upper( httpContext.cgiGet( edtMaqTipMaq_Internalname)) ;
            n3601MaqTipMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3601MaqTipMaq", A3601MaqTipMaq);
            AV127Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127Pgmname", AV127Pgmname);
            AV123ComboTipMaqCod = httpContext.cgiGet( edtavCombotipmaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123ComboTipMaqCod", AV123ComboTipMaqCod);
            AV125ComboMaqOgtId = httpContext.cgiGet( edtavCombomaqogtid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125ComboMaqOgtId", AV125ComboMaqOgtId);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUI1");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV127Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127Pgmname", AV127Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV127Pgmname, "")));
            forbiddenHiddens.add("MaqUltFec", GXutil.rtrim( localUtil.format( A621MaqUltFec, "")));
            forbiddenHiddens.add("MaqResDia", localUtil.format( A617MaqResDia, "Z9.99"));
            forbiddenHiddens.add("MaqHorAsi", localUtil.format( A611MaqHorAsi, "ZZZ9.99"));
            forbiddenHiddens.add("MaqOrdSeq", localUtil.format( DecimalUtil.doubleToDec(A616MaqOrdSeq), "ZZZ9"));
            forbiddenHiddens.add("MaqFormul", GXutil.rtrim( localUtil.format( A4282MaqFormul, "@!")));
            forbiddenHiddens.add("MaqPrdMin", localUtil.format( DecimalUtil.doubleToDec(A4319MaqPrdMin), "ZZZ9"));
            forbiddenHiddens.add("MaqPrdMed", localUtil.format( DecimalUtil.doubleToDec(A4320MaqPrdMed), "ZZZ9"));
            forbiddenHiddens.add("MaqPrdMax", localUtil.format( DecimalUtil.doubleToDec(A4321MaqPrdMax), "ZZZ9"));
            forbiddenHiddens.add("MaqKgsId", localUtil.format( A6399MaqKgsId, "ZZZZZ9.99"));
            forbiddenHiddens.add("MaqConFas", localUtil.format( DecimalUtil.doubleToDec(A6454MaqConFas), "ZZZZZ9"));
            forbiddenHiddens.add("MaqObs", GXutil.rtrim( localUtil.format( A9626MaqObs, "")));
            forbiddenHiddens.add("MaqHhCtr", GXutil.rtrim( localUtil.format( A1026MaqHhCtr, "")));
            forbiddenHiddens.add("MaqCosGen", localUtil.format( A3684MaqCosGen, "ZZZZ9.99"));
            forbiddenHiddens.add("MaqMtsMn", localUtil.format( A13022MaqMtsMn, "ZZZZZ9.99"));
            forbiddenHiddens.add("MaqMtsMx", localUtil.format( A13023MaqMtsMx, "ZZZZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmaqui1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
                  sMode65 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode65 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound65 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1OS0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MAQCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCod_Internalname ;
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
                        e111OS2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121OS2 ();
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
         e121OS2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1OS65( ) ;
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
         disableAttributes1OS65( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipmaqcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqogtid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqogtid_Enabled), 5, 0), true);
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

   public void confirm_1OS0( )
   {
      beforeValidate1OS65( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OS65( ) ;
         }
         else
         {
            checkExtendedTable1OS65( ) ;
            closeExtendedTableCursors1OS65( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode65 = Gx_mode ;
         confirm_1OS68( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode65 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1OS68( )
   {
      s622MaqUltLin = O622MaqUltLin ;
      n622MaqUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      nGXsfl_379_idx = 0 ;
      while ( nGXsfl_379_idx < nRC_GXsfl_379 )
      {
         readRow1OS68( ) ;
         if ( ( nRcdExists_68 != 0 ) || ( nIsMod_68 != 0 ) )
         {
            getKey1OS68( ) ;
            if ( ( nRcdExists_68 == 0 ) && ( nRcdDeleted_68 == 0 ) )
            {
               if ( RcdFound68 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OS68( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OS68( ) ;
                     closeExtendedTableCursors1OS68( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O622MaqUltLin = A622MaqUltLin ;
                     n622MaqUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "DESTECLIN_" + sGXsfl_379_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDesTecLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound68 != 0 )
               {
                  if ( nRcdDeleted_68 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OS68( ) ;
                     load1OS68( ) ;
                     beforeValidate1OS68( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OS68( ) ;
                        O622MaqUltLin = A622MaqUltLin ;
                        n622MaqUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_68 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OS68( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OS68( ) ;
                           closeExtendedTableCursors1OS68( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O622MaqUltLin = A622MaqUltLin ;
                           n622MaqUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_68 == 0 )
                  {
                     GXCCtl = "DESTECLIN_" + sGXsfl_379_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDesTecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDesTecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A320DesTecLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqLinTex_Internalname, GXutil.rtrim( A613MaqLinTex)) ;
         httpContext.changePostValue( "ZT_"+"Z320DesTecLin_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( Z320DesTecLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z613MaqLinTex_"+sGXsfl_379_idx, GXutil.rtrim( Z613MaqLinTex)) ;
         httpContext.changePostValue( "nRcdDeleted_68_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_68_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_68_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_68 != 0 )
         {
            httpContext.changePostValue( "DESTECLIN_"+sGXsfl_379_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDesTecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQLINTEX_"+sGXsfl_379_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqLinTex_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O622MaqUltLin = s622MaqUltLin ;
      n622MaqUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1OS0( )
   {
   }

   public void e111OS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV119Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmaqui1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV119Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119Station", AV119Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV119Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqui1_impl.this.A396EmprCod = GXv_char2[0] ;
      tmaqui1_impl.this.AV7EmprNom = GXv_char3[0] ;
      tmaqui1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV119Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmaqui1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV119Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119Station", AV119Station);
      GXv_char4[0] = AV109EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV119Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmaqui1_impl.this.AV109EmprCod = GXv_char4[0] ;
      tmaqui1_impl.this.AV7EmprNom = GXv_char3[0] ;
      tmaqui1_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109EmprCod", AV109EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV111WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV111WWPContext = GXv_SdtWWPContext5[0] ;
      edtMaqOgtId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqOgtId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqOgtId_Visible), 5, 0), true);
      AV125ComboMaqOgtId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125ComboMaqOgtId", AV125ComboMaqOgtId);
      edtavCombomaqogtid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqogtid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqogtid_Visible), 5, 0), true);
      edtTipMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqCod_Visible), 5, 0), true);
      AV123ComboTipMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123ComboTipMaqCod", AV123ComboTipMaqCod);
      edtavCombotipmaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipmaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipmaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTIPMAQCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOMAQOGTID' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV112TrnContext.fromxml(AV113WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV112TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV127Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV128GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV128GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GXV1), 8, 0));
         while ( AV128GXV1 <= AV112TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV117TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV112TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV128GXV1));
            if ( GXutil.strcmp(AV117TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipMaqCod") == 0 )
            {
               AV114Insert_TipMaqCod = AV117TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV114Insert_TipMaqCod", AV114Insert_TipMaqCod);
               if ( ! (GXutil.strcmp("", AV114Insert_TipMaqCod)==0) )
               {
                  AV123ComboTipMaqCod = AV114Insert_TipMaqCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV123ComboTipMaqCod", AV123ComboTipMaqCod);
                  Combo_tipmaqcod_Selectedvalue_set = AV123ComboTipMaqCod ;
                  ucCombo_tipmaqcod.sendProperty(context, "", false, Combo_tipmaqcod_Internalname, "SelectedValue_set", Combo_tipmaqcod_Selectedvalue_set);
                  Combo_tipmaqcod_Enabled = false ;
                  ucCombo_tipmaqcod.sendProperty(context, "", false, Combo_tipmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_tipmaqcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV117TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MaqOgtId") == 0 )
            {
               AV116Insert_MaqOgtId = AV117TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV116Insert_MaqOgtId", AV116Insert_MaqOgtId);
               if ( ! (GXutil.strcmp("", AV116Insert_MaqOgtId)==0) )
               {
                  AV125ComboMaqOgtId = AV116Insert_MaqOgtId ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV125ComboMaqOgtId", AV125ComboMaqOgtId);
                  Combo_maqogtid_Selectedvalue_set = AV125ComboMaqOgtId ;
                  ucCombo_maqogtid.sendProperty(context, "", false, Combo_maqogtid_Internalname, "SelectedValue_set", Combo_maqogtid_Selectedvalue_set);
                  Combo_maqogtid_Enabled = false ;
                  ucCombo_maqogtid.sendProperty(context, "", false, Combo_maqogtid_Internalname, "Enabled", GXutil.booltostr( Combo_maqogtid_Enabled));
               }
            }
            AV128GXV1 = (int)(AV128GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GXV1), 8, 0));
         }
      }
   }

   public void e121OS2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV112TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmaqui1ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divMaqloc_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqloc_cell_Internalname, "Class", divMaqloc_cell_Class, true);
      divMaqvaril_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqvaril_cell_Internalname, "Class", divMaqvaril_cell_Class, true);
      divMaqtipmaq_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqtipmaq_cell_Internalname, "Class", divMaqtipmaq_cell_Class, true);
      cmbMaqPlnVis.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPlnVis.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqPlnVis.getVisible(), 5, 0), true);
      divMaqplnvis_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqplnvis_cell_Internalname, "Class", divMaqplnvis_cell_Class, true);
      cmbMaqPln.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPln.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqPln.getVisible(), 5, 0), true);
      divMaqpln_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqpln_cell_Internalname, "Class", divMaqpln_cell_Class, true);
      divMaqcantcor_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqcantcor_cell_Internalname, "Class", divMaqcantcor_cell_Class, true);
      divMaqhhcon_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqhhcon_cell_Internalname, "Class", divMaqhhcon_cell_Class, true);
      cmbMaqCodBan.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqCodBan.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqCodBan.getVisible(), 5, 0), true);
      divMaqcodban_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqcodban_cell_Internalname, "Class", divMaqcodban_cell_Class, true);
      edtMaqTipCen_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipCen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipCen_Visible), 5, 0), true);
      divMaqtipcen_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqtipcen_cell_Internalname, "Class", divMaqtipcen_cell_Class, true);
      edtMaqVolBal_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolBal_Visible), 5, 0), true);
      divMaqvolbal_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqvolbal_cell_Internalname, "Class", divMaqvolbal_cell_Class, true);
      divMaqcosmin_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqcosmin_cell_Internalname, "Class", divMaqcosmin_cell_Class, true);
      edtMaqCosKg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosKg_Visible), 5, 0), true);
      divMaqcoskg_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqcoskg_cell_Internalname, "Class", divMaqcoskg_cell_Class, true);
      edtMaqCosFijo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosFijo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosFijo_Visible), 5, 0), true);
      divMaqcosfijo_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divMaqcosfijo_cell_Internalname, "Class", divMaqcosfijo_cell_Class, true);
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      divDvpanel_panelsalmuera_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_panelsalmuera_cell_Internalname, "Class", divDvpanel_panelsalmuera_cell_Class, true);
      divDvpanel_paneltipomaquina_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_paneltipomaquina_cell_Internalname, "Class", divDvpanel_paneltipomaquina_cell_Class, true);
   }

   public void S122( )
   {
      /* 'LOADCOMBOMAQOGTID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV124MaqOgtId_Data ;
      GXv_char4[0] = AV122ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.tmaqui1loaddvcombo(remoteHandle, context).execute( "MaqOgtId", Gx_mode, AV109EmprCod, AV118MaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tmaqui1_impl.this.AV122ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV124MaqOgtId_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_maqogtid_Selectedvalue_set = AV122ComboSelectedValue ;
      ucCombo_maqogtid.sendProperty(context, "", false, Combo_maqogtid_Internalname, "SelectedValue_set", Combo_maqogtid_Selectedvalue_set);
      AV125ComboMaqOgtId = AV122ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125ComboMaqOgtId", AV125ComboMaqOgtId);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_maqogtid_Enabled = false ;
         ucCombo_maqogtid.sendProperty(context, "", false, Combo_maqogtid_Internalname, "Enabled", GXutil.booltostr( Combo_maqogtid_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOTIPMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV121TipMaqCod_Data ;
      GXv_char4[0] = AV122ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.tmaqui1loaddvcombo(remoteHandle, context).execute( "TipMaqCod", Gx_mode, AV109EmprCod, AV118MaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tmaqui1_impl.this.AV122ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV121TipMaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_tipmaqcod_Selectedvalue_set = AV122ComboSelectedValue ;
      ucCombo_tipmaqcod.sendProperty(context, "", false, Combo_tipmaqcod_Internalname, "SelectedValue_set", Combo_tipmaqcod_Selectedvalue_set);
      AV123ComboTipMaqCod = AV122ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123ComboTipMaqCod", AV123ComboTipMaqCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_tipmaqcod_Enabled = false ;
         ucCombo_tipmaqcod.sendProperty(context, "", false, Combo_tipmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_tipmaqcod_Enabled));
      }
   }

   public void zm1OS65( int GX_JID )
   {
      if ( ( GX_JID == 66 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3601MaqTipMaq = T01OS5_A3601MaqTipMaq[0] ;
            Z606MaqDsc = T01OS5_A606MaqDsc[0] ;
            Z14288MaqDscLarg = T01OS5_A14288MaqDscLarg[0] ;
            Z600MaqCap = T01OS5_A600MaqCap[0] ;
            Z605MaqCosMin = T01OS5_A605MaqCosMin[0] ;
            Z612MaqHorPro = T01OS5_A612MaqHorPro[0] ;
            Z615MaqMinPro = T01OS5_A615MaqMinPro[0] ;
            Z620MaqTip = T01OS5_A620MaqTip[0] ;
            Z607MaqEst = T01OS5_A607MaqEst[0] ;
            Z621MaqUltFec = T01OS5_A621MaqUltFec[0] ;
            Z617MaqResDia = T01OS5_A617MaqResDia[0] ;
            Z611MaqHorAsi = T01OS5_A611MaqHorAsi[0] ;
            Z616MaqOrdSeq = T01OS5_A616MaqOrdSeq[0] ;
            Z622MaqUltLin = T01OS5_A622MaqUltLin[0] ;
            Z4282MaqFormul = T01OS5_A4282MaqFormul[0] ;
            Z4283MaqKgsMin = T01OS5_A4283MaqKgsMin[0] ;
            Z4284MaqKgsMed = T01OS5_A4284MaqKgsMed[0] ;
            Z4285MaqKgsMax = T01OS5_A4285MaqKgsMax[0] ;
            Z4319MaqPrdMin = T01OS5_A4319MaqPrdMin[0] ;
            Z4320MaqPrdMed = T01OS5_A4320MaqPrdMed[0] ;
            Z4321MaqPrdMax = T01OS5_A4321MaqPrdMax[0] ;
            Z623MaqVolMax = T01OS5_A623MaqVolMax[0] ;
            Z625MaqVolMin = T01OS5_A625MaqVolMin[0] ;
            Z624MaqVolMed = T01OS5_A624MaqVolMed[0] ;
            Z2801MaqVolRes = T01OS5_A2801MaqVolRes[0] ;
            Z2802MaqVolTop = T01OS5_A2802MaqVolTop[0] ;
            Z618MaqTemMax = T01OS5_A618MaqTemMax[0] ;
            Z601MaqChp = T01OS5_A601MaqChp[0] ;
            Z619MaqTinTip = T01OS5_A619MaqTinTip[0] ;
            Z2391MaqMicro = T01OS5_A2391MaqMicro[0] ;
            Z3598MaqNroTub = T01OS5_A3598MaqNroTub[0] ;
            Z5292MaqCodBan = T01OS5_A5292MaqCodBan[0] ;
            Z5419MaqSalM = T01OS5_A5419MaqSalM[0] ;
            Z5420MaqSalMKi = T01OS5_A5420MaqSalMKi[0] ;
            Z5421MaqSalMKf = T01OS5_A5421MaqSalMKf[0] ;
            Z5463MaqCantCor = T01OS5_A5463MaqCantCor[0] ;
            Z5593MaqTipCen = T01OS5_A5593MaqTipCen[0] ;
            Z5949MaqDosifP = T01OS5_A5949MaqDosifP[0] ;
            Z5950MaqDteCol = T01OS5_A5950MaqDteCol[0] ;
            Z604MaqCodFor = T01OS5_A604MaqCodFor[0] ;
            Z6284MaqFacAbs = T01OS5_A6284MaqFacAbs[0] ;
            Z6399MaqKgsId = T01OS5_A6399MaqKgsId[0] ;
            Z6432MaqPln = T01OS5_A6432MaqPln[0] ;
            Z6433MaqPlnVis = T01OS5_A6433MaqPlnVis[0] ;
            Z6454MaqConFas = T01OS5_A6454MaqConFas[0] ;
            Z8056MaqVaril = T01OS5_A8056MaqVaril[0] ;
            Z3599MaqRelBan = T01OS5_A3599MaqRelBan[0] ;
            Z8657MaqLoc = T01OS5_A8657MaqLoc[0] ;
            Z9626MaqObs = T01OS5_A9626MaqObs[0] ;
            Z9982MaqFabsHm = T01OS5_A9982MaqFabsHm[0] ;
            Z1027MaqHhCon = T01OS5_A1027MaqHhCon[0] ;
            Z1026MaqHhCtr = T01OS5_A1026MaqHhCtr[0] ;
            Z3600MaqVolBal = T01OS5_A3600MaqVolBal[0] ;
            Z3684MaqCosGen = T01OS5_A3684MaqCosGen[0] ;
            Z11821MaqMOD = T01OS5_A11821MaqMOD[0] ;
            Z11822MaqMOI = T01OS5_A11822MaqMOI[0] ;
            Z11823MaqEnerg = T01OS5_A11823MaqEnerg[0] ;
            Z11824MaqGas = T01OS5_A11824MaqGas[0] ;
            Z11825MaqAgua = T01OS5_A11825MaqAgua[0] ;
            Z13020MaqTmCarg = T01OS5_A13020MaqTmCarg[0] ;
            Z13021MaqTmDcarg = T01OS5_A13021MaqTmDcarg[0] ;
            Z13022MaqMtsMn = T01OS5_A13022MaqMtsMn[0] ;
            Z13023MaqMtsMx = T01OS5_A13023MaqMtsMx[0] ;
            Z13179MaqCosFijo = T01OS5_A13179MaqCosFijo[0] ;
            Z13180MaqCosKg = T01OS5_A13180MaqCosKg[0] ;
            Z14289MaqCuerdas = T01OS5_A14289MaqCuerdas[0] ;
            Z1011TipMaqCod = T01OS5_A1011TipMaqCod[0] ;
            Z11726MaqOgtId = T01OS5_A11726MaqOgtId[0] ;
         }
         else
         {
            Z3601MaqTipMaq = A3601MaqTipMaq ;
            Z606MaqDsc = A606MaqDsc ;
            Z14288MaqDscLarg = A14288MaqDscLarg ;
            Z600MaqCap = A600MaqCap ;
            Z605MaqCosMin = A605MaqCosMin ;
            Z612MaqHorPro = A612MaqHorPro ;
            Z615MaqMinPro = A615MaqMinPro ;
            Z620MaqTip = A620MaqTip ;
            Z607MaqEst = A607MaqEst ;
            Z621MaqUltFec = A621MaqUltFec ;
            Z617MaqResDia = A617MaqResDia ;
            Z611MaqHorAsi = A611MaqHorAsi ;
            Z616MaqOrdSeq = A616MaqOrdSeq ;
            Z622MaqUltLin = A622MaqUltLin ;
            Z4282MaqFormul = A4282MaqFormul ;
            Z4283MaqKgsMin = A4283MaqKgsMin ;
            Z4284MaqKgsMed = A4284MaqKgsMed ;
            Z4285MaqKgsMax = A4285MaqKgsMax ;
            Z4319MaqPrdMin = A4319MaqPrdMin ;
            Z4320MaqPrdMed = A4320MaqPrdMed ;
            Z4321MaqPrdMax = A4321MaqPrdMax ;
            Z623MaqVolMax = A623MaqVolMax ;
            Z625MaqVolMin = A625MaqVolMin ;
            Z624MaqVolMed = A624MaqVolMed ;
            Z2801MaqVolRes = A2801MaqVolRes ;
            Z2802MaqVolTop = A2802MaqVolTop ;
            Z618MaqTemMax = A618MaqTemMax ;
            Z601MaqChp = A601MaqChp ;
            Z619MaqTinTip = A619MaqTinTip ;
            Z2391MaqMicro = A2391MaqMicro ;
            Z3598MaqNroTub = A3598MaqNroTub ;
            Z5292MaqCodBan = A5292MaqCodBan ;
            Z5419MaqSalM = A5419MaqSalM ;
            Z5420MaqSalMKi = A5420MaqSalMKi ;
            Z5421MaqSalMKf = A5421MaqSalMKf ;
            Z5463MaqCantCor = A5463MaqCantCor ;
            Z5593MaqTipCen = A5593MaqTipCen ;
            Z5949MaqDosifP = A5949MaqDosifP ;
            Z5950MaqDteCol = A5950MaqDteCol ;
            Z604MaqCodFor = A604MaqCodFor ;
            Z6284MaqFacAbs = A6284MaqFacAbs ;
            Z6399MaqKgsId = A6399MaqKgsId ;
            Z6432MaqPln = A6432MaqPln ;
            Z6433MaqPlnVis = A6433MaqPlnVis ;
            Z6454MaqConFas = A6454MaqConFas ;
            Z8056MaqVaril = A8056MaqVaril ;
            Z3599MaqRelBan = A3599MaqRelBan ;
            Z8657MaqLoc = A8657MaqLoc ;
            Z9626MaqObs = A9626MaqObs ;
            Z9982MaqFabsHm = A9982MaqFabsHm ;
            Z1027MaqHhCon = A1027MaqHhCon ;
            Z1026MaqHhCtr = A1026MaqHhCtr ;
            Z3600MaqVolBal = A3600MaqVolBal ;
            Z3684MaqCosGen = A3684MaqCosGen ;
            Z11821MaqMOD = A11821MaqMOD ;
            Z11822MaqMOI = A11822MaqMOI ;
            Z11823MaqEnerg = A11823MaqEnerg ;
            Z11824MaqGas = A11824MaqGas ;
            Z11825MaqAgua = A11825MaqAgua ;
            Z13020MaqTmCarg = A13020MaqTmCarg ;
            Z13021MaqTmDcarg = A13021MaqTmDcarg ;
            Z13022MaqMtsMn = A13022MaqMtsMn ;
            Z13023MaqMtsMx = A13023MaqMtsMx ;
            Z13179MaqCosFijo = A13179MaqCosFijo ;
            Z13180MaqCosKg = A13180MaqCosKg ;
            Z14289MaqCuerdas = A14289MaqCuerdas ;
            Z1011TipMaqCod = A1011TipMaqCod ;
            Z11726MaqOgtId = A11726MaqOgtId ;
         }
      }
      if ( GX_JID == -66 )
      {
         Z602MaqCod = A602MaqCod ;
         Z3601MaqTipMaq = A3601MaqTipMaq ;
         Z606MaqDsc = A606MaqDsc ;
         Z14288MaqDscLarg = A14288MaqDscLarg ;
         Z600MaqCap = A600MaqCap ;
         Z605MaqCosMin = A605MaqCosMin ;
         Z612MaqHorPro = A612MaqHorPro ;
         Z615MaqMinPro = A615MaqMinPro ;
         Z620MaqTip = A620MaqTip ;
         Z607MaqEst = A607MaqEst ;
         Z621MaqUltFec = A621MaqUltFec ;
         Z617MaqResDia = A617MaqResDia ;
         Z611MaqHorAsi = A611MaqHorAsi ;
         Z616MaqOrdSeq = A616MaqOrdSeq ;
         Z622MaqUltLin = A622MaqUltLin ;
         Z4282MaqFormul = A4282MaqFormul ;
         Z4283MaqKgsMin = A4283MaqKgsMin ;
         Z4284MaqKgsMed = A4284MaqKgsMed ;
         Z4285MaqKgsMax = A4285MaqKgsMax ;
         Z4319MaqPrdMin = A4319MaqPrdMin ;
         Z4320MaqPrdMed = A4320MaqPrdMed ;
         Z4321MaqPrdMax = A4321MaqPrdMax ;
         Z623MaqVolMax = A623MaqVolMax ;
         Z625MaqVolMin = A625MaqVolMin ;
         Z624MaqVolMed = A624MaqVolMed ;
         Z2801MaqVolRes = A2801MaqVolRes ;
         Z2802MaqVolTop = A2802MaqVolTop ;
         Z618MaqTemMax = A618MaqTemMax ;
         Z601MaqChp = A601MaqChp ;
         Z619MaqTinTip = A619MaqTinTip ;
         Z2391MaqMicro = A2391MaqMicro ;
         Z3598MaqNroTub = A3598MaqNroTub ;
         Z5292MaqCodBan = A5292MaqCodBan ;
         Z5419MaqSalM = A5419MaqSalM ;
         Z5420MaqSalMKi = A5420MaqSalMKi ;
         Z5421MaqSalMKf = A5421MaqSalMKf ;
         Z5463MaqCantCor = A5463MaqCantCor ;
         Z5593MaqTipCen = A5593MaqTipCen ;
         Z5949MaqDosifP = A5949MaqDosifP ;
         Z5950MaqDteCol = A5950MaqDteCol ;
         Z604MaqCodFor = A604MaqCodFor ;
         Z6284MaqFacAbs = A6284MaqFacAbs ;
         Z6399MaqKgsId = A6399MaqKgsId ;
         Z6432MaqPln = A6432MaqPln ;
         Z6433MaqPlnVis = A6433MaqPlnVis ;
         Z6454MaqConFas = A6454MaqConFas ;
         Z8056MaqVaril = A8056MaqVaril ;
         Z3599MaqRelBan = A3599MaqRelBan ;
         Z8657MaqLoc = A8657MaqLoc ;
         Z9626MaqObs = A9626MaqObs ;
         Z9982MaqFabsHm = A9982MaqFabsHm ;
         Z1027MaqHhCon = A1027MaqHhCon ;
         Z1026MaqHhCtr = A1026MaqHhCtr ;
         Z3600MaqVolBal = A3600MaqVolBal ;
         Z3684MaqCosGen = A3684MaqCosGen ;
         Z11821MaqMOD = A11821MaqMOD ;
         Z11822MaqMOI = A11822MaqMOI ;
         Z11823MaqEnerg = A11823MaqEnerg ;
         Z11824MaqGas = A11824MaqGas ;
         Z11825MaqAgua = A11825MaqAgua ;
         Z13020MaqTmCarg = A13020MaqTmCarg ;
         Z13021MaqTmDcarg = A13021MaqTmDcarg ;
         Z13022MaqMtsMn = A13022MaqMtsMn ;
         Z13023MaqMtsMx = A13023MaqMtsMx ;
         Z13179MaqCosFijo = A13179MaqCosFijo ;
         Z13180MaqCosKg = A13180MaqCosKg ;
         Z14289MaqCuerdas = A14289MaqCuerdas ;
         Z396EmprCod = A396EmprCod ;
         Z1011TipMaqCod = A1011TipMaqCod ;
         Z11726MaqOgtId = A11726MaqOgtId ;
         Z407EmprNom = A407EmprNom ;
         Z1012TipMaqDsc = A1012TipMaqDsc ;
         Z11727MaqOgtDsc = A11727MaqOgtDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV127Pgmname = "TMAQUI1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127Pgmname", AV127Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV109EmprCod)==0) )
      {
         A396EmprCod = AV109EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01OS6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OS6_A407EmprNom[0] ;
      n407EmprNom = T01OS6_n407EmprNom[0] ;
      pr_default.close(4);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqLoc_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqLoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqLoc_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqloc_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqloc_cell_Internalname, "Class", divMaqloc_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqloc_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqloc_cell_Internalname, "Class", divMaqloc_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqVaril.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqVaril.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqVaril.getVisible(), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqvaril_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqvaril_cell_Internalname, "Class", divMaqvaril_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqvaril_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqvaril_cell_Internalname, "Class", divMaqvaril_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqTipMaq_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipMaq_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqtipmaq_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqtipmaq_cell_Internalname, "Class", divMaqtipmaq_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqtipmaq_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqtipmaq_cell_Internalname, "Class", divMaqtipmaq_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCantCor_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCantCor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCantCor_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqcantcor_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqcantcor_cell_Internalname, "Class", divMaqcantcor_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqcantcor_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqcantcor_cell_Internalname, "Class", divMaqcantcor_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqHhCon_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHhCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHhCon_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqhhcon_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqhhcon_cell_Internalname, "Class", divMaqhhcon_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqhhcon_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqhhcon_cell_Internalname, "Class", divMaqhhcon_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TASSTD", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCosMin_Visible = ((GXt_int8==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosMin_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TASSTD", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 0 ) ) )
      {
         divMaqcosmin_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqcosmin_cell_Internalname, "Class", divMaqcosmin_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TASSTD", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 0 )
         {
            divMaqcosmin_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqcosmin_cell_Internalname, "Class", divMaqcosmin_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divDvpanel_panelsalmuera_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_panelsalmuera_cell_Internalname, "Class", divDvpanel_panelsalmuera_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divDvpanel_panelsalmuera_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_panelsalmuera_cell_Internalname, "Class", divDvpanel_panelsalmuera_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divDvpanel_paneltipomaquina_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_paneltipomaquina_cell_Internalname, "Class", divDvpanel_paneltipomaquina_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divDvpanel_paneltipomaquina_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_paneltipomaquina_cell_Internalname, "Class", divDvpanel_paneltipomaquina_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "PLAN", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqPlnVis.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPlnVis.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqPlnVis.getVisible(), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "PLAN", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqplnvis_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqplnvis_cell_Internalname, "Class", divMaqplnvis_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "PLAN", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqplnvis_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqplnvis_cell_Internalname, "Class", divMaqplnvis_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "AC0000", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqPln.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPln.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqPln.getVisible(), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "AC0000", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqpln_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqpln_cell_Internalname, "Class", divMaqpln_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "AC0000", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqpln_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqpln_cell_Internalname, "Class", divMaqpln_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqCodBan.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqCodBan.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqCodBan.getVisible(), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqcodban_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqcodban_cell_Internalname, "Class", divMaqcodban_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqcodban_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqcodban_cell_Internalname, "Class", divMaqcodban_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "TYPCEN", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqTipCen_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipCen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipCen_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "TYPCEN", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqtipcen_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqtipcen_cell_Internalname, "Class", divMaqtipcen_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "TYPCEN", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqtipcen_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqtipcen_cell_Internalname, "Class", divMaqtipcen_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "LVMQ00", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqVolBal_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolBal_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "LVMQ00", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqvolbal_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqvolbal_cell_Internalname, "Class", divMaqvolbal_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "LVMQ00", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqvolbal_cell_Class = httpContext.getMessage( "col-xs-12 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqvolbal_cell_Internalname, "Class", divMaqvolbal_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCosKg_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosKg_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqcoskg_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqcoskg_cell_Internalname, "Class", divMaqcoskg_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqcoskg_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqcoskg_cell_Internalname, "Class", divMaqcoskg_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCosFijo_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosFijo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosFijo_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divMaqcosfijo_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divMaqcosfijo_cell_Internalname, "Class", divMaqcosfijo_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divMaqcosfijo_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divMaqcosfijo_cell_Internalname, "Class", divMaqcosfijo_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "TASSTD", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "TASSTD", ""), ""), GXv_int9) ;
         tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV118MaqCod)==0) )
      {
         A602MaqCod = AV118MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
      if ( ! (GXutil.strcmp("", AV118MaqCod)==0) )
      {
         edtMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV118MaqCod)==0) )
      {
         edtMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV114Insert_TipMaqCod)==0) )
      {
         edtTipMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV116Insert_MaqOgtId)==0) )
      {
         edtMaqOgtId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqOgtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqOgtId_Enabled), 5, 0), true);
      }
      else
      {
         edtMaqOgtId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqOgtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqOgtId_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV114Insert_TipMaqCod)==0) )
      {
         A1011TipMaqCod = AV114Insert_TipMaqCod ;
         n1011TipMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
      }
      else
      {
         if ( (GXutil.strcmp("", AV123ComboTipMaqCod)==0) )
         {
            A1011TipMaqCod = "" ;
            n1011TipMaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
            n1011TipMaqCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV123ComboTipMaqCod)==0) )
            {
               A1011TipMaqCod = AV123ComboTipMaqCod ;
               n1011TipMaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV116Insert_MaqOgtId)==0) )
      {
         A11726MaqOgtId = AV116Insert_MaqOgtId ;
         n11726MaqOgtId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
      }
      else
      {
         if ( (GXutil.strcmp("", AV125ComboMaqOgtId)==0) )
         {
            A11726MaqOgtId = "" ;
            n11726MaqOgtId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
            n11726MaqOgtId = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV125ComboMaqOgtId)==0) )
            {
               A11726MaqOgtId = AV125ComboMaqOgtId ;
               n11726MaqOgtId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
            }
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
      if ( isIns( )  && (GXutil.strcmp("", A3601MaqTipMaq)==0) && ( Gx_BScreen == 0 ) )
      {
         A3601MaqTipMaq = httpContext.getMessage( "N", "") ;
         n3601MaqTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3601MaqTipMaq", A3601MaqTipMaq);
      }
      if ( isIns( )  && (GXutil.strcmp("", A601MaqChp)==0) && ( Gx_BScreen == 0 ) )
      {
         A601MaqChp = httpContext.getMessage( "N", "") ;
         n601MaqChp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
      }
      if ( isIns( )  && (0==A6454MaqConFas) && ( Gx_BScreen == 0 ) )
      {
         A6454MaqConFas = 0 ;
         n6454MaqConFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6454MaqConFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6454MaqConFas), 6, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A5419MaqSalM)==0) && ( Gx_BScreen == 0 ) )
      {
         A5419MaqSalM = httpContext.getMessage( "N", "") ;
         n5419MaqSalM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
      }
      if ( isIns( )  && (GXutil.strcmp("", A5593MaqTipCen)==0) && ( Gx_BScreen == 0 ) )
      {
         A5593MaqTipCen = " " ;
         n5593MaqTipCen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5593MaqTipCen", A5593MaqTipCen);
      }
      if ( isIns( )  && (GXutil.strcmp("", A5949MaqDosifP)==0) && ( Gx_BScreen == 0 ) )
      {
         A5949MaqDosifP = httpContext.getMessage( "N", "") ;
         n5949MaqDosifP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
      }
      if ( isIns( )  && (GXutil.strcmp("", A8056MaqVaril)==0) && ( Gx_BScreen == 0 ) )
      {
         A8056MaqVaril = httpContext.getMessage( "N", "") ;
         n8056MaqVaril = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
      }
      if ( isIns( )  && (GXutil.strcmp("", A1026MaqHhCtr)==0) && ( Gx_BScreen == 0 ) )
      {
         A1026MaqHhCtr = httpContext.getMessage( "N", "") ;
         n1026MaqHhCtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1026MaqHhCtr", A1026MaqHhCtr);
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A13179MaqCosFijo)==0) && ( Gx_BScreen == 0 ) )
      {
         A13179MaqCosFijo = DecimalUtil.doubleToDec(0) ;
         n13179MaqCosFijo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13179MaqCosFijo", GXutil.ltrimstr( A13179MaqCosFijo, 10, 4));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A13180MaqCosKg)==0) && ( Gx_BScreen == 0 ) )
      {
         A13180MaqCosKg = DecimalUtil.doubleToDec(0) ;
         n13180MaqCosKg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13180MaqCosKg", GXutil.ltrimstr( A13180MaqCosKg, 10, 4));
      }
      if ( isIns( )  && (GXutil.strcmp("", A4282MaqFormul)==0) && ( Gx_BScreen == 0 ) )
      {
         A4282MaqFormul = httpContext.getMessage( "N", "") ;
         n4282MaqFormul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4282MaqFormul", A4282MaqFormul);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01OS7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n1011TipMaqCod), A1011TipMaqCod});
         A1012TipMaqDsc = T01OS7_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = T01OS7_n1012TipMaqDsc[0] ;
         pr_default.close(5);
         /* Using cursor T01OS8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
         A11727MaqOgtDsc = T01OS8_A11727MaqOgtDsc[0] ;
         pr_default.close(6);
      }
   }

   public void load1OS65( )
   {
      /* Using cursor T01OS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A3601MaqTipMaq = T01OS9_A3601MaqTipMaq[0] ;
         n3601MaqTipMaq = T01OS9_n3601MaqTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3601MaqTipMaq", A3601MaqTipMaq);
         A606MaqDsc = T01OS9_A606MaqDsc[0] ;
         n606MaqDsc = T01OS9_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A14288MaqDscLarg = T01OS9_A14288MaqDscLarg[0] ;
         n14288MaqDscLarg = T01OS9_n14288MaqDscLarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14288MaqDscLarg", A14288MaqDscLarg);
         A600MaqCap = T01OS9_A600MaqCap[0] ;
         n600MaqCap = T01OS9_n600MaqCap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A600MaqCap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A600MaqCap), 6, 0));
         A605MaqCosMin = T01OS9_A605MaqCosMin[0] ;
         n605MaqCosMin = T01OS9_n605MaqCosMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A605MaqCosMin", GXutil.ltrimstr( A605MaqCosMin, 10, 4));
         A612MaqHorPro = T01OS9_A612MaqHorPro[0] ;
         n612MaqHorPro = T01OS9_n612MaqHorPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612MaqHorPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A612MaqHorPro), 2, 0));
         A615MaqMinPro = T01OS9_A615MaqMinPro[0] ;
         n615MaqMinPro = T01OS9_n615MaqMinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A615MaqMinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A615MaqMinPro), 2, 0));
         A620MaqTip = T01OS9_A620MaqTip[0] ;
         n620MaqTip = T01OS9_n620MaqTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620MaqTip", A620MaqTip);
         A607MaqEst = T01OS9_A607MaqEst[0] ;
         n607MaqEst = T01OS9_n607MaqEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607MaqEst", A607MaqEst);
         A407EmprNom = T01OS9_A407EmprNom[0] ;
         n407EmprNom = T01OS9_n407EmprNom[0] ;
         A621MaqUltFec = T01OS9_A621MaqUltFec[0] ;
         n621MaqUltFec = T01OS9_n621MaqUltFec[0] ;
         A617MaqResDia = T01OS9_A617MaqResDia[0] ;
         n617MaqResDia = T01OS9_n617MaqResDia[0] ;
         A611MaqHorAsi = T01OS9_A611MaqHorAsi[0] ;
         n611MaqHorAsi = T01OS9_n611MaqHorAsi[0] ;
         A616MaqOrdSeq = T01OS9_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = T01OS9_n616MaqOrdSeq[0] ;
         A622MaqUltLin = T01OS9_A622MaqUltLin[0] ;
         n622MaqUltLin = T01OS9_n622MaqUltLin[0] ;
         A1012TipMaqDsc = T01OS9_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = T01OS9_n1012TipMaqDsc[0] ;
         A4282MaqFormul = T01OS9_A4282MaqFormul[0] ;
         n4282MaqFormul = T01OS9_n4282MaqFormul[0] ;
         A4283MaqKgsMin = T01OS9_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = T01OS9_n4283MaqKgsMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
         A4284MaqKgsMed = T01OS9_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = T01OS9_n4284MaqKgsMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4284MaqKgsMed", GXutil.ltrimstr( A4284MaqKgsMed, 9, 2));
         A4285MaqKgsMax = T01OS9_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = T01OS9_n4285MaqKgsMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
         A4319MaqPrdMin = T01OS9_A4319MaqPrdMin[0] ;
         n4319MaqPrdMin = T01OS9_n4319MaqPrdMin[0] ;
         A4320MaqPrdMed = T01OS9_A4320MaqPrdMed[0] ;
         n4320MaqPrdMed = T01OS9_n4320MaqPrdMed[0] ;
         A4321MaqPrdMax = T01OS9_A4321MaqPrdMax[0] ;
         n4321MaqPrdMax = T01OS9_n4321MaqPrdMax[0] ;
         A623MaqVolMax = T01OS9_A623MaqVolMax[0] ;
         n623MaqVolMax = T01OS9_n623MaqVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
         A625MaqVolMin = T01OS9_A625MaqVolMin[0] ;
         n625MaqVolMin = T01OS9_n625MaqVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
         A624MaqVolMed = T01OS9_A624MaqVolMed[0] ;
         n624MaqVolMed = T01OS9_n624MaqVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
         A2801MaqVolRes = T01OS9_A2801MaqVolRes[0] ;
         n2801MaqVolRes = T01OS9_n2801MaqVolRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2801MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2801MaqVolRes), 5, 0));
         A2802MaqVolTop = T01OS9_A2802MaqVolTop[0] ;
         n2802MaqVolTop = T01OS9_n2802MaqVolTop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2802MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2802MaqVolTop), 5, 0));
         A618MaqTemMax = T01OS9_A618MaqTemMax[0] ;
         n618MaqTemMax = T01OS9_n618MaqTemMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
         A601MaqChp = T01OS9_A601MaqChp[0] ;
         n601MaqChp = T01OS9_n601MaqChp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
         A619MaqTinTip = T01OS9_A619MaqTinTip[0] ;
         n619MaqTinTip = T01OS9_n619MaqTinTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619MaqTinTip", A619MaqTinTip);
         A2391MaqMicro = T01OS9_A2391MaqMicro[0] ;
         n2391MaqMicro = T01OS9_n2391MaqMicro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2391MaqMicro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2391MaqMicro), 2, 0));
         A3598MaqNroTub = T01OS9_A3598MaqNroTub[0] ;
         n3598MaqNroTub = T01OS9_n3598MaqNroTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3598MaqNroTub", GXutil.str( A3598MaqNroTub, 1, 0));
         A5292MaqCodBan = T01OS9_A5292MaqCodBan[0] ;
         n5292MaqCodBan = T01OS9_n5292MaqCodBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5292MaqCodBan", A5292MaqCodBan);
         A5419MaqSalM = T01OS9_A5419MaqSalM[0] ;
         n5419MaqSalM = T01OS9_n5419MaqSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
         A5420MaqSalMKi = T01OS9_A5420MaqSalMKi[0] ;
         n5420MaqSalMKi = T01OS9_n5420MaqSalMKi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5420MaqSalMKi", GXutil.ltrimstr( A5420MaqSalMKi, 11, 3));
         A5421MaqSalMKf = T01OS9_A5421MaqSalMKf[0] ;
         n5421MaqSalMKf = T01OS9_n5421MaqSalMKf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5421MaqSalMKf", GXutil.ltrimstr( A5421MaqSalMKf, 11, 3));
         A5463MaqCantCor = T01OS9_A5463MaqCantCor[0] ;
         n5463MaqCantCor = T01OS9_n5463MaqCantCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5463MaqCantCor", GXutil.ltrimstr( A5463MaqCantCor, 11, 3));
         A5593MaqTipCen = T01OS9_A5593MaqTipCen[0] ;
         n5593MaqTipCen = T01OS9_n5593MaqTipCen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5593MaqTipCen", A5593MaqTipCen);
         A5949MaqDosifP = T01OS9_A5949MaqDosifP[0] ;
         n5949MaqDosifP = T01OS9_n5949MaqDosifP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
         A5950MaqDteCol = T01OS9_A5950MaqDteCol[0] ;
         n5950MaqDteCol = T01OS9_n5950MaqDteCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5950MaqDteCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5950MaqDteCol), 5, 0));
         A604MaqCodFor = T01OS9_A604MaqCodFor[0] ;
         n604MaqCodFor = T01OS9_n604MaqCodFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A604MaqCodFor", A604MaqCodFor);
         A6284MaqFacAbs = T01OS9_A6284MaqFacAbs[0] ;
         n6284MaqFacAbs = T01OS9_n6284MaqFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6284MaqFacAbs", GXutil.ltrimstr( A6284MaqFacAbs, 6, 2));
         A6399MaqKgsId = T01OS9_A6399MaqKgsId[0] ;
         n6399MaqKgsId = T01OS9_n6399MaqKgsId[0] ;
         A6432MaqPln = T01OS9_A6432MaqPln[0] ;
         n6432MaqPln = T01OS9_n6432MaqPln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6432MaqPln", GXutil.str( A6432MaqPln, 1, 0));
         A6433MaqPlnVis = T01OS9_A6433MaqPlnVis[0] ;
         n6433MaqPlnVis = T01OS9_n6433MaqPlnVis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6433MaqPlnVis", GXutil.str( A6433MaqPlnVis, 1, 0));
         A6454MaqConFas = T01OS9_A6454MaqConFas[0] ;
         n6454MaqConFas = T01OS9_n6454MaqConFas[0] ;
         A8056MaqVaril = T01OS9_A8056MaqVaril[0] ;
         n8056MaqVaril = T01OS9_n8056MaqVaril[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
         A3599MaqRelBan = T01OS9_A3599MaqRelBan[0] ;
         n3599MaqRelBan = T01OS9_n3599MaqRelBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3599MaqRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3599MaqRelBan), 2, 0));
         A8657MaqLoc = T01OS9_A8657MaqLoc[0] ;
         n8657MaqLoc = T01OS9_n8657MaqLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8657MaqLoc", A8657MaqLoc);
         A9626MaqObs = T01OS9_A9626MaqObs[0] ;
         n9626MaqObs = T01OS9_n9626MaqObs[0] ;
         A9982MaqFabsHm = T01OS9_A9982MaqFabsHm[0] ;
         n9982MaqFabsHm = T01OS9_n9982MaqFabsHm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9982MaqFabsHm", GXutil.ltrimstr( A9982MaqFabsHm, 6, 2));
         A1027MaqHhCon = T01OS9_A1027MaqHhCon[0] ;
         n1027MaqHhCon = T01OS9_n1027MaqHhCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1027MaqHhCon", GXutil.ltrimstr( A1027MaqHhCon, 10, 2));
         A1026MaqHhCtr = T01OS9_A1026MaqHhCtr[0] ;
         n1026MaqHhCtr = T01OS9_n1026MaqHhCtr[0] ;
         A3600MaqVolBal = T01OS9_A3600MaqVolBal[0] ;
         n3600MaqVolBal = T01OS9_n3600MaqVolBal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3600MaqVolBal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3600MaqVolBal), 5, 0));
         A3684MaqCosGen = T01OS9_A3684MaqCosGen[0] ;
         n3684MaqCosGen = T01OS9_n3684MaqCosGen[0] ;
         A11727MaqOgtDsc = T01OS9_A11727MaqOgtDsc[0] ;
         A11821MaqMOD = T01OS9_A11821MaqMOD[0] ;
         n11821MaqMOD = T01OS9_n11821MaqMOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11821MaqMOD", GXutil.ltrimstr( A11821MaqMOD, 10, 4));
         A11822MaqMOI = T01OS9_A11822MaqMOI[0] ;
         n11822MaqMOI = T01OS9_n11822MaqMOI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11822MaqMOI", GXutil.ltrimstr( A11822MaqMOI, 10, 4));
         A11823MaqEnerg = T01OS9_A11823MaqEnerg[0] ;
         n11823MaqEnerg = T01OS9_n11823MaqEnerg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11823MaqEnerg", GXutil.ltrimstr( A11823MaqEnerg, 10, 4));
         A11824MaqGas = T01OS9_A11824MaqGas[0] ;
         n11824MaqGas = T01OS9_n11824MaqGas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11824MaqGas", GXutil.ltrimstr( A11824MaqGas, 10, 4));
         A11825MaqAgua = T01OS9_A11825MaqAgua[0] ;
         n11825MaqAgua = T01OS9_n11825MaqAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11825MaqAgua", GXutil.ltrimstr( A11825MaqAgua, 10, 4));
         A13020MaqTmCarg = T01OS9_A13020MaqTmCarg[0] ;
         n13020MaqTmCarg = T01OS9_n13020MaqTmCarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13020MaqTmCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13020MaqTmCarg), 4, 0));
         A13021MaqTmDcarg = T01OS9_A13021MaqTmDcarg[0] ;
         n13021MaqTmDcarg = T01OS9_n13021MaqTmDcarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13021MaqTmDcarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13021MaqTmDcarg), 4, 0));
         A13022MaqMtsMn = T01OS9_A13022MaqMtsMn[0] ;
         n13022MaqMtsMn = T01OS9_n13022MaqMtsMn[0] ;
         A13023MaqMtsMx = T01OS9_A13023MaqMtsMx[0] ;
         n13023MaqMtsMx = T01OS9_n13023MaqMtsMx[0] ;
         A13179MaqCosFijo = T01OS9_A13179MaqCosFijo[0] ;
         n13179MaqCosFijo = T01OS9_n13179MaqCosFijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13179MaqCosFijo", GXutil.ltrimstr( A13179MaqCosFijo, 10, 4));
         A13180MaqCosKg = T01OS9_A13180MaqCosKg[0] ;
         n13180MaqCosKg = T01OS9_n13180MaqCosKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13180MaqCosKg", GXutil.ltrimstr( A13180MaqCosKg, 10, 4));
         A14289MaqCuerdas = T01OS9_A14289MaqCuerdas[0] ;
         n14289MaqCuerdas = T01OS9_n14289MaqCuerdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14289MaqCuerdas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14289MaqCuerdas), 4, 0));
         A1011TipMaqCod = T01OS9_A1011TipMaqCod[0] ;
         n1011TipMaqCod = T01OS9_n1011TipMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
         A11726MaqOgtId = T01OS9_A11726MaqOgtId[0] ;
         n11726MaqOgtId = T01OS9_n11726MaqOgtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
         zm1OS65( -66) ;
      }
      pr_default.close(7);
      onLoadActions1OS65( ) ;
   }

   public void onLoadActions1OS65( )
   {
      A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
      A12123MaqCosMm = A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11825MaqAgua).add(A11824MaqGas) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12123MaqCosMm", GXutil.ltrimstr( A12123MaqCosMm, 10, 4));
   }

   public void checkExtendedTable1OS65( )
   {
      nIsDirty_65 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_65 = (short)(1) ;
      A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
      if ( ! ( ( ( A612MaqHorPro >= 0 ) && ( A612MaqHorPro <= 24 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Horas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "MAQHORPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHorPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A615MaqMinPro >= 0 ) && ( A615MaqMinPro <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "MAQMINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMinPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A620MaqTip, "G") == 0 ) || ( GXutil.strcmp(A620MaqTip, "E") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo Maquina", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "MAQTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMaqTip.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A607MaqEst, "A") == 0 ) || ( GXutil.strcmp(A607MaqEst, "I") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Maquina", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "MAQEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMaqEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A601MaqChp, "S") == 0 ) || ( GXutil.strcmp(A601MaqChp, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Acoplada?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "MAQCHP");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMaqChp.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3601MaqTipMaq, "A") == 0 ) || ( GXutil.strcmp(A3601MaqTipMaq, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo Maquina", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "MAQTIPMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTipMaq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_65 = (short)(1) ;
      A12123MaqCosMm = A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11825MaqAgua).add(A11824MaqGas) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12123MaqCosMm", GXutil.ltrimstr( A12123MaqCosMm, 10, 4));
      /* Using cursor T01OS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n1011TipMaqCod), A1011TipMaqCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1011TipMaqCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMAQCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipMaqCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1012TipMaqDsc = T01OS7_A1012TipMaqDsc[0] ;
      n1012TipMaqDsc = T01OS7_n1012TipMaqDsc[0] ;
      pr_default.close(5);
      /* Using cursor T01OS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11726MaqOgtId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUINS ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQOGTID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqOgtId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11727MaqOgtDsc = T01OS8_A11727MaqOgtDsc[0] ;
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1OS65( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_68( String A396EmprCod ,
                          String A1011TipMaqCod )
   {
      /* Using cursor T01OS10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n1011TipMaqCod), A1011TipMaqCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1011TipMaqCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMAQCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipMaqCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1012TipMaqDsc = T01OS10_A1012TipMaqDsc[0] ;
      n1012TipMaqDsc = T01OS10_n1012TipMaqDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1012TipMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_69( String A396EmprCod ,
                          String A11726MaqOgtId )
   {
      /* Using cursor T01OS11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11726MaqOgtId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUINS ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQOGTID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqOgtId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11727MaqOgtDsc = T01OS11_A11727MaqOgtDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11727MaqOgtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1OS65( )
   {
      /* Using cursor T01OS12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01OS5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OS65( 66) ;
         RcdFound65 = (short)(1) ;
         A602MaqCod = T01OS5_A602MaqCod[0] ;
         n602MaqCod = T01OS5_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A3601MaqTipMaq = T01OS5_A3601MaqTipMaq[0] ;
         n3601MaqTipMaq = T01OS5_n3601MaqTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3601MaqTipMaq", A3601MaqTipMaq);
         A606MaqDsc = T01OS5_A606MaqDsc[0] ;
         n606MaqDsc = T01OS5_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A14288MaqDscLarg = T01OS5_A14288MaqDscLarg[0] ;
         n14288MaqDscLarg = T01OS5_n14288MaqDscLarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14288MaqDscLarg", A14288MaqDscLarg);
         A600MaqCap = T01OS5_A600MaqCap[0] ;
         n600MaqCap = T01OS5_n600MaqCap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A600MaqCap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A600MaqCap), 6, 0));
         A605MaqCosMin = T01OS5_A605MaqCosMin[0] ;
         n605MaqCosMin = T01OS5_n605MaqCosMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A605MaqCosMin", GXutil.ltrimstr( A605MaqCosMin, 10, 4));
         A612MaqHorPro = T01OS5_A612MaqHorPro[0] ;
         n612MaqHorPro = T01OS5_n612MaqHorPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612MaqHorPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A612MaqHorPro), 2, 0));
         A615MaqMinPro = T01OS5_A615MaqMinPro[0] ;
         n615MaqMinPro = T01OS5_n615MaqMinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A615MaqMinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A615MaqMinPro), 2, 0));
         A620MaqTip = T01OS5_A620MaqTip[0] ;
         n620MaqTip = T01OS5_n620MaqTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620MaqTip", A620MaqTip);
         A607MaqEst = T01OS5_A607MaqEst[0] ;
         n607MaqEst = T01OS5_n607MaqEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607MaqEst", A607MaqEst);
         A621MaqUltFec = T01OS5_A621MaqUltFec[0] ;
         n621MaqUltFec = T01OS5_n621MaqUltFec[0] ;
         A617MaqResDia = T01OS5_A617MaqResDia[0] ;
         n617MaqResDia = T01OS5_n617MaqResDia[0] ;
         A611MaqHorAsi = T01OS5_A611MaqHorAsi[0] ;
         n611MaqHorAsi = T01OS5_n611MaqHorAsi[0] ;
         A616MaqOrdSeq = T01OS5_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = T01OS5_n616MaqOrdSeq[0] ;
         A622MaqUltLin = T01OS5_A622MaqUltLin[0] ;
         n622MaqUltLin = T01OS5_n622MaqUltLin[0] ;
         A4282MaqFormul = T01OS5_A4282MaqFormul[0] ;
         n4282MaqFormul = T01OS5_n4282MaqFormul[0] ;
         A4283MaqKgsMin = T01OS5_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = T01OS5_n4283MaqKgsMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
         A4284MaqKgsMed = T01OS5_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = T01OS5_n4284MaqKgsMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4284MaqKgsMed", GXutil.ltrimstr( A4284MaqKgsMed, 9, 2));
         A4285MaqKgsMax = T01OS5_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = T01OS5_n4285MaqKgsMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
         A4319MaqPrdMin = T01OS5_A4319MaqPrdMin[0] ;
         n4319MaqPrdMin = T01OS5_n4319MaqPrdMin[0] ;
         A4320MaqPrdMed = T01OS5_A4320MaqPrdMed[0] ;
         n4320MaqPrdMed = T01OS5_n4320MaqPrdMed[0] ;
         A4321MaqPrdMax = T01OS5_A4321MaqPrdMax[0] ;
         n4321MaqPrdMax = T01OS5_n4321MaqPrdMax[0] ;
         A623MaqVolMax = T01OS5_A623MaqVolMax[0] ;
         n623MaqVolMax = T01OS5_n623MaqVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
         A625MaqVolMin = T01OS5_A625MaqVolMin[0] ;
         n625MaqVolMin = T01OS5_n625MaqVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
         A624MaqVolMed = T01OS5_A624MaqVolMed[0] ;
         n624MaqVolMed = T01OS5_n624MaqVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
         A2801MaqVolRes = T01OS5_A2801MaqVolRes[0] ;
         n2801MaqVolRes = T01OS5_n2801MaqVolRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2801MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2801MaqVolRes), 5, 0));
         A2802MaqVolTop = T01OS5_A2802MaqVolTop[0] ;
         n2802MaqVolTop = T01OS5_n2802MaqVolTop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2802MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2802MaqVolTop), 5, 0));
         A618MaqTemMax = T01OS5_A618MaqTemMax[0] ;
         n618MaqTemMax = T01OS5_n618MaqTemMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
         A601MaqChp = T01OS5_A601MaqChp[0] ;
         n601MaqChp = T01OS5_n601MaqChp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
         A619MaqTinTip = T01OS5_A619MaqTinTip[0] ;
         n619MaqTinTip = T01OS5_n619MaqTinTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619MaqTinTip", A619MaqTinTip);
         A2391MaqMicro = T01OS5_A2391MaqMicro[0] ;
         n2391MaqMicro = T01OS5_n2391MaqMicro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2391MaqMicro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2391MaqMicro), 2, 0));
         A3598MaqNroTub = T01OS5_A3598MaqNroTub[0] ;
         n3598MaqNroTub = T01OS5_n3598MaqNroTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3598MaqNroTub", GXutil.str( A3598MaqNroTub, 1, 0));
         A5292MaqCodBan = T01OS5_A5292MaqCodBan[0] ;
         n5292MaqCodBan = T01OS5_n5292MaqCodBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5292MaqCodBan", A5292MaqCodBan);
         A5419MaqSalM = T01OS5_A5419MaqSalM[0] ;
         n5419MaqSalM = T01OS5_n5419MaqSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
         A5420MaqSalMKi = T01OS5_A5420MaqSalMKi[0] ;
         n5420MaqSalMKi = T01OS5_n5420MaqSalMKi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5420MaqSalMKi", GXutil.ltrimstr( A5420MaqSalMKi, 11, 3));
         A5421MaqSalMKf = T01OS5_A5421MaqSalMKf[0] ;
         n5421MaqSalMKf = T01OS5_n5421MaqSalMKf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5421MaqSalMKf", GXutil.ltrimstr( A5421MaqSalMKf, 11, 3));
         A5463MaqCantCor = T01OS5_A5463MaqCantCor[0] ;
         n5463MaqCantCor = T01OS5_n5463MaqCantCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5463MaqCantCor", GXutil.ltrimstr( A5463MaqCantCor, 11, 3));
         A5593MaqTipCen = T01OS5_A5593MaqTipCen[0] ;
         n5593MaqTipCen = T01OS5_n5593MaqTipCen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5593MaqTipCen", A5593MaqTipCen);
         A5949MaqDosifP = T01OS5_A5949MaqDosifP[0] ;
         n5949MaqDosifP = T01OS5_n5949MaqDosifP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
         A5950MaqDteCol = T01OS5_A5950MaqDteCol[0] ;
         n5950MaqDteCol = T01OS5_n5950MaqDteCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5950MaqDteCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5950MaqDteCol), 5, 0));
         A604MaqCodFor = T01OS5_A604MaqCodFor[0] ;
         n604MaqCodFor = T01OS5_n604MaqCodFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A604MaqCodFor", A604MaqCodFor);
         A6284MaqFacAbs = T01OS5_A6284MaqFacAbs[0] ;
         n6284MaqFacAbs = T01OS5_n6284MaqFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6284MaqFacAbs", GXutil.ltrimstr( A6284MaqFacAbs, 6, 2));
         A6399MaqKgsId = T01OS5_A6399MaqKgsId[0] ;
         n6399MaqKgsId = T01OS5_n6399MaqKgsId[0] ;
         A6432MaqPln = T01OS5_A6432MaqPln[0] ;
         n6432MaqPln = T01OS5_n6432MaqPln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6432MaqPln", GXutil.str( A6432MaqPln, 1, 0));
         A6433MaqPlnVis = T01OS5_A6433MaqPlnVis[0] ;
         n6433MaqPlnVis = T01OS5_n6433MaqPlnVis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6433MaqPlnVis", GXutil.str( A6433MaqPlnVis, 1, 0));
         A6454MaqConFas = T01OS5_A6454MaqConFas[0] ;
         n6454MaqConFas = T01OS5_n6454MaqConFas[0] ;
         A8056MaqVaril = T01OS5_A8056MaqVaril[0] ;
         n8056MaqVaril = T01OS5_n8056MaqVaril[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
         A3599MaqRelBan = T01OS5_A3599MaqRelBan[0] ;
         n3599MaqRelBan = T01OS5_n3599MaqRelBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3599MaqRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3599MaqRelBan), 2, 0));
         A8657MaqLoc = T01OS5_A8657MaqLoc[0] ;
         n8657MaqLoc = T01OS5_n8657MaqLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8657MaqLoc", A8657MaqLoc);
         A9626MaqObs = T01OS5_A9626MaqObs[0] ;
         n9626MaqObs = T01OS5_n9626MaqObs[0] ;
         A9982MaqFabsHm = T01OS5_A9982MaqFabsHm[0] ;
         n9982MaqFabsHm = T01OS5_n9982MaqFabsHm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9982MaqFabsHm", GXutil.ltrimstr( A9982MaqFabsHm, 6, 2));
         A1027MaqHhCon = T01OS5_A1027MaqHhCon[0] ;
         n1027MaqHhCon = T01OS5_n1027MaqHhCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1027MaqHhCon", GXutil.ltrimstr( A1027MaqHhCon, 10, 2));
         A1026MaqHhCtr = T01OS5_A1026MaqHhCtr[0] ;
         n1026MaqHhCtr = T01OS5_n1026MaqHhCtr[0] ;
         A3600MaqVolBal = T01OS5_A3600MaqVolBal[0] ;
         n3600MaqVolBal = T01OS5_n3600MaqVolBal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3600MaqVolBal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3600MaqVolBal), 5, 0));
         A3684MaqCosGen = T01OS5_A3684MaqCosGen[0] ;
         n3684MaqCosGen = T01OS5_n3684MaqCosGen[0] ;
         A11821MaqMOD = T01OS5_A11821MaqMOD[0] ;
         n11821MaqMOD = T01OS5_n11821MaqMOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11821MaqMOD", GXutil.ltrimstr( A11821MaqMOD, 10, 4));
         A11822MaqMOI = T01OS5_A11822MaqMOI[0] ;
         n11822MaqMOI = T01OS5_n11822MaqMOI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11822MaqMOI", GXutil.ltrimstr( A11822MaqMOI, 10, 4));
         A11823MaqEnerg = T01OS5_A11823MaqEnerg[0] ;
         n11823MaqEnerg = T01OS5_n11823MaqEnerg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11823MaqEnerg", GXutil.ltrimstr( A11823MaqEnerg, 10, 4));
         A11824MaqGas = T01OS5_A11824MaqGas[0] ;
         n11824MaqGas = T01OS5_n11824MaqGas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11824MaqGas", GXutil.ltrimstr( A11824MaqGas, 10, 4));
         A11825MaqAgua = T01OS5_A11825MaqAgua[0] ;
         n11825MaqAgua = T01OS5_n11825MaqAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11825MaqAgua", GXutil.ltrimstr( A11825MaqAgua, 10, 4));
         A13020MaqTmCarg = T01OS5_A13020MaqTmCarg[0] ;
         n13020MaqTmCarg = T01OS5_n13020MaqTmCarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13020MaqTmCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13020MaqTmCarg), 4, 0));
         A13021MaqTmDcarg = T01OS5_A13021MaqTmDcarg[0] ;
         n13021MaqTmDcarg = T01OS5_n13021MaqTmDcarg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13021MaqTmDcarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13021MaqTmDcarg), 4, 0));
         A13022MaqMtsMn = T01OS5_A13022MaqMtsMn[0] ;
         n13022MaqMtsMn = T01OS5_n13022MaqMtsMn[0] ;
         A13023MaqMtsMx = T01OS5_A13023MaqMtsMx[0] ;
         n13023MaqMtsMx = T01OS5_n13023MaqMtsMx[0] ;
         A13179MaqCosFijo = T01OS5_A13179MaqCosFijo[0] ;
         n13179MaqCosFijo = T01OS5_n13179MaqCosFijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13179MaqCosFijo", GXutil.ltrimstr( A13179MaqCosFijo, 10, 4));
         A13180MaqCosKg = T01OS5_A13180MaqCosKg[0] ;
         n13180MaqCosKg = T01OS5_n13180MaqCosKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13180MaqCosKg", GXutil.ltrimstr( A13180MaqCosKg, 10, 4));
         A14289MaqCuerdas = T01OS5_A14289MaqCuerdas[0] ;
         n14289MaqCuerdas = T01OS5_n14289MaqCuerdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14289MaqCuerdas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14289MaqCuerdas), 4, 0));
         A1011TipMaqCod = T01OS5_A1011TipMaqCod[0] ;
         n1011TipMaqCod = T01OS5_n1011TipMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
         A11726MaqOgtId = T01OS5_A11726MaqOgtId[0] ;
         n11726MaqOgtId = T01OS5_n11726MaqOgtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
         O622MaqUltLin = A622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1OS65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey1OS65( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey1OS65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1OS65( ) ;
      if ( RcdFound65 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T01OS13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01OS13_A602MaqCod[0], A602MaqCod) < 0 ) ) && ( GXutil.strcmp(T01OS13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01OS13_A602MaqCod[0], A602MaqCod) > 0 ) ) && ( GXutil.strcmp(T01OS13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T01OS13_A602MaqCod[0] ;
            n602MaqCod = T01OS13_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T01OS14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01OS14_A602MaqCod[0], A602MaqCod) > 0 ) ) && ( GXutil.strcmp(T01OS14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01OS14_A602MaqCod[0], A602MaqCod) < 0 ) ) && ( GXutil.strcmp(T01OS14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T01OS14_A602MaqCod[0] ;
            n602MaqCod = T01OS14_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OS65( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A622MaqUltLin = O622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OS65( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               A602MaqCod = Z602MaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MAQCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A622MaqUltLin = O622MaqUltLin ;
               n622MaqUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A622MaqUltLin = O622MaqUltLin ;
               n622MaqUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
               update1OS65( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               /* Insert record */
               A622MaqUltLin = O622MaqUltLin ;
               n622MaqUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OS65( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MAQCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A622MaqUltLin = O622MaqUltLin ;
                  n622MaqUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OS65( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
      {
         A602MaqCod = Z602MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A622MaqUltLin = O622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1OS65( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OS4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z3601MaqTipMaq, T01OS4_A3601MaqTipMaq[0]) != 0 ) || ( GXutil.strcmp(Z606MaqDsc, T01OS4_A606MaqDsc[0]) != 0 ) || ( GXutil.strcmp(Z14288MaqDscLarg, T01OS4_A14288MaqDscLarg[0]) != 0 ) || ( Z600MaqCap != T01OS4_A600MaqCap[0] ) || ( DecimalUtil.compareTo(Z605MaqCosMin, T01OS4_A605MaqCosMin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z612MaqHorPro != T01OS4_A612MaqHorPro[0] ) || ( Z615MaqMinPro != T01OS4_A615MaqMinPro[0] ) || ( GXutil.strcmp(Z620MaqTip, T01OS4_A620MaqTip[0]) != 0 ) || ( GXutil.strcmp(Z607MaqEst, T01OS4_A607MaqEst[0]) != 0 ) || ( GXutil.strcmp(Z621MaqUltFec, T01OS4_A621MaqUltFec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z617MaqResDia, T01OS4_A617MaqResDia[0]) != 0 ) || ( DecimalUtil.compareTo(Z611MaqHorAsi, T01OS4_A611MaqHorAsi[0]) != 0 ) || ( Z616MaqOrdSeq != T01OS4_A616MaqOrdSeq[0] ) || ( Z622MaqUltLin != T01OS4_A622MaqUltLin[0] ) || ( GXutil.strcmp(Z4282MaqFormul, T01OS4_A4282MaqFormul[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4283MaqKgsMin, T01OS4_A4283MaqKgsMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z4284MaqKgsMed, T01OS4_A4284MaqKgsMed[0]) != 0 ) || ( DecimalUtil.compareTo(Z4285MaqKgsMax, T01OS4_A4285MaqKgsMax[0]) != 0 ) || ( Z4319MaqPrdMin != T01OS4_A4319MaqPrdMin[0] ) || ( Z4320MaqPrdMed != T01OS4_A4320MaqPrdMed[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4321MaqPrdMax != T01OS4_A4321MaqPrdMax[0] ) || ( Z623MaqVolMax != T01OS4_A623MaqVolMax[0] ) || ( Z625MaqVolMin != T01OS4_A625MaqVolMin[0] ) || ( Z624MaqVolMed != T01OS4_A624MaqVolMed[0] ) || ( Z2801MaqVolRes != T01OS4_A2801MaqVolRes[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2802MaqVolTop != T01OS4_A2802MaqVolTop[0] ) || ( Z618MaqTemMax != T01OS4_A618MaqTemMax[0] ) || ( GXutil.strcmp(Z601MaqChp, T01OS4_A601MaqChp[0]) != 0 ) || ( GXutil.strcmp(Z619MaqTinTip, T01OS4_A619MaqTinTip[0]) != 0 ) || ( Z2391MaqMicro != T01OS4_A2391MaqMicro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3598MaqNroTub != T01OS4_A3598MaqNroTub[0] ) || ( GXutil.strcmp(Z5292MaqCodBan, T01OS4_A5292MaqCodBan[0]) != 0 ) || ( GXutil.strcmp(Z5419MaqSalM, T01OS4_A5419MaqSalM[0]) != 0 ) || ( DecimalUtil.compareTo(Z5420MaqSalMKi, T01OS4_A5420MaqSalMKi[0]) != 0 ) || ( DecimalUtil.compareTo(Z5421MaqSalMKf, T01OS4_A5421MaqSalMKf[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5463MaqCantCor, T01OS4_A5463MaqCantCor[0]) != 0 ) || ( GXutil.strcmp(Z5593MaqTipCen, T01OS4_A5593MaqTipCen[0]) != 0 ) || ( GXutil.strcmp(Z5949MaqDosifP, T01OS4_A5949MaqDosifP[0]) != 0 ) || ( Z5950MaqDteCol != T01OS4_A5950MaqDteCol[0] ) || ( GXutil.strcmp(Z604MaqCodFor, T01OS4_A604MaqCodFor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6284MaqFacAbs, T01OS4_A6284MaqFacAbs[0]) != 0 ) || ( DecimalUtil.compareTo(Z6399MaqKgsId, T01OS4_A6399MaqKgsId[0]) != 0 ) || ( Z6432MaqPln != T01OS4_A6432MaqPln[0] ) || ( Z6433MaqPlnVis != T01OS4_A6433MaqPlnVis[0] ) || ( Z6454MaqConFas != T01OS4_A6454MaqConFas[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8056MaqVaril, T01OS4_A8056MaqVaril[0]) != 0 ) || ( Z3599MaqRelBan != T01OS4_A3599MaqRelBan[0] ) || ( GXutil.strcmp(Z8657MaqLoc, T01OS4_A8657MaqLoc[0]) != 0 ) || ( GXutil.strcmp(Z9626MaqObs, T01OS4_A9626MaqObs[0]) != 0 ) || ( DecimalUtil.compareTo(Z9982MaqFabsHm, T01OS4_A9982MaqFabsHm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1027MaqHhCon, T01OS4_A1027MaqHhCon[0]) != 0 ) || ( GXutil.strcmp(Z1026MaqHhCtr, T01OS4_A1026MaqHhCtr[0]) != 0 ) || ( Z3600MaqVolBal != T01OS4_A3600MaqVolBal[0] ) || ( DecimalUtil.compareTo(Z3684MaqCosGen, T01OS4_A3684MaqCosGen[0]) != 0 ) || ( DecimalUtil.compareTo(Z11821MaqMOD, T01OS4_A11821MaqMOD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11822MaqMOI, T01OS4_A11822MaqMOI[0]) != 0 ) || ( DecimalUtil.compareTo(Z11823MaqEnerg, T01OS4_A11823MaqEnerg[0]) != 0 ) || ( DecimalUtil.compareTo(Z11824MaqGas, T01OS4_A11824MaqGas[0]) != 0 ) || ( DecimalUtil.compareTo(Z11825MaqAgua, T01OS4_A11825MaqAgua[0]) != 0 ) || ( Z13020MaqTmCarg != T01OS4_A13020MaqTmCarg[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13021MaqTmDcarg != T01OS4_A13021MaqTmDcarg[0] ) || ( DecimalUtil.compareTo(Z13022MaqMtsMn, T01OS4_A13022MaqMtsMn[0]) != 0 ) || ( DecimalUtil.compareTo(Z13023MaqMtsMx, T01OS4_A13023MaqMtsMx[0]) != 0 ) || ( DecimalUtil.compareTo(Z13179MaqCosFijo, T01OS4_A13179MaqCosFijo[0]) != 0 ) || ( DecimalUtil.compareTo(Z13180MaqCosKg, T01OS4_A13180MaqCosKg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14289MaqCuerdas != T01OS4_A14289MaqCuerdas[0] ) || ( GXutil.strcmp(Z1011TipMaqCod, T01OS4_A1011TipMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z11726MaqOgtId, T01OS4_A11726MaqOgtId[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3601MaqTipMaq, T01OS4_A3601MaqTipMaq[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqTipMaq");
               GXutil.writeLogRaw("Old: ",Z3601MaqTipMaq);
               GXutil.writeLogRaw("Current: ",T01OS4_A3601MaqTipMaq[0]);
            }
            if ( GXutil.strcmp(Z606MaqDsc, T01OS4_A606MaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqDsc");
               GXutil.writeLogRaw("Old: ",Z606MaqDsc);
               GXutil.writeLogRaw("Current: ",T01OS4_A606MaqDsc[0]);
            }
            if ( GXutil.strcmp(Z14288MaqDscLarg, T01OS4_A14288MaqDscLarg[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqDscLarg");
               GXutil.writeLogRaw("Old: ",Z14288MaqDscLarg);
               GXutil.writeLogRaw("Current: ",T01OS4_A14288MaqDscLarg[0]);
            }
            if ( Z600MaqCap != T01OS4_A600MaqCap[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCap");
               GXutil.writeLogRaw("Old: ",Z600MaqCap);
               GXutil.writeLogRaw("Current: ",T01OS4_A600MaqCap[0]);
            }
            if ( DecimalUtil.compareTo(Z605MaqCosMin, T01OS4_A605MaqCosMin[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCosMin");
               GXutil.writeLogRaw("Old: ",Z605MaqCosMin);
               GXutil.writeLogRaw("Current: ",T01OS4_A605MaqCosMin[0]);
            }
            if ( Z612MaqHorPro != T01OS4_A612MaqHorPro[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqHorPro");
               GXutil.writeLogRaw("Old: ",Z612MaqHorPro);
               GXutil.writeLogRaw("Current: ",T01OS4_A612MaqHorPro[0]);
            }
            if ( Z615MaqMinPro != T01OS4_A615MaqMinPro[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqMinPro");
               GXutil.writeLogRaw("Old: ",Z615MaqMinPro);
               GXutil.writeLogRaw("Current: ",T01OS4_A615MaqMinPro[0]);
            }
            if ( GXutil.strcmp(Z620MaqTip, T01OS4_A620MaqTip[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqTip");
               GXutil.writeLogRaw("Old: ",Z620MaqTip);
               GXutil.writeLogRaw("Current: ",T01OS4_A620MaqTip[0]);
            }
            if ( GXutil.strcmp(Z607MaqEst, T01OS4_A607MaqEst[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqEst");
               GXutil.writeLogRaw("Old: ",Z607MaqEst);
               GXutil.writeLogRaw("Current: ",T01OS4_A607MaqEst[0]);
            }
            if ( GXutil.strcmp(Z621MaqUltFec, T01OS4_A621MaqUltFec[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqUltFec");
               GXutil.writeLogRaw("Old: ",Z621MaqUltFec);
               GXutil.writeLogRaw("Current: ",T01OS4_A621MaqUltFec[0]);
            }
            if ( DecimalUtil.compareTo(Z617MaqResDia, T01OS4_A617MaqResDia[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqResDia");
               GXutil.writeLogRaw("Old: ",Z617MaqResDia);
               GXutil.writeLogRaw("Current: ",T01OS4_A617MaqResDia[0]);
            }
            if ( DecimalUtil.compareTo(Z611MaqHorAsi, T01OS4_A611MaqHorAsi[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqHorAsi");
               GXutil.writeLogRaw("Old: ",Z611MaqHorAsi);
               GXutil.writeLogRaw("Current: ",T01OS4_A611MaqHorAsi[0]);
            }
            if ( Z616MaqOrdSeq != T01OS4_A616MaqOrdSeq[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqOrdSeq");
               GXutil.writeLogRaw("Old: ",Z616MaqOrdSeq);
               GXutil.writeLogRaw("Current: ",T01OS4_A616MaqOrdSeq[0]);
            }
            if ( Z622MaqUltLin != T01OS4_A622MaqUltLin[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqUltLin");
               GXutil.writeLogRaw("Old: ",Z622MaqUltLin);
               GXutil.writeLogRaw("Current: ",T01OS4_A622MaqUltLin[0]);
            }
            if ( GXutil.strcmp(Z4282MaqFormul, T01OS4_A4282MaqFormul[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqFormul");
               GXutil.writeLogRaw("Old: ",Z4282MaqFormul);
               GXutil.writeLogRaw("Current: ",T01OS4_A4282MaqFormul[0]);
            }
            if ( DecimalUtil.compareTo(Z4283MaqKgsMin, T01OS4_A4283MaqKgsMin[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqKgsMin");
               GXutil.writeLogRaw("Old: ",Z4283MaqKgsMin);
               GXutil.writeLogRaw("Current: ",T01OS4_A4283MaqKgsMin[0]);
            }
            if ( DecimalUtil.compareTo(Z4284MaqKgsMed, T01OS4_A4284MaqKgsMed[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqKgsMed");
               GXutil.writeLogRaw("Old: ",Z4284MaqKgsMed);
               GXutil.writeLogRaw("Current: ",T01OS4_A4284MaqKgsMed[0]);
            }
            if ( DecimalUtil.compareTo(Z4285MaqKgsMax, T01OS4_A4285MaqKgsMax[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqKgsMax");
               GXutil.writeLogRaw("Old: ",Z4285MaqKgsMax);
               GXutil.writeLogRaw("Current: ",T01OS4_A4285MaqKgsMax[0]);
            }
            if ( Z4319MaqPrdMin != T01OS4_A4319MaqPrdMin[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqPrdMin");
               GXutil.writeLogRaw("Old: ",Z4319MaqPrdMin);
               GXutil.writeLogRaw("Current: ",T01OS4_A4319MaqPrdMin[0]);
            }
            if ( Z4320MaqPrdMed != T01OS4_A4320MaqPrdMed[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqPrdMed");
               GXutil.writeLogRaw("Old: ",Z4320MaqPrdMed);
               GXutil.writeLogRaw("Current: ",T01OS4_A4320MaqPrdMed[0]);
            }
            if ( Z4321MaqPrdMax != T01OS4_A4321MaqPrdMax[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqPrdMax");
               GXutil.writeLogRaw("Old: ",Z4321MaqPrdMax);
               GXutil.writeLogRaw("Current: ",T01OS4_A4321MaqPrdMax[0]);
            }
            if ( Z623MaqVolMax != T01OS4_A623MaqVolMax[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqVolMax");
               GXutil.writeLogRaw("Old: ",Z623MaqVolMax);
               GXutil.writeLogRaw("Current: ",T01OS4_A623MaqVolMax[0]);
            }
            if ( Z625MaqVolMin != T01OS4_A625MaqVolMin[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqVolMin");
               GXutil.writeLogRaw("Old: ",Z625MaqVolMin);
               GXutil.writeLogRaw("Current: ",T01OS4_A625MaqVolMin[0]);
            }
            if ( Z624MaqVolMed != T01OS4_A624MaqVolMed[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqVolMed");
               GXutil.writeLogRaw("Old: ",Z624MaqVolMed);
               GXutil.writeLogRaw("Current: ",T01OS4_A624MaqVolMed[0]);
            }
            if ( Z2801MaqVolRes != T01OS4_A2801MaqVolRes[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqVolRes");
               GXutil.writeLogRaw("Old: ",Z2801MaqVolRes);
               GXutil.writeLogRaw("Current: ",T01OS4_A2801MaqVolRes[0]);
            }
            if ( Z2802MaqVolTop != T01OS4_A2802MaqVolTop[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqVolTop");
               GXutil.writeLogRaw("Old: ",Z2802MaqVolTop);
               GXutil.writeLogRaw("Current: ",T01OS4_A2802MaqVolTop[0]);
            }
            if ( Z618MaqTemMax != T01OS4_A618MaqTemMax[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqTemMax");
               GXutil.writeLogRaw("Old: ",Z618MaqTemMax);
               GXutil.writeLogRaw("Current: ",T01OS4_A618MaqTemMax[0]);
            }
            if ( GXutil.strcmp(Z601MaqChp, T01OS4_A601MaqChp[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqChp");
               GXutil.writeLogRaw("Old: ",Z601MaqChp);
               GXutil.writeLogRaw("Current: ",T01OS4_A601MaqChp[0]);
            }
            if ( GXutil.strcmp(Z619MaqTinTip, T01OS4_A619MaqTinTip[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqTinTip");
               GXutil.writeLogRaw("Old: ",Z619MaqTinTip);
               GXutil.writeLogRaw("Current: ",T01OS4_A619MaqTinTip[0]);
            }
            if ( Z2391MaqMicro != T01OS4_A2391MaqMicro[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqMicro");
               GXutil.writeLogRaw("Old: ",Z2391MaqMicro);
               GXutil.writeLogRaw("Current: ",T01OS4_A2391MaqMicro[0]);
            }
            if ( Z3598MaqNroTub != T01OS4_A3598MaqNroTub[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqNroTub");
               GXutil.writeLogRaw("Old: ",Z3598MaqNroTub);
               GXutil.writeLogRaw("Current: ",T01OS4_A3598MaqNroTub[0]);
            }
            if ( GXutil.strcmp(Z5292MaqCodBan, T01OS4_A5292MaqCodBan[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCodBan");
               GXutil.writeLogRaw("Old: ",Z5292MaqCodBan);
               GXutil.writeLogRaw("Current: ",T01OS4_A5292MaqCodBan[0]);
            }
            if ( GXutil.strcmp(Z5419MaqSalM, T01OS4_A5419MaqSalM[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqSalM");
               GXutil.writeLogRaw("Old: ",Z5419MaqSalM);
               GXutil.writeLogRaw("Current: ",T01OS4_A5419MaqSalM[0]);
            }
            if ( DecimalUtil.compareTo(Z5420MaqSalMKi, T01OS4_A5420MaqSalMKi[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqSalMKi");
               GXutil.writeLogRaw("Old: ",Z5420MaqSalMKi);
               GXutil.writeLogRaw("Current: ",T01OS4_A5420MaqSalMKi[0]);
            }
            if ( DecimalUtil.compareTo(Z5421MaqSalMKf, T01OS4_A5421MaqSalMKf[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqSalMKf");
               GXutil.writeLogRaw("Old: ",Z5421MaqSalMKf);
               GXutil.writeLogRaw("Current: ",T01OS4_A5421MaqSalMKf[0]);
            }
            if ( DecimalUtil.compareTo(Z5463MaqCantCor, T01OS4_A5463MaqCantCor[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCantCor");
               GXutil.writeLogRaw("Old: ",Z5463MaqCantCor);
               GXutil.writeLogRaw("Current: ",T01OS4_A5463MaqCantCor[0]);
            }
            if ( GXutil.strcmp(Z5593MaqTipCen, T01OS4_A5593MaqTipCen[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqTipCen");
               GXutil.writeLogRaw("Old: ",Z5593MaqTipCen);
               GXutil.writeLogRaw("Current: ",T01OS4_A5593MaqTipCen[0]);
            }
            if ( GXutil.strcmp(Z5949MaqDosifP, T01OS4_A5949MaqDosifP[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqDosifP");
               GXutil.writeLogRaw("Old: ",Z5949MaqDosifP);
               GXutil.writeLogRaw("Current: ",T01OS4_A5949MaqDosifP[0]);
            }
            if ( Z5950MaqDteCol != T01OS4_A5950MaqDteCol[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqDteCol");
               GXutil.writeLogRaw("Old: ",Z5950MaqDteCol);
               GXutil.writeLogRaw("Current: ",T01OS4_A5950MaqDteCol[0]);
            }
            if ( GXutil.strcmp(Z604MaqCodFor, T01OS4_A604MaqCodFor[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCodFor");
               GXutil.writeLogRaw("Old: ",Z604MaqCodFor);
               GXutil.writeLogRaw("Current: ",T01OS4_A604MaqCodFor[0]);
            }
            if ( DecimalUtil.compareTo(Z6284MaqFacAbs, T01OS4_A6284MaqFacAbs[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqFacAbs");
               GXutil.writeLogRaw("Old: ",Z6284MaqFacAbs);
               GXutil.writeLogRaw("Current: ",T01OS4_A6284MaqFacAbs[0]);
            }
            if ( DecimalUtil.compareTo(Z6399MaqKgsId, T01OS4_A6399MaqKgsId[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqKgsId");
               GXutil.writeLogRaw("Old: ",Z6399MaqKgsId);
               GXutil.writeLogRaw("Current: ",T01OS4_A6399MaqKgsId[0]);
            }
            if ( Z6432MaqPln != T01OS4_A6432MaqPln[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqPln");
               GXutil.writeLogRaw("Old: ",Z6432MaqPln);
               GXutil.writeLogRaw("Current: ",T01OS4_A6432MaqPln[0]);
            }
            if ( Z6433MaqPlnVis != T01OS4_A6433MaqPlnVis[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqPlnVis");
               GXutil.writeLogRaw("Old: ",Z6433MaqPlnVis);
               GXutil.writeLogRaw("Current: ",T01OS4_A6433MaqPlnVis[0]);
            }
            if ( Z6454MaqConFas != T01OS4_A6454MaqConFas[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqConFas");
               GXutil.writeLogRaw("Old: ",Z6454MaqConFas);
               GXutil.writeLogRaw("Current: ",T01OS4_A6454MaqConFas[0]);
            }
            if ( GXutil.strcmp(Z8056MaqVaril, T01OS4_A8056MaqVaril[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqVaril");
               GXutil.writeLogRaw("Old: ",Z8056MaqVaril);
               GXutil.writeLogRaw("Current: ",T01OS4_A8056MaqVaril[0]);
            }
            if ( Z3599MaqRelBan != T01OS4_A3599MaqRelBan[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqRelBan");
               GXutil.writeLogRaw("Old: ",Z3599MaqRelBan);
               GXutil.writeLogRaw("Current: ",T01OS4_A3599MaqRelBan[0]);
            }
            if ( GXutil.strcmp(Z8657MaqLoc, T01OS4_A8657MaqLoc[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqLoc");
               GXutil.writeLogRaw("Old: ",Z8657MaqLoc);
               GXutil.writeLogRaw("Current: ",T01OS4_A8657MaqLoc[0]);
            }
            if ( GXutil.strcmp(Z9626MaqObs, T01OS4_A9626MaqObs[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqObs");
               GXutil.writeLogRaw("Old: ",Z9626MaqObs);
               GXutil.writeLogRaw("Current: ",T01OS4_A9626MaqObs[0]);
            }
            if ( DecimalUtil.compareTo(Z9982MaqFabsHm, T01OS4_A9982MaqFabsHm[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqFabsHm");
               GXutil.writeLogRaw("Old: ",Z9982MaqFabsHm);
               GXutil.writeLogRaw("Current: ",T01OS4_A9982MaqFabsHm[0]);
            }
            if ( DecimalUtil.compareTo(Z1027MaqHhCon, T01OS4_A1027MaqHhCon[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqHhCon");
               GXutil.writeLogRaw("Old: ",Z1027MaqHhCon);
               GXutil.writeLogRaw("Current: ",T01OS4_A1027MaqHhCon[0]);
            }
            if ( GXutil.strcmp(Z1026MaqHhCtr, T01OS4_A1026MaqHhCtr[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqHhCtr");
               GXutil.writeLogRaw("Old: ",Z1026MaqHhCtr);
               GXutil.writeLogRaw("Current: ",T01OS4_A1026MaqHhCtr[0]);
            }
            if ( Z3600MaqVolBal != T01OS4_A3600MaqVolBal[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqVolBal");
               GXutil.writeLogRaw("Old: ",Z3600MaqVolBal);
               GXutil.writeLogRaw("Current: ",T01OS4_A3600MaqVolBal[0]);
            }
            if ( DecimalUtil.compareTo(Z3684MaqCosGen, T01OS4_A3684MaqCosGen[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCosGen");
               GXutil.writeLogRaw("Old: ",Z3684MaqCosGen);
               GXutil.writeLogRaw("Current: ",T01OS4_A3684MaqCosGen[0]);
            }
            if ( DecimalUtil.compareTo(Z11821MaqMOD, T01OS4_A11821MaqMOD[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqMOD");
               GXutil.writeLogRaw("Old: ",Z11821MaqMOD);
               GXutil.writeLogRaw("Current: ",T01OS4_A11821MaqMOD[0]);
            }
            if ( DecimalUtil.compareTo(Z11822MaqMOI, T01OS4_A11822MaqMOI[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqMOI");
               GXutil.writeLogRaw("Old: ",Z11822MaqMOI);
               GXutil.writeLogRaw("Current: ",T01OS4_A11822MaqMOI[0]);
            }
            if ( DecimalUtil.compareTo(Z11823MaqEnerg, T01OS4_A11823MaqEnerg[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqEnerg");
               GXutil.writeLogRaw("Old: ",Z11823MaqEnerg);
               GXutil.writeLogRaw("Current: ",T01OS4_A11823MaqEnerg[0]);
            }
            if ( DecimalUtil.compareTo(Z11824MaqGas, T01OS4_A11824MaqGas[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqGas");
               GXutil.writeLogRaw("Old: ",Z11824MaqGas);
               GXutil.writeLogRaw("Current: ",T01OS4_A11824MaqGas[0]);
            }
            if ( DecimalUtil.compareTo(Z11825MaqAgua, T01OS4_A11825MaqAgua[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqAgua");
               GXutil.writeLogRaw("Old: ",Z11825MaqAgua);
               GXutil.writeLogRaw("Current: ",T01OS4_A11825MaqAgua[0]);
            }
            if ( Z13020MaqTmCarg != T01OS4_A13020MaqTmCarg[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqTmCarg");
               GXutil.writeLogRaw("Old: ",Z13020MaqTmCarg);
               GXutil.writeLogRaw("Current: ",T01OS4_A13020MaqTmCarg[0]);
            }
            if ( Z13021MaqTmDcarg != T01OS4_A13021MaqTmDcarg[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqTmDcarg");
               GXutil.writeLogRaw("Old: ",Z13021MaqTmDcarg);
               GXutil.writeLogRaw("Current: ",T01OS4_A13021MaqTmDcarg[0]);
            }
            if ( DecimalUtil.compareTo(Z13022MaqMtsMn, T01OS4_A13022MaqMtsMn[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqMtsMn");
               GXutil.writeLogRaw("Old: ",Z13022MaqMtsMn);
               GXutil.writeLogRaw("Current: ",T01OS4_A13022MaqMtsMn[0]);
            }
            if ( DecimalUtil.compareTo(Z13023MaqMtsMx, T01OS4_A13023MaqMtsMx[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqMtsMx");
               GXutil.writeLogRaw("Old: ",Z13023MaqMtsMx);
               GXutil.writeLogRaw("Current: ",T01OS4_A13023MaqMtsMx[0]);
            }
            if ( DecimalUtil.compareTo(Z13179MaqCosFijo, T01OS4_A13179MaqCosFijo[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCosFijo");
               GXutil.writeLogRaw("Old: ",Z13179MaqCosFijo);
               GXutil.writeLogRaw("Current: ",T01OS4_A13179MaqCosFijo[0]);
            }
            if ( DecimalUtil.compareTo(Z13180MaqCosKg, T01OS4_A13180MaqCosKg[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCosKg");
               GXutil.writeLogRaw("Old: ",Z13180MaqCosKg);
               GXutil.writeLogRaw("Current: ",T01OS4_A13180MaqCosKg[0]);
            }
            if ( Z14289MaqCuerdas != T01OS4_A14289MaqCuerdas[0] )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqCuerdas");
               GXutil.writeLogRaw("Old: ",Z14289MaqCuerdas);
               GXutil.writeLogRaw("Current: ",T01OS4_A14289MaqCuerdas[0]);
            }
            if ( GXutil.strcmp(Z1011TipMaqCod, T01OS4_A1011TipMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"TipMaqCod");
               GXutil.writeLogRaw("Old: ",Z1011TipMaqCod);
               GXutil.writeLogRaw("Current: ",T01OS4_A1011TipMaqCod[0]);
            }
            if ( GXutil.strcmp(Z11726MaqOgtId, T01OS4_A11726MaqOgtId[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqOgtId");
               GXutil.writeLogRaw("Old: ",Z11726MaqOgtId);
               GXutil.writeLogRaw("Current: ",T01OS4_A11726MaqOgtId[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQUIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OS65( )
   {
      beforeValidate1OS65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OS65( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OS65( 0) ;
         checkOptimisticConcurrency1OS65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OS65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OS65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OS15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n3601MaqTipMaq), A3601MaqTipMaq, Boolean.valueOf(n606MaqDsc), A606MaqDsc, Boolean.valueOf(n14288MaqDscLarg), A14288MaqDscLarg, Boolean.valueOf(n600MaqCap), Integer.valueOf(A600MaqCap), Boolean.valueOf(n605MaqCosMin), A605MaqCosMin, Boolean.valueOf(n612MaqHorPro), Byte.valueOf(A612MaqHorPro), Boolean.valueOf(n615MaqMinPro), Byte.valueOf(A615MaqMinPro), Boolean.valueOf(n620MaqTip), A620MaqTip, Boolean.valueOf(n607MaqEst), A607MaqEst, Boolean.valueOf(n621MaqUltFec), A621MaqUltFec, Boolean.valueOf(n617MaqResDia), A617MaqResDia, Boolean.valueOf(n611MaqHorAsi), A611MaqHorAsi, Boolean.valueOf(n616MaqOrdSeq), Short.valueOf(A616MaqOrdSeq), Boolean.valueOf(n622MaqUltLin), Byte.valueOf(A622MaqUltLin), Boolean.valueOf(n4282MaqFormul), A4282MaqFormul, Boolean.valueOf(n4283MaqKgsMin), A4283MaqKgsMin, Boolean.valueOf(n4284MaqKgsMed), A4284MaqKgsMed, Boolean.valueOf(n4285MaqKgsMax), A4285MaqKgsMax, Boolean.valueOf(n4319MaqPrdMin), Short.valueOf(A4319MaqPrdMin), Boolean.valueOf(n4320MaqPrdMed), Short.valueOf(A4320MaqPrdMed), Boolean.valueOf(n4321MaqPrdMax), Short.valueOf(A4321MaqPrdMax), Boolean.valueOf(n623MaqVolMax), Integer.valueOf(A623MaqVolMax), Boolean.valueOf(n625MaqVolMin), Integer.valueOf(A625MaqVolMin), Boolean.valueOf(n624MaqVolMed), Integer.valueOf(A624MaqVolMed), Boolean.valueOf(n2801MaqVolRes), Integer.valueOf(A2801MaqVolRes), Boolean.valueOf(n2802MaqVolTop), Integer.valueOf(A2802MaqVolTop), Boolean.valueOf(n618MaqTemMax), Short.valueOf(A618MaqTemMax), Boolean.valueOf(n601MaqChp), A601MaqChp, Boolean.valueOf(n619MaqTinTip), A619MaqTinTip, Boolean.valueOf(n2391MaqMicro), Byte.valueOf(A2391MaqMicro), Boolean.valueOf(n3598MaqNroTub), Byte.valueOf(A3598MaqNroTub), Boolean.valueOf(n5292MaqCodBan), A5292MaqCodBan, Boolean.valueOf(n5419MaqSalM), A5419MaqSalM, Boolean.valueOf(n5420MaqSalMKi), A5420MaqSalMKi, Boolean.valueOf(n5421MaqSalMKf), A5421MaqSalMKf, Boolean.valueOf(n5463MaqCantCor), A5463MaqCantCor, Boolean.valueOf(n5593MaqTipCen), A5593MaqTipCen, Boolean.valueOf(n5949MaqDosifP), A5949MaqDosifP, Boolean.valueOf(n5950MaqDteCol), Integer.valueOf(A5950MaqDteCol), Boolean.valueOf(n604MaqCodFor), A604MaqCodFor, Boolean.valueOf(n6284MaqFacAbs), A6284MaqFacAbs, Boolean.valueOf(n6399MaqKgsId), A6399MaqKgsId, Boolean.valueOf(n6432MaqPln), Byte.valueOf(A6432MaqPln), Boolean.valueOf(n6433MaqPlnVis), Byte.valueOf(A6433MaqPlnVis), Boolean.valueOf(n6454MaqConFas), Integer.valueOf(A6454MaqConFas), Boolean.valueOf(n8056MaqVaril), A8056MaqVaril, Boolean.valueOf(n3599MaqRelBan), Byte.valueOf(A3599MaqRelBan), Boolean.valueOf(n8657MaqLoc), A8657MaqLoc, Boolean.valueOf(n9626MaqObs), A9626MaqObs, Boolean.valueOf(n9982MaqFabsHm), A9982MaqFabsHm, Boolean.valueOf(n1027MaqHhCon), A1027MaqHhCon, Boolean.valueOf(n1026MaqHhCtr), A1026MaqHhCtr, Boolean.valueOf(n3600MaqVolBal), Integer.valueOf(A3600MaqVolBal), Boolean.valueOf(n3684MaqCosGen), A3684MaqCosGen, Boolean.valueOf(n11821MaqMOD), A11821MaqMOD, Boolean.valueOf(n11822MaqMOI), A11822MaqMOI, Boolean.valueOf(n11823MaqEnerg), A11823MaqEnerg, Boolean.valueOf(n11824MaqGas), A11824MaqGas, Boolean.valueOf(n11825MaqAgua), A11825MaqAgua, Boolean.valueOf(n13020MaqTmCarg), Short.valueOf(A13020MaqTmCarg),
                  Boolean.valueOf(n13021MaqTmDcarg), Short.valueOf(A13021MaqTmDcarg), Boolean.valueOf(n13022MaqMtsMn), A13022MaqMtsMn, Boolean.valueOf(n13023MaqMtsMx), A13023MaqMtsMx, Boolean.valueOf(n13179MaqCosFijo), A13179MaqCosFijo, Boolean.valueOf(n13180MaqCosKg), A13180MaqCosKg, Boolean.valueOf(n14289MaqCuerdas), Short.valueOf(A14289MaqCuerdas), A396EmprCod, Boolean.valueOf(n1011TipMaqCod), A1011TipMaqCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1OS65( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1OS0( ) ;
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
            load1OS65( ) ;
         }
         endLevel1OS65( ) ;
      }
      closeExtendedTableCursors1OS65( ) ;
   }

   public void update1OS65( )
   {
      beforeValidate1OS65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OS65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OS65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OS65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OS65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OS16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n3601MaqTipMaq), A3601MaqTipMaq, Boolean.valueOf(n606MaqDsc), A606MaqDsc, Boolean.valueOf(n14288MaqDscLarg), A14288MaqDscLarg, Boolean.valueOf(n600MaqCap), Integer.valueOf(A600MaqCap), Boolean.valueOf(n605MaqCosMin), A605MaqCosMin, Boolean.valueOf(n612MaqHorPro), Byte.valueOf(A612MaqHorPro), Boolean.valueOf(n615MaqMinPro), Byte.valueOf(A615MaqMinPro), Boolean.valueOf(n620MaqTip), A620MaqTip, Boolean.valueOf(n607MaqEst), A607MaqEst, Boolean.valueOf(n621MaqUltFec), A621MaqUltFec, Boolean.valueOf(n617MaqResDia), A617MaqResDia, Boolean.valueOf(n611MaqHorAsi), A611MaqHorAsi, Boolean.valueOf(n616MaqOrdSeq), Short.valueOf(A616MaqOrdSeq), Boolean.valueOf(n622MaqUltLin), Byte.valueOf(A622MaqUltLin), Boolean.valueOf(n4282MaqFormul), A4282MaqFormul, Boolean.valueOf(n4283MaqKgsMin), A4283MaqKgsMin, Boolean.valueOf(n4284MaqKgsMed), A4284MaqKgsMed, Boolean.valueOf(n4285MaqKgsMax), A4285MaqKgsMax, Boolean.valueOf(n4319MaqPrdMin), Short.valueOf(A4319MaqPrdMin), Boolean.valueOf(n4320MaqPrdMed), Short.valueOf(A4320MaqPrdMed), Boolean.valueOf(n4321MaqPrdMax), Short.valueOf(A4321MaqPrdMax), Boolean.valueOf(n623MaqVolMax), Integer.valueOf(A623MaqVolMax), Boolean.valueOf(n625MaqVolMin), Integer.valueOf(A625MaqVolMin), Boolean.valueOf(n624MaqVolMed), Integer.valueOf(A624MaqVolMed), Boolean.valueOf(n2801MaqVolRes), Integer.valueOf(A2801MaqVolRes), Boolean.valueOf(n2802MaqVolTop), Integer.valueOf(A2802MaqVolTop), Boolean.valueOf(n618MaqTemMax), Short.valueOf(A618MaqTemMax), Boolean.valueOf(n601MaqChp), A601MaqChp, Boolean.valueOf(n619MaqTinTip), A619MaqTinTip, Boolean.valueOf(n2391MaqMicro), Byte.valueOf(A2391MaqMicro), Boolean.valueOf(n3598MaqNroTub), Byte.valueOf(A3598MaqNroTub), Boolean.valueOf(n5292MaqCodBan), A5292MaqCodBan, Boolean.valueOf(n5419MaqSalM), A5419MaqSalM, Boolean.valueOf(n5420MaqSalMKi), A5420MaqSalMKi, Boolean.valueOf(n5421MaqSalMKf), A5421MaqSalMKf, Boolean.valueOf(n5463MaqCantCor), A5463MaqCantCor, Boolean.valueOf(n5593MaqTipCen), A5593MaqTipCen, Boolean.valueOf(n5949MaqDosifP), A5949MaqDosifP, Boolean.valueOf(n5950MaqDteCol), Integer.valueOf(A5950MaqDteCol), Boolean.valueOf(n604MaqCodFor), A604MaqCodFor, Boolean.valueOf(n6284MaqFacAbs), A6284MaqFacAbs, Boolean.valueOf(n6399MaqKgsId), A6399MaqKgsId, Boolean.valueOf(n6432MaqPln), Byte.valueOf(A6432MaqPln), Boolean.valueOf(n6433MaqPlnVis), Byte.valueOf(A6433MaqPlnVis), Boolean.valueOf(n6454MaqConFas), Integer.valueOf(A6454MaqConFas), Boolean.valueOf(n8056MaqVaril), A8056MaqVaril, Boolean.valueOf(n3599MaqRelBan), Byte.valueOf(A3599MaqRelBan), Boolean.valueOf(n8657MaqLoc), A8657MaqLoc, Boolean.valueOf(n9626MaqObs), A9626MaqObs, Boolean.valueOf(n9982MaqFabsHm), A9982MaqFabsHm, Boolean.valueOf(n1027MaqHhCon), A1027MaqHhCon, Boolean.valueOf(n1026MaqHhCtr), A1026MaqHhCtr, Boolean.valueOf(n3600MaqVolBal), Integer.valueOf(A3600MaqVolBal), Boolean.valueOf(n3684MaqCosGen), A3684MaqCosGen, Boolean.valueOf(n11821MaqMOD), A11821MaqMOD, Boolean.valueOf(n11822MaqMOI), A11822MaqMOI, Boolean.valueOf(n11823MaqEnerg), A11823MaqEnerg, Boolean.valueOf(n11824MaqGas), A11824MaqGas, Boolean.valueOf(n11825MaqAgua), A11825MaqAgua, Boolean.valueOf(n13020MaqTmCarg), Short.valueOf(A13020MaqTmCarg), Boolean.valueOf(n13021MaqTmDcarg), Short.valueOf(A13021MaqTmDcarg),
                  Boolean.valueOf(n13022MaqMtsMn), A13022MaqMtsMn, Boolean.valueOf(n13023MaqMtsMx), A13023MaqMtsMx, Boolean.valueOf(n13179MaqCosFijo), A13179MaqCosFijo, Boolean.valueOf(n13180MaqCosKg), A13180MaqCosKg, Boolean.valueOf(n14289MaqCuerdas), Short.valueOf(A14289MaqCuerdas), Boolean.valueOf(n1011TipMaqCod), A1011TipMaqCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OS65( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( (GXutil.strcmp("", A3601MaqTipMaq)==0) && true /* After */ )
                     {
                        A3601MaqTipMaq = httpContext.getMessage( "N", "") ;
                        n3601MaqTipMaq = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3601MaqTipMaq", A3601MaqTipMaq);
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OS65( ) ;
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
         endLevel1OS65( ) ;
      }
      closeExtendedTableCursors1OS65( ) ;
   }

   public void deferredUpdate1OS65( )
   {
   }

   public void delete( )
   {
      beforeValidate1OS65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OS65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OS65( ) ;
         afterConfirm1OS65( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OS65( ) ;
            if ( AnyError == 0 )
            {
               A622MaqUltLin = O622MaqUltLin ;
               n622MaqUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
               scanStart1OS68( ) ;
               while ( RcdFound68 != 0 )
               {
                  getByPrimaryKey1OS68( ) ;
                  delete1OS68( ) ;
                  scanNext1OS68( ) ;
                  O622MaqUltLin = A622MaqUltLin ;
                  n622MaqUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
               }
               scanEnd1OS68( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OS17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OS65( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OS65( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
         A12123MaqCosMm = A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11825MaqAgua).add(A11824MaqGas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12123MaqCosMm", GXutil.ltrimstr( A12123MaqCosMm, 10, 4));
         /* Using cursor T01OS18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n1011TipMaqCod), A1011TipMaqCod});
         A1012TipMaqDsc = T01OS18_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = T01OS18_n1012TipMaqDsc[0] ;
         pr_default.close(16);
         /* Using cursor T01OS19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
         A11727MaqOgtDsc = T01OS19_A11727MaqOgtDsc[0] ;
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01OS20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Costes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01OS21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01OS22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01OS23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLNMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01OS24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01OS25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Recetas Lavados Maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01OS26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01OS27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01OS28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01OS29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01OS30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Uso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01OS31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01OS32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Documentos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01OS33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MQDDOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01OS34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATF1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01OS35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01OS36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFABS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01OS37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MSolicitudes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01OS38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MPreventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01OS39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01OS40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01OS41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONVPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01OS42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01OS43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTNQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01OS44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARTM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01OS45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01OS46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQGR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01OS47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Líneas Costes Retroalimentados", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01OS48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PlaMaq", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01OS49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01OS50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01OS51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01OS52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01OS53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01OS54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parámetros por maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01OS55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01OS56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPLATI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01OS57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQMAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01OS58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01OS59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01OS60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01OS61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMHPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01OS62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQHNP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01OS63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01OS64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01OS65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01OS66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01OS67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01OS68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
      }
   }

   public void processNestedLevel1OS68( )
   {
      s622MaqUltLin = O622MaqUltLin ;
      n622MaqUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      nGXsfl_379_idx = 0 ;
      while ( nGXsfl_379_idx < nRC_GXsfl_379 )
      {
         readRow1OS68( ) ;
         if ( ( nRcdExists_68 != 0 ) || ( nIsMod_68 != 0 ) )
         {
            standaloneNotModal1OS68( ) ;
            getKey1OS68( ) ;
            if ( ( nRcdExists_68 == 0 ) && ( nRcdDeleted_68 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OS68( ) ;
            }
            else
            {
               if ( RcdFound68 != 0 )
               {
                  if ( ( nRcdDeleted_68 != 0 ) && ( nRcdExists_68 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OS68( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_68 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OS68( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_68 == 0 )
                  {
                     GXCCtl = "DESTECLIN_" + sGXsfl_379_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDesTecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O622MaqUltLin = A622MaqUltLin ;
            n622MaqUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
         }
         httpContext.changePostValue( edtDesTecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A320DesTecLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqLinTex_Internalname, GXutil.rtrim( A613MaqLinTex)) ;
         httpContext.changePostValue( "ZT_"+"Z320DesTecLin_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( Z320DesTecLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z613MaqLinTex_"+sGXsfl_379_idx, GXutil.rtrim( Z613MaqLinTex)) ;
         httpContext.changePostValue( "nRcdDeleted_68_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_68_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_68_"+sGXsfl_379_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_68 != 0 )
         {
            httpContext.changePostValue( "DESTECLIN_"+sGXsfl_379_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDesTecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQLINTEX_"+sGXsfl_379_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqLinTex_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OS68( ) ;
      if ( AnyError != 0 )
      {
         O622MaqUltLin = s622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      }
      nRcdExists_68 = (short)(0) ;
      nIsMod_68 = (short)(0) ;
      nRcdDeleted_68 = (short)(0) ;
   }

   public void processLevel1OS65( )
   {
      /* Save parent mode. */
      sMode65 = Gx_mode ;
      processNestedLevel1OS68( ) ;
      if ( AnyError != 0 )
      {
         O622MaqUltLin = s622MaqUltLin ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01OS69 */
      pr_default.execute(67, new Object[] {Boolean.valueOf(n622MaqUltLin), Byte.valueOf(A622MaqUltLin), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
   }

   public void endLevel1OS65( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1OS65( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqui1");
         if ( AnyError == 0 )
         {
            confirmValues1OS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqui1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OS65( )
   {
      /* Scan By routine */
      /* Using cursor T01OS70 */
      pr_default.execute(68, new Object[] {A396EmprCod});
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A602MaqCod = T01OS70_A602MaqCod[0] ;
         n602MaqCod = T01OS70_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OS65( )
   {
      /* Scan next routine */
      pr_default.readNext(68);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A602MaqCod = T01OS70_A602MaqCod[0] ;
         n602MaqCod = T01OS70_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
   }

   public void scanEnd1OS65( )
   {
      pr_default.close(68);
   }

   public void afterConfirm1OS65( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OS65( )
   {
      /* Before Insert Rules */
      if ( (GXutil.strcmp("", A602MaqCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdate1OS65( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OS65( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OS65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OS65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OS65( )
   {
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtMaqDscLarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDscLarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDscLarg_Enabled), 5, 0), true);
      edtMaqCap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCap_Enabled), 5, 0), true);
      edtMaqCosMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosMin_Enabled), 5, 0), true);
      edtMaqCosKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosKg_Enabled), 5, 0), true);
      edtMaqCosFijo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosFijo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosFijo_Enabled), 5, 0), true);
      edtMaqHorPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHorPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHorPro_Enabled), 5, 0), true);
      edtMaqMinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMinPro_Enabled), 5, 0), true);
      cmbMaqTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqTip.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqTip.getEnabled(), 5, 0), true);
      cmbMaqEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqEst.getEnabled(), 5, 0), true);
      edtTipMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqCod_Enabled), 5, 0), true);
      edtMaqTemMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTemMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTemMax_Enabled), 5, 0), true);
      cmbMaqChp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqChp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqChp.getEnabled(), 5, 0), true);
      edtMaqNroTub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNroTub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNroTub_Enabled), 5, 0), true);
      edtMaqOgtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqOgtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqOgtId_Enabled), 5, 0), true);
      edtMaqMOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMOD_Enabled), 5, 0), true);
      edtMaqMOI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMOI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMOI_Enabled), 5, 0), true);
      edtMaqEnerg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqEnerg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqEnerg_Enabled), 5, 0), true);
      edtMaqGas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqGas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqGas_Enabled), 5, 0), true);
      edtMaqAgua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAgua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAgua_Enabled), 5, 0), true);
      edtMaqCosMm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosMm_Enabled), 5, 0), true);
      edtMaqVolMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMax_Enabled), 5, 0), true);
      edtMaqVolMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMed_Enabled), 5, 0), true);
      edtMaqVolMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMin_Enabled), 5, 0), true);
      edtMaqRelBan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqRelBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqRelBan_Enabled), 5, 0), true);
      edtMaqKgsMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMax_Enabled), 5, 0), true);
      edtMaqKgsMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMed_Enabled), 5, 0), true);
      edtMaqKgsMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMin_Enabled), 5, 0), true);
      edtMaqTinTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTinTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTinTip_Enabled), 5, 0), true);
      edtMaqVolRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolRes_Enabled), 5, 0), true);
      edtMaqVolTop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolTop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolTop_Enabled), 5, 0), true);
      edtMaqVolBal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolBal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolBal_Enabled), 5, 0), true);
      edtMaqMicro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMicro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMicro_Enabled), 5, 0), true);
      cmbMaqCodBan.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqCodBan.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqCodBan.getEnabled(), 5, 0), true);
      edtMaqTipCen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipCen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipCen_Enabled), 5, 0), true);
      cmbMaqDosifP.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqDosifP.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqDosifP.getEnabled(), 5, 0), true);
      edtMaqCodFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodFor_Enabled), 5, 0), true);
      edtMaqCuerdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCuerdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCuerdas_Enabled), 5, 0), true);
      cmbMaqSalM.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqSalM.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqSalM.getEnabled(), 5, 0), true);
      edtMaqSalMKi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqSalMKi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqSalMKi_Enabled), 5, 0), true);
      edtMaqSalMKf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqSalMKf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqSalMKf_Enabled), 5, 0), true);
      edtMaqDteCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDteCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDteCol_Enabled), 5, 0), true);
      edtMaqTmCarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTmCarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTmCarg_Enabled), 5, 0), true);
      edtMaqTmDcarg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTmDcarg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTmDcarg_Enabled), 5, 0), true);
      cmbMaqPlnVis.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPlnVis.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqPlnVis.getEnabled(), 5, 0), true);
      cmbMaqPln.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPln.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqPln.getEnabled(), 5, 0), true);
      edtMaqFacAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFacAbs_Enabled), 5, 0), true);
      edtMaqFabsHm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqFabsHm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFabsHm_Enabled), 5, 0), true);
      edtMaqCantCor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCantCor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCantCor_Enabled), 5, 0), true);
      edtMaqHhCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHhCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHhCon_Enabled), 5, 0), true);
      edtMaqLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqLoc_Enabled), 5, 0), true);
      cmbMaqVaril.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqVaril.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqVaril.getEnabled(), 5, 0), true);
      edtMaqTipMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipMaq_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombotipmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipmaqcod_Enabled), 5, 0), true);
      edtavCombomaqogtid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqogtid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqogtid_Enabled), 5, 0), true);
   }

   public void zm1OS68( int GX_JID )
   {
      if ( ( GX_JID == 70 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z613MaqLinTex = T01OS3_A613MaqLinTex[0] ;
         }
         else
         {
            Z613MaqLinTex = A613MaqLinTex ;
         }
      }
      if ( GX_JID == -70 )
      {
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z320DesTecLin = A320DesTecLin ;
         Z613MaqLinTex = A613MaqLinTex ;
      }
   }

   public void standaloneNotModal1OS68( )
   {
   }

   public void standaloneModal1OS68( )
   {
      if ( isIns( )  )
      {
         A622MaqUltLin = (byte)(O622MaqUltLin+1) ;
         n622MaqUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A320DesTecLin = A622MaqUltLin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDesTecLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDesTecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDesTecLin_Enabled), 5, 0), !bGXsfl_379_Refreshing);
      }
      else
      {
         edtDesTecLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDesTecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDesTecLin_Enabled), 5, 0), !bGXsfl_379_Refreshing);
      }
   }

   public void load1OS68( )
   {
      /* Using cursor T01OS71 */
      pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Byte.valueOf(A320DesTecLin)});
      if ( (pr_default.getStatus(69) != 101) )
      {
         RcdFound68 = (short)(1) ;
         A613MaqLinTex = T01OS71_A613MaqLinTex[0] ;
         zm1OS68( -70) ;
      }
      pr_default.close(69);
      onLoadActions1OS68( ) ;
   }

   public void onLoadActions1OS68( )
   {
   }

   public void checkExtendedTable1OS68( )
   {
      nIsDirty_68 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1OS68( ) ;
   }

   public void closeExtendedTableCursors1OS68( )
   {
   }

   public void enableDisable1OS68( )
   {
   }

   public void getKey1OS68( )
   {
      /* Using cursor T01OS72 */
      pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Byte.valueOf(A320DesTecLin)});
      if ( (pr_default.getStatus(70) != 101) )
      {
         RcdFound68 = (short)(1) ;
      }
      else
      {
         RcdFound68 = (short)(0) ;
      }
      pr_default.close(70);
   }

   public void getByPrimaryKey1OS68( )
   {
      /* Using cursor T01OS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Byte.valueOf(A320DesTecLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OS3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OS68( 70) ;
         RcdFound68 = (short)(1) ;
         initializeNonKey1OS68( ) ;
         A320DesTecLin = T01OS3_A320DesTecLin[0] ;
         A613MaqLinTex = T01OS3_A613MaqLinTex[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z320DesTecLin = A320DesTecLin ;
         sMode68 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1OS68( ) ;
         Gx_mode = sMode68 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound68 = (short)(0) ;
         initializeNonKey1OS68( ) ;
         sMode68 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OS68( ) ;
         Gx_mode = sMode68 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OS68( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1OS68( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Byte.valueOf(A320DesTecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z613MaqLinTex, T01OS2_A613MaqLinTex[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z613MaqLinTex, T01OS2_A613MaqLinTex[0]) != 0 )
            {
               GXutil.writeLogln("tmaqui1:[seudo value changed for attri]"+"MaqLinTex");
               GXutil.writeLogRaw("Old: ",Z613MaqLinTex);
               GXutil.writeLogRaw("Current: ",T01OS2_A613MaqLinTex[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OS68( )
   {
      beforeValidate1OS68( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OS68( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OS68( 0) ;
         checkOptimisticConcurrency1OS68( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OS68( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OS68( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OS73 */
                  pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Byte.valueOf(A320DesTecLin), A613MaqLinTex});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQLIN");
                  if ( (pr_default.getStatus(71) == 1) )
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
            load1OS68( ) ;
         }
         endLevel1OS68( ) ;
      }
      closeExtendedTableCursors1OS68( ) ;
   }

   public void update1OS68( )
   {
      beforeValidate1OS68( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OS68( ) ;
      }
      if ( ( nIsMod_68 != 0 ) || ( nIsDirty_68 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OS68( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OS68( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OS68( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OS74 */
                     pr_default.execute(72, new Object[] {A613MaqLinTex, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Byte.valueOf(A320DesTecLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQLIN");
                     if ( (pr_default.getStatus(72) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQLIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OS68( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OS68( ) ;
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
            endLevel1OS68( ) ;
         }
      }
      closeExtendedTableCursors1OS68( ) ;
   }

   public void deferredUpdate1OS68( )
   {
   }

   public void delete1OS68( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OS68( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OS68( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OS68( ) ;
         afterConfirm1OS68( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OS68( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OS75 */
               pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Byte.valueOf(A320DesTecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQLIN");
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
      sMode68 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OS68( ) ;
      Gx_mode = sMode68 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OS68( )
   {
      standaloneModal1OS68( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OS68( )
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

   public void scanStart1OS68( )
   {
      /* Scan By routine */
      /* Using cursor T01OS76 */
      pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      RcdFound68 = (short)(0) ;
      if ( (pr_default.getStatus(74) != 101) )
      {
         RcdFound68 = (short)(1) ;
         A320DesTecLin = T01OS76_A320DesTecLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OS68( )
   {
      /* Scan next routine */
      pr_default.readNext(74);
      RcdFound68 = (short)(0) ;
      if ( (pr_default.getStatus(74) != 101) )
      {
         RcdFound68 = (short)(1) ;
         A320DesTecLin = T01OS76_A320DesTecLin[0] ;
      }
   }

   public void scanEnd1OS68( )
   {
      pr_default.close(74);
   }

   public void afterConfirm1OS68( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OS68( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OS68( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OS68( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OS68( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OS68( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OS68( )
   {
      edtDesTecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDesTecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDesTecLin_Enabled), 5, 0), !bGXsfl_379_Refreshing);
      edtMaqLinTex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqLinTex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqLinTex_Enabled), 5, 0), !bGXsfl_379_Refreshing);
   }

   public void send_integrity_lvl_hashes1OS68( )
   {
   }

   public void send_integrity_lvl_hashes1OS65( )
   {
   }

   public void subsflControlProps_37968( )
   {
      edtDesTecLin_Internalname = "DESTECLIN_"+sGXsfl_379_idx ;
      edtMaqLinTex_Internalname = "MAQLINTEX_"+sGXsfl_379_idx ;
   }

   public void subsflControlProps_fel_37968( )
   {
      edtDesTecLin_Internalname = "DESTECLIN_"+sGXsfl_379_fel_idx ;
      edtMaqLinTex_Internalname = "MAQLINTEX_"+sGXsfl_379_fel_idx ;
   }

   public void addRow1OS68( )
   {
      nGXsfl_379_idx = (int)(nGXsfl_379_idx+1) ;
      sGXsfl_379_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_379_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_37968( ) ;
      sendRow1OS68( ) ;
   }

   public void sendRow1OS68( )
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
         if ( ((int)((nGXsfl_379_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_68_" + sGXsfl_379_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 380,'',false,'" + sGXsfl_379_idx + "',379)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDesTecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A320DesTecLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A320DesTecLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,380);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDesTecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn WWActionColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtDesTecLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(379),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_68_" + sGXsfl_379_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 381,'',false,'" + sGXsfl_379_idx + "',379)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqLinTex_Internalname,GXutil.rtrim( A613MaqLinTex),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,381);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqLinTex_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMaqLinTex_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(379),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1OS68( ) ;
      GXCCtl = "Z320DesTecLin_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z320DesTecLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z613MaqLinTex_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z613MaqLinTex));
      GXCCtl = "nRcdDeleted_68_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_68_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_68_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_68, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_379_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV112TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV112TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV109EmprCod));
      GXCCtl = "vMAQCOD_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV118MaqCod));
      GXCCtl = "EMPRCOD_" + sGXsfl_379_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DESTECLIN_"+sGXsfl_379_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDesTecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQLINTEX_"+sGXsfl_379_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqLinTex_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1OS68( )
   {
      nGXsfl_379_idx = (int)(nGXsfl_379_idx+1) ;
      sGXsfl_379_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_379_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_37968( ) ;
      edtDesTecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DESTECLIN_"+sGXsfl_379_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqLinTex_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQLINTEX_"+sGXsfl_379_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDesTecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDesTecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DESTECLIN_" + sGXsfl_379_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDesTecLin_Internalname ;
         wbErr = true ;
         A320DesTecLin = (byte)(0) ;
      }
      else
      {
         A320DesTecLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDesTecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A613MaqLinTex = httpContext.cgiGet( edtMaqLinTex_Internalname) ;
      GXCCtl = "Z320DesTecLin_" + sGXsfl_379_idx ;
      Z320DesTecLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z613MaqLinTex_" + sGXsfl_379_idx ;
      Z613MaqLinTex = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_68_" + sGXsfl_379_idx ;
      nRcdDeleted_68 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_68_" + sGXsfl_379_idx ;
      nRcdExists_68 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_68_" + sGXsfl_379_idx ;
      nIsMod_68 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDesTecLin_Enabled = edtDesTecLin_Enabled ;
   }

   public void confirmValues1OS0( )
   {
      nGXsfl_379_idx = 0 ;
      sGXsfl_379_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_379_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_37968( ) ;
      while ( nGXsfl_379_idx < nRC_GXsfl_379 )
      {
         nGXsfl_379_idx = (int)(nGXsfl_379_idx+1) ;
         sGXsfl_379_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_379_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_37968( ) ;
         httpContext.changePostValue( "Z320DesTecLin_"+sGXsfl_379_idx, httpContext.cgiGet( "ZT_"+"Z320DesTecLin_"+sGXsfl_379_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z320DesTecLin_"+sGXsfl_379_idx) ;
         httpContext.changePostValue( "Z613MaqLinTex_"+sGXsfl_379_idx, httpContext.cgiGet( "ZT_"+"Z613MaqLinTex_"+sGXsfl_379_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z613MaqLinTex_"+sGXsfl_379_idx) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmaqui1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV109EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV118MaqCod))}, new String[] {"Gx_mode","EmprCod","MaqCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUI1");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV127Pgmname, "")));
      forbiddenHiddens.add("MaqUltFec", GXutil.rtrim( localUtil.format( A621MaqUltFec, "")));
      forbiddenHiddens.add("MaqResDia", localUtil.format( A617MaqResDia, "Z9.99"));
      forbiddenHiddens.add("MaqHorAsi", localUtil.format( A611MaqHorAsi, "ZZZ9.99"));
      forbiddenHiddens.add("MaqOrdSeq", localUtil.format( DecimalUtil.doubleToDec(A616MaqOrdSeq), "ZZZ9"));
      forbiddenHiddens.add("MaqFormul", GXutil.rtrim( localUtil.format( A4282MaqFormul, "@!")));
      forbiddenHiddens.add("MaqPrdMin", localUtil.format( DecimalUtil.doubleToDec(A4319MaqPrdMin), "ZZZ9"));
      forbiddenHiddens.add("MaqPrdMed", localUtil.format( DecimalUtil.doubleToDec(A4320MaqPrdMed), "ZZZ9"));
      forbiddenHiddens.add("MaqPrdMax", localUtil.format( DecimalUtil.doubleToDec(A4321MaqPrdMax), "ZZZ9"));
      forbiddenHiddens.add("MaqKgsId", localUtil.format( A6399MaqKgsId, "ZZZZZ9.99"));
      forbiddenHiddens.add("MaqConFas", localUtil.format( DecimalUtil.doubleToDec(A6454MaqConFas), "ZZZZZ9"));
      forbiddenHiddens.add("MaqObs", GXutil.rtrim( localUtil.format( A9626MaqObs, "")));
      forbiddenHiddens.add("MaqHhCtr", GXutil.rtrim( localUtil.format( A1026MaqHhCtr, "")));
      forbiddenHiddens.add("MaqCosGen", localUtil.format( A3684MaqCosGen, "ZZZZ9.99"));
      forbiddenHiddens.add("MaqMtsMn", localUtil.format( A13022MaqMtsMn, "ZZZZZ9.99"));
      forbiddenHiddens.add("MaqMtsMx", localUtil.format( A13023MaqMtsMx, "ZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmaqui1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3601MaqTipMaq", GXutil.rtrim( Z3601MaqTipMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14288MaqDscLarg", GXutil.rtrim( Z14288MaqDscLarg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z600MaqCap", GXutil.ltrim( localUtil.ntoc( Z600MaqCap, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z605MaqCosMin", GXutil.ltrim( localUtil.ntoc( Z605MaqCosMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z612MaqHorPro", GXutil.ltrim( localUtil.ntoc( Z612MaqHorPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z615MaqMinPro", GXutil.ltrim( localUtil.ntoc( Z615MaqMinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z620MaqTip", GXutil.rtrim( Z620MaqTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z607MaqEst", GXutil.rtrim( Z607MaqEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z621MaqUltFec", GXutil.rtrim( Z621MaqUltFec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z617MaqResDia", GXutil.ltrim( localUtil.ntoc( Z617MaqResDia, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z611MaqHorAsi", GXutil.ltrim( localUtil.ntoc( Z611MaqHorAsi, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z616MaqOrdSeq", GXutil.ltrim( localUtil.ntoc( Z616MaqOrdSeq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z622MaqUltLin", GXutil.ltrim( localUtil.ntoc( Z622MaqUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4282MaqFormul", GXutil.rtrim( Z4282MaqFormul));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4283MaqKgsMin", GXutil.ltrim( localUtil.ntoc( Z4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4284MaqKgsMed", GXutil.ltrim( localUtil.ntoc( Z4284MaqKgsMed, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4285MaqKgsMax", GXutil.ltrim( localUtil.ntoc( Z4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4319MaqPrdMin", GXutil.ltrim( localUtil.ntoc( Z4319MaqPrdMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4320MaqPrdMed", GXutil.ltrim( localUtil.ntoc( Z4320MaqPrdMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4321MaqPrdMax", GXutil.ltrim( localUtil.ntoc( Z4321MaqPrdMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z623MaqVolMax", GXutil.ltrim( localUtil.ntoc( Z623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z625MaqVolMin", GXutil.ltrim( localUtil.ntoc( Z625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z624MaqVolMed", GXutil.ltrim( localUtil.ntoc( Z624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2801MaqVolRes", GXutil.ltrim( localUtil.ntoc( Z2801MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2802MaqVolTop", GXutil.ltrim( localUtil.ntoc( Z2802MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z618MaqTemMax", GXutil.ltrim( localUtil.ntoc( Z618MaqTemMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z601MaqChp", GXutil.rtrim( Z601MaqChp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z619MaqTinTip", GXutil.rtrim( Z619MaqTinTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2391MaqMicro", GXutil.ltrim( localUtil.ntoc( Z2391MaqMicro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3598MaqNroTub", GXutil.ltrim( localUtil.ntoc( Z3598MaqNroTub, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5292MaqCodBan", GXutil.rtrim( Z5292MaqCodBan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5419MaqSalM", GXutil.rtrim( Z5419MaqSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5420MaqSalMKi", GXutil.ltrim( localUtil.ntoc( Z5420MaqSalMKi, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5421MaqSalMKf", GXutil.ltrim( localUtil.ntoc( Z5421MaqSalMKf, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5463MaqCantCor", GXutil.ltrim( localUtil.ntoc( Z5463MaqCantCor, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5593MaqTipCen", GXutil.rtrim( Z5593MaqTipCen));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5949MaqDosifP", GXutil.rtrim( Z5949MaqDosifP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5950MaqDteCol", GXutil.ltrim( localUtil.ntoc( Z5950MaqDteCol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z604MaqCodFor", GXutil.rtrim( Z604MaqCodFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6284MaqFacAbs", GXutil.ltrim( localUtil.ntoc( Z6284MaqFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6399MaqKgsId", GXutil.ltrim( localUtil.ntoc( Z6399MaqKgsId, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6432MaqPln", GXutil.ltrim( localUtil.ntoc( Z6432MaqPln, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6433MaqPlnVis", GXutil.ltrim( localUtil.ntoc( Z6433MaqPlnVis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6454MaqConFas", GXutil.ltrim( localUtil.ntoc( Z6454MaqConFas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8056MaqVaril", GXutil.rtrim( Z8056MaqVaril));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3599MaqRelBan", GXutil.ltrim( localUtil.ntoc( Z3599MaqRelBan, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8657MaqLoc", GXutil.rtrim( Z8657MaqLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9626MaqObs", Z9626MaqObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9982MaqFabsHm", GXutil.ltrim( localUtil.ntoc( Z9982MaqFabsHm, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1027MaqHhCon", GXutil.ltrim( localUtil.ntoc( Z1027MaqHhCon, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1026MaqHhCtr", GXutil.rtrim( Z1026MaqHhCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3600MaqVolBal", GXutil.ltrim( localUtil.ntoc( Z3600MaqVolBal, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3684MaqCosGen", GXutil.ltrim( localUtil.ntoc( Z3684MaqCosGen, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11821MaqMOD", GXutil.ltrim( localUtil.ntoc( Z11821MaqMOD, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11822MaqMOI", GXutil.ltrim( localUtil.ntoc( Z11822MaqMOI, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11823MaqEnerg", GXutil.ltrim( localUtil.ntoc( Z11823MaqEnerg, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11824MaqGas", GXutil.ltrim( localUtil.ntoc( Z11824MaqGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11825MaqAgua", GXutil.ltrim( localUtil.ntoc( Z11825MaqAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13020MaqTmCarg", GXutil.ltrim( localUtil.ntoc( Z13020MaqTmCarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13021MaqTmDcarg", GXutil.ltrim( localUtil.ntoc( Z13021MaqTmDcarg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13022MaqMtsMn", GXutil.ltrim( localUtil.ntoc( Z13022MaqMtsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13023MaqMtsMx", GXutil.ltrim( localUtil.ntoc( Z13023MaqMtsMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13179MaqCosFijo", GXutil.ltrim( localUtil.ntoc( Z13179MaqCosFijo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13180MaqCosKg", GXutil.ltrim( localUtil.ntoc( Z13180MaqCosKg, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14289MaqCuerdas", GXutil.ltrim( localUtil.ntoc( Z14289MaqCuerdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1011TipMaqCod", GXutil.rtrim( Z1011TipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11726MaqOgtId", GXutil.rtrim( Z11726MaqOgtId));
      app.GxWebStd.gx_hidden_field( httpContext, "O622MaqUltLin", GXutil.ltrim( localUtil.ntoc( O622MaqUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_379", GXutil.ltrim( localUtil.ntoc( nGXsfl_379_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1011TipMaqCod", GXutil.rtrim( A1011TipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N11726MaqOgtId", GXutil.rtrim( A11726MaqOgtId));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPMAQCOD_DATA", AV121TipMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPMAQCOD_DATA", AV121TipMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQOGTID_DATA", AV124MaqOgtId_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQOGTID_DATA", AV124MaqOgtId_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV112TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV112TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV112TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCDSC", A13734MaqCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV109EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV118MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPMAQCOD", GXutil.rtrim( AV114Insert_TipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MAQOGTID", GXutil.rtrim( AV116Insert_MaqOgtId));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCONFAS", GXutil.ltrim( localUtil.ntoc( A6454MaqConFas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHHCTR", GXutil.rtrim( A1026MaqHhCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFORMUL", GXutil.rtrim( A4282MaqFormul));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQULTFEC", GXutil.rtrim( A621MaqUltFec));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQRESDIA", GXutil.ltrim( localUtil.ntoc( A617MaqResDia, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHORASI", GXutil.ltrim( localUtil.ntoc( A611MaqHorAsi, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQORDSEQ", GXutil.ltrim( localUtil.ntoc( A616MaqOrdSeq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQULTLIN", GXutil.ltrim( localUtil.ntoc( A622MaqUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQPRDMIN", GXutil.ltrim( localUtil.ntoc( A4319MaqPrdMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQPRDMED", GXutil.ltrim( localUtil.ntoc( A4320MaqPrdMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQPRDMAX", GXutil.ltrim( localUtil.ntoc( A4321MaqPrdMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQKGSID", GXutil.ltrim( localUtil.ntoc( A6399MaqKgsId, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQOBS", A9626MaqObs);
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOSGEN", GXutil.ltrim( localUtil.ntoc( A3684MaqCosGen, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTSMN", GXutil.ltrim( localUtil.ntoc( A13022MaqMtsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTSMX", GXutil.ltrim( localUtil.ntoc( A13023MaqMtsMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPMAQDSC", GXutil.rtrim( A1012TipMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQOGTDSC", GXutil.rtrim( A11727MaqOgtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Objectcall", GXutil.rtrim( Combo_tipmaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Cls", GXutil.rtrim( Combo_tipmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Enabled", GXutil.booltostr( Combo_tipmaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Emptyitemtext", GXutil.rtrim( Combo_tipmaqcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQOGTID_Objectcall", GXutil.rtrim( Combo_maqogtid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQOGTID_Cls", GXutil.rtrim( Combo_maqogtid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQOGTID_Selectedvalue_set", GXutil.rtrim( Combo_maqogtid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQOGTID_Enabled", GXutil.booltostr( Combo_maqogtid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQOGTID_Emptyitem", GXutil.booltostr( Combo_maqogtid_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Objectcall", GXutil.rtrim( Dvpanel_paneldatos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Enabled", GXutil.booltostr( Dvpanel_paneldatos_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Width", GXutil.rtrim( Dvpanel_paneldatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Autowidth", GXutil.booltostr( Dvpanel_paneldatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Autoheight", GXutil.booltostr( Dvpanel_paneldatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Cls", GXutil.rtrim( Dvpanel_paneldatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Title", GXutil.rtrim( Dvpanel_paneldatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Collapsible", GXutil.booltostr( Dvpanel_paneldatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Collapsed", GXutil.booltostr( Dvpanel_paneldatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_paneldatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Iconposition", GXutil.rtrim( Dvpanel_paneldatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Autoscroll", GXutil.booltostr( Dvpanel_paneldatos_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Objectcall", GXutil.rtrim( Dvpanel_panelcapacidades_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Enabled", GXutil.booltostr( Dvpanel_panelcapacidades_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Width", GXutil.rtrim( Dvpanel_panelcapacidades_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Autowidth", GXutil.booltostr( Dvpanel_panelcapacidades_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Autoheight", GXutil.booltostr( Dvpanel_panelcapacidades_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Cls", GXutil.rtrim( Dvpanel_panelcapacidades_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Title", GXutil.rtrim( Dvpanel_panelcapacidades_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Collapsible", GXutil.booltostr( Dvpanel_panelcapacidades_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Collapsed", GXutil.booltostr( Dvpanel_panelcapacidades_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelcapacidades_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Iconposition", GXutil.rtrim( Dvpanel_panelcapacidades_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCAPACIDADES_Autoscroll", GXutil.booltostr( Dvpanel_panelcapacidades_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Objectcall", GXutil.rtrim( Dvpanel_panelcentralizacion_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Enabled", GXutil.booltostr( Dvpanel_panelcentralizacion_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Width", GXutil.rtrim( Dvpanel_panelcentralizacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Autowidth", GXutil.booltostr( Dvpanel_panelcentralizacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Autoheight", GXutil.booltostr( Dvpanel_panelcentralizacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Cls", GXutil.rtrim( Dvpanel_panelcentralizacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Title", GXutil.rtrim( Dvpanel_panelcentralizacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Collapsible", GXutil.booltostr( Dvpanel_panelcentralizacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Collapsed", GXutil.booltostr( Dvpanel_panelcentralizacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Showcollapseicon", GXutil.booltostr( Dvpanel_panelcentralizacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Iconposition", GXutil.rtrim( Dvpanel_panelcentralizacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCENTRALIZACION_Autoscroll", GXutil.booltostr( Dvpanel_panelcentralizacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Objectcall", GXutil.rtrim( Dvpanel_panelsalmuera_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Enabled", GXutil.booltostr( Dvpanel_panelsalmuera_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Width", GXutil.rtrim( Dvpanel_panelsalmuera_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Autowidth", GXutil.booltostr( Dvpanel_panelsalmuera_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Autoheight", GXutil.booltostr( Dvpanel_panelsalmuera_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Cls", GXutil.rtrim( Dvpanel_panelsalmuera_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Title", GXutil.rtrim( Dvpanel_panelsalmuera_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Collapsible", GXutil.booltostr( Dvpanel_panelsalmuera_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Collapsed", GXutil.booltostr( Dvpanel_panelsalmuera_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Showcollapseicon", GXutil.booltostr( Dvpanel_panelsalmuera_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Iconposition", GXutil.rtrim( Dvpanel_panelsalmuera_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSALMUERA_Autoscroll", GXutil.booltostr( Dvpanel_panelsalmuera_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Objectcall", GXutil.rtrim( Dvpanel_paneltiempos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Enabled", GXutil.booltostr( Dvpanel_paneltiempos_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Width", GXutil.rtrim( Dvpanel_paneltiempos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Autowidth", GXutil.booltostr( Dvpanel_paneltiempos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Autoheight", GXutil.booltostr( Dvpanel_paneltiempos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Cls", GXutil.rtrim( Dvpanel_paneltiempos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Title", GXutil.rtrim( Dvpanel_paneltiempos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Collapsible", GXutil.booltostr( Dvpanel_paneltiempos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Collapsed", GXutil.booltostr( Dvpanel_paneltiempos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Showcollapseicon", GXutil.booltostr( Dvpanel_paneltiempos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Iconposition", GXutil.rtrim( Dvpanel_paneltiempos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIEMPOS_Autoscroll", GXutil.booltostr( Dvpanel_paneltiempos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Objectcall", GXutil.rtrim( Dvpanel_panelfactabs_planificacion_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Enabled", GXutil.booltostr( Dvpanel_panelfactabs_planificacion_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Width", GXutil.rtrim( Dvpanel_panelfactabs_planificacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Autowidth", GXutil.booltostr( Dvpanel_panelfactabs_planificacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Autoheight", GXutil.booltostr( Dvpanel_panelfactabs_planificacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Cls", GXutil.rtrim( Dvpanel_panelfactabs_planificacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Title", GXutil.rtrim( Dvpanel_panelfactabs_planificacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Collapsible", GXutil.booltostr( Dvpanel_panelfactabs_planificacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Collapsed", GXutil.booltostr( Dvpanel_panelfactabs_planificacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Showcollapseicon", GXutil.booltostr( Dvpanel_panelfactabs_planificacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Iconposition", GXutil.rtrim( Dvpanel_panelfactabs_planificacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFACTABS_PLANIFICACION_Autoscroll", GXutil.booltostr( Dvpanel_panelfactabs_planificacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Objectcall", GXutil.rtrim( Dvpanel_paneltipomaquina_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Enabled", GXutil.booltostr( Dvpanel_paneltipomaquina_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Width", GXutil.rtrim( Dvpanel_paneltipomaquina_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Autowidth", GXutil.booltostr( Dvpanel_paneltipomaquina_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Autoheight", GXutil.booltostr( Dvpanel_paneltipomaquina_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Cls", GXutil.rtrim( Dvpanel_paneltipomaquina_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Title", GXutil.rtrim( Dvpanel_paneltipomaquina_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Collapsible", GXutil.booltostr( Dvpanel_paneltipomaquina_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Collapsed", GXutil.booltostr( Dvpanel_paneltipomaquina_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Showcollapseicon", GXutil.booltostr( Dvpanel_paneltipomaquina_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Iconposition", GXutil.rtrim( Dvpanel_paneltipomaquina_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELTIPOMAQUINA_Autoscroll", GXutil.booltostr( Dvpanel_paneltipomaquina_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Objectcall", GXutil.rtrim( Gxuitabspanel_tabs1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Enabled", GXutil.booltostr( Gxuitabspanel_tabs1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs1_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Class", GXutil.rtrim( Gxuitabspanel_tabs1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs1_Historymanagement));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Objectcall", GXutil.rtrim( Dvpanel_panelobservaciones_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Enabled", GXutil.booltostr( Dvpanel_panelobservaciones_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Width", GXutil.rtrim( Dvpanel_panelobservaciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Autowidth", GXutil.booltostr( Dvpanel_panelobservaciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Autoheight", GXutil.booltostr( Dvpanel_panelobservaciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Cls", GXutil.rtrim( Dvpanel_panelobservaciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Title", GXutil.rtrim( Dvpanel_panelobservaciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Collapsible", GXutil.booltostr( Dvpanel_panelobservaciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Collapsed", GXutil.booltostr( Dvpanel_panelobservaciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelobservaciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Iconposition", GXutil.rtrim( Dvpanel_panelobservaciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Autoscroll", GXutil.booltostr( Dvpanel_panelobservaciones_Autoscroll));
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
      return formatLink("app.tmaqui1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV109EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV118MaqCod))}, new String[] {"Gx_mode","EmprCod","MaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMAQUI1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO MAQUINAS Basico", "") ;
   }

   public void initializeNonKey1OS65( )
   {
      A1011TipMaqCod = "" ;
      n1011TipMaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1011TipMaqCod", A1011TipMaqCod);
      A11726MaqOgtId = "" ;
      n11726MaqOgtId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
      A12123MaqCosMm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12123MaqCosMm", GXutil.ltrimstr( A12123MaqCosMm, 10, 4));
      A13734MaqCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A14288MaqDscLarg = "" ;
      n14288MaqDscLarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14288MaqDscLarg", A14288MaqDscLarg);
      A600MaqCap = 0 ;
      n600MaqCap = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A600MaqCap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A600MaqCap), 6, 0));
      A605MaqCosMin = DecimalUtil.ZERO ;
      n605MaqCosMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A605MaqCosMin", GXutil.ltrimstr( A605MaqCosMin, 10, 4));
      A612MaqHorPro = (byte)(0) ;
      n612MaqHorPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A612MaqHorPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A612MaqHorPro), 2, 0));
      A615MaqMinPro = (byte)(0) ;
      n615MaqMinPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A615MaqMinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A615MaqMinPro), 2, 0));
      A620MaqTip = "" ;
      n620MaqTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A620MaqTip", A620MaqTip);
      A607MaqEst = "" ;
      n607MaqEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A607MaqEst", A607MaqEst);
      A621MaqUltFec = "" ;
      n621MaqUltFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A621MaqUltFec", A621MaqUltFec);
      A617MaqResDia = DecimalUtil.ZERO ;
      n617MaqResDia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A617MaqResDia", GXutil.ltrimstr( A617MaqResDia, 5, 2));
      A611MaqHorAsi = DecimalUtil.ZERO ;
      n611MaqHorAsi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A611MaqHorAsi", GXutil.ltrimstr( A611MaqHorAsi, 7, 2));
      A616MaqOrdSeq = (short)(0) ;
      n616MaqOrdSeq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A616MaqOrdSeq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A616MaqOrdSeq), 4, 0));
      A622MaqUltLin = (byte)(0) ;
      n622MaqUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      A1012TipMaqDsc = "" ;
      n1012TipMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1012TipMaqDsc", A1012TipMaqDsc);
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      n4283MaqKgsMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      n4284MaqKgsMed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4284MaqKgsMed", GXutil.ltrimstr( A4284MaqKgsMed, 9, 2));
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      n4285MaqKgsMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
      A4319MaqPrdMin = (short)(0) ;
      n4319MaqPrdMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4319MaqPrdMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4319MaqPrdMin), 4, 0));
      A4320MaqPrdMed = (short)(0) ;
      n4320MaqPrdMed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4320MaqPrdMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4320MaqPrdMed), 4, 0));
      A4321MaqPrdMax = (short)(0) ;
      n4321MaqPrdMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4321MaqPrdMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4321MaqPrdMax), 4, 0));
      A623MaqVolMax = 0 ;
      n623MaqVolMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
      A625MaqVolMin = 0 ;
      n625MaqVolMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
      A624MaqVolMed = 0 ;
      n624MaqVolMed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
      A2801MaqVolRes = 0 ;
      n2801MaqVolRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2801MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2801MaqVolRes), 5, 0));
      A2802MaqVolTop = 0 ;
      n2802MaqVolTop = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2802MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2802MaqVolTop), 5, 0));
      A618MaqTemMax = (short)(0) ;
      n618MaqTemMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
      A619MaqTinTip = "" ;
      n619MaqTinTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A619MaqTinTip", A619MaqTinTip);
      A2391MaqMicro = (byte)(0) ;
      n2391MaqMicro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2391MaqMicro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2391MaqMicro), 2, 0));
      A3598MaqNroTub = (byte)(0) ;
      n3598MaqNroTub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3598MaqNroTub", GXutil.str( A3598MaqNroTub, 1, 0));
      A5292MaqCodBan = "" ;
      n5292MaqCodBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5292MaqCodBan", A5292MaqCodBan);
      A5420MaqSalMKi = DecimalUtil.ZERO ;
      n5420MaqSalMKi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5420MaqSalMKi", GXutil.ltrimstr( A5420MaqSalMKi, 11, 3));
      A5421MaqSalMKf = DecimalUtil.ZERO ;
      n5421MaqSalMKf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5421MaqSalMKf", GXutil.ltrimstr( A5421MaqSalMKf, 11, 3));
      A5463MaqCantCor = DecimalUtil.ZERO ;
      n5463MaqCantCor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5463MaqCantCor", GXutil.ltrimstr( A5463MaqCantCor, 11, 3));
      A5950MaqDteCol = 0 ;
      n5950MaqDteCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5950MaqDteCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5950MaqDteCol), 5, 0));
      A604MaqCodFor = "" ;
      n604MaqCodFor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A604MaqCodFor", A604MaqCodFor);
      A6284MaqFacAbs = DecimalUtil.ZERO ;
      n6284MaqFacAbs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6284MaqFacAbs", GXutil.ltrimstr( A6284MaqFacAbs, 6, 2));
      A6399MaqKgsId = DecimalUtil.ZERO ;
      n6399MaqKgsId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6399MaqKgsId", GXutil.ltrimstr( A6399MaqKgsId, 9, 2));
      A6432MaqPln = (byte)(0) ;
      n6432MaqPln = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6432MaqPln", GXutil.str( A6432MaqPln, 1, 0));
      A6433MaqPlnVis = (byte)(0) ;
      n6433MaqPlnVis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6433MaqPlnVis", GXutil.str( A6433MaqPlnVis, 1, 0));
      A3599MaqRelBan = (byte)(0) ;
      n3599MaqRelBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3599MaqRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3599MaqRelBan), 2, 0));
      A8657MaqLoc = "" ;
      n8657MaqLoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8657MaqLoc", A8657MaqLoc);
      A9626MaqObs = "" ;
      n9626MaqObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9626MaqObs", A9626MaqObs);
      A9982MaqFabsHm = DecimalUtil.ZERO ;
      n9982MaqFabsHm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9982MaqFabsHm", GXutil.ltrimstr( A9982MaqFabsHm, 6, 2));
      A1027MaqHhCon = DecimalUtil.ZERO ;
      n1027MaqHhCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1027MaqHhCon", GXutil.ltrimstr( A1027MaqHhCon, 10, 2));
      A3600MaqVolBal = 0 ;
      n3600MaqVolBal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3600MaqVolBal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3600MaqVolBal), 5, 0));
      A3684MaqCosGen = DecimalUtil.ZERO ;
      n3684MaqCosGen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3684MaqCosGen", GXutil.ltrimstr( A3684MaqCosGen, 8, 2));
      A11727MaqOgtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11727MaqOgtDsc", A11727MaqOgtDsc);
      A11821MaqMOD = DecimalUtil.ZERO ;
      n11821MaqMOD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11821MaqMOD", GXutil.ltrimstr( A11821MaqMOD, 10, 4));
      A11822MaqMOI = DecimalUtil.ZERO ;
      n11822MaqMOI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11822MaqMOI", GXutil.ltrimstr( A11822MaqMOI, 10, 4));
      A11823MaqEnerg = DecimalUtil.ZERO ;
      n11823MaqEnerg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11823MaqEnerg", GXutil.ltrimstr( A11823MaqEnerg, 10, 4));
      A11824MaqGas = DecimalUtil.ZERO ;
      n11824MaqGas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11824MaqGas", GXutil.ltrimstr( A11824MaqGas, 10, 4));
      A11825MaqAgua = DecimalUtil.ZERO ;
      n11825MaqAgua = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11825MaqAgua", GXutil.ltrimstr( A11825MaqAgua, 10, 4));
      A13020MaqTmCarg = (short)(0) ;
      n13020MaqTmCarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13020MaqTmCarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13020MaqTmCarg), 4, 0));
      A13021MaqTmDcarg = (short)(0) ;
      n13021MaqTmDcarg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13021MaqTmDcarg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13021MaqTmDcarg), 4, 0));
      A13022MaqMtsMn = DecimalUtil.ZERO ;
      n13022MaqMtsMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13022MaqMtsMn", GXutil.ltrimstr( A13022MaqMtsMn, 9, 2));
      A13023MaqMtsMx = DecimalUtil.ZERO ;
      n13023MaqMtsMx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13023MaqMtsMx", GXutil.ltrimstr( A13023MaqMtsMx, 9, 2));
      A14289MaqCuerdas = (short)(0) ;
      n14289MaqCuerdas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14289MaqCuerdas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14289MaqCuerdas), 4, 0));
      A3601MaqTipMaq = "N" ;
      n3601MaqTipMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3601MaqTipMaq", A3601MaqTipMaq);
      A4282MaqFormul = "N" ;
      n4282MaqFormul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4282MaqFormul", A4282MaqFormul);
      A601MaqChp = "N" ;
      n601MaqChp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
      A5419MaqSalM = "N" ;
      n5419MaqSalM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
      A5593MaqTipCen = " " ;
      n5593MaqTipCen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5593MaqTipCen", A5593MaqTipCen);
      A5949MaqDosifP = "N" ;
      n5949MaqDosifP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
      A6454MaqConFas = 0 ;
      n6454MaqConFas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6454MaqConFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6454MaqConFas), 6, 0));
      A8056MaqVaril = "N" ;
      n8056MaqVaril = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
      A1026MaqHhCtr = "N" ;
      n1026MaqHhCtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1026MaqHhCtr", A1026MaqHhCtr);
      A13179MaqCosFijo = DecimalUtil.doubleToDec(0) ;
      n13179MaqCosFijo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13179MaqCosFijo", GXutil.ltrimstr( A13179MaqCosFijo, 10, 4));
      A13180MaqCosKg = DecimalUtil.doubleToDec(0) ;
      n13180MaqCosKg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13180MaqCosKg", GXutil.ltrimstr( A13180MaqCosKg, 10, 4));
      O622MaqUltLin = A622MaqUltLin ;
      n622MaqUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
      Z3601MaqTipMaq = "" ;
      Z606MaqDsc = "" ;
      Z14288MaqDscLarg = "" ;
      Z600MaqCap = 0 ;
      Z605MaqCosMin = DecimalUtil.ZERO ;
      Z612MaqHorPro = (byte)(0) ;
      Z615MaqMinPro = (byte)(0) ;
      Z620MaqTip = "" ;
      Z607MaqEst = "" ;
      Z621MaqUltFec = "" ;
      Z617MaqResDia = DecimalUtil.ZERO ;
      Z611MaqHorAsi = DecimalUtil.ZERO ;
      Z616MaqOrdSeq = (short)(0) ;
      Z622MaqUltLin = (byte)(0) ;
      Z4282MaqFormul = "" ;
      Z4283MaqKgsMin = DecimalUtil.ZERO ;
      Z4284MaqKgsMed = DecimalUtil.ZERO ;
      Z4285MaqKgsMax = DecimalUtil.ZERO ;
      Z4319MaqPrdMin = (short)(0) ;
      Z4320MaqPrdMed = (short)(0) ;
      Z4321MaqPrdMax = (short)(0) ;
      Z623MaqVolMax = 0 ;
      Z625MaqVolMin = 0 ;
      Z624MaqVolMed = 0 ;
      Z2801MaqVolRes = 0 ;
      Z2802MaqVolTop = 0 ;
      Z618MaqTemMax = (short)(0) ;
      Z601MaqChp = "" ;
      Z619MaqTinTip = "" ;
      Z2391MaqMicro = (byte)(0) ;
      Z3598MaqNroTub = (byte)(0) ;
      Z5292MaqCodBan = "" ;
      Z5419MaqSalM = "" ;
      Z5420MaqSalMKi = DecimalUtil.ZERO ;
      Z5421MaqSalMKf = DecimalUtil.ZERO ;
      Z5463MaqCantCor = DecimalUtil.ZERO ;
      Z5593MaqTipCen = "" ;
      Z5949MaqDosifP = "" ;
      Z5950MaqDteCol = 0 ;
      Z604MaqCodFor = "" ;
      Z6284MaqFacAbs = DecimalUtil.ZERO ;
      Z6399MaqKgsId = DecimalUtil.ZERO ;
      Z6432MaqPln = (byte)(0) ;
      Z6433MaqPlnVis = (byte)(0) ;
      Z6454MaqConFas = 0 ;
      Z8056MaqVaril = "" ;
      Z3599MaqRelBan = (byte)(0) ;
      Z8657MaqLoc = "" ;
      Z9626MaqObs = "" ;
      Z9982MaqFabsHm = DecimalUtil.ZERO ;
      Z1027MaqHhCon = DecimalUtil.ZERO ;
      Z1026MaqHhCtr = "" ;
      Z3600MaqVolBal = 0 ;
      Z3684MaqCosGen = DecimalUtil.ZERO ;
      Z11821MaqMOD = DecimalUtil.ZERO ;
      Z11822MaqMOI = DecimalUtil.ZERO ;
      Z11823MaqEnerg = DecimalUtil.ZERO ;
      Z11824MaqGas = DecimalUtil.ZERO ;
      Z11825MaqAgua = DecimalUtil.ZERO ;
      Z13020MaqTmCarg = (short)(0) ;
      Z13021MaqTmDcarg = (short)(0) ;
      Z13022MaqMtsMn = DecimalUtil.ZERO ;
      Z13023MaqMtsMx = DecimalUtil.ZERO ;
      Z13179MaqCosFijo = DecimalUtil.ZERO ;
      Z13180MaqCosKg = DecimalUtil.ZERO ;
      Z14289MaqCuerdas = (short)(0) ;
      Z1011TipMaqCod = "" ;
      Z11726MaqOgtId = "" ;
   }

   public void initAll1OS65( )
   {
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      initializeNonKey1OS65( ) ;
   }

   public void standaloneModalInsert( )
   {
      A3601MaqTipMaq = i3601MaqTipMaq ;
      n3601MaqTipMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3601MaqTipMaq", A3601MaqTipMaq);
      A601MaqChp = i601MaqChp ;
      n601MaqChp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
      A6454MaqConFas = i6454MaqConFas ;
      n6454MaqConFas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6454MaqConFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6454MaqConFas), 6, 0));
      A5419MaqSalM = i5419MaqSalM ;
      n5419MaqSalM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
      A5593MaqTipCen = i5593MaqTipCen ;
      n5593MaqTipCen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5593MaqTipCen", A5593MaqTipCen);
      A5949MaqDosifP = i5949MaqDosifP ;
      n5949MaqDosifP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
      A8056MaqVaril = i8056MaqVaril ;
      n8056MaqVaril = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
      A1026MaqHhCtr = i1026MaqHhCtr ;
      n1026MaqHhCtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1026MaqHhCtr", A1026MaqHhCtr);
      A13179MaqCosFijo = i13179MaqCosFijo ;
      n13179MaqCosFijo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13179MaqCosFijo", GXutil.ltrimstr( A13179MaqCosFijo, 10, 4));
      A13180MaqCosKg = i13180MaqCosKg ;
      n13180MaqCosKg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13180MaqCosKg", GXutil.ltrimstr( A13180MaqCosKg, 10, 4));
      A4282MaqFormul = i4282MaqFormul ;
      n4282MaqFormul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4282MaqFormul", A4282MaqFormul);
   }

   public void initializeNonKey1OS68( )
   {
      A613MaqLinTex = "" ;
      Z613MaqLinTex = "" ;
   }

   public void initAll1OS68( )
   {
      A320DesTecLin = (byte)(0) ;
      initializeNonKey1OS68( ) ;
   }

   public void standaloneModalInsert1OS68( )
   {
      A622MaqUltLin = i622MaqUltLin ;
      n622MaqUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622MaqUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A622MaqUltLin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821168169", true, true);
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
      httpContext.AddJavascriptSource("tmaqui1.js", "?2026821168169", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties68( )
   {
      edtDesTecLin_Enabled = defedtDesTecLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDesTecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDesTecLin_Enabled), 5, 0), !bGXsfl_379_Refreshing);
   }

   public void startgridcontrol379( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A320DesTecLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDesTecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A613MaqLinTex));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqLinTex_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtMaqDscLarg_Internalname = "MAQDSCLARG" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      edtMaqCap_Internalname = "MAQCAP" ;
      edtMaqCosMin_Internalname = "MAQCOSMIN" ;
      divMaqcosmin_cell_Internalname = "MAQCOSMIN_CELL" ;
      edtMaqCosKg_Internalname = "MAQCOSKG" ;
      divMaqcoskg_cell_Internalname = "MAQCOSKG_CELL" ;
      edtMaqCosFijo_Internalname = "MAQCOSFIJO" ;
      divMaqcosfijo_cell_Internalname = "MAQCOSFIJO_CELL" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      lblTextblockmaqhorpro_Internalname = "TEXTBLOCKMAQHORPRO" ;
      edtMaqHorPro_Internalname = "MAQHORPRO" ;
      divUnnamedtablemaqhorpro_Internalname = "UNNAMEDTABLEMAQHORPRO" ;
      lblTextblockmaqminpro_Internalname = "TEXTBLOCKMAQMINPRO" ;
      edtMaqMinPro_Internalname = "MAQMINPRO" ;
      divUnnamedtablemaqminpro_Internalname = "UNNAMEDTABLEMAQMINPRO" ;
      tblUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      grpUnnamedgroup12_Internalname = "UNNAMEDGROUP12" ;
      cmbMaqTip.setInternalname( "MAQTIP" );
      cmbMaqEst.setInternalname( "MAQEST" );
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      lblTextblocktipmaqcod_Internalname = "TEXTBLOCKTIPMAQCOD" ;
      Combo_tipmaqcod_Internalname = "COMBO_TIPMAQCOD" ;
      edtTipMaqCod_Internalname = "TIPMAQCOD" ;
      divTablesplittedtipmaqcod_Internalname = "TABLESPLITTEDTIPMAQCOD" ;
      edtMaqTemMax_Internalname = "MAQTEMMAX" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      cmbMaqChp.setInternalname( "MAQCHP" );
      edtMaqNroTub_Internalname = "MAQNROTUB" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      lblTextblockmaqogtid_Internalname = "TEXTBLOCKMAQOGTID" ;
      Combo_maqogtid_Internalname = "COMBO_MAQOGTID" ;
      edtMaqOgtId_Internalname = "MAQOGTID" ;
      divTablesplittedmaqogtid_Internalname = "TABLESPLITTEDMAQOGTID" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divPaneldatos_Internalname = "PANELDATOS" ;
      Dvpanel_paneldatos_Internalname = "DVPANEL_PANELDATOS" ;
      edtMaqMOD_Internalname = "MAQMOD" ;
      edtMaqMOI_Internalname = "MAQMOI" ;
      edtMaqEnerg_Internalname = "MAQENERG" ;
      edtMaqGas_Internalname = "MAQGAS" ;
      edtMaqAgua_Internalname = "MAQAGUA" ;
      edtMaqCosMm_Internalname = "MAQCOSMM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
      edtMaqVolMax_Internalname = "MAQVOLMAX" ;
      edtMaqVolMed_Internalname = "MAQVOLMED" ;
      edtMaqVolMin_Internalname = "MAQVOLMIN" ;
      edtMaqRelBan_Internalname = "MAQRELBAN" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX" ;
      edtMaqKgsMed_Internalname = "MAQKGSMED" ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = "UNNAMEDGROUP5" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtMaqTinTip_Internalname = "MAQTINTIP" ;
      edtMaqVolRes_Internalname = "MAQVOLRES" ;
      edtMaqVolTop_Internalname = "MAQVOLTOP" ;
      edtMaqVolBal_Internalname = "MAQVOLBAL" ;
      divMaqvolbal_cell_Internalname = "MAQVOLBAL_CELL" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divPanelcapacidades_Internalname = "PANELCAPACIDADES" ;
      Dvpanel_panelcapacidades_Internalname = "DVPANEL_PANELCAPACIDADES" ;
      edtMaqMicro_Internalname = "MAQMICRO" ;
      cmbMaqCodBan.setInternalname( "MAQCODBAN" );
      divMaqcodban_cell_Internalname = "MAQCODBAN_CELL" ;
      edtMaqTipCen_Internalname = "MAQTIPCEN" ;
      divMaqtipcen_cell_Internalname = "MAQTIPCEN_CELL" ;
      cmbMaqDosifP.setInternalname( "MAQDOSIFP" );
      edtMaqCodFor_Internalname = "MAQCODFOR" ;
      edtMaqCuerdas_Internalname = "MAQCUERDAS" ;
      divPanelcentralizacion_Internalname = "PANELCENTRALIZACION" ;
      Dvpanel_panelcentralizacion_Internalname = "DVPANEL_PANELCENTRALIZACION" ;
      cmbMaqSalM.setInternalname( "MAQSALM" );
      edtMaqSalMKi_Internalname = "MAQSALMKI" ;
      edtMaqSalMKf_Internalname = "MAQSALMKF" ;
      edtMaqDteCol_Internalname = "MAQDTECOL" ;
      divPanelsalmuera_Internalname = "PANELSALMUERA" ;
      Dvpanel_panelsalmuera_Internalname = "DVPANEL_PANELSALMUERA" ;
      divDvpanel_panelsalmuera_cell_Internalname = "DVPANEL_PANELSALMUERA_CELL" ;
      edtMaqTmCarg_Internalname = "MAQTMCARG" ;
      edtMaqTmDcarg_Internalname = "MAQTMDCARG" ;
      divPaneltiempos_Internalname = "PANELTIEMPOS" ;
      Dvpanel_paneltiempos_Internalname = "DVPANEL_PANELTIEMPOS" ;
      cmbMaqPlnVis.setInternalname( "MAQPLNVIS" );
      divMaqplnvis_cell_Internalname = "MAQPLNVIS_CELL" ;
      cmbMaqPln.setInternalname( "MAQPLN" );
      divMaqpln_cell_Internalname = "MAQPLN_CELL" ;
      edtMaqFacAbs_Internalname = "MAQFACABS" ;
      edtMaqFabsHm_Internalname = "MAQFABSHM" ;
      edtMaqCantCor_Internalname = "MAQCANTCOR" ;
      divMaqcantcor_cell_Internalname = "MAQCANTCOR_CELL" ;
      edtMaqHhCon_Internalname = "MAQHHCON" ;
      divMaqhhcon_cell_Internalname = "MAQHHCON_CELL" ;
      divPanelfactabs_planificacion_Internalname = "PANELFACTABS_PLANIFICACION" ;
      Dvpanel_panelfactabs_planificacion_Internalname = "DVPANEL_PANELFACTABS_PLANIFICACION" ;
      edtMaqLoc_Internalname = "MAQLOC" ;
      divMaqloc_cell_Internalname = "MAQLOC_CELL" ;
      cmbMaqVaril.setInternalname( "MAQVARIL" );
      divMaqvaril_cell_Internalname = "MAQVARIL_CELL" ;
      edtMaqTipMaq_Internalname = "MAQTIPMAQ" ;
      divMaqtipmaq_cell_Internalname = "MAQTIPMAQ_CELL" ;
      divPaneltipomaquina_Internalname = "PANELTIPOMAQUINA" ;
      Dvpanel_paneltipomaquina_Internalname = "DVPANEL_PANELTIPOMAQUINA" ;
      divDvpanel_paneltipomaquina_cell_Internalname = "DVPANEL_PANELTIPOMAQUINA_CELL" ;
      divTableresultado2_Internalname = "TABLERESULTADO2" ;
      Gxuitabspanel_tabs1_Internalname = "GXUITABSPANEL_TABS1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtDesTecLin_Internalname = "DESTECLIN" ;
      edtMaqLinTex_Internalname = "MAQLINTEX" ;
      divPanelobservaciones_Internalname = "PANELOBSERVACIONES" ;
      Dvpanel_panelobservaciones_Internalname = "DVPANEL_PANELOBSERVACIONES" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombotipmaqcod_Internalname = "vCOMBOTIPMAQCOD" ;
      divSectionattribute_tipmaqcod_Internalname = "SECTIONATTRIBUTE_TIPMAQCOD" ;
      edtavCombomaqogtid_Internalname = "vCOMBOMAQOGTID" ;
      divSectionattribute_maqogtid_Internalname = "SECTIONATTRIBUTE_MAQOGTID" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO MAQUINAS Basico", "") );
      edtMaqLinTex_Jsonclick = "" ;
      edtDesTecLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtMaqLinTex_Enabled = 1 ;
      edtDesTecLin_Enabled = 1 ;
      edtavCombomaqogtid_Jsonclick = "" ;
      edtavCombomaqogtid_Enabled = 0 ;
      edtavCombomaqogtid_Visible = 1 ;
      edtavCombotipmaqcod_Jsonclick = "" ;
      edtavCombotipmaqcod_Enabled = 0 ;
      edtavCombotipmaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_panelobservaciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Iconposition = "Right" ;
      Dvpanel_panelobservaciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelobservaciones_Title = httpContext.getMessage( "Observaciones", "") ;
      Dvpanel_panelobservaciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelobservaciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelobservaciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Width = "100%" ;
      edtMaqTipMaq_Jsonclick = "" ;
      edtMaqTipMaq_Enabled = 1 ;
      edtMaqTipMaq_Visible = 1 ;
      divMaqtipmaq_cell_Class = "col-xs-12 col-sm-4" ;
      cmbMaqVaril.setJsonclick( "" );
      cmbMaqVaril.setEnabled( 1 );
      cmbMaqVaril.setVisible( 1 );
      divMaqvaril_cell_Class = "col-xs-12 col-sm-4" ;
      edtMaqLoc_Jsonclick = "" ;
      edtMaqLoc_Enabled = 1 ;
      edtMaqLoc_Visible = 1 ;
      divMaqloc_cell_Class = "col-xs-12 col-sm-4" ;
      Dvpanel_paneltipomaquina_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_paneltipomaquina_Iconposition = "Right" ;
      Dvpanel_paneltipomaquina_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_paneltipomaquina_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_paneltipomaquina_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_paneltipomaquina_Title = httpContext.getMessage( "Tipo Máquina", "") ;
      Dvpanel_paneltipomaquina_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_paneltipomaquina_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_paneltipomaquina_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_paneltipomaquina_Width = "100%" ;
      divDvpanel_paneltipomaquina_cell_Class = "col-xs-12" ;
      edtMaqHhCon_Jsonclick = "" ;
      edtMaqHhCon_Enabled = 1 ;
      edtMaqHhCon_Visible = 1 ;
      divMaqhhcon_cell_Class = "col-xs-12 col-sm-6" ;
      edtMaqCantCor_Jsonclick = "" ;
      edtMaqCantCor_Enabled = 1 ;
      edtMaqCantCor_Visible = 1 ;
      divMaqcantcor_cell_Class = "col-xs-12 col-sm-6" ;
      edtMaqFabsHm_Jsonclick = "" ;
      edtMaqFabsHm_Enabled = 1 ;
      edtMaqFacAbs_Jsonclick = "" ;
      edtMaqFacAbs_Enabled = 1 ;
      cmbMaqPln.setJsonclick( "" );
      cmbMaqPln.setEnabled( 1 );
      cmbMaqPln.setVisible( 1 );
      divMaqpln_cell_Class = "col-xs-12 col-sm-6" ;
      cmbMaqPlnVis.setJsonclick( "" );
      cmbMaqPlnVis.setEnabled( 1 );
      cmbMaqPlnVis.setVisible( 1 );
      divMaqplnvis_cell_Class = "col-xs-12 col-sm-6" ;
      Dvpanel_panelfactabs_planificacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelfactabs_planificacion_Iconposition = "Right" ;
      Dvpanel_panelfactabs_planificacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelfactabs_planificacion_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelfactabs_planificacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelfactabs_planificacion_Title = httpContext.getMessage( "Fact Abs_Planificacion", "") ;
      Dvpanel_panelfactabs_planificacion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelfactabs_planificacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelfactabs_planificacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelfactabs_planificacion_Width = "100%" ;
      edtMaqTmDcarg_Jsonclick = "" ;
      edtMaqTmDcarg_Enabled = 1 ;
      edtMaqTmCarg_Jsonclick = "" ;
      edtMaqTmCarg_Enabled = 1 ;
      Dvpanel_paneltiempos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_paneltiempos_Iconposition = "Right" ;
      Dvpanel_paneltiempos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_paneltiempos_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_paneltiempos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_paneltiempos_Title = httpContext.getMessage( "Tiempos", "") ;
      Dvpanel_paneltiempos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_paneltiempos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_paneltiempos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_paneltiempos_Width = "100%" ;
      edtMaqDteCol_Jsonclick = "" ;
      edtMaqDteCol_Enabled = 1 ;
      edtMaqSalMKf_Jsonclick = "" ;
      edtMaqSalMKf_Enabled = 1 ;
      edtMaqSalMKi_Jsonclick = "" ;
      edtMaqSalMKi_Enabled = 1 ;
      cmbMaqSalM.setJsonclick( "" );
      cmbMaqSalM.setEnabled( 1 );
      Dvpanel_panelsalmuera_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelsalmuera_Iconposition = "Right" ;
      Dvpanel_panelsalmuera_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelsalmuera_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelsalmuera_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelsalmuera_Title = httpContext.getMessage( "Sal Muera", "") ;
      Dvpanel_panelsalmuera_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelsalmuera_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelsalmuera_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelsalmuera_Width = "100%" ;
      divDvpanel_panelsalmuera_cell_Class = "col-xs-12" ;
      edtMaqCuerdas_Jsonclick = "" ;
      edtMaqCuerdas_Enabled = 1 ;
      edtMaqCodFor_Jsonclick = "" ;
      edtMaqCodFor_Enabled = 1 ;
      cmbMaqDosifP.setJsonclick( "" );
      cmbMaqDosifP.setEnabled( 1 );
      edtMaqTipCen_Jsonclick = "" ;
      edtMaqTipCen_Enabled = 1 ;
      edtMaqTipCen_Visible = 1 ;
      divMaqtipcen_cell_Class = "col-xs-12 col-sm-6" ;
      cmbMaqCodBan.setJsonclick( "" );
      cmbMaqCodBan.setEnabled( 1 );
      cmbMaqCodBan.setVisible( 1 );
      divMaqcodban_cell_Class = "col-xs-12 col-sm-6" ;
      edtMaqMicro_Jsonclick = "" ;
      edtMaqMicro_Enabled = 1 ;
      Dvpanel_panelcentralizacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelcentralizacion_Iconposition = "Right" ;
      Dvpanel_panelcentralizacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelcentralizacion_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelcentralizacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelcentralizacion_Title = httpContext.getMessage( "Centralización", "") ;
      Dvpanel_panelcentralizacion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelcentralizacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelcentralizacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelcentralizacion_Width = "100%" ;
      edtMaqVolBal_Jsonclick = "" ;
      edtMaqVolBal_Enabled = 1 ;
      edtMaqVolBal_Visible = 1 ;
      divMaqvolbal_cell_Class = "col-xs-12" ;
      edtMaqVolTop_Jsonclick = "" ;
      edtMaqVolTop_Enabled = 1 ;
      edtMaqVolRes_Jsonclick = "" ;
      edtMaqVolRes_Enabled = 1 ;
      edtMaqTinTip_Jsonclick = "" ;
      edtMaqTinTip_Enabled = 1 ;
      edtMaqKgsMin_Jsonclick = "" ;
      edtMaqKgsMin_Enabled = 1 ;
      edtMaqKgsMed_Jsonclick = "" ;
      edtMaqKgsMed_Enabled = 1 ;
      edtMaqKgsMax_Jsonclick = "" ;
      edtMaqKgsMax_Enabled = 1 ;
      edtMaqRelBan_Jsonclick = "" ;
      edtMaqRelBan_Enabled = 1 ;
      edtMaqVolMin_Jsonclick = "" ;
      edtMaqVolMin_Enabled = 1 ;
      edtMaqVolMed_Jsonclick = "" ;
      edtMaqVolMed_Enabled = 1 ;
      edtMaqVolMax_Jsonclick = "" ;
      edtMaqVolMax_Enabled = 1 ;
      Dvpanel_panelcapacidades_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelcapacidades_Iconposition = "Right" ;
      Dvpanel_panelcapacidades_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelcapacidades_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelcapacidades_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelcapacidades_Title = httpContext.getMessage( "Capacidades", "") ;
      Dvpanel_panelcapacidades_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelcapacidades_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelcapacidades_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelcapacidades_Width = "100%" ;
      edtMaqCosMm_Jsonclick = "" ;
      edtMaqCosMm_Enabled = 0 ;
      edtMaqAgua_Jsonclick = "" ;
      edtMaqAgua_Enabled = 1 ;
      edtMaqGas_Jsonclick = "" ;
      edtMaqGas_Enabled = 1 ;
      edtMaqEnerg_Jsonclick = "" ;
      edtMaqEnerg_Enabled = 1 ;
      edtMaqMOI_Jsonclick = "" ;
      edtMaqMOI_Enabled = 1 ;
      edtMaqMOD_Jsonclick = "" ;
      edtMaqMOD_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Costes detalle", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      edtMaqOgtId_Jsonclick = "" ;
      edtMaqOgtId_Enabled = 1 ;
      edtMaqOgtId_Visible = 1 ;
      Combo_maqogtid_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqogtid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqogtid_Enabled = GXutil.toBoolean( -1) ;
      edtMaqNroTub_Jsonclick = "" ;
      edtMaqNroTub_Enabled = 1 ;
      cmbMaqChp.setJsonclick( "" );
      cmbMaqChp.setEnabled( 1 );
      Dvpanel_paneldatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Iconposition = "Right" ;
      Dvpanel_paneldatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_paneldatos_Title = httpContext.getMessage( "Datos", "") ;
      Dvpanel_paneldatos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_paneldatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_paneldatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Width = "100%" ;
      edtMaqTemMax_Jsonclick = "" ;
      edtMaqTemMax_Enabled = 1 ;
      edtTipMaqCod_Jsonclick = "" ;
      edtTipMaqCod_Enabled = 1 ;
      edtTipMaqCod_Visible = 1 ;
      Combo_tipmaqcod_Emptyitemtext = "" ;
      Combo_tipmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipmaqcod_Enabled = GXutil.toBoolean( -1) ;
      cmbMaqEst.setJsonclick( "" );
      cmbMaqEst.setEnabled( 1 );
      cmbMaqTip.setJsonclick( "" );
      cmbMaqTip.setEnabled( 1 );
      edtMaqMinPro_Jsonclick = "" ;
      edtMaqMinPro_Enabled = 1 ;
      edtMaqHorPro_Jsonclick = "" ;
      edtMaqHorPro_Enabled = 1 ;
      edtMaqCosFijo_Jsonclick = "" ;
      edtMaqCosFijo_Enabled = 1 ;
      edtMaqCosFijo_Visible = 1 ;
      divMaqcosfijo_cell_Class = "col-xs-12 col-sm-3" ;
      edtMaqCosKg_Jsonclick = "" ;
      edtMaqCosKg_Enabled = 1 ;
      edtMaqCosKg_Visible = 1 ;
      divMaqcoskg_cell_Class = "col-xs-12 col-sm-3" ;
      edtMaqCosMin_Jsonclick = "" ;
      edtMaqCosMin_Enabled = 1 ;
      edtMaqCosMin_Visible = 1 ;
      divMaqcosmin_cell_Class = "col-xs-12 col-sm-3" ;
      edtMaqCap_Jsonclick = "" ;
      edtMaqCap_Enabled = 1 ;
      Gxuitabspanel_tabs1_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs1_Class = "" ;
      Gxuitabspanel_tabs1_Pagecount = 2 ;
      edtMaqDscLarg_Jsonclick = "" ;
      edtMaqDscLarg_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 1 ;
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

   public void gxasa86571OS65( String A396EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqLoc_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqLoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqLoc_Visible), 5, 0), true);
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

   public void gxasa80561OS65( String A396EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqVaril.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqVaril.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqVaril.getVisible(), 5, 0), true);
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

   public void gxasa36011OS65( String A396EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqTipMaq_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipMaq_Visible), 5, 0), true);
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

   public void gxasa64331OS65( String AV109EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "PLAN", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqPlnVis.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPlnVis.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqPlnVis.getVisible(), 5, 0), true);
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

   public void gxasa64321OS65( String AV109EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "AC0000", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqPln.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqPln.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqPln.getVisible(), 5, 0), true);
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

   public void gxasa54631OS65( String A396EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCantCor_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCantCor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCantCor_Visible), 5, 0), true);
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

   public void gxasa10271OS65( String A396EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqHhCon_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHhCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHhCon_Visible), 5, 0), true);
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

   public void gxasa52921OS65( String AV109EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      cmbMaqCodBan.setVisible( ((GXt_int8==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqCodBan.getInternalname(), "Visible", GXutil.ltrimstr( cmbMaqCodBan.getVisible(), 5, 0), true);
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

   public void gxasa55931OS65( String AV109EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "TYPCEN", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqTipCen_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipCen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipCen_Visible), 5, 0), true);
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

   public void gxasa36001OS65( String AV109EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "LVMQ00", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqVolBal_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolBal_Visible), 5, 0), true);
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

   public void gxasa6051OS65( String A396EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TASSTD", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCosMin_Visible = ((GXt_int8==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosMin_Visible), 5, 0), true);
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

   public void gxasa131801OS65( String AV109EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCosKg_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosKg_Visible), 5, 0), true);
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

   public void gxasa131791OS65( String AV109EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV109EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int9) ;
      tmaqui1_impl.this.GXt_int8 = GXv_int9[0] ;
      edtMaqCosFijo_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCosFijo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCosFijo_Visible), 5, 0), true);
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
      subsflControlProps_37968( ) ;
      while ( nGXsfl_379_idx <= nRC_GXsfl_379 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OS68( ) ;
         standaloneModal1OS68( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OS68( ) ;
         nGXsfl_379_idx = (int)(nGXsfl_379_idx+1) ;
         sGXsfl_379_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_379_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_37968( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbMaqTip.setName( "MAQTIP" );
      cmbMaqTip.setWebtags( "" );
      cmbMaqTip.addItem("G", httpContext.getMessage( "Generica", ""), (short)(0));
      cmbMaqTip.addItem("E", httpContext.getMessage( "Especifica", ""), (short)(0));
      if ( cmbMaqTip.getItemCount() > 0 )
      {
         A620MaqTip = cmbMaqTip.getValidValue(A620MaqTip) ;
         n620MaqTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A620MaqTip", A620MaqTip);
      }
      cmbMaqEst.setName( "MAQEST" );
      cmbMaqEst.setWebtags( "" );
      cmbMaqEst.addItem("A", httpContext.getMessage( "Activa", ""), (short)(0));
      cmbMaqEst.addItem("I", httpContext.getMessage( "Inactiva", ""), (short)(0));
      if ( cmbMaqEst.getItemCount() > 0 )
      {
         A607MaqEst = cmbMaqEst.getValidValue(A607MaqEst) ;
         n607MaqEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A607MaqEst", A607MaqEst);
      }
      cmbMaqChp.setName( "MAQCHP" );
      cmbMaqChp.setWebtags( "" );
      cmbMaqChp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbMaqChp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbMaqChp.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A601MaqChp)==0) )
         {
            A601MaqChp = "N" ;
            n601MaqChp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A601MaqChp", A601MaqChp);
         }
      }
      cmbMaqCodBan.setName( "MAQCODBAN" );
      cmbMaqCodBan.setWebtags( "" );
      cmbMaqCodBan.addItem("A", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbMaqCodBan.addItem("C", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbMaqCodBan.getItemCount() > 0 )
      {
         A5292MaqCodBan = cmbMaqCodBan.getValidValue(A5292MaqCodBan) ;
         n5292MaqCodBan = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5292MaqCodBan", A5292MaqCodBan);
      }
      cmbMaqDosifP.setName( "MAQDOSIFP" );
      cmbMaqDosifP.setWebtags( "" );
      cmbMaqDosifP.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbMaqDosifP.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbMaqDosifP.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A5949MaqDosifP)==0) )
         {
            A5949MaqDosifP = "N" ;
            n5949MaqDosifP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5949MaqDosifP", A5949MaqDosifP);
         }
      }
      cmbMaqSalM.setName( "MAQSALM" );
      cmbMaqSalM.setWebtags( "" );
      cmbMaqSalM.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbMaqSalM.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbMaqSalM.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A5419MaqSalM)==0) )
         {
            A5419MaqSalM = "N" ;
            n5419MaqSalM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5419MaqSalM", A5419MaqSalM);
         }
      }
      cmbMaqPlnVis.setName( "MAQPLNVIS" );
      cmbMaqPlnVis.setWebtags( "" );
      cmbMaqPlnVis.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbMaqPlnVis.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbMaqPlnVis.getItemCount() > 0 )
      {
         A6433MaqPlnVis = (byte)(GXutil.lval( cmbMaqPlnVis.getValidValue(GXutil.trim( GXutil.str( A6433MaqPlnVis, 1, 0))))) ;
         n6433MaqPlnVis = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6433MaqPlnVis", GXutil.str( A6433MaqPlnVis, 1, 0));
      }
      cmbMaqPln.setName( "MAQPLN" );
      cmbMaqPln.setWebtags( "" );
      cmbMaqPln.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbMaqPln.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbMaqPln.getItemCount() > 0 )
      {
         A6432MaqPln = (byte)(GXutil.lval( cmbMaqPln.getValidValue(GXutil.trim( GXutil.str( A6432MaqPln, 1, 0))))) ;
         n6432MaqPln = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6432MaqPln", GXutil.str( A6432MaqPln, 1, 0));
      }
      cmbMaqVaril.setName( "MAQVARIL" );
      cmbMaqVaril.setWebtags( "" );
      cmbMaqVaril.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbMaqVaril.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbMaqVaril.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A8056MaqVaril)==0) )
         {
            A8056MaqVaril = "N" ;
            n8056MaqVaril = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8056MaqVaril", A8056MaqVaril);
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

   public void valid_Tipmaqcod( )
   {
      n1011TipMaqCod = false ;
      n1012TipMaqDsc = false ;
      /* Using cursor T01OS18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n1011TipMaqCod), A1011TipMaqCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1011TipMaqCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMAQCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipMaqCod_Internalname ;
         }
      }
      A1012TipMaqDsc = T01OS18_A1012TipMaqDsc[0] ;
      n1012TipMaqDsc = T01OS18_n1012TipMaqDsc[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1012TipMaqDsc", GXutil.rtrim( A1012TipMaqDsc));
   }

   public void valid_Maqogtid( )
   {
      n11726MaqOgtId = false ;
      /* Using cursor T01OS19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11726MaqOgtId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUINS ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQOGTID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqOgtId_Internalname ;
         }
      }
      A11727MaqOgtDsc = T01OS19_A11727MaqOgtDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11727MaqOgtDsc", GXutil.rtrim( A11727MaqOgtDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV109EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV118MaqCod',fld:'vMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV112TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV109EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV118MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV127Pgmname',fld:'vPGMNAME',pic:''},{av:'A621MaqUltFec',fld:'MAQULTFEC',pic:''},{av:'A617MaqResDia',fld:'MAQRESDIA',pic:'Z9.99'},{av:'A611MaqHorAsi',fld:'MAQHORASI',pic:'ZZZ9.99'},{av:'A616MaqOrdSeq',fld:'MAQORDSEQ',pic:'ZZZ9'},{av:'A4282MaqFormul',fld:'MAQFORMUL',pic:'@!'},{av:'A4319MaqPrdMin',fld:'MAQPRDMIN',pic:'ZZZ9'},{av:'A4320MaqPrdMed',fld:'MAQPRDMED',pic:'ZZZ9'},{av:'A4321MaqPrdMax',fld:'MAQPRDMAX',pic:'ZZZ9'},{av:'A6399MaqKgsId',fld:'MAQKGSID',pic:'ZZZZZ9.99'},{av:'A6454MaqConFas',fld:'MAQCONFAS',pic:'ZZZZZ9'},{av:'A9626MaqObs',fld:'MAQOBS',pic:''},{av:'A1026MaqHhCtr',fld:'MAQHHCTR',pic:''},{av:'A3684MaqCosGen',fld:'MAQCOSGEN',pic:'ZZZZ9.99'},{av:'A13022MaqMtsMn',fld:'MAQMTSMN',pic:'ZZZZZ9.99'},{av:'A13023MaqMtsMx',fld:'MAQMTSMX',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121OS2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV112TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQDSC","{handler:'valid_Maqdsc',iparms:[]");
      setEventMetadata("VALID_MAQDSC",",oparms:[]}");
      setEventMetadata("VALID_MAQHORPRO","{handler:'valid_Maqhorpro',iparms:[]");
      setEventMetadata("VALID_MAQHORPRO",",oparms:[]}");
      setEventMetadata("VALID_MAQMINPRO","{handler:'valid_Maqminpro',iparms:[]");
      setEventMetadata("VALID_MAQMINPRO",",oparms:[]}");
      setEventMetadata("VALID_MAQTIP","{handler:'valid_Maqtip',iparms:[]");
      setEventMetadata("VALID_MAQTIP",",oparms:[]}");
      setEventMetadata("VALID_MAQEST","{handler:'valid_Maqest',iparms:[]");
      setEventMetadata("VALID_MAQEST",",oparms:[]}");
      setEventMetadata("VALID_TIPMAQCOD","{handler:'valid_Tipmaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1011TipMaqCod',fld:'TIPMAQCOD',pic:''},{av:'A1012TipMaqDsc',fld:'TIPMAQDSC',pic:''}]");
      setEventMetadata("VALID_TIPMAQCOD",",oparms:[{av:'A1012TipMaqDsc',fld:'TIPMAQDSC',pic:''}]}");
      setEventMetadata("VALID_MAQCHP","{handler:'valid_Maqchp',iparms:[]");
      setEventMetadata("VALID_MAQCHP",",oparms:[]}");
      setEventMetadata("VALID_MAQOGTID","{handler:'valid_Maqogtid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11726MaqOgtId',fld:'MAQOGTID',pic:''},{av:'A11727MaqOgtDsc',fld:'MAQOGTDSC',pic:''}]");
      setEventMetadata("VALID_MAQOGTID",",oparms:[{av:'A11727MaqOgtDsc',fld:'MAQOGTDSC',pic:''}]}");
      setEventMetadata("VALID_MAQMOD","{handler:'valid_Maqmod',iparms:[]");
      setEventMetadata("VALID_MAQMOD",",oparms:[]}");
      setEventMetadata("VALID_MAQMOI","{handler:'valid_Maqmoi',iparms:[]");
      setEventMetadata("VALID_MAQMOI",",oparms:[]}");
      setEventMetadata("VALID_MAQENERG","{handler:'valid_Maqenerg',iparms:[]");
      setEventMetadata("VALID_MAQENERG",",oparms:[]}");
      setEventMetadata("VALID_MAQGAS","{handler:'valid_Maqgas',iparms:[]");
      setEventMetadata("VALID_MAQGAS",",oparms:[]}");
      setEventMetadata("VALID_MAQAGUA","{handler:'valid_Maqagua',iparms:[]");
      setEventMetadata("VALID_MAQAGUA",",oparms:[]}");
      setEventMetadata("VALID_MAQTIPMAQ","{handler:'valid_Maqtipmaq',iparms:[]");
      setEventMetadata("VALID_MAQTIPMAQ",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTIPMAQCOD","{handler:'validv_Combotipmaqcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTIPMAQCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOMAQOGTID","{handler:'validv_Combomaqogtid',iparms:[]");
      setEventMetadata("VALIDV_COMBOMAQOGTID",",oparms:[]}");
      setEventMetadata("VALID_DESTECLIN","{handler:'valid_Desteclin',iparms:[]");
      setEventMetadata("VALID_DESTECLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqlintex',iparms:[]");
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
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV109EmprCod = "" ;
      wcpOAV118MaqCod = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z3601MaqTipMaq = "" ;
      Z606MaqDsc = "" ;
      Z14288MaqDscLarg = "" ;
      Z605MaqCosMin = DecimalUtil.ZERO ;
      Z620MaqTip = "" ;
      Z607MaqEst = "" ;
      Z621MaqUltFec = "" ;
      Z617MaqResDia = DecimalUtil.ZERO ;
      Z611MaqHorAsi = DecimalUtil.ZERO ;
      Z4282MaqFormul = "" ;
      Z4283MaqKgsMin = DecimalUtil.ZERO ;
      Z4284MaqKgsMed = DecimalUtil.ZERO ;
      Z4285MaqKgsMax = DecimalUtil.ZERO ;
      Z601MaqChp = "" ;
      Z619MaqTinTip = "" ;
      Z5292MaqCodBan = "" ;
      Z5419MaqSalM = "" ;
      Z5420MaqSalMKi = DecimalUtil.ZERO ;
      Z5421MaqSalMKf = DecimalUtil.ZERO ;
      Z5463MaqCantCor = DecimalUtil.ZERO ;
      Z5593MaqTipCen = "" ;
      Z5949MaqDosifP = "" ;
      Z604MaqCodFor = "" ;
      Z6284MaqFacAbs = DecimalUtil.ZERO ;
      Z6399MaqKgsId = DecimalUtil.ZERO ;
      Z8056MaqVaril = "" ;
      Z8657MaqLoc = "" ;
      Z9626MaqObs = "" ;
      Z9982MaqFabsHm = DecimalUtil.ZERO ;
      Z1027MaqHhCon = DecimalUtil.ZERO ;
      Z1026MaqHhCtr = "" ;
      Z3684MaqCosGen = DecimalUtil.ZERO ;
      Z11821MaqMOD = DecimalUtil.ZERO ;
      Z11822MaqMOI = DecimalUtil.ZERO ;
      Z11823MaqEnerg = DecimalUtil.ZERO ;
      Z11824MaqGas = DecimalUtil.ZERO ;
      Z11825MaqAgua = DecimalUtil.ZERO ;
      Z13022MaqMtsMn = DecimalUtil.ZERO ;
      Z13023MaqMtsMx = DecimalUtil.ZERO ;
      Z13179MaqCosFijo = DecimalUtil.ZERO ;
      Z13180MaqCosKg = DecimalUtil.ZERO ;
      Z1011TipMaqCod = "" ;
      Z11726MaqOgtId = "" ;
      N1011TipMaqCod = "" ;
      N11726MaqOgtId = "" ;
      Combo_maqogtid_Selectedvalue_get = "" ;
      Combo_tipmaqcod_Selectedvalue_get = "" ;
      Z613MaqLinTex = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV109EmprCod = "" ;
      A1011TipMaqCod = "" ;
      A11726MaqOgtId = "" ;
      Gx_mode = "" ;
      AV118MaqCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A620MaqTip = "" ;
      A607MaqEst = "" ;
      A601MaqChp = "" ;
      A5292MaqCodBan = "" ;
      A5949MaqDosifP = "" ;
      A5419MaqSalM = "" ;
      A8056MaqVaril = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A14288MaqDscLarg = "" ;
      ucGxuitabspanel_tabs1 = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A13180MaqCosKg = DecimalUtil.ZERO ;
      A13179MaqCosFijo = DecimalUtil.ZERO ;
      sStyleString = "" ;
      lblTextblockmaqhorpro_Jsonclick = "" ;
      lblTextblockmaqminpro_Jsonclick = "" ;
      lblTextblocktipmaqcod_Jsonclick = "" ;
      ucCombo_tipmaqcod = new com.genexus.webpanels.GXUserControl();
      Combo_tipmaqcod_Caption = "" ;
      AV121TipMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTab02_title_Jsonclick = "" ;
      ucDvpanel_paneldatos = new com.genexus.webpanels.GXUserControl();
      lblTextblockmaqogtid_Jsonclick = "" ;
      ucCombo_maqogtid = new com.genexus.webpanels.GXUserControl();
      Combo_maqogtid_Caption = "" ;
      AV124MaqOgtId_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A11821MaqMOD = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      A12123MaqCosMm = DecimalUtil.ZERO ;
      ucDvpanel_panelcapacidades = new com.genexus.webpanels.GXUserControl();
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A619MaqTinTip = "" ;
      ucDvpanel_panelcentralizacion = new com.genexus.webpanels.GXUserControl();
      A5593MaqTipCen = "" ;
      A604MaqCodFor = "" ;
      ucDvpanel_panelsalmuera = new com.genexus.webpanels.GXUserControl();
      A5420MaqSalMKi = DecimalUtil.ZERO ;
      A5421MaqSalMKf = DecimalUtil.ZERO ;
      ucDvpanel_paneltiempos = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panelfactabs_planificacion = new com.genexus.webpanels.GXUserControl();
      A6284MaqFacAbs = DecimalUtil.ZERO ;
      A9982MaqFabsHm = DecimalUtil.ZERO ;
      A5463MaqCantCor = DecimalUtil.ZERO ;
      A1027MaqHhCon = DecimalUtil.ZERO ;
      ucDvpanel_paneltipomaquina = new com.genexus.webpanels.GXUserControl();
      A8657MaqLoc = "" ;
      A3601MaqTipMaq = "" ;
      ucDvpanel_panelobservaciones = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV127Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV123ComboTipMaqCod = "" ;
      AV125ComboMaqOgtId = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode68 = "" ;
      A621MaqUltFec = "" ;
      A617MaqResDia = DecimalUtil.ZERO ;
      A611MaqHorAsi = DecimalUtil.ZERO ;
      A4282MaqFormul = "" ;
      A6399MaqKgsId = DecimalUtil.ZERO ;
      A9626MaqObs = "" ;
      A1026MaqHhCtr = "" ;
      A3684MaqCosGen = DecimalUtil.ZERO ;
      A13022MaqMtsMn = DecimalUtil.ZERO ;
      A13023MaqMtsMx = DecimalUtil.ZERO ;
      A13734MaqCDsc = "" ;
      AV114Insert_TipMaqCod = "" ;
      AV116Insert_MaqOgtId = "" ;
      A407EmprNom = "" ;
      A1012TipMaqDsc = "" ;
      A11727MaqOgtDsc = "" ;
      Combo_tipmaqcod_Objectcall = "" ;
      Combo_tipmaqcod_Class = "" ;
      Combo_tipmaqcod_Icontype = "" ;
      Combo_tipmaqcod_Icon = "" ;
      Combo_tipmaqcod_Tooltip = "" ;
      Combo_tipmaqcod_Selectedvalue_set = "" ;
      Combo_tipmaqcod_Selectedtext_set = "" ;
      Combo_tipmaqcod_Selectedtext_get = "" ;
      Combo_tipmaqcod_Gamoauthtoken = "" ;
      Combo_tipmaqcod_Ddointernalname = "" ;
      Combo_tipmaqcod_Titlecontrolalign = "" ;
      Combo_tipmaqcod_Dropdownoptionstype = "" ;
      Combo_tipmaqcod_Titlecontrolidtoreplace = "" ;
      Combo_tipmaqcod_Datalisttype = "" ;
      Combo_tipmaqcod_Datalistfixedvalues = "" ;
      Combo_tipmaqcod_Datalistproc = "" ;
      Combo_tipmaqcod_Datalistprocparametersprefix = "" ;
      Combo_tipmaqcod_Remoteservicesparameters = "" ;
      Combo_tipmaqcod_Htmltemplate = "" ;
      Combo_tipmaqcod_Multiplevaluestype = "" ;
      Combo_tipmaqcod_Loadingdata = "" ;
      Combo_tipmaqcod_Noresultsfound = "" ;
      Combo_tipmaqcod_Onlyselectedvalues = "" ;
      Combo_tipmaqcod_Selectalltext = "" ;
      Combo_tipmaqcod_Multiplevaluesseparator = "" ;
      Combo_tipmaqcod_Addnewoptiontext = "" ;
      Combo_maqogtid_Objectcall = "" ;
      Combo_maqogtid_Class = "" ;
      Combo_maqogtid_Icontype = "" ;
      Combo_maqogtid_Icon = "" ;
      Combo_maqogtid_Tooltip = "" ;
      Combo_maqogtid_Selectedvalue_set = "" ;
      Combo_maqogtid_Selectedtext_set = "" ;
      Combo_maqogtid_Selectedtext_get = "" ;
      Combo_maqogtid_Gamoauthtoken = "" ;
      Combo_maqogtid_Ddointernalname = "" ;
      Combo_maqogtid_Titlecontrolalign = "" ;
      Combo_maqogtid_Dropdownoptionstype = "" ;
      Combo_maqogtid_Titlecontrolidtoreplace = "" ;
      Combo_maqogtid_Datalisttype = "" ;
      Combo_maqogtid_Datalistfixedvalues = "" ;
      Combo_maqogtid_Datalistproc = "" ;
      Combo_maqogtid_Datalistprocparametersprefix = "" ;
      Combo_maqogtid_Remoteservicesparameters = "" ;
      Combo_maqogtid_Htmltemplate = "" ;
      Combo_maqogtid_Multiplevaluestype = "" ;
      Combo_maqogtid_Loadingdata = "" ;
      Combo_maqogtid_Noresultsfound = "" ;
      Combo_maqogtid_Emptyitemtext = "" ;
      Combo_maqogtid_Onlyselectedvalues = "" ;
      Combo_maqogtid_Selectalltext = "" ;
      Combo_maqogtid_Multiplevaluesseparator = "" ;
      Combo_maqogtid_Addnewoptiontext = "" ;
      Dvpanel_paneldatos_Objectcall = "" ;
      Dvpanel_paneldatos_Class = "" ;
      Dvpanel_paneldatos_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_panelcapacidades_Objectcall = "" ;
      Dvpanel_panelcapacidades_Class = "" ;
      Dvpanel_panelcapacidades_Height = "" ;
      Dvpanel_panelcentralizacion_Objectcall = "" ;
      Dvpanel_panelcentralizacion_Class = "" ;
      Dvpanel_panelcentralizacion_Height = "" ;
      Dvpanel_panelsalmuera_Objectcall = "" ;
      Dvpanel_panelsalmuera_Class = "" ;
      Dvpanel_panelsalmuera_Height = "" ;
      Dvpanel_paneltiempos_Objectcall = "" ;
      Dvpanel_paneltiempos_Class = "" ;
      Dvpanel_paneltiempos_Height = "" ;
      Dvpanel_panelfactabs_planificacion_Objectcall = "" ;
      Dvpanel_panelfactabs_planificacion_Class = "" ;
      Dvpanel_panelfactabs_planificacion_Height = "" ;
      Dvpanel_paneltipomaquina_Objectcall = "" ;
      Dvpanel_paneltipomaquina_Class = "" ;
      Dvpanel_paneltipomaquina_Height = "" ;
      Gxuitabspanel_tabs1_Objectcall = "" ;
      Gxuitabspanel_tabs1_Activepagecontrolname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_panelobservaciones_Objectcall = "" ;
      Dvpanel_panelobservaciones_Class = "" ;
      Dvpanel_panelobservaciones_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode65 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A613MaqLinTex = "" ;
      AV119Station = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV111WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV112TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV113WebSession = httpContext.getWebSession();
      AV117TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV122ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z1012TipMaqDsc = "" ;
      Z11727MaqOgtDsc = "" ;
      T01OS6_A407EmprNom = new String[] {""} ;
      T01OS6_n407EmprNom = new boolean[] {false} ;
      T01OS7_A1012TipMaqDsc = new String[] {""} ;
      T01OS7_n1012TipMaqDsc = new boolean[] {false} ;
      T01OS8_A11727MaqOgtDsc = new String[] {""} ;
      T01OS9_A602MaqCod = new String[] {""} ;
      T01OS9_n602MaqCod = new boolean[] {false} ;
      T01OS9_A3601MaqTipMaq = new String[] {""} ;
      T01OS9_n3601MaqTipMaq = new boolean[] {false} ;
      T01OS9_A606MaqDsc = new String[] {""} ;
      T01OS9_n606MaqDsc = new boolean[] {false} ;
      T01OS9_A14288MaqDscLarg = new String[] {""} ;
      T01OS9_n14288MaqDscLarg = new boolean[] {false} ;
      T01OS9_A600MaqCap = new int[1] ;
      T01OS9_n600MaqCap = new boolean[] {false} ;
      T01OS9_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n605MaqCosMin = new boolean[] {false} ;
      T01OS9_A612MaqHorPro = new byte[1] ;
      T01OS9_n612MaqHorPro = new boolean[] {false} ;
      T01OS9_A615MaqMinPro = new byte[1] ;
      T01OS9_n615MaqMinPro = new boolean[] {false} ;
      T01OS9_A620MaqTip = new String[] {""} ;
      T01OS9_n620MaqTip = new boolean[] {false} ;
      T01OS9_A607MaqEst = new String[] {""} ;
      T01OS9_n607MaqEst = new boolean[] {false} ;
      T01OS9_A407EmprNom = new String[] {""} ;
      T01OS9_n407EmprNom = new boolean[] {false} ;
      T01OS9_A621MaqUltFec = new String[] {""} ;
      T01OS9_n621MaqUltFec = new boolean[] {false} ;
      T01OS9_A617MaqResDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n617MaqResDia = new boolean[] {false} ;
      T01OS9_A611MaqHorAsi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n611MaqHorAsi = new boolean[] {false} ;
      T01OS9_A616MaqOrdSeq = new short[1] ;
      T01OS9_n616MaqOrdSeq = new boolean[] {false} ;
      T01OS9_A622MaqUltLin = new byte[1] ;
      T01OS9_n622MaqUltLin = new boolean[] {false} ;
      T01OS9_A1012TipMaqDsc = new String[] {""} ;
      T01OS9_n1012TipMaqDsc = new boolean[] {false} ;
      T01OS9_A4282MaqFormul = new String[] {""} ;
      T01OS9_n4282MaqFormul = new boolean[] {false} ;
      T01OS9_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n4283MaqKgsMin = new boolean[] {false} ;
      T01OS9_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n4284MaqKgsMed = new boolean[] {false} ;
      T01OS9_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n4285MaqKgsMax = new boolean[] {false} ;
      T01OS9_A4319MaqPrdMin = new short[1] ;
      T01OS9_n4319MaqPrdMin = new boolean[] {false} ;
      T01OS9_A4320MaqPrdMed = new short[1] ;
      T01OS9_n4320MaqPrdMed = new boolean[] {false} ;
      T01OS9_A4321MaqPrdMax = new short[1] ;
      T01OS9_n4321MaqPrdMax = new boolean[] {false} ;
      T01OS9_A623MaqVolMax = new int[1] ;
      T01OS9_n623MaqVolMax = new boolean[] {false} ;
      T01OS9_A625MaqVolMin = new int[1] ;
      T01OS9_n625MaqVolMin = new boolean[] {false} ;
      T01OS9_A624MaqVolMed = new int[1] ;
      T01OS9_n624MaqVolMed = new boolean[] {false} ;
      T01OS9_A2801MaqVolRes = new int[1] ;
      T01OS9_n2801MaqVolRes = new boolean[] {false} ;
      T01OS9_A2802MaqVolTop = new int[1] ;
      T01OS9_n2802MaqVolTop = new boolean[] {false} ;
      T01OS9_A618MaqTemMax = new short[1] ;
      T01OS9_n618MaqTemMax = new boolean[] {false} ;
      T01OS9_A601MaqChp = new String[] {""} ;
      T01OS9_n601MaqChp = new boolean[] {false} ;
      T01OS9_A619MaqTinTip = new String[] {""} ;
      T01OS9_n619MaqTinTip = new boolean[] {false} ;
      T01OS9_A2391MaqMicro = new byte[1] ;
      T01OS9_n2391MaqMicro = new boolean[] {false} ;
      T01OS9_A3598MaqNroTub = new byte[1] ;
      T01OS9_n3598MaqNroTub = new boolean[] {false} ;
      T01OS9_A5292MaqCodBan = new String[] {""} ;
      T01OS9_n5292MaqCodBan = new boolean[] {false} ;
      T01OS9_A5419MaqSalM = new String[] {""} ;
      T01OS9_n5419MaqSalM = new boolean[] {false} ;
      T01OS9_A5420MaqSalMKi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n5420MaqSalMKi = new boolean[] {false} ;
      T01OS9_A5421MaqSalMKf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n5421MaqSalMKf = new boolean[] {false} ;
      T01OS9_A5463MaqCantCor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n5463MaqCantCor = new boolean[] {false} ;
      T01OS9_A5593MaqTipCen = new String[] {""} ;
      T01OS9_n5593MaqTipCen = new boolean[] {false} ;
      T01OS9_A5949MaqDosifP = new String[] {""} ;
      T01OS9_n5949MaqDosifP = new boolean[] {false} ;
      T01OS9_A5950MaqDteCol = new int[1] ;
      T01OS9_n5950MaqDteCol = new boolean[] {false} ;
      T01OS9_A604MaqCodFor = new String[] {""} ;
      T01OS9_n604MaqCodFor = new boolean[] {false} ;
      T01OS9_A6284MaqFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n6284MaqFacAbs = new boolean[] {false} ;
      T01OS9_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n6399MaqKgsId = new boolean[] {false} ;
      T01OS9_A6432MaqPln = new byte[1] ;
      T01OS9_n6432MaqPln = new boolean[] {false} ;
      T01OS9_A6433MaqPlnVis = new byte[1] ;
      T01OS9_n6433MaqPlnVis = new boolean[] {false} ;
      T01OS9_A6454MaqConFas = new int[1] ;
      T01OS9_n6454MaqConFas = new boolean[] {false} ;
      T01OS9_A8056MaqVaril = new String[] {""} ;
      T01OS9_n8056MaqVaril = new boolean[] {false} ;
      T01OS9_A3599MaqRelBan = new byte[1] ;
      T01OS9_n3599MaqRelBan = new boolean[] {false} ;
      T01OS9_A8657MaqLoc = new String[] {""} ;
      T01OS9_n8657MaqLoc = new boolean[] {false} ;
      T01OS9_A9626MaqObs = new String[] {""} ;
      T01OS9_n9626MaqObs = new boolean[] {false} ;
      T01OS9_A9982MaqFabsHm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n9982MaqFabsHm = new boolean[] {false} ;
      T01OS9_A1027MaqHhCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n1027MaqHhCon = new boolean[] {false} ;
      T01OS9_A1026MaqHhCtr = new String[] {""} ;
      T01OS9_n1026MaqHhCtr = new boolean[] {false} ;
      T01OS9_A3600MaqVolBal = new int[1] ;
      T01OS9_n3600MaqVolBal = new boolean[] {false} ;
      T01OS9_A3684MaqCosGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n3684MaqCosGen = new boolean[] {false} ;
      T01OS9_A11727MaqOgtDsc = new String[] {""} ;
      T01OS9_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n11821MaqMOD = new boolean[] {false} ;
      T01OS9_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n11822MaqMOI = new boolean[] {false} ;
      T01OS9_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n11823MaqEnerg = new boolean[] {false} ;
      T01OS9_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n11824MaqGas = new boolean[] {false} ;
      T01OS9_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n11825MaqAgua = new boolean[] {false} ;
      T01OS9_A13020MaqTmCarg = new short[1] ;
      T01OS9_n13020MaqTmCarg = new boolean[] {false} ;
      T01OS9_A13021MaqTmDcarg = new short[1] ;
      T01OS9_n13021MaqTmDcarg = new boolean[] {false} ;
      T01OS9_A13022MaqMtsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n13022MaqMtsMn = new boolean[] {false} ;
      T01OS9_A13023MaqMtsMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n13023MaqMtsMx = new boolean[] {false} ;
      T01OS9_A13179MaqCosFijo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n13179MaqCosFijo = new boolean[] {false} ;
      T01OS9_A13180MaqCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS9_n13180MaqCosKg = new boolean[] {false} ;
      T01OS9_A14289MaqCuerdas = new short[1] ;
      T01OS9_n14289MaqCuerdas = new boolean[] {false} ;
      T01OS9_A396EmprCod = new String[] {""} ;
      T01OS9_A1011TipMaqCod = new String[] {""} ;
      T01OS9_n1011TipMaqCod = new boolean[] {false} ;
      T01OS9_A11726MaqOgtId = new String[] {""} ;
      T01OS9_n11726MaqOgtId = new boolean[] {false} ;
      T01OS10_A1012TipMaqDsc = new String[] {""} ;
      T01OS10_n1012TipMaqDsc = new boolean[] {false} ;
      T01OS11_A11727MaqOgtDsc = new String[] {""} ;
      T01OS12_A396EmprCod = new String[] {""} ;
      T01OS12_A602MaqCod = new String[] {""} ;
      T01OS12_n602MaqCod = new boolean[] {false} ;
      T01OS5_A602MaqCod = new String[] {""} ;
      T01OS5_n602MaqCod = new boolean[] {false} ;
      T01OS5_A3601MaqTipMaq = new String[] {""} ;
      T01OS5_n3601MaqTipMaq = new boolean[] {false} ;
      T01OS5_A606MaqDsc = new String[] {""} ;
      T01OS5_n606MaqDsc = new boolean[] {false} ;
      T01OS5_A14288MaqDscLarg = new String[] {""} ;
      T01OS5_n14288MaqDscLarg = new boolean[] {false} ;
      T01OS5_A600MaqCap = new int[1] ;
      T01OS5_n600MaqCap = new boolean[] {false} ;
      T01OS5_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n605MaqCosMin = new boolean[] {false} ;
      T01OS5_A612MaqHorPro = new byte[1] ;
      T01OS5_n612MaqHorPro = new boolean[] {false} ;
      T01OS5_A615MaqMinPro = new byte[1] ;
      T01OS5_n615MaqMinPro = new boolean[] {false} ;
      T01OS5_A620MaqTip = new String[] {""} ;
      T01OS5_n620MaqTip = new boolean[] {false} ;
      T01OS5_A607MaqEst = new String[] {""} ;
      T01OS5_n607MaqEst = new boolean[] {false} ;
      T01OS5_A621MaqUltFec = new String[] {""} ;
      T01OS5_n621MaqUltFec = new boolean[] {false} ;
      T01OS5_A617MaqResDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n617MaqResDia = new boolean[] {false} ;
      T01OS5_A611MaqHorAsi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n611MaqHorAsi = new boolean[] {false} ;
      T01OS5_A616MaqOrdSeq = new short[1] ;
      T01OS5_n616MaqOrdSeq = new boolean[] {false} ;
      T01OS5_A622MaqUltLin = new byte[1] ;
      T01OS5_n622MaqUltLin = new boolean[] {false} ;
      T01OS5_A4282MaqFormul = new String[] {""} ;
      T01OS5_n4282MaqFormul = new boolean[] {false} ;
      T01OS5_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n4283MaqKgsMin = new boolean[] {false} ;
      T01OS5_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n4284MaqKgsMed = new boolean[] {false} ;
      T01OS5_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n4285MaqKgsMax = new boolean[] {false} ;
      T01OS5_A4319MaqPrdMin = new short[1] ;
      T01OS5_n4319MaqPrdMin = new boolean[] {false} ;
      T01OS5_A4320MaqPrdMed = new short[1] ;
      T01OS5_n4320MaqPrdMed = new boolean[] {false} ;
      T01OS5_A4321MaqPrdMax = new short[1] ;
      T01OS5_n4321MaqPrdMax = new boolean[] {false} ;
      T01OS5_A623MaqVolMax = new int[1] ;
      T01OS5_n623MaqVolMax = new boolean[] {false} ;
      T01OS5_A625MaqVolMin = new int[1] ;
      T01OS5_n625MaqVolMin = new boolean[] {false} ;
      T01OS5_A624MaqVolMed = new int[1] ;
      T01OS5_n624MaqVolMed = new boolean[] {false} ;
      T01OS5_A2801MaqVolRes = new int[1] ;
      T01OS5_n2801MaqVolRes = new boolean[] {false} ;
      T01OS5_A2802MaqVolTop = new int[1] ;
      T01OS5_n2802MaqVolTop = new boolean[] {false} ;
      T01OS5_A618MaqTemMax = new short[1] ;
      T01OS5_n618MaqTemMax = new boolean[] {false} ;
      T01OS5_A601MaqChp = new String[] {""} ;
      T01OS5_n601MaqChp = new boolean[] {false} ;
      T01OS5_A619MaqTinTip = new String[] {""} ;
      T01OS5_n619MaqTinTip = new boolean[] {false} ;
      T01OS5_A2391MaqMicro = new byte[1] ;
      T01OS5_n2391MaqMicro = new boolean[] {false} ;
      T01OS5_A3598MaqNroTub = new byte[1] ;
      T01OS5_n3598MaqNroTub = new boolean[] {false} ;
      T01OS5_A5292MaqCodBan = new String[] {""} ;
      T01OS5_n5292MaqCodBan = new boolean[] {false} ;
      T01OS5_A5419MaqSalM = new String[] {""} ;
      T01OS5_n5419MaqSalM = new boolean[] {false} ;
      T01OS5_A5420MaqSalMKi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n5420MaqSalMKi = new boolean[] {false} ;
      T01OS5_A5421MaqSalMKf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n5421MaqSalMKf = new boolean[] {false} ;
      T01OS5_A5463MaqCantCor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n5463MaqCantCor = new boolean[] {false} ;
      T01OS5_A5593MaqTipCen = new String[] {""} ;
      T01OS5_n5593MaqTipCen = new boolean[] {false} ;
      T01OS5_A5949MaqDosifP = new String[] {""} ;
      T01OS5_n5949MaqDosifP = new boolean[] {false} ;
      T01OS5_A5950MaqDteCol = new int[1] ;
      T01OS5_n5950MaqDteCol = new boolean[] {false} ;
      T01OS5_A604MaqCodFor = new String[] {""} ;
      T01OS5_n604MaqCodFor = new boolean[] {false} ;
      T01OS5_A6284MaqFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n6284MaqFacAbs = new boolean[] {false} ;
      T01OS5_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n6399MaqKgsId = new boolean[] {false} ;
      T01OS5_A6432MaqPln = new byte[1] ;
      T01OS5_n6432MaqPln = new boolean[] {false} ;
      T01OS5_A6433MaqPlnVis = new byte[1] ;
      T01OS5_n6433MaqPlnVis = new boolean[] {false} ;
      T01OS5_A6454MaqConFas = new int[1] ;
      T01OS5_n6454MaqConFas = new boolean[] {false} ;
      T01OS5_A8056MaqVaril = new String[] {""} ;
      T01OS5_n8056MaqVaril = new boolean[] {false} ;
      T01OS5_A3599MaqRelBan = new byte[1] ;
      T01OS5_n3599MaqRelBan = new boolean[] {false} ;
      T01OS5_A8657MaqLoc = new String[] {""} ;
      T01OS5_n8657MaqLoc = new boolean[] {false} ;
      T01OS5_A9626MaqObs = new String[] {""} ;
      T01OS5_n9626MaqObs = new boolean[] {false} ;
      T01OS5_A9982MaqFabsHm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n9982MaqFabsHm = new boolean[] {false} ;
      T01OS5_A1027MaqHhCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n1027MaqHhCon = new boolean[] {false} ;
      T01OS5_A1026MaqHhCtr = new String[] {""} ;
      T01OS5_n1026MaqHhCtr = new boolean[] {false} ;
      T01OS5_A3600MaqVolBal = new int[1] ;
      T01OS5_n3600MaqVolBal = new boolean[] {false} ;
      T01OS5_A3684MaqCosGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n3684MaqCosGen = new boolean[] {false} ;
      T01OS5_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n11821MaqMOD = new boolean[] {false} ;
      T01OS5_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n11822MaqMOI = new boolean[] {false} ;
      T01OS5_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n11823MaqEnerg = new boolean[] {false} ;
      T01OS5_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n11824MaqGas = new boolean[] {false} ;
      T01OS5_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n11825MaqAgua = new boolean[] {false} ;
      T01OS5_A13020MaqTmCarg = new short[1] ;
      T01OS5_n13020MaqTmCarg = new boolean[] {false} ;
      T01OS5_A13021MaqTmDcarg = new short[1] ;
      T01OS5_n13021MaqTmDcarg = new boolean[] {false} ;
      T01OS5_A13022MaqMtsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n13022MaqMtsMn = new boolean[] {false} ;
      T01OS5_A13023MaqMtsMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n13023MaqMtsMx = new boolean[] {false} ;
      T01OS5_A13179MaqCosFijo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n13179MaqCosFijo = new boolean[] {false} ;
      T01OS5_A13180MaqCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS5_n13180MaqCosKg = new boolean[] {false} ;
      T01OS5_A14289MaqCuerdas = new short[1] ;
      T01OS5_n14289MaqCuerdas = new boolean[] {false} ;
      T01OS5_A396EmprCod = new String[] {""} ;
      T01OS5_A1011TipMaqCod = new String[] {""} ;
      T01OS5_n1011TipMaqCod = new boolean[] {false} ;
      T01OS5_A11726MaqOgtId = new String[] {""} ;
      T01OS5_n11726MaqOgtId = new boolean[] {false} ;
      T01OS13_A396EmprCod = new String[] {""} ;
      T01OS13_A602MaqCod = new String[] {""} ;
      T01OS13_n602MaqCod = new boolean[] {false} ;
      T01OS14_A396EmprCod = new String[] {""} ;
      T01OS14_A602MaqCod = new String[] {""} ;
      T01OS14_n602MaqCod = new boolean[] {false} ;
      T01OS4_A602MaqCod = new String[] {""} ;
      T01OS4_n602MaqCod = new boolean[] {false} ;
      T01OS4_A3601MaqTipMaq = new String[] {""} ;
      T01OS4_n3601MaqTipMaq = new boolean[] {false} ;
      T01OS4_A606MaqDsc = new String[] {""} ;
      T01OS4_n606MaqDsc = new boolean[] {false} ;
      T01OS4_A14288MaqDscLarg = new String[] {""} ;
      T01OS4_n14288MaqDscLarg = new boolean[] {false} ;
      T01OS4_A600MaqCap = new int[1] ;
      T01OS4_n600MaqCap = new boolean[] {false} ;
      T01OS4_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n605MaqCosMin = new boolean[] {false} ;
      T01OS4_A612MaqHorPro = new byte[1] ;
      T01OS4_n612MaqHorPro = new boolean[] {false} ;
      T01OS4_A615MaqMinPro = new byte[1] ;
      T01OS4_n615MaqMinPro = new boolean[] {false} ;
      T01OS4_A620MaqTip = new String[] {""} ;
      T01OS4_n620MaqTip = new boolean[] {false} ;
      T01OS4_A607MaqEst = new String[] {""} ;
      T01OS4_n607MaqEst = new boolean[] {false} ;
      T01OS4_A621MaqUltFec = new String[] {""} ;
      T01OS4_n621MaqUltFec = new boolean[] {false} ;
      T01OS4_A617MaqResDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n617MaqResDia = new boolean[] {false} ;
      T01OS4_A611MaqHorAsi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n611MaqHorAsi = new boolean[] {false} ;
      T01OS4_A616MaqOrdSeq = new short[1] ;
      T01OS4_n616MaqOrdSeq = new boolean[] {false} ;
      T01OS4_A622MaqUltLin = new byte[1] ;
      T01OS4_n622MaqUltLin = new boolean[] {false} ;
      T01OS4_A4282MaqFormul = new String[] {""} ;
      T01OS4_n4282MaqFormul = new boolean[] {false} ;
      T01OS4_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n4283MaqKgsMin = new boolean[] {false} ;
      T01OS4_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n4284MaqKgsMed = new boolean[] {false} ;
      T01OS4_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n4285MaqKgsMax = new boolean[] {false} ;
      T01OS4_A4319MaqPrdMin = new short[1] ;
      T01OS4_n4319MaqPrdMin = new boolean[] {false} ;
      T01OS4_A4320MaqPrdMed = new short[1] ;
      T01OS4_n4320MaqPrdMed = new boolean[] {false} ;
      T01OS4_A4321MaqPrdMax = new short[1] ;
      T01OS4_n4321MaqPrdMax = new boolean[] {false} ;
      T01OS4_A623MaqVolMax = new int[1] ;
      T01OS4_n623MaqVolMax = new boolean[] {false} ;
      T01OS4_A625MaqVolMin = new int[1] ;
      T01OS4_n625MaqVolMin = new boolean[] {false} ;
      T01OS4_A624MaqVolMed = new int[1] ;
      T01OS4_n624MaqVolMed = new boolean[] {false} ;
      T01OS4_A2801MaqVolRes = new int[1] ;
      T01OS4_n2801MaqVolRes = new boolean[] {false} ;
      T01OS4_A2802MaqVolTop = new int[1] ;
      T01OS4_n2802MaqVolTop = new boolean[] {false} ;
      T01OS4_A618MaqTemMax = new short[1] ;
      T01OS4_n618MaqTemMax = new boolean[] {false} ;
      T01OS4_A601MaqChp = new String[] {""} ;
      T01OS4_n601MaqChp = new boolean[] {false} ;
      T01OS4_A619MaqTinTip = new String[] {""} ;
      T01OS4_n619MaqTinTip = new boolean[] {false} ;
      T01OS4_A2391MaqMicro = new byte[1] ;
      T01OS4_n2391MaqMicro = new boolean[] {false} ;
      T01OS4_A3598MaqNroTub = new byte[1] ;
      T01OS4_n3598MaqNroTub = new boolean[] {false} ;
      T01OS4_A5292MaqCodBan = new String[] {""} ;
      T01OS4_n5292MaqCodBan = new boolean[] {false} ;
      T01OS4_A5419MaqSalM = new String[] {""} ;
      T01OS4_n5419MaqSalM = new boolean[] {false} ;
      T01OS4_A5420MaqSalMKi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n5420MaqSalMKi = new boolean[] {false} ;
      T01OS4_A5421MaqSalMKf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n5421MaqSalMKf = new boolean[] {false} ;
      T01OS4_A5463MaqCantCor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n5463MaqCantCor = new boolean[] {false} ;
      T01OS4_A5593MaqTipCen = new String[] {""} ;
      T01OS4_n5593MaqTipCen = new boolean[] {false} ;
      T01OS4_A5949MaqDosifP = new String[] {""} ;
      T01OS4_n5949MaqDosifP = new boolean[] {false} ;
      T01OS4_A5950MaqDteCol = new int[1] ;
      T01OS4_n5950MaqDteCol = new boolean[] {false} ;
      T01OS4_A604MaqCodFor = new String[] {""} ;
      T01OS4_n604MaqCodFor = new boolean[] {false} ;
      T01OS4_A6284MaqFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n6284MaqFacAbs = new boolean[] {false} ;
      T01OS4_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n6399MaqKgsId = new boolean[] {false} ;
      T01OS4_A6432MaqPln = new byte[1] ;
      T01OS4_n6432MaqPln = new boolean[] {false} ;
      T01OS4_A6433MaqPlnVis = new byte[1] ;
      T01OS4_n6433MaqPlnVis = new boolean[] {false} ;
      T01OS4_A6454MaqConFas = new int[1] ;
      T01OS4_n6454MaqConFas = new boolean[] {false} ;
      T01OS4_A8056MaqVaril = new String[] {""} ;
      T01OS4_n8056MaqVaril = new boolean[] {false} ;
      T01OS4_A3599MaqRelBan = new byte[1] ;
      T01OS4_n3599MaqRelBan = new boolean[] {false} ;
      T01OS4_A8657MaqLoc = new String[] {""} ;
      T01OS4_n8657MaqLoc = new boolean[] {false} ;
      T01OS4_A9626MaqObs = new String[] {""} ;
      T01OS4_n9626MaqObs = new boolean[] {false} ;
      T01OS4_A9982MaqFabsHm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n9982MaqFabsHm = new boolean[] {false} ;
      T01OS4_A1027MaqHhCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n1027MaqHhCon = new boolean[] {false} ;
      T01OS4_A1026MaqHhCtr = new String[] {""} ;
      T01OS4_n1026MaqHhCtr = new boolean[] {false} ;
      T01OS4_A3600MaqVolBal = new int[1] ;
      T01OS4_n3600MaqVolBal = new boolean[] {false} ;
      T01OS4_A3684MaqCosGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n3684MaqCosGen = new boolean[] {false} ;
      T01OS4_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n11821MaqMOD = new boolean[] {false} ;
      T01OS4_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n11822MaqMOI = new boolean[] {false} ;
      T01OS4_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n11823MaqEnerg = new boolean[] {false} ;
      T01OS4_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n11824MaqGas = new boolean[] {false} ;
      T01OS4_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n11825MaqAgua = new boolean[] {false} ;
      T01OS4_A13020MaqTmCarg = new short[1] ;
      T01OS4_n13020MaqTmCarg = new boolean[] {false} ;
      T01OS4_A13021MaqTmDcarg = new short[1] ;
      T01OS4_n13021MaqTmDcarg = new boolean[] {false} ;
      T01OS4_A13022MaqMtsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n13022MaqMtsMn = new boolean[] {false} ;
      T01OS4_A13023MaqMtsMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n13023MaqMtsMx = new boolean[] {false} ;
      T01OS4_A13179MaqCosFijo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n13179MaqCosFijo = new boolean[] {false} ;
      T01OS4_A13180MaqCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OS4_n13180MaqCosKg = new boolean[] {false} ;
      T01OS4_A14289MaqCuerdas = new short[1] ;
      T01OS4_n14289MaqCuerdas = new boolean[] {false} ;
      T01OS4_A396EmprCod = new String[] {""} ;
      T01OS4_A1011TipMaqCod = new String[] {""} ;
      T01OS4_n1011TipMaqCod = new boolean[] {false} ;
      T01OS4_A11726MaqOgtId = new String[] {""} ;
      T01OS4_n11726MaqOgtId = new boolean[] {false} ;
      T01OS18_A1012TipMaqDsc = new String[] {""} ;
      T01OS18_n1012TipMaqDsc = new boolean[] {false} ;
      T01OS19_A11727MaqOgtDsc = new String[] {""} ;
      T01OS20_A396EmprCod = new String[] {""} ;
      T01OS20_A602MaqCod = new String[] {""} ;
      T01OS20_n602MaqCod = new boolean[] {false} ;
      T01OS20_A14529MqCAnyo = new short[1] ;
      T01OS20_A14530MqCMes = new byte[1] ;
      T01OS21_A396EmprCod = new String[] {""} ;
      T01OS21_A129BarCod = new int[1] ;
      T01OS21_A132BarCodReo = new byte[1] ;
      T01OS21_A130BarCodPar = new String[] {""} ;
      T01OS21_A14152MEnvOrd = new short[1] ;
      T01OS22_A396EmprCod = new String[] {""} ;
      T01OS22_A13604RARID = new int[1] ;
      T01OS22_A602MaqCod = new String[] {""} ;
      T01OS22_n602MaqCod = new boolean[] {false} ;
      T01OS23_A396EmprCod = new String[] {""} ;
      T01OS23_A602MaqCod = new String[] {""} ;
      T01OS23_n602MaqCod = new boolean[] {false} ;
      T01OS23_A13193MaqHdr = new int[1] ;
      T01OS23_A13194MaqHdrR = new byte[1] ;
      T01OS23_A13195MaqHdrP = new String[] {""} ;
      T01OS23_A13196MaqRecLinM = new short[1] ;
      T01OS24_A396EmprCod = new String[] {""} ;
      T01OS24_A13137NCHdr = new int[1] ;
      T01OS24_A13138NCHdrr = new byte[1] ;
      T01OS24_A13139NCHdrp = new String[] {""} ;
      T01OS25_A396EmprCod = new String[] {""} ;
      T01OS25_A12673LavMqId = new int[1] ;
      T01OS26_A396EmprCod = new String[] {""} ;
      T01OS26_A602MaqCod = new String[] {""} ;
      T01OS26_n602MaqCod = new boolean[] {false} ;
      T01OS26_A12444MaqAnyNP = new short[1] ;
      T01OS26_A12445MaqMesNP = new byte[1] ;
      T01OS27_A396EmprCod = new String[] {""} ;
      T01OS27_A602MaqCod = new String[] {""} ;
      T01OS27_n602MaqCod = new boolean[] {false} ;
      T01OS27_A12434MaqAnyM = new short[1] ;
      T01OS27_A12435MaqMesM = new byte[1] ;
      T01OS28_A396EmprCod = new String[] {""} ;
      T01OS28_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01OS28_A5728JBCLLin = new short[1] ;
      T01OS29_A396EmprCod = new String[] {""} ;
      T01OS29_A11604PArtId = new int[1] ;
      T01OS30_A396EmprCod = new String[] {""} ;
      T01OS30_A602MaqCod = new String[] {""} ;
      T01OS30_n602MaqCod = new boolean[] {false} ;
      T01OS30_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01OS31_A396EmprCod = new String[] {""} ;
      T01OS31_A602MaqCod = new String[] {""} ;
      T01OS31_n602MaqCod = new boolean[] {false} ;
      T01OS31_A11438MaqEquCod = new String[] {""} ;
      T01OS31_A11439MaqSEqCod = new String[] {""} ;
      T01OS31_A11440MaqPieCod = new String[] {""} ;
      T01OS32_A396EmprCod = new String[] {""} ;
      T01OS32_A602MaqCod = new String[] {""} ;
      T01OS32_n602MaqCod = new boolean[] {false} ;
      T01OS32_A11432MaqDocId = new short[1] ;
      T01OS33_A396EmprCod = new String[] {""} ;
      T01OS33_A602MaqCod = new String[] {""} ;
      T01OS33_n602MaqCod = new boolean[] {false} ;
      T01OS33_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01OS33_A10112Mq_Op = new int[1] ;
      T01OS34_A396EmprCod = new String[] {""} ;
      T01OS34_A252CliCod = new int[1] ;
      T01OS34_A65ArtCod = new String[] {""} ;
      T01OS34_A10041ArtSH = new String[] {""} ;
      T01OS34_A10042ArtMqFa = new String[] {""} ;
      T01OS35_A396EmprCod = new String[] {""} ;
      T01OS35_A602MaqCod = new String[] {""} ;
      T01OS35_n602MaqCod = new boolean[] {false} ;
      T01OS35_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01OS36_A396EmprCod = new String[] {""} ;
      T01OS36_A602MaqCod = new String[] {""} ;
      T01OS36_n602MaqCod = new boolean[] {false} ;
      T01OS36_A9725MaqFabC = new String[] {""} ;
      T01OS37_A396EmprCod = new String[] {""} ;
      T01OS37_A9428SMCod = new int[1] ;
      T01OS38_A396EmprCod = new String[] {""} ;
      T01OS38_A9429PMCod = new int[1] ;
      T01OS39_A396EmprCod = new String[] {""} ;
      T01OS39_A9425OMCod = new int[1] ;
      T01OS40_A396EmprCod = new String[] {""} ;
      T01OS40_A602MaqCod = new String[] {""} ;
      T01OS40_n602MaqCod = new boolean[] {false} ;
      T01OS40_A8008Maq_Prg = new String[] {""} ;
      T01OS41_A396EmprCod = new String[] {""} ;
      T01OS41_A602MaqCod = new String[] {""} ;
      T01OS41_n602MaqCod = new boolean[] {false} ;
      T01OS41_A6874CPROCORIG = new String[] {""} ;
      T01OS42_A396EmprCod = new String[] {""} ;
      T01OS42_A6319C_Barcod = new int[1] ;
      T01OS42_A6320C_Barcodre = new byte[1] ;
      T01OS42_A6321C_Barcodpa = new String[] {""} ;
      T01OS42_A6322C_Reclinma = new short[1] ;
      T01OS43_A396EmprCod = new String[] {""} ;
      T01OS43_A602MaqCod = new String[] {""} ;
      T01OS43_n602MaqCod = new boolean[] {false} ;
      T01OS43_A6260MaqTqn = new byte[1] ;
      T01OS44_A396EmprCod = new String[] {""} ;
      T01OS44_A6188MaqTArt = new short[1] ;
      T01OS44_A602MaqCod = new String[] {""} ;
      T01OS44_n602MaqCod = new boolean[] {false} ;
      T01OS45_A396EmprCod = new String[] {""} ;
      T01OS45_A602MaqCod = new String[] {""} ;
      T01OS45_n602MaqCod = new boolean[] {false} ;
      T01OS45_A6078MaqCliCod = new int[1] ;
      T01OS45_A6079MaqArtCod = new String[] {""} ;
      T01OS46_A396EmprCod = new String[] {""} ;
      T01OS46_A6037Mq_Grupo = new byte[1] ;
      T01OS46_A602MaqCod = new String[] {""} ;
      T01OS46_n602MaqCod = new boolean[] {false} ;
      T01OS47_A396EmprCod = new String[] {""} ;
      T01OS47_A6000CRCod = new String[] {""} ;
      T01OS47_A6005CRLin = new short[1] ;
      T01OS48_A396EmprCod = new String[] {""} ;
      T01OS48_A602MaqCod = new String[] {""} ;
      T01OS48_n602MaqCod = new boolean[] {false} ;
      T01OS48_A5879PlaMTAOrd = new short[1] ;
      T01OS49_A396EmprCod = new String[] {""} ;
      T01OS49_A5603PrdNumM = new String[] {""} ;
      T01OS49_A602MaqCod = new String[] {""} ;
      T01OS49_n602MaqCod = new boolean[] {false} ;
      T01OS50_A396EmprCod = new String[] {""} ;
      T01OS50_A602MaqCod = new String[] {""} ;
      T01OS50_n602MaqCod = new boolean[] {false} ;
      T01OS50_A5525MaqPrdNum = new String[] {""} ;
      T01OS51_A396EmprCod = new String[] {""} ;
      T01OS51_A764ProForCod = new String[] {""} ;
      T01OS51_A5191ProForLC = new short[1] ;
      T01OS52_A396EmprCod = new String[] {""} ;
      T01OS52_A4686MaqTipArt = new short[1] ;
      T01OS52_A602MaqCod = new String[] {""} ;
      T01OS52_n602MaqCod = new boolean[] {false} ;
      T01OS53_A396EmprCod = new String[] {""} ;
      T01OS53_A3331LanBroCod = new byte[1] ;
      T01OS53_A3333LanBroLin = new short[1] ;
      T01OS54_A396EmprCod = new String[] {""} ;
      T01OS54_A602MaqCod = new String[] {""} ;
      T01OS54_n602MaqCod = new boolean[] {false} ;
      T01OS54_A3047LOParId = new String[] {""} ;
      T01OS55_A396EmprCod = new String[] {""} ;
      T01OS55_A129BarCod = new int[1] ;
      T01OS55_A132BarCodReo = new byte[1] ;
      T01OS55_A130BarCodPar = new String[] {""} ;
      T01OS55_A2804RecLinMaq = new short[1] ;
      T01OS56_A396EmprCod = new String[] {""} ;
      T01OS56_A602MaqCod = new String[] {""} ;
      T01OS56_n602MaqCod = new boolean[] {false} ;
      T01OS56_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01OS57_A396EmprCod = new String[] {""} ;
      T01OS57_A602MaqCod = new String[] {""} ;
      T01OS57_n602MaqCod = new boolean[] {false} ;
      T01OS57_A2019MaqMadLin = new short[1] ;
      T01OS58_A396EmprCod = new String[] {""} ;
      T01OS58_A602MaqCod = new String[] {""} ;
      T01OS58_n602MaqCod = new boolean[] {false} ;
      T01OS58_A2014MaqConLin = new short[1] ;
      T01OS59_A396EmprCod = new String[] {""} ;
      T01OS59_A1621CosTermCod = new String[] {""} ;
      T01OS59_A1615CosLin = new int[1] ;
      T01OS60_A396EmprCod = new String[] {""} ;
      T01OS60_A602MaqCod = new String[] {""} ;
      T01OS60_n602MaqCod = new boolean[] {false} ;
      T01OS60_A1142MaqFCod = new String[] {""} ;
      T01OS61_A396EmprCod = new String[] {""} ;
      T01OS61_A602MaqCod = new String[] {""} ;
      T01OS61_n602MaqCod = new boolean[] {false} ;
      T01OS61_A634MhiMes = new byte[1] ;
      T01OS61_A632MhiAny = new short[1] ;
      T01OS62_A396EmprCod = new String[] {""} ;
      T01OS62_A602MaqCod = new String[] {""} ;
      T01OS62_n602MaqCod = new boolean[] {false} ;
      T01OS62_A599MaqAny = new short[1] ;
      T01OS62_A614MaqMes = new byte[1] ;
      T01OS63_A396EmprCod = new String[] {""} ;
      T01OS63_A539HisBarCod = new int[1] ;
      T01OS63_A545HisCodReo = new byte[1] ;
      T01OS63_A544HisCodPar = new String[] {""} ;
      T01OS63_A833TipDefCod = new short[1] ;
      T01OS64_A396EmprCod = new String[] {""} ;
      T01OS64_A602MaqCod = new String[] {""} ;
      T01OS64_n602MaqCod = new boolean[] {false} ;
      T01OS64_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OS65_A396EmprCod = new String[] {""} ;
      T01OS65_A501GruMaqCod = new String[] {""} ;
      T01OS65_A602MaqCod = new String[] {""} ;
      T01OS65_n602MaqCod = new boolean[] {false} ;
      T01OS66_A396EmprCod = new String[] {""} ;
      T01OS66_A457FasCod = new String[] {""} ;
      T01OS67_A396EmprCod = new String[] {""} ;
      T01OS67_A361DisCod = new int[1] ;
      T01OS68_A396EmprCod = new String[] {""} ;
      T01OS68_A129BarCod = new int[1] ;
      T01OS68_A132BarCodReo = new byte[1] ;
      T01OS68_A130BarCodPar = new String[] {""} ;
      T01OS68_A758ProCod = new String[] {""} ;
      T01OS68_A194BarOrdLin = new short[1] ;
      T01OS70_A396EmprCod = new String[] {""} ;
      T01OS70_A602MaqCod = new String[] {""} ;
      T01OS70_n602MaqCod = new boolean[] {false} ;
      T01OS71_A396EmprCod = new String[] {""} ;
      T01OS71_A602MaqCod = new String[] {""} ;
      T01OS71_n602MaqCod = new boolean[] {false} ;
      T01OS71_A320DesTecLin = new byte[1] ;
      T01OS71_A613MaqLinTex = new String[] {""} ;
      T01OS72_A396EmprCod = new String[] {""} ;
      T01OS72_A602MaqCod = new String[] {""} ;
      T01OS72_n602MaqCod = new boolean[] {false} ;
      T01OS72_A320DesTecLin = new byte[1] ;
      T01OS3_A396EmprCod = new String[] {""} ;
      T01OS3_A602MaqCod = new String[] {""} ;
      T01OS3_n602MaqCod = new boolean[] {false} ;
      T01OS3_A320DesTecLin = new byte[1] ;
      T01OS3_A613MaqLinTex = new String[] {""} ;
      T01OS2_A396EmprCod = new String[] {""} ;
      T01OS2_A602MaqCod = new String[] {""} ;
      T01OS2_n602MaqCod = new boolean[] {false} ;
      T01OS2_A320DesTecLin = new byte[1] ;
      T01OS2_A613MaqLinTex = new String[] {""} ;
      T01OS76_A396EmprCod = new String[] {""} ;
      T01OS76_A602MaqCod = new String[] {""} ;
      T01OS76_n602MaqCod = new boolean[] {false} ;
      T01OS76_A320DesTecLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i3601MaqTipMaq = "" ;
      i601MaqChp = "" ;
      i5419MaqSalM = "" ;
      i5593MaqTipCen = "" ;
      i5949MaqDosifP = "" ;
      i8056MaqVaril = "" ;
      i1026MaqHhCtr = "" ;
      i13179MaqCosFijo = DecimalUtil.ZERO ;
      i13180MaqCosKg = DecimalUtil.ZERO ;
      i4282MaqFormul = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int9 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqui1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqui1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqui1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqui1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1__default(),
         new Object[] {
             new Object[] {
            T01OS2_A396EmprCod, T01OS2_A602MaqCod, T01OS2_A320DesTecLin, T01OS2_A613MaqLinTex
            }
            , new Object[] {
            T01OS3_A396EmprCod, T01OS3_A602MaqCod, T01OS3_A320DesTecLin, T01OS3_A613MaqLinTex
            }
            , new Object[] {
            T01OS4_A602MaqCod, T01OS4_A3601MaqTipMaq, T01OS4_n3601MaqTipMaq, T01OS4_A606MaqDsc, T01OS4_n606MaqDsc, T01OS4_A14288MaqDscLarg, T01OS4_n14288MaqDscLarg, T01OS4_A600MaqCap, T01OS4_n600MaqCap, T01OS4_A605MaqCosMin,
            T01OS4_n605MaqCosMin, T01OS4_A612MaqHorPro, T01OS4_n612MaqHorPro, T01OS4_A615MaqMinPro, T01OS4_n615MaqMinPro, T01OS4_A620MaqTip, T01OS4_n620MaqTip, T01OS4_A607MaqEst, T01OS4_n607MaqEst, T01OS4_A621MaqUltFec,
            T01OS4_n621MaqUltFec, T01OS4_A617MaqResDia, T01OS4_n617MaqResDia, T01OS4_A611MaqHorAsi, T01OS4_n611MaqHorAsi, T01OS4_A616MaqOrdSeq, T01OS4_n616MaqOrdSeq, T01OS4_A622MaqUltLin, T01OS4_n622MaqUltLin, T01OS4_A4282MaqFormul,
            T01OS4_n4282MaqFormul, T01OS4_A4283MaqKgsMin, T01OS4_n4283MaqKgsMin, T01OS4_A4284MaqKgsMed, T01OS4_n4284MaqKgsMed, T01OS4_A4285MaqKgsMax, T01OS4_n4285MaqKgsMax, T01OS4_A4319MaqPrdMin, T01OS4_n4319MaqPrdMin, T01OS4_A4320MaqPrdMed,
            T01OS4_n4320MaqPrdMed, T01OS4_A4321MaqPrdMax, T01OS4_n4321MaqPrdMax, T01OS4_A623MaqVolMax, T01OS4_n623MaqVolMax, T01OS4_A625MaqVolMin, T01OS4_n625MaqVolMin, T01OS4_A624MaqVolMed, T01OS4_n624MaqVolMed, T01OS4_A2801MaqVolRes,
            T01OS4_n2801MaqVolRes, T01OS4_A2802MaqVolTop, T01OS4_n2802MaqVolTop, T01OS4_A618MaqTemMax, T01OS4_n618MaqTemMax, T01OS4_A601MaqChp, T01OS4_n601MaqChp, T01OS4_A619MaqTinTip, T01OS4_n619MaqTinTip, T01OS4_A2391MaqMicro,
            T01OS4_n2391MaqMicro, T01OS4_A3598MaqNroTub, T01OS4_n3598MaqNroTub, T01OS4_A5292MaqCodBan, T01OS4_n5292MaqCodBan, T01OS4_A5419MaqSalM, T01OS4_n5419MaqSalM, T01OS4_A5420MaqSalMKi, T01OS4_n5420MaqSalMKi, T01OS4_A5421MaqSalMKf,
            T01OS4_n5421MaqSalMKf, T01OS4_A5463MaqCantCor, T01OS4_n5463MaqCantCor, T01OS4_A5593MaqTipCen, T01OS4_n5593MaqTipCen, T01OS4_A5949MaqDosifP, T01OS4_n5949MaqDosifP, T01OS4_A5950MaqDteCol, T01OS4_n5950MaqDteCol, T01OS4_A604MaqCodFor,
            T01OS4_n604MaqCodFor, T01OS4_A6284MaqFacAbs, T01OS4_n6284MaqFacAbs, T01OS4_A6399MaqKgsId, T01OS4_n6399MaqKgsId, T01OS4_A6432MaqPln, T01OS4_n6432MaqPln, T01OS4_A6433MaqPlnVis, T01OS4_n6433MaqPlnVis, T01OS4_A6454MaqConFas,
            T01OS4_n6454MaqConFas, T01OS4_A8056MaqVaril, T01OS4_n8056MaqVaril, T01OS4_A3599MaqRelBan, T01OS4_n3599MaqRelBan, T01OS4_A8657MaqLoc, T01OS4_n8657MaqLoc, T01OS4_A9626MaqObs, T01OS4_n9626MaqObs, T01OS4_A9982MaqFabsHm,
            T01OS4_n9982MaqFabsHm, T01OS4_A1027MaqHhCon, T01OS4_n1027MaqHhCon, T01OS4_A1026MaqHhCtr, T01OS4_n1026MaqHhCtr, T01OS4_A3600MaqVolBal, T01OS4_n3600MaqVolBal, T01OS4_A3684MaqCosGen, T01OS4_n3684MaqCosGen, T01OS4_A11821MaqMOD,
            T01OS4_n11821MaqMOD, T01OS4_A11822MaqMOI, T01OS4_n11822MaqMOI, T01OS4_A11823MaqEnerg, T01OS4_n11823MaqEnerg, T01OS4_A11824MaqGas, T01OS4_n11824MaqGas, T01OS4_A11825MaqAgua, T01OS4_n11825MaqAgua, T01OS4_A13020MaqTmCarg,
            T01OS4_n13020MaqTmCarg, T01OS4_A13021MaqTmDcarg, T01OS4_n13021MaqTmDcarg, T01OS4_A13022MaqMtsMn, T01OS4_n13022MaqMtsMn, T01OS4_A13023MaqMtsMx, T01OS4_n13023MaqMtsMx, T01OS4_A13179MaqCosFijo, T01OS4_n13179MaqCosFijo, T01OS4_A13180MaqCosKg,
            T01OS4_n13180MaqCosKg, T01OS4_A14289MaqCuerdas, T01OS4_n14289MaqCuerdas, T01OS4_A396EmprCod, T01OS4_A1011TipMaqCod, T01OS4_n1011TipMaqCod, T01OS4_A11726MaqOgtId, T01OS4_n11726MaqOgtId
            }
            , new Object[] {
            T01OS5_A602MaqCod, T01OS5_A3601MaqTipMaq, T01OS5_n3601MaqTipMaq, T01OS5_A606MaqDsc, T01OS5_n606MaqDsc, T01OS5_A14288MaqDscLarg, T01OS5_n14288MaqDscLarg, T01OS5_A600MaqCap, T01OS5_n600MaqCap, T01OS5_A605MaqCosMin,
            T01OS5_n605MaqCosMin, T01OS5_A612MaqHorPro, T01OS5_n612MaqHorPro, T01OS5_A615MaqMinPro, T01OS5_n615MaqMinPro, T01OS5_A620MaqTip, T01OS5_n620MaqTip, T01OS5_A607MaqEst, T01OS5_n607MaqEst, T01OS5_A621MaqUltFec,
            T01OS5_n621MaqUltFec, T01OS5_A617MaqResDia, T01OS5_n617MaqResDia, T01OS5_A611MaqHorAsi, T01OS5_n611MaqHorAsi, T01OS5_A616MaqOrdSeq, T01OS5_n616MaqOrdSeq, T01OS5_A622MaqUltLin, T01OS5_n622MaqUltLin, T01OS5_A4282MaqFormul,
            T01OS5_n4282MaqFormul, T01OS5_A4283MaqKgsMin, T01OS5_n4283MaqKgsMin, T01OS5_A4284MaqKgsMed, T01OS5_n4284MaqKgsMed, T01OS5_A4285MaqKgsMax, T01OS5_n4285MaqKgsMax, T01OS5_A4319MaqPrdMin, T01OS5_n4319MaqPrdMin, T01OS5_A4320MaqPrdMed,
            T01OS5_n4320MaqPrdMed, T01OS5_A4321MaqPrdMax, T01OS5_n4321MaqPrdMax, T01OS5_A623MaqVolMax, T01OS5_n623MaqVolMax, T01OS5_A625MaqVolMin, T01OS5_n625MaqVolMin, T01OS5_A624MaqVolMed, T01OS5_n624MaqVolMed, T01OS5_A2801MaqVolRes,
            T01OS5_n2801MaqVolRes, T01OS5_A2802MaqVolTop, T01OS5_n2802MaqVolTop, T01OS5_A618MaqTemMax, T01OS5_n618MaqTemMax, T01OS5_A601MaqChp, T01OS5_n601MaqChp, T01OS5_A619MaqTinTip, T01OS5_n619MaqTinTip, T01OS5_A2391MaqMicro,
            T01OS5_n2391MaqMicro, T01OS5_A3598MaqNroTub, T01OS5_n3598MaqNroTub, T01OS5_A5292MaqCodBan, T01OS5_n5292MaqCodBan, T01OS5_A5419MaqSalM, T01OS5_n5419MaqSalM, T01OS5_A5420MaqSalMKi, T01OS5_n5420MaqSalMKi, T01OS5_A5421MaqSalMKf,
            T01OS5_n5421MaqSalMKf, T01OS5_A5463MaqCantCor, T01OS5_n5463MaqCantCor, T01OS5_A5593MaqTipCen, T01OS5_n5593MaqTipCen, T01OS5_A5949MaqDosifP, T01OS5_n5949MaqDosifP, T01OS5_A5950MaqDteCol, T01OS5_n5950MaqDteCol, T01OS5_A604MaqCodFor,
            T01OS5_n604MaqCodFor, T01OS5_A6284MaqFacAbs, T01OS5_n6284MaqFacAbs, T01OS5_A6399MaqKgsId, T01OS5_n6399MaqKgsId, T01OS5_A6432MaqPln, T01OS5_n6432MaqPln, T01OS5_A6433MaqPlnVis, T01OS5_n6433MaqPlnVis, T01OS5_A6454MaqConFas,
            T01OS5_n6454MaqConFas, T01OS5_A8056MaqVaril, T01OS5_n8056MaqVaril, T01OS5_A3599MaqRelBan, T01OS5_n3599MaqRelBan, T01OS5_A8657MaqLoc, T01OS5_n8657MaqLoc, T01OS5_A9626MaqObs, T01OS5_n9626MaqObs, T01OS5_A9982MaqFabsHm,
            T01OS5_n9982MaqFabsHm, T01OS5_A1027MaqHhCon, T01OS5_n1027MaqHhCon, T01OS5_A1026MaqHhCtr, T01OS5_n1026MaqHhCtr, T01OS5_A3600MaqVolBal, T01OS5_n3600MaqVolBal, T01OS5_A3684MaqCosGen, T01OS5_n3684MaqCosGen, T01OS5_A11821MaqMOD,
            T01OS5_n11821MaqMOD, T01OS5_A11822MaqMOI, T01OS5_n11822MaqMOI, T01OS5_A11823MaqEnerg, T01OS5_n11823MaqEnerg, T01OS5_A11824MaqGas, T01OS5_n11824MaqGas, T01OS5_A11825MaqAgua, T01OS5_n11825MaqAgua, T01OS5_A13020MaqTmCarg,
            T01OS5_n13020MaqTmCarg, T01OS5_A13021MaqTmDcarg, T01OS5_n13021MaqTmDcarg, T01OS5_A13022MaqMtsMn, T01OS5_n13022MaqMtsMn, T01OS5_A13023MaqMtsMx, T01OS5_n13023MaqMtsMx, T01OS5_A13179MaqCosFijo, T01OS5_n13179MaqCosFijo, T01OS5_A13180MaqCosKg,
            T01OS5_n13180MaqCosKg, T01OS5_A14289MaqCuerdas, T01OS5_n14289MaqCuerdas, T01OS5_A396EmprCod, T01OS5_A1011TipMaqCod, T01OS5_n1011TipMaqCod, T01OS5_A11726MaqOgtId, T01OS5_n11726MaqOgtId
            }
            , new Object[] {
            T01OS6_A407EmprNom, T01OS6_n407EmprNom
            }
            , new Object[] {
            T01OS7_A1012TipMaqDsc, T01OS7_n1012TipMaqDsc
            }
            , new Object[] {
            T01OS8_A11727MaqOgtDsc
            }
            , new Object[] {
            T01OS9_A602MaqCod, T01OS9_A3601MaqTipMaq, T01OS9_n3601MaqTipMaq, T01OS9_A606MaqDsc, T01OS9_n606MaqDsc, T01OS9_A14288MaqDscLarg, T01OS9_n14288MaqDscLarg, T01OS9_A600MaqCap, T01OS9_n600MaqCap, T01OS9_A605MaqCosMin,
            T01OS9_n605MaqCosMin, T01OS9_A612MaqHorPro, T01OS9_n612MaqHorPro, T01OS9_A615MaqMinPro, T01OS9_n615MaqMinPro, T01OS9_A620MaqTip, T01OS9_n620MaqTip, T01OS9_A607MaqEst, T01OS9_n607MaqEst, T01OS9_A407EmprNom,
            T01OS9_n407EmprNom, T01OS9_A621MaqUltFec, T01OS9_n621MaqUltFec, T01OS9_A617MaqResDia, T01OS9_n617MaqResDia, T01OS9_A611MaqHorAsi, T01OS9_n611MaqHorAsi, T01OS9_A616MaqOrdSeq, T01OS9_n616MaqOrdSeq, T01OS9_A622MaqUltLin,
            T01OS9_n622MaqUltLin, T01OS9_A1012TipMaqDsc, T01OS9_n1012TipMaqDsc, T01OS9_A4282MaqFormul, T01OS9_n4282MaqFormul, T01OS9_A4283MaqKgsMin, T01OS9_n4283MaqKgsMin, T01OS9_A4284MaqKgsMed, T01OS9_n4284MaqKgsMed, T01OS9_A4285MaqKgsMax,
            T01OS9_n4285MaqKgsMax, T01OS9_A4319MaqPrdMin, T01OS9_n4319MaqPrdMin, T01OS9_A4320MaqPrdMed, T01OS9_n4320MaqPrdMed, T01OS9_A4321MaqPrdMax, T01OS9_n4321MaqPrdMax, T01OS9_A623MaqVolMax, T01OS9_n623MaqVolMax, T01OS9_A625MaqVolMin,
            T01OS9_n625MaqVolMin, T01OS9_A624MaqVolMed, T01OS9_n624MaqVolMed, T01OS9_A2801MaqVolRes, T01OS9_n2801MaqVolRes, T01OS9_A2802MaqVolTop, T01OS9_n2802MaqVolTop, T01OS9_A618MaqTemMax, T01OS9_n618MaqTemMax, T01OS9_A601MaqChp,
            T01OS9_n601MaqChp, T01OS9_A619MaqTinTip, T01OS9_n619MaqTinTip, T01OS9_A2391MaqMicro, T01OS9_n2391MaqMicro, T01OS9_A3598MaqNroTub, T01OS9_n3598MaqNroTub, T01OS9_A5292MaqCodBan, T01OS9_n5292MaqCodBan, T01OS9_A5419MaqSalM,
            T01OS9_n5419MaqSalM, T01OS9_A5420MaqSalMKi, T01OS9_n5420MaqSalMKi, T01OS9_A5421MaqSalMKf, T01OS9_n5421MaqSalMKf, T01OS9_A5463MaqCantCor, T01OS9_n5463MaqCantCor, T01OS9_A5593MaqTipCen, T01OS9_n5593MaqTipCen, T01OS9_A5949MaqDosifP,
            T01OS9_n5949MaqDosifP, T01OS9_A5950MaqDteCol, T01OS9_n5950MaqDteCol, T01OS9_A604MaqCodFor, T01OS9_n604MaqCodFor, T01OS9_A6284MaqFacAbs, T01OS9_n6284MaqFacAbs, T01OS9_A6399MaqKgsId, T01OS9_n6399MaqKgsId, T01OS9_A6432MaqPln,
            T01OS9_n6432MaqPln, T01OS9_A6433MaqPlnVis, T01OS9_n6433MaqPlnVis, T01OS9_A6454MaqConFas, T01OS9_n6454MaqConFas, T01OS9_A8056MaqVaril, T01OS9_n8056MaqVaril, T01OS9_A3599MaqRelBan, T01OS9_n3599MaqRelBan, T01OS9_A8657MaqLoc,
            T01OS9_n8657MaqLoc, T01OS9_A9626MaqObs, T01OS9_n9626MaqObs, T01OS9_A9982MaqFabsHm, T01OS9_n9982MaqFabsHm, T01OS9_A1027MaqHhCon, T01OS9_n1027MaqHhCon, T01OS9_A1026MaqHhCtr, T01OS9_n1026MaqHhCtr, T01OS9_A3600MaqVolBal,
            T01OS9_n3600MaqVolBal, T01OS9_A3684MaqCosGen, T01OS9_n3684MaqCosGen, T01OS9_A11727MaqOgtDsc, T01OS9_A11821MaqMOD, T01OS9_n11821MaqMOD, T01OS9_A11822MaqMOI, T01OS9_n11822MaqMOI, T01OS9_A11823MaqEnerg, T01OS9_n11823MaqEnerg,
            T01OS9_A11824MaqGas, T01OS9_n11824MaqGas, T01OS9_A11825MaqAgua, T01OS9_n11825MaqAgua, T01OS9_A13020MaqTmCarg, T01OS9_n13020MaqTmCarg, T01OS9_A13021MaqTmDcarg, T01OS9_n13021MaqTmDcarg, T01OS9_A13022MaqMtsMn, T01OS9_n13022MaqMtsMn,
            T01OS9_A13023MaqMtsMx, T01OS9_n13023MaqMtsMx, T01OS9_A13179MaqCosFijo, T01OS9_n13179MaqCosFijo, T01OS9_A13180MaqCosKg, T01OS9_n13180MaqCosKg, T01OS9_A14289MaqCuerdas, T01OS9_n14289MaqCuerdas, T01OS9_A396EmprCod, T01OS9_A1011TipMaqCod,
            T01OS9_n1011TipMaqCod, T01OS9_A11726MaqOgtId, T01OS9_n11726MaqOgtId
            }
            , new Object[] {
            T01OS10_A1012TipMaqDsc, T01OS10_n1012TipMaqDsc
            }
            , new Object[] {
            T01OS11_A11727MaqOgtDsc
            }
            , new Object[] {
            T01OS12_A396EmprCod, T01OS12_A602MaqCod
            }
            , new Object[] {
            T01OS13_A396EmprCod, T01OS13_A602MaqCod
            }
            , new Object[] {
            T01OS14_A396EmprCod, T01OS14_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OS18_A1012TipMaqDsc, T01OS18_n1012TipMaqDsc
            }
            , new Object[] {
            T01OS19_A11727MaqOgtDsc
            }
            , new Object[] {
            T01OS20_A396EmprCod, T01OS20_A602MaqCod, T01OS20_A14529MqCAnyo, T01OS20_A14530MqCMes
            }
            , new Object[] {
            T01OS21_A396EmprCod, T01OS21_A129BarCod, T01OS21_A132BarCodReo, T01OS21_A130BarCodPar, T01OS21_A14152MEnvOrd
            }
            , new Object[] {
            T01OS22_A396EmprCod, T01OS22_A13604RARID, T01OS22_A602MaqCod
            }
            , new Object[] {
            T01OS23_A396EmprCod, T01OS23_A602MaqCod, T01OS23_A13193MaqHdr, T01OS23_A13194MaqHdrR, T01OS23_A13195MaqHdrP, T01OS23_A13196MaqRecLinM
            }
            , new Object[] {
            T01OS24_A396EmprCod, T01OS24_A13137NCHdr, T01OS24_A13138NCHdrr, T01OS24_A13139NCHdrp
            }
            , new Object[] {
            T01OS25_A396EmprCod, T01OS25_A12673LavMqId
            }
            , new Object[] {
            T01OS26_A396EmprCod, T01OS26_A602MaqCod, T01OS26_A12444MaqAnyNP, T01OS26_A12445MaqMesNP
            }
            , new Object[] {
            T01OS27_A396EmprCod, T01OS27_A602MaqCod, T01OS27_A12434MaqAnyM, T01OS27_A12435MaqMesM
            }
            , new Object[] {
            T01OS28_A396EmprCod, T01OS28_A4929Inc_Dia, T01OS28_A5728JBCLLin
            }
            , new Object[] {
            T01OS29_A396EmprCod, T01OS29_A11604PArtId
            }
            , new Object[] {
            T01OS30_A396EmprCod, T01OS30_A602MaqCod, T01OS30_A11445MaqFch
            }
            , new Object[] {
            T01OS31_A396EmprCod, T01OS31_A602MaqCod, T01OS31_A11438MaqEquCod, T01OS31_A11439MaqSEqCod, T01OS31_A11440MaqPieCod
            }
            , new Object[] {
            T01OS32_A396EmprCod, T01OS32_A602MaqCod, T01OS32_A11432MaqDocId
            }
            , new Object[] {
            T01OS33_A396EmprCod, T01OS33_A602MaqCod, T01OS33_A10111Mq_Dia, T01OS33_A10112Mq_Op
            }
            , new Object[] {
            T01OS34_A396EmprCod, T01OS34_A252CliCod, T01OS34_A65ArtCod, T01OS34_A10041ArtSH, T01OS34_A10042ArtMqFa
            }
            , new Object[] {
            T01OS35_A396EmprCod, T01OS35_A602MaqCod, T01OS35_A74MaqTMuIni
            }
            , new Object[] {
            T01OS36_A396EmprCod, T01OS36_A602MaqCod, T01OS36_A9725MaqFabC
            }
            , new Object[] {
            T01OS37_A396EmprCod, T01OS37_A9428SMCod
            }
            , new Object[] {
            T01OS38_A396EmprCod, T01OS38_A9429PMCod
            }
            , new Object[] {
            T01OS39_A396EmprCod, T01OS39_A9425OMCod
            }
            , new Object[] {
            T01OS40_A396EmprCod, T01OS40_A602MaqCod, T01OS40_A8008Maq_Prg
            }
            , new Object[] {
            T01OS41_A396EmprCod, T01OS41_A602MaqCod, T01OS41_A6874CPROCORIG
            }
            , new Object[] {
            T01OS42_A396EmprCod, T01OS42_A6319C_Barcod, T01OS42_A6320C_Barcodre, T01OS42_A6321C_Barcodpa, T01OS42_A6322C_Reclinma
            }
            , new Object[] {
            T01OS43_A396EmprCod, T01OS43_A602MaqCod, T01OS43_A6260MaqTqn
            }
            , new Object[] {
            T01OS44_A396EmprCod, T01OS44_A6188MaqTArt, T01OS44_A602MaqCod
            }
            , new Object[] {
            T01OS45_A396EmprCod, T01OS45_A602MaqCod, T01OS45_A6078MaqCliCod, T01OS45_A6079MaqArtCod
            }
            , new Object[] {
            T01OS46_A396EmprCod, T01OS46_A6037Mq_Grupo, T01OS46_A602MaqCod
            }
            , new Object[] {
            T01OS47_A396EmprCod, T01OS47_A6000CRCod, T01OS47_A6005CRLin
            }
            , new Object[] {
            T01OS48_A396EmprCod, T01OS48_A602MaqCod, T01OS48_A5879PlaMTAOrd
            }
            , new Object[] {
            T01OS49_A396EmprCod, T01OS49_A5603PrdNumM, T01OS49_A602MaqCod
            }
            , new Object[] {
            T01OS50_A396EmprCod, T01OS50_A602MaqCod, T01OS50_A5525MaqPrdNum
            }
            , new Object[] {
            T01OS51_A396EmprCod, T01OS51_A764ProForCod, T01OS51_A5191ProForLC
            }
            , new Object[] {
            T01OS52_A396EmprCod, T01OS52_A4686MaqTipArt, T01OS52_A602MaqCod
            }
            , new Object[] {
            T01OS53_A396EmprCod, T01OS53_A3331LanBroCod, T01OS53_A3333LanBroLin
            }
            , new Object[] {
            T01OS54_A396EmprCod, T01OS54_A602MaqCod, T01OS54_A3047LOParId
            }
            , new Object[] {
            T01OS55_A396EmprCod, T01OS55_A129BarCod, T01OS55_A132BarCodReo, T01OS55_A130BarCodPar, T01OS55_A2804RecLinMaq
            }
            , new Object[] {
            T01OS56_A396EmprCod, T01OS56_A602MaqCod, T01OS56_A2461PlaFecTin
            }
            , new Object[] {
            T01OS57_A396EmprCod, T01OS57_A602MaqCod, T01OS57_A2019MaqMadLin
            }
            , new Object[] {
            T01OS58_A396EmprCod, T01OS58_A602MaqCod, T01OS58_A2014MaqConLin
            }
            , new Object[] {
            T01OS59_A396EmprCod, T01OS59_A1621CosTermCod, T01OS59_A1615CosLin
            }
            , new Object[] {
            T01OS60_A396EmprCod, T01OS60_A602MaqCod, T01OS60_A1142MaqFCod
            }
            , new Object[] {
            T01OS61_A396EmprCod, T01OS61_A602MaqCod, T01OS61_A634MhiMes, T01OS61_A632MhiAny
            }
            , new Object[] {
            T01OS62_A396EmprCod, T01OS62_A602MaqCod, T01OS62_A599MaqAny, T01OS62_A614MaqMes
            }
            , new Object[] {
            T01OS63_A396EmprCod, T01OS63_A539HisBarCod, T01OS63_A545HisCodReo, T01OS63_A544HisCodPar, T01OS63_A833TipDefCod
            }
            , new Object[] {
            T01OS64_A396EmprCod, T01OS64_A602MaqCod, T01OS64_A558HisProFec
            }
            , new Object[] {
            T01OS65_A396EmprCod, T01OS65_A501GruMaqCod, T01OS65_A602MaqCod
            }
            , new Object[] {
            T01OS66_A396EmprCod, T01OS66_A457FasCod
            }
            , new Object[] {
            T01OS67_A396EmprCod, T01OS67_A361DisCod
            }
            , new Object[] {
            T01OS68_A396EmprCod, T01OS68_A129BarCod, T01OS68_A132BarCodReo, T01OS68_A130BarCodPar, T01OS68_A758ProCod, T01OS68_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01OS70_A396EmprCod, T01OS70_A602MaqCod
            }
            , new Object[] {
            T01OS71_A396EmprCod, T01OS71_A602MaqCod, T01OS71_A320DesTecLin, T01OS71_A613MaqLinTex
            }
            , new Object[] {
            T01OS72_A396EmprCod, T01OS72_A602MaqCod, T01OS72_A320DesTecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OS76_A396EmprCod, T01OS76_A602MaqCod, T01OS76_A320DesTecLin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV127Pgmname = "TMAQUI1" ;
      Z4282MaqFormul = "N" ;
      n4282MaqFormul = false ;
      A4282MaqFormul = "N" ;
      n4282MaqFormul = false ;
      i4282MaqFormul = "N" ;
      n4282MaqFormul = false ;
      Z13180MaqCosKg = DecimalUtil.doubleToDec(0) ;
      n13180MaqCosKg = false ;
      A13180MaqCosKg = DecimalUtil.doubleToDec(0) ;
      n13180MaqCosKg = false ;
      i13180MaqCosKg = DecimalUtil.doubleToDec(0) ;
      n13180MaqCosKg = false ;
      Z13179MaqCosFijo = DecimalUtil.doubleToDec(0) ;
      n13179MaqCosFijo = false ;
      A13179MaqCosFijo = DecimalUtil.doubleToDec(0) ;
      n13179MaqCosFijo = false ;
      i13179MaqCosFijo = DecimalUtil.doubleToDec(0) ;
      n13179MaqCosFijo = false ;
      Z1026MaqHhCtr = "N" ;
      n1026MaqHhCtr = false ;
      A1026MaqHhCtr = "N" ;
      n1026MaqHhCtr = false ;
      i1026MaqHhCtr = "N" ;
      n1026MaqHhCtr = false ;
      Z3601MaqTipMaq = "N" ;
      n3601MaqTipMaq = false ;
      A3601MaqTipMaq = "N" ;
      n3601MaqTipMaq = false ;
      i3601MaqTipMaq = "N" ;
      n3601MaqTipMaq = false ;
      Z8056MaqVaril = "N" ;
      n8056MaqVaril = false ;
      A8056MaqVaril = "N" ;
      n8056MaqVaril = false ;
      i8056MaqVaril = "N" ;
      n8056MaqVaril = false ;
      Z5949MaqDosifP = "N" ;
      n5949MaqDosifP = false ;
      A5949MaqDosifP = "N" ;
      n5949MaqDosifP = false ;
      i5949MaqDosifP = "N" ;
      n5949MaqDosifP = false ;
      Z5593MaqTipCen = " " ;
      n5593MaqTipCen = false ;
      A5593MaqTipCen = " " ;
      n5593MaqTipCen = false ;
      i5593MaqTipCen = " " ;
      n5593MaqTipCen = false ;
      Z5419MaqSalM = "N" ;
      n5419MaqSalM = false ;
      A5419MaqSalM = "N" ;
      n5419MaqSalM = false ;
      i5419MaqSalM = "N" ;
      n5419MaqSalM = false ;
      Z6454MaqConFas = 0 ;
      n6454MaqConFas = false ;
      A6454MaqConFas = 0 ;
      n6454MaqConFas = false ;
      i6454MaqConFas = 0 ;
      n6454MaqConFas = false ;
      Z601MaqChp = "N" ;
      n601MaqChp = false ;
      A601MaqChp = "N" ;
      n601MaqChp = false ;
      i601MaqChp = "N" ;
      n601MaqChp = false ;
   }

   private byte Z612MaqHorPro ;
   private byte Z615MaqMinPro ;
   private byte Z622MaqUltLin ;
   private byte Z2391MaqMicro ;
   private byte Z3598MaqNroTub ;
   private byte Z6432MaqPln ;
   private byte Z6433MaqPlnVis ;
   private byte Z3599MaqRelBan ;
   private byte O622MaqUltLin ;
   private byte Z320DesTecLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A622MaqUltLin ;
   private byte Gx_BScreen ;
   private byte A6433MaqPlnVis ;
   private byte A6432MaqPln ;
   private byte A612MaqHorPro ;
   private byte A615MaqMinPro ;
   private byte A3598MaqNroTub ;
   private byte A3599MaqRelBan ;
   private byte A2391MaqMicro ;
   private byte B622MaqUltLin ;
   private byte s622MaqUltLin ;
   private byte A320DesTecLin ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i622MaqUltLin ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private short Z616MaqOrdSeq ;
   private short Z4319MaqPrdMin ;
   private short Z4320MaqPrdMed ;
   private short Z4321MaqPrdMax ;
   private short Z618MaqTemMax ;
   private short Z13020MaqTmCarg ;
   private short Z13021MaqTmDcarg ;
   private short Z14289MaqCuerdas ;
   private short nRcdDeleted_68 ;
   private short nRcdExists_68 ;
   private short nIsMod_68 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A618MaqTemMax ;
   private short A14289MaqCuerdas ;
   private short A13020MaqTmCarg ;
   private short A13021MaqTmDcarg ;
   private short nBlankRcdCount68 ;
   private short RcdFound68 ;
   private short nBlankRcdUsr68 ;
   private short A616MaqOrdSeq ;
   private short A4319MaqPrdMin ;
   private short A4320MaqPrdMed ;
   private short A4321MaqPrdMax ;
   private short RcdFound65 ;
   private short nIsDirty_65 ;
   private short nIsDirty_68 ;
   private int Z600MaqCap ;
   private int Z623MaqVolMax ;
   private int Z625MaqVolMin ;
   private int Z624MaqVolMed ;
   private int Z2801MaqVolRes ;
   private int Z2802MaqVolTop ;
   private int Z5950MaqDteCol ;
   private int Z6454MaqConFas ;
   private int Z3600MaqVolBal ;
   private int nRC_GXsfl_379 ;
   private int nGXsfl_379_idx=1 ;
   private int trnEnded ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqDscLarg_Enabled ;
   private int Gxuitabspanel_tabs1_Pagecount ;
   private int A600MaqCap ;
   private int edtMaqCap_Enabled ;
   private int edtMaqCosMin_Visible ;
   private int edtMaqCosMin_Enabled ;
   private int edtMaqCosKg_Visible ;
   private int edtMaqCosKg_Enabled ;
   private int edtMaqCosFijo_Visible ;
   private int edtMaqCosFijo_Enabled ;
   private int edtMaqHorPro_Enabled ;
   private int edtMaqMinPro_Enabled ;
   private int edtTipMaqCod_Visible ;
   private int edtTipMaqCod_Enabled ;
   private int edtMaqTemMax_Enabled ;
   private int edtMaqNroTub_Enabled ;
   private int edtMaqOgtId_Visible ;
   private int edtMaqOgtId_Enabled ;
   private int edtMaqMOD_Enabled ;
   private int edtMaqMOI_Enabled ;
   private int edtMaqEnerg_Enabled ;
   private int edtMaqGas_Enabled ;
   private int edtMaqAgua_Enabled ;
   private int edtMaqCosMm_Enabled ;
   private int A623MaqVolMax ;
   private int edtMaqVolMax_Enabled ;
   private int A624MaqVolMed ;
   private int edtMaqVolMed_Enabled ;
   private int A625MaqVolMin ;
   private int edtMaqVolMin_Enabled ;
   private int edtMaqRelBan_Enabled ;
   private int edtMaqKgsMax_Enabled ;
   private int edtMaqKgsMed_Enabled ;
   private int edtMaqKgsMin_Enabled ;
   private int edtMaqTinTip_Enabled ;
   private int A2801MaqVolRes ;
   private int edtMaqVolRes_Enabled ;
   private int A2802MaqVolTop ;
   private int edtMaqVolTop_Enabled ;
   private int edtMaqVolBal_Visible ;
   private int A3600MaqVolBal ;
   private int edtMaqVolBal_Enabled ;
   private int edtMaqMicro_Enabled ;
   private int edtMaqTipCen_Visible ;
   private int edtMaqTipCen_Enabled ;
   private int edtMaqCodFor_Enabled ;
   private int edtMaqCuerdas_Enabled ;
   private int edtMaqSalMKi_Enabled ;
   private int edtMaqSalMKf_Enabled ;
   private int A5950MaqDteCol ;
   private int edtMaqDteCol_Enabled ;
   private int edtMaqTmCarg_Enabled ;
   private int edtMaqTmDcarg_Enabled ;
   private int edtMaqFacAbs_Enabled ;
   private int edtMaqFabsHm_Enabled ;
   private int edtMaqCantCor_Visible ;
   private int edtMaqCantCor_Enabled ;
   private int edtMaqHhCon_Visible ;
   private int edtMaqHhCon_Enabled ;
   private int edtMaqLoc_Visible ;
   private int edtMaqLoc_Enabled ;
   private int edtMaqTipMaq_Visible ;
   private int edtMaqTipMaq_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombotipmaqcod_Visible ;
   private int edtavCombotipmaqcod_Enabled ;
   private int edtavCombomaqogtid_Visible ;
   private int edtavCombomaqogtid_Enabled ;
   private int edtDesTecLin_Enabled ;
   private int edtMaqLinTex_Enabled ;
   private int fRowAdded ;
   private int A6454MaqConFas ;
   private int Combo_tipmaqcod_Datalistupdateminimumcharacters ;
   private int Combo_maqogtid_Datalistupdateminimumcharacters ;
   private int Gxuitabspanel_tabs1_Activepage ;
   private int Datamonjs_Gxcontroltype ;
   private int AV128GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtDesTecLin_Enabled ;
   private int i6454MaqConFas ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z605MaqCosMin ;
   private java.math.BigDecimal Z617MaqResDia ;
   private java.math.BigDecimal Z611MaqHorAsi ;
   private java.math.BigDecimal Z4283MaqKgsMin ;
   private java.math.BigDecimal Z4284MaqKgsMed ;
   private java.math.BigDecimal Z4285MaqKgsMax ;
   private java.math.BigDecimal Z5420MaqSalMKi ;
   private java.math.BigDecimal Z5421MaqSalMKf ;
   private java.math.BigDecimal Z5463MaqCantCor ;
   private java.math.BigDecimal Z6284MaqFacAbs ;
   private java.math.BigDecimal Z6399MaqKgsId ;
   private java.math.BigDecimal Z9982MaqFabsHm ;
   private java.math.BigDecimal Z1027MaqHhCon ;
   private java.math.BigDecimal Z3684MaqCosGen ;
   private java.math.BigDecimal Z11821MaqMOD ;
   private java.math.BigDecimal Z11822MaqMOI ;
   private java.math.BigDecimal Z11823MaqEnerg ;
   private java.math.BigDecimal Z11824MaqGas ;
   private java.math.BigDecimal Z11825MaqAgua ;
   private java.math.BigDecimal Z13022MaqMtsMn ;
   private java.math.BigDecimal Z13023MaqMtsMx ;
   private java.math.BigDecimal Z13179MaqCosFijo ;
   private java.math.BigDecimal Z13180MaqCosKg ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A13180MaqCosKg ;
   private java.math.BigDecimal A13179MaqCosFijo ;
   private java.math.BigDecimal A11821MaqMOD ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11825MaqAgua ;
   private java.math.BigDecimal A12123MaqCosMm ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A5420MaqSalMKi ;
   private java.math.BigDecimal A5421MaqSalMKf ;
   private java.math.BigDecimal A6284MaqFacAbs ;
   private java.math.BigDecimal A9982MaqFabsHm ;
   private java.math.BigDecimal A5463MaqCantCor ;
   private java.math.BigDecimal A1027MaqHhCon ;
   private java.math.BigDecimal A617MaqResDia ;
   private java.math.BigDecimal A611MaqHorAsi ;
   private java.math.BigDecimal A6399MaqKgsId ;
   private java.math.BigDecimal A3684MaqCosGen ;
   private java.math.BigDecimal A13022MaqMtsMn ;
   private java.math.BigDecimal A13023MaqMtsMx ;
   private java.math.BigDecimal i13179MaqCosFijo ;
   private java.math.BigDecimal i13180MaqCosKg ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV109EmprCod ;
   private String wcpOAV118MaqCod ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z3601MaqTipMaq ;
   private String Z606MaqDsc ;
   private String Z14288MaqDscLarg ;
   private String Z620MaqTip ;
   private String Z607MaqEst ;
   private String Z621MaqUltFec ;
   private String Z4282MaqFormul ;
   private String Z601MaqChp ;
   private String Z619MaqTinTip ;
   private String Z5292MaqCodBan ;
   private String Z5419MaqSalM ;
   private String Z5593MaqTipCen ;
   private String Z5949MaqDosifP ;
   private String Z604MaqCodFor ;
   private String Z8056MaqVaril ;
   private String Z8657MaqLoc ;
   private String Z1026MaqHhCtr ;
   private String Z1011TipMaqCod ;
   private String Z11726MaqOgtId ;
   private String N1011TipMaqCod ;
   private String N11726MaqOgtId ;
   private String Combo_maqogtid_Selectedvalue_get ;
   private String Combo_tipmaqcod_Selectedvalue_get ;
   private String Z613MaqLinTex ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV109EmprCod ;
   private String A1011TipMaqCod ;
   private String A11726MaqOgtId ;
   private String Gx_mode ;
   private String AV118MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqCod_Internalname ;
   private String sGXsfl_379_idx="0001" ;
   private String A620MaqTip ;
   private String A607MaqEst ;
   private String A601MaqChp ;
   private String A5292MaqCodBan ;
   private String A5949MaqDosifP ;
   private String A5419MaqSalM ;
   private String A8056MaqVaril ;
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
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqDscLarg_Internalname ;
   private String A14288MaqDscLarg ;
   private String edtMaqDscLarg_Jsonclick ;
   private String Gxuitabspanel_tabs1_Class ;
   private String Gxuitabspanel_tabs1_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String edtMaqCap_Internalname ;
   private String edtMaqCap_Jsonclick ;
   private String divMaqcosmin_cell_Internalname ;
   private String divMaqcosmin_cell_Class ;
   private String edtMaqCosMin_Internalname ;
   private String edtMaqCosMin_Jsonclick ;
   private String divMaqcoskg_cell_Internalname ;
   private String divMaqcoskg_cell_Class ;
   private String edtMaqCosKg_Internalname ;
   private String edtMaqCosKg_Jsonclick ;
   private String divMaqcosfijo_cell_Internalname ;
   private String divMaqcosfijo_cell_Class ;
   private String edtMaqCosFijo_Internalname ;
   private String edtMaqCosFijo_Jsonclick ;
   private String grpUnnamedgroup12_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable11_Internalname ;
   private String divUnnamedtablemaqhorpro_Internalname ;
   private String lblTextblockmaqhorpro_Internalname ;
   private String lblTextblockmaqhorpro_Jsonclick ;
   private String edtMaqHorPro_Internalname ;
   private String edtMaqHorPro_Jsonclick ;
   private String divUnnamedtablemaqminpro_Internalname ;
   private String lblTextblockmaqminpro_Internalname ;
   private String lblTextblockmaqminpro_Jsonclick ;
   private String edtMaqMinPro_Internalname ;
   private String edtMaqMinPro_Jsonclick ;
   private String divUnnamedtable13_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String divTablesplittedtipmaqcod_Internalname ;
   private String lblTextblocktipmaqcod_Internalname ;
   private String lblTextblocktipmaqcod_Jsonclick ;
   private String Combo_tipmaqcod_Caption ;
   private String Combo_tipmaqcod_Cls ;
   private String Combo_tipmaqcod_Emptyitemtext ;
   private String Combo_tipmaqcod_Internalname ;
   private String edtTipMaqCod_Internalname ;
   private String edtTipMaqCod_Jsonclick ;
   private String edtMaqTemMax_Internalname ;
   private String edtMaqTemMax_Jsonclick ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divTableresultado2_Internalname ;
   private String Dvpanel_paneldatos_Width ;
   private String Dvpanel_paneldatos_Cls ;
   private String Dvpanel_paneldatos_Title ;
   private String Dvpanel_paneldatos_Iconposition ;
   private String Dvpanel_paneldatos_Internalname ;
   private String divPaneldatos_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtMaqNroTub_Internalname ;
   private String edtMaqNroTub_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String divTablesplittedmaqogtid_Internalname ;
   private String lblTextblockmaqogtid_Internalname ;
   private String lblTextblockmaqogtid_Jsonclick ;
   private String Combo_maqogtid_Caption ;
   private String Combo_maqogtid_Cls ;
   private String Combo_maqogtid_Internalname ;
   private String edtMaqOgtId_Internalname ;
   private String edtMaqOgtId_Jsonclick ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtMaqMOD_Internalname ;
   private String edtMaqMOD_Jsonclick ;
   private String edtMaqMOI_Internalname ;
   private String edtMaqMOI_Jsonclick ;
   private String edtMaqEnerg_Internalname ;
   private String edtMaqEnerg_Jsonclick ;
   private String edtMaqGas_Internalname ;
   private String edtMaqGas_Jsonclick ;
   private String edtMaqAgua_Internalname ;
   private String edtMaqAgua_Jsonclick ;
   private String edtMaqCosMm_Internalname ;
   private String edtMaqCosMm_Jsonclick ;
   private String Dvpanel_panelcapacidades_Width ;
   private String Dvpanel_panelcapacidades_Cls ;
   private String Dvpanel_panelcapacidades_Title ;
   private String Dvpanel_panelcapacidades_Iconposition ;
   private String Dvpanel_panelcapacidades_Internalname ;
   private String divPanelcapacidades_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtMaqVolMax_Internalname ;
   private String edtMaqVolMax_Jsonclick ;
   private String edtMaqVolMed_Internalname ;
   private String edtMaqVolMed_Jsonclick ;
   private String edtMaqVolMin_Internalname ;
   private String edtMaqVolMin_Jsonclick ;
   private String edtMaqRelBan_Internalname ;
   private String edtMaqRelBan_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtMaqKgsMax_Internalname ;
   private String edtMaqKgsMax_Jsonclick ;
   private String edtMaqKgsMed_Internalname ;
   private String edtMaqKgsMed_Jsonclick ;
   private String edtMaqKgsMin_Internalname ;
   private String edtMaqKgsMin_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtMaqTinTip_Internalname ;
   private String A619MaqTinTip ;
   private String edtMaqTinTip_Jsonclick ;
   private String edtMaqVolRes_Internalname ;
   private String edtMaqVolRes_Jsonclick ;
   private String edtMaqVolTop_Internalname ;
   private String edtMaqVolTop_Jsonclick ;
   private String divMaqvolbal_cell_Internalname ;
   private String divMaqvolbal_cell_Class ;
   private String edtMaqVolBal_Internalname ;
   private String edtMaqVolBal_Jsonclick ;
   private String Dvpanel_panelcentralizacion_Width ;
   private String Dvpanel_panelcentralizacion_Cls ;
   private String Dvpanel_panelcentralizacion_Title ;
   private String Dvpanel_panelcentralizacion_Iconposition ;
   private String Dvpanel_panelcentralizacion_Internalname ;
   private String divPanelcentralizacion_Internalname ;
   private String edtMaqMicro_Internalname ;
   private String edtMaqMicro_Jsonclick ;
   private String divMaqcodban_cell_Internalname ;
   private String divMaqcodban_cell_Class ;
   private String divMaqtipcen_cell_Internalname ;
   private String divMaqtipcen_cell_Class ;
   private String edtMaqTipCen_Internalname ;
   private String A5593MaqTipCen ;
   private String edtMaqTipCen_Jsonclick ;
   private String edtMaqCodFor_Internalname ;
   private String A604MaqCodFor ;
   private String edtMaqCodFor_Jsonclick ;
   private String edtMaqCuerdas_Internalname ;
   private String edtMaqCuerdas_Jsonclick ;
   private String divDvpanel_panelsalmuera_cell_Internalname ;
   private String divDvpanel_panelsalmuera_cell_Class ;
   private String Dvpanel_panelsalmuera_Width ;
   private String Dvpanel_panelsalmuera_Cls ;
   private String Dvpanel_panelsalmuera_Title ;
   private String Dvpanel_panelsalmuera_Iconposition ;
   private String Dvpanel_panelsalmuera_Internalname ;
   private String divPanelsalmuera_Internalname ;
   private String edtMaqSalMKi_Internalname ;
   private String edtMaqSalMKi_Jsonclick ;
   private String edtMaqSalMKf_Internalname ;
   private String edtMaqSalMKf_Jsonclick ;
   private String edtMaqDteCol_Internalname ;
   private String edtMaqDteCol_Jsonclick ;
   private String Dvpanel_paneltiempos_Width ;
   private String Dvpanel_paneltiempos_Cls ;
   private String Dvpanel_paneltiempos_Title ;
   private String Dvpanel_paneltiempos_Iconposition ;
   private String Dvpanel_paneltiempos_Internalname ;
   private String divPaneltiempos_Internalname ;
   private String edtMaqTmCarg_Internalname ;
   private String edtMaqTmCarg_Jsonclick ;
   private String edtMaqTmDcarg_Internalname ;
   private String edtMaqTmDcarg_Jsonclick ;
   private String Dvpanel_panelfactabs_planificacion_Width ;
   private String Dvpanel_panelfactabs_planificacion_Cls ;
   private String Dvpanel_panelfactabs_planificacion_Title ;
   private String Dvpanel_panelfactabs_planificacion_Iconposition ;
   private String Dvpanel_panelfactabs_planificacion_Internalname ;
   private String divPanelfactabs_planificacion_Internalname ;
   private String divMaqplnvis_cell_Internalname ;
   private String divMaqplnvis_cell_Class ;
   private String divMaqpln_cell_Internalname ;
   private String divMaqpln_cell_Class ;
   private String edtMaqFacAbs_Internalname ;
   private String edtMaqFacAbs_Jsonclick ;
   private String edtMaqFabsHm_Internalname ;
   private String edtMaqFabsHm_Jsonclick ;
   private String divMaqcantcor_cell_Internalname ;
   private String divMaqcantcor_cell_Class ;
   private String edtMaqCantCor_Internalname ;
   private String edtMaqCantCor_Jsonclick ;
   private String divMaqhhcon_cell_Internalname ;
   private String divMaqhhcon_cell_Class ;
   private String edtMaqHhCon_Internalname ;
   private String edtMaqHhCon_Jsonclick ;
   private String divDvpanel_paneltipomaquina_cell_Internalname ;
   private String divDvpanel_paneltipomaquina_cell_Class ;
   private String Dvpanel_paneltipomaquina_Width ;
   private String Dvpanel_paneltipomaquina_Cls ;
   private String Dvpanel_paneltipomaquina_Title ;
   private String Dvpanel_paneltipomaquina_Iconposition ;
   private String Dvpanel_paneltipomaquina_Internalname ;
   private String divPaneltipomaquina_Internalname ;
   private String divMaqloc_cell_Internalname ;
   private String divMaqloc_cell_Class ;
   private String edtMaqLoc_Internalname ;
   private String A8657MaqLoc ;
   private String edtMaqLoc_Jsonclick ;
   private String divMaqvaril_cell_Internalname ;
   private String divMaqvaril_cell_Class ;
   private String divMaqtipmaq_cell_Internalname ;
   private String divMaqtipmaq_cell_Class ;
   private String edtMaqTipMaq_Internalname ;
   private String A3601MaqTipMaq ;
   private String edtMaqTipMaq_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String Dvpanel_panelobservaciones_Width ;
   private String Dvpanel_panelobservaciones_Cls ;
   private String Dvpanel_panelobservaciones_Title ;
   private String Dvpanel_panelobservaciones_Iconposition ;
   private String Dvpanel_panelobservaciones_Internalname ;
   private String divPanelobservaciones_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV127Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_tipmaqcod_Internalname ;
   private String edtavCombotipmaqcod_Internalname ;
   private String AV123ComboTipMaqCod ;
   private String edtavCombotipmaqcod_Jsonclick ;
   private String divSectionattribute_maqogtid_Internalname ;
   private String edtavCombomaqogtid_Internalname ;
   private String AV125ComboMaqOgtId ;
   private String edtavCombomaqogtid_Jsonclick ;
   private String sMode68 ;
   private String edtDesTecLin_Internalname ;
   private String edtMaqLinTex_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String A621MaqUltFec ;
   private String A4282MaqFormul ;
   private String A1026MaqHhCtr ;
   private String AV114Insert_TipMaqCod ;
   private String AV116Insert_MaqOgtId ;
   private String A407EmprNom ;
   private String A1012TipMaqDsc ;
   private String A11727MaqOgtDsc ;
   private String Combo_tipmaqcod_Objectcall ;
   private String Combo_tipmaqcod_Class ;
   private String Combo_tipmaqcod_Icontype ;
   private String Combo_tipmaqcod_Icon ;
   private String Combo_tipmaqcod_Tooltip ;
   private String Combo_tipmaqcod_Selectedvalue_set ;
   private String Combo_tipmaqcod_Selectedtext_set ;
   private String Combo_tipmaqcod_Selectedtext_get ;
   private String Combo_tipmaqcod_Gamoauthtoken ;
   private String Combo_tipmaqcod_Ddointernalname ;
   private String Combo_tipmaqcod_Titlecontrolalign ;
   private String Combo_tipmaqcod_Dropdownoptionstype ;
   private String Combo_tipmaqcod_Titlecontrolidtoreplace ;
   private String Combo_tipmaqcod_Datalisttype ;
   private String Combo_tipmaqcod_Datalistfixedvalues ;
   private String Combo_tipmaqcod_Datalistproc ;
   private String Combo_tipmaqcod_Datalistprocparametersprefix ;
   private String Combo_tipmaqcod_Remoteservicesparameters ;
   private String Combo_tipmaqcod_Htmltemplate ;
   private String Combo_tipmaqcod_Multiplevaluestype ;
   private String Combo_tipmaqcod_Loadingdata ;
   private String Combo_tipmaqcod_Noresultsfound ;
   private String Combo_tipmaqcod_Onlyselectedvalues ;
   private String Combo_tipmaqcod_Selectalltext ;
   private String Combo_tipmaqcod_Multiplevaluesseparator ;
   private String Combo_tipmaqcod_Addnewoptiontext ;
   private String Combo_maqogtid_Objectcall ;
   private String Combo_maqogtid_Class ;
   private String Combo_maqogtid_Icontype ;
   private String Combo_maqogtid_Icon ;
   private String Combo_maqogtid_Tooltip ;
   private String Combo_maqogtid_Selectedvalue_set ;
   private String Combo_maqogtid_Selectedtext_set ;
   private String Combo_maqogtid_Selectedtext_get ;
   private String Combo_maqogtid_Gamoauthtoken ;
   private String Combo_maqogtid_Ddointernalname ;
   private String Combo_maqogtid_Titlecontrolalign ;
   private String Combo_maqogtid_Dropdownoptionstype ;
   private String Combo_maqogtid_Titlecontrolidtoreplace ;
   private String Combo_maqogtid_Datalisttype ;
   private String Combo_maqogtid_Datalistfixedvalues ;
   private String Combo_maqogtid_Datalistproc ;
   private String Combo_maqogtid_Datalistprocparametersprefix ;
   private String Combo_maqogtid_Remoteservicesparameters ;
   private String Combo_maqogtid_Htmltemplate ;
   private String Combo_maqogtid_Multiplevaluestype ;
   private String Combo_maqogtid_Loadingdata ;
   private String Combo_maqogtid_Noresultsfound ;
   private String Combo_maqogtid_Emptyitemtext ;
   private String Combo_maqogtid_Onlyselectedvalues ;
   private String Combo_maqogtid_Selectalltext ;
   private String Combo_maqogtid_Multiplevaluesseparator ;
   private String Combo_maqogtid_Addnewoptiontext ;
   private String Dvpanel_paneldatos_Objectcall ;
   private String Dvpanel_paneldatos_Class ;
   private String Dvpanel_paneldatos_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_panelcapacidades_Objectcall ;
   private String Dvpanel_panelcapacidades_Class ;
   private String Dvpanel_panelcapacidades_Height ;
   private String Dvpanel_panelcentralizacion_Objectcall ;
   private String Dvpanel_panelcentralizacion_Class ;
   private String Dvpanel_panelcentralizacion_Height ;
   private String Dvpanel_panelsalmuera_Objectcall ;
   private String Dvpanel_panelsalmuera_Class ;
   private String Dvpanel_panelsalmuera_Height ;
   private String Dvpanel_paneltiempos_Objectcall ;
   private String Dvpanel_paneltiempos_Class ;
   private String Dvpanel_paneltiempos_Height ;
   private String Dvpanel_panelfactabs_planificacion_Objectcall ;
   private String Dvpanel_panelfactabs_planificacion_Class ;
   private String Dvpanel_panelfactabs_planificacion_Height ;
   private String Dvpanel_paneltipomaquina_Objectcall ;
   private String Dvpanel_paneltipomaquina_Class ;
   private String Dvpanel_paneltipomaquina_Height ;
   private String Gxuitabspanel_tabs1_Objectcall ;
   private String Gxuitabspanel_tabs1_Activepagecontrolname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_panelobservaciones_Objectcall ;
   private String Dvpanel_panelobservaciones_Class ;
   private String Dvpanel_panelobservaciones_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode65 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A613MaqLinTex ;
   private String AV119Station ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z1012TipMaqDsc ;
   private String Z11727MaqOgtDsc ;
   private String sGXsfl_379_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtDesTecLin_Jsonclick ;
   private String edtMaqLinTex_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i3601MaqTipMaq ;
   private String i601MaqChp ;
   private String i5419MaqSalM ;
   private String i5593MaqTipCen ;
   private String i5949MaqDosifP ;
   private String i8056MaqVaril ;
   private String i1026MaqHhCtr ;
   private String i4282MaqFormul ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1011TipMaqCod ;
   private boolean n11726MaqOgtId ;
   private boolean wbErr ;
   private boolean n622MaqUltLin ;
   private boolean n620MaqTip ;
   private boolean n607MaqEst ;
   private boolean n601MaqChp ;
   private boolean n5292MaqCodBan ;
   private boolean n5949MaqDosifP ;
   private boolean n5419MaqSalM ;
   private boolean n6433MaqPlnVis ;
   private boolean n6432MaqPln ;
   private boolean n8056MaqVaril ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Gxuitabspanel_tabs1_Historymanagement ;
   private boolean Dvpanel_paneldatos_Autowidth ;
   private boolean Dvpanel_paneldatos_Autoheight ;
   private boolean Dvpanel_paneldatos_Collapsible ;
   private boolean Dvpanel_paneldatos_Collapsed ;
   private boolean Dvpanel_paneldatos_Showcollapseicon ;
   private boolean Dvpanel_paneldatos_Autoscroll ;
   private boolean Combo_maqogtid_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_panelcapacidades_Autowidth ;
   private boolean Dvpanel_panelcapacidades_Autoheight ;
   private boolean Dvpanel_panelcapacidades_Collapsible ;
   private boolean Dvpanel_panelcapacidades_Collapsed ;
   private boolean Dvpanel_panelcapacidades_Showcollapseicon ;
   private boolean Dvpanel_panelcapacidades_Autoscroll ;
   private boolean Dvpanel_panelcentralizacion_Autowidth ;
   private boolean Dvpanel_panelcentralizacion_Autoheight ;
   private boolean Dvpanel_panelcentralizacion_Collapsible ;
   private boolean Dvpanel_panelcentralizacion_Collapsed ;
   private boolean Dvpanel_panelcentralizacion_Showcollapseicon ;
   private boolean Dvpanel_panelcentralizacion_Autoscroll ;
   private boolean Dvpanel_panelsalmuera_Autowidth ;
   private boolean Dvpanel_panelsalmuera_Autoheight ;
   private boolean Dvpanel_panelsalmuera_Collapsible ;
   private boolean Dvpanel_panelsalmuera_Collapsed ;
   private boolean Dvpanel_panelsalmuera_Showcollapseicon ;
   private boolean Dvpanel_panelsalmuera_Autoscroll ;
   private boolean Dvpanel_paneltiempos_Autowidth ;
   private boolean Dvpanel_paneltiempos_Autoheight ;
   private boolean Dvpanel_paneltiempos_Collapsible ;
   private boolean Dvpanel_paneltiempos_Collapsed ;
   private boolean Dvpanel_paneltiempos_Showcollapseicon ;
   private boolean Dvpanel_paneltiempos_Autoscroll ;
   private boolean Dvpanel_panelfactabs_planificacion_Autowidth ;
   private boolean Dvpanel_panelfactabs_planificacion_Autoheight ;
   private boolean Dvpanel_panelfactabs_planificacion_Collapsible ;
   private boolean Dvpanel_panelfactabs_planificacion_Collapsed ;
   private boolean Dvpanel_panelfactabs_planificacion_Showcollapseicon ;
   private boolean Dvpanel_panelfactabs_planificacion_Autoscroll ;
   private boolean Dvpanel_paneltipomaquina_Autowidth ;
   private boolean Dvpanel_paneltipomaquina_Autoheight ;
   private boolean Dvpanel_paneltipomaquina_Collapsible ;
   private boolean Dvpanel_paneltipomaquina_Collapsed ;
   private boolean Dvpanel_paneltipomaquina_Showcollapseicon ;
   private boolean Dvpanel_paneltipomaquina_Autoscroll ;
   private boolean Dvpanel_panelobservaciones_Autowidth ;
   private boolean Dvpanel_panelobservaciones_Autoheight ;
   private boolean Dvpanel_panelobservaciones_Collapsible ;
   private boolean Dvpanel_panelobservaciones_Collapsed ;
   private boolean Dvpanel_panelobservaciones_Showcollapseicon ;
   private boolean Dvpanel_panelobservaciones_Autoscroll ;
   private boolean bGXsfl_379_Refreshing=false ;
   private boolean n621MaqUltFec ;
   private boolean n617MaqResDia ;
   private boolean n611MaqHorAsi ;
   private boolean n616MaqOrdSeq ;
   private boolean n4282MaqFormul ;
   private boolean n4319MaqPrdMin ;
   private boolean n4320MaqPrdMed ;
   private boolean n4321MaqPrdMax ;
   private boolean n6399MaqKgsId ;
   private boolean n6454MaqConFas ;
   private boolean n9626MaqObs ;
   private boolean n1026MaqHhCtr ;
   private boolean n3684MaqCosGen ;
   private boolean n13022MaqMtsMn ;
   private boolean n13023MaqMtsMx ;
   private boolean n407EmprNom ;
   private boolean n1012TipMaqDsc ;
   private boolean Combo_tipmaqcod_Enabled ;
   private boolean Combo_tipmaqcod_Visible ;
   private boolean Combo_tipmaqcod_Allowmultipleselection ;
   private boolean Combo_tipmaqcod_Isgriditem ;
   private boolean Combo_tipmaqcod_Hasdescription ;
   private boolean Combo_tipmaqcod_Includeonlyselectedoption ;
   private boolean Combo_tipmaqcod_Includeselectalloption ;
   private boolean Combo_tipmaqcod_Emptyitem ;
   private boolean Combo_tipmaqcod_Includeaddnewoption ;
   private boolean Combo_maqogtid_Enabled ;
   private boolean Combo_maqogtid_Visible ;
   private boolean Combo_maqogtid_Allowmultipleselection ;
   private boolean Combo_maqogtid_Isgriditem ;
   private boolean Combo_maqogtid_Hasdescription ;
   private boolean Combo_maqogtid_Includeonlyselectedoption ;
   private boolean Combo_maqogtid_Includeselectalloption ;
   private boolean Combo_maqogtid_Includeaddnewoption ;
   private boolean Dvpanel_paneldatos_Enabled ;
   private boolean Dvpanel_paneldatos_Showheader ;
   private boolean Dvpanel_paneldatos_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_panelcapacidades_Enabled ;
   private boolean Dvpanel_panelcapacidades_Showheader ;
   private boolean Dvpanel_panelcapacidades_Visible ;
   private boolean Dvpanel_panelcentralizacion_Enabled ;
   private boolean Dvpanel_panelcentralizacion_Showheader ;
   private boolean Dvpanel_panelcentralizacion_Visible ;
   private boolean Dvpanel_panelsalmuera_Enabled ;
   private boolean Dvpanel_panelsalmuera_Showheader ;
   private boolean Dvpanel_panelsalmuera_Visible ;
   private boolean Dvpanel_paneltiempos_Enabled ;
   private boolean Dvpanel_paneltiempos_Showheader ;
   private boolean Dvpanel_paneltiempos_Visible ;
   private boolean Dvpanel_panelfactabs_planificacion_Enabled ;
   private boolean Dvpanel_panelfactabs_planificacion_Showheader ;
   private boolean Dvpanel_panelfactabs_planificacion_Visible ;
   private boolean Dvpanel_paneltipomaquina_Enabled ;
   private boolean Dvpanel_paneltipomaquina_Showheader ;
   private boolean Dvpanel_paneltipomaquina_Visible ;
   private boolean Gxuitabspanel_tabs1_Enabled ;
   private boolean Gxuitabspanel_tabs1_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_panelobservaciones_Enabled ;
   private boolean Dvpanel_panelobservaciones_Showheader ;
   private boolean Dvpanel_panelobservaciones_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean n14288MaqDscLarg ;
   private boolean n600MaqCap ;
   private boolean n605MaqCosMin ;
   private boolean n13180MaqCosKg ;
   private boolean n13179MaqCosFijo ;
   private boolean n612MaqHorPro ;
   private boolean n615MaqMinPro ;
   private boolean n618MaqTemMax ;
   private boolean n3598MaqNroTub ;
   private boolean n11821MaqMOD ;
   private boolean n11822MaqMOI ;
   private boolean n11823MaqEnerg ;
   private boolean n11824MaqGas ;
   private boolean n11825MaqAgua ;
   private boolean n623MaqVolMax ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private boolean n3599MaqRelBan ;
   private boolean n4285MaqKgsMax ;
   private boolean n4284MaqKgsMed ;
   private boolean n4283MaqKgsMin ;
   private boolean n619MaqTinTip ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n3600MaqVolBal ;
   private boolean n2391MaqMicro ;
   private boolean n5593MaqTipCen ;
   private boolean n604MaqCodFor ;
   private boolean n14289MaqCuerdas ;
   private boolean n5420MaqSalMKi ;
   private boolean n5421MaqSalMKf ;
   private boolean n5950MaqDteCol ;
   private boolean n13020MaqTmCarg ;
   private boolean n13021MaqTmDcarg ;
   private boolean n6284MaqFacAbs ;
   private boolean n9982MaqFabsHm ;
   private boolean n5463MaqCantCor ;
   private boolean n1027MaqHhCon ;
   private boolean n8657MaqLoc ;
   private boolean n3601MaqTipMaq ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z9626MaqObs ;
   private String A9626MaqObs ;
   private String A13734MaqCDsc ;
   private String AV122ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV113WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipmaqcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_paneldatos ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqogtid ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelcapacidades ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelcentralizacion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelsalmuera ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_paneltiempos ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfactabs_planificacion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_paneltipomaquina ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelobservaciones ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMaqTip ;
   private HTMLChoice cmbMaqEst ;
   private HTMLChoice cmbMaqChp ;
   private HTMLChoice cmbMaqCodBan ;
   private HTMLChoice cmbMaqDosifP ;
   private HTMLChoice cmbMaqSalM ;
   private HTMLChoice cmbMaqPlnVis ;
   private HTMLChoice cmbMaqPln ;
   private HTMLChoice cmbMaqVaril ;
   private IDataStoreProvider pr_default ;
   private String[] T01OS6_A407EmprNom ;
   private boolean[] T01OS6_n407EmprNom ;
   private String[] T01OS7_A1012TipMaqDsc ;
   private boolean[] T01OS7_n1012TipMaqDsc ;
   private String[] T01OS8_A11727MaqOgtDsc ;
   private String[] T01OS9_A602MaqCod ;
   private boolean[] T01OS9_n602MaqCod ;
   private String[] T01OS9_A3601MaqTipMaq ;
   private boolean[] T01OS9_n3601MaqTipMaq ;
   private String[] T01OS9_A606MaqDsc ;
   private boolean[] T01OS9_n606MaqDsc ;
   private String[] T01OS9_A14288MaqDscLarg ;
   private boolean[] T01OS9_n14288MaqDscLarg ;
   private int[] T01OS9_A600MaqCap ;
   private boolean[] T01OS9_n600MaqCap ;
   private java.math.BigDecimal[] T01OS9_A605MaqCosMin ;
   private boolean[] T01OS9_n605MaqCosMin ;
   private byte[] T01OS9_A612MaqHorPro ;
   private boolean[] T01OS9_n612MaqHorPro ;
   private byte[] T01OS9_A615MaqMinPro ;
   private boolean[] T01OS9_n615MaqMinPro ;
   private String[] T01OS9_A620MaqTip ;
   private boolean[] T01OS9_n620MaqTip ;
   private String[] T01OS9_A607MaqEst ;
   private boolean[] T01OS9_n607MaqEst ;
   private String[] T01OS9_A407EmprNom ;
   private boolean[] T01OS9_n407EmprNom ;
   private String[] T01OS9_A621MaqUltFec ;
   private boolean[] T01OS9_n621MaqUltFec ;
   private java.math.BigDecimal[] T01OS9_A617MaqResDia ;
   private boolean[] T01OS9_n617MaqResDia ;
   private java.math.BigDecimal[] T01OS9_A611MaqHorAsi ;
   private boolean[] T01OS9_n611MaqHorAsi ;
   private short[] T01OS9_A616MaqOrdSeq ;
   private boolean[] T01OS9_n616MaqOrdSeq ;
   private byte[] T01OS9_A622MaqUltLin ;
   private boolean[] T01OS9_n622MaqUltLin ;
   private String[] T01OS9_A1012TipMaqDsc ;
   private boolean[] T01OS9_n1012TipMaqDsc ;
   private String[] T01OS9_A4282MaqFormul ;
   private boolean[] T01OS9_n4282MaqFormul ;
   private java.math.BigDecimal[] T01OS9_A4283MaqKgsMin ;
   private boolean[] T01OS9_n4283MaqKgsMin ;
   private java.math.BigDecimal[] T01OS9_A4284MaqKgsMed ;
   private boolean[] T01OS9_n4284MaqKgsMed ;
   private java.math.BigDecimal[] T01OS9_A4285MaqKgsMax ;
   private boolean[] T01OS9_n4285MaqKgsMax ;
   private short[] T01OS9_A4319MaqPrdMin ;
   private boolean[] T01OS9_n4319MaqPrdMin ;
   private short[] T01OS9_A4320MaqPrdMed ;
   private boolean[] T01OS9_n4320MaqPrdMed ;
   private short[] T01OS9_A4321MaqPrdMax ;
   private boolean[] T01OS9_n4321MaqPrdMax ;
   private int[] T01OS9_A623MaqVolMax ;
   private boolean[] T01OS9_n623MaqVolMax ;
   private int[] T01OS9_A625MaqVolMin ;
   private boolean[] T01OS9_n625MaqVolMin ;
   private int[] T01OS9_A624MaqVolMed ;
   private boolean[] T01OS9_n624MaqVolMed ;
   private int[] T01OS9_A2801MaqVolRes ;
   private boolean[] T01OS9_n2801MaqVolRes ;
   private int[] T01OS9_A2802MaqVolTop ;
   private boolean[] T01OS9_n2802MaqVolTop ;
   private short[] T01OS9_A618MaqTemMax ;
   private boolean[] T01OS9_n618MaqTemMax ;
   private String[] T01OS9_A601MaqChp ;
   private boolean[] T01OS9_n601MaqChp ;
   private String[] T01OS9_A619MaqTinTip ;
   private boolean[] T01OS9_n619MaqTinTip ;
   private byte[] T01OS9_A2391MaqMicro ;
   private boolean[] T01OS9_n2391MaqMicro ;
   private byte[] T01OS9_A3598MaqNroTub ;
   private boolean[] T01OS9_n3598MaqNroTub ;
   private String[] T01OS9_A5292MaqCodBan ;
   private boolean[] T01OS9_n5292MaqCodBan ;
   private String[] T01OS9_A5419MaqSalM ;
   private boolean[] T01OS9_n5419MaqSalM ;
   private java.math.BigDecimal[] T01OS9_A5420MaqSalMKi ;
   private boolean[] T01OS9_n5420MaqSalMKi ;
   private java.math.BigDecimal[] T01OS9_A5421MaqSalMKf ;
   private boolean[] T01OS9_n5421MaqSalMKf ;
   private java.math.BigDecimal[] T01OS9_A5463MaqCantCor ;
   private boolean[] T01OS9_n5463MaqCantCor ;
   private String[] T01OS9_A5593MaqTipCen ;
   private boolean[] T01OS9_n5593MaqTipCen ;
   private String[] T01OS9_A5949MaqDosifP ;
   private boolean[] T01OS9_n5949MaqDosifP ;
   private int[] T01OS9_A5950MaqDteCol ;
   private boolean[] T01OS9_n5950MaqDteCol ;
   private String[] T01OS9_A604MaqCodFor ;
   private boolean[] T01OS9_n604MaqCodFor ;
   private java.math.BigDecimal[] T01OS9_A6284MaqFacAbs ;
   private boolean[] T01OS9_n6284MaqFacAbs ;
   private java.math.BigDecimal[] T01OS9_A6399MaqKgsId ;
   private boolean[] T01OS9_n6399MaqKgsId ;
   private byte[] T01OS9_A6432MaqPln ;
   private boolean[] T01OS9_n6432MaqPln ;
   private byte[] T01OS9_A6433MaqPlnVis ;
   private boolean[] T01OS9_n6433MaqPlnVis ;
   private int[] T01OS9_A6454MaqConFas ;
   private boolean[] T01OS9_n6454MaqConFas ;
   private String[] T01OS9_A8056MaqVaril ;
   private boolean[] T01OS9_n8056MaqVaril ;
   private byte[] T01OS9_A3599MaqRelBan ;
   private boolean[] T01OS9_n3599MaqRelBan ;
   private String[] T01OS9_A8657MaqLoc ;
   private boolean[] T01OS9_n8657MaqLoc ;
   private String[] T01OS9_A9626MaqObs ;
   private boolean[] T01OS9_n9626MaqObs ;
   private java.math.BigDecimal[] T01OS9_A9982MaqFabsHm ;
   private boolean[] T01OS9_n9982MaqFabsHm ;
   private java.math.BigDecimal[] T01OS9_A1027MaqHhCon ;
   private boolean[] T01OS9_n1027MaqHhCon ;
   private String[] T01OS9_A1026MaqHhCtr ;
   private boolean[] T01OS9_n1026MaqHhCtr ;
   private int[] T01OS9_A3600MaqVolBal ;
   private boolean[] T01OS9_n3600MaqVolBal ;
   private java.math.BigDecimal[] T01OS9_A3684MaqCosGen ;
   private boolean[] T01OS9_n3684MaqCosGen ;
   private String[] T01OS9_A11727MaqOgtDsc ;
   private java.math.BigDecimal[] T01OS9_A11821MaqMOD ;
   private boolean[] T01OS9_n11821MaqMOD ;
   private java.math.BigDecimal[] T01OS9_A11822MaqMOI ;
   private boolean[] T01OS9_n11822MaqMOI ;
   private java.math.BigDecimal[] T01OS9_A11823MaqEnerg ;
   private boolean[] T01OS9_n11823MaqEnerg ;
   private java.math.BigDecimal[] T01OS9_A11824MaqGas ;
   private boolean[] T01OS9_n11824MaqGas ;
   private java.math.BigDecimal[] T01OS9_A11825MaqAgua ;
   private boolean[] T01OS9_n11825MaqAgua ;
   private short[] T01OS9_A13020MaqTmCarg ;
   private boolean[] T01OS9_n13020MaqTmCarg ;
   private short[] T01OS9_A13021MaqTmDcarg ;
   private boolean[] T01OS9_n13021MaqTmDcarg ;
   private java.math.BigDecimal[] T01OS9_A13022MaqMtsMn ;
   private boolean[] T01OS9_n13022MaqMtsMn ;
   private java.math.BigDecimal[] T01OS9_A13023MaqMtsMx ;
   private boolean[] T01OS9_n13023MaqMtsMx ;
   private java.math.BigDecimal[] T01OS9_A13179MaqCosFijo ;
   private boolean[] T01OS9_n13179MaqCosFijo ;
   private java.math.BigDecimal[] T01OS9_A13180MaqCosKg ;
   private boolean[] T01OS9_n13180MaqCosKg ;
   private short[] T01OS9_A14289MaqCuerdas ;
   private boolean[] T01OS9_n14289MaqCuerdas ;
   private String[] T01OS9_A396EmprCod ;
   private String[] T01OS9_A1011TipMaqCod ;
   private boolean[] T01OS9_n1011TipMaqCod ;
   private String[] T01OS9_A11726MaqOgtId ;
   private boolean[] T01OS9_n11726MaqOgtId ;
   private String[] T01OS10_A1012TipMaqDsc ;
   private boolean[] T01OS10_n1012TipMaqDsc ;
   private String[] T01OS11_A11727MaqOgtDsc ;
   private String[] T01OS12_A396EmprCod ;
   private String[] T01OS12_A602MaqCod ;
   private boolean[] T01OS12_n602MaqCod ;
   private String[] T01OS5_A602MaqCod ;
   private boolean[] T01OS5_n602MaqCod ;
   private String[] T01OS5_A3601MaqTipMaq ;
   private boolean[] T01OS5_n3601MaqTipMaq ;
   private String[] T01OS5_A606MaqDsc ;
   private boolean[] T01OS5_n606MaqDsc ;
   private String[] T01OS5_A14288MaqDscLarg ;
   private boolean[] T01OS5_n14288MaqDscLarg ;
   private int[] T01OS5_A600MaqCap ;
   private boolean[] T01OS5_n600MaqCap ;
   private java.math.BigDecimal[] T01OS5_A605MaqCosMin ;
   private boolean[] T01OS5_n605MaqCosMin ;
   private byte[] T01OS5_A612MaqHorPro ;
   private boolean[] T01OS5_n612MaqHorPro ;
   private byte[] T01OS5_A615MaqMinPro ;
   private boolean[] T01OS5_n615MaqMinPro ;
   private String[] T01OS5_A620MaqTip ;
   private boolean[] T01OS5_n620MaqTip ;
   private String[] T01OS5_A607MaqEst ;
   private boolean[] T01OS5_n607MaqEst ;
   private String[] T01OS5_A621MaqUltFec ;
   private boolean[] T01OS5_n621MaqUltFec ;
   private java.math.BigDecimal[] T01OS5_A617MaqResDia ;
   private boolean[] T01OS5_n617MaqResDia ;
   private java.math.BigDecimal[] T01OS5_A611MaqHorAsi ;
   private boolean[] T01OS5_n611MaqHorAsi ;
   private short[] T01OS5_A616MaqOrdSeq ;
   private boolean[] T01OS5_n616MaqOrdSeq ;
   private byte[] T01OS5_A622MaqUltLin ;
   private boolean[] T01OS5_n622MaqUltLin ;
   private String[] T01OS5_A4282MaqFormul ;
   private boolean[] T01OS5_n4282MaqFormul ;
   private java.math.BigDecimal[] T01OS5_A4283MaqKgsMin ;
   private boolean[] T01OS5_n4283MaqKgsMin ;
   private java.math.BigDecimal[] T01OS5_A4284MaqKgsMed ;
   private boolean[] T01OS5_n4284MaqKgsMed ;
   private java.math.BigDecimal[] T01OS5_A4285MaqKgsMax ;
   private boolean[] T01OS5_n4285MaqKgsMax ;
   private short[] T01OS5_A4319MaqPrdMin ;
   private boolean[] T01OS5_n4319MaqPrdMin ;
   private short[] T01OS5_A4320MaqPrdMed ;
   private boolean[] T01OS5_n4320MaqPrdMed ;
   private short[] T01OS5_A4321MaqPrdMax ;
   private boolean[] T01OS5_n4321MaqPrdMax ;
   private int[] T01OS5_A623MaqVolMax ;
   private boolean[] T01OS5_n623MaqVolMax ;
   private int[] T01OS5_A625MaqVolMin ;
   private boolean[] T01OS5_n625MaqVolMin ;
   private int[] T01OS5_A624MaqVolMed ;
   private boolean[] T01OS5_n624MaqVolMed ;
   private int[] T01OS5_A2801MaqVolRes ;
   private boolean[] T01OS5_n2801MaqVolRes ;
   private int[] T01OS5_A2802MaqVolTop ;
   private boolean[] T01OS5_n2802MaqVolTop ;
   private short[] T01OS5_A618MaqTemMax ;
   private boolean[] T01OS5_n618MaqTemMax ;
   private String[] T01OS5_A601MaqChp ;
   private boolean[] T01OS5_n601MaqChp ;
   private String[] T01OS5_A619MaqTinTip ;
   private boolean[] T01OS5_n619MaqTinTip ;
   private byte[] T01OS5_A2391MaqMicro ;
   private boolean[] T01OS5_n2391MaqMicro ;
   private byte[] T01OS5_A3598MaqNroTub ;
   private boolean[] T01OS5_n3598MaqNroTub ;
   private String[] T01OS5_A5292MaqCodBan ;
   private boolean[] T01OS5_n5292MaqCodBan ;
   private String[] T01OS5_A5419MaqSalM ;
   private boolean[] T01OS5_n5419MaqSalM ;
   private java.math.BigDecimal[] T01OS5_A5420MaqSalMKi ;
   private boolean[] T01OS5_n5420MaqSalMKi ;
   private java.math.BigDecimal[] T01OS5_A5421MaqSalMKf ;
   private boolean[] T01OS5_n5421MaqSalMKf ;
   private java.math.BigDecimal[] T01OS5_A5463MaqCantCor ;
   private boolean[] T01OS5_n5463MaqCantCor ;
   private String[] T01OS5_A5593MaqTipCen ;
   private boolean[] T01OS5_n5593MaqTipCen ;
   private String[] T01OS5_A5949MaqDosifP ;
   private boolean[] T01OS5_n5949MaqDosifP ;
   private int[] T01OS5_A5950MaqDteCol ;
   private boolean[] T01OS5_n5950MaqDteCol ;
   private String[] T01OS5_A604MaqCodFor ;
   private boolean[] T01OS5_n604MaqCodFor ;
   private java.math.BigDecimal[] T01OS5_A6284MaqFacAbs ;
   private boolean[] T01OS5_n6284MaqFacAbs ;
   private java.math.BigDecimal[] T01OS5_A6399MaqKgsId ;
   private boolean[] T01OS5_n6399MaqKgsId ;
   private byte[] T01OS5_A6432MaqPln ;
   private boolean[] T01OS5_n6432MaqPln ;
   private byte[] T01OS5_A6433MaqPlnVis ;
   private boolean[] T01OS5_n6433MaqPlnVis ;
   private int[] T01OS5_A6454MaqConFas ;
   private boolean[] T01OS5_n6454MaqConFas ;
   private String[] T01OS5_A8056MaqVaril ;
   private boolean[] T01OS5_n8056MaqVaril ;
   private byte[] T01OS5_A3599MaqRelBan ;
   private boolean[] T01OS5_n3599MaqRelBan ;
   private String[] T01OS5_A8657MaqLoc ;
   private boolean[] T01OS5_n8657MaqLoc ;
   private String[] T01OS5_A9626MaqObs ;
   private boolean[] T01OS5_n9626MaqObs ;
   private java.math.BigDecimal[] T01OS5_A9982MaqFabsHm ;
   private boolean[] T01OS5_n9982MaqFabsHm ;
   private java.math.BigDecimal[] T01OS5_A1027MaqHhCon ;
   private boolean[] T01OS5_n1027MaqHhCon ;
   private String[] T01OS5_A1026MaqHhCtr ;
   private boolean[] T01OS5_n1026MaqHhCtr ;
   private int[] T01OS5_A3600MaqVolBal ;
   private boolean[] T01OS5_n3600MaqVolBal ;
   private java.math.BigDecimal[] T01OS5_A3684MaqCosGen ;
   private boolean[] T01OS5_n3684MaqCosGen ;
   private java.math.BigDecimal[] T01OS5_A11821MaqMOD ;
   private boolean[] T01OS5_n11821MaqMOD ;
   private java.math.BigDecimal[] T01OS5_A11822MaqMOI ;
   private boolean[] T01OS5_n11822MaqMOI ;
   private java.math.BigDecimal[] T01OS5_A11823MaqEnerg ;
   private boolean[] T01OS5_n11823MaqEnerg ;
   private java.math.BigDecimal[] T01OS5_A11824MaqGas ;
   private boolean[] T01OS5_n11824MaqGas ;
   private java.math.BigDecimal[] T01OS5_A11825MaqAgua ;
   private boolean[] T01OS5_n11825MaqAgua ;
   private short[] T01OS5_A13020MaqTmCarg ;
   private boolean[] T01OS5_n13020MaqTmCarg ;
   private short[] T01OS5_A13021MaqTmDcarg ;
   private boolean[] T01OS5_n13021MaqTmDcarg ;
   private java.math.BigDecimal[] T01OS5_A13022MaqMtsMn ;
   private boolean[] T01OS5_n13022MaqMtsMn ;
   private java.math.BigDecimal[] T01OS5_A13023MaqMtsMx ;
   private boolean[] T01OS5_n13023MaqMtsMx ;
   private java.math.BigDecimal[] T01OS5_A13179MaqCosFijo ;
   private boolean[] T01OS5_n13179MaqCosFijo ;
   private java.math.BigDecimal[] T01OS5_A13180MaqCosKg ;
   private boolean[] T01OS5_n13180MaqCosKg ;
   private short[] T01OS5_A14289MaqCuerdas ;
   private boolean[] T01OS5_n14289MaqCuerdas ;
   private String[] T01OS5_A396EmprCod ;
   private String[] T01OS5_A1011TipMaqCod ;
   private boolean[] T01OS5_n1011TipMaqCod ;
   private String[] T01OS5_A11726MaqOgtId ;
   private boolean[] T01OS5_n11726MaqOgtId ;
   private String[] T01OS13_A396EmprCod ;
   private String[] T01OS13_A602MaqCod ;
   private boolean[] T01OS13_n602MaqCod ;
   private String[] T01OS14_A396EmprCod ;
   private String[] T01OS14_A602MaqCod ;
   private boolean[] T01OS14_n602MaqCod ;
   private String[] T01OS4_A602MaqCod ;
   private boolean[] T01OS4_n602MaqCod ;
   private String[] T01OS4_A3601MaqTipMaq ;
   private boolean[] T01OS4_n3601MaqTipMaq ;
   private String[] T01OS4_A606MaqDsc ;
   private boolean[] T01OS4_n606MaqDsc ;
   private String[] T01OS4_A14288MaqDscLarg ;
   private boolean[] T01OS4_n14288MaqDscLarg ;
   private int[] T01OS4_A600MaqCap ;
   private boolean[] T01OS4_n600MaqCap ;
   private java.math.BigDecimal[] T01OS4_A605MaqCosMin ;
   private boolean[] T01OS4_n605MaqCosMin ;
   private byte[] T01OS4_A612MaqHorPro ;
   private boolean[] T01OS4_n612MaqHorPro ;
   private byte[] T01OS4_A615MaqMinPro ;
   private boolean[] T01OS4_n615MaqMinPro ;
   private String[] T01OS4_A620MaqTip ;
   private boolean[] T01OS4_n620MaqTip ;
   private String[] T01OS4_A607MaqEst ;
   private boolean[] T01OS4_n607MaqEst ;
   private String[] T01OS4_A621MaqUltFec ;
   private boolean[] T01OS4_n621MaqUltFec ;
   private java.math.BigDecimal[] T01OS4_A617MaqResDia ;
   private boolean[] T01OS4_n617MaqResDia ;
   private java.math.BigDecimal[] T01OS4_A611MaqHorAsi ;
   private boolean[] T01OS4_n611MaqHorAsi ;
   private short[] T01OS4_A616MaqOrdSeq ;
   private boolean[] T01OS4_n616MaqOrdSeq ;
   private byte[] T01OS4_A622MaqUltLin ;
   private boolean[] T01OS4_n622MaqUltLin ;
   private String[] T01OS4_A4282MaqFormul ;
   private boolean[] T01OS4_n4282MaqFormul ;
   private java.math.BigDecimal[] T01OS4_A4283MaqKgsMin ;
   private boolean[] T01OS4_n4283MaqKgsMin ;
   private java.math.BigDecimal[] T01OS4_A4284MaqKgsMed ;
   private boolean[] T01OS4_n4284MaqKgsMed ;
   private java.math.BigDecimal[] T01OS4_A4285MaqKgsMax ;
   private boolean[] T01OS4_n4285MaqKgsMax ;
   private short[] T01OS4_A4319MaqPrdMin ;
   private boolean[] T01OS4_n4319MaqPrdMin ;
   private short[] T01OS4_A4320MaqPrdMed ;
   private boolean[] T01OS4_n4320MaqPrdMed ;
   private short[] T01OS4_A4321MaqPrdMax ;
   private boolean[] T01OS4_n4321MaqPrdMax ;
   private int[] T01OS4_A623MaqVolMax ;
   private boolean[] T01OS4_n623MaqVolMax ;
   private int[] T01OS4_A625MaqVolMin ;
   private boolean[] T01OS4_n625MaqVolMin ;
   private int[] T01OS4_A624MaqVolMed ;
   private boolean[] T01OS4_n624MaqVolMed ;
   private int[] T01OS4_A2801MaqVolRes ;
   private boolean[] T01OS4_n2801MaqVolRes ;
   private int[] T01OS4_A2802MaqVolTop ;
   private boolean[] T01OS4_n2802MaqVolTop ;
   private short[] T01OS4_A618MaqTemMax ;
   private boolean[] T01OS4_n618MaqTemMax ;
   private String[] T01OS4_A601MaqChp ;
   private boolean[] T01OS4_n601MaqChp ;
   private String[] T01OS4_A619MaqTinTip ;
   private boolean[] T01OS4_n619MaqTinTip ;
   private byte[] T01OS4_A2391MaqMicro ;
   private boolean[] T01OS4_n2391MaqMicro ;
   private byte[] T01OS4_A3598MaqNroTub ;
   private boolean[] T01OS4_n3598MaqNroTub ;
   private String[] T01OS4_A5292MaqCodBan ;
   private boolean[] T01OS4_n5292MaqCodBan ;
   private String[] T01OS4_A5419MaqSalM ;
   private boolean[] T01OS4_n5419MaqSalM ;
   private java.math.BigDecimal[] T01OS4_A5420MaqSalMKi ;
   private boolean[] T01OS4_n5420MaqSalMKi ;
   private java.math.BigDecimal[] T01OS4_A5421MaqSalMKf ;
   private boolean[] T01OS4_n5421MaqSalMKf ;
   private java.math.BigDecimal[] T01OS4_A5463MaqCantCor ;
   private boolean[] T01OS4_n5463MaqCantCor ;
   private String[] T01OS4_A5593MaqTipCen ;
   private boolean[] T01OS4_n5593MaqTipCen ;
   private String[] T01OS4_A5949MaqDosifP ;
   private boolean[] T01OS4_n5949MaqDosifP ;
   private int[] T01OS4_A5950MaqDteCol ;
   private boolean[] T01OS4_n5950MaqDteCol ;
   private String[] T01OS4_A604MaqCodFor ;
   private boolean[] T01OS4_n604MaqCodFor ;
   private java.math.BigDecimal[] T01OS4_A6284MaqFacAbs ;
   private boolean[] T01OS4_n6284MaqFacAbs ;
   private java.math.BigDecimal[] T01OS4_A6399MaqKgsId ;
   private boolean[] T01OS4_n6399MaqKgsId ;
   private byte[] T01OS4_A6432MaqPln ;
   private boolean[] T01OS4_n6432MaqPln ;
   private byte[] T01OS4_A6433MaqPlnVis ;
   private boolean[] T01OS4_n6433MaqPlnVis ;
   private int[] T01OS4_A6454MaqConFas ;
   private boolean[] T01OS4_n6454MaqConFas ;
   private String[] T01OS4_A8056MaqVaril ;
   private boolean[] T01OS4_n8056MaqVaril ;
   private byte[] T01OS4_A3599MaqRelBan ;
   private boolean[] T01OS4_n3599MaqRelBan ;
   private String[] T01OS4_A8657MaqLoc ;
   private boolean[] T01OS4_n8657MaqLoc ;
   private String[] T01OS4_A9626MaqObs ;
   private boolean[] T01OS4_n9626MaqObs ;
   private java.math.BigDecimal[] T01OS4_A9982MaqFabsHm ;
   private boolean[] T01OS4_n9982MaqFabsHm ;
   private java.math.BigDecimal[] T01OS4_A1027MaqHhCon ;
   private boolean[] T01OS4_n1027MaqHhCon ;
   private String[] T01OS4_A1026MaqHhCtr ;
   private boolean[] T01OS4_n1026MaqHhCtr ;
   private int[] T01OS4_A3600MaqVolBal ;
   private boolean[] T01OS4_n3600MaqVolBal ;
   private java.math.BigDecimal[] T01OS4_A3684MaqCosGen ;
   private boolean[] T01OS4_n3684MaqCosGen ;
   private java.math.BigDecimal[] T01OS4_A11821MaqMOD ;
   private boolean[] T01OS4_n11821MaqMOD ;
   private java.math.BigDecimal[] T01OS4_A11822MaqMOI ;
   private boolean[] T01OS4_n11822MaqMOI ;
   private java.math.BigDecimal[] T01OS4_A11823MaqEnerg ;
   private boolean[] T01OS4_n11823MaqEnerg ;
   private java.math.BigDecimal[] T01OS4_A11824MaqGas ;
   private boolean[] T01OS4_n11824MaqGas ;
   private java.math.BigDecimal[] T01OS4_A11825MaqAgua ;
   private boolean[] T01OS4_n11825MaqAgua ;
   private short[] T01OS4_A13020MaqTmCarg ;
   private boolean[] T01OS4_n13020MaqTmCarg ;
   private short[] T01OS4_A13021MaqTmDcarg ;
   private boolean[] T01OS4_n13021MaqTmDcarg ;
   private java.math.BigDecimal[] T01OS4_A13022MaqMtsMn ;
   private boolean[] T01OS4_n13022MaqMtsMn ;
   private java.math.BigDecimal[] T01OS4_A13023MaqMtsMx ;
   private boolean[] T01OS4_n13023MaqMtsMx ;
   private java.math.BigDecimal[] T01OS4_A13179MaqCosFijo ;
   private boolean[] T01OS4_n13179MaqCosFijo ;
   private java.math.BigDecimal[] T01OS4_A13180MaqCosKg ;
   private boolean[] T01OS4_n13180MaqCosKg ;
   private short[] T01OS4_A14289MaqCuerdas ;
   private boolean[] T01OS4_n14289MaqCuerdas ;
   private String[] T01OS4_A396EmprCod ;
   private String[] T01OS4_A1011TipMaqCod ;
   private boolean[] T01OS4_n1011TipMaqCod ;
   private String[] T01OS4_A11726MaqOgtId ;
   private boolean[] T01OS4_n11726MaqOgtId ;
   private String[] T01OS18_A1012TipMaqDsc ;
   private boolean[] T01OS18_n1012TipMaqDsc ;
   private String[] T01OS19_A11727MaqOgtDsc ;
   private String[] T01OS20_A396EmprCod ;
   private String[] T01OS20_A602MaqCod ;
   private boolean[] T01OS20_n602MaqCod ;
   private short[] T01OS20_A14529MqCAnyo ;
   private byte[] T01OS20_A14530MqCMes ;
   private String[] T01OS21_A396EmprCod ;
   private int[] T01OS21_A129BarCod ;
   private byte[] T01OS21_A132BarCodReo ;
   private String[] T01OS21_A130BarCodPar ;
   private short[] T01OS21_A14152MEnvOrd ;
   private String[] T01OS22_A396EmprCod ;
   private int[] T01OS22_A13604RARID ;
   private String[] T01OS22_A602MaqCod ;
   private boolean[] T01OS22_n602MaqCod ;
   private String[] T01OS23_A396EmprCod ;
   private String[] T01OS23_A602MaqCod ;
   private boolean[] T01OS23_n602MaqCod ;
   private int[] T01OS23_A13193MaqHdr ;
   private byte[] T01OS23_A13194MaqHdrR ;
   private String[] T01OS23_A13195MaqHdrP ;
   private short[] T01OS23_A13196MaqRecLinM ;
   private String[] T01OS24_A396EmprCod ;
   private int[] T01OS24_A13137NCHdr ;
   private byte[] T01OS24_A13138NCHdrr ;
   private String[] T01OS24_A13139NCHdrp ;
   private String[] T01OS25_A396EmprCod ;
   private int[] T01OS25_A12673LavMqId ;
   private String[] T01OS26_A396EmprCod ;
   private String[] T01OS26_A602MaqCod ;
   private boolean[] T01OS26_n602MaqCod ;
   private short[] T01OS26_A12444MaqAnyNP ;
   private byte[] T01OS26_A12445MaqMesNP ;
   private String[] T01OS27_A396EmprCod ;
   private String[] T01OS27_A602MaqCod ;
   private boolean[] T01OS27_n602MaqCod ;
   private short[] T01OS27_A12434MaqAnyM ;
   private byte[] T01OS27_A12435MaqMesM ;
   private String[] T01OS28_A396EmprCod ;
   private java.util.Date[] T01OS28_A4929Inc_Dia ;
   private short[] T01OS28_A5728JBCLLin ;
   private String[] T01OS29_A396EmprCod ;
   private int[] T01OS29_A11604PArtId ;
   private String[] T01OS30_A396EmprCod ;
   private String[] T01OS30_A602MaqCod ;
   private boolean[] T01OS30_n602MaqCod ;
   private java.util.Date[] T01OS30_A11445MaqFch ;
   private String[] T01OS31_A396EmprCod ;
   private String[] T01OS31_A602MaqCod ;
   private boolean[] T01OS31_n602MaqCod ;
   private String[] T01OS31_A11438MaqEquCod ;
   private String[] T01OS31_A11439MaqSEqCod ;
   private String[] T01OS31_A11440MaqPieCod ;
   private String[] T01OS32_A396EmprCod ;
   private String[] T01OS32_A602MaqCod ;
   private boolean[] T01OS32_n602MaqCod ;
   private short[] T01OS32_A11432MaqDocId ;
   private String[] T01OS33_A396EmprCod ;
   private String[] T01OS33_A602MaqCod ;
   private boolean[] T01OS33_n602MaqCod ;
   private java.util.Date[] T01OS33_A10111Mq_Dia ;
   private int[] T01OS33_A10112Mq_Op ;
   private String[] T01OS34_A396EmprCod ;
   private int[] T01OS34_A252CliCod ;
   private String[] T01OS34_A65ArtCod ;
   private String[] T01OS34_A10041ArtSH ;
   private String[] T01OS34_A10042ArtMqFa ;
   private String[] T01OS35_A396EmprCod ;
   private String[] T01OS35_A602MaqCod ;
   private boolean[] T01OS35_n602MaqCod ;
   private java.util.Date[] T01OS35_A74MaqTMuIni ;
   private String[] T01OS36_A396EmprCod ;
   private String[] T01OS36_A602MaqCod ;
   private boolean[] T01OS36_n602MaqCod ;
   private String[] T01OS36_A9725MaqFabC ;
   private String[] T01OS37_A396EmprCod ;
   private int[] T01OS37_A9428SMCod ;
   private String[] T01OS38_A396EmprCod ;
   private int[] T01OS38_A9429PMCod ;
   private String[] T01OS39_A396EmprCod ;
   private int[] T01OS39_A9425OMCod ;
   private String[] T01OS40_A396EmprCod ;
   private String[] T01OS40_A602MaqCod ;
   private boolean[] T01OS40_n602MaqCod ;
   private String[] T01OS40_A8008Maq_Prg ;
   private String[] T01OS41_A396EmprCod ;
   private String[] T01OS41_A602MaqCod ;
   private boolean[] T01OS41_n602MaqCod ;
   private String[] T01OS41_A6874CPROCORIG ;
   private String[] T01OS42_A396EmprCod ;
   private int[] T01OS42_A6319C_Barcod ;
   private byte[] T01OS42_A6320C_Barcodre ;
   private String[] T01OS42_A6321C_Barcodpa ;
   private short[] T01OS42_A6322C_Reclinma ;
   private String[] T01OS43_A396EmprCod ;
   private String[] T01OS43_A602MaqCod ;
   private boolean[] T01OS43_n602MaqCod ;
   private byte[] T01OS43_A6260MaqTqn ;
   private String[] T01OS44_A396EmprCod ;
   private short[] T01OS44_A6188MaqTArt ;
   private String[] T01OS44_A602MaqCod ;
   private boolean[] T01OS44_n602MaqCod ;
   private String[] T01OS45_A396EmprCod ;
   private String[] T01OS45_A602MaqCod ;
   private boolean[] T01OS45_n602MaqCod ;
   private int[] T01OS45_A6078MaqCliCod ;
   private String[] T01OS45_A6079MaqArtCod ;
   private String[] T01OS46_A396EmprCod ;
   private byte[] T01OS46_A6037Mq_Grupo ;
   private String[] T01OS46_A602MaqCod ;
   private boolean[] T01OS46_n602MaqCod ;
   private String[] T01OS47_A396EmprCod ;
   private String[] T01OS47_A6000CRCod ;
   private short[] T01OS47_A6005CRLin ;
   private String[] T01OS48_A396EmprCod ;
   private String[] T01OS48_A602MaqCod ;
   private boolean[] T01OS48_n602MaqCod ;
   private short[] T01OS48_A5879PlaMTAOrd ;
   private String[] T01OS49_A396EmprCod ;
   private String[] T01OS49_A5603PrdNumM ;
   private String[] T01OS49_A602MaqCod ;
   private boolean[] T01OS49_n602MaqCod ;
   private String[] T01OS50_A396EmprCod ;
   private String[] T01OS50_A602MaqCod ;
   private boolean[] T01OS50_n602MaqCod ;
   private String[] T01OS50_A5525MaqPrdNum ;
   private String[] T01OS51_A396EmprCod ;
   private String[] T01OS51_A764ProForCod ;
   private short[] T01OS51_A5191ProForLC ;
   private String[] T01OS52_A396EmprCod ;
   private short[] T01OS52_A4686MaqTipArt ;
   private String[] T01OS52_A602MaqCod ;
   private boolean[] T01OS52_n602MaqCod ;
   private String[] T01OS53_A396EmprCod ;
   private byte[] T01OS53_A3331LanBroCod ;
   private short[] T01OS53_A3333LanBroLin ;
   private String[] T01OS54_A396EmprCod ;
   private String[] T01OS54_A602MaqCod ;
   private boolean[] T01OS54_n602MaqCod ;
   private String[] T01OS54_A3047LOParId ;
   private String[] T01OS55_A396EmprCod ;
   private int[] T01OS55_A129BarCod ;
   private byte[] T01OS55_A132BarCodReo ;
   private String[] T01OS55_A130BarCodPar ;
   private short[] T01OS55_A2804RecLinMaq ;
   private String[] T01OS56_A396EmprCod ;
   private String[] T01OS56_A602MaqCod ;
   private boolean[] T01OS56_n602MaqCod ;
   private java.util.Date[] T01OS56_A2461PlaFecTin ;
   private String[] T01OS57_A396EmprCod ;
   private String[] T01OS57_A602MaqCod ;
   private boolean[] T01OS57_n602MaqCod ;
   private short[] T01OS57_A2019MaqMadLin ;
   private String[] T01OS58_A396EmprCod ;
   private String[] T01OS58_A602MaqCod ;
   private boolean[] T01OS58_n602MaqCod ;
   private short[] T01OS58_A2014MaqConLin ;
   private String[] T01OS59_A396EmprCod ;
   private String[] T01OS59_A1621CosTermCod ;
   private int[] T01OS59_A1615CosLin ;
   private String[] T01OS60_A396EmprCod ;
   private String[] T01OS60_A602MaqCod ;
   private boolean[] T01OS60_n602MaqCod ;
   private String[] T01OS60_A1142MaqFCod ;
   private String[] T01OS61_A396EmprCod ;
   private String[] T01OS61_A602MaqCod ;
   private boolean[] T01OS61_n602MaqCod ;
   private byte[] T01OS61_A634MhiMes ;
   private short[] T01OS61_A632MhiAny ;
   private String[] T01OS62_A396EmprCod ;
   private String[] T01OS62_A602MaqCod ;
   private boolean[] T01OS62_n602MaqCod ;
   private short[] T01OS62_A599MaqAny ;
   private byte[] T01OS62_A614MaqMes ;
   private String[] T01OS63_A396EmprCod ;
   private int[] T01OS63_A539HisBarCod ;
   private byte[] T01OS63_A545HisCodReo ;
   private String[] T01OS63_A544HisCodPar ;
   private short[] T01OS63_A833TipDefCod ;
   private String[] T01OS64_A396EmprCod ;
   private String[] T01OS64_A602MaqCod ;
   private boolean[] T01OS64_n602MaqCod ;
   private java.util.Date[] T01OS64_A558HisProFec ;
   private String[] T01OS65_A396EmprCod ;
   private String[] T01OS65_A501GruMaqCod ;
   private String[] T01OS65_A602MaqCod ;
   private boolean[] T01OS65_n602MaqCod ;
   private String[] T01OS66_A396EmprCod ;
   private String[] T01OS66_A457FasCod ;
   private String[] T01OS67_A396EmprCod ;
   private int[] T01OS67_A361DisCod ;
   private String[] T01OS68_A396EmprCod ;
   private int[] T01OS68_A129BarCod ;
   private byte[] T01OS68_A132BarCodReo ;
   private String[] T01OS68_A130BarCodPar ;
   private String[] T01OS68_A758ProCod ;
   private short[] T01OS68_A194BarOrdLin ;
   private String[] T01OS70_A396EmprCod ;
   private String[] T01OS70_A602MaqCod ;
   private boolean[] T01OS70_n602MaqCod ;
   private String[] T01OS71_A396EmprCod ;
   private String[] T01OS71_A602MaqCod ;
   private boolean[] T01OS71_n602MaqCod ;
   private byte[] T01OS71_A320DesTecLin ;
   private String[] T01OS71_A613MaqLinTex ;
   private String[] T01OS72_A396EmprCod ;
   private String[] T01OS72_A602MaqCod ;
   private boolean[] T01OS72_n602MaqCod ;
   private byte[] T01OS72_A320DesTecLin ;
   private String[] T01OS3_A396EmprCod ;
   private String[] T01OS3_A602MaqCod ;
   private boolean[] T01OS3_n602MaqCod ;
   private byte[] T01OS3_A320DesTecLin ;
   private String[] T01OS3_A613MaqLinTex ;
   private String[] T01OS2_A396EmprCod ;
   private String[] T01OS2_A602MaqCod ;
   private boolean[] T01OS2_n602MaqCod ;
   private byte[] T01OS2_A320DesTecLin ;
   private String[] T01OS2_A613MaqLinTex ;
   private String[] T01OS76_A396EmprCod ;
   private String[] T01OS76_A602MaqCod ;
   private boolean[] T01OS76_n602MaqCod ;
   private byte[] T01OS76_A320DesTecLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV121TipMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV124MaqOgtId_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV112TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV117TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV111WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class tmaqui1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqui1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqui1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqui1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqui1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OS2", "SELECT EmprCod, MaqCod, DesTecLin, MaqLinTex FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ? AND DesTecLin = ?  FOR UPDATE OF MaqLinTex NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS3", "SELECT EmprCod, MaqCod, DesTecLin, MaqLinTex FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ? AND DesTecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS4", "SELECT MaqCod, MaqTipMaq, MaqDsc, MaqDscLarg, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqVolMax, MaqVolMin, MaqVolMed, MaqVolRes, MaqVolTop, MaqTemMax, MaqChp, MaqTinTip, MaqMicro, MaqNroTub, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqCodFor, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqRelBan, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqVolBal, MaqCosGen, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqCuerdas, EmprCod, TipMaqCod, MaqOgtId FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ?  FOR UPDATE OF MaqTipMaq, MaqDsc, MaqDscLarg, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqVolMax, MaqVolMin, MaqVolMed, MaqVolRes, MaqVolTop, MaqTemMax, MaqChp, MaqTinTip, MaqMicro, MaqNroTub, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqCodFor, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqRelBan, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqVolBal, MaqCosGen, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqCuerdas, TipMaqCod, MaqOgtId NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS5", "SELECT MaqCod, MaqTipMaq, MaqDsc, MaqDscLarg, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqVolMax, MaqVolMin, MaqVolMed, MaqVolRes, MaqVolTop, MaqTemMax, MaqChp, MaqTinTip, MaqMicro, MaqNroTub, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqCodFor, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqRelBan, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqVolBal, MaqCosGen, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqCuerdas, EmprCod, TipMaqCod, MaqOgtId FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS7", "SELECT TipMaqDsc FROM TXPTIPMAQ WHERE EmprCod = ? AND TipMaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS8", "SELECT MaqOgtDsc FROM TXPMAQOGT WHERE EmprCod = ? AND MaqOgtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS9", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqCod, TM1.MaqTipMaq, TM1.MaqDsc, TM1.MaqDscLarg, TM1.MaqCap, TM1.MaqCosMin, TM1.MaqHorPro, TM1.MaqMinPro, TM1.MaqTip, TM1.MaqEst, T2.EmprNom, TM1.MaqUltFec, TM1.MaqResDia, TM1.MaqHorAsi, TM1.MaqOrdSeq, TM1.MaqUltLin, T3.TipMaqDsc, TM1.MaqFormul, TM1.MaqKgsMin, TM1.MaqKgsMed, TM1.MaqKgsMax, TM1.MaqPrdMin, TM1.MaqPrdMed, TM1.MaqPrdMax, TM1.MaqVolMax, TM1.MaqVolMin, TM1.MaqVolMed, TM1.MaqVolRes, TM1.MaqVolTop, TM1.MaqTemMax, TM1.MaqChp, TM1.MaqTinTip, TM1.MaqMicro, TM1.MaqNroTub, TM1.MaqCodBan, TM1.MaqSalM, TM1.MaqSalMKi, TM1.MaqSalMKf, TM1.MaqCantCor, TM1.MaqTipCen, TM1.MaqDosifP, TM1.MaqDteCol, TM1.MaqCodFor, TM1.MaqFacAbs, TM1.MaqKgsId, TM1.MaqPln, TM1.MaqPlnVis, TM1.MaqConFas, TM1.MaqVaril, TM1.MaqRelBan, TM1.MaqLoc, TM1.MaqObs, TM1.MaqFabsHm, TM1.MaqHhCon, TM1.MaqHhCtr, TM1.MaqVolBal, TM1.MaqCosGen, T4.MaqOgtDsc, TM1.MaqMOD, TM1.MaqMOI, TM1.MaqEnerg, TM1.MaqGas, TM1.MaqAgua, TM1.MaqTmCarg, TM1.MaqTmDcarg, TM1.MaqMtsMn, TM1.MaqMtsMx, TM1.MaqCosFijo, TM1.MaqCosKg, TM1.MaqCuerdas, TM1.EmprCod, TM1.TipMaqCod, TM1.MaqOgtId FROM (((TXPMAQUIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPTIPMAQ T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipMaqCod = TM1.TipMaqCod) LEFT JOIN TXPMAQOGT T4 ON T4.EmprCod = TM1.EmprCod AND T4.MaqOgtId = TM1.MaqOgtId) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS10", "SELECT TipMaqDsc FROM TXPTIPMAQ WHERE EmprCod = ? AND TipMaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS11", "SELECT MaqOgtDsc FROM TXPMAQOGT WHERE EmprCod = ? AND MaqOgtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( MaqCod > ?) and EmprCod = ? ORDER BY EmprCod, MaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( MaqCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OS15", "INSERT INTO TXPMAQUIN(MaqCod, MaqTipMaq, MaqDsc, MaqDscLarg, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqVolMax, MaqVolMin, MaqVolMed, MaqVolRes, MaqVolTop, MaqTemMax, MaqChp, MaqTinTip, MaqMicro, MaqNroTub, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqCodFor, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqRelBan, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqVolBal, MaqCosGen, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqCuerdas, EmprCod, TipMaqCod, MaqOgtId, MaqFasUni, MaqConUlt, MaqMadUlt, MaqCapac, MaqPri, MaqNhd, MaqCCoCod, MaqPasw, MaqUltDoc, MaqDTTipo, MaqDTMar, MaqDTMod, MaqDTRef, MaqDTSer, MaqDTFab, MaqDTOri, MaqDTAdqFc, MaqDTAdqFo, MaqDTPrv, MaqDTPrvDi, MaqDTAdqCo, MaqDTRepCo, MaqDTCar, MaqDTVolt, MaqDTReq, MaqDTMnt, MaqDTCal, MaqDTServ, MaqDTInv, MaqDTGarIn, MaqDTGarFi, MaqGI, MaqAdCent, MaqAmort) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0)", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T01OS16", "UPDATE TXPMAQUIN SET MaqTipMaq=?, MaqDsc=?, MaqDscLarg=?, MaqCap=?, MaqCosMin=?, MaqHorPro=?, MaqMinPro=?, MaqTip=?, MaqEst=?, MaqUltFec=?, MaqResDia=?, MaqHorAsi=?, MaqOrdSeq=?, MaqUltLin=?, MaqFormul=?, MaqKgsMin=?, MaqKgsMed=?, MaqKgsMax=?, MaqPrdMin=?, MaqPrdMed=?, MaqPrdMax=?, MaqVolMax=?, MaqVolMin=?, MaqVolMed=?, MaqVolRes=?, MaqVolTop=?, MaqTemMax=?, MaqChp=?, MaqTinTip=?, MaqMicro=?, MaqNroTub=?, MaqCodBan=?, MaqSalM=?, MaqSalMKi=?, MaqSalMKf=?, MaqCantCor=?, MaqTipCen=?, MaqDosifP=?, MaqDteCol=?, MaqCodFor=?, MaqFacAbs=?, MaqKgsId=?, MaqPln=?, MaqPlnVis=?, MaqConFas=?, MaqVaril=?, MaqRelBan=?, MaqLoc=?, MaqObs=?, MaqFabsHm=?, MaqHhCon=?, MaqHhCtr=?, MaqVolBal=?, MaqCosGen=?, MaqMOD=?, MaqMOI=?, MaqEnerg=?, MaqGas=?, MaqAgua=?, MaqTmCarg=?, MaqTmDcarg=?, MaqMtsMn=?, MaqMtsMx=?, MaqCosFijo=?, MaqCosKg=?, MaqCuerdas=?, TipMaqCod=?, MaqOgtId=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T01OS17", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new ForEachCursor("T01OS18", "SELECT TipMaqDsc FROM TXPTIPMAQ WHERE EmprCod = ? AND TipMaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS19", "SELECT MaqOgtDsc FROM TXPMAQOGT WHERE EmprCod = ? AND MaqOgtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS20", "SELECT * FROM (SELECT EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND MEnvMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS22", "SELECT * FROM (SELECT EmprCod, RARID, MaqCod FROM TXPDSPRA3 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS23", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS24", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS25", "SELECT * FROM (SELECT EmprCod, LavMqId FROM TXPLAVMQ0 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS26", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS27", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS28", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS29", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS30", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS31", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS32", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqDocId FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS33", "SELECT * FROM (SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND ArtMqFa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS35", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTMuIni FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS36", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFabC FROM TXPMAQFAB WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS37", "SELECT * FROM (SELECT EmprCod, SMCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS38", "SELECT * FROM (SELECT EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS39", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS40", "SELECT * FROM (SELECT EmprCod, MaqCod, Maq_Prg FROM TXPMAQPRG WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS41", "SELECT * FROM (SELECT EmprCod, MaqCod, CPROCORIG FROM TXPCONVPR WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS42", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS43", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS44", "SELECT * FROM (SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS45", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS46", "SELECT * FROM (SELECT EmprCod, Mq_Grupo, MaqCod FROM TXPMAQGR1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS47", "SELECT * FROM (SELECT EmprCod, CRCod, CRLin FROM TXPLCOSRE WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS48", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS49", "SELECT * FROM (SELECT EmprCod, PrdNumM, MaqCod FROM TXPPRDMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS50", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqPrdNum FROM TXPMAQPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS51", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS52", "SELECT * FROM (SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS53", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS54", "SELECT * FROM (SELECT EmprCod, MaqCod, LOParId FROM TXPLOMaqP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS55", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS56", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS57", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqMadLin FROM TXPLMAQMA WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS58", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqConLin FROM TXPLMAQCO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS59", "SELECT * FROM (SELECT EmprCod, CosTermCod, CosLin FROM TXPCOSTES WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS60", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS61", "SELECT * FROM (SELECT EmprCod, MaqCod, MhiMes, MhiAny FROM TXPCMHPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS62", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS63", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS64", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS65", "SELECT * FROM (SELECT EmprCod, GruMaqCod, MaqCod FROM TXPGRULIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS66", "SELECT * FROM (SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS67", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND MaqCodDis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OS68", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND MaqCodBis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OS69", "UPDATE TXPMAQUIN SET MaqUltLin=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new ForEachCursor("T01OS70", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS71", "SELECT EmprCod, MaqCod, DesTecLin, MaqLinTex FROM TXPMAQLIN WHERE EmprCod = ? and MaqCod = ? and DesTecLin = ? ORDER BY EmprCod, MaqCod, DesTecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OS72", "SELECT EmprCod, MaqCod, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ? AND DesTecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OS73", "INSERT INTO TXPMAQLIN(EmprCod, MaqCod, DesTecLin, MaqLinTex) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMAQLIN")
         ,new UpdateCursor("T01OS74", "UPDATE TXPMAQLIN SET MaqLinTex=?  WHERE EmprCod = ? AND MaqCod = ? AND DesTecLin = ?", GX_NOMASK, "TXPMAQLIN")
         ,new UpdateCursor("T01OS75", "DELETE FROM TXPMAQLIN  WHERE EmprCod = ? AND MaqCod = ? AND DesTecLin = ?", GX_NOMASK, "TXPMAQLIN")
         ,new ForEachCursor("T01OS76", "SELECT EmprCod, MaqCod, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, DesTecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 70);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 70);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,3);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(36,3);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,3);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((int[]) buf[77])[0] = rslt.getInt(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((byte[]) buf[85])[0] = rslt.getByte(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((byte[]) buf[87])[0] = rslt.getByte(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((int[]) buf[89])[0] = rslt.getInt(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((byte[]) buf[93])[0] = rslt.getByte(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(49, 10);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((int[]) buf[105])[0] = rslt.getInt(54);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[109])[0] = rslt.getBigDecimal(56,4);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[111])[0] = rslt.getBigDecimal(57,4);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(58,4);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(59,4);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(60,4);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((short[]) buf[119])[0] = rslt.getShort(61);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((short[]) buf[121])[0] = rslt.getShort(62);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[123])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[125])[0] = rslt.getBigDecimal(64,2);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[127])[0] = rslt.getBigDecimal(65,4);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[129])[0] = rslt.getBigDecimal(66,4);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((short[]) buf[131])[0] = rslt.getShort(67);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((String[]) buf[133])[0] = rslt.getString(68, 3);
               ((String[]) buf[134])[0] = rslt.getString(69, 4);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(70, 6);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,3);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(36,3);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,3);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((int[]) buf[77])[0] = rslt.getInt(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((byte[]) buf[85])[0] = rslt.getByte(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((byte[]) buf[87])[0] = rslt.getByte(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((int[]) buf[89])[0] = rslt.getInt(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((byte[]) buf[93])[0] = rslt.getByte(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(49, 10);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((int[]) buf[105])[0] = rslt.getInt(54);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[109])[0] = rslt.getBigDecimal(56,4);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[111])[0] = rslt.getBigDecimal(57,4);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(58,4);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(59,4);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(60,4);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((short[]) buf[119])[0] = rslt.getShort(61);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((short[]) buf[121])[0] = rslt.getShort(62);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[123])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[125])[0] = rslt.getBigDecimal(64,2);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[127])[0] = rslt.getBigDecimal(65,4);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[129])[0] = rslt.getBigDecimal(66,4);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((short[]) buf[131])[0] = rslt.getShort(67);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((String[]) buf[133])[0] = rslt.getString(68, 3);
               ((String[]) buf[134])[0] = rslt.getString(69, 4);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(70, 6);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,3);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(39,3);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 6);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((byte[]) buf[89])[0] = rslt.getByte(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((byte[]) buf[91])[0] = rslt.getByte(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((int[]) buf[93])[0] = rslt.getInt(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((byte[]) buf[97])[0] = rslt.getByte(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(51, 10);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[105])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((int[]) buf[109])[0] = rslt.getInt(56);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[111])[0] = rslt.getBigDecimal(57,2);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(58, 60);
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(59,4);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(60,4);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(61,4);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(62,4);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(63,4);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((short[]) buf[124])[0] = rslt.getShort(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[128])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[130])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[132])[0] = rslt.getBigDecimal(68,4);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[134])[0] = rslt.getBigDecimal(69,4);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(70);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(71, 3);
               ((String[]) buf[139])[0] = rslt.getString(72, 4);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((String[]) buf[141])[0] = rslt.getString(73, 6);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 70);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 2 :
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
            case 3 :
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
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 6 :
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
            case 10 :
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
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[45]).intValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[51]).intValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[53]).intValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[61]).byteValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[63]).byteValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 1);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 1);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[79]).intValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 6);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[85], 2);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(44, ((Number) parms[87]).byteValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(45, ((Number) parms[89]).byteValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(46, ((Number) parms[91]).intValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[93], 1);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(48, ((Number) parms[95]).byteValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[97], 10);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[99], 200);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(52, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 1);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(54, ((Number) parms[107]).intValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(55, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(56, (java.math.BigDecimal)parms[111], 4);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(57, (java.math.BigDecimal)parms[113], 4);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[115], 4);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(59, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(61, ((Number) parms[121]).shortValue());
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(62, ((Number) parms[123]).shortValue());
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(63, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(64, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[129], 4);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[131], 4);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[133]).shortValue());
               }
               stmt.setString(68, (String)parms[134], 3);
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[136], 4);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[138], 6);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 40);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[45]).intValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[51]).intValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[59]).byteValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[61]).byteValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[67], 3);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 1);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 1);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(39, ((Number) parms[77]).intValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[79], 6);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[85]).byteValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(44, ((Number) parms[87]).byteValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(45, ((Number) parms[89]).intValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[91], 1);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(47, ((Number) parms[93]).byteValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[95], 10);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[97], 200);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 1);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(53, ((Number) parms[105]).intValue());
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(55, (java.math.BigDecimal)parms[109], 4);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(56, (java.math.BigDecimal)parms[111], 4);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(57, (java.math.BigDecimal)parms[113], 4);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[115], 4);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(59, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(60, ((Number) parms[119]).shortValue());
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(61, ((Number) parms[121]).shortValue());
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(62, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(63, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(64, (java.math.BigDecimal)parms[127], 4);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[129], 4);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[131]).shortValue());
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[133], 4);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[135], 6);
               }
               stmt.setString(69, (String)parms[136], 3);
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[138], 6);
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 17 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 21 :
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
            case 22 :
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
            case 23 :
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
            case 24 :
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
            case 25 :
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
            case 26 :
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
            case 27 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 32 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 35 :
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
            case 36 :
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
            case 37 :
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
               return;
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
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
            case 62 :
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
            case 63 :
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
            case 64 :
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
            case 65 :
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
            case 66 :
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
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 70);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 70);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 74 :
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
      }
   }

}

