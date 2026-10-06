package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprofor_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A6061ProForLab = httpContext.GetPar( "ProForLab") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         AV64Exis_pro = (byte)(GXutil.lval( httpContext.GetPar( "Exis_pro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Exis_pro", GXutil.str( AV64Exis_pro, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_2489( A396EmprCod, A6061ProForLab, AV64Exis_pro) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         AV114Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV18Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
         AV85Msg_e = httpContext.GetPar( "Msg_e") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Msg_e", AV85Msg_e);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_2490( Gx_mode, A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV85Msg_e, A767ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         AV114Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV18Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
         AV89Msg_del = httpContext.GetPar( "Msg_del") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Msg_del", AV89Msg_del);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_2490( Gx_mode, A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV89Msg_del, A767ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         AV114Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV18Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
         AV85Msg_e = httpContext.GetPar( "Msg_e") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Msg_e", AV85Msg_e);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A762ProForCan = CommonUtil.decimalVal( httpContext.GetPar( "ProForCan"), ".") ;
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         A763ProForCla = httpContext.GetPar( "ProForCla") ;
         A5358ProForClv = httpContext.GetPar( "ProForClv") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_2490( Gx_mode, A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV85Msg_e, A767ProForLin, A762ProForCan, A490ForPrdUMe, A763ProForCla, A5358ProForClv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action36") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         A765ProForDes = httpContext.GetPar( "ProForDes") ;
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         A762ProForCan = CommonUtil.decimalVal( httpContext.GetPar( "ProForCan"), ".") ;
         A1645ProForNro = (byte)(GXutil.lval( httpContext.GetPar( "ProForNro"))) ;
         A3379ProForTnq = (byte)(GXutil.lval( httpContext.GetPar( "ProForTnq"))) ;
         A763ProForCla = httpContext.GetPar( "ProForCla") ;
         A5358ProForClv = httpContext.GetPar( "ProForClv") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_36_2490( Gx_mode, A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action37") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         A765ProForDes = httpContext.GetPar( "ProForDes") ;
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         A762ProForCan = CommonUtil.decimalVal( httpContext.GetPar( "ProForCan"), ".") ;
         A1645ProForNro = (byte)(GXutil.lval( httpContext.GetPar( "ProForNro"))) ;
         A3379ProForTnq = (byte)(GXutil.lval( httpContext.GetPar( "ProForTnq"))) ;
         A763ProForCla = httpContext.GetPar( "ProForCla") ;
         A5358ProForClv = httpContext.GetPar( "ProForClv") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_37_2490( Gx_mode, A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROFORPRD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaproforprd240( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaforprdume240( A396EmprCod, A13746ForPrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaforprdume240( A396EmprCod, A13746ForPrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h490ForPrdUMe = httpContext.GetPar( "h490ForPrdUMe") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaforprdume2490( A396EmprCod, h490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"PROFORLIN") == 0 )
      {
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13750ProForMaxL = (short)(GXutil.lval( httpContext.GetPar( "ProForMaxL"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13750ProForMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13750ProForMaxL), 4, 0));
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx15asaproforlin2490( A770ProForPrd, A490ForPrdUMe, Gx_mode, A13750ProForMaxL, A767ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_44") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_44( A396EmprCod, A770ProForPrd) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO PROCESOS FORMULA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProForCod_Internalname ;
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
      nRC_GXsfl_125 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_125"))) ;
      nGXsfl_125_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_125_idx"))) ;
      sGXsfl_125_idx = httpContext.GetPar( "sGXsfl_125_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV61CdpPor = (byte)(GXutil.lval( httpContext.GetPar( "CdpPor"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tprofor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprofor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprofor_impl.class ));
   }

   public tprofor_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkProForAct = UIFactory.getCheckbox(this);
      cmbProRev = new HTMLChoice();
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
      A13133ProForAct = ((GXutil.strcmp(GXutil.rtrim( A13133ProForAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      if ( cmbProRev.getItemCount() > 0 )
      {
         A3005ProRev = cmbProRev.getValidValue(A3005ProRev) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
         httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc_Internalname, httpContext.getMessage( "Proc. Quim.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc2_Internalname, httpContext.getMessage( "Proc. Quim.(large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2), GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkProForAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkProForAct.getInternalname(), httpContext.getMessage( "Activo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkProForAct.getInternalname(), A13133ProForAct, "", httpContext.getMessage( "Activo", ""), 1, chkProForAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(37, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,37);\"");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTip_Internalname, httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTip_Internalname, GXutil.rtrim( A5523ProForTip), GXutil.rtrim( localUtil.format( A5523ProForTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbProRev.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbProRev.getInternalname(), httpContext.getMessage( "Revision", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbProRev, cmbProRev.getInternalname(), GXutil.rtrim( A3005ProRev), 1, cmbProRev.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbProRev.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\TPROFOR.htm");
      cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
      httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTie_Internalname, httpContext.getMessage( "Tiempo(m)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTmx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTmx_Internalname, httpContext.getMessage( "T ºC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTmx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForMat_Internalname, GXutil.rtrim( A769ProForMat), GXutil.rtrim( localUtil.format( A769ProForMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForRb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForRb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForLab_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForLab_Internalname, httpContext.getMessage( "Proceso Lab", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForLab_Internalname, GXutil.rtrim( A6061ProForLab), GXutil.rtrim( localUtil.format( A6061ProForLab, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForLab_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForLab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforabs_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForAbs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForAbs_Internalname, httpContext.getMessage( "Fact Abs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForAbs_Enabled!=0) ? localUtil.format( A8527ProForAbs, "ZZ9.99") : localUtil.format( A8527ProForAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForAbs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforcos_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCos_Internalname, httpContext.getMessage( "Coste", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCos_Internalname, GXutil.ltrim( localUtil.ntoc( A8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForCos_Enabled!=0) ? localUtil.format( A8528ProForCos, "ZZ9.9999") : localUtil.format( A8528ProForCos, "ZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCos_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumPro_Internalname, httpContext.getMessage( "Nº Prog", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumPro_Internalname, GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumPro_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumRec_Internalname, httpContext.getMessage( "Nº Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumRec_Internalname, GXutil.ltrim( localUtil.ntoc( A2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumRec_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforpau_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForPau_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForPau_Internalname, httpContext.getMessage( "Pausa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForPau_Internalname, GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForPau_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForPau_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForPau_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divProh2o_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProH2O_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProH2O_Internalname, httpContext.getMessage( "Nº Aguas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProH2O_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProH2O_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TPROFOR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnclaves_Internalname, "", httpContext.getMessage( "Claves", ""), bttBtnclaves_Jsonclick, 7, httpContext.getMessage( "Claves", ""), "", StyleString, ClassString, bttBtnclaves_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112489_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnanularclaves_Internalname, "", httpContext.getMessage( "Anular Claves", ""), bttBtnanularclaves_Jsonclick, 7, httpContext.getMessage( "Anular Claves", ""), "", StyleString, ClassString, bttBtnanularclaves_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e122489_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TPROFOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TPROFOR.htm");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_anularclaves_Internalname, tblTabledvelop_confirmpanel_anularclaves_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_anularclaves.setProperty("Title", Dvelop_confirmpanel_anularclaves_Title);
      ucDvelop_confirmpanel_anularclaves.setProperty("ConfirmationText", Dvelop_confirmpanel_anularclaves_Confirmationtext);
      ucDvelop_confirmpanel_anularclaves.setProperty("YesButtonCaption", Dvelop_confirmpanel_anularclaves_Yesbuttoncaption);
      ucDvelop_confirmpanel_anularclaves.setProperty("NoButtonCaption", Dvelop_confirmpanel_anularclaves_Nobuttoncaption);
      ucDvelop_confirmpanel_anularclaves.setProperty("CancelButtonCaption", Dvelop_confirmpanel_anularclaves_Cancelbuttoncaption);
      ucDvelop_confirmpanel_anularclaves.setProperty("YesButtonPosition", Dvelop_confirmpanel_anularclaves_Yesbuttonposition);
      ucDvelop_confirmpanel_anularclaves.setProperty("ConfirmType", Dvelop_confirmpanel_anularclaves_Confirmtype);
      ucDvelop_confirmpanel_anularclaves.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_anularclaves_Internalname, "DVELOP_CONFIRMPANEL_ANULARCLAVESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ANULARCLAVESContainer"+"Body"+"\" style=\"display:none;\">") ;
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

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol125( ) ;
      nGXsfl_125_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount90 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_90 = (short)(1) ;
            scanStart2490( ) ;
            while ( RcdFound90 != 0 )
            {
               init_level_properties90( ) ;
               getByPrimaryKey2490( ) ;
               addRow2490( ) ;
               scanNext2490( ) ;
            }
            scanEnd2490( ) ;
            nBlankRcdCount90 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal2490( ) ;
         standaloneModal2490( ) ;
         sMode90 = Gx_mode ;
         while ( nGXsfl_125_idx < nRC_GXsfl_125 )
         {
            bGXsfl_125_Refreshing = true ;
            readRow2490( ) ;
            edtProForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLIN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORPRD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCAN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORNRO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLA_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtProForClv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtPrdMaxFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdMaxFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMaxFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            if ( ( nRcdExists_90 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal2490( ) ;
            }
            sendRow2490( ) ;
            bGXsfl_125_Refreshing = false ;
         }
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount90 = (short)(5) ;
         nRcdExists_90 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart2490( ) ;
            while ( RcdFound90 != 0 )
            {
               sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_12590( ) ;
               init_level_properties90( ) ;
               standaloneNotModal2490( ) ;
               getByPrimaryKey2490( ) ;
               standaloneModal2490( ) ;
               addRow2490( ) ;
               scanNext2490( ) ;
            }
            scanEnd2490( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode90 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_12590( ) ;
      initAll2490( ) ;
      init_level_properties90( ) ;
      nRcdExists_90 = (short)(0) ;
      nIsMod_90 = (short)(0) ;
      nRcdDeleted_90 = (short)(0) ;
      nBlankRcdCount90 = (short)(nBlankRcdUsr90+nBlankRcdCount90) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount90 > 0 )
      {
         standaloneNotModal2490( ) ;
         standaloneModal2490( ) ;
         addRow2490( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount90 = (short)(nBlankRcdCount90-1) ;
      }
      Gx_mode = sMode90 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      e13242 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            Z766ProForDsc = httpContext.cgiGet( "Z766ProForDsc") ;
            Z4715ProForDsc2 = httpContext.cgiGet( "Z4715ProForDsc2") ;
            Z771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z771ProForTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( "Z772ProForTmx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z769ProForMat = httpContext.cgiGet( "Z769ProForMat") ;
            Z674PorForFul = localUtil.ctod( httpContext.cgiGet( "Z674PorForFul"), 0) ;
            Z773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( "Z2392ProNumPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z2393ProNumRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3005ProRev = httpContext.cgiGet( "Z3005ProRev") ;
            Z4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( "Z4705ProForPau"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4706ProForRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4864ProForCCi = httpContext.cgiGet( "Z4864ProForCCi") ;
            Z4865ProForDCi = httpContext.cgiGet( "Z4865ProForDCi") ;
            Z5523ProForTip = httpContext.cgiGet( "Z5523ProForTip") ;
            Z6061ProForLab = httpContext.cgiGet( "Z6061ProForLab") ;
            Z8527ProForAbs = localUtil.ctond( httpContext.cgiGet( "Z8527ProForAbs")) ;
            Z8528ProForCos = localUtil.ctond( httpContext.cgiGet( "Z8528ProForCos")) ;
            Z10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "Z10120ProforVl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10547ProH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3589ProForMer = localUtil.ctond( httpContext.cgiGet( "Z3589ProForMer")) ;
            Z13133ProForAct = httpContext.cgiGet( "Z13133ProForAct") ;
            Z13936ProForRs = httpContext.cgiGet( "Z13936ProForRs") ;
            A674PorForFul = localUtil.ctod( httpContext.cgiGet( "Z674PorForFul"), 0) ;
            A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4864ProForCCi = httpContext.cgiGet( "Z4864ProForCCi") ;
            A4865ProForDCi = httpContext.cgiGet( "Z4865ProForDCi") ;
            A10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "Z10120ProforVl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3589ProForMer = localUtil.ctond( httpContext.cgiGet( "Z3589ProForMer")) ;
            A13936ProForRs = httpContext.cgiGet( "Z13936ProForRs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_125 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_125"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A941EmprCodV2 = httpContext.cgiGet( "EMPRCODV2") ;
            A13740ProFDsc = httpContext.cgiGet( "PROFDSC") ;
            A920ProForCodV = httpContext.cgiGet( "PROFORCODV") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV64Exis_pro = (byte)(localUtil.ctol( httpContext.cgiGet( "vEXIS_PRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65Msg1 = httpContext.cgiGet( "vMSG1") ;
            AV83Orient = (byte)(localUtil.ctol( httpContext.cgiGet( "vORIENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A674PorForFul = localUtil.ctod( httpContext.cgiGet( "PORFORFUL"), 0) ;
            A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORULI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4864ProForCCi = httpContext.cgiGet( "PROFORCCI") ;
            A4865ProForDCi = httpContext.cgiGet( "PROFORDCI") ;
            A10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORVL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3589ProForMer = localUtil.ctond( httpContext.cgiGet( "PROFORMER")) ;
            A13936ProForRs = httpContext.cgiGet( "PROFORRS") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV114Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "GXHCFORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORLINV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13750ProForMaxL = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORMAXL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4340PrdUMeFind = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFIND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4340PrdUMeFind = false ;
            A710PrdFind = httpContext.cgiGet( "PRDFIND") ;
            n710PrdFind = false ;
            A702PrdDscFind = httpContext.cgiGet( "PRDDSCFIND") ;
            A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( "PROFORCPO")) ;
            A13178ProForFT = httpContext.cgiGet( "PROFORFT") ;
            AV86oldCant = localUtil.ctond( httpContext.cgiGet( "vOLDCANT")) ;
            AV87Un = (byte)(localUtil.ctol( httpContext.cgiGet( "vUN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV90oldProforlin = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDPROFORLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV85Msg_e = httpContext.cgiGet( "vMSG_E") ;
            AV89Msg_del = httpContext.cgiGet( "vMSG_DEL") ;
            AV61CdpPor = (byte)(localUtil.ctol( httpContext.cgiGet( "vCDPPOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV18Station = httpContext.cgiGet( "vSTATION") ;
            A13111ProForDe2 = httpContext.cgiGet( "PROFORDE2") ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
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
            Dvelop_confirmpanel_anularclaves_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Objectcall") ;
            Dvelop_confirmpanel_anularclaves_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Enabled")) ;
            Dvelop_confirmpanel_anularclaves_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Width") ;
            Dvelop_confirmpanel_anularclaves_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Height") ;
            Dvelop_confirmpanel_anularclaves_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Class") ;
            Dvelop_confirmpanel_anularclaves_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Title") ;
            Dvelop_confirmpanel_anularclaves_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Confirmationtext") ;
            Dvelop_confirmpanel_anularclaves_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Yesbuttoncaption") ;
            Dvelop_confirmpanel_anularclaves_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Nobuttoncaption") ;
            Dvelop_confirmpanel_anularclaves_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_anularclaves_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Yesbuttonposition") ;
            Dvelop_confirmpanel_anularclaves_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Confirmtype") ;
            Dvelop_confirmpanel_anularclaves_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Comment") ;
            Dvelop_confirmpanel_anularclaves_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Bodytype") ;
            Dvelop_confirmpanel_anularclaves_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Bodycontentinternalname") ;
            Dvelop_confirmpanel_anularclaves_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Result") ;
            Dvelop_confirmpanel_anularclaves_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Texttype") ;
            Dvelop_confirmpanel_anularclaves_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARCLAVES_Visible")) ;
            /* Read variables values. */
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
            A13133ProForAct = ((GXutil.strcmp(httpContext.cgiGet( chkProForAct.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
            A5523ProForTip = httpContext.cgiGet( edtProForTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
            cmbProRev.setName( cmbProRev.getInternalname() );
            cmbProRev.setValue( httpContext.cgiGet( cmbProRev.getInternalname()) );
            A3005ProRev = httpContext.cgiGet( cmbProRev.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForTie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A771ProForTie = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
            }
            else
            {
               A771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTMX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForTmx_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A772ProForTmx = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            }
            else
            {
               A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            }
            A769ProForMat = httpContext.cgiGet( edtProForMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORRB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForRb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4706ProForRb = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            else
            {
               A4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            A6061ProForLab = httpContext.cgiGet( edtProForLab_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORABS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForAbs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8527ProForAbs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
            }
            else
            {
               A8527ProForAbs = localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)), DecimalUtil.stringToDec("999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORCOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8528ProForCos = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
            }
            else
            {
               A8528ProForCos = localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProNumPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2392ProNumPro = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            else
            {
               A2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMREC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProNumRec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2393ProNumRec = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
            }
            else
            {
               A2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORPAU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForPau_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4705ProForPau = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            else
            {
               A4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROH2O");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProH2O_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10547ProH2O = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
            }
            else
            {
               A10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPROFOR");
            forbiddenHiddens.add("PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
            forbiddenHiddens.add("ProForCCi", GXutil.rtrim( localUtil.format( A4864ProForCCi, "")));
            forbiddenHiddens.add("ProForDCi", GXutil.rtrim( localUtil.format( A4865ProForDCi, "")));
            forbiddenHiddens.add("ProforVl", localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9"));
            forbiddenHiddens.add("ProForMer", localUtil.format( A3589ProForMer, "ZZ9.99"));
            forbiddenHiddens.add("ProForRs", GXutil.rtrim( localUtil.format( A13936ProForRs, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\tprofor:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ANULARCLAVES.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e14242 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e13242 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e15242 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e16242 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
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
         /* Execute user event: After Trn */
         e15242 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2489( ) ;
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
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtntrn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
      }
      disableAttributes2489( ) ;
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

   public void confirm_2490( )
   {
      s773ProForUli = O773ProForUli ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow2490( ) ;
         if ( ( nRcdExists_90 != 0 ) || ( nIsMod_90 != 0 ) )
         {
            getKey2490( ) ;
            if ( ( nRcdExists_90 == 0 ) && ( nRcdDeleted_90 == 0 ) )
            {
               if ( RcdFound90 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate2490( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable2490( ) ;
                     closeExtendedTableCursors2490( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O773ProForUli = A773ProForUli ;
                     httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound90 != 0 )
               {
                  if ( nRcdDeleted_90 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey2490( ) ;
                     load2490( ) ;
                     beforeValidate2490( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls2490( ) ;
                        O773ProForUli = A773ProForUli ;
                        httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_90 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate2490( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable2490( ) ;
                           closeExtendedTableCursors2490( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O773ProForUli = A773ProForUli ;
                           httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_90 == 0 )
                  {
                     GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd)) ;
         httpContext.changePostValue( edtProForDes_Internalname, GXutil.rtrim( A765ProForDes)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, h490ForPrdUMe) ;
         httpContext.changePostValue( edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCla_Internalname, GXutil.rtrim( A763ProForCla)) ;
         httpContext.changePostValue( edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv)) ;
         httpContext.changePostValue( edtPrdMaxFind_Internalname, GXutil.rtrim( A717PrdMaxFind)) ;
         httpContext.changePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx, GXutil.rtrim( Z765ProForDes)) ;
         httpContext.changePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx, GXutil.rtrim( Z13178ProForFT)) ;
         httpContext.changePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx, GXutil.rtrim( Z770ProForPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( Z763ProForCla)) ;
         httpContext.changePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( Z5358ProForClv)) ;
         httpContext.changePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx, GXutil.rtrim( Z13111ProForDe2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( O763ProForCla)) ;
         httpContext.changePostValue( "T5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( O5358ProForClv)) ;
         httpContext.changePostValue( "T770ProForPrd_"+sGXsfl_125_idx, GXutil.rtrim( O770ProForPrd)) ;
         httpContext.changePostValue( "T765ProForDes_"+sGXsfl_125_idx, GXutil.rtrim( O765ProForDes)) ;
         httpContext.changePostValue( "T1645ProForNro_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3379ProForTnq_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_90 != 0 )
         {
            httpContext.changePostValue( "PROFORLIN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORPRD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCAN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORNRO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O773ProForUli = s773ProForUli ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      /* Start of After( level) rules */
      if ( ! ( A773ProForUli == A13750ProForMaxL ) )
      {
         A773ProForUli = A13750ProForMaxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption240( )
   {
   }

   public void e13242( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tprofor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprofor_impl.this.A396EmprCod = GXv_char2[0] ;
      tprofor_impl.this.AV16EmprNom = GXv_char3[0] ;
      tprofor_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV96EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96EmprCod", AV96EmprCod);
      GXv_int5[0] = AV38FlagPer ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "PERTEX", ""), GXv_int5) ;
      tprofor_impl.this.AV38FlagPer = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38FlagPer", GXutil.str( AV38FlagPer, 1, 0));
      GXv_int5[0] = AV45ObsPrf ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "OBSPRF", ""), GXv_int5) ;
      tprofor_impl.this.AV45ObsPrf = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45ObsPrf", GXutil.str( AV45ObsPrf, 1, 0));
      GXv_int5[0] = AV46FlagLav ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int5) ;
      tprofor_impl.this.AV46FlagLav = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46FlagLav", GXutil.str( AV46FlagLav, 1, 0));
      GXv_int6[0] = AV52ContVal ;
      new app.pbuscon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "PWDPRO", ""), GXv_int6) ;
      tprofor_impl.this.AV52ContVal = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52ContVal), 8, 0));
      GXv_int5[0] = AV53PwdPro ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "PWDPRO", ""), GXv_int5) ;
      tprofor_impl.this.AV53PwdPro = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53PwdPro", GXutil.str( AV53PwdPro, 1, 0));
      GXt_int7 = AV61CdpPor ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "%CDP", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV61CdpPor = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61CdpPor", GXutil.str( AV61CdpPor, 1, 0));
      GXt_int7 = AV71Tecido ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV71Tecido = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Tecido", GXutil.str( AV71Tecido, 1, 0));
      GXt_int7 = AV75Lavado ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "LAVADO", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV75Lavado = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Lavado", GXutil.str( AV75Lavado, 1, 0));
      GXt_int7 = AV70Erfoc ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV70Erfoc = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Erfoc", GXutil.str( AV70Erfoc, 1, 0));
      GXt_int7 = AV73Texfina ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV73Texfina = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Texfina", GXutil.str( AV73Texfina, 1, 0));
      GXt_int7 = AV74Clave2 ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "CLAVE2", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV74Clave2 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Clave2", GXutil.str( AV74Clave2, 1, 0));
      GXt_int7 = AV72NoVisible ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "NOVISC", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV72NoVisible = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72NoVisible", GXutil.str( AV72NoVisible, 1, 0));
      GXt_int7 = AV78Velta ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV78Velta = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Velta", GXutil.str( AV78Velta, 1, 0));
      GXt_int7 = AV80Filasur ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV80Filasur = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Filasur", GXutil.str( AV80Filasur, 1, 0));
      GXt_int7 = AV81Pathter ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "PATHTE", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV81Pathter = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Pathter", GXutil.str( AV81Pathter, 1, 0));
      GXt_int7 = AV94jpf ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "JPF", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV94jpf = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94jpf", GXutil.str( AV94jpf, 1, 0));
      GXt_int7 = AV83Orient ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV83Orient = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83Orient", GXutil.str( AV83Orient, 1, 0));
      GXt_int7 = AV93tintutex ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV93tintutex = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93tintutex", GXutil.str( AV93tintutex, 1, 0));
      GXt_int7 = AV95TiposTecnologias ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "TIETEC", ""), GXv_int5) ;
      tprofor_impl.this.GXt_int7 = GXv_int5[0] ;
      AV95TiposTecnologias = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TiposTecnologias", GXutil.str( AV95TiposTecnologias, 1, 0));
      AV88Fabs = DecimalUtil.doubleToDec(100) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Fabs", GXutil.ltrimstr( AV88Fabs, 6, 2));
      AV115Op = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Op", AV115Op);
      GXt_char1 = AV31msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char4) ;
      tprofor_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31msg0", AV31msg0);
      GXt_char1 = AV65Msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG168_", ""), (byte)(99), GXv_char4) ;
      tprofor_impl.this.GXt_char1 = GXv_char4[0] ;
      AV65Msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Msg1", AV65Msg1);
      AV65Msg1 = GXutil.trim( AV65Msg1) + httpContext.getMessage( " Item Proceso Lab", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Msg1", AV65Msg1);
   }

   public void e15242( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void e14242( )
   {
      /* Dvelop_confirmpanel_anularclaves_Close Routine */
      returnInSub = false ;
      if ( 0 > 1 )
      {
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_anularclaves_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ANULARCLAVES' */
         S112 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(7);
            pr_default.close(5);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DO ACTION ANULARCLAVES' Routine */
      returnInSub = false ;
      GXv_char4[0] = A763ProForCla ;
      new app.panucla(remoteHandle, context).execute( GXv_char4) ;
      tprofor_impl.this.A763ProForCla = GXv_char4[0] ;
      GXv_char4[0] = A5358ProForClv ;
      new app.panucla(remoteHandle, context).execute( GXv_char4) ;
      tprofor_impl.this.A5358ProForClv = GXv_char4[0] ;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void e16242( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem("GlobalEvents.RefrescarObjeto "+AV102ObjetoRefrescar.toJSonString(false));
      if ( ( AV102ObjetoRefrescar.indexof("TPROFOR") > 0 ) && AV103Refrescar )
      {
         callWebObject(formatLink("app.formulaciontinte.tprofor", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV96EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV97ProForCod))}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else if ( AV102ObjetoRefrescar.indexof("TPROFOR_DoClaves") > 0 )
      {
         AV110ProForCla_ProForClv = AV100WebSession.getValue("TPROFOR_DoClaves") ;
         if ( ! (GXutil.strcmp("", AV110ProForCla_ProForClv)==0) && ! ( GXutil.strcmp(AV110ProForCla_ProForClv, "|") == 0 ) )
         {
            AV111Largo = (short)(GXutil.strSearch( AV110ProForCla_ProForClv, "|", 1)) ;
            AV108ProForCla = ((0==AV111Largo) ? AV110ProForCla_ProForClv : GXutil.substring( AV110ProForCla_ProForClv, 1, AV111Largo-1)) ;
            AV109ProForClv = ((0==AV111Largo) ? "" : GXutil.substring( AV110ProForCla_ProForClv, AV111Largo+1, GXutil.len( AV110ProForCla_ProForClv))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109ProForClv", AV109ProForClv);
            new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, AV108ProForCla, AV109ProForClv) ;
            AV100WebSession.remove("TPROFOR_DoClaves");
            callWebObject(formatLink("app.formulaciontinte.tprofor", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV96EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV97ProForCod))}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void zm2489( int GX_JID )
   {
      if ( ( GX_JID == 38 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z766ProForDsc = T002416_A766ProForDsc[0] ;
            Z4715ProForDsc2 = T002416_A4715ProForDsc2[0] ;
            Z771ProForTie = T002416_A771ProForTie[0] ;
            Z772ProForTmx = T002416_A772ProForTmx[0] ;
            Z769ProForMat = T002416_A769ProForMat[0] ;
            Z674PorForFul = T002416_A674PorForFul[0] ;
            Z773ProForUli = T002416_A773ProForUli[0] ;
            Z2392ProNumPro = T002416_A2392ProNumPro[0] ;
            Z2393ProNumRec = T002416_A2393ProNumRec[0] ;
            Z3005ProRev = T002416_A3005ProRev[0] ;
            Z4705ProForPau = T002416_A4705ProForPau[0] ;
            Z4706ProForRb = T002416_A4706ProForRb[0] ;
            Z4864ProForCCi = T002416_A4864ProForCCi[0] ;
            Z4865ProForDCi = T002416_A4865ProForDCi[0] ;
            Z5523ProForTip = T002416_A5523ProForTip[0] ;
            Z6061ProForLab = T002416_A6061ProForLab[0] ;
            Z8527ProForAbs = T002416_A8527ProForAbs[0] ;
            Z8528ProForCos = T002416_A8528ProForCos[0] ;
            Z10120ProforVl = T002416_A10120ProforVl[0] ;
            Z10547ProH2O = T002416_A10547ProH2O[0] ;
            Z3589ProForMer = T002416_A3589ProForMer[0] ;
            Z13133ProForAct = T002416_A13133ProForAct[0] ;
            Z13936ProForRs = T002416_A13936ProForRs[0] ;
         }
         else
         {
            Z766ProForDsc = A766ProForDsc ;
            Z4715ProForDsc2 = A4715ProForDsc2 ;
            Z771ProForTie = A771ProForTie ;
            Z772ProForTmx = A772ProForTmx ;
            Z769ProForMat = A769ProForMat ;
            Z674PorForFul = A674PorForFul ;
            Z773ProForUli = A773ProForUli ;
            Z2392ProNumPro = A2392ProNumPro ;
            Z2393ProNumRec = A2393ProNumRec ;
            Z3005ProRev = A3005ProRev ;
            Z4705ProForPau = A4705ProForPau ;
            Z4706ProForRb = A4706ProForRb ;
            Z4864ProForCCi = A4864ProForCCi ;
            Z4865ProForDCi = A4865ProForDCi ;
            Z5523ProForTip = A5523ProForTip ;
            Z6061ProForLab = A6061ProForLab ;
            Z8527ProForAbs = A8527ProForAbs ;
            Z8528ProForCos = A8528ProForCos ;
            Z10120ProforVl = A10120ProforVl ;
            Z10547ProH2O = A10547ProH2O ;
            Z3589ProForMer = A3589ProForMer ;
            Z13133ProForAct = A13133ProForAct ;
            Z13936ProForRs = A13936ProForRs ;
         }
      }
      if ( GX_JID == -38 )
      {
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
         Z771ProForTie = A771ProForTie ;
         Z772ProForTmx = A772ProForTmx ;
         Z769ProForMat = A769ProForMat ;
         Z674PorForFul = A674PorForFul ;
         Z773ProForUli = A773ProForUli ;
         Z2392ProNumPro = A2392ProNumPro ;
         Z2393ProNumRec = A2393ProNumRec ;
         Z3005ProRev = A3005ProRev ;
         Z4705ProForPau = A4705ProForPau ;
         Z4706ProForRb = A4706ProForRb ;
         Z4864ProForCCi = A4864ProForCCi ;
         Z4865ProForDCi = A4865ProForDCi ;
         Z5523ProForTip = A5523ProForTip ;
         Z6061ProForLab = A6061ProForLab ;
         Z8527ProForAbs = A8527ProForAbs ;
         Z8528ProForCos = A8528ProForCos ;
         Z10120ProforVl = A10120ProforVl ;
         Z10547ProH2O = A10547ProH2O ;
         Z3589ProForMer = A3589ProForMer ;
         Z13133ProForAct = A13133ProForAct ;
         Z13936ProForRs = A13936ProForRs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV114Pgmname = "FormulacionTinte.TPROFOR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T002417 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T002417_A407EmprNom[0] ;
      n407EmprNom = T002417_n407EmprNom[0] ;
      pr_default.close(8);
      A941EmprCodV2 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A13133ProForAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A13133ProForAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      }
      if ( isIns( )  && (GXutil.strcmp("", A3005ProRev)==0) && ( Gx_BScreen == 0 ) )
      {
         A3005ProRev = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
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
      }
   }

   public void load2489( )
   {
      /* Using cursor T002418 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A766ProForDsc = T002418_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T002418_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A771ProForTie = T002418_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T002418_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T002418_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         A674PorForFul = T002418_A674PorForFul[0] ;
         A773ProForUli = T002418_A773ProForUli[0] ;
         A407EmprNom = T002418_A407EmprNom[0] ;
         n407EmprNom = T002418_n407EmprNom[0] ;
         A2392ProNumPro = T002418_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A2393ProNumRec = T002418_A2393ProNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
         A3005ProRev = T002418_A3005ProRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
         A4705ProForPau = T002418_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A4706ProForRb = T002418_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A4864ProForCCi = T002418_A4864ProForCCi[0] ;
         A4865ProForDCi = T002418_A4865ProForDCi[0] ;
         A5523ProForTip = T002418_A5523ProForTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
         A6061ProForLab = T002418_A6061ProForLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         A8527ProForAbs = T002418_A8527ProForAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
         A8528ProForCos = T002418_A8528ProForCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
         A10120ProforVl = T002418_A10120ProforVl[0] ;
         A10547ProH2O = T002418_A10547ProH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
         A3589ProForMer = T002418_A3589ProForMer[0] ;
         A13133ProForAct = T002418_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         A13936ProForRs = T002418_A13936ProForRs[0] ;
         zm2489( -38) ;
      }
      pr_default.close(9);
      onLoadActions2489( ) ;
   }

   public void onLoadActions2489( )
   {
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
      {
         A6061ProForLab = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      }
   }

   public void checkExtendedTable2489( )
   {
      nIsDirty_89 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_89 = (short)(1) ;
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      nIsDirty_89 = (short)(1) ;
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      if ( (GXutil.strcmp("", A764ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem("Código de proceso nulo", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A772ProForTmx == 0 ) && ( AV83Orient == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("No se ha introducido Temperatura¡¡¡", 1, "PROFORTMX");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForTmx_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3005ProRev, "S") == 0 ) || ( GXutil.strcmp(A3005ProRev, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Revision", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROREV");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbProRev.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A4706ProForRb) && true /* After */ && ( AV46FlagLav == 1 ) )
      {
         httpContext.GX_msglist.addItem("Atencion. No se ha entrado lao Relación de Baño", 0, "PROFORRB");
      }
      if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_89 = (short)(1) ;
         A6061ProForLab = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      }
   }

   public void closeExtendedTableCursors2489( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2489( )
   {
      /* Using cursor T002419 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      else
      {
         RcdFound89 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002416 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T002416_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2489( 38) ;
         RcdFound89 = (short)(1) ;
         A764ProForCod = T002416_A764ProForCod[0] ;
         n764ProForCod = T002416_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A766ProForDsc = T002416_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T002416_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A771ProForTie = T002416_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T002416_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T002416_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         A674PorForFul = T002416_A674PorForFul[0] ;
         A773ProForUli = T002416_A773ProForUli[0] ;
         A2392ProNumPro = T002416_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A2393ProNumRec = T002416_A2393ProNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
         A3005ProRev = T002416_A3005ProRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
         A4705ProForPau = T002416_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A4706ProForRb = T002416_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A4864ProForCCi = T002416_A4864ProForCCi[0] ;
         A4865ProForDCi = T002416_A4865ProForDCi[0] ;
         A5523ProForTip = T002416_A5523ProForTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
         A6061ProForLab = T002416_A6061ProForLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         A8527ProForAbs = T002416_A8527ProForAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
         A8528ProForCos = T002416_A8528ProForCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
         A10120ProforVl = T002416_A10120ProforVl[0] ;
         A10547ProH2O = T002416_A10547ProH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
         A3589ProForMer = T002416_A3589ProForMer[0] ;
         A13133ProForAct = T002416_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         A13936ProForRs = T002416_A13936ProForRs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load2489( ) ;
         if ( AnyError == 1 )
         {
            RcdFound89 = (short)(0) ;
            initializeNonKey2489( ) ;
         }
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound89 = (short)(0) ;
         initializeNonKey2489( ) ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey2489( ) ;
      if ( RcdFound89 == 0 )
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
      RcdFound89 = (short)(0) ;
      /* Using cursor T002420 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T002420_A764ProForCod[0], A764ProForCod) < 0 ) ) && ( GXutil.strcmp(T002420_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T002420_A764ProForCod[0], A764ProForCod) > 0 ) ) && ( GXutil.strcmp(T002420_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A764ProForCod = T002420_A764ProForCod[0] ;
            n764ProForCod = T002420_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T002421 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T002421_A764ProForCod[0], A764ProForCod) > 0 ) ) && ( GXutil.strcmp(T002421_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T002421_A764ProForCod[0], A764ProForCod) < 0 ) ) && ( GXutil.strcmp(T002421_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A764ProForCod = T002421_A764ProForCod[0] ;
            n764ProForCod = T002421_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2489( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A773ProForUli = O773ProForUli ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2489( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound89 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               A764ProForCod = Z764ProForCod ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PROFORCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A773ProForUli = O773ProForUli ;
               httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A773ProForUli = O773ProForUli ;
               httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
               update2489( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A773ProForUli = O773ProForUli ;
               httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2489( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PROFORCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  A773ProForUli = O773ProForUli ;
                  httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2489( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
      {
         A764ProForCod = Z764ProForCod ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A773ProForUli = O773ProForUli ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProForCod_Internalname ;
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

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart2489( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2489( ) ;
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
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
      scanStart2489( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound89 != 0 )
         {
            scanNext2489( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2489( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency2489( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002415 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z766ProForDsc, T002415_A766ProForDsc[0]) != 0 ) || ( GXutil.strcmp(Z4715ProForDsc2, T002415_A4715ProForDsc2[0]) != 0 ) || ( Z771ProForTie != T002415_A771ProForTie[0] ) || ( Z772ProForTmx != T002415_A772ProForTmx[0] ) || ( GXutil.strcmp(Z769ProForMat, T002415_A769ProForMat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T002415_A674PorForFul[0])) ) || ( Z773ProForUli != T002415_A773ProForUli[0] ) || ( Z2392ProNumPro != T002415_A2392ProNumPro[0] ) || ( Z2393ProNumRec != T002415_A2393ProNumRec[0] ) || ( GXutil.strcmp(Z3005ProRev, T002415_A3005ProRev[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4705ProForPau != T002415_A4705ProForPau[0] ) || ( Z4706ProForRb != T002415_A4706ProForRb[0] ) || ( GXutil.strcmp(Z4864ProForCCi, T002415_A4864ProForCCi[0]) != 0 ) || ( GXutil.strcmp(Z4865ProForDCi, T002415_A4865ProForDCi[0]) != 0 ) || ( GXutil.strcmp(Z5523ProForTip, T002415_A5523ProForTip[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6061ProForLab, T002415_A6061ProForLab[0]) != 0 ) || ( DecimalUtil.compareTo(Z8527ProForAbs, T002415_A8527ProForAbs[0]) != 0 ) || ( DecimalUtil.compareTo(Z8528ProForCos, T002415_A8528ProForCos[0]) != 0 ) || ( Z10120ProforVl != T002415_A10120ProforVl[0] ) || ( Z10547ProH2O != T002415_A10547ProH2O[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3589ProForMer, T002415_A3589ProForMer[0]) != 0 ) || ( GXutil.strcmp(Z13133ProForAct, T002415_A13133ProForAct[0]) != 0 ) || ( GXutil.strcmp(Z13936ProForRs, T002415_A13936ProForRs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z766ProForDsc, T002415_A766ProForDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForDsc");
               GXutil.writeLogRaw("Old: ",Z766ProForDsc);
               GXutil.writeLogRaw("Current: ",T002415_A766ProForDsc[0]);
            }
            if ( GXutil.strcmp(Z4715ProForDsc2, T002415_A4715ProForDsc2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForDsc2");
               GXutil.writeLogRaw("Old: ",Z4715ProForDsc2);
               GXutil.writeLogRaw("Current: ",T002415_A4715ProForDsc2[0]);
            }
            if ( Z771ProForTie != T002415_A771ProForTie[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForTie");
               GXutil.writeLogRaw("Old: ",Z771ProForTie);
               GXutil.writeLogRaw("Current: ",T002415_A771ProForTie[0]);
            }
            if ( Z772ProForTmx != T002415_A772ProForTmx[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForTmx");
               GXutil.writeLogRaw("Old: ",Z772ProForTmx);
               GXutil.writeLogRaw("Current: ",T002415_A772ProForTmx[0]);
            }
            if ( GXutil.strcmp(Z769ProForMat, T002415_A769ProForMat[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForMat");
               GXutil.writeLogRaw("Old: ",Z769ProForMat);
               GXutil.writeLogRaw("Current: ",T002415_A769ProForMat[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T002415_A674PorForFul[0])) ) )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"PorForFul");
               GXutil.writeLogRaw("Old: ",Z674PorForFul);
               GXutil.writeLogRaw("Current: ",T002415_A674PorForFul[0]);
            }
            if ( Z773ProForUli != T002415_A773ProForUli[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForUli");
               GXutil.writeLogRaw("Old: ",Z773ProForUli);
               GXutil.writeLogRaw("Current: ",T002415_A773ProForUli[0]);
            }
            if ( Z2392ProNumPro != T002415_A2392ProNumPro[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProNumPro");
               GXutil.writeLogRaw("Old: ",Z2392ProNumPro);
               GXutil.writeLogRaw("Current: ",T002415_A2392ProNumPro[0]);
            }
            if ( Z2393ProNumRec != T002415_A2393ProNumRec[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProNumRec");
               GXutil.writeLogRaw("Old: ",Z2393ProNumRec);
               GXutil.writeLogRaw("Current: ",T002415_A2393ProNumRec[0]);
            }
            if ( GXutil.strcmp(Z3005ProRev, T002415_A3005ProRev[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProRev");
               GXutil.writeLogRaw("Old: ",Z3005ProRev);
               GXutil.writeLogRaw("Current: ",T002415_A3005ProRev[0]);
            }
            if ( Z4705ProForPau != T002415_A4705ProForPau[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForPau");
               GXutil.writeLogRaw("Old: ",Z4705ProForPau);
               GXutil.writeLogRaw("Current: ",T002415_A4705ProForPau[0]);
            }
            if ( Z4706ProForRb != T002415_A4706ProForRb[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForRb");
               GXutil.writeLogRaw("Old: ",Z4706ProForRb);
               GXutil.writeLogRaw("Current: ",T002415_A4706ProForRb[0]);
            }
            if ( GXutil.strcmp(Z4864ProForCCi, T002415_A4864ProForCCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForCCi");
               GXutil.writeLogRaw("Old: ",Z4864ProForCCi);
               GXutil.writeLogRaw("Current: ",T002415_A4864ProForCCi[0]);
            }
            if ( GXutil.strcmp(Z4865ProForDCi, T002415_A4865ProForDCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForDCi");
               GXutil.writeLogRaw("Old: ",Z4865ProForDCi);
               GXutil.writeLogRaw("Current: ",T002415_A4865ProForDCi[0]);
            }
            if ( GXutil.strcmp(Z5523ProForTip, T002415_A5523ProForTip[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForTip");
               GXutil.writeLogRaw("Old: ",Z5523ProForTip);
               GXutil.writeLogRaw("Current: ",T002415_A5523ProForTip[0]);
            }
            if ( GXutil.strcmp(Z6061ProForLab, T002415_A6061ProForLab[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForLab");
               GXutil.writeLogRaw("Old: ",Z6061ProForLab);
               GXutil.writeLogRaw("Current: ",T002415_A6061ProForLab[0]);
            }
            if ( DecimalUtil.compareTo(Z8527ProForAbs, T002415_A8527ProForAbs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForAbs");
               GXutil.writeLogRaw("Old: ",Z8527ProForAbs);
               GXutil.writeLogRaw("Current: ",T002415_A8527ProForAbs[0]);
            }
            if ( DecimalUtil.compareTo(Z8528ProForCos, T002415_A8528ProForCos[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForCos");
               GXutil.writeLogRaw("Old: ",Z8528ProForCos);
               GXutil.writeLogRaw("Current: ",T002415_A8528ProForCos[0]);
            }
            if ( Z10120ProforVl != T002415_A10120ProforVl[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProforVl");
               GXutil.writeLogRaw("Old: ",Z10120ProforVl);
               GXutil.writeLogRaw("Current: ",T002415_A10120ProforVl[0]);
            }
            if ( Z10547ProH2O != T002415_A10547ProH2O[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProH2O");
               GXutil.writeLogRaw("Old: ",Z10547ProH2O);
               GXutil.writeLogRaw("Current: ",T002415_A10547ProH2O[0]);
            }
            if ( DecimalUtil.compareTo(Z3589ProForMer, T002415_A3589ProForMer[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForMer");
               GXutil.writeLogRaw("Old: ",Z3589ProForMer);
               GXutil.writeLogRaw("Current: ",T002415_A3589ProForMer[0]);
            }
            if ( GXutil.strcmp(Z13133ProForAct, T002415_A13133ProForAct[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForAct");
               GXutil.writeLogRaw("Old: ",Z13133ProForAct);
               GXutil.writeLogRaw("Current: ",T002415_A13133ProForAct[0]);
            }
            if ( GXutil.strcmp(Z13936ProForRs, T002415_A13936ProForRs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForRs");
               GXutil.writeLogRaw("Old: ",Z13936ProForRs);
               GXutil.writeLogRaw("Current: ",T002415_A13936ProForRs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2489( )
   {
      beforeValidate2489( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2489( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2489( 0) ;
         checkOptimisticConcurrency2489( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2489( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2489( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002422 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A766ProForDsc, A4715ProForDsc2, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4864ProForCCi, A4865ProForDCi, A5523ProForTip, A6061ProForLab, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13133ProForAct, A13936ProForRs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
                        processLevel2489( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption240( ) ;
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
            load2489( ) ;
         }
         endLevel2489( ) ;
      }
      closeExtendedTableCursors2489( ) ;
   }

   public void update2489( )
   {
      beforeValidate2489( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2489( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2489( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2489( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2489( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002423 */
                  pr_default.execute(14, new Object[] {A766ProForDsc, A4715ProForDsc2, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4864ProForCCi, A4865ProForDCi, A5523ProForTip, A6061ProForLab, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13133ProForAct, A13936ProForRs, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2489( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel2489( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption240( ) ;
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
         endLevel2489( ) ;
      }
      closeExtendedTableCursors2489( ) ;
   }

   public void deferredUpdate2489( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2489( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2489( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2489( ) ;
         afterConfirm2489( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2489( ) ;
            if ( AnyError == 0 )
            {
               A773ProForUli = O773ProForUli ;
               httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
               scanStart2490( ) ;
               while ( RcdFound90 != 0 )
               {
                  getByPrimaryKey2490( ) ;
                  delete2490( ) ;
                  scanNext2490( ) ;
                  O773ProForUli = A773ProForUli ;
                  httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
               }
               scanEnd2490( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002424 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound89 == 0 )
                        {
                           initAll2489( ) ;
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
                        resetCaption240( ) ;
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
      sMode89 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2489( ) ;
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2489( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A920ProForCodV = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
         A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002425 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T002426 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T002427 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T002428 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T002429 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T002430 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T002431 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T002432 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PQPRGNO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T002433 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T002434 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T002435 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T002436 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T002437 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T002438 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")+" ("+httpContext.getMessage( "PQuimicos", "")+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T002439 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T002440 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T002441 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T002442 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas de Formulación por Fase", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T002443 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T002444 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T002445 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T002446 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T002447 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
      }
   }

   public void processNestedLevel2490( )
   {
      s773ProForUli = O773ProForUli ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow2490( ) ;
         if ( ( nRcdExists_90 != 0 ) || ( nIsMod_90 != 0 ) )
         {
            standaloneNotModal2490( ) ;
            getKey2490( ) ;
            if ( ( nRcdExists_90 == 0 ) && ( nRcdDeleted_90 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert2490( ) ;
            }
            else
            {
               if ( RcdFound90 != 0 )
               {
                  if ( ( nRcdDeleted_90 != 0 ) && ( nRcdExists_90 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete2490( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_90 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update2490( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_90 == 0 )
                  {
                     GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O773ProForUli = A773ProForUli ;
            httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
         }
         httpContext.changePostValue( edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd)) ;
         httpContext.changePostValue( edtProForDes_Internalname, GXutil.rtrim( A765ProForDes)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, h490ForPrdUMe) ;
         httpContext.changePostValue( edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCla_Internalname, GXutil.rtrim( A763ProForCla)) ;
         httpContext.changePostValue( edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv)) ;
         httpContext.changePostValue( edtPrdMaxFind_Internalname, GXutil.rtrim( A717PrdMaxFind)) ;
         httpContext.changePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx, GXutil.rtrim( Z765ProForDes)) ;
         httpContext.changePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx, GXutil.rtrim( Z13178ProForFT)) ;
         httpContext.changePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx, GXutil.rtrim( Z770ProForPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( Z763ProForCla)) ;
         httpContext.changePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( Z5358ProForClv)) ;
         httpContext.changePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx, GXutil.rtrim( Z13111ProForDe2)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T762ProForCan_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T767ProForLin_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T490ForPrdUMe_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T763ProForCla_"+sGXsfl_125_idx, GXutil.rtrim( O763ProForCla)) ;
         httpContext.changePostValue( "T5358ProForClv_"+sGXsfl_125_idx, GXutil.rtrim( O5358ProForClv)) ;
         httpContext.changePostValue( "T770ProForPrd_"+sGXsfl_125_idx, GXutil.rtrim( O770ProForPrd)) ;
         httpContext.changePostValue( "T765ProForDes_"+sGXsfl_125_idx, GXutil.rtrim( O765ProForDes)) ;
         httpContext.changePostValue( "T1645ProForNro_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3379ProForTnq_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_90_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N6062ProForCPo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_90 != 0 )
         {
            httpContext.changePostValue( "PROFORLIN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORPRD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCAN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORNRO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      if ( ! ( A773ProForUli == A13750ProForMaxL ) )
      {
         A773ProForUli = A13750ProForMaxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      }
      /* End of After( level) rules */
      initAll2490( ) ;
      if ( AnyError != 0 )
      {
         O773ProForUli = s773ProForUli ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      }
      nRcdExists_90 = (short)(0) ;
      nIsMod_90 = (short)(0) ;
      nRcdDeleted_90 = (short)(0) ;
   }

   public void processLevel2489( )
   {
      /* Save parent mode. */
      sMode89 = Gx_mode ;
      processNestedLevel2490( ) ;
      if ( AnyError != 0 )
      {
         O773ProForUli = s773ProForUli ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T002448 */
      pr_default.execute(39, new Object[] {Short.valueOf(A773ProForUli), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
   }

   public void endLevel2489( )
   {
      pr_default.close(6);
      if ( AnyError == 0 )
      {
         beforeComplete2489( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.tprofor");
         if ( AnyError == 0 )
         {
            confirmValues240( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.tprofor");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2489( )
   {
      /* Scan By routine */
      /* Using cursor T002449 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A764ProForCod = T002449_A764ProForCod[0] ;
         n764ProForCod = T002449_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2489( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A764ProForCod = T002449_A764ProForCod[0] ;
         n764ProForCod = T002449_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
   }

   public void scanEnd2489( )
   {
      pr_default.close(40);
   }

   public void afterConfirm2489( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6061ProForLab ;
         GXv_int5[0] = AV64Exis_pro ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         tprofor_impl.this.A396EmprCod = GXv_char4[0] ;
         tprofor_impl.this.A6061ProForLab = GXv_char3[0] ;
         tprofor_impl.this.AV64Exis_pro = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         httpContext.ajax_rsp_assign_attri("", false, "AV64Exis_pro", GXutil.str( AV64Exis_pro, 1, 0));
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) && ( AV64Exis_pro == 0 ) && ( GXutil.strcmp(A764ProForCod, A6061ProForLab) != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV65Msg1, 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert2489( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2489( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2489( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2489( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2489( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2489( )
   {
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), true);
      chkProForAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProForAct.getEnabled(), 5, 0), true);
      edtProForTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTip_Enabled), 5, 0), true);
      cmbProRev.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Enabled", GXutil.ltrimstr( cmbProRev.getEnabled(), 5, 0), true);
      edtProForTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTie_Enabled), 5, 0), true);
      edtProForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), true);
      edtProForMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Enabled), 5, 0), true);
      edtProForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRb_Enabled), 5, 0), true);
      edtProForLab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLab_Enabled), 5, 0), true);
      edtProForAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Enabled), 5, 0), true);
      edtProForCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Enabled), 5, 0), true);
      edtProNumPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumPro_Enabled), 5, 0), true);
      edtProNumRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumRec_Enabled), 5, 0), true);
      edtProForPau_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Enabled), 5, 0), true);
      edtProH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Enabled), 5, 0), true);
   }

   public void zm2490( int GX_JID )
   {
      if ( ( GX_JID == 40 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z765ProForDes = T00243_A765ProForDes[0] ;
            Z6062ProForCPo = T00243_A6062ProForCPo[0] ;
            Z13178ProForFT = T00243_A13178ProForFT[0] ;
            Z770ProForPrd = T00243_A770ProForPrd[0] ;
            Z762ProForCan = T00243_A762ProForCan[0] ;
            Z763ProForCla = T00243_A763ProForCla[0] ;
            Z1645ProForNro = T00243_A1645ProForNro[0] ;
            Z3379ProForTnq = T00243_A3379ProForTnq[0] ;
            Z5358ProForClv = T00243_A5358ProForClv[0] ;
            Z13111ProForDe2 = T00243_A13111ProForDe2[0] ;
            Z490ForPrdUMe = T00243_A490ForPrdUMe[0] ;
         }
         else
         {
            Z765ProForDes = A765ProForDes ;
            Z6062ProForCPo = A6062ProForCPo ;
            Z13178ProForFT = A13178ProForFT ;
            Z770ProForPrd = A770ProForPrd ;
            Z762ProForCan = A762ProForCan ;
            Z763ProForCla = A763ProForCla ;
            Z1645ProForNro = A1645ProForNro ;
            Z3379ProForTnq = A3379ProForTnq ;
            Z5358ProForClv = A5358ProForClv ;
            Z13111ProForDe2 = A13111ProForDe2 ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -40 )
      {
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         Z765ProForDes = A765ProForDes ;
         Z6062ProForCPo = A6062ProForCPo ;
         Z13178ProForFT = A13178ProForFT ;
         Z770ProForPrd = A770ProForPrd ;
         Z762ProForCan = A762ProForCan ;
         Z763ProForCla = A763ProForCla ;
         Z1645ProForNro = A1645ProForNro ;
         Z3379ProForTnq = A3379ProForTnq ;
         Z5358ProForClv = A5358ProForClv ;
         Z13111ProForDe2 = A13111ProForDe2 ;
         Z396EmprCod = A396EmprCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z710PrdFind = A710PrdFind ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal2490( )
   {
   }

   public void standaloneModal2490( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6062ProForCPo)==0) && ( Gx_BScreen == 0 ) )
      {
         A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      }
      if ( isIns( )  && (GXutil.strcmp("", A13178ProForFT)==0) && ( Gx_BScreen == 0 ) )
      {
         A13178ProForFT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
      else
      {
         edtProForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
   }

   public void load2490( )
   {
      /* Using cursor T002450 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A765ProForDes = T002450_A765ProForDes[0] ;
         A6062ProForCPo = T002450_A6062ProForCPo[0] ;
         A13178ProForFT = T002450_A13178ProForFT[0] ;
         A770ProForPrd = T002450_A770ProForPrd[0] ;
         A488ForPrdDsc = T002450_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T002450_n488ForPrdDsc[0] ;
         A762ProForCan = T002450_A762ProForCan[0] ;
         A763ProForCla = T002450_A763ProForCla[0] ;
         A1645ProForNro = T002450_A1645ProForNro[0] ;
         A3379ProForTnq = T002450_A3379ProForTnq[0] ;
         A5358ProForClv = T002450_A5358ProForClv[0] ;
         A13111ProForDe2 = T002450_A13111ProForDe2[0] ;
         A490ForPrdUMe = T002450_A490ForPrdUMe[0] ;
         A710PrdFind = T002450_A710PrdFind[0] ;
         n710PrdFind = T002450_n710PrdFind[0] ;
         zm2490( -40) ;
      }
      pr_default.close(41);
      onLoadActions2490( ) ;
   }

   public void onLoadActions2490( )
   {
      AV86oldCant = O762ProForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86oldCant", GXutil.ltrimstr( AV86oldCant, 12, 5));
      /* Using cursor T002451 */
      pr_default.execute(42, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      h490ForPrdUMe = "" ;
      while ( (pr_default.getStatus(42) != 101) )
      {
         h490ForPrdUMe = T002451_A13746ForPrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(42);
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
   }

   public void checkExtendedTable2490( )
   {
      nIsDirty_90 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal2490( ) ;
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         nIsDirty_90 = (short)(1) ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T002452 */
         pr_default.execute(43, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A396EmprCod = T002452_A396EmprCod[0] ;
         A490ForPrdUMe = T002452_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T002452_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(43) == 101) ) )
         {
            pr_default.readNext(43);
            if ( ! ( (pr_default.getStatus(43) == 101) ) )
            {
               GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(43);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         nIsDirty_90 = (short)(1) ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T002453 */
         pr_default.execute(44, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A490ForPrdUMe = T002453_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T002453_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(44) == 101) ) )
         {
            pr_default.readNext(44);
            if ( ! ( (pr_default.getStatus(44) == 101) ) )
            {
               GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(44);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T002413 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T002413_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T002413_n488ForPrdDsc[0] ;
      pr_default.close(4);
      /* Using cursor T002414 */
      pr_default.execute(5, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A710PrdFind = T002414_A710PrdFind[0] ;
         n710PrdFind = T002414_n710PrdFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      }
      pr_default.close(5);
      if ( (0==A767ProForLin) && isIns( )  && ( ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) ) || ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) ) || ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") == 0 ) && (GXutil.strcmp("", A770ProForPrd)==0) && true /* After */ ) || ( (0==A767ProForLin) && (GXutil.strcmp("", A770ProForPrd)==0) && ! (GXutil.strcmp("", A765ProForDes)==0) && true /* After */ ) || true /* After */ ) )
      {
         nIsDirty_90 = (short)(1) ;
         GXt_int8 = A767ProForLin ;
         GXv_int9[0] = GXt_int8 ;
         new app.pnumlin(remoteHandle, context).execute( A13750ProForMaxL, (short)(100), (short)(4), O767ProForLin, GXv_int9) ;
         tprofor_impl.this.GXt_int8 = GXv_int9[0] ;
         A767ProForLin = (short)(GXt_int8) ;
      }
      /* Using cursor T00246 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4340PrdUMeFind = T00246_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T00246_n4340PrdUMeFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      pr_default.close(2);
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
      {
         nIsDirty_90 = (short)(1) ;
         A490ForPrdUMe = A4340PrdUMeFind ;
         /* Using cursor T002454 */
         pr_default.execute(45, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         h490ForPrdUMe = "" ;
         while ( (pr_default.getStatus(45) != 101) )
         {
            h490ForPrdUMe = T002454_A13746ForPrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(45);
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      nIsDirty_90 = (short)(1) ;
      A768ProForLinV = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      /* Using cursor T002412 */
      pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A717PrdMaxFind = T002412_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T002412_n717PrdMaxFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      pr_default.close(3);
      AV90oldProforlin = O767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90oldProforlin), 4, 0));
      AV89Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Msg_del", AV89Msg_del);
      if ( A767ProForLin == 9999 )
      {
         GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem("Se ha alcanzado el número de líneas máximo", 0, GXCCtl);
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV87Un = O490ForPrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Un", GXutil.str( AV87Un, 1, 0));
      if ( (GXutil.strcmp("", A770ProForPrd)==0) && (GXutil.strcmp("", A765ProForDes)==0) && ( GXutil.strcmp(GXutil.trim( A770ProForPrd), "") == 0 ) && ( GXutil.strcmp(GXutil.trim( A765ProForDes), "") == 0 ) && true /* After */ )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem("Se requiere que indique un Proceso ó una Descripción, por favor registrar", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV86oldCant = O762ProForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86oldCant", GXutil.ltrimstr( AV86oldCant, 12, 5));
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV85Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV86oldCant, 12, 5) + GXutil.trim( GXutil.str( AV87Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Msg_e", AV85Msg_e);
      }
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV85Msg_e, 99999999, (byte)(0), "@") ;
      }
      if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isIns( )  )
      {
         new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
      }
      if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isUpd( )  && ( ! ( GXutil.strcmp(A770ProForPrd, O770ProForPrd) == 0 ) || ! ( GXutil.strcmp(A765ProForDes, O765ProForDes) == 0 ) || ! ( A490ForPrdUMe == O490ForPrdUMe ) || ! ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) == 0 ) || ! ( A1645ProForNro == O1645ProForNro ) || ! ( A3379ProForTnq == O3379ProForTnq ) ) )
      {
         new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
      }
   }

   public void closeExtendedTableCursors2490( )
   {
      pr_default.close(5);
   }

   public void enableDisable2490( )
   {
   }

   public void gxload_44( String A396EmprCod ,
                          String A770ProForPrd )
   {
      /* Using cursor T002455 */
      pr_default.execute(46, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(46) != 101) )
      {
         A710PrdFind = T002455_A710PrdFind[0] ;
         n710PrdFind = T002455_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A710PrdFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(46) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(46);
   }

   public void getKey2490( )
   {
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T002456 */
         pr_default.execute(47, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A396EmprCod = T002456_A396EmprCod[0] ;
         A490ForPrdUMe = T002456_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T002456_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(47) == 101) ) )
         {
            pr_default.readNext(47);
            if ( ! ( (pr_default.getStatus(47) == 101) ) )
            {
               GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(47);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T002457 */
      pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound90 = (short)(1) ;
      }
      else
      {
         RcdFound90 = (short)(0) ;
      }
      pr_default.close(48);
   }

   public void getByPrimaryKey2490( )
   {
      /* Using cursor T00243 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00243_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2490( 40) ;
         RcdFound90 = (short)(1) ;
         initializeNonKey2490( ) ;
         A767ProForLin = T00243_A767ProForLin[0] ;
         A765ProForDes = T00243_A765ProForDes[0] ;
         A6062ProForCPo = T00243_A6062ProForCPo[0] ;
         A13178ProForFT = T00243_A13178ProForFT[0] ;
         A770ProForPrd = T00243_A770ProForPrd[0] ;
         A762ProForCan = T00243_A762ProForCan[0] ;
         A763ProForCla = T00243_A763ProForCla[0] ;
         A1645ProForNro = T00243_A1645ProForNro[0] ;
         A3379ProForTnq = T00243_A3379ProForTnq[0] ;
         A5358ProForClv = T00243_A5358ProForClv[0] ;
         A13111ProForDe2 = T00243_A13111ProForDe2[0] ;
         A490ForPrdUMe = T00243_A490ForPrdUMe[0] ;
         O762ProForCan = A762ProForCan ;
         O767ProForLin = A767ProForLin ;
         O490ForPrdUMe = A490ForPrdUMe ;
         O763ProForCla = A763ProForCla ;
         O5358ProForClv = A5358ProForClv ;
         O770ProForPrd = A770ProForPrd ;
         O765ProForDes = A765ProForDes ;
         O1645ProForNro = A1645ProForNro ;
         O3379ProForTnq = A3379ProForTnq ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2490( ) ;
         load2490( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound90 = (short)(0) ;
         initializeNonKey2490( ) ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2490( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes2490( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency2490( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
         {
            A490ForPrdUMe = (byte)(0) ;
         }
         else
         {
            A13746ForPrdCDsc = h490ForPrdUMe ;
            /* Using cursor T002458 */
            pr_default.execute(49, new Object[] {A13746ForPrdCDsc, A396EmprCod});
            A396EmprCod = T002458_A396EmprCod[0] ;
            A490ForPrdUMe = T002458_A490ForPrdUMe[0] ;
            A490ForPrdUMe = T002458_A490ForPrdUMe[0] ;
            if ( ! ( (pr_default.getStatus(49) == 101) ) )
            {
               pr_default.readNext(49);
               if ( ! ( (pr_default.getStatus(49) == 101) ) )
               {
                  GXCCtl = "FORPRDUME_" + sGXsfl_125_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtForPrdUMe_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(49);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T00242 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z765ProForDes, T00242_A765ProForDes[0]) != 0 ) || ( DecimalUtil.compareTo(Z6062ProForCPo, T00242_A6062ProForCPo[0]) != 0 ) || ( GXutil.strcmp(Z13178ProForFT, T00242_A13178ProForFT[0]) != 0 ) || ( GXutil.strcmp(Z770ProForPrd, T00242_A770ProForPrd[0]) != 0 ) || ( DecimalUtil.compareTo(Z762ProForCan, T00242_A762ProForCan[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z763ProForCla, T00242_A763ProForCla[0]) != 0 ) || ( Z1645ProForNro != T00242_A1645ProForNro[0] ) || ( Z3379ProForTnq != T00242_A3379ProForTnq[0] ) || ( GXutil.strcmp(Z5358ProForClv, T00242_A5358ProForClv[0]) != 0 ) || ( GXutil.strcmp(Z13111ProForDe2, T00242_A13111ProForDe2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T00242_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z765ProForDes, T00242_A765ProForDes[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForDes");
               GXutil.writeLogRaw("Old: ",Z765ProForDes);
               GXutil.writeLogRaw("Current: ",T00242_A765ProForDes[0]);
            }
            if ( DecimalUtil.compareTo(Z6062ProForCPo, T00242_A6062ProForCPo[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForCPo");
               GXutil.writeLogRaw("Old: ",Z6062ProForCPo);
               GXutil.writeLogRaw("Current: ",T00242_A6062ProForCPo[0]);
            }
            if ( GXutil.strcmp(Z13178ProForFT, T00242_A13178ProForFT[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForFT");
               GXutil.writeLogRaw("Old: ",Z13178ProForFT);
               GXutil.writeLogRaw("Current: ",T00242_A13178ProForFT[0]);
            }
            if ( GXutil.strcmp(Z770ProForPrd, T00242_A770ProForPrd[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForPrd");
               GXutil.writeLogRaw("Old: ",Z770ProForPrd);
               GXutil.writeLogRaw("Current: ",T00242_A770ProForPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z762ProForCan, T00242_A762ProForCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForCan");
               GXutil.writeLogRaw("Old: ",Z762ProForCan);
               GXutil.writeLogRaw("Current: ",T00242_A762ProForCan[0]);
            }
            if ( GXutil.strcmp(Z763ProForCla, T00242_A763ProForCla[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForCla");
               GXutil.writeLogRaw("Old: ",Z763ProForCla);
               GXutil.writeLogRaw("Current: ",T00242_A763ProForCla[0]);
            }
            if ( Z1645ProForNro != T00242_A1645ProForNro[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForNro");
               GXutil.writeLogRaw("Old: ",Z1645ProForNro);
               GXutil.writeLogRaw("Current: ",T00242_A1645ProForNro[0]);
            }
            if ( Z3379ProForTnq != T00242_A3379ProForTnq[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForTnq");
               GXutil.writeLogRaw("Old: ",Z3379ProForTnq);
               GXutil.writeLogRaw("Current: ",T00242_A3379ProForTnq[0]);
            }
            if ( GXutil.strcmp(Z5358ProForClv, T00242_A5358ProForClv[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForClv");
               GXutil.writeLogRaw("Old: ",Z5358ProForClv);
               GXutil.writeLogRaw("Current: ",T00242_A5358ProForClv[0]);
            }
            if ( GXutil.strcmp(Z13111ProForDe2, T00242_A13111ProForDe2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ProForDe2");
               GXutil.writeLogRaw("Old: ",Z13111ProForDe2);
               GXutil.writeLogRaw("Current: ",T00242_A13111ProForDe2[0]);
            }
            if ( Z490ForPrdUMe != T00242_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.tprofor:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T00242_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2490( )
   {
      beforeValidate2490( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2490( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2490( 0) ;
         checkOptimisticConcurrency2490( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2490( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2490( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002459 */
                  pr_default.execute(50, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin), A765ProForDes, A6062ProForCPo, A13178ProForFT, A770ProForPrd, A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A13111ProForDe2, A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                  if ( (pr_default.getStatus(50) == 1) )
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
            load2490( ) ;
         }
         endLevel2490( ) ;
      }
      closeExtendedTableCursors2490( ) ;
   }

   public void update2490( )
   {
      beforeValidate2490( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2490( ) ;
      }
      if ( ( nIsMod_90 != 0 ) || ( nIsDirty_90 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency2490( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm2490( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate2490( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T002460 */
                     pr_default.execute(51, new Object[] {A765ProForDes, A6062ProForCPo, A13178ProForFT, A770ProForPrd, A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A13111ProForDe2, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                     if ( (pr_default.getStatus(51) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate2490( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey2490( ) ;
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
            endLevel2490( ) ;
         }
      }
      closeExtendedTableCursors2490( ) ;
   }

   public void deferredUpdate2490( )
   {
   }

   public void delete2490( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2490( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2490( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2490( ) ;
         afterConfirm2490( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2490( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002461 */
               pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
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
      sMode90 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2490( ) ;
      Gx_mode = sMode90 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2490( )
   {
      standaloneModal2490( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isIns( )  )
         {
            new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
         }
         if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isUpd( )  && ( ! ( GXutil.strcmp(A770ProForPrd, O770ProForPrd) == 0 ) || ! ( GXutil.strcmp(A765ProForDes, O765ProForDes) == 0 ) || ! ( A490ForPrdUMe == O490ForPrdUMe ) || ! ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) == 0 ) || ! ( A1645ProForNro == O1645ProForNro ) || ! ( A3379ProForTnq == O3379ProForTnq ) ) )
         {
            new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
         }
         A768ProForLinV = A767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         /* Using cursor T002412 */
         pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A717PrdMaxFind = T002412_A717PrdMaxFind[0] ;
            n717PrdMaxFind = T002412_n717PrdMaxFind[0] ;
         }
         else
         {
            A717PrdMaxFind = "" ;
            n717PrdMaxFind = false ;
         }
         pr_default.close(3);
         AV90oldProforlin = O767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90oldProforlin), 4, 0));
         /* Using cursor T002462 */
         pr_default.execute(53, new Object[] {A396EmprCod, A770ProForPrd});
         if ( (pr_default.getStatus(53) != 101) )
         {
            A710PrdFind = T002462_A710PrdFind[0] ;
            n710PrdFind = T002462_n710PrdFind[0] ;
         }
         else
         {
            A710PrdFind = "xxxxxx" ;
            n710PrdFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
         }
         pr_default.close(53);
         /* Using cursor T00246 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A4340PrdUMeFind = T00246_A4340PrdUMeFind[0] ;
            n4340PrdUMeFind = T00246_n4340PrdUMeFind[0] ;
         }
         else
         {
            A4340PrdUMeFind = (byte)(0) ;
            n4340PrdUMeFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
         }
         pr_default.close(2);
         /* Using cursor T002413 */
         pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T002413_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T002413_n488ForPrdDsc[0] ;
         pr_default.close(4);
         AV87Un = O490ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87Un", GXutil.str( AV87Un, 1, 0));
         AV86oldCant = O762ProForCan ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86oldCant", GXutil.ltrimstr( AV86oldCant, 12, 5));
         AV89Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Msg_del", AV89Msg_del);
         if ( isDlt( )  && true /* Level */ )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV89Msg_del, A767ProForLin, (byte)(0), "@") ;
         }
         if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
         {
            AV85Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV86oldCant, 12, 5) + GXutil.trim( GXutil.str( AV87Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85Msg_e", AV85Msg_e);
         }
      }
   }

   public void endLevel2490( )
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

   public void scanStart2490( )
   {
      /* Scan By routine */
      /* Using cursor T002463 */
      pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(54) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A767ProForLin = T002463_A767ProForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2490( )
   {
      /* Scan next routine */
      pr_default.readNext(54);
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(54) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A767ProForLin = T002463_A767ProForLin[0] ;
      }
   }

   public void scanEnd2490( )
   {
      pr_default.close(54);
   }

   public void afterConfirm2490( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ )
      {
         AV85Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " IN Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Msg_e", AV85Msg_e);
      }
      if ( isIns( )  && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV85Msg_e, A767ProForLin, (byte)(0), "@") ;
      }
      if ( ! ( A773ProForUli == A13750ProForMaxL ) )
      {
         A773ProForUli = A13750ProForMaxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      }
   }

   public void beforeInsert2490( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2490( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2490( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2490( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2490( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2490( )
   {
      edtProForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtPrdMaxFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMaxFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMaxFind_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void send_integrity_lvl_hashes2490( )
   {
   }

   public void send_integrity_lvl_hashes2489( )
   {
   }

   public void subsflControlProps_12590( )
   {
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_125_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_125_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_125_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_125_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_125_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_125_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_125_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_125_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_125_idx ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND_"+sGXsfl_125_idx ;
   }

   public void subsflControlProps_fel_12590( )
   {
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_125_fel_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_125_fel_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_125_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_125_fel_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_125_fel_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_125_fel_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_125_fel_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_125_fel_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_125_fel_idx ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND_"+sGXsfl_125_fel_idx ;
   }

   public void addRow2490( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12590( ) ;
      sendRow2490( ) ;
   }

   public void sendRow2490( )
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
         if ( ((int)((nGXsfl_125_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForPrd_Internalname,GXutil.rtrim( A770ProForPrd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForPrd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDes_Internalname,GXutil.rtrim( A765ProForDes),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForDes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,h490ForPrdUMe,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForCan_Enabled!=0) ? localUtil.format( A762ProForCan, "ZZZZZ9.9999") : localUtil.format( A762ProForCan, "ZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForNro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForTnq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCla_Internalname,GXutil.rtrim( A763ProForCla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForClv_Internalname,GXutil.rtrim( A5358ProForClv),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForClv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForClv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdMaxFind_Internalname,GXutil.rtrim( A717PrdMaxFind),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdMaxFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdMaxFind_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes2490( ) ;
      GXCCtl = "GXHCFORPRDUME_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z767ProForLin_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z765ProForDes_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z765ProForDes));
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13178ProForFT));
      GXCCtl = "Z770ProForPrd_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z770ProForPrd));
      GXCCtl = "Z762ProForCan_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z763ProForCla_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z763ProForCla));
      GXCCtl = "Z1645ProForNro_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3379ProForTnq_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5358ProForClv_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5358ProForClv));
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13111ProForDe2));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O762ProForCan_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O767ProForLin_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O490ForPrdUMe_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O763ProForCla_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O763ProForCla));
      GXCCtl = "O5358ProForClv_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O5358ProForClv));
      GXCCtl = "O770ProForPrd_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O770ProForPrd));
      GXCCtl = "O765ProForDes_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O765ProForDes));
      GXCCtl = "O1645ProForNro_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3379ProForTnq_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PROFORLINV_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PROFORCPO_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_90_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_90_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_90_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N6062ProForCPo_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vREFRESCAR_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, GXCCtl, AV103Refrescar);
      GXCCtl = "vOBJETOREFRESCAR_" + sGXsfl_125_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV102ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV102ObjetoRefrescar);
      }
      GXCCtl = "vMODE_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV96EmprCod));
      GXCCtl = "vPROFORCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV97ProForCod));
      GXCCtl = "vPROFORCLV_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV109ProForClv));
      GXCCtl = "EMPRCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "PROFORFT_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLIN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORPRD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCAN_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORNRO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORTNQ_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLA_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLV_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow2490( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12590( ) ;
      edtProForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLIN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORPRD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCAN_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORNRO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTNQ_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLA_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForClv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdMaxFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDMAXFIND_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORLIN_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForLin_Internalname ;
         wbErr = true ;
         A767ProForLin = (short)(0) ;
      }
      else
      {
         A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
      A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
      h490ForPrdUMe = httpContext.cgiGet( edtForPrdUMe_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PROFORCAN_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCan_Internalname ;
         wbErr = true ;
         A762ProForCan = DecimalUtil.ZERO ;
      }
      else
      {
         A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PROFORNRO_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForNro_Internalname ;
         wbErr = true ;
         A1645ProForNro = (byte)(0) ;
      }
      else
      {
         A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PROFORTNQ_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForTnq_Internalname ;
         wbErr = true ;
         A3379ProForTnq = (byte)(0) ;
      }
      else
      {
         A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
      A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
      A717PrdMaxFind = httpContext.cgiGet( edtPrdMaxFind_Internalname) ;
      n717PrdMaxFind = false ;
      GXCCtl = "GXHCFORPRDUME_" + sGXsfl_125_idx ;
      A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z767ProForLin_" + sGXsfl_125_idx ;
      Z767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z765ProForDes_" + sGXsfl_125_idx ;
      Z765ProForDes = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_125_idx ;
      Z6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
      Z13178ProForFT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z770ProForPrd_" + sGXsfl_125_idx ;
      Z770ProForPrd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z762ProForCan_" + sGXsfl_125_idx ;
      Z762ProForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z763ProForCla_" + sGXsfl_125_idx ;
      Z763ProForCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1645ProForNro_" + sGXsfl_125_idx ;
      Z1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3379ProForTnq_" + sGXsfl_125_idx ;
      Z3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5358ProForClv_" + sGXsfl_125_idx ;
      Z5358ProForClv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
      Z13111ProForDe2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_125_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_125_idx ;
      A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13178ProForFT_" + sGXsfl_125_idx ;
      A13178ProForFT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_125_idx ;
      A13111ProForDe2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O762ProForCan_" + sGXsfl_125_idx ;
      O762ProForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O767ProForLin_" + sGXsfl_125_idx ;
      O767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O490ForPrdUMe_" + sGXsfl_125_idx ;
      O490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O763ProForCla_" + sGXsfl_125_idx ;
      O763ProForCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O5358ProForClv_" + sGXsfl_125_idx ;
      O5358ProForClv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O770ProForPrd_" + sGXsfl_125_idx ;
      O770ProForPrd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O765ProForDes_" + sGXsfl_125_idx ;
      O765ProForDes = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1645ProForNro_" + sGXsfl_125_idx ;
      O1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O3379ProForTnq_" + sGXsfl_125_idx ;
      O3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PROFORLINV_" + sGXsfl_125_idx ;
      A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PROFORCPO_" + sGXsfl_125_idx ;
      A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_90_" + sGXsfl_125_idx ;
      nRcdDeleted_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_90_" + sGXsfl_125_idx ;
      nRcdExists_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_90_" + sGXsfl_125_idx ;
      nIsMod_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N6062ProForCPo_" + sGXsfl_125_idx ;
      N6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "PROFORFT_" + sGXsfl_125_idx ;
      A13178ProForFT = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtProForLin_Enabled = edtProForLin_Enabled ;
   }

   public void confirmValues240( )
   {
      nGXsfl_125_idx = 0 ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12590( ) ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12590( ) ;
         httpContext.changePostValue( "Z767ProForLin_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z765ProForDes_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z6062ProForCPo_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z13178ProForFT_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z770ProForPrd_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z762ProForCan_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z763ProForCla_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z1645ProForNro_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z3379ProForTnq_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z5358ProForClv_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z13111ProForDe2_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_125_idx) ;
      }
      httpContext.changePostValue( "O762ProForCan", httpContext.cgiGet( "T762ProForCan")) ;
      httpContext.deletePostValue( "T762ProForCan") ;
      httpContext.changePostValue( "O767ProForLin", httpContext.cgiGet( "T767ProForLin")) ;
      httpContext.deletePostValue( "T767ProForLin") ;
      httpContext.changePostValue( "O490ForPrdUMe", httpContext.cgiGet( "T490ForPrdUMe")) ;
      httpContext.deletePostValue( "T490ForPrdUMe") ;
      httpContext.changePostValue( "O763ProForCla", httpContext.cgiGet( "T763ProForCla")) ;
      httpContext.deletePostValue( "T763ProForCla") ;
      httpContext.changePostValue( "O5358ProForClv", httpContext.cgiGet( "T5358ProForClv")) ;
      httpContext.deletePostValue( "T5358ProForClv") ;
      httpContext.changePostValue( "O770ProForPrd", httpContext.cgiGet( "T770ProForPrd")) ;
      httpContext.deletePostValue( "T770ProForPrd") ;
      httpContext.changePostValue( "O765ProForDes", httpContext.cgiGet( "T765ProForDes")) ;
      httpContext.deletePostValue( "T765ProForDes") ;
      httpContext.changePostValue( "O1645ProForNro", httpContext.cgiGet( "T1645ProForNro")) ;
      httpContext.deletePostValue( "T1645ProForNro") ;
      httpContext.changePostValue( "O3379ProForTnq", httpContext.cgiGet( "T3379ProForTnq")) ;
      httpContext.deletePostValue( "T3379ProForTnq") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.tprofor", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPROFOR");
      forbiddenHiddens.add("PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      forbiddenHiddens.add("ProForCCi", GXutil.rtrim( localUtil.format( A4864ProForCCi, "")));
      forbiddenHiddens.add("ProForDCi", GXutil.rtrim( localUtil.format( A4865ProForDCi, "")));
      forbiddenHiddens.add("ProforVl", localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9"));
      forbiddenHiddens.add("ProForMer", localUtil.format( A3589ProForMer, "ZZ9.99"));
      forbiddenHiddens.add("ProForRs", GXutil.rtrim( localUtil.format( A13936ProForRs, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\tprofor:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z771ProForTie", GXutil.ltrim( localUtil.ntoc( Z771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z772ProForTmx", GXutil.ltrim( localUtil.ntoc( Z772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z769ProForMat", GXutil.rtrim( Z769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z674PorForFul", localUtil.dtoc( Z674PorForFul, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z773ProForUli", GXutil.ltrim( localUtil.ntoc( Z773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2393ProNumRec", GXutil.ltrim( localUtil.ntoc( Z2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3005ProRev", GXutil.rtrim( Z3005ProRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4864ProForCCi", GXutil.rtrim( Z4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4865ProForDCi", GXutil.rtrim( Z4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5523ProForTip", GXutil.rtrim( Z5523ProForTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6061ProForLab", GXutil.rtrim( Z6061ProForLab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8527ProForAbs", GXutil.ltrim( localUtil.ntoc( Z8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8528ProForCos", GXutil.ltrim( localUtil.ntoc( Z8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10120ProforVl", GXutil.ltrim( localUtil.ntoc( Z10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10547ProH2O", GXutil.ltrim( localUtil.ntoc( Z10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3589ProForMer", GXutil.ltrim( localUtil.ntoc( Z3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13133ProForAct", GXutil.rtrim( Z13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13936ProForRs", GXutil.rtrim( Z13936ProForRs));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_125", GXutil.ltrim( localUtil.ntoc( nGXsfl_125_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCAR", AV103Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV102ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV102ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV96EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORCOD", GXutil.rtrim( AV97ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORCLV", GXutil.rtrim( AV109ProForClv));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCODV2", GXutil.rtrim( A941EmprCodV2));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFDSC", A13740ProFDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCODV", GXutil.rtrim( A920ProForCodV));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXIS_PRO", GXutil.ltrim( localUtil.ntoc( AV64Exis_pro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV65Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "vORIENT", GXutil.ltrim( localUtil.ntoc( AV83Orient, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PORFORFUL", localUtil.dtoc( A674PorForFul, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORULI", GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCCI", GXutil.rtrim( A4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDCI", GXutil.rtrim( A4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORVL", GXutil.ltrim( localUtil.ntoc( A10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMER", GXutil.ltrim( localUtil.ntoc( A3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORRS", GXutil.rtrim( A13936ProForRs));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV114Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCFORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLINV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMAXL", GXutil.ltrim( localUtil.ntoc( A13750ProForMaxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFIND", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIND", GXutil.rtrim( A710PrdFind));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDDSCFIND", GXutil.rtrim( A702PrdDscFind));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCPO", GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORFT", GXutil.rtrim( A13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCANT", GXutil.ltrim( localUtil.ntoc( AV86oldCant, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUN", GXutil.ltrim( localUtil.ntoc( AV87Un, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPROFORLIN", GXutil.ltrim( localUtil.ntoc( AV90oldProforlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_E", AV85Msg_e);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_DEL", GXutil.rtrim( AV89Msg_del));
      app.GxWebStd.gx_hidden_field( httpContext, "vCDPPOR", GXutil.ltrim( localUtil.ntoc( AV61CdpPor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV18Station));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDE2", GXutil.rtrim( A13111ProForDe2));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Enabled", GXutil.booltostr( Dvelop_confirmpanel_anularclaves_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Title", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARCLAVES_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_anularclaves_Confirmtype));
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
      return formatLink("app.formulaciontinte.tprofor", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.TPROFOR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO PROCESOS FORMULA", "") ;
   }

   public void initializeNonKey2489( )
   {
      AV64Exis_pro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Exis_pro", GXutil.str( AV64Exis_pro, 1, 0));
      A920ProForCodV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      A13740ProFDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      A771ProForTie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
      A772ProForTmx = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A769ProForMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
      A674PorForFul = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      A773ProForUli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      A2392ProNumPro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
      A2393ProNumRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
      A4705ProForPau = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
      A4706ProForRb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
      A4864ProForCCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", A4864ProForCCi);
      A4865ProForDCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", A4865ProForDCi);
      A5523ProForTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
      A8527ProForAbs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
      A8528ProForCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
      A10120ProforVl = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
      A10547ProH2O = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
      A3589ProForMer = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
      A13750ProForMaxL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13750ProForMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13750ProForMaxL), 4, 0));
      A13936ProForRs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
      A3005ProRev = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      A6061ProForLab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      A13133ProForAct = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z771ProForTie = (short)(0) ;
      Z772ProForTmx = (short)(0) ;
      Z769ProForMat = "" ;
      Z674PorForFul = GXutil.nullDate() ;
      Z773ProForUli = (short)(0) ;
      Z2392ProNumPro = 0 ;
      Z2393ProNumRec = 0 ;
      Z3005ProRev = "" ;
      Z4705ProForPau = (short)(0) ;
      Z4706ProForRb = (short)(0) ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z5523ProForTip = "" ;
      Z6061ProForLab = "" ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z10120ProforVl = 0 ;
      Z10547ProH2O = (short)(0) ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13133ProForAct = "" ;
      Z13936ProForRs = "" ;
   }

   public void initAll2489( )
   {
      A764ProForCod = "" ;
      n764ProForCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      initializeNonKey2489( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13133ProForAct = i13133ProForAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      A3005ProRev = i3005ProRev ;
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
   }

   public void initializeNonKey2490( )
   {
      h490ForPrdUMe = "" ;
      A765ProForDes = "" ;
      AV86oldCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86oldCant", GXutil.ltrimstr( AV86oldCant, 12, 5));
      AV87Un = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Un", GXutil.str( AV87Un, 1, 0));
      AV90oldProforlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90oldProforlin), 4, 0));
      AV85Msg_e = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Msg_e", AV85Msg_e);
      AV89Msg_del = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Msg_del", AV89Msg_del);
      A710PrdFind = "" ;
      n710PrdFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      A4340PrdUMeFind = (byte)(0) ;
      n4340PrdUMeFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      A717PrdMaxFind = "" ;
      n717PrdMaxFind = false ;
      A768ProForLinV = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      A702PrdDscFind = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A702PrdDscFind", A702PrdDscFind);
      A770ProForPrd = "" ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A1645ProForNro = (byte)(0) ;
      A3379ProForTnq = (byte)(0) ;
      A5358ProForClv = "" ;
      A13111ProForDe2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", A13111ProForDe2);
      A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      A13178ProForFT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      O762ProForCan = A762ProForCan ;
      O490ForPrdUMe = A490ForPrdUMe ;
      O763ProForCla = A763ProForCla ;
      O5358ProForClv = A5358ProForClv ;
      O770ProForPrd = A770ProForPrd ;
      O765ProForDes = A765ProForDes ;
      O1645ProForNro = A1645ProForNro ;
      O3379ProForTnq = A3379ProForTnq ;
      Z765ProForDes = "" ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      Z770ProForPrd = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z763ProForCla = "" ;
      Z1645ProForNro = (byte)(0) ;
      Z3379ProForTnq = (byte)(0) ;
      Z5358ProForClv = "" ;
      Z13111ProForDe2 = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll2490( )
   {
      A767ProForLin = (short)(0) ;
      initializeNonKey2490( ) ;
   }

   public void standaloneModalInsert2490( )
   {
      A6062ProForCPo = i6062ProForCPo ;
      httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      A13178ProForFT = i13178ProForFT ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511340", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/tprofor.js", "?20268241511341", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties90( )
   {
      edtProForLin_Enabled = defedtProForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void startgridcontrol125( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A770ProForPrd));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A765ProForDes));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", h490ForPrdUMe);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A763ProForCla));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5358ProForClv));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A717PrdMaxFind));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdMaxFind_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForDsc2_Internalname = "PROFORDSC2" ;
      chkProForAct.setInternalname( "PROFORACT" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtProForTip_Internalname = "PROFORTIP" ;
      cmbProRev.setInternalname( "PROREV" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtProForTie_Internalname = "PROFORTIE" ;
      edtProForTmx_Internalname = "PROFORTMX" ;
      edtProForMat_Internalname = "PROFORMAT" ;
      edtProForRb_Internalname = "PROFORRB" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtProForLab_Internalname = "PROFORLAB" ;
      edtProForAbs_Internalname = "PROFORABS" ;
      divProforabs_cell_Internalname = "PROFORABS_CELL" ;
      edtProForCos_Internalname = "PROFORCOS" ;
      divProforcos_cell_Internalname = "PROFORCOS_CELL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtProNumPro_Internalname = "PRONUMPRO" ;
      edtProNumRec_Internalname = "PRONUMREC" ;
      edtProForPau_Internalname = "PROFORPAU" ;
      divProforpau_cell_Internalname = "PROFORPAU_CELL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtProH2O_Internalname = "PROH2O" ;
      divProh2o_cell_Internalname = "PROH2O_CELL" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnclaves_Internalname = "BTNCLAVES" ;
      bttBtnanularclaves_Internalname = "BTNANULARCLAVES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtProForLin_Internalname = "PROFORLIN" ;
      edtProForPrd_Internalname = "PROFORPRD" ;
      edtProForDes_Internalname = "PROFORDES" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtProForCan_Internalname = "PROFORCAN" ;
      edtProForNro_Internalname = "PROFORNRO" ;
      edtProForTnq_Internalname = "PROFORTNQ" ;
      edtProForCla_Internalname = "PROFORCLA" ;
      edtProForClv_Internalname = "PROFORCLV" ;
      edtPrdMaxFind_Internalname = "PRDMAXFIND" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_anularclaves_Internalname = "DVELOP_CONFIRMPANEL_ANULARCLAVES" ;
      tblTabledvelop_confirmpanel_anularclaves_Internalname = "TABLEDVELOP_CONFIRMPANEL_ANULARCLAVES" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO PROCESOS FORMULA", "") );
      edtPrdMaxFind_Jsonclick = "" ;
      edtProForClv_Jsonclick = "" ;
      edtProForCla_Jsonclick = "" ;
      edtProForTnq_Jsonclick = "" ;
      edtProForNro_Jsonclick = "" ;
      edtProForCan_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtProForDes_Jsonclick = "" ;
      edtProForPrd_Jsonclick = "" ;
      edtProForLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtPrdMaxFind_Enabled = 0 ;
      edtProForClv_Enabled = 1 ;
      edtProForCla_Enabled = 1 ;
      edtProForTnq_Enabled = 1 ;
      edtProForNro_Enabled = 1 ;
      edtProForCan_Enabled = 1 ;
      edtForPrdUMe_Enabled = 1 ;
      edtProForDes_Enabled = 1 ;
      edtProForPrd_Enabled = 1 ;
      edtProForLin_Enabled = 1 ;
      Dvelop_confirmpanel_anularclaves_Confirmtype = "1" ;
      Dvelop_confirmpanel_anularclaves_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_anularclaves_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_anularclaves_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_anularclaves_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_anularclaves_Confirmationtext = "¿Desea anular las Claves?" ;
      Dvelop_confirmpanel_anularclaves_Title = "" ;
      bttBtntrn_delete_Enabled = 1 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      bttBtnanularclaves_Visible = 1 ;
      bttBtnclaves_Visible = 1 ;
      edtProH2O_Jsonclick = "" ;
      edtProH2O_Enabled = 1 ;
      edtProForPau_Jsonclick = "" ;
      edtProForPau_Enabled = 1 ;
      edtProNumRec_Jsonclick = "" ;
      edtProNumRec_Enabled = 1 ;
      edtProNumPro_Jsonclick = "" ;
      edtProNumPro_Enabled = 1 ;
      edtProForCos_Jsonclick = "" ;
      edtProForCos_Enabled = 1 ;
      edtProForAbs_Jsonclick = "" ;
      edtProForAbs_Enabled = 1 ;
      edtProForLab_Jsonclick = "" ;
      edtProForLab_Enabled = 1 ;
      edtProForRb_Jsonclick = "" ;
      edtProForRb_Enabled = 1 ;
      edtProForMat_Jsonclick = "" ;
      edtProForMat_Enabled = 1 ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTmx_Enabled = 1 ;
      edtProForTie_Jsonclick = "" ;
      edtProForTie_Enabled = 1 ;
      cmbProRev.setJsonclick( "" );
      cmbProRev.setEnabled( 1 );
      edtProForTip_Jsonclick = "" ;
      edtProForTip_Enabled = 1 ;
      chkProForAct.setEnabled( 1 );
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc2_Enabled = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
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

   public void gxsgaproforprd240( String A396EmprCod ,
                                  String A719PrdNum )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaproforprd_data240( A396EmprCod, A719PrdNum) ;
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

   protected void gxsgaproforprd_data240( String A396EmprCod ,
                                          String A719PrdNum )
   {
      l719PrdNum = GXutil.padr( GXutil.rtrim( A719PrdNum), 6, "%") ;
      /* Using cursor T002464 */
      pr_default.execute(55, new Object[] {A396EmprCod, l719PrdNum});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(55) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T002464_A719PrdNum[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T002464_A719PrdNum[0]));
         pr_default.readNext(55);
      }
      pr_default.close(55);
   }

   public void gxsgaforprdume240( String A396EmprCod ,
                                  String A13746ForPrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaforprdume_data240( A396EmprCod, A13746ForPrdCDsc) ;
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

   protected void gxsgaforprdume_data240( String A396EmprCod ,
                                          String A13746ForPrdCDsc )
   {
      l13746ForPrdCDsc = GXutil.concat( GXutil.rtrim( A13746ForPrdCDsc), "%", "") ;
      /* Using cursor T002465 */
      pr_default.execute(56, new Object[] {A396EmprCod, l13746ForPrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(56) != 101) )
      {
         gxdynajaxctrlcodr.add(T002465_A13746ForPrdCDsc[0]);
         gxdynajaxctrldescr.add(T002465_A13746ForPrdCDsc[0]);
         pr_default.readNext(56);
      }
      pr_default.close(56);
   }

   public void gxhcaforprdume2490( String A396EmprCod ,
                                   String A13746ForPrdCDsc )
   {
      /* Using cursor T002466 */
      pr_default.execute(57, new Object[] {A13746ForPrdCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(57) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13746ForPrdCDsc = T002466_A13746ForPrdCDsc[0] ;
         A396EmprCod = T002466_A396EmprCod[0] ;
         A490ForPrdUMe = T002466_A490ForPrdUMe[0] ;
         pr_default.readNext(57);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(57);
   }

   public void gx15asaproforlin2490( String A770ProForPrd ,
                                     byte A490ForPrdUMe ,
                                     String Gx_mode ,
                                     short A13750ProForMaxL ,
                                     short A767ProForLin )
   {
      if ( (0==A767ProForLin) && isIns( )  && ( ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) ) || ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) ) || ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") == 0 ) && (GXutil.strcmp("", A770ProForPrd)==0) && true /* After */ ) || ( (0==A767ProForLin) && (GXutil.strcmp("", A770ProForPrd)==0) && ! (GXutil.strcmp("", A765ProForDes)==0) && true /* After */ ) || true /* After */ ) )
      {
         GXt_int8 = A767ProForLin ;
         GXv_int9[0] = GXt_int8 ;
         new app.pnumlin(remoteHandle, context).execute( A13750ProForMaxL, (short)(100), (short)(4), O767ProForLin, GXv_int9) ;
         tprofor_impl.this.GXt_int8 = GXv_int9[0] ;
         A767ProForLin = (short)(GXt_int8) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_10_2489( String A396EmprCod ,
                           String A6061ProForLab ,
                           byte AV64Exis_pro )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6061ProForLab ;
         GXv_int5[0] = AV64Exis_pro ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         A396EmprCod = GXv_char4[0] ;
         A6061ProForLab = GXv_char3[0] ;
         AV64Exis_pro = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         httpContext.ajax_rsp_assign_attri("", false, "AV64Exis_pro", GXutil.str( AV64Exis_pro, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6061ProForLab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64Exis_pro, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_2490( String Gx_mode ,
                           String A396EmprCod ,
                           String AV114Pgmname ,
                           String AV17UsurCod ,
                           String AV18Station ,
                           String AV85Msg_e ,
                           short A767ProForLin )
   {
      if ( isIns( )  && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV85Msg_e, A767ProForLin, (byte)(0), "@") ;
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

   public void xc_33_2490( String Gx_mode ,
                           String A396EmprCod ,
                           String AV114Pgmname ,
                           String AV17UsurCod ,
                           String AV18Station ,
                           String AV89Msg_del ,
                           short A767ProForLin )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV89Msg_del, A767ProForLin, (byte)(0), "@") ;
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

   public void xc_34_2490( String Gx_mode ,
                           String A396EmprCod ,
                           String AV114Pgmname ,
                           String AV17UsurCod ,
                           String AV18Station ,
                           String AV85Msg_e ,
                           short A767ProForLin ,
                           java.math.BigDecimal A762ProForCan ,
                           byte A490ForPrdUMe ,
                           String A763ProForCla ,
                           String A5358ProForClv )
   {
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV85Msg_e, 99999999, (byte)(0), "@") ;
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

   public void xc_36_2490( String Gx_mode ,
                           String A396EmprCod ,
                           String A764ProForCod ,
                           short A767ProForLin ,
                           String A770ProForPrd ,
                           String A765ProForDes ,
                           byte A490ForPrdUMe ,
                           java.math.BigDecimal A762ProForCan ,
                           byte A1645ProForNro ,
                           byte A3379ProForTnq ,
                           String A763ProForCla ,
                           String A5358ProForClv )
   {
      if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isIns( )  )
      {
         new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
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

   public void xc_37_2490( String Gx_mode ,
                           String A396EmprCod ,
                           String A764ProForCod ,
                           short A767ProForLin ,
                           String A770ProForPrd ,
                           String A765ProForDes ,
                           byte A490ForPrdUMe ,
                           java.math.BigDecimal A762ProForCan ,
                           byte A1645ProForNro ,
                           byte A3379ProForTnq ,
                           String A763ProForCla ,
                           String A5358ProForClv )
   {
      if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isUpd( )  && ( ! ( GXutil.strcmp(A770ProForPrd, O770ProForPrd) == 0 ) || ! ( GXutil.strcmp(A765ProForDes, O765ProForDes) == 0 ) || ! ( A490ForPrdUMe == O490ForPrdUMe ) || ! ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) == 0 ) || ! ( A1645ProForNro == O1645ProForNro ) || ! ( A3379ProForTnq == O3379ProForTnq ) ) )
      {
         new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
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
      subsflControlProps_12590( ) ;
      while ( nGXsfl_125_idx <= nRC_GXsfl_125 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal2490( ) ;
         standaloneModal2490( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow2490( ) ;
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12590( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      chkProForAct.setName( "PROFORACT" );
      chkProForAct.setWebtags( "" );
      chkProForAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "TitleCaption", chkProForAct.getCaption(), true);
      chkProForAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A13133ProForAct)==0) )
      {
         A13133ProForAct = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      }
      cmbProRev.setName( "PROREV" );
      cmbProRev.setWebtags( "" );
      cmbProRev.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbProRev.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbProRev.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A3005ProRev)==0) )
         {
            A3005ProRev = httpContext.getMessage( "N", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T002467 */
      pr_default.execute(58, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(58) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T002467_A407EmprNom[0] ;
      n407EmprNom = T002467_n407EmprNom[0] ;
      pr_default.close(58);
      GX_FocusControl = edtProForDsc_Internalname ;
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

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      A3005ProRev = cmbProRev.getValue() ;
      cmbProRev.setValue( A3005ProRev );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      A920ProForCodV = A764ProForCod ;
      if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
      {
         A6061ProForLab = A764ProForCod ;
      }
      if ( (GXutil.strcmp("", A764ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem("Código de proceso nulo", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      dynload_actions( ) ;
      if ( cmbProRev.getItemCount() > 0 )
      {
         A3005ProRev = cmbProRev.getValidValue(A3005ProRev) ;
         cmbProRev.setValue( A3005ProRev );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
      }
      A13133ProForAct = ((GXutil.strcmp(GXutil.rtrim( A13133ProForAct), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", GXutil.rtrim( A941EmprCodV2));
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", GXutil.rtrim( A4715ProForDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", GXutil.rtrim( A769ProForMat));
      httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrim( localUtil.ntoc( A2393ProNumRec, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", GXutil.rtrim( A3005ProRev));
      cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
      httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", GXutil.rtrim( A4864ProForCCi));
      httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", GXutil.rtrim( A4865ProForDCi));
      httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", GXutil.rtrim( A5523ProForTip));
      httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrim( localUtil.ntoc( A8527ProForAbs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrim( localUtil.ntoc( A8528ProForCos, (byte)(8), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrim( localUtil.ntoc( A10120ProforVl, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrim( localUtil.ntoc( A10547ProH2O, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrim( localUtil.ntoc( A3589ProForMer, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", GXutil.rtrim( A13133ProForAct));
      httpContext.ajax_rsp_assign_attri("", false, "A13750ProForMaxL", GXutil.ltrim( localUtil.ntoc( A13750ProForMaxL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", GXutil.rtrim( A13936ProForRs));
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", GXutil.rtrim( A920ProForCodV));
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", GXutil.rtrim( A6061ProForLab));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z941EmprCodV2", GXutil.rtrim( Z941EmprCodV2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z771ProForTie", GXutil.ltrim( localUtil.ntoc( Z771ProForTie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z772ProForTmx", GXutil.ltrim( localUtil.ntoc( Z772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z769ProForMat", GXutil.rtrim( Z769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z674PorForFul", localUtil.format(Z674PorForFul, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z773ProForUli", GXutil.ltrim( localUtil.ntoc( Z773ProForUli, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2393ProNumRec", GXutil.ltrim( localUtil.ntoc( Z2393ProNumRec, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3005ProRev", GXutil.rtrim( Z3005ProRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4864ProForCCi", GXutil.rtrim( Z4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4865ProForDCi", GXutil.rtrim( Z4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5523ProForTip", GXutil.rtrim( Z5523ProForTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8527ProForAbs", GXutil.ltrim( localUtil.ntoc( Z8527ProForAbs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8528ProForCos", GXutil.ltrim( localUtil.ntoc( Z8528ProForCos, (byte)(8), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10120ProforVl", GXutil.ltrim( localUtil.ntoc( Z10120ProforVl, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10547ProH2O", GXutil.ltrim( localUtil.ntoc( Z10547ProH2O, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3589ProForMer", GXutil.ltrim( localUtil.ntoc( Z3589ProForMer, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13133ProForAct", GXutil.rtrim( Z13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13750ProForMaxL", GXutil.ltrim( localUtil.ntoc( Z13750ProForMaxL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13936ProForRs", GXutil.rtrim( Z13936ProForRs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13740ProFDsc", Z13740ProFDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z920ProForCodV", GXutil.rtrim( Z920ProForCodV));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6061ProForLab", GXutil.rtrim( Z6061ProForLab));
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforprd( )
   {
      n710PrdFind = false ;
      /* Using cursor T002468 */
      pr_default.execute(59, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(59) != 101) )
      {
         A710PrdFind = T002468_A710PrdFind[0] ;
         n710PrdFind = T002468_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
      }
      pr_default.close(59);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", GXutil.rtrim( A710PrdFind));
   }

   public void valid_Forprdume( )
   {
      n764ProForCod = false ;
      n710PrdFind = false ;
      n4340PrdUMeFind = false ;
      n488ForPrdDsc = false ;
      n717PrdMaxFind = false ;
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T002469 */
         pr_default.execute(60, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A490ForPrdUMe = T002469_A490ForPrdUMe[0] ;
         A490ForPrdUMe = T002469_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(60) == 101) ) )
         {
            pr_default.readNext(60);
            if ( ! ( (pr_default.getStatus(60) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(60);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T002470 */
      pr_default.execute(61, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(61) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T002470_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T002470_n488ForPrdDsc[0] ;
      pr_default.close(61);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( (0==A767ProForLin) && isIns( )  && ( ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) ) || ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) ) || ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") == 0 ) && (GXutil.strcmp("", A770ProForPrd)==0) && true /* After */ ) || ( (0==A767ProForLin) && (GXutil.strcmp("", A770ProForPrd)==0) && ! (GXutil.strcmp("", A765ProForDes)==0) && true /* After */ ) || true /* After */ ) )
      {
         GXt_int8 = A767ProForLin ;
         GXv_int9[0] = GXt_int8 ;
         new app.pnumlin(remoteHandle, context).execute( A13750ProForMaxL, (short)(100), (short)(4), O767ProForLin, GXv_int9) ;
         tprofor_impl.this.GXt_int8 = GXv_int9[0] ;
         A767ProForLin = (short)(GXt_int8) ;
      }
      /* Using cursor T002473 */
      pr_default.execute(62, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(62) != 101) )
      {
         A4340PrdUMeFind = T002473_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T002473_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
      }
      pr_default.close(62);
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
      {
         A490ForPrdUMe = A4340PrdUMeFind ;
         /* Using cursor T002474 */
         pr_default.execute(63, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         h490ForPrdUMe = "" ;
         while ( (pr_default.getStatus(63) != 101) )
         {
            h490ForPrdUMe = T002474_A13746ForPrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(63);
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      A768ProForLinV = A767ProForLin ;
      /* Using cursor T002480 */
      pr_default.execute(64, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(64) != 101) )
      {
         A717PrdMaxFind = T002480_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T002480_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      pr_default.close(64);
      AV90oldProforlin = O767ProForLin ;
      if ( A767ProForLin == 9999 )
      {
         httpContext.GX_msglist.addItem("Se ha alcanzado el número de líneas máximo", 0, "PROFORLIN");
      }
      AV87Un = O490ForPrdUMe ;
      if ( (GXutil.strcmp("", A770ProForPrd)==0) && (GXutil.strcmp("", A765ProForDes)==0) && ( GXutil.strcmp(GXutil.trim( A770ProForPrd), "") == 0 ) && ( GXutil.strcmp(GXutil.trim( A765ProForDes), "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Se requiere que indique un Proceso ó una Descripción, por favor registrar", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", GXutil.rtrim( A717PrdMaxFind));
      httpContext.ajax_rsp_assign_attri("", false, "AV90oldProforlin", GXutil.ltrim( localUtil.ntoc( AV90oldProforlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV87Un", GXutil.ltrim( localUtil.ntoc( AV87Un, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
   }

   public void valid_Proforcan( )
   {
      n764ProForCod = false ;
      AV86oldCant = O762ProForCan ;
      AV89Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      if ( isDlt( )  && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV89Msg_del, A767ProForLin, (byte)(0), "@") ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV86oldCant", GXutil.ltrim( localUtil.ntoc( AV86oldCant, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV89Msg_del", GXutil.rtrim( AV89Msg_del));
   }

   public void valid_Profortnq( )
   {
      n764ProForCod = false ;
      if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isIns( )  )
      {
         new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
      }
      if ( ! (0==A767ProForLin) && ( ! (GXutil.strcmp("", A770ProForPrd)==0) || ! (GXutil.strcmp("", A765ProForDes)==0) ) && true /* After */ && isUpd( )  && ( ! ( GXutil.strcmp(A770ProForPrd, O770ProForPrd) == 0 ) || ! ( GXutil.strcmp(A765ProForDes, O765ProForDes) == 0 ) || ! ( A490ForPrdUMe == O490ForPrdUMe ) || ! ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) == 0 ) || ! ( A1645ProForNro == O1645ProForNro ) || ! ( A3379ProForTnq == O3379ProForTnq ) ) )
      {
         new app.workaroundasignarclaves(remoteHandle, context).execute( A396EmprCod, A764ProForCod, A767ProForLin, A770ProForPrd, A765ProForDes, A490ForPrdUMe, A762ProForCan, A1645ProForNro, A3379ProForTnq, A763ProForCla, A5358ProForClv) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Proforclv( )
   {
      n764ProForCod = false ;
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV85Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV86oldCant, 12, 5) + GXutil.trim( GXutil.str( AV87Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
      }
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV114Pgmname, AV17UsurCod, AV18Station, AV85Msg_e, 99999999, (byte)(0), "@") ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV85Msg_e", AV85Msg_e);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A674PorForFul',fld:'PORFORFUL',pic:''},{av:'A4864ProForCCi',fld:'PROFORCCI',pic:''},{av:'A4865ProForDCi',fld:'PROFORDCI',pic:''},{av:'A10120ProforVl',fld:'PROFORVL',pic:'ZZZZ9'},{av:'A3589ProForMer',fld:'PROFORMER',pic:'ZZ9.99'},{av:'A13936ProForRs',fld:'PROFORRS',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e15242',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("'DOCLAVES'","{handler:'e112489',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("'DOCLAVES'",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("'DOANULARCLAVES'","{handler:'e122489',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("'DOANULARCLAVES'",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANULARCLAVES.CLOSE","{handler:'e14242',iparms:[{av:'Dvelop_confirmpanel_anularclaves_Result',ctrl:'DVELOP_CONFIRMPANEL_ANULARCLAVES',prop:'Result'},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANULARCLAVES.CLOSE",",oparms:[{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e16242',iparms:[{av:'AV103Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV102ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV97ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV109ProForClv',fld:'vPROFORCLV',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A765ProForDes',fld:'PROFORDES',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'A1645ProForNro',fld:'PROFORNRO',pic:'Z9'},{av:'A3379ProForTnq',fld:'PROFORTNQ',pic:'Z9'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[{av:'AV97ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV109ProForClv',fld:'vPROFORCLV',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A13936ProForRs',fld:'PROFORRS',pic:''},{av:'A3589ProForMer',fld:'PROFORMER',pic:'ZZ9.99'},{av:'A10120ProforVl',fld:'PROFORVL',pic:'ZZZZ9'},{av:'A4865ProForDCi',fld:'PROFORDCI',pic:''},{av:'A4864ProForCCi',fld:'PROFORCCI',pic:''},{av:'A674PorForFul',fld:'PORFORFUL',pic:''},{av:'A6062ProForCPo',fld:'PROFORCPO',pic:'ZZ9.99'},{av:'AV65Msg1',fld:'vMSG1',pic:''},{av:'AV61CdpPor',fld:'vCDPPOR',pic:'9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'cmbProRev'},{av:'A3005ProRev',fld:'PROREV',pic:'@!'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''},{av:'A771ProForTie',fld:'PROFORTIE',pic:'ZZZ9'},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'A769ProForMat',fld:'PROFORMAT',pic:''},{av:'A674PorForFul',fld:'PORFORFUL',pic:''},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2392ProNumPro',fld:'PRONUMPRO',pic:'ZZZZ9'},{av:'A2393ProNumRec',fld:'PRONUMREC',pic:'ZZZZ9'},{av:'cmbProRev'},{av:'A3005ProRev',fld:'PROREV',pic:'@!'},{av:'A4705ProForPau',fld:'PROFORPAU',pic:'ZZZ9'},{av:'A4706ProForRb',fld:'PROFORRB',pic:'ZZZ9'},{av:'A4864ProForCCi',fld:'PROFORCCI',pic:''},{av:'A4865ProForDCi',fld:'PROFORDCI',pic:''},{av:'A5523ProForTip',fld:'PROFORTIP',pic:''},{av:'A8527ProForAbs',fld:'PROFORABS',pic:'ZZ9.99'},{av:'A8528ProForCos',fld:'PROFORCOS',pic:'ZZ9.9999'},{av:'A10120ProforVl',fld:'PROFORVL',pic:'ZZZZ9'},{av:'A10547ProH2O',fld:'PROH2O',pic:'ZZZ9'},{av:'A3589ProForMer',fld:'PROFORMER',pic:'ZZ9.99'},{av:'A13750ProForMaxL',fld:'PROFORMAXL',pic:'ZZZ9'},{av:'A13936ProForRs',fld:'PROFORRS',pic:''},{av:'A13740ProFDsc',fld:'PROFDSC',pic:''},{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z764ProForCod'},{av:'Z941EmprCodV2'},{av:'Z766ProForDsc'},{av:'Z4715ProForDsc2'},{av:'Z771ProForTie'},{av:'Z772ProForTmx'},{av:'Z769ProForMat'},{av:'Z674PorForFul'},{av:'Z773ProForUli'},{av:'Z407EmprNom'},{av:'Z2392ProNumPro'},{av:'Z2393ProNumRec'},{av:'Z3005ProRev'},{av:'Z4705ProForPau'},{av:'Z4706ProForRb'},{av:'Z4864ProForCCi'},{av:'Z4865ProForDCi'},{av:'Z5523ProForTip'},{av:'Z8527ProForAbs'},{av:'Z8528ProForCos'},{av:'Z10120ProforVl'},{av:'Z10547ProH2O'},{av:'Z3589ProForMer'},{av:'Z13133ProForAct'},{av:'Z13750ProForMaxL'},{av:'Z13936ProForRs'},{av:'Z13740ProFDsc'},{av:'Z920ProForCodV'},{av:'Z6061ProForLab'},{ctrl:'BTNTRN_DELETE',prop:'Enabled'},{ctrl:'BTNTRN_ENTER',prop:'Enabled'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORDSC","{handler:'valid_Profordsc',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORDSC",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROREV","{handler:'valid_Prorev',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROREV",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORTMX","{handler:'valid_Profortmx',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORTMX",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORRB","{handler:'valid_Proforrb',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORRB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORLAB","{handler:'valid_Proforlab',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORLAB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORLIN","{handler:'valid_Proforlin',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORLIN",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORPRD","{handler:'valid_Proforprd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORPRD",",oparms:[{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A13750ProForMaxL',fld:'PROFORMAXL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O490ForPrdUMe'},{av:'O767ProForLin'},{av:'h490ForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'},{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'},{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''},{av:'AV90oldProforlin',fld:'vOLDPROFORLIN',pic:'ZZZ9'},{av:'AV87Un',fld:'vUN',pic:'9'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'},{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''},{av:'AV90oldProforlin',fld:'vOLDPROFORLIN',pic:'ZZZ9'},{av:'AV87Un',fld:'vUN',pic:'9'},{av:'h490ForPrdUMe'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCAN","{handler:'valid_Proforcan',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O762ProForCan'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18Station',fld:'vSTATION',pic:''},{av:'AV89Msg_del',fld:'vMSG_DEL',pic:''},{av:'AV86oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCAN",",oparms:[{av:'AV86oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'AV89Msg_del',fld:'vMSG_DEL',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORTNQ","{handler:'valid_Profortnq',iparms:[{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A1645ProForNro',fld:'PROFORNRO',pic:'Z9'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A765ProForDes',fld:'PROFORDES',pic:''},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O3379ProForTnq'},{av:'O1645ProForNro'},{av:'O762ProForCan'},{av:'O490ForPrdUMe'},{av:'O765ProForDes'},{av:'O770ProForPrd'},{av:'A3379ProForTnq',fld:'PROFORTNQ',pic:'Z9'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORTNQ",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCLA","{handler:'valid_Proforcla',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCLA",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCLV","{handler:'valid_Proforclv',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O5358ProForClv'},{av:'O763ProForCla'},{av:'O490ForPrdUMe'},{av:'O762ProForCan'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV86oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'AV87Un',fld:'vUN',pic:'9'},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18Station',fld:'vSTATION',pic:''},{av:'AV85Msg_e',fld:'vMSG_E',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCLV",",oparms:[{av:'AV85Msg_e',fld:'vMSG_E',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Prdmaxfind',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
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
      pr_default.close(61);
      pr_default.close(4);
      pr_default.close(59);
      pr_default.close(53);
      pr_default.close(62);
      pr_default.close(2);
      pr_default.close(64);
      pr_default.close(3);
      pr_default.close(58);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z769ProForMat = "" ;
      Z674PorForFul = GXutil.nullDate() ;
      Z3005ProRev = "" ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z5523ProForTip = "" ;
      Z6061ProForLab = "" ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13133ProForAct = "" ;
      Z13936ProForRs = "" ;
      Dvelop_confirmpanel_anularclaves_Result = "" ;
      Z765ProForDes = "" ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      Z770ProForPrd = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z763ProForCla = "" ;
      Z5358ProForClv = "" ;
      Z13111ProForDe2 = "" ;
      O762ProForCan = DecimalUtil.ZERO ;
      O763ProForCla = "" ;
      O5358ProForClv = "" ;
      O770ProForPrd = "" ;
      O765ProForDes = "" ;
      N6062ProForCPo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6061ProForLab = "" ;
      Gx_mode = "" ;
      AV114Pgmname = "" ;
      AV17UsurCod = "" ;
      AV18Station = "" ;
      AV85Msg_e = "" ;
      AV89Msg_del = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A764ProForCod = "" ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A719PrdNum = "" ;
      A13746ForPrdCDsc = "" ;
      h490ForPrdUMe = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A13133ProForAct = "" ;
      A3005ProRev = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      A5523ProForTip = "" ;
      A769ProForMat = "" ;
      A8527ProForAbs = DecimalUtil.ZERO ;
      A8528ProForCos = DecimalUtil.ZERO ;
      bttBtnclaves_Jsonclick = "" ;
      bttBtnanularclaves_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_anularclaves = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode90 = "" ;
      A674PorForFul = GXutil.nullDate() ;
      A4864ProForCCi = "" ;
      A4865ProForDCi = "" ;
      A3589ProForMer = DecimalUtil.ZERO ;
      A13936ProForRs = "" ;
      A941EmprCodV2 = "" ;
      A13740ProFDsc = "" ;
      A920ProForCodV = "" ;
      AV65Msg1 = "" ;
      A407EmprNom = "" ;
      A710PrdFind = "" ;
      A702PrdDscFind = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A13178ProForFT = "" ;
      AV86oldCant = DecimalUtil.ZERO ;
      A13111ProForDe2 = "" ;
      A488ForPrdDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvelop_confirmpanel_anularclaves_Objectcall = "" ;
      Dvelop_confirmpanel_anularclaves_Width = "" ;
      Dvelop_confirmpanel_anularclaves_Height = "" ;
      Dvelop_confirmpanel_anularclaves_Class = "" ;
      Dvelop_confirmpanel_anularclaves_Comment = "" ;
      Dvelop_confirmpanel_anularclaves_Bodytype = "" ;
      Dvelop_confirmpanel_anularclaves_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_anularclaves_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A717PrdMaxFind = "" ;
      T762ProForCan = DecimalUtil.ZERO ;
      T763ProForCla = "" ;
      T5358ProForClv = "" ;
      T770ProForPrd = "" ;
      T765ProForDes = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      AV96EmprCod = "" ;
      GXv_int6 = new int[1] ;
      AV88Fabs = DecimalUtil.ZERO ;
      AV115Op = "" ;
      AV31msg0 = "" ;
      GXt_char1 = "" ;
      AV102ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      AV97ProForCod = "" ;
      AV110ProForCla_ProForClv = "" ;
      AV100WebSession = httpContext.getWebSession();
      AV108ProForCla = "" ;
      AV109ProForClv = "" ;
      Z407EmprNom = "" ;
      T002417_A407EmprNom = new String[] {""} ;
      T002417_n407EmprNom = new boolean[] {false} ;
      T002418_A764ProForCod = new String[] {""} ;
      T002418_n764ProForCod = new boolean[] {false} ;
      T002418_A766ProForDsc = new String[] {""} ;
      T002418_A4715ProForDsc2 = new String[] {""} ;
      T002418_A771ProForTie = new short[1] ;
      T002418_A772ProForTmx = new short[1] ;
      T002418_A769ProForMat = new String[] {""} ;
      T002418_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T002418_A773ProForUli = new short[1] ;
      T002418_A407EmprNom = new String[] {""} ;
      T002418_n407EmprNom = new boolean[] {false} ;
      T002418_A2392ProNumPro = new int[1] ;
      T002418_A2393ProNumRec = new int[1] ;
      T002418_A3005ProRev = new String[] {""} ;
      T002418_A4705ProForPau = new short[1] ;
      T002418_A4706ProForRb = new short[1] ;
      T002418_A4864ProForCCi = new String[] {""} ;
      T002418_A4865ProForDCi = new String[] {""} ;
      T002418_A5523ProForTip = new String[] {""} ;
      T002418_A6061ProForLab = new String[] {""} ;
      T002418_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002418_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002418_A10120ProforVl = new int[1] ;
      T002418_A10547ProH2O = new short[1] ;
      T002418_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002418_A13133ProForAct = new String[] {""} ;
      T002418_A13936ProForRs = new String[] {""} ;
      T002418_A396EmprCod = new String[] {""} ;
      T002419_A396EmprCod = new String[] {""} ;
      T002419_A764ProForCod = new String[] {""} ;
      T002419_n764ProForCod = new boolean[] {false} ;
      T002416_A764ProForCod = new String[] {""} ;
      T002416_n764ProForCod = new boolean[] {false} ;
      T002416_A766ProForDsc = new String[] {""} ;
      T002416_A4715ProForDsc2 = new String[] {""} ;
      T002416_A771ProForTie = new short[1] ;
      T002416_A772ProForTmx = new short[1] ;
      T002416_A769ProForMat = new String[] {""} ;
      T002416_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T002416_A773ProForUli = new short[1] ;
      T002416_A2392ProNumPro = new int[1] ;
      T002416_A2393ProNumRec = new int[1] ;
      T002416_A3005ProRev = new String[] {""} ;
      T002416_A4705ProForPau = new short[1] ;
      T002416_A4706ProForRb = new short[1] ;
      T002416_A4864ProForCCi = new String[] {""} ;
      T002416_A4865ProForDCi = new String[] {""} ;
      T002416_A5523ProForTip = new String[] {""} ;
      T002416_A6061ProForLab = new String[] {""} ;
      T002416_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002416_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002416_A10120ProforVl = new int[1] ;
      T002416_A10547ProH2O = new short[1] ;
      T002416_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002416_A13133ProForAct = new String[] {""} ;
      T002416_A13936ProForRs = new String[] {""} ;
      T002416_A396EmprCod = new String[] {""} ;
      sMode89 = "" ;
      T002420_A396EmprCod = new String[] {""} ;
      T002420_A764ProForCod = new String[] {""} ;
      T002420_n764ProForCod = new boolean[] {false} ;
      T002421_A396EmprCod = new String[] {""} ;
      T002421_A764ProForCod = new String[] {""} ;
      T002421_n764ProForCod = new boolean[] {false} ;
      T002415_A764ProForCod = new String[] {""} ;
      T002415_n764ProForCod = new boolean[] {false} ;
      T002415_A766ProForDsc = new String[] {""} ;
      T002415_A4715ProForDsc2 = new String[] {""} ;
      T002415_A771ProForTie = new short[1] ;
      T002415_A772ProForTmx = new short[1] ;
      T002415_A769ProForMat = new String[] {""} ;
      T002415_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T002415_A773ProForUli = new short[1] ;
      T002415_A2392ProNumPro = new int[1] ;
      T002415_A2393ProNumRec = new int[1] ;
      T002415_A3005ProRev = new String[] {""} ;
      T002415_A4705ProForPau = new short[1] ;
      T002415_A4706ProForRb = new short[1] ;
      T002415_A4864ProForCCi = new String[] {""} ;
      T002415_A4865ProForDCi = new String[] {""} ;
      T002415_A5523ProForTip = new String[] {""} ;
      T002415_A6061ProForLab = new String[] {""} ;
      T002415_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002415_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002415_A10120ProforVl = new int[1] ;
      T002415_A10547ProH2O = new short[1] ;
      T002415_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002415_A13133ProForAct = new String[] {""} ;
      T002415_A13936ProForRs = new String[] {""} ;
      T002415_A396EmprCod = new String[] {""} ;
      T002425_A396EmprCod = new String[] {""} ;
      T002425_A252CliCod = new int[1] ;
      T002425_A13381CliProQui = new String[] {""} ;
      T002426_A396EmprCod = new String[] {""} ;
      T002426_A13026PedDGId = new int[1] ;
      T002426_A758ProCod = new String[] {""} ;
      T002426_A13045PedDGFasLi = new short[1] ;
      T002426_A13057PedDGPQLin = new short[1] ;
      T002427_A396EmprCod = new String[] {""} ;
      T002427_A12673LavMqId = new int[1] ;
      T002427_A12692LavMqLnPq = new short[1] ;
      T002428_A396EmprCod = new String[] {""} ;
      T002428_A129BarCod = new int[1] ;
      T002428_A132BarCodReo = new byte[1] ;
      T002428_A130BarCodPar = new String[] {""} ;
      T002428_A4075recestncol = new byte[1] ;
      T002428_A4076recestnpro = new byte[1] ;
      T002429_A396EmprCod = new String[] {""} ;
      T002429_A4052EstNumFor = new int[1] ;
      T002429_A4053EstNumCol = new byte[1] ;
      T002429_A4057EstNumLin = new byte[1] ;
      T002430_A396EmprCod = new String[] {""} ;
      T002430_A6380Ft_procod = new String[] {""} ;
      T002430_A6383Ft_ProLin = new short[1] ;
      T002431_A396EmprCod = new String[] {""} ;
      T002431_A11270Pot_num = new int[1] ;
      T002432_A396EmprCod = new String[] {""} ;
      T002432_A764ProForCod = new String[] {""} ;
      T002432_n764ProForCod = new boolean[] {false} ;
      T002432_A8877Prg_Cod = new int[1] ;
      T002433_A396EmprCod = new String[] {""} ;
      T002433_A252CliCod = new int[1] ;
      T002433_A494ForSer = new String[] {""} ;
      T002433_A482ForColNom = new String[] {""} ;
      T002433_A483ForColNum = new int[1] ;
      T002433_A831TipColCod = new byte[1] ;
      T002433_A7094Acab_Ter = new String[] {""} ;
      T002434_A396EmprCod = new String[] {""} ;
      T002434_A758ProCod = new String[] {""} ;
      T002434_A774ProNumLin = new short[1] ;
      T002434_A6438ProFsaL = new short[1] ;
      T002435_A396EmprCod = new String[] {""} ;
      T002435_A6319C_Barcod = new int[1] ;
      T002435_A6320C_Barcodre = new byte[1] ;
      T002435_A6321C_Barcodpa = new String[] {""} ;
      T002435_A6322C_Reclinma = new short[1] ;
      T002435_A6323C_Reclinpr = new byte[1] ;
      T002436_A396EmprCod = new String[] {""} ;
      T002436_A361DisCod = new int[1] ;
      T002436_A758ProCod = new String[] {""} ;
      T002436_A368DisFasLin = new short[1] ;
      T002436_A5377DisQuiLin = new short[1] ;
      T002437_A396EmprCod = new String[] {""} ;
      T002437_A129BarCod = new int[1] ;
      T002437_A132BarCodReo = new byte[1] ;
      T002437_A130BarCodPar = new String[] {""} ;
      T002437_A758ProCod = new String[] {""} ;
      T002437_A194BarOrdLin = new short[1] ;
      T002437_A5371FasQuiLin = new short[1] ;
      T002438_A396EmprCod = new String[] {""} ;
      T002438_A764ProForCod = new String[] {""} ;
      T002438_n764ProForCod = new boolean[] {false} ;
      T002438_A5191ProForLC = new short[1] ;
      T002439_A396EmprCod = new String[] {""} ;
      T002439_A764ProForCod = new String[] {""} ;
      T002439_n764ProForCod = new boolean[] {false} ;
      T002439_A5191ProForLC = new short[1] ;
      T002440_A396EmprCod = new String[] {""} ;
      T002440_A831TipColCod = new byte[1] ;
      T002440_A5162TipColLin = new short[1] ;
      T002441_A396EmprCod = new String[] {""} ;
      T002441_A4744RecPreCod = new int[1] ;
      T002441_A4762RecPreLin = new short[1] ;
      T002442_A396EmprCod = new String[] {""} ;
      T002442_A252CliCod = new int[1] ;
      T002442_A65ArtCod = new String[] {""} ;
      T002442_A4658MdlCod = new String[] {""} ;
      T002442_A457FasCod = new String[] {""} ;
      T002442_A4660FasProLin = new short[1] ;
      T002443_A396EmprCod = new String[] {""} ;
      T002443_A457FasCod = new String[] {""} ;
      T002443_A4650FasForLin = new short[1] ;
      T002444_A396EmprCod = new String[] {""} ;
      T002444_A129BarCod = new int[1] ;
      T002444_A132BarCodReo = new byte[1] ;
      T002444_A130BarCodPar = new String[] {""} ;
      T002444_A2804RecLinMaq = new short[1] ;
      T002444_A1273RecLinPro = new byte[1] ;
      T002445_A396EmprCod = new String[] {""} ;
      T002445_A1514MacProCod = new String[] {""} ;
      T002445_A1517MacProLin = new short[1] ;
      T002446_A396EmprCod = new String[] {""} ;
      T002446_A252CliCod = new int[1] ;
      T002446_A494ForSer = new String[] {""} ;
      T002446_A482ForColNom = new String[] {""} ;
      T002446_A483ForColNum = new int[1] ;
      T002446_A831TipColCod = new byte[1] ;
      T002446_A1160ProForL = new short[1] ;
      T002447_A396EmprCod = new String[] {""} ;
      T002447_A910Workstat = new String[] {""} ;
      T002447_A887EscMLin = new int[1] ;
      T002449_A396EmprCod = new String[] {""} ;
      T002449_A764ProForCod = new String[] {""} ;
      T002449_n764ProForCod = new boolean[] {false} ;
      Z710PrdFind = "" ;
      Z488ForPrdDsc = "" ;
      T002450_A719PrdNum = new String[] {""} ;
      T002450_A764ProForCod = new String[] {""} ;
      T002450_n764ProForCod = new boolean[] {false} ;
      T002450_A767ProForLin = new short[1] ;
      T002450_A765ProForDes = new String[] {""} ;
      T002450_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002450_A13178ProForFT = new String[] {""} ;
      T002450_A770ProForPrd = new String[] {""} ;
      T002450_A488ForPrdDsc = new String[] {""} ;
      T002450_n488ForPrdDsc = new boolean[] {false} ;
      T002450_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002450_A763ProForCla = new String[] {""} ;
      T002450_A1645ProForNro = new byte[1] ;
      T002450_A3379ProForTnq = new byte[1] ;
      T002450_A5358ProForClv = new String[] {""} ;
      T002450_A13111ProForDe2 = new String[] {""} ;
      T002450_A396EmprCod = new String[] {""} ;
      T002450_A490ForPrdUMe = new byte[1] ;
      T002450_A710PrdFind = new String[] {""} ;
      T002450_n710PrdFind = new boolean[] {false} ;
      T002451_A13746ForPrdCDsc = new String[] {""} ;
      T002451_A396EmprCod = new String[] {""} ;
      T002451_A490ForPrdUMe = new byte[1] ;
      T002452_A13746ForPrdCDsc = new String[] {""} ;
      T002452_A396EmprCod = new String[] {""} ;
      T002452_A490ForPrdUMe = new byte[1] ;
      T002453_A13746ForPrdCDsc = new String[] {""} ;
      T002453_A396EmprCod = new String[] {""} ;
      T002453_A490ForPrdUMe = new byte[1] ;
      T002413_A488ForPrdDsc = new String[] {""} ;
      T002413_n488ForPrdDsc = new boolean[] {false} ;
      T002414_A710PrdFind = new String[] {""} ;
      T002414_n710PrdFind = new boolean[] {false} ;
      T00246_A4340PrdUMeFind = new byte[1] ;
      T00246_n4340PrdUMeFind = new boolean[] {false} ;
      T002454_A13746ForPrdCDsc = new String[] {""} ;
      T002454_A396EmprCod = new String[] {""} ;
      T002454_A490ForPrdUMe = new byte[1] ;
      T002412_A717PrdMaxFind = new String[] {""} ;
      T002412_n717PrdMaxFind = new boolean[] {false} ;
      T002455_A710PrdFind = new String[] {""} ;
      T002455_n710PrdFind = new boolean[] {false} ;
      T002456_A13746ForPrdCDsc = new String[] {""} ;
      T002456_A396EmprCod = new String[] {""} ;
      T002456_A490ForPrdUMe = new byte[1] ;
      T002457_A396EmprCod = new String[] {""} ;
      T002457_A764ProForCod = new String[] {""} ;
      T002457_n764ProForCod = new boolean[] {false} ;
      T002457_A767ProForLin = new short[1] ;
      T00243_A764ProForCod = new String[] {""} ;
      T00243_n764ProForCod = new boolean[] {false} ;
      T00243_A767ProForLin = new short[1] ;
      T00243_A765ProForDes = new String[] {""} ;
      T00243_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00243_A13178ProForFT = new String[] {""} ;
      T00243_A770ProForPrd = new String[] {""} ;
      T00243_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00243_A763ProForCla = new String[] {""} ;
      T00243_A1645ProForNro = new byte[1] ;
      T00243_A3379ProForTnq = new byte[1] ;
      T00243_A5358ProForClv = new String[] {""} ;
      T00243_A13111ProForDe2 = new String[] {""} ;
      T00243_A396EmprCod = new String[] {""} ;
      T00243_A490ForPrdUMe = new byte[1] ;
      T002458_A13746ForPrdCDsc = new String[] {""} ;
      T002458_A396EmprCod = new String[] {""} ;
      T002458_A490ForPrdUMe = new byte[1] ;
      T00242_A764ProForCod = new String[] {""} ;
      T00242_n764ProForCod = new boolean[] {false} ;
      T00242_A767ProForLin = new short[1] ;
      T00242_A765ProForDes = new String[] {""} ;
      T00242_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00242_A13178ProForFT = new String[] {""} ;
      T00242_A770ProForPrd = new String[] {""} ;
      T00242_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00242_A763ProForCla = new String[] {""} ;
      T00242_A1645ProForNro = new byte[1] ;
      T00242_A3379ProForTnq = new byte[1] ;
      T00242_A5358ProForClv = new String[] {""} ;
      T00242_A13111ProForDe2 = new String[] {""} ;
      T00242_A396EmprCod = new String[] {""} ;
      T00242_A490ForPrdUMe = new byte[1] ;
      T002462_A710PrdFind = new String[] {""} ;
      T002462_n710PrdFind = new boolean[] {false} ;
      T002463_A396EmprCod = new String[] {""} ;
      T002463_A764ProForCod = new String[] {""} ;
      T002463_n764ProForCod = new boolean[] {false} ;
      T002463_A767ProForLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13133ProForAct = "" ;
      i3005ProRev = "" ;
      i6062ProForCPo = DecimalUtil.ZERO ;
      i13178ProForFT = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l719PrdNum = "" ;
      T002464_A396EmprCod = new String[] {""} ;
      T002464_A719PrdNum = new String[] {""} ;
      l13746ForPrdCDsc = "" ;
      T002465_A13746ForPrdCDsc = new String[] {""} ;
      T002466_A13746ForPrdCDsc = new String[] {""} ;
      T002466_A396EmprCod = new String[] {""} ;
      T002466_A490ForPrdUMe = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      T002467_A407EmprNom = new String[] {""} ;
      T002467_n407EmprNom = new boolean[] {false} ;
      Z941EmprCodV2 = "" ;
      Z13740ProFDsc = "" ;
      Z920ProForCodV = "" ;
      ZZ396EmprCod = "" ;
      ZZ764ProForCod = "" ;
      ZZ941EmprCodV2 = "" ;
      ZZ766ProForDsc = "" ;
      ZZ4715ProForDsc2 = "" ;
      ZZ769ProForMat = "" ;
      ZZ674PorForFul = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ3005ProRev = "" ;
      ZZ4864ProForCCi = "" ;
      ZZ4865ProForDCi = "" ;
      ZZ5523ProForTip = "" ;
      ZZ8527ProForAbs = DecimalUtil.ZERO ;
      ZZ8528ProForCos = DecimalUtil.ZERO ;
      ZZ3589ProForMer = DecimalUtil.ZERO ;
      ZZ13133ProForAct = "" ;
      ZZ13936ProForRs = "" ;
      ZZ13740ProFDsc = "" ;
      ZZ920ProForCodV = "" ;
      ZZ6061ProForLab = "" ;
      T002468_A710PrdFind = new String[] {""} ;
      T002468_n710PrdFind = new boolean[] {false} ;
      T002469_A13746ForPrdCDsc = new String[] {""} ;
      T002469_A396EmprCod = new String[] {""} ;
      T002469_A490ForPrdUMe = new byte[1] ;
      T002470_A488ForPrdDsc = new String[] {""} ;
      T002470_n488ForPrdDsc = new boolean[] {false} ;
      GXv_int9 = new long[1] ;
      T002473_A4340PrdUMeFind = new byte[1] ;
      T002473_n4340PrdUMeFind = new boolean[] {false} ;
      T002474_A13746ForPrdCDsc = new String[] {""} ;
      T002474_A396EmprCod = new String[] {""} ;
      T002474_A490ForPrdUMe = new byte[1] ;
      T002480_A717PrdMaxFind = new String[] {""} ;
      T002480_n717PrdMaxFind = new boolean[] {false} ;
      Z717PrdMaxFind = "" ;
      Zh490ForPrdUMe = "" ;
      ZV86oldCant = DecimalUtil.ZERO ;
      ZV89Msg_del = "" ;
      ZV85Msg_e = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tprofor__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tprofor__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tprofor__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tprofor__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tprofor__default(),
         new Object[] {
             new Object[] {
            T00242_A764ProForCod, T00242_A767ProForLin, T00242_A765ProForDes, T00242_A6062ProForCPo, T00242_A13178ProForFT, T00242_A770ProForPrd, T00242_A762ProForCan, T00242_A763ProForCla, T00242_A1645ProForNro, T00242_A3379ProForTnq,
            T00242_A5358ProForClv, T00242_A13111ProForDe2, T00242_A396EmprCod, T00242_A490ForPrdUMe
            }
            , new Object[] {
            T00243_A764ProForCod, T00243_A767ProForLin, T00243_A765ProForDes, T00243_A6062ProForCPo, T00243_A13178ProForFT, T00243_A770ProForPrd, T00243_A762ProForCan, T00243_A763ProForCla, T00243_A1645ProForNro, T00243_A3379ProForTnq,
            T00243_A5358ProForClv, T00243_A13111ProForDe2, T00243_A396EmprCod, T00243_A490ForPrdUMe
            }
            , new Object[] {
            T00246_A4340PrdUMeFind, T00246_n4340PrdUMeFind
            }
            , new Object[] {
            T002412_A717PrdMaxFind, T002412_n717PrdMaxFind
            }
            , new Object[] {
            T002413_A488ForPrdDsc, T002413_n488ForPrdDsc
            }
            , new Object[] {
            T002414_A710PrdFind, T002414_n710PrdFind
            }
            , new Object[] {
            T002415_A764ProForCod, T002415_A766ProForDsc, T002415_A4715ProForDsc2, T002415_A771ProForTie, T002415_A772ProForTmx, T002415_A769ProForMat, T002415_A674PorForFul, T002415_A773ProForUli, T002415_A2392ProNumPro, T002415_A2393ProNumRec,
            T002415_A3005ProRev, T002415_A4705ProForPau, T002415_A4706ProForRb, T002415_A4864ProForCCi, T002415_A4865ProForDCi, T002415_A5523ProForTip, T002415_A6061ProForLab, T002415_A8527ProForAbs, T002415_A8528ProForCos, T002415_A10120ProforVl,
            T002415_A10547ProH2O, T002415_A3589ProForMer, T002415_A13133ProForAct, T002415_A13936ProForRs, T002415_A396EmprCod
            }
            , new Object[] {
            T002416_A764ProForCod, T002416_A766ProForDsc, T002416_A4715ProForDsc2, T002416_A771ProForTie, T002416_A772ProForTmx, T002416_A769ProForMat, T002416_A674PorForFul, T002416_A773ProForUli, T002416_A2392ProNumPro, T002416_A2393ProNumRec,
            T002416_A3005ProRev, T002416_A4705ProForPau, T002416_A4706ProForRb, T002416_A4864ProForCCi, T002416_A4865ProForDCi, T002416_A5523ProForTip, T002416_A6061ProForLab, T002416_A8527ProForAbs, T002416_A8528ProForCos, T002416_A10120ProforVl,
            T002416_A10547ProH2O, T002416_A3589ProForMer, T002416_A13133ProForAct, T002416_A13936ProForRs, T002416_A396EmprCod
            }
            , new Object[] {
            T002417_A407EmprNom, T002417_n407EmprNom
            }
            , new Object[] {
            T002418_A764ProForCod, T002418_A766ProForDsc, T002418_A4715ProForDsc2, T002418_A771ProForTie, T002418_A772ProForTmx, T002418_A769ProForMat, T002418_A674PorForFul, T002418_A773ProForUli, T002418_A407EmprNom, T002418_n407EmprNom,
            T002418_A2392ProNumPro, T002418_A2393ProNumRec, T002418_A3005ProRev, T002418_A4705ProForPau, T002418_A4706ProForRb, T002418_A4864ProForCCi, T002418_A4865ProForDCi, T002418_A5523ProForTip, T002418_A6061ProForLab, T002418_A8527ProForAbs,
            T002418_A8528ProForCos, T002418_A10120ProforVl, T002418_A10547ProH2O, T002418_A3589ProForMer, T002418_A13133ProForAct, T002418_A13936ProForRs, T002418_A396EmprCod
            }
            , new Object[] {
            T002419_A396EmprCod, T002419_A764ProForCod
            }
            , new Object[] {
            T002420_A396EmprCod, T002420_A764ProForCod
            }
            , new Object[] {
            T002421_A396EmprCod, T002421_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002425_A396EmprCod, T002425_A252CliCod, T002425_A13381CliProQui
            }
            , new Object[] {
            T002426_A396EmprCod, T002426_A13026PedDGId, T002426_A758ProCod, T002426_A13045PedDGFasLi, T002426_A13057PedDGPQLin
            }
            , new Object[] {
            T002427_A396EmprCod, T002427_A12673LavMqId, T002427_A12692LavMqLnPq
            }
            , new Object[] {
            T002428_A396EmprCod, T002428_A129BarCod, T002428_A132BarCodReo, T002428_A130BarCodPar, T002428_A4075recestncol, T002428_A4076recestnpro
            }
            , new Object[] {
            T002429_A396EmprCod, T002429_A4052EstNumFor, T002429_A4053EstNumCol, T002429_A4057EstNumLin
            }
            , new Object[] {
            T002430_A396EmprCod, T002430_A6380Ft_procod, T002430_A6383Ft_ProLin
            }
            , new Object[] {
            T002431_A396EmprCod, T002431_A11270Pot_num
            }
            , new Object[] {
            T002432_A396EmprCod, T002432_A764ProForCod, T002432_A8877Prg_Cod
            }
            , new Object[] {
            T002433_A396EmprCod, T002433_A252CliCod, T002433_A494ForSer, T002433_A482ForColNom, T002433_A483ForColNum, T002433_A831TipColCod, T002433_A7094Acab_Ter
            }
            , new Object[] {
            T002434_A396EmprCod, T002434_A758ProCod, T002434_A774ProNumLin, T002434_A6438ProFsaL
            }
            , new Object[] {
            T002435_A396EmprCod, T002435_A6319C_Barcod, T002435_A6320C_Barcodre, T002435_A6321C_Barcodpa, T002435_A6322C_Reclinma, T002435_A6323C_Reclinpr
            }
            , new Object[] {
            T002436_A396EmprCod, T002436_A361DisCod, T002436_A758ProCod, T002436_A368DisFasLin, T002436_A5377DisQuiLin
            }
            , new Object[] {
            T002437_A396EmprCod, T002437_A129BarCod, T002437_A132BarCodReo, T002437_A130BarCodPar, T002437_A758ProCod, T002437_A194BarOrdLin, T002437_A5371FasQuiLin
            }
            , new Object[] {
            T002438_A396EmprCod, T002438_A764ProForCod, T002438_A5191ProForLC
            }
            , new Object[] {
            T002439_A396EmprCod, T002439_A764ProForCod, T002439_A5191ProForLC
            }
            , new Object[] {
            T002440_A396EmprCod, T002440_A831TipColCod, T002440_A5162TipColLin
            }
            , new Object[] {
            T002441_A396EmprCod, T002441_A4744RecPreCod, T002441_A4762RecPreLin
            }
            , new Object[] {
            T002442_A396EmprCod, T002442_A252CliCod, T002442_A65ArtCod, T002442_A4658MdlCod, T002442_A457FasCod, T002442_A4660FasProLin
            }
            , new Object[] {
            T002443_A396EmprCod, T002443_A457FasCod, T002443_A4650FasForLin
            }
            , new Object[] {
            T002444_A396EmprCod, T002444_A129BarCod, T002444_A132BarCodReo, T002444_A130BarCodPar, T002444_A2804RecLinMaq, T002444_A1273RecLinPro
            }
            , new Object[] {
            T002445_A396EmprCod, T002445_A1514MacProCod, T002445_A1517MacProLin
            }
            , new Object[] {
            T002446_A396EmprCod, T002446_A252CliCod, T002446_A494ForSer, T002446_A482ForColNom, T002446_A483ForColNum, T002446_A831TipColCod, T002446_A1160ProForL
            }
            , new Object[] {
            T002447_A396EmprCod, T002447_A910Workstat, T002447_A887EscMLin
            }
            , new Object[] {
            }
            , new Object[] {
            T002449_A396EmprCod, T002449_A764ProForCod
            }
            , new Object[] {
            T002450_A719PrdNum, T002450_A764ProForCod, T002450_A767ProForLin, T002450_A765ProForDes, T002450_A6062ProForCPo, T002450_A13178ProForFT, T002450_A770ProForPrd, T002450_A488ForPrdDsc, T002450_n488ForPrdDsc, T002450_A762ProForCan,
            T002450_A763ProForCla, T002450_A1645ProForNro, T002450_A3379ProForTnq, T002450_A5358ProForClv, T002450_A13111ProForDe2, T002450_A396EmprCod, T002450_A490ForPrdUMe, T002450_A710PrdFind, T002450_n710PrdFind
            }
            , new Object[] {
            T002451_A13746ForPrdCDsc, T002451_A396EmprCod, T002451_A490ForPrdUMe
            }
            , new Object[] {
            T002452_A13746ForPrdCDsc, T002452_A396EmprCod, T002452_A490ForPrdUMe
            }
            , new Object[] {
            T002453_A13746ForPrdCDsc, T002453_A396EmprCod, T002453_A490ForPrdUMe
            }
            , new Object[] {
            T002454_A13746ForPrdCDsc, T002454_A396EmprCod, T002454_A490ForPrdUMe
            }
            , new Object[] {
            T002455_A710PrdFind, T002455_n710PrdFind
            }
            , new Object[] {
            T002456_A13746ForPrdCDsc, T002456_A396EmprCod, T002456_A490ForPrdUMe
            }
            , new Object[] {
            T002457_A396EmprCod, T002457_A764ProForCod, T002457_A767ProForLin
            }
            , new Object[] {
            T002458_A13746ForPrdCDsc, T002458_A396EmprCod, T002458_A490ForPrdUMe
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002462_A710PrdFind, T002462_n710PrdFind
            }
            , new Object[] {
            T002463_A396EmprCod, T002463_A764ProForCod, T002463_A767ProForLin
            }
            , new Object[] {
            T002464_A396EmprCod, T002464_A719PrdNum
            }
            , new Object[] {
            T002465_A13746ForPrdCDsc
            }
            , new Object[] {
            T002466_A13746ForPrdCDsc, T002466_A396EmprCod, T002466_A490ForPrdUMe
            }
            , new Object[] {
            T002467_A407EmprNom, T002467_n407EmprNom
            }
            , new Object[] {
            T002468_A710PrdFind, T002468_n710PrdFind
            }
            , new Object[] {
            T002469_A13746ForPrdCDsc, T002469_A396EmprCod, T002469_A490ForPrdUMe
            }
            , new Object[] {
            T002470_A488ForPrdDsc, T002470_n488ForPrdDsc
            }
            , new Object[] {
            T002473_A4340PrdUMeFind, T002473_n4340PrdUMeFind
            }
            , new Object[] {
            T002474_A13746ForPrdCDsc, T002474_A396EmprCod, T002474_A490ForPrdUMe
            }
            , new Object[] {
            T002480_A717PrdMaxFind, T002480_n717PrdMaxFind
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV114Pgmname = "FormulacionTinte.TPROFOR" ;
      Z3005ProRev = httpContext.getMessage( "N", "") ;
      A3005ProRev = httpContext.getMessage( "N", "") ;
      i3005ProRev = httpContext.getMessage( "N", "") ;
      Z13178ProForFT = " " ;
      A13178ProForFT = " " ;
      i13178ProForFT = " " ;
      Z13133ProForAct = httpContext.getMessage( "S", "") ;
      A13133ProForAct = httpContext.getMessage( "S", "") ;
      i13133ProForAct = httpContext.getMessage( "S", "") ;
      Z6061ProForLab = "" ;
      A6061ProForLab = "" ;
      Z6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      N6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      i6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
   }

   private byte Z1645ProForNro ;
   private byte Z3379ProForTnq ;
   private byte Z490ForPrdUMe ;
   private byte O490ForPrdUMe ;
   private byte O1645ProForNro ;
   private byte O3379ProForTnq ;
   private byte GxWebError ;
   private byte AV64Exis_pro ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV61CdpPor ;
   private byte AV83Orient ;
   private byte A4340PrdUMeFind ;
   private byte AV87Un ;
   private byte T490ForPrdUMe ;
   private byte T1645ProForNro ;
   private byte T3379ProForTnq ;
   private byte AV38FlagPer ;
   private byte AV45ObsPrf ;
   private byte AV46FlagLav ;
   private byte AV53PwdPro ;
   private byte AV71Tecido ;
   private byte AV75Lavado ;
   private byte AV70Erfoc ;
   private byte AV73Texfina ;
   private byte AV74Clave2 ;
   private byte AV72NoVisible ;
   private byte AV78Velta ;
   private byte AV80Filasur ;
   private byte AV81Pathter ;
   private byte AV94jpf ;
   private byte AV93tintutex ;
   private byte AV95TiposTecnologias ;
   private byte GXt_int7 ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int5[] ;
   private byte Z4340PrdUMeFind ;
   private byte ZV87Un ;
   private short Z771ProForTie ;
   private short Z772ProForTmx ;
   private short Z773ProForUli ;
   private short Z4705ProForPau ;
   private short Z4706ProForRb ;
   private short Z10547ProH2O ;
   private short Z767ProForLin ;
   private short O767ProForLin ;
   private short nRcdDeleted_90 ;
   private short nRcdExists_90 ;
   private short nIsMod_90 ;
   private short A767ProForLin ;
   private short A13750ProForMaxL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short A4705ProForPau ;
   private short A10547ProH2O ;
   private short nBlankRcdCount90 ;
   private short RcdFound90 ;
   private short nBlankRcdUsr90 ;
   private short A773ProForUli ;
   private short A768ProForLinV ;
   private short AV90oldProforlin ;
   private short s773ProForUli ;
   private short O773ProForUli ;
   private short T767ProForLin ;
   private short AV111Largo ;
   private short RcdFound89 ;
   private short nIsDirty_89 ;
   private short nIsDirty_90 ;
   private short gxhchits ;
   private short Z13750ProForMaxL ;
   private short ZZ771ProForTie ;
   private short ZZ772ProForTmx ;
   private short ZZ773ProForUli ;
   private short ZZ4705ProForPau ;
   private short ZZ4706ProForRb ;
   private short ZZ10547ProH2O ;
   private short ZZ13750ProForMaxL ;
   private short Z768ProForLinV ;
   private short ZV90oldProforlin ;
   private int Z2392ProNumPro ;
   private int Z2393ProNumRec ;
   private int Z10120ProforVl ;
   private int nRC_GXsfl_125 ;
   private int nGXsfl_125_idx=1 ;
   private int trnEnded ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int edtProForTip_Enabled ;
   private int edtProForTie_Enabled ;
   private int edtProForTmx_Enabled ;
   private int edtProForMat_Enabled ;
   private int edtProForRb_Enabled ;
   private int edtProForLab_Enabled ;
   private int edtProForAbs_Enabled ;
   private int edtProForCos_Enabled ;
   private int A2392ProNumPro ;
   private int edtProNumPro_Enabled ;
   private int A2393ProNumRec ;
   private int edtProNumRec_Enabled ;
   private int edtProForPau_Enabled ;
   private int edtProH2O_Enabled ;
   private int bttBtnclaves_Visible ;
   private int bttBtnanularclaves_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtProForLin_Enabled ;
   private int edtProForPrd_Enabled ;
   private int edtProForDes_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtProForCan_Enabled ;
   private int edtProForNro_Enabled ;
   private int edtProForTnq_Enabled ;
   private int edtProForCla_Enabled ;
   private int edtProForClv_Enabled ;
   private int edtPrdMaxFind_Enabled ;
   private int fRowAdded ;
   private int A10120ProforVl ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int AV52ContVal ;
   private int GXv_int6[] ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtProForLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int ZZ2392ProNumPro ;
   private int ZZ2393ProNumRec ;
   private int ZZ10120ProforVl ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long GXt_int8 ;
   private long GXv_int9[] ;
   private java.math.BigDecimal Z8527ProForAbs ;
   private java.math.BigDecimal Z8528ProForCos ;
   private java.math.BigDecimal Z3589ProForMer ;
   private java.math.BigDecimal Z6062ProForCPo ;
   private java.math.BigDecimal Z762ProForCan ;
   private java.math.BigDecimal O762ProForCan ;
   private java.math.BigDecimal N6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A3589ProForMer ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal AV86oldCant ;
   private java.math.BigDecimal T762ProForCan ;
   private java.math.BigDecimal AV88Fabs ;
   private java.math.BigDecimal i6062ProForCPo ;
   private java.math.BigDecimal ZZ8527ProForAbs ;
   private java.math.BigDecimal ZZ8528ProForCos ;
   private java.math.BigDecimal ZZ3589ProForMer ;
   private java.math.BigDecimal ZV86oldCant ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String Z769ProForMat ;
   private String Z3005ProRev ;
   private String Z4864ProForCCi ;
   private String Z4865ProForDCi ;
   private String Z5523ProForTip ;
   private String Z6061ProForLab ;
   private String Z13133ProForAct ;
   private String Z13936ProForRs ;
   private String Dvelop_confirmpanel_anularclaves_Result ;
   private String Z765ProForDes ;
   private String Z13178ProForFT ;
   private String Z770ProForPrd ;
   private String Z763ProForCla ;
   private String Z5358ProForClv ;
   private String Z13111ProForDe2 ;
   private String O763ProForCla ;
   private String O5358ProForClv ;
   private String O770ProForPrd ;
   private String O765ProForDes ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6061ProForLab ;
   private String Gx_mode ;
   private String AV114Pgmname ;
   private String AV17UsurCod ;
   private String AV18Station ;
   private String AV89Msg_del ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProForCod_Internalname ;
   private String sGXsfl_125_idx="0001" ;
   private String A13133ProForAct ;
   private String A3005ProRev ;
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
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForDsc2_Internalname ;
   private String A4715ProForDsc2 ;
   private String edtProForDsc2_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtProForTip_Internalname ;
   private String A5523ProForTip ;
   private String edtProForTip_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtProForTie_Internalname ;
   private String edtProForTie_Jsonclick ;
   private String edtProForTmx_Internalname ;
   private String edtProForTmx_Jsonclick ;
   private String edtProForMat_Internalname ;
   private String A769ProForMat ;
   private String edtProForMat_Jsonclick ;
   private String edtProForRb_Internalname ;
   private String edtProForRb_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtProForLab_Internalname ;
   private String edtProForLab_Jsonclick ;
   private String divProforabs_cell_Internalname ;
   private String edtProForAbs_Internalname ;
   private String edtProForAbs_Jsonclick ;
   private String divProforcos_cell_Internalname ;
   private String edtProForCos_Internalname ;
   private String edtProForCos_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtProNumPro_Internalname ;
   private String edtProNumPro_Jsonclick ;
   private String edtProNumRec_Internalname ;
   private String edtProNumRec_Jsonclick ;
   private String divProforpau_cell_Internalname ;
   private String edtProForPau_Internalname ;
   private String edtProForPau_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divProh2o_cell_Internalname ;
   private String edtProH2O_Internalname ;
   private String edtProH2O_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtnclaves_Internalname ;
   private String bttBtnclaves_Jsonclick ;
   private String bttBtnanularclaves_Internalname ;
   private String bttBtnanularclaves_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_anularclaves_Internalname ;
   private String Dvelop_confirmpanel_anularclaves_Title ;
   private String Dvelop_confirmpanel_anularclaves_Confirmationtext ;
   private String Dvelop_confirmpanel_anularclaves_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_anularclaves_Nobuttoncaption ;
   private String Dvelop_confirmpanel_anularclaves_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_anularclaves_Yesbuttonposition ;
   private String Dvelop_confirmpanel_anularclaves_Confirmtype ;
   private String Dvelop_confirmpanel_anularclaves_Internalname ;
   private String sMode90 ;
   private String edtProForLin_Internalname ;
   private String edtProForPrd_Internalname ;
   private String edtProForDes_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtProForCan_Internalname ;
   private String edtProForNro_Internalname ;
   private String edtProForTnq_Internalname ;
   private String edtProForCla_Internalname ;
   private String edtProForClv_Internalname ;
   private String edtPrdMaxFind_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String A4864ProForCCi ;
   private String A4865ProForDCi ;
   private String A13936ProForRs ;
   private String A941EmprCodV2 ;
   private String A920ProForCodV ;
   private String AV65Msg1 ;
   private String A407EmprNom ;
   private String A710PrdFind ;
   private String A702PrdDscFind ;
   private String A13178ProForFT ;
   private String A13111ProForDe2 ;
   private String A488ForPrdDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvelop_confirmpanel_anularclaves_Objectcall ;
   private String Dvelop_confirmpanel_anularclaves_Width ;
   private String Dvelop_confirmpanel_anularclaves_Height ;
   private String Dvelop_confirmpanel_anularclaves_Class ;
   private String Dvelop_confirmpanel_anularclaves_Comment ;
   private String Dvelop_confirmpanel_anularclaves_Bodytype ;
   private String Dvelop_confirmpanel_anularclaves_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_anularclaves_Texttype ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A717PrdMaxFind ;
   private String T763ProForCla ;
   private String T5358ProForClv ;
   private String T770ProForPrd ;
   private String T765ProForDes ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String AV96EmprCod ;
   private String AV115Op ;
   private String AV31msg0 ;
   private String GXt_char1 ;
   private String AV97ProForCod ;
   private String AV108ProForCla ;
   private String AV109ProForClv ;
   private String Z407EmprNom ;
   private String sMode89 ;
   private String Z710PrdFind ;
   private String Z488ForPrdDsc ;
   private String sGXsfl_125_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtProForLin_Jsonclick ;
   private String edtProForPrd_Jsonclick ;
   private String edtProForDes_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtProForCan_Jsonclick ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Jsonclick ;
   private String edtProForCla_Jsonclick ;
   private String edtProForClv_Jsonclick ;
   private String edtPrdMaxFind_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13133ProForAct ;
   private String i3005ProRev ;
   private String i13178ProForFT ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String l719PrdNum ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z941EmprCodV2 ;
   private String Z920ProForCodV ;
   private String ZZ396EmprCod ;
   private String ZZ764ProForCod ;
   private String ZZ941EmprCodV2 ;
   private String ZZ766ProForDsc ;
   private String ZZ4715ProForDsc2 ;
   private String ZZ769ProForMat ;
   private String ZZ407EmprNom ;
   private String ZZ3005ProRev ;
   private String ZZ4864ProForCCi ;
   private String ZZ4865ProForDCi ;
   private String ZZ5523ProForTip ;
   private String ZZ13133ProForAct ;
   private String ZZ13936ProForRs ;
   private String ZZ920ProForCodV ;
   private String ZZ6061ProForLab ;
   private String Z717PrdMaxFind ;
   private String ZV89Msg_del ;
   private java.util.Date Z674PorForFul ;
   private java.util.Date A674PorForFul ;
   private java.util.Date ZZ674PorForFul ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_125_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4340PrdUMeFind ;
   private boolean n710PrdFind ;
   private boolean n488ForPrdDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvelop_confirmpanel_anularclaves_Enabled ;
   private boolean Dvelop_confirmpanel_anularclaves_Visible ;
   private boolean returnInSub ;
   private boolean AV103Refrescar ;
   private boolean Gx_longc ;
   private boolean n717PrdMaxFind ;
   private String AV85Msg_e ;
   private String ZV85Msg_e ;
   private String A13746ForPrdCDsc ;
   private String h490ForPrdUMe ;
   private String A13740ProFDsc ;
   private String AV110ProForCla_ProForClv ;
   private String l13746ForPrdCDsc ;
   private String Z13740ProFDsc ;
   private String ZZ13740ProFDsc ;
   private String Zh490ForPrdUMe ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV100WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_anularclaves ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV102ObjetoRefrescar ;
   private ICheckbox chkProForAct ;
   private HTMLChoice cmbProRev ;
   private IDataStoreProvider pr_default ;
   private String[] T002417_A407EmprNom ;
   private boolean[] T002417_n407EmprNom ;
   private String[] T002418_A764ProForCod ;
   private boolean[] T002418_n764ProForCod ;
   private String[] T002418_A766ProForDsc ;
   private String[] T002418_A4715ProForDsc2 ;
   private short[] T002418_A771ProForTie ;
   private short[] T002418_A772ProForTmx ;
   private String[] T002418_A769ProForMat ;
   private java.util.Date[] T002418_A674PorForFul ;
   private short[] T002418_A773ProForUli ;
   private String[] T002418_A407EmprNom ;
   private boolean[] T002418_n407EmprNom ;
   private int[] T002418_A2392ProNumPro ;
   private int[] T002418_A2393ProNumRec ;
   private String[] T002418_A3005ProRev ;
   private short[] T002418_A4705ProForPau ;
   private short[] T002418_A4706ProForRb ;
   private String[] T002418_A4864ProForCCi ;
   private String[] T002418_A4865ProForDCi ;
   private String[] T002418_A5523ProForTip ;
   private String[] T002418_A6061ProForLab ;
   private java.math.BigDecimal[] T002418_A8527ProForAbs ;
   private java.math.BigDecimal[] T002418_A8528ProForCos ;
   private int[] T002418_A10120ProforVl ;
   private short[] T002418_A10547ProH2O ;
   private java.math.BigDecimal[] T002418_A3589ProForMer ;
   private String[] T002418_A13133ProForAct ;
   private String[] T002418_A13936ProForRs ;
   private String[] T002418_A396EmprCod ;
   private String[] T002419_A396EmprCod ;
   private String[] T002419_A764ProForCod ;
   private boolean[] T002419_n764ProForCod ;
   private String[] T002416_A764ProForCod ;
   private boolean[] T002416_n764ProForCod ;
   private String[] T002416_A766ProForDsc ;
   private String[] T002416_A4715ProForDsc2 ;
   private short[] T002416_A771ProForTie ;
   private short[] T002416_A772ProForTmx ;
   private String[] T002416_A769ProForMat ;
   private java.util.Date[] T002416_A674PorForFul ;
   private short[] T002416_A773ProForUli ;
   private int[] T002416_A2392ProNumPro ;
   private int[] T002416_A2393ProNumRec ;
   private String[] T002416_A3005ProRev ;
   private short[] T002416_A4705ProForPau ;
   private short[] T002416_A4706ProForRb ;
   private String[] T002416_A4864ProForCCi ;
   private String[] T002416_A4865ProForDCi ;
   private String[] T002416_A5523ProForTip ;
   private String[] T002416_A6061ProForLab ;
   private java.math.BigDecimal[] T002416_A8527ProForAbs ;
   private java.math.BigDecimal[] T002416_A8528ProForCos ;
   private int[] T002416_A10120ProforVl ;
   private short[] T002416_A10547ProH2O ;
   private java.math.BigDecimal[] T002416_A3589ProForMer ;
   private String[] T002416_A13133ProForAct ;
   private String[] T002416_A13936ProForRs ;
   private String[] T002416_A396EmprCod ;
   private String[] T002420_A396EmprCod ;
   private String[] T002420_A764ProForCod ;
   private boolean[] T002420_n764ProForCod ;
   private String[] T002421_A396EmprCod ;
   private String[] T002421_A764ProForCod ;
   private boolean[] T002421_n764ProForCod ;
   private String[] T002415_A764ProForCod ;
   private boolean[] T002415_n764ProForCod ;
   private String[] T002415_A766ProForDsc ;
   private String[] T002415_A4715ProForDsc2 ;
   private short[] T002415_A771ProForTie ;
   private short[] T002415_A772ProForTmx ;
   private String[] T002415_A769ProForMat ;
   private java.util.Date[] T002415_A674PorForFul ;
   private short[] T002415_A773ProForUli ;
   private int[] T002415_A2392ProNumPro ;
   private int[] T002415_A2393ProNumRec ;
   private String[] T002415_A3005ProRev ;
   private short[] T002415_A4705ProForPau ;
   private short[] T002415_A4706ProForRb ;
   private String[] T002415_A4864ProForCCi ;
   private String[] T002415_A4865ProForDCi ;
   private String[] T002415_A5523ProForTip ;
   private String[] T002415_A6061ProForLab ;
   private java.math.BigDecimal[] T002415_A8527ProForAbs ;
   private java.math.BigDecimal[] T002415_A8528ProForCos ;
   private int[] T002415_A10120ProforVl ;
   private short[] T002415_A10547ProH2O ;
   private java.math.BigDecimal[] T002415_A3589ProForMer ;
   private String[] T002415_A13133ProForAct ;
   private String[] T002415_A13936ProForRs ;
   private String[] T002415_A396EmprCod ;
   private String[] T002425_A396EmprCod ;
   private int[] T002425_A252CliCod ;
   private String[] T002425_A13381CliProQui ;
   private String[] T002426_A396EmprCod ;
   private int[] T002426_A13026PedDGId ;
   private String[] T002426_A758ProCod ;
   private short[] T002426_A13045PedDGFasLi ;
   private short[] T002426_A13057PedDGPQLin ;
   private String[] T002427_A396EmprCod ;
   private int[] T002427_A12673LavMqId ;
   private short[] T002427_A12692LavMqLnPq ;
   private String[] T002428_A396EmprCod ;
   private int[] T002428_A129BarCod ;
   private byte[] T002428_A132BarCodReo ;
   private String[] T002428_A130BarCodPar ;
   private byte[] T002428_A4075recestncol ;
   private byte[] T002428_A4076recestnpro ;
   private String[] T002429_A396EmprCod ;
   private int[] T002429_A4052EstNumFor ;
   private byte[] T002429_A4053EstNumCol ;
   private byte[] T002429_A4057EstNumLin ;
   private String[] T002430_A396EmprCod ;
   private String[] T002430_A6380Ft_procod ;
   private short[] T002430_A6383Ft_ProLin ;
   private String[] T002431_A396EmprCod ;
   private int[] T002431_A11270Pot_num ;
   private String[] T002432_A396EmprCod ;
   private String[] T002432_A764ProForCod ;
   private boolean[] T002432_n764ProForCod ;
   private int[] T002432_A8877Prg_Cod ;
   private String[] T002433_A396EmprCod ;
   private int[] T002433_A252CliCod ;
   private String[] T002433_A494ForSer ;
   private String[] T002433_A482ForColNom ;
   private int[] T002433_A483ForColNum ;
   private byte[] T002433_A831TipColCod ;
   private String[] T002433_A7094Acab_Ter ;
   private String[] T002434_A396EmprCod ;
   private String[] T002434_A758ProCod ;
   private short[] T002434_A774ProNumLin ;
   private short[] T002434_A6438ProFsaL ;
   private String[] T002435_A396EmprCod ;
   private int[] T002435_A6319C_Barcod ;
   private byte[] T002435_A6320C_Barcodre ;
   private String[] T002435_A6321C_Barcodpa ;
   private short[] T002435_A6322C_Reclinma ;
   private byte[] T002435_A6323C_Reclinpr ;
   private String[] T002436_A396EmprCod ;
   private int[] T002436_A361DisCod ;
   private String[] T002436_A758ProCod ;
   private short[] T002436_A368DisFasLin ;
   private short[] T002436_A5377DisQuiLin ;
   private String[] T002437_A396EmprCod ;
   private int[] T002437_A129BarCod ;
   private byte[] T002437_A132BarCodReo ;
   private String[] T002437_A130BarCodPar ;
   private String[] T002437_A758ProCod ;
   private short[] T002437_A194BarOrdLin ;
   private short[] T002437_A5371FasQuiLin ;
   private String[] T002438_A396EmprCod ;
   private String[] T002438_A764ProForCod ;
   private boolean[] T002438_n764ProForCod ;
   private short[] T002438_A5191ProForLC ;
   private String[] T002439_A396EmprCod ;
   private String[] T002439_A764ProForCod ;
   private boolean[] T002439_n764ProForCod ;
   private short[] T002439_A5191ProForLC ;
   private String[] T002440_A396EmprCod ;
   private byte[] T002440_A831TipColCod ;
   private short[] T002440_A5162TipColLin ;
   private String[] T002441_A396EmprCod ;
   private int[] T002441_A4744RecPreCod ;
   private short[] T002441_A4762RecPreLin ;
   private String[] T002442_A396EmprCod ;
   private int[] T002442_A252CliCod ;
   private String[] T002442_A65ArtCod ;
   private String[] T002442_A4658MdlCod ;
   private String[] T002442_A457FasCod ;
   private short[] T002442_A4660FasProLin ;
   private String[] T002443_A396EmprCod ;
   private String[] T002443_A457FasCod ;
   private short[] T002443_A4650FasForLin ;
   private String[] T002444_A396EmprCod ;
   private int[] T002444_A129BarCod ;
   private byte[] T002444_A132BarCodReo ;
   private String[] T002444_A130BarCodPar ;
   private short[] T002444_A2804RecLinMaq ;
   private byte[] T002444_A1273RecLinPro ;
   private String[] T002445_A396EmprCod ;
   private String[] T002445_A1514MacProCod ;
   private short[] T002445_A1517MacProLin ;
   private String[] T002446_A396EmprCod ;
   private int[] T002446_A252CliCod ;
   private String[] T002446_A494ForSer ;
   private String[] T002446_A482ForColNom ;
   private int[] T002446_A483ForColNum ;
   private byte[] T002446_A831TipColCod ;
   private short[] T002446_A1160ProForL ;
   private String[] T002447_A396EmprCod ;
   private String[] T002447_A910Workstat ;
   private int[] T002447_A887EscMLin ;
   private String[] T002449_A396EmprCod ;
   private String[] T002449_A764ProForCod ;
   private boolean[] T002449_n764ProForCod ;
   private String[] T002450_A719PrdNum ;
   private String[] T002450_A764ProForCod ;
   private boolean[] T002450_n764ProForCod ;
   private short[] T002450_A767ProForLin ;
   private String[] T002450_A765ProForDes ;
   private java.math.BigDecimal[] T002450_A6062ProForCPo ;
   private String[] T002450_A13178ProForFT ;
   private String[] T002450_A770ProForPrd ;
   private String[] T002450_A488ForPrdDsc ;
   private boolean[] T002450_n488ForPrdDsc ;
   private java.math.BigDecimal[] T002450_A762ProForCan ;
   private String[] T002450_A763ProForCla ;
   private byte[] T002450_A1645ProForNro ;
   private byte[] T002450_A3379ProForTnq ;
   private String[] T002450_A5358ProForClv ;
   private String[] T002450_A13111ProForDe2 ;
   private String[] T002450_A396EmprCod ;
   private byte[] T002450_A490ForPrdUMe ;
   private String[] T002450_A710PrdFind ;
   private boolean[] T002450_n710PrdFind ;
   private String[] T002451_A13746ForPrdCDsc ;
   private String[] T002451_A396EmprCod ;
   private byte[] T002451_A490ForPrdUMe ;
   private String[] T002452_A13746ForPrdCDsc ;
   private String[] T002452_A396EmprCod ;
   private byte[] T002452_A490ForPrdUMe ;
   private String[] T002453_A13746ForPrdCDsc ;
   private String[] T002453_A396EmprCod ;
   private byte[] T002453_A490ForPrdUMe ;
   private String[] T002413_A488ForPrdDsc ;
   private boolean[] T002413_n488ForPrdDsc ;
   private String[] T002414_A710PrdFind ;
   private boolean[] T002414_n710PrdFind ;
   private byte[] T00246_A4340PrdUMeFind ;
   private boolean[] T00246_n4340PrdUMeFind ;
   private String[] T002454_A13746ForPrdCDsc ;
   private String[] T002454_A396EmprCod ;
   private byte[] T002454_A490ForPrdUMe ;
   private String[] T002412_A717PrdMaxFind ;
   private boolean[] T002412_n717PrdMaxFind ;
   private String[] T002455_A710PrdFind ;
   private boolean[] T002455_n710PrdFind ;
   private String[] T002456_A13746ForPrdCDsc ;
   private String[] T002456_A396EmprCod ;
   private byte[] T002456_A490ForPrdUMe ;
   private String[] T002457_A396EmprCod ;
   private String[] T002457_A764ProForCod ;
   private boolean[] T002457_n764ProForCod ;
   private short[] T002457_A767ProForLin ;
   private String[] T00243_A764ProForCod ;
   private boolean[] T00243_n764ProForCod ;
   private short[] T00243_A767ProForLin ;
   private String[] T00243_A765ProForDes ;
   private java.math.BigDecimal[] T00243_A6062ProForCPo ;
   private String[] T00243_A13178ProForFT ;
   private String[] T00243_A770ProForPrd ;
   private java.math.BigDecimal[] T00243_A762ProForCan ;
   private String[] T00243_A763ProForCla ;
   private byte[] T00243_A1645ProForNro ;
   private byte[] T00243_A3379ProForTnq ;
   private String[] T00243_A5358ProForClv ;
   private String[] T00243_A13111ProForDe2 ;
   private String[] T00243_A396EmprCod ;
   private byte[] T00243_A490ForPrdUMe ;
   private String[] T002458_A13746ForPrdCDsc ;
   private String[] T002458_A396EmprCod ;
   private byte[] T002458_A490ForPrdUMe ;
   private String[] T00242_A764ProForCod ;
   private boolean[] T00242_n764ProForCod ;
   private short[] T00242_A767ProForLin ;
   private String[] T00242_A765ProForDes ;
   private java.math.BigDecimal[] T00242_A6062ProForCPo ;
   private String[] T00242_A13178ProForFT ;
   private String[] T00242_A770ProForPrd ;
   private java.math.BigDecimal[] T00242_A762ProForCan ;
   private String[] T00242_A763ProForCla ;
   private byte[] T00242_A1645ProForNro ;
   private byte[] T00242_A3379ProForTnq ;
   private String[] T00242_A5358ProForClv ;
   private String[] T00242_A13111ProForDe2 ;
   private String[] T00242_A396EmprCod ;
   private byte[] T00242_A490ForPrdUMe ;
   private String[] T002462_A710PrdFind ;
   private boolean[] T002462_n710PrdFind ;
   private String[] T002463_A396EmprCod ;
   private String[] T002463_A764ProForCod ;
   private boolean[] T002463_n764ProForCod ;
   private short[] T002463_A767ProForLin ;
   private String[] T002464_A396EmprCod ;
   private String[] T002464_A719PrdNum ;
   private String[] T002465_A13746ForPrdCDsc ;
   private String[] T002466_A13746ForPrdCDsc ;
   private String[] T002466_A396EmprCod ;
   private byte[] T002466_A490ForPrdUMe ;
   private String[] T002467_A407EmprNom ;
   private boolean[] T002467_n407EmprNom ;
   private String[] T002468_A710PrdFind ;
   private boolean[] T002468_n710PrdFind ;
   private String[] T002469_A13746ForPrdCDsc ;
   private String[] T002469_A396EmprCod ;
   private byte[] T002469_A490ForPrdUMe ;
   private String[] T002470_A488ForPrdDsc ;
   private boolean[] T002470_n488ForPrdDsc ;
   private byte[] T002473_A4340PrdUMeFind ;
   private boolean[] T002473_n4340PrdUMeFind ;
   private String[] T002474_A13746ForPrdCDsc ;
   private String[] T002474_A396EmprCod ;
   private byte[] T002474_A490ForPrdUMe ;
   private String[] T002480_A717PrdMaxFind ;
   private boolean[] T002480_n717PrdMaxFind ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprofor__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprofor__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprofor__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprofor__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprofor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00242", "SELECT ProForCod, ProForLin, ProForDes, ProForCPo, ProForFT, ProForPrd, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForDe2, EmprCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?  FOR UPDATE OF ProForDes, ProForCPo, ProForFT, ProForPrd, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForDe2, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00243", "SELECT ProForCod, ProForLin, ProForDes, ProForCPo, ProForFT, ProForPrd, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForDe2, EmprCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00246", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002412", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002413", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002414", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002415", "SELECT ProForCod, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ?  FOR UPDATE OF ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002416", "SELECT ProForCod, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002417", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002418", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProForCod, TM1.ProForDsc, TM1.ProForDsc2, TM1.ProForTie, TM1.ProForTmx, TM1.ProForMat, TM1.PorForFul, TM1.ProForUli, T2.EmprNom, TM1.ProNumPro, TM1.ProNumRec, TM1.ProRev, TM1.ProForPau, TM1.ProForRb, TM1.ProForCCi, TM1.ProForDCi, TM1.ProForTip, TM1.ProForLab, TM1.ProForAbs, TM1.ProForCos, TM1.ProforVl, TM1.ProH2O, TM1.ProForMer, TM1.ProForAct, TM1.ProForRs, TM1.EmprCod FROM (TXPCPROFO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? ORDER BY TM1.EmprCod, TM1.ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002419", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002420", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( ProForCod > ?) and EmprCod = ? ORDER BY EmprCod, ProForCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002421", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( ProForCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, ProForCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002422", "INSERT INTO TXPCPROFO(ProForCod, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod, ProForObs, ProFoLCU, ProForFac, IntCodF2, ProForFab, ProForCol, ProForPhx, ProForPhn, ProNh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T002423", "UPDATE TXPCPROFO SET ProForDsc=?, ProForDsc2=?, ProForTie=?, ProForTmx=?, ProForMat=?, PorForFul=?, ProForUli=?, ProNumPro=?, ProNumRec=?, ProRev=?, ProForPau=?, ProForRb=?, ProForCCi=?, ProForDCi=?, ProForTip=?, ProForLab=?, ProForAbs=?, ProForCos=?, ProforVl=?, ProH2O=?, ProForMer=?, ProForAct=?, ProForRs=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T002424", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new ForEachCursor("T002425", "SELECT * FROM (SELECT EmprCod, CliCod, CliProQui FROM TXPCLIPQU WHERE EmprCod = ? AND CliProQui = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002426", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002427", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq FROM TXPLAVMQ1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002428", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002429", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002430", "SELECT * FROM (SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002431", "SELECT * FROM (SELECT EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002432", "SELECT * FROM (SELECT EmprCod, ProForCod, Prg_Cod FROM TXPPQPRGN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002433", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND Acab_Ter = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002434", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002435", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma, C_Reclinpr FROM TXPCRECE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002436", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002437", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002438", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoQuC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002439", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002440", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002441", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin FROM TXPPRERE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002442", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod, FasProLin FROM TXPLForFa WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002443", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002444", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002445", "SELECT * FROM (SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002446", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002447", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002448", "UPDATE TXPCPROFO SET ProForUli=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new ForEachCursor("T002449", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002450", "SELECT T2.PrdNum, T1.ProForCod, T1.ProForLin, T1.ProForDes, T1.ProForCPo, T1.ProForFT, T1.ProForPrd, T3.ForPrdDsc, T1.ProForCan, T1.ProForCla, T1.ProForNro, T1.ProForTnq, T1.ProForClv, T1.ProForDe2, T1.EmprCod, T1.ForPrdUMe, COALESCE( T2.PrdNum, 'xxxxxx') AS PrdFind FROM ((TXPLPROFO T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.ProForPrd) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? and T1.ProForLin = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002451", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002452", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002453", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002454", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002455", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002456", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002457", "SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002458", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T002459", "INSERT INTO TXPLPROFO(ProForCod, ProForLin, ProForDes, ProForCPo, ProForFT, ProForPrd, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForDe2, EmprCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T002460", "UPDATE TXPLPROFO SET ProForDes=?, ProForCPo=?, ProForFT=?, ProForPrd=?, ProForCan=?, ProForCla=?, ProForNro=?, ProForTnq=?, ProForClv=?, ProForDe2=?, ForPrdUMe=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T002461", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new ForEachCursor("T002462", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002463", "SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002464", "SELECT * FROM (SELECT EmprCod, PrdNum FROM TXPPRODUC WHERE (EmprCod = ?) AND (UPPER(PrdNum) like '%' || UPPER(?)) ORDER BY PrdNum) WHERE rownum <= 50 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002465", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc FROM TXPUNMEPR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002466", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002467", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002468", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002469", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002470", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002473", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002474", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002480", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,4);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((String[]) buf[25])[0] = rslt.getString(25, 1);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((String[]) buf[14])[0] = rslt.getString(14, 40);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 62 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 40);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 16);
               stmt.setDate(7, (java.util.Date)parms[7]);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 1);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setString(14, (String)parms[14], 10);
               stmt.setString(15, (String)parms[15], 16);
               stmt.setString(16, (String)parms[16], 1);
               stmt.setString(17, (String)parms[17], 6);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 4);
               stmt.setInt(20, ((Number) parms[20]).intValue());
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 2);
               stmt.setString(23, (String)parms[23], 1);
               stmt.setString(24, (String)parms[24], 1);
               stmt.setString(25, (String)parms[25], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 16);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 6);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 4);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setString(22, (String)parms[21], 1);
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 3);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[25], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 43 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 44 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 47 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 49 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 26);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(5, (String)parms[5], 6);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               stmt.setString(8, (String)parms[8], 16);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 30);
               stmt.setString(12, (String)parms[12], 40);
               stmt.setString(13, (String)parms[13], 3);
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 30);
               stmt.setString(10, (String)parms[9], 40);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[13], 6);
               }
               stmt.setShort(14, ((Number) parms[14]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 57 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 64 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
      }
   }

}

