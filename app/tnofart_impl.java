package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnofart_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_55") == 0 )
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
         gxload_55( A396EmprCod, A840TrnCod) ;
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
            A11103Nof_Hdr = (int)(GXutil.lval( httpContext.GetPar( "Nof_Hdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11103Nof_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11103Nof_Hdr), 8, 0));
            A11104Nof_r = (byte)(GXutil.lval( httpContext.GetPar( "Nof_r"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11104Nof_r", GXutil.str( A11104Nof_r, 1, 0));
            A11105Nof_p = httpContext.GetPar( "Nof_p") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11105Nof_p", A11105Nof_p);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FICHA TECNICA ASOCIADA A NOF", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbNof_Pd.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tnofart_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnofart_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnofart_impl.class ));
   }

   public tnofart_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbNof_Pd = new HTMLChoice();
      cmbNof_Mcot = new HTMLChoice();
      cmbNof_Pp = new HTMLChoice();
      cmbNof_Ag = new HTMLChoice();
      cmbNof_bo = new HTMLChoice();
      cmbNof_bob = new HTMLChoice();
      cmbNof_boe = new HTMLChoice();
      cmbNof_Bov = new HTMLChoice();
      cmbNof_tns = new HTMLChoice();
      cmbNof_tnc = new HTMLChoice();
      cmbNof_ct = new HTMLChoice();
      cmbNof_scs = new HTMLChoice();
      cmbNof_scc = new HTMLChoice();
      cmbNof_cctse = new HTMLChoice();
      cmbNof_ccttp = new HTMLChoice();
      cmbNof_cctet = new HTMLChoice();
      cmbNof_ccpc = new HTMLChoice();
      cmbNof_cctq = new HTMLChoice();
      cmbNof_cccc = new HTMLChoice();
      cmbNof_ccec = new HTMLChoice();
      cmbNof_ccmc1 = new HTMLChoice();
      cmbNof_ccmc2 = new HTMLChoice();
      cmbNof_ccmc3 = new HTMLChoice();
      cmbNof_ccmc4 = new HTMLChoice();
      cmbNof_ccmc5 = new HTMLChoice();
      cmbNof_ccmc6 = new HTMLChoice();
      cmbNof_rb = new HTMLChoice();
      cmbNof_rbi = new HTMLChoice();
      cmbNof_rbe = new HTMLChoice();
      cmbNof_rbp = new HTMLChoice();
      cmbNof_rb1 = new HTMLChoice();
      cmbNof_rb3 = new HTMLChoice();
      cmbNof_ep1 = new HTMLChoice();
      cmbNof_ep2 = new HTMLChoice();
      cmbNof_ep3 = new HTMLChoice();
      cmbNof_ep4 = new HTMLChoice();
      cmbNof_ep5 = new HTMLChoice();
      cmbNof_ep6 = new HTMLChoice();
      cmbNof_ep7 = new HTMLChoice();
      cmbNof_ep8 = new HTMLChoice();
      cmbNof_ep9 = new HTMLChoice();
      cmbNof_ep10 = new HTMLChoice();
      cmbNof_sa1 = new HTMLChoice();
      cmbNof_sa2 = new HTMLChoice();
      cmbNof_sa3 = new HTMLChoice();
      cmbNof_sa4 = new HTMLChoice();
      cmbNof_sa5 = new HTMLChoice();
      cmbNof_sa6 = new HTMLChoice();
      cmbNof_stk = new HTMLChoice();
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
      if ( cmbNof_Pd.getItemCount() > 0 )
      {
         A11106Nof_Pd = cmbNof_Pd.getValidValue(A11106Nof_Pd) ;
         n11106Nof_Pd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Pd.setValue( GXutil.rtrim( A11106Nof_Pd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Values", cmbNof_Pd.ToJavascriptSource(), true);
      }
      if ( cmbNof_Mcot.getItemCount() > 0 )
      {
         A11107Nof_Mcot = cmbNof_Mcot.getValidValue(A11107Nof_Mcot) ;
         n11107Nof_Mcot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Mcot.setValue( GXutil.rtrim( A11107Nof_Mcot) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Mcot.getInternalname(), "Values", cmbNof_Mcot.ToJavascriptSource(), true);
      }
      if ( cmbNof_Pp.getItemCount() > 0 )
      {
         A11108Nof_Pp = cmbNof_Pp.getValidValue(A11108Nof_Pp) ;
         n11108Nof_Pp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Pp.setValue( GXutil.rtrim( A11108Nof_Pp) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Values", cmbNof_Pp.ToJavascriptSource(), true);
      }
      if ( cmbNof_Ag.getItemCount() > 0 )
      {
         A11109Nof_Ag = cmbNof_Ag.getValidValue(A11109Nof_Ag) ;
         n11109Nof_Ag = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Ag.setValue( GXutil.rtrim( A11109Nof_Ag) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Ag.getInternalname(), "Values", cmbNof_Ag.ToJavascriptSource(), true);
      }
      if ( cmbNof_bo.getItemCount() > 0 )
      {
         A11112Nof_bo = cmbNof_bo.getValidValue(A11112Nof_bo) ;
         n11112Nof_bo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_bo.setValue( GXutil.rtrim( A11112Nof_bo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_bo.getInternalname(), "Values", cmbNof_bo.ToJavascriptSource(), true);
      }
      if ( cmbNof_bob.getItemCount() > 0 )
      {
         A11113Nof_bob = cmbNof_bob.getValidValue(A11113Nof_bob) ;
         n11113Nof_bob = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_bob.setValue( GXutil.rtrim( A11113Nof_bob) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Values", cmbNof_bob.ToJavascriptSource(), true);
      }
      if ( cmbNof_boe.getItemCount() > 0 )
      {
         A11114Nof_boe = cmbNof_boe.getValidValue(A11114Nof_boe) ;
         n11114Nof_boe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_boe.setValue( GXutil.rtrim( A11114Nof_boe) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Values", cmbNof_boe.ToJavascriptSource(), true);
      }
      if ( cmbNof_Bov.getItemCount() > 0 )
      {
         A11115Nof_Bov = cmbNof_Bov.getValidValue(A11115Nof_Bov) ;
         n11115Nof_Bov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11115Nof_Bov", A11115Nof_Bov);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Bov.setValue( GXutil.rtrim( A11115Nof_Bov) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Bov.getInternalname(), "Values", cmbNof_Bov.ToJavascriptSource(), true);
      }
      if ( cmbNof_tns.getItemCount() > 0 )
      {
         A11117Nof_tns = cmbNof_tns.getValidValue(A11117Nof_tns) ;
         n11117Nof_tns = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_tns.setValue( GXutil.rtrim( A11117Nof_tns) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_tns.getInternalname(), "Values", cmbNof_tns.ToJavascriptSource(), true);
      }
      if ( cmbNof_tnc.getItemCount() > 0 )
      {
         A11118Nof_tnc = cmbNof_tnc.getValidValue(A11118Nof_tnc) ;
         n11118Nof_tnc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_tnc.setValue( GXutil.rtrim( A11118Nof_tnc) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_tnc.getInternalname(), "Values", cmbNof_tnc.ToJavascriptSource(), true);
      }
      if ( cmbNof_ct.getItemCount() > 0 )
      {
         A11120Nof_ct = cmbNof_ct.getValidValue(A11120Nof_ct) ;
         n11120Nof_ct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ct.setValue( GXutil.rtrim( A11120Nof_ct) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ct.getInternalname(), "Values", cmbNof_ct.ToJavascriptSource(), true);
      }
      if ( cmbNof_scs.getItemCount() > 0 )
      {
         A11122Nof_scs = cmbNof_scs.getValidValue(A11122Nof_scs) ;
         n11122Nof_scs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_scs.setValue( GXutil.rtrim( A11122Nof_scs) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_scs.getInternalname(), "Values", cmbNof_scs.ToJavascriptSource(), true);
      }
      if ( cmbNof_scc.getItemCount() > 0 )
      {
         A11123Nof_scc = cmbNof_scc.getValidValue(A11123Nof_scc) ;
         n11123Nof_scc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_scc.setValue( GXutil.rtrim( A11123Nof_scc) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_scc.getInternalname(), "Values", cmbNof_scc.ToJavascriptSource(), true);
      }
      if ( cmbNof_cctse.getItemCount() > 0 )
      {
         A11125Nof_cctse = cmbNof_cctse.getValidValue(A11125Nof_cctse) ;
         n11125Nof_cctse = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cctse.setValue( GXutil.rtrim( A11125Nof_cctse) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctse.getInternalname(), "Values", cmbNof_cctse.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccttp.getItemCount() > 0 )
      {
         A11126Nof_ccttp = cmbNof_ccttp.getValidValue(A11126Nof_ccttp) ;
         n11126Nof_ccttp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccttp.setValue( GXutil.rtrim( A11126Nof_ccttp) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccttp.getInternalname(), "Values", cmbNof_ccttp.ToJavascriptSource(), true);
      }
      if ( cmbNof_cctet.getItemCount() > 0 )
      {
         A11127Nof_cctet = cmbNof_cctet.getValidValue(A11127Nof_cctet) ;
         n11127Nof_cctet = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cctet.setValue( GXutil.rtrim( A11127Nof_cctet) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctet.getInternalname(), "Values", cmbNof_cctet.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccpc.getItemCount() > 0 )
      {
         A11130Nof_ccpc = cmbNof_ccpc.getValidValue(A11130Nof_ccpc) ;
         n11130Nof_ccpc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccpc.setValue( GXutil.rtrim( A11130Nof_ccpc) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccpc.getInternalname(), "Values", cmbNof_ccpc.ToJavascriptSource(), true);
      }
      if ( cmbNof_cctq.getItemCount() > 0 )
      {
         A11131Nof_cctq = cmbNof_cctq.getValidValue(A11131Nof_cctq) ;
         n11131Nof_cctq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cctq.setValue( GXutil.rtrim( A11131Nof_cctq) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctq.getInternalname(), "Values", cmbNof_cctq.ToJavascriptSource(), true);
      }
      if ( cmbNof_cccc.getItemCount() > 0 )
      {
         A11132Nof_cccc = cmbNof_cccc.getValidValue(A11132Nof_cccc) ;
         n11132Nof_cccc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cccc.setValue( GXutil.rtrim( A11132Nof_cccc) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_cccc.getInternalname(), "Values", cmbNof_cccc.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccec.getItemCount() > 0 )
      {
         A11133Nof_ccec = cmbNof_ccec.getValidValue(A11133Nof_ccec) ;
         n11133Nof_ccec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccec.setValue( GXutil.rtrim( A11133Nof_ccec) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccec.getInternalname(), "Values", cmbNof_ccec.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccmc1.getItemCount() > 0 )
      {
         A11134Nof_ccmc1 = cmbNof_ccmc1.getValidValue(A11134Nof_ccmc1) ;
         n11134Nof_ccmc1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc1.setValue( GXutil.rtrim( A11134Nof_ccmc1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc1.getInternalname(), "Values", cmbNof_ccmc1.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccmc2.getItemCount() > 0 )
      {
         A11135Nof_ccmc2 = cmbNof_ccmc2.getValidValue(A11135Nof_ccmc2) ;
         n11135Nof_ccmc2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc2.setValue( GXutil.rtrim( A11135Nof_ccmc2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc2.getInternalname(), "Values", cmbNof_ccmc2.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccmc3.getItemCount() > 0 )
      {
         A11136Nof_ccmc3 = cmbNof_ccmc3.getValidValue(A11136Nof_ccmc3) ;
         n11136Nof_ccmc3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc3.setValue( GXutil.rtrim( A11136Nof_ccmc3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc3.getInternalname(), "Values", cmbNof_ccmc3.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccmc4.getItemCount() > 0 )
      {
         A11137Nof_ccmc4 = cmbNof_ccmc4.getValidValue(A11137Nof_ccmc4) ;
         n11137Nof_ccmc4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc4.setValue( GXutil.rtrim( A11137Nof_ccmc4) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc4.getInternalname(), "Values", cmbNof_ccmc4.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccmc5.getItemCount() > 0 )
      {
         A11138Nof_ccmc5 = cmbNof_ccmc5.getValidValue(A11138Nof_ccmc5) ;
         n11138Nof_ccmc5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc5.setValue( GXutil.rtrim( A11138Nof_ccmc5) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc5.getInternalname(), "Values", cmbNof_ccmc5.ToJavascriptSource(), true);
      }
      if ( cmbNof_ccmc6.getItemCount() > 0 )
      {
         A11139Nof_ccmc6 = cmbNof_ccmc6.getValidValue(A11139Nof_ccmc6) ;
         n11139Nof_ccmc6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc6.setValue( GXutil.rtrim( A11139Nof_ccmc6) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc6.getInternalname(), "Values", cmbNof_ccmc6.ToJavascriptSource(), true);
      }
      if ( cmbNof_rb.getItemCount() > 0 )
      {
         A11141Nof_rb = cmbNof_rb.getValidValue(A11141Nof_rb) ;
         n11141Nof_rb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rb.setValue( GXutil.rtrim( A11141Nof_rb) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb.getInternalname(), "Values", cmbNof_rb.ToJavascriptSource(), true);
      }
      if ( cmbNof_rbi.getItemCount() > 0 )
      {
         A11142Nof_rbi = cmbNof_rbi.getValidValue(A11142Nof_rbi) ;
         n11142Nof_rbi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rbi.setValue( GXutil.rtrim( A11142Nof_rbi) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbi.getInternalname(), "Values", cmbNof_rbi.ToJavascriptSource(), true);
      }
      if ( cmbNof_rbe.getItemCount() > 0 )
      {
         A11143Nof_rbe = cmbNof_rbe.getValidValue(A11143Nof_rbe) ;
         n11143Nof_rbe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rbe.setValue( GXutil.rtrim( A11143Nof_rbe) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbe.getInternalname(), "Values", cmbNof_rbe.ToJavascriptSource(), true);
      }
      if ( cmbNof_rbp.getItemCount() > 0 )
      {
         A11144Nof_rbp = cmbNof_rbp.getValidValue(A11144Nof_rbp) ;
         n11144Nof_rbp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rbp.setValue( GXutil.rtrim( A11144Nof_rbp) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbp.getInternalname(), "Values", cmbNof_rbp.ToJavascriptSource(), true);
      }
      if ( cmbNof_rb1.getItemCount() > 0 )
      {
         A11146Nof_rb1 = cmbNof_rb1.getValidValue(A11146Nof_rb1) ;
         n11146Nof_rb1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rb1.setValue( GXutil.rtrim( A11146Nof_rb1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb1.getInternalname(), "Values", cmbNof_rb1.ToJavascriptSource(), true);
      }
      if ( cmbNof_rb3.getItemCount() > 0 )
      {
         A11147Nof_rb3 = cmbNof_rb3.getValidValue(A11147Nof_rb3) ;
         n11147Nof_rb3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rb3.setValue( GXutil.rtrim( A11147Nof_rb3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb3.getInternalname(), "Values", cmbNof_rb3.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep1.getItemCount() > 0 )
      {
         A11149Nof_ep1 = cmbNof_ep1.getValidValue(A11149Nof_ep1) ;
         n11149Nof_ep1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep1.setValue( GXutil.rtrim( A11149Nof_ep1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep1.getInternalname(), "Values", cmbNof_ep1.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep2.getItemCount() > 0 )
      {
         A11150Nof_ep2 = cmbNof_ep2.getValidValue(A11150Nof_ep2) ;
         n11150Nof_ep2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep2.setValue( GXutil.rtrim( A11150Nof_ep2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep2.getInternalname(), "Values", cmbNof_ep2.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep3.getItemCount() > 0 )
      {
         A11151Nof_ep3 = cmbNof_ep3.getValidValue(A11151Nof_ep3) ;
         n11151Nof_ep3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep3.setValue( GXutil.rtrim( A11151Nof_ep3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep3.getInternalname(), "Values", cmbNof_ep3.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep4.getItemCount() > 0 )
      {
         A11152Nof_ep4 = cmbNof_ep4.getValidValue(A11152Nof_ep4) ;
         n11152Nof_ep4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep4.setValue( GXutil.rtrim( A11152Nof_ep4) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep4.getInternalname(), "Values", cmbNof_ep4.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep5.getItemCount() > 0 )
      {
         A11153Nof_ep5 = cmbNof_ep5.getValidValue(A11153Nof_ep5) ;
         n11153Nof_ep5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep5.setValue( GXutil.rtrim( A11153Nof_ep5) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep5.getInternalname(), "Values", cmbNof_ep5.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep6.getItemCount() > 0 )
      {
         A11154Nof_ep6 = cmbNof_ep6.getValidValue(A11154Nof_ep6) ;
         n11154Nof_ep6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep6.setValue( GXutil.rtrim( A11154Nof_ep6) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep6.getInternalname(), "Values", cmbNof_ep6.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep7.getItemCount() > 0 )
      {
         A11155Nof_ep7 = cmbNof_ep7.getValidValue(A11155Nof_ep7) ;
         n11155Nof_ep7 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep7.setValue( GXutil.rtrim( A11155Nof_ep7) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep7.getInternalname(), "Values", cmbNof_ep7.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep8.getItemCount() > 0 )
      {
         A11156Nof_ep8 = cmbNof_ep8.getValidValue(A11156Nof_ep8) ;
         n11156Nof_ep8 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep8.setValue( GXutil.rtrim( A11156Nof_ep8) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep8.getInternalname(), "Values", cmbNof_ep8.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep9.getItemCount() > 0 )
      {
         A11157Nof_ep9 = cmbNof_ep9.getValidValue(A11157Nof_ep9) ;
         n11157Nof_ep9 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep9.setValue( GXutil.rtrim( A11157Nof_ep9) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep9.getInternalname(), "Values", cmbNof_ep9.ToJavascriptSource(), true);
      }
      if ( cmbNof_ep10.getItemCount() > 0 )
      {
         A11158Nof_ep10 = cmbNof_ep10.getValidValue(A11158Nof_ep10) ;
         n11158Nof_ep10 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep10.setValue( GXutil.rtrim( A11158Nof_ep10) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep10.getInternalname(), "Values", cmbNof_ep10.ToJavascriptSource(), true);
      }
      if ( cmbNof_sa1.getItemCount() > 0 )
      {
         A11160Nof_sa1 = cmbNof_sa1.getValidValue(A11160Nof_sa1) ;
         n11160Nof_sa1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa1.setValue( GXutil.rtrim( A11160Nof_sa1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa1.getInternalname(), "Values", cmbNof_sa1.ToJavascriptSource(), true);
      }
      if ( cmbNof_sa2.getItemCount() > 0 )
      {
         A11161Nof_sa2 = cmbNof_sa2.getValidValue(A11161Nof_sa2) ;
         n11161Nof_sa2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa2.setValue( GXutil.rtrim( A11161Nof_sa2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa2.getInternalname(), "Values", cmbNof_sa2.ToJavascriptSource(), true);
      }
      if ( cmbNof_sa3.getItemCount() > 0 )
      {
         A11162Nof_sa3 = cmbNof_sa3.getValidValue(A11162Nof_sa3) ;
         n11162Nof_sa3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa3.setValue( GXutil.rtrim( A11162Nof_sa3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa3.getInternalname(), "Values", cmbNof_sa3.ToJavascriptSource(), true);
      }
      if ( cmbNof_sa4.getItemCount() > 0 )
      {
         A11163Nof_sa4 = cmbNof_sa4.getValidValue(A11163Nof_sa4) ;
         n11163Nof_sa4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11163Nof_sa4", A11163Nof_sa4);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa4.setValue( GXutil.rtrim( A11163Nof_sa4) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa4.getInternalname(), "Values", cmbNof_sa4.ToJavascriptSource(), true);
      }
      if ( cmbNof_sa5.getItemCount() > 0 )
      {
         A11164Nof_sa5 = cmbNof_sa5.getValidValue(A11164Nof_sa5) ;
         n11164Nof_sa5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa5.setValue( GXutil.rtrim( A11164Nof_sa5) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa5.getInternalname(), "Values", cmbNof_sa5.ToJavascriptSource(), true);
      }
      if ( cmbNof_sa6.getItemCount() > 0 )
      {
         A11165Nof_sa6 = cmbNof_sa6.getValidValue(A11165Nof_sa6) ;
         n11165Nof_sa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa6.setValue( GXutil.rtrim( A11165Nof_sa6) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa6.getInternalname(), "Values", cmbNof_sa6.ToJavascriptSource(), true);
      }
      if ( cmbNof_stk.getItemCount() > 0 )
      {
         A11167Nof_stk = cmbNof_stk.getValidValue(A11167Nof_stk) ;
         n11167Nof_stk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_stk.setValue( GXutil.rtrim( A11167Nof_stk) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_stk.getInternalname(), "Values", cmbNof_stk.ToJavascriptSource(), true);
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 5,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TNOFART.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A11103Nof_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11103Nof_Hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11103Nof_Hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtNof_Hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_r_Internalname, GXutil.ltrim( localUtil.ntoc( A11104Nof_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_r_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11104Nof_r), "9") : localUtil.format( DecimalUtil.doubleToDec(A11104Nof_r), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_r_Jsonclick, 0, "", "", "", "", "", 1, edtNof_r_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_p_Internalname, GXutil.rtrim( A11105Nof_p), GXutil.rtrim( localUtil.format( A11105Nof_p, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_p_Jsonclick, 0, "", "", "", "", "", 1, edtNof_p_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Portes debido", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_Pd, cmbNof_Pd.getInternalname(), GXutil.rtrim( A11106Nof_Pd), 1, cmbNof_Pd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_Pd.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_Pd.setValue( GXutil.rtrim( A11106Nof_Pd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Values", cmbNof_Pd.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia Crudo Oeko Tex", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_Mcot, cmbNof_Mcot.getInternalname(), GXutil.rtrim( A11107Nof_Mcot), 1, cmbNof_Mcot.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_Mcot.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_Mcot.setValue( GXutil.rtrim( A11107Nof_Mcot) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Mcot.getInternalname(), "Values", cmbNof_Mcot.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Portes Pagados", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_Pp, cmbNof_Pp.getInternalname(), GXutil.rtrim( A11108Nof_Pp), 1, cmbNof_Pp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_Pp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_Pp.setValue( GXutil.rtrim( A11108Nof_Pp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Values", cmbNof_Pp.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Agencia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_Ag, cmbNof_Ag.getInternalname(), GXutil.rtrim( A11109Nof_Ag), 1, cmbNof_Ag.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_Ag.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_Ag.setValue( GXutil.rtrim( A11109Nof_Ag) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Ag.getInternalname(), "Values", cmbNof_Ag.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Comentario Oficinas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c1_Internalname, A11110Nof_c1, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtNof_c1_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Comentarios Almacen", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c2_Internalname, A11111Nof_c2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtNof_c2_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Bobinado?", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_bo, cmbNof_bo.getInternalname(), GXutil.rtrim( A11112Nof_bo), 1, cmbNof_bo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_bo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_bo.setValue( GXutil.rtrim( A11112Nof_bo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_bo.getInternalname(), "Values", cmbNof_bo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Bobinado Bros?", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_bob, cmbNof_bob.getInternalname(), GXutil.rtrim( A11113Nof_bob), 1, cmbNof_bob.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_bob.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_bob.setValue( GXutil.rtrim( A11113Nof_bob) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Values", cmbNof_bob.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Bobinado Externo?", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_boe, cmbNof_boe.getInternalname(), GXutil.rtrim( A11114Nof_boe), 1, cmbNof_boe.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_boe.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_boe.setValue( GXutil.rtrim( A11114Nof_boe) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Values", cmbNof_boe.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Vaporado?", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_Bov, cmbNof_Bov.getInternalname(), GXutil.rtrim( A11115Nof_Bov), 1, cmbNof_Bov.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_Bov.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_Bov.setValue( GXutil.rtrim( A11115Nof_Bov) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Bov.getInternalname(), "Values", cmbNof_Bov.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Comentarios Bobinado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c3_Internalname, A11116Nof_c3, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", (short)(0), 1, edtNof_c3_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tinte, solidez?", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_tns, cmbNof_tns.getInternalname(), GXutil.rtrim( A11117Nof_tns), 1, cmbNof_tns.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_tns.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_tns.setValue( GXutil.rtrim( A11117Nof_tns) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_tns.getInternalname(), "Values", cmbNof_tns.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Tinte, Ctw", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_tnc, cmbNof_tnc.getInternalname(), GXutil.rtrim( A11118Nof_tnc), 1, cmbNof_tnc.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_tnc.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_tnc.setValue( GXutil.rtrim( A11118Nof_tnc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_tnc.getInternalname(), "Values", cmbNof_tnc.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Comentarios Tinte", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c4_Internalname, A11119Nof_c4, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", (short)(0), 1, edtNof_c4_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Centrigugado?", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ct, cmbNof_ct.getInternalname(), GXutil.rtrim( A11120Nof_ct), 1, cmbNof_ct.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ct.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ct.setValue( GXutil.rtrim( A11120Nof_ct) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ct.getInternalname(), "Values", cmbNof_ct.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Comentarios Centrigugado", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c5_Internalname, A11121Nof_c5, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", (short)(0), 1, edtNof_c5_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Secado Stalam?", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_scs, cmbNof_scs.getInternalname(), GXutil.rtrim( A11122Nof_scs), 1, cmbNof_scs.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_scs.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_scs.setValue( GXutil.rtrim( A11122Nof_scs) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_scs.getInternalname(), "Values", cmbNof_scs.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Secado Camara?", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_scc, cmbNof_scc.getInternalname(), GXutil.rtrim( A11123Nof_scc), 1, cmbNof_scc.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_scc.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_scc.setValue( GXutil.rtrim( A11123Nof_scc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_scc.getInternalname(), "Values", cmbNof_scc.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Comentarios Secado", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c6_Internalname, A11124Nof_c6, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", (short)(0), 1, edtNof_c6_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Tejido Solo Exterior?", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_cctse, cmbNof_cctse.getInternalname(), GXutil.rtrim( A11125Nof_cctse), 1, cmbNof_cctse.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_cctse.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_cctse.setValue( GXutil.rtrim( A11125Nof_cctse) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctse.getInternalname(), "Values", cmbNof_cctse.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Tejido Tres Partes", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccttp, cmbNof_ccttp.getInternalname(), GXutil.rtrim( A11126Nof_ccttp), 1, cmbNof_ccttp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccttp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccttp.setValue( GXutil.rtrim( A11126Nof_ccttp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccttp.getInternalname(), "Values", cmbNof_ccttp.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Tejido en tipos?", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_cctet, cmbNof_cctet.getInternalname(), GXutil.rtrim( A11127Nof_cctet), 1, cmbNof_cctet.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_cctet.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_cctet.setValue( GXutil.rtrim( A11127Nof_cctet) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctet.getInternalname(), "Values", cmbNof_cctet.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Pestaña", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_ccp_Internalname, GXutil.ltrim( localUtil.ntoc( A11128Nof_ccp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_ccp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11128Nof_ccp), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11128Nof_ccp), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_ccp_Jsonclick, 0, "", "", "", "", "", 1, edtNof_ccp_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_cct_Internalname, GXutil.ltrim( localUtil.ntoc( A11129Nof_cct, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_cct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11129Nof_cct), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11129Nof_cct), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_cct_Jsonclick, 0, "", "", "", "", "", 1, edtNof_cct_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Placa?", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccpc, cmbNof_ccpc.getInternalname(), GXutil.rtrim( A11130Nof_ccpc), 1, cmbNof_ccpc.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccpc.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccpc.setValue( GXutil.rtrim( A11130Nof_ccpc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccpc.getInternalname(), "Values", cmbNof_ccpc.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Troquillo?", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_cctq, cmbNof_cctq.getInternalname(), GXutil.rtrim( A11131Nof_cctq), 1, cmbNof_cctq.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_cctq.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_cctq.setValue( GXutil.rtrim( A11131Nof_cctq) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctq.getInternalname(), "Values", cmbNof_cctq.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Conformidad Cliente?", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_cccc, cmbNof_cccc.getInternalname(), GXutil.rtrim( A11132Nof_cccc), 1, cmbNof_cccc.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_cccc.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_cccc.setValue( GXutil.rtrim( A11132Nof_cccc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cccc.getInternalname(), "Values", cmbNof_cccc.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Etiquetas cono?", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccec, cmbNof_ccec.getInternalname(), GXutil.rtrim( A11133Nof_ccec), 1, cmbNof_ccec.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccec.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccec.setValue( GXutil.rtrim( A11133Nof_ccec) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccec.getInternalname(), "Values", cmbNof_ccec.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Muestras para el cliente Tipo?", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccmc1, cmbNof_ccmc1.getInternalname(), GXutil.rtrim( A11134Nof_ccmc1), 1, cmbNof_ccmc1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccmc1.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccmc1.setValue( GXutil.rtrim( A11134Nof_ccmc1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc1.getInternalname(), "Values", cmbNof_ccmc1.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Muestras para el cliente Tejido?", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccmc2, cmbNof_ccmc2.getInternalname(), GXutil.rtrim( A11135Nof_ccmc2), 1, cmbNof_ccmc2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccmc2.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccmc2.setValue( GXutil.rtrim( A11135Nof_ccmc2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc2.getInternalname(), "Values", cmbNof_ccmc2.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Muestras para el cliente Pestaña?", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccmc3, cmbNof_ccmc3.getInternalname(), GXutil.rtrim( A11136Nof_ccmc3), 1, cmbNof_ccmc3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccmc3.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccmc3.setValue( GXutil.rtrim( A11136Nof_ccmc3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc3.getInternalname(), "Values", cmbNof_ccmc3.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Muestras para el cliente Culote?", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccmc4, cmbNof_ccmc4.getInternalname(), GXutil.rtrim( A11137Nof_ccmc4), 1, cmbNof_ccmc4.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccmc4.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,206);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccmc4.setValue( GXutil.rtrim( A11137Nof_ccmc4) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc4.getInternalname(), "Values", cmbNof_ccmc4.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Muestras para el cliente Placa?", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccmc5, cmbNof_ccmc5.getInternalname(), GXutil.rtrim( A11138Nof_ccmc5), 1, cmbNof_ccmc5.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccmc5.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,211);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccmc5.setValue( GXutil.rtrim( A11138Nof_ccmc5) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc5.getInternalname(), "Values", cmbNof_ccmc5.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Muestras para el cliente Colorimetria?", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ccmc6, cmbNof_ccmc6.getInternalname(), GXutil.rtrim( A11139Nof_ccmc6), 1, cmbNof_ccmc6.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ccmc6.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ccmc6.setValue( GXutil.rtrim( A11139Nof_ccmc6) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc6.getInternalname(), "Values", cmbNof_ccmc6.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Comentarios Control Calidad", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c7_Internalname, A11140Nof_c7, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", (short)(0), 1, edtNof_c7_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Rebobinado?", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_rb, cmbNof_rb.getInternalname(), GXutil.rtrim( A11141Nof_rb), 1, cmbNof_rb.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_rb.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_rb.setValue( GXutil.rtrim( A11141Nof_rb) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb.getInternalname(), "Values", cmbNof_rb.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Rebobinado Interno?", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_rbi, cmbNof_rbi.getInternalname(), GXutil.rtrim( A11142Nof_rbi), 1, cmbNof_rbi.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_rbi.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,231);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_rbi.setValue( GXutil.rtrim( A11142Nof_rbi) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbi.getInternalname(), "Values", cmbNof_rbi.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Rebobinado Externo?", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_rbe, cmbNof_rbe.getInternalname(), GXutil.rtrim( A11143Nof_rbe), 1, cmbNof_rbe.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_rbe.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_rbe.setValue( GXutil.rtrim( A11143Nof_rbe) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbe.getInternalname(), "Values", cmbNof_rbe.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Parafinado?", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_rbp, cmbNof_rbp.getInternalname(), GXutil.rtrim( A11144Nof_rbp), 1, cmbNof_rbp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_rbp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_rbp.setValue( GXutil.rtrim( A11144Nof_rbp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbp.getInternalname(), "Values", cmbNof_rbp.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Obtener Conos", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_rboc_Internalname, GXutil.ltrim( localUtil.ntoc( A11145Nof_rboc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_rboc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11145Nof_rboc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11145Nof_rboc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_rboc_Jsonclick, 0, "", "", "", "", "", 1, edtNof_rboc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Conos para el control, Un Cono?", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_rb1, cmbNof_rb1.getInternalname(), GXutil.rtrim( A11146Nof_rb1), 1, cmbNof_rb1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_rb1.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_rb1.setValue( GXutil.rtrim( A11146Nof_rb1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb1.getInternalname(), "Values", cmbNof_rb1.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Conos para el control, Tres partes?", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_rb3, cmbNof_rb3.getInternalname(), GXutil.rtrim( A11147Nof_rb3), 1, cmbNof_rb3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_rb3.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,256);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_rb3.setValue( GXutil.rtrim( A11147Nof_rb3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb3.getInternalname(), "Values", cmbNof_rb3.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Comentarios Rebobinado", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c8_Internalname, A11148Nof_c8, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", (short)(0), 1, edtNof_c8_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Empaquetado Paletizado?", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep1, cmbNof_ep1.getInternalname(), GXutil.rtrim( A11149Nof_ep1), 1, cmbNof_ep1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep1.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep1.setValue( GXutil.rtrim( A11149Nof_ep1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep1.getInternalname(), "Values", cmbNof_ep1.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Empaquetado Cajas sin concretar?", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep2, cmbNof_ep2.getInternalname(), GXutil.rtrim( A11150Nof_ep2), 1, cmbNof_ep2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep2.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep2.setValue( GXutil.rtrim( A11150Nof_ep2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep2.getInternalname(), "Values", cmbNof_ep2.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Empaquetado Cajas Bros?", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep3, cmbNof_ep3.getInternalname(), GXutil.rtrim( A11151Nof_ep3), 1, cmbNof_ep3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep3.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,276);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep3.setValue( GXutil.rtrim( A11151Nof_ep3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep3.getInternalname(), "Values", cmbNof_ep3.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Empaquetado Cajas Cliente?", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep4, cmbNof_ep4.getInternalname(), GXutil.rtrim( A11152Nof_ep4), 1, cmbNof_ep4.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep4.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,281);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep4.setValue( GXutil.rtrim( A11152Nof_ep4) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep4.getInternalname(), "Values", cmbNof_ep4.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Empaquetado Bolsas?", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep5, cmbNof_ep5.getInternalname(), GXutil.rtrim( A11153Nof_ep5), 1, cmbNof_ep5.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep5.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,286);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep5.setValue( GXutil.rtrim( A11153Nof_ep5) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep5.getInternalname(), "Values", cmbNof_ep5.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Conos en Bolsas normales?", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep6, cmbNof_ep6.getInternalname(), GXutil.rtrim( A11154Nof_ep6), 1, cmbNof_ep6.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep6.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,291);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep6.setValue( GXutil.rtrim( A11154Nof_ep6) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep6.getInternalname(), "Values", cmbNof_ep6.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Conos en Bolsas perforadas?", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep7, cmbNof_ep7.getInternalname(), GXutil.rtrim( A11155Nof_ep7), 1, cmbNof_ep7.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep7.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,296);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep7.setValue( GXutil.rtrim( A11155Nof_ep7) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep7.getInternalname(), "Values", cmbNof_ep7.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Etiquetas conos?", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep8, cmbNof_ep8.getInternalname(), GXutil.rtrim( A11156Nof_ep8), 1, cmbNof_ep8.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep8.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,301);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep8.setValue( GXutil.rtrim( A11156Nof_ep8) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep8.getInternalname(), "Values", cmbNof_ep8.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Packing List?", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep9, cmbNof_ep9.getInternalname(), GXutil.rtrim( A11157Nof_ep9), 1, cmbNof_ep9.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep9.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,306);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep9.setValue( GXutil.rtrim( A11157Nof_ep9) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep9.getInternalname(), "Values", cmbNof_ep9.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Bruto-Tara-Neto?", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_ep10, cmbNof_ep10.getInternalname(), GXutil.rtrim( A11158Nof_ep10), 1, cmbNof_ep10.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_ep10.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,311);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_ep10.setValue( GXutil.rtrim( A11158Nof_ep10) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep10.getInternalname(), "Values", cmbNof_ep10.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Comentarios Empaquetado", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c9_Internalname, A11159Nof_c9, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,316);\"", (short)(0), 1, edtNof_c9_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Packing List?", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_sa1, cmbNof_sa1.getInternalname(), GXutil.rtrim( A11160Nof_sa1), 1, cmbNof_sa1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_sa1.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,321);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_sa1.setValue( GXutil.rtrim( A11160Nof_sa1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa1.getInternalname(), "Values", cmbNof_sa1.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Bruto-Tara-Neto?", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_sa2, cmbNof_sa2.getInternalname(), GXutil.rtrim( A11161Nof_sa2), 1, cmbNof_sa2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_sa2.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,326);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_sa2.setValue( GXutil.rtrim( A11161Nof_sa2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa2.getInternalname(), "Values", cmbNof_sa2.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Portes Pagados?", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_sa3, cmbNof_sa3.getInternalname(), GXutil.rtrim( A11162Nof_sa3), 1, cmbNof_sa3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_sa3.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,331);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_sa3.setValue( GXutil.rtrim( A11162Nof_sa3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa3.getInternalname(), "Values", cmbNof_sa3.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Portes Debidos?", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_sa4, cmbNof_sa4.getInternalname(), GXutil.rtrim( A11163Nof_sa4), 1, cmbNof_sa4.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_sa4.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_sa4.setValue( GXutil.rtrim( A11163Nof_sa4) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa4.getInternalname(), "Values", cmbNof_sa4.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Merma Asumida por BROS?", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_sa5, cmbNof_sa5.getInternalname(), GXutil.rtrim( A11164Nof_sa5), 1, cmbNof_sa5.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_sa5.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,341);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_sa5.setValue( GXutil.rtrim( A11164Nof_sa5) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa5.getInternalname(), "Values", cmbNof_sa5.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Merma Asumida por el CLIENTE?", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_sa6, cmbNof_sa6.getInternalname(), GXutil.rtrim( A11165Nof_sa6), 1, cmbNof_sa6.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_sa6.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,346);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_sa6.setValue( GXutil.rtrim( A11165Nof_sa6) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa6.getInternalname(), "Values", cmbNof_sa6.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Comentarios Salida", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c10_Internalname, A11166Nof_c10, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,351);\"", (short)(0), 1, edtNof_c10_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Nof para dejar en stock", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNof_stk, cmbNof_stk.getInternalname(), GXutil.rtrim( A11167Nof_stk), 1, cmbNof_stk.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNof_stk.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,356);\"", "", true, (byte)(0), "HLP_TNOFART.htm");
      cmbNof_stk.setValue( GXutil.rtrim( A11167Nof_stk) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_stk.getInternalname(), "Values", cmbNof_stk.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Tipo de Articulo", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 361,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_Lbta_Internalname, GXutil.rtrim( A11168Nof_Lbta), GXutil.rtrim( localUtil.format( A11168Nof_Lbta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,361);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_Lbta_Jsonclick, 0, "", "", "", "", "", 1, edtNof_Lbta_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "Temperatura del acabado", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 366,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_Lbtp_Internalname, GXutil.ltrim( localUtil.ntoc( A11169Nof_Lbtp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_Lbtp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11169Nof_Lbtp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11169Nof_Lbtp), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,366);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_Lbtp_Jsonclick, 0, "", "", "", "", "", 1, edtNof_Lbtp_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "Comentarios Nof en Stock", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 371,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c11_Internalname, A11170Nof_c11, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,371);\"", (short)(0), 1, edtNof_c11_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "Comentarios Laboratorio", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNof_c12_Internalname, A11171Nof_c12, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,376);\"", (short)(0), 1, edtNof_c12_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, httpContext.getMessage( "Imprimier Page 1", ""), "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp1_Internalname, GXutil.rtrim( A11388Nof_imp1), GXutil.rtrim( localUtil.format( A11388Nof_imp1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,381);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp1_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, httpContext.getMessage( "Imprimir Page 2", ""), "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp2_Internalname, GXutil.rtrim( A11389Nof_imp2), GXutil.rtrim( localUtil.format( A11389Nof_imp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,386);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp2_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock75_Internalname, httpContext.getMessage( "Imprimir Page 3", ""), "", "", lblTextblock75_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp3_Internalname, GXutil.rtrim( A11390Nof_imp3), GXutil.rtrim( localUtil.format( A11390Nof_imp3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,391);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp3_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, httpContext.getMessage( "Imprimir Page 4", ""), "", "", lblTextblock76_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp4_Internalname, GXutil.rtrim( A11391Nof_imp4), GXutil.rtrim( localUtil.format( A11391Nof_imp4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp4_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp4_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, httpContext.getMessage( "Imprimir Page 5", ""), "", "", lblTextblock77_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp5_Internalname, GXutil.rtrim( A11392Nof_imp5), GXutil.rtrim( localUtil.format( A11392Nof_imp5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,401);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp5_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp5_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, httpContext.getMessage( "Imprimir Page 6", ""), "", "", lblTextblock78_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp6_Internalname, GXutil.rtrim( A11393Nof_imp6), GXutil.rtrim( localUtil.format( A11393Nof_imp6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,406);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp6_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp6_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, httpContext.getMessage( "Imprimir Page 7", ""), "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp7_Internalname, GXutil.rtrim( A11394Nof_imp7), GXutil.rtrim( localUtil.format( A11394Nof_imp7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp7_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp7_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, httpContext.getMessage( "Imprimir Page 8", ""), "", "", lblTextblock80_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp8_Internalname, GXutil.rtrim( A11395Nof_imp8), GXutil.rtrim( localUtil.format( A11395Nof_imp8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,416);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp8_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp8_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, httpContext.getMessage( "Imprimir Page 9", ""), "", "", lblTextblock81_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 421,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp9_Internalname, GXutil.rtrim( A11396Nof_imp9), GXutil.rtrim( localUtil.format( A11396Nof_imp9, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,421);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp9_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp9_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock82_Internalname, httpContext.getMessage( "Imprimir Page 10", ""), "", "", lblTextblock82_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 426,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp10_Internalname, GXutil.rtrim( A11397Nof_imp10), GXutil.rtrim( localUtil.format( A11397Nof_imp10, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,426);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp10_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp10_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock83_Internalname, httpContext.getMessage( "Imprimir Page 11", ""), "", "", lblTextblock83_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 431,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_imp11_Internalname, GXutil.rtrim( A11398Nof_imp11), GXutil.rtrim( localUtil.format( A11398Nof_imp11, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,431);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_imp11_Jsonclick, 0, "", "", "", "", "", 1, edtNof_imp11_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, httpContext.getMessage( "Lavado", ""), "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 436,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_lavado_Internalname, GXutil.rtrim( A11399Nof_lavado), GXutil.rtrim( localUtil.format( A11399Nof_lavado, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,436);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_lavado_Jsonclick, 0, "", "", "", "", "", 1, edtNof_lavado_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, httpContext.getMessage( "Luz", ""), "", "", lblTextblock85_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 441,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_luz_Internalname, GXutil.rtrim( A11400Nof_luz), GXutil.rtrim( localUtil.format( A11400Nof_luz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,441);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_luz_Jsonclick, 0, "", "", "", "", "", 1, edtNof_luz_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock86_Internalname, httpContext.getMessage( "Sudor", ""), "", "", lblTextblock86_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 446,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_sudor_Internalname, GXutil.rtrim( A11401Nof_sudor), GXutil.rtrim( localUtil.format( A11401Nof_sudor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,446);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_sudor_Jsonclick, 0, "", "", "", "", "", 1, edtNof_sudor_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock87_Internalname, httpContext.getMessage( "Cloro", ""), "", "", lblTextblock87_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 451,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_cloro_Internalname, GXutil.rtrim( A11402Nof_cloro), GXutil.rtrim( localUtil.format( A11402Nof_cloro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,451);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_cloro_Jsonclick, 0, "", "", "", "", "", 1, edtNof_cloro_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock88_Internalname, httpContext.getMessage( "Agua de mar", ""), "", "", lblTextblock88_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 456,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_aguam_Internalname, GXutil.rtrim( A11403Nof_aguam), GXutil.rtrim( localUtil.format( A11403Nof_aguam, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,456);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_aguam_Jsonclick, 0, "", "", "", "", "", 1, edtNof_aguam_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock89_Internalname, httpContext.getMessage( "Termomigracion", ""), "", "", lblTextblock89_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 461,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_termom_Internalname, GXutil.rtrim( A11404Nof_termom), GXutil.rtrim( localUtil.format( A11404Nof_termom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,461);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_termom_Jsonclick, 0, "", "", "", "", "", 1, edtNof_termom_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock90_Internalname, httpContext.getMessage( "% Humedad", ""), "", "", lblTextblock90_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 466,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_humeda_Internalname, GXutil.ltrim( localUtil.ntoc( A11405Nof_humeda, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_humeda_Enabled!=0) ? localUtil.format( A11405Nof_humeda, "ZZ9.99") : localUtil.format( A11405Nof_humeda, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,466);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_humeda_Jsonclick, 0, "", "", "", "", "", 1, edtNof_humeda_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock91_Internalname, httpContext.getMessage( "Tintura OEKO TEX", ""), "", "", lblTextblock91_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 471,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_oekote_Internalname, GXutil.rtrim( A11406Nof_oekote), GXutil.rtrim( localUtil.format( A11406Nof_oekote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,471);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_oekote_Jsonclick, 0, "", "", "", "", "", 1, edtNof_oekote_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock92_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 1", ""), "", "", lblTextblock92_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 476,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs1_Internalname, GXutil.rtrim( A11418Nof_obs1), GXutil.rtrim( localUtil.format( A11418Nof_obs1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,476);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs1_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock93_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 2", ""), "", "", lblTextblock93_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 481,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs2_Internalname, GXutil.rtrim( A11419Nof_obs2), GXutil.rtrim( localUtil.format( A11419Nof_obs2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,481);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs2_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock94_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 3", ""), "", "", lblTextblock94_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 486,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs3_Internalname, GXutil.rtrim( A11420Nof_obs3), GXutil.rtrim( localUtil.format( A11420Nof_obs3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,486);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs3_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock95_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 4", ""), "", "", lblTextblock95_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 491,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs4_Internalname, GXutil.rtrim( A11421Nof_obs4), GXutil.rtrim( localUtil.format( A11421Nof_obs4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,491);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs4_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs4_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock96_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 5", ""), "", "", lblTextblock96_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 496,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs5_Internalname, GXutil.rtrim( A11422Nof_obs5), GXutil.rtrim( localUtil.format( A11422Nof_obs5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,496);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs5_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs5_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock97_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 6", ""), "", "", lblTextblock97_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 501,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs6_Internalname, GXutil.rtrim( A11423Nof_obs6), GXutil.rtrim( localUtil.format( A11423Nof_obs6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,501);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs6_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs6_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock98_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 7", ""), "", "", lblTextblock98_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 506,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs7_Internalname, GXutil.rtrim( A11424Nof_obs7), GXutil.rtrim( localUtil.format( A11424Nof_obs7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,506);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs7_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs7_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock99_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 8", ""), "", "", lblTextblock99_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 511,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs8_Internalname, GXutil.rtrim( A11425Nof_obs8), GXutil.rtrim( localUtil.format( A11425Nof_obs8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,511);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs8_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs8_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock100_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 9", ""), "", "", lblTextblock100_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 516,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs9_Internalname, GXutil.rtrim( A11426Nof_obs9), GXutil.rtrim( localUtil.format( A11426Nof_obs9, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,516);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs9_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs9_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock101_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 10", ""), "", "", lblTextblock101_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 521,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs10_Internalname, GXutil.rtrim( A11427Nof_obs10), GXutil.rtrim( localUtil.format( A11427Nof_obs10, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,521);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs10_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs10_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock102_Internalname, httpContext.getMessage( "Imprimir Comentarios Page 11", ""), "", "", lblTextblock102_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 526,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_obs11_Internalname, GXutil.rtrim( A11428Nof_obs11), GXutil.rtrim( localUtil.format( A11428Nof_obs11, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,526);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_obs11_Jsonclick, 0, "", "", "", "", "", 1, edtNof_obs11_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock103_Internalname, httpContext.getMessage( "N Copias Albaran", ""), "", "", lblTextblock103_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 531,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_nc_Internalname, GXutil.ltrim( localUtil.ntoc( A11709Nof_nc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_nc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11709Nof_nc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11709Nof_nc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,531);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_nc_Jsonclick, 0, "", "", "", "", "", 1, edtNof_nc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock104_Internalname, httpContext.getMessage( "Encogimiento", ""), "", "", lblTextblock104_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 536,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNof_enc_Internalname, GXutil.ltrim( localUtil.ntoc( A11710Nof_enc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNof_enc_Enabled!=0) ? localUtil.format( A11710Nof_enc, "ZZ9.99") : localUtil.format( A11710Nof_enc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,536);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNof_enc_Jsonclick, 0, "", "", "", "", "", 1, edtNof_enc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOFART.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 539,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 540,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 541,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 542,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOFART.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 543,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TNOFART.htm");
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
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111AP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11103Nof_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z11103Nof_Hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11104Nof_r = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11104Nof_r"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11105Nof_p = httpContext.cgiGet( "Z11105Nof_p") ;
            Z11106Nof_Pd = httpContext.cgiGet( "Z11106Nof_Pd") ;
            Z11107Nof_Mcot = httpContext.cgiGet( "Z11107Nof_Mcot") ;
            Z11108Nof_Pp = httpContext.cgiGet( "Z11108Nof_Pp") ;
            Z11109Nof_Ag = httpContext.cgiGet( "Z11109Nof_Ag") ;
            Z11110Nof_c1 = httpContext.cgiGet( "Z11110Nof_c1") ;
            Z11111Nof_c2 = httpContext.cgiGet( "Z11111Nof_c2") ;
            Z11112Nof_bo = httpContext.cgiGet( "Z11112Nof_bo") ;
            Z11113Nof_bob = httpContext.cgiGet( "Z11113Nof_bob") ;
            Z11114Nof_boe = httpContext.cgiGet( "Z11114Nof_boe") ;
            Z11115Nof_Bov = httpContext.cgiGet( "Z11115Nof_Bov") ;
            Z11116Nof_c3 = httpContext.cgiGet( "Z11116Nof_c3") ;
            Z11117Nof_tns = httpContext.cgiGet( "Z11117Nof_tns") ;
            Z11118Nof_tnc = httpContext.cgiGet( "Z11118Nof_tnc") ;
            Z11119Nof_c4 = httpContext.cgiGet( "Z11119Nof_c4") ;
            Z11120Nof_ct = httpContext.cgiGet( "Z11120Nof_ct") ;
            Z11121Nof_c5 = httpContext.cgiGet( "Z11121Nof_c5") ;
            Z11122Nof_scs = httpContext.cgiGet( "Z11122Nof_scs") ;
            Z11123Nof_scc = httpContext.cgiGet( "Z11123Nof_scc") ;
            Z11124Nof_c6 = httpContext.cgiGet( "Z11124Nof_c6") ;
            Z11125Nof_cctse = httpContext.cgiGet( "Z11125Nof_cctse") ;
            Z11126Nof_ccttp = httpContext.cgiGet( "Z11126Nof_ccttp") ;
            Z11127Nof_cctet = httpContext.cgiGet( "Z11127Nof_cctet") ;
            Z11128Nof_ccp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11128Nof_ccp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11129Nof_cct = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11129Nof_cct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11130Nof_ccpc = httpContext.cgiGet( "Z11130Nof_ccpc") ;
            Z11131Nof_cctq = httpContext.cgiGet( "Z11131Nof_cctq") ;
            Z11132Nof_cccc = httpContext.cgiGet( "Z11132Nof_cccc") ;
            Z11133Nof_ccec = httpContext.cgiGet( "Z11133Nof_ccec") ;
            Z11134Nof_ccmc1 = httpContext.cgiGet( "Z11134Nof_ccmc1") ;
            Z11135Nof_ccmc2 = httpContext.cgiGet( "Z11135Nof_ccmc2") ;
            Z11136Nof_ccmc3 = httpContext.cgiGet( "Z11136Nof_ccmc3") ;
            Z11137Nof_ccmc4 = httpContext.cgiGet( "Z11137Nof_ccmc4") ;
            Z11138Nof_ccmc5 = httpContext.cgiGet( "Z11138Nof_ccmc5") ;
            Z11139Nof_ccmc6 = httpContext.cgiGet( "Z11139Nof_ccmc6") ;
            Z11140Nof_c7 = httpContext.cgiGet( "Z11140Nof_c7") ;
            Z11141Nof_rb = httpContext.cgiGet( "Z11141Nof_rb") ;
            Z11142Nof_rbi = httpContext.cgiGet( "Z11142Nof_rbi") ;
            Z11143Nof_rbe = httpContext.cgiGet( "Z11143Nof_rbe") ;
            Z11144Nof_rbp = httpContext.cgiGet( "Z11144Nof_rbp") ;
            Z11145Nof_rboc = (short)(localUtil.ctol( httpContext.cgiGet( "Z11145Nof_rboc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11146Nof_rb1 = httpContext.cgiGet( "Z11146Nof_rb1") ;
            Z11147Nof_rb3 = httpContext.cgiGet( "Z11147Nof_rb3") ;
            Z11148Nof_c8 = httpContext.cgiGet( "Z11148Nof_c8") ;
            Z11149Nof_ep1 = httpContext.cgiGet( "Z11149Nof_ep1") ;
            Z11150Nof_ep2 = httpContext.cgiGet( "Z11150Nof_ep2") ;
            Z11151Nof_ep3 = httpContext.cgiGet( "Z11151Nof_ep3") ;
            Z11152Nof_ep4 = httpContext.cgiGet( "Z11152Nof_ep4") ;
            Z11153Nof_ep5 = httpContext.cgiGet( "Z11153Nof_ep5") ;
            Z11154Nof_ep6 = httpContext.cgiGet( "Z11154Nof_ep6") ;
            Z11155Nof_ep7 = httpContext.cgiGet( "Z11155Nof_ep7") ;
            Z11156Nof_ep8 = httpContext.cgiGet( "Z11156Nof_ep8") ;
            Z11157Nof_ep9 = httpContext.cgiGet( "Z11157Nof_ep9") ;
            Z11158Nof_ep10 = httpContext.cgiGet( "Z11158Nof_ep10") ;
            Z11159Nof_c9 = httpContext.cgiGet( "Z11159Nof_c9") ;
            Z11160Nof_sa1 = httpContext.cgiGet( "Z11160Nof_sa1") ;
            Z11161Nof_sa2 = httpContext.cgiGet( "Z11161Nof_sa2") ;
            Z11162Nof_sa3 = httpContext.cgiGet( "Z11162Nof_sa3") ;
            Z11163Nof_sa4 = httpContext.cgiGet( "Z11163Nof_sa4") ;
            Z11164Nof_sa5 = httpContext.cgiGet( "Z11164Nof_sa5") ;
            Z11165Nof_sa6 = httpContext.cgiGet( "Z11165Nof_sa6") ;
            Z11166Nof_c10 = httpContext.cgiGet( "Z11166Nof_c10") ;
            Z11167Nof_stk = httpContext.cgiGet( "Z11167Nof_stk") ;
            Z11168Nof_Lbta = httpContext.cgiGet( "Z11168Nof_Lbta") ;
            Z11169Nof_Lbtp = (short)(localUtil.ctol( httpContext.cgiGet( "Z11169Nof_Lbtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11170Nof_c11 = httpContext.cgiGet( "Z11170Nof_c11") ;
            Z11171Nof_c12 = httpContext.cgiGet( "Z11171Nof_c12") ;
            Z11388Nof_imp1 = httpContext.cgiGet( "Z11388Nof_imp1") ;
            Z11389Nof_imp2 = httpContext.cgiGet( "Z11389Nof_imp2") ;
            Z11390Nof_imp3 = httpContext.cgiGet( "Z11390Nof_imp3") ;
            Z11391Nof_imp4 = httpContext.cgiGet( "Z11391Nof_imp4") ;
            Z11392Nof_imp5 = httpContext.cgiGet( "Z11392Nof_imp5") ;
            Z11393Nof_imp6 = httpContext.cgiGet( "Z11393Nof_imp6") ;
            Z11394Nof_imp7 = httpContext.cgiGet( "Z11394Nof_imp7") ;
            Z11395Nof_imp8 = httpContext.cgiGet( "Z11395Nof_imp8") ;
            Z11396Nof_imp9 = httpContext.cgiGet( "Z11396Nof_imp9") ;
            Z11397Nof_imp10 = httpContext.cgiGet( "Z11397Nof_imp10") ;
            Z11398Nof_imp11 = httpContext.cgiGet( "Z11398Nof_imp11") ;
            Z11399Nof_lavado = httpContext.cgiGet( "Z11399Nof_lavado") ;
            Z11400Nof_luz = httpContext.cgiGet( "Z11400Nof_luz") ;
            Z11401Nof_sudor = httpContext.cgiGet( "Z11401Nof_sudor") ;
            Z11402Nof_cloro = httpContext.cgiGet( "Z11402Nof_cloro") ;
            Z11403Nof_aguam = httpContext.cgiGet( "Z11403Nof_aguam") ;
            Z11404Nof_termom = httpContext.cgiGet( "Z11404Nof_termom") ;
            Z11405Nof_humeda = localUtil.ctond( httpContext.cgiGet( "Z11405Nof_humeda")) ;
            Z11406Nof_oekote = httpContext.cgiGet( "Z11406Nof_oekote") ;
            Z11418Nof_obs1 = httpContext.cgiGet( "Z11418Nof_obs1") ;
            Z11419Nof_obs2 = httpContext.cgiGet( "Z11419Nof_obs2") ;
            Z11420Nof_obs3 = httpContext.cgiGet( "Z11420Nof_obs3") ;
            Z11421Nof_obs4 = httpContext.cgiGet( "Z11421Nof_obs4") ;
            Z11422Nof_obs5 = httpContext.cgiGet( "Z11422Nof_obs5") ;
            Z11423Nof_obs6 = httpContext.cgiGet( "Z11423Nof_obs6") ;
            Z11424Nof_obs7 = httpContext.cgiGet( "Z11424Nof_obs7") ;
            Z11425Nof_obs8 = httpContext.cgiGet( "Z11425Nof_obs8") ;
            Z11426Nof_obs9 = httpContext.cgiGet( "Z11426Nof_obs9") ;
            Z11427Nof_obs10 = httpContext.cgiGet( "Z11427Nof_obs10") ;
            Z11428Nof_obs11 = httpContext.cgiGet( "Z11428Nof_obs11") ;
            Z11709Nof_nc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11709Nof_nc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11710Nof_enc = localUtil.ctond( httpContext.cgiGet( "Z11710Nof_enc")) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11103Nof_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtNof_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11103Nof_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11103Nof_Hdr), 8, 0));
            A11104Nof_r = (byte)(localUtil.ctol( httpContext.cgiGet( edtNof_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11104Nof_r", GXutil.str( A11104Nof_r, 1, 0));
            A11105Nof_p = httpContext.cgiGet( edtNof_p_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11105Nof_p", A11105Nof_p);
            cmbNof_Pd.setValue( httpContext.cgiGet( cmbNof_Pd.getInternalname()) );
            A11106Nof_Pd = httpContext.cgiGet( cmbNof_Pd.getInternalname()) ;
            n11106Nof_Pd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
            cmbNof_Mcot.setValue( httpContext.cgiGet( cmbNof_Mcot.getInternalname()) );
            A11107Nof_Mcot = httpContext.cgiGet( cmbNof_Mcot.getInternalname()) ;
            n11107Nof_Mcot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
            cmbNof_Pp.setValue( httpContext.cgiGet( cmbNof_Pp.getInternalname()) );
            A11108Nof_Pp = httpContext.cgiGet( cmbNof_Pp.getInternalname()) ;
            n11108Nof_Pp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
            cmbNof_Ag.setValue( httpContext.cgiGet( cmbNof_Ag.getInternalname()) );
            A11109Nof_Ag = httpContext.cgiGet( cmbNof_Ag.getInternalname()) ;
            n11109Nof_Ag = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            A11110Nof_c1 = httpContext.cgiGet( edtNof_c1_Internalname) ;
            n11110Nof_c1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11110Nof_c1", A11110Nof_c1);
            A11111Nof_c2 = httpContext.cgiGet( edtNof_c2_Internalname) ;
            n11111Nof_c2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11111Nof_c2", A11111Nof_c2);
            cmbNof_bo.setValue( httpContext.cgiGet( cmbNof_bo.getInternalname()) );
            A11112Nof_bo = httpContext.cgiGet( cmbNof_bo.getInternalname()) ;
            n11112Nof_bo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
            cmbNof_bob.setValue( httpContext.cgiGet( cmbNof_bob.getInternalname()) );
            A11113Nof_bob = httpContext.cgiGet( cmbNof_bob.getInternalname()) ;
            n11113Nof_bob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
            cmbNof_boe.setValue( httpContext.cgiGet( cmbNof_boe.getInternalname()) );
            A11114Nof_boe = httpContext.cgiGet( cmbNof_boe.getInternalname()) ;
            n11114Nof_boe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
            cmbNof_Bov.setValue( httpContext.cgiGet( cmbNof_Bov.getInternalname()) );
            A11115Nof_Bov = httpContext.cgiGet( cmbNof_Bov.getInternalname()) ;
            n11115Nof_Bov = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11115Nof_Bov", A11115Nof_Bov);
            A11116Nof_c3 = httpContext.cgiGet( edtNof_c3_Internalname) ;
            n11116Nof_c3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11116Nof_c3", A11116Nof_c3);
            cmbNof_tns.setValue( httpContext.cgiGet( cmbNof_tns.getInternalname()) );
            A11117Nof_tns = httpContext.cgiGet( cmbNof_tns.getInternalname()) ;
            n11117Nof_tns = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
            cmbNof_tnc.setValue( httpContext.cgiGet( cmbNof_tnc.getInternalname()) );
            A11118Nof_tnc = httpContext.cgiGet( cmbNof_tnc.getInternalname()) ;
            n11118Nof_tnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
            A11119Nof_c4 = httpContext.cgiGet( edtNof_c4_Internalname) ;
            n11119Nof_c4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11119Nof_c4", A11119Nof_c4);
            cmbNof_ct.setValue( httpContext.cgiGet( cmbNof_ct.getInternalname()) );
            A11120Nof_ct = httpContext.cgiGet( cmbNof_ct.getInternalname()) ;
            n11120Nof_ct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
            A11121Nof_c5 = httpContext.cgiGet( edtNof_c5_Internalname) ;
            n11121Nof_c5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11121Nof_c5", A11121Nof_c5);
            cmbNof_scs.setValue( httpContext.cgiGet( cmbNof_scs.getInternalname()) );
            A11122Nof_scs = httpContext.cgiGet( cmbNof_scs.getInternalname()) ;
            n11122Nof_scs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
            cmbNof_scc.setValue( httpContext.cgiGet( cmbNof_scc.getInternalname()) );
            A11123Nof_scc = httpContext.cgiGet( cmbNof_scc.getInternalname()) ;
            n11123Nof_scc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
            A11124Nof_c6 = httpContext.cgiGet( edtNof_c6_Internalname) ;
            n11124Nof_c6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11124Nof_c6", A11124Nof_c6);
            cmbNof_cctse.setValue( httpContext.cgiGet( cmbNof_cctse.getInternalname()) );
            A11125Nof_cctse = httpContext.cgiGet( cmbNof_cctse.getInternalname()) ;
            n11125Nof_cctse = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
            cmbNof_ccttp.setValue( httpContext.cgiGet( cmbNof_ccttp.getInternalname()) );
            A11126Nof_ccttp = httpContext.cgiGet( cmbNof_ccttp.getInternalname()) ;
            n11126Nof_ccttp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
            cmbNof_cctet.setValue( httpContext.cgiGet( cmbNof_cctet.getInternalname()) );
            A11127Nof_cctet = httpContext.cgiGet( cmbNof_cctet.getInternalname()) ;
            n11127Nof_cctet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNof_ccp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNof_ccp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOF_CCP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNof_ccp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11128Nof_ccp = (byte)(0) ;
               n11128Nof_ccp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11128Nof_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11128Nof_ccp), 2, 0));
            }
            else
            {
               A11128Nof_ccp = (byte)(localUtil.ctol( httpContext.cgiGet( edtNof_ccp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11128Nof_ccp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11128Nof_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11128Nof_ccp), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNof_cct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNof_cct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOF_CCT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNof_cct_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11129Nof_cct = (byte)(0) ;
               n11129Nof_cct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11129Nof_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11129Nof_cct), 2, 0));
            }
            else
            {
               A11129Nof_cct = (byte)(localUtil.ctol( httpContext.cgiGet( edtNof_cct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11129Nof_cct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11129Nof_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11129Nof_cct), 2, 0));
            }
            cmbNof_ccpc.setValue( httpContext.cgiGet( cmbNof_ccpc.getInternalname()) );
            A11130Nof_ccpc = httpContext.cgiGet( cmbNof_ccpc.getInternalname()) ;
            n11130Nof_ccpc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
            cmbNof_cctq.setValue( httpContext.cgiGet( cmbNof_cctq.getInternalname()) );
            A11131Nof_cctq = httpContext.cgiGet( cmbNof_cctq.getInternalname()) ;
            n11131Nof_cctq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
            cmbNof_cccc.setValue( httpContext.cgiGet( cmbNof_cccc.getInternalname()) );
            A11132Nof_cccc = httpContext.cgiGet( cmbNof_cccc.getInternalname()) ;
            n11132Nof_cccc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
            cmbNof_ccec.setValue( httpContext.cgiGet( cmbNof_ccec.getInternalname()) );
            A11133Nof_ccec = httpContext.cgiGet( cmbNof_ccec.getInternalname()) ;
            n11133Nof_ccec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
            cmbNof_ccmc1.setValue( httpContext.cgiGet( cmbNof_ccmc1.getInternalname()) );
            A11134Nof_ccmc1 = httpContext.cgiGet( cmbNof_ccmc1.getInternalname()) ;
            n11134Nof_ccmc1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
            cmbNof_ccmc2.setValue( httpContext.cgiGet( cmbNof_ccmc2.getInternalname()) );
            A11135Nof_ccmc2 = httpContext.cgiGet( cmbNof_ccmc2.getInternalname()) ;
            n11135Nof_ccmc2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
            cmbNof_ccmc3.setValue( httpContext.cgiGet( cmbNof_ccmc3.getInternalname()) );
            A11136Nof_ccmc3 = httpContext.cgiGet( cmbNof_ccmc3.getInternalname()) ;
            n11136Nof_ccmc3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
            cmbNof_ccmc4.setValue( httpContext.cgiGet( cmbNof_ccmc4.getInternalname()) );
            A11137Nof_ccmc4 = httpContext.cgiGet( cmbNof_ccmc4.getInternalname()) ;
            n11137Nof_ccmc4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
            cmbNof_ccmc5.setValue( httpContext.cgiGet( cmbNof_ccmc5.getInternalname()) );
            A11138Nof_ccmc5 = httpContext.cgiGet( cmbNof_ccmc5.getInternalname()) ;
            n11138Nof_ccmc5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
            cmbNof_ccmc6.setValue( httpContext.cgiGet( cmbNof_ccmc6.getInternalname()) );
            A11139Nof_ccmc6 = httpContext.cgiGet( cmbNof_ccmc6.getInternalname()) ;
            n11139Nof_ccmc6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
            A11140Nof_c7 = httpContext.cgiGet( edtNof_c7_Internalname) ;
            n11140Nof_c7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11140Nof_c7", A11140Nof_c7);
            cmbNof_rb.setValue( httpContext.cgiGet( cmbNof_rb.getInternalname()) );
            A11141Nof_rb = httpContext.cgiGet( cmbNof_rb.getInternalname()) ;
            n11141Nof_rb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
            cmbNof_rbi.setValue( httpContext.cgiGet( cmbNof_rbi.getInternalname()) );
            A11142Nof_rbi = httpContext.cgiGet( cmbNof_rbi.getInternalname()) ;
            n11142Nof_rbi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
            cmbNof_rbe.setValue( httpContext.cgiGet( cmbNof_rbe.getInternalname()) );
            A11143Nof_rbe = httpContext.cgiGet( cmbNof_rbe.getInternalname()) ;
            n11143Nof_rbe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
            cmbNof_rbp.setValue( httpContext.cgiGet( cmbNof_rbp.getInternalname()) );
            A11144Nof_rbp = httpContext.cgiGet( cmbNof_rbp.getInternalname()) ;
            n11144Nof_rbp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNof_rboc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNof_rboc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOF_RBOC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNof_rboc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11145Nof_rboc = (short)(0) ;
               n11145Nof_rboc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11145Nof_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11145Nof_rboc), 3, 0));
            }
            else
            {
               A11145Nof_rboc = (short)(localUtil.ctol( httpContext.cgiGet( edtNof_rboc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11145Nof_rboc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11145Nof_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11145Nof_rboc), 3, 0));
            }
            cmbNof_rb1.setValue( httpContext.cgiGet( cmbNof_rb1.getInternalname()) );
            A11146Nof_rb1 = httpContext.cgiGet( cmbNof_rb1.getInternalname()) ;
            n11146Nof_rb1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
            cmbNof_rb3.setValue( httpContext.cgiGet( cmbNof_rb3.getInternalname()) );
            A11147Nof_rb3 = httpContext.cgiGet( cmbNof_rb3.getInternalname()) ;
            n11147Nof_rb3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
            A11148Nof_c8 = httpContext.cgiGet( edtNof_c8_Internalname) ;
            n11148Nof_c8 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11148Nof_c8", A11148Nof_c8);
            cmbNof_ep1.setValue( httpContext.cgiGet( cmbNof_ep1.getInternalname()) );
            A11149Nof_ep1 = httpContext.cgiGet( cmbNof_ep1.getInternalname()) ;
            n11149Nof_ep1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
            cmbNof_ep2.setValue( httpContext.cgiGet( cmbNof_ep2.getInternalname()) );
            A11150Nof_ep2 = httpContext.cgiGet( cmbNof_ep2.getInternalname()) ;
            n11150Nof_ep2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
            cmbNof_ep3.setValue( httpContext.cgiGet( cmbNof_ep3.getInternalname()) );
            A11151Nof_ep3 = httpContext.cgiGet( cmbNof_ep3.getInternalname()) ;
            n11151Nof_ep3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
            cmbNof_ep4.setValue( httpContext.cgiGet( cmbNof_ep4.getInternalname()) );
            A11152Nof_ep4 = httpContext.cgiGet( cmbNof_ep4.getInternalname()) ;
            n11152Nof_ep4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
            cmbNof_ep5.setValue( httpContext.cgiGet( cmbNof_ep5.getInternalname()) );
            A11153Nof_ep5 = httpContext.cgiGet( cmbNof_ep5.getInternalname()) ;
            n11153Nof_ep5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
            cmbNof_ep6.setValue( httpContext.cgiGet( cmbNof_ep6.getInternalname()) );
            A11154Nof_ep6 = httpContext.cgiGet( cmbNof_ep6.getInternalname()) ;
            n11154Nof_ep6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
            cmbNof_ep7.setValue( httpContext.cgiGet( cmbNof_ep7.getInternalname()) );
            A11155Nof_ep7 = httpContext.cgiGet( cmbNof_ep7.getInternalname()) ;
            n11155Nof_ep7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
            cmbNof_ep8.setValue( httpContext.cgiGet( cmbNof_ep8.getInternalname()) );
            A11156Nof_ep8 = httpContext.cgiGet( cmbNof_ep8.getInternalname()) ;
            n11156Nof_ep8 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
            cmbNof_ep9.setValue( httpContext.cgiGet( cmbNof_ep9.getInternalname()) );
            A11157Nof_ep9 = httpContext.cgiGet( cmbNof_ep9.getInternalname()) ;
            n11157Nof_ep9 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
            cmbNof_ep10.setValue( httpContext.cgiGet( cmbNof_ep10.getInternalname()) );
            A11158Nof_ep10 = httpContext.cgiGet( cmbNof_ep10.getInternalname()) ;
            n11158Nof_ep10 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
            A11159Nof_c9 = httpContext.cgiGet( edtNof_c9_Internalname) ;
            n11159Nof_c9 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11159Nof_c9", A11159Nof_c9);
            cmbNof_sa1.setValue( httpContext.cgiGet( cmbNof_sa1.getInternalname()) );
            A11160Nof_sa1 = httpContext.cgiGet( cmbNof_sa1.getInternalname()) ;
            n11160Nof_sa1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
            cmbNof_sa2.setValue( httpContext.cgiGet( cmbNof_sa2.getInternalname()) );
            A11161Nof_sa2 = httpContext.cgiGet( cmbNof_sa2.getInternalname()) ;
            n11161Nof_sa2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
            cmbNof_sa3.setValue( httpContext.cgiGet( cmbNof_sa3.getInternalname()) );
            A11162Nof_sa3 = httpContext.cgiGet( cmbNof_sa3.getInternalname()) ;
            n11162Nof_sa3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
            cmbNof_sa4.setValue( httpContext.cgiGet( cmbNof_sa4.getInternalname()) );
            A11163Nof_sa4 = httpContext.cgiGet( cmbNof_sa4.getInternalname()) ;
            n11163Nof_sa4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11163Nof_sa4", A11163Nof_sa4);
            cmbNof_sa5.setValue( httpContext.cgiGet( cmbNof_sa5.getInternalname()) );
            A11164Nof_sa5 = httpContext.cgiGet( cmbNof_sa5.getInternalname()) ;
            n11164Nof_sa5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
            cmbNof_sa6.setValue( httpContext.cgiGet( cmbNof_sa6.getInternalname()) );
            A11165Nof_sa6 = httpContext.cgiGet( cmbNof_sa6.getInternalname()) ;
            n11165Nof_sa6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
            A11166Nof_c10 = httpContext.cgiGet( edtNof_c10_Internalname) ;
            n11166Nof_c10 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11166Nof_c10", A11166Nof_c10);
            cmbNof_stk.setValue( httpContext.cgiGet( cmbNof_stk.getInternalname()) );
            A11167Nof_stk = httpContext.cgiGet( cmbNof_stk.getInternalname()) ;
            n11167Nof_stk = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
            A11168Nof_Lbta = httpContext.cgiGet( edtNof_Lbta_Internalname) ;
            n11168Nof_Lbta = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11168Nof_Lbta", A11168Nof_Lbta);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNof_Lbtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNof_Lbtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOF_LBTP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNof_Lbtp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11169Nof_Lbtp = (short)(0) ;
               n11169Nof_Lbtp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11169Nof_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11169Nof_Lbtp), 4, 0));
            }
            else
            {
               A11169Nof_Lbtp = (short)(localUtil.ctol( httpContext.cgiGet( edtNof_Lbtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11169Nof_Lbtp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11169Nof_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11169Nof_Lbtp), 4, 0));
            }
            A11170Nof_c11 = httpContext.cgiGet( edtNof_c11_Internalname) ;
            n11170Nof_c11 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11170Nof_c11", A11170Nof_c11);
            A11171Nof_c12 = httpContext.cgiGet( edtNof_c12_Internalname) ;
            n11171Nof_c12 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11171Nof_c12", A11171Nof_c12);
            A11388Nof_imp1 = httpContext.cgiGet( edtNof_imp1_Internalname) ;
            n11388Nof_imp1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11388Nof_imp1", A11388Nof_imp1);
            A11389Nof_imp2 = httpContext.cgiGet( edtNof_imp2_Internalname) ;
            n11389Nof_imp2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11389Nof_imp2", A11389Nof_imp2);
            A11390Nof_imp3 = httpContext.cgiGet( edtNof_imp3_Internalname) ;
            n11390Nof_imp3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11390Nof_imp3", A11390Nof_imp3);
            A11391Nof_imp4 = httpContext.cgiGet( edtNof_imp4_Internalname) ;
            n11391Nof_imp4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11391Nof_imp4", A11391Nof_imp4);
            A11392Nof_imp5 = httpContext.cgiGet( edtNof_imp5_Internalname) ;
            n11392Nof_imp5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11392Nof_imp5", A11392Nof_imp5);
            A11393Nof_imp6 = httpContext.cgiGet( edtNof_imp6_Internalname) ;
            n11393Nof_imp6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11393Nof_imp6", A11393Nof_imp6);
            A11394Nof_imp7 = httpContext.cgiGet( edtNof_imp7_Internalname) ;
            n11394Nof_imp7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11394Nof_imp7", A11394Nof_imp7);
            A11395Nof_imp8 = httpContext.cgiGet( edtNof_imp8_Internalname) ;
            n11395Nof_imp8 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11395Nof_imp8", A11395Nof_imp8);
            A11396Nof_imp9 = httpContext.cgiGet( edtNof_imp9_Internalname) ;
            n11396Nof_imp9 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11396Nof_imp9", A11396Nof_imp9);
            A11397Nof_imp10 = httpContext.cgiGet( edtNof_imp10_Internalname) ;
            n11397Nof_imp10 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11397Nof_imp10", A11397Nof_imp10);
            A11398Nof_imp11 = httpContext.cgiGet( edtNof_imp11_Internalname) ;
            n11398Nof_imp11 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11398Nof_imp11", A11398Nof_imp11);
            A11399Nof_lavado = httpContext.cgiGet( edtNof_lavado_Internalname) ;
            n11399Nof_lavado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11399Nof_lavado", A11399Nof_lavado);
            A11400Nof_luz = httpContext.cgiGet( edtNof_luz_Internalname) ;
            n11400Nof_luz = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11400Nof_luz", A11400Nof_luz);
            A11401Nof_sudor = httpContext.cgiGet( edtNof_sudor_Internalname) ;
            n11401Nof_sudor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11401Nof_sudor", A11401Nof_sudor);
            A11402Nof_cloro = httpContext.cgiGet( edtNof_cloro_Internalname) ;
            n11402Nof_cloro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11402Nof_cloro", A11402Nof_cloro);
            A11403Nof_aguam = httpContext.cgiGet( edtNof_aguam_Internalname) ;
            n11403Nof_aguam = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11403Nof_aguam", A11403Nof_aguam);
            A11404Nof_termom = httpContext.cgiGet( edtNof_termom_Internalname) ;
            n11404Nof_termom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11404Nof_termom", A11404Nof_termom);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtNof_humeda_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtNof_humeda_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOF_HUMEDA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNof_humeda_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11405Nof_humeda = DecimalUtil.ZERO ;
               n11405Nof_humeda = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11405Nof_humeda", GXutil.ltrimstr( A11405Nof_humeda, 6, 2));
            }
            else
            {
               A11405Nof_humeda = localUtil.ctond( httpContext.cgiGet( edtNof_humeda_Internalname)) ;
               n11405Nof_humeda = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11405Nof_humeda", GXutil.ltrimstr( A11405Nof_humeda, 6, 2));
            }
            A11406Nof_oekote = httpContext.cgiGet( edtNof_oekote_Internalname) ;
            n11406Nof_oekote = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11406Nof_oekote", A11406Nof_oekote);
            A11418Nof_obs1 = httpContext.cgiGet( edtNof_obs1_Internalname) ;
            n11418Nof_obs1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11418Nof_obs1", A11418Nof_obs1);
            A11419Nof_obs2 = httpContext.cgiGet( edtNof_obs2_Internalname) ;
            n11419Nof_obs2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11419Nof_obs2", A11419Nof_obs2);
            A11420Nof_obs3 = httpContext.cgiGet( edtNof_obs3_Internalname) ;
            n11420Nof_obs3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11420Nof_obs3", A11420Nof_obs3);
            A11421Nof_obs4 = httpContext.cgiGet( edtNof_obs4_Internalname) ;
            n11421Nof_obs4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11421Nof_obs4", A11421Nof_obs4);
            A11422Nof_obs5 = httpContext.cgiGet( edtNof_obs5_Internalname) ;
            n11422Nof_obs5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11422Nof_obs5", A11422Nof_obs5);
            A11423Nof_obs6 = httpContext.cgiGet( edtNof_obs6_Internalname) ;
            n11423Nof_obs6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11423Nof_obs6", A11423Nof_obs6);
            A11424Nof_obs7 = httpContext.cgiGet( edtNof_obs7_Internalname) ;
            n11424Nof_obs7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11424Nof_obs7", A11424Nof_obs7);
            A11425Nof_obs8 = httpContext.cgiGet( edtNof_obs8_Internalname) ;
            n11425Nof_obs8 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11425Nof_obs8", A11425Nof_obs8);
            A11426Nof_obs9 = httpContext.cgiGet( edtNof_obs9_Internalname) ;
            n11426Nof_obs9 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11426Nof_obs9", A11426Nof_obs9);
            A11427Nof_obs10 = httpContext.cgiGet( edtNof_obs10_Internalname) ;
            n11427Nof_obs10 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11427Nof_obs10", A11427Nof_obs10);
            A11428Nof_obs11 = httpContext.cgiGet( edtNof_obs11_Internalname) ;
            n11428Nof_obs11 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11428Nof_obs11", A11428Nof_obs11);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNof_nc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNof_nc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOF_NC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNof_nc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11709Nof_nc = (byte)(0) ;
               n11709Nof_nc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11709Nof_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11709Nof_nc), 2, 0));
            }
            else
            {
               A11709Nof_nc = (byte)(localUtil.ctol( httpContext.cgiGet( edtNof_nc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11709Nof_nc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11709Nof_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11709Nof_nc), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtNof_enc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtNof_enc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOF_ENC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNof_enc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11710Nof_enc = DecimalUtil.ZERO ;
               n11710Nof_enc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11710Nof_enc", GXutil.ltrimstr( A11710Nof_enc, 6, 2));
            }
            else
            {
               A11710Nof_enc = localUtil.ctond( httpContext.cgiGet( edtNof_enc_Internalname)) ;
               n11710Nof_enc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11710Nof_enc", GXutil.ltrimstr( A11710Nof_enc, 6, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A11103Nof_Hdr = (int)(GXutil.lval( httpContext.GetPar( "Nof_Hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11103Nof_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11103Nof_Hdr), 8, 0));
               A11104Nof_r = (byte)(GXutil.lval( httpContext.GetPar( "Nof_r"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11104Nof_r", GXutil.str( A11104Nof_r, 1, 0));
               A11105Nof_p = httpContext.GetPar( "Nof_p") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11105Nof_p", A11105Nof_p);
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
                        e111AP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'IMPRIMIR FICHA?'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Imprimir Ficha?' */
                        e121AP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1AP1483( ) ;
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
      disableAttributes1AP1483( ) ;
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

   public void confirm_1AP0( )
   {
      beforeValidate1AP1483( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AP1483( ) ;
         }
         else
         {
            checkExtendedTable1AP1483( ) ;
            if ( AnyError == 0 )
            {
               zm1AP1483( 54) ;
               zm1AP1483( 55) ;
            }
            closeExtendedTableCursors1AP1483( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1AP0( ) ;
      }
   }

   public void resetCaption1AP0( )
   {
   }

   public void e111AP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tnofart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tnofart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tnofart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnofart_impl.this.A396EmprCod = GXv_char2[0] ;
      tnofart_impl.this.AV11EmprNom = GXv_char3[0] ;
      tnofart_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121AP2( )
   {
      /* 'Imprimir Ficha?' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A11103Nof_Hdr ;
      GXv_int6[0] = A11104Nof_r ;
      GXv_char3[0] = A11105Nof_p ;
      GXv_char2[0] = httpContext.getMessage( "SCR", "") ;
      GXv_char7[0] = " " ;
      new app.pfictec2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_char7) ;
      tnofart_impl.this.A396EmprCod = GXv_char4[0] ;
      tnofart_impl.this.A11103Nof_Hdr = GXv_int5[0] ;
      tnofart_impl.this.A11104Nof_r = GXv_int6[0] ;
      tnofart_impl.this.A11105Nof_p = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11103Nof_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11103Nof_Hdr), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A11104Nof_r", GXutil.str( A11104Nof_r, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A11105Nof_p", A11105Nof_p);
      System.out.println( "" );
      /*  Sending Event outputs  */
   }

   public void zm1AP1483( int GX_JID )
   {
      if ( ( GX_JID == 53 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11106Nof_Pd = T01AP3_A11106Nof_Pd[0] ;
            Z11107Nof_Mcot = T01AP3_A11107Nof_Mcot[0] ;
            Z11108Nof_Pp = T01AP3_A11108Nof_Pp[0] ;
            Z11109Nof_Ag = T01AP3_A11109Nof_Ag[0] ;
            Z11110Nof_c1 = T01AP3_A11110Nof_c1[0] ;
            Z11111Nof_c2 = T01AP3_A11111Nof_c2[0] ;
            Z11112Nof_bo = T01AP3_A11112Nof_bo[0] ;
            Z11113Nof_bob = T01AP3_A11113Nof_bob[0] ;
            Z11114Nof_boe = T01AP3_A11114Nof_boe[0] ;
            Z11115Nof_Bov = T01AP3_A11115Nof_Bov[0] ;
            Z11116Nof_c3 = T01AP3_A11116Nof_c3[0] ;
            Z11117Nof_tns = T01AP3_A11117Nof_tns[0] ;
            Z11118Nof_tnc = T01AP3_A11118Nof_tnc[0] ;
            Z11119Nof_c4 = T01AP3_A11119Nof_c4[0] ;
            Z11120Nof_ct = T01AP3_A11120Nof_ct[0] ;
            Z11121Nof_c5 = T01AP3_A11121Nof_c5[0] ;
            Z11122Nof_scs = T01AP3_A11122Nof_scs[0] ;
            Z11123Nof_scc = T01AP3_A11123Nof_scc[0] ;
            Z11124Nof_c6 = T01AP3_A11124Nof_c6[0] ;
            Z11125Nof_cctse = T01AP3_A11125Nof_cctse[0] ;
            Z11126Nof_ccttp = T01AP3_A11126Nof_ccttp[0] ;
            Z11127Nof_cctet = T01AP3_A11127Nof_cctet[0] ;
            Z11128Nof_ccp = T01AP3_A11128Nof_ccp[0] ;
            Z11129Nof_cct = T01AP3_A11129Nof_cct[0] ;
            Z11130Nof_ccpc = T01AP3_A11130Nof_ccpc[0] ;
            Z11131Nof_cctq = T01AP3_A11131Nof_cctq[0] ;
            Z11132Nof_cccc = T01AP3_A11132Nof_cccc[0] ;
            Z11133Nof_ccec = T01AP3_A11133Nof_ccec[0] ;
            Z11134Nof_ccmc1 = T01AP3_A11134Nof_ccmc1[0] ;
            Z11135Nof_ccmc2 = T01AP3_A11135Nof_ccmc2[0] ;
            Z11136Nof_ccmc3 = T01AP3_A11136Nof_ccmc3[0] ;
            Z11137Nof_ccmc4 = T01AP3_A11137Nof_ccmc4[0] ;
            Z11138Nof_ccmc5 = T01AP3_A11138Nof_ccmc5[0] ;
            Z11139Nof_ccmc6 = T01AP3_A11139Nof_ccmc6[0] ;
            Z11140Nof_c7 = T01AP3_A11140Nof_c7[0] ;
            Z11141Nof_rb = T01AP3_A11141Nof_rb[0] ;
            Z11142Nof_rbi = T01AP3_A11142Nof_rbi[0] ;
            Z11143Nof_rbe = T01AP3_A11143Nof_rbe[0] ;
            Z11144Nof_rbp = T01AP3_A11144Nof_rbp[0] ;
            Z11145Nof_rboc = T01AP3_A11145Nof_rboc[0] ;
            Z11146Nof_rb1 = T01AP3_A11146Nof_rb1[0] ;
            Z11147Nof_rb3 = T01AP3_A11147Nof_rb3[0] ;
            Z11148Nof_c8 = T01AP3_A11148Nof_c8[0] ;
            Z11149Nof_ep1 = T01AP3_A11149Nof_ep1[0] ;
            Z11150Nof_ep2 = T01AP3_A11150Nof_ep2[0] ;
            Z11151Nof_ep3 = T01AP3_A11151Nof_ep3[0] ;
            Z11152Nof_ep4 = T01AP3_A11152Nof_ep4[0] ;
            Z11153Nof_ep5 = T01AP3_A11153Nof_ep5[0] ;
            Z11154Nof_ep6 = T01AP3_A11154Nof_ep6[0] ;
            Z11155Nof_ep7 = T01AP3_A11155Nof_ep7[0] ;
            Z11156Nof_ep8 = T01AP3_A11156Nof_ep8[0] ;
            Z11157Nof_ep9 = T01AP3_A11157Nof_ep9[0] ;
            Z11158Nof_ep10 = T01AP3_A11158Nof_ep10[0] ;
            Z11159Nof_c9 = T01AP3_A11159Nof_c9[0] ;
            Z11160Nof_sa1 = T01AP3_A11160Nof_sa1[0] ;
            Z11161Nof_sa2 = T01AP3_A11161Nof_sa2[0] ;
            Z11162Nof_sa3 = T01AP3_A11162Nof_sa3[0] ;
            Z11163Nof_sa4 = T01AP3_A11163Nof_sa4[0] ;
            Z11164Nof_sa5 = T01AP3_A11164Nof_sa5[0] ;
            Z11165Nof_sa6 = T01AP3_A11165Nof_sa6[0] ;
            Z11166Nof_c10 = T01AP3_A11166Nof_c10[0] ;
            Z11167Nof_stk = T01AP3_A11167Nof_stk[0] ;
            Z11168Nof_Lbta = T01AP3_A11168Nof_Lbta[0] ;
            Z11169Nof_Lbtp = T01AP3_A11169Nof_Lbtp[0] ;
            Z11170Nof_c11 = T01AP3_A11170Nof_c11[0] ;
            Z11171Nof_c12 = T01AP3_A11171Nof_c12[0] ;
            Z11388Nof_imp1 = T01AP3_A11388Nof_imp1[0] ;
            Z11389Nof_imp2 = T01AP3_A11389Nof_imp2[0] ;
            Z11390Nof_imp3 = T01AP3_A11390Nof_imp3[0] ;
            Z11391Nof_imp4 = T01AP3_A11391Nof_imp4[0] ;
            Z11392Nof_imp5 = T01AP3_A11392Nof_imp5[0] ;
            Z11393Nof_imp6 = T01AP3_A11393Nof_imp6[0] ;
            Z11394Nof_imp7 = T01AP3_A11394Nof_imp7[0] ;
            Z11395Nof_imp8 = T01AP3_A11395Nof_imp8[0] ;
            Z11396Nof_imp9 = T01AP3_A11396Nof_imp9[0] ;
            Z11397Nof_imp10 = T01AP3_A11397Nof_imp10[0] ;
            Z11398Nof_imp11 = T01AP3_A11398Nof_imp11[0] ;
            Z11399Nof_lavado = T01AP3_A11399Nof_lavado[0] ;
            Z11400Nof_luz = T01AP3_A11400Nof_luz[0] ;
            Z11401Nof_sudor = T01AP3_A11401Nof_sudor[0] ;
            Z11402Nof_cloro = T01AP3_A11402Nof_cloro[0] ;
            Z11403Nof_aguam = T01AP3_A11403Nof_aguam[0] ;
            Z11404Nof_termom = T01AP3_A11404Nof_termom[0] ;
            Z11405Nof_humeda = T01AP3_A11405Nof_humeda[0] ;
            Z11406Nof_oekote = T01AP3_A11406Nof_oekote[0] ;
            Z11418Nof_obs1 = T01AP3_A11418Nof_obs1[0] ;
            Z11419Nof_obs2 = T01AP3_A11419Nof_obs2[0] ;
            Z11420Nof_obs3 = T01AP3_A11420Nof_obs3[0] ;
            Z11421Nof_obs4 = T01AP3_A11421Nof_obs4[0] ;
            Z11422Nof_obs5 = T01AP3_A11422Nof_obs5[0] ;
            Z11423Nof_obs6 = T01AP3_A11423Nof_obs6[0] ;
            Z11424Nof_obs7 = T01AP3_A11424Nof_obs7[0] ;
            Z11425Nof_obs8 = T01AP3_A11425Nof_obs8[0] ;
            Z11426Nof_obs9 = T01AP3_A11426Nof_obs9[0] ;
            Z11427Nof_obs10 = T01AP3_A11427Nof_obs10[0] ;
            Z11428Nof_obs11 = T01AP3_A11428Nof_obs11[0] ;
            Z11709Nof_nc = T01AP3_A11709Nof_nc[0] ;
            Z11710Nof_enc = T01AP3_A11710Nof_enc[0] ;
            Z840TrnCod = T01AP3_A840TrnCod[0] ;
         }
         else
         {
            Z11106Nof_Pd = A11106Nof_Pd ;
            Z11107Nof_Mcot = A11107Nof_Mcot ;
            Z11108Nof_Pp = A11108Nof_Pp ;
            Z11109Nof_Ag = A11109Nof_Ag ;
            Z11110Nof_c1 = A11110Nof_c1 ;
            Z11111Nof_c2 = A11111Nof_c2 ;
            Z11112Nof_bo = A11112Nof_bo ;
            Z11113Nof_bob = A11113Nof_bob ;
            Z11114Nof_boe = A11114Nof_boe ;
            Z11115Nof_Bov = A11115Nof_Bov ;
            Z11116Nof_c3 = A11116Nof_c3 ;
            Z11117Nof_tns = A11117Nof_tns ;
            Z11118Nof_tnc = A11118Nof_tnc ;
            Z11119Nof_c4 = A11119Nof_c4 ;
            Z11120Nof_ct = A11120Nof_ct ;
            Z11121Nof_c5 = A11121Nof_c5 ;
            Z11122Nof_scs = A11122Nof_scs ;
            Z11123Nof_scc = A11123Nof_scc ;
            Z11124Nof_c6 = A11124Nof_c6 ;
            Z11125Nof_cctse = A11125Nof_cctse ;
            Z11126Nof_ccttp = A11126Nof_ccttp ;
            Z11127Nof_cctet = A11127Nof_cctet ;
            Z11128Nof_ccp = A11128Nof_ccp ;
            Z11129Nof_cct = A11129Nof_cct ;
            Z11130Nof_ccpc = A11130Nof_ccpc ;
            Z11131Nof_cctq = A11131Nof_cctq ;
            Z11132Nof_cccc = A11132Nof_cccc ;
            Z11133Nof_ccec = A11133Nof_ccec ;
            Z11134Nof_ccmc1 = A11134Nof_ccmc1 ;
            Z11135Nof_ccmc2 = A11135Nof_ccmc2 ;
            Z11136Nof_ccmc3 = A11136Nof_ccmc3 ;
            Z11137Nof_ccmc4 = A11137Nof_ccmc4 ;
            Z11138Nof_ccmc5 = A11138Nof_ccmc5 ;
            Z11139Nof_ccmc6 = A11139Nof_ccmc6 ;
            Z11140Nof_c7 = A11140Nof_c7 ;
            Z11141Nof_rb = A11141Nof_rb ;
            Z11142Nof_rbi = A11142Nof_rbi ;
            Z11143Nof_rbe = A11143Nof_rbe ;
            Z11144Nof_rbp = A11144Nof_rbp ;
            Z11145Nof_rboc = A11145Nof_rboc ;
            Z11146Nof_rb1 = A11146Nof_rb1 ;
            Z11147Nof_rb3 = A11147Nof_rb3 ;
            Z11148Nof_c8 = A11148Nof_c8 ;
            Z11149Nof_ep1 = A11149Nof_ep1 ;
            Z11150Nof_ep2 = A11150Nof_ep2 ;
            Z11151Nof_ep3 = A11151Nof_ep3 ;
            Z11152Nof_ep4 = A11152Nof_ep4 ;
            Z11153Nof_ep5 = A11153Nof_ep5 ;
            Z11154Nof_ep6 = A11154Nof_ep6 ;
            Z11155Nof_ep7 = A11155Nof_ep7 ;
            Z11156Nof_ep8 = A11156Nof_ep8 ;
            Z11157Nof_ep9 = A11157Nof_ep9 ;
            Z11158Nof_ep10 = A11158Nof_ep10 ;
            Z11159Nof_c9 = A11159Nof_c9 ;
            Z11160Nof_sa1 = A11160Nof_sa1 ;
            Z11161Nof_sa2 = A11161Nof_sa2 ;
            Z11162Nof_sa3 = A11162Nof_sa3 ;
            Z11163Nof_sa4 = A11163Nof_sa4 ;
            Z11164Nof_sa5 = A11164Nof_sa5 ;
            Z11165Nof_sa6 = A11165Nof_sa6 ;
            Z11166Nof_c10 = A11166Nof_c10 ;
            Z11167Nof_stk = A11167Nof_stk ;
            Z11168Nof_Lbta = A11168Nof_Lbta ;
            Z11169Nof_Lbtp = A11169Nof_Lbtp ;
            Z11170Nof_c11 = A11170Nof_c11 ;
            Z11171Nof_c12 = A11171Nof_c12 ;
            Z11388Nof_imp1 = A11388Nof_imp1 ;
            Z11389Nof_imp2 = A11389Nof_imp2 ;
            Z11390Nof_imp3 = A11390Nof_imp3 ;
            Z11391Nof_imp4 = A11391Nof_imp4 ;
            Z11392Nof_imp5 = A11392Nof_imp5 ;
            Z11393Nof_imp6 = A11393Nof_imp6 ;
            Z11394Nof_imp7 = A11394Nof_imp7 ;
            Z11395Nof_imp8 = A11395Nof_imp8 ;
            Z11396Nof_imp9 = A11396Nof_imp9 ;
            Z11397Nof_imp10 = A11397Nof_imp10 ;
            Z11398Nof_imp11 = A11398Nof_imp11 ;
            Z11399Nof_lavado = A11399Nof_lavado ;
            Z11400Nof_luz = A11400Nof_luz ;
            Z11401Nof_sudor = A11401Nof_sudor ;
            Z11402Nof_cloro = A11402Nof_cloro ;
            Z11403Nof_aguam = A11403Nof_aguam ;
            Z11404Nof_termom = A11404Nof_termom ;
            Z11405Nof_humeda = A11405Nof_humeda ;
            Z11406Nof_oekote = A11406Nof_oekote ;
            Z11418Nof_obs1 = A11418Nof_obs1 ;
            Z11419Nof_obs2 = A11419Nof_obs2 ;
            Z11420Nof_obs3 = A11420Nof_obs3 ;
            Z11421Nof_obs4 = A11421Nof_obs4 ;
            Z11422Nof_obs5 = A11422Nof_obs5 ;
            Z11423Nof_obs6 = A11423Nof_obs6 ;
            Z11424Nof_obs7 = A11424Nof_obs7 ;
            Z11425Nof_obs8 = A11425Nof_obs8 ;
            Z11426Nof_obs9 = A11426Nof_obs9 ;
            Z11427Nof_obs10 = A11427Nof_obs10 ;
            Z11428Nof_obs11 = A11428Nof_obs11 ;
            Z11709Nof_nc = A11709Nof_nc ;
            Z11710Nof_enc = A11710Nof_enc ;
            Z840TrnCod = A840TrnCod ;
         }
      }
      if ( GX_JID == -53 )
      {
         Z11709Nof_nc = A11709Nof_nc ;
         Z11710Nof_enc = A11710Nof_enc ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z11103Nof_Hdr = A11103Nof_Hdr ;
         Z11104Nof_r = A11104Nof_r ;
         Z11105Nof_p = A11105Nof_p ;
         Z11106Nof_Pd = A11106Nof_Pd ;
         Z11107Nof_Mcot = A11107Nof_Mcot ;
         Z11108Nof_Pp = A11108Nof_Pp ;
         Z11109Nof_Ag = A11109Nof_Ag ;
         Z11110Nof_c1 = A11110Nof_c1 ;
         Z11111Nof_c2 = A11111Nof_c2 ;
         Z11112Nof_bo = A11112Nof_bo ;
         Z11113Nof_bob = A11113Nof_bob ;
         Z11114Nof_boe = A11114Nof_boe ;
         Z11115Nof_Bov = A11115Nof_Bov ;
         Z11116Nof_c3 = A11116Nof_c3 ;
         Z11117Nof_tns = A11117Nof_tns ;
         Z11118Nof_tnc = A11118Nof_tnc ;
         Z11119Nof_c4 = A11119Nof_c4 ;
         Z11120Nof_ct = A11120Nof_ct ;
         Z11121Nof_c5 = A11121Nof_c5 ;
         Z11122Nof_scs = A11122Nof_scs ;
         Z11123Nof_scc = A11123Nof_scc ;
         Z11124Nof_c6 = A11124Nof_c6 ;
         Z11125Nof_cctse = A11125Nof_cctse ;
         Z11126Nof_ccttp = A11126Nof_ccttp ;
         Z11127Nof_cctet = A11127Nof_cctet ;
         Z11128Nof_ccp = A11128Nof_ccp ;
         Z11129Nof_cct = A11129Nof_cct ;
         Z11130Nof_ccpc = A11130Nof_ccpc ;
         Z11131Nof_cctq = A11131Nof_cctq ;
         Z11132Nof_cccc = A11132Nof_cccc ;
         Z11133Nof_ccec = A11133Nof_ccec ;
         Z11134Nof_ccmc1 = A11134Nof_ccmc1 ;
         Z11135Nof_ccmc2 = A11135Nof_ccmc2 ;
         Z11136Nof_ccmc3 = A11136Nof_ccmc3 ;
         Z11137Nof_ccmc4 = A11137Nof_ccmc4 ;
         Z11138Nof_ccmc5 = A11138Nof_ccmc5 ;
         Z11139Nof_ccmc6 = A11139Nof_ccmc6 ;
         Z11140Nof_c7 = A11140Nof_c7 ;
         Z11141Nof_rb = A11141Nof_rb ;
         Z11142Nof_rbi = A11142Nof_rbi ;
         Z11143Nof_rbe = A11143Nof_rbe ;
         Z11144Nof_rbp = A11144Nof_rbp ;
         Z11145Nof_rboc = A11145Nof_rboc ;
         Z11146Nof_rb1 = A11146Nof_rb1 ;
         Z11147Nof_rb3 = A11147Nof_rb3 ;
         Z11148Nof_c8 = A11148Nof_c8 ;
         Z11149Nof_ep1 = A11149Nof_ep1 ;
         Z11150Nof_ep2 = A11150Nof_ep2 ;
         Z11151Nof_ep3 = A11151Nof_ep3 ;
         Z11152Nof_ep4 = A11152Nof_ep4 ;
         Z11153Nof_ep5 = A11153Nof_ep5 ;
         Z11154Nof_ep6 = A11154Nof_ep6 ;
         Z11155Nof_ep7 = A11155Nof_ep7 ;
         Z11156Nof_ep8 = A11156Nof_ep8 ;
         Z11157Nof_ep9 = A11157Nof_ep9 ;
         Z11158Nof_ep10 = A11158Nof_ep10 ;
         Z11159Nof_c9 = A11159Nof_c9 ;
         Z11160Nof_sa1 = A11160Nof_sa1 ;
         Z11161Nof_sa2 = A11161Nof_sa2 ;
         Z11162Nof_sa3 = A11162Nof_sa3 ;
         Z11163Nof_sa4 = A11163Nof_sa4 ;
         Z11164Nof_sa5 = A11164Nof_sa5 ;
         Z11165Nof_sa6 = A11165Nof_sa6 ;
         Z11166Nof_c10 = A11166Nof_c10 ;
         Z11167Nof_stk = A11167Nof_stk ;
         Z11168Nof_Lbta = A11168Nof_Lbta ;
         Z11169Nof_Lbtp = A11169Nof_Lbtp ;
         Z11170Nof_c11 = A11170Nof_c11 ;
         Z11171Nof_c12 = A11171Nof_c12 ;
         Z11388Nof_imp1 = A11388Nof_imp1 ;
         Z11389Nof_imp2 = A11389Nof_imp2 ;
         Z11390Nof_imp3 = A11390Nof_imp3 ;
         Z11391Nof_imp4 = A11391Nof_imp4 ;
         Z11392Nof_imp5 = A11392Nof_imp5 ;
         Z11393Nof_imp6 = A11393Nof_imp6 ;
         Z11394Nof_imp7 = A11394Nof_imp7 ;
         Z11395Nof_imp8 = A11395Nof_imp8 ;
         Z11396Nof_imp9 = A11396Nof_imp9 ;
         Z11397Nof_imp10 = A11397Nof_imp10 ;
         Z11398Nof_imp11 = A11398Nof_imp11 ;
         Z11399Nof_lavado = A11399Nof_lavado ;
         Z11400Nof_luz = A11400Nof_luz ;
         Z11401Nof_sudor = A11401Nof_sudor ;
         Z11402Nof_cloro = A11402Nof_cloro ;
         Z11403Nof_aguam = A11403Nof_aguam ;
         Z11404Nof_termom = A11404Nof_termom ;
         Z11405Nof_humeda = A11405Nof_humeda ;
         Z11406Nof_oekote = A11406Nof_oekote ;
         Z11418Nof_obs1 = A11418Nof_obs1 ;
         Z11419Nof_obs2 = A11419Nof_obs2 ;
         Z11420Nof_obs3 = A11420Nof_obs3 ;
         Z11421Nof_obs4 = A11421Nof_obs4 ;
         Z11422Nof_obs5 = A11422Nof_obs5 ;
         Z11423Nof_obs6 = A11423Nof_obs6 ;
         Z11424Nof_obs7 = A11424Nof_obs7 ;
         Z11425Nof_obs8 = A11425Nof_obs8 ;
         Z11426Nof_obs9 = A11426Nof_obs9 ;
         Z11427Nof_obs10 = A11427Nof_obs10 ;
         Z11428Nof_obs11 = A11428Nof_obs11 ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TNOFART" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01AP4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AP4_A407EmprNom[0] ;
      n407EmprNom = T01AP4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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
      if ( isIns( )  && (GXutil.strcmp("", A11107Nof_Mcot)==0) && ( Gx_BScreen == 0 ) )
      {
         A11107Nof_Mcot = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11107Nof_Mcot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11106Nof_Pd)==0) && ( Gx_BScreen == 0 ) )
      {
         A11106Nof_Pd = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11106Nof_Pd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11108Nof_Pp)==0) && ( Gx_BScreen == 0 ) )
      {
         A11108Nof_Pp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11108Nof_Pp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11109Nof_Ag)==0) && ( Gx_BScreen == 0 ) )
      {
         A11109Nof_Ag = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11109Nof_Ag = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11112Nof_bo)==0) && ( Gx_BScreen == 0 ) )
      {
         A11112Nof_bo = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11112Nof_bo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11113Nof_bob)==0) && ( Gx_BScreen == 0 ) )
      {
         A11113Nof_bob = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11113Nof_bob = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11114Nof_boe)==0) && ( Gx_BScreen == 0 ) )
      {
         A11114Nof_boe = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11114Nof_boe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11117Nof_tns)==0) && ( Gx_BScreen == 0 ) )
      {
         A11117Nof_tns = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11117Nof_tns = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11118Nof_tnc)==0) && ( Gx_BScreen == 0 ) )
      {
         A11118Nof_tnc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11118Nof_tnc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11120Nof_ct)==0) && ( Gx_BScreen == 0 ) )
      {
         A11120Nof_ct = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11120Nof_ct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11122Nof_scs)==0) && ( Gx_BScreen == 0 ) )
      {
         A11122Nof_scs = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11122Nof_scs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11123Nof_scc)==0) && ( Gx_BScreen == 0 ) )
      {
         A11123Nof_scc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11123Nof_scc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11125Nof_cctse)==0) && ( Gx_BScreen == 0 ) )
      {
         A11125Nof_cctse = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11125Nof_cctse = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11126Nof_ccttp)==0) && ( Gx_BScreen == 0 ) )
      {
         A11126Nof_ccttp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11126Nof_ccttp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11127Nof_cctet)==0) && ( Gx_BScreen == 0 ) )
      {
         A11127Nof_cctet = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11127Nof_cctet = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11130Nof_ccpc)==0) && ( Gx_BScreen == 0 ) )
      {
         A11130Nof_ccpc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11130Nof_ccpc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11131Nof_cctq)==0) && ( Gx_BScreen == 0 ) )
      {
         A11131Nof_cctq = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11131Nof_cctq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11132Nof_cccc)==0) && ( Gx_BScreen == 0 ) )
      {
         A11132Nof_cccc = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11132Nof_cccc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11133Nof_ccec)==0) && ( Gx_BScreen == 0 ) )
      {
         A11133Nof_ccec = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11133Nof_ccec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11134Nof_ccmc1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11134Nof_ccmc1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11134Nof_ccmc1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11135Nof_ccmc2)==0) && ( Gx_BScreen == 0 ) )
      {
         A11135Nof_ccmc2 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11135Nof_ccmc2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11136Nof_ccmc3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11136Nof_ccmc3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11136Nof_ccmc3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11137Nof_ccmc4)==0) && ( Gx_BScreen == 0 ) )
      {
         A11137Nof_ccmc4 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11137Nof_ccmc4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11138Nof_ccmc5)==0) && ( Gx_BScreen == 0 ) )
      {
         A11138Nof_ccmc5 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11138Nof_ccmc5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11139Nof_ccmc6)==0) && ( Gx_BScreen == 0 ) )
      {
         A11139Nof_ccmc6 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11139Nof_ccmc6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11141Nof_rb)==0) && ( Gx_BScreen == 0 ) )
      {
         A11141Nof_rb = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11141Nof_rb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11143Nof_rbe)==0) && ( Gx_BScreen == 0 ) )
      {
         A11143Nof_rbe = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11143Nof_rbe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11142Nof_rbi)==0) && ( Gx_BScreen == 0 ) )
      {
         A11142Nof_rbi = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11142Nof_rbi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11144Nof_rbp)==0) && ( Gx_BScreen == 0 ) )
      {
         A11144Nof_rbp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11144Nof_rbp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11146Nof_rb1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11146Nof_rb1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11146Nof_rb1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11147Nof_rb3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11147Nof_rb3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11147Nof_rb3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11149Nof_ep1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11149Nof_ep1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11149Nof_ep1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11150Nof_ep2)==0) && ( Gx_BScreen == 0 ) )
      {
         A11150Nof_ep2 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11150Nof_ep2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11151Nof_ep3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11151Nof_ep3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11151Nof_ep3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11152Nof_ep4)==0) && ( Gx_BScreen == 0 ) )
      {
         A11152Nof_ep4 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11152Nof_ep4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11153Nof_ep5)==0) && ( Gx_BScreen == 0 ) )
      {
         A11153Nof_ep5 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11153Nof_ep5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11154Nof_ep6)==0) && ( Gx_BScreen == 0 ) )
      {
         A11154Nof_ep6 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11154Nof_ep6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11155Nof_ep7)==0) && ( Gx_BScreen == 0 ) )
      {
         A11155Nof_ep7 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11155Nof_ep7 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11156Nof_ep8)==0) && ( Gx_BScreen == 0 ) )
      {
         A11156Nof_ep8 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11156Nof_ep8 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11157Nof_ep9)==0) && ( Gx_BScreen == 0 ) )
      {
         A11157Nof_ep9 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11157Nof_ep9 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11158Nof_ep10)==0) && ( Gx_BScreen == 0 ) )
      {
         A11158Nof_ep10 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11158Nof_ep10 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11160Nof_sa1)==0) && ( Gx_BScreen == 0 ) )
      {
         A11160Nof_sa1 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11160Nof_sa1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11161Nof_sa2)==0) && ( Gx_BScreen == 0 ) )
      {
         A11161Nof_sa2 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11161Nof_sa2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11162Nof_sa3)==0) && ( Gx_BScreen == 0 ) )
      {
         A11162Nof_sa3 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11162Nof_sa3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11164Nof_sa5)==0) && ( Gx_BScreen == 0 ) )
      {
         A11164Nof_sa5 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11164Nof_sa5 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11165Nof_sa6)==0) && ( Gx_BScreen == 0 ) )
      {
         A11165Nof_sa6 = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11165Nof_sa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11167Nof_stk)==0) && ( Gx_BScreen == 0 ) )
      {
         A11167Nof_stk = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n11167Nof_stk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_Pp.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               cmbNof_Pp.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_Pd.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               cmbNof_Pd.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtTrnCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_boe.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_boe.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  cmbNof_boe.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     cmbNof_boe.setEnabled( 1 );
                     httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
                  }
               }
            }
         }
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_bob.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_bob.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  cmbNof_bob.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     cmbNof_bob.setEnabled( 1 );
                     httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
                  }
               }
            }
         }
      }
   }

   public void load1AP1483( )
   {
      /* Using cursor T01AP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1483 = (short)(1) ;
         A11709Nof_nc = T01AP6_A11709Nof_nc[0] ;
         n11709Nof_nc = T01AP6_n11709Nof_nc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11709Nof_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11709Nof_nc), 2, 0));
         A11710Nof_enc = T01AP6_A11710Nof_enc[0] ;
         n11710Nof_enc = T01AP6_n11710Nof_enc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11710Nof_enc", GXutil.ltrimstr( A11710Nof_enc, 6, 2));
         A840TrnCod = T01AP6_A840TrnCod[0] ;
         n840TrnCod = T01AP6_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A407EmprNom = T01AP6_A407EmprNom[0] ;
         n407EmprNom = T01AP6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11106Nof_Pd = T01AP6_A11106Nof_Pd[0] ;
         n11106Nof_Pd = T01AP6_n11106Nof_Pd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
         A11107Nof_Mcot = T01AP6_A11107Nof_Mcot[0] ;
         n11107Nof_Mcot = T01AP6_n11107Nof_Mcot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
         A11108Nof_Pp = T01AP6_A11108Nof_Pp[0] ;
         n11108Nof_Pp = T01AP6_n11108Nof_Pp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
         A11109Nof_Ag = T01AP6_A11109Nof_Ag[0] ;
         n11109Nof_Ag = T01AP6_n11109Nof_Ag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
         A11110Nof_c1 = T01AP6_A11110Nof_c1[0] ;
         n11110Nof_c1 = T01AP6_n11110Nof_c1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11110Nof_c1", A11110Nof_c1);
         A11111Nof_c2 = T01AP6_A11111Nof_c2[0] ;
         n11111Nof_c2 = T01AP6_n11111Nof_c2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11111Nof_c2", A11111Nof_c2);
         A11112Nof_bo = T01AP6_A11112Nof_bo[0] ;
         n11112Nof_bo = T01AP6_n11112Nof_bo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
         A11113Nof_bob = T01AP6_A11113Nof_bob[0] ;
         n11113Nof_bob = T01AP6_n11113Nof_bob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
         A11114Nof_boe = T01AP6_A11114Nof_boe[0] ;
         n11114Nof_boe = T01AP6_n11114Nof_boe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
         A11115Nof_Bov = T01AP6_A11115Nof_Bov[0] ;
         n11115Nof_Bov = T01AP6_n11115Nof_Bov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11115Nof_Bov", A11115Nof_Bov);
         A11116Nof_c3 = T01AP6_A11116Nof_c3[0] ;
         n11116Nof_c3 = T01AP6_n11116Nof_c3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11116Nof_c3", A11116Nof_c3);
         A11117Nof_tns = T01AP6_A11117Nof_tns[0] ;
         n11117Nof_tns = T01AP6_n11117Nof_tns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
         A11118Nof_tnc = T01AP6_A11118Nof_tnc[0] ;
         n11118Nof_tnc = T01AP6_n11118Nof_tnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
         A11119Nof_c4 = T01AP6_A11119Nof_c4[0] ;
         n11119Nof_c4 = T01AP6_n11119Nof_c4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11119Nof_c4", A11119Nof_c4);
         A11120Nof_ct = T01AP6_A11120Nof_ct[0] ;
         n11120Nof_ct = T01AP6_n11120Nof_ct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
         A11121Nof_c5 = T01AP6_A11121Nof_c5[0] ;
         n11121Nof_c5 = T01AP6_n11121Nof_c5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11121Nof_c5", A11121Nof_c5);
         A11122Nof_scs = T01AP6_A11122Nof_scs[0] ;
         n11122Nof_scs = T01AP6_n11122Nof_scs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
         A11123Nof_scc = T01AP6_A11123Nof_scc[0] ;
         n11123Nof_scc = T01AP6_n11123Nof_scc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
         A11124Nof_c6 = T01AP6_A11124Nof_c6[0] ;
         n11124Nof_c6 = T01AP6_n11124Nof_c6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11124Nof_c6", A11124Nof_c6);
         A11125Nof_cctse = T01AP6_A11125Nof_cctse[0] ;
         n11125Nof_cctse = T01AP6_n11125Nof_cctse[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
         A11126Nof_ccttp = T01AP6_A11126Nof_ccttp[0] ;
         n11126Nof_ccttp = T01AP6_n11126Nof_ccttp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
         A11127Nof_cctet = T01AP6_A11127Nof_cctet[0] ;
         n11127Nof_cctet = T01AP6_n11127Nof_cctet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
         A11128Nof_ccp = T01AP6_A11128Nof_ccp[0] ;
         n11128Nof_ccp = T01AP6_n11128Nof_ccp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11128Nof_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11128Nof_ccp), 2, 0));
         A11129Nof_cct = T01AP6_A11129Nof_cct[0] ;
         n11129Nof_cct = T01AP6_n11129Nof_cct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11129Nof_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11129Nof_cct), 2, 0));
         A11130Nof_ccpc = T01AP6_A11130Nof_ccpc[0] ;
         n11130Nof_ccpc = T01AP6_n11130Nof_ccpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
         A11131Nof_cctq = T01AP6_A11131Nof_cctq[0] ;
         n11131Nof_cctq = T01AP6_n11131Nof_cctq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
         A11132Nof_cccc = T01AP6_A11132Nof_cccc[0] ;
         n11132Nof_cccc = T01AP6_n11132Nof_cccc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
         A11133Nof_ccec = T01AP6_A11133Nof_ccec[0] ;
         n11133Nof_ccec = T01AP6_n11133Nof_ccec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
         A11134Nof_ccmc1 = T01AP6_A11134Nof_ccmc1[0] ;
         n11134Nof_ccmc1 = T01AP6_n11134Nof_ccmc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
         A11135Nof_ccmc2 = T01AP6_A11135Nof_ccmc2[0] ;
         n11135Nof_ccmc2 = T01AP6_n11135Nof_ccmc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
         A11136Nof_ccmc3 = T01AP6_A11136Nof_ccmc3[0] ;
         n11136Nof_ccmc3 = T01AP6_n11136Nof_ccmc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
         A11137Nof_ccmc4 = T01AP6_A11137Nof_ccmc4[0] ;
         n11137Nof_ccmc4 = T01AP6_n11137Nof_ccmc4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
         A11138Nof_ccmc5 = T01AP6_A11138Nof_ccmc5[0] ;
         n11138Nof_ccmc5 = T01AP6_n11138Nof_ccmc5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
         A11139Nof_ccmc6 = T01AP6_A11139Nof_ccmc6[0] ;
         n11139Nof_ccmc6 = T01AP6_n11139Nof_ccmc6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
         A11140Nof_c7 = T01AP6_A11140Nof_c7[0] ;
         n11140Nof_c7 = T01AP6_n11140Nof_c7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11140Nof_c7", A11140Nof_c7);
         A11141Nof_rb = T01AP6_A11141Nof_rb[0] ;
         n11141Nof_rb = T01AP6_n11141Nof_rb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
         A11142Nof_rbi = T01AP6_A11142Nof_rbi[0] ;
         n11142Nof_rbi = T01AP6_n11142Nof_rbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
         A11143Nof_rbe = T01AP6_A11143Nof_rbe[0] ;
         n11143Nof_rbe = T01AP6_n11143Nof_rbe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
         A11144Nof_rbp = T01AP6_A11144Nof_rbp[0] ;
         n11144Nof_rbp = T01AP6_n11144Nof_rbp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
         A11145Nof_rboc = T01AP6_A11145Nof_rboc[0] ;
         n11145Nof_rboc = T01AP6_n11145Nof_rboc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11145Nof_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11145Nof_rboc), 3, 0));
         A11146Nof_rb1 = T01AP6_A11146Nof_rb1[0] ;
         n11146Nof_rb1 = T01AP6_n11146Nof_rb1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
         A11147Nof_rb3 = T01AP6_A11147Nof_rb3[0] ;
         n11147Nof_rb3 = T01AP6_n11147Nof_rb3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
         A11148Nof_c8 = T01AP6_A11148Nof_c8[0] ;
         n11148Nof_c8 = T01AP6_n11148Nof_c8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11148Nof_c8", A11148Nof_c8);
         A11149Nof_ep1 = T01AP6_A11149Nof_ep1[0] ;
         n11149Nof_ep1 = T01AP6_n11149Nof_ep1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
         A11150Nof_ep2 = T01AP6_A11150Nof_ep2[0] ;
         n11150Nof_ep2 = T01AP6_n11150Nof_ep2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
         A11151Nof_ep3 = T01AP6_A11151Nof_ep3[0] ;
         n11151Nof_ep3 = T01AP6_n11151Nof_ep3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
         A11152Nof_ep4 = T01AP6_A11152Nof_ep4[0] ;
         n11152Nof_ep4 = T01AP6_n11152Nof_ep4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
         A11153Nof_ep5 = T01AP6_A11153Nof_ep5[0] ;
         n11153Nof_ep5 = T01AP6_n11153Nof_ep5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
         A11154Nof_ep6 = T01AP6_A11154Nof_ep6[0] ;
         n11154Nof_ep6 = T01AP6_n11154Nof_ep6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
         A11155Nof_ep7 = T01AP6_A11155Nof_ep7[0] ;
         n11155Nof_ep7 = T01AP6_n11155Nof_ep7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
         A11156Nof_ep8 = T01AP6_A11156Nof_ep8[0] ;
         n11156Nof_ep8 = T01AP6_n11156Nof_ep8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
         A11157Nof_ep9 = T01AP6_A11157Nof_ep9[0] ;
         n11157Nof_ep9 = T01AP6_n11157Nof_ep9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
         A11158Nof_ep10 = T01AP6_A11158Nof_ep10[0] ;
         n11158Nof_ep10 = T01AP6_n11158Nof_ep10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
         A11159Nof_c9 = T01AP6_A11159Nof_c9[0] ;
         n11159Nof_c9 = T01AP6_n11159Nof_c9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11159Nof_c9", A11159Nof_c9);
         A11160Nof_sa1 = T01AP6_A11160Nof_sa1[0] ;
         n11160Nof_sa1 = T01AP6_n11160Nof_sa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
         A11161Nof_sa2 = T01AP6_A11161Nof_sa2[0] ;
         n11161Nof_sa2 = T01AP6_n11161Nof_sa2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
         A11162Nof_sa3 = T01AP6_A11162Nof_sa3[0] ;
         n11162Nof_sa3 = T01AP6_n11162Nof_sa3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
         A11163Nof_sa4 = T01AP6_A11163Nof_sa4[0] ;
         n11163Nof_sa4 = T01AP6_n11163Nof_sa4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11163Nof_sa4", A11163Nof_sa4);
         A11164Nof_sa5 = T01AP6_A11164Nof_sa5[0] ;
         n11164Nof_sa5 = T01AP6_n11164Nof_sa5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
         A11165Nof_sa6 = T01AP6_A11165Nof_sa6[0] ;
         n11165Nof_sa6 = T01AP6_n11165Nof_sa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
         A11166Nof_c10 = T01AP6_A11166Nof_c10[0] ;
         n11166Nof_c10 = T01AP6_n11166Nof_c10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11166Nof_c10", A11166Nof_c10);
         A11167Nof_stk = T01AP6_A11167Nof_stk[0] ;
         n11167Nof_stk = T01AP6_n11167Nof_stk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
         A11168Nof_Lbta = T01AP6_A11168Nof_Lbta[0] ;
         n11168Nof_Lbta = T01AP6_n11168Nof_Lbta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11168Nof_Lbta", A11168Nof_Lbta);
         A11169Nof_Lbtp = T01AP6_A11169Nof_Lbtp[0] ;
         n11169Nof_Lbtp = T01AP6_n11169Nof_Lbtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11169Nof_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11169Nof_Lbtp), 4, 0));
         A11170Nof_c11 = T01AP6_A11170Nof_c11[0] ;
         n11170Nof_c11 = T01AP6_n11170Nof_c11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11170Nof_c11", A11170Nof_c11);
         A11171Nof_c12 = T01AP6_A11171Nof_c12[0] ;
         n11171Nof_c12 = T01AP6_n11171Nof_c12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11171Nof_c12", A11171Nof_c12);
         A11388Nof_imp1 = T01AP6_A11388Nof_imp1[0] ;
         n11388Nof_imp1 = T01AP6_n11388Nof_imp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11388Nof_imp1", A11388Nof_imp1);
         A11389Nof_imp2 = T01AP6_A11389Nof_imp2[0] ;
         n11389Nof_imp2 = T01AP6_n11389Nof_imp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11389Nof_imp2", A11389Nof_imp2);
         A11390Nof_imp3 = T01AP6_A11390Nof_imp3[0] ;
         n11390Nof_imp3 = T01AP6_n11390Nof_imp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11390Nof_imp3", A11390Nof_imp3);
         A11391Nof_imp4 = T01AP6_A11391Nof_imp4[0] ;
         n11391Nof_imp4 = T01AP6_n11391Nof_imp4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11391Nof_imp4", A11391Nof_imp4);
         A11392Nof_imp5 = T01AP6_A11392Nof_imp5[0] ;
         n11392Nof_imp5 = T01AP6_n11392Nof_imp5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11392Nof_imp5", A11392Nof_imp5);
         A11393Nof_imp6 = T01AP6_A11393Nof_imp6[0] ;
         n11393Nof_imp6 = T01AP6_n11393Nof_imp6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11393Nof_imp6", A11393Nof_imp6);
         A11394Nof_imp7 = T01AP6_A11394Nof_imp7[0] ;
         n11394Nof_imp7 = T01AP6_n11394Nof_imp7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11394Nof_imp7", A11394Nof_imp7);
         A11395Nof_imp8 = T01AP6_A11395Nof_imp8[0] ;
         n11395Nof_imp8 = T01AP6_n11395Nof_imp8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11395Nof_imp8", A11395Nof_imp8);
         A11396Nof_imp9 = T01AP6_A11396Nof_imp9[0] ;
         n11396Nof_imp9 = T01AP6_n11396Nof_imp9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11396Nof_imp9", A11396Nof_imp9);
         A11397Nof_imp10 = T01AP6_A11397Nof_imp10[0] ;
         n11397Nof_imp10 = T01AP6_n11397Nof_imp10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11397Nof_imp10", A11397Nof_imp10);
         A11398Nof_imp11 = T01AP6_A11398Nof_imp11[0] ;
         n11398Nof_imp11 = T01AP6_n11398Nof_imp11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11398Nof_imp11", A11398Nof_imp11);
         A11399Nof_lavado = T01AP6_A11399Nof_lavado[0] ;
         n11399Nof_lavado = T01AP6_n11399Nof_lavado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11399Nof_lavado", A11399Nof_lavado);
         A11400Nof_luz = T01AP6_A11400Nof_luz[0] ;
         n11400Nof_luz = T01AP6_n11400Nof_luz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11400Nof_luz", A11400Nof_luz);
         A11401Nof_sudor = T01AP6_A11401Nof_sudor[0] ;
         n11401Nof_sudor = T01AP6_n11401Nof_sudor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11401Nof_sudor", A11401Nof_sudor);
         A11402Nof_cloro = T01AP6_A11402Nof_cloro[0] ;
         n11402Nof_cloro = T01AP6_n11402Nof_cloro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11402Nof_cloro", A11402Nof_cloro);
         A11403Nof_aguam = T01AP6_A11403Nof_aguam[0] ;
         n11403Nof_aguam = T01AP6_n11403Nof_aguam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11403Nof_aguam", A11403Nof_aguam);
         A11404Nof_termom = T01AP6_A11404Nof_termom[0] ;
         n11404Nof_termom = T01AP6_n11404Nof_termom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11404Nof_termom", A11404Nof_termom);
         A11405Nof_humeda = T01AP6_A11405Nof_humeda[0] ;
         n11405Nof_humeda = T01AP6_n11405Nof_humeda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11405Nof_humeda", GXutil.ltrimstr( A11405Nof_humeda, 6, 2));
         A11406Nof_oekote = T01AP6_A11406Nof_oekote[0] ;
         n11406Nof_oekote = T01AP6_n11406Nof_oekote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11406Nof_oekote", A11406Nof_oekote);
         A11418Nof_obs1 = T01AP6_A11418Nof_obs1[0] ;
         n11418Nof_obs1 = T01AP6_n11418Nof_obs1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11418Nof_obs1", A11418Nof_obs1);
         A11419Nof_obs2 = T01AP6_A11419Nof_obs2[0] ;
         n11419Nof_obs2 = T01AP6_n11419Nof_obs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11419Nof_obs2", A11419Nof_obs2);
         A11420Nof_obs3 = T01AP6_A11420Nof_obs3[0] ;
         n11420Nof_obs3 = T01AP6_n11420Nof_obs3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11420Nof_obs3", A11420Nof_obs3);
         A11421Nof_obs4 = T01AP6_A11421Nof_obs4[0] ;
         n11421Nof_obs4 = T01AP6_n11421Nof_obs4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11421Nof_obs4", A11421Nof_obs4);
         A11422Nof_obs5 = T01AP6_A11422Nof_obs5[0] ;
         n11422Nof_obs5 = T01AP6_n11422Nof_obs5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11422Nof_obs5", A11422Nof_obs5);
         A11423Nof_obs6 = T01AP6_A11423Nof_obs6[0] ;
         n11423Nof_obs6 = T01AP6_n11423Nof_obs6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11423Nof_obs6", A11423Nof_obs6);
         A11424Nof_obs7 = T01AP6_A11424Nof_obs7[0] ;
         n11424Nof_obs7 = T01AP6_n11424Nof_obs7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11424Nof_obs7", A11424Nof_obs7);
         A11425Nof_obs8 = T01AP6_A11425Nof_obs8[0] ;
         n11425Nof_obs8 = T01AP6_n11425Nof_obs8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11425Nof_obs8", A11425Nof_obs8);
         A11426Nof_obs9 = T01AP6_A11426Nof_obs9[0] ;
         n11426Nof_obs9 = T01AP6_n11426Nof_obs9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11426Nof_obs9", A11426Nof_obs9);
         A11427Nof_obs10 = T01AP6_A11427Nof_obs10[0] ;
         n11427Nof_obs10 = T01AP6_n11427Nof_obs10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11427Nof_obs10", A11427Nof_obs10);
         A11428Nof_obs11 = T01AP6_A11428Nof_obs11[0] ;
         n11428Nof_obs11 = T01AP6_n11428Nof_obs11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11428Nof_obs11", A11428Nof_obs11);
         zm1AP1483( -53) ;
      }
      pr_default.close(4);
      onLoadActions1AP1483( ) ;
   }

   public void onLoadActions1AP1483( )
   {
      if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         cmbNof_Pp.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_Pp.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         cmbNof_Pd.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_Pd.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         cmbNof_bob.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_bob.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_bob.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  cmbNof_bob.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
               }
            }
         }
      }
      if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         cmbNof_boe.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_boe.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_boe.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  cmbNof_boe.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
               }
            }
         }
      }
   }

   public void checkExtendedTable1AP1483( )
   {
      nIsDirty_1483 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01AP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         cmbNof_Pp.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_Pp.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
      {
         cmbNof_Pd.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_Pd.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         cmbNof_bob.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_bob.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_bob.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  cmbNof_bob.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
               }
            }
         }
      }
      if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         cmbNof_boe.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_boe.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_boe.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  cmbNof_boe.setEnabled( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
               }
            }
         }
      }
   }

   public void closeExtendedTableCursors1AP1483( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_55( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01AP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1AP1483( )
   {
      /* Using cursor T01AP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1483 = (short)(1) ;
      }
      else
      {
         RcdFound1483 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01AP3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AP3_A11103Nof_Hdr[0] == A11103Nof_Hdr ) && ( T01AP3_A11104Nof_r[0] == A11104Nof_r ) && ( GXutil.strcmp(T01AP3_A11105Nof_p[0], A11105Nof_p) == 0 ) )
      {
         zm1AP1483( 53) ;
         RcdFound1483 = (short)(1) ;
         A11709Nof_nc = T01AP3_A11709Nof_nc[0] ;
         n11709Nof_nc = T01AP3_n11709Nof_nc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11709Nof_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11709Nof_nc), 2, 0));
         A11710Nof_enc = T01AP3_A11710Nof_enc[0] ;
         n11710Nof_enc = T01AP3_n11710Nof_enc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11710Nof_enc", GXutil.ltrimstr( A11710Nof_enc, 6, 2));
         A840TrnCod = T01AP3_A840TrnCod[0] ;
         n840TrnCod = T01AP3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A11106Nof_Pd = T01AP3_A11106Nof_Pd[0] ;
         n11106Nof_Pd = T01AP3_n11106Nof_Pd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
         A11107Nof_Mcot = T01AP3_A11107Nof_Mcot[0] ;
         n11107Nof_Mcot = T01AP3_n11107Nof_Mcot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
         A11108Nof_Pp = T01AP3_A11108Nof_Pp[0] ;
         n11108Nof_Pp = T01AP3_n11108Nof_Pp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
         A11109Nof_Ag = T01AP3_A11109Nof_Ag[0] ;
         n11109Nof_Ag = T01AP3_n11109Nof_Ag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
         A11110Nof_c1 = T01AP3_A11110Nof_c1[0] ;
         n11110Nof_c1 = T01AP3_n11110Nof_c1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11110Nof_c1", A11110Nof_c1);
         A11111Nof_c2 = T01AP3_A11111Nof_c2[0] ;
         n11111Nof_c2 = T01AP3_n11111Nof_c2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11111Nof_c2", A11111Nof_c2);
         A11112Nof_bo = T01AP3_A11112Nof_bo[0] ;
         n11112Nof_bo = T01AP3_n11112Nof_bo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
         A11113Nof_bob = T01AP3_A11113Nof_bob[0] ;
         n11113Nof_bob = T01AP3_n11113Nof_bob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
         A11114Nof_boe = T01AP3_A11114Nof_boe[0] ;
         n11114Nof_boe = T01AP3_n11114Nof_boe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
         A11115Nof_Bov = T01AP3_A11115Nof_Bov[0] ;
         n11115Nof_Bov = T01AP3_n11115Nof_Bov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11115Nof_Bov", A11115Nof_Bov);
         A11116Nof_c3 = T01AP3_A11116Nof_c3[0] ;
         n11116Nof_c3 = T01AP3_n11116Nof_c3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11116Nof_c3", A11116Nof_c3);
         A11117Nof_tns = T01AP3_A11117Nof_tns[0] ;
         n11117Nof_tns = T01AP3_n11117Nof_tns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
         A11118Nof_tnc = T01AP3_A11118Nof_tnc[0] ;
         n11118Nof_tnc = T01AP3_n11118Nof_tnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
         A11119Nof_c4 = T01AP3_A11119Nof_c4[0] ;
         n11119Nof_c4 = T01AP3_n11119Nof_c4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11119Nof_c4", A11119Nof_c4);
         A11120Nof_ct = T01AP3_A11120Nof_ct[0] ;
         n11120Nof_ct = T01AP3_n11120Nof_ct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
         A11121Nof_c5 = T01AP3_A11121Nof_c5[0] ;
         n11121Nof_c5 = T01AP3_n11121Nof_c5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11121Nof_c5", A11121Nof_c5);
         A11122Nof_scs = T01AP3_A11122Nof_scs[0] ;
         n11122Nof_scs = T01AP3_n11122Nof_scs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
         A11123Nof_scc = T01AP3_A11123Nof_scc[0] ;
         n11123Nof_scc = T01AP3_n11123Nof_scc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
         A11124Nof_c6 = T01AP3_A11124Nof_c6[0] ;
         n11124Nof_c6 = T01AP3_n11124Nof_c6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11124Nof_c6", A11124Nof_c6);
         A11125Nof_cctse = T01AP3_A11125Nof_cctse[0] ;
         n11125Nof_cctse = T01AP3_n11125Nof_cctse[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
         A11126Nof_ccttp = T01AP3_A11126Nof_ccttp[0] ;
         n11126Nof_ccttp = T01AP3_n11126Nof_ccttp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
         A11127Nof_cctet = T01AP3_A11127Nof_cctet[0] ;
         n11127Nof_cctet = T01AP3_n11127Nof_cctet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
         A11128Nof_ccp = T01AP3_A11128Nof_ccp[0] ;
         n11128Nof_ccp = T01AP3_n11128Nof_ccp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11128Nof_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11128Nof_ccp), 2, 0));
         A11129Nof_cct = T01AP3_A11129Nof_cct[0] ;
         n11129Nof_cct = T01AP3_n11129Nof_cct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11129Nof_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11129Nof_cct), 2, 0));
         A11130Nof_ccpc = T01AP3_A11130Nof_ccpc[0] ;
         n11130Nof_ccpc = T01AP3_n11130Nof_ccpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
         A11131Nof_cctq = T01AP3_A11131Nof_cctq[0] ;
         n11131Nof_cctq = T01AP3_n11131Nof_cctq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
         A11132Nof_cccc = T01AP3_A11132Nof_cccc[0] ;
         n11132Nof_cccc = T01AP3_n11132Nof_cccc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
         A11133Nof_ccec = T01AP3_A11133Nof_ccec[0] ;
         n11133Nof_ccec = T01AP3_n11133Nof_ccec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
         A11134Nof_ccmc1 = T01AP3_A11134Nof_ccmc1[0] ;
         n11134Nof_ccmc1 = T01AP3_n11134Nof_ccmc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
         A11135Nof_ccmc2 = T01AP3_A11135Nof_ccmc2[0] ;
         n11135Nof_ccmc2 = T01AP3_n11135Nof_ccmc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
         A11136Nof_ccmc3 = T01AP3_A11136Nof_ccmc3[0] ;
         n11136Nof_ccmc3 = T01AP3_n11136Nof_ccmc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
         A11137Nof_ccmc4 = T01AP3_A11137Nof_ccmc4[0] ;
         n11137Nof_ccmc4 = T01AP3_n11137Nof_ccmc4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
         A11138Nof_ccmc5 = T01AP3_A11138Nof_ccmc5[0] ;
         n11138Nof_ccmc5 = T01AP3_n11138Nof_ccmc5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
         A11139Nof_ccmc6 = T01AP3_A11139Nof_ccmc6[0] ;
         n11139Nof_ccmc6 = T01AP3_n11139Nof_ccmc6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
         A11140Nof_c7 = T01AP3_A11140Nof_c7[0] ;
         n11140Nof_c7 = T01AP3_n11140Nof_c7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11140Nof_c7", A11140Nof_c7);
         A11141Nof_rb = T01AP3_A11141Nof_rb[0] ;
         n11141Nof_rb = T01AP3_n11141Nof_rb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
         A11142Nof_rbi = T01AP3_A11142Nof_rbi[0] ;
         n11142Nof_rbi = T01AP3_n11142Nof_rbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
         A11143Nof_rbe = T01AP3_A11143Nof_rbe[0] ;
         n11143Nof_rbe = T01AP3_n11143Nof_rbe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
         A11144Nof_rbp = T01AP3_A11144Nof_rbp[0] ;
         n11144Nof_rbp = T01AP3_n11144Nof_rbp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
         A11145Nof_rboc = T01AP3_A11145Nof_rboc[0] ;
         n11145Nof_rboc = T01AP3_n11145Nof_rboc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11145Nof_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11145Nof_rboc), 3, 0));
         A11146Nof_rb1 = T01AP3_A11146Nof_rb1[0] ;
         n11146Nof_rb1 = T01AP3_n11146Nof_rb1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
         A11147Nof_rb3 = T01AP3_A11147Nof_rb3[0] ;
         n11147Nof_rb3 = T01AP3_n11147Nof_rb3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
         A11148Nof_c8 = T01AP3_A11148Nof_c8[0] ;
         n11148Nof_c8 = T01AP3_n11148Nof_c8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11148Nof_c8", A11148Nof_c8);
         A11149Nof_ep1 = T01AP3_A11149Nof_ep1[0] ;
         n11149Nof_ep1 = T01AP3_n11149Nof_ep1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
         A11150Nof_ep2 = T01AP3_A11150Nof_ep2[0] ;
         n11150Nof_ep2 = T01AP3_n11150Nof_ep2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
         A11151Nof_ep3 = T01AP3_A11151Nof_ep3[0] ;
         n11151Nof_ep3 = T01AP3_n11151Nof_ep3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
         A11152Nof_ep4 = T01AP3_A11152Nof_ep4[0] ;
         n11152Nof_ep4 = T01AP3_n11152Nof_ep4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
         A11153Nof_ep5 = T01AP3_A11153Nof_ep5[0] ;
         n11153Nof_ep5 = T01AP3_n11153Nof_ep5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
         A11154Nof_ep6 = T01AP3_A11154Nof_ep6[0] ;
         n11154Nof_ep6 = T01AP3_n11154Nof_ep6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
         A11155Nof_ep7 = T01AP3_A11155Nof_ep7[0] ;
         n11155Nof_ep7 = T01AP3_n11155Nof_ep7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
         A11156Nof_ep8 = T01AP3_A11156Nof_ep8[0] ;
         n11156Nof_ep8 = T01AP3_n11156Nof_ep8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
         A11157Nof_ep9 = T01AP3_A11157Nof_ep9[0] ;
         n11157Nof_ep9 = T01AP3_n11157Nof_ep9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
         A11158Nof_ep10 = T01AP3_A11158Nof_ep10[0] ;
         n11158Nof_ep10 = T01AP3_n11158Nof_ep10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
         A11159Nof_c9 = T01AP3_A11159Nof_c9[0] ;
         n11159Nof_c9 = T01AP3_n11159Nof_c9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11159Nof_c9", A11159Nof_c9);
         A11160Nof_sa1 = T01AP3_A11160Nof_sa1[0] ;
         n11160Nof_sa1 = T01AP3_n11160Nof_sa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
         A11161Nof_sa2 = T01AP3_A11161Nof_sa2[0] ;
         n11161Nof_sa2 = T01AP3_n11161Nof_sa2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
         A11162Nof_sa3 = T01AP3_A11162Nof_sa3[0] ;
         n11162Nof_sa3 = T01AP3_n11162Nof_sa3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
         A11163Nof_sa4 = T01AP3_A11163Nof_sa4[0] ;
         n11163Nof_sa4 = T01AP3_n11163Nof_sa4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11163Nof_sa4", A11163Nof_sa4);
         A11164Nof_sa5 = T01AP3_A11164Nof_sa5[0] ;
         n11164Nof_sa5 = T01AP3_n11164Nof_sa5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
         A11165Nof_sa6 = T01AP3_A11165Nof_sa6[0] ;
         n11165Nof_sa6 = T01AP3_n11165Nof_sa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
         A11166Nof_c10 = T01AP3_A11166Nof_c10[0] ;
         n11166Nof_c10 = T01AP3_n11166Nof_c10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11166Nof_c10", A11166Nof_c10);
         A11167Nof_stk = T01AP3_A11167Nof_stk[0] ;
         n11167Nof_stk = T01AP3_n11167Nof_stk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
         A11168Nof_Lbta = T01AP3_A11168Nof_Lbta[0] ;
         n11168Nof_Lbta = T01AP3_n11168Nof_Lbta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11168Nof_Lbta", A11168Nof_Lbta);
         A11169Nof_Lbtp = T01AP3_A11169Nof_Lbtp[0] ;
         n11169Nof_Lbtp = T01AP3_n11169Nof_Lbtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11169Nof_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11169Nof_Lbtp), 4, 0));
         A11170Nof_c11 = T01AP3_A11170Nof_c11[0] ;
         n11170Nof_c11 = T01AP3_n11170Nof_c11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11170Nof_c11", A11170Nof_c11);
         A11171Nof_c12 = T01AP3_A11171Nof_c12[0] ;
         n11171Nof_c12 = T01AP3_n11171Nof_c12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11171Nof_c12", A11171Nof_c12);
         A11388Nof_imp1 = T01AP3_A11388Nof_imp1[0] ;
         n11388Nof_imp1 = T01AP3_n11388Nof_imp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11388Nof_imp1", A11388Nof_imp1);
         A11389Nof_imp2 = T01AP3_A11389Nof_imp2[0] ;
         n11389Nof_imp2 = T01AP3_n11389Nof_imp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11389Nof_imp2", A11389Nof_imp2);
         A11390Nof_imp3 = T01AP3_A11390Nof_imp3[0] ;
         n11390Nof_imp3 = T01AP3_n11390Nof_imp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11390Nof_imp3", A11390Nof_imp3);
         A11391Nof_imp4 = T01AP3_A11391Nof_imp4[0] ;
         n11391Nof_imp4 = T01AP3_n11391Nof_imp4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11391Nof_imp4", A11391Nof_imp4);
         A11392Nof_imp5 = T01AP3_A11392Nof_imp5[0] ;
         n11392Nof_imp5 = T01AP3_n11392Nof_imp5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11392Nof_imp5", A11392Nof_imp5);
         A11393Nof_imp6 = T01AP3_A11393Nof_imp6[0] ;
         n11393Nof_imp6 = T01AP3_n11393Nof_imp6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11393Nof_imp6", A11393Nof_imp6);
         A11394Nof_imp7 = T01AP3_A11394Nof_imp7[0] ;
         n11394Nof_imp7 = T01AP3_n11394Nof_imp7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11394Nof_imp7", A11394Nof_imp7);
         A11395Nof_imp8 = T01AP3_A11395Nof_imp8[0] ;
         n11395Nof_imp8 = T01AP3_n11395Nof_imp8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11395Nof_imp8", A11395Nof_imp8);
         A11396Nof_imp9 = T01AP3_A11396Nof_imp9[0] ;
         n11396Nof_imp9 = T01AP3_n11396Nof_imp9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11396Nof_imp9", A11396Nof_imp9);
         A11397Nof_imp10 = T01AP3_A11397Nof_imp10[0] ;
         n11397Nof_imp10 = T01AP3_n11397Nof_imp10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11397Nof_imp10", A11397Nof_imp10);
         A11398Nof_imp11 = T01AP3_A11398Nof_imp11[0] ;
         n11398Nof_imp11 = T01AP3_n11398Nof_imp11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11398Nof_imp11", A11398Nof_imp11);
         A11399Nof_lavado = T01AP3_A11399Nof_lavado[0] ;
         n11399Nof_lavado = T01AP3_n11399Nof_lavado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11399Nof_lavado", A11399Nof_lavado);
         A11400Nof_luz = T01AP3_A11400Nof_luz[0] ;
         n11400Nof_luz = T01AP3_n11400Nof_luz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11400Nof_luz", A11400Nof_luz);
         A11401Nof_sudor = T01AP3_A11401Nof_sudor[0] ;
         n11401Nof_sudor = T01AP3_n11401Nof_sudor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11401Nof_sudor", A11401Nof_sudor);
         A11402Nof_cloro = T01AP3_A11402Nof_cloro[0] ;
         n11402Nof_cloro = T01AP3_n11402Nof_cloro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11402Nof_cloro", A11402Nof_cloro);
         A11403Nof_aguam = T01AP3_A11403Nof_aguam[0] ;
         n11403Nof_aguam = T01AP3_n11403Nof_aguam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11403Nof_aguam", A11403Nof_aguam);
         A11404Nof_termom = T01AP3_A11404Nof_termom[0] ;
         n11404Nof_termom = T01AP3_n11404Nof_termom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11404Nof_termom", A11404Nof_termom);
         A11405Nof_humeda = T01AP3_A11405Nof_humeda[0] ;
         n11405Nof_humeda = T01AP3_n11405Nof_humeda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11405Nof_humeda", GXutil.ltrimstr( A11405Nof_humeda, 6, 2));
         A11406Nof_oekote = T01AP3_A11406Nof_oekote[0] ;
         n11406Nof_oekote = T01AP3_n11406Nof_oekote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11406Nof_oekote", A11406Nof_oekote);
         A11418Nof_obs1 = T01AP3_A11418Nof_obs1[0] ;
         n11418Nof_obs1 = T01AP3_n11418Nof_obs1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11418Nof_obs1", A11418Nof_obs1);
         A11419Nof_obs2 = T01AP3_A11419Nof_obs2[0] ;
         n11419Nof_obs2 = T01AP3_n11419Nof_obs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11419Nof_obs2", A11419Nof_obs2);
         A11420Nof_obs3 = T01AP3_A11420Nof_obs3[0] ;
         n11420Nof_obs3 = T01AP3_n11420Nof_obs3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11420Nof_obs3", A11420Nof_obs3);
         A11421Nof_obs4 = T01AP3_A11421Nof_obs4[0] ;
         n11421Nof_obs4 = T01AP3_n11421Nof_obs4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11421Nof_obs4", A11421Nof_obs4);
         A11422Nof_obs5 = T01AP3_A11422Nof_obs5[0] ;
         n11422Nof_obs5 = T01AP3_n11422Nof_obs5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11422Nof_obs5", A11422Nof_obs5);
         A11423Nof_obs6 = T01AP3_A11423Nof_obs6[0] ;
         n11423Nof_obs6 = T01AP3_n11423Nof_obs6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11423Nof_obs6", A11423Nof_obs6);
         A11424Nof_obs7 = T01AP3_A11424Nof_obs7[0] ;
         n11424Nof_obs7 = T01AP3_n11424Nof_obs7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11424Nof_obs7", A11424Nof_obs7);
         A11425Nof_obs8 = T01AP3_A11425Nof_obs8[0] ;
         n11425Nof_obs8 = T01AP3_n11425Nof_obs8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11425Nof_obs8", A11425Nof_obs8);
         A11426Nof_obs9 = T01AP3_A11426Nof_obs9[0] ;
         n11426Nof_obs9 = T01AP3_n11426Nof_obs9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11426Nof_obs9", A11426Nof_obs9);
         A11427Nof_obs10 = T01AP3_A11427Nof_obs10[0] ;
         n11427Nof_obs10 = T01AP3_n11427Nof_obs10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11427Nof_obs10", A11427Nof_obs10);
         A11428Nof_obs11 = T01AP3_A11428Nof_obs11[0] ;
         n11428Nof_obs11 = T01AP3_n11428Nof_obs11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11428Nof_obs11", A11428Nof_obs11);
         Z396EmprCod = A396EmprCod ;
         Z11103Nof_Hdr = A11103Nof_Hdr ;
         Z11104Nof_r = A11104Nof_r ;
         Z11105Nof_p = A11105Nof_p ;
         sMode1483 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AP1483( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1483 = (short)(0) ;
            initializeNonKey1AP1483( ) ;
         }
         Gx_mode = sMode1483 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1483 = (short)(0) ;
         initializeNonKey1AP1483( ) ;
         sMode1483 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1483 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1AP1483( ) ;
      if ( RcdFound1483 == 0 )
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
      RcdFound1483 = (short)(0) ;
      /* Using cursor T01AP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01AP9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AP9_A11103Nof_Hdr[0] == A11103Nof_Hdr ) && ( T01AP9_A11104Nof_r[0] == A11104Nof_r ) && ( GXutil.strcmp(T01AP9_A11105Nof_p[0], A11105Nof_p) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01AP9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AP9_A11103Nof_Hdr[0] == A11103Nof_Hdr ) && ( T01AP9_A11104Nof_r[0] == A11104Nof_r ) && ( GXutil.strcmp(T01AP9_A11105Nof_p[0], A11105Nof_p) == 0 ) )
         {
            RcdFound1483 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1483 = (short)(0) ;
      /* Using cursor T01AP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01AP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AP10_A11103Nof_Hdr[0] == A11103Nof_Hdr ) && ( T01AP10_A11104Nof_r[0] == A11104Nof_r ) && ( GXutil.strcmp(T01AP10_A11105Nof_p[0], A11105Nof_p) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01AP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AP10_A11103Nof_Hdr[0] == A11103Nof_Hdr ) && ( T01AP10_A11104Nof_r[0] == A11104Nof_r ) && ( GXutil.strcmp(T01AP10_A11105Nof_p[0], A11105Nof_p) == 0 ) )
         {
            RcdFound1483 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AP1483( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = cmbNof_Pd.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AP1483( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1483 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11103Nof_Hdr != Z11103Nof_Hdr ) || ( A11104Nof_r != Z11104Nof_r ) || ( GXutil.strcmp(A11105Nof_p, Z11105Nof_p) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbNof_Pd.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1AP1483( ) ;
               GX_FocusControl = cmbNof_Pd.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11103Nof_Hdr != Z11103Nof_Hdr ) || ( A11104Nof_r != Z11104Nof_r ) || ( GXutil.strcmp(A11105Nof_p, Z11105Nof_p) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = cmbNof_Pd.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AP1483( ) ;
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
                  GX_FocusControl = cmbNof_Pd.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AP1483( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11103Nof_Hdr != Z11103Nof_Hdr ) || ( A11104Nof_r != Z11104Nof_r ) || ( GXutil.strcmp(A11105Nof_p, Z11105Nof_p) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbNof_Pd.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      getKey1AP1483( ) ;
      if ( RcdFound1483 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11103Nof_Hdr != Z11103Nof_Hdr ) || ( A11104Nof_r != Z11104Nof_r ) || ( GXutil.strcmp(A11105Nof_p, Z11105Nof_p) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11103Nof_Hdr != Z11103Nof_Hdr ) || ( A11104Nof_r != Z11104Nof_r ) || ( GXutil.strcmp(A11105Nof_p, Z11105Nof_p) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tnofart");
      GX_FocusControl = cmbNof_Pd.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1AP0( ) ;
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
      if ( RcdFound1483 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = cmbNof_Pd.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AP1483( ) ;
      if ( RcdFound1483 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbNof_Pd.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AP1483( ) ;
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
      if ( RcdFound1483 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbNof_Pd.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      if ( RcdFound1483 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbNof_Pd.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AP1483( ) ;
      if ( RcdFound1483 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1483 != 0 )
         {
            scanNext1AP1483( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbNof_Pd.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AP1483( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AP1483( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPNOFART"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11106Nof_Pd, T01AP2_A11106Nof_Pd[0]) != 0 ) || ( GXutil.strcmp(Z11107Nof_Mcot, T01AP2_A11107Nof_Mcot[0]) != 0 ) || ( GXutil.strcmp(Z11108Nof_Pp, T01AP2_A11108Nof_Pp[0]) != 0 ) || ( GXutil.strcmp(Z11109Nof_Ag, T01AP2_A11109Nof_Ag[0]) != 0 ) || ( GXutil.strcmp(Z11110Nof_c1, T01AP2_A11110Nof_c1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11111Nof_c2, T01AP2_A11111Nof_c2[0]) != 0 ) || ( GXutil.strcmp(Z11112Nof_bo, T01AP2_A11112Nof_bo[0]) != 0 ) || ( GXutil.strcmp(Z11113Nof_bob, T01AP2_A11113Nof_bob[0]) != 0 ) || ( GXutil.strcmp(Z11114Nof_boe, T01AP2_A11114Nof_boe[0]) != 0 ) || ( GXutil.strcmp(Z11115Nof_Bov, T01AP2_A11115Nof_Bov[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11116Nof_c3, T01AP2_A11116Nof_c3[0]) != 0 ) || ( GXutil.strcmp(Z11117Nof_tns, T01AP2_A11117Nof_tns[0]) != 0 ) || ( GXutil.strcmp(Z11118Nof_tnc, T01AP2_A11118Nof_tnc[0]) != 0 ) || ( GXutil.strcmp(Z11119Nof_c4, T01AP2_A11119Nof_c4[0]) != 0 ) || ( GXutil.strcmp(Z11120Nof_ct, T01AP2_A11120Nof_ct[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11121Nof_c5, T01AP2_A11121Nof_c5[0]) != 0 ) || ( GXutil.strcmp(Z11122Nof_scs, T01AP2_A11122Nof_scs[0]) != 0 ) || ( GXutil.strcmp(Z11123Nof_scc, T01AP2_A11123Nof_scc[0]) != 0 ) || ( GXutil.strcmp(Z11124Nof_c6, T01AP2_A11124Nof_c6[0]) != 0 ) || ( GXutil.strcmp(Z11125Nof_cctse, T01AP2_A11125Nof_cctse[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11126Nof_ccttp, T01AP2_A11126Nof_ccttp[0]) != 0 ) || ( GXutil.strcmp(Z11127Nof_cctet, T01AP2_A11127Nof_cctet[0]) != 0 ) || ( Z11128Nof_ccp != T01AP2_A11128Nof_ccp[0] ) || ( Z11129Nof_cct != T01AP2_A11129Nof_cct[0] ) || ( GXutil.strcmp(Z11130Nof_ccpc, T01AP2_A11130Nof_ccpc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11131Nof_cctq, T01AP2_A11131Nof_cctq[0]) != 0 ) || ( GXutil.strcmp(Z11132Nof_cccc, T01AP2_A11132Nof_cccc[0]) != 0 ) || ( GXutil.strcmp(Z11133Nof_ccec, T01AP2_A11133Nof_ccec[0]) != 0 ) || ( GXutil.strcmp(Z11134Nof_ccmc1, T01AP2_A11134Nof_ccmc1[0]) != 0 ) || ( GXutil.strcmp(Z11135Nof_ccmc2, T01AP2_A11135Nof_ccmc2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11136Nof_ccmc3, T01AP2_A11136Nof_ccmc3[0]) != 0 ) || ( GXutil.strcmp(Z11137Nof_ccmc4, T01AP2_A11137Nof_ccmc4[0]) != 0 ) || ( GXutil.strcmp(Z11138Nof_ccmc5, T01AP2_A11138Nof_ccmc5[0]) != 0 ) || ( GXutil.strcmp(Z11139Nof_ccmc6, T01AP2_A11139Nof_ccmc6[0]) != 0 ) || ( GXutil.strcmp(Z11140Nof_c7, T01AP2_A11140Nof_c7[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11141Nof_rb, T01AP2_A11141Nof_rb[0]) != 0 ) || ( GXutil.strcmp(Z11142Nof_rbi, T01AP2_A11142Nof_rbi[0]) != 0 ) || ( GXutil.strcmp(Z11143Nof_rbe, T01AP2_A11143Nof_rbe[0]) != 0 ) || ( GXutil.strcmp(Z11144Nof_rbp, T01AP2_A11144Nof_rbp[0]) != 0 ) || ( Z11145Nof_rboc != T01AP2_A11145Nof_rboc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11146Nof_rb1, T01AP2_A11146Nof_rb1[0]) != 0 ) || ( GXutil.strcmp(Z11147Nof_rb3, T01AP2_A11147Nof_rb3[0]) != 0 ) || ( GXutil.strcmp(Z11148Nof_c8, T01AP2_A11148Nof_c8[0]) != 0 ) || ( GXutil.strcmp(Z11149Nof_ep1, T01AP2_A11149Nof_ep1[0]) != 0 ) || ( GXutil.strcmp(Z11150Nof_ep2, T01AP2_A11150Nof_ep2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11151Nof_ep3, T01AP2_A11151Nof_ep3[0]) != 0 ) || ( GXutil.strcmp(Z11152Nof_ep4, T01AP2_A11152Nof_ep4[0]) != 0 ) || ( GXutil.strcmp(Z11153Nof_ep5, T01AP2_A11153Nof_ep5[0]) != 0 ) || ( GXutil.strcmp(Z11154Nof_ep6, T01AP2_A11154Nof_ep6[0]) != 0 ) || ( GXutil.strcmp(Z11155Nof_ep7, T01AP2_A11155Nof_ep7[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11156Nof_ep8, T01AP2_A11156Nof_ep8[0]) != 0 ) || ( GXutil.strcmp(Z11157Nof_ep9, T01AP2_A11157Nof_ep9[0]) != 0 ) || ( GXutil.strcmp(Z11158Nof_ep10, T01AP2_A11158Nof_ep10[0]) != 0 ) || ( GXutil.strcmp(Z11159Nof_c9, T01AP2_A11159Nof_c9[0]) != 0 ) || ( GXutil.strcmp(Z11160Nof_sa1, T01AP2_A11160Nof_sa1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11161Nof_sa2, T01AP2_A11161Nof_sa2[0]) != 0 ) || ( GXutil.strcmp(Z11162Nof_sa3, T01AP2_A11162Nof_sa3[0]) != 0 ) || ( GXutil.strcmp(Z11163Nof_sa4, T01AP2_A11163Nof_sa4[0]) != 0 ) || ( GXutil.strcmp(Z11164Nof_sa5, T01AP2_A11164Nof_sa5[0]) != 0 ) || ( GXutil.strcmp(Z11165Nof_sa6, T01AP2_A11165Nof_sa6[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11166Nof_c10, T01AP2_A11166Nof_c10[0]) != 0 ) || ( GXutil.strcmp(Z11167Nof_stk, T01AP2_A11167Nof_stk[0]) != 0 ) || ( GXutil.strcmp(Z11168Nof_Lbta, T01AP2_A11168Nof_Lbta[0]) != 0 ) || ( Z11169Nof_Lbtp != T01AP2_A11169Nof_Lbtp[0] ) || ( GXutil.strcmp(Z11170Nof_c11, T01AP2_A11170Nof_c11[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11171Nof_c12, T01AP2_A11171Nof_c12[0]) != 0 ) || ( GXutil.strcmp(Z11388Nof_imp1, T01AP2_A11388Nof_imp1[0]) != 0 ) || ( GXutil.strcmp(Z11389Nof_imp2, T01AP2_A11389Nof_imp2[0]) != 0 ) || ( GXutil.strcmp(Z11390Nof_imp3, T01AP2_A11390Nof_imp3[0]) != 0 ) || ( GXutil.strcmp(Z11391Nof_imp4, T01AP2_A11391Nof_imp4[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11392Nof_imp5, T01AP2_A11392Nof_imp5[0]) != 0 ) || ( GXutil.strcmp(Z11393Nof_imp6, T01AP2_A11393Nof_imp6[0]) != 0 ) || ( GXutil.strcmp(Z11394Nof_imp7, T01AP2_A11394Nof_imp7[0]) != 0 ) || ( GXutil.strcmp(Z11395Nof_imp8, T01AP2_A11395Nof_imp8[0]) != 0 ) || ( GXutil.strcmp(Z11396Nof_imp9, T01AP2_A11396Nof_imp9[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11397Nof_imp10, T01AP2_A11397Nof_imp10[0]) != 0 ) || ( GXutil.strcmp(Z11398Nof_imp11, T01AP2_A11398Nof_imp11[0]) != 0 ) || ( GXutil.strcmp(Z11399Nof_lavado, T01AP2_A11399Nof_lavado[0]) != 0 ) || ( GXutil.strcmp(Z11400Nof_luz, T01AP2_A11400Nof_luz[0]) != 0 ) || ( GXutil.strcmp(Z11401Nof_sudor, T01AP2_A11401Nof_sudor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11402Nof_cloro, T01AP2_A11402Nof_cloro[0]) != 0 ) || ( GXutil.strcmp(Z11403Nof_aguam, T01AP2_A11403Nof_aguam[0]) != 0 ) || ( GXutil.strcmp(Z11404Nof_termom, T01AP2_A11404Nof_termom[0]) != 0 ) || ( DecimalUtil.compareTo(Z11405Nof_humeda, T01AP2_A11405Nof_humeda[0]) != 0 ) || ( GXutil.strcmp(Z11406Nof_oekote, T01AP2_A11406Nof_oekote[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11418Nof_obs1, T01AP2_A11418Nof_obs1[0]) != 0 ) || ( GXutil.strcmp(Z11419Nof_obs2, T01AP2_A11419Nof_obs2[0]) != 0 ) || ( GXutil.strcmp(Z11420Nof_obs3, T01AP2_A11420Nof_obs3[0]) != 0 ) || ( GXutil.strcmp(Z11421Nof_obs4, T01AP2_A11421Nof_obs4[0]) != 0 ) || ( GXutil.strcmp(Z11422Nof_obs5, T01AP2_A11422Nof_obs5[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11423Nof_obs6, T01AP2_A11423Nof_obs6[0]) != 0 ) || ( GXutil.strcmp(Z11424Nof_obs7, T01AP2_A11424Nof_obs7[0]) != 0 ) || ( GXutil.strcmp(Z11425Nof_obs8, T01AP2_A11425Nof_obs8[0]) != 0 ) || ( GXutil.strcmp(Z11426Nof_obs9, T01AP2_A11426Nof_obs9[0]) != 0 ) || ( GXutil.strcmp(Z11427Nof_obs10, T01AP2_A11427Nof_obs10[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11428Nof_obs11, T01AP2_A11428Nof_obs11[0]) != 0 ) || ( Z11709Nof_nc != T01AP2_A11709Nof_nc[0] ) || ( DecimalUtil.compareTo(Z11710Nof_enc, T01AP2_A11710Nof_enc[0]) != 0 ) || ( Z840TrnCod != T01AP2_A840TrnCod[0] ) )
         {
            if ( GXutil.strcmp(Z11106Nof_Pd, T01AP2_A11106Nof_Pd[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_Pd");
               GXutil.writeLogRaw("Old: ",Z11106Nof_Pd);
               GXutil.writeLogRaw("Current: ",T01AP2_A11106Nof_Pd[0]);
            }
            if ( GXutil.strcmp(Z11107Nof_Mcot, T01AP2_A11107Nof_Mcot[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_Mcot");
               GXutil.writeLogRaw("Old: ",Z11107Nof_Mcot);
               GXutil.writeLogRaw("Current: ",T01AP2_A11107Nof_Mcot[0]);
            }
            if ( GXutil.strcmp(Z11108Nof_Pp, T01AP2_A11108Nof_Pp[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_Pp");
               GXutil.writeLogRaw("Old: ",Z11108Nof_Pp);
               GXutil.writeLogRaw("Current: ",T01AP2_A11108Nof_Pp[0]);
            }
            if ( GXutil.strcmp(Z11109Nof_Ag, T01AP2_A11109Nof_Ag[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_Ag");
               GXutil.writeLogRaw("Old: ",Z11109Nof_Ag);
               GXutil.writeLogRaw("Current: ",T01AP2_A11109Nof_Ag[0]);
            }
            if ( GXutil.strcmp(Z11110Nof_c1, T01AP2_A11110Nof_c1[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c1");
               GXutil.writeLogRaw("Old: ",Z11110Nof_c1);
               GXutil.writeLogRaw("Current: ",T01AP2_A11110Nof_c1[0]);
            }
            if ( GXutil.strcmp(Z11111Nof_c2, T01AP2_A11111Nof_c2[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c2");
               GXutil.writeLogRaw("Old: ",Z11111Nof_c2);
               GXutil.writeLogRaw("Current: ",T01AP2_A11111Nof_c2[0]);
            }
            if ( GXutil.strcmp(Z11112Nof_bo, T01AP2_A11112Nof_bo[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_bo");
               GXutil.writeLogRaw("Old: ",Z11112Nof_bo);
               GXutil.writeLogRaw("Current: ",T01AP2_A11112Nof_bo[0]);
            }
            if ( GXutil.strcmp(Z11113Nof_bob, T01AP2_A11113Nof_bob[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_bob");
               GXutil.writeLogRaw("Old: ",Z11113Nof_bob);
               GXutil.writeLogRaw("Current: ",T01AP2_A11113Nof_bob[0]);
            }
            if ( GXutil.strcmp(Z11114Nof_boe, T01AP2_A11114Nof_boe[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_boe");
               GXutil.writeLogRaw("Old: ",Z11114Nof_boe);
               GXutil.writeLogRaw("Current: ",T01AP2_A11114Nof_boe[0]);
            }
            if ( GXutil.strcmp(Z11115Nof_Bov, T01AP2_A11115Nof_Bov[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_Bov");
               GXutil.writeLogRaw("Old: ",Z11115Nof_Bov);
               GXutil.writeLogRaw("Current: ",T01AP2_A11115Nof_Bov[0]);
            }
            if ( GXutil.strcmp(Z11116Nof_c3, T01AP2_A11116Nof_c3[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c3");
               GXutil.writeLogRaw("Old: ",Z11116Nof_c3);
               GXutil.writeLogRaw("Current: ",T01AP2_A11116Nof_c3[0]);
            }
            if ( GXutil.strcmp(Z11117Nof_tns, T01AP2_A11117Nof_tns[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_tns");
               GXutil.writeLogRaw("Old: ",Z11117Nof_tns);
               GXutil.writeLogRaw("Current: ",T01AP2_A11117Nof_tns[0]);
            }
            if ( GXutil.strcmp(Z11118Nof_tnc, T01AP2_A11118Nof_tnc[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_tnc");
               GXutil.writeLogRaw("Old: ",Z11118Nof_tnc);
               GXutil.writeLogRaw("Current: ",T01AP2_A11118Nof_tnc[0]);
            }
            if ( GXutil.strcmp(Z11119Nof_c4, T01AP2_A11119Nof_c4[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c4");
               GXutil.writeLogRaw("Old: ",Z11119Nof_c4);
               GXutil.writeLogRaw("Current: ",T01AP2_A11119Nof_c4[0]);
            }
            if ( GXutil.strcmp(Z11120Nof_ct, T01AP2_A11120Nof_ct[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ct");
               GXutil.writeLogRaw("Old: ",Z11120Nof_ct);
               GXutil.writeLogRaw("Current: ",T01AP2_A11120Nof_ct[0]);
            }
            if ( GXutil.strcmp(Z11121Nof_c5, T01AP2_A11121Nof_c5[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c5");
               GXutil.writeLogRaw("Old: ",Z11121Nof_c5);
               GXutil.writeLogRaw("Current: ",T01AP2_A11121Nof_c5[0]);
            }
            if ( GXutil.strcmp(Z11122Nof_scs, T01AP2_A11122Nof_scs[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_scs");
               GXutil.writeLogRaw("Old: ",Z11122Nof_scs);
               GXutil.writeLogRaw("Current: ",T01AP2_A11122Nof_scs[0]);
            }
            if ( GXutil.strcmp(Z11123Nof_scc, T01AP2_A11123Nof_scc[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_scc");
               GXutil.writeLogRaw("Old: ",Z11123Nof_scc);
               GXutil.writeLogRaw("Current: ",T01AP2_A11123Nof_scc[0]);
            }
            if ( GXutil.strcmp(Z11124Nof_c6, T01AP2_A11124Nof_c6[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c6");
               GXutil.writeLogRaw("Old: ",Z11124Nof_c6);
               GXutil.writeLogRaw("Current: ",T01AP2_A11124Nof_c6[0]);
            }
            if ( GXutil.strcmp(Z11125Nof_cctse, T01AP2_A11125Nof_cctse[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_cctse");
               GXutil.writeLogRaw("Old: ",Z11125Nof_cctse);
               GXutil.writeLogRaw("Current: ",T01AP2_A11125Nof_cctse[0]);
            }
            if ( GXutil.strcmp(Z11126Nof_ccttp, T01AP2_A11126Nof_ccttp[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccttp");
               GXutil.writeLogRaw("Old: ",Z11126Nof_ccttp);
               GXutil.writeLogRaw("Current: ",T01AP2_A11126Nof_ccttp[0]);
            }
            if ( GXutil.strcmp(Z11127Nof_cctet, T01AP2_A11127Nof_cctet[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_cctet");
               GXutil.writeLogRaw("Old: ",Z11127Nof_cctet);
               GXutil.writeLogRaw("Current: ",T01AP2_A11127Nof_cctet[0]);
            }
            if ( Z11128Nof_ccp != T01AP2_A11128Nof_ccp[0] )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccp");
               GXutil.writeLogRaw("Old: ",Z11128Nof_ccp);
               GXutil.writeLogRaw("Current: ",T01AP2_A11128Nof_ccp[0]);
            }
            if ( Z11129Nof_cct != T01AP2_A11129Nof_cct[0] )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_cct");
               GXutil.writeLogRaw("Old: ",Z11129Nof_cct);
               GXutil.writeLogRaw("Current: ",T01AP2_A11129Nof_cct[0]);
            }
            if ( GXutil.strcmp(Z11130Nof_ccpc, T01AP2_A11130Nof_ccpc[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccpc");
               GXutil.writeLogRaw("Old: ",Z11130Nof_ccpc);
               GXutil.writeLogRaw("Current: ",T01AP2_A11130Nof_ccpc[0]);
            }
            if ( GXutil.strcmp(Z11131Nof_cctq, T01AP2_A11131Nof_cctq[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_cctq");
               GXutil.writeLogRaw("Old: ",Z11131Nof_cctq);
               GXutil.writeLogRaw("Current: ",T01AP2_A11131Nof_cctq[0]);
            }
            if ( GXutil.strcmp(Z11132Nof_cccc, T01AP2_A11132Nof_cccc[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_cccc");
               GXutil.writeLogRaw("Old: ",Z11132Nof_cccc);
               GXutil.writeLogRaw("Current: ",T01AP2_A11132Nof_cccc[0]);
            }
            if ( GXutil.strcmp(Z11133Nof_ccec, T01AP2_A11133Nof_ccec[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccec");
               GXutil.writeLogRaw("Old: ",Z11133Nof_ccec);
               GXutil.writeLogRaw("Current: ",T01AP2_A11133Nof_ccec[0]);
            }
            if ( GXutil.strcmp(Z11134Nof_ccmc1, T01AP2_A11134Nof_ccmc1[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccmc1");
               GXutil.writeLogRaw("Old: ",Z11134Nof_ccmc1);
               GXutil.writeLogRaw("Current: ",T01AP2_A11134Nof_ccmc1[0]);
            }
            if ( GXutil.strcmp(Z11135Nof_ccmc2, T01AP2_A11135Nof_ccmc2[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccmc2");
               GXutil.writeLogRaw("Old: ",Z11135Nof_ccmc2);
               GXutil.writeLogRaw("Current: ",T01AP2_A11135Nof_ccmc2[0]);
            }
            if ( GXutil.strcmp(Z11136Nof_ccmc3, T01AP2_A11136Nof_ccmc3[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccmc3");
               GXutil.writeLogRaw("Old: ",Z11136Nof_ccmc3);
               GXutil.writeLogRaw("Current: ",T01AP2_A11136Nof_ccmc3[0]);
            }
            if ( GXutil.strcmp(Z11137Nof_ccmc4, T01AP2_A11137Nof_ccmc4[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccmc4");
               GXutil.writeLogRaw("Old: ",Z11137Nof_ccmc4);
               GXutil.writeLogRaw("Current: ",T01AP2_A11137Nof_ccmc4[0]);
            }
            if ( GXutil.strcmp(Z11138Nof_ccmc5, T01AP2_A11138Nof_ccmc5[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccmc5");
               GXutil.writeLogRaw("Old: ",Z11138Nof_ccmc5);
               GXutil.writeLogRaw("Current: ",T01AP2_A11138Nof_ccmc5[0]);
            }
            if ( GXutil.strcmp(Z11139Nof_ccmc6, T01AP2_A11139Nof_ccmc6[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ccmc6");
               GXutil.writeLogRaw("Old: ",Z11139Nof_ccmc6);
               GXutil.writeLogRaw("Current: ",T01AP2_A11139Nof_ccmc6[0]);
            }
            if ( GXutil.strcmp(Z11140Nof_c7, T01AP2_A11140Nof_c7[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c7");
               GXutil.writeLogRaw("Old: ",Z11140Nof_c7);
               GXutil.writeLogRaw("Current: ",T01AP2_A11140Nof_c7[0]);
            }
            if ( GXutil.strcmp(Z11141Nof_rb, T01AP2_A11141Nof_rb[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_rb");
               GXutil.writeLogRaw("Old: ",Z11141Nof_rb);
               GXutil.writeLogRaw("Current: ",T01AP2_A11141Nof_rb[0]);
            }
            if ( GXutil.strcmp(Z11142Nof_rbi, T01AP2_A11142Nof_rbi[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_rbi");
               GXutil.writeLogRaw("Old: ",Z11142Nof_rbi);
               GXutil.writeLogRaw("Current: ",T01AP2_A11142Nof_rbi[0]);
            }
            if ( GXutil.strcmp(Z11143Nof_rbe, T01AP2_A11143Nof_rbe[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_rbe");
               GXutil.writeLogRaw("Old: ",Z11143Nof_rbe);
               GXutil.writeLogRaw("Current: ",T01AP2_A11143Nof_rbe[0]);
            }
            if ( GXutil.strcmp(Z11144Nof_rbp, T01AP2_A11144Nof_rbp[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_rbp");
               GXutil.writeLogRaw("Old: ",Z11144Nof_rbp);
               GXutil.writeLogRaw("Current: ",T01AP2_A11144Nof_rbp[0]);
            }
            if ( Z11145Nof_rboc != T01AP2_A11145Nof_rboc[0] )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_rboc");
               GXutil.writeLogRaw("Old: ",Z11145Nof_rboc);
               GXutil.writeLogRaw("Current: ",T01AP2_A11145Nof_rboc[0]);
            }
            if ( GXutil.strcmp(Z11146Nof_rb1, T01AP2_A11146Nof_rb1[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_rb1");
               GXutil.writeLogRaw("Old: ",Z11146Nof_rb1);
               GXutil.writeLogRaw("Current: ",T01AP2_A11146Nof_rb1[0]);
            }
            if ( GXutil.strcmp(Z11147Nof_rb3, T01AP2_A11147Nof_rb3[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_rb3");
               GXutil.writeLogRaw("Old: ",Z11147Nof_rb3);
               GXutil.writeLogRaw("Current: ",T01AP2_A11147Nof_rb3[0]);
            }
            if ( GXutil.strcmp(Z11148Nof_c8, T01AP2_A11148Nof_c8[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c8");
               GXutil.writeLogRaw("Old: ",Z11148Nof_c8);
               GXutil.writeLogRaw("Current: ",T01AP2_A11148Nof_c8[0]);
            }
            if ( GXutil.strcmp(Z11149Nof_ep1, T01AP2_A11149Nof_ep1[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep1");
               GXutil.writeLogRaw("Old: ",Z11149Nof_ep1);
               GXutil.writeLogRaw("Current: ",T01AP2_A11149Nof_ep1[0]);
            }
            if ( GXutil.strcmp(Z11150Nof_ep2, T01AP2_A11150Nof_ep2[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep2");
               GXutil.writeLogRaw("Old: ",Z11150Nof_ep2);
               GXutil.writeLogRaw("Current: ",T01AP2_A11150Nof_ep2[0]);
            }
            if ( GXutil.strcmp(Z11151Nof_ep3, T01AP2_A11151Nof_ep3[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep3");
               GXutil.writeLogRaw("Old: ",Z11151Nof_ep3);
               GXutil.writeLogRaw("Current: ",T01AP2_A11151Nof_ep3[0]);
            }
            if ( GXutil.strcmp(Z11152Nof_ep4, T01AP2_A11152Nof_ep4[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep4");
               GXutil.writeLogRaw("Old: ",Z11152Nof_ep4);
               GXutil.writeLogRaw("Current: ",T01AP2_A11152Nof_ep4[0]);
            }
            if ( GXutil.strcmp(Z11153Nof_ep5, T01AP2_A11153Nof_ep5[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep5");
               GXutil.writeLogRaw("Old: ",Z11153Nof_ep5);
               GXutil.writeLogRaw("Current: ",T01AP2_A11153Nof_ep5[0]);
            }
            if ( GXutil.strcmp(Z11154Nof_ep6, T01AP2_A11154Nof_ep6[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep6");
               GXutil.writeLogRaw("Old: ",Z11154Nof_ep6);
               GXutil.writeLogRaw("Current: ",T01AP2_A11154Nof_ep6[0]);
            }
            if ( GXutil.strcmp(Z11155Nof_ep7, T01AP2_A11155Nof_ep7[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep7");
               GXutil.writeLogRaw("Old: ",Z11155Nof_ep7);
               GXutil.writeLogRaw("Current: ",T01AP2_A11155Nof_ep7[0]);
            }
            if ( GXutil.strcmp(Z11156Nof_ep8, T01AP2_A11156Nof_ep8[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep8");
               GXutil.writeLogRaw("Old: ",Z11156Nof_ep8);
               GXutil.writeLogRaw("Current: ",T01AP2_A11156Nof_ep8[0]);
            }
            if ( GXutil.strcmp(Z11157Nof_ep9, T01AP2_A11157Nof_ep9[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep9");
               GXutil.writeLogRaw("Old: ",Z11157Nof_ep9);
               GXutil.writeLogRaw("Current: ",T01AP2_A11157Nof_ep9[0]);
            }
            if ( GXutil.strcmp(Z11158Nof_ep10, T01AP2_A11158Nof_ep10[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_ep10");
               GXutil.writeLogRaw("Old: ",Z11158Nof_ep10);
               GXutil.writeLogRaw("Current: ",T01AP2_A11158Nof_ep10[0]);
            }
            if ( GXutil.strcmp(Z11159Nof_c9, T01AP2_A11159Nof_c9[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c9");
               GXutil.writeLogRaw("Old: ",Z11159Nof_c9);
               GXutil.writeLogRaw("Current: ",T01AP2_A11159Nof_c9[0]);
            }
            if ( GXutil.strcmp(Z11160Nof_sa1, T01AP2_A11160Nof_sa1[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_sa1");
               GXutil.writeLogRaw("Old: ",Z11160Nof_sa1);
               GXutil.writeLogRaw("Current: ",T01AP2_A11160Nof_sa1[0]);
            }
            if ( GXutil.strcmp(Z11161Nof_sa2, T01AP2_A11161Nof_sa2[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_sa2");
               GXutil.writeLogRaw("Old: ",Z11161Nof_sa2);
               GXutil.writeLogRaw("Current: ",T01AP2_A11161Nof_sa2[0]);
            }
            if ( GXutil.strcmp(Z11162Nof_sa3, T01AP2_A11162Nof_sa3[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_sa3");
               GXutil.writeLogRaw("Old: ",Z11162Nof_sa3);
               GXutil.writeLogRaw("Current: ",T01AP2_A11162Nof_sa3[0]);
            }
            if ( GXutil.strcmp(Z11163Nof_sa4, T01AP2_A11163Nof_sa4[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_sa4");
               GXutil.writeLogRaw("Old: ",Z11163Nof_sa4);
               GXutil.writeLogRaw("Current: ",T01AP2_A11163Nof_sa4[0]);
            }
            if ( GXutil.strcmp(Z11164Nof_sa5, T01AP2_A11164Nof_sa5[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_sa5");
               GXutil.writeLogRaw("Old: ",Z11164Nof_sa5);
               GXutil.writeLogRaw("Current: ",T01AP2_A11164Nof_sa5[0]);
            }
            if ( GXutil.strcmp(Z11165Nof_sa6, T01AP2_A11165Nof_sa6[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_sa6");
               GXutil.writeLogRaw("Old: ",Z11165Nof_sa6);
               GXutil.writeLogRaw("Current: ",T01AP2_A11165Nof_sa6[0]);
            }
            if ( GXutil.strcmp(Z11166Nof_c10, T01AP2_A11166Nof_c10[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c10");
               GXutil.writeLogRaw("Old: ",Z11166Nof_c10);
               GXutil.writeLogRaw("Current: ",T01AP2_A11166Nof_c10[0]);
            }
            if ( GXutil.strcmp(Z11167Nof_stk, T01AP2_A11167Nof_stk[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_stk");
               GXutil.writeLogRaw("Old: ",Z11167Nof_stk);
               GXutil.writeLogRaw("Current: ",T01AP2_A11167Nof_stk[0]);
            }
            if ( GXutil.strcmp(Z11168Nof_Lbta, T01AP2_A11168Nof_Lbta[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_Lbta");
               GXutil.writeLogRaw("Old: ",Z11168Nof_Lbta);
               GXutil.writeLogRaw("Current: ",T01AP2_A11168Nof_Lbta[0]);
            }
            if ( Z11169Nof_Lbtp != T01AP2_A11169Nof_Lbtp[0] )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_Lbtp");
               GXutil.writeLogRaw("Old: ",Z11169Nof_Lbtp);
               GXutil.writeLogRaw("Current: ",T01AP2_A11169Nof_Lbtp[0]);
            }
            if ( GXutil.strcmp(Z11170Nof_c11, T01AP2_A11170Nof_c11[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c11");
               GXutil.writeLogRaw("Old: ",Z11170Nof_c11);
               GXutil.writeLogRaw("Current: ",T01AP2_A11170Nof_c11[0]);
            }
            if ( GXutil.strcmp(Z11171Nof_c12, T01AP2_A11171Nof_c12[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_c12");
               GXutil.writeLogRaw("Old: ",Z11171Nof_c12);
               GXutil.writeLogRaw("Current: ",T01AP2_A11171Nof_c12[0]);
            }
            if ( GXutil.strcmp(Z11388Nof_imp1, T01AP2_A11388Nof_imp1[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp1");
               GXutil.writeLogRaw("Old: ",Z11388Nof_imp1);
               GXutil.writeLogRaw("Current: ",T01AP2_A11388Nof_imp1[0]);
            }
            if ( GXutil.strcmp(Z11389Nof_imp2, T01AP2_A11389Nof_imp2[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp2");
               GXutil.writeLogRaw("Old: ",Z11389Nof_imp2);
               GXutil.writeLogRaw("Current: ",T01AP2_A11389Nof_imp2[0]);
            }
            if ( GXutil.strcmp(Z11390Nof_imp3, T01AP2_A11390Nof_imp3[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp3");
               GXutil.writeLogRaw("Old: ",Z11390Nof_imp3);
               GXutil.writeLogRaw("Current: ",T01AP2_A11390Nof_imp3[0]);
            }
            if ( GXutil.strcmp(Z11391Nof_imp4, T01AP2_A11391Nof_imp4[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp4");
               GXutil.writeLogRaw("Old: ",Z11391Nof_imp4);
               GXutil.writeLogRaw("Current: ",T01AP2_A11391Nof_imp4[0]);
            }
            if ( GXutil.strcmp(Z11392Nof_imp5, T01AP2_A11392Nof_imp5[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp5");
               GXutil.writeLogRaw("Old: ",Z11392Nof_imp5);
               GXutil.writeLogRaw("Current: ",T01AP2_A11392Nof_imp5[0]);
            }
            if ( GXutil.strcmp(Z11393Nof_imp6, T01AP2_A11393Nof_imp6[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp6");
               GXutil.writeLogRaw("Old: ",Z11393Nof_imp6);
               GXutil.writeLogRaw("Current: ",T01AP2_A11393Nof_imp6[0]);
            }
            if ( GXutil.strcmp(Z11394Nof_imp7, T01AP2_A11394Nof_imp7[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp7");
               GXutil.writeLogRaw("Old: ",Z11394Nof_imp7);
               GXutil.writeLogRaw("Current: ",T01AP2_A11394Nof_imp7[0]);
            }
            if ( GXutil.strcmp(Z11395Nof_imp8, T01AP2_A11395Nof_imp8[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp8");
               GXutil.writeLogRaw("Old: ",Z11395Nof_imp8);
               GXutil.writeLogRaw("Current: ",T01AP2_A11395Nof_imp8[0]);
            }
            if ( GXutil.strcmp(Z11396Nof_imp9, T01AP2_A11396Nof_imp9[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp9");
               GXutil.writeLogRaw("Old: ",Z11396Nof_imp9);
               GXutil.writeLogRaw("Current: ",T01AP2_A11396Nof_imp9[0]);
            }
            if ( GXutil.strcmp(Z11397Nof_imp10, T01AP2_A11397Nof_imp10[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp10");
               GXutil.writeLogRaw("Old: ",Z11397Nof_imp10);
               GXutil.writeLogRaw("Current: ",T01AP2_A11397Nof_imp10[0]);
            }
            if ( GXutil.strcmp(Z11398Nof_imp11, T01AP2_A11398Nof_imp11[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_imp11");
               GXutil.writeLogRaw("Old: ",Z11398Nof_imp11);
               GXutil.writeLogRaw("Current: ",T01AP2_A11398Nof_imp11[0]);
            }
            if ( GXutil.strcmp(Z11399Nof_lavado, T01AP2_A11399Nof_lavado[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_lavado");
               GXutil.writeLogRaw("Old: ",Z11399Nof_lavado);
               GXutil.writeLogRaw("Current: ",T01AP2_A11399Nof_lavado[0]);
            }
            if ( GXutil.strcmp(Z11400Nof_luz, T01AP2_A11400Nof_luz[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_luz");
               GXutil.writeLogRaw("Old: ",Z11400Nof_luz);
               GXutil.writeLogRaw("Current: ",T01AP2_A11400Nof_luz[0]);
            }
            if ( GXutil.strcmp(Z11401Nof_sudor, T01AP2_A11401Nof_sudor[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_sudor");
               GXutil.writeLogRaw("Old: ",Z11401Nof_sudor);
               GXutil.writeLogRaw("Current: ",T01AP2_A11401Nof_sudor[0]);
            }
            if ( GXutil.strcmp(Z11402Nof_cloro, T01AP2_A11402Nof_cloro[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_cloro");
               GXutil.writeLogRaw("Old: ",Z11402Nof_cloro);
               GXutil.writeLogRaw("Current: ",T01AP2_A11402Nof_cloro[0]);
            }
            if ( GXutil.strcmp(Z11403Nof_aguam, T01AP2_A11403Nof_aguam[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_aguam");
               GXutil.writeLogRaw("Old: ",Z11403Nof_aguam);
               GXutil.writeLogRaw("Current: ",T01AP2_A11403Nof_aguam[0]);
            }
            if ( GXutil.strcmp(Z11404Nof_termom, T01AP2_A11404Nof_termom[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_termom");
               GXutil.writeLogRaw("Old: ",Z11404Nof_termom);
               GXutil.writeLogRaw("Current: ",T01AP2_A11404Nof_termom[0]);
            }
            if ( DecimalUtil.compareTo(Z11405Nof_humeda, T01AP2_A11405Nof_humeda[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_humeda");
               GXutil.writeLogRaw("Old: ",Z11405Nof_humeda);
               GXutil.writeLogRaw("Current: ",T01AP2_A11405Nof_humeda[0]);
            }
            if ( GXutil.strcmp(Z11406Nof_oekote, T01AP2_A11406Nof_oekote[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_oekote");
               GXutil.writeLogRaw("Old: ",Z11406Nof_oekote);
               GXutil.writeLogRaw("Current: ",T01AP2_A11406Nof_oekote[0]);
            }
            if ( GXutil.strcmp(Z11418Nof_obs1, T01AP2_A11418Nof_obs1[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs1");
               GXutil.writeLogRaw("Old: ",Z11418Nof_obs1);
               GXutil.writeLogRaw("Current: ",T01AP2_A11418Nof_obs1[0]);
            }
            if ( GXutil.strcmp(Z11419Nof_obs2, T01AP2_A11419Nof_obs2[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs2");
               GXutil.writeLogRaw("Old: ",Z11419Nof_obs2);
               GXutil.writeLogRaw("Current: ",T01AP2_A11419Nof_obs2[0]);
            }
            if ( GXutil.strcmp(Z11420Nof_obs3, T01AP2_A11420Nof_obs3[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs3");
               GXutil.writeLogRaw("Old: ",Z11420Nof_obs3);
               GXutil.writeLogRaw("Current: ",T01AP2_A11420Nof_obs3[0]);
            }
            if ( GXutil.strcmp(Z11421Nof_obs4, T01AP2_A11421Nof_obs4[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs4");
               GXutil.writeLogRaw("Old: ",Z11421Nof_obs4);
               GXutil.writeLogRaw("Current: ",T01AP2_A11421Nof_obs4[0]);
            }
            if ( GXutil.strcmp(Z11422Nof_obs5, T01AP2_A11422Nof_obs5[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs5");
               GXutil.writeLogRaw("Old: ",Z11422Nof_obs5);
               GXutil.writeLogRaw("Current: ",T01AP2_A11422Nof_obs5[0]);
            }
            if ( GXutil.strcmp(Z11423Nof_obs6, T01AP2_A11423Nof_obs6[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs6");
               GXutil.writeLogRaw("Old: ",Z11423Nof_obs6);
               GXutil.writeLogRaw("Current: ",T01AP2_A11423Nof_obs6[0]);
            }
            if ( GXutil.strcmp(Z11424Nof_obs7, T01AP2_A11424Nof_obs7[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs7");
               GXutil.writeLogRaw("Old: ",Z11424Nof_obs7);
               GXutil.writeLogRaw("Current: ",T01AP2_A11424Nof_obs7[0]);
            }
            if ( GXutil.strcmp(Z11425Nof_obs8, T01AP2_A11425Nof_obs8[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs8");
               GXutil.writeLogRaw("Old: ",Z11425Nof_obs8);
               GXutil.writeLogRaw("Current: ",T01AP2_A11425Nof_obs8[0]);
            }
            if ( GXutil.strcmp(Z11426Nof_obs9, T01AP2_A11426Nof_obs9[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs9");
               GXutil.writeLogRaw("Old: ",Z11426Nof_obs9);
               GXutil.writeLogRaw("Current: ",T01AP2_A11426Nof_obs9[0]);
            }
            if ( GXutil.strcmp(Z11427Nof_obs10, T01AP2_A11427Nof_obs10[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs10");
               GXutil.writeLogRaw("Old: ",Z11427Nof_obs10);
               GXutil.writeLogRaw("Current: ",T01AP2_A11427Nof_obs10[0]);
            }
            if ( GXutil.strcmp(Z11428Nof_obs11, T01AP2_A11428Nof_obs11[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_obs11");
               GXutil.writeLogRaw("Old: ",Z11428Nof_obs11);
               GXutil.writeLogRaw("Current: ",T01AP2_A11428Nof_obs11[0]);
            }
            if ( Z11709Nof_nc != T01AP2_A11709Nof_nc[0] )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_nc");
               GXutil.writeLogRaw("Old: ",Z11709Nof_nc);
               GXutil.writeLogRaw("Current: ",T01AP2_A11709Nof_nc[0]);
            }
            if ( DecimalUtil.compareTo(Z11710Nof_enc, T01AP2_A11710Nof_enc[0]) != 0 )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"Nof_enc");
               GXutil.writeLogRaw("Old: ",Z11710Nof_enc);
               GXutil.writeLogRaw("Current: ",T01AP2_A11710Nof_enc[0]);
            }
            if ( Z840TrnCod != T01AP2_A840TrnCod[0] )
            {
               GXutil.writeLogln("tnofart:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01AP2_A840TrnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPNOFART"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AP1483( )
   {
      beforeValidate1AP1483( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AP1483( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AP1483( 0) ;
         checkOptimisticConcurrency1AP1483( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AP1483( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AP1483( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AP11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p, Boolean.valueOf(n11106Nof_Pd), A11106Nof_Pd, Boolean.valueOf(n11107Nof_Mcot), A11107Nof_Mcot, Boolean.valueOf(n11108Nof_Pp), A11108Nof_Pp, Boolean.valueOf(n11109Nof_Ag), A11109Nof_Ag, Boolean.valueOf(n11110Nof_c1), A11110Nof_c1, Boolean.valueOf(n11111Nof_c2), A11111Nof_c2, Boolean.valueOf(n11112Nof_bo), A11112Nof_bo, Boolean.valueOf(n11113Nof_bob), A11113Nof_bob, Boolean.valueOf(n11114Nof_boe), A11114Nof_boe, Boolean.valueOf(n11115Nof_Bov), A11115Nof_Bov, Boolean.valueOf(n11116Nof_c3), A11116Nof_c3, Boolean.valueOf(n11117Nof_tns), A11117Nof_tns, Boolean.valueOf(n11118Nof_tnc), A11118Nof_tnc, Boolean.valueOf(n11119Nof_c4), A11119Nof_c4, Boolean.valueOf(n11120Nof_ct), A11120Nof_ct, Boolean.valueOf(n11121Nof_c5), A11121Nof_c5, Boolean.valueOf(n11122Nof_scs), A11122Nof_scs, Boolean.valueOf(n11123Nof_scc), A11123Nof_scc, Boolean.valueOf(n11124Nof_c6), A11124Nof_c6, Boolean.valueOf(n11125Nof_cctse), A11125Nof_cctse, Boolean.valueOf(n11126Nof_ccttp), A11126Nof_ccttp, Boolean.valueOf(n11127Nof_cctet), A11127Nof_cctet, Boolean.valueOf(n11128Nof_ccp), Byte.valueOf(A11128Nof_ccp), Boolean.valueOf(n11129Nof_cct), Byte.valueOf(A11129Nof_cct), Boolean.valueOf(n11130Nof_ccpc), A11130Nof_ccpc, Boolean.valueOf(n11131Nof_cctq), A11131Nof_cctq, Boolean.valueOf(n11132Nof_cccc), A11132Nof_cccc, Boolean.valueOf(n11133Nof_ccec), A11133Nof_ccec, Boolean.valueOf(n11134Nof_ccmc1), A11134Nof_ccmc1, Boolean.valueOf(n11135Nof_ccmc2), A11135Nof_ccmc2, Boolean.valueOf(n11136Nof_ccmc3), A11136Nof_ccmc3, Boolean.valueOf(n11137Nof_ccmc4), A11137Nof_ccmc4, Boolean.valueOf(n11138Nof_ccmc5), A11138Nof_ccmc5, Boolean.valueOf(n11139Nof_ccmc6), A11139Nof_ccmc6, Boolean.valueOf(n11140Nof_c7), A11140Nof_c7, Boolean.valueOf(n11141Nof_rb), A11141Nof_rb, Boolean.valueOf(n11142Nof_rbi), A11142Nof_rbi, Boolean.valueOf(n11143Nof_rbe), A11143Nof_rbe, Boolean.valueOf(n11144Nof_rbp), A11144Nof_rbp, Boolean.valueOf(n11145Nof_rboc), Short.valueOf(A11145Nof_rboc), Boolean.valueOf(n11146Nof_rb1), A11146Nof_rb1, Boolean.valueOf(n11147Nof_rb3), A11147Nof_rb3, Boolean.valueOf(n11148Nof_c8), A11148Nof_c8, Boolean.valueOf(n11149Nof_ep1), A11149Nof_ep1, Boolean.valueOf(n11150Nof_ep2), A11150Nof_ep2, Boolean.valueOf(n11151Nof_ep3), A11151Nof_ep3, Boolean.valueOf(n11152Nof_ep4), A11152Nof_ep4, Boolean.valueOf(n11153Nof_ep5), A11153Nof_ep5, Boolean.valueOf(n11154Nof_ep6), A11154Nof_ep6, Boolean.valueOf(n11155Nof_ep7), A11155Nof_ep7, Boolean.valueOf(n11156Nof_ep8), A11156Nof_ep8, Boolean.valueOf(n11157Nof_ep9), A11157Nof_ep9, Boolean.valueOf(n11158Nof_ep10), A11158Nof_ep10, Boolean.valueOf(n11159Nof_c9), A11159Nof_c9, Boolean.valueOf(n11160Nof_sa1), A11160Nof_sa1, Boolean.valueOf(n11161Nof_sa2), A11161Nof_sa2, Boolean.valueOf(n11162Nof_sa3), A11162Nof_sa3, Boolean.valueOf(n11163Nof_sa4), A11163Nof_sa4, Boolean.valueOf(n11164Nof_sa5), A11164Nof_sa5, Boolean.valueOf(n11165Nof_sa6),
                  A11165Nof_sa6, Boolean.valueOf(n11166Nof_c10), A11166Nof_c10, Boolean.valueOf(n11167Nof_stk), A11167Nof_stk, Boolean.valueOf(n11168Nof_Lbta), A11168Nof_Lbta, Boolean.valueOf(n11169Nof_Lbtp), Short.valueOf(A11169Nof_Lbtp), Boolean.valueOf(n11170Nof_c11), A11170Nof_c11, Boolean.valueOf(n11171Nof_c12), A11171Nof_c12, Boolean.valueOf(n11388Nof_imp1), A11388Nof_imp1, Boolean.valueOf(n11389Nof_imp2), A11389Nof_imp2, Boolean.valueOf(n11390Nof_imp3), A11390Nof_imp3, Boolean.valueOf(n11391Nof_imp4), A11391Nof_imp4, Boolean.valueOf(n11392Nof_imp5), A11392Nof_imp5, Boolean.valueOf(n11393Nof_imp6), A11393Nof_imp6, Boolean.valueOf(n11394Nof_imp7), A11394Nof_imp7, Boolean.valueOf(n11395Nof_imp8), A11395Nof_imp8, Boolean.valueOf(n11396Nof_imp9), A11396Nof_imp9, Boolean.valueOf(n11397Nof_imp10), A11397Nof_imp10, Boolean.valueOf(n11398Nof_imp11), A11398Nof_imp11, Boolean.valueOf(n11399Nof_lavado), A11399Nof_lavado, Boolean.valueOf(n11400Nof_luz), A11400Nof_luz, Boolean.valueOf(n11401Nof_sudor), A11401Nof_sudor, Boolean.valueOf(n11402Nof_cloro), A11402Nof_cloro, Boolean.valueOf(n11403Nof_aguam), A11403Nof_aguam, Boolean.valueOf(n11404Nof_termom), A11404Nof_termom, Boolean.valueOf(n11405Nof_humeda), A11405Nof_humeda, Boolean.valueOf(n11406Nof_oekote), A11406Nof_oekote, Boolean.valueOf(n11418Nof_obs1), A11418Nof_obs1, Boolean.valueOf(n11419Nof_obs2), A11419Nof_obs2, Boolean.valueOf(n11420Nof_obs3), A11420Nof_obs3, Boolean.valueOf(n11421Nof_obs4), A11421Nof_obs4, Boolean.valueOf(n11422Nof_obs5), A11422Nof_obs5, Boolean.valueOf(n11423Nof_obs6), A11423Nof_obs6, Boolean.valueOf(n11424Nof_obs7), A11424Nof_obs7, Boolean.valueOf(n11425Nof_obs8), A11425Nof_obs8, Boolean.valueOf(n11426Nof_obs9), A11426Nof_obs9, Boolean.valueOf(n11427Nof_obs10), A11427Nof_obs10, Boolean.valueOf(n11428Nof_obs11), A11428Nof_obs11, Boolean.valueOf(n11709Nof_nc), Byte.valueOf(A11709Nof_nc), Boolean.valueOf(n11710Nof_enc), A11710Nof_enc, A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOFART");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1AP0( ) ;
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
            load1AP1483( ) ;
         }
         endLevel1AP1483( ) ;
      }
      closeExtendedTableCursors1AP1483( ) ;
   }

   public void update1AP1483( )
   {
      beforeValidate1AP1483( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AP1483( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AP1483( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AP1483( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AP1483( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AP12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n11106Nof_Pd), A11106Nof_Pd, Boolean.valueOf(n11107Nof_Mcot), A11107Nof_Mcot, Boolean.valueOf(n11108Nof_Pp), A11108Nof_Pp, Boolean.valueOf(n11109Nof_Ag), A11109Nof_Ag, Boolean.valueOf(n11110Nof_c1), A11110Nof_c1, Boolean.valueOf(n11111Nof_c2), A11111Nof_c2, Boolean.valueOf(n11112Nof_bo), A11112Nof_bo, Boolean.valueOf(n11113Nof_bob), A11113Nof_bob, Boolean.valueOf(n11114Nof_boe), A11114Nof_boe, Boolean.valueOf(n11115Nof_Bov), A11115Nof_Bov, Boolean.valueOf(n11116Nof_c3), A11116Nof_c3, Boolean.valueOf(n11117Nof_tns), A11117Nof_tns, Boolean.valueOf(n11118Nof_tnc), A11118Nof_tnc, Boolean.valueOf(n11119Nof_c4), A11119Nof_c4, Boolean.valueOf(n11120Nof_ct), A11120Nof_ct, Boolean.valueOf(n11121Nof_c5), A11121Nof_c5, Boolean.valueOf(n11122Nof_scs), A11122Nof_scs, Boolean.valueOf(n11123Nof_scc), A11123Nof_scc, Boolean.valueOf(n11124Nof_c6), A11124Nof_c6, Boolean.valueOf(n11125Nof_cctse), A11125Nof_cctse, Boolean.valueOf(n11126Nof_ccttp), A11126Nof_ccttp, Boolean.valueOf(n11127Nof_cctet), A11127Nof_cctet, Boolean.valueOf(n11128Nof_ccp), Byte.valueOf(A11128Nof_ccp), Boolean.valueOf(n11129Nof_cct), Byte.valueOf(A11129Nof_cct), Boolean.valueOf(n11130Nof_ccpc), A11130Nof_ccpc, Boolean.valueOf(n11131Nof_cctq), A11131Nof_cctq, Boolean.valueOf(n11132Nof_cccc), A11132Nof_cccc, Boolean.valueOf(n11133Nof_ccec), A11133Nof_ccec, Boolean.valueOf(n11134Nof_ccmc1), A11134Nof_ccmc1, Boolean.valueOf(n11135Nof_ccmc2), A11135Nof_ccmc2, Boolean.valueOf(n11136Nof_ccmc3), A11136Nof_ccmc3, Boolean.valueOf(n11137Nof_ccmc4), A11137Nof_ccmc4, Boolean.valueOf(n11138Nof_ccmc5), A11138Nof_ccmc5, Boolean.valueOf(n11139Nof_ccmc6), A11139Nof_ccmc6, Boolean.valueOf(n11140Nof_c7), A11140Nof_c7, Boolean.valueOf(n11141Nof_rb), A11141Nof_rb, Boolean.valueOf(n11142Nof_rbi), A11142Nof_rbi, Boolean.valueOf(n11143Nof_rbe), A11143Nof_rbe, Boolean.valueOf(n11144Nof_rbp), A11144Nof_rbp, Boolean.valueOf(n11145Nof_rboc), Short.valueOf(A11145Nof_rboc), Boolean.valueOf(n11146Nof_rb1), A11146Nof_rb1, Boolean.valueOf(n11147Nof_rb3), A11147Nof_rb3, Boolean.valueOf(n11148Nof_c8), A11148Nof_c8, Boolean.valueOf(n11149Nof_ep1), A11149Nof_ep1, Boolean.valueOf(n11150Nof_ep2), A11150Nof_ep2, Boolean.valueOf(n11151Nof_ep3), A11151Nof_ep3, Boolean.valueOf(n11152Nof_ep4), A11152Nof_ep4, Boolean.valueOf(n11153Nof_ep5), A11153Nof_ep5, Boolean.valueOf(n11154Nof_ep6), A11154Nof_ep6, Boolean.valueOf(n11155Nof_ep7), A11155Nof_ep7, Boolean.valueOf(n11156Nof_ep8), A11156Nof_ep8, Boolean.valueOf(n11157Nof_ep9), A11157Nof_ep9, Boolean.valueOf(n11158Nof_ep10), A11158Nof_ep10, Boolean.valueOf(n11159Nof_c9), A11159Nof_c9, Boolean.valueOf(n11160Nof_sa1), A11160Nof_sa1, Boolean.valueOf(n11161Nof_sa2), A11161Nof_sa2, Boolean.valueOf(n11162Nof_sa3), A11162Nof_sa3, Boolean.valueOf(n11163Nof_sa4), A11163Nof_sa4, Boolean.valueOf(n11164Nof_sa5), A11164Nof_sa5, Boolean.valueOf(n11165Nof_sa6), A11165Nof_sa6, Boolean.valueOf(n11166Nof_c10), A11166Nof_c10,
                  Boolean.valueOf(n11167Nof_stk), A11167Nof_stk, Boolean.valueOf(n11168Nof_Lbta), A11168Nof_Lbta, Boolean.valueOf(n11169Nof_Lbtp), Short.valueOf(A11169Nof_Lbtp), Boolean.valueOf(n11170Nof_c11), A11170Nof_c11, Boolean.valueOf(n11171Nof_c12), A11171Nof_c12, Boolean.valueOf(n11388Nof_imp1), A11388Nof_imp1, Boolean.valueOf(n11389Nof_imp2), A11389Nof_imp2, Boolean.valueOf(n11390Nof_imp3), A11390Nof_imp3, Boolean.valueOf(n11391Nof_imp4), A11391Nof_imp4, Boolean.valueOf(n11392Nof_imp5), A11392Nof_imp5, Boolean.valueOf(n11393Nof_imp6), A11393Nof_imp6, Boolean.valueOf(n11394Nof_imp7), A11394Nof_imp7, Boolean.valueOf(n11395Nof_imp8), A11395Nof_imp8, Boolean.valueOf(n11396Nof_imp9), A11396Nof_imp9, Boolean.valueOf(n11397Nof_imp10), A11397Nof_imp10, Boolean.valueOf(n11398Nof_imp11), A11398Nof_imp11, Boolean.valueOf(n11399Nof_lavado), A11399Nof_lavado, Boolean.valueOf(n11400Nof_luz), A11400Nof_luz, Boolean.valueOf(n11401Nof_sudor), A11401Nof_sudor, Boolean.valueOf(n11402Nof_cloro), A11402Nof_cloro, Boolean.valueOf(n11403Nof_aguam), A11403Nof_aguam, Boolean.valueOf(n11404Nof_termom), A11404Nof_termom, Boolean.valueOf(n11405Nof_humeda), A11405Nof_humeda, Boolean.valueOf(n11406Nof_oekote), A11406Nof_oekote, Boolean.valueOf(n11418Nof_obs1), A11418Nof_obs1, Boolean.valueOf(n11419Nof_obs2), A11419Nof_obs2, Boolean.valueOf(n11420Nof_obs3), A11420Nof_obs3, Boolean.valueOf(n11421Nof_obs4), A11421Nof_obs4, Boolean.valueOf(n11422Nof_obs5), A11422Nof_obs5, Boolean.valueOf(n11423Nof_obs6), A11423Nof_obs6, Boolean.valueOf(n11424Nof_obs7), A11424Nof_obs7, Boolean.valueOf(n11425Nof_obs8), A11425Nof_obs8, Boolean.valueOf(n11426Nof_obs9), A11426Nof_obs9, Boolean.valueOf(n11427Nof_obs10), A11427Nof_obs10, Boolean.valueOf(n11428Nof_obs11), A11428Nof_obs11, Boolean.valueOf(n11709Nof_nc), Byte.valueOf(A11709Nof_nc), Boolean.valueOf(n11710Nof_enc), A11710Nof_enc, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOFART");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPNOFART"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AP1483( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1AP0( ) ;
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
         endLevel1AP1483( ) ;
      }
      closeExtendedTableCursors1AP1483( ) ;
   }

   public void deferredUpdate1AP1483( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AP1483( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AP1483( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AP1483( ) ;
         afterConfirm1AP1483( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AP1483( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AP13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOFART");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1483 == 0 )
                     {
                        initAll1AP1483( ) ;
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
                     resetCaption1AP0( ) ;
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
      sMode1483 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AP1483( ) ;
      Gx_mode = sMode1483 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AP1483( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_Pp.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11106Nof_Pd, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               cmbNof_Pp.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
         {
            cmbNof_Pd.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11108Nof_Pp, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               cmbNof_Pd.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtTrnCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11109Nof_Ag, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               edtTrnCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_boe.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_boe.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  cmbNof_boe.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     cmbNof_boe.setEnabled( 1 );
                     httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
                  }
               }
            }
         }
         if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            cmbNof_bob.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A11112Nof_bo, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
            {
               cmbNof_bob.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 )
               {
                  cmbNof_bob.setEnabled( 0 );
                  httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
               }
               else
               {
                  if ( GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
                  {
                     cmbNof_bob.setEnabled( 1 );
                     httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
                  }
               }
            }
         }
      }
   }

   public void endLevel1AP1483( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AP1483( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tnofart");
         if ( AnyError == 0 )
         {
            confirmValues1AP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tnofart");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AP1483( )
   {
      /* Scan By routine */
      /* Using cursor T01AP14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
      RcdFound1483 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1483 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AP1483( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1483 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1483 = (short)(1) ;
      }
   }

   public void scanEnd1AP1483( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1AP1483( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AP1483( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AP1483( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AP1483( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AP1483( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AP1483( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AP1483( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtNof_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_Hdr_Enabled), 5, 0), true);
      edtNof_r_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_r_Enabled), 5, 0), true);
      edtNof_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_p_Enabled), 5, 0), true);
      cmbNof_Pd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
      cmbNof_Mcot.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Mcot.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Mcot.getEnabled(), 5, 0), true);
      cmbNof_Pp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
      cmbNof_Ag.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Ag.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Ag.getEnabled(), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtNof_c1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c1_Enabled), 5, 0), true);
      edtNof_c2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c2_Enabled), 5, 0), true);
      cmbNof_bo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_bo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bo.getEnabled(), 5, 0), true);
      cmbNof_bob.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
      cmbNof_boe.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
      cmbNof_Bov.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Bov.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Bov.getEnabled(), 5, 0), true);
      edtNof_c3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c3_Enabled), 5, 0), true);
      cmbNof_tns.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_tns.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_tns.getEnabled(), 5, 0), true);
      cmbNof_tnc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_tnc.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_tnc.getEnabled(), 5, 0), true);
      edtNof_c4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c4_Enabled), 5, 0), true);
      cmbNof_ct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ct.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ct.getEnabled(), 5, 0), true);
      edtNof_c5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c5_Enabled), 5, 0), true);
      cmbNof_scs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_scs.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_scs.getEnabled(), 5, 0), true);
      cmbNof_scc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_scc.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_scc.getEnabled(), 5, 0), true);
      edtNof_c6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c6_Enabled), 5, 0), true);
      cmbNof_cctse.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctse.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_cctse.getEnabled(), 5, 0), true);
      cmbNof_ccttp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccttp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccttp.getEnabled(), 5, 0), true);
      cmbNof_cctet.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctet.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_cctet.getEnabled(), 5, 0), true);
      edtNof_ccp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_ccp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_ccp_Enabled), 5, 0), true);
      edtNof_cct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_cct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_cct_Enabled), 5, 0), true);
      cmbNof_ccpc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccpc.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccpc.getEnabled(), 5, 0), true);
      cmbNof_cctq.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctq.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_cctq.getEnabled(), 5, 0), true);
      cmbNof_cccc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cccc.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_cccc.getEnabled(), 5, 0), true);
      cmbNof_ccec.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccec.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccec.getEnabled(), 5, 0), true);
      cmbNof_ccmc1.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc1.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccmc1.getEnabled(), 5, 0), true);
      cmbNof_ccmc2.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc2.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccmc2.getEnabled(), 5, 0), true);
      cmbNof_ccmc3.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc3.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccmc3.getEnabled(), 5, 0), true);
      cmbNof_ccmc4.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc4.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccmc4.getEnabled(), 5, 0), true);
      cmbNof_ccmc5.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc5.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccmc5.getEnabled(), 5, 0), true);
      cmbNof_ccmc6.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc6.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ccmc6.getEnabled(), 5, 0), true);
      edtNof_c7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c7_Enabled), 5, 0), true);
      cmbNof_rb.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_rb.getEnabled(), 5, 0), true);
      cmbNof_rbi.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbi.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_rbi.getEnabled(), 5, 0), true);
      cmbNof_rbe.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_rbe.getEnabled(), 5, 0), true);
      cmbNof_rbp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_rbp.getEnabled(), 5, 0), true);
      edtNof_rboc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_rboc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_rboc_Enabled), 5, 0), true);
      cmbNof_rb1.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb1.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_rb1.getEnabled(), 5, 0), true);
      cmbNof_rb3.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb3.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_rb3.getEnabled(), 5, 0), true);
      edtNof_c8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c8_Enabled), 5, 0), true);
      cmbNof_ep1.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep1.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep1.getEnabled(), 5, 0), true);
      cmbNof_ep2.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep2.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep2.getEnabled(), 5, 0), true);
      cmbNof_ep3.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep3.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep3.getEnabled(), 5, 0), true);
      cmbNof_ep4.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep4.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep4.getEnabled(), 5, 0), true);
      cmbNof_ep5.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep5.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep5.getEnabled(), 5, 0), true);
      cmbNof_ep6.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep6.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep6.getEnabled(), 5, 0), true);
      cmbNof_ep7.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep7.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep7.getEnabled(), 5, 0), true);
      cmbNof_ep8.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep8.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep8.getEnabled(), 5, 0), true);
      cmbNof_ep9.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep9.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep9.getEnabled(), 5, 0), true);
      cmbNof_ep10.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep10.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_ep10.getEnabled(), 5, 0), true);
      edtNof_c9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c9_Enabled), 5, 0), true);
      cmbNof_sa1.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa1.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_sa1.getEnabled(), 5, 0), true);
      cmbNof_sa2.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa2.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_sa2.getEnabled(), 5, 0), true);
      cmbNof_sa3.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa3.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_sa3.getEnabled(), 5, 0), true);
      cmbNof_sa4.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa4.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_sa4.getEnabled(), 5, 0), true);
      cmbNof_sa5.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa5.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_sa5.getEnabled(), 5, 0), true);
      cmbNof_sa6.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa6.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_sa6.getEnabled(), 5, 0), true);
      edtNof_c10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c10_Enabled), 5, 0), true);
      cmbNof_stk.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_stk.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_stk.getEnabled(), 5, 0), true);
      edtNof_Lbta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_Lbta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_Lbta_Enabled), 5, 0), true);
      edtNof_Lbtp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_Lbtp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_Lbtp_Enabled), 5, 0), true);
      edtNof_c11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c11_Enabled), 5, 0), true);
      edtNof_c12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_c12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_c12_Enabled), 5, 0), true);
      edtNof_imp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp1_Enabled), 5, 0), true);
      edtNof_imp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp2_Enabled), 5, 0), true);
      edtNof_imp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp3_Enabled), 5, 0), true);
      edtNof_imp4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp4_Enabled), 5, 0), true);
      edtNof_imp5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp5_Enabled), 5, 0), true);
      edtNof_imp6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp6_Enabled), 5, 0), true);
      edtNof_imp7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp7_Enabled), 5, 0), true);
      edtNof_imp8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp8_Enabled), 5, 0), true);
      edtNof_imp9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp9_Enabled), 5, 0), true);
      edtNof_imp10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp10_Enabled), 5, 0), true);
      edtNof_imp11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_imp11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_imp11_Enabled), 5, 0), true);
      edtNof_lavado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_lavado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_lavado_Enabled), 5, 0), true);
      edtNof_luz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_luz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_luz_Enabled), 5, 0), true);
      edtNof_sudor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_sudor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_sudor_Enabled), 5, 0), true);
      edtNof_cloro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_cloro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_cloro_Enabled), 5, 0), true);
      edtNof_aguam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_aguam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_aguam_Enabled), 5, 0), true);
      edtNof_termom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_termom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_termom_Enabled), 5, 0), true);
      edtNof_humeda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_humeda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_humeda_Enabled), 5, 0), true);
      edtNof_oekote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_oekote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_oekote_Enabled), 5, 0), true);
      edtNof_obs1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs1_Enabled), 5, 0), true);
      edtNof_obs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs2_Enabled), 5, 0), true);
      edtNof_obs3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs3_Enabled), 5, 0), true);
      edtNof_obs4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs4_Enabled), 5, 0), true);
      edtNof_obs5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs5_Enabled), 5, 0), true);
      edtNof_obs6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs6_Enabled), 5, 0), true);
      edtNof_obs7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs7_Enabled), 5, 0), true);
      edtNof_obs8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs8_Enabled), 5, 0), true);
      edtNof_obs9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs9_Enabled), 5, 0), true);
      edtNof_obs10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs10_Enabled), 5, 0), true);
      edtNof_obs11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_obs11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_obs11_Enabled), 5, 0), true);
      edtNof_nc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_nc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_nc_Enabled), 5, 0), true);
      edtNof_enc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNof_enc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNof_enc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1AP1483( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1AP0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tnofart", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11103Nof_Hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A11104Nof_r,1,0)),GXutil.URLEncode(GXutil.rtrim(A11105Nof_p))}, new String[] {"EmprCod","Nof_Hdr","Nof_r","Nof_p"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11103Nof_Hdr", GXutil.ltrim( localUtil.ntoc( Z11103Nof_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11104Nof_r", GXutil.ltrim( localUtil.ntoc( Z11104Nof_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11105Nof_p", GXutil.rtrim( Z11105Nof_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11106Nof_Pd", GXutil.rtrim( Z11106Nof_Pd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11107Nof_Mcot", GXutil.rtrim( Z11107Nof_Mcot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11108Nof_Pp", GXutil.rtrim( Z11108Nof_Pp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11109Nof_Ag", GXutil.rtrim( Z11109Nof_Ag));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11110Nof_c1", Z11110Nof_c1);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11111Nof_c2", Z11111Nof_c2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11112Nof_bo", GXutil.rtrim( Z11112Nof_bo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11113Nof_bob", GXutil.rtrim( Z11113Nof_bob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11114Nof_boe", GXutil.rtrim( Z11114Nof_boe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11115Nof_Bov", GXutil.rtrim( Z11115Nof_Bov));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11116Nof_c3", Z11116Nof_c3);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11117Nof_tns", GXutil.rtrim( Z11117Nof_tns));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11118Nof_tnc", GXutil.rtrim( Z11118Nof_tnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11119Nof_c4", Z11119Nof_c4);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11120Nof_ct", GXutil.rtrim( Z11120Nof_ct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11121Nof_c5", Z11121Nof_c5);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11122Nof_scs", GXutil.rtrim( Z11122Nof_scs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11123Nof_scc", GXutil.rtrim( Z11123Nof_scc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11124Nof_c6", Z11124Nof_c6);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11125Nof_cctse", GXutil.rtrim( Z11125Nof_cctse));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11126Nof_ccttp", GXutil.rtrim( Z11126Nof_ccttp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11127Nof_cctet", GXutil.rtrim( Z11127Nof_cctet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11128Nof_ccp", GXutil.ltrim( localUtil.ntoc( Z11128Nof_ccp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11129Nof_cct", GXutil.ltrim( localUtil.ntoc( Z11129Nof_cct, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11130Nof_ccpc", GXutil.rtrim( Z11130Nof_ccpc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11131Nof_cctq", GXutil.rtrim( Z11131Nof_cctq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11132Nof_cccc", GXutil.rtrim( Z11132Nof_cccc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11133Nof_ccec", GXutil.rtrim( Z11133Nof_ccec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11134Nof_ccmc1", GXutil.rtrim( Z11134Nof_ccmc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11135Nof_ccmc2", GXutil.rtrim( Z11135Nof_ccmc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11136Nof_ccmc3", GXutil.rtrim( Z11136Nof_ccmc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11137Nof_ccmc4", GXutil.rtrim( Z11137Nof_ccmc4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11138Nof_ccmc5", GXutil.rtrim( Z11138Nof_ccmc5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11139Nof_ccmc6", GXutil.rtrim( Z11139Nof_ccmc6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11140Nof_c7", Z11140Nof_c7);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11141Nof_rb", GXutil.rtrim( Z11141Nof_rb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11142Nof_rbi", GXutil.rtrim( Z11142Nof_rbi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11143Nof_rbe", GXutil.rtrim( Z11143Nof_rbe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11144Nof_rbp", GXutil.rtrim( Z11144Nof_rbp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11145Nof_rboc", GXutil.ltrim( localUtil.ntoc( Z11145Nof_rboc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11146Nof_rb1", GXutil.rtrim( Z11146Nof_rb1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11147Nof_rb3", GXutil.rtrim( Z11147Nof_rb3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11148Nof_c8", Z11148Nof_c8);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11149Nof_ep1", GXutil.rtrim( Z11149Nof_ep1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11150Nof_ep2", GXutil.rtrim( Z11150Nof_ep2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11151Nof_ep3", GXutil.rtrim( Z11151Nof_ep3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11152Nof_ep4", GXutil.rtrim( Z11152Nof_ep4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11153Nof_ep5", GXutil.rtrim( Z11153Nof_ep5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11154Nof_ep6", GXutil.rtrim( Z11154Nof_ep6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11155Nof_ep7", GXutil.rtrim( Z11155Nof_ep7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11156Nof_ep8", GXutil.rtrim( Z11156Nof_ep8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11157Nof_ep9", GXutil.rtrim( Z11157Nof_ep9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11158Nof_ep10", GXutil.rtrim( Z11158Nof_ep10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11159Nof_c9", Z11159Nof_c9);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11160Nof_sa1", GXutil.rtrim( Z11160Nof_sa1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11161Nof_sa2", GXutil.rtrim( Z11161Nof_sa2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11162Nof_sa3", GXutil.rtrim( Z11162Nof_sa3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11163Nof_sa4", GXutil.rtrim( Z11163Nof_sa4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11164Nof_sa5", GXutil.rtrim( Z11164Nof_sa5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11165Nof_sa6", GXutil.rtrim( Z11165Nof_sa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11166Nof_c10", Z11166Nof_c10);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11167Nof_stk", GXutil.rtrim( Z11167Nof_stk));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11168Nof_Lbta", GXutil.rtrim( Z11168Nof_Lbta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11169Nof_Lbtp", GXutil.ltrim( localUtil.ntoc( Z11169Nof_Lbtp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11170Nof_c11", Z11170Nof_c11);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11171Nof_c12", Z11171Nof_c12);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11388Nof_imp1", GXutil.rtrim( Z11388Nof_imp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11389Nof_imp2", GXutil.rtrim( Z11389Nof_imp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11390Nof_imp3", GXutil.rtrim( Z11390Nof_imp3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11391Nof_imp4", GXutil.rtrim( Z11391Nof_imp4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11392Nof_imp5", GXutil.rtrim( Z11392Nof_imp5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11393Nof_imp6", GXutil.rtrim( Z11393Nof_imp6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11394Nof_imp7", GXutil.rtrim( Z11394Nof_imp7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11395Nof_imp8", GXutil.rtrim( Z11395Nof_imp8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11396Nof_imp9", GXutil.rtrim( Z11396Nof_imp9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11397Nof_imp10", GXutil.rtrim( Z11397Nof_imp10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11398Nof_imp11", GXutil.rtrim( Z11398Nof_imp11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11399Nof_lavado", GXutil.rtrim( Z11399Nof_lavado));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11400Nof_luz", GXutil.rtrim( Z11400Nof_luz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11401Nof_sudor", GXutil.rtrim( Z11401Nof_sudor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11402Nof_cloro", GXutil.rtrim( Z11402Nof_cloro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11403Nof_aguam", GXutil.rtrim( Z11403Nof_aguam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11404Nof_termom", GXutil.rtrim( Z11404Nof_termom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11405Nof_humeda", GXutil.ltrim( localUtil.ntoc( Z11405Nof_humeda, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11406Nof_oekote", GXutil.rtrim( Z11406Nof_oekote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11418Nof_obs1", GXutil.rtrim( Z11418Nof_obs1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11419Nof_obs2", GXutil.rtrim( Z11419Nof_obs2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11420Nof_obs3", GXutil.rtrim( Z11420Nof_obs3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11421Nof_obs4", GXutil.rtrim( Z11421Nof_obs4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11422Nof_obs5", GXutil.rtrim( Z11422Nof_obs5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11423Nof_obs6", GXutil.rtrim( Z11423Nof_obs6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11424Nof_obs7", GXutil.rtrim( Z11424Nof_obs7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11425Nof_obs8", GXutil.rtrim( Z11425Nof_obs8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11426Nof_obs9", GXutil.rtrim( Z11426Nof_obs9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11427Nof_obs10", GXutil.rtrim( Z11427Nof_obs10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11428Nof_obs11", GXutil.rtrim( Z11428Nof_obs11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11709Nof_nc", GXutil.ltrim( localUtil.ntoc( Z11709Nof_nc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11710Nof_enc", GXutil.ltrim( localUtil.ntoc( Z11710Nof_enc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tnofart", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11103Nof_Hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A11104Nof_r,1,0)),GXutil.URLEncode(GXutil.rtrim(A11105Nof_p))}, new String[] {"EmprCod","Nof_Hdr","Nof_r","Nof_p"})  ;
   }

   public String getPgmname( )
   {
      return "TNOFART" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FICHA TECNICA ASOCIADA A NOF", "") ;
   }

   public void initializeNonKey1AP1483( )
   {
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A11110Nof_c1 = "" ;
      n11110Nof_c1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11110Nof_c1", A11110Nof_c1);
      A11111Nof_c2 = "" ;
      n11111Nof_c2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11111Nof_c2", A11111Nof_c2);
      A11115Nof_Bov = "" ;
      n11115Nof_Bov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11115Nof_Bov", A11115Nof_Bov);
      A11116Nof_c3 = "" ;
      n11116Nof_c3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11116Nof_c3", A11116Nof_c3);
      A11119Nof_c4 = "" ;
      n11119Nof_c4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11119Nof_c4", A11119Nof_c4);
      A11121Nof_c5 = "" ;
      n11121Nof_c5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11121Nof_c5", A11121Nof_c5);
      A11124Nof_c6 = "" ;
      n11124Nof_c6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11124Nof_c6", A11124Nof_c6);
      A11128Nof_ccp = (byte)(0) ;
      n11128Nof_ccp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11128Nof_ccp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11128Nof_ccp), 2, 0));
      A11129Nof_cct = (byte)(0) ;
      n11129Nof_cct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11129Nof_cct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11129Nof_cct), 2, 0));
      A11140Nof_c7 = "" ;
      n11140Nof_c7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11140Nof_c7", A11140Nof_c7);
      A11145Nof_rboc = (short)(0) ;
      n11145Nof_rboc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11145Nof_rboc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11145Nof_rboc), 3, 0));
      A11148Nof_c8 = "" ;
      n11148Nof_c8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11148Nof_c8", A11148Nof_c8);
      A11159Nof_c9 = "" ;
      n11159Nof_c9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11159Nof_c9", A11159Nof_c9);
      A11163Nof_sa4 = "" ;
      n11163Nof_sa4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11163Nof_sa4", A11163Nof_sa4);
      A11166Nof_c10 = "" ;
      n11166Nof_c10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11166Nof_c10", A11166Nof_c10);
      A11168Nof_Lbta = "" ;
      n11168Nof_Lbta = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11168Nof_Lbta", A11168Nof_Lbta);
      A11169Nof_Lbtp = (short)(0) ;
      n11169Nof_Lbtp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11169Nof_Lbtp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11169Nof_Lbtp), 4, 0));
      A11170Nof_c11 = "" ;
      n11170Nof_c11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11170Nof_c11", A11170Nof_c11);
      A11171Nof_c12 = "" ;
      n11171Nof_c12 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11171Nof_c12", A11171Nof_c12);
      A11388Nof_imp1 = "" ;
      n11388Nof_imp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11388Nof_imp1", A11388Nof_imp1);
      A11389Nof_imp2 = "" ;
      n11389Nof_imp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11389Nof_imp2", A11389Nof_imp2);
      A11390Nof_imp3 = "" ;
      n11390Nof_imp3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11390Nof_imp3", A11390Nof_imp3);
      A11391Nof_imp4 = "" ;
      n11391Nof_imp4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11391Nof_imp4", A11391Nof_imp4);
      A11392Nof_imp5 = "" ;
      n11392Nof_imp5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11392Nof_imp5", A11392Nof_imp5);
      A11393Nof_imp6 = "" ;
      n11393Nof_imp6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11393Nof_imp6", A11393Nof_imp6);
      A11394Nof_imp7 = "" ;
      n11394Nof_imp7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11394Nof_imp7", A11394Nof_imp7);
      A11395Nof_imp8 = "" ;
      n11395Nof_imp8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11395Nof_imp8", A11395Nof_imp8);
      A11396Nof_imp9 = "" ;
      n11396Nof_imp9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11396Nof_imp9", A11396Nof_imp9);
      A11397Nof_imp10 = "" ;
      n11397Nof_imp10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11397Nof_imp10", A11397Nof_imp10);
      A11398Nof_imp11 = "" ;
      n11398Nof_imp11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11398Nof_imp11", A11398Nof_imp11);
      A11399Nof_lavado = "" ;
      n11399Nof_lavado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11399Nof_lavado", A11399Nof_lavado);
      A11400Nof_luz = "" ;
      n11400Nof_luz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11400Nof_luz", A11400Nof_luz);
      A11401Nof_sudor = "" ;
      n11401Nof_sudor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11401Nof_sudor", A11401Nof_sudor);
      A11402Nof_cloro = "" ;
      n11402Nof_cloro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11402Nof_cloro", A11402Nof_cloro);
      A11403Nof_aguam = "" ;
      n11403Nof_aguam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11403Nof_aguam", A11403Nof_aguam);
      A11404Nof_termom = "" ;
      n11404Nof_termom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11404Nof_termom", A11404Nof_termom);
      A11405Nof_humeda = DecimalUtil.ZERO ;
      n11405Nof_humeda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11405Nof_humeda", GXutil.ltrimstr( A11405Nof_humeda, 6, 2));
      A11406Nof_oekote = "" ;
      n11406Nof_oekote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11406Nof_oekote", A11406Nof_oekote);
      A11418Nof_obs1 = "" ;
      n11418Nof_obs1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11418Nof_obs1", A11418Nof_obs1);
      A11419Nof_obs2 = "" ;
      n11419Nof_obs2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11419Nof_obs2", A11419Nof_obs2);
      A11420Nof_obs3 = "" ;
      n11420Nof_obs3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11420Nof_obs3", A11420Nof_obs3);
      A11421Nof_obs4 = "" ;
      n11421Nof_obs4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11421Nof_obs4", A11421Nof_obs4);
      A11422Nof_obs5 = "" ;
      n11422Nof_obs5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11422Nof_obs5", A11422Nof_obs5);
      A11423Nof_obs6 = "" ;
      n11423Nof_obs6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11423Nof_obs6", A11423Nof_obs6);
      A11424Nof_obs7 = "" ;
      n11424Nof_obs7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11424Nof_obs7", A11424Nof_obs7);
      A11425Nof_obs8 = "" ;
      n11425Nof_obs8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11425Nof_obs8", A11425Nof_obs8);
      A11426Nof_obs9 = "" ;
      n11426Nof_obs9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11426Nof_obs9", A11426Nof_obs9);
      A11427Nof_obs10 = "" ;
      n11427Nof_obs10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11427Nof_obs10", A11427Nof_obs10);
      A11428Nof_obs11 = "" ;
      n11428Nof_obs11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11428Nof_obs11", A11428Nof_obs11);
      A11709Nof_nc = (byte)(0) ;
      n11709Nof_nc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11709Nof_nc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11709Nof_nc), 2, 0));
      A11710Nof_enc = DecimalUtil.ZERO ;
      n11710Nof_enc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11710Nof_enc", GXutil.ltrimstr( A11710Nof_enc, 6, 2));
      A11106Nof_Pd = httpContext.getMessage( "N", "") ;
      n11106Nof_Pd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
      A11107Nof_Mcot = httpContext.getMessage( "N", "") ;
      n11107Nof_Mcot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
      A11108Nof_Pp = httpContext.getMessage( "N", "") ;
      n11108Nof_Pp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
      A11109Nof_Ag = httpContext.getMessage( "N", "") ;
      n11109Nof_Ag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
      A11112Nof_bo = httpContext.getMessage( "N", "") ;
      n11112Nof_bo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
      A11113Nof_bob = httpContext.getMessage( "N", "") ;
      n11113Nof_bob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
      A11114Nof_boe = httpContext.getMessage( "N", "") ;
      n11114Nof_boe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
      A11117Nof_tns = httpContext.getMessage( "N", "") ;
      n11117Nof_tns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
      A11118Nof_tnc = httpContext.getMessage( "N", "") ;
      n11118Nof_tnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
      A11120Nof_ct = httpContext.getMessage( "N", "") ;
      n11120Nof_ct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
      A11122Nof_scs = httpContext.getMessage( "N", "") ;
      n11122Nof_scs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
      A11123Nof_scc = httpContext.getMessage( "N", "") ;
      n11123Nof_scc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
      A11125Nof_cctse = httpContext.getMessage( "N", "") ;
      n11125Nof_cctse = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
      A11126Nof_ccttp = httpContext.getMessage( "N", "") ;
      n11126Nof_ccttp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
      A11127Nof_cctet = httpContext.getMessage( "N", "") ;
      n11127Nof_cctet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
      A11130Nof_ccpc = httpContext.getMessage( "N", "") ;
      n11130Nof_ccpc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
      A11131Nof_cctq = httpContext.getMessage( "N", "") ;
      n11131Nof_cctq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
      A11132Nof_cccc = httpContext.getMessage( "N", "") ;
      n11132Nof_cccc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
      A11133Nof_ccec = httpContext.getMessage( "N", "") ;
      n11133Nof_ccec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
      A11134Nof_ccmc1 = httpContext.getMessage( "N", "") ;
      n11134Nof_ccmc1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
      A11135Nof_ccmc2 = httpContext.getMessage( "N", "") ;
      n11135Nof_ccmc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
      A11136Nof_ccmc3 = httpContext.getMessage( "N", "") ;
      n11136Nof_ccmc3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
      A11137Nof_ccmc4 = httpContext.getMessage( "N", "") ;
      n11137Nof_ccmc4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
      A11138Nof_ccmc5 = httpContext.getMessage( "N", "") ;
      n11138Nof_ccmc5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
      A11139Nof_ccmc6 = httpContext.getMessage( "N", "") ;
      n11139Nof_ccmc6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
      A11141Nof_rb = httpContext.getMessage( "N", "") ;
      n11141Nof_rb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
      A11142Nof_rbi = httpContext.getMessage( "N", "") ;
      n11142Nof_rbi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
      A11143Nof_rbe = httpContext.getMessage( "N", "") ;
      n11143Nof_rbe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
      A11144Nof_rbp = httpContext.getMessage( "N", "") ;
      n11144Nof_rbp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
      A11146Nof_rb1 = httpContext.getMessage( "N", "") ;
      n11146Nof_rb1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
      A11147Nof_rb3 = httpContext.getMessage( "N", "") ;
      n11147Nof_rb3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
      A11149Nof_ep1 = httpContext.getMessage( "N", "") ;
      n11149Nof_ep1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
      A11150Nof_ep2 = httpContext.getMessage( "N", "") ;
      n11150Nof_ep2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
      A11151Nof_ep3 = httpContext.getMessage( "N", "") ;
      n11151Nof_ep3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
      A11152Nof_ep4 = httpContext.getMessage( "N", "") ;
      n11152Nof_ep4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
      A11153Nof_ep5 = httpContext.getMessage( "N", "") ;
      n11153Nof_ep5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
      A11154Nof_ep6 = httpContext.getMessage( "N", "") ;
      n11154Nof_ep6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
      A11155Nof_ep7 = httpContext.getMessage( "N", "") ;
      n11155Nof_ep7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
      A11156Nof_ep8 = httpContext.getMessage( "N", "") ;
      n11156Nof_ep8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
      A11157Nof_ep9 = httpContext.getMessage( "N", "") ;
      n11157Nof_ep9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
      A11158Nof_ep10 = httpContext.getMessage( "N", "") ;
      n11158Nof_ep10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
      A11160Nof_sa1 = httpContext.getMessage( "N", "") ;
      n11160Nof_sa1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
      A11161Nof_sa2 = httpContext.getMessage( "N", "") ;
      n11161Nof_sa2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
      A11162Nof_sa3 = httpContext.getMessage( "N", "") ;
      n11162Nof_sa3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
      A11164Nof_sa5 = httpContext.getMessage( "N", "") ;
      n11164Nof_sa5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
      A11165Nof_sa6 = httpContext.getMessage( "N", "") ;
      n11165Nof_sa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
      A11167Nof_stk = httpContext.getMessage( "N", "") ;
      n11167Nof_stk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
      Z11106Nof_Pd = "" ;
      Z11107Nof_Mcot = "" ;
      Z11108Nof_Pp = "" ;
      Z11109Nof_Ag = "" ;
      Z11110Nof_c1 = "" ;
      Z11111Nof_c2 = "" ;
      Z11112Nof_bo = "" ;
      Z11113Nof_bob = "" ;
      Z11114Nof_boe = "" ;
      Z11115Nof_Bov = "" ;
      Z11116Nof_c3 = "" ;
      Z11117Nof_tns = "" ;
      Z11118Nof_tnc = "" ;
      Z11119Nof_c4 = "" ;
      Z11120Nof_ct = "" ;
      Z11121Nof_c5 = "" ;
      Z11122Nof_scs = "" ;
      Z11123Nof_scc = "" ;
      Z11124Nof_c6 = "" ;
      Z11125Nof_cctse = "" ;
      Z11126Nof_ccttp = "" ;
      Z11127Nof_cctet = "" ;
      Z11128Nof_ccp = (byte)(0) ;
      Z11129Nof_cct = (byte)(0) ;
      Z11130Nof_ccpc = "" ;
      Z11131Nof_cctq = "" ;
      Z11132Nof_cccc = "" ;
      Z11133Nof_ccec = "" ;
      Z11134Nof_ccmc1 = "" ;
      Z11135Nof_ccmc2 = "" ;
      Z11136Nof_ccmc3 = "" ;
      Z11137Nof_ccmc4 = "" ;
      Z11138Nof_ccmc5 = "" ;
      Z11139Nof_ccmc6 = "" ;
      Z11140Nof_c7 = "" ;
      Z11141Nof_rb = "" ;
      Z11142Nof_rbi = "" ;
      Z11143Nof_rbe = "" ;
      Z11144Nof_rbp = "" ;
      Z11145Nof_rboc = (short)(0) ;
      Z11146Nof_rb1 = "" ;
      Z11147Nof_rb3 = "" ;
      Z11148Nof_c8 = "" ;
      Z11149Nof_ep1 = "" ;
      Z11150Nof_ep2 = "" ;
      Z11151Nof_ep3 = "" ;
      Z11152Nof_ep4 = "" ;
      Z11153Nof_ep5 = "" ;
      Z11154Nof_ep6 = "" ;
      Z11155Nof_ep7 = "" ;
      Z11156Nof_ep8 = "" ;
      Z11157Nof_ep9 = "" ;
      Z11158Nof_ep10 = "" ;
      Z11159Nof_c9 = "" ;
      Z11160Nof_sa1 = "" ;
      Z11161Nof_sa2 = "" ;
      Z11162Nof_sa3 = "" ;
      Z11163Nof_sa4 = "" ;
      Z11164Nof_sa5 = "" ;
      Z11165Nof_sa6 = "" ;
      Z11166Nof_c10 = "" ;
      Z11167Nof_stk = "" ;
      Z11168Nof_Lbta = "" ;
      Z11169Nof_Lbtp = (short)(0) ;
      Z11170Nof_c11 = "" ;
      Z11171Nof_c12 = "" ;
      Z11388Nof_imp1 = "" ;
      Z11389Nof_imp2 = "" ;
      Z11390Nof_imp3 = "" ;
      Z11391Nof_imp4 = "" ;
      Z11392Nof_imp5 = "" ;
      Z11393Nof_imp6 = "" ;
      Z11394Nof_imp7 = "" ;
      Z11395Nof_imp8 = "" ;
      Z11396Nof_imp9 = "" ;
      Z11397Nof_imp10 = "" ;
      Z11398Nof_imp11 = "" ;
      Z11399Nof_lavado = "" ;
      Z11400Nof_luz = "" ;
      Z11401Nof_sudor = "" ;
      Z11402Nof_cloro = "" ;
      Z11403Nof_aguam = "" ;
      Z11404Nof_termom = "" ;
      Z11405Nof_humeda = DecimalUtil.ZERO ;
      Z11406Nof_oekote = "" ;
      Z11418Nof_obs1 = "" ;
      Z11419Nof_obs2 = "" ;
      Z11420Nof_obs3 = "" ;
      Z11421Nof_obs4 = "" ;
      Z11422Nof_obs5 = "" ;
      Z11423Nof_obs6 = "" ;
      Z11424Nof_obs7 = "" ;
      Z11425Nof_obs8 = "" ;
      Z11426Nof_obs9 = "" ;
      Z11427Nof_obs10 = "" ;
      Z11428Nof_obs11 = "" ;
      Z11709Nof_nc = (byte)(0) ;
      Z11710Nof_enc = DecimalUtil.ZERO ;
      Z840TrnCod = (short)(0) ;
   }

   public void initAll1AP1483( )
   {
      initializeNonKey1AP1483( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11107Nof_Mcot = i11107Nof_Mcot ;
      n11107Nof_Mcot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
      A11106Nof_Pd = i11106Nof_Pd ;
      n11106Nof_Pd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
      A11108Nof_Pp = i11108Nof_Pp ;
      n11108Nof_Pp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
      A11109Nof_Ag = i11109Nof_Ag ;
      n11109Nof_Ag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
      A11112Nof_bo = i11112Nof_bo ;
      n11112Nof_bo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
      A11113Nof_bob = i11113Nof_bob ;
      n11113Nof_bob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
      A11114Nof_boe = i11114Nof_boe ;
      n11114Nof_boe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
      A11117Nof_tns = i11117Nof_tns ;
      n11117Nof_tns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
      A11118Nof_tnc = i11118Nof_tnc ;
      n11118Nof_tnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
      A11120Nof_ct = i11120Nof_ct ;
      n11120Nof_ct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
      A11122Nof_scs = i11122Nof_scs ;
      n11122Nof_scs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
      A11123Nof_scc = i11123Nof_scc ;
      n11123Nof_scc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
      A11125Nof_cctse = i11125Nof_cctse ;
      n11125Nof_cctse = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
      A11126Nof_ccttp = i11126Nof_ccttp ;
      n11126Nof_ccttp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
      A11127Nof_cctet = i11127Nof_cctet ;
      n11127Nof_cctet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
      A11130Nof_ccpc = i11130Nof_ccpc ;
      n11130Nof_ccpc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
      A11131Nof_cctq = i11131Nof_cctq ;
      n11131Nof_cctq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
      A11132Nof_cccc = i11132Nof_cccc ;
      n11132Nof_cccc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
      A11133Nof_ccec = i11133Nof_ccec ;
      n11133Nof_ccec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
      A11134Nof_ccmc1 = i11134Nof_ccmc1 ;
      n11134Nof_ccmc1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
      A11135Nof_ccmc2 = i11135Nof_ccmc2 ;
      n11135Nof_ccmc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
      A11136Nof_ccmc3 = i11136Nof_ccmc3 ;
      n11136Nof_ccmc3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
      A11137Nof_ccmc4 = i11137Nof_ccmc4 ;
      n11137Nof_ccmc4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
      A11138Nof_ccmc5 = i11138Nof_ccmc5 ;
      n11138Nof_ccmc5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
      A11139Nof_ccmc6 = i11139Nof_ccmc6 ;
      n11139Nof_ccmc6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
      A11141Nof_rb = i11141Nof_rb ;
      n11141Nof_rb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
      A11143Nof_rbe = i11143Nof_rbe ;
      n11143Nof_rbe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
      A11142Nof_rbi = i11142Nof_rbi ;
      n11142Nof_rbi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
      A11144Nof_rbp = i11144Nof_rbp ;
      n11144Nof_rbp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
      A11146Nof_rb1 = i11146Nof_rb1 ;
      n11146Nof_rb1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
      A11147Nof_rb3 = i11147Nof_rb3 ;
      n11147Nof_rb3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
      A11149Nof_ep1 = i11149Nof_ep1 ;
      n11149Nof_ep1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
      A11150Nof_ep2 = i11150Nof_ep2 ;
      n11150Nof_ep2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
      A11151Nof_ep3 = i11151Nof_ep3 ;
      n11151Nof_ep3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
      A11152Nof_ep4 = i11152Nof_ep4 ;
      n11152Nof_ep4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
      A11153Nof_ep5 = i11153Nof_ep5 ;
      n11153Nof_ep5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
      A11154Nof_ep6 = i11154Nof_ep6 ;
      n11154Nof_ep6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
      A11155Nof_ep7 = i11155Nof_ep7 ;
      n11155Nof_ep7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
      A11156Nof_ep8 = i11156Nof_ep8 ;
      n11156Nof_ep8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
      A11157Nof_ep9 = i11157Nof_ep9 ;
      n11157Nof_ep9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
      A11158Nof_ep10 = i11158Nof_ep10 ;
      n11158Nof_ep10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
      A11160Nof_sa1 = i11160Nof_sa1 ;
      n11160Nof_sa1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
      A11161Nof_sa2 = i11161Nof_sa2 ;
      n11161Nof_sa2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
      A11162Nof_sa3 = i11162Nof_sa3 ;
      n11162Nof_sa3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
      A11164Nof_sa5 = i11164Nof_sa5 ;
      n11164Nof_sa5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
      A11165Nof_sa6 = i11165Nof_sa6 ;
      n11165Nof_sa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
      A11167Nof_stk = i11167Nof_stk ;
      n11167Nof_stk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563273", true, true);
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
      httpContext.AddJavascriptSource("tnofart.js", "?20268241563273", false, true);
      /* End function include_jscripts */
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtNof_Hdr_Internalname = "NOF_HDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtNof_r_Internalname = "NOF_R" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtNof_p_Internalname = "NOF_P" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      cmbNof_Pd.setInternalname( "NOF_PD" );
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      cmbNof_Mcot.setInternalname( "NOF_MCOT" );
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      cmbNof_Pp.setInternalname( "NOF_PP" );
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      cmbNof_Ag.setInternalname( "NOF_AG" );
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtNof_c1_Internalname = "NOF_C1" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtNof_c2_Internalname = "NOF_C2" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      cmbNof_bo.setInternalname( "NOF_BO" );
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      cmbNof_bob.setInternalname( "NOF_BOB" );
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      cmbNof_boe.setInternalname( "NOF_BOE" );
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      cmbNof_Bov.setInternalname( "NOF_BOV" );
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtNof_c3_Internalname = "NOF_C3" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      cmbNof_tns.setInternalname( "NOF_TNS" );
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      cmbNof_tnc.setInternalname( "NOF_TNC" );
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtNof_c4_Internalname = "NOF_C4" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      cmbNof_ct.setInternalname( "NOF_CT" );
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtNof_c5_Internalname = "NOF_C5" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      cmbNof_scs.setInternalname( "NOF_SCS" );
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      cmbNof_scc.setInternalname( "NOF_SCC" );
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtNof_c6_Internalname = "NOF_C6" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      cmbNof_cctse.setInternalname( "NOF_CCTSE" );
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      cmbNof_ccttp.setInternalname( "NOF_CCTTP" );
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      cmbNof_cctet.setInternalname( "NOF_CCTET" );
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtNof_ccp_Internalname = "NOF_CCP" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtNof_cct_Internalname = "NOF_CCT" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      cmbNof_ccpc.setInternalname( "NOF_CCPC" );
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      cmbNof_cctq.setInternalname( "NOF_CCTQ" );
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      cmbNof_cccc.setInternalname( "NOF_CCCC" );
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      cmbNof_ccec.setInternalname( "NOF_CCEC" );
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      cmbNof_ccmc1.setInternalname( "NOF_CCMC1" );
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      cmbNof_ccmc2.setInternalname( "NOF_CCMC2" );
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      cmbNof_ccmc3.setInternalname( "NOF_CCMC3" );
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      cmbNof_ccmc4.setInternalname( "NOF_CCMC4" );
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      cmbNof_ccmc5.setInternalname( "NOF_CCMC5" );
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      cmbNof_ccmc6.setInternalname( "NOF_CCMC6" );
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtNof_c7_Internalname = "NOF_C7" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      cmbNof_rb.setInternalname( "NOF_RB" );
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      cmbNof_rbi.setInternalname( "NOF_RBI" );
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      cmbNof_rbe.setInternalname( "NOF_RBE" );
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      cmbNof_rbp.setInternalname( "NOF_RBP" );
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtNof_rboc_Internalname = "NOF_RBOC" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      cmbNof_rb1.setInternalname( "NOF_RB1" );
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      cmbNof_rb3.setInternalname( "NOF_RB3" );
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtNof_c8_Internalname = "NOF_C8" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      cmbNof_ep1.setInternalname( "NOF_EP1" );
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      cmbNof_ep2.setInternalname( "NOF_EP2" );
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      cmbNof_ep3.setInternalname( "NOF_EP3" );
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      cmbNof_ep4.setInternalname( "NOF_EP4" );
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      cmbNof_ep5.setInternalname( "NOF_EP5" );
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      cmbNof_ep6.setInternalname( "NOF_EP6" );
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      cmbNof_ep7.setInternalname( "NOF_EP7" );
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      cmbNof_ep8.setInternalname( "NOF_EP8" );
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      cmbNof_ep9.setInternalname( "NOF_EP9" );
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      cmbNof_ep10.setInternalname( "NOF_EP10" );
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtNof_c9_Internalname = "NOF_C9" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      cmbNof_sa1.setInternalname( "NOF_SA1" );
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      cmbNof_sa2.setInternalname( "NOF_SA2" );
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      cmbNof_sa3.setInternalname( "NOF_SA3" );
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      cmbNof_sa4.setInternalname( "NOF_SA4" );
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      cmbNof_sa5.setInternalname( "NOF_SA5" );
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      cmbNof_sa6.setInternalname( "NOF_SA6" );
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtNof_c10_Internalname = "NOF_C10" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      cmbNof_stk.setInternalname( "NOF_STK" );
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtNof_Lbta_Internalname = "NOF_LBTA" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtNof_Lbtp_Internalname = "NOF_LBTP" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtNof_c11_Internalname = "NOF_C11" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtNof_c12_Internalname = "NOF_C12" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtNof_imp1_Internalname = "NOF_IMP1" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtNof_imp2_Internalname = "NOF_IMP2" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      edtNof_imp3_Internalname = "NOF_IMP3" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtNof_imp4_Internalname = "NOF_IMP4" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtNof_imp5_Internalname = "NOF_IMP5" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtNof_imp6_Internalname = "NOF_IMP6" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtNof_imp7_Internalname = "NOF_IMP7" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      edtNof_imp8_Internalname = "NOF_IMP8" ;
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtNof_imp9_Internalname = "NOF_IMP9" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      edtNof_imp10_Internalname = "NOF_IMP10" ;
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtNof_imp11_Internalname = "NOF_IMP11" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      edtNof_lavado_Internalname = "NOF_LAVADO" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      edtNof_luz_Internalname = "NOF_LUZ" ;
      lblTextblock86_Internalname = "TEXTBLOCK86" ;
      edtNof_sudor_Internalname = "NOF_SUDOR" ;
      lblTextblock87_Internalname = "TEXTBLOCK87" ;
      edtNof_cloro_Internalname = "NOF_CLORO" ;
      lblTextblock88_Internalname = "TEXTBLOCK88" ;
      edtNof_aguam_Internalname = "NOF_AGUAM" ;
      lblTextblock89_Internalname = "TEXTBLOCK89" ;
      edtNof_termom_Internalname = "NOF_TERMOM" ;
      lblTextblock90_Internalname = "TEXTBLOCK90" ;
      edtNof_humeda_Internalname = "NOF_HUMEDA" ;
      lblTextblock91_Internalname = "TEXTBLOCK91" ;
      edtNof_oekote_Internalname = "NOF_OEKOTE" ;
      lblTextblock92_Internalname = "TEXTBLOCK92" ;
      edtNof_obs1_Internalname = "NOF_OBS1" ;
      lblTextblock93_Internalname = "TEXTBLOCK93" ;
      edtNof_obs2_Internalname = "NOF_OBS2" ;
      lblTextblock94_Internalname = "TEXTBLOCK94" ;
      edtNof_obs3_Internalname = "NOF_OBS3" ;
      lblTextblock95_Internalname = "TEXTBLOCK95" ;
      edtNof_obs4_Internalname = "NOF_OBS4" ;
      lblTextblock96_Internalname = "TEXTBLOCK96" ;
      edtNof_obs5_Internalname = "NOF_OBS5" ;
      lblTextblock97_Internalname = "TEXTBLOCK97" ;
      edtNof_obs6_Internalname = "NOF_OBS6" ;
      lblTextblock98_Internalname = "TEXTBLOCK98" ;
      edtNof_obs7_Internalname = "NOF_OBS7" ;
      lblTextblock99_Internalname = "TEXTBLOCK99" ;
      edtNof_obs8_Internalname = "NOF_OBS8" ;
      lblTextblock100_Internalname = "TEXTBLOCK100" ;
      edtNof_obs9_Internalname = "NOF_OBS9" ;
      lblTextblock101_Internalname = "TEXTBLOCK101" ;
      edtNof_obs10_Internalname = "NOF_OBS10" ;
      lblTextblock102_Internalname = "TEXTBLOCK102" ;
      edtNof_obs11_Internalname = "NOF_OBS11" ;
      lblTextblock103_Internalname = "TEXTBLOCK103" ;
      edtNof_nc_Internalname = "NOF_NC" ;
      lblTextblock104_Internalname = "TEXTBLOCK104" ;
      edtNof_enc_Internalname = "NOF_ENC" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
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
      Form.setCaption( httpContext.getMessage( "FICHA TECNICA ASOCIADA A NOF", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtNof_enc_Jsonclick = "" ;
      edtNof_enc_Backcolor = (int)(0xFFFFFF) ;
      edtNof_enc_Enabled = 1 ;
      edtNof_nc_Jsonclick = "" ;
      edtNof_nc_Backcolor = (int)(0xFFFFFF) ;
      edtNof_nc_Enabled = 1 ;
      edtNof_obs11_Jsonclick = "" ;
      edtNof_obs11_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs11_Enabled = 1 ;
      edtNof_obs10_Jsonclick = "" ;
      edtNof_obs10_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs10_Enabled = 1 ;
      edtNof_obs9_Jsonclick = "" ;
      edtNof_obs9_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs9_Enabled = 1 ;
      edtNof_obs8_Jsonclick = "" ;
      edtNof_obs8_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs8_Enabled = 1 ;
      edtNof_obs7_Jsonclick = "" ;
      edtNof_obs7_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs7_Enabled = 1 ;
      edtNof_obs6_Jsonclick = "" ;
      edtNof_obs6_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs6_Enabled = 1 ;
      edtNof_obs5_Jsonclick = "" ;
      edtNof_obs5_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs5_Enabled = 1 ;
      edtNof_obs4_Jsonclick = "" ;
      edtNof_obs4_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs4_Enabled = 1 ;
      edtNof_obs3_Jsonclick = "" ;
      edtNof_obs3_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs3_Enabled = 1 ;
      edtNof_obs2_Jsonclick = "" ;
      edtNof_obs2_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs2_Enabled = 1 ;
      edtNof_obs1_Jsonclick = "" ;
      edtNof_obs1_Backcolor = (int)(0xFFFFFF) ;
      edtNof_obs1_Enabled = 1 ;
      edtNof_oekote_Jsonclick = "" ;
      edtNof_oekote_Backcolor = (int)(0xFFFFFF) ;
      edtNof_oekote_Enabled = 1 ;
      edtNof_humeda_Jsonclick = "" ;
      edtNof_humeda_Backcolor = (int)(0xFFFFFF) ;
      edtNof_humeda_Enabled = 1 ;
      edtNof_termom_Jsonclick = "" ;
      edtNof_termom_Backcolor = (int)(0xFFFFFF) ;
      edtNof_termom_Enabled = 1 ;
      edtNof_aguam_Jsonclick = "" ;
      edtNof_aguam_Backcolor = (int)(0xFFFFFF) ;
      edtNof_aguam_Enabled = 1 ;
      edtNof_cloro_Jsonclick = "" ;
      edtNof_cloro_Backcolor = (int)(0xFFFFFF) ;
      edtNof_cloro_Enabled = 1 ;
      edtNof_sudor_Jsonclick = "" ;
      edtNof_sudor_Backcolor = (int)(0xFFFFFF) ;
      edtNof_sudor_Enabled = 1 ;
      edtNof_luz_Jsonclick = "" ;
      edtNof_luz_Backcolor = (int)(0xFFFFFF) ;
      edtNof_luz_Enabled = 1 ;
      edtNof_lavado_Jsonclick = "" ;
      edtNof_lavado_Backcolor = (int)(0xFFFFFF) ;
      edtNof_lavado_Enabled = 1 ;
      edtNof_imp11_Jsonclick = "" ;
      edtNof_imp11_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp11_Enabled = 1 ;
      edtNof_imp10_Jsonclick = "" ;
      edtNof_imp10_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp10_Enabled = 1 ;
      edtNof_imp9_Jsonclick = "" ;
      edtNof_imp9_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp9_Enabled = 1 ;
      edtNof_imp8_Jsonclick = "" ;
      edtNof_imp8_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp8_Enabled = 1 ;
      edtNof_imp7_Jsonclick = "" ;
      edtNof_imp7_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp7_Enabled = 1 ;
      edtNof_imp6_Jsonclick = "" ;
      edtNof_imp6_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp6_Enabled = 1 ;
      edtNof_imp5_Jsonclick = "" ;
      edtNof_imp5_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp5_Enabled = 1 ;
      edtNof_imp4_Jsonclick = "" ;
      edtNof_imp4_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp4_Enabled = 1 ;
      edtNof_imp3_Jsonclick = "" ;
      edtNof_imp3_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp3_Enabled = 1 ;
      edtNof_imp2_Jsonclick = "" ;
      edtNof_imp2_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp2_Enabled = 1 ;
      edtNof_imp1_Jsonclick = "" ;
      edtNof_imp1_Backcolor = (int)(0xFFFFFF) ;
      edtNof_imp1_Enabled = 1 ;
      edtNof_c12_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c12_Enabled = 1 ;
      edtNof_c11_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c11_Enabled = 1 ;
      edtNof_Lbtp_Jsonclick = "" ;
      edtNof_Lbtp_Backcolor = (int)(0xFFFFFF) ;
      edtNof_Lbtp_Enabled = 1 ;
      edtNof_Lbta_Jsonclick = "" ;
      edtNof_Lbta_Backcolor = (int)(0xFFFFFF) ;
      edtNof_Lbta_Enabled = 1 ;
      cmbNof_stk.setJsonclick( "" );
      cmbNof_stk.setEnabled( 1 );
      cmbNof_stk.setIBackground( (int)(0xFFFFFF) );
      edtNof_c10_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c10_Enabled = 1 ;
      cmbNof_sa6.setJsonclick( "" );
      cmbNof_sa6.setEnabled( 1 );
      cmbNof_sa6.setIBackground( (int)(0xFFFFFF) );
      cmbNof_sa5.setJsonclick( "" );
      cmbNof_sa5.setEnabled( 1 );
      cmbNof_sa5.setIBackground( (int)(0xFFFFFF) );
      cmbNof_sa4.setJsonclick( "" );
      cmbNof_sa4.setEnabled( 1 );
      cmbNof_sa4.setIBackground( (int)(0xFFFFFF) );
      cmbNof_sa3.setJsonclick( "" );
      cmbNof_sa3.setEnabled( 1 );
      cmbNof_sa3.setIBackground( (int)(0xFFFFFF) );
      cmbNof_sa2.setJsonclick( "" );
      cmbNof_sa2.setEnabled( 1 );
      cmbNof_sa2.setIBackground( (int)(0xFFFFFF) );
      cmbNof_sa1.setJsonclick( "" );
      cmbNof_sa1.setEnabled( 1 );
      cmbNof_sa1.setIBackground( (int)(0xFFFFFF) );
      edtNof_c9_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c9_Enabled = 1 ;
      cmbNof_ep10.setJsonclick( "" );
      cmbNof_ep10.setEnabled( 1 );
      cmbNof_ep10.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep9.setJsonclick( "" );
      cmbNof_ep9.setEnabled( 1 );
      cmbNof_ep9.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep8.setJsonclick( "" );
      cmbNof_ep8.setEnabled( 1 );
      cmbNof_ep8.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep7.setJsonclick( "" );
      cmbNof_ep7.setEnabled( 1 );
      cmbNof_ep7.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep6.setJsonclick( "" );
      cmbNof_ep6.setEnabled( 1 );
      cmbNof_ep6.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep5.setJsonclick( "" );
      cmbNof_ep5.setEnabled( 1 );
      cmbNof_ep5.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep4.setJsonclick( "" );
      cmbNof_ep4.setEnabled( 1 );
      cmbNof_ep4.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep3.setJsonclick( "" );
      cmbNof_ep3.setEnabled( 1 );
      cmbNof_ep3.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep2.setJsonclick( "" );
      cmbNof_ep2.setEnabled( 1 );
      cmbNof_ep2.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ep1.setJsonclick( "" );
      cmbNof_ep1.setEnabled( 1 );
      cmbNof_ep1.setIBackground( (int)(0xFFFFFF) );
      edtNof_c8_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c8_Enabled = 1 ;
      cmbNof_rb3.setJsonclick( "" );
      cmbNof_rb3.setEnabled( 1 );
      cmbNof_rb3.setIBackground( (int)(0xFFFFFF) );
      cmbNof_rb1.setJsonclick( "" );
      cmbNof_rb1.setEnabled( 1 );
      cmbNof_rb1.setIBackground( (int)(0xFFFFFF) );
      edtNof_rboc_Jsonclick = "" ;
      edtNof_rboc_Backcolor = (int)(0xFFFFFF) ;
      edtNof_rboc_Enabled = 1 ;
      cmbNof_rbp.setJsonclick( "" );
      cmbNof_rbp.setEnabled( 1 );
      cmbNof_rbp.setIBackground( (int)(0xFFFFFF) );
      cmbNof_rbe.setJsonclick( "" );
      cmbNof_rbe.setEnabled( 1 );
      cmbNof_rbe.setIBackground( (int)(0xFFFFFF) );
      cmbNof_rbi.setJsonclick( "" );
      cmbNof_rbi.setEnabled( 1 );
      cmbNof_rbi.setIBackground( (int)(0xFFFFFF) );
      cmbNof_rb.setJsonclick( "" );
      cmbNof_rb.setEnabled( 1 );
      cmbNof_rb.setIBackground( (int)(0xFFFFFF) );
      edtNof_c7_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c7_Enabled = 1 ;
      cmbNof_ccmc6.setJsonclick( "" );
      cmbNof_ccmc6.setEnabled( 1 );
      cmbNof_ccmc6.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccmc5.setJsonclick( "" );
      cmbNof_ccmc5.setEnabled( 1 );
      cmbNof_ccmc5.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccmc4.setJsonclick( "" );
      cmbNof_ccmc4.setEnabled( 1 );
      cmbNof_ccmc4.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccmc3.setJsonclick( "" );
      cmbNof_ccmc3.setEnabled( 1 );
      cmbNof_ccmc3.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccmc2.setJsonclick( "" );
      cmbNof_ccmc2.setEnabled( 1 );
      cmbNof_ccmc2.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccmc1.setJsonclick( "" );
      cmbNof_ccmc1.setEnabled( 1 );
      cmbNof_ccmc1.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccec.setJsonclick( "" );
      cmbNof_ccec.setEnabled( 1 );
      cmbNof_ccec.setIBackground( (int)(0xFFFFFF) );
      cmbNof_cccc.setJsonclick( "" );
      cmbNof_cccc.setEnabled( 1 );
      cmbNof_cccc.setIBackground( (int)(0xFFFFFF) );
      cmbNof_cctq.setJsonclick( "" );
      cmbNof_cctq.setEnabled( 1 );
      cmbNof_cctq.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccpc.setJsonclick( "" );
      cmbNof_ccpc.setEnabled( 1 );
      cmbNof_ccpc.setIBackground( (int)(0xFFFFFF) );
      edtNof_cct_Jsonclick = "" ;
      edtNof_cct_Backcolor = (int)(0xFFFFFF) ;
      edtNof_cct_Enabled = 1 ;
      edtNof_ccp_Jsonclick = "" ;
      edtNof_ccp_Backcolor = (int)(0xFFFFFF) ;
      edtNof_ccp_Enabled = 1 ;
      cmbNof_cctet.setJsonclick( "" );
      cmbNof_cctet.setEnabled( 1 );
      cmbNof_cctet.setIBackground( (int)(0xFFFFFF) );
      cmbNof_ccttp.setJsonclick( "" );
      cmbNof_ccttp.setEnabled( 1 );
      cmbNof_ccttp.setIBackground( (int)(0xFFFFFF) );
      cmbNof_cctse.setJsonclick( "" );
      cmbNof_cctse.setEnabled( 1 );
      cmbNof_cctse.setIBackground( (int)(0xFFFFFF) );
      edtNof_c6_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c6_Enabled = 1 ;
      cmbNof_scc.setJsonclick( "" );
      cmbNof_scc.setEnabled( 1 );
      cmbNof_scc.setIBackground( (int)(0xFFFFFF) );
      cmbNof_scs.setJsonclick( "" );
      cmbNof_scs.setEnabled( 1 );
      cmbNof_scs.setIBackground( (int)(0xFFFFFF) );
      edtNof_c5_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c5_Enabled = 1 ;
      cmbNof_ct.setJsonclick( "" );
      cmbNof_ct.setEnabled( 1 );
      cmbNof_ct.setIBackground( (int)(0xFFFFFF) );
      edtNof_c4_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c4_Enabled = 1 ;
      cmbNof_tnc.setJsonclick( "" );
      cmbNof_tnc.setEnabled( 1 );
      cmbNof_tnc.setIBackground( (int)(0xFFFFFF) );
      cmbNof_tns.setJsonclick( "" );
      cmbNof_tns.setEnabled( 1 );
      cmbNof_tns.setIBackground( (int)(0xFFFFFF) );
      edtNof_c3_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c3_Enabled = 1 ;
      cmbNof_Bov.setJsonclick( "" );
      cmbNof_Bov.setEnabled( 1 );
      cmbNof_Bov.setIBackground( (int)(0xFFFFFF) );
      cmbNof_boe.setJsonclick( "" );
      cmbNof_boe.setEnabled( 1 );
      cmbNof_boe.setIBackground( (int)(0xFFFFFF) );
      cmbNof_bob.setJsonclick( "" );
      cmbNof_bob.setEnabled( 1 );
      cmbNof_bob.setIBackground( (int)(0xFFFFFF) );
      cmbNof_bo.setJsonclick( "" );
      cmbNof_bo.setEnabled( 1 );
      cmbNof_bo.setIBackground( (int)(0xFFFFFF) );
      edtNof_c2_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c2_Enabled = 1 ;
      edtNof_c1_Backcolor = (int)(0xFFFFFF) ;
      edtNof_c1_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      cmbNof_Ag.setJsonclick( "" );
      cmbNof_Ag.setEnabled( 1 );
      cmbNof_Ag.setIBackground( (int)(0xFFFFFF) );
      cmbNof_Pp.setJsonclick( "" );
      cmbNof_Pp.setEnabled( 1 );
      cmbNof_Pp.setIBackground( (int)(0xFFFFFF) );
      cmbNof_Mcot.setJsonclick( "" );
      cmbNof_Mcot.setEnabled( 1 );
      cmbNof_Mcot.setIBackground( (int)(0xFFFFFF) );
      cmbNof_Pd.setJsonclick( "" );
      cmbNof_Pd.setEnabled( 1 );
      cmbNof_Pd.setIBackground( (int)(0xFFFFFF) );
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtNof_p_Jsonclick = "" ;
      edtNof_p_Backcolor = (int)(0xFFFFFF) ;
      edtNof_p_Enabled = 0 ;
      edtNof_r_Jsonclick = "" ;
      edtNof_r_Backcolor = (int)(0xFFFFFF) ;
      edtNof_r_Enabled = 0 ;
      edtNof_Hdr_Jsonclick = "" ;
      edtNof_Hdr_Backcolor = (int)(0xFFFFFF) ;
      edtNof_Hdr_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      cmbNof_Pd.setName( "NOF_PD" );
      cmbNof_Pd.setWebtags( "" );
      cmbNof_Pd.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_Pd.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_Pd.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11106Nof_Pd)==0) )
         {
            A11106Nof_Pd = httpContext.getMessage( "N", "") ;
            n11106Nof_Pd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", A11106Nof_Pd);
         }
      }
      cmbNof_Mcot.setName( "NOF_MCOT" );
      cmbNof_Mcot.setWebtags( "" );
      cmbNof_Mcot.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_Mcot.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_Mcot.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11107Nof_Mcot)==0) )
         {
            A11107Nof_Mcot = httpContext.getMessage( "N", "") ;
            n11107Nof_Mcot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", A11107Nof_Mcot);
         }
      }
      cmbNof_Pp.setName( "NOF_PP" );
      cmbNof_Pp.setWebtags( "" );
      cmbNof_Pp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_Pp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_Pp.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11108Nof_Pp)==0) )
         {
            A11108Nof_Pp = httpContext.getMessage( "N", "") ;
            n11108Nof_Pp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", A11108Nof_Pp);
         }
      }
      cmbNof_Ag.setName( "NOF_AG" );
      cmbNof_Ag.setWebtags( "" );
      cmbNof_Ag.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_Ag.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_Ag.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11109Nof_Ag)==0) )
         {
            A11109Nof_Ag = httpContext.getMessage( "N", "") ;
            n11109Nof_Ag = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", A11109Nof_Ag);
         }
      }
      cmbNof_bo.setName( "NOF_BO" );
      cmbNof_bo.setWebtags( "" );
      cmbNof_bo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_bo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_bo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11112Nof_bo)==0) )
         {
            A11112Nof_bo = httpContext.getMessage( "N", "") ;
            n11112Nof_bo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", A11112Nof_bo);
         }
      }
      cmbNof_bob.setName( "NOF_BOB" );
      cmbNof_bob.setWebtags( "" );
      cmbNof_bob.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_bob.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_bob.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11113Nof_bob)==0) )
         {
            A11113Nof_bob = httpContext.getMessage( "N", "") ;
            n11113Nof_bob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", A11113Nof_bob);
         }
      }
      cmbNof_boe.setName( "NOF_BOE" );
      cmbNof_boe.setWebtags( "" );
      cmbNof_boe.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_boe.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_boe.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11114Nof_boe)==0) )
         {
            A11114Nof_boe = httpContext.getMessage( "N", "") ;
            n11114Nof_boe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", A11114Nof_boe);
         }
      }
      cmbNof_Bov.setName( "NOF_BOV" );
      cmbNof_Bov.setWebtags( "" );
      cmbNof_Bov.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_Bov.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_Bov.getItemCount() > 0 )
      {
         A11115Nof_Bov = cmbNof_Bov.getValidValue(A11115Nof_Bov) ;
         n11115Nof_Bov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11115Nof_Bov", A11115Nof_Bov);
      }
      cmbNof_tns.setName( "NOF_TNS" );
      cmbNof_tns.setWebtags( "" );
      cmbNof_tns.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_tns.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_tns.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11117Nof_tns)==0) )
         {
            A11117Nof_tns = httpContext.getMessage( "N", "") ;
            n11117Nof_tns = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", A11117Nof_tns);
         }
      }
      cmbNof_tnc.setName( "NOF_TNC" );
      cmbNof_tnc.setWebtags( "" );
      cmbNof_tnc.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_tnc.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_tnc.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11118Nof_tnc)==0) )
         {
            A11118Nof_tnc = httpContext.getMessage( "N", "") ;
            n11118Nof_tnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", A11118Nof_tnc);
         }
      }
      cmbNof_ct.setName( "NOF_CT" );
      cmbNof_ct.setWebtags( "" );
      cmbNof_ct.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ct.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ct.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11120Nof_ct)==0) )
         {
            A11120Nof_ct = httpContext.getMessage( "N", "") ;
            n11120Nof_ct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", A11120Nof_ct);
         }
      }
      cmbNof_scs.setName( "NOF_SCS" );
      cmbNof_scs.setWebtags( "" );
      cmbNof_scs.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_scs.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_scs.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11122Nof_scs)==0) )
         {
            A11122Nof_scs = httpContext.getMessage( "N", "") ;
            n11122Nof_scs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", A11122Nof_scs);
         }
      }
      cmbNof_scc.setName( "NOF_SCC" );
      cmbNof_scc.setWebtags( "" );
      cmbNof_scc.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_scc.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_scc.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11123Nof_scc)==0) )
         {
            A11123Nof_scc = httpContext.getMessage( "N", "") ;
            n11123Nof_scc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", A11123Nof_scc);
         }
      }
      cmbNof_cctse.setName( "NOF_CCTSE" );
      cmbNof_cctse.setWebtags( "" );
      cmbNof_cctse.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_cctse.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_cctse.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11125Nof_cctse)==0) )
         {
            A11125Nof_cctse = httpContext.getMessage( "N", "") ;
            n11125Nof_cctse = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", A11125Nof_cctse);
         }
      }
      cmbNof_ccttp.setName( "NOF_CCTTP" );
      cmbNof_ccttp.setWebtags( "" );
      cmbNof_ccttp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccttp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccttp.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11126Nof_ccttp)==0) )
         {
            A11126Nof_ccttp = httpContext.getMessage( "N", "") ;
            n11126Nof_ccttp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", A11126Nof_ccttp);
         }
      }
      cmbNof_cctet.setName( "NOF_CCTET" );
      cmbNof_cctet.setWebtags( "" );
      cmbNof_cctet.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_cctet.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_cctet.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11127Nof_cctet)==0) )
         {
            A11127Nof_cctet = httpContext.getMessage( "N", "") ;
            n11127Nof_cctet = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", A11127Nof_cctet);
         }
      }
      cmbNof_ccpc.setName( "NOF_CCPC" );
      cmbNof_ccpc.setWebtags( "" );
      cmbNof_ccpc.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccpc.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccpc.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11130Nof_ccpc)==0) )
         {
            A11130Nof_ccpc = httpContext.getMessage( "N", "") ;
            n11130Nof_ccpc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", A11130Nof_ccpc);
         }
      }
      cmbNof_cctq.setName( "NOF_CCTQ" );
      cmbNof_cctq.setWebtags( "" );
      cmbNof_cctq.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_cctq.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_cctq.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11131Nof_cctq)==0) )
         {
            A11131Nof_cctq = httpContext.getMessage( "N", "") ;
            n11131Nof_cctq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", A11131Nof_cctq);
         }
      }
      cmbNof_cccc.setName( "NOF_CCCC" );
      cmbNof_cccc.setWebtags( "" );
      cmbNof_cccc.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_cccc.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_cccc.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11132Nof_cccc)==0) )
         {
            A11132Nof_cccc = httpContext.getMessage( "N", "") ;
            n11132Nof_cccc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", A11132Nof_cccc);
         }
      }
      cmbNof_ccec.setName( "NOF_CCEC" );
      cmbNof_ccec.setWebtags( "" );
      cmbNof_ccec.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccec.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccec.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11133Nof_ccec)==0) )
         {
            A11133Nof_ccec = httpContext.getMessage( "N", "") ;
            n11133Nof_ccec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", A11133Nof_ccec);
         }
      }
      cmbNof_ccmc1.setName( "NOF_CCMC1" );
      cmbNof_ccmc1.setWebtags( "" );
      cmbNof_ccmc1.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccmc1.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccmc1.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11134Nof_ccmc1)==0) )
         {
            A11134Nof_ccmc1 = httpContext.getMessage( "N", "") ;
            n11134Nof_ccmc1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", A11134Nof_ccmc1);
         }
      }
      cmbNof_ccmc2.setName( "NOF_CCMC2" );
      cmbNof_ccmc2.setWebtags( "" );
      cmbNof_ccmc2.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccmc2.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccmc2.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11135Nof_ccmc2)==0) )
         {
            A11135Nof_ccmc2 = httpContext.getMessage( "N", "") ;
            n11135Nof_ccmc2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", A11135Nof_ccmc2);
         }
      }
      cmbNof_ccmc3.setName( "NOF_CCMC3" );
      cmbNof_ccmc3.setWebtags( "" );
      cmbNof_ccmc3.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccmc3.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccmc3.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11136Nof_ccmc3)==0) )
         {
            A11136Nof_ccmc3 = httpContext.getMessage( "N", "") ;
            n11136Nof_ccmc3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", A11136Nof_ccmc3);
         }
      }
      cmbNof_ccmc4.setName( "NOF_CCMC4" );
      cmbNof_ccmc4.setWebtags( "" );
      cmbNof_ccmc4.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccmc4.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccmc4.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11137Nof_ccmc4)==0) )
         {
            A11137Nof_ccmc4 = httpContext.getMessage( "N", "") ;
            n11137Nof_ccmc4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", A11137Nof_ccmc4);
         }
      }
      cmbNof_ccmc5.setName( "NOF_CCMC5" );
      cmbNof_ccmc5.setWebtags( "" );
      cmbNof_ccmc5.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccmc5.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccmc5.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11138Nof_ccmc5)==0) )
         {
            A11138Nof_ccmc5 = httpContext.getMessage( "N", "") ;
            n11138Nof_ccmc5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", A11138Nof_ccmc5);
         }
      }
      cmbNof_ccmc6.setName( "NOF_CCMC6" );
      cmbNof_ccmc6.setWebtags( "" );
      cmbNof_ccmc6.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ccmc6.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ccmc6.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11139Nof_ccmc6)==0) )
         {
            A11139Nof_ccmc6 = httpContext.getMessage( "N", "") ;
            n11139Nof_ccmc6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", A11139Nof_ccmc6);
         }
      }
      cmbNof_rb.setName( "NOF_RB" );
      cmbNof_rb.setWebtags( "" );
      cmbNof_rb.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_rb.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_rb.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11141Nof_rb)==0) )
         {
            A11141Nof_rb = httpContext.getMessage( "N", "") ;
            n11141Nof_rb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", A11141Nof_rb);
         }
      }
      cmbNof_rbi.setName( "NOF_RBI" );
      cmbNof_rbi.setWebtags( "" );
      cmbNof_rbi.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_rbi.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_rbi.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11142Nof_rbi)==0) )
         {
            A11142Nof_rbi = httpContext.getMessage( "N", "") ;
            n11142Nof_rbi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", A11142Nof_rbi);
         }
      }
      cmbNof_rbe.setName( "NOF_RBE" );
      cmbNof_rbe.setWebtags( "" );
      cmbNof_rbe.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_rbe.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_rbe.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11143Nof_rbe)==0) )
         {
            A11143Nof_rbe = httpContext.getMessage( "N", "") ;
            n11143Nof_rbe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", A11143Nof_rbe);
         }
      }
      cmbNof_rbp.setName( "NOF_RBP" );
      cmbNof_rbp.setWebtags( "" );
      cmbNof_rbp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_rbp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_rbp.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11144Nof_rbp)==0) )
         {
            A11144Nof_rbp = httpContext.getMessage( "N", "") ;
            n11144Nof_rbp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", A11144Nof_rbp);
         }
      }
      cmbNof_rb1.setName( "NOF_RB1" );
      cmbNof_rb1.setWebtags( "" );
      cmbNof_rb1.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_rb1.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_rb1.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11146Nof_rb1)==0) )
         {
            A11146Nof_rb1 = httpContext.getMessage( "N", "") ;
            n11146Nof_rb1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", A11146Nof_rb1);
         }
      }
      cmbNof_rb3.setName( "NOF_RB3" );
      cmbNof_rb3.setWebtags( "" );
      cmbNof_rb3.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_rb3.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_rb3.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11147Nof_rb3)==0) )
         {
            A11147Nof_rb3 = httpContext.getMessage( "N", "") ;
            n11147Nof_rb3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", A11147Nof_rb3);
         }
      }
      cmbNof_ep1.setName( "NOF_EP1" );
      cmbNof_ep1.setWebtags( "" );
      cmbNof_ep1.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep1.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep1.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11149Nof_ep1)==0) )
         {
            A11149Nof_ep1 = httpContext.getMessage( "N", "") ;
            n11149Nof_ep1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", A11149Nof_ep1);
         }
      }
      cmbNof_ep2.setName( "NOF_EP2" );
      cmbNof_ep2.setWebtags( "" );
      cmbNof_ep2.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep2.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep2.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11150Nof_ep2)==0) )
         {
            A11150Nof_ep2 = httpContext.getMessage( "N", "") ;
            n11150Nof_ep2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", A11150Nof_ep2);
         }
      }
      cmbNof_ep3.setName( "NOF_EP3" );
      cmbNof_ep3.setWebtags( "" );
      cmbNof_ep3.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep3.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep3.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11151Nof_ep3)==0) )
         {
            A11151Nof_ep3 = httpContext.getMessage( "N", "") ;
            n11151Nof_ep3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", A11151Nof_ep3);
         }
      }
      cmbNof_ep4.setName( "NOF_EP4" );
      cmbNof_ep4.setWebtags( "" );
      cmbNof_ep4.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep4.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep4.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11152Nof_ep4)==0) )
         {
            A11152Nof_ep4 = httpContext.getMessage( "N", "") ;
            n11152Nof_ep4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", A11152Nof_ep4);
         }
      }
      cmbNof_ep5.setName( "NOF_EP5" );
      cmbNof_ep5.setWebtags( "" );
      cmbNof_ep5.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep5.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep5.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11153Nof_ep5)==0) )
         {
            A11153Nof_ep5 = httpContext.getMessage( "N", "") ;
            n11153Nof_ep5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", A11153Nof_ep5);
         }
      }
      cmbNof_ep6.setName( "NOF_EP6" );
      cmbNof_ep6.setWebtags( "" );
      cmbNof_ep6.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep6.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep6.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11154Nof_ep6)==0) )
         {
            A11154Nof_ep6 = httpContext.getMessage( "N", "") ;
            n11154Nof_ep6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", A11154Nof_ep6);
         }
      }
      cmbNof_ep7.setName( "NOF_EP7" );
      cmbNof_ep7.setWebtags( "" );
      cmbNof_ep7.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep7.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep7.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11155Nof_ep7)==0) )
         {
            A11155Nof_ep7 = httpContext.getMessage( "N", "") ;
            n11155Nof_ep7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", A11155Nof_ep7);
         }
      }
      cmbNof_ep8.setName( "NOF_EP8" );
      cmbNof_ep8.setWebtags( "" );
      cmbNof_ep8.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep8.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep8.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11156Nof_ep8)==0) )
         {
            A11156Nof_ep8 = httpContext.getMessage( "N", "") ;
            n11156Nof_ep8 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", A11156Nof_ep8);
         }
      }
      cmbNof_ep9.setName( "NOF_EP9" );
      cmbNof_ep9.setWebtags( "" );
      cmbNof_ep9.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep9.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep9.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11157Nof_ep9)==0) )
         {
            A11157Nof_ep9 = httpContext.getMessage( "N", "") ;
            n11157Nof_ep9 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", A11157Nof_ep9);
         }
      }
      cmbNof_ep10.setName( "NOF_EP10" );
      cmbNof_ep10.setWebtags( "" );
      cmbNof_ep10.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_ep10.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_ep10.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11158Nof_ep10)==0) )
         {
            A11158Nof_ep10 = httpContext.getMessage( "N", "") ;
            n11158Nof_ep10 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", A11158Nof_ep10);
         }
      }
      cmbNof_sa1.setName( "NOF_SA1" );
      cmbNof_sa1.setWebtags( "" );
      cmbNof_sa1.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_sa1.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_sa1.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11160Nof_sa1)==0) )
         {
            A11160Nof_sa1 = httpContext.getMessage( "N", "") ;
            n11160Nof_sa1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", A11160Nof_sa1);
         }
      }
      cmbNof_sa2.setName( "NOF_SA2" );
      cmbNof_sa2.setWebtags( "" );
      cmbNof_sa2.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_sa2.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_sa2.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11161Nof_sa2)==0) )
         {
            A11161Nof_sa2 = httpContext.getMessage( "N", "") ;
            n11161Nof_sa2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", A11161Nof_sa2);
         }
      }
      cmbNof_sa3.setName( "NOF_SA3" );
      cmbNof_sa3.setWebtags( "" );
      cmbNof_sa3.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_sa3.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_sa3.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11162Nof_sa3)==0) )
         {
            A11162Nof_sa3 = httpContext.getMessage( "N", "") ;
            n11162Nof_sa3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", A11162Nof_sa3);
         }
      }
      cmbNof_sa4.setName( "NOF_SA4" );
      cmbNof_sa4.setWebtags( "" );
      cmbNof_sa4.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_sa4.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_sa4.getItemCount() > 0 )
      {
         A11163Nof_sa4 = cmbNof_sa4.getValidValue(A11163Nof_sa4) ;
         n11163Nof_sa4 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11163Nof_sa4", A11163Nof_sa4);
      }
      cmbNof_sa5.setName( "NOF_SA5" );
      cmbNof_sa5.setWebtags( "" );
      cmbNof_sa5.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_sa5.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_sa5.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11164Nof_sa5)==0) )
         {
            A11164Nof_sa5 = httpContext.getMessage( "N", "") ;
            n11164Nof_sa5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", A11164Nof_sa5);
         }
      }
      cmbNof_sa6.setName( "NOF_SA6" );
      cmbNof_sa6.setWebtags( "" );
      cmbNof_sa6.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_sa6.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_sa6.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11165Nof_sa6)==0) )
         {
            A11165Nof_sa6 = httpContext.getMessage( "N", "") ;
            n11165Nof_sa6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", A11165Nof_sa6);
         }
      }
      cmbNof_stk.setName( "NOF_STK" );
      cmbNof_stk.setWebtags( "" );
      cmbNof_stk.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbNof_stk.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbNof_stk.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11167Nof_stk)==0) )
         {
            A11167Nof_stk = httpContext.getMessage( "N", "") ;
            n11167Nof_stk = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", A11167Nof_stk);
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01AP15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AP15_A407EmprNom[0] ;
      n407EmprNom = T01AP15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      GX_FocusControl = cmbNof_Pd.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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

   public void valid_Nof_p( )
   {
      n11163Nof_sa4 = false ;
      A11163Nof_sa4 = cmbNof_sa4.getValue() ;
      n11163Nof_sa4 = false ;
      cmbNof_sa4.setValue( A11163Nof_sa4 );
      n11115Nof_Bov = false ;
      A11115Nof_Bov = cmbNof_Bov.getValue() ;
      n11115Nof_Bov = false ;
      cmbNof_Bov.setValue( A11115Nof_Bov );
      n11107Nof_Mcot = false ;
      A11107Nof_Mcot = cmbNof_Mcot.getValue() ;
      n11107Nof_Mcot = false ;
      cmbNof_Mcot.setValue( A11107Nof_Mcot );
      n11106Nof_Pd = false ;
      A11106Nof_Pd = cmbNof_Pd.getValue() ;
      n11106Nof_Pd = false ;
      cmbNof_Pd.setValue( A11106Nof_Pd );
      n11108Nof_Pp = false ;
      A11108Nof_Pp = cmbNof_Pp.getValue() ;
      n11108Nof_Pp = false ;
      cmbNof_Pp.setValue( A11108Nof_Pp );
      n11109Nof_Ag = false ;
      A11109Nof_Ag = cmbNof_Ag.getValue() ;
      n11109Nof_Ag = false ;
      cmbNof_Ag.setValue( A11109Nof_Ag );
      n11112Nof_bo = false ;
      A11112Nof_bo = cmbNof_bo.getValue() ;
      n11112Nof_bo = false ;
      cmbNof_bo.setValue( A11112Nof_bo );
      n11113Nof_bob = false ;
      A11113Nof_bob = cmbNof_bob.getValue() ;
      n11113Nof_bob = false ;
      cmbNof_bob.setValue( A11113Nof_bob );
      n11114Nof_boe = false ;
      A11114Nof_boe = cmbNof_boe.getValue() ;
      n11114Nof_boe = false ;
      cmbNof_boe.setValue( A11114Nof_boe );
      n11117Nof_tns = false ;
      A11117Nof_tns = cmbNof_tns.getValue() ;
      n11117Nof_tns = false ;
      cmbNof_tns.setValue( A11117Nof_tns );
      n11118Nof_tnc = false ;
      A11118Nof_tnc = cmbNof_tnc.getValue() ;
      n11118Nof_tnc = false ;
      cmbNof_tnc.setValue( A11118Nof_tnc );
      n11120Nof_ct = false ;
      A11120Nof_ct = cmbNof_ct.getValue() ;
      n11120Nof_ct = false ;
      cmbNof_ct.setValue( A11120Nof_ct );
      n11122Nof_scs = false ;
      A11122Nof_scs = cmbNof_scs.getValue() ;
      n11122Nof_scs = false ;
      cmbNof_scs.setValue( A11122Nof_scs );
      n11123Nof_scc = false ;
      A11123Nof_scc = cmbNof_scc.getValue() ;
      n11123Nof_scc = false ;
      cmbNof_scc.setValue( A11123Nof_scc );
      n11125Nof_cctse = false ;
      A11125Nof_cctse = cmbNof_cctse.getValue() ;
      n11125Nof_cctse = false ;
      cmbNof_cctse.setValue( A11125Nof_cctse );
      n11126Nof_ccttp = false ;
      A11126Nof_ccttp = cmbNof_ccttp.getValue() ;
      n11126Nof_ccttp = false ;
      cmbNof_ccttp.setValue( A11126Nof_ccttp );
      n11127Nof_cctet = false ;
      A11127Nof_cctet = cmbNof_cctet.getValue() ;
      n11127Nof_cctet = false ;
      cmbNof_cctet.setValue( A11127Nof_cctet );
      n11130Nof_ccpc = false ;
      A11130Nof_ccpc = cmbNof_ccpc.getValue() ;
      n11130Nof_ccpc = false ;
      cmbNof_ccpc.setValue( A11130Nof_ccpc );
      n11131Nof_cctq = false ;
      A11131Nof_cctq = cmbNof_cctq.getValue() ;
      n11131Nof_cctq = false ;
      cmbNof_cctq.setValue( A11131Nof_cctq );
      n11132Nof_cccc = false ;
      A11132Nof_cccc = cmbNof_cccc.getValue() ;
      n11132Nof_cccc = false ;
      cmbNof_cccc.setValue( A11132Nof_cccc );
      n11133Nof_ccec = false ;
      A11133Nof_ccec = cmbNof_ccec.getValue() ;
      n11133Nof_ccec = false ;
      cmbNof_ccec.setValue( A11133Nof_ccec );
      n11134Nof_ccmc1 = false ;
      A11134Nof_ccmc1 = cmbNof_ccmc1.getValue() ;
      n11134Nof_ccmc1 = false ;
      cmbNof_ccmc1.setValue( A11134Nof_ccmc1 );
      n11135Nof_ccmc2 = false ;
      A11135Nof_ccmc2 = cmbNof_ccmc2.getValue() ;
      n11135Nof_ccmc2 = false ;
      cmbNof_ccmc2.setValue( A11135Nof_ccmc2 );
      n11136Nof_ccmc3 = false ;
      A11136Nof_ccmc3 = cmbNof_ccmc3.getValue() ;
      n11136Nof_ccmc3 = false ;
      cmbNof_ccmc3.setValue( A11136Nof_ccmc3 );
      n11137Nof_ccmc4 = false ;
      A11137Nof_ccmc4 = cmbNof_ccmc4.getValue() ;
      n11137Nof_ccmc4 = false ;
      cmbNof_ccmc4.setValue( A11137Nof_ccmc4 );
      n11138Nof_ccmc5 = false ;
      A11138Nof_ccmc5 = cmbNof_ccmc5.getValue() ;
      n11138Nof_ccmc5 = false ;
      cmbNof_ccmc5.setValue( A11138Nof_ccmc5 );
      n11139Nof_ccmc6 = false ;
      A11139Nof_ccmc6 = cmbNof_ccmc6.getValue() ;
      n11139Nof_ccmc6 = false ;
      cmbNof_ccmc6.setValue( A11139Nof_ccmc6 );
      n11141Nof_rb = false ;
      A11141Nof_rb = cmbNof_rb.getValue() ;
      n11141Nof_rb = false ;
      cmbNof_rb.setValue( A11141Nof_rb );
      n11143Nof_rbe = false ;
      A11143Nof_rbe = cmbNof_rbe.getValue() ;
      n11143Nof_rbe = false ;
      cmbNof_rbe.setValue( A11143Nof_rbe );
      n11142Nof_rbi = false ;
      A11142Nof_rbi = cmbNof_rbi.getValue() ;
      n11142Nof_rbi = false ;
      cmbNof_rbi.setValue( A11142Nof_rbi );
      n11144Nof_rbp = false ;
      A11144Nof_rbp = cmbNof_rbp.getValue() ;
      n11144Nof_rbp = false ;
      cmbNof_rbp.setValue( A11144Nof_rbp );
      n11146Nof_rb1 = false ;
      A11146Nof_rb1 = cmbNof_rb1.getValue() ;
      n11146Nof_rb1 = false ;
      cmbNof_rb1.setValue( A11146Nof_rb1 );
      n11147Nof_rb3 = false ;
      A11147Nof_rb3 = cmbNof_rb3.getValue() ;
      n11147Nof_rb3 = false ;
      cmbNof_rb3.setValue( A11147Nof_rb3 );
      n11149Nof_ep1 = false ;
      A11149Nof_ep1 = cmbNof_ep1.getValue() ;
      n11149Nof_ep1 = false ;
      cmbNof_ep1.setValue( A11149Nof_ep1 );
      n11150Nof_ep2 = false ;
      A11150Nof_ep2 = cmbNof_ep2.getValue() ;
      n11150Nof_ep2 = false ;
      cmbNof_ep2.setValue( A11150Nof_ep2 );
      n11151Nof_ep3 = false ;
      A11151Nof_ep3 = cmbNof_ep3.getValue() ;
      n11151Nof_ep3 = false ;
      cmbNof_ep3.setValue( A11151Nof_ep3 );
      n11152Nof_ep4 = false ;
      A11152Nof_ep4 = cmbNof_ep4.getValue() ;
      n11152Nof_ep4 = false ;
      cmbNof_ep4.setValue( A11152Nof_ep4 );
      n11153Nof_ep5 = false ;
      A11153Nof_ep5 = cmbNof_ep5.getValue() ;
      n11153Nof_ep5 = false ;
      cmbNof_ep5.setValue( A11153Nof_ep5 );
      n11154Nof_ep6 = false ;
      A11154Nof_ep6 = cmbNof_ep6.getValue() ;
      n11154Nof_ep6 = false ;
      cmbNof_ep6.setValue( A11154Nof_ep6 );
      n11155Nof_ep7 = false ;
      A11155Nof_ep7 = cmbNof_ep7.getValue() ;
      n11155Nof_ep7 = false ;
      cmbNof_ep7.setValue( A11155Nof_ep7 );
      n11156Nof_ep8 = false ;
      A11156Nof_ep8 = cmbNof_ep8.getValue() ;
      n11156Nof_ep8 = false ;
      cmbNof_ep8.setValue( A11156Nof_ep8 );
      n11157Nof_ep9 = false ;
      A11157Nof_ep9 = cmbNof_ep9.getValue() ;
      n11157Nof_ep9 = false ;
      cmbNof_ep9.setValue( A11157Nof_ep9 );
      n11158Nof_ep10 = false ;
      A11158Nof_ep10 = cmbNof_ep10.getValue() ;
      n11158Nof_ep10 = false ;
      cmbNof_ep10.setValue( A11158Nof_ep10 );
      n11160Nof_sa1 = false ;
      A11160Nof_sa1 = cmbNof_sa1.getValue() ;
      n11160Nof_sa1 = false ;
      cmbNof_sa1.setValue( A11160Nof_sa1 );
      n11161Nof_sa2 = false ;
      A11161Nof_sa2 = cmbNof_sa2.getValue() ;
      n11161Nof_sa2 = false ;
      cmbNof_sa2.setValue( A11161Nof_sa2 );
      n11162Nof_sa3 = false ;
      A11162Nof_sa3 = cmbNof_sa3.getValue() ;
      n11162Nof_sa3 = false ;
      cmbNof_sa3.setValue( A11162Nof_sa3 );
      n11164Nof_sa5 = false ;
      A11164Nof_sa5 = cmbNof_sa5.getValue() ;
      n11164Nof_sa5 = false ;
      cmbNof_sa5.setValue( A11164Nof_sa5 );
      n11165Nof_sa6 = false ;
      A11165Nof_sa6 = cmbNof_sa6.getValue() ;
      n11165Nof_sa6 = false ;
      cmbNof_sa6.setValue( A11165Nof_sa6 );
      n11167Nof_stk = false ;
      A11167Nof_stk = cmbNof_stk.getValue() ;
      n11167Nof_stk = false ;
      cmbNof_stk.setValue( A11167Nof_stk );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbNof_Pd.getItemCount() > 0 )
      {
         A11106Nof_Pd = cmbNof_Pd.getValidValue(A11106Nof_Pd) ;
         n11106Nof_Pd = false ;
         cmbNof_Pd.setValue( A11106Nof_Pd );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Pd.setValue( GXutil.rtrim( A11106Nof_Pd) );
      }
      if ( cmbNof_Mcot.getItemCount() > 0 )
      {
         A11107Nof_Mcot = cmbNof_Mcot.getValidValue(A11107Nof_Mcot) ;
         n11107Nof_Mcot = false ;
         cmbNof_Mcot.setValue( A11107Nof_Mcot );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Mcot.setValue( GXutil.rtrim( A11107Nof_Mcot) );
      }
      if ( cmbNof_Pp.getItemCount() > 0 )
      {
         A11108Nof_Pp = cmbNof_Pp.getValidValue(A11108Nof_Pp) ;
         n11108Nof_Pp = false ;
         cmbNof_Pp.setValue( A11108Nof_Pp );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Pp.setValue( GXutil.rtrim( A11108Nof_Pp) );
      }
      if ( cmbNof_Ag.getItemCount() > 0 )
      {
         A11109Nof_Ag = cmbNof_Ag.getValidValue(A11109Nof_Ag) ;
         n11109Nof_Ag = false ;
         cmbNof_Ag.setValue( A11109Nof_Ag );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Ag.setValue( GXutil.rtrim( A11109Nof_Ag) );
      }
      if ( cmbNof_bo.getItemCount() > 0 )
      {
         A11112Nof_bo = cmbNof_bo.getValidValue(A11112Nof_bo) ;
         n11112Nof_bo = false ;
         cmbNof_bo.setValue( A11112Nof_bo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_bo.setValue( GXutil.rtrim( A11112Nof_bo) );
      }
      if ( cmbNof_bob.getItemCount() > 0 )
      {
         A11113Nof_bob = cmbNof_bob.getValidValue(A11113Nof_bob) ;
         n11113Nof_bob = false ;
         cmbNof_bob.setValue( A11113Nof_bob );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_bob.setValue( GXutil.rtrim( A11113Nof_bob) );
      }
      if ( cmbNof_boe.getItemCount() > 0 )
      {
         A11114Nof_boe = cmbNof_boe.getValidValue(A11114Nof_boe) ;
         n11114Nof_boe = false ;
         cmbNof_boe.setValue( A11114Nof_boe );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_boe.setValue( GXutil.rtrim( A11114Nof_boe) );
      }
      if ( cmbNof_Bov.getItemCount() > 0 )
      {
         A11115Nof_Bov = cmbNof_Bov.getValidValue(A11115Nof_Bov) ;
         n11115Nof_Bov = false ;
         cmbNof_Bov.setValue( A11115Nof_Bov );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_Bov.setValue( GXutil.rtrim( A11115Nof_Bov) );
      }
      if ( cmbNof_tns.getItemCount() > 0 )
      {
         A11117Nof_tns = cmbNof_tns.getValidValue(A11117Nof_tns) ;
         n11117Nof_tns = false ;
         cmbNof_tns.setValue( A11117Nof_tns );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_tns.setValue( GXutil.rtrim( A11117Nof_tns) );
      }
      if ( cmbNof_tnc.getItemCount() > 0 )
      {
         A11118Nof_tnc = cmbNof_tnc.getValidValue(A11118Nof_tnc) ;
         n11118Nof_tnc = false ;
         cmbNof_tnc.setValue( A11118Nof_tnc );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_tnc.setValue( GXutil.rtrim( A11118Nof_tnc) );
      }
      if ( cmbNof_ct.getItemCount() > 0 )
      {
         A11120Nof_ct = cmbNof_ct.getValidValue(A11120Nof_ct) ;
         n11120Nof_ct = false ;
         cmbNof_ct.setValue( A11120Nof_ct );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ct.setValue( GXutil.rtrim( A11120Nof_ct) );
      }
      if ( cmbNof_scs.getItemCount() > 0 )
      {
         A11122Nof_scs = cmbNof_scs.getValidValue(A11122Nof_scs) ;
         n11122Nof_scs = false ;
         cmbNof_scs.setValue( A11122Nof_scs );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_scs.setValue( GXutil.rtrim( A11122Nof_scs) );
      }
      if ( cmbNof_scc.getItemCount() > 0 )
      {
         A11123Nof_scc = cmbNof_scc.getValidValue(A11123Nof_scc) ;
         n11123Nof_scc = false ;
         cmbNof_scc.setValue( A11123Nof_scc );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_scc.setValue( GXutil.rtrim( A11123Nof_scc) );
      }
      if ( cmbNof_cctse.getItemCount() > 0 )
      {
         A11125Nof_cctse = cmbNof_cctse.getValidValue(A11125Nof_cctse) ;
         n11125Nof_cctse = false ;
         cmbNof_cctse.setValue( A11125Nof_cctse );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cctse.setValue( GXutil.rtrim( A11125Nof_cctse) );
      }
      if ( cmbNof_ccttp.getItemCount() > 0 )
      {
         A11126Nof_ccttp = cmbNof_ccttp.getValidValue(A11126Nof_ccttp) ;
         n11126Nof_ccttp = false ;
         cmbNof_ccttp.setValue( A11126Nof_ccttp );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccttp.setValue( GXutil.rtrim( A11126Nof_ccttp) );
      }
      if ( cmbNof_cctet.getItemCount() > 0 )
      {
         A11127Nof_cctet = cmbNof_cctet.getValidValue(A11127Nof_cctet) ;
         n11127Nof_cctet = false ;
         cmbNof_cctet.setValue( A11127Nof_cctet );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cctet.setValue( GXutil.rtrim( A11127Nof_cctet) );
      }
      if ( cmbNof_ccpc.getItemCount() > 0 )
      {
         A11130Nof_ccpc = cmbNof_ccpc.getValidValue(A11130Nof_ccpc) ;
         n11130Nof_ccpc = false ;
         cmbNof_ccpc.setValue( A11130Nof_ccpc );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccpc.setValue( GXutil.rtrim( A11130Nof_ccpc) );
      }
      if ( cmbNof_cctq.getItemCount() > 0 )
      {
         A11131Nof_cctq = cmbNof_cctq.getValidValue(A11131Nof_cctq) ;
         n11131Nof_cctq = false ;
         cmbNof_cctq.setValue( A11131Nof_cctq );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cctq.setValue( GXutil.rtrim( A11131Nof_cctq) );
      }
      if ( cmbNof_cccc.getItemCount() > 0 )
      {
         A11132Nof_cccc = cmbNof_cccc.getValidValue(A11132Nof_cccc) ;
         n11132Nof_cccc = false ;
         cmbNof_cccc.setValue( A11132Nof_cccc );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_cccc.setValue( GXutil.rtrim( A11132Nof_cccc) );
      }
      if ( cmbNof_ccec.getItemCount() > 0 )
      {
         A11133Nof_ccec = cmbNof_ccec.getValidValue(A11133Nof_ccec) ;
         n11133Nof_ccec = false ;
         cmbNof_ccec.setValue( A11133Nof_ccec );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccec.setValue( GXutil.rtrim( A11133Nof_ccec) );
      }
      if ( cmbNof_ccmc1.getItemCount() > 0 )
      {
         A11134Nof_ccmc1 = cmbNof_ccmc1.getValidValue(A11134Nof_ccmc1) ;
         n11134Nof_ccmc1 = false ;
         cmbNof_ccmc1.setValue( A11134Nof_ccmc1 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc1.setValue( GXutil.rtrim( A11134Nof_ccmc1) );
      }
      if ( cmbNof_ccmc2.getItemCount() > 0 )
      {
         A11135Nof_ccmc2 = cmbNof_ccmc2.getValidValue(A11135Nof_ccmc2) ;
         n11135Nof_ccmc2 = false ;
         cmbNof_ccmc2.setValue( A11135Nof_ccmc2 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc2.setValue( GXutil.rtrim( A11135Nof_ccmc2) );
      }
      if ( cmbNof_ccmc3.getItemCount() > 0 )
      {
         A11136Nof_ccmc3 = cmbNof_ccmc3.getValidValue(A11136Nof_ccmc3) ;
         n11136Nof_ccmc3 = false ;
         cmbNof_ccmc3.setValue( A11136Nof_ccmc3 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc3.setValue( GXutil.rtrim( A11136Nof_ccmc3) );
      }
      if ( cmbNof_ccmc4.getItemCount() > 0 )
      {
         A11137Nof_ccmc4 = cmbNof_ccmc4.getValidValue(A11137Nof_ccmc4) ;
         n11137Nof_ccmc4 = false ;
         cmbNof_ccmc4.setValue( A11137Nof_ccmc4 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc4.setValue( GXutil.rtrim( A11137Nof_ccmc4) );
      }
      if ( cmbNof_ccmc5.getItemCount() > 0 )
      {
         A11138Nof_ccmc5 = cmbNof_ccmc5.getValidValue(A11138Nof_ccmc5) ;
         n11138Nof_ccmc5 = false ;
         cmbNof_ccmc5.setValue( A11138Nof_ccmc5 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc5.setValue( GXutil.rtrim( A11138Nof_ccmc5) );
      }
      if ( cmbNof_ccmc6.getItemCount() > 0 )
      {
         A11139Nof_ccmc6 = cmbNof_ccmc6.getValidValue(A11139Nof_ccmc6) ;
         n11139Nof_ccmc6 = false ;
         cmbNof_ccmc6.setValue( A11139Nof_ccmc6 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ccmc6.setValue( GXutil.rtrim( A11139Nof_ccmc6) );
      }
      if ( cmbNof_rb.getItemCount() > 0 )
      {
         A11141Nof_rb = cmbNof_rb.getValidValue(A11141Nof_rb) ;
         n11141Nof_rb = false ;
         cmbNof_rb.setValue( A11141Nof_rb );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rb.setValue( GXutil.rtrim( A11141Nof_rb) );
      }
      if ( cmbNof_rbi.getItemCount() > 0 )
      {
         A11142Nof_rbi = cmbNof_rbi.getValidValue(A11142Nof_rbi) ;
         n11142Nof_rbi = false ;
         cmbNof_rbi.setValue( A11142Nof_rbi );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rbi.setValue( GXutil.rtrim( A11142Nof_rbi) );
      }
      if ( cmbNof_rbe.getItemCount() > 0 )
      {
         A11143Nof_rbe = cmbNof_rbe.getValidValue(A11143Nof_rbe) ;
         n11143Nof_rbe = false ;
         cmbNof_rbe.setValue( A11143Nof_rbe );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rbe.setValue( GXutil.rtrim( A11143Nof_rbe) );
      }
      if ( cmbNof_rbp.getItemCount() > 0 )
      {
         A11144Nof_rbp = cmbNof_rbp.getValidValue(A11144Nof_rbp) ;
         n11144Nof_rbp = false ;
         cmbNof_rbp.setValue( A11144Nof_rbp );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rbp.setValue( GXutil.rtrim( A11144Nof_rbp) );
      }
      if ( cmbNof_rb1.getItemCount() > 0 )
      {
         A11146Nof_rb1 = cmbNof_rb1.getValidValue(A11146Nof_rb1) ;
         n11146Nof_rb1 = false ;
         cmbNof_rb1.setValue( A11146Nof_rb1 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rb1.setValue( GXutil.rtrim( A11146Nof_rb1) );
      }
      if ( cmbNof_rb3.getItemCount() > 0 )
      {
         A11147Nof_rb3 = cmbNof_rb3.getValidValue(A11147Nof_rb3) ;
         n11147Nof_rb3 = false ;
         cmbNof_rb3.setValue( A11147Nof_rb3 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_rb3.setValue( GXutil.rtrim( A11147Nof_rb3) );
      }
      if ( cmbNof_ep1.getItemCount() > 0 )
      {
         A11149Nof_ep1 = cmbNof_ep1.getValidValue(A11149Nof_ep1) ;
         n11149Nof_ep1 = false ;
         cmbNof_ep1.setValue( A11149Nof_ep1 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep1.setValue( GXutil.rtrim( A11149Nof_ep1) );
      }
      if ( cmbNof_ep2.getItemCount() > 0 )
      {
         A11150Nof_ep2 = cmbNof_ep2.getValidValue(A11150Nof_ep2) ;
         n11150Nof_ep2 = false ;
         cmbNof_ep2.setValue( A11150Nof_ep2 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep2.setValue( GXutil.rtrim( A11150Nof_ep2) );
      }
      if ( cmbNof_ep3.getItemCount() > 0 )
      {
         A11151Nof_ep3 = cmbNof_ep3.getValidValue(A11151Nof_ep3) ;
         n11151Nof_ep3 = false ;
         cmbNof_ep3.setValue( A11151Nof_ep3 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep3.setValue( GXutil.rtrim( A11151Nof_ep3) );
      }
      if ( cmbNof_ep4.getItemCount() > 0 )
      {
         A11152Nof_ep4 = cmbNof_ep4.getValidValue(A11152Nof_ep4) ;
         n11152Nof_ep4 = false ;
         cmbNof_ep4.setValue( A11152Nof_ep4 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep4.setValue( GXutil.rtrim( A11152Nof_ep4) );
      }
      if ( cmbNof_ep5.getItemCount() > 0 )
      {
         A11153Nof_ep5 = cmbNof_ep5.getValidValue(A11153Nof_ep5) ;
         n11153Nof_ep5 = false ;
         cmbNof_ep5.setValue( A11153Nof_ep5 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep5.setValue( GXutil.rtrim( A11153Nof_ep5) );
      }
      if ( cmbNof_ep6.getItemCount() > 0 )
      {
         A11154Nof_ep6 = cmbNof_ep6.getValidValue(A11154Nof_ep6) ;
         n11154Nof_ep6 = false ;
         cmbNof_ep6.setValue( A11154Nof_ep6 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep6.setValue( GXutil.rtrim( A11154Nof_ep6) );
      }
      if ( cmbNof_ep7.getItemCount() > 0 )
      {
         A11155Nof_ep7 = cmbNof_ep7.getValidValue(A11155Nof_ep7) ;
         n11155Nof_ep7 = false ;
         cmbNof_ep7.setValue( A11155Nof_ep7 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep7.setValue( GXutil.rtrim( A11155Nof_ep7) );
      }
      if ( cmbNof_ep8.getItemCount() > 0 )
      {
         A11156Nof_ep8 = cmbNof_ep8.getValidValue(A11156Nof_ep8) ;
         n11156Nof_ep8 = false ;
         cmbNof_ep8.setValue( A11156Nof_ep8 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep8.setValue( GXutil.rtrim( A11156Nof_ep8) );
      }
      if ( cmbNof_ep9.getItemCount() > 0 )
      {
         A11157Nof_ep9 = cmbNof_ep9.getValidValue(A11157Nof_ep9) ;
         n11157Nof_ep9 = false ;
         cmbNof_ep9.setValue( A11157Nof_ep9 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep9.setValue( GXutil.rtrim( A11157Nof_ep9) );
      }
      if ( cmbNof_ep10.getItemCount() > 0 )
      {
         A11158Nof_ep10 = cmbNof_ep10.getValidValue(A11158Nof_ep10) ;
         n11158Nof_ep10 = false ;
         cmbNof_ep10.setValue( A11158Nof_ep10 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_ep10.setValue( GXutil.rtrim( A11158Nof_ep10) );
      }
      if ( cmbNof_sa1.getItemCount() > 0 )
      {
         A11160Nof_sa1 = cmbNof_sa1.getValidValue(A11160Nof_sa1) ;
         n11160Nof_sa1 = false ;
         cmbNof_sa1.setValue( A11160Nof_sa1 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa1.setValue( GXutil.rtrim( A11160Nof_sa1) );
      }
      if ( cmbNof_sa2.getItemCount() > 0 )
      {
         A11161Nof_sa2 = cmbNof_sa2.getValidValue(A11161Nof_sa2) ;
         n11161Nof_sa2 = false ;
         cmbNof_sa2.setValue( A11161Nof_sa2 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa2.setValue( GXutil.rtrim( A11161Nof_sa2) );
      }
      if ( cmbNof_sa3.getItemCount() > 0 )
      {
         A11162Nof_sa3 = cmbNof_sa3.getValidValue(A11162Nof_sa3) ;
         n11162Nof_sa3 = false ;
         cmbNof_sa3.setValue( A11162Nof_sa3 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa3.setValue( GXutil.rtrim( A11162Nof_sa3) );
      }
      if ( cmbNof_sa4.getItemCount() > 0 )
      {
         A11163Nof_sa4 = cmbNof_sa4.getValidValue(A11163Nof_sa4) ;
         n11163Nof_sa4 = false ;
         cmbNof_sa4.setValue( A11163Nof_sa4 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa4.setValue( GXutil.rtrim( A11163Nof_sa4) );
      }
      if ( cmbNof_sa5.getItemCount() > 0 )
      {
         A11164Nof_sa5 = cmbNof_sa5.getValidValue(A11164Nof_sa5) ;
         n11164Nof_sa5 = false ;
         cmbNof_sa5.setValue( A11164Nof_sa5 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa5.setValue( GXutil.rtrim( A11164Nof_sa5) );
      }
      if ( cmbNof_sa6.getItemCount() > 0 )
      {
         A11165Nof_sa6 = cmbNof_sa6.getValidValue(A11165Nof_sa6) ;
         n11165Nof_sa6 = false ;
         cmbNof_sa6.setValue( A11165Nof_sa6 );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_sa6.setValue( GXutil.rtrim( A11165Nof_sa6) );
      }
      if ( cmbNof_stk.getItemCount() > 0 )
      {
         A11167Nof_stk = cmbNof_stk.getValidValue(A11167Nof_stk) ;
         n11167Nof_stk = false ;
         cmbNof_stk.setValue( A11167Nof_stk );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNof_stk.setValue( GXutil.rtrim( A11167Nof_stk) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11106Nof_Pd", GXutil.rtrim( A11106Nof_Pd));
      cmbNof_Pd.setValue( GXutil.rtrim( A11106Nof_Pd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Values", cmbNof_Pd.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11107Nof_Mcot", GXutil.rtrim( A11107Nof_Mcot));
      cmbNof_Mcot.setValue( GXutil.rtrim( A11107Nof_Mcot) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Mcot.getInternalname(), "Values", cmbNof_Mcot.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11108Nof_Pp", GXutil.rtrim( A11108Nof_Pp));
      cmbNof_Pp.setValue( GXutil.rtrim( A11108Nof_Pp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Values", cmbNof_Pp.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11109Nof_Ag", GXutil.rtrim( A11109Nof_Ag));
      cmbNof_Ag.setValue( GXutil.rtrim( A11109Nof_Ag) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Ag.getInternalname(), "Values", cmbNof_Ag.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11110Nof_c1", A11110Nof_c1);
      httpContext.ajax_rsp_assign_attri("", false, "A11111Nof_c2", A11111Nof_c2);
      httpContext.ajax_rsp_assign_attri("", false, "A11112Nof_bo", GXutil.rtrim( A11112Nof_bo));
      cmbNof_bo.setValue( GXutil.rtrim( A11112Nof_bo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_bo.getInternalname(), "Values", cmbNof_bo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11113Nof_bob", GXutil.rtrim( A11113Nof_bob));
      cmbNof_bob.setValue( GXutil.rtrim( A11113Nof_bob) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Values", cmbNof_bob.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11114Nof_boe", GXutil.rtrim( A11114Nof_boe));
      cmbNof_boe.setValue( GXutil.rtrim( A11114Nof_boe) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Values", cmbNof_boe.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11115Nof_Bov", GXutil.rtrim( A11115Nof_Bov));
      cmbNof_Bov.setValue( GXutil.rtrim( A11115Nof_Bov) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Bov.getInternalname(), "Values", cmbNof_Bov.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11116Nof_c3", A11116Nof_c3);
      httpContext.ajax_rsp_assign_attri("", false, "A11117Nof_tns", GXutil.rtrim( A11117Nof_tns));
      cmbNof_tns.setValue( GXutil.rtrim( A11117Nof_tns) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_tns.getInternalname(), "Values", cmbNof_tns.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11118Nof_tnc", GXutil.rtrim( A11118Nof_tnc));
      cmbNof_tnc.setValue( GXutil.rtrim( A11118Nof_tnc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_tnc.getInternalname(), "Values", cmbNof_tnc.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11119Nof_c4", A11119Nof_c4);
      httpContext.ajax_rsp_assign_attri("", false, "A11120Nof_ct", GXutil.rtrim( A11120Nof_ct));
      cmbNof_ct.setValue( GXutil.rtrim( A11120Nof_ct) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ct.getInternalname(), "Values", cmbNof_ct.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11121Nof_c5", A11121Nof_c5);
      httpContext.ajax_rsp_assign_attri("", false, "A11122Nof_scs", GXutil.rtrim( A11122Nof_scs));
      cmbNof_scs.setValue( GXutil.rtrim( A11122Nof_scs) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_scs.getInternalname(), "Values", cmbNof_scs.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11123Nof_scc", GXutil.rtrim( A11123Nof_scc));
      cmbNof_scc.setValue( GXutil.rtrim( A11123Nof_scc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_scc.getInternalname(), "Values", cmbNof_scc.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11124Nof_c6", A11124Nof_c6);
      httpContext.ajax_rsp_assign_attri("", false, "A11125Nof_cctse", GXutil.rtrim( A11125Nof_cctse));
      cmbNof_cctse.setValue( GXutil.rtrim( A11125Nof_cctse) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctse.getInternalname(), "Values", cmbNof_cctse.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11126Nof_ccttp", GXutil.rtrim( A11126Nof_ccttp));
      cmbNof_ccttp.setValue( GXutil.rtrim( A11126Nof_ccttp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccttp.getInternalname(), "Values", cmbNof_ccttp.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11127Nof_cctet", GXutil.rtrim( A11127Nof_cctet));
      cmbNof_cctet.setValue( GXutil.rtrim( A11127Nof_cctet) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctet.getInternalname(), "Values", cmbNof_cctet.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11128Nof_ccp", GXutil.ltrim( localUtil.ntoc( A11128Nof_ccp, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11129Nof_cct", GXutil.ltrim( localUtil.ntoc( A11129Nof_cct, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11130Nof_ccpc", GXutil.rtrim( A11130Nof_ccpc));
      cmbNof_ccpc.setValue( GXutil.rtrim( A11130Nof_ccpc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccpc.getInternalname(), "Values", cmbNof_ccpc.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11131Nof_cctq", GXutil.rtrim( A11131Nof_cctq));
      cmbNof_cctq.setValue( GXutil.rtrim( A11131Nof_cctq) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cctq.getInternalname(), "Values", cmbNof_cctq.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11132Nof_cccc", GXutil.rtrim( A11132Nof_cccc));
      cmbNof_cccc.setValue( GXutil.rtrim( A11132Nof_cccc) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_cccc.getInternalname(), "Values", cmbNof_cccc.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11133Nof_ccec", GXutil.rtrim( A11133Nof_ccec));
      cmbNof_ccec.setValue( GXutil.rtrim( A11133Nof_ccec) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccec.getInternalname(), "Values", cmbNof_ccec.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11134Nof_ccmc1", GXutil.rtrim( A11134Nof_ccmc1));
      cmbNof_ccmc1.setValue( GXutil.rtrim( A11134Nof_ccmc1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc1.getInternalname(), "Values", cmbNof_ccmc1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11135Nof_ccmc2", GXutil.rtrim( A11135Nof_ccmc2));
      cmbNof_ccmc2.setValue( GXutil.rtrim( A11135Nof_ccmc2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc2.getInternalname(), "Values", cmbNof_ccmc2.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11136Nof_ccmc3", GXutil.rtrim( A11136Nof_ccmc3));
      cmbNof_ccmc3.setValue( GXutil.rtrim( A11136Nof_ccmc3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc3.getInternalname(), "Values", cmbNof_ccmc3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11137Nof_ccmc4", GXutil.rtrim( A11137Nof_ccmc4));
      cmbNof_ccmc4.setValue( GXutil.rtrim( A11137Nof_ccmc4) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc4.getInternalname(), "Values", cmbNof_ccmc4.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11138Nof_ccmc5", GXutil.rtrim( A11138Nof_ccmc5));
      cmbNof_ccmc5.setValue( GXutil.rtrim( A11138Nof_ccmc5) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc5.getInternalname(), "Values", cmbNof_ccmc5.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11139Nof_ccmc6", GXutil.rtrim( A11139Nof_ccmc6));
      cmbNof_ccmc6.setValue( GXutil.rtrim( A11139Nof_ccmc6) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ccmc6.getInternalname(), "Values", cmbNof_ccmc6.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11140Nof_c7", A11140Nof_c7);
      httpContext.ajax_rsp_assign_attri("", false, "A11141Nof_rb", GXutil.rtrim( A11141Nof_rb));
      cmbNof_rb.setValue( GXutil.rtrim( A11141Nof_rb) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb.getInternalname(), "Values", cmbNof_rb.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11142Nof_rbi", GXutil.rtrim( A11142Nof_rbi));
      cmbNof_rbi.setValue( GXutil.rtrim( A11142Nof_rbi) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbi.getInternalname(), "Values", cmbNof_rbi.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11143Nof_rbe", GXutil.rtrim( A11143Nof_rbe));
      cmbNof_rbe.setValue( GXutil.rtrim( A11143Nof_rbe) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbe.getInternalname(), "Values", cmbNof_rbe.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11144Nof_rbp", GXutil.rtrim( A11144Nof_rbp));
      cmbNof_rbp.setValue( GXutil.rtrim( A11144Nof_rbp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rbp.getInternalname(), "Values", cmbNof_rbp.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11145Nof_rboc", GXutil.ltrim( localUtil.ntoc( A11145Nof_rboc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11146Nof_rb1", GXutil.rtrim( A11146Nof_rb1));
      cmbNof_rb1.setValue( GXutil.rtrim( A11146Nof_rb1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb1.getInternalname(), "Values", cmbNof_rb1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11147Nof_rb3", GXutil.rtrim( A11147Nof_rb3));
      cmbNof_rb3.setValue( GXutil.rtrim( A11147Nof_rb3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_rb3.getInternalname(), "Values", cmbNof_rb3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11148Nof_c8", A11148Nof_c8);
      httpContext.ajax_rsp_assign_attri("", false, "A11149Nof_ep1", GXutil.rtrim( A11149Nof_ep1));
      cmbNof_ep1.setValue( GXutil.rtrim( A11149Nof_ep1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep1.getInternalname(), "Values", cmbNof_ep1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11150Nof_ep2", GXutil.rtrim( A11150Nof_ep2));
      cmbNof_ep2.setValue( GXutil.rtrim( A11150Nof_ep2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep2.getInternalname(), "Values", cmbNof_ep2.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11151Nof_ep3", GXutil.rtrim( A11151Nof_ep3));
      cmbNof_ep3.setValue( GXutil.rtrim( A11151Nof_ep3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep3.getInternalname(), "Values", cmbNof_ep3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11152Nof_ep4", GXutil.rtrim( A11152Nof_ep4));
      cmbNof_ep4.setValue( GXutil.rtrim( A11152Nof_ep4) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep4.getInternalname(), "Values", cmbNof_ep4.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11153Nof_ep5", GXutil.rtrim( A11153Nof_ep5));
      cmbNof_ep5.setValue( GXutil.rtrim( A11153Nof_ep5) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep5.getInternalname(), "Values", cmbNof_ep5.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11154Nof_ep6", GXutil.rtrim( A11154Nof_ep6));
      cmbNof_ep6.setValue( GXutil.rtrim( A11154Nof_ep6) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep6.getInternalname(), "Values", cmbNof_ep6.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11155Nof_ep7", GXutil.rtrim( A11155Nof_ep7));
      cmbNof_ep7.setValue( GXutil.rtrim( A11155Nof_ep7) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep7.getInternalname(), "Values", cmbNof_ep7.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11156Nof_ep8", GXutil.rtrim( A11156Nof_ep8));
      cmbNof_ep8.setValue( GXutil.rtrim( A11156Nof_ep8) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep8.getInternalname(), "Values", cmbNof_ep8.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11157Nof_ep9", GXutil.rtrim( A11157Nof_ep9));
      cmbNof_ep9.setValue( GXutil.rtrim( A11157Nof_ep9) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep9.getInternalname(), "Values", cmbNof_ep9.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11158Nof_ep10", GXutil.rtrim( A11158Nof_ep10));
      cmbNof_ep10.setValue( GXutil.rtrim( A11158Nof_ep10) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_ep10.getInternalname(), "Values", cmbNof_ep10.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11159Nof_c9", A11159Nof_c9);
      httpContext.ajax_rsp_assign_attri("", false, "A11160Nof_sa1", GXutil.rtrim( A11160Nof_sa1));
      cmbNof_sa1.setValue( GXutil.rtrim( A11160Nof_sa1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa1.getInternalname(), "Values", cmbNof_sa1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11161Nof_sa2", GXutil.rtrim( A11161Nof_sa2));
      cmbNof_sa2.setValue( GXutil.rtrim( A11161Nof_sa2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa2.getInternalname(), "Values", cmbNof_sa2.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11162Nof_sa3", GXutil.rtrim( A11162Nof_sa3));
      cmbNof_sa3.setValue( GXutil.rtrim( A11162Nof_sa3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa3.getInternalname(), "Values", cmbNof_sa3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11163Nof_sa4", GXutil.rtrim( A11163Nof_sa4));
      cmbNof_sa4.setValue( GXutil.rtrim( A11163Nof_sa4) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa4.getInternalname(), "Values", cmbNof_sa4.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11164Nof_sa5", GXutil.rtrim( A11164Nof_sa5));
      cmbNof_sa5.setValue( GXutil.rtrim( A11164Nof_sa5) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa5.getInternalname(), "Values", cmbNof_sa5.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11165Nof_sa6", GXutil.rtrim( A11165Nof_sa6));
      cmbNof_sa6.setValue( GXutil.rtrim( A11165Nof_sa6) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_sa6.getInternalname(), "Values", cmbNof_sa6.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11166Nof_c10", A11166Nof_c10);
      httpContext.ajax_rsp_assign_attri("", false, "A11167Nof_stk", GXutil.rtrim( A11167Nof_stk));
      cmbNof_stk.setValue( GXutil.rtrim( A11167Nof_stk) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_stk.getInternalname(), "Values", cmbNof_stk.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11168Nof_Lbta", GXutil.rtrim( A11168Nof_Lbta));
      httpContext.ajax_rsp_assign_attri("", false, "A11169Nof_Lbtp", GXutil.ltrim( localUtil.ntoc( A11169Nof_Lbtp, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11170Nof_c11", A11170Nof_c11);
      httpContext.ajax_rsp_assign_attri("", false, "A11171Nof_c12", A11171Nof_c12);
      httpContext.ajax_rsp_assign_attri("", false, "A11388Nof_imp1", GXutil.rtrim( A11388Nof_imp1));
      httpContext.ajax_rsp_assign_attri("", false, "A11389Nof_imp2", GXutil.rtrim( A11389Nof_imp2));
      httpContext.ajax_rsp_assign_attri("", false, "A11390Nof_imp3", GXutil.rtrim( A11390Nof_imp3));
      httpContext.ajax_rsp_assign_attri("", false, "A11391Nof_imp4", GXutil.rtrim( A11391Nof_imp4));
      httpContext.ajax_rsp_assign_attri("", false, "A11392Nof_imp5", GXutil.rtrim( A11392Nof_imp5));
      httpContext.ajax_rsp_assign_attri("", false, "A11393Nof_imp6", GXutil.rtrim( A11393Nof_imp6));
      httpContext.ajax_rsp_assign_attri("", false, "A11394Nof_imp7", GXutil.rtrim( A11394Nof_imp7));
      httpContext.ajax_rsp_assign_attri("", false, "A11395Nof_imp8", GXutil.rtrim( A11395Nof_imp8));
      httpContext.ajax_rsp_assign_attri("", false, "A11396Nof_imp9", GXutil.rtrim( A11396Nof_imp9));
      httpContext.ajax_rsp_assign_attri("", false, "A11397Nof_imp10", GXutil.rtrim( A11397Nof_imp10));
      httpContext.ajax_rsp_assign_attri("", false, "A11398Nof_imp11", GXutil.rtrim( A11398Nof_imp11));
      httpContext.ajax_rsp_assign_attri("", false, "A11399Nof_lavado", GXutil.rtrim( A11399Nof_lavado));
      httpContext.ajax_rsp_assign_attri("", false, "A11400Nof_luz", GXutil.rtrim( A11400Nof_luz));
      httpContext.ajax_rsp_assign_attri("", false, "A11401Nof_sudor", GXutil.rtrim( A11401Nof_sudor));
      httpContext.ajax_rsp_assign_attri("", false, "A11402Nof_cloro", GXutil.rtrim( A11402Nof_cloro));
      httpContext.ajax_rsp_assign_attri("", false, "A11403Nof_aguam", GXutil.rtrim( A11403Nof_aguam));
      httpContext.ajax_rsp_assign_attri("", false, "A11404Nof_termom", GXutil.rtrim( A11404Nof_termom));
      httpContext.ajax_rsp_assign_attri("", false, "A11405Nof_humeda", GXutil.ltrim( localUtil.ntoc( A11405Nof_humeda, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11406Nof_oekote", GXutil.rtrim( A11406Nof_oekote));
      httpContext.ajax_rsp_assign_attri("", false, "A11418Nof_obs1", GXutil.rtrim( A11418Nof_obs1));
      httpContext.ajax_rsp_assign_attri("", false, "A11419Nof_obs2", GXutil.rtrim( A11419Nof_obs2));
      httpContext.ajax_rsp_assign_attri("", false, "A11420Nof_obs3", GXutil.rtrim( A11420Nof_obs3));
      httpContext.ajax_rsp_assign_attri("", false, "A11421Nof_obs4", GXutil.rtrim( A11421Nof_obs4));
      httpContext.ajax_rsp_assign_attri("", false, "A11422Nof_obs5", GXutil.rtrim( A11422Nof_obs5));
      httpContext.ajax_rsp_assign_attri("", false, "A11423Nof_obs6", GXutil.rtrim( A11423Nof_obs6));
      httpContext.ajax_rsp_assign_attri("", false, "A11424Nof_obs7", GXutil.rtrim( A11424Nof_obs7));
      httpContext.ajax_rsp_assign_attri("", false, "A11425Nof_obs8", GXutil.rtrim( A11425Nof_obs8));
      httpContext.ajax_rsp_assign_attri("", false, "A11426Nof_obs9", GXutil.rtrim( A11426Nof_obs9));
      httpContext.ajax_rsp_assign_attri("", false, "A11427Nof_obs10", GXutil.rtrim( A11427Nof_obs10));
      httpContext.ajax_rsp_assign_attri("", false, "A11428Nof_obs11", GXutil.rtrim( A11428Nof_obs11));
      httpContext.ajax_rsp_assign_attri("", false, "A11709Nof_nc", GXutil.ltrim( localUtil.ntoc( A11709Nof_nc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11710Nof_enc", GXutil.ltrim( localUtil.ntoc( A11710Nof_enc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pp.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_Pd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_Pd.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_bob.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_bob.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbNof_boe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNof_boe.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11103Nof_Hdr", GXutil.ltrim( localUtil.ntoc( Z11103Nof_Hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11104Nof_r", GXutil.ltrim( localUtil.ntoc( Z11104Nof_r, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11105Nof_p", GXutil.rtrim( Z11105Nof_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11106Nof_Pd", GXutil.rtrim( Z11106Nof_Pd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11107Nof_Mcot", GXutil.rtrim( Z11107Nof_Mcot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11108Nof_Pp", GXutil.rtrim( Z11108Nof_Pp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11109Nof_Ag", GXutil.rtrim( Z11109Nof_Ag));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11110Nof_c1", Z11110Nof_c1);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11111Nof_c2", Z11111Nof_c2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11112Nof_bo", GXutil.rtrim( Z11112Nof_bo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11113Nof_bob", GXutil.rtrim( Z11113Nof_bob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11114Nof_boe", GXutil.rtrim( Z11114Nof_boe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11115Nof_Bov", GXutil.rtrim( Z11115Nof_Bov));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11116Nof_c3", Z11116Nof_c3);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11117Nof_tns", GXutil.rtrim( Z11117Nof_tns));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11118Nof_tnc", GXutil.rtrim( Z11118Nof_tnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11119Nof_c4", Z11119Nof_c4);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11120Nof_ct", GXutil.rtrim( Z11120Nof_ct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11121Nof_c5", Z11121Nof_c5);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11122Nof_scs", GXutil.rtrim( Z11122Nof_scs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11123Nof_scc", GXutil.rtrim( Z11123Nof_scc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11124Nof_c6", Z11124Nof_c6);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11125Nof_cctse", GXutil.rtrim( Z11125Nof_cctse));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11126Nof_ccttp", GXutil.rtrim( Z11126Nof_ccttp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11127Nof_cctet", GXutil.rtrim( Z11127Nof_cctet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11128Nof_ccp", GXutil.ltrim( localUtil.ntoc( Z11128Nof_ccp, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11129Nof_cct", GXutil.ltrim( localUtil.ntoc( Z11129Nof_cct, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11130Nof_ccpc", GXutil.rtrim( Z11130Nof_ccpc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11131Nof_cctq", GXutil.rtrim( Z11131Nof_cctq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11132Nof_cccc", GXutil.rtrim( Z11132Nof_cccc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11133Nof_ccec", GXutil.rtrim( Z11133Nof_ccec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11134Nof_ccmc1", GXutil.rtrim( Z11134Nof_ccmc1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11135Nof_ccmc2", GXutil.rtrim( Z11135Nof_ccmc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11136Nof_ccmc3", GXutil.rtrim( Z11136Nof_ccmc3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11137Nof_ccmc4", GXutil.rtrim( Z11137Nof_ccmc4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11138Nof_ccmc5", GXutil.rtrim( Z11138Nof_ccmc5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11139Nof_ccmc6", GXutil.rtrim( Z11139Nof_ccmc6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11140Nof_c7", Z11140Nof_c7);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11141Nof_rb", GXutil.rtrim( Z11141Nof_rb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11142Nof_rbi", GXutil.rtrim( Z11142Nof_rbi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11143Nof_rbe", GXutil.rtrim( Z11143Nof_rbe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11144Nof_rbp", GXutil.rtrim( Z11144Nof_rbp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11145Nof_rboc", GXutil.ltrim( localUtil.ntoc( Z11145Nof_rboc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11146Nof_rb1", GXutil.rtrim( Z11146Nof_rb1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11147Nof_rb3", GXutil.rtrim( Z11147Nof_rb3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11148Nof_c8", Z11148Nof_c8);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11149Nof_ep1", GXutil.rtrim( Z11149Nof_ep1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11150Nof_ep2", GXutil.rtrim( Z11150Nof_ep2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11151Nof_ep3", GXutil.rtrim( Z11151Nof_ep3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11152Nof_ep4", GXutil.rtrim( Z11152Nof_ep4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11153Nof_ep5", GXutil.rtrim( Z11153Nof_ep5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11154Nof_ep6", GXutil.rtrim( Z11154Nof_ep6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11155Nof_ep7", GXutil.rtrim( Z11155Nof_ep7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11156Nof_ep8", GXutil.rtrim( Z11156Nof_ep8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11157Nof_ep9", GXutil.rtrim( Z11157Nof_ep9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11158Nof_ep10", GXutil.rtrim( Z11158Nof_ep10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11159Nof_c9", Z11159Nof_c9);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11160Nof_sa1", GXutil.rtrim( Z11160Nof_sa1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11161Nof_sa2", GXutil.rtrim( Z11161Nof_sa2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11162Nof_sa3", GXutil.rtrim( Z11162Nof_sa3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11163Nof_sa4", GXutil.rtrim( Z11163Nof_sa4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11164Nof_sa5", GXutil.rtrim( Z11164Nof_sa5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11165Nof_sa6", GXutil.rtrim( Z11165Nof_sa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11166Nof_c10", Z11166Nof_c10);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11167Nof_stk", GXutil.rtrim( Z11167Nof_stk));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11168Nof_Lbta", GXutil.rtrim( Z11168Nof_Lbta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11169Nof_Lbtp", GXutil.ltrim( localUtil.ntoc( Z11169Nof_Lbtp, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11170Nof_c11", Z11170Nof_c11);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11171Nof_c12", Z11171Nof_c12);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11388Nof_imp1", GXutil.rtrim( Z11388Nof_imp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11389Nof_imp2", GXutil.rtrim( Z11389Nof_imp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11390Nof_imp3", GXutil.rtrim( Z11390Nof_imp3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11391Nof_imp4", GXutil.rtrim( Z11391Nof_imp4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11392Nof_imp5", GXutil.rtrim( Z11392Nof_imp5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11393Nof_imp6", GXutil.rtrim( Z11393Nof_imp6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11394Nof_imp7", GXutil.rtrim( Z11394Nof_imp7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11395Nof_imp8", GXutil.rtrim( Z11395Nof_imp8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11396Nof_imp9", GXutil.rtrim( Z11396Nof_imp9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11397Nof_imp10", GXutil.rtrim( Z11397Nof_imp10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11398Nof_imp11", GXutil.rtrim( Z11398Nof_imp11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11399Nof_lavado", GXutil.rtrim( Z11399Nof_lavado));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11400Nof_luz", GXutil.rtrim( Z11400Nof_luz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11401Nof_sudor", GXutil.rtrim( Z11401Nof_sudor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11402Nof_cloro", GXutil.rtrim( Z11402Nof_cloro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11403Nof_aguam", GXutil.rtrim( Z11403Nof_aguam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11404Nof_termom", GXutil.rtrim( Z11404Nof_termom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11405Nof_humeda", GXutil.ltrim( localUtil.ntoc( Z11405Nof_humeda, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11406Nof_oekote", GXutil.rtrim( Z11406Nof_oekote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11418Nof_obs1", GXutil.rtrim( Z11418Nof_obs1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11419Nof_obs2", GXutil.rtrim( Z11419Nof_obs2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11420Nof_obs3", GXutil.rtrim( Z11420Nof_obs3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11421Nof_obs4", GXutil.rtrim( Z11421Nof_obs4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11422Nof_obs5", GXutil.rtrim( Z11422Nof_obs5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11423Nof_obs6", GXutil.rtrim( Z11423Nof_obs6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11424Nof_obs7", GXutil.rtrim( Z11424Nof_obs7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11425Nof_obs8", GXutil.rtrim( Z11425Nof_obs8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11426Nof_obs9", GXutil.rtrim( Z11426Nof_obs9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11427Nof_obs10", GXutil.rtrim( Z11427Nof_obs10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11428Nof_obs11", GXutil.rtrim( Z11428Nof_obs11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11709Nof_nc", GXutil.ltrim( localUtil.ntoc( Z11709Nof_nc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11710Nof_enc", GXutil.ltrim( localUtil.ntoc( Z11710Nof_enc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      /* Using cursor T01AP16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11103Nof_Hdr',fld:'NOF_HDR',pic:'ZZZZZZZ9'},{av:'A11104Nof_r',fld:'NOF_R',pic:'9'},{av:'A11105Nof_p',fld:'NOF_P',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'IMPRIMIR FICHA?'","{handler:'e121AP2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11103Nof_Hdr',fld:'NOF_HDR',pic:'ZZZZZZZ9'},{av:'A11104Nof_r',fld:'NOF_R',pic:'9'},{av:'A11105Nof_p',fld:'NOF_P',pic:''}]");
      setEventMetadata("'IMPRIMIR FICHA?'",",oparms:[{av:'A11105Nof_p',fld:'NOF_P',pic:''},{av:'A11104Nof_r',fld:'NOF_R',pic:'9'},{av:'A11103Nof_Hdr',fld:'NOF_HDR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_NOF_HDR","{handler:'valid_Nof_hdr',iparms:[]");
      setEventMetadata("VALID_NOF_HDR",",oparms:[]}");
      setEventMetadata("VALID_NOF_R","{handler:'valid_Nof_r',iparms:[]");
      setEventMetadata("VALID_NOF_R",",oparms:[]}");
      setEventMetadata("VALID_NOF_P","{handler:'valid_Nof_p',iparms:[{av:'cmbNof_sa4'},{av:'A11163Nof_sa4',fld:'NOF_SA4',pic:''},{av:'cmbNof_Bov'},{av:'A11115Nof_Bov',fld:'NOF_BOV',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11103Nof_Hdr',fld:'NOF_HDR',pic:'ZZZZZZZ9'},{av:'A11104Nof_r',fld:'NOF_R',pic:'9'},{av:'A11105Nof_p',fld:'NOF_P',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'cmbNof_Mcot'},{av:'A11107Nof_Mcot',fld:'NOF_MCOT',pic:''},{av:'cmbNof_Pd'},{av:'A11106Nof_Pd',fld:'NOF_PD',pic:''},{av:'cmbNof_Pp'},{av:'A11108Nof_Pp',fld:'NOF_PP',pic:''},{av:'cmbNof_Ag'},{av:'A11109Nof_Ag',fld:'NOF_AG',pic:''},{av:'cmbNof_bo'},{av:'A11112Nof_bo',fld:'NOF_BO',pic:''},{av:'cmbNof_bob'},{av:'A11113Nof_bob',fld:'NOF_BOB',pic:''},{av:'cmbNof_boe'},{av:'A11114Nof_boe',fld:'NOF_BOE',pic:''},{av:'cmbNof_tns'},{av:'A11117Nof_tns',fld:'NOF_TNS',pic:''},{av:'cmbNof_tnc'},{av:'A11118Nof_tnc',fld:'NOF_TNC',pic:''},{av:'cmbNof_ct'},{av:'A11120Nof_ct',fld:'NOF_CT',pic:''},{av:'cmbNof_scs'},{av:'A11122Nof_scs',fld:'NOF_SCS',pic:''},{av:'cmbNof_scc'},{av:'A11123Nof_scc',fld:'NOF_SCC',pic:''},{av:'cmbNof_cctse'},{av:'A11125Nof_cctse',fld:'NOF_CCTSE',pic:''},{av:'cmbNof_ccttp'},{av:'A11126Nof_ccttp',fld:'NOF_CCTTP',pic:''},{av:'cmbNof_cctet'},{av:'A11127Nof_cctet',fld:'NOF_CCTET',pic:''},{av:'cmbNof_ccpc'},{av:'A11130Nof_ccpc',fld:'NOF_CCPC',pic:''},{av:'cmbNof_cctq'},{av:'A11131Nof_cctq',fld:'NOF_CCTQ',pic:''},{av:'cmbNof_cccc'},{av:'A11132Nof_cccc',fld:'NOF_CCCC',pic:''},{av:'cmbNof_ccec'},{av:'A11133Nof_ccec',fld:'NOF_CCEC',pic:''},{av:'cmbNof_ccmc1'},{av:'A11134Nof_ccmc1',fld:'NOF_CCMC1',pic:''},{av:'cmbNof_ccmc2'},{av:'A11135Nof_ccmc2',fld:'NOF_CCMC2',pic:''},{av:'cmbNof_ccmc3'},{av:'A11136Nof_ccmc3',fld:'NOF_CCMC3',pic:''},{av:'cmbNof_ccmc4'},{av:'A11137Nof_ccmc4',fld:'NOF_CCMC4',pic:''},{av:'cmbNof_ccmc5'},{av:'A11138Nof_ccmc5',fld:'NOF_CCMC5',pic:''},{av:'cmbNof_ccmc6'},{av:'A11139Nof_ccmc6',fld:'NOF_CCMC6',pic:''},{av:'cmbNof_rb'},{av:'A11141Nof_rb',fld:'NOF_RB',pic:''},{av:'cmbNof_rbe'},{av:'A11143Nof_rbe',fld:'NOF_RBE',pic:''},{av:'cmbNof_rbi'},{av:'A11142Nof_rbi',fld:'NOF_RBI',pic:''},{av:'cmbNof_rbp'},{av:'A11144Nof_rbp',fld:'NOF_RBP',pic:''},{av:'cmbNof_rb1'},{av:'A11146Nof_rb1',fld:'NOF_RB1',pic:''},{av:'cmbNof_rb3'},{av:'A11147Nof_rb3',fld:'NOF_RB3',pic:''},{av:'cmbNof_ep1'},{av:'A11149Nof_ep1',fld:'NOF_EP1',pic:''},{av:'cmbNof_ep2'},{av:'A11150Nof_ep2',fld:'NOF_EP2',pic:''},{av:'cmbNof_ep3'},{av:'A11151Nof_ep3',fld:'NOF_EP3',pic:''},{av:'cmbNof_ep4'},{av:'A11152Nof_ep4',fld:'NOF_EP4',pic:''},{av:'cmbNof_ep5'},{av:'A11153Nof_ep5',fld:'NOF_EP5',pic:''},{av:'cmbNof_ep6'},{av:'A11154Nof_ep6',fld:'NOF_EP6',pic:''},{av:'cmbNof_ep7'},{av:'A11155Nof_ep7',fld:'NOF_EP7',pic:''},{av:'cmbNof_ep8'},{av:'A11156Nof_ep8',fld:'NOF_EP8',pic:''},{av:'cmbNof_ep9'},{av:'A11157Nof_ep9',fld:'NOF_EP9',pic:''},{av:'cmbNof_ep10'},{av:'A11158Nof_ep10',fld:'NOF_EP10',pic:''},{av:'cmbNof_sa1'},{av:'A11160Nof_sa1',fld:'NOF_SA1',pic:''},{av:'cmbNof_sa2'},{av:'A11161Nof_sa2',fld:'NOF_SA2',pic:''},{av:'cmbNof_sa3'},{av:'A11162Nof_sa3',fld:'NOF_SA3',pic:''},{av:'cmbNof_sa5'},{av:'A11164Nof_sa5',fld:'NOF_SA5',pic:''},{av:'cmbNof_sa6'},{av:'A11165Nof_sa6',fld:'NOF_SA6',pic:''},{av:'cmbNof_stk'},{av:'A11167Nof_stk',fld:'NOF_STK',pic:''},{av:'edtTrnCod_Enabled',ctrl:'TRNCOD',prop:'Enabled'}]");
      setEventMetadata("VALID_NOF_P",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'cmbNof_Pd'},{av:'A11106Nof_Pd',fld:'NOF_PD',pic:''},{av:'cmbNof_Mcot'},{av:'A11107Nof_Mcot',fld:'NOF_MCOT',pic:''},{av:'cmbNof_Pp'},{av:'A11108Nof_Pp',fld:'NOF_PP',pic:''},{av:'cmbNof_Ag'},{av:'A11109Nof_Ag',fld:'NOF_AG',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A11110Nof_c1',fld:'NOF_C1',pic:''},{av:'A11111Nof_c2',fld:'NOF_C2',pic:''},{av:'cmbNof_bo'},{av:'A11112Nof_bo',fld:'NOF_BO',pic:''},{av:'cmbNof_bob'},{av:'A11113Nof_bob',fld:'NOF_BOB',pic:''},{av:'cmbNof_boe'},{av:'A11114Nof_boe',fld:'NOF_BOE',pic:''},{av:'cmbNof_Bov'},{av:'A11115Nof_Bov',fld:'NOF_BOV',pic:''},{av:'A11116Nof_c3',fld:'NOF_C3',pic:''},{av:'cmbNof_tns'},{av:'A11117Nof_tns',fld:'NOF_TNS',pic:''},{av:'cmbNof_tnc'},{av:'A11118Nof_tnc',fld:'NOF_TNC',pic:''},{av:'A11119Nof_c4',fld:'NOF_C4',pic:''},{av:'cmbNof_ct'},{av:'A11120Nof_ct',fld:'NOF_CT',pic:''},{av:'A11121Nof_c5',fld:'NOF_C5',pic:''},{av:'cmbNof_scs'},{av:'A11122Nof_scs',fld:'NOF_SCS',pic:''},{av:'cmbNof_scc'},{av:'A11123Nof_scc',fld:'NOF_SCC',pic:''},{av:'A11124Nof_c6',fld:'NOF_C6',pic:''},{av:'cmbNof_cctse'},{av:'A11125Nof_cctse',fld:'NOF_CCTSE',pic:''},{av:'cmbNof_ccttp'},{av:'A11126Nof_ccttp',fld:'NOF_CCTTP',pic:''},{av:'cmbNof_cctet'},{av:'A11127Nof_cctet',fld:'NOF_CCTET',pic:''},{av:'A11128Nof_ccp',fld:'NOF_CCP',pic:'Z9'},{av:'A11129Nof_cct',fld:'NOF_CCT',pic:'Z9'},{av:'cmbNof_ccpc'},{av:'A11130Nof_ccpc',fld:'NOF_CCPC',pic:''},{av:'cmbNof_cctq'},{av:'A11131Nof_cctq',fld:'NOF_CCTQ',pic:''},{av:'cmbNof_cccc'},{av:'A11132Nof_cccc',fld:'NOF_CCCC',pic:''},{av:'cmbNof_ccec'},{av:'A11133Nof_ccec',fld:'NOF_CCEC',pic:''},{av:'cmbNof_ccmc1'},{av:'A11134Nof_ccmc1',fld:'NOF_CCMC1',pic:''},{av:'cmbNof_ccmc2'},{av:'A11135Nof_ccmc2',fld:'NOF_CCMC2',pic:''},{av:'cmbNof_ccmc3'},{av:'A11136Nof_ccmc3',fld:'NOF_CCMC3',pic:''},{av:'cmbNof_ccmc4'},{av:'A11137Nof_ccmc4',fld:'NOF_CCMC4',pic:''},{av:'cmbNof_ccmc5'},{av:'A11138Nof_ccmc5',fld:'NOF_CCMC5',pic:''},{av:'cmbNof_ccmc6'},{av:'A11139Nof_ccmc6',fld:'NOF_CCMC6',pic:''},{av:'A11140Nof_c7',fld:'NOF_C7',pic:''},{av:'cmbNof_rb'},{av:'A11141Nof_rb',fld:'NOF_RB',pic:''},{av:'cmbNof_rbi'},{av:'A11142Nof_rbi',fld:'NOF_RBI',pic:''},{av:'cmbNof_rbe'},{av:'A11143Nof_rbe',fld:'NOF_RBE',pic:''},{av:'cmbNof_rbp'},{av:'A11144Nof_rbp',fld:'NOF_RBP',pic:''},{av:'A11145Nof_rboc',fld:'NOF_RBOC',pic:'ZZ9'},{av:'cmbNof_rb1'},{av:'A11146Nof_rb1',fld:'NOF_RB1',pic:''},{av:'cmbNof_rb3'},{av:'A11147Nof_rb3',fld:'NOF_RB3',pic:''},{av:'A11148Nof_c8',fld:'NOF_C8',pic:''},{av:'cmbNof_ep1'},{av:'A11149Nof_ep1',fld:'NOF_EP1',pic:''},{av:'cmbNof_ep2'},{av:'A11150Nof_ep2',fld:'NOF_EP2',pic:''},{av:'cmbNof_ep3'},{av:'A11151Nof_ep3',fld:'NOF_EP3',pic:''},{av:'cmbNof_ep4'},{av:'A11152Nof_ep4',fld:'NOF_EP4',pic:''},{av:'cmbNof_ep5'},{av:'A11153Nof_ep5',fld:'NOF_EP5',pic:''},{av:'cmbNof_ep6'},{av:'A11154Nof_ep6',fld:'NOF_EP6',pic:''},{av:'cmbNof_ep7'},{av:'A11155Nof_ep7',fld:'NOF_EP7',pic:''},{av:'cmbNof_ep8'},{av:'A11156Nof_ep8',fld:'NOF_EP8',pic:''},{av:'cmbNof_ep9'},{av:'A11157Nof_ep9',fld:'NOF_EP9',pic:''},{av:'cmbNof_ep10'},{av:'A11158Nof_ep10',fld:'NOF_EP10',pic:''},{av:'A11159Nof_c9',fld:'NOF_C9',pic:''},{av:'cmbNof_sa1'},{av:'A11160Nof_sa1',fld:'NOF_SA1',pic:''},{av:'cmbNof_sa2'},{av:'A11161Nof_sa2',fld:'NOF_SA2',pic:''},{av:'cmbNof_sa3'},{av:'A11162Nof_sa3',fld:'NOF_SA3',pic:''},{av:'cmbNof_sa4'},{av:'A11163Nof_sa4',fld:'NOF_SA4',pic:''},{av:'cmbNof_sa5'},{av:'A11164Nof_sa5',fld:'NOF_SA5',pic:''},{av:'cmbNof_sa6'},{av:'A11165Nof_sa6',fld:'NOF_SA6',pic:''},{av:'A11166Nof_c10',fld:'NOF_C10',pic:''},{av:'cmbNof_stk'},{av:'A11167Nof_stk',fld:'NOF_STK',pic:''},{av:'A11168Nof_Lbta',fld:'NOF_LBTA',pic:''},{av:'A11169Nof_Lbtp',fld:'NOF_LBTP',pic:'ZZZ9'},{av:'A11170Nof_c11',fld:'NOF_C11',pic:''},{av:'A11171Nof_c12',fld:'NOF_C12',pic:''},{av:'A11388Nof_imp1',fld:'NOF_IMP1',pic:''},{av:'A11389Nof_imp2',fld:'NOF_IMP2',pic:''},{av:'A11390Nof_imp3',fld:'NOF_IMP3',pic:''},{av:'A11391Nof_imp4',fld:'NOF_IMP4',pic:''},{av:'A11392Nof_imp5',fld:'NOF_IMP5',pic:''},{av:'A11393Nof_imp6',fld:'NOF_IMP6',pic:''},{av:'A11394Nof_imp7',fld:'NOF_IMP7',pic:''},{av:'A11395Nof_imp8',fld:'NOF_IMP8',pic:''},{av:'A11396Nof_imp9',fld:'NOF_IMP9',pic:''},{av:'A11397Nof_imp10',fld:'NOF_IMP10',pic:''},{av:'A11398Nof_imp11',fld:'NOF_IMP11',pic:''},{av:'A11399Nof_lavado',fld:'NOF_LAVADO',pic:''},{av:'A11400Nof_luz',fld:'NOF_LUZ',pic:''},{av:'A11401Nof_sudor',fld:'NOF_SUDOR',pic:''},{av:'A11402Nof_cloro',fld:'NOF_CLORO',pic:''},{av:'A11403Nof_aguam',fld:'NOF_AGUAM',pic:''},{av:'A11404Nof_termom',fld:'NOF_TERMOM',pic:''},{av:'A11405Nof_humeda',fld:'NOF_HUMEDA',pic:'ZZ9.99'},{av:'A11406Nof_oekote',fld:'NOF_OEKOTE',pic:''},{av:'A11418Nof_obs1',fld:'NOF_OBS1',pic:''},{av:'A11419Nof_obs2',fld:'NOF_OBS2',pic:''},{av:'A11420Nof_obs3',fld:'NOF_OBS3',pic:''},{av:'A11421Nof_obs4',fld:'NOF_OBS4',pic:''},{av:'A11422Nof_obs5',fld:'NOF_OBS5',pic:''},{av:'A11423Nof_obs6',fld:'NOF_OBS6',pic:''},{av:'A11424Nof_obs7',fld:'NOF_OBS7',pic:''},{av:'A11425Nof_obs8',fld:'NOF_OBS8',pic:''},{av:'A11426Nof_obs9',fld:'NOF_OBS9',pic:''},{av:'A11427Nof_obs10',fld:'NOF_OBS10',pic:''},{av:'A11428Nof_obs11',fld:'NOF_OBS11',pic:''},{av:'A11709Nof_nc',fld:'NOF_NC',pic:'Z9'},{av:'A11710Nof_enc',fld:'NOF_ENC',pic:'ZZ9.99'},{av:'edtTrnCod_Enabled',ctrl:'TRNCOD',prop:'Enabled'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11103Nof_Hdr'},{av:'Z11104Nof_r'},{av:'Z11105Nof_p'},{av:'Z407EmprNom'},{av:'Z11106Nof_Pd'},{av:'Z11107Nof_Mcot'},{av:'Z11108Nof_Pp'},{av:'Z11109Nof_Ag'},{av:'Z840TrnCod'},{av:'Z11110Nof_c1'},{av:'Z11111Nof_c2'},{av:'Z11112Nof_bo'},{av:'Z11113Nof_bob'},{av:'Z11114Nof_boe'},{av:'Z11115Nof_Bov'},{av:'Z11116Nof_c3'},{av:'Z11117Nof_tns'},{av:'Z11118Nof_tnc'},{av:'Z11119Nof_c4'},{av:'Z11120Nof_ct'},{av:'Z11121Nof_c5'},{av:'Z11122Nof_scs'},{av:'Z11123Nof_scc'},{av:'Z11124Nof_c6'},{av:'Z11125Nof_cctse'},{av:'Z11126Nof_ccttp'},{av:'Z11127Nof_cctet'},{av:'Z11128Nof_ccp'},{av:'Z11129Nof_cct'},{av:'Z11130Nof_ccpc'},{av:'Z11131Nof_cctq'},{av:'Z11132Nof_cccc'},{av:'Z11133Nof_ccec'},{av:'Z11134Nof_ccmc1'},{av:'Z11135Nof_ccmc2'},{av:'Z11136Nof_ccmc3'},{av:'Z11137Nof_ccmc4'},{av:'Z11138Nof_ccmc5'},{av:'Z11139Nof_ccmc6'},{av:'Z11140Nof_c7'},{av:'Z11141Nof_rb'},{av:'Z11142Nof_rbi'},{av:'Z11143Nof_rbe'},{av:'Z11144Nof_rbp'},{av:'Z11145Nof_rboc'},{av:'Z11146Nof_rb1'},{av:'Z11147Nof_rb3'},{av:'Z11148Nof_c8'},{av:'Z11149Nof_ep1'},{av:'Z11150Nof_ep2'},{av:'Z11151Nof_ep3'},{av:'Z11152Nof_ep4'},{av:'Z11153Nof_ep5'},{av:'Z11154Nof_ep6'},{av:'Z11155Nof_ep7'},{av:'Z11156Nof_ep8'},{av:'Z11157Nof_ep9'},{av:'Z11158Nof_ep10'},{av:'Z11159Nof_c9'},{av:'Z11160Nof_sa1'},{av:'Z11161Nof_sa2'},{av:'Z11162Nof_sa3'},{av:'Z11163Nof_sa4'},{av:'Z11164Nof_sa5'},{av:'Z11165Nof_sa6'},{av:'Z11166Nof_c10'},{av:'Z11167Nof_stk'},{av:'Z11168Nof_Lbta'},{av:'Z11169Nof_Lbtp'},{av:'Z11170Nof_c11'},{av:'Z11171Nof_c12'},{av:'Z11388Nof_imp1'},{av:'Z11389Nof_imp2'},{av:'Z11390Nof_imp3'},{av:'Z11391Nof_imp4'},{av:'Z11392Nof_imp5'},{av:'Z11393Nof_imp6'},{av:'Z11394Nof_imp7'},{av:'Z11395Nof_imp8'},{av:'Z11396Nof_imp9'},{av:'Z11397Nof_imp10'},{av:'Z11398Nof_imp11'},{av:'Z11399Nof_lavado'},{av:'Z11400Nof_luz'},{av:'Z11401Nof_sudor'},{av:'Z11402Nof_cloro'},{av:'Z11403Nof_aguam'},{av:'Z11404Nof_termom'},{av:'Z11405Nof_humeda'},{av:'Z11406Nof_oekote'},{av:'Z11418Nof_obs1'},{av:'Z11419Nof_obs2'},{av:'Z11420Nof_obs3'},{av:'Z11421Nof_obs4'},{av:'Z11422Nof_obs5'},{av:'Z11423Nof_obs6'},{av:'Z11424Nof_obs7'},{av:'Z11425Nof_obs8'},{av:'Z11426Nof_obs9'},{av:'Z11427Nof_obs10'},{av:'Z11428Nof_obs11'},{av:'Z11709Nof_nc'},{av:'Z11710Nof_enc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_NOF_PD","{handler:'valid_Nof_pd',iparms:[]");
      setEventMetadata("VALID_NOF_PD",",oparms:[]}");
      setEventMetadata("VALID_NOF_PP","{handler:'valid_Nof_pp',iparms:[]");
      setEventMetadata("VALID_NOF_PP",",oparms:[]}");
      setEventMetadata("VALID_NOF_AG","{handler:'valid_Nof_ag',iparms:[]");
      setEventMetadata("VALID_NOF_AG",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_NOF_BO","{handler:'valid_Nof_bo',iparms:[]");
      setEventMetadata("VALID_NOF_BO",",oparms:[]}");
      setEventMetadata("VALID_NOF_BOB","{handler:'valid_Nof_bob',iparms:[]");
      setEventMetadata("VALID_NOF_BOB",",oparms:[]}");
      setEventMetadata("VALID_NOF_BOE","{handler:'valid_Nof_boe',iparms:[]");
      setEventMetadata("VALID_NOF_BOE",",oparms:[]}");
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
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA11105Nof_p = "" ;
      Z396EmprCod = "" ;
      Z11105Nof_p = "" ;
      Z11106Nof_Pd = "" ;
      Z11107Nof_Mcot = "" ;
      Z11108Nof_Pp = "" ;
      Z11109Nof_Ag = "" ;
      Z11110Nof_c1 = "" ;
      Z11111Nof_c2 = "" ;
      Z11112Nof_bo = "" ;
      Z11113Nof_bob = "" ;
      Z11114Nof_boe = "" ;
      Z11115Nof_Bov = "" ;
      Z11116Nof_c3 = "" ;
      Z11117Nof_tns = "" ;
      Z11118Nof_tnc = "" ;
      Z11119Nof_c4 = "" ;
      Z11120Nof_ct = "" ;
      Z11121Nof_c5 = "" ;
      Z11122Nof_scs = "" ;
      Z11123Nof_scc = "" ;
      Z11124Nof_c6 = "" ;
      Z11125Nof_cctse = "" ;
      Z11126Nof_ccttp = "" ;
      Z11127Nof_cctet = "" ;
      Z11130Nof_ccpc = "" ;
      Z11131Nof_cctq = "" ;
      Z11132Nof_cccc = "" ;
      Z11133Nof_ccec = "" ;
      Z11134Nof_ccmc1 = "" ;
      Z11135Nof_ccmc2 = "" ;
      Z11136Nof_ccmc3 = "" ;
      Z11137Nof_ccmc4 = "" ;
      Z11138Nof_ccmc5 = "" ;
      Z11139Nof_ccmc6 = "" ;
      Z11140Nof_c7 = "" ;
      Z11141Nof_rb = "" ;
      Z11142Nof_rbi = "" ;
      Z11143Nof_rbe = "" ;
      Z11144Nof_rbp = "" ;
      Z11146Nof_rb1 = "" ;
      Z11147Nof_rb3 = "" ;
      Z11148Nof_c8 = "" ;
      Z11149Nof_ep1 = "" ;
      Z11150Nof_ep2 = "" ;
      Z11151Nof_ep3 = "" ;
      Z11152Nof_ep4 = "" ;
      Z11153Nof_ep5 = "" ;
      Z11154Nof_ep6 = "" ;
      Z11155Nof_ep7 = "" ;
      Z11156Nof_ep8 = "" ;
      Z11157Nof_ep9 = "" ;
      Z11158Nof_ep10 = "" ;
      Z11159Nof_c9 = "" ;
      Z11160Nof_sa1 = "" ;
      Z11161Nof_sa2 = "" ;
      Z11162Nof_sa3 = "" ;
      Z11163Nof_sa4 = "" ;
      Z11164Nof_sa5 = "" ;
      Z11165Nof_sa6 = "" ;
      Z11166Nof_c10 = "" ;
      Z11167Nof_stk = "" ;
      Z11168Nof_Lbta = "" ;
      Z11170Nof_c11 = "" ;
      Z11171Nof_c12 = "" ;
      Z11388Nof_imp1 = "" ;
      Z11389Nof_imp2 = "" ;
      Z11390Nof_imp3 = "" ;
      Z11391Nof_imp4 = "" ;
      Z11392Nof_imp5 = "" ;
      Z11393Nof_imp6 = "" ;
      Z11394Nof_imp7 = "" ;
      Z11395Nof_imp8 = "" ;
      Z11396Nof_imp9 = "" ;
      Z11397Nof_imp10 = "" ;
      Z11398Nof_imp11 = "" ;
      Z11399Nof_lavado = "" ;
      Z11400Nof_luz = "" ;
      Z11401Nof_sudor = "" ;
      Z11402Nof_cloro = "" ;
      Z11403Nof_aguam = "" ;
      Z11404Nof_termom = "" ;
      Z11405Nof_humeda = DecimalUtil.ZERO ;
      Z11406Nof_oekote = "" ;
      Z11418Nof_obs1 = "" ;
      Z11419Nof_obs2 = "" ;
      Z11420Nof_obs3 = "" ;
      Z11421Nof_obs4 = "" ;
      Z11422Nof_obs5 = "" ;
      Z11423Nof_obs6 = "" ;
      Z11424Nof_obs7 = "" ;
      Z11425Nof_obs8 = "" ;
      Z11426Nof_obs9 = "" ;
      Z11427Nof_obs10 = "" ;
      Z11428Nof_obs11 = "" ;
      Z11710Nof_enc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11105Nof_p = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11106Nof_Pd = "" ;
      A11107Nof_Mcot = "" ;
      A11108Nof_Pp = "" ;
      A11109Nof_Ag = "" ;
      A11112Nof_bo = "" ;
      A11113Nof_bob = "" ;
      A11114Nof_boe = "" ;
      A11115Nof_Bov = "" ;
      A11117Nof_tns = "" ;
      A11118Nof_tnc = "" ;
      A11120Nof_ct = "" ;
      A11122Nof_scs = "" ;
      A11123Nof_scc = "" ;
      A11125Nof_cctse = "" ;
      A11126Nof_ccttp = "" ;
      A11127Nof_cctet = "" ;
      A11130Nof_ccpc = "" ;
      A11131Nof_cctq = "" ;
      A11132Nof_cccc = "" ;
      A11133Nof_ccec = "" ;
      A11134Nof_ccmc1 = "" ;
      A11135Nof_ccmc2 = "" ;
      A11136Nof_ccmc3 = "" ;
      A11137Nof_ccmc4 = "" ;
      A11138Nof_ccmc5 = "" ;
      A11139Nof_ccmc6 = "" ;
      A11141Nof_rb = "" ;
      A11142Nof_rbi = "" ;
      A11143Nof_rbe = "" ;
      A11144Nof_rbp = "" ;
      A11146Nof_rb1 = "" ;
      A11147Nof_rb3 = "" ;
      A11149Nof_ep1 = "" ;
      A11150Nof_ep2 = "" ;
      A11151Nof_ep3 = "" ;
      A11152Nof_ep4 = "" ;
      A11153Nof_ep5 = "" ;
      A11154Nof_ep6 = "" ;
      A11155Nof_ep7 = "" ;
      A11156Nof_ep8 = "" ;
      A11157Nof_ep9 = "" ;
      A11158Nof_ep10 = "" ;
      A11160Nof_sa1 = "" ;
      A11161Nof_sa2 = "" ;
      A11162Nof_sa3 = "" ;
      A11163Nof_sa4 = "" ;
      A11164Nof_sa5 = "" ;
      A11165Nof_sa6 = "" ;
      A11167Nof_stk = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11110Nof_c1 = "" ;
      lblTextblock12_Jsonclick = "" ;
      A11111Nof_c2 = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A11116Nof_c3 = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A11119Nof_c4 = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A11121Nof_c5 = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A11124Nof_c6 = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      A11140Nof_c7 = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      A11148Nof_c8 = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      lblTextblock57_Jsonclick = "" ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock59_Jsonclick = "" ;
      lblTextblock60_Jsonclick = "" ;
      A11159Nof_c9 = "" ;
      lblTextblock61_Jsonclick = "" ;
      lblTextblock62_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock64_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      lblTextblock67_Jsonclick = "" ;
      A11166Nof_c10 = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      A11168Nof_Lbta = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      A11170Nof_c11 = "" ;
      lblTextblock72_Jsonclick = "" ;
      A11171Nof_c12 = "" ;
      lblTextblock73_Jsonclick = "" ;
      A11388Nof_imp1 = "" ;
      lblTextblock74_Jsonclick = "" ;
      A11389Nof_imp2 = "" ;
      lblTextblock75_Jsonclick = "" ;
      A11390Nof_imp3 = "" ;
      lblTextblock76_Jsonclick = "" ;
      A11391Nof_imp4 = "" ;
      lblTextblock77_Jsonclick = "" ;
      A11392Nof_imp5 = "" ;
      lblTextblock78_Jsonclick = "" ;
      A11393Nof_imp6 = "" ;
      lblTextblock79_Jsonclick = "" ;
      A11394Nof_imp7 = "" ;
      lblTextblock80_Jsonclick = "" ;
      A11395Nof_imp8 = "" ;
      lblTextblock81_Jsonclick = "" ;
      A11396Nof_imp9 = "" ;
      lblTextblock82_Jsonclick = "" ;
      A11397Nof_imp10 = "" ;
      lblTextblock83_Jsonclick = "" ;
      A11398Nof_imp11 = "" ;
      lblTextblock84_Jsonclick = "" ;
      A11399Nof_lavado = "" ;
      lblTextblock85_Jsonclick = "" ;
      A11400Nof_luz = "" ;
      lblTextblock86_Jsonclick = "" ;
      A11401Nof_sudor = "" ;
      lblTextblock87_Jsonclick = "" ;
      A11402Nof_cloro = "" ;
      lblTextblock88_Jsonclick = "" ;
      A11403Nof_aguam = "" ;
      lblTextblock89_Jsonclick = "" ;
      A11404Nof_termom = "" ;
      lblTextblock90_Jsonclick = "" ;
      A11405Nof_humeda = DecimalUtil.ZERO ;
      lblTextblock91_Jsonclick = "" ;
      A11406Nof_oekote = "" ;
      lblTextblock92_Jsonclick = "" ;
      A11418Nof_obs1 = "" ;
      lblTextblock93_Jsonclick = "" ;
      A11419Nof_obs2 = "" ;
      lblTextblock94_Jsonclick = "" ;
      A11420Nof_obs3 = "" ;
      lblTextblock95_Jsonclick = "" ;
      A11421Nof_obs4 = "" ;
      lblTextblock96_Jsonclick = "" ;
      A11422Nof_obs5 = "" ;
      lblTextblock97_Jsonclick = "" ;
      A11423Nof_obs6 = "" ;
      lblTextblock98_Jsonclick = "" ;
      A11424Nof_obs7 = "" ;
      lblTextblock99_Jsonclick = "" ;
      A11425Nof_obs8 = "" ;
      lblTextblock100_Jsonclick = "" ;
      A11426Nof_obs9 = "" ;
      lblTextblock101_Jsonclick = "" ;
      A11427Nof_obs10 = "" ;
      lblTextblock102_Jsonclick = "" ;
      A11428Nof_obs11 = "" ;
      lblTextblock103_Jsonclick = "" ;
      lblTextblock104_Jsonclick = "" ;
      A11710Nof_enc = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      Z407EmprNom = "" ;
      T01AP4_A407EmprNom = new String[] {""} ;
      T01AP4_n407EmprNom = new boolean[] {false} ;
      T01AP6_A11709Nof_nc = new byte[1] ;
      T01AP6_n11709Nof_nc = new boolean[] {false} ;
      T01AP6_A11710Nof_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AP6_n11710Nof_enc = new boolean[] {false} ;
      T01AP6_A396EmprCod = new String[] {""} ;
      T01AP6_A840TrnCod = new short[1] ;
      T01AP6_n840TrnCod = new boolean[] {false} ;
      T01AP6_A11103Nof_Hdr = new int[1] ;
      T01AP6_A11104Nof_r = new byte[1] ;
      T01AP6_A11105Nof_p = new String[] {""} ;
      T01AP6_A407EmprNom = new String[] {""} ;
      T01AP6_n407EmprNom = new boolean[] {false} ;
      T01AP6_A11106Nof_Pd = new String[] {""} ;
      T01AP6_n11106Nof_Pd = new boolean[] {false} ;
      T01AP6_A11107Nof_Mcot = new String[] {""} ;
      T01AP6_n11107Nof_Mcot = new boolean[] {false} ;
      T01AP6_A11108Nof_Pp = new String[] {""} ;
      T01AP6_n11108Nof_Pp = new boolean[] {false} ;
      T01AP6_A11109Nof_Ag = new String[] {""} ;
      T01AP6_n11109Nof_Ag = new boolean[] {false} ;
      T01AP6_A11110Nof_c1 = new String[] {""} ;
      T01AP6_n11110Nof_c1 = new boolean[] {false} ;
      T01AP6_A11111Nof_c2 = new String[] {""} ;
      T01AP6_n11111Nof_c2 = new boolean[] {false} ;
      T01AP6_A11112Nof_bo = new String[] {""} ;
      T01AP6_n11112Nof_bo = new boolean[] {false} ;
      T01AP6_A11113Nof_bob = new String[] {""} ;
      T01AP6_n11113Nof_bob = new boolean[] {false} ;
      T01AP6_A11114Nof_boe = new String[] {""} ;
      T01AP6_n11114Nof_boe = new boolean[] {false} ;
      T01AP6_A11115Nof_Bov = new String[] {""} ;
      T01AP6_n11115Nof_Bov = new boolean[] {false} ;
      T01AP6_A11116Nof_c3 = new String[] {""} ;
      T01AP6_n11116Nof_c3 = new boolean[] {false} ;
      T01AP6_A11117Nof_tns = new String[] {""} ;
      T01AP6_n11117Nof_tns = new boolean[] {false} ;
      T01AP6_A11118Nof_tnc = new String[] {""} ;
      T01AP6_n11118Nof_tnc = new boolean[] {false} ;
      T01AP6_A11119Nof_c4 = new String[] {""} ;
      T01AP6_n11119Nof_c4 = new boolean[] {false} ;
      T01AP6_A11120Nof_ct = new String[] {""} ;
      T01AP6_n11120Nof_ct = new boolean[] {false} ;
      T01AP6_A11121Nof_c5 = new String[] {""} ;
      T01AP6_n11121Nof_c5 = new boolean[] {false} ;
      T01AP6_A11122Nof_scs = new String[] {""} ;
      T01AP6_n11122Nof_scs = new boolean[] {false} ;
      T01AP6_A11123Nof_scc = new String[] {""} ;
      T01AP6_n11123Nof_scc = new boolean[] {false} ;
      T01AP6_A11124Nof_c6 = new String[] {""} ;
      T01AP6_n11124Nof_c6 = new boolean[] {false} ;
      T01AP6_A11125Nof_cctse = new String[] {""} ;
      T01AP6_n11125Nof_cctse = new boolean[] {false} ;
      T01AP6_A11126Nof_ccttp = new String[] {""} ;
      T01AP6_n11126Nof_ccttp = new boolean[] {false} ;
      T01AP6_A11127Nof_cctet = new String[] {""} ;
      T01AP6_n11127Nof_cctet = new boolean[] {false} ;
      T01AP6_A11128Nof_ccp = new byte[1] ;
      T01AP6_n11128Nof_ccp = new boolean[] {false} ;
      T01AP6_A11129Nof_cct = new byte[1] ;
      T01AP6_n11129Nof_cct = new boolean[] {false} ;
      T01AP6_A11130Nof_ccpc = new String[] {""} ;
      T01AP6_n11130Nof_ccpc = new boolean[] {false} ;
      T01AP6_A11131Nof_cctq = new String[] {""} ;
      T01AP6_n11131Nof_cctq = new boolean[] {false} ;
      T01AP6_A11132Nof_cccc = new String[] {""} ;
      T01AP6_n11132Nof_cccc = new boolean[] {false} ;
      T01AP6_A11133Nof_ccec = new String[] {""} ;
      T01AP6_n11133Nof_ccec = new boolean[] {false} ;
      T01AP6_A11134Nof_ccmc1 = new String[] {""} ;
      T01AP6_n11134Nof_ccmc1 = new boolean[] {false} ;
      T01AP6_A11135Nof_ccmc2 = new String[] {""} ;
      T01AP6_n11135Nof_ccmc2 = new boolean[] {false} ;
      T01AP6_A11136Nof_ccmc3 = new String[] {""} ;
      T01AP6_n11136Nof_ccmc3 = new boolean[] {false} ;
      T01AP6_A11137Nof_ccmc4 = new String[] {""} ;
      T01AP6_n11137Nof_ccmc4 = new boolean[] {false} ;
      T01AP6_A11138Nof_ccmc5 = new String[] {""} ;
      T01AP6_n11138Nof_ccmc5 = new boolean[] {false} ;
      T01AP6_A11139Nof_ccmc6 = new String[] {""} ;
      T01AP6_n11139Nof_ccmc6 = new boolean[] {false} ;
      T01AP6_A11140Nof_c7 = new String[] {""} ;
      T01AP6_n11140Nof_c7 = new boolean[] {false} ;
      T01AP6_A11141Nof_rb = new String[] {""} ;
      T01AP6_n11141Nof_rb = new boolean[] {false} ;
      T01AP6_A11142Nof_rbi = new String[] {""} ;
      T01AP6_n11142Nof_rbi = new boolean[] {false} ;
      T01AP6_A11143Nof_rbe = new String[] {""} ;
      T01AP6_n11143Nof_rbe = new boolean[] {false} ;
      T01AP6_A11144Nof_rbp = new String[] {""} ;
      T01AP6_n11144Nof_rbp = new boolean[] {false} ;
      T01AP6_A11145Nof_rboc = new short[1] ;
      T01AP6_n11145Nof_rboc = new boolean[] {false} ;
      T01AP6_A11146Nof_rb1 = new String[] {""} ;
      T01AP6_n11146Nof_rb1 = new boolean[] {false} ;
      T01AP6_A11147Nof_rb3 = new String[] {""} ;
      T01AP6_n11147Nof_rb3 = new boolean[] {false} ;
      T01AP6_A11148Nof_c8 = new String[] {""} ;
      T01AP6_n11148Nof_c8 = new boolean[] {false} ;
      T01AP6_A11149Nof_ep1 = new String[] {""} ;
      T01AP6_n11149Nof_ep1 = new boolean[] {false} ;
      T01AP6_A11150Nof_ep2 = new String[] {""} ;
      T01AP6_n11150Nof_ep2 = new boolean[] {false} ;
      T01AP6_A11151Nof_ep3 = new String[] {""} ;
      T01AP6_n11151Nof_ep3 = new boolean[] {false} ;
      T01AP6_A11152Nof_ep4 = new String[] {""} ;
      T01AP6_n11152Nof_ep4 = new boolean[] {false} ;
      T01AP6_A11153Nof_ep5 = new String[] {""} ;
      T01AP6_n11153Nof_ep5 = new boolean[] {false} ;
      T01AP6_A11154Nof_ep6 = new String[] {""} ;
      T01AP6_n11154Nof_ep6 = new boolean[] {false} ;
      T01AP6_A11155Nof_ep7 = new String[] {""} ;
      T01AP6_n11155Nof_ep7 = new boolean[] {false} ;
      T01AP6_A11156Nof_ep8 = new String[] {""} ;
      T01AP6_n11156Nof_ep8 = new boolean[] {false} ;
      T01AP6_A11157Nof_ep9 = new String[] {""} ;
      T01AP6_n11157Nof_ep9 = new boolean[] {false} ;
      T01AP6_A11158Nof_ep10 = new String[] {""} ;
      T01AP6_n11158Nof_ep10 = new boolean[] {false} ;
      T01AP6_A11159Nof_c9 = new String[] {""} ;
      T01AP6_n11159Nof_c9 = new boolean[] {false} ;
      T01AP6_A11160Nof_sa1 = new String[] {""} ;
      T01AP6_n11160Nof_sa1 = new boolean[] {false} ;
      T01AP6_A11161Nof_sa2 = new String[] {""} ;
      T01AP6_n11161Nof_sa2 = new boolean[] {false} ;
      T01AP6_A11162Nof_sa3 = new String[] {""} ;
      T01AP6_n11162Nof_sa3 = new boolean[] {false} ;
      T01AP6_A11163Nof_sa4 = new String[] {""} ;
      T01AP6_n11163Nof_sa4 = new boolean[] {false} ;
      T01AP6_A11164Nof_sa5 = new String[] {""} ;
      T01AP6_n11164Nof_sa5 = new boolean[] {false} ;
      T01AP6_A11165Nof_sa6 = new String[] {""} ;
      T01AP6_n11165Nof_sa6 = new boolean[] {false} ;
      T01AP6_A11166Nof_c10 = new String[] {""} ;
      T01AP6_n11166Nof_c10 = new boolean[] {false} ;
      T01AP6_A11167Nof_stk = new String[] {""} ;
      T01AP6_n11167Nof_stk = new boolean[] {false} ;
      T01AP6_A11168Nof_Lbta = new String[] {""} ;
      T01AP6_n11168Nof_Lbta = new boolean[] {false} ;
      T01AP6_A11169Nof_Lbtp = new short[1] ;
      T01AP6_n11169Nof_Lbtp = new boolean[] {false} ;
      T01AP6_A11170Nof_c11 = new String[] {""} ;
      T01AP6_n11170Nof_c11 = new boolean[] {false} ;
      T01AP6_A11171Nof_c12 = new String[] {""} ;
      T01AP6_n11171Nof_c12 = new boolean[] {false} ;
      T01AP6_A11388Nof_imp1 = new String[] {""} ;
      T01AP6_n11388Nof_imp1 = new boolean[] {false} ;
      T01AP6_A11389Nof_imp2 = new String[] {""} ;
      T01AP6_n11389Nof_imp2 = new boolean[] {false} ;
      T01AP6_A11390Nof_imp3 = new String[] {""} ;
      T01AP6_n11390Nof_imp3 = new boolean[] {false} ;
      T01AP6_A11391Nof_imp4 = new String[] {""} ;
      T01AP6_n11391Nof_imp4 = new boolean[] {false} ;
      T01AP6_A11392Nof_imp5 = new String[] {""} ;
      T01AP6_n11392Nof_imp5 = new boolean[] {false} ;
      T01AP6_A11393Nof_imp6 = new String[] {""} ;
      T01AP6_n11393Nof_imp6 = new boolean[] {false} ;
      T01AP6_A11394Nof_imp7 = new String[] {""} ;
      T01AP6_n11394Nof_imp7 = new boolean[] {false} ;
      T01AP6_A11395Nof_imp8 = new String[] {""} ;
      T01AP6_n11395Nof_imp8 = new boolean[] {false} ;
      T01AP6_A11396Nof_imp9 = new String[] {""} ;
      T01AP6_n11396Nof_imp9 = new boolean[] {false} ;
      T01AP6_A11397Nof_imp10 = new String[] {""} ;
      T01AP6_n11397Nof_imp10 = new boolean[] {false} ;
      T01AP6_A11398Nof_imp11 = new String[] {""} ;
      T01AP6_n11398Nof_imp11 = new boolean[] {false} ;
      T01AP6_A11399Nof_lavado = new String[] {""} ;
      T01AP6_n11399Nof_lavado = new boolean[] {false} ;
      T01AP6_A11400Nof_luz = new String[] {""} ;
      T01AP6_n11400Nof_luz = new boolean[] {false} ;
      T01AP6_A11401Nof_sudor = new String[] {""} ;
      T01AP6_n11401Nof_sudor = new boolean[] {false} ;
      T01AP6_A11402Nof_cloro = new String[] {""} ;
      T01AP6_n11402Nof_cloro = new boolean[] {false} ;
      T01AP6_A11403Nof_aguam = new String[] {""} ;
      T01AP6_n11403Nof_aguam = new boolean[] {false} ;
      T01AP6_A11404Nof_termom = new String[] {""} ;
      T01AP6_n11404Nof_termom = new boolean[] {false} ;
      T01AP6_A11405Nof_humeda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AP6_n11405Nof_humeda = new boolean[] {false} ;
      T01AP6_A11406Nof_oekote = new String[] {""} ;
      T01AP6_n11406Nof_oekote = new boolean[] {false} ;
      T01AP6_A11418Nof_obs1 = new String[] {""} ;
      T01AP6_n11418Nof_obs1 = new boolean[] {false} ;
      T01AP6_A11419Nof_obs2 = new String[] {""} ;
      T01AP6_n11419Nof_obs2 = new boolean[] {false} ;
      T01AP6_A11420Nof_obs3 = new String[] {""} ;
      T01AP6_n11420Nof_obs3 = new boolean[] {false} ;
      T01AP6_A11421Nof_obs4 = new String[] {""} ;
      T01AP6_n11421Nof_obs4 = new boolean[] {false} ;
      T01AP6_A11422Nof_obs5 = new String[] {""} ;
      T01AP6_n11422Nof_obs5 = new boolean[] {false} ;
      T01AP6_A11423Nof_obs6 = new String[] {""} ;
      T01AP6_n11423Nof_obs6 = new boolean[] {false} ;
      T01AP6_A11424Nof_obs7 = new String[] {""} ;
      T01AP6_n11424Nof_obs7 = new boolean[] {false} ;
      T01AP6_A11425Nof_obs8 = new String[] {""} ;
      T01AP6_n11425Nof_obs8 = new boolean[] {false} ;
      T01AP6_A11426Nof_obs9 = new String[] {""} ;
      T01AP6_n11426Nof_obs9 = new boolean[] {false} ;
      T01AP6_A11427Nof_obs10 = new String[] {""} ;
      T01AP6_n11427Nof_obs10 = new boolean[] {false} ;
      T01AP6_A11428Nof_obs11 = new String[] {""} ;
      T01AP6_n11428Nof_obs11 = new boolean[] {false} ;
      T01AP5_A396EmprCod = new String[] {""} ;
      T01AP7_A396EmprCod = new String[] {""} ;
      T01AP8_A396EmprCod = new String[] {""} ;
      T01AP8_A11103Nof_Hdr = new int[1] ;
      T01AP8_A11104Nof_r = new byte[1] ;
      T01AP8_A11105Nof_p = new String[] {""} ;
      T01AP3_A11709Nof_nc = new byte[1] ;
      T01AP3_n11709Nof_nc = new boolean[] {false} ;
      T01AP3_A11710Nof_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AP3_n11710Nof_enc = new boolean[] {false} ;
      T01AP3_A396EmprCod = new String[] {""} ;
      T01AP3_A840TrnCod = new short[1] ;
      T01AP3_n840TrnCod = new boolean[] {false} ;
      T01AP3_A11103Nof_Hdr = new int[1] ;
      T01AP3_A11104Nof_r = new byte[1] ;
      T01AP3_A11105Nof_p = new String[] {""} ;
      T01AP3_A11106Nof_Pd = new String[] {""} ;
      T01AP3_n11106Nof_Pd = new boolean[] {false} ;
      T01AP3_A11107Nof_Mcot = new String[] {""} ;
      T01AP3_n11107Nof_Mcot = new boolean[] {false} ;
      T01AP3_A11108Nof_Pp = new String[] {""} ;
      T01AP3_n11108Nof_Pp = new boolean[] {false} ;
      T01AP3_A11109Nof_Ag = new String[] {""} ;
      T01AP3_n11109Nof_Ag = new boolean[] {false} ;
      T01AP3_A11110Nof_c1 = new String[] {""} ;
      T01AP3_n11110Nof_c1 = new boolean[] {false} ;
      T01AP3_A11111Nof_c2 = new String[] {""} ;
      T01AP3_n11111Nof_c2 = new boolean[] {false} ;
      T01AP3_A11112Nof_bo = new String[] {""} ;
      T01AP3_n11112Nof_bo = new boolean[] {false} ;
      T01AP3_A11113Nof_bob = new String[] {""} ;
      T01AP3_n11113Nof_bob = new boolean[] {false} ;
      T01AP3_A11114Nof_boe = new String[] {""} ;
      T01AP3_n11114Nof_boe = new boolean[] {false} ;
      T01AP3_A11115Nof_Bov = new String[] {""} ;
      T01AP3_n11115Nof_Bov = new boolean[] {false} ;
      T01AP3_A11116Nof_c3 = new String[] {""} ;
      T01AP3_n11116Nof_c3 = new boolean[] {false} ;
      T01AP3_A11117Nof_tns = new String[] {""} ;
      T01AP3_n11117Nof_tns = new boolean[] {false} ;
      T01AP3_A11118Nof_tnc = new String[] {""} ;
      T01AP3_n11118Nof_tnc = new boolean[] {false} ;
      T01AP3_A11119Nof_c4 = new String[] {""} ;
      T01AP3_n11119Nof_c4 = new boolean[] {false} ;
      T01AP3_A11120Nof_ct = new String[] {""} ;
      T01AP3_n11120Nof_ct = new boolean[] {false} ;
      T01AP3_A11121Nof_c5 = new String[] {""} ;
      T01AP3_n11121Nof_c5 = new boolean[] {false} ;
      T01AP3_A11122Nof_scs = new String[] {""} ;
      T01AP3_n11122Nof_scs = new boolean[] {false} ;
      T01AP3_A11123Nof_scc = new String[] {""} ;
      T01AP3_n11123Nof_scc = new boolean[] {false} ;
      T01AP3_A11124Nof_c6 = new String[] {""} ;
      T01AP3_n11124Nof_c6 = new boolean[] {false} ;
      T01AP3_A11125Nof_cctse = new String[] {""} ;
      T01AP3_n11125Nof_cctse = new boolean[] {false} ;
      T01AP3_A11126Nof_ccttp = new String[] {""} ;
      T01AP3_n11126Nof_ccttp = new boolean[] {false} ;
      T01AP3_A11127Nof_cctet = new String[] {""} ;
      T01AP3_n11127Nof_cctet = new boolean[] {false} ;
      T01AP3_A11128Nof_ccp = new byte[1] ;
      T01AP3_n11128Nof_ccp = new boolean[] {false} ;
      T01AP3_A11129Nof_cct = new byte[1] ;
      T01AP3_n11129Nof_cct = new boolean[] {false} ;
      T01AP3_A11130Nof_ccpc = new String[] {""} ;
      T01AP3_n11130Nof_ccpc = new boolean[] {false} ;
      T01AP3_A11131Nof_cctq = new String[] {""} ;
      T01AP3_n11131Nof_cctq = new boolean[] {false} ;
      T01AP3_A11132Nof_cccc = new String[] {""} ;
      T01AP3_n11132Nof_cccc = new boolean[] {false} ;
      T01AP3_A11133Nof_ccec = new String[] {""} ;
      T01AP3_n11133Nof_ccec = new boolean[] {false} ;
      T01AP3_A11134Nof_ccmc1 = new String[] {""} ;
      T01AP3_n11134Nof_ccmc1 = new boolean[] {false} ;
      T01AP3_A11135Nof_ccmc2 = new String[] {""} ;
      T01AP3_n11135Nof_ccmc2 = new boolean[] {false} ;
      T01AP3_A11136Nof_ccmc3 = new String[] {""} ;
      T01AP3_n11136Nof_ccmc3 = new boolean[] {false} ;
      T01AP3_A11137Nof_ccmc4 = new String[] {""} ;
      T01AP3_n11137Nof_ccmc4 = new boolean[] {false} ;
      T01AP3_A11138Nof_ccmc5 = new String[] {""} ;
      T01AP3_n11138Nof_ccmc5 = new boolean[] {false} ;
      T01AP3_A11139Nof_ccmc6 = new String[] {""} ;
      T01AP3_n11139Nof_ccmc6 = new boolean[] {false} ;
      T01AP3_A11140Nof_c7 = new String[] {""} ;
      T01AP3_n11140Nof_c7 = new boolean[] {false} ;
      T01AP3_A11141Nof_rb = new String[] {""} ;
      T01AP3_n11141Nof_rb = new boolean[] {false} ;
      T01AP3_A11142Nof_rbi = new String[] {""} ;
      T01AP3_n11142Nof_rbi = new boolean[] {false} ;
      T01AP3_A11143Nof_rbe = new String[] {""} ;
      T01AP3_n11143Nof_rbe = new boolean[] {false} ;
      T01AP3_A11144Nof_rbp = new String[] {""} ;
      T01AP3_n11144Nof_rbp = new boolean[] {false} ;
      T01AP3_A11145Nof_rboc = new short[1] ;
      T01AP3_n11145Nof_rboc = new boolean[] {false} ;
      T01AP3_A11146Nof_rb1 = new String[] {""} ;
      T01AP3_n11146Nof_rb1 = new boolean[] {false} ;
      T01AP3_A11147Nof_rb3 = new String[] {""} ;
      T01AP3_n11147Nof_rb3 = new boolean[] {false} ;
      T01AP3_A11148Nof_c8 = new String[] {""} ;
      T01AP3_n11148Nof_c8 = new boolean[] {false} ;
      T01AP3_A11149Nof_ep1 = new String[] {""} ;
      T01AP3_n11149Nof_ep1 = new boolean[] {false} ;
      T01AP3_A11150Nof_ep2 = new String[] {""} ;
      T01AP3_n11150Nof_ep2 = new boolean[] {false} ;
      T01AP3_A11151Nof_ep3 = new String[] {""} ;
      T01AP3_n11151Nof_ep3 = new boolean[] {false} ;
      T01AP3_A11152Nof_ep4 = new String[] {""} ;
      T01AP3_n11152Nof_ep4 = new boolean[] {false} ;
      T01AP3_A11153Nof_ep5 = new String[] {""} ;
      T01AP3_n11153Nof_ep5 = new boolean[] {false} ;
      T01AP3_A11154Nof_ep6 = new String[] {""} ;
      T01AP3_n11154Nof_ep6 = new boolean[] {false} ;
      T01AP3_A11155Nof_ep7 = new String[] {""} ;
      T01AP3_n11155Nof_ep7 = new boolean[] {false} ;
      T01AP3_A11156Nof_ep8 = new String[] {""} ;
      T01AP3_n11156Nof_ep8 = new boolean[] {false} ;
      T01AP3_A11157Nof_ep9 = new String[] {""} ;
      T01AP3_n11157Nof_ep9 = new boolean[] {false} ;
      T01AP3_A11158Nof_ep10 = new String[] {""} ;
      T01AP3_n11158Nof_ep10 = new boolean[] {false} ;
      T01AP3_A11159Nof_c9 = new String[] {""} ;
      T01AP3_n11159Nof_c9 = new boolean[] {false} ;
      T01AP3_A11160Nof_sa1 = new String[] {""} ;
      T01AP3_n11160Nof_sa1 = new boolean[] {false} ;
      T01AP3_A11161Nof_sa2 = new String[] {""} ;
      T01AP3_n11161Nof_sa2 = new boolean[] {false} ;
      T01AP3_A11162Nof_sa3 = new String[] {""} ;
      T01AP3_n11162Nof_sa3 = new boolean[] {false} ;
      T01AP3_A11163Nof_sa4 = new String[] {""} ;
      T01AP3_n11163Nof_sa4 = new boolean[] {false} ;
      T01AP3_A11164Nof_sa5 = new String[] {""} ;
      T01AP3_n11164Nof_sa5 = new boolean[] {false} ;
      T01AP3_A11165Nof_sa6 = new String[] {""} ;
      T01AP3_n11165Nof_sa6 = new boolean[] {false} ;
      T01AP3_A11166Nof_c10 = new String[] {""} ;
      T01AP3_n11166Nof_c10 = new boolean[] {false} ;
      T01AP3_A11167Nof_stk = new String[] {""} ;
      T01AP3_n11167Nof_stk = new boolean[] {false} ;
      T01AP3_A11168Nof_Lbta = new String[] {""} ;
      T01AP3_n11168Nof_Lbta = new boolean[] {false} ;
      T01AP3_A11169Nof_Lbtp = new short[1] ;
      T01AP3_n11169Nof_Lbtp = new boolean[] {false} ;
      T01AP3_A11170Nof_c11 = new String[] {""} ;
      T01AP3_n11170Nof_c11 = new boolean[] {false} ;
      T01AP3_A11171Nof_c12 = new String[] {""} ;
      T01AP3_n11171Nof_c12 = new boolean[] {false} ;
      T01AP3_A11388Nof_imp1 = new String[] {""} ;
      T01AP3_n11388Nof_imp1 = new boolean[] {false} ;
      T01AP3_A11389Nof_imp2 = new String[] {""} ;
      T01AP3_n11389Nof_imp2 = new boolean[] {false} ;
      T01AP3_A11390Nof_imp3 = new String[] {""} ;
      T01AP3_n11390Nof_imp3 = new boolean[] {false} ;
      T01AP3_A11391Nof_imp4 = new String[] {""} ;
      T01AP3_n11391Nof_imp4 = new boolean[] {false} ;
      T01AP3_A11392Nof_imp5 = new String[] {""} ;
      T01AP3_n11392Nof_imp5 = new boolean[] {false} ;
      T01AP3_A11393Nof_imp6 = new String[] {""} ;
      T01AP3_n11393Nof_imp6 = new boolean[] {false} ;
      T01AP3_A11394Nof_imp7 = new String[] {""} ;
      T01AP3_n11394Nof_imp7 = new boolean[] {false} ;
      T01AP3_A11395Nof_imp8 = new String[] {""} ;
      T01AP3_n11395Nof_imp8 = new boolean[] {false} ;
      T01AP3_A11396Nof_imp9 = new String[] {""} ;
      T01AP3_n11396Nof_imp9 = new boolean[] {false} ;
      T01AP3_A11397Nof_imp10 = new String[] {""} ;
      T01AP3_n11397Nof_imp10 = new boolean[] {false} ;
      T01AP3_A11398Nof_imp11 = new String[] {""} ;
      T01AP3_n11398Nof_imp11 = new boolean[] {false} ;
      T01AP3_A11399Nof_lavado = new String[] {""} ;
      T01AP3_n11399Nof_lavado = new boolean[] {false} ;
      T01AP3_A11400Nof_luz = new String[] {""} ;
      T01AP3_n11400Nof_luz = new boolean[] {false} ;
      T01AP3_A11401Nof_sudor = new String[] {""} ;
      T01AP3_n11401Nof_sudor = new boolean[] {false} ;
      T01AP3_A11402Nof_cloro = new String[] {""} ;
      T01AP3_n11402Nof_cloro = new boolean[] {false} ;
      T01AP3_A11403Nof_aguam = new String[] {""} ;
      T01AP3_n11403Nof_aguam = new boolean[] {false} ;
      T01AP3_A11404Nof_termom = new String[] {""} ;
      T01AP3_n11404Nof_termom = new boolean[] {false} ;
      T01AP3_A11405Nof_humeda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AP3_n11405Nof_humeda = new boolean[] {false} ;
      T01AP3_A11406Nof_oekote = new String[] {""} ;
      T01AP3_n11406Nof_oekote = new boolean[] {false} ;
      T01AP3_A11418Nof_obs1 = new String[] {""} ;
      T01AP3_n11418Nof_obs1 = new boolean[] {false} ;
      T01AP3_A11419Nof_obs2 = new String[] {""} ;
      T01AP3_n11419Nof_obs2 = new boolean[] {false} ;
      T01AP3_A11420Nof_obs3 = new String[] {""} ;
      T01AP3_n11420Nof_obs3 = new boolean[] {false} ;
      T01AP3_A11421Nof_obs4 = new String[] {""} ;
      T01AP3_n11421Nof_obs4 = new boolean[] {false} ;
      T01AP3_A11422Nof_obs5 = new String[] {""} ;
      T01AP3_n11422Nof_obs5 = new boolean[] {false} ;
      T01AP3_A11423Nof_obs6 = new String[] {""} ;
      T01AP3_n11423Nof_obs6 = new boolean[] {false} ;
      T01AP3_A11424Nof_obs7 = new String[] {""} ;
      T01AP3_n11424Nof_obs7 = new boolean[] {false} ;
      T01AP3_A11425Nof_obs8 = new String[] {""} ;
      T01AP3_n11425Nof_obs8 = new boolean[] {false} ;
      T01AP3_A11426Nof_obs9 = new String[] {""} ;
      T01AP3_n11426Nof_obs9 = new boolean[] {false} ;
      T01AP3_A11427Nof_obs10 = new String[] {""} ;
      T01AP3_n11427Nof_obs10 = new boolean[] {false} ;
      T01AP3_A11428Nof_obs11 = new String[] {""} ;
      T01AP3_n11428Nof_obs11 = new boolean[] {false} ;
      sMode1483 = "" ;
      T01AP9_A396EmprCod = new String[] {""} ;
      T01AP9_A11103Nof_Hdr = new int[1] ;
      T01AP9_A11104Nof_r = new byte[1] ;
      T01AP9_A11105Nof_p = new String[] {""} ;
      T01AP10_A396EmprCod = new String[] {""} ;
      T01AP10_A11103Nof_Hdr = new int[1] ;
      T01AP10_A11104Nof_r = new byte[1] ;
      T01AP10_A11105Nof_p = new String[] {""} ;
      T01AP2_A11709Nof_nc = new byte[1] ;
      T01AP2_n11709Nof_nc = new boolean[] {false} ;
      T01AP2_A11710Nof_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AP2_n11710Nof_enc = new boolean[] {false} ;
      T01AP2_A396EmprCod = new String[] {""} ;
      T01AP2_A840TrnCod = new short[1] ;
      T01AP2_n840TrnCod = new boolean[] {false} ;
      T01AP2_A11103Nof_Hdr = new int[1] ;
      T01AP2_A11104Nof_r = new byte[1] ;
      T01AP2_A11105Nof_p = new String[] {""} ;
      T01AP2_A11106Nof_Pd = new String[] {""} ;
      T01AP2_n11106Nof_Pd = new boolean[] {false} ;
      T01AP2_A11107Nof_Mcot = new String[] {""} ;
      T01AP2_n11107Nof_Mcot = new boolean[] {false} ;
      T01AP2_A11108Nof_Pp = new String[] {""} ;
      T01AP2_n11108Nof_Pp = new boolean[] {false} ;
      T01AP2_A11109Nof_Ag = new String[] {""} ;
      T01AP2_n11109Nof_Ag = new boolean[] {false} ;
      T01AP2_A11110Nof_c1 = new String[] {""} ;
      T01AP2_n11110Nof_c1 = new boolean[] {false} ;
      T01AP2_A11111Nof_c2 = new String[] {""} ;
      T01AP2_n11111Nof_c2 = new boolean[] {false} ;
      T01AP2_A11112Nof_bo = new String[] {""} ;
      T01AP2_n11112Nof_bo = new boolean[] {false} ;
      T01AP2_A11113Nof_bob = new String[] {""} ;
      T01AP2_n11113Nof_bob = new boolean[] {false} ;
      T01AP2_A11114Nof_boe = new String[] {""} ;
      T01AP2_n11114Nof_boe = new boolean[] {false} ;
      T01AP2_A11115Nof_Bov = new String[] {""} ;
      T01AP2_n11115Nof_Bov = new boolean[] {false} ;
      T01AP2_A11116Nof_c3 = new String[] {""} ;
      T01AP2_n11116Nof_c3 = new boolean[] {false} ;
      T01AP2_A11117Nof_tns = new String[] {""} ;
      T01AP2_n11117Nof_tns = new boolean[] {false} ;
      T01AP2_A11118Nof_tnc = new String[] {""} ;
      T01AP2_n11118Nof_tnc = new boolean[] {false} ;
      T01AP2_A11119Nof_c4 = new String[] {""} ;
      T01AP2_n11119Nof_c4 = new boolean[] {false} ;
      T01AP2_A11120Nof_ct = new String[] {""} ;
      T01AP2_n11120Nof_ct = new boolean[] {false} ;
      T01AP2_A11121Nof_c5 = new String[] {""} ;
      T01AP2_n11121Nof_c5 = new boolean[] {false} ;
      T01AP2_A11122Nof_scs = new String[] {""} ;
      T01AP2_n11122Nof_scs = new boolean[] {false} ;
      T01AP2_A11123Nof_scc = new String[] {""} ;
      T01AP2_n11123Nof_scc = new boolean[] {false} ;
      T01AP2_A11124Nof_c6 = new String[] {""} ;
      T01AP2_n11124Nof_c6 = new boolean[] {false} ;
      T01AP2_A11125Nof_cctse = new String[] {""} ;
      T01AP2_n11125Nof_cctse = new boolean[] {false} ;
      T01AP2_A11126Nof_ccttp = new String[] {""} ;
      T01AP2_n11126Nof_ccttp = new boolean[] {false} ;
      T01AP2_A11127Nof_cctet = new String[] {""} ;
      T01AP2_n11127Nof_cctet = new boolean[] {false} ;
      T01AP2_A11128Nof_ccp = new byte[1] ;
      T01AP2_n11128Nof_ccp = new boolean[] {false} ;
      T01AP2_A11129Nof_cct = new byte[1] ;
      T01AP2_n11129Nof_cct = new boolean[] {false} ;
      T01AP2_A11130Nof_ccpc = new String[] {""} ;
      T01AP2_n11130Nof_ccpc = new boolean[] {false} ;
      T01AP2_A11131Nof_cctq = new String[] {""} ;
      T01AP2_n11131Nof_cctq = new boolean[] {false} ;
      T01AP2_A11132Nof_cccc = new String[] {""} ;
      T01AP2_n11132Nof_cccc = new boolean[] {false} ;
      T01AP2_A11133Nof_ccec = new String[] {""} ;
      T01AP2_n11133Nof_ccec = new boolean[] {false} ;
      T01AP2_A11134Nof_ccmc1 = new String[] {""} ;
      T01AP2_n11134Nof_ccmc1 = new boolean[] {false} ;
      T01AP2_A11135Nof_ccmc2 = new String[] {""} ;
      T01AP2_n11135Nof_ccmc2 = new boolean[] {false} ;
      T01AP2_A11136Nof_ccmc3 = new String[] {""} ;
      T01AP2_n11136Nof_ccmc3 = new boolean[] {false} ;
      T01AP2_A11137Nof_ccmc4 = new String[] {""} ;
      T01AP2_n11137Nof_ccmc4 = new boolean[] {false} ;
      T01AP2_A11138Nof_ccmc5 = new String[] {""} ;
      T01AP2_n11138Nof_ccmc5 = new boolean[] {false} ;
      T01AP2_A11139Nof_ccmc6 = new String[] {""} ;
      T01AP2_n11139Nof_ccmc6 = new boolean[] {false} ;
      T01AP2_A11140Nof_c7 = new String[] {""} ;
      T01AP2_n11140Nof_c7 = new boolean[] {false} ;
      T01AP2_A11141Nof_rb = new String[] {""} ;
      T01AP2_n11141Nof_rb = new boolean[] {false} ;
      T01AP2_A11142Nof_rbi = new String[] {""} ;
      T01AP2_n11142Nof_rbi = new boolean[] {false} ;
      T01AP2_A11143Nof_rbe = new String[] {""} ;
      T01AP2_n11143Nof_rbe = new boolean[] {false} ;
      T01AP2_A11144Nof_rbp = new String[] {""} ;
      T01AP2_n11144Nof_rbp = new boolean[] {false} ;
      T01AP2_A11145Nof_rboc = new short[1] ;
      T01AP2_n11145Nof_rboc = new boolean[] {false} ;
      T01AP2_A11146Nof_rb1 = new String[] {""} ;
      T01AP2_n11146Nof_rb1 = new boolean[] {false} ;
      T01AP2_A11147Nof_rb3 = new String[] {""} ;
      T01AP2_n11147Nof_rb3 = new boolean[] {false} ;
      T01AP2_A11148Nof_c8 = new String[] {""} ;
      T01AP2_n11148Nof_c8 = new boolean[] {false} ;
      T01AP2_A11149Nof_ep1 = new String[] {""} ;
      T01AP2_n11149Nof_ep1 = new boolean[] {false} ;
      T01AP2_A11150Nof_ep2 = new String[] {""} ;
      T01AP2_n11150Nof_ep2 = new boolean[] {false} ;
      T01AP2_A11151Nof_ep3 = new String[] {""} ;
      T01AP2_n11151Nof_ep3 = new boolean[] {false} ;
      T01AP2_A11152Nof_ep4 = new String[] {""} ;
      T01AP2_n11152Nof_ep4 = new boolean[] {false} ;
      T01AP2_A11153Nof_ep5 = new String[] {""} ;
      T01AP2_n11153Nof_ep5 = new boolean[] {false} ;
      T01AP2_A11154Nof_ep6 = new String[] {""} ;
      T01AP2_n11154Nof_ep6 = new boolean[] {false} ;
      T01AP2_A11155Nof_ep7 = new String[] {""} ;
      T01AP2_n11155Nof_ep7 = new boolean[] {false} ;
      T01AP2_A11156Nof_ep8 = new String[] {""} ;
      T01AP2_n11156Nof_ep8 = new boolean[] {false} ;
      T01AP2_A11157Nof_ep9 = new String[] {""} ;
      T01AP2_n11157Nof_ep9 = new boolean[] {false} ;
      T01AP2_A11158Nof_ep10 = new String[] {""} ;
      T01AP2_n11158Nof_ep10 = new boolean[] {false} ;
      T01AP2_A11159Nof_c9 = new String[] {""} ;
      T01AP2_n11159Nof_c9 = new boolean[] {false} ;
      T01AP2_A11160Nof_sa1 = new String[] {""} ;
      T01AP2_n11160Nof_sa1 = new boolean[] {false} ;
      T01AP2_A11161Nof_sa2 = new String[] {""} ;
      T01AP2_n11161Nof_sa2 = new boolean[] {false} ;
      T01AP2_A11162Nof_sa3 = new String[] {""} ;
      T01AP2_n11162Nof_sa3 = new boolean[] {false} ;
      T01AP2_A11163Nof_sa4 = new String[] {""} ;
      T01AP2_n11163Nof_sa4 = new boolean[] {false} ;
      T01AP2_A11164Nof_sa5 = new String[] {""} ;
      T01AP2_n11164Nof_sa5 = new boolean[] {false} ;
      T01AP2_A11165Nof_sa6 = new String[] {""} ;
      T01AP2_n11165Nof_sa6 = new boolean[] {false} ;
      T01AP2_A11166Nof_c10 = new String[] {""} ;
      T01AP2_n11166Nof_c10 = new boolean[] {false} ;
      T01AP2_A11167Nof_stk = new String[] {""} ;
      T01AP2_n11167Nof_stk = new boolean[] {false} ;
      T01AP2_A11168Nof_Lbta = new String[] {""} ;
      T01AP2_n11168Nof_Lbta = new boolean[] {false} ;
      T01AP2_A11169Nof_Lbtp = new short[1] ;
      T01AP2_n11169Nof_Lbtp = new boolean[] {false} ;
      T01AP2_A11170Nof_c11 = new String[] {""} ;
      T01AP2_n11170Nof_c11 = new boolean[] {false} ;
      T01AP2_A11171Nof_c12 = new String[] {""} ;
      T01AP2_n11171Nof_c12 = new boolean[] {false} ;
      T01AP2_A11388Nof_imp1 = new String[] {""} ;
      T01AP2_n11388Nof_imp1 = new boolean[] {false} ;
      T01AP2_A11389Nof_imp2 = new String[] {""} ;
      T01AP2_n11389Nof_imp2 = new boolean[] {false} ;
      T01AP2_A11390Nof_imp3 = new String[] {""} ;
      T01AP2_n11390Nof_imp3 = new boolean[] {false} ;
      T01AP2_A11391Nof_imp4 = new String[] {""} ;
      T01AP2_n11391Nof_imp4 = new boolean[] {false} ;
      T01AP2_A11392Nof_imp5 = new String[] {""} ;
      T01AP2_n11392Nof_imp5 = new boolean[] {false} ;
      T01AP2_A11393Nof_imp6 = new String[] {""} ;
      T01AP2_n11393Nof_imp6 = new boolean[] {false} ;
      T01AP2_A11394Nof_imp7 = new String[] {""} ;
      T01AP2_n11394Nof_imp7 = new boolean[] {false} ;
      T01AP2_A11395Nof_imp8 = new String[] {""} ;
      T01AP2_n11395Nof_imp8 = new boolean[] {false} ;
      T01AP2_A11396Nof_imp9 = new String[] {""} ;
      T01AP2_n11396Nof_imp9 = new boolean[] {false} ;
      T01AP2_A11397Nof_imp10 = new String[] {""} ;
      T01AP2_n11397Nof_imp10 = new boolean[] {false} ;
      T01AP2_A11398Nof_imp11 = new String[] {""} ;
      T01AP2_n11398Nof_imp11 = new boolean[] {false} ;
      T01AP2_A11399Nof_lavado = new String[] {""} ;
      T01AP2_n11399Nof_lavado = new boolean[] {false} ;
      T01AP2_A11400Nof_luz = new String[] {""} ;
      T01AP2_n11400Nof_luz = new boolean[] {false} ;
      T01AP2_A11401Nof_sudor = new String[] {""} ;
      T01AP2_n11401Nof_sudor = new boolean[] {false} ;
      T01AP2_A11402Nof_cloro = new String[] {""} ;
      T01AP2_n11402Nof_cloro = new boolean[] {false} ;
      T01AP2_A11403Nof_aguam = new String[] {""} ;
      T01AP2_n11403Nof_aguam = new boolean[] {false} ;
      T01AP2_A11404Nof_termom = new String[] {""} ;
      T01AP2_n11404Nof_termom = new boolean[] {false} ;
      T01AP2_A11405Nof_humeda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AP2_n11405Nof_humeda = new boolean[] {false} ;
      T01AP2_A11406Nof_oekote = new String[] {""} ;
      T01AP2_n11406Nof_oekote = new boolean[] {false} ;
      T01AP2_A11418Nof_obs1 = new String[] {""} ;
      T01AP2_n11418Nof_obs1 = new boolean[] {false} ;
      T01AP2_A11419Nof_obs2 = new String[] {""} ;
      T01AP2_n11419Nof_obs2 = new boolean[] {false} ;
      T01AP2_A11420Nof_obs3 = new String[] {""} ;
      T01AP2_n11420Nof_obs3 = new boolean[] {false} ;
      T01AP2_A11421Nof_obs4 = new String[] {""} ;
      T01AP2_n11421Nof_obs4 = new boolean[] {false} ;
      T01AP2_A11422Nof_obs5 = new String[] {""} ;
      T01AP2_n11422Nof_obs5 = new boolean[] {false} ;
      T01AP2_A11423Nof_obs6 = new String[] {""} ;
      T01AP2_n11423Nof_obs6 = new boolean[] {false} ;
      T01AP2_A11424Nof_obs7 = new String[] {""} ;
      T01AP2_n11424Nof_obs7 = new boolean[] {false} ;
      T01AP2_A11425Nof_obs8 = new String[] {""} ;
      T01AP2_n11425Nof_obs8 = new boolean[] {false} ;
      T01AP2_A11426Nof_obs9 = new String[] {""} ;
      T01AP2_n11426Nof_obs9 = new boolean[] {false} ;
      T01AP2_A11427Nof_obs10 = new String[] {""} ;
      T01AP2_n11427Nof_obs10 = new boolean[] {false} ;
      T01AP2_A11428Nof_obs11 = new String[] {""} ;
      T01AP2_n11428Nof_obs11 = new boolean[] {false} ;
      T01AP14_A396EmprCod = new String[] {""} ;
      T01AP14_A11103Nof_Hdr = new int[1] ;
      T01AP14_A11104Nof_r = new byte[1] ;
      T01AP14_A11105Nof_p = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11107Nof_Mcot = "" ;
      i11106Nof_Pd = "" ;
      i11108Nof_Pp = "" ;
      i11109Nof_Ag = "" ;
      i11112Nof_bo = "" ;
      i11113Nof_bob = "" ;
      i11114Nof_boe = "" ;
      i11117Nof_tns = "" ;
      i11118Nof_tnc = "" ;
      i11120Nof_ct = "" ;
      i11122Nof_scs = "" ;
      i11123Nof_scc = "" ;
      i11125Nof_cctse = "" ;
      i11126Nof_ccttp = "" ;
      i11127Nof_cctet = "" ;
      i11130Nof_ccpc = "" ;
      i11131Nof_cctq = "" ;
      i11132Nof_cccc = "" ;
      i11133Nof_ccec = "" ;
      i11134Nof_ccmc1 = "" ;
      i11135Nof_ccmc2 = "" ;
      i11136Nof_ccmc3 = "" ;
      i11137Nof_ccmc4 = "" ;
      i11138Nof_ccmc5 = "" ;
      i11139Nof_ccmc6 = "" ;
      i11141Nof_rb = "" ;
      i11143Nof_rbe = "" ;
      i11142Nof_rbi = "" ;
      i11144Nof_rbp = "" ;
      i11146Nof_rb1 = "" ;
      i11147Nof_rb3 = "" ;
      i11149Nof_ep1 = "" ;
      i11150Nof_ep2 = "" ;
      i11151Nof_ep3 = "" ;
      i11152Nof_ep4 = "" ;
      i11153Nof_ep5 = "" ;
      i11154Nof_ep6 = "" ;
      i11155Nof_ep7 = "" ;
      i11156Nof_ep8 = "" ;
      i11157Nof_ep9 = "" ;
      i11158Nof_ep10 = "" ;
      i11160Nof_sa1 = "" ;
      i11161Nof_sa2 = "" ;
      i11162Nof_sa3 = "" ;
      i11164Nof_sa5 = "" ;
      i11165Nof_sa6 = "" ;
      i11167Nof_stk = "" ;
      T01AP15_A407EmprNom = new String[] {""} ;
      T01AP15_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ11105Nof_p = "" ;
      ZZ407EmprNom = "" ;
      ZZ11106Nof_Pd = "" ;
      ZZ11107Nof_Mcot = "" ;
      ZZ11108Nof_Pp = "" ;
      ZZ11109Nof_Ag = "" ;
      ZZ11110Nof_c1 = "" ;
      ZZ11111Nof_c2 = "" ;
      ZZ11112Nof_bo = "" ;
      ZZ11113Nof_bob = "" ;
      ZZ11114Nof_boe = "" ;
      ZZ11115Nof_Bov = "" ;
      ZZ11116Nof_c3 = "" ;
      ZZ11117Nof_tns = "" ;
      ZZ11118Nof_tnc = "" ;
      ZZ11119Nof_c4 = "" ;
      ZZ11120Nof_ct = "" ;
      ZZ11121Nof_c5 = "" ;
      ZZ11122Nof_scs = "" ;
      ZZ11123Nof_scc = "" ;
      ZZ11124Nof_c6 = "" ;
      ZZ11125Nof_cctse = "" ;
      ZZ11126Nof_ccttp = "" ;
      ZZ11127Nof_cctet = "" ;
      ZZ11130Nof_ccpc = "" ;
      ZZ11131Nof_cctq = "" ;
      ZZ11132Nof_cccc = "" ;
      ZZ11133Nof_ccec = "" ;
      ZZ11134Nof_ccmc1 = "" ;
      ZZ11135Nof_ccmc2 = "" ;
      ZZ11136Nof_ccmc3 = "" ;
      ZZ11137Nof_ccmc4 = "" ;
      ZZ11138Nof_ccmc5 = "" ;
      ZZ11139Nof_ccmc6 = "" ;
      ZZ11140Nof_c7 = "" ;
      ZZ11141Nof_rb = "" ;
      ZZ11142Nof_rbi = "" ;
      ZZ11143Nof_rbe = "" ;
      ZZ11144Nof_rbp = "" ;
      ZZ11146Nof_rb1 = "" ;
      ZZ11147Nof_rb3 = "" ;
      ZZ11148Nof_c8 = "" ;
      ZZ11149Nof_ep1 = "" ;
      ZZ11150Nof_ep2 = "" ;
      ZZ11151Nof_ep3 = "" ;
      ZZ11152Nof_ep4 = "" ;
      ZZ11153Nof_ep5 = "" ;
      ZZ11154Nof_ep6 = "" ;
      ZZ11155Nof_ep7 = "" ;
      ZZ11156Nof_ep8 = "" ;
      ZZ11157Nof_ep9 = "" ;
      ZZ11158Nof_ep10 = "" ;
      ZZ11159Nof_c9 = "" ;
      ZZ11160Nof_sa1 = "" ;
      ZZ11161Nof_sa2 = "" ;
      ZZ11162Nof_sa3 = "" ;
      ZZ11163Nof_sa4 = "" ;
      ZZ11164Nof_sa5 = "" ;
      ZZ11165Nof_sa6 = "" ;
      ZZ11166Nof_c10 = "" ;
      ZZ11167Nof_stk = "" ;
      ZZ11168Nof_Lbta = "" ;
      ZZ11170Nof_c11 = "" ;
      ZZ11171Nof_c12 = "" ;
      ZZ11388Nof_imp1 = "" ;
      ZZ11389Nof_imp2 = "" ;
      ZZ11390Nof_imp3 = "" ;
      ZZ11391Nof_imp4 = "" ;
      ZZ11392Nof_imp5 = "" ;
      ZZ11393Nof_imp6 = "" ;
      ZZ11394Nof_imp7 = "" ;
      ZZ11395Nof_imp8 = "" ;
      ZZ11396Nof_imp9 = "" ;
      ZZ11397Nof_imp10 = "" ;
      ZZ11398Nof_imp11 = "" ;
      ZZ11399Nof_lavado = "" ;
      ZZ11400Nof_luz = "" ;
      ZZ11401Nof_sudor = "" ;
      ZZ11402Nof_cloro = "" ;
      ZZ11403Nof_aguam = "" ;
      ZZ11404Nof_termom = "" ;
      ZZ11405Nof_humeda = DecimalUtil.ZERO ;
      ZZ11406Nof_oekote = "" ;
      ZZ11418Nof_obs1 = "" ;
      ZZ11419Nof_obs2 = "" ;
      ZZ11420Nof_obs3 = "" ;
      ZZ11421Nof_obs4 = "" ;
      ZZ11422Nof_obs5 = "" ;
      ZZ11423Nof_obs6 = "" ;
      ZZ11424Nof_obs7 = "" ;
      ZZ11425Nof_obs8 = "" ;
      ZZ11426Nof_obs9 = "" ;
      ZZ11427Nof_obs10 = "" ;
      ZZ11428Nof_obs11 = "" ;
      ZZ11710Nof_enc = DecimalUtil.ZERO ;
      T01AP16_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tnofart__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tnofart__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tnofart__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tnofart__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnofart__default(),
         new Object[] {
             new Object[] {
            T01AP2_A11709Nof_nc, T01AP2_n11709Nof_nc, T01AP2_A11710Nof_enc, T01AP2_n11710Nof_enc, T01AP2_A396EmprCod, T01AP2_A840TrnCod, T01AP2_n840TrnCod, T01AP2_A11103Nof_Hdr, T01AP2_A11104Nof_r, T01AP2_A11105Nof_p,
            T01AP2_A11106Nof_Pd, T01AP2_n11106Nof_Pd, T01AP2_A11107Nof_Mcot, T01AP2_n11107Nof_Mcot, T01AP2_A11108Nof_Pp, T01AP2_n11108Nof_Pp, T01AP2_A11109Nof_Ag, T01AP2_n11109Nof_Ag, T01AP2_A11110Nof_c1, T01AP2_n11110Nof_c1,
            T01AP2_A11111Nof_c2, T01AP2_n11111Nof_c2, T01AP2_A11112Nof_bo, T01AP2_n11112Nof_bo, T01AP2_A11113Nof_bob, T01AP2_n11113Nof_bob, T01AP2_A11114Nof_boe, T01AP2_n11114Nof_boe, T01AP2_A11115Nof_Bov, T01AP2_n11115Nof_Bov,
            T01AP2_A11116Nof_c3, T01AP2_n11116Nof_c3, T01AP2_A11117Nof_tns, T01AP2_n11117Nof_tns, T01AP2_A11118Nof_tnc, T01AP2_n11118Nof_tnc, T01AP2_A11119Nof_c4, T01AP2_n11119Nof_c4, T01AP2_A11120Nof_ct, T01AP2_n11120Nof_ct,
            T01AP2_A11121Nof_c5, T01AP2_n11121Nof_c5, T01AP2_A11122Nof_scs, T01AP2_n11122Nof_scs, T01AP2_A11123Nof_scc, T01AP2_n11123Nof_scc, T01AP2_A11124Nof_c6, T01AP2_n11124Nof_c6, T01AP2_A11125Nof_cctse, T01AP2_n11125Nof_cctse,
            T01AP2_A11126Nof_ccttp, T01AP2_n11126Nof_ccttp, T01AP2_A11127Nof_cctet, T01AP2_n11127Nof_cctet, T01AP2_A11128Nof_ccp, T01AP2_n11128Nof_ccp, T01AP2_A11129Nof_cct, T01AP2_n11129Nof_cct, T01AP2_A11130Nof_ccpc, T01AP2_n11130Nof_ccpc,
            T01AP2_A11131Nof_cctq, T01AP2_n11131Nof_cctq, T01AP2_A11132Nof_cccc, T01AP2_n11132Nof_cccc, T01AP2_A11133Nof_ccec, T01AP2_n11133Nof_ccec, T01AP2_A11134Nof_ccmc1, T01AP2_n11134Nof_ccmc1, T01AP2_A11135Nof_ccmc2, T01AP2_n11135Nof_ccmc2,
            T01AP2_A11136Nof_ccmc3, T01AP2_n11136Nof_ccmc3, T01AP2_A11137Nof_ccmc4, T01AP2_n11137Nof_ccmc4, T01AP2_A11138Nof_ccmc5, T01AP2_n11138Nof_ccmc5, T01AP2_A11139Nof_ccmc6, T01AP2_n11139Nof_ccmc6, T01AP2_A11140Nof_c7, T01AP2_n11140Nof_c7,
            T01AP2_A11141Nof_rb, T01AP2_n11141Nof_rb, T01AP2_A11142Nof_rbi, T01AP2_n11142Nof_rbi, T01AP2_A11143Nof_rbe, T01AP2_n11143Nof_rbe, T01AP2_A11144Nof_rbp, T01AP2_n11144Nof_rbp, T01AP2_A11145Nof_rboc, T01AP2_n11145Nof_rboc,
            T01AP2_A11146Nof_rb1, T01AP2_n11146Nof_rb1, T01AP2_A11147Nof_rb3, T01AP2_n11147Nof_rb3, T01AP2_A11148Nof_c8, T01AP2_n11148Nof_c8, T01AP2_A11149Nof_ep1, T01AP2_n11149Nof_ep1, T01AP2_A11150Nof_ep2, T01AP2_n11150Nof_ep2,
            T01AP2_A11151Nof_ep3, T01AP2_n11151Nof_ep3, T01AP2_A11152Nof_ep4, T01AP2_n11152Nof_ep4, T01AP2_A11153Nof_ep5, T01AP2_n11153Nof_ep5, T01AP2_A11154Nof_ep6, T01AP2_n11154Nof_ep6, T01AP2_A11155Nof_ep7, T01AP2_n11155Nof_ep7,
            T01AP2_A11156Nof_ep8, T01AP2_n11156Nof_ep8, T01AP2_A11157Nof_ep9, T01AP2_n11157Nof_ep9, T01AP2_A11158Nof_ep10, T01AP2_n11158Nof_ep10, T01AP2_A11159Nof_c9, T01AP2_n11159Nof_c9, T01AP2_A11160Nof_sa1, T01AP2_n11160Nof_sa1,
            T01AP2_A11161Nof_sa2, T01AP2_n11161Nof_sa2, T01AP2_A11162Nof_sa3, T01AP2_n11162Nof_sa3, T01AP2_A11163Nof_sa4, T01AP2_n11163Nof_sa4, T01AP2_A11164Nof_sa5, T01AP2_n11164Nof_sa5, T01AP2_A11165Nof_sa6, T01AP2_n11165Nof_sa6,
            T01AP2_A11166Nof_c10, T01AP2_n11166Nof_c10, T01AP2_A11167Nof_stk, T01AP2_n11167Nof_stk, T01AP2_A11168Nof_Lbta, T01AP2_n11168Nof_Lbta, T01AP2_A11169Nof_Lbtp, T01AP2_n11169Nof_Lbtp, T01AP2_A11170Nof_c11, T01AP2_n11170Nof_c11,
            T01AP2_A11171Nof_c12, T01AP2_n11171Nof_c12, T01AP2_A11388Nof_imp1, T01AP2_n11388Nof_imp1, T01AP2_A11389Nof_imp2, T01AP2_n11389Nof_imp2, T01AP2_A11390Nof_imp3, T01AP2_n11390Nof_imp3, T01AP2_A11391Nof_imp4, T01AP2_n11391Nof_imp4,
            T01AP2_A11392Nof_imp5, T01AP2_n11392Nof_imp5, T01AP2_A11393Nof_imp6, T01AP2_n11393Nof_imp6, T01AP2_A11394Nof_imp7, T01AP2_n11394Nof_imp7, T01AP2_A11395Nof_imp8, T01AP2_n11395Nof_imp8, T01AP2_A11396Nof_imp9, T01AP2_n11396Nof_imp9,
            T01AP2_A11397Nof_imp10, T01AP2_n11397Nof_imp10, T01AP2_A11398Nof_imp11, T01AP2_n11398Nof_imp11, T01AP2_A11399Nof_lavado, T01AP2_n11399Nof_lavado, T01AP2_A11400Nof_luz, T01AP2_n11400Nof_luz, T01AP2_A11401Nof_sudor, T01AP2_n11401Nof_sudor,
            T01AP2_A11402Nof_cloro, T01AP2_n11402Nof_cloro, T01AP2_A11403Nof_aguam, T01AP2_n11403Nof_aguam, T01AP2_A11404Nof_termom, T01AP2_n11404Nof_termom, T01AP2_A11405Nof_humeda, T01AP2_n11405Nof_humeda, T01AP2_A11406Nof_oekote, T01AP2_n11406Nof_oekote,
            T01AP2_A11418Nof_obs1, T01AP2_n11418Nof_obs1, T01AP2_A11419Nof_obs2, T01AP2_n11419Nof_obs2, T01AP2_A11420Nof_obs3, T01AP2_n11420Nof_obs3, T01AP2_A11421Nof_obs4, T01AP2_n11421Nof_obs4, T01AP2_A11422Nof_obs5, T01AP2_n11422Nof_obs5,
            T01AP2_A11423Nof_obs6, T01AP2_n11423Nof_obs6, T01AP2_A11424Nof_obs7, T01AP2_n11424Nof_obs7, T01AP2_A11425Nof_obs8, T01AP2_n11425Nof_obs8, T01AP2_A11426Nof_obs9, T01AP2_n11426Nof_obs9, T01AP2_A11427Nof_obs10, T01AP2_n11427Nof_obs10,
            T01AP2_A11428Nof_obs11, T01AP2_n11428Nof_obs11
            }
            , new Object[] {
            T01AP3_A11709Nof_nc, T01AP3_n11709Nof_nc, T01AP3_A11710Nof_enc, T01AP3_n11710Nof_enc, T01AP3_A396EmprCod, T01AP3_A840TrnCod, T01AP3_n840TrnCod, T01AP3_A11103Nof_Hdr, T01AP3_A11104Nof_r, T01AP3_A11105Nof_p,
            T01AP3_A11106Nof_Pd, T01AP3_n11106Nof_Pd, T01AP3_A11107Nof_Mcot, T01AP3_n11107Nof_Mcot, T01AP3_A11108Nof_Pp, T01AP3_n11108Nof_Pp, T01AP3_A11109Nof_Ag, T01AP3_n11109Nof_Ag, T01AP3_A11110Nof_c1, T01AP3_n11110Nof_c1,
            T01AP3_A11111Nof_c2, T01AP3_n11111Nof_c2, T01AP3_A11112Nof_bo, T01AP3_n11112Nof_bo, T01AP3_A11113Nof_bob, T01AP3_n11113Nof_bob, T01AP3_A11114Nof_boe, T01AP3_n11114Nof_boe, T01AP3_A11115Nof_Bov, T01AP3_n11115Nof_Bov,
            T01AP3_A11116Nof_c3, T01AP3_n11116Nof_c3, T01AP3_A11117Nof_tns, T01AP3_n11117Nof_tns, T01AP3_A11118Nof_tnc, T01AP3_n11118Nof_tnc, T01AP3_A11119Nof_c4, T01AP3_n11119Nof_c4, T01AP3_A11120Nof_ct, T01AP3_n11120Nof_ct,
            T01AP3_A11121Nof_c5, T01AP3_n11121Nof_c5, T01AP3_A11122Nof_scs, T01AP3_n11122Nof_scs, T01AP3_A11123Nof_scc, T01AP3_n11123Nof_scc, T01AP3_A11124Nof_c6, T01AP3_n11124Nof_c6, T01AP3_A11125Nof_cctse, T01AP3_n11125Nof_cctse,
            T01AP3_A11126Nof_ccttp, T01AP3_n11126Nof_ccttp, T01AP3_A11127Nof_cctet, T01AP3_n11127Nof_cctet, T01AP3_A11128Nof_ccp, T01AP3_n11128Nof_ccp, T01AP3_A11129Nof_cct, T01AP3_n11129Nof_cct, T01AP3_A11130Nof_ccpc, T01AP3_n11130Nof_ccpc,
            T01AP3_A11131Nof_cctq, T01AP3_n11131Nof_cctq, T01AP3_A11132Nof_cccc, T01AP3_n11132Nof_cccc, T01AP3_A11133Nof_ccec, T01AP3_n11133Nof_ccec, T01AP3_A11134Nof_ccmc1, T01AP3_n11134Nof_ccmc1, T01AP3_A11135Nof_ccmc2, T01AP3_n11135Nof_ccmc2,
            T01AP3_A11136Nof_ccmc3, T01AP3_n11136Nof_ccmc3, T01AP3_A11137Nof_ccmc4, T01AP3_n11137Nof_ccmc4, T01AP3_A11138Nof_ccmc5, T01AP3_n11138Nof_ccmc5, T01AP3_A11139Nof_ccmc6, T01AP3_n11139Nof_ccmc6, T01AP3_A11140Nof_c7, T01AP3_n11140Nof_c7,
            T01AP3_A11141Nof_rb, T01AP3_n11141Nof_rb, T01AP3_A11142Nof_rbi, T01AP3_n11142Nof_rbi, T01AP3_A11143Nof_rbe, T01AP3_n11143Nof_rbe, T01AP3_A11144Nof_rbp, T01AP3_n11144Nof_rbp, T01AP3_A11145Nof_rboc, T01AP3_n11145Nof_rboc,
            T01AP3_A11146Nof_rb1, T01AP3_n11146Nof_rb1, T01AP3_A11147Nof_rb3, T01AP3_n11147Nof_rb3, T01AP3_A11148Nof_c8, T01AP3_n11148Nof_c8, T01AP3_A11149Nof_ep1, T01AP3_n11149Nof_ep1, T01AP3_A11150Nof_ep2, T01AP3_n11150Nof_ep2,
            T01AP3_A11151Nof_ep3, T01AP3_n11151Nof_ep3, T01AP3_A11152Nof_ep4, T01AP3_n11152Nof_ep4, T01AP3_A11153Nof_ep5, T01AP3_n11153Nof_ep5, T01AP3_A11154Nof_ep6, T01AP3_n11154Nof_ep6, T01AP3_A11155Nof_ep7, T01AP3_n11155Nof_ep7,
            T01AP3_A11156Nof_ep8, T01AP3_n11156Nof_ep8, T01AP3_A11157Nof_ep9, T01AP3_n11157Nof_ep9, T01AP3_A11158Nof_ep10, T01AP3_n11158Nof_ep10, T01AP3_A11159Nof_c9, T01AP3_n11159Nof_c9, T01AP3_A11160Nof_sa1, T01AP3_n11160Nof_sa1,
            T01AP3_A11161Nof_sa2, T01AP3_n11161Nof_sa2, T01AP3_A11162Nof_sa3, T01AP3_n11162Nof_sa3, T01AP3_A11163Nof_sa4, T01AP3_n11163Nof_sa4, T01AP3_A11164Nof_sa5, T01AP3_n11164Nof_sa5, T01AP3_A11165Nof_sa6, T01AP3_n11165Nof_sa6,
            T01AP3_A11166Nof_c10, T01AP3_n11166Nof_c10, T01AP3_A11167Nof_stk, T01AP3_n11167Nof_stk, T01AP3_A11168Nof_Lbta, T01AP3_n11168Nof_Lbta, T01AP3_A11169Nof_Lbtp, T01AP3_n11169Nof_Lbtp, T01AP3_A11170Nof_c11, T01AP3_n11170Nof_c11,
            T01AP3_A11171Nof_c12, T01AP3_n11171Nof_c12, T01AP3_A11388Nof_imp1, T01AP3_n11388Nof_imp1, T01AP3_A11389Nof_imp2, T01AP3_n11389Nof_imp2, T01AP3_A11390Nof_imp3, T01AP3_n11390Nof_imp3, T01AP3_A11391Nof_imp4, T01AP3_n11391Nof_imp4,
            T01AP3_A11392Nof_imp5, T01AP3_n11392Nof_imp5, T01AP3_A11393Nof_imp6, T01AP3_n11393Nof_imp6, T01AP3_A11394Nof_imp7, T01AP3_n11394Nof_imp7, T01AP3_A11395Nof_imp8, T01AP3_n11395Nof_imp8, T01AP3_A11396Nof_imp9, T01AP3_n11396Nof_imp9,
            T01AP3_A11397Nof_imp10, T01AP3_n11397Nof_imp10, T01AP3_A11398Nof_imp11, T01AP3_n11398Nof_imp11, T01AP3_A11399Nof_lavado, T01AP3_n11399Nof_lavado, T01AP3_A11400Nof_luz, T01AP3_n11400Nof_luz, T01AP3_A11401Nof_sudor, T01AP3_n11401Nof_sudor,
            T01AP3_A11402Nof_cloro, T01AP3_n11402Nof_cloro, T01AP3_A11403Nof_aguam, T01AP3_n11403Nof_aguam, T01AP3_A11404Nof_termom, T01AP3_n11404Nof_termom, T01AP3_A11405Nof_humeda, T01AP3_n11405Nof_humeda, T01AP3_A11406Nof_oekote, T01AP3_n11406Nof_oekote,
            T01AP3_A11418Nof_obs1, T01AP3_n11418Nof_obs1, T01AP3_A11419Nof_obs2, T01AP3_n11419Nof_obs2, T01AP3_A11420Nof_obs3, T01AP3_n11420Nof_obs3, T01AP3_A11421Nof_obs4, T01AP3_n11421Nof_obs4, T01AP3_A11422Nof_obs5, T01AP3_n11422Nof_obs5,
            T01AP3_A11423Nof_obs6, T01AP3_n11423Nof_obs6, T01AP3_A11424Nof_obs7, T01AP3_n11424Nof_obs7, T01AP3_A11425Nof_obs8, T01AP3_n11425Nof_obs8, T01AP3_A11426Nof_obs9, T01AP3_n11426Nof_obs9, T01AP3_A11427Nof_obs10, T01AP3_n11427Nof_obs10,
            T01AP3_A11428Nof_obs11, T01AP3_n11428Nof_obs11
            }
            , new Object[] {
            T01AP4_A407EmprNom, T01AP4_n407EmprNom
            }
            , new Object[] {
            T01AP5_A396EmprCod
            }
            , new Object[] {
            T01AP6_A11709Nof_nc, T01AP6_n11709Nof_nc, T01AP6_A11710Nof_enc, T01AP6_n11710Nof_enc, T01AP6_A396EmprCod, T01AP6_A840TrnCod, T01AP6_n840TrnCod, T01AP6_A11103Nof_Hdr, T01AP6_A11104Nof_r, T01AP6_A11105Nof_p,
            T01AP6_A407EmprNom, T01AP6_n407EmprNom, T01AP6_A11106Nof_Pd, T01AP6_n11106Nof_Pd, T01AP6_A11107Nof_Mcot, T01AP6_n11107Nof_Mcot, T01AP6_A11108Nof_Pp, T01AP6_n11108Nof_Pp, T01AP6_A11109Nof_Ag, T01AP6_n11109Nof_Ag,
            T01AP6_A11110Nof_c1, T01AP6_n11110Nof_c1, T01AP6_A11111Nof_c2, T01AP6_n11111Nof_c2, T01AP6_A11112Nof_bo, T01AP6_n11112Nof_bo, T01AP6_A11113Nof_bob, T01AP6_n11113Nof_bob, T01AP6_A11114Nof_boe, T01AP6_n11114Nof_boe,
            T01AP6_A11115Nof_Bov, T01AP6_n11115Nof_Bov, T01AP6_A11116Nof_c3, T01AP6_n11116Nof_c3, T01AP6_A11117Nof_tns, T01AP6_n11117Nof_tns, T01AP6_A11118Nof_tnc, T01AP6_n11118Nof_tnc, T01AP6_A11119Nof_c4, T01AP6_n11119Nof_c4,
            T01AP6_A11120Nof_ct, T01AP6_n11120Nof_ct, T01AP6_A11121Nof_c5, T01AP6_n11121Nof_c5, T01AP6_A11122Nof_scs, T01AP6_n11122Nof_scs, T01AP6_A11123Nof_scc, T01AP6_n11123Nof_scc, T01AP6_A11124Nof_c6, T01AP6_n11124Nof_c6,
            T01AP6_A11125Nof_cctse, T01AP6_n11125Nof_cctse, T01AP6_A11126Nof_ccttp, T01AP6_n11126Nof_ccttp, T01AP6_A11127Nof_cctet, T01AP6_n11127Nof_cctet, T01AP6_A11128Nof_ccp, T01AP6_n11128Nof_ccp, T01AP6_A11129Nof_cct, T01AP6_n11129Nof_cct,
            T01AP6_A11130Nof_ccpc, T01AP6_n11130Nof_ccpc, T01AP6_A11131Nof_cctq, T01AP6_n11131Nof_cctq, T01AP6_A11132Nof_cccc, T01AP6_n11132Nof_cccc, T01AP6_A11133Nof_ccec, T01AP6_n11133Nof_ccec, T01AP6_A11134Nof_ccmc1, T01AP6_n11134Nof_ccmc1,
            T01AP6_A11135Nof_ccmc2, T01AP6_n11135Nof_ccmc2, T01AP6_A11136Nof_ccmc3, T01AP6_n11136Nof_ccmc3, T01AP6_A11137Nof_ccmc4, T01AP6_n11137Nof_ccmc4, T01AP6_A11138Nof_ccmc5, T01AP6_n11138Nof_ccmc5, T01AP6_A11139Nof_ccmc6, T01AP6_n11139Nof_ccmc6,
            T01AP6_A11140Nof_c7, T01AP6_n11140Nof_c7, T01AP6_A11141Nof_rb, T01AP6_n11141Nof_rb, T01AP6_A11142Nof_rbi, T01AP6_n11142Nof_rbi, T01AP6_A11143Nof_rbe, T01AP6_n11143Nof_rbe, T01AP6_A11144Nof_rbp, T01AP6_n11144Nof_rbp,
            T01AP6_A11145Nof_rboc, T01AP6_n11145Nof_rboc, T01AP6_A11146Nof_rb1, T01AP6_n11146Nof_rb1, T01AP6_A11147Nof_rb3, T01AP6_n11147Nof_rb3, T01AP6_A11148Nof_c8, T01AP6_n11148Nof_c8, T01AP6_A11149Nof_ep1, T01AP6_n11149Nof_ep1,
            T01AP6_A11150Nof_ep2, T01AP6_n11150Nof_ep2, T01AP6_A11151Nof_ep3, T01AP6_n11151Nof_ep3, T01AP6_A11152Nof_ep4, T01AP6_n11152Nof_ep4, T01AP6_A11153Nof_ep5, T01AP6_n11153Nof_ep5, T01AP6_A11154Nof_ep6, T01AP6_n11154Nof_ep6,
            T01AP6_A11155Nof_ep7, T01AP6_n11155Nof_ep7, T01AP6_A11156Nof_ep8, T01AP6_n11156Nof_ep8, T01AP6_A11157Nof_ep9, T01AP6_n11157Nof_ep9, T01AP6_A11158Nof_ep10, T01AP6_n11158Nof_ep10, T01AP6_A11159Nof_c9, T01AP6_n11159Nof_c9,
            T01AP6_A11160Nof_sa1, T01AP6_n11160Nof_sa1, T01AP6_A11161Nof_sa2, T01AP6_n11161Nof_sa2, T01AP6_A11162Nof_sa3, T01AP6_n11162Nof_sa3, T01AP6_A11163Nof_sa4, T01AP6_n11163Nof_sa4, T01AP6_A11164Nof_sa5, T01AP6_n11164Nof_sa5,
            T01AP6_A11165Nof_sa6, T01AP6_n11165Nof_sa6, T01AP6_A11166Nof_c10, T01AP6_n11166Nof_c10, T01AP6_A11167Nof_stk, T01AP6_n11167Nof_stk, T01AP6_A11168Nof_Lbta, T01AP6_n11168Nof_Lbta, T01AP6_A11169Nof_Lbtp, T01AP6_n11169Nof_Lbtp,
            T01AP6_A11170Nof_c11, T01AP6_n11170Nof_c11, T01AP6_A11171Nof_c12, T01AP6_n11171Nof_c12, T01AP6_A11388Nof_imp1, T01AP6_n11388Nof_imp1, T01AP6_A11389Nof_imp2, T01AP6_n11389Nof_imp2, T01AP6_A11390Nof_imp3, T01AP6_n11390Nof_imp3,
            T01AP6_A11391Nof_imp4, T01AP6_n11391Nof_imp4, T01AP6_A11392Nof_imp5, T01AP6_n11392Nof_imp5, T01AP6_A11393Nof_imp6, T01AP6_n11393Nof_imp6, T01AP6_A11394Nof_imp7, T01AP6_n11394Nof_imp7, T01AP6_A11395Nof_imp8, T01AP6_n11395Nof_imp8,
            T01AP6_A11396Nof_imp9, T01AP6_n11396Nof_imp9, T01AP6_A11397Nof_imp10, T01AP6_n11397Nof_imp10, T01AP6_A11398Nof_imp11, T01AP6_n11398Nof_imp11, T01AP6_A11399Nof_lavado, T01AP6_n11399Nof_lavado, T01AP6_A11400Nof_luz, T01AP6_n11400Nof_luz,
            T01AP6_A11401Nof_sudor, T01AP6_n11401Nof_sudor, T01AP6_A11402Nof_cloro, T01AP6_n11402Nof_cloro, T01AP6_A11403Nof_aguam, T01AP6_n11403Nof_aguam, T01AP6_A11404Nof_termom, T01AP6_n11404Nof_termom, T01AP6_A11405Nof_humeda, T01AP6_n11405Nof_humeda,
            T01AP6_A11406Nof_oekote, T01AP6_n11406Nof_oekote, T01AP6_A11418Nof_obs1, T01AP6_n11418Nof_obs1, T01AP6_A11419Nof_obs2, T01AP6_n11419Nof_obs2, T01AP6_A11420Nof_obs3, T01AP6_n11420Nof_obs3, T01AP6_A11421Nof_obs4, T01AP6_n11421Nof_obs4,
            T01AP6_A11422Nof_obs5, T01AP6_n11422Nof_obs5, T01AP6_A11423Nof_obs6, T01AP6_n11423Nof_obs6, T01AP6_A11424Nof_obs7, T01AP6_n11424Nof_obs7, T01AP6_A11425Nof_obs8, T01AP6_n11425Nof_obs8, T01AP6_A11426Nof_obs9, T01AP6_n11426Nof_obs9,
            T01AP6_A11427Nof_obs10, T01AP6_n11427Nof_obs10, T01AP6_A11428Nof_obs11, T01AP6_n11428Nof_obs11
            }
            , new Object[] {
            T01AP7_A396EmprCod
            }
            , new Object[] {
            T01AP8_A396EmprCod, T01AP8_A11103Nof_Hdr, T01AP8_A11104Nof_r, T01AP8_A11105Nof_p
            }
            , new Object[] {
            T01AP9_A396EmprCod, T01AP9_A11103Nof_Hdr, T01AP9_A11104Nof_r, T01AP9_A11105Nof_p
            }
            , new Object[] {
            T01AP10_A396EmprCod, T01AP10_A11103Nof_Hdr, T01AP10_A11104Nof_r, T01AP10_A11105Nof_p
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AP14_A396EmprCod, T01AP14_A11103Nof_Hdr, T01AP14_A11104Nof_r, T01AP14_A11105Nof_p
            }
            , new Object[] {
            T01AP15_A407EmprNom, T01AP15_n407EmprNom
            }
            , new Object[] {
            T01AP16_A396EmprCod
            }
         }
      );
      Z11105Nof_p = "" ;
      A11105Nof_p = "" ;
      Z11104Nof_r = (byte)(0) ;
      A11104Nof_r = (byte)(0) ;
      Z11103Nof_Hdr = 0 ;
      A11103Nof_Hdr = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TNOFART" ;
      Z11167Nof_stk = httpContext.getMessage( "N", "") ;
      n11167Nof_stk = false ;
      A11167Nof_stk = httpContext.getMessage( "N", "") ;
      n11167Nof_stk = false ;
      i11167Nof_stk = httpContext.getMessage( "N", "") ;
      n11167Nof_stk = false ;
      Z11165Nof_sa6 = httpContext.getMessage( "N", "") ;
      n11165Nof_sa6 = false ;
      A11165Nof_sa6 = httpContext.getMessage( "N", "") ;
      n11165Nof_sa6 = false ;
      i11165Nof_sa6 = httpContext.getMessage( "N", "") ;
      n11165Nof_sa6 = false ;
      Z11164Nof_sa5 = httpContext.getMessage( "N", "") ;
      n11164Nof_sa5 = false ;
      A11164Nof_sa5 = httpContext.getMessage( "N", "") ;
      n11164Nof_sa5 = false ;
      i11164Nof_sa5 = httpContext.getMessage( "N", "") ;
      n11164Nof_sa5 = false ;
      Z11162Nof_sa3 = httpContext.getMessage( "N", "") ;
      n11162Nof_sa3 = false ;
      A11162Nof_sa3 = httpContext.getMessage( "N", "") ;
      n11162Nof_sa3 = false ;
      i11162Nof_sa3 = httpContext.getMessage( "N", "") ;
      n11162Nof_sa3 = false ;
      Z11161Nof_sa2 = httpContext.getMessage( "N", "") ;
      n11161Nof_sa2 = false ;
      A11161Nof_sa2 = httpContext.getMessage( "N", "") ;
      n11161Nof_sa2 = false ;
      i11161Nof_sa2 = httpContext.getMessage( "N", "") ;
      n11161Nof_sa2 = false ;
      Z11160Nof_sa1 = httpContext.getMessage( "N", "") ;
      n11160Nof_sa1 = false ;
      A11160Nof_sa1 = httpContext.getMessage( "N", "") ;
      n11160Nof_sa1 = false ;
      i11160Nof_sa1 = httpContext.getMessage( "N", "") ;
      n11160Nof_sa1 = false ;
      Z11158Nof_ep10 = httpContext.getMessage( "N", "") ;
      n11158Nof_ep10 = false ;
      A11158Nof_ep10 = httpContext.getMessage( "N", "") ;
      n11158Nof_ep10 = false ;
      i11158Nof_ep10 = httpContext.getMessage( "N", "") ;
      n11158Nof_ep10 = false ;
      Z11157Nof_ep9 = httpContext.getMessage( "N", "") ;
      n11157Nof_ep9 = false ;
      A11157Nof_ep9 = httpContext.getMessage( "N", "") ;
      n11157Nof_ep9 = false ;
      i11157Nof_ep9 = httpContext.getMessage( "N", "") ;
      n11157Nof_ep9 = false ;
      Z11156Nof_ep8 = httpContext.getMessage( "N", "") ;
      n11156Nof_ep8 = false ;
      A11156Nof_ep8 = httpContext.getMessage( "N", "") ;
      n11156Nof_ep8 = false ;
      i11156Nof_ep8 = httpContext.getMessage( "N", "") ;
      n11156Nof_ep8 = false ;
      Z11155Nof_ep7 = httpContext.getMessage( "N", "") ;
      n11155Nof_ep7 = false ;
      A11155Nof_ep7 = httpContext.getMessage( "N", "") ;
      n11155Nof_ep7 = false ;
      i11155Nof_ep7 = httpContext.getMessage( "N", "") ;
      n11155Nof_ep7 = false ;
      Z11154Nof_ep6 = httpContext.getMessage( "N", "") ;
      n11154Nof_ep6 = false ;
      A11154Nof_ep6 = httpContext.getMessage( "N", "") ;
      n11154Nof_ep6 = false ;
      i11154Nof_ep6 = httpContext.getMessage( "N", "") ;
      n11154Nof_ep6 = false ;
      Z11153Nof_ep5 = httpContext.getMessage( "N", "") ;
      n11153Nof_ep5 = false ;
      A11153Nof_ep5 = httpContext.getMessage( "N", "") ;
      n11153Nof_ep5 = false ;
      i11153Nof_ep5 = httpContext.getMessage( "N", "") ;
      n11153Nof_ep5 = false ;
      Z11152Nof_ep4 = httpContext.getMessage( "N", "") ;
      n11152Nof_ep4 = false ;
      A11152Nof_ep4 = httpContext.getMessage( "N", "") ;
      n11152Nof_ep4 = false ;
      i11152Nof_ep4 = httpContext.getMessage( "N", "") ;
      n11152Nof_ep4 = false ;
      Z11151Nof_ep3 = httpContext.getMessage( "N", "") ;
      n11151Nof_ep3 = false ;
      A11151Nof_ep3 = httpContext.getMessage( "N", "") ;
      n11151Nof_ep3 = false ;
      i11151Nof_ep3 = httpContext.getMessage( "N", "") ;
      n11151Nof_ep3 = false ;
      Z11150Nof_ep2 = httpContext.getMessage( "N", "") ;
      n11150Nof_ep2 = false ;
      A11150Nof_ep2 = httpContext.getMessage( "N", "") ;
      n11150Nof_ep2 = false ;
      i11150Nof_ep2 = httpContext.getMessage( "N", "") ;
      n11150Nof_ep2 = false ;
      Z11149Nof_ep1 = httpContext.getMessage( "N", "") ;
      n11149Nof_ep1 = false ;
      A11149Nof_ep1 = httpContext.getMessage( "N", "") ;
      n11149Nof_ep1 = false ;
      i11149Nof_ep1 = httpContext.getMessage( "N", "") ;
      n11149Nof_ep1 = false ;
      Z11147Nof_rb3 = httpContext.getMessage( "N", "") ;
      n11147Nof_rb3 = false ;
      A11147Nof_rb3 = httpContext.getMessage( "N", "") ;
      n11147Nof_rb3 = false ;
      i11147Nof_rb3 = httpContext.getMessage( "N", "") ;
      n11147Nof_rb3 = false ;
      Z11146Nof_rb1 = httpContext.getMessage( "N", "") ;
      n11146Nof_rb1 = false ;
      A11146Nof_rb1 = httpContext.getMessage( "N", "") ;
      n11146Nof_rb1 = false ;
      i11146Nof_rb1 = httpContext.getMessage( "N", "") ;
      n11146Nof_rb1 = false ;
      Z11144Nof_rbp = httpContext.getMessage( "N", "") ;
      n11144Nof_rbp = false ;
      A11144Nof_rbp = httpContext.getMessage( "N", "") ;
      n11144Nof_rbp = false ;
      i11144Nof_rbp = httpContext.getMessage( "N", "") ;
      n11144Nof_rbp = false ;
      Z11142Nof_rbi = httpContext.getMessage( "N", "") ;
      n11142Nof_rbi = false ;
      A11142Nof_rbi = httpContext.getMessage( "N", "") ;
      n11142Nof_rbi = false ;
      i11142Nof_rbi = httpContext.getMessage( "N", "") ;
      n11142Nof_rbi = false ;
      Z11143Nof_rbe = httpContext.getMessage( "N", "") ;
      n11143Nof_rbe = false ;
      A11143Nof_rbe = httpContext.getMessage( "N", "") ;
      n11143Nof_rbe = false ;
      i11143Nof_rbe = httpContext.getMessage( "N", "") ;
      n11143Nof_rbe = false ;
      Z11141Nof_rb = httpContext.getMessage( "N", "") ;
      n11141Nof_rb = false ;
      A11141Nof_rb = httpContext.getMessage( "N", "") ;
      n11141Nof_rb = false ;
      i11141Nof_rb = httpContext.getMessage( "N", "") ;
      n11141Nof_rb = false ;
      Z11139Nof_ccmc6 = httpContext.getMessage( "N", "") ;
      n11139Nof_ccmc6 = false ;
      A11139Nof_ccmc6 = httpContext.getMessage( "N", "") ;
      n11139Nof_ccmc6 = false ;
      i11139Nof_ccmc6 = httpContext.getMessage( "N", "") ;
      n11139Nof_ccmc6 = false ;
      Z11138Nof_ccmc5 = httpContext.getMessage( "N", "") ;
      n11138Nof_ccmc5 = false ;
      A11138Nof_ccmc5 = httpContext.getMessage( "N", "") ;
      n11138Nof_ccmc5 = false ;
      i11138Nof_ccmc5 = httpContext.getMessage( "N", "") ;
      n11138Nof_ccmc5 = false ;
      Z11137Nof_ccmc4 = httpContext.getMessage( "N", "") ;
      n11137Nof_ccmc4 = false ;
      A11137Nof_ccmc4 = httpContext.getMessage( "N", "") ;
      n11137Nof_ccmc4 = false ;
      i11137Nof_ccmc4 = httpContext.getMessage( "N", "") ;
      n11137Nof_ccmc4 = false ;
      Z11136Nof_ccmc3 = httpContext.getMessage( "N", "") ;
      n11136Nof_ccmc3 = false ;
      A11136Nof_ccmc3 = httpContext.getMessage( "N", "") ;
      n11136Nof_ccmc3 = false ;
      i11136Nof_ccmc3 = httpContext.getMessage( "N", "") ;
      n11136Nof_ccmc3 = false ;
      Z11135Nof_ccmc2 = httpContext.getMessage( "N", "") ;
      n11135Nof_ccmc2 = false ;
      A11135Nof_ccmc2 = httpContext.getMessage( "N", "") ;
      n11135Nof_ccmc2 = false ;
      i11135Nof_ccmc2 = httpContext.getMessage( "N", "") ;
      n11135Nof_ccmc2 = false ;
      Z11134Nof_ccmc1 = httpContext.getMessage( "N", "") ;
      n11134Nof_ccmc1 = false ;
      A11134Nof_ccmc1 = httpContext.getMessage( "N", "") ;
      n11134Nof_ccmc1 = false ;
      i11134Nof_ccmc1 = httpContext.getMessage( "N", "") ;
      n11134Nof_ccmc1 = false ;
      Z11133Nof_ccec = httpContext.getMessage( "N", "") ;
      n11133Nof_ccec = false ;
      A11133Nof_ccec = httpContext.getMessage( "N", "") ;
      n11133Nof_ccec = false ;
      i11133Nof_ccec = httpContext.getMessage( "N", "") ;
      n11133Nof_ccec = false ;
      Z11132Nof_cccc = httpContext.getMessage( "N", "") ;
      n11132Nof_cccc = false ;
      A11132Nof_cccc = httpContext.getMessage( "N", "") ;
      n11132Nof_cccc = false ;
      i11132Nof_cccc = httpContext.getMessage( "N", "") ;
      n11132Nof_cccc = false ;
      Z11131Nof_cctq = httpContext.getMessage( "N", "") ;
      n11131Nof_cctq = false ;
      A11131Nof_cctq = httpContext.getMessage( "N", "") ;
      n11131Nof_cctq = false ;
      i11131Nof_cctq = httpContext.getMessage( "N", "") ;
      n11131Nof_cctq = false ;
      Z11130Nof_ccpc = httpContext.getMessage( "N", "") ;
      n11130Nof_ccpc = false ;
      A11130Nof_ccpc = httpContext.getMessage( "N", "") ;
      n11130Nof_ccpc = false ;
      i11130Nof_ccpc = httpContext.getMessage( "N", "") ;
      n11130Nof_ccpc = false ;
      Z11127Nof_cctet = httpContext.getMessage( "N", "") ;
      n11127Nof_cctet = false ;
      A11127Nof_cctet = httpContext.getMessage( "N", "") ;
      n11127Nof_cctet = false ;
      i11127Nof_cctet = httpContext.getMessage( "N", "") ;
      n11127Nof_cctet = false ;
      Z11126Nof_ccttp = httpContext.getMessage( "N", "") ;
      n11126Nof_ccttp = false ;
      A11126Nof_ccttp = httpContext.getMessage( "N", "") ;
      n11126Nof_ccttp = false ;
      i11126Nof_ccttp = httpContext.getMessage( "N", "") ;
      n11126Nof_ccttp = false ;
      Z11125Nof_cctse = httpContext.getMessage( "N", "") ;
      n11125Nof_cctse = false ;
      A11125Nof_cctse = httpContext.getMessage( "N", "") ;
      n11125Nof_cctse = false ;
      i11125Nof_cctse = httpContext.getMessage( "N", "") ;
      n11125Nof_cctse = false ;
      Z11123Nof_scc = httpContext.getMessage( "N", "") ;
      n11123Nof_scc = false ;
      A11123Nof_scc = httpContext.getMessage( "N", "") ;
      n11123Nof_scc = false ;
      i11123Nof_scc = httpContext.getMessage( "N", "") ;
      n11123Nof_scc = false ;
      Z11122Nof_scs = httpContext.getMessage( "N", "") ;
      n11122Nof_scs = false ;
      A11122Nof_scs = httpContext.getMessage( "N", "") ;
      n11122Nof_scs = false ;
      i11122Nof_scs = httpContext.getMessage( "N", "") ;
      n11122Nof_scs = false ;
      Z11120Nof_ct = httpContext.getMessage( "N", "") ;
      n11120Nof_ct = false ;
      A11120Nof_ct = httpContext.getMessage( "N", "") ;
      n11120Nof_ct = false ;
      i11120Nof_ct = httpContext.getMessage( "N", "") ;
      n11120Nof_ct = false ;
      Z11118Nof_tnc = httpContext.getMessage( "N", "") ;
      n11118Nof_tnc = false ;
      A11118Nof_tnc = httpContext.getMessage( "N", "") ;
      n11118Nof_tnc = false ;
      i11118Nof_tnc = httpContext.getMessage( "N", "") ;
      n11118Nof_tnc = false ;
      Z11117Nof_tns = httpContext.getMessage( "N", "") ;
      n11117Nof_tns = false ;
      A11117Nof_tns = httpContext.getMessage( "N", "") ;
      n11117Nof_tns = false ;
      i11117Nof_tns = httpContext.getMessage( "N", "") ;
      n11117Nof_tns = false ;
      Z11114Nof_boe = httpContext.getMessage( "N", "") ;
      n11114Nof_boe = false ;
      A11114Nof_boe = httpContext.getMessage( "N", "") ;
      n11114Nof_boe = false ;
      i11114Nof_boe = httpContext.getMessage( "N", "") ;
      n11114Nof_boe = false ;
      Z11113Nof_bob = httpContext.getMessage( "N", "") ;
      n11113Nof_bob = false ;
      A11113Nof_bob = httpContext.getMessage( "N", "") ;
      n11113Nof_bob = false ;
      i11113Nof_bob = httpContext.getMessage( "N", "") ;
      n11113Nof_bob = false ;
      Z11112Nof_bo = httpContext.getMessage( "N", "") ;
      n11112Nof_bo = false ;
      A11112Nof_bo = httpContext.getMessage( "N", "") ;
      n11112Nof_bo = false ;
      i11112Nof_bo = httpContext.getMessage( "N", "") ;
      n11112Nof_bo = false ;
      Z11109Nof_Ag = httpContext.getMessage( "N", "") ;
      n11109Nof_Ag = false ;
      A11109Nof_Ag = httpContext.getMessage( "N", "") ;
      n11109Nof_Ag = false ;
      i11109Nof_Ag = httpContext.getMessage( "N", "") ;
      n11109Nof_Ag = false ;
      Z11108Nof_Pp = httpContext.getMessage( "N", "") ;
      n11108Nof_Pp = false ;
      A11108Nof_Pp = httpContext.getMessage( "N", "") ;
      n11108Nof_Pp = false ;
      i11108Nof_Pp = httpContext.getMessage( "N", "") ;
      n11108Nof_Pp = false ;
      Z11106Nof_Pd = httpContext.getMessage( "N", "") ;
      n11106Nof_Pd = false ;
      A11106Nof_Pd = httpContext.getMessage( "N", "") ;
      n11106Nof_Pd = false ;
      i11106Nof_Pd = httpContext.getMessage( "N", "") ;
      n11106Nof_Pd = false ;
      Z11107Nof_Mcot = httpContext.getMessage( "N", "") ;
      n11107Nof_Mcot = false ;
      A11107Nof_Mcot = httpContext.getMessage( "N", "") ;
      n11107Nof_Mcot = false ;
      i11107Nof_Mcot = httpContext.getMessage( "N", "") ;
      n11107Nof_Mcot = false ;
   }

   private byte wcpOA11104Nof_r ;
   private byte Z11104Nof_r ;
   private byte Z11128Nof_ccp ;
   private byte Z11129Nof_cct ;
   private byte Z11709Nof_nc ;
   private byte GxWebError ;
   private byte A11104Nof_r ;
   private byte nKeyPressed ;
   private byte A11128Nof_ccp ;
   private byte A11129Nof_cct ;
   private byte A11709Nof_nc ;
   private byte Gx_BScreen ;
   private byte GXv_int6[] ;
   private byte gxajaxcallmode ;
   private byte ZZ11104Nof_r ;
   private byte ZZ11128Nof_ccp ;
   private byte ZZ11129Nof_cct ;
   private byte ZZ11709Nof_nc ;
   private short Z11145Nof_rboc ;
   private short Z11169Nof_Lbtp ;
   private short Z840TrnCod ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11145Nof_rboc ;
   private short A11169Nof_Lbtp ;
   private short RcdFound1483 ;
   private short nIsDirty_1483 ;
   private short ZZ840TrnCod ;
   private short ZZ11145Nof_rboc ;
   private short ZZ11169Nof_Lbtp ;
   private int wcpOA11103Nof_Hdr ;
   private int Z11103Nof_Hdr ;
   private int A11103Nof_Hdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtNof_Hdr_Enabled ;
   private int edtNof_r_Enabled ;
   private int edtNof_p_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtNof_c1_Enabled ;
   private int edtNof_c2_Enabled ;
   private int edtNof_c3_Enabled ;
   private int edtNof_c4_Enabled ;
   private int edtNof_c5_Enabled ;
   private int edtNof_c6_Enabled ;
   private int edtNof_ccp_Enabled ;
   private int edtNof_cct_Enabled ;
   private int edtNof_c7_Enabled ;
   private int edtNof_rboc_Enabled ;
   private int edtNof_c8_Enabled ;
   private int edtNof_c9_Enabled ;
   private int edtNof_c10_Enabled ;
   private int edtNof_Lbta_Enabled ;
   private int edtNof_Lbtp_Enabled ;
   private int edtNof_c11_Enabled ;
   private int edtNof_c12_Enabled ;
   private int edtNof_imp1_Enabled ;
   private int edtNof_imp2_Enabled ;
   private int edtNof_imp3_Enabled ;
   private int edtNof_imp4_Enabled ;
   private int edtNof_imp5_Enabled ;
   private int edtNof_imp6_Enabled ;
   private int edtNof_imp7_Enabled ;
   private int edtNof_imp8_Enabled ;
   private int edtNof_imp9_Enabled ;
   private int edtNof_imp10_Enabled ;
   private int edtNof_imp11_Enabled ;
   private int edtNof_lavado_Enabled ;
   private int edtNof_luz_Enabled ;
   private int edtNof_sudor_Enabled ;
   private int edtNof_cloro_Enabled ;
   private int edtNof_aguam_Enabled ;
   private int edtNof_termom_Enabled ;
   private int edtNof_humeda_Enabled ;
   private int edtNof_oekote_Enabled ;
   private int edtNof_obs1_Enabled ;
   private int edtNof_obs2_Enabled ;
   private int edtNof_obs3_Enabled ;
   private int edtNof_obs4_Enabled ;
   private int edtNof_obs5_Enabled ;
   private int edtNof_obs6_Enabled ;
   private int edtNof_obs7_Enabled ;
   private int edtNof_obs8_Enabled ;
   private int edtNof_obs9_Enabled ;
   private int edtNof_obs10_Enabled ;
   private int edtNof_obs11_Enabled ;
   private int edtNof_nc_Enabled ;
   private int edtNof_enc_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int5[] ;
   private int GX_JID ;
   private int idxLst ;
   private int edtNof_enc_Backcolor ;
   private int edtNof_nc_Backcolor ;
   private int edtNof_obs11_Backcolor ;
   private int edtNof_obs10_Backcolor ;
   private int edtNof_obs9_Backcolor ;
   private int edtNof_obs8_Backcolor ;
   private int edtNof_obs7_Backcolor ;
   private int edtNof_obs6_Backcolor ;
   private int edtNof_obs5_Backcolor ;
   private int edtNof_obs4_Backcolor ;
   private int edtNof_obs3_Backcolor ;
   private int edtNof_obs2_Backcolor ;
   private int edtNof_obs1_Backcolor ;
   private int edtNof_oekote_Backcolor ;
   private int edtNof_humeda_Backcolor ;
   private int edtNof_termom_Backcolor ;
   private int edtNof_aguam_Backcolor ;
   private int edtNof_cloro_Backcolor ;
   private int edtNof_sudor_Backcolor ;
   private int edtNof_luz_Backcolor ;
   private int edtNof_lavado_Backcolor ;
   private int edtNof_imp11_Backcolor ;
   private int edtNof_imp10_Backcolor ;
   private int edtNof_imp9_Backcolor ;
   private int edtNof_imp8_Backcolor ;
   private int edtNof_imp7_Backcolor ;
   private int edtNof_imp6_Backcolor ;
   private int edtNof_imp5_Backcolor ;
   private int edtNof_imp4_Backcolor ;
   private int edtNof_imp3_Backcolor ;
   private int edtNof_imp2_Backcolor ;
   private int edtNof_imp1_Backcolor ;
   private int edtNof_c12_Backcolor ;
   private int edtNof_c11_Backcolor ;
   private int edtNof_Lbtp_Backcolor ;
   private int edtNof_Lbta_Backcolor ;
   private int edtNof_c10_Backcolor ;
   private int edtNof_c9_Backcolor ;
   private int edtNof_c8_Backcolor ;
   private int edtNof_rboc_Backcolor ;
   private int edtNof_c7_Backcolor ;
   private int edtNof_cct_Backcolor ;
   private int edtNof_ccp_Backcolor ;
   private int edtNof_c6_Backcolor ;
   private int edtNof_c5_Backcolor ;
   private int edtNof_c4_Backcolor ;
   private int edtNof_c3_Backcolor ;
   private int edtNof_c2_Backcolor ;
   private int edtNof_c1_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtNof_p_Backcolor ;
   private int edtNof_r_Backcolor ;
   private int edtNof_Hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11103Nof_Hdr ;
   private java.math.BigDecimal Z11405Nof_humeda ;
   private java.math.BigDecimal Z11710Nof_enc ;
   private java.math.BigDecimal A11405Nof_humeda ;
   private java.math.BigDecimal A11710Nof_enc ;
   private java.math.BigDecimal ZZ11405Nof_humeda ;
   private java.math.BigDecimal ZZ11710Nof_enc ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA11105Nof_p ;
   private String Z396EmprCod ;
   private String Z11105Nof_p ;
   private String Z11106Nof_Pd ;
   private String Z11107Nof_Mcot ;
   private String Z11108Nof_Pp ;
   private String Z11109Nof_Ag ;
   private String Z11112Nof_bo ;
   private String Z11113Nof_bob ;
   private String Z11114Nof_boe ;
   private String Z11115Nof_Bov ;
   private String Z11117Nof_tns ;
   private String Z11118Nof_tnc ;
   private String Z11120Nof_ct ;
   private String Z11122Nof_scs ;
   private String Z11123Nof_scc ;
   private String Z11125Nof_cctse ;
   private String Z11126Nof_ccttp ;
   private String Z11127Nof_cctet ;
   private String Z11130Nof_ccpc ;
   private String Z11131Nof_cctq ;
   private String Z11132Nof_cccc ;
   private String Z11133Nof_ccec ;
   private String Z11134Nof_ccmc1 ;
   private String Z11135Nof_ccmc2 ;
   private String Z11136Nof_ccmc3 ;
   private String Z11137Nof_ccmc4 ;
   private String Z11138Nof_ccmc5 ;
   private String Z11139Nof_ccmc6 ;
   private String Z11141Nof_rb ;
   private String Z11142Nof_rbi ;
   private String Z11143Nof_rbe ;
   private String Z11144Nof_rbp ;
   private String Z11146Nof_rb1 ;
   private String Z11147Nof_rb3 ;
   private String Z11149Nof_ep1 ;
   private String Z11150Nof_ep2 ;
   private String Z11151Nof_ep3 ;
   private String Z11152Nof_ep4 ;
   private String Z11153Nof_ep5 ;
   private String Z11154Nof_ep6 ;
   private String Z11155Nof_ep7 ;
   private String Z11156Nof_ep8 ;
   private String Z11157Nof_ep9 ;
   private String Z11158Nof_ep10 ;
   private String Z11160Nof_sa1 ;
   private String Z11161Nof_sa2 ;
   private String Z11162Nof_sa3 ;
   private String Z11163Nof_sa4 ;
   private String Z11164Nof_sa5 ;
   private String Z11165Nof_sa6 ;
   private String Z11167Nof_stk ;
   private String Z11168Nof_Lbta ;
   private String Z11388Nof_imp1 ;
   private String Z11389Nof_imp2 ;
   private String Z11390Nof_imp3 ;
   private String Z11391Nof_imp4 ;
   private String Z11392Nof_imp5 ;
   private String Z11393Nof_imp6 ;
   private String Z11394Nof_imp7 ;
   private String Z11395Nof_imp8 ;
   private String Z11396Nof_imp9 ;
   private String Z11397Nof_imp10 ;
   private String Z11398Nof_imp11 ;
   private String Z11399Nof_lavado ;
   private String Z11400Nof_luz ;
   private String Z11401Nof_sudor ;
   private String Z11402Nof_cloro ;
   private String Z11403Nof_aguam ;
   private String Z11404Nof_termom ;
   private String Z11406Nof_oekote ;
   private String Z11418Nof_obs1 ;
   private String Z11419Nof_obs2 ;
   private String Z11420Nof_obs3 ;
   private String Z11421Nof_obs4 ;
   private String Z11422Nof_obs5 ;
   private String Z11423Nof_obs6 ;
   private String Z11424Nof_obs7 ;
   private String Z11425Nof_obs8 ;
   private String Z11426Nof_obs9 ;
   private String Z11427Nof_obs10 ;
   private String Z11428Nof_obs11 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11105Nof_p ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String A11106Nof_Pd ;
   private String A11107Nof_Mcot ;
   private String A11108Nof_Pp ;
   private String A11109Nof_Ag ;
   private String A11112Nof_bo ;
   private String A11113Nof_bob ;
   private String A11114Nof_boe ;
   private String A11115Nof_Bov ;
   private String A11117Nof_tns ;
   private String A11118Nof_tnc ;
   private String A11120Nof_ct ;
   private String A11122Nof_scs ;
   private String A11123Nof_scc ;
   private String A11125Nof_cctse ;
   private String A11126Nof_ccttp ;
   private String A11127Nof_cctet ;
   private String A11130Nof_ccpc ;
   private String A11131Nof_cctq ;
   private String A11132Nof_cccc ;
   private String A11133Nof_ccec ;
   private String A11134Nof_ccmc1 ;
   private String A11135Nof_ccmc2 ;
   private String A11136Nof_ccmc3 ;
   private String A11137Nof_ccmc4 ;
   private String A11138Nof_ccmc5 ;
   private String A11139Nof_ccmc6 ;
   private String A11141Nof_rb ;
   private String A11142Nof_rbi ;
   private String A11143Nof_rbe ;
   private String A11144Nof_rbp ;
   private String A11146Nof_rb1 ;
   private String A11147Nof_rb3 ;
   private String A11149Nof_ep1 ;
   private String A11150Nof_ep2 ;
   private String A11151Nof_ep3 ;
   private String A11152Nof_ep4 ;
   private String A11153Nof_ep5 ;
   private String A11154Nof_ep6 ;
   private String A11155Nof_ep7 ;
   private String A11156Nof_ep8 ;
   private String A11157Nof_ep9 ;
   private String A11158Nof_ep10 ;
   private String A11160Nof_sa1 ;
   private String A11161Nof_sa2 ;
   private String A11162Nof_sa3 ;
   private String A11163Nof_sa4 ;
   private String A11164Nof_sa5 ;
   private String A11165Nof_sa6 ;
   private String A11167Nof_stk ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtNof_Hdr_Internalname ;
   private String edtNof_Hdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtNof_r_Internalname ;
   private String edtNof_r_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtNof_p_Internalname ;
   private String edtNof_p_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtNof_c1_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtNof_c2_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtNof_c3_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtNof_c4_Internalname ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtNof_c5_Internalname ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtNof_c6_Internalname ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtNof_ccp_Internalname ;
   private String edtNof_ccp_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtNof_cct_Internalname ;
   private String edtNof_cct_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtNof_c7_Internalname ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtNof_rboc_Internalname ;
   private String edtNof_rboc_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtNof_c8_Internalname ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtNof_c9_Internalname ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtNof_c10_Internalname ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtNof_Lbta_Internalname ;
   private String A11168Nof_Lbta ;
   private String edtNof_Lbta_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtNof_Lbtp_Internalname ;
   private String edtNof_Lbtp_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtNof_c11_Internalname ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtNof_c12_Internalname ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtNof_imp1_Internalname ;
   private String A11388Nof_imp1 ;
   private String edtNof_imp1_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtNof_imp2_Internalname ;
   private String A11389Nof_imp2 ;
   private String edtNof_imp2_Jsonclick ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock75_Jsonclick ;
   private String edtNof_imp3_Internalname ;
   private String A11390Nof_imp3 ;
   private String edtNof_imp3_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String edtNof_imp4_Internalname ;
   private String A11391Nof_imp4 ;
   private String edtNof_imp4_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String edtNof_imp5_Internalname ;
   private String A11392Nof_imp5 ;
   private String edtNof_imp5_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String edtNof_imp6_Internalname ;
   private String A11393Nof_imp6 ;
   private String edtNof_imp6_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtNof_imp7_Internalname ;
   private String A11394Nof_imp7 ;
   private String edtNof_imp7_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String edtNof_imp8_Internalname ;
   private String A11395Nof_imp8 ;
   private String edtNof_imp8_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String edtNof_imp9_Internalname ;
   private String A11396Nof_imp9 ;
   private String edtNof_imp9_Jsonclick ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock82_Jsonclick ;
   private String edtNof_imp10_Internalname ;
   private String A11397Nof_imp10 ;
   private String edtNof_imp10_Jsonclick ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock83_Jsonclick ;
   private String edtNof_imp11_Internalname ;
   private String A11398Nof_imp11 ;
   private String edtNof_imp11_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String edtNof_lavado_Internalname ;
   private String A11399Nof_lavado ;
   private String edtNof_lavado_Jsonclick ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String edtNof_luz_Internalname ;
   private String A11400Nof_luz ;
   private String edtNof_luz_Jsonclick ;
   private String lblTextblock86_Internalname ;
   private String lblTextblock86_Jsonclick ;
   private String edtNof_sudor_Internalname ;
   private String A11401Nof_sudor ;
   private String edtNof_sudor_Jsonclick ;
   private String lblTextblock87_Internalname ;
   private String lblTextblock87_Jsonclick ;
   private String edtNof_cloro_Internalname ;
   private String A11402Nof_cloro ;
   private String edtNof_cloro_Jsonclick ;
   private String lblTextblock88_Internalname ;
   private String lblTextblock88_Jsonclick ;
   private String edtNof_aguam_Internalname ;
   private String A11403Nof_aguam ;
   private String edtNof_aguam_Jsonclick ;
   private String lblTextblock89_Internalname ;
   private String lblTextblock89_Jsonclick ;
   private String edtNof_termom_Internalname ;
   private String A11404Nof_termom ;
   private String edtNof_termom_Jsonclick ;
   private String lblTextblock90_Internalname ;
   private String lblTextblock90_Jsonclick ;
   private String edtNof_humeda_Internalname ;
   private String edtNof_humeda_Jsonclick ;
   private String lblTextblock91_Internalname ;
   private String lblTextblock91_Jsonclick ;
   private String edtNof_oekote_Internalname ;
   private String A11406Nof_oekote ;
   private String edtNof_oekote_Jsonclick ;
   private String lblTextblock92_Internalname ;
   private String lblTextblock92_Jsonclick ;
   private String edtNof_obs1_Internalname ;
   private String A11418Nof_obs1 ;
   private String edtNof_obs1_Jsonclick ;
   private String lblTextblock93_Internalname ;
   private String lblTextblock93_Jsonclick ;
   private String edtNof_obs2_Internalname ;
   private String A11419Nof_obs2 ;
   private String edtNof_obs2_Jsonclick ;
   private String lblTextblock94_Internalname ;
   private String lblTextblock94_Jsonclick ;
   private String edtNof_obs3_Internalname ;
   private String A11420Nof_obs3 ;
   private String edtNof_obs3_Jsonclick ;
   private String lblTextblock95_Internalname ;
   private String lblTextblock95_Jsonclick ;
   private String edtNof_obs4_Internalname ;
   private String A11421Nof_obs4 ;
   private String edtNof_obs4_Jsonclick ;
   private String lblTextblock96_Internalname ;
   private String lblTextblock96_Jsonclick ;
   private String edtNof_obs5_Internalname ;
   private String A11422Nof_obs5 ;
   private String edtNof_obs5_Jsonclick ;
   private String lblTextblock97_Internalname ;
   private String lblTextblock97_Jsonclick ;
   private String edtNof_obs6_Internalname ;
   private String A11423Nof_obs6 ;
   private String edtNof_obs6_Jsonclick ;
   private String lblTextblock98_Internalname ;
   private String lblTextblock98_Jsonclick ;
   private String edtNof_obs7_Internalname ;
   private String A11424Nof_obs7 ;
   private String edtNof_obs7_Jsonclick ;
   private String lblTextblock99_Internalname ;
   private String lblTextblock99_Jsonclick ;
   private String edtNof_obs8_Internalname ;
   private String A11425Nof_obs8 ;
   private String edtNof_obs8_Jsonclick ;
   private String lblTextblock100_Internalname ;
   private String lblTextblock100_Jsonclick ;
   private String edtNof_obs9_Internalname ;
   private String A11426Nof_obs9 ;
   private String edtNof_obs9_Jsonclick ;
   private String lblTextblock101_Internalname ;
   private String lblTextblock101_Jsonclick ;
   private String edtNof_obs10_Internalname ;
   private String A11427Nof_obs10 ;
   private String edtNof_obs10_Jsonclick ;
   private String lblTextblock102_Internalname ;
   private String lblTextblock102_Jsonclick ;
   private String edtNof_obs11_Internalname ;
   private String A11428Nof_obs11 ;
   private String edtNof_obs11_Jsonclick ;
   private String lblTextblock103_Internalname ;
   private String lblTextblock103_Jsonclick ;
   private String edtNof_nc_Internalname ;
   private String edtNof_nc_Jsonclick ;
   private String lblTextblock104_Internalname ;
   private String lblTextblock104_Jsonclick ;
   private String edtNof_enc_Internalname ;
   private String edtNof_enc_Jsonclick ;
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
   private String Gx_mode ;
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String Z407EmprNom ;
   private String sMode1483 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11107Nof_Mcot ;
   private String i11106Nof_Pd ;
   private String i11108Nof_Pp ;
   private String i11109Nof_Ag ;
   private String i11112Nof_bo ;
   private String i11113Nof_bob ;
   private String i11114Nof_boe ;
   private String i11117Nof_tns ;
   private String i11118Nof_tnc ;
   private String i11120Nof_ct ;
   private String i11122Nof_scs ;
   private String i11123Nof_scc ;
   private String i11125Nof_cctse ;
   private String i11126Nof_ccttp ;
   private String i11127Nof_cctet ;
   private String i11130Nof_ccpc ;
   private String i11131Nof_cctq ;
   private String i11132Nof_cccc ;
   private String i11133Nof_ccec ;
   private String i11134Nof_ccmc1 ;
   private String i11135Nof_ccmc2 ;
   private String i11136Nof_ccmc3 ;
   private String i11137Nof_ccmc4 ;
   private String i11138Nof_ccmc5 ;
   private String i11139Nof_ccmc6 ;
   private String i11141Nof_rb ;
   private String i11143Nof_rbe ;
   private String i11142Nof_rbi ;
   private String i11144Nof_rbp ;
   private String i11146Nof_rb1 ;
   private String i11147Nof_rb3 ;
   private String i11149Nof_ep1 ;
   private String i11150Nof_ep2 ;
   private String i11151Nof_ep3 ;
   private String i11152Nof_ep4 ;
   private String i11153Nof_ep5 ;
   private String i11154Nof_ep6 ;
   private String i11155Nof_ep7 ;
   private String i11156Nof_ep8 ;
   private String i11157Nof_ep9 ;
   private String i11158Nof_ep10 ;
   private String i11160Nof_sa1 ;
   private String i11161Nof_sa2 ;
   private String i11162Nof_sa3 ;
   private String i11164Nof_sa5 ;
   private String i11165Nof_sa6 ;
   private String i11167Nof_stk ;
   private String ZZ396EmprCod ;
   private String ZZ11105Nof_p ;
   private String ZZ407EmprNom ;
   private String ZZ11106Nof_Pd ;
   private String ZZ11107Nof_Mcot ;
   private String ZZ11108Nof_Pp ;
   private String ZZ11109Nof_Ag ;
   private String ZZ11112Nof_bo ;
   private String ZZ11113Nof_bob ;
   private String ZZ11114Nof_boe ;
   private String ZZ11115Nof_Bov ;
   private String ZZ11117Nof_tns ;
   private String ZZ11118Nof_tnc ;
   private String ZZ11120Nof_ct ;
   private String ZZ11122Nof_scs ;
   private String ZZ11123Nof_scc ;
   private String ZZ11125Nof_cctse ;
   private String ZZ11126Nof_ccttp ;
   private String ZZ11127Nof_cctet ;
   private String ZZ11130Nof_ccpc ;
   private String ZZ11131Nof_cctq ;
   private String ZZ11132Nof_cccc ;
   private String ZZ11133Nof_ccec ;
   private String ZZ11134Nof_ccmc1 ;
   private String ZZ11135Nof_ccmc2 ;
   private String ZZ11136Nof_ccmc3 ;
   private String ZZ11137Nof_ccmc4 ;
   private String ZZ11138Nof_ccmc5 ;
   private String ZZ11139Nof_ccmc6 ;
   private String ZZ11141Nof_rb ;
   private String ZZ11142Nof_rbi ;
   private String ZZ11143Nof_rbe ;
   private String ZZ11144Nof_rbp ;
   private String ZZ11146Nof_rb1 ;
   private String ZZ11147Nof_rb3 ;
   private String ZZ11149Nof_ep1 ;
   private String ZZ11150Nof_ep2 ;
   private String ZZ11151Nof_ep3 ;
   private String ZZ11152Nof_ep4 ;
   private String ZZ11153Nof_ep5 ;
   private String ZZ11154Nof_ep6 ;
   private String ZZ11155Nof_ep7 ;
   private String ZZ11156Nof_ep8 ;
   private String ZZ11157Nof_ep9 ;
   private String ZZ11158Nof_ep10 ;
   private String ZZ11160Nof_sa1 ;
   private String ZZ11161Nof_sa2 ;
   private String ZZ11162Nof_sa3 ;
   private String ZZ11163Nof_sa4 ;
   private String ZZ11164Nof_sa5 ;
   private String ZZ11165Nof_sa6 ;
   private String ZZ11167Nof_stk ;
   private String ZZ11168Nof_Lbta ;
   private String ZZ11388Nof_imp1 ;
   private String ZZ11389Nof_imp2 ;
   private String ZZ11390Nof_imp3 ;
   private String ZZ11391Nof_imp4 ;
   private String ZZ11392Nof_imp5 ;
   private String ZZ11393Nof_imp6 ;
   private String ZZ11394Nof_imp7 ;
   private String ZZ11395Nof_imp8 ;
   private String ZZ11396Nof_imp9 ;
   private String ZZ11397Nof_imp10 ;
   private String ZZ11398Nof_imp11 ;
   private String ZZ11399Nof_lavado ;
   private String ZZ11400Nof_luz ;
   private String ZZ11401Nof_sudor ;
   private String ZZ11402Nof_cloro ;
   private String ZZ11403Nof_aguam ;
   private String ZZ11404Nof_termom ;
   private String ZZ11406Nof_oekote ;
   private String ZZ11418Nof_obs1 ;
   private String ZZ11419Nof_obs2 ;
   private String ZZ11420Nof_obs3 ;
   private String ZZ11421Nof_obs4 ;
   private String ZZ11422Nof_obs5 ;
   private String ZZ11423Nof_obs6 ;
   private String ZZ11424Nof_obs7 ;
   private String ZZ11425Nof_obs8 ;
   private String ZZ11426Nof_obs9 ;
   private String ZZ11427Nof_obs10 ;
   private String ZZ11428Nof_obs11 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean n11106Nof_Pd ;
   private boolean n11107Nof_Mcot ;
   private boolean n11108Nof_Pp ;
   private boolean n11109Nof_Ag ;
   private boolean n11112Nof_bo ;
   private boolean n11113Nof_bob ;
   private boolean n11114Nof_boe ;
   private boolean n11115Nof_Bov ;
   private boolean n11117Nof_tns ;
   private boolean n11118Nof_tnc ;
   private boolean n11120Nof_ct ;
   private boolean n11122Nof_scs ;
   private boolean n11123Nof_scc ;
   private boolean n11125Nof_cctse ;
   private boolean n11126Nof_ccttp ;
   private boolean n11127Nof_cctet ;
   private boolean n11130Nof_ccpc ;
   private boolean n11131Nof_cctq ;
   private boolean n11132Nof_cccc ;
   private boolean n11133Nof_ccec ;
   private boolean n11134Nof_ccmc1 ;
   private boolean n11135Nof_ccmc2 ;
   private boolean n11136Nof_ccmc3 ;
   private boolean n11137Nof_ccmc4 ;
   private boolean n11138Nof_ccmc5 ;
   private boolean n11139Nof_ccmc6 ;
   private boolean n11141Nof_rb ;
   private boolean n11142Nof_rbi ;
   private boolean n11143Nof_rbe ;
   private boolean n11144Nof_rbp ;
   private boolean n11146Nof_rb1 ;
   private boolean n11147Nof_rb3 ;
   private boolean n11149Nof_ep1 ;
   private boolean n11150Nof_ep2 ;
   private boolean n11151Nof_ep3 ;
   private boolean n11152Nof_ep4 ;
   private boolean n11153Nof_ep5 ;
   private boolean n11154Nof_ep6 ;
   private boolean n11155Nof_ep7 ;
   private boolean n11156Nof_ep8 ;
   private boolean n11157Nof_ep9 ;
   private boolean n11158Nof_ep10 ;
   private boolean n11160Nof_sa1 ;
   private boolean n11161Nof_sa2 ;
   private boolean n11162Nof_sa3 ;
   private boolean n11163Nof_sa4 ;
   private boolean n11164Nof_sa5 ;
   private boolean n11165Nof_sa6 ;
   private boolean n11167Nof_stk ;
   private boolean n407EmprNom ;
   private boolean n11110Nof_c1 ;
   private boolean n11111Nof_c2 ;
   private boolean n11116Nof_c3 ;
   private boolean n11119Nof_c4 ;
   private boolean n11121Nof_c5 ;
   private boolean n11124Nof_c6 ;
   private boolean n11128Nof_ccp ;
   private boolean n11129Nof_cct ;
   private boolean n11140Nof_c7 ;
   private boolean n11145Nof_rboc ;
   private boolean n11148Nof_c8 ;
   private boolean n11159Nof_c9 ;
   private boolean n11166Nof_c10 ;
   private boolean n11168Nof_Lbta ;
   private boolean n11169Nof_Lbtp ;
   private boolean n11170Nof_c11 ;
   private boolean n11171Nof_c12 ;
   private boolean n11388Nof_imp1 ;
   private boolean n11389Nof_imp2 ;
   private boolean n11390Nof_imp3 ;
   private boolean n11391Nof_imp4 ;
   private boolean n11392Nof_imp5 ;
   private boolean n11393Nof_imp6 ;
   private boolean n11394Nof_imp7 ;
   private boolean n11395Nof_imp8 ;
   private boolean n11396Nof_imp9 ;
   private boolean n11397Nof_imp10 ;
   private boolean n11398Nof_imp11 ;
   private boolean n11399Nof_lavado ;
   private boolean n11400Nof_luz ;
   private boolean n11401Nof_sudor ;
   private boolean n11402Nof_cloro ;
   private boolean n11403Nof_aguam ;
   private boolean n11404Nof_termom ;
   private boolean n11405Nof_humeda ;
   private boolean n11406Nof_oekote ;
   private boolean n11418Nof_obs1 ;
   private boolean n11419Nof_obs2 ;
   private boolean n11420Nof_obs3 ;
   private boolean n11421Nof_obs4 ;
   private boolean n11422Nof_obs5 ;
   private boolean n11423Nof_obs6 ;
   private boolean n11424Nof_obs7 ;
   private boolean n11425Nof_obs8 ;
   private boolean n11426Nof_obs9 ;
   private boolean n11427Nof_obs10 ;
   private boolean n11428Nof_obs11 ;
   private boolean n11709Nof_nc ;
   private boolean n11710Nof_enc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z11110Nof_c1 ;
   private String Z11111Nof_c2 ;
   private String Z11116Nof_c3 ;
   private String Z11119Nof_c4 ;
   private String Z11121Nof_c5 ;
   private String Z11124Nof_c6 ;
   private String Z11140Nof_c7 ;
   private String Z11148Nof_c8 ;
   private String Z11159Nof_c9 ;
   private String Z11166Nof_c10 ;
   private String Z11170Nof_c11 ;
   private String Z11171Nof_c12 ;
   private String A11110Nof_c1 ;
   private String A11111Nof_c2 ;
   private String A11116Nof_c3 ;
   private String A11119Nof_c4 ;
   private String A11121Nof_c5 ;
   private String A11124Nof_c6 ;
   private String A11140Nof_c7 ;
   private String A11148Nof_c8 ;
   private String A11159Nof_c9 ;
   private String A11166Nof_c10 ;
   private String A11170Nof_c11 ;
   private String A11171Nof_c12 ;
   private String ZZ11110Nof_c1 ;
   private String ZZ11111Nof_c2 ;
   private String ZZ11116Nof_c3 ;
   private String ZZ11119Nof_c4 ;
   private String ZZ11121Nof_c5 ;
   private String ZZ11124Nof_c6 ;
   private String ZZ11140Nof_c7 ;
   private String ZZ11148Nof_c8 ;
   private String ZZ11159Nof_c9 ;
   private String ZZ11166Nof_c10 ;
   private String ZZ11170Nof_c11 ;
   private String ZZ11171Nof_c12 ;
   private HTMLChoice cmbNof_Pd ;
   private HTMLChoice cmbNof_Mcot ;
   private HTMLChoice cmbNof_Pp ;
   private HTMLChoice cmbNof_Ag ;
   private HTMLChoice cmbNof_bo ;
   private HTMLChoice cmbNof_bob ;
   private HTMLChoice cmbNof_boe ;
   private HTMLChoice cmbNof_Bov ;
   private HTMLChoice cmbNof_tns ;
   private HTMLChoice cmbNof_tnc ;
   private HTMLChoice cmbNof_ct ;
   private HTMLChoice cmbNof_scs ;
   private HTMLChoice cmbNof_scc ;
   private HTMLChoice cmbNof_cctse ;
   private HTMLChoice cmbNof_ccttp ;
   private HTMLChoice cmbNof_cctet ;
   private HTMLChoice cmbNof_ccpc ;
   private HTMLChoice cmbNof_cctq ;
   private HTMLChoice cmbNof_cccc ;
   private HTMLChoice cmbNof_ccec ;
   private HTMLChoice cmbNof_ccmc1 ;
   private HTMLChoice cmbNof_ccmc2 ;
   private HTMLChoice cmbNof_ccmc3 ;
   private HTMLChoice cmbNof_ccmc4 ;
   private HTMLChoice cmbNof_ccmc5 ;
   private HTMLChoice cmbNof_ccmc6 ;
   private HTMLChoice cmbNof_rb ;
   private HTMLChoice cmbNof_rbi ;
   private HTMLChoice cmbNof_rbe ;
   private HTMLChoice cmbNof_rbp ;
   private HTMLChoice cmbNof_rb1 ;
   private HTMLChoice cmbNof_rb3 ;
   private HTMLChoice cmbNof_ep1 ;
   private HTMLChoice cmbNof_ep2 ;
   private HTMLChoice cmbNof_ep3 ;
   private HTMLChoice cmbNof_ep4 ;
   private HTMLChoice cmbNof_ep5 ;
   private HTMLChoice cmbNof_ep6 ;
   private HTMLChoice cmbNof_ep7 ;
   private HTMLChoice cmbNof_ep8 ;
   private HTMLChoice cmbNof_ep9 ;
   private HTMLChoice cmbNof_ep10 ;
   private HTMLChoice cmbNof_sa1 ;
   private HTMLChoice cmbNof_sa2 ;
   private HTMLChoice cmbNof_sa3 ;
   private HTMLChoice cmbNof_sa4 ;
   private HTMLChoice cmbNof_sa5 ;
   private HTMLChoice cmbNof_sa6 ;
   private HTMLChoice cmbNof_stk ;
   private IDataStoreProvider pr_default ;
   private String[] T01AP4_A407EmprNom ;
   private boolean[] T01AP4_n407EmprNom ;
   private byte[] T01AP6_A11709Nof_nc ;
   private boolean[] T01AP6_n11709Nof_nc ;
   private java.math.BigDecimal[] T01AP6_A11710Nof_enc ;
   private boolean[] T01AP6_n11710Nof_enc ;
   private String[] T01AP6_A396EmprCod ;
   private short[] T01AP6_A840TrnCod ;
   private boolean[] T01AP6_n840TrnCod ;
   private int[] T01AP6_A11103Nof_Hdr ;
   private byte[] T01AP6_A11104Nof_r ;
   private String[] T01AP6_A11105Nof_p ;
   private String[] T01AP6_A407EmprNom ;
   private boolean[] T01AP6_n407EmprNom ;
   private String[] T01AP6_A11106Nof_Pd ;
   private boolean[] T01AP6_n11106Nof_Pd ;
   private String[] T01AP6_A11107Nof_Mcot ;
   private boolean[] T01AP6_n11107Nof_Mcot ;
   private String[] T01AP6_A11108Nof_Pp ;
   private boolean[] T01AP6_n11108Nof_Pp ;
   private String[] T01AP6_A11109Nof_Ag ;
   private boolean[] T01AP6_n11109Nof_Ag ;
   private String[] T01AP6_A11110Nof_c1 ;
   private boolean[] T01AP6_n11110Nof_c1 ;
   private String[] T01AP6_A11111Nof_c2 ;
   private boolean[] T01AP6_n11111Nof_c2 ;
   private String[] T01AP6_A11112Nof_bo ;
   private boolean[] T01AP6_n11112Nof_bo ;
   private String[] T01AP6_A11113Nof_bob ;
   private boolean[] T01AP6_n11113Nof_bob ;
   private String[] T01AP6_A11114Nof_boe ;
   private boolean[] T01AP6_n11114Nof_boe ;
   private String[] T01AP6_A11115Nof_Bov ;
   private boolean[] T01AP6_n11115Nof_Bov ;
   private String[] T01AP6_A11116Nof_c3 ;
   private boolean[] T01AP6_n11116Nof_c3 ;
   private String[] T01AP6_A11117Nof_tns ;
   private boolean[] T01AP6_n11117Nof_tns ;
   private String[] T01AP6_A11118Nof_tnc ;
   private boolean[] T01AP6_n11118Nof_tnc ;
   private String[] T01AP6_A11119Nof_c4 ;
   private boolean[] T01AP6_n11119Nof_c4 ;
   private String[] T01AP6_A11120Nof_ct ;
   private boolean[] T01AP6_n11120Nof_ct ;
   private String[] T01AP6_A11121Nof_c5 ;
   private boolean[] T01AP6_n11121Nof_c5 ;
   private String[] T01AP6_A11122Nof_scs ;
   private boolean[] T01AP6_n11122Nof_scs ;
   private String[] T01AP6_A11123Nof_scc ;
   private boolean[] T01AP6_n11123Nof_scc ;
   private String[] T01AP6_A11124Nof_c6 ;
   private boolean[] T01AP6_n11124Nof_c6 ;
   private String[] T01AP6_A11125Nof_cctse ;
   private boolean[] T01AP6_n11125Nof_cctse ;
   private String[] T01AP6_A11126Nof_ccttp ;
   private boolean[] T01AP6_n11126Nof_ccttp ;
   private String[] T01AP6_A11127Nof_cctet ;
   private boolean[] T01AP6_n11127Nof_cctet ;
   private byte[] T01AP6_A11128Nof_ccp ;
   private boolean[] T01AP6_n11128Nof_ccp ;
   private byte[] T01AP6_A11129Nof_cct ;
   private boolean[] T01AP6_n11129Nof_cct ;
   private String[] T01AP6_A11130Nof_ccpc ;
   private boolean[] T01AP6_n11130Nof_ccpc ;
   private String[] T01AP6_A11131Nof_cctq ;
   private boolean[] T01AP6_n11131Nof_cctq ;
   private String[] T01AP6_A11132Nof_cccc ;
   private boolean[] T01AP6_n11132Nof_cccc ;
   private String[] T01AP6_A11133Nof_ccec ;
   private boolean[] T01AP6_n11133Nof_ccec ;
   private String[] T01AP6_A11134Nof_ccmc1 ;
   private boolean[] T01AP6_n11134Nof_ccmc1 ;
   private String[] T01AP6_A11135Nof_ccmc2 ;
   private boolean[] T01AP6_n11135Nof_ccmc2 ;
   private String[] T01AP6_A11136Nof_ccmc3 ;
   private boolean[] T01AP6_n11136Nof_ccmc3 ;
   private String[] T01AP6_A11137Nof_ccmc4 ;
   private boolean[] T01AP6_n11137Nof_ccmc4 ;
   private String[] T01AP6_A11138Nof_ccmc5 ;
   private boolean[] T01AP6_n11138Nof_ccmc5 ;
   private String[] T01AP6_A11139Nof_ccmc6 ;
   private boolean[] T01AP6_n11139Nof_ccmc6 ;
   private String[] T01AP6_A11140Nof_c7 ;
   private boolean[] T01AP6_n11140Nof_c7 ;
   private String[] T01AP6_A11141Nof_rb ;
   private boolean[] T01AP6_n11141Nof_rb ;
   private String[] T01AP6_A11142Nof_rbi ;
   private boolean[] T01AP6_n11142Nof_rbi ;
   private String[] T01AP6_A11143Nof_rbe ;
   private boolean[] T01AP6_n11143Nof_rbe ;
   private String[] T01AP6_A11144Nof_rbp ;
   private boolean[] T01AP6_n11144Nof_rbp ;
   private short[] T01AP6_A11145Nof_rboc ;
   private boolean[] T01AP6_n11145Nof_rboc ;
   private String[] T01AP6_A11146Nof_rb1 ;
   private boolean[] T01AP6_n11146Nof_rb1 ;
   private String[] T01AP6_A11147Nof_rb3 ;
   private boolean[] T01AP6_n11147Nof_rb3 ;
   private String[] T01AP6_A11148Nof_c8 ;
   private boolean[] T01AP6_n11148Nof_c8 ;
   private String[] T01AP6_A11149Nof_ep1 ;
   private boolean[] T01AP6_n11149Nof_ep1 ;
   private String[] T01AP6_A11150Nof_ep2 ;
   private boolean[] T01AP6_n11150Nof_ep2 ;
   private String[] T01AP6_A11151Nof_ep3 ;
   private boolean[] T01AP6_n11151Nof_ep3 ;
   private String[] T01AP6_A11152Nof_ep4 ;
   private boolean[] T01AP6_n11152Nof_ep4 ;
   private String[] T01AP6_A11153Nof_ep5 ;
   private boolean[] T01AP6_n11153Nof_ep5 ;
   private String[] T01AP6_A11154Nof_ep6 ;
   private boolean[] T01AP6_n11154Nof_ep6 ;
   private String[] T01AP6_A11155Nof_ep7 ;
   private boolean[] T01AP6_n11155Nof_ep7 ;
   private String[] T01AP6_A11156Nof_ep8 ;
   private boolean[] T01AP6_n11156Nof_ep8 ;
   private String[] T01AP6_A11157Nof_ep9 ;
   private boolean[] T01AP6_n11157Nof_ep9 ;
   private String[] T01AP6_A11158Nof_ep10 ;
   private boolean[] T01AP6_n11158Nof_ep10 ;
   private String[] T01AP6_A11159Nof_c9 ;
   private boolean[] T01AP6_n11159Nof_c9 ;
   private String[] T01AP6_A11160Nof_sa1 ;
   private boolean[] T01AP6_n11160Nof_sa1 ;
   private String[] T01AP6_A11161Nof_sa2 ;
   private boolean[] T01AP6_n11161Nof_sa2 ;
   private String[] T01AP6_A11162Nof_sa3 ;
   private boolean[] T01AP6_n11162Nof_sa3 ;
   private String[] T01AP6_A11163Nof_sa4 ;
   private boolean[] T01AP6_n11163Nof_sa4 ;
   private String[] T01AP6_A11164Nof_sa5 ;
   private boolean[] T01AP6_n11164Nof_sa5 ;
   private String[] T01AP6_A11165Nof_sa6 ;
   private boolean[] T01AP6_n11165Nof_sa6 ;
   private String[] T01AP6_A11166Nof_c10 ;
   private boolean[] T01AP6_n11166Nof_c10 ;
   private String[] T01AP6_A11167Nof_stk ;
   private boolean[] T01AP6_n11167Nof_stk ;
   private String[] T01AP6_A11168Nof_Lbta ;
   private boolean[] T01AP6_n11168Nof_Lbta ;
   private short[] T01AP6_A11169Nof_Lbtp ;
   private boolean[] T01AP6_n11169Nof_Lbtp ;
   private String[] T01AP6_A11170Nof_c11 ;
   private boolean[] T01AP6_n11170Nof_c11 ;
   private String[] T01AP6_A11171Nof_c12 ;
   private boolean[] T01AP6_n11171Nof_c12 ;
   private String[] T01AP6_A11388Nof_imp1 ;
   private boolean[] T01AP6_n11388Nof_imp1 ;
   private String[] T01AP6_A11389Nof_imp2 ;
   private boolean[] T01AP6_n11389Nof_imp2 ;
   private String[] T01AP6_A11390Nof_imp3 ;
   private boolean[] T01AP6_n11390Nof_imp3 ;
   private String[] T01AP6_A11391Nof_imp4 ;
   private boolean[] T01AP6_n11391Nof_imp4 ;
   private String[] T01AP6_A11392Nof_imp5 ;
   private boolean[] T01AP6_n11392Nof_imp5 ;
   private String[] T01AP6_A11393Nof_imp6 ;
   private boolean[] T01AP6_n11393Nof_imp6 ;
   private String[] T01AP6_A11394Nof_imp7 ;
   private boolean[] T01AP6_n11394Nof_imp7 ;
   private String[] T01AP6_A11395Nof_imp8 ;
   private boolean[] T01AP6_n11395Nof_imp8 ;
   private String[] T01AP6_A11396Nof_imp9 ;
   private boolean[] T01AP6_n11396Nof_imp9 ;
   private String[] T01AP6_A11397Nof_imp10 ;
   private boolean[] T01AP6_n11397Nof_imp10 ;
   private String[] T01AP6_A11398Nof_imp11 ;
   private boolean[] T01AP6_n11398Nof_imp11 ;
   private String[] T01AP6_A11399Nof_lavado ;
   private boolean[] T01AP6_n11399Nof_lavado ;
   private String[] T01AP6_A11400Nof_luz ;
   private boolean[] T01AP6_n11400Nof_luz ;
   private String[] T01AP6_A11401Nof_sudor ;
   private boolean[] T01AP6_n11401Nof_sudor ;
   private String[] T01AP6_A11402Nof_cloro ;
   private boolean[] T01AP6_n11402Nof_cloro ;
   private String[] T01AP6_A11403Nof_aguam ;
   private boolean[] T01AP6_n11403Nof_aguam ;
   private String[] T01AP6_A11404Nof_termom ;
   private boolean[] T01AP6_n11404Nof_termom ;
   private java.math.BigDecimal[] T01AP6_A11405Nof_humeda ;
   private boolean[] T01AP6_n11405Nof_humeda ;
   private String[] T01AP6_A11406Nof_oekote ;
   private boolean[] T01AP6_n11406Nof_oekote ;
   private String[] T01AP6_A11418Nof_obs1 ;
   private boolean[] T01AP6_n11418Nof_obs1 ;
   private String[] T01AP6_A11419Nof_obs2 ;
   private boolean[] T01AP6_n11419Nof_obs2 ;
   private String[] T01AP6_A11420Nof_obs3 ;
   private boolean[] T01AP6_n11420Nof_obs3 ;
   private String[] T01AP6_A11421Nof_obs4 ;
   private boolean[] T01AP6_n11421Nof_obs4 ;
   private String[] T01AP6_A11422Nof_obs5 ;
   private boolean[] T01AP6_n11422Nof_obs5 ;
   private String[] T01AP6_A11423Nof_obs6 ;
   private boolean[] T01AP6_n11423Nof_obs6 ;
   private String[] T01AP6_A11424Nof_obs7 ;
   private boolean[] T01AP6_n11424Nof_obs7 ;
   private String[] T01AP6_A11425Nof_obs8 ;
   private boolean[] T01AP6_n11425Nof_obs8 ;
   private String[] T01AP6_A11426Nof_obs9 ;
   private boolean[] T01AP6_n11426Nof_obs9 ;
   private String[] T01AP6_A11427Nof_obs10 ;
   private boolean[] T01AP6_n11427Nof_obs10 ;
   private String[] T01AP6_A11428Nof_obs11 ;
   private boolean[] T01AP6_n11428Nof_obs11 ;
   private String[] T01AP5_A396EmprCod ;
   private String[] T01AP7_A396EmprCod ;
   private String[] T01AP8_A396EmprCod ;
   private int[] T01AP8_A11103Nof_Hdr ;
   private byte[] T01AP8_A11104Nof_r ;
   private String[] T01AP8_A11105Nof_p ;
   private byte[] T01AP3_A11709Nof_nc ;
   private boolean[] T01AP3_n11709Nof_nc ;
   private java.math.BigDecimal[] T01AP3_A11710Nof_enc ;
   private boolean[] T01AP3_n11710Nof_enc ;
   private String[] T01AP3_A396EmprCod ;
   private short[] T01AP3_A840TrnCod ;
   private boolean[] T01AP3_n840TrnCod ;
   private int[] T01AP3_A11103Nof_Hdr ;
   private byte[] T01AP3_A11104Nof_r ;
   private String[] T01AP3_A11105Nof_p ;
   private String[] T01AP3_A11106Nof_Pd ;
   private boolean[] T01AP3_n11106Nof_Pd ;
   private String[] T01AP3_A11107Nof_Mcot ;
   private boolean[] T01AP3_n11107Nof_Mcot ;
   private String[] T01AP3_A11108Nof_Pp ;
   private boolean[] T01AP3_n11108Nof_Pp ;
   private String[] T01AP3_A11109Nof_Ag ;
   private boolean[] T01AP3_n11109Nof_Ag ;
   private String[] T01AP3_A11110Nof_c1 ;
   private boolean[] T01AP3_n11110Nof_c1 ;
   private String[] T01AP3_A11111Nof_c2 ;
   private boolean[] T01AP3_n11111Nof_c2 ;
   private String[] T01AP3_A11112Nof_bo ;
   private boolean[] T01AP3_n11112Nof_bo ;
   private String[] T01AP3_A11113Nof_bob ;
   private boolean[] T01AP3_n11113Nof_bob ;
   private String[] T01AP3_A11114Nof_boe ;
   private boolean[] T01AP3_n11114Nof_boe ;
   private String[] T01AP3_A11115Nof_Bov ;
   private boolean[] T01AP3_n11115Nof_Bov ;
   private String[] T01AP3_A11116Nof_c3 ;
   private boolean[] T01AP3_n11116Nof_c3 ;
   private String[] T01AP3_A11117Nof_tns ;
   private boolean[] T01AP3_n11117Nof_tns ;
   private String[] T01AP3_A11118Nof_tnc ;
   private boolean[] T01AP3_n11118Nof_tnc ;
   private String[] T01AP3_A11119Nof_c4 ;
   private boolean[] T01AP3_n11119Nof_c4 ;
   private String[] T01AP3_A11120Nof_ct ;
   private boolean[] T01AP3_n11120Nof_ct ;
   private String[] T01AP3_A11121Nof_c5 ;
   private boolean[] T01AP3_n11121Nof_c5 ;
   private String[] T01AP3_A11122Nof_scs ;
   private boolean[] T01AP3_n11122Nof_scs ;
   private String[] T01AP3_A11123Nof_scc ;
   private boolean[] T01AP3_n11123Nof_scc ;
   private String[] T01AP3_A11124Nof_c6 ;
   private boolean[] T01AP3_n11124Nof_c6 ;
   private String[] T01AP3_A11125Nof_cctse ;
   private boolean[] T01AP3_n11125Nof_cctse ;
   private String[] T01AP3_A11126Nof_ccttp ;
   private boolean[] T01AP3_n11126Nof_ccttp ;
   private String[] T01AP3_A11127Nof_cctet ;
   private boolean[] T01AP3_n11127Nof_cctet ;
   private byte[] T01AP3_A11128Nof_ccp ;
   private boolean[] T01AP3_n11128Nof_ccp ;
   private byte[] T01AP3_A11129Nof_cct ;
   private boolean[] T01AP3_n11129Nof_cct ;
   private String[] T01AP3_A11130Nof_ccpc ;
   private boolean[] T01AP3_n11130Nof_ccpc ;
   private String[] T01AP3_A11131Nof_cctq ;
   private boolean[] T01AP3_n11131Nof_cctq ;
   private String[] T01AP3_A11132Nof_cccc ;
   private boolean[] T01AP3_n11132Nof_cccc ;
   private String[] T01AP3_A11133Nof_ccec ;
   private boolean[] T01AP3_n11133Nof_ccec ;
   private String[] T01AP3_A11134Nof_ccmc1 ;
   private boolean[] T01AP3_n11134Nof_ccmc1 ;
   private String[] T01AP3_A11135Nof_ccmc2 ;
   private boolean[] T01AP3_n11135Nof_ccmc2 ;
   private String[] T01AP3_A11136Nof_ccmc3 ;
   private boolean[] T01AP3_n11136Nof_ccmc3 ;
   private String[] T01AP3_A11137Nof_ccmc4 ;
   private boolean[] T01AP3_n11137Nof_ccmc4 ;
   private String[] T01AP3_A11138Nof_ccmc5 ;
   private boolean[] T01AP3_n11138Nof_ccmc5 ;
   private String[] T01AP3_A11139Nof_ccmc6 ;
   private boolean[] T01AP3_n11139Nof_ccmc6 ;
   private String[] T01AP3_A11140Nof_c7 ;
   private boolean[] T01AP3_n11140Nof_c7 ;
   private String[] T01AP3_A11141Nof_rb ;
   private boolean[] T01AP3_n11141Nof_rb ;
   private String[] T01AP3_A11142Nof_rbi ;
   private boolean[] T01AP3_n11142Nof_rbi ;
   private String[] T01AP3_A11143Nof_rbe ;
   private boolean[] T01AP3_n11143Nof_rbe ;
   private String[] T01AP3_A11144Nof_rbp ;
   private boolean[] T01AP3_n11144Nof_rbp ;
   private short[] T01AP3_A11145Nof_rboc ;
   private boolean[] T01AP3_n11145Nof_rboc ;
   private String[] T01AP3_A11146Nof_rb1 ;
   private boolean[] T01AP3_n11146Nof_rb1 ;
   private String[] T01AP3_A11147Nof_rb3 ;
   private boolean[] T01AP3_n11147Nof_rb3 ;
   private String[] T01AP3_A11148Nof_c8 ;
   private boolean[] T01AP3_n11148Nof_c8 ;
   private String[] T01AP3_A11149Nof_ep1 ;
   private boolean[] T01AP3_n11149Nof_ep1 ;
   private String[] T01AP3_A11150Nof_ep2 ;
   private boolean[] T01AP3_n11150Nof_ep2 ;
   private String[] T01AP3_A11151Nof_ep3 ;
   private boolean[] T01AP3_n11151Nof_ep3 ;
   private String[] T01AP3_A11152Nof_ep4 ;
   private boolean[] T01AP3_n11152Nof_ep4 ;
   private String[] T01AP3_A11153Nof_ep5 ;
   private boolean[] T01AP3_n11153Nof_ep5 ;
   private String[] T01AP3_A11154Nof_ep6 ;
   private boolean[] T01AP3_n11154Nof_ep6 ;
   private String[] T01AP3_A11155Nof_ep7 ;
   private boolean[] T01AP3_n11155Nof_ep7 ;
   private String[] T01AP3_A11156Nof_ep8 ;
   private boolean[] T01AP3_n11156Nof_ep8 ;
   private String[] T01AP3_A11157Nof_ep9 ;
   private boolean[] T01AP3_n11157Nof_ep9 ;
   private String[] T01AP3_A11158Nof_ep10 ;
   private boolean[] T01AP3_n11158Nof_ep10 ;
   private String[] T01AP3_A11159Nof_c9 ;
   private boolean[] T01AP3_n11159Nof_c9 ;
   private String[] T01AP3_A11160Nof_sa1 ;
   private boolean[] T01AP3_n11160Nof_sa1 ;
   private String[] T01AP3_A11161Nof_sa2 ;
   private boolean[] T01AP3_n11161Nof_sa2 ;
   private String[] T01AP3_A11162Nof_sa3 ;
   private boolean[] T01AP3_n11162Nof_sa3 ;
   private String[] T01AP3_A11163Nof_sa4 ;
   private boolean[] T01AP3_n11163Nof_sa4 ;
   private String[] T01AP3_A11164Nof_sa5 ;
   private boolean[] T01AP3_n11164Nof_sa5 ;
   private String[] T01AP3_A11165Nof_sa6 ;
   private boolean[] T01AP3_n11165Nof_sa6 ;
   private String[] T01AP3_A11166Nof_c10 ;
   private boolean[] T01AP3_n11166Nof_c10 ;
   private String[] T01AP3_A11167Nof_stk ;
   private boolean[] T01AP3_n11167Nof_stk ;
   private String[] T01AP3_A11168Nof_Lbta ;
   private boolean[] T01AP3_n11168Nof_Lbta ;
   private short[] T01AP3_A11169Nof_Lbtp ;
   private boolean[] T01AP3_n11169Nof_Lbtp ;
   private String[] T01AP3_A11170Nof_c11 ;
   private boolean[] T01AP3_n11170Nof_c11 ;
   private String[] T01AP3_A11171Nof_c12 ;
   private boolean[] T01AP3_n11171Nof_c12 ;
   private String[] T01AP3_A11388Nof_imp1 ;
   private boolean[] T01AP3_n11388Nof_imp1 ;
   private String[] T01AP3_A11389Nof_imp2 ;
   private boolean[] T01AP3_n11389Nof_imp2 ;
   private String[] T01AP3_A11390Nof_imp3 ;
   private boolean[] T01AP3_n11390Nof_imp3 ;
   private String[] T01AP3_A11391Nof_imp4 ;
   private boolean[] T01AP3_n11391Nof_imp4 ;
   private String[] T01AP3_A11392Nof_imp5 ;
   private boolean[] T01AP3_n11392Nof_imp5 ;
   private String[] T01AP3_A11393Nof_imp6 ;
   private boolean[] T01AP3_n11393Nof_imp6 ;
   private String[] T01AP3_A11394Nof_imp7 ;
   private boolean[] T01AP3_n11394Nof_imp7 ;
   private String[] T01AP3_A11395Nof_imp8 ;
   private boolean[] T01AP3_n11395Nof_imp8 ;
   private String[] T01AP3_A11396Nof_imp9 ;
   private boolean[] T01AP3_n11396Nof_imp9 ;
   private String[] T01AP3_A11397Nof_imp10 ;
   private boolean[] T01AP3_n11397Nof_imp10 ;
   private String[] T01AP3_A11398Nof_imp11 ;
   private boolean[] T01AP3_n11398Nof_imp11 ;
   private String[] T01AP3_A11399Nof_lavado ;
   private boolean[] T01AP3_n11399Nof_lavado ;
   private String[] T01AP3_A11400Nof_luz ;
   private boolean[] T01AP3_n11400Nof_luz ;
   private String[] T01AP3_A11401Nof_sudor ;
   private boolean[] T01AP3_n11401Nof_sudor ;
   private String[] T01AP3_A11402Nof_cloro ;
   private boolean[] T01AP3_n11402Nof_cloro ;
   private String[] T01AP3_A11403Nof_aguam ;
   private boolean[] T01AP3_n11403Nof_aguam ;
   private String[] T01AP3_A11404Nof_termom ;
   private boolean[] T01AP3_n11404Nof_termom ;
   private java.math.BigDecimal[] T01AP3_A11405Nof_humeda ;
   private boolean[] T01AP3_n11405Nof_humeda ;
   private String[] T01AP3_A11406Nof_oekote ;
   private boolean[] T01AP3_n11406Nof_oekote ;
   private String[] T01AP3_A11418Nof_obs1 ;
   private boolean[] T01AP3_n11418Nof_obs1 ;
   private String[] T01AP3_A11419Nof_obs2 ;
   private boolean[] T01AP3_n11419Nof_obs2 ;
   private String[] T01AP3_A11420Nof_obs3 ;
   private boolean[] T01AP3_n11420Nof_obs3 ;
   private String[] T01AP3_A11421Nof_obs4 ;
   private boolean[] T01AP3_n11421Nof_obs4 ;
   private String[] T01AP3_A11422Nof_obs5 ;
   private boolean[] T01AP3_n11422Nof_obs5 ;
   private String[] T01AP3_A11423Nof_obs6 ;
   private boolean[] T01AP3_n11423Nof_obs6 ;
   private String[] T01AP3_A11424Nof_obs7 ;
   private boolean[] T01AP3_n11424Nof_obs7 ;
   private String[] T01AP3_A11425Nof_obs8 ;
   private boolean[] T01AP3_n11425Nof_obs8 ;
   private String[] T01AP3_A11426Nof_obs9 ;
   private boolean[] T01AP3_n11426Nof_obs9 ;
   private String[] T01AP3_A11427Nof_obs10 ;
   private boolean[] T01AP3_n11427Nof_obs10 ;
   private String[] T01AP3_A11428Nof_obs11 ;
   private boolean[] T01AP3_n11428Nof_obs11 ;
   private String[] T01AP9_A396EmprCod ;
   private int[] T01AP9_A11103Nof_Hdr ;
   private byte[] T01AP9_A11104Nof_r ;
   private String[] T01AP9_A11105Nof_p ;
   private String[] T01AP10_A396EmprCod ;
   private int[] T01AP10_A11103Nof_Hdr ;
   private byte[] T01AP10_A11104Nof_r ;
   private String[] T01AP10_A11105Nof_p ;
   private byte[] T01AP2_A11709Nof_nc ;
   private boolean[] T01AP2_n11709Nof_nc ;
   private java.math.BigDecimal[] T01AP2_A11710Nof_enc ;
   private boolean[] T01AP2_n11710Nof_enc ;
   private String[] T01AP2_A396EmprCod ;
   private short[] T01AP2_A840TrnCod ;
   private boolean[] T01AP2_n840TrnCod ;
   private int[] T01AP2_A11103Nof_Hdr ;
   private byte[] T01AP2_A11104Nof_r ;
   private String[] T01AP2_A11105Nof_p ;
   private String[] T01AP2_A11106Nof_Pd ;
   private boolean[] T01AP2_n11106Nof_Pd ;
   private String[] T01AP2_A11107Nof_Mcot ;
   private boolean[] T01AP2_n11107Nof_Mcot ;
   private String[] T01AP2_A11108Nof_Pp ;
   private boolean[] T01AP2_n11108Nof_Pp ;
   private String[] T01AP2_A11109Nof_Ag ;
   private boolean[] T01AP2_n11109Nof_Ag ;
   private String[] T01AP2_A11110Nof_c1 ;
   private boolean[] T01AP2_n11110Nof_c1 ;
   private String[] T01AP2_A11111Nof_c2 ;
   private boolean[] T01AP2_n11111Nof_c2 ;
   private String[] T01AP2_A11112Nof_bo ;
   private boolean[] T01AP2_n11112Nof_bo ;
   private String[] T01AP2_A11113Nof_bob ;
   private boolean[] T01AP2_n11113Nof_bob ;
   private String[] T01AP2_A11114Nof_boe ;
   private boolean[] T01AP2_n11114Nof_boe ;
   private String[] T01AP2_A11115Nof_Bov ;
   private boolean[] T01AP2_n11115Nof_Bov ;
   private String[] T01AP2_A11116Nof_c3 ;
   private boolean[] T01AP2_n11116Nof_c3 ;
   private String[] T01AP2_A11117Nof_tns ;
   private boolean[] T01AP2_n11117Nof_tns ;
   private String[] T01AP2_A11118Nof_tnc ;
   private boolean[] T01AP2_n11118Nof_tnc ;
   private String[] T01AP2_A11119Nof_c4 ;
   private boolean[] T01AP2_n11119Nof_c4 ;
   private String[] T01AP2_A11120Nof_ct ;
   private boolean[] T01AP2_n11120Nof_ct ;
   private String[] T01AP2_A11121Nof_c5 ;
   private boolean[] T01AP2_n11121Nof_c5 ;
   private String[] T01AP2_A11122Nof_scs ;
   private boolean[] T01AP2_n11122Nof_scs ;
   private String[] T01AP2_A11123Nof_scc ;
   private boolean[] T01AP2_n11123Nof_scc ;
   private String[] T01AP2_A11124Nof_c6 ;
   private boolean[] T01AP2_n11124Nof_c6 ;
   private String[] T01AP2_A11125Nof_cctse ;
   private boolean[] T01AP2_n11125Nof_cctse ;
   private String[] T01AP2_A11126Nof_ccttp ;
   private boolean[] T01AP2_n11126Nof_ccttp ;
   private String[] T01AP2_A11127Nof_cctet ;
   private boolean[] T01AP2_n11127Nof_cctet ;
   private byte[] T01AP2_A11128Nof_ccp ;
   private boolean[] T01AP2_n11128Nof_ccp ;
   private byte[] T01AP2_A11129Nof_cct ;
   private boolean[] T01AP2_n11129Nof_cct ;
   private String[] T01AP2_A11130Nof_ccpc ;
   private boolean[] T01AP2_n11130Nof_ccpc ;
   private String[] T01AP2_A11131Nof_cctq ;
   private boolean[] T01AP2_n11131Nof_cctq ;
   private String[] T01AP2_A11132Nof_cccc ;
   private boolean[] T01AP2_n11132Nof_cccc ;
   private String[] T01AP2_A11133Nof_ccec ;
   private boolean[] T01AP2_n11133Nof_ccec ;
   private String[] T01AP2_A11134Nof_ccmc1 ;
   private boolean[] T01AP2_n11134Nof_ccmc1 ;
   private String[] T01AP2_A11135Nof_ccmc2 ;
   private boolean[] T01AP2_n11135Nof_ccmc2 ;
   private String[] T01AP2_A11136Nof_ccmc3 ;
   private boolean[] T01AP2_n11136Nof_ccmc3 ;
   private String[] T01AP2_A11137Nof_ccmc4 ;
   private boolean[] T01AP2_n11137Nof_ccmc4 ;
   private String[] T01AP2_A11138Nof_ccmc5 ;
   private boolean[] T01AP2_n11138Nof_ccmc5 ;
   private String[] T01AP2_A11139Nof_ccmc6 ;
   private boolean[] T01AP2_n11139Nof_ccmc6 ;
   private String[] T01AP2_A11140Nof_c7 ;
   private boolean[] T01AP2_n11140Nof_c7 ;
   private String[] T01AP2_A11141Nof_rb ;
   private boolean[] T01AP2_n11141Nof_rb ;
   private String[] T01AP2_A11142Nof_rbi ;
   private boolean[] T01AP2_n11142Nof_rbi ;
   private String[] T01AP2_A11143Nof_rbe ;
   private boolean[] T01AP2_n11143Nof_rbe ;
   private String[] T01AP2_A11144Nof_rbp ;
   private boolean[] T01AP2_n11144Nof_rbp ;
   private short[] T01AP2_A11145Nof_rboc ;
   private boolean[] T01AP2_n11145Nof_rboc ;
   private String[] T01AP2_A11146Nof_rb1 ;
   private boolean[] T01AP2_n11146Nof_rb1 ;
   private String[] T01AP2_A11147Nof_rb3 ;
   private boolean[] T01AP2_n11147Nof_rb3 ;
   private String[] T01AP2_A11148Nof_c8 ;
   private boolean[] T01AP2_n11148Nof_c8 ;
   private String[] T01AP2_A11149Nof_ep1 ;
   private boolean[] T01AP2_n11149Nof_ep1 ;
   private String[] T01AP2_A11150Nof_ep2 ;
   private boolean[] T01AP2_n11150Nof_ep2 ;
   private String[] T01AP2_A11151Nof_ep3 ;
   private boolean[] T01AP2_n11151Nof_ep3 ;
   private String[] T01AP2_A11152Nof_ep4 ;
   private boolean[] T01AP2_n11152Nof_ep4 ;
   private String[] T01AP2_A11153Nof_ep5 ;
   private boolean[] T01AP2_n11153Nof_ep5 ;
   private String[] T01AP2_A11154Nof_ep6 ;
   private boolean[] T01AP2_n11154Nof_ep6 ;
   private String[] T01AP2_A11155Nof_ep7 ;
   private boolean[] T01AP2_n11155Nof_ep7 ;
   private String[] T01AP2_A11156Nof_ep8 ;
   private boolean[] T01AP2_n11156Nof_ep8 ;
   private String[] T01AP2_A11157Nof_ep9 ;
   private boolean[] T01AP2_n11157Nof_ep9 ;
   private String[] T01AP2_A11158Nof_ep10 ;
   private boolean[] T01AP2_n11158Nof_ep10 ;
   private String[] T01AP2_A11159Nof_c9 ;
   private boolean[] T01AP2_n11159Nof_c9 ;
   private String[] T01AP2_A11160Nof_sa1 ;
   private boolean[] T01AP2_n11160Nof_sa1 ;
   private String[] T01AP2_A11161Nof_sa2 ;
   private boolean[] T01AP2_n11161Nof_sa2 ;
   private String[] T01AP2_A11162Nof_sa3 ;
   private boolean[] T01AP2_n11162Nof_sa3 ;
   private String[] T01AP2_A11163Nof_sa4 ;
   private boolean[] T01AP2_n11163Nof_sa4 ;
   private String[] T01AP2_A11164Nof_sa5 ;
   private boolean[] T01AP2_n11164Nof_sa5 ;
   private String[] T01AP2_A11165Nof_sa6 ;
   private boolean[] T01AP2_n11165Nof_sa6 ;
   private String[] T01AP2_A11166Nof_c10 ;
   private boolean[] T01AP2_n11166Nof_c10 ;
   private String[] T01AP2_A11167Nof_stk ;
   private boolean[] T01AP2_n11167Nof_stk ;
   private String[] T01AP2_A11168Nof_Lbta ;
   private boolean[] T01AP2_n11168Nof_Lbta ;
   private short[] T01AP2_A11169Nof_Lbtp ;
   private boolean[] T01AP2_n11169Nof_Lbtp ;
   private String[] T01AP2_A11170Nof_c11 ;
   private boolean[] T01AP2_n11170Nof_c11 ;
   private String[] T01AP2_A11171Nof_c12 ;
   private boolean[] T01AP2_n11171Nof_c12 ;
   private String[] T01AP2_A11388Nof_imp1 ;
   private boolean[] T01AP2_n11388Nof_imp1 ;
   private String[] T01AP2_A11389Nof_imp2 ;
   private boolean[] T01AP2_n11389Nof_imp2 ;
   private String[] T01AP2_A11390Nof_imp3 ;
   private boolean[] T01AP2_n11390Nof_imp3 ;
   private String[] T01AP2_A11391Nof_imp4 ;
   private boolean[] T01AP2_n11391Nof_imp4 ;
   private String[] T01AP2_A11392Nof_imp5 ;
   private boolean[] T01AP2_n11392Nof_imp5 ;
   private String[] T01AP2_A11393Nof_imp6 ;
   private boolean[] T01AP2_n11393Nof_imp6 ;
   private String[] T01AP2_A11394Nof_imp7 ;
   private boolean[] T01AP2_n11394Nof_imp7 ;
   private String[] T01AP2_A11395Nof_imp8 ;
   private boolean[] T01AP2_n11395Nof_imp8 ;
   private String[] T01AP2_A11396Nof_imp9 ;
   private boolean[] T01AP2_n11396Nof_imp9 ;
   private String[] T01AP2_A11397Nof_imp10 ;
   private boolean[] T01AP2_n11397Nof_imp10 ;
   private String[] T01AP2_A11398Nof_imp11 ;
   private boolean[] T01AP2_n11398Nof_imp11 ;
   private String[] T01AP2_A11399Nof_lavado ;
   private boolean[] T01AP2_n11399Nof_lavado ;
   private String[] T01AP2_A11400Nof_luz ;
   private boolean[] T01AP2_n11400Nof_luz ;
   private String[] T01AP2_A11401Nof_sudor ;
   private boolean[] T01AP2_n11401Nof_sudor ;
   private String[] T01AP2_A11402Nof_cloro ;
   private boolean[] T01AP2_n11402Nof_cloro ;
   private String[] T01AP2_A11403Nof_aguam ;
   private boolean[] T01AP2_n11403Nof_aguam ;
   private String[] T01AP2_A11404Nof_termom ;
   private boolean[] T01AP2_n11404Nof_termom ;
   private java.math.BigDecimal[] T01AP2_A11405Nof_humeda ;
   private boolean[] T01AP2_n11405Nof_humeda ;
   private String[] T01AP2_A11406Nof_oekote ;
   private boolean[] T01AP2_n11406Nof_oekote ;
   private String[] T01AP2_A11418Nof_obs1 ;
   private boolean[] T01AP2_n11418Nof_obs1 ;
   private String[] T01AP2_A11419Nof_obs2 ;
   private boolean[] T01AP2_n11419Nof_obs2 ;
   private String[] T01AP2_A11420Nof_obs3 ;
   private boolean[] T01AP2_n11420Nof_obs3 ;
   private String[] T01AP2_A11421Nof_obs4 ;
   private boolean[] T01AP2_n11421Nof_obs4 ;
   private String[] T01AP2_A11422Nof_obs5 ;
   private boolean[] T01AP2_n11422Nof_obs5 ;
   private String[] T01AP2_A11423Nof_obs6 ;
   private boolean[] T01AP2_n11423Nof_obs6 ;
   private String[] T01AP2_A11424Nof_obs7 ;
   private boolean[] T01AP2_n11424Nof_obs7 ;
   private String[] T01AP2_A11425Nof_obs8 ;
   private boolean[] T01AP2_n11425Nof_obs8 ;
   private String[] T01AP2_A11426Nof_obs9 ;
   private boolean[] T01AP2_n11426Nof_obs9 ;
   private String[] T01AP2_A11427Nof_obs10 ;
   private boolean[] T01AP2_n11427Nof_obs10 ;
   private String[] T01AP2_A11428Nof_obs11 ;
   private boolean[] T01AP2_n11428Nof_obs11 ;
   private String[] T01AP14_A396EmprCod ;
   private int[] T01AP14_A11103Nof_Hdr ;
   private byte[] T01AP14_A11104Nof_r ;
   private String[] T01AP14_A11105Nof_p ;
   private String[] T01AP15_A407EmprNom ;
   private boolean[] T01AP15_n407EmprNom ;
   private String[] T01AP16_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tnofart__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnofart__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnofart__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnofart__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnofart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AP2", "SELECT Nof_nc, Nof_enc, EmprCod, TrnCod, Nof_Hdr, Nof_r, Nof_p, Nof_Pd, Nof_Mcot, Nof_Pp, Nof_Ag, Nof_c1, Nof_c2, Nof_bo, Nof_bob, Nof_boe, Nof_Bov, Nof_c3, Nof_tns, Nof_tnc, Nof_c4, Nof_ct, Nof_c5, Nof_scs, Nof_scc, Nof_c6, Nof_cctse, Nof_ccttp, Nof_cctet, Nof_ccp, Nof_cct, Nof_ccpc, Nof_cctq, Nof_cccc, Nof_ccec, Nof_ccmc1, Nof_ccmc2, Nof_ccmc3, Nof_ccmc4, Nof_ccmc5, Nof_ccmc6, Nof_c7, Nof_rb, Nof_rbi, Nof_rbe, Nof_rbp, Nof_rboc, Nof_rb1, Nof_rb3, Nof_c8, Nof_ep1, Nof_ep2, Nof_ep3, Nof_ep4, Nof_ep5, Nof_ep6, Nof_ep7, Nof_ep8, Nof_ep9, Nof_ep10, Nof_c9, Nof_sa1, Nof_sa2, Nof_sa3, Nof_sa4, Nof_sa5, Nof_sa6, Nof_c10, Nof_stk, Nof_Lbta, Nof_Lbtp, Nof_c11, Nof_c12, Nof_imp1, Nof_imp2, Nof_imp3, Nof_imp4, Nof_imp5, Nof_imp6, Nof_imp7, Nof_imp8, Nof_imp9, Nof_imp10, Nof_imp11, Nof_lavado, Nof_luz, Nof_sudor, Nof_cloro, Nof_aguam, Nof_termom, Nof_humeda, Nof_oekote, Nof_obs1, Nof_obs2, Nof_obs3, Nof_obs4, Nof_obs5, Nof_obs6, Nof_obs7, Nof_obs8, Nof_obs9, Nof_obs10, Nof_obs11 FROM TXPNOFART WHERE EmprCod = ? AND Nof_Hdr = ? AND Nof_r = ? AND Nof_p = ?  FOR UPDATE OF Nof_Pd, Nof_Mcot, Nof_Pp, Nof_Ag, Nof_c1, Nof_c2, Nof_bo, Nof_bob, Nof_boe, Nof_Bov, Nof_c3, Nof_tns, Nof_tnc, Nof_c4, Nof_ct, Nof_c5, Nof_scs, Nof_scc, Nof_c6, Nof_cctse, Nof_ccttp, Nof_cctet, Nof_ccp, Nof_cct, Nof_ccpc, Nof_cctq, Nof_cccc, Nof_ccec, Nof_ccmc1, Nof_ccmc2, Nof_ccmc3, Nof_ccmc4, Nof_ccmc5, Nof_ccmc6, Nof_c7, Nof_rb, Nof_rbi, Nof_rbe, Nof_rbp, Nof_rboc, Nof_rb1, Nof_rb3, Nof_c8, Nof_ep1, Nof_ep2, Nof_ep3, Nof_ep4, Nof_ep5, Nof_ep6, Nof_ep7, Nof_ep8, Nof_ep9, Nof_ep10, Nof_c9, Nof_sa1, Nof_sa2, Nof_sa3, Nof_sa4, Nof_sa5, Nof_sa6, Nof_c10, Nof_stk, Nof_Lbta, Nof_Lbtp, Nof_c11, Nof_c12, Nof_imp1, Nof_imp2, Nof_imp3, Nof_imp4, Nof_imp5, Nof_imp6, Nof_imp7, Nof_imp8, Nof_imp9, Nof_imp10, Nof_imp11, Nof_lavado, Nof_luz, Nof_sudor, Nof_cloro, Nof_aguam, Nof_termom, Nof_humeda, Nof_oekote, Nof_obs1, Nof_obs2, Nof_obs3, Nof_obs4, Nof_obs5, Nof_obs6, Nof_obs7, Nof_obs8, Nof_obs9, Nof_obs10, Nof_obs11, Nof_nc, Nof_enc, TrnCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP3", "SELECT Nof_nc, Nof_enc, EmprCod, TrnCod, Nof_Hdr, Nof_r, Nof_p, Nof_Pd, Nof_Mcot, Nof_Pp, Nof_Ag, Nof_c1, Nof_c2, Nof_bo, Nof_bob, Nof_boe, Nof_Bov, Nof_c3, Nof_tns, Nof_tnc, Nof_c4, Nof_ct, Nof_c5, Nof_scs, Nof_scc, Nof_c6, Nof_cctse, Nof_ccttp, Nof_cctet, Nof_ccp, Nof_cct, Nof_ccpc, Nof_cctq, Nof_cccc, Nof_ccec, Nof_ccmc1, Nof_ccmc2, Nof_ccmc3, Nof_ccmc4, Nof_ccmc5, Nof_ccmc6, Nof_c7, Nof_rb, Nof_rbi, Nof_rbe, Nof_rbp, Nof_rboc, Nof_rb1, Nof_rb3, Nof_c8, Nof_ep1, Nof_ep2, Nof_ep3, Nof_ep4, Nof_ep5, Nof_ep6, Nof_ep7, Nof_ep8, Nof_ep9, Nof_ep10, Nof_c9, Nof_sa1, Nof_sa2, Nof_sa3, Nof_sa4, Nof_sa5, Nof_sa6, Nof_c10, Nof_stk, Nof_Lbta, Nof_Lbtp, Nof_c11, Nof_c12, Nof_imp1, Nof_imp2, Nof_imp3, Nof_imp4, Nof_imp5, Nof_imp6, Nof_imp7, Nof_imp8, Nof_imp9, Nof_imp10, Nof_imp11, Nof_lavado, Nof_luz, Nof_sudor, Nof_cloro, Nof_aguam, Nof_termom, Nof_humeda, Nof_oekote, Nof_obs1, Nof_obs2, Nof_obs3, Nof_obs4, Nof_obs5, Nof_obs6, Nof_obs7, Nof_obs8, Nof_obs9, Nof_obs10, Nof_obs11 FROM TXPNOFART WHERE EmprCod = ? AND Nof_Hdr = ? AND Nof_r = ? AND Nof_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP5", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP6", "SELECT /*+ FIRST_ROWS(1) */ TM1.Nof_nc, TM1.Nof_enc, TM1.EmprCod, TM1.TrnCod, TM1.Nof_Hdr, TM1.Nof_r, TM1.Nof_p, T2.EmprNom, TM1.Nof_Pd, TM1.Nof_Mcot, TM1.Nof_Pp, TM1.Nof_Ag, TM1.Nof_c1, TM1.Nof_c2, TM1.Nof_bo, TM1.Nof_bob, TM1.Nof_boe, TM1.Nof_Bov, TM1.Nof_c3, TM1.Nof_tns, TM1.Nof_tnc, TM1.Nof_c4, TM1.Nof_ct, TM1.Nof_c5, TM1.Nof_scs, TM1.Nof_scc, TM1.Nof_c6, TM1.Nof_cctse, TM1.Nof_ccttp, TM1.Nof_cctet, TM1.Nof_ccp, TM1.Nof_cct, TM1.Nof_ccpc, TM1.Nof_cctq, TM1.Nof_cccc, TM1.Nof_ccec, TM1.Nof_ccmc1, TM1.Nof_ccmc2, TM1.Nof_ccmc3, TM1.Nof_ccmc4, TM1.Nof_ccmc5, TM1.Nof_ccmc6, TM1.Nof_c7, TM1.Nof_rb, TM1.Nof_rbi, TM1.Nof_rbe, TM1.Nof_rbp, TM1.Nof_rboc, TM1.Nof_rb1, TM1.Nof_rb3, TM1.Nof_c8, TM1.Nof_ep1, TM1.Nof_ep2, TM1.Nof_ep3, TM1.Nof_ep4, TM1.Nof_ep5, TM1.Nof_ep6, TM1.Nof_ep7, TM1.Nof_ep8, TM1.Nof_ep9, TM1.Nof_ep10, TM1.Nof_c9, TM1.Nof_sa1, TM1.Nof_sa2, TM1.Nof_sa3, TM1.Nof_sa4, TM1.Nof_sa5, TM1.Nof_sa6, TM1.Nof_c10, TM1.Nof_stk, TM1.Nof_Lbta, TM1.Nof_Lbtp, TM1.Nof_c11, TM1.Nof_c12, TM1.Nof_imp1, TM1.Nof_imp2, TM1.Nof_imp3, TM1.Nof_imp4, TM1.Nof_imp5, TM1.Nof_imp6, TM1.Nof_imp7, TM1.Nof_imp8, TM1.Nof_imp9, TM1.Nof_imp10, TM1.Nof_imp11, TM1.Nof_lavado, TM1.Nof_luz, TM1.Nof_sudor, TM1.Nof_cloro, TM1.Nof_aguam, TM1.Nof_termom, TM1.Nof_humeda, TM1.Nof_oekote, TM1.Nof_obs1, TM1.Nof_obs2, TM1.Nof_obs3, TM1.Nof_obs4, TM1.Nof_obs5, TM1.Nof_obs6, TM1.Nof_obs7, TM1.Nof_obs8, TM1.Nof_obs9, TM1.Nof_obs10, TM1.Nof_obs11 FROM (TXPNOFART TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Nof_Hdr = ? and TM1.Nof_r = ? and TM1.Nof_p = ? ORDER BY TM1.EmprCod, TM1.Nof_Hdr, TM1.Nof_r, TM1.Nof_p ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP7", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Nof_Hdr, Nof_r, Nof_p FROM TXPNOFART WHERE EmprCod = ? AND Nof_Hdr = ? AND Nof_r = ? AND Nof_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Nof_Hdr, Nof_r, Nof_p FROM TXPNOFART WHERE EmprCod = ? and Nof_Hdr = ? and Nof_r = ? and Nof_p = ? ORDER BY EmprCod, Nof_Hdr, Nof_r, Nof_p) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Nof_Hdr, Nof_r, Nof_p FROM TXPNOFART WHERE EmprCod = ? and Nof_Hdr = ? and Nof_r = ? and Nof_p = ? ORDER BY EmprCod DESC, Nof_Hdr DESC, Nof_r DESC, Nof_p DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AP11", "INSERT INTO TXPNOFART(Nof_Hdr, Nof_r, Nof_p, Nof_Pd, Nof_Mcot, Nof_Pp, Nof_Ag, Nof_c1, Nof_c2, Nof_bo, Nof_bob, Nof_boe, Nof_Bov, Nof_c3, Nof_tns, Nof_tnc, Nof_c4, Nof_ct, Nof_c5, Nof_scs, Nof_scc, Nof_c6, Nof_cctse, Nof_ccttp, Nof_cctet, Nof_ccp, Nof_cct, Nof_ccpc, Nof_cctq, Nof_cccc, Nof_ccec, Nof_ccmc1, Nof_ccmc2, Nof_ccmc3, Nof_ccmc4, Nof_ccmc5, Nof_ccmc6, Nof_c7, Nof_rb, Nof_rbi, Nof_rbe, Nof_rbp, Nof_rboc, Nof_rb1, Nof_rb3, Nof_c8, Nof_ep1, Nof_ep2, Nof_ep3, Nof_ep4, Nof_ep5, Nof_ep6, Nof_ep7, Nof_ep8, Nof_ep9, Nof_ep10, Nof_c9, Nof_sa1, Nof_sa2, Nof_sa3, Nof_sa4, Nof_sa5, Nof_sa6, Nof_c10, Nof_stk, Nof_Lbta, Nof_Lbtp, Nof_c11, Nof_c12, Nof_imp1, Nof_imp2, Nof_imp3, Nof_imp4, Nof_imp5, Nof_imp6, Nof_imp7, Nof_imp8, Nof_imp9, Nof_imp10, Nof_imp11, Nof_lavado, Nof_luz, Nof_sudor, Nof_cloro, Nof_aguam, Nof_termom, Nof_humeda, Nof_oekote, Nof_obs1, Nof_obs2, Nof_obs3, Nof_obs4, Nof_obs5, Nof_obs6, Nof_obs7, Nof_obs8, Nof_obs9, Nof_obs10, Nof_obs11, Nof_nc, Nof_enc, EmprCod, TrnCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPNOFART")
         ,new UpdateCursor("T01AP12", "UPDATE TXPNOFART SET Nof_Pd=?, Nof_Mcot=?, Nof_Pp=?, Nof_Ag=?, Nof_c1=?, Nof_c2=?, Nof_bo=?, Nof_bob=?, Nof_boe=?, Nof_Bov=?, Nof_c3=?, Nof_tns=?, Nof_tnc=?, Nof_c4=?, Nof_ct=?, Nof_c5=?, Nof_scs=?, Nof_scc=?, Nof_c6=?, Nof_cctse=?, Nof_ccttp=?, Nof_cctet=?, Nof_ccp=?, Nof_cct=?, Nof_ccpc=?, Nof_cctq=?, Nof_cccc=?, Nof_ccec=?, Nof_ccmc1=?, Nof_ccmc2=?, Nof_ccmc3=?, Nof_ccmc4=?, Nof_ccmc5=?, Nof_ccmc6=?, Nof_c7=?, Nof_rb=?, Nof_rbi=?, Nof_rbe=?, Nof_rbp=?, Nof_rboc=?, Nof_rb1=?, Nof_rb3=?, Nof_c8=?, Nof_ep1=?, Nof_ep2=?, Nof_ep3=?, Nof_ep4=?, Nof_ep5=?, Nof_ep6=?, Nof_ep7=?, Nof_ep8=?, Nof_ep9=?, Nof_ep10=?, Nof_c9=?, Nof_sa1=?, Nof_sa2=?, Nof_sa3=?, Nof_sa4=?, Nof_sa5=?, Nof_sa6=?, Nof_c10=?, Nof_stk=?, Nof_Lbta=?, Nof_Lbtp=?, Nof_c11=?, Nof_c12=?, Nof_imp1=?, Nof_imp2=?, Nof_imp3=?, Nof_imp4=?, Nof_imp5=?, Nof_imp6=?, Nof_imp7=?, Nof_imp8=?, Nof_imp9=?, Nof_imp10=?, Nof_imp11=?, Nof_lavado=?, Nof_luz=?, Nof_sudor=?, Nof_cloro=?, Nof_aguam=?, Nof_termom=?, Nof_humeda=?, Nof_oekote=?, Nof_obs1=?, Nof_obs2=?, Nof_obs3=?, Nof_obs4=?, Nof_obs5=?, Nof_obs6=?, Nof_obs7=?, Nof_obs8=?, Nof_obs9=?, Nof_obs10=?, Nof_obs11=?, Nof_nc=?, Nof_enc=?, TrnCod=?  WHERE EmprCod = ? AND Nof_Hdr = ? AND Nof_r = ? AND Nof_p = ?", GX_NOMASK, "TXPNOFART")
         ,new UpdateCursor("T01AP13", "DELETE FROM TXPNOFART  WHERE EmprCod = ? AND Nof_Hdr = ? AND Nof_r = ? AND Nof_p = ?", GX_NOMASK, "TXPNOFART")
         ,new ForEachCursor("T01AP14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Nof_Hdr, Nof_r, Nof_p FROM TXPNOFART WHERE EmprCod = ? and Nof_Hdr = ? and Nof_r = ? and Nof_p = ? ORDER BY EmprCod, Nof_Hdr, Nof_r, Nof_p ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AP16", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 1);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(61);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(69, 1);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(70, 40);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getVarchar(72);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getVarchar(73);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((String[]) buf[142])[0] = rslt.getString(74, 1);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((String[]) buf[144])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((String[]) buf[156])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((String[]) buf[160])[0] = rslt.getString(83, 1);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(84, 1);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(85, 10);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((String[]) buf[166])[0] = rslt.getString(86, 10);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(87, 10);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(88, 10);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(89, 10);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(90, 10);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[176])[0] = rslt.getBigDecimal(91,2);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(95, 1);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(102, 1);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getString(103, 1);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 1);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getVarchar(61);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(69, 1);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(70, 40);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getVarchar(72);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getVarchar(73);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((String[]) buf[142])[0] = rslt.getString(74, 1);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((String[]) buf[144])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((String[]) buf[156])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((String[]) buf[160])[0] = rslt.getString(83, 1);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(84, 1);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(85, 10);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((String[]) buf[166])[0] = rslt.getString(86, 10);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(87, 10);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(88, 10);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(89, 10);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(90, 10);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[176])[0] = rslt.getBigDecimal(91,2);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(95, 1);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(102, 1);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getString(103, 1);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((byte[]) buf[58])[0] = rslt.getByte(32);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((short[]) buf[90])[0] = rslt.getShort(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(50, 1);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 1);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getVarchar(62);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getString(68, 1);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getVarchar(69);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(70, 1);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(71, 40);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(72);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getVarchar(73);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((String[]) buf[142])[0] = rslt.getVarchar(74);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((String[]) buf[144])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((String[]) buf[156])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((String[]) buf[160])[0] = rslt.getString(83, 1);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(84, 1);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((String[]) buf[166])[0] = rslt.getString(86, 10);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(87, 10);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(88, 10);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(89, 10);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(90, 10);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((String[]) buf[176])[0] = rslt.getString(91, 10);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[178])[0] = rslt.getBigDecimal(92,2);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(95, 1);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(101, 1);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(102, 1);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getString(103, 1);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((String[]) buf[202])[0] = rslt.getString(104, 1);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 200);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 200);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 200);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 200);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 200);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[40], 200);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[50]).byteValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[58], 1);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[60], 1);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[62], 1);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[66], 1);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[68], 1);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[70], 1);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[72], 200);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[74], 1);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[76], 1);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[78], 1);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[80], 1);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[82]).shortValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[84], 1);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[86], 1);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[88], 200);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[90], 1);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[92], 1);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[94], 1);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[96], 1);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[98], 1);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[100], 1);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[102], 1);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[104], 1);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[106], 1);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[108], 1);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(57, (String)parms[110], 200);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[112], 1);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[114], 1);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[116], 1);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[118], 1);
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[120], 1);
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[122], 1);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(64, (String)parms[124], 200);
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[126], 1);
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(66, (String)parms[128], 40);
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[130]).shortValue());
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(68, (String)parms[132], 200);
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(69, (String)parms[134], 200);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[136], 1);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[138], 1);
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[140], 1);
               }
               if ( ((Boolean) parms[141]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[142], 1);
               }
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[144], 1);
               }
               if ( ((Boolean) parms[145]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[146], 1);
               }
               if ( ((Boolean) parms[147]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[148], 1);
               }
               if ( ((Boolean) parms[149]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[150], 1);
               }
               if ( ((Boolean) parms[151]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[152], 1);
               }
               if ( ((Boolean) parms[153]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[154], 1);
               }
               if ( ((Boolean) parms[155]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[156], 1);
               }
               if ( ((Boolean) parms[157]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[158], 10);
               }
               if ( ((Boolean) parms[159]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[160], 10);
               }
               if ( ((Boolean) parms[161]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[162], 10);
               }
               if ( ((Boolean) parms[163]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[164], 10);
               }
               if ( ((Boolean) parms[165]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[166], 10);
               }
               if ( ((Boolean) parms[167]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[168], 10);
               }
               if ( ((Boolean) parms[169]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(87, (java.math.BigDecimal)parms[170], 2);
               }
               if ( ((Boolean) parms[171]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[172], 1);
               }
               if ( ((Boolean) parms[173]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[174], 1);
               }
               if ( ((Boolean) parms[175]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[176], 1);
               }
               if ( ((Boolean) parms[177]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[178], 1);
               }
               if ( ((Boolean) parms[179]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[180], 1);
               }
               if ( ((Boolean) parms[181]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[182], 1);
               }
               if ( ((Boolean) parms[183]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[184], 1);
               }
               if ( ((Boolean) parms[185]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[186], 1);
               }
               if ( ((Boolean) parms[187]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[188], 1);
               }
               if ( ((Boolean) parms[189]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[190], 1);
               }
               if ( ((Boolean) parms[191]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[192], 1);
               }
               if ( ((Boolean) parms[193]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(99, (String)parms[194], 1);
               }
               if ( ((Boolean) parms[195]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(100, ((Number) parms[196]).byteValue());
               }
               if ( ((Boolean) parms[197]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(101, (java.math.BigDecimal)parms[198], 2);
               }
               stmt.setString(102, (String)parms[199], 3);
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(103, ((Number) parms[201]).shortValue());
               }
               return;
            case 10 :
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
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
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
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 200);
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
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 200);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 200);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 1);
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
                  stmt.setString(29, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
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
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 200);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 1);
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
                  stmt.setShort(40, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[85], 200);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[87], 1);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[89], 1);
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
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[93], 1);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[95], 1);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[97], 1);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[99], 1);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[101], 1);
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
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 1);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(54, (String)parms[107], 200);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[109], 1);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[111], 1);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[113], 1);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[115], 1);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[117], 1);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(61, (String)parms[121], 200);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[123], 1);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[125], 40);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[127]).shortValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(65, (String)parms[129], 200);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[131], 200);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[133], 1);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[135], 1);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[137], 1);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[139], 1);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[141], 1);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[143], 1);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[145], 1);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[147], 1);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[149], 1);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[151], 1);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[153], 1);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[155], 10);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[157], 10);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[159], 10);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[161], 10);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[163], 10);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[165], 10);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(84, (java.math.BigDecimal)parms[167], 2);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[169], 1);
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[171], 1);
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[173], 1);
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[175], 1);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[177], 1);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[179], 1);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[181], 1);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[183], 1);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[185], 1);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[187], 1);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[189], 1);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[191], 1);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(97, ((Number) parms[193]).byteValue());
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(98, (java.math.BigDecimal)parms[195], 2);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(99, ((Number) parms[197]).shortValue());
               }
               stmt.setString(100, (String)parms[198], 3);
               stmt.setInt(101, ((Number) parms[199]).intValue());
               stmt.setByte(102, ((Number) parms[200]).byteValue());
               stmt.setString(103, (String)parms[201], 1);
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
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
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
      }
   }

}

