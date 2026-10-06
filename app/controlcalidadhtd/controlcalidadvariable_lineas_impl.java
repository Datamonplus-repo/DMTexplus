package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidadvariable_lineas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"vMASK") == 0 )
      {
         A4046CCTLinPict = httpContext.GetPar( "CCTLinPict") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4045CCTLinLgoD = (short)(GXutil.lval( httpContext.GetPar( "CCTLinLgoD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx14asamask1UP623( A4046CCTLinPict, A4045CCTLinLgoD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV7CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCTCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCTCod), "ZZZZZ9")));
            AV8CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CCTLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CCTLin), "ZZZ9")));
            AV9CCTValLin = (byte)(GXutil.lval( httpContext.GetPar( "CCTValLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTValLin), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTVALLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CCTValLin), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control Calidad Variable (lineas)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCTValLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public controlcalidadvariable_lineas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidadvariable_lineas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadvariable_lineas_impl.class ));
   }

   public controlcalidadvariable_lineas_impl( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTTpoCtr = new HTMLChoice();
      cmbCCTLinTpoI = new HTMLChoice();
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
      if ( cmbCCTTpoCtr.getItemCount() > 0 )
      {
         A4037CCTTpoCtr = cmbCCTTpoCtr.getValidValue(A4037CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      }
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTCod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTTpoCtr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTTpoCtr.getInternalname(), httpContext.getMessage( "Tipo de Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTTpoCtr, cmbCCTTpoCtr.getInternalname(), GXutil.rtrim( A4037CCTTpoCtr), 1, cmbCCTTpoCtr.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTTpoCtr.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTLinTpoI.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTLinTpoI.getInternalname(), httpContext.getMessage( "Tipo de Ingreso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTLinTpoI, cmbCCTLinTpoI.getInternalname(), GXutil.rtrim( A4048CCTLinTpoI), 1, cmbCCTLinTpoI.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTLinTpoI.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLin_Internalname, httpContext.getMessage( "# Lín", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTValLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTValLin_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTValLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTValLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTValLin_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTValDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTValDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTValDsc_Internalname, GXutil.rtrim( A4050CCTValDsc), GXutil.rtrim( localUtil.format( A4050CCTValDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTValDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTValDsc_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTVal_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTVal_Internalname, GXutil.rtrim( A4051CCTVal), GXutil.rtrim( localUtil.format( A4051CCTVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTVal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTVal_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV28Pgmname), GXutil.rtrim( localUtil.format( AV28Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_lineas.htm");
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
      e111UP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4034CCTLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4049CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4049CCTValLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4050CCTValDsc = httpContext.cgiGet( "Z4050CCTValDsc") ;
            Z4051CCTVal = httpContext.cgiGet( "Z4051CCTVal") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N4050CCTValDsc = httpContext.cgiGet( "N4050CCTValDsc") ;
            N4051CCTVal = httpContext.cgiGet( "N4051CCTVal") ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV7CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( "vCCTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( "vCCTVALLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22CCTMsgMin = httpContext.cgiGet( "vCCTMSGMIN") ;
            AV21CCTMsgMax = httpContext.cgiGet( "vCCTMSGMAX") ;
            A4046CCTLinPict = httpContext.cgiGet( "CCTLINPICT") ;
            A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( "CCTLINLGOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Mask = httpContext.cgiGet( "vMASK") ;
            AV19CCTMsgDsc = httpContext.cgiGet( "vCCTMSGDSC") ;
            AV23CCTMsgVal = httpContext.cgiGet( "vCCTMSGVAL") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
            cmbCCTTpoCtr.setValue( httpContext.cgiGet( cmbCCTTpoCtr.getInternalname()) );
            A4037CCTTpoCtr = httpContext.cgiGet( cmbCCTTpoCtr.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
            cmbCCTLinTpoI.setValue( httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) );
            A4048CCTLinTpoI = httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
            A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTVALLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTValLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4049CCTValLin = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
            }
            else
            {
               A4049CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
            }
            A4050CCTValDsc = httpContext.cgiGet( edtCCTValDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
            A4051CCTVal = httpContext.cgiGet( edtCCTVal_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4051CCTVal", A4051CCTVal);
            AV28Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadVariable_lineas");
            A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            forbiddenHiddens.add("CCTCod", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) || ( A4049CCTValLin != Z4049CCTValLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\controlcalidadvariable_lineas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
               A4049CCTValLin = (byte)(GXutil.lval( httpContext.GetPar( "CCTValLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
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
                  sMode623 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode623 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound623 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UP0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CCTCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTCod_Internalname ;
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
                        e111UP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UP2 ();
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
         e121UP2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UP623( ) ;
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
         disableAttributes1UP623( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_1UP0( )
   {
      beforeValidate1UP623( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UP623( ) ;
         }
         else
         {
            checkExtendedTable1UP623( ) ;
            closeExtendedTableCursors1UP623( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UP0( )
   {
   }

   public void e111UP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.AV10EmprCod = GXv_char2[0] ;
      controlcalidadvariable_lineas_impl.this.AV25EmprNom = GXv_char3[0] ;
      controlcalidadvariable_lineas_impl.this.AV26UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXv_SdtWWPContext5[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV13WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      GXt_char1 = AV16CCLPicInf ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICINF", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16CCLPicInf = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CCLPicInf", AV16CCLPicInf);
      GXt_char1 = AV17CCLPicSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17CCLPicSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCLPicSup", AV17CCLPicSup);
      GXt_char1 = AV14CCLArrInf ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICINF", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14CCLArrInf = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCLArrInf", AV14CCLArrInf);
      GXt_char1 = AV15CCLArrSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV15CCLArrSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CCLArrSup", AV15CCLArrSup);
      GXt_char1 = AV20CCTMsgLin ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGLIN", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20CCTMsgLin = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20CCTMsgLin", AV20CCTMsgLin);
      GXt_char1 = AV23CCTMsgVal ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGVAL", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23CCTMsgVal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23CCTMsgVal", AV23CCTMsgVal);
      GXt_char1 = AV22CCTMsgMin ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22CCTMsgMin = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CCTMsgMin", AV22CCTMsgMin);
      GXt_char1 = AV21CCTMsgMax ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT397_", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21CCTMsgMax = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21CCTMsgMax", AV21CCTMsgMax);
      GXt_char1 = AV18CCTMsgCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGCOD", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18CCTMsgCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CCTMsgCod", AV18CCTMsgCod);
      GXt_char1 = AV19CCTMsgDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGDSC", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19CCTMsgDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CCTMsgDsc", AV19CCTMsgDsc);
   }

   public void e121UP2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV11TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.controlcalidadhtd.controlcalidadvariable_lineasww", new String[] {}, new String[] {}) );
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

   public void zm1UP623( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4050CCTValDsc = T01UP3_A4050CCTValDsc[0] ;
            Z4051CCTVal = T01UP3_A4051CCTVal[0] ;
         }
         else
         {
            Z4050CCTValDsc = A4050CCTValDsc ;
            Z4051CCTVal = A4051CCTVal ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z4049CCTValLin = A4049CCTValLin ;
         Z4050CCTValDsc = A4050CCTValDsc ;
         Z4051CCTVal = A4051CCTVal ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z407EmprNom = A407EmprNom ;
         Z4036CCTDsc = A4036CCTDsc ;
         Z4037CCTTpoCtr = A4037CCTTpoCtr ;
         Z4048CCTLinTpoI = A4048CCTLinTpoI ;
         Z4045CCTLinLgoD = A4045CCTLinLgoD ;
         Z4046CCTLinPict = A4046CCTLinPict ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      cmbCCTTpoCtr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      cmbCCTLinTpoI.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoI.getEnabled(), 5, 0), true);
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      AV28Pgmname = "ControlCalidadHTD.ControlCalidadVariable_lineas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      cmbCCTTpoCtr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      cmbCCTLinTpoI.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoI.getEnabled(), 5, 0), true);
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UP4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UP4_A407EmprNom[0] ;
      n407EmprNom = T01UP4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV7CCTCod) )
      {
         A4031CCTCod = AV7CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      if ( ! (0==AV8CCTLin) )
      {
         A4034CCTLin = AV8CCTLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
      if ( ! (0==AV9CCTValLin) )
      {
         A4049CCTValLin = AV9CCTValLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
      }
      if ( ! (0==AV9CCTValLin) )
      {
         edtCCTValLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTValLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9CCTValLin) )
      {
         edtCCTValLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), true);
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
         /* Using cursor T01UP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01UP5_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01UP5_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         pr_default.close(3);
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTVal_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTVal_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
         }
         /* Using cursor T01UP6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         A4048CCTLinTpoI = T01UP6_A4048CCTLinTpoI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4045CCTLinLgoD = T01UP6_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = T01UP6_A4046CCTLinPict[0] ;
         pr_default.close(4);
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTValDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTValDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
         }
         GXt_char1 = AV27Mask ;
         GXv_char4[0] = A4046CCTLinPict ;
         GXv_int6[0] = A4045CCTLinLgoD ;
         GXv_char3[0] = GXt_char1 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         controlcalidadvariable_lineas_impl.this.A4046CCTLinPict = GXv_char4[0] ;
         controlcalidadvariable_lineas_impl.this.A4045CCTLinLgoD = (short)((short)(GXv_int6[0])) ;
         controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         AV27Mask = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Mask", AV27Mask);
         edtCCTVal_Inputmask = AV27Mask ;
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( A4049CCTValLin == 1 ) )
         {
            A4050CCTValDsc = AV22CCTMsgMin ;
            httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( A4049CCTValLin == 2 ) )
            {
               A4050CCTValDsc = AV21CCTMsgMax ;
               httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
            }
         }
      }
   }

   public void load1UP623( )
   {
      /* Using cursor T01UP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A4050CCTValDsc = T01UP7_A4050CCTValDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
         A407EmprNom = T01UP7_A407EmprNom[0] ;
         n407EmprNom = T01UP7_n407EmprNom[0] ;
         A4036CCTDsc = T01UP7_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01UP7_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4048CCTLinTpoI = T01UP7_A4048CCTLinTpoI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4045CCTLinLgoD = T01UP7_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = T01UP7_A4046CCTLinPict[0] ;
         A4051CCTVal = T01UP7_A4051CCTVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4051CCTVal", A4051CCTVal);
         zm1UP623( -23) ;
      }
      pr_default.close(5);
      onLoadActions1UP623( ) ;
   }

   public void onLoadActions1UP623( )
   {
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( A4049CCTValLin == 1 ) )
      {
         A4050CCTValDsc = AV22CCTMsgMin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( A4049CCTValLin == 2 ) )
         {
            A4050CCTValDsc = AV21CCTMsgMax ;
            httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTValDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTValDsc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
      }
      GXt_char1 = AV27Mask ;
      GXv_char4[0] = A4046CCTLinPict ;
      GXv_int6[0] = A4045CCTLinLgoD ;
      GXv_char3[0] = GXt_char1 ;
      new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      controlcalidadvariable_lineas_impl.this.A4046CCTLinPict = GXv_char4[0] ;
      controlcalidadvariable_lineas_impl.this.A4045CCTLinLgoD = (short)((short)(GXv_int6[0])) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      AV27Mask = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mask", AV27Mask);
      edtCCTVal_Inputmask = AV27Mask ;
   }

   public void checkExtendedTable1UP623( )
   {
      nIsDirty_623 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A4050CCTValDsc)==0) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) && ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV19CCTMsgDsc, 1, "CCTVALLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTValLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01UP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01UP5_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = T01UP5_A4037CCTTpoCtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      pr_default.close(3);
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
      }
      /* Using cursor T01UP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4048CCTLinTpoI = T01UP6_A4048CCTLinTpoI[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      A4045CCTLinLgoD = T01UP6_A4045CCTLinLgoD[0] ;
      A4046CCTLinPict = T01UP6_A4046CCTLinPict[0] ;
      pr_default.close(4);
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( A4049CCTValLin == 1 ) )
      {
         nIsDirty_623 = (short)(1) ;
         A4050CCTValDsc = AV22CCTMsgMin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) && ( A4049CCTValLin == 2 ) )
         {
            nIsDirty_623 = (short)(1) ;
            A4050CCTValDsc = AV21CCTMsgMax ;
            httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTValDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTValDsc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
      }
      if ( (GXutil.strcmp("", A4050CCTValDsc)==0) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) && ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "L", "")) == 0 ) && ( A4049CCTValLin > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV19CCTMsgDsc, 1, "CCTVALLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTValLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( ( A4049CCTValLin < 1 ) || ( A4049CCTValLin > 2 ) ) )
      {
         httpContext.GX_msglist.addItem(AV23CCTMsgVal, 1, "CCTVALLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTValLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GXt_char1 = AV27Mask ;
      GXv_char4[0] = A4046CCTLinPict ;
      GXv_int6[0] = A4045CCTLinLgoD ;
      GXv_char3[0] = GXt_char1 ;
      new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      controlcalidadvariable_lineas_impl.this.A4046CCTLinPict = GXv_char4[0] ;
      controlcalidadvariable_lineas_impl.this.A4045CCTLinLgoD = (short)((short)(GXv_int6[0])) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      AV27Mask = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mask", AV27Mask);
      edtCCTVal_Inputmask = AV27Mask ;
   }

   public void closeExtendedTableCursors1UP623( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_25( String A396EmprCod ,
                          int A4031CCTCod )
   {
      /* Using cursor T01UP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01UP8_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = T01UP8_A4037CCTTpoCtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4037CCTTpoCtr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_26( String A396EmprCod ,
                          int A4031CCTCod ,
                          short A4034CCTLin )
   {
      /* Using cursor T01UP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4048CCTLinTpoI = T01UP9_A4048CCTLinTpoI[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      A4045CCTLinLgoD = T01UP9_A4045CCTLinLgoD[0] ;
      A4046CCTLinPict = T01UP9_A4046CCTLinPict[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4048CCTLinTpoI))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4046CCTLinPict))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1UP623( )
   {
      /* Using cursor T01UP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound623 = (short)(1) ;
      }
      else
      {
         RcdFound623 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UP623( 23) ;
         RcdFound623 = (short)(1) ;
         A4049CCTValLin = T01UP3_A4049CCTValLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
         A4050CCTValDsc = T01UP3_A4050CCTValDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
         A4051CCTVal = T01UP3_A4051CCTVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4051CCTVal", A4051CCTVal);
         A396EmprCod = T01UP3_A396EmprCod[0] ;
         A4031CCTCod = T01UP3_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01UP3_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4049CCTValLin = A4049CCTValLin ;
         sMode623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UP623( ) ;
         if ( AnyError == 1 )
         {
            RcdFound623 = (short)(0) ;
            initializeNonKey1UP623( ) ;
         }
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound623 = (short)(0) ;
         initializeNonKey1UP623( ) ;
         sMode623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UP623( ) ;
      if ( RcdFound623 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound623 = (short)(0) ;
      /* Using cursor T01UP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A4034CCTLin), Short.valueOf(A4034CCTLin), Integer.valueOf(A4031CCTCod), A396EmprCod, Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP11_A4031CCTCod[0] < A4031CCTCod ) || ( T01UP11_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP11_A4034CCTLin[0] < A4034CCTLin ) || ( T01UP11_A4034CCTLin[0] == A4034CCTLin ) && ( T01UP11_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP11_A4049CCTValLin[0] < A4049CCTValLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP11_A4031CCTCod[0] > A4031CCTCod ) || ( T01UP11_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP11_A4034CCTLin[0] > A4034CCTLin ) || ( T01UP11_A4034CCTLin[0] == A4034CCTLin ) && ( T01UP11_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP11_A4049CCTValLin[0] > A4049CCTValLin ) ) )
         {
            A396EmprCod = T01UP11_A396EmprCod[0] ;
            A4031CCTCod = T01UP11_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01UP11_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            A4049CCTValLin = T01UP11_A4049CCTValLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
            RcdFound623 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound623 = (short)(0) ;
      /* Using cursor T01UP12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A4034CCTLin), Short.valueOf(A4034CCTLin), Integer.valueOf(A4031CCTCod), A396EmprCod, Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP12_A4031CCTCod[0] > A4031CCTCod ) || ( T01UP12_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP12_A4034CCTLin[0] > A4034CCTLin ) || ( T01UP12_A4034CCTLin[0] == A4034CCTLin ) && ( T01UP12_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP12_A4049CCTValLin[0] > A4049CCTValLin ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP12_A4031CCTCod[0] < A4031CCTCod ) || ( T01UP12_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP12_A4034CCTLin[0] < A4034CCTLin ) || ( T01UP12_A4034CCTLin[0] == A4034CCTLin ) && ( T01UP12_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01UP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UP12_A4049CCTValLin[0] < A4049CCTValLin ) ) )
         {
            A396EmprCod = T01UP12_A396EmprCod[0] ;
            A4031CCTCod = T01UP12_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01UP12_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            A4049CCTValLin = T01UP12_A4049CCTValLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
            RcdFound623 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UP623( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCTValLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UP623( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound623 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) || ( A4049CCTValLin != Z4049CCTValLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               A4034CCTLin = Z4034CCTLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
               A4049CCTValLin = Z4049CCTValLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CCTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCCTValLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UP623( ) ;
               GX_FocusControl = edtCCTValLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) || ( A4049CCTValLin != Z4049CCTValLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtCCTValLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UP623( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CCTCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCCTValLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UP623( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) || ( A4049CCTValLin != Z4049CCTValLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = Z4034CCTLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         A4049CCTValLin = Z4049CCTValLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCCTValLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UP623( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4050CCTValDsc, T01UP2_A4050CCTValDsc[0]) != 0 ) || ( GXutil.strcmp(Z4051CCTVal, T01UP2_A4051CCTVal[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4050CCTValDsc, T01UP2_A4050CCTValDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable_lineas:[seudo value changed for attri]"+"CCTValDsc");
               GXutil.writeLogRaw("Old: ",Z4050CCTValDsc);
               GXutil.writeLogRaw("Current: ",T01UP2_A4050CCTValDsc[0]);
            }
            if ( GXutil.strcmp(Z4051CCTVal, T01UP2_A4051CCTVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable_lineas:[seudo value changed for attri]"+"CCTVal");
               GXutil.writeLogRaw("Old: ",Z4051CCTVal);
               GXutil.writeLogRaw("Current: ",T01UP2_A4051CCTVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UP623( )
   {
      beforeValidate1UP623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UP623( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UP623( 0) ;
         checkOptimisticConcurrency1UP623( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UP623( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UP623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UP13 */
                  pr_default.execute(11, new Object[] {Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
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
                        resetCaption1UP0( ) ;
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
            load1UP623( ) ;
         }
         endLevel1UP623( ) ;
      }
      closeExtendedTableCursors1UP623( ) ;
   }

   public void update1UP623( )
   {
      beforeValidate1UP623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UP623( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UP623( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UP623( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UP623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UP14 */
                  pr_default.execute(12, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef2"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UP623( ) ;
                  if ( AnyError == 0 )
                  {
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
         endLevel1UP623( ) ;
      }
      closeExtendedTableCursors1UP623( ) ;
   }

   public void deferredUpdate1UP623( )
   {
   }

   public void delete( )
   {
      beforeValidate1UP623( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UP623( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UP623( ) ;
         afterConfirm1UP623( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UP623( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UP15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
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
      sMode623 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UP623( ) ;
      Gx_mode = sMode623 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UP623( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UP16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01UP16_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01UP16_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         pr_default.close(14);
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTVal_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTVal_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
         }
         /* Using cursor T01UP17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         A4048CCTLinTpoI = T01UP17_A4048CCTLinTpoI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4045CCTLinLgoD = T01UP17_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = T01UP17_A4046CCTLinPict[0] ;
         pr_default.close(15);
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTValDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTValDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
         }
         GXt_char1 = AV27Mask ;
         GXv_char4[0] = A4046CCTLinPict ;
         GXv_int6[0] = A4045CCTLinLgoD ;
         GXv_char3[0] = GXt_char1 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         controlcalidadvariable_lineas_impl.this.A4046CCTLinPict = GXv_char4[0] ;
         controlcalidadvariable_lineas_impl.this.A4045CCTLinLgoD = (short)((short)(GXv_int6[0])) ;
         controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         AV27Mask = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Mask", AV27Mask);
         edtCCTVal_Inputmask = AV27Mask ;
      }
   }

   public void endLevel1UP623( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UP623( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidadvariable_lineas");
         if ( AnyError == 0 )
         {
            confirmValues1UP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidadvariable_lineas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UP623( )
   {
      /* Scan By routine */
      /* Using cursor T01UP18 */
      pr_default.execute(16);
      RcdFound623 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A396EmprCod = T01UP18_A396EmprCod[0] ;
         A4031CCTCod = T01UP18_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01UP18_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         A4049CCTValLin = T01UP18_A4049CCTValLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UP623( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound623 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A396EmprCod = T01UP18_A396EmprCod[0] ;
         A4031CCTCod = T01UP18_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01UP18_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         A4049CCTValLin = T01UP18_A4049CCTValLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
      }
   }

   public void scanEnd1UP623( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1UP623( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UP623( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UP623( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UP623( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UP623( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UP623( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UP623( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      cmbCCTTpoCtr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      cmbCCTLinTpoI.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoI.getEnabled(), 5, 0), true);
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      edtCCTValLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), true);
      edtCCTValDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
      edtCCTVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UP623( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UP0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidadvariable_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8CCTLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTValLin,2,0))}, new String[] {"Gx_mode","EmprCod","CCTCod","CCTLin","CCTValLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadVariable_lineas");
      forbiddenHiddens.add("CCTCod", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidadvariable_lineas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4034CCTLin", GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4049CCTValLin", GXutil.ltrim( localUtil.ntoc( Z4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4050CCTValDsc", GXutil.rtrim( Z4050CCTValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4051CCTVal", GXutil.rtrim( Z4051CCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N4050CCTValDsc", GXutil.rtrim( A4050CCTValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "N4051CCTVal", GXutil.rtrim( A4051CCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV11TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV11TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV7CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTLIN", GXutil.ltrim( localUtil.ntoc( AV8CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTVALLIN", GXutil.ltrim( localUtil.ntoc( AV9CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTVALLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CCTValLin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGMIN", AV22CCTMsgMin);
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGMAX", AV21CCTMsgMax);
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINPICT", GXutil.rtrim( A4046CCTLinPict));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINLGOD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMASK", GXutil.rtrim( AV27Mask));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGDSC", AV19CCTMsgDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGVAL", AV23CCTMsgVal);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      return formatLink("app.controlcalidadhtd.controlcalidadvariable_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8CCTLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTValLin,2,0))}, new String[] {"Gx_mode","EmprCod","CCTCod","CCTLin","CCTValLin"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidadVariable_lineas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control Calidad Variable (lineas)", "") ;
   }

   public void initializeNonKey1UP623( )
   {
      A4050CCTValDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4050CCTValDsc", A4050CCTValDsc);
      AV27Mask = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mask", AV27Mask);
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      A4048CCTLinTpoI = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      A4045CCTLinLgoD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      A4046CCTLinPict = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      A4051CCTVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4051CCTVal", A4051CCTVal);
      Z4050CCTValDsc = "" ;
      Z4051CCTVal = "" ;
   }

   public void initAll1UP623( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A4034CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      A4049CCTValLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4049CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4049CCTValLin), 2, 0));
      initializeNonKey1UP623( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116103470", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidadvariable_lineas.js", "?202682116103470", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      cmbCCTTpoCtr.setInternalname( "CCTTPOCTR" );
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI" );
      edtCCTLin_Internalname = "CCTLIN" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtCCTValLin_Internalname = "CCTVALLIN" ;
      edtCCTValDsc_Internalname = "CCTVALDSC" ;
      edtCCTVal_Internalname = "CCTVAL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "Control Calidad Variable (lineas)", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCCTVal_Jsonclick = "" ;
      edtCCTVal_Enabled = 1 ;
      edtCCTValDsc_Jsonclick = "" ;
      edtCCTValDsc_Enabled = 1 ;
      edtCCTValLin_Jsonclick = "" ;
      edtCCTValLin_Enabled = 1 ;
      edtCCTLin_Jsonclick = "" ;
      edtCCTLin_Enabled = 0 ;
      cmbCCTLinTpoI.setJsonclick( "" );
      cmbCCTLinTpoI.setEnabled( 0 );
      cmbCCTTpoCtr.setJsonclick( "" );
      cmbCCTTpoCtr.setEnabled( 0 );
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Enabled = 0 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Enabled = 0 ;
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

   public void gx14asamask1UP623( String A4046CCTLinPict ,
                                  short A4045CCTLinLgoD )
   {
      GXt_char1 = AV27Mask ;
      GXv_char4[0] = A4046CCTLinPict ;
      GXv_int6[0] = A4045CCTLinLgoD ;
      GXv_char3[0] = GXt_char1 ;
      new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      controlcalidadvariable_lineas_impl.this.A4046CCTLinPict = GXv_char4[0] ;
      controlcalidadvariable_lineas_impl.this.A4045CCTLinLgoD = (short)((short)(GXv_int6[0])) ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      AV27Mask = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mask", AV27Mask);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV27Mask))+"\"") ;
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
      cmbCCTTpoCtr.setName( "CCTTPOCTR" );
      cmbCCTTpoCtr.setWebtags( "" );
      cmbCCTTpoCtr.addItem("E", httpContext.getMessage( "ISO (Externo)", ""), (short)(0));
      cmbCCTTpoCtr.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbCCTTpoCtr.addItem("D", httpContext.getMessage( "Defectos", ""), (short)(0));
      if ( cmbCCTTpoCtr.getItemCount() > 0 )
      {
         A4037CCTTpoCtr = cmbCCTTpoCtr.getValidValue(A4037CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      }
      cmbCCTLinTpoI.setName( "CCTLINTPOI" );
      cmbCCTLinTpoI.setWebtags( "" );
      cmbCCTLinTpoI.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
      cmbCCTLinTpoI.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
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

   public void valid_Cctcod( )
   {
      A4037CCTTpoCtr = cmbCCTTpoCtr.getValue() ;
      cmbCCTTpoCtr.setValue( A4037CCTTpoCtr );
      /* Using cursor T01UP16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
      }
      A4036CCTDsc = T01UP16_A4036CCTDsc[0] ;
      A4037CCTTpoCtr = T01UP16_A4037CCTTpoCtr[0] ;
      cmbCCTTpoCtr.setValue( A4037CCTTpoCtr );
      pr_default.close(14);
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTVal_Enabled = 0 ;
      }
      else
      {
         edtCCTVal_Enabled = 1 ;
      }
      dynload_actions( ) ;
      if ( cmbCCTTpoCtr.getItemCount() > 0 )
      {
         A4037CCTTpoCtr = cmbCCTTpoCtr.getValidValue(A4037CCTTpoCtr) ;
         cmbCCTTpoCtr.setValue( A4037CCTTpoCtr );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", GXutil.rtrim( A4037CCTTpoCtr));
      cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), true);
   }

   public void valid_Cctlin( )
   {
      A4037CCTTpoCtr = cmbCCTTpoCtr.getValue() ;
      A4048CCTLinTpoI = cmbCCTLinTpoI.getValue() ;
      cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
      /* Using cursor T01UP17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
      }
      A4048CCTLinTpoI = T01UP17_A4048CCTLinTpoI[0] ;
      cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
      A4045CCTLinLgoD = T01UP17_A4045CCTLinLgoD[0] ;
      A4046CCTLinPict = T01UP17_A4046CCTLinPict[0] ;
      pr_default.close(15);
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTValDsc_Enabled = 0 ;
      }
      else
      {
         edtCCTValDsc_Enabled = 1 ;
      }
      GXt_char1 = AV27Mask ;
      GXv_char4[0] = A4046CCTLinPict ;
      GXv_int6[0] = A4045CCTLinLgoD ;
      GXv_char3[0] = GXt_char1 ;
      new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      controlcalidadvariable_lineas_impl.this.A4046CCTLinPict = GXv_char4[0] ;
      A4046CCTLinPict = this.A4046CCTLinPict ;
      controlcalidadvariable_lineas_impl.this.A4045CCTLinLgoD = (short)((short)(GXv_int6[0])) ;
      A4045CCTLinLgoD = this.A4045CCTLinLgoD ;
      controlcalidadvariable_lineas_impl.this.GXt_char1 = GXv_char3[0] ;
      AV27Mask = GXt_char1 ;
      edtCCTVal_Inputmask = AV27Mask ;
      dynload_actions( ) ;
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
         cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", GXutil.rtrim( A4048CCTLinTpoI));
      cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", GXutil.rtrim( A4046CCTLinPict));
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mask", GXutil.rtrim( AV27Mask));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV8CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV9CCTValLin',fld:'vCCTVALLIN',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV8CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV9CCTValLin',fld:'vCCTVALLIN',pic:'Z9',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UP2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'edtCCTVal_Enabled',ctrl:'CCTVAL',prop:'Enabled'}]}");
      setEventMetadata("VALID_CCTTPOCTR","{handler:'valid_Ccttpoctr',iparms:[]");
      setEventMetadata("VALID_CCTTPOCTR",",oparms:[]}");
      setEventMetadata("VALID_CCTLINTPOI","{handler:'valid_Cctlintpoi',iparms:[]");
      setEventMetadata("VALID_CCTLINTPOI",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'AV27Mask',fld:'vMASK',pic:''}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'edtCCTValDsc_Enabled',ctrl:'CCTVALDSC',prop:'Enabled'},{av:'AV27Mask',fld:'vMASK',pic:''},{av:'edtCCTVal_Inputmask',ctrl:'CCTVAL',prop:'Inputmask'}]}");
      setEventMetadata("VALID_CCTVALLIN","{handler:'valid_Cctvallin',iparms:[]");
      setEventMetadata("VALID_CCTVALLIN",",oparms:[]}");
      setEventMetadata("VALID_CCTVALDSC","{handler:'valid_Cctvaldsc',iparms:[]");
      setEventMetadata("VALID_CCTVALDSC",",oparms:[]}");
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
      wcpOAV10EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4050CCTValDsc = "" ;
      Z4051CCTVal = "" ;
      N4050CCTValDsc = "" ;
      N4051CCTVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A4046CCTLinPict = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A4037CCTTpoCtr = "" ;
      A4048CCTLinTpoI = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A4036CCTDsc = "" ;
      TempTags = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV28Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV22CCTMsgMin = "" ;
      AV21CCTMsgMax = "" ;
      AV27Mask = "" ;
      AV19CCTMsgDsc = "" ;
      AV23CCTMsgVal = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode623 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV24Station = "" ;
      GXv_char2 = new String[1] ;
      AV25EmprNom = "" ;
      AV26UsurCod = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV16CCLPicInf = "" ;
      AV17CCLPicSup = "" ;
      AV14CCLArrInf = "" ;
      AV15CCLArrSup = "" ;
      AV20CCTMsgLin = "" ;
      AV18CCTMsgCod = "" ;
      Z407EmprNom = "" ;
      Z4036CCTDsc = "" ;
      Z4037CCTTpoCtr = "" ;
      Z4048CCTLinTpoI = "" ;
      Z4046CCTLinPict = "" ;
      T01UP4_A407EmprNom = new String[] {""} ;
      T01UP4_n407EmprNom = new boolean[] {false} ;
      T01UP5_A4036CCTDsc = new String[] {""} ;
      T01UP5_A4037CCTTpoCtr = new String[] {""} ;
      T01UP6_A4048CCTLinTpoI = new String[] {""} ;
      T01UP6_A4045CCTLinLgoD = new short[1] ;
      T01UP6_A4046CCTLinPict = new String[] {""} ;
      edtCCTVal_Inputmask = "" ;
      T01UP7_A4049CCTValLin = new byte[1] ;
      T01UP7_A4050CCTValDsc = new String[] {""} ;
      T01UP7_A407EmprNom = new String[] {""} ;
      T01UP7_n407EmprNom = new boolean[] {false} ;
      T01UP7_A4036CCTDsc = new String[] {""} ;
      T01UP7_A4037CCTTpoCtr = new String[] {""} ;
      T01UP7_A4048CCTLinTpoI = new String[] {""} ;
      T01UP7_A4045CCTLinLgoD = new short[1] ;
      T01UP7_A4046CCTLinPict = new String[] {""} ;
      T01UP7_A4051CCTVal = new String[] {""} ;
      T01UP7_A396EmprCod = new String[] {""} ;
      T01UP7_A4031CCTCod = new int[1] ;
      T01UP7_A4034CCTLin = new short[1] ;
      T01UP8_A4036CCTDsc = new String[] {""} ;
      T01UP8_A4037CCTTpoCtr = new String[] {""} ;
      T01UP9_A4048CCTLinTpoI = new String[] {""} ;
      T01UP9_A4045CCTLinLgoD = new short[1] ;
      T01UP9_A4046CCTLinPict = new String[] {""} ;
      T01UP10_A396EmprCod = new String[] {""} ;
      T01UP10_A4031CCTCod = new int[1] ;
      T01UP10_A4034CCTLin = new short[1] ;
      T01UP10_A4049CCTValLin = new byte[1] ;
      T01UP3_A4049CCTValLin = new byte[1] ;
      T01UP3_A4050CCTValDsc = new String[] {""} ;
      T01UP3_A4051CCTVal = new String[] {""} ;
      T01UP3_A396EmprCod = new String[] {""} ;
      T01UP3_A4031CCTCod = new int[1] ;
      T01UP3_A4034CCTLin = new short[1] ;
      T01UP11_A396EmprCod = new String[] {""} ;
      T01UP11_A4031CCTCod = new int[1] ;
      T01UP11_A4034CCTLin = new short[1] ;
      T01UP11_A4049CCTValLin = new byte[1] ;
      T01UP12_A396EmprCod = new String[] {""} ;
      T01UP12_A4031CCTCod = new int[1] ;
      T01UP12_A4034CCTLin = new short[1] ;
      T01UP12_A4049CCTValLin = new byte[1] ;
      T01UP2_A4049CCTValLin = new byte[1] ;
      T01UP2_A4050CCTValDsc = new String[] {""} ;
      T01UP2_A4051CCTVal = new String[] {""} ;
      T01UP2_A396EmprCod = new String[] {""} ;
      T01UP2_A4031CCTCod = new int[1] ;
      T01UP2_A4034CCTLin = new short[1] ;
      T01UP16_A4036CCTDsc = new String[] {""} ;
      T01UP16_A4037CCTTpoCtr = new String[] {""} ;
      T01UP17_A4048CCTLinTpoI = new String[] {""} ;
      T01UP17_A4045CCTLinLgoD = new short[1] ;
      T01UP17_A4046CCTLinPict = new String[] {""} ;
      T01UP18_A396EmprCod = new String[] {""} ;
      T01UP18_A4031CCTCod = new int[1] ;
      T01UP18_A4034CCTLin = new short[1] ;
      T01UP18_A4049CCTValLin = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new long[1] ;
      GXv_char3 = new String[1] ;
      ZV27Mask = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineas__default(),
         new Object[] {
             new Object[] {
            T01UP2_A4049CCTValLin, T01UP2_A4050CCTValDsc, T01UP2_A4051CCTVal, T01UP2_A396EmprCod, T01UP2_A4031CCTCod, T01UP2_A4034CCTLin
            }
            , new Object[] {
            T01UP3_A4049CCTValLin, T01UP3_A4050CCTValDsc, T01UP3_A4051CCTVal, T01UP3_A396EmprCod, T01UP3_A4031CCTCod, T01UP3_A4034CCTLin
            }
            , new Object[] {
            T01UP4_A407EmprNom, T01UP4_n407EmprNom
            }
            , new Object[] {
            T01UP5_A4036CCTDsc, T01UP5_A4037CCTTpoCtr
            }
            , new Object[] {
            T01UP6_A4048CCTLinTpoI, T01UP6_A4045CCTLinLgoD, T01UP6_A4046CCTLinPict
            }
            , new Object[] {
            T01UP7_A4049CCTValLin, T01UP7_A4050CCTValDsc, T01UP7_A407EmprNom, T01UP7_n407EmprNom, T01UP7_A4036CCTDsc, T01UP7_A4037CCTTpoCtr, T01UP7_A4048CCTLinTpoI, T01UP7_A4045CCTLinLgoD, T01UP7_A4046CCTLinPict, T01UP7_A4051CCTVal,
            T01UP7_A396EmprCod, T01UP7_A4031CCTCod, T01UP7_A4034CCTLin
            }
            , new Object[] {
            T01UP8_A4036CCTDsc, T01UP8_A4037CCTTpoCtr
            }
            , new Object[] {
            T01UP9_A4048CCTLinTpoI, T01UP9_A4045CCTLinLgoD, T01UP9_A4046CCTLinPict
            }
            , new Object[] {
            T01UP10_A396EmprCod, T01UP10_A4031CCTCod, T01UP10_A4034CCTLin, T01UP10_A4049CCTValLin
            }
            , new Object[] {
            T01UP11_A396EmprCod, T01UP11_A4031CCTCod, T01UP11_A4034CCTLin, T01UP11_A4049CCTValLin
            }
            , new Object[] {
            T01UP12_A396EmprCod, T01UP12_A4031CCTCod, T01UP12_A4034CCTLin, T01UP12_A4049CCTValLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UP16_A4036CCTDsc, T01UP16_A4037CCTTpoCtr
            }
            , new Object[] {
            T01UP17_A4048CCTLinTpoI, T01UP17_A4045CCTLinLgoD, T01UP17_A4046CCTLinPict
            }
            , new Object[] {
            T01UP18_A396EmprCod, T01UP18_A4031CCTCod, T01UP18_A4034CCTLin, T01UP18_A4049CCTValLin
            }
         }
      );
      AV28Pgmname = "ControlCalidadHTD.ControlCalidadVariable_lineas" ;
   }

   private byte wcpOAV9CCTValLin ;
   private byte Z4049CCTValLin ;
   private byte GxWebError ;
   private byte AV9CCTValLin ;
   private byte nKeyPressed ;
   private byte A4049CCTValLin ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV8CCTLin ;
   private short Z4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short A4034CCTLin ;
   private short AV8CCTLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound623 ;
   private short Z4045CCTLinLgoD ;
   private short nIsDirty_623 ;
   private int wcpOAV7CCTCod ;
   private int Z4031CCTCod ;
   private int A4031CCTCod ;
   private int AV7CCTCod ;
   private int trnEnded ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCTValLin_Enabled ;
   private int edtCCTValDsc_Enabled ;
   private int edtCCTVal_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private long GXv_int6[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String Z396EmprCod ;
   private String Z4050CCTValDsc ;
   private String Z4051CCTVal ;
   private String N4050CCTValDsc ;
   private String N4051CCTVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A4046CCTLinPict ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCTValLin_Internalname ;
   private String A4037CCTTpoCtr ;
   private String A4048CCTLinTpoI ;
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
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String edtCCTLin_Internalname ;
   private String edtCCTLin_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtCCTValLin_Jsonclick ;
   private String edtCCTValDsc_Internalname ;
   private String A4050CCTValDsc ;
   private String edtCCTValDsc_Jsonclick ;
   private String edtCCTVal_Internalname ;
   private String A4051CCTVal ;
   private String edtCCTVal_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV28Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String AV27Mask ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode623 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV24Station ;
   private String GXv_char2[] ;
   private String AV25EmprNom ;
   private String AV26UsurCod ;
   private String Z407EmprNom ;
   private String Z4036CCTDsc ;
   private String Z4037CCTTpoCtr ;
   private String Z4048CCTLinTpoI ;
   private String Z4046CCTLinPict ;
   private String edtCCTVal_Inputmask ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV27Mask ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private String AV22CCTMsgMin ;
   private String AV21CCTMsgMax ;
   private String AV19CCTMsgDsc ;
   private String AV23CCTMsgVal ;
   private String AV16CCLPicInf ;
   private String AV17CCLPicSup ;
   private String AV14CCLArrInf ;
   private String AV15CCLArrSup ;
   private String AV20CCTMsgLin ;
   private String AV18CCTMsgCod ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCCTTpoCtr ;
   private HTMLChoice cmbCCTLinTpoI ;
   private IDataStoreProvider pr_default ;
   private String[] T01UP4_A407EmprNom ;
   private boolean[] T01UP4_n407EmprNom ;
   private String[] T01UP5_A4036CCTDsc ;
   private String[] T01UP5_A4037CCTTpoCtr ;
   private String[] T01UP6_A4048CCTLinTpoI ;
   private short[] T01UP6_A4045CCTLinLgoD ;
   private String[] T01UP6_A4046CCTLinPict ;
   private byte[] T01UP7_A4049CCTValLin ;
   private String[] T01UP7_A4050CCTValDsc ;
   private String[] T01UP7_A407EmprNom ;
   private boolean[] T01UP7_n407EmprNom ;
   private String[] T01UP7_A4036CCTDsc ;
   private String[] T01UP7_A4037CCTTpoCtr ;
   private String[] T01UP7_A4048CCTLinTpoI ;
   private short[] T01UP7_A4045CCTLinLgoD ;
   private String[] T01UP7_A4046CCTLinPict ;
   private String[] T01UP7_A4051CCTVal ;
   private String[] T01UP7_A396EmprCod ;
   private int[] T01UP7_A4031CCTCod ;
   private short[] T01UP7_A4034CCTLin ;
   private String[] T01UP8_A4036CCTDsc ;
   private String[] T01UP8_A4037CCTTpoCtr ;
   private String[] T01UP9_A4048CCTLinTpoI ;
   private short[] T01UP9_A4045CCTLinLgoD ;
   private String[] T01UP9_A4046CCTLinPict ;
   private String[] T01UP10_A396EmprCod ;
   private int[] T01UP10_A4031CCTCod ;
   private short[] T01UP10_A4034CCTLin ;
   private byte[] T01UP10_A4049CCTValLin ;
   private byte[] T01UP3_A4049CCTValLin ;
   private String[] T01UP3_A4050CCTValDsc ;
   private String[] T01UP3_A4051CCTVal ;
   private String[] T01UP3_A396EmprCod ;
   private int[] T01UP3_A4031CCTCod ;
   private short[] T01UP3_A4034CCTLin ;
   private String[] T01UP11_A396EmprCod ;
   private int[] T01UP11_A4031CCTCod ;
   private short[] T01UP11_A4034CCTLin ;
   private byte[] T01UP11_A4049CCTValLin ;
   private String[] T01UP12_A396EmprCod ;
   private int[] T01UP12_A4031CCTCod ;
   private short[] T01UP12_A4034CCTLin ;
   private byte[] T01UP12_A4049CCTValLin ;
   private byte[] T01UP2_A4049CCTValLin ;
   private String[] T01UP2_A4050CCTValDsc ;
   private String[] T01UP2_A4051CCTVal ;
   private String[] T01UP2_A396EmprCod ;
   private int[] T01UP2_A4031CCTCod ;
   private short[] T01UP2_A4034CCTLin ;
   private String[] T01UP16_A4036CCTDsc ;
   private String[] T01UP16_A4037CCTTpoCtr ;
   private String[] T01UP17_A4048CCTLinTpoI ;
   private short[] T01UP17_A4045CCTLinLgoD ;
   private String[] T01UP17_A4046CCTLinPict ;
   private String[] T01UP18_A396EmprCod ;
   private int[] T01UP18_A4031CCTCod ;
   private short[] T01UP18_A4034CCTLin ;
   private byte[] T01UP18_A4049CCTValLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class controlcalidadvariable_lineas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable_lineas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable_lineas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable_lineas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable_lineas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UP2", "SELECT CCTValLin, CCTValDsc, CCTVal, EmprCod, CCTCod, CCTLin FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?  FOR UPDATE OF CCTValDsc, CCTVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP3", "SELECT CCTValLin, CCTValDsc, CCTVal, EmprCod, CCTCod, CCTLin FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP5", "SELECT CCTDsc, CCTTpoCtr FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP6", "SELECT CCTLinTpoI, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP7", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCTValLin, TM1.CCTValDsc, T2.EmprNom, T3.CCTDsc, T3.CCTTpoCtr, T4.CCTLinTpoI, T4.CCTLinLgoD, T4.CCTLinPict, TM1.CCTVal, TM1.EmprCod, TM1.CCTCod, TM1.CCTLin FROM (((TXPCCDef2 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = TM1.EmprCod AND T3.CCTCod = TM1.CCTCod) INNER JOIN TXPCCDef1 T4 ON T4.EmprCod = TM1.EmprCod AND T4.CCTCod = TM1.CCTCod AND T4.CCTLin = TM1.CCTLin) WHERE TM1.EmprCod = ? and TM1.CCTCod = ? and TM1.CCTLin = ? and TM1.CCTValLin = ? ORDER BY TM1.EmprCod, TM1.CCTCod, TM1.CCTLin, TM1.CCTValLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP8", "SELECT CCTDsc, CCTTpoCtr FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP9", "SELECT CCTLinTpoI, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE ( EmprCod > ? or EmprCod = ? and CCTCod > ? or CCTCod = ? and EmprCod = ? and CCTLin > ? or CCTLin = ? and CCTCod = ? and EmprCod = ? and CCTValLin > ?) ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UP12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE ( EmprCod < ? or EmprCod = ? and CCTCod < ? or CCTCod = ? and EmprCod = ? and CCTLin < ? or CCTLin = ? and CCTCod = ? and EmprCod = ? and CCTValLin < ?) ORDER BY EmprCod DESC, CCTCod DESC, CCTLin DESC, CCTValLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UP13", "INSERT INTO TXPCCDef2(CCTValLin, CCTValDsc, CCTVal, EmprCod, CCTCod, CCTLin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDef2")
         ,new UpdateCursor("T01UP14", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK, "TXPCCDef2")
         ,new UpdateCursor("T01UP15", "DELETE FROM TXPCCDef2  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK, "TXPCCDef2")
         ,new ForEachCursor("T01UP16", "SELECT CCTDsc, CCTTpoCtr FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP17", "SELECT CCTLinTpoI, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UP18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

