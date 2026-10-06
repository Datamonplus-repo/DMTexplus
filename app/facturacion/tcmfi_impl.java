package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcmfi_impl extends GXDataArea
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
            AV28EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CmFi", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCoste_mca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tcmfi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcmfi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcmfi_impl.class ));
   }

   public tcmfi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCoste_mca_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCoste_mca_Internalname, httpContext.getMessage( "Custo Minuto com amortizaçoes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCoste_mca_Internalname, GXutil.ltrim( localUtil.ntoc( A5650Coste_mca, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCoste_mca_Enabled!=0) ? localUtil.format( A5650Coste_mca, "Z9.99999999") : localUtil.format( A5650Coste_mca, "Z9.99999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'8');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'8');"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCoste_mca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCoste_mca_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TCmFi.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCoste_msa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCoste_msa_Internalname, httpContext.getMessage( "Custo Minuto sem amortizaçoes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCoste_msa_Internalname, GXutil.ltrim( localUtil.ntoc( A5651Coste_msa, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCoste_msa_Enabled!=0) ? localUtil.format( A5651Coste_msa, "Z9.99999999") : localUtil.format( A5651Coste_msa, "Z9.99999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'8');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'8');"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCoste_msa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCoste_msa_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TCmFi.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFactor_in_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFactor_in_Internalname, httpContext.getMessage( "factor de ineficiência", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFactor_in_Internalname, GXutil.ltrim( localUtil.ntoc( A5652Factor_in, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFactor_in_Enabled!=0) ? localUtil.format( A5652Factor_in, "Z9.99999999") : localUtil.format( A5652Factor_in, "Z9.99999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'8');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'8');"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFactor_in_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFactor_in_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TCmFi.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TCmFi.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TCmFi.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV32Pgmname), GXutil.rtrim( localUtil.format( AV32Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TCmFi.htm");
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
      e11RC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            Z5650Coste_mca = localUtil.ctond( httpContext.cgiGet( "Z5650Coste_mca")) ;
            Z5651Coste_msa = localUtil.ctond( httpContext.cgiGet( "Z5651Coste_msa")) ;
            Z5652Factor_in = localUtil.ctond( httpContext.cgiGet( "Z5652Factor_in")) ;
            A407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            n407EmprNom = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV28EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCoste_mca_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCoste_mca_Internalname)), DecimalUtil.stringToDec("99.99999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTE_MCA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCoste_mca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5650Coste_mca = DecimalUtil.ZERO ;
               n5650Coste_mca = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5650Coste_mca", GXutil.ltrimstr( A5650Coste_mca, 11, 8));
            }
            else
            {
               A5650Coste_mca = localUtil.ctond( httpContext.cgiGet( edtCoste_mca_Internalname)) ;
               n5650Coste_mca = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5650Coste_mca", GXutil.ltrimstr( A5650Coste_mca, 11, 8));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCoste_msa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCoste_msa_Internalname)), DecimalUtil.stringToDec("99.99999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTE_MSA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCoste_msa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5651Coste_msa = DecimalUtil.ZERO ;
               n5651Coste_msa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5651Coste_msa", GXutil.ltrimstr( A5651Coste_msa, 11, 8));
            }
            else
            {
               A5651Coste_msa = localUtil.ctond( httpContext.cgiGet( edtCoste_msa_Internalname)) ;
               n5651Coste_msa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5651Coste_msa", GXutil.ltrimstr( A5651Coste_msa, 11, 8));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFactor_in_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFactor_in_Internalname)), DecimalUtil.stringToDec("99.99999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACTOR_IN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFactor_in_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5652Factor_in = DecimalUtil.ZERO ;
               n5652Factor_in = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5652Factor_in", GXutil.ltrimstr( A5652Factor_in, 11, 8));
            }
            else
            {
               A5652Factor_in = localUtil.ctond( httpContext.cgiGet( edtFactor_in_Internalname)) ;
               n5652Factor_in = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5652Factor_in", GXutil.ltrimstr( A5652Factor_in, 11, 8));
            }
            AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCmFi");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("EmprNom", GXutil.rtrim( localUtil.format( A407EmprNom, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\tcmfi:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode27 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode27 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound27 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_RC0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "");
                     AnyError = (short)(1) ;
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
                        e11RC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12RC2 ();
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
         e12RC2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllRC27( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributesRC27( ) ;
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

   public void confirm_RC0( )
   {
      beforeValidateRC27( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsRC27( ) ;
         }
         else
         {
            checkExtendedTableRC27( ) ;
            closeExtendedTableCursorsRC27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionRC0( )
   {
   }

   public void e11RC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcmfi_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char2[0] = AV28EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcmfi_impl.this.AV28EmprCod = GXv_char2[0] ;
      tcmfi_impl.this.AV27EmprNom = GXv_char3[0] ;
      tcmfi_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV26Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tcmfi_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char4[0] = AV28EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char4, GXv_char3, GXv_char2) ;
      tcmfi_impl.this.AV28EmprCod = GXv_char4[0] ;
      tcmfi_impl.this.AV27EmprNom = GXv_char3[0] ;
      tcmfi_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV29WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV29WWPContext = GXv_SdtWWPContext5[0] ;
      AV30TrnContext.fromxml(AV31WebSession.getValue("TrnContext"), null, null);
   }

   public void e12RC2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV30TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.facturacion.tcmfiww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zmRC27( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z407EmprNom = T00RC3_A407EmprNom[0] ;
            Z5650Coste_mca = T00RC3_A5650Coste_mca[0] ;
            Z5651Coste_msa = T00RC3_A5651Coste_msa[0] ;
            Z5652Factor_in = T00RC3_A5652Factor_in[0] ;
         }
         else
         {
            Z407EmprNom = A407EmprNom ;
            Z5650Coste_mca = A5650Coste_mca ;
            Z5651Coste_msa = A5651Coste_msa ;
            Z5652Factor_in = A5652Factor_in ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z5650Coste_mca = A5650Coste_mca ;
         Z5651Coste_msa = A5651Coste_msa ;
         Z5652Factor_in = A5652Factor_in ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "Facturacion.TCmFi" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         A396EmprCod = AV28EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
   }

   public void loadRC27( )
   {
      /* Using cursor T00RC4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A407EmprNom = T00RC4_A407EmprNom[0] ;
         n407EmprNom = T00RC4_n407EmprNom[0] ;
         A5650Coste_mca = T00RC4_A5650Coste_mca[0] ;
         n5650Coste_mca = T00RC4_n5650Coste_mca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5650Coste_mca", GXutil.ltrimstr( A5650Coste_mca, 11, 8));
         A5651Coste_msa = T00RC4_A5651Coste_msa[0] ;
         n5651Coste_msa = T00RC4_n5651Coste_msa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5651Coste_msa", GXutil.ltrimstr( A5651Coste_msa, 11, 8));
         A5652Factor_in = T00RC4_A5652Factor_in[0] ;
         n5652Factor_in = T00RC4_n5652Factor_in[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5652Factor_in", GXutil.ltrimstr( A5652Factor_in, 11, 8));
         zmRC27( -3) ;
      }
      pr_default.close(2);
      onLoadActionsRC27( ) ;
   }

   public void onLoadActionsRC27( )
   {
   }

   public void checkExtendedTableRC27( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsRC27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyRC27( )
   {
      /* Using cursor T00RC5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00RC3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmRC27( 3) ;
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00RC3_A396EmprCod[0] ;
         A407EmprNom = T00RC3_A407EmprNom[0] ;
         n407EmprNom = T00RC3_n407EmprNom[0] ;
         A5650Coste_mca = T00RC3_A5650Coste_mca[0] ;
         n5650Coste_mca = T00RC3_n5650Coste_mca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5650Coste_mca", GXutil.ltrimstr( A5650Coste_mca, 11, 8));
         A5651Coste_msa = T00RC3_A5651Coste_msa[0] ;
         n5651Coste_msa = T00RC3_n5651Coste_msa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5651Coste_msa", GXutil.ltrimstr( A5651Coste_msa, 11, 8));
         A5652Factor_in = T00RC3_A5652Factor_in[0] ;
         n5652Factor_in = T00RC3_n5652Factor_in[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5652Factor_in", GXutil.ltrimstr( A5652Factor_in, 11, 8));
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadRC27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKeyRC27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKeyRC27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyRC27( ) ;
      if ( RcdFound27 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T00RC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00RC6_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00RC6_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A396EmprCod = T00RC6_A396EmprCod[0] ;
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T00RC7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00RC7_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00RC7_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A396EmprCod = T00RC7_A396EmprCod[0] ;
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyRC27( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCoste_mca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertRC27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCoste_mca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateRC27( ) ;
               GX_FocusControl = edtCoste_mca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtCoste_mca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertRC27( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCoste_mca_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertRC27( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "");
         AnyError = (short)(1) ;
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCoste_mca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyRC27( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00RC2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z407EmprNom, T00RC2_A407EmprNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z5650Coste_mca, T00RC2_A5650Coste_mca[0]) != 0 ) || ( DecimalUtil.compareTo(Z5651Coste_msa, T00RC2_A5651Coste_msa[0]) != 0 ) || ( DecimalUtil.compareTo(Z5652Factor_in, T00RC2_A5652Factor_in[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z407EmprNom, T00RC2_A407EmprNom[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tcmfi:[seudo value changed for attri]"+"EmprNom");
               GXutil.writeLogRaw("Old: ",Z407EmprNom);
               GXutil.writeLogRaw("Current: ",T00RC2_A407EmprNom[0]);
            }
            if ( DecimalUtil.compareTo(Z5650Coste_mca, T00RC2_A5650Coste_mca[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tcmfi:[seudo value changed for attri]"+"Coste_mca");
               GXutil.writeLogRaw("Old: ",Z5650Coste_mca);
               GXutil.writeLogRaw("Current: ",T00RC2_A5650Coste_mca[0]);
            }
            if ( DecimalUtil.compareTo(Z5651Coste_msa, T00RC2_A5651Coste_msa[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tcmfi:[seudo value changed for attri]"+"Coste_msa");
               GXutil.writeLogRaw("Old: ",Z5651Coste_msa);
               GXutil.writeLogRaw("Current: ",T00RC2_A5651Coste_msa[0]);
            }
            if ( DecimalUtil.compareTo(Z5652Factor_in, T00RC2_A5652Factor_in[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tcmfi:[seudo value changed for attri]"+"Factor_in");
               GXutil.writeLogRaw("Old: ",Z5652Factor_in);
               GXutil.writeLogRaw("Current: ",T00RC2_A5652Factor_in[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertRC27( )
   {
      beforeValidateRC27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRC27( ) ;
      }
      if ( AnyError == 0 )
      {
         zmRC27( 0) ;
         checkOptimisticConcurrencyRC27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRC27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertRC27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RC8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n5650Coste_mca), A5650Coste_mca, Boolean.valueOf(n5651Coste_msa), A5651Coste_msa, Boolean.valueOf(n5652Factor_in), A5652Factor_in});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaptionRC0( ) ;
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
            loadRC27( ) ;
         }
         endLevelRC27( ) ;
      }
      closeExtendedTableCursorsRC27( ) ;
   }

   public void updateRC27( )
   {
      beforeValidateRC27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRC27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRC27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRC27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateRC27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RC9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n5650Coste_mca), A5650Coste_mca, Boolean.valueOf(n5651Coste_msa), A5651Coste_msa, Boolean.valueOf(n5652Factor_in), A5652Factor_in, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateRC27( ) ;
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
         endLevelRC27( ) ;
      }
      closeExtendedTableCursorsRC27( ) ;
   }

   public void deferredUpdateRC27( )
   {
   }

   public void delete( )
   {
      beforeValidateRC27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRC27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsRC27( ) ;
         afterConfirmRC27( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteRC27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00RC10 */
               pr_default.execute(8, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelRC27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsRC27( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00RC11 */
         pr_default.execute(9, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T00RC12 */
         pr_default.execute(10, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00RC13 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T00RC14 */
         pr_default.execute(12, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00RC15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00RC16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00RC17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00RC18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00RC19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00RC20 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00RC21 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00RC22 */
         pr_default.execute(20, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPRESENTANTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00RC23 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00RC24 */
         pr_default.execute(22, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maestro de Parametros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00RC25 */
         pr_default.execute(23, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Código de calidad", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00RC26 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00RC27 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGKSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00RC28 */
         pr_default.execute(26, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DKGSLA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00RC29 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00RC30 */
         pr_default.execute(28, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00RC31 */
         pr_default.execute(29, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00RC32 */
         pr_default.execute(30, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00RC33 */
         pr_default.execute(31, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00RC34 */
         pr_default.execute(32, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00RC35 */
         pr_default.execute(33, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00RC36 */
         pr_default.execute(34, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LBOTAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00RC37 */
         pr_default.execute(35, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPBOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00RC38 */
         pr_default.execute(36, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00RC39 */
         pr_default.execute(37, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00RC40 */
         pr_default.execute(38, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00RC41 */
         pr_default.execute(39, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00RC42 */
         pr_default.execute(40, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00RC43 */
         pr_default.execute(41, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00RC44 */
         pr_default.execute(42, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00RC45 */
         pr_default.execute(43, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00RC46 */
         pr_default.execute(44, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NUMTEX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00RC47 */
         pr_default.execute(45, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00RC48 */
         pr_default.execute(46, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00RC49 */
         pr_default.execute(47, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00RC50 */
         pr_default.execute(48, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00RC51 */
         pr_default.execute(49, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENVTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00RC52 */
         pr_default.execute(50, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00RC53 */
         pr_default.execute(51, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00RC54 */
         pr_default.execute(52, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00RC55 */
         pr_default.execute(53, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00RC56 */
         pr_default.execute(54, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00RC57 */
         pr_default.execute(55, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00RC58 */
         pr_default.execute(56, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00RC59 */
         pr_default.execute(57, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00RC60 */
         pr_default.execute(58, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MANUFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00RC61 */
         pr_default.execute(59, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00RC62 */
         pr_default.execute(60, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00RC63 */
         pr_default.execute(61, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T00RC64 */
         pr_default.execute(62, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T00RC65 */
         pr_default.execute(63, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T00RC66 */
         pr_default.execute(64, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T00RC67 */
         pr_default.execute(65, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARLAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T00RC68 */
         pr_default.execute(66, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T00RC69 */
         pr_default.execute(67, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T00RC70 */
         pr_default.execute(68, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZONGEO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T00RC71 */
         pr_default.execute(69, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T00RC72 */
         pr_default.execute(70, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T00RC73 */
         pr_default.execute(71, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T00RC74 */
         pr_default.execute(72, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTMAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T00RC75 */
         pr_default.execute(73, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TUBOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T00RC76 */
         pr_default.execute(74, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T00RC77 */
         pr_default.execute(75, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T00RC78 */
         pr_default.execute(76, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DESTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T00RC79 */
         pr_default.execute(77, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTRAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T00RC80 */
         pr_default.execute(78, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T00RC81 */
         pr_default.execute(79, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LECTOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T00RC82 */
         pr_default.execute(80, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TURNOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T00RC83 */
         pr_default.execute(81, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T00RC84 */
         pr_default.execute(82, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T00RC85 */
         pr_default.execute(83, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T00RC86 */
         pr_default.execute(84, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T00RC87 */
         pr_default.execute(85, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T00RC88 */
         pr_default.execute(86, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T00RC89 */
         pr_default.execute(87, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T00RC90 */
         pr_default.execute(88, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T00RC91 */
         pr_default.execute(89, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UNMEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T00RC92 */
         pr_default.execute(90, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TRANSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T00RC93 */
         pr_default.execute(91, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPVAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T00RC94 */
         pr_default.execute(92, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPUNI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T00RC95 */
         pr_default.execute(93, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T00RC96 */
         pr_default.execute(94, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T00RC97 */
         pr_default.execute(95, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T00RC98 */
         pr_default.execute(96, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T00RC99 */
         pr_default.execute(97, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T00RC100 */
         pr_default.execute(98, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T00RC101 */
         pr_default.execute(99, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T00RC102 */
         pr_default.execute(100, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPROFO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T00RC103 */
         pr_default.execute(101, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T00RC104 */
         pr_default.execute(102, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T00RC105 */
         pr_default.execute(103, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T00RC106 */
         pr_default.execute(104, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T00RC107 */
         pr_default.execute(105, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T00RC108 */
         pr_default.execute(106, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPERAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T00RC109 */
         pr_default.execute(107, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor T00RC110 */
         pr_default.execute(108, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATICE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor T00RC111 */
         pr_default.execute(109, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQUIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
         /* Using cursor T00RC112 */
         pr_default.execute(110, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(110) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INTENS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(110);
         /* Using cursor T00RC113 */
         pr_default.execute(111, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(111) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(111);
         /* Using cursor T00RC114 */
         pr_default.execute(112, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(112) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRUOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(112);
         /* Using cursor T00RC115 */
         pr_default.execute(113, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
         /* Using cursor T00RC116 */
         pr_default.execute(114, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(114) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUFAM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(114);
         /* Using cursor T00RC117 */
         pr_default.execute(115, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(115) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(115);
         /* Using cursor T00RC118 */
         pr_default.execute(116, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(116) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(116);
         /* Using cursor T00RC119 */
         pr_default.execute(117, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFAVEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor T00RC120 */
         pr_default.execute(118, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EMPLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor T00RC121 */
         pr_default.execute(119, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
         /* Using cursor T00RC122 */
         pr_default.execute(120, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(120) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(120);
         /* Using cursor T00RC123 */
         pr_default.execute(121, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(121) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(121);
         /* Using cursor T00RC124 */
         pr_default.execute(122, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(122) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(122);
         /* Using cursor T00RC125 */
         pr_default.execute(123, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(123) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(123);
         /* Using cursor T00RC126 */
         pr_default.execute(124, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(124) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(124);
         /* Using cursor T00RC127 */
         pr_default.execute(125, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(125) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(125);
         /* Using cursor T00RC128 */
         pr_default.execute(126, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(126) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CIETIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(126);
         /* Using cursor T00RC129 */
         pr_default.execute(127, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(127) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(127);
         /* Using cursor T00RC130 */
         pr_default.execute(128, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(128) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(128);
         /* Using cursor T00RC131 */
         pr_default.execute(129, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(129) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(129);
         /* Using cursor T00RC132 */
         pr_default.execute(130, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(130) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(130);
         /* Using cursor T00RC133 */
         pr_default.execute(131, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(131) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(131);
      }
   }

   public void endLevelRC27( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteRC27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tcmfi");
         if ( AnyError == 0 )
         {
            confirmValuesRC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tcmfi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartRC27( )
   {
      /* Scan By routine */
      /* Using cursor T00RC134 */
      pr_default.execute(132);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(132) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00RC134_A396EmprCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextRC27( )
   {
      /* Scan next routine */
      pr_default.readNext(132);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(132) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00RC134_A396EmprCod[0] ;
      }
   }

   public void scanEndRC27( )
   {
      pr_default.close(132);
   }

   public void afterConfirmRC27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertRC27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateRC27( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteRC27( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteRC27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateRC27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesRC27( )
   {
      edtCoste_mca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCoste_mca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCoste_mca_Enabled), 5, 0), true);
      edtCoste_msa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCoste_msa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCoste_msa_Enabled), 5, 0), true);
      edtFactor_in_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFactor_in_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFactor_in_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesRC27( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesRC0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tcmfi", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod))}, new String[] {"Gx_mode","EmprCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCmFi");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("EmprNom", GXutil.rtrim( localUtil.format( A407EmprNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tcmfi:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5650Coste_mca", GXutil.ltrim( localUtil.ntoc( Z5650Coste_mca, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5651Coste_msa", GXutil.ltrim( localUtil.ntoc( Z5651Coste_msa, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5652Factor_in", GXutil.ltrim( localUtil.ntoc( Z5652Factor_in, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      return formatLink("app.facturacion.tcmfi", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod))}, new String[] {"Gx_mode","EmprCod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TCmFi" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CmFi", "") ;
   }

   public void initializeNonKeyRC27( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A5650Coste_mca = DecimalUtil.ZERO ;
      n5650Coste_mca = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5650Coste_mca", GXutil.ltrimstr( A5650Coste_mca, 11, 8));
      A5651Coste_msa = DecimalUtil.ZERO ;
      n5651Coste_msa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5651Coste_msa", GXutil.ltrimstr( A5651Coste_msa, 11, 8));
      A5652Factor_in = DecimalUtil.ZERO ;
      n5652Factor_in = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5652Factor_in", GXutil.ltrimstr( A5652Factor_in, 11, 8));
      Z407EmprNom = "" ;
      Z5650Coste_mca = DecimalUtil.ZERO ;
      Z5651Coste_msa = DecimalUtil.ZERO ;
      Z5652Factor_in = DecimalUtil.ZERO ;
   }

   public void initAllRC27( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      initializeNonKeyRC27( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241525751", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tcmfi.js", "?20268241525751", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCoste_mca_Internalname = "COSTE_MCA" ;
      edtCoste_msa_Internalname = "COSTE_MSA" ;
      edtFactor_in_Internalname = "FACTOR_IN" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
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
      Form.setCaption( httpContext.getMessage( "CmFi", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFactor_in_Jsonclick = "" ;
      edtFactor_in_Enabled = 1 ;
      edtCoste_msa_Jsonclick = "" ;
      edtCoste_msa_Enabled = 1 ;
      edtCoste_mca_Jsonclick = "" ;
      edtCoste_mca_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12RC2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
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
      wcpOAV28EmprCod = "" ;
      Z396EmprCod = "" ;
      Z407EmprNom = "" ;
      Z5650Coste_mca = DecimalUtil.ZERO ;
      Z5651Coste_msa = DecimalUtil.ZERO ;
      Z5652Factor_in = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV28EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A5650Coste_mca = DecimalUtil.ZERO ;
      A5651Coste_msa = DecimalUtil.ZERO ;
      A5652Factor_in = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      AV32Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A407EmprNom = "" ;
      A396EmprCod = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode27 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV26Station = "" ;
      AV27EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV29WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV30TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV31WebSession = httpContext.getWebSession();
      T00RC4_A396EmprCod = new String[] {""} ;
      T00RC4_A407EmprNom = new String[] {""} ;
      T00RC4_n407EmprNom = new boolean[] {false} ;
      T00RC4_A5650Coste_mca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC4_n5650Coste_mca = new boolean[] {false} ;
      T00RC4_A5651Coste_msa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC4_n5651Coste_msa = new boolean[] {false} ;
      T00RC4_A5652Factor_in = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC4_n5652Factor_in = new boolean[] {false} ;
      T00RC5_A396EmprCod = new String[] {""} ;
      T00RC3_A396EmprCod = new String[] {""} ;
      T00RC3_A407EmprNom = new String[] {""} ;
      T00RC3_n407EmprNom = new boolean[] {false} ;
      T00RC3_A5650Coste_mca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC3_n5650Coste_mca = new boolean[] {false} ;
      T00RC3_A5651Coste_msa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC3_n5651Coste_msa = new boolean[] {false} ;
      T00RC3_A5652Factor_in = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC3_n5652Factor_in = new boolean[] {false} ;
      T00RC6_A396EmprCod = new String[] {""} ;
      T00RC7_A396EmprCod = new String[] {""} ;
      T00RC2_A396EmprCod = new String[] {""} ;
      T00RC2_A407EmprNom = new String[] {""} ;
      T00RC2_n407EmprNom = new boolean[] {false} ;
      T00RC2_A5650Coste_mca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC2_n5650Coste_mca = new boolean[] {false} ;
      T00RC2_A5651Coste_msa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC2_n5651Coste_msa = new boolean[] {false} ;
      T00RC2_A5652Factor_in = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC2_n5652Factor_in = new boolean[] {false} ;
      T00RC11_A396EmprCod = new String[] {""} ;
      T00RC11_A3331LanBroCod = new byte[1] ;
      T00RC12_A396EmprCod = new String[] {""} ;
      T00RC12_A252CliCod = new int[1] ;
      T00RC12_n252CliCod = new boolean[] {false} ;
      T00RC12_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC13_A396EmprCod = new String[] {""} ;
      T00RC13_A252CliCod = new int[1] ;
      T00RC13_n252CliCod = new boolean[] {false} ;
      T00RC13_A65ArtCod = new String[] {""} ;
      T00RC13_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RC14_A396EmprCod = new String[] {""} ;
      T00RC14_A3316CodSol = new short[1] ;
      T00RC15_A396EmprCod = new String[] {""} ;
      T00RC15_A3288CCalCod = new String[] {""} ;
      T00RC16_A396EmprCod = new String[] {""} ;
      T00RC16_A3253SolTraCod = new int[1] ;
      T00RC16_A3269SolTraLin = new byte[1] ;
      T00RC17_A396EmprCod = new String[] {""} ;
      T00RC17_A3235SolSubCod = new int[1] ;
      T00RC17_A3251SolSubLin = new byte[1] ;
      T00RC18_A396EmprCod = new String[] {""} ;
      T00RC18_A3218SolLuzCod = new int[1] ;
      T00RC18_A3233SolLuzLin = new byte[1] ;
      T00RC19_A396EmprCod = new String[] {""} ;
      T00RC19_A3196SolFriCod = new int[1] ;
      T00RC19_A3216SolFriLin = new byte[1] ;
      T00RC20_A396EmprCod = new String[] {""} ;
      T00RC20_A3165SolPilCod = new int[1] ;
      T00RC20_A3185SolPilLin = new byte[1] ;
      T00RC21_A396EmprCod = new String[] {""} ;
      T00RC21_A3153CodCod = new String[] {""} ;
      T00RC22_A396EmprCod = new String[] {""} ;
      T00RC22_A3073RepCod = new String[] {""} ;
      T00RC23_A396EmprCod = new String[] {""} ;
      T00RC23_A3061Codia = new byte[1] ;
      T00RC23_A3062CoMes = new byte[1] ;
      T00RC23_A3063CoAny = new short[1] ;
      T00RC24_A396EmprCod = new String[] {""} ;
      T00RC24_A3047LOParId = new String[] {""} ;
      T00RC25_A396EmprCod = new String[] {""} ;
      T00RC25_A3033CCCod = new String[] {""} ;
      T00RC26_A396EmprCod = new String[] {""} ;
      T00RC26_A2971SabFacCod = new int[1] ;
      T00RC27_A396EmprCod = new String[] {""} ;
      T00RC27_A2954TiDia = new byte[1] ;
      T00RC27_A2955TiMes = new byte[1] ;
      T00RC27_A2956TiAny = new short[1] ;
      T00RC28_A396EmprCod = new String[] {""} ;
      T00RC28_A2942LzaDia = new byte[1] ;
      T00RC28_A2943LzaMes = new byte[1] ;
      T00RC28_A2944LzaAny = new short[1] ;
      T00RC29_A396EmprCod = new String[] {""} ;
      T00RC29_A252CliCod = new int[1] ;
      T00RC29_n252CliCod = new boolean[] {false} ;
      T00RC29_A65ArtCod = new String[] {""} ;
      T00RC29_A2937RecIntCod = new byte[1] ;
      T00RC30_A396EmprCod = new String[] {""} ;
      T00RC30_A252CliCod = new int[1] ;
      T00RC30_n252CliCod = new boolean[] {false} ;
      T00RC30_A2933RecTipCon = new short[1] ;
      T00RC31_A396EmprCod = new String[] {""} ;
      T00RC31_A252CliCod = new int[1] ;
      T00RC31_n252CliCod = new boolean[] {false} ;
      T00RC31_A65ArtCod = new String[] {""} ;
      T00RC31_A2931Limite2 = new short[1] ;
      T00RC32_A396EmprCod = new String[] {""} ;
      T00RC32_A252CliCod = new int[1] ;
      T00RC32_n252CliCod = new boolean[] {false} ;
      T00RC32_A2927RecProCod = new String[] {""} ;
      T00RC33_A396EmprCod = new String[] {""} ;
      T00RC33_A2921HisProTiCo = new String[] {""} ;
      T00RC33_A2922HisProTiLP = new short[1] ;
      T00RC33_A2913HisProTiFe = new java.util.Date[] {GXutil.nullDate()} ;
      T00RC33_A2923HisProTiL = new short[1] ;
      T00RC34_A396EmprCod = new String[] {""} ;
      T00RC34_A252CliCod = new int[1] ;
      T00RC34_n252CliCod = new boolean[] {false} ;
      T00RC34_A2891HMaForSer = new String[] {""} ;
      T00RC34_A2892HMaForCNom = new String[] {""} ;
      T00RC34_A2893HMaForCNum = new int[1] ;
      T00RC34_A2894HMaTipCCod = new byte[1] ;
      T00RC34_A2895HMaForNumC = new int[1] ;
      T00RC34_A2897HMaColLin = new short[1] ;
      T00RC34_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00RC34_A2907HmaLin = new short[1] ;
      T00RC35_A396EmprCod = new String[] {""} ;
      T00RC35_A129BarCod = new int[1] ;
      T00RC35_n129BarCod = new boolean[] {false} ;
      T00RC35_A132BarCodReo = new byte[1] ;
      T00RC35_n132BarCodReo = new boolean[] {false} ;
      T00RC35_A130BarCodPar = new String[] {""} ;
      T00RC35_n130BarCodPar = new boolean[] {false} ;
      T00RC35_A2872HAnRLinMaq = new short[1] ;
      T00RC35_A2873HAnRLinPro = new byte[1] ;
      T00RC35_A2874HAnRLin = new short[1] ;
      T00RC35_A2875HAnNumAny = new byte[1] ;
      T00RC36_A396EmprCod = new String[] {""} ;
      T00RC36_A2855CodBota = new int[1] ;
      T00RC36_A2859BotLin = new short[1] ;
      T00RC37_A396EmprCod = new String[] {""} ;
      T00RC37_A2853TipBotCod = new byte[1] ;
      T00RC38_A396EmprCod = new String[] {""} ;
      T00RC38_A2817PlaTer = new String[] {""} ;
      T00RC38_A2818PlaOrd = new short[1] ;
      T00RC39_A396EmprCod = new String[] {""} ;
      T00RC39_A2809MetTerCod = new String[] {""} ;
      T00RC39_A129BarCod = new int[1] ;
      T00RC39_n129BarCod = new boolean[] {false} ;
      T00RC39_A132BarCodReo = new byte[1] ;
      T00RC39_n132BarCodReo = new boolean[] {false} ;
      T00RC39_A130BarCodPar = new String[] {""} ;
      T00RC39_n130BarCodPar = new boolean[] {false} ;
      T00RC40_A396EmprCod = new String[] {""} ;
      T00RC40_A129BarCod = new int[1] ;
      T00RC40_n129BarCod = new boolean[] {false} ;
      T00RC40_A132BarCodReo = new byte[1] ;
      T00RC40_n132BarCodReo = new boolean[] {false} ;
      T00RC40_A130BarCodPar = new String[] {""} ;
      T00RC40_n130BarCodPar = new boolean[] {false} ;
      T00RC40_A2808RecLinMAL = new short[1] ;
      T00RC40_A1377RecNumAny = new byte[1] ;
      T00RC40_A719PrdNum = new String[] {""} ;
      T00RC41_A396EmprCod = new String[] {""} ;
      T00RC41_A2792TermiCod = new String[] {""} ;
      T00RC41_A129BarCod = new int[1] ;
      T00RC41_n129BarCod = new boolean[] {false} ;
      T00RC41_A132BarCodReo = new byte[1] ;
      T00RC41_n132BarCodReo = new boolean[] {false} ;
      T00RC41_A130BarCodPar = new String[] {""} ;
      T00RC41_n130BarCodPar = new boolean[] {false} ;
      T00RC42_A396EmprCod = new String[] {""} ;
      T00RC42_A30AlbProCod = new long[1] ;
      T00RC42_A129BarCod = new int[1] ;
      T00RC42_n129BarCod = new boolean[] {false} ;
      T00RC42_A132BarCodReo = new byte[1] ;
      T00RC42_n132BarCodReo = new boolean[] {false} ;
      T00RC42_A130BarCodPar = new String[] {""} ;
      T00RC42_n130BarCodPar = new boolean[] {false} ;
      T00RC42_A2764AlbHdrLin = new short[1] ;
      T00RC43_A396EmprCod = new String[] {""} ;
      T00RC43_A252CliCod = new int[1] ;
      T00RC43_n252CliCod = new boolean[] {false} ;
      T00RC43_A65ArtCod = new String[] {""} ;
      T00RC43_A71ArtEstAny = new short[1] ;
      T00RC43_A2756ArtEstSer = new String[] {""} ;
      T00RC44_A396EmprCod = new String[] {""} ;
      T00RC44_A252CliCod = new int[1] ;
      T00RC44_n252CliCod = new boolean[] {false} ;
      T00RC44_A425EstAny = new short[1] ;
      T00RC44_A2755EstSerFac = new String[] {""} ;
      T00RC45_A396EmprCod = new String[] {""} ;
      T00RC45_A2730RecTipCo = new short[1] ;
      T00RC45_A252CliCod = new int[1] ;
      T00RC45_n252CliCod = new boolean[] {false} ;
      T00RC46_A396EmprCod = new String[] {""} ;
      T00RC46_A2707NumTexCod = new String[] {""} ;
      T00RC47_A396EmprCod = new String[] {""} ;
      T00RC47_A129BarCod = new int[1] ;
      T00RC47_n129BarCod = new boolean[] {false} ;
      T00RC47_A132BarCodReo = new byte[1] ;
      T00RC47_n132BarCodReo = new boolean[] {false} ;
      T00RC47_A130BarCodPar = new String[] {""} ;
      T00RC47_n130BarCodPar = new boolean[] {false} ;
      T00RC47_A2494BarDosPro = new String[] {""} ;
      T00RC47_A719PrdNum = new String[] {""} ;
      T00RC48_A396EmprCod = new String[] {""} ;
      T00RC48_A658PedCod = new int[1] ;
      T00RC48_A2501PedObsLin = new byte[1] ;
      T00RC49_A396EmprCod = new String[] {""} ;
      T00RC49_A129BarCod = new int[1] ;
      T00RC49_n129BarCod = new boolean[] {false} ;
      T00RC49_A132BarCodReo = new byte[1] ;
      T00RC49_n132BarCodReo = new boolean[] {false} ;
      T00RC49_A130BarCodPar = new String[] {""} ;
      T00RC49_n130BarCodPar = new boolean[] {false} ;
      T00RC49_A2457BarObLin = new short[1] ;
      T00RC50_A396EmprCod = new String[] {""} ;
      T00RC50_A129BarCod = new int[1] ;
      T00RC50_n129BarCod = new boolean[] {false} ;
      T00RC50_A132BarCodReo = new byte[1] ;
      T00RC50_n132BarCodReo = new boolean[] {false} ;
      T00RC50_A130BarCodPar = new String[] {""} ;
      T00RC50_n130BarCodPar = new boolean[] {false} ;
      T00RC50_A2444BarEnLin = new short[1] ;
      T00RC51_A396EmprCod = new String[] {""} ;
      T00RC51_A2429TerBarCod = new int[1] ;
      T00RC51_A2431TerBarReo = new byte[1] ;
      T00RC51_A2430TerBarPar = new String[] {""} ;
      T00RC52_A396EmprCod = new String[] {""} ;
      T00RC52_A2420OpeAntCod = new int[1] ;
      T00RC53_A396EmprCod = new String[] {""} ;
      T00RC53_A2406ExhAlbCod = new int[1] ;
      T00RC53_A2416ExhObsLin = new short[1] ;
      T00RC54_A396EmprCod = new String[] {""} ;
      T00RC54_A2406ExhAlbCod = new int[1] ;
      T00RC54_A129BarCod = new int[1] ;
      T00RC54_n129BarCod = new boolean[] {false} ;
      T00RC54_A132BarCodReo = new byte[1] ;
      T00RC54_n132BarCodReo = new boolean[] {false} ;
      T00RC54_A130BarCodPar = new String[] {""} ;
      T00RC54_n130BarCodPar = new boolean[] {false} ;
      T00RC55_A396EmprCod = new String[] {""} ;
      T00RC55_A14AlbComCod = new int[1] ;
      T00RC55_A2386AlbCObsLin = new byte[1] ;
      T00RC56_A396EmprCod = new String[] {""} ;
      T00RC56_A2382AbcTerCod = new String[] {""} ;
      T00RC56_A2381AbcSec = new String[] {""} ;
      T00RC56_A252CliCod = new int[1] ;
      T00RC56_n252CliCod = new boolean[] {false} ;
      T00RC57_A396EmprCod = new String[] {""} ;
      T00RC57_A252CliCod = new int[1] ;
      T00RC57_n252CliCod = new boolean[] {false} ;
      T00RC57_A2308CliDesCod = new int[1] ;
      T00RC58_A396EmprCod = new String[] {""} ;
      T00RC58_A2268MovParCod = new String[] {""} ;
      T00RC58_A252CliCod = new int[1] ;
      T00RC58_n252CliCod = new boolean[] {false} ;
      T00RC58_A2276MovParLin = new short[1] ;
      T00RC59_A396EmprCod = new String[] {""} ;
      T00RC59_A2253SalExtAlb = new int[1] ;
      T00RC59_A129BarCod = new int[1] ;
      T00RC59_n129BarCod = new boolean[] {false} ;
      T00RC59_A132BarCodReo = new byte[1] ;
      T00RC59_n132BarCodReo = new boolean[] {false} ;
      T00RC59_A130BarCodPar = new String[] {""} ;
      T00RC59_n130BarCodPar = new boolean[] {false} ;
      T00RC60_A396EmprCod = new String[] {""} ;
      T00RC60_A2248ManCod = new short[1] ;
      T00RC61_A396EmprCod = new String[] {""} ;
      T00RC61_A44AlbRecCod = new int[1] ;
      T00RC61_A2159AlbRecPie = new String[] {""} ;
      T00RC62_A396EmprCod = new String[] {""} ;
      T00RC62_A44AlbRecCod = new int[1] ;
      T00RC62_A2165HisEmpLin = new short[1] ;
      T00RC63_A396EmprCod = new String[] {""} ;
      T00RC63_A1794GruLecMaq = new String[] {""} ;
      T00RC63_A1795GruOrd = new byte[1] ;
      T00RC63_A1791GruBarCod = new int[1] ;
      T00RC63_A1793GruBarReo = new byte[1] ;
      T00RC63_A1792GruBarPar = new String[] {""} ;
      T00RC64_A396EmprCod = new String[] {""} ;
      T00RC64_A1664ParFasCod = new short[1] ;
      T00RC65_A396EmprCod = new String[] {""} ;
      T00RC65_A1514MacProCod = new String[] {""} ;
      T00RC66_A396EmprCod = new String[] {""} ;
      T00RC66_A252CliCod = new int[1] ;
      T00RC66_n252CliCod = new boolean[] {false} ;
      T00RC66_A1504CliProCod = new String[] {""} ;
      T00RC66_A65ArtCod = new String[] {""} ;
      T00RC67_A396EmprCod = new String[] {""} ;
      T00RC67_A1438BarTerCod = new String[] {""} ;
      T00RC67_A172BarLanLin = new short[1] ;
      T00RC68_A396EmprCod = new String[] {""} ;
      T00RC68_A1387AlbPrvCod = new int[1] ;
      T00RC69_A396EmprCod = new String[] {""} ;
      T00RC69_A44AlbRecCod = new int[1] ;
      T00RC69_A1299AlbRLin = new byte[1] ;
      T00RC70_A396EmprCod = new String[] {""} ;
      T00RC70_A858ZonGeoCod = new short[1] ;
      T00RC71_A396EmprCod = new String[] {""} ;
      T00RC71_A1348SolColCod = new int[1] ;
      T00RC71_A1351SolColLin = new byte[1] ;
      T00RC72_A396EmprCod = new String[] {""} ;
      T00RC72_A1333EstDimCod = new int[1] ;
      T00RC72_A1339EstDimLin = new byte[1] ;
      T00RC73_A396EmprCod = new String[] {""} ;
      T00RC73_A1314EnsLabCod = new int[1] ;
      T00RC74_A396EmprCod = new String[] {""} ;
      T00RC74_A252CliCod = new int[1] ;
      T00RC74_n252CliCod = new boolean[] {false} ;
      T00RC74_A1213TalCod = new String[] {""} ;
      T00RC74_A1293EntMarRef = new String[] {""} ;
      T00RC75_A396EmprCod = new String[] {""} ;
      T00RC75_A1206TubCod = new short[1] ;
      T00RC76_A396EmprCod = new String[] {""} ;
      T00RC76_A252CliCod = new int[1] ;
      T00RC76_n252CliCod = new boolean[] {false} ;
      T00RC76_A1213TalCod = new String[] {""} ;
      T00RC76_A1217EntMalLin = new short[1] ;
      T00RC77_A396EmprCod = new String[] {""} ;
      T00RC77_A1199MacCod = new int[1] ;
      T00RC78_A396EmprCod = new String[] {""} ;
      T00RC78_A1209DesCod = new short[1] ;
      T00RC79_A396EmprCod = new String[] {""} ;
      T00RC79_A1211TipEntCod = new short[1] ;
      T00RC80_A396EmprCod = new String[] {""} ;
      T00RC80_A688PrdComCod = new String[] {""} ;
      T00RC81_A396EmprCod = new String[] {""} ;
      T00RC81_A1166LecMaqCod = new String[] {""} ;
      T00RC82_A396EmprCod = new String[] {""} ;
      T00RC82_A1161TurnCod = new byte[1] ;
      T00RC83_A396EmprCod = new String[] {""} ;
      T00RC83_A1146DisDisCod = new int[1] ;
      T00RC83_A1139DisBarCod = new int[1] ;
      T00RC83_A1140DisBarReo = new byte[1] ;
      T00RC83_A1141DisBarPar = new String[] {""} ;
      T00RC84_A396EmprCod = new String[] {""} ;
      T00RC84_A996TipCon = new short[1] ;
      T00RC85_A396EmprCod = new String[] {""} ;
      T00RC85_A970ProceCod = new short[1] ;
      T00RC86_A396EmprCod = new String[] {""} ;
      T00RC86_A30AlbProCod = new long[1] ;
      T00RC86_A915AlbPObsLin = new byte[1] ;
      T00RC87_A396EmprCod = new String[] {""} ;
      T00RC87_A910Workstat = new String[] {""} ;
      T00RC88_A396EmprCod = new String[] {""} ;
      T00RC88_A129BarCod = new int[1] ;
      T00RC88_n129BarCod = new boolean[] {false} ;
      T00RC88_A132BarCodReo = new byte[1] ;
      T00RC88_n132BarCodReo = new boolean[] {false} ;
      T00RC88_A130BarCodPar = new String[] {""} ;
      T00RC88_n130BarCodPar = new boolean[] {false} ;
      T00RC88_A906ObsReoLin = new byte[1] ;
      T00RC89_A396EmprCod = new String[] {""} ;
      T00RC89_A656ParCod = new short[1] ;
      T00RC90_A396EmprCod = new String[] {""} ;
      T00RC90_A859CumCodCont = new int[1] ;
      T00RC91_A396EmprCod = new String[] {""} ;
      T00RC91_A490ForPrdUMe = new byte[1] ;
      T00RC92_A396EmprCod = new String[] {""} ;
      T00RC92_A840TrnCod = new short[1] ;
      T00RC93_A396EmprCod = new String[] {""} ;
      T00RC93_A856ValCod = new byte[1] ;
      T00RC94_A396EmprCod = new String[] {""} ;
      T00RC94_A848UniCod = new byte[1] ;
      T00RC95_A396EmprCod = new String[] {""} ;
      T00RC95_A687PrdCod = new byte[1] ;
      T00RC96_A396EmprCod = new String[] {""} ;
      T00RC96_A835TipDtoCod = new byte[1] ;
      T00RC97_A396EmprCod = new String[] {""} ;
      T00RC97_A833TipDefCod = new short[1] ;
      T00RC98_A396EmprCod = new String[] {""} ;
      T00RC98_A831TipColCod = new byte[1] ;
      T00RC99_A396EmprCod = new String[] {""} ;
      T00RC99_A829TipArtCod = new short[1] ;
      T00RC100_A396EmprCod = new String[] {""} ;
      T00RC100_A719PrdNum = new String[] {""} ;
      T00RC100_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00RC101_A396EmprCod = new String[] {""} ;
      T00RC101_A252CliCod = new int[1] ;
      T00RC101_n252CliCod = new boolean[] {false} ;
      T00RC101_A65ArtCod = new String[] {""} ;
      T00RC101_A598LinRec = new byte[1] ;
      T00RC102_A396EmprCod = new String[] {""} ;
      T00RC102_A764ProForCod = new String[] {""} ;
      T00RC103_A396EmprCod = new String[] {""} ;
      T00RC103_A758ProCod = new String[] {""} ;
      T00RC104_A396EmprCod = new String[] {""} ;
      T00RC104_A252CliCod = new int[1] ;
      T00RC104_n252CliCod = new boolean[] {false} ;
      T00RC104_A457FasCod = new String[] {""} ;
      T00RC105_A396EmprCod = new String[] {""} ;
      T00RC105_A719PrdNum = new String[] {""} ;
      T00RC105_A681PrdAny = new short[1] ;
      T00RC106_A396EmprCod = new String[] {""} ;
      T00RC106_A719PrdNum = new String[] {""} ;
      T00RC106_A680PrdAltNum = new String[] {""} ;
      T00RC107_A396EmprCod = new String[] {""} ;
      T00RC107_A658PedCod = new int[1] ;
      T00RC107_A719PrdNum = new String[] {""} ;
      T00RC108_A396EmprCod = new String[] {""} ;
      T00RC108_A652OpeCod = new int[1] ;
      T00RC109_A396EmprCod = new String[] {""} ;
      T00RC109_A629MetCod = new byte[1] ;
      T00RC110_A396EmprCod = new String[] {""} ;
      T00RC110_A626MatCod = new short[1] ;
      T00RC111_A396EmprCod = new String[] {""} ;
      T00RC111_A602MaqCod = new String[] {""} ;
      T00RC112_A396EmprCod = new String[] {""} ;
      T00RC112_A583IntCod = new byte[1] ;
      T00RC113_A396EmprCod = new String[] {""} ;
      T00RC113_A506HbaBarCod = new int[1] ;
      T00RC113_A508HbaBarReo = new byte[1] ;
      T00RC113_A507HbaBarPar = new String[] {""} ;
      T00RC114_A396EmprCod = new String[] {""} ;
      T00RC114_A503GruOpeCod = new int[1] ;
      T00RC115_A396EmprCod = new String[] {""} ;
      T00RC115_A501GruMaqCod = new String[] {""} ;
      T00RC116_A396EmprCod = new String[] {""} ;
      T00RC116_A499GrpFamCod = new byte[1] ;
      T00RC117_A396EmprCod = new String[] {""} ;
      T00RC117_A497FpgCod = new String[] {""} ;
      T00RC118_A396EmprCod = new String[] {""} ;
      T00RC118_A457FasCod = new String[] {""} ;
      T00RC118_A463FasNumLin = new byte[1] ;
      T00RC119_A396EmprCod = new String[] {""} ;
      T00RC119_A430FacCod = new int[1] ;
      T00RC120_A396EmprCod = new String[] {""} ;
      T00RC120_A313ContCod = new String[] {""} ;
      T00RC121_A396EmprCod = new String[] {""} ;
      T00RC121_A361DisCod = new int[1] ;
      T00RC121_A376DisObsLin = new byte[1] ;
      T00RC122_A396EmprCod = new String[] {""} ;
      T00RC122_A361DisCod = new int[1] ;
      T00RC122_A44AlbRecCod = new int[1] ;
      T00RC123_A396EmprCod = new String[] {""} ;
      T00RC123_A486ForNumCol = new int[1] ;
      T00RC124_A396EmprCod = new String[] {""} ;
      T00RC124_A323DevGenCod = new int[1] ;
      T00RC125_A396EmprCod = new String[] {""} ;
      T00RC125_A719PrdNum = new String[] {""} ;
      T00RC125_A647NumCon = new int[1] ;
      T00RC126_A396EmprCod = new String[] {""} ;
      T00RC126_A252CliCod = new int[1] ;
      T00RC126_n252CliCod = new boolean[] {false} ;
      T00RC126_A287CliPagLin = new byte[1] ;
      T00RC127_A396EmprCod = new String[] {""} ;
      T00RC127_A252CliCod = new int[1] ;
      T00RC127_n252CliCod = new boolean[] {false} ;
      T00RC127_A266CliEnvLin = new byte[1] ;
      T00RC128_A396EmprCod = new String[] {""} ;
      T00RC128_A241CieBarCod = new int[1] ;
      T00RC128_A243CieBarReo = new byte[1] ;
      T00RC128_A242CieBarPar = new String[] {""} ;
      T00RC129_A396EmprCod = new String[] {""} ;
      T00RC129_A129BarCod = new int[1] ;
      T00RC129_n129BarCod = new boolean[] {false} ;
      T00RC129_A132BarCodReo = new byte[1] ;
      T00RC129_n132BarCodReo = new boolean[] {false} ;
      T00RC129_A130BarCodPar = new String[] {""} ;
      T00RC129_n130BarCodPar = new boolean[] {false} ;
      T00RC129_A200BarPieCod = new String[] {""} ;
      T00RC130_A396EmprCod = new String[] {""} ;
      T00RC130_A129BarCod = new int[1] ;
      T00RC130_n129BarCod = new boolean[] {false} ;
      T00RC130_A132BarCodReo = new byte[1] ;
      T00RC130_n132BarCodReo = new boolean[] {false} ;
      T00RC130_A130BarCodPar = new String[] {""} ;
      T00RC130_n130BarCodPar = new boolean[] {false} ;
      T00RC130_A188BarNotLin = new byte[1] ;
      T00RC131_A396EmprCod = new String[] {""} ;
      T00RC131_A129BarCod = new int[1] ;
      T00RC131_n129BarCod = new boolean[] {false} ;
      T00RC131_A132BarCodReo = new byte[1] ;
      T00RC131_n132BarCodReo = new boolean[] {false} ;
      T00RC131_A130BarCodPar = new String[] {""} ;
      T00RC131_n130BarCodPar = new boolean[] {false} ;
      T00RC131_A119BarAgrCod = new int[1] ;
      T00RC131_A124BarAgrReo = new byte[1] ;
      T00RC131_A122BarAgrPar = new String[] {""} ;
      T00RC132_A396EmprCod = new String[] {""} ;
      T00RC132_A30AlbProCod = new long[1] ;
      T00RC133_A396EmprCod = new String[] {""} ;
      T00RC133_A14AlbComCod = new int[1] ;
      T00RC133_A20AlbComLin = new short[1] ;
      T00RC134_A396EmprCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tcmfi__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tcmfi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tcmfi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tcmfi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tcmfi__default(),
         new Object[] {
             new Object[] {
            T00RC2_A396EmprCod, T00RC2_A407EmprNom, T00RC2_n407EmprNom, T00RC2_A5650Coste_mca, T00RC2_n5650Coste_mca, T00RC2_A5651Coste_msa, T00RC2_n5651Coste_msa, T00RC2_A5652Factor_in, T00RC2_n5652Factor_in
            }
            , new Object[] {
            T00RC3_A396EmprCod, T00RC3_A407EmprNom, T00RC3_n407EmprNom, T00RC3_A5650Coste_mca, T00RC3_n5650Coste_mca, T00RC3_A5651Coste_msa, T00RC3_n5651Coste_msa, T00RC3_A5652Factor_in, T00RC3_n5652Factor_in
            }
            , new Object[] {
            T00RC4_A396EmprCod, T00RC4_A407EmprNom, T00RC4_n407EmprNom, T00RC4_A5650Coste_mca, T00RC4_n5650Coste_mca, T00RC4_A5651Coste_msa, T00RC4_n5651Coste_msa, T00RC4_A5652Factor_in, T00RC4_n5652Factor_in
            }
            , new Object[] {
            T00RC5_A396EmprCod
            }
            , new Object[] {
            T00RC6_A396EmprCod
            }
            , new Object[] {
            T00RC7_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00RC11_A396EmprCod, T00RC11_A3331LanBroCod
            }
            , new Object[] {
            T00RC12_A396EmprCod, T00RC12_A252CliCod, T00RC12_A3320CliLimKgs
            }
            , new Object[] {
            T00RC13_A396EmprCod, T00RC13_A252CliCod, T00RC13_A65ArtCod, T00RC13_A3319ArtCapKgs
            }
            , new Object[] {
            T00RC14_A396EmprCod, T00RC14_A3316CodSol
            }
            , new Object[] {
            T00RC15_A396EmprCod, T00RC15_A3288CCalCod
            }
            , new Object[] {
            T00RC16_A396EmprCod, T00RC16_A3253SolTraCod, T00RC16_A3269SolTraLin
            }
            , new Object[] {
            T00RC17_A396EmprCod, T00RC17_A3235SolSubCod, T00RC17_A3251SolSubLin
            }
            , new Object[] {
            T00RC18_A396EmprCod, T00RC18_A3218SolLuzCod, T00RC18_A3233SolLuzLin
            }
            , new Object[] {
            T00RC19_A396EmprCod, T00RC19_A3196SolFriCod, T00RC19_A3216SolFriLin
            }
            , new Object[] {
            T00RC20_A396EmprCod, T00RC20_A3165SolPilCod, T00RC20_A3185SolPilLin
            }
            , new Object[] {
            T00RC21_A396EmprCod, T00RC21_A3153CodCod
            }
            , new Object[] {
            T00RC22_A396EmprCod, T00RC22_A3073RepCod
            }
            , new Object[] {
            T00RC23_A396EmprCod, T00RC23_A3061Codia, T00RC23_A3062CoMes, T00RC23_A3063CoAny
            }
            , new Object[] {
            T00RC24_A396EmprCod, T00RC24_A3047LOParId
            }
            , new Object[] {
            T00RC25_A396EmprCod, T00RC25_A3033CCCod
            }
            , new Object[] {
            T00RC26_A396EmprCod, T00RC26_A2971SabFacCod
            }
            , new Object[] {
            T00RC27_A396EmprCod, T00RC27_A2954TiDia, T00RC27_A2955TiMes, T00RC27_A2956TiAny
            }
            , new Object[] {
            T00RC28_A396EmprCod, T00RC28_A2942LzaDia, T00RC28_A2943LzaMes, T00RC28_A2944LzaAny
            }
            , new Object[] {
            T00RC29_A396EmprCod, T00RC29_A252CliCod, T00RC29_A65ArtCod, T00RC29_A2937RecIntCod
            }
            , new Object[] {
            T00RC30_A396EmprCod, T00RC30_A252CliCod, T00RC30_A2933RecTipCon
            }
            , new Object[] {
            T00RC31_A396EmprCod, T00RC31_A252CliCod, T00RC31_A65ArtCod, T00RC31_A2931Limite2
            }
            , new Object[] {
            T00RC32_A396EmprCod, T00RC32_A252CliCod, T00RC32_A2927RecProCod
            }
            , new Object[] {
            T00RC33_A396EmprCod, T00RC33_A2921HisProTiCo, T00RC33_A2922HisProTiLP, T00RC33_A2913HisProTiFe, T00RC33_A2923HisProTiL
            }
            , new Object[] {
            T00RC34_A396EmprCod, T00RC34_A252CliCod, T00RC34_A2891HMaForSer, T00RC34_A2892HMaForCNom, T00RC34_A2893HMaForCNum, T00RC34_A2894HMaTipCCod, T00RC34_A2895HMaForNumC, T00RC34_A2897HMaColLin, T00RC34_A2896HMaFec, T00RC34_A2907HmaLin
            }
            , new Object[] {
            T00RC35_A396EmprCod, T00RC35_A129BarCod, T00RC35_A132BarCodReo, T00RC35_A130BarCodPar, T00RC35_A2872HAnRLinMaq, T00RC35_A2873HAnRLinPro, T00RC35_A2874HAnRLin, T00RC35_A2875HAnNumAny
            }
            , new Object[] {
            T00RC36_A396EmprCod, T00RC36_A2855CodBota, T00RC36_A2859BotLin
            }
            , new Object[] {
            T00RC37_A396EmprCod, T00RC37_A2853TipBotCod
            }
            , new Object[] {
            T00RC38_A396EmprCod, T00RC38_A2817PlaTer, T00RC38_A2818PlaOrd
            }
            , new Object[] {
            T00RC39_A396EmprCod, T00RC39_A2809MetTerCod, T00RC39_A129BarCod, T00RC39_A132BarCodReo, T00RC39_A130BarCodPar
            }
            , new Object[] {
            T00RC40_A396EmprCod, T00RC40_A129BarCod, T00RC40_A132BarCodReo, T00RC40_A130BarCodPar, T00RC40_A2808RecLinMAL, T00RC40_A1377RecNumAny, T00RC40_A719PrdNum
            }
            , new Object[] {
            T00RC41_A396EmprCod, T00RC41_A2792TermiCod, T00RC41_A129BarCod, T00RC41_A132BarCodReo, T00RC41_A130BarCodPar
            }
            , new Object[] {
            T00RC42_A396EmprCod, T00RC42_A30AlbProCod, T00RC42_A129BarCod, T00RC42_A132BarCodReo, T00RC42_A130BarCodPar, T00RC42_A2764AlbHdrLin
            }
            , new Object[] {
            T00RC43_A396EmprCod, T00RC43_A252CliCod, T00RC43_A65ArtCod, T00RC43_A71ArtEstAny, T00RC43_A2756ArtEstSer
            }
            , new Object[] {
            T00RC44_A396EmprCod, T00RC44_A252CliCod, T00RC44_A425EstAny, T00RC44_A2755EstSerFac
            }
            , new Object[] {
            T00RC45_A396EmprCod, T00RC45_A2730RecTipCo, T00RC45_A252CliCod
            }
            , new Object[] {
            T00RC46_A396EmprCod, T00RC46_A2707NumTexCod
            }
            , new Object[] {
            T00RC47_A396EmprCod, T00RC47_A129BarCod, T00RC47_A132BarCodReo, T00RC47_A130BarCodPar, T00RC47_A2494BarDosPro, T00RC47_A719PrdNum
            }
            , new Object[] {
            T00RC48_A396EmprCod, T00RC48_A658PedCod, T00RC48_A2501PedObsLin
            }
            , new Object[] {
            T00RC49_A396EmprCod, T00RC49_A129BarCod, T00RC49_A132BarCodReo, T00RC49_A130BarCodPar, T00RC49_A2457BarObLin
            }
            , new Object[] {
            T00RC50_A396EmprCod, T00RC50_A129BarCod, T00RC50_A132BarCodReo, T00RC50_A130BarCodPar, T00RC50_A2444BarEnLin
            }
            , new Object[] {
            T00RC51_A396EmprCod, T00RC51_A2429TerBarCod, T00RC51_A2431TerBarReo, T00RC51_A2430TerBarPar
            }
            , new Object[] {
            T00RC52_A396EmprCod, T00RC52_A2420OpeAntCod
            }
            , new Object[] {
            T00RC53_A396EmprCod, T00RC53_A2406ExhAlbCod, T00RC53_A2416ExhObsLin
            }
            , new Object[] {
            T00RC54_A396EmprCod, T00RC54_A2406ExhAlbCod, T00RC54_A129BarCod, T00RC54_A132BarCodReo, T00RC54_A130BarCodPar
            }
            , new Object[] {
            T00RC55_A396EmprCod, T00RC55_A14AlbComCod, T00RC55_A2386AlbCObsLin
            }
            , new Object[] {
            T00RC56_A396EmprCod, T00RC56_A2382AbcTerCod, T00RC56_A2381AbcSec, T00RC56_A252CliCod
            }
            , new Object[] {
            T00RC57_A396EmprCod, T00RC57_A252CliCod, T00RC57_A2308CliDesCod
            }
            , new Object[] {
            T00RC58_A396EmprCod, T00RC58_A2268MovParCod, T00RC58_A252CliCod, T00RC58_A2276MovParLin
            }
            , new Object[] {
            T00RC59_A396EmprCod, T00RC59_A2253SalExtAlb, T00RC59_A129BarCod, T00RC59_A132BarCodReo, T00RC59_A130BarCodPar
            }
            , new Object[] {
            T00RC60_A396EmprCod, T00RC60_A2248ManCod
            }
            , new Object[] {
            T00RC61_A396EmprCod, T00RC61_A44AlbRecCod, T00RC61_A2159AlbRecPie
            }
            , new Object[] {
            T00RC62_A396EmprCod, T00RC62_A44AlbRecCod, T00RC62_A2165HisEmpLin
            }
            , new Object[] {
            T00RC63_A396EmprCod, T00RC63_A1794GruLecMaq, T00RC63_A1795GruOrd, T00RC63_A1791GruBarCod, T00RC63_A1793GruBarReo, T00RC63_A1792GruBarPar
            }
            , new Object[] {
            T00RC64_A396EmprCod, T00RC64_A1664ParFasCod
            }
            , new Object[] {
            T00RC65_A396EmprCod, T00RC65_A1514MacProCod
            }
            , new Object[] {
            T00RC66_A396EmprCod, T00RC66_A252CliCod, T00RC66_A1504CliProCod, T00RC66_A65ArtCod
            }
            , new Object[] {
            T00RC67_A396EmprCod, T00RC67_A1438BarTerCod, T00RC67_A172BarLanLin
            }
            , new Object[] {
            T00RC68_A396EmprCod, T00RC68_A1387AlbPrvCod
            }
            , new Object[] {
            T00RC69_A396EmprCod, T00RC69_A44AlbRecCod, T00RC69_A1299AlbRLin
            }
            , new Object[] {
            T00RC70_A396EmprCod, T00RC70_A858ZonGeoCod
            }
            , new Object[] {
            T00RC71_A396EmprCod, T00RC71_A1348SolColCod, T00RC71_A1351SolColLin
            }
            , new Object[] {
            T00RC72_A396EmprCod, T00RC72_A1333EstDimCod, T00RC72_A1339EstDimLin
            }
            , new Object[] {
            T00RC73_A396EmprCod, T00RC73_A1314EnsLabCod
            }
            , new Object[] {
            T00RC74_A396EmprCod, T00RC74_A252CliCod, T00RC74_A1213TalCod, T00RC74_A1293EntMarRef
            }
            , new Object[] {
            T00RC75_A396EmprCod, T00RC75_A1206TubCod
            }
            , new Object[] {
            T00RC76_A396EmprCod, T00RC76_A252CliCod, T00RC76_A1213TalCod, T00RC76_A1217EntMalLin
            }
            , new Object[] {
            T00RC77_A396EmprCod, T00RC77_A1199MacCod
            }
            , new Object[] {
            T00RC78_A396EmprCod, T00RC78_A1209DesCod
            }
            , new Object[] {
            T00RC79_A396EmprCod, T00RC79_A1211TipEntCod
            }
            , new Object[] {
            T00RC80_A396EmprCod, T00RC80_A688PrdComCod
            }
            , new Object[] {
            T00RC81_A396EmprCod, T00RC81_A1166LecMaqCod
            }
            , new Object[] {
            T00RC82_A396EmprCod, T00RC82_A1161TurnCod
            }
            , new Object[] {
            T00RC83_A396EmprCod, T00RC83_A1146DisDisCod, T00RC83_A1139DisBarCod, T00RC83_A1140DisBarReo, T00RC83_A1141DisBarPar
            }
            , new Object[] {
            T00RC84_A396EmprCod, T00RC84_A996TipCon
            }
            , new Object[] {
            T00RC85_A396EmprCod, T00RC85_A970ProceCod
            }
            , new Object[] {
            T00RC86_A396EmprCod, T00RC86_A30AlbProCod, T00RC86_A915AlbPObsLin
            }
            , new Object[] {
            T00RC87_A396EmprCod, T00RC87_A910Workstat
            }
            , new Object[] {
            T00RC88_A396EmprCod, T00RC88_A129BarCod, T00RC88_A132BarCodReo, T00RC88_A130BarCodPar, T00RC88_A906ObsReoLin
            }
            , new Object[] {
            T00RC89_A396EmprCod, T00RC89_A656ParCod
            }
            , new Object[] {
            T00RC90_A396EmprCod, T00RC90_A859CumCodCont
            }
            , new Object[] {
            T00RC91_A396EmprCod, T00RC91_A490ForPrdUMe
            }
            , new Object[] {
            T00RC92_A396EmprCod, T00RC92_A840TrnCod
            }
            , new Object[] {
            T00RC93_A396EmprCod, T00RC93_A856ValCod
            }
            , new Object[] {
            T00RC94_A396EmprCod, T00RC94_A848UniCod
            }
            , new Object[] {
            T00RC95_A396EmprCod, T00RC95_A687PrdCod
            }
            , new Object[] {
            T00RC96_A396EmprCod, T00RC96_A835TipDtoCod
            }
            , new Object[] {
            T00RC97_A396EmprCod, T00RC97_A833TipDefCod
            }
            , new Object[] {
            T00RC98_A396EmprCod, T00RC98_A831TipColCod
            }
            , new Object[] {
            T00RC99_A396EmprCod, T00RC99_A829TipArtCod
            }
            , new Object[] {
            T00RC100_A396EmprCod, T00RC100_A719PrdNum, T00RC100_A810RecFec
            }
            , new Object[] {
            T00RC101_A396EmprCod, T00RC101_A252CliCod, T00RC101_A65ArtCod, T00RC101_A598LinRec
            }
            , new Object[] {
            T00RC102_A396EmprCod, T00RC102_A764ProForCod
            }
            , new Object[] {
            T00RC103_A396EmprCod, T00RC103_A758ProCod
            }
            , new Object[] {
            T00RC104_A396EmprCod, T00RC104_A252CliCod, T00RC104_A457FasCod
            }
            , new Object[] {
            T00RC105_A396EmprCod, T00RC105_A719PrdNum, T00RC105_A681PrdAny
            }
            , new Object[] {
            T00RC106_A396EmprCod, T00RC106_A719PrdNum, T00RC106_A680PrdAltNum
            }
            , new Object[] {
            T00RC107_A396EmprCod, T00RC107_A658PedCod, T00RC107_A719PrdNum
            }
            , new Object[] {
            T00RC108_A396EmprCod, T00RC108_A652OpeCod
            }
            , new Object[] {
            T00RC109_A396EmprCod, T00RC109_A629MetCod
            }
            , new Object[] {
            T00RC110_A396EmprCod, T00RC110_A626MatCod
            }
            , new Object[] {
            T00RC111_A396EmprCod, T00RC111_A602MaqCod
            }
            , new Object[] {
            T00RC112_A396EmprCod, T00RC112_A583IntCod
            }
            , new Object[] {
            T00RC113_A396EmprCod, T00RC113_A506HbaBarCod, T00RC113_A508HbaBarReo, T00RC113_A507HbaBarPar
            }
            , new Object[] {
            T00RC114_A396EmprCod, T00RC114_A503GruOpeCod
            }
            , new Object[] {
            T00RC115_A396EmprCod, T00RC115_A501GruMaqCod
            }
            , new Object[] {
            T00RC116_A396EmprCod, T00RC116_A499GrpFamCod
            }
            , new Object[] {
            T00RC117_A396EmprCod, T00RC117_A497FpgCod
            }
            , new Object[] {
            T00RC118_A396EmprCod, T00RC118_A457FasCod, T00RC118_A463FasNumLin
            }
            , new Object[] {
            T00RC119_A396EmprCod, T00RC119_A430FacCod
            }
            , new Object[] {
            T00RC120_A396EmprCod, T00RC120_A313ContCod
            }
            , new Object[] {
            T00RC121_A396EmprCod, T00RC121_A361DisCod, T00RC121_A376DisObsLin
            }
            , new Object[] {
            T00RC122_A396EmprCod, T00RC122_A361DisCod, T00RC122_A44AlbRecCod
            }
            , new Object[] {
            T00RC123_A396EmprCod, T00RC123_A486ForNumCol
            }
            , new Object[] {
            T00RC124_A396EmprCod, T00RC124_A323DevGenCod
            }
            , new Object[] {
            T00RC125_A396EmprCod, T00RC125_A719PrdNum, T00RC125_A647NumCon
            }
            , new Object[] {
            T00RC126_A396EmprCod, T00RC126_A252CliCod, T00RC126_A287CliPagLin
            }
            , new Object[] {
            T00RC127_A396EmprCod, T00RC127_A252CliCod, T00RC127_A266CliEnvLin
            }
            , new Object[] {
            T00RC128_A396EmprCod, T00RC128_A241CieBarCod, T00RC128_A243CieBarReo, T00RC128_A242CieBarPar
            }
            , new Object[] {
            T00RC129_A396EmprCod, T00RC129_A129BarCod, T00RC129_A132BarCodReo, T00RC129_A130BarCodPar, T00RC129_A200BarPieCod
            }
            , new Object[] {
            T00RC130_A396EmprCod, T00RC130_A129BarCod, T00RC130_A132BarCodReo, T00RC130_A130BarCodPar, T00RC130_A188BarNotLin
            }
            , new Object[] {
            T00RC131_A396EmprCod, T00RC131_A129BarCod, T00RC131_A132BarCodReo, T00RC131_A130BarCodPar, T00RC131_A119BarAgrCod, T00RC131_A124BarAgrReo, T00RC131_A122BarAgrPar
            }
            , new Object[] {
            T00RC132_A396EmprCod, T00RC132_A30AlbProCod
            }
            , new Object[] {
            T00RC133_A396EmprCod, T00RC133_A14AlbComCod, T00RC133_A20AlbComLin
            }
            , new Object[] {
            T00RC134_A396EmprCod
            }
         }
      );
      AV32Pgmname = "Facturacion.TCmFi" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private int trnEnded ;
   private int edtCoste_mca_Enabled ;
   private int edtCoste_msa_Enabled ;
   private int edtFactor_in_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z5650Coste_mca ;
   private java.math.BigDecimal Z5651Coste_msa ;
   private java.math.BigDecimal Z5652Factor_in ;
   private java.math.BigDecimal A5650Coste_mca ;
   private java.math.BigDecimal A5651Coste_msa ;
   private java.math.BigDecimal A5652Factor_in ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV28EmprCod ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV28EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCoste_mca_Internalname ;
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
   private String edtCoste_mca_Jsonclick ;
   private String edtCoste_msa_Internalname ;
   private String edtCoste_msa_Jsonclick ;
   private String edtFactor_in_Internalname ;
   private String edtFactor_in_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV32Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A407EmprNom ;
   private String A396EmprCod ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode27 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV26Station ;
   private String AV27EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private boolean n5650Coste_mca ;
   private boolean n5651Coste_msa ;
   private boolean n5652Factor_in ;
   private boolean returnInSub ;
   private com.genexus.webpanels.WebSession AV31WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00RC4_A396EmprCod ;
   private String[] T00RC4_A407EmprNom ;
   private boolean[] T00RC4_n407EmprNom ;
   private java.math.BigDecimal[] T00RC4_A5650Coste_mca ;
   private boolean[] T00RC4_n5650Coste_mca ;
   private java.math.BigDecimal[] T00RC4_A5651Coste_msa ;
   private boolean[] T00RC4_n5651Coste_msa ;
   private java.math.BigDecimal[] T00RC4_A5652Factor_in ;
   private boolean[] T00RC4_n5652Factor_in ;
   private String[] T00RC5_A396EmprCod ;
   private String[] T00RC3_A396EmprCod ;
   private String[] T00RC3_A407EmprNom ;
   private boolean[] T00RC3_n407EmprNom ;
   private java.math.BigDecimal[] T00RC3_A5650Coste_mca ;
   private boolean[] T00RC3_n5650Coste_mca ;
   private java.math.BigDecimal[] T00RC3_A5651Coste_msa ;
   private boolean[] T00RC3_n5651Coste_msa ;
   private java.math.BigDecimal[] T00RC3_A5652Factor_in ;
   private boolean[] T00RC3_n5652Factor_in ;
   private String[] T00RC6_A396EmprCod ;
   private String[] T00RC7_A396EmprCod ;
   private String[] T00RC2_A396EmprCod ;
   private String[] T00RC2_A407EmprNom ;
   private boolean[] T00RC2_n407EmprNom ;
   private java.math.BigDecimal[] T00RC2_A5650Coste_mca ;
   private boolean[] T00RC2_n5650Coste_mca ;
   private java.math.BigDecimal[] T00RC2_A5651Coste_msa ;
   private boolean[] T00RC2_n5651Coste_msa ;
   private java.math.BigDecimal[] T00RC2_A5652Factor_in ;
   private boolean[] T00RC2_n5652Factor_in ;
   private String[] T00RC11_A396EmprCod ;
   private byte[] T00RC11_A3331LanBroCod ;
   private String[] T00RC12_A396EmprCod ;
   private int[] T00RC12_A252CliCod ;
   private boolean[] T00RC12_n252CliCod ;
   private java.math.BigDecimal[] T00RC12_A3320CliLimKgs ;
   private String[] T00RC13_A396EmprCod ;
   private int[] T00RC13_A252CliCod ;
   private boolean[] T00RC13_n252CliCod ;
   private String[] T00RC13_A65ArtCod ;
   private java.math.BigDecimal[] T00RC13_A3319ArtCapKgs ;
   private String[] T00RC14_A396EmprCod ;
   private short[] T00RC14_A3316CodSol ;
   private String[] T00RC15_A396EmprCod ;
   private String[] T00RC15_A3288CCalCod ;
   private String[] T00RC16_A396EmprCod ;
   private int[] T00RC16_A3253SolTraCod ;
   private byte[] T00RC16_A3269SolTraLin ;
   private String[] T00RC17_A396EmprCod ;
   private int[] T00RC17_A3235SolSubCod ;
   private byte[] T00RC17_A3251SolSubLin ;
   private String[] T00RC18_A396EmprCod ;
   private int[] T00RC18_A3218SolLuzCod ;
   private byte[] T00RC18_A3233SolLuzLin ;
   private String[] T00RC19_A396EmprCod ;
   private int[] T00RC19_A3196SolFriCod ;
   private byte[] T00RC19_A3216SolFriLin ;
   private String[] T00RC20_A396EmprCod ;
   private int[] T00RC20_A3165SolPilCod ;
   private byte[] T00RC20_A3185SolPilLin ;
   private String[] T00RC21_A396EmprCod ;
   private String[] T00RC21_A3153CodCod ;
   private String[] T00RC22_A396EmprCod ;
   private String[] T00RC22_A3073RepCod ;
   private String[] T00RC23_A396EmprCod ;
   private byte[] T00RC23_A3061Codia ;
   private byte[] T00RC23_A3062CoMes ;
   private short[] T00RC23_A3063CoAny ;
   private String[] T00RC24_A396EmprCod ;
   private String[] T00RC24_A3047LOParId ;
   private String[] T00RC25_A396EmprCod ;
   private String[] T00RC25_A3033CCCod ;
   private String[] T00RC26_A396EmprCod ;
   private int[] T00RC26_A2971SabFacCod ;
   private String[] T00RC27_A396EmprCod ;
   private byte[] T00RC27_A2954TiDia ;
   private byte[] T00RC27_A2955TiMes ;
   private short[] T00RC27_A2956TiAny ;
   private String[] T00RC28_A396EmprCod ;
   private byte[] T00RC28_A2942LzaDia ;
   private byte[] T00RC28_A2943LzaMes ;
   private short[] T00RC28_A2944LzaAny ;
   private String[] T00RC29_A396EmprCod ;
   private int[] T00RC29_A252CliCod ;
   private boolean[] T00RC29_n252CliCod ;
   private String[] T00RC29_A65ArtCod ;
   private byte[] T00RC29_A2937RecIntCod ;
   private String[] T00RC30_A396EmprCod ;
   private int[] T00RC30_A252CliCod ;
   private boolean[] T00RC30_n252CliCod ;
   private short[] T00RC30_A2933RecTipCon ;
   private String[] T00RC31_A396EmprCod ;
   private int[] T00RC31_A252CliCod ;
   private boolean[] T00RC31_n252CliCod ;
   private String[] T00RC31_A65ArtCod ;
   private short[] T00RC31_A2931Limite2 ;
   private String[] T00RC32_A396EmprCod ;
   private int[] T00RC32_A252CliCod ;
   private boolean[] T00RC32_n252CliCod ;
   private String[] T00RC32_A2927RecProCod ;
   private String[] T00RC33_A396EmprCod ;
   private String[] T00RC33_A2921HisProTiCo ;
   private short[] T00RC33_A2922HisProTiLP ;
   private java.util.Date[] T00RC33_A2913HisProTiFe ;
   private short[] T00RC33_A2923HisProTiL ;
   private String[] T00RC34_A396EmprCod ;
   private int[] T00RC34_A252CliCod ;
   private boolean[] T00RC34_n252CliCod ;
   private String[] T00RC34_A2891HMaForSer ;
   private String[] T00RC34_A2892HMaForCNom ;
   private int[] T00RC34_A2893HMaForCNum ;
   private byte[] T00RC34_A2894HMaTipCCod ;
   private int[] T00RC34_A2895HMaForNumC ;
   private short[] T00RC34_A2897HMaColLin ;
   private java.util.Date[] T00RC34_A2896HMaFec ;
   private short[] T00RC34_A2907HmaLin ;
   private String[] T00RC35_A396EmprCod ;
   private int[] T00RC35_A129BarCod ;
   private boolean[] T00RC35_n129BarCod ;
   private byte[] T00RC35_A132BarCodReo ;
   private boolean[] T00RC35_n132BarCodReo ;
   private String[] T00RC35_A130BarCodPar ;
   private boolean[] T00RC35_n130BarCodPar ;
   private short[] T00RC35_A2872HAnRLinMaq ;
   private byte[] T00RC35_A2873HAnRLinPro ;
   private short[] T00RC35_A2874HAnRLin ;
   private byte[] T00RC35_A2875HAnNumAny ;
   private String[] T00RC36_A396EmprCod ;
   private int[] T00RC36_A2855CodBota ;
   private short[] T00RC36_A2859BotLin ;
   private String[] T00RC37_A396EmprCod ;
   private byte[] T00RC37_A2853TipBotCod ;
   private String[] T00RC38_A396EmprCod ;
   private String[] T00RC38_A2817PlaTer ;
   private short[] T00RC38_A2818PlaOrd ;
   private String[] T00RC39_A396EmprCod ;
   private String[] T00RC39_A2809MetTerCod ;
   private int[] T00RC39_A129BarCod ;
   private boolean[] T00RC39_n129BarCod ;
   private byte[] T00RC39_A132BarCodReo ;
   private boolean[] T00RC39_n132BarCodReo ;
   private String[] T00RC39_A130BarCodPar ;
   private boolean[] T00RC39_n130BarCodPar ;
   private String[] T00RC40_A396EmprCod ;
   private int[] T00RC40_A129BarCod ;
   private boolean[] T00RC40_n129BarCod ;
   private byte[] T00RC40_A132BarCodReo ;
   private boolean[] T00RC40_n132BarCodReo ;
   private String[] T00RC40_A130BarCodPar ;
   private boolean[] T00RC40_n130BarCodPar ;
   private short[] T00RC40_A2808RecLinMAL ;
   private byte[] T00RC40_A1377RecNumAny ;
   private String[] T00RC40_A719PrdNum ;
   private String[] T00RC41_A396EmprCod ;
   private String[] T00RC41_A2792TermiCod ;
   private int[] T00RC41_A129BarCod ;
   private boolean[] T00RC41_n129BarCod ;
   private byte[] T00RC41_A132BarCodReo ;
   private boolean[] T00RC41_n132BarCodReo ;
   private String[] T00RC41_A130BarCodPar ;
   private boolean[] T00RC41_n130BarCodPar ;
   private String[] T00RC42_A396EmprCod ;
   private long[] T00RC42_A30AlbProCod ;
   private int[] T00RC42_A129BarCod ;
   private boolean[] T00RC42_n129BarCod ;
   private byte[] T00RC42_A132BarCodReo ;
   private boolean[] T00RC42_n132BarCodReo ;
   private String[] T00RC42_A130BarCodPar ;
   private boolean[] T00RC42_n130BarCodPar ;
   private short[] T00RC42_A2764AlbHdrLin ;
   private String[] T00RC43_A396EmprCod ;
   private int[] T00RC43_A252CliCod ;
   private boolean[] T00RC43_n252CliCod ;
   private String[] T00RC43_A65ArtCod ;
   private short[] T00RC43_A71ArtEstAny ;
   private String[] T00RC43_A2756ArtEstSer ;
   private String[] T00RC44_A396EmprCod ;
   private int[] T00RC44_A252CliCod ;
   private boolean[] T00RC44_n252CliCod ;
   private short[] T00RC44_A425EstAny ;
   private String[] T00RC44_A2755EstSerFac ;
   private String[] T00RC45_A396EmprCod ;
   private short[] T00RC45_A2730RecTipCo ;
   private int[] T00RC45_A252CliCod ;
   private boolean[] T00RC45_n252CliCod ;
   private String[] T00RC46_A396EmprCod ;
   private String[] T00RC46_A2707NumTexCod ;
   private String[] T00RC47_A396EmprCod ;
   private int[] T00RC47_A129BarCod ;
   private boolean[] T00RC47_n129BarCod ;
   private byte[] T00RC47_A132BarCodReo ;
   private boolean[] T00RC47_n132BarCodReo ;
   private String[] T00RC47_A130BarCodPar ;
   private boolean[] T00RC47_n130BarCodPar ;
   private String[] T00RC47_A2494BarDosPro ;
   private String[] T00RC47_A719PrdNum ;
   private String[] T00RC48_A396EmprCod ;
   private int[] T00RC48_A658PedCod ;
   private byte[] T00RC48_A2501PedObsLin ;
   private String[] T00RC49_A396EmprCod ;
   private int[] T00RC49_A129BarCod ;
   private boolean[] T00RC49_n129BarCod ;
   private byte[] T00RC49_A132BarCodReo ;
   private boolean[] T00RC49_n132BarCodReo ;
   private String[] T00RC49_A130BarCodPar ;
   private boolean[] T00RC49_n130BarCodPar ;
   private short[] T00RC49_A2457BarObLin ;
   private String[] T00RC50_A396EmprCod ;
   private int[] T00RC50_A129BarCod ;
   private boolean[] T00RC50_n129BarCod ;
   private byte[] T00RC50_A132BarCodReo ;
   private boolean[] T00RC50_n132BarCodReo ;
   private String[] T00RC50_A130BarCodPar ;
   private boolean[] T00RC50_n130BarCodPar ;
   private short[] T00RC50_A2444BarEnLin ;
   private String[] T00RC51_A396EmprCod ;
   private int[] T00RC51_A2429TerBarCod ;
   private byte[] T00RC51_A2431TerBarReo ;
   private String[] T00RC51_A2430TerBarPar ;
   private String[] T00RC52_A396EmprCod ;
   private int[] T00RC52_A2420OpeAntCod ;
   private String[] T00RC53_A396EmprCod ;
   private int[] T00RC53_A2406ExhAlbCod ;
   private short[] T00RC53_A2416ExhObsLin ;
   private String[] T00RC54_A396EmprCod ;
   private int[] T00RC54_A2406ExhAlbCod ;
   private int[] T00RC54_A129BarCod ;
   private boolean[] T00RC54_n129BarCod ;
   private byte[] T00RC54_A132BarCodReo ;
   private boolean[] T00RC54_n132BarCodReo ;
   private String[] T00RC54_A130BarCodPar ;
   private boolean[] T00RC54_n130BarCodPar ;
   private String[] T00RC55_A396EmprCod ;
   private int[] T00RC55_A14AlbComCod ;
   private byte[] T00RC55_A2386AlbCObsLin ;
   private String[] T00RC56_A396EmprCod ;
   private String[] T00RC56_A2382AbcTerCod ;
   private String[] T00RC56_A2381AbcSec ;
   private int[] T00RC56_A252CliCod ;
   private boolean[] T00RC56_n252CliCod ;
   private String[] T00RC57_A396EmprCod ;
   private int[] T00RC57_A252CliCod ;
   private boolean[] T00RC57_n252CliCod ;
   private int[] T00RC57_A2308CliDesCod ;
   private String[] T00RC58_A396EmprCod ;
   private String[] T00RC58_A2268MovParCod ;
   private int[] T00RC58_A252CliCod ;
   private boolean[] T00RC58_n252CliCod ;
   private short[] T00RC58_A2276MovParLin ;
   private String[] T00RC59_A396EmprCod ;
   private int[] T00RC59_A2253SalExtAlb ;
   private int[] T00RC59_A129BarCod ;
   private boolean[] T00RC59_n129BarCod ;
   private byte[] T00RC59_A132BarCodReo ;
   private boolean[] T00RC59_n132BarCodReo ;
   private String[] T00RC59_A130BarCodPar ;
   private boolean[] T00RC59_n130BarCodPar ;
   private String[] T00RC60_A396EmprCod ;
   private short[] T00RC60_A2248ManCod ;
   private String[] T00RC61_A396EmprCod ;
   private int[] T00RC61_A44AlbRecCod ;
   private String[] T00RC61_A2159AlbRecPie ;
   private String[] T00RC62_A396EmprCod ;
   private int[] T00RC62_A44AlbRecCod ;
   private short[] T00RC62_A2165HisEmpLin ;
   private String[] T00RC63_A396EmprCod ;
   private String[] T00RC63_A1794GruLecMaq ;
   private byte[] T00RC63_A1795GruOrd ;
   private int[] T00RC63_A1791GruBarCod ;
   private byte[] T00RC63_A1793GruBarReo ;
   private String[] T00RC63_A1792GruBarPar ;
   private String[] T00RC64_A396EmprCod ;
   private short[] T00RC64_A1664ParFasCod ;
   private String[] T00RC65_A396EmprCod ;
   private String[] T00RC65_A1514MacProCod ;
   private String[] T00RC66_A396EmprCod ;
   private int[] T00RC66_A252CliCod ;
   private boolean[] T00RC66_n252CliCod ;
   private String[] T00RC66_A1504CliProCod ;
   private String[] T00RC66_A65ArtCod ;
   private String[] T00RC67_A396EmprCod ;
   private String[] T00RC67_A1438BarTerCod ;
   private short[] T00RC67_A172BarLanLin ;
   private String[] T00RC68_A396EmprCod ;
   private int[] T00RC68_A1387AlbPrvCod ;
   private String[] T00RC69_A396EmprCod ;
   private int[] T00RC69_A44AlbRecCod ;
   private byte[] T00RC69_A1299AlbRLin ;
   private String[] T00RC70_A396EmprCod ;
   private short[] T00RC70_A858ZonGeoCod ;
   private String[] T00RC71_A396EmprCod ;
   private int[] T00RC71_A1348SolColCod ;
   private byte[] T00RC71_A1351SolColLin ;
   private String[] T00RC72_A396EmprCod ;
   private int[] T00RC72_A1333EstDimCod ;
   private byte[] T00RC72_A1339EstDimLin ;
   private String[] T00RC73_A396EmprCod ;
   private int[] T00RC73_A1314EnsLabCod ;
   private String[] T00RC74_A396EmprCod ;
   private int[] T00RC74_A252CliCod ;
   private boolean[] T00RC74_n252CliCod ;
   private String[] T00RC74_A1213TalCod ;
   private String[] T00RC74_A1293EntMarRef ;
   private String[] T00RC75_A396EmprCod ;
   private short[] T00RC75_A1206TubCod ;
   private String[] T00RC76_A396EmprCod ;
   private int[] T00RC76_A252CliCod ;
   private boolean[] T00RC76_n252CliCod ;
   private String[] T00RC76_A1213TalCod ;
   private short[] T00RC76_A1217EntMalLin ;
   private String[] T00RC77_A396EmprCod ;
   private int[] T00RC77_A1199MacCod ;
   private String[] T00RC78_A396EmprCod ;
   private short[] T00RC78_A1209DesCod ;
   private String[] T00RC79_A396EmprCod ;
   private short[] T00RC79_A1211TipEntCod ;
   private String[] T00RC80_A396EmprCod ;
   private String[] T00RC80_A688PrdComCod ;
   private String[] T00RC81_A396EmprCod ;
   private String[] T00RC81_A1166LecMaqCod ;
   private String[] T00RC82_A396EmprCod ;
   private byte[] T00RC82_A1161TurnCod ;
   private String[] T00RC83_A396EmprCod ;
   private int[] T00RC83_A1146DisDisCod ;
   private int[] T00RC83_A1139DisBarCod ;
   private byte[] T00RC83_A1140DisBarReo ;
   private String[] T00RC83_A1141DisBarPar ;
   private String[] T00RC84_A396EmprCod ;
   private short[] T00RC84_A996TipCon ;
   private String[] T00RC85_A396EmprCod ;
   private short[] T00RC85_A970ProceCod ;
   private String[] T00RC86_A396EmprCod ;
   private long[] T00RC86_A30AlbProCod ;
   private byte[] T00RC86_A915AlbPObsLin ;
   private String[] T00RC87_A396EmprCod ;
   private String[] T00RC87_A910Workstat ;
   private String[] T00RC88_A396EmprCod ;
   private int[] T00RC88_A129BarCod ;
   private boolean[] T00RC88_n129BarCod ;
   private byte[] T00RC88_A132BarCodReo ;
   private boolean[] T00RC88_n132BarCodReo ;
   private String[] T00RC88_A130BarCodPar ;
   private boolean[] T00RC88_n130BarCodPar ;
   private byte[] T00RC88_A906ObsReoLin ;
   private String[] T00RC89_A396EmprCod ;
   private short[] T00RC89_A656ParCod ;
   private String[] T00RC90_A396EmprCod ;
   private int[] T00RC90_A859CumCodCont ;
   private String[] T00RC91_A396EmprCod ;
   private byte[] T00RC91_A490ForPrdUMe ;
   private String[] T00RC92_A396EmprCod ;
   private short[] T00RC92_A840TrnCod ;
   private String[] T00RC93_A396EmprCod ;
   private byte[] T00RC93_A856ValCod ;
   private String[] T00RC94_A396EmprCod ;
   private byte[] T00RC94_A848UniCod ;
   private String[] T00RC95_A396EmprCod ;
   private byte[] T00RC95_A687PrdCod ;
   private String[] T00RC96_A396EmprCod ;
   private byte[] T00RC96_A835TipDtoCod ;
   private String[] T00RC97_A396EmprCod ;
   private short[] T00RC97_A833TipDefCod ;
   private String[] T00RC98_A396EmprCod ;
   private byte[] T00RC98_A831TipColCod ;
   private String[] T00RC99_A396EmprCod ;
   private short[] T00RC99_A829TipArtCod ;
   private String[] T00RC100_A396EmprCod ;
   private String[] T00RC100_A719PrdNum ;
   private java.util.Date[] T00RC100_A810RecFec ;
   private String[] T00RC101_A396EmprCod ;
   private int[] T00RC101_A252CliCod ;
   private boolean[] T00RC101_n252CliCod ;
   private String[] T00RC101_A65ArtCod ;
   private byte[] T00RC101_A598LinRec ;
   private String[] T00RC102_A396EmprCod ;
   private String[] T00RC102_A764ProForCod ;
   private String[] T00RC103_A396EmprCod ;
   private String[] T00RC103_A758ProCod ;
   private String[] T00RC104_A396EmprCod ;
   private int[] T00RC104_A252CliCod ;
   private boolean[] T00RC104_n252CliCod ;
   private String[] T00RC104_A457FasCod ;
   private String[] T00RC105_A396EmprCod ;
   private String[] T00RC105_A719PrdNum ;
   private short[] T00RC105_A681PrdAny ;
   private String[] T00RC106_A396EmprCod ;
   private String[] T00RC106_A719PrdNum ;
   private String[] T00RC106_A680PrdAltNum ;
   private String[] T00RC107_A396EmprCod ;
   private int[] T00RC107_A658PedCod ;
   private String[] T00RC107_A719PrdNum ;
   private String[] T00RC108_A396EmprCod ;
   private int[] T00RC108_A652OpeCod ;
   private String[] T00RC109_A396EmprCod ;
   private byte[] T00RC109_A629MetCod ;
   private String[] T00RC110_A396EmprCod ;
   private short[] T00RC110_A626MatCod ;
   private String[] T00RC111_A396EmprCod ;
   private String[] T00RC111_A602MaqCod ;
   private String[] T00RC112_A396EmprCod ;
   private byte[] T00RC112_A583IntCod ;
   private String[] T00RC113_A396EmprCod ;
   private int[] T00RC113_A506HbaBarCod ;
   private byte[] T00RC113_A508HbaBarReo ;
   private String[] T00RC113_A507HbaBarPar ;
   private String[] T00RC114_A396EmprCod ;
   private int[] T00RC114_A503GruOpeCod ;
   private String[] T00RC115_A396EmprCod ;
   private String[] T00RC115_A501GruMaqCod ;
   private String[] T00RC116_A396EmprCod ;
   private byte[] T00RC116_A499GrpFamCod ;
   private String[] T00RC117_A396EmprCod ;
   private String[] T00RC117_A497FpgCod ;
   private String[] T00RC118_A396EmprCod ;
   private String[] T00RC118_A457FasCod ;
   private byte[] T00RC118_A463FasNumLin ;
   private String[] T00RC119_A396EmprCod ;
   private int[] T00RC119_A430FacCod ;
   private String[] T00RC120_A396EmprCod ;
   private String[] T00RC120_A313ContCod ;
   private String[] T00RC121_A396EmprCod ;
   private int[] T00RC121_A361DisCod ;
   private byte[] T00RC121_A376DisObsLin ;
   private String[] T00RC122_A396EmprCod ;
   private int[] T00RC122_A361DisCod ;
   private int[] T00RC122_A44AlbRecCod ;
   private String[] T00RC123_A396EmprCod ;
   private int[] T00RC123_A486ForNumCol ;
   private String[] T00RC124_A396EmprCod ;
   private int[] T00RC124_A323DevGenCod ;
   private String[] T00RC125_A396EmprCod ;
   private String[] T00RC125_A719PrdNum ;
   private int[] T00RC125_A647NumCon ;
   private String[] T00RC126_A396EmprCod ;
   private int[] T00RC126_A252CliCod ;
   private boolean[] T00RC126_n252CliCod ;
   private byte[] T00RC126_A287CliPagLin ;
   private String[] T00RC127_A396EmprCod ;
   private int[] T00RC127_A252CliCod ;
   private boolean[] T00RC127_n252CliCod ;
   private byte[] T00RC127_A266CliEnvLin ;
   private String[] T00RC128_A396EmprCod ;
   private int[] T00RC128_A241CieBarCod ;
   private byte[] T00RC128_A243CieBarReo ;
   private String[] T00RC128_A242CieBarPar ;
   private String[] T00RC129_A396EmprCod ;
   private int[] T00RC129_A129BarCod ;
   private boolean[] T00RC129_n129BarCod ;
   private byte[] T00RC129_A132BarCodReo ;
   private boolean[] T00RC129_n132BarCodReo ;
   private String[] T00RC129_A130BarCodPar ;
   private boolean[] T00RC129_n130BarCodPar ;
   private String[] T00RC129_A200BarPieCod ;
   private String[] T00RC130_A396EmprCod ;
   private int[] T00RC130_A129BarCod ;
   private boolean[] T00RC130_n129BarCod ;
   private byte[] T00RC130_A132BarCodReo ;
   private boolean[] T00RC130_n132BarCodReo ;
   private String[] T00RC130_A130BarCodPar ;
   private boolean[] T00RC130_n130BarCodPar ;
   private byte[] T00RC130_A188BarNotLin ;
   private String[] T00RC131_A396EmprCod ;
   private int[] T00RC131_A129BarCod ;
   private boolean[] T00RC131_n129BarCod ;
   private byte[] T00RC131_A132BarCodReo ;
   private boolean[] T00RC131_n132BarCodReo ;
   private String[] T00RC131_A130BarCodPar ;
   private boolean[] T00RC131_n130BarCodPar ;
   private int[] T00RC131_A119BarAgrCod ;
   private byte[] T00RC131_A124BarAgrReo ;
   private String[] T00RC131_A122BarAgrPar ;
   private String[] T00RC132_A396EmprCod ;
   private long[] T00RC132_A30AlbProCod ;
   private String[] T00RC133_A396EmprCod ;
   private int[] T00RC133_A14AlbComCod ;
   private short[] T00RC133_A20AlbComLin ;
   private String[] T00RC134_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV29WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV30TrnContext ;
}

final  class tcmfi__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcmfi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcmfi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcmfi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcmfi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00RC2", "SELECT EmprCod, EmprNom, Coste_mca, Coste_msa, Factor_in FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom, Coste_mca, Coste_msa, Factor_in NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RC3", "SELECT EmprCod, EmprNom, Coste_mca, Coste_msa, Factor_in FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RC4", "SELECT /*+ FIRST_ROWS(100) */ TM1.EmprCod, TM1.EmprNom, TM1.Coste_mca, TM1.Coste_msa, TM1.Factor_in FROM TXPEMPRES TM1 WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RC5", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RC6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod > ?) ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod < ?) ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00RC8", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, Coste_mca, Coste_msa, Factor_in, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, IvaCod, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, Hh_UltL, Colombia, Auc_ULin, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, EmpItm7, PtosUltID, EmpKey, EmpToken, EmpEnv, EmpProd) VALUES(?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00RC9", "UPDATE TXPEMPRES SET EmprNom=?, Coste_mca=?, Coste_msa=?, Factor_in=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00RC10", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T00RC11", "SELECT * FROM (SELECT EmprCod, LanBroCod FROM TXPLANBRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC12", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC13", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC14", "SELECT * FROM (SELECT EmprCod, CodSol FROM TXPSOLIDE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC15", "SELECT * FROM (SELECT EmprCod, CCalCod FROM TXPCONCAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC16", "SELECT * FROM (SELECT EmprCod, SolTraCod, SolTraLin FROM TXPLTRASP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC17", "SELECT * FROM (SELECT EmprCod, SolSubCod, SolSubLin FROM TXPLSUBLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC18", "SELECT * FROM (SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC19", "SELECT * FROM (SELECT EmprCod, SolFriCod, SolFriLin FROM TXPLFRICC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC20", "SELECT * FROM (SELECT EmprCod, SolPilCod, SolPilLin FROM TXPLPILLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC21", "SELECT * FROM (SELECT EmprCod, CodCod FROM TXPCODFAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC22", "SELECT * FROM (SELECT EmprCod, RepCod FROM TXPREPRES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC23", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny FROM TXPCCOSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC24", "SELECT * FROM (SELECT EmprCod, LOParId FROM TXPLOPara WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC25", "SELECT * FROM (SELECT EmprCod, CCCod FROM TXPCCSer WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC26", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC27", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC28", "SELECT * FROM (SELECT EmprCod, LzaDia, LzaMes, LzaAny FROM TXPCKGSLA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC30", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC31", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC32", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC33", "SELECT * FROM (SELECT EmprCod, HisProTiCo, HisProTiLP, HisProTiFe, HisProTiL FROM TXPHISTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC34", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC36", "SELECT * FROM (SELECT EmprCod, CodBota, BotLin FROM TXPLBOTAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC37", "SELECT * FROM (SELECT EmprCod, TipBotCod FROM TXPTIPBOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC38", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC39", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC40", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC41", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC42", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC43", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC44", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC45", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC46", "SELECT * FROM (SELECT EmprCod, NumTexCod FROM TXPNUMTEX WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC48", "SELECT * FROM (SELECT EmprCod, PedCod, PedObsLin FROM TXPOBSPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC50", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC51", "SELECT * FROM (SELECT EmprCod, TerBarCod, TerBarReo, TerBarPar FROM TXPENVTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC52", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprOpe = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC53", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, ExhObsLin FROM TXPOEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC54", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC55", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC56", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC57", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC58", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod, MovParLin FROM TXPLMOVPD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC59", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC60", "SELECT * FROM (SELECT EmprCod, ManCod FROM TXPMANUFA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC61", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC62", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC63", "SELECT * FROM (SELECT EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar FROM TXPGRULEC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC64", "SELECT * FROM (SELECT EmprCod, ParFasCod FROM TXPPARFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC65", "SELECT * FROM (SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC66", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC67", "SELECT * FROM (SELECT EmprCod, BarTerCod, BarLanLin FROM TXPBARLAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC68", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC69", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC70", "SELECT * FROM (SELECT EmprCod, ZonGeoCod FROM TXPZONGEO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC71", "SELECT * FROM (SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC72", "SELECT * FROM (SELECT EmprCod, EstDimCod, EstDimLin FROM TXPLESDIM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC73", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC74", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMarRef FROM TXPENTMAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC75", "SELECT * FROM (SELECT EmprCod, TubCod FROM TXPTUBOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC76", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMalLin FROM TXPLENTMA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC77", "SELECT * FROM (SELECT EmprCod, MacCod FROM TXPCMACRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC78", "SELECT * FROM (SELECT EmprCod, DesCod FROM TXPDESTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC79", "SELECT * FROM (SELECT EmprCod, TipEntCod FROM TXPENTRAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC80", "SELECT * FROM (SELECT EmprCod, PrdComCod FROM TXPCPRDCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC81", "SELECT * FROM (SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC82", "SELECT * FROM (SELECT EmprCod, TurnCod FROM TXPTURNOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC83", "SELECT * FROM (SELECT EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar FROM TXPDISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC84", "SELECT * FROM (SELECT EmprCod, TipCon FROM TXPTIPCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC85", "SELECT * FROM (SELECT EmprCod, ProceCod FROM TXPPROCED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC86", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC87", "SELECT * FROM (SELECT EmprCod, Workstat FROM TXPCESCAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC88", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC89", "SELECT * FROM (SELECT EmprCod, ParCod FROM TXPCODPAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC90", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC91", "SELECT * FROM (SELECT EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC92", "SELECT * FROM (SELECT EmprCod, TrnCod FROM TXPTRANSP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC93", "SELECT * FROM (SELECT EmprCod, ValCod FROM TXPTIPVAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC94", "SELECT * FROM (SELECT EmprCod, UniCod FROM TXPTIPUNI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC95", "SELECT * FROM (SELECT EmprCod, PrdCod FROM TXPTIPPRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC96", "SELECT * FROM (SELECT EmprCod, TipDtoCod FROM TXPTIPDTO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC97", "SELECT * FROM (SELECT EmprCod, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC98", "SELECT * FROM (SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC99", "SELECT * FROM (SELECT EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC100", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC101", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC102", "SELECT * FROM (SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC103", "SELECT * FROM (SELECT EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC104", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC105", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC106", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC107", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC108", "SELECT * FROM (SELECT EmprCod, OpeCod FROM TXPOPERAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC109", "SELECT * FROM (SELECT EmprCod, MetCod FROM TXPMETPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC110", "SELECT * FROM (SELECT EmprCod, MatCod FROM TXPMATICE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC111", "SELECT * FROM (SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC112", "SELECT * FROM (SELECT EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC113", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC114", "SELECT * FROM (SELECT EmprCod, GruOpeCod FROM TXPCGRUOP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC115", "SELECT * FROM (SELECT EmprCod, GruMaqCod FROM TXPGRUMAQ WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC116", "SELECT * FROM (SELECT EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC117", "SELECT * FROM (SELECT EmprCod, FpgCod FROM TXPFORPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC118", "SELECT * FROM (SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC119", "SELECT * FROM (SELECT EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC120", "SELECT * FROM (SELECT EmprCod, ContCod FROM TXPEMPLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC121", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC122", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC123", "SELECT * FROM (SELECT EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC124", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC125", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC126", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC127", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC128", "SELECT * FROM (SELECT EmprCod, CieBarCod, CieBarReo, CieBarPar FROM TXPCIETIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC129", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC130", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC131", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC132", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC133", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RC134", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 127 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 128 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 129 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 130 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 131 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 132 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 8);
               }
               return;
            case 7 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 8);
               }
               stmt.setString(5, (String)parms[8], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 102 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 103 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 104 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 105 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 107 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 110 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 111 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 112 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 113 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 115 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 116 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 117 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 119 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 121 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 122 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 123 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 124 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 125 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 126 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 127 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 128 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 129 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 130 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 131 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

