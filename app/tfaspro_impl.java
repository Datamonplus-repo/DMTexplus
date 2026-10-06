package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfaspro_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa138081145( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa77441145( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel22"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa47911145( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel24"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel25"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel26"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel27"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa70571145( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel28"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel29"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa138091145( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel30"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel31"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa53681145( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel32"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel33"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa71051145( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel34"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel35"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel36"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel37"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel38"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_62") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_62( A396EmprCod, A602MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_63") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6162SecCodF = httpContext.GetPar( "SecCodF") ;
         n6162SecCodF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_63( A396EmprCod, A6162SecCodF) ;
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
            AV73EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73EmprCod", AV73EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73EmprCod, "@!"))));
            AV81FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81FasCod", AV81FasCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81FasCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FASES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tfaspro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfaspro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfaspro_impl.class ));
   }

   public tfaspro_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkFasActiva = UIFactory.getCheckbox(this);
      cmbFasActTin = new HTMLChoice();
      cmbFasCon = new HTMLChoice();
      cmbFasAcab = new HTMLChoice();
      cmbFasForMul = new HTMLChoice();
      cmbFasConPla = new HTMLChoice();
      cmbFasObl = new HTMLChoice();
      cmbFasTip = new HTMLChoice();
      cmbFasGral = new HTMLChoice();
      cmbFasPesInt = new HTMLChoice();
      cmbFasPesExp = new HTMLChoice();
      cmbFasH2OReh = new HTMLChoice();
      chkFasOpeIns = UIFactory.getCheckbox(this);
      chkFasCarda = UIFactory.getCheckbox(this);
      cmbFasEstamp = new HTMLChoice();
      chkFasPreObl = UIFactory.getCheckbox(this);
      chkFasNorma = UIFactory.getCheckbox(this);
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
      A14042FasActiva = ((GXutil.strcmp(GXutil.rtrim( A14042FasActiva), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
      if ( cmbFasActTin.getItemCount() > 0 )
      {
         A456FasActTin = cmbFasActTin.getValidValue(A456FasActTin) ;
         n456FasActTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasActTin.setValue( GXutil.rtrim( A456FasActTin) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasActTin.getInternalname(), "Values", cmbFasActTin.ToJavascriptSource(), true);
      }
      if ( cmbFasCon.getItemCount() > 0 )
      {
         A458FasCon = cmbFasCon.getValidValue(A458FasCon) ;
         n458FasCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasCon.setValue( GXutil.rtrim( A458FasCon) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasCon.getInternalname(), "Values", cmbFasCon.ToJavascriptSource(), true);
      }
      if ( cmbFasAcab.getItemCount() > 0 )
      {
         A4903FasAcab = cmbFasAcab.getValidValue(A4903FasAcab) ;
         n4903FasAcab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasAcab.setValue( GXutil.rtrim( A4903FasAcab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasAcab.getInternalname(), "Values", cmbFasAcab.ToJavascriptSource(), true);
      }
      if ( cmbFasForMul.getItemCount() > 0 )
      {
         A4286FasForMul = cmbFasForMul.getValidValue(A4286FasForMul) ;
         n4286FasForMul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasForMul.setValue( GXutil.rtrim( A4286FasForMul) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasForMul.getInternalname(), "Values", cmbFasForMul.ToJavascriptSource(), true);
      }
      if ( cmbFasConPla.getItemCount() > 0 )
      {
         A4299FasConPla = cmbFasConPla.getValidValue(A4299FasConPla) ;
         n4299FasConPla = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasConPla.setValue( GXutil.rtrim( A4299FasConPla) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasConPla.getInternalname(), "Values", cmbFasConPla.ToJavascriptSource(), true);
      }
      if ( cmbFasObl.getItemCount() > 0 )
      {
         A7105FasObl = cmbFasObl.getValidValue(A7105FasObl) ;
         n7105FasObl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasObl.setValue( GXutil.rtrim( A7105FasObl) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasObl.getInternalname(), "Values", cmbFasObl.ToJavascriptSource(), true);
      }
      if ( cmbFasTip.getItemCount() > 0 )
      {
         A6011FasTip = cmbFasTip.getValidValue(A6011FasTip) ;
         n6011FasTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasTip.setValue( GXutil.rtrim( A6011FasTip) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasTip.getInternalname(), "Values", cmbFasTip.ToJavascriptSource(), true);
      }
      if ( cmbFasGral.getItemCount() > 0 )
      {
         A5368FasGral = cmbFasGral.getValidValue(A5368FasGral) ;
         n5368FasGral = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasGral.setValue( GXutil.rtrim( A5368FasGral) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasGral.getInternalname(), "Values", cmbFasGral.ToJavascriptSource(), true);
      }
      if ( cmbFasPesInt.getItemCount() > 0 )
      {
         A7059FasPesInt = cmbFasPesInt.getValidValue(A7059FasPesInt) ;
         n7059FasPesInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasPesInt.setValue( GXutil.rtrim( A7059FasPesInt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasPesInt.getInternalname(), "Values", cmbFasPesInt.ToJavascriptSource(), true);
      }
      if ( cmbFasPesExp.getItemCount() > 0 )
      {
         A8888FasPesExp = cmbFasPesExp.getValidValue(A8888FasPesExp) ;
         n8888FasPesExp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasPesExp.setValue( GXutil.rtrim( A8888FasPesExp) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasPesExp.getInternalname(), "Values", cmbFasPesExp.ToJavascriptSource(), true);
      }
      if ( cmbFasH2OReh.getItemCount() > 0 )
      {
         A7600FasH2OReh = cmbFasH2OReh.getValidValue(A7600FasH2OReh) ;
         n7600FasH2OReh = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasH2OReh.setValue( GXutil.rtrim( A7600FasH2OReh) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasH2OReh.getInternalname(), "Values", cmbFasH2OReh.ToJavascriptSource(), true);
      }
      A7057FasOpeIns = ((GXutil.strcmp(GXutil.rtrim( A7057FasOpeIns), "S")==0) ? "S" : "N") ;
      n7057FasOpeIns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
      A13809FasCarda = ((GXutil.strcmp(GXutil.rtrim( A13809FasCarda), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13809FasCarda", A13809FasCarda);
      if ( cmbFasEstamp.getItemCount() > 0 )
      {
         A4343FasEstamp = cmbFasEstamp.getValidValue(A4343FasEstamp) ;
         n4343FasEstamp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasEstamp.setValue( GXutil.rtrim( A4343FasEstamp) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFasEstamp.getInternalname(), "Values", cmbFasEstamp.ToJavascriptSource(), true);
      }
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      A13808FasNorma = ((GXutil.strcmp(GXutil.rtrim( A13808FasNorma), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13808FasNorma", A13808FasNorma);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
      ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
      ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
      ucCombo_maqcod.setProperty("DropDownOptionsData", AV85MaqCod_Data);
      ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtMaqCod_Visible, edtMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasSigla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasSigla_Internalname, httpContext.getMessage( "Siglas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasSigla_Internalname, GXutil.rtrim( A7070FasSigla), GXutil.rtrim( localUtil.format( A7070FasSigla, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasSigla_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasSigla_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkFasActiva.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasActiva.getInternalname(), httpContext.getMessage( "Activa?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasActiva.getInternalname(), A14042FasActiva, "", httpContext.getMessage( "Activa?", ""), 1, chkFasActiva.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(47, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,47);\"");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
      ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
      ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
      ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
      ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
      ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
      ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
      ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
      ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
      ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
      ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, "DVPANEL_UNNAMEDTABLE9Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDec_Internalname, httpContext.getMessage( "Decalage", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDec_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDec2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDec2_Internalname, httpContext.getMessage( "Decalage (Formato decimal)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDec2_Internalname, GXutil.ltrim( localUtil.ntoc( A5990FasDec2, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasDec2_Enabled!=0) ? localUtil.format( A5990FasDec2, "ZZZ9.99") : localUtil.format( A5990FasDec2, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDec2_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreSal_Internalname, httpContext.getMessage( "Tiempo preparacion y salida (Min.)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasPreSal_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPrePie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPrePie_Internalname, httpContext.getMessage( "Tiempo preparacion p/pieza (Min.)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPrePie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasPrePie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasVelPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasVelPro_Internalname, httpContext.getMessage( "Velocidad proceso (Unid./Min.)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasVelPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasVelPro_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasNumPas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasNumPas_Internalname, httpContext.getMessage( "Nº Pases", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasNumPas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasNumPas_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
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
      ucDvpanel_unnamedtable10.setProperty("Width", Dvpanel_unnamedtable10_Width);
      ucDvpanel_unnamedtable10.setProperty("AutoWidth", Dvpanel_unnamedtable10_Autowidth);
      ucDvpanel_unnamedtable10.setProperty("AutoHeight", Dvpanel_unnamedtable10_Autoheight);
      ucDvpanel_unnamedtable10.setProperty("Cls", Dvpanel_unnamedtable10_Cls);
      ucDvpanel_unnamedtable10.setProperty("Title", Dvpanel_unnamedtable10_Title);
      ucDvpanel_unnamedtable10.setProperty("Collapsible", Dvpanel_unnamedtable10_Collapsible);
      ucDvpanel_unnamedtable10.setProperty("Collapsed", Dvpanel_unnamedtable10_Collapsed);
      ucDvpanel_unnamedtable10.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable10_Showcollapseicon);
      ucDvpanel_unnamedtable10.setProperty("IconPosition", Dvpanel_unnamedtable10_Iconposition);
      ucDvpanel_unnamedtable10.setProperty("AutoScroll", Dvpanel_unnamedtable10_Autoscroll);
      ucDvpanel_unnamedtable10.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable10_Internalname, "DVPANEL_UNNAMEDTABLE10Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE10Container"+"UnnamedTable10"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasActTin.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasActTin.getInternalname(), httpContext.getMessage( "Actualizacion Tinte", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasActTin, cmbFasActTin.getInternalname(), GXutil.rtrim( A456FasActTin), 1, cmbFasActTin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasActTin.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasActTin.setValue( GXutil.rtrim( A456FasActTin) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasActTin.getInternalname(), "Values", cmbFasActTin.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasCon.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasCon.getInternalname(), httpContext.getMessage( "Control?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasCon, cmbFasCon.getInternalname(), GXutil.rtrim( A458FasCon), 1, cmbFasCon.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasCon.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasCon.setValue( GXutil.rtrim( A458FasCon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasCon.getInternalname(), "Values", cmbFasCon.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasAcab.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasAcab.getInternalname(), httpContext.getMessage( "Acabado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasAcab, cmbFasAcab.getInternalname(), GXutil.rtrim( A4903FasAcab), 1, cmbFasAcab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasAcab.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasAcab.setValue( GXutil.rtrim( A4903FasAcab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasAcab.getInternalname(), "Values", cmbFasAcab.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasForMul.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasForMul.getInternalname(), httpContext.getMessage( "Formula?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasForMul, cmbFasForMul.getInternalname(), GXutil.rtrim( A4286FasForMul), 1, cmbFasForMul.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasForMul.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasForMul.setValue( GXutil.rtrim( A4286FasForMul) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasForMul.getInternalname(), "Values", cmbFasForMul.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasConPla.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasConPla.getInternalname(), httpContext.getMessage( "Planning?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasConPla, cmbFasConPla.getInternalname(), GXutil.rtrim( A4299FasConPla), 1, cmbFasConPla.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasConPla.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasConPla.setValue( GXutil.rtrim( A4299FasConPla) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasConPla.getInternalname(), "Values", cmbFasConPla.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFasobl_cell_Internalname, 1, 0, "px", 0, "px", divFasobl_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbFasObl.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasObl.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasObl.getInternalname(), httpContext.getMessage( "Oblig?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasObl, cmbFasObl.getInternalname(), GXutil.rtrim( A7105FasObl), 1, cmbFasObl.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbFasObl.getVisible(), cmbFasObl.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasObl.setValue( GXutil.rtrim( A7105FasObl) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasObl.getInternalname(), "Values", cmbFasObl.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_panelotrosdatos.setProperty("Width", Dvpanel_panelotrosdatos_Width);
      ucDvpanel_panelotrosdatos.setProperty("AutoWidth", Dvpanel_panelotrosdatos_Autowidth);
      ucDvpanel_panelotrosdatos.setProperty("AutoHeight", Dvpanel_panelotrosdatos_Autoheight);
      ucDvpanel_panelotrosdatos.setProperty("Cls", Dvpanel_panelotrosdatos_Cls);
      ucDvpanel_panelotrosdatos.setProperty("Title", Dvpanel_panelotrosdatos_Title);
      ucDvpanel_panelotrosdatos.setProperty("Collapsible", Dvpanel_panelotrosdatos_Collapsible);
      ucDvpanel_panelotrosdatos.setProperty("Collapsed", Dvpanel_panelotrosdatos_Collapsed);
      ucDvpanel_panelotrosdatos.setProperty("ShowCollapseIcon", Dvpanel_panelotrosdatos_Showcollapseicon);
      ucDvpanel_panelotrosdatos.setProperty("IconPosition", Dvpanel_panelotrosdatos_Iconposition);
      ucDvpanel_panelotrosdatos.setProperty("AutoScroll", Dvpanel_panelotrosdatos_Autoscroll);
      ucDvpanel_panelotrosdatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelotrosdatos_Internalname, "DVPANEL_PANELOTROSDATOSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELOTROSDATOSContainer"+"PanelOtrosDatos"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblPanelotrosdatos_Internalname, tblPanelotrosdatos_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasTip.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasTip.getInternalname(), httpContext.getMessage( "Salidas Rame/Sanfor?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasTip, cmbFasTip.getInternalname(), GXutil.rtrim( A6011FasTip), 1, cmbFasTip.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasTip.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasTip.setValue( GXutil.rtrim( A6011FasTip) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasTip.getInternalname(), "Values", cmbFasTip.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFasgral_cell_Internalname, 1, 0, "px", 0, "px", divFasgral_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbFasGral.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasGral.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasGral.getInternalname(), httpContext.getMessage( "Solicitar Unidades Lector?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasGral, cmbFasGral.getInternalname(), GXutil.rtrim( A5368FasGral), 1, cmbFasGral.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbFasGral.getVisible(), cmbFasGral.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasGral.setValue( GXutil.rtrim( A5368FasGral) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasGral.getInternalname(), "Values", cmbFasGral.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasPesInt.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasPesInt.getInternalname(), httpContext.getMessage( "Solicitar Peso?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasPesInt, cmbFasPesInt.getInternalname(), GXutil.rtrim( A7059FasPesInt), 1, cmbFasPesInt.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasPesInt.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasPesInt.setValue( GXutil.rtrim( A7059FasPesInt) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasPesInt.getInternalname(), "Values", cmbFasPesInt.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasPesExp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasPesExp.getInternalname(), httpContext.getMessage( "Solicito Peso Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasPesExp, cmbFasPesExp.getInternalname(), GXutil.rtrim( A8888FasPesExp), 1, cmbFasPesExp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasPesExp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,143);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasPesExp.setValue( GXutil.rtrim( A8888FasPesExp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasPesExp.getInternalname(), "Values", cmbFasPesExp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasH2OReh.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasH2OReh.getInternalname(), httpContext.getMessage( "Utliza Agua Rehuso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasH2OReh, cmbFasH2OReh.getInternalname(), GXutil.rtrim( A7600FasH2OReh), 1, cmbFasH2OReh.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasH2OReh.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,147);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasH2OReh.setValue( GXutil.rtrim( A7600FasH2OReh) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasH2OReh.getInternalname(), "Values", cmbFasH2OReh.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='CellMarginTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, divUnnamedtable5_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFasopeins_cell_Internalname, 1, 0, "px", 0, "px", divFasopeins_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasOpeIns.getInternalname(), httpContext.getMessage( "Imprimir Rgto Calidad?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasOpeIns.getInternalname(), A7057FasOpeIns, "", httpContext.getMessage( "Imprimir Rgto Calidad?", ""), chkFasOpeIns.getVisible(), chkFasOpeIns.getEnabled(), "S", httpContext.getMessage( "Imprimir Rgto Calidad?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(154, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,154);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFascarda_cell_Internalname, 1, 0, "px", 0, "px", divFascarda_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasCarda.getInternalname(), httpContext.getMessage( "Imprimir Registro Carda/E/L?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasCarda.getInternalname(), A13809FasCarda, "", httpContext.getMessage( "Imprimir Registro Carda/E/L?", ""), chkFasCarda.getVisible(), chkFasCarda.getEnabled(), "S", httpContext.getMessage( "Imprimir Registro Carda/E/L?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(157, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,157);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='CellMarginTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, divUnnamedtable6_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divCombo_seccodf_cell_Internalname, 1, 0, "px", 0, "px", divCombo_seccodf_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedseccodf_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockseccodf_Internalname, httpContext.getMessage( "Seccion", ""), "", "", lblTextblockseccodf_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_seccodf.setProperty("Caption", Combo_seccodf_Caption);
      ucCombo_seccodf.setProperty("Cls", Combo_seccodf_Cls);
      ucCombo_seccodf.setProperty("EmptyItemText", Combo_seccodf_Emptyitemtext);
      ucCombo_seccodf.setProperty("DropDownOptionsData", AV82SecCodF_Data);
      ucCombo_seccodf.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_seccodf_Internalname, "COMBO_SECCODFContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecCodF_Internalname, httpContext.getMessage( "Seccion", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecCodF_Internalname, GXutil.rtrim( A6162SecCodF), GXutil.rtrim( localUtil.format( A6162SecCodF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecCodF_Jsonclick, 0, "Attribute", "", "", "", "", edtSecCodF_Visible, edtSecCodF_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, divUnnamedtable7_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFasvalmtr_cell_Internalname, 1, 0, "px", 0, "px", divFasvalmtr_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtFasValMtr_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasValMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasValMtr_Internalname, httpContext.getMessage( "Coste Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasValMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4791FasValMtr, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasValMtr_Enabled!=0) ? localUtil.format( A4791FasValMtr, "ZZZZZ9.99999") : localUtil.format( A4791FasValMtr, "ZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasValMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", edtFasValMtr_Visible, edtFasValMtr_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasObsF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasObsF_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtFasObsF_Internalname, A9838FasObsF, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,187);\"", (short)(0), 1, edtFasObsF_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable3_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable3_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasEstamp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFasEstamp.getInternalname(), httpContext.getMessage( "Estampacion?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasEstamp, cmbFasEstamp.getInternalname(), GXutil.rtrim( A4343FasEstamp), 1, cmbFasEstamp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasEstamp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,197);\"", "", true, (byte)(0), "HLP_TFASPRO.htm");
      cmbFasEstamp.setValue( GXutil.rtrim( A4343FasEstamp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasEstamp.getInternalname(), "Values", cmbFasEstamp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreMC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreMC_Internalname, httpContext.getMessage( "Tiempo prep Mol_Cil", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreMC_Internalname, GXutil.ltrim( localUtil.ntoc( A5168FasPreMC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreMC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5168FasPreMC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5168FasPreMC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreMC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasPreMC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFaspreobl_cell_Internalname, 1, 0, "px", 0, "px", divFaspreobl_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasPreObl.getInternalname(), httpContext.getMessage( "Precio Obligatorio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasPreObl.getInternalname(), GXutil.str( A7744FasPreObl, 1, 0), "", httpContext.getMessage( "Precio Obligatorio", ""), chkFasPreObl.getVisible(), chkFasPreObl.getEnabled(), "1", httpContext.getMessage( "Precio Obligatorio", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(204, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,204);\"");
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
      app.GxWebStd.gx_div_start( httpContext, divFasnorma_cell_Internalname, 1, 0, "px", 0, "px", divFasnorma_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasNorma.getInternalname(), httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasNorma.getInternalname(), A13808FasNorma, "", httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", ""), chkFasNorma.getVisible(), chkFasNorma.getEnabled(), "S", httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(208, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,208);\"");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPRO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV88Pgmname), GXutil.rtrim( localUtil.format( AV88Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_maqcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombomaqcod_Internalname, GXutil.rtrim( AV86ComboMaqCod), GXutil.rtrim( localUtil.format( AV86ComboMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombomaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombomaqcod_Visible, edtavCombomaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_seccodf_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboseccodf_Internalname, GXutil.rtrim( AV84ComboSecCodF), GXutil.rtrim( localUtil.format( AV84ComboSecCodF, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboseccodf_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboseccodf_Visible, edtavComboseccodf_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e11112 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV85MaqCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSECCODF_DATA"), AV82SecCodF_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z4588FasCC = httpContext.cgiGet( "Z4588FasCC") ;
            Z460FasDsc = httpContext.cgiGet( "Z460FasDsc") ;
            Z7070FasSigla = httpContext.cgiGet( "Z7070FasSigla") ;
            Z459FasDec = localUtil.ctond( httpContext.cgiGet( "Z459FasDec")) ;
            Z5990FasDec2 = localUtil.ctond( httpContext.cgiGet( "Z5990FasDec2")) ;
            Z469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( "Z469FasPreSal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( "Z468FasPrePie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z472FasVelPro = localUtil.ctond( httpContext.cgiGet( "Z472FasVelPro")) ;
            Z464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( "Z464FasNumPas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z456FasActTin = httpContext.cgiGet( "Z456FasActTin") ;
            Z458FasCon = httpContext.cgiGet( "Z458FasCon") ;
            Z4903FasAcab = httpContext.cgiGet( "Z4903FasAcab") ;
            Z4286FasForMul = httpContext.cgiGet( "Z4286FasForMul") ;
            Z4299FasConPla = httpContext.cgiGet( "Z4299FasConPla") ;
            Z4343FasEstamp = httpContext.cgiGet( "Z4343FasEstamp") ;
            Z5168FasPreMC = (short)(localUtil.ctol( httpContext.cgiGet( "Z5168FasPreMC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4791FasValMtr = localUtil.ctond( httpContext.cgiGet( "Z4791FasValMtr")) ;
            Z5232FasProCtb = httpContext.cgiGet( "Z5232FasProCtb") ;
            Z5616FasTExt = httpContext.cgiGet( "Z5616FasTExt") ;
            Z6011FasTip = httpContext.cgiGet( "Z6011FasTip") ;
            Z7105FasObl = httpContext.cgiGet( "Z7105FasObl") ;
            Z7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7744FasPreObl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5368FasGral = httpContext.cgiGet( "Z5368FasGral") ;
            Z6880FasFGp = localUtil.ctond( httpContext.cgiGet( "Z6880FasFGp")) ;
            Z7059FasPesInt = httpContext.cgiGet( "Z7059FasPesInt") ;
            Z8888FasPesExp = httpContext.cgiGet( "Z8888FasPesExp") ;
            Z9838FasObsF = httpContext.cgiGet( "Z9838FasObsF") ;
            Z7600FasH2OReh = httpContext.cgiGet( "Z7600FasH2OReh") ;
            Z7057FasOpeIns = httpContext.cgiGet( "Z7057FasOpeIns") ;
            Z7058FasGrupo = (int)(localUtil.ctol( httpContext.cgiGet( "Z7058FasGrupo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z471FasUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z471FasUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13808FasNorma = httpContext.cgiGet( "Z13808FasNorma") ;
            Z13809FasCarda = httpContext.cgiGet( "Z13809FasCarda") ;
            Z14042FasActiva = httpContext.cgiGet( "Z14042FasActiva") ;
            Z14043FasSalida = httpContext.cgiGet( "Z14043FasSalida") ;
            Z14044FastoVtx = httpContext.cgiGet( "Z14044FastoVtx") ;
            Z14045FasMtsAnc = httpContext.cgiGet( "Z14045FasMtsAnc") ;
            Z14046FasInsAlb = httpContext.cgiGet( "Z14046FasInsAlb") ;
            Z14047FasTubos = httpContext.cgiGet( "Z14047FasTubos") ;
            Z14048FasStki = httpContext.cgiGet( "Z14048FasStki") ;
            Z14049FasCops = httpContext.cgiGet( "Z14049FasCops") ;
            Z14050FasClsHdr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14050FasClsHdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14051FasStkT = httpContext.cgiGet( "Z14051FasStkT") ;
            Z14052FasPrefj = httpContext.cgiGet( "Z14052FasPrefj") ;
            Z14053FasFinHdr = httpContext.cgiGet( "Z14053FasFinHdr") ;
            Z14054FasDivTime = httpContext.cgiGet( "Z14054FasDivTime") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z6162SecCodF = httpContext.cgiGet( "Z6162SecCodF") ;
            A4588FasCC = httpContext.cgiGet( "Z4588FasCC") ;
            n4588FasCC = false ;
            A5232FasProCtb = httpContext.cgiGet( "Z5232FasProCtb") ;
            n5232FasProCtb = false ;
            A5616FasTExt = httpContext.cgiGet( "Z5616FasTExt") ;
            n5616FasTExt = false ;
            A6880FasFGp = localUtil.ctond( httpContext.cgiGet( "Z6880FasFGp")) ;
            n6880FasFGp = false ;
            A7058FasGrupo = (int)(localUtil.ctol( httpContext.cgiGet( "Z7058FasGrupo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7058FasGrupo = false ;
            A471FasUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z471FasUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14043FasSalida = httpContext.cgiGet( "Z14043FasSalida") ;
            A14044FastoVtx = httpContext.cgiGet( "Z14044FastoVtx") ;
            A14045FasMtsAnc = httpContext.cgiGet( "Z14045FasMtsAnc") ;
            A14046FasInsAlb = httpContext.cgiGet( "Z14046FasInsAlb") ;
            A14047FasTubos = httpContext.cgiGet( "Z14047FasTubos") ;
            A14048FasStki = httpContext.cgiGet( "Z14048FasStki") ;
            A14049FasCops = httpContext.cgiGet( "Z14049FasCops") ;
            A14050FasClsHdr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14050FasClsHdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14051FasStkT = httpContext.cgiGet( "Z14051FasStkT") ;
            A14052FasPrefj = httpContext.cgiGet( "Z14052FasPrefj") ;
            A14053FasFinHdr = httpContext.cgiGet( "Z14053FasFinHdr") ;
            A14054FasDivTime = httpContext.cgiGet( "Z14054FasDivTime") ;
            O460FasDsc = httpContext.cgiGet( "O460FasDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N602MaqCod = httpContext.cgiGet( "N602MaqCod") ;
            N6162SecCodF = httpContext.cgiGet( "N6162SecCodF") ;
            A13781FasCDsc = httpContext.cgiGet( "FASCDSC") ;
            AV73EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV81FasCod = httpContext.cgiGet( "vFASCOD") ;
            AV78Insert_MaqCod = httpContext.cgiGet( "vINSERT_MAQCOD") ;
            AV79Insert_SecCodF = httpContext.cgiGet( "vINSERT_SECCODF") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4588FasCC = httpContext.cgiGet( "FASCC") ;
            A5616FasTExt = httpContext.cgiGet( "FASTEXT") ;
            A5232FasProCtb = httpContext.cgiGet( "FASPROCTB") ;
            A6880FasFGp = localUtil.ctond( httpContext.cgiGet( "FASFGP")) ;
            A7058FasGrupo = (int)(localUtil.ctol( httpContext.cgiGet( "FASGRUPO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A471FasUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "FASULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14043FasSalida = httpContext.cgiGet( "FASSALIDA") ;
            A14044FastoVtx = httpContext.cgiGet( "FASTOVTX") ;
            A14045FasMtsAnc = httpContext.cgiGet( "FASMTSANC") ;
            A14046FasInsAlb = httpContext.cgiGet( "FASINSALB") ;
            A14047FasTubos = httpContext.cgiGet( "FASTUBOS") ;
            A14048FasStki = httpContext.cgiGet( "FASSTKI") ;
            A14049FasCops = httpContext.cgiGet( "FASCOPS") ;
            A14050FasClsHdr = (byte)(localUtil.ctol( httpContext.cgiGet( "FASCLSHDR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14051FasStkT = httpContext.cgiGet( "FASSTKT") ;
            A14052FasPrefj = httpContext.cgiGet( "FASPREFJ") ;
            A14053FasFinHdr = httpContext.cgiGet( "FASFINHDR") ;
            A14054FasDivTime = httpContext.cgiGet( "FASDIVTIME") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A606MaqDsc = httpContext.cgiGet( "MAQDSC") ;
            n606MaqDsc = false ;
            A6163SecNomF = httpContext.cgiGet( "SECNOMF") ;
            n6163SecNomF = false ;
            Combo_maqcod_Objectcall = httpContext.cgiGet( "COMBO_MAQCOD_Objectcall") ;
            Combo_maqcod_Class = httpContext.cgiGet( "COMBO_MAQCOD_Class") ;
            Combo_maqcod_Icontype = httpContext.cgiGet( "COMBO_MAQCOD_Icontype") ;
            Combo_maqcod_Icon = httpContext.cgiGet( "COMBO_MAQCOD_Icon") ;
            Combo_maqcod_Caption = httpContext.cgiGet( "COMBO_MAQCOD_Caption") ;
            Combo_maqcod_Tooltip = httpContext.cgiGet( "COMBO_MAQCOD_Tooltip") ;
            Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
            Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
            Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
            Combo_maqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedtext_set") ;
            Combo_maqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedtext_get") ;
            Combo_maqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_MAQCOD_Gamoauthtoken") ;
            Combo_maqcod_Ddointernalname = httpContext.cgiGet( "COMBO_MAQCOD_Ddointernalname") ;
            Combo_maqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_MAQCOD_Titlecontrolalign") ;
            Combo_maqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MAQCOD_Dropdownoptionstype") ;
            Combo_maqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Enabled")) ;
            Combo_maqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Visible")) ;
            Combo_maqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MAQCOD_Titlecontrolidtoreplace") ;
            Combo_maqcod_Datalisttype = httpContext.cgiGet( "COMBO_MAQCOD_Datalisttype") ;
            Combo_maqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Allowmultipleselection")) ;
            Combo_maqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MAQCOD_Datalistfixedvalues") ;
            Combo_maqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Isgriditem")) ;
            Combo_maqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Hasdescription")) ;
            Combo_maqcod_Datalistproc = httpContext.cgiGet( "COMBO_MAQCOD_Datalistproc") ;
            Combo_maqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MAQCOD_Datalistprocparametersprefix") ;
            Combo_maqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MAQCOD_Remoteservicesparameters") ;
            Combo_maqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MAQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_maqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Includeonlyselectedoption")) ;
            Combo_maqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Includeselectalloption")) ;
            Combo_maqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Emptyitem")) ;
            Combo_maqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Includeaddnewoption")) ;
            Combo_maqcod_Htmltemplate = httpContext.cgiGet( "COMBO_MAQCOD_Htmltemplate") ;
            Combo_maqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCOD_Multiplevaluestype") ;
            Combo_maqcod_Loadingdata = httpContext.cgiGet( "COMBO_MAQCOD_Loadingdata") ;
            Combo_maqcod_Noresultsfound = httpContext.cgiGet( "COMBO_MAQCOD_Noresultsfound") ;
            Combo_maqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD_Emptyitemtext") ;
            Combo_maqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MAQCOD_Onlyselectedvalues") ;
            Combo_maqcod_Selectalltext = httpContext.cgiGet( "COMBO_MAQCOD_Selectalltext") ;
            Combo_maqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MAQCOD_Multiplevaluesseparator") ;
            Combo_maqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_MAQCOD_Addnewoptiontext") ;
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
            Dvpanel_unnamedtable9_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Objectcall") ;
            Dvpanel_unnamedtable9_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Class") ;
            Dvpanel_unnamedtable9_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Enabled")) ;
            Dvpanel_unnamedtable9_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Width") ;
            Dvpanel_unnamedtable9_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Height") ;
            Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
            Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
            Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Cls") ;
            Dvpanel_unnamedtable9_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showheader")) ;
            Dvpanel_unnamedtable9_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Title") ;
            Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
            Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
            Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
            Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Iconposition") ;
            Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
            Dvpanel_unnamedtable9_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Visible")) ;
            Dvpanel_unnamedtable10_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Objectcall") ;
            Dvpanel_unnamedtable10_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Class") ;
            Dvpanel_unnamedtable10_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Enabled")) ;
            Dvpanel_unnamedtable10_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Width") ;
            Dvpanel_unnamedtable10_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Height") ;
            Dvpanel_unnamedtable10_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autowidth")) ;
            Dvpanel_unnamedtable10_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autoheight")) ;
            Dvpanel_unnamedtable10_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Cls") ;
            Dvpanel_unnamedtable10_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Showheader")) ;
            Dvpanel_unnamedtable10_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Title") ;
            Dvpanel_unnamedtable10_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Collapsible")) ;
            Dvpanel_unnamedtable10_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Collapsed")) ;
            Dvpanel_unnamedtable10_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Showcollapseicon")) ;
            Dvpanel_unnamedtable10_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Iconposition") ;
            Dvpanel_unnamedtable10_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autoscroll")) ;
            Dvpanel_unnamedtable10_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Visible")) ;
            Combo_seccodf_Objectcall = httpContext.cgiGet( "COMBO_SECCODF_Objectcall") ;
            Combo_seccodf_Class = httpContext.cgiGet( "COMBO_SECCODF_Class") ;
            Combo_seccodf_Icontype = httpContext.cgiGet( "COMBO_SECCODF_Icontype") ;
            Combo_seccodf_Icon = httpContext.cgiGet( "COMBO_SECCODF_Icon") ;
            Combo_seccodf_Caption = httpContext.cgiGet( "COMBO_SECCODF_Caption") ;
            Combo_seccodf_Tooltip = httpContext.cgiGet( "COMBO_SECCODF_Tooltip") ;
            Combo_seccodf_Cls = httpContext.cgiGet( "COMBO_SECCODF_Cls") ;
            Combo_seccodf_Selectedvalue_set = httpContext.cgiGet( "COMBO_SECCODF_Selectedvalue_set") ;
            Combo_seccodf_Selectedvalue_get = httpContext.cgiGet( "COMBO_SECCODF_Selectedvalue_get") ;
            Combo_seccodf_Selectedtext_set = httpContext.cgiGet( "COMBO_SECCODF_Selectedtext_set") ;
            Combo_seccodf_Selectedtext_get = httpContext.cgiGet( "COMBO_SECCODF_Selectedtext_get") ;
            Combo_seccodf_Gamoauthtoken = httpContext.cgiGet( "COMBO_SECCODF_Gamoauthtoken") ;
            Combo_seccodf_Ddointernalname = httpContext.cgiGet( "COMBO_SECCODF_Ddointernalname") ;
            Combo_seccodf_Titlecontrolalign = httpContext.cgiGet( "COMBO_SECCODF_Titlecontrolalign") ;
            Combo_seccodf_Dropdownoptionstype = httpContext.cgiGet( "COMBO_SECCODF_Dropdownoptionstype") ;
            Combo_seccodf_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Enabled")) ;
            Combo_seccodf_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Visible")) ;
            Combo_seccodf_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_SECCODF_Titlecontrolidtoreplace") ;
            Combo_seccodf_Datalisttype = httpContext.cgiGet( "COMBO_SECCODF_Datalisttype") ;
            Combo_seccodf_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Allowmultipleselection")) ;
            Combo_seccodf_Datalistfixedvalues = httpContext.cgiGet( "COMBO_SECCODF_Datalistfixedvalues") ;
            Combo_seccodf_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Isgriditem")) ;
            Combo_seccodf_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Hasdescription")) ;
            Combo_seccodf_Datalistproc = httpContext.cgiGet( "COMBO_SECCODF_Datalistproc") ;
            Combo_seccodf_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_SECCODF_Datalistprocparametersprefix") ;
            Combo_seccodf_Remoteservicesparameters = httpContext.cgiGet( "COMBO_SECCODF_Remoteservicesparameters") ;
            Combo_seccodf_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_SECCODF_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_seccodf_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Includeonlyselectedoption")) ;
            Combo_seccodf_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Includeselectalloption")) ;
            Combo_seccodf_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Emptyitem")) ;
            Combo_seccodf_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_SECCODF_Includeaddnewoption")) ;
            Combo_seccodf_Htmltemplate = httpContext.cgiGet( "COMBO_SECCODF_Htmltemplate") ;
            Combo_seccodf_Multiplevaluestype = httpContext.cgiGet( "COMBO_SECCODF_Multiplevaluestype") ;
            Combo_seccodf_Loadingdata = httpContext.cgiGet( "COMBO_SECCODF_Loadingdata") ;
            Combo_seccodf_Noresultsfound = httpContext.cgiGet( "COMBO_SECCODF_Noresultsfound") ;
            Combo_seccodf_Emptyitemtext = httpContext.cgiGet( "COMBO_SECCODF_Emptyitemtext") ;
            Combo_seccodf_Onlyselectedvalues = httpContext.cgiGet( "COMBO_SECCODF_Onlyselectedvalues") ;
            Combo_seccodf_Selectalltext = httpContext.cgiGet( "COMBO_SECCODF_Selectalltext") ;
            Combo_seccodf_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_SECCODF_Multiplevaluesseparator") ;
            Combo_seccodf_Addnewoptiontext = httpContext.cgiGet( "COMBO_SECCODF_Addnewoptiontext") ;
            Dvpanel_panelotrosdatos_Objectcall = httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Objectcall") ;
            Dvpanel_panelotrosdatos_Class = httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Class") ;
            Dvpanel_panelotrosdatos_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Enabled")) ;
            Dvpanel_panelotrosdatos_Width = httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Width") ;
            Dvpanel_panelotrosdatos_Height = httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Height") ;
            Dvpanel_panelotrosdatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Autowidth")) ;
            Dvpanel_panelotrosdatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Autoheight")) ;
            Dvpanel_panelotrosdatos_Cls = httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Cls") ;
            Dvpanel_panelotrosdatos_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Showheader")) ;
            Dvpanel_panelotrosdatos_Title = httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Title") ;
            Dvpanel_panelotrosdatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Collapsible")) ;
            Dvpanel_panelotrosdatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Collapsed")) ;
            Dvpanel_panelotrosdatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Showcollapseicon")) ;
            Dvpanel_panelotrosdatos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Iconposition") ;
            Dvpanel_panelotrosdatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Autoscroll")) ;
            Dvpanel_panelotrosdatos_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOTROSDATOS_Visible")) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            n457FasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A7070FasSigla = httpContext.cgiGet( edtFasSigla_Internalname) ;
            n7070FasSigla = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
            A14042FasActiva = ((GXutil.strcmp(httpContext.cgiGet( chkFasActiva.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)), DecimalUtil.stringToDec("999.9")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASDEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasDec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A459FasDec = DecimalUtil.ZERO ;
               n459FasDec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
            }
            else
            {
               A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
               n459FasDec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasDec2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasDec2_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASDEC2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasDec2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5990FasDec2 = DecimalUtil.ZERO ;
               n5990FasDec2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5990FasDec2", GXutil.ltrimstr( A5990FasDec2, 7, 2));
            }
            else
            {
               A5990FasDec2 = localUtil.ctond( httpContext.cgiGet( edtFasDec2_Internalname)) ;
               n5990FasDec2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5990FasDec2", GXutil.ltrimstr( A5990FasDec2, 7, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPRESAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasPreSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A469FasPreSal = (short)(0) ;
               n469FasPreSal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
            }
            else
            {
               A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n469FasPreSal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasPrePie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A468FasPrePie = (short)(0) ;
               n468FasPrePie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
            }
            else
            {
               A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n468FasPrePie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)), DecimalUtil.stringToDec("999.9")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASVELPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasVelPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A472FasVelPro = DecimalUtil.ZERO ;
               n472FasVelPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
            }
            else
            {
               A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
               n472FasVelPro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASNUMPAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasNumPas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A464FasNumPas = (short)(0) ;
               n464FasNumPas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
            }
            else
            {
               A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n464FasNumPas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
            }
            cmbFasActTin.setValue( httpContext.cgiGet( cmbFasActTin.getInternalname()) );
            A456FasActTin = httpContext.cgiGet( cmbFasActTin.getInternalname()) ;
            n456FasActTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
            cmbFasCon.setValue( httpContext.cgiGet( cmbFasCon.getInternalname()) );
            A458FasCon = httpContext.cgiGet( cmbFasCon.getInternalname()) ;
            n458FasCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
            cmbFasAcab.setValue( httpContext.cgiGet( cmbFasAcab.getInternalname()) );
            A4903FasAcab = httpContext.cgiGet( cmbFasAcab.getInternalname()) ;
            n4903FasAcab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
            cmbFasForMul.setValue( httpContext.cgiGet( cmbFasForMul.getInternalname()) );
            A4286FasForMul = httpContext.cgiGet( cmbFasForMul.getInternalname()) ;
            n4286FasForMul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
            cmbFasConPla.setValue( httpContext.cgiGet( cmbFasConPla.getInternalname()) );
            A4299FasConPla = httpContext.cgiGet( cmbFasConPla.getInternalname()) ;
            n4299FasConPla = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
            cmbFasObl.setValue( httpContext.cgiGet( cmbFasObl.getInternalname()) );
            A7105FasObl = httpContext.cgiGet( cmbFasObl.getInternalname()) ;
            n7105FasObl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
            cmbFasTip.setValue( httpContext.cgiGet( cmbFasTip.getInternalname()) );
            A6011FasTip = httpContext.cgiGet( cmbFasTip.getInternalname()) ;
            n6011FasTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
            cmbFasGral.setValue( httpContext.cgiGet( cmbFasGral.getInternalname()) );
            A5368FasGral = httpContext.cgiGet( cmbFasGral.getInternalname()) ;
            n5368FasGral = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
            cmbFasPesInt.setValue( httpContext.cgiGet( cmbFasPesInt.getInternalname()) );
            A7059FasPesInt = httpContext.cgiGet( cmbFasPesInt.getInternalname()) ;
            n7059FasPesInt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
            cmbFasPesExp.setValue( httpContext.cgiGet( cmbFasPesExp.getInternalname()) );
            A8888FasPesExp = httpContext.cgiGet( cmbFasPesExp.getInternalname()) ;
            n8888FasPesExp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
            cmbFasH2OReh.setValue( httpContext.cgiGet( cmbFasH2OReh.getInternalname()) );
            A7600FasH2OReh = httpContext.cgiGet( cmbFasH2OReh.getInternalname()) ;
            n7600FasH2OReh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
            A7057FasOpeIns = ((GXutil.strcmp(httpContext.cgiGet( chkFasOpeIns.getInternalname()), "S")==0) ? "S" : "N") ;
            n7057FasOpeIns = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
            A13809FasCarda = ((GXutil.strcmp(httpContext.cgiGet( chkFasCarda.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13809FasCarda", A13809FasCarda);
            A6162SecCodF = httpContext.cgiGet( edtSecCodF_Internalname) ;
            n6162SecCodF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasValMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasValMtr_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASVALMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasValMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4791FasValMtr = DecimalUtil.ZERO ;
               n4791FasValMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4791FasValMtr", GXutil.ltrimstr( A4791FasValMtr, 12, 5));
            }
            else
            {
               A4791FasValMtr = localUtil.ctond( httpContext.cgiGet( edtFasValMtr_Internalname)) ;
               n4791FasValMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4791FasValMtr", GXutil.ltrimstr( A4791FasValMtr, 12, 5));
            }
            A9838FasObsF = httpContext.cgiGet( edtFasObsF_Internalname) ;
            n9838FasObsF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9838FasObsF", A9838FasObsF);
            cmbFasEstamp.setValue( httpContext.cgiGet( cmbFasEstamp.getInternalname()) );
            A4343FasEstamp = httpContext.cgiGet( cmbFasEstamp.getInternalname()) ;
            n4343FasEstamp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasPreMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasPreMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREMC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasPreMC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5168FasPreMC = (short)(0) ;
               n5168FasPreMC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5168FasPreMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5168FasPreMC), 4, 0));
            }
            else
            {
               A5168FasPreMC = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5168FasPreMC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5168FasPreMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5168FasPreMC), 4, 0));
            }
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkFasPreObl.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkFasPreObl.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREOBL");
               AnyError = (short)(1) ;
               GX_FocusControl = chkFasPreObl.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7744FasPreObl = (byte)(0) ;
               n7744FasPreObl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
            }
            else
            {
               A7744FasPreObl = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkFasPreObl.getInternalname()), "1")==0) ? 1 : 0)) ;
               n7744FasPreObl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
            }
            A13808FasNorma = ((GXutil.strcmp(httpContext.cgiGet( chkFasNorma.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13808FasNorma", A13808FasNorma);
            AV88Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
            AV86ComboMaqCod = httpContext.cgiGet( edtavCombomaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86ComboMaqCod", AV86ComboMaqCod);
            AV84ComboSecCodF = httpContext.cgiGet( edtavComboseccodf_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84ComboSecCodF", AV84ComboSecCodF);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFASPRO");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("FasCC", GXutil.rtrim( localUtil.format( A4588FasCC, "@!")));
            AV88Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV88Pgmname, "")));
            forbiddenHiddens.add("FasProCtb", GXutil.rtrim( localUtil.format( A5232FasProCtb, "")));
            forbiddenHiddens.add("FasTExt", GXutil.rtrim( localUtil.format( A5616FasTExt, "@!")));
            forbiddenHiddens.add("FasFGp", localUtil.format( A6880FasFGp, "ZZ9.99"));
            forbiddenHiddens.add("FasGrupo", localUtil.format( DecimalUtil.doubleToDec(A7058FasGrupo), "ZZZZZZ"));
            forbiddenHiddens.add("FasUltLin", localUtil.format( DecimalUtil.doubleToDec(A471FasUltLin), "Z9"));
            forbiddenHiddens.add("FasSalida", GXutil.rtrim( localUtil.format( A14043FasSalida, "")));
            forbiddenHiddens.add("FastoVtx", GXutil.rtrim( localUtil.format( A14044FastoVtx, "")));
            forbiddenHiddens.add("FasMtsAnc", GXutil.rtrim( localUtil.format( A14045FasMtsAnc, "")));
            forbiddenHiddens.add("FasInsAlb", GXutil.rtrim( localUtil.format( A14046FasInsAlb, "")));
            forbiddenHiddens.add("FasTubos", GXutil.rtrim( localUtil.format( A14047FasTubos, "")));
            forbiddenHiddens.add("FasStki", GXutil.rtrim( localUtil.format( A14048FasStki, "")));
            forbiddenHiddens.add("FasCops", GXutil.rtrim( localUtil.format( A14049FasCops, "")));
            forbiddenHiddens.add("FasClsHdr", localUtil.format( DecimalUtil.doubleToDec(A14050FasClsHdr), "9"));
            forbiddenHiddens.add("FasStkT", GXutil.rtrim( localUtil.format( A14051FasStkT, "")));
            forbiddenHiddens.add("FasPrefj", GXutil.rtrim( localUtil.format( A14052FasPrefj, "")));
            forbiddenHiddens.add("FasFinHdr", GXutil.rtrim( localUtil.format( A14053FasFinHdr, "")));
            forbiddenHiddens.add("FasDivTime", GXutil.rtrim( localUtil.format( A14054FasDivTime, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tfaspro:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A457FasCod = httpContext.GetPar( "FasCod") ;
               n457FasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
                  sMode45 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode45 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound45 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_110( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FASCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
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
                        e11112 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12112 ();
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
         e12112 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1145( ) ;
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
         disableAttributes1145( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboseccodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboseccodf_Enabled), 5, 0), true);
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

   public void confirm_110( )
   {
      beforeValidate1145( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1145( ) ;
         }
         else
         {
            checkExtendedTable1145( ) ;
            closeExtendedTableCursors1145( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption110( )
   {
   }

   public void e11112( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfaspro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfaspro_impl.this.A396EmprCod = GXv_char2[0] ;
      tfaspro_impl.this.AV16EmprNom = GXv_char3[0] ;
      tfaspro_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV64Parfss ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PARFSS", ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV64Parfss = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Parfss", GXutil.str( AV64Parfss, 1, 0));
      GXt_int5 = AV52Faspq ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASPQ", ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV52Faspq = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Faspq", GXutil.str( AV52Faspq, 1, 0));
      GXt_char1 = AV33Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tfaspro_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char4[0] = AV73EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char4, GXv_char3, GXv_char2) ;
      tfaspro_impl.this.AV73EmprCod = GXv_char4[0] ;
      tfaspro_impl.this.AV16EmprNom = GXv_char3[0] ;
      tfaspro_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73EmprCod", AV73EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV75WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV75WWPContext = GXv_SdtWWPContext7[0] ;
      edtSecCodF_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Visible), 5, 0), true);
      AV84ComboSecCodF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84ComboSecCodF", AV84ComboSecCodF);
      edtavComboseccodf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboseccodf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboseccodf_Visible), 5, 0), true);
      edtMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), true);
      AV86ComboMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86ComboMaqCod", AV86ComboMaqCod);
      edtavCombomaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOSECCODF' */
      S122 ();
      if ( returnInSub )
      {
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
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV76TrnContext.fromxml(AV77WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV76TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV88Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV89GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GXV1), 8, 0));
         while ( AV89GXV1 <= AV76TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV80TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV76TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV89GXV1));
            if ( GXutil.strcmp(AV80TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MaqCod") == 0 )
            {
               AV78Insert_MaqCod = AV80TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV78Insert_MaqCod", AV78Insert_MaqCod);
               if ( ! (GXutil.strcmp("", AV78Insert_MaqCod)==0) )
               {
                  AV86ComboMaqCod = AV78Insert_MaqCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV86ComboMaqCod", AV86ComboMaqCod);
                  Combo_maqcod_Selectedvalue_set = AV86ComboMaqCod ;
                  ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
                  Combo_maqcod_Enabled = false ;
                  ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "Enabled", GXutil.booltostr( Combo_maqcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV80TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "SecCodF") == 0 )
            {
               AV79Insert_SecCodF = AV80TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV79Insert_SecCodF", AV79Insert_SecCodF);
               if ( ! (GXutil.strcmp("", AV79Insert_SecCodF)==0) )
               {
                  AV84ComboSecCodF = AV79Insert_SecCodF ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV84ComboSecCodF", AV84ComboSecCodF);
                  Combo_seccodf_Selectedvalue_set = AV84ComboSecCodF ;
                  ucCombo_seccodf.sendProperty(context, "", false, Combo_seccodf_Internalname, "SelectedValue_set", Combo_seccodf_Selectedvalue_set);
                  Combo_seccodf_Enabled = false ;
                  ucCombo_seccodf.sendProperty(context, "", false, Combo_seccodf_Internalname, "Enabled", GXutil.booltostr( Combo_seccodf_Enabled));
               }
            }
            AV89GXV1 = (int)(AV89GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GXV1), 8, 0));
         }
      }
   }

   public void e12112( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && ( GXutil.strcmp(A460FasDsc, O460FasDsc) != 0 ) )
      {
         new app.cambiodescripcionfase(remoteHandle, context).execute( A396EmprCod, A457FasCod, A460FasDsc) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV76TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tfasproww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      chkFasNorma.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasNorma.getInternalname(), "Visible", GXutil.ltrimstr( chkFasNorma.getVisible(), 5, 0), true);
      divFasnorma_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divFasnorma_cell_Internalname, "Class", divFasnorma_cell_Class, true);
      divFaspreobl_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divFaspreobl_cell_Internalname, "Class", divFaspreobl_cell_Class, true);
      divFasvalmtr_cell_Class = "col-xs-12 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divFasvalmtr_cell_Internalname, "Class", divFasvalmtr_cell_Class, true);
      divCombo_seccodf_cell_Class = "col-xs-12 DataContentCell DscTop ExtendedComboCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divCombo_seccodf_cell_Internalname, "Class", divCombo_seccodf_cell_Class, true);
      divFasopeins_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divFasopeins_cell_Internalname, "Class", divFasopeins_cell_Class, true);
      chkFasCarda.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasCarda.getInternalname(), "Visible", GXutil.ltrimstr( chkFasCarda.getVisible(), 5, 0), true);
      divFascarda_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divFascarda_cell_Internalname, "Class", divFascarda_cell_Class, true);
      cmbFasGral.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasGral.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasGral.getVisible(), 5, 0), true);
      divFasgral_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divFasgral_cell_Internalname, "Class", divFasgral_cell_Class, true);
      divFasobl_cell_Class = "col-xs-12 col-sm-1 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divFasobl_cell_Internalname, "Class", divFasobl_cell_Class, true);
      if ( ( chkFasOpeIns.getVisible() == ( 0 )) && ( chkFasCarda.getVisible() == ( 0 )) )
      {
         divUnnamedtable5_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable5_Visible), 5, 0), true);
      }
      if ( ! Combo_seccodf_Visible )
      {
         divUnnamedtable6_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
      }
      if ( ( edtFasValMtr_Visible == ( 0 )) )
      {
         divUnnamedtable7_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable7_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable7_Visible), 5, 0), true);
      }
      divDvpanel_unnamedtable3_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
   }

   public void S122( )
   {
      /* 'LOADCOMBOSECCODF' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV82SecCodF_Data ;
      GXv_char4[0] = AV83ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tfasproloaddvcombo(remoteHandle, context).execute( "SecCodF", Gx_mode, AV73EmprCod, AV81FasCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tfaspro_impl.this.AV83ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV82SecCodF_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_seccodf_Selectedvalue_set = AV83ComboSelectedValue ;
      ucCombo_seccodf.sendProperty(context, "", false, Combo_seccodf_Internalname, "SelectedValue_set", Combo_seccodf_Selectedvalue_set);
      AV84ComboSecCodF = AV83ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84ComboSecCodF", AV84ComboSecCodF);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_seccodf_Enabled = false ;
         ucCombo_seccodf.sendProperty(context, "", false, Combo_seccodf_Internalname, "Enabled", GXutil.booltostr( Combo_seccodf_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV85MaqCod_Data ;
      GXv_char4[0] = AV83ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tfasproloaddvcombo(remoteHandle, context).execute( "MaqCod", Gx_mode, AV73EmprCod, AV81FasCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tfaspro_impl.this.AV83ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV85MaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_maqcod_Selectedvalue_set = AV83ComboSelectedValue ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
      AV86ComboMaqCod = AV83ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86ComboMaqCod", AV86ComboMaqCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_maqcod_Enabled = false ;
         ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "Enabled", GXutil.booltostr( Combo_maqcod_Enabled));
      }
   }

   public void zm1145( int GX_JID )
   {
      if ( ( GX_JID == 60 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4588FasCC = T00113_A4588FasCC[0] ;
            Z460FasDsc = T00113_A460FasDsc[0] ;
            Z7070FasSigla = T00113_A7070FasSigla[0] ;
            Z459FasDec = T00113_A459FasDec[0] ;
            Z5990FasDec2 = T00113_A5990FasDec2[0] ;
            Z469FasPreSal = T00113_A469FasPreSal[0] ;
            Z468FasPrePie = T00113_A468FasPrePie[0] ;
            Z472FasVelPro = T00113_A472FasVelPro[0] ;
            Z464FasNumPas = T00113_A464FasNumPas[0] ;
            Z456FasActTin = T00113_A456FasActTin[0] ;
            Z458FasCon = T00113_A458FasCon[0] ;
            Z4903FasAcab = T00113_A4903FasAcab[0] ;
            Z4286FasForMul = T00113_A4286FasForMul[0] ;
            Z4299FasConPla = T00113_A4299FasConPla[0] ;
            Z4343FasEstamp = T00113_A4343FasEstamp[0] ;
            Z5168FasPreMC = T00113_A5168FasPreMC[0] ;
            Z4791FasValMtr = T00113_A4791FasValMtr[0] ;
            Z5232FasProCtb = T00113_A5232FasProCtb[0] ;
            Z5616FasTExt = T00113_A5616FasTExt[0] ;
            Z6011FasTip = T00113_A6011FasTip[0] ;
            Z7105FasObl = T00113_A7105FasObl[0] ;
            Z7744FasPreObl = T00113_A7744FasPreObl[0] ;
            Z5368FasGral = T00113_A5368FasGral[0] ;
            Z6880FasFGp = T00113_A6880FasFGp[0] ;
            Z7059FasPesInt = T00113_A7059FasPesInt[0] ;
            Z8888FasPesExp = T00113_A8888FasPesExp[0] ;
            Z9838FasObsF = T00113_A9838FasObsF[0] ;
            Z7600FasH2OReh = T00113_A7600FasH2OReh[0] ;
            Z7057FasOpeIns = T00113_A7057FasOpeIns[0] ;
            Z7058FasGrupo = T00113_A7058FasGrupo[0] ;
            Z471FasUltLin = T00113_A471FasUltLin[0] ;
            Z13808FasNorma = T00113_A13808FasNorma[0] ;
            Z13809FasCarda = T00113_A13809FasCarda[0] ;
            Z14042FasActiva = T00113_A14042FasActiva[0] ;
            Z14043FasSalida = T00113_A14043FasSalida[0] ;
            Z14044FastoVtx = T00113_A14044FastoVtx[0] ;
            Z14045FasMtsAnc = T00113_A14045FasMtsAnc[0] ;
            Z14046FasInsAlb = T00113_A14046FasInsAlb[0] ;
            Z14047FasTubos = T00113_A14047FasTubos[0] ;
            Z14048FasStki = T00113_A14048FasStki[0] ;
            Z14049FasCops = T00113_A14049FasCops[0] ;
            Z14050FasClsHdr = T00113_A14050FasClsHdr[0] ;
            Z14051FasStkT = T00113_A14051FasStkT[0] ;
            Z14052FasPrefj = T00113_A14052FasPrefj[0] ;
            Z14053FasFinHdr = T00113_A14053FasFinHdr[0] ;
            Z14054FasDivTime = T00113_A14054FasDivTime[0] ;
            Z602MaqCod = T00113_A602MaqCod[0] ;
            Z6162SecCodF = T00113_A6162SecCodF[0] ;
         }
         else
         {
            Z4588FasCC = A4588FasCC ;
            Z460FasDsc = A460FasDsc ;
            Z7070FasSigla = A7070FasSigla ;
            Z459FasDec = A459FasDec ;
            Z5990FasDec2 = A5990FasDec2 ;
            Z469FasPreSal = A469FasPreSal ;
            Z468FasPrePie = A468FasPrePie ;
            Z472FasVelPro = A472FasVelPro ;
            Z464FasNumPas = A464FasNumPas ;
            Z456FasActTin = A456FasActTin ;
            Z458FasCon = A458FasCon ;
            Z4903FasAcab = A4903FasAcab ;
            Z4286FasForMul = A4286FasForMul ;
            Z4299FasConPla = A4299FasConPla ;
            Z4343FasEstamp = A4343FasEstamp ;
            Z5168FasPreMC = A5168FasPreMC ;
            Z4791FasValMtr = A4791FasValMtr ;
            Z5232FasProCtb = A5232FasProCtb ;
            Z5616FasTExt = A5616FasTExt ;
            Z6011FasTip = A6011FasTip ;
            Z7105FasObl = A7105FasObl ;
            Z7744FasPreObl = A7744FasPreObl ;
            Z5368FasGral = A5368FasGral ;
            Z6880FasFGp = A6880FasFGp ;
            Z7059FasPesInt = A7059FasPesInt ;
            Z8888FasPesExp = A8888FasPesExp ;
            Z9838FasObsF = A9838FasObsF ;
            Z7600FasH2OReh = A7600FasH2OReh ;
            Z7057FasOpeIns = A7057FasOpeIns ;
            Z7058FasGrupo = A7058FasGrupo ;
            Z471FasUltLin = A471FasUltLin ;
            Z13808FasNorma = A13808FasNorma ;
            Z13809FasCarda = A13809FasCarda ;
            Z14042FasActiva = A14042FasActiva ;
            Z14043FasSalida = A14043FasSalida ;
            Z14044FastoVtx = A14044FastoVtx ;
            Z14045FasMtsAnc = A14045FasMtsAnc ;
            Z14046FasInsAlb = A14046FasInsAlb ;
            Z14047FasTubos = A14047FasTubos ;
            Z14048FasStki = A14048FasStki ;
            Z14049FasCops = A14049FasCops ;
            Z14050FasClsHdr = A14050FasClsHdr ;
            Z14051FasStkT = A14051FasStkT ;
            Z14052FasPrefj = A14052FasPrefj ;
            Z14053FasFinHdr = A14053FasFinHdr ;
            Z14054FasDivTime = A14054FasDivTime ;
            Z602MaqCod = A602MaqCod ;
            Z6162SecCodF = A6162SecCodF ;
         }
      }
      if ( GX_JID == -60 )
      {
         Z457FasCod = A457FasCod ;
         Z4588FasCC = A4588FasCC ;
         Z460FasDsc = A460FasDsc ;
         Z7070FasSigla = A7070FasSigla ;
         Z459FasDec = A459FasDec ;
         Z5990FasDec2 = A5990FasDec2 ;
         Z469FasPreSal = A469FasPreSal ;
         Z468FasPrePie = A468FasPrePie ;
         Z472FasVelPro = A472FasVelPro ;
         Z464FasNumPas = A464FasNumPas ;
         Z456FasActTin = A456FasActTin ;
         Z458FasCon = A458FasCon ;
         Z4903FasAcab = A4903FasAcab ;
         Z4286FasForMul = A4286FasForMul ;
         Z4299FasConPla = A4299FasConPla ;
         Z4343FasEstamp = A4343FasEstamp ;
         Z5168FasPreMC = A5168FasPreMC ;
         Z4791FasValMtr = A4791FasValMtr ;
         Z5232FasProCtb = A5232FasProCtb ;
         Z5616FasTExt = A5616FasTExt ;
         Z6011FasTip = A6011FasTip ;
         Z7105FasObl = A7105FasObl ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z5368FasGral = A5368FasGral ;
         Z6880FasFGp = A6880FasFGp ;
         Z7059FasPesInt = A7059FasPesInt ;
         Z8888FasPesExp = A8888FasPesExp ;
         Z9838FasObsF = A9838FasObsF ;
         Z7600FasH2OReh = A7600FasH2OReh ;
         Z7057FasOpeIns = A7057FasOpeIns ;
         Z7058FasGrupo = A7058FasGrupo ;
         Z471FasUltLin = A471FasUltLin ;
         Z13808FasNorma = A13808FasNorma ;
         Z13809FasCarda = A13809FasCarda ;
         Z14042FasActiva = A14042FasActiva ;
         Z14043FasSalida = A14043FasSalida ;
         Z14044FastoVtx = A14044FastoVtx ;
         Z14045FasMtsAnc = A14045FasMtsAnc ;
         Z14046FasInsAlb = A14046FasInsAlb ;
         Z14047FasTubos = A14047FasTubos ;
         Z14048FasStki = A14048FasStki ;
         Z14049FasCops = A14049FasCops ;
         Z14050FasClsHdr = A14050FasClsHdr ;
         Z14051FasStkT = A14051FasStkT ;
         Z14052FasPrefj = A14052FasPrefj ;
         Z14053FasFinHdr = A14053FasFinHdr ;
         Z14054FasDivTime = A14054FasDivTime ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z6162SecCodF = A6162SecCodF ;
         Z407EmprNom = A407EmprNom ;
         Z606MaqDsc = A606MaqDsc ;
         Z6163SecNomF = A6163SecNomF ;
      }
   }

   public void standaloneNotModal( )
   {
      AV88Pgmname = "TFASPRO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV73EmprCod)==0) )
      {
         A396EmprCod = AV73EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00114 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00114_A407EmprNom[0] ;
      n407EmprNom = T00114_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      chkFasNorma.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasNorma.getInternalname(), "Visible", GXutil.ltrimstr( chkFasNorma.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divFasnorma_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFasnorma_cell_Internalname, "Class", divFasnorma_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int6) ;
         tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divFasnorma_cell_Class = httpContext.getMessage( "col-xs-12 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFasnorma_cell_Internalname, "Class", divFasnorma_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      chkFasPreObl.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "Visible", GXutil.ltrimstr( chkFasPreObl.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divFaspreobl_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFaspreobl_cell_Internalname, "Class", divFaspreobl_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
         tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divFaspreobl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFaspreobl_cell_Internalname, "Class", divFaspreobl_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      edtFasValMtr_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasValMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasValMtr_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divFasvalmtr_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFasvalmtr_cell_Internalname, "Class", divFasvalmtr_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int6) ;
         tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divFasvalmtr_cell_Class = httpContext.getMessage( "col-xs-12 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFasvalmtr_cell_Internalname, "Class", divFasvalmtr_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TSECCI", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      Combo_seccodf_Visible = (boolean)((GXt_int5==1)) ;
      ucCombo_seccodf.sendProperty(context, "", false, Combo_seccodf_Internalname, "Visible", GXutil.booltostr( Combo_seccodf_Visible));
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TSECCI", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divCombo_seccodf_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_seccodf_cell_Internalname, "Class", divCombo_seccodf_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TSECCI", ""), ""), GXv_int6) ;
         tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divCombo_seccodf_cell_Class = httpContext.getMessage( "col-xs-12 DataContentCell DscTop ExtendedComboCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divCombo_seccodf_cell_Internalname, "Class", divCombo_seccodf_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      chkFasOpeIns.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasOpeIns.getInternalname(), "Visible", GXutil.ltrimstr( chkFasOpeIns.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divFasopeins_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFasopeins_cell_Internalname, "Class", divFasopeins_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
         tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divFasopeins_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFasopeins_cell_Internalname, "Class", divFasopeins_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      chkFasCarda.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasCarda.getInternalname(), "Visible", GXutil.ltrimstr( chkFasCarda.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divFascarda_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFascarda_cell_Internalname, "Class", divFascarda_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
         tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divFascarda_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFascarda_cell_Internalname, "Class", divFascarda_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "KGMTLC", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MTSLEC", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      cmbFasGral.setVisible( ((GXt_int5==1)||(GXt_int10==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasGral.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasGral.getVisible(), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "KGMTLC", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MTSLEC", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int10 == 1 ) || ( GXt_int5 == 1 ) ) )
      {
         divFasgral_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFasgral_cell_Internalname, "Class", divFasgral_cell_Class, true);
      }
      else
      {
         GXt_int10 = (byte)(0) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "KGMTLC", ""), ""), GXv_int11) ;
         tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MTSLEC", ""), ""), GXv_int6) ;
         tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( ( GXt_int10 == 1 ) || ( GXt_int5 == 1 ) )
         {
            divFasgral_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFasgral_cell_Internalname, "Class", divFasgral_cell_Class, true);
         }
      }
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "FASOPC", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      cmbFasObl.setVisible( ((GXt_int10==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasObl.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasObl.getVisible(), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "FASOPC", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      if ( ! ( ( GXt_int10 == 1 ) ) )
      {
         divFasobl_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFasobl_cell_Internalname, "Class", divFasobl_cell_Class, true);
      }
      else
      {
         GXt_int10 = (byte)(0) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "FASOPC", ""), ""), GXv_int11) ;
         tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
         if ( GXt_int10 == 1 )
         {
            divFasobl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-1 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFasobl_cell_Internalname, "Class", divFasobl_cell_Class, true);
         }
      }
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      divUnnamedtable5_Visible = ((((GXt_int10==1))||((GXt_int5==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable5_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TSECCI", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      divUnnamedtable6_Visible = ((((GXt_int10==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      divUnnamedtable7_Visible = ((((GXt_int10==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable7_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable7_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINEST", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      if ( ! ( ( GXt_int10 == 1 ) ) )
      {
         divDvpanel_unnamedtable3_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
      else
      {
         GXt_int10 = (byte)(0) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINEST", ""), ""), GXv_int11) ;
         tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
         if ( GXt_int10 == 1 )
         {
            divDvpanel_unnamedtable3_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV81FasCod)==0) )
      {
         A457FasCod = AV81FasCod ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      if ( ! (GXutil.strcmp("", AV81FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV81FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV78Insert_MaqCod)==0) )
      {
         edtMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV79Insert_SecCodF)==0) )
      {
         edtSecCodF_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Enabled), 5, 0), true);
      }
      else
      {
         edtSecCodF_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV78Insert_MaqCod)==0) )
      {
         A602MaqCod = AV78Insert_MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
      else
      {
         if ( (GXutil.strcmp("", AV86ComboMaqCod)==0) )
         {
            A602MaqCod = "" ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            n602MaqCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV86ComboMaqCod)==0) )
            {
               A602MaqCod = AV86ComboMaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV79Insert_SecCodF)==0) )
      {
         A6162SecCodF = AV79Insert_SecCodF ;
         n6162SecCodF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
      }
      else
      {
         if ( (GXutil.strcmp("", AV84ComboSecCodF)==0) )
         {
            A6162SecCodF = "" ;
            n6162SecCodF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
            n6162SecCodF = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV84ComboSecCodF)==0) )
            {
               A6162SecCodF = AV84ComboSecCodF ;
               n6162SecCodF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
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
      if ( isIns( )  && (GXutil.strcmp("", A4588FasCC)==0) && ( Gx_BScreen == 0 ) )
      {
         A4588FasCC = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n4588FasCC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4588FasCC", A4588FasCC);
      }
      else
      {
         if ( isIns( )  || isUpd( )  )
         {
            A4588FasCC = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            n4588FasCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4588FasCC", A4588FasCC);
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A472FasVelPro)==0) && ( Gx_BScreen == 0 ) )
      {
         A472FasVelPro = DecimalUtil.doubleToDec(1) ;
         n472FasVelPro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      }
      if ( isIns( )  && (0==A464FasNumPas) && ( Gx_BScreen == 0 ) )
      {
         A464FasNumPas = (short)(1) ;
         n464FasNumPas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A4343FasEstamp)==0) && ( Gx_BScreen == 0 ) )
      {
         A4343FasEstamp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n4343FasEstamp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A4286FasForMul)==0) && ( Gx_BScreen == 0 ) )
      {
         A4286FasForMul = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n4286FasForMul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      }
      if ( isIns( )  && (GXutil.strcmp("", A4903FasAcab)==0) && ( Gx_BScreen == 0 ) )
      {
         A4903FasAcab = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n4903FasAcab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      }
      if ( isIns( )  && (GXutil.strcmp("", A5616FasTExt)==0) && ( Gx_BScreen == 0 ) )
      {
         A5616FasTExt = " " ;
         n5616FasTExt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5616FasTExt", A5616FasTExt);
      }
      if ( isIns( )  && (GXutil.strcmp("", A6011FasTip)==0) && ( Gx_BScreen == 0 ) )
      {
         A6011FasTip = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n6011FasTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
      }
      if ( isIns( )  && (GXutil.strcmp("", A7600FasH2OReh)==0) && ( Gx_BScreen == 0 ) )
      {
         A7600FasH2OReh = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n7600FasH2OReh = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
      }
      if ( isIns( )  && (GXutil.strcmp("", A7105FasObl)==0) && ( Gx_BScreen == 0 ) )
      {
         A7105FasObl = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n7105FasObl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
      }
      if ( isIns( )  && (GXutil.strcmp("", A5368FasGral)==0) && ( Gx_BScreen == 0 ) )
      {
         A5368FasGral = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n5368FasGral = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
      }
      if ( isIns( )  && (GXutil.strcmp("", A7059FasPesInt)==0) && ( Gx_BScreen == 0 ) )
      {
         A7059FasPesInt = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n7059FasPesInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
      }
      if ( isIns( )  && (GXutil.strcmp("", A8888FasPesExp)==0) && ( Gx_BScreen == 0 ) )
      {
         A8888FasPesExp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n8888FasPesExp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A7057FasOpeIns)==0) && ( Gx_BScreen == 0 ) )
      {
         A7057FasOpeIns = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n7057FasOpeIns = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14042FasActiva)==0) && ( Gx_BScreen == 0 ) )
      {
         A14042FasActiva = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T00115 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         A606MaqDsc = T00115_A606MaqDsc[0] ;
         n606MaqDsc = T00115_n606MaqDsc[0] ;
         pr_default.close(3);
         /* Using cursor T00116 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
         A6163SecNomF = T00116_A6163SecNomF[0] ;
         n6163SecNomF = T00116_n6163SecNomF[0] ;
         pr_default.close(4);
      }
   }

   public void load1145( )
   {
      /* Using cursor T00117 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A4588FasCC = T00117_A4588FasCC[0] ;
         n4588FasCC = T00117_n4588FasCC[0] ;
         A407EmprNom = T00117_A407EmprNom[0] ;
         n407EmprNom = T00117_n407EmprNom[0] ;
         A460FasDsc = T00117_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A7070FasSigla = T00117_A7070FasSigla[0] ;
         n7070FasSigla = T00117_n7070FasSigla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
         A606MaqDsc = T00117_A606MaqDsc[0] ;
         n606MaqDsc = T00117_n606MaqDsc[0] ;
         A459FasDec = T00117_A459FasDec[0] ;
         n459FasDec = T00117_n459FasDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
         A5990FasDec2 = T00117_A5990FasDec2[0] ;
         n5990FasDec2 = T00117_n5990FasDec2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5990FasDec2", GXutil.ltrimstr( A5990FasDec2, 7, 2));
         A469FasPreSal = T00117_A469FasPreSal[0] ;
         n469FasPreSal = T00117_n469FasPreSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
         A468FasPrePie = T00117_A468FasPrePie[0] ;
         n468FasPrePie = T00117_n468FasPrePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
         A472FasVelPro = T00117_A472FasVelPro[0] ;
         n472FasVelPro = T00117_n472FasVelPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
         A464FasNumPas = T00117_A464FasNumPas[0] ;
         n464FasNumPas = T00117_n464FasNumPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
         A456FasActTin = T00117_A456FasActTin[0] ;
         n456FasActTin = T00117_n456FasActTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
         A458FasCon = T00117_A458FasCon[0] ;
         n458FasCon = T00117_n458FasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
         A4903FasAcab = T00117_A4903FasAcab[0] ;
         n4903FasAcab = T00117_n4903FasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
         A4286FasForMul = T00117_A4286FasForMul[0] ;
         n4286FasForMul = T00117_n4286FasForMul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
         A4299FasConPla = T00117_A4299FasConPla[0] ;
         n4299FasConPla = T00117_n4299FasConPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
         A4343FasEstamp = T00117_A4343FasEstamp[0] ;
         n4343FasEstamp = T00117_n4343FasEstamp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
         A5168FasPreMC = T00117_A5168FasPreMC[0] ;
         n5168FasPreMC = T00117_n5168FasPreMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5168FasPreMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5168FasPreMC), 4, 0));
         A4791FasValMtr = T00117_A4791FasValMtr[0] ;
         n4791FasValMtr = T00117_n4791FasValMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4791FasValMtr", GXutil.ltrimstr( A4791FasValMtr, 12, 5));
         A5232FasProCtb = T00117_A5232FasProCtb[0] ;
         n5232FasProCtb = T00117_n5232FasProCtb[0] ;
         A5616FasTExt = T00117_A5616FasTExt[0] ;
         n5616FasTExt = T00117_n5616FasTExt[0] ;
         A6011FasTip = T00117_A6011FasTip[0] ;
         n6011FasTip = T00117_n6011FasTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
         A7105FasObl = T00117_A7105FasObl[0] ;
         n7105FasObl = T00117_n7105FasObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
         A7744FasPreObl = T00117_A7744FasPreObl[0] ;
         n7744FasPreObl = T00117_n7744FasPreObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
         A5368FasGral = T00117_A5368FasGral[0] ;
         n5368FasGral = T00117_n5368FasGral[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
         A6880FasFGp = T00117_A6880FasFGp[0] ;
         n6880FasFGp = T00117_n6880FasFGp[0] ;
         A7059FasPesInt = T00117_A7059FasPesInt[0] ;
         n7059FasPesInt = T00117_n7059FasPesInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
         A8888FasPesExp = T00117_A8888FasPesExp[0] ;
         n8888FasPesExp = T00117_n8888FasPesExp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
         A9838FasObsF = T00117_A9838FasObsF[0] ;
         n9838FasObsF = T00117_n9838FasObsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9838FasObsF", A9838FasObsF);
         A6163SecNomF = T00117_A6163SecNomF[0] ;
         n6163SecNomF = T00117_n6163SecNomF[0] ;
         A7600FasH2OReh = T00117_A7600FasH2OReh[0] ;
         n7600FasH2OReh = T00117_n7600FasH2OReh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
         A7057FasOpeIns = T00117_A7057FasOpeIns[0] ;
         n7057FasOpeIns = T00117_n7057FasOpeIns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
         A7058FasGrupo = T00117_A7058FasGrupo[0] ;
         n7058FasGrupo = T00117_n7058FasGrupo[0] ;
         A471FasUltLin = T00117_A471FasUltLin[0] ;
         A13808FasNorma = T00117_A13808FasNorma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13808FasNorma", A13808FasNorma);
         A13809FasCarda = T00117_A13809FasCarda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13809FasCarda", A13809FasCarda);
         A14042FasActiva = T00117_A14042FasActiva[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
         A14043FasSalida = T00117_A14043FasSalida[0] ;
         A14044FastoVtx = T00117_A14044FastoVtx[0] ;
         A14045FasMtsAnc = T00117_A14045FasMtsAnc[0] ;
         A14046FasInsAlb = T00117_A14046FasInsAlb[0] ;
         A14047FasTubos = T00117_A14047FasTubos[0] ;
         A14048FasStki = T00117_A14048FasStki[0] ;
         A14049FasCops = T00117_A14049FasCops[0] ;
         A14050FasClsHdr = T00117_A14050FasClsHdr[0] ;
         A14051FasStkT = T00117_A14051FasStkT[0] ;
         A14052FasPrefj = T00117_A14052FasPrefj[0] ;
         A14053FasFinHdr = T00117_A14053FasFinHdr[0] ;
         A14054FasDivTime = T00117_A14054FasDivTime[0] ;
         A602MaqCod = T00117_A602MaqCod[0] ;
         n602MaqCod = T00117_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A6162SecCodF = T00117_A6162SecCodF[0] ;
         n6162SecCodF = T00117_n6162SecCodF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
         zm1145( -60) ;
      }
      pr_default.close(5);
      onLoadActions1145( ) ;
   }

   public void onLoadActions1145( )
   {
      A13781FasCDsc = GXutil.trim( A457FasCod) + "-" + GXutil.trim( A460FasDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13781FasCDsc", A13781FasCDsc);
   }

   public void checkExtendedTable1145( )
   {
      nIsDirty_45 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_45 = (short)(1) ;
      A13781FasCDsc = GXutil.trim( A457FasCod) + "-" + GXutil.trim( A460FasDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13781FasCDsc", A13781FasCDsc);
      if ( ! ( ( GXutil.strcmp(A456FasActTin, "S") == 0 ) || ( GXutil.strcmp(A456FasActTin, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Actualizacion Tinte", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASACTTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFasActTin.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A458FasCon, "S") == 0 ) || ( GXutil.strcmp(A458FasCon, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASCON");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFasCon.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4903FasAcab, "S") == 0 ) || ( GXutil.strcmp(A4903FasAcab, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Acabado?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASACAB");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFasAcab.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4286FasForMul, "S") == 0 ) || ( GXutil.strcmp(A4286FasForMul, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Formula?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASFORMUL");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFasForMul.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4299FasConPla, "S") == 0 ) || ( GXutil.strcmp(A4299FasConPla, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Planning?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASCONPLA");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFasConPla.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4343FasEstamp, "S") == 0 ) || ( GXutil.strcmp(A4343FasEstamp, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estampacion ?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASESTAMP");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFasEstamp.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A7105FasObl, "S") == 0 ) || ( GXutil.strcmp(A7105FasObl, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Fase Obligatoria", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASOBL");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFasObl.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A7744FasPreObl == 0 ) || ( A7744FasPreObl == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Precio Obligatorio", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASPREOBL");
         AnyError = (short)(1) ;
         GX_FocusControl = chkFasPreObl.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00115 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A602MaqCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A606MaqDsc = T00115_A606MaqDsc[0] ;
      n606MaqDsc = T00115_n606MaqDsc[0] ;
      pr_default.close(3);
      /* Using cursor T00116 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6162SecCodF)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TSECCI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SECCODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSecCodF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6163SecNomF = T00116_A6163SecNomF[0] ;
      n6163SecNomF = T00116_n6163SecNomF[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1145( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_62( String A396EmprCod ,
                          String A602MaqCod )
   {
      /* Using cursor T00118 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A602MaqCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A606MaqDsc = T00118_A606MaqDsc[0] ;
      n606MaqDsc = T00118_n606MaqDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_63( String A396EmprCod ,
                          String A6162SecCodF )
   {
      /* Using cursor T00119 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6162SecCodF)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TSECCI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SECCODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSecCodF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6163SecNomF = T00119_A6163SecNomF[0] ;
      n6163SecNomF = T00119_n6163SecNomF[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6163SecNomF))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1145( )
   {
      /* Using cursor T001110 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00113 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00113_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1145( 60) ;
         RcdFound45 = (short)(1) ;
         A457FasCod = T00113_A457FasCod[0] ;
         n457FasCod = T00113_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A4588FasCC = T00113_A4588FasCC[0] ;
         n4588FasCC = T00113_n4588FasCC[0] ;
         A460FasDsc = T00113_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A7070FasSigla = T00113_A7070FasSigla[0] ;
         n7070FasSigla = T00113_n7070FasSigla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
         A459FasDec = T00113_A459FasDec[0] ;
         n459FasDec = T00113_n459FasDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
         A5990FasDec2 = T00113_A5990FasDec2[0] ;
         n5990FasDec2 = T00113_n5990FasDec2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5990FasDec2", GXutil.ltrimstr( A5990FasDec2, 7, 2));
         A469FasPreSal = T00113_A469FasPreSal[0] ;
         n469FasPreSal = T00113_n469FasPreSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
         A468FasPrePie = T00113_A468FasPrePie[0] ;
         n468FasPrePie = T00113_n468FasPrePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
         A472FasVelPro = T00113_A472FasVelPro[0] ;
         n472FasVelPro = T00113_n472FasVelPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
         A464FasNumPas = T00113_A464FasNumPas[0] ;
         n464FasNumPas = T00113_n464FasNumPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
         A456FasActTin = T00113_A456FasActTin[0] ;
         n456FasActTin = T00113_n456FasActTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
         A458FasCon = T00113_A458FasCon[0] ;
         n458FasCon = T00113_n458FasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
         A4903FasAcab = T00113_A4903FasAcab[0] ;
         n4903FasAcab = T00113_n4903FasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
         A4286FasForMul = T00113_A4286FasForMul[0] ;
         n4286FasForMul = T00113_n4286FasForMul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
         A4299FasConPla = T00113_A4299FasConPla[0] ;
         n4299FasConPla = T00113_n4299FasConPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
         A4343FasEstamp = T00113_A4343FasEstamp[0] ;
         n4343FasEstamp = T00113_n4343FasEstamp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
         A5168FasPreMC = T00113_A5168FasPreMC[0] ;
         n5168FasPreMC = T00113_n5168FasPreMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5168FasPreMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5168FasPreMC), 4, 0));
         A4791FasValMtr = T00113_A4791FasValMtr[0] ;
         n4791FasValMtr = T00113_n4791FasValMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4791FasValMtr", GXutil.ltrimstr( A4791FasValMtr, 12, 5));
         A5232FasProCtb = T00113_A5232FasProCtb[0] ;
         n5232FasProCtb = T00113_n5232FasProCtb[0] ;
         A5616FasTExt = T00113_A5616FasTExt[0] ;
         n5616FasTExt = T00113_n5616FasTExt[0] ;
         A6011FasTip = T00113_A6011FasTip[0] ;
         n6011FasTip = T00113_n6011FasTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
         A7105FasObl = T00113_A7105FasObl[0] ;
         n7105FasObl = T00113_n7105FasObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
         A7744FasPreObl = T00113_A7744FasPreObl[0] ;
         n7744FasPreObl = T00113_n7744FasPreObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
         A5368FasGral = T00113_A5368FasGral[0] ;
         n5368FasGral = T00113_n5368FasGral[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
         A6880FasFGp = T00113_A6880FasFGp[0] ;
         n6880FasFGp = T00113_n6880FasFGp[0] ;
         A7059FasPesInt = T00113_A7059FasPesInt[0] ;
         n7059FasPesInt = T00113_n7059FasPesInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
         A8888FasPesExp = T00113_A8888FasPesExp[0] ;
         n8888FasPesExp = T00113_n8888FasPesExp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
         A9838FasObsF = T00113_A9838FasObsF[0] ;
         n9838FasObsF = T00113_n9838FasObsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9838FasObsF", A9838FasObsF);
         A7600FasH2OReh = T00113_A7600FasH2OReh[0] ;
         n7600FasH2OReh = T00113_n7600FasH2OReh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
         A7057FasOpeIns = T00113_A7057FasOpeIns[0] ;
         n7057FasOpeIns = T00113_n7057FasOpeIns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
         A7058FasGrupo = T00113_A7058FasGrupo[0] ;
         n7058FasGrupo = T00113_n7058FasGrupo[0] ;
         A471FasUltLin = T00113_A471FasUltLin[0] ;
         A13808FasNorma = T00113_A13808FasNorma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13808FasNorma", A13808FasNorma);
         A13809FasCarda = T00113_A13809FasCarda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13809FasCarda", A13809FasCarda);
         A14042FasActiva = T00113_A14042FasActiva[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
         A14043FasSalida = T00113_A14043FasSalida[0] ;
         A14044FastoVtx = T00113_A14044FastoVtx[0] ;
         A14045FasMtsAnc = T00113_A14045FasMtsAnc[0] ;
         A14046FasInsAlb = T00113_A14046FasInsAlb[0] ;
         A14047FasTubos = T00113_A14047FasTubos[0] ;
         A14048FasStki = T00113_A14048FasStki[0] ;
         A14049FasCops = T00113_A14049FasCops[0] ;
         A14050FasClsHdr = T00113_A14050FasClsHdr[0] ;
         A14051FasStkT = T00113_A14051FasStkT[0] ;
         A14052FasPrefj = T00113_A14052FasPrefj[0] ;
         A14053FasFinHdr = T00113_A14053FasFinHdr[0] ;
         A14054FasDivTime = T00113_A14054FasDivTime[0] ;
         A602MaqCod = T00113_A602MaqCod[0] ;
         n602MaqCod = T00113_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A6162SecCodF = T00113_A6162SecCodF[0] ;
         n6162SecCodF = T00113_n6162SecCodF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
         O460FasDsc = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1145( ) ;
         if ( AnyError == 1 )
         {
            RcdFound45 = (short)(0) ;
            initializeNonKey1145( ) ;
         }
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKey1145( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1145( ) ;
      if ( RcdFound45 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T001111 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T001111_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T001111_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T001111_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T001111_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A457FasCod = T001111_A457FasCod[0] ;
            n457FasCod = T001111_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T001112 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T001112_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T001112_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T001112_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T001112_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A457FasCod = T001112_A457FasCod[0] ;
            n457FasCod = T001112_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1145( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1145( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound45 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               A457FasCod = Z457FasCod ;
               n457FasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1145( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1145( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FASCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1145( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
      {
         A457FasCod = Z457FasCod ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1145( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00112 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4588FasCC, T00112_A4588FasCC[0]) != 0 ) || ( GXutil.strcmp(Z460FasDsc, T00112_A460FasDsc[0]) != 0 ) || ( GXutil.strcmp(Z7070FasSigla, T00112_A7070FasSigla[0]) != 0 ) || ( DecimalUtil.compareTo(Z459FasDec, T00112_A459FasDec[0]) != 0 ) || ( DecimalUtil.compareTo(Z5990FasDec2, T00112_A5990FasDec2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z469FasPreSal != T00112_A469FasPreSal[0] ) || ( Z468FasPrePie != T00112_A468FasPrePie[0] ) || ( DecimalUtil.compareTo(Z472FasVelPro, T00112_A472FasVelPro[0]) != 0 ) || ( Z464FasNumPas != T00112_A464FasNumPas[0] ) || ( GXutil.strcmp(Z456FasActTin, T00112_A456FasActTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z458FasCon, T00112_A458FasCon[0]) != 0 ) || ( GXutil.strcmp(Z4903FasAcab, T00112_A4903FasAcab[0]) != 0 ) || ( GXutil.strcmp(Z4286FasForMul, T00112_A4286FasForMul[0]) != 0 ) || ( GXutil.strcmp(Z4299FasConPla, T00112_A4299FasConPla[0]) != 0 ) || ( GXutil.strcmp(Z4343FasEstamp, T00112_A4343FasEstamp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5168FasPreMC != T00112_A5168FasPreMC[0] ) || ( DecimalUtil.compareTo(Z4791FasValMtr, T00112_A4791FasValMtr[0]) != 0 ) || ( GXutil.strcmp(Z5232FasProCtb, T00112_A5232FasProCtb[0]) != 0 ) || ( GXutil.strcmp(Z5616FasTExt, T00112_A5616FasTExt[0]) != 0 ) || ( GXutil.strcmp(Z6011FasTip, T00112_A6011FasTip[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7105FasObl, T00112_A7105FasObl[0]) != 0 ) || ( Z7744FasPreObl != T00112_A7744FasPreObl[0] ) || ( GXutil.strcmp(Z5368FasGral, T00112_A5368FasGral[0]) != 0 ) || ( DecimalUtil.compareTo(Z6880FasFGp, T00112_A6880FasFGp[0]) != 0 ) || ( GXutil.strcmp(Z7059FasPesInt, T00112_A7059FasPesInt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8888FasPesExp, T00112_A8888FasPesExp[0]) != 0 ) || ( GXutil.strcmp(Z9838FasObsF, T00112_A9838FasObsF[0]) != 0 ) || ( GXutil.strcmp(Z7600FasH2OReh, T00112_A7600FasH2OReh[0]) != 0 ) || ( GXutil.strcmp(Z7057FasOpeIns, T00112_A7057FasOpeIns[0]) != 0 ) || ( Z7058FasGrupo != T00112_A7058FasGrupo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z471FasUltLin != T00112_A471FasUltLin[0] ) || ( GXutil.strcmp(Z13808FasNorma, T00112_A13808FasNorma[0]) != 0 ) || ( GXutil.strcmp(Z13809FasCarda, T00112_A13809FasCarda[0]) != 0 ) || ( GXutil.strcmp(Z14042FasActiva, T00112_A14042FasActiva[0]) != 0 ) || ( GXutil.strcmp(Z14043FasSalida, T00112_A14043FasSalida[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14044FastoVtx, T00112_A14044FastoVtx[0]) != 0 ) || ( GXutil.strcmp(Z14045FasMtsAnc, T00112_A14045FasMtsAnc[0]) != 0 ) || ( GXutil.strcmp(Z14046FasInsAlb, T00112_A14046FasInsAlb[0]) != 0 ) || ( GXutil.strcmp(Z14047FasTubos, T00112_A14047FasTubos[0]) != 0 ) || ( GXutil.strcmp(Z14048FasStki, T00112_A14048FasStki[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14049FasCops, T00112_A14049FasCops[0]) != 0 ) || ( Z14050FasClsHdr != T00112_A14050FasClsHdr[0] ) || ( GXutil.strcmp(Z14051FasStkT, T00112_A14051FasStkT[0]) != 0 ) || ( GXutil.strcmp(Z14052FasPrefj, T00112_A14052FasPrefj[0]) != 0 ) || ( GXutil.strcmp(Z14053FasFinHdr, T00112_A14053FasFinHdr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14054FasDivTime, T00112_A14054FasDivTime[0]) != 0 ) || ( GXutil.strcmp(Z602MaqCod, T00112_A602MaqCod[0]) != 0 ) || ( GXutil.strcmp(Z6162SecCodF, T00112_A6162SecCodF[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4588FasCC, T00112_A4588FasCC[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasCC");
               GXutil.writeLogRaw("Old: ",Z4588FasCC);
               GXutil.writeLogRaw("Current: ",T00112_A4588FasCC[0]);
            }
            if ( GXutil.strcmp(Z460FasDsc, T00112_A460FasDsc[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasDsc");
               GXutil.writeLogRaw("Old: ",Z460FasDsc);
               GXutil.writeLogRaw("Current: ",T00112_A460FasDsc[0]);
            }
            if ( GXutil.strcmp(Z7070FasSigla, T00112_A7070FasSigla[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasSigla");
               GXutil.writeLogRaw("Old: ",Z7070FasSigla);
               GXutil.writeLogRaw("Current: ",T00112_A7070FasSigla[0]);
            }
            if ( DecimalUtil.compareTo(Z459FasDec, T00112_A459FasDec[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasDec");
               GXutil.writeLogRaw("Old: ",Z459FasDec);
               GXutil.writeLogRaw("Current: ",T00112_A459FasDec[0]);
            }
            if ( DecimalUtil.compareTo(Z5990FasDec2, T00112_A5990FasDec2[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasDec2");
               GXutil.writeLogRaw("Old: ",Z5990FasDec2);
               GXutil.writeLogRaw("Current: ",T00112_A5990FasDec2[0]);
            }
            if ( Z469FasPreSal != T00112_A469FasPreSal[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasPreSal");
               GXutil.writeLogRaw("Old: ",Z469FasPreSal);
               GXutil.writeLogRaw("Current: ",T00112_A469FasPreSal[0]);
            }
            if ( Z468FasPrePie != T00112_A468FasPrePie[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasPrePie");
               GXutil.writeLogRaw("Old: ",Z468FasPrePie);
               GXutil.writeLogRaw("Current: ",T00112_A468FasPrePie[0]);
            }
            if ( DecimalUtil.compareTo(Z472FasVelPro, T00112_A472FasVelPro[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasVelPro");
               GXutil.writeLogRaw("Old: ",Z472FasVelPro);
               GXutil.writeLogRaw("Current: ",T00112_A472FasVelPro[0]);
            }
            if ( Z464FasNumPas != T00112_A464FasNumPas[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasNumPas");
               GXutil.writeLogRaw("Old: ",Z464FasNumPas);
               GXutil.writeLogRaw("Current: ",T00112_A464FasNumPas[0]);
            }
            if ( GXutil.strcmp(Z456FasActTin, T00112_A456FasActTin[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasActTin");
               GXutil.writeLogRaw("Old: ",Z456FasActTin);
               GXutil.writeLogRaw("Current: ",T00112_A456FasActTin[0]);
            }
            if ( GXutil.strcmp(Z458FasCon, T00112_A458FasCon[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasCon");
               GXutil.writeLogRaw("Old: ",Z458FasCon);
               GXutil.writeLogRaw("Current: ",T00112_A458FasCon[0]);
            }
            if ( GXutil.strcmp(Z4903FasAcab, T00112_A4903FasAcab[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasAcab");
               GXutil.writeLogRaw("Old: ",Z4903FasAcab);
               GXutil.writeLogRaw("Current: ",T00112_A4903FasAcab[0]);
            }
            if ( GXutil.strcmp(Z4286FasForMul, T00112_A4286FasForMul[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasForMul");
               GXutil.writeLogRaw("Old: ",Z4286FasForMul);
               GXutil.writeLogRaw("Current: ",T00112_A4286FasForMul[0]);
            }
            if ( GXutil.strcmp(Z4299FasConPla, T00112_A4299FasConPla[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasConPla");
               GXutil.writeLogRaw("Old: ",Z4299FasConPla);
               GXutil.writeLogRaw("Current: ",T00112_A4299FasConPla[0]);
            }
            if ( GXutil.strcmp(Z4343FasEstamp, T00112_A4343FasEstamp[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasEstamp");
               GXutil.writeLogRaw("Old: ",Z4343FasEstamp);
               GXutil.writeLogRaw("Current: ",T00112_A4343FasEstamp[0]);
            }
            if ( Z5168FasPreMC != T00112_A5168FasPreMC[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasPreMC");
               GXutil.writeLogRaw("Old: ",Z5168FasPreMC);
               GXutil.writeLogRaw("Current: ",T00112_A5168FasPreMC[0]);
            }
            if ( DecimalUtil.compareTo(Z4791FasValMtr, T00112_A4791FasValMtr[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasValMtr");
               GXutil.writeLogRaw("Old: ",Z4791FasValMtr);
               GXutil.writeLogRaw("Current: ",T00112_A4791FasValMtr[0]);
            }
            if ( GXutil.strcmp(Z5232FasProCtb, T00112_A5232FasProCtb[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasProCtb");
               GXutil.writeLogRaw("Old: ",Z5232FasProCtb);
               GXutil.writeLogRaw("Current: ",T00112_A5232FasProCtb[0]);
            }
            if ( GXutil.strcmp(Z5616FasTExt, T00112_A5616FasTExt[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasTExt");
               GXutil.writeLogRaw("Old: ",Z5616FasTExt);
               GXutil.writeLogRaw("Current: ",T00112_A5616FasTExt[0]);
            }
            if ( GXutil.strcmp(Z6011FasTip, T00112_A6011FasTip[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasTip");
               GXutil.writeLogRaw("Old: ",Z6011FasTip);
               GXutil.writeLogRaw("Current: ",T00112_A6011FasTip[0]);
            }
            if ( GXutil.strcmp(Z7105FasObl, T00112_A7105FasObl[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasObl");
               GXutil.writeLogRaw("Old: ",Z7105FasObl);
               GXutil.writeLogRaw("Current: ",T00112_A7105FasObl[0]);
            }
            if ( Z7744FasPreObl != T00112_A7744FasPreObl[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasPreObl");
               GXutil.writeLogRaw("Old: ",Z7744FasPreObl);
               GXutil.writeLogRaw("Current: ",T00112_A7744FasPreObl[0]);
            }
            if ( GXutil.strcmp(Z5368FasGral, T00112_A5368FasGral[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasGral");
               GXutil.writeLogRaw("Old: ",Z5368FasGral);
               GXutil.writeLogRaw("Current: ",T00112_A5368FasGral[0]);
            }
            if ( DecimalUtil.compareTo(Z6880FasFGp, T00112_A6880FasFGp[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasFGp");
               GXutil.writeLogRaw("Old: ",Z6880FasFGp);
               GXutil.writeLogRaw("Current: ",T00112_A6880FasFGp[0]);
            }
            if ( GXutil.strcmp(Z7059FasPesInt, T00112_A7059FasPesInt[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasPesInt");
               GXutil.writeLogRaw("Old: ",Z7059FasPesInt);
               GXutil.writeLogRaw("Current: ",T00112_A7059FasPesInt[0]);
            }
            if ( GXutil.strcmp(Z8888FasPesExp, T00112_A8888FasPesExp[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasPesExp");
               GXutil.writeLogRaw("Old: ",Z8888FasPesExp);
               GXutil.writeLogRaw("Current: ",T00112_A8888FasPesExp[0]);
            }
            if ( GXutil.strcmp(Z9838FasObsF, T00112_A9838FasObsF[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasObsF");
               GXutil.writeLogRaw("Old: ",Z9838FasObsF);
               GXutil.writeLogRaw("Current: ",T00112_A9838FasObsF[0]);
            }
            if ( GXutil.strcmp(Z7600FasH2OReh, T00112_A7600FasH2OReh[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasH2OReh");
               GXutil.writeLogRaw("Old: ",Z7600FasH2OReh);
               GXutil.writeLogRaw("Current: ",T00112_A7600FasH2OReh[0]);
            }
            if ( GXutil.strcmp(Z7057FasOpeIns, T00112_A7057FasOpeIns[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasOpeIns");
               GXutil.writeLogRaw("Old: ",Z7057FasOpeIns);
               GXutil.writeLogRaw("Current: ",T00112_A7057FasOpeIns[0]);
            }
            if ( Z7058FasGrupo != T00112_A7058FasGrupo[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasGrupo");
               GXutil.writeLogRaw("Old: ",Z7058FasGrupo);
               GXutil.writeLogRaw("Current: ",T00112_A7058FasGrupo[0]);
            }
            if ( Z471FasUltLin != T00112_A471FasUltLin[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasUltLin");
               GXutil.writeLogRaw("Old: ",Z471FasUltLin);
               GXutil.writeLogRaw("Current: ",T00112_A471FasUltLin[0]);
            }
            if ( GXutil.strcmp(Z13808FasNorma, T00112_A13808FasNorma[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasNorma");
               GXutil.writeLogRaw("Old: ",Z13808FasNorma);
               GXutil.writeLogRaw("Current: ",T00112_A13808FasNorma[0]);
            }
            if ( GXutil.strcmp(Z13809FasCarda, T00112_A13809FasCarda[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasCarda");
               GXutil.writeLogRaw("Old: ",Z13809FasCarda);
               GXutil.writeLogRaw("Current: ",T00112_A13809FasCarda[0]);
            }
            if ( GXutil.strcmp(Z14042FasActiva, T00112_A14042FasActiva[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasActiva");
               GXutil.writeLogRaw("Old: ",Z14042FasActiva);
               GXutil.writeLogRaw("Current: ",T00112_A14042FasActiva[0]);
            }
            if ( GXutil.strcmp(Z14043FasSalida, T00112_A14043FasSalida[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasSalida");
               GXutil.writeLogRaw("Old: ",Z14043FasSalida);
               GXutil.writeLogRaw("Current: ",T00112_A14043FasSalida[0]);
            }
            if ( GXutil.strcmp(Z14044FastoVtx, T00112_A14044FastoVtx[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FastoVtx");
               GXutil.writeLogRaw("Old: ",Z14044FastoVtx);
               GXutil.writeLogRaw("Current: ",T00112_A14044FastoVtx[0]);
            }
            if ( GXutil.strcmp(Z14045FasMtsAnc, T00112_A14045FasMtsAnc[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasMtsAnc");
               GXutil.writeLogRaw("Old: ",Z14045FasMtsAnc);
               GXutil.writeLogRaw("Current: ",T00112_A14045FasMtsAnc[0]);
            }
            if ( GXutil.strcmp(Z14046FasInsAlb, T00112_A14046FasInsAlb[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasInsAlb");
               GXutil.writeLogRaw("Old: ",Z14046FasInsAlb);
               GXutil.writeLogRaw("Current: ",T00112_A14046FasInsAlb[0]);
            }
            if ( GXutil.strcmp(Z14047FasTubos, T00112_A14047FasTubos[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasTubos");
               GXutil.writeLogRaw("Old: ",Z14047FasTubos);
               GXutil.writeLogRaw("Current: ",T00112_A14047FasTubos[0]);
            }
            if ( GXutil.strcmp(Z14048FasStki, T00112_A14048FasStki[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasStki");
               GXutil.writeLogRaw("Old: ",Z14048FasStki);
               GXutil.writeLogRaw("Current: ",T00112_A14048FasStki[0]);
            }
            if ( GXutil.strcmp(Z14049FasCops, T00112_A14049FasCops[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasCops");
               GXutil.writeLogRaw("Old: ",Z14049FasCops);
               GXutil.writeLogRaw("Current: ",T00112_A14049FasCops[0]);
            }
            if ( Z14050FasClsHdr != T00112_A14050FasClsHdr[0] )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasClsHdr");
               GXutil.writeLogRaw("Old: ",Z14050FasClsHdr);
               GXutil.writeLogRaw("Current: ",T00112_A14050FasClsHdr[0]);
            }
            if ( GXutil.strcmp(Z14051FasStkT, T00112_A14051FasStkT[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasStkT");
               GXutil.writeLogRaw("Old: ",Z14051FasStkT);
               GXutil.writeLogRaw("Current: ",T00112_A14051FasStkT[0]);
            }
            if ( GXutil.strcmp(Z14052FasPrefj, T00112_A14052FasPrefj[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasPrefj");
               GXutil.writeLogRaw("Old: ",Z14052FasPrefj);
               GXutil.writeLogRaw("Current: ",T00112_A14052FasPrefj[0]);
            }
            if ( GXutil.strcmp(Z14053FasFinHdr, T00112_A14053FasFinHdr[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasFinHdr");
               GXutil.writeLogRaw("Old: ",Z14053FasFinHdr);
               GXutil.writeLogRaw("Current: ",T00112_A14053FasFinHdr[0]);
            }
            if ( GXutil.strcmp(Z14054FasDivTime, T00112_A14054FasDivTime[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"FasDivTime");
               GXutil.writeLogRaw("Old: ",Z14054FasDivTime);
               GXutil.writeLogRaw("Current: ",T00112_A14054FasDivTime[0]);
            }
            if ( GXutil.strcmp(Z602MaqCod, T00112_A602MaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"MaqCod");
               GXutil.writeLogRaw("Old: ",Z602MaqCod);
               GXutil.writeLogRaw("Current: ",T00112_A602MaqCod[0]);
            }
            if ( GXutil.strcmp(Z6162SecCodF, T00112_A6162SecCodF[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro:[seudo value changed for attri]"+"SecCodF");
               GXutil.writeLogRaw("Old: ",Z6162SecCodF);
               GXutil.writeLogRaw("Current: ",T00112_A6162SecCodF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1145( )
   {
      beforeValidate1145( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1145( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1145( 0) ;
         checkOptimisticConcurrency1145( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1145( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1145( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001113 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n4588FasCC), A4588FasCC, A460FasDsc, Boolean.valueOf(n7070FasSigla), A7070FasSigla, Boolean.valueOf(n459FasDec), A459FasDec, Boolean.valueOf(n5990FasDec2), A5990FasDec2, Boolean.valueOf(n469FasPreSal), Short.valueOf(A469FasPreSal), Boolean.valueOf(n468FasPrePie), Short.valueOf(A468FasPrePie), Boolean.valueOf(n472FasVelPro), A472FasVelPro, Boolean.valueOf(n464FasNumPas), Short.valueOf(A464FasNumPas), Boolean.valueOf(n456FasActTin), A456FasActTin, Boolean.valueOf(n458FasCon), A458FasCon, Boolean.valueOf(n4903FasAcab), A4903FasAcab, Boolean.valueOf(n4286FasForMul), A4286FasForMul, Boolean.valueOf(n4299FasConPla), A4299FasConPla, Boolean.valueOf(n4343FasEstamp), A4343FasEstamp, Boolean.valueOf(n5168FasPreMC), Short.valueOf(A5168FasPreMC), Boolean.valueOf(n4791FasValMtr), A4791FasValMtr, Boolean.valueOf(n5232FasProCtb), A5232FasProCtb, Boolean.valueOf(n5616FasTExt), A5616FasTExt, Boolean.valueOf(n6011FasTip), A6011FasTip, Boolean.valueOf(n7105FasObl), A7105FasObl, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Boolean.valueOf(n5368FasGral), A5368FasGral, Boolean.valueOf(n6880FasFGp), A6880FasFGp, Boolean.valueOf(n7059FasPesInt), A7059FasPesInt, Boolean.valueOf(n8888FasPesExp), A8888FasPesExp, Boolean.valueOf(n9838FasObsF), A9838FasObsF, Boolean.valueOf(n7600FasH2OReh), A7600FasH2OReh, Boolean.valueOf(n7057FasOpeIns), A7057FasOpeIns, Boolean.valueOf(n7058FasGrupo), Integer.valueOf(A7058FasGrupo), Byte.valueOf(A471FasUltLin), A13808FasNorma, A13809FasCarda, A14042FasActiva, A14043FasSalida, A14044FastoVtx, A14045FasMtsAnc, A14046FasInsAlb, A14047FasTubos, A14048FasStki, A14049FasCops, Byte.valueOf(A14050FasClsHdr), A14051FasStkT, A14052FasPrefj, A14053FasFinHdr, A14054FasDivTime, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption110( ) ;
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
            load1145( ) ;
         }
         endLevel1145( ) ;
      }
      closeExtendedTableCursors1145( ) ;
   }

   public void update1145( )
   {
      beforeValidate1145( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1145( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1145( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1145( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1145( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001114 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n4588FasCC), A4588FasCC, A460FasDsc, Boolean.valueOf(n7070FasSigla), A7070FasSigla, Boolean.valueOf(n459FasDec), A459FasDec, Boolean.valueOf(n5990FasDec2), A5990FasDec2, Boolean.valueOf(n469FasPreSal), Short.valueOf(A469FasPreSal), Boolean.valueOf(n468FasPrePie), Short.valueOf(A468FasPrePie), Boolean.valueOf(n472FasVelPro), A472FasVelPro, Boolean.valueOf(n464FasNumPas), Short.valueOf(A464FasNumPas), Boolean.valueOf(n456FasActTin), A456FasActTin, Boolean.valueOf(n458FasCon), A458FasCon, Boolean.valueOf(n4903FasAcab), A4903FasAcab, Boolean.valueOf(n4286FasForMul), A4286FasForMul, Boolean.valueOf(n4299FasConPla), A4299FasConPla, Boolean.valueOf(n4343FasEstamp), A4343FasEstamp, Boolean.valueOf(n5168FasPreMC), Short.valueOf(A5168FasPreMC), Boolean.valueOf(n4791FasValMtr), A4791FasValMtr, Boolean.valueOf(n5232FasProCtb), A5232FasProCtb, Boolean.valueOf(n5616FasTExt), A5616FasTExt, Boolean.valueOf(n6011FasTip), A6011FasTip, Boolean.valueOf(n7105FasObl), A7105FasObl, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Boolean.valueOf(n5368FasGral), A5368FasGral, Boolean.valueOf(n6880FasFGp), A6880FasFGp, Boolean.valueOf(n7059FasPesInt), A7059FasPesInt, Boolean.valueOf(n8888FasPesExp), A8888FasPesExp, Boolean.valueOf(n9838FasObsF), A9838FasObsF, Boolean.valueOf(n7600FasH2OReh), A7600FasH2OReh, Boolean.valueOf(n7057FasOpeIns), A7057FasOpeIns, Boolean.valueOf(n7058FasGrupo), Integer.valueOf(A7058FasGrupo), Byte.valueOf(A471FasUltLin), A13808FasNorma, A13809FasCarda, A14042FasActiva, A14043FasSalida, A14044FastoVtx, A14045FasMtsAnc, A14046FasInsAlb, A14047FasTubos, A14048FasStki, A14049FasCops, Byte.valueOf(A14050FasClsHdr), A14051FasStkT, A14052FasPrefj, A14053FasFinHdr, A14054FasDivTime, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1145( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = A457FasCod ;
                     new app.txpfasproupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                     tfaspro_impl.this.A396EmprCod = GXv_char4[0] ;
                     tfaspro_impl.this.A457FasCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
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
         endLevel1145( ) ;
      }
      closeExtendedTableCursors1145( ) ;
   }

   public void deferredUpdate1145( )
   {
   }

   public void delete( )
   {
      beforeValidate1145( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1145( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1145( ) ;
         afterConfirm1145( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1145( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001115 */
               pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
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
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1145( ) ;
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1145( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13781FasCDsc = GXutil.trim( A457FasCod) + "-" + GXutil.trim( A460FasDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13781FasCDsc", A13781FasCDsc);
         /* Using cursor T001116 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         A606MaqDsc = T001116_A606MaqDsc[0] ;
         n606MaqDsc = T001116_n606MaqDsc[0] ;
         pr_default.close(14);
         /* Using cursor T001117 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
         A6163SecNomF = T001117_A6163SecNomF[0] ;
         n6163SecNomF = T001117_n6163SecNomF[0] ;
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001118 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T001119 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T001120 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T001121 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T001122 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T001123 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AVI001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T001124 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFSMQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T001125 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFSS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T001126 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ArtPrd", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T001127 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T001128 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EXHDPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T001129 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALAPFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T001130 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERECL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T001131 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T001132 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T001133 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASES (TERMINALES BROS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T001134 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T001135 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T001136 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T001137 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T001138 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T001139 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T001140 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T001141 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void endLevel1145( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1145( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfaspro");
         if ( AnyError == 0 )
         {
            confirmValues110( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaspro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1145( )
   {
      /* Scan By routine */
      /* Using cursor T001142 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A457FasCod = T001142_A457FasCod[0] ;
         n457FasCod = T001142_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1145( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A457FasCod = T001142_A457FasCod[0] ;
         n457FasCod = T001142_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
   }

   public void scanEnd1145( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1145( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1145( )
   {
      /* Before Insert Rules */
      if ( (GXutil.strcmp("", A457FasCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Fase incorrecto", ""), 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A602MaqCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Maquina Inexistente", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdate1145( )
   {
      /* Before Update Rules */
      if ( (GXutil.strcmp("", A457FasCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Fase incorrecto", ""), 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A602MaqCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Maquina Inexistente", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeDelete1145( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1145( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1145( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1145( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtFasSigla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasSigla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasSigla_Enabled), 5, 0), true);
      chkFasActiva.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasActiva.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasActiva.getEnabled(), 5, 0), true);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), true);
      edtFasDec2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec2_Enabled), 5, 0), true);
      edtFasPreSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), true);
      edtFasPrePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), true);
      edtFasVelPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), true);
      edtFasNumPas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), true);
      cmbFasActTin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasActTin.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasActTin.getEnabled(), 5, 0), true);
      cmbFasCon.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasCon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasCon.getEnabled(), 5, 0), true);
      cmbFasAcab.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasAcab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasAcab.getEnabled(), 5, 0), true);
      cmbFasForMul.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasForMul.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasForMul.getEnabled(), 5, 0), true);
      cmbFasConPla.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasConPla.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasConPla.getEnabled(), 5, 0), true);
      cmbFasObl.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasObl.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasObl.getEnabled(), 5, 0), true);
      cmbFasTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasTip.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasTip.getEnabled(), 5, 0), true);
      cmbFasGral.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasGral.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasGral.getEnabled(), 5, 0), true);
      cmbFasPesInt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasPesInt.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasPesInt.getEnabled(), 5, 0), true);
      cmbFasPesExp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasPesExp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasPesExp.getEnabled(), 5, 0), true);
      cmbFasH2OReh.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasH2OReh.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasH2OReh.getEnabled(), 5, 0), true);
      chkFasOpeIns.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasOpeIns.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasOpeIns.getEnabled(), 5, 0), true);
      chkFasCarda.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasCarda.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasCarda.getEnabled(), 5, 0), true);
      edtSecCodF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Enabled), 5, 0), true);
      edtFasValMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasValMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasValMtr_Enabled), 5, 0), true);
      edtFasObsF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasObsF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasObsF_Enabled), 5, 0), true);
      cmbFasEstamp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasEstamp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFasEstamp.getEnabled(), 5, 0), true);
      edtFasPreMC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMC_Enabled), 5, 0), true);
      chkFasPreObl.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreObl.getEnabled(), 5, 0), true);
      chkFasNorma.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasNorma.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasNorma.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombomaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqcod_Enabled), 5, 0), true);
      edtavComboseccodf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboseccodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboseccodf_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1145( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues110( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tfaspro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV73EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV81FasCod))}, new String[] {"Gx_mode","EmprCod","FasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFASPRO");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("FasCC", GXutil.rtrim( localUtil.format( A4588FasCC, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV88Pgmname, "")));
      forbiddenHiddens.add("FasProCtb", GXutil.rtrim( localUtil.format( A5232FasProCtb, "")));
      forbiddenHiddens.add("FasTExt", GXutil.rtrim( localUtil.format( A5616FasTExt, "@!")));
      forbiddenHiddens.add("FasFGp", localUtil.format( A6880FasFGp, "ZZ9.99"));
      forbiddenHiddens.add("FasGrupo", localUtil.format( DecimalUtil.doubleToDec(A7058FasGrupo), "ZZZZZZ"));
      forbiddenHiddens.add("FasUltLin", localUtil.format( DecimalUtil.doubleToDec(A471FasUltLin), "Z9"));
      forbiddenHiddens.add("FasSalida", GXutil.rtrim( localUtil.format( A14043FasSalida, "")));
      forbiddenHiddens.add("FastoVtx", GXutil.rtrim( localUtil.format( A14044FastoVtx, "")));
      forbiddenHiddens.add("FasMtsAnc", GXutil.rtrim( localUtil.format( A14045FasMtsAnc, "")));
      forbiddenHiddens.add("FasInsAlb", GXutil.rtrim( localUtil.format( A14046FasInsAlb, "")));
      forbiddenHiddens.add("FasTubos", GXutil.rtrim( localUtil.format( A14047FasTubos, "")));
      forbiddenHiddens.add("FasStki", GXutil.rtrim( localUtil.format( A14048FasStki, "")));
      forbiddenHiddens.add("FasCops", GXutil.rtrim( localUtil.format( A14049FasCops, "")));
      forbiddenHiddens.add("FasClsHdr", localUtil.format( DecimalUtil.doubleToDec(A14050FasClsHdr), "9"));
      forbiddenHiddens.add("FasStkT", GXutil.rtrim( localUtil.format( A14051FasStkT, "")));
      forbiddenHiddens.add("FasPrefj", GXutil.rtrim( localUtil.format( A14052FasPrefj, "")));
      forbiddenHiddens.add("FasFinHdr", GXutil.rtrim( localUtil.format( A14053FasFinHdr, "")));
      forbiddenHiddens.add("FasDivTime", GXutil.rtrim( localUtil.format( A14054FasDivTime, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfaspro:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4588FasCC", GXutil.rtrim( Z4588FasCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7070FasSigla", GXutil.rtrim( Z7070FasSigla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z459FasDec", GXutil.ltrim( localUtil.ntoc( Z459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5990FasDec2", GXutil.ltrim( localUtil.ntoc( Z5990FasDec2, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z469FasPreSal", GXutil.ltrim( localUtil.ntoc( Z469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z468FasPrePie", GXutil.ltrim( localUtil.ntoc( Z468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z472FasVelPro", GXutil.ltrim( localUtil.ntoc( Z472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z464FasNumPas", GXutil.ltrim( localUtil.ntoc( Z464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z456FasActTin", GXutil.rtrim( Z456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z458FasCon", GXutil.rtrim( Z458FasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4903FasAcab", GXutil.rtrim( Z4903FasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4286FasForMul", GXutil.rtrim( Z4286FasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4299FasConPla", GXutil.rtrim( Z4299FasConPla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4343FasEstamp", GXutil.rtrim( Z4343FasEstamp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5168FasPreMC", GXutil.ltrim( localUtil.ntoc( Z5168FasPreMC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4791FasValMtr", GXutil.ltrim( localUtil.ntoc( Z4791FasValMtr, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5232FasProCtb", GXutil.rtrim( Z5232FasProCtb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5616FasTExt", GXutil.rtrim( Z5616FasTExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6011FasTip", GXutil.rtrim( Z6011FasTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7105FasObl", GXutil.rtrim( Z7105FasObl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7744FasPreObl", GXutil.ltrim( localUtil.ntoc( Z7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5368FasGral", GXutil.rtrim( Z5368FasGral));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6880FasFGp", GXutil.ltrim( localUtil.ntoc( Z6880FasFGp, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7059FasPesInt", GXutil.rtrim( Z7059FasPesInt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8888FasPesExp", GXutil.rtrim( Z8888FasPesExp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9838FasObsF", Z9838FasObsF);
      app.GxWebStd.gx_hidden_field( httpContext, "Z7600FasH2OReh", GXutil.rtrim( Z7600FasH2OReh));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7057FasOpeIns", GXutil.rtrim( Z7057FasOpeIns));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7058FasGrupo", GXutil.ltrim( localUtil.ntoc( Z7058FasGrupo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z471FasUltLin", GXutil.ltrim( localUtil.ntoc( Z471FasUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13808FasNorma", GXutil.rtrim( Z13808FasNorma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13809FasCarda", GXutil.rtrim( Z13809FasCarda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14042FasActiva", GXutil.rtrim( Z14042FasActiva));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14043FasSalida", GXutil.rtrim( Z14043FasSalida));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14044FastoVtx", GXutil.rtrim( Z14044FastoVtx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14045FasMtsAnc", GXutil.rtrim( Z14045FasMtsAnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14046FasInsAlb", GXutil.rtrim( Z14046FasInsAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14047FasTubos", GXutil.rtrim( Z14047FasTubos));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14048FasStki", GXutil.rtrim( Z14048FasStki));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14049FasCops", GXutil.rtrim( Z14049FasCops));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14050FasClsHdr", GXutil.ltrim( localUtil.ntoc( Z14050FasClsHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14051FasStkT", GXutil.rtrim( Z14051FasStkT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14052FasPrefj", GXutil.rtrim( Z14052FasPrefj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14053FasFinHdr", GXutil.rtrim( Z14053FasFinHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14054FasDivTime", GXutil.rtrim( Z14054FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6162SecCodF", GXutil.rtrim( Z6162SecCodF));
      app.GxWebStd.gx_hidden_field( httpContext, "O460FasDsc", GXutil.rtrim( O460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N602MaqCod", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N6162SecCodF", GXutil.rtrim( A6162SecCodF));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV85MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV85MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSECCODF_DATA", AV82SecCodF_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSECCODF_DATA", AV82SecCodF_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV76TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV76TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV76TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCDSC", A13781FasCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV73EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV81FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MAQCOD", GXutil.rtrim( AV78Insert_MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_SECCODF", GXutil.rtrim( AV79Insert_SecCodF));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCC", GXutil.rtrim( A4588FasCC));
      app.GxWebStd.gx_hidden_field( httpContext, "FASTEXT", GXutil.rtrim( A5616FasTExt));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPROCTB", GXutil.rtrim( A5232FasProCtb));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFGP", GXutil.ltrim( localUtil.ntoc( A6880FasFGp, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASGRUPO", GXutil.ltrim( localUtil.ntoc( A7058FasGrupo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASULTLIN", GXutil.ltrim( localUtil.ntoc( A471FasUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSALIDA", GXutil.rtrim( A14043FasSalida));
      app.GxWebStd.gx_hidden_field( httpContext, "FASTOVTX", GXutil.rtrim( A14044FastoVtx));
      app.GxWebStd.gx_hidden_field( httpContext, "FASMTSANC", GXutil.rtrim( A14045FasMtsAnc));
      app.GxWebStd.gx_hidden_field( httpContext, "FASINSALB", GXutil.rtrim( A14046FasInsAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "FASTUBOS", GXutil.rtrim( A14047FasTubos));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSTKI", GXutil.rtrim( A14048FasStki));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOPS", GXutil.rtrim( A14049FasCops));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCLSHDR", GXutil.ltrim( localUtil.ntoc( A14050FasClsHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSTKT", GXutil.rtrim( A14051FasStkT));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREFJ", GXutil.rtrim( A14052FasPrefj));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFINHDR", GXutil.rtrim( A14053FasFinHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDIVTIME", GXutil.rtrim( A14054FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "SECNOMF", GXutil.rtrim( A6163SecNomF));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Objectcall", GXutil.rtrim( Combo_maqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Enabled", GXutil.booltostr( Combo_maqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitem", GXutil.booltostr( Combo_maqcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable9_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Enabled", GXutil.booltostr( Dvpanel_unnamedtable9_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable10_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Enabled", GXutil.booltostr( Dvpanel_unnamedtable10_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Width", GXutil.rtrim( Dvpanel_unnamedtable10_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable10_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable10_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Cls", GXutil.rtrim( Dvpanel_unnamedtable10_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Title", GXutil.rtrim( Dvpanel_unnamedtable10_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable10_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable10_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable10_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SECCODF_Objectcall", GXutil.rtrim( Combo_seccodf_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SECCODF_Cls", GXutil.rtrim( Combo_seccodf_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SECCODF_Selectedvalue_set", GXutil.rtrim( Combo_seccodf_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SECCODF_Enabled", GXutil.booltostr( Combo_seccodf_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SECCODF_Visible", GXutil.booltostr( Combo_seccodf_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SECCODF_Emptyitemtext", GXutil.rtrim( Combo_seccodf_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Objectcall", GXutil.rtrim( Dvpanel_panelotrosdatos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Enabled", GXutil.booltostr( Dvpanel_panelotrosdatos_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Width", GXutil.rtrim( Dvpanel_panelotrosdatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Autowidth", GXutil.booltostr( Dvpanel_panelotrosdatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Autoheight", GXutil.booltostr( Dvpanel_panelotrosdatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Cls", GXutil.rtrim( Dvpanel_panelotrosdatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Title", GXutil.rtrim( Dvpanel_panelotrosdatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Collapsible", GXutil.booltostr( Dvpanel_panelotrosdatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Collapsed", GXutil.booltostr( Dvpanel_panelotrosdatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelotrosdatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Iconposition", GXutil.rtrim( Dvpanel_panelotrosdatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOTROSDATOS_Autoscroll", GXutil.booltostr( Dvpanel_panelotrosdatos_Autoscroll));
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
      return formatLink("app.tfaspro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV73EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV81FasCod))}, new String[] {"Gx_mode","EmprCod","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TFASPRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FASES", "") ;
   }

   public void initializeNonKey1145( )
   {
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A6162SecCodF = "" ;
      n6162SecCodF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
      A4588FasCC = httpContext.getMessage( "N", "") ;
      n4588FasCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4588FasCC", A4588FasCC);
      A13781FasCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13781FasCDsc", A13781FasCDsc);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A7070FasSigla = "" ;
      n7070FasSigla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
      A5990FasDec2 = DecimalUtil.ZERO ;
      n5990FasDec2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5990FasDec2", GXutil.ltrimstr( A5990FasDec2, 7, 2));
      A469FasPreSal = (short)(0) ;
      n469FasPreSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
      A468FasPrePie = (short)(0) ;
      n468FasPrePie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
      A456FasActTin = "" ;
      n456FasActTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      A458FasCon = "" ;
      n458FasCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      A4299FasConPla = "" ;
      n4299FasConPla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
      A5168FasPreMC = (short)(0) ;
      n5168FasPreMC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5168FasPreMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5168FasPreMC), 4, 0));
      A4791FasValMtr = DecimalUtil.ZERO ;
      n4791FasValMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4791FasValMtr", GXutil.ltrimstr( A4791FasValMtr, 12, 5));
      A5232FasProCtb = "" ;
      n5232FasProCtb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5232FasProCtb", A5232FasProCtb);
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      A6880FasFGp = DecimalUtil.ZERO ;
      n6880FasFGp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6880FasFGp", GXutil.ltrimstr( A6880FasFGp, 6, 2));
      A9838FasObsF = "" ;
      n9838FasObsF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9838FasObsF", A9838FasObsF);
      A6163SecNomF = "" ;
      n6163SecNomF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6163SecNomF", A6163SecNomF);
      A7058FasGrupo = 0 ;
      n7058FasGrupo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7058FasGrupo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7058FasGrupo), 6, 0));
      A471FasUltLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      A13808FasNorma = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13808FasNorma", A13808FasNorma);
      A13809FasCarda = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13809FasCarda", A13809FasCarda);
      A14043FasSalida = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14043FasSalida", A14043FasSalida);
      A14044FastoVtx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14044FastoVtx", A14044FastoVtx);
      A14045FasMtsAnc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14045FasMtsAnc", A14045FasMtsAnc);
      A14046FasInsAlb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14046FasInsAlb", A14046FasInsAlb);
      A14047FasTubos = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14047FasTubos", A14047FasTubos);
      A14048FasStki = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14048FasStki", A14048FasStki);
      A14049FasCops = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14049FasCops", A14049FasCops);
      A14050FasClsHdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14050FasClsHdr", GXutil.str( A14050FasClsHdr, 1, 0));
      A14051FasStkT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14051FasStkT", A14051FasStkT);
      A14052FasPrefj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14052FasPrefj", A14052FasPrefj);
      A14053FasFinHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14053FasFinHdr", A14053FasFinHdr);
      A14054FasDivTime = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14054FasDivTime", A14054FasDivTime);
      A472FasVelPro = DecimalUtil.doubleToDec(1) ;
      n472FasVelPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      A464FasNumPas = (short)(1) ;
      n464FasNumPas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      A4903FasAcab = httpContext.getMessage( "N", "") ;
      n4903FasAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A4286FasForMul = httpContext.getMessage( "N", "") ;
      n4286FasForMul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A4343FasEstamp = httpContext.getMessage( "N", "") ;
      n4343FasEstamp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
      A5616FasTExt = " " ;
      n5616FasTExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5616FasTExt", A5616FasTExt);
      A6011FasTip = httpContext.getMessage( "N", "") ;
      n6011FasTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
      A7105FasObl = httpContext.getMessage( "N", "") ;
      n7105FasObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
      A5368FasGral = httpContext.getMessage( "N", "") ;
      n5368FasGral = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
      A7059FasPesInt = httpContext.getMessage( "N", "") ;
      n7059FasPesInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
      A8888FasPesExp = httpContext.getMessage( "N", "") ;
      n8888FasPesExp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
      A7600FasH2OReh = httpContext.getMessage( "N", "") ;
      n7600FasH2OReh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
      A7057FasOpeIns = httpContext.getMessage( "N", "") ;
      n7057FasOpeIns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
      A14042FasActiva = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
      O460FasDsc = A460FasDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      Z4588FasCC = "" ;
      Z460FasDsc = "" ;
      Z7070FasSigla = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z5990FasDec2 = DecimalUtil.ZERO ;
      Z469FasPreSal = (short)(0) ;
      Z468FasPrePie = (short)(0) ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z464FasNumPas = (short)(0) ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z4903FasAcab = "" ;
      Z4286FasForMul = "" ;
      Z4299FasConPla = "" ;
      Z4343FasEstamp = "" ;
      Z5168FasPreMC = (short)(0) ;
      Z4791FasValMtr = DecimalUtil.ZERO ;
      Z5232FasProCtb = "" ;
      Z5616FasTExt = "" ;
      Z6011FasTip = "" ;
      Z7105FasObl = "" ;
      Z7744FasPreObl = (byte)(0) ;
      Z5368FasGral = "" ;
      Z6880FasFGp = DecimalUtil.ZERO ;
      Z7059FasPesInt = "" ;
      Z8888FasPesExp = "" ;
      Z9838FasObsF = "" ;
      Z7600FasH2OReh = "" ;
      Z7057FasOpeIns = "" ;
      Z7058FasGrupo = 0 ;
      Z471FasUltLin = (byte)(0) ;
      Z13808FasNorma = "" ;
      Z13809FasCarda = "" ;
      Z14042FasActiva = "" ;
      Z14043FasSalida = "" ;
      Z14044FastoVtx = "" ;
      Z14045FasMtsAnc = "" ;
      Z14046FasInsAlb = "" ;
      Z14047FasTubos = "" ;
      Z14048FasStki = "" ;
      Z14049FasCops = "" ;
      Z14050FasClsHdr = (byte)(0) ;
      Z14051FasStkT = "" ;
      Z14052FasPrefj = "" ;
      Z14053FasFinHdr = "" ;
      Z14054FasDivTime = "" ;
      Z602MaqCod = "" ;
      Z6162SecCodF = "" ;
   }

   public void initAll1145( )
   {
      A457FasCod = "" ;
      n457FasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      initializeNonKey1145( ) ;
   }

   public void standaloneModalInsert( )
   {
      A4588FasCC = i4588FasCC ;
      n4588FasCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4588FasCC", A4588FasCC);
      A472FasVelPro = i472FasVelPro ;
      n472FasVelPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      A464FasNumPas = i464FasNumPas ;
      n464FasNumPas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      A4343FasEstamp = i4343FasEstamp ;
      n4343FasEstamp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
      A4286FasForMul = i4286FasForMul ;
      n4286FasForMul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A4903FasAcab = i4903FasAcab ;
      n4903FasAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A5616FasTExt = i5616FasTExt ;
      n5616FasTExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5616FasTExt", A5616FasTExt);
      A6011FasTip = i6011FasTip ;
      n6011FasTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
      A7600FasH2OReh = i7600FasH2OReh ;
      n7600FasH2OReh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
      A7105FasObl = i7105FasObl ;
      n7105FasObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
      A5368FasGral = i5368FasGral ;
      n5368FasGral = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
      A7059FasPesInt = i7059FasPesInt ;
      n7059FasPesInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
      A8888FasPesExp = i8888FasPesExp ;
      n8888FasPesExp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
      A7057FasOpeIns = i7057FasOpeIns ;
      n7057FasOpeIns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
      A14042FasActiva = i14042FasActiva ;
      httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211651954", true, true);
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
      httpContext.AddJavascriptSource("tfaspro.js", "?20268211651954", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblockmaqcod_Internalname = "TEXTBLOCKMAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      edtFasSigla_Internalname = "FASSIGLA" ;
      chkFasActiva.setInternalname( "FASACTIVA" );
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtFasDec2_Internalname = "FASDEC2" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = "DVPANEL_UNNAMEDTABLE9" ;
      cmbFasActTin.setInternalname( "FASACTTIN" );
      cmbFasCon.setInternalname( "FASCON" );
      cmbFasAcab.setInternalname( "FASACAB" );
      cmbFasForMul.setInternalname( "FASFORMUL" );
      cmbFasConPla.setInternalname( "FASCONPLA" );
      cmbFasObl.setInternalname( "FASOBL" );
      divFasobl_cell_Internalname = "FASOBL_CELL" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = "DVPANEL_UNNAMEDTABLE10" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbFasTip.setInternalname( "FASTIP" );
      cmbFasGral.setInternalname( "FASGRAL" );
      divFasgral_cell_Internalname = "FASGRAL_CELL" ;
      cmbFasPesInt.setInternalname( "FASPESINT" );
      cmbFasPesExp.setInternalname( "FASPESEXP" );
      cmbFasH2OReh.setInternalname( "FASH2OREH" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      chkFasOpeIns.setInternalname( "FASOPEINS" );
      divFasopeins_cell_Internalname = "FASOPEINS_CELL" ;
      chkFasCarda.setInternalname( "FASCARDA" );
      divFascarda_cell_Internalname = "FASCARDA_CELL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTextblockseccodf_Internalname = "TEXTBLOCKSECCODF" ;
      Combo_seccodf_Internalname = "COMBO_SECCODF" ;
      edtSecCodF_Internalname = "SECCODF" ;
      divTablesplittedseccodf_Internalname = "TABLESPLITTEDSECCODF" ;
      divCombo_seccodf_cell_Internalname = "COMBO_SECCODF_CELL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtFasValMtr_Internalname = "FASVALMTR" ;
      divFasvalmtr_cell_Internalname = "FASVALMTR_CELL" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtFasObsF_Internalname = "FASOBSF" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      tblPanelotrosdatos_Internalname = "PANELOTROSDATOS" ;
      Dvpanel_panelotrosdatos_Internalname = "DVPANEL_PANELOTROSDATOS" ;
      cmbFasEstamp.setInternalname( "FASESTAMP" );
      edtFasPreMC_Internalname = "FASPREMC" ;
      chkFasPreObl.setInternalname( "FASPREOBL" );
      divFaspreobl_cell_Internalname = "FASPREOBL_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divDvpanel_unnamedtable3_cell_Internalname = "DVPANEL_UNNAMEDTABLE3_CELL" ;
      chkFasNorma.setInternalname( "FASNORMA" );
      divFasnorma_cell_Internalname = "FASNORMA_CELL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombomaqcod_Internalname = "vCOMBOMAQCOD" ;
      divSectionattribute_maqcod_Internalname = "SECTIONATTRIBUTE_MAQCOD" ;
      edtavComboseccodf_Internalname = "vCOMBOSECCODF" ;
      divSectionattribute_seccodf_Internalname = "SECTIONATTRIBUTE_SECCODF" ;
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
      Form.setCaption( httpContext.getMessage( "FASES", "") );
      Combo_seccodf_Visible = GXutil.toBoolean( -1) ;
      edtavComboseccodf_Jsonclick = "" ;
      edtavComboseccodf_Enabled = 0 ;
      edtavComboseccodf_Visible = 1 ;
      edtavCombomaqcod_Jsonclick = "" ;
      edtavCombomaqcod_Enabled = 0 ;
      edtavCombomaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      chkFasNorma.setEnabled( 1 );
      chkFasNorma.setVisible( 1 );
      divFasnorma_cell_Class = "col-xs-12" ;
      chkFasPreObl.setEnabled( 1 );
      chkFasPreObl.setVisible( 1 );
      divFaspreobl_cell_Class = "col-xs-12 col-sm-4" ;
      edtFasPreMC_Jsonclick = "" ;
      edtFasPreMC_Enabled = 1 ;
      cmbFasEstamp.setJsonclick( "" );
      cmbFasEstamp.setEnabled( 1 );
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Estampacion", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      divDvpanel_unnamedtable3_cell_Class = "col-xs-12" ;
      edtFasObsF_Enabled = 1 ;
      edtFasValMtr_Jsonclick = "" ;
      edtFasValMtr_Enabled = 1 ;
      edtFasValMtr_Visible = 1 ;
      divFasvalmtr_cell_Class = "col-xs-12" ;
      divUnnamedtable7_Visible = 1 ;
      edtSecCodF_Jsonclick = "" ;
      edtSecCodF_Enabled = 1 ;
      edtSecCodF_Visible = 1 ;
      Combo_seccodf_Emptyitemtext = "" ;
      Combo_seccodf_Cls = "ExtendedCombo AttributeFL" ;
      Combo_seccodf_Enabled = GXutil.toBoolean( -1) ;
      divCombo_seccodf_cell_Class = "col-xs-12" ;
      divUnnamedtable6_Visible = 1 ;
      chkFasCarda.setEnabled( 1 );
      chkFasCarda.setVisible( 1 );
      divFascarda_cell_Class = "col-xs-12 col-sm-6" ;
      chkFasOpeIns.setEnabled( 1 );
      chkFasOpeIns.setVisible( 1 );
      divFasopeins_cell_Class = "col-xs-12 col-sm-6" ;
      divUnnamedtable5_Visible = 1 ;
      cmbFasH2OReh.setJsonclick( "" );
      cmbFasH2OReh.setEnabled( 1 );
      cmbFasPesExp.setJsonclick( "" );
      cmbFasPesExp.setEnabled( 1 );
      cmbFasPesInt.setJsonclick( "" );
      cmbFasPesInt.setEnabled( 1 );
      cmbFasGral.setJsonclick( "" );
      cmbFasGral.setEnabled( 1 );
      cmbFasGral.setVisible( 1 );
      divFasgral_cell_Class = "col-xs-12 col-sm-3" ;
      cmbFasTip.setJsonclick( "" );
      cmbFasTip.setEnabled( 1 );
      Dvpanel_panelotrosdatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelotrosdatos_Iconposition = "Right" ;
      Dvpanel_panelotrosdatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelotrosdatos_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelotrosdatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelotrosdatos_Title = httpContext.getMessage( "Otros datos", "") ;
      Dvpanel_panelotrosdatos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelotrosdatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelotrosdatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelotrosdatos_Width = "100%" ;
      cmbFasObl.setJsonclick( "" );
      cmbFasObl.setEnabled( 1 );
      cmbFasObl.setVisible( 1 );
      divFasobl_cell_Class = "col-xs-12 col-sm-1" ;
      cmbFasConPla.setJsonclick( "" );
      cmbFasConPla.setEnabled( 1 );
      cmbFasForMul.setJsonclick( "" );
      cmbFasForMul.setEnabled( 1 );
      cmbFasAcab.setJsonclick( "" );
      cmbFasAcab.setEnabled( 1 );
      cmbFasCon.setJsonclick( "" );
      cmbFasCon.setEnabled( 1 );
      cmbFasActTin.setJsonclick( "" );
      cmbFasActTin.setEnabled( 1 );
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = httpContext.getMessage( "Mas datos", "") ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasNumPas_Enabled = 1 ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasVelPro_Enabled = 1 ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPrePie_Enabled = 1 ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasPreSal_Enabled = 1 ;
      edtFasDec2_Jsonclick = "" ;
      edtFasDec2_Enabled = 1 ;
      edtFasDec_Jsonclick = "" ;
      edtFasDec_Enabled = 1 ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "Parametros  Calculo Tiempo Teorico", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      chkFasActiva.setEnabled( 1 );
      edtFasSigla_Jsonclick = "" ;
      edtFasSigla_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 1 ;
      edtMaqCod_Visible = 1 ;
      Combo_maqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Enabled = GXutil.toBoolean( -1) ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
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

   public void gxasa138081145( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      chkFasNorma.setVisible( ((GXt_int10==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasNorma.getInternalname(), "Visible", GXutil.ltrimstr( chkFasNorma.getVisible(), 5, 0), true);
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

   public void gxasa77441145( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      chkFasPreObl.setVisible( ((GXt_int10==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "Visible", GXutil.ltrimstr( chkFasPreObl.getVisible(), 5, 0), true);
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

   public void gxasa47911145( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      edtFasValMtr_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasValMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasValMtr_Visible), 5, 0), true);
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

   public void gxasa70571145( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      chkFasOpeIns.setVisible( ((GXt_int10==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasOpeIns.getInternalname(), "Visible", GXutil.ltrimstr( chkFasOpeIns.getVisible(), 5, 0), true);
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

   public void gxasa138091145( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      chkFasCarda.setVisible( ((GXt_int10==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasCarda.getInternalname(), "Visible", GXutil.ltrimstr( chkFasCarda.getVisible(), 5, 0), true);
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

   public void gxasa53681145( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "KGMTLC", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MTSLEC", ""), ""), GXv_int6) ;
      tfaspro_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbFasGral.setVisible( ((GXt_int10==1)||(GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasGral.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasGral.getVisible(), 5, 0), true);
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

   public void gxasa71051145( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "FASOPC", ""), ""), GXv_int11) ;
      tfaspro_impl.this.GXt_int10 = GXv_int11[0] ;
      cmbFasObl.setVisible( ((GXt_int10==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFasObl.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasObl.getVisible(), 5, 0), true);
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

   public void init_web_controls( )
   {
      chkFasActiva.setName( "FASACTIVA" );
      chkFasActiva.setWebtags( "" );
      chkFasActiva.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasActiva.getInternalname(), "TitleCaption", chkFasActiva.getCaption(), true);
      chkFasActiva.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A14042FasActiva)==0) )
      {
         A14042FasActiva = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14042FasActiva", A14042FasActiva);
      }
      cmbFasActTin.setName( "FASACTTIN" );
      cmbFasActTin.setWebtags( "" );
      cmbFasActTin.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasActTin.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasActTin.getItemCount() > 0 )
      {
         A456FasActTin = cmbFasActTin.getValidValue(A456FasActTin) ;
         n456FasActTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      }
      cmbFasCon.setName( "FASCON" );
      cmbFasCon.setWebtags( "" );
      cmbFasCon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasCon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasCon.getItemCount() > 0 )
      {
         A458FasCon = cmbFasCon.getValidValue(A458FasCon) ;
         n458FasCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      }
      cmbFasAcab.setName( "FASACAB" );
      cmbFasAcab.setWebtags( "" );
      cmbFasAcab.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasAcab.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasAcab.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A4903FasAcab)==0) )
         {
            A4903FasAcab = httpContext.getMessage( "N", "") ;
            n4903FasAcab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
         }
      }
      cmbFasForMul.setName( "FASFORMUL" );
      cmbFasForMul.setWebtags( "" );
      cmbFasForMul.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasForMul.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasForMul.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A4286FasForMul)==0) )
         {
            A4286FasForMul = httpContext.getMessage( "N", "") ;
            n4286FasForMul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
         }
      }
      cmbFasConPla.setName( "FASCONPLA" );
      cmbFasConPla.setWebtags( "" );
      cmbFasConPla.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasConPla.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasConPla.getItemCount() > 0 )
      {
         A4299FasConPla = cmbFasConPla.getValidValue(A4299FasConPla) ;
         n4299FasConPla = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
      }
      cmbFasObl.setName( "FASOBL" );
      cmbFasObl.setWebtags( "" );
      cmbFasObl.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasObl.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasObl.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A7105FasObl)==0) )
         {
            A7105FasObl = httpContext.getMessage( "N", "") ;
            n7105FasObl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7105FasObl", A7105FasObl);
         }
      }
      cmbFasTip.setName( "FASTIP" );
      cmbFasTip.setWebtags( "" );
      cmbFasTip.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasTip.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasTip.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A6011FasTip)==0) )
         {
            A6011FasTip = httpContext.getMessage( "N", "") ;
            n6011FasTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6011FasTip", A6011FasTip);
         }
      }
      cmbFasGral.setName( "FASGRAL" );
      cmbFasGral.setWebtags( "" );
      cmbFasGral.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasGral.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasGral.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A5368FasGral)==0) )
         {
            A5368FasGral = httpContext.getMessage( "N", "") ;
            n5368FasGral = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5368FasGral", A5368FasGral);
         }
      }
      cmbFasPesInt.setName( "FASPESINT" );
      cmbFasPesInt.setWebtags( "" );
      cmbFasPesInt.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasPesInt.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasPesInt.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A7059FasPesInt)==0) )
         {
            A7059FasPesInt = httpContext.getMessage( "N", "") ;
            n7059FasPesInt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7059FasPesInt", A7059FasPesInt);
         }
      }
      cmbFasPesExp.setName( "FASPESEXP" );
      cmbFasPesExp.setWebtags( "" );
      cmbFasPesExp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasPesExp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasPesExp.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A8888FasPesExp)==0) )
         {
            A8888FasPesExp = httpContext.getMessage( "N", "") ;
            n8888FasPesExp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8888FasPesExp", A8888FasPesExp);
         }
      }
      cmbFasH2OReh.setName( "FASH2OREH" );
      cmbFasH2OReh.setWebtags( "" );
      cmbFasH2OReh.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasH2OReh.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasH2OReh.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A7600FasH2OReh)==0) )
         {
            A7600FasH2OReh = httpContext.getMessage( "N", "") ;
            n7600FasH2OReh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7600FasH2OReh", A7600FasH2OReh);
         }
      }
      chkFasOpeIns.setName( "FASOPEINS" );
      chkFasOpeIns.setWebtags( "" );
      chkFasOpeIns.setCaption( httpContext.getMessage( "Imprimir Rgto Calidad?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasOpeIns.getInternalname(), "TitleCaption", chkFasOpeIns.getCaption(), true);
      chkFasOpeIns.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A7057FasOpeIns)==0) )
      {
         A7057FasOpeIns = httpContext.getMessage( "N", "") ;
         n7057FasOpeIns = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7057FasOpeIns", A7057FasOpeIns);
      }
      chkFasCarda.setName( "FASCARDA" );
      chkFasCarda.setWebtags( "" );
      chkFasCarda.setCaption( httpContext.getMessage( "Imprimir Registro Carda/E/L?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasCarda.getInternalname(), "TitleCaption", chkFasCarda.getCaption(), true);
      chkFasCarda.setCheckedValue( "N" );
      A13809FasCarda = ((GXutil.strcmp(GXutil.rtrim( A13809FasCarda), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13809FasCarda", A13809FasCarda);
      cmbFasEstamp.setName( "FASESTAMP" );
      cmbFasEstamp.setWebtags( "" );
      cmbFasEstamp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasEstamp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasEstamp.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A4343FasEstamp)==0) )
         {
            A4343FasEstamp = httpContext.getMessage( "N", "") ;
            n4343FasEstamp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4343FasEstamp", A4343FasEstamp);
         }
      }
      chkFasPreObl.setName( "FASPREOBL" );
      chkFasPreObl.setWebtags( "" );
      chkFasPreObl.setCaption( httpContext.getMessage( "Precio Obligatorio", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "TitleCaption", chkFasPreObl.getCaption(), true);
      chkFasPreObl.setCheckedValue( "0" );
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      chkFasNorma.setName( "FASNORMA" );
      chkFasNorma.setWebtags( "" );
      chkFasNorma.setCaption( httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasNorma.getInternalname(), "TitleCaption", chkFasNorma.getCaption(), true);
      chkFasNorma.setCheckedValue( "N" );
      A13808FasNorma = ((GXutil.strcmp(GXutil.rtrim( A13808FasNorma), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13808FasNorma", A13808FasNorma);
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

   public void valid_Maqcod( )
   {
      n602MaqCod = false ;
      n606MaqDsc = false ;
      /* Using cursor T001116 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A602MaqCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqCod_Internalname ;
         }
      }
      A606MaqDsc = T001116_A606MaqDsc[0] ;
      n606MaqDsc = T001116_n606MaqDsc[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
   }

   public void valid_Seccodf( )
   {
      n6162SecCodF = false ;
      n6163SecNomF = false ;
      /* Using cursor T001117 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6162SecCodF)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TSECCI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SECCODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSecCodF_Internalname ;
         }
      }
      A6163SecNomF = T001117_A6163SecNomF[0] ;
      n6163SecNomF = T001117_n6163SecNomF[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6163SecNomF", GXutil.rtrim( A6163SecNomF));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV73EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV81FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV76TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV73EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV81FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A4588FasCC',fld:'FASCC',pic:'@!'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''},{av:'A5232FasProCtb',fld:'FASPROCTB',pic:''},{av:'A5616FasTExt',fld:'FASTEXT',pic:'@!'},{av:'A6880FasFGp',fld:'FASFGP',pic:'ZZ9.99'},{av:'A7058FasGrupo',fld:'FASGRUPO',pic:'ZZZZZZ'},{av:'A471FasUltLin',fld:'FASULTLIN',pic:'Z9'},{av:'A14043FasSalida',fld:'FASSALIDA',pic:''},{av:'A14044FastoVtx',fld:'FASTOVTX',pic:''},{av:'A14045FasMtsAnc',fld:'FASMTSANC',pic:''},{av:'A14046FasInsAlb',fld:'FASINSALB',pic:''},{av:'A14047FasTubos',fld:'FASTUBOS',pic:''},{av:'A14048FasStki',fld:'FASSTKI',pic:''},{av:'A14049FasCops',fld:'FASCOPS',pic:''},{av:'A14050FasClsHdr',fld:'FASCLSHDR',pic:'9'},{av:'A14051FasStkT',fld:'FASSTKT',pic:''},{av:'A14052FasPrefj',fld:'FASPREFJ',pic:''},{av:'A14053FasFinHdr',fld:'FASFINHDR',pic:''},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e12112',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV76TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASDSC","{handler:'valid_Fasdsc',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASDSC",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASACTTIN","{handler:'valid_Fasacttin',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASACTTIN",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASCON","{handler:'valid_Fascon',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASCON",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASACAB","{handler:'valid_Fasacab',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASACAB",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASFORMUL","{handler:'valid_Fasformul',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASFORMUL",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASCONPLA","{handler:'valid_Fasconpla',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASCONPLA",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASOBL","{handler:'valid_Fasobl',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASOBL",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_SECCODF","{handler:'valid_Seccodf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6162SecCodF',fld:'SECCODF',pic:''},{av:'A6163SecNomF',fld:'SECNOMF',pic:''},{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_SECCODF",",oparms:[{av:'A6163SecNomF',fld:'SECNOMF',pic:''},{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASESTAMP","{handler:'valid_Fasestamp',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASESTAMP",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALID_FASPREOBL","{handler:'valid_Faspreobl',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALID_FASPREOBL",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALIDV_COMBOMAQCOD","{handler:'validv_Combomaqcod',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALIDV_COMBOMAQCOD",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
      setEventMetadata("VALIDV_COMBOSECCODF","{handler:'validv_Comboseccodf',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]");
      setEventMetadata("VALIDV_COMBOSECCODF",",oparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''}]}");
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
      pr_default.close(14);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV73EmprCod = "" ;
      wcpOAV81FasCod = "" ;
      Z396EmprCod = "" ;
      Z457FasCod = "" ;
      Z4588FasCC = "" ;
      Z460FasDsc = "" ;
      Z7070FasSigla = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z5990FasDec2 = DecimalUtil.ZERO ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z4903FasAcab = "" ;
      Z4286FasForMul = "" ;
      Z4299FasConPla = "" ;
      Z4343FasEstamp = "" ;
      Z4791FasValMtr = DecimalUtil.ZERO ;
      Z5232FasProCtb = "" ;
      Z5616FasTExt = "" ;
      Z6011FasTip = "" ;
      Z7105FasObl = "" ;
      Z5368FasGral = "" ;
      Z6880FasFGp = DecimalUtil.ZERO ;
      Z7059FasPesInt = "" ;
      Z8888FasPesExp = "" ;
      Z9838FasObsF = "" ;
      Z7600FasH2OReh = "" ;
      Z7057FasOpeIns = "" ;
      Z13808FasNorma = "" ;
      Z13809FasCarda = "" ;
      Z14042FasActiva = "" ;
      Z14043FasSalida = "" ;
      Z14044FastoVtx = "" ;
      Z14045FasMtsAnc = "" ;
      Z14046FasInsAlb = "" ;
      Z14047FasTubos = "" ;
      Z14048FasStki = "" ;
      Z14049FasCops = "" ;
      Z14051FasStkT = "" ;
      Z14052FasPrefj = "" ;
      Z14053FasFinHdr = "" ;
      Z14054FasDivTime = "" ;
      Z602MaqCod = "" ;
      Z6162SecCodF = "" ;
      O460FasDsc = "" ;
      N602MaqCod = "" ;
      N6162SecCodF = "" ;
      Combo_seccodf_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A6162SecCodF = "" ;
      Gx_mode = "" ;
      AV73EmprCod = "" ;
      AV81FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A14042FasActiva = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A7105FasObl = "" ;
      A6011FasTip = "" ;
      A5368FasGral = "" ;
      A7059FasPesInt = "" ;
      A8888FasPesExp = "" ;
      A7600FasH2OReh = "" ;
      A7057FasOpeIns = "" ;
      A13809FasCarda = "" ;
      A4343FasEstamp = "" ;
      A13808FasNorma = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      lblTextblockmaqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      Combo_maqcod_Caption = "" ;
      AV85MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A7070FasSigla = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      A459FasDec = DecimalUtil.ZERO ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panelotrosdatos = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      lblTextblockseccodf_Jsonclick = "" ;
      ucCombo_seccodf = new com.genexus.webpanels.GXUserControl();
      Combo_seccodf_Caption = "" ;
      AV82SecCodF_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A4791FasValMtr = DecimalUtil.ZERO ;
      A9838FasObsF = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV88Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV86ComboMaqCod = "" ;
      AV84ComboSecCodF = "" ;
      A4588FasCC = "" ;
      A5232FasProCtb = "" ;
      A5616FasTExt = "" ;
      A6880FasFGp = DecimalUtil.ZERO ;
      A14043FasSalida = "" ;
      A14044FastoVtx = "" ;
      A14045FasMtsAnc = "" ;
      A14046FasInsAlb = "" ;
      A14047FasTubos = "" ;
      A14048FasStki = "" ;
      A14049FasCops = "" ;
      A14051FasStkT = "" ;
      A14052FasPrefj = "" ;
      A14053FasFinHdr = "" ;
      A14054FasDivTime = "" ;
      A13781FasCDsc = "" ;
      AV78Insert_MaqCod = "" ;
      AV79Insert_SecCodF = "" ;
      A407EmprNom = "" ;
      A606MaqDsc = "" ;
      A6163SecNomF = "" ;
      Combo_maqcod_Objectcall = "" ;
      Combo_maqcod_Class = "" ;
      Combo_maqcod_Icontype = "" ;
      Combo_maqcod_Icon = "" ;
      Combo_maqcod_Tooltip = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_maqcod_Selectedtext_set = "" ;
      Combo_maqcod_Selectedtext_get = "" ;
      Combo_maqcod_Gamoauthtoken = "" ;
      Combo_maqcod_Ddointernalname = "" ;
      Combo_maqcod_Titlecontrolalign = "" ;
      Combo_maqcod_Dropdownoptionstype = "" ;
      Combo_maqcod_Titlecontrolidtoreplace = "" ;
      Combo_maqcod_Datalisttype = "" ;
      Combo_maqcod_Datalistfixedvalues = "" ;
      Combo_maqcod_Datalistproc = "" ;
      Combo_maqcod_Datalistprocparametersprefix = "" ;
      Combo_maqcod_Remoteservicesparameters = "" ;
      Combo_maqcod_Htmltemplate = "" ;
      Combo_maqcod_Multiplevaluestype = "" ;
      Combo_maqcod_Loadingdata = "" ;
      Combo_maqcod_Noresultsfound = "" ;
      Combo_maqcod_Emptyitemtext = "" ;
      Combo_maqcod_Onlyselectedvalues = "" ;
      Combo_maqcod_Selectalltext = "" ;
      Combo_maqcod_Multiplevaluesseparator = "" ;
      Combo_maqcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable9_Objectcall = "" ;
      Dvpanel_unnamedtable9_Class = "" ;
      Dvpanel_unnamedtable9_Height = "" ;
      Dvpanel_unnamedtable10_Objectcall = "" ;
      Dvpanel_unnamedtable10_Class = "" ;
      Dvpanel_unnamedtable10_Height = "" ;
      Combo_seccodf_Objectcall = "" ;
      Combo_seccodf_Class = "" ;
      Combo_seccodf_Icontype = "" ;
      Combo_seccodf_Icon = "" ;
      Combo_seccodf_Tooltip = "" ;
      Combo_seccodf_Selectedvalue_set = "" ;
      Combo_seccodf_Selectedtext_set = "" ;
      Combo_seccodf_Selectedtext_get = "" ;
      Combo_seccodf_Gamoauthtoken = "" ;
      Combo_seccodf_Ddointernalname = "" ;
      Combo_seccodf_Titlecontrolalign = "" ;
      Combo_seccodf_Dropdownoptionstype = "" ;
      Combo_seccodf_Titlecontrolidtoreplace = "" ;
      Combo_seccodf_Datalisttype = "" ;
      Combo_seccodf_Datalistfixedvalues = "" ;
      Combo_seccodf_Datalistproc = "" ;
      Combo_seccodf_Datalistprocparametersprefix = "" ;
      Combo_seccodf_Remoteservicesparameters = "" ;
      Combo_seccodf_Htmltemplate = "" ;
      Combo_seccodf_Multiplevaluestype = "" ;
      Combo_seccodf_Loadingdata = "" ;
      Combo_seccodf_Noresultsfound = "" ;
      Combo_seccodf_Onlyselectedvalues = "" ;
      Combo_seccodf_Selectalltext = "" ;
      Combo_seccodf_Multiplevaluesseparator = "" ;
      Combo_seccodf_Addnewoptiontext = "" ;
      Dvpanel_panelotrosdatos_Objectcall = "" ;
      Dvpanel_panelotrosdatos_Class = "" ;
      Dvpanel_panelotrosdatos_Height = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode45 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV33Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV75WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV76TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV77WebSession = httpContext.getWebSession();
      AV80TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV83ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z606MaqDsc = "" ;
      Z6163SecNomF = "" ;
      T00114_A407EmprNom = new String[] {""} ;
      T00114_n407EmprNom = new boolean[] {false} ;
      T00115_A606MaqDsc = new String[] {""} ;
      T00115_n606MaqDsc = new boolean[] {false} ;
      T00116_A6163SecNomF = new String[] {""} ;
      T00116_n6163SecNomF = new boolean[] {false} ;
      T00117_A457FasCod = new String[] {""} ;
      T00117_n457FasCod = new boolean[] {false} ;
      T00117_A4588FasCC = new String[] {""} ;
      T00117_n4588FasCC = new boolean[] {false} ;
      T00117_A407EmprNom = new String[] {""} ;
      T00117_n407EmprNom = new boolean[] {false} ;
      T00117_A460FasDsc = new String[] {""} ;
      T00117_A7070FasSigla = new String[] {""} ;
      T00117_n7070FasSigla = new boolean[] {false} ;
      T00117_A606MaqDsc = new String[] {""} ;
      T00117_n606MaqDsc = new boolean[] {false} ;
      T00117_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00117_n459FasDec = new boolean[] {false} ;
      T00117_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00117_n5990FasDec2 = new boolean[] {false} ;
      T00117_A469FasPreSal = new short[1] ;
      T00117_n469FasPreSal = new boolean[] {false} ;
      T00117_A468FasPrePie = new short[1] ;
      T00117_n468FasPrePie = new boolean[] {false} ;
      T00117_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00117_n472FasVelPro = new boolean[] {false} ;
      T00117_A464FasNumPas = new short[1] ;
      T00117_n464FasNumPas = new boolean[] {false} ;
      T00117_A456FasActTin = new String[] {""} ;
      T00117_n456FasActTin = new boolean[] {false} ;
      T00117_A458FasCon = new String[] {""} ;
      T00117_n458FasCon = new boolean[] {false} ;
      T00117_A4903FasAcab = new String[] {""} ;
      T00117_n4903FasAcab = new boolean[] {false} ;
      T00117_A4286FasForMul = new String[] {""} ;
      T00117_n4286FasForMul = new boolean[] {false} ;
      T00117_A4299FasConPla = new String[] {""} ;
      T00117_n4299FasConPla = new boolean[] {false} ;
      T00117_A4343FasEstamp = new String[] {""} ;
      T00117_n4343FasEstamp = new boolean[] {false} ;
      T00117_A5168FasPreMC = new short[1] ;
      T00117_n5168FasPreMC = new boolean[] {false} ;
      T00117_A4791FasValMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00117_n4791FasValMtr = new boolean[] {false} ;
      T00117_A5232FasProCtb = new String[] {""} ;
      T00117_n5232FasProCtb = new boolean[] {false} ;
      T00117_A5616FasTExt = new String[] {""} ;
      T00117_n5616FasTExt = new boolean[] {false} ;
      T00117_A6011FasTip = new String[] {""} ;
      T00117_n6011FasTip = new boolean[] {false} ;
      T00117_A7105FasObl = new String[] {""} ;
      T00117_n7105FasObl = new boolean[] {false} ;
      T00117_A7744FasPreObl = new byte[1] ;
      T00117_n7744FasPreObl = new boolean[] {false} ;
      T00117_A5368FasGral = new String[] {""} ;
      T00117_n5368FasGral = new boolean[] {false} ;
      T00117_A6880FasFGp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00117_n6880FasFGp = new boolean[] {false} ;
      T00117_A7059FasPesInt = new String[] {""} ;
      T00117_n7059FasPesInt = new boolean[] {false} ;
      T00117_A8888FasPesExp = new String[] {""} ;
      T00117_n8888FasPesExp = new boolean[] {false} ;
      T00117_A9838FasObsF = new String[] {""} ;
      T00117_n9838FasObsF = new boolean[] {false} ;
      T00117_A6163SecNomF = new String[] {""} ;
      T00117_n6163SecNomF = new boolean[] {false} ;
      T00117_A7600FasH2OReh = new String[] {""} ;
      T00117_n7600FasH2OReh = new boolean[] {false} ;
      T00117_A7057FasOpeIns = new String[] {""} ;
      T00117_n7057FasOpeIns = new boolean[] {false} ;
      T00117_A7058FasGrupo = new int[1] ;
      T00117_n7058FasGrupo = new boolean[] {false} ;
      T00117_A471FasUltLin = new byte[1] ;
      T00117_A13808FasNorma = new String[] {""} ;
      T00117_A13809FasCarda = new String[] {""} ;
      T00117_A14042FasActiva = new String[] {""} ;
      T00117_A14043FasSalida = new String[] {""} ;
      T00117_A14044FastoVtx = new String[] {""} ;
      T00117_A14045FasMtsAnc = new String[] {""} ;
      T00117_A14046FasInsAlb = new String[] {""} ;
      T00117_A14047FasTubos = new String[] {""} ;
      T00117_A14048FasStki = new String[] {""} ;
      T00117_A14049FasCops = new String[] {""} ;
      T00117_A14050FasClsHdr = new byte[1] ;
      T00117_A14051FasStkT = new String[] {""} ;
      T00117_A14052FasPrefj = new String[] {""} ;
      T00117_A14053FasFinHdr = new String[] {""} ;
      T00117_A14054FasDivTime = new String[] {""} ;
      T00117_A396EmprCod = new String[] {""} ;
      T00117_A602MaqCod = new String[] {""} ;
      T00117_n602MaqCod = new boolean[] {false} ;
      T00117_A6162SecCodF = new String[] {""} ;
      T00117_n6162SecCodF = new boolean[] {false} ;
      T00118_A606MaqDsc = new String[] {""} ;
      T00118_n606MaqDsc = new boolean[] {false} ;
      T00119_A6163SecNomF = new String[] {""} ;
      T00119_n6163SecNomF = new boolean[] {false} ;
      T001110_A396EmprCod = new String[] {""} ;
      T001110_A457FasCod = new String[] {""} ;
      T001110_n457FasCod = new boolean[] {false} ;
      T00113_A457FasCod = new String[] {""} ;
      T00113_n457FasCod = new boolean[] {false} ;
      T00113_A4588FasCC = new String[] {""} ;
      T00113_n4588FasCC = new boolean[] {false} ;
      T00113_A460FasDsc = new String[] {""} ;
      T00113_A7070FasSigla = new String[] {""} ;
      T00113_n7070FasSigla = new boolean[] {false} ;
      T00113_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00113_n459FasDec = new boolean[] {false} ;
      T00113_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00113_n5990FasDec2 = new boolean[] {false} ;
      T00113_A469FasPreSal = new short[1] ;
      T00113_n469FasPreSal = new boolean[] {false} ;
      T00113_A468FasPrePie = new short[1] ;
      T00113_n468FasPrePie = new boolean[] {false} ;
      T00113_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00113_n472FasVelPro = new boolean[] {false} ;
      T00113_A464FasNumPas = new short[1] ;
      T00113_n464FasNumPas = new boolean[] {false} ;
      T00113_A456FasActTin = new String[] {""} ;
      T00113_n456FasActTin = new boolean[] {false} ;
      T00113_A458FasCon = new String[] {""} ;
      T00113_n458FasCon = new boolean[] {false} ;
      T00113_A4903FasAcab = new String[] {""} ;
      T00113_n4903FasAcab = new boolean[] {false} ;
      T00113_A4286FasForMul = new String[] {""} ;
      T00113_n4286FasForMul = new boolean[] {false} ;
      T00113_A4299FasConPla = new String[] {""} ;
      T00113_n4299FasConPla = new boolean[] {false} ;
      T00113_A4343FasEstamp = new String[] {""} ;
      T00113_n4343FasEstamp = new boolean[] {false} ;
      T00113_A5168FasPreMC = new short[1] ;
      T00113_n5168FasPreMC = new boolean[] {false} ;
      T00113_A4791FasValMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00113_n4791FasValMtr = new boolean[] {false} ;
      T00113_A5232FasProCtb = new String[] {""} ;
      T00113_n5232FasProCtb = new boolean[] {false} ;
      T00113_A5616FasTExt = new String[] {""} ;
      T00113_n5616FasTExt = new boolean[] {false} ;
      T00113_A6011FasTip = new String[] {""} ;
      T00113_n6011FasTip = new boolean[] {false} ;
      T00113_A7105FasObl = new String[] {""} ;
      T00113_n7105FasObl = new boolean[] {false} ;
      T00113_A7744FasPreObl = new byte[1] ;
      T00113_n7744FasPreObl = new boolean[] {false} ;
      T00113_A5368FasGral = new String[] {""} ;
      T00113_n5368FasGral = new boolean[] {false} ;
      T00113_A6880FasFGp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00113_n6880FasFGp = new boolean[] {false} ;
      T00113_A7059FasPesInt = new String[] {""} ;
      T00113_n7059FasPesInt = new boolean[] {false} ;
      T00113_A8888FasPesExp = new String[] {""} ;
      T00113_n8888FasPesExp = new boolean[] {false} ;
      T00113_A9838FasObsF = new String[] {""} ;
      T00113_n9838FasObsF = new boolean[] {false} ;
      T00113_A7600FasH2OReh = new String[] {""} ;
      T00113_n7600FasH2OReh = new boolean[] {false} ;
      T00113_A7057FasOpeIns = new String[] {""} ;
      T00113_n7057FasOpeIns = new boolean[] {false} ;
      T00113_A7058FasGrupo = new int[1] ;
      T00113_n7058FasGrupo = new boolean[] {false} ;
      T00113_A471FasUltLin = new byte[1] ;
      T00113_A13808FasNorma = new String[] {""} ;
      T00113_A13809FasCarda = new String[] {""} ;
      T00113_A14042FasActiva = new String[] {""} ;
      T00113_A14043FasSalida = new String[] {""} ;
      T00113_A14044FastoVtx = new String[] {""} ;
      T00113_A14045FasMtsAnc = new String[] {""} ;
      T00113_A14046FasInsAlb = new String[] {""} ;
      T00113_A14047FasTubos = new String[] {""} ;
      T00113_A14048FasStki = new String[] {""} ;
      T00113_A14049FasCops = new String[] {""} ;
      T00113_A14050FasClsHdr = new byte[1] ;
      T00113_A14051FasStkT = new String[] {""} ;
      T00113_A14052FasPrefj = new String[] {""} ;
      T00113_A14053FasFinHdr = new String[] {""} ;
      T00113_A14054FasDivTime = new String[] {""} ;
      T00113_A396EmprCod = new String[] {""} ;
      T00113_A602MaqCod = new String[] {""} ;
      T00113_n602MaqCod = new boolean[] {false} ;
      T00113_A6162SecCodF = new String[] {""} ;
      T00113_n6162SecCodF = new boolean[] {false} ;
      T001111_A396EmprCod = new String[] {""} ;
      T001111_A457FasCod = new String[] {""} ;
      T001111_n457FasCod = new boolean[] {false} ;
      T001112_A396EmprCod = new String[] {""} ;
      T001112_A457FasCod = new String[] {""} ;
      T001112_n457FasCod = new boolean[] {false} ;
      T00112_A457FasCod = new String[] {""} ;
      T00112_n457FasCod = new boolean[] {false} ;
      T00112_A4588FasCC = new String[] {""} ;
      T00112_n4588FasCC = new boolean[] {false} ;
      T00112_A460FasDsc = new String[] {""} ;
      T00112_A7070FasSigla = new String[] {""} ;
      T00112_n7070FasSigla = new boolean[] {false} ;
      T00112_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00112_n459FasDec = new boolean[] {false} ;
      T00112_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00112_n5990FasDec2 = new boolean[] {false} ;
      T00112_A469FasPreSal = new short[1] ;
      T00112_n469FasPreSal = new boolean[] {false} ;
      T00112_A468FasPrePie = new short[1] ;
      T00112_n468FasPrePie = new boolean[] {false} ;
      T00112_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00112_n472FasVelPro = new boolean[] {false} ;
      T00112_A464FasNumPas = new short[1] ;
      T00112_n464FasNumPas = new boolean[] {false} ;
      T00112_A456FasActTin = new String[] {""} ;
      T00112_n456FasActTin = new boolean[] {false} ;
      T00112_A458FasCon = new String[] {""} ;
      T00112_n458FasCon = new boolean[] {false} ;
      T00112_A4903FasAcab = new String[] {""} ;
      T00112_n4903FasAcab = new boolean[] {false} ;
      T00112_A4286FasForMul = new String[] {""} ;
      T00112_n4286FasForMul = new boolean[] {false} ;
      T00112_A4299FasConPla = new String[] {""} ;
      T00112_n4299FasConPla = new boolean[] {false} ;
      T00112_A4343FasEstamp = new String[] {""} ;
      T00112_n4343FasEstamp = new boolean[] {false} ;
      T00112_A5168FasPreMC = new short[1] ;
      T00112_n5168FasPreMC = new boolean[] {false} ;
      T00112_A4791FasValMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00112_n4791FasValMtr = new boolean[] {false} ;
      T00112_A5232FasProCtb = new String[] {""} ;
      T00112_n5232FasProCtb = new boolean[] {false} ;
      T00112_A5616FasTExt = new String[] {""} ;
      T00112_n5616FasTExt = new boolean[] {false} ;
      T00112_A6011FasTip = new String[] {""} ;
      T00112_n6011FasTip = new boolean[] {false} ;
      T00112_A7105FasObl = new String[] {""} ;
      T00112_n7105FasObl = new boolean[] {false} ;
      T00112_A7744FasPreObl = new byte[1] ;
      T00112_n7744FasPreObl = new boolean[] {false} ;
      T00112_A5368FasGral = new String[] {""} ;
      T00112_n5368FasGral = new boolean[] {false} ;
      T00112_A6880FasFGp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00112_n6880FasFGp = new boolean[] {false} ;
      T00112_A7059FasPesInt = new String[] {""} ;
      T00112_n7059FasPesInt = new boolean[] {false} ;
      T00112_A8888FasPesExp = new String[] {""} ;
      T00112_n8888FasPesExp = new boolean[] {false} ;
      T00112_A9838FasObsF = new String[] {""} ;
      T00112_n9838FasObsF = new boolean[] {false} ;
      T00112_A7600FasH2OReh = new String[] {""} ;
      T00112_n7600FasH2OReh = new boolean[] {false} ;
      T00112_A7057FasOpeIns = new String[] {""} ;
      T00112_n7057FasOpeIns = new boolean[] {false} ;
      T00112_A7058FasGrupo = new int[1] ;
      T00112_n7058FasGrupo = new boolean[] {false} ;
      T00112_A471FasUltLin = new byte[1] ;
      T00112_A13808FasNorma = new String[] {""} ;
      T00112_A13809FasCarda = new String[] {""} ;
      T00112_A14042FasActiva = new String[] {""} ;
      T00112_A14043FasSalida = new String[] {""} ;
      T00112_A14044FastoVtx = new String[] {""} ;
      T00112_A14045FasMtsAnc = new String[] {""} ;
      T00112_A14046FasInsAlb = new String[] {""} ;
      T00112_A14047FasTubos = new String[] {""} ;
      T00112_A14048FasStki = new String[] {""} ;
      T00112_A14049FasCops = new String[] {""} ;
      T00112_A14050FasClsHdr = new byte[1] ;
      T00112_A14051FasStkT = new String[] {""} ;
      T00112_A14052FasPrefj = new String[] {""} ;
      T00112_A14053FasFinHdr = new String[] {""} ;
      T00112_A14054FasDivTime = new String[] {""} ;
      T00112_A396EmprCod = new String[] {""} ;
      T00112_A602MaqCod = new String[] {""} ;
      T00112_n602MaqCod = new boolean[] {false} ;
      T00112_A6162SecCodF = new String[] {""} ;
      T00112_n6162SecCodF = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      T001116_A606MaqDsc = new String[] {""} ;
      T001116_n606MaqDsc = new boolean[] {false} ;
      T001117_A6163SecNomF = new String[] {""} ;
      T001117_n6163SecNomF = new boolean[] {false} ;
      T001118_A396EmprCod = new String[] {""} ;
      T001118_A129BarCod = new int[1] ;
      T001118_A132BarCodReo = new byte[1] ;
      T001118_A130BarCodPar = new String[] {""} ;
      T001118_A14152MEnvOrd = new short[1] ;
      T001119_A396EmprCod = new String[] {""} ;
      T001119_A13026PedDGId = new int[1] ;
      T001119_A758ProCod = new String[] {""} ;
      T001119_A13045PedDGFasLi = new short[1] ;
      T001120_A396EmprCod = new String[] {""} ;
      T001120_A6882Tas_num = new int[1] ;
      T001120_A6922Tas_lin = new short[1] ;
      T001121_A396EmprCod = new String[] {""} ;
      T001121_A11604PArtId = new int[1] ;
      T001121_A11611PAFOrd = new short[1] ;
      T001122_A396EmprCod = new String[] {""} ;
      T001122_A11278Regc_c1 = new String[] {""} ;
      T001122_A457FasCod = new String[] {""} ;
      T001122_n457FasCod = new boolean[] {false} ;
      T001123_A396EmprCod = new String[] {""} ;
      T001123_A1131AviNumero = new long[1] ;
      T001123_A457FasCod = new String[] {""} ;
      T001123_n457FasCod = new boolean[] {false} ;
      T001124_A396EmprCod = new String[] {""} ;
      T001124_A457FasCod = new String[] {""} ;
      T001124_n457FasCod = new boolean[] {false} ;
      T001124_A9832MaqCodF = new String[] {""} ;
      T001125_A396EmprCod = new String[] {""} ;
      T001125_A457FasCod = new String[] {""} ;
      T001125_n457FasCod = new boolean[] {false} ;
      T001125_A9723Cod_par = new short[1] ;
      T001126_A396EmprCod = new String[] {""} ;
      T001126_A457FasCod = new String[] {""} ;
      T001126_n457FasCod = new boolean[] {false} ;
      T001126_A8096FasArtTip = new short[1] ;
      T001126_A7730FasArtInt = new byte[1] ;
      T001126_A7731FasArtSeg = new String[] {""} ;
      T001127_A396EmprCod = new String[] {""} ;
      T001127_A6633NumOrd = new short[1] ;
      T001127_A457FasCod = new String[] {""} ;
      T001127_n457FasCod = new boolean[] {false} ;
      T001128_A396EmprCod = new String[] {""} ;
      T001128_A2253SalExtAlb = new int[1] ;
      T001128_A6248SalExNln = new short[1] ;
      T001129_A396EmprCod = new String[] {""} ;
      T001129_A457FasCod = new String[] {""} ;
      T001129_n457FasCod = new boolean[] {false} ;
      T001129_A5703Hh_FLin = new short[1] ;
      T001130_A396EmprCod = new String[] {""} ;
      T001130_A4744RecPreCod = new int[1] ;
      T001131_A396EmprCod = new String[] {""} ;
      T001131_A457FasCod = new String[] {""} ;
      T001131_n457FasCod = new boolean[] {false} ;
      T001131_A4650FasForLin = new short[1] ;
      T001132_A396EmprCod = new String[] {""} ;
      T001132_A457FasCod = new String[] {""} ;
      T001132_n457FasCod = new boolean[] {false} ;
      T001132_A4031CCTCod = new int[1] ;
      T001133_A396EmprCod = new String[] {""} ;
      T001133_A457FasCod = new String[] {""} ;
      T001133_n457FasCod = new boolean[] {false} ;
      T001133_A3635FasTerCod = new byte[1] ;
      T001134_A396EmprCod = new String[] {""} ;
      T001134_A2406ExhAlbCod = new int[1] ;
      T001134_A129BarCod = new int[1] ;
      T001134_A132BarCodReo = new byte[1] ;
      T001134_A130BarCodPar = new String[] {""} ;
      T001135_A396EmprCod = new String[] {""} ;
      T001135_A2253SalExtAlb = new int[1] ;
      T001135_A129BarCod = new int[1] ;
      T001135_A132BarCodReo = new byte[1] ;
      T001135_A130BarCodPar = new String[] {""} ;
      T001136_A396EmprCod = new String[] {""} ;
      T001136_A30AlbProCod = new long[1] ;
      T001136_A129BarCod = new int[1] ;
      T001136_A132BarCodReo = new byte[1] ;
      T001136_A130BarCodPar = new String[] {""} ;
      T001136_A1240GuiFasLin = new short[1] ;
      T001137_A396EmprCod = new String[] {""} ;
      T001137_A758ProCod = new String[] {""} ;
      T001137_A774ProNumLin = new short[1] ;
      T001138_A396EmprCod = new String[] {""} ;
      T001138_A252CliCod = new int[1] ;
      T001138_A457FasCod = new String[] {""} ;
      T001138_n457FasCod = new boolean[] {false} ;
      T001139_A396EmprCod = new String[] {""} ;
      T001139_A457FasCod = new String[] {""} ;
      T001139_n457FasCod = new boolean[] {false} ;
      T001139_A463FasNumLin = new byte[1] ;
      T001140_A396EmprCod = new String[] {""} ;
      T001140_A361DisCod = new int[1] ;
      T001140_A758ProCod = new String[] {""} ;
      T001140_A368DisFasLin = new short[1] ;
      T001141_A396EmprCod = new String[] {""} ;
      T001141_A129BarCod = new int[1] ;
      T001141_A132BarCodReo = new byte[1] ;
      T001141_A130BarCodPar = new String[] {""} ;
      T001141_A758ProCod = new String[] {""} ;
      T001141_A194BarOrdLin = new short[1] ;
      T001142_A396EmprCod = new String[] {""} ;
      T001142_A457FasCod = new String[] {""} ;
      T001142_n457FasCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i4588FasCC = "" ;
      i472FasVelPro = DecimalUtil.ZERO ;
      i4343FasEstamp = "" ;
      i4286FasForMul = "" ;
      i4903FasAcab = "" ;
      i5616FasTExt = "" ;
      i6011FasTip = "" ;
      i7600FasH2OReh = "" ;
      i7105FasObl = "" ;
      i5368FasGral = "" ;
      i7059FasPesInt = "" ;
      i8888FasPesExp = "" ;
      i7057FasOpeIns = "" ;
      i14042FasActiva = "" ;
      GXv_int6 = new byte[1] ;
      GXv_int11 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfaspro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfaspro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfaspro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfaspro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfaspro__default(),
         new Object[] {
             new Object[] {
            T00112_A457FasCod, T00112_A4588FasCC, T00112_n4588FasCC, T00112_A460FasDsc, T00112_A7070FasSigla, T00112_n7070FasSigla, T00112_A459FasDec, T00112_n459FasDec, T00112_A5990FasDec2, T00112_n5990FasDec2,
            T00112_A469FasPreSal, T00112_n469FasPreSal, T00112_A468FasPrePie, T00112_n468FasPrePie, T00112_A472FasVelPro, T00112_n472FasVelPro, T00112_A464FasNumPas, T00112_n464FasNumPas, T00112_A456FasActTin, T00112_n456FasActTin,
            T00112_A458FasCon, T00112_n458FasCon, T00112_A4903FasAcab, T00112_n4903FasAcab, T00112_A4286FasForMul, T00112_n4286FasForMul, T00112_A4299FasConPla, T00112_n4299FasConPla, T00112_A4343FasEstamp, T00112_n4343FasEstamp,
            T00112_A5168FasPreMC, T00112_n5168FasPreMC, T00112_A4791FasValMtr, T00112_n4791FasValMtr, T00112_A5232FasProCtb, T00112_n5232FasProCtb, T00112_A5616FasTExt, T00112_n5616FasTExt, T00112_A6011FasTip, T00112_n6011FasTip,
            T00112_A7105FasObl, T00112_n7105FasObl, T00112_A7744FasPreObl, T00112_n7744FasPreObl, T00112_A5368FasGral, T00112_n5368FasGral, T00112_A6880FasFGp, T00112_n6880FasFGp, T00112_A7059FasPesInt, T00112_n7059FasPesInt,
            T00112_A8888FasPesExp, T00112_n8888FasPesExp, T00112_A9838FasObsF, T00112_n9838FasObsF, T00112_A7600FasH2OReh, T00112_n7600FasH2OReh, T00112_A7057FasOpeIns, T00112_n7057FasOpeIns, T00112_A7058FasGrupo, T00112_n7058FasGrupo,
            T00112_A471FasUltLin, T00112_A13808FasNorma, T00112_A13809FasCarda, T00112_A14042FasActiva, T00112_A14043FasSalida, T00112_A14044FastoVtx, T00112_A14045FasMtsAnc, T00112_A14046FasInsAlb, T00112_A14047FasTubos, T00112_A14048FasStki,
            T00112_A14049FasCops, T00112_A14050FasClsHdr, T00112_A14051FasStkT, T00112_A14052FasPrefj, T00112_A14053FasFinHdr, T00112_A14054FasDivTime, T00112_A396EmprCod, T00112_A602MaqCod, T00112_n602MaqCod, T00112_A6162SecCodF,
            T00112_n6162SecCodF
            }
            , new Object[] {
            T00113_A457FasCod, T00113_A4588FasCC, T00113_n4588FasCC, T00113_A460FasDsc, T00113_A7070FasSigla, T00113_n7070FasSigla, T00113_A459FasDec, T00113_n459FasDec, T00113_A5990FasDec2, T00113_n5990FasDec2,
            T00113_A469FasPreSal, T00113_n469FasPreSal, T00113_A468FasPrePie, T00113_n468FasPrePie, T00113_A472FasVelPro, T00113_n472FasVelPro, T00113_A464FasNumPas, T00113_n464FasNumPas, T00113_A456FasActTin, T00113_n456FasActTin,
            T00113_A458FasCon, T00113_n458FasCon, T00113_A4903FasAcab, T00113_n4903FasAcab, T00113_A4286FasForMul, T00113_n4286FasForMul, T00113_A4299FasConPla, T00113_n4299FasConPla, T00113_A4343FasEstamp, T00113_n4343FasEstamp,
            T00113_A5168FasPreMC, T00113_n5168FasPreMC, T00113_A4791FasValMtr, T00113_n4791FasValMtr, T00113_A5232FasProCtb, T00113_n5232FasProCtb, T00113_A5616FasTExt, T00113_n5616FasTExt, T00113_A6011FasTip, T00113_n6011FasTip,
            T00113_A7105FasObl, T00113_n7105FasObl, T00113_A7744FasPreObl, T00113_n7744FasPreObl, T00113_A5368FasGral, T00113_n5368FasGral, T00113_A6880FasFGp, T00113_n6880FasFGp, T00113_A7059FasPesInt, T00113_n7059FasPesInt,
            T00113_A8888FasPesExp, T00113_n8888FasPesExp, T00113_A9838FasObsF, T00113_n9838FasObsF, T00113_A7600FasH2OReh, T00113_n7600FasH2OReh, T00113_A7057FasOpeIns, T00113_n7057FasOpeIns, T00113_A7058FasGrupo, T00113_n7058FasGrupo,
            T00113_A471FasUltLin, T00113_A13808FasNorma, T00113_A13809FasCarda, T00113_A14042FasActiva, T00113_A14043FasSalida, T00113_A14044FastoVtx, T00113_A14045FasMtsAnc, T00113_A14046FasInsAlb, T00113_A14047FasTubos, T00113_A14048FasStki,
            T00113_A14049FasCops, T00113_A14050FasClsHdr, T00113_A14051FasStkT, T00113_A14052FasPrefj, T00113_A14053FasFinHdr, T00113_A14054FasDivTime, T00113_A396EmprCod, T00113_A602MaqCod, T00113_n602MaqCod, T00113_A6162SecCodF,
            T00113_n6162SecCodF
            }
            , new Object[] {
            T00114_A407EmprNom, T00114_n407EmprNom
            }
            , new Object[] {
            T00115_A606MaqDsc, T00115_n606MaqDsc
            }
            , new Object[] {
            T00116_A6163SecNomF, T00116_n6163SecNomF
            }
            , new Object[] {
            T00117_A457FasCod, T00117_A4588FasCC, T00117_n4588FasCC, T00117_A407EmprNom, T00117_n407EmprNom, T00117_A460FasDsc, T00117_A7070FasSigla, T00117_n7070FasSigla, T00117_A606MaqDsc, T00117_n606MaqDsc,
            T00117_A459FasDec, T00117_n459FasDec, T00117_A5990FasDec2, T00117_n5990FasDec2, T00117_A469FasPreSal, T00117_n469FasPreSal, T00117_A468FasPrePie, T00117_n468FasPrePie, T00117_A472FasVelPro, T00117_n472FasVelPro,
            T00117_A464FasNumPas, T00117_n464FasNumPas, T00117_A456FasActTin, T00117_n456FasActTin, T00117_A458FasCon, T00117_n458FasCon, T00117_A4903FasAcab, T00117_n4903FasAcab, T00117_A4286FasForMul, T00117_n4286FasForMul,
            T00117_A4299FasConPla, T00117_n4299FasConPla, T00117_A4343FasEstamp, T00117_n4343FasEstamp, T00117_A5168FasPreMC, T00117_n5168FasPreMC, T00117_A4791FasValMtr, T00117_n4791FasValMtr, T00117_A5232FasProCtb, T00117_n5232FasProCtb,
            T00117_A5616FasTExt, T00117_n5616FasTExt, T00117_A6011FasTip, T00117_n6011FasTip, T00117_A7105FasObl, T00117_n7105FasObl, T00117_A7744FasPreObl, T00117_n7744FasPreObl, T00117_A5368FasGral, T00117_n5368FasGral,
            T00117_A6880FasFGp, T00117_n6880FasFGp, T00117_A7059FasPesInt, T00117_n7059FasPesInt, T00117_A8888FasPesExp, T00117_n8888FasPesExp, T00117_A9838FasObsF, T00117_n9838FasObsF, T00117_A6163SecNomF, T00117_n6163SecNomF,
            T00117_A7600FasH2OReh, T00117_n7600FasH2OReh, T00117_A7057FasOpeIns, T00117_n7057FasOpeIns, T00117_A7058FasGrupo, T00117_n7058FasGrupo, T00117_A471FasUltLin, T00117_A13808FasNorma, T00117_A13809FasCarda, T00117_A14042FasActiva,
            T00117_A14043FasSalida, T00117_A14044FastoVtx, T00117_A14045FasMtsAnc, T00117_A14046FasInsAlb, T00117_A14047FasTubos, T00117_A14048FasStki, T00117_A14049FasCops, T00117_A14050FasClsHdr, T00117_A14051FasStkT, T00117_A14052FasPrefj,
            T00117_A14053FasFinHdr, T00117_A14054FasDivTime, T00117_A396EmprCod, T00117_A602MaqCod, T00117_n602MaqCod, T00117_A6162SecCodF, T00117_n6162SecCodF
            }
            , new Object[] {
            T00118_A606MaqDsc, T00118_n606MaqDsc
            }
            , new Object[] {
            T00119_A6163SecNomF, T00119_n6163SecNomF
            }
            , new Object[] {
            T001110_A396EmprCod, T001110_A457FasCod
            }
            , new Object[] {
            T001111_A396EmprCod, T001111_A457FasCod
            }
            , new Object[] {
            T001112_A396EmprCod, T001112_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001116_A606MaqDsc, T001116_n606MaqDsc
            }
            , new Object[] {
            T001117_A6163SecNomF, T001117_n6163SecNomF
            }
            , new Object[] {
            T001118_A396EmprCod, T001118_A129BarCod, T001118_A132BarCodReo, T001118_A130BarCodPar, T001118_A14152MEnvOrd
            }
            , new Object[] {
            T001119_A396EmprCod, T001119_A13026PedDGId, T001119_A758ProCod, T001119_A13045PedDGFasLi
            }
            , new Object[] {
            T001120_A396EmprCod, T001120_A6882Tas_num, T001120_A6922Tas_lin
            }
            , new Object[] {
            T001121_A396EmprCod, T001121_A11604PArtId, T001121_A11611PAFOrd
            }
            , new Object[] {
            T001122_A396EmprCod, T001122_A11278Regc_c1, T001122_A457FasCod
            }
            , new Object[] {
            T001123_A396EmprCod, T001123_A1131AviNumero, T001123_A457FasCod
            }
            , new Object[] {
            T001124_A396EmprCod, T001124_A457FasCod, T001124_A9832MaqCodF
            }
            , new Object[] {
            T001125_A396EmprCod, T001125_A457FasCod, T001125_A9723Cod_par
            }
            , new Object[] {
            T001126_A396EmprCod, T001126_A457FasCod, T001126_A8096FasArtTip, T001126_A7730FasArtInt, T001126_A7731FasArtSeg
            }
            , new Object[] {
            T001127_A396EmprCod, T001127_A6633NumOrd, T001127_A457FasCod
            }
            , new Object[] {
            T001128_A396EmprCod, T001128_A2253SalExtAlb, T001128_A6248SalExNln
            }
            , new Object[] {
            T001129_A396EmprCod, T001129_A457FasCod, T001129_A5703Hh_FLin
            }
            , new Object[] {
            T001130_A396EmprCod, T001130_A4744RecPreCod
            }
            , new Object[] {
            T001131_A396EmprCod, T001131_A457FasCod, T001131_A4650FasForLin
            }
            , new Object[] {
            T001132_A396EmprCod, T001132_A457FasCod, T001132_A4031CCTCod
            }
            , new Object[] {
            T001133_A396EmprCod, T001133_A457FasCod, T001133_A3635FasTerCod
            }
            , new Object[] {
            T001134_A396EmprCod, T001134_A2406ExhAlbCod, T001134_A129BarCod, T001134_A132BarCodReo, T001134_A130BarCodPar
            }
            , new Object[] {
            T001135_A396EmprCod, T001135_A2253SalExtAlb, T001135_A129BarCod, T001135_A132BarCodReo, T001135_A130BarCodPar
            }
            , new Object[] {
            T001136_A396EmprCod, T001136_A30AlbProCod, T001136_A129BarCod, T001136_A132BarCodReo, T001136_A130BarCodPar, T001136_A1240GuiFasLin
            }
            , new Object[] {
            T001137_A396EmprCod, T001137_A758ProCod, T001137_A774ProNumLin
            }
            , new Object[] {
            T001138_A396EmprCod, T001138_A252CliCod, T001138_A457FasCod
            }
            , new Object[] {
            T001139_A396EmprCod, T001139_A457FasCod, T001139_A463FasNumLin
            }
            , new Object[] {
            T001140_A396EmprCod, T001140_A361DisCod, T001140_A758ProCod, T001140_A368DisFasLin
            }
            , new Object[] {
            T001141_A396EmprCod, T001141_A129BarCod, T001141_A132BarCodReo, T001141_A130BarCodPar, T001141_A758ProCod, T001141_A194BarOrdLin
            }
            , new Object[] {
            T001142_A396EmprCod, T001142_A457FasCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV88Pgmname = "TFASPRO" ;
      Z14042FasActiva = httpContext.getMessage( "S", "") ;
      A14042FasActiva = httpContext.getMessage( "S", "") ;
      i14042FasActiva = httpContext.getMessage( "S", "") ;
      Z7057FasOpeIns = httpContext.getMessage( "N", "") ;
      n7057FasOpeIns = false ;
      A7057FasOpeIns = httpContext.getMessage( "N", "") ;
      n7057FasOpeIns = false ;
      i7057FasOpeIns = httpContext.getMessage( "N", "") ;
      n7057FasOpeIns = false ;
      Z8888FasPesExp = httpContext.getMessage( "N", "") ;
      n8888FasPesExp = false ;
      A8888FasPesExp = httpContext.getMessage( "N", "") ;
      n8888FasPesExp = false ;
      i8888FasPesExp = httpContext.getMessage( "N", "") ;
      n8888FasPesExp = false ;
      Z7059FasPesInt = httpContext.getMessage( "N", "") ;
      n7059FasPesInt = false ;
      A7059FasPesInt = httpContext.getMessage( "N", "") ;
      n7059FasPesInt = false ;
      i7059FasPesInt = httpContext.getMessage( "N", "") ;
      n7059FasPesInt = false ;
      Z5368FasGral = httpContext.getMessage( "N", "") ;
      n5368FasGral = false ;
      A5368FasGral = httpContext.getMessage( "N", "") ;
      n5368FasGral = false ;
      i5368FasGral = httpContext.getMessage( "N", "") ;
      n5368FasGral = false ;
      Z7105FasObl = httpContext.getMessage( "N", "") ;
      n7105FasObl = false ;
      A7105FasObl = httpContext.getMessage( "N", "") ;
      n7105FasObl = false ;
      i7105FasObl = httpContext.getMessage( "N", "") ;
      n7105FasObl = false ;
      Z4588FasCC = httpContext.getMessage( "N", "") ;
      n4588FasCC = false ;
      A4588FasCC = httpContext.getMessage( "N", "") ;
      n4588FasCC = false ;
      i4588FasCC = httpContext.getMessage( "N", "") ;
      n4588FasCC = false ;
      Z7600FasH2OReh = httpContext.getMessage( "N", "") ;
      n7600FasH2OReh = false ;
      A7600FasH2OReh = httpContext.getMessage( "N", "") ;
      n7600FasH2OReh = false ;
      i7600FasH2OReh = httpContext.getMessage( "N", "") ;
      n7600FasH2OReh = false ;
      Z6011FasTip = httpContext.getMessage( "N", "") ;
      n6011FasTip = false ;
      A6011FasTip = httpContext.getMessage( "N", "") ;
      n6011FasTip = false ;
      i6011FasTip = httpContext.getMessage( "N", "") ;
      n6011FasTip = false ;
      Z5616FasTExt = " " ;
      n5616FasTExt = false ;
      A5616FasTExt = " " ;
      n5616FasTExt = false ;
      i5616FasTExt = " " ;
      n5616FasTExt = false ;
      Z4903FasAcab = httpContext.getMessage( "N", "") ;
      n4903FasAcab = false ;
      A4903FasAcab = httpContext.getMessage( "N", "") ;
      n4903FasAcab = false ;
      i4903FasAcab = httpContext.getMessage( "N", "") ;
      n4903FasAcab = false ;
      Z4286FasForMul = httpContext.getMessage( "N", "") ;
      n4286FasForMul = false ;
      A4286FasForMul = httpContext.getMessage( "N", "") ;
      n4286FasForMul = false ;
      i4286FasForMul = httpContext.getMessage( "N", "") ;
      n4286FasForMul = false ;
      Z4343FasEstamp = httpContext.getMessage( "N", "") ;
      n4343FasEstamp = false ;
      A4343FasEstamp = httpContext.getMessage( "N", "") ;
      n4343FasEstamp = false ;
      i4343FasEstamp = httpContext.getMessage( "N", "") ;
      n4343FasEstamp = false ;
      Z464FasNumPas = (short)(1) ;
      n464FasNumPas = false ;
      A464FasNumPas = (short)(1) ;
      n464FasNumPas = false ;
      i464FasNumPas = (short)(1) ;
      n464FasNumPas = false ;
      Z472FasVelPro = DecimalUtil.doubleToDec(1) ;
      n472FasVelPro = false ;
      A472FasVelPro = DecimalUtil.doubleToDec(1) ;
      n472FasVelPro = false ;
      i472FasVelPro = DecimalUtil.doubleToDec(1) ;
      n472FasVelPro = false ;
   }

   private byte Z7744FasPreObl ;
   private byte Z471FasUltLin ;
   private byte Z14050FasClsHdr ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A7744FasPreObl ;
   private byte A471FasUltLin ;
   private byte A14050FasClsHdr ;
   private byte Gx_BScreen ;
   private byte AV64Parfss ;
   private byte AV52Faspq ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private short Z469FasPreSal ;
   private short Z468FasPrePie ;
   private short Z464FasNumPas ;
   private short Z5168FasPreMC ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short A5168FasPreMC ;
   private short RcdFound45 ;
   private short nIsDirty_45 ;
   private short i464FasNumPas ;
   private int Z7058FasGrupo ;
   private int trnEnded ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMaqCod_Visible ;
   private int edtMaqCod_Enabled ;
   private int edtFasSigla_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtFasDec2_Enabled ;
   private int edtFasPreSal_Enabled ;
   private int edtFasPrePie_Enabled ;
   private int edtFasVelPro_Enabled ;
   private int edtFasNumPas_Enabled ;
   private int divUnnamedtable5_Visible ;
   private int divUnnamedtable6_Visible ;
   private int edtSecCodF_Visible ;
   private int edtSecCodF_Enabled ;
   private int divUnnamedtable7_Visible ;
   private int edtFasValMtr_Visible ;
   private int edtFasValMtr_Enabled ;
   private int edtFasObsF_Enabled ;
   private int edtFasPreMC_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombomaqcod_Visible ;
   private int edtavCombomaqcod_Enabled ;
   private int edtavComboseccodf_Visible ;
   private int edtavComboseccodf_Enabled ;
   private int A7058FasGrupo ;
   private int Combo_maqcod_Datalistupdateminimumcharacters ;
   private int Combo_seccodf_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV89GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z459FasDec ;
   private java.math.BigDecimal Z5990FasDec2 ;
   private java.math.BigDecimal Z472FasVelPro ;
   private java.math.BigDecimal Z4791FasValMtr ;
   private java.math.BigDecimal Z6880FasFGp ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A4791FasValMtr ;
   private java.math.BigDecimal A6880FasFGp ;
   private java.math.BigDecimal i472FasVelPro ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV73EmprCod ;
   private String wcpOAV81FasCod ;
   private String Z396EmprCod ;
   private String Z457FasCod ;
   private String Z4588FasCC ;
   private String Z460FasDsc ;
   private String Z7070FasSigla ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z4903FasAcab ;
   private String Z4286FasForMul ;
   private String Z4299FasConPla ;
   private String Z4343FasEstamp ;
   private String Z5232FasProCtb ;
   private String Z5616FasTExt ;
   private String Z6011FasTip ;
   private String Z7105FasObl ;
   private String Z5368FasGral ;
   private String Z7059FasPesInt ;
   private String Z8888FasPesExp ;
   private String Z7600FasH2OReh ;
   private String Z7057FasOpeIns ;
   private String Z13808FasNorma ;
   private String Z13809FasCarda ;
   private String Z14042FasActiva ;
   private String Z14043FasSalida ;
   private String Z14044FastoVtx ;
   private String Z14045FasMtsAnc ;
   private String Z14046FasInsAlb ;
   private String Z14047FasTubos ;
   private String Z14048FasStki ;
   private String Z14049FasCops ;
   private String Z14051FasStkT ;
   private String Z14052FasPrefj ;
   private String Z14053FasFinHdr ;
   private String Z14054FasDivTime ;
   private String Z602MaqCod ;
   private String Z6162SecCodF ;
   private String O460FasDsc ;
   private String N602MaqCod ;
   private String N6162SecCodF ;
   private String Combo_seccodf_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A6162SecCodF ;
   private String Gx_mode ;
   private String AV73EmprCod ;
   private String AV81FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasCod_Internalname ;
   private String A14042FasActiva ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String A7105FasObl ;
   private String A6011FasTip ;
   private String A5368FasGral ;
   private String A7059FasPesInt ;
   private String A8888FasPesExp ;
   private String A7600FasH2OReh ;
   private String A7057FasOpeIns ;
   private String A13809FasCarda ;
   private String A4343FasEstamp ;
   private String A13808FasNorma ;
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
   private String divUnnamedtable12_Internalname ;
   private String TempTags ;
   private String A457FasCod ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockmaqcod_Internalname ;
   private String lblTextblockmaqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Internalname ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasSigla_Internalname ;
   private String A7070FasSigla ;
   private String edtFasSigla_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtFasDec_Jsonclick ;
   private String edtFasDec2_Internalname ;
   private String edtFasDec2_Jsonclick ;
   private String edtFasPreSal_Internalname ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Internalname ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Internalname ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Internalname ;
   private String edtFasNumPas_Jsonclick ;
   private String Dvpanel_unnamedtable10_Width ;
   private String Dvpanel_unnamedtable10_Cls ;
   private String Dvpanel_unnamedtable10_Title ;
   private String Dvpanel_unnamedtable10_Iconposition ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divFasobl_cell_Internalname ;
   private String divFasobl_cell_Class ;
   private String divUnnamedtable2_Internalname ;
   private String Dvpanel_panelotrosdatos_Width ;
   private String Dvpanel_panelotrosdatos_Cls ;
   private String Dvpanel_panelotrosdatos_Title ;
   private String Dvpanel_panelotrosdatos_Iconposition ;
   private String Dvpanel_panelotrosdatos_Internalname ;
   private String sStyleString ;
   private String tblPanelotrosdatos_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divFasgral_cell_Internalname ;
   private String divFasgral_cell_Class ;
   private String divUnnamedtable5_Internalname ;
   private String divFasopeins_cell_Internalname ;
   private String divFasopeins_cell_Class ;
   private String divFascarda_cell_Internalname ;
   private String divFascarda_cell_Class ;
   private String divUnnamedtable6_Internalname ;
   private String divCombo_seccodf_cell_Internalname ;
   private String divCombo_seccodf_cell_Class ;
   private String divTablesplittedseccodf_Internalname ;
   private String lblTextblockseccodf_Internalname ;
   private String lblTextblockseccodf_Jsonclick ;
   private String Combo_seccodf_Caption ;
   private String Combo_seccodf_Cls ;
   private String Combo_seccodf_Emptyitemtext ;
   private String Combo_seccodf_Internalname ;
   private String edtSecCodF_Internalname ;
   private String edtSecCodF_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divFasvalmtr_cell_Internalname ;
   private String divFasvalmtr_cell_Class ;
   private String edtFasValMtr_Internalname ;
   private String edtFasValMtr_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtFasObsF_Internalname ;
   private String divDvpanel_unnamedtable3_cell_Internalname ;
   private String divDvpanel_unnamedtable3_cell_Class ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtFasPreMC_Internalname ;
   private String edtFasPreMC_Jsonclick ;
   private String divFaspreobl_cell_Internalname ;
   private String divFaspreobl_cell_Class ;
   private String divFasnorma_cell_Internalname ;
   private String divFasnorma_cell_Class ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV88Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_maqcod_Internalname ;
   private String edtavCombomaqcod_Internalname ;
   private String AV86ComboMaqCod ;
   private String edtavCombomaqcod_Jsonclick ;
   private String divSectionattribute_seccodf_Internalname ;
   private String edtavComboseccodf_Internalname ;
   private String AV84ComboSecCodF ;
   private String edtavComboseccodf_Jsonclick ;
   private String A4588FasCC ;
   private String A5232FasProCtb ;
   private String A5616FasTExt ;
   private String A14043FasSalida ;
   private String A14044FastoVtx ;
   private String A14045FasMtsAnc ;
   private String A14046FasInsAlb ;
   private String A14047FasTubos ;
   private String A14048FasStki ;
   private String A14049FasCops ;
   private String A14051FasStkT ;
   private String A14052FasPrefj ;
   private String A14053FasFinHdr ;
   private String A14054FasDivTime ;
   private String AV78Insert_MaqCod ;
   private String AV79Insert_SecCodF ;
   private String A407EmprNom ;
   private String A606MaqDsc ;
   private String A6163SecNomF ;
   private String Combo_maqcod_Objectcall ;
   private String Combo_maqcod_Class ;
   private String Combo_maqcod_Icontype ;
   private String Combo_maqcod_Icon ;
   private String Combo_maqcod_Tooltip ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_maqcod_Selectedtext_set ;
   private String Combo_maqcod_Selectedtext_get ;
   private String Combo_maqcod_Gamoauthtoken ;
   private String Combo_maqcod_Ddointernalname ;
   private String Combo_maqcod_Titlecontrolalign ;
   private String Combo_maqcod_Dropdownoptionstype ;
   private String Combo_maqcod_Titlecontrolidtoreplace ;
   private String Combo_maqcod_Datalisttype ;
   private String Combo_maqcod_Datalistfixedvalues ;
   private String Combo_maqcod_Datalistproc ;
   private String Combo_maqcod_Datalistprocparametersprefix ;
   private String Combo_maqcod_Remoteservicesparameters ;
   private String Combo_maqcod_Htmltemplate ;
   private String Combo_maqcod_Multiplevaluestype ;
   private String Combo_maqcod_Loadingdata ;
   private String Combo_maqcod_Noresultsfound ;
   private String Combo_maqcod_Emptyitemtext ;
   private String Combo_maqcod_Onlyselectedvalues ;
   private String Combo_maqcod_Selectalltext ;
   private String Combo_maqcod_Multiplevaluesseparator ;
   private String Combo_maqcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable9_Objectcall ;
   private String Dvpanel_unnamedtable9_Class ;
   private String Dvpanel_unnamedtable9_Height ;
   private String Dvpanel_unnamedtable10_Objectcall ;
   private String Dvpanel_unnamedtable10_Class ;
   private String Dvpanel_unnamedtable10_Height ;
   private String Combo_seccodf_Objectcall ;
   private String Combo_seccodf_Class ;
   private String Combo_seccodf_Icontype ;
   private String Combo_seccodf_Icon ;
   private String Combo_seccodf_Tooltip ;
   private String Combo_seccodf_Selectedvalue_set ;
   private String Combo_seccodf_Selectedtext_set ;
   private String Combo_seccodf_Selectedtext_get ;
   private String Combo_seccodf_Gamoauthtoken ;
   private String Combo_seccodf_Ddointernalname ;
   private String Combo_seccodf_Titlecontrolalign ;
   private String Combo_seccodf_Dropdownoptionstype ;
   private String Combo_seccodf_Titlecontrolidtoreplace ;
   private String Combo_seccodf_Datalisttype ;
   private String Combo_seccodf_Datalistfixedvalues ;
   private String Combo_seccodf_Datalistproc ;
   private String Combo_seccodf_Datalistprocparametersprefix ;
   private String Combo_seccodf_Remoteservicesparameters ;
   private String Combo_seccodf_Htmltemplate ;
   private String Combo_seccodf_Multiplevaluestype ;
   private String Combo_seccodf_Loadingdata ;
   private String Combo_seccodf_Noresultsfound ;
   private String Combo_seccodf_Onlyselectedvalues ;
   private String Combo_seccodf_Selectalltext ;
   private String Combo_seccodf_Multiplevaluesseparator ;
   private String Combo_seccodf_Addnewoptiontext ;
   private String Dvpanel_panelotrosdatos_Objectcall ;
   private String Dvpanel_panelotrosdatos_Class ;
   private String Dvpanel_panelotrosdatos_Height ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode45 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV33Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z606MaqDsc ;
   private String Z6163SecNomF ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i4588FasCC ;
   private String i4343FasEstamp ;
   private String i4286FasForMul ;
   private String i4903FasAcab ;
   private String i5616FasTExt ;
   private String i6011FasTip ;
   private String i7600FasH2OReh ;
   private String i7105FasObl ;
   private String i5368FasGral ;
   private String i7059FasPesInt ;
   private String i8888FasPesExp ;
   private String i7057FasOpeIns ;
   private String i14042FasActiva ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n602MaqCod ;
   private boolean n6162SecCodF ;
   private boolean wbErr ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean n4299FasConPla ;
   private boolean n7105FasObl ;
   private boolean n6011FasTip ;
   private boolean n5368FasGral ;
   private boolean n7059FasPesInt ;
   private boolean n8888FasPesExp ;
   private boolean n7600FasH2OReh ;
   private boolean n7057FasOpeIns ;
   private boolean n4343FasEstamp ;
   private boolean n7744FasPreObl ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_maqcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
   private boolean Dvpanel_unnamedtable10_Autowidth ;
   private boolean Dvpanel_unnamedtable10_Autoheight ;
   private boolean Dvpanel_unnamedtable10_Collapsible ;
   private boolean Dvpanel_unnamedtable10_Collapsed ;
   private boolean Dvpanel_unnamedtable10_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable10_Autoscroll ;
   private boolean Dvpanel_panelotrosdatos_Autowidth ;
   private boolean Dvpanel_panelotrosdatos_Autoheight ;
   private boolean Dvpanel_panelotrosdatos_Collapsible ;
   private boolean Dvpanel_panelotrosdatos_Collapsed ;
   private boolean Dvpanel_panelotrosdatos_Showcollapseicon ;
   private boolean Dvpanel_panelotrosdatos_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean n4588FasCC ;
   private boolean n5232FasProCtb ;
   private boolean n5616FasTExt ;
   private boolean n6880FasFGp ;
   private boolean n7058FasGrupo ;
   private boolean n407EmprNom ;
   private boolean n606MaqDsc ;
   private boolean n6163SecNomF ;
   private boolean Combo_maqcod_Enabled ;
   private boolean Combo_maqcod_Visible ;
   private boolean Combo_maqcod_Allowmultipleselection ;
   private boolean Combo_maqcod_Isgriditem ;
   private boolean Combo_maqcod_Hasdescription ;
   private boolean Combo_maqcod_Includeonlyselectedoption ;
   private boolean Combo_maqcod_Includeselectalloption ;
   private boolean Combo_maqcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable9_Enabled ;
   private boolean Dvpanel_unnamedtable9_Showheader ;
   private boolean Dvpanel_unnamedtable9_Visible ;
   private boolean Dvpanel_unnamedtable10_Enabled ;
   private boolean Dvpanel_unnamedtable10_Showheader ;
   private boolean Dvpanel_unnamedtable10_Visible ;
   private boolean Combo_seccodf_Enabled ;
   private boolean Combo_seccodf_Visible ;
   private boolean Combo_seccodf_Allowmultipleselection ;
   private boolean Combo_seccodf_Isgriditem ;
   private boolean Combo_seccodf_Hasdescription ;
   private boolean Combo_seccodf_Includeonlyselectedoption ;
   private boolean Combo_seccodf_Includeselectalloption ;
   private boolean Combo_seccodf_Emptyitem ;
   private boolean Combo_seccodf_Includeaddnewoption ;
   private boolean Dvpanel_panelotrosdatos_Enabled ;
   private boolean Dvpanel_panelotrosdatos_Showheader ;
   private boolean Dvpanel_panelotrosdatos_Visible ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n457FasCod ;
   private boolean n7070FasSigla ;
   private boolean n459FasDec ;
   private boolean n5990FasDec2 ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n4791FasValMtr ;
   private boolean n9838FasObsF ;
   private boolean n5168FasPreMC ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z9838FasObsF ;
   private String A9838FasObsF ;
   private String A13781FasCDsc ;
   private String AV83ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV77WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelotrosdatos ;
   private com.genexus.webpanels.GXUserControl ucCombo_seccodf ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkFasActiva ;
   private HTMLChoice cmbFasActTin ;
   private HTMLChoice cmbFasCon ;
   private HTMLChoice cmbFasAcab ;
   private HTMLChoice cmbFasForMul ;
   private HTMLChoice cmbFasConPla ;
   private HTMLChoice cmbFasObl ;
   private HTMLChoice cmbFasTip ;
   private HTMLChoice cmbFasGral ;
   private HTMLChoice cmbFasPesInt ;
   private HTMLChoice cmbFasPesExp ;
   private HTMLChoice cmbFasH2OReh ;
   private ICheckbox chkFasOpeIns ;
   private ICheckbox chkFasCarda ;
   private HTMLChoice cmbFasEstamp ;
   private ICheckbox chkFasPreObl ;
   private ICheckbox chkFasNorma ;
   private IDataStoreProvider pr_default ;
   private String[] T00114_A407EmprNom ;
   private boolean[] T00114_n407EmprNom ;
   private String[] T00115_A606MaqDsc ;
   private boolean[] T00115_n606MaqDsc ;
   private String[] T00116_A6163SecNomF ;
   private boolean[] T00116_n6163SecNomF ;
   private String[] T00117_A457FasCod ;
   private boolean[] T00117_n457FasCod ;
   private String[] T00117_A4588FasCC ;
   private boolean[] T00117_n4588FasCC ;
   private String[] T00117_A407EmprNom ;
   private boolean[] T00117_n407EmprNom ;
   private String[] T00117_A460FasDsc ;
   private String[] T00117_A7070FasSigla ;
   private boolean[] T00117_n7070FasSigla ;
   private String[] T00117_A606MaqDsc ;
   private boolean[] T00117_n606MaqDsc ;
   private java.math.BigDecimal[] T00117_A459FasDec ;
   private boolean[] T00117_n459FasDec ;
   private java.math.BigDecimal[] T00117_A5990FasDec2 ;
   private boolean[] T00117_n5990FasDec2 ;
   private short[] T00117_A469FasPreSal ;
   private boolean[] T00117_n469FasPreSal ;
   private short[] T00117_A468FasPrePie ;
   private boolean[] T00117_n468FasPrePie ;
   private java.math.BigDecimal[] T00117_A472FasVelPro ;
   private boolean[] T00117_n472FasVelPro ;
   private short[] T00117_A464FasNumPas ;
   private boolean[] T00117_n464FasNumPas ;
   private String[] T00117_A456FasActTin ;
   private boolean[] T00117_n456FasActTin ;
   private String[] T00117_A458FasCon ;
   private boolean[] T00117_n458FasCon ;
   private String[] T00117_A4903FasAcab ;
   private boolean[] T00117_n4903FasAcab ;
   private String[] T00117_A4286FasForMul ;
   private boolean[] T00117_n4286FasForMul ;
   private String[] T00117_A4299FasConPla ;
   private boolean[] T00117_n4299FasConPla ;
   private String[] T00117_A4343FasEstamp ;
   private boolean[] T00117_n4343FasEstamp ;
   private short[] T00117_A5168FasPreMC ;
   private boolean[] T00117_n5168FasPreMC ;
   private java.math.BigDecimal[] T00117_A4791FasValMtr ;
   private boolean[] T00117_n4791FasValMtr ;
   private String[] T00117_A5232FasProCtb ;
   private boolean[] T00117_n5232FasProCtb ;
   private String[] T00117_A5616FasTExt ;
   private boolean[] T00117_n5616FasTExt ;
   private String[] T00117_A6011FasTip ;
   private boolean[] T00117_n6011FasTip ;
   private String[] T00117_A7105FasObl ;
   private boolean[] T00117_n7105FasObl ;
   private byte[] T00117_A7744FasPreObl ;
   private boolean[] T00117_n7744FasPreObl ;
   private String[] T00117_A5368FasGral ;
   private boolean[] T00117_n5368FasGral ;
   private java.math.BigDecimal[] T00117_A6880FasFGp ;
   private boolean[] T00117_n6880FasFGp ;
   private String[] T00117_A7059FasPesInt ;
   private boolean[] T00117_n7059FasPesInt ;
   private String[] T00117_A8888FasPesExp ;
   private boolean[] T00117_n8888FasPesExp ;
   private String[] T00117_A9838FasObsF ;
   private boolean[] T00117_n9838FasObsF ;
   private String[] T00117_A6163SecNomF ;
   private boolean[] T00117_n6163SecNomF ;
   private String[] T00117_A7600FasH2OReh ;
   private boolean[] T00117_n7600FasH2OReh ;
   private String[] T00117_A7057FasOpeIns ;
   private boolean[] T00117_n7057FasOpeIns ;
   private int[] T00117_A7058FasGrupo ;
   private boolean[] T00117_n7058FasGrupo ;
   private byte[] T00117_A471FasUltLin ;
   private String[] T00117_A13808FasNorma ;
   private String[] T00117_A13809FasCarda ;
   private String[] T00117_A14042FasActiva ;
   private String[] T00117_A14043FasSalida ;
   private String[] T00117_A14044FastoVtx ;
   private String[] T00117_A14045FasMtsAnc ;
   private String[] T00117_A14046FasInsAlb ;
   private String[] T00117_A14047FasTubos ;
   private String[] T00117_A14048FasStki ;
   private String[] T00117_A14049FasCops ;
   private byte[] T00117_A14050FasClsHdr ;
   private String[] T00117_A14051FasStkT ;
   private String[] T00117_A14052FasPrefj ;
   private String[] T00117_A14053FasFinHdr ;
   private String[] T00117_A14054FasDivTime ;
   private String[] T00117_A396EmprCod ;
   private String[] T00117_A602MaqCod ;
   private boolean[] T00117_n602MaqCod ;
   private String[] T00117_A6162SecCodF ;
   private boolean[] T00117_n6162SecCodF ;
   private String[] T00118_A606MaqDsc ;
   private boolean[] T00118_n606MaqDsc ;
   private String[] T00119_A6163SecNomF ;
   private boolean[] T00119_n6163SecNomF ;
   private String[] T001110_A396EmprCod ;
   private String[] T001110_A457FasCod ;
   private boolean[] T001110_n457FasCod ;
   private String[] T00113_A457FasCod ;
   private boolean[] T00113_n457FasCod ;
   private String[] T00113_A4588FasCC ;
   private boolean[] T00113_n4588FasCC ;
   private String[] T00113_A460FasDsc ;
   private String[] T00113_A7070FasSigla ;
   private boolean[] T00113_n7070FasSigla ;
   private java.math.BigDecimal[] T00113_A459FasDec ;
   private boolean[] T00113_n459FasDec ;
   private java.math.BigDecimal[] T00113_A5990FasDec2 ;
   private boolean[] T00113_n5990FasDec2 ;
   private short[] T00113_A469FasPreSal ;
   private boolean[] T00113_n469FasPreSal ;
   private short[] T00113_A468FasPrePie ;
   private boolean[] T00113_n468FasPrePie ;
   private java.math.BigDecimal[] T00113_A472FasVelPro ;
   private boolean[] T00113_n472FasVelPro ;
   private short[] T00113_A464FasNumPas ;
   private boolean[] T00113_n464FasNumPas ;
   private String[] T00113_A456FasActTin ;
   private boolean[] T00113_n456FasActTin ;
   private String[] T00113_A458FasCon ;
   private boolean[] T00113_n458FasCon ;
   private String[] T00113_A4903FasAcab ;
   private boolean[] T00113_n4903FasAcab ;
   private String[] T00113_A4286FasForMul ;
   private boolean[] T00113_n4286FasForMul ;
   private String[] T00113_A4299FasConPla ;
   private boolean[] T00113_n4299FasConPla ;
   private String[] T00113_A4343FasEstamp ;
   private boolean[] T00113_n4343FasEstamp ;
   private short[] T00113_A5168FasPreMC ;
   private boolean[] T00113_n5168FasPreMC ;
   private java.math.BigDecimal[] T00113_A4791FasValMtr ;
   private boolean[] T00113_n4791FasValMtr ;
   private String[] T00113_A5232FasProCtb ;
   private boolean[] T00113_n5232FasProCtb ;
   private String[] T00113_A5616FasTExt ;
   private boolean[] T00113_n5616FasTExt ;
   private String[] T00113_A6011FasTip ;
   private boolean[] T00113_n6011FasTip ;
   private String[] T00113_A7105FasObl ;
   private boolean[] T00113_n7105FasObl ;
   private byte[] T00113_A7744FasPreObl ;
   private boolean[] T00113_n7744FasPreObl ;
   private String[] T00113_A5368FasGral ;
   private boolean[] T00113_n5368FasGral ;
   private java.math.BigDecimal[] T00113_A6880FasFGp ;
   private boolean[] T00113_n6880FasFGp ;
   private String[] T00113_A7059FasPesInt ;
   private boolean[] T00113_n7059FasPesInt ;
   private String[] T00113_A8888FasPesExp ;
   private boolean[] T00113_n8888FasPesExp ;
   private String[] T00113_A9838FasObsF ;
   private boolean[] T00113_n9838FasObsF ;
   private String[] T00113_A7600FasH2OReh ;
   private boolean[] T00113_n7600FasH2OReh ;
   private String[] T00113_A7057FasOpeIns ;
   private boolean[] T00113_n7057FasOpeIns ;
   private int[] T00113_A7058FasGrupo ;
   private boolean[] T00113_n7058FasGrupo ;
   private byte[] T00113_A471FasUltLin ;
   private String[] T00113_A13808FasNorma ;
   private String[] T00113_A13809FasCarda ;
   private String[] T00113_A14042FasActiva ;
   private String[] T00113_A14043FasSalida ;
   private String[] T00113_A14044FastoVtx ;
   private String[] T00113_A14045FasMtsAnc ;
   private String[] T00113_A14046FasInsAlb ;
   private String[] T00113_A14047FasTubos ;
   private String[] T00113_A14048FasStki ;
   private String[] T00113_A14049FasCops ;
   private byte[] T00113_A14050FasClsHdr ;
   private String[] T00113_A14051FasStkT ;
   private String[] T00113_A14052FasPrefj ;
   private String[] T00113_A14053FasFinHdr ;
   private String[] T00113_A14054FasDivTime ;
   private String[] T00113_A396EmprCod ;
   private String[] T00113_A602MaqCod ;
   private boolean[] T00113_n602MaqCod ;
   private String[] T00113_A6162SecCodF ;
   private boolean[] T00113_n6162SecCodF ;
   private String[] T001111_A396EmprCod ;
   private String[] T001111_A457FasCod ;
   private boolean[] T001111_n457FasCod ;
   private String[] T001112_A396EmprCod ;
   private String[] T001112_A457FasCod ;
   private boolean[] T001112_n457FasCod ;
   private String[] T00112_A457FasCod ;
   private boolean[] T00112_n457FasCod ;
   private String[] T00112_A4588FasCC ;
   private boolean[] T00112_n4588FasCC ;
   private String[] T00112_A460FasDsc ;
   private String[] T00112_A7070FasSigla ;
   private boolean[] T00112_n7070FasSigla ;
   private java.math.BigDecimal[] T00112_A459FasDec ;
   private boolean[] T00112_n459FasDec ;
   private java.math.BigDecimal[] T00112_A5990FasDec2 ;
   private boolean[] T00112_n5990FasDec2 ;
   private short[] T00112_A469FasPreSal ;
   private boolean[] T00112_n469FasPreSal ;
   private short[] T00112_A468FasPrePie ;
   private boolean[] T00112_n468FasPrePie ;
   private java.math.BigDecimal[] T00112_A472FasVelPro ;
   private boolean[] T00112_n472FasVelPro ;
   private short[] T00112_A464FasNumPas ;
   private boolean[] T00112_n464FasNumPas ;
   private String[] T00112_A456FasActTin ;
   private boolean[] T00112_n456FasActTin ;
   private String[] T00112_A458FasCon ;
   private boolean[] T00112_n458FasCon ;
   private String[] T00112_A4903FasAcab ;
   private boolean[] T00112_n4903FasAcab ;
   private String[] T00112_A4286FasForMul ;
   private boolean[] T00112_n4286FasForMul ;
   private String[] T00112_A4299FasConPla ;
   private boolean[] T00112_n4299FasConPla ;
   private String[] T00112_A4343FasEstamp ;
   private boolean[] T00112_n4343FasEstamp ;
   private short[] T00112_A5168FasPreMC ;
   private boolean[] T00112_n5168FasPreMC ;
   private java.math.BigDecimal[] T00112_A4791FasValMtr ;
   private boolean[] T00112_n4791FasValMtr ;
   private String[] T00112_A5232FasProCtb ;
   private boolean[] T00112_n5232FasProCtb ;
   private String[] T00112_A5616FasTExt ;
   private boolean[] T00112_n5616FasTExt ;
   private String[] T00112_A6011FasTip ;
   private boolean[] T00112_n6011FasTip ;
   private String[] T00112_A7105FasObl ;
   private boolean[] T00112_n7105FasObl ;
   private byte[] T00112_A7744FasPreObl ;
   private boolean[] T00112_n7744FasPreObl ;
   private String[] T00112_A5368FasGral ;
   private boolean[] T00112_n5368FasGral ;
   private java.math.BigDecimal[] T00112_A6880FasFGp ;
   private boolean[] T00112_n6880FasFGp ;
   private String[] T00112_A7059FasPesInt ;
   private boolean[] T00112_n7059FasPesInt ;
   private String[] T00112_A8888FasPesExp ;
   private boolean[] T00112_n8888FasPesExp ;
   private String[] T00112_A9838FasObsF ;
   private boolean[] T00112_n9838FasObsF ;
   private String[] T00112_A7600FasH2OReh ;
   private boolean[] T00112_n7600FasH2OReh ;
   private String[] T00112_A7057FasOpeIns ;
   private boolean[] T00112_n7057FasOpeIns ;
   private int[] T00112_A7058FasGrupo ;
   private boolean[] T00112_n7058FasGrupo ;
   private byte[] T00112_A471FasUltLin ;
   private String[] T00112_A13808FasNorma ;
   private String[] T00112_A13809FasCarda ;
   private String[] T00112_A14042FasActiva ;
   private String[] T00112_A14043FasSalida ;
   private String[] T00112_A14044FastoVtx ;
   private String[] T00112_A14045FasMtsAnc ;
   private String[] T00112_A14046FasInsAlb ;
   private String[] T00112_A14047FasTubos ;
   private String[] T00112_A14048FasStki ;
   private String[] T00112_A14049FasCops ;
   private byte[] T00112_A14050FasClsHdr ;
   private String[] T00112_A14051FasStkT ;
   private String[] T00112_A14052FasPrefj ;
   private String[] T00112_A14053FasFinHdr ;
   private String[] T00112_A14054FasDivTime ;
   private String[] T00112_A396EmprCod ;
   private String[] T00112_A602MaqCod ;
   private boolean[] T00112_n602MaqCod ;
   private String[] T00112_A6162SecCodF ;
   private boolean[] T00112_n6162SecCodF ;
   private String[] T001116_A606MaqDsc ;
   private boolean[] T001116_n606MaqDsc ;
   private String[] T001117_A6163SecNomF ;
   private boolean[] T001117_n6163SecNomF ;
   private String[] T001118_A396EmprCod ;
   private int[] T001118_A129BarCod ;
   private byte[] T001118_A132BarCodReo ;
   private String[] T001118_A130BarCodPar ;
   private short[] T001118_A14152MEnvOrd ;
   private String[] T001119_A396EmprCod ;
   private int[] T001119_A13026PedDGId ;
   private String[] T001119_A758ProCod ;
   private short[] T001119_A13045PedDGFasLi ;
   private String[] T001120_A396EmprCod ;
   private int[] T001120_A6882Tas_num ;
   private short[] T001120_A6922Tas_lin ;
   private String[] T001121_A396EmprCod ;
   private int[] T001121_A11604PArtId ;
   private short[] T001121_A11611PAFOrd ;
   private String[] T001122_A396EmprCod ;
   private String[] T001122_A11278Regc_c1 ;
   private String[] T001122_A457FasCod ;
   private boolean[] T001122_n457FasCod ;
   private String[] T001123_A396EmprCod ;
   private long[] T001123_A1131AviNumero ;
   private String[] T001123_A457FasCod ;
   private boolean[] T001123_n457FasCod ;
   private String[] T001124_A396EmprCod ;
   private String[] T001124_A457FasCod ;
   private boolean[] T001124_n457FasCod ;
   private String[] T001124_A9832MaqCodF ;
   private String[] T001125_A396EmprCod ;
   private String[] T001125_A457FasCod ;
   private boolean[] T001125_n457FasCod ;
   private short[] T001125_A9723Cod_par ;
   private String[] T001126_A396EmprCod ;
   private String[] T001126_A457FasCod ;
   private boolean[] T001126_n457FasCod ;
   private short[] T001126_A8096FasArtTip ;
   private byte[] T001126_A7730FasArtInt ;
   private String[] T001126_A7731FasArtSeg ;
   private String[] T001127_A396EmprCod ;
   private short[] T001127_A6633NumOrd ;
   private String[] T001127_A457FasCod ;
   private boolean[] T001127_n457FasCod ;
   private String[] T001128_A396EmprCod ;
   private int[] T001128_A2253SalExtAlb ;
   private short[] T001128_A6248SalExNln ;
   private String[] T001129_A396EmprCod ;
   private String[] T001129_A457FasCod ;
   private boolean[] T001129_n457FasCod ;
   private short[] T001129_A5703Hh_FLin ;
   private String[] T001130_A396EmprCod ;
   private int[] T001130_A4744RecPreCod ;
   private String[] T001131_A396EmprCod ;
   private String[] T001131_A457FasCod ;
   private boolean[] T001131_n457FasCod ;
   private short[] T001131_A4650FasForLin ;
   private String[] T001132_A396EmprCod ;
   private String[] T001132_A457FasCod ;
   private boolean[] T001132_n457FasCod ;
   private int[] T001132_A4031CCTCod ;
   private String[] T001133_A396EmprCod ;
   private String[] T001133_A457FasCod ;
   private boolean[] T001133_n457FasCod ;
   private byte[] T001133_A3635FasTerCod ;
   private String[] T001134_A396EmprCod ;
   private int[] T001134_A2406ExhAlbCod ;
   private int[] T001134_A129BarCod ;
   private byte[] T001134_A132BarCodReo ;
   private String[] T001134_A130BarCodPar ;
   private String[] T001135_A396EmprCod ;
   private int[] T001135_A2253SalExtAlb ;
   private int[] T001135_A129BarCod ;
   private byte[] T001135_A132BarCodReo ;
   private String[] T001135_A130BarCodPar ;
   private String[] T001136_A396EmprCod ;
   private long[] T001136_A30AlbProCod ;
   private int[] T001136_A129BarCod ;
   private byte[] T001136_A132BarCodReo ;
   private String[] T001136_A130BarCodPar ;
   private short[] T001136_A1240GuiFasLin ;
   private String[] T001137_A396EmprCod ;
   private String[] T001137_A758ProCod ;
   private short[] T001137_A774ProNumLin ;
   private String[] T001138_A396EmprCod ;
   private int[] T001138_A252CliCod ;
   private String[] T001138_A457FasCod ;
   private boolean[] T001138_n457FasCod ;
   private String[] T001139_A396EmprCod ;
   private String[] T001139_A457FasCod ;
   private boolean[] T001139_n457FasCod ;
   private byte[] T001139_A463FasNumLin ;
   private String[] T001140_A396EmprCod ;
   private int[] T001140_A361DisCod ;
   private String[] T001140_A758ProCod ;
   private short[] T001140_A368DisFasLin ;
   private String[] T001141_A396EmprCod ;
   private int[] T001141_A129BarCod ;
   private byte[] T001141_A132BarCodReo ;
   private String[] T001141_A130BarCodPar ;
   private String[] T001141_A758ProCod ;
   private short[] T001141_A194BarOrdLin ;
   private String[] T001142_A396EmprCod ;
   private String[] T001142_A457FasCod ;
   private boolean[] T001142_n457FasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV85MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV82SecCodF_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV75WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV76TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV80TrnContextAtt ;
}

final  class tfaspro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00112", "SELECT FasCod, FasCC, FasDsc, FasSigla, FasDec, FasDec2, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasAcab, FasForMul, FasConPla, FasEstamp, FasPreMC, FasValMtr, FasProCtb, FasTExt, FasTip, FasObl, FasPreObl, FasGral, FasFGp, FasPesInt, FasPesExp, FasObsF, FasH2OReh, FasOpeIns, FasGrupo, FasUltLin, FasNorma, FasCarda, FasActiva, FasSalida, FastoVtx, FasMtsAnc, FasInsAlb, FasTubos, FasStki, FasCops, FasClsHdr, FasStkT, FasPrefj, FasFinHdr, FasDivTime, EmprCod, MaqCod, SecCodF FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ?  FOR UPDATE OF FasCC, FasDsc, FasSigla, FasDec, FasDec2, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasAcab, FasForMul, FasConPla, FasEstamp, FasPreMC, FasValMtr, FasProCtb, FasTExt, FasTip, FasObl, FasPreObl, FasGral, FasFGp, FasPesInt, FasPesExp, FasObsF, FasH2OReh, FasOpeIns, FasGrupo, FasUltLin, FasNorma, FasCarda, FasActiva, FasSalida, FastoVtx, FasMtsAnc, FasInsAlb, FasTubos, FasStki, FasCops, FasClsHdr, FasStkT, FasPrefj, FasFinHdr, FasDivTime, MaqCod, SecCodF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00113", "SELECT FasCod, FasCC, FasDsc, FasSigla, FasDec, FasDec2, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasAcab, FasForMul, FasConPla, FasEstamp, FasPreMC, FasValMtr, FasProCtb, FasTExt, FasTip, FasObl, FasPreObl, FasGral, FasFGp, FasPesInt, FasPesExp, FasObsF, FasH2OReh, FasOpeIns, FasGrupo, FasUltLin, FasNorma, FasCarda, FasActiva, FasSalida, FastoVtx, FasMtsAnc, FasInsAlb, FasTubos, FasStki, FasCops, FasClsHdr, FasStkT, FasPrefj, FasFinHdr, FasDivTime, EmprCod, MaqCod, SecCodF FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00114", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00115", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00116", "SELECT SecNomF FROM TXPTSECCI WHERE EmprCod = ? AND SecCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00117", "SELECT /*+ FIRST_ROWS(100) */ TM1.FasCod, TM1.FasCC, T2.EmprNom, TM1.FasDsc, TM1.FasSigla, T3.MaqDsc, TM1.FasDec, TM1.FasDec2, TM1.FasPreSal, TM1.FasPrePie, TM1.FasVelPro, TM1.FasNumPas, TM1.FasActTin, TM1.FasCon, TM1.FasAcab, TM1.FasForMul, TM1.FasConPla, TM1.FasEstamp, TM1.FasPreMC, TM1.FasValMtr, TM1.FasProCtb, TM1.FasTExt, TM1.FasTip, TM1.FasObl, TM1.FasPreObl, TM1.FasGral, TM1.FasFGp, TM1.FasPesInt, TM1.FasPesExp, TM1.FasObsF, T4.SecNomF, TM1.FasH2OReh, TM1.FasOpeIns, TM1.FasGrupo, TM1.FasUltLin, TM1.FasNorma, TM1.FasCarda, TM1.FasActiva, TM1.FasSalida, TM1.FastoVtx, TM1.FasMtsAnc, TM1.FasInsAlb, TM1.FasTubos, TM1.FasStki, TM1.FasCops, TM1.FasClsHdr, TM1.FasStkT, TM1.FasPrefj, TM1.FasFinHdr, TM1.FasDivTime, TM1.EmprCod, TM1.MaqCod, TM1.SecCodF FROM (((TXPFASPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod) LEFT JOIN TXPTSECCI T4 ON T4.EmprCod = TM1.EmprCod AND T4.SecCodF = TM1.SecCodF) WHERE TM1.EmprCod = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00118", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00119", "SELECT SecNomF FROM TXPTSECCI WHERE EmprCod = ? AND SecCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001110", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001111", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE ( FasCod > ?) and EmprCod = ? ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001112", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE ( FasCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, FasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001113", "INSERT INTO TXPFASPRO(FasCod, FasCC, FasDsc, FasSigla, FasDec, FasDec2, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasAcab, FasForMul, FasConPla, FasEstamp, FasPreMC, FasValMtr, FasProCtb, FasTExt, FasTip, FasObl, FasPreObl, FasGral, FasFGp, FasPesInt, FasPesExp, FasObsF, FasH2OReh, FasOpeIns, FasGrupo, FasUltLin, FasNorma, FasCarda, FasActiva, FasSalida, FastoVtx, FasMtsAnc, FasInsAlb, FasTubos, FasStki, FasCops, FasClsHdr, FasStkT, FasPrefj, FasFinHdr, FasDivTime, EmprCod, MaqCod, SecCodF, FasCara, FasUltFor, FasProDsc, FasDsc2, FasUltForL, FasFact, Hh_FUltL, FasTpp, FasTog, FasUnpLt, Tip_CodFas, FasRbCost, FasTpCost, FasCrgNor, FasCrgOpt, FasOpeTip) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T001114", "UPDATE TXPFASPRO SET FasCC=?, FasDsc=?, FasSigla=?, FasDec=?, FasDec2=?, FasPreSal=?, FasPrePie=?, FasVelPro=?, FasNumPas=?, FasActTin=?, FasCon=?, FasAcab=?, FasForMul=?, FasConPla=?, FasEstamp=?, FasPreMC=?, FasValMtr=?, FasProCtb=?, FasTExt=?, FasTip=?, FasObl=?, FasPreObl=?, FasGral=?, FasFGp=?, FasPesInt=?, FasPesExp=?, FasObsF=?, FasH2OReh=?, FasOpeIns=?, FasGrupo=?, FasUltLin=?, FasNorma=?, FasCarda=?, FasActiva=?, FasSalida=?, FastoVtx=?, FasMtsAnc=?, FasInsAlb=?, FasTubos=?, FasStki=?, FasCops=?, FasClsHdr=?, FasStkT=?, FasPrefj=?, FasFinHdr=?, FasDivTime=?, MaqCod=?, SecCodF=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T001115", "DELETE FROM TXPFASPRO  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new ForEachCursor("T001116", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001117", "SELECT SecNomF FROM TXPTSECCI WHERE EmprCod = ? AND SecCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001118", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001119", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001120", "SELECT * FROM (SELECT EmprCod, Tas_num, Tas_lin FROM TXPCOSTA1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001121", "SELECT * FROM (SELECT EmprCod, PArtId, PAFOrd FROM TXPPedAFa WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001122", "SELECT * FROM (SELECT EmprCod, Regc_c1, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001123", "SELECT * FROM (SELECT EmprCod, AviNumero, FasCod FROM TXPAVI001 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001124", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001125", "SELECT * FROM (SELECT EmprCod, FasCod, Cod_par FROM TXPPARFSS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001126", "SELECT * FROM (SELECT EmprCod, FasCod, FasArtTip, FasArtInt, FasArtSeg FROM TXPArtPrd WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001127", "SELECT * FROM (SELECT EmprCod, NumOrd, FasCod FROM TXPFASMUS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001128", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND FasCodn = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001129", "SELECT * FROM (SELECT EmprCod, FasCod, Hh_FLin FROM TXPALAPFA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001130", "SELECT * FROM (SELECT EmprCod, RecPreCod FROM TXPPREREC WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001131", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001132", "SELECT * FROM (SELECT EmprCod, FasCod, CCTCod FROM TXPCCFas WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001133", "SELECT * FROM (SELECT EmprCod, FasCod, FasTerCod FROM TXPFASTER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001134", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001135", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001136", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001137", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001138", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001139", "SELECT * FROM (SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001140", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001141", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001142", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? ORDER BY EmprCod, FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 9);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(31);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(32);
               ((String[]) buf[61])[0] = rslt.getString(33, 1);
               ((String[]) buf[62])[0] = rslt.getString(34, 1);
               ((String[]) buf[63])[0] = rslt.getString(35, 1);
               ((String[]) buf[64])[0] = rslt.getString(36, 1);
               ((String[]) buf[65])[0] = rslt.getString(37, 1);
               ((String[]) buf[66])[0] = rslt.getString(38, 1);
               ((String[]) buf[67])[0] = rslt.getString(39, 1);
               ((String[]) buf[68])[0] = rslt.getString(40, 1);
               ((String[]) buf[69])[0] = rslt.getString(41, 1);
               ((String[]) buf[70])[0] = rslt.getString(42, 1);
               ((byte[]) buf[71])[0] = rslt.getByte(43);
               ((String[]) buf[72])[0] = rslt.getString(44, 3);
               ((String[]) buf[73])[0] = rslt.getString(45, 1);
               ((String[]) buf[74])[0] = rslt.getString(46, 1);
               ((String[]) buf[75])[0] = rslt.getString(47, 1);
               ((String[]) buf[76])[0] = rslt.getString(48, 3);
               ((String[]) buf[77])[0] = rslt.getString(49, 6);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(50, 2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 9);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(31);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(32);
               ((String[]) buf[61])[0] = rslt.getString(33, 1);
               ((String[]) buf[62])[0] = rslt.getString(34, 1);
               ((String[]) buf[63])[0] = rslt.getString(35, 1);
               ((String[]) buf[64])[0] = rslt.getString(36, 1);
               ((String[]) buf[65])[0] = rslt.getString(37, 1);
               ((String[]) buf[66])[0] = rslt.getString(38, 1);
               ((String[]) buf[67])[0] = rslt.getString(39, 1);
               ((String[]) buf[68])[0] = rslt.getString(40, 1);
               ((String[]) buf[69])[0] = rslt.getString(41, 1);
               ((String[]) buf[70])[0] = rslt.getString(42, 1);
               ((byte[]) buf[71])[0] = rslt.getByte(43);
               ((String[]) buf[72])[0] = rslt.getString(44, 3);
               ((String[]) buf[73])[0] = rslt.getString(45, 1);
               ((String[]) buf[74])[0] = rslt.getString(46, 1);
               ((String[]) buf[75])[0] = rslt.getString(47, 1);
               ((String[]) buf[76])[0] = rslt.getString(48, 3);
               ((String[]) buf[77])[0] = rslt.getString(49, 6);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(50, 2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 28);
               ((String[]) buf[6])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 9);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(34);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(35);
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((String[]) buf[68])[0] = rslt.getString(37, 1);
               ((String[]) buf[69])[0] = rslt.getString(38, 1);
               ((String[]) buf[70])[0] = rslt.getString(39, 1);
               ((String[]) buf[71])[0] = rslt.getString(40, 1);
               ((String[]) buf[72])[0] = rslt.getString(41, 1);
               ((String[]) buf[73])[0] = rslt.getString(42, 1);
               ((String[]) buf[74])[0] = rslt.getString(43, 1);
               ((String[]) buf[75])[0] = rslt.getString(44, 1);
               ((String[]) buf[76])[0] = rslt.getString(45, 1);
               ((byte[]) buf[77])[0] = rslt.getByte(46);
               ((String[]) buf[78])[0] = rslt.getString(47, 3);
               ((String[]) buf[79])[0] = rslt.getString(48, 1);
               ((String[]) buf[80])[0] = rslt.getString(49, 1);
               ((String[]) buf[81])[0] = rslt.getString(50, 1);
               ((String[]) buf[82])[0] = rslt.getString(51, 3);
               ((String[]) buf[83])[0] = rslt.getString(52, 6);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(53, 2);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setString(3, (String)parms[4], 28);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 4);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 9);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[44]).byteValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 3000);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 1);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[60]).intValue());
               }
               stmt.setByte(32, ((Number) parms[61]).byteValue());
               stmt.setString(33, (String)parms[62], 1);
               stmt.setString(34, (String)parms[63], 1);
               stmt.setString(35, (String)parms[64], 1);
               stmt.setString(36, (String)parms[65], 1);
               stmt.setString(37, (String)parms[66], 1);
               stmt.setString(38, (String)parms[67], 1);
               stmt.setString(39, (String)parms[68], 1);
               stmt.setString(40, (String)parms[69], 1);
               stmt.setString(41, (String)parms[70], 1);
               stmt.setString(42, (String)parms[71], 1);
               stmt.setByte(43, ((Number) parms[72]).byteValue());
               stmt.setString(44, (String)parms[73], 3);
               stmt.setString(45, (String)parms[74], 1);
               stmt.setString(46, (String)parms[75], 1);
               stmt.setString(47, (String)parms[76], 1);
               stmt.setString(48, (String)parms[77], 3);
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[79], 6);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[81], 2);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 28);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 4);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 9);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[42]).byteValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 1);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 3000);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[58]).intValue());
               }
               stmt.setByte(31, ((Number) parms[59]).byteValue());
               stmt.setString(32, (String)parms[60], 1);
               stmt.setString(33, (String)parms[61], 1);
               stmt.setString(34, (String)parms[62], 1);
               stmt.setString(35, (String)parms[63], 1);
               stmt.setString(36, (String)parms[64], 1);
               stmt.setString(37, (String)parms[65], 1);
               stmt.setString(38, (String)parms[66], 1);
               stmt.setString(39, (String)parms[67], 1);
               stmt.setString(40, (String)parms[68], 1);
               stmt.setString(41, (String)parms[69], 1);
               stmt.setByte(42, ((Number) parms[70]).byteValue());
               stmt.setString(43, (String)parms[71], 3);
               stmt.setString(44, (String)parms[72], 1);
               stmt.setString(45, (String)parms[73], 1);
               stmt.setString(46, (String)parms[74], 1);
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[76], 6);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[78], 2);
               }
               stmt.setString(49, (String)parms[79], 3);
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[81], 8);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

