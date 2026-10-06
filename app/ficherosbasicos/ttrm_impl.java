package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrm_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A14105TRMDivID = (byte)(GXutil.lval( httpContext.GetPar( "TRMDivID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A14105TRMDivID) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33TRMDivID = (byte)(GXutil.lval( httpContext.GetPar( "TRMDivID"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TRMDivID), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRMDIVID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33TRMDivID), "Z9")));
            AV34TRMFecha = localUtil.parseDTimeParm( httpContext.GetPar( "TRMFecha")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TRMFecha", localUtil.ttoc( AV34TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRMFECHA", getSecureSignedToken( "", localUtil.format( AV34TRMFecha, "99/99/99 99:99")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TRM", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTRMDivID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttrm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrm_impl.class ));
   }

   public ttrm_impl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTRMAutMan = new HTMLChoice();
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
      if ( cmbTRMAutMan.getItemCount() > 0 )
      {
         A14110TRMAutMan = cmbTRMAutMan.getValidValue(A14110TRMAutMan) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbTRMAutMan.setValue( GXutil.rtrim( A14110TRMAutMan) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTRMAutMan.getInternalname(), "Values", cmbTRMAutMan.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrmdivid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrmdivid_Internalname, httpContext.getMessage( "Divisa", ""), "", "", lblTextblocktrmdivid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\TTRM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trmdivid.setProperty("Caption", Combo_trmdivid_Caption);
      ucCombo_trmdivid.setProperty("Cls", Combo_trmdivid_Cls);
      ucCombo_trmdivid.setProperty("EmptyItemText", Combo_trmdivid_Emptyitemtext);
      ucCombo_trmdivid.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
      ucCombo_trmdivid.setProperty("DropDownOptionsData", AV38TRMDivID_Data);
      ucCombo_trmdivid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trmdivid_Internalname, "COMBO_TRMDIVIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTRMDivID_Internalname, httpContext.getMessage( "Divisa", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTRMDivID_Internalname, GXutil.ltrim( localUtil.ntoc( A14105TRMDivID, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14105TRMDivID), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTRMDivID_Jsonclick, 0, "Attribute", "", "", "", "", edtTRMDivID_Visible, edtTRMDivID_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTRMFecha_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTRMFecha_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTRMFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTRMFecha_Internalname, localUtil.ttoc( A14106TRMFecha, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14106TRMFecha, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTRMFecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTRMFecha_Enabled, 1, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTRMFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTRMFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FicherosBasicos\\TTRM.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTRMCompra_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTRMCompra_Internalname, httpContext.getMessage( "$ compra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTRMCompra_Internalname, GXutil.ltrim( localUtil.ntoc( A14108TRMCompra, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTRMCompra_Enabled!=0) ? localUtil.format( A14108TRMCompra, "ZZZZZZZ9.99") : localUtil.format( A14108TRMCompra, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTRMCompra_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTRMCompra_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTRMVenta_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTRMVenta_Internalname, httpContext.getMessage( "$ venta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTRMVenta_Internalname, GXutil.ltrim( localUtil.ntoc( A14109TRMVenta, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTRMVenta_Enabled!=0) ? localUtil.format( A14109TRMVenta, "ZZZZZZZ9.99") : localUtil.format( A14109TRMVenta, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTRMVenta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTRMVenta_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbTRMAutMan.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbTRMAutMan.getInternalname(), httpContext.getMessage( "Registración", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTRMAutMan, cmbTRMAutMan.getInternalname(), GXutil.rtrim( A14110TRMAutMan), 1, cmbTRMAutMan.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTRMAutMan.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_FicherosBasicos\\TTRM.htm");
      cmbTRMAutMan.setValue( GXutil.rtrim( A14110TRMAutMan) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTRMAutMan.getInternalname(), "Values", cmbTRMAutMan.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTRM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTRM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTRM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV44Pgmname), GXutil.rtrim( localUtil.format( AV44Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trmdivid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrmdivid_Internalname, GXutil.ltrim( localUtil.ntoc( AV41ComboTRMDivID, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrmdivid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41ComboTRMDivID), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV41ComboTRMDivID), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombotrmdivid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrmdivid_Visible, edtavCombotrmdivid_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRM.htm");
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
      e111T52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV39DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRMDIVID_DATA"), AV38TRMDivID_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z14105TRMDivID = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14105TRMDivID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14106TRMFecha = localUtil.ctot( httpContext.cgiGet( "Z14106TRMFecha"), 0) ;
            Z14108TRMCompra = localUtil.ctond( httpContext.cgiGet( "Z14108TRMCompra")) ;
            Z14109TRMVenta = localUtil.ctond( httpContext.cgiGet( "Z14109TRMVenta")) ;
            Z14110TRMAutMan = httpContext.cgiGet( "Z14110TRMAutMan") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV33TRMDivID = (byte)(localUtil.ctol( httpContext.cgiGet( "vTRMDIVID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34TRMFecha = localUtil.ctot( httpContext.cgiGet( "vTRMFECHA"), 0) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A14107TRMDivNom = httpContext.cgiGet( "TRMDIVNOM") ;
            n14107TRMDivNom = false ;
            Combo_trmdivid_Objectcall = httpContext.cgiGet( "COMBO_TRMDIVID_Objectcall") ;
            Combo_trmdivid_Class = httpContext.cgiGet( "COMBO_TRMDIVID_Class") ;
            Combo_trmdivid_Icontype = httpContext.cgiGet( "COMBO_TRMDIVID_Icontype") ;
            Combo_trmdivid_Icon = httpContext.cgiGet( "COMBO_TRMDIVID_Icon") ;
            Combo_trmdivid_Caption = httpContext.cgiGet( "COMBO_TRMDIVID_Caption") ;
            Combo_trmdivid_Tooltip = httpContext.cgiGet( "COMBO_TRMDIVID_Tooltip") ;
            Combo_trmdivid_Cls = httpContext.cgiGet( "COMBO_TRMDIVID_Cls") ;
            Combo_trmdivid_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRMDIVID_Selectedvalue_set") ;
            Combo_trmdivid_Selectedvalue_get = httpContext.cgiGet( "COMBO_TRMDIVID_Selectedvalue_get") ;
            Combo_trmdivid_Selectedtext_set = httpContext.cgiGet( "COMBO_TRMDIVID_Selectedtext_set") ;
            Combo_trmdivid_Selectedtext_get = httpContext.cgiGet( "COMBO_TRMDIVID_Selectedtext_get") ;
            Combo_trmdivid_Gamoauthtoken = httpContext.cgiGet( "COMBO_TRMDIVID_Gamoauthtoken") ;
            Combo_trmdivid_Ddointernalname = httpContext.cgiGet( "COMBO_TRMDIVID_Ddointernalname") ;
            Combo_trmdivid_Titlecontrolalign = httpContext.cgiGet( "COMBO_TRMDIVID_Titlecontrolalign") ;
            Combo_trmdivid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TRMDIVID_Dropdownoptionstype") ;
            Combo_trmdivid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Enabled")) ;
            Combo_trmdivid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Visible")) ;
            Combo_trmdivid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TRMDIVID_Titlecontrolidtoreplace") ;
            Combo_trmdivid_Datalisttype = httpContext.cgiGet( "COMBO_TRMDIVID_Datalisttype") ;
            Combo_trmdivid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Allowmultipleselection")) ;
            Combo_trmdivid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TRMDIVID_Datalistfixedvalues") ;
            Combo_trmdivid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Isgriditem")) ;
            Combo_trmdivid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Hasdescription")) ;
            Combo_trmdivid_Datalistproc = httpContext.cgiGet( "COMBO_TRMDIVID_Datalistproc") ;
            Combo_trmdivid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TRMDIVID_Datalistprocparametersprefix") ;
            Combo_trmdivid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TRMDIVID_Remoteservicesparameters") ;
            Combo_trmdivid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TRMDIVID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_trmdivid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Includeonlyselectedoption")) ;
            Combo_trmdivid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Includeselectalloption")) ;
            Combo_trmdivid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Emptyitem")) ;
            Combo_trmdivid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRMDIVID_Includeaddnewoption")) ;
            Combo_trmdivid_Htmltemplate = httpContext.cgiGet( "COMBO_TRMDIVID_Htmltemplate") ;
            Combo_trmdivid_Multiplevaluestype = httpContext.cgiGet( "COMBO_TRMDIVID_Multiplevaluestype") ;
            Combo_trmdivid_Loadingdata = httpContext.cgiGet( "COMBO_TRMDIVID_Loadingdata") ;
            Combo_trmdivid_Noresultsfound = httpContext.cgiGet( "COMBO_TRMDIVID_Noresultsfound") ;
            Combo_trmdivid_Emptyitemtext = httpContext.cgiGet( "COMBO_TRMDIVID_Emptyitemtext") ;
            Combo_trmdivid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TRMDIVID_Onlyselectedvalues") ;
            Combo_trmdivid_Selectalltext = httpContext.cgiGet( "COMBO_TRMDIVID_Selectalltext") ;
            Combo_trmdivid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TRMDIVID_Multiplevaluesseparator") ;
            Combo_trmdivid_Addnewoptiontext = httpContext.cgiGet( "COMBO_TRMDIVID_Addnewoptiontext") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTRMDivID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTRMDivID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRMDIVID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTRMDivID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14105TRMDivID = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
            }
            else
            {
               A14105TRMDivID = (byte)(localUtil.ctol( httpContext.cgiGet( edtTRMDivID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTRMFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TRMFECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTRMFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A14106TRMFecha = localUtil.ctot( httpContext.cgiGet( edtTRMFecha_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTRMCompra_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTRMCompra_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRMCOMPRA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTRMCompra_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14108TRMCompra = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14108TRMCompra", GXutil.ltrimstr( A14108TRMCompra, 11, 2));
            }
            else
            {
               A14108TRMCompra = localUtil.ctond( httpContext.cgiGet( edtTRMCompra_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14108TRMCompra", GXutil.ltrimstr( A14108TRMCompra, 11, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTRMVenta_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTRMVenta_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRMVENTA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTRMVenta_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14109TRMVenta = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14109TRMVenta", GXutil.ltrimstr( A14109TRMVenta, 11, 2));
            }
            else
            {
               A14109TRMVenta = localUtil.ctond( httpContext.cgiGet( edtTRMVenta_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14109TRMVenta", GXutil.ltrimstr( A14109TRMVenta, 11, 2));
            }
            cmbTRMAutMan.setValue( httpContext.cgiGet( cmbTRMAutMan.getInternalname()) );
            A14110TRMAutMan = httpContext.cgiGet( cmbTRMAutMan.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
            AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
            AV41ComboTRMDivID = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombotrmdivid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41ComboTRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41ComboTRMDivID), 2, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTRM");
            A14110TRMAutMan = httpContext.cgiGet( cmbTRMAutMan.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
            forbiddenHiddens.add("TRMAutMan", GXutil.rtrim( localUtil.format( A14110TRMAutMan, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\ttrm:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14105TRMDivID = (byte)(GXutil.lval( httpContext.GetPar( "TRMDivID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
               A14106TRMFecha = localUtil.parseDTimeParm( httpContext.GetPar( "TRMFecha")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               getEqualNoModal( ) ;
               if ( ! GXutil.dateCompare(GXutil.nullDate(), AV34TRMFecha) )
               {
                  A14106TRMFecha = AV34TRMFecha ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               }
               else
               {
                  if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A14106TRMFecha) && ( Gx_BScreen == 0 ) )
                  {
                     A14106TRMFecha = GXutil.resetTime( Gx_date );
                     httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  }
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode1888 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! GXutil.dateCompare(GXutil.nullDate(), AV34TRMFecha) )
                  {
                     A14106TRMFecha = AV34TRMFecha ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  }
                  else
                  {
                     if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A14106TRMFecha) && ( Gx_BScreen == 0 ) )
                     {
                        A14106TRMFecha = GXutil.resetTime( Gx_date );
                        httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                     }
                  }
                  Gx_mode = sMode1888 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1888 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1T50( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TRMDIVID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTRMDivID_Internalname ;
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
                        e111T52 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121T52 ();
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
         e121T52 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1T51888( ) ;
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
         disableAttributes1T51888( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrmdivid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrmdivid_Enabled), 5, 0), true);
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

   public void confirm_1T50( )
   {
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T51888( ) ;
         }
         else
         {
            checkExtendedTable1T51888( ) ;
            closeExtendedTableCursors1T51888( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1T50( )
   {
   }

   public void e111T52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrm_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrm_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrm_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttrm_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttrm_impl.this.AV32EmprCod = GXv_char4[0] ;
      ttrm_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrm_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV35WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV39DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV39DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtTRMDivID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTRMDivID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMDivID_Visible), 5, 0), true);
      AV41ComboTRMDivID = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ComboTRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41ComboTRMDivID), 2, 0));
      edtavCombotrmdivid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrmdivid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrmdivid_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTRMDIVID' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e121T52( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV36TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.ttrmww", new String[] {}, new String[] {}) );
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

   public void S112( )
   {
      /* 'LOADCOMBOTRMDIVID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV38TRMDivID_Data ;
      GXv_char4[0] = AV40ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ficherosbasicos.ttrmloaddvcombo(remoteHandle, context).execute( "TRMDivID", Gx_mode, AV32EmprCod, AV33TRMDivID, AV34TRMFecha, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      ttrm_impl.this.AV40ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV38TRMDivID_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_trmdivid_Selectedvalue_set = AV40ComboSelectedValue ;
      ucCombo_trmdivid.sendProperty(context, "", false, Combo_trmdivid_Internalname, "SelectedValue_set", Combo_trmdivid_Selectedvalue_set);
      AV41ComboTRMDivID = (byte)(GXutil.lval( AV40ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ComboTRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41ComboTRMDivID), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (0==AV33TRMDivID) )
      {
         Combo_trmdivid_Enabled = false ;
         ucCombo_trmdivid.sendProperty(context, "", false, Combo_trmdivid_Internalname, "Enabled", GXutil.booltostr( Combo_trmdivid_Enabled));
      }
   }

   public void zm1T51888( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14108TRMCompra = T01T53_A14108TRMCompra[0] ;
            Z14109TRMVenta = T01T53_A14109TRMVenta[0] ;
            Z14110TRMAutMan = T01T53_A14110TRMAutMan[0] ;
         }
         else
         {
            Z14108TRMCompra = A14108TRMCompra ;
            Z14109TRMVenta = A14109TRMVenta ;
            Z14110TRMAutMan = A14110TRMAutMan ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z14106TRMFecha = A14106TRMFecha ;
         Z14108TRMCompra = A14108TRMCompra ;
         Z14109TRMVenta = A14109TRMVenta ;
         Z14110TRMAutMan = A14110TRMAutMan ;
         Z396EmprCod = A396EmprCod ;
         Z14105TRMDivID = A14105TRMDivID ;
         Z407EmprNom = A407EmprNom ;
         Z14107TRMDivNom = A14107TRMDivNom ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbTRMAutMan.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTRMAutMan.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTRMAutMan.getEnabled(), 5, 0), true);
      AV44Pgmname = "FicherosBasicos.TTRM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      cmbTRMAutMan.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTRMAutMan.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTRMAutMan.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01T54 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01T54_A407EmprNom[0] ;
      n407EmprNom = T01T54_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV33TRMDivID) )
      {
         edtTRMDivID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTRMDivID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMDivID_Enabled), 5, 0), true);
      }
      else
      {
         edtTRMDivID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTRMDivID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMDivID_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33TRMDivID) )
      {
         edtTRMDivID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTRMDivID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMDivID_Enabled), 5, 0), true);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV34TRMFecha) )
      {
         edtTRMFecha_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTRMFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMFecha_Enabled), 5, 0), true);
      }
      else
      {
         edtTRMFecha_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTRMFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMFecha_Enabled), 5, 0), true);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV34TRMFecha) )
      {
         edtTRMFecha_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTRMFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMFecha_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33TRMDivID) )
      {
         A14105TRMDivID = AV33TRMDivID ;
         httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
      }
      else
      {
         A14105TRMDivID = AV41ComboTRMDivID ;
         httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
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
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV34TRMFecha) )
      {
         A14106TRMFecha = AV34TRMFecha ;
         httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A14106TRMFecha) && ( Gx_BScreen == 0 ) )
         {
            A14106TRMFecha = GXutil.resetTime( Gx_date );
            httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A14110TRMAutMan)==0) && ( Gx_BScreen == 0 ) )
      {
         A14110TRMAutMan = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01T55 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A14105TRMDivID)});
         A14107TRMDivNom = T01T55_A14107TRMDivNom[0] ;
         n14107TRMDivNom = T01T55_n14107TRMDivNom[0] ;
         pr_default.close(3);
      }
   }

   public void load1T51888( )
   {
      /* Using cursor T01T56 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1888 = (short)(1) ;
         A407EmprNom = T01T56_A407EmprNom[0] ;
         n407EmprNom = T01T56_n407EmprNom[0] ;
         A14107TRMDivNom = T01T56_A14107TRMDivNom[0] ;
         n14107TRMDivNom = T01T56_n14107TRMDivNom[0] ;
         A14108TRMCompra = T01T56_A14108TRMCompra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14108TRMCompra", GXutil.ltrimstr( A14108TRMCompra, 11, 2));
         A14109TRMVenta = T01T56_A14109TRMVenta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14109TRMVenta", GXutil.ltrimstr( A14109TRMVenta, 11, 2));
         A14110TRMAutMan = T01T56_A14110TRMAutMan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
         zm1T51888( -16) ;
      }
      pr_default.close(4);
      onLoadActions1T51888( ) ;
   }

   public void onLoadActions1T51888( )
   {
   }

   public void checkExtendedTable1T51888( )
   {
      nIsDirty_1888 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01T55 */
      pr_default.execute(3, new Object[] {Byte.valueOf(A14105TRMDivID)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Divisa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRMDIVID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMDivID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14107TRMDivNom = T01T55_A14107TRMDivNom[0] ;
      n14107TRMDivNom = T01T55_n14107TRMDivNom[0] ;
      pr_default.close(3);
      if ( (0==A14105TRMDivID) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Divisa requerida.", ""), 1, "TRMDIVID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMDivID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14106TRMFecha) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fecha requerida", ""), 1, "TRMFECHA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMFecha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A14108TRMCompra)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor de compra es requerido.", ""), 1, "TRMCOMPRA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMCompra_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A14109TRMVenta)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor de venta es requerido.", ""), 1, "TRMVENTA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMVenta_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A14110TRMAutMan)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "TRegistración requerida.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1T51888( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_18( byte A14105TRMDivID )
   {
      /* Using cursor T01T57 */
      pr_default.execute(5, new Object[] {Byte.valueOf(A14105TRMDivID)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Divisa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRMDIVID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMDivID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14107TRMDivNom = T01T57_A14107TRMDivNom[0] ;
      n14107TRMDivNom = T01T57_n14107TRMDivNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14107TRMDivNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1T51888( )
   {
      /* Using cursor T01T58 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1888 = (short)(1) ;
      }
      else
      {
         RcdFound1888 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01T53_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1T51888( 16) ;
         RcdFound1888 = (short)(1) ;
         A14106TRMFecha = T01T53_A14106TRMFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14108TRMCompra = T01T53_A14108TRMCompra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14108TRMCompra", GXutil.ltrimstr( A14108TRMCompra, 11, 2));
         A14109TRMVenta = T01T53_A14109TRMVenta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14109TRMVenta", GXutil.ltrimstr( A14109TRMVenta, 11, 2));
         A14110TRMAutMan = T01T53_A14110TRMAutMan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
         A14105TRMDivID = T01T53_A14105TRMDivID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z14105TRMDivID = A14105TRMDivID ;
         Z14106TRMFecha = A14106TRMFecha ;
         sMode1888 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1T51888( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1888 = (short)(0) ;
            initializeNonKey1T51888( ) ;
         }
         Gx_mode = sMode1888 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1888 = (short)(0) ;
         initializeNonKey1T51888( ) ;
         sMode1888 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1888 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1T51888( ) ;
      if ( RcdFound1888 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1888 = (short)(0) ;
      /* Using cursor T01T59 */
      pr_default.execute(7, new Object[] {Byte.valueOf(A14105TRMDivID), Byte.valueOf(A14105TRMDivID), A14106TRMFecha, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01T59_A14105TRMDivID[0] < A14105TRMDivID ) || ( T01T59_A14105TRMDivID[0] == A14105TRMDivID ) && T01T59_A14106TRMFecha[0].before( A14106TRMFecha ) ) && ( GXutil.strcmp(T01T59_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01T59_A14105TRMDivID[0] > A14105TRMDivID ) || ( T01T59_A14105TRMDivID[0] == A14105TRMDivID ) && T01T59_A14106TRMFecha[0].after( A14106TRMFecha ) ) && ( GXutil.strcmp(T01T59_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A14105TRMDivID = T01T59_A14105TRMDivID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
            A14106TRMFecha = T01T59_A14106TRMFecha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            RcdFound1888 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1888 = (short)(0) ;
      /* Using cursor T01T510 */
      pr_default.execute(8, new Object[] {Byte.valueOf(A14105TRMDivID), Byte.valueOf(A14105TRMDivID), A14106TRMFecha, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01T510_A14105TRMDivID[0] > A14105TRMDivID ) || ( T01T510_A14105TRMDivID[0] == A14105TRMDivID ) && T01T510_A14106TRMFecha[0].after( A14106TRMFecha ) ) && ( GXutil.strcmp(T01T510_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01T510_A14105TRMDivID[0] < A14105TRMDivID ) || ( T01T510_A14105TRMDivID[0] == A14105TRMDivID ) && T01T510_A14106TRMFecha[0].before( A14106TRMFecha ) ) && ( GXutil.strcmp(T01T510_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A14105TRMDivID = T01T510_A14105TRMDivID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
            A14106TRMFecha = T01T510_A14106TRMFecha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            RcdFound1888 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T51888( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTRMDivID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T51888( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1888 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) )
            {
               A14105TRMDivID = Z14105TRMDivID ;
               httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
               A14106TRMFecha = Z14106TRMFecha ;
               httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TRMDIVID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTRMDivID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTRMDivID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1T51888( ) ;
               GX_FocusControl = edtTRMDivID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) )
            {
               /* Insert record */
               GX_FocusControl = edtTRMDivID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T51888( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TRMDIVID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTRMDivID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTRMDivID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T51888( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) )
      {
         A14105TRMDivID = Z14105TRMDivID ;
         httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
         A14106TRMFecha = Z14106TRMFecha ;
         httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TRMDIVID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMDivID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTRMDivID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1T51888( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z14108TRMCompra, T01T52_A14108TRMCompra[0]) != 0 ) || ( DecimalUtil.compareTo(Z14109TRMVenta, T01T52_A14109TRMVenta[0]) != 0 ) || ( GXutil.strcmp(Z14110TRMAutMan, T01T52_A14110TRMAutMan[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z14108TRMCompra, T01T52_A14108TRMCompra[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttrm:[seudo value changed for attri]"+"TRMCompra");
               GXutil.writeLogRaw("Old: ",Z14108TRMCompra);
               GXutil.writeLogRaw("Current: ",T01T52_A14108TRMCompra[0]);
            }
            if ( DecimalUtil.compareTo(Z14109TRMVenta, T01T52_A14109TRMVenta[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttrm:[seudo value changed for attri]"+"TRMVenta");
               GXutil.writeLogRaw("Old: ",Z14109TRMVenta);
               GXutil.writeLogRaw("Current: ",T01T52_A14109TRMVenta[0]);
            }
            if ( GXutil.strcmp(Z14110TRMAutMan, T01T52_A14110TRMAutMan[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttrm:[seudo value changed for attri]"+"TRMAutMan");
               GXutil.writeLogRaw("Old: ",Z14110TRMAutMan);
               GXutil.writeLogRaw("Current: ",T01T52_A14110TRMAutMan[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTRM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T51888( )
   {
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T51888( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T51888( 0) ;
         checkOptimisticConcurrency1T51888( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T51888( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T51888( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T511 */
                  pr_default.execute(9, new Object[] {A14106TRMFecha, A14108TRMCompra, A14109TRMVenta, A14110TRMAutMan, A396EmprCod, Byte.valueOf(A14105TRMDivID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
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
                        resetCaption1T50( ) ;
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
            load1T51888( ) ;
         }
         endLevel1T51888( ) ;
      }
      closeExtendedTableCursors1T51888( ) ;
   }

   public void update1T51888( )
   {
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T51888( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T51888( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T51888( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T51888( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T512 */
                  pr_default.execute(10, new Object[] {A14108TRMCompra, A14109TRMVenta, A14110TRMAutMan, A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T51888( ) ;
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
         endLevel1T51888( ) ;
      }
      closeExtendedTableCursors1T51888( ) ;
   }

   public void deferredUpdate1T51888( )
   {
   }

   public void delete( )
   {
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T51888( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T51888( ) ;
         afterConfirm1T51888( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T51888( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T513 */
               pr_default.execute(11, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
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
      sMode1888 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T51888( ) ;
      Gx_mode = sMode1888 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T51888( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01T514 */
         pr_default.execute(12, new Object[] {Byte.valueOf(A14105TRMDivID)});
         A14107TRMDivNom = T01T514_A14107TRMDivNom[0] ;
         n14107TRMDivNom = T01T514_n14107TRMDivNom[0] ;
         pr_default.close(12);
      }
   }

   public void endLevel1T51888( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1T51888( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttrm");
         if ( AnyError == 0 )
         {
            confirmValues1T50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttrm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T51888( )
   {
      /* Scan By routine */
      /* Using cursor T01T515 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1888 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1888 = (short)(1) ;
         A14105TRMDivID = T01T515_A14105TRMDivID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
         A14106TRMFecha = T01T515_A14106TRMFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T51888( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1888 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1888 = (short)(1) ;
         A14105TRMDivID = T01T515_A14105TRMDivID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
         A14106TRMFecha = T01T515_A14106TRMFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void scanEnd1T51888( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1T51888( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T51888( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T51888( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T51888( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T51888( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T51888( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T51888( )
   {
      edtTRMDivID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTRMDivID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMDivID_Enabled), 5, 0), true);
      edtTRMFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTRMFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMFecha_Enabled), 5, 0), true);
      edtTRMCompra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTRMCompra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMCompra_Enabled), 5, 0), true);
      edtTRMVenta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTRMVenta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTRMVenta_Enabled), 5, 0), true);
      cmbTRMAutMan.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTRMAutMan.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTRMAutMan.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombotrmdivid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrmdivid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrmdivid_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1T51888( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1T50( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.ttrm", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33TRMDivID,2,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV34TRMFecha))}, new String[] {"Gx_mode","EmprCod","TRMDivID","TRMFecha"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTRM");
      forbiddenHiddens.add("TRMAutMan", GXutil.rtrim( localUtil.format( A14110TRMAutMan, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\ttrm:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14105TRMDivID", GXutil.ltrim( localUtil.ntoc( Z14105TRMDivID, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14106TRMFecha", localUtil.ttoc( Z14106TRMFecha, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14108TRMCompra", GXutil.ltrim( localUtil.ntoc( Z14108TRMCompra, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14109TRMVenta", GXutil.ltrim( localUtil.ntoc( Z14109TRMVenta, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14110TRMAutMan", GXutil.rtrim( Z14110TRMAutMan));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRMDIVID_DATA", AV38TRMDivID_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRMDIVID_DATA", AV38TRMDivID_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV36TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV36TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRMDIVID", GXutil.ltrim( localUtil.ntoc( AV33TRMDivID, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRMDIVID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33TRMDivID), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRMFECHA", localUtil.ttoc( AV34TRMFecha, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRMFECHA", getSecureSignedToken( "", localUtil.format( AV34TRMFecha, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRMDIVNOM", GXutil.rtrim( A14107TRMDivNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRMDIVID_Objectcall", GXutil.rtrim( Combo_trmdivid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRMDIVID_Cls", GXutil.rtrim( Combo_trmdivid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRMDIVID_Selectedvalue_set", GXutil.rtrim( Combo_trmdivid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRMDIVID_Enabled", GXutil.booltostr( Combo_trmdivid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRMDIVID_Emptyitemtext", GXutil.rtrim( Combo_trmdivid_Emptyitemtext));
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
      return formatLink("app.ficherosbasicos.ttrm", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33TRMDivID,2,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV34TRMFecha))}, new String[] {"Gx_mode","EmprCod","TRMDivID","TRMFecha"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TTRM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TRM", "") ;
   }

   public void initializeNonKey1T51888( )
   {
      A14107TRMDivNom = "" ;
      n14107TRMDivNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14107TRMDivNom", A14107TRMDivNom);
      A14108TRMCompra = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14108TRMCompra", GXutil.ltrimstr( A14108TRMCompra, 11, 2));
      A14109TRMVenta = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14109TRMVenta", GXutil.ltrimstr( A14109TRMVenta, 11, 2));
      A14110TRMAutMan = httpContext.getMessage( "M", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
      Z14108TRMCompra = DecimalUtil.ZERO ;
      Z14109TRMVenta = DecimalUtil.ZERO ;
      Z14110TRMAutMan = "" ;
   }

   public void initAll1T51888( )
   {
      A14105TRMDivID = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14105TRMDivID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14105TRMDivID), 2, 0));
      A14106TRMFecha = GXutil.resetTime( Gx_date );
      httpContext.ajax_rsp_assign_attri("", false, "A14106TRMFecha", localUtil.ttoc( A14106TRMFecha, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      initializeNonKey1T51888( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14110TRMAutMan = i14110TRMAutMan ;
      httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211694398", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/ttrm.js", "?20268211694399", false, true);
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
      lblTextblocktrmdivid_Internalname = "TEXTBLOCKTRMDIVID" ;
      Combo_trmdivid_Internalname = "COMBO_TRMDIVID" ;
      edtTRMDivID_Internalname = "TRMDIVID" ;
      divTablesplittedtrmdivid_Internalname = "TABLESPLITTEDTRMDIVID" ;
      edtTRMFecha_Internalname = "TRMFECHA" ;
      edtTRMCompra_Internalname = "TRMCOMPRA" ;
      edtTRMVenta_Internalname = "TRMVENTA" ;
      cmbTRMAutMan.setInternalname( "TRMAUTMAN" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombotrmdivid_Internalname = "vCOMBOTRMDIVID" ;
      divSectionattribute_trmdivid_Internalname = "SECTIONATTRIBUTE_TRMDIVID" ;
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
      Form.setCaption( httpContext.getMessage( "TRM", "") );
      edtavCombotrmdivid_Jsonclick = "" ;
      edtavCombotrmdivid_Enabled = 0 ;
      edtavCombotrmdivid_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      cmbTRMAutMan.setJsonclick( "" );
      cmbTRMAutMan.setEnabled( 0 );
      edtTRMVenta_Jsonclick = "" ;
      edtTRMVenta_Enabled = 1 ;
      edtTRMCompra_Jsonclick = "" ;
      edtTRMCompra_Enabled = 1 ;
      edtTRMFecha_Jsonclick = "" ;
      edtTRMFecha_Enabled = 1 ;
      edtTRMDivID_Jsonclick = "" ;
      edtTRMDivID_Enabled = 1 ;
      edtTRMDivID_Visible = 1 ;
      Combo_trmdivid_Emptyitemtext = "" ;
      Combo_trmdivid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trmdivid_Caption = "" ;
      Combo_trmdivid_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Cotización", "") ;
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
      cmbTRMAutMan.setName( "TRMAUTMAN" );
      cmbTRMAutMan.setWebtags( "" );
      cmbTRMAutMan.addItem("A", httpContext.getMessage( "Automática", ""), (short)(0));
      cmbTRMAutMan.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbTRMAutMan.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A14110TRMAutMan)==0) )
         {
            A14110TRMAutMan = httpContext.getMessage( "M", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14110TRMAutMan", A14110TRMAutMan);
         }
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

   public void valid_Trmdivid( )
   {
      n14107TRMDivNom = false ;
      /* Using cursor T01T514 */
      pr_default.execute(12, new Object[] {Byte.valueOf(A14105TRMDivID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Divisa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRMDIVID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMDivID_Internalname ;
      }
      A14107TRMDivNom = T01T514_A14107TRMDivNom[0] ;
      n14107TRMDivNom = T01T514_n14107TRMDivNom[0] ;
      pr_default.close(12);
      if ( (0==A14105TRMDivID) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Divisa requerida.", ""), 1, "TRMDIVID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTRMDivID_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14107TRMDivNom", GXutil.rtrim( A14107TRMDivNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33TRMDivID',fld:'vTRMDIVID',pic:'Z9',hsh:true},{av:'AV34TRMFecha',fld:'vTRMFECHA',pic:'99/99/99 99:99',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33TRMDivID',fld:'vTRMDIVID',pic:'Z9',hsh:true},{av:'AV34TRMFecha',fld:'vTRMFECHA',pic:'99/99/99 99:99',hsh:true},{av:'cmbTRMAutMan'},{av:'A14110TRMAutMan',fld:'TRMAUTMAN',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121T52',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_TRMDIVID","{handler:'valid_Trmdivid',iparms:[{av:'A14105TRMDivID',fld:'TRMDIVID',pic:'Z9'},{av:'A14107TRMDivNom',fld:'TRMDIVNOM',pic:''}]");
      setEventMetadata("VALID_TRMDIVID",",oparms:[{av:'A14107TRMDivNom',fld:'TRMDIVNOM',pic:''}]}");
      setEventMetadata("VALID_TRMFECHA","{handler:'valid_Trmfecha',iparms:[]");
      setEventMetadata("VALID_TRMFECHA",",oparms:[]}");
      setEventMetadata("VALID_TRMCOMPRA","{handler:'valid_Trmcompra',iparms:[]");
      setEventMetadata("VALID_TRMCOMPRA",",oparms:[]}");
      setEventMetadata("VALID_TRMVENTA","{handler:'valid_Trmventa',iparms:[]");
      setEventMetadata("VALID_TRMVENTA",",oparms:[]}");
      setEventMetadata("VALID_TRMAUTMAN","{handler:'valid_Trmautman',iparms:[]");
      setEventMetadata("VALID_TRMAUTMAN",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRMDIVID","{handler:'validv_Combotrmdivid',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRMDIVID",",oparms:[]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV34TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      Z396EmprCod = "" ;
      Z14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      Z14108TRMCompra = DecimalUtil.ZERO ;
      Z14109TRMVenta = DecimalUtil.ZERO ;
      Z14110TRMAutMan = "" ;
      Combo_trmdivid_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV34TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A14110TRMAutMan = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblocktrmdivid_Jsonclick = "" ;
      ucCombo_trmdivid = new com.genexus.webpanels.GXUserControl();
      AV39DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV38TRMDivID_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14108TRMCompra = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV44Pgmname = "" ;
      A396EmprCod = "" ;
      Gx_date = GXutil.nullDate() ;
      A407EmprNom = "" ;
      A14107TRMDivNom = "" ;
      Combo_trmdivid_Objectcall = "" ;
      Combo_trmdivid_Class = "" ;
      Combo_trmdivid_Icontype = "" ;
      Combo_trmdivid_Icon = "" ;
      Combo_trmdivid_Tooltip = "" ;
      Combo_trmdivid_Selectedvalue_set = "" ;
      Combo_trmdivid_Selectedtext_set = "" ;
      Combo_trmdivid_Selectedtext_get = "" ;
      Combo_trmdivid_Gamoauthtoken = "" ;
      Combo_trmdivid_Ddointernalname = "" ;
      Combo_trmdivid_Titlecontrolalign = "" ;
      Combo_trmdivid_Dropdownoptionstype = "" ;
      Combo_trmdivid_Titlecontrolidtoreplace = "" ;
      Combo_trmdivid_Datalisttype = "" ;
      Combo_trmdivid_Datalistfixedvalues = "" ;
      Combo_trmdivid_Datalistproc = "" ;
      Combo_trmdivid_Datalistprocparametersprefix = "" ;
      Combo_trmdivid_Remoteservicesparameters = "" ;
      Combo_trmdivid_Htmltemplate = "" ;
      Combo_trmdivid_Multiplevaluestype = "" ;
      Combo_trmdivid_Loadingdata = "" ;
      Combo_trmdivid_Noresultsfound = "" ;
      Combo_trmdivid_Onlyselectedvalues = "" ;
      Combo_trmdivid_Selectalltext = "" ;
      Combo_trmdivid_Multiplevaluesseparator = "" ;
      Combo_trmdivid_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1888 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV40ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z14107TRMDivNom = "" ;
      T01T54_A407EmprNom = new String[] {""} ;
      T01T54_n407EmprNom = new boolean[] {false} ;
      T01T55_A14107TRMDivNom = new String[] {""} ;
      T01T55_n14107TRMDivNom = new boolean[] {false} ;
      T01T56_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01T56_A407EmprNom = new String[] {""} ;
      T01T56_n407EmprNom = new boolean[] {false} ;
      T01T56_A14107TRMDivNom = new String[] {""} ;
      T01T56_n14107TRMDivNom = new boolean[] {false} ;
      T01T56_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T56_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T56_A14110TRMAutMan = new String[] {""} ;
      T01T56_A396EmprCod = new String[] {""} ;
      T01T56_A14105TRMDivID = new byte[1] ;
      T01T57_A14107TRMDivNom = new String[] {""} ;
      T01T57_n14107TRMDivNom = new boolean[] {false} ;
      T01T58_A396EmprCod = new String[] {""} ;
      T01T58_A14105TRMDivID = new byte[1] ;
      T01T58_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01T53_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01T53_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T53_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T53_A14110TRMAutMan = new String[] {""} ;
      T01T53_A396EmprCod = new String[] {""} ;
      T01T53_A14105TRMDivID = new byte[1] ;
      T01T59_A396EmprCod = new String[] {""} ;
      T01T59_A14105TRMDivID = new byte[1] ;
      T01T59_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01T510_A396EmprCod = new String[] {""} ;
      T01T510_A14105TRMDivID = new byte[1] ;
      T01T510_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01T52_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01T52_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T52_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T52_A14110TRMAutMan = new String[] {""} ;
      T01T52_A396EmprCod = new String[] {""} ;
      T01T52_A14105TRMDivID = new byte[1] ;
      T01T514_A14107TRMDivNom = new String[] {""} ;
      T01T514_n14107TRMDivNom = new boolean[] {false} ;
      T01T515_A396EmprCod = new String[] {""} ;
      T01T515_A14105TRMDivID = new byte[1] ;
      T01T515_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i14110TRMAutMan = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm__default(),
         new Object[] {
             new Object[] {
            T01T52_A14106TRMFecha, T01T52_A14108TRMCompra, T01T52_A14109TRMVenta, T01T52_A14110TRMAutMan, T01T52_A396EmprCod, T01T52_A14105TRMDivID
            }
            , new Object[] {
            T01T53_A14106TRMFecha, T01T53_A14108TRMCompra, T01T53_A14109TRMVenta, T01T53_A14110TRMAutMan, T01T53_A396EmprCod, T01T53_A14105TRMDivID
            }
            , new Object[] {
            T01T54_A407EmprNom, T01T54_n407EmprNom
            }
            , new Object[] {
            T01T55_A14107TRMDivNom, T01T55_n14107TRMDivNom
            }
            , new Object[] {
            T01T56_A14106TRMFecha, T01T56_A407EmprNom, T01T56_n407EmprNom, T01T56_A14107TRMDivNom, T01T56_n14107TRMDivNom, T01T56_A14108TRMCompra, T01T56_A14109TRMVenta, T01T56_A14110TRMAutMan, T01T56_A396EmprCod, T01T56_A14105TRMDivID
            }
            , new Object[] {
            T01T57_A14107TRMDivNom, T01T57_n14107TRMDivNom
            }
            , new Object[] {
            T01T58_A396EmprCod, T01T58_A14105TRMDivID, T01T58_A14106TRMFecha
            }
            , new Object[] {
            T01T59_A396EmprCod, T01T59_A14105TRMDivID, T01T59_A14106TRMFecha
            }
            , new Object[] {
            T01T510_A396EmprCod, T01T510_A14105TRMDivID, T01T510_A14106TRMFecha
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T514_A14107TRMDivNom, T01T514_n14107TRMDivNom
            }
            , new Object[] {
            T01T515_A396EmprCod, T01T515_A14105TRMDivID, T01T515_A14106TRMFecha
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV44Pgmname = "FicherosBasicos.TTRM" ;
      Z14110TRMAutMan = httpContext.getMessage( "M", "") ;
      A14110TRMAutMan = httpContext.getMessage( "M", "") ;
      i14110TRMAutMan = httpContext.getMessage( "M", "") ;
      Z14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      Gx_date = GXutil.today( ) ;
   }

   private byte wcpOAV33TRMDivID ;
   private byte Z14105TRMDivID ;
   private byte GxWebError ;
   private byte A14105TRMDivID ;
   private byte AV33TRMDivID ;
   private byte nKeyPressed ;
   private byte AV41ComboTRMDivID ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1888 ;
   private short nIsDirty_1888 ;
   private int trnEnded ;
   private int edtTRMDivID_Visible ;
   private int edtTRMDivID_Enabled ;
   private int edtTRMFecha_Enabled ;
   private int edtTRMCompra_Enabled ;
   private int edtTRMVenta_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombotrmdivid_Enabled ;
   private int edtavCombotrmdivid_Visible ;
   private int Combo_trmdivid_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z14108TRMCompra ;
   private java.math.BigDecimal Z14109TRMVenta ;
   private java.math.BigDecimal A14108TRMCompra ;
   private java.math.BigDecimal A14109TRMVenta ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z14110TRMAutMan ;
   private String Combo_trmdivid_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTRMDivID_Internalname ;
   private String A14110TRMAutMan ;
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
   private String divTablesplittedtrmdivid_Internalname ;
   private String lblTextblocktrmdivid_Internalname ;
   private String lblTextblocktrmdivid_Jsonclick ;
   private String Combo_trmdivid_Caption ;
   private String Combo_trmdivid_Cls ;
   private String Combo_trmdivid_Emptyitemtext ;
   private String Combo_trmdivid_Internalname ;
   private String TempTags ;
   private String edtTRMDivID_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtTRMFecha_Internalname ;
   private String edtTRMFecha_Jsonclick ;
   private String edtTRMCompra_Internalname ;
   private String edtTRMCompra_Jsonclick ;
   private String edtTRMVenta_Internalname ;
   private String edtTRMVenta_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV44Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_trmdivid_Internalname ;
   private String edtavCombotrmdivid_Internalname ;
   private String edtavCombotrmdivid_Jsonclick ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A14107TRMDivNom ;
   private String Combo_trmdivid_Objectcall ;
   private String Combo_trmdivid_Class ;
   private String Combo_trmdivid_Icontype ;
   private String Combo_trmdivid_Icon ;
   private String Combo_trmdivid_Tooltip ;
   private String Combo_trmdivid_Selectedvalue_set ;
   private String Combo_trmdivid_Selectedtext_set ;
   private String Combo_trmdivid_Selectedtext_get ;
   private String Combo_trmdivid_Gamoauthtoken ;
   private String Combo_trmdivid_Ddointernalname ;
   private String Combo_trmdivid_Titlecontrolalign ;
   private String Combo_trmdivid_Dropdownoptionstype ;
   private String Combo_trmdivid_Titlecontrolidtoreplace ;
   private String Combo_trmdivid_Datalisttype ;
   private String Combo_trmdivid_Datalistfixedvalues ;
   private String Combo_trmdivid_Datalistproc ;
   private String Combo_trmdivid_Datalistprocparametersprefix ;
   private String Combo_trmdivid_Remoteservicesparameters ;
   private String Combo_trmdivid_Htmltemplate ;
   private String Combo_trmdivid_Multiplevaluestype ;
   private String Combo_trmdivid_Loadingdata ;
   private String Combo_trmdivid_Noresultsfound ;
   private String Combo_trmdivid_Onlyselectedvalues ;
   private String Combo_trmdivid_Selectalltext ;
   private String Combo_trmdivid_Multiplevaluesseparator ;
   private String Combo_trmdivid_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1888 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z14107TRMDivNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i14110TRMAutMan ;
   private java.util.Date wcpOAV34TRMFecha ;
   private java.util.Date Z14106TRMFecha ;
   private java.util.Date AV34TRMFecha ;
   private java.util.Date A14106TRMFecha ;
   private java.util.Date Gx_date ;
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
   private boolean n14107TRMDivNom ;
   private boolean Combo_trmdivid_Enabled ;
   private boolean Combo_trmdivid_Visible ;
   private boolean Combo_trmdivid_Allowmultipleselection ;
   private boolean Combo_trmdivid_Isgriditem ;
   private boolean Combo_trmdivid_Hasdescription ;
   private boolean Combo_trmdivid_Includeonlyselectedoption ;
   private boolean Combo_trmdivid_Includeselectalloption ;
   private boolean Combo_trmdivid_Emptyitem ;
   private boolean Combo_trmdivid_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private String AV40ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_trmdivid ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbTRMAutMan ;
   private IDataStoreProvider pr_default ;
   private String[] T01T54_A407EmprNom ;
   private boolean[] T01T54_n407EmprNom ;
   private String[] T01T55_A14107TRMDivNom ;
   private boolean[] T01T55_n14107TRMDivNom ;
   private java.util.Date[] T01T56_A14106TRMFecha ;
   private String[] T01T56_A407EmprNom ;
   private boolean[] T01T56_n407EmprNom ;
   private String[] T01T56_A14107TRMDivNom ;
   private boolean[] T01T56_n14107TRMDivNom ;
   private java.math.BigDecimal[] T01T56_A14108TRMCompra ;
   private java.math.BigDecimal[] T01T56_A14109TRMVenta ;
   private String[] T01T56_A14110TRMAutMan ;
   private String[] T01T56_A396EmprCod ;
   private byte[] T01T56_A14105TRMDivID ;
   private String[] T01T57_A14107TRMDivNom ;
   private boolean[] T01T57_n14107TRMDivNom ;
   private String[] T01T58_A396EmprCod ;
   private byte[] T01T58_A14105TRMDivID ;
   private java.util.Date[] T01T58_A14106TRMFecha ;
   private java.util.Date[] T01T53_A14106TRMFecha ;
   private java.math.BigDecimal[] T01T53_A14108TRMCompra ;
   private java.math.BigDecimal[] T01T53_A14109TRMVenta ;
   private String[] T01T53_A14110TRMAutMan ;
   private String[] T01T53_A396EmprCod ;
   private byte[] T01T53_A14105TRMDivID ;
   private String[] T01T59_A396EmprCod ;
   private byte[] T01T59_A14105TRMDivID ;
   private java.util.Date[] T01T59_A14106TRMFecha ;
   private String[] T01T510_A396EmprCod ;
   private byte[] T01T510_A14105TRMDivID ;
   private java.util.Date[] T01T510_A14106TRMFecha ;
   private java.util.Date[] T01T52_A14106TRMFecha ;
   private java.math.BigDecimal[] T01T52_A14108TRMCompra ;
   private java.math.BigDecimal[] T01T52_A14109TRMVenta ;
   private String[] T01T52_A14110TRMAutMan ;
   private String[] T01T52_A396EmprCod ;
   private byte[] T01T52_A14105TRMDivID ;
   private String[] T01T514_A14107TRMDivNom ;
   private boolean[] T01T514_n14107TRMDivNom ;
   private String[] T01T515_A396EmprCod ;
   private byte[] T01T515_A14105TRMDivID ;
   private java.util.Date[] T01T515_A14106TRMFecha ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV38TRMDivID_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV39DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class ttrm__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T52", "SELECT TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?  FOR UPDATE OF TRMCompra, TRMVenta, TRMAutMan NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T53", "SELECT TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T54", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T55", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T56", "SELECT /*+ FIRST_ROWS(100) */ TM1.TRMFecha, T2.EmprNom, T3.DivNom AS TRMDivNom, TM1.TRMCompra, TM1.TRMVenta, TM1.TRMAutMan, TM1.EmprCod, TM1.TRMDivID AS TRMDivID FROM ((TXPTRM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDIVISA T3 ON T3.DivCod = TM1.TRMDivID) WHERE TM1.EmprCod = ? and TM1.TRMDivID = ? and TM1.TRMFecha = ? ORDER BY TM1.EmprCod, TM1.TRMDivID, TM1.TRMFecha ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T57", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T58", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TRMDivID, TRMFecha FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T59", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TRMDivID, TRMFecha FROM TXPTRM WHERE ( TRMDivID > ? or TRMDivID = ? and TRMFecha > ?) and EmprCod = ? ORDER BY EmprCod, TRMDivID, TRMFecha) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T510", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TRMDivID, TRMFecha FROM TXPTRM WHERE ( TRMDivID < ? or TRMDivID = ? and TRMFecha < ?) and EmprCod = ? ORDER BY EmprCod DESC, TRMDivID DESC, TRMFecha DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01T511", "INSERT INTO TXPTRM(TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTRM")
         ,new UpdateCursor("T01T512", "UPDATE TXPTRM SET TRMCompra=?, TRMVenta=?, TRMAutMan=?  WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?", GX_NOMASK, "TXPTRM")
         ,new UpdateCursor("T01T513", "DELETE FROM TXPTRM  WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?", GX_NOMASK, "TXPTRM")
         ,new ForEachCursor("T01T514", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T515", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TRMDivID, TRMFecha FROM TXPTRM WHERE EmprCod = ? ORDER BY EmprCod, TRMDivID, TRMFecha ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 9 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

