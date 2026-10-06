package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidaproductomanual_header_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_21_1TB111( A396EmprCod, A859CumCodCont) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"CC_ALMDC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8925CC_AlmCd = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCd"))) ;
         n8925CC_AlmCd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asacc_almdc1TB111( A396EmprCod, A8925CC_AlmCd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"CUMCCOSD") == 0 )
      {
         A10777CumCCos = (short)(GXutil.lval( httpContext.GetPar( "CumCCos"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asacumccosd1TB111( A10777CumCCos) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A3839CcoCod = (short)(GXutil.lval( httpContext.GetPar( "CcoCod"))) ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A3839CcoCod) ;
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
            AV8CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CumCodCont), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CumCodCont), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Salida Producto Manual (Cabecera)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public salidaproductomanual_header_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidaproductomanual_header_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidaproductomanual_header_impl.class ));
   }

   public salidaproductomanual_header_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumCodCont_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCodCont_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCodCont_Internalname, GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A859CumCodCont), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCodCont_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumCodCont_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConFec_Internalname, httpContext.getMessage( "Fecha ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCumConFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConFec_Internalname, localUtil.format(A862CumConFec, "99/99/99"), localUtil.format( A862CumConFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumConFec_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCumConFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCumConFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SalidaProductoManual_header.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedcumccos_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcumccos_Internalname, httpContext.getMessage( "Centro Coste", ""), "", "", lblTextblockcumccos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_cumccos.setProperty("Caption", Combo_cumccos_Caption);
      ucCombo_cumccos.setProperty("Cls", Combo_cumccos_Cls);
      ucCombo_cumccos.setProperty("DropDownOptionsData", AV26CumCCos_Data);
      ucCombo_cumccos.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cumccos_Internalname, "COMBO_CUMCCOSContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCCos_Internalname, httpContext.getMessage( "Centro Coste", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A10777CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumCCos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10777CumCCos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10777CumCCos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCCos_Jsonclick, 0, "Attribute", "", "", "", "", edtCumCCos_Visible, edtCumCCos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divCombo_cc_almcd_cell_Internalname, 1, 0, "px", 0, "px", divCombo_cc_almcd_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedcc_almcd_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcc_almcd_Internalname, httpContext.getMessage( "Almacen", ""), "", "", lblTextblockcc_almcd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_cc_almcd.setProperty("Caption", Combo_cc_almcd_Caption);
      ucCombo_cc_almcd.setProperty("Cls", Combo_cc_almcd_Cls);
      ucCombo_cc_almcd.setProperty("EmptyItem", Combo_cc_almcd_Emptyitem);
      ucCombo_cc_almcd.setProperty("DropDownOptionsData", AV23CC_AlmCd_Data);
      ucCombo_cc_almcd.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cc_almcd_Internalname, "COMBO_CC_ALMCDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCC_AlmCd_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCC_AlmCd_Internalname, GXutil.ltrim( localUtil.ntoc( A8925CC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCC_AlmCd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8925CC_AlmCd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8925CC_AlmCd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCC_AlmCd_Jsonclick, 0, "Attribute", "", "", "", "", edtCC_AlmCd_Visible, edtCC_AlmCd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_header.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidaProductoManual_header.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidaProductoManual_header.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_cumccos_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombocumccos_Internalname, GXutil.ltrim( localUtil.ntoc( AV27ComboCumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombocumccos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27ComboCumCCos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27ComboCumCCos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombocumccos_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombocumccos_Visible, edtavCombocumccos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_header.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_cc_almcd_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombocc_almcd_Internalname, GXutil.ltrim( localUtil.ntoc( AV25ComboCC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombocc_almcd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25ComboCC_AlmCd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV25ComboCC_AlmCd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombocc_almcd_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombocc_almcd_Visible, edtavCombocc_almcd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidaProductoManual_header.htm");
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
      e111TB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCUMCCOS_DATA"), AV26CumCCos_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCC_ALMCD_DATA"), AV23CC_AlmCd_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "Z859CumCodCont"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10777CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( "Z10777CumCCos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8925CC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8925CC_AlmCd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11368CumConTipo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z862CumConFec = localUtil.ctod( httpContext.cgiGet( "Z862CumConFec"), 0) ;
            Z3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11368CumConTipo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3839CcoCod = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "N3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A8926CC_AlmDc = httpContext.cgiGet( "CC_ALMDC") ;
            A10778CumCCosD = httpContext.cgiGet( "CUMCCOSD") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "vCUMCODCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "CCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "CUMCONTIPO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            Combo_cumccos_Objectcall = httpContext.cgiGet( "COMBO_CUMCCOS_Objectcall") ;
            Combo_cumccos_Class = httpContext.cgiGet( "COMBO_CUMCCOS_Class") ;
            Combo_cumccos_Icontype = httpContext.cgiGet( "COMBO_CUMCCOS_Icontype") ;
            Combo_cumccos_Icon = httpContext.cgiGet( "COMBO_CUMCCOS_Icon") ;
            Combo_cumccos_Caption = httpContext.cgiGet( "COMBO_CUMCCOS_Caption") ;
            Combo_cumccos_Tooltip = httpContext.cgiGet( "COMBO_CUMCCOS_Tooltip") ;
            Combo_cumccos_Cls = httpContext.cgiGet( "COMBO_CUMCCOS_Cls") ;
            Combo_cumccos_Selectedvalue_set = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedvalue_set") ;
            Combo_cumccos_Selectedvalue_get = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedvalue_get") ;
            Combo_cumccos_Selectedtext_set = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedtext_set") ;
            Combo_cumccos_Selectedtext_get = httpContext.cgiGet( "COMBO_CUMCCOS_Selectedtext_get") ;
            Combo_cumccos_Gamoauthtoken = httpContext.cgiGet( "COMBO_CUMCCOS_Gamoauthtoken") ;
            Combo_cumccos_Ddointernalname = httpContext.cgiGet( "COMBO_CUMCCOS_Ddointernalname") ;
            Combo_cumccos_Titlecontrolalign = httpContext.cgiGet( "COMBO_CUMCCOS_Titlecontrolalign") ;
            Combo_cumccos_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CUMCCOS_Dropdownoptionstype") ;
            Combo_cumccos_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Enabled")) ;
            Combo_cumccos_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Visible")) ;
            Combo_cumccos_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CUMCCOS_Titlecontrolidtoreplace") ;
            Combo_cumccos_Datalisttype = httpContext.cgiGet( "COMBO_CUMCCOS_Datalisttype") ;
            Combo_cumccos_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Allowmultipleselection")) ;
            Combo_cumccos_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CUMCCOS_Datalistfixedvalues") ;
            Combo_cumccos_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Isgriditem")) ;
            Combo_cumccos_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Hasdescription")) ;
            Combo_cumccos_Datalistproc = httpContext.cgiGet( "COMBO_CUMCCOS_Datalistproc") ;
            Combo_cumccos_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CUMCCOS_Datalistprocparametersprefix") ;
            Combo_cumccos_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CUMCCOS_Remoteservicesparameters") ;
            Combo_cumccos_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CUMCCOS_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_cumccos_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Includeonlyselectedoption")) ;
            Combo_cumccos_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Includeselectalloption")) ;
            Combo_cumccos_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Emptyitem")) ;
            Combo_cumccos_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CUMCCOS_Includeaddnewoption")) ;
            Combo_cumccos_Htmltemplate = httpContext.cgiGet( "COMBO_CUMCCOS_Htmltemplate") ;
            Combo_cumccos_Multiplevaluestype = httpContext.cgiGet( "COMBO_CUMCCOS_Multiplevaluestype") ;
            Combo_cumccos_Loadingdata = httpContext.cgiGet( "COMBO_CUMCCOS_Loadingdata") ;
            Combo_cumccos_Noresultsfound = httpContext.cgiGet( "COMBO_CUMCCOS_Noresultsfound") ;
            Combo_cumccos_Emptyitemtext = httpContext.cgiGet( "COMBO_CUMCCOS_Emptyitemtext") ;
            Combo_cumccos_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CUMCCOS_Onlyselectedvalues") ;
            Combo_cumccos_Selectalltext = httpContext.cgiGet( "COMBO_CUMCCOS_Selectalltext") ;
            Combo_cumccos_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CUMCCOS_Multiplevaluesseparator") ;
            Combo_cumccos_Addnewoptiontext = httpContext.cgiGet( "COMBO_CUMCCOS_Addnewoptiontext") ;
            Combo_cc_almcd_Objectcall = httpContext.cgiGet( "COMBO_CC_ALMCD_Objectcall") ;
            Combo_cc_almcd_Class = httpContext.cgiGet( "COMBO_CC_ALMCD_Class") ;
            Combo_cc_almcd_Icontype = httpContext.cgiGet( "COMBO_CC_ALMCD_Icontype") ;
            Combo_cc_almcd_Icon = httpContext.cgiGet( "COMBO_CC_ALMCD_Icon") ;
            Combo_cc_almcd_Caption = httpContext.cgiGet( "COMBO_CC_ALMCD_Caption") ;
            Combo_cc_almcd_Tooltip = httpContext.cgiGet( "COMBO_CC_ALMCD_Tooltip") ;
            Combo_cc_almcd_Cls = httpContext.cgiGet( "COMBO_CC_ALMCD_Cls") ;
            Combo_cc_almcd_Selectedvalue_set = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedvalue_set") ;
            Combo_cc_almcd_Selectedvalue_get = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedvalue_get") ;
            Combo_cc_almcd_Selectedtext_set = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedtext_set") ;
            Combo_cc_almcd_Selectedtext_get = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectedtext_get") ;
            Combo_cc_almcd_Gamoauthtoken = httpContext.cgiGet( "COMBO_CC_ALMCD_Gamoauthtoken") ;
            Combo_cc_almcd_Ddointernalname = httpContext.cgiGet( "COMBO_CC_ALMCD_Ddointernalname") ;
            Combo_cc_almcd_Titlecontrolalign = httpContext.cgiGet( "COMBO_CC_ALMCD_Titlecontrolalign") ;
            Combo_cc_almcd_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CC_ALMCD_Dropdownoptionstype") ;
            Combo_cc_almcd_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Enabled")) ;
            Combo_cc_almcd_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Visible")) ;
            Combo_cc_almcd_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CC_ALMCD_Titlecontrolidtoreplace") ;
            Combo_cc_almcd_Datalisttype = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalisttype") ;
            Combo_cc_almcd_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Allowmultipleselection")) ;
            Combo_cc_almcd_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistfixedvalues") ;
            Combo_cc_almcd_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Isgriditem")) ;
            Combo_cc_almcd_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Hasdescription")) ;
            Combo_cc_almcd_Datalistproc = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistproc") ;
            Combo_cc_almcd_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistprocparametersprefix") ;
            Combo_cc_almcd_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CC_ALMCD_Remoteservicesparameters") ;
            Combo_cc_almcd_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CC_ALMCD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_cc_almcd_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Includeonlyselectedoption")) ;
            Combo_cc_almcd_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Includeselectalloption")) ;
            Combo_cc_almcd_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Emptyitem")) ;
            Combo_cc_almcd_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CC_ALMCD_Includeaddnewoption")) ;
            Combo_cc_almcd_Htmltemplate = httpContext.cgiGet( "COMBO_CC_ALMCD_Htmltemplate") ;
            Combo_cc_almcd_Multiplevaluestype = httpContext.cgiGet( "COMBO_CC_ALMCD_Multiplevaluestype") ;
            Combo_cc_almcd_Loadingdata = httpContext.cgiGet( "COMBO_CC_ALMCD_Loadingdata") ;
            Combo_cc_almcd_Noresultsfound = httpContext.cgiGet( "COMBO_CC_ALMCD_Noresultsfound") ;
            Combo_cc_almcd_Emptyitemtext = httpContext.cgiGet( "COMBO_CC_ALMCD_Emptyitemtext") ;
            Combo_cc_almcd_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CC_ALMCD_Onlyselectedvalues") ;
            Combo_cc_almcd_Selectalltext = httpContext.cgiGet( "COMBO_CC_ALMCD_Selectalltext") ;
            Combo_cc_almcd_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CC_ALMCD_Multiplevaluesseparator") ;
            Combo_cc_almcd_Addnewoptiontext = httpContext.cgiGet( "COMBO_CC_ALMCD_Addnewoptiontext") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCODCONT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A859CumCodCont = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            }
            else
            {
               A859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCumConFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CUMCONFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumConFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A862CumConFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
            }
            else
            {
               A862CumConFec = localUtil.ctod( httpContext.cgiGet( edtCumConFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCCOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCCos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10777CumCCos = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
            }
            else
            {
               A10777CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CC_ALMCD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCC_AlmCd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8925CC_AlmCd = (byte)(0) ;
               n8925CC_AlmCd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
            }
            else
            {
               A8925CC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8925CC_AlmCd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
            }
            AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
            AV27ComboCumCCos = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombocumccos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27ComboCumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ComboCumCCos), 3, 0));
            AV25ComboCC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombocc_almcd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ComboCC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboCC_AlmCd), 2, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"SalidaProductoManual_header");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV29Pgmname, "")));
            forbiddenHiddens.add("CumConTipo", localUtil.format( DecimalUtil.doubleToDec(A11368CumConTipo), "Z9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A859CumCodCont != Z859CumCodCont ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("salidaproductomanual_header:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
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
                  sMode111 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode111 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound111 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TB0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CUMCODCONT");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCumCodCont_Internalname ;
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
                        e111TB2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TB2 ();
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
         e121TB2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TB111( ) ;
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
         disableAttributes1TB111( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocumccos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocumccos_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocc_almcd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocc_almcd_Enabled), 5, 0), true);
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

   public void confirm_1TB0( )
   {
      beforeValidate1TB111( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TB111( ) ;
         }
         else
         {
            checkExtendedTable1TB111( ) ;
            closeExtendedTableCursors1TB111( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TB0( )
   {
   }

   public void e111TB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      salidaproductomanual_header_impl.this.A396EmprCod = GXv_char2[0] ;
      salidaproductomanual_header_impl.this.AV15EmprNom = GXv_char3[0] ;
      salidaproductomanual_header_impl.this.AV16UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprNom", AV15EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      GXt_int5 = (byte)(AV17ConMan) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CONMAN", ""), GXv_int6) ;
      salidaproductomanual_header_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17ConMan = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ConMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ConMan), 4, 0));
      GXt_int7 = AV18Contval ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CONMAN", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      salidaproductomanual_header_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_header_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV18Contval = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Contval", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Contval), 8, 0));
      GXt_int5 = (byte)(AV19Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      salidaproductomanual_header_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Moda21), 4, 0));
      GXt_int5 = (byte)(AV20FlagPreMed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      salidaproductomanual_header_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20FlagPreMed), 4, 0));
      GXt_int5 = (byte)(AV21Val_stk) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      salidaproductomanual_header_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Val_stk), 4, 0));
      GXt_int7 = AV22Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      salidaproductomanual_header_impl.this.GXt_int7 = GXv_int8[0] ;
      AV22Precio_stk = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Precio_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Precio_stk), 4, 0));
      GXt_char1 = AV14Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char2[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char4, GXv_char3, GXv_char2) ;
      salidaproductomanual_header_impl.this.AV7EmprCod = GXv_char4[0] ;
      salidaproductomanual_header_impl.this.AV15EmprNom = GXv_char3[0] ;
      salidaproductomanual_header_impl.this.AV16UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprNom", AV15EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      GXv_SdtWWPContext9[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV9WWPContext = GXv_SdtWWPContext9[0] ;
      edtCC_AlmCd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCd_Visible), 5, 0), true);
      AV25ComboCC_AlmCd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboCC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboCC_AlmCd), 2, 0));
      edtavCombocc_almcd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocc_almcd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocc_almcd_Visible), 5, 0), true);
      edtCumCCos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCCos_Visible), 5, 0), true);
      AV27ComboCumCCos = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ComboCumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ComboCumCCos), 3, 0));
      edtavCombocumccos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocumccos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocumccos_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCUMCCOS' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOCC_ALMCD' */
      S122 ();
      if ( returnInSub )
      {
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
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV29Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV30GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GXV1), 8, 0));
         while ( AV30GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV30GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CcoCod") == 0 )
            {
               AV12Insert_CcoCod = (short)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CcoCod), 3, 0));
            }
            AV30GXV1 = (int)(AV30GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GXV1), 8, 0));
         }
      }
   }

   public void e121TB2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.salidaproductomanual_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A859CumCodCont,8,0))}, new String[] {"EmprCod","CumCodCont"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.salidaproductomanual_headerww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
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
      Combo_cc_almcd_Visible = false ;
      ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "Visible", GXutil.booltostr( Combo_cc_almcd_Visible));
      divCombo_cc_almcd_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divCombo_cc_almcd_cell_Internalname, "Class", divCombo_cc_almcd_cell_Class, true);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCC_ALMCD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV23CC_AlmCd_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.salidaproductomanual_headerloaddvcombo(remoteHandle, context).execute( "CC_AlmCd", Gx_mode, AV7EmprCod, AV8CumCodCont, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      salidaproductomanual_header_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV23CC_AlmCd_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_cc_almcd_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "SelectedValue_set", Combo_cc_almcd_Selectedvalue_set);
      AV25ComboCC_AlmCd = (byte)(GXutil.lval( AV24ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboCC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25ComboCC_AlmCd), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_cc_almcd_Enabled = false ;
         ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "Enabled", GXutil.booltostr( Combo_cc_almcd_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCUMCCOS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV26CumCCos_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.salidaproductomanual_headerloaddvcombo(remoteHandle, context).execute( "CumCCos", Gx_mode, AV7EmprCod, AV8CumCodCont, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      salidaproductomanual_header_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV26CumCCos_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_cumccos_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_cumccos.sendProperty(context, "", false, Combo_cumccos_Internalname, "SelectedValue_set", Combo_cumccos_Selectedvalue_set);
      AV27ComboCumCCos = (short)(GXutil.lval( AV24ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ComboCumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ComboCumCCos), 3, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_cumccos_Enabled = false ;
         ucCombo_cumccos.sendProperty(context, "", false, Combo_cumccos_Internalname, "Enabled", GXutil.booltostr( Combo_cumccos_Enabled));
      }
   }

   public void zm1TB111( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10777CumCCos = T01TB3_A10777CumCCos[0] ;
            Z8925CC_AlmCd = T01TB3_A8925CC_AlmCd[0] ;
            Z11368CumConTipo = T01TB3_A11368CumConTipo[0] ;
            Z862CumConFec = T01TB3_A862CumConFec[0] ;
            Z3839CcoCod = T01TB3_A3839CcoCod[0] ;
         }
         else
         {
            Z10777CumCCos = A10777CumCCos ;
            Z8925CC_AlmCd = A8925CC_AlmCd ;
            Z11368CumConTipo = A11368CumConTipo ;
            Z862CumConFec = A862CumConFec ;
            Z3839CcoCod = A3839CcoCod ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z859CumCodCont = A859CumCodCont ;
         Z10777CumCCos = A10777CumCCos ;
         Z8925CC_AlmCd = A8925CC_AlmCd ;
         Z11368CumConTipo = A11368CumConTipo ;
         Z862CumConFec = A862CumConFec ;
         Z396EmprCod = A396EmprCod ;
         Z3839CcoCod = A3839CcoCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
      }
   }

   public void standaloneNotModal( )
   {
      AV29Pgmname = "SalidaProductoManual_header" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TB4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TB4_A407EmprNom[0] ;
      n407EmprNom = T01TB4_n407EmprNom[0] ;
      A3915EmpNumDec = T01TB4_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01TB4_n3915EmpNumDec[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TELIOT", ""), ""), GXv_int6) ;
      salidaproductomanual_header_impl.this.GXt_int5 = GXv_int6[0] ;
      Combo_cc_almcd_Visible = (boolean)((GXt_int5==1)) ;
      ucCombo_cc_almcd.sendProperty(context, "", false, Combo_cc_almcd_Internalname, "Visible", GXutil.booltostr( Combo_cc_almcd_Visible));
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TELIOT", ""), ""), GXv_int6) ;
      salidaproductomanual_header_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divCombo_cc_almcd_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_cc_almcd_cell_Internalname, "Class", divCombo_cc_almcd_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TELIOT", ""), ""), GXv_int6) ;
         salidaproductomanual_header_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divCombo_cc_almcd_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divCombo_cc_almcd_cell_Internalname, "Class", divCombo_cc_almcd_cell_Class, true);
         }
      }
      if ( ! (0==AV8CumCodCont) )
      {
         A859CumCodCont = AV8CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      if ( ! (0==AV8CumCodCont) )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         edtCumConFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      }
      else
      {
         edtCumConFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtCumConFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CcoCod) )
      {
         A3839CcoCod = AV12Insert_CcoCod ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      }
      A10777CumCCos = AV27ComboCumCCos ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A8925CC_AlmCd = AV25ComboCC_AlmCd ;
      n8925CC_AlmCd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      if ( ! (0==AV8CumCodCont) )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
      else
      {
         if ( isIns( )  )
         {
            edtCumCodCont_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
         }
         else
         {
            edtCumCodCont_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A862CumConFec)) && ( Gx_BScreen == 0 ) )
      {
         A862CumConFec = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      }
      if ( isIns( )  && (0==A11368CumConTipo) && ( Gx_BScreen == 0 ) )
      {
         A11368CumConTipo = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_char1 = A10778CumCCosD ;
         GXv_int12[0] = A10777CumCCos ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
         salidaproductomanual_header_impl.this.A10777CumCCos = GXv_int12[0] ;
         salidaproductomanual_header_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A10778CumCCosD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
         GXt_char1 = A8926CC_AlmDc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A8925CC_AlmCd ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         salidaproductomanual_header_impl.this.A396EmprCod = GXv_char4[0] ;
         salidaproductomanual_header_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
         salidaproductomanual_header_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A8926CC_AlmDc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      }
   }

   public void load1TB111( )
   {
      /* Using cursor T01TB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A10777CumCCos = T01TB6_A10777CumCCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A8925CC_AlmCd = T01TB6_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = T01TB6_n8925CC_AlmCd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A407EmprNom = T01TB6_A407EmprNom[0] ;
         n407EmprNom = T01TB6_n407EmprNom[0] ;
         A3915EmpNumDec = T01TB6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01TB6_n3915EmpNumDec[0] ;
         A11368CumConTipo = T01TB6_A11368CumConTipo[0] ;
         A862CumConFec = T01TB6_A862CumConFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A3839CcoCod = T01TB6_A3839CcoCod[0] ;
         n3839CcoCod = T01TB6_n3839CcoCod[0] ;
         zm1TB111( -22) ;
      }
      pr_default.close(4);
      onLoadActions1TB111( ) ;
   }

   public void onLoadActions1TB111( )
   {
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      salidaproductomanual_header_impl.this.A10777CumCCos = GXv_int12[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidaproductomanual_header_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_header_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
   }

   public void checkExtendedTable1TB111( )
   {
      nIsDirty_111 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      salidaproductomanual_header_impl.this.A10777CumCCos = GXv_int12[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      /* Using cursor T01TB5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(3);
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidaproductomanual_header_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_header_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
   }

   public void closeExtendedTableCursors1TB111( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_24( short A3839CcoCod )
   {
      /* Using cursor T01TB7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
         }
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

   public void getKey1TB111( )
   {
      /* Using cursor T01TB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound111 = (short)(1) ;
      }
      else
      {
         RcdFound111 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01TB3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1TB111( 22) ;
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01TB3_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         A10777CumCCos = T01TB3_A10777CumCCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A8925CC_AlmCd = T01TB3_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = T01TB3_n8925CC_AlmCd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A11368CumConTipo = T01TB3_A11368CumConTipo[0] ;
         A862CumConFec = T01TB3_A862CumConFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A3839CcoCod = T01TB3_A3839CcoCod[0] ;
         n3839CcoCod = T01TB3_n3839CcoCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TB111( ) ;
         if ( AnyError == 1 )
         {
            RcdFound111 = (short)(0) ;
            initializeNonKey1TB111( ) ;
         }
         Gx_mode = sMode111 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound111 = (short)(0) ;
         initializeNonKey1TB111( ) ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode111 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TB111( ) ;
      if ( RcdFound111 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound111 = (short)(0) ;
      /* Using cursor T01TB9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A859CumCodCont), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01TB9_A859CumCodCont[0] < A859CumCodCont ) ) && ( GXutil.strcmp(T01TB9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01TB9_A859CumCodCont[0] > A859CumCodCont ) ) && ( GXutil.strcmp(T01TB9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01TB9_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound111 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound111 = (short)(0) ;
      /* Using cursor T01TB10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A859CumCodCont), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01TB10_A859CumCodCont[0] > A859CumCodCont ) ) && ( GXutil.strcmp(T01TB10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01TB10_A859CumCodCont[0] < A859CumCodCont ) ) && ( GXutil.strcmp(T01TB10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01TB10_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound111 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TB111( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TB111( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound111 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
            {
               A859CumCodCont = Z859CumCodCont ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CUMCODCONT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TB111( ) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
            {
               /* Insert record */
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TB111( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CUMCODCONT");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCumCodCont_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCumCodCont_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TB111( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
      {
         A859CumCodCont = Z859CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CUMCODCONT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TB111( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z10777CumCCos != T01TB2_A10777CumCCos[0] ) || ( Z8925CC_AlmCd != T01TB2_A8925CC_AlmCd[0] ) || ( Z11368CumConTipo != T01TB2_A11368CumConTipo[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z862CumConFec), GXutil.resetTime(T01TB2_A862CumConFec[0])) ) || ( Z3839CcoCod != T01TB2_A3839CcoCod[0] ) )
         {
            if ( Z10777CumCCos != T01TB2_A10777CumCCos[0] )
            {
               GXutil.writeLogln("salidaproductomanual_header:[seudo value changed for attri]"+"CumCCos");
               GXutil.writeLogRaw("Old: ",Z10777CumCCos);
               GXutil.writeLogRaw("Current: ",T01TB2_A10777CumCCos[0]);
            }
            if ( Z8925CC_AlmCd != T01TB2_A8925CC_AlmCd[0] )
            {
               GXutil.writeLogln("salidaproductomanual_header:[seudo value changed for attri]"+"CC_AlmCd");
               GXutil.writeLogRaw("Old: ",Z8925CC_AlmCd);
               GXutil.writeLogRaw("Current: ",T01TB2_A8925CC_AlmCd[0]);
            }
            if ( Z11368CumConTipo != T01TB2_A11368CumConTipo[0] )
            {
               GXutil.writeLogln("salidaproductomanual_header:[seudo value changed for attri]"+"CumConTipo");
               GXutil.writeLogRaw("Old: ",Z11368CumConTipo);
               GXutil.writeLogRaw("Current: ",T01TB2_A11368CumConTipo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z862CumConFec), GXutil.resetTime(T01TB2_A862CumConFec[0])) ) )
            {
               GXutil.writeLogln("salidaproductomanual_header:[seudo value changed for attri]"+"CumConFec");
               GXutil.writeLogRaw("Old: ",Z862CumConFec);
               GXutil.writeLogRaw("Current: ",T01TB2_A862CumConFec[0]);
            }
            if ( Z3839CcoCod != T01TB2_A3839CcoCod[0] )
            {
               GXutil.writeLogln("salidaproductomanual_header:[seudo value changed for attri]"+"CcoCod");
               GXutil.writeLogRaw("Old: ",Z3839CcoCod);
               GXutil.writeLogRaw("Current: ",T01TB2_A3839CcoCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TB111( )
   {
      beforeValidate1TB111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TB111( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TB111( 0) ;
         checkOptimisticConcurrency1TB111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TB111( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TB111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TB11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A859CumCodCont), Short.valueOf(A10777CumCCos), Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), Byte.valueOf(A11368CumConTipo), A862CumConFec, A396EmprCod, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
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
                        resetCaption1TB0( ) ;
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
            load1TB111( ) ;
         }
         endLevel1TB111( ) ;
      }
      closeExtendedTableCursors1TB111( ) ;
   }

   public void update1TB111( )
   {
      beforeValidate1TB111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TB111( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TB111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TB111( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TB111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TB12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A10777CumCCos), Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), Byte.valueOf(A11368CumConTipo), A862CumConFec, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), A396EmprCod, Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TB111( ) ;
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
         endLevel1TB111( ) ;
      }
      closeExtendedTableCursors1TB111( ) ;
   }

   public void deferredUpdate1TB111( )
   {
   }

   public void delete( )
   {
      beforeValidate1TB111( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TB111( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TB111( ) ;
         afterConfirm1TB111( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TB111( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TB13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
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
      sMode111 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TB111( ) ;
      Gx_mode = sMode111 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TB111( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A10778CumCCosD ;
         GXv_int12[0] = A10777CumCCos ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
         salidaproductomanual_header_impl.this.A10777CumCCos = GXv_int12[0] ;
         salidaproductomanual_header_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A10778CumCCosD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
         GXt_char1 = A8926CC_AlmDc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A8925CC_AlmCd ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         salidaproductomanual_header_impl.this.A396EmprCod = GXv_char4[0] ;
         salidaproductomanual_header_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
         salidaproductomanual_header_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A8926CC_AlmDc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TB14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1TB111( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TB111( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "salidaproductomanual_header");
         if ( AnyError == 0 )
         {
            confirmValues1TB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "salidaproductomanual_header");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TB111( )
   {
      /* Scan By routine */
      /* Using cursor T01TB15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound111 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01TB15_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TB111( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound111 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01TB15_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
   }

   public void scanEnd1TB111( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1TB111( )
   {
      /* After Confirm Rules */
      if ( (0==A859CumCodCont) && true /* After */ )
      {
         GXv_int8[0] = A859CumCodCont ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "111111", GXv_int8) ;
         salidaproductomanual_header_impl.this.A859CumCodCont = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
   }

   public void beforeInsert1TB111( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TB111( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TB111( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TB111( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TB111( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TB111( )
   {
      edtCumCodCont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      edtCumConFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      edtCumCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCCos_Enabled), 5, 0), true);
      edtCC_AlmCd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCd_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombocumccos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocumccos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocumccos_Enabled), 5, 0), true);
      edtavCombocc_almcd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombocc_almcd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombocc_almcd_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TB111( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TB0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.salidaproductomanual_header", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CumCodCont,8,0))}, new String[] {"Gx_mode","EmprCod","CumCodCont"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"SalidaProductoManual_header");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV29Pgmname, "")));
      forbiddenHiddens.add("CumConTipo", localUtil.format( DecimalUtil.doubleToDec(A11368CumConTipo), "Z9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("salidaproductomanual_header:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z859CumCodCont", GXutil.ltrim( localUtil.ntoc( Z859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10777CumCCos", GXutil.ltrim( localUtil.ntoc( Z10777CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8925CC_AlmCd", GXutil.ltrim( localUtil.ntoc( Z8925CC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11368CumConTipo", GXutil.ltrim( localUtil.ntoc( Z11368CumConTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z862CumConFec", localUtil.dtoc( Z862CumConFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N3839CcoCod", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCUMCCOS_DATA", AV26CumCCos_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCUMCCOS_DATA", AV26CumCCos_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCC_ALMCD_DATA", AV23CC_AlmCd_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCC_ALMCD_DATA", AV23CC_AlmCd_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMDC", GXutil.rtrim( A8926CC_AlmDc));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCCOSD", GXutil.rtrim( A10778CumCCosD));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCODCONT", GXutil.ltrim( localUtil.ntoc( AV8CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CumCodCont), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CCOCOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOCOD", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CUMCONTIPO", GXutil.ltrim( localUtil.ntoc( A11368CumConTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Objectcall", GXutil.rtrim( Combo_cumccos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Cls", GXutil.rtrim( Combo_cumccos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Selectedvalue_set", GXutil.rtrim( Combo_cumccos_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CUMCCOS_Enabled", GXutil.booltostr( Combo_cumccos_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Objectcall", GXutil.rtrim( Combo_cc_almcd_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Cls", GXutil.rtrim( Combo_cc_almcd_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Selectedvalue_set", GXutil.rtrim( Combo_cc_almcd_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Enabled", GXutil.booltostr( Combo_cc_almcd_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Visible", GXutil.booltostr( Combo_cc_almcd_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CC_ALMCD_Emptyitem", GXutil.booltostr( Combo_cc_almcd_Emptyitem));
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
      return formatLink("app.salidaproductomanual_header", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CumCodCont,8,0))}, new String[] {"Gx_mode","EmprCod","CumCodCont"})  ;
   }

   public String getPgmname( )
   {
      return "SalidaProductoManual_header" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Salida Producto Manual (Cabecera)", "") ;
   }

   public void initializeNonKey1TB111( )
   {
      A3839CcoCod = (short)(0) ;
      n3839CcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      A10777CumCCos = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A8925CC_AlmCd = (byte)(0) ;
      n8925CC_AlmCd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A10778CumCCosD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      A8926CC_AlmDc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      A11368CumConTipo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
      A862CumConFec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      Z10777CumCCos = (short)(0) ;
      Z8925CC_AlmCd = (byte)(0) ;
      Z11368CumConTipo = (byte)(0) ;
      Z862CumConFec = GXutil.nullDate() ;
      Z3839CcoCod = (short)(0) ;
   }

   public void initAll1TB111( )
   {
      A859CumCodCont = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      initializeNonKey1TB111( ) ;
   }

   public void standaloneModalInsert( )
   {
      A862CumConFec = i862CumConFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      A11368CumConTipo = i11368CumConTipo ;
      httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695433", true, true);
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
      httpContext.AddJavascriptSource("salidaproductomanual_header.js", "?20268211695433", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCumCodCont_Internalname = "CUMCODCONT" ;
      edtCumConFec_Internalname = "CUMCONFEC" ;
      lblTextblockcumccos_Internalname = "TEXTBLOCKCUMCCOS" ;
      Combo_cumccos_Internalname = "COMBO_CUMCCOS" ;
      edtCumCCos_Internalname = "CUMCCOS" ;
      divTablesplittedcumccos_Internalname = "TABLESPLITTEDCUMCCOS" ;
      lblTextblockcc_almcd_Internalname = "TEXTBLOCKCC_ALMCD" ;
      Combo_cc_almcd_Internalname = "COMBO_CC_ALMCD" ;
      edtCC_AlmCd_Internalname = "CC_ALMCD" ;
      divTablesplittedcc_almcd_Internalname = "TABLESPLITTEDCC_ALMCD" ;
      divCombo_cc_almcd_cell_Internalname = "COMBO_CC_ALMCD_CELL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombocumccos_Internalname = "vCOMBOCUMCCOS" ;
      divSectionattribute_cumccos_Internalname = "SECTIONATTRIBUTE_CUMCCOS" ;
      edtavCombocc_almcd_Internalname = "vCOMBOCC_ALMCD" ;
      divSectionattribute_cc_almcd_Internalname = "SECTIONATTRIBUTE_CC_ALMCD" ;
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
      Form.setCaption( httpContext.getMessage( "Salida Producto Manual (Cabecera)", "") );
      Combo_cc_almcd_Visible = GXutil.toBoolean( -1) ;
      edtavCombocc_almcd_Jsonclick = "" ;
      edtavCombocc_almcd_Enabled = 0 ;
      edtavCombocc_almcd_Visible = 1 ;
      edtavCombocumccos_Jsonclick = "" ;
      edtavCombocumccos_Enabled = 0 ;
      edtavCombocumccos_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCC_AlmCd_Jsonclick = "" ;
      edtCC_AlmCd_Enabled = 1 ;
      edtCC_AlmCd_Visible = 1 ;
      Combo_cc_almcd_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_cc_almcd_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cc_almcd_Enabled = GXutil.toBoolean( -1) ;
      divCombo_cc_almcd_cell_Class = "col-xs-12 col-sm-3" ;
      edtCumCCos_Jsonclick = "" ;
      edtCumCCos_Enabled = 1 ;
      edtCumCCos_Visible = 1 ;
      Combo_cumccos_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cumccos_Enabled = GXutil.toBoolean( -1) ;
      edtCumConFec_Jsonclick = "" ;
      edtCumConFec_Enabled = 1 ;
      edtCumCodCont_Jsonclick = "" ;
      edtCumCodCont_Enabled = 1 ;
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

   public void gx3asacc_almdc1TB111( String A396EmprCod ,
                                     byte A8925CC_AlmCd )
   {
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidaproductomanual_header_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_header_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8926CC_AlmDc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asacumccosd1TB111( short A10777CumCCos )
   {
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      salidaproductomanual_header_impl.this.A10777CumCCos = GXv_int12[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10778CumCCosD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_21_1TB111( String A396EmprCod ,
                             int A859CumCodCont )
   {
      if ( (0==A859CumCodCont) && true /* After */ )
      {
         GXv_int8[0] = A859CumCodCont ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "111111", GXv_int8) ;
         A859CumCodCont = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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

   public void valid_Cumccos( )
   {
      GXt_char1 = A10778CumCCosD ;
      GXv_int12[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int12, GXv_char4) ;
      salidaproductomanual_header_impl.this.A10777CumCCos = GXv_int12[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char4[0] ;
      A10778CumCCosD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", GXutil.rtrim( A10778CumCCosD));
   }

   public void valid_Cc_almcd( )
   {
      n8925CC_AlmCd = false ;
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidaproductomanual_header_impl.this.A396EmprCod = GXv_char4[0] ;
      salidaproductomanual_header_impl.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidaproductomanual_header_impl.this.GXt_char1 = GXv_char3[0] ;
      A8926CC_AlmDc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", GXutil.rtrim( A8926CC_AlmDc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true},{av:'AV29Pgmname',fld:'vPGMNAME',pic:''},{av:'A11368CumConTipo',fld:'CUMCONTIPO',pic:'Z9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TB2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A859CumCodCont',fld:'CUMCODCONT',pic:'ZZZZZZZ9'},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CUMCODCONT","{handler:'valid_Cumcodcont',iparms:[]");
      setEventMetadata("VALID_CUMCODCONT",",oparms:[]}");
      setEventMetadata("VALID_CUMCCOS","{handler:'valid_Cumccos',iparms:[{av:'A10777CumCCos',fld:'CUMCCOS',pic:'ZZ9'},{av:'A10778CumCCosD',fld:'CUMCCOSD',pic:''}]");
      setEventMetadata("VALID_CUMCCOS",",oparms:[{av:'A10778CumCCosD',fld:'CUMCCOSD',pic:''}]}");
      setEventMetadata("VALID_CC_ALMCD","{handler:'valid_Cc_almcd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8925CC_AlmCd',fld:'CC_ALMCD',pic:'Z9'},{av:'A8926CC_AlmDc',fld:'CC_ALMDC',pic:''}]");
      setEventMetadata("VALID_CC_ALMCD",",oparms:[{av:'A8926CC_AlmDc',fld:'CC_ALMDC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOCUMCCOS","{handler:'validv_Combocumccos',iparms:[]");
      setEventMetadata("VALIDV_COMBOCUMCCOS",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCC_ALMCD","{handler:'validv_Combocc_almcd',iparms:[]");
      setEventMetadata("VALIDV_COMBOCC_ALMCD",",oparms:[]}");
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
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z862CumConFec = GXutil.nullDate() ;
      Combo_cc_almcd_Selectedvalue_get = "" ;
      Combo_cumccos_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A862CumConFec = GXutil.nullDate() ;
      lblTextblockcumccos_Jsonclick = "" ;
      ucCombo_cumccos = new com.genexus.webpanels.GXUserControl();
      Combo_cumccos_Caption = "" ;
      AV26CumCCos_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockcc_almcd_Jsonclick = "" ;
      ucCombo_cc_almcd = new com.genexus.webpanels.GXUserControl();
      Combo_cc_almcd_Caption = "" ;
      AV23CC_AlmCd_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV29Pgmname = "" ;
      A8926CC_AlmDc = "" ;
      A10778CumCCosD = "" ;
      A407EmprNom = "" ;
      Combo_cumccos_Objectcall = "" ;
      Combo_cumccos_Class = "" ;
      Combo_cumccos_Icontype = "" ;
      Combo_cumccos_Icon = "" ;
      Combo_cumccos_Tooltip = "" ;
      Combo_cumccos_Selectedvalue_set = "" ;
      Combo_cumccos_Selectedtext_set = "" ;
      Combo_cumccos_Selectedtext_get = "" ;
      Combo_cumccos_Gamoauthtoken = "" ;
      Combo_cumccos_Ddointernalname = "" ;
      Combo_cumccos_Titlecontrolalign = "" ;
      Combo_cumccos_Dropdownoptionstype = "" ;
      Combo_cumccos_Titlecontrolidtoreplace = "" ;
      Combo_cumccos_Datalisttype = "" ;
      Combo_cumccos_Datalistfixedvalues = "" ;
      Combo_cumccos_Datalistproc = "" ;
      Combo_cumccos_Datalistprocparametersprefix = "" ;
      Combo_cumccos_Remoteservicesparameters = "" ;
      Combo_cumccos_Htmltemplate = "" ;
      Combo_cumccos_Multiplevaluestype = "" ;
      Combo_cumccos_Loadingdata = "" ;
      Combo_cumccos_Noresultsfound = "" ;
      Combo_cumccos_Emptyitemtext = "" ;
      Combo_cumccos_Onlyselectedvalues = "" ;
      Combo_cumccos_Selectalltext = "" ;
      Combo_cumccos_Multiplevaluesseparator = "" ;
      Combo_cumccos_Addnewoptiontext = "" ;
      Combo_cc_almcd_Objectcall = "" ;
      Combo_cc_almcd_Class = "" ;
      Combo_cc_almcd_Icontype = "" ;
      Combo_cc_almcd_Icon = "" ;
      Combo_cc_almcd_Tooltip = "" ;
      Combo_cc_almcd_Selectedvalue_set = "" ;
      Combo_cc_almcd_Selectedtext_set = "" ;
      Combo_cc_almcd_Selectedtext_get = "" ;
      Combo_cc_almcd_Gamoauthtoken = "" ;
      Combo_cc_almcd_Ddointernalname = "" ;
      Combo_cc_almcd_Titlecontrolalign = "" ;
      Combo_cc_almcd_Dropdownoptionstype = "" ;
      Combo_cc_almcd_Titlecontrolidtoreplace = "" ;
      Combo_cc_almcd_Datalisttype = "" ;
      Combo_cc_almcd_Datalistfixedvalues = "" ;
      Combo_cc_almcd_Datalistproc = "" ;
      Combo_cc_almcd_Datalistprocparametersprefix = "" ;
      Combo_cc_almcd_Remoteservicesparameters = "" ;
      Combo_cc_almcd_Htmltemplate = "" ;
      Combo_cc_almcd_Multiplevaluestype = "" ;
      Combo_cc_almcd_Loadingdata = "" ;
      Combo_cc_almcd_Noresultsfound = "" ;
      Combo_cc_almcd_Emptyitemtext = "" ;
      Combo_cc_almcd_Onlyselectedvalues = "" ;
      Combo_cc_almcd_Selectalltext = "" ;
      Combo_cc_almcd_Multiplevaluesseparator = "" ;
      Combo_cc_almcd_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode111 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV14Station = "" ;
      AV15EmprNom = "" ;
      AV16UsurCod = "" ;
      GXv_char2 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV13TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV24ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01TB4_A407EmprNom = new String[] {""} ;
      T01TB4_n407EmprNom = new boolean[] {false} ;
      T01TB4_A3915EmpNumDec = new byte[1] ;
      T01TB4_n3915EmpNumDec = new boolean[] {false} ;
      T01TB6_A859CumCodCont = new int[1] ;
      T01TB6_A10777CumCCos = new short[1] ;
      T01TB6_A8925CC_AlmCd = new byte[1] ;
      T01TB6_n8925CC_AlmCd = new boolean[] {false} ;
      T01TB6_A407EmprNom = new String[] {""} ;
      T01TB6_n407EmprNom = new boolean[] {false} ;
      T01TB6_A3915EmpNumDec = new byte[1] ;
      T01TB6_n3915EmpNumDec = new boolean[] {false} ;
      T01TB6_A11368CumConTipo = new byte[1] ;
      T01TB6_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TB6_A396EmprCod = new String[] {""} ;
      T01TB6_A3839CcoCod = new short[1] ;
      T01TB6_n3839CcoCod = new boolean[] {false} ;
      T01TB5_A3839CcoCod = new short[1] ;
      T01TB5_n3839CcoCod = new boolean[] {false} ;
      T01TB7_A3839CcoCod = new short[1] ;
      T01TB7_n3839CcoCod = new boolean[] {false} ;
      T01TB8_A396EmprCod = new String[] {""} ;
      T01TB8_A859CumCodCont = new int[1] ;
      T01TB3_A859CumCodCont = new int[1] ;
      T01TB3_A10777CumCCos = new short[1] ;
      T01TB3_A8925CC_AlmCd = new byte[1] ;
      T01TB3_n8925CC_AlmCd = new boolean[] {false} ;
      T01TB3_A11368CumConTipo = new byte[1] ;
      T01TB3_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TB3_A396EmprCod = new String[] {""} ;
      T01TB3_A3839CcoCod = new short[1] ;
      T01TB3_n3839CcoCod = new boolean[] {false} ;
      T01TB9_A396EmprCod = new String[] {""} ;
      T01TB9_A859CumCodCont = new int[1] ;
      T01TB10_A396EmprCod = new String[] {""} ;
      T01TB10_A859CumCodCont = new int[1] ;
      T01TB2_A859CumCodCont = new int[1] ;
      T01TB2_A10777CumCCos = new short[1] ;
      T01TB2_A8925CC_AlmCd = new byte[1] ;
      T01TB2_n8925CC_AlmCd = new boolean[] {false} ;
      T01TB2_A11368CumConTipo = new byte[1] ;
      T01TB2_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TB2_A396EmprCod = new String[] {""} ;
      T01TB2_A3839CcoCod = new short[1] ;
      T01TB2_n3839CcoCod = new boolean[] {false} ;
      T01TB14_A396EmprCod = new String[] {""} ;
      T01TB14_A859CumCodCont = new int[1] ;
      T01TB14_A719PrdNum = new String[] {""} ;
      T01TB15_A396EmprCod = new String[] {""} ;
      T01TB15_A859CumCodCont = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i862CumConFec = GXutil.nullDate() ;
      GXv_int8 = new int[1] ;
      GXv_int12 = new short[1] ;
      Z10778CumCCosD = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      Z8926CC_AlmDc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_header__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_header__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_header__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_header__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_header__default(),
         new Object[] {
             new Object[] {
            T01TB2_A859CumCodCont, T01TB2_A10777CumCCos, T01TB2_A8925CC_AlmCd, T01TB2_n8925CC_AlmCd, T01TB2_A11368CumConTipo, T01TB2_A862CumConFec, T01TB2_A396EmprCod, T01TB2_A3839CcoCod, T01TB2_n3839CcoCod
            }
            , new Object[] {
            T01TB3_A859CumCodCont, T01TB3_A10777CumCCos, T01TB3_A8925CC_AlmCd, T01TB3_n8925CC_AlmCd, T01TB3_A11368CumConTipo, T01TB3_A862CumConFec, T01TB3_A396EmprCod, T01TB3_A3839CcoCod, T01TB3_n3839CcoCod
            }
            , new Object[] {
            T01TB4_A407EmprNom, T01TB4_n407EmprNom, T01TB4_A3915EmpNumDec, T01TB4_n3915EmpNumDec
            }
            , new Object[] {
            T01TB5_A3839CcoCod
            }
            , new Object[] {
            T01TB6_A859CumCodCont, T01TB6_A10777CumCCos, T01TB6_A8925CC_AlmCd, T01TB6_n8925CC_AlmCd, T01TB6_A407EmprNom, T01TB6_n407EmprNom, T01TB6_A3915EmpNumDec, T01TB6_n3915EmpNumDec, T01TB6_A11368CumConTipo, T01TB6_A862CumConFec,
            T01TB6_A396EmprCod, T01TB6_A3839CcoCod, T01TB6_n3839CcoCod
            }
            , new Object[] {
            T01TB7_A3839CcoCod
            }
            , new Object[] {
            T01TB8_A396EmprCod, T01TB8_A859CumCodCont
            }
            , new Object[] {
            T01TB9_A396EmprCod, T01TB9_A859CumCodCont
            }
            , new Object[] {
            T01TB10_A396EmprCod, T01TB10_A859CumCodCont
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TB14_A396EmprCod, T01TB14_A859CumCodCont, T01TB14_A719PrdNum
            }
            , new Object[] {
            T01TB15_A396EmprCod, T01TB15_A859CumCodCont
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV29Pgmname = "SalidaProductoManual_header" ;
      Z11368CumConTipo = (byte)(0) ;
      A11368CumConTipo = (byte)(0) ;
      i11368CumConTipo = (byte)(0) ;
      Z862CumConFec = GXutil.today( ) ;
      A862CumConFec = GXutil.today( ) ;
      i862CumConFec = GXutil.today( ) ;
   }

   private byte Z8925CC_AlmCd ;
   private byte Z11368CumConTipo ;
   private byte GxWebError ;
   private byte A8925CC_AlmCd ;
   private byte nKeyPressed ;
   private byte AV25ComboCC_AlmCd ;
   private byte A11368CumConTipo ;
   private byte Gx_BScreen ;
   private byte A3915EmpNumDec ;
   private byte Z3915EmpNumDec ;
   private byte GXt_int5 ;
   private byte gxajaxcallmode ;
   private byte i11368CumConTipo ;
   private byte GXv_int6[] ;
   private short Z10777CumCCos ;
   private short Z3839CcoCod ;
   private short N3839CcoCod ;
   private short A10777CumCCos ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV27ComboCumCCos ;
   private short AV12Insert_CcoCod ;
   private short RcdFound111 ;
   private short AV17ConMan ;
   private short AV19Moda21 ;
   private short AV20FlagPreMed ;
   private short AV21Val_stk ;
   private short AV22Precio_stk ;
   private short nIsDirty_111 ;
   private short GXv_int12[] ;
   private int wcpOAV8CumCodCont ;
   private int Z859CumCodCont ;
   private int A859CumCodCont ;
   private int AV8CumCodCont ;
   private int trnEnded ;
   private int edtCumCodCont_Enabled ;
   private int edtCumConFec_Enabled ;
   private int edtCumCCos_Enabled ;
   private int edtCumCCos_Visible ;
   private int edtCC_AlmCd_Enabled ;
   private int edtCC_AlmCd_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombocumccos_Enabled ;
   private int edtavCombocumccos_Visible ;
   private int edtavCombocc_almcd_Enabled ;
   private int edtavCombocc_almcd_Visible ;
   private int Combo_cumccos_Datalistupdateminimumcharacters ;
   private int Combo_cc_almcd_Datalistupdateminimumcharacters ;
   private int AV18Contval ;
   private int GXt_int7 ;
   private int AV30GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int8[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Combo_cc_almcd_Selectedvalue_get ;
   private String Combo_cumccos_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCumCodCont_Internalname ;
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
   private String TempTags ;
   private String edtCumCodCont_Jsonclick ;
   private String edtCumConFec_Internalname ;
   private String edtCumConFec_Jsonclick ;
   private String divTablesplittedcumccos_Internalname ;
   private String lblTextblockcumccos_Internalname ;
   private String lblTextblockcumccos_Jsonclick ;
   private String Combo_cumccos_Caption ;
   private String Combo_cumccos_Cls ;
   private String Combo_cumccos_Internalname ;
   private String edtCumCCos_Internalname ;
   private String edtCumCCos_Jsonclick ;
   private String divCombo_cc_almcd_cell_Internalname ;
   private String divCombo_cc_almcd_cell_Class ;
   private String divTablesplittedcc_almcd_Internalname ;
   private String lblTextblockcc_almcd_Internalname ;
   private String lblTextblockcc_almcd_Jsonclick ;
   private String Combo_cc_almcd_Caption ;
   private String Combo_cc_almcd_Cls ;
   private String Combo_cc_almcd_Internalname ;
   private String edtCC_AlmCd_Internalname ;
   private String edtCC_AlmCd_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_cumccos_Internalname ;
   private String edtavCombocumccos_Internalname ;
   private String edtavCombocumccos_Jsonclick ;
   private String divSectionattribute_cc_almcd_Internalname ;
   private String edtavCombocc_almcd_Internalname ;
   private String edtavCombocc_almcd_Jsonclick ;
   private String A8926CC_AlmDc ;
   private String A10778CumCCosD ;
   private String A407EmprNom ;
   private String Combo_cumccos_Objectcall ;
   private String Combo_cumccos_Class ;
   private String Combo_cumccos_Icontype ;
   private String Combo_cumccos_Icon ;
   private String Combo_cumccos_Tooltip ;
   private String Combo_cumccos_Selectedvalue_set ;
   private String Combo_cumccos_Selectedtext_set ;
   private String Combo_cumccos_Selectedtext_get ;
   private String Combo_cumccos_Gamoauthtoken ;
   private String Combo_cumccos_Ddointernalname ;
   private String Combo_cumccos_Titlecontrolalign ;
   private String Combo_cumccos_Dropdownoptionstype ;
   private String Combo_cumccos_Titlecontrolidtoreplace ;
   private String Combo_cumccos_Datalisttype ;
   private String Combo_cumccos_Datalistfixedvalues ;
   private String Combo_cumccos_Datalistproc ;
   private String Combo_cumccos_Datalistprocparametersprefix ;
   private String Combo_cumccos_Remoteservicesparameters ;
   private String Combo_cumccos_Htmltemplate ;
   private String Combo_cumccos_Multiplevaluestype ;
   private String Combo_cumccos_Loadingdata ;
   private String Combo_cumccos_Noresultsfound ;
   private String Combo_cumccos_Emptyitemtext ;
   private String Combo_cumccos_Onlyselectedvalues ;
   private String Combo_cumccos_Selectalltext ;
   private String Combo_cumccos_Multiplevaluesseparator ;
   private String Combo_cumccos_Addnewoptiontext ;
   private String Combo_cc_almcd_Objectcall ;
   private String Combo_cc_almcd_Class ;
   private String Combo_cc_almcd_Icontype ;
   private String Combo_cc_almcd_Icon ;
   private String Combo_cc_almcd_Tooltip ;
   private String Combo_cc_almcd_Selectedvalue_set ;
   private String Combo_cc_almcd_Selectedtext_set ;
   private String Combo_cc_almcd_Selectedtext_get ;
   private String Combo_cc_almcd_Gamoauthtoken ;
   private String Combo_cc_almcd_Ddointernalname ;
   private String Combo_cc_almcd_Titlecontrolalign ;
   private String Combo_cc_almcd_Dropdownoptionstype ;
   private String Combo_cc_almcd_Titlecontrolidtoreplace ;
   private String Combo_cc_almcd_Datalisttype ;
   private String Combo_cc_almcd_Datalistfixedvalues ;
   private String Combo_cc_almcd_Datalistproc ;
   private String Combo_cc_almcd_Datalistprocparametersprefix ;
   private String Combo_cc_almcd_Remoteservicesparameters ;
   private String Combo_cc_almcd_Htmltemplate ;
   private String Combo_cc_almcd_Multiplevaluestype ;
   private String Combo_cc_almcd_Loadingdata ;
   private String Combo_cc_almcd_Noresultsfound ;
   private String Combo_cc_almcd_Emptyitemtext ;
   private String Combo_cc_almcd_Onlyselectedvalues ;
   private String Combo_cc_almcd_Selectalltext ;
   private String Combo_cc_almcd_Multiplevaluesseparator ;
   private String Combo_cc_almcd_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode111 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV14Station ;
   private String AV15EmprNom ;
   private String AV16UsurCod ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z10778CumCCosD ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z8926CC_AlmDc ;
   private java.util.Date Z862CumConFec ;
   private java.util.Date A862CumConFec ;
   private java.util.Date i862CumConFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8925CC_AlmCd ;
   private boolean n3839CcoCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_cc_almcd_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean Combo_cumccos_Enabled ;
   private boolean Combo_cumccos_Visible ;
   private boolean Combo_cumccos_Allowmultipleselection ;
   private boolean Combo_cumccos_Isgriditem ;
   private boolean Combo_cumccos_Hasdescription ;
   private boolean Combo_cumccos_Includeonlyselectedoption ;
   private boolean Combo_cumccos_Includeselectalloption ;
   private boolean Combo_cumccos_Emptyitem ;
   private boolean Combo_cumccos_Includeaddnewoption ;
   private boolean Combo_cc_almcd_Enabled ;
   private boolean Combo_cc_almcd_Visible ;
   private boolean Combo_cc_almcd_Allowmultipleselection ;
   private boolean Combo_cc_almcd_Isgriditem ;
   private boolean Combo_cc_almcd_Hasdescription ;
   private boolean Combo_cc_almcd_Includeonlyselectedoption ;
   private boolean Combo_cc_almcd_Includeselectalloption ;
   private boolean Combo_cc_almcd_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private String AV24ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_cumccos ;
   private com.genexus.webpanels.GXUserControl ucCombo_cc_almcd ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01TB4_A407EmprNom ;
   private boolean[] T01TB4_n407EmprNom ;
   private byte[] T01TB4_A3915EmpNumDec ;
   private boolean[] T01TB4_n3915EmpNumDec ;
   private int[] T01TB6_A859CumCodCont ;
   private short[] T01TB6_A10777CumCCos ;
   private byte[] T01TB6_A8925CC_AlmCd ;
   private boolean[] T01TB6_n8925CC_AlmCd ;
   private String[] T01TB6_A407EmprNom ;
   private boolean[] T01TB6_n407EmprNom ;
   private byte[] T01TB6_A3915EmpNumDec ;
   private boolean[] T01TB6_n3915EmpNumDec ;
   private byte[] T01TB6_A11368CumConTipo ;
   private java.util.Date[] T01TB6_A862CumConFec ;
   private String[] T01TB6_A396EmprCod ;
   private short[] T01TB6_A3839CcoCod ;
   private boolean[] T01TB6_n3839CcoCod ;
   private short[] T01TB5_A3839CcoCod ;
   private boolean[] T01TB5_n3839CcoCod ;
   private short[] T01TB7_A3839CcoCod ;
   private boolean[] T01TB7_n3839CcoCod ;
   private String[] T01TB8_A396EmprCod ;
   private int[] T01TB8_A859CumCodCont ;
   private int[] T01TB3_A859CumCodCont ;
   private short[] T01TB3_A10777CumCCos ;
   private byte[] T01TB3_A8925CC_AlmCd ;
   private boolean[] T01TB3_n8925CC_AlmCd ;
   private byte[] T01TB3_A11368CumConTipo ;
   private java.util.Date[] T01TB3_A862CumConFec ;
   private String[] T01TB3_A396EmprCod ;
   private short[] T01TB3_A3839CcoCod ;
   private boolean[] T01TB3_n3839CcoCod ;
   private String[] T01TB9_A396EmprCod ;
   private int[] T01TB9_A859CumCodCont ;
   private String[] T01TB10_A396EmprCod ;
   private int[] T01TB10_A859CumCodCont ;
   private int[] T01TB2_A859CumCodCont ;
   private short[] T01TB2_A10777CumCCos ;
   private byte[] T01TB2_A8925CC_AlmCd ;
   private boolean[] T01TB2_n8925CC_AlmCd ;
   private byte[] T01TB2_A11368CumConTipo ;
   private java.util.Date[] T01TB2_A862CumConFec ;
   private String[] T01TB2_A396EmprCod ;
   private short[] T01TB2_A3839CcoCod ;
   private boolean[] T01TB2_n3839CcoCod ;
   private String[] T01TB14_A396EmprCod ;
   private int[] T01TB14_A859CumCodCont ;
   private String[] T01TB14_A719PrdNum ;
   private String[] T01TB15_A396EmprCod ;
   private int[] T01TB15_A859CumCodCont ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV26CumCCos_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV23CC_AlmCd_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class salidaproductomanual_header__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidaproductomanual_header__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidaproductomanual_header__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidaproductomanual_header__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidaproductomanual_header__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TB2", "SELECT CumCodCont, CumCCos, CC_AlmCd, CumConTipo, CumConFec, EmprCod, CcoCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ?  FOR UPDATE OF CumCCos, CC_AlmCd, CumConTipo, CumConFec, CcoCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TB3", "SELECT CumCodCont, CumCCos, CC_AlmCd, CumConTipo, CumConFec, EmprCod, CcoCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TB4", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TB5", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TB6", "SELECT /*+ FIRST_ROWS(100) */ TM1.CumCodCont, TM1.CumCCos, TM1.CC_AlmCd, T2.EmprNom, T2.EmpNumDec, TM1.CumConTipo, TM1.CumConFec, TM1.EmprCod, TM1.CcoCod FROM (TXPCCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TB7", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TB8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TB9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE ( CumCodCont > ?) and EmprCod = ? ORDER BY EmprCod, CumCodCont) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TB10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE ( CumCodCont < ?) and EmprCod = ? ORDER BY EmprCod DESC, CumCodCont DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TB11", "INSERT INTO TXPCCUMCO(CumCodCont, CumCCos, CC_AlmCd, CumConTipo, CumConFec, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("T01TB12", "UPDATE TXPCCUMCO SET CumCCos=?, CC_AlmCd=?, CumConTipo=?, CumConFec=?, CcoCod=?  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("T01TB13", "DELETE FROM TXPCCUMCO  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new ForEachCursor("T01TB14", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TB15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? ORDER BY EmprCod, CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setDate(5, (java.util.Date)parms[5]);
               stmt.setString(6, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
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
               return;
      }
   }

}

