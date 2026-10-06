package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdeacabado_agrupacion_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6031Ac_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Ac_Barcod"))) ;
         A6032Ac_BarReo = (byte)(GXutil.lval( httpContext.GetPar( "Ac_BarReo"))) ;
         A6033Ac_BarPar = httpContext.GetPar( "Ac_BarPar") ;
         A6035Ac_Kilos = CommonUtil.decimalVal( httpContext.GetPar( "Ac_Kilos"), ".") ;
         n6035Ac_Kilos = false ;
         A6034Ac_Metros = CommonUtil.decimalVal( httpContext.GetPar( "Ac_Metros"), ".") ;
         n6034Ac_Metros = false ;
         A9839Ac_Abs = CommonUtil.decimalVal( httpContext.GetPar( "Ac_Abs"), ".") ;
         n9839Ac_Abs = false ;
         A118BarAcaQui = httpContext.GetPar( "BarAcaQui") ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A9840Ac_AcaQui = httpContext.GetPar( "Ac_AcaQui") ;
         n9840Ac_AcaQui = false ;
         AV17HumedoSeco = httpContext.GetPar( "HumedoSeco") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17HumedoSeco", AV17HumedoSeco);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMEDOSECO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17HumedoSeco, ""))));
         AV16FactAbs = CommonUtil.decimalVal( httpContext.GetPar( "FactAbs"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16FactAbs", GXutil.ltrimstr( AV16FactAbs, 6, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTABS", getSecureSignedToken( "", localUtil.format( AV16FactAbs, "ZZ9.99")));
         AV15Msg_errfa = httpContext.GetPar( "Msg_errfa") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Msg_errfa", AV15Msg_errfa);
         AV14MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14MaqCod, ""))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_22_1RI883( A396EmprCod, A6031Ac_Barcod, A6032Ac_BarReo, A6033Ac_BarPar, A6035Ac_Kilos, A6034Ac_Metros, A9839Ac_Abs, A118BarAcaQui, A9840Ac_AcaQui, AV17HumedoSeco, AV16FactAbs, AV15Msg_errfa, AV14MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6031Ac_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Ac_Barcod"))) ;
         A6032Ac_BarReo = (byte)(GXutil.lval( httpContext.GetPar( "Ac_BarReo"))) ;
         A6033Ac_BarPar = httpContext.GetPar( "Ac_BarPar") ;
         AV18MsgCtrl = httpContext.GetPar( "MsgCtrl") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MsgCtrl", AV18MsgCtrl);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_1RI883( A396EmprCod, A6031Ac_Barcod, A6032Ac_BarReo, A6033Ac_BarPar, AV18MsgCtrl) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A361DisCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_ac_") == 0 )
      {
         gxnrgridlevel_ac__newrow_invoke( ) ;
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
            AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
            AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
            AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
            AV16FactAbs = CommonUtil.decimalVal( httpContext.GetPar( "FactAbs"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FactAbs", GXutil.ltrimstr( AV16FactAbs, 6, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTABS", getSecureSignedToken( "", localUtil.format( AV16FactAbs, "ZZ9.99")));
            AV17HumedoSeco = httpContext.GetPar( "HumedoSeco") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17HumedoSeco", AV17HumedoSeco);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMEDOSECO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17HumedoSeco, ""))));
            AV14MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14MaqCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetasde Acabado (Agrupacion)", ""), (short)(0)) ;
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

   public void gxnrgridlevel_ac__newrow_invoke( )
   {
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_ac__newrow( ) ;
      /* End function gxnrGridlevel_ac__newrow_invoke */
   }

   public recetasdeacabado_agrupacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdeacabado_agrupacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado_agrupacion_impl.class ));
   }

   public recetasdeacabado_agrupacion_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N° Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAcaQui_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAcaQui_Internalname, httpContext.getMessage( "Acs Quimico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcaQui_Internalname, GXutil.rtrim( A118BarAcaQui), GXutil.rtrim( localUtil.format( A118BarAcaQui, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcaQui_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAcaQui_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado_Agrupacion.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_ac__Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_ac_( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado_Agrupacion.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_ac_( )
   {
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount883 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_883 = (short)(1) ;
            scanStart1RI883( ) ;
            while ( RcdFound883 != 0 )
            {
               init_level_properties883( ) ;
               getByPrimaryKey1RI883( ) ;
               addRow1RI883( ) ;
               scanNext1RI883( ) ;
            }
            scanEnd1RI883( ) ;
            nBlankRcdCount883 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1RI883( ) ;
         standaloneModal1RI883( ) ;
         sMode883 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1RI883( ) ;
            edtAc_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAc_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAc_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARPAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAc_Metros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_METROS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAc_Kilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_KILOS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAc_Pzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_PZS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Pzs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAc_Abs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ABS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Abs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Abs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAc_AcaQui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ACAQUI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_AcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_AcaQui_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            imgprompt_6031_6032_6033_Link = httpContext.cgiGet( "PROMPT_6031_6032_6033_"+sGXsfl_35_idx+"Link") ;
            if ( ( nRcdExists_883 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RI883( ) ;
            }
            sendRow1RI883( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount883 = (short)(5) ;
         nRcdExists_883 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1RI883( ) ;
            while ( RcdFound883 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_35883( ) ;
               init_level_properties883( ) ;
               standaloneNotModal1RI883( ) ;
               getByPrimaryKey1RI883( ) ;
               standaloneModal1RI883( ) ;
               addRow1RI883( ) ;
               scanNext1RI883( ) ;
            }
            scanEnd1RI883( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode883 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_35883( ) ;
         initAll1RI883( ) ;
         init_level_properties883( ) ;
         nRcdExists_883 = (short)(0) ;
         nIsMod_883 = (short)(0) ;
         nRcdDeleted_883 = (short)(0) ;
         nBlankRcdCount883 = (short)(nBlankRcdUsr883+nBlankRcdCount883) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount883 > 0 )
         {
            standaloneNotModal1RI883( ) ;
            standaloneModal1RI883( ) ;
            addRow1RI883( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAc_Barcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount883 = (short)(nBlankRcdCount883-1) ;
         }
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_ac_Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_ac_", Gridlevel_ac_Container, subGridlevel_ac__Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_ac_ContainerData", Gridlevel_ac_Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_ac_ContainerData"+"V", Gridlevel_ac_Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_ac_ContainerData"+"V"+"\" value='"+Gridlevel_ac_Container.GridValuesHidden()+"'/>") ;
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
      e111RI2 ();
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
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z118BarAcaQui = httpContext.cgiGet( "Z118BarAcaQui") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            A13900Ac_NHdr = httpContext.cgiGet( "AC_NHDR") ;
            AV15Msg_errfa = httpContext.cgiGet( "vMSG_ERRFA") ;
            AV18MsgCtrl = httpContext.cgiGet( "vMSGCTRL") ;
            AV19Torient = (short)(localUtil.ctol( httpContext.cgiGet( "vTORIENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23Clicodin = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Barsit_to = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARSIT_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
            A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n129BarCod = false ;
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
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeAcabado_Agrupacion");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("recetasdeacabado_agrupacion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                  sMode12 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode12 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound12 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RI0( ) ;
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
                        e111RI2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RI2 ();
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
         e121RI2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RI12( ) ;
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
         disableAttributes1RI12( ) ;
      }
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

   public void confirm_1RI0( )
   {
      beforeValidate1RI12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RI12( ) ;
         }
         else
         {
            checkExtendedTable1RI12( ) ;
            closeExtendedTableCursors1RI12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1RI883( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1RI883( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1RI883( ) ;
         if ( ( nRcdExists_883 != 0 ) || ( nIsMod_883 != 0 ) )
         {
            getKey1RI883( ) ;
            if ( ( nRcdExists_883 == 0 ) && ( nRcdDeleted_883 == 0 ) )
            {
               if ( RcdFound883 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RI883( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RI883( ) ;
                     closeExtendedTableCursors1RI883( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "AC_BARCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAc_Barcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound883 != 0 )
               {
                  if ( nRcdDeleted_883 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1RI883( ) ;
                     load1RI883( ) ;
                     beforeValidate1RI883( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RI883( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_883 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RI883( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RI883( ) ;
                           closeExtendedTableCursors1RI883( ) ;
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
                  if ( nRcdDeleted_883 == 0 )
                  {
                     GXCCtl = "AC_BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAc_Barcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarPar_Internalname, GXutil.rtrim( A6033Ac_BarPar)) ;
         httpContext.changePostValue( edtAc_Metros_Internalname, GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Kilos_Internalname, GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Abs_Internalname, GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_AcaQui_Internalname, GXutil.rtrim( A9840Ac_AcaQui)) ;
         httpContext.changePostValue( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_35_idx, GXutil.rtrim( Z6033Ac_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_35_idx, GXutil.rtrim( Z9840Ac_AcaQui)) ;
         httpContext.changePostValue( "nRcdDeleted_883_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_883_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_883_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_883 != 0 )
         {
            httpContext.changePostValue( "AC_BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_METROS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_KILOS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_PZS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ABS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ACAQUI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RI0( )
   {
   }

   public void e111RI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetasdeacabado_agrupacion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetasdeacabado_agrupacion_impl.this.AV7EmprCod = GXv_char2[0] ;
      recetasdeacabado_agrupacion_impl.this.AV21EmprNom = GXv_char3[0] ;
      recetasdeacabado_agrupacion_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      GXt_int5 = (byte)(AV19Torient) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int6) ;
      recetasdeacabado_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Torient = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Torient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Torient), 4, 0));
      AV23Clicodin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Clicodin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicodin), 6, 0));
      AV24Barsit_to = (byte)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Barsit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Barsit_to), 2, 0));
      GXt_char1 = AV20Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetasdeacabado_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char2[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetasdeacabado_agrupacion_impl.this.AV7EmprCod = GXv_char4[0] ;
      recetasdeacabado_agrupacion_impl.this.AV21EmprNom = GXv_char3[0] ;
      recetasdeacabado_agrupacion_impl.this.AV22UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      GXv_SdtWWPContext7[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV11WWPContext = GXv_SdtWWPContext7[0] ;
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e121RI2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1RI12( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01RI5_A361DisCod[0] ;
            Z2759BarMaqGru = T01RI5_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01RI5_A180BarMaqCod[0] ;
            Z118BarAcaQui = T01RI5_A118BarAcaQui[0] ;
            Z252CliCod = T01RI5_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z118BarAcaQui = A118BarAcaQui ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z118BarAcaQui = A118BarAcaQui ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarAcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Enabled), 5, 0), true);
      edtBarAcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8BarCod) )
      {
         A129BarCod = AV8BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV8BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCodReo) )
      {
         A132BarCodReo = AV9BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV9BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         A130BarCodPar = AV10BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
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
         /* Using cursor T01RI6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T01RI6_A407EmprNom[0] ;
         n407EmprNom = T01RI6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(4);
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      }
   }

   public void load1RI12( )
   {
      /* Using cursor T01RI8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01RI8_A361DisCod[0] ;
         A2759BarMaqGru = T01RI8_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01RI8_A180BarMaqCod[0] ;
         A407EmprNom = T01RI8_A407EmprNom[0] ;
         n407EmprNom = T01RI8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A118BarAcaQui = T01RI8_A118BarAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A252CliCod = T01RI8_A252CliCod[0] ;
         n252CliCod = T01RI8_n252CliCod[0] ;
         A252CliCod = T01RI8_A252CliCod[0] ;
         n252CliCod = T01RI8_n252CliCod[0] ;
         A365DisDes = T01RI8_A365DisDes[0] ;
         zm1RI12( -28) ;
      }
      pr_default.close(6);
      onLoadActions1RI12( ) ;
   }

   public void onLoadActions1RI12( )
   {
      /* Using cursor T01RI7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      A252CliCod = T01RI7_A252CliCod[0] ;
      n252CliCod = T01RI7_n252CliCod[0] ;
      A365DisDes = T01RI7_A365DisDes[0] ;
      pr_default.close(5);
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
   }

   public void checkExtendedTable1RI12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RI6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RI6_A407EmprNom[0] ;
      n407EmprNom = T01RI6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01RI7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01RI7_A252CliCod[0] ;
      n252CliCod = T01RI7_n252CliCod[0] ;
      A365DisDes = T01RI7_A365DisDes[0] ;
      pr_default.close(5);
      nIsDirty_12 = (short)(1) ;
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      nIsDirty_12 = (short)(1) ;
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
   }

   public void closeExtendedTableCursors1RI12( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_29( String A396EmprCod )
   {
      /* Using cursor T01RI9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RI9_A407EmprNom[0] ;
      n407EmprNom = T01RI9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_30( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01RI10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01RI10_A252CliCod[0] ;
      n252CliCod = T01RI10_n252CliCod[0] ;
      A365DisDes = T01RI10_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1RI12( )
   {
      /* Using cursor T01RI11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RI5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1RI12( 28) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01RI5_A361DisCod[0] ;
         A2759BarMaqGru = T01RI5_A2759BarMaqGru[0] ;
         A129BarCod = T01RI5_A129BarCod[0] ;
         n129BarCod = T01RI5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RI5_A132BarCodReo[0] ;
         n132BarCodReo = T01RI5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RI5_A130BarCodPar[0] ;
         n130BarCodPar = T01RI5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A180BarMaqCod = T01RI5_A180BarMaqCod[0] ;
         A118BarAcaQui = T01RI5_A118BarAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A396EmprCod = T01RI5_A396EmprCod[0] ;
         n396EmprCod = T01RI5_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01RI5_A252CliCod[0] ;
         n252CliCod = T01RI5_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RI12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1RI12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1RI12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1RI12( ) ;
      if ( RcdFound12 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01RI12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI12_A129BarCod[0] < A129BarCod ) || ( T01RI12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI12_A132BarCodReo[0] < A132BarCodReo ) || ( T01RI12_A132BarCodReo[0] == A132BarCodReo ) && ( T01RI12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RI12_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI12_A129BarCod[0] > A129BarCod ) || ( T01RI12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI12_A132BarCodReo[0] > A132BarCodReo ) || ( T01RI12_A132BarCodReo[0] == A132BarCodReo ) && ( T01RI12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RI12_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01RI12_A396EmprCod[0] ;
            n396EmprCod = T01RI12_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RI12_A129BarCod[0] ;
            n129BarCod = T01RI12_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RI12_A132BarCodReo[0] ;
            n132BarCodReo = T01RI12_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RI12_A130BarCodPar[0] ;
            n130BarCodPar = T01RI12_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01RI13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI13_A129BarCod[0] > A129BarCod ) || ( T01RI13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI13_A132BarCodReo[0] > A132BarCodReo ) || ( T01RI13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RI13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RI13_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI13_A129BarCod[0] < A129BarCod ) || ( T01RI13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RI13_A132BarCodReo[0] < A132BarCodReo ) || ( T01RI13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RI13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RI13_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01RI13_A396EmprCod[0] ;
            n396EmprCod = T01RI13_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RI13_A129BarCod[0] ;
            n129BarCod = T01RI13_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RI13_A132BarCodReo[0] ;
            n132BarCodReo = T01RI13_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RI13_A130BarCodPar[0] ;
            n130BarCodPar = T01RI13_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RI12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RI12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
               update1RI12( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RI12( ) ;
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
                  insert1RI12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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

   public void checkOptimisticConcurrency1RI12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RI4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T01RI4_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01RI4_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01RI4_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z118BarAcaQui, T01RI4_A118BarAcaQui[0]) != 0 ) || ( Z252CliCod != T01RI4_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T01RI4_A361DisCod[0] )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01RI4_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01RI4_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01RI4_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01RI4_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01RI4_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z118BarAcaQui, T01RI4_A118BarAcaQui[0]) != 0 )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"BarAcaQui");
               GXutil.writeLogRaw("Old: ",Z118BarAcaQui);
               GXutil.writeLogRaw("Current: ",T01RI4_A118BarAcaQui[0]);
            }
            if ( Z252CliCod != T01RI4_A252CliCod[0] )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01RI4_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RI12( )
   {
      beforeValidate1RI12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RI12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RI12( 0) ;
         checkOptimisticConcurrency1RI12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RI12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RI12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RI14 */
                  pr_default.execute(12, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, A118BarAcaQui, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(12) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RI12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RI12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RI0( ) ;
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
            load1RI12( ) ;
         }
         endLevel1RI12( ) ;
      }
      closeExtendedTableCursors1RI12( ) ;
   }

   public void update1RI12( )
   {
      beforeValidate1RI12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RI12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RI12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RI12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RI12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RI15 */
                  pr_default.execute(13, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, A118BarAcaQui, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RI12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int8[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char3[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3) ;
                     recetasdeacabado_agrupacion_impl.this.A396EmprCod = GXv_char4[0] ;
                     recetasdeacabado_agrupacion_impl.this.A129BarCod = GXv_int8[0] ;
                     recetasdeacabado_agrupacion_impl.this.A132BarCodReo = GXv_int6[0] ;
                     recetasdeacabado_agrupacion_impl.this.A130BarCodPar = GXv_char3[0] ;
                     updateTablesN11RI12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RI12( ) ;
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
         endLevel1RI12( ) ;
      }
      closeExtendedTableCursors1RI12( ) ;
   }

   public void deferredUpdate1RI12( )
   {
   }

   public void delete( )
   {
      beforeValidate1RI12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RI12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RI12( ) ;
         afterConfirm1RI12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RI12( ) ;
            if ( AnyError == 0 )
            {
               scanStart1RI883( ) ;
               while ( RcdFound883 != 0 )
               {
                  getByPrimaryKey1RI883( ) ;
                  delete1RI883( ) ;
                  scanNext1RI883( ) ;
               }
               scanEnd1RI883( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RI16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RI12( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RI12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RI12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RI17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T01RI17_A407EmprNom[0] ;
         n407EmprNom = T01RI17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         /* Using cursor T01RI18 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T01RI18_A252CliCod[0] ;
         n252CliCod = T01RI18_n252CliCod[0] ;
         A365DisDes = T01RI18_A365DisDes[0] ;
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RI19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01RI20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01RI21 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01RI22 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01RI23 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01RI24 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01RI25 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01RI26 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01RI27 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01RI28 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01RI29 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01RI30 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01RI31 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01RI32 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01RI33 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01RI34 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01RI35 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01RI36 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01RI37 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01RI38 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01RI39 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01RI40 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01RI41 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01RI42 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01RI43 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01RI44 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01RI45 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01RI46 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01RI47 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01RI48 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01RI49 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01RI50 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01RI51 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01RI52 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01RI53 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01RI54 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01RI55 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01RI56 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01RI57 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01RI58 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01RI59 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01RI60 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01RI61 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01RI62 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01RI63 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01RI64 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01RI65 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01RI66 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01RI67 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01RI68 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01RI69 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01RI70 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01RI71 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01RI72 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01RI73 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01RI74 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01RI75 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01RI76 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01RI77 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01RI78 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01RI79 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01RI80 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
      }
   }

   public void processNestedLevel1RI883( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1RI883( ) ;
         if ( ( nRcdExists_883 != 0 ) || ( nIsMod_883 != 0 ) )
         {
            standaloneNotModal1RI883( ) ;
            getKey1RI883( ) ;
            if ( ( nRcdExists_883 == 0 ) && ( nRcdDeleted_883 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RI883( ) ;
            }
            else
            {
               if ( RcdFound883 != 0 )
               {
                  if ( ( nRcdDeleted_883 != 0 ) && ( nRcdExists_883 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RI883( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_883 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RI883( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_883 == 0 )
                  {
                     GXCCtl = "AC_BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAc_Barcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarPar_Internalname, GXutil.rtrim( A6033Ac_BarPar)) ;
         httpContext.changePostValue( edtAc_Metros_Internalname, GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Kilos_Internalname, GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Abs_Internalname, GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_AcaQui_Internalname, GXutil.rtrim( A9840Ac_AcaQui)) ;
         httpContext.changePostValue( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_35_idx, GXutil.rtrim( Z6033Ac_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_35_idx, GXutil.rtrim( Z9840Ac_AcaQui)) ;
         httpContext.changePostValue( "nRcdDeleted_883_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_883_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_883_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_883 != 0 )
         {
            httpContext.changePostValue( "AC_BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_METROS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_KILOS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_PZS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ABS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ACAQUI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RI883( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_883 = (short)(0) ;
      nIsMod_883 = (short)(0) ;
      nRcdDeleted_883 = (short)(0) ;
   }

   public void processLevel1RI12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1RI883( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11RI12( )
   {
      /* Using cursor T01RI81 */
      pr_default.execute(79, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1RI12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RI12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetasdeacabado_agrupacion");
         if ( AnyError == 0 )
         {
            confirmValues1RI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "recetasdeacabado_agrupacion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RI12( )
   {
      /* Scan By routine */
      /* Using cursor T01RI82 */
      pr_default.execute(80);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01RI82_A396EmprCod[0] ;
         n396EmprCod = T01RI82_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RI82_A129BarCod[0] ;
         n129BarCod = T01RI82_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RI82_A132BarCodReo[0] ;
         n132BarCodReo = T01RI82_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RI82_A130BarCodPar[0] ;
         n130BarCodPar = T01RI82_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RI12( )
   {
      /* Scan next routine */
      pr_default.readNext(80);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01RI82_A396EmprCod[0] ;
         n396EmprCod = T01RI82_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RI82_A129BarCod[0] ;
         n129BarCod = T01RI82_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RI82_A132BarCodReo[0] ;
         n132BarCodReo = T01RI82_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RI82_A130BarCodPar[0] ;
         n130BarCodPar = T01RI82_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1RI12( )
   {
      pr_default.close(80);
   }

   public void afterConfirm1RI12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RI12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RI12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RI12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RI12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RI12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RI12( )
   {
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtBarAcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1RI883( int GX_JID )
   {
      if ( ( GX_JID == 31 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6034Ac_Metros = T01RI3_A6034Ac_Metros[0] ;
            Z6035Ac_Kilos = T01RI3_A6035Ac_Kilos[0] ;
            Z6036Ac_Pzs = T01RI3_A6036Ac_Pzs[0] ;
            Z9839Ac_Abs = T01RI3_A9839Ac_Abs[0] ;
            Z9840Ac_AcaQui = T01RI3_A9840Ac_AcaQui[0] ;
         }
         else
         {
            Z6034Ac_Metros = A6034Ac_Metros ;
            Z6035Ac_Kilos = A6035Ac_Kilos ;
            Z6036Ac_Pzs = A6036Ac_Pzs ;
            Z9839Ac_Abs = A9839Ac_Abs ;
            Z9840Ac_AcaQui = A9840Ac_AcaQui ;
         }
      }
      if ( GX_JID == -31 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z6031Ac_Barcod = A6031Ac_Barcod ;
         Z6032Ac_BarReo = A6032Ac_BarReo ;
         Z6033Ac_BarPar = A6033Ac_BarPar ;
         Z6034Ac_Metros = A6034Ac_Metros ;
         Z6035Ac_Kilos = A6035Ac_Kilos ;
         Z6036Ac_Pzs = A6036Ac_Pzs ;
         Z9839Ac_Abs = A9839Ac_Abs ;
         Z9840Ac_AcaQui = A9840Ac_AcaQui ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1RI883( )
   {
      edtAc_Metros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Pzs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Abs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Abs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Abs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_AcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_AcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_AcaQui_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void standaloneModal1RI883( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAc_Barcod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtAc_Barcod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAc_BarReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtAc_BarReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAc_BarPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtAc_BarPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1RI883( )
   {
      /* Using cursor T01RI83 */
      pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A6034Ac_Metros = T01RI83_A6034Ac_Metros[0] ;
         n6034Ac_Metros = T01RI83_n6034Ac_Metros[0] ;
         A6035Ac_Kilos = T01RI83_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = T01RI83_n6035Ac_Kilos[0] ;
         A6036Ac_Pzs = T01RI83_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = T01RI83_n6036Ac_Pzs[0] ;
         A9839Ac_Abs = T01RI83_A9839Ac_Abs[0] ;
         n9839Ac_Abs = T01RI83_n9839Ac_Abs[0] ;
         A9840Ac_AcaQui = T01RI83_A9840Ac_AcaQui[0] ;
         n9840Ac_AcaQui = T01RI83_n9840Ac_AcaQui[0] ;
         zm1RI883( -31) ;
      }
      pr_default.close(81);
      onLoadActions1RI883( ) ;
   }

   public void onLoadActions1RI883( )
   {
      A13900Ac_NHdr = GXutil.trim( GXutil.str( A6031Ac_Barcod, 8, 0)) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13900Ac_NHdr", A13900Ac_NHdr);
   }

   public void checkExtendedTable1RI883( )
   {
      nIsDirty_883 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1RI883( ) ;
      nIsDirty_883 = (short)(1) ;
      A13900Ac_NHdr = GXutil.trim( GXutil.str( A6031Ac_Barcod, 8, 0)) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13900Ac_NHdr", A13900Ac_NHdr);
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6031Ac_Barcod ;
         GXv_int6[0] = A6032Ac_BarReo ;
         GXv_char3[0] = A6033Ac_BarPar ;
         GXv_decimal9[0] = A6035Ac_Kilos ;
         GXv_decimal10[0] = A6034Ac_Metros ;
         GXv_decimal11[0] = A9839Ac_Abs ;
         GXv_char2[0] = A118BarAcaQui ;
         GXv_char12[0] = A9840Ac_AcaQui ;
         GXv_char13[0] = AV17HumedoSeco ;
         GXv_decimal14[0] = AV16FactAbs ;
         GXv_char15[0] = AV15Msg_errfa ;
         GXv_char16[0] = AV14MaqCod ;
         new app.prac010(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_char2, GXv_char12, GXv_char13, GXv_decimal14, GXv_char15, GXv_char16) ;
         recetasdeacabado_agrupacion_impl.this.A396EmprCod = GXv_char4[0] ;
         recetasdeacabado_agrupacion_impl.this.A6031Ac_Barcod = GXv_int8[0] ;
         recetasdeacabado_agrupacion_impl.this.A6032Ac_BarReo = GXv_int6[0] ;
         recetasdeacabado_agrupacion_impl.this.A6033Ac_BarPar = GXv_char3[0] ;
         recetasdeacabado_agrupacion_impl.this.A6035Ac_Kilos = GXv_decimal9[0] ;
         recetasdeacabado_agrupacion_impl.this.A6034Ac_Metros = GXv_decimal10[0] ;
         recetasdeacabado_agrupacion_impl.this.A9839Ac_Abs = GXv_decimal11[0] ;
         recetasdeacabado_agrupacion_impl.this.A118BarAcaQui = GXv_char2[0] ;
         recetasdeacabado_agrupacion_impl.this.A9840Ac_AcaQui = GXv_char12[0] ;
         recetasdeacabado_agrupacion_impl.this.AV17HumedoSeco = GXv_char13[0] ;
         recetasdeacabado_agrupacion_impl.this.AV16FactAbs = GXv_decimal14[0] ;
         recetasdeacabado_agrupacion_impl.this.AV15Msg_errfa = GXv_char15[0] ;
         recetasdeacabado_agrupacion_impl.this.AV14MaqCod = GXv_char16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         httpContext.ajax_rsp_assign_attri("", false, "AV17HumedoSeco", AV17HumedoSeco);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMEDOSECO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17HumedoSeco, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV16FactAbs", GXutil.ltrimstr( AV16FactAbs, 6, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTABS", getSecureSignedToken( "", localUtil.format( AV16FactAbs, "ZZ9.99")));
         httpContext.ajax_rsp_assign_attri("", false, "AV15Msg_errfa", AV15Msg_errfa);
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14MaqCod, ""))));
      }
      if ( true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int8[0] = A6031Ac_Barcod ;
         GXv_int6[0] = A6032Ac_BarReo ;
         GXv_char15[0] = A6033Ac_BarPar ;
         GXv_char13[0] = AV18MsgCtrl ;
         new app.pprc201(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_int6, GXv_char15, GXv_char13) ;
         recetasdeacabado_agrupacion_impl.this.A396EmprCod = GXv_char16[0] ;
         recetasdeacabado_agrupacion_impl.this.A6031Ac_Barcod = GXv_int8[0] ;
         recetasdeacabado_agrupacion_impl.this.A6032Ac_BarReo = GXv_int6[0] ;
         recetasdeacabado_agrupacion_impl.this.A6033Ac_BarPar = GXv_char15[0] ;
         recetasdeacabado_agrupacion_impl.this.AV18MsgCtrl = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV18MsgCtrl", AV18MsgCtrl);
      }
      if ( true /* After */ && ( GXutil.strcmp(AV18MsgCtrl, " ") != 0 ) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(AV18MsgCtrl, 0, GXCCtl);
      }
      if ( ( A129BarCod == A6031Ac_Barcod ) && ( A132BarCodReo == A6032Ac_BarReo ) && ( GXutil.strcmp(A130BarCodPar, A6033Ac_BarPar) == 0 ) )
      {
         GXCCtl = "AC_BARCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Misma Hdr en Cabecera que en Lineas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_Barcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* After */ && ( AV19Torient == 1 ) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(AV15Msg_errfa, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* After */ && (0==AV19Torient) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(AV15Msg_errfa, 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors1RI883( )
   {
   }

   public void enableDisable1RI883( )
   {
   }

   public void getKey1RI883( )
   {
      /* Using cursor T01RI84 */
      pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(82) != 101) )
      {
         RcdFound883 = (short)(1) ;
      }
      else
      {
         RcdFound883 = (short)(0) ;
      }
      pr_default.close(82);
   }

   public void getByPrimaryKey1RI883( )
   {
      /* Using cursor T01RI3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RI883( 31) ;
         RcdFound883 = (short)(1) ;
         initializeNonKey1RI883( ) ;
         A6031Ac_Barcod = T01RI3_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = T01RI3_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = T01RI3_A6033Ac_BarPar[0] ;
         A6034Ac_Metros = T01RI3_A6034Ac_Metros[0] ;
         n6034Ac_Metros = T01RI3_n6034Ac_Metros[0] ;
         A6035Ac_Kilos = T01RI3_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = T01RI3_n6035Ac_Kilos[0] ;
         A6036Ac_Pzs = T01RI3_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = T01RI3_n6036Ac_Pzs[0] ;
         A9839Ac_Abs = T01RI3_A9839Ac_Abs[0] ;
         n9839Ac_Abs = T01RI3_n9839Ac_Abs[0] ;
         A9840Ac_AcaQui = T01RI3_A9840Ac_AcaQui[0] ;
         n9840Ac_AcaQui = T01RI3_n9840Ac_AcaQui[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z6031Ac_Barcod = A6031Ac_Barcod ;
         Z6032Ac_BarReo = A6032Ac_BarReo ;
         Z6033Ac_BarPar = A6033Ac_BarPar ;
         sMode883 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RI883( ) ;
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound883 = (short)(0) ;
         initializeNonKey1RI883( ) ;
         sMode883 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RI883( ) ;
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RI883( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RI883( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RI2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRACA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6034Ac_Metros, T01RI2_A6034Ac_Metros[0]) != 0 ) || ( DecimalUtil.compareTo(Z6035Ac_Kilos, T01RI2_A6035Ac_Kilos[0]) != 0 ) || ( Z6036Ac_Pzs != T01RI2_A6036Ac_Pzs[0] ) || ( DecimalUtil.compareTo(Z9839Ac_Abs, T01RI2_A9839Ac_Abs[0]) != 0 ) || ( GXutil.strcmp(Z9840Ac_AcaQui, T01RI2_A9840Ac_AcaQui[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6034Ac_Metros, T01RI2_A6034Ac_Metros[0]) != 0 )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"Ac_Metros");
               GXutil.writeLogRaw("Old: ",Z6034Ac_Metros);
               GXutil.writeLogRaw("Current: ",T01RI2_A6034Ac_Metros[0]);
            }
            if ( DecimalUtil.compareTo(Z6035Ac_Kilos, T01RI2_A6035Ac_Kilos[0]) != 0 )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"Ac_Kilos");
               GXutil.writeLogRaw("Old: ",Z6035Ac_Kilos);
               GXutil.writeLogRaw("Current: ",T01RI2_A6035Ac_Kilos[0]);
            }
            if ( Z6036Ac_Pzs != T01RI2_A6036Ac_Pzs[0] )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"Ac_Pzs");
               GXutil.writeLogRaw("Old: ",Z6036Ac_Pzs);
               GXutil.writeLogRaw("Current: ",T01RI2_A6036Ac_Pzs[0]);
            }
            if ( DecimalUtil.compareTo(Z9839Ac_Abs, T01RI2_A9839Ac_Abs[0]) != 0 )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"Ac_Abs");
               GXutil.writeLogRaw("Old: ",Z9839Ac_Abs);
               GXutil.writeLogRaw("Current: ",T01RI2_A9839Ac_Abs[0]);
            }
            if ( GXutil.strcmp(Z9840Ac_AcaQui, T01RI2_A9840Ac_AcaQui[0]) != 0 )
            {
               GXutil.writeLogln("recetasdeacabado_agrupacion:[seudo value changed for attri]"+"Ac_AcaQui");
               GXutil.writeLogRaw("Old: ",Z9840Ac_AcaQui);
               GXutil.writeLogRaw("Current: ",T01RI2_A9840Ac_AcaQui[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRACA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RI883( )
   {
      beforeValidate1RI883( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RI883( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RI883( 0) ;
         checkOptimisticConcurrency1RI883( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RI883( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RI883( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RI85 */
                  pr_default.execute(83, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar, Boolean.valueOf(n6034Ac_Metros), A6034Ac_Metros, Boolean.valueOf(n6035Ac_Kilos), A6035Ac_Kilos, Boolean.valueOf(n6036Ac_Pzs), Short.valueOf(A6036Ac_Pzs), Boolean.valueOf(n9839Ac_Abs), A9839Ac_Abs, Boolean.valueOf(n9840Ac_AcaQui), A9840Ac_AcaQui, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
                  if ( (pr_default.getStatus(83) == 1) )
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
            load1RI883( ) ;
         }
         endLevel1RI883( ) ;
      }
      closeExtendedTableCursors1RI883( ) ;
   }

   public void update1RI883( )
   {
      beforeValidate1RI883( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RI883( ) ;
      }
      if ( ( nIsMod_883 != 0 ) || ( nIsDirty_883 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RI883( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RI883( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RI883( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01RI86 */
                     pr_default.execute(84, new Object[] {Boolean.valueOf(n6034Ac_Metros), A6034Ac_Metros, Boolean.valueOf(n6035Ac_Kilos), A6035Ac_Kilos, Boolean.valueOf(n6036Ac_Pzs), Short.valueOf(A6036Ac_Pzs), Boolean.valueOf(n9839Ac_Abs), A9839Ac_Abs, Boolean.valueOf(n9840Ac_AcaQui), A9840Ac_AcaQui, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
                     if ( (pr_default.getStatus(84) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRACA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1RI883( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char16[0] = A396EmprCod ;
                        GXv_int8[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char15[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_int6, GXv_char15) ;
                        recetasdeacabado_agrupacion_impl.this.A396EmprCod = GXv_char16[0] ;
                        recetasdeacabado_agrupacion_impl.this.A129BarCod = GXv_int8[0] ;
                        recetasdeacabado_agrupacion_impl.this.A132BarCodReo = GXv_int6[0] ;
                        recetasdeacabado_agrupacion_impl.this.A130BarCodPar = GXv_char15[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RI883( ) ;
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
            endLevel1RI883( ) ;
         }
      }
      closeExtendedTableCursors1RI883( ) ;
   }

   public void deferredUpdate1RI883( )
   {
   }

   public void delete1RI883( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RI883( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RI883( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RI883( ) ;
         afterConfirm1RI883( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RI883( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RI87 */
               pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
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
      sMode883 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RI883( ) ;
      Gx_mode = sMode883 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RI883( )
   {
      standaloneModal1RI883( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13900Ac_NHdr = GXutil.trim( GXutil.str( A6031Ac_Barcod, 8, 0)) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13900Ac_NHdr", A13900Ac_NHdr);
      }
   }

   public void endLevel1RI883( )
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

   public void scanStart1RI883( )
   {
      /* Scan By routine */
      /* Using cursor T01RI88 */
      pr_default.execute(86, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound883 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A6031Ac_Barcod = T01RI88_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = T01RI88_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = T01RI88_A6033Ac_BarPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RI883( )
   {
      /* Scan next routine */
      pr_default.readNext(86);
      RcdFound883 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A6031Ac_Barcod = T01RI88_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = T01RI88_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = T01RI88_A6033Ac_BarPar[0] ;
      }
   }

   public void scanEnd1RI883( )
   {
      pr_default.close(86);
   }

   public void afterConfirm1RI883( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RI883( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RI883( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RI883( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RI883( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RI883( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RI883( )
   {
      edtAc_Barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_BarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_BarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Metros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Pzs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Abs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Abs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Abs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_AcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_AcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_AcaQui_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashes1RI883( )
   {
   }

   public void send_integrity_lvl_hashes1RI12( )
   {
   }

   public void subsflControlProps_35883( )
   {
      edtAc_Barcod_Internalname = "AC_BARCOD_"+sGXsfl_35_idx ;
      edtAc_BarReo_Internalname = "AC_BARREO_"+sGXsfl_35_idx ;
      edtAc_BarPar_Internalname = "AC_BARPAR_"+sGXsfl_35_idx ;
      imgprompt_6031_6032_6033_Internalname = "PROMPT_6031_6032_6033_"+sGXsfl_35_idx ;
      edtAc_Metros_Internalname = "AC_METROS_"+sGXsfl_35_idx ;
      edtAc_Kilos_Internalname = "AC_KILOS_"+sGXsfl_35_idx ;
      edtAc_Pzs_Internalname = "AC_PZS_"+sGXsfl_35_idx ;
      edtAc_Abs_Internalname = "AC_ABS_"+sGXsfl_35_idx ;
      edtAc_AcaQui_Internalname = "AC_ACAQUI_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_35883( )
   {
      edtAc_Barcod_Internalname = "AC_BARCOD_"+sGXsfl_35_fel_idx ;
      edtAc_BarReo_Internalname = "AC_BARREO_"+sGXsfl_35_fel_idx ;
      edtAc_BarPar_Internalname = "AC_BARPAR_"+sGXsfl_35_fel_idx ;
      imgprompt_6031_6032_6033_Internalname = "PROMPT_6031_6032_6033_"+sGXsfl_35_fel_idx ;
      edtAc_Metros_Internalname = "AC_METROS_"+sGXsfl_35_fel_idx ;
      edtAc_Kilos_Internalname = "AC_KILOS_"+sGXsfl_35_fel_idx ;
      edtAc_Pzs_Internalname = "AC_PZS_"+sGXsfl_35_fel_idx ;
      edtAc_Abs_Internalname = "AC_ABS_"+sGXsfl_35_fel_idx ;
      edtAc_AcaQui_Internalname = "AC_ACAQUI_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1RI883( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35883( ) ;
      sendRow1RI883( ) ;
   }

   public void sendRow1RI883( )
   {
      Gridlevel_ac_Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_ac__Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_ac__Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_ac__Class, "") != 0 )
         {
            subGridlevel_ac__Linesclass = subGridlevel_ac__Class+"Odd" ;
         }
      }
      else if ( subGridlevel_ac__Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_ac__Backstyle = (byte)(0) ;
         subGridlevel_ac__Backcolor = subGridlevel_ac__Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_ac__Class, "") != 0 )
         {
            subGridlevel_ac__Linesclass = subGridlevel_ac__Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_ac__Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_ac__Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_ac__Class, "") != 0 )
         {
            subGridlevel_ac__Linesclass = subGridlevel_ac__Class+"Odd" ;
         }
         subGridlevel_ac__Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_ac__Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_ac__Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
         {
            subGridlevel_ac__Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_ac__Class, "") != 0 )
            {
               subGridlevel_ac__Linesclass = subGridlevel_ac__Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_ac__Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_ac__Class, "") != 0 )
            {
               subGridlevel_ac__Linesclass = subGridlevel_ac__Class+"Odd" ;
            }
         }
      }
      imgprompt_6031_6032_6033_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.ttrn04prompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"AC_BARCOD_"+sGXsfl_35_idx+"'), id:'"+"AC_BARCOD_"+sGXsfl_35_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"AC_BARREO_"+sGXsfl_35_idx+"'), id:'"+"AC_BARREO_"+sGXsfl_35_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"AC_BARPAR_"+sGXsfl_35_idx+"'), id:'"+"AC_BARPAR_"+sGXsfl_35_idx+"'"+",IOType:'inout'}"+","+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.ltrim( localUtil.ntoc( AV23Clicodin, (byte)(6), (byte)(0), ".", "")), "'", "\\'"))+"'"+","+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.ltrim( localUtil.ntoc( AV24Barsit_to, (byte)(2), (byte)(0), ".", "")), "'", "\\'"))+"'"+"],"+"gx.dom.form()."+"nIsMod_883_"+sGXsfl_35_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Barcod_Internalname,GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6031Ac_Barcod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_Barcod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_BarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6032Ac_BarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_BarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_BarReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_BarPar_Internalname,GXutil.rtrim( A6033Ac_BarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_BarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_BarPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_6031_6032_6033_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_6031_6032_6033_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_ac_Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_6031_6032_6033_Internalname,sImgUrl,imgprompt_6031_6032_6033_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_6031_6032_6033_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Metros_Internalname,GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Metros_Enabled!=0) ? localUtil.format( A6034Ac_Metros, "ZZZZZ9.99") : localUtil.format( A6034Ac_Metros, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Metros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_Metros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Kilos_Internalname,GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Kilos_Enabled!=0) ? localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99") : localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Kilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_Kilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Pzs_Internalname,GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6036Ac_Pzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6036Ac_Pzs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Pzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_Pzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Abs_Internalname,GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Abs_Enabled!=0) ? localUtil.format( A9839Ac_Abs, "ZZ9.99") : localUtil.format( A9839Ac_Abs, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Abs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_Abs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_ac_Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_AcaQui_Internalname,GXutil.rtrim( A9840Ac_AcaQui),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_AcaQui_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAc_AcaQui_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_ac_Row);
      send_integrity_lvl_hashes1RI883( ) ;
      GXCCtl = "Z6031Ac_Barcod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6032Ac_BarReo_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6033Ac_BarPar_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6033Ac_BarPar));
      GXCCtl = "Z6034Ac_Metros_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6035Ac_Kilos_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6036Ac_Pzs_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9839Ac_Abs_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9840Ac_AcaQui_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9840Ac_AcaQui));
      GXCCtl = "nRcdDeleted_883_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_883_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_883_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10BarCodPar));
      GXCCtl = "vFACTABS_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV16FactAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vHUMEDOSECO_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV17HumedoSeco));
      GXCCtl = "vMAQCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV14MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_METROS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_KILOS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_PZS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_ABS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_ACAQUI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_6031_6032_6033_"+sGXsfl_35_idx+"Link", GXutil.rtrim( imgprompt_6031_6032_6033_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_ac_Container.AddRow(Gridlevel_ac_Row);
   }

   public void readRow1RI883( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35883( ) ;
      edtAc_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARPAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Metros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_METROS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Kilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_KILOS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Pzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_PZS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Abs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ABS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_AcaQui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ACAQUI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_6031_6032_6033_Link = httpContext.cgiGet( "PROMPT_6031_6032_6033_"+sGXsfl_35_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "AC_BARCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_Barcod_Internalname ;
         wbErr = true ;
         A6031Ac_Barcod = 0 ;
      }
      else
      {
         A6031Ac_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "AC_BARREO_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarReo_Internalname ;
         wbErr = true ;
         A6032Ac_BarReo = (byte)(0) ;
      }
      else
      {
         A6032Ac_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6033Ac_BarPar = httpContext.cgiGet( edtAc_BarPar_Internalname) ;
      A6034Ac_Metros = localUtil.ctond( httpContext.cgiGet( edtAc_Metros_Internalname)) ;
      n6034Ac_Metros = false ;
      A6035Ac_Kilos = localUtil.ctond( httpContext.cgiGet( edtAc_Kilos_Internalname)) ;
      n6035Ac_Kilos = false ;
      A6036Ac_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n6036Ac_Pzs = false ;
      A9839Ac_Abs = localUtil.ctond( httpContext.cgiGet( edtAc_Abs_Internalname)) ;
      n9839Ac_Abs = false ;
      A9840Ac_AcaQui = httpContext.cgiGet( edtAc_AcaQui_Internalname) ;
      n9840Ac_AcaQui = false ;
      GXCCtl = "Z6031Ac_Barcod_" + sGXsfl_35_idx ;
      Z6031Ac_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6032Ac_BarReo_" + sGXsfl_35_idx ;
      Z6032Ac_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6033Ac_BarPar_" + sGXsfl_35_idx ;
      Z6033Ac_BarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6034Ac_Metros_" + sGXsfl_35_idx ;
      Z6034Ac_Metros = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6035Ac_Kilos_" + sGXsfl_35_idx ;
      Z6035Ac_Kilos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6036Ac_Pzs_" + sGXsfl_35_idx ;
      Z6036Ac_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9839Ac_Abs_" + sGXsfl_35_idx ;
      Z9839Ac_Abs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9840Ac_AcaQui_" + sGXsfl_35_idx ;
      Z9840Ac_AcaQui = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_883_" + sGXsfl_35_idx ;
      nRcdDeleted_883 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_883_" + sGXsfl_35_idx ;
      nRcdExists_883 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_883_" + sGXsfl_35_idx ;
      nIsMod_883 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAc_AcaQui_Enabled = edtAc_AcaQui_Enabled ;
      defedtAc_Abs_Enabled = edtAc_Abs_Enabled ;
      defedtAc_Pzs_Enabled = edtAc_Pzs_Enabled ;
      defedtAc_Kilos_Enabled = edtAc_Kilos_Enabled ;
      defedtAc_Metros_Enabled = edtAc_Metros_Enabled ;
      defedtAc_BarPar_Enabled = edtAc_BarPar_Enabled ;
      defedtAc_BarReo_Enabled = edtAc_BarReo_Enabled ;
      defedtAc_Barcod_Enabled = edtAc_Barcod_Enabled ;
   }

   public void confirmValues1RI0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35883( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_35883( ) ;
         httpContext.changePostValue( "Z6031Ac_Barcod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6032Ac_BarReo_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6033Ac_BarPar_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6034Ac_Metros_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6035Ac_Kilos_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6036Ac_Pzs_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z9839Ac_Abs_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z9840Ac_AcaQui_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_35_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabado_agrupacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV16FactAbs)),GXutil.URLEncode(GXutil.rtrim(AV17HumedoSeco)),GXutil.URLEncode(GXutil.rtrim(AV14MaqCod))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","FactAbs","HumedoSeco","MaqCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeAcabado_Agrupacion");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdeacabado_agrupacion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z118BarAcaQui", GXutil.rtrim( Z118BarAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACTABS", GXutil.ltrim( localUtil.ntoc( AV16FactAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTABS", getSecureSignedToken( "", localUtil.format( AV16FactAbs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHUMEDOSECO", GXutil.rtrim( AV17HumedoSeco));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMEDOSECO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17HumedoSeco, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV14MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV10BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_NHDR", GXutil.rtrim( A13900Ac_NHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRFA", AV15Msg_errfa);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGCTRL", AV18MsgCtrl);
      app.GxWebStd.gx_hidden_field( httpContext, "vTORIENT", GXutil.ltrim( localUtil.ntoc( AV19Torient, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODIN", GXutil.ltrim( localUtil.ntoc( AV23Clicodin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV24Barsit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.recetasdeacabado_agrupacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV16FactAbs)),GXutil.URLEncode(GXutil.rtrim(AV17HumedoSeco)),GXutil.URLEncode(GXutil.rtrim(AV14MaqCod))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","FactAbs","HumedoSeco","MaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeAcabado_Agrupacion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetasde Acabado (Agrupacion)", "") ;
   }

   public void initializeNonKey1RI12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A13696BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A118BarAcaQui = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z118BarAcaQui = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1RI12( )
   {
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1RI12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1RI883( )
   {
      AV15Msg_errfa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Msg_errfa", AV15Msg_errfa);
      AV18MsgCtrl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MsgCtrl", AV18MsgCtrl);
      A13900Ac_NHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13900Ac_NHdr", A13900Ac_NHdr);
      A6034Ac_Metros = DecimalUtil.ZERO ;
      n6034Ac_Metros = false ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      n6035Ac_Kilos = false ;
      A6036Ac_Pzs = (short)(0) ;
      n6036Ac_Pzs = false ;
      A9839Ac_Abs = DecimalUtil.ZERO ;
      n9839Ac_Abs = false ;
      A9840Ac_AcaQui = "" ;
      n9840Ac_AcaQui = false ;
      Z6034Ac_Metros = DecimalUtil.ZERO ;
      Z6035Ac_Kilos = DecimalUtil.ZERO ;
      Z6036Ac_Pzs = (short)(0) ;
      Z9839Ac_Abs = DecimalUtil.ZERO ;
      Z9840Ac_AcaQui = "" ;
   }

   public void initAll1RI883( )
   {
      A6031Ac_Barcod = 0 ;
      A6032Ac_BarReo = (byte)(0) ;
      A6033Ac_BarPar = "" ;
      initializeNonKey1RI883( ) ;
   }

   public void standaloneModalInsert1RI883( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211694748", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabado_agrupacion.js", "?20268211694748", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties883( )
   {
      edtAc_AcaQui_Enabled = defedtAc_AcaQui_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_AcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_AcaQui_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Abs_Enabled = defedtAc_Abs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Abs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Abs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Pzs_Enabled = defedtAc_Pzs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Pzs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Kilos_Enabled = defedtAc_Kilos_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Metros_Enabled = defedtAc_Metros_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_BarPar_Enabled = defedtAc_BarPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_BarReo_Enabled = defedtAc_BarReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAc_Barcod_Enabled = defedtAc_Barcod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
   {
      Gridlevel_ac_Container.AddObjectProperty("GridName", "Gridlevel_ac_");
      Gridlevel_ac_Container.AddObjectProperty("Header", subGridlevel_ac__Header);
      Gridlevel_ac_Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_ac_Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("CmpContext", "");
      Gridlevel_ac_Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.rtrim( A6033Ac_BarPar));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_ac_Column.AddObjectProperty("Value", GXutil.rtrim( A9840Ac_AcaQui));
      Gridlevel_ac_Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddColumnProperties(Gridlevel_ac_Column);
      Gridlevel_ac_Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_ac_Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_ac__Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarAcaQui_Internalname = "BARACAQUI" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAc_Barcod_Internalname = "AC_BARCOD" ;
      edtAc_BarReo_Internalname = "AC_BARREO" ;
      edtAc_BarPar_Internalname = "AC_BARPAR" ;
      edtAc_Metros_Internalname = "AC_METROS" ;
      edtAc_Kilos_Internalname = "AC_KILOS" ;
      edtAc_Pzs_Internalname = "AC_PZS" ;
      edtAc_Abs_Internalname = "AC_ABS" ;
      edtAc_AcaQui_Internalname = "AC_ACAQUI" ;
      divTableleaflevel_ac__Internalname = "TABLELEAFLEVEL_AC_" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_6031_6032_6033_Internalname = "PROMPT_6031_6032_6033" ;
      subGridlevel_ac__Internalname = "GRIDLEVEL_AC_" ;
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
      subGridlevel_ac__Allowcollapsing = (byte)(0) ;
      subGridlevel_ac__Allowselection = (byte)(0) ;
      subGridlevel_ac__Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recetasde Acabado (Agrupacion)", "") );
      edtAc_AcaQui_Jsonclick = "" ;
      edtAc_Abs_Jsonclick = "" ;
      edtAc_Pzs_Jsonclick = "" ;
      edtAc_Kilos_Jsonclick = "" ;
      edtAc_Metros_Jsonclick = "" ;
      imgprompt_6031_6032_6033_Visible = 1 ;
      imgprompt_6031_6032_6033_Link = "" ;
      imgprompt_6031_6032_6033_Visible = 1 ;
      edtAc_BarPar_Jsonclick = "" ;
      edtAc_BarReo_Jsonclick = "" ;
      edtAc_Barcod_Jsonclick = "" ;
      subGridlevel_ac__Class = "GridNoBorder WorkWith" ;
      subGridlevel_ac__Backcolorstyle = (byte)(0) ;
      edtAc_AcaQui_Enabled = 0 ;
      edtAc_Abs_Enabled = 0 ;
      edtAc_Pzs_Enabled = 0 ;
      edtAc_Kilos_Enabled = 0 ;
      edtAc_Metros_Enabled = 0 ;
      edtAc_BarPar_Enabled = 1 ;
      edtAc_BarReo_Enabled = 1 ;
      edtAc_Barcod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtBarAcaQui_Jsonclick = "" ;
      edtBarAcaQui_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
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

   public void xc_22_1RI883( String A396EmprCod ,
                             int A6031Ac_Barcod ,
                             byte A6032Ac_BarReo ,
                             String A6033Ac_BarPar ,
                             java.math.BigDecimal A6035Ac_Kilos ,
                             java.math.BigDecimal A6034Ac_Metros ,
                             java.math.BigDecimal A9839Ac_Abs ,
                             String A118BarAcaQui ,
                             String A9840Ac_AcaQui ,
                             String AV17HumedoSeco ,
                             java.math.BigDecimal AV16FactAbs ,
                             String AV15Msg_errfa ,
                             String AV14MaqCod )
   {
      if ( true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int8[0] = A6031Ac_Barcod ;
         GXv_int6[0] = A6032Ac_BarReo ;
         GXv_char15[0] = A6033Ac_BarPar ;
         GXv_decimal14[0] = A6035Ac_Kilos ;
         GXv_decimal11[0] = A6034Ac_Metros ;
         GXv_decimal10[0] = A9839Ac_Abs ;
         GXv_char13[0] = A118BarAcaQui ;
         GXv_char12[0] = A9840Ac_AcaQui ;
         GXv_char4[0] = AV17HumedoSeco ;
         GXv_decimal9[0] = AV16FactAbs ;
         GXv_char3[0] = AV15Msg_errfa ;
         GXv_char2[0] = AV14MaqCod ;
         new app.prac010(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_int6, GXv_char15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_char13, GXv_char12, GXv_char4, GXv_decimal9, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char16[0] ;
         A6031Ac_Barcod = GXv_int8[0] ;
         A6032Ac_BarReo = GXv_int6[0] ;
         A6033Ac_BarPar = GXv_char15[0] ;
         A6035Ac_Kilos = GXv_decimal14[0] ;
         A6034Ac_Metros = GXv_decimal11[0] ;
         A9839Ac_Abs = GXv_decimal10[0] ;
         A118BarAcaQui = GXv_char13[0] ;
         A9840Ac_AcaQui = GXv_char12[0] ;
         AV17HumedoSeco = GXv_char4[0] ;
         AV16FactAbs = GXv_decimal9[0] ;
         AV15Msg_errfa = GXv_char3[0] ;
         AV14MaqCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         httpContext.ajax_rsp_assign_attri("", false, "AV17HumedoSeco", AV17HumedoSeco);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMEDOSECO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17HumedoSeco, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV16FactAbs", GXutil.ltrimstr( AV16FactAbs, 6, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTABS", getSecureSignedToken( "", localUtil.format( AV16FactAbs, "ZZ9.99")));
         httpContext.ajax_rsp_assign_attri("", false, "AV15Msg_errfa", AV15Msg_errfa);
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14MaqCod, ""))));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6033Ac_BarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A118BarAcaQui))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9840Ac_AcaQui))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV17HumedoSeco))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16FactAbs, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV15Msg_errfa)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV14MaqCod))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_1RI883( String A396EmprCod ,
                             int A6031Ac_Barcod ,
                             byte A6032Ac_BarReo ,
                             String A6033Ac_BarPar ,
                             String AV18MsgCtrl )
   {
      if ( true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int8[0] = A6031Ac_Barcod ;
         GXv_int6[0] = A6032Ac_BarReo ;
         GXv_char15[0] = A6033Ac_BarPar ;
         GXv_char13[0] = AV18MsgCtrl ;
         new app.pprc201(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_int6, GXv_char15, GXv_char13) ;
         A396EmprCod = GXv_char16[0] ;
         A6031Ac_Barcod = GXv_int8[0] ;
         A6032Ac_BarReo = GXv_int6[0] ;
         A6033Ac_BarPar = GXv_char15[0] ;
         AV18MsgCtrl = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV18MsgCtrl", AV18MsgCtrl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6033Ac_BarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV18MsgCtrl)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_ac__newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_35883( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RI883( ) ;
         standaloneModal1RI883( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RI883( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_35883( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_ac_Container)) ;
      /* End function gxnrGridlevel_ac__newrow */
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
      n396EmprCod = false ;
      n407EmprNom = false ;
      n252CliCod = false ;
      /* Using cursor T01RI17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01RI17_A407EmprNom[0] ;
      n407EmprNom = T01RI17_n407EmprNom[0] ;
      pr_default.close(15);
      /* Using cursor T01RI18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A252CliCod = T01RI18_A252CliCod[0] ;
      n252CliCod = T01RI18_n252CliCod[0] ;
      A365DisDes = T01RI18_A365DisDes[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
   }

   public void valid_Ac_barpar( )
   {
      n9840Ac_AcaQui = false ;
      n9839Ac_Abs = false ;
      n6034Ac_Metros = false ;
      n6035Ac_Kilos = false ;
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      A13900Ac_NHdr = GXutil.trim( GXutil.str( A6031Ac_Barcod, 8, 0)) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar ;
      if ( true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int8[0] = A6031Ac_Barcod ;
         GXv_int6[0] = A6032Ac_BarReo ;
         GXv_char15[0] = A6033Ac_BarPar ;
         GXv_decimal14[0] = A6035Ac_Kilos ;
         GXv_decimal11[0] = A6034Ac_Metros ;
         GXv_decimal10[0] = A9839Ac_Abs ;
         GXv_char13[0] = A118BarAcaQui ;
         GXv_char12[0] = A9840Ac_AcaQui ;
         GXv_char4[0] = AV17HumedoSeco ;
         GXv_decimal9[0] = AV16FactAbs ;
         GXv_char3[0] = AV15Msg_errfa ;
         GXv_char2[0] = AV14MaqCod ;
         new app.prac010(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_int6, GXv_char15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_char13, GXv_char12, GXv_char4, GXv_decimal9, GXv_char3, GXv_char2) ;
         recetasdeacabado_agrupacion_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         recetasdeacabado_agrupacion_impl.this.A6031Ac_Barcod = GXv_int8[0] ;
         A6031Ac_Barcod = this.A6031Ac_Barcod ;
         recetasdeacabado_agrupacion_impl.this.A6032Ac_BarReo = GXv_int6[0] ;
         A6032Ac_BarReo = this.A6032Ac_BarReo ;
         recetasdeacabado_agrupacion_impl.this.A6033Ac_BarPar = GXv_char15[0] ;
         A6033Ac_BarPar = this.A6033Ac_BarPar ;
         recetasdeacabado_agrupacion_impl.this.A6035Ac_Kilos = GXv_decimal14[0] ;
         A6035Ac_Kilos = this.A6035Ac_Kilos ;
         recetasdeacabado_agrupacion_impl.this.A6034Ac_Metros = GXv_decimal11[0] ;
         A6034Ac_Metros = this.A6034Ac_Metros ;
         recetasdeacabado_agrupacion_impl.this.A9839Ac_Abs = GXv_decimal10[0] ;
         A9839Ac_Abs = this.A9839Ac_Abs ;
         recetasdeacabado_agrupacion_impl.this.A118BarAcaQui = GXv_char13[0] ;
         A118BarAcaQui = this.A118BarAcaQui ;
         recetasdeacabado_agrupacion_impl.this.A9840Ac_AcaQui = GXv_char12[0] ;
         A9840Ac_AcaQui = this.A9840Ac_AcaQui ;
         recetasdeacabado_agrupacion_impl.this.AV17HumedoSeco = GXv_char4[0] ;
         AV17HumedoSeco = this.AV17HumedoSeco ;
         recetasdeacabado_agrupacion_impl.this.AV16FactAbs = GXv_decimal9[0] ;
         AV16FactAbs = this.AV16FactAbs ;
         recetasdeacabado_agrupacion_impl.this.AV15Msg_errfa = GXv_char3[0] ;
         AV15Msg_errfa = this.AV15Msg_errfa ;
         recetasdeacabado_agrupacion_impl.this.AV14MaqCod = GXv_char2[0] ;
         AV14MaqCod = this.AV14MaqCod ;
      }
      if ( true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int8[0] = A6031Ac_Barcod ;
         GXv_int6[0] = A6032Ac_BarReo ;
         GXv_char15[0] = A6033Ac_BarPar ;
         GXv_char13[0] = AV18MsgCtrl ;
         new app.pprc201(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_int6, GXv_char15, GXv_char13) ;
         recetasdeacabado_agrupacion_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         recetasdeacabado_agrupacion_impl.this.A6031Ac_Barcod = GXv_int8[0] ;
         A6031Ac_Barcod = this.A6031Ac_Barcod ;
         recetasdeacabado_agrupacion_impl.this.A6032Ac_BarReo = GXv_int6[0] ;
         A6032Ac_BarReo = this.A6032Ac_BarReo ;
         recetasdeacabado_agrupacion_impl.this.A6033Ac_BarPar = GXv_char15[0] ;
         A6033Ac_BarPar = this.A6033Ac_BarPar ;
         recetasdeacabado_agrupacion_impl.this.AV18MsgCtrl = GXv_char13[0] ;
         AV18MsgCtrl = this.AV18MsgCtrl ;
      }
      if ( true /* After */ && ( GXutil.strcmp(AV18MsgCtrl, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV18MsgCtrl, 0, "AC_BARPAR");
      }
      if ( ( A129BarCod == A6031Ac_Barcod ) && ( A132BarCodReo == A6032Ac_BarReo ) && ( GXutil.strcmp(A130BarCodPar, A6033Ac_BarPar) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Misma Hdr en Cabecera que en Lineas", ""), 1, "AC_BARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* After */ && ( AV19Torient == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV15Msg_errfa, 1, "AC_BARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* After */ && (0==AV19Torient) )
      {
         httpContext.GX_msglist.addItem(AV15Msg_errfa, 0, "AC_BARPAR");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13900Ac_NHdr", GXutil.rtrim( A13900Ac_NHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", GXutil.rtrim( A118BarAcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "A9840Ac_AcaQui", GXutil.rtrim( A9840Ac_AcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "AV17HumedoSeco", GXutil.rtrim( AV17HumedoSeco));
      httpContext.ajax_rsp_assign_attri("", false, "AV16FactAbs", GXutil.ltrim( localUtil.ntoc( AV16FactAbs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Msg_errfa", AV15Msg_errfa);
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", GXutil.rtrim( AV14MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", GXutil.rtrim( A6033Ac_BarPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MsgCtrl", AV18MsgCtrl);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV16FactAbs',fld:'vFACTABS',pic:'ZZ9.99',hsh:true},{av:'AV17HumedoSeco',fld:'vHUMEDOSECO',pic:'',hsh:true},{av:'AV14MaqCod',fld:'vMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV16FactAbs',fld:'vFACTABS',pic:'ZZ9.99',hsh:true},{av:'AV17HumedoSeco',fld:'vHUMEDOSECO',pic:'',hsh:true},{av:'AV14MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RI2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_AC_BARCOD","{handler:'valid_Ac_barcod',iparms:[]");
      setEventMetadata("VALID_AC_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_AC_BARREO","{handler:'valid_Ac_barreo',iparms:[]");
      setEventMetadata("VALID_AC_BARREO",",oparms:[]}");
      setEventMetadata("VALID_AC_BARPAR","{handler:'valid_Ac_barpar',iparms:[{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV16FactAbs',fld:'vFACTABS',pic:'ZZ9.99'},{av:'AV17HumedoSeco',fld:'vHUMEDOSECO',pic:''},{av:'A9840Ac_AcaQui',fld:'AC_ACAQUI',pic:''},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A9839Ac_Abs',fld:'AC_ABS',pic:'ZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A13900Ac_NHdr',fld:'AC_NHDR',pic:''},{av:'AV15Msg_errfa',fld:'vMSG_ERRFA',pic:''},{av:'AV18MsgCtrl',fld:'vMSGCTRL',pic:''}]");
      setEventMetadata("VALID_AC_BARPAR",",oparms:[{av:'A13900Ac_NHdr',fld:'AC_NHDR',pic:''},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A9839Ac_Abs',fld:'AC_ABS',pic:'ZZ9.99'},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A9840Ac_AcaQui',fld:'AC_ACAQUI',pic:''},{av:'AV17HumedoSeco',fld:'vHUMEDOSECO',pic:''},{av:'AV16FactAbs',fld:'vFACTABS',pic:'ZZ9.99'},{av:'AV15Msg_errfa',fld:'vMSG_ERRFA',pic:''},{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'AV18MsgCtrl',fld:'vMSGCTRL',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ac_acaqui',iparms:[]");
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
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV10BarCodPar = "" ;
      wcpOAV16FactAbs = DecimalUtil.ZERO ;
      wcpOAV17HumedoSeco = "" ;
      wcpOAV14MaqCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z118BarAcaQui = "" ;
      Z6033Ac_BarPar = "" ;
      Z6034Ac_Metros = DecimalUtil.ZERO ;
      Z6035Ac_Kilos = DecimalUtil.ZERO ;
      Z9839Ac_Abs = DecimalUtil.ZERO ;
      Z9840Ac_AcaQui = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6033Ac_BarPar = "" ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A9839Ac_Abs = DecimalUtil.ZERO ;
      A118BarAcaQui = "" ;
      A9840Ac_AcaQui = "" ;
      AV17HumedoSeco = "" ;
      AV16FactAbs = DecimalUtil.ZERO ;
      AV15Msg_errfa = "" ;
      AV14MaqCod = "" ;
      AV18MsgCtrl = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV10BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13696BarNHdr = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A130BarCodPar = "" ;
      A407EmprNom = "" ;
      Gridlevel_ac_Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode883 = "" ;
      sStyleString = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      A13900Ac_NHdr = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode12 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      AV20Station = "" ;
      AV21EmprNom = "" ;
      AV22UsurCod = "" ;
      GXt_char1 = "" ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      T01RI6_A407EmprNom = new String[] {""} ;
      T01RI6_n407EmprNom = new boolean[] {false} ;
      T01RI8_A361DisCod = new int[1] ;
      T01RI8_A2759BarMaqGru = new String[] {""} ;
      T01RI8_A129BarCod = new int[1] ;
      T01RI8_n129BarCod = new boolean[] {false} ;
      T01RI8_A132BarCodReo = new byte[1] ;
      T01RI8_n132BarCodReo = new boolean[] {false} ;
      T01RI8_A130BarCodPar = new String[] {""} ;
      T01RI8_n130BarCodPar = new boolean[] {false} ;
      T01RI8_A180BarMaqCod = new String[] {""} ;
      T01RI8_A407EmprNom = new String[] {""} ;
      T01RI8_n407EmprNom = new boolean[] {false} ;
      T01RI8_A118BarAcaQui = new String[] {""} ;
      T01RI8_A252CliCod = new int[1] ;
      T01RI8_n252CliCod = new boolean[] {false} ;
      T01RI8_A365DisDes = new String[] {""} ;
      T01RI8_A396EmprCod = new String[] {""} ;
      T01RI8_n396EmprCod = new boolean[] {false} ;
      T01RI7_A252CliCod = new int[1] ;
      T01RI7_n252CliCod = new boolean[] {false} ;
      T01RI7_A365DisDes = new String[] {""} ;
      T01RI9_A407EmprNom = new String[] {""} ;
      T01RI9_n407EmprNom = new boolean[] {false} ;
      T01RI10_A252CliCod = new int[1] ;
      T01RI10_n252CliCod = new boolean[] {false} ;
      T01RI10_A365DisDes = new String[] {""} ;
      T01RI11_A396EmprCod = new String[] {""} ;
      T01RI11_n396EmprCod = new boolean[] {false} ;
      T01RI11_A129BarCod = new int[1] ;
      T01RI11_n129BarCod = new boolean[] {false} ;
      T01RI11_A132BarCodReo = new byte[1] ;
      T01RI11_n132BarCodReo = new boolean[] {false} ;
      T01RI11_A130BarCodPar = new String[] {""} ;
      T01RI11_n130BarCodPar = new boolean[] {false} ;
      T01RI5_A361DisCod = new int[1] ;
      T01RI5_A2759BarMaqGru = new String[] {""} ;
      T01RI5_A129BarCod = new int[1] ;
      T01RI5_n129BarCod = new boolean[] {false} ;
      T01RI5_A132BarCodReo = new byte[1] ;
      T01RI5_n132BarCodReo = new boolean[] {false} ;
      T01RI5_A130BarCodPar = new String[] {""} ;
      T01RI5_n130BarCodPar = new boolean[] {false} ;
      T01RI5_A180BarMaqCod = new String[] {""} ;
      T01RI5_A118BarAcaQui = new String[] {""} ;
      T01RI5_A396EmprCod = new String[] {""} ;
      T01RI5_n396EmprCod = new boolean[] {false} ;
      T01RI5_A252CliCod = new int[1] ;
      T01RI5_n252CliCod = new boolean[] {false} ;
      T01RI5_A365DisDes = new String[] {""} ;
      T01RI12_A396EmprCod = new String[] {""} ;
      T01RI12_n396EmprCod = new boolean[] {false} ;
      T01RI12_A129BarCod = new int[1] ;
      T01RI12_n129BarCod = new boolean[] {false} ;
      T01RI12_A132BarCodReo = new byte[1] ;
      T01RI12_n132BarCodReo = new boolean[] {false} ;
      T01RI12_A130BarCodPar = new String[] {""} ;
      T01RI12_n130BarCodPar = new boolean[] {false} ;
      T01RI13_A396EmprCod = new String[] {""} ;
      T01RI13_n396EmprCod = new boolean[] {false} ;
      T01RI13_A129BarCod = new int[1] ;
      T01RI13_n129BarCod = new boolean[] {false} ;
      T01RI13_A132BarCodReo = new byte[1] ;
      T01RI13_n132BarCodReo = new boolean[] {false} ;
      T01RI13_A130BarCodPar = new String[] {""} ;
      T01RI13_n130BarCodPar = new boolean[] {false} ;
      T01RI4_A361DisCod = new int[1] ;
      T01RI4_A2759BarMaqGru = new String[] {""} ;
      T01RI4_A129BarCod = new int[1] ;
      T01RI4_n129BarCod = new boolean[] {false} ;
      T01RI4_A132BarCodReo = new byte[1] ;
      T01RI4_n132BarCodReo = new boolean[] {false} ;
      T01RI4_A130BarCodPar = new String[] {""} ;
      T01RI4_n130BarCodPar = new boolean[] {false} ;
      T01RI4_A180BarMaqCod = new String[] {""} ;
      T01RI4_A118BarAcaQui = new String[] {""} ;
      T01RI4_A396EmprCod = new String[] {""} ;
      T01RI4_n396EmprCod = new boolean[] {false} ;
      T01RI4_A252CliCod = new int[1] ;
      T01RI4_n252CliCod = new boolean[] {false} ;
      T01RI4_A365DisDes = new String[] {""} ;
      T01RI17_A407EmprNom = new String[] {""} ;
      T01RI17_n407EmprNom = new boolean[] {false} ;
      T01RI18_A252CliCod = new int[1] ;
      T01RI18_n252CliCod = new boolean[] {false} ;
      T01RI18_A365DisDes = new String[] {""} ;
      T01RI19_A14681MRPrId = new long[1] ;
      T01RI20_A5921XCjaDis = new String[] {""} ;
      T01RI20_A5922XCjaCod = new long[1] ;
      T01RI21_A396EmprCod = new String[] {""} ;
      T01RI21_n396EmprCod = new boolean[] {false} ;
      T01RI21_A129BarCod = new int[1] ;
      T01RI21_n129BarCod = new boolean[] {false} ;
      T01RI21_A132BarCodReo = new byte[1] ;
      T01RI21_n132BarCodReo = new boolean[] {false} ;
      T01RI21_A130BarCodPar = new String[] {""} ;
      T01RI21_n130BarCodPar = new boolean[] {false} ;
      T01RI21_A14152MEnvOrd = new short[1] ;
      T01RI22_A396EmprCod = new String[] {""} ;
      T01RI22_n396EmprCod = new boolean[] {false} ;
      T01RI22_A129BarCod = new int[1] ;
      T01RI22_n129BarCod = new boolean[] {false} ;
      T01RI22_A132BarCodReo = new byte[1] ;
      T01RI22_n132BarCodReo = new boolean[] {false} ;
      T01RI22_A130BarCodPar = new String[] {""} ;
      T01RI22_n130BarCodPar = new boolean[] {false} ;
      T01RI22_A13905BarTraID = new String[] {""} ;
      T01RI23_A396EmprCod = new String[] {""} ;
      T01RI23_n396EmprCod = new boolean[] {false} ;
      T01RI23_A129BarCod = new int[1] ;
      T01RI23_n129BarCod = new boolean[] {false} ;
      T01RI23_A132BarCodReo = new byte[1] ;
      T01RI23_n132BarCodReo = new boolean[] {false} ;
      T01RI23_A130BarCodPar = new String[] {""} ;
      T01RI23_n130BarCodPar = new boolean[] {false} ;
      T01RI23_A13093BarDGLin = new byte[1] ;
      T01RI23_A13094BarDGDibCl = new String[] {""} ;
      T01RI23_A13095BarDGDibIn = new int[1] ;
      T01RI23_A13096BarDGComb = new String[] {""} ;
      T01RI23_A13097BarDGFOndo = new String[] {""} ;
      T01RI24_A396EmprCod = new String[] {""} ;
      T01RI24_n396EmprCod = new boolean[] {false} ;
      T01RI24_A11917Ebd_numero = new int[1] ;
      T01RI25_A396EmprCod = new String[] {""} ;
      T01RI25_n396EmprCod = new boolean[] {false} ;
      T01RI25_A11898Prd_numero = new int[1] ;
      T01RI26_A396EmprCod = new String[] {""} ;
      T01RI26_n396EmprCod = new boolean[] {false} ;
      T01RI26_A11849Cte_numero = new int[1] ;
      T01RI27_A396EmprCod = new String[] {""} ;
      T01RI27_n396EmprCod = new boolean[] {false} ;
      T01RI27_A11791Ap_numero = new int[1] ;
      T01RI28_A396EmprCod = new String[] {""} ;
      T01RI28_n396EmprCod = new boolean[] {false} ;
      T01RI28_A3985CalBarCod = new int[1] ;
      T01RI28_A3986CalBarCodR = new byte[1] ;
      T01RI28_A3987CalBarCodP = new String[] {""} ;
      T01RI29_A396EmprCod = new String[] {""} ;
      T01RI29_n396EmprCod = new boolean[] {false} ;
      T01RI29_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01RI29_A652OpeCod = new int[1] ;
      T01RI30_A396EmprCod = new String[] {""} ;
      T01RI30_n396EmprCod = new boolean[] {false} ;
      T01RI30_A129BarCod = new int[1] ;
      T01RI30_n129BarCod = new boolean[] {false} ;
      T01RI30_A132BarCodReo = new byte[1] ;
      T01RI30_n132BarCodReo = new boolean[] {false} ;
      T01RI30_A130BarCodPar = new String[] {""} ;
      T01RI30_n130BarCodPar = new boolean[] {false} ;
      T01RI30_A4118tinagrcod = new int[1] ;
      T01RI30_A4119tinagrreo = new byte[1] ;
      T01RI30_A4120tinagrpar = new String[] {""} ;
      T01RI31_A396EmprCod = new String[] {""} ;
      T01RI31_n396EmprCod = new boolean[] {false} ;
      T01RI31_A129BarCod = new int[1] ;
      T01RI31_n129BarCod = new boolean[] {false} ;
      T01RI31_A132BarCodReo = new byte[1] ;
      T01RI31_n132BarCodReo = new boolean[] {false} ;
      T01RI31_A130BarCodPar = new String[] {""} ;
      T01RI31_n130BarCodPar = new boolean[] {false} ;
      T01RI31_A4080estagrcod = new int[1] ;
      T01RI31_A4081estagrreo = new byte[1] ;
      T01RI31_A4082estagrpar = new String[] {""} ;
      T01RI32_A396EmprCod = new String[] {""} ;
      T01RI32_n396EmprCod = new boolean[] {false} ;
      T01RI32_A129BarCod = new int[1] ;
      T01RI32_n129BarCod = new boolean[] {false} ;
      T01RI32_A132BarCodReo = new byte[1] ;
      T01RI32_n132BarCodReo = new boolean[] {false} ;
      T01RI32_A130BarCodPar = new String[] {""} ;
      T01RI32_n130BarCodPar = new boolean[] {false} ;
      T01RI32_A4075recestncol = new byte[1] ;
      T01RI32_A4076recestnpro = new byte[1] ;
      T01RI33_A396EmprCod = new String[] {""} ;
      T01RI33_n396EmprCod = new boolean[] {false} ;
      T01RI33_A602MaqCod = new String[] {""} ;
      T01RI33_A1142MaqFCod = new String[] {""} ;
      T01RI33_A3068PlaEtaOrd = new short[1] ;
      T01RI33_A3069PlaEtaOrdA = new byte[1] ;
      T01RI33_A129BarCod = new int[1] ;
      T01RI33_n129BarCod = new boolean[] {false} ;
      T01RI33_A132BarCodReo = new byte[1] ;
      T01RI33_n132BarCodReo = new boolean[] {false} ;
      T01RI33_A130BarCodPar = new String[] {""} ;
      T01RI33_n130BarCodPar = new boolean[] {false} ;
      T01RI34_A396EmprCod = new String[] {""} ;
      T01RI34_n396EmprCod = new boolean[] {false} ;
      T01RI34_A129BarCod = new int[1] ;
      T01RI34_n129BarCod = new boolean[] {false} ;
      T01RI34_A132BarCodReo = new byte[1] ;
      T01RI34_n132BarCodReo = new boolean[] {false} ;
      T01RI34_A130BarCodPar = new String[] {""} ;
      T01RI34_n130BarCodPar = new boolean[] {false} ;
      T01RI34_A4846BarAudLin = new short[1] ;
      T01RI35_A396EmprCod = new String[] {""} ;
      T01RI35_n396EmprCod = new boolean[] {false} ;
      T01RI35_A129BarCod = new int[1] ;
      T01RI35_n129BarCod = new boolean[] {false} ;
      T01RI35_A132BarCodReo = new byte[1] ;
      T01RI35_n132BarCodReo = new boolean[] {false} ;
      T01RI35_A130BarCodPar = new String[] {""} ;
      T01RI35_n130BarCodPar = new boolean[] {false} ;
      T01RI35_A3940BarEnsLin = new short[1] ;
      T01RI36_A396EmprCod = new String[] {""} ;
      T01RI36_n396EmprCod = new boolean[] {false} ;
      T01RI36_A129BarCod = new int[1] ;
      T01RI36_n129BarCod = new boolean[] {false} ;
      T01RI36_A132BarCodReo = new byte[1] ;
      T01RI36_n132BarCodReo = new boolean[] {false} ;
      T01RI36_A130BarCodPar = new String[] {""} ;
      T01RI36_n130BarCodPar = new boolean[] {false} ;
      T01RI36_A3384RefBarCod = new int[1] ;
      T01RI36_A3385RefBarReo = new byte[1] ;
      T01RI36_A3386RefBarPar = new String[] {""} ;
      T01RI37_A396EmprCod = new String[] {""} ;
      T01RI37_n396EmprCod = new boolean[] {false} ;
      T01RI37_A10914SolSalCod = new int[1] ;
      T01RI38_A396EmprCod = new String[] {""} ;
      T01RI38_n396EmprCod = new boolean[] {false} ;
      T01RI38_A10364Ph_numero = new int[1] ;
      T01RI39_A396EmprCod = new String[] {""} ;
      T01RI39_n396EmprCod = new boolean[] {false} ;
      T01RI39_A129BarCod = new int[1] ;
      T01RI39_n129BarCod = new boolean[] {false} ;
      T01RI39_A132BarCodReo = new byte[1] ;
      T01RI39_n132BarCodReo = new boolean[] {false} ;
      T01RI39_A130BarCodPar = new String[] {""} ;
      T01RI39_n130BarCodPar = new boolean[] {false} ;
      T01RI39_A10197ProEspCod = new String[] {""} ;
      T01RI40_A396EmprCod = new String[] {""} ;
      T01RI40_n396EmprCod = new boolean[] {false} ;
      T01RI40_A129BarCod = new int[1] ;
      T01RI40_n129BarCod = new boolean[] {false} ;
      T01RI40_A132BarCodReo = new byte[1] ;
      T01RI40_n132BarCodReo = new boolean[] {false} ;
      T01RI40_A130BarCodPar = new String[] {""} ;
      T01RI40_n130BarCodPar = new boolean[] {false} ;
      T01RI40_A5322Dp_Nrecep = new int[1] ;
      T01RI41_A396EmprCod = new String[] {""} ;
      T01RI41_n396EmprCod = new boolean[] {false} ;
      T01RI41_A129BarCod = new int[1] ;
      T01RI41_n129BarCod = new boolean[] {false} ;
      T01RI41_A132BarCodReo = new byte[1] ;
      T01RI41_n132BarCodReo = new boolean[] {false} ;
      T01RI41_A130BarCodPar = new String[] {""} ;
      T01RI41_n130BarCodPar = new boolean[] {false} ;
      T01RI41_A8569EntSecLn = new int[1] ;
      T01RI42_A396EmprCod = new String[] {""} ;
      T01RI42_n396EmprCod = new boolean[] {false} ;
      T01RI42_A7434PLLNro = new int[1] ;
      T01RI42_A7443LPLNro = new short[1] ;
      T01RI42_A7459CPLCom = new short[1] ;
      T01RI42_A129BarCod = new int[1] ;
      T01RI42_n129BarCod = new boolean[] {false} ;
      T01RI42_A132BarCodReo = new byte[1] ;
      T01RI42_n132BarCodReo = new boolean[] {false} ;
      T01RI42_A130BarCodPar = new String[] {""} ;
      T01RI42_n130BarCodPar = new boolean[] {false} ;
      T01RI43_A396EmprCod = new String[] {""} ;
      T01RI43_n396EmprCod = new boolean[] {false} ;
      T01RI43_A7145OSSCod = new int[1] ;
      T01RI44_A396EmprCod = new String[] {""} ;
      T01RI44_n396EmprCod = new boolean[] {false} ;
      T01RI44_A7049OGSCod = new int[1] ;
      T01RI45_A396EmprCod = new String[] {""} ;
      T01RI45_n396EmprCod = new boolean[] {false} ;
      T01RI45_A129BarCod = new int[1] ;
      T01RI45_n129BarCod = new boolean[] {false} ;
      T01RI45_A132BarCodReo = new byte[1] ;
      T01RI45_n132BarCodReo = new boolean[] {false} ;
      T01RI45_A130BarCodPar = new String[] {""} ;
      T01RI45_n130BarCodPar = new boolean[] {false} ;
      T01RI45_A5908PartPal = new int[1] ;
      T01RI46_A396EmprCod = new String[] {""} ;
      T01RI46_n396EmprCod = new boolean[] {false} ;
      T01RI46_A129BarCod = new int[1] ;
      T01RI46_n129BarCod = new boolean[] {false} ;
      T01RI46_A132BarCodReo = new byte[1] ;
      T01RI46_n132BarCodReo = new boolean[] {false} ;
      T01RI46_A130BarCodPar = new String[] {""} ;
      T01RI46_n130BarCodPar = new boolean[] {false} ;
      T01RI46_A2524DisComLin = new byte[1] ;
      T01RI46_A1056DisComCod = new String[] {""} ;
      T01RI46_A1032FonCod = new String[] {""} ;
      T01RI47_A396EmprCod = new String[] {""} ;
      T01RI47_n396EmprCod = new boolean[] {false} ;
      T01RI47_A1736AlbExtCod = new long[1] ;
      T01RI47_A129BarCod = new int[1] ;
      T01RI47_n129BarCod = new boolean[] {false} ;
      T01RI47_A132BarCodReo = new byte[1] ;
      T01RI47_n132BarCodReo = new boolean[] {false} ;
      T01RI47_A130BarCodPar = new String[] {""} ;
      T01RI47_n130BarCodPar = new boolean[] {false} ;
      T01RI48_A396EmprCod = new String[] {""} ;
      T01RI48_n396EmprCod = new boolean[] {false} ;
      T01RI48_A129BarCod = new int[1] ;
      T01RI48_n129BarCod = new boolean[] {false} ;
      T01RI48_A132BarCodReo = new byte[1] ;
      T01RI48_n132BarCodReo = new boolean[] {false} ;
      T01RI48_A130BarCodPar = new String[] {""} ;
      T01RI48_n130BarCodPar = new boolean[] {false} ;
      T01RI48_A3753BarFoaCod = new int[1] ;
      T01RI48_A3754BarFoaReo = new byte[1] ;
      T01RI48_A3755BarFoaPar = new String[] {""} ;
      T01RI49_A396EmprCod = new String[] {""} ;
      T01RI49_n396EmprCod = new boolean[] {false} ;
      T01RI49_A129BarCod = new int[1] ;
      T01RI49_n129BarCod = new boolean[] {false} ;
      T01RI49_A132BarCodReo = new byte[1] ;
      T01RI49_n132BarCodReo = new boolean[] {false} ;
      T01RI49_A130BarCodPar = new String[] {""} ;
      T01RI49_n130BarCodPar = new boolean[] {false} ;
      T01RI49_A3747BarPegCod = new int[1] ;
      T01RI49_A3748BarPegReo = new byte[1] ;
      T01RI49_A3749BarPegPar = new String[] {""} ;
      T01RI50_A396EmprCod = new String[] {""} ;
      T01RI50_n396EmprCod = new boolean[] {false} ;
      T01RI50_A3253SolTraCod = new int[1] ;
      T01RI51_A396EmprCod = new String[] {""} ;
      T01RI51_n396EmprCod = new boolean[] {false} ;
      T01RI51_A3235SolSubCod = new int[1] ;
      T01RI52_A396EmprCod = new String[] {""} ;
      T01RI52_n396EmprCod = new boolean[] {false} ;
      T01RI52_A3218SolLuzCod = new int[1] ;
      T01RI53_A396EmprCod = new String[] {""} ;
      T01RI53_n396EmprCod = new boolean[] {false} ;
      T01RI53_A3196SolFriCod = new int[1] ;
      T01RI54_A396EmprCod = new String[] {""} ;
      T01RI54_n396EmprCod = new boolean[] {false} ;
      T01RI54_A3165SolPilCod = new int[1] ;
      T01RI55_A396EmprCod = new String[] {""} ;
      T01RI55_n396EmprCod = new boolean[] {false} ;
      T01RI55_A129BarCod = new int[1] ;
      T01RI55_n129BarCod = new boolean[] {false} ;
      T01RI55_A132BarCodReo = new byte[1] ;
      T01RI55_n132BarCodReo = new boolean[] {false} ;
      T01RI55_A130BarCodPar = new String[] {""} ;
      T01RI55_n130BarCodPar = new boolean[] {false} ;
      T01RI55_A2872HAnRLinMaq = new short[1] ;
      T01RI55_A2873HAnRLinPro = new byte[1] ;
      T01RI55_A2874HAnRLin = new short[1] ;
      T01RI55_A2875HAnNumAny = new byte[1] ;
      T01RI56_A396EmprCod = new String[] {""} ;
      T01RI56_n396EmprCod = new boolean[] {false} ;
      T01RI56_A2817PlaTer = new String[] {""} ;
      T01RI56_A2818PlaOrd = new short[1] ;
      T01RI57_A396EmprCod = new String[] {""} ;
      T01RI57_n396EmprCod = new boolean[] {false} ;
      T01RI57_A2809MetTerCod = new String[] {""} ;
      T01RI57_A129BarCod = new int[1] ;
      T01RI57_n129BarCod = new boolean[] {false} ;
      T01RI57_A132BarCodReo = new byte[1] ;
      T01RI57_n132BarCodReo = new boolean[] {false} ;
      T01RI57_A130BarCodPar = new String[] {""} ;
      T01RI57_n130BarCodPar = new boolean[] {false} ;
      T01RI58_A396EmprCod = new String[] {""} ;
      T01RI58_n396EmprCod = new boolean[] {false} ;
      T01RI58_A129BarCod = new int[1] ;
      T01RI58_n129BarCod = new boolean[] {false} ;
      T01RI58_A132BarCodReo = new byte[1] ;
      T01RI58_n132BarCodReo = new boolean[] {false} ;
      T01RI58_A130BarCodPar = new String[] {""} ;
      T01RI58_n130BarCodPar = new boolean[] {false} ;
      T01RI58_A2808RecLinMAL = new short[1] ;
      T01RI58_A1377RecNumAny = new byte[1] ;
      T01RI58_A719PrdNum = new String[] {""} ;
      T01RI59_A396EmprCod = new String[] {""} ;
      T01RI59_n396EmprCod = new boolean[] {false} ;
      T01RI59_A129BarCod = new int[1] ;
      T01RI59_n129BarCod = new boolean[] {false} ;
      T01RI59_A132BarCodReo = new byte[1] ;
      T01RI59_n132BarCodReo = new boolean[] {false} ;
      T01RI59_A130BarCodPar = new String[] {""} ;
      T01RI59_n130BarCodPar = new boolean[] {false} ;
      T01RI59_A2804RecLinMaq = new short[1] ;
      T01RI60_A396EmprCod = new String[] {""} ;
      T01RI60_n396EmprCod = new boolean[] {false} ;
      T01RI60_A2792TermiCod = new String[] {""} ;
      T01RI60_A129BarCod = new int[1] ;
      T01RI60_n129BarCod = new boolean[] {false} ;
      T01RI60_A132BarCodReo = new byte[1] ;
      T01RI60_n132BarCodReo = new boolean[] {false} ;
      T01RI60_A130BarCodPar = new String[] {""} ;
      T01RI60_n130BarCodPar = new boolean[] {false} ;
      T01RI61_A396EmprCod = new String[] {""} ;
      T01RI61_n396EmprCod = new boolean[] {false} ;
      T01RI61_A2248ManCod = new short[1] ;
      T01RI61_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01RI61_A2713RpExHdLi = new short[1] ;
      T01RI62_A396EmprCod = new String[] {""} ;
      T01RI62_n396EmprCod = new boolean[] {false} ;
      T01RI62_A2248ManCod = new short[1] ;
      T01RI62_A2689ExHdrFas = new String[] {""} ;
      T01RI62_A2692ExHdrLin = new int[1] ;
      T01RI63_A396EmprCod = new String[] {""} ;
      T01RI63_n396EmprCod = new boolean[] {false} ;
      T01RI63_A129BarCod = new int[1] ;
      T01RI63_n129BarCod = new boolean[] {false} ;
      T01RI63_A132BarCodReo = new byte[1] ;
      T01RI63_n132BarCodReo = new boolean[] {false} ;
      T01RI63_A130BarCodPar = new String[] {""} ;
      T01RI63_n130BarCodPar = new boolean[] {false} ;
      T01RI63_A2494BarDosPro = new String[] {""} ;
      T01RI63_A719PrdNum = new String[] {""} ;
      T01RI64_A396EmprCod = new String[] {""} ;
      T01RI64_n396EmprCod = new boolean[] {false} ;
      T01RI64_A602MaqCod = new String[] {""} ;
      T01RI64_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01RI64_A129BarCod = new int[1] ;
      T01RI64_n129BarCod = new boolean[] {false} ;
      T01RI64_A132BarCodReo = new byte[1] ;
      T01RI64_n132BarCodReo = new boolean[] {false} ;
      T01RI64_A130BarCodPar = new String[] {""} ;
      T01RI64_n130BarCodPar = new boolean[] {false} ;
      T01RI65_A396EmprCod = new String[] {""} ;
      T01RI65_n396EmprCod = new boolean[] {false} ;
      T01RI65_A129BarCod = new int[1] ;
      T01RI65_n129BarCod = new boolean[] {false} ;
      T01RI65_A132BarCodReo = new byte[1] ;
      T01RI65_n132BarCodReo = new boolean[] {false} ;
      T01RI65_A130BarCodPar = new String[] {""} ;
      T01RI65_n130BarCodPar = new boolean[] {false} ;
      T01RI65_A2457BarObLin = new short[1] ;
      T01RI66_A396EmprCod = new String[] {""} ;
      T01RI66_n396EmprCod = new boolean[] {false} ;
      T01RI66_A129BarCod = new int[1] ;
      T01RI66_n129BarCod = new boolean[] {false} ;
      T01RI66_A132BarCodReo = new byte[1] ;
      T01RI66_n132BarCodReo = new boolean[] {false} ;
      T01RI66_A130BarCodPar = new String[] {""} ;
      T01RI66_n130BarCodPar = new boolean[] {false} ;
      T01RI66_A2444BarEnLin = new short[1] ;
      T01RI67_A396EmprCod = new String[] {""} ;
      T01RI67_n396EmprCod = new boolean[] {false} ;
      T01RI67_A2406ExhAlbCod = new int[1] ;
      T01RI67_A129BarCod = new int[1] ;
      T01RI67_n129BarCod = new boolean[] {false} ;
      T01RI67_A132BarCodReo = new byte[1] ;
      T01RI67_n132BarCodReo = new boolean[] {false} ;
      T01RI67_A130BarCodPar = new String[] {""} ;
      T01RI67_n130BarCodPar = new boolean[] {false} ;
      T01RI68_A396EmprCod = new String[] {""} ;
      T01RI68_n396EmprCod = new boolean[] {false} ;
      T01RI68_A2253SalExtAlb = new int[1] ;
      T01RI68_A129BarCod = new int[1] ;
      T01RI68_n129BarCod = new boolean[] {false} ;
      T01RI68_A132BarCodReo = new byte[1] ;
      T01RI68_n132BarCodReo = new boolean[] {false} ;
      T01RI68_A130BarCodPar = new String[] {""} ;
      T01RI68_n130BarCodPar = new boolean[] {false} ;
      T01RI69_A396EmprCod = new String[] {""} ;
      T01RI69_n396EmprCod = new boolean[] {false} ;
      T01RI69_A30AlbProCod = new long[1] ;
      T01RI69_A129BarCod = new int[1] ;
      T01RI69_n129BarCod = new boolean[] {false} ;
      T01RI69_A132BarCodReo = new byte[1] ;
      T01RI69_n132BarCodReo = new boolean[] {false} ;
      T01RI69_A130BarCodPar = new String[] {""} ;
      T01RI69_n130BarCodPar = new boolean[] {false} ;
      T01RI70_A396EmprCod = new String[] {""} ;
      T01RI70_n396EmprCod = new boolean[] {false} ;
      T01RI70_A1348SolColCod = new int[1] ;
      T01RI71_A396EmprCod = new String[] {""} ;
      T01RI71_n396EmprCod = new boolean[] {false} ;
      T01RI71_A1333EstDimCod = new int[1] ;
      T01RI72_A396EmprCod = new String[] {""} ;
      T01RI72_n396EmprCod = new boolean[] {false} ;
      T01RI72_A1314EnsLabCod = new int[1] ;
      T01RI73_A396EmprCod = new String[] {""} ;
      T01RI73_n396EmprCod = new boolean[] {false} ;
      T01RI73_A129BarCod = new int[1] ;
      T01RI73_n129BarCod = new boolean[] {false} ;
      T01RI73_A132BarCodReo = new byte[1] ;
      T01RI73_n132BarCodReo = new boolean[] {false} ;
      T01RI73_A130BarCodPar = new String[] {""} ;
      T01RI73_n130BarCodPar = new boolean[] {false} ;
      T01RI73_A906ObsReoLin = new byte[1] ;
      T01RI74_A396EmprCod = new String[] {""} ;
      T01RI74_n396EmprCod = new boolean[] {false} ;
      T01RI74_A859CumCodCont = new int[1] ;
      T01RI75_A396EmprCod = new String[] {""} ;
      T01RI75_n396EmprCod = new boolean[] {false} ;
      T01RI75_A602MaqCod = new String[] {""} ;
      T01RI75_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RI75_A561HisProLin = new int[1] ;
      T01RI76_A396EmprCod = new String[] {""} ;
      T01RI76_n396EmprCod = new boolean[] {false} ;
      T01RI76_A252CliCod = new int[1] ;
      T01RI76_n252CliCod = new boolean[] {false} ;
      T01RI76_A494ForSer = new String[] {""} ;
      T01RI76_A482ForColNom = new String[] {""} ;
      T01RI76_A483ForColNum = new int[1] ;
      T01RI76_A831TipColCod = new byte[1] ;
      T01RI77_A396EmprCod = new String[] {""} ;
      T01RI77_n396EmprCod = new boolean[] {false} ;
      T01RI77_A129BarCod = new int[1] ;
      T01RI77_n129BarCod = new boolean[] {false} ;
      T01RI77_A132BarCodReo = new byte[1] ;
      T01RI77_n132BarCodReo = new boolean[] {false} ;
      T01RI77_A130BarCodPar = new String[] {""} ;
      T01RI77_n130BarCodPar = new boolean[] {false} ;
      T01RI77_A200BarPieCod = new String[] {""} ;
      T01RI78_A396EmprCod = new String[] {""} ;
      T01RI78_n396EmprCod = new boolean[] {false} ;
      T01RI78_A129BarCod = new int[1] ;
      T01RI78_n129BarCod = new boolean[] {false} ;
      T01RI78_A132BarCodReo = new byte[1] ;
      T01RI78_n132BarCodReo = new boolean[] {false} ;
      T01RI78_A130BarCodPar = new String[] {""} ;
      T01RI78_n130BarCodPar = new boolean[] {false} ;
      T01RI78_A188BarNotLin = new byte[1] ;
      T01RI79_A396EmprCod = new String[] {""} ;
      T01RI79_n396EmprCod = new boolean[] {false} ;
      T01RI79_A129BarCod = new int[1] ;
      T01RI79_n129BarCod = new boolean[] {false} ;
      T01RI79_A132BarCodReo = new byte[1] ;
      T01RI79_n132BarCodReo = new boolean[] {false} ;
      T01RI79_A130BarCodPar = new String[] {""} ;
      T01RI79_n130BarCodPar = new boolean[] {false} ;
      T01RI79_A758ProCod = new String[] {""} ;
      T01RI80_A396EmprCod = new String[] {""} ;
      T01RI80_n396EmprCod = new boolean[] {false} ;
      T01RI80_A129BarCod = new int[1] ;
      T01RI80_n129BarCod = new boolean[] {false} ;
      T01RI80_A132BarCodReo = new byte[1] ;
      T01RI80_n132BarCodReo = new boolean[] {false} ;
      T01RI80_A130BarCodPar = new String[] {""} ;
      T01RI80_n130BarCodPar = new boolean[] {false} ;
      T01RI80_A119BarAgrCod = new int[1] ;
      T01RI80_A124BarAgrReo = new byte[1] ;
      T01RI80_A122BarAgrPar = new String[] {""} ;
      T01RI82_A396EmprCod = new String[] {""} ;
      T01RI82_n396EmprCod = new boolean[] {false} ;
      T01RI82_A129BarCod = new int[1] ;
      T01RI82_n129BarCod = new boolean[] {false} ;
      T01RI82_A132BarCodReo = new byte[1] ;
      T01RI82_n132BarCodReo = new boolean[] {false} ;
      T01RI82_A130BarCodPar = new String[] {""} ;
      T01RI82_n130BarCodPar = new boolean[] {false} ;
      T01RI83_A129BarCod = new int[1] ;
      T01RI83_n129BarCod = new boolean[] {false} ;
      T01RI83_A132BarCodReo = new byte[1] ;
      T01RI83_n132BarCodReo = new boolean[] {false} ;
      T01RI83_A130BarCodPar = new String[] {""} ;
      T01RI83_n130BarCodPar = new boolean[] {false} ;
      T01RI83_A6031Ac_Barcod = new int[1] ;
      T01RI83_A6032Ac_BarReo = new byte[1] ;
      T01RI83_A6033Ac_BarPar = new String[] {""} ;
      T01RI83_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI83_n6034Ac_Metros = new boolean[] {false} ;
      T01RI83_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI83_n6035Ac_Kilos = new boolean[] {false} ;
      T01RI83_A6036Ac_Pzs = new short[1] ;
      T01RI83_n6036Ac_Pzs = new boolean[] {false} ;
      T01RI83_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI83_n9839Ac_Abs = new boolean[] {false} ;
      T01RI83_A9840Ac_AcaQui = new String[] {""} ;
      T01RI83_n9840Ac_AcaQui = new boolean[] {false} ;
      T01RI83_A396EmprCod = new String[] {""} ;
      T01RI83_n396EmprCod = new boolean[] {false} ;
      T01RI84_A396EmprCod = new String[] {""} ;
      T01RI84_n396EmprCod = new boolean[] {false} ;
      T01RI84_A129BarCod = new int[1] ;
      T01RI84_n129BarCod = new boolean[] {false} ;
      T01RI84_A132BarCodReo = new byte[1] ;
      T01RI84_n132BarCodReo = new boolean[] {false} ;
      T01RI84_A130BarCodPar = new String[] {""} ;
      T01RI84_n130BarCodPar = new boolean[] {false} ;
      T01RI84_A6031Ac_Barcod = new int[1] ;
      T01RI84_A6032Ac_BarReo = new byte[1] ;
      T01RI84_A6033Ac_BarPar = new String[] {""} ;
      T01RI3_A129BarCod = new int[1] ;
      T01RI3_n129BarCod = new boolean[] {false} ;
      T01RI3_A132BarCodReo = new byte[1] ;
      T01RI3_n132BarCodReo = new boolean[] {false} ;
      T01RI3_A130BarCodPar = new String[] {""} ;
      T01RI3_n130BarCodPar = new boolean[] {false} ;
      T01RI3_A6031Ac_Barcod = new int[1] ;
      T01RI3_A6032Ac_BarReo = new byte[1] ;
      T01RI3_A6033Ac_BarPar = new String[] {""} ;
      T01RI3_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI3_n6034Ac_Metros = new boolean[] {false} ;
      T01RI3_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI3_n6035Ac_Kilos = new boolean[] {false} ;
      T01RI3_A6036Ac_Pzs = new short[1] ;
      T01RI3_n6036Ac_Pzs = new boolean[] {false} ;
      T01RI3_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI3_n9839Ac_Abs = new boolean[] {false} ;
      T01RI3_A9840Ac_AcaQui = new String[] {""} ;
      T01RI3_n9840Ac_AcaQui = new boolean[] {false} ;
      T01RI3_A396EmprCod = new String[] {""} ;
      T01RI3_n396EmprCod = new boolean[] {false} ;
      T01RI2_A129BarCod = new int[1] ;
      T01RI2_n129BarCod = new boolean[] {false} ;
      T01RI2_A132BarCodReo = new byte[1] ;
      T01RI2_n132BarCodReo = new boolean[] {false} ;
      T01RI2_A130BarCodPar = new String[] {""} ;
      T01RI2_n130BarCodPar = new boolean[] {false} ;
      T01RI2_A6031Ac_Barcod = new int[1] ;
      T01RI2_A6032Ac_BarReo = new byte[1] ;
      T01RI2_A6033Ac_BarPar = new String[] {""} ;
      T01RI2_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI2_n6034Ac_Metros = new boolean[] {false} ;
      T01RI2_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI2_n6035Ac_Kilos = new boolean[] {false} ;
      T01RI2_A6036Ac_Pzs = new short[1] ;
      T01RI2_n6036Ac_Pzs = new boolean[] {false} ;
      T01RI2_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RI2_n9839Ac_Abs = new boolean[] {false} ;
      T01RI2_A9840Ac_AcaQui = new String[] {""} ;
      T01RI2_n9840Ac_AcaQui = new boolean[] {false} ;
      T01RI2_A396EmprCod = new String[] {""} ;
      T01RI2_n396EmprCod = new boolean[] {false} ;
      T01RI88_A396EmprCod = new String[] {""} ;
      T01RI88_n396EmprCod = new boolean[] {false} ;
      T01RI88_A129BarCod = new int[1] ;
      T01RI88_n129BarCod = new boolean[] {false} ;
      T01RI88_A132BarCodReo = new byte[1] ;
      T01RI88_n132BarCodReo = new boolean[] {false} ;
      T01RI88_A130BarCodPar = new String[] {""} ;
      T01RI88_n130BarCodPar = new boolean[] {false} ;
      T01RI88_A6031Ac_Barcod = new int[1] ;
      T01RI88_A6032Ac_BarReo = new byte[1] ;
      T01RI88_A6033Ac_BarPar = new String[] {""} ;
      Gridlevel_ac_Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_ac__Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_6031_6032_6033_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_ac_Column = new com.genexus.webpanels.GXWebColumn();
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_char13 = new String[1] ;
      Z13900Ac_NHdr = "" ;
      ZV17HumedoSeco = "" ;
      ZV16FactAbs = DecimalUtil.ZERO ;
      ZV15Msg_errfa = "" ;
      ZV14MaqCod = "" ;
      ZV18MsgCtrl = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado_agrupacion__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado_agrupacion__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado_agrupacion__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado_agrupacion__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado_agrupacion__default(),
         new Object[] {
             new Object[] {
            T01RI2_A129BarCod, T01RI2_A132BarCodReo, T01RI2_A130BarCodPar, T01RI2_A6031Ac_Barcod, T01RI2_A6032Ac_BarReo, T01RI2_A6033Ac_BarPar, T01RI2_A6034Ac_Metros, T01RI2_n6034Ac_Metros, T01RI2_A6035Ac_Kilos, T01RI2_n6035Ac_Kilos,
            T01RI2_A6036Ac_Pzs, T01RI2_n6036Ac_Pzs, T01RI2_A9839Ac_Abs, T01RI2_n9839Ac_Abs, T01RI2_A9840Ac_AcaQui, T01RI2_n9840Ac_AcaQui, T01RI2_A396EmprCod
            }
            , new Object[] {
            T01RI3_A129BarCod, T01RI3_A132BarCodReo, T01RI3_A130BarCodPar, T01RI3_A6031Ac_Barcod, T01RI3_A6032Ac_BarReo, T01RI3_A6033Ac_BarPar, T01RI3_A6034Ac_Metros, T01RI3_n6034Ac_Metros, T01RI3_A6035Ac_Kilos, T01RI3_n6035Ac_Kilos,
            T01RI3_A6036Ac_Pzs, T01RI3_n6036Ac_Pzs, T01RI3_A9839Ac_Abs, T01RI3_n9839Ac_Abs, T01RI3_A9840Ac_AcaQui, T01RI3_n9840Ac_AcaQui, T01RI3_A396EmprCod
            }
            , new Object[] {
            T01RI4_A361DisCod, T01RI4_A2759BarMaqGru, T01RI4_A129BarCod, T01RI4_A132BarCodReo, T01RI4_A130BarCodPar, T01RI4_A180BarMaqCod, T01RI4_A118BarAcaQui, T01RI4_A396EmprCod, T01RI4_A252CliCod, T01RI4_n252CliCod,
            T01RI4_A365DisDes
            }
            , new Object[] {
            T01RI5_A361DisCod, T01RI5_A2759BarMaqGru, T01RI5_A129BarCod, T01RI5_A132BarCodReo, T01RI5_A130BarCodPar, T01RI5_A180BarMaqCod, T01RI5_A118BarAcaQui, T01RI5_A396EmprCod, T01RI5_A252CliCod, T01RI5_n252CliCod,
            T01RI5_A365DisDes
            }
            , new Object[] {
            T01RI6_A407EmprNom, T01RI6_n407EmprNom
            }
            , new Object[] {
            T01RI7_A252CliCod, T01RI7_A365DisDes
            }
            , new Object[] {
            T01RI8_A361DisCod, T01RI8_A2759BarMaqGru, T01RI8_A129BarCod, T01RI8_A132BarCodReo, T01RI8_A130BarCodPar, T01RI8_A180BarMaqCod, T01RI8_A407EmprNom, T01RI8_n407EmprNom, T01RI8_A118BarAcaQui, T01RI8_A252CliCod,
            T01RI8_n252CliCod, T01RI8_A365DisDes, T01RI8_A396EmprCod
            }
            , new Object[] {
            T01RI9_A407EmprNom, T01RI9_n407EmprNom
            }
            , new Object[] {
            T01RI10_A252CliCod, T01RI10_A365DisDes
            }
            , new Object[] {
            T01RI11_A396EmprCod, T01RI11_A129BarCod, T01RI11_A132BarCodReo, T01RI11_A130BarCodPar
            }
            , new Object[] {
            T01RI12_A396EmprCod, T01RI12_A129BarCod, T01RI12_A132BarCodReo, T01RI12_A130BarCodPar
            }
            , new Object[] {
            T01RI13_A396EmprCod, T01RI13_A129BarCod, T01RI13_A132BarCodReo, T01RI13_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RI17_A407EmprNom, T01RI17_n407EmprNom
            }
            , new Object[] {
            T01RI18_A252CliCod, T01RI18_A365DisDes
            }
            , new Object[] {
            T01RI19_A14681MRPrId
            }
            , new Object[] {
            T01RI20_A5921XCjaDis, T01RI20_A5922XCjaCod
            }
            , new Object[] {
            T01RI21_A396EmprCod, T01RI21_A129BarCod, T01RI21_A132BarCodReo, T01RI21_A130BarCodPar, T01RI21_A14152MEnvOrd
            }
            , new Object[] {
            T01RI22_A396EmprCod, T01RI22_A129BarCod, T01RI22_A132BarCodReo, T01RI22_A130BarCodPar, T01RI22_A13905BarTraID
            }
            , new Object[] {
            T01RI23_A396EmprCod, T01RI23_A129BarCod, T01RI23_A132BarCodReo, T01RI23_A130BarCodPar, T01RI23_A13093BarDGLin, T01RI23_A13094BarDGDibCl, T01RI23_A13095BarDGDibIn, T01RI23_A13096BarDGComb, T01RI23_A13097BarDGFOndo
            }
            , new Object[] {
            T01RI24_A396EmprCod, T01RI24_A11917Ebd_numero
            }
            , new Object[] {
            T01RI25_A396EmprCod, T01RI25_A11898Prd_numero
            }
            , new Object[] {
            T01RI26_A396EmprCod, T01RI26_A11849Cte_numero
            }
            , new Object[] {
            T01RI27_A396EmprCod, T01RI27_A11791Ap_numero
            }
            , new Object[] {
            T01RI28_A396EmprCod, T01RI28_A3985CalBarCod, T01RI28_A3986CalBarCodR, T01RI28_A3987CalBarCodP
            }
            , new Object[] {
            T01RI29_A396EmprCod, T01RI29_A5294InPTime, T01RI29_A652OpeCod
            }
            , new Object[] {
            T01RI30_A396EmprCod, T01RI30_A129BarCod, T01RI30_A132BarCodReo, T01RI30_A130BarCodPar, T01RI30_A4118tinagrcod, T01RI30_A4119tinagrreo, T01RI30_A4120tinagrpar
            }
            , new Object[] {
            T01RI31_A396EmprCod, T01RI31_A129BarCod, T01RI31_A132BarCodReo, T01RI31_A130BarCodPar, T01RI31_A4080estagrcod, T01RI31_A4081estagrreo, T01RI31_A4082estagrpar
            }
            , new Object[] {
            T01RI32_A396EmprCod, T01RI32_A129BarCod, T01RI32_A132BarCodReo, T01RI32_A130BarCodPar, T01RI32_A4075recestncol, T01RI32_A4076recestnpro
            }
            , new Object[] {
            T01RI33_A396EmprCod, T01RI33_A602MaqCod, T01RI33_A1142MaqFCod, T01RI33_A3068PlaEtaOrd, T01RI33_A3069PlaEtaOrdA, T01RI33_A129BarCod, T01RI33_A132BarCodReo, T01RI33_A130BarCodPar
            }
            , new Object[] {
            T01RI34_A396EmprCod, T01RI34_A129BarCod, T01RI34_A132BarCodReo, T01RI34_A130BarCodPar, T01RI34_A4846BarAudLin
            }
            , new Object[] {
            T01RI35_A396EmprCod, T01RI35_A129BarCod, T01RI35_A132BarCodReo, T01RI35_A130BarCodPar, T01RI35_A3940BarEnsLin
            }
            , new Object[] {
            T01RI36_A396EmprCod, T01RI36_A129BarCod, T01RI36_A132BarCodReo, T01RI36_A130BarCodPar, T01RI36_A3384RefBarCod, T01RI36_A3385RefBarReo, T01RI36_A3386RefBarPar
            }
            , new Object[] {
            T01RI37_A396EmprCod, T01RI37_A10914SolSalCod
            }
            , new Object[] {
            T01RI38_A396EmprCod, T01RI38_A10364Ph_numero
            }
            , new Object[] {
            T01RI39_A396EmprCod, T01RI39_A129BarCod, T01RI39_A132BarCodReo, T01RI39_A130BarCodPar, T01RI39_A10197ProEspCod
            }
            , new Object[] {
            T01RI40_A396EmprCod, T01RI40_A129BarCod, T01RI40_A132BarCodReo, T01RI40_A130BarCodPar, T01RI40_A5322Dp_Nrecep
            }
            , new Object[] {
            T01RI41_A396EmprCod, T01RI41_A129BarCod, T01RI41_A132BarCodReo, T01RI41_A130BarCodPar, T01RI41_A8569EntSecLn
            }
            , new Object[] {
            T01RI42_A396EmprCod, T01RI42_A7434PLLNro, T01RI42_A7443LPLNro, T01RI42_A7459CPLCom, T01RI42_A129BarCod, T01RI42_A132BarCodReo, T01RI42_A130BarCodPar
            }
            , new Object[] {
            T01RI43_A396EmprCod, T01RI43_A7145OSSCod
            }
            , new Object[] {
            T01RI44_A396EmprCod, T01RI44_A7049OGSCod
            }
            , new Object[] {
            T01RI45_A396EmprCod, T01RI45_A129BarCod, T01RI45_A132BarCodReo, T01RI45_A130BarCodPar, T01RI45_A5908PartPal
            }
            , new Object[] {
            T01RI46_A396EmprCod, T01RI46_A129BarCod, T01RI46_A132BarCodReo, T01RI46_A130BarCodPar, T01RI46_A2524DisComLin, T01RI46_A1056DisComCod, T01RI46_A1032FonCod
            }
            , new Object[] {
            T01RI47_A396EmprCod, T01RI47_A1736AlbExtCod, T01RI47_A129BarCod, T01RI47_A132BarCodReo, T01RI47_A130BarCodPar
            }
            , new Object[] {
            T01RI48_A396EmprCod, T01RI48_A129BarCod, T01RI48_A132BarCodReo, T01RI48_A130BarCodPar, T01RI48_A3753BarFoaCod, T01RI48_A3754BarFoaReo, T01RI48_A3755BarFoaPar
            }
            , new Object[] {
            T01RI49_A396EmprCod, T01RI49_A129BarCod, T01RI49_A132BarCodReo, T01RI49_A130BarCodPar, T01RI49_A3747BarPegCod, T01RI49_A3748BarPegReo, T01RI49_A3749BarPegPar
            }
            , new Object[] {
            T01RI50_A396EmprCod, T01RI50_A3253SolTraCod
            }
            , new Object[] {
            T01RI51_A396EmprCod, T01RI51_A3235SolSubCod
            }
            , new Object[] {
            T01RI52_A396EmprCod, T01RI52_A3218SolLuzCod
            }
            , new Object[] {
            T01RI53_A396EmprCod, T01RI53_A3196SolFriCod
            }
            , new Object[] {
            T01RI54_A396EmprCod, T01RI54_A3165SolPilCod
            }
            , new Object[] {
            T01RI55_A396EmprCod, T01RI55_A129BarCod, T01RI55_A132BarCodReo, T01RI55_A130BarCodPar, T01RI55_A2872HAnRLinMaq, T01RI55_A2873HAnRLinPro, T01RI55_A2874HAnRLin, T01RI55_A2875HAnNumAny
            }
            , new Object[] {
            T01RI56_A396EmprCod, T01RI56_A2817PlaTer, T01RI56_A2818PlaOrd
            }
            , new Object[] {
            T01RI57_A396EmprCod, T01RI57_A2809MetTerCod, T01RI57_A129BarCod, T01RI57_A132BarCodReo, T01RI57_A130BarCodPar
            }
            , new Object[] {
            T01RI58_A396EmprCod, T01RI58_A129BarCod, T01RI58_A132BarCodReo, T01RI58_A130BarCodPar, T01RI58_A2808RecLinMAL, T01RI58_A1377RecNumAny, T01RI58_A719PrdNum
            }
            , new Object[] {
            T01RI59_A396EmprCod, T01RI59_A129BarCod, T01RI59_A132BarCodReo, T01RI59_A130BarCodPar, T01RI59_A2804RecLinMaq
            }
            , new Object[] {
            T01RI60_A396EmprCod, T01RI60_A2792TermiCod, T01RI60_A129BarCod, T01RI60_A132BarCodReo, T01RI60_A130BarCodPar
            }
            , new Object[] {
            T01RI61_A396EmprCod, T01RI61_A2248ManCod, T01RI61_A2711RpExHdFe, T01RI61_A2713RpExHdLi
            }
            , new Object[] {
            T01RI62_A396EmprCod, T01RI62_A2248ManCod, T01RI62_A2689ExHdrFas, T01RI62_A2692ExHdrLin
            }
            , new Object[] {
            T01RI63_A396EmprCod, T01RI63_A129BarCod, T01RI63_A132BarCodReo, T01RI63_A130BarCodPar, T01RI63_A2494BarDosPro, T01RI63_A719PrdNum
            }
            , new Object[] {
            T01RI64_A396EmprCod, T01RI64_A602MaqCod, T01RI64_A2461PlaFecTin, T01RI64_A129BarCod, T01RI64_A132BarCodReo, T01RI64_A130BarCodPar
            }
            , new Object[] {
            T01RI65_A396EmprCod, T01RI65_A129BarCod, T01RI65_A132BarCodReo, T01RI65_A130BarCodPar, T01RI65_A2457BarObLin
            }
            , new Object[] {
            T01RI66_A396EmprCod, T01RI66_A129BarCod, T01RI66_A132BarCodReo, T01RI66_A130BarCodPar, T01RI66_A2444BarEnLin
            }
            , new Object[] {
            T01RI67_A396EmprCod, T01RI67_A2406ExhAlbCod, T01RI67_A129BarCod, T01RI67_A132BarCodReo, T01RI67_A130BarCodPar
            }
            , new Object[] {
            T01RI68_A396EmprCod, T01RI68_A2253SalExtAlb, T01RI68_A129BarCod, T01RI68_A132BarCodReo, T01RI68_A130BarCodPar
            }
            , new Object[] {
            T01RI69_A396EmprCod, T01RI69_A30AlbProCod, T01RI69_A129BarCod, T01RI69_A132BarCodReo, T01RI69_A130BarCodPar
            }
            , new Object[] {
            T01RI70_A396EmprCod, T01RI70_A1348SolColCod
            }
            , new Object[] {
            T01RI71_A396EmprCod, T01RI71_A1333EstDimCod
            }
            , new Object[] {
            T01RI72_A396EmprCod, T01RI72_A1314EnsLabCod
            }
            , new Object[] {
            T01RI73_A396EmprCod, T01RI73_A129BarCod, T01RI73_A132BarCodReo, T01RI73_A130BarCodPar, T01RI73_A906ObsReoLin
            }
            , new Object[] {
            T01RI74_A396EmprCod, T01RI74_A859CumCodCont
            }
            , new Object[] {
            T01RI75_A396EmprCod, T01RI75_A602MaqCod, T01RI75_A558HisProFec, T01RI75_A561HisProLin
            }
            , new Object[] {
            T01RI76_A396EmprCod, T01RI76_A252CliCod, T01RI76_A494ForSer, T01RI76_A482ForColNom, T01RI76_A483ForColNum, T01RI76_A831TipColCod
            }
            , new Object[] {
            T01RI77_A396EmprCod, T01RI77_A129BarCod, T01RI77_A132BarCodReo, T01RI77_A130BarCodPar, T01RI77_A200BarPieCod
            }
            , new Object[] {
            T01RI78_A396EmprCod, T01RI78_A129BarCod, T01RI78_A132BarCodReo, T01RI78_A130BarCodPar, T01RI78_A188BarNotLin
            }
            , new Object[] {
            T01RI79_A396EmprCod, T01RI79_A129BarCod, T01RI79_A132BarCodReo, T01RI79_A130BarCodPar, T01RI79_A758ProCod
            }
            , new Object[] {
            T01RI80_A396EmprCod, T01RI80_A129BarCod, T01RI80_A132BarCodReo, T01RI80_A130BarCodPar, T01RI80_A119BarAgrCod, T01RI80_A124BarAgrReo, T01RI80_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01RI82_A396EmprCod, T01RI82_A129BarCod, T01RI82_A132BarCodReo, T01RI82_A130BarCodPar
            }
            , new Object[] {
            T01RI83_A129BarCod, T01RI83_A132BarCodReo, T01RI83_A130BarCodPar, T01RI83_A6031Ac_Barcod, T01RI83_A6032Ac_BarReo, T01RI83_A6033Ac_BarPar, T01RI83_A6034Ac_Metros, T01RI83_n6034Ac_Metros, T01RI83_A6035Ac_Kilos, T01RI83_n6035Ac_Kilos,
            T01RI83_A6036Ac_Pzs, T01RI83_n6036Ac_Pzs, T01RI83_A9839Ac_Abs, T01RI83_n9839Ac_Abs, T01RI83_A9840Ac_AcaQui, T01RI83_n9840Ac_AcaQui, T01RI83_A396EmprCod
            }
            , new Object[] {
            T01RI84_A396EmprCod, T01RI84_A129BarCod, T01RI84_A132BarCodReo, T01RI84_A130BarCodPar, T01RI84_A6031Ac_Barcod, T01RI84_A6032Ac_BarReo, T01RI84_A6033Ac_BarPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RI88_A396EmprCod, T01RI88_A129BarCod, T01RI88_A132BarCodReo, T01RI88_A130BarCodPar, T01RI88_A6031Ac_Barcod, T01RI88_A6032Ac_BarReo, T01RI88_A6033Ac_BarPar
            }
         }
      );
   }

   private byte wcpOAV9BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z6032Ac_BarReo ;
   private byte GxWebError ;
   private byte A6032Ac_BarReo ;
   private byte AV9BarCodReo ;
   private byte nKeyPressed ;
   private byte A132BarCodReo ;
   private byte AV24Barsit_to ;
   private byte GXt_int5 ;
   private byte Gx_BScreen ;
   private byte subGridlevel_ac__Backcolorstyle ;
   private byte subGridlevel_ac__Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_ac__Allowselection ;
   private byte subGridlevel_ac__Allowhovering ;
   private byte subGridlevel_ac__Allowcollapsing ;
   private byte subGridlevel_ac__Collapsed ;
   private byte GXv_int6[] ;
   private short nIsMod_883 ;
   private short Z6036Ac_Pzs ;
   private short nRcdDeleted_883 ;
   private short nRcdExists_883 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount883 ;
   private short RcdFound883 ;
   private short nBlankRcdUsr883 ;
   private short AV19Torient ;
   private short RcdFound12 ;
   private short A6036Ac_Pzs ;
   private short nIsDirty_12 ;
   private short nIsDirty_883 ;
   private int wcpOAV8BarCod ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Z6031Ac_Barcod ;
   private int A6031Ac_Barcod ;
   private int A361DisCod ;
   private int AV8BarCod ;
   private int trnEnded ;
   private int edtBarNHdr_Enabled ;
   private int edtBarAcaQui_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int A129BarCod ;
   private int edtBarCod_Visible ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Visible ;
   private int edtBarCodPar_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtAc_Barcod_Enabled ;
   private int edtAc_BarReo_Enabled ;
   private int edtAc_BarPar_Enabled ;
   private int edtAc_Metros_Enabled ;
   private int edtAc_Kilos_Enabled ;
   private int edtAc_Pzs_Enabled ;
   private int edtAc_Abs_Enabled ;
   private int edtAc_AcaQui_Enabled ;
   private int fRowAdded ;
   private int A252CliCod ;
   private int AV23Clicodin ;
   private int GX_JID ;
   private int subGridlevel_ac__Backcolor ;
   private int subGridlevel_ac__Allbackcolor ;
   private int imgprompt_6031_6032_6033_Visible ;
   private int defedtAc_AcaQui_Enabled ;
   private int defedtAc_Abs_Enabled ;
   private int defedtAc_Pzs_Enabled ;
   private int defedtAc_Kilos_Enabled ;
   private int defedtAc_Metros_Enabled ;
   private int defedtAc_BarPar_Enabled ;
   private int defedtAc_BarReo_Enabled ;
   private int defedtAc_Barcod_Enabled ;
   private int idxLst ;
   private int subGridlevel_ac__Selectedindex ;
   private int subGridlevel_ac__Selectioncolor ;
   private int subGridlevel_ac__Hoveringcolor ;
   private int GXv_int8[] ;
   private long GRIDLEVEL_AC__nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV16FactAbs ;
   private java.math.BigDecimal Z6034Ac_Metros ;
   private java.math.BigDecimal Z6035Ac_Kilos ;
   private java.math.BigDecimal Z9839Ac_Abs ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A9839Ac_Abs ;
   private java.math.BigDecimal AV16FactAbs ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal ZV16FactAbs ;
   private String sPrefix ;
   private String sGXsfl_35_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV10BarCodPar ;
   private String wcpOAV17HumedoSeco ;
   private String wcpOAV14MaqCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z118BarAcaQui ;
   private String Z6033Ac_BarPar ;
   private String Z9840Ac_AcaQui ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6033Ac_BarPar ;
   private String A118BarAcaQui ;
   private String A9840Ac_AcaQui ;
   private String AV17HumedoSeco ;
   private String AV14MaqCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV10BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarAcaQui_Internalname ;
   private String edtBarAcaQui_Jsonclick ;
   private String divTableleaflevel_ac__Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode883 ;
   private String edtAc_Barcod_Internalname ;
   private String edtAc_BarReo_Internalname ;
   private String edtAc_BarPar_Internalname ;
   private String edtAc_Metros_Internalname ;
   private String edtAc_Kilos_Internalname ;
   private String edtAc_Pzs_Internalname ;
   private String edtAc_Abs_Internalname ;
   private String edtAc_AcaQui_Internalname ;
   private String imgprompt_6031_6032_6033_Link ;
   private String sStyleString ;
   private String subGridlevel_ac__Internalname ;
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String A13900Ac_NHdr ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode12 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV20Station ;
   private String AV21EmprNom ;
   private String AV22UsurCod ;
   private String GXt_char1 ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String imgprompt_6031_6032_6033_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGridlevel_ac__Class ;
   private String subGridlevel_ac__Linesclass ;
   private String ROClassString ;
   private String edtAc_Barcod_Jsonclick ;
   private String edtAc_BarReo_Jsonclick ;
   private String edtAc_BarPar_Jsonclick ;
   private String imgprompt_6031_6032_6033_gximage ;
   private String sImgUrl ;
   private String edtAc_Metros_Jsonclick ;
   private String edtAc_Kilos_Jsonclick ;
   private String edtAc_Pzs_Jsonclick ;
   private String edtAc_Abs_Jsonclick ;
   private String edtAc_AcaQui_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_ac__Header ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char13[] ;
   private String Z13900Ac_NHdr ;
   private String ZV17HumedoSeco ;
   private String ZV14MaqCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private boolean n9839Ac_Abs ;
   private boolean n9840Ac_AcaQui ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n6036Ac_Pzs ;
   private String AV15Msg_errfa ;
   private String AV18MsgCtrl ;
   private String ZV15Msg_errfa ;
   private String ZV18MsgCtrl ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_ac_Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_ac_Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_ac_Column ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RI6_A407EmprNom ;
   private boolean[] T01RI6_n407EmprNom ;
   private int[] T01RI8_A361DisCod ;
   private String[] T01RI8_A2759BarMaqGru ;
   private int[] T01RI8_A129BarCod ;
   private boolean[] T01RI8_n129BarCod ;
   private byte[] T01RI8_A132BarCodReo ;
   private boolean[] T01RI8_n132BarCodReo ;
   private String[] T01RI8_A130BarCodPar ;
   private boolean[] T01RI8_n130BarCodPar ;
   private String[] T01RI8_A180BarMaqCod ;
   private String[] T01RI8_A407EmprNom ;
   private boolean[] T01RI8_n407EmprNom ;
   private String[] T01RI8_A118BarAcaQui ;
   private int[] T01RI8_A252CliCod ;
   private boolean[] T01RI8_n252CliCod ;
   private String[] T01RI8_A365DisDes ;
   private String[] T01RI8_A396EmprCod ;
   private boolean[] T01RI8_n396EmprCod ;
   private int[] T01RI7_A252CliCod ;
   private boolean[] T01RI7_n252CliCod ;
   private String[] T01RI7_A365DisDes ;
   private String[] T01RI9_A407EmprNom ;
   private boolean[] T01RI9_n407EmprNom ;
   private int[] T01RI10_A252CliCod ;
   private boolean[] T01RI10_n252CliCod ;
   private String[] T01RI10_A365DisDes ;
   private String[] T01RI11_A396EmprCod ;
   private boolean[] T01RI11_n396EmprCod ;
   private int[] T01RI11_A129BarCod ;
   private boolean[] T01RI11_n129BarCod ;
   private byte[] T01RI11_A132BarCodReo ;
   private boolean[] T01RI11_n132BarCodReo ;
   private String[] T01RI11_A130BarCodPar ;
   private boolean[] T01RI11_n130BarCodPar ;
   private int[] T01RI5_A361DisCod ;
   private String[] T01RI5_A2759BarMaqGru ;
   private int[] T01RI5_A129BarCod ;
   private boolean[] T01RI5_n129BarCod ;
   private byte[] T01RI5_A132BarCodReo ;
   private boolean[] T01RI5_n132BarCodReo ;
   private String[] T01RI5_A130BarCodPar ;
   private boolean[] T01RI5_n130BarCodPar ;
   private String[] T01RI5_A180BarMaqCod ;
   private String[] T01RI5_A118BarAcaQui ;
   private String[] T01RI5_A396EmprCod ;
   private boolean[] T01RI5_n396EmprCod ;
   private int[] T01RI5_A252CliCod ;
   private boolean[] T01RI5_n252CliCod ;
   private String[] T01RI5_A365DisDes ;
   private String[] T01RI12_A396EmprCod ;
   private boolean[] T01RI12_n396EmprCod ;
   private int[] T01RI12_A129BarCod ;
   private boolean[] T01RI12_n129BarCod ;
   private byte[] T01RI12_A132BarCodReo ;
   private boolean[] T01RI12_n132BarCodReo ;
   private String[] T01RI12_A130BarCodPar ;
   private boolean[] T01RI12_n130BarCodPar ;
   private String[] T01RI13_A396EmprCod ;
   private boolean[] T01RI13_n396EmprCod ;
   private int[] T01RI13_A129BarCod ;
   private boolean[] T01RI13_n129BarCod ;
   private byte[] T01RI13_A132BarCodReo ;
   private boolean[] T01RI13_n132BarCodReo ;
   private String[] T01RI13_A130BarCodPar ;
   private boolean[] T01RI13_n130BarCodPar ;
   private int[] T01RI4_A361DisCod ;
   private String[] T01RI4_A2759BarMaqGru ;
   private int[] T01RI4_A129BarCod ;
   private boolean[] T01RI4_n129BarCod ;
   private byte[] T01RI4_A132BarCodReo ;
   private boolean[] T01RI4_n132BarCodReo ;
   private String[] T01RI4_A130BarCodPar ;
   private boolean[] T01RI4_n130BarCodPar ;
   private String[] T01RI4_A180BarMaqCod ;
   private String[] T01RI4_A118BarAcaQui ;
   private String[] T01RI4_A396EmprCod ;
   private boolean[] T01RI4_n396EmprCod ;
   private int[] T01RI4_A252CliCod ;
   private boolean[] T01RI4_n252CliCod ;
   private String[] T01RI4_A365DisDes ;
   private String[] T01RI17_A407EmprNom ;
   private boolean[] T01RI17_n407EmprNom ;
   private int[] T01RI18_A252CliCod ;
   private boolean[] T01RI18_n252CliCod ;
   private String[] T01RI18_A365DisDes ;
   private long[] T01RI19_A14681MRPrId ;
   private String[] T01RI20_A5921XCjaDis ;
   private long[] T01RI20_A5922XCjaCod ;
   private String[] T01RI21_A396EmprCod ;
   private boolean[] T01RI21_n396EmprCod ;
   private int[] T01RI21_A129BarCod ;
   private boolean[] T01RI21_n129BarCod ;
   private byte[] T01RI21_A132BarCodReo ;
   private boolean[] T01RI21_n132BarCodReo ;
   private String[] T01RI21_A130BarCodPar ;
   private boolean[] T01RI21_n130BarCodPar ;
   private short[] T01RI21_A14152MEnvOrd ;
   private String[] T01RI22_A396EmprCod ;
   private boolean[] T01RI22_n396EmprCod ;
   private int[] T01RI22_A129BarCod ;
   private boolean[] T01RI22_n129BarCod ;
   private byte[] T01RI22_A132BarCodReo ;
   private boolean[] T01RI22_n132BarCodReo ;
   private String[] T01RI22_A130BarCodPar ;
   private boolean[] T01RI22_n130BarCodPar ;
   private String[] T01RI22_A13905BarTraID ;
   private String[] T01RI23_A396EmprCod ;
   private boolean[] T01RI23_n396EmprCod ;
   private int[] T01RI23_A129BarCod ;
   private boolean[] T01RI23_n129BarCod ;
   private byte[] T01RI23_A132BarCodReo ;
   private boolean[] T01RI23_n132BarCodReo ;
   private String[] T01RI23_A130BarCodPar ;
   private boolean[] T01RI23_n130BarCodPar ;
   private byte[] T01RI23_A13093BarDGLin ;
   private String[] T01RI23_A13094BarDGDibCl ;
   private int[] T01RI23_A13095BarDGDibIn ;
   private String[] T01RI23_A13096BarDGComb ;
   private String[] T01RI23_A13097BarDGFOndo ;
   private String[] T01RI24_A396EmprCod ;
   private boolean[] T01RI24_n396EmprCod ;
   private int[] T01RI24_A11917Ebd_numero ;
   private String[] T01RI25_A396EmprCod ;
   private boolean[] T01RI25_n396EmprCod ;
   private int[] T01RI25_A11898Prd_numero ;
   private String[] T01RI26_A396EmprCod ;
   private boolean[] T01RI26_n396EmprCod ;
   private int[] T01RI26_A11849Cte_numero ;
   private String[] T01RI27_A396EmprCod ;
   private boolean[] T01RI27_n396EmprCod ;
   private int[] T01RI27_A11791Ap_numero ;
   private String[] T01RI28_A396EmprCod ;
   private boolean[] T01RI28_n396EmprCod ;
   private int[] T01RI28_A3985CalBarCod ;
   private byte[] T01RI28_A3986CalBarCodR ;
   private String[] T01RI28_A3987CalBarCodP ;
   private String[] T01RI29_A396EmprCod ;
   private boolean[] T01RI29_n396EmprCod ;
   private java.util.Date[] T01RI29_A5294InPTime ;
   private int[] T01RI29_A652OpeCod ;
   private String[] T01RI30_A396EmprCod ;
   private boolean[] T01RI30_n396EmprCod ;
   private int[] T01RI30_A129BarCod ;
   private boolean[] T01RI30_n129BarCod ;
   private byte[] T01RI30_A132BarCodReo ;
   private boolean[] T01RI30_n132BarCodReo ;
   private String[] T01RI30_A130BarCodPar ;
   private boolean[] T01RI30_n130BarCodPar ;
   private int[] T01RI30_A4118tinagrcod ;
   private byte[] T01RI30_A4119tinagrreo ;
   private String[] T01RI30_A4120tinagrpar ;
   private String[] T01RI31_A396EmprCod ;
   private boolean[] T01RI31_n396EmprCod ;
   private int[] T01RI31_A129BarCod ;
   private boolean[] T01RI31_n129BarCod ;
   private byte[] T01RI31_A132BarCodReo ;
   private boolean[] T01RI31_n132BarCodReo ;
   private String[] T01RI31_A130BarCodPar ;
   private boolean[] T01RI31_n130BarCodPar ;
   private int[] T01RI31_A4080estagrcod ;
   private byte[] T01RI31_A4081estagrreo ;
   private String[] T01RI31_A4082estagrpar ;
   private String[] T01RI32_A396EmprCod ;
   private boolean[] T01RI32_n396EmprCod ;
   private int[] T01RI32_A129BarCod ;
   private boolean[] T01RI32_n129BarCod ;
   private byte[] T01RI32_A132BarCodReo ;
   private boolean[] T01RI32_n132BarCodReo ;
   private String[] T01RI32_A130BarCodPar ;
   private boolean[] T01RI32_n130BarCodPar ;
   private byte[] T01RI32_A4075recestncol ;
   private byte[] T01RI32_A4076recestnpro ;
   private String[] T01RI33_A396EmprCod ;
   private boolean[] T01RI33_n396EmprCod ;
   private String[] T01RI33_A602MaqCod ;
   private String[] T01RI33_A1142MaqFCod ;
   private short[] T01RI33_A3068PlaEtaOrd ;
   private byte[] T01RI33_A3069PlaEtaOrdA ;
   private int[] T01RI33_A129BarCod ;
   private boolean[] T01RI33_n129BarCod ;
   private byte[] T01RI33_A132BarCodReo ;
   private boolean[] T01RI33_n132BarCodReo ;
   private String[] T01RI33_A130BarCodPar ;
   private boolean[] T01RI33_n130BarCodPar ;
   private String[] T01RI34_A396EmprCod ;
   private boolean[] T01RI34_n396EmprCod ;
   private int[] T01RI34_A129BarCod ;
   private boolean[] T01RI34_n129BarCod ;
   private byte[] T01RI34_A132BarCodReo ;
   private boolean[] T01RI34_n132BarCodReo ;
   private String[] T01RI34_A130BarCodPar ;
   private boolean[] T01RI34_n130BarCodPar ;
   private short[] T01RI34_A4846BarAudLin ;
   private String[] T01RI35_A396EmprCod ;
   private boolean[] T01RI35_n396EmprCod ;
   private int[] T01RI35_A129BarCod ;
   private boolean[] T01RI35_n129BarCod ;
   private byte[] T01RI35_A132BarCodReo ;
   private boolean[] T01RI35_n132BarCodReo ;
   private String[] T01RI35_A130BarCodPar ;
   private boolean[] T01RI35_n130BarCodPar ;
   private short[] T01RI35_A3940BarEnsLin ;
   private String[] T01RI36_A396EmprCod ;
   private boolean[] T01RI36_n396EmprCod ;
   private int[] T01RI36_A129BarCod ;
   private boolean[] T01RI36_n129BarCod ;
   private byte[] T01RI36_A132BarCodReo ;
   private boolean[] T01RI36_n132BarCodReo ;
   private String[] T01RI36_A130BarCodPar ;
   private boolean[] T01RI36_n130BarCodPar ;
   private int[] T01RI36_A3384RefBarCod ;
   private byte[] T01RI36_A3385RefBarReo ;
   private String[] T01RI36_A3386RefBarPar ;
   private String[] T01RI37_A396EmprCod ;
   private boolean[] T01RI37_n396EmprCod ;
   private int[] T01RI37_A10914SolSalCod ;
   private String[] T01RI38_A396EmprCod ;
   private boolean[] T01RI38_n396EmprCod ;
   private int[] T01RI38_A10364Ph_numero ;
   private String[] T01RI39_A396EmprCod ;
   private boolean[] T01RI39_n396EmprCod ;
   private int[] T01RI39_A129BarCod ;
   private boolean[] T01RI39_n129BarCod ;
   private byte[] T01RI39_A132BarCodReo ;
   private boolean[] T01RI39_n132BarCodReo ;
   private String[] T01RI39_A130BarCodPar ;
   private boolean[] T01RI39_n130BarCodPar ;
   private String[] T01RI39_A10197ProEspCod ;
   private String[] T01RI40_A396EmprCod ;
   private boolean[] T01RI40_n396EmprCod ;
   private int[] T01RI40_A129BarCod ;
   private boolean[] T01RI40_n129BarCod ;
   private byte[] T01RI40_A132BarCodReo ;
   private boolean[] T01RI40_n132BarCodReo ;
   private String[] T01RI40_A130BarCodPar ;
   private boolean[] T01RI40_n130BarCodPar ;
   private int[] T01RI40_A5322Dp_Nrecep ;
   private String[] T01RI41_A396EmprCod ;
   private boolean[] T01RI41_n396EmprCod ;
   private int[] T01RI41_A129BarCod ;
   private boolean[] T01RI41_n129BarCod ;
   private byte[] T01RI41_A132BarCodReo ;
   private boolean[] T01RI41_n132BarCodReo ;
   private String[] T01RI41_A130BarCodPar ;
   private boolean[] T01RI41_n130BarCodPar ;
   private int[] T01RI41_A8569EntSecLn ;
   private String[] T01RI42_A396EmprCod ;
   private boolean[] T01RI42_n396EmprCod ;
   private int[] T01RI42_A7434PLLNro ;
   private short[] T01RI42_A7443LPLNro ;
   private short[] T01RI42_A7459CPLCom ;
   private int[] T01RI42_A129BarCod ;
   private boolean[] T01RI42_n129BarCod ;
   private byte[] T01RI42_A132BarCodReo ;
   private boolean[] T01RI42_n132BarCodReo ;
   private String[] T01RI42_A130BarCodPar ;
   private boolean[] T01RI42_n130BarCodPar ;
   private String[] T01RI43_A396EmprCod ;
   private boolean[] T01RI43_n396EmprCod ;
   private int[] T01RI43_A7145OSSCod ;
   private String[] T01RI44_A396EmprCod ;
   private boolean[] T01RI44_n396EmprCod ;
   private int[] T01RI44_A7049OGSCod ;
   private String[] T01RI45_A396EmprCod ;
   private boolean[] T01RI45_n396EmprCod ;
   private int[] T01RI45_A129BarCod ;
   private boolean[] T01RI45_n129BarCod ;
   private byte[] T01RI45_A132BarCodReo ;
   private boolean[] T01RI45_n132BarCodReo ;
   private String[] T01RI45_A130BarCodPar ;
   private boolean[] T01RI45_n130BarCodPar ;
   private int[] T01RI45_A5908PartPal ;
   private String[] T01RI46_A396EmprCod ;
   private boolean[] T01RI46_n396EmprCod ;
   private int[] T01RI46_A129BarCod ;
   private boolean[] T01RI46_n129BarCod ;
   private byte[] T01RI46_A132BarCodReo ;
   private boolean[] T01RI46_n132BarCodReo ;
   private String[] T01RI46_A130BarCodPar ;
   private boolean[] T01RI46_n130BarCodPar ;
   private byte[] T01RI46_A2524DisComLin ;
   private String[] T01RI46_A1056DisComCod ;
   private String[] T01RI46_A1032FonCod ;
   private String[] T01RI47_A396EmprCod ;
   private boolean[] T01RI47_n396EmprCod ;
   private long[] T01RI47_A1736AlbExtCod ;
   private int[] T01RI47_A129BarCod ;
   private boolean[] T01RI47_n129BarCod ;
   private byte[] T01RI47_A132BarCodReo ;
   private boolean[] T01RI47_n132BarCodReo ;
   private String[] T01RI47_A130BarCodPar ;
   private boolean[] T01RI47_n130BarCodPar ;
   private String[] T01RI48_A396EmprCod ;
   private boolean[] T01RI48_n396EmprCod ;
   private int[] T01RI48_A129BarCod ;
   private boolean[] T01RI48_n129BarCod ;
   private byte[] T01RI48_A132BarCodReo ;
   private boolean[] T01RI48_n132BarCodReo ;
   private String[] T01RI48_A130BarCodPar ;
   private boolean[] T01RI48_n130BarCodPar ;
   private int[] T01RI48_A3753BarFoaCod ;
   private byte[] T01RI48_A3754BarFoaReo ;
   private String[] T01RI48_A3755BarFoaPar ;
   private String[] T01RI49_A396EmprCod ;
   private boolean[] T01RI49_n396EmprCod ;
   private int[] T01RI49_A129BarCod ;
   private boolean[] T01RI49_n129BarCod ;
   private byte[] T01RI49_A132BarCodReo ;
   private boolean[] T01RI49_n132BarCodReo ;
   private String[] T01RI49_A130BarCodPar ;
   private boolean[] T01RI49_n130BarCodPar ;
   private int[] T01RI49_A3747BarPegCod ;
   private byte[] T01RI49_A3748BarPegReo ;
   private String[] T01RI49_A3749BarPegPar ;
   private String[] T01RI50_A396EmprCod ;
   private boolean[] T01RI50_n396EmprCod ;
   private int[] T01RI50_A3253SolTraCod ;
   private String[] T01RI51_A396EmprCod ;
   private boolean[] T01RI51_n396EmprCod ;
   private int[] T01RI51_A3235SolSubCod ;
   private String[] T01RI52_A396EmprCod ;
   private boolean[] T01RI52_n396EmprCod ;
   private int[] T01RI52_A3218SolLuzCod ;
   private String[] T01RI53_A396EmprCod ;
   private boolean[] T01RI53_n396EmprCod ;
   private int[] T01RI53_A3196SolFriCod ;
   private String[] T01RI54_A396EmprCod ;
   private boolean[] T01RI54_n396EmprCod ;
   private int[] T01RI54_A3165SolPilCod ;
   private String[] T01RI55_A396EmprCod ;
   private boolean[] T01RI55_n396EmprCod ;
   private int[] T01RI55_A129BarCod ;
   private boolean[] T01RI55_n129BarCod ;
   private byte[] T01RI55_A132BarCodReo ;
   private boolean[] T01RI55_n132BarCodReo ;
   private String[] T01RI55_A130BarCodPar ;
   private boolean[] T01RI55_n130BarCodPar ;
   private short[] T01RI55_A2872HAnRLinMaq ;
   private byte[] T01RI55_A2873HAnRLinPro ;
   private short[] T01RI55_A2874HAnRLin ;
   private byte[] T01RI55_A2875HAnNumAny ;
   private String[] T01RI56_A396EmprCod ;
   private boolean[] T01RI56_n396EmprCod ;
   private String[] T01RI56_A2817PlaTer ;
   private short[] T01RI56_A2818PlaOrd ;
   private String[] T01RI57_A396EmprCod ;
   private boolean[] T01RI57_n396EmprCod ;
   private String[] T01RI57_A2809MetTerCod ;
   private int[] T01RI57_A129BarCod ;
   private boolean[] T01RI57_n129BarCod ;
   private byte[] T01RI57_A132BarCodReo ;
   private boolean[] T01RI57_n132BarCodReo ;
   private String[] T01RI57_A130BarCodPar ;
   private boolean[] T01RI57_n130BarCodPar ;
   private String[] T01RI58_A396EmprCod ;
   private boolean[] T01RI58_n396EmprCod ;
   private int[] T01RI58_A129BarCod ;
   private boolean[] T01RI58_n129BarCod ;
   private byte[] T01RI58_A132BarCodReo ;
   private boolean[] T01RI58_n132BarCodReo ;
   private String[] T01RI58_A130BarCodPar ;
   private boolean[] T01RI58_n130BarCodPar ;
   private short[] T01RI58_A2808RecLinMAL ;
   private byte[] T01RI58_A1377RecNumAny ;
   private String[] T01RI58_A719PrdNum ;
   private String[] T01RI59_A396EmprCod ;
   private boolean[] T01RI59_n396EmprCod ;
   private int[] T01RI59_A129BarCod ;
   private boolean[] T01RI59_n129BarCod ;
   private byte[] T01RI59_A132BarCodReo ;
   private boolean[] T01RI59_n132BarCodReo ;
   private String[] T01RI59_A130BarCodPar ;
   private boolean[] T01RI59_n130BarCodPar ;
   private short[] T01RI59_A2804RecLinMaq ;
   private String[] T01RI60_A396EmprCod ;
   private boolean[] T01RI60_n396EmprCod ;
   private String[] T01RI60_A2792TermiCod ;
   private int[] T01RI60_A129BarCod ;
   private boolean[] T01RI60_n129BarCod ;
   private byte[] T01RI60_A132BarCodReo ;
   private boolean[] T01RI60_n132BarCodReo ;
   private String[] T01RI60_A130BarCodPar ;
   private boolean[] T01RI60_n130BarCodPar ;
   private String[] T01RI61_A396EmprCod ;
   private boolean[] T01RI61_n396EmprCod ;
   private short[] T01RI61_A2248ManCod ;
   private java.util.Date[] T01RI61_A2711RpExHdFe ;
   private short[] T01RI61_A2713RpExHdLi ;
   private String[] T01RI62_A396EmprCod ;
   private boolean[] T01RI62_n396EmprCod ;
   private short[] T01RI62_A2248ManCod ;
   private String[] T01RI62_A2689ExHdrFas ;
   private int[] T01RI62_A2692ExHdrLin ;
   private String[] T01RI63_A396EmprCod ;
   private boolean[] T01RI63_n396EmprCod ;
   private int[] T01RI63_A129BarCod ;
   private boolean[] T01RI63_n129BarCod ;
   private byte[] T01RI63_A132BarCodReo ;
   private boolean[] T01RI63_n132BarCodReo ;
   private String[] T01RI63_A130BarCodPar ;
   private boolean[] T01RI63_n130BarCodPar ;
   private String[] T01RI63_A2494BarDosPro ;
   private String[] T01RI63_A719PrdNum ;
   private String[] T01RI64_A396EmprCod ;
   private boolean[] T01RI64_n396EmprCod ;
   private String[] T01RI64_A602MaqCod ;
   private java.util.Date[] T01RI64_A2461PlaFecTin ;
   private int[] T01RI64_A129BarCod ;
   private boolean[] T01RI64_n129BarCod ;
   private byte[] T01RI64_A132BarCodReo ;
   private boolean[] T01RI64_n132BarCodReo ;
   private String[] T01RI64_A130BarCodPar ;
   private boolean[] T01RI64_n130BarCodPar ;
   private String[] T01RI65_A396EmprCod ;
   private boolean[] T01RI65_n396EmprCod ;
   private int[] T01RI65_A129BarCod ;
   private boolean[] T01RI65_n129BarCod ;
   private byte[] T01RI65_A132BarCodReo ;
   private boolean[] T01RI65_n132BarCodReo ;
   private String[] T01RI65_A130BarCodPar ;
   private boolean[] T01RI65_n130BarCodPar ;
   private short[] T01RI65_A2457BarObLin ;
   private String[] T01RI66_A396EmprCod ;
   private boolean[] T01RI66_n396EmprCod ;
   private int[] T01RI66_A129BarCod ;
   private boolean[] T01RI66_n129BarCod ;
   private byte[] T01RI66_A132BarCodReo ;
   private boolean[] T01RI66_n132BarCodReo ;
   private String[] T01RI66_A130BarCodPar ;
   private boolean[] T01RI66_n130BarCodPar ;
   private short[] T01RI66_A2444BarEnLin ;
   private String[] T01RI67_A396EmprCod ;
   private boolean[] T01RI67_n396EmprCod ;
   private int[] T01RI67_A2406ExhAlbCod ;
   private int[] T01RI67_A129BarCod ;
   private boolean[] T01RI67_n129BarCod ;
   private byte[] T01RI67_A132BarCodReo ;
   private boolean[] T01RI67_n132BarCodReo ;
   private String[] T01RI67_A130BarCodPar ;
   private boolean[] T01RI67_n130BarCodPar ;
   private String[] T01RI68_A396EmprCod ;
   private boolean[] T01RI68_n396EmprCod ;
   private int[] T01RI68_A2253SalExtAlb ;
   private int[] T01RI68_A129BarCod ;
   private boolean[] T01RI68_n129BarCod ;
   private byte[] T01RI68_A132BarCodReo ;
   private boolean[] T01RI68_n132BarCodReo ;
   private String[] T01RI68_A130BarCodPar ;
   private boolean[] T01RI68_n130BarCodPar ;
   private String[] T01RI69_A396EmprCod ;
   private boolean[] T01RI69_n396EmprCod ;
   private long[] T01RI69_A30AlbProCod ;
   private int[] T01RI69_A129BarCod ;
   private boolean[] T01RI69_n129BarCod ;
   private byte[] T01RI69_A132BarCodReo ;
   private boolean[] T01RI69_n132BarCodReo ;
   private String[] T01RI69_A130BarCodPar ;
   private boolean[] T01RI69_n130BarCodPar ;
   private String[] T01RI70_A396EmprCod ;
   private boolean[] T01RI70_n396EmprCod ;
   private int[] T01RI70_A1348SolColCod ;
   private String[] T01RI71_A396EmprCod ;
   private boolean[] T01RI71_n396EmprCod ;
   private int[] T01RI71_A1333EstDimCod ;
   private String[] T01RI72_A396EmprCod ;
   private boolean[] T01RI72_n396EmprCod ;
   private int[] T01RI72_A1314EnsLabCod ;
   private String[] T01RI73_A396EmprCod ;
   private boolean[] T01RI73_n396EmprCod ;
   private int[] T01RI73_A129BarCod ;
   private boolean[] T01RI73_n129BarCod ;
   private byte[] T01RI73_A132BarCodReo ;
   private boolean[] T01RI73_n132BarCodReo ;
   private String[] T01RI73_A130BarCodPar ;
   private boolean[] T01RI73_n130BarCodPar ;
   private byte[] T01RI73_A906ObsReoLin ;
   private String[] T01RI74_A396EmprCod ;
   private boolean[] T01RI74_n396EmprCod ;
   private int[] T01RI74_A859CumCodCont ;
   private String[] T01RI75_A396EmprCod ;
   private boolean[] T01RI75_n396EmprCod ;
   private String[] T01RI75_A602MaqCod ;
   private java.util.Date[] T01RI75_A558HisProFec ;
   private int[] T01RI75_A561HisProLin ;
   private String[] T01RI76_A396EmprCod ;
   private boolean[] T01RI76_n396EmprCod ;
   private int[] T01RI76_A252CliCod ;
   private boolean[] T01RI76_n252CliCod ;
   private String[] T01RI76_A494ForSer ;
   private String[] T01RI76_A482ForColNom ;
   private int[] T01RI76_A483ForColNum ;
   private byte[] T01RI76_A831TipColCod ;
   private String[] T01RI77_A396EmprCod ;
   private boolean[] T01RI77_n396EmprCod ;
   private int[] T01RI77_A129BarCod ;
   private boolean[] T01RI77_n129BarCod ;
   private byte[] T01RI77_A132BarCodReo ;
   private boolean[] T01RI77_n132BarCodReo ;
   private String[] T01RI77_A130BarCodPar ;
   private boolean[] T01RI77_n130BarCodPar ;
   private String[] T01RI77_A200BarPieCod ;
   private String[] T01RI78_A396EmprCod ;
   private boolean[] T01RI78_n396EmprCod ;
   private int[] T01RI78_A129BarCod ;
   private boolean[] T01RI78_n129BarCod ;
   private byte[] T01RI78_A132BarCodReo ;
   private boolean[] T01RI78_n132BarCodReo ;
   private String[] T01RI78_A130BarCodPar ;
   private boolean[] T01RI78_n130BarCodPar ;
   private byte[] T01RI78_A188BarNotLin ;
   private String[] T01RI79_A396EmprCod ;
   private boolean[] T01RI79_n396EmprCod ;
   private int[] T01RI79_A129BarCod ;
   private boolean[] T01RI79_n129BarCod ;
   private byte[] T01RI79_A132BarCodReo ;
   private boolean[] T01RI79_n132BarCodReo ;
   private String[] T01RI79_A130BarCodPar ;
   private boolean[] T01RI79_n130BarCodPar ;
   private String[] T01RI79_A758ProCod ;
   private String[] T01RI80_A396EmprCod ;
   private boolean[] T01RI80_n396EmprCod ;
   private int[] T01RI80_A129BarCod ;
   private boolean[] T01RI80_n129BarCod ;
   private byte[] T01RI80_A132BarCodReo ;
   private boolean[] T01RI80_n132BarCodReo ;
   private String[] T01RI80_A130BarCodPar ;
   private boolean[] T01RI80_n130BarCodPar ;
   private int[] T01RI80_A119BarAgrCod ;
   private byte[] T01RI80_A124BarAgrReo ;
   private String[] T01RI80_A122BarAgrPar ;
   private String[] T01RI82_A396EmprCod ;
   private boolean[] T01RI82_n396EmprCod ;
   private int[] T01RI82_A129BarCod ;
   private boolean[] T01RI82_n129BarCod ;
   private byte[] T01RI82_A132BarCodReo ;
   private boolean[] T01RI82_n132BarCodReo ;
   private String[] T01RI82_A130BarCodPar ;
   private boolean[] T01RI82_n130BarCodPar ;
   private int[] T01RI83_A129BarCod ;
   private boolean[] T01RI83_n129BarCod ;
   private byte[] T01RI83_A132BarCodReo ;
   private boolean[] T01RI83_n132BarCodReo ;
   private String[] T01RI83_A130BarCodPar ;
   private boolean[] T01RI83_n130BarCodPar ;
   private int[] T01RI83_A6031Ac_Barcod ;
   private byte[] T01RI83_A6032Ac_BarReo ;
   private String[] T01RI83_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T01RI83_A6034Ac_Metros ;
   private boolean[] T01RI83_n6034Ac_Metros ;
   private java.math.BigDecimal[] T01RI83_A6035Ac_Kilos ;
   private boolean[] T01RI83_n6035Ac_Kilos ;
   private short[] T01RI83_A6036Ac_Pzs ;
   private boolean[] T01RI83_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T01RI83_A9839Ac_Abs ;
   private boolean[] T01RI83_n9839Ac_Abs ;
   private String[] T01RI83_A9840Ac_AcaQui ;
   private boolean[] T01RI83_n9840Ac_AcaQui ;
   private String[] T01RI83_A396EmprCod ;
   private boolean[] T01RI83_n396EmprCod ;
   private String[] T01RI84_A396EmprCod ;
   private boolean[] T01RI84_n396EmprCod ;
   private int[] T01RI84_A129BarCod ;
   private boolean[] T01RI84_n129BarCod ;
   private byte[] T01RI84_A132BarCodReo ;
   private boolean[] T01RI84_n132BarCodReo ;
   private String[] T01RI84_A130BarCodPar ;
   private boolean[] T01RI84_n130BarCodPar ;
   private int[] T01RI84_A6031Ac_Barcod ;
   private byte[] T01RI84_A6032Ac_BarReo ;
   private String[] T01RI84_A6033Ac_BarPar ;
   private int[] T01RI3_A129BarCod ;
   private boolean[] T01RI3_n129BarCod ;
   private byte[] T01RI3_A132BarCodReo ;
   private boolean[] T01RI3_n132BarCodReo ;
   private String[] T01RI3_A130BarCodPar ;
   private boolean[] T01RI3_n130BarCodPar ;
   private int[] T01RI3_A6031Ac_Barcod ;
   private byte[] T01RI3_A6032Ac_BarReo ;
   private String[] T01RI3_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T01RI3_A6034Ac_Metros ;
   private boolean[] T01RI3_n6034Ac_Metros ;
   private java.math.BigDecimal[] T01RI3_A6035Ac_Kilos ;
   private boolean[] T01RI3_n6035Ac_Kilos ;
   private short[] T01RI3_A6036Ac_Pzs ;
   private boolean[] T01RI3_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T01RI3_A9839Ac_Abs ;
   private boolean[] T01RI3_n9839Ac_Abs ;
   private String[] T01RI3_A9840Ac_AcaQui ;
   private boolean[] T01RI3_n9840Ac_AcaQui ;
   private String[] T01RI3_A396EmprCod ;
   private boolean[] T01RI3_n396EmprCod ;
   private int[] T01RI2_A129BarCod ;
   private boolean[] T01RI2_n129BarCod ;
   private byte[] T01RI2_A132BarCodReo ;
   private boolean[] T01RI2_n132BarCodReo ;
   private String[] T01RI2_A130BarCodPar ;
   private boolean[] T01RI2_n130BarCodPar ;
   private int[] T01RI2_A6031Ac_Barcod ;
   private byte[] T01RI2_A6032Ac_BarReo ;
   private String[] T01RI2_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T01RI2_A6034Ac_Metros ;
   private boolean[] T01RI2_n6034Ac_Metros ;
   private java.math.BigDecimal[] T01RI2_A6035Ac_Kilos ;
   private boolean[] T01RI2_n6035Ac_Kilos ;
   private short[] T01RI2_A6036Ac_Pzs ;
   private boolean[] T01RI2_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T01RI2_A9839Ac_Abs ;
   private boolean[] T01RI2_n9839Ac_Abs ;
   private String[] T01RI2_A9840Ac_AcaQui ;
   private boolean[] T01RI2_n9840Ac_AcaQui ;
   private String[] T01RI2_A396EmprCod ;
   private boolean[] T01RI2_n396EmprCod ;
   private String[] T01RI88_A396EmprCod ;
   private boolean[] T01RI88_n396EmprCod ;
   private int[] T01RI88_A129BarCod ;
   private boolean[] T01RI88_n129BarCod ;
   private byte[] T01RI88_A132BarCodReo ;
   private boolean[] T01RI88_n132BarCodReo ;
   private String[] T01RI88_A130BarCodPar ;
   private boolean[] T01RI88_n130BarCodPar ;
   private int[] T01RI88_A6031Ac_Barcod ;
   private byte[] T01RI88_A6032Ac_BarReo ;
   private String[] T01RI88_A6033Ac_BarPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
}

final  class recetasdeacabado_agrupacion__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdeacabado_agrupacion__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdeacabado_agrupacion__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdeacabado_agrupacion__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdeacabado_agrupacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RI2", "SELECT BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?  FOR UPDATE OF Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI3", "SELECT BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI4", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarAcaQui, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, BarAcaQui, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI5", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarAcaQui, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI7", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI8", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, T2.EmprNom, TM1.BarAcaQui, TM1.CliCod, TM1.DisDes, TM1.EmprCod FROM (TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI10", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RI14", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarAcaQui, EmprCod, CliCod, BarAgrEst, BarVolMaq, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01RI15", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, BarAcaQui=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01RI16", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01RI17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI18", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI19", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI20", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI24", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI25", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI26", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI27", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI28", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI29", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI33", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI37", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI38", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI40", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI41", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI42", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI43", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI44", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI45", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI46", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI47", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI50", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI51", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI52", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI53", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI54", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI55", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI56", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI57", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI58", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI59", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI60", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI61", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI62", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI64", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI65", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI66", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI67", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI68", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI69", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI70", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI71", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI72", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI74", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI75", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI76", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI77", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI78", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI79", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RI80", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RI81", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01RI82", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI83", "SELECT BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RI84", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RI85", "INSERT INTO TXPHDRACA(BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRACA")
         ,new UpdateCursor("T01RI86", "UPDATE TXPHDRACA SET Ac_Metros=?, Ac_Kilos=?, Ac_Pzs=?, Ac_Abs=?, Ac_AcaQui=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK, "TXPHDRACA")
         ,new UpdateCursor("T01RI87", "DELETE FROM TXPHDRACA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK, "TXPHDRACA")
         ,new ForEachCursor("T01RI88", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 81 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 6);
               stmt.setString(8, (String)parms[10], 6);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 1);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 79 :
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
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 83 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 1);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 6);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 3);
               }
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
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
               stmt.setInt(10, ((Number) parms[18]).intValue());
               stmt.setByte(11, ((Number) parms[19]).byteValue());
               stmt.setString(12, (String)parms[20], 1);
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 86 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
   }

}

