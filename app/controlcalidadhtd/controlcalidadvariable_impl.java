package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidadvariable_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"vREGEX") == 0 )
      {
         A4044CCTLinTpoD = httpContext.GetPar( "CCTLinTpoD") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4048CCTLinTpoI = httpContext.GetPar( "CCTLinTpoI") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4045CCTLinLgoD = (short)(GXutil.lval( httpContext.GetPar( "CCTLinLgoD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx21asaregex1SY622( A4044CCTLinTpoD, A4048CCTLinTpoI, A4045CCTLinLgoD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_49( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_50") == 0 )
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
         gxload_50( A396EmprCod, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_51") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11522CCVCod = httpContext.GetPar( "CCVCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_51( A396EmprCod, A11522CCVCod) ;
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
            AV7CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCTLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCTLin), "ZZZ9")));
            AV8EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
            AV9CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CCTCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control Calidad Variable", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public controlcalidadvariable_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidadvariable_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadvariable_impl.class ));
   }

   public controlcalidadvariable_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTLinTpoI = new HTMLChoice();
      cmbCCTLinTpoD = new HTMLChoice();
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
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTCod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTDsc_Internalname, httpContext.getMessage( "Descripción del Test", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtCCTLin_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLin_Internalname, httpContext.getMessage( "# Lín", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLin_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCCTLin_Visible, edtCCTLin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbCCTLinTpoI.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTLinTpoI.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTLinTpoI.getInternalname(), httpContext.getMessage( "Tipo de Ingreso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTLinTpoI, cmbCCTLinTpoI.getInternalname(), GXutil.rtrim( A4048CCTLinTpoI), 1, cmbCCTLinTpoI.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbCCTLinTpoI.getVisible(), cmbCCTLinTpoI.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbCCTLinTpoD.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTLinTpoD.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTLinTpoD.getInternalname(), httpContext.getMessage( "Tipo de Datos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTLinTpoD, cmbCCTLinTpoD.getInternalname(), GXutil.rtrim( A4044CCTLinTpoD), 1, cmbCCTLinTpoD.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbCCTLinTpoD.getVisible(), cmbCCTLinTpoD.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablerow2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtCCTLinDsc_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc), GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCCTLinDsc_Visible, edtCCTLinDsc_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinDc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinDc2_Internalname, httpContext.getMessage( "(cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinDc2_Internalname, GXutil.rtrim( A14344CCTLinDc2), GXutil.rtrim( localUtil.format( A14344CCTLinDc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinDc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTLinDc2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablerow3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVNorma_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVNorma_Internalname, httpContext.getMessage( "Metodo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVNorma_Internalname, GXutil.rtrim( A13249CCVNorma), GXutil.rtrim( localUtil.format( A13249CCVNorma, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVNorma_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCVNorma_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVEspe2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVEspe2_Internalname, httpContext.getMessage( "Especificacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCCVEspe2_Internalname, A14345CCVEspe2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", (short)(0), 1, edtCCVEspe2_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divVariablesword_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinVarW_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinVarW_Internalname, httpContext.getMessage( "Variable Word", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinVarW_Internalname, GXutil.rtrim( A4047CCTLinVarW), GXutil.rtrim( localUtil.format( A4047CCTLinVarW, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinVarW_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTLinVarW_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinVWor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinVWor_Internalname, httpContext.getMessage( "Word Especificacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinVWor_Internalname, GXutil.rtrim( A14346CCTLinVWor), GXutil.rtrim( localUtil.format( A14346CCTLinVWor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinVWor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTLinVWor_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinWNor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinWNor_Internalname, httpContext.getMessage( "Word Norma", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinWNor_Internalname, GXutil.rtrim( A14347CCTLinWNor), GXutil.rtrim( localUtil.format( A14347CCTLinWNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinWNor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTLinWNor_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTablerow4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtCCTLinLgoD_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinLgoD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinLgoD_Internalname, httpContext.getMessage( "Largo del Dato", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinLgoD_Internalname, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinLgoD_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCCTLinLgoD_Visible, edtCCTLinLgoD_Enabled, 1, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtCCTLinPict_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinPict_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinPict_Internalname, httpContext.getMessage( "Picture", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinPict_Internalname, GXutil.rtrim( A4046CCTLinPict), GXutil.rtrim( localUtil.format( A4046CCTLinPict, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinPict_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCCTLinPict_Visible, edtCCTLinPict_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtCCTSta_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTSta_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTSta_Internalname, httpContext.getMessage( "Standar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTSta_Internalname, GXutil.rtrim( A4408CCTSta), GXutil.rtrim( localUtil.format( A4408CCTSta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTSta_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCCTSta_Visible, edtCCTSta_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV36Pgmname), GXutil.rtrim( localUtil.format( AV36Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
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
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTestcc_Internalname, GXutil.ltrim( localUtil.ntoc( AV31TestCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTestcc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31TestCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV31TestCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTestcc_Jsonclick, 0, "Attribute", "", "", "", "", edtavTestcc_Visible, edtavTestcc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVDsc_Internalname, GXutil.rtrim( A11529CCVDsc), GXutil.rtrim( localUtil.format( A11529CCVDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtCCVDsc_Visible, edtCCVDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVPict_Internalname, GXutil.rtrim( A11526CCVPict), GXutil.rtrim( localUtil.format( A11526CCVPict, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVPict_Jsonclick, 0, "Attribute", "", "", "", "", edtCCVPict_Visible, edtCCVPict_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVLgoDat_Internalname, GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCVLgoDat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11527CCVLgoDat), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11527CCVLgoDat), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVLgoDat_Jsonclick, 0, "Attribute", "", "", "", "", edtCCVLgoDat_Visible, edtCCVLgoDat_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVTpoDat_Internalname, GXutil.rtrim( A11528CCVTpoDat), GXutil.rtrim( localUtil.format( A11528CCVTpoDat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVTpoDat_Jsonclick, 0, "Attribute", "", "", "", "", edtCCVTpoDat_Visible, edtCCVTpoDat_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTTpoCtr_Internalname, GXutil.rtrim( A4037CCTTpoCtr), GXutil.rtrim( localUtil.format( A4037CCTTpoCtr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTTpoCtr_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTTpoCtr_Visible, edtCCTTpoCtr_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTObs_Internalname, GXutil.rtrim( A4042CCTObs), GXutil.rtrim( localUtil.format( A4042CCTObs, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTObs_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTObs_Visible, edtCCTObs_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Booleano", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVCod_Internalname, GXutil.rtrim( A11522CCVCod), GXutil.rtrim( localUtil.format( A11522CCVCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCCVCod_Visible, edtCCVCod_Enabled, 1, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCCTLinDscL_Internalname, A11476CCTLinDscL, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", (short)(0), edtCCTLinDscL_Visible, edtCCTLinDscL_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2048", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\ControlCalidadVariable.htm");
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
      e111SY2 ();
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
            Z4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( "Z4045CCTLinLgoD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4046CCTLinPict = httpContext.cgiGet( "Z4046CCTLinPict") ;
            Z4048CCTLinTpoI = httpContext.cgiGet( "Z4048CCTLinTpoI") ;
            Z4044CCTLinTpoD = httpContext.cgiGet( "Z4044CCTLinTpoD") ;
            Z4043CCTLinDsc = httpContext.cgiGet( "Z4043CCTLinDsc") ;
            Z14344CCTLinDc2 = httpContext.cgiGet( "Z14344CCTLinDc2") ;
            Z11476CCTLinDscL = httpContext.cgiGet( "Z11476CCTLinDscL") ;
            Z4047CCTLinVarW = httpContext.cgiGet( "Z4047CCTLinVarW") ;
            Z14346CCTLinVWor = httpContext.cgiGet( "Z14346CCTLinVWor") ;
            Z14347CCTLinWNor = httpContext.cgiGet( "Z14347CCTLinWNor") ;
            Z4408CCTSta = httpContext.cgiGet( "Z4408CCTSta") ;
            Z13249CCVNorma = httpContext.cgiGet( "Z13249CCVNorma") ;
            Z13250CCVEspecif = httpContext.cgiGet( "Z13250CCVEspecif") ;
            Z14345CCVEspe2 = httpContext.cgiGet( "Z14345CCVEspe2") ;
            Z11522CCVCod = httpContext.cgiGet( "Z11522CCVCod") ;
            A13250CCVEspecif = httpContext.cgiGet( "Z13250CCVEspecif") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N11522CCVCod = httpContext.cgiGet( "N11522CCVCod") ;
            N4043CCTLinDsc = httpContext.cgiGet( "N4043CCTLinDsc") ;
            N4408CCTSta = httpContext.cgiGet( "N4408CCTSta") ;
            N4044CCTLinTpoD = httpContext.cgiGet( "N4044CCTLinTpoD") ;
            N4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( "N4045CCTLinLgoD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N4046CCTLinPict = httpContext.cgiGet( "N4046CCTLinPict") ;
            AV7CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( "vCCTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV9CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_CCVCod = httpContext.cgiGet( "vINSERT_CCVCOD") ;
            AV35Regex = httpContext.cgiGet( "vREGEX") ;
            AV18CCTMsgCod = httpContext.cgiGet( "vCCTMSGCOD") ;
            AV19CCTMsgDsc = httpContext.cgiGet( "vCCTMSGDSC") ;
            A13250CCVEspecif = httpContext.cgiGet( "CCVESPECIF") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4034CCTLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            }
            else
            {
               A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            }
            cmbCCTLinTpoI.setValue( httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) );
            A4048CCTLinTpoI = httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
            cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
            A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
            A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
            A14344CCTLinDc2 = httpContext.cgiGet( edtCCTLinDc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14344CCTLinDc2", A14344CCTLinDc2);
            A13249CCVNorma = httpContext.cgiGet( edtCCVNorma_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
            A14345CCVEspe2 = httpContext.cgiGet( edtCCVEspe2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14345CCVEspe2", A14345CCVEspe2);
            A4047CCTLinVarW = GXutil.upper( httpContext.cgiGet( edtCCTLinVarW_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
            A14346CCTLinVWor = httpContext.cgiGet( edtCCTLinVWor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14346CCTLinVWor", A14346CCTLinVWor);
            A14347CCTLinWNor = httpContext.cgiGet( edtCCTLinWNor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14347CCTLinWNor", A14347CCTLinWNor);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTLINLGOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTLinLgoD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4045CCTLinLgoD = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
            }
            else
            {
               A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
            }
            A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
            A4408CCTSta = httpContext.cgiGet( edtCCTSta_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            AV31TestCC = (short)(localUtil.ctol( httpContext.cgiGet( edtavTestcc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TestCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TestCC), 4, 0));
            A11529CCVDsc = httpContext.cgiGet( edtCCVDsc_Internalname) ;
            n11529CCVDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
            A11526CCVPict = httpContext.cgiGet( edtCCVPict_Internalname) ;
            n11526CCVPict = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
            A11527CCVLgoDat = (short)(localUtil.ctol( httpContext.cgiGet( edtCCVLgoDat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11527CCVLgoDat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
            A11528CCVTpoDat = httpContext.cgiGet( edtCCVTpoDat_Internalname) ;
            n11528CCVTpoDat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
            A4037CCTTpoCtr = httpContext.cgiGet( edtCCTTpoCtr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
            A4042CCTObs = GXutil.upper( httpContext.cgiGet( edtCCTObs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11522CCVCod = httpContext.cgiGet( edtCCVCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
            A11476CCTLinDscL = httpContext.cgiGet( edtCCTLinDscL_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadVariable");
            A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            forbiddenHiddens.add("CCTCod", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
            forbiddenHiddens.add("CCVEspecif", GXutil.rtrim( localUtil.format( A13250CCVEspecif, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\controlcalidadvariable:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode622 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode622 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound622 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SY0( ) ;
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
                        e111SY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "CCTLINLGOD.ISVALID") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131SY2 ();
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
         e121SY2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SY622( ) ;
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
         disableAttributes1SY622( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavTestcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTestcc_Enabled), 5, 0), true);
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

   public void confirm_1SY0( )
   {
      beforeValidate1SY622( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SY622( ) ;
         }
         else
         {
            checkExtendedTable1SY622( ) ;
            closeExtendedTableCursors1SY622( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SY0( )
   {
   }

   public void e111SY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      GXv_char2[0] = AV34AuxEmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidadvariable_impl.this.AV34AuxEmprCod = GXv_char2[0] ;
      controlcalidadvariable_impl.this.AV27EmprNom = GXv_char3[0] ;
      controlcalidadvariable_impl.this.AV29UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34AuxEmprCod", AV34AuxEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
      GXt_char1 = AV28Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      GXv_char4[0] = AV8EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char2[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char4, GXv_char3, GXv_char2) ;
      controlcalidadvariable_impl.this.AV8EmprCod = GXv_char4[0] ;
      controlcalidadvariable_impl.this.AV27EmprNom = GXv_char3[0] ;
      controlcalidadvariable_impl.this.AV29UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV36Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV37GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GXV1), 8, 0));
         while ( AV37GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV37GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CCVCod") == 0 )
            {
               AV13Insert_CCVCod = AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_CCVCod", AV13Insert_CCVCod);
            }
            AV37GXV1 = (int)(AV37GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GXV1), 8, 0));
         }
      }
      edtavTestcc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTestcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTestcc_Visible), 5, 0), true);
      edtCCVDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Visible), 5, 0), true);
      edtCCVPict_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Visible), 5, 0), true);
      edtCCVLgoDat_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVLgoDat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVLgoDat_Visible), 5, 0), true);
      edtCCVTpoDat_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVTpoDat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVTpoDat_Visible), 5, 0), true);
      edtCCTTpoCtr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTTpoCtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTTpoCtr_Visible), 5, 0), true);
      edtCCTObs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtCCVCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Visible), 5, 0), true);
      edtCCTLinDscL_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDscL_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDscL_Visible), 5, 0), true);
      GXt_char1 = AV16CCLPicInf ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICINF", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16CCLPicInf = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CCLPicInf", AV16CCLPicInf);
      GXt_char1 = AV17CCLPicSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17CCLPicSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCLPicSup", AV17CCLPicSup);
      GXt_char1 = AV15CCLArrInf ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICINF", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV15CCLArrInf = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CCLArrInf", AV15CCLArrInf);
      GXt_char1 = AV33CCLArrSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33CCLArrSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33CCLArrSup", AV33CCLArrSup);
      GXt_char1 = AV20CCTMsgLin ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGLIN", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20CCTMsgLin = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20CCTMsgLin", AV20CCTMsgLin);
      GXt_char1 = AV23CCTMsgVal ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGVAL", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23CCTMsgVal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23CCTMsgVal", AV23CCTMsgVal);
      GXt_char1 = AV22CCTMsgMin ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22CCTMsgMin = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CCTMsgMin", AV22CCTMsgMin);
      GXt_char1 = AV21CCTMsgMax ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT397_", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21CCTMsgMax = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21CCTMsgMax", AV21CCTMsgMax);
      GXt_char1 = AV18CCTMsgCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGCOD", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18CCTMsgCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CCTMsgCod", AV18CCTMsgCod);
      GXt_char1 = AV19CCTMsgDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGDSC", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19CCTMsgDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CCTMsgDsc", AV19CCTMsgDsc);
      GXt_int6 = (byte)(AV31TestCC) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TSTCCH", ""), GXv_int7) ;
      controlcalidadvariable_impl.this.GXt_int6 = GXv_int7[0] ;
      AV31TestCC = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TestCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TestCC), 4, 0));
   }

   public void e121SY2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A4037CCTTpoCtr, "I") == 0 )
      {
         new app.controlcalidadhtd.pccintval(remoteHandle, context).execute( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
      }
      httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidadvariable_lineas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A4036CCTDsc)),GXutil.URLEncode(GXutil.ltrimstr(A4034CCTLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A4043CCTLinDsc)),GXutil.URLEncode(GXutil.rtrim(A4037CCTTpoCtr)),GXutil.URLEncode(GXutil.rtrim(A4048CCTLinTpoI))}, new String[] {"EmprCod","CCTCod","CCTDsc","CCTLin","CCTLinDsc","CCTTpoCtr","CCTLinTpoIng"}) , new Object[] {});
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

   public void e131SY2( )
   {
      /* CCTLinLgoD_Isvalid Routine */
      returnInSub = false ;
      GXt_char1 = AV35Regex ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.pset_validartipocampo(remoteHandle, context).execute( A4044CCTLinTpoD, A4048CCTLinTpoI, A4045CCTLinLgoD, GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Regex = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Regex", AV35Regex);
      /*  Sending Event outputs  */
   }

   public void zm1SY622( int GX_JID )
   {
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4045CCTLinLgoD = T01SY3_A4045CCTLinLgoD[0] ;
            Z4046CCTLinPict = T01SY3_A4046CCTLinPict[0] ;
            Z4048CCTLinTpoI = T01SY3_A4048CCTLinTpoI[0] ;
            Z4044CCTLinTpoD = T01SY3_A4044CCTLinTpoD[0] ;
            Z4043CCTLinDsc = T01SY3_A4043CCTLinDsc[0] ;
            Z14344CCTLinDc2 = T01SY3_A14344CCTLinDc2[0] ;
            Z11476CCTLinDscL = T01SY3_A11476CCTLinDscL[0] ;
            Z4047CCTLinVarW = T01SY3_A4047CCTLinVarW[0] ;
            Z14346CCTLinVWor = T01SY3_A14346CCTLinVWor[0] ;
            Z14347CCTLinWNor = T01SY3_A14347CCTLinWNor[0] ;
            Z4408CCTSta = T01SY3_A4408CCTSta[0] ;
            Z13249CCVNorma = T01SY3_A13249CCVNorma[0] ;
            Z13250CCVEspecif = T01SY3_A13250CCVEspecif[0] ;
            Z14345CCVEspe2 = T01SY3_A14345CCVEspe2[0] ;
            Z11522CCVCod = T01SY3_A11522CCVCod[0] ;
         }
         else
         {
            Z4045CCTLinLgoD = A4045CCTLinLgoD ;
            Z4046CCTLinPict = A4046CCTLinPict ;
            Z4048CCTLinTpoI = A4048CCTLinTpoI ;
            Z4044CCTLinTpoD = A4044CCTLinTpoD ;
            Z4043CCTLinDsc = A4043CCTLinDsc ;
            Z14344CCTLinDc2 = A14344CCTLinDc2 ;
            Z11476CCTLinDscL = A11476CCTLinDscL ;
            Z4047CCTLinVarW = A4047CCTLinVarW ;
            Z14346CCTLinVWor = A14346CCTLinVWor ;
            Z14347CCTLinWNor = A14347CCTLinWNor ;
            Z4408CCTSta = A4408CCTSta ;
            Z13249CCVNorma = A13249CCVNorma ;
            Z13250CCVEspecif = A13250CCVEspecif ;
            Z14345CCVEspe2 = A14345CCVEspe2 ;
            Z11522CCVCod = A11522CCVCod ;
         }
      }
      if ( GX_JID == -48 )
      {
         Z4034CCTLin = A4034CCTLin ;
         Z4045CCTLinLgoD = A4045CCTLinLgoD ;
         Z4046CCTLinPict = A4046CCTLinPict ;
         Z4048CCTLinTpoI = A4048CCTLinTpoI ;
         Z4044CCTLinTpoD = A4044CCTLinTpoD ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
         Z14344CCTLinDc2 = A14344CCTLinDc2 ;
         Z11476CCTLinDscL = A11476CCTLinDscL ;
         Z4047CCTLinVarW = A4047CCTLinVarW ;
         Z14346CCTLinVWor = A14346CCTLinVWor ;
         Z14347CCTLinWNor = A14347CCTLinWNor ;
         Z4408CCTSta = A4408CCTSta ;
         Z13249CCVNorma = A13249CCVNorma ;
         Z13250CCVEspecif = A13250CCVEspecif ;
         Z14345CCVEspe2 = A14345CCVEspe2 ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z11522CCVCod = A11522CCVCod ;
         Z407EmprNom = A407EmprNom ;
         Z4036CCTDsc = A4036CCTDsc ;
         Z4037CCTTpoCtr = A4037CCTTpoCtr ;
         Z4042CCTObs = A4042CCTObs ;
         Z11526CCVPict = A11526CCVPict ;
         Z11527CCVLgoDat = A11527CCVLgoDat ;
         Z11528CCVTpoDat = A11528CCVTpoDat ;
         Z11529CCVDsc = A11529CCVDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      AV36Pgmname = "ControlCalidadHTD.ControlCalidadVariable" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV7CCTLin) )
      {
         A4034CCTLin = AV7CCTLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
      if ( ! (0==AV7CCTLin) )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7CCTLin) )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         A396EmprCod = AV8EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9CCTCod) )
      {
         A4031CCTCod = AV9CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
         /* Using cursor T01SY4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T01SY4_A407EmprNom[0] ;
         n407EmprNom = T01SY4_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(2);
         /* Using cursor T01SY5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01SY5_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01SY5_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4042CCTObs = T01SY5_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         pr_default.close(3);
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
         {
            edtCCTSta_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTSta_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTObs_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTObs_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTLin_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTLin_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTLinDsc_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTLinDsc_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTSta_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTSta_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            cmbCCTLinTpoI.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               cmbCCTLinTpoI.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            cmbCCTLinTpoD.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               cmbCCTLinTpoD.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            edtCCTLinLgoD_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               edtCCTLinLgoD_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            edtCCTLinPict_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               edtCCTLinPict_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
            }
         }
      }
   }

   public void load1SY622( )
   {
      /* Using cursor T01SY7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A4045CCTLinLgoD = T01SY7_A4045CCTLinLgoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         A4046CCTLinPict = T01SY7_A4046CCTLinPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4048CCTLinTpoI = T01SY7_A4048CCTLinTpoI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4044CCTLinTpoD = T01SY7_A4044CCTLinTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4043CCTLinDsc = T01SY7_A4043CCTLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
         A407EmprNom = T01SY7_A407EmprNom[0] ;
         n407EmprNom = T01SY7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4036CCTDsc = T01SY7_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01SY7_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4042CCTObs = T01SY7_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         A14344CCTLinDc2 = T01SY7_A14344CCTLinDc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14344CCTLinDc2", A14344CCTLinDc2);
         A11476CCTLinDscL = T01SY7_A11476CCTLinDscL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
         A4047CCTLinVarW = T01SY7_A4047CCTLinVarW[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
         A14346CCTLinVWor = T01SY7_A14346CCTLinVWor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14346CCTLinVWor", A14346CCTLinVWor);
         A14347CCTLinWNor = T01SY7_A14347CCTLinWNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14347CCTLinWNor", A14347CCTLinWNor);
         A4408CCTSta = T01SY7_A4408CCTSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
         A11526CCVPict = T01SY7_A11526CCVPict[0] ;
         n11526CCVPict = T01SY7_n11526CCVPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
         A11527CCVLgoDat = T01SY7_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T01SY7_n11527CCVLgoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
         A11528CCVTpoDat = T01SY7_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T01SY7_n11528CCVTpoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
         A11529CCVDsc = T01SY7_A11529CCVDsc[0] ;
         n11529CCVDsc = T01SY7_n11529CCVDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
         A13249CCVNorma = T01SY7_A13249CCVNorma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
         A13250CCVEspecif = T01SY7_A13250CCVEspecif[0] ;
         A14345CCVEspe2 = T01SY7_A14345CCVEspe2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14345CCVEspe2", A14345CCVEspe2);
         A11522CCVCod = T01SY7_A11522CCVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         zm1SY622( -48) ;
      }
      pr_default.close(5);
      onLoadActions1SY622( ) ;
   }

   public void onLoadActions1SY622( )
   {
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4048CCTLinTpoI = httpContext.getMessage( httpContext.getMessage( "L", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            A4048CCTLinTpoI = httpContext.getMessage( httpContext.getMessage( "L", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTSta_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTSta_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTObs_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTObs_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLin_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLin_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLinDsc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLinDsc_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTSta_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTSta_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoI.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoI.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoD.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoD.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinLgoD_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinLgoD_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinPict_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinPict_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_CCVCod)==0) )
      {
         A11522CCVCod = AV13Insert_CCVCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
      }
      else
      {
         if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV31TestCC == 0 ) )
         {
            A11522CCVCod = httpContext.getMessage( httpContext.getMessage( "NoAplica", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         }
      }
      if ( ( GXutil.strcmp(sMode622, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_CCVCod)==0) )
      {
         edtCCVCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV31TestCC == 0 ) )
         {
            edtCCVCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
         }
         else
         {
            edtCCVCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4045CCTLinLgoD = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            A4045CCTLinLgoD = A11527CCVLgoDat ;
            httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4046CCTLinPict = "9" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            A4046CCTLinPict = A11526CCVPict ;
            httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4044CCTLinTpoD = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            A4044CCTLinTpoD = A11528CCVTpoDat ;
            httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTLinDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTLinDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         cmbCCTLinTpoD.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbCCTLinTpoD.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinLgoD_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinLgoD_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTLinLgoD_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinPict_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinPict_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTLinPict_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
      {
         A4043CCTLinDsc = A11529CCVDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      }
      GXt_char1 = AV35Regex ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.pset_validartipocampo(remoteHandle, context).execute( A4044CCTLinTpoD, A4048CCTLinTpoI, A4045CCTLinLgoD, GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Regex = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Regex", AV35Regex);
   }

   public void checkExtendedTable1SY622( )
   {
      nIsDirty_622 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SY4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SY4_A407EmprNom[0] ;
      n407EmprNom = T01SY4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01SY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01SY5_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = T01SY5_A4037CCTTpoCtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      A4042CCTObs = T01SY5_A4042CCTObs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
      pr_default.close(3);
      if ( (GXutil.strcmp("", A4036CCTDsc)==0) )
      {
         httpContext.GX_msglist.addItem(AV19CCTMsgDsc, 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_622 = (short)(1) ;
         A4048CCTLinTpoI = httpContext.getMessage( httpContext.getMessage( "L", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            nIsDirty_622 = (short)(1) ;
            A4048CCTLinTpoI = httpContext.getMessage( httpContext.getMessage( "L", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTSta_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTSta_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTObs_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTObs_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLin_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLin_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLinDsc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLinDsc_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTSta_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTSta_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoI.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoI.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoD.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoD.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinLgoD_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinLgoD_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinPict_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinPict_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
         }
      }
      if ( (0==A4031CCTCod) )
      {
         httpContext.GX_msglist.addItem(AV18CCTMsgCod, 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_CCVCod)==0) )
      {
         nIsDirty_622 = (short)(1) ;
         A11522CCVCod = AV13Insert_CCVCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
      }
      else
      {
         if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV31TestCC == 0 ) )
         {
            nIsDirty_622 = (short)(1) ;
            A11522CCVCod = httpContext.getMessage( httpContext.getMessage( "NoAplica", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_CCVCod)==0) )
      {
         edtCCVCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV31TestCC == 0 ) )
         {
            edtCCVCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
         }
         else
         {
            edtCCVCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && ( GXutil.strcmp(A11522CCVCod, httpContext.getMessage( "NoAplica", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe Seleccionar una variable", ""), 1, "CCTLINTPOI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCCTLinTpoI.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01SY6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11526CCVPict = T01SY6_A11526CCVPict[0] ;
      n11526CCVPict = T01SY6_n11526CCVPict[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
      A11527CCVLgoDat = T01SY6_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T01SY6_n11527CCVLgoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = T01SY6_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T01SY6_n11528CCVTpoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      A11529CCVDsc = T01SY6_A11529CCVDsc[0] ;
      n11529CCVDsc = T01SY6_n11529CCVDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
      pr_default.close(4);
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_622 = (short)(1) ;
         A4045CCTLinLgoD = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            nIsDirty_622 = (short)(1) ;
            A4045CCTLinLgoD = A11527CCVLgoDat ;
            httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_622 = (short)(1) ;
         A4046CCTLinPict = "9" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            nIsDirty_622 = (short)(1) ;
            A4046CCTLinPict = A11526CCVPict ;
            httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_622 = (short)(1) ;
         A4044CCTLinTpoD = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            nIsDirty_622 = (short)(1) ;
            A4044CCTLinTpoD = A11528CCVTpoDat ;
            httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTLinDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTLinDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         cmbCCTLinTpoD.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbCCTLinTpoD.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinLgoD_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinLgoD_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTLinLgoD_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinPict_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinPict_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTLinPict_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
      {
         nIsDirty_622 = (short)(1) ;
         A4043CCTLinDsc = A11529CCVDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      }
      if ( (GXutil.strcmp("", A4043CCTLinDsc)==0) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV19CCTMsgDsc, 1, "CCTLINDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLinDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GXt_char1 = AV35Regex ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.pset_validartipocampo(remoteHandle, context).execute( A4044CCTLinTpoD, A4048CCTLinTpoI, A4045CCTLinLgoD, GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Regex = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Regex", AV35Regex);
   }

   public void closeExtendedTableCursors1SY622( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_49( String A396EmprCod )
   {
      /* Using cursor T01SY8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SY8_A407EmprNom[0] ;
      n407EmprNom = T01SY8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_50( String A396EmprCod ,
                          int A4031CCTCod )
   {
      /* Using cursor T01SY9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01SY9_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = T01SY9_A4037CCTTpoCtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      A4042CCTObs = T01SY9_A4042CCTObs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4037CCTTpoCtr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4042CCTObs))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_51( String A396EmprCod ,
                          String A11522CCVCod )
   {
      /* Using cursor T01SY10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11526CCVPict = T01SY10_A11526CCVPict[0] ;
      n11526CCVPict = T01SY10_n11526CCVPict[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
      A11527CCVLgoDat = T01SY10_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T01SY10_n11527CCVLgoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = T01SY10_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T01SY10_n11528CCVTpoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      A11529CCVDsc = T01SY10_A11529CCVDsc[0] ;
      n11529CCVDsc = T01SY10_n11529CCVDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11526CCVPict))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11528CCVTpoDat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11529CCVDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1SY622( )
   {
      /* Using cursor T01SY11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound622 = (short)(1) ;
      }
      else
      {
         RcdFound622 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SY622( 48) ;
         RcdFound622 = (short)(1) ;
         A4034CCTLin = T01SY3_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         A4045CCTLinLgoD = T01SY3_A4045CCTLinLgoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         A4046CCTLinPict = T01SY3_A4046CCTLinPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4048CCTLinTpoI = T01SY3_A4048CCTLinTpoI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4044CCTLinTpoD = T01SY3_A4044CCTLinTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4043CCTLinDsc = T01SY3_A4043CCTLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
         A14344CCTLinDc2 = T01SY3_A14344CCTLinDc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14344CCTLinDc2", A14344CCTLinDc2);
         A11476CCTLinDscL = T01SY3_A11476CCTLinDscL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
         A4047CCTLinVarW = T01SY3_A4047CCTLinVarW[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
         A14346CCTLinVWor = T01SY3_A14346CCTLinVWor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14346CCTLinVWor", A14346CCTLinVWor);
         A14347CCTLinWNor = T01SY3_A14347CCTLinWNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14347CCTLinWNor", A14347CCTLinWNor);
         A4408CCTSta = T01SY3_A4408CCTSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
         A13249CCVNorma = T01SY3_A13249CCVNorma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
         A13250CCVEspecif = T01SY3_A13250CCVEspecif[0] ;
         A14345CCVEspe2 = T01SY3_A14345CCVEspe2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14345CCVEspe2", A14345CCVEspe2);
         A396EmprCod = T01SY3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SY3_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11522CCVCod = T01SY3_A11522CCVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SY622( ) ;
         if ( AnyError == 1 )
         {
            RcdFound622 = (short)(0) ;
            initializeNonKey1SY622( ) ;
         }
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound622 = (short)(0) ;
         initializeNonKey1SY622( ) ;
         sMode622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SY622( ) ;
      if ( RcdFound622 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound622 = (short)(0) ;
      /* Using cursor T01SY12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01SY12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SY12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY12_A4031CCTCod[0] < A4031CCTCod ) || ( T01SY12_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SY12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY12_A4034CCTLin[0] < A4034CCTLin ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01SY12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SY12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY12_A4031CCTCod[0] > A4031CCTCod ) || ( T01SY12_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SY12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY12_A4034CCTLin[0] > A4034CCTLin ) ) )
         {
            A396EmprCod = T01SY12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SY12_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01SY12_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            RcdFound622 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound622 = (short)(0) ;
      /* Using cursor T01SY13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01SY13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY13_A4031CCTCod[0] > A4031CCTCod ) || ( T01SY13_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY13_A4034CCTLin[0] > A4034CCTLin ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01SY13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY13_A4031CCTCod[0] < A4031CCTCod ) || ( T01SY13_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SY13_A4034CCTLin[0] < A4034CCTLin ) ) )
         {
            A396EmprCod = T01SY13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SY13_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01SY13_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            RcdFound622 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SY622( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SY622( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound622 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               A4034CCTLin = Z4034CCTLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCCTLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SY622( ) ;
               GX_FocusControl = edtCCTLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtCCTLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SY622( ) ;
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
                  GX_FocusControl = edtCCTLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SY622( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = Z4034CCTLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SY622( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z4045CCTLinLgoD != T01SY2_A4045CCTLinLgoD[0] ) || ( GXutil.strcmp(Z4046CCTLinPict, T01SY2_A4046CCTLinPict[0]) != 0 ) || ( GXutil.strcmp(Z4048CCTLinTpoI, T01SY2_A4048CCTLinTpoI[0]) != 0 ) || ( GXutil.strcmp(Z4044CCTLinTpoD, T01SY2_A4044CCTLinTpoD[0]) != 0 ) || ( GXutil.strcmp(Z4043CCTLinDsc, T01SY2_A4043CCTLinDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14344CCTLinDc2, T01SY2_A14344CCTLinDc2[0]) != 0 ) || ( GXutil.strcmp(Z11476CCTLinDscL, T01SY2_A11476CCTLinDscL[0]) != 0 ) || ( GXutil.strcmp(Z4047CCTLinVarW, T01SY2_A4047CCTLinVarW[0]) != 0 ) || ( GXutil.strcmp(Z14346CCTLinVWor, T01SY2_A14346CCTLinVWor[0]) != 0 ) || ( GXutil.strcmp(Z14347CCTLinWNor, T01SY2_A14347CCTLinWNor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4408CCTSta, T01SY2_A4408CCTSta[0]) != 0 ) || ( GXutil.strcmp(Z13249CCVNorma, T01SY2_A13249CCVNorma[0]) != 0 ) || ( GXutil.strcmp(Z13250CCVEspecif, T01SY2_A13250CCVEspecif[0]) != 0 ) || ( GXutil.strcmp(Z14345CCVEspe2, T01SY2_A14345CCVEspe2[0]) != 0 ) || ( GXutil.strcmp(Z11522CCVCod, T01SY2_A11522CCVCod[0]) != 0 ) )
         {
            if ( Z4045CCTLinLgoD != T01SY2_A4045CCTLinLgoD[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinLgoD");
               GXutil.writeLogRaw("Old: ",Z4045CCTLinLgoD);
               GXutil.writeLogRaw("Current: ",T01SY2_A4045CCTLinLgoD[0]);
            }
            if ( GXutil.strcmp(Z4046CCTLinPict, T01SY2_A4046CCTLinPict[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinPict");
               GXutil.writeLogRaw("Old: ",Z4046CCTLinPict);
               GXutil.writeLogRaw("Current: ",T01SY2_A4046CCTLinPict[0]);
            }
            if ( GXutil.strcmp(Z4048CCTLinTpoI, T01SY2_A4048CCTLinTpoI[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinTpoI");
               GXutil.writeLogRaw("Old: ",Z4048CCTLinTpoI);
               GXutil.writeLogRaw("Current: ",T01SY2_A4048CCTLinTpoI[0]);
            }
            if ( GXutil.strcmp(Z4044CCTLinTpoD, T01SY2_A4044CCTLinTpoD[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinTpoD");
               GXutil.writeLogRaw("Old: ",Z4044CCTLinTpoD);
               GXutil.writeLogRaw("Current: ",T01SY2_A4044CCTLinTpoD[0]);
            }
            if ( GXutil.strcmp(Z4043CCTLinDsc, T01SY2_A4043CCTLinDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinDsc");
               GXutil.writeLogRaw("Old: ",Z4043CCTLinDsc);
               GXutil.writeLogRaw("Current: ",T01SY2_A4043CCTLinDsc[0]);
            }
            if ( GXutil.strcmp(Z14344CCTLinDc2, T01SY2_A14344CCTLinDc2[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinDc2");
               GXutil.writeLogRaw("Old: ",Z14344CCTLinDc2);
               GXutil.writeLogRaw("Current: ",T01SY2_A14344CCTLinDc2[0]);
            }
            if ( GXutil.strcmp(Z11476CCTLinDscL, T01SY2_A11476CCTLinDscL[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinDscL");
               GXutil.writeLogRaw("Old: ",Z11476CCTLinDscL);
               GXutil.writeLogRaw("Current: ",T01SY2_A11476CCTLinDscL[0]);
            }
            if ( GXutil.strcmp(Z4047CCTLinVarW, T01SY2_A4047CCTLinVarW[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinVarW");
               GXutil.writeLogRaw("Old: ",Z4047CCTLinVarW);
               GXutil.writeLogRaw("Current: ",T01SY2_A4047CCTLinVarW[0]);
            }
            if ( GXutil.strcmp(Z14346CCTLinVWor, T01SY2_A14346CCTLinVWor[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinVWor");
               GXutil.writeLogRaw("Old: ",Z14346CCTLinVWor);
               GXutil.writeLogRaw("Current: ",T01SY2_A14346CCTLinVWor[0]);
            }
            if ( GXutil.strcmp(Z14347CCTLinWNor, T01SY2_A14347CCTLinWNor[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTLinWNor");
               GXutil.writeLogRaw("Old: ",Z14347CCTLinWNor);
               GXutil.writeLogRaw("Current: ",T01SY2_A14347CCTLinWNor[0]);
            }
            if ( GXutil.strcmp(Z4408CCTSta, T01SY2_A4408CCTSta[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCTSta");
               GXutil.writeLogRaw("Old: ",Z4408CCTSta);
               GXutil.writeLogRaw("Current: ",T01SY2_A4408CCTSta[0]);
            }
            if ( GXutil.strcmp(Z13249CCVNorma, T01SY2_A13249CCVNorma[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCVNorma");
               GXutil.writeLogRaw("Old: ",Z13249CCVNorma);
               GXutil.writeLogRaw("Current: ",T01SY2_A13249CCVNorma[0]);
            }
            if ( GXutil.strcmp(Z13250CCVEspecif, T01SY2_A13250CCVEspecif[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCVEspecif");
               GXutil.writeLogRaw("Old: ",Z13250CCVEspecif);
               GXutil.writeLogRaw("Current: ",T01SY2_A13250CCVEspecif[0]);
            }
            if ( GXutil.strcmp(Z14345CCVEspe2, T01SY2_A14345CCVEspe2[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCVEspe2");
               GXutil.writeLogRaw("Old: ",Z14345CCVEspe2);
               GXutil.writeLogRaw("Current: ",T01SY2_A14345CCVEspe2[0]);
            }
            if ( GXutil.strcmp(Z11522CCVCod, T01SY2_A11522CCVCod[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadvariable:[seudo value changed for attri]"+"CCVCod");
               GXutil.writeLogRaw("Old: ",Z11522CCVCod);
               GXutil.writeLogRaw("Current: ",T01SY2_A11522CCVCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SY622( )
   {
      beforeValidate1SY622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SY622( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SY622( 0) ;
         checkOptimisticConcurrency1SY622( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SY622( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SY622( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SY14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A4034CCTLin), Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4048CCTLinTpoI, A4044CCTLinTpoD, A4043CCTLinDsc, A14344CCTLinDc2, A11476CCTLinDscL, A4047CCTLinVarW, A14346CCTLinVWor, A14347CCTLinWNor, A4408CCTSta, A13249CCVNorma, A13250CCVEspecif, A14345CCVEspe2, A396EmprCod, Integer.valueOf(A4031CCTCod), A11522CCVCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption1SY0( ) ;
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
            load1SY622( ) ;
         }
         endLevel1SY622( ) ;
      }
      closeExtendedTableCursors1SY622( ) ;
   }

   public void update1SY622( )
   {
      beforeValidate1SY622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SY622( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SY622( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SY622( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SY622( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SY15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4048CCTLinTpoI, A4044CCTLinTpoD, A4043CCTLinDsc, A14344CCTLinDc2, A11476CCTLinDscL, A4047CCTLinVarW, A14346CCTLinVWor, A14347CCTLinWNor, A4408CCTSta, A13249CCVNorma, A13250CCVEspecif, A14345CCVEspe2, A11522CCVCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SY622( ) ;
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
         endLevel1SY622( ) ;
      }
      closeExtendedTableCursors1SY622( ) ;
   }

   public void deferredUpdate1SY622( )
   {
   }

   public void delete( )
   {
      beforeValidate1SY622( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SY622( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SY622( ) ;
         afterConfirm1SY622( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SY622( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SY16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
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
      sMode622 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SY622( ) ;
      Gx_mode = sMode622 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SY622( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SY17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T01SY17_A407EmprNom[0] ;
         n407EmprNom = T01SY17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         /* Using cursor T01SY18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01SY18_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01SY18_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4042CCTObs = T01SY18_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         pr_default.close(16);
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
         {
            edtCCTSta_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTSta_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTObs_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTObs_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTLin_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTLin_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTLinDsc_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTLinDsc_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTSta_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTSta_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            cmbCCTLinTpoI.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               cmbCCTLinTpoI.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            cmbCCTLinTpoD.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               cmbCCTLinTpoD.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            edtCCTLinLgoD_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               edtCCTLinLgoD_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            edtCCTLinPict_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               edtCCTLinPict_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_CCVCod)==0) )
         {
            edtCCVCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV31TestCC == 0 ) )
            {
               edtCCVCod_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
            }
            else
            {
               edtCCVCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
            }
         }
         GXt_char1 = AV35Regex ;
         GXv_char4[0] = GXt_char1 ;
         new app.controlcalidadhtd.pset_validartipocampo(remoteHandle, context).execute( A4044CCTLinTpoD, A4048CCTLinTpoI, A4045CCTLinLgoD, GXv_char4) ;
         controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
         AV35Regex = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Regex", AV35Regex);
         /* Using cursor T01SY19 */
         pr_default.execute(17, new Object[] {A396EmprCod, A11522CCVCod});
         A11526CCVPict = T01SY19_A11526CCVPict[0] ;
         n11526CCVPict = T01SY19_n11526CCVPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
         A11527CCVLgoDat = T01SY19_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T01SY19_n11527CCVLgoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
         A11528CCVTpoDat = T01SY19_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T01SY19_n11528CCVTpoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
         A11529CCVDsc = T01SY19_A11529CCVDsc[0] ;
         n11529CCVDsc = T01SY19_n11529CCVDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
         pr_default.close(17);
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
         {
            edtCCTLinDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinDsc_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
            }
            else
            {
               edtCCTLinDsc_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               cmbCCTLinTpoD.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
            }
            else
            {
               cmbCCTLinTpoD.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTLinLgoD_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinLgoD_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
            }
            else
            {
               edtCCTLinLgoD_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTLinPict_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinPict_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
            }
            else
            {
               edtCCTLinPict_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SY20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores Estandars", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01SY21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSta", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01SY22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCDef2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01SY23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel1SY622( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SY622( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidadvariable");
         if ( AnyError == 0 )
         {
            confirmValues1SY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidadvariable");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SY622( )
   {
      /* Scan By routine */
      /* Using cursor T01SY24 */
      pr_default.execute(22);
      RcdFound622 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A396EmprCod = T01SY24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SY24_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01SY24_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SY622( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound622 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A396EmprCod = T01SY24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SY24_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01SY24_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
   }

   public void scanEnd1SY622( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1SY622( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SY622( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SY622( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SY622( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SY622( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SY622( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SY622( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      cmbCCTLinTpoI.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoI.getEnabled(), 5, 0), true);
      cmbCCTLinTpoD.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
      edtCCTLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
      edtCCTLinDc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDc2_Enabled), 5, 0), true);
      edtCCVNorma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVNorma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVNorma_Enabled), 5, 0), true);
      edtCCVEspe2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVEspe2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVEspe2_Enabled), 5, 0), true);
      edtCCTLinVarW_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinVarW_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinVarW_Enabled), 5, 0), true);
      edtCCTLinVWor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinVWor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinVWor_Enabled), 5, 0), true);
      edtCCTLinWNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinWNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinWNor_Enabled), 5, 0), true);
      edtCCTLinLgoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
      edtCCTLinPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
      edtCCTSta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavTestcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTestcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTestcc_Enabled), 5, 0), true);
      edtCCVDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Enabled), 5, 0), true);
      edtCCVPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Enabled), 5, 0), true);
      edtCCVLgoDat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVLgoDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVLgoDat_Enabled), 5, 0), true);
      edtCCVTpoDat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVTpoDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVTpoDat_Enabled), 5, 0), true);
      edtCCTTpoCtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTTpoCtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTTpoCtr_Enabled), 5, 0), true);
      edtCCTObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCCVCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
      edtCCTLinDscL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDscL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDscL_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SY622( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SY0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidadvariable", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCTLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTCod,6,0))}, new String[] {"Gx_mode","CCTLin","EmprCod","CCTCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadVariable");
      forbiddenHiddens.add("CCTCod", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
      forbiddenHiddens.add("CCVEspecif", GXutil.rtrim( localUtil.format( A13250CCVEspecif, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidadvariable:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4034CCTLin", GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( Z4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4046CCTLinPict", GXutil.rtrim( Z4046CCTLinPict));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4048CCTLinTpoI", GXutil.rtrim( Z4048CCTLinTpoI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4044CCTLinTpoD", GXutil.rtrim( Z4044CCTLinTpoD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4043CCTLinDsc", GXutil.rtrim( Z4043CCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14344CCTLinDc2", GXutil.rtrim( Z14344CCTLinDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11476CCTLinDscL", Z11476CCTLinDscL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z4047CCTLinVarW", GXutil.rtrim( Z4047CCTLinVarW));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14346CCTLinVWor", GXutil.rtrim( Z14346CCTLinVWor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14347CCTLinWNor", GXutil.rtrim( Z14347CCTLinWNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4408CCTSta", GXutil.rtrim( Z4408CCTSta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13249CCVNorma", GXutil.rtrim( Z13249CCVNorma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13250CCVEspecif", GXutil.rtrim( Z13250CCVEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14345CCVEspe2", Z14345CCVEspe2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11522CCVCod", GXutil.rtrim( Z11522CCVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N11522CCVCod", GXutil.rtrim( A11522CCVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "N4408CCTSta", GXutil.rtrim( A4408CCTSta));
      app.GxWebStd.gx_hidden_field( httpContext, "N4044CCTLinTpoD", GXutil.rtrim( A4044CCTLinTpoD));
      app.GxWebStd.gx_hidden_field( httpContext, "N4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N4046CCTLinPict", GXutil.rtrim( A4046CCTLinPict));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTLIN", GXutil.ltrim( localUtil.ntoc( AV7CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV9CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CCVCOD", GXutil.rtrim( AV13Insert_CCVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vREGEX", AV35Regex);
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGCOD", AV18CCTMsgCod);
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGDSC", AV19CCTMsgDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "CCVESPECIF", GXutil.rtrim( A13250CCVEspecif));
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
      return formatLink("app.controlcalidadhtd.controlcalidadvariable", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCTLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTCod,6,0))}, new String[] {"Gx_mode","CCTLin","EmprCod","CCTCod"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidadVariable" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control Calidad Variable", "") ;
   }

   public void initializeNonKey1SY622( )
   {
      A11522CCVCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
      A4045CCTLinLgoD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      A4046CCTLinPict = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      A4048CCTLinTpoI = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      A4044CCTLinTpoD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      AV35Regex = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Regex", AV35Regex);
      A4043CCTLinDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      A4042CCTObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
      A14344CCTLinDc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14344CCTLinDc2", A14344CCTLinDc2);
      A11476CCTLinDscL = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
      A4047CCTLinVarW = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
      A14346CCTLinVWor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14346CCTLinVWor", A14346CCTLinVWor);
      A14347CCTLinWNor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14347CCTLinWNor", A14347CCTLinWNor);
      A4408CCTSta = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
      A11526CCVPict = "" ;
      n11526CCVPict = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
      A11527CCVLgoDat = (short)(0) ;
      n11527CCVLgoDat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = "" ;
      n11528CCVTpoDat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      A11529CCVDsc = "" ;
      n11529CCVDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
      A13249CCVNorma = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
      A13250CCVEspecif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13250CCVEspecif", A13250CCVEspecif);
      A14345CCVEspe2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14345CCVEspe2", A14345CCVEspe2);
      Z4045CCTLinLgoD = (short)(0) ;
      Z4046CCTLinPict = "" ;
      Z4048CCTLinTpoI = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4043CCTLinDsc = "" ;
      Z14344CCTLinDc2 = "" ;
      Z11476CCTLinDscL = "" ;
      Z4047CCTLinVarW = "" ;
      Z14346CCTLinVWor = "" ;
      Z14347CCTLinWNor = "" ;
      Z4408CCTSta = "" ;
      Z13249CCVNorma = "" ;
      Z13250CCVEspecif = "" ;
      Z14345CCVEspe2 = "" ;
      Z11522CCVCod = "" ;
   }

   public void initAll1SY622( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A4034CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      initializeNonKey1SY622( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693996", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidadvariable.js", "?20268211693996", false, true);
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
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI" );
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD" );
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCTLinDc2_Internalname = "CCTLINDC2" ;
      divTablerow2_Internalname = "TABLEROW2" ;
      edtCCVNorma_Internalname = "CCVNORMA" ;
      edtCCVEspe2_Internalname = "CCVESPE2" ;
      divTablerow3_Internalname = "TABLEROW3" ;
      edtCCTLinVarW_Internalname = "CCTLINVARW" ;
      edtCCTLinVWor_Internalname = "CCTLINVWOR" ;
      edtCCTLinWNor_Internalname = "CCTLINWNOR" ;
      divVariablesword_Internalname = "VARIABLESWORD" ;
      edtCCTLinLgoD_Internalname = "CCTLINLGOD" ;
      edtCCTLinPict_Internalname = "CCTLINPICT" ;
      edtCCTSta_Internalname = "CCTSTA" ;
      divTablerow4_Internalname = "TABLEROW4" ;
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
      edtavTestcc_Internalname = "vTESTCC" ;
      edtCCVDsc_Internalname = "CCVDSC" ;
      edtCCVPict_Internalname = "CCVPICT" ;
      edtCCVLgoDat_Internalname = "CCVLGODAT" ;
      edtCCVTpoDat_Internalname = "CCVTPODAT" ;
      edtCCTTpoCtr_Internalname = "CCTTPOCTR" ;
      edtCCTObs_Internalname = "CCTOBS" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCCVCod_Internalname = "CCVCOD" ;
      edtCCTLinDscL_Internalname = "CCTLINDSCL" ;
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
      Form.setCaption( httpContext.getMessage( "Control Calidad Variable", "") );
      edtCCTLinDscL_Enabled = 1 ;
      edtCCTLinDscL_Visible = 1 ;
      edtCCVCod_Jsonclick = "" ;
      edtCCVCod_Enabled = 1 ;
      edtCCVCod_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtCCTObs_Jsonclick = "" ;
      edtCCTObs_Enabled = 0 ;
      edtCCTObs_Visible = 1 ;
      edtCCTTpoCtr_Jsonclick = "" ;
      edtCCTTpoCtr_Enabled = 0 ;
      edtCCTTpoCtr_Visible = 1 ;
      edtCCVTpoDat_Jsonclick = "" ;
      edtCCVTpoDat_Enabled = 0 ;
      edtCCVTpoDat_Visible = 1 ;
      edtCCVLgoDat_Jsonclick = "" ;
      edtCCVLgoDat_Enabled = 0 ;
      edtCCVLgoDat_Visible = 1 ;
      edtCCVPict_Jsonclick = "" ;
      edtCCVPict_Enabled = 0 ;
      edtCCVPict_Visible = 1 ;
      edtCCVDsc_Jsonclick = "" ;
      edtCCVDsc_Enabled = 0 ;
      edtCCVDsc_Visible = 1 ;
      edtavTestcc_Jsonclick = "" ;
      edtavTestcc_Enabled = 0 ;
      edtavTestcc_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCCTSta_Jsonclick = "" ;
      edtCCTSta_Enabled = 1 ;
      edtCCTSta_Visible = 1 ;
      edtCCTLinPict_Jsonclick = "" ;
      edtCCTLinPict_Enabled = 1 ;
      edtCCTLinPict_Visible = 1 ;
      edtCCTLinLgoD_Jsonclick = "" ;
      edtCCTLinLgoD_Enabled = 1 ;
      edtCCTLinLgoD_Visible = 1 ;
      edtCCTLinWNor_Jsonclick = "" ;
      edtCCTLinWNor_Enabled = 1 ;
      edtCCTLinVWor_Jsonclick = "" ;
      edtCCTLinVWor_Enabled = 1 ;
      edtCCTLinVarW_Jsonclick = "" ;
      edtCCTLinVarW_Enabled = 1 ;
      edtCCVEspe2_Enabled = 1 ;
      edtCCVNorma_Jsonclick = "" ;
      edtCCVNorma_Enabled = 1 ;
      edtCCTLinDc2_Jsonclick = "" ;
      edtCCTLinDc2_Enabled = 1 ;
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLinDsc_Enabled = 1 ;
      edtCCTLinDsc_Visible = 1 ;
      cmbCCTLinTpoD.setJsonclick( "" );
      cmbCCTLinTpoD.setEnabled( 1 );
      cmbCCTLinTpoD.setVisible( 1 );
      cmbCCTLinTpoI.setJsonclick( "" );
      cmbCCTLinTpoI.setEnabled( 1 );
      cmbCCTLinTpoI.setVisible( 1 );
      edtCCTLin_Jsonclick = "" ;
      edtCCTLin_Enabled = 1 ;
      edtCCTLin_Visible = 1 ;
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

   public void gx21asaregex1SY622( String A4044CCTLinTpoD ,
                                   String A4048CCTLinTpoI ,
                                   short A4045CCTLinLgoD )
   {
      GXt_char1 = AV35Regex ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.pset_validartipocampo(remoteHandle, context).execute( A4044CCTLinTpoD, A4048CCTLinTpoI, A4045CCTLinLgoD, GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Regex = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Regex", AV35Regex);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( AV35Regex)+"\"") ;
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
      cmbCCTLinTpoI.setName( "CCTLINTPOI" );
      cmbCCTLinTpoI.setWebtags( "" );
      cmbCCTLinTpoI.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
      cmbCCTLinTpoI.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      }
      cmbCCTLinTpoD.setName( "CCTLINTPOD" );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
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
      A4048CCTLinTpoI = cmbCCTLinTpoI.getValue() ;
      cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
      /* Using cursor T01SY17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SY17_A407EmprNom[0] ;
      n407EmprNom = T01SY17_n407EmprNom[0] ;
      pr_default.close(15);
      /* Using cursor T01SY18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A4036CCTDsc = T01SY18_A4036CCTDsc[0] ;
      A4037CCTTpoCtr = T01SY18_A4037CCTTpoCtr[0] ;
      A4042CCTObs = T01SY18_A4042CCTObs[0] ;
      pr_default.close(16);
      if ( (GXutil.strcmp("", A4036CCTDsc)==0) )
      {
         httpContext.GX_msglist.addItem(AV19CCTMsgDsc, 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4048CCTLinTpoI = httpContext.getMessage( httpContext.getMessage( "L", ""), "") ;
         cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            A4048CCTLinTpoI = httpContext.getMessage( httpContext.getMessage( "L", ""), "") ;
            cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTSta_Enabled = 0 ;
      }
      else
      {
         edtCCTSta_Enabled = 1 ;
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTObs_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTObs_Visible = 1 ;
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLin_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLin_Visible = 1 ;
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLinDsc_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLinDsc_Visible = 1 ;
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTSta_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTSta_Visible = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoI.setVisible( 0 );
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoI.setVisible( 1 );
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoD.setVisible( 0 );
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoD.setVisible( 1 );
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinLgoD_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinLgoD_Visible = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinPict_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinPict_Visible = 1 ;
         }
      }
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
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", GXutil.rtrim( A4037CCTTpoCtr));
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", GXutil.rtrim( A4042CCTObs));
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", GXutil.rtrim( A4048CCTLinTpoI));
      cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObs_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), true);
   }

   public void valid_Ccvcod( )
   {
      A4044CCTLinTpoD = cmbCCTLinTpoD.getValue() ;
      cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      A4048CCTLinTpoI = cmbCCTLinTpoI.getValue() ;
      n11526CCVPict = false ;
      n11527CCVLgoDat = false ;
      n11528CCVTpoDat = false ;
      n11529CCVDsc = false ;
      /* Using cursor T01SY19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A11526CCVPict = T01SY19_A11526CCVPict[0] ;
      n11526CCVPict = T01SY19_n11526CCVPict[0] ;
      A11527CCVLgoDat = T01SY19_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T01SY19_n11527CCVLgoDat[0] ;
      A11528CCVTpoDat = T01SY19_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T01SY19_n11528CCVTpoDat[0] ;
      A11529CCVDsc = T01SY19_A11529CCVDsc[0] ;
      n11529CCVDsc = T01SY19_n11529CCVDsc[0] ;
      pr_default.close(17);
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4045CCTLinLgoD = (short)(1) ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            A4045CCTLinLgoD = A11527CCVLgoDat ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4046CCTLinPict = "9" ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            A4046CCTLinPict = A11526CCVPict ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4044CCTLinTpoD = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            A4044CCTLinTpoD = A11528CCVTpoDat ;
            cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
         }
      }
      GXt_char1 = AV35Regex ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.pset_validartipocampo(remoteHandle, context).execute( A4044CCTLinTpoD, A4048CCTLinTpoI, A4045CCTLinLgoD, GXv_char4) ;
      controlcalidadvariable_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Regex = GXt_char1 ;
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTLinDsc_Enabled = 0 ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinDsc_Enabled = 0 ;
         }
         else
         {
            edtCCTLinDsc_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         cmbCCTLinTpoD.setEnabled( 0 );
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
         }
         else
         {
            cmbCCTLinTpoD.setEnabled( 1 );
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinLgoD_Enabled = 0 ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinLgoD_Enabled = 0 ;
         }
         else
         {
            edtCCTLinLgoD_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinPict_Enabled = 0 ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinPict_Enabled = 0 ;
         }
         else
         {
            edtCCTLinPict_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
      {
         A4043CCTLinDsc = A11529CCVDsc ;
      }
      if ( (GXutil.strcmp("", A4043CCTLinDsc)==0) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV19CCTMsgDsc, 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCVCod_Internalname ;
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && ( GXutil.strcmp(A11522CCVCod, httpContext.getMessage( "NoAplica", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe Seleccionar una variable", ""), 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCVCod_Internalname ;
      }
      dynload_actions( ) ;
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", GXutil.rtrim( A11526CCVPict));
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", GXutil.rtrim( A11528CCVTpoDat));
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", GXutil.rtrim( A11529CCVDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", GXutil.rtrim( A4046CCTLinPict));
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", GXutil.rtrim( A4044CCTLinTpoD));
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV35Regex", AV35Regex);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV36Pgmname',fld:'vPGMNAME',pic:''},{av:'A13250CCVEspecif',fld:'CCVESPECIF',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SY2',iparms:[{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("CCTLINLGOD.ISVALID","{handler:'e131SY2',iparms:[{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'}]");
      setEventMetadata("CCTLINLGOD.ISVALID",",oparms:[{av:'AV35Regex',fld:'vREGEX',pic:''}]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[]");
      setEventMetadata("VALID_CCTCOD",",oparms:[]}");
      setEventMetadata("VALID_CCTDSC","{handler:'valid_Cctdsc',iparms:[]");
      setEventMetadata("VALID_CCTDSC",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[]");
      setEventMetadata("VALID_CCTLIN",",oparms:[]}");
      setEventMetadata("VALID_CCTLINTPOI","{handler:'valid_Cctlintpoi',iparms:[]");
      setEventMetadata("VALID_CCTLINTPOI",",oparms:[]}");
      setEventMetadata("VALID_CCTLINTPOD","{handler:'valid_Cctlintpod',iparms:[]");
      setEventMetadata("VALID_CCTLINTPOD",",oparms:[]}");
      setEventMetadata("VALID_CCTLINDSC","{handler:'valid_Cctlindsc',iparms:[]");
      setEventMetadata("VALID_CCTLINDSC",",oparms:[]}");
      setEventMetadata("VALID_CCTLINLGOD","{handler:'valid_Cctlinlgod',iparms:[]");
      setEventMetadata("VALID_CCTLINLGOD",",oparms:[]}");
      setEventMetadata("VALIDV_TESTCC","{handler:'validv_Testcc',iparms:[]");
      setEventMetadata("VALIDV_TESTCC",",oparms:[]}");
      setEventMetadata("VALID_CCTTPOCTR","{handler:'valid_Ccttpoctr',iparms:[]");
      setEventMetadata("VALID_CCTTPOCTR",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV19CCTMsgDsc',fld:'vCCTMSGDSC',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'edtCCTSta_Enabled',ctrl:'CCTSTA',prop:'Enabled'},{av:'edtCCTObs_Visible',ctrl:'CCTOBS',prop:'Visible'},{av:'edtCCTLin_Visible',ctrl:'CCTLIN',prop:'Visible'},{av:'edtCCTLinDsc_Visible',ctrl:'CCTLINDSC',prop:'Visible'},{av:'edtCCTSta_Visible',ctrl:'CCTSTA',prop:'Visible'},{av:'cmbCCTLinTpoD'},{av:'edtCCTLinLgoD_Visible',ctrl:'CCTLINLGOD',prop:'Visible'},{av:'edtCCTLinPict_Visible',ctrl:'CCTLINPICT',prop:'Visible'}]}");
      setEventMetadata("VALID_CCVCOD","{handler:'valid_Ccvcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'AV19CCTMsgDsc',fld:'vCCTMSGDSC',pic:''},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'AV35Regex',fld:'vREGEX',pic:''}]");
      setEventMetadata("VALID_CCVCOD",",oparms:[{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'AV35Regex',fld:'vREGEX',pic:''},{av:'edtCCTLinDsc_Enabled',ctrl:'CCTLINDSC',prop:'Enabled'},{av:'edtCCTLinLgoD_Enabled',ctrl:'CCTLINLGOD',prop:'Enabled'},{av:'edtCCTLinPict_Enabled',ctrl:'CCTLINPICT',prop:'Enabled'},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''}]}");
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
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV8EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4046CCTLinPict = "" ;
      Z4048CCTLinTpoI = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4043CCTLinDsc = "" ;
      Z14344CCTLinDc2 = "" ;
      Z11476CCTLinDscL = "" ;
      Z4047CCTLinVarW = "" ;
      Z14346CCTLinVWor = "" ;
      Z14347CCTLinWNor = "" ;
      Z4408CCTSta = "" ;
      Z13249CCVNorma = "" ;
      Z13250CCVEspecif = "" ;
      Z14345CCVEspe2 = "" ;
      Z11522CCVCod = "" ;
      N11522CCVCod = "" ;
      N4043CCTLinDsc = "" ;
      N4408CCTSta = "" ;
      N4044CCTLinTpoD = "" ;
      N4046CCTLinPict = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A4044CCTLinTpoD = "" ;
      A4048CCTLinTpoI = "" ;
      A396EmprCod = "" ;
      A11522CCVCod = "" ;
      Gx_mode = "" ;
      AV8EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A4036CCTDsc = "" ;
      TempTags = "" ;
      A4043CCTLinDsc = "" ;
      A14344CCTLinDc2 = "" ;
      A13249CCVNorma = "" ;
      A14345CCVEspe2 = "" ;
      A4047CCTLinVarW = "" ;
      A14346CCTLinVWor = "" ;
      A14347CCTLinWNor = "" ;
      A4046CCTLinPict = "" ;
      A4408CCTSta = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV36Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A11529CCVDsc = "" ;
      A11526CCVPict = "" ;
      A11528CCVTpoDat = "" ;
      A4037CCTTpoCtr = "" ;
      A4042CCTObs = "" ;
      A407EmprNom = "" ;
      A11476CCTLinDscL = "" ;
      A13250CCVEspecif = "" ;
      AV13Insert_CCVCod = "" ;
      AV35Regex = "" ;
      AV18CCTMsgCod = "" ;
      AV19CCTMsgDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode622 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV28Station = "" ;
      AV34AuxEmprCod = "" ;
      AV27EmprNom = "" ;
      AV29UsurCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV16CCLPicInf = "" ;
      AV17CCLPicSup = "" ;
      AV15CCLArrInf = "" ;
      AV33CCLArrSup = "" ;
      AV20CCTMsgLin = "" ;
      AV23CCTMsgVal = "" ;
      AV22CCTMsgMin = "" ;
      AV21CCTMsgMax = "" ;
      GXv_int7 = new byte[1] ;
      Z407EmprNom = "" ;
      Z4036CCTDsc = "" ;
      Z4037CCTTpoCtr = "" ;
      Z4042CCTObs = "" ;
      Z11526CCVPict = "" ;
      Z11528CCVTpoDat = "" ;
      Z11529CCVDsc = "" ;
      T01SY4_A407EmprNom = new String[] {""} ;
      T01SY4_n407EmprNom = new boolean[] {false} ;
      T01SY5_A4036CCTDsc = new String[] {""} ;
      T01SY5_A4037CCTTpoCtr = new String[] {""} ;
      T01SY5_A4042CCTObs = new String[] {""} ;
      T01SY7_A4034CCTLin = new short[1] ;
      T01SY7_A4045CCTLinLgoD = new short[1] ;
      T01SY7_A4046CCTLinPict = new String[] {""} ;
      T01SY7_A4048CCTLinTpoI = new String[] {""} ;
      T01SY7_A4044CCTLinTpoD = new String[] {""} ;
      T01SY7_A4043CCTLinDsc = new String[] {""} ;
      T01SY7_A407EmprNom = new String[] {""} ;
      T01SY7_n407EmprNom = new boolean[] {false} ;
      T01SY7_A4036CCTDsc = new String[] {""} ;
      T01SY7_A4037CCTTpoCtr = new String[] {""} ;
      T01SY7_A4042CCTObs = new String[] {""} ;
      T01SY7_A14344CCTLinDc2 = new String[] {""} ;
      T01SY7_A11476CCTLinDscL = new String[] {""} ;
      T01SY7_A4047CCTLinVarW = new String[] {""} ;
      T01SY7_A14346CCTLinVWor = new String[] {""} ;
      T01SY7_A14347CCTLinWNor = new String[] {""} ;
      T01SY7_A4408CCTSta = new String[] {""} ;
      T01SY7_A11526CCVPict = new String[] {""} ;
      T01SY7_n11526CCVPict = new boolean[] {false} ;
      T01SY7_A11527CCVLgoDat = new short[1] ;
      T01SY7_n11527CCVLgoDat = new boolean[] {false} ;
      T01SY7_A11528CCVTpoDat = new String[] {""} ;
      T01SY7_n11528CCVTpoDat = new boolean[] {false} ;
      T01SY7_A11529CCVDsc = new String[] {""} ;
      T01SY7_n11529CCVDsc = new boolean[] {false} ;
      T01SY7_A13249CCVNorma = new String[] {""} ;
      T01SY7_A13250CCVEspecif = new String[] {""} ;
      T01SY7_A14345CCVEspe2 = new String[] {""} ;
      T01SY7_A396EmprCod = new String[] {""} ;
      T01SY7_A4031CCTCod = new int[1] ;
      T01SY7_A11522CCVCod = new String[] {""} ;
      T01SY6_A11526CCVPict = new String[] {""} ;
      T01SY6_n11526CCVPict = new boolean[] {false} ;
      T01SY6_A11527CCVLgoDat = new short[1] ;
      T01SY6_n11527CCVLgoDat = new boolean[] {false} ;
      T01SY6_A11528CCVTpoDat = new String[] {""} ;
      T01SY6_n11528CCVTpoDat = new boolean[] {false} ;
      T01SY6_A11529CCVDsc = new String[] {""} ;
      T01SY6_n11529CCVDsc = new boolean[] {false} ;
      T01SY8_A407EmprNom = new String[] {""} ;
      T01SY8_n407EmprNom = new boolean[] {false} ;
      T01SY9_A4036CCTDsc = new String[] {""} ;
      T01SY9_A4037CCTTpoCtr = new String[] {""} ;
      T01SY9_A4042CCTObs = new String[] {""} ;
      T01SY10_A11526CCVPict = new String[] {""} ;
      T01SY10_n11526CCVPict = new boolean[] {false} ;
      T01SY10_A11527CCVLgoDat = new short[1] ;
      T01SY10_n11527CCVLgoDat = new boolean[] {false} ;
      T01SY10_A11528CCVTpoDat = new String[] {""} ;
      T01SY10_n11528CCVTpoDat = new boolean[] {false} ;
      T01SY10_A11529CCVDsc = new String[] {""} ;
      T01SY10_n11529CCVDsc = new boolean[] {false} ;
      T01SY11_A396EmprCod = new String[] {""} ;
      T01SY11_A4031CCTCod = new int[1] ;
      T01SY11_A4034CCTLin = new short[1] ;
      T01SY3_A4034CCTLin = new short[1] ;
      T01SY3_A4045CCTLinLgoD = new short[1] ;
      T01SY3_A4046CCTLinPict = new String[] {""} ;
      T01SY3_A4048CCTLinTpoI = new String[] {""} ;
      T01SY3_A4044CCTLinTpoD = new String[] {""} ;
      T01SY3_A4043CCTLinDsc = new String[] {""} ;
      T01SY3_A14344CCTLinDc2 = new String[] {""} ;
      T01SY3_A11476CCTLinDscL = new String[] {""} ;
      T01SY3_A4047CCTLinVarW = new String[] {""} ;
      T01SY3_A14346CCTLinVWor = new String[] {""} ;
      T01SY3_A14347CCTLinWNor = new String[] {""} ;
      T01SY3_A4408CCTSta = new String[] {""} ;
      T01SY3_A13249CCVNorma = new String[] {""} ;
      T01SY3_A13250CCVEspecif = new String[] {""} ;
      T01SY3_A14345CCVEspe2 = new String[] {""} ;
      T01SY3_A396EmprCod = new String[] {""} ;
      T01SY3_A4031CCTCod = new int[1] ;
      T01SY3_A11522CCVCod = new String[] {""} ;
      T01SY12_A396EmprCod = new String[] {""} ;
      T01SY12_A4031CCTCod = new int[1] ;
      T01SY12_A4034CCTLin = new short[1] ;
      T01SY13_A396EmprCod = new String[] {""} ;
      T01SY13_A4031CCTCod = new int[1] ;
      T01SY13_A4034CCTLin = new short[1] ;
      T01SY2_A4034CCTLin = new short[1] ;
      T01SY2_A4045CCTLinLgoD = new short[1] ;
      T01SY2_A4046CCTLinPict = new String[] {""} ;
      T01SY2_A4048CCTLinTpoI = new String[] {""} ;
      T01SY2_A4044CCTLinTpoD = new String[] {""} ;
      T01SY2_A4043CCTLinDsc = new String[] {""} ;
      T01SY2_A14344CCTLinDc2 = new String[] {""} ;
      T01SY2_A11476CCTLinDscL = new String[] {""} ;
      T01SY2_A4047CCTLinVarW = new String[] {""} ;
      T01SY2_A14346CCTLinVWor = new String[] {""} ;
      T01SY2_A14347CCTLinWNor = new String[] {""} ;
      T01SY2_A4408CCTSta = new String[] {""} ;
      T01SY2_A13249CCVNorma = new String[] {""} ;
      T01SY2_A13250CCVEspecif = new String[] {""} ;
      T01SY2_A14345CCVEspe2 = new String[] {""} ;
      T01SY2_A396EmprCod = new String[] {""} ;
      T01SY2_A4031CCTCod = new int[1] ;
      T01SY2_A11522CCVCod = new String[] {""} ;
      T01SY17_A407EmprNom = new String[] {""} ;
      T01SY17_n407EmprNom = new boolean[] {false} ;
      T01SY18_A4036CCTDsc = new String[] {""} ;
      T01SY18_A4037CCTTpoCtr = new String[] {""} ;
      T01SY18_A4042CCTObs = new String[] {""} ;
      T01SY19_A11526CCVPict = new String[] {""} ;
      T01SY19_n11526CCVPict = new boolean[] {false} ;
      T01SY19_A11527CCVLgoDat = new short[1] ;
      T01SY19_n11527CCVLgoDat = new boolean[] {false} ;
      T01SY19_A11528CCVTpoDat = new String[] {""} ;
      T01SY19_n11528CCVTpoDat = new boolean[] {false} ;
      T01SY19_A11529CCVDsc = new String[] {""} ;
      T01SY19_n11529CCVDsc = new boolean[] {false} ;
      T01SY20_A396EmprCod = new String[] {""} ;
      T01SY20_A252CliCod = new int[1] ;
      T01SY20_A9713Tb1_Cod = new short[1] ;
      T01SY20_A11736CCArtCod = new String[] {""} ;
      T01SY20_A11748TipArtiId = new short[1] ;
      T01SY20_A11737CCColNom = new String[] {""} ;
      T01SY20_A11738CCColNum = new int[1] ;
      T01SY20_A11749CCCTc = new byte[1] ;
      T01SY20_A11750IntId = new short[1] ;
      T01SY20_A4031CCTCod = new int[1] ;
      T01SY20_A4034CCTLin = new short[1] ;
      T01SY21_A396EmprCod = new String[] {""} ;
      T01SY21_A252CliCod = new int[1] ;
      T01SY21_A65ArtCod = new String[] {""} ;
      T01SY21_A4058CCFColNom = new String[] {""} ;
      T01SY21_A4059CCFColNum = new int[1] ;
      T01SY21_A4031CCTCod = new int[1] ;
      T01SY21_A4034CCTLin = new short[1] ;
      T01SY22_A396EmprCod = new String[] {""} ;
      T01SY22_A4031CCTCod = new int[1] ;
      T01SY22_A4034CCTLin = new short[1] ;
      T01SY22_A4049CCTValLin = new byte[1] ;
      T01SY23_A396EmprCod = new String[] {""} ;
      T01SY23_A129BarCod = new int[1] ;
      T01SY23_A132BarCodReo = new byte[1] ;
      T01SY23_A130BarCodPar = new String[] {""} ;
      T01SY23_A758ProCod = new String[] {""} ;
      T01SY23_A194BarOrdLin = new short[1] ;
      T01SY23_A4031CCTCod = new int[1] ;
      T01SY23_A4034CCTLin = new short[1] ;
      T01SY24_A396EmprCod = new String[] {""} ;
      T01SY24_A4031CCTCod = new int[1] ;
      T01SY24_A4034CCTLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      ZV35Regex = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable__default(),
         new Object[] {
             new Object[] {
            T01SY2_A4034CCTLin, T01SY2_A4045CCTLinLgoD, T01SY2_A4046CCTLinPict, T01SY2_A4048CCTLinTpoI, T01SY2_A4044CCTLinTpoD, T01SY2_A4043CCTLinDsc, T01SY2_A14344CCTLinDc2, T01SY2_A11476CCTLinDscL, T01SY2_A4047CCTLinVarW, T01SY2_A14346CCTLinVWor,
            T01SY2_A14347CCTLinWNor, T01SY2_A4408CCTSta, T01SY2_A13249CCVNorma, T01SY2_A13250CCVEspecif, T01SY2_A14345CCVEspe2, T01SY2_A396EmprCod, T01SY2_A4031CCTCod, T01SY2_A11522CCVCod
            }
            , new Object[] {
            T01SY3_A4034CCTLin, T01SY3_A4045CCTLinLgoD, T01SY3_A4046CCTLinPict, T01SY3_A4048CCTLinTpoI, T01SY3_A4044CCTLinTpoD, T01SY3_A4043CCTLinDsc, T01SY3_A14344CCTLinDc2, T01SY3_A11476CCTLinDscL, T01SY3_A4047CCTLinVarW, T01SY3_A14346CCTLinVWor,
            T01SY3_A14347CCTLinWNor, T01SY3_A4408CCTSta, T01SY3_A13249CCVNorma, T01SY3_A13250CCVEspecif, T01SY3_A14345CCVEspe2, T01SY3_A396EmprCod, T01SY3_A4031CCTCod, T01SY3_A11522CCVCod
            }
            , new Object[] {
            T01SY4_A407EmprNom, T01SY4_n407EmprNom
            }
            , new Object[] {
            T01SY5_A4036CCTDsc, T01SY5_A4037CCTTpoCtr, T01SY5_A4042CCTObs
            }
            , new Object[] {
            T01SY6_A11526CCVPict, T01SY6_n11526CCVPict, T01SY6_A11527CCVLgoDat, T01SY6_n11527CCVLgoDat, T01SY6_A11528CCVTpoDat, T01SY6_n11528CCVTpoDat, T01SY6_A11529CCVDsc, T01SY6_n11529CCVDsc
            }
            , new Object[] {
            T01SY7_A4034CCTLin, T01SY7_A4045CCTLinLgoD, T01SY7_A4046CCTLinPict, T01SY7_A4048CCTLinTpoI, T01SY7_A4044CCTLinTpoD, T01SY7_A4043CCTLinDsc, T01SY7_A407EmprNom, T01SY7_n407EmprNom, T01SY7_A4036CCTDsc, T01SY7_A4037CCTTpoCtr,
            T01SY7_A4042CCTObs, T01SY7_A14344CCTLinDc2, T01SY7_A11476CCTLinDscL, T01SY7_A4047CCTLinVarW, T01SY7_A14346CCTLinVWor, T01SY7_A14347CCTLinWNor, T01SY7_A4408CCTSta, T01SY7_A11526CCVPict, T01SY7_n11526CCVPict, T01SY7_A11527CCVLgoDat,
            T01SY7_n11527CCVLgoDat, T01SY7_A11528CCVTpoDat, T01SY7_n11528CCVTpoDat, T01SY7_A11529CCVDsc, T01SY7_n11529CCVDsc, T01SY7_A13249CCVNorma, T01SY7_A13250CCVEspecif, T01SY7_A14345CCVEspe2, T01SY7_A396EmprCod, T01SY7_A4031CCTCod,
            T01SY7_A11522CCVCod
            }
            , new Object[] {
            T01SY8_A407EmprNom, T01SY8_n407EmprNom
            }
            , new Object[] {
            T01SY9_A4036CCTDsc, T01SY9_A4037CCTTpoCtr, T01SY9_A4042CCTObs
            }
            , new Object[] {
            T01SY10_A11526CCVPict, T01SY10_n11526CCVPict, T01SY10_A11527CCVLgoDat, T01SY10_n11527CCVLgoDat, T01SY10_A11528CCVTpoDat, T01SY10_n11528CCVTpoDat, T01SY10_A11529CCVDsc, T01SY10_n11529CCVDsc
            }
            , new Object[] {
            T01SY11_A396EmprCod, T01SY11_A4031CCTCod, T01SY11_A4034CCTLin
            }
            , new Object[] {
            T01SY12_A396EmprCod, T01SY12_A4031CCTCod, T01SY12_A4034CCTLin
            }
            , new Object[] {
            T01SY13_A396EmprCod, T01SY13_A4031CCTCod, T01SY13_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SY17_A407EmprNom, T01SY17_n407EmprNom
            }
            , new Object[] {
            T01SY18_A4036CCTDsc, T01SY18_A4037CCTTpoCtr, T01SY18_A4042CCTObs
            }
            , new Object[] {
            T01SY19_A11526CCVPict, T01SY19_n11526CCVPict, T01SY19_A11527CCVLgoDat, T01SY19_n11527CCVLgoDat, T01SY19_A11528CCVTpoDat, T01SY19_n11528CCVTpoDat, T01SY19_A11529CCVDsc, T01SY19_n11529CCVDsc
            }
            , new Object[] {
            T01SY20_A396EmprCod, T01SY20_A252CliCod, T01SY20_A9713Tb1_Cod, T01SY20_A11736CCArtCod, T01SY20_A11748TipArtiId, T01SY20_A11737CCColNom, T01SY20_A11738CCColNum, T01SY20_A11749CCCTc, T01SY20_A11750IntId, T01SY20_A4031CCTCod,
            T01SY20_A4034CCTLin
            }
            , new Object[] {
            T01SY21_A396EmprCod, T01SY21_A252CliCod, T01SY21_A65ArtCod, T01SY21_A4058CCFColNom, T01SY21_A4059CCFColNum, T01SY21_A4031CCTCod, T01SY21_A4034CCTLin
            }
            , new Object[] {
            T01SY22_A396EmprCod, T01SY22_A4031CCTCod, T01SY22_A4034CCTLin, T01SY22_A4049CCTValLin
            }
            , new Object[] {
            T01SY23_A396EmprCod, T01SY23_A129BarCod, T01SY23_A132BarCodReo, T01SY23_A130BarCodPar, T01SY23_A758ProCod, T01SY23_A194BarOrdLin, T01SY23_A4031CCTCod, T01SY23_A4034CCTLin
            }
            , new Object[] {
            T01SY24_A396EmprCod, T01SY24_A4031CCTCod, T01SY24_A4034CCTLin
            }
         }
      );
      AV36Pgmname = "ControlCalidadHTD.ControlCalidadVariable" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV7CCTLin ;
   private short Z4034CCTLin ;
   private short Z4045CCTLinLgoD ;
   private short N4045CCTLinLgoD ;
   private short A4045CCTLinLgoD ;
   private short AV7CCTLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4034CCTLin ;
   private short AV31TestCC ;
   private short A11527CCVLgoDat ;
   private short RcdFound622 ;
   private short Z11527CCVLgoDat ;
   private short nIsDirty_622 ;
   private int wcpOAV9CCTCod ;
   private int Z4031CCTCod ;
   private int A4031CCTCod ;
   private int AV9CCTCod ;
   private int trnEnded ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtCCTLin_Visible ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLinDsc_Visible ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCTLinDc2_Enabled ;
   private int edtCCVNorma_Enabled ;
   private int edtCCVEspe2_Enabled ;
   private int edtCCTLinVarW_Enabled ;
   private int edtCCTLinVWor_Enabled ;
   private int edtCCTLinWNor_Enabled ;
   private int edtCCTLinLgoD_Visible ;
   private int edtCCTLinLgoD_Enabled ;
   private int edtCCTLinPict_Visible ;
   private int edtCCTLinPict_Enabled ;
   private int edtCCTSta_Visible ;
   private int edtCCTSta_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavTestcc_Enabled ;
   private int edtavTestcc_Visible ;
   private int edtCCVDsc_Visible ;
   private int edtCCVDsc_Enabled ;
   private int edtCCVPict_Visible ;
   private int edtCCVPict_Enabled ;
   private int edtCCVLgoDat_Enabled ;
   private int edtCCVLgoDat_Visible ;
   private int edtCCVTpoDat_Visible ;
   private int edtCCVTpoDat_Enabled ;
   private int edtCCTTpoCtr_Visible ;
   private int edtCCTTpoCtr_Enabled ;
   private int edtCCTObs_Visible ;
   private int edtCCTObs_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtCCVCod_Visible ;
   private int edtCCVCod_Enabled ;
   private int edtCCTLinDscL_Visible ;
   private int edtCCTLinDscL_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int AV37GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV8EmprCod ;
   private String Z396EmprCod ;
   private String Z4046CCTLinPict ;
   private String Z4048CCTLinTpoI ;
   private String Z4044CCTLinTpoD ;
   private String Z4043CCTLinDsc ;
   private String Z14344CCTLinDc2 ;
   private String Z4047CCTLinVarW ;
   private String Z14346CCTLinVWor ;
   private String Z14347CCTLinWNor ;
   private String Z4408CCTSta ;
   private String Z13249CCVNorma ;
   private String Z13250CCVEspecif ;
   private String Z11522CCVCod ;
   private String N11522CCVCod ;
   private String N4043CCTLinDsc ;
   private String N4408CCTSta ;
   private String N4044CCTLinTpoD ;
   private String N4046CCTLinPict ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A4044CCTLinTpoD ;
   private String A4048CCTLinTpoI ;
   private String A396EmprCod ;
   private String A11522CCVCod ;
   private String Gx_mode ;
   private String AV8EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCTLin_Internalname ;
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
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtCCTLin_Jsonclick ;
   private String divTablerow2_Internalname ;
   private String edtCCTLinDsc_Internalname ;
   private String A4043CCTLinDsc ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCTLinDc2_Internalname ;
   private String A14344CCTLinDc2 ;
   private String edtCCTLinDc2_Jsonclick ;
   private String divTablerow3_Internalname ;
   private String edtCCVNorma_Internalname ;
   private String A13249CCVNorma ;
   private String edtCCVNorma_Jsonclick ;
   private String edtCCVEspe2_Internalname ;
   private String divVariablesword_Internalname ;
   private String edtCCTLinVarW_Internalname ;
   private String A4047CCTLinVarW ;
   private String edtCCTLinVarW_Jsonclick ;
   private String edtCCTLinVWor_Internalname ;
   private String A14346CCTLinVWor ;
   private String edtCCTLinVWor_Jsonclick ;
   private String edtCCTLinWNor_Internalname ;
   private String A14347CCTLinWNor ;
   private String edtCCTLinWNor_Jsonclick ;
   private String divTablerow4_Internalname ;
   private String edtCCTLinLgoD_Internalname ;
   private String edtCCTLinLgoD_Jsonclick ;
   private String edtCCTLinPict_Internalname ;
   private String A4046CCTLinPict ;
   private String edtCCTLinPict_Jsonclick ;
   private String edtCCTSta_Internalname ;
   private String A4408CCTSta ;
   private String edtCCTSta_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV36Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavTestcc_Internalname ;
   private String edtavTestcc_Jsonclick ;
   private String edtCCVDsc_Internalname ;
   private String A11529CCVDsc ;
   private String edtCCVDsc_Jsonclick ;
   private String edtCCVPict_Internalname ;
   private String A11526CCVPict ;
   private String edtCCVPict_Jsonclick ;
   private String edtCCVLgoDat_Internalname ;
   private String edtCCVLgoDat_Jsonclick ;
   private String edtCCVTpoDat_Internalname ;
   private String A11528CCVTpoDat ;
   private String edtCCVTpoDat_Jsonclick ;
   private String edtCCTTpoCtr_Internalname ;
   private String A4037CCTTpoCtr ;
   private String edtCCTTpoCtr_Jsonclick ;
   private String edtCCTObs_Internalname ;
   private String A4042CCTObs ;
   private String edtCCTObs_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCCVCod_Internalname ;
   private String edtCCVCod_Jsonclick ;
   private String edtCCTLinDscL_Internalname ;
   private String A13250CCVEspecif ;
   private String AV13Insert_CCVCod ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode622 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV28Station ;
   private String AV34AuxEmprCod ;
   private String AV27EmprNom ;
   private String AV29UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z4036CCTDsc ;
   private String Z4037CCTTpoCtr ;
   private String Z4042CCTObs ;
   private String Z11526CCVPict ;
   private String Z11528CCVTpoDat ;
   private String Z11529CCVDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n11529CCVDsc ;
   private boolean n11526CCVPict ;
   private boolean n11527CCVLgoDat ;
   private boolean n11528CCVTpoDat ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z11476CCTLinDscL ;
   private String Z14345CCVEspe2 ;
   private String A14345CCVEspe2 ;
   private String A11476CCTLinDscL ;
   private String AV35Regex ;
   private String AV18CCTMsgCod ;
   private String AV19CCTMsgDsc ;
   private String AV16CCLPicInf ;
   private String AV17CCLPicSup ;
   private String AV15CCLArrInf ;
   private String AV33CCLArrSup ;
   private String AV20CCTMsgLin ;
   private String AV23CCTMsgVal ;
   private String AV22CCTMsgMin ;
   private String AV21CCTMsgMax ;
   private String ZV35Regex ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCCTLinTpoI ;
   private HTMLChoice cmbCCTLinTpoD ;
   private IDataStoreProvider pr_default ;
   private String[] T01SY4_A407EmprNom ;
   private boolean[] T01SY4_n407EmprNom ;
   private String[] T01SY5_A4036CCTDsc ;
   private String[] T01SY5_A4037CCTTpoCtr ;
   private String[] T01SY5_A4042CCTObs ;
   private short[] T01SY7_A4034CCTLin ;
   private short[] T01SY7_A4045CCTLinLgoD ;
   private String[] T01SY7_A4046CCTLinPict ;
   private String[] T01SY7_A4048CCTLinTpoI ;
   private String[] T01SY7_A4044CCTLinTpoD ;
   private String[] T01SY7_A4043CCTLinDsc ;
   private String[] T01SY7_A407EmprNom ;
   private boolean[] T01SY7_n407EmprNom ;
   private String[] T01SY7_A4036CCTDsc ;
   private String[] T01SY7_A4037CCTTpoCtr ;
   private String[] T01SY7_A4042CCTObs ;
   private String[] T01SY7_A14344CCTLinDc2 ;
   private String[] T01SY7_A11476CCTLinDscL ;
   private String[] T01SY7_A4047CCTLinVarW ;
   private String[] T01SY7_A14346CCTLinVWor ;
   private String[] T01SY7_A14347CCTLinWNor ;
   private String[] T01SY7_A4408CCTSta ;
   private String[] T01SY7_A11526CCVPict ;
   private boolean[] T01SY7_n11526CCVPict ;
   private short[] T01SY7_A11527CCVLgoDat ;
   private boolean[] T01SY7_n11527CCVLgoDat ;
   private String[] T01SY7_A11528CCVTpoDat ;
   private boolean[] T01SY7_n11528CCVTpoDat ;
   private String[] T01SY7_A11529CCVDsc ;
   private boolean[] T01SY7_n11529CCVDsc ;
   private String[] T01SY7_A13249CCVNorma ;
   private String[] T01SY7_A13250CCVEspecif ;
   private String[] T01SY7_A14345CCVEspe2 ;
   private String[] T01SY7_A396EmprCod ;
   private int[] T01SY7_A4031CCTCod ;
   private String[] T01SY7_A11522CCVCod ;
   private String[] T01SY6_A11526CCVPict ;
   private boolean[] T01SY6_n11526CCVPict ;
   private short[] T01SY6_A11527CCVLgoDat ;
   private boolean[] T01SY6_n11527CCVLgoDat ;
   private String[] T01SY6_A11528CCVTpoDat ;
   private boolean[] T01SY6_n11528CCVTpoDat ;
   private String[] T01SY6_A11529CCVDsc ;
   private boolean[] T01SY6_n11529CCVDsc ;
   private String[] T01SY8_A407EmprNom ;
   private boolean[] T01SY8_n407EmprNom ;
   private String[] T01SY9_A4036CCTDsc ;
   private String[] T01SY9_A4037CCTTpoCtr ;
   private String[] T01SY9_A4042CCTObs ;
   private String[] T01SY10_A11526CCVPict ;
   private boolean[] T01SY10_n11526CCVPict ;
   private short[] T01SY10_A11527CCVLgoDat ;
   private boolean[] T01SY10_n11527CCVLgoDat ;
   private String[] T01SY10_A11528CCVTpoDat ;
   private boolean[] T01SY10_n11528CCVTpoDat ;
   private String[] T01SY10_A11529CCVDsc ;
   private boolean[] T01SY10_n11529CCVDsc ;
   private String[] T01SY11_A396EmprCod ;
   private int[] T01SY11_A4031CCTCod ;
   private short[] T01SY11_A4034CCTLin ;
   private short[] T01SY3_A4034CCTLin ;
   private short[] T01SY3_A4045CCTLinLgoD ;
   private String[] T01SY3_A4046CCTLinPict ;
   private String[] T01SY3_A4048CCTLinTpoI ;
   private String[] T01SY3_A4044CCTLinTpoD ;
   private String[] T01SY3_A4043CCTLinDsc ;
   private String[] T01SY3_A14344CCTLinDc2 ;
   private String[] T01SY3_A11476CCTLinDscL ;
   private String[] T01SY3_A4047CCTLinVarW ;
   private String[] T01SY3_A14346CCTLinVWor ;
   private String[] T01SY3_A14347CCTLinWNor ;
   private String[] T01SY3_A4408CCTSta ;
   private String[] T01SY3_A13249CCVNorma ;
   private String[] T01SY3_A13250CCVEspecif ;
   private String[] T01SY3_A14345CCVEspe2 ;
   private String[] T01SY3_A396EmprCod ;
   private int[] T01SY3_A4031CCTCod ;
   private String[] T01SY3_A11522CCVCod ;
   private String[] T01SY12_A396EmprCod ;
   private int[] T01SY12_A4031CCTCod ;
   private short[] T01SY12_A4034CCTLin ;
   private String[] T01SY13_A396EmprCod ;
   private int[] T01SY13_A4031CCTCod ;
   private short[] T01SY13_A4034CCTLin ;
   private short[] T01SY2_A4034CCTLin ;
   private short[] T01SY2_A4045CCTLinLgoD ;
   private String[] T01SY2_A4046CCTLinPict ;
   private String[] T01SY2_A4048CCTLinTpoI ;
   private String[] T01SY2_A4044CCTLinTpoD ;
   private String[] T01SY2_A4043CCTLinDsc ;
   private String[] T01SY2_A14344CCTLinDc2 ;
   private String[] T01SY2_A11476CCTLinDscL ;
   private String[] T01SY2_A4047CCTLinVarW ;
   private String[] T01SY2_A14346CCTLinVWor ;
   private String[] T01SY2_A14347CCTLinWNor ;
   private String[] T01SY2_A4408CCTSta ;
   private String[] T01SY2_A13249CCVNorma ;
   private String[] T01SY2_A13250CCVEspecif ;
   private String[] T01SY2_A14345CCVEspe2 ;
   private String[] T01SY2_A396EmprCod ;
   private int[] T01SY2_A4031CCTCod ;
   private String[] T01SY2_A11522CCVCod ;
   private String[] T01SY17_A407EmprNom ;
   private boolean[] T01SY17_n407EmprNom ;
   private String[] T01SY18_A4036CCTDsc ;
   private String[] T01SY18_A4037CCTTpoCtr ;
   private String[] T01SY18_A4042CCTObs ;
   private String[] T01SY19_A11526CCVPict ;
   private boolean[] T01SY19_n11526CCVPict ;
   private short[] T01SY19_A11527CCVLgoDat ;
   private boolean[] T01SY19_n11527CCVLgoDat ;
   private String[] T01SY19_A11528CCVTpoDat ;
   private boolean[] T01SY19_n11528CCVTpoDat ;
   private String[] T01SY19_A11529CCVDsc ;
   private boolean[] T01SY19_n11529CCVDsc ;
   private String[] T01SY20_A396EmprCod ;
   private int[] T01SY20_A252CliCod ;
   private short[] T01SY20_A9713Tb1_Cod ;
   private String[] T01SY20_A11736CCArtCod ;
   private short[] T01SY20_A11748TipArtiId ;
   private String[] T01SY20_A11737CCColNom ;
   private int[] T01SY20_A11738CCColNum ;
   private byte[] T01SY20_A11749CCCTc ;
   private short[] T01SY20_A11750IntId ;
   private int[] T01SY20_A4031CCTCod ;
   private short[] T01SY20_A4034CCTLin ;
   private String[] T01SY21_A396EmprCod ;
   private int[] T01SY21_A252CliCod ;
   private String[] T01SY21_A65ArtCod ;
   private String[] T01SY21_A4058CCFColNom ;
   private int[] T01SY21_A4059CCFColNum ;
   private int[] T01SY21_A4031CCTCod ;
   private short[] T01SY21_A4034CCTLin ;
   private String[] T01SY22_A396EmprCod ;
   private int[] T01SY22_A4031CCTCod ;
   private short[] T01SY22_A4034CCTLin ;
   private byte[] T01SY22_A4049CCTValLin ;
   private String[] T01SY23_A396EmprCod ;
   private int[] T01SY23_A129BarCod ;
   private byte[] T01SY23_A132BarCodReo ;
   private String[] T01SY23_A130BarCodPar ;
   private String[] T01SY23_A758ProCod ;
   private short[] T01SY23_A194BarOrdLin ;
   private int[] T01SY23_A4031CCTCod ;
   private short[] T01SY23_A4034CCTLin ;
   private String[] T01SY24_A396EmprCod ;
   private int[] T01SY24_A4031CCTCod ;
   private short[] T01SY24_A4034CCTLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class controlcalidadvariable__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadvariable__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SY2", "SELECT CCTLin, CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinDc2, CCTLinDscL, CCTLinVarW, CCTLinVWor, CCTLinWNor, CCTSta, CCVNorma, CCVEspecif, CCVEspe2, EmprCod, CCTCod, CCVCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinDc2, CCTLinDscL, CCTLinVarW, CCTLinVWor, CCTLinWNor, CCTSta, CCVNorma, CCVEspecif, CCVEspe2, CCVCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY3", "SELECT CCTLin, CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinDc2, CCTLinDscL, CCTLinVarW, CCTLinVWor, CCTLinWNor, CCTSta, CCVNorma, CCVEspecif, CCVEspe2, EmprCod, CCTCod, CCVCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY5", "SELECT CCTDsc, CCTTpoCtr, CCTObs FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY6", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY7", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCTLin, TM1.CCTLinLgoD, TM1.CCTLinPict, TM1.CCTLinTpoI, TM1.CCTLinTpoD, TM1.CCTLinDsc, T2.EmprNom, T3.CCTDsc, T3.CCTTpoCtr, T3.CCTObs, TM1.CCTLinDc2, TM1.CCTLinDscL, TM1.CCTLinVarW, TM1.CCTLinVWor, TM1.CCTLinWNor, TM1.CCTSta, T4.CCVPict, T4.CCVLgoDat, T4.CCVTpoDat, T4.CCVDsc, TM1.CCVNorma, TM1.CCVEspecif, TM1.CCVEspe2, TM1.EmprCod, TM1.CCTCod, TM1.CCVCod FROM (((TXPCCDef1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = TM1.EmprCod AND T3.CCTCod = TM1.CCTCod) INNER JOIN TXPCCVar T4 ON T4.EmprCod = TM1.EmprCod AND T4.CCVCod = TM1.CCVCod) WHERE TM1.EmprCod = ? and TM1.CCTCod = ? and TM1.CCTLin = ? ORDER BY TM1.EmprCod, TM1.CCTCod, TM1.CCTLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY9", "SELECT CCTDsc, CCTTpoCtr, CCTObs FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY10", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE ( EmprCod > ? or EmprCod = ? and CCTCod > ? or CCTCod = ? and EmprCod = ? and CCTLin > ?) ORDER BY EmprCod, CCTCod, CCTLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SY13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE ( EmprCod < ? or EmprCod = ? and CCTCod < ? or CCTCod = ? and EmprCod = ? and CCTLin < ?) ORDER BY EmprCod DESC, CCTCod DESC, CCTLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SY14", "INSERT INTO TXPCCDef1(CCTLin, CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinDc2, CCTLinDscL, CCTLinVarW, CCTLinVWor, CCTLinWNor, CCTSta, CCVNorma, CCVEspecif, CCVEspe2, EmprCod, CCTCod, CCVCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDef1")
         ,new UpdateCursor("T01SY15", "UPDATE TXPCCDef1 SET CCTLinLgoD=?, CCTLinPict=?, CCTLinTpoI=?, CCTLinTpoD=?, CCTLinDsc=?, CCTLinDc2=?, CCTLinDscL=?, CCTLinVarW=?, CCTLinVWor=?, CCTLinWNor=?, CCTSta=?, CCVNorma=?, CCVEspecif=?, CCVEspe2=?, CCVCod=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCDef1")
         ,new UpdateCursor("T01SY16", "DELETE FROM TXPCCDef1  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCDef1")
         ,new ForEachCursor("T01SY17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY18", "SELECT CCTDsc, CCTTpoCtr, CCTObs FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY19", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SY20", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin FROM TXPCCCNOS WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SY21", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SY22", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SY23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SY24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 ORDER BY EmprCod, CCTCod, CCTLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 32);
               ((String[]) buf[9])[0] = rslt.getString(10, 32);
               ((String[]) buf[10])[0] = rslt.getString(11, 32);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 32);
               ((String[]) buf[9])[0] = rslt.getString(10, 32);
               ((String[]) buf[10])[0] = rslt.getString(11, 32);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 60);
               ((String[]) buf[12])[0] = rslt.getVarchar(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 32);
               ((String[]) buf[14])[0] = rslt.getString(14, 32);
               ((String[]) buf[15])[0] = rslt.getString(15, 32);
               ((String[]) buf[16])[0] = rslt.getString(16, 40);
               ((String[]) buf[17])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(21, 30);
               ((String[]) buf[26])[0] = rslt.getString(22, 30);
               ((String[]) buf[27])[0] = rslt.getVarchar(23);
               ((String[]) buf[28])[0] = rslt.getString(24, 3);
               ((int[]) buf[29])[0] = rslt.getInt(25);
               ((String[]) buf[30])[0] = rslt.getString(26, 10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 30);
               stmt.setString(7, (String)parms[6], 60);
               stmt.setVarchar(8, (String)parms[7], 2048, false);
               stmt.setString(9, (String)parms[8], 32);
               stmt.setString(10, (String)parms[9], 32);
               stmt.setString(11, (String)parms[10], 32);
               stmt.setString(12, (String)parms[11], 40);
               stmt.setString(13, (String)parms[12], 30);
               stmt.setString(14, (String)parms[13], 30);
               stmt.setVarchar(15, (String)parms[14], 300, false);
               stmt.setString(16, (String)parms[15], 3);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 10);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 60);
               stmt.setVarchar(7, (String)parms[6], 2048, false);
               stmt.setString(8, (String)parms[7], 32);
               stmt.setString(9, (String)parms[8], 32);
               stmt.setString(10, (String)parms[9], 32);
               stmt.setString(11, (String)parms[10], 40);
               stmt.setString(12, (String)parms[11], 30);
               stmt.setString(13, (String)parms[12], 30);
               stmt.setVarchar(14, (String)parms[13], 300, false);
               stmt.setString(15, (String)parms[14], 10);
               stmt.setString(16, (String)parms[15], 3);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

