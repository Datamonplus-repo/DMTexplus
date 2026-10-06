package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tforpag_impl extends GXDataArea
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
            AV27EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
            AV32FpgCod = httpContext.GetPar( "FpgCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32FpgCod", AV32FpgCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFPGCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32FpgCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Formas de Pago", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFpgCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tforpag_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tforpag_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforpag_impl.class ));
   }

   public tforpag_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFpgCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFpgCod_Internalname, httpContext.getMessage( "Forma de Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFpgCod_Internalname, GXutil.rtrim( A497FpgCod), GXutil.rtrim( localUtil.format( A497FpgCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFpgCod_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TFORPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFpgDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFpgDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFpgDsc_Internalname, GXutil.rtrim( A498FpgDsc), GXutil.rtrim( localUtil.format( A498FpgDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFpgDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TFORPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfpgtip_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfpgtip_Internalname, httpContext.getMessage( "Tipo Forma Pago", ""), "", "", lblTextblockfpgtip_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\TFORPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_fpgtip.setProperty("Caption", Combo_fpgtip_Caption);
      ucCombo_fpgtip.setProperty("Cls", Combo_fpgtip_Cls);
      ucCombo_fpgtip.setProperty("DataListType", Combo_fpgtip_Datalisttype);
      ucCombo_fpgtip.setProperty("DataListFixedValues", Combo_fpgtip_Datalistfixedvalues);
      ucCombo_fpgtip.setProperty("EmptyItem", Combo_fpgtip_Emptyitem);
      ucCombo_fpgtip.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
      ucCombo_fpgtip.setProperty("DropDownOptionsData", AV33FpgTip_Data);
      ucCombo_fpgtip.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fpgtip_Internalname, "COMBO_FPGTIPContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFpgTip_Internalname, httpContext.getMessage( "Tipo Forma Pago", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFpgTip_Internalname, GXutil.rtrim( A955FpgTip), GXutil.rtrim( localUtil.format( A955FpgTip, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgTip_Jsonclick, 0, "Attribute", "", "", "", "", edtFpgTip_Visible, edtFpgTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TFORPAG.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TFORPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TFORPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TFORPAG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV38Pgmname), GXutil.rtrim( localUtil.format( AV38Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TFORPAG.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_fpgtip_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofpgtip_Internalname, GXutil.rtrim( AV36ComboFpgTip), GXutil.rtrim( localUtil.format( AV36ComboFpgTip, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofpgtip_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofpgtip_Visible, edtavCombofpgtip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TFORPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFpgDscID_Internalname, A13811FpgDscID, GXutil.rtrim( localUtil.format( A13811FpgDscID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgDscID_Jsonclick, 0, "Attribute", "", "", "", "", edtFpgDscID_Visible, edtFpgDscID_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TFORPAG.htm");
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
      e11132 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV34DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFPGTIP_DATA"), AV33FpgTip_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z497FpgCod = httpContext.cgiGet( "Z497FpgCod") ;
            Z955FpgTip = httpContext.cgiGet( "Z955FpgTip") ;
            Z498FpgDsc = httpContext.cgiGet( "Z498FpgDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV27EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV32FpgCod = httpContext.cgiGet( "vFPGCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Combo_fpgtip_Objectcall = httpContext.cgiGet( "COMBO_FPGTIP_Objectcall") ;
            Combo_fpgtip_Class = httpContext.cgiGet( "COMBO_FPGTIP_Class") ;
            Combo_fpgtip_Icontype = httpContext.cgiGet( "COMBO_FPGTIP_Icontype") ;
            Combo_fpgtip_Icon = httpContext.cgiGet( "COMBO_FPGTIP_Icon") ;
            Combo_fpgtip_Caption = httpContext.cgiGet( "COMBO_FPGTIP_Caption") ;
            Combo_fpgtip_Tooltip = httpContext.cgiGet( "COMBO_FPGTIP_Tooltip") ;
            Combo_fpgtip_Cls = httpContext.cgiGet( "COMBO_FPGTIP_Cls") ;
            Combo_fpgtip_Selectedvalue_set = httpContext.cgiGet( "COMBO_FPGTIP_Selectedvalue_set") ;
            Combo_fpgtip_Selectedvalue_get = httpContext.cgiGet( "COMBO_FPGTIP_Selectedvalue_get") ;
            Combo_fpgtip_Selectedtext_set = httpContext.cgiGet( "COMBO_FPGTIP_Selectedtext_set") ;
            Combo_fpgtip_Selectedtext_get = httpContext.cgiGet( "COMBO_FPGTIP_Selectedtext_get") ;
            Combo_fpgtip_Gamoauthtoken = httpContext.cgiGet( "COMBO_FPGTIP_Gamoauthtoken") ;
            Combo_fpgtip_Ddointernalname = httpContext.cgiGet( "COMBO_FPGTIP_Ddointernalname") ;
            Combo_fpgtip_Titlecontrolalign = httpContext.cgiGet( "COMBO_FPGTIP_Titlecontrolalign") ;
            Combo_fpgtip_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FPGTIP_Dropdownoptionstype") ;
            Combo_fpgtip_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Enabled")) ;
            Combo_fpgtip_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Visible")) ;
            Combo_fpgtip_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FPGTIP_Titlecontrolidtoreplace") ;
            Combo_fpgtip_Datalisttype = httpContext.cgiGet( "COMBO_FPGTIP_Datalisttype") ;
            Combo_fpgtip_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Allowmultipleselection")) ;
            Combo_fpgtip_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FPGTIP_Datalistfixedvalues") ;
            Combo_fpgtip_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Isgriditem")) ;
            Combo_fpgtip_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Hasdescription")) ;
            Combo_fpgtip_Datalistproc = httpContext.cgiGet( "COMBO_FPGTIP_Datalistproc") ;
            Combo_fpgtip_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FPGTIP_Datalistprocparametersprefix") ;
            Combo_fpgtip_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FPGTIP_Remoteservicesparameters") ;
            Combo_fpgtip_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FPGTIP_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fpgtip_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Includeonlyselectedoption")) ;
            Combo_fpgtip_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Includeselectalloption")) ;
            Combo_fpgtip_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Emptyitem")) ;
            Combo_fpgtip_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGTIP_Includeaddnewoption")) ;
            Combo_fpgtip_Htmltemplate = httpContext.cgiGet( "COMBO_FPGTIP_Htmltemplate") ;
            Combo_fpgtip_Multiplevaluestype = httpContext.cgiGet( "COMBO_FPGTIP_Multiplevaluestype") ;
            Combo_fpgtip_Loadingdata = httpContext.cgiGet( "COMBO_FPGTIP_Loadingdata") ;
            Combo_fpgtip_Noresultsfound = httpContext.cgiGet( "COMBO_FPGTIP_Noresultsfound") ;
            Combo_fpgtip_Emptyitemtext = httpContext.cgiGet( "COMBO_FPGTIP_Emptyitemtext") ;
            Combo_fpgtip_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FPGTIP_Onlyselectedvalues") ;
            Combo_fpgtip_Selectalltext = httpContext.cgiGet( "COMBO_FPGTIP_Selectalltext") ;
            Combo_fpgtip_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FPGTIP_Multiplevaluesseparator") ;
            Combo_fpgtip_Addnewoptiontext = httpContext.cgiGet( "COMBO_FPGTIP_Addnewoptiontext") ;
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
            A497FpgCod = GXutil.upper( httpContext.cgiGet( edtFpgCod_Internalname)) ;
            n497FpgCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
            A498FpgDsc = httpContext.cgiGet( edtFpgDsc_Internalname) ;
            n498FpgDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
            A955FpgTip = GXutil.upper( httpContext.cgiGet( edtFpgTip_Internalname)) ;
            n955FpgTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A955FpgTip", A955FpgTip);
            AV38Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
            AV36ComboFpgTip = GXutil.upper( httpContext.cgiGet( edtavCombofpgtip_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36ComboFpgTip", AV36ComboFpgTip);
            A13811FpgDscID = httpContext.cgiGet( edtFpgDscID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13811FpgDscID", A13811FpgDscID);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFORPAG");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A497FpgCod, Z497FpgCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tforpag:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A497FpgCod = httpContext.GetPar( "FpgCod") ;
               n497FpgCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
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
                  sMode49 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode49 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound49 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_130( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FPGCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFpgCod_Internalname ;
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
                        e11132 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12132 ();
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
         e12132 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1349( ) ;
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
         disableAttributes1349( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofpgtip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofpgtip_Enabled), 5, 0), true);
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

   public void confirm_130( )
   {
      beforeValidate1349( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1349( ) ;
         }
         else
         {
            checkExtendedTable1349( ) ;
            closeExtendedTableCursors1349( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption130( )
   {
   }

   public void e11132( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tforpag_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      tforpag_impl.this.A396EmprCod = GXv_char2[0] ;
      tforpag_impl.this.AV16EmprNom = GXv_char3[0] ;
      tforpag_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tforpag_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV27EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      tforpag_impl.this.AV27EmprCod = GXv_char4[0] ;
      tforpag_impl.this.AV16EmprNom = GXv_char3[0] ;
      tforpag_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV29WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV29WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV34DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV34DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtFpgTip_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgTip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgTip_Visible), 5, 0), true);
      AV36ComboFpgTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ComboFpgTip", AV36ComboFpgTip);
      edtavCombofpgtip_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofpgtip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofpgtip_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFPGTIP' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV30TrnContext.fromxml(AV31WebSession.getValue("TrnContext"), null, null);
      edtFpgDscID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgDscID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgDscID_Visible), 5, 0), true);
   }

   public void e12132( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV30TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tforpagww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOFPGTIP' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV33FpgTip_Data ;
      GXv_char4[0] = AV35ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ficherosbasicos.tforpagloaddvcombo(remoteHandle, context).execute( "FpgTip", Gx_mode, AV27EmprCod, AV32FpgCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tforpag_impl.this.AV35ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV33FpgTip_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_fpgtip_Selectedvalue_set = AV35ComboSelectedValue ;
      ucCombo_fpgtip.sendProperty(context, "", false, Combo_fpgtip_Internalname, "SelectedValue_set", Combo_fpgtip_Selectedvalue_set);
      AV36ComboFpgTip = AV35ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ComboFpgTip", AV36ComboFpgTip);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_fpgtip_Enabled = false ;
         ucCombo_fpgtip.sendProperty(context, "", false, Combo_fpgtip_Internalname, "Enabled", GXutil.booltostr( Combo_fpgtip_Enabled));
      }
   }

   public void zm1349( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z955FpgTip = T00133_A955FpgTip[0] ;
            Z498FpgDsc = T00133_A498FpgDsc[0] ;
         }
         else
         {
            Z955FpgTip = A955FpgTip ;
            Z498FpgDsc = A498FpgDsc ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z497FpgCod = A497FpgCod ;
         Z955FpgTip = A955FpgTip ;
         Z498FpgDsc = A498FpgDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV38Pgmname = "FicherosBasicos.TFORPAG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV27EmprCod)==0) )
      {
         A396EmprCod = AV27EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00134 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00134_A407EmprNom[0] ;
      n407EmprNom = T00134_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV32FpgCod)==0) )
      {
         A497FpgCod = AV32FpgCod ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      }
      if ( ! (GXutil.strcmp("", AV32FpgCod)==0) )
      {
         edtFpgCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFpgCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32FpgCod)==0) )
      {
         edtFpgCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
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
      if ( true )
      {
         A955FpgTip = AV36ComboFpgTip ;
         n955FpgTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A955FpgTip", A955FpgTip);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A955FpgTip)==0) && ( Gx_BScreen == 0 ) )
         {
            A955FpgTip = httpContext.getMessage( httpContext.getMessage( "O", ""), "") ;
            n955FpgTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A955FpgTip", A955FpgTip);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1349( )
   {
      /* Using cursor T00135 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A955FpgTip = T00135_A955FpgTip[0] ;
         n955FpgTip = T00135_n955FpgTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A955FpgTip", A955FpgTip);
         A498FpgDsc = T00135_A498FpgDsc[0] ;
         n498FpgDsc = T00135_n498FpgDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
         A407EmprNom = T00135_A407EmprNom[0] ;
         n407EmprNom = T00135_n407EmprNom[0] ;
         zm1349( -9) ;
      }
      pr_default.close(3);
      onLoadActions1349( ) ;
   }

   public void onLoadActions1349( )
   {
      A13811FpgDscID = GXutil.trim( A497FpgCod) + "-" + GXutil.trim( A498FpgDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13811FpgDscID", A13811FpgDscID);
   }

   public void checkExtendedTable1349( )
   {
      nIsDirty_49 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_49 = (short)(1) ;
      A13811FpgDscID = GXutil.trim( A497FpgCod) + "-" + GXutil.trim( A498FpgDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13811FpgDscID", A13811FpgDscID);
      if ( ! ( ( GXutil.strcmp(A955FpgTip, "E") == 0 ) || ( GXutil.strcmp(A955FpgTip, "R") == 0 ) || ( GXutil.strcmp(A955FpgTip, "O") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo Forma Pago", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FPGTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFpgTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1349( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1349( )
   {
      /* Using cursor T00136 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound49 = (short)(1) ;
      }
      else
      {
         RcdFound49 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00133 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00133_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1349( 9) ;
         RcdFound49 = (short)(1) ;
         A497FpgCod = T00133_A497FpgCod[0] ;
         n497FpgCod = T00133_n497FpgCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         A955FpgTip = T00133_A955FpgTip[0] ;
         n955FpgTip = T00133_n955FpgTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A955FpgTip", A955FpgTip);
         A498FpgDsc = T00133_A498FpgDsc[0] ;
         n498FpgDsc = T00133_n498FpgDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
         Z396EmprCod = A396EmprCod ;
         Z497FpgCod = A497FpgCod ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1349( ) ;
         if ( AnyError == 1 )
         {
            RcdFound49 = (short)(0) ;
            initializeNonKey1349( ) ;
         }
         Gx_mode = sMode49 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound49 = (short)(0) ;
         initializeNonKey1349( ) ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode49 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1349( ) ;
      if ( RcdFound49 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound49 = (short)(0) ;
      /* Using cursor T00137 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n497FpgCod), A497FpgCod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00137_A497FpgCod[0], A497FpgCod) < 0 ) ) && ( GXutil.strcmp(T00137_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00137_A497FpgCod[0], A497FpgCod) > 0 ) ) && ( GXutil.strcmp(T00137_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A497FpgCod = T00137_A497FpgCod[0] ;
            n497FpgCod = T00137_n497FpgCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
            RcdFound49 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound49 = (short)(0) ;
      /* Using cursor T00138 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n497FpgCod), A497FpgCod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00138_A497FpgCod[0], A497FpgCod) > 0 ) ) && ( GXutil.strcmp(T00138_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00138_A497FpgCod[0], A497FpgCod) < 0 ) ) && ( GXutil.strcmp(T00138_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A497FpgCod = T00138_A497FpgCod[0] ;
            n497FpgCod = T00138_n497FpgCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
            RcdFound49 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1349( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFpgCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1349( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound49 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A497FpgCod, Z497FpgCod) != 0 ) )
            {
               A497FpgCod = Z497FpgCod ;
               n497FpgCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FPGCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFpgCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFpgCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1349( ) ;
               GX_FocusControl = edtFpgCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A497FpgCod, Z497FpgCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtFpgCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1349( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FPGCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFpgCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtFpgCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1349( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A497FpgCod, Z497FpgCod) != 0 ) )
      {
         A497FpgCod = Z497FpgCod ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FPGCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFpgCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFpgCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1349( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00132 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFORPAG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z955FpgTip, T00132_A955FpgTip[0]) != 0 ) || ( GXutil.strcmp(Z498FpgDsc, T00132_A498FpgDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z955FpgTip, T00132_A955FpgTip[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tforpag:[seudo value changed for attri]"+"FpgTip");
               GXutil.writeLogRaw("Old: ",Z955FpgTip);
               GXutil.writeLogRaw("Current: ",T00132_A955FpgTip[0]);
            }
            if ( GXutil.strcmp(Z498FpgDsc, T00132_A498FpgDsc[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tforpag:[seudo value changed for attri]"+"FpgDsc");
               GXutil.writeLogRaw("Old: ",Z498FpgDsc);
               GXutil.writeLogRaw("Current: ",T00132_A498FpgDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFORPAG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1349( )
   {
      beforeValidate1349( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1349( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1349( 0) ;
         checkOptimisticConcurrency1349( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1349( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1349( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00139 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n497FpgCod), A497FpgCod, Boolean.valueOf(n955FpgTip), A955FpgTip, Boolean.valueOf(n498FpgDsc), A498FpgDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORPAG");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption130( ) ;
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
            load1349( ) ;
         }
         endLevel1349( ) ;
      }
      closeExtendedTableCursors1349( ) ;
   }

   public void update1349( )
   {
      beforeValidate1349( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1349( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1349( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1349( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1349( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001310 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n955FpgTip), A955FpgTip, Boolean.valueOf(n498FpgDsc), A498FpgDsc, A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORPAG");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFORPAG"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1349( ) ;
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
         endLevel1349( ) ;
      }
      closeExtendedTableCursors1349( ) ;
   }

   public void deferredUpdate1349( )
   {
   }

   public void delete( )
   {
      beforeValidate1349( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1349( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1349( ) ;
         afterConfirm1349( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1349( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001311 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORPAG");
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
      sMode49 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1349( ) ;
      Gx_mode = sMode49 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1349( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13811FpgDscID = GXutil.trim( A497FpgCod) + "-" + GXutil.trim( A498FpgDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13811FpgDscID", A13811FpgDscID);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001312 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TCLIFPG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T001313 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T001314 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T001315 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T001316 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T001317 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T001318 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T001319 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T001320 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T001321 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T001322 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T001323 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T001324 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T001325 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T001326 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T001327 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T001328 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T001329 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T001330 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T001331 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T001332 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T001333 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T001334 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T001335 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T001336 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T001337 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T001338 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T001339 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T001340 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T001341 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T001342 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T001343 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T001344 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T001345 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T001346 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T001347 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T001348 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T001349 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T001350 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T001351 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T001352 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T001353 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T001354 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T001355 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T001356 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T001357 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T001358 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T001359 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T001360 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T001361 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T001362 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T001363 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T001364 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T001365 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T001366 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T001367 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T001368 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T001369 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T001370 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T001371 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T001372 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T001373 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T001374 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T001375 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T001376 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T001377 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T001378 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T001379 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T001380 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T001381 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T001382 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T001383 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T001384 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T001385 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T001386 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T001387 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T001388 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T001389 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T001390 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T001391 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T001392 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T001393 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T001394 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T001395 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T001396 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T001397 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T001398 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T001399 */
         pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T0013100 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T0013101 */
         pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T0013102 */
         pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T0013103 */
         pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T0013104 */
         pr_default.execute(102, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T0013105 */
         pr_default.execute(103, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T0013106 */
         pr_default.execute(104, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T0013107 */
         pr_default.execute(105, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T0013108 */
         pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T0013109 */
         pr_default.execute(107, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
      }
   }

   public void endLevel1349( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1349( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tforpag");
         if ( AnyError == 0 )
         {
            confirmValues130( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tforpag");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1349( )
   {
      /* Scan By routine */
      /* Using cursor T0013110 */
      pr_default.execute(108, new Object[] {A396EmprCod});
      RcdFound49 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A497FpgCod = T0013110_A497FpgCod[0] ;
         n497FpgCod = T0013110_n497FpgCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1349( )
   {
      /* Scan next routine */
      pr_default.readNext(108);
      RcdFound49 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A497FpgCod = T0013110_A497FpgCod[0] ;
         n497FpgCod = T0013110_n497FpgCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      }
   }

   public void scanEnd1349( )
   {
      pr_default.close(108);
   }

   public void afterConfirm1349( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1349( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1349( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1349( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1349( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1349( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1349( )
   {
      edtFpgCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
      edtFpgDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgDsc_Enabled), 5, 0), true);
      edtFpgTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgTip_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombofpgtip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofpgtip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofpgtip_Enabled), 5, 0), true);
      edtFpgDscID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgDscID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgDscID_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1349( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues130( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tforpag", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV32FpgCod))}, new String[] {"Gx_mode","EmprCod","FpgCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFORPAG");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tforpag:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z497FpgCod", GXutil.rtrim( Z497FpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z955FpgTip", GXutil.rtrim( Z955FpgTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z498FpgDsc", GXutil.rtrim( Z498FpgDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFPGTIP_DATA", AV33FpgTip_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFPGTIP_DATA", AV33FpgTip_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV30TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV30TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV30TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV27EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFPGCOD", GXutil.rtrim( AV32FpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFPGCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32FpgCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGTIP_Objectcall", GXutil.rtrim( Combo_fpgtip_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGTIP_Cls", GXutil.rtrim( Combo_fpgtip_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGTIP_Selectedvalue_set", GXutil.rtrim( Combo_fpgtip_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGTIP_Enabled", GXutil.booltostr( Combo_fpgtip_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGTIP_Datalisttype", GXutil.rtrim( Combo_fpgtip_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGTIP_Datalistfixedvalues", GXutil.rtrim( Combo_fpgtip_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGTIP_Emptyitem", GXutil.booltostr( Combo_fpgtip_Emptyitem));
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
      return formatLink("app.ficherosbasicos.tforpag", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV32FpgCod))}, new String[] {"Gx_mode","EmprCod","FpgCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TFORPAG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Formas de Pago", "") ;
   }

   public void initializeNonKey1349( )
   {
      A13811FpgDscID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13811FpgDscID", A13811FpgDscID);
      A498FpgDsc = "" ;
      n498FpgDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
      A955FpgTip = httpContext.getMessage( "O", "") ;
      n955FpgTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A955FpgTip", A955FpgTip);
      Z955FpgTip = "" ;
      Z498FpgDsc = "" ;
   }

   public void initAll1349( )
   {
      A497FpgCod = "" ;
      n497FpgCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      initializeNonKey1349( ) ;
   }

   public void standaloneModalInsert( )
   {
      A955FpgTip = i955FpgTip ;
      n955FpgTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A955FpgTip", A955FpgTip);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211651115", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tforpag.js", "?20268211651115", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtFpgCod_Internalname = "FPGCOD" ;
      edtFpgDsc_Internalname = "FPGDSC" ;
      lblTextblockfpgtip_Internalname = "TEXTBLOCKFPGTIP" ;
      Combo_fpgtip_Internalname = "COMBO_FPGTIP" ;
      edtFpgTip_Internalname = "FPGTIP" ;
      divTablesplittedfpgtip_Internalname = "TABLESPLITTEDFPGTIP" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombofpgtip_Internalname = "vCOMBOFPGTIP" ;
      divSectionattribute_fpgtip_Internalname = "SECTIONATTRIBUTE_FPGTIP" ;
      edtFpgDscID_Internalname = "FPGDSCID" ;
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
      Form.setCaption( httpContext.getMessage( "Formas de Pago", "") );
      edtFpgDscID_Jsonclick = "" ;
      edtFpgDscID_Enabled = 0 ;
      edtFpgDscID_Visible = 1 ;
      edtavCombofpgtip_Jsonclick = "" ;
      edtavCombofpgtip_Enabled = 0 ;
      edtavCombofpgtip_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFpgTip_Jsonclick = "" ;
      edtFpgTip_Enabled = 1 ;
      edtFpgTip_Visible = 1 ;
      Combo_fpgtip_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fpgtip_Datalistfixedvalues = "O - OTROS:O,R - RECIBO:R,E - EFECTO:E" ;
      Combo_fpgtip_Datalisttype = "FixedValues" ;
      Combo_fpgtip_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fpgtip_Caption = "" ;
      Combo_fpgtip_Enabled = GXutil.toBoolean( -1) ;
      edtFpgDsc_Jsonclick = "" ;
      edtFpgDsc_Enabled = 1 ;
      edtFpgCod_Jsonclick = "" ;
      edtFpgCod_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV32FpgCod',fld:'vFPGCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV32FpgCod',fld:'vFPGCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12132',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_FPGCOD","{handler:'valid_Fpgcod',iparms:[]");
      setEventMetadata("VALID_FPGCOD",",oparms:[]}");
      setEventMetadata("VALID_FPGDSC","{handler:'valid_Fpgdsc',iparms:[]");
      setEventMetadata("VALID_FPGDSC",",oparms:[]}");
      setEventMetadata("VALID_FPGTIP","{handler:'valid_Fpgtip',iparms:[]");
      setEventMetadata("VALID_FPGTIP",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOFPGTIP","{handler:'validv_Combofpgtip',iparms:[]");
      setEventMetadata("VALIDV_COMBOFPGTIP",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV27EmprCod = "" ;
      wcpOAV32FpgCod = "" ;
      Z396EmprCod = "" ;
      Z497FpgCod = "" ;
      Z955FpgTip = "" ;
      Z498FpgDsc = "" ;
      Combo_fpgtip_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV27EmprCod = "" ;
      AV32FpgCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      lblTextblockfpgtip_Jsonclick = "" ;
      ucCombo_fpgtip = new com.genexus.webpanels.GXUserControl();
      AV34DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV33FpgTip_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A955FpgTip = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV38Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV36ComboFpgTip = "" ;
      A13811FpgDscID = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Combo_fpgtip_Objectcall = "" ;
      Combo_fpgtip_Class = "" ;
      Combo_fpgtip_Icontype = "" ;
      Combo_fpgtip_Icon = "" ;
      Combo_fpgtip_Tooltip = "" ;
      Combo_fpgtip_Selectedvalue_set = "" ;
      Combo_fpgtip_Selectedtext_set = "" ;
      Combo_fpgtip_Selectedtext_get = "" ;
      Combo_fpgtip_Gamoauthtoken = "" ;
      Combo_fpgtip_Ddointernalname = "" ;
      Combo_fpgtip_Titlecontrolalign = "" ;
      Combo_fpgtip_Dropdownoptionstype = "" ;
      Combo_fpgtip_Titlecontrolidtoreplace = "" ;
      Combo_fpgtip_Datalistproc = "" ;
      Combo_fpgtip_Datalistprocparametersprefix = "" ;
      Combo_fpgtip_Remoteservicesparameters = "" ;
      Combo_fpgtip_Htmltemplate = "" ;
      Combo_fpgtip_Multiplevaluestype = "" ;
      Combo_fpgtip_Loadingdata = "" ;
      Combo_fpgtip_Noresultsfound = "" ;
      Combo_fpgtip_Emptyitemtext = "" ;
      Combo_fpgtip_Onlyselectedvalues = "" ;
      Combo_fpgtip_Selectalltext = "" ;
      Combo_fpgtip_Multiplevaluesseparator = "" ;
      Combo_fpgtip_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode49 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV29WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV30TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV31WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV35ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T00134_A407EmprNom = new String[] {""} ;
      T00134_n407EmprNom = new boolean[] {false} ;
      T00135_A497FpgCod = new String[] {""} ;
      T00135_n497FpgCod = new boolean[] {false} ;
      T00135_A955FpgTip = new String[] {""} ;
      T00135_n955FpgTip = new boolean[] {false} ;
      T00135_A498FpgDsc = new String[] {""} ;
      T00135_n498FpgDsc = new boolean[] {false} ;
      T00135_A407EmprNom = new String[] {""} ;
      T00135_n407EmprNom = new boolean[] {false} ;
      T00135_A396EmprCod = new String[] {""} ;
      T00136_A396EmprCod = new String[] {""} ;
      T00136_A497FpgCod = new String[] {""} ;
      T00136_n497FpgCod = new boolean[] {false} ;
      T00133_A497FpgCod = new String[] {""} ;
      T00133_n497FpgCod = new boolean[] {false} ;
      T00133_A955FpgTip = new String[] {""} ;
      T00133_n955FpgTip = new boolean[] {false} ;
      T00133_A498FpgDsc = new String[] {""} ;
      T00133_n498FpgDsc = new boolean[] {false} ;
      T00133_A396EmprCod = new String[] {""} ;
      T00137_A396EmprCod = new String[] {""} ;
      T00137_A497FpgCod = new String[] {""} ;
      T00137_n497FpgCod = new boolean[] {false} ;
      T00138_A396EmprCod = new String[] {""} ;
      T00138_A497FpgCod = new String[] {""} ;
      T00138_n497FpgCod = new boolean[] {false} ;
      T00132_A497FpgCod = new String[] {""} ;
      T00132_n497FpgCod = new boolean[] {false} ;
      T00132_A955FpgTip = new String[] {""} ;
      T00132_n955FpgTip = new boolean[] {false} ;
      T00132_A498FpgDsc = new String[] {""} ;
      T00132_n498FpgDsc = new boolean[] {false} ;
      T00132_A396EmprCod = new String[] {""} ;
      T001312_A396EmprCod = new String[] {""} ;
      T001312_A252CliCod = new int[1] ;
      T001312_A297CliPri = new String[] {""} ;
      T001313_A396EmprCod = new String[] {""} ;
      T001313_A795PrvNum = new int[1] ;
      T001314_A396EmprCod = new String[] {""} ;
      T001314_A30AlbProCod = new long[1] ;
      T001315_A396EmprCod = new String[] {""} ;
      T001315_A30AlbProCod = new long[1] ;
      T001316_A396EmprCod = new String[] {""} ;
      T001316_A30AlbProCod = new long[1] ;
      T001317_A396EmprCod = new String[] {""} ;
      T001317_A30AlbProCod = new long[1] ;
      T001318_A396EmprCod = new String[] {""} ;
      T001318_A30AlbProCod = new long[1] ;
      T001319_A396EmprCod = new String[] {""} ;
      T001319_A30AlbProCod = new long[1] ;
      T001320_A396EmprCod = new String[] {""} ;
      T001320_A30AlbProCod = new long[1] ;
      T001321_A396EmprCod = new String[] {""} ;
      T001321_A30AlbProCod = new long[1] ;
      T001322_A396EmprCod = new String[] {""} ;
      T001322_A30AlbProCod = new long[1] ;
      T001323_A396EmprCod = new String[] {""} ;
      T001323_A30AlbProCod = new long[1] ;
      T001324_A396EmprCod = new String[] {""} ;
      T001324_A30AlbProCod = new long[1] ;
      T001325_A396EmprCod = new String[] {""} ;
      T001325_A30AlbProCod = new long[1] ;
      T001326_A396EmprCod = new String[] {""} ;
      T001326_A30AlbProCod = new long[1] ;
      T001327_A396EmprCod = new String[] {""} ;
      T001327_A30AlbProCod = new long[1] ;
      T001328_A396EmprCod = new String[] {""} ;
      T001328_A30AlbProCod = new long[1] ;
      T001329_A396EmprCod = new String[] {""} ;
      T001329_A30AlbProCod = new long[1] ;
      T001330_A396EmprCod = new String[] {""} ;
      T001330_A30AlbProCod = new long[1] ;
      T001331_A396EmprCod = new String[] {""} ;
      T001331_A30AlbProCod = new long[1] ;
      T001332_A396EmprCod = new String[] {""} ;
      T001332_A30AlbProCod = new long[1] ;
      T001333_A396EmprCod = new String[] {""} ;
      T001333_A30AlbProCod = new long[1] ;
      T001334_A396EmprCod = new String[] {""} ;
      T001334_A30AlbProCod = new long[1] ;
      T001335_A396EmprCod = new String[] {""} ;
      T001335_A30AlbProCod = new long[1] ;
      T001336_A396EmprCod = new String[] {""} ;
      T001336_A30AlbProCod = new long[1] ;
      T001337_A396EmprCod = new String[] {""} ;
      T001337_A30AlbProCod = new long[1] ;
      T001338_A396EmprCod = new String[] {""} ;
      T001338_A30AlbProCod = new long[1] ;
      T001339_A396EmprCod = new String[] {""} ;
      T001339_A30AlbProCod = new long[1] ;
      T001340_A396EmprCod = new String[] {""} ;
      T001340_A30AlbProCod = new long[1] ;
      T001341_A396EmprCod = new String[] {""} ;
      T001341_A30AlbProCod = new long[1] ;
      T001342_A396EmprCod = new String[] {""} ;
      T001342_A30AlbProCod = new long[1] ;
      T001343_A396EmprCod = new String[] {""} ;
      T001343_A30AlbProCod = new long[1] ;
      T001344_A396EmprCod = new String[] {""} ;
      T001344_A30AlbProCod = new long[1] ;
      T001345_A396EmprCod = new String[] {""} ;
      T001345_A30AlbProCod = new long[1] ;
      T001346_A396EmprCod = new String[] {""} ;
      T001346_A30AlbProCod = new long[1] ;
      T001347_A396EmprCod = new String[] {""} ;
      T001347_A30AlbProCod = new long[1] ;
      T001348_A396EmprCod = new String[] {""} ;
      T001348_A30AlbProCod = new long[1] ;
      T001349_A396EmprCod = new String[] {""} ;
      T001349_A30AlbProCod = new long[1] ;
      T001350_A396EmprCod = new String[] {""} ;
      T001350_A30AlbProCod = new long[1] ;
      T001351_A396EmprCod = new String[] {""} ;
      T001351_A30AlbProCod = new long[1] ;
      T001352_A396EmprCod = new String[] {""} ;
      T001352_A30AlbProCod = new long[1] ;
      T001353_A396EmprCod = new String[] {""} ;
      T001353_A30AlbProCod = new long[1] ;
      T001354_A396EmprCod = new String[] {""} ;
      T001354_A30AlbProCod = new long[1] ;
      T001355_A396EmprCod = new String[] {""} ;
      T001355_A30AlbProCod = new long[1] ;
      T001356_A396EmprCod = new String[] {""} ;
      T001356_A30AlbProCod = new long[1] ;
      T001357_A396EmprCod = new String[] {""} ;
      T001357_A30AlbProCod = new long[1] ;
      T001358_A396EmprCod = new String[] {""} ;
      T001358_A30AlbProCod = new long[1] ;
      T001359_A396EmprCod = new String[] {""} ;
      T001359_A30AlbProCod = new long[1] ;
      T001360_A396EmprCod = new String[] {""} ;
      T001360_A30AlbProCod = new long[1] ;
      T001361_A396EmprCod = new String[] {""} ;
      T001361_A30AlbProCod = new long[1] ;
      T001362_A396EmprCod = new String[] {""} ;
      T001362_A30AlbProCod = new long[1] ;
      T001363_A396EmprCod = new String[] {""} ;
      T001363_A30AlbProCod = new long[1] ;
      T001364_A396EmprCod = new String[] {""} ;
      T001364_A30AlbProCod = new long[1] ;
      T001365_A396EmprCod = new String[] {""} ;
      T001365_A30AlbProCod = new long[1] ;
      T001366_A396EmprCod = new String[] {""} ;
      T001366_A30AlbProCod = new long[1] ;
      T001367_A396EmprCod = new String[] {""} ;
      T001367_A30AlbProCod = new long[1] ;
      T001368_A396EmprCod = new String[] {""} ;
      T001368_A30AlbProCod = new long[1] ;
      T001369_A396EmprCod = new String[] {""} ;
      T001369_A30AlbProCod = new long[1] ;
      T001370_A396EmprCod = new String[] {""} ;
      T001370_A30AlbProCod = new long[1] ;
      T001371_A396EmprCod = new String[] {""} ;
      T001371_A30AlbProCod = new long[1] ;
      T001372_A396EmprCod = new String[] {""} ;
      T001372_A30AlbProCod = new long[1] ;
      T001373_A396EmprCod = new String[] {""} ;
      T001373_A30AlbProCod = new long[1] ;
      T001374_A396EmprCod = new String[] {""} ;
      T001374_A30AlbProCod = new long[1] ;
      T001375_A396EmprCod = new String[] {""} ;
      T001375_A30AlbProCod = new long[1] ;
      T001376_A396EmprCod = new String[] {""} ;
      T001376_A30AlbProCod = new long[1] ;
      T001377_A396EmprCod = new String[] {""} ;
      T001377_A30AlbProCod = new long[1] ;
      T001378_A396EmprCod = new String[] {""} ;
      T001378_A30AlbProCod = new long[1] ;
      T001379_A396EmprCod = new String[] {""} ;
      T001379_A30AlbProCod = new long[1] ;
      T001380_A396EmprCod = new String[] {""} ;
      T001380_A30AlbProCod = new long[1] ;
      T001381_A396EmprCod = new String[] {""} ;
      T001381_A30AlbProCod = new long[1] ;
      T001382_A396EmprCod = new String[] {""} ;
      T001382_A30AlbProCod = new long[1] ;
      T001383_A396EmprCod = new String[] {""} ;
      T001383_A30AlbProCod = new long[1] ;
      T001384_A396EmprCod = new String[] {""} ;
      T001384_A30AlbProCod = new long[1] ;
      T001385_A396EmprCod = new String[] {""} ;
      T001385_A30AlbProCod = new long[1] ;
      T001386_A396EmprCod = new String[] {""} ;
      T001386_A30AlbProCod = new long[1] ;
      T001387_A396EmprCod = new String[] {""} ;
      T001387_A30AlbProCod = new long[1] ;
      T001388_A396EmprCod = new String[] {""} ;
      T001388_A30AlbProCod = new long[1] ;
      T001389_A396EmprCod = new String[] {""} ;
      T001389_A30AlbProCod = new long[1] ;
      T001390_A396EmprCod = new String[] {""} ;
      T001390_A30AlbProCod = new long[1] ;
      T001391_A396EmprCod = new String[] {""} ;
      T001391_A30AlbProCod = new long[1] ;
      T001392_A396EmprCod = new String[] {""} ;
      T001392_A30AlbProCod = new long[1] ;
      T001393_A396EmprCod = new String[] {""} ;
      T001393_A30AlbProCod = new long[1] ;
      T001394_A396EmprCod = new String[] {""} ;
      T001394_A30AlbProCod = new long[1] ;
      T001395_A396EmprCod = new String[] {""} ;
      T001395_A30AlbProCod = new long[1] ;
      T001396_A396EmprCod = new String[] {""} ;
      T001396_A30AlbProCod = new long[1] ;
      T001397_A396EmprCod = new String[] {""} ;
      T001397_A30AlbProCod = new long[1] ;
      T001398_A396EmprCod = new String[] {""} ;
      T001398_A30AlbProCod = new long[1] ;
      T001399_A396EmprCod = new String[] {""} ;
      T001399_A30AlbProCod = new long[1] ;
      T0013100_A396EmprCod = new String[] {""} ;
      T0013100_A30AlbProCod = new long[1] ;
      T0013101_A396EmprCod = new String[] {""} ;
      T0013101_A30AlbProCod = new long[1] ;
      T0013102_A396EmprCod = new String[] {""} ;
      T0013102_A30AlbProCod = new long[1] ;
      T0013103_A396EmprCod = new String[] {""} ;
      T0013103_A30AlbProCod = new long[1] ;
      T0013104_A396EmprCod = new String[] {""} ;
      T0013104_A30AlbProCod = new long[1] ;
      T0013105_A396EmprCod = new String[] {""} ;
      T0013105_A30AlbProCod = new long[1] ;
      T0013106_A396EmprCod = new String[] {""} ;
      T0013106_A30AlbProCod = new long[1] ;
      T0013107_A396EmprCod = new String[] {""} ;
      T0013107_A30AlbProCod = new long[1] ;
      T0013108_A396EmprCod = new String[] {""} ;
      T0013108_A30AlbProCod = new long[1] ;
      T0013109_A396EmprCod = new String[] {""} ;
      T0013109_A30AlbProCod = new long[1] ;
      T0013110_A396EmprCod = new String[] {""} ;
      T0013110_A497FpgCod = new String[] {""} ;
      T0013110_n497FpgCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i955FpgTip = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tforpag__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tforpag__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tforpag__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tforpag__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tforpag__default(),
         new Object[] {
             new Object[] {
            T00132_A497FpgCod, T00132_A955FpgTip, T00132_n955FpgTip, T00132_A498FpgDsc, T00132_n498FpgDsc, T00132_A396EmprCod
            }
            , new Object[] {
            T00133_A497FpgCod, T00133_A955FpgTip, T00133_n955FpgTip, T00133_A498FpgDsc, T00133_n498FpgDsc, T00133_A396EmprCod
            }
            , new Object[] {
            T00134_A407EmprNom, T00134_n407EmprNom
            }
            , new Object[] {
            T00135_A497FpgCod, T00135_A955FpgTip, T00135_n955FpgTip, T00135_A498FpgDsc, T00135_n498FpgDsc, T00135_A407EmprNom, T00135_n407EmprNom, T00135_A396EmprCod
            }
            , new Object[] {
            T00136_A396EmprCod, T00136_A497FpgCod
            }
            , new Object[] {
            T00137_A396EmprCod, T00137_A497FpgCod
            }
            , new Object[] {
            T00138_A396EmprCod, T00138_A497FpgCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001312_A396EmprCod, T001312_A252CliCod, T001312_A297CliPri
            }
            , new Object[] {
            T001313_A396EmprCod, T001313_A795PrvNum
            }
            , new Object[] {
            T001314_A396EmprCod, T001314_A30AlbProCod
            }
            , new Object[] {
            T001315_A396EmprCod, T001315_A30AlbProCod
            }
            , new Object[] {
            T001316_A396EmprCod, T001316_A30AlbProCod
            }
            , new Object[] {
            T001317_A396EmprCod, T001317_A30AlbProCod
            }
            , new Object[] {
            T001318_A396EmprCod, T001318_A30AlbProCod
            }
            , new Object[] {
            T001319_A396EmprCod, T001319_A30AlbProCod
            }
            , new Object[] {
            T001320_A396EmprCod, T001320_A30AlbProCod
            }
            , new Object[] {
            T001321_A396EmprCod, T001321_A30AlbProCod
            }
            , new Object[] {
            T001322_A396EmprCod, T001322_A30AlbProCod
            }
            , new Object[] {
            T001323_A396EmprCod, T001323_A30AlbProCod
            }
            , new Object[] {
            T001324_A396EmprCod, T001324_A30AlbProCod
            }
            , new Object[] {
            T001325_A396EmprCod, T001325_A30AlbProCod
            }
            , new Object[] {
            T001326_A396EmprCod, T001326_A30AlbProCod
            }
            , new Object[] {
            T001327_A396EmprCod, T001327_A30AlbProCod
            }
            , new Object[] {
            T001328_A396EmprCod, T001328_A30AlbProCod
            }
            , new Object[] {
            T001329_A396EmprCod, T001329_A30AlbProCod
            }
            , new Object[] {
            T001330_A396EmprCod, T001330_A30AlbProCod
            }
            , new Object[] {
            T001331_A396EmprCod, T001331_A30AlbProCod
            }
            , new Object[] {
            T001332_A396EmprCod, T001332_A30AlbProCod
            }
            , new Object[] {
            T001333_A396EmprCod, T001333_A30AlbProCod
            }
            , new Object[] {
            T001334_A396EmprCod, T001334_A30AlbProCod
            }
            , new Object[] {
            T001335_A396EmprCod, T001335_A30AlbProCod
            }
            , new Object[] {
            T001336_A396EmprCod, T001336_A30AlbProCod
            }
            , new Object[] {
            T001337_A396EmprCod, T001337_A30AlbProCod
            }
            , new Object[] {
            T001338_A396EmprCod, T001338_A30AlbProCod
            }
            , new Object[] {
            T001339_A396EmprCod, T001339_A30AlbProCod
            }
            , new Object[] {
            T001340_A396EmprCod, T001340_A30AlbProCod
            }
            , new Object[] {
            T001341_A396EmprCod, T001341_A30AlbProCod
            }
            , new Object[] {
            T001342_A396EmprCod, T001342_A30AlbProCod
            }
            , new Object[] {
            T001343_A396EmprCod, T001343_A30AlbProCod
            }
            , new Object[] {
            T001344_A396EmprCod, T001344_A30AlbProCod
            }
            , new Object[] {
            T001345_A396EmprCod, T001345_A30AlbProCod
            }
            , new Object[] {
            T001346_A396EmprCod, T001346_A30AlbProCod
            }
            , new Object[] {
            T001347_A396EmprCod, T001347_A30AlbProCod
            }
            , new Object[] {
            T001348_A396EmprCod, T001348_A30AlbProCod
            }
            , new Object[] {
            T001349_A396EmprCod, T001349_A30AlbProCod
            }
            , new Object[] {
            T001350_A396EmprCod, T001350_A30AlbProCod
            }
            , new Object[] {
            T001351_A396EmprCod, T001351_A30AlbProCod
            }
            , new Object[] {
            T001352_A396EmprCod, T001352_A30AlbProCod
            }
            , new Object[] {
            T001353_A396EmprCod, T001353_A30AlbProCod
            }
            , new Object[] {
            T001354_A396EmprCod, T001354_A30AlbProCod
            }
            , new Object[] {
            T001355_A396EmprCod, T001355_A30AlbProCod
            }
            , new Object[] {
            T001356_A396EmprCod, T001356_A30AlbProCod
            }
            , new Object[] {
            T001357_A396EmprCod, T001357_A30AlbProCod
            }
            , new Object[] {
            T001358_A396EmprCod, T001358_A30AlbProCod
            }
            , new Object[] {
            T001359_A396EmprCod, T001359_A30AlbProCod
            }
            , new Object[] {
            T001360_A396EmprCod, T001360_A30AlbProCod
            }
            , new Object[] {
            T001361_A396EmprCod, T001361_A30AlbProCod
            }
            , new Object[] {
            T001362_A396EmprCod, T001362_A30AlbProCod
            }
            , new Object[] {
            T001363_A396EmprCod, T001363_A30AlbProCod
            }
            , new Object[] {
            T001364_A396EmprCod, T001364_A30AlbProCod
            }
            , new Object[] {
            T001365_A396EmprCod, T001365_A30AlbProCod
            }
            , new Object[] {
            T001366_A396EmprCod, T001366_A30AlbProCod
            }
            , new Object[] {
            T001367_A396EmprCod, T001367_A30AlbProCod
            }
            , new Object[] {
            T001368_A396EmprCod, T001368_A30AlbProCod
            }
            , new Object[] {
            T001369_A396EmprCod, T001369_A30AlbProCod
            }
            , new Object[] {
            T001370_A396EmprCod, T001370_A30AlbProCod
            }
            , new Object[] {
            T001371_A396EmprCod, T001371_A30AlbProCod
            }
            , new Object[] {
            T001372_A396EmprCod, T001372_A30AlbProCod
            }
            , new Object[] {
            T001373_A396EmprCod, T001373_A30AlbProCod
            }
            , new Object[] {
            T001374_A396EmprCod, T001374_A30AlbProCod
            }
            , new Object[] {
            T001375_A396EmprCod, T001375_A30AlbProCod
            }
            , new Object[] {
            T001376_A396EmprCod, T001376_A30AlbProCod
            }
            , new Object[] {
            T001377_A396EmprCod, T001377_A30AlbProCod
            }
            , new Object[] {
            T001378_A396EmprCod, T001378_A30AlbProCod
            }
            , new Object[] {
            T001379_A396EmprCod, T001379_A30AlbProCod
            }
            , new Object[] {
            T001380_A396EmprCod, T001380_A30AlbProCod
            }
            , new Object[] {
            T001381_A396EmprCod, T001381_A30AlbProCod
            }
            , new Object[] {
            T001382_A396EmprCod, T001382_A30AlbProCod
            }
            , new Object[] {
            T001383_A396EmprCod, T001383_A30AlbProCod
            }
            , new Object[] {
            T001384_A396EmprCod, T001384_A30AlbProCod
            }
            , new Object[] {
            T001385_A396EmprCod, T001385_A30AlbProCod
            }
            , new Object[] {
            T001386_A396EmprCod, T001386_A30AlbProCod
            }
            , new Object[] {
            T001387_A396EmprCod, T001387_A30AlbProCod
            }
            , new Object[] {
            T001388_A396EmprCod, T001388_A30AlbProCod
            }
            , new Object[] {
            T001389_A396EmprCod, T001389_A30AlbProCod
            }
            , new Object[] {
            T001390_A396EmprCod, T001390_A30AlbProCod
            }
            , new Object[] {
            T001391_A396EmprCod, T001391_A30AlbProCod
            }
            , new Object[] {
            T001392_A396EmprCod, T001392_A30AlbProCod
            }
            , new Object[] {
            T001393_A396EmprCod, T001393_A30AlbProCod
            }
            , new Object[] {
            T001394_A396EmprCod, T001394_A30AlbProCod
            }
            , new Object[] {
            T001395_A396EmprCod, T001395_A30AlbProCod
            }
            , new Object[] {
            T001396_A396EmprCod, T001396_A30AlbProCod
            }
            , new Object[] {
            T001397_A396EmprCod, T001397_A30AlbProCod
            }
            , new Object[] {
            T001398_A396EmprCod, T001398_A30AlbProCod
            }
            , new Object[] {
            T001399_A396EmprCod, T001399_A30AlbProCod
            }
            , new Object[] {
            T0013100_A396EmprCod, T0013100_A30AlbProCod
            }
            , new Object[] {
            T0013101_A396EmprCod, T0013101_A30AlbProCod
            }
            , new Object[] {
            T0013102_A396EmprCod, T0013102_A30AlbProCod
            }
            , new Object[] {
            T0013103_A396EmprCod, T0013103_A30AlbProCod
            }
            , new Object[] {
            T0013104_A396EmprCod, T0013104_A30AlbProCod
            }
            , new Object[] {
            T0013105_A396EmprCod, T0013105_A30AlbProCod
            }
            , new Object[] {
            T0013106_A396EmprCod, T0013106_A30AlbProCod
            }
            , new Object[] {
            T0013107_A396EmprCod, T0013107_A30AlbProCod
            }
            , new Object[] {
            T0013108_A396EmprCod, T0013108_A30AlbProCod
            }
            , new Object[] {
            T0013109_A396EmprCod, T0013109_A30AlbProCod
            }
            , new Object[] {
            T0013110_A396EmprCod, T0013110_A497FpgCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV38Pgmname = "FicherosBasicos.TFORPAG" ;
      Z955FpgTip = httpContext.getMessage( "O", "") ;
      n955FpgTip = false ;
      A955FpgTip = httpContext.getMessage( "O", "") ;
      n955FpgTip = false ;
      i955FpgTip = httpContext.getMessage( "O", "") ;
      n955FpgTip = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound49 ;
   private short nIsDirty_49 ;
   private int trnEnded ;
   private int edtFpgCod_Enabled ;
   private int edtFpgDsc_Enabled ;
   private int edtFpgTip_Visible ;
   private int edtFpgTip_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombofpgtip_Visible ;
   private int edtavCombofpgtip_Enabled ;
   private int edtFpgDscID_Visible ;
   private int edtFpgDscID_Enabled ;
   private int Combo_fpgtip_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV27EmprCod ;
   private String wcpOAV32FpgCod ;
   private String Z396EmprCod ;
   private String Z497FpgCod ;
   private String Z955FpgTip ;
   private String Z498FpgDsc ;
   private String Combo_fpgtip_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV27EmprCod ;
   private String AV32FpgCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFpgCod_Internalname ;
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
   private String A497FpgCod ;
   private String edtFpgCod_Jsonclick ;
   private String edtFpgDsc_Internalname ;
   private String A498FpgDsc ;
   private String edtFpgDsc_Jsonclick ;
   private String divTablesplittedfpgtip_Internalname ;
   private String lblTextblockfpgtip_Internalname ;
   private String lblTextblockfpgtip_Jsonclick ;
   private String Combo_fpgtip_Caption ;
   private String Combo_fpgtip_Cls ;
   private String Combo_fpgtip_Datalisttype ;
   private String Combo_fpgtip_Datalistfixedvalues ;
   private String Combo_fpgtip_Internalname ;
   private String edtFpgTip_Internalname ;
   private String A955FpgTip ;
   private String edtFpgTip_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV38Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_fpgtip_Internalname ;
   private String edtavCombofpgtip_Internalname ;
   private String AV36ComboFpgTip ;
   private String edtavCombofpgtip_Jsonclick ;
   private String edtFpgDscID_Internalname ;
   private String edtFpgDscID_Jsonclick ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Combo_fpgtip_Objectcall ;
   private String Combo_fpgtip_Class ;
   private String Combo_fpgtip_Icontype ;
   private String Combo_fpgtip_Icon ;
   private String Combo_fpgtip_Tooltip ;
   private String Combo_fpgtip_Selectedvalue_set ;
   private String Combo_fpgtip_Selectedtext_set ;
   private String Combo_fpgtip_Selectedtext_get ;
   private String Combo_fpgtip_Gamoauthtoken ;
   private String Combo_fpgtip_Ddointernalname ;
   private String Combo_fpgtip_Titlecontrolalign ;
   private String Combo_fpgtip_Dropdownoptionstype ;
   private String Combo_fpgtip_Titlecontrolidtoreplace ;
   private String Combo_fpgtip_Datalistproc ;
   private String Combo_fpgtip_Datalistprocparametersprefix ;
   private String Combo_fpgtip_Remoteservicesparameters ;
   private String Combo_fpgtip_Htmltemplate ;
   private String Combo_fpgtip_Multiplevaluestype ;
   private String Combo_fpgtip_Loadingdata ;
   private String Combo_fpgtip_Noresultsfound ;
   private String Combo_fpgtip_Emptyitemtext ;
   private String Combo_fpgtip_Onlyselectedvalues ;
   private String Combo_fpgtip_Selectalltext ;
   private String Combo_fpgtip_Multiplevaluesseparator ;
   private String Combo_fpgtip_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode49 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i955FpgTip ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_fpgtip_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean Combo_fpgtip_Enabled ;
   private boolean Combo_fpgtip_Visible ;
   private boolean Combo_fpgtip_Allowmultipleselection ;
   private boolean Combo_fpgtip_Isgriditem ;
   private boolean Combo_fpgtip_Hasdescription ;
   private boolean Combo_fpgtip_Includeonlyselectedoption ;
   private boolean Combo_fpgtip_Includeselectalloption ;
   private boolean Combo_fpgtip_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n497FpgCod ;
   private boolean n498FpgDsc ;
   private boolean n955FpgTip ;
   private boolean returnInSub ;
   private String A13811FpgDscID ;
   private String AV35ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV31WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_fpgtip ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00134_A407EmprNom ;
   private boolean[] T00134_n407EmprNom ;
   private String[] T00135_A497FpgCod ;
   private boolean[] T00135_n497FpgCod ;
   private String[] T00135_A955FpgTip ;
   private boolean[] T00135_n955FpgTip ;
   private String[] T00135_A498FpgDsc ;
   private boolean[] T00135_n498FpgDsc ;
   private String[] T00135_A407EmprNom ;
   private boolean[] T00135_n407EmprNom ;
   private String[] T00135_A396EmprCod ;
   private String[] T00136_A396EmprCod ;
   private String[] T00136_A497FpgCod ;
   private boolean[] T00136_n497FpgCod ;
   private String[] T00133_A497FpgCod ;
   private boolean[] T00133_n497FpgCod ;
   private String[] T00133_A955FpgTip ;
   private boolean[] T00133_n955FpgTip ;
   private String[] T00133_A498FpgDsc ;
   private boolean[] T00133_n498FpgDsc ;
   private String[] T00133_A396EmprCod ;
   private String[] T00137_A396EmprCod ;
   private String[] T00137_A497FpgCod ;
   private boolean[] T00137_n497FpgCod ;
   private String[] T00138_A396EmprCod ;
   private String[] T00138_A497FpgCod ;
   private boolean[] T00138_n497FpgCod ;
   private String[] T00132_A497FpgCod ;
   private boolean[] T00132_n497FpgCod ;
   private String[] T00132_A955FpgTip ;
   private boolean[] T00132_n955FpgTip ;
   private String[] T00132_A498FpgDsc ;
   private boolean[] T00132_n498FpgDsc ;
   private String[] T00132_A396EmprCod ;
   private String[] T001312_A396EmprCod ;
   private int[] T001312_A252CliCod ;
   private String[] T001312_A297CliPri ;
   private String[] T001313_A396EmprCod ;
   private int[] T001313_A795PrvNum ;
   private String[] T001314_A396EmprCod ;
   private long[] T001314_A30AlbProCod ;
   private String[] T001315_A396EmprCod ;
   private long[] T001315_A30AlbProCod ;
   private String[] T001316_A396EmprCod ;
   private long[] T001316_A30AlbProCod ;
   private String[] T001317_A396EmprCod ;
   private long[] T001317_A30AlbProCod ;
   private String[] T001318_A396EmprCod ;
   private long[] T001318_A30AlbProCod ;
   private String[] T001319_A396EmprCod ;
   private long[] T001319_A30AlbProCod ;
   private String[] T001320_A396EmprCod ;
   private long[] T001320_A30AlbProCod ;
   private String[] T001321_A396EmprCod ;
   private long[] T001321_A30AlbProCod ;
   private String[] T001322_A396EmprCod ;
   private long[] T001322_A30AlbProCod ;
   private String[] T001323_A396EmprCod ;
   private long[] T001323_A30AlbProCod ;
   private String[] T001324_A396EmprCod ;
   private long[] T001324_A30AlbProCod ;
   private String[] T001325_A396EmprCod ;
   private long[] T001325_A30AlbProCod ;
   private String[] T001326_A396EmprCod ;
   private long[] T001326_A30AlbProCod ;
   private String[] T001327_A396EmprCod ;
   private long[] T001327_A30AlbProCod ;
   private String[] T001328_A396EmprCod ;
   private long[] T001328_A30AlbProCod ;
   private String[] T001329_A396EmprCod ;
   private long[] T001329_A30AlbProCod ;
   private String[] T001330_A396EmprCod ;
   private long[] T001330_A30AlbProCod ;
   private String[] T001331_A396EmprCod ;
   private long[] T001331_A30AlbProCod ;
   private String[] T001332_A396EmprCod ;
   private long[] T001332_A30AlbProCod ;
   private String[] T001333_A396EmprCod ;
   private long[] T001333_A30AlbProCod ;
   private String[] T001334_A396EmprCod ;
   private long[] T001334_A30AlbProCod ;
   private String[] T001335_A396EmprCod ;
   private long[] T001335_A30AlbProCod ;
   private String[] T001336_A396EmprCod ;
   private long[] T001336_A30AlbProCod ;
   private String[] T001337_A396EmprCod ;
   private long[] T001337_A30AlbProCod ;
   private String[] T001338_A396EmprCod ;
   private long[] T001338_A30AlbProCod ;
   private String[] T001339_A396EmprCod ;
   private long[] T001339_A30AlbProCod ;
   private String[] T001340_A396EmprCod ;
   private long[] T001340_A30AlbProCod ;
   private String[] T001341_A396EmprCod ;
   private long[] T001341_A30AlbProCod ;
   private String[] T001342_A396EmprCod ;
   private long[] T001342_A30AlbProCod ;
   private String[] T001343_A396EmprCod ;
   private long[] T001343_A30AlbProCod ;
   private String[] T001344_A396EmprCod ;
   private long[] T001344_A30AlbProCod ;
   private String[] T001345_A396EmprCod ;
   private long[] T001345_A30AlbProCod ;
   private String[] T001346_A396EmprCod ;
   private long[] T001346_A30AlbProCod ;
   private String[] T001347_A396EmprCod ;
   private long[] T001347_A30AlbProCod ;
   private String[] T001348_A396EmprCod ;
   private long[] T001348_A30AlbProCod ;
   private String[] T001349_A396EmprCod ;
   private long[] T001349_A30AlbProCod ;
   private String[] T001350_A396EmprCod ;
   private long[] T001350_A30AlbProCod ;
   private String[] T001351_A396EmprCod ;
   private long[] T001351_A30AlbProCod ;
   private String[] T001352_A396EmprCod ;
   private long[] T001352_A30AlbProCod ;
   private String[] T001353_A396EmprCod ;
   private long[] T001353_A30AlbProCod ;
   private String[] T001354_A396EmprCod ;
   private long[] T001354_A30AlbProCod ;
   private String[] T001355_A396EmprCod ;
   private long[] T001355_A30AlbProCod ;
   private String[] T001356_A396EmprCod ;
   private long[] T001356_A30AlbProCod ;
   private String[] T001357_A396EmprCod ;
   private long[] T001357_A30AlbProCod ;
   private String[] T001358_A396EmprCod ;
   private long[] T001358_A30AlbProCod ;
   private String[] T001359_A396EmprCod ;
   private long[] T001359_A30AlbProCod ;
   private String[] T001360_A396EmprCod ;
   private long[] T001360_A30AlbProCod ;
   private String[] T001361_A396EmprCod ;
   private long[] T001361_A30AlbProCod ;
   private String[] T001362_A396EmprCod ;
   private long[] T001362_A30AlbProCod ;
   private String[] T001363_A396EmprCod ;
   private long[] T001363_A30AlbProCod ;
   private String[] T001364_A396EmprCod ;
   private long[] T001364_A30AlbProCod ;
   private String[] T001365_A396EmprCod ;
   private long[] T001365_A30AlbProCod ;
   private String[] T001366_A396EmprCod ;
   private long[] T001366_A30AlbProCod ;
   private String[] T001367_A396EmprCod ;
   private long[] T001367_A30AlbProCod ;
   private String[] T001368_A396EmprCod ;
   private long[] T001368_A30AlbProCod ;
   private String[] T001369_A396EmprCod ;
   private long[] T001369_A30AlbProCod ;
   private String[] T001370_A396EmprCod ;
   private long[] T001370_A30AlbProCod ;
   private String[] T001371_A396EmprCod ;
   private long[] T001371_A30AlbProCod ;
   private String[] T001372_A396EmprCod ;
   private long[] T001372_A30AlbProCod ;
   private String[] T001373_A396EmprCod ;
   private long[] T001373_A30AlbProCod ;
   private String[] T001374_A396EmprCod ;
   private long[] T001374_A30AlbProCod ;
   private String[] T001375_A396EmprCod ;
   private long[] T001375_A30AlbProCod ;
   private String[] T001376_A396EmprCod ;
   private long[] T001376_A30AlbProCod ;
   private String[] T001377_A396EmprCod ;
   private long[] T001377_A30AlbProCod ;
   private String[] T001378_A396EmprCod ;
   private long[] T001378_A30AlbProCod ;
   private String[] T001379_A396EmprCod ;
   private long[] T001379_A30AlbProCod ;
   private String[] T001380_A396EmprCod ;
   private long[] T001380_A30AlbProCod ;
   private String[] T001381_A396EmprCod ;
   private long[] T001381_A30AlbProCod ;
   private String[] T001382_A396EmprCod ;
   private long[] T001382_A30AlbProCod ;
   private String[] T001383_A396EmprCod ;
   private long[] T001383_A30AlbProCod ;
   private String[] T001384_A396EmprCod ;
   private long[] T001384_A30AlbProCod ;
   private String[] T001385_A396EmprCod ;
   private long[] T001385_A30AlbProCod ;
   private String[] T001386_A396EmprCod ;
   private long[] T001386_A30AlbProCod ;
   private String[] T001387_A396EmprCod ;
   private long[] T001387_A30AlbProCod ;
   private String[] T001388_A396EmprCod ;
   private long[] T001388_A30AlbProCod ;
   private String[] T001389_A396EmprCod ;
   private long[] T001389_A30AlbProCod ;
   private String[] T001390_A396EmprCod ;
   private long[] T001390_A30AlbProCod ;
   private String[] T001391_A396EmprCod ;
   private long[] T001391_A30AlbProCod ;
   private String[] T001392_A396EmprCod ;
   private long[] T001392_A30AlbProCod ;
   private String[] T001393_A396EmprCod ;
   private long[] T001393_A30AlbProCod ;
   private String[] T001394_A396EmprCod ;
   private long[] T001394_A30AlbProCod ;
   private String[] T001395_A396EmprCod ;
   private long[] T001395_A30AlbProCod ;
   private String[] T001396_A396EmprCod ;
   private long[] T001396_A30AlbProCod ;
   private String[] T001397_A396EmprCod ;
   private long[] T001397_A30AlbProCod ;
   private String[] T001398_A396EmprCod ;
   private long[] T001398_A30AlbProCod ;
   private String[] T001399_A396EmprCod ;
   private long[] T001399_A30AlbProCod ;
   private String[] T0013100_A396EmprCod ;
   private long[] T0013100_A30AlbProCod ;
   private String[] T0013101_A396EmprCod ;
   private long[] T0013101_A30AlbProCod ;
   private String[] T0013102_A396EmprCod ;
   private long[] T0013102_A30AlbProCod ;
   private String[] T0013103_A396EmprCod ;
   private long[] T0013103_A30AlbProCod ;
   private String[] T0013104_A396EmprCod ;
   private long[] T0013104_A30AlbProCod ;
   private String[] T0013105_A396EmprCod ;
   private long[] T0013105_A30AlbProCod ;
   private String[] T0013106_A396EmprCod ;
   private long[] T0013106_A30AlbProCod ;
   private String[] T0013107_A396EmprCod ;
   private long[] T0013107_A30AlbProCod ;
   private String[] T0013108_A396EmprCod ;
   private long[] T0013108_A30AlbProCod ;
   private String[] T0013109_A396EmprCod ;
   private long[] T0013109_A30AlbProCod ;
   private String[] T0013110_A396EmprCod ;
   private String[] T0013110_A497FpgCod ;
   private boolean[] T0013110_n497FpgCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV33FpgTip_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV29WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV30TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV34DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tforpag__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforpag__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforpag__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforpag__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforpag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00132", "SELECT FpgCod, FpgTip, FpgDsc, EmprCod FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ?  FOR UPDATE OF FpgTip, FpgDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00133", "SELECT FpgCod, FpgTip, FpgDsc, EmprCod FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00134", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00135", "SELECT /*+ FIRST_ROWS(100) */ TM1.FpgCod, TM1.FpgTip, TM1.FpgDsc, T2.EmprNom, TM1.EmprCod FROM (TXPFORPAG TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.FpgCod = ? ORDER BY TM1.EmprCod, TM1.FpgCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00136", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FpgCod FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00137", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FpgCod FROM TXPFORPAG WHERE ( FpgCod > ?) and EmprCod = ? ORDER BY EmprCod, FpgCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00138", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FpgCod FROM TXPFORPAG WHERE ( FpgCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, FpgCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00139", "INSERT INTO TXPFORPAG(FpgCod, FpgTip, FpgDsc, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPFORPAG")
         ,new UpdateCursor("T001310", "UPDATE TXPFORPAG SET FpgTip=?, FpgDsc=?  WHERE EmprCod = ? AND FpgCod = ?", GX_NOMASK, "TXPFORPAG")
         ,new UpdateCursor("T001311", "DELETE FROM TXPFORPAG  WHERE EmprCod = ? AND FpgCod = ?", GX_NOMASK, "TXPFORPAG")
         ,new ForEachCursor("T001312", "SELECT * FROM (SELECT EmprCod, CliCod, CliPri FROM TXPCLIFPG WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001313", "SELECT * FROM (SELECT EmprCod, PrvNum FROM TXPPRVGEN WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001314", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001315", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001316", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001317", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001318", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001319", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001320", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001321", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001322", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001323", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001324", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001325", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001326", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001327", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001328", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001329", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001330", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001331", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001332", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001333", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001334", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001335", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001336", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001337", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001338", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001339", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001340", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001341", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001342", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001343", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001344", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001345", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001346", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001347", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001348", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001349", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001350", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001351", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001352", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001353", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001354", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001355", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001356", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001357", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001358", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001359", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001360", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001361", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001362", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001363", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001364", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001365", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001366", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001367", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001368", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001369", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001370", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001371", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001372", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001373", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001374", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001375", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001376", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001377", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001378", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001379", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001380", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001381", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001382", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001383", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001384", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001385", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001386", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001387", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001388", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001389", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001390", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001391", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001392", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001393", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001394", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001395", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001396", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001397", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001398", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001399", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013100", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013101", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013102", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013103", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013104", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013105", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013106", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013107", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013108", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013109", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND FpgCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0013110", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FpgCod FROM TXPFORPAG WHERE EmprCod = ? ORDER BY EmprCod, FpgCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
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
                  stmt.setString(3, (String)parms[5], 30);
               }
               stmt.setString(4, (String)parms[6], 3);
               return;
            case 8 :
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
                  stmt.setString(2, (String)parms[3], 30);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 11 :
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
            case 12 :
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
            case 13 :
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
            case 14 :
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 67 :
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
            case 68 :
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
            case 69 :
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
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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
            case 83 :
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
            case 84 :
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
            case 85 :
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
            case 86 :
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
            case 87 :
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
            case 88 :
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
            case 89 :
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
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
            case 91 :
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
            case 92 :
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
            case 93 :
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
            case 94 :
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
            case 95 :
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
            case 96 :
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
            case 97 :
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
            case 98 :
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
            case 99 :
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
            case 100 :
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
            case 101 :
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
            case 102 :
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
            case 103 :
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
            case 104 :
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
            case 105 :
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
            case 106 :
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
            case 107 :
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
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

