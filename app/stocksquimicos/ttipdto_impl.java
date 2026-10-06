package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipdto_impl extends GXDataArea
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
            AV25EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
            AV26TipDtoCod = (byte)(GXutil.lval( httpContext.GetPar( "TipDtoCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TipDtoCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPDTOCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26TipDtoCod), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tipo de Descuento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipDtoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttipdto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttipdto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipdto_impl.class ));
   }

   public ttipdto_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDtoCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipDtoCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\TTIPDTO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDtoDsc_Internalname, httpContext.getMessage( "Tipo Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoDsc_Internalname, GXutil.rtrim( A836TipDtoDsc), GXutil.rtrim( localUtil.format( A836TipDtoDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipDtoDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TTIPDTO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDtoDto_Internalname, httpContext.getMessage( "Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoDto_Internalname, GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoDto_Enabled!=0) ? localUtil.format( A837TipDtoDto, "Z9.99") : localUtil.format( A837TipDtoDto, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipDtoDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\TTIPDTO.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TTIPDTO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TTIPDTO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TTIPDTO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV30Pgmname), GXutil.rtrim( localUtil.format( AV30Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TTIPDTO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      e112F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z835TipDtoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z836TipDtoDsc = httpContext.cgiGet( "Z836TipDtoDsc") ;
            Z837TipDtoDto = localUtil.ctond( httpContext.cgiGet( "Z837TipDtoDto")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A13774TipDtoCDsc = httpContext.cgiGet( "TIPDTOCDSC") ;
            AV25EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV26TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vTIPDTOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDTOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDtoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A835TipDtoCod = (byte)(0) ;
               n835TipDtoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            }
            else
            {
               A835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n835TipDtoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            }
            A836TipDtoDsc = httpContext.cgiGet( edtTipDtoDsc_Internalname) ;
            n836TipDtoDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A836TipDtoDsc", A836TipDtoDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDTODTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDtoDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A837TipDtoDto = DecimalUtil.ZERO ;
               n837TipDtoDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
            }
            else
            {
               A837TipDtoDto = localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)) ;
               n837TipDtoDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
            }
            AV30Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTIPDTO");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A835TipDtoCod != Z835TipDtoCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\ttipdto:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A835TipDtoCod = (byte)(GXutil.lval( httpContext.GetPar( "TipDtoCod"))) ;
               n835TipDtoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
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
                  sMode103 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode103 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound103 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_2F0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TIPDTOCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipDtoCod_Internalname ;
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
                        e112F2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e122F2 ();
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
         e122F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2F103( ) ;
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
         disableAttributes2F103( ) ;
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

   public void confirm_2F0( )
   {
      beforeValidate2F103( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2F103( ) ;
         }
         else
         {
            checkExtendedTable2F103( ) ;
            closeExtendedTableCursors2F103( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption2F0( )
   {
   }

   public void e112F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttipdto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttipdto_impl.this.A396EmprCod = GXv_char2[0] ;
      ttipdto_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipdto_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttipdto_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttipdto_impl.this.AV25EmprCod = GXv_char4[0] ;
      ttipdto_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipdto_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV27WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV27WWPContext = GXv_SdtWWPContext5[0] ;
      AV28TrnContext.fromxml(AV29WebSession.getValue("TrnContext"), null, null);
   }

   public void e122F2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV28TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.stocksquimicos.ttipdtoww", new String[] {}, new String[] {}) );
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

   public void zm2F103( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z836TipDtoDsc = T002F3_A836TipDtoDsc[0] ;
            Z837TipDtoDto = T002F3_A837TipDtoDto[0] ;
         }
         else
         {
            Z836TipDtoDsc = A836TipDtoDsc ;
            Z837TipDtoDto = A837TipDtoDto ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z835TipDtoCod = A835TipDtoCod ;
         Z836TipDtoDsc = A836TipDtoDsc ;
         Z837TipDtoDto = A837TipDtoDto ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV30Pgmname = "StocksQuimicos.TTIPDTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         A396EmprCod = AV25EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T002F4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T002F4_A407EmprNom[0] ;
      n407EmprNom = T002F4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV26TipDtoCod) )
      {
         A835TipDtoCod = AV26TipDtoCod ;
         n835TipDtoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
      }
      if ( ! (0==AV26TipDtoCod) )
      {
         edtTipDtoCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDtoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipDtoCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDtoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV26TipDtoCod) )
      {
         edtTipDtoCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDtoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoCod_Enabled), 5, 0), true);
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

   public void load2F103( )
   {
      /* Using cursor T002F5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound103 = (short)(1) ;
         A836TipDtoDsc = T002F5_A836TipDtoDsc[0] ;
         n836TipDtoDsc = T002F5_n836TipDtoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A836TipDtoDsc", A836TipDtoDsc);
         A837TipDtoDto = T002F5_A837TipDtoDto[0] ;
         n837TipDtoDto = T002F5_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         A407EmprNom = T002F5_A407EmprNom[0] ;
         n407EmprNom = T002F5_n407EmprNom[0] ;
         zm2F103( -7) ;
      }
      pr_default.close(3);
      onLoadActions2F103( ) ;
   }

   public void onLoadActions2F103( )
   {
      A13774TipDtoCDsc = GXutil.trim( GXutil.str( A835TipDtoCod, 2, 0)) + "-" + GXutil.trim( A836TipDtoDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13774TipDtoCDsc", A13774TipDtoCDsc);
   }

   public void checkExtendedTable2F103( )
   {
      nIsDirty_103 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_103 = (short)(1) ;
      A13774TipDtoCDsc = GXutil.trim( GXutil.str( A835TipDtoCod, 2, 0)) + "-" + GXutil.trim( A836TipDtoDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13774TipDtoCDsc", A13774TipDtoCDsc);
   }

   public void closeExtendedTableCursors2F103( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2F103( )
   {
      /* Using cursor T002F6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound103 = (short)(1) ;
      }
      else
      {
         RcdFound103 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002F3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T002F3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2F103( 7) ;
         RcdFound103 = (short)(1) ;
         A835TipDtoCod = T002F3_A835TipDtoCod[0] ;
         n835TipDtoCod = T002F3_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         A836TipDtoDsc = T002F3_A836TipDtoDsc[0] ;
         n836TipDtoDsc = T002F3_n836TipDtoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A836TipDtoDsc", A836TipDtoDsc);
         A837TipDtoDto = T002F3_A837TipDtoDto[0] ;
         n837TipDtoDto = T002F3_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         Z396EmprCod = A396EmprCod ;
         Z835TipDtoCod = A835TipDtoCod ;
         sMode103 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2F103( ) ;
         if ( AnyError == 1 )
         {
            RcdFound103 = (short)(0) ;
            initializeNonKey2F103( ) ;
         }
         Gx_mode = sMode103 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound103 = (short)(0) ;
         initializeNonKey2F103( ) ;
         sMode103 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode103 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2F103( ) ;
      if ( RcdFound103 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound103 = (short)(0) ;
      /* Using cursor T002F7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T002F7_A835TipDtoCod[0] < A835TipDtoCod ) ) && ( GXutil.strcmp(T002F7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T002F7_A835TipDtoCod[0] > A835TipDtoCod ) ) && ( GXutil.strcmp(T002F7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A835TipDtoCod = T002F7_A835TipDtoCod[0] ;
            n835TipDtoCod = T002F7_n835TipDtoCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            RcdFound103 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound103 = (short)(0) ;
      /* Using cursor T002F8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T002F8_A835TipDtoCod[0] > A835TipDtoCod ) ) && ( GXutil.strcmp(T002F8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T002F8_A835TipDtoCod[0] < A835TipDtoCod ) ) && ( GXutil.strcmp(T002F8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A835TipDtoCod = T002F8_A835TipDtoCod[0] ;
            n835TipDtoCod = T002F8_n835TipDtoCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            RcdFound103 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2F103( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipDtoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2F103( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound103 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A835TipDtoCod != Z835TipDtoCod ) )
            {
               A835TipDtoCod = Z835TipDtoCod ;
               n835TipDtoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TIPDTOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDtoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipDtoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2F103( ) ;
               GX_FocusControl = edtTipDtoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A835TipDtoCod != Z835TipDtoCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtTipDtoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2F103( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TIPDTOCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipDtoCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTipDtoCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2F103( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A835TipDtoCod != Z835TipDtoCod ) )
      {
         A835TipDtoCod = Z835TipDtoCod ;
         n835TipDtoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TIPDTOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDtoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipDtoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2F103( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002F2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPDTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z836TipDtoDsc, T002F2_A836TipDtoDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z837TipDtoDto, T002F2_A837TipDtoDto[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z836TipDtoDsc, T002F2_A836TipDtoDsc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.ttipdto:[seudo value changed for attri]"+"TipDtoDsc");
               GXutil.writeLogRaw("Old: ",Z836TipDtoDsc);
               GXutil.writeLogRaw("Current: ",T002F2_A836TipDtoDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z837TipDtoDto, T002F2_A837TipDtoDto[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.ttipdto:[seudo value changed for attri]"+"TipDtoDto");
               GXutil.writeLogRaw("Old: ",Z837TipDtoDto);
               GXutil.writeLogRaw("Current: ",T002F2_A837TipDtoDto[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPDTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2F103( )
   {
      beforeValidate2F103( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2F103( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2F103( 0) ;
         checkOptimisticConcurrency2F103( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2F103( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2F103( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002F9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), Boolean.valueOf(n836TipDtoDsc), A836TipDtoDsc, Boolean.valueOf(n837TipDtoDto), A837TipDtoDto, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPDTO");
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
                        resetCaption2F0( ) ;
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
            load2F103( ) ;
         }
         endLevel2F103( ) ;
      }
      closeExtendedTableCursors2F103( ) ;
   }

   public void update2F103( )
   {
      beforeValidate2F103( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2F103( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2F103( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2F103( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2F103( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002F10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n836TipDtoDsc), A836TipDtoDsc, Boolean.valueOf(n837TipDtoDto), A837TipDtoDto, A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPDTO");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPDTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2F103( ) ;
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
         endLevel2F103( ) ;
      }
      closeExtendedTableCursors2F103( ) ;
   }

   public void deferredUpdate2F103( )
   {
   }

   public void delete( )
   {
      beforeValidate2F103( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2F103( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2F103( ) ;
         afterConfirm2F103( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2F103( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002F11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPDTO");
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
      sMode103 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2F103( ) ;
      Gx_mode = sMode103 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2F103( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13774TipDtoCDsc = GXutil.trim( GXutil.str( A835TipDtoCod, 2, 0)) + "-" + GXutil.trim( A836TipDtoDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13774TipDtoCDsc", A13774TipDtoCDsc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002F12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRODUC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel2F103( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2F103( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.ttipdto");
         if ( AnyError == 0 )
         {
            confirmValues2F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.ttipdto");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2F103( )
   {
      /* Scan By routine */
      /* Using cursor T002F13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound103 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound103 = (short)(1) ;
         A835TipDtoCod = T002F13_A835TipDtoCod[0] ;
         n835TipDtoCod = T002F13_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2F103( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound103 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound103 = (short)(1) ;
         A835TipDtoCod = T002F13_A835TipDtoCod[0] ;
         n835TipDtoCod = T002F13_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
      }
   }

   public void scanEnd2F103( )
   {
      pr_default.close(11);
   }

   public void afterConfirm2F103( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2F103( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2F103( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2F103( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2F103( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2F103( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2F103( )
   {
      edtTipDtoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoCod_Enabled), 5, 0), true);
      edtTipDtoDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoDsc_Enabled), 5, 0), true);
      edtTipDtoDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoDto_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2F103( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2F0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.ttipdto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26TipDtoCod,2,0))}, new String[] {"Gx_mode","EmprCod","TipDtoCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTIPDTO");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\ttipdto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z835TipDtoCod", GXutil.ltrim( localUtil.ntoc( Z835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z836TipDtoDsc", GXutil.rtrim( Z836TipDtoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z837TipDtoDto", GXutil.ltrim( localUtil.ntoc( Z837TipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV28TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV28TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV28TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDTOCDSC", A13774TipDtoCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDTOCOD", GXutil.ltrim( localUtil.ntoc( AV26TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPDTOCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26TipDtoCod), "Z9")));
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
      return formatLink("app.stocksquimicos.ttipdto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26TipDtoCod,2,0))}, new String[] {"Gx_mode","EmprCod","TipDtoCod"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.TTIPDTO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tipo de Descuento", "") ;
   }

   public void initializeNonKey2F103( )
   {
      A13774TipDtoCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13774TipDtoCDsc", A13774TipDtoCDsc);
      A836TipDtoDsc = "" ;
      n836TipDtoDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A836TipDtoDsc", A836TipDtoDsc);
      A837TipDtoDto = DecimalUtil.ZERO ;
      n837TipDtoDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      Z836TipDtoDsc = "" ;
      Z837TipDtoDto = DecimalUtil.ZERO ;
   }

   public void initAll2F103( )
   {
      A835TipDtoCod = (byte)(0) ;
      n835TipDtoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
      initializeNonKey2F103( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165264", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/ttipdto.js", "?2026821165264", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtTipDtoCod_Internalname = "TIPDTOCOD" ;
      edtTipDtoDsc_Internalname = "TIPDTODSC" ;
      edtTipDtoDto_Internalname = "TIPDTODTO" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      Form.setCaption( httpContext.getMessage( "Tipo de Descuento", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTipDtoDto_Jsonclick = "" ;
      edtTipDtoDto_Enabled = 1 ;
      edtTipDtoDsc_Jsonclick = "" ;
      edtTipDtoDsc_Enabled = 1 ;
      edtTipDtoCod_Jsonclick = "" ;
      edtTipDtoCod_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26TipDtoCod',fld:'vTIPDTOCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26TipDtoCod',fld:'vTIPDTOCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e122F2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_TIPDTOCOD","{handler:'valid_Tipdtocod',iparms:[]");
      setEventMetadata("VALID_TIPDTOCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPDTODSC","{handler:'valid_Tipdtodsc',iparms:[]");
      setEventMetadata("VALID_TIPDTODSC",",oparms:[]}");
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
      wcpOAV25EmprCod = "" ;
      Z396EmprCod = "" ;
      Z836TipDtoDsc = "" ;
      Z837TipDtoDto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV25EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A836TipDtoDsc = "" ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV30Pgmname = "" ;
      A13774TipDtoCDsc = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode103 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV27WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV29WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T002F4_A407EmprNom = new String[] {""} ;
      T002F4_n407EmprNom = new boolean[] {false} ;
      T002F5_A835TipDtoCod = new byte[1] ;
      T002F5_n835TipDtoCod = new boolean[] {false} ;
      T002F5_A836TipDtoDsc = new String[] {""} ;
      T002F5_n836TipDtoDsc = new boolean[] {false} ;
      T002F5_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002F5_n837TipDtoDto = new boolean[] {false} ;
      T002F5_A407EmprNom = new String[] {""} ;
      T002F5_n407EmprNom = new boolean[] {false} ;
      T002F5_A396EmprCod = new String[] {""} ;
      T002F6_A396EmprCod = new String[] {""} ;
      T002F6_A835TipDtoCod = new byte[1] ;
      T002F6_n835TipDtoCod = new boolean[] {false} ;
      T002F3_A835TipDtoCod = new byte[1] ;
      T002F3_n835TipDtoCod = new boolean[] {false} ;
      T002F3_A836TipDtoDsc = new String[] {""} ;
      T002F3_n836TipDtoDsc = new boolean[] {false} ;
      T002F3_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002F3_n837TipDtoDto = new boolean[] {false} ;
      T002F3_A396EmprCod = new String[] {""} ;
      T002F7_A396EmprCod = new String[] {""} ;
      T002F7_A835TipDtoCod = new byte[1] ;
      T002F7_n835TipDtoCod = new boolean[] {false} ;
      T002F8_A396EmprCod = new String[] {""} ;
      T002F8_A835TipDtoCod = new byte[1] ;
      T002F8_n835TipDtoCod = new boolean[] {false} ;
      T002F2_A835TipDtoCod = new byte[1] ;
      T002F2_n835TipDtoCod = new boolean[] {false} ;
      T002F2_A836TipDtoDsc = new String[] {""} ;
      T002F2_n836TipDtoDsc = new boolean[] {false} ;
      T002F2_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002F2_n837TipDtoDto = new boolean[] {false} ;
      T002F2_A396EmprCod = new String[] {""} ;
      T002F12_A396EmprCod = new String[] {""} ;
      T002F12_A719PrdNum = new String[] {""} ;
      T002F13_A396EmprCod = new String[] {""} ;
      T002F13_A835TipDtoCod = new byte[1] ;
      T002F13_n835TipDtoCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipdto__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipdto__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipdto__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipdto__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipdto__default(),
         new Object[] {
             new Object[] {
            T002F2_A835TipDtoCod, T002F2_A836TipDtoDsc, T002F2_n836TipDtoDsc, T002F2_A837TipDtoDto, T002F2_n837TipDtoDto, T002F2_A396EmprCod
            }
            , new Object[] {
            T002F3_A835TipDtoCod, T002F3_A836TipDtoDsc, T002F3_n836TipDtoDsc, T002F3_A837TipDtoDto, T002F3_n837TipDtoDto, T002F3_A396EmprCod
            }
            , new Object[] {
            T002F4_A407EmprNom, T002F4_n407EmprNom
            }
            , new Object[] {
            T002F5_A835TipDtoCod, T002F5_A836TipDtoDsc, T002F5_n836TipDtoDsc, T002F5_A837TipDtoDto, T002F5_n837TipDtoDto, T002F5_A407EmprNom, T002F5_n407EmprNom, T002F5_A396EmprCod
            }
            , new Object[] {
            T002F6_A396EmprCod, T002F6_A835TipDtoCod
            }
            , new Object[] {
            T002F7_A396EmprCod, T002F7_A835TipDtoCod
            }
            , new Object[] {
            T002F8_A396EmprCod, T002F8_A835TipDtoCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002F12_A396EmprCod, T002F12_A719PrdNum
            }
            , new Object[] {
            T002F13_A396EmprCod, T002F13_A835TipDtoCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV30Pgmname = "StocksQuimicos.TTIPDTO" ;
   }

   private byte wcpOAV26TipDtoCod ;
   private byte Z835TipDtoCod ;
   private byte GxWebError ;
   private byte AV26TipDtoCod ;
   private byte nKeyPressed ;
   private byte A835TipDtoCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound103 ;
   private short nIsDirty_103 ;
   private int trnEnded ;
   private int edtTipDtoCod_Enabled ;
   private int edtTipDtoDsc_Enabled ;
   private int edtTipDtoDto_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z837TipDtoDto ;
   private java.math.BigDecimal A837TipDtoDto ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV25EmprCod ;
   private String Z396EmprCod ;
   private String Z836TipDtoDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV25EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipDtoCod_Internalname ;
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
   private String edtTipDtoCod_Jsonclick ;
   private String edtTipDtoDsc_Internalname ;
   private String A836TipDtoDsc ;
   private String edtTipDtoDsc_Jsonclick ;
   private String edtTipDtoDto_Internalname ;
   private String edtTipDtoDto_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV30Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode103 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
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
   private boolean n835TipDtoCod ;
   private boolean n836TipDtoDsc ;
   private boolean n837TipDtoDto ;
   private boolean returnInSub ;
   private String A13774TipDtoCDsc ;
   private com.genexus.webpanels.WebSession AV29WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T002F4_A407EmprNom ;
   private boolean[] T002F4_n407EmprNom ;
   private byte[] T002F5_A835TipDtoCod ;
   private boolean[] T002F5_n835TipDtoCod ;
   private String[] T002F5_A836TipDtoDsc ;
   private boolean[] T002F5_n836TipDtoDsc ;
   private java.math.BigDecimal[] T002F5_A837TipDtoDto ;
   private boolean[] T002F5_n837TipDtoDto ;
   private String[] T002F5_A407EmprNom ;
   private boolean[] T002F5_n407EmprNom ;
   private String[] T002F5_A396EmprCod ;
   private String[] T002F6_A396EmprCod ;
   private byte[] T002F6_A835TipDtoCod ;
   private boolean[] T002F6_n835TipDtoCod ;
   private byte[] T002F3_A835TipDtoCod ;
   private boolean[] T002F3_n835TipDtoCod ;
   private String[] T002F3_A836TipDtoDsc ;
   private boolean[] T002F3_n836TipDtoDsc ;
   private java.math.BigDecimal[] T002F3_A837TipDtoDto ;
   private boolean[] T002F3_n837TipDtoDto ;
   private String[] T002F3_A396EmprCod ;
   private String[] T002F7_A396EmprCod ;
   private byte[] T002F7_A835TipDtoCod ;
   private boolean[] T002F7_n835TipDtoCod ;
   private String[] T002F8_A396EmprCod ;
   private byte[] T002F8_A835TipDtoCod ;
   private boolean[] T002F8_n835TipDtoCod ;
   private byte[] T002F2_A835TipDtoCod ;
   private boolean[] T002F2_n835TipDtoCod ;
   private String[] T002F2_A836TipDtoDsc ;
   private boolean[] T002F2_n836TipDtoDsc ;
   private java.math.BigDecimal[] T002F2_A837TipDtoDto ;
   private boolean[] T002F2_n837TipDtoDto ;
   private String[] T002F2_A396EmprCod ;
   private String[] T002F12_A396EmprCod ;
   private String[] T002F12_A719PrdNum ;
   private String[] T002F13_A396EmprCod ;
   private byte[] T002F13_A835TipDtoCod ;
   private boolean[] T002F13_n835TipDtoCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV27WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV28TrnContext ;
}

final  class ttipdto__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipdto__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipdto__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipdto__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipdto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002F2", "SELECT TipDtoCod, TipDtoDsc, TipDtoDto, EmprCod FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ?  FOR UPDATE OF TipDtoDsc, TipDtoDto NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002F3", "SELECT TipDtoCod, TipDtoDsc, TipDtoDto, EmprCod FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002F4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002F5", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipDtoCod, TM1.TipDtoDsc, TM1.TipDtoDto, T2.EmprNom, TM1.EmprCod FROM (TXPTIPDTO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TipDtoCod = ? ORDER BY TM1.EmprCod, TM1.TipDtoCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002F6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipDtoCod FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002F7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipDtoCod FROM TXPTIPDTO WHERE ( TipDtoCod > ?) and EmprCod = ? ORDER BY EmprCod, TipDtoCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002F8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipDtoCod FROM TXPTIPDTO WHERE ( TipDtoCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, TipDtoCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002F9", "INSERT INTO TXPTIPDTO(TipDtoCod, TipDtoDsc, TipDtoDto, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPTIPDTO")
         ,new UpdateCursor("T002F10", "UPDATE TXPTIPDTO SET TipDtoDsc=?, TipDtoDto=?  WHERE EmprCod = ? AND TipDtoCod = ?", GX_NOMASK, "TXPTIPDTO")
         ,new UpdateCursor("T002F11", "DELETE FROM TXPTIPDTO  WHERE EmprCod = ? AND TipDtoCod = ?", GX_NOMASK, "TXPTIPDTO")
         ,new ForEachCursor("T002F12", "SELECT * FROM (SELECT EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND TipDtoCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002F13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TipDtoCod FROM TXPTIPDTO WHERE EmprCod = ? ORDER BY EmprCod, TipDtoCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
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
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

