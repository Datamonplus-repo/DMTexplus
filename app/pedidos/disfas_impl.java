package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disfas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_1Q139( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"DISFASLIN") == 0 )
      {
         AV10DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DisFasLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISFASLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10DisFasLin), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asadisfaslin1Q139( AV10DisFasLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"DISFASLIN") == 0 )
      {
         A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asadisfaslin1Q139( A368DisFasLin, A396EmprCod, A361DisCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
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
         gxload_28( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
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
         gxload_29( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
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
         gxload_26( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A361DisCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
            AV9ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ProCod", AV9ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ProCod, ""))));
            AV10DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DisFasLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISFASLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10DisFasLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Fase del proceso", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisFasLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public disfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disfas_impl.class ));
   }

   public disfas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tablepedido.setProperty("Width", Dvpanel_tablepedido_Width);
      ucDvpanel_tablepedido.setProperty("AutoWidth", Dvpanel_tablepedido_Autowidth);
      ucDvpanel_tablepedido.setProperty("AutoHeight", Dvpanel_tablepedido_Autoheight);
      ucDvpanel_tablepedido.setProperty("Cls", Dvpanel_tablepedido_Cls);
      ucDvpanel_tablepedido.setProperty("Title", Dvpanel_tablepedido_Title);
      ucDvpanel_tablepedido.setProperty("Collapsible", Dvpanel_tablepedido_Collapsible);
      ucDvpanel_tablepedido.setProperty("Collapsed", Dvpanel_tablepedido_Collapsed);
      ucDvpanel_tablepedido.setProperty("ShowCollapseIcon", Dvpanel_tablepedido_Showcollapseicon);
      ucDvpanel_tablepedido.setProperty("IconPosition", Dvpanel_tablepedido_Iconposition);
      ucDvpanel_tablepedido.setProperty("AutoScroll", Dvpanel_tablepedido_Autoscroll);
      ucDvpanel_tablepedido.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepedido_Internalname, "DVPANEL_TABLEPEDIDOContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEPEDIDOContainer"+"TablePedido"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablepedido_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Disp Int</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisFec_Internalname, httpContext.getMessage( "Fecha Generación Pedido", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisFas.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbprocod_Internalname, httpContext.getMessage( "<b>Proceso</b>", ""), "", "", lblTbprocod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-10", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFasLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisFasLin_Internalname, httpContext.getMessage( "Linea", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFasLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFasLin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-11 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
      ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
      ucCombo_fascod.setProperty("EmptyItemText", Combo_fascod_Emptyitemtext);
      ucCombo_fascod.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
      ucCombo_fascod.setProperty("DropDownOptionsData", AV20FasCod_Data);
      ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "color:"+WebUtils.getHTMLColor( edtFasCod_Forecolor)+";"+((edtFasCod_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtFasCod_Backcolor)+";"), "", "", "", edtFasCod_Visible, edtFasCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFasObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisFasObs_Internalname, httpContext.getMessage( "Observación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDisFasObs_Internalname, A9841DisFasObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", (short)(0), 1, edtDisFasObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Pedidos\\DisFas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisFas.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV25Pgmname), GXutil.rtrim( localUtil.format( AV25Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_fascod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofascod_Internalname, GXutil.rtrim( AV21ComboFasCod), GXutil.rtrim( localUtil.format( AV21ComboFasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofascod_Visible, edtavCombofascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas.htm");
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
      e111Q12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV19DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV20FasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z368DisFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3697FasApr = httpContext.cgiGet( "Z3697FasApr") ;
            Z9841DisFasObs = httpContext.cgiGet( "Z9841DisFasObs") ;
            Z5376DisQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z5376DisQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z846UltFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z846UltFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3697FasApr = httpContext.cgiGet( "Z3697FasApr") ;
            A5376DisQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z5376DisQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A846UltFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z846UltFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N457FasCod = httpContext.cgiGet( "N457FasCod") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV10DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "vDISFASLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Insert_FasCod = httpContext.cgiGet( "vINSERT_FASCOD") ;
            A846UltFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "ULTFASLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A335DisArtCod = httpContext.cgiGet( "DISARTCOD") ;
            AV23DisArtCod = httpContext.cgiGet( "vDISARTCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3697FasApr = httpContext.cgiGet( "FASAPR") ;
            A5376DisQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "DISQUIUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A392DisUniMed = httpContext.cgiGet( "DISUNIMED") ;
            A460FasDsc = httpContext.cgiGet( "FASDSC") ;
            A4903FasAcab = httpContext.cgiGet( "FASACAB") ;
            n4903FasAcab = false ;
            A4286FasForMul = httpContext.cgiGet( "FASFORMUL") ;
            n4286FasForMul = false ;
            A456FasActTin = httpContext.cgiGet( "FASACTTIN") ;
            n456FasActTin = false ;
            A458FasCon = httpContext.cgiGet( "FASCON") ;
            n458FasCon = false ;
            A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n464FasNumPas = false ;
            A472FasVelPro = localUtil.ctond( httpContext.cgiGet( "FASVELPRO")) ;
            n472FasVelPro = false ;
            A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n468FasPrePie = false ;
            A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n469FasPreSal = false ;
            A459FasDec = localUtil.ctond( httpContext.cgiGet( "FASDEC")) ;
            n459FasDec = false ;
            A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7744FasPreObl = false ;
            A602MaqCod = httpContext.cgiGet( "MAQCOD") ;
            n602MaqCod = false ;
            A4347DisFasNot = (byte)(localUtil.ctol( httpContext.cgiGet( "DISFASNOT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4347DisFasNot = false ;
            Dvpanel_tablepedido_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Objectcall") ;
            Dvpanel_tablepedido_Class = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Class") ;
            Dvpanel_tablepedido_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Enabled")) ;
            Dvpanel_tablepedido_Width = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Width") ;
            Dvpanel_tablepedido_Height = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Height") ;
            Dvpanel_tablepedido_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autowidth")) ;
            Dvpanel_tablepedido_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoheight")) ;
            Dvpanel_tablepedido_Cls = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Cls") ;
            Dvpanel_tablepedido_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showheader")) ;
            Dvpanel_tablepedido_Title = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Title") ;
            Dvpanel_tablepedido_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsible")) ;
            Dvpanel_tablepedido_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsed")) ;
            Dvpanel_tablepedido_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showcollapseicon")) ;
            Dvpanel_tablepedido_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Iconposition") ;
            Dvpanel_tablepedido_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoscroll")) ;
            Dvpanel_tablepedido_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Visible")) ;
            Combo_fascod_Objectcall = httpContext.cgiGet( "COMBO_FASCOD_Objectcall") ;
            Combo_fascod_Class = httpContext.cgiGet( "COMBO_FASCOD_Class") ;
            Combo_fascod_Icontype = httpContext.cgiGet( "COMBO_FASCOD_Icontype") ;
            Combo_fascod_Icon = httpContext.cgiGet( "COMBO_FASCOD_Icon") ;
            Combo_fascod_Caption = httpContext.cgiGet( "COMBO_FASCOD_Caption") ;
            Combo_fascod_Tooltip = httpContext.cgiGet( "COMBO_FASCOD_Tooltip") ;
            Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
            Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
            Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
            Combo_fascod_Selectedtext_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_set") ;
            Combo_fascod_Selectedtext_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_get") ;
            Combo_fascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FASCOD_Gamoauthtoken") ;
            Combo_fascod_Ddointernalname = httpContext.cgiGet( "COMBO_FASCOD_Ddointernalname") ;
            Combo_fascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolalign") ;
            Combo_fascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FASCOD_Dropdownoptionstype") ;
            Combo_fascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Enabled")) ;
            Combo_fascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Visible")) ;
            Combo_fascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolidtoreplace") ;
            Combo_fascod_Datalisttype = httpContext.cgiGet( "COMBO_FASCOD_Datalisttype") ;
            Combo_fascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Allowmultipleselection")) ;
            Combo_fascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FASCOD_Datalistfixedvalues") ;
            Combo_fascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Isgriditem")) ;
            Combo_fascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Hasdescription")) ;
            Combo_fascod_Datalistproc = httpContext.cgiGet( "COMBO_FASCOD_Datalistproc") ;
            Combo_fascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FASCOD_Datalistprocparametersprefix") ;
            Combo_fascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FASCOD_Remoteservicesparameters") ;
            Combo_fascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeonlyselectedoption")) ;
            Combo_fascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeselectalloption")) ;
            Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
            Combo_fascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeaddnewoption")) ;
            Combo_fascod_Htmltemplate = httpContext.cgiGet( "COMBO_FASCOD_Htmltemplate") ;
            Combo_fascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluestype") ;
            Combo_fascod_Loadingdata = httpContext.cgiGet( "COMBO_FASCOD_Loadingdata") ;
            Combo_fascod_Noresultsfound = httpContext.cgiGet( "COMBO_FASCOD_Noresultsfound") ;
            Combo_fascod_Emptyitemtext = httpContext.cgiGet( "COMBO_FASCOD_Emptyitemtext") ;
            Combo_fascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FASCOD_Onlyselectedvalues") ;
            Combo_fascod_Selectalltext = httpContext.cgiGet( "COMBO_FASCOD_Selectalltext") ;
            Combo_fascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluesseparator") ;
            Combo_fascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FASCOD_Addnewoptiontext") ;
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
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISFASLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisFasLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A368DisFasLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            }
            else
            {
               A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            }
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A9841DisFasObs = httpContext.cgiGet( edtDisFasObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9841DisFasObs", A9841DisFasObs);
            AV25Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
            AV21ComboFasCod = GXutil.upper( httpContext.cgiGet( edtavCombofascod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ComboFasCod", AV21ComboFasCod);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DisFas");
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            forbiddenHiddens.add("ProCod", GXutil.rtrim( localUtil.format( A758ProCod, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV25Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV25Pgmname, "")));
            forbiddenHiddens.add("FasApr", GXutil.rtrim( localUtil.format( A3697FasApr, "@!")));
            forbiddenHiddens.add("DisQuiUl", localUtil.format( DecimalUtil.doubleToDec(A5376DisQuiUl), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidos\\disfas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
                  sMode39 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode39 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound39 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1Q10( ) ;
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
                        e111Q12 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121Q12 ();
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
         e121Q12 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1Q139( ) ;
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
         disableAttributes1Q139( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Enabled), 5, 0), true);
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

   public void confirm_1Q10( )
   {
      beforeValidate1Q139( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1Q139( ) ;
         }
         else
         {
            checkExtendedTable1Q139( ) ;
            closeExtendedTableCursors1Q139( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1Q10( )
   {
   }

   public void e111Q12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disfas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV27Emprnom ;
      GXv_char4[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      disfas_impl.this.AV7EmprCod = GXv_char2[0] ;
      disfas_impl.this.AV27Emprnom = GXv_char3[0] ;
      disfas_impl.this.AV28Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprnom", AV27Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV28Usurcod", AV28Usurcod);
      GXv_SdtWWPContext5[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV11WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV19DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV19DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtFasCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), true);
      AV21ComboFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboFasCod", AV21ComboFasCod);
      edtavCombofascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV12TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV25Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV29GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GXV1), 8, 0));
         while ( AV29GXV1 <= AV12TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV12TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV29GXV1));
            if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCod") == 0 )
            {
               AV14Insert_FasCod = AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_FasCod", AV14Insert_FasCod);
               if ( ! (GXutil.strcmp("", AV14Insert_FasCod)==0) )
               {
                  AV21ComboFasCod = AV14Insert_FasCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV21ComboFasCod", AV21ComboFasCod);
                  Combo_fascod_Selectedvalue_set = AV21ComboFasCod ;
                  ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
                  Combo_fascod_Enabled = false ;
                  ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "Enabled", GXutil.booltostr( Combo_fascod_Enabled));
               }
            }
            AV29GXV1 = (int)(AV29GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
   }

   public void e121Q12( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV20FasCod_Data ;
      GXv_char4[0] = AV17ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.pedidos.disfasloaddvcombo(remoteHandle, context).execute( "FasCod", Gx_mode, AV7EmprCod, AV8DisCod, AV9ProCod, AV10DisFasLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      disfas_impl.this.AV17ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV20FasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_fascod_Selectedvalue_set = AV17ComboSelectedValue ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
      AV21ComboFasCod = AV17ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboFasCod", AV21ComboFasCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_fascod_Enabled = false ;
         ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      }
   }

   public void zm1Q139( int GX_JID )
   {
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3697FasApr = T01Q13_A3697FasApr[0] ;
            Z9841DisFasObs = T01Q13_A9841DisFasObs[0] ;
            Z5376DisQuiUl = T01Q13_A5376DisQuiUl[0] ;
            Z457FasCod = T01Q13_A457FasCod[0] ;
         }
         else
         {
            Z3697FasApr = A3697FasApr ;
            Z9841DisFasObs = A9841DisFasObs ;
            Z5376DisQuiUl = A5376DisQuiUl ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         Z846UltFasLin = T01Q17_A846UltFasLin[0] ;
      }
      if ( GX_JID == -24 )
      {
         Z368DisFasLin = A368DisFasLin ;
         Z3697FasApr = A3697FasApr ;
         Z9841DisFasObs = A9841DisFasObs ;
         Z5376DisQuiUl = A5376DisQuiUl ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z369DisFec = A369DisFec ;
         Z392DisUniMed = A392DisUniMed ;
         Z335DisArtCod = A335DisArtCod ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z759ProDsc = A759ProDsc ;
         Z846UltFasLin = A846UltFasLin ;
         Z4347DisFasNot = A4347DisFasNot ;
         Z460FasDsc = A460FasDsc ;
         Z4903FasAcab = A4903FasAcab ;
         Z4286FasForMul = A4286FasForMul ;
         Z456FasActTin = A456FasActTin ;
         Z458FasCon = A458FasCon ;
         Z464FasNumPas = A464FasNumPas ;
         Z472FasVelPro = A472FasVelPro ;
         Z468FasPrePie = A468FasPrePie ;
         Z469FasPreSal = A469FasPreSal ;
         Z459FasDec = A459FasDec ;
         Z602MaqCod = A602MaqCod ;
      }
   }

   public void standaloneNotModal( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      AV25Pgmname = "Pedidos.DisFas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
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
      if ( ! (0==AV8DisCod) )
      {
         A361DisCod = AV8DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (GXutil.strcmp("", AV9ProCod)==0) )
      {
         A758ProCod = AV9ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (0==AV10DisFasLin) )
      {
         A368DisFasLin = AV10DisFasLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      }
      if ( ! (0==AV10DisFasLin) )
      {
         edtDisFasLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      }
      else
      {
         edtDisFasLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV10DisFasLin) )
      {
         edtDisFasLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO Permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_FasCod)==0) )
      {
         A457FasCod = AV14Insert_FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      else
      {
         A457FasCod = AV21ComboFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
      if ( isIns( )  && (GXutil.strcmp("", A3697FasApr)==0) && ( Gx_BScreen == 0 ) )
      {
         A3697FasApr = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3697FasApr", A3697FasApr);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01Q14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01Q14_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A392DisUniMed = T01Q14_A392DisUniMed[0] ;
         A335DisArtCod = T01Q14_A335DisArtCod[0] ;
         A337DisArtDsc = T01Q14_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A252CliCod = T01Q14_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(2);
         AV23DisArtCod = A335DisArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", AV23DisArtCod);
         /* Using cursor T01Q19 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01Q19_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(7);
         AV22CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
         /* Using cursor T01Q15 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01Q15_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(3);
         /* Using cursor T01Q17 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         zm1Q139( 27) ;
         A846UltFasLin = T01Q17_A846UltFasLin[0] ;
         pr_default.close(5);
         /* Using cursor T01Q111 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(8) != 101) )
         {
            A4347DisFasNot = T01Q111_A4347DisFasNot[0] ;
            n4347DisFasNot = T01Q111_n4347DisFasNot[0] ;
         }
         else
         {
            A4347DisFasNot = (byte)(0) ;
            n4347DisFasNot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4347DisFasNot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4347DisFasNot), 2, 0));
         }
         pr_default.close(8);
         /* Using cursor T01Q18 */
         pr_default.execute(6, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01Q18_A460FasDsc[0] ;
         A4903FasAcab = T01Q18_A4903FasAcab[0] ;
         n4903FasAcab = T01Q18_n4903FasAcab[0] ;
         A4286FasForMul = T01Q18_A4286FasForMul[0] ;
         n4286FasForMul = T01Q18_n4286FasForMul[0] ;
         A456FasActTin = T01Q18_A456FasActTin[0] ;
         n456FasActTin = T01Q18_n456FasActTin[0] ;
         A458FasCon = T01Q18_A458FasCon[0] ;
         n458FasCon = T01Q18_n458FasCon[0] ;
         A464FasNumPas = T01Q18_A464FasNumPas[0] ;
         n464FasNumPas = T01Q18_n464FasNumPas[0] ;
         A472FasVelPro = T01Q18_A472FasVelPro[0] ;
         n472FasVelPro = T01Q18_n472FasVelPro[0] ;
         A468FasPrePie = T01Q18_A468FasPrePie[0] ;
         n468FasPrePie = T01Q18_n468FasPrePie[0] ;
         A469FasPreSal = T01Q18_A469FasPreSal[0] ;
         n469FasPreSal = T01Q18_n469FasPreSal[0] ;
         A459FasDec = T01Q18_A459FasDec[0] ;
         n459FasDec = T01Q18_n459FasDec[0] ;
         A7744FasPreObl = T01Q18_A7744FasPreObl[0] ;
         n7744FasPreObl = T01Q18_n7744FasPreObl[0] ;
         A602MaqCod = T01Q18_A602MaqCod[0] ;
         n602MaqCod = T01Q18_n602MaqCod[0] ;
         pr_default.close(6);
      }
   }

   public void load1Q139( )
   {
      /* Using cursor T01Q113 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A846UltFasLin = T01Q113_A846UltFasLin[0] ;
         A369DisFec = T01Q113_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A392DisUniMed = T01Q113_A392DisUniMed[0] ;
         A279CliNom = T01Q113_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = T01Q113_A335DisArtCod[0] ;
         A337DisArtDsc = T01Q113_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A759ProDsc = T01Q113_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T01Q113_A460FasDsc[0] ;
         A4903FasAcab = T01Q113_A4903FasAcab[0] ;
         n4903FasAcab = T01Q113_n4903FasAcab[0] ;
         A4286FasForMul = T01Q113_A4286FasForMul[0] ;
         n4286FasForMul = T01Q113_n4286FasForMul[0] ;
         A3697FasApr = T01Q113_A3697FasApr[0] ;
         A456FasActTin = T01Q113_A456FasActTin[0] ;
         n456FasActTin = T01Q113_n456FasActTin[0] ;
         A458FasCon = T01Q113_A458FasCon[0] ;
         n458FasCon = T01Q113_n458FasCon[0] ;
         A464FasNumPas = T01Q113_A464FasNumPas[0] ;
         n464FasNumPas = T01Q113_n464FasNumPas[0] ;
         A472FasVelPro = T01Q113_A472FasVelPro[0] ;
         n472FasVelPro = T01Q113_n472FasVelPro[0] ;
         A468FasPrePie = T01Q113_A468FasPrePie[0] ;
         n468FasPrePie = T01Q113_n468FasPrePie[0] ;
         A469FasPreSal = T01Q113_A469FasPreSal[0] ;
         n469FasPreSal = T01Q113_n469FasPreSal[0] ;
         A459FasDec = T01Q113_A459FasDec[0] ;
         n459FasDec = T01Q113_n459FasDec[0] ;
         A9841DisFasObs = T01Q113_A9841DisFasObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9841DisFasObs", A9841DisFasObs);
         A5376DisQuiUl = T01Q113_A5376DisQuiUl[0] ;
         A7744FasPreObl = T01Q113_A7744FasPreObl[0] ;
         n7744FasPreObl = T01Q113_n7744FasPreObl[0] ;
         A457FasCod = T01Q113_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A252CliCod = T01Q113_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A602MaqCod = T01Q113_A602MaqCod[0] ;
         n602MaqCod = T01Q113_n602MaqCod[0] ;
         A4347DisFasNot = T01Q113_A4347DisFasNot[0] ;
         n4347DisFasNot = T01Q113_n4347DisFasNot[0] ;
         zm1Q139( -24) ;
      }
      pr_default.close(9);
      onLoadActions1Q139( ) ;
   }

   public void onLoadActions1Q139( )
   {
      AV23DisArtCod = A335DisArtCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", AV23DisArtCod);
      AV22CliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
      if ( ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), true);
      }
      if ( ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Backcolor = GXutil.getColor( 0, 128, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), true);
      }
   }

   public void checkExtendedTable1Q139( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01Q18 */
      pr_default.execute(6, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01Q18_A460FasDsc[0] ;
      A4903FasAcab = T01Q18_A4903FasAcab[0] ;
      n4903FasAcab = T01Q18_n4903FasAcab[0] ;
      A4286FasForMul = T01Q18_A4286FasForMul[0] ;
      n4286FasForMul = T01Q18_n4286FasForMul[0] ;
      A456FasActTin = T01Q18_A456FasActTin[0] ;
      n456FasActTin = T01Q18_n456FasActTin[0] ;
      A458FasCon = T01Q18_A458FasCon[0] ;
      n458FasCon = T01Q18_n458FasCon[0] ;
      A464FasNumPas = T01Q18_A464FasNumPas[0] ;
      n464FasNumPas = T01Q18_n464FasNumPas[0] ;
      A472FasVelPro = T01Q18_A472FasVelPro[0] ;
      n472FasVelPro = T01Q18_n472FasVelPro[0] ;
      A468FasPrePie = T01Q18_A468FasPrePie[0] ;
      n468FasPrePie = T01Q18_n468FasPrePie[0] ;
      A469FasPreSal = T01Q18_A469FasPreSal[0] ;
      n469FasPreSal = T01Q18_n469FasPreSal[0] ;
      A459FasDec = T01Q18_A459FasDec[0] ;
      n459FasDec = T01Q18_n459FasDec[0] ;
      A7744FasPreObl = T01Q18_A7744FasPreObl[0] ;
      n7744FasPreObl = T01Q18_n7744FasPreObl[0] ;
      A602MaqCod = T01Q18_A602MaqCod[0] ;
      n602MaqCod = T01Q18_n602MaqCod[0] ;
      pr_default.close(6);
      /* Using cursor T01Q14 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01Q14_A369DisFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A392DisUniMed = T01Q14_A392DisUniMed[0] ;
      A335DisArtCod = T01Q14_A335DisArtCod[0] ;
      A337DisArtDsc = T01Q14_A337DisArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A252CliCod = T01Q14_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(2);
      AV23DisArtCod = A335DisArtCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", AV23DisArtCod);
      /* Using cursor T01Q19 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01Q19_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      AV22CliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
      /* Using cursor T01Q15 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01Q15_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(3);
      /* Using cursor T01Q17 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A846UltFasLin = T01Q17_A846UltFasLin[0] ;
      pr_default.close(5);
      /* Using cursor T01Q111 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A4347DisFasNot = T01Q111_A4347DisFasNot[0] ;
         n4347DisFasNot = T01Q111_n4347DisFasNot[0] ;
      }
      else
      {
         nIsDirty_39 = (short)(1) ;
         A4347DisFasNot = (byte)(0) ;
         n4347DisFasNot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4347DisFasNot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4347DisFasNot), 2, 0));
      }
      pr_default.close(8);
      if ( A368DisFasLin == 9999 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Supero el numero maximo de lineas 9999", ""), 1, "DISFASLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), true);
      }
      if ( ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Backcolor = GXutil.getColor( 0, 128, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), true);
      }
   }

   public void closeExtendedTableCursors1Q139( )
   {
      pr_default.close(6);
      pr_default.close(2);
      pr_default.close(7);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_28( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01Q114 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01Q114_A460FasDsc[0] ;
      A4903FasAcab = T01Q114_A4903FasAcab[0] ;
      n4903FasAcab = T01Q114_n4903FasAcab[0] ;
      A4286FasForMul = T01Q114_A4286FasForMul[0] ;
      n4286FasForMul = T01Q114_n4286FasForMul[0] ;
      A456FasActTin = T01Q114_A456FasActTin[0] ;
      n456FasActTin = T01Q114_n456FasActTin[0] ;
      A458FasCon = T01Q114_A458FasCon[0] ;
      n458FasCon = T01Q114_n458FasCon[0] ;
      A464FasNumPas = T01Q114_A464FasNumPas[0] ;
      n464FasNumPas = T01Q114_n464FasNumPas[0] ;
      A472FasVelPro = T01Q114_A472FasVelPro[0] ;
      n472FasVelPro = T01Q114_n472FasVelPro[0] ;
      A468FasPrePie = T01Q114_A468FasPrePie[0] ;
      n468FasPrePie = T01Q114_n468FasPrePie[0] ;
      A469FasPreSal = T01Q114_A469FasPreSal[0] ;
      n469FasPreSal = T01Q114_n469FasPreSal[0] ;
      A459FasDec = T01Q114_A459FasDec[0] ;
      n459FasDec = T01Q114_n459FasDec[0] ;
      A7744FasPreObl = T01Q114_A7744FasPreObl[0] ;
      n7744FasPreObl = T01Q114_n7744FasPreObl[0] ;
      A602MaqCod = T01Q114_A602MaqCod[0] ;
      n602MaqCod = T01Q114_n602MaqCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_25( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01Q115 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01Q115_A369DisFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A392DisUniMed = T01Q115_A392DisUniMed[0] ;
      A335DisArtCod = T01Q115_A335DisArtCod[0] ;
      A337DisArtDsc = T01Q115_A337DisArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A252CliCod = T01Q115_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A369DisFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A335DisArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A337DisArtDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_29( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01Q116 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01Q116_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_26( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01Q117 */
      pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01Q117_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_27( String A396EmprCod ,
                          int A361DisCod ,
                          String A758ProCod )
   {
      /* Using cursor T01Q17 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A846UltFasLin = T01Q17_A846UltFasLin[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A846UltFasLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_30( String A396EmprCod ,
                          int A361DisCod ,
                          String A758ProCod ,
                          short A368DisFasLin )
   {
      /* Using cursor T01Q119 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A4347DisFasNot = T01Q119_A4347DisFasNot[0] ;
         n4347DisFasNot = T01Q119_n4347DisFasNot[0] ;
      }
      else
      {
         A4347DisFasNot = (byte)(0) ;
         n4347DisFasNot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4347DisFasNot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4347DisFasNot), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4347DisFasNot, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1Q139( )
   {
      /* Using cursor T01Q120 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01Q13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1Q139( 24) ;
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01Q13_A368DisFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
         A3697FasApr = T01Q13_A3697FasApr[0] ;
         A9841DisFasObs = T01Q13_A9841DisFasObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9841DisFasObs", A9841DisFasObs);
         A5376DisQuiUl = T01Q13_A5376DisQuiUl[0] ;
         A396EmprCod = T01Q13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01Q13_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01Q13_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01Q13_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1Q139( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKey1Q139( ) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1Q139( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1Q139( ) ;
      if ( RcdFound39 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T01Q121 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, A758ProCod, A758ProCod, Integer.valueOf(A361DisCod), A396EmprCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q121_A361DisCod[0] < A361DisCod ) || ( T01Q121_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q121_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01Q121_A758ProCod[0], A758ProCod) == 0 ) && ( T01Q121_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q121_A368DisFasLin[0] < A368DisFasLin ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q121_A361DisCod[0] > A361DisCod ) || ( T01Q121_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q121_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01Q121_A758ProCod[0], A758ProCod) == 0 ) && ( T01Q121_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q121_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q121_A368DisFasLin[0] > A368DisFasLin ) ) )
         {
            A396EmprCod = T01Q121_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01Q121_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = T01Q121_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = T01Q121_A368DisFasLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T01Q122 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, A758ProCod, A758ProCod, Integer.valueOf(A361DisCod), A396EmprCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q122_A361DisCod[0] > A361DisCod ) || ( T01Q122_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q122_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01Q122_A758ProCod[0], A758ProCod) == 0 ) && ( T01Q122_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q122_A368DisFasLin[0] > A368DisFasLin ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q122_A361DisCod[0] < A361DisCod ) || ( T01Q122_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q122_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01Q122_A758ProCod[0], A758ProCod) == 0 ) && ( T01Q122_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01Q122_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q122_A368DisFasLin[0] < A368DisFasLin ) ) )
         {
            A396EmprCod = T01Q122_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01Q122_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = T01Q122_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = T01Q122_A368DisFasLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q139( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDisFasLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1Q139( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A368DisFasLin = Z368DisFasLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDisFasLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1Q139( ) ;
               GX_FocusControl = edtDisFasLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtDisFasLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1Q139( ) ;
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
                  GX_FocusControl = edtDisFasLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1Q139( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A368DisFasLin = Z368DisFasLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDisFasLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1Q139( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01Q12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3697FasApr, T01Q12_A3697FasApr[0]) != 0 ) || ( GXutil.strcmp(Z9841DisFasObs, T01Q12_A9841DisFasObs[0]) != 0 ) || ( Z5376DisQuiUl != T01Q12_A5376DisQuiUl[0] ) || ( GXutil.strcmp(Z457FasCod, T01Q12_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3697FasApr, T01Q12_A3697FasApr[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disfas:[seudo value changed for attri]"+"FasApr");
               GXutil.writeLogRaw("Old: ",Z3697FasApr);
               GXutil.writeLogRaw("Current: ",T01Q12_A3697FasApr[0]);
            }
            if ( GXutil.strcmp(Z9841DisFasObs, T01Q12_A9841DisFasObs[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disfas:[seudo value changed for attri]"+"DisFasObs");
               GXutil.writeLogRaw("Old: ",Z9841DisFasObs);
               GXutil.writeLogRaw("Current: ",T01Q12_A9841DisFasObs[0]);
            }
            if ( Z5376DisQuiUl != T01Q12_A5376DisQuiUl[0] )
            {
               GXutil.writeLogln("pedidos.disfas:[seudo value changed for attri]"+"DisQuiUl");
               GXutil.writeLogRaw("Old: ",Z5376DisQuiUl);
               GXutil.writeLogRaw("Current: ",T01Q12_A5376DisQuiUl[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01Q12_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disfas:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01Q12_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01Q123 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(18) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISLIN"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( Z846UltFasLin != T01Q123_A846UltFasLin[0] ) )
         {
            if ( Z846UltFasLin != T01Q123_A846UltFasLin[0] )
            {
               GXutil.writeLogln("pedidos.disfas:[seudo value changed for attri]"+"UltFasLin");
               GXutil.writeLogRaw("Old: ",Z846UltFasLin);
               GXutil.writeLogRaw("Current: ",T01Q123_A846UltFasLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q139( )
   {
      beforeValidate1Q139( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q139( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q139( 0) ;
         checkOptimisticConcurrency1Q139( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q139( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q139( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q124 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Short.valueOf(A368DisFasLin), A3697FasApr, A9841DisFasObs, Short.valueOf(A5376DisQuiUl), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11Q139( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1Q10( ) ;
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
            load1Q139( ) ;
         }
         endLevel1Q139( ) ;
      }
      closeExtendedTableCursors1Q139( ) ;
   }

   public void update1Q139( )
   {
      beforeValidate1Q139( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q139( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q139( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q139( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q139( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q125 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A3697FasApr, A9841DisFasObs, Short.valueOf(A5376DisQuiUl), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q139( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11Q139( ) ;
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
         endLevel1Q139( ) ;
      }
      closeExtendedTableCursors1Q139( ) ;
   }

   public void deferredUpdate1Q139( )
   {
   }

   public void delete( )
   {
      beforeValidate1Q139( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q139( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q139( ) ;
         afterConfirm1Q139( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q139( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01Q126 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
               if ( AnyError == 0 )
               {
                  updateTablesN11Q139( ) ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1Q139( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1Q139( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01Q127 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01Q127_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A392DisUniMed = T01Q127_A392DisUniMed[0] ;
         A335DisArtCod = T01Q127_A335DisArtCod[0] ;
         A337DisArtDsc = T01Q127_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A252CliCod = T01Q127_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(22);
         AV23DisArtCod = A335DisArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", AV23DisArtCod);
         /* Using cursor T01Q128 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01Q128_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(23);
         AV22CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
         /* Using cursor T01Q129 */
         pr_default.execute(24, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01Q129_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(24);
         /* Using cursor T01Q130 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Z846UltFasLin = T01Q130_A846UltFasLin[0] ;
         A846UltFasLin = T01Q130_A846UltFasLin[0] ;
         pr_default.close(25);
         /* Using cursor T01Q132 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A4347DisFasNot = T01Q132_A4347DisFasNot[0] ;
            n4347DisFasNot = T01Q132_n4347DisFasNot[0] ;
         }
         else
         {
            A4347DisFasNot = (byte)(0) ;
            n4347DisFasNot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4347DisFasNot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4347DisFasNot), 2, 0));
         }
         pr_default.close(26);
         /* Using cursor T01Q133 */
         pr_default.execute(27, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01Q133_A460FasDsc[0] ;
         A4903FasAcab = T01Q133_A4903FasAcab[0] ;
         n4903FasAcab = T01Q133_n4903FasAcab[0] ;
         A4286FasForMul = T01Q133_A4286FasForMul[0] ;
         n4286FasForMul = T01Q133_n4286FasForMul[0] ;
         A456FasActTin = T01Q133_A456FasActTin[0] ;
         n456FasActTin = T01Q133_n456FasActTin[0] ;
         A458FasCon = T01Q133_A458FasCon[0] ;
         n458FasCon = T01Q133_n458FasCon[0] ;
         A464FasNumPas = T01Q133_A464FasNumPas[0] ;
         n464FasNumPas = T01Q133_n464FasNumPas[0] ;
         A472FasVelPro = T01Q133_A472FasVelPro[0] ;
         n472FasVelPro = T01Q133_n472FasVelPro[0] ;
         A468FasPrePie = T01Q133_A468FasPrePie[0] ;
         n468FasPrePie = T01Q133_n468FasPrePie[0] ;
         A469FasPreSal = T01Q133_A469FasPreSal[0] ;
         n469FasPreSal = T01Q133_n469FasPreSal[0] ;
         A459FasDec = T01Q133_A459FasDec[0] ;
         n459FasDec = T01Q133_n459FasDec[0] ;
         A7744FasPreObl = T01Q133_A7744FasPreObl[0] ;
         n7744FasPreObl = T01Q133_n7744FasPreObl[0] ;
         A602MaqCod = T01Q133_A602MaqCod[0] ;
         n602MaqCod = T01Q133_n602MaqCod[0] ;
         pr_default.close(27);
         if ( ! (GXutil.strcmp("", A9841DisFasObs)==0) )
         {
            edtFasCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), true);
         }
         if ( ! (GXutil.strcmp("", A9841DisFasObs)==0) )
         {
            edtFasCod_Backcolor = GXutil.getColor( 0, 128, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), true);
         }
      }
   }

   public void updateTablesN11Q139( )
   {
      /* Using cursor T01Q134 */
      pr_default.execute(28, new Object[] {Short.valueOf(A846UltFasLin), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
   }

   public void endLevel1Q139( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(18);
      if ( AnyError == 0 )
      {
         beforeComplete1Q139( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.disfas");
         if ( AnyError == 0 )
         {
            confirmValues1Q10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidos.disfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1Q139( )
   {
      /* Scan By routine */
      /* Using cursor T01Q135 */
      pr_default.execute(29);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A396EmprCod = T01Q135_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01Q135_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01Q135_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A368DisFasLin = T01Q135_A368DisFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1Q139( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A396EmprCod = T01Q135_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01Q135_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01Q135_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A368DisFasLin = T01Q135_A368DisFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      }
   }

   public void scanEnd1Q139( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1Q139( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A457FasCod ;
         GXv_int10[0] = AV22CliCod ;
         GXv_char3[0] = AV23DisArtCod ;
         GXv_char2[0] = httpContext.getMessage( "INS", "") ;
         new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, GXv_char4, GXv_int10, GXv_char3, GXv_char2) ;
         disfas_impl.this.A457FasCod = GXv_char4[0] ;
         disfas_impl.this.AV22CliCod = GXv_int10[0] ;
         disfas_impl.this.AV23DisArtCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", AV23DisArtCod);
      }
   }

   public void beforeInsert1Q139( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A368DisFasLin) )
      {
         GXt_int11 = A368DisFasLin ;
         GXv_int12[0] = GXt_int11 ;
         new app.pedidos.disfas_proxid(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, GXv_int12) ;
         disfas_impl.this.GXt_int11 = GXv_int12[0] ;
         A368DisFasLin = GXt_int11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      }
      A846UltFasLin = A368DisFasLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A846UltFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A846UltFasLin), 4, 0));
   }

   public void beforeUpdate1Q139( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1Q139( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q139( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q139( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q139( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtDisFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombofascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1Q139( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1Q10( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10DisFasLin,4,0))}, new String[] {"Gx_mode","EmprCod","DisCod","ProCod","DisFasLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DisFas");
      forbiddenHiddens.add("ProCod", GXutil.rtrim( localUtil.format( A758ProCod, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV25Pgmname, "")));
      forbiddenHiddens.add("FasApr", GXutil.rtrim( localUtil.format( A3697FasApr, "@!")));
      forbiddenHiddens.add("DisQuiUl", localUtil.format( DecimalUtil.doubleToDec(A5376DisQuiUl), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disfas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3697FasApr", GXutil.rtrim( Z3697FasApr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9841DisFasObs", Z9841DisFasObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5376DisQuiUl", GXutil.ltrim( localUtil.ntoc( Z5376DisQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z846UltFasLin", GXutil.ltrim( localUtil.ntoc( Z846UltFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N457FasCod", GXutil.rtrim( A457FasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV20FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV20FasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV8DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV9ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISFASLIN", GXutil.ltrim( localUtil.ntoc( AV10DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISFASLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10DisFasLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCOD", GXutil.rtrim( AV14Insert_FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ULTFASLIN", GXutil.ltrim( localUtil.ntoc( A846UltFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV22CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTCOD", GXutil.rtrim( A335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISARTCOD", GXutil.rtrim( AV23DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASAPR", GXutil.rtrim( A3697FasApr));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUIUL", GXutil.ltrim( localUtil.ntoc( A5376DisQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISUNIMED", GXutil.rtrim( A392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACAB", GXutil.rtrim( A4903FasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL", GXutil.rtrim( A4286FasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN", GXutil.rtrim( A456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON", GXutil.rtrim( A458FasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "FASNUMPAS", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASVELPRO", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREPIE", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPRESAL", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASNOT", GXutil.ltrim( localUtil.ntoc( A4347DisFasNot, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Objectcall", GXutil.rtrim( Dvpanel_tablepedido_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Enabled", GXutil.booltostr( Dvpanel_tablepedido_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Width", GXutil.rtrim( Dvpanel_tablepedido_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autowidth", GXutil.booltostr( Dvpanel_tablepedido_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoheight", GXutil.booltostr( Dvpanel_tablepedido_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Cls", GXutil.rtrim( Dvpanel_tablepedido_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Title", GXutil.rtrim( Dvpanel_tablepedido_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsible", GXutil.booltostr( Dvpanel_tablepedido_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsed", GXutil.booltostr( Dvpanel_tablepedido_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepedido_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Iconposition", GXutil.rtrim( Dvpanel_tablepedido_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoscroll", GXutil.booltostr( Dvpanel_tablepedido_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Objectcall", GXutil.rtrim( Combo_fascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitemtext", GXutil.rtrim( Combo_fascod_Emptyitemtext));
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
      return formatLink("app.pedidos.disfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10DisFasLin,4,0))}, new String[] {"Gx_mode","EmprCod","DisCod","ProCod","DisFasLin"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisFas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fase del proceso", "") ;
   }

   public void initializeNonKey1Q139( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A846UltFasLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A846UltFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A846UltFasLin), 4, 0));
      AV22CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
      AV23DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", AV23DisArtCod);
      A369DisFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A337DisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4903FasAcab = "" ;
      n4903FasAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A456FasActTin = "" ;
      n456FasActTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      A458FasCon = "" ;
      n458FasCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      A464FasNumPas = (short)(0) ;
      n464FasNumPas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      A472FasVelPro = DecimalUtil.ZERO ;
      n472FasVelPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      A468FasPrePie = (short)(0) ;
      n468FasPrePie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
      A469FasPreSal = (short)(0) ;
      n469FasPreSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A9841DisFasObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9841DisFasObs", A9841DisFasObs);
      A4347DisFasNot = (byte)(0) ;
      n4347DisFasNot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4347DisFasNot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4347DisFasNot), 2, 0));
      A5376DisQuiUl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      A3697FasApr = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3697FasApr", A3697FasApr);
      Z3697FasApr = "" ;
      Z9841DisFasObs = "" ;
      Z5376DisQuiUl = (short)(0) ;
      Z457FasCod = "" ;
      Z846UltFasLin = (short)(0) ;
   }

   public void initAll1Q139( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A368DisFasLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      initializeNonKey1Q139( ) ;
   }

   public void standaloneModalInsert( )
   {
      A3697FasApr = i3697FasApr ;
      httpContext.ajax_rsp_assign_attri("", false, "A3697FasApr", A3697FasApr);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169297", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disfas.js", "?2026821169298", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTbngruia_Internalname = "TBNGRUIA" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisFec_Internalname = "DISFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTbprocod_Internalname = "TBPROCOD" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablepedido_Internalname = "TABLEPEDIDO" ;
      Dvpanel_tablepedido_Internalname = "DVPANEL_TABLEPEDIDO" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      lblTextblockfascod_Internalname = "TEXTBLOCKFASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      edtFasCod_Internalname = "FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtDisFasObs_Internalname = "DISFASOBS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombofascod_Internalname = "vCOMBOFASCOD" ;
      divSectionattribute_fascod_Internalname = "SECTIONATTRIBUTE_FASCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Fase del proceso", "") );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavCombofascod_Jsonclick = "" ;
      edtavCombofascod_Enabled = 0 ;
      edtavCombofascod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDisFasObs_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backstyle = (byte)(-1) ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Forecolor = (int)(0x000000) ;
      edtFasCod_Enabled = 1 ;
      edtFasCod_Visible = 1 ;
      Combo_fascod_Emptyitemtext = "" ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascod_Caption = "" ;
      Combo_fascod_Enabled = GXutil.toBoolean( -1) ;
      edtDisFasLin_Jsonclick = "" ;
      edtDisFasLin_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Fase", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      Dvpanel_tablepedido_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Iconposition = "Right" ;
      Dvpanel_tablepedido_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Title = "" ;
      Dvpanel_tablepedido_Cls = "PanelNoHeader" ;
      Dvpanel_tablepedido_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Width = "100%" ;
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

   public void gx9asadisfaslin1Q139( short AV10DisFasLin )
   {
      if ( ! (0==AV10DisFasLin) )
      {
         A368DisFasLin = AV10DisFasLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx10asadisfaslin1Q139( short A368DisFasLin ,
                                      String A396EmprCod ,
                                      int A361DisCod ,
                                      String A758ProCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A368DisFasLin) )
      {
         GXt_int11 = A368DisFasLin ;
         GXv_int12[0] = GXt_int11 ;
         new app.pedidos.disfas_proxid(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, GXv_int12) ;
         disfas_impl.this.GXt_int11 = GXv_int12[0] ;
         A368DisFasLin = GXt_int11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_1Q139( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A457FasCod ;
         GXv_int10[0] = AV22CliCod ;
         GXv_char3[0] = AV23DisArtCod ;
         GXv_char2[0] = httpContext.getMessage( "INS", "") ;
         new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, GXv_char4, GXv_int10, GXv_char3, GXv_char2) ;
         A457FasCod = GXv_char4[0] ;
         AV22CliCod = GXv_int10[0] ;
         AV23DisArtCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", AV23DisArtCod);
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
      n4347DisFasNot = false ;
      /* Using cursor T01Q127 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A369DisFec = T01Q127_A369DisFec[0] ;
      A392DisUniMed = T01Q127_A392DisUniMed[0] ;
      A335DisArtCod = T01Q127_A335DisArtCod[0] ;
      A337DisArtDsc = T01Q127_A337DisArtDsc[0] ;
      A252CliCod = T01Q127_A252CliCod[0] ;
      pr_default.close(22);
      AV23DisArtCod = A335DisArtCod ;
      AV22CliCod = A252CliCod ;
      /* Using cursor T01Q129 */
      pr_default.execute(24, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A759ProDsc = T01Q129_A759ProDsc[0] ;
      pr_default.close(24);
      /* Using cursor T01Q130 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      Z846UltFasLin = T01Q130_A846UltFasLin[0] ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A846UltFasLin = T01Q130_A846UltFasLin[0] ;
      pr_default.close(25);
      /* Using cursor T01Q128 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01Q128_A279CliNom[0] ;
      pr_default.close(23);
      /* Using cursor T01Q132 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A4347DisFasNot = T01Q132_A4347DisFasNot[0] ;
         n4347DisFasNot = T01Q132_n4347DisFasNot[0] ;
      }
      else
      {
         A4347DisFasNot = (byte)(0) ;
         n4347DisFasNot = false ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", GXutil.rtrim( A337DisArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV23DisArtCod", GXutil.rtrim( AV23DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrim( localUtil.ntoc( AV22CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A846UltFasLin", GXutil.ltrim( localUtil.ntoc( A846UltFasLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4347DisFasNot", GXutil.ltrim( localUtil.ntoc( A4347DisFasNot, (byte)(2), (byte)(0), ".", "")));
   }

   public void valid_Fascod( )
   {
      n4903FasAcab = false ;
      n4286FasForMul = false ;
      n456FasActTin = false ;
      n458FasCon = false ;
      n464FasNumPas = false ;
      n472FasVelPro = false ;
      n468FasPrePie = false ;
      n469FasPreSal = false ;
      n459FasDec = false ;
      n7744FasPreObl = false ;
      n602MaqCod = false ;
      /* Using cursor T01Q133 */
      pr_default.execute(27, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01Q133_A460FasDsc[0] ;
      A4903FasAcab = T01Q133_A4903FasAcab[0] ;
      n4903FasAcab = T01Q133_n4903FasAcab[0] ;
      A4286FasForMul = T01Q133_A4286FasForMul[0] ;
      n4286FasForMul = T01Q133_n4286FasForMul[0] ;
      A456FasActTin = T01Q133_A456FasActTin[0] ;
      n456FasActTin = T01Q133_n456FasActTin[0] ;
      A458FasCon = T01Q133_A458FasCon[0] ;
      n458FasCon = T01Q133_n458FasCon[0] ;
      A464FasNumPas = T01Q133_A464FasNumPas[0] ;
      n464FasNumPas = T01Q133_n464FasNumPas[0] ;
      A472FasVelPro = T01Q133_A472FasVelPro[0] ;
      n472FasVelPro = T01Q133_n472FasVelPro[0] ;
      A468FasPrePie = T01Q133_A468FasPrePie[0] ;
      n468FasPrePie = T01Q133_n468FasPrePie[0] ;
      A469FasPreSal = T01Q133_A469FasPreSal[0] ;
      n469FasPreSal = T01Q133_n469FasPreSal[0] ;
      A459FasDec = T01Q133_A459FasDec[0] ;
      n459FasDec = T01Q133_n459FasDec[0] ;
      A7744FasPreObl = T01Q133_A7744FasPreObl[0] ;
      n7744FasPreObl = T01Q133_n7744FasPreObl[0] ;
      A602MaqCod = T01Q133_A602MaqCod[0] ;
      n602MaqCod = T01Q133_n602MaqCod[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", GXutil.rtrim( A4903FasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV10DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV10DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV25Pgmname',fld:'vPGMNAME',pic:''},{av:'A3697FasApr',fld:'FASAPR',pic:'@!'},{av:'A5376DisQuiUl',fld:'DISQUIUL',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121Q12',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]}");
      setEventMetadata("VALID_DISFASOBS","{handler:'valid_Disfasobs',iparms:[]");
      setEventMetadata("VALID_DISFASOBS",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOFASCOD","{handler:'validv_Combofascod',iparms:[]");
      setEventMetadata("VALIDV_COMBOFASCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'AV23DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A846UltFasLin',fld:'ULTFASLIN',pic:'ZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4347DisFasNot',fld:'DISFASNOT',pic:'Z9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV23DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A846UltFasLin',fld:'ULTFASLIN',pic:'ZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4347DisFasNot',fld:'DISFASNOT',pic:'Z9'}]}");
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
      pr_default.close(22);
      pr_default.close(25);
      pr_default.close(27);
      pr_default.close(24);
      pr_default.close(23);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z3697FasApr = "" ;
      Z9841DisFasObs = "" ;
      Z457FasCod = "" ;
      N457FasCod = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV9ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablepedido = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A337DisArtDsc = "" ;
      lblTbprocod_Jsonclick = "" ;
      A759ProDsc = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockfascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      AV19DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV20FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A9841DisFasObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV25Pgmname = "" ;
      AV21ComboFasCod = "" ;
      A3697FasApr = "" ;
      AV14Insert_FasCod = "" ;
      A335DisArtCod = "" ;
      AV23DisArtCod = "" ;
      A392DisUniMed = "" ;
      A460FasDsc = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A459FasDec = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      Dvpanel_tablepedido_Objectcall = "" ;
      Dvpanel_tablepedido_Class = "" ;
      Dvpanel_tablepedido_Height = "" ;
      Combo_fascod_Objectcall = "" ;
      Combo_fascod_Class = "" ;
      Combo_fascod_Icontype = "" ;
      Combo_fascod_Icon = "" ;
      Combo_fascod_Tooltip = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedtext_set = "" ;
      Combo_fascod_Selectedtext_get = "" ;
      Combo_fascod_Gamoauthtoken = "" ;
      Combo_fascod_Ddointernalname = "" ;
      Combo_fascod_Titlecontrolalign = "" ;
      Combo_fascod_Dropdownoptionstype = "" ;
      Combo_fascod_Titlecontrolidtoreplace = "" ;
      Combo_fascod_Datalisttype = "" ;
      Combo_fascod_Datalistfixedvalues = "" ;
      Combo_fascod_Datalistproc = "" ;
      Combo_fascod_Datalistprocparametersprefix = "" ;
      Combo_fascod_Remoteservicesparameters = "" ;
      Combo_fascod_Htmltemplate = "" ;
      Combo_fascod_Multiplevaluestype = "" ;
      Combo_fascod_Loadingdata = "" ;
      Combo_fascod_Noresultsfound = "" ;
      Combo_fascod_Onlyselectedvalues = "" ;
      Combo_fascod_Selectalltext = "" ;
      Combo_fascod_Multiplevaluesseparator = "" ;
      Combo_fascod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode39 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV26Station = "" ;
      GXt_char1 = "" ;
      AV27Emprnom = "" ;
      AV28Usurcod = "" ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      AV15TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV17ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z369DisFec = GXutil.nullDate() ;
      Z392DisUniMed = "" ;
      Z335DisArtCod = "" ;
      Z337DisArtDsc = "" ;
      Z279CliNom = "" ;
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      Z4903FasAcab = "" ;
      Z4286FasForMul = "" ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      T01Q14_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q14_A392DisUniMed = new String[] {""} ;
      T01Q14_A335DisArtCod = new String[] {""} ;
      T01Q14_A337DisArtDsc = new String[] {""} ;
      T01Q14_A252CliCod = new int[1] ;
      T01Q19_A279CliNom = new String[] {""} ;
      T01Q15_A759ProDsc = new String[] {""} ;
      T01Q17_A846UltFasLin = new short[1] ;
      T01Q111_A4347DisFasNot = new byte[1] ;
      T01Q111_n4347DisFasNot = new boolean[] {false} ;
      T01Q18_A460FasDsc = new String[] {""} ;
      T01Q18_A4903FasAcab = new String[] {""} ;
      T01Q18_n4903FasAcab = new boolean[] {false} ;
      T01Q18_A4286FasForMul = new String[] {""} ;
      T01Q18_n4286FasForMul = new boolean[] {false} ;
      T01Q18_A456FasActTin = new String[] {""} ;
      T01Q18_n456FasActTin = new boolean[] {false} ;
      T01Q18_A458FasCon = new String[] {""} ;
      T01Q18_n458FasCon = new boolean[] {false} ;
      T01Q18_A464FasNumPas = new short[1] ;
      T01Q18_n464FasNumPas = new boolean[] {false} ;
      T01Q18_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q18_n472FasVelPro = new boolean[] {false} ;
      T01Q18_A468FasPrePie = new short[1] ;
      T01Q18_n468FasPrePie = new boolean[] {false} ;
      T01Q18_A469FasPreSal = new short[1] ;
      T01Q18_n469FasPreSal = new boolean[] {false} ;
      T01Q18_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q18_n459FasDec = new boolean[] {false} ;
      T01Q18_A7744FasPreObl = new byte[1] ;
      T01Q18_n7744FasPreObl = new boolean[] {false} ;
      T01Q18_A602MaqCod = new String[] {""} ;
      T01Q18_n602MaqCod = new boolean[] {false} ;
      T01Q113_A368DisFasLin = new short[1] ;
      T01Q113_A846UltFasLin = new short[1] ;
      T01Q113_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q113_A392DisUniMed = new String[] {""} ;
      T01Q113_A279CliNom = new String[] {""} ;
      T01Q113_A335DisArtCod = new String[] {""} ;
      T01Q113_A337DisArtDsc = new String[] {""} ;
      T01Q113_A759ProDsc = new String[] {""} ;
      T01Q113_A460FasDsc = new String[] {""} ;
      T01Q113_A4903FasAcab = new String[] {""} ;
      T01Q113_n4903FasAcab = new boolean[] {false} ;
      T01Q113_A4286FasForMul = new String[] {""} ;
      T01Q113_n4286FasForMul = new boolean[] {false} ;
      T01Q113_A3697FasApr = new String[] {""} ;
      T01Q113_A456FasActTin = new String[] {""} ;
      T01Q113_n456FasActTin = new boolean[] {false} ;
      T01Q113_A458FasCon = new String[] {""} ;
      T01Q113_n458FasCon = new boolean[] {false} ;
      T01Q113_A464FasNumPas = new short[1] ;
      T01Q113_n464FasNumPas = new boolean[] {false} ;
      T01Q113_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q113_n472FasVelPro = new boolean[] {false} ;
      T01Q113_A468FasPrePie = new short[1] ;
      T01Q113_n468FasPrePie = new boolean[] {false} ;
      T01Q113_A469FasPreSal = new short[1] ;
      T01Q113_n469FasPreSal = new boolean[] {false} ;
      T01Q113_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q113_n459FasDec = new boolean[] {false} ;
      T01Q113_A9841DisFasObs = new String[] {""} ;
      T01Q113_A5376DisQuiUl = new short[1] ;
      T01Q113_A7744FasPreObl = new byte[1] ;
      T01Q113_n7744FasPreObl = new boolean[] {false} ;
      T01Q113_A396EmprCod = new String[] {""} ;
      T01Q113_A361DisCod = new int[1] ;
      T01Q113_A758ProCod = new String[] {""} ;
      T01Q113_A457FasCod = new String[] {""} ;
      T01Q113_A252CliCod = new int[1] ;
      T01Q113_A602MaqCod = new String[] {""} ;
      T01Q113_n602MaqCod = new boolean[] {false} ;
      T01Q113_A4347DisFasNot = new byte[1] ;
      T01Q113_n4347DisFasNot = new boolean[] {false} ;
      T01Q114_A460FasDsc = new String[] {""} ;
      T01Q114_A4903FasAcab = new String[] {""} ;
      T01Q114_n4903FasAcab = new boolean[] {false} ;
      T01Q114_A4286FasForMul = new String[] {""} ;
      T01Q114_n4286FasForMul = new boolean[] {false} ;
      T01Q114_A456FasActTin = new String[] {""} ;
      T01Q114_n456FasActTin = new boolean[] {false} ;
      T01Q114_A458FasCon = new String[] {""} ;
      T01Q114_n458FasCon = new boolean[] {false} ;
      T01Q114_A464FasNumPas = new short[1] ;
      T01Q114_n464FasNumPas = new boolean[] {false} ;
      T01Q114_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q114_n472FasVelPro = new boolean[] {false} ;
      T01Q114_A468FasPrePie = new short[1] ;
      T01Q114_n468FasPrePie = new boolean[] {false} ;
      T01Q114_A469FasPreSal = new short[1] ;
      T01Q114_n469FasPreSal = new boolean[] {false} ;
      T01Q114_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q114_n459FasDec = new boolean[] {false} ;
      T01Q114_A7744FasPreObl = new byte[1] ;
      T01Q114_n7744FasPreObl = new boolean[] {false} ;
      T01Q114_A602MaqCod = new String[] {""} ;
      T01Q114_n602MaqCod = new boolean[] {false} ;
      T01Q115_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q115_A392DisUniMed = new String[] {""} ;
      T01Q115_A335DisArtCod = new String[] {""} ;
      T01Q115_A337DisArtDsc = new String[] {""} ;
      T01Q115_A252CliCod = new int[1] ;
      T01Q116_A279CliNom = new String[] {""} ;
      T01Q117_A759ProDsc = new String[] {""} ;
      T01Q119_A4347DisFasNot = new byte[1] ;
      T01Q119_n4347DisFasNot = new boolean[] {false} ;
      T01Q120_A396EmprCod = new String[] {""} ;
      T01Q120_A361DisCod = new int[1] ;
      T01Q120_A758ProCod = new String[] {""} ;
      T01Q120_A368DisFasLin = new short[1] ;
      T01Q13_A368DisFasLin = new short[1] ;
      T01Q13_A3697FasApr = new String[] {""} ;
      T01Q13_A9841DisFasObs = new String[] {""} ;
      T01Q13_A5376DisQuiUl = new short[1] ;
      T01Q13_A396EmprCod = new String[] {""} ;
      T01Q13_A361DisCod = new int[1] ;
      T01Q13_A758ProCod = new String[] {""} ;
      T01Q13_A457FasCod = new String[] {""} ;
      T01Q13_A7744FasPreObl = new byte[1] ;
      T01Q13_n7744FasPreObl = new boolean[] {false} ;
      T01Q121_A396EmprCod = new String[] {""} ;
      T01Q121_A361DisCod = new int[1] ;
      T01Q121_A758ProCod = new String[] {""} ;
      T01Q121_A368DisFasLin = new short[1] ;
      T01Q122_A396EmprCod = new String[] {""} ;
      T01Q122_A361DisCod = new int[1] ;
      T01Q122_A758ProCod = new String[] {""} ;
      T01Q122_A368DisFasLin = new short[1] ;
      T01Q12_A368DisFasLin = new short[1] ;
      T01Q12_A3697FasApr = new String[] {""} ;
      T01Q12_A9841DisFasObs = new String[] {""} ;
      T01Q12_A5376DisQuiUl = new short[1] ;
      T01Q12_A396EmprCod = new String[] {""} ;
      T01Q12_A361DisCod = new int[1] ;
      T01Q12_A758ProCod = new String[] {""} ;
      T01Q12_A457FasCod = new String[] {""} ;
      T01Q12_A7744FasPreObl = new byte[1] ;
      T01Q12_n7744FasPreObl = new boolean[] {false} ;
      T01Q123_A846UltFasLin = new short[1] ;
      T01Q127_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q127_A392DisUniMed = new String[] {""} ;
      T01Q127_A335DisArtCod = new String[] {""} ;
      T01Q127_A337DisArtDsc = new String[] {""} ;
      T01Q127_A252CliCod = new int[1] ;
      T01Q128_A279CliNom = new String[] {""} ;
      T01Q129_A759ProDsc = new String[] {""} ;
      T01Q130_A846UltFasLin = new short[1] ;
      T01Q132_A4347DisFasNot = new byte[1] ;
      T01Q132_n4347DisFasNot = new boolean[] {false} ;
      T01Q133_A460FasDsc = new String[] {""} ;
      T01Q133_A4903FasAcab = new String[] {""} ;
      T01Q133_n4903FasAcab = new boolean[] {false} ;
      T01Q133_A4286FasForMul = new String[] {""} ;
      T01Q133_n4286FasForMul = new boolean[] {false} ;
      T01Q133_A456FasActTin = new String[] {""} ;
      T01Q133_n456FasActTin = new boolean[] {false} ;
      T01Q133_A458FasCon = new String[] {""} ;
      T01Q133_n458FasCon = new boolean[] {false} ;
      T01Q133_A464FasNumPas = new short[1] ;
      T01Q133_n464FasNumPas = new boolean[] {false} ;
      T01Q133_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q133_n472FasVelPro = new boolean[] {false} ;
      T01Q133_A468FasPrePie = new short[1] ;
      T01Q133_n468FasPrePie = new boolean[] {false} ;
      T01Q133_A469FasPreSal = new short[1] ;
      T01Q133_n469FasPreSal = new boolean[] {false} ;
      T01Q133_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q133_n459FasDec = new boolean[] {false} ;
      T01Q133_A7744FasPreObl = new byte[1] ;
      T01Q133_n7744FasPreObl = new boolean[] {false} ;
      T01Q133_A602MaqCod = new String[] {""} ;
      T01Q133_n602MaqCod = new boolean[] {false} ;
      T01Q135_A396EmprCod = new String[] {""} ;
      T01Q135_A361DisCod = new int[1] ;
      T01Q135_A758ProCod = new String[] {""} ;
      T01Q135_A368DisFasLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i3697FasApr = "" ;
      GXv_int12 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZV23DisArtCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas__default(),
         new Object[] {
             new Object[] {
            T01Q12_A368DisFasLin, T01Q12_A3697FasApr, T01Q12_A9841DisFasObs, T01Q12_A5376DisQuiUl, T01Q12_A396EmprCod, T01Q12_A361DisCod, T01Q12_A758ProCod, T01Q12_A457FasCod, T01Q12_A7744FasPreObl, T01Q12_n7744FasPreObl
            }
            , new Object[] {
            T01Q13_A368DisFasLin, T01Q13_A3697FasApr, T01Q13_A9841DisFasObs, T01Q13_A5376DisQuiUl, T01Q13_A396EmprCod, T01Q13_A361DisCod, T01Q13_A758ProCod, T01Q13_A457FasCod, T01Q13_A7744FasPreObl, T01Q13_n7744FasPreObl
            }
            , new Object[] {
            T01Q14_A369DisFec, T01Q14_A392DisUniMed, T01Q14_A335DisArtCod, T01Q14_A337DisArtDsc, T01Q14_A252CliCod
            }
            , new Object[] {
            T01Q15_A759ProDsc
            }
            , new Object[] {
            T01Q16_A846UltFasLin
            }
            , new Object[] {
            T01Q17_A846UltFasLin
            }
            , new Object[] {
            T01Q18_A460FasDsc, T01Q18_A4903FasAcab, T01Q18_n4903FasAcab, T01Q18_A4286FasForMul, T01Q18_n4286FasForMul, T01Q18_A456FasActTin, T01Q18_n456FasActTin, T01Q18_A458FasCon, T01Q18_n458FasCon, T01Q18_A464FasNumPas,
            T01Q18_n464FasNumPas, T01Q18_A472FasVelPro, T01Q18_n472FasVelPro, T01Q18_A468FasPrePie, T01Q18_n468FasPrePie, T01Q18_A469FasPreSal, T01Q18_n469FasPreSal, T01Q18_A459FasDec, T01Q18_n459FasDec, T01Q18_A7744FasPreObl,
            T01Q18_n7744FasPreObl, T01Q18_A602MaqCod, T01Q18_n602MaqCod
            }
            , new Object[] {
            T01Q19_A279CliNom
            }
            , new Object[] {
            T01Q111_A4347DisFasNot, T01Q111_n4347DisFasNot
            }
            , new Object[] {
            T01Q113_A368DisFasLin, T01Q113_A846UltFasLin, T01Q113_A369DisFec, T01Q113_A392DisUniMed, T01Q113_A279CliNom, T01Q113_A335DisArtCod, T01Q113_A337DisArtDsc, T01Q113_A759ProDsc, T01Q113_A460FasDsc, T01Q113_A4903FasAcab,
            T01Q113_n4903FasAcab, T01Q113_A4286FasForMul, T01Q113_n4286FasForMul, T01Q113_A3697FasApr, T01Q113_A456FasActTin, T01Q113_n456FasActTin, T01Q113_A458FasCon, T01Q113_n458FasCon, T01Q113_A464FasNumPas, T01Q113_n464FasNumPas,
            T01Q113_A472FasVelPro, T01Q113_n472FasVelPro, T01Q113_A468FasPrePie, T01Q113_n468FasPrePie, T01Q113_A469FasPreSal, T01Q113_n469FasPreSal, T01Q113_A459FasDec, T01Q113_n459FasDec, T01Q113_A9841DisFasObs, T01Q113_A5376DisQuiUl,
            T01Q113_A7744FasPreObl, T01Q113_n7744FasPreObl, T01Q113_A396EmprCod, T01Q113_A361DisCod, T01Q113_A758ProCod, T01Q113_A457FasCod, T01Q113_A252CliCod, T01Q113_A602MaqCod, T01Q113_n602MaqCod, T01Q113_A4347DisFasNot,
            T01Q113_n4347DisFasNot
            }
            , new Object[] {
            T01Q114_A460FasDsc, T01Q114_A4903FasAcab, T01Q114_n4903FasAcab, T01Q114_A4286FasForMul, T01Q114_n4286FasForMul, T01Q114_A456FasActTin, T01Q114_n456FasActTin, T01Q114_A458FasCon, T01Q114_n458FasCon, T01Q114_A464FasNumPas,
            T01Q114_n464FasNumPas, T01Q114_A472FasVelPro, T01Q114_n472FasVelPro, T01Q114_A468FasPrePie, T01Q114_n468FasPrePie, T01Q114_A469FasPreSal, T01Q114_n469FasPreSal, T01Q114_A459FasDec, T01Q114_n459FasDec, T01Q114_A7744FasPreObl,
            T01Q114_n7744FasPreObl, T01Q114_A602MaqCod, T01Q114_n602MaqCod
            }
            , new Object[] {
            T01Q115_A369DisFec, T01Q115_A392DisUniMed, T01Q115_A335DisArtCod, T01Q115_A337DisArtDsc, T01Q115_A252CliCod
            }
            , new Object[] {
            T01Q116_A279CliNom
            }
            , new Object[] {
            T01Q117_A759ProDsc
            }
            , new Object[] {
            T01Q119_A4347DisFasNot, T01Q119_n4347DisFasNot
            }
            , new Object[] {
            T01Q120_A396EmprCod, T01Q120_A361DisCod, T01Q120_A758ProCod, T01Q120_A368DisFasLin
            }
            , new Object[] {
            T01Q121_A396EmprCod, T01Q121_A361DisCod, T01Q121_A758ProCod, T01Q121_A368DisFasLin
            }
            , new Object[] {
            T01Q122_A396EmprCod, T01Q122_A361DisCod, T01Q122_A758ProCod, T01Q122_A368DisFasLin
            }
            , new Object[] {
            T01Q123_A846UltFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01Q127_A369DisFec, T01Q127_A392DisUniMed, T01Q127_A335DisArtCod, T01Q127_A337DisArtDsc, T01Q127_A252CliCod
            }
            , new Object[] {
            T01Q128_A279CliNom
            }
            , new Object[] {
            T01Q129_A759ProDsc
            }
            , new Object[] {
            T01Q130_A846UltFasLin
            }
            , new Object[] {
            T01Q132_A4347DisFasNot, T01Q132_n4347DisFasNot
            }
            , new Object[] {
            T01Q133_A460FasDsc, T01Q133_A4903FasAcab, T01Q133_n4903FasAcab, T01Q133_A4286FasForMul, T01Q133_n4286FasForMul, T01Q133_A456FasActTin, T01Q133_n456FasActTin, T01Q133_A458FasCon, T01Q133_n458FasCon, T01Q133_A464FasNumPas,
            T01Q133_n464FasNumPas, T01Q133_A472FasVelPro, T01Q133_n472FasVelPro, T01Q133_A468FasPrePie, T01Q133_n468FasPrePie, T01Q133_A469FasPreSal, T01Q133_n469FasPreSal, T01Q133_A459FasDec, T01Q133_n459FasDec, T01Q133_A7744FasPreObl,
            T01Q133_n7744FasPreObl, T01Q133_A602MaqCod, T01Q133_n602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01Q135_A396EmprCod, T01Q135_A361DisCod, T01Q135_A758ProCod, T01Q135_A368DisFasLin
            }
         }
      );
      AV25Pgmname = "Pedidos.DisFas" ;
      Z3697FasApr = httpContext.getMessage( "N", "") ;
      A3697FasApr = httpContext.getMessage( "N", "") ;
      i3697FasApr = httpContext.getMessage( "N", "") ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A7744FasPreObl ;
   private byte A4347DisFasNot ;
   private byte Z7744FasPreObl ;
   private byte Z4347DisFasNot ;
   private byte gxajaxcallmode ;
   private byte edtFasCod_Backstyle ;
   private short wcpOAV10DisFasLin ;
   private short Z368DisFasLin ;
   private short Z5376DisQuiUl ;
   private short Z846UltFasLin ;
   private short AV10DisFasLin ;
   private short A368DisFasLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5376DisQuiUl ;
   private short A846UltFasLin ;
   private short A464FasNumPas ;
   private short A468FasPrePie ;
   private short A469FasPreSal ;
   private short RcdFound39 ;
   private short Z464FasNumPas ;
   private short Z468FasPrePie ;
   private short Z469FasPreSal ;
   private short nIsDirty_39 ;
   private short GXt_int11 ;
   private short GXv_int12[] ;
   private int wcpOAV8DisCod ;
   private int Z361DisCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV8DisCod ;
   private int trnEnded ;
   private int edtDisCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int edtFasCod_Forecolor ;
   private int edtFasCod_Backcolor ;
   private int edtFasCod_Visible ;
   private int edtFasCod_Enabled ;
   private int edtDisFasObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombofascod_Visible ;
   private int edtavCombofascod_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int AV22CliCod ;
   private int Combo_fascod_Datalistupdateminimumcharacters ;
   private int AV29GXV1 ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int idxLst ;
   private int GXv_int10[] ;
   private int ZV22CliCod ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z3697FasApr ;
   private String Z457FasCod ;
   private String N457FasCod ;
   private String Combo_fascod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV9ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisFasLin_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tablepedido_Width ;
   private String Dvpanel_tablepedido_Cls ;
   private String Dvpanel_tablepedido_Title ;
   private String Dvpanel_tablepedido_Iconposition ;
   private String Dvpanel_tablepedido_Internalname ;
   private String divTablepedido_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String lblTbprocod_Internalname ;
   private String lblTbprocod_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtDisFasLin_Jsonclick ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockfascod_Internalname ;
   private String lblTextblockfascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Emptyitemtext ;
   private String Combo_fascod_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtDisFasObs_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV25Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_fascod_Internalname ;
   private String edtavCombofascod_Internalname ;
   private String AV21ComboFasCod ;
   private String edtavCombofascod_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String A3697FasApr ;
   private String AV14Insert_FasCod ;
   private String A335DisArtCod ;
   private String AV23DisArtCod ;
   private String A392DisUniMed ;
   private String A460FasDsc ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A602MaqCod ;
   private String Dvpanel_tablepedido_Objectcall ;
   private String Dvpanel_tablepedido_Class ;
   private String Dvpanel_tablepedido_Height ;
   private String Combo_fascod_Objectcall ;
   private String Combo_fascod_Class ;
   private String Combo_fascod_Icontype ;
   private String Combo_fascod_Icon ;
   private String Combo_fascod_Tooltip ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Selectedtext_set ;
   private String Combo_fascod_Selectedtext_get ;
   private String Combo_fascod_Gamoauthtoken ;
   private String Combo_fascod_Ddointernalname ;
   private String Combo_fascod_Titlecontrolalign ;
   private String Combo_fascod_Dropdownoptionstype ;
   private String Combo_fascod_Titlecontrolidtoreplace ;
   private String Combo_fascod_Datalisttype ;
   private String Combo_fascod_Datalistfixedvalues ;
   private String Combo_fascod_Datalistproc ;
   private String Combo_fascod_Datalistprocparametersprefix ;
   private String Combo_fascod_Remoteservicesparameters ;
   private String Combo_fascod_Htmltemplate ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_fascod_Loadingdata ;
   private String Combo_fascod_Noresultsfound ;
   private String Combo_fascod_Onlyselectedvalues ;
   private String Combo_fascod_Selectalltext ;
   private String Combo_fascod_Multiplevaluesseparator ;
   private String Combo_fascod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode39 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV26Station ;
   private String GXt_char1 ;
   private String AV27Emprnom ;
   private String AV28Usurcod ;
   private String Z392DisUniMed ;
   private String Z335DisArtCod ;
   private String Z337DisArtDsc ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z4903FasAcab ;
   private String Z4286FasForMul ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z602MaqCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i3697FasApr ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV23DisArtCod ;
   private java.util.Date A369DisFec ;
   private java.util.Date Z369DisFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tablepedido_Autowidth ;
   private boolean Dvpanel_tablepedido_Autoheight ;
   private boolean Dvpanel_tablepedido_Collapsible ;
   private boolean Dvpanel_tablepedido_Collapsed ;
   private boolean Dvpanel_tablepedido_Showcollapseicon ;
   private boolean Dvpanel_tablepedido_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n459FasDec ;
   private boolean n7744FasPreObl ;
   private boolean n602MaqCod ;
   private boolean n4347DisFasNot ;
   private boolean Dvpanel_tablepedido_Enabled ;
   private boolean Dvpanel_tablepedido_Showheader ;
   private boolean Dvpanel_tablepedido_Visible ;
   private boolean Combo_fascod_Enabled ;
   private boolean Combo_fascod_Visible ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Isgriditem ;
   private boolean Combo_fascod_Hasdescription ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Includeselectalloption ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean Combo_fascod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private String Z9841DisFasObs ;
   private String A9841DisFasObs ;
   private String AV17ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepedido ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01Q14_A369DisFec ;
   private String[] T01Q14_A392DisUniMed ;
   private String[] T01Q14_A335DisArtCod ;
   private String[] T01Q14_A337DisArtDsc ;
   private int[] T01Q14_A252CliCod ;
   private String[] T01Q19_A279CliNom ;
   private String[] T01Q15_A759ProDsc ;
   private short[] T01Q17_A846UltFasLin ;
   private byte[] T01Q111_A4347DisFasNot ;
   private boolean[] T01Q111_n4347DisFasNot ;
   private String[] T01Q18_A460FasDsc ;
   private String[] T01Q18_A4903FasAcab ;
   private boolean[] T01Q18_n4903FasAcab ;
   private String[] T01Q18_A4286FasForMul ;
   private boolean[] T01Q18_n4286FasForMul ;
   private String[] T01Q18_A456FasActTin ;
   private boolean[] T01Q18_n456FasActTin ;
   private String[] T01Q18_A458FasCon ;
   private boolean[] T01Q18_n458FasCon ;
   private short[] T01Q18_A464FasNumPas ;
   private boolean[] T01Q18_n464FasNumPas ;
   private java.math.BigDecimal[] T01Q18_A472FasVelPro ;
   private boolean[] T01Q18_n472FasVelPro ;
   private short[] T01Q18_A468FasPrePie ;
   private boolean[] T01Q18_n468FasPrePie ;
   private short[] T01Q18_A469FasPreSal ;
   private boolean[] T01Q18_n469FasPreSal ;
   private java.math.BigDecimal[] T01Q18_A459FasDec ;
   private boolean[] T01Q18_n459FasDec ;
   private byte[] T01Q18_A7744FasPreObl ;
   private boolean[] T01Q18_n7744FasPreObl ;
   private String[] T01Q18_A602MaqCod ;
   private boolean[] T01Q18_n602MaqCod ;
   private short[] T01Q113_A368DisFasLin ;
   private short[] T01Q113_A846UltFasLin ;
   private java.util.Date[] T01Q113_A369DisFec ;
   private String[] T01Q113_A392DisUniMed ;
   private String[] T01Q113_A279CliNom ;
   private String[] T01Q113_A335DisArtCod ;
   private String[] T01Q113_A337DisArtDsc ;
   private String[] T01Q113_A759ProDsc ;
   private String[] T01Q113_A460FasDsc ;
   private String[] T01Q113_A4903FasAcab ;
   private boolean[] T01Q113_n4903FasAcab ;
   private String[] T01Q113_A4286FasForMul ;
   private boolean[] T01Q113_n4286FasForMul ;
   private String[] T01Q113_A3697FasApr ;
   private String[] T01Q113_A456FasActTin ;
   private boolean[] T01Q113_n456FasActTin ;
   private String[] T01Q113_A458FasCon ;
   private boolean[] T01Q113_n458FasCon ;
   private short[] T01Q113_A464FasNumPas ;
   private boolean[] T01Q113_n464FasNumPas ;
   private java.math.BigDecimal[] T01Q113_A472FasVelPro ;
   private boolean[] T01Q113_n472FasVelPro ;
   private short[] T01Q113_A468FasPrePie ;
   private boolean[] T01Q113_n468FasPrePie ;
   private short[] T01Q113_A469FasPreSal ;
   private boolean[] T01Q113_n469FasPreSal ;
   private java.math.BigDecimal[] T01Q113_A459FasDec ;
   private boolean[] T01Q113_n459FasDec ;
   private String[] T01Q113_A9841DisFasObs ;
   private short[] T01Q113_A5376DisQuiUl ;
   private byte[] T01Q113_A7744FasPreObl ;
   private boolean[] T01Q113_n7744FasPreObl ;
   private String[] T01Q113_A396EmprCod ;
   private int[] T01Q113_A361DisCod ;
   private String[] T01Q113_A758ProCod ;
   private String[] T01Q113_A457FasCod ;
   private int[] T01Q113_A252CliCod ;
   private String[] T01Q113_A602MaqCod ;
   private boolean[] T01Q113_n602MaqCod ;
   private byte[] T01Q113_A4347DisFasNot ;
   private boolean[] T01Q113_n4347DisFasNot ;
   private String[] T01Q114_A460FasDsc ;
   private String[] T01Q114_A4903FasAcab ;
   private boolean[] T01Q114_n4903FasAcab ;
   private String[] T01Q114_A4286FasForMul ;
   private boolean[] T01Q114_n4286FasForMul ;
   private String[] T01Q114_A456FasActTin ;
   private boolean[] T01Q114_n456FasActTin ;
   private String[] T01Q114_A458FasCon ;
   private boolean[] T01Q114_n458FasCon ;
   private short[] T01Q114_A464FasNumPas ;
   private boolean[] T01Q114_n464FasNumPas ;
   private java.math.BigDecimal[] T01Q114_A472FasVelPro ;
   private boolean[] T01Q114_n472FasVelPro ;
   private short[] T01Q114_A468FasPrePie ;
   private boolean[] T01Q114_n468FasPrePie ;
   private short[] T01Q114_A469FasPreSal ;
   private boolean[] T01Q114_n469FasPreSal ;
   private java.math.BigDecimal[] T01Q114_A459FasDec ;
   private boolean[] T01Q114_n459FasDec ;
   private byte[] T01Q114_A7744FasPreObl ;
   private boolean[] T01Q114_n7744FasPreObl ;
   private String[] T01Q114_A602MaqCod ;
   private boolean[] T01Q114_n602MaqCod ;
   private java.util.Date[] T01Q115_A369DisFec ;
   private String[] T01Q115_A392DisUniMed ;
   private String[] T01Q115_A335DisArtCod ;
   private String[] T01Q115_A337DisArtDsc ;
   private int[] T01Q115_A252CliCod ;
   private String[] T01Q116_A279CliNom ;
   private String[] T01Q117_A759ProDsc ;
   private byte[] T01Q119_A4347DisFasNot ;
   private boolean[] T01Q119_n4347DisFasNot ;
   private String[] T01Q120_A396EmprCod ;
   private int[] T01Q120_A361DisCod ;
   private String[] T01Q120_A758ProCod ;
   private short[] T01Q120_A368DisFasLin ;
   private short[] T01Q13_A368DisFasLin ;
   private String[] T01Q13_A3697FasApr ;
   private String[] T01Q13_A9841DisFasObs ;
   private short[] T01Q13_A5376DisQuiUl ;
   private String[] T01Q13_A396EmprCod ;
   private int[] T01Q13_A361DisCod ;
   private String[] T01Q13_A758ProCod ;
   private String[] T01Q13_A457FasCod ;
   private byte[] T01Q13_A7744FasPreObl ;
   private boolean[] T01Q13_n7744FasPreObl ;
   private String[] T01Q121_A396EmprCod ;
   private int[] T01Q121_A361DisCod ;
   private String[] T01Q121_A758ProCod ;
   private short[] T01Q121_A368DisFasLin ;
   private String[] T01Q122_A396EmprCod ;
   private int[] T01Q122_A361DisCod ;
   private String[] T01Q122_A758ProCod ;
   private short[] T01Q122_A368DisFasLin ;
   private short[] T01Q12_A368DisFasLin ;
   private String[] T01Q12_A3697FasApr ;
   private String[] T01Q12_A9841DisFasObs ;
   private short[] T01Q12_A5376DisQuiUl ;
   private String[] T01Q12_A396EmprCod ;
   private int[] T01Q12_A361DisCod ;
   private String[] T01Q12_A758ProCod ;
   private String[] T01Q12_A457FasCod ;
   private byte[] T01Q12_A7744FasPreObl ;
   private boolean[] T01Q12_n7744FasPreObl ;
   private short[] T01Q123_A846UltFasLin ;
   private java.util.Date[] T01Q127_A369DisFec ;
   private String[] T01Q127_A392DisUniMed ;
   private String[] T01Q127_A335DisArtCod ;
   private String[] T01Q127_A337DisArtDsc ;
   private int[] T01Q127_A252CliCod ;
   private String[] T01Q128_A279CliNom ;
   private String[] T01Q129_A759ProDsc ;
   private short[] T01Q130_A846UltFasLin ;
   private byte[] T01Q132_A4347DisFasNot ;
   private boolean[] T01Q132_n4347DisFasNot ;
   private String[] T01Q133_A460FasDsc ;
   private String[] T01Q133_A4903FasAcab ;
   private boolean[] T01Q133_n4903FasAcab ;
   private String[] T01Q133_A4286FasForMul ;
   private boolean[] T01Q133_n4286FasForMul ;
   private String[] T01Q133_A456FasActTin ;
   private boolean[] T01Q133_n456FasActTin ;
   private String[] T01Q133_A458FasCon ;
   private boolean[] T01Q133_n458FasCon ;
   private short[] T01Q133_A464FasNumPas ;
   private boolean[] T01Q133_n464FasNumPas ;
   private java.math.BigDecimal[] T01Q133_A472FasVelPro ;
   private boolean[] T01Q133_n472FasVelPro ;
   private short[] T01Q133_A468FasPrePie ;
   private boolean[] T01Q133_n468FasPrePie ;
   private short[] T01Q133_A469FasPreSal ;
   private boolean[] T01Q133_n469FasPreSal ;
   private java.math.BigDecimal[] T01Q133_A459FasDec ;
   private boolean[] T01Q133_n459FasDec ;
   private byte[] T01Q133_A7744FasPreObl ;
   private boolean[] T01Q133_n7744FasPreObl ;
   private String[] T01Q133_A602MaqCod ;
   private boolean[] T01Q133_n602MaqCod ;
   private String[] T01Q135_A396EmprCod ;
   private int[] T01Q135_A361DisCod ;
   private String[] T01Q135_A758ProCod ;
   private short[] T01Q135_A368DisFasLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T01Q16_A846UltFasLin ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV15TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV19DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class disfas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01Q12", "SELECT DisFasLin, FasApr, DisFasObs, DisQuiUl, EmprCod, DisCod, ProCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF FasApr, DisFasObs, DisQuiUl, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q13", "SELECT DisFasLin, FasApr, DisFasObs, DisQuiUl, EmprCod, DisCod, ProCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q14", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q15", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q16", "SELECT UltFasLin FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF UltFasLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q17", "SELECT UltFasLin FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q18", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q19", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q111", "SELECT COALESCE( T1.DisFasNot, 0) AS DisFasNot FROM (SELECT COUNT(*) AS DisFasNot, EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISPAR GROUP BY EmprCod, DisCod, ProCod, DisFasLin ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? AND T1.ProCod = ? AND T1.DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q113", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisFasLin, T5.UltFasLin, T2.DisFec, T2.DisUniMed, T3.CliNom, T2.DisArtCod, T2.DisArtDsc, T4.ProDsc, T7.FasDsc, T7.FasAcab, T7.FasForMul, TM1.FasApr, T7.FasActTin, T7.FasCon, T7.FasNumPas, T7.FasVelPro, T7.FasPrePie, T7.FasPreSal, T7.FasDec, TM1.DisFasObs, TM1.DisQuiUl, TM1.FasPreObl, TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.FasCod, T2.CliCod, T7.MaqCod, COALESCE( T6.DisFasNot, 0) AS DisFasNot FROM ((((((TXPDISFAS TM1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = TM1.EmprCod AND T2.DisCod = TM1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProCod = TM1.ProCod) INNER JOIN TXPDISLIN T5 ON T5.EmprCod = TM1.EmprCod AND T5.DisCod = TM1.DisCod AND T5.ProCod = TM1.ProCod) LEFT JOIN (SELECT COUNT(*) AS DisFasNot, EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISPAR GROUP BY EmprCod, DisCod, ProCod, DisFasLin ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.DisCod = TM1.DisCod AND T6.ProCod = TM1.ProCod AND T6.DisFasLin = TM1.DisFasLin) INNER JOIN TXPFASPRO T7 ON T7.EmprCod = TM1.EmprCod AND T7.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? and TM1.DisFasLin = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.DisFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q114", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q115", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q116", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q117", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q119", "SELECT COALESCE( T1.DisFasNot, 0) AS DisFasNot FROM (SELECT COUNT(*) AS DisFasNot, EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISPAR GROUP BY EmprCod, DisCod, ProCod, DisFasLin ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? AND T1.ProCod = ? AND T1.DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q120", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q121", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ? or DisCod = ? and EmprCod = ? and ProCod > ? or ProCod = ? and DisCod = ? and EmprCod = ? and DisFasLin > ?) ORDER BY EmprCod, DisCod, ProCod, DisFasLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q122", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ? or DisCod = ? and EmprCod = ? and ProCod < ? or ProCod = ? and DisCod = ? and EmprCod = ? and DisFasLin < ?) ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC, DisFasLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q123", "SELECT UltFasLin FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF UltFasLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01Q124", "INSERT INTO TXPDISFAS(FasPreObl, DisFasLin, FasApr, DisFasObs, DisQuiUl, EmprCod, DisCod, ProCod, FasCod, DisMaqPru, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01Q125", "UPDATE TXPDISFAS SET FasPreObl=?, FasApr=?, DisFasObs=?, DisQuiUl=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01Q126", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T01Q127", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q128", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q129", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q130", "SELECT UltFasLin FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q132", "SELECT COALESCE( T1.DisFasNot, 0) AS DisFasNot FROM (SELECT COUNT(*) AS DisFasNot, EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISPAR GROUP BY EmprCod, DisCod, ProCod, DisFasLin ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? AND T1.ProCod = ? AND T1.DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q133", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01Q134", "UPDATE TXPDISLIN SET UltFasLin=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("T01Q135", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(17);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(20);
               ((short[]) buf[29])[0] = rslt.getShort(21);
               ((byte[]) buf[30])[0] = rslt.getByte(22);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(23, 3);
               ((int[]) buf[33])[0] = rslt.getInt(24);
               ((String[]) buf[34])[0] = rslt.getString(25, 8);
               ((String[]) buf[35])[0] = rslt.getString(26, 8);
               ((int[]) buf[36])[0] = rslt.getInt(27);
               ((String[]) buf[37])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(29);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 14 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 22 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 25 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 26 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 1);
               stmt.setVarchar(4, (String)parms[4], 3000, false);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 8);
               stmt.setString(9, (String)parms[9], 8);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setVarchar(3, (String)parms[3], 3000, false);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 8);
               stmt.setString(6, (String)parms[6], 3);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 8);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 28 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

